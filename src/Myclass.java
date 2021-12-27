import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Myclass {

    int a;
    double d;
    char c;
    String str;   //data members

    void display()  //member function
    {

        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main (String[] args){

        Myclass ob = new Myclass();

        ob.a = 10;
        ob.d = 2.40;
        ob.c = 'j';
        ob.str = "java";

        ob.display();

        Myclass ob1 = new Myclass();

        ob1.a = 11;
        ob1.d = 23.4;
        ob1.c = 's';
        ob1.str = "kathik";

        ob1.display();


    }


}
