public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int result = 0;

        for (char c : str.toCharArray()) {
            int value = Character.getNumericValue(c);
            if (value == 0 || result == 0) {
                result += value;
                continue;
            }
          
            result *= value;
        }

        System.out.println(result);
    }
}
