class IfelseLadderDemo {
    public static void main(String args[]){
        int x=30;

        
        if(x%3==0 && x%5==0){
            System.out.println("FizzBizz");
        }
        else if(x%3==0){
            System.out.println("Fizz");
        }
        else if(x%5==0){
            System.out.println("Bizz");
        }
        else{
            System.out.println("Not divisible by Both");
        }
    }

}
