
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class QueueList
{
    public static void main(String[] args)throws IOException
    {
        Scanner scan1=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);
        
        Queue[] queuelist=new Queue[10];//creates a list of queue objects
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
            switchchecker=Integer.parseInt(br.readLine());
            
            if(switchchecker==5)
                break;
            else
            {
                switch(switchchecker)
                {
                case 1:
                    
                    System.out.println("enter the queue id");
                    int check=-1;
                    int queueid = scan1.nextInt();//scans the queue id entered
                   
                    for( i=0; i<10; i++) 
                    {
                        if(queueidqueue[i] == queueid)//check if the queue id is present
                        {
                            check=i;
                        }                     
                    }
                    if(check!=-1)//If the queue id is not present enters into a new queue
                    {
                    
                    System.out.println("\nEnter elements: ");
                    
                        input=scan2.nextLine();
                       
                        queuelist[check].insert(input);
                     
                    
                    }
                    else
                    {
                    
                    System.out.println("\nEnter elements: ");                   
                    
                         input = scan2.nextLine();
                         queuelist[j].insert(input);
                     
                    
                    queueidqueue[j]=queueid;
                    j++;
                    }
 
                    break;
                case 2: 
                    System.out.println("enter the queue id");
                     check=-1;
                     queueid = scan1.nextInt();
                   
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
                        break;
                    }
                    break;
                case 3:
                     System.out.println("enter the queue id");
                     check=-1;
                     queueid = scan1.nextInt();
                   
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
                        break;
                    }
                    
                    break;
                case 4:
                    System.out.println("enter the queue id");
                     check=-1;
                     queueid = scan1.nextInt();
                   
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