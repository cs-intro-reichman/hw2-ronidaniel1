public class CalcPi {

    public static void main(String[] args) {
        // קליטת מספר האיברים (N)
        int N = Integer.parseInt(args[0]);
        
        // משתנה שישמור את סכום הטור (מתחיל ב-0)
        double seriesSum = 0.0;
        
	// משתנה שישמור את המכנה הנוכחי בטור 
        int denominator = 1;
        
        // לולאה שרצה כמספר האיברים שנקלט (N)-  חישוב סכום הטור
        for (int i = 0; i < N; i++) {
            
            if (i % 2 == 0) {
                // איבר חיובי: seriesSum = seriesSum + (1.0 / denominator)
                seriesSum += (1.0 / denominator);
            } else {
                // איבר שלילי: seriesSum = seriesSum - (1.0 / denominator)
                seriesSum -= (1.0 / denominator);
            }
            
            // (הגדלת המכנה לקפיצה הבאה בטור)
            denominator += 2;
        }

        // חישוב הקירוב של פאי
        // סכום הטור מתכנס ל-pi/4, לכן pi = seriesSum * 4
        double piApproximation = seriesSum * 4;
        
       
        System.out.println("pi according to Java: " + Math.PI);  

        // הדפסת הכותרת לקירוב
        System.out.println("pi, approximated:     " + piApproximation);
    }
}