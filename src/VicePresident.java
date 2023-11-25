public class VicePresident extends Manager {
    void sayHello(){
        System.out.println("Halo iam vice president, " + name);
    }

    /*
 METHOD PARENT
    String getName(){
        return name;
    }
*/

    // Constructor
    VicePresident(String name){
        super(name);
    }
}
