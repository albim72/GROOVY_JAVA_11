//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static boolean isLeap(int y){
        return (y%400 == 0) || (y%4 == 0 && y%100 != 0);
    }

    static String grade(int points){
        if (points >= 90) return "A";
        if (points >= 80) return "B";
        if (points >= 70) return "C";
        if (points >= 60) return "D";
        //CTRL + D - powielanie linii lub bloku kodu
        return "F";
    }
    public static void main(String[] args) {
        System.out.println("2000 czy przestępny?" + isLeap(2000));
        System.out.println("1900 czy przestępny?" + isLeap(1900));
        System.out.println("85 -> " + grade(85));


    }
}
