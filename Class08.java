package JAVA11;

interface iAaa //定義介面
{
	public void show();
	
}
class Cbbb //父類別
{
	public int num = 10;
	
	public void set(int n)
	{
		num = n;
	}
}

class Cccc extends Cbbb implements iAaa //父類別繼承介面 子類別繼承父類別
{
	public void show()
	{
		System.out.println("num="+num);
	}
}
public class Class08 {
	public static void main(String args[])
	{
		Cccc cc = new Cccc();
		cc.set(5);
		cc.show();
	}

}
