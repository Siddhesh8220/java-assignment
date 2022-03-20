// ===============================================
// 2.Implement your own encapsulating classes
// ===============================================


class Encapsulate{
	private String name="Rahul";

	//setter method
	public void setName(String name){
		this.name = name;
		System.out.println("Name changed successfully.");
	}

	// getter method
	public void getName(){
		System.out.println("Current Name: " + this.name);
	}

}

class Question2{
	public static void main(String args[]){
		Encapsulate e = new Encapsulate();
		e.getName();
		e.setName("Siddhesh");
		e.getName();
	}
}