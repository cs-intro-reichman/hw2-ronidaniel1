public class TestRandom {

    public static void main(String[] args) {
        //  קליטת הקלט N
        // N הוא מספר הפעמים שיש לקרוא ל-Math.random()
        int N = Integer.parseInt(args[0]);

        // הגדרת מונים לספירת התוצאות
        int greaterThanHalf = 0; // מונה לתוצאות > 0.5
        int lessThanOrEqualToHalf = 0; // מונה לתוצאות <= 0.5

        //   ביצוע הבדיקה בתוך לולאה שרצה N פעמים
        for (int i = 0; i < N; i++) {
            double randomValue = Math.random();

            if (randomValue > 0.5) {
                greaterThanHalf++;
            } else { 
                lessThanOrEqualToHalf++;
            }
        }
        
        // הדפסת המונים
        System.out.println(">0.5: " + greaterThanHalf + " times");
        System.out.println("<=0.5: " + lessThanOrEqualToHalf + " times");

       //  הדפסת היחס תוך טיפול במקרה הקצה
        System.out.println("Ratio:");

        // אם אחד המונים שווה לאפס, אסור לחלק, לכן לא מדפיסים את ערך היחס.
        // יש לבדוק האם המונה של המכנה (lessThanOrEqualToHalf) או המונה (greaterThanHalf) שווה לאפס.
       
        if (greaterThanHalf == 0 || lessThanOrEqualToHalf == 0) {
         
        } else {
            // (המרה ל-double וחישוב היחס כדי לקבל תוצאה מדוייקת)
            double ratio = (double) greaterThanHalf / lessThanOrEqualToHalf;
            System.out.println(ratio);
        }
    }
}
