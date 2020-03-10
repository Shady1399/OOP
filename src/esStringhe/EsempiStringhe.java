package esStringhe;

public class EsempiStringhe {

    public static void main(String[] args) {
        String s="hello";
        String newS=s.toUpperCase();
        StringBuffer t=new StringBuffer();
        StringBuilder n=new StringBuilder();
        t.append("");

        for (int i=0; i<100000; i++)
            t.append("-").append(i);
        System.out.println(t.length());

        for (int i=0; i<100000; i++)
            n.append("-").append(i);
        System.out.println(n.length());
    }
}
