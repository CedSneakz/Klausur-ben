

public class ArrayListe {


public static void main(String[] args) {
double[] noten = new double[5];
double Durchschnitt = 0;
        for(int i=0; i<noten.length;i++){
            noten[i] = i + Math.random();
            System.out.println(noten[i]);

        }
        for(int i=0; i<noten.length;i++){
            Durchschnitt += noten[i];
            System.out.println(Durchschnitt);

        }
        System.out.println(Durchschnitt/noten.length);


}
    

}
