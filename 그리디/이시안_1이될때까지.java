public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    int count = 0;

    while (N != 1) {
      count++;
      if (N % K == 0) {
        N /= K;
        continue;
      }
      N--;
    }
    System.out.println(count);
  }
}
