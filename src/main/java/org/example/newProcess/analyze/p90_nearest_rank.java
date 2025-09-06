package org.example.newProcess.analyze;

import java.util.Collections;
import java.util.List;

public class p90_nearest_rank implements AnalyzeInterface{

    @Override
    public double analyze(List<Integer> data) {

        Collections.sort(data);

        int rank = (int) Math.ceil(0.9 * data.size());

        return (double) data.get(rank - 1);
    }

}
