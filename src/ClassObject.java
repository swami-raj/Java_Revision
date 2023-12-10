
class Trader{

    //DAta:Data Member :instance variable
    String name;
    int id;
    String  city;

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


public class ClassObject {
    public static void main(String[] args) {

        //now creating object of traders
        Trader tr=new Trader();
        tr.name="Slayer";
        tr.city="Gaya";
        tr.id=121;

        Trader tr1 =new Trader();
        tr1.name="Anushtha";
        tr1.id=123;
        tr1.city="Roper";

        tr.trade();
        tr.fullDetail();

        tr1.trade();
        tr1.fullDetail();
    }
}
