package Baics;

public class wrapper_classes {
    public static void main(String[] args) {

        // Boxing
        byte a = 10;
        Byte b = new Byte((byte)a);
        System.out.println(b);

        short c = 20;
        Short d = new Short((short)c);
        System.out.println(d);

        int e = 30;
        Integer f = new Integer((int)e);
        System.out.println(f);

        long g = 40;
        Long h = new Long((long)g);
        System.out.println(h);

        float i = 50;
        Float j = new Float((float)i);
        System.out.println(j);

        double k = 60;
        Double l = new Double((double)k);
        System.out.println(l);

        char m = 'a';
        Character n = new Character((char)m);
        System.out.println(n);

        boolean o = true;
        Boolean p = new Boolean((boolean)o);
        System.out.println(p);

        String q = "Hello";
        String r = new String((String)q);
        System.out.println(r);
    }
}
