
package test;

import java.util.ArrayList;
import user.User;

public class HelloWorld {
    public static String old = "10";
    
    private ArrayList<String> timeNames;
    
    private User user;

    
    public static void mark() {
        System.out.println("hello, world");
    }
    
    public static void run(){
        System.out.println("Go,Go,Go");
    }
    
    public void test(){
        timeNames = new ArrayList<String>();
        timeNames.add("Fajr");
        timeNames.add("Sunrise");
        timeNames.add("Dhuhr");
        timeNames.add("Asr");
        timeNames.add("Sunset");
        timeNames.add("Maghrib");
        timeNames.add("Isha");
        
        System.out.println("test hello" + timeNames);
    }
    
    public void testUser(){
        user = new User();
        user.setAge(10);
        user.setName("张三");
        System.out.println("age:"+user.getAge()+",name:"+user.getName());
    }
    
}
