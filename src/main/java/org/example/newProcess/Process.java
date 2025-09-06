package org.example.newProcess;

import org.example.newProcess.analyze.AnalyzeInterface;
import org.example.newProcess.clean.CleanInterface;
import org.example.newProcess.output.OutputInterface;

import java.util.List;

public class Process {

    private AnalyzeInterface analyzeInterface;
    private CleanInterface cleanInterface;
    private OutputInterface outputInterface;


    public Process(AnalyzeInterface analyzeInterface, CleanInterface cleanInterface, OutputInterface outputInterface) {
        this.analyzeInterface = analyzeInterface;
        this.cleanInterface = cleanInterface;
        this.outputInterface = outputInterface;
    }

    List<Integer> clean(List<Integer> data) {
        return cleanInterface.clean(data);
    }

    double analyze(List<Integer> data) {
        return analyzeInterface.analyze(data);
    }

    void output(double ans) {
        outputInterface.output(ans);
    }

    public double execute(List<Integer> data) {
        List<Integer> cleanedData = clean(data);
        double result = analyze(cleanedData);
        output(result);
        return result;
    }

}
