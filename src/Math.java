public class Math {
    final static double E = 2.71828;
    final static double PI = 3.14159;

    public static double abs(double a){
        if(a < 0){
            return a * -1;
        }else{
            return a;
        }
    }

    public static double max(double a, double b){
        if(a > b){
            return a;
        }else {
            return b;
        }
    }
    public static double min(double a, double b){
        if(a < b){
            return a;
        }else{
            return b;
        }
    }

}
