public class Neon {
    public static void main(String[] args)
    {
        int n=9;
        int square=n*n;
        int sum=0;
        while(square!=0)
        {
            int r=square%10;
            sum+=r;
            square=square/10;
        }
        if(n==sum){
            System.out.println("given number is neon");
        }
        else{
            System.out.println("given number is not neon");
        }
    }
}
