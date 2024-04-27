

public class convert {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //auto convert
        byte a =100;
        byte b= 50;
        byte c= (byte)(a/2);
        System.out.println(c);


        //non auto convert
        short d =100;
        int i=d;
        System.out.println(((Object)i).getClass().getName());


        short s=100;
        byte t =50;
        int k =10;
        long l= (long)(s+t+k);
        System.out.println(((Object)l).getClass().getName());

    }
    
    
}
