import java.util.*;
import java.io.*;
import java.lang.*;
/**
 * Creates a new linked list which stores all the queues
 * 
 *
 */
class LinkList
{
    java.util.LinkedList node=new java.util.LinkedList(); 
    int first;
    int last;
    char queueid;
    /**
     * checks for number of tabs in the input
     * @param s the input entered
     * @return It returns number of tabs
     */
     int numberOfTab(String s)
    {
        
       
    int tab=0;
     
   
         String arr[]=s.split("\t");
    
    tab=arr.length-1 ;
    return tab;
            
    
    
    }
     /**
      * assign initial values to first and last
      */
    
    public LinkList()
    {
        first = -1;
        last = 0;
    }
    /**
     * assign initial values to first and last
     */
    public void insertLast(String x)
    {
       
        if(first==-1&&last==0){
            first++;
            node.add(first, " ");
            first++;
             node.add(first, " ");
          
            last++;
             if(numberOfTab(x)==0)
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
            if(numberOfTab(x)<numberOfTab(ab)+2)
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
    /**
     * To detete the last element
     * @return returns the index of the first
     */
    public int deleteFirst()
    {
        int t =first;
               String bc=node.get(first).toString();
              if(numberOfTab(bc)==0)
        {
            System.out.println(bc);
            first++;
        }
        
        else{
            System.out.print(node.get(1));
           for(int i=numberOfTab(bc);i>0;i--)
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
    /**
     * To look at the first element of the queue
     * @return to return the index of the first
     */
    public int peekFirst()
    {
      return first;
    }
    /**
     * To check if the queue is empty
     * @return returns boolen 
     */
    public boolean isEmpty()
    {
        return(first>last||first==-1);
    }
    /**
     * To display the queue
     */
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
