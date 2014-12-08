public class Lesson_6_1_Dividing_Integers {

    public static void main(String[] args) {
        Lesson_6_1_Dividing_Integers program = new Lesson_6_1_Dividing_Integers();
        program.Launch();
    }
    
    public void Launch(){
        int a, b;
        a = 10;
        b = 15;
        
        Calculator calc = new Calculator();
        
        calc.add(a, b);
        calc.subtract(a, b);
        calc.multiply(a, b);
        calc.divide(a, b);
        calc.modulus(a, b);
        
    }

    public class Calculator{
        
        public Calculator(){
            
        }
        
        private void add(int a, int b){
            print(a + b);
        }
        
        private void subtract(int a , int b){
            print(a - b);
        } 
        
        private void multiply(int a, int b){
            print(a * b);
        }
        
        private void divide(int a, int b){
            print((double)a / (double)b);
        }
        
        private void modulus(int a, int b){
            print(a % b);
        }
        
        private void print(double a){
            System.out.println("Result: " + a);
        }
    
    }
    
}