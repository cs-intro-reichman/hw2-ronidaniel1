public class Cheers {

     
    // כדי לבדוק את רשימת האותיות המשתמשות ב-"an" במקום "a" נשתמש במחרוזת שקל לבדוק מולה באמצעות indexOf()
    private static final String AN_LETTERS = "AEF HILMN ORSX";

    // פונקציה לבדיקה אם יש להשתמש ב-"an" עבור תו נתון
    public static String getAOrAn(char ch) {
        // המרת התו לאות גדולה (למקרה שלא הומר קודם)
        char upperCaseCh = Character.toUpperCase(ch);
        
        // בדיקה: אם התו נמצא במחרוזת AN_LETTERS, מחזירים "an", אחרת "a"
        if (AN_LETTERS.indexOf(upperCaseCh) != -1) {
            return "an";
        } else {
            return "a ";
        }
    }
    public static void main(String[] args) {
  
        //  קליטת מחרוזת הקלט והמרתה מיידית לאותיות גדולות כנדרש
        String cheerString = args[0].toUpperCase();
        // קליטת מספר החזרות
        int repeats = Integer.parseInt(args[1]);
        
        // 2. הדפסת שורות "Give me..." (לולאה ראשונה)
        
        // לולאה העוברת על כל תו במחרוזת הקלט
        for (int i = 0; i < cheerString.length(); i++) {
            char currentLetter = cheerString.charAt(i);
            
            // קריאה לפונקציה כדי לקבל "a" או "an"
            String aOrAn = getAOrAn(currentLetter);
            
            
            System.out.print("Give me " + aOrAn + " " + currentLetter + ": ");
            
            
            System.out.println(currentLetter + "!");
        }
        
        System.out.println("What does that spell?");
        
        String finalCheer = cheerString + "!!!";
        
        // לולאה שנייה להדפסת הצעקה מספר הפעמים הנדרש
        for (int j = 0; j < repeats; j++) {
            System.out.println(finalCheer);
        }
    }
}