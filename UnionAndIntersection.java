import java.util.HashSet;


public class UnionAndIntersection {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6,7,8,90,100};
    int arr2[]={1,2,7,8,9,100,34};
    HashSet<Integer> set=new HashSet<>();

    for(int i=0;i<arr1.length;i++)
    {
        set.add(arr1[i]);
    }

    for(int i=0;i<arr2.length;i++)
    {
        set.add(arr2[i]);
    }
    System.out.println("Union is:"+set);

    set.clear();

    System.out.println("Intersection is:");
    for(int i=0;i<arr1.length;i++)
    {
        set.add(arr1[i]);
    }

    for(int i=0;i<arr2.length;i++)
    {
        if(set.contains(arr2[i]))
        {
            System.out.print(arr2[i]+" ");
        }
    }
    


    }
    
}
