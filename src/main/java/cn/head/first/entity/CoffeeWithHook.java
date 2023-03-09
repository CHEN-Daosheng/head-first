package cn.head.first.entity;

import cn.head.first.abstracts.CaffeineBeverage;
import cn.head.first.abstracts.CaffeineBeverageWithHook;
import org.springframework.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {


    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }


    //重写的方法
    @Override
    public boolean customerWantsCondiments(){
        String answer=getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        }else {
            return false;
        }
    }


    private String getUserInput(){
        String answer=null;

        System.out.println("Would you like milk and sugar with your coffee (y/n)?");
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));

        try {
            answer=in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (StringUtils.isEmpty(answer)) {
            return "no";
        }
        return answer;
    }
}
