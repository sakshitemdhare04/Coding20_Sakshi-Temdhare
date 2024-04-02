public class Sorting
{
  public static void main(String[] args)
  {
  int array[]={7,5,12,15,2,9,14,1};
  sortfHalfAscending(array);
  sortsHalfDescending(array);
  
  System.out.println("Sorted array:");
  for(int num :array)
  {
    System.out.println(num +"");
  }
  }
 
  public static void sortfHalfAscending(int array[])
  {
     for(int i=0;i<array.length/2-1;i++)
        {
         for(int j=i+1;j<array.length/2;j++)
          {
             if(array[i]>array[j])
              {
                 int temp=array[i];
                 array[i]=array[j];
                 array[j]=temp;
              }
          }
        }
  }

  public static void sortsHalfDescending(int array[])
  {
      for(int i=array.length/2;i<array.length-1;i++)
        {
         for(int j=i+1;j<array.length;j++)
          {
             if(array[i]>array[j])
              {
                 int temp=array[i];
                 array[i]=array[j];
                 array[j]=temp;
              }
          }
        }
  }
}