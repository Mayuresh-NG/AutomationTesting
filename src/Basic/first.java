package Basic;
import java.util.*;
public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x,y;

        x=sc.nextInt();
        y=sc.nextInt();

        Arithmetic o = new Arithmetic();
        o.add(x,y);
        o.sub(x,y);
    }
}

class Arithmetic
{
    void add(int a,int b)
    {
        System.out.println("Sum"+(a+b));
    }

    void sub(int a,int b)
    {
        System.out.println("Sum"+(a-b));
    }
}