package JAVA11;
abstract class Math  //�w�q��H���O
{
	protected int ans;  //��Ʀ���
	public void show()  //�w�qshow���B�z�覡
	{
		System.out.println("ans="+ans);
	}
	public abstract void add(int a, int b);
	public abstract void sub(int a, int b);
	public abstract void mul(int a, int b);
	public abstract void div(int a, int b);
}
class Compute extends Math //�w�q�p��覡
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
