class Calculator{
    int num1,num2;
    public void add(int num1,int num2){
        System.out.println("Sum is "+(num1+num2));
    }
}

class Program{
    public static void main(String args[]){
        Calculator c1 = new Calculator();
        c1.add(10,20);
        
       
    }
}