// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import java.io.PrintStream;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.*;

public class ISO8601Utils
{

	public ISO8601Utils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
	//    2    4:return          
	}

	private static boolean checkOffset(String s, int i, char c)
	{
		return i < s.length() && s.charAt(i) == c;
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #42  <Method int String.length()>
	//    3    5:icmpge          19
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokevirtual   #46  <Method char String.charAt(int)>
	//    7   13:iload_2         
	//    8   14:icmpne          19
	//    9   17:iconst_1        
	//   10   18:ireturn         
	//   11   19:iconst_0        
	//   12   20:ireturn         
	}

	public static String format(Date date)
	{
		return format(date, false, TIMEZONE_UTC);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:getstatic       #28  <Field TimeZone TIMEZONE_UTC>
	//    3    5:invokestatic    #51  <Method String format(Date, boolean, TimeZone)>
	//    4    8:areturn         
	}

	public static String format(Date date, boolean flag)
	{
		return format(date, flag, TIMEZONE_UTC);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:getstatic       #28  <Field TimeZone TIMEZONE_UTC>
	//    3    5:invokestatic    #51  <Method String format(Date, boolean, TimeZone)>
	//    4    8:areturn         
	}

	public static String format(Date date, boolean flag, TimeZone timezone)
	{
		GregorianCalendar gregoriancalendar = new GregorianCalendar(timezone, Locale.US);
	//    0    0:new             #54  <Class GregorianCalendar>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:getstatic       #60  <Field Locale Locale.US>
	//    4    8:invokespecial   #63  <Method void GregorianCalendar(TimeZone, Locale)>
	//    5   11:astore          7
		((Calendar) (gregoriancalendar)).setTime(date);
	//    6   13:aload           7
	//    7   15:aload_0         
	//    8   16:invokevirtual   #69  <Method void Calendar.setTime(Date)>
		int k = "yyyy-MM-ddThh:mm:ss".length();
	//    9   19:ldc1            #71  <String "yyyy-MM-ddThh:mm:ss">
	//   10   21:invokevirtual   #42  <Method int String.length()>
	//   11   24:istore          6
		int i;
		int j;
		if(flag)
	//*  12   26:iload_1         
	//*  13   27:ifeq            314
			i = ".sss".length();
	//   14   30:ldc1            #73  <String ".sss">
	//   15   32:invokevirtual   #42  <Method int String.length()>
	//   16   35:istore          4
		else
	//*  17   37:aload_2         
	//*  18   38:invokevirtual   #76  <Method int TimeZone.getRawOffset()>
	//*  19   41:ifne            320
	//*  20   44:ldc1            #78  <String "Z">
	//*  21   46:invokevirtual   #42  <Method int String.length()>
	//*  22   49:istore          5
	//*  23   51:new             #80  <Class StringBuilder>
	//*  24   54:dup             
	//*  25   55:iload           6
	//*  26   57:iload           4
	//*  27   59:iadd            
	//*  28   60:iload           5
	//*  29   62:iadd            
	//*  30   63:invokespecial   #83  <Method void StringBuilder(int)>
	//*  31   66:astore_0        
	//*  32   67:aload_0         
	//*  33   68:aload           7
	//*  34   70:iconst_1        
	//*  35   71:invokevirtual   #87  <Method int Calendar.get(int)>
	//*  36   74:ldc1            #89  <String "yyyy">
	//*  37   76:invokevirtual   #42  <Method int String.length()>
	//*  38   79:invokestatic    #93  <Method void padInt(StringBuilder, int, int)>
	//*  39   82:aload_0         
	//*  40   83:bipush          45
	//*  41   85:invokevirtual   #97  <Method StringBuilder StringBuilder.append(char)>
	//*  42   88:pop             
	//*  43   89:aload_0         
	//*  44   90:aload           7
	//*  45   92:iconst_2        
	//*  46   93:invokevirtual   #87  <Method int Calendar.get(int)>
	//*  47   96:iconst_1        
	//*  48   97:iadd            
	//*  49   98:ldc1            #99  <String "MM">
	//*  50  100:invokevirtual   #42  <Method int String.length()>
	//*  51  103:invokestatic    #93  <Method void padInt(StringBuilder, int, int)>
	//*  52  106:aload_0         
	//*  53  107:bipush          45
	//*  54  109:invokevirtual   #97  <Method StringBuilder StringBuilder.append(char)>
	//*  55  112:pop             
	//*  56  113:aload_0         
	//*  57  114:aload           7
	//*  58  116:iconst_5        
	//*  59  117:invokevirtual   #87  <Method int Calendar.get(int)>
	//*  60  120:ldc1            #101 <String "dd">
	//*  61  122:invokevirtual   #42  <Method int String.length()>
	//*  62  125:invokestatic    #93  <Method void padInt(StringBuilder, int, int)>
	//*  63  128:aload_0         
	//*  64  129:bipush          84
	//*  65  131:invokevirtual   #97  <Method StringBuilder StringBuilder.append(char)>
	//*  66  134:pop             
	//*  67  135:aload_0         
	//*  68  136:aload           7
	//*  69  138:bipush          11
	//*  70  140:invokevirtual   #87  <Method int Calendar.get(int)>
	//*  71  143:ldc1            #103 <String "hh">
	//*  72  145:invokevirtual   #42  <Method int String.length()>
	//*  73  148:invokestatic    #93  <Method void padInt(StringBuilder, int, int)>
	//*  74  151:aload_0         
	//*  75  152:bipush          58
	//*  76  154:invokevirtual   #97  <Method StringBuilder StringBuilder.append(char)>
	//*  77  157:pop             
	//*  78  158:aload_0         
	//*  79  159:aload           7
	//*  80  161:bipush          12
	//*  81  163:invokevirtual   #87  <Method int Calendar.get(int)>
	//*  82  166:ldc1            #105 <String "mm">
	//*  83  168:invokevirtual   #42  <Method int String.length()>
	//*  84  171:invokestatic    #93  <Method void padInt(StringBuilder, int, int)>
	//*  85  174:aload_0         
	//*  86  175:bipush          58
	//*  87  177:invokevirtual   #97  <Method StringBuilder StringBuilder.append(char)>
	//*  88  180:pop             
	//*  89  181:aload_0         
	//*  90  182:aload           7
	//*  91  184:bipush          13
	//*  92  186:invokevirtual   #87  <Method int Calendar.get(int)>
	//*  93  189:ldc1            #107 <String "ss">
	//*  94  191:invokevirtual   #42  <Method int String.length()>
	//*  95  194:invokestatic    #93  <Method void padInt(StringBuilder, int, int)>
	//*  96  197:iload_1         
	//*  97  198:ifeq            224
	//*  98  201:aload_0         
	//*  99  202:bipush          46
	//* 100  204:invokevirtual   #97  <Method StringBuilder StringBuilder.append(char)>
	//* 101  207:pop             
	//* 102  208:aload_0         
	//* 103  209:aload           7
	//* 104  211:bipush          14
	//* 105  213:invokevirtual   #87  <Method int Calendar.get(int)>
	//* 106  216:ldc1            #109 <String "sss">
	//* 107  218:invokevirtual   #42  <Method int String.length()>
	//* 108  221:invokestatic    #93  <Method void padInt(StringBuilder, int, int)>
	//* 109  224:aload_2         
	//* 110  225:aload           7
	//* 111  227:invokevirtual   #113 <Method long Calendar.getTimeInMillis()>
	//* 112  230:invokevirtual   #117 <Method int TimeZone.getOffset(long)>
	//* 113  233:istore          4
	//* 114  235:iload           4
	//* 115  237:ifeq            336
	//* 116  240:iload           4
	//* 117  242:ldc1            #118 <Int 60000>
	//* 118  244:idiv            
	//* 119  245:bipush          60
	//* 120  247:idiv            
	//* 121  248:invokestatic    #123 <Method int Math.abs(int)>
	//* 122  251:istore          5
	//* 123  253:iload           4
	//* 124  255:ldc1            #118 <Int 60000>
	//* 125  257:idiv            
	//* 126  258:bipush          60
	//* 127  260:irem            
	//* 128  261:invokestatic    #123 <Method int Math.abs(int)>
	//* 129  264:istore          6
	//* 130  266:iload           4
	//* 131  268:ifge            330
	//* 132  271:bipush          45
	//* 133  273:istore_3        
	//* 134  274:aload_0         
	//* 135  275:iload_3         
	//* 136  276:invokevirtual   #97  <Method StringBuilder StringBuilder.append(char)>
	//* 137  279:pop             
	//* 138  280:aload_0         
	//* 139  281:iload           5
	//* 140  283:ldc1            #103 <String "hh">
	//* 141  285:invokevirtual   #42  <Method int String.length()>
	//* 142  288:invokestatic    #93  <Method void padInt(StringBuilder, int, int)>
	//* 143  291:aload_0         
	//* 144  292:bipush          58
	//* 145  294:invokevirtual   #97  <Method StringBuilder StringBuilder.append(char)>
	//* 146  297:pop             
	//* 147  298:aload_0         
	//* 148  299:iload           6
	//* 149  301:ldc1            #105 <String "mm">
	//* 150  303:invokevirtual   #42  <Method int String.length()>
	//* 151  306:invokestatic    #93  <Method void padInt(StringBuilder, int, int)>
	//* 152  309:aload_0         
	//* 153  310:invokevirtual   #127 <Method String StringBuilder.toString()>
	//* 154  313:areturn         
			i = 0;
	//  155  314:iconst_0        
	//  156  315:istore          4
		if(timezone.getRawOffset() == 0)
			j = "Z".length();
		else
	//* 157  317:goto            37
			j = "+hh:mm".length();
	//  158  320:ldc1            #129 <String "+hh:mm">
	//  159  322:invokevirtual   #42  <Method int String.length()>
	//  160  325:istore          5
		date = ((Date) (new StringBuilder(k + i + j)));
		padInt(((StringBuilder) (date)), ((Calendar) (gregoriancalendar)).get(1), "yyyy".length());
		((StringBuilder) (date)).append('-');
		padInt(((StringBuilder) (date)), ((Calendar) (gregoriancalendar)).get(2) + 1, "MM".length());
		((StringBuilder) (date)).append('-');
		padInt(((StringBuilder) (date)), ((Calendar) (gregoriancalendar)).get(5), "dd".length());
		((StringBuilder) (date)).append('T');
		padInt(((StringBuilder) (date)), ((Calendar) (gregoriancalendar)).get(11), "hh".length());
		((StringBuilder) (date)).append(':');
		padInt(((StringBuilder) (date)), ((Calendar) (gregoriancalendar)).get(12), "mm".length());
		((StringBuilder) (date)).append(':');
		padInt(((StringBuilder) (date)), ((Calendar) (gregoriancalendar)).get(13), "ss".length());
		if(flag)
		{
			((StringBuilder) (date)).append('.');
			padInt(((StringBuilder) (date)), ((Calendar) (gregoriancalendar)).get(14), "sss".length());
		}
		i = timezone.getOffset(((Calendar) (gregoriancalendar)).getTimeInMillis());
		if(i != 0)
		{
			j = Math.abs(i / 60000 / 60);
			int l = Math.abs((i / 60000) % 60);
			char c;
			if(i < 0)
				c = '-';
			else
	//* 161  327:goto            51
				c = '+';
	//  162  330:bipush          43
	//  163  332:istore_3        
			((StringBuilder) (date)).append(c);
			padInt(((StringBuilder) (date)), j, "hh".length());
			((StringBuilder) (date)).append(':');
			padInt(((StringBuilder) (date)), l, "mm".length());
		} else
	//* 164  333:goto            274
		{
			((StringBuilder) (date)).append('Z');
	//  165  336:aload_0         
	//  166  337:bipush          90
	//  167  339:invokevirtual   #97  <Method StringBuilder StringBuilder.append(char)>
	//  168  342:pop             
		}
		return ((StringBuilder) (date)).toString();
	//* 169  343:goto            309
	}

	private static int indexOfNonDigit(String s, int i)
	{
		for(; i < s.length(); i++)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #42  <Method int String.length()>
	//*   3    5:icmpge          35
		{
			char c = s.charAt(i);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokevirtual   #46  <Method char String.charAt(int)>
	//    7   13:istore_2        
			if(c < '0' || c > '9')
	//*   8   14:iload_2         
	//*   9   15:bipush          48
	//*  10   17:icmplt          26
	//*  11   20:iload_2         
	//*  12   21:bipush          57
	//*  13   23:icmple          28
				return i;
	//   14   26:iload_1         
	//   15   27:ireturn         
		}

	//   16   28:iload_1         
	//   17   29:iconst_1        
	//   18   30:iadd            
	//   19   31:istore_1        
	//*  20   32:goto            0
		return s.length();
	//   21   35:aload_0         
	//   22   36:invokevirtual   #42  <Method int String.length()>
	//   23   39:ireturn         
	}

	public static void main(String args[])
	{
		do
		{
			long l = System.currentTimeMillis();
	//    0    0:invokestatic    #138 <Method long System.currentTimeMillis()>
	//    1    3:lstore_2        
			int i = test1(0x3d090, 3);
	//    2    4:ldc1            #139 <Int 0x3d090>
	//    3    6:iconst_3        
	//    4    7:invokestatic    #143 <Method int test1(int, int)>
	//    5   10:istore_1        
			long l1 = System.currentTimeMillis();
	//    6   11:invokestatic    #138 <Method long System.currentTimeMillis()>
	//    7   14:lstore          4
			System.out.println((new StringBuilder()).append("Pow (").append(i).append(") -> ").append(l1 - l).append(" ms").toString());
	//    8   16:getstatic       #147 <Field PrintStream System.out>
	//    9   19:new             #80  <Class StringBuilder>
	//   10   22:dup             
	//   11   23:invokespecial   #148 <Method void StringBuilder()>
	//   12   26:ldc1            #150 <String "Pow (">
	//   13   28:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   14   31:iload_1         
	//   15   32:invokevirtual   #156 <Method StringBuilder StringBuilder.append(int)>
	//   16   35:ldc1            #158 <String ") -> ">
	//   17   37:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   18   40:lload           4
	//   19   42:lload_2         
	//   20   43:lsub            
	//   21   44:invokevirtual   #161 <Method StringBuilder StringBuilder.append(long)>
	//   22   47:ldc1            #163 <String " ms">
	//   23   49:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   24   52:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   25   55:invokevirtual   #169 <Method void PrintStream.println(String)>
			l = System.currentTimeMillis();
	//   26   58:invokestatic    #138 <Method long System.currentTimeMillis()>
	//   27   61:lstore_2        
			i = test2(0x3d090, 3);
	//   28   62:ldc1            #139 <Int 0x3d090>
	//   29   64:iconst_3        
	//   30   65:invokestatic    #172 <Method int test2(int, int)>
	//   31   68:istore_1        
			l1 = System.currentTimeMillis();
	//   32   69:invokestatic    #138 <Method long System.currentTimeMillis()>
	//   33   72:lstore          4
			System.out.println((new StringBuilder()).append("Iter (").append(i).append(") -> ").append(l1 - l).append(" ms").toString());
	//   34   74:getstatic       #147 <Field PrintStream System.out>
	//   35   77:new             #80  <Class StringBuilder>
	//   36   80:dup             
	//   37   81:invokespecial   #148 <Method void StringBuilder()>
	//   38   84:ldc1            #174 <String "Iter (">
	//   39   86:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   40   89:iload_1         
	//   41   90:invokevirtual   #156 <Method StringBuilder StringBuilder.append(int)>
	//   42   93:ldc1            #158 <String ") -> ">
	//   43   95:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   44   98:lload           4
	//   45  100:lload_2         
	//   46  101:lsub            
	//   47  102:invokevirtual   #161 <Method StringBuilder StringBuilder.append(long)>
	//   48  105:ldc1            #163 <String " ms">
	//   49  107:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   50  110:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   51  113:invokevirtual   #169 <Method void PrintStream.println(String)>
		} while(true);
	//   52  116:goto            0
	}

	private static void padInt(StringBuilder stringbuilder, int i, int j)
	{
		String s = Integer.toString(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #179 <Method String Integer.toString(int)>
	//    2    4:astore_3        
		for(i = j - s.length(); i > 0; i--)
	//*   3    5:iload_2         
	//*   4    6:aload_3         
	//*   5    7:invokevirtual   #42  <Method int String.length()>
	//*   6   10:isub            
	//*   7   11:istore_1        
	//*   8   12:iload_1         
	//*   9   13:ifle            30
			stringbuilder.append('0');
	//   10   16:aload_0         
	//   11   17:bipush          48
	//   12   19:invokevirtual   #97  <Method StringBuilder StringBuilder.append(char)>
	//   13   22:pop             

	//   14   23:iload_1         
	//   15   24:iconst_1        
	//   16   25:isub            
	//   17   26:istore_1        
	//*  18   27:goto            12
		stringbuilder.append(s);
	//   19   30:aload_0         
	//   20   31:aload_3         
	//   21   32:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   22   35:pop             
	//   23   36:return          
	}

	public static Date parse(String s, ParsePosition parseposition)
		throws ParseException
	{
		int i = parseposition.getIndex();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #194 <Method int ParsePosition.getIndex()>
	//    2    4:istore_3        
		int j = i + 4;
	//    3    5:iload_3         
	//    4    6:iconst_4        
	//    5    7:iadd            
	//    6    8:istore          4
		int j2 = parseInt(s, i, j);
	//    7   10:aload_0         
	//    8   11:iload_3         
	//    9   12:iload           4
	//   10   14:invokestatic    #198 <Method int parseInt(String, int, int)>
	//   11   17:istore          13
		i = j;
	//   12   19:iload           4
	//   13   21:istore_3        
		if(checkOffset(s, j, '-'))
	//*  14   22:aload_0         
	//*  15   23:iload           4
	//*  16   25:bipush          45
	//*  17   27:invokestatic    #200 <Method boolean checkOffset(String, int, char)>
	//*  18   30:ifeq            38
			i = j + 1;
	//   19   33:iload           4
	//   20   35:iconst_1        
	//   21   36:iadd            
	//   22   37:istore_3        
		j = i + 2;
	//   23   38:iload_3         
	//   24   39:iconst_2        
	//   25   40:iadd            
	//   26   41:istore          4
		int k2 = parseInt(s, i, j);
	//   27   43:aload_0         
	//   28   44:iload_3         
	//   29   45:iload           4
	//   30   47:invokestatic    #198 <Method int parseInt(String, int, int)>
	//   31   50:istore          14
		char c;
		int k;
		int l;
		int i1;
		int j1;
		int k1;
		int l1;
		Object obj1;
		boolean flag;
		int i2;
		int l2;
		boolean flag1;
		Object obj;
		Object obj2;
		String s1;
		String s2;
		if(checkOffset(s, j, '-'))
	//*  32   52:aload_0         
	//*  33   53:iload           4
	//*  34   55:bipush          45
	//*  35   57:invokestatic    #200 <Method boolean checkOffset(String, int, char)>
	//*  36   60:ifeq            920
			i = j + 1;
	//   37   63:iload           4
	//   38   65:iconst_1        
	//   39   66:iadd            
	//   40   67:istore_3        
		else
	//*  41   68:iload_3         
	//*  42   69:iconst_2        
	//*  43   70:iadd            
	//*  44   71:istore          9
	//*  45   73:aload_0         
	//*  46   74:iload_3         
	//*  47   75:iload           9
	//*  48   77:invokestatic    #198 <Method int parseInt(String, int, int)>
	//*  49   80:istore          15
	//*  50   82:iconst_0        
	//*  51   83:istore          5
	//*  52   85:iconst_0        
	//*  53   86:istore          7
	//*  54   88:iconst_0        
	//*  55   89:istore          4
	//*  56   91:iconst_0        
	//*  57   92:istore          11
	//*  58   94:aload_0         
	//*  59   95:iload           9
	//*  60   97:bipush          84
	//*  61   99:invokestatic    #200 <Method boolean checkOffset(String, int, char)>
	//*  62  102:istore          16
	//*  63  104:iload           16
	//*  64  106:ifne            147
	//*  65  109:aload_0         
	//*  66  110:invokevirtual   #42  <Method int String.length()>
	//*  67  113:iload           9
	//*  68  115:icmpgt          147
	//*  69  118:new             #54  <Class GregorianCalendar>
	//*  70  121:dup             
	//*  71  122:iload           13
	//*  72  124:iload           14
	//*  73  126:iconst_1        
	//*  74  127:isub            
	//*  75  128:iload           15
	//*  76  130:invokespecial   #203 <Method void GregorianCalendar(int, int, int)>
	//*  77  133:astore          17
	//*  78  135:aload_1         
	//*  79  136:iload           9
	//*  80  138:invokevirtual   #206 <Method void ParsePosition.setIndex(int)>
	//*  81  141:aload           17
	//*  82  143:invokevirtual   #210 <Method Date Calendar.getTime()>
	//*  83  146:areturn         
	//*  84  147:iload           11
	//*  85  149:istore          6
	//*  86  151:iload           9
	//*  87  153:istore_3        
	//*  88  154:iload           4
	//*  89  156:istore          8
	//*  90  158:iload           16
	//*  91  160:ifeq            396
	//*  92  163:iload           9
	//*  93  165:iconst_1        
	//*  94  166:iadd            
	//*  95  167:istore_3        
	//*  96  168:iload_3         
	//*  97  169:iconst_2        
	//*  98  170:iadd            
	//*  99  171:istore          5
	//* 100  173:aload_0         
	//* 101  174:iload_3         
	//* 102  175:iload           5
	//* 103  177:invokestatic    #198 <Method int parseInt(String, int, int)>
	//* 104  180:istore          9
	//* 105  182:iload           5
	//* 106  184:istore_3        
	//* 107  185:aload_0         
	//* 108  186:iload           5
	//* 109  188:bipush          58
	//* 110  190:invokestatic    #200 <Method boolean checkOffset(String, int, char)>
	//* 111  193:ifeq            201
	//* 112  196:iload           5
	//* 113  198:iconst_1        
	//* 114  199:iadd            
	//* 115  200:istore_3        
	//* 116  201:iload_3         
	//* 117  202:iconst_2        
	//* 118  203:iadd            
	//* 119  204:istore          5
	//* 120  206:aload_0         
	//* 121  207:iload_3         
	//* 122  208:iload           5
	//* 123  210:invokestatic    #198 <Method int parseInt(String, int, int)>
	//* 124  213:istore          10
	//* 125  215:aload_0         
	//* 126  216:iload           5
	//* 127  218:bipush          58
	//* 128  220:invokestatic    #200 <Method boolean checkOffset(String, int, char)>
	//* 129  223:ifeq            914
	//* 130  226:iload           5
	//* 131  228:iconst_1        
	//* 132  229:iadd            
	//* 133  230:istore_3        
	//* 134  231:aload_0         
	//* 135  232:invokevirtual   #42  <Method int String.length()>
	//* 136  235:iload_3         
	//* 137  236:icmple          895
	//* 138  239:aload_0         
	//* 139  240:iload_3         
	//* 140  241:invokevirtual   #46  <Method char String.charAt(int)>
	//* 141  244:istore          5
	//* 142  246:iload           5
	//* 143  248:bipush          90
	//* 144  250:icmpeq          895
	//* 145  253:iload           5
	//* 146  255:bipush          43
	//* 147  257:icmpeq          895
	//* 148  260:iload           5
	//* 149  262:bipush          45
	//* 150  264:icmpeq          895
	//* 151  267:iload_3         
	//* 152  268:iconst_2        
	//* 153  269:iadd            
	//* 154  270:istore          12
	//* 155  272:aload_0         
	//* 156  273:iload_3         
	//* 157  274:iload           12
	//* 158  276:invokestatic    #198 <Method int parseInt(String, int, int)>
	//* 159  279:istore_3        
	//* 160  280:iload_3         
	//* 161  281:istore          4
	//* 162  283:iload_3         
	//* 163  284:bipush          59
	//* 164  286:icmple          302
	//* 165  289:iload_3         
	//* 166  290:istore          4
	//* 167  292:iload_3         
	//* 168  293:bipush          63
	//* 169  295:icmpge          302
	//* 170  298:bipush          59
	//* 171  300:istore          4
	//* 172  302:iload           9
	//* 173  304:istore          5
	//* 174  306:iload           11
	//* 175  308:istore          6
	//* 176  310:iload           10
	//* 177  312:istore          7
	//* 178  314:iload           12
	//* 179  316:istore_3        
	//* 180  317:iload           4
	//* 181  319:istore          8
	//* 182  321:aload_0         
	//* 183  322:iload           12
	//* 184  324:bipush          46
	//* 185  326:invokestatic    #200 <Method boolean checkOffset(String, int, char)>
	//* 186  329:ifeq            396
	//* 187  332:iload           12
	//* 188  334:iconst_1        
	//* 189  335:iadd            
	//* 190  336:istore          5
	//* 191  338:aload_0         
	//* 192  339:iload           5
	//* 193  341:iconst_1        
	//* 194  342:iadd            
	//* 195  343:invokestatic    #212 <Method int indexOfNonDigit(String, int)>
	//* 196  346:istore          8
	//* 197  348:iload           8
	//* 198  350:iload           5
	//* 199  352:iconst_3        
	//* 200  353:iadd            
	//* 201  354:invokestatic    #215 <Method int Math.min(int, int)>
	//* 202  357:istore          6
	//* 203  359:aload_0         
	//* 204  360:iload           5
	//* 205  362:iload           6
	//* 206  364:invokestatic    #198 <Method int parseInt(String, int, int)>
	//* 207  367:istore_3        
	//* 208  368:iload           6
	//* 209  370:iload           5
	//* 210  372:isub            
	//* 211  373:tableswitch     1 2: default 926
	//	               1 537
	//	               2 529
	//* 212  396:aload_0         
	//* 213  397:invokevirtual   #42  <Method int String.length()>
	//* 214  400:iload_3         
	//* 215  401:icmpgt          545
	//* 216  404:new             #189 <Class IllegalArgumentException>
	//* 217  407:dup             
	//* 218  408:ldc1            #217 <String "No time zone indicator">
	//* 219  410:invokespecial   #219 <Method void IllegalArgumentException(String)>
	//* 220  413:athrow          
	//* 221  414:astore          17
	//* 222  416:aload_0         
	//* 223  417:ifnonnull       866
	//* 224  420:aconst_null     
	//* 225  421:astore_0        
	//* 226  422:aload           17
	//* 227  424:invokevirtual   #224 <Method String Exception.getMessage()>
	//* 228  427:astore          19
	//* 229  429:aload           19
	//* 230  431:ifnull          446
	//* 231  434:aload           19
	//* 232  436:astore          18
	//* 233  438:aload           19
	//* 234  440:invokevirtual   #228 <Method boolean String.isEmpty()>
	//* 235  443:ifeq            479
	//* 236  446:new             #80  <Class StringBuilder>
	//* 237  449:dup             
	//* 238  450:invokespecial   #148 <Method void StringBuilder()>
	//* 239  453:ldc1            #230 <String "(">
	//* 240  455:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//* 241  458:aload           17
	//* 242  460:invokevirtual   #234 <Method Class Object.getClass()>
	//* 243  463:invokevirtual   #239 <Method String Class.getName()>
	//* 244  466:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//* 245  469:ldc1            #241 <String ")">
	//* 246  471:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//* 247  474:invokevirtual   #127 <Method String StringBuilder.toString()>
	//* 248  477:astore          18
	//* 249  479:new             #183 <Class ParseException>
	//* 250  482:dup             
	//* 251  483:new             #80  <Class StringBuilder>
	//* 252  486:dup             
	//* 253  487:invokespecial   #148 <Method void StringBuilder()>
	//* 254  490:ldc1            #243 <String "Failed to parse date [">
	//* 255  492:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//* 256  495:aload_0         
	//* 257  496:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//* 258  499:ldc1            #245 <String "]: ">
	//* 259  501:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//* 260  504:aload           18
	//* 261  506:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//* 262  509:invokevirtual   #127 <Method String StringBuilder.toString()>
	//* 263  512:aload_1         
	//* 264  513:invokevirtual   #194 <Method int ParsePosition.getIndex()>
	//* 265  516:invokespecial   #248 <Method void ParseException(String, int)>
	//* 266  519:astore_0        
	//* 267  520:aload_0         
	//* 268  521:aload           17
	//* 269  523:invokevirtual   #252 <Method Throwable ParseException.initCause(Throwable)>
	//* 270  526:pop             
	//* 271  527:aload_0         
	//* 272  528:athrow          
	//* 273  529:iload_3         
	//* 274  530:bipush          10
	//* 275  532:imul            
	//* 276  533:istore_3        
	//* 277  534:goto            926
	//* 278  537:iload_3         
	//* 279  538:bipush          100
	//* 280  540:imul            
	//* 281  541:istore_3        
	//* 282  542:goto            926
	//* 283  545:aload_0         
	//* 284  546:iload_3         
	//* 285  547:invokevirtual   #46  <Method char String.charAt(int)>
	//* 286  550:istore_2        
	//* 287  551:iload_2         
	//* 288  552:bipush          90
	//* 289  554:icmpne          947
	//* 290  557:getstatic       #30  <Field TimeZone TIMEZONE_Z>
	//* 291  560:astore          17
	//* 292  562:iload_3         
	//* 293  563:iconst_1        
	//* 294  564:iadd            
	//* 295  565:istore_3        
	//* 296  566:new             #54  <Class GregorianCalendar>
	//* 297  569:dup             
	//* 298  570:aload           17
	//* 299  572:invokespecial   #255 <Method void GregorianCalendar(TimeZone)>
	//* 300  575:astore          17
	//* 301  577:aload           17
	//* 302  579:iconst_0        
	//* 303  580:invokevirtual   #259 <Method void Calendar.setLenient(boolean)>
	//* 304  583:aload           17
	//* 305  585:iconst_1        
	//* 306  586:iload           13
	//* 307  588:invokevirtual   #263 <Method void Calendar.set(int, int)>
	//* 308  591:aload           17
	//* 309  593:iconst_2        
	//* 310  594:iload           14
	//* 311  596:iconst_1        
	//* 312  597:isub            
	//* 313  598:invokevirtual   #263 <Method void Calendar.set(int, int)>
	//* 314  601:aload           17
	//* 315  603:iconst_5        
	//* 316  604:iload           15
	//* 317  606:invokevirtual   #263 <Method void Calendar.set(int, int)>
	//* 318  609:aload           17
	//* 319  611:bipush          11
	//* 320  613:iload           5
	//* 321  615:invokevirtual   #263 <Method void Calendar.set(int, int)>
	//* 322  618:aload           17
	//* 323  620:bipush          12
	//* 324  622:iload           7
	//* 325  624:invokevirtual   #263 <Method void Calendar.set(int, int)>
	//* 326  627:aload           17
	//* 327  629:bipush          13
	//* 328  631:iload           8
	//* 329  633:invokevirtual   #263 <Method void Calendar.set(int, int)>
	//* 330  636:aload           17
	//* 331  638:bipush          14
	//* 332  640:iload           6
	//* 333  642:invokevirtual   #263 <Method void Calendar.set(int, int)>
	//* 334  645:aload_1         
	//* 335  646:iload_3         
	//* 336  647:invokevirtual   #206 <Method void ParsePosition.setIndex(int)>
	//* 337  650:aload           17
	//* 338  652:invokevirtual   #210 <Method Date Calendar.getTime()>
	//* 339  655:areturn         
	//* 340  656:aload_0         
	//* 341  657:iload_3         
	//* 342  658:invokevirtual   #266 <Method String String.substring(int)>
	//* 343  661:astore          17
	//* 344  663:iload_3         
	//* 345  664:aload           17
	//* 346  666:invokevirtual   #42  <Method int String.length()>
	//* 347  669:iadd            
	//* 348  670:istore          4
	//* 349  672:ldc2            #268 <String "+0000">
	//* 350  675:aload           17
	//* 351  677:invokevirtual   #272 <Method boolean String.equals(Object)>
	//* 352  680:ifne            694
	//* 353  683:ldc2            #274 <String "+00:00">
	//* 354  686:aload           17
	//* 355  688:invokevirtual   #272 <Method boolean String.equals(Object)>
	//* 356  691:ifeq            705
	//* 357  694:getstatic       #30  <Field TimeZone TIMEZONE_Z>
	//* 358  697:astore          17
	//* 359  699:iload           4
	//* 360  701:istore_3        
	//* 361  702:goto            566
	//* 362  705:new             #80  <Class StringBuilder>
	//* 363  708:dup             
	//* 364  709:invokespecial   #148 <Method void StringBuilder()>
	//* 365  712:ldc1            #8   <String "GMT">
	//* 366  714:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//* 367  717:aload           17
	//* 368  719:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//* 369  722:invokevirtual   #127 <Method String StringBuilder.toString()>
	//* 370  725:astore          19
	//* 371  727:aload           19
	//* 372  729:invokestatic    #24  <Method TimeZone TimeZone.getTimeZone(String)>
	//* 373  732:astore          18
	//* 374  734:aload           18
	//* 375  736:invokevirtual   #277 <Method String TimeZone.getID()>
	//* 376  739:astore          20
	//* 377  741:iload           4
	//* 378  743:istore_3        
	//* 379  744:aload           18
	//* 380  746:astore          17
	//* 381  748:aload           20
	//* 382  750:aload           19
	//* 383  752:invokevirtual   #272 <Method boolean String.equals(Object)>
	//* 384  755:ifne            566
	//* 385  758:iload           4
	//* 386  760:istore_3        
	//* 387  761:aload           18
	//* 388  763:astore          17
	//* 389  765:aload           20
	//* 390  767:ldc2            #279 <String ":">
	//* 391  770:ldc2            #281 <String "">
	//* 392  773:invokevirtual   #285 <Method String String.replace(CharSequence, CharSequence)>
	//* 393  776:aload           19
	//* 394  778:invokevirtual   #272 <Method boolean String.equals(Object)>
	//* 395  781:ifne            566
	//* 396  784:new             #185 <Class IndexOutOfBoundsException>
	//* 397  787:dup             
	//* 398  788:new             #80  <Class StringBuilder>
	//* 399  791:dup             
	//* 400  792:invokespecial   #148 <Method void StringBuilder()>
	//* 401  795:ldc2            #287 <String "Mismatching time zone indicator: ">
	//* 402  798:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//* 403  801:aload           19
	//* 404  803:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//* 405  806:ldc2            #289 <String " given, resolves to ">
	//* 406  809:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//* 407  812:aload           18
	//* 408  814:invokevirtual   #277 <Method String TimeZone.getID()>
	//* 409  817:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//* 410  820:invokevirtual   #127 <Method String StringBuilder.toString()>
	//* 411  823:invokespecial   #290 <Method void IndexOutOfBoundsException(String)>
	//* 412  826:athrow          
	//* 413  827:new             #185 <Class IndexOutOfBoundsException>
	//* 414  830:dup             
	//* 415  831:new             #80  <Class StringBuilder>
	//* 416  834:dup             
	//* 417  835:invokespecial   #148 <Method void StringBuilder()>
	//* 418  838:ldc2            #292 <String "Invalid time zone indicator '">
	//* 419  841:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//* 420  844:iload_2         
	//* 421  845:invokevirtual   #97  <Method StringBuilder StringBuilder.append(char)>
	//* 422  848:ldc2            #294 <String "'">
	//* 423  851:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//* 424  854:invokevirtual   #127 <Method String StringBuilder.toString()>
	//* 425  857:invokespecial   #290 <Method void IndexOutOfBoundsException(String)>
	//* 426  860:athrow          
	//* 427  861:astore          17
	//* 428  863:goto            416
	//* 429  866:new             #80  <Class StringBuilder>
	//* 430  869:dup             
	//* 431  870:invokespecial   #148 <Method void StringBuilder()>
	//* 432  873:bipush          34
	//* 433  875:invokevirtual   #97  <Method StringBuilder StringBuilder.append(char)>
	//* 434  878:aload_0         
	//* 435  879:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//* 436  882:ldc2            #294 <String "'">
	//* 437  885:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//* 438  888:invokevirtual   #127 <Method String StringBuilder.toString()>
	//* 439  891:astore_0        
	//* 440  892:goto            422
	//* 441  895:iload           9
	//* 442  897:istore          5
	//* 443  899:iload           11
	//* 444  901:istore          6
	//* 445  903:iload           10
	//* 446  905:istore          7
	//* 447  907:iload           4
	//* 448  909:istore          8
	//* 449  911:goto            396
	//* 450  914:iload           5
	//* 451  916:istore_3        
	//* 452  917:goto            231
			i = j;
	//  453  920:iload           4
	//  454  922:istore_3        
		k1 = i + 2;
		l2 = parseInt(s, i, k1);
		k = 0;
		i1 = 0;
		j = 0;
		flag = false;
		flag1 = checkOffset(s, k1, 'T');
		if(flag1)
			break MISSING_BLOCK_LABEL_147;
		if(s.length() <= k1)
		{
			obj = ((Object) (new GregorianCalendar(j2, k2 - 1, l2)));
			parseposition.setIndex(k1);
			return ((Calendar) (obj)).getTime();
		}
		l = ((int) (flag));
		i = k1;
		j1 = j;
		if(!flag1) goto _L2; else goto _L1
_L1:
		i = k1 + 1;
		k = i + 2;
		k1 = parseInt(s, i, k);
		i = k;
		if(checkOffset(s, k, ':'))
			i = k + 1;
		k = i + 2;
		l1 = parseInt(s, i, k);
		if(checkOffset(s, k, ':'))
			i = k + 1;
		else
			i = k;
		if(s.length() <= i) goto _L4; else goto _L3
_L3:
		k = ((int) (s.charAt(i)));
		if(k == 90 || k == 43 || k == 45) goto _L4; else goto _L5
_L5:
		i2 = i + 2;
		i = parseInt(s, i, i2);
		j = i;
		if(i > 59)
		{
			j = i;
			if(i < 63)
				j = 59;
		}
		k = k1;
		l = ((int) (flag));
		i1 = l1;
		i = i2;
		j1 = j;
		if(!checkOffset(s, i2, '.')) goto _L2; else goto _L6
_L6:
		k = i2 + 1;
		j1 = indexOfNonDigit(s, k + 1);
		l = Math.min(j1, k + 3);
		i = parseInt(s, k, l);
		break MISSING_BLOCK_LABEL_368;
_L2:
		if(s.length() <= i)
			throw new IllegalArgumentException("No time zone indicator");
		  goto _L7
		obj1;
_L15:
label0:
		{
			if(s == null)
				s = null;
			else
				s = (new StringBuilder()).append('"').append(s).append("'").toString();
			s1 = ((Exception) (obj1)).getMessage();
			if(s1 != null)
			{
				obj2 = ((Object) (s1));
				if(!s1.isEmpty())
					break label0;
			}
			obj2 = ((Object) ((new StringBuilder()).append("(").append(obj1.getClass().getName()).append(")").toString()));
		}
		s = ((String) (new ParseException((new StringBuilder()).append("Failed to parse date [").append(s).append("]: ").append(((String) (obj2))).toString(), parseposition.getIndex())));
		((ParseException) (s)).initCause(((Throwable) (obj1)));
		throw s;
_L7:
		c = s.charAt(i);
		if(c != 'Z') goto _L9; else goto _L8
_L8:
		obj1 = ((Object) (TIMEZONE_Z));
		i++;
_L12:
		obj1 = ((Object) (new GregorianCalendar(((TimeZone) (obj1)))));
		((Calendar) (obj1)).setLenient(false);
		((Calendar) (obj1)).set(1, j2);
		((Calendar) (obj1)).set(2, k2 - 1);
		((Calendar) (obj1)).set(5, l2);
		((Calendar) (obj1)).set(11, k);
		((Calendar) (obj1)).set(12, i1);
		((Calendar) (obj1)).set(13, j1);
		((Calendar) (obj1)).set(14, l);
		parseposition.setIndex(i);
		return ((Calendar) (obj1)).getTime();
_L16:
		obj1 = ((Object) (s.substring(i)));
		j = i + ((String) (obj1)).length();
		if(!"+0000".equals(obj1) && !"+00:00".equals(obj1)) goto _L11; else goto _L10
_L10:
		obj1 = ((Object) (TIMEZONE_Z));
		i = j;
		  goto _L12
_L11:
		s1 = (new StringBuilder()).append("GMT").append(((String) (obj1))).toString();
		obj2 = ((Object) (TimeZone.getTimeZone(s1)));
		s2 = ((TimeZone) (obj2)).getID();
		i = j;
		obj1 = obj2;
		if(s2.equals(((Object) (s1)))) goto _L12; else goto _L13
_L13:
		i = j;
		obj1 = obj2;
		if(s2.replace(":", "").equals(((Object) (s1)))) goto _L12; else goto _L14
_L14:
		throw new IndexOutOfBoundsException((new StringBuilder()).append("Mismatching time zone indicator: ").append(s1).append(" given, resolves to ").append(((TimeZone) (obj2)).getID()).toString());
_L17:
		throw new IndexOutOfBoundsException((new StringBuilder()).append("Invalid time zone indicator '").append(c).append("'").toString());
		obj1;
		  goto _L15
_L4:
		k = k1;
		l = ((int) (flag));
		i1 = l1;
		j1 = j;
		  goto _L2
		switch(l - k)
		{
		case 2: // '\002'
			i *= 10;
			break;

		case 1: // '\001'
			i *= 100;
			break;
		}
	//* 455  923:goto            68
		k = k1;
	//  456  926:iload           9
	//  457  928:istore          5
		l = i;
	//  458  930:iload_3         
	//  459  931:istore          6
		i1 = l1;
	//  460  933:iload           10
	//  461  935:istore          7
		i = j1;
	//  462  937:iload           8
	//  463  939:istore_3        
		j1 = j;
	//  464  940:iload           4
	//  465  942:istore          8
		  goto _L2
	//* 466  944:goto            396
_L9:
		if(c != '+' && c != '-') goto _L17; else goto _L16
	//  467  947:iload_2         
	//  468  948:bipush          43
	//  469  950:icmpeq          656
	//  470  953:iload_2         
	//  471  954:bipush          45
	//  472  956:icmpne          827
	//* 473  959:goto            656
		obj1;
	//  474  962:astore          17
		  goto _L15
	//* 475  964:goto            416
	}

	private static int parseInt(String s, int i, int j)
		throws NumberFormatException
	{
		if(i < 0 || j > s.length() || i > j)
	//*   0    0:iload_1         
	//*   1    1:iflt            17
	//*   2    4:iload_2         
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #42  <Method int String.length()>
	//*   5    9:icmpgt          17
	//*   6   12:iload_1         
	//*   7   13:iload_2         
	//*   8   14:icmple          26
			throw new NumberFormatException(s);
	//    9   17:new             #187 <Class NumberFormatException>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #296 <Method void NumberFormatException(String)>
	//   13   25:athrow          
		int l = 0;
	//   14   26:iconst_0        
	//   15   27:istore          4
		int k;
		if(i < j)
	//*  16   29:iload_1         
	//*  17   30:iload_2         
	//*  18   31:icmpge          169
		{
			k = i + 1;
	//   19   34:iload_1         
	//   20   35:iconst_1        
	//   21   36:iadd            
	//   22   37:istore_3        
			l = Character.digit(s.charAt(i), 10);
	//   23   38:aload_0         
	//   24   39:iload_1         
	//   25   40:invokevirtual   #46  <Method char String.charAt(int)>
	//   26   43:bipush          10
	//   27   45:invokestatic    #302 <Method int Character.digit(char, int)>
	//   28   48:istore          4
			if(l < 0)
	//*  29   50:iload           4
	//*  30   52:ifge            88
				throw new NumberFormatException((new StringBuilder()).append("Invalid number: ").append(s.substring(i, j)).toString());
	//   31   55:new             #187 <Class NumberFormatException>
	//   32   58:dup             
	//   33   59:new             #80  <Class StringBuilder>
	//   34   62:dup             
	//   35   63:invokespecial   #148 <Method void StringBuilder()>
	//   36   66:ldc2            #304 <String "Invalid number: ">
	//   37   69:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   38   72:aload_0         
	//   39   73:iload_1         
	//   40   74:iload_2         
	//   41   75:invokevirtual   #307 <Method String String.substring(int, int)>
	//   42   78:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   43   81:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   44   84:invokespecial   #296 <Method void NumberFormatException(String)>
	//   45   87:athrow          
			l = -l;
	//   46   88:iload           4
	//   47   90:ineg            
	//   48   91:istore          4
		} else
	//*  49   93:iload_3         
	//*  50   94:iload_2         
	//*  51   95:icmpge          165
	//*  52   98:aload_0         
	//*  53   99:iload_3         
	//*  54  100:invokevirtual   #46  <Method char String.charAt(int)>
	//*  55  103:bipush          10
	//*  56  105:invokestatic    #302 <Method int Character.digit(char, int)>
	//*  57  108:istore          5
	//*  58  110:iload           5
	//*  59  112:ifge            148
	//*  60  115:new             #187 <Class NumberFormatException>
	//*  61  118:dup             
	//*  62  119:new             #80  <Class StringBuilder>
	//*  63  122:dup             
	//*  64  123:invokespecial   #148 <Method void StringBuilder()>
	//*  65  126:ldc2            #304 <String "Invalid number: ">
	//*  66  129:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//*  67  132:aload_0         
	//*  68  133:iload_1         
	//*  69  134:iload_2         
	//*  70  135:invokevirtual   #307 <Method String String.substring(int, int)>
	//*  71  138:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//*  72  141:invokevirtual   #127 <Method String StringBuilder.toString()>
	//*  73  144:invokespecial   #296 <Method void NumberFormatException(String)>
	//*  74  147:athrow          
	//*  75  148:iload           4
	//*  76  150:bipush          10
	//*  77  152:imul            
	//*  78  153:iload           5
	//*  79  155:isub            
	//*  80  156:istore          4
	//*  81  158:iload_3         
	//*  82  159:iconst_1        
	//*  83  160:iadd            
	//*  84  161:istore_3        
	//*  85  162:goto            93
	//*  86  165:iload           4
	//*  87  167:ineg            
	//*  88  168:ireturn         
		{
			k = i;
	//   89  169:iload_1         
	//   90  170:istore_3        
		}
		for(; k < j; k++)
		{
			int i1 = Character.digit(s.charAt(k), 10);
			if(i1 < 0)
				throw new NumberFormatException((new StringBuilder()).append("Invalid number: ").append(s.substring(i, j)).toString());
			l = l * 10 - i1;
		}

		return -l;
	//*  91  171:goto            93
	}

	static int test1(int i, int j)
	{
		byte byte0 = 3;
	//    0    0:iconst_3        
	//    1    1:istore_3        
		int k = i;
	//    2    2:iload_0         
	//    3    3:istore_2        
		i = ((int) (byte0));
	//    4    4:iload_3         
	//    5    5:istore_0        
		do
		{
			k--;
	//    6    6:iload_2         
	//    7    7:iconst_1        
	//    8    8:isub            
	//    9    9:istore_2        
			if(k >= 0)
	//*  10   10:iload_2         
	//*  11   11:iflt            27
				i = (int)Math.pow(10D, j);
	//   12   14:ldc2w           #308 <Double 10D>
	//   13   17:iload_1         
	//   14   18:i2d             
	//   15   19:invokestatic    #313 <Method double Math.pow(double, double)>
	//   16   22:d2i             
	//   17   23:istore_0        
			else
	//*  18   24:goto            6
				return i;
	//   19   27:iload_0         
	//   20   28:ireturn         
		} while(true);
	}

	static int test2(int i, int j)
	{
		int l;
		l = 3;
	//    0    0:iconst_3        
	//    1    1:istore_3        
		int k = i;
	//    2    2:iload_0         
	//    3    3:istore_2        
		do
		{
label0:
			{
				int i1 = k - 1;
	//    4    4:iload_2         
	//    5    5:iconst_1        
	//    6    6:isub            
	//    7    7:istore          4
				if(i1 < 0)
					break label0;
	//    8    9:iload           4
	//    9   11:iflt            45
				i = 10;
	//   10   14:bipush          10
	//   11   16:istore_0        
				k = j;
	//   12   17:iload_1         
	//   13   18:istore_2        
				do
				{
					int j1 = k - 1;
	//   14   19:iload_2         
	//   15   20:iconst_1        
	//   16   21:isub            
	//   17   22:istore          5
					l = i;
	//   18   24:iload_0         
	//   19   25:istore_3        
					k = i1;
	//   20   26:iload           4
	//   21   28:istore_2        
					if(j1 <= 0)
						break;
	//   22   29:iload           5
	//   23   31:ifle            4
					i *= 10;
	//   24   34:iload_0         
	//   25   35:bipush          10
	//   26   37:imul            
	//   27   38:istore_0        
					k = j1;
	//   28   39:iload           5
	//   29   41:istore_2        
				} while(true);
	//   30   42:goto            19
			}
		} while(true);
		return l;
	//   31   45:iload_3         
	//   32   46:ireturn         
	}

	public static TimeZone timeZoneGMT()
	{
		return TIMEZONE_GMT;
	//    0    0:getstatic       #26  <Field TimeZone TIMEZONE_GMT>
	//    1    3:areturn         
	}

	private static final String GMT_ID = "GMT";
	private static final TimeZone TIMEZONE_GMT = TimeZone.getTimeZone("GMT");
	private static final TimeZone TIMEZONE_UTC;
	private static final TimeZone TIMEZONE_Z;
	private static final String UTC_ID = "UTC";

	static 
	{
	//    0    0:ldc1            #8   <String "GMT">
	//    1    2:invokestatic    #24  <Method TimeZone TimeZone.getTimeZone(String)>
	//    2    5:putstatic       #26  <Field TimeZone TIMEZONE_GMT>
		TIMEZONE_UTC = TimeZone.getTimeZone("UTC");
	//    3    8:ldc1            #16  <String "UTC">
	//    4   10:invokestatic    #24  <Method TimeZone TimeZone.getTimeZone(String)>
	//    5   13:putstatic       #28  <Field TimeZone TIMEZONE_UTC>
		TIMEZONE_Z = TIMEZONE_UTC;
	//    6   16:getstatic       #28  <Field TimeZone TIMEZONE_UTC>
	//    7   19:putstatic       #30  <Field TimeZone TIMEZONE_Z>
	//*   8   22:return          
	}
}
