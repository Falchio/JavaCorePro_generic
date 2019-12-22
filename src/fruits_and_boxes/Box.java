package fruits_and_boxes;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    ArrayList<T> fruitInBox = new ArrayList<>();

    public Box(ArrayList<T> fruitInBox) {
        this.fruitInBox = fruitInBox;
    }

    public Box(T... fruits){
        fruitInBox.addAll(Arrays.asList(fruits));
    }

    public Box (T fruit){
        fruitInBox.add(fruit);
    }

    public ArrayList<T> getFruitInBox() {
        return fruitInBox;
    }

    public float getWeightBox(){
        float weightBox =0.0f;

        if (this.fruitInBox.size()!=0) {
            float fruitWeight = this.fruitInBox.get(0).getFruitWeight();
            float quantityFruit = this.fruitInBox.size();
            weightBox = fruitWeight * quantityFruit;
        }

        return weightBox;
    }

    public <T extends Fruit> boolean compareBox(Box<T> boxForCompare){
        boolean resultOfCompare = false;

        if (this.getWeightBox()==boxForCompare.getWeightBox()){
                resultOfCompare=true;
            }

        return resultOfCompare;
    }

    public void moveFruitsToAnotherBox(Box<T> anotherBox){
        if((this.fruitInBox.size()!=0)&&(!this.fruitInBox.equals(anotherBox.fruitInBox))){          //Ящик из которого пересыпаем не пуст и мы не пересыпаем фрукты в тот же самый ящик
            anotherBox.fruitInBox.addAll(this.fruitInBox);
            this.fruitInBox.clear();
        }

    }

    public void addFruitInThisBox(T  fruit){
        this.fruitInBox.add(fruit);
    }

}
