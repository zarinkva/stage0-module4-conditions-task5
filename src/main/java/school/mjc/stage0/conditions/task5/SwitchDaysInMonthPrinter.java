package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {
        int days=0;
        switch (month) {
            case 2:
                days = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 12:
                days = 31;
                break;

            default:
                System.out.println("wrong number!");
                break;

        }
        System.out.println(days);
    }

    public static void main(String[] args) {
        SwitchDaysInMonthPrinter daysInMonthPrinter=new SwitchDaysInMonthPrinter();
        daysInMonthPrinter.amountOfDays(11);
        daysInMonthPrinter.amountOfDays(4);
        daysInMonthPrinter.amountOfDays(2);
        daysInMonthPrinter.amountOfDays(1);
        daysInMonthPrinter.amountOfDays(100);
    }
}
