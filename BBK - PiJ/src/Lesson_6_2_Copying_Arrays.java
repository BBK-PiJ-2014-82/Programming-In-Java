public class Lesson_6_2_Copying_Arrays {

    public static void main(String[] args) {
        Lesson_6_2_Copying_Arrays program = new Lesson_6_2_Copying_Arrays();
        program.launch();
    }
    
    public void launch(){
        int[] a = {10, 20, 30, 40, 50};
        int[] b = new int[5];
        int[] c = new int[3];
        int[] d = new int[7];
        
        ArrayCopier copier = new ArrayCopier();
        
        copier.copy(a, b);
        copier.copy(a, c);
        copier.copy(a, d);
        
        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
        
        System.out.println();
        
        for(int i = 0; i < c.length; i++){
            System.out.println(c[i]);
        }
        
        System.out.println();
        
        for(int i = 0; i < d.length; i++){
            System.out.println(d[i]);
        }
    }
}