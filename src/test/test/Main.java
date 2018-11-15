package test.test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//임의의 파일경로
		String filePath = "";
		InputStream in = new FileInputStream(filePath);
		
		//읽는다.
		readStream(in);

		
		//메모리를 최대한 활용하여 성능을 극대화 하기 위해 BufferedInputStream을 사용한다.
		in = new BufferedInputStream(new FileInputStream(filePath));
		readStream(in);
		
		/*
		 * 결과적으로 InputStream의 하위타입인 FileInputStream을 사용하던 BufferedInputStream을 사용하던
		 * readStream 함수는 정상적으로 동작한다. 
		 */
		
	}
	
	
	public static void readStream(InputStream in) throws IOException {
		//파일을 읽는다.
		int readCnt = 0;
		byte[] buffer = new byte[1024];
		while((readCnt = in.read(buffer, 0, buffer.length)) > 0) {
			//버퍼 단위로 읽는다.
		}
	}

}
