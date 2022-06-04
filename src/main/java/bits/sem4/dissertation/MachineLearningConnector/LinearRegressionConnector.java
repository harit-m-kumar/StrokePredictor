package bits.sem4.dissertation.MachineLearningConnector;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import bits.sem4.dissertation.Utils.GenderUtil;
import bits.sem4.dissertation.Utils.MarriedUtil;
import bits.sem4.dissertation.Utils.ResidenceUtil;
import bits.sem4.dissertation.Utils.SmokeUtil;
import bits.sem4.dissertation.Utils.WorkTypeUtil;
import bits.sem4.dissertation.data.entity.PatientsForStrokeCheck;


public class LinearRegressionConnector {
    static Thread sent;
    static Thread receive;
    static Socket socket;
    static String recievedPrediction;

    public static String sendPatientDataAndRecievePrediction(PatientsForStrokeCheck patientForStrokeCheck){
            try {
                socket = new Socket("localhost",9999);
            } catch (UnknownHostException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            sent = new Thread(new Runnable() {

                @Override
                public void run() {
                    try {
                        BufferedReader stdIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
//                        while(true){
//                                out.print("Patient 2 "+"\r\n");
                        		double inVals[] = {1.0, 29.0, 0.0, 0.0, 1.0, 1.0, 1.0, 61.13, 26.0, 1.0};
                        		String inputValues = "1.0|29.0|0.0|0.0|1.0|1.0|1.0|61.13|26.0|1.0";
                        		
                                GenderUtil gender = GenderUtil.valueOf(patientForStrokeCheck.getGender());
                                MarriedUtil maried = MarriedUtil.valueOf(patientForStrokeCheck.getEverMarried());
                                WorkTypeUtil workType = WorkTypeUtil.valueOf(patientForStrokeCheck.getWorkType());
                                ResidenceUtil residenceUtil = ResidenceUtil.valueOf(patientForStrokeCheck.getResidence());
                                SmokeUtil smokeUtil = SmokeUtil.valueOf(patientForStrokeCheck.getSmokingStatus());
                                String s = patientForStrokeCheck.getGender();
                                
                                String inputValues2 = "";
                                inputValues2 = inputValues2 + gender.getGenderCode()+ "|";
                                inputValues2 = inputValues2 + patientForStrokeCheck.getAge()+ "|";
                                inputValues2 = inputValues2 + patientForStrokeCheck.getHyperTension()+ "|";
                                inputValues2 = inputValues2 + patientForStrokeCheck.getHeartDisease()+ "|";
                                inputValues2 = inputValues2 + maried.getMarriedCode() + "|";
                                inputValues2 = inputValues2 + workType.getWorkTypeCode() + "|";
                                inputValues2 = inputValues2 + residenceUtil.getResidenceTypeCode() + "|";
                                inputValues2 = inputValues2 + patientForStrokeCheck.getAverageGlucoseLevel()+ "|";
                                inputValues2 = inputValues2 + patientForStrokeCheck.getBMI()+ "|";
                                inputValues2 = inputValues2 + smokeUtil.getSmokeCode();
                        		
                        		out.print(inputValues2);
                                out.flush();
                                System.out.println("Patient Details sent");
                                
                            	System.out.println("Trying to read...");
                                String in = stdIn.readLine();
                                System.out.println(in);
                                recievedPrediction = in;
                                

//                            }

                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }


                }
            });
        sent.start();
        try {
            sent.join();
            System.out.println("Got Value :" + recievedPrediction);
            return recievedPrediction;
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return recievedPrediction;
    }

}
