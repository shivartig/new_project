package english;

public class Perameter {
    public static class Inputperameters {
        public void addition(int a, int b) {
            int sum = a + b;
            System.out.println("addition"+sum);

        }
        public void substract(int c,int d){
            int substract = c - d;
            System.out.println("substract"+substract);
        }
        public void multiply(int f,int h){
            int multiply = f * h;
            System.out.println("multiply"+multiply);


        }
        public void divide (int g, int j){
            int divide = g / j;
            System.out.println("divide "+divide);
        }


        public static void main(String[] args) {
            Inputperameters obj = new Inputperameters();
            obj.addition(6, 4);
            obj.substract(5,2);
            obj.multiply(3,8);
            obj.divide(8,4);
        }

    }
}
