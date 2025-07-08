public class VariableExamples {
	static int staticCounter = 0; // static counter
	
	int instanceCounter = 0; // instance counter

	public void count() {
		int localCounter = 0; // local variable
		localCounter++;
		instanceCounter++;
		staticCounter++;

		System.out.println("Local: " + localCounter);
		System.out.println("Instance: " + instanceCounter);
		System.out.println("Static: " + staticCounter);
	}

	public static void main(String[] args) {
		VariableExamples obj1 = new VariableExamples();
		VariableExamples obj2 = new VariableExamples();

		obj1.count();
		System.out.println("------------");
		obj2.count();
	}
}