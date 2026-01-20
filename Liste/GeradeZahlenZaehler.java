import java.util.ArrayList;

public class GeradeZahlenZaehler {

    public static void main(String[] args) {
        
        int[] array = {3, 8, 15, 22, 9, 4};

        ArrayList<Integer> geradeZahlen = new ArrayList();

      for(int i=0; i<array.length;i++){

        if(array[i]%2 ==0){

            geradeZahlen.add(array[i]);
        }
      }
      System.out.println(geradeZahlen);
    }

}
