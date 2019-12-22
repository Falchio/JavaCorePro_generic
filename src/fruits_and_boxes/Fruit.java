package fruits_and_boxes;

public class Fruit{
    private float weight;
    private String nameThisFruit;

    public Fruit(float weight, String nameThisFruit) {
        this.weight = weight;
        this.nameThisFruit = nameThisFruit;
    }

    public float getFruitWeight() {
        return weight;
    }

    public String getNameThisFruit() {
        return nameThisFruit;
    }

}
