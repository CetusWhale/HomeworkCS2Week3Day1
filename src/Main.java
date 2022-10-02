public class Main {
    public static void main(String[] args){
        int x = multiply(1, 2, 3);
        System.out.println(x);
    }
    static int multiply(int a, int b){
        System.out.println("first overload method");
        return a * b;
    }
    static int multiply(int a, int b, int c){
        System.out.println("second overload method");
        return a * b * c;
    }
    static int multiply(int a, int b, int c, int d){
        System.out.println("third overload method");
        return a * b * c * d;
    }
    static double multiply(double a, double b){
        System.out.println("fourth overload method");
        return a * b;
    }
    static double multiply(double a, double b, double c){
        System.out.println("fifth overload method");
        return a * b * c;
    }
    static double multiply(double a, double b, double c, double d){
        System.out.println("sixth overload method");
        return a * b * c * d;
    }
}