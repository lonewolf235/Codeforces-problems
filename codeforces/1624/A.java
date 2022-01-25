import java.util.*;

public class cc {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];
                int max=Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                for (int i = 0; i < n; i++){
                a[i]=sc.nextInt();
                if(a[i]>max)
                max=a[i];
                if(a[i]<min)
                min=a[i];
                }
                System.out.println(max-min);
            }

        } catch (Exception e) {
            return;
        }

    }

}
