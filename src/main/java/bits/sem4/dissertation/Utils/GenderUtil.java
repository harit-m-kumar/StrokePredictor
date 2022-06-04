package bits.sem4.dissertation.Utils;

import java.util.HashMap;
import java.util.Map;

public enum GenderUtil {
    Female(1),
    Male(2),
    Other(3);

    private final int genderCode;

    GenderUtil(int levelCode) {
        this.genderCode = levelCode;
    }
    
    public int getGenderCode() {
        return this.genderCode;
    }
}
