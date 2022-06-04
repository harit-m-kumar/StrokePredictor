package bits.sem4.dissertation.Utils;

public enum WorkTypeUtil {
	
	Private(1),
	selfEmployed(2),
	children(3),
	govtJob(4),
	neverWorked(5);


    private final int workTypeCode;

    WorkTypeUtil(int workTypeCode) {
        this.workTypeCode = workTypeCode;
    }
    
    public int getWorkTypeCode() {
        return this.workTypeCode;
    }


}
