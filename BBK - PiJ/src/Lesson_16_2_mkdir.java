import java.io.*;

public class Lesson_16_2_mkdir {

    public static void main(String[] args) {
        
        String directory = "./";
        
        String name = directory;
        for (String arg : args) {
            name = name + arg;
        }
        
        File dir = new File(name);
        dir.mkdir();
        
    }

}