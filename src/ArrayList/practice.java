package ArrayList;
import java.util.*;

public class practice {
     public static void main(String[] args) {

      ArrayList<Integer> arr = new ArrayList<>();

      arr.add(1);
      arr.add(3);
      arr.add(4);
      arr.add(9);

      int n = arr.size();
      for(int i = 0; i < n; i++) {
          System.out.print(arr.get(i)+" ");
      }


    }
}
