public class BarkingDog {

    public static void main(String[] args) {
        boolean response = shouldWakeUp(true, -1);
        System.out.println(response);

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (barking == true && hourOfDay < 8 || hourOfDay > 22) {
            return true;
        } else {
            return false;
        }
    }
}
