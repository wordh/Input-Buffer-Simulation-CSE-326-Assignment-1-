package Try1;

import java.util.Scanner;

public class Assignment {
	
	static int lexemBegin=0;
	static int forward=0;
	static int read = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Buffer Size: ");
		int buffersize = sc.nextInt();
		
		System.out.println("Enter Charecter Stream: ");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		
		char[] buffer = new char [buffersize*2];
		
		for(int i=0;i<buffersize;i++)
		{
			buffer[i]=line.charAt(i);
			buffer[buffersize]='!';
			read=i-2;
		}
		System.out.println("first half loading working ");
		
		while(lexemBegin <line.length())
		{
			if(forward==buffersize)
			{
				for(int i=read;i<buffersize*2;i++)
				{
					buffer[i]=line.charAt(i);
					buffer[buffersize*2]='!';
					read=i-2;
				}
				forward++;
				System.out.println("2nd Half is Loading");
				
			}
			else if(forward==buffersize*2)
			{
				for(int i=0;i<buffersize;i++)
				{
					buffer[i]=line.charAt(read+1);
					buffer[buffersize]='!';
					read++;
				}
				forward=0;
			}
			
			if(buffer[forward]==' ')
			{
				for(int count=lexemBegin;count<forward;count++)
				{
					System.out.print(buffer[count]);
				}
				lexemBegin=forward+1;
				forward++;
				System.out.println("");
			}
			forward++;
			System.out.println("loop is running");
			
		}
		
		
	}
}
