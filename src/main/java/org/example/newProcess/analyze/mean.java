package org.example.newProcess.analyze;

import java.util.List;

public class mean implements AnalyzeInterface{

    @Override
    public double analyze(List<Integer> data) {

        int sum = 0;
        for (int element : data) sum += element;

        return (double) sum / data.size();
    }

}
