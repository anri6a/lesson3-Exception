package ru.geekbrains.exc.lesson3.HW;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystemException;

public class FileHandler {

    public void writeFile(String fileName, Human human) throws Exception{
        File file = new File(fileName);
        try (FileWriter fileWriter = new FileWriter(file, true)){
            if (file.length() > 0){
                fileWriter.write('\n');
            }
            fileWriter.write(String.valueOf(human));
        } catch (IOException e){
            throw new FileSystemException("Возникла ошибка при работе с файлом");
        }
    }
}
