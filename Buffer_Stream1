package buffer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Buffer_Stream1 {

	public static void main(String[] args) throws IOException {
		// InputStream로 입력받을 시 맨 앞 문자 1개만 출력됨 
		// int 형태로 입력
		InputStream in = System.in;
		OutputStream out = System.out;
		
		
		//input은 read와 연결되어있어 in.read를 사용
		int num_1 = in.read();
		
		/*
		 * output은 write와 연결되어 있어 out.write를 사용
		 * flush를 사용하지 않으면 출력되지 않음
		 * output을 끝내는 매서드
		*/
		out.write(num_1);
		out.flush();
		out.close();

	}

}
