import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    String[] stringArr =
    {
      "sword", "shield", "axe", "staff", "sword", "sword", "sword", "axe", "axe", "axe", "shield", "staff"
    };
    String mode = findMode(stringArr);
  }

  public static int countLength(String[] arr, int targetLength)
  {
    int count = 0; 
    
    for (String str: arr) 
    {
      if (str.length() == targetLength)
      {
        count++;
      }
      return count;
    }
    return 0;
  }

  public static int indexOf(double[] arr, double target)
  {
    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i] == target)
      {
        return i; 
      }
    }
    return -1;
  }

  public static boolean hasDuplicates(int[] arr)
  {
    for (int i = 0; i < arr.length; i++)
    {
      for (int j = i+1; j < arr.length; j++)
      {
        if (arr[i] == arr[j])
        {
          return true;
        }
      }
    }
    return false;
  }

  public static String findMode(String[] arr) 
  {
    String mode = null; 
    int maxCount = 0; 
    for (int i = 0; i < arr.length; i++)
    {
      int count = 0; 
      for (int j = i+1; j < arr.length; j++)
      {
        if (arr[i].equals(arr[j]))
        {
          count++;  
        }
      }
      if (count > maxCount)
      {
        maxCount = count; 
        mode = arr[i];
      }
    }
    return mode;
  }
}
