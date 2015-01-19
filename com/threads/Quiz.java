package com.threads;
import java.util.*;
import com.tests.CarExample;

public class Quiz extends Thread{
	private static volatile boolean _stop = false;
	
	
	public void run(){
		doSomething();
	}
	
	private synchronized void doSomething(){
		int i = 0;
		while(i<10 && !_stop){
			System.out.println("Iteration: " + i++);
			try{
				Thread.sleep(1000);
				
				}catch(InterruptedException ignored){
							
				i++;				
			}
		}
	}
	
	static synchronized void finishQuiz(){
		_stop = true;
		System.out.println("FinishQuiz");
	}
	synchronized void finish(){
		_stop = true;
		System.out.println("Finish");
	}
	
	static synchronized void dontStop(){
		_stop = false;
		
	}
	
	public static void main(String args[]) throws InterruptedException{
		final Quiz worker = new Quiz();
		worker.start();
		scheduleTask(new TimerTask(){
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				worker.finish();
			}
		}, 1500);
		
		scheduleTask(new TimerTask(){
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Quiz.finishQuiz();
			}
		}, 2500);
	}
	
	private static void scheduleTask(TimerTask timerTask, int msDelay){
		CarExample obj = new CarExample();
		Timer t = new Timer(true);
		t.schedule(timerTask, msDelay);
	}

}
