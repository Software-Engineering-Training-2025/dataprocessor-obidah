package org.example;

import org.example.enums.AnalysisType;
import org.example.enums.CleaningType;
import org.example.enums.OutputType;
import org.example.newProcess.Process;
import org.example.newProcess.analyze.*;
import org.example.newProcess.clean.CleanInterface;
import org.example.newProcess.clean.RemoveNegatives;
import org.example.newProcess.clean.ReplaceNegativesWithZero;
import org.example.newProcess.output.OutputInterface;
import org.example.newProcess.output.console;
import org.example.newProcess.output.text_file;

import java.util.List;

public class DataProcessorService {

    public double process(
            CleaningType cleaningType,
            AnalysisType analysisType,
            OutputType outputType,
            List<Integer> data
    ) throws Exception {

        if (data.isEmpty()) {
            if (analysisType == AnalysisType.TOP3_FREQUENT_COUNT_SUM) return 0.0;
            return Double.NaN;
        }

        CleanInterface cleanInterface;
        AnalyzeInterface analyzeInterface;
        OutputInterface outputInterface;

        // Cleaning strategy
        if (cleaningType == CleaningType.REMOVE_NEGATIVES) cleanInterface = new RemoveNegatives();
        else cleanInterface = new ReplaceNegativesWithZero();

        // Analysis strategy
        if (analysisType == AnalysisType.MEAN) analyzeInterface = new mean();
        else if (analysisType == AnalysisType.MEDIAN) analyzeInterface = new median();
        else if (analysisType == AnalysisType.P90_NEAREST_RANK) analyzeInterface = new p90_nearest_rank();
        else if (analysisType == AnalysisType.STD_DEV) analyzeInterface = new std_dev();
        else analyzeInterface = new top3_frequent_count_sum();

        // Output strategy
        if (outputType == OutputType.CONSOLE) outputInterface = new console();
        else outputInterface = new text_file();

        // Execute the pipeline
        Process processor = new Process(analyzeInterface, cleanInterface, outputInterface);
        return processor.execute(data);
    }

}
