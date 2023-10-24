package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        switch (year % 4) {
            default:
                System.out.println("not leap");
                break;
            case 0:
                switch (year % 100) {
                    default:
                        System.out.println("leap");
                        break;
                    case 0:
                        switch (year % 400) {
                            default:
                                System.out.println("not leap");
                                break;
                            case 0:
                                System.out.println("leap");
                                break;
                        }
                        break;
                }
                break;
        }
    }
}
