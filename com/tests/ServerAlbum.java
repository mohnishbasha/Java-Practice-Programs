package com.tests;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ServerAlbum {

		private Connection con;
		private static int k=0;
		private String sql;
		PreparedStatement stat;
		private String url="jdbc:mysql://localhost:3306/album";
		
		static{
			try{
				Class.forName("com.mysql.jdbc.Driver");
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}
		}
		
		public ServerAlbum(){
			
			try{
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "master");
				sql = "INSERT INTO ALBUM VALUES(?,?,?,?)";
				stat = con.prepareStatement(sql);
				
				
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		
		public void addAlbum(Album alb){
			
			try{
				String album_name = alb.getAlbumName();
				String singer_name = alb.getSingerName();
				int price = alb.getPrice();
				int id = alb.getId();
				stat.setInt(1, id);
				stat.setString(2, album_name);
				stat.setString(3, singer_name);
				stat.setInt(4, price);
				k = stat.executeUpdate();
				System.out.println(k + " Number of albums Added in the Database");
			
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		
		public static void closing(){
			
		}
		
		public static void main(String[] args){
			
			ServerAlbum sa = new ServerAlbum();
		}
		
	
}

class C extends ServerAlbum{
	
	public static void main(String[] args){
		
	}
}
