package Program;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Main {

    public static String md5(String input) {
        String md5 = null;
        if(null == input) return null;
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            digest.update(input.getBytes(), 0, input.length());
            md5 = new BigInteger(1, digest.digest()).toString(16);
        }
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return md5;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MD5 hash values: ");
        System.out.print("Enter first value : ");
        String s1 = sc.next();
        System.out.print("Enter Second value : ");
        String s2 = sc.next();
        System.out.println(s1 + " - " + md5(s1));
        System.out.println(s2 + " - " + md5(s2));
    }
}
