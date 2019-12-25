package JVM;

/**
 * @Description TODO
 * @Author Jianhai Wang
 * @ClassName TestDynamicLoad
 * @Date 2019/12/25 14:56
 * @Version 1.0
 */


public class TestDynamicLoad {

    static {
        System.out.println("*************static code************");
    }

    public static void main(String[] args){
        new A();
        System.out.println("*************load test************");
        new B();
    }
}

class A{
    public A(){
        System.out.println("*************initial A************");
    }
}

class B{
    public B(){
        System.out.println("*************initial B************");
    }
}
