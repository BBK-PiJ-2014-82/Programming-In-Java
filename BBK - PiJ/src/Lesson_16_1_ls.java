import java.io.*;

public class Lesson_16_1_ls {

    public static void main(String[] args) {
        
        File f = new File(".");
        File[] files = f.listFiles();
        
        for (File file : files) {
            if(file.isDirectory()){
                System.out.print("Directory   : ");
            } else if(file.isFile()) {
                System.out.print("File        : ");
            }
            System.out.println(file.getName());
        }
        
    }

}