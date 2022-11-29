import java.util.Scanner;

public class Main {
    public static void dnfncnf(){
        var s = new Scanner(System.in);
        String[] variableNames = s.nextLine().split(" ");
        int numVar = variableNames.length-1;
        int numLines = (int) Math.pow(2,numVar);
        s.nextLine(); //skip ------
        int[] vars;
        String dnfOutput = "DNF: ";
        String cnfOutput = "CNF: ";
        boolean firstTime = true; //+ operator function

        for(int i=0;i<numLines;i++){
            boolean firstTime1 = true;
            vars = new int[numVar];
            for(int j=0; j < numVar; j++) {
                vars[j] = s.nextInt();
            }
            if(s.nextInt() == 1){ //dnf function
                if(!firstTime){
                    dnfOutput += "+";
                }
                for(int j=0; j<numVar; j++){
                    dnfOutput += variableNames[j]; //print all the value
                    if(vars[j] == 0) {
                        dnfOutput += "'";
                    }
                }
                firstTime = false; // set as false after firstline
            }
            else{ //CNF funtion
                cnfOutput += "(";
                for(int j=0; j<numVar; j++){
                    if(!firstTime1){
                        cnfOutput += "+";
                    }
                    cnfOutput += variableNames[j];
                    firstTime1 =false;
                    if(vars[j]==1){
                        cnfOutput += "'";
                    }
                }
                cnfOutput += ")";

            }
        }
        System.out.println(dnfOutput);
        System.out.println(cnfOutput);
    }

    public static void main(String[] args) {
        dnfncnf();
    }
}