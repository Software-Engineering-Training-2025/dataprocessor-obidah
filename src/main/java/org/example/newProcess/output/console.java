package org.example.newProcess.output;

public class console implements OutputInterface{

    @Override
    public void output(double ans) {
        System.out.println(ans);
    }

}
