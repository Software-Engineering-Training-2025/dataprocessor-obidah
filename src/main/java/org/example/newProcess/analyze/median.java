package org.example.newProcess.analyze;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class median implements AnalyzeInterface {

    @Override
    public double analyze(List<Integer> data) {
        if (data.isEmpty()) return Double.NaN;

        List<Integer> sorted = new ArrayList<>(data);
        Collections.sort(sorted);

        int n = sorted.size();
        int mid = n / 2;

        if (n % 2 == 0) {
            return (sorted.get(mid - 1) + sorted.get(mid)) / 2.0;
        } else {
            return sorted.get(mid);
        }
    }
}
