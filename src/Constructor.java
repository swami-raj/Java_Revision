class slayer{


//    slayer(){
//        System.out.println("this is a constructor");
//    }


    private int id;
    private String name;
    public slayer(){
        id=0;
        name="your name here";
    }

    public slayer(String myname,int myid){
        id=myid;
        name=myname;
    }
    public slayer(String myname){
        id=1;
        name=myname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Constructor {
    public static void main(String[] args) {
        slayer sa=new slayer();
        System.out.println(sa.getId());
        System.out.println(sa.getName());

        slayer saw=new slayer("swami",123);
        System.out.println(saw.getId());
        System.out.println(saw.getName());
    }
}

//Constructors can take parameters without being overloaded
//There can be more than two overloaded constructors
