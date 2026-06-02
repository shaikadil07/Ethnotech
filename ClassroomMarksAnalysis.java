import java.util.Scanner;
public class ClassroomMarksAnalysis
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < n;i++
		{
            int mark = sc.nextInt();
            if(mark > max)
                max = mark;
        }
        System.out.println(max);
        sc.close();
    }
}