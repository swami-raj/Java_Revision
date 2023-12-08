class base1{
    base1(){
        System.out.println("I am Constructor");
    }
    base1(int x){
        System.out.println("I am an overloaded constructor with value of x as: " + x);
    }
}

class derived1 extends base1{
    derived1(){
        System.out.println("I am derived class constructor");
    }
    derived1(int x,int y){
        super(x);
        System.out.println("I am an overloaded constructor of derived with value of y as fuck: "+y);
    }
}
class childodderived extends derived1{
    childodderived(){
        System.out.println("i am child of derived construcctor");
    }
    childodderived(int x, int y, int z){
        super(x,y);
        System.out.println("i am an overloaded constructor of derivedwith value of z as:" +z);
    }
}
public class ConstructorInheritance {
    public static void main(String[] args) {
         base1 b=new base1();
         derived1 d=new derived1();
         derived1 d1=new derived1(14,9);
         childodderived cd=new childodderived();
         childodderived cd1=new childodderived(12,45,76);

    }
}



//Constructors during constructor overloading :

//When there are multiple constructors in the parent class, the constructor without any parameters is called from the child class.
//If we want to call the constructor with parameters from the parent class, we can use the super keyword.
//super(a, b) calls the constructor from the parent class which takes 2 variables
