/*i/p=6531
    o/p=1 3 5 6

    */
public class Reverse1 {
    public static void main(String args[]){

        int N=6531;

        while(N!=0){
            System.out.println(N%10);
            N=N/10;
        }
    }
    
}
