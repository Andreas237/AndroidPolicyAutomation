// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind.util;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.*;

public class ISO8601Utils
{

	public ISO8601Utils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:return          
	}

	private static boolean checkOffset(String s, int i, char c)
	{
		return i < s.length() && s.charAt(i) == c;
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #32  <Method int String.length()>
	//    3    5:icmpge          19
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokevirtual   #36  <Method char String.charAt(int)>
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
	//    2    2:getstatic       #20  <Field TimeZone TIMEZONE_UTC>
	//    3    5:invokestatic    #41  <Method String format(Date, boolean, TimeZone)>
	//    4    8:areturn         
	}

	public static String format(Date date, boolean flag)
	{
		return format(date, flag, TIMEZONE_UTC);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:getstatic       #20  <Field TimeZone TIMEZONE_UTC>
	//    3    5:invokestatic    #41  <Method String format(Date, boolean, TimeZone)>
	//    4    8:areturn         
	}

	public static String format(Date date, boolean flag, TimeZone timezone)
	{
		GregorianCalendar gregoriancalendar = new GregorianCalendar(timezone, Locale.US);
	//    0    0:new             #44  <Class GregorianCalendar>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:getstatic       #50  <Field Locale Locale.US>
	//    4    8:invokespecial   #53  <Method void GregorianCalendar(TimeZone, Locale)>
	//    5   11:astore          7
		((Calendar) (gregoriancalendar)).setTime(date);
	//    6   13:aload           7
	//    7   15:aload_0         
	//    8   16:invokevirtual   #59  <Method void Calendar.setTime(Date)>
		int l = "yyyy-MM-ddThh:mm:ss".length();
	//    9   19:ldc1            #61  <String "yyyy-MM-ddThh:mm:ss">
	//   10   21:invokevirtual   #32  <Method int String.length()>
	//   11   24:istore          6
		int i;
		if(flag)
	//*  12   26:iload_1         
	//*  13   27:ifeq            40
			i = ".sss".length();
	//   14   30:ldc1            #63  <String ".sss">
	//   15   32:invokevirtual   #32  <Method int String.length()>
	//   16   35:istore          4
		else
	//*  17   37:goto            43
			i = 0;
	//   18   40:iconst_0        
	//   19   41:istore          4
		int j;
		if(timezone.getRawOffset() == 0)
	//*  20   43:aload_2         
	//*  21   44:invokevirtual   #66  <Method int TimeZone.getRawOffset()>
	//*  22   47:ifne            60
			j = "Z".length();
	//   23   50:ldc1            #68  <String "Z">
	//   24   52:invokevirtual   #32  <Method int String.length()>
	//   25   55:istore          5
		else
	//*  26   57:goto            67
			j = "+hh:mm".length();
	//   27   60:ldc1            #70  <String "+hh:mm">
	//   28   62:invokevirtual   #32  <Method int String.length()>
	//   29   65:istore          5
		date = ((Date) (new StringBuilder(l + i + j)));
	//   30   67:new             #72  <Class StringBuilder>
	//   31   70:dup             
	//   32   71:iload           6
	//   33   73:iload           4
	//   34   75:iadd            
	//   35   76:iload           5
	//   36   78:iadd            
	//   37   79:invokespecial   #75  <Method void StringBuilder(int)>
	//   38   82:astore_0        
		padInt(((StringBuilder) (date)), ((Calendar) (gregoriancalendar)).get(1), "yyyy".length());
	//   39   83:aload_0         
	//   40   84:aload           7
	//   41   86:iconst_1        
	//   42   87:invokevirtual   #79  <Method int Calendar.get(int)>
	//   43   90:ldc1            #81  <String "yyyy">
	//   44   92:invokevirtual   #32  <Method int String.length()>
	//   45   95:invokestatic    #85  <Method void padInt(StringBuilder, int, int)>
		((StringBuilder) (date)).append('-');
	//   46   98:aload_0         
	//   47   99:bipush          45
	//   48  101:invokevirtual   #89  <Method StringBuilder StringBuilder.append(char)>
	//   49  104:pop             
		padInt(((StringBuilder) (date)), ((Calendar) (gregoriancalendar)).get(2) + 1, "MM".length());
	//   50  105:aload_0         
	//   51  106:aload           7
	//   52  108:iconst_2        
	//   53  109:invokevirtual   #79  <Method int Calendar.get(int)>
	//   54  112:iconst_1        
	//   55  113:iadd            
	//   56  114:ldc1            #91  <String "MM">
	//   57  116:invokevirtual   #32  <Method int String.length()>
	//   58  119:invokestatic    #85  <Method void padInt(StringBuilder, int, int)>
		((StringBuilder) (date)).append('-');
	//   59  122:aload_0         
	//   60  123:bipush          45
	//   61  125:invokevirtual   #89  <Method StringBuilder StringBuilder.append(char)>
	//   62  128:pop             
		padInt(((StringBuilder) (date)), ((Calendar) (gregoriancalendar)).get(5), "dd".length());
	//   63  129:aload_0         
	//   64  130:aload           7
	//   65  132:iconst_5        
	//   66  133:invokevirtual   #79  <Method int Calendar.get(int)>
	//   67  136:ldc1            #93  <String "dd">
	//   68  138:invokevirtual   #32  <Method int String.length()>
	//   69  141:invokestatic    #85  <Method void padInt(StringBuilder, int, int)>
		((StringBuilder) (date)).append('T');
	//   70  144:aload_0         
	//   71  145:bipush          84
	//   72  147:invokevirtual   #89  <Method StringBuilder StringBuilder.append(char)>
	//   73  150:pop             
		padInt(((StringBuilder) (date)), ((Calendar) (gregoriancalendar)).get(11), "hh".length());
	//   74  151:aload_0         
	//   75  152:aload           7
	//   76  154:bipush          11
	//   77  156:invokevirtual   #79  <Method int Calendar.get(int)>
	//   78  159:ldc1            #95  <String "hh">
	//   79  161:invokevirtual   #32  <Method int String.length()>
	//   80  164:invokestatic    #85  <Method void padInt(StringBuilder, int, int)>
		((StringBuilder) (date)).append(':');
	//   81  167:aload_0         
	//   82  168:bipush          58
	//   83  170:invokevirtual   #89  <Method StringBuilder StringBuilder.append(char)>
	//   84  173:pop             
		padInt(((StringBuilder) (date)), ((Calendar) (gregoriancalendar)).get(12), "mm".length());
	//   85  174:aload_0         
	//   86  175:aload           7
	//   87  177:bipush          12
	//   88  179:invokevirtual   #79  <Method int Calendar.get(int)>
	//   89  182:ldc1            #97  <String "mm">
	//   90  184:invokevirtual   #32  <Method int String.length()>
	//   91  187:invokestatic    #85  <Method void padInt(StringBuilder, int, int)>
		((StringBuilder) (date)).append(':');
	//   92  190:aload_0         
	//   93  191:bipush          58
	//   94  193:invokevirtual   #89  <Method StringBuilder StringBuilder.append(char)>
	//   95  196:pop             
		padInt(((StringBuilder) (date)), ((Calendar) (gregoriancalendar)).get(13), "ss".length());
	//   96  197:aload_0         
	//   97  198:aload           7
	//   98  200:bipush          13
	//   99  202:invokevirtual   #79  <Method int Calendar.get(int)>
	//  100  205:ldc1            #99  <String "ss">
	//  101  207:invokevirtual   #32  <Method int String.length()>
	//  102  210:invokestatic    #85  <Method void padInt(StringBuilder, int, int)>
		if(flag)
	//* 103  213:iload_1         
	//* 104  214:ifeq            240
		{
			((StringBuilder) (date)).append('.');
	//  105  217:aload_0         
	//  106  218:bipush          46
	//  107  220:invokevirtual   #89  <Method StringBuilder StringBuilder.append(char)>
	//  108  223:pop             
			padInt(((StringBuilder) (date)), ((Calendar) (gregoriancalendar)).get(14), "sss".length());
	//  109  224:aload_0         
	//  110  225:aload           7
	//  111  227:bipush          14
	//  112  229:invokevirtual   #79  <Method int Calendar.get(int)>
	//  113  232:ldc1            #101 <String "sss">
	//  114  234:invokevirtual   #32  <Method int String.length()>
	//  115  237:invokestatic    #85  <Method void padInt(StringBuilder, int, int)>
		}
		i = timezone.getOffset(((Calendar) (gregoriancalendar)).getTimeInMillis());
	//  116  240:aload_2         
	//  117  241:aload           7
	//  118  243:invokevirtual   #105 <Method long Calendar.getTimeInMillis()>
	//  119  246:invokevirtual   #109 <Method int TimeZone.getOffset(long)>
	//  120  249:istore          4
		if(i != 0)
	//* 121  251:iload           4
	//* 122  253:ifeq            334
		{
			int k = Math.abs(i / 60000 / 60);
	//  123  256:iload           4
	//  124  258:ldc1            #110 <Int 60000>
	//  125  260:idiv            
	//  126  261:bipush          60
	//  127  263:idiv            
	//  128  264:invokestatic    #115 <Method int Math.abs(int)>
	//  129  267:istore          5
			int i1 = Math.abs((i / 60000) % 60);
	//  130  269:iload           4
	//  131  271:ldc1            #110 <Int 60000>
	//  132  273:idiv            
	//  133  274:bipush          60
	//  134  276:irem            
	//  135  277:invokestatic    #115 <Method int Math.abs(int)>
	//  136  280:istore          6
			char c;
			if(i < 0)
	//* 137  282:iload           4
	//* 138  284:ifge            293
				c = '-';
	//  139  287:bipush          45
	//  140  289:istore_3        
			else
	//* 141  290:goto            296
				c = '+';
	//  142  293:bipush          43
	//  143  295:istore_3        
			((StringBuilder) (date)).append(c);
	//  144  296:aload_0         
	//  145  297:iload_3         
	//  146  298:invokevirtual   #89  <Method StringBuilder StringBuilder.append(char)>
	//  147  301:pop             
			padInt(((StringBuilder) (date)), k, "hh".length());
	//  148  302:aload_0         
	//  149  303:iload           5
	//  150  305:ldc1            #95  <String "hh">
	//  151  307:invokevirtual   #32  <Method int String.length()>
	//  152  310:invokestatic    #85  <Method void padInt(StringBuilder, int, int)>
			((StringBuilder) (date)).append(':');
	//  153  313:aload_0         
	//  154  314:bipush          58
	//  155  316:invokevirtual   #89  <Method StringBuilder StringBuilder.append(char)>
	//  156  319:pop             
			padInt(((StringBuilder) (date)), i1, "mm".length());
	//  157  320:aload_0         
	//  158  321:iload           6
	//  159  323:ldc1            #97  <String "mm">
	//  160  325:invokevirtual   #32  <Method int String.length()>
	//  161  328:invokestatic    #85  <Method void padInt(StringBuilder, int, int)>
		} else
	//* 162  331:goto            341
		{
			((StringBuilder) (date)).append('Z');
	//  163  334:aload_0         
	//  164  335:bipush          90
	//  165  337:invokevirtual   #89  <Method StringBuilder StringBuilder.append(char)>
	//  166  340:pop             
		}
		return ((StringBuilder) (date)).toString();
	//  167  341:aload_0         
	//  168  342:invokevirtual   #119 <Method String StringBuilder.toString()>
	//  169  345:areturn         
	}

	private static int indexOfNonDigit(String s, int i)
	{
		for(; i < s.length(); i++)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #32  <Method int String.length()>
	//*   3    5:icmpge          35
		{
			char c = s.charAt(i);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokevirtual   #36  <Method char String.charAt(int)>
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
	//   22   36:invokevirtual   #32  <Method int String.length()>
	//   23   39:ireturn         
	}

	private static void padInt(StringBuilder stringbuilder, int i, int j)
	{
		String s = Integer.toString(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #126 <Method String Integer.toString(int)>
	//    2    4:astore_3        
		for(i = j - s.length(); i > 0; i--)
	//*   3    5:iload_2         
	//*   4    6:aload_3         
	//*   5    7:invokevirtual   #32  <Method int String.length()>
	//*   6   10:isub            
	//*   7   11:istore_1        
	//*   8   12:iload_1         
	//*   9   13:ifle            30
			stringbuilder.append('0');
	//   10   16:aload_0         
	//   11   17:bipush          48
	//   12   19:invokevirtual   #89  <Method StringBuilder StringBuilder.append(char)>
	//   13   22:pop             

	//   14   23:iload_1         
	//   15   24:iconst_1        
	//   16   25:isub            
	//   17   26:istore_1        
	//*  18   27:goto            12
		stringbuilder.append(s);
	//   19   30:aload_0         
	//   20   31:aload_3         
	//   21   32:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   22   35:pop             
	//   23   36:return          
	}

	public static Date parse(String s, ParsePosition parseposition)
		throws ParseException
	{
		int i = parseposition.getIndex();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #144 <Method int ParsePosition.getIndex()>
	//    2    4:istore_3        
		int j = i + 4;
	//    3    5:iload_3         
	//    4    6:iconst_4        
	//    5    7:iadd            
	//    6    8:istore          4
		int k2 = parseInt(s, i, j);
	//    7   10:aload_0         
	//    8   11:iload_3         
	//    9   12:iload           4
	//   10   14:invokestatic    #148 <Method int parseInt(String, int, int)>
	//   11   17:istore          14
		i = j;
	//   12   19:iload           4
	//   13   21:istore_3        
		if(checkOffset(s, j, '-'))
	//*  14   22:aload_0         
	//*  15   23:iload           4
	//*  16   25:bipush          45
	//*  17   27:invokestatic    #150 <Method boolean checkOffset(String, int, char)>
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
		int l2 = parseInt(s, i, j);
	//   27   43:aload_0         
	//   28   44:iload_3         
	//   29   45:iload           4
	//   30   47:invokestatic    #148 <Method int parseInt(String, int, int)>
	//   31   50:istore          15
		i = j;
	//   32   52:iload           4
	//   33   54:istore_3        
		if(checkOffset(s, j, '-'))
	//*  34   55:aload_0         
	//*  35   56:iload           4
	//*  36   58:bipush          45
	//*  37   60:invokestatic    #150 <Method boolean checkOffset(String, int, char)>
	//*  38   63:ifeq            71
			i = j + 1;
	//   39   66:iload           4
	//   40   68:iconst_1        
	//   41   69:iadd            
	//   42   70:istore_3        
		j = i + 2;
	//   43   71:iload_3         
	//   44   72:iconst_2        
	//   45   73:iadd            
	//   46   74:istore          4
		int i3 = parseInt(s, i, j);
	//   47   76:aload_0         
	//   48   77:iload_3         
	//   49   78:iload           4
	//   50   80:invokestatic    #148 <Method int parseInt(String, int, int)>
	//   51   83:istore          16
		int k;
		int l;
		int i1;
		boolean flag;
		l = 0;
	//   52   85:iconst_0        
	//   53   86:istore          6
		i1 = 0;
	//   54   88:iconst_0        
	//   55   89:istore          7
		k = 0;
	//   56   91:iconst_0        
	//   57   92:istore          5
		flag = false;
	//   58   94:iconst_0        
	//   59   95:istore          12
		boolean flag1 = checkOffset(s, j, 'T');
	//   60   97:aload_0         
	//   61   98:iload           4
	//   62  100:bipush          84
	//   63  102:invokestatic    #150 <Method boolean checkOffset(String, int, char)>
	//   64  105:istore          17
		if(flag1)
			break MISSING_BLOCK_LABEL_154;
	//   65  107:iload           17
	//   66  109:ifne            154
		Object obj;
		if(s.length() > j)
			break MISSING_BLOCK_LABEL_154;
	//   67  112:aload_0         
	//   68  113:invokevirtual   #32  <Method int String.length()>
	//   69  116:iload           4
	//   70  118:icmpgt          154
		obj = ((Object) (new GregorianCalendar(k2, l2 - 1, i3)));
	//   71  121:new             #44  <Class GregorianCalendar>
	//   72  124:dup             
	//   73  125:iload           14
	//   74  127:iload           15
	//   75  129:iconst_1        
	//   76  130:isub            
	//   77  131:iload           16
	//   78  133:invokespecial   #153 <Method void GregorianCalendar(int, int, int)>
	//   79  136:astore          18
		parseposition.setIndex(j);
	//   80  138:aload_1         
	//   81  139:iload           4
	//   82  141:invokevirtual   #156 <Method void ParsePosition.setIndex(int)>
		obj = ((Object) (((Calendar) (obj)).getTime()));
	//   83  144:aload           18
	//   84  146:invokevirtual   #160 <Method Date Calendar.getTime()>
	//   85  149:astore          18
		return ((Date) (obj));
	//   86  151:aload           18
	//   87  153:areturn         
		int j1;
		int k1;
		i = j;
	//   88  154:iload           4
	//   89  156:istore_3        
		j1 = k;
	//   90  157:iload           5
	//   91  159:istore          8
		k1 = ((int) (flag));
	//   92  161:iload           12
	//   93  163:istore          9
		if(!flag1)
			break MISSING_BLOCK_LABEL_492;
	//   94  165:iload           17
	//   95  167:ifeq            492
		i = j + 1;
	//   96  170:iload           4
	//   97  172:iconst_1        
	//   98  173:iadd            
	//   99  174:istore_3        
		j = i + 2;
	//  100  175:iload_3         
	//  101  176:iconst_2        
	//  102  177:iadd            
	//  103  178:istore          4
		int l1 = parseInt(s, i, j);
	//  104  180:aload_0         
	//  105  181:iload_3         
	//  106  182:iload           4
	//  107  184:invokestatic    #148 <Method int parseInt(String, int, int)>
	//  108  187:istore          10
		i = j;
	//  109  189:iload           4
	//  110  191:istore_3        
		if(checkOffset(s, j, ':'))
	//* 111  192:aload_0         
	//* 112  193:iload           4
	//* 113  195:bipush          58
	//* 114  197:invokestatic    #150 <Method boolean checkOffset(String, int, char)>
	//* 115  200:ifeq            208
			i = j + 1;
	//  116  203:iload           4
	//  117  205:iconst_1        
	//  118  206:iadd            
	//  119  207:istore_3        
		l = i + 2;
	//  120  208:iload_3         
	//  121  209:iconst_2        
	//  122  210:iadd            
	//  123  211:istore          6
		int i2 = parseInt(s, i, l);
	//  124  213:aload_0         
	//  125  214:iload_3         
	//  126  215:iload           6
	//  127  217:invokestatic    #148 <Method int parseInt(String, int, int)>
	//  128  220:istore          11
		j = l;
	//  129  222:iload           6
	//  130  224:istore          4
		if(checkOffset(s, l, ':'))
	//* 131  226:aload_0         
	//* 132  227:iload           6
	//* 133  229:bipush          58
	//* 134  231:invokestatic    #150 <Method boolean checkOffset(String, int, char)>
	//* 135  234:ifeq            243
			j = l + 1;
	//  136  237:iload           6
	//  137  239:iconst_1        
	//  138  240:iadd            
	//  139  241:istore          4
		i = j;
	//  140  243:iload           4
	//  141  245:istore_3        
		l = l1;
	//  142  246:iload           10
	//  143  248:istore          6
		i1 = i2;
	//  144  250:iload           11
	//  145  252:istore          7
		j1 = k;
	//  146  254:iload           5
	//  147  256:istore          8
		k1 = ((int) (flag));
	//  148  258:iload           12
	//  149  260:istore          9
		int j2;
		if(s.length() <= j)
			break MISSING_BLOCK_LABEL_492;
	//  150  262:aload_0         
	//  151  263:invokevirtual   #32  <Method int String.length()>
	//  152  266:iload           4
	//  153  268:icmple          492
		j2 = ((int) (s.charAt(j)));
	//  154  271:aload_0         
	//  155  272:iload           4
	//  156  274:invokevirtual   #36  <Method char String.charAt(int)>
	//  157  277:istore          13
		i = j;
	//  158  279:iload           4
	//  159  281:istore_3        
		l = l1;
	//  160  282:iload           10
	//  161  284:istore          6
		i1 = i2;
	//  162  286:iload           11
	//  163  288:istore          7
		j1 = k;
	//  164  290:iload           5
	//  165  292:istore          8
		k1 = ((int) (flag));
	//  166  294:iload           12
	//  167  296:istore          9
		if(j2 == 'Z')
			break MISSING_BLOCK_LABEL_492;
	//  168  298:iload           13
	//  169  300:bipush          90
	//  170  302:icmpeq          492
		i = j;
	//  171  305:iload           4
	//  172  307:istore_3        
		l = l1;
	//  173  308:iload           10
	//  174  310:istore          6
		i1 = i2;
	//  175  312:iload           11
	//  176  314:istore          7
		j1 = k;
	//  177  316:iload           5
	//  178  318:istore          8
		k1 = ((int) (flag));
	//  179  320:iload           12
	//  180  322:istore          9
		if(j2 == '+')
			break MISSING_BLOCK_LABEL_492;
	//  181  324:iload           13
	//  182  326:bipush          43
	//  183  328:icmpeq          492
		i = j;
	//  184  331:iload           4
	//  185  333:istore_3        
		l = l1;
	//  186  334:iload           10
	//  187  336:istore          6
		i1 = i2;
	//  188  338:iload           11
	//  189  340:istore          7
		j1 = k;
	//  190  342:iload           5
	//  191  344:istore          8
		k1 = ((int) (flag));
	//  192  346:iload           12
	//  193  348:istore          9
		if(j2 == '-')
			break MISSING_BLOCK_LABEL_492;
	//  194  350:iload           13
	//  195  352:bipush          45
	//  196  354:icmpeq          492
		j2 = j + 2;
	//  197  357:iload           4
	//  198  359:iconst_2        
	//  199  360:iadd            
	//  200  361:istore          13
		i = parseInt(s, j, j2);
	//  201  363:aload_0         
	//  202  364:iload           4
	//  203  366:iload           13
	//  204  368:invokestatic    #148 <Method int parseInt(String, int, int)>
	//  205  371:istore_3        
		k = i;
	//  206  372:iload_3         
	//  207  373:istore          5
		if(i > 59)
	//* 208  375:iload_3         
	//* 209  376:bipush          59
	//* 210  378:icmple          394
		{
			k = i;
	//  211  381:iload_3         
	//  212  382:istore          5
			if(i < 63)
	//* 213  384:iload_3         
	//* 214  385:bipush          63
	//* 215  387:icmpge          394
				k = 59;
	//  216  390:bipush          59
	//  217  392:istore          5
		}
		i = j2;
	//  218  394:iload           13
	//  219  396:istore_3        
		l = l1;
	//  220  397:iload           10
	//  221  399:istore          6
		i1 = i2;
	//  222  401:iload           11
	//  223  403:istore          7
		j1 = k;
	//  224  405:iload           5
	//  225  407:istore          8
		k1 = ((int) (flag));
	//  226  409:iload           12
	//  227  411:istore          9
		if(!checkOffset(s, j2, '.'))
			break MISSING_BLOCK_LABEL_492;
	//  228  413:aload_0         
	//  229  414:iload           13
	//  230  416:bipush          46
	//  231  418:invokestatic    #150 <Method boolean checkOffset(String, int, char)>
	//  232  421:ifeq            492
		l = j2 + 1;
	//  233  424:iload           13
	//  234  426:iconst_1        
	//  235  427:iadd            
	//  236  428:istore          6
		i = indexOfNonDigit(s, l + 1);
	//  237  430:aload_0         
	//  238  431:iload           6
	//  239  433:iconst_1        
	//  240  434:iadd            
	//  241  435:invokestatic    #162 <Method int indexOfNonDigit(String, int)>
	//  242  438:istore_3        
		i1 = Math.min(i, l + 3);
	//  243  439:iload_3         
	//  244  440:iload           6
	//  245  442:iconst_3        
	//  246  443:iadd            
	//  247  444:invokestatic    #166 <Method int Math.min(int, int)>
	//  248  447:istore          7
		j = parseInt(s, l, i1);
	//  249  449:aload_0         
	//  250  450:iload           6
	//  251  452:iload           7
	//  252  454:invokestatic    #148 <Method int parseInt(String, int, int)>
	//  253  457:istore          4
		break MISSING_BLOCK_LABEL_459;
	//* 254  459:iload           7
	//* 255  461:iload           6
	//* 256  463:isub            
	//* 257  464:lookupswitch    2: default 1002
	//	               1: 1015
	//	               2: 1005
_L7:
		char c;
		if(s.length() <= i)
	//* 258  492:aload_0         
	//* 259  493:invokevirtual   #32  <Method int String.length()>
	//* 260  496:iload_3         
	//* 261  497:icmpgt          510
			throw new IllegalArgumentException("No time zone indicator");
	//  262  500:new             #139 <Class IllegalArgumentException>
	//  263  503:dup             
	//  264  504:ldc1            #168 <String "No time zone indicator">
	//  265  506:invokespecial   #171 <Method void IllegalArgumentException(String)>
	//  266  509:athrow          
		c = s.charAt(i);
	//  267  510:aload_0         
	//  268  511:iload_3         
	//  269  512:invokevirtual   #36  <Method char String.charAt(int)>
	//  270  515:istore_2        
		if(c != 'Z') goto _L2; else goto _L1
	//  271  516:iload_2         
	//  272  517:bipush          90
	//  273  519:icmpne          1044
_L1:
		obj1 = ((Object) (TIMEZONE_UTC));
	//  274  522:getstatic       #20  <Field TimeZone TIMEZONE_UTC>
	//  275  525:astore          18
		i++;
	//  276  527:iload_3         
	//  277  528:iconst_1        
	//  278  529:iadd            
	//  279  530:istore_3        
		  goto _L3
	//* 280  531:goto            755
_L8:
		obj1 = ((Object) (s.substring(i)));
	//  281  534:aload_0         
	//  282  535:iload_3         
	//  283  536:invokevirtual   #174 <Method String String.substring(int)>
	//  284  539:astore          18
		if(((String) (obj1)).length() >= 5)
	//* 285  541:aload           18
	//* 286  543:invokevirtual   #32  <Method int String.length()>
	//* 287  546:iconst_5        
	//* 288  547:icmplt          553
			break MISSING_BLOCK_LABEL_575;
	//  289  550:goto            575
		obj1 = ((Object) ((new StringBuilder()).append(((String) (obj1))).append("00").toString()));
	//  290  553:new             #72  <Class StringBuilder>
	//  291  556:dup             
	//  292  557:invokespecial   #175 <Method void StringBuilder()>
	//  293  560:aload           18
	//  294  562:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//  295  565:ldc1            #177 <String "00">
	//  296  567:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//  297  570:invokevirtual   #119 <Method String StringBuilder.toString()>
	//  298  573:astore          18
		i += ((String) (obj1)).length();
	//  299  575:iload_3         
	//  300  576:aload           18
	//  301  578:invokevirtual   #32  <Method int String.length()>
	//  302  581:iadd            
	//  303  582:istore_3        
		if(!"+0000".equals(obj1) && !"+00:00".equals(obj1)) goto _L5; else goto _L4
	//  304  583:ldc1            #179 <String "+0000">
	//  305  585:aload           18
	//  306  587:invokevirtual   #183 <Method boolean String.equals(Object)>
	//  307  590:ifne            603
	//  308  593:ldc1            #185 <String "+00:00">
	//  309  595:aload           18
	//  310  597:invokevirtual   #183 <Method boolean String.equals(Object)>
	//  311  600:ifeq            611
_L4:
		obj1 = ((Object) (TIMEZONE_UTC));
	//  312  603:getstatic       #20  <Field TimeZone TIMEZONE_UTC>
	//  313  606:astore          18
		  goto _L3
	//* 314  608:goto            1059
_L5:
		s2 = (new StringBuilder()).append("GMT").append(((String) (obj1))).toString();
	//  315  611:new             #72  <Class StringBuilder>
	//  316  614:dup             
	//  317  615:invokespecial   #175 <Method void StringBuilder()>
	//  318  618:ldc1            #187 <String "GMT">
	//  319  620:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//  320  623:aload           18
	//  321  625:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//  322  628:invokevirtual   #119 <Method String StringBuilder.toString()>
	//  323  631:astore          20
		timezone = TimeZone.getTimeZone(s2);
	//  324  633:aload           20
	//  325  635:invokestatic    #18  <Method TimeZone TimeZone.getTimeZone(String)>
	//  326  638:astore          19
		s4 = timezone.getID();
	//  327  640:aload           19
	//  328  642:invokevirtual   #190 <Method String TimeZone.getID()>
	//  329  645:astore          21
		obj1 = ((Object) (timezone));
	//  330  647:aload           19
	//  331  649:astore          18
		if(s4.equals(((Object) (s2)))) goto _L3; else goto _L6
	//  332  651:aload           21
	//  333  653:aload           20
	//  334  655:invokevirtual   #183 <Method boolean String.equals(Object)>
	//  335  658:ifne            1059
_L6:
		obj1 = ((Object) (timezone));
	//  336  661:aload           19
	//  337  663:astore          18
		if(!s4.replace(":", "").equals(((Object) (s2))))
	//* 338  665:aload           21
	//* 339  667:ldc1            #192 <String ":">
	//* 340  669:ldc1            #194 <String "">
	//* 341  671:invokevirtual   #198 <Method String String.replace(CharSequence, CharSequence)>
	//* 342  674:aload           20
	//* 343  676:invokevirtual   #183 <Method boolean String.equals(Object)>
	//* 344  679:ifne            1059
			throw new IndexOutOfBoundsException((new StringBuilder()).append("Mismatching time zone indicator: ").append(s2).append(" given, resolves to ").append(timezone.getID()).toString());
	//  345  682:new             #135 <Class IndexOutOfBoundsException>
	//  346  685:dup             
	//  347  686:new             #72  <Class StringBuilder>
	//  348  689:dup             
	//  349  690:invokespecial   #175 <Method void StringBuilder()>
	//  350  693:ldc1            #200 <String "Mismatching time zone indicator: ">
	//  351  695:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//  352  698:aload           20
	//  353  700:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//  354  703:ldc1            #202 <String " given, resolves to ">
	//  355  705:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//  356  708:aload           19
	//  357  710:invokevirtual   #190 <Method String TimeZone.getID()>
	//  358  713:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//  359  716:invokevirtual   #119 <Method String StringBuilder.toString()>
	//  360  719:invokespecial   #203 <Method void IndexOutOfBoundsException(String)>
	//  361  722:athrow          
		  goto _L3
_L9:
		throw new IndexOutOfBoundsException((new StringBuilder()).append("Invalid time zone indicator '").append(c).append("'").toString());
	//  362  723:new             #135 <Class IndexOutOfBoundsException>
	//  363  726:dup             
	//  364  727:new             #72  <Class StringBuilder>
	//  365  730:dup             
	//  366  731:invokespecial   #175 <Method void StringBuilder()>
	//  367  734:ldc1            #205 <String "Invalid time zone indicator '">
	//  368  736:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//  369  739:iload_2         
	//  370  740:invokevirtual   #89  <Method StringBuilder StringBuilder.append(char)>
	//  371  743:ldc1            #207 <String "'">
	//  372  745:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//  373  748:invokevirtual   #119 <Method String StringBuilder.toString()>
	//  374  751:invokespecial   #203 <Method void IndexOutOfBoundsException(String)>
	//  375  754:athrow          
_L3:
		obj1 = ((Object) (new GregorianCalendar(((TimeZone) (obj1)))));
	//  376  755:new             #44  <Class GregorianCalendar>
	//  377  758:dup             
	//  378  759:aload           18
	//  379  761:invokespecial   #210 <Method void GregorianCalendar(TimeZone)>
	//  380  764:astore          18
		((Calendar) (obj1)).setLenient(false);
	//  381  766:aload           18
	//  382  768:iconst_0        
	//  383  769:invokevirtual   #214 <Method void Calendar.setLenient(boolean)>
		((Calendar) (obj1)).set(1, k2);
	//  384  772:aload           18
	//  385  774:iconst_1        
	//  386  775:iload           14
	//  387  777:invokevirtual   #218 <Method void Calendar.set(int, int)>
		((Calendar) (obj1)).set(2, l2 - 1);
	//  388  780:aload           18
	//  389  782:iconst_2        
	//  390  783:iload           15
	//  391  785:iconst_1        
	//  392  786:isub            
	//  393  787:invokevirtual   #218 <Method void Calendar.set(int, int)>
		((Calendar) (obj1)).set(5, i3);
	//  394  790:aload           18
	//  395  792:iconst_5        
	//  396  793:iload           16
	//  397  795:invokevirtual   #218 <Method void Calendar.set(int, int)>
		((Calendar) (obj1)).set(11, l);
	//  398  798:aload           18
	//  399  800:bipush          11
	//  400  802:iload           6
	//  401  804:invokevirtual   #218 <Method void Calendar.set(int, int)>
		((Calendar) (obj1)).set(12, i1);
	//  402  807:aload           18
	//  403  809:bipush          12
	//  404  811:iload           7
	//  405  813:invokevirtual   #218 <Method void Calendar.set(int, int)>
		((Calendar) (obj1)).set(13, j1);
	//  406  816:aload           18
	//  407  818:bipush          13
	//  408  820:iload           8
	//  409  822:invokevirtual   #218 <Method void Calendar.set(int, int)>
		((Calendar) (obj1)).set(14, k1);
	//  410  825:aload           18
	//  411  827:bipush          14
	//  412  829:iload           9
	//  413  831:invokevirtual   #218 <Method void Calendar.set(int, int)>
		parseposition.setIndex(i);
	//  414  834:aload_1         
	//  415  835:iload_3         
	//  416  836:invokevirtual   #156 <Method void ParsePosition.setIndex(int)>
		obj1 = ((Object) (((Calendar) (obj1)).getTime()));
	//  417  839:aload           18
	//  418  841:invokevirtual   #160 <Method Date Calendar.getTime()>
	//  419  844:astore          18
		return ((Date) (obj1));
	//  420  846:aload           18
	//  421  848:areturn         
		obj2;
	//  422  849:astore          18
		break MISSING_BLOCK_LABEL_861;
	//  423  851:goto            861
		obj2;
	//  424  854:astore          18
		break MISSING_BLOCK_LABEL_861;
	//  425  856:goto            861
		obj2;
	//  426  859:astore          18
		String s1;
label0:
		{
			if(s == null)
	//* 427  861:aload_0         
	//* 428  862:ifnonnull       870
				s = null;
	//  429  865:aconst_null     
	//  430  866:astore_0        
			else
	//* 431  867:goto            895
				s = (new StringBuilder()).append('"').append(s).append("'").toString();
	//  432  870:new             #72  <Class StringBuilder>
	//  433  873:dup             
	//  434  874:invokespecial   #175 <Method void StringBuilder()>
	//  435  877:bipush          34
	//  436  879:invokevirtual   #89  <Method StringBuilder StringBuilder.append(char)>
	//  437  882:aload_0         
	//  438  883:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//  439  886:ldc1            #207 <String "'">
	//  440  888:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//  441  891:invokevirtual   #119 <Method String StringBuilder.toString()>
	//  442  894:astore_0        
			String s3 = ((Exception) (obj2)).getMessage();
	//  443  895:aload           18
	//  444  897:invokevirtual   #223 <Method String Exception.getMessage()>
	//  445  900:astore          20
			if(s3 != null)
	//* 446  902:aload           20
	//* 447  904:ifnull          919
			{
				s1 = s3;
	//  448  907:aload           20
	//  449  909:astore          19
				if(!s3.isEmpty())
					break label0;
	//  450  911:aload           20
	//  451  913:invokevirtual   #227 <Method boolean String.isEmpty()>
	//  452  916:ifeq            952
			}
			s1 = (new StringBuilder()).append("(").append(obj2.getClass().getName()).append(")").toString();
	//  453  919:new             #72  <Class StringBuilder>
	//  454  922:dup             
	//  455  923:invokespecial   #175 <Method void StringBuilder()>
	//  456  926:ldc1            #229 <String "(">
	//  457  928:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//  458  931:aload           18
	//  459  933:invokevirtual   #233 <Method Class Object.getClass()>
	//  460  936:invokevirtual   #238 <Method String Class.getName()>
	//  461  939:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//  462  942:ldc1            #240 <String ")">
	//  463  944:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//  464  947:invokevirtual   #119 <Method String StringBuilder.toString()>
	//  465  950:astore          19
		}
		s = ((String) (new ParseException((new StringBuilder()).append("Failed to parse date [").append(s).append("]: ").append(s1).toString(), parseposition.getIndex())));
	//  466  952:new             #133 <Class ParseException>
	//  467  955:dup             
	//  468  956:new             #72  <Class StringBuilder>
	//  469  959:dup             
	//  470  960:invokespecial   #175 <Method void StringBuilder()>
	//  471  963:ldc1            #242 <String "Failed to parse date [">
	//  472  965:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//  473  968:aload_0         
	//  474  969:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//  475  972:ldc1            #244 <String "]: ">
	//  476  974:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//  477  977:aload           19
	//  478  979:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//  479  982:invokevirtual   #119 <Method String StringBuilder.toString()>
	//  480  985:aload_1         
	//  481  986:invokevirtual   #144 <Method int ParsePosition.getIndex()>
	//  482  989:invokespecial   #247 <Method void ParseException(String, int)>
	//  483  992:astore_0        
		((ParseException) (s)).initCause(((Throwable) (obj2)));
	//  484  993:aload_0         
	//  485  994:aload           18
	//  486  996:invokevirtual   #251 <Method Throwable ParseException.initCause(Throwable)>
	//  487  999:pop             
		throw s;
	//  488 1000:aload_0         
	//  489 1001:athrow          
		Object obj1;
		Object obj2;
		TimeZone timezone;
		String s2;
		String s4;
		switch(i1 - l)
		{
	//* 490 1002:goto            1025
		case 2: // '\002'
			j *= 10;
	//  491 1005:iload           4
	//  492 1007:bipush          10
	//  493 1009:imul            
	//  494 1010:istore          4
			break;

	//* 495 1012:goto            1025
		case 1: // '\001'
			j *= 100;
	//  496 1015:iload           4
	//  497 1017:bipush          100
	//  498 1019:imul            
	//  499 1020:istore          4
			break;
		}
	//* 500 1022:goto            1025
		l = l1;
	//  501 1025:iload           10
	//  502 1027:istore          6
		i1 = i2;
	//  503 1029:iload           11
	//  504 1031:istore          7
		j1 = k;
	//  505 1033:iload           5
	//  506 1035:istore          8
		k1 = j;
	//  507 1037:iload           4
	//  508 1039:istore          9
		  goto _L7
	//* 509 1041:goto            492
_L2:
		if(c != '+' && c != '-') goto _L9; else goto _L8
	//  510 1044:iload_2         
	//  511 1045:bipush          43
	//  512 1047:icmpeq          534
	//  513 1050:iload_2         
	//  514 1051:bipush          45
	//  515 1053:icmpne          723
	//* 516 1056:goto            534
	//* 517 1059:goto            755
	}

	private static int parseInt(String s, int i, int j)
		throws NumberFormatException
	{
		if(i < 0 || j > s.length() || i > j)
	//*   0    0:iload_1         
	//*   1    1:iflt            17
	//*   2    4:iload_2         
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #32  <Method int String.length()>
	//*   5    9:icmpgt          17
	//*   6   12:iload_1         
	//*   7   13:iload_2         
	//*   8   14:icmple          26
			throw new NumberFormatException(s);
	//    9   17:new             #137 <Class NumberFormatException>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #253 <Method void NumberFormatException(String)>
	//   13   25:athrow          
		int i1 = i;
	//   14   26:iload_1         
	//   15   27:istore          5
		int l = 0;
	//   16   29:iconst_0        
	//   17   30:istore          4
		int k = i1;
	//   18   32:iload           5
	//   19   34:istore_3        
		if(i1 < j)
	//*  20   35:iload           5
	//*  21   37:iload_2         
	//*  22   38:icmpge          102
		{
			k = i1 + 1;
	//   23   41:iload           5
	//   24   43:iconst_1        
	//   25   44:iadd            
	//   26   45:istore_3        
			l = Character.digit(s.charAt(i1), 10);
	//   27   46:aload_0         
	//   28   47:iload           5
	//   29   49:invokevirtual   #36  <Method char String.charAt(int)>
	//   30   52:bipush          10
	//   31   54:invokestatic    #259 <Method int Character.digit(char, int)>
	//   32   57:istore          4
			if(l < 0)
	//*  33   59:iload           4
	//*  34   61:ifge            97
				throw new NumberFormatException((new StringBuilder()).append("Invalid number: ").append(s.substring(i, j)).toString());
	//   35   64:new             #137 <Class NumberFormatException>
	//   36   67:dup             
	//   37   68:new             #72  <Class StringBuilder>
	//   38   71:dup             
	//   39   72:invokespecial   #175 <Method void StringBuilder()>
	//   40   75:ldc2            #261 <String "Invalid number: ">
	//   41   78:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   42   81:aload_0         
	//   43   82:iload_1         
	//   44   83:iload_2         
	//   45   84:invokevirtual   #264 <Method String String.substring(int, int)>
	//   46   87:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   47   90:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   48   93:invokespecial   #253 <Method void NumberFormatException(String)>
	//   49   96:athrow          
			l = -l;
	//   50   97:iload           4
	//   51   99:ineg            
	//   52  100:istore          4
		}
		do
		{
			int j1 = k;
	//   53  102:iload_3         
	//   54  103:istore          5
			if(j1 < j)
	//*  55  105:iload           5
	//*  56  107:iload_2         
	//*  57  108:icmpge          180
			{
				k = j1 + 1;
	//   58  111:iload           5
	//   59  113:iconst_1        
	//   60  114:iadd            
	//   61  115:istore_3        
				j1 = Character.digit(s.charAt(j1), 10);
	//   62  116:aload_0         
	//   63  117:iload           5
	//   64  119:invokevirtual   #36  <Method char String.charAt(int)>
	//   65  122:bipush          10
	//   66  124:invokestatic    #259 <Method int Character.digit(char, int)>
	//   67  127:istore          5
				if(j1 < 0)
	//*  68  129:iload           5
	//*  69  131:ifge            167
					throw new NumberFormatException((new StringBuilder()).append("Invalid number: ").append(s.substring(i, j)).toString());
	//   70  134:new             #137 <Class NumberFormatException>
	//   71  137:dup             
	//   72  138:new             #72  <Class StringBuilder>
	//   73  141:dup             
	//   74  142:invokespecial   #175 <Method void StringBuilder()>
	//   75  145:ldc2            #261 <String "Invalid number: ">
	//   76  148:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   77  151:aload_0         
	//   78  152:iload_1         
	//   79  153:iload_2         
	//   80  154:invokevirtual   #264 <Method String String.substring(int, int)>
	//   81  157:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   82  160:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   83  163:invokespecial   #253 <Method void NumberFormatException(String)>
	//   84  166:athrow          
				l = l * 10 - j1;
	//   85  167:iload           4
	//   86  169:bipush          10
	//   87  171:imul            
	//   88  172:iload           5
	//   89  174:isub            
	//   90  175:istore          4
			} else
	//*  91  177:goto            102
			{
				return -l;
	//   92  180:iload           4
	//   93  182:ineg            
	//   94  183:ireturn         
			}
		} while(true);
	}

	private static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone("UTC");
	private static final String UTC_ID = "UTC";

	static 
	{
	//    0    0:ldc1            #10  <String "UTC">
	//    1    2:invokestatic    #18  <Method TimeZone TimeZone.getTimeZone(String)>
	//    2    5:putstatic       #20  <Field TimeZone TIMEZONE_UTC>
	//*   3    8:return          
	}
}
