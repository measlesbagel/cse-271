import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Tester {
	static HashMap<Integer, Student> students = new HashMap<>();

	public static void main(String[] args) {
		loadStudents("HW_05_Data.txt");
		printReport();
	}

	private static void printReport() {
		System.out.println(students.get(566));

	}

	private static void loadStudents(String fileName) {
		Scanner fin = null;

		try {
			fin = new Scanner(new File(fileName));
			fin.nextLine();

			while (fin.hasNextLine()) {
				Student s = new Student(fin);
				students.put(s.getId(), s);
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				fin.close();
			} catch (Exception e) {
			}

		}
	}

}
