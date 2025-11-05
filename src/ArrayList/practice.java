package ArrayList;
import java.util.*;

public class practice {
     public static void main(String[] args) {



      Scanner in = new Scanner(System.in);

      int n = in.nextInt();

      ArrayList<Integer> arr = new ArrayList<>();

      for(int i = 0; i < n; i++) {
          int x = in.nextInt();
          arr.add(x);
      }

      for(int i = 0; i < n; i++) {
          System.out.print(arr.get(i)+" ");
      }

         System.out.println();

      arr.remove((arr.size() - 2));

      for(int i = 0; i < n; i++) {
          System.out.print(arr.get(i)+" ");
      }

    }
}
