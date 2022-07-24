package io.benchmark.filereading;

import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Simple component that reads a file in a blocking way
 */
@Component
public class BlockingReader {

    /**
     * JSON file reader using FileInputStream
     *
     * @param jsonFile the file to read
     * @return String json representation of the content
     * @throws IOException
     */
    public String readJsonFile(File jsonFile) throws IOException {
        try (FileInputStream in = new FileInputStream(jsonFile)) {
            byte[] data = new byte[FileCopyUtils.BUFFER_SIZE];
            int character;
            StringBuilder stringBuilder = new StringBuilder();
            while ((character = in.read(data, 0, data.length)) != -1) {
                stringBuilder.append((char)character);
            }
            return stringBuilder.toString();
        }
    }

}
