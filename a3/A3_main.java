package a3 ;
import java.util.ArrayList ;
import java.util.Arrays;
public class A3_main {
    public static void main ( String [] args ) {
    ArrayList < Integer > list = new ArrayList < >() ;
    list . add (1) ;
    list . add (3) ;
    int [] array = ArrayListToArray ( list );
    int [] a = {1 , 3};
    ArrayList <Integer> l = ArrayToArrayList (a);
    System.out.println(Arrays.toString(array));
    System.out.println(l.toString());
}
    
public static int[] ArrayListToArray(ArrayList <Integer> list){

    int[] a= new int[list.size()];
    for(int i=0; i<list.size(); i++){
        a[i]=list.get(i);

    }
    return a;
}

public static ArrayList<Integer> ArrayToArrayList(int[] a){

    ArrayList<Integer> liste= new ArrayList<Integer>();
    
    for(int i=0; i<a.length; i++){
        liste.add(a[i]);

    }
    return liste;
}

}