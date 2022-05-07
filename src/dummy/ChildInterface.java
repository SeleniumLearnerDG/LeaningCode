package dummy;

public class ChildInterface implements  IAinterface, IBInterface{
    public void display(){
        System.out.println("method");
    }

    public static void main(String[] args) {
        new ChildInterface().display();
    }
}
