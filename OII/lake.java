// NOTE: it is recommended to use this even if you don't understand the following code.

import java.util.*;
import java.io.*;
import java.lang.*;


public class lake {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Locale.setDefault(Locale.US);
        InputStream fin = System.in;
        OutputStream fout = System.out;
        // uncomment the two following lines if you want to read/write from files
        // fin = new FileInputStream("input.txt");
        // fout = new FileOutputStream("output.txt");

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fout));
        BufferedReader reader = new BufferedReader(new InputStreamReader(fin));
        scn = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(next());
        int M = Integer.parseInt(next());

        String[] city = new String[N];
        for (int i = 0; i < N; ++i)
            city[i] = next();

        int P = 0;


        // INSERT YOUR CODE HERE
		for (int i=1; i<N-1; i++)
			for (int j=1; j<M-1; j++)
				P += (city[i-1].charAt(j)=='.' ? 1 : 0) + (city[i].charAt(j-1)=='.' ? 1 : 0) + (city[i+1].charAt(j)=='.' ? 1 : 0) + (city[i].charAt(j+1)=='.' ? 1 : 0);


        writer.write(String.valueOf(P));
        writer.write('\n');

        writer.flush();
        reader.close();
        writer.close();
    }

    static String next() throws IOException {
        while (!scn.hasMoreTokens()) scn = new StringTokenizer(reader.readLine());
        return scn.nextToken();
    }

    static BufferedReader reader;
    static StringTokenizer scn;
}
