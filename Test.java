import java.util.*;

class Program{
    public static void main(String args[]){
        int arr[][] = {{1,12,41,41,51},{124,5,235,623},{5235,63,3,62}};
        for(int i=0;i<arr.length;i++){
            System.out.println("{0} Elements"+i);
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}