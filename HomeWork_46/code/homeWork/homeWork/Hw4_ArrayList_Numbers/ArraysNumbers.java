package homeWork.homeWork.Hw4_ArrayList_Numbers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class ArraysNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i <20 ; i++) {
            int randomNumber = random.nextInt(10)+1;
            numbers.add(randomNumber);
        }
        System.out.println("Random numbers: ");
        for (int n : numbers) {
            System.out.print(n + ", ");
        }
        uniqueNumbers.addAll(numbers);
        numbers.clear();
        numbers.addAll(uniqueNumbers);
        System.out.println();
        System.out.println("Sorted unique numbers: ");
        for (int u: uniqueNumbers) {
            System.out.print(u + ", ");
        }
    }
}
