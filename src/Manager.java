public class Manager extends Employee{
    void sayHello(){
        System.out.println("Halo iam manager, " + name);
    }

    /* METHOD PARENT
    String getName(){
        return super.name;
    }
*/

    // Constructor
    Manager(String name){
        super(name);
    }
}
