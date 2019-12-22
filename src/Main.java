import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static <T> void main(String[] args) {
        //problem number one
        String[] stringArr = new String[]{"Первый", "Второй", "Третий", "Четвертый"};
        Integer[] intArr = new Integer[]{1, 2, 3, 4};

        changePlaces(stringArr);
        changePlaces(intArr);

        //problem number two
        ArrayList<T> arrayListString = (ArrayList<T>) arrayToArrayList(stringArr);
        ArrayList<T> arrayListInteger = (ArrayList<T>) arrayToArrayList(intArr);

    }

    public static void changePlaces(Object... args) {
        System.out.println("Начальный массив: " + Arrays.toString(args));
        Object firstElement;
        firstElement = args[0];
        for (int i = 0; i < args.length - 1; i++) {
            args[i] = args[i + 1];
        }
        args[args.length - 1] = firstElement;
        System.out.println("Смещенный массив: " + Arrays.toString(args));
    }

    public static <T> ArrayList<T> arrayToArrayList(T[]... args) {
        return new ArrayList<T>(Arrays.<T>asList((T) args));
    }

}
