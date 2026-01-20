package IntlligenterWarenkorb;

import java.util.ArrayList;

public class Main {
public static void main (String[] args){

ArrayList<Produkt> warenkorb = new ArrayList<>();
double Gesamtpreis = 0;

warenkorb.add(new Produkt("Laptop", 999.99));
warenkorb.add(new Produkt("Deskop", 995));
warenkorb.add(new Produkt("Playstaion", 997));

for(int i= 0; i<warenkorb.size();i++){

Produkt s = warenkorb.get(i);

Gesamtpreis = Gesamtpreis + s.getPreis();}


Produkt maxPreis = warenkorb.get(0);
for(int a=0; a<warenkorb.size();a++){
    Produkt v = warenkorb.get(a);
    double Summe= v.getPreis();
    if(maxPreis.getPreis()<Summe){
    

    maxPreis = v;}


}
System.out.println(maxPreis.name + "kostet: " + maxPreis.getPreis());
System.out.println(Gesamtpreis);
}




}
