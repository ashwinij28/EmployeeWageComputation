package Employee;

public class EmployeeWage {
    double standardWageRate = 20;
    int standardHours = 8;
    int PartTimeWorkingHours = 8;
    double totalWage;
    public void calculateAttendance(){
        int IS_FULL_TIME = 1;
        double empcheck = Math.floor(Math.random() *10) % 2;
        if (empcheck == IS_FULL_TIME) {
            totalWage = (standardWageRate * standardHours);
            System.out.println("Employee is present & wages=" + totalWage);
        }

        else

            System.out.println("Employee is absent & wages is" + totalWage);
    }
    public void PartTimeEmployeeWages()
    {

        totalWage = (standardWageRate * PartTimeWorkingHours);
        System.out.println("Your Part Time wage is: " + totalWage);
    }
}
