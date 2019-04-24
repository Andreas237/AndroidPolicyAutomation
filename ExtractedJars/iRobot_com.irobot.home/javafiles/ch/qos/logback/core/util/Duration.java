// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Duration
{

	public Duration(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Object()>
		millis = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #51  <Field long millis>
	//    5    9:return          
	}

	public static Duration buildByDays(double d)
	{
		return new Duration((long)(d * 86400000D));
	//    0    0:new             #2   <Class Duration>
	//    1    3:dup             
	//    2    4:dload_0         
	//    3    5:ldc2w           #54  <Double 86400000D>
	//    4    8:dmul            
	//    5    9:d2l             
	//    6   10:invokespecial   #57  <Method void Duration(long)>
	//    7   13:areturn         
	}

	public static Duration buildByHours(double d)
	{
		return new Duration((long)(d * 3600000D));
	//    0    0:new             #2   <Class Duration>
	//    1    3:dup             
	//    2    4:dload_0         
	//    3    5:ldc2w           #59  <Double 3600000D>
	//    4    8:dmul            
	//    5    9:d2l             
	//    6   10:invokespecial   #57  <Method void Duration(long)>
	//    7   13:areturn         
	}

	public static Duration buildByMilliseconds(double d)
	{
		return new Duration((long)d);
	//    0    0:new             #2   <Class Duration>
	//    1    3:dup             
	//    2    4:dload_0         
	//    3    5:d2l             
	//    4    6:invokespecial   #57  <Method void Duration(long)>
	//    5    9:areturn         
	}

	public static Duration buildByMinutes(double d)
	{
		return new Duration((long)(d * 60000D));
	//    0    0:new             #2   <Class Duration>
	//    1    3:dup             
	//    2    4:dload_0         
	//    3    5:ldc2w           #63  <Double 60000D>
	//    4    8:dmul            
	//    5    9:d2l             
	//    6   10:invokespecial   #57  <Method void Duration(long)>
	//    7   13:areturn         
	}

	public static Duration buildBySeconds(double d)
	{
		return new Duration((long)(d * 1000D));
	//    0    0:new             #2   <Class Duration>
	//    1    3:dup             
	//    2    4:dload_0         
	//    3    5:ldc2w           #66  <Double 1000D>
	//    4    8:dmul            
	//    5    9:d2l             
	//    6   10:invokespecial   #57  <Method void Duration(long)>
	//    7   13:areturn         
	}

	public static Duration buildUnbounded()
	{
		return new Duration(0xffffffffL);
	//    0    0:new             #2   <Class Duration>
	//    1    3:dup             
	//    2    4:ldc2w           #70  <Long 0xffffffffL>
	//    3    7:invokespecial   #57  <Method void Duration(long)>
	//    4   10:areturn         
	}

	public static Duration valueOf(String s)
	{
		Object obj = ((Object) (DURATION_PATTERN.matcher(((CharSequence) (s)))));
	//    0    0:getstatic       #44  <Field Pattern DURATION_PATTERN>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #77  <Method Matcher Pattern.matcher(CharSequence)>
	//    3    7:astore_3        
		if(((Matcher) (obj)).matches())
	//*   4    8:aload_3         
	//*   5    9:invokevirtual   #83  <Method boolean Matcher.matches()>
	//*   6   12:ifeq            169
		{
			s = ((Matcher) (obj)).group(1);
	//    7   15:aload_3         
	//    8   16:iconst_1        
	//    9   17:invokevirtual   #87  <Method String Matcher.group(int)>
	//   10   20:astore_0        
			obj = ((Object) (((Matcher) (obj)).group(3)));
	//   11   21:aload_3         
	//   12   22:iconst_3        
	//   13   23:invokevirtual   #87  <Method String Matcher.group(int)>
	//   14   26:astore_3        
			double d = Double.valueOf(s).doubleValue();
	//   15   27:aload_0         
	//   16   28:invokestatic    #92  <Method Double Double.valueOf(String)>
	//   17   31:invokevirtual   #96  <Method double Double.doubleValue()>
	//   18   34:dstore_1        
			if(!((String) (obj)).equalsIgnoreCase("milli") && !((String) (obj)).equalsIgnoreCase("millisecond") && ((String) (obj)).length() != 0)
	//*  19   35:aload_3         
	//*  20   36:ldc1            #98  <String "milli">
	//*  21   38:invokevirtual   #104 <Method boolean String.equalsIgnoreCase(String)>
	//*  22   41:ifne            164
	//*  23   44:aload_3         
	//*  24   45:ldc1            #106 <String "millisecond">
	//*  25   47:invokevirtual   #104 <Method boolean String.equalsIgnoreCase(String)>
	//*  26   50:ifne            164
	//*  27   53:aload_3         
	//*  28   54:invokevirtual   #110 <Method int String.length()>
	//*  29   57:ifne            63
	//*  30   60:goto            164
			{
				if(!((String) (obj)).equalsIgnoreCase("second") && !((String) (obj)).equalsIgnoreCase("seconde"))
	//*  31   63:aload_3         
	//*  32   64:ldc1            #112 <String "second">
	//*  33   66:invokevirtual   #104 <Method boolean String.equalsIgnoreCase(String)>
	//*  34   69:ifne            159
	//*  35   72:aload_3         
	//*  36   73:ldc1            #114 <String "seconde">
	//*  37   75:invokevirtual   #104 <Method boolean String.equalsIgnoreCase(String)>
	//*  38   78:ifeq            84
	//*  39   81:goto            159
				{
					if(((String) (obj)).equalsIgnoreCase("minute"))
	//*  40   84:aload_3         
	//*  41   85:ldc1            #116 <String "minute">
	//*  42   87:invokevirtual   #104 <Method boolean String.equalsIgnoreCase(String)>
	//*  43   90:ifeq            98
						return buildByMinutes(d);
	//   44   93:dload_1         
	//   45   94:invokestatic    #118 <Method Duration buildByMinutes(double)>
	//   46   97:areturn         
					if(((String) (obj)).equalsIgnoreCase("hour"))
	//*  47   98:aload_3         
	//*  48   99:ldc1            #120 <String "hour">
	//*  49  101:invokevirtual   #104 <Method boolean String.equalsIgnoreCase(String)>
	//*  50  104:ifeq            112
						return buildByHours(d);
	//   51  107:dload_1         
	//   52  108:invokestatic    #122 <Method Duration buildByHours(double)>
	//   53  111:areturn         
					if(((String) (obj)).equalsIgnoreCase("day"))
	//*  54  112:aload_3         
	//*  55  113:ldc1            #124 <String "day">
	//*  56  115:invokevirtual   #104 <Method boolean String.equalsIgnoreCase(String)>
	//*  57  118:ifeq            126
					{
						return buildByDays(d);
	//   58  121:dload_1         
	//   59  122:invokestatic    #126 <Method Duration buildByDays(double)>
	//   60  125:areturn         
					} else
					{
						s = ((String) (new StringBuilder()));
	//   61  126:new             #128 <Class StringBuilder>
	//   62  129:dup             
	//   63  130:invokespecial   #129 <Method void StringBuilder()>
	//   64  133:astore_0        
						((StringBuilder) (s)).append("Unexpected ");
	//   65  134:aload_0         
	//   66  135:ldc1            #131 <String "Unexpected ">
	//   67  137:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   68  140:pop             
						((StringBuilder) (s)).append(((String) (obj)));
	//   69  141:aload_0         
	//   70  142:aload_3         
	//   71  143:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   72  146:pop             
						throw new IllegalStateException(((StringBuilder) (s)).toString());
	//   73  147:new             #137 <Class IllegalStateException>
	//   74  150:dup             
	//   75  151:aload_0         
	//   76  152:invokevirtual   #141 <Method String StringBuilder.toString()>
	//   77  155:invokespecial   #144 <Method void IllegalStateException(String)>
	//   78  158:athrow          
					}
				} else
				{
					return buildBySeconds(d);
	//   79  159:dload_1         
	//   80  160:invokestatic    #146 <Method Duration buildBySeconds(double)>
	//   81  163:areturn         
				}
			} else
			{
				return buildByMilliseconds(d);
	//   82  164:dload_1         
	//   83  165:invokestatic    #148 <Method Duration buildByMilliseconds(double)>
	//   84  168:areturn         
			}
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   85  169:new             #128 <Class StringBuilder>
	//   86  172:dup             
	//   87  173:invokespecial   #129 <Method void StringBuilder()>
	//   88  176:astore_3        
			stringbuilder.append("String value [");
	//   89  177:aload_3         
	//   90  178:ldc1            #150 <String "String value [">
	//   91  180:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   92  183:pop             
			stringbuilder.append(s);
	//   93  184:aload_3         
	//   94  185:aload_0         
	//   95  186:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   96  189:pop             
			stringbuilder.append("] is not in the expected format.");
	//   97  190:aload_3         
	//   98  191:ldc1            #152 <String "] is not in the expected format.">
	//   99  193:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//  100  196:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//  101  197:new             #154 <Class IllegalArgumentException>
	//  102  200:dup             
	//  103  201:aload_3         
	//  104  202:invokevirtual   #141 <Method String StringBuilder.toString()>
	//  105  205:invokespecial   #155 <Method void IllegalArgumentException(String)>
	//  106  208:athrow          
		}
	}

	public long getMilliseconds()
	{
		return millis;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field long millis>
	//    2    4:lreturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder;
		String s;
		if(millis < 1000L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field long millis>
	//*   2    4:ldc2w           #25  <Long 1000L>
	//*   3    7:lcmp            
	//*   4    8:ifge            42
		{
			stringbuilder = new StringBuilder();
	//    5   11:new             #128 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #129 <Method void StringBuilder()>
	//    8   18:astore_1        
			stringbuilder.append(millis);
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:getfield        #51  <Field long millis>
	//   12   24:invokevirtual   #160 <Method StringBuilder StringBuilder.append(long)>
	//   13   27:pop             
			s = " milliseconds";
	//   14   28:ldc1            #162 <String " milliseconds">
	//   15   30:astore_2        
		} else
	//*  16   31:aload_1         
	//*  17   32:aload_2         
	//*  18   33:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//*  19   36:pop             
	//*  20   37:aload_1         
	//*  21   38:invokevirtual   #141 <Method String StringBuilder.toString()>
	//*  22   41:areturn         
		if(millis < 60000L)
	//*  23   42:aload_0         
	//*  24   43:getfield        #51  <Field long millis>
	//*  25   46:ldc2w           #22  <Long 60000L>
	//*  26   49:lcmp            
	//*  27   50:ifge            80
		{
			stringbuilder = new StringBuilder();
	//   28   53:new             #128 <Class StringBuilder>
	//   29   56:dup             
	//   30   57:invokespecial   #129 <Method void StringBuilder()>
	//   31   60:astore_1        
			stringbuilder.append(millis / 1000L);
	//   32   61:aload_1         
	//   33   62:aload_0         
	//   34   63:getfield        #51  <Field long millis>
	//   35   66:ldc2w           #25  <Long 1000L>
	//   36   69:ldiv            
	//   37   70:invokevirtual   #160 <Method StringBuilder StringBuilder.append(long)>
	//   38   73:pop             
			s = " seconds";
	//   39   74:ldc1            #164 <String " seconds">
	//   40   76:astore_2        
		} else
	//*  41   77:goto            31
		if(millis < 0x36ee80L)
	//*  42   80:aload_0         
	//*  43   81:getfield        #51  <Field long millis>
	//*  44   84:ldc2w           #19  <Long 0x36ee80L>
	//*  45   87:lcmp            
	//*  46   88:ifge            118
		{
			stringbuilder = new StringBuilder();
	//   47   91:new             #128 <Class StringBuilder>
	//   48   94:dup             
	//   49   95:invokespecial   #129 <Method void StringBuilder()>
	//   50   98:astore_1        
			stringbuilder.append(millis / 60000L);
	//   51   99:aload_1         
	//   52  100:aload_0         
	//   53  101:getfield        #51  <Field long millis>
	//   54  104:ldc2w           #22  <Long 60000L>
	//   55  107:ldiv            
	//   56  108:invokevirtual   #160 <Method StringBuilder StringBuilder.append(long)>
	//   57  111:pop             
			s = " minutes";
	//   58  112:ldc1            #166 <String " minutes">
	//   59  114:astore_2        
		} else
	//*  60  115:goto            31
		{
			stringbuilder = new StringBuilder();
	//   61  118:new             #128 <Class StringBuilder>
	//   62  121:dup             
	//   63  122:invokespecial   #129 <Method void StringBuilder()>
	//   64  125:astore_1        
			stringbuilder.append(millis / 0x36ee80L);
	//   65  126:aload_1         
	//   66  127:aload_0         
	//   67  128:getfield        #51  <Field long millis>
	//   68  131:ldc2w           #19  <Long 0x36ee80L>
	//   69  134:ldiv            
	//   70  135:invokevirtual   #160 <Method StringBuilder StringBuilder.append(long)>
	//   71  138:pop             
			s = " hours";
	//   72  139:ldc1            #168 <String " hours">
	//   73  141:astore_2        
		}
		stringbuilder.append(s);
		return stringbuilder.toString();
	//*  74  142:goto            31
	}

	static final long DAYS_COEFFICIENT = 0x5265c00L;
	private static final int DOUBLE_GROUP = 1;
	private static final String DOUBLE_PART = "([0-9]*(.[0-9]+)?)";
	private static final Pattern DURATION_PATTERN = Pattern.compile("([0-9]*(.[0-9]+)?)\\s*(|milli(second)?|second(e)?|minute|hour|day)s?", 2);
	static final long HOURS_COEFFICIENT = 0x36ee80L;
	static final long MINUTES_COEFFICIENT = 60000L;
	static final long SECONDS_COEFFICIENT = 1000L;
	private static final int UNIT_GROUP = 3;
	private static final String UNIT_PART = "(|milli(second)?|second(e)?|minute|hour|day)s?";
	final long millis;

	static 
	{
	//    0    0:ldc1            #36  <String "([0-9]*(.[0-9]+)?)\\s*(|milli(second)?|second(e)?|minute|hour|day)s?">
	//    1    2:iconst_2        
	//    2    3:invokestatic    #42  <Method Pattern Pattern.compile(String, int)>
	//    3    6:putstatic       #44  <Field Pattern DURATION_PATTERN>
	//*   4    9:return          
	}
}
