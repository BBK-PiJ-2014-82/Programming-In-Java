public class Lesson_8_5_1_Hash_Function {

    public static void main(String[] args) {
        
        int hash, smallHash;
        
        System.out.println("Testing various hash codes:");
        
        // test String1
        String testStr = "abc";
        hash = testStr.hashCode();
        smallHash = HashUtilities.shortHash(hash);
        System.out.println("String1     : 0 < " + smallHash + " < 1000");
        
        // test String2
        testStr = "xyz";
        hash = testStr.hashCode();
        smallHash = HashUtilities.shortHash(hash);
        System.out.println("String2     : 0 < " + smallHash + " < 1000");
        
        // test Int
        Integer testInt = -20043;
        hash = testInt.hashCode();
        smallHash = HashUtilities.shortHash(hash);
        System.out.println("Integer     : 0 < " + smallHash + " < 1000");
        
        // test Character
        Character testChar = 'A';
        hash = testChar.hashCode();
        smallHash = HashUtilities.shortHash(hash);
        System.out.println("Character   : 0 < " + smallHash + " < 1000");
        
    }

}