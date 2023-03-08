package cn.head.first.entity;

public class GarageDoor {

    String garageDoor;

    public GarageDoor(String garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void up() {
        System.out.println(garageDoor + " " + "GarageDoor up...");
    }

    public void down() {
        System.out.println(garageDoor + " " + "GarageDoor down...");
    }
}
