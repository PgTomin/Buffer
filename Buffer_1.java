package buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;

public class Buffer_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int i = Integer.parseInt(s) + 10;
		
		br.close();
		
		bw.write("입력받은 값 : " + s);
		bw.newLine();
		bw.write("입력받은 값 + 10 : " + i + "\n");
		
		bw.flush();
		bw.close();
	}

}
