package io.java8.features.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FileOperation {

  public static void main(String[] args) {
    try {
      Path path = Paths.get("E:\\Learning Path\\static-nio\\Test file2\\test.txt");
      if (Files.exists(path)) {
        log.info("File Exists!");
        readFileData(path);
      } else {
        Path createPath = Files.createFile(path);
        log.info("File created!");
        writeFileData(path);
      }
    } catch (IOException e) {
      log.info("Exception: " + e.getMessage());
      throw new RuntimeException(e);
    }
  }

  private static void writeFileData(Path path) {
    try {
      log.info("Writing lines starts.");
      String content = "test data for files";
      Files.write(path, content.getBytes());
      readFileData(path);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    log.info("Writing lines ends.");
  }


  private static void readFileData(Path path) {
    try {
      log.info("Reading lines starts.");
      List<String> lines = Files.readAllLines(path);
      lines.forEach(System.out::println);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    log.info("Reading lines ends.");
  }
}
