package Fundamentos;

public class Wrappers {
    public static void main(String[] args) {
        Byte b = 100;
        Short s = 1000;
        Integer i = 10000; // int
        Long l = 100000L;
        Character c = '#'; //char
        Float f = 123.32F;
        Double d = 342324.3242;
        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);
        System.out.println(c + "........");
        System.out.println(f);
        System.out.println(d);
        System.out.println(bo.toString().toUpperCase());
    }
}
