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
 String a[]=new String[10];
 void push()
 {
   top++;
   if(top>4)
   {
     
System.out.println("\nis full\n");
System.out.println("\nis full\n");
     return;
   }
     Scanner s=new Scanner(System.in);
     System.out.println("enter the no.: ");
      String no=s.next();
	if(top==0)
	a[top]=no;
	else{
		if(no.startsWith("\t"))
			{
				a[top]=("a[top-1]"+"."+"no"
			}
             } 
}
 void pop(){
     if(top==-1){
         System.out.println("\nthe stack is empty\n");
     }
     else{
     top--;
 }
 }
 void display(){
    int j=0;
    while(j!=top+1){
                 System.out.println("\n"+a[j]);
                 j++;


    }
}

 public static void main(String[] args)
  {int j;
  Hello1 od=new Hello1();
    Scanner sc=new Scanner(System.in);
    int i;
    do{
    System.out.println("1)Enter '1' to push\n2)Enter '2' to pop\n3)Enter '3' to display\n4)Enter '4' to exit\n");
      i=sc.nextInt();
      switch(i){
          case 1:
              od.push();
                   break;
          case 2:
              od.pop();
              break;
          case 3:
              od.display();
              break;
          default: break;
  }

      }while(i!=4);
  }

}
