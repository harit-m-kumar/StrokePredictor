package bits.sem4.dissertation.Utils;

public enum MarriedUtil {
	
    No(1),
    Yes(2);

    private final int marriedCode;

    MarriedUtil(int marriedCode) {
        this.marriedCode = marriedCode;
    }
    
    public int getMarriedCode() {
        return this.marriedCode;
    }

}
