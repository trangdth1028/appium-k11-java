package lab_06;

public class lab_6_3 {
    /*
        String myStr = "100 minutes";
        NOT using REGEX, extract digit character from that String
        Expected output: "100".
        EX: "12345nabc678" -> "12345678"
     */
    public static void main(String[] args) {
        String myFirstStr = "100 minutes";
        String mySecondStr = "12345nabc678";
        char[] charFirstArr = myFirstStr.toCharArray();
        char[] charSecondArr = mySecondStr.toCharArray();
        String myFirstInt = "";
        String mySecondInt = "";
        for (char character : charFirstArr) {
            if (Character.isDigit(character)) {
                System.out.println("The first result is: " + myFirstInt.concat(String.valueOf(character)));
            }
        }
        for (char character1 : charSecondArr) {
            if (Character.isDigit(character1)) {
                System.out.println("The second result is: " + mySecondInt.concat(String.valueOf(character1)));
            }
        }
    }
}
