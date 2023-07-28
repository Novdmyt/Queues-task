package app.task1;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static Queue<String> getData(){
        Queue<String> data = new LinkedList<>();
        data.add("apricot");
        data.add("mango");
        data.add("cherry");
        data.add("rice");
        return data;
    }
    public static Queue<String> getNewData(Queue<String> newData){
        newData.add("kiwi");
        return newData;
    }
    public static String showList(Queue<String> list){
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (String name : list) {
            count++;
            result.append(count).append(") ").append(name).append(" \n");

}
