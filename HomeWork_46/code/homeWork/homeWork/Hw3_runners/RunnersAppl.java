package homeWork.homeWork.Hw3_runners;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RunnersAppl {
    public static void main(String[] args) {
        List<Runners> runnersList = new ArrayList<>();
        runnersList.add(new Runners("Smith", "John", 122, "Bayern", 13));
        runnersList.add(new Runners("Jones", "Marc", 933, "Berlin", 10));
        runnersList.add(new Runners("Williams", "Steve", 344, "Frankfurt", 11));
        runnersList.add(new Runners("Brown", "Stephen", 566, "Hamburg", 16));
        runnersList.add(new Runners("Taylor", "Alex", 244, "Düseldorf", 16));
        System.out.println("Total runners: " + runnersList.size());
        System.out.println("Runner list is empty: " + runnersList.isEmpty());
        for (Runners r : runnersList) { //print all runners
            System.out.println(r);
        }
        System.out.println("------------Sorted list by ID--------------");
        runnersList.sort(Runners::compareTo);
        for (Runners r :runnersList) {
            System.out.println(r);
        }
        System.out.println("-------------Sorted list by time------------");
        Comparator<Runners> comparator = new Comparator<Runners>() {
            @Override
            public int compare(Runners o1, Runners o2) {
                return o1.getTime()- o2.getTime();
            }
        };
        runnersList.sort(comparator);
        for (Runners r:runnersList) {
            System.out.println(r);
        }
        //average time
        double average = 0;
        for (Runners r:runnersList) {
            average += r.getTime()/runnersList.size();
        }
        System.out.println("Average time: " + average);

        //winner
        System.out.println("The winner is: " + runnersList.get(0));

        }
}





