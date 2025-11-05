package ArrayList;
import java.util.*;

public class practice {
     public static void main(String[] args) {



      Scanner in = new Scanner(System.in);



     ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

     ArrayList<Integer> a = new ArrayList<>();
     a.add(   1   );

     ArrayList<Integer> b = new ArrayList<>();
     b.add(  1  );
     b.add(  1  );
     b.add(  1  );

     ArrayList<Integer> c = new ArrayList<>();
     c.add( 1 );
     c.add( 2 );
     c.add( 2 );
     c.add( 1 );

     ArrayList<Integer> d = new ArrayList<>();
     d.add(1);
     d.add(3);
     d.add(4);
     d.add(3);
     d.add(1);

     arr.add(a);
     arr.add(b);
     arr.add(c);
     arr.add(d);

     for(int i = 0; i < arr.size(); i++) {
         for(int j = 0; j < arr.get(i).size(); j++) {
             System.out.print(arr.get(i).get(j)+" ");
         }
         System.out.println();
     }






    }
}
