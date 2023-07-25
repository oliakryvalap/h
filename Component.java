public class Component {
    private String name;
    private String weight;
    private int power;
    
    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public int getPower(){
        return power;
    }

    @Override
    public String toString(){
        return String.format("%s {Название: %s, вес: %s, сила: %s}",getClass().getSimpleName(), this.name, this.weight, this.power);
    }

    public int getName() {
        return 0;
    }

    public Object getWeight() {
        return null;
    }
}