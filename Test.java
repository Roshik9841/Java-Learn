class Calculator{
    int num1,num2;
    public void add(){
        System.out.println(("ANIMAl BARKS"));
    }
}
class abc extends Calculator{
    @Override
    public  void add(){
    System.out.println("Dog barks");
    }
}

class Program{
    public static void main(String args[]){
      Calculator c1 = new abc();
      c1.add();
        
       
    }
}