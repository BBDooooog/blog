package com.bbdog.demo;

import com.bbdog.demo.entity.Message;
import com.bbdog.demo.entity.User;

import java.util.*;

public class Test {




    public static void main(String[] args) throws Exception{
        Class clazz = Message.class;
        System.out.println(clazz.getName());
        System.out.println(clazz.getPackage().getName());
        System.out.println(clazz.getSimpleName());
        /*User user1 = new User();
        User user2 = new User();
        System.out.println("user1 HashCode is:"+user1.hashCode());
        System.out.println("user2 HashCode is:"+user2.hashCode());
        System.out.println("user1 identityHashCode is:"+System.identityHashCode(user1));
        System.out.println("user2 identityHashCode is:"+System.identityHashCode(user2));
        System.out.println("user1 == user2 ?"+ (user1 == user2));
        System.out.println("user1.equals(user2)?"+user1.equals(user2));*/

    }
    private static void isRandomAccessSupported(List list) {
        if (list instanceof RandomAccess) {
            System.out.println("RandomAccess implemented!");
        } else {
            System.out.println("RandomAccess not implemented!");
        }

    }

    public static void iteratorThroughRandomAccess(List list) {

        long startTime;
        long endTime;
        startTime = System.currentTimeMillis();
        for (int i=0; i<list.size(); i++) {
            list.get(i);
        }
        endTime = System.currentTimeMillis();
        long interval = endTime - startTime;
        System.out.println("iteratorThroughRandomAccess：" + interval+" ms");
    }

    public static void iteratorThroughIterator(List list) {

        long startTime;
        long endTime;
        startTime = System.currentTimeMillis();
        for(Iterator iter = list.iterator(); iter.hasNext(); ) {
            iter.next();
        }
        endTime = System.currentTimeMillis();
        long interval = endTime - startTime;
        System.out.println("iteratorThroughIterator：" + interval+" ms");
    }


    public static void iteratorThroughFor2(List list) {

        long startTime;
        long endTime;
        startTime = System.currentTimeMillis();
        for(Object obj:list)
            ;
        endTime = System.currentTimeMillis();
        long interval = endTime - startTime;
        System.out.println("iteratorThroughFor2：" + interval+" ms");
    }


}
