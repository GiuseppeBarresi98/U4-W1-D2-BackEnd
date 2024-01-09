//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String y = "ciao come stai";
        int x = 2021;
        System.out.println(pariDispari(y));
        System.out.println(annoBisestile(x));
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
    public static boolean pariDispari(String stringa){
        if (stringa.length() % 2 == 0){
            return true;
        }
        else return false;
    }

    public static boolean annoBisestile(int anno){
        if(anno % 4 == 0){
            return true;
        }
        else return false;
    }
}