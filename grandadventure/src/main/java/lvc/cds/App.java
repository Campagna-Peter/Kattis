package lvc.cds;

import java.io.*;
import java.util.*;

public final class App {

    public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		int n = Integer.parseInt(in.readLine());
		while(n-- > 0) {
			String line = in.readLine().replace(".", "");
			Stack<Character> stack = new Stack<Character>();
			boolean status = true;
			for(char action : line.toCharArray()) {
				if(!status){
					break;
				} 
				if(action == '$' || action == '|' || action == '*'){
					stack.push(action);
				}
				else {
					if(stack.isEmpty()) {
						out.println("NO");
						status = false;
						break;
					}
					char top = stack.pop();
					if(action == 'b' && top != '$') {
						out.println("NO");
						status = false;
					}
					if(action == 't' && top != '|') {
						out.println("NO");
						status = false;
					}
					if(action == 'j' && top != '*') {
						out.println("NO");
						status = false;
					}
				}
			}
			if(!stack.isEmpty() && status) {
				out.println("NO");
				status = false;
			}
			if(status) {
				out.println("YES");
			}
		}
		out.close();
	}
}