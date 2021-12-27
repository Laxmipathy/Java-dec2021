package CollectionsDemo;

import java.util.ArrayList;

public class ArraylistDemo2 {


    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList();

        al.add("karthik");
        al.add("raju");
        al.add("suresh");
        al.add("kavi");
        al.add("kavi");

        /*for(String str:al)         //printing for each
            System.out.println(str);*/

        ArrayList<Integer> al2 = new ArrayList();

        al2.add(12);
        al2.add(24);
        al2.add(32);
        al2.add(40);
        al2.add(22);

        System.out.println("Before clear"+al2);
        al2.clear();

        System.out.println("After clear"+al2);

        ArrayList<Character> al3 = new ArrayList();
        al3.add('t');
        al3.add('s');

        ArrayList<Double> al4 = new ArrayList();
        al4.add(12.2);
        al4.add(24.4);

        ArrayList<Boolean> al5 = new ArrayList();
        al5.add(true);
        al5.add(false);

    }
}
