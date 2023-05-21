/*print n0. divisble by 1 and itself 
 * 
 * 
*/
public class PrimeNo {
    public static void main(String args[]){
       int N=5;
       int count=0;
        for(int i=1;i<=N;i++){
            if(N%i==0){
                count++;
            }
        }
            if(count==2){
                System.out.println("No.is Prime");
            }
            else{
                System.out.println("Not a Prinme NO");
            }

        
    }
    
}
