
public class PassByValExample {

/*
 * So as we know everything in Java is Pass by value 
 * but there is a huge confusion when we pass Objects
 * Do Objects gets passed as value or reference.
 * Well the objects are never passed rather the object handler is passed as a value.
 * So when we change some property of the Object in the method it stays on. 
 * Below example displays the issue at hand
 * 
 * Anhad S Bhasin
 * 	
 */
	class Car{
		String name;
		
		Car(String name)
		{
			this.name = name; 
		}
	}
	
	public static void main(String args[])
	{
		int a = 1;
		String string = "Anhad";
		int[] array = {5,1,2,6,2};
		PassByValExample passbyval = new PassByValExample();
		Car car = passbyval.new Car("BMW");
		System.out.println("Before******************************");
		System.out.println("a = " + a);
		System.out.println("string = " + string);
		for(int i = 0; i < array.length; ++i){System.out.print(array[i] + " ");}
		System.out.println();
		System.out.println("CarObjectName = " + car.name);
		System.out.println("************************************");
		
		changeInt(a);
		changeString(string);
		changeArray(array);
		changeObject(car);
		
		System.out.println("After*******************************");
		System.out.println("a = " + a);
		System.out.println("string = " + string);
		for(int i = 0; i < array.length; ++i){System.out.print(array[i] + " ");}
		System.out.println();
		System.out.println("CarObjectName = " + car.name);
		System.out.println("************************************");
	}
	public static void changeInt(int i)
	{
		i = 10;
	}
	public static void changeString(String string)
	{
		string = "ChangedString";
	}
	public static void changeArray(int[] array)
	{
		array[0] = 10000;
	}
	public static void changeObject(Car car)
	{
		car.name = "BMWchangedToAudi";
	}
	
	
}
