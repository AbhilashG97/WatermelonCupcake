package student;

public class Test {

    /* This is a test class whose only
     * purpose is to test the classes
     * that have been created.
     */

    public static void main(String []args){

        Marks m = new Marks();
        Course c  = new Course("CSE", 10, m);

        m.setFirstInternals(45.0);
        m.setSecondInternals(49.0);
        m.setEndSem(99.00);
        m.setAttendance(2);
        m.setcontEval(11);
        m.getTotalAverage();
        m.getGrade();
        System.out.println(m.toString());
        System.out.println(c.toString());
    }
}