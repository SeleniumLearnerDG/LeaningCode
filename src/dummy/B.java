package dummy;



 class A
        {
        String s1;
        public String f1()
        {
        return s1;
        }
        }

        public class B extends A
        {
        String s2;
        public String f2()
        {
        return s2;
        }

public static void main(String args[])
        {
        B obj1=(B)new A(); // classCastExceptiom
        obj1.f1();
        obj1.f2();

        A obj=new B();
        obj.f1();
//        obj.f2();// no method define
        }
        }
