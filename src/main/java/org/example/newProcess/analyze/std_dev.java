package org.example.newProcess.analyze;

import java.util.List;

public class std_dev implements AnalyzeInterface{

    @Override
    public double analyze(List<Integer> data) {

        double sum = 0;
        double avg = 0;
        double squared_numbers = 0;
        double ans = 0;

        for (int element : data) sum += element;

        avg = sum / data.size();

        for (int element : data) squared_numbers += (avg - element) * (avg - element);

        ans = squared_numbers / data.size();
        ans = Math.sqrt(ans);

        return ans;

    }

}
