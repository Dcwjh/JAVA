package JVM;


/**
 * @Description TODO
 * @Author Jianhai Wang
 * @ClassName Demo_JVM
 * @Date 2019/12/24 22:16
 * @Version 1.0
 */

//方法区 ： 静态变量+常量+类信息(构造方法/接口定义)+运行时常量池
//    虽然Java虚拟机规范把方法区描述为堆的一个逻辑部分，
//    但是它却有一个别名叫做 Non-Heap（非堆），目的应该是与 Java 堆区分开来。
//    用永久区的垃圾回收方式来实现方法区的垃圾回收
//    元空间没有使用堆内存
public class Demo_JVM {
    private static final Integer CONSTSNT = 1;

    public int math(){
        int a = 1;
        int b = 3;
        int c = (a+b) * 10;
        return c;
    }

    public static void main(String[] args) {
//        Demo_JVM demo = new Demo_JVM();
//        System.out.println(demo.math());
        System.out.println(Demo_JVM.class.getClassLoader().getName());
        System.out.println(Demo_JVM.class.getClassLoader().getClass().getName());
        System.out.println(String.class.getClassLoader());
        System.out.println(ClassLoader.getSystemClassLoader().getClass().getName());
        System.out.println("=======================================");
        System.out.println(Demo_JVM.class.getClassLoader());
        System.out.println(Demo_JVM.class.getClassLoader().getParent());
        System.out.println(Demo_JVM.class.getClassLoader().getParent().getParent());

        System.out.println("=======================================================");
        Car car1 = new Car();
        Class<? extends Car> a = car1.getClass();
        ClassLoader classLoader = a.getClassLoader();

        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());
        System.out.println(String.class.getClassLoader());

    }
}

class Car{

}
