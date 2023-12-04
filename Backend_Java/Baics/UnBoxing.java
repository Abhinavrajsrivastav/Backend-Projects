package Baics;

public class UnBoxing {
    public static void main(String[] args){
        // Unboxing
        Byte a = new Byte((byte)10);
        byte b = a.byteValue();
        System.out.println(a);
        System.out.println(b);

        Short c = new Short((short)20);
        short d = c.shortValue();
        System.out.println(c);
        System.out.println(d);

        Integer e = new Integer((int)30);
        int f = e.intValue();
        System.out.println(e);
        System.out.println(f);

        Long g = new Long((long)40);
        long h = g.longValue();
        System.out.println(g);
        System.out.println(h);

        Float i = new Float((float)50);
        float j = i.floatValue();
        System.out.println(i);
        System.out.println(j);

        Double k = new Double((double)60);
        double l = k.doubleValue();
        System.out.println(k);
        System.out.println(l);

        Character m = new Character((char)'a');
        char n = m.charValue();
        System.out.println(m);
        System.out.println(n);

        Boolean o = new Boolean((boolean)true);
        boolean p = o.booleanValue();
        System.out.println(o);
        System.out.println(p);

        String q = new String((String)"Hello");
        String r = q.toString();
        System.out.println(q);
        System.out.println(r);

        // AutoUnboxing
        byte s = a;
        System.out.println(s);

        short t = c;
        System.out.println(t);

        int u = e;
        System.out.println(u);

        long v = g;
        System.out.println(v);

        float w = i;
        System.out.println(w);

        double x = k;
        System.out.println(x);
    }
}
