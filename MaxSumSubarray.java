public class MaxSumSubarray {
    public static void main(String[] args) {
        int arr[]={-1,-1,-1,6,7,-91,10,11};

        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            currentsum=currentsum+arr[i];
            if(currentsum>maxsum)
            {
                maxsum=currentsum;

            }
            if(currentsum<0)
            {
                currentsum=0;
            }

        }
        System.out.println(maxsum);
    }
    
}
