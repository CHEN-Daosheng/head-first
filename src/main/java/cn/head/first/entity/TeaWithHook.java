package cn.head.first.entity;

import cn.head.first.abstracts.CaffeineBeverageWithHook;
import org.springframework.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeineBeverageWithHook {


    @Override
    public void brew() {
        System.out.println("Dripping Tea through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }

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

        System.out.println("Would you like Lemon (y/n)?");
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
