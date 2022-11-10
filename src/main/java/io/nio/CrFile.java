package io.nio;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Slf4j
public class CrFile {


    public static void main(String[] args) {

        try{
            Path path= Paths.get("E:\\Learning Path\\static-nio\\Test file2\\test.txt");
            if(Files.exists(path)){
                log.info("File Exists!");
            }else{
                Path createPath=Files.createFile(path);
                log.info("File created!");
            }
        }catch (IOException e) {
            log.info("Exception: "+e.getMessage());
            throw new RuntimeException(e);
        }

    }
}
