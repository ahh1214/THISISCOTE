public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			list.add(Integer.valueOf(st.nextToken()));
		}

		Collections.sort(list);

		int target = 1;

		for (int i = 0; i < list.size(); i++) {
			int num = list.get(i);
			if (target < num) {
				break;
			}
			target += num;
		}

		System.out.println(target);
	}
}
