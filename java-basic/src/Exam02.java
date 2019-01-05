import java.lang.reflect.Method;

// reflection
public class Exam02 {

    public static void main(String[] args) throws Exception {
        Object object = new Action1();
        Action1 a1 = (Action1) object;
        a1.run();

        Class clazz = Class.forName("Action1");
        Object obj = clazz.newInstance();
        Method runMethod = clazz.getMethod("run", null);
        runMethod.invoke(obj, null);


        System.out.println(clazz.getName());
        Method[] methods = clazz.getMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }
    }
}

class Action1 {
    static {
        System.out.println("static action1");
    }

    public void run() {
        System.out.println("run action1");
    }
}

class Action2 {
    static {
        System.out.println("static action2");
    }

    public void run() {
        System.out.println("run action2");
    }
}