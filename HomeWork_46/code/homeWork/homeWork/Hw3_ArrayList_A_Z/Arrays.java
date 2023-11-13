package homeWork.homeWork.Hw3_ArrayList_A_Z;

import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        ArrayList<Character> alphabet = new ArrayList<>();
        //fill in Array list
        for (int i = 65; i <=90 ; i++) {
            char letter = (char) i;
            alphabet.add(letter);
        }
        for (char l : alphabet) {
            System.out.print(l + ", ");
        }
    }
}
