public class Firstchararray{
   
    public static void main(String[] args)
    {   String str="Vishnu Kant Shukla";
        String[] array=str.split(" ");
        for(String first:array)
        {
            System.out.println(first.charAt(0));
        }
    }
}