package nonDivisible;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Driver {
	public static void main (String[] args) throws IOException {
		Path inputFolder = Paths.get(".\\input");
		Files.list(inputFolder).forEach(e -> drive(e));
	}

	private static void drive(Path path) {
		int result = 0;
		try(BufferedReader reader = new BufferedReader(new FileReader(path.toFile()))) {
			int k = Integer.parseInt(reader.readLine().split(" ")[1]);
			int[] set = Stream.of(reader.readLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray(); 
			result = test(set, k);
			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static int test(int[] set, int k) {
		int nMax= 0;
		for(int i = 0; i < set.length; i++) {
			if (testRec(set, k, i, 0))
				nMax++;
		}
		return nMax;
	}

	private static boolean testRec(int[] set, int k, int i, int j) {
		return false;
	}

}
