package Java14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Class03 {

	public static void main(String[] args) throws IOException {
		int n, sum = 0;
		BufferedReader buf;
		String str;
		buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("¿é¤J¤@­Ó¾ã¼Æ:");
		str = buf.readLine();
		n = Integer.parseInt(str);
		for (int i = 1; i <= n; i++)
			sum += i;
		System.out.println("1+2+...+" + n + "=" + sum);
	}
}
