package com.example.zad2;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class RequestListener implements ServletRequestListener {
    Map<ServletRequest, Long> requests = new HashMap<>();
    // List of numbers
    static LinkedList<Integer> numbers = new LinkedList<>();

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        long time = System.currentTimeMillis();
        System.out.println("Request destroyed");
        numbers.sort(Integer::compareTo);
        System.out.println("Request " + ((HttpServletRequest) sre.getServletRequest()).getRequestURI() + " took " + (time - requests.get(sre.getServletRequest())) + " ms");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        // if ulr is /add_number then add number
        System.out.println("Request initialized");
        if(((HttpServletRequest) sre.getServletRequest()).getRequestURI().equals("/zad2_war_exploded/add")){
            System.out.println("Adding number");
            addNumber();
            sortNumbers();
        }

        requests.put(sre.getServletRequest(), System.currentTimeMillis());
    }

    public static void addNumber(){
        System.out.println("Adding number");
        Integer new_number = (int) (Math.random() * 100);
        numbers.add(new_number);
    }

    public void sortNumbers(){
        numbers.sort(Integer::compareTo);
    }
    
    public static void printNumbers(){
        System.out.println("Numbers: " + numbers);
    }

    public static LinkedList<Integer> getNumbers(){
        return numbers;
    }
}
