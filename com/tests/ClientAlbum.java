package com.tests;

/**
 * @author mohnish
 *
 */
public class ClientAlbum {
	public static void main(String[] arg) {
		ServerAlbum al = new ServerAlbum();
		Album alb = new Album(1, "Desert Rose", "Sting", 500);
		al.addAlbum(alb);

	}
}
