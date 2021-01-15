package TesteosUdemy;

public class SecondsToHoursCalculator {

    public static String getDuration(int minutes, int seconds) {

        if(minutes >= 0 && seconds >= 0 && seconds <= 59) {

            int remainingMinutes = minutes % 60;
            int hours = (minutes - remainingMinutes) / 60;

            String hr = hours < 10 ? "0"+ hours + "h - " : hours + "h - " ;
            String min = remainingMinutes < 10 ? "0"+ remainingMinutes + "m - " : remainingMinutes + "m - ";
            String sec = seconds < 10 ? "0"+ seconds + "s" : seconds + "s" ;

            return hr + min + sec;

        } else {
            return "invalid parameters";
        }

    }

    public static String getDuration( int seconds) {

        if (seconds >=0) {

            int remainingSeconds = seconds % 60;
            int minutes = (seconds - remainingSeconds) / 60;
            return getDuration(minutes, remainingSeconds);

        } else {
            return "Invalid parameters";
        }

    }



    public static void main(String[] args) {

        System.out.println(getDuration(183, 45));
        System.out.println(getDuration(11025));

    }
}
