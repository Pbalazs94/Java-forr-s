package teszt_package;

public class Task1_Practice {
	
	static void main(String[] args) {
		int n=10;
		double e = euler(n);
		System.out.println(e);
	}
	static double euler(int n) {
		double sum=0;
		for (int i=0;i<n;i++)
		{
			sum +=1 / (double)fact(i);
		}
		return sum;
	}
static int fact(int n)
{
	int f =1;
	for (int i=1;i<n;i++)
	{
		f *=i;
	}
	return f;
}
	
}
