public class forwhile {
    public static void main(String[] args) {
        for (int i=0; i<5; i++){
            System.out.println(i);
        }

        int j=0;
        for (j=10;j>5;j--){
            System.out.println("j = "+j);
        }
        int k=10;

        for(;k>5 &&j<7; k--,j++){
            System.out.println("k = "+k);
            System.out.println("j = "+j);
        }
    }
    
}
