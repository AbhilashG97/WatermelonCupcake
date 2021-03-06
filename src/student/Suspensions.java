package student;

import java.io.Serializable;
import java.util.ArrayList;

public class Suspensions implements Serializable{

    private ArrayList<String> reasonOfSuspensionList;
    private int suspensionCount;

    public Suspensions() {
        reasonOfSuspensionList = new ArrayList<>();
        suspensionCount = 0;
    }

    public ArrayList<String> getReasonOfSuspensionList() {
        return reasonOfSuspensionList;
    }

    public void setReasonOfSuspensionList(String reasonForSuspension) {
        reasonOfSuspensionList.add(reasonForSuspension);
    }

    public int getSuspensionCount() {
        return suspensionCount;
    }

    public void setSuspensionCount(int suspensionCount) {
        this.suspensionCount = suspensionCount;
    }

}
