import java.util.*;
public class FantasyKingdomKiosk{
    public static String checkRideEligiblity(int age){
        if(age<15 || age>60){
            return "Not Allowed";
        }
        else
        return "Allowed";
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the age of person :  ");
        int age = sc.nextInt();
        String result  = checkRideEligiblity(age);
         System.out.println(result);
    }
} 