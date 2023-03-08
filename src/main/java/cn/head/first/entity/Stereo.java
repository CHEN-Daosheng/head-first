package cn.head.first.entity;

public class Stereo {


    String stereo;

    public Stereo(String stereo){
        this.stereo=stereo;
    }

    public void on(){
        System.out.println(stereo+" "+"Stereo on...");
    }

    public void off(){
        System.out.println(stereo+" "+"Stereo off...");
    }

    public void setCD(){
        System.out.println(stereo+" "+"Stereo set CD...");
    }

    public void setVolume(int volume){
        System.out.println(stereo+" "+"Stereo set Volume "+volume);
    }
}
