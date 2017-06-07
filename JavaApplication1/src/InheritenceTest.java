 class Parent
{
    void print(){
        System.out.println("parent");
        print1();
    }

    private void print1(){
        System.out.println("private");
    }
}
 
class Child extends Parent {
    void printchild(){
        System.out.println("child");     
    }

    void print(){
        System.out.println(" overwritting parent ");
    }
}

class InheritenceTest
{
    public static void main(String arg[])
    {
        Child c1=new Child();
        c1.print();
        c1.printchild();
        Parent p1=new Child();
        p1.print();
        Parent p2=new Parent();
        p2.print(); 
        System.out.println("hi");
    }
}