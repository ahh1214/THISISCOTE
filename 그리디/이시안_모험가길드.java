import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Integer> list = new ArrayList<>();

    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    while (st.hasMoreTokens()) {
      list.add(Integer.valueOf(st.nextToken()));
    }

    List<Integer> collect = list.stream().sorted()
            .collect(Collectors.toList());

    int group = 0;
    int count = 0;

    for (Integer fear : collect) {
      count++;
      if (count >= fear) {
        group++;
        count = 0;
      }
    }

    System.out.println(group);
  }
}

