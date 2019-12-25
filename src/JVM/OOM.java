package JVM;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;



/**
 * @Description TODO
 * @Author Jianhai Wang
 * @ClassName OOM
 * @Date 2019/12/25 15:34
 * @Version 1.0
 */


public class OOM {
    //JVM参数设置
    //-Xms50M -Xmx50M  -Xlog:gc*或者使用-XX:+PringGCDetails(已弃用) -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=C:\Users\50339\Documents\JAVA\JVM
    public static void main(String[] args) throws InterruptedException {
        List<Object> list = new LinkedList<>();

        int i = 0;
        while(true){
            list.add(UUID.randomUUID().toString());
            Thread.sleep(5);
        }
    }
}
