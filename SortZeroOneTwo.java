
public class SortZeroOneTwo {
    public static void main(String[] args) {
        int arr[]={0,1,2,2,2,1,0,2,2,1,1,1,0};
        
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid <=high)
        {
            if(arr[mid]==2)
            {
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                mid++;
                high--;

            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else{
               int temp=arr[low];
               arr[low]=arr[mid];
               arr[mid]=temp;
               low++;
               mid++;
            }
        }

        for (int x : arr) {
            System.out.print(x+" ");
            
        }
    }
    
}
