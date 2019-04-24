// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;


public class NumberUtils
{

	private NumberUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public static long parseHexLong(String s)
	{
		if(s.length() > 16)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #19  <Method int String.length()>
	//*   2    4:bipush          16
	//*   3    6:icmple          59
		{
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 37);
	//    4    9:new             #21  <Class StringBuilder>
	//    5   12:dup             
	//    6   13:aload_0         
	//    7   14:invokestatic    #25  <Method String String.valueOf(Object)>
	//    8   17:invokevirtual   #19  <Method int String.length()>
	//    9   20:bipush          37
	//   10   22:iadd            
	//   11   23:invokespecial   #28  <Method void StringBuilder(int)>
	//   12   26:astore_3        
			stringbuilder.append("Invalid input: ");
	//   13   27:aload_3         
	//   14   28:ldc1            #30  <String "Invalid input: ">
	//   15   30:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
			stringbuilder.append(s);
	//   17   34:aload_3         
	//   18   35:aload_0         
	//   19   36:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
			stringbuilder.append(" exceeds 16 characters");
	//   21   40:aload_3         
	//   22   41:ldc1            #36  <String " exceeds 16 characters">
	//   23   43:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   24   46:pop             
			throw new NumberFormatException(stringbuilder.toString());
	//   25   47:new             #38  <Class NumberFormatException>
	//   26   50:dup             
	//   27   51:aload_3         
	//   28   52:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   29   55:invokespecial   #45  <Method void NumberFormatException(String)>
	//   30   58:athrow          
		}
		if(s.length() == 16)
	//*  31   59:aload_0         
	//*  32   60:invokevirtual   #19  <Method int String.length()>
	//*  33   63:bipush          16
	//*  34   65:icmpne          98
		{
			long l = Long.parseLong(s.substring(8), 16);
	//   35   68:aload_0         
	//   36   69:bipush          8
	//   37   71:invokevirtual   #49  <Method String String.substring(int)>
	//   38   74:bipush          16
	//   39   76:invokestatic    #55  <Method long Long.parseLong(String, int)>
	//   40   79:lstore_1        
			return Long.parseLong(s.substring(0, 8), 16) << 32 | l;
	//   41   80:aload_0         
	//   42   81:iconst_0        
	//   43   82:bipush          8
	//   44   84:invokevirtual   #58  <Method String String.substring(int, int)>
	//   45   87:bipush          16
	//   46   89:invokestatic    #55  <Method long Long.parseLong(String, int)>
	//   47   92:bipush          32
	//   48   94:lshl            
	//   49   95:lload_1         
	//   50   96:lor             
	//   51   97:lreturn         
		} else
		{
			return Long.parseLong(s, 16);
	//   52   98:aload_0         
	//   53   99:bipush          16
	//   54  101:invokestatic    #55  <Method long Long.parseLong(String, int)>
	//   55  104:lreturn         
		}
	}
}
