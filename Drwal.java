import java.util.ArrayList;
import java.util.List;

public class Drwal {

    public static void main(String[] args) {

        var inputStr = args[5];

        int xStart = 0;
        int yStart = 0;
        String kolor;
        int szerokosc;
        int wysokosc;

        if (args.length > 0) {
            try {
                xStart = Integer.parseInt(args[0]);
                yStart = Integer.parseInt(args[1]);
                kolor = args[3];
                szerokosc = Integer.parseInt(args[3]);
                wysokosc = Integer.parseInt(args[4]);
            } catch (NumberFormatException e) {
                System.out.println("Klops");
                System.exit(0);
            }
            var lines = inputStr.split("\n");

            List<String> results = new ArrayList<>();
            boolean counting = false;
            int tmp_xStart = xStart;
            int tmp_yStart = yStart;

            for (String line : lines) {
                int first;
                int last;
                first = line.indexOf("#");
                last = line.lastIndexOf("#");

                if (first != -1 && last != -1 && first != last) {
                    counting = true;

                    char[] tmp = line.toCharArray();
                    for (int i = first; i < last; i++) {
                        if (tmp[i] != '#') {
                            tmp[i] = args[2].charAt(0);
                        }
                    }
                    String newLine = String.valueOf(tmp);
                    results.add(newLine);
                } else {
                    results.add(line);
                }
            }
        }
    }
}