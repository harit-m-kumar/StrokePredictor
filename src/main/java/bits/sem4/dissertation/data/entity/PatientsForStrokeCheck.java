package bits.sem4.dissertation.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PATIENTS_FOR_STROKE_CHECK")
public class PatientsForStrokeCheck {
    @Id
    @Column(name="PATIENT_ID")
    private long patientId;
    @Column(name="PATIENT_NAME")
    private String patientname;
    @Column(name="GENDER")
    private String gender;
    @Column(name="AGE")
    private int age;
    @Column(name="HYPERTENSION")
    private int hyperTension;
    @Column(name="HEART_DISEASE")
    private int heartDisease;
    @Column(name="EVER_MARRIED")
    private String everMarried;
    @Column(name="WORK_TYPE")
    private String workType;
    @Column(name="RESIDENCE")
    private String residence;
    @Column(name="AVG_GLUCOSE_LEVEL")
    private double averageGlucoseLevel;
    @Column(name="BMI")
    private double bmi;
    @Column(name="SMOKING_STATUS")
    private String smokingStatus;
    @Column(name="STROKE")
    private double stroke;    

    public long getPatientId() {
        return this.patientId;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return this.patientname;
    }

    public void setPatientName(String patientName) {
        this.patientname = patientName;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }    
    
    public int getHyperTension() {
        return this.hyperTension;
    }

    public void setHyperTension(int hyperTension) {
        this.hyperTension = hyperTension;
    }
    
    public int getHeartDisease() {
        return this.heartDisease;
    }

    public void setHeartDisease(int heartDisease) {
        this.heartDisease = heartDisease;
    }    
    
    public String getEverMarried() {
        return this.everMarried;
    }

    public void setEverMarried(String everMarried) {
        this.everMarried = everMarried;
    }    
    
    public String getWorkType() {
        return this.workType;
    }

    public void setWorktype(String worktype) {
        this.workType = worktype;
    }    
    
    public String getResidence() {
        return this.residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }    
        
    public double getAverageGlucoseLevel() {
        return this.averageGlucoseLevel;
    }

    public void setAverageGlucoseLevel(double averageGlucoseLevel) {
        this.averageGlucoseLevel = averageGlucoseLevel;
    }
    
    public double getBMI() {
        return this.bmi;
    }

    public void setBMI(double bmi) {
        this.bmi = bmi;
    }
    
    public String getSmokingStatus() {
        return this.smokingStatus;
    }

    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
    }
    
    public double getStroke() {
        return this.stroke;
    }

    public void setStroke(double stroke) {
        this.stroke = stroke;
    }    
    
    
}

