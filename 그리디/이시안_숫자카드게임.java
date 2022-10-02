import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      int min = Math.min(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
      list.add(Math.min(min, Integer.parseInt(st.nextToken())));
    }

    Optional<Integer> first = list.stream().sorted(Comparator.reverseOrder())
            .findFirst();

    System.out.println(first.get());
  }
}
