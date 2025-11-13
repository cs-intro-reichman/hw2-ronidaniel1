public class TimeCalc {

    public static void main(String[] args) {
       
        String startTimeStr = args[0];
       int minutesToAdd = Integer.parseInt(args[1]);

        String hhStr = startTimeStr.substring(0, 2);  
        String mmStr = startTimeStr.substring(3, 5);  

        // המרה לערכים שלמים (int)
        int startHours = Integer.parseInt(hhStr);
        int startMinutes = Integer.parseInt(mmStr);

        //  חישוב סך הדקות הכולל -המרת זמן ההתחלה לדקות והוספת הדקות הנוספות
            
        int totalMinutes = (startHours * 60) + startMinutes + minutesToAdd;

         //  חישוב הזמן החדש בפורמט 24 שעות
        
        // חישוב סך השעות שעברו (חילוק שלם)
        int totalHours = totalMinutes / 60;
        // חישוב השעה החדשה 
        int newHours = totalHours % 24;
        // חישוב הדקה החדשה
        int newMinutes = totalMinutes % 60; 
        
        // עיצוב השעות: אם קטן מ-10, מוסיפים "0".
        String formattedHours;
        if (newHours < 10) {
            formattedHours = "0" + newHours;
        } else {
            formattedHours = "" + newHours; 
        }

        // עיצוב הדקות: אם קטן מ-10, מוסיפים "0" .
        String formattedMinutes;
        if (newMinutes < 10) {
            formattedMinutes = "0" + newMinutes;
        } else {
            formattedMinutes = "" + newMinutes;
        }
        
        // הדפסת הפלט הסופי בפורמט hh:mm 
        System.out.println(formattedHours + ":" + formattedMinutes);
    }
}