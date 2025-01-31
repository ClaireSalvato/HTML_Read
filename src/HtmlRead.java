import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class HtmlRead {

    public static void main(String[] args) {
        HtmlRead html = new HtmlRead();
    }

    public HtmlRead() {

        try {
            System.out.println();
            System.out.print("hello \n");
            URL url = new URL("https://en.wikipedia.org/wiki/Portugal");
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(url.openStream())
            );
            String line;
            int c = 1;
            while ( (line = reader.readLine()) != null ) {

                if (line.contains("/wiki/")){
                    int start = line.indexOf("/wiki/")-10;
                    while() {
                        int end = start + 26;
                        String miniline = line.substring(start, end);
                        System.out.println(c + "." + miniline);
                        c++;
                        start = line.indexOf("/wiki/", start + 11);
                    }
                }
                System.out.println(line);
            }
            reader.close();
        } catch(Exception ex) {
            System.out.println(ex);
        }

    }

}
