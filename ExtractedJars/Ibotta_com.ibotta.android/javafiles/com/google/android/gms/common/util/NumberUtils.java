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
		int i = l != l1;
	//    0    0:lload_0         
	//    1    1:lload_2         
	//    2    2:lcmp            
	//    3    3:istore          4
		if(i < 0)
	//*   4    5:iload           4
	//*   5    7:ifge            12
			return -1;
	//    6   10:iconst_m1       
	//    7   11:ireturn         
		return i != 0 ? 1 : 0;
	//    8   12:iload           4
	//    9   14:ifne            19
	//   10   17:iconst_0        
	//   11   18:ireturn         
	//   12   19:iconst_1        
	//   13   20:ireturn         
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
		if(s.length() <= 16)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #30  <Method int String.length()>
	//*   2    4:bipush          16
	//*   3    6:icmpgt          55
		{
			if(s.length() == 16)
	//*   4    9:aload_0         
	//*   5   10:invokevirtual   #30  <Method int String.length()>
	//*   6   13:bipush          16
	//*   7   15:icmpne          48
			{
				long l = Long.parseLong(s.substring(8), 16);
	//    8   18:aload_0         
	//    9   19:bipush          8
	//   10   21:invokevirtual   #34  <Method String String.substring(int)>
	//   11   24:bipush          16
	//   12   26:invokestatic    #37  <Method long Long.parseLong(String, int)>
	//   13   29:lstore_1        
				return Long.parseLong(s.substring(0, 8), 16) << 32 | l;
	//   14   30:aload_0         
	//   15   31:iconst_0        
	//   16   32:bipush          8
	//   17   34:invokevirtual   #40  <Method String String.substring(int, int)>
	//   18   37:bipush          16
	//   19   39:invokestatic    #37  <Method long Long.parseLong(String, int)>
	//   20   42:bipush          32
	//   21   44:lshl            
	//   22   45:lload_1         
	//   23   46:lor             
	//   24   47:lreturn         
			} else
			{
				return Long.parseLong(s, 16);
	//   25   48:aload_0         
	//   26   49:bipush          16
	//   27   51:invokestatic    #37  <Method long Long.parseLong(String, int)>
	//   28   54:lreturn         
			}
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 37);
	//   29   55:new             #42  <Class StringBuilder>
	//   30   58:dup             
	//   31   59:aload_0         
	//   32   60:invokestatic    #46  <Method String String.valueOf(Object)>
	//   33   63:invokevirtual   #30  <Method int String.length()>
	//   34   66:bipush          37
	//   35   68:iadd            
	//   36   69:invokespecial   #49  <Method void StringBuilder(int)>
	//   37   72:astore_3        
			stringbuilder.append("Invalid input: ");
	//   38   73:aload_3         
	//   39   74:ldc1            #51  <String "Invalid input: ">
	//   40   76:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   41   79:pop             
			stringbuilder.append(s);
	//   42   80:aload_3         
	//   43   81:aload_0         
	//   44   82:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   45   85:pop             
			stringbuilder.append(" exceeds 16 characters");
	//   46   86:aload_3         
	//   47   87:ldc1            #57  <String " exceeds 16 characters">
	//   48   89:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   49   92:pop             
			throw new NumberFormatException(stringbuilder.toString());
	//   50   93:new             #17  <Class NumberFormatException>
	//   51   96:dup             
	//   52   97:aload_3         
	//   53   98:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   54  101:invokespecial   #64  <Method void NumberFormatException(String)>
	//   55  104:athrow          
		}
	}
}
