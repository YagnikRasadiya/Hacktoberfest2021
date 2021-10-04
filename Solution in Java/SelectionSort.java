public class SelectionSort
{
    public static void main(String args[])
    {
        int arr[]= {2,6,1,5,32,7,4,99,345,96,45,4,934,8,34,43,8,2,9,7,2,9};
        int i ,min=0, j ,k;
        for(i = 0;i<arr.length; i++)
        {
            min = arr[i];
            k = i;
            for(j=i;j<arr.length;j++)
            {
                if(min >arr[j])
                {
                    min = arr[j];
                    k = j;
                }
            }
            if(arr[i] != min)
                {
                    arr[k] = arr[i];
                    arr[i] = min ;
                }
        }
        for(int e : arr)
        {
            System.out.println(e +" ");
        }
    }
}
