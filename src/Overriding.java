class A{
    public void meth1(){
        System.out.println("i am method 1 of class A");
    }
}
class B extends A{
    @Override
    public void meth1(){
        System.out.println("i am method 2 of class B");
    }
    public void meth3(){
        System.out.println("i am method 3 0f class B");
    }
}
public class Overriding {
    public static void main(String[] args) {
        A a=new A();
        a.meth1();

        B b=new B();
        b.meth1();
    }
}
