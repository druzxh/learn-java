public class Polymorphism {
    public static void main(String[] args) {
        Employee employee = new Employee("Tjo");
        employee.sayHello();

        employee = new Manager("Berk");
        employee.sayHello();

        employee = new VicePresident("Nami");
        employee.sayHello();

        halo(new Employee("Tjo"));
        halo(new Manager("Berk"));
        halo(new VicePresident("Nami"));
    }
    static void halo(Employee employee){
        // Type check , casts
        if(employee instanceof VicePresident){
            System.out.println("Halo my Manager, " + employee.name);
        } else if (employee instanceof Manager){
            System.out.println("Halo my VicePresident, " + employee.name);
        } else {
            System.out.println("Halo my Employee, " + employee.name);
        }
    }
}
