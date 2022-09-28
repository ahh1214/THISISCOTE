import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            list.add(Integer.valueOf(st.nextToken()));
        }

        int answer = 0;
        int count = 0;

        List<Integer> sortedList = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        for (int i = 0; i < M; i++) {
            if (count < K) {
                answer += sortedList.get(0);
                count++;
                continue;
            }
            count = 0;
            answer += sortedList.get(1);
        }

        System.out.println(answer);
    }
}

