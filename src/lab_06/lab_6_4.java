package lab_06;

public class lab_6_4 {
    /*
        String url = "https://google.com";
        Check http OR https; domain name, .com OR .net
     */
    public static void main(String[] args) {
        String url = "https://google.com";
        String protocol = url.substring(0, 5);
        if (protocol.equals("https")) {
            System.out.println("Protocol is https");
        } else {
            System.out.println("Protocol is http");
        }
        String domain = url.substring(8);
        System.out.println("Domain is " + domain);
        String topLevelDomain = url.substring(14);
        if (topLevelDomain.equals(".com")) {
            System.out.println("Top-level domain is .COM");
        } else {
            System.out.println("Top-level domain is .NET");
        }
    }

}

