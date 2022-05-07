package dummy;

class TestApp {

//    static int index = 0;
//
//    public static void main(String args[]) {
//        System.out.println(new dummy.TestApp().test());// 1
//    }
//
//    int test() {
//        int index = 1;
//        return index;
//    }
public static void main(String[] args) {
    class Tutorial {
        public String name;

        public Tutorial(String tutorial) {
            name = tutorial;
        }
    }

    Object obj = new Tutorial("Java Quiz");
    Tutorial tutorial = (Tutorial) obj;
    System.out.println(tutorial.name);
}
}
