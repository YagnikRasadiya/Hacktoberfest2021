
public class BubbleSort
{
    public static void main(String args[])
    {
        int arr[] = {1,5,8,23,9,4,90,0};
        int i, k ,j;
        for(i=0;i<arr.length -1;i++)
        {
            for(j=1; j<arr.length -i; j++)
            {
                if(arr[j-1]>arr[j])
                {
                    k = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = k;
                }
            }
        }
        for(int e : arr)
        {
            System.out.print(e+" ");
        }
    }
}