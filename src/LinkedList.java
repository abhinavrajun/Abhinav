import java.util.LinkedList;
/**
 * This class creates a linked list to store the queue.
 * It has methods to insert, delete and check the number of tabs.
 * 
 *
 */
class LinkList
{
    java.util.LinkedList node=new java.util.LinkedList(); 
    java.util.LinkedList node1=new java.util.LinkedList(); 
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
          
             if(numberOfTab(x)==0)
             {  first++;
             node.add(first, " ");
             node1.add(first,"");
             first++;
              node.add(first, " ");
           node1.add(first,"");
             last++;
            	 node.add(first, x);
            	 node1.add(first, x);
             System.out.println("Inserted1");
             
             }
             else{
                 System.out.println("First element should not hava 'tab'");
                 // return;
             }          
           // System.out.println("the first element is"+first);
            //System.out.println("the last element is"+last);

        }
        
        else
        {
        	String as=node.get(last).toString(); 
            String ab=node1.get(last).toString();
            if(numberOfTab(x)<numberOfTab(ab)+2)
            {
          
            if(numberOfTab(x)==0)
            {last++;
            	node.add(last, x);
             node1.add(last,x);
            }
            else{
            	 String asd=node1.get(1).toString();
            	 if(numberOfTab(x)==1)
            	 {
            		 asd=asd+"."+x.replace("\t","");
            	 }
            	 else{
                 for(int i=numberOfTab(x);i>1;i--)
                 {
                     String cd=node1.get(last+2-i).toString();
                     asd=asd+"."+cd.replace("\t", "");

                     //System.out.print("."+cd.replace("\t",""));
                 }
                 asd=asd+"."+x.replace("\t", "");
                 }
                 last++;
            	node.add(last,asd);
            	node1.add(last,x);
            }
            System.out.println("Inserted2");
            

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
    	if(first==-1){
    		return -1;
    	}
        int t =first;
               
               String bc=node.get(first).toString();
               System.out.println(bc);
               first++;
       /*       if(numberOfTab(bc)==0)
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
            
       */     
        
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
     * @return returns boolean 
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
            System.out.println(node.get(i));
        i++;
        }
        
    }
    
}
