//Name : AMAL JOHNSON
//ID : 21263175
public class Tweet01
{
    public static void main(String[] args) {

        final long MILLISECONDS_IN_A_DAY = 24*60*60*1000 ;
        final long SECONDS_IN_AN_HOUR = 60*60 ;
        String tweet11 = "Tweet text is 'Simplicity is a great virtue but it requires";
        String tweet12 = "hard work to achieve it and education to appreciate it.'";
        String tweet13 = tweet11 +  tweet12;

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
        System.out.println(tweet13);
        System.out.println("Tweet length is" +  tweet13.length());
        if (tweet13.contains("#")) {
            System.out.println("Tweet Contains Hashtag.");
        } else {
            System.out.println("Tweet Contains NO Hashtags.");
        }
        System.out.println("******************************");
    }
}
