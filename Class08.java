package JAVA11;

interface iAaa //�w�q����
{
	public void show();
	
}
class Cbbb //�����O
{
	public int num = 10;
	
	public void set(int n)
	{
		num = n;
	}
}

class Cccc extends Cbbb implements iAaa //�����O�~�Ӥ��� �l���O�~�Ӥ����O
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