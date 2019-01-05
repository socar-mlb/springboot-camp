public class Exam03 {
    static {
        System.out.println("static");
    }

    public static void main(String[] args) {
        System.out.println("main");
        MyBean2 m = new MyBean2();
        m.print();
    }
}

class MyBean2 {
    static {
        System.out.println("my bean2 static");
    }

    public MyBean2() {
        System.out.println("my bean2 constructor");
    }

    public void print() {
        System.out.println("my bean2 print method");
    }
}
