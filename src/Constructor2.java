class Trader1{
    //DAta:Data Member :instance variable
    String name;
    int id;
    String  city;

    Trader1(){
        System.out.println("creating object non-parametrized");
    }
    Trader1(int a){
        System.out.println("creting parametrized constructor");
    }
    Trader1(String n,int d,String c){
        name=n;
        id=d;
        city=c;
    }
    //Behaviour: member method : method  (function)

    public void trade(){
        System.out.println(name +" is doing trading");
    }
    public void fullDetail(){
        System.out.println("my name is "+name);
        System.out.println("my id is "+id);
        System.out.println("my city is "+city);
    }
}

public class Constructor2 {
    public static void main(String[] args) {
        Trader1 tra=new Trader1();
        tra.city="Mumbai";
        tra.name="Anushtha";
        tra.id=345;
        tra.trade();
        tra.fullDetail();
        Trader1 trad =new Trader1("Slayer",1231,"Pune");
        trad.fullDetail();
        trad.trade();

    }

}
