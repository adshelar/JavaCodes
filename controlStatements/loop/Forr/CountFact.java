/* Count the Factor*/
class CountFact{
    public static void main(String args[]){
        int N=10;
        int count=0;
        for(int i=1;i<=10;i++){
            if(N%i==0){
               
                count++;
            }

        }
        
        System.out.println(count);
    }
}