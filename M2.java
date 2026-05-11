class Even
{
	main()
{
List<Integer> obj=Arrays.asList(1,2,35,56,7);

obj.stream().filter(x->x%2==0)
.toList();



}


System.out.println("wrote this statemet in ganga branch now i merge to master");

public class Fibonacci {
    public static void main(String[] args) {

        int n = 10; // number of terms
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }
    }
}
