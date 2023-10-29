class InchesToCentimetersAdapter implements LengthInCentimeters {
    private LengthInInches lengthInInches;

    public InchesToCentimetersAdapter(LengthInInches lengthInInches) {
        this.lengthInInches = lengthInInches;
    }

    @Override
    public double getLength() {
        // Преобразование дюймов в сантиметры
        return lengthInInches.getLengthInInches() * 2.54;
    }
}