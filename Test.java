import java.util.*;

class Program{
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb.capacity());
        sb.append(" Roshik Maharjan");

        System.out.println(sb);

        sb.deleteCharAt(3);
        System.out.println(sb);
    }
}