package io.nio;



import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Slf4j
public class CrDirectory {


    public static void main(String[] args) {

        try{
        Path path= Paths.get("E:\\Learning Path\\static-nio\\Test file2");
            if(Files.exists(path)){
                log.info("Directory Exists!");
            }else{
                Path createPath=Files.createDirectories(path);
                log.info("Directory created!");
            }
        }catch (IOException e) {
            log.info("Exception: "+e.getMessage());
            throw new RuntimeException(e);
        }

    }
}
