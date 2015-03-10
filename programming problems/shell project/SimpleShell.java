import java.io.*;

public class SimpleShell
{
	public static void main(String[] args) throws java.io.IOException {
		String commandLine;
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer output = new StringBuffer();
		// we break out with <control><C>
		while (true) {
			// read what they entered
			System.out.print("jsh>");
			commandLine = console.readLine();

			// if they entered a return, just loop again
			if (commandLine.equals("")) 
				continue;
			try {

			Process p = Runtime.getRuntime().exec(commandLine);
			p.waitFor();
			
			} catch(InterruptedException e) {System.out.println(e);}
			
			
 String line = "";
                                                while ((line = console.readLine())!= null) {
													                                                                           output.append(line + "\n");
																														                                                                                       }
										             System.out.println(output);
											 		 /** 
			  The steps are:
			  (1) parse the input to obtain the command
			      and any parameters
			  (2) create a ProcessBuilder object
			  (3) start the process
			  (4) obtain the output stream
			  (5) output the contents returned by the command
			 */ 
	 	}
	}
}
