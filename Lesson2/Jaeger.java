public class Jaeger {

    private String mark;
    private String modelName;
    private String status;
    private double height;
    private double weight;
    private int strenght;
    private int armor;

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public String getMark() {
        return mark;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;

    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setMark(String mark) {

        this.mark = mark;
    }

    public String getModelName() {
        return modelName;
    }

    public int attack(int armor, int strenght  ) {
        int hit = strenght - armor;

        return hit;
    }
}
