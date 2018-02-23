package Try1;

import java.util.Scanner;

public class inputbuffer {
	public static int read=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Buffer Size: ");
		
		int i = sc.nextInt();
		int a,b;
		a= i/2;
		b= a;
		System.out.println(b);
		char buffera[]= new char[a];
		char bufferb[]= new char[b];
		System.out.println(buffera.length);
		System.out.println("Enter Charecter Stream: ");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		System.out.println(line);
		int stringsize = line.length();
		System.out.println(stringsize);
		
		char buffer[]= new char[stringsize];
		System.out.println(buffer.length);
		for(int in=0;in<stringsize;in++)
		{
			buffer[in]=line.charAt(in);
		}
		
		int lexemBegin=0;
		int lookahead=0;
		
		for (int count=0;count<--a;count++)
		{
			buffera[count]=buffer[read];
			buffera[count+1]='!'; // here ! is serving as eof
			read++;
		}
		
		for (int count=0;count<--a;count++)
		{
			bufferb[count]=buffer[read];
			bufferb[count+1]='!'; // here ! is serving as eof
			read++;
		}
		System.out.println("Buffer Created");
		while(lexemBegin<=stringsize)
		{
			System.out.println("loop e dhuke");
			while(buffera[lookahead]!='!')
			{
				System.out.println("loop e dhuke 2");
				if(buffera[lookahead]==' ')
				{
					for(int i1=lexemBegin ;i1<=lookahead;i1++)
					{
						//System.out.print("Token Found: ");
						System.out.print(buffera[i1]);
					}
					lexemBegin=lookahead+1;
					lookahead++;
				}
				lookahead++;
			}
			break;
		}

	}
	

}
