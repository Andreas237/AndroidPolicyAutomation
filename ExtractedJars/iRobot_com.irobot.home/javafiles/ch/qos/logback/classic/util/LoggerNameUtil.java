// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.util;


public class LoggerNameUtil
{

	public LoggerNameUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static int getFirstSeparatorIndexOf(String s)
	{
		return getSeparatorIndexOf(s, 0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #15  <Method int getSeparatorIndexOf(String, int)>
	//    3    5:ireturn         
	}

	public static int getSeparatorIndexOf(String s, int i)
	{
		int j = s.indexOf('.', i);
	//    0    0:aload_0         
	//    1    1:bipush          46
	//    2    3:iload_1         
	//    3    4:invokevirtual   #21  <Method int String.indexOf(int, int)>
	//    4    7:istore_2        
		int k = s.indexOf('$', i);
	//    5    8:aload_0         
	//    6    9:bipush          36
	//    7   11:iload_1         
	//    8   12:invokevirtual   #21  <Method int String.indexOf(int, int)>
	//    9   15:istore_3        
		if(j == -1 && k == -1)
	//*  10   16:iload_2         
	//*  11   17:iconst_m1       
	//*  12   18:icmpne          28
	//*  13   21:iload_3         
	//*  14   22:iconst_m1       
	//*  15   23:icmpne          28
			return -1;
	//   16   26:iconst_m1       
	//   17   27:ireturn         
		if(j == -1)
	//*  18   28:iload_2         
	//*  19   29:iconst_m1       
	//*  20   30:icmpne          35
			return k;
	//   21   33:iload_3         
	//   22   34:ireturn         
		if(k == -1)
	//*  23   35:iload_3         
	//*  24   36:iconst_m1       
	//*  25   37:icmpne          42
			return j;
	//   26   40:iload_2         
	//   27   41:ireturn         
		i = k;
	//   28   42:iload_3         
	//   29   43:istore_1        
		if(j < k)
	//*  30   44:iload_2         
	//*  31   45:iload_3         
	//*  32   46:icmpge          51
			i = j;
	//   33   49:iload_2         
	//   34   50:istore_1        
		return i;
	//   35   51:iload_1         
	//   36   52:ireturn         
	}
}
