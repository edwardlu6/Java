import java.io.*;
public class I_O_Reading {

	public static void main(String[] args) {
		String fileName = "text.txt";
		
		
		String line = null;
		
		try {
			
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			while((line = bufferedReader.readLine())!=null)
			{
				
				System.out.println(line);
				
			}
			
			bufferedReader.close();
		}
		catch(FileNotFoundException ex){
			
			System.out.println("file not found");
		}
		catch(IOException ex)
		{
			
			System.out.println("IO Exception");
			ex.printStackTrace();
			
		}

	}

}
