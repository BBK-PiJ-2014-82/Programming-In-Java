public class Lesson_6_5_Symmetry_Looks_Pretty {

    public static void main(String[] args) {
        
        // declare 1 dimensional arrays
        int[] OneDimEvenMatrixSymmetrical = {1,2,3,4,4,3,2,1};
        int[] OneDimOddMatrixSymmetrical = {1,2,3,4,3,2,1};
        int[] OneDimEvenMatrixAsymmetrical = {1,2,3,4,5,6,7,8};
        int[] OneDimOddMatrixAsymmetrical = {1,2,3,4,5,6,7};
        
        // declare 2 dimensional arrays
        int[][] TwoDimEvenMatrixSymmetrical = {
            {1,2,3,4},
            {2,2,2,3},
            {3,2,2,2},
            {4,3,2,1}};
        
        int[][] TwoDimOddMatrixSymmetrical = {
            {1,2,3},
            {2,3,2},
            {3,2,1}};
        
        int[][] TwoDimEvenMatrixAsymmetrical = {
            {1,2,3,4},
            {1,1,2,3},
            {3,2,2,2},
            {4,4,2,1}};
        
        int[][] TwoDimOddMatrixAsymmetrical = {
            {1,2,3},
            {2,3,3},
            {3,2,2}};
        
        // declare triangular arrays
        int[][] TwoDimEvenMatrixTriangular = {
            {1,2,3,4},
            {0,2,3,4},
            {0,0,3,4},
            {0,0,0,4}};
        
        int[][] TwoDimOddMatrixTriangular = {
            {1,2,3},
            {0,2,3},
            {0,0,3}};
        
        // check that the methods work correctly
        MatrixChecker check = new MatrixChecker();
        
        // check 1 dimensional method
        if(check.isSymmetrical(OneDimEvenMatrixSymmetrical)){
            System.out.println("Identified: 1 Dimensional even length symmetrical matrix.");
        } else System.out.println("Error");
        if(check.isSymmetrical(OneDimOddMatrixSymmetrical)){
            System.out.println("Identified: 1 Dimensional odd length symmetrical matrix.");
        } else System.out.println("Error");
        if(!check.isSymmetrical(OneDimEvenMatrixAsymmetrical)){
            System.out.println("Identified: 1 Dimensional even length assymmetrical matrix.");
        } else System.out.println("Error");
        if(!check.isSymmetrical(OneDimOddMatrixAsymmetrical)){
            System.out.println("Identified: 1 Dimensional odd length assymmetrical matrix.");
        } else System.out.println("Error");
        
        // check 2 dimensional arrays
        if(check.isSymmetrical(TwoDimEvenMatrixSymmetrical)){
            System.out.println("Identified: 2 Dimensional even length symmetrical matrix.");
        } else System.out.println("Error");
        if(check.isSymmetrical(TwoDimOddMatrixSymmetrical)){
            System.out.println("Identified: 2 Dimensional odd length symmetrical matrix.");
        } else System.out.println("Error");
        if(!check.isSymmetrical(TwoDimEvenMatrixAsymmetrical)){
            System.out.println("Identified: 2 Dimensional even length assymmetrical matrix.");
        } else System.out.println("Error");
        if(!check.isSymmetrical(TwoDimOddMatrixAsymmetrical)){
            System.out.println("Identified: 2 Dimensional odd length assymmetrical matrix.");
        } else System.out.println("Error");
        
        // check triangular arrays
        if(check.isTriangular(TwoDimEvenMatrixTriangular)){
            System.out.println("Identified: 2 Dimensional even length triangular matrix.");
        } else System.out.println("Error");
        if(check.isTriangular(TwoDimOddMatrixTriangular)){
            System.out.println("Identified: 2 Dimensional odd length triangular matrix.");
        } else System.out.println("Error");
        if(!check.isTriangular(TwoDimEvenMatrixSymmetrical)){
            System.out.println("Identified: 2 Dimensional even length triangular matrix.");
        } else System.out.println("Error");
        if(!check.isTriangular(TwoDimOddMatrixAsymmetrical)){
            System.out.println("Identified: 2 Dimensional odd length triangular matrix.");
        } else System.out.println("Error");
    }
}