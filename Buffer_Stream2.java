package buffer;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Buffer_stream2 {

	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
		InputStreamReader reader = new InputStreamReader(in);
		
		OutputStream out = System.out;
		OutputStreamWriter writer = new OutputStreamWriter(out);
		
		char group[] = new char[2];
		reader.read(group);
		
		int Data_1 = group[0] - '0';
		
		writer.write("입력된 값 : ");
		writer.write(group);
		writer.write("\n");
		writer.write("입력되니 첫번째 값 + 10 : ");
		writer.write(Data_1 + 10 + "\n");
		
		System.out.println("--------결과--------");
		writer.flush();
		writer.close();

	}

}
