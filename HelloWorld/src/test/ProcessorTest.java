package test;

public class ProcessorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Processor<String> process = (str) -> "Hello " + str;
		process.log("강호동");
		System.out.println(process.process("강호동"));
	}

}
