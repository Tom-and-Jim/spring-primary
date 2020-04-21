package chapter06;

public class WindowListCmd implements ListCmd {

    public WindowListCmd() {
        System.out.println("WindowListCmd");
    }

    @Override
    public void showListCmd() {
        System.out.println("Windows list cmd: dir");
    }
}
