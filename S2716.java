import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2716 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();

    public static void main(String args[]) throws IOException {
        // solution_2716_jh();
        solution();
    }

    public static void solution() throws IOException {
        int N = Integer.parseInt(br.readLine());
        String result = "";

        while (N-- > 0) {
            String inputLine = br.readLine();
            int depth = 0;

            depth = recursiveDelete(inputLine, depth);
            result += (int)Math.pow(2, depth) + "\n";
        }
        System.out.print(result);
    }
    
    public static int recursiveDelete(String inputLine, int depth) {
        int currentIndex = 0;
        int foundIndex = 0;

        if (inputLine.indexOf("[]") == -1) return depth;

        while (currentIndex < inputLine.length()) {
            currentIndex = foundIndex = inputLine.indexOf("[]", currentIndex);
            if (foundIndex == -1) break;
            inputLine = inputLine.substring(0, foundIndex) + inputLine.substring(foundIndex + 2);
        }
        
        return recursiveDelete(inputLine, depth + 1);
    }

    public static void solution_2716_jh() throws IOException {
        int inputCount = Integer.parseInt(br.readLine());
        String output = "";

        while (inputCount-- > 0) {
            String inputLine = br.readLine();
            int depth = 0;

            depth = recursiveProcess(inputLine, depth);
            output += (int)Math.pow(2, depth) + "\n";
        }

        System.out.print(output.toString());
    }

    public static int recursiveProcess(String line, int depth) {
        int curIndex = 0;
        int foundIndex = 0;

        if (line.indexOf("[]") == -1) return depth;

        while (curIndex < line.length()) {
            curIndex = foundIndex = line.indexOf("[]", curIndex);
            if (foundIndex == -1) break;
            line = line.substring(0, foundIndex) + line.substring(foundIndex + 2);
        }

        return recursiveProcess(line, depth + 1);
    }
}
