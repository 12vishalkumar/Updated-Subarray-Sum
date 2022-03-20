import java.util.*;
public class ptc
{
    public static long[] maxSum(int n, int a[], int p[])
    {
        // Write your code here.
        long res_arr[] = new long[n];
        for(int i=0;i<n;i++)
        {
            a[p[i]-1] = 0;
            long curr_sum = 0;
            long max_sum = 0;
            for(int j=0;j<n;j++)
            {
                if(a[j] > 0)
                {
                    curr_sum += a[j];
                    max_sum = Math.max(max_sum, curr_sum);
                }
                else
                {
                    curr_sum = 0;
                }
            }
            res_arr[i] = max_sum;
        }
        return res_arr;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
		for(int j=0;j<T;j++)
		{
			int n = sc.nextInt();
			int arr1[] = new int[n];
			int arr2[] = new int[n];
			for(int i=0;i<n;i++)
				arr1[i] = sc.nextInt();
			for(int i=0;i<n;i++)
				arr2[i] = sc.nextInt();
		    System.out.println(maxSum(n, arr1, arr2));
	    }
    }
}