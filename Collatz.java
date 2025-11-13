public class Collatz {

    public static void main(String[] args) {
        
        
        // קליטת ה-Seed הגבוה ביותר (N)
        int N = Integer.parseInt(args[0]);
        // קליטת מצב ההצגה ("v" או "c")
        String mode = args[1];

        // בדיקת שוויון מחרוזות באמצעות .equals() כנדרש במטלה
        boolean isVerbose = mode.equals("v");

        //  לולאה חיצונית: מעבר על כל seeds
        
        // לולאה שרצה מ-seed=1 עד seed=N
        for (int seed = 1; seed <= N; seed++) {
            
            // המשתנה הנוכחי ברצף. משתמשים ב-long כדי למנוע גלישת מספרים (Overflow),
            // שעלולה להתרחש ברצפי קולץ ארוכים מאוד.
            long currentNum = seed;
            int steps = 1; // מונה הצעדים להגעה ל-1

            // אם המצב הוא "v" (מפורט), מדפיסים את ערך ה-seed בתור הראשון ברצף
            if (isVerbose) {
                // מדפיס את ה-seed הנוכחי, ואחריו רווח, ללא ירידת שורה
                System.out.print(seed);
                if (seed != 1) {
                    System.out.print(" ");
                }
            }
            if (isVerbose && seed == 1) {
                System.out.print(" ");
            }

            //לולאה פנימית: יצירת רצף הברד
            long oneChecker = 0; // הגדרתי משתנה שלא תלוי מיד ב-currentNum להיות האחד שעליו נבדוק שוויון ל-1

            // הלולאה רצה כל עוד המספר הנוכחי לא הגיע ל-1
            while (oneChecker != 1) {
                
                // בדיקת זוגיות/אי-זוגיות
                if (currentNum % 2 == 0) {
                    // זוגי: מחלקים ב-2
                    currentNum = currentNum / 2;
                } else {
                    // אי-זוגי: מכפילים ב-3 ומוסיפים 1
                    currentNum = (currentNum * 3) + 1;
                }
                oneChecker = currentNum;

                // הגדלת מונה הצעדים
                steps++;

                // אם המצב הוא "v", מדפיסים את המספר שחושב
                if (isVerbose) {
                    // מדפיסים את המספר שחושב, ואחריו רווח (אם זה לא 1)
                    System.out.print(currentNum);
                    System.out.print(" ");
                }
            }
            
            //  הדפסת הסיכום של הרצף (במצב "v" בלבד)
            if (isVerbose) {
                // הדפסת מספר הצעדים בסוגריים, ואז ירידת שורה
                System.out.println(" (" + steps + ")");
            }
        } // סוף הלולאה החיצונית

        //  הדפסת שורת הסיכום הכללית - שורה זו מודפסת בשני המצבים ("v" ו-"c")
        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}