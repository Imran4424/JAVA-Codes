import java.util.Scanner;
import java.io.*;

class InputToFile{
	public static void main(String[] args)throws IOException{
		Scanner cin = new Scanner(System.in);

		System.out.println("Enter the text");
		String text;

		text = cin.nextLine();

		FileWriter out = null;
		BufferedWriter writer = null;

		try{
			out = new FileWriter("output.txt");
			writer = new BufferedWriter(out);
			writer.write(text);
			writer.newLine();
			writer.close();

			System.out.println("File is saved");
		}
		finally
		{
			if(out != null)
			{
				out.close();
			}
		}



	}
}