public class q2 {
    public static void main(String[] args) {
        //question 2
        q2 obj = new q2();
        System.out.println(obj.fib(10));
        System.out.println(obj.cal_prime(5));
    }
    /**
     * Calculates the nth Fibonacci number
     * @param n the position of the Fibonacci number to calculate
     * @return the nth Fibonacci number
     */
    public int fib(int n){
        int result=0;
        int e1=0, e2 =1 ;
        for(int i=0;i<n;i++){
            System.out.println();
            result = e1+e2;
            e1=e2;
            e2=result;
        }
        return result;
    }
    //function to find the n the prime in ascending order

    public int cal_prime(int n){
        if(n==1){return 2;}int result=0;
        int count=1;
        while(count<n){
        for(int i=2;i<31000;i++){
            if(n%2==0){
                result=i;
            }
            count++;
        }}
        return result;
    }
}
