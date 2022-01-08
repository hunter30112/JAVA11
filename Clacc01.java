package JAVA11;
abstract class CShape //定義抽象類別
{
	protected String color;    //資料成員
	public CShape(String str)  //設定形狀的顏色
	{
		color = str;
	}
	public abstract void show(); //抽象函數 在此沒有定義處理方式
}
class CRectangle extends CShape //定義子類別CRectangle
{
	int width, height;
	public CRectangle(int w, int h)
	{
		super("Yellow");
		width = w;
		height = h;
	}
	public void show()  //在此定義show()的處理方式
	{
	System.out.print("color="+color+", ");
	System.out.println("area="+width*height);
	}
}
class CCircle extends CShape //定義子類別CCircle
{
	double radius;
	public CCircle (double r)
	{
		super("Green");
		radius = r;
	}
	public void show()
	{
	System.out.print("color="+color+", ");
	System.out.println("area="+3.14*radius*radius);
	}
}

public class Clacc01 
{
	public static void main(String args[])
	{
		CRectangle rect = new CRectangle(5,10);
		rect.show();
		
		CCircle cir = new CCircle(2.0);
		cir.show();
	}

}
