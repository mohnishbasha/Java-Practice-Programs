package org.datastructures;

class PriorityQueue {

	private int maxSize;

	private double[] queArray;

	private int nItems;

	public PriorityQueue(int s) {
		maxSize = s;
		queArray = new double[maxSize];
		nItems = 0;
	}

	public void insert(double item) {
		int j;

		if (nItems == 0) {
			queArray[nItems++] = item;
		} else {
			for (j = nItems - 1; j >= 0; j--) {
				if (item > queArray[j])
					queArray[j + 1] = queArray[j];
				else
					break;
			}
			queArray[j + 1] = item;
			nItems++;
		}
	}

	public double remove() {
		return queArray[--nItems];
	}

	public double peekMin() {
		return queArray[nItems - 1];
	}

	public boolean isEmpty() {
		return (nItems == 0);
	}

	public boolean isFull() {
		return (nItems == maxSize);
	}

}

public class PriorityQueueM {
	public static void main(String[] args) {
		PriorityQueue thePQ = new PriorityQueue(5);
		thePQ.insert(30);
		thePQ.insert(50);
		thePQ.insert(10);
		thePQ.insert(40);
		thePQ.insert(20);

		while (!thePQ.isEmpty()) {
			double item = thePQ.remove();
			System.out.print(item + " ");
		}
	}
}
