package com.tests;

public class Album {

		String singer_name;
		String album_name;
		int price;
		int id;
		
		public Album(){
			
		}
		
		public Album(int id,String album_name, String singer_name, int price){
			
			this.album_name = album_name;
			this.singer_name = singer_name;
			this.price = price;
			this.id = id;
					
		}
		
		public String getSingerName(){
			return this.singer_name;
		}
		
		public int getId(){
			return this.id;
		}
		
		public String getAlbumName(){
			return this.album_name;
		}
		
		public int getPrice(){
			return this.price;
		}
		
		public void setSingerName(String singer_name){
			this.singer_name = singer_name;
		}
		
		public void setPrice(int price){
			this.price = price;
		}
		
		public void setAlbum(String album_name){
			this.album_name = album_name;
		}
		
		public void setId(int id){
			this.id = id;
		}
}
