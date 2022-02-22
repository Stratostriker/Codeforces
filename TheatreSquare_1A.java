import java.io.*;
import java.util.StringTokenizer;

public class TheatreSquare_1A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double n = Double.parseDouble(st.nextToken());
        double m = Double.parseDouble(st.nextToken());
        double a = Double.parseDouble(st.nextToken());
        int rows = (int) Math.ceil(n/a);
        int columns = (int) Math.ceil(m/a);
        pw.println((long)rows*(long)columns);
        pw.close();
    }
}
