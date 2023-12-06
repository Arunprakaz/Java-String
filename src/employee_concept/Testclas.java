package employee_concept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Testclas {

	
	
	public static class employee{
		Integer id;
		String name;
		String department ;
		
		public employee(Integer id,String name ,String department) {
		
			this.id=id;
			this.name=name;
			this.department =department;
			
		}
		
		
		
	}
	
	
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pr=new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		System.out.println("hai--"+n);
		
	}
}
