/*i/p=6
o/p=1,2,3,6
 */
public class Divisible {
    public static void main(String args[]){
        int N=6;

        for(int i=1;i<=N;i++){
            if(N%i==0){
                System.out.println(i);
            }
        }
    }
    
}
