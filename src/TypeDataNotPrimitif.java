public class TypeDataNotPrimitif {
    public static void main(String[] args) {
        Integer iniInt = 10;
        Long iniLong = 10L;

        Short iniShort = null; // default obj null
        iniShort = 100; // assign value

        int primitif = 0;
//        convert to primitif or not
        int iniPrimitif = iniInt;

//        Using primitif to not primitif
        Integer notPrimitif = primitif;

        short shortValue = iniInt.shortValue();
    }
}
