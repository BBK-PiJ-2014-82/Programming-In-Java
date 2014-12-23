public class MatrixChecker {
    
    // return true if a 1 dimensional array is symmetrical
    public boolean isSymmetrical(int[] matrix){
        for(int i = 0; i < matrix.length/2; i++){
            if(matrix[i] != matrix[(matrix.length-1)-i]){
                return false;
            }
        }
        return true;
    }
    
    // return true if a 2 dimensional array is symmetrical
    // assumes array is rectangular
    public boolean isSymmetrical(int[][] matrix){
        for(int i = 0; i < matrix.length/2; i++){
            for(int j = 0; j < matrix[0].length/2; j++){
                if(matrix[i][j] != matrix[(matrix.length-1)-i][(matrix[0].length-1)-j]){
                    return false;
                }
            }
        }
        return true;
    }
    
    // return true if a 2 dimensional array is triangular
    // assumes array is rectangular
    public boolean isTriangular(int[][] matrix){
        for(int i = 0; i < matrix.length-1; i++){
            for(int j = 0; j < matrix[0].length-1; j++){
                if(i > j){
                    if(matrix[i][j] != 0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}