package org.example.newProcess.output;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class text_file implements OutputInterface {

    @Override
    public void output(double ans) {
        String content = "Result = " + ans;
        Path filePath = Paths.get("target/result.txt");

        try {
            // Create parent directories if they don't exist
            Files.createDirectories(filePath.getParent());

            // Write content to the file (overwrite if exists)
            Files.write(filePath, content.getBytes(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING);

            System.out.println("Result written to " + filePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
