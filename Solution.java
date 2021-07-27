import java.util.Scanner;


public class Solution {

    /**
     * @param args
     */
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt(); scan.nextLine();
        
        for(int i=0;i<T;i++)
        {
            long n = scan.nextLong();
            long m = scan.nextLong();
            long m1 = m -1;
            
            long ans = ( ((m1*m)/2)*(n/m) ) + ((n%m)*((n%m) +1)/2);
            System.out.println(ans);            
        }
    }

}
