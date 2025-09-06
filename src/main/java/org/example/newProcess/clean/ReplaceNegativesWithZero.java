package org.example.newProcess.clean;

import java.util.ArrayList;
import java.util.List;

public class ReplaceNegativesWithZero implements CleanInterface{

    @Override
    public List<Integer> clean(List<Integer> data) {

        List<Integer> result = new ArrayList<>(data);

        result.replaceAll(b -> Math.max(0, b));

        return result;
    }

}
