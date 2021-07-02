package Lesson_5;

import java.util.HashMap;
import java.util.Map;

public class MainClassMap {
    public static void main(String[] args) {
        Map<String,String> ourMap = new HashMap();
        System.out.println(ourMap);

        ourMap.put("Login", "test@gmail.com");
        System.out.println(ourMap);
        ourMap.put("Password", "1233213");
        System.out.println(ourMap);
        ourMap.put("authorization","true");
        System.out.println(ourMap);

        if (ourMap.get("authorization").contains("true")){
            System.out.println("TRUE");
        }
        if (Boolean.parseBoolean(ourMap.get("authorization"))){
            System.out.println("Boolean TRUE");
        }

    }
}
