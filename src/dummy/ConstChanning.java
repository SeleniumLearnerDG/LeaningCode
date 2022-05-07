package dummy;

public class ConstChanning {
    String name;
    Integer age;
    Integer val;

    ConstChanning(String name, Integer age, Integer val)
    {
        this.name=name;
        this.age= age;
        this.val= val;
    }

    ConstChanning(String name, int age)
    {
        this(name,age, null);
    }

    ConstChanning(String name)
    {
        this(name,null, null);
    }

    ConstChanning(){
        System.out.println("Default");
    }

    public  String toString()
    {
        return name+ " "+ age+ " "+val;
    }


    public static void main(String[] args) {
        ConstChanning obj= new ConstChanning("Ram", 20, 10);
        ConstChanning obj1= new ConstChanning("Sita", 10);
        ConstChanning obj2= new ConstChanning("Geeta");
        System.out.println(obj);
        System.out.println(obj1);
        System.out.println(obj2);
    }


}
