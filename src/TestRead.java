import java.util.List;

public class TestRead {
	public static void main(String args[]) {
		ClassTwo read = new ClassTwo();
		List<ItemInXml> readConfig = read
				.readConfig("/home/nagabhushan/MyData/WorkSpaces/Eclipse/XMLReaderInJava/src/XMLfileToBeParsed.xml");
		for (ItemInXml item : readConfig) {
			System.out.println(item);
		}
	}
}
