import java.util.*;

public class cf {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            int sum1=0,sum2=0,sum3=0;
            while (t-- > 0) {
               int a=sc.nextInt();
               int b=sc.nextInt();
               int c=sc.nextInt();
               sum1+=a;
               sum2+=b;
               sum3+=c;
            }
            if(sum1==0&&sum2==0&&sum3==0)
            System.out.println("YES");
            else
            System.out.println("NO");

        } catch (Exception e) {
            return;
        }

    }

}