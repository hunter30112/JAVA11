package JAVA11;
abstract class CShape //�w�q��H���O
{
	protected String color;    //��Ʀ���
	public CShape(String str)  //�]�w�Ϊ����C��
	{
		color = str;
	}
	public abstract void show(); //��H��� �b���S���w�q�B�z�覡
}
class CRectangle extends CShape //�w�q�l���OCRectangle
{
	int width, height;
	public CRectangle(int w, int h)
	{
		super("Yellow");
		width = w;
		height = h;
	}
	public void show()  //�b���w�qshow()���B�z�覡
	{
	System.out.print("color="+color+", ");
	System.out.println("area="+width*height);
	}
}
class CCircle extends CShape //�w�q�l���OCCircle
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
