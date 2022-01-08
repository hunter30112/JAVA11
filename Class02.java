package JAVA11;
abstract class Math  //定義抽象類別
{
	protected int ans;  //資料成員
	public void show()  //定義show的處理方式
	{
		System.out.println("ans="+ans);
	}
	public abstract void add(int a, int b);
	public abstract void sub(int a, int b);
	public abstract void mul(int a, int b);
	public abstract void div(int a, int b);
}
class Compute extends Math //定義計算方式
{
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
}

public class Class02 {
	public static void main(String args[])
	{
		Compute cmp = new Compute();
		cmp.mul(3,5);
		cmp.show();
	}

}
