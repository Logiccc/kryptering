import javax.swing.*;

/**
 * Skapad av David Persson 2019-01-11
 * Sprint 1
 * Terminal med argument
 */

/**
 *
 */
public class CMDInput {
    public static void main(String[] args) {
        if (args.length == 0)//ifall inga argument anges i terminalen så printar den ut att det inte angvas några argument
            System.out.println("No Argumentos senior, mi muerto por favor");
        for (int i = 0 ; i < args.length ; i++)
        if (args.length == 1) { //Ifall 1 argument anges
            System.out.println("asi que hablar:" + " " + args[i]);
        }
        if (args.length == 2) { //ifall 2 argument anges, så adderas talen, om argumenten inte är tal så printar terminalen error
            int n = 0;
            for (int i = 0; i < args.length; i++)
                if (args[i].matches("[0-9]+")){
                    n += Integer.parseInt(args[i]);
                }
                else {
                    System.out.println("No cifras, no comprendo! :-(");
                }
                System.out.println(n);
        }
        if (args.length == 3) { //ifall 3 argument anges,
            System.out.println();
        }
        if (args.length >= 4) { //ifall mer än 4 argument anges, så printar terminalen att den inte klarar av fler
            System.out.println("Mi no orkar, mi muerto");
        }
    }
}
