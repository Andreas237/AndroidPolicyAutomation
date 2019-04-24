// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.util;

import java.io.PrintStream;
import org.apache.commons.a.d;

public class DataConverterHelper
{

	public DataConverterHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static String a(int i)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #13  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(Integer.toHexString(i));
	//    4    8:aload_1         
	//    5    9:iload_0         
	//    6   10:invokestatic    #19  <Method String Integer.toHexString(int)>
	//    7   13:invokevirtual   #23  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		if(stringbuilder.length() < 2)
	//*   9   17:aload_1         
	//*  10   18:invokevirtual   #27  <Method int StringBuilder.length()>
	//*  11   21:iconst_2        
	//*  12   22:icmpge          33
			stringbuilder.insert(0, '0');
	//   13   25:aload_1         
	//   14   26:iconst_0        
	//   15   27:bipush          48
	//   16   29:invokevirtual   #31  <Method StringBuilder StringBuilder.insert(int, char)>
	//   17   32:pop             
		return stringbuilder.toString().toUpperCase();
	//   18   33:aload_1         
	//   19   34:invokevirtual   #35  <Method String StringBuilder.toString()>
	//   20   37:invokevirtual   #40  <Method String String.toUpperCase()>
	//   21   40:areturn         
	}

	public static String a(String s)
	{
		if(s != null && !s.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:ifnull          104
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #45  <Method boolean String.isEmpty()>
	//*   4    8:ifeq            14
	//*   5   11:goto            104
		{
			StringBuilder stringbuilder = new StringBuilder(16);
	//    6   14:new             #13  <Class StringBuilder>
	//    7   17:dup             
	//    8   18:bipush          16
	//    9   20:invokespecial   #48  <Method void StringBuilder(int)>
	//   10   23:astore_3        
			s = ((String) (s.replaceAll("\\[", "").replaceAll("\\]", "").split(",")));
	//   11   24:aload_0         
	//   12   25:ldc1            #50  <String "\\[">
	//   13   27:ldc1            #52  <String "">
	//   14   29:invokevirtual   #56  <Method String String.replaceAll(String, String)>
	//   15   32:ldc1            #58  <String "\\]">
	//   16   34:ldc1            #52  <String "">
	//   17   36:invokevirtual   #56  <Method String String.replaceAll(String, String)>
	//   18   39:ldc1            #60  <String ",">
	//   19   41:invokevirtual   #64  <Method String[] String.split(String)>
	//   20   44:astore_0        
			if(s.length != 8)
	//*  21   45:aload_0         
	//*  22   46:arraylength     
	//*  23   47:bipush          8
	//*  24   49:icmpeq          62
				throw new IllegalArgumentException("Blid bytes have to be exacly 8");
	//   25   52:new             #66  <Class IllegalArgumentException>
	//   26   55:dup             
	//   27   56:ldc1            #68  <String "Blid bytes have to be exacly 8">
	//   28   58:invokespecial   #71  <Method void IllegalArgumentException(String)>
	//   29   61:athrow          
			int j = s.length;
	//   30   62:aload_0         
	//   31   63:arraylength     
	//   32   64:istore_2        
			for(int i = 0; i < j; i++)
	//*  33   65:iconst_0        
	//*  34   66:istore_1        
	//*  35   67:iload_1         
	//*  36   68:iload_2         
	//*  37   69:icmpge          99
				stringbuilder.append(a(Integer.valueOf(((String) (s[i])).trim()).intValue()));
	//   38   72:aload_3         
	//   39   73:aload_0         
	//   40   74:iload_1         
	//   41   75:aaload          
	//   42   76:invokevirtual   #74  <Method String String.trim()>
	//   43   79:invokestatic    #78  <Method Integer Integer.valueOf(String)>
	//   44   82:invokevirtual   #81  <Method int Integer.intValue()>
	//   45   85:invokestatic    #83  <Method String a(int)>
	//   46   88:invokevirtual   #23  <Method StringBuilder StringBuilder.append(String)>
	//   47   91:pop             

	//   48   92:iload_1         
	//   49   93:iconst_1        
	//   50   94:iadd            
	//   51   95:istore_1        
	//*  52   96:goto            67
			return stringbuilder.toString();
	//   53   99:aload_3         
	//   54  100:invokevirtual   #35  <Method String StringBuilder.toString()>
	//   55  103:areturn         
		} else
		{
			return null;
	//   56  104:aconst_null     
	//   57  105:areturn         
		}
	}

	public static String b(String s)
	{
		if(s != null && !s.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:ifnull          140
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #45  <Method boolean String.isEmpty()>
	//*   4    8:ifeq            14
	//*   5   11:goto            140
		{
			if(s.length() != 16)
	//*   6   14:aload_0         
	//*   7   15:invokevirtual   #85  <Method int String.length()>
	//*   8   18:bipush          16
	//*   9   20:icmpeq          33
				throw new IllegalArgumentException("Blid characters have to be exacly 16");
	//   10   23:new             #66  <Class IllegalArgumentException>
	//   11   26:dup             
	//   12   27:ldc1            #87  <String "Blid characters have to be exacly 16">
	//   13   29:invokespecial   #71  <Method void IllegalArgumentException(String)>
	//   14   32:athrow          
			StringBuilder stringbuilder = new StringBuilder(16);
	//   15   33:new             #13  <Class StringBuilder>
	//   16   36:dup             
	//   17   37:bipush          16
	//   18   39:invokespecial   #48  <Method void StringBuilder(int)>
	//   19   42:astore          4
			stringbuilder.append("[");
	//   20   44:aload           4
	//   21   46:ldc1            #89  <String "[">
	//   22   48:invokevirtual   #23  <Method StringBuilder StringBuilder.append(String)>
	//   23   51:pop             
			String as[] = new String[8];
	//   24   52:bipush          8
	//   25   54:anewarray       String[]
	//   26   57:astore          5
			for(int i = 0; i < s.length(); i++)
	//*  27   59:iconst_0        
	//*  28   60:istore_1        
	//*  29   61:iload_1         
	//*  30   62:aload_0         
	//*  31   63:invokevirtual   #85  <Method int String.length()>
	//*  32   66:icmpge          113
				if(i % 2 != 0)
	//*  33   69:iload_1         
	//*  34   70:iconst_2        
	//*  35   71:irem            
	//*  36   72:ifeq            106
				{
					int j = i - 1;
	//   37   75:iload_1         
	//   38   76:iconst_1        
	//   39   77:isub            
	//   40   78:istore_2        
					int k = Integer.parseInt(s.substring(j, i + 1), 16);
	//   41   79:aload_0         
	//   42   80:iload_2         
	//   43   81:iload_1         
	//   44   82:iconst_1        
	//   45   83:iadd            
	//   46   84:invokevirtual   #93  <Method String String.substring(int, int)>
	//   47   87:bipush          16
	//   48   89:invokestatic    #97  <Method int Integer.parseInt(String, int)>
	//   49   92:istore_3        
					as[j / 2] = Integer.valueOf(k).toString();
	//   50   93:aload           5
	//   51   95:iload_2         
	//   52   96:iconst_2        
	//   53   97:idiv            
	//   54   98:iload_3         
	//   55   99:invokestatic    #100 <Method Integer Integer.valueOf(int)>
	//   56  102:invokevirtual   #101 <Method String Integer.toString()>
	//   57  105:aastore         
				}

	//   58  106:iload_1         
	//   59  107:iconst_1        
	//   60  108:iadd            
	//   61  109:istore_1        
	//*  62  110:goto            61
			stringbuilder.append(d.a(((Object []) (as)), ","));
	//   63  113:aload           4
	//   64  115:aload           5
	//   65  117:ldc1            #60  <String ",">
	//   66  119:invokestatic    #106 <Method String d.a(Object[], String)>
	//   67  122:invokevirtual   #23  <Method StringBuilder StringBuilder.append(String)>
	//   68  125:pop             
			stringbuilder.append("]");
	//   69  126:aload           4
	//   70  128:ldc1            #108 <String "]">
	//   71  130:invokevirtual   #23  <Method StringBuilder StringBuilder.append(String)>
	//   72  133:pop             
			return stringbuilder.toString();
	//   73  134:aload           4
	//   74  136:invokevirtual   #35  <Method String StringBuilder.toString()>
	//   75  139:areturn         
		} else
		{
			return null;
	//   76  140:aconst_null     
	//   77  141:areturn         
		}
	}

	public static void main(String args[])
	{
		System.out.println(a("[224,14,94,248,125,127,23,213]"));
	//    0    0:getstatic       #116 <Field PrintStream System.out>
	//    1    3:ldc1            #118 <String "[224,14,94,248,125,127,23,213]">
	//    2    5:invokestatic    #120 <Method String a(String)>
	//    3    8:invokevirtual   #125 <Method void PrintStream.println(String)>
		System.out.println(b("E00E5EF87D7F17D5"));
	//    4   11:getstatic       #116 <Field PrintStream System.out>
	//    5   14:ldc1            #127 <String "E00E5EF87D7F17D5">
	//    6   16:invokestatic    #129 <Method String b(String)>
	//    7   19:invokevirtual   #125 <Method void PrintStream.println(String)>
	//    8   22:return          
	}
}
