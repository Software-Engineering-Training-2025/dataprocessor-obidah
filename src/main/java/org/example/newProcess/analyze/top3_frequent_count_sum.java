package org.example.newProcess.analyze;

import java.util.*;

public class top3_frequent_count_sum implements AnalyzeInterface{

    @Override
    public double analyze(List<Integer> data) {

        Map<Integer, Integer> map = new HashMap<>();
        double ans = 0;

        for (int element : data)
            map.put(element, map.getOrDefault(element, 0) + 1);

        List<Integer> new_list = new ArrayList<>(map.values());

        Collections.sort(new_list);
        Collections.reverse(new_list);

        for (int i = 0; i < Math.min(new_list.size() , 3); i++)
            ans += new_list.get(i);

        return ans;
    }

}
