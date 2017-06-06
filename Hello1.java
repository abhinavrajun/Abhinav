/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.lang.*;
import java.util.Scanner;
class Hello1
{
int top=-1;
 int a[]=new int[10];
 void push()
 {
   top++;
   if(top>4)
   {
     System.out.println("is full");
     return;
   }
     Scanner s=new Scanner(System.in);
     System.out.println("enter the no.: ");
      int no=s.nextInt();

   a[top]=no;
 }

 public static void main(String[] args)
  {int j;
  Hello1 od=new Hello1();
    Scanner sc=new Scanner(System.in);
    do{
    System.out.println("enter 1 to push\n enter 0 to exit");
      int i=sc.nextInt();
      switch(i){
          case 1:
              od.push();
                   break;

          default: break;
  }
    System.out.println("press 0 to end");
   j=sc.nextInt();    }while(j!=0);
  }

}
