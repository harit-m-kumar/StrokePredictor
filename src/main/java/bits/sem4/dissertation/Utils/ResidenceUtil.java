package bits.sem4.dissertation.Utils;

public enum ResidenceUtil {
	
	Urban(1),
	Rural(2);


    private final int residenceCode;

    ResidenceUtil(int residenceCode) {
        this.residenceCode = residenceCode;
    }
    
    public int getResidenceTypeCode() {
        return this.residenceCode;
    }

}
