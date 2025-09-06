package org.example;

import org.example.enums.AnalysisType;
import org.example.enums.CleaningType;
import org.example.enums.OutputType;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            // Sample data
            List<Integer> data = Arrays.asList(10, 2, 8, 4);

            // Create the service
            DataProcessorService service = new DataProcessorService();

            // Test median with REPLACE_NEGATIVES_WITH_ZERO (though no negatives here)
            double medianResult = service.process(
                    CleaningType.REPLACE_NEGATIVES_WITH_ZERO,
                    AnalysisType.MEDIAN,
                    OutputType.CONSOLE,
                    data
            );

            System.out.println("Median result: " + medianResult);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}