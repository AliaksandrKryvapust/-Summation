public class Source {
    public static void main(String[] args) {
        int a = 8;
        System.out.println(summation(a)==36);
    }
    public static int summation(int n) {
        int res=0;
        for (int i = 1; i <= n; i++) {
          res+=i;
        }
        return res; //IntStream.range(1, n+1).sum();
    }
}
