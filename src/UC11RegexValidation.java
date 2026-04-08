public class UC11RegexValidation {
    public static void main(String[] args) {

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        boolean isTrainValid = trainId.matches("TRN-\\d{4}");
        boolean isCargoValid = cargoCode.matches("PET-[A-Z]{2}");

        if (isTrainValid && isCargoValid) {
            System.out.println("Valid Input ✅");
        } else {
            System.out.println("Invalid Input ❌");
        }
    }
}