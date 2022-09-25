package lab_06;

public class lab_6_1 {
    /*
        Given input string: "2hrs and 5 minutes"
        Please calculate how many minutes in total
     */
    public static void main(String[] args) {
        String myTime = "2hrs and 5 minutes";
        String[] splitStr = myTime.split("and");
        String hourNumStr = splitStr[0].replaceAll(" ", "").replaceAll("hrs","");
        String minutesNumStr = splitStr[1].replaceAll(" ", "").replaceAll("minutes", "");
        int hours = Integer.parseInt(hourNumStr);
        int minutes = Integer.parseInt(minutesNumStr);
        int total = (hours * 60) + minutes;
        System.out.println("Total minutes is: " + total);
    }
}
