public class AreaCalculator {
    public static void main(String[] args) {
        double result = area(1);
        double result2 = area(1.0,2.0);
        System.out.println(result);
        System.out.println(result2);

    }
    public static double area(double radius){

            if (radius < 0.0) {
                return -1.0;
            } else {
                return (Math.PI * radius * radius);
            }

        }

        public static double area (double x, double y) {
            if((x < 0.0) || (y < 0.0)) {
                return -1.0;
            } else {
                return (x * y);
            }
        }

    }
