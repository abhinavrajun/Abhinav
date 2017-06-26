package my.queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Queue
{
	private int abhl;
	Queue[] queuelist=new Queue[10];
	int queueidqueue[]=new int[10];
	int j=0;
    public LinkList l;
   

    /**
     * Creates a new linked list
     */
    public Queue()
    {
        l=new LinkList();
    }
    /**
     * to insert into the queue
     * @param x gets the index of the queue
     */
    public void insert(String x)
    {
        l.insertLast(x);
      //  System.out.println("Inserted");
    }
   
    /**
     * to delete from queue
     */
    public void delete()
    { 
      
        setAbhl(l.deleteFirst());
     
       if(getAbhl()==-1)
       {
    	   System.out.println("it is already empty"); 
       }
       else
        System.out.println("\nthe deleated element is "+l.node.get(getAbhl()).toString().replace("\t",""));
      
    }
    /**
     * To check if the queue is empty
     * @return retuns boolen
     */
    public boolean isQueueEmpty()
    {
        return l.isEmpty();
    }
    public void display()
    {
        l.displayList();
    }
    /**
     * to peek into the queue
     */
    public String peek()
    {
        int abh2;
        abh2= l.peekFirst();
        System.out.println("the peeked element is "+l.node.get(abh2));
        return l.peekLast();
    }
    public void fn(){
    	Scanner scan1=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);
        
        //creates a list of queue objects
        for(int f=0;f<10;f++)
        {
            queuelist[f]=new Queue();
        }
        int switchchecker;
        String input;
        int queueidqueue[]=new int[10];//creating a array of queue id
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
            switchchecker=scan1.nextInt();
            
            if(switchchecker==5)
                break;
            else
            {
                switch(switchchecker)
                {
                case 1:
                    
                    System.out.println("enter the queue id (The queueid must be an ingiter)");
                  
                    int queueid = scan1.nextInt();//scans the queue id entered
                  
                    System.out.println("\nEnter elements: ");
                    
                        input=scan2.nextLine();
                case1(queueid,input);
                       
 
                    break;
                case 2: 
                    System.out.println("enter the queue id (The queueid must be an ingiter)");
                    
                     queueid = scan1.nextInt();
                case2(queueid);
                 
                    break;
                case 3:
                     System.out.println("enter the queue id (The queueid must be an ingiter)");
                    // check=-1;
                     queueid = scan1.nextInt();
                case3(queueid);
                   /**/
                    
                    break;
                case 4:
                    System.out.println("enter the queue id");
                     //check=-1;
                     queueid = scan1.nextInt();
                case4(queueid);
                   
                
                    break;
                default:
                    System.out.println("Invalid choice ");
                }
            }
            System.out.println(" ");
        }
        
    }
   
          
    	 
    public void case1(int queueid,String input){
     	 int check=-1;
     	
     	 int i;
     	  for( i=0; i<10; i++) 
           {
               if(queueidqueue[i] == queueid)//check if the queue id is present
               {
                   check=i;
               }                     
           }
           if(check!=-1)//If the queue id is not present enters into a new queue
           {
           
          // System.out.println("\nEnter elements: ");
           
              // input=scan2.nextLine();
               if(input.isEmpty())
               {
               	System.out.println("This field cannotbe left blank");
               	return;
               }
               queuelist[check].insert(input);
            
           
           }
           else
           {
           
           //System.out.println("\nEnter elements: ");                   
           
              //  input = scan2.nextLine();
               if(input.isEmpty())
               {
               	System.out.println("This field cannotbe left blank");
               	return;
               }
                queuelist[j].insert(input);
            
           
           queueidqueue[j]=queueid;
           j++;
           }
    }
    public void case2(int queueid){
    	int check=-1;
    	int i;
    	 for( i=0; i<10; i++) 
         {
             if(queueidqueue[i] == queueid)
             {
                 check=i;
             }                     
         }
         if(check!=-1)
         {
         
         if(queuelist[check].isQueueEmpty())
             System.out.println("Queue is Empty ");
         else
         {
             queuelist[check].delete();
         }
         }
         else{
             System.out.println("the queueid u enterd is not valid");
             return;
         }
    }
    public void case3(int queueid){
    	int check=-1;
    	int i;
    	 for( i=0; i<10; i++) 
         {
             if(queueidqueue[i] == queueid)
             {
                 check=i;
             }                     
         }
         if(check!=-1)
         {
        
         
         if(queuelist[check].isQueueEmpty())
             System.out.print("Queue is Empty ");
         else
         {
             queuelist[check].peek();
         }
         }
         else{
             System.out.println("the queueid u enterd is not valid");
             return;
         }
    }
    public void case4(int queueid){
    	int check=-1;
    	int i;
    	 for( i=0; i<10; i++) 
         {
             if(queueidqueue[i] == queueid)
             {
                 check=i;
             }                     
         }
         if(check!=-1)
         {    
         
         if(queuelist[check].isQueueEmpty())
             System.out.println("Queue is Empty ");
         else
         {
             System.out.println("Data in queue is ");
             queuelist[check].display();
         }
         }
         else
         {
             System.out.println("the queueid u enterd is not valid");
             return;
         }
    }
	public int getAbhl() {
		return abhl;
	}
	public void setAbhl(int abhl) {
		this.abhl = abhl;
	}
}