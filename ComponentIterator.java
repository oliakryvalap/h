import java.util.Iterator;

public class ComponentIterator implements Iterator<Component>{
    private int index = 0;
    // private List<Component> components = new ArrayList<>();
    private Pharmacy pharmacy;

    public ComponentIterator(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
    }
    
    @Override
    public boolean hasNext() {
        return index < pharmacy.getComponents().size();
    }

    @Override
    public Component next() {
        return pharmacy.getComponents().get(index++);
    }
    
    // Так работает For "под капотом"
    
    // public void exaple(){
    //     Pharmacy drug = new Pharmacy();
    //     for (Iterator<Component> iterator = drug.iterator(); iterator.hasNext();) {
    //         Component c = iterator.next();
    //     }
    // }
}