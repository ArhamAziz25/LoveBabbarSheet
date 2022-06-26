public class CyclicRotate {

    static int[] rotate(int arr[])
    {
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        return arr;

    }
    public static void main(String[] args) {

        //For k times rotation
        int k=3;
        int arr[]={1,2,3,4,5,6,7,8,9};
       int arr2[]=new int[arr.length];
       for(int x=0;x<k;x++)
       {

           arr2=rotate(arr);
       }
       for(int i=0;i<arr2.length;i++)
       {
        System.out.print(arr2[i]+" ");
       }
        
       }
    }
    
