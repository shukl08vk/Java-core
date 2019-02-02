import java.util.ArrayList;

public class ListArray
{
    List<Stack<Integer>> arr=new ArrayList<Stack<Integer>>();
    int[] arr1={6,5,8,4,7,10,9};
    int k=0;
    arr.add(arr1[0]);
    for(int i=1;i<7;i++)
    {
        if(arr1[i]>arr[i-1])
        {arr.add(arr1[i]);
            k++;
        }
        else arr.get(k).push(arr1[i]);   
    }
    for(int i=1;i<arr.size();i++)
    {
        arr.get(i).pop();
    }
    system.out.println(arr1);
    /*for(i=0;i<arr.size())
    {
        if(arr[])
    }*/


}