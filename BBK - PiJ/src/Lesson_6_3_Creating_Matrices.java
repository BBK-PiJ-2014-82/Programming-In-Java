public class Lesson_6_3_Creating_Matrices {

    public static void main(String[] args) {
        Lesson_6_3_Creating_Matrices program = new Lesson_6_3_Creating_Matrices();
        program.launch();
    }
    
    public void Lesson_6_3_Creating_Matrices(){}
    
    private void launch(){
        Matrix mat = new Matrix(5, 10);
        mat.prettyPrint();
        System.out.println();
        mat.setElement(3,5,666);
        mat.prettyPrint();
        System.out.println();
        mat.setRow(3, "5,5,5,5,5,5,5,5,5,5");
        mat.prettyPrint();
        System.out.println();
        mat.setCol(5, "0,0,0,0,0");
        mat.prettyPrint();
        System.out.println();
        System.out.println(mat.toString());
        mat.setRow(1, "3,3,3,3,3,3,3,3,3");
        System.out.println();
        System.out.println(mat.toString());
        mat.setRow(4, "aa3,3,3asdfed3,3,3,3,3,3");
        System.out.println();
        System.out.println(mat.toString());
    }
}