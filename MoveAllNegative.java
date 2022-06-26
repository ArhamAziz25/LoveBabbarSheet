public class MoveAllNegative {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,-1,4,5,-6,-9,-1,0,4,-1};
        int i=0;
        int j=arr.length-1;
        while(i<=j)
        {
            if(arr[j]<0 && arr[i]>0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;

            }else if(arr[i]<0 && arr[j]<0){
                i++;
            }
            else{
             j--;   
            }
        }
        for (int z : arr) {
            System.out.print(z+" ");
            
        }

    }
    
}
