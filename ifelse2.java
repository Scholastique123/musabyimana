public class ifelse2{
    public static void main(String[] args) {
        int age = 18;
        boolean hasLicense = true;

        // Check if a person is eligible to drive
        if (age >= 18) {
            if (hasLicense) {
                System.out.println("You are eligible to drive.");
            } else {
                System.out.println("You are old enough, but you don't have a license.");
            }
        } else {
            System.out.println("You are not old enough to drive.");
        }
    }
}