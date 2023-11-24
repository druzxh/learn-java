public class Method {
    public static void main(String[] args) {
        String say = "Halo";
        System.out.println(sayHello(say, "Dru"));
        say = "Hii";
        System.out.println(sayHello(say, "Dru"));
        say = "Anyeong";
        System.out.println(sayHello(say, "Dru"));
    }
    /**
     * Method to say hello with choose say and name
     * @param say say
     * @param name name
     * @return say hello name
     */
    static String sayHello(String say, String name) {
        return say + " " + name;
    }
}
