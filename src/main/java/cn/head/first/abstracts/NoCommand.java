package cn.head.first.abstracts;

public class NoCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Nothing to do");
    }

    @Override
    public void undo() {

    }
}
