import java.rmi.StubNotFoundException;

public class floatdouble {
    public static void main(String[] args) {
        
        double a=5.25;
        double b= 4.0;
        double c=6d;
        System.out.println("a="+a+" b="+b+" c="+c);

        float d= (float)5.0;
        float e= 4.0f;
        float f= 7f;
        System.out.println("d="+d+" e="+e+" f="+f);

        double g= 52.5;
        float j =(float)g;
        System.out.println("g="+g+" j="+j);

        float  k= 5.25f;
        float l=4.0f;
        float m=6f;
        System.out.println("average= "+ (k+l+m)/3);

        double  x= 5.25d;
        double y=4.0d;
        double z=6d;
        System.out.println("average 2= "+ (x+y+z)/3);
    }
}
