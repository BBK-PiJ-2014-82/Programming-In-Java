public class HashUtilities {
    
    static public int shortHash(int i){
        return Math.abs(i % 1000);
    }
    
}