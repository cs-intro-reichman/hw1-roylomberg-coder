// Represents the hh:mm time format using an AM/PM format.
public class TimeFormat {
    public static void main(String[] args) {
        // Extract hours and minutes from the input string "hh:mm"
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

        String suffix;

        // Determine AM or PM and adjust hours for 12-hour format
        if (hours == 0) {          // midnight
            suffix = "AM";
        } else if (hours < 12) {   // morning
            suffix = "AM";
        } else if (hours == 12) {  // noon
            suffix = "PM";
        } else {                   // after noon
            hours -= 12;
            suffix = "PM";
        }

        // Format and print the time
        if (minutes < 10) {
            System.out.println(hours + ":0" + minutes + " " + suffix);
        } else {
            System.out.println(hours + ":" + minutes + " " + suffix);
        }
    }
}