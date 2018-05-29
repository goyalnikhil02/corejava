package imutuableclass;

public class TESTOOPS {

	public static void getData(double Data)
	{
		System.out.println("IN STRING");
	}
	/*public static void getData(Integer Data)
	{
		System.out.println("IN INter");
	}*/
	public static void getData(float Data)
	{
		System.out.println("OBJ");
	}
	public static void getData(byte Data)
	{
		System.out.println("byte");
	}
	public static void main(String[] args) {
		getData((byte)1);
	}
	
}
