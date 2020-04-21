package chapter06;

public class MacListCmd implements ListCmd {

    public MacListCmd() {
        System.out.println("MacListCmd");
    }

    @Override
    public void showListCmd() {
        System.out.println("Mac list cmd: ls");
    }
}
