public class ACorrectFinalClass {
    private String aUsefulString;

    public final String aUsefulString() {
        return aUsefulString;
    }

    protected final void aUsefulString(String str) {
        aUsefulString = str;
    }
}