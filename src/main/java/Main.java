import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String sms = in.nextLine();

        System.out.println(skrocSms(sms));
    }

    public static String skrocSms(String sms) {
        if(sms == null) {
            return null;
        }

        String[] slowa = sms.split(" ");
        String result = "";

        for (final String slowo : slowa) {
            if (slowo.length() > 0) {
                result += slowo.toUpperCase().charAt(0);
                result += slowo.toLowerCase().substring(1, slowo.length());
            }
        }
        return result;
    }
}
