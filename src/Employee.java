public class Employee{
    String name;
    void sayHello(){
        System.out.println("Halo iam employee, " + name);
    }
    // Constructor
    Employee(String name){
        this.name = name;
    }

/*
     METHOD PARENT
    String getName(){
        return this.name;
    }
*/

}
