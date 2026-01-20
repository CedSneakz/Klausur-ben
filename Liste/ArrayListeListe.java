import java.util.ArrayList;
public class ArrayListeListe {

    public static void main(String[] args) {

    ArrayList <String> gaeste = new ArrayList<>();

        gaeste.add("Jonathan");
        gaeste.add("Timo");
        gaeste.add("Cedric");
        gaeste.add("Justin");

        gaeste.remove("Cedric");

        gaeste.add(0, "Benni");
        System.out.println("Anzahl der Gäste: " + gaeste.size());
        for(int i=0; i<gaeste.size();i++){

            System.out.println(gaeste.get(i));
        }
    }
}
