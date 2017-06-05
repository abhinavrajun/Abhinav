class Hello
{
int top=-1;
 int a[]=new int[10];
 void push()
 {
   top++;
   if(top>10)
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
  {
    Scanner sc=new Scanner(System.in);
    do{
    System.out.println("enter 1 to push");
      int i=sc.nextint();
      Switch(i)
      {
          case 1: push();
                   break;
          default: break;
  }
    System.out.println("press 0 to end");
  int j=sc.nextInt();    }while(j!=0);
  }

}
