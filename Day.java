public class Day {
    public static String checkDay(String day) {
        String returnDay = "NP";

        // checking for day
        if(day.equals("Sunday") || day.equals("Saturday")) {
            returnDay = "Weekend";
        } else {
            returnDay = "Weekday";
        }

        return returnDay;
    }
}
