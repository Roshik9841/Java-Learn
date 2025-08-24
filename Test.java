import java.util.*;

class Program{
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(213);
        for(int num : list){
            System.out.println(num);
        }
    }
}