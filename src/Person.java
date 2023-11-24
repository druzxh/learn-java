public class Person {
    String name;
    String address;
    Integer age;
    final String country = "Indonesia";

    Person(String paramName, String paramAddress, Integer paramAge){
        name = paramName;
        address = paramAddress;
        age = paramAge;
    }

    void sayHello(String paramName){
        System.out.println("Hallo " + paramName + ". Saya" + name);
    }

    void introduced(){
        System.out.println("My name "+name + ". I Live in " + address + ". I am " + age + " years old.");
    }

    /**
     * Constructor overloading & Method also overloading

     Person(String paramName){
     name = paramName;
     }

     Person(){}

     **/

    // call other constructor
    Person(String paramName){
        this.name = paramName; // keyword this
    }

    Person(){}

    void sayHello(String word, String paramName){
        System.out.println(word + " " + paramName);
    }
    // End Constructor

    // inheritance

}
