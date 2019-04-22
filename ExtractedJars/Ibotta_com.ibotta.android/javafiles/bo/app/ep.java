// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ep
{

	public static int a()
	{
		return b;
	//    0    0:getstatic       #33  <Field int b>
	//    1    3:ireturn         
	}

	public static int b()
	{
		return c;
	//    0    0:getstatic       #35  <Field int c>
	//    1    3:ireturn         
	}

	public static long c()
	{
		return 1L;
	//    0    0:lconst_1        
	//    1    1:lreturn         
	}

	public static BlockingQueue d()
	{
		return ((BlockingQueue) (new LinkedBlockingQueue(64)));
	//    0    0:new             #41  <Class LinkedBlockingQueue>
	//    1    3:dup             
	//    2    4:bipush          64
	//    3    6:invokespecial   #45  <Method void LinkedBlockingQueue(int)>
	//    4    9:areturn         
	}

	private static final int a;
	private static final int b;
	private static final int c;

	static 
	{
		a = Runtime.getRuntime().availableProcessors();
	//    0    0:invokestatic    #16  <Method Runtime Runtime.getRuntime()>
	//    1    3:invokevirtual   #20  <Method int Runtime.availableProcessors()>
	//    2    6:putstatic       #22  <Field int a>
		b = Math.max(2, Math.min(a - 1, 4));
	//    3    9:iconst_2        
	//    4   10:getstatic       #22  <Field int a>
	//    5   13:iconst_1        
	//    6   14:isub            
	//    7   15:iconst_4        
	//    8   16:invokestatic    #28  <Method int Math.min(int, int)>
	//    9   19:invokestatic    #31  <Method int Math.max(int, int)>
	//   10   22:putstatic       #33  <Field int b>
		c = a * 2 + 1;
	//   11   25:getstatic       #22  <Field int a>
	//   12   28:iconst_2        
	//   13   29:imul            
	//   14   30:iconst_1        
	//   15   31:iadd            
	//   16   32:putstatic       #35  <Field int c>
	//*  17   35:return          
	}
}
