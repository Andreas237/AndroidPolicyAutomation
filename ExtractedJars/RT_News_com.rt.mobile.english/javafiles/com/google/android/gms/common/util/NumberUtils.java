// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;


public class NumberUtils
{

	private NumberUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	public static int compare(int i, int j)
	{
		if(i < j)
	//*   0    0:iload_0         
	//*   1    1:iload_1         
	//*   2    2:icmpge          7
			return -1;
	//    3    5:iconst_m1       
	//    4    6:ireturn         
		return i != j ? 1 : 0;
	//    5    7:iload_0         
	//    6    8:iload_1         
	//    7    9:icmpne          14
	//    8   12:iconst_0        
	//    9   13:ireturn         
	//   10   14:iconst_1        
	//   11   15:ireturn         
	}

	public static int compare(long l, long l1)
	{
		if(l < l1)
	//*   0    0:lload_0         
	//*   1    1:lload_2         
	//*   2    2:lcmp            
	//*   3    3:ifge            8
			return -1;
	//    4    6:iconst_m1       
	//    5    7:ireturn         
		return l != l1 ? 1 : 0;
	//    6    8:lload_0         
	//    7    9:lload_2         
	//    8   10:lcmp            
	//    9   11:ifne            16
	//   10   14:iconst_0        
	//   11   15:ireturn         
	//   12   16:iconst_1        
	//   13   17:ireturn         
	}

	public static boolean isNumeric(String s)
	{
		try
		{
			Long.parseLong(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #23  <Method long Long.parseLong(String)>
	//    2    4:pop2            
		}
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
	//*   5    7:iconst_0        
	//*   6    8:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return false;
		}
		return true;
	//*   7    9:astore_0        
	//*   8   10:goto            7
	}

	public static long parseHexLong(String s)
	{
		if(s.length() > 16)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #30  <Method int String.length()>
	//*   2    4:bipush          16
	//*   3    6:icmple          59
		{
			StringBuilder stringbuilder = new StringBuilder(37 + String.valueOf(((Object) (s))).length());
	//    4    9:new             #32  <Class StringBuilder>
	//    5   12:dup             
	//    6   13:bipush          37
	//    7   15:aload_0         
	//    8   16:invokestatic    #36  <Method String String.valueOf(Object)>
	//    9   19:invokevirtual   #30  <Method int String.length()>
	//   10   22:iadd            
	//   11   23:invokespecial   #39  <Method void StringBuilder(int)>
	//   12   26:astore_1        
			stringbuilder.append("Invalid input: ");
	//   13   27:aload_1         
	//   14   28:ldc1            #41  <String "Invalid input: ">
	//   15   30:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
			stringbuilder.append(s);
	//   17   34:aload_1         
	//   18   35:aload_0         
	//   19   36:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
			stringbuilder.append(" exceeds 16 characters");
	//   21   40:aload_1         
	//   22   41:ldc1            #47  <String " exceeds 16 characters">
	//   23   43:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   24   46:pop             
			throw new NumberFormatException(stringbuilder.toString());
	//   25   47:new             #17  <Class NumberFormatException>
	//   26   50:dup             
	//   27   51:aload_1         
	//   28   52:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   29   55:invokespecial   #54  <Method void NumberFormatException(String)>
	//   30   58:athrow          
		}
		if(s.length() == 16)
	//*  31   59:aload_0         
	//*  32   60:invokevirtual   #30  <Method int String.length()>
	//*  33   63:bipush          16
	//*  34   65:icmpne          96
			return Long.parseLong(s.substring(8), 16) | Long.parseLong(s.substring(0, 8), 16) << 32;
	//   35   68:aload_0         
	//   36   69:bipush          8
	//   37   71:invokevirtual   #58  <Method String String.substring(int)>
	//   38   74:bipush          16
	//   39   76:invokestatic    #61  <Method long Long.parseLong(String, int)>
	//   40   79:aload_0         
	//   41   80:iconst_0        
	//   42   81:bipush          8
	//   43   83:invokevirtual   #64  <Method String String.substring(int, int)>
	//   44   86:bipush          16
	//   45   88:invokestatic    #61  <Method long Long.parseLong(String, int)>
	//   46   91:bipush          32
	//   47   93:lshl            
	//   48   94:lor             
	//   49   95:lreturn         
		else
			return Long.parseLong(s, 16);
	//   50   96:aload_0         
	//   51   97:bipush          16
	//   52   99:invokestatic    #61  <Method long Long.parseLong(String, int)>
	//   53  102:lreturn         
	}
}
