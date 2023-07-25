import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();
        pharmacy.addComponent(new Component("Peneciline", "0.6", 15))
                .addComponent(new Component("Water", "1.2", 4));

        // while(pharmacy.hasNext()){
        // System.out.println(pharmacy.next());
        // }

        for (Component item : pharmacy) {
            System.out.println(item);
        }

        Pharmacy pharmacy2 = new Pharmacy();
        pharmacy2.addComponent(new Component("Peneciline", "0.6", 14))
                .addComponent(new Component("Water", "1.2", 2));

        Pharmacy pharmacy3 = new Pharmacy();
        pharmacy3.addComponent(new Component("Peneciline", "0.6", 24))
                .addComponent(new Component("Water", "1.2", 6));

        List<Pharmacy> pharmacyList = new ArrayList<>();
        pharmacyList.add(pharmacy);
        pharmacyList.add(pharmacy2);
        pharmacyList.add(pharmacy3);
        System.out.println(pharmacyList);
        System.out.println("----------");

        Collections.sort(pharmacyList);
        System.out.println(pharmacyList);

        // Так не работает:
        // System.out.println(pharmacy > pharmacy2);

        Pharmacy pharmacy4 = new Pharmacy();
        pharmacy4.addComponent(new Component("Ampicilin", "0.6", 24))
                .addComponent(new Component("Water", "1.2", 6));

        System.out.println(pharmacy3.equals(pharmacy4));

        
        
        Pharmacy pharmacy5 = new Pharmacy();
        pharmacy5.addComponent(new Component("Augumentin", "0.6", 14))
                .addComponent(new Component("Water", "1.2", 1));
        System.out.println(pharmacy3.equals(pharmacy4));
        System.out.println(pharmacy2.equals(pharmacy4));
        System.out.println(pharmacy5.equals(pharmacy4));
        

        Set<Pharmacy> result = new HashSet<>();
        result.add(pharmacy);
        result.add(pharmacy2);
        result.add(pharmacy3);
        result.add(pharmacy4);

        System.out.println(pharmacy.hashCode());
        System.out.println(pharmacy2.hashCode());
        System.out.println(result.size());

        
        pharmacyList = new ArrayList<>();
        pharmacyList.add(pharmacy);
        pharmacyList.add(pharmacy2);
        pharmacy3 = new Pharmacy();
        pharmacy3.addComponent(new Component("Azitromicin", "0.6", 2))
                .addComponent(new Component("Amoksiklav", "1.2", 2))
                .addComponent(new Component("Kotrimazol", "1.2", 6));
        pharmacyList.add(pharmacy3);
        pharmacy = new Pharmacy();
        pharmacy.addComponent(new Component("Peneceline", "0.6", 4))
                .addComponent(new Component("Vater", "1.2", 1));
        pharmacyList.add(pharmacy);

        System.out.println(pharmacyList);
        

        Collections.sort(pharmacyList);
        System.out.println(pharmacyList);
}
}