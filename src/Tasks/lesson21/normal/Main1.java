package Tasks.lesson21.normal;

public class Main1 {


    public static void main(String[] args) {

        Months currentMonth = Months.AUGUST;


        switch (currentMonth) {
            case JUNE:
            case JULY:
            case AUGUST:
                System.out.println(currentMonth + " is a summer month.");
                break;
            default:
                System.out.println(currentMonth + " is not a summer month.");
                break;
        }
    }
}

