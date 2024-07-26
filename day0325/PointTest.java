package day0325;
class Point{
	int x;
	int y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
}
class Point3d extends Point{
	int z;
	Point3d (int x, int y, int z) {
		super(x,y);//Point(int, int)//무조건 super 생성자가 한번은 수행된다. 
		this.x = x;
		this.y = y;
		this.z = z;
	
	}
	@Override
	public String toString() {
		return "Point3d [z=" + z + ", x=" + x + ", y=" + y + ", toString()=" + super.toString() + "]";
	}
}
public class PointTest {
	public static void main(String[] args) {
	Point3d p3d = new Point3d(1,2,3);
	System.out.println(p3d);
	
	}

}
