package im.janke;

public enum Language {
    ENGLISH("English"), FRENCH("French"), GERMAN("German"), SPANISH("Spanish"), UNSPECIFIED("Unspecified");

    private final String optionValue;
    Language(String optionValue) {
        this.optionValue = optionValue;
    }

    public String value() {
        return this.optionValue;
    }
}
