public class MaxAndMin {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,56,7,8,9,10};
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }

            if(arr[i]<min)
            {
                min=arr[i];
            }

        }
        System.out.println("Max is:"+max);
        System.out.println("Min is:"+min);
    }
    
}
