public class Client {
    public static void main(String[] args) {
        LengthInInches lengthInInches = new LengthInInches(10);
        LengthInCentimeters lengthInCentimeters = new InchesToCentimetersAdapter(lengthInInches);

        System.out.println("Длина в дюймах: " + lengthInInches.getLengthInInches());
        System.out.println("Длина в сантиметрах: " + lengthInCentimeters.getLength());
    }
}