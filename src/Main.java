public class Main {
    static class Employee{
        int id;
        String name;
        int Salary;
        public void printdetail(){
            System.out.println("my id is: " + id);
            System.out.println("my name is: " + name);
        }
        public int getSalary(){
            return Salary;
        }

    }
    public static void main(String[] args) {
        Employee slayer= new Employee();   // Instantiating a new Employee Object
        Employee viper= new Employee();

        //setting attribute for slayer
        slayer.id=12;
        slayer.Salary=123312;
        slayer.name="rollins";

        //setting attribute for viper
        viper.id=11;
        viper.Salary=12321;
        viper.name="orton";

        //printing the attribute
        slayer.printdetail();
        int Salary=slayer.getSalary();
        System.out.println(Salary);

        viper.printdetail();
    }
}