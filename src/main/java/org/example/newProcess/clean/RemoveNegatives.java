package org.example.newProcess.clean;

import java.util.ArrayList;
import java.util.List;

public class RemoveNegatives implements CleanInterface{

    @Override
    public List<Integer> clean(List<Integer> data) {

        List<Integer> new_list = new ArrayList<>();

        for (int element : data) {
            if (element >= 0)
                new_list.add(element);

        }

        return new_list;
    }
}
