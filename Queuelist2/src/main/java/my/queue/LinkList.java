package my.queue;

/**
 * This class creates a linked list to store the queue.
 * It has methods to insert, delete and check the number of tabs.
 * 
 *
 */
public class LinkList
{
    public java.util.LinkedList node=new java.util.LinkedList(); 
    public java.util.LinkedList node1=new java.util.LinkedList(); 
    private int first;
    private int last;
    char queueid;
    /**
     * checks for number of tabs in the input
     * @param s the input entered
     * @return It returns number of tabs
     */
     public int numberOfTab(String s)
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
        setFirst(-1);
        setLast(0);
    }
    /**
     * assign initial values to first and last
     */
    public void insertLast(String x)
    {
       
        if(getFirst()==-1&&getLast()==0){
          
             if(numberOfTab(x)==0)
             {  setFirst(getFirst() + 1);
             node.add(getFirst(), " ");
             node1.add(getFirst(),"");
             setFirst(getFirst() + 1);
              node.add(getFirst(), " ");
           node1.add(getFirst(),"");
             setLast(getLast() + 1);
            	 node.add(getFirst(), x);
            	 node1.add(getFirst(), x);
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
        	String as=node.get(getLast()).toString(); 
            String ab=node1.get(getLast()).toString();
            if(numberOfTab(x)<numberOfTab(ab)+2)
            {
          
            if(numberOfTab(x)==0)
            {setLast(getLast() + 1);
            	node.add(getLast(), x);
             node1.add(getLast(),x);
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
                     String cd=node1.get(getLast()+2-i).toString();
                     asd=asd+"."+cd.replace("\t", "");

                     //System.out.print("."+cd.replace("\t",""));
                 }
                 asd=asd+"."+x.replace("\t", "");
                 }
                 setLast(getLast() + 1);
            	node.add(getLast(),asd);
            	node1.add(getLast(),x);
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
    	if(getFirst()==-1){
    		return -1;
    	}
        int t =getFirst();
               
               String bc=node.get(getFirst()).toString();
               System.out.println(bc);
               setFirst(getFirst() + 1);
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
        
        if(isEmpty()){
        setLast(0);
        setFirst(-1);
        }
        
        return t;
       
    }
    /**
     * To look at the first element of the queue
     * @return to return the index of the first
     */
    public int peekFirst()
    {
      return getFirst();
    }
    public String peekLast()
    {
      return node.get(getLast()).toString();	
    }
    /**
     * To check if the queue is empty
     * @return returns boolean 
     */
    public boolean isEmpty()
    {
        return(getFirst()>getLast()||getFirst()==-1);
    }
    /**
     * To display the queue
     */
    public void displayList()
    {
        int i=getFirst();
        int j=getLast();
        while(i<=j)
        {
            System.out.println("The elements are\n");   
            System.out.println(node.get(i));
        i++;
        }
        
    }
	public int getLast() {
		return last;
	}
	public void setLast(int last) {
		this.last = last;
	}
	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first = first;
	}
    
}


