// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.awt.geom.misc;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Messages
{

	public Messages()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public static String format(String s, Object aobj[])
	{
		StringBuilder stringbuilder = new StringBuilder(s.length() + aobj.length * 20);
	//    0    0:new             #18  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #24  <Method int String.length()>
	//    4    8:aload_1         
	//    5    9:arraylength     
	//    6   10:bipush          20
	//    7   12:imul            
	//    8   13:iadd            
	//    9   14:invokespecial   #27  <Method void StringBuilder(int)>
	//   10   17:astore          5
		String as[] = new String[aobj.length];
	//   11   19:aload_1         
	//   12   20:arraylength     
	//   13   21:anewarray       String[]
	//   14   24:astore          6
		int i = 0;
	//   15   26:iconst_0        
	//   16   27:istore_2        
		while(i < aobj.length) 
	//*  17   28:iload_2         
	//*  18   29:aload_1         
	//*  19   30:arraylength     
	//*  20   31:icmpge          66
		{
			if(aobj[i] == null)
	//*  21   34:aload_1         
	//*  22   35:iload_2         
	//*  23   36:aaload          
	//*  24   37:ifnonnull       53
				as[i] = "<null>";
	//   25   40:aload           6
	//   26   42:iload_2         
	//   27   43:ldc1            #29  <String "<null>">
	//   28   45:aastore         
			else
	//*  29   46:iload_2         
	//*  30   47:iconst_1        
	//*  31   48:iadd            
	//*  32   49:istore_2        
	//*  33   50:goto            28
				as[i] = aobj[i].toString();
	//   34   53:aload           6
	//   35   55:iload_2         
	//   36   56:aload_1         
	//   37   57:iload_2         
	//   38   58:aaload          
	//   39   59:invokevirtual   #33  <Method String Object.toString()>
	//   40   62:aastore         
			i++;
		}
	//*  41   63:goto            46
		i = 0;
	//   42   66:iconst_0        
	//   43   67:istore_2        
		int j = s.indexOf('{', 0);
	//   44   68:aload_0         
	//   45   69:bipush          123
	//   46   71:iconst_0        
	//   47   72:invokevirtual   #37  <Method int String.indexOf(int, int)>
	//   48   75:istore_3        
		while(j >= 0) 
	//*  49   76:iload_3         
	//*  50   77:iflt            273
		{
			if(j != 0 && s.charAt(j - 1) == '\\')
	//*  51   80:iload_3         
	//*  52   81:ifeq            138
	//*  53   84:aload_0         
	//*  54   85:iload_3         
	//*  55   86:iconst_1        
	//*  56   87:isub            
	//*  57   88:invokevirtual   #41  <Method char String.charAt(int)>
	//*  58   91:bipush          92
	//*  59   93:icmpne          138
			{
				if(j != 1)
	//*  60   96:iload_3         
	//*  61   97:iconst_1        
	//*  62   98:icmpeq          115
					stringbuilder.append(s.substring(i, j - 1));
	//   63  101:aload           5
	//   64  103:aload_0         
	//   65  104:iload_2         
	//   66  105:iload_3         
	//   67  106:iconst_1        
	//   68  107:isub            
	//   69  108:invokevirtual   #45  <Method String String.substring(int, int)>
	//   70  111:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   71  114:pop             
				stringbuilder.append('{');
	//   72  115:aload           5
	//   73  117:bipush          123
	//   74  119:invokevirtual   #52  <Method StringBuilder StringBuilder.append(char)>
	//   75  122:pop             
				i = j + 1;
	//   76  123:iload_3         
	//   77  124:iconst_1        
	//   78  125:iadd            
	//   79  126:istore_2        
			} else
	//*  80  127:aload_0         
	//*  81  128:bipush          123
	//*  82  130:iload_2         
	//*  83  131:invokevirtual   #37  <Method int String.indexOf(int, int)>
	//*  84  134:istore_3        
	//*  85  135:goto            76
			if(j > s.length() - 3)
	//*  86  138:iload_3         
	//*  87  139:aload_0         
	//*  88  140:invokevirtual   #24  <Method int String.length()>
	//*  89  143:iconst_3        
	//*  90  144:isub            
	//*  91  145:icmple          171
			{
				stringbuilder.append(s.substring(i, s.length()));
	//   92  148:aload           5
	//   93  150:aload_0         
	//   94  151:iload_2         
	//   95  152:aload_0         
	//   96  153:invokevirtual   #24  <Method int String.length()>
	//   97  156:invokevirtual   #45  <Method String String.substring(int, int)>
	//   98  159:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   99  162:pop             
				i = s.length();
	//  100  163:aload_0         
	//  101  164:invokevirtual   #24  <Method int String.length()>
	//  102  167:istore_2        
			} else
	//* 103  168:goto            127
			{
				byte byte0 = (byte)Character.digit(s.charAt(j + 1), 10);
	//  104  171:aload_0         
	//  105  172:iload_3         
	//  106  173:iconst_1        
	//  107  174:iadd            
	//  108  175:invokevirtual   #41  <Method char String.charAt(int)>
	//  109  178:bipush          10
	//  110  180:invokestatic    #58  <Method int Character.digit(char, int)>
	//  111  183:int2byte        
	//  112  184:istore          4
				if(byte0 < 0 || s.charAt(j + 2) != '}')
	//* 113  186:iload           4
	//* 114  188:iflt            203
	//* 115  191:aload_0         
	//* 116  192:iload_3         
	//* 117  193:iconst_2        
	//* 118  194:iadd            
	//* 119  195:invokevirtual   #41  <Method char String.charAt(int)>
	//* 120  198:bipush          125
	//* 121  200:icmpeq          224
				{
					stringbuilder.append(s.substring(i, j + 1));
	//  122  203:aload           5
	//  123  205:aload_0         
	//  124  206:iload_2         
	//  125  207:iload_3         
	//  126  208:iconst_1        
	//  127  209:iadd            
	//  128  210:invokevirtual   #45  <Method String String.substring(int, int)>
	//  129  213:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//  130  216:pop             
					i = j + 1;
	//  131  217:iload_3         
	//  132  218:iconst_1        
	//  133  219:iadd            
	//  134  220:istore_2        
				} else
	//* 135  221:goto            127
				{
					stringbuilder.append(s.substring(i, j));
	//  136  224:aload           5
	//  137  226:aload_0         
	//  138  227:iload_2         
	//  139  228:iload_3         
	//  140  229:invokevirtual   #45  <Method String String.substring(int, int)>
	//  141  232:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//  142  235:pop             
					if(byte0 >= as.length)
	//* 143  236:iload           4
	//* 144  238:aload           6
	//* 145  240:arraylength     
	//* 146  241:icmplt          259
						stringbuilder.append("<missing argument>");
	//  147  244:aload           5
	//  148  246:ldc1            #60  <String "<missing argument>">
	//  149  248:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//  150  251:pop             
					else
	//* 151  252:iload_3         
	//* 152  253:iconst_3        
	//* 153  254:iadd            
	//* 154  255:istore_2        
	//* 155  256:goto            127
						stringbuilder.append(as[byte0]);
	//  156  259:aload           5
	//  157  261:aload           6
	//  158  263:iload           4
	//  159  265:aaload          
	//  160  266:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//  161  269:pop             
					i = j + 3;
				}
			}
			j = s.indexOf('{', i);
		}
	//* 162  270:goto            252
		if(i < s.length())
	//* 163  273:iload_2         
	//* 164  274:aload_0         
	//* 165  275:invokevirtual   #24  <Method int String.length()>
	//* 166  278:icmpge          296
			stringbuilder.append(s.substring(i, s.length()));
	//  167  281:aload           5
	//  168  283:aload_0         
	//  169  284:iload_2         
	//  170  285:aload_0         
	//  171  286:invokevirtual   #24  <Method int String.length()>
	//  172  289:invokevirtual   #45  <Method String String.substring(int, int)>
	//  173  292:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//  174  295:pop             
		return stringbuilder.toString();
	//  175  296:aload           5
	//  176  298:invokevirtual   #61  <Method String StringBuilder.toString()>
	//  177  301:areturn         
	}

	public static String getString(String s)
	{
		if(bundle == null)
	//*   0    0:getstatic       #10  <Field ResourceBundle bundle>
	//*   1    3:ifnonnull       8
			return s;
	//    2    6:aload_0         
	//    3    7:areturn         
		String s1;
		try
		{
			s1 = bundle.getString(s);
	//    4    8:getstatic       #10  <Field ResourceBundle bundle>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #69  <Method String ResourceBundle.getString(String)>
	//    7   15:astore_1        
		}
	//*   8   16:aload_1         
	//*   9   17:areturn         
		catch(MissingResourceException missingresourceexception)
	//*  10   18:astore_1        
		{
			return (new StringBuilder()).append("Missing message: ").append(s).toString();
	//   11   19:new             #18  <Class StringBuilder>
	//   12   22:dup             
	//   13   23:invokespecial   #70  <Method void StringBuilder()>
	//   14   26:ldc1            #72  <String "Missing message: ">
	//   15   28:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   16   31:aload_0         
	//   17   32:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   18   35:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   19   38:areturn         
		}
		return s1;
	}

	public static String getString(String s, char c)
	{
		return getString(s, new Object[] {
			String.valueOf(c)
		});
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:anewarray       Object[]
	//    3    5:dup             
	//    4    6:iconst_0        
	//    5    7:iload_1         
	//    6    8:invokestatic    #77  <Method String String.valueOf(char)>
	//    7   11:aastore         
	//    8   12:invokestatic    #79  <Method String getString(String, Object[])>
	//    9   15:areturn         
	}

	public static String getString(String s, int i)
	{
		return getString(s, new Object[] {
			Integer.toString(i)
		});
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:anewarray       Object[]
	//    3    5:dup             
	//    4    6:iconst_0        
	//    5    7:iload_1         
	//    6    8:invokestatic    #85  <Method String Integer.toString(int)>
	//    7   11:aastore         
	//    8   12:invokestatic    #79  <Method String getString(String, Object[])>
	//    9   15:areturn         
	}

	public static String getString(String s, Object obj)
	{
		return getString(s, new Object[] {
			obj
		});
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:anewarray       Object[]
	//    3    5:dup             
	//    4    6:iconst_0        
	//    5    7:aload_1         
	//    6    8:aastore         
	//    7    9:invokestatic    #79  <Method String getString(String, Object[])>
	//    8   12:areturn         
	}

	public static String getString(String s, Object obj, Object obj1)
	{
		return getString(s, new Object[] {
			obj, obj1
		});
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:anewarray       Object[]
	//    3    5:dup             
	//    4    6:iconst_0        
	//    5    7:aload_1         
	//    6    8:aastore         
	//    7    9:dup             
	//    8   10:iconst_1        
	//    9   11:aload_2         
	//   10   12:aastore         
	//   11   13:invokestatic    #79  <Method String getString(String, Object[])>
	//   12   16:areturn         
	}

	public static String getString(String s, Object aobj[])
	{
		String s1 = s;
	//    0    0:aload_0         
	//    1    1:astore_2        
		String s2 = s1;
	//    2    2:aload_2         
	//    3    3:astore_3        
		if(bundle != null)
	//*   4    4:getstatic       #10  <Field ResourceBundle bundle>
	//*   5    7:ifnull          18
			try
			{
				s2 = bundle.getString(s);
	//    6   10:getstatic       #10  <Field ResourceBundle bundle>
	//    7   13:aload_0         
	//    8   14:invokevirtual   #69  <Method String ResourceBundle.getString(String)>
	//    9   17:astore_3        
			}
	//*  10   18:aload_3         
	//*  11   19:aload_1         
	//*  12   20:invokestatic    #89  <Method String format(String, Object[])>
	//*  13   23:areturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  14   24:astore_0        
			{
				s2 = s1;
	//   15   25:aload_2         
	//   16   26:astore_3        
			}
		return format(s2, aobj);
	//*  17   27:goto            18
	}

	private static ResourceBundle bundle = null;

	static 
	{
	//    0    0:aconst_null     
	//    1    1:putstatic       #10  <Field ResourceBundle bundle>
	//*   2    4:return          
	}
}
