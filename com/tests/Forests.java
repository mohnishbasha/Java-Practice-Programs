package com.tests;

 import java.io.*;
 public class Forests implements Serializable {
 private Trees tree = new Trees();
 public static void main(String [] args) {
 Forests f = new Forests();
 try {
 FileOutputStream fs = new FileOutputStream("Forest.ser");
 ObjectOutputStream os = new ObjectOutputStream(fs);
 os.writeObject(f); os.close();
 } catch (Exception ex) { ex.printStackTrace(); }
 } }

class Trees { }
