package fruits_and_boxes;

public class FruitsMain {
    public static void main(String[] args){

        Box<Apple> boxWithApple1 = new Box<Apple>();
        Box<Orange> boxWithOrange1 = new Box<Orange>();
        Box<Orange> boxWithOrange2 = new Box<Orange>();

        for (int i = 0; i <20; i++){
            boxWithApple1.fruitInBox.add(new Apple());
            boxWithOrange1.fruitInBox.add(new Orange());
        }

        System.out.println("Вес коробки1 с фруктом: " + boxWithApple1.fruitInBox.get(0).getNameThisFruit() + " составляет "  + boxWithApple1.getWeightBox());
        System.out.println("Вес коробки2 с фруктом: " + boxWithOrange1.fruitInBox.get(0).getNameThisFruit() + " составляет "  + boxWithOrange1.getWeightBox());

        System.out.println("Результат сравнения веса коробки с яблоками1 и апельсинами1: " +boxWithApple1.compareBox(boxWithOrange1));
        System.out.println("результат сравнения веса одной и той же коробки: " +boxWithApple1.compareBox(boxWithApple1));

        boxWithOrange1.moveFruitsToAnotherBox(boxWithOrange2);
        System.out.println("Вес коробки1 с фруктами после опустошения составляет: "  + boxWithOrange1.getWeightBox());
        System.out.println("Вес коробки2 с фруктом: " + boxWithOrange2.fruitInBox.get(0).getNameThisFruit() + " теперь составляет "  + boxWithOrange2.getWeightBox());

        System.out.println("Вес коробки с яблоками до добавления одного яблока: " +boxWithApple1.getWeightBox());
        boxWithApple1.addFruitInThisBox(new Apple());
        System.out.println("Вес коробки с яблоками после добавления одного яблока: " +boxWithApple1.getWeightBox());

    }
}
