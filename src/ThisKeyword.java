class capital{
    int money;
    String day;
    String name;

    public capital(){
        this(97,"tuesday","Anushtha");   //yaha par this dushara method ko call kar dega
        System.out.println("Trading hi sab kuch hai");
    }
    public capital(int i,String day,String name){
        money =i;
        this.day=day;
        this.name=name;
        // slayer gama
    }
    public void fullDetail(){
        System.out.println("my name is "+name);
        System.out.println("my day is "+day);
        System.out.println("my money is "+money);
    }

}


public class ThisKeyword {
    public static void main(String[] args) {
        capital ca=new capital();
//        capital cap=new capital(234,"monday","Slayer");
        ca.fullDetail();
    }
}
