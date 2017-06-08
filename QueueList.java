

import java.util.*;
import java.io.*;
import java.lang.*;

class LinkList
{
    LinkedList node=new LinkedList(); 
    int first;
    int last;
    char queueid;
     int noTab(String s)
    {
        
       
    int tab=0;
     
   
         String arr[]=s.split("\t");
    
    tab=arr.length-1 ;
    return tab;
            
    
    
    }
    
    public LinkList()
    {
        first = -1;
        last = 0;
    }
    public void insertLast(String x)
    {
       
        if(first==-1&&last==0){
            first++;
            node.add(first, " ");
            first++;
             node.add(first, " ");
          
            last++;
             if(noTab(x)==0)
             node.add(first, x);
             else{
                 System.out.println("First element should not hava 'tab'");
                  return;
             }          
            System.out.println("the first element is"+first);
            System.out.println("the last element is"+last);

        }
        
        else
        {
            String ab=node.get(last).toString();
            if(noTab(x)<noTab(ab)+2)
            {
            last++;
            node.add(last, x);
            

            }
            else
            {
                System.out.println("invalid input");
                
            }
        }    
    }
    public int deleteFirst()
    {
        int t =first;
               String bc=node.get(first).toString();
              if(noTab(bc)==0)
        {
            System.out.println(bc);
            first++;
        }
        
        else{
            System.out.print(node.get(1));
           for(int i=noTab(bc);i>0;i--)
           {
               String cd=node.get(first+1-i).toString();

               System.out.print("."+cd.replace("\t",""));
           }
           first++;
        }
            
            
        
        if(first>last){
        last=0;
        first=-1;
        }
        
        return t;
    }
    public int peekFirst()
    {
      return first;
    }
    public boolean isEmpty()
    {
        return(first>last||first==-1);
    }
    public void displayList()
    {
        int i=first;
        int j=last;
        while(i<=j)
        {
            System.out.println("The elements are\n");   
            System.out.println(node.get(i)+"\n");
        i++;
        }
        
    }
    
}

class Queue
{
    public LinkList l;
    public Queue()
    {
        l=new LinkList();
    }
    public void insert(String x)
    {
        l.insertLast(x);
        System.out.println("Inserted");
    }
    public void delete()
    { 
        int abhl; 
        abhl= l.deleteFirst();
     
       
        System.out.println("\nthe deleated element is "+l.node.get(abhl).toString().replace("\t",""));
      
    }
    public boolean isQueueEmpty()
    {
        return l.isEmpty();
    }
    public void display()
    {
        l.displayList();
    }
    public void peek()
    {
        int abh2;
        abh2= l.peekFirst();
        System.out.println("the peeked element is "+l.node.get(abh2));
      
    }
}
class QueueList
{
    public static void main(String[] args)throws IOException
    {
        Scanner qi=new Scanner(System.in);
        Scanner qj=new Scanner(System.in);

        Queue[] q=new Queue[10];
        for(int f=0;f<10;f++)
        {
            q[f]=new Queue();
        }
        int ch;
        String d;
        int a[]=new int[10];
        int i,j=0;
        while((boolean)true)
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("MENU");
            System.out.println("--------");
            System.out.println("1.Insert");
            System.out.println("2.Delete");
            System.out.println("3.Peek");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            System.out.println("Enter Your Choice: ");
            ch=Integer.parseInt(br.readLine());
            
            if(ch==5)
                break;
            else
            {
                switch(ch)
                {
                case 1:
                    
                    System.out.println("enter the queue id");
                    int chai=-1;
                    int sc = qi.nextInt();
                   
                    for( i=0; i<10; i++) 
                    {
                        if(a[i] == sc)
                        {
                            chai=i;
                        }                     
                    }
                    if(chai!=-1)
                    {
                    
                    System.out.println("\nEnter elements: ");
                    
                        d=qj.nextLine();
                        q[chai].insert(d);
                     
                    
                    }
                    else
                    {
                    
                    System.out.println("\nEnter elements: ");                   
                    
                         d = qj.nextLine();
                        q[j].insert(d);
                     
                    
                    a[j]=sc;
                    j++;
                    }
 
                    break;
                case 2: 
                    System.out.println("enter the queue id");
                     chai=-1;
                     sc = qi.nextInt();
                   
                    for( i=0; i<10; i++) 
                    {
                        if(a[i] == sc)
                        {
                            chai=i;
                        }                     
                    }
                    if(chai!=-1)
                    {
                    
                    if(q[chai].isQueueEmpty())
                        System.out.println("Queue is Empty ");
                    else
                    {
                        q[chai].delete();
                    }
                    }
                    else{
                        System.out.println("the queueid u enterd is not valid");
                        break;
                    }
                    break;
                case 3:
                     System.out.println("enter the queue id");
                     chai=-1;
                     sc = qi.nextInt();
                   
                    for( i=0; i<10; i++) 
                    {
                        if(a[i] == sc)
                        {
                            chai=i;
                        }                     
                    }
                    if(chai!=-1)
                    {
                   
                    
                    if(q[chai].isQueueEmpty())
                        System.out.print("Queue is Empty ");
                    else
                    {
                        q[chai].peek();
                    }
                    }
                    else{
                        System.out.println("the queueid u enterd is not valid");
                        break;
                    }
                    
                    break;
                case 4:
                    System.out.println("enter the queue id");
                     chai=-1;
                     sc = qi.nextInt();
                   
                    for( i=0; i<10; i++) 
                    {
                        if(a[i] == sc)
                        {
                            chai=i;
                        }                     
                    }
                    if(chai!=-1)
                    {    
                    
                    if(q[chai].isQueueEmpty())
                        System.out.println("Queue is Empty ");
                    else
                    {
                        System.out.println("Data in queue is ");
                        q[chai].display();
                    }
                    }
                    else
                    {
                        System.out.println("the queueid u enterd is not valid");
                        break;
                    }
                
                    break;
                default:
                    System.out.println("Invalid choice ");
                }
            }
            System.out.println(" ");
        }
    }
}
