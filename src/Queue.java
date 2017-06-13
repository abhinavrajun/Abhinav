class Queue
{
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
        System.out.println("Inserted");
    }
    /**
     * to delete from queue
     */
    public void delete()
    { 
        int abhl; 
        abhl= l.deleteFirst();
     
       
        System.out.println("\nthe deleated element is "+l.node.get(abhl).toString().replace("\t",""));
      
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
    public void peek()
    {
        int abh2;
        abh2= l.peekFirst();
        System.out.println("the peeked element is "+l.node.get(abh2));
      
    }
}