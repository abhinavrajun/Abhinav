import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	LinkList link=new LinkList();
	Queue q=new Queue();
	Queue qu=new Queue();
	
  @Test
  public void numberOfTabTest() {
	  String s="	Hello";
	  int i=link.numberOfTab(s);
	  Assert.assertEquals(i,1);
  }
  @Test(priority=1)
  public void test1(){
	  String ab="\ta";
	  System.out.print("test1: ");
	  link.insertLast(ab);
	  
  }
  @Test(priority=2)
  public void test2(){
	  int i=0;
	  String ab="a";
	  link.insertLast(ab);
	  ab="\t\tb";
	  link.insertLast(ab);
	  String s=link.node.get(link.last).toString();
	  ab="a";
	  if(s.equals(ab))
	  {
		  i=1;
	  }
	  Assert.assertEquals(i, 1);
  }
  @Test(priority=3)
  public void test3(){
	  int j=0;
	  int i=link.deleteFirst();
	 
	  if(link.first==-1){
		  j=1;
	  }
	  link.insertLast("a");
	  Assert.assertEquals(j, 1);
  }
  @Test(priority=4)
  public void test4(){
	  int i=0;
	  String ab="asd";
	  link.insertLast(ab);
	  ab="\tb";
	  link.insertLast(ab);
	  String s=link.node.get(link.last).toString();
	  ab="a.b";
	  if(s.equals(ab))
	  {
		  i=1;
	  }
	  Assert.assertEquals(i, 1);
	  
  } 
  @Test(priority=5)
  public void test5(){
	  int i=0;
	  String ab="\tc";
	  link.insertLast(ab);
	  String s=link.node.get(link.last).toString();
	  if(s.equals("a.c"))
	  {
		  i=1;
	  }
	  Assert.assertEquals(i, 1);
  }
  @Test(priority=6)
  public void test6(){
	  int i=0;
	  String ab="\t\td";
	  link.insertLast(ab);
	  String s=link.node.get(link.last).toString();
	  if(s.equals("a.c.d"))
	  {
		  i=1;
	  }
	  Assert.assertEquals(i, 1);
  }
  @Test(priority=7)
  public void test7(){
	  int i=0;
	  String ab="\t\t\te";
	  link.insertLast(ab);
	  String s=link.node.get(link.last).toString();
	  if(s.equals("a.c.d.e"))
	  {
		  i=1;
	  }
	  Assert.assertEquals(i, 1);
  }
  @Test(priority=8)
  public void test8(){
	  int i=0;
	  String ab="f";
	  link.insertLast(ab);
	  String s=link.node.get(link.last).toString();
	  if(s.equals("f"))
	  {
		  i=1;
	  }
	  Assert.assertEquals(i, 1);
  }
  @Test(priority=9)
  public void test9(){
	  int i=0;
	  int j=link.deleteFirst();
	  String s=link.node.get(j+1).toString();
	  if(s.equals("asd"))
	  {
		  i=1;
	  }
	  Assert.assertEquals(i, 1);
  }
  @Test(priority=10)
  public void test10(){
	  int j=0;
	 
	  q.delete();
	 
	  
	  if(q.abhl==-1)
		  j=1;
	  Assert.assertEquals(j, 1);
  }
  @Test(priority=11)
  public void test11(){
	  int j=0;
	  String sd="asdf";
	  q.insert(sd);
	 
	  String s=q.peek();
	  if(s.equals("asdf"))
		  j=1;
	  Assert.assertEquals(j, 1);
  }
  @Test(priority=12)
  public void test12(){
	  int j=0;
	  q.insert("abhi");
	  q.delete();
	  String s=q.peek();
	  if(s.equals("abhi"))
		  j=1;
	  Assert.assertEquals(j, 1);
  }
  @Test(priority=13)
  public void tes13(){
	  String a="a";
	 	  q.case1(1,a);
  }
}
