// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import java.util.*;

public class ISO8601Utils
{

	public ISO8601Utils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:return          
	}

	public static String format(Date date, boolean flag, TimeZone timezone)
	{
		return format(date, flag, timezone, Locale.US);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #34  <Field Locale Locale.US>
	//    4    6:invokestatic    #37  <Method String format(Date, boolean, TimeZone, Locale)>
	//    5    9:areturn         
	}

	public static String format(Date date, boolean flag, TimeZone timezone, Locale locale)
	{
		locale = ((Locale) (new GregorianCalendar(timezone, locale)));
	//    0    0:new             #40  <Class GregorianCalendar>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:aload_3         
	//    4    6:invokespecial   #43  <Method void GregorianCalendar(TimeZone, Locale)>
	//    5    9:astore_3        
		((Calendar) (locale)).setTime(date);
	//    6   10:aload_3         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #49  <Method void Calendar.setTime(Date)>
		date = ((Date) (new StringBuilder(30)));
	//    9   15:new             #51  <Class StringBuilder>
	//   10   18:dup             
	//   11   19:bipush          30
	//   12   21:invokespecial   #54  <Method void StringBuilder(int)>
	//   13   24:astore_0        
		((StringBuilder) (date)).append(String.format("%04d-%02d-%02dT%02d:%02d:%02d", new Object[] {
			Integer.valueOf(((Calendar) (locale)).get(1)), Integer.valueOf(((Calendar) (locale)).get(2) + 1), Integer.valueOf(((Calendar) (locale)).get(5)), Integer.valueOf(((Calendar) (locale)).get(11)), Integer.valueOf(((Calendar) (locale)).get(12)), Integer.valueOf(((Calendar) (locale)).get(13))
		}));
	//   14   25:aload_0         
	//   15   26:ldc1            #56  <String "%04d-%02d-%02dT%02d:%02d:%02d">
	//   16   28:bipush          6
	//   17   30:anewarray       Object[]
	//   18   33:dup             
	//   19   34:iconst_0        
	//   20   35:aload_3         
	//   21   36:iconst_1        
	//   22   37:invokevirtual   #60  <Method int Calendar.get(int)>
	//   23   40:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//   24   43:aastore         
	//   25   44:dup             
	//   26   45:iconst_1        
	//   27   46:aload_3         
	//   28   47:iconst_2        
	//   29   48:invokevirtual   #60  <Method int Calendar.get(int)>
	//   30   51:iconst_1        
	//   31   52:iadd            
	//   32   53:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//   33   56:aastore         
	//   34   57:dup             
	//   35   58:iconst_2        
	//   36   59:aload_3         
	//   37   60:iconst_5        
	//   38   61:invokevirtual   #60  <Method int Calendar.get(int)>
	//   39   64:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//   40   67:aastore         
	//   41   68:dup             
	//   42   69:iconst_3        
	//   43   70:aload_3         
	//   44   71:bipush          11
	//   45   73:invokevirtual   #60  <Method int Calendar.get(int)>
	//   46   76:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//   47   79:aastore         
	//   48   80:dup             
	//   49   81:iconst_4        
	//   50   82:aload_3         
	//   51   83:bipush          12
	//   52   85:invokevirtual   #60  <Method int Calendar.get(int)>
	//   53   88:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//   54   91:aastore         
	//   55   92:dup             
	//   56   93:iconst_5        
	//   57   94:aload_3         
	//   58   95:bipush          13
	//   59   97:invokevirtual   #60  <Method int Calendar.get(int)>
	//   60  100:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//   61  103:aastore         
	//   62  104:invokestatic    #71  <Method String String.format(String, Object[])>
	//   63  107:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   64  110:pop             
		if(flag)
	//*  65  111:iload_1         
	//*  66  112:ifeq            141
			((StringBuilder) (date)).append(String.format(".%03d", new Object[] {
				Integer.valueOf(((Calendar) (locale)).get(14))
			}));
	//   67  115:aload_0         
	//   68  116:ldc1            #77  <String ".%03d">
	//   69  118:iconst_1        
	//   70  119:anewarray       Object[]
	//   71  122:dup             
	//   72  123:iconst_0        
	//   73  124:aload_3         
	//   74  125:bipush          14
	//   75  127:invokevirtual   #60  <Method int Calendar.get(int)>
	//   76  130:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//   77  133:aastore         
	//   78  134:invokestatic    #71  <Method String String.format(String, Object[])>
	//   79  137:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   80  140:pop             
		int i = timezone.getOffset(((Calendar) (locale)).getTimeInMillis());
	//   81  141:aload_2         
	//   82  142:aload_3         
	//   83  143:invokevirtual   #81  <Method long Calendar.getTimeInMillis()>
	//   84  146:invokevirtual   #85  <Method int TimeZone.getOffset(long)>
	//   85  149:istore          5
		if(i != 0)
	//*  86  151:iload           5
	//*  87  153:ifeq            240
		{
			int k = i / 60000;
	//   88  156:iload           5
	//   89  158:ldc1            #86  <Int 60000>
	//   90  160:idiv            
	//   91  161:istore          7
			int j = Math.abs(k / 60);
	//   92  163:iload           7
	//   93  165:bipush          60
	//   94  167:idiv            
	//   95  168:invokestatic    #91  <Method int Math.abs(int)>
	//   96  171:istore          6
			k = Math.abs(k % 60);
	//   97  173:iload           7
	//   98  175:bipush          60
	//   99  177:irem            
	//  100  178:invokestatic    #91  <Method int Math.abs(int)>
	//  101  181:istore          7
			char c;
			if(i < 0)
	//* 102  183:iload           5
	//* 103  185:ifge            195
				c = '-';
	//  104  188:bipush          45
	//  105  190:istore          4
			else
	//* 106  192:goto            199
				c = '+';
	//  107  195:bipush          43
	//  108  197:istore          4
			((StringBuilder) (date)).append(String.format("%c%02d:%02d", new Object[] {
				Character.valueOf(c), Integer.valueOf(j), Integer.valueOf(k)
			}));
	//  109  199:aload_0         
	//  110  200:ldc1            #93  <String "%c%02d:%02d">
	//  111  202:iconst_3        
	//  112  203:anewarray       Object[]
	//  113  206:dup             
	//  114  207:iconst_0        
	//  115  208:iload           4
	//  116  210:invokestatic    #98  <Method Character Character.valueOf(char)>
	//  117  213:aastore         
	//  118  214:dup             
	//  119  215:iconst_1        
	//  120  216:iload           6
	//  121  218:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//  122  221:aastore         
	//  123  222:dup             
	//  124  223:iconst_2        
	//  125  224:iload           7
	//  126  226:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//  127  229:aastore         
	//  128  230:invokestatic    #71  <Method String String.format(String, Object[])>
	//  129  233:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  130  236:pop             
		} else
	//* 131  237:goto            247
		{
			((StringBuilder) (date)).append('Z');
	//  132  240:aload_0         
	//  133  241:bipush          90
	//  134  243:invokevirtual   #101 <Method StringBuilder StringBuilder.append(char)>
	//  135  246:pop             
		}
		return ((StringBuilder) (date)).toString();
	//  136  247:aload_0         
	//  137  248:invokevirtual   #105 <Method String StringBuilder.toString()>
	//  138  251:areturn         
	}

	protected static final int DEF_8601_LEN = 29;
	private static final TimeZone TIMEZONE_Z = TimeZone.getTimeZone("UTC");

	static 
	{
	//    0    0:ldc1            #14  <String "UTC">
	//    1    2:invokestatic    #20  <Method TimeZone TimeZone.getTimeZone(String)>
	//    2    5:putstatic       #22  <Field TimeZone TIMEZONE_Z>
	//*   3    8:return          
	}
}
