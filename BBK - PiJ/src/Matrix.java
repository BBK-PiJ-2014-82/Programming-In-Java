public class Matrix {
    private int x;
    private int y;
    private int[][] mat;
    
    public Matrix(int x, int y){
        this.x = x;
        this.y = y;
        mat = new int[x][y];
        
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                mat[i][j] = 1;
            }
        }
    }
    
    public void setElement(int x, int y, int value){
        if(x <= this.x && y <= this.y){
            mat[x-1][y-1] = value;
        }
    }
    
    public void setRow(int a, String b){
        if(a < x){
            String[] tokens = b.split(",");
            if(tokens.length == y){
                for(int i = 0; i < y; i++){
                    mat[a-1][i] = Integer.parseInt(tokens[i]);
                }
            }
        }
    }
    
    public void setCol(int a, String b){
        if(a < y){
            String[] tokens = b.split(",");
            if(tokens.length == x){
                for(int i = 0; i < x; i++){
                    mat[i][a-1] = Integer.parseInt(tokens[i]);
                }
            }
        }
    }
    
    @Override
    public String toString(){
        String str = "";
        str += "[";
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                str += mat[i][j];
                if(j < y-1){str += ",";}
            }
            if(i < x-1){str += ";";}
        }
        str += "]";
        return str;
    }
    
    public void prettyPrint(){
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                System.out.print(mat[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}