package JAVA11;

interface Math //�w�q����
{
	public void show();  //�w�qshow���B�z�覡

	public abstract void add(int a, int b);
	public abstract void sub(int a, int b);
	public abstract void mul(int a, int b);
	public abstract void div(int a, int b);
}
class Compute implements Math //��������@
{
	public int ans;
	public void add(int a, int b)
	{
		ans = a+b;
	}
	public void sub(int a, int b)
	{
		ans = a-b;
	}
	public void mul(int a, int b)
	{
		ans = a*b;
	}
	public void div(int a, int b)
	{
		ans = a/b;
	}
	public void show() {
		System.out.println("ans="+ans);
		
	}
}

public class Class05 {
	public static void main(String args[])
	{
		Compute cmp = new Compute();
		cmp.mul(3,5);
		cmp.show();
	}

}