public class RevisionTwo {
    static class Employee1{
        int salary;
        String name;

        public int getSalary() {
            return salary;
        }

        public String getName() {
            return name;
        }
        public void setName(String n){
            name=n;
        }
    }

    static class cellphone{
        public void ring(){
            System.out.println("Ringing.....");
        }
        public void vibrate(){
            System.out.println("Vibrating....");
        }
        public void call(){
            System.out.println("Calling Slayer....");
        }
    }
    static class square{
        int side;
        public int area(){
            return side*side;
        }
        public int perimeter(){
            return 4*side;
        }
    }

    public static void main(String[] args) {
        Employee1 emp= new Employee1();
        emp.setName("Slayer");
        emp.salary=23242;
        System.out.println(emp.getSalary());
        System.out.println(emp.getName());


        cellphone sam= new cellphone();
        sam.call();
        sam.ring();
        sam.vibrate();


        square sq=new square();
        sq.side=6;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}
