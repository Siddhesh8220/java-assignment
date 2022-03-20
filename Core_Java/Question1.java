abstract class AbstractClass{
	public abstract void message();

	public void messageabst(){
		System.out.println("Hello from non abstract method in abstract class");
	}
}

interface InterfaceDemo{
	public void greetings(String name);
}


class SomeClass extends AbstractClass implements InterfaceDemo{

	@Override
	public void greetings(String name) {
		System.out.println("hello! "+name);
	}

	public void message(){
		System.out.println("implementing abstract method");
		messageabst();
	}
}

class Question1{
	public static void main(String args[])
	{
		SomeClass s = new SomeClass();
		s.greetings("Siddhesh");
		s.message();
	}	
}
