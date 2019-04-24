// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.io.NumberInput;
import java.text.*;
import java.util.*;

public class StdDateFormat extends DateFormat
{

	public StdDateFormat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void DateFormat()>
		_locale = DEFAULT_LOCALE;
	//    2    4:aload_0         
	//    3    5:getstatic       #61  <Field Locale DEFAULT_LOCALE>
	//    4    8:putfield        #87  <Field Locale _locale>
	//    5   11:return          
	}

	public StdDateFormat(TimeZone timezone, Locale locale)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void DateFormat()>
		_timezone = timezone;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #91  <Field TimeZone _timezone>
		_locale = locale;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #87  <Field Locale _locale>
	//    8   14:return          
	}

	protected StdDateFormat(TimeZone timezone, Locale locale, Boolean boolean1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void DateFormat()>
		_timezone = timezone;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #91  <Field TimeZone _timezone>
		_locale = locale;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #87  <Field Locale _locale>
		_lenient = boolean1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #95  <Field Boolean _lenient>
	//   11   19:return          
	}

	private static final DateFormat _cloneFormat(DateFormat dateformat, String s, TimeZone timezone, Locale locale, Boolean boolean1)
	{
		if(locale.equals(((Object) (DEFAULT_LOCALE)))) goto _L2; else goto _L1
	//    0    0:aload_3         
	//    1    1:getstatic       #61  <Field Locale DEFAULT_LOCALE>
	//    2    4:invokevirtual   #101 <Method boolean Locale.equals(Object)>
	//    3    7:ifne            53
_L1:
		s = ((String) (new SimpleDateFormat(s, locale)));
	//    4   10:new             #63  <Class SimpleDateFormat>
	//    5   13:dup             
	//    6   14:aload_1         
	//    7   15:aload_3         
	//    8   16:invokespecial   #67  <Method void SimpleDateFormat(String, Locale)>
	//    9   19:astore_1        
		dateformat = ((DateFormat) (timezone));
	//   10   20:aload_2         
	//   11   21:astore_0        
		if(timezone == null)
	//*  12   22:aload_2         
	//*  13   23:ifnonnull       30
			dateformat = ((DateFormat) (DEFAULT_TIMEZONE));
	//   14   26:getstatic       #54  <Field TimeZone DEFAULT_TIMEZONE>
	//   15   29:astore_0        
		((DateFormat) (s)).setTimeZone(((TimeZone) (dateformat)));
	//   16   30:aload_1         
	//   17   31:aload_0         
	//   18   32:invokevirtual   #73  <Method void DateFormat.setTimeZone(TimeZone)>
		dateformat = ((DateFormat) (s));
	//   19   35:aload_1         
	//   20   36:astore_0        
_L4:
		if(boolean1 != null)
	//*  21   37:aload           4
	//*  22   39:ifnull          51
			dateformat.setLenient(boolean1.booleanValue());
	//   23   42:aload_0         
	//   24   43:aload           4
	//   25   45:invokevirtual   #107 <Method boolean Boolean.booleanValue()>
	//   26   48:invokevirtual   #111 <Method void DateFormat.setLenient(boolean)>
		return dateformat;
	//   27   51:aload_0         
	//   28   52:areturn         
_L2:
		s = ((String) ((DateFormat)dateformat.clone()));
	//   29   53:aload_0         
	//   30   54:invokevirtual   #115 <Method Object DateFormat.clone()>
	//   31   57:checkcast       #4   <Class DateFormat>
	//   32   60:astore_1        
		dateformat = ((DateFormat) (s));
	//   33   61:aload_1         
	//   34   62:astore_0        
		if(timezone != null)
	//*  35   63:aload_2         
	//*  36   64:ifnull          37
		{
			((DateFormat) (s)).setTimeZone(timezone);
	//   37   67:aload_1         
	//   38   68:aload_2         
	//   39   69:invokevirtual   #73  <Method void DateFormat.setTimeZone(TimeZone)>
			dateformat = ((DateFormat) (s));
	//   40   72:aload_1         
	//   41   73:astore_0        
		}
		if(true) goto _L4; else goto _L3
	//   42   74:goto            37
_L3:
	}

	public static TimeZone getDefaultTimeZone()
	{
		return DEFAULT_TIMEZONE;
	//    0    0:getstatic       #54  <Field TimeZone DEFAULT_TIMEZONE>
	//    1    3:areturn         
	}

	public static DateFormat getISO8601Format(TimeZone timezone)
	{
		return getISO8601Format(timezone, DEFAULT_LOCALE);
	//    0    0:aload_0         
	//    1    1:getstatic       #61  <Field Locale DEFAULT_LOCALE>
	//    2    4:invokestatic    #122 <Method DateFormat getISO8601Format(TimeZone, Locale)>
	//    3    7:areturn         
	}

	public static DateFormat getISO8601Format(TimeZone timezone, Locale locale)
	{
		return _cloneFormat(DATE_FORMAT_ISO8601, "yyyy-MM-dd'T'HH:mm:ss.SSSZ", timezone, locale, ((Boolean) (null)));
	//    0    0:getstatic       #75  <Field DateFormat DATE_FORMAT_ISO8601>
	//    1    3:ldc1            #15  <String "yyyy-MM-dd'T'HH:mm:ss.SSSZ">
	//    2    5:aload_0         
	//    3    6:aload_1         
	//    4    7:aconst_null     
	//    5    8:invokestatic    #124 <Method DateFormat _cloneFormat(DateFormat, String, TimeZone, Locale, Boolean)>
	//    6   11:areturn         
	}

	public static DateFormat getRFC1123Format(TimeZone timezone)
	{
		return getRFC1123Format(timezone, DEFAULT_LOCALE);
	//    0    0:aload_0         
	//    1    1:getstatic       #61  <Field Locale DEFAULT_LOCALE>
	//    2    4:invokestatic    #127 <Method DateFormat getRFC1123Format(TimeZone, Locale)>
	//    3    7:areturn         
	}

	public static DateFormat getRFC1123Format(TimeZone timezone, Locale locale)
	{
		return _cloneFormat(DATE_FORMAT_RFC1123, "EEE, dd MMM yyyy HH:mm:ss zzz", timezone, locale, ((Boolean) (null)));
	//    0    0:getstatic       #69  <Field DateFormat DATE_FORMAT_RFC1123>
	//    1    3:ldc1            #24  <String "EEE, dd MMM yyyy HH:mm:ss zzz">
	//    2    5:aload_0         
	//    3    6:aload_1         
	//    4    7:aconst_null     
	//    5    8:invokestatic    #124 <Method DateFormat _cloneFormat(DateFormat, String, TimeZone, Locale, Boolean)>
	//    6   11:areturn         
	}

	private static final boolean hasTimeZone(String s)
	{
		int i = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #133 <Method int String.length()>
	//    2    4:istore_1        
		if(i < 6) goto _L2; else goto _L1
	//    3    5:iload_1         
	//    4    6:bipush          6
	//    5    8:icmplt          74
_L1:
		char c = s.charAt(i - 6);
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:bipush          6
	//    9   15:isub            
	//   10   16:invokevirtual   #137 <Method char String.charAt(int)>
	//   11   19:istore_2        
		if(c != '+' && c != '-') goto _L4; else goto _L3
	//   12   20:iload_2         
	//   13   21:bipush          43
	//   14   23:icmpeq          32
	//   15   26:iload_2         
	//   16   27:bipush          45
	//   17   29:icmpne          34
_L3:
		return true;
	//   18   32:iconst_1        
	//   19   33:ireturn         
	//*  20   34:aload_0         
	//*  21   35:iload_1         
	//*  22   36:iconst_5        
	//*  23   37:isub            
	//*  24   38:invokevirtual   #137 <Method char String.charAt(int)>
	//*  25   41:istore_2        
_L4:
		if((c = s.charAt(i - 5)) == '+' || c == '-' || ((i = ((int) (s.charAt(i - 3)))) == '+' || i == '-')) goto _L3; else goto _L2
	//   26   42:iload_2         
	//   27   43:bipush          43
	//   28   45:icmpeq          32
	//   29   48:iload_2         
	//   30   49:bipush          45
	//   31   51:icmpeq          32
	//   32   54:aload_0         
	//   33   55:iload_1         
	//   34   56:iconst_3        
	//   35   57:isub            
	//   36   58:invokevirtual   #137 <Method char String.charAt(int)>
	//   37   61:istore_1        
	//   38   62:iload_1         
	//   39   63:bipush          43
	//   40   65:icmpeq          32
	//   41   68:iload_1         
	//   42   69:bipush          45
	//   43   71:icmpeq          32
_L2:
		return false;
	//   44   74:iconst_0        
	//   45   75:ireturn         
	}

	protected void _clearFormats()
	{
		_formatRFC1123 = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #140 <Field DateFormat _formatRFC1123>
		_formatISO8601 = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #142 <Field DateFormat _formatISO8601>
		_formatISO8601_z = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #144 <Field DateFormat _formatISO8601_z>
		_formatPlain = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #146 <Field DateFormat _formatPlain>
	//   12   20:return          
	}

	public StdDateFormat clone()
	{
		return new StdDateFormat(_timezone, _locale, _lenient);
	//    0    0:new             #2   <Class StdDateFormat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #91  <Field TimeZone _timezone>
	//    4    8:aload_0         
	//    5    9:getfield        #87  <Field Locale _locale>
	//    6   12:aload_0         
	//    7   13:getfield        #95  <Field Boolean _lenient>
	//    8   16:invokespecial   #149 <Method void StdDateFormat(TimeZone, Locale, Boolean)>
	//    9   19:areturn         
	}

	public volatile Object clone()
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #151 <Method StdDateFormat clone()>
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
		if(_formatISO8601 == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #142 <Field DateFormat _formatISO8601>
	//*   2    4:ifnonnull       31
			_formatISO8601 = _cloneFormat(DATE_FORMAT_ISO8601, "yyyy-MM-dd'T'HH:mm:ss.SSSZ", _timezone, _locale, _lenient);
	//    3    7:aload_0         
	//    4    8:getstatic       #75  <Field DateFormat DATE_FORMAT_ISO8601>
	//    5   11:ldc1            #15  <String "yyyy-MM-dd'T'HH:mm:ss.SSSZ">
	//    6   13:aload_0         
	//    7   14:getfield        #91  <Field TimeZone _timezone>
	//    8   17:aload_0         
	//    9   18:getfield        #87  <Field Locale _locale>
	//   10   21:aload_0         
	//   11   22:getfield        #95  <Field Boolean _lenient>
	//   12   25:invokestatic    #124 <Method DateFormat _cloneFormat(DateFormat, String, TimeZone, Locale, Boolean)>
	//   13   28:putfield        #142 <Field DateFormat _formatISO8601>
		return _formatISO8601.format(date, stringbuffer, fieldposition);
	//   14   31:aload_0         
	//   15   32:getfield        #142 <Field DateFormat _formatISO8601>
	//   16   35:aload_1         
	//   17   36:aload_2         
	//   18   37:aload_3         
	//   19   38:invokevirtual   #155 <Method StringBuffer DateFormat.format(Date, StringBuffer, FieldPosition)>
	//   20   41:areturn         
	}

	public TimeZone getTimeZone()
	{
		return _timezone;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field TimeZone _timezone>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return System.identityHashCode(((Object) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #162 <Method int System.identityHashCode(Object)>
	//    2    4:ireturn         
	}

	public boolean isLenient()
	{
		if(_lenient == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field Boolean _lenient>
	//*   2    4:ifnonnull       9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		else
			return _lenient.booleanValue();
	//    5    9:aload_0         
	//    6   10:getfield        #95  <Field Boolean _lenient>
	//    7   13:invokevirtual   #107 <Method boolean Boolean.booleanValue()>
	//    8   16:ireturn         
	}

	protected boolean looksLikeISO8601(String s)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag = flag1;
	//    2    2:iload_3         
	//    3    3:istore_2        
		if(s.length() >= 5)
	//*   4    4:aload_1         
	//*   5    5:invokevirtual   #133 <Method int String.length()>
	//*   6    8:iconst_5        
	//*   7    9:icmplt          52
		{
			flag = flag1;
	//    8   12:iload_3         
	//    9   13:istore_2        
			if(Character.isDigit(s.charAt(0)))
	//*  10   14:aload_1         
	//*  11   15:iconst_0        
	//*  12   16:invokevirtual   #137 <Method char String.charAt(int)>
	//*  13   19:invokestatic    #170 <Method boolean Character.isDigit(char)>
	//*  14   22:ifeq            52
			{
				flag = flag1;
	//   15   25:iload_3         
	//   16   26:istore_2        
				if(Character.isDigit(s.charAt(3)))
	//*  17   27:aload_1         
	//*  18   28:iconst_3        
	//*  19   29:invokevirtual   #137 <Method char String.charAt(int)>
	//*  20   32:invokestatic    #170 <Method boolean Character.isDigit(char)>
	//*  21   35:ifeq            52
				{
					flag = flag1;
	//   22   38:iload_3         
	//   23   39:istore_2        
					if(s.charAt(4) == '-')
	//*  24   40:aload_1         
	//*  25   41:iconst_4        
	//*  26   42:invokevirtual   #137 <Method char String.charAt(int)>
	//*  27   45:bipush          45
	//*  28   47:icmpne          52
						flag = true;
	//   29   50:iconst_1        
	//   30   51:istore_2        
				}
			}
		}
		return flag;
	//   31   52:iload_2         
	//   32   53:ireturn         
	}

	public Date parse(String s)
		throws ParseException
	{
		String s1 = s.trim();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #178 <Method String String.trim()>
	//    2    4:astore          5
		ParsePosition parseposition = new ParsePosition(0);
	//    3    6:new             #180 <Class ParsePosition>
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:invokespecial   #183 <Method void ParsePosition(int)>
	//    7   14:astore          6
		if(looksLikeISO8601(s1))
	//*   8   16:aload_0         
	//*   9   17:aload           5
	//*  10   19:invokevirtual   #185 <Method boolean looksLikeISO8601(String)>
	//*  11   22:ifeq            41
		{
			s = ((String) (parseAsISO8601(s1, parseposition, true)));
	//   12   25:aload_0         
	//   13   26:aload           5
	//   14   28:aload           6
	//   15   30:iconst_1        
	//   16   31:invokevirtual   #189 <Method Date parseAsISO8601(String, ParsePosition, boolean)>
	//   17   34:astore_1        
		} else
	//*  18   35:aload_1         
	//*  19   36:ifnull          144
	//*  20   39:aload_1         
	//*  21   40:areturn         
		{
			int i = s1.length();
	//   22   41:aload           5
	//   23   43:invokevirtual   #133 <Method int String.length()>
	//   24   46:istore_2        
			int k;
			char c;
label0:
			do
			{
				do
				{
					k = i - 1;
	//   25   47:iload_2         
	//   26   48:iconst_1        
	//   27   49:isub            
	//   28   50:istore_3        
					if(k < 0)
						break label0;
	//   29   51:iload_3         
	//   30   52:iflt            92
					c = s1.charAt(k);
	//   31   55:aload           5
	//   32   57:iload_3         
	//   33   58:invokevirtual   #137 <Method char String.charAt(int)>
	//   34   61:istore          4
					if(c < '0')
						break;
	//   35   63:iload           4
	//   36   65:bipush          48
	//   37   67:icmplt          79
					i = k;
	//   38   70:iload_3         
	//   39   71:istore_2        
				} while(c <= '9');
	//   40   72:iload           4
	//   41   74:bipush          57
	//   42   76:icmple          47
				if(k > 0)
					break;
	//   43   79:iload_3         
	//   44   80:ifgt            92
				i = k;
	//   45   83:iload_3         
	//   46   84:istore_2        
			} while(c == '-');
	//   47   85:iload           4
	//   48   87:bipush          45
	//   49   89:icmpeq          47
			if(k < 0 && (s1.charAt(0) == '-' || NumberInput.inLongRange(s1, false)))
	//*  50   92:iload_3         
	//*  51   93:ifge            132
	//*  52   96:aload           5
	//*  53   98:iconst_0        
	//*  54   99:invokevirtual   #137 <Method char String.charAt(int)>
	//*  55  102:bipush          45
	//*  56  104:icmpeq          116
	//*  57  107:aload           5
	//*  58  109:iconst_0        
	//*  59  110:invokestatic    #195 <Method boolean NumberInput.inLongRange(String, boolean)>
	//*  60  113:ifeq            132
				s = ((String) (new Date(Long.parseLong(s1))));
	//   61  116:new             #197 <Class Date>
	//   62  119:dup             
	//   63  120:aload           5
	//   64  122:invokestatic    #203 <Method long Long.parseLong(String)>
	//   65  125:invokespecial   #206 <Method void Date(long)>
	//   66  128:astore_1        
			else
	//*  67  129:goto            35
				s = ((String) (parseAsRFC1123(s1, parseposition)));
	//   68  132:aload_0         
	//   69  133:aload           5
	//   70  135:aload           6
	//   71  137:invokevirtual   #210 <Method Date parseAsRFC1123(String, ParsePosition)>
	//   72  140:astore_1        
		}
		if(s != null)
			return ((Date) (s));
	//*  73  141:goto            35
		s = ((String) (new StringBuilder()));
	//   74  144:new             #212 <Class StringBuilder>
	//   75  147:dup             
	//   76  148:invokespecial   #213 <Method void StringBuilder()>
	//   77  151:astore_1        
		String as[] = ALL_FORMATS;
	//   78  152:getstatic       #44  <Field String[] ALL_FORMATS>
	//   79  155:astore          7
		int l = as.length;
	//   80  157:aload           7
	//   81  159:arraylength     
	//   82  160:istore_3        
		int j = 0;
	//   83  161:iconst_0        
	//   84  162:istore_2        
		while(j < l) 
	//*  85  163:iload_2         
	//*  86  164:iload_3         
	//*  87  165:icmpge          212
		{
			String s2 = as[j];
	//   88  168:aload           7
	//   89  170:iload_2         
	//   90  171:aaload          
	//   91  172:astore          8
			if(((StringBuilder) (s)).length() > 0)
	//*  92  174:aload_1         
	//*  93  175:invokevirtual   #214 <Method int StringBuilder.length()>
	//*  94  178:ifle            202
				((StringBuilder) (s)).append("\", \"");
	//   95  181:aload_1         
	//   96  182:ldc1            #216 <String "\", \"">
	//   97  184:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   98  187:pop             
			else
	//*  99  188:aload_1         
	//* 100  189:aload           8
	//* 101  191:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//* 102  194:pop             
	//* 103  195:iload_2         
	//* 104  196:iconst_1        
	//* 105  197:iadd            
	//* 106  198:istore_2        
	//* 107  199:goto            163
				((StringBuilder) (s)).append('"');
	//  108  202:aload_1         
	//  109  203:bipush          34
	//  110  205:invokevirtual   #223 <Method StringBuilder StringBuilder.append(char)>
	//  111  208:pop             
			((StringBuilder) (s)).append(s2);
			j++;
		}
	//* 112  209:goto            188
		((StringBuilder) (s)).append('"');
	//  113  212:aload_1         
	//  114  213:bipush          34
	//  115  215:invokevirtual   #223 <Method StringBuilder StringBuilder.append(char)>
	//  116  218:pop             
		throw new ParseException(String.format("Can not parse date \"%s\": not compatible with any of standard forms (%s)", new Object[] {
			s1, ((StringBuilder) (s)).toString()
		}), parseposition.getErrorIndex());
	//  117  219:new             #174 <Class ParseException>
	//  118  222:dup             
	//  119  223:ldc1            #225 <String "Can not parse date \"%s\": not compatible with any of standard forms (%s)">
	//  120  225:iconst_2        
	//  121  226:anewarray       Object[]
	//  122  229:dup             
	//  123  230:iconst_0        
	//  124  231:aload           5
	//  125  233:aastore         
	//  126  234:dup             
	//  127  235:iconst_1        
	//  128  236:aload_1         
	//  129  237:invokevirtual   #230 <Method String StringBuilder.toString()>
	//  130  240:aastore         
	//  131  241:invokestatic    #233 <Method String String.format(String, Object[])>
	//  132  244:aload           6
	//  133  246:invokevirtual   #236 <Method int ParsePosition.getErrorIndex()>
	//  134  249:invokespecial   #239 <Method void ParseException(String, int)>
	//  135  252:athrow          
	}

	public Date parse(String s, ParsePosition parseposition)
	{
		if(looksLikeISO8601(s))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #185 <Method boolean looksLikeISO8601(String)>
	//*   3    5:ifeq            21
		{
			try
			{
				s = ((String) (parseAsISO8601(s, parseposition, false)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #189 <Method Date parseAsISO8601(String, ParsePosition, boolean)>
	//    9   15:astore_1        
			}
	//*  10   16:aload_1         
	//*  11   17:areturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  12   18:astore_1        
			{
				return null;
	//   13   19:aconst_null     
	//   14   20:areturn         
			}
			return ((Date) (s));
		}
		int i = s.length();
	//   15   21:aload_1         
	//   16   22:invokevirtual   #133 <Method int String.length()>
	//   17   25:istore_3        
		int j;
		char c;
label0:
		do
		{
			do
			{
				j = i - 1;
	//   18   26:iload_3         
	//   19   27:iconst_1        
	//   20   28:isub            
	//   21   29:istore          4
				if(j < 0)
					break label0;
	//   22   31:iload           4
	//   23   33:iflt            76
				c = s.charAt(j);
	//   24   36:aload_1         
	//   25   37:iload           4
	//   26   39:invokevirtual   #137 <Method char String.charAt(int)>
	//   27   42:istore          5
				if(c < '0')
					break;
	//   28   44:iload           5
	//   29   46:bipush          48
	//   30   48:icmplt          61
				i = j;
	//   31   51:iload           4
	//   32   53:istore_3        
			} while(c <= '9');
	//   33   54:iload           5
	//   34   56:bipush          57
	//   35   58:icmple          26
			if(j > 0)
				break;
	//   36   61:iload           4
	//   37   63:ifgt            76
			i = j;
	//   38   66:iload           4
	//   39   68:istore_3        
		} while(c == '-');
	//   40   69:iload           5
	//   41   71:bipush          45
	//   42   73:icmpeq          26
		if(j < 0 && (s.charAt(0) == '-' || NumberInput.inLongRange(s, false)))
	//*  43   76:iload           4
	//*  44   78:ifge            111
	//*  45   81:aload_1         
	//*  46   82:iconst_0        
	//*  47   83:invokevirtual   #137 <Method char String.charAt(int)>
	//*  48   86:bipush          45
	//*  49   88:icmpeq          99
	//*  50   91:aload_1         
	//*  51   92:iconst_0        
	//*  52   93:invokestatic    #195 <Method boolean NumberInput.inLongRange(String, boolean)>
	//*  53   96:ifeq            111
			return new Date(Long.parseLong(s));
	//   54   99:new             #197 <Class Date>
	//   55  102:dup             
	//   56  103:aload_1         
	//   57  104:invokestatic    #203 <Method long Long.parseLong(String)>
	//   58  107:invokespecial   #206 <Method void Date(long)>
	//   59  110:areturn         
		else
			return parseAsRFC1123(s, parseposition);
	//   60  111:aload_0         
	//   61  112:aload_1         
	//   62  113:aload_2         
	//   63  114:invokevirtual   #210 <Method Date parseAsRFC1123(String, ParsePosition)>
	//   64  117:areturn         
	}

	protected Date parseAsISO8601(String s, ParsePosition parseposition, boolean flag)
		throws ParseException
	{
		int i;
		Object obj;
		String s1;
		String s2;
		i = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #133 <Method int String.length()>
	//    2    4:istore          5
		char c = s.charAt(i - 1);
	//    3    6:aload_1         
	//    4    7:iload           5
	//    5    9:iconst_1        
	//    6   10:isub            
	//    7   11:invokevirtual   #137 <Method char String.charAt(int)>
	//    8   14:istore          4
		if(i <= 10 && Character.isDigit(c))
	//*   9   16:iload           5
	//*  10   18:bipush          10
	//*  11   20:icmpgt          143
	//*  12   23:iload           4
	//*  13   25:invokestatic    #170 <Method boolean Character.isDigit(char)>
	//*  14   28:ifeq            143
		{
			DateFormat dateformat1 = _formatPlain;
	//   15   31:aload_0         
	//   16   32:getfield        #146 <Field DateFormat _formatPlain>
	//   17   35:astore          11
			String s3 = "yyyy-MM-dd";
	//   18   37:ldc1            #21  <String "yyyy-MM-dd">
	//   19   39:astore          10
			obj = ((Object) (dateformat1));
	//   20   41:aload           11
	//   21   43:astore          7
			s1 = s3;
	//   22   45:aload           10
	//   23   47:astore          8
			s2 = s;
	//   24   49:aload_1         
	//   25   50:astore          9
			if(dateformat1 == null)
	//*  26   52:aload           11
	//*  27   54:ifnonnull       92
			{
				obj = ((Object) (_cloneFormat(DATE_FORMAT_PLAIN, "yyyy-MM-dd", _timezone, _locale, _lenient)));
	//   28   57:getstatic       #79  <Field DateFormat DATE_FORMAT_PLAIN>
	//   29   60:ldc1            #21  <String "yyyy-MM-dd">
	//   30   62:aload_0         
	//   31   63:getfield        #91  <Field TimeZone _timezone>
	//   32   66:aload_0         
	//   33   67:getfield        #87  <Field Locale _locale>
	//   34   70:aload_0         
	//   35   71:getfield        #95  <Field Boolean _lenient>
	//   36   74:invokestatic    #124 <Method DateFormat _cloneFormat(DateFormat, String, TimeZone, Locale, Boolean)>
	//   37   77:astore          7
				_formatPlain = ((DateFormat) (obj));
	//   38   79:aload_0         
	//   39   80:aload           7
	//   40   82:putfield        #146 <Field DateFormat _formatPlain>
				s2 = s;
	//   41   85:aload_1         
	//   42   86:astore          9
				s1 = s3;
	//   43   88:aload           10
	//   44   90:astore          8
			}
		} else
	//*  45   92:aload           7
	//*  46   94:aload           9
	//*  47   96:aload_2         
	//*  48   97:invokevirtual   #242 <Method Date DateFormat.parse(String, ParsePosition)>
	//*  49  100:astore_1        
	//*  50  101:aload_1         
	//*  51  102:ifnonnull       757
	//*  52  105:new             #174 <Class ParseException>
	//*  53  108:dup             
	//*  54  109:ldc1            #244 <String "Can not parse date \"%s\": while it seems to fit format '%s', parsing fails (leniency? %s)">
	//*  55  111:iconst_3        
	//*  56  112:anewarray       Object[]
	//*  57  115:dup             
	//*  58  116:iconst_0        
	//*  59  117:aload           9
	//*  60  119:aastore         
	//*  61  120:dup             
	//*  62  121:iconst_1        
	//*  63  122:aload           8
	//*  64  124:aastore         
	//*  65  125:dup             
	//*  66  126:iconst_2        
	//*  67  127:aload_0         
	//*  68  128:getfield        #95  <Field Boolean _lenient>
	//*  69  131:aastore         
	//*  70  132:invokestatic    #233 <Method String String.format(String, Object[])>
	//*  71  135:aload_2         
	//*  72  136:invokevirtual   #236 <Method int ParsePosition.getErrorIndex()>
	//*  73  139:invokespecial   #239 <Method void ParseException(String, int)>
	//*  74  142:athrow          
		{
label0:
			{
				if(c != 'Z')
					break label0;
	//   75  143:iload           4
	//   76  145:bipush          90
	//   77  147:icmpne          258
				obj = ((Object) (_formatISO8601_z));
	//   78  150:aload_0         
	//   79  151:getfield        #144 <Field DateFormat _formatISO8601_z>
	//   80  154:astore          7
				String s5 = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
	//   81  156:ldc1            #18  <String "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'">
	//   82  158:astore          11
				DateFormat dateformat = ((DateFormat) (obj));
	//   83  160:aload           7
	//   84  162:astore          10
				if(obj == null)
	//*  85  164:aload           7
	//*  86  166:ifnonnull       197
				{
					dateformat = _cloneFormat(DATE_FORMAT_ISO8601_Z, "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", _timezone, _locale, _lenient);
	//   87  169:getstatic       #77  <Field DateFormat DATE_FORMAT_ISO8601_Z>
	//   88  172:ldc1            #18  <String "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'">
	//   89  174:aload_0         
	//   90  175:getfield        #91  <Field TimeZone _timezone>
	//   91  178:aload_0         
	//   92  179:getfield        #87  <Field Locale _locale>
	//   93  182:aload_0         
	//   94  183:getfield        #95  <Field Boolean _lenient>
	//   95  186:invokestatic    #124 <Method DateFormat _cloneFormat(DateFormat, String, TimeZone, Locale, Boolean)>
	//   96  189:astore          10
					_formatISO8601_z = dateformat;
	//   97  191:aload_0         
	//   98  192:aload           10
	//   99  194:putfield        #144 <Field DateFormat _formatISO8601_z>
				}
				obj = ((Object) (dateformat));
	//  100  197:aload           10
	//  101  199:astore          7
				s1 = s5;
	//  102  201:aload           11
	//  103  203:astore          8
				s2 = s;
	//  104  205:aload_1         
	//  105  206:astore          9
				if(s.charAt(i - 4) == ':')
	//* 106  208:aload_1         
	//* 107  209:iload           5
	//* 108  211:iconst_4        
	//* 109  212:isub            
	//* 110  213:invokevirtual   #137 <Method char String.charAt(int)>
	//* 111  216:bipush          58
	//* 112  218:icmpne          92
				{
					s = ((String) (new StringBuilder(s)));
	//  113  221:new             #212 <Class StringBuilder>
	//  114  224:dup             
	//  115  225:aload_1         
	//  116  226:invokespecial   #247 <Method void StringBuilder(String)>
	//  117  229:astore_1        
					((StringBuilder) (s)).insert(i - 1, ".000");
	//  118  230:aload_1         
	//  119  231:iload           5
	//  120  233:iconst_1        
	//  121  234:isub            
	//  122  235:ldc1            #249 <String ".000">
	//  123  237:invokevirtual   #253 <Method StringBuilder StringBuilder.insert(int, String)>
	//  124  240:pop             
					s2 = ((StringBuilder) (s)).toString();
	//  125  241:aload_1         
	//  126  242:invokevirtual   #230 <Method String StringBuilder.toString()>
	//  127  245:astore          9
					obj = ((Object) (dateformat));
	//  128  247:aload           10
	//  129  249:astore          7
					s1 = s5;
	//  130  251:aload           11
	//  131  253:astore          8
				}
			}
		}
_L12:
		s = ((String) (((DateFormat) (obj)).parse(s2, parseposition)));
		int j;
		String s4;
		DateFormat dateformat2;
		if(s == null)
			throw new ParseException(String.format("Can not parse date \"%s\": while it seems to fit format '%s', parsing fails (leniency? %s)", new Object[] {
				s2, s1, _lenient
			}), parseposition.getErrorIndex());
		else
	//* 132  255:goto            92
	//* 133  258:aload_1         
	//* 134  259:invokestatic    #255 <Method boolean hasTimeZone(String)>
	//* 135  262:ifeq            586
	//* 136  265:aload_1         
	//* 137  266:iload           5
	//* 138  268:iconst_3        
	//* 139  269:isub            
	//* 140  270:invokevirtual   #137 <Method char String.charAt(int)>
	//* 141  273:istore          6
	//* 142  275:iload           6
	//* 143  277:bipush          58
	//* 144  279:icmpne          471
	//* 145  282:new             #212 <Class StringBuilder>
	//* 146  285:dup             
	//* 147  286:aload_1         
	//* 148  287:invokespecial   #247 <Method void StringBuilder(String)>
	//* 149  290:astore_1        
	//* 150  291:aload_1         
	//* 151  292:iload           5
	//* 152  294:iconst_3        
	//* 153  295:isub            
	//* 154  296:iload           5
	//* 155  298:iconst_2        
	//* 156  299:isub            
	//* 157  300:invokevirtual   #259 <Method StringBuilder StringBuilder.delete(int, int)>
	//* 158  303:pop             
	//* 159  304:aload_1         
	//* 160  305:invokevirtual   #230 <Method String StringBuilder.toString()>
	//* 161  308:astore          7
	//* 162  310:aload           7
	//* 163  312:invokevirtual   #133 <Method int String.length()>
	//* 164  315:istore          6
	//* 165  317:iload           6
	//* 166  319:aload           7
	//* 167  321:bipush          84
	//* 168  323:invokevirtual   #263 <Method int String.lastIndexOf(int)>
	//* 169  326:isub            
	//* 170  327:bipush          6
	//* 171  329:isub            
	//* 172  330:istore          5
	//* 173  332:aload           7
	//* 174  334:astore_1        
	//* 175  335:iload           5
	//* 176  337:bipush          12
	//* 177  339:icmpge          409
	//* 178  342:iload           6
	//* 179  344:iconst_5        
	//* 180  345:isub            
	//* 181  346:istore          6
	//* 182  348:new             #212 <Class StringBuilder>
	//* 183  351:dup             
	//* 184  352:aload           7
	//* 185  354:invokespecial   #247 <Method void StringBuilder(String)>
	//* 186  357:astore_1        
	//* 187  358:iload           5
	//* 188  360:tableswitch     5 11: default 404
	//	               5 573
	//	               6 563
	//	               7 404
	//	               8 551
	//	               9 538
	//	               10 525
	//	               11 513
	//* 189  404:aload_1         
	//* 190  405:invokevirtual   #230 <Method String StringBuilder.toString()>
	//* 191  408:astore_1        
	//* 192  409:aload_0         
	//* 193  410:getfield        #142 <Field DateFormat _formatISO8601>
	//* 194  413:astore          7
	//* 195  415:ldc1            #15  <String "yyyy-MM-dd'T'HH:mm:ss.SSSZ">
	//* 196  417:astore          10
	//* 197  419:aload           10
	//* 198  421:astore          8
	//* 199  423:aload_1         
	//* 200  424:astore          9
	//* 201  426:aload_0         
	//* 202  427:getfield        #142 <Field DateFormat _formatISO8601>
	//* 203  430:ifnonnull       92
	//* 204  433:getstatic       #75  <Field DateFormat DATE_FORMAT_ISO8601>
	//* 205  436:ldc1            #15  <String "yyyy-MM-dd'T'HH:mm:ss.SSSZ">
	//* 206  438:aload_0         
	//* 207  439:getfield        #91  <Field TimeZone _timezone>
	//* 208  442:aload_0         
	//* 209  443:getfield        #87  <Field Locale _locale>
	//* 210  446:aload_0         
	//* 211  447:getfield        #95  <Field Boolean _lenient>
	//* 212  450:invokestatic    #124 <Method DateFormat _cloneFormat(DateFormat, String, TimeZone, Locale, Boolean)>
	//* 213  453:astore          7
	//* 214  455:aload_0         
	//* 215  456:aload           7
	//* 216  458:putfield        #142 <Field DateFormat _formatISO8601>
	//* 217  461:aload           10
	//* 218  463:astore          8
	//* 219  465:aload_1         
	//* 220  466:astore          9
	//* 221  468:goto            92
	//* 222  471:iload           6
	//* 223  473:bipush          43
	//* 224  475:icmpeq          488
	//* 225  478:aload_1         
	//* 226  479:astore          7
	//* 227  481:iload           6
	//* 228  483:bipush          45
	//* 229  485:icmpne          310
	//* 230  488:new             #212 <Class StringBuilder>
	//* 231  491:dup             
	//* 232  492:invokespecial   #213 <Method void StringBuilder()>
	//* 233  495:aload_1         
	//* 234  496:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//* 235  499:ldc2            #265 <String "00">
	//* 236  502:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//* 237  505:invokevirtual   #230 <Method String StringBuilder.toString()>
	//* 238  508:astore          7
	//* 239  510:goto            310
	//* 240  513:aload_1         
	//* 241  514:iload           6
	//* 242  516:bipush          48
	//* 243  518:invokevirtual   #268 <Method StringBuilder StringBuilder.insert(int, char)>
	//* 244  521:pop             
	//* 245  522:goto            404
	//* 246  525:aload_1         
	//* 247  526:iload           6
	//* 248  528:ldc2            #265 <String "00">
	//* 249  531:invokevirtual   #253 <Method StringBuilder StringBuilder.insert(int, String)>
	//* 250  534:pop             
	//* 251  535:goto            404
	//* 252  538:aload_1         
	//* 253  539:iload           6
	//* 254  541:ldc2            #270 <String "000">
	//* 255  544:invokevirtual   #253 <Method StringBuilder StringBuilder.insert(int, String)>
	//* 256  547:pop             
	//* 257  548:goto            404
	//* 258  551:aload_1         
	//* 259  552:iload           6
	//* 260  554:ldc1            #249 <String ".000">
	//* 261  556:invokevirtual   #253 <Method StringBuilder StringBuilder.insert(int, String)>
	//* 262  559:pop             
	//* 263  560:goto            404
	//* 264  563:aload_1         
	//* 265  564:iload           6
	//* 266  566:ldc2            #272 <String "00.000">
	//* 267  569:invokevirtual   #253 <Method StringBuilder StringBuilder.insert(int, String)>
	//* 268  572:pop             
	//* 269  573:aload_1         
	//* 270  574:iload           6
	//* 271  576:ldc2            #274 <String ":00.000">
	//* 272  579:invokevirtual   #253 <Method StringBuilder StringBuilder.insert(int, String)>
	//* 273  582:pop             
	//* 274  583:goto            404
	//* 275  586:new             #212 <Class StringBuilder>
	//* 276  589:dup             
	//* 277  590:aload_1         
	//* 278  591:invokespecial   #247 <Method void StringBuilder(String)>
	//* 279  594:astore          7
	//* 280  596:iload           5
	//* 281  598:aload_1         
	//* 282  599:bipush          84
	//* 283  601:invokevirtual   #263 <Method int String.lastIndexOf(int)>
	//* 284  604:isub            
	//* 285  605:iconst_1        
	//* 286  606:isub            
	//* 287  607:istore          5
	//* 288  609:iload           5
	//* 289  611:bipush          12
	//* 290  613:icmpge          652
	//* 291  616:iload           5
	//* 292  618:tableswitch     9 11: default 644
	//	               9 746
	//	               10 738
	//	               11 730
	//* 293  644:aload           7
	//* 294  646:ldc1            #249 <String ".000">
	//* 295  648:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//* 296  651:pop             
	//* 297  652:aload           7
	//* 298  654:bipush          90
	//* 299  656:invokevirtual   #223 <Method StringBuilder StringBuilder.append(char)>
	//* 300  659:pop             
	//* 301  660:aload           7
	//* 302  662:invokevirtual   #230 <Method String StringBuilder.toString()>
	//* 303  665:astore_1        
	//* 304  666:aload_0         
	//* 305  667:getfield        #144 <Field DateFormat _formatISO8601_z>
	//* 306  670:astore          11
	//* 307  672:ldc1            #18  <String "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'">
	//* 308  674:astore          10
	//* 309  676:aload           11
	//* 310  678:astore          7
	//* 311  680:aload           10
	//* 312  682:astore          8
	//* 313  684:aload_1         
	//* 314  685:astore          9
	//* 315  687:aload           11
	//* 316  689:ifnonnull       92
	//* 317  692:getstatic       #77  <Field DateFormat DATE_FORMAT_ISO8601_Z>
	//* 318  695:ldc1            #18  <String "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'">
	//* 319  697:aload_0         
	//* 320  698:getfield        #91  <Field TimeZone _timezone>
	//* 321  701:aload_0         
	//* 322  702:getfield        #87  <Field Locale _locale>
	//* 323  705:aload_0         
	//* 324  706:getfield        #95  <Field Boolean _lenient>
	//* 325  709:invokestatic    #124 <Method DateFormat _cloneFormat(DateFormat, String, TimeZone, Locale, Boolean)>
	//* 326  712:astore          7
	//* 327  714:aload_0         
	//* 328  715:aload           7
	//* 329  717:putfield        #144 <Field DateFormat _formatISO8601_z>
	//* 330  720:aload           10
	//* 331  722:astore          8
	//* 332  724:aload_1         
	//* 333  725:astore          9
	//* 334  727:goto            92
	//* 335  730:aload           7
	//* 336  732:bipush          48
	//* 337  734:invokevirtual   #223 <Method StringBuilder StringBuilder.append(char)>
	//* 338  737:pop             
	//* 339  738:aload           7
	//* 340  740:bipush          48
	//* 341  742:invokevirtual   #223 <Method StringBuilder StringBuilder.append(char)>
	//* 342  745:pop             
	//* 343  746:aload           7
	//* 344  748:bipush          48
	//* 345  750:invokevirtual   #223 <Method StringBuilder StringBuilder.append(char)>
	//* 346  753:pop             
	//* 347  754:goto            652
			return ((Date) (s));
	//  348  757:aload_1         
	//  349  758:areturn         
		if(!hasTimeZone(s))
			break MISSING_BLOCK_LABEL_586;
		j = ((int) (s.charAt(i - 3)));
		if(j != 58) goto _L2; else goto _L1
_L1:
		s = ((String) (new StringBuilder(s)));
		((StringBuilder) (s)).delete(i - 3, i - 2);
		obj = ((Object) (((StringBuilder) (s)).toString()));
_L15:
		j = ((String) (obj)).length();
		i = j - ((String) (obj)).lastIndexOf('T') - 6;
		s = ((String) (obj));
		if(i >= 12) goto _L4; else goto _L3
_L3:
		j -= 5;
		s = ((String) (new StringBuilder(((String) (obj)))));
		i;
		JVM INSTR tableswitch 5 11: default 404
	//	               5 573
	//	               6 563
	//	               7 404
	//	               8 551
	//	               9 538
	//	               10 525
	//	               11 513;
		   goto _L5 _L6 _L7 _L5 _L8 _L9 _L10 _L11
_L5:
		break; /* Loop/switch isn't completed */
_L6:
		break MISSING_BLOCK_LABEL_573;
_L16:
		s = ((StringBuilder) (s)).toString();
_L4:
		obj = ((Object) (_formatISO8601));
		s4 = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
		s1 = s4;
		s2 = s;
		if(_formatISO8601 == null)
		{
			obj = ((Object) (_cloneFormat(DATE_FORMAT_ISO8601, "yyyy-MM-dd'T'HH:mm:ss.SSSZ", _timezone, _locale, _lenient)));
			_formatISO8601 = ((DateFormat) (obj));
			s1 = s4;
			s2 = s;
		}
		  goto _L12
_L2:
		if(j == 43) goto _L14; else goto _L13
_L13:
		obj = ((Object) (s));
		if(j != 45) goto _L15; else goto _L14
_L14:
		obj = ((Object) ((new StringBuilder()).append(s).append("00").toString()));
		  goto _L15
_L11:
		((StringBuilder) (s)).insert(j, '0');
		  goto _L16
_L10:
		((StringBuilder) (s)).insert(j, "00");
		  goto _L16
_L9:
		((StringBuilder) (s)).insert(j, "000");
		  goto _L16
_L8:
		((StringBuilder) (s)).insert(j, ".000");
		  goto _L16
_L7:
		((StringBuilder) (s)).insert(j, "00.000");
		((StringBuilder) (s)).insert(j, ":00.000");
		  goto _L16
		obj = ((Object) (new StringBuilder(s)));
		i = i - s.lastIndexOf('T') - 1;
		if(i >= 12) goto _L18; else goto _L17
_L17:
		i;
		JVM INSTR tableswitch 9 11: default 644
	//	               9 746
	//	               10 738
	//	               11 730;
		   goto _L19 _L20 _L21 _L22
_L20:
		break MISSING_BLOCK_LABEL_746;
_L19:
		((StringBuilder) (obj)).append(".000");
_L18:
		((StringBuilder) (obj)).append('Z');
		s = ((StringBuilder) (obj)).toString();
		dateformat2 = _formatISO8601_z;
		s4 = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
		obj = ((Object) (dateformat2));
		s1 = s4;
		s2 = s;
		if(dateformat2 == null)
		{
			obj = ((Object) (_cloneFormat(DATE_FORMAT_ISO8601_Z, "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", _timezone, _locale, _lenient)));
			_formatISO8601_z = ((DateFormat) (obj));
			s1 = s4;
			s2 = s;
		}
		  goto _L12
_L22:
		((StringBuilder) (obj)).append('0');
_L21:
		((StringBuilder) (obj)).append('0');
		((StringBuilder) (obj)).append('0');
		  goto _L18
	}

	protected Date parseAsRFC1123(String s, ParsePosition parseposition)
	{
		if(_formatRFC1123 == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #140 <Field DateFormat _formatRFC1123>
	//*   2    4:ifnonnull       31
			_formatRFC1123 = _cloneFormat(DATE_FORMAT_RFC1123, "EEE, dd MMM yyyy HH:mm:ss zzz", _timezone, _locale, _lenient);
	//    3    7:aload_0         
	//    4    8:getstatic       #69  <Field DateFormat DATE_FORMAT_RFC1123>
	//    5   11:ldc1            #24  <String "EEE, dd MMM yyyy HH:mm:ss zzz">
	//    6   13:aload_0         
	//    7   14:getfield        #91  <Field TimeZone _timezone>
	//    8   17:aload_0         
	//    9   18:getfield        #87  <Field Locale _locale>
	//   10   21:aload_0         
	//   11   22:getfield        #95  <Field Boolean _lenient>
	//   12   25:invokestatic    #124 <Method DateFormat _cloneFormat(DateFormat, String, TimeZone, Locale, Boolean)>
	//   13   28:putfield        #140 <Field DateFormat _formatRFC1123>
		return _formatRFC1123.parse(s, parseposition);
	//   14   31:aload_0         
	//   15   32:getfield        #140 <Field DateFormat _formatRFC1123>
	//   16   35:aload_1         
	//   17   36:aload_2         
	//   18   37:invokevirtual   #242 <Method Date DateFormat.parse(String, ParsePosition)>
	//   19   40:areturn         
	}

	public void setLenient(boolean flag)
	{
		Boolean boolean1 = Boolean.valueOf(flag);
	//    0    0:iload_1         
	//    1    1:invokestatic    #278 <Method Boolean Boolean.valueOf(boolean)>
	//    2    4:astore_2        
		if(_lenient != boolean1)
	//*   3    5:aload_0         
	//*   4    6:getfield        #95  <Field Boolean _lenient>
	//*   5    9:aload_2         
	//*   6   10:if_acmpeq       22
		{
			_lenient = boolean1;
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:putfield        #95  <Field Boolean _lenient>
			_clearFormats();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #280 <Method void _clearFormats()>
		}
	//   12   22:return          
	}

	public void setTimeZone(TimeZone timezone)
	{
		if(!((Object) (timezone)).equals(((Object) (_timezone))))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #91  <Field TimeZone _timezone>
	//*   3    5:invokevirtual   #281 <Method boolean Object.equals(Object)>
	//*   4    8:ifne            20
		{
			_clearFormats();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #280 <Method void _clearFormats()>
			_timezone = timezone;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #91  <Field TimeZone _timezone>
		}
	//   10   20:return          
	}

	public String toString()
	{
		String s1 = (new StringBuilder()).append("DateFormat ").append(((Object)this).getClass().getName()).toString();
	//    0    0:new             #212 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #213 <Method void StringBuilder()>
	//    3    7:ldc2            #283 <String "DateFormat ">
	//    4   10:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//    5   13:aload_0         
	//    6   14:invokevirtual   #287 <Method Class Object.getClass()>
	//    7   17:invokevirtual   #292 <Method String Class.getName()>
	//    8   20:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//    9   23:invokevirtual   #230 <Method String StringBuilder.toString()>
	//   10   26:astore_2        
		TimeZone timezone = _timezone;
	//   11   27:aload_0         
	//   12   28:getfield        #91  <Field TimeZone _timezone>
	//   13   31:astore_3        
		String s = s1;
	//   14   32:aload_2         
	//   15   33:astore_1        
		if(timezone != null)
	//*  16   34:aload_3         
	//*  17   35:ifnull          69
			s = (new StringBuilder()).append(s1).append(" (timezone: ").append(((Object) (timezone))).append(")").toString();
	//   18   38:new             #212 <Class StringBuilder>
	//   19   41:dup             
	//   20   42:invokespecial   #213 <Method void StringBuilder()>
	//   21   45:aload_2         
	//   22   46:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   23   49:ldc2            #294 <String " (timezone: ">
	//   24   52:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   25   55:aload_3         
	//   26   56:invokevirtual   #297 <Method StringBuilder StringBuilder.append(Object)>
	//   27   59:ldc2            #299 <String ")">
	//   28   62:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   29   65:invokevirtual   #230 <Method String StringBuilder.toString()>
	//   30   68:astore_1        
		return (new StringBuilder()).append(s).append("(locale: ").append(((Object) (_locale))).append(")").toString();
	//   31   69:new             #212 <Class StringBuilder>
	//   32   72:dup             
	//   33   73:invokespecial   #213 <Method void StringBuilder()>
	//   34   76:aload_1         
	//   35   77:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   36   80:ldc2            #301 <String "(locale: ">
	//   37   83:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   38   86:aload_0         
	//   39   87:getfield        #87  <Field Locale _locale>
	//   40   90:invokevirtual   #297 <Method StringBuilder StringBuilder.append(Object)>
	//   41   93:ldc2            #299 <String ")">
	//   42   96:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   43   99:invokevirtual   #230 <Method String StringBuilder.toString()>
	//   44  102:areturn         
	}

	public StdDateFormat withLocale(Locale locale)
	{
		if(locale.equals(((Object) (_locale))))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #87  <Field Locale _locale>
	//*   3    5:invokevirtual   #101 <Method boolean Locale.equals(Object)>
	//*   4    8:ifeq            13
			return this;
	//    5   11:aload_0         
	//    6   12:areturn         
		else
			return new StdDateFormat(_timezone, locale, _lenient);
	//    7   13:new             #2   <Class StdDateFormat>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #91  <Field TimeZone _timezone>
	//   11   21:aload_1         
	//   12   22:aload_0         
	//   13   23:getfield        #95  <Field Boolean _lenient>
	//   14   26:invokespecial   #149 <Method void StdDateFormat(TimeZone, Locale, Boolean)>
	//   15   29:areturn         
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
	//    4    6:getstatic       #54  <Field TimeZone DEFAULT_TIMEZONE>
	//    5    9:astore_2        
		if(timezone1 == _timezone || ((Object) (timezone1)).equals(((Object) (_timezone))))
	//*   6   10:aload_2         
	//*   7   11:aload_0         
	//*   8   12:getfield        #91  <Field TimeZone _timezone>
	//*   9   15:if_acmpeq       29
	//*  10   18:aload_2         
	//*  11   19:aload_0         
	//*  12   20:getfield        #91  <Field TimeZone _timezone>
	//*  13   23:invokevirtual   #281 <Method boolean Object.equals(Object)>
	//*  14   26:ifeq            31
			return this;
	//   15   29:aload_0         
	//   16   30:areturn         
		else
			return new StdDateFormat(timezone1, _locale, _lenient);
	//   17   31:new             #2   <Class StdDateFormat>
	//   18   34:dup             
	//   19   35:aload_2         
	//   20   36:aload_0         
	//   21   37:getfield        #87  <Field Locale _locale>
	//   22   40:aload_0         
	//   23   41:getfield        #95  <Field Boolean _lenient>
	//   24   44:invokespecial   #149 <Method void StdDateFormat(TimeZone, Locale, Boolean)>
	//   25   47:areturn         
	}

	protected static final String ALL_FORMATS[] = {
		"yyyy-MM-dd'T'HH:mm:ss.SSSZ", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd"
	};
	protected static final DateFormat DATE_FORMAT_ISO8601;
	protected static final DateFormat DATE_FORMAT_ISO8601_Z;
	protected static final DateFormat DATE_FORMAT_PLAIN;
	protected static final DateFormat DATE_FORMAT_RFC1123;
	public static final String DATE_FORMAT_STR_ISO8601 = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
	protected static final String DATE_FORMAT_STR_ISO8601_Z = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
	protected static final String DATE_FORMAT_STR_PLAIN = "yyyy-MM-dd";
	protected static final String DATE_FORMAT_STR_RFC1123 = "EEE, dd MMM yyyy HH:mm:ss zzz";
	private static final Locale DEFAULT_LOCALE;
	private static final TimeZone DEFAULT_TIMEZONE;
	public static final StdDateFormat instance = new StdDateFormat();
	protected transient DateFormat _formatISO8601;
	protected transient DateFormat _formatISO8601_z;
	protected transient DateFormat _formatPlain;
	protected transient DateFormat _formatRFC1123;
	protected Boolean _lenient;
	protected final Locale _locale;
	protected transient TimeZone _timezone;

	static 
	{
	//    0    0:iconst_4        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #15  <String "yyyy-MM-dd'T'HH:mm:ss.SSSZ">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #18  <String "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'">
	//    9   13:aastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #24  <String "EEE, dd MMM yyyy HH:mm:ss zzz">
	//   13   18:aastore         
	//   14   19:dup             
	//   15   20:iconst_3        
	//   16   21:ldc1            #21  <String "yyyy-MM-dd">
	//   17   23:aastore         
	//   18   24:putstatic       #44  <Field String[] ALL_FORMATS>
		DEFAULT_TIMEZONE = TimeZone.getTimeZone("UTC");
	//   19   27:ldc1            #46  <String "UTC">
	//   20   29:invokestatic    #52  <Method TimeZone TimeZone.getTimeZone(String)>
	//   21   32:putstatic       #54  <Field TimeZone DEFAULT_TIMEZONE>
		DEFAULT_LOCALE = Locale.US;
	//   22   35:getstatic       #59  <Field Locale Locale.US>
	//   23   38:putstatic       #61  <Field Locale DEFAULT_LOCALE>
		DATE_FORMAT_RFC1123 = ((DateFormat) (new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", DEFAULT_LOCALE)));
	//   24   41:new             #63  <Class SimpleDateFormat>
	//   25   44:dup             
	//   26   45:ldc1            #24  <String "EEE, dd MMM yyyy HH:mm:ss zzz">
	//   27   47:getstatic       #61  <Field Locale DEFAULT_LOCALE>
	//   28   50:invokespecial   #67  <Method void SimpleDateFormat(String, Locale)>
	//   29   53:putstatic       #69  <Field DateFormat DATE_FORMAT_RFC1123>
		DATE_FORMAT_RFC1123.setTimeZone(DEFAULT_TIMEZONE);
	//   30   56:getstatic       #69  <Field DateFormat DATE_FORMAT_RFC1123>
	//   31   59:getstatic       #54  <Field TimeZone DEFAULT_TIMEZONE>
	//   32   62:invokevirtual   #73  <Method void DateFormat.setTimeZone(TimeZone)>
		DATE_FORMAT_ISO8601 = ((DateFormat) (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", DEFAULT_LOCALE)));
	//   33   65:new             #63  <Class SimpleDateFormat>
	//   34   68:dup             
	//   35   69:ldc1            #15  <String "yyyy-MM-dd'T'HH:mm:ss.SSSZ">
	//   36   71:getstatic       #61  <Field Locale DEFAULT_LOCALE>
	//   37   74:invokespecial   #67  <Method void SimpleDateFormat(String, Locale)>
	//   38   77:putstatic       #75  <Field DateFormat DATE_FORMAT_ISO8601>
		DATE_FORMAT_ISO8601.setTimeZone(DEFAULT_TIMEZONE);
	//   39   80:getstatic       #75  <Field DateFormat DATE_FORMAT_ISO8601>
	//   40   83:getstatic       #54  <Field TimeZone DEFAULT_TIMEZONE>
	//   41   86:invokevirtual   #73  <Method void DateFormat.setTimeZone(TimeZone)>
		DATE_FORMAT_ISO8601_Z = ((DateFormat) (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", DEFAULT_LOCALE)));
	//   42   89:new             #63  <Class SimpleDateFormat>
	//   43   92:dup             
	//   44   93:ldc1            #18  <String "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'">
	//   45   95:getstatic       #61  <Field Locale DEFAULT_LOCALE>
	//   46   98:invokespecial   #67  <Method void SimpleDateFormat(String, Locale)>
	//   47  101:putstatic       #77  <Field DateFormat DATE_FORMAT_ISO8601_Z>
		DATE_FORMAT_ISO8601_Z.setTimeZone(DEFAULT_TIMEZONE);
	//   48  104:getstatic       #77  <Field DateFormat DATE_FORMAT_ISO8601_Z>
	//   49  107:getstatic       #54  <Field TimeZone DEFAULT_TIMEZONE>
	//   50  110:invokevirtual   #73  <Method void DateFormat.setTimeZone(TimeZone)>
		DATE_FORMAT_PLAIN = ((DateFormat) (new SimpleDateFormat("yyyy-MM-dd", DEFAULT_LOCALE)));
	//   51  113:new             #63  <Class SimpleDateFormat>
	//   52  116:dup             
	//   53  117:ldc1            #21  <String "yyyy-MM-dd">
	//   54  119:getstatic       #61  <Field Locale DEFAULT_LOCALE>
	//   55  122:invokespecial   #67  <Method void SimpleDateFormat(String, Locale)>
	//   56  125:putstatic       #79  <Field DateFormat DATE_FORMAT_PLAIN>
		DATE_FORMAT_PLAIN.setTimeZone(DEFAULT_TIMEZONE);
	//   57  128:getstatic       #79  <Field DateFormat DATE_FORMAT_PLAIN>
	//   58  131:getstatic       #54  <Field TimeZone DEFAULT_TIMEZONE>
	//   59  134:invokevirtual   #73  <Method void DateFormat.setTimeZone(TimeZone)>
	//   60  137:new             #2   <Class StdDateFormat>
	//   61  140:dup             
	//   62  141:invokespecial   #81  <Method void StdDateFormat()>
	//   63  144:putstatic       #83  <Field StdDateFormat instance>
	//*  64  147:return          
	}
}
