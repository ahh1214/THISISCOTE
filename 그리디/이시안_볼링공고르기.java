public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[11];
		int result = 0;

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			arr[num] += 1;
		}

		for (int i = 1; i <= M; i++) {
			N -= arr[i];
			result += arr[i] * N;
		}

		System.out.println(result);
	}
}
