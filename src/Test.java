class A
{
	static int a=10;
	int z=200;
}
class B extends A
{
	final int k=500;
	static int b=a+10;
	void print()
	{
		System.out.println("d in the Method :"+z);
		System.out.println("After Using Super Keyword");
		System.out.println("d in the Method :"+super.z);
		
	}
}
public class Test extends B
{
	static int c=10+b;
	static int d=10+b+a;
	int e=200;
	public static void main(String args[])
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		B obj = new B();
		obj.print();
		//Dog f=new Dog(); 
		Student6 s1 = new Student6(111,"Karan");  
	    Student6 s2 = new Student6(s1);  
	    s1.display();  
	    s2.display();
	}
}
class Animal
{  
	Animal()
	{
		System.out.println("animal is created");}  
}  
class Dog extends Animal{  
	Dog()
	{  
		super();  
		System.out.println("dog is created");  
	}  
}
class Student6{  
    int id;  
    String name;  
    //constructor to initialize integer and string  
    Student6(int i,String n){  
    id = i;  
    name = n;  
    }  
    //constructor to initialize another object  
    Student6(Student6 s){  
    id = s.id;  
    name =s.name;  
    }  
    void display(){System.out.println(id+" "+name);}  
}  
class key
{
	private key()
	{
		
	}
}
