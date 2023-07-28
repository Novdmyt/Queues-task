package app.task2;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static LinkedList<String> getData(){
        LinkedList<String> data = new LinkedList<>();
        data.add("apricot");
        data.add("mango");
        data.add("cherry");
        data.add("rice");
        return data;
    }

    public static LinkedList<String> getRemoveData(LinkedList<String> data){
       data.poll();
       return data;
    }
    public static String showList(Queue<String> list){
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (String name : list) {
            count++;
            result.append(count).append(") ").append(name).append(" \n");
        }
        return result.toString();
    }
}
