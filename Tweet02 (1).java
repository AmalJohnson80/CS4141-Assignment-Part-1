//Name : Amal Johnson
//ID : 21263175
public class Tweet02
{
    public static void main(String[] args) {
        // Declaring some NAMED CONSTANTS
        final long MILLISECONDS_IN_A_DAY = 24*60*60*1000 ;
        final long SECONDS_IN_AN_HOUR = 60*60 ;
        String tweet21 = "Tweet text is 'The question of whether #MachinesCanThink is about as";
        String tweet22 = " relevant as the question of whether #SubmarinesCanSwim.'";
        String tweet23 = tweet21 + tweet22;
        // Declaring some variables (strictly speaking "named variables")
        long millisSinceMidnight = 0, secondsSinceMidnight = 0 ;
        long hour = 0, minute = 0, second = 0 ;

        // Take the current time and remove all the time up to midnight last night 
        millisSinceMidnight = System.currentTimeMillis() % MILLISECONDS_IN_A_DAY;
        // Convert the millis to seconds
        secondsSinceMidnight = millisSinceMidnight / 1000;
        // Calculate how many hours are in secondsSinceMidnight
        hour = secondsSinceMidnight / SECONDS_IN_AN_HOUR;
        // Calculate how many minutes are in time NOT INCLUDED in the hours
        minute = (secondsSinceMidnight % SECONDS_IN_AN_HOUR) / 60;
        // Calculate how many seconds are in time NOT INCLUDED in the hours and minutes
        second = secondsSinceMidnight % 60;
        System.out.println("******************************");
        System.out.println("Tweet Analysis");
        System.out.println("==============");
        System.out.printf("Posted at %02d:%02d:%02d\n", hour, minute, second );
        System.out.println("Posted by" +  System.getProperty("user.name"));
        System.out.println(tweet23);
        System.out.println("Tweet length is" +  tweet23.length());
        if (tweet23.contains("#")) {
            System.out.println("Tweet Contains Hashtags.");  
        } else {
            System.out.println("Tweet Contains NO Hashtags.");
        }
        System.out.println("******************************");
    }
}

    