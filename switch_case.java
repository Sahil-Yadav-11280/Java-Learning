@SuppressWarnings("unused")
public class switch_case {
    public static void main(String[] args) {
        String day = "MONDAY";

        int dayNumber = switch(day){
            case "MONDAY" -> {
                System.out.println("Beginning of the week.");
                yield 1;
            }
            case "TUESDAY" -> 2;
            case "WEDNESDAY","THURSDAY","FRIDAY" -> 3;
            default -> 0;
        };

        System.out.println("Day number is: " + dayNumber);
              

    }
}
