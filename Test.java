class A{
    public A(){
        System.out.println("in A");
    }
    public A(int n){
        System.out.println("In A with n");
    }
}
class B extends A{
    public B(){
        System.out.println("in B");
    }
    public B(int n){
        super(n);
        System.out.println("In B int");
    }
}
class Program{
    public static void main(String args[]){
        B b1 = new B();
        B b2 = new B(12);
    }
}