class Even
{
	main()
{
List<Integer> obj=Arrays.asList(1,2,35,56,7);

obj.stream().filter(x->x%2==0)
.toList();



}