/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.net.ServerSocket;
import java.io.BufferedReader; import java.io.IOException; 
import java.io.InputStreamReader;  import java.net.Socket;
import java.util.Date;
import java.util.*;


/**
 *
 * @author Admin
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
    System.out.println("enter value");
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    System.out.println(s);
    
    
    int count=0;
    String arr[]=s.split("\t");
    System.out.println("Number of spaces are: "+arr.length);
    count++;
     }
}

 