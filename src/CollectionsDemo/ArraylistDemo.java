package CollectionsDemo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class ArraylistDemo {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add("karthik");
        al.add("raju");
        al.add("suresh");
        al.add("kavi");
        al.add("kavi");
        al.add(null);

        al.add(12);
        al.add(12.2);
        al.add("c");
        al.add(true);

        Date date = new Date();
        al.add(date);

        System.out.println(al);
        System.out.println(al.size());

        //System.out.println(al.get(4));

        for(int i=0;i<al.size();i++)           //normal for loop
        {

            System.out.println(al.get(i));
        }

        //for() another method
        System.out.println("-----using Iterator interface------");

        Iterator itr = al.iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
