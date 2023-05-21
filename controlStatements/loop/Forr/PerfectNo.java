/*Perfect  no
 * 6
 * 1+2+3=6
 */
class PerfectNo{
    public static void main(String args[]){
        int N=6;
        int sum=0;

        for(int i=1;i<6;i++){
            if(N%i==0){
                sum=sum+i;
            }
        }
        if(sum==N){
            System.out.println("It's Perfect Number");
        }
        else{
            System.out.println("Not A perfect No.");
        }
    }
}