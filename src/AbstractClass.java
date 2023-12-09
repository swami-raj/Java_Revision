abstract class parent2{
    public parent2(){
        System.out.println("mai patent2 constructor hu ");
    }
    public void sayHello(int a){
        System.out.println("say-hello");
    }
    abstract public void greet();
    abstract public void gree1();
}
 class child extends parent2{
    super(a);
     @Override
     public void greet() {
         System.out.println("good morning anushtha");
     }

     @Override
     public void gree1() {
         System.out.println("good morning slayer");
     }
 }
 abstract class child3 extends parent2{
    public void ch(){
        System.out.println("city<->fortuner");
    }
 }


public class AbstractClass {
    public static void main(String[] args) {
        child chld =new child();
        //parent2 pa =new parent2();  -------> error
        //child3 chl=new child3() ;  --------> error
    }
}


// abstract class ka matlab hai ki class ke andar abstract method hoga;
//abstract method ka matlab abstract keyword se declared ho ga
//abstract class ka object nahi bantata hai
/*agar abstract class hai to or usko inherit kar rahe hai dusre class me to uss class ko ya to
 abstract banana padega ya to abstact method ko call karna padega.*/