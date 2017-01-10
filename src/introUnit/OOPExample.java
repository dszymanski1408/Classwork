/**
 * 
 */
package introUnit;

/**
 * @author Student 6
 * This class is designed to contrast with the
 * ProcuduralExample. It embodies an Object-Oriented
 * approach 
 */
public class OOPExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//construct a student
		Student jillian = new Senior("Jillian Arche", "programmer", "ramen");
		Student jordan = new Student("Jordan Micheal");
		Student jason = new Student("Jason Allen");
		jason.talk();
		jordan.talk();
		jillian.talk();
	}

}
