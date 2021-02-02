
public class Person  {
	private String name;
	private int age;
	
	
	public Person(String name, int age) {
		this.name = name;
		this.setAge(age);
	}
	
	
	/*This method returns the age of a Person.  Age is returned as an integer.*/
	public int getAge() {
		return this.age;
	}
	
	/*This method sets the age of a Person.  I will first check to make sure that the age is not negative.
	 * If the new age is negative, then display an error message, do not change the age, and return from the method.
	 */
	public void setAge(int age) {
		//THis line checks the age
		if (age < 0) {
			//Print error message.
			System.out.print("Age cannot be negative. Age value not changed");
			return;
		}
		else {
			this.age = age;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
