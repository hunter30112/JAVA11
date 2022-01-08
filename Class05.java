package JAVA11;

interface Math //定義介面
{
	public void show();  //定義show的處理方式

	public abstract void add(int a, int b);
	public abstract void sub(int a, int b);
	public abstract void mul(int a, int b);
	public abstract void div(int a, int b);
}
class Compute implements Math //介面的實作
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
