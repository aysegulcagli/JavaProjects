public class math_operators {
    public void main (String[] args){
        System.out.println(5+5);
        System.out.println(5+4.2);
        System.out.println(5-4.0);
        System.out.println(10/4f);
        System.out.println(3*4.5);
        System.out.println(10%4);

        int a;

        a=5;
        a +=2;
        System.out.println(a);
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);
        System.out.println(++a);  //pre increment, updated result
        System.out.println(a++);  //post increment, result before update
        System.out.println(a);
    }
    
}
