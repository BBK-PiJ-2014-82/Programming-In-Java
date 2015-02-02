import java.io.*;

public class Lesson_16_3_cat_a {

    public static void main(String[] args) {
        
        if(args.length > 0){
            String name = "./" + args[0];
            File file = new File(name);
            BufferedReader in = null;
        
            if(file.exists()){
                try {
                    in = new BufferedReader(new FileReader(file));
                    String line;
                    while((line = in.readLine()) != null){
                        System.out.println(line);
                    }
                } catch (FileNotFoundException ex){
                    System.out.println("File " + file + " does not exist.");
                } catch (IOException ex){
                    ex.printStackTrace();
                } finally {
                    closeReader(in);
                }
            }
        } else {
            System.out.println("No file name provided.");
        }
    }
    
    private static void closeReader(Reader reader){
        try{
            if(reader != null){
                reader.close();
            }
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

}