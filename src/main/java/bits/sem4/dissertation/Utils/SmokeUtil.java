package bits.sem4.dissertation.Utils;

public enum SmokeUtil {
	
	neverSmoked(1),
	unknown(2),
	formerlySmoked(3),
	No(4);


    private final int smokeCode;

    SmokeUtil(int smokeCode) {
        this.smokeCode = smokeCode;
    }
    
    public int getSmokeCode() {
        return this.smokeCode;
    }

}
