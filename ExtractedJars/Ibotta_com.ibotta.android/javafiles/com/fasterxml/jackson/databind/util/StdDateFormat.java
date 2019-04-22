// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.io.NumberInput;
import java.text.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StdDateFormat extends DateFormat
{

	public StdDateFormat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #107 <Method void DateFormat()>
		_tzSerializedWithColon = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #109 <Field boolean _tzSerializedWithColon>
		_locale = DEFAULT_LOCALE;
	//    5    9:aload_0         
	//    6   10:getstatic       #75  <Field Locale DEFAULT_LOCALE>
	//    7   13:putfield        #111 <Field Locale _locale>
	//    8   16:return          
	}

	protected StdDateFormat(TimeZone timezone, Locale locale, Boolean boolean1, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #107 <Method void DateFormat()>
		_tzSerializedWithColon = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #109 <Field boolean _tzSerializedWithColon>
		_timezone = timezone;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #114 <Field TimeZone _timezone>
		_locale = locale;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #111 <Field Locale _locale>
		_lenient = boolean1;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #116 <Field Boolean _lenient>
		_tzSerializedWithColon = flag;
	//   14   24:aload_0         
	//   15   25:iload           4
	//   16   27:putfield        #109 <Field boolean _tzSerializedWithColon>
	//   17   30:return          
	}

	private static final DateFormat _cloneFormat(DateFormat dateformat, String s, TimeZone timezone, Locale locale, Boolean boolean1)
	{
		if(!locale.equals(((Object) (DEFAULT_LOCALE))))
	//*   0    0:aload_3         
	//*   1    1:getstatic       #75  <Field Locale DEFAULT_LOCALE>
	//*   2    4:invokevirtual   #122 <Method boolean Locale.equals(Object)>
	//*   3    7:ifne            40
		{
			s = ((String) (new SimpleDateFormat(s, locale)));
	//    4   10:new             #77  <Class SimpleDateFormat>
	//    5   13:dup             
	//    6   14:aload_1         
	//    7   15:aload_3         
	//    8   16:invokespecial   #81  <Method void SimpleDateFormat(String, Locale)>
	//    9   19:astore_1        
			dateformat = ((DateFormat) (timezone));
	//   10   20:aload_2         
	//   11   21:astore_0        
			if(timezone == null)
	//*  12   22:aload_2         
	//*  13   23:ifnonnull       30
				dateformat = ((DateFormat) (DEFAULT_TIMEZONE));
	//   14   26:getstatic       #68  <Field TimeZone DEFAULT_TIMEZONE>
	//   15   29:astore_0        
			((DateFormat) (s)).setTimeZone(((TimeZone) (dateformat)));
	//   16   30:aload_1         
	//   17   31:aload_0         
	//   18   32:invokevirtual   #87  <Method void DateFormat.setTimeZone(TimeZone)>
			dateformat = ((DateFormat) (s));
	//   19   35:aload_1         
	//   20   36:astore_0        
		} else
	//*  21   37:goto            61
		{
			s = ((String) ((DateFormat)dateformat.clone()));
	//   22   40:aload_0         
	//   23   41:invokevirtual   #126 <Method Object DateFormat.clone()>
	//   24   44:checkcast       #4   <Class DateFormat>
	//   25   47:astore_1        
			dateformat = ((DateFormat) (s));
	//   26   48:aload_1         
	//   27   49:astore_0        
			if(timezone != null)
	//*  28   50:aload_2         
	//*  29   51:ifnull          61
			{
				((DateFormat) (s)).setTimeZone(timezone);
	//   30   54:aload_1         
	//   31   55:aload_2         
	//   32   56:invokevirtual   #87  <Method void DateFormat.setTimeZone(TimeZone)>
				dateformat = ((DateFormat) (s));
	//   33   59:aload_1         
	//   34   60:astore_0        
			}
		}
		if(boolean1 != null)
	//*  35   61:aload           4
	//*  36   63:ifnull          75
			dateformat.setLenient(boolean1.booleanValue());
	//   37   66:aload_0         
	//   38   67:aload           4
	//   39   69:invokevirtual   #132 <Method boolean Boolean.booleanValue()>
	//   40   72:invokevirtual   #136 <Method void DateFormat.setLenient(boolean)>
		return dateformat;
	//   41   75:aload_0         
	//   42   76:areturn         
	}

	protected static boolean _equals(Object obj, Object obj1)
	{
		if(obj == obj1)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		return obj != null && obj.equals(obj1);
	//    5    7:aload_0         
	//    6    8:ifnull          21
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #141 <Method boolean Object.equals(Object)>
	//   10   16:ifeq            21
	//   11   19:iconst_1        
	//   12   20:ireturn         
	//   13   21:iconst_0        
	//   14   22:ireturn         
	}

	private static int _parse2D(String s, int i)
	{
		return (s.charAt(i) - 48) * 10 + (s.charAt(i + 1) - 48);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #149 <Method char String.charAt(int)>
	//    3    5:bipush          48
	//    4    7:isub            
	//    5    8:bipush          10
	//    6   10:imul            
	//    7   11:aload_0         
	//    8   12:iload_1         
	//    9   13:iconst_1        
	//   10   14:iadd            
	//   11   15:invokevirtual   #149 <Method char String.charAt(int)>
	//   12   18:bipush          48
	//   13   20:isub            
	//   14   21:iadd            
	//   15   22:ireturn         
	}

	private static int _parse4D(String s, int i)
	{
		return (s.charAt(i) - 48) * 1000 + (s.charAt(i + 1) - 48) * 100 + (s.charAt(i + 2) - 48) * 10 + (s.charAt(i + 3) - 48);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #149 <Method char String.charAt(int)>
	//    3    5:bipush          48
	//    4    7:isub            
	//    5    8:sipush          1000
	//    6   11:imul            
	//    7   12:aload_0         
	//    8   13:iload_1         
	//    9   14:iconst_1        
	//   10   15:iadd            
	//   11   16:invokevirtual   #149 <Method char String.charAt(int)>
	//   12   19:bipush          48
	//   13   21:isub            
	//   14   22:bipush          100
	//   15   24:imul            
	//   16   25:iadd            
	//   17   26:aload_0         
	//   18   27:iload_1         
	//   19   28:iconst_2        
	//   20   29:iadd            
	//   21   30:invokevirtual   #149 <Method char String.charAt(int)>
	//   22   33:bipush          48
	//   23   35:isub            
	//   24   36:bipush          10
	//   25   38:imul            
	//   26   39:iadd            
	//   27   40:aload_0         
	//   28   41:iload_1         
	//   29   42:iconst_3        
	//   30   43:iadd            
	//   31   44:invokevirtual   #149 <Method char String.charAt(int)>
	//   32   47:bipush          48
	//   33   49:isub            
	//   34   50:iadd            
	//   35   51:ireturn         
	}

	private Date _parseDateFromLong(String s, ParsePosition parseposition)
		throws ParseException
	{
		NumberFormatException numberformatexception;
		long l;
		try
		{
			l = NumberInput.parseLong(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #162 <Method long NumberInput.parseLong(String)>
	//    2    4:lstore_3        
		}
	//*   3    5:new             #164 <Class Date>
	//*   4    8:dup             
	//*   5    9:lload_3         
	//*   6   10:invokespecial   #167 <Method void Date(long)>
	//*   7   13:areturn         
	//*   8   14:new             #154 <Class ParseException>
	//*   9   17:dup             
	//*  10   18:ldc1            #169 <String "Timestamp value %s out of 64-bit value range">
	//*  11   20:iconst_1        
	//*  12   21:anewarray       Object[]
	//*  13   24:dup             
	//*  14   25:iconst_0        
	//*  15   26:aload_1         
	//*  16   27:aastore         
	//*  17   28:invokestatic    #173 <Method String String.format(String, Object[])>
	//*  18   31:aload_2         
	//*  19   32:invokevirtual   #179 <Method int ParsePosition.getErrorIndex()>
	//*  20   35:invokespecial   #182 <Method void ParseException(String, int)>
	//*  21   38:athrow          
		// Misplaced declaration of an exception variable
		catch(NumberFormatException numberformatexception)
		{
			throw new ParseException(String.format("Timestamp value %s out of 64-bit value range", new Object[] {
				s
			}), parseposition.getErrorIndex());
		}
		return new Date(l);
	//*  22   39:astore          5
	//*  23   41:goto            14
	}

	private static void pad2(StringBuffer stringbuffer, int i)
	{
		int j = i / 10;
	//    0    0:iload_1         
	//    1    1:bipush          10
	//    2    3:idiv            
	//    3    4:istore_2        
		if(j == 0)
	//*   4    5:iload_2         
	//*   5    6:ifne            19
		{
			stringbuffer.append('0');
	//    6    9:aload_0         
	//    7   10:bipush          48
	//    8   12:invokevirtual   #191 <Method StringBuffer StringBuffer.append(char)>
	//    9   15:pop             
		} else
	//*  10   16:goto            36
		{
			stringbuffer.append((char)(j + 48));
	//   11   19:aload_0         
	//   12   20:iload_2         
	//   13   21:bipush          48
	//   14   23:iadd            
	//   15   24:int2char        
	//   16   25:invokevirtual   #191 <Method StringBuffer StringBuffer.append(char)>
	//   17   28:pop             
			i -= j * 10;
	//   18   29:iload_1         
	//   19   30:iload_2         
	//   20   31:bipush          10
	//   21   33:imul            
	//   22   34:isub            
	//   23   35:istore_1        
		}
		stringbuffer.append((char)(i + 48));
	//   24   36:aload_0         
	//   25   37:iload_1         
	//   26   38:bipush          48
	//   27   40:iadd            
	//   28   41:int2char        
	//   29   42:invokevirtual   #191 <Method StringBuffer StringBuffer.append(char)>
	//   30   45:pop             
	//   31   46:return          
	}

	private static void pad3(StringBuffer stringbuffer, int i)
	{
		int j = i / 100;
	//    0    0:iload_1         
	//    1    1:bipush          100
	//    2    3:idiv            
	//    3    4:istore_2        
		if(j == 0)
	//*   4    5:iload_2         
	//*   5    6:ifne            19
		{
			stringbuffer.append('0');
	//    6    9:aload_0         
	//    7   10:bipush          48
	//    8   12:invokevirtual   #191 <Method StringBuffer StringBuffer.append(char)>
	//    9   15:pop             
		} else
	//*  10   16:goto            36
		{
			stringbuffer.append((char)(j + 48));
	//   11   19:aload_0         
	//   12   20:iload_2         
	//   13   21:bipush          48
	//   14   23:iadd            
	//   15   24:int2char        
	//   16   25:invokevirtual   #191 <Method StringBuffer StringBuffer.append(char)>
	//   17   28:pop             
			i -= j * 100;
	//   18   29:iload_1         
	//   19   30:iload_2         
	//   20   31:bipush          100
	//   21   33:imul            
	//   22   34:isub            
	//   23   35:istore_1        
		}
		pad2(stringbuffer, i);
	//   24   36:aload_0         
	//   25   37:iload_1         
	//   26   38:invokestatic    #194 <Method void pad2(StringBuffer, int)>
	//   27   41:return          
	}

	private static void pad4(StringBuffer stringbuffer, int i)
	{
		int j = i / 100;
	//    0    0:iload_1         
	//    1    1:bipush          100
	//    2    3:idiv            
	//    3    4:istore_2        
		if(j == 0)
	//*   4    5:iload_2         
	//*   5    6:ifne            26
		{
			stringbuffer.append('0');
	//    6    9:aload_0         
	//    7   10:bipush          48
	//    8   12:invokevirtual   #191 <Method StringBuffer StringBuffer.append(char)>
	//    9   15:pop             
			stringbuffer.append('0');
	//   10   16:aload_0         
	//   11   17:bipush          48
	//   12   19:invokevirtual   #191 <Method StringBuffer StringBuffer.append(char)>
	//   13   22:pop             
		} else
	//*  14   23:goto            38
		{
			pad2(stringbuffer, j);
	//   15   26:aload_0         
	//   16   27:iload_2         
	//   17   28:invokestatic    #194 <Method void pad2(StringBuffer, int)>
			i -= j * 100;
	//   18   31:iload_1         
	//   19   32:iload_2         
	//   20   33:bipush          100
	//   21   35:imul            
	//   22   36:isub            
	//   23   37:istore_1        
		}
		pad2(stringbuffer, i);
	//   24   38:aload_0         
	//   25   39:iload_1         
	//   26   40:invokestatic    #194 <Method void pad2(StringBuffer, int)>
	//   27   43:return          
	}

	protected void _clearFormats()
	{
		_formatRFC1123 = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #198 <Field DateFormat _formatRFC1123>
	//    3    5:return          
	}

	protected void _format(TimeZone timezone, Locale locale, Date date, StringBuffer stringbuffer)
	{
		locale = ((Locale) (_getCalendar(timezone)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #204 <Method Calendar _getCalendar(TimeZone)>
	//    3    5:astore_2        
		((Calendar) (locale)).setTime(date);
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokevirtual   #210 <Method void Calendar.setTime(Date)>
		pad4(stringbuffer, ((Calendar) (locale)).get(1));
	//    7   11:aload           4
	//    8   13:aload_2         
	//    9   14:iconst_1        
	//   10   15:invokevirtual   #214 <Method int Calendar.get(int)>
	//   11   18:invokestatic    #216 <Method void pad4(StringBuffer, int)>
		char c = '-';
	//   12   21:bipush          45
	//   13   23:istore          5
		stringbuffer.append('-');
	//   14   25:aload           4
	//   15   27:bipush          45
	//   16   29:invokevirtual   #191 <Method StringBuffer StringBuffer.append(char)>
	//   17   32:pop             
		pad2(stringbuffer, ((Calendar) (locale)).get(2) + 1);
	//   18   33:aload           4
	//   19   35:aload_2         
	//   20   36:iconst_2        
	//   21   37:invokevirtual   #214 <Method int Calendar.get(int)>
	//   22   40:iconst_1        
	//   23   41:iadd            
	//   24   42:invokestatic    #194 <Method void pad2(StringBuffer, int)>
		stringbuffer.append('-');
	//   25   45:aload           4
	//   26   47:bipush          45
	//   27   49:invokevirtual   #191 <Method StringBuffer StringBuffer.append(char)>
	//   28   52:pop             
		pad2(stringbuffer, ((Calendar) (locale)).get(5));
	//   29   53:aload           4
	//   30   55:aload_2         
	//   31   56:iconst_5        
	//   32   57:invokevirtual   #214 <Method int Calendar.get(int)>
	//   33   60:invokestatic    #194 <Method void pad2(StringBuffer, int)>
		stringbuffer.append('T');
	//   34   63:aload           4
	//   35   65:bipush          84
	//   36   67:invokevirtual   #191 <Method StringBuffer StringBuffer.append(char)>
	//   37   70:pop             
		pad2(stringbuffer, ((Calendar) (locale)).get(11));
	//   38   71:aload           4
	//   39   73:aload_2         
	//   40   74:bipush          11
	//   41   76:invokevirtual   #214 <Method int Calendar.get(int)>
	//   42   79:invokestatic    #194 <Method void pad2(StringBuffer, int)>
		stringbuffer.append(':');
	//   43   82:aload           4
	//   44   84:bipush          58
	//   45   86:invokevirtual   #191 <Method StringBuffer StringBuffer.append(char)>
	//   46   89:pop             
		pad2(stringbuffer, ((Calendar) (locale)).get(12));
	//   47   90:aload           4
	//   48   92:aload_2         
	//   49   93:bipush          12
	//   50   95:invokevirtual   #214 <Method int Calendar.get(int)>
	//   51   98:invokestatic    #194 <Method void pad2(StringBuffer, int)>
		stringbuffer.append(':');
	//   52  101:aload           4
	//   53  103:bipush          58
	//   54  105:invokevirtual   #191 <Method StringBuffer StringBuffer.append(char)>
	//   55  108:pop             
		pad2(stringbuffer, ((Calendar) (locale)).get(13));
	//   56  109:aload           4
	//   57  111:aload_2         
	//   58  112:bipush          13
	//   59  114:invokevirtual   #214 <Method int Calendar.get(int)>
	//   60  117:invokestatic    #194 <Method void pad2(StringBuffer, int)>
		stringbuffer.append('.');
	//   61  120:aload           4
	//   62  122:bipush          46
	//   63  124:invokevirtual   #191 <Method StringBuffer StringBuffer.append(char)>
	//   64  127:pop             
		pad3(stringbuffer, ((Calendar) (locale)).get(14));
	//   65  128:aload           4
	//   66  130:aload_2         
	//   67  131:bipush          14
	//   68  133:invokevirtual   #214 <Method int Calendar.get(int)>
	//   69  136:invokestatic    #218 <Method void pad3(StringBuffer, int)>
		int i = timezone.getOffset(((Calendar) (locale)).getTimeInMillis());
	//   70  139:aload_1         
	//   71  140:aload_2         
	//   72  141:invokevirtual   #222 <Method long Calendar.getTimeInMillis()>
	//   73  144:invokevirtual   #226 <Method int TimeZone.getOffset(long)>
	//   74  147:istore          6
		if(i != 0)
	//*  75  149:iload           6
	//*  76  151:ifeq            231
		{
			int k = i / 60000;
	//   77  154:iload           6
	//   78  156:ldc1            #227 <Int 60000>
	//   79  158:idiv            
	//   80  159:istore          8
			int j = Math.abs(k / 60);
	//   81  161:iload           8
	//   82  163:bipush          60
	//   83  165:idiv            
	//   84  166:invokestatic    #232 <Method int Math.abs(int)>
	//   85  169:istore          7
			k = Math.abs(k % 60);
	//   86  171:iload           8
	//   87  173:bipush          60
	//   88  175:irem            
	//   89  176:invokestatic    #232 <Method int Math.abs(int)>
	//   90  179:istore          8
			if(i >= 0)
	//*  91  181:iload           6
	//*  92  183:ifge            189
	//*  93  186:goto            193
				c = '+';
	//   94  189:bipush          43
	//   95  191:istore          5
			stringbuffer.append(c);
	//   96  193:aload           4
	//   97  195:iload           5
	//   98  197:invokevirtual   #191 <Method StringBuffer StringBuffer.append(char)>
	//   99  200:pop             
			pad2(stringbuffer, j);
	//  100  201:aload           4
	//  101  203:iload           7
	//  102  205:invokestatic    #194 <Method void pad2(StringBuffer, int)>
			if(_tzSerializedWithColon)
	//* 103  208:aload_0         
	//* 104  209:getfield        #109 <Field boolean _tzSerializedWithColon>
	//* 105  212:ifeq            223
				stringbuffer.append(':');
	//  106  215:aload           4
	//  107  217:bipush          58
	//  108  219:invokevirtual   #191 <Method StringBuffer StringBuffer.append(char)>
	//  109  222:pop             
			pad2(stringbuffer, k);
	//  110  223:aload           4
	//  111  225:iload           8
	//  112  227:invokestatic    #194 <Method void pad2(StringBuffer, int)>
			return;
	//  113  230:return          
		}
		if(_tzSerializedWithColon)
	//* 114  231:aload_0         
	//* 115  232:getfield        #109 <Field boolean _tzSerializedWithColon>
	//* 116  235:ifeq            247
		{
			stringbuffer.append("+00:00");
	//  117  238:aload           4
	//  118  240:ldc1            #234 <String "+00:00">
	//  119  242:invokevirtual   #237 <Method StringBuffer StringBuffer.append(String)>
	//  120  245:pop             
			return;
	//  121  246:return          
		} else
		{
			stringbuffer.append("+0000");
	//  122  247:aload           4
	//  123  249:ldc1            #239 <String "+0000">
	//  124  251:invokevirtual   #237 <Method StringBuffer StringBuffer.append(String)>
	//  125  254:pop             
			return;
	//  126  255:return          
		}
	}

	protected Calendar _getCalendar(TimeZone timezone)
	{
		Calendar calendar1 = _calendar;
	//    0    0:aload_0         
	//    1    1:getfield        #241 <Field Calendar _calendar>
	//    2    4:astore_3        
		Calendar calendar = calendar1;
	//    3    5:aload_3         
	//    4    6:astore_2        
		if(calendar1 == null)
	//*   5    7:aload_3         
	//*   6    8:ifnonnull       26
		{
			calendar = (Calendar)CALENDAR.clone();
	//    7   11:getstatic       #100 <Field Calendar CALENDAR>
	//    8   14:invokevirtual   #242 <Method Object Calendar.clone()>
	//    9   17:checkcast       #206 <Class Calendar>
	//   10   20:astore_2        
			_calendar = calendar;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:putfield        #241 <Field Calendar _calendar>
		}
		if(!((Object) (calendar.getTimeZone())).equals(((Object) (timezone))))
	//*  14   26:aload_2         
	//*  15   27:invokevirtual   #245 <Method TimeZone Calendar.getTimeZone()>
	//*  16   30:aload_1         
	//*  17   31:invokevirtual   #141 <Method boolean Object.equals(Object)>
	//*  18   34:ifne            42
			calendar.setTimeZone(timezone);
	//   19   37:aload_2         
	//   20   38:aload_1         
	//   21   39:invokevirtual   #246 <Method void Calendar.setTimeZone(TimeZone)>
		calendar.setLenient(isLenient());
	//   22   42:aload_2         
	//   23   43:aload_0         
	//   24   44:invokevirtual   #249 <Method boolean isLenient()>
	//   25   47:invokevirtual   #250 <Method void Calendar.setLenient(boolean)>
		return calendar;
	//   26   50:aload_2         
	//   27   51:areturn         
	}

	protected Date _parseAsISO8601(String s, ParsePosition parseposition)
		throws IllegalArgumentException, ParseException
	{
label0:
		{
label1:
			{
				int j1;
				Object obj;
label2:
				{
					int k1 = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #256 <Method int String.length()>
	//    2    4:istore          8
					obj = ((Object) (DEFAULT_TIMEZONE));
	//    3    6:getstatic       #68  <Field TimeZone DEFAULT_TIMEZONE>
	//    4    9:astore          13
					parseposition = ((ParsePosition) (obj));
	//    5   11:aload           13
	//    6   13:astore_2        
					if(_timezone != null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #114 <Field TimeZone _timezone>
	//*   9   18:ifnull          42
					{
						parseposition = ((ParsePosition) (obj));
	//   10   21:aload           13
	//   11   23:astore_2        
						if('Z' != s.charAt(k1 - 1))
	//*  12   24:bipush          90
	//*  13   26:aload_1         
	//*  14   27:iload           8
	//*  15   29:iconst_1        
	//*  16   30:isub            
	//*  17   31:invokevirtual   #149 <Method char String.charAt(int)>
	//*  18   34:icmpeq          42
							parseposition = ((ParsePosition) (_timezone));
	//   19   37:aload_0         
	//   20   38:getfield        #114 <Field TimeZone _timezone>
	//   21   41:astore_2        
					}
					parseposition = ((ParsePosition) (_getCalendar(((TimeZone) (parseposition)))));
	//   22   42:aload_0         
	//   23   43:aload_2         
	//   24   44:invokevirtual   #204 <Method Calendar _getCalendar(TimeZone)>
	//   25   47:astore_2        
					((Calendar) (parseposition)).clear();
	//   26   48:aload_2         
	//   27   49:invokevirtual   #259 <Method void Calendar.clear()>
					int k = 0;
	//   28   52:iconst_0        
	//   29   53:istore          4
					int l = 0;
	//   30   55:iconst_0        
	//   31   56:istore          5
					boolean flag = false;
	//   32   58:iconst_0        
	//   33   59:istore          6
					if(k1 <= 10)
	//*  34   61:iload           8
	//*  35   63:bipush          10
	//*  36   65:icmpgt          124
					{
						if(PATTERN_PLAIN.matcher(((CharSequence) (s))).matches())
	//*  37   68:getstatic       #42  <Field Pattern PATTERN_PLAIN>
	//*  38   71:aload_1         
	//*  39   72:invokevirtual   #263 <Method Matcher Pattern.matcher(CharSequence)>
	//*  40   75:invokevirtual   #268 <Method boolean Matcher.matches()>
	//*  41   78:ifeq            118
						{
							((Calendar) (parseposition)).set(_parse4D(s, 0), _parse2D(s, 5) - 1, _parse2D(s, 8), 0, 0, 0);
	//   42   81:aload_2         
	//   43   82:aload_1         
	//   44   83:iconst_0        
	//   45   84:invokestatic    #270 <Method int _parse4D(String, int)>
	//   46   87:aload_1         
	//   47   88:iconst_5        
	//   48   89:invokestatic    #272 <Method int _parse2D(String, int)>
	//   49   92:iconst_1        
	//   50   93:isub            
	//   51   94:aload_1         
	//   52   95:bipush          8
	//   53   97:invokestatic    #272 <Method int _parse2D(String, int)>
	//   54  100:iconst_0        
	//   55  101:iconst_0        
	//   56  102:iconst_0        
	//   57  103:invokevirtual   #276 <Method void Calendar.set(int, int, int, int, int, int)>
							((Calendar) (parseposition)).set(14, 0);
	//   58  106:aload_2         
	//   59  107:bipush          14
	//   60  109:iconst_0        
	//   61  110:invokevirtual   #279 <Method void Calendar.set(int, int)>
							return ((Calendar) (parseposition)).getTime();
	//   62  113:aload_2         
	//   63  114:invokevirtual   #283 <Method Date Calendar.getTime()>
	//   64  117:areturn         
						}
						parseposition = "yyyy-MM-dd";
	//   65  118:ldc1            #56  <String "yyyy-MM-dd">
	//   66  120:astore_2        
						break label0;
	//   67  121:goto            517
					}
					obj = ((Object) (PATTERN_ISO8601.matcher(((CharSequence) (s)))));
	//   68  124:getstatic       #46  <Field Pattern PATTERN_ISO8601>
	//   69  127:aload_1         
	//   70  128:invokevirtual   #263 <Method Matcher Pattern.matcher(CharSequence)>
	//   71  131:astore          13
					if(!((Matcher) (obj)).matches())
						break label1;
	//   72  133:aload           13
	//   73  135:invokevirtual   #268 <Method boolean Matcher.matches()>
	//   74  138:ifeq            514
					int i2 = ((Matcher) (obj)).start(2);
	//   75  141:aload           13
	//   76  143:iconst_2        
	//   77  144:invokevirtual   #286 <Method int Matcher.start(int)>
	//   78  147:istore          9
					int j2 = ((Matcher) (obj)).end(2);
	//   79  149:aload           13
	//   80  151:iconst_2        
	//   81  152:invokevirtual   #289 <Method int Matcher.end(int)>
	//   82  155:istore          10
					int k2 = j2 - i2;
	//   83  157:iload           10
	//   84  159:iload           9
	//   85  161:isub            
	//   86  162:istore          11
					if(k2 > 1)
	//*  87  164:iload           11
	//*  88  166:iconst_1        
	//*  89  167:icmple          248
					{
						int i1 = _parse2D(s, i2 + 1) * 3600;
	//   90  170:aload_1         
	//   91  171:iload           9
	//   92  173:iconst_1        
	//   93  174:iadd            
	//   94  175:invokestatic    #272 <Method int _parse2D(String, int)>
	//   95  178:sipush          3600
	//   96  181:imul            
	//   97  182:istore          7
						int i = i1;
	//   98  184:iload           7
	//   99  186:istore_3        
						if(k2 >= 5)
	//* 100  187:iload           11
	//* 101  189:iconst_5        
	//* 102  190:icmplt          208
							i = i1 + _parse2D(s, j2 - 2) * 60;
	//  103  193:iload           7
	//  104  195:aload_1         
	//  105  196:iload           10
	//  106  198:iconst_2        
	//  107  199:isub            
	//  108  200:invokestatic    #272 <Method int _parse2D(String, int)>
	//  109  203:bipush          60
	//  110  205:imul            
	//  111  206:iadd            
	//  112  207:istore_3        
						if(s.charAt(i2) == '-')
	//* 113  208:aload_1         
	//* 114  209:iload           9
	//* 115  211:invokevirtual   #149 <Method char String.charAt(int)>
	//* 116  214:bipush          45
	//* 117  216:icmpne          228
							i *= -1000;
	//  118  219:iload_3         
	//  119  220:sipush          -1000
	//  120  223:imul            
	//  121  224:istore_3        
						else
	//* 122  225:goto            234
							i *= 1000;
	//  123  228:iload_3         
	//  124  229:sipush          1000
	//  125  232:imul            
	//  126  233:istore_3        
						((Calendar) (parseposition)).set(15, i);
	//  127  234:aload_2         
	//  128  235:bipush          15
	//  129  237:iload_3         
	//  130  238:invokevirtual   #279 <Method void Calendar.set(int, int)>
						((Calendar) (parseposition)).set(16, 0);
	//  131  241:aload_2         
	//  132  242:bipush          16
	//  133  244:iconst_0        
	//  134  245:invokevirtual   #279 <Method void Calendar.set(int, int)>
					}
					j1 = _parse4D(s, 0);
	//  135  248:aload_1         
	//  136  249:iconst_0        
	//  137  250:invokestatic    #270 <Method int _parse4D(String, int)>
	//  138  253:istore          7
					i2 = _parse2D(s, 5);
	//  139  255:aload_1         
	//  140  256:iconst_5        
	//  141  257:invokestatic    #272 <Method int _parse2D(String, int)>
	//  142  260:istore          9
					j2 = _parse2D(s, 8);
	//  143  262:aload_1         
	//  144  263:bipush          8
	//  145  265:invokestatic    #272 <Method int _parse2D(String, int)>
	//  146  268:istore          10
					k2 = _parse2D(s, 11);
	//  147  270:aload_1         
	//  148  271:bipush          11
	//  149  273:invokestatic    #272 <Method int _parse2D(String, int)>
	//  150  276:istore          11
					int l2 = _parse2D(s, 14);
	//  151  278:aload_1         
	//  152  279:bipush          14
	//  153  281:invokestatic    #272 <Method int _parse2D(String, int)>
	//  154  284:istore          12
					int j;
					if(k1 > 16 && s.charAt(16) == ':')
	//* 155  286:iload           8
	//* 156  288:bipush          16
	//* 157  290:icmple          314
	//* 158  293:aload_1         
	//* 159  294:bipush          16
	//* 160  296:invokevirtual   #149 <Method char String.charAt(int)>
	//* 161  299:bipush          58
	//* 162  301:icmpne          314
						j = _parse2D(s, 17);
	//  163  304:aload_1         
	//  164  305:bipush          17
	//  165  307:invokestatic    #272 <Method int _parse2D(String, int)>
	//  166  310:istore_3        
					else
	//* 167  311:goto            316
						j = 0;
	//  168  314:iconst_0        
	//  169  315:istore_3        
					((Calendar) (parseposition)).set(j1, i2 - 1, j2, k2, l2, j);
	//  170  316:aload_2         
	//  171  317:iload           7
	//  172  319:iload           9
	//  173  321:iconst_1        
	//  174  322:isub            
	//  175  323:iload           10
	//  176  325:iload           11
	//  177  327:iload           12
	//  178  329:iload_3         
	//  179  330:invokevirtual   #276 <Method void Calendar.set(int, int, int, int, int, int)>
					j1 = ((Matcher) (obj)).start(1) + 1;
	//  180  333:aload           13
	//  181  335:iconst_1        
	//  182  336:invokevirtual   #286 <Method int Matcher.start(int)>
	//  183  339:iconst_1        
	//  184  340:iadd            
	//  185  341:istore          7
					j = ((Matcher) (obj)).end(1);
	//  186  343:aload           13
	//  187  345:iconst_1        
	//  188  346:invokevirtual   #289 <Method int Matcher.end(int)>
	//  189  349:istore_3        
					if(j1 >= j)
	//* 190  350:iload           7
	//* 191  352:iload_3         
	//* 192  353:icmplt          366
					{
						((Calendar) (parseposition)).set(14, 0);
	//  193  356:aload_2         
	//  194  357:bipush          14
	//  195  359:iconst_0        
	//  196  360:invokevirtual   #279 <Method void Calendar.set(int, int)>
					} else
	//* 197  363:goto            472
					{
						int l1 = j - j1;
	//  198  366:iload_3         
	//  199  367:iload           7
	//  200  369:isub            
	//  201  370:istore          8
						j = ((int) (flag));
	//  202  372:iload           6
	//  203  374:istore_3        
						switch(l1)
	//* 204  375:iload           8
						{
	//* 205  377:tableswitch     0 3: default 408
	//	               0 464
	//	               1 447
	//	               2 429
	//	               3 415
						default:
							if(l1 > 9)
								break label2;
	//  206  408:iload           8
	//  207  410:bipush          9
	//  208  412:icmpgt          477
							// fall through

						case 3: // '\003'
							j = 0 + (s.charAt(j1 + 2) - 48);
	//  209  415:iconst_0        
	//  210  416:aload_1         
	//  211  417:iload           7
	//  212  419:iconst_2        
	//  213  420:iadd            
	//  214  421:invokevirtual   #149 <Method char String.charAt(int)>
	//  215  424:bipush          48
	//  216  426:isub            
	//  217  427:iadd            
	//  218  428:istore_3        
							// fall through

						case 2: // '\002'
							k = j + (s.charAt(j1 + 1) - 48) * 10;
	//  219  429:iload_3         
	//  220  430:aload_1         
	//  221  431:iload           7
	//  222  433:iconst_1        
	//  223  434:iadd            
	//  224  435:invokevirtual   #149 <Method char String.charAt(int)>
	//  225  438:bipush          48
	//  226  440:isub            
	//  227  441:bipush          10
	//  228  443:imul            
	//  229  444:iadd            
	//  230  445:istore          4
							// fall through

						case 1: // '\001'
							l = k + (s.charAt(j1) - 48) * 100;
	//  231  447:iload           4
	//  232  449:aload_1         
	//  233  450:iload           7
	//  234  452:invokevirtual   #149 <Method char String.charAt(int)>
	//  235  455:bipush          48
	//  236  457:isub            
	//  237  458:bipush          100
	//  238  460:imul            
	//  239  461:iadd            
	//  240  462:istore          5
							// fall through

						case 0: // '\0'
							((Calendar) (parseposition)).set(14, l);
	//  241  464:aload_2         
	//  242  465:bipush          14
	//  243  467:iload           5
	//  244  469:invokevirtual   #279 <Method void Calendar.set(int, int)>
							break;
						}
					}
					return ((Calendar) (parseposition)).getTime();
	//  245  472:aload_2         
	//  246  473:invokevirtual   #283 <Method Date Calendar.getTime()>
	//  247  476:areturn         
				}
				throw new ParseException(String.format("Cannot parse date \"%s\": invalid fractional seconds '%s'; can use at most 9 digits", new Object[] {
					s, ((Matcher) (obj)).group(1).substring(1)
				}), j1);
	//  248  477:new             #154 <Class ParseException>
	//  249  480:dup             
	//  250  481:ldc2            #291 <String "Cannot parse date \"%s\": invalid fractional seconds '%s'; can use at most 9 digits">
	//  251  484:iconst_2        
	//  252  485:anewarray       Object[]
	//  253  488:dup             
	//  254  489:iconst_0        
	//  255  490:aload_1         
	//  256  491:aastore         
	//  257  492:dup             
	//  258  493:iconst_1        
	//  259  494:aload           13
	//  260  496:iconst_1        
	//  261  497:invokevirtual   #295 <Method String Matcher.group(int)>
	//  262  500:iconst_1        
	//  263  501:invokevirtual   #298 <Method String String.substring(int)>
	//  264  504:aastore         
	//  265  505:invokestatic    #173 <Method String String.format(String, Object[])>
	//  266  508:iload           7
	//  267  510:invokespecial   #182 <Method void ParseException(String, int)>
	//  268  513:athrow          
			}
			parseposition = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
	//  269  514:ldc1            #50  <String "yyyy-MM-dd'T'HH:mm:ss.SSSZ">
	//  270  516:astore_2        
		}
		throw new ParseException(String.format("Cannot parse date \"%s\": while it seems to fit format '%s', parsing fails (leniency? %s)", new Object[] {
			s, parseposition, _lenient
		}), 0);
	//  271  517:new             #154 <Class ParseException>
	//  272  520:dup             
	//  273  521:ldc2            #300 <String "Cannot parse date \"%s\": while it seems to fit format '%s', parsing fails (leniency? %s)">
	//  274  524:iconst_3        
	//  275  525:anewarray       Object[]
	//  276  528:dup             
	//  277  529:iconst_0        
	//  278  530:aload_1         
	//  279  531:aastore         
	//  280  532:dup             
	//  281  533:iconst_1        
	//  282  534:aload_2         
	//  283  535:aastore         
	//  284  536:dup             
	//  285  537:iconst_2        
	//  286  538:aload_0         
	//  287  539:getfield        #116 <Field Boolean _lenient>
	//  288  542:aastore         
	//  289  543:invokestatic    #173 <Method String String.format(String, Object[])>
	//  290  546:iconst_0        
	//  291  547:invokespecial   #182 <Method void ParseException(String, int)>
	//  292  550:athrow          
	}

	protected Date _parseDate(String s, ParsePosition parseposition)
		throws ParseException
	{
		if(looksLikeISO8601(s))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #305 <Method boolean looksLikeISO8601(String)>
	//*   3    5:ifeq            15
			return parseAsISO8601(s, parseposition);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #308 <Method Date parseAsISO8601(String, ParsePosition)>
	//    8   14:areturn         
		int i = s.length();
	//    9   15:aload_1         
	//   10   16:invokevirtual   #256 <Method int String.length()>
	//   11   19:istore_3        
		int j;
		char c;
label0:
		do
		{
			do
			{
				j = i - 1;
	//   12   20:iload_3         
	//   13   21:iconst_1        
	//   14   22:isub            
	//   15   23:istore          4
				if(j < 0)
					break label0;
	//   16   25:iload           4
	//   17   27:iflt            70
				c = s.charAt(j);
	//   18   30:aload_1         
	//   19   31:iload           4
	//   20   33:invokevirtual   #149 <Method char String.charAt(int)>
	//   21   36:istore          5
				if(c < '0')
					break;
	//   22   38:iload           5
	//   23   40:bipush          48
	//   24   42:icmplt          55
				i = j;
	//   25   45:iload           4
	//   26   47:istore_3        
			} while(c <= '9');
	//   27   48:iload           5
	//   28   50:bipush          57
	//   29   52:icmple          20
			if(j > 0)
				break;
	//   30   55:iload           4
	//   31   57:ifgt            70
			i = j;
	//   32   60:iload           4
	//   33   62:istore_3        
		} while(c == '-');
	//   34   63:iload           5
	//   35   65:bipush          45
	//   36   67:icmpeq          20
		if(j < 0 && (s.charAt(0) == '-' || NumberInput.inLongRange(s, false)))
	//*  37   70:iload           4
	//*  38   72:ifge            100
	//*  39   75:aload_1         
	//*  40   76:iconst_0        
	//*  41   77:invokevirtual   #149 <Method char String.charAt(int)>
	//*  42   80:bipush          45
	//*  43   82:icmpeq          93
	//*  44   85:aload_1         
	//*  45   86:iconst_0        
	//*  46   87:invokestatic    #312 <Method boolean NumberInput.inLongRange(String, boolean)>
	//*  47   90:ifeq            100
			return _parseDateFromLong(s, parseposition);
	//   48   93:aload_0         
	//   49   94:aload_1         
	//   50   95:aload_2         
	//   51   96:invokespecial   #314 <Method Date _parseDateFromLong(String, ParsePosition)>
	//   52   99:areturn         
		else
			return parseAsRFC1123(s, parseposition);
	//   53  100:aload_0         
	//   54  101:aload_1         
	//   55  102:aload_2         
	//   56  103:invokevirtual   #317 <Method Date parseAsRFC1123(String, ParsePosition)>
	//   57  106:areturn         
	}

	public StdDateFormat clone()
	{
		return new StdDateFormat(_timezone, _locale, _lenient, _tzSerializedWithColon);
	//    0    0:new             #2   <Class StdDateFormat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #114 <Field TimeZone _timezone>
	//    4    8:aload_0         
	//    5    9:getfield        #111 <Field Locale _locale>
	//    6   12:aload_0         
	//    7   13:getfield        #116 <Field Boolean _lenient>
	//    8   16:aload_0         
	//    9   17:getfield        #109 <Field boolean _tzSerializedWithColon>
	//   10   20:invokespecial   #320 <Method void StdDateFormat(TimeZone, Locale, Boolean, boolean)>
	//   11   23:areturn         
	}

	public volatile Object clone()
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #322 <Method StdDateFormat clone()>
	//    2    4:areturn         
	}

	public boolean equals(Object obj)
	{
		return obj == this;
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:if_acmpne       7
	//    3    5:iconst_1        
	//    4    6:ireturn         
	//    5    7:iconst_0        
	//    6    8:ireturn         
	}

	public StringBuffer format(Date date, StringBuffer stringbuffer, FieldPosition fieldposition)
	{
		TimeZone timezone = _timezone;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field TimeZone _timezone>
	//    2    4:astore          4
		fieldposition = ((FieldPosition) (timezone));
	//    3    6:aload           4
	//    4    8:astore_3        
		if(timezone == null)
	//*   5    9:aload           4
	//*   6   11:ifnonnull       18
			fieldposition = ((FieldPosition) (DEFAULT_TIMEZONE));
	//    7   14:getstatic       #68  <Field TimeZone DEFAULT_TIMEZONE>
	//    8   17:astore_3        
		_format(((TimeZone) (fieldposition)), _locale, date, stringbuffer);
	//    9   18:aload_0         
	//   10   19:aload_3         
	//   11   20:aload_0         
	//   12   21:getfield        #111 <Field Locale _locale>
	//   13   24:aload_1         
	//   14   25:aload_2         
	//   15   26:invokevirtual   #325 <Method void _format(TimeZone, Locale, Date, StringBuffer)>
		return stringbuffer;
	//   16   29:aload_2         
	//   17   30:areturn         
	}

	public TimeZone getTimeZone()
	{
		return _timezone;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field TimeZone _timezone>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return System.identityHashCode(((Object) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #332 <Method int System.identityHashCode(Object)>
	//    2    4:ireturn         
	}

	public boolean isLenient()
	{
		Boolean boolean1 = _lenient;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field Boolean _lenient>
	//    2    4:astore_1        
		return boolean1 == null || boolean1.booleanValue();
	//    3    5:aload_1         
	//    4    6:ifnull          21
	//    5    9:aload_1         
	//    6   10:invokevirtual   #132 <Method boolean Boolean.booleanValue()>
	//    7   13:ifeq            19
	//    8   16:goto            21
	//    9   19:iconst_0        
	//   10   20:ireturn         
	//   11   21:iconst_1        
	//   12   22:ireturn         
	}

	protected boolean looksLikeISO8601(String s)
	{
		return s.length() >= 7 && Character.isDigit(s.charAt(0)) && Character.isDigit(s.charAt(3)) && s.charAt(4) == '-' && Character.isDigit(s.charAt(5));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #256 <Method int String.length()>
	//    2    4:bipush          7
	//    3    6:icmplt          54
	//    4    9:aload_1         
	//    5   10:iconst_0        
	//    6   11:invokevirtual   #149 <Method char String.charAt(int)>
	//    7   14:invokestatic    #338 <Method boolean Character.isDigit(char)>
	//    8   17:ifeq            54
	//    9   20:aload_1         
	//   10   21:iconst_3        
	//   11   22:invokevirtual   #149 <Method char String.charAt(int)>
	//   12   25:invokestatic    #338 <Method boolean Character.isDigit(char)>
	//   13   28:ifeq            54
	//   14   31:aload_1         
	//   15   32:iconst_4        
	//   16   33:invokevirtual   #149 <Method char String.charAt(int)>
	//   17   36:bipush          45
	//   18   38:icmpne          54
	//   19   41:aload_1         
	//   20   42:iconst_5        
	//   21   43:invokevirtual   #149 <Method char String.charAt(int)>
	//   22   46:invokestatic    #338 <Method boolean Character.isDigit(char)>
	//   23   49:ifeq            54
	//   24   52:iconst_1        
	//   25   53:ireturn         
	//   26   54:iconst_0        
	//   27   55:ireturn         
	}

	public Date parse(String s)
		throws ParseException
	{
		s = s.trim();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #344 <Method String String.trim()>
	//    2    4:astore_1        
		ParsePosition parseposition = new ParsePosition(0);
	//    3    5:new             #175 <Class ParsePosition>
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:invokespecial   #347 <Method void ParsePosition(int)>
	//    7   13:astore          4
		Object obj = ((Object) (_parseDate(s, parseposition)));
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:aload           4
	//   11   19:invokevirtual   #349 <Method Date _parseDate(String, ParsePosition)>
	//   12   22:astore          5
		if(obj != null)
	//*  13   24:aload           5
	//*  14   26:ifnull          32
			return ((Date) (obj));
	//   15   29:aload           5
	//   16   31:areturn         
		obj = ((Object) (new StringBuilder()));
	//   17   32:new             #351 <Class StringBuilder>
	//   18   35:dup             
	//   19   36:invokespecial   #352 <Method void StringBuilder()>
	//   20   39:astore          5
		String as[] = ALL_FORMATS;
	//   21   41:getstatic       #58  <Field String[] ALL_FORMATS>
	//   22   44:astore          6
		int j = as.length;
	//   23   46:aload           6
	//   24   48:arraylength     
	//   25   49:istore_3        
		for(int i = 0; i < j; i++)
	//*  26   50:iconst_0        
	//*  27   51:istore_2        
	//*  28   52:iload_2         
	//*  29   53:iload_3         
	//*  30   54:icmpge          106
		{
			String s1 = as[i];
	//   31   57:aload           6
	//   32   59:iload_2         
	//   33   60:aaload          
	//   34   61:astore          7
			if(((StringBuilder) (obj)).length() > 0)
	//*  35   63:aload           5
	//*  36   65:invokevirtual   #353 <Method int StringBuilder.length()>
	//*  37   68:ifle            83
				((StringBuilder) (obj)).append("\", \"");
	//   38   71:aload           5
	//   39   73:ldc2            #355 <String "\", \"">
	//   40   76:invokevirtual   #358 <Method StringBuilder StringBuilder.append(String)>
	//   41   79:pop             
			else
	//*  42   80:goto            91
				((StringBuilder) (obj)).append('"');
	//   43   83:aload           5
	//   44   85:bipush          34
	//   45   87:invokevirtual   #361 <Method StringBuilder StringBuilder.append(char)>
	//   46   90:pop             
			((StringBuilder) (obj)).append(s1);
	//   47   91:aload           5
	//   48   93:aload           7
	//   49   95:invokevirtual   #358 <Method StringBuilder StringBuilder.append(String)>
	//   50   98:pop             
		}

	//   51   99:iload_2         
	//   52  100:iconst_1        
	//   53  101:iadd            
	//   54  102:istore_2        
	//*  55  103:goto            52
		((StringBuilder) (obj)).append('"');
	//   56  106:aload           5
	//   57  108:bipush          34
	//   58  110:invokevirtual   #361 <Method StringBuilder StringBuilder.append(char)>
	//   59  113:pop             
		throw new ParseException(String.format("Cannot parse date \"%s\": not compatible with any of standard forms (%s)", new Object[] {
			s, ((StringBuilder) (obj)).toString()
		}), parseposition.getErrorIndex());
	//   60  114:new             #154 <Class ParseException>
	//   61  117:dup             
	//   62  118:ldc2            #363 <String "Cannot parse date \"%s\": not compatible with any of standard forms (%s)">
	//   63  121:iconst_2        
	//   64  122:anewarray       Object[]
	//   65  125:dup             
	//   66  126:iconst_0        
	//   67  127:aload_1         
	//   68  128:aastore         
	//   69  129:dup             
	//   70  130:iconst_1        
	//   71  131:aload           5
	//   72  133:invokevirtual   #366 <Method String StringBuilder.toString()>
	//   73  136:aastore         
	//   74  137:invokestatic    #173 <Method String String.format(String, Object[])>
	//   75  140:aload           4
	//   76  142:invokevirtual   #179 <Method int ParsePosition.getErrorIndex()>
	//   77  145:invokespecial   #182 <Method void ParseException(String, int)>
	//   78  148:athrow          
	}

	public Date parse(String s, ParsePosition parseposition)
	{
		try
		{
			s = ((String) (_parseDate(s, parseposition)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #349 <Method Date _parseDate(String, ParsePosition)>
	//    4    6:astore_1        
		}
	//*   5    7:aload_1         
	//*   6    8:areturn         
	//*   7    9:aconst_null     
	//*   8   10:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return null;
		}
		return ((Date) (s));
	//*   9   11:astore_1        
	//*  10   12:goto            9
	}

	protected Date parseAsISO8601(String s, ParsePosition parseposition)
		throws ParseException
	{
		Date date;
		try
		{
			date = _parseAsISO8601(s, parseposition);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #368 <Method Date _parseAsISO8601(String, ParsePosition)>
	//    4    6:astore_3        
		}
	//*   5    7:aload_3         
	//*   6    8:areturn         
		catch(IllegalArgumentException illegalargumentexception)
	//*   7    9:astore_3        
		{
			throw new ParseException(String.format("Cannot parse date \"%s\", problem: %s", new Object[] {
				s, illegalargumentexception.getMessage()
			}), parseposition.getErrorIndex());
	//    8   10:new             #154 <Class ParseException>
	//    9   13:dup             
	//   10   14:ldc2            #370 <String "Cannot parse date \"%s\", problem: %s">
	//   11   17:iconst_2        
	//   12   18:anewarray       Object[]
	//   13   21:dup             
	//   14   22:iconst_0        
	//   15   23:aload_1         
	//   16   24:aastore         
	//   17   25:dup             
	//   18   26:iconst_1        
	//   19   27:aload_3         
	//   20   28:invokevirtual   #373 <Method String IllegalArgumentException.getMessage()>
	//   21   31:aastore         
	//   22   32:invokestatic    #173 <Method String String.format(String, Object[])>
	//   23   35:aload_2         
	//   24   36:invokevirtual   #179 <Method int ParsePosition.getErrorIndex()>
	//   25   39:invokespecial   #182 <Method void ParseException(String, int)>
	//   26   42:athrow          
		}
		return date;
	}

	protected Date parseAsRFC1123(String s, ParsePosition parseposition)
	{
		if(_formatRFC1123 == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #198 <Field DateFormat _formatRFC1123>
	//*   2    4:ifnonnull       31
			_formatRFC1123 = _cloneFormat(DATE_FORMAT_RFC1123, "EEE, dd MMM yyyy HH:mm:ss zzz", _timezone, _locale, _lenient);
	//    3    7:aload_0         
	//    4    8:getstatic       #83  <Field DateFormat DATE_FORMAT_RFC1123>
	//    5   11:ldc1            #54  <String "EEE, dd MMM yyyy HH:mm:ss zzz">
	//    6   13:aload_0         
	//    7   14:getfield        #114 <Field TimeZone _timezone>
	//    8   17:aload_0         
	//    9   18:getfield        #111 <Field Locale _locale>
	//   10   21:aload_0         
	//   11   22:getfield        #116 <Field Boolean _lenient>
	//   12   25:invokestatic    #375 <Method DateFormat _cloneFormat(DateFormat, String, TimeZone, Locale, Boolean)>
	//   13   28:putfield        #198 <Field DateFormat _formatRFC1123>
		return _formatRFC1123.parse(s, parseposition);
	//   14   31:aload_0         
	//   15   32:getfield        #198 <Field DateFormat _formatRFC1123>
	//   16   35:aload_1         
	//   17   36:aload_2         
	//   18   37:invokevirtual   #377 <Method Date DateFormat.parse(String, ParsePosition)>
	//   19   40:areturn         
	}

	public void setLenient(boolean flag)
	{
		Boolean boolean1 = Boolean.valueOf(flag);
	//    0    0:iload_1         
	//    1    1:invokestatic    #381 <Method Boolean Boolean.valueOf(boolean)>
	//    2    4:astore_2        
		if(!_equals(((Object) (boolean1)), ((Object) (_lenient))))
	//*   3    5:aload_2         
	//*   4    6:aload_0         
	//*   5    7:getfield        #116 <Field Boolean _lenient>
	//*   6   10:invokestatic    #383 <Method boolean _equals(Object, Object)>
	//*   7   13:ifne            25
		{
			_lenient = boolean1;
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:putfield        #116 <Field Boolean _lenient>
			_clearFormats();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #385 <Method void _clearFormats()>
		}
	//   13   25:return          
	}

	public void setTimeZone(TimeZone timezone)
	{
		if(!((Object) (timezone)).equals(((Object) (_timezone))))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #114 <Field TimeZone _timezone>
	//*   3    5:invokevirtual   #141 <Method boolean Object.equals(Object)>
	//*   4    8:ifne            20
		{
			_clearFormats();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #385 <Method void _clearFormats()>
			_timezone = timezone;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #114 <Field TimeZone _timezone>
		}
	//   10   20:return          
	}

	public String toPattern()
	{
		StringBuilder stringbuilder = new StringBuilder(100);
	//    0    0:new             #351 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          100
	//    3    6:invokespecial   #387 <Method void StringBuilder(int)>
	//    4    9:astore_2        
		stringbuilder.append("[one of: '");
	//    5   10:aload_2         
	//    6   11:ldc2            #389 <String "[one of: '">
	//    7   14:invokevirtual   #358 <Method StringBuilder StringBuilder.append(String)>
	//    8   17:pop             
		stringbuilder.append("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
	//    9   18:aload_2         
	//   10   19:ldc1            #50  <String "yyyy-MM-dd'T'HH:mm:ss.SSSZ">
	//   11   21:invokevirtual   #358 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder.append("', '");
	//   13   25:aload_2         
	//   14   26:ldc2            #391 <String "', '">
	//   15   29:invokevirtual   #358 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		stringbuilder.append("EEE, dd MMM yyyy HH:mm:ss zzz");
	//   17   33:aload_2         
	//   18   34:ldc1            #54  <String "EEE, dd MMM yyyy HH:mm:ss zzz">
	//   19   36:invokevirtual   #358 <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
		stringbuilder.append("' (");
	//   21   40:aload_2         
	//   22   41:ldc2            #393 <String "' (">
	//   23   44:invokevirtual   #358 <Method StringBuilder StringBuilder.append(String)>
	//   24   47:pop             
		String s;
		if(Boolean.FALSE.equals(((Object) (_lenient))))
	//*  25   48:getstatic       #396 <Field Boolean Boolean.FALSE>
	//*  26   51:aload_0         
	//*  27   52:getfield        #116 <Field Boolean _lenient>
	//*  28   55:invokevirtual   #397 <Method boolean Boolean.equals(Object)>
	//*  29   58:ifeq            68
			s = "strict";
	//   30   61:ldc2            #399 <String "strict">
	//   31   64:astore_1        
		else
	//*  32   65:goto            72
			s = "lenient";
	//   33   68:ldc2            #401 <String "lenient">
	//   34   71:astore_1        
		stringbuilder.append(s);
	//   35   72:aload_2         
	//   36   73:aload_1         
	//   37   74:invokevirtual   #358 <Method StringBuilder StringBuilder.append(String)>
	//   38   77:pop             
		stringbuilder.append(")]");
	//   39   78:aload_2         
	//   40   79:ldc2            #403 <String ")]">
	//   41   82:invokevirtual   #358 <Method StringBuilder StringBuilder.append(String)>
	//   42   85:pop             
		return stringbuilder.toString();
	//   43   86:aload_2         
	//   44   87:invokevirtual   #366 <Method String StringBuilder.toString()>
	//   45   90:areturn         
	}

	public String toString()
	{
		return String.format("DateFormat %s: (timezone: %s, locale: %s, lenient: %s)", new Object[] {
			((Object)this).getClass().getName(), _timezone, _locale, _lenient
		});
	//    0    0:ldc2            #405 <String "DateFormat %s: (timezone: %s, locale: %s, lenient: %s)">
	//    1    3:iconst_4        
	//    2    4:anewarray       Object[]
	//    3    7:dup             
	//    4    8:iconst_0        
	//    5    9:aload_0         
	//    6   10:invokevirtual   #409 <Method Class Object.getClass()>
	//    7   13:invokevirtual   #414 <Method String Class.getName()>
	//    8   16:aastore         
	//    9   17:dup             
	//   10   18:iconst_1        
	//   11   19:aload_0         
	//   12   20:getfield        #114 <Field TimeZone _timezone>
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_2        
	//   16   26:aload_0         
	//   17   27:getfield        #111 <Field Locale _locale>
	//   18   30:aastore         
	//   19   31:dup             
	//   20   32:iconst_3        
	//   21   33:aload_0         
	//   22   34:getfield        #116 <Field Boolean _lenient>
	//   23   37:aastore         
	//   24   38:invokestatic    #173 <Method String String.format(String, Object[])>
	//   25   41:areturn         
	}

	public StdDateFormat withLenient(Boolean boolean1)
	{
		if(_equals(((Object) (boolean1)), ((Object) (_lenient))))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #116 <Field Boolean _lenient>
	//*   3    5:invokestatic    #383 <Method boolean _equals(Object, Object)>
	//*   4    8:ifeq            13
			return this;
	//    5   11:aload_0         
	//    6   12:areturn         
		else
			return new StdDateFormat(_timezone, _locale, boolean1, _tzSerializedWithColon);
	//    7   13:new             #2   <Class StdDateFormat>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #114 <Field TimeZone _timezone>
	//   11   21:aload_0         
	//   12   22:getfield        #111 <Field Locale _locale>
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #109 <Field boolean _tzSerializedWithColon>
	//   16   30:invokespecial   #320 <Method void StdDateFormat(TimeZone, Locale, Boolean, boolean)>
	//   17   33:areturn         
	}

	public StdDateFormat withLocale(Locale locale)
	{
		if(locale.equals(((Object) (_locale))))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #111 <Field Locale _locale>
	//*   3    5:invokevirtual   #122 <Method boolean Locale.equals(Object)>
	//*   4    8:ifeq            13
			return this;
	//    5   11:aload_0         
	//    6   12:areturn         
		else
			return new StdDateFormat(_timezone, locale, _lenient, _tzSerializedWithColon);
	//    7   13:new             #2   <Class StdDateFormat>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #114 <Field TimeZone _timezone>
	//   11   21:aload_1         
	//   12   22:aload_0         
	//   13   23:getfield        #116 <Field Boolean _lenient>
	//   14   26:aload_0         
	//   15   27:getfield        #109 <Field boolean _tzSerializedWithColon>
	//   16   30:invokespecial   #320 <Method void StdDateFormat(TimeZone, Locale, Boolean, boolean)>
	//   17   33:areturn         
	}

	public StdDateFormat withTimeZone(TimeZone timezone)
	{
		TimeZone timezone1 = timezone;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(timezone == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       10
			timezone1 = DEFAULT_TIMEZONE;
	//    4    6:getstatic       #68  <Field TimeZone DEFAULT_TIMEZONE>
	//    5    9:astore_2        
		timezone = _timezone;
	//    6   10:aload_0         
	//    7   11:getfield        #114 <Field TimeZone _timezone>
	//    8   14:astore_1        
		if(timezone1 != timezone)
	//*   9   15:aload_2         
	//*  10   16:aload_1         
	//*  11   17:if_acmpeq       51
		{
			if(((Object) (timezone1)).equals(((Object) (timezone))))
	//*  12   20:aload_2         
	//*  13   21:aload_1         
	//*  14   22:invokevirtual   #141 <Method boolean Object.equals(Object)>
	//*  15   25:ifeq            30
				return this;
	//   16   28:aload_0         
	//   17   29:areturn         
			else
				return new StdDateFormat(timezone1, _locale, _lenient, _tzSerializedWithColon);
	//   18   30:new             #2   <Class StdDateFormat>
	//   19   33:dup             
	//   20   34:aload_2         
	//   21   35:aload_0         
	//   22   36:getfield        #111 <Field Locale _locale>
	//   23   39:aload_0         
	//   24   40:getfield        #116 <Field Boolean _lenient>
	//   25   43:aload_0         
	//   26   44:getfield        #109 <Field boolean _tzSerializedWithColon>
	//   27   47:invokespecial   #320 <Method void StdDateFormat(TimeZone, Locale, Boolean, boolean)>
	//   28   50:areturn         
		} else
		{
			return this;
	//   29   51:aload_0         
	//   30   52:areturn         
		}
	}

	protected static final String ALL_FORMATS[] = {
		"yyyy-MM-dd'T'HH:mm:ss.SSSZ", "yyyy-MM-dd'T'HH:mm:ss.SSS", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd"
	};
	protected static final Calendar CALENDAR;
	protected static final DateFormat DATE_FORMAT_ISO8601;
	protected static final DateFormat DATE_FORMAT_RFC1123;
	protected static final Locale DEFAULT_LOCALE;
	protected static final TimeZone DEFAULT_TIMEZONE;
	protected static final Pattern PATTERN_ISO8601;
	protected static final Pattern PATTERN_PLAIN = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d");
	public static final StdDateFormat instance = new StdDateFormat();
	private transient Calendar _calendar;
	private transient DateFormat _formatRFC1123;
	protected Boolean _lenient;
	protected final Locale _locale;
	protected transient TimeZone _timezone;
	private boolean _tzSerializedWithColon;

	static 
	{
	//    0    0:ldc1            #34  <String "\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d">
	//    1    2:invokestatic    #40  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #42  <Field Pattern PATTERN_PLAIN>
		Pattern pattern;
		try
		{
			pattern = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d[T]\\d\\d[:]\\d\\d(?:[:]\\d\\d)?(\\.\\d+)?(Z|[+-]\\d\\d(?:[:]?\\d\\d)?)?");
	//    3    8:ldc1            #44  <String "\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d[T]\\d\\d[:]\\d\\d(?:[:]\\d\\d)?(\\.\\d+)?(Z|[+-]\\d\\d(?:[:]?\\d\\d)?)?">
	//    4   10:invokestatic    #40  <Method Pattern Pattern.compile(String)>
	//    5   13:astore_0        
		}
	//*   6   14:aload_0         
	//*   7   15:putstatic       #46  <Field Pattern PATTERN_ISO8601>
	//*   8   18:iconst_4        
	//*   9   19:anewarray       String[]
	//*  10   22:dup             
	//*  11   23:iconst_0        
	//*  12   24:ldc1            #50  <String "yyyy-MM-dd'T'HH:mm:ss.SSSZ">
	//*  13   26:aastore         
	//*  14   27:dup             
	//*  15   28:iconst_1        
	//*  16   29:ldc1            #52  <String "yyyy-MM-dd'T'HH:mm:ss.SSS">
	//*  17   31:aastore         
	//*  18   32:dup             
	//*  19   33:iconst_2        
	//*  20   34:ldc1            #54  <String "EEE, dd MMM yyyy HH:mm:ss zzz">
	//*  21   36:aastore         
	//*  22   37:dup             
	//*  23   38:iconst_3        
	//*  24   39:ldc1            #56  <String "yyyy-MM-dd">
	//*  25   41:aastore         
	//*  26   42:putstatic       #58  <Field String[] ALL_FORMATS>
	//*  27   45:ldc1            #60  <String "UTC">
	//*  28   47:invokestatic    #66  <Method TimeZone TimeZone.getTimeZone(String)>
	//*  29   50:putstatic       #68  <Field TimeZone DEFAULT_TIMEZONE>
	//*  30   53:getstatic       #73  <Field Locale Locale.US>
	//*  31   56:putstatic       #75  <Field Locale DEFAULT_LOCALE>
	//*  32   59:new             #77  <Class SimpleDateFormat>
	//*  33   62:dup             
	//*  34   63:ldc1            #54  <String "EEE, dd MMM yyyy HH:mm:ss zzz">
	//*  35   65:getstatic       #75  <Field Locale DEFAULT_LOCALE>
	//*  36   68:invokespecial   #81  <Method void SimpleDateFormat(String, Locale)>
	//*  37   71:putstatic       #83  <Field DateFormat DATE_FORMAT_RFC1123>
	//*  38   74:getstatic       #83  <Field DateFormat DATE_FORMAT_RFC1123>
	//*  39   77:getstatic       #68  <Field TimeZone DEFAULT_TIMEZONE>
	//*  40   80:invokevirtual   #87  <Method void DateFormat.setTimeZone(TimeZone)>
	//*  41   83:new             #77  <Class SimpleDateFormat>
	//*  42   86:dup             
	//*  43   87:ldc1            #50  <String "yyyy-MM-dd'T'HH:mm:ss.SSSZ">
	//*  44   89:getstatic       #75  <Field Locale DEFAULT_LOCALE>
	//*  45   92:invokespecial   #81  <Method void SimpleDateFormat(String, Locale)>
	//*  46   95:putstatic       #89  <Field DateFormat DATE_FORMAT_ISO8601>
	//*  47   98:getstatic       #89  <Field DateFormat DATE_FORMAT_ISO8601>
	//*  48  101:getstatic       #68  <Field TimeZone DEFAULT_TIMEZONE>
	//*  49  104:invokevirtual   #87  <Method void DateFormat.setTimeZone(TimeZone)>
	//*  50  107:new             #2   <Class StdDateFormat>
	//*  51  110:dup             
	//*  52  111:invokespecial   #91  <Method void StdDateFormat()>
	//*  53  114:putstatic       #93  <Field StdDateFormat instance>
	//*  54  117:new             #95  <Class GregorianCalendar>
	//*  55  120:dup             
	//*  56  121:getstatic       #68  <Field TimeZone DEFAULT_TIMEZONE>
	//*  57  124:getstatic       #75  <Field Locale DEFAULT_LOCALE>
	//*  58  127:invokespecial   #98  <Method void GregorianCalendar(TimeZone, Locale)>
	//*  59  130:putstatic       #100 <Field Calendar CALENDAR>
	//*  60  133:return          
		catch(Throwable throwable)
	//*  61  134:astore_0        
		{
			throw new RuntimeException(throwable);
	//   62  135:new             #102 <Class RuntimeException>
	//   63  138:dup             
	//   64  139:aload_0         
	//   65  140:invokespecial   #105 <Method void RuntimeException(Throwable)>
	//   66  143:athrow          
		}
		PATTERN_ISO8601 = pattern;
		DEFAULT_TIMEZONE = TimeZone.getTimeZone("UTC");
		DEFAULT_LOCALE = Locale.US;
		DATE_FORMAT_RFC1123 = ((DateFormat) (new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", DEFAULT_LOCALE)));
		DATE_FORMAT_RFC1123.setTimeZone(DEFAULT_TIMEZONE);
		DATE_FORMAT_ISO8601 = ((DateFormat) (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", DEFAULT_LOCALE)));
		DATE_FORMAT_ISO8601.setTimeZone(DEFAULT_TIMEZONE);
		CALENDAR = ((Calendar) (new GregorianCalendar(DEFAULT_TIMEZONE, DEFAULT_LOCALE)));
	}
}
