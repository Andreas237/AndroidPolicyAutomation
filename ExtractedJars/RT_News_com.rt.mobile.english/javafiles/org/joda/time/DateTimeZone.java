// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.joda.time;

import com.google.devtools.build.android.desugar.runtime.ThrowableExtension;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.*;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.FormatUtils;
import org.joda.time.tz.DefaultNameProvider;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.joda.time.tz.ZoneInfoProvider;

// Referenced classes of package org.joda.time:
//			UTCDateTimeZone, JodaTimePermission, IllegalInstantException, DateTimeUtils, 
//			ReadableInstant, LocalDateTime

public abstract class DateTimeZone
	implements Serializable
{

	protected DateTimeZone(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void Object()>
		if(s == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       18
		{
			throw new IllegalArgumentException("Id must not be null");
	//    4    8:new             #58  <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc1            #60  <String "Id must not be null">
	//    7   14:invokespecial   #62  <Method void IllegalArgumentException(String)>
	//    8   17:athrow          
		} else
		{
			iID = s;
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:putfield        #64  <Field String iID>
			return;
	//   12   23:return          
		}
	}

	private static DateTimeZone fixedOffsetZone(String s, int i)
	{
		org/joda/time/DateTimeZone;
	//    0    0:ldc1            #2   <Class DateTimeZone>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(i != 0)
			break MISSING_BLOCK_LABEL_20;
	//    2    3:iload_1         
	//    3    4:ifne            20
		s = ((String) (UTC));
	//    4    7:getstatic       #43  <Field DateTimeZone UTC>
	//    5   10:astore_0        
		org/joda/time/DateTimeZone;
	//    6   11:ldc1            #2   <Class DateTimeZone>
		JVM INSTR monitorexit ;
	//    7   13:monitorexit     
		return ((DateTimeZone) (s));
	//    8   14:aload_0         
	//    9   15:areturn         
		s;
	//   10   16:astore_0        
		break MISSING_BLOCK_LABEL_107;
	//   11   17:goto            105
		Object obj;
		if(iFixedOffsetCache == null)
	//*  12   20:getstatic       #68  <Field Map iFixedOffsetCache>
	//*  13   23:ifnonnull       36
			iFixedOffsetCache = ((Map) (new HashMap()));
	//   14   26:new             #70  <Class HashMap>
	//   15   29:dup             
	//   16   30:invokespecial   #71  <Method void HashMap()>
	//   17   33:putstatic       #68  <Field Map iFixedOffsetCache>
		obj = ((Object) ((Reference)iFixedOffsetCache.get(((Object) (s)))));
	//   18   36:getstatic       #68  <Field Map iFixedOffsetCache>
	//   19   39:aload_0         
	//   20   40:invokeinterface #77  <Method Object Map.get(Object)>
	//   21   45:checkcast       #79  <Class Reference>
	//   22   48:astore_2        
		if(obj == null)
			break MISSING_BLOCK_LABEL_70;
	//   23   49:aload_2         
	//   24   50:ifnull          70
		obj = ((Object) ((DateTimeZone)((Reference) (obj)).get()));
	//   25   53:aload_2         
	//   26   54:invokevirtual   #82  <Method Object Reference.get()>
	//   27   57:checkcast       #2   <Class DateTimeZone>
	//   28   60:astore_2        
		if(obj == null)
			break MISSING_BLOCK_LABEL_70;
	//   29   61:aload_2         
	//   30   62:ifnull          70
		org/joda/time/DateTimeZone;
	//   31   65:ldc1            #2   <Class DateTimeZone>
		JVM INSTR monitorexit ;
	//   32   67:monitorexit     
		return ((DateTimeZone) (obj));
	//   33   68:aload_2         
	//   34   69:areturn         
		obj = ((Object) (new FixedDateTimeZone(s, ((String) (null)), i, i)));
	//   35   70:new             #84  <Class FixedDateTimeZone>
	//   36   73:dup             
	//   37   74:aload_0         
	//   38   75:aconst_null     
	//   39   76:iload_1         
	//   40   77:iload_1         
	//   41   78:invokespecial   #87  <Method void FixedDateTimeZone(String, String, int, int)>
	//   42   81:astore_2        
		iFixedOffsetCache.put(((Object) (s)), ((Object) (new SoftReference(obj))));
	//   43   82:getstatic       #68  <Field Map iFixedOffsetCache>
	//   44   85:aload_0         
	//   45   86:new             #89  <Class SoftReference>
	//   46   89:dup             
	//   47   90:aload_2         
	//   48   91:invokespecial   #92  <Method void SoftReference(Object)>
	//   49   94:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//   50   99:pop             
		org/joda/time/DateTimeZone;
	//   51  100:ldc1            #2   <Class DateTimeZone>
		JVM INSTR monitorexit ;
	//   52  102:monitorexit     
		return ((DateTimeZone) (obj));
	//   53  103:aload_2         
	//   54  104:areturn         
	//*  55  105:ldc1            #2   <Class DateTimeZone>
		throw s;
	//   56  107:monitorexit     
	//   57  108:aload_0         
	//   58  109:athrow          
	}

	public static DateTimeZone forID(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return getDefault();
	//    2    4:invokestatic    #103 <Method DateTimeZone getDefault()>
	//    3    7:areturn         
		if(s.equals("UTC"))
	//*   4    8:aload_0         
	//*   5    9:ldc1            #104 <String "UTC">
	//*   6   11:invokevirtual   #110 <Method boolean String.equals(Object)>
	//*   7   14:ifeq            21
			return UTC;
	//    8   17:getstatic       #43  <Field DateTimeZone UTC>
	//    9   20:areturn         
		DateTimeZone datetimezone = cProvider.getZone(s);
	//   10   21:getstatic       #112 <Field Provider cProvider>
	//   11   24:aload_0         
	//   12   25:invokeinterface #117 <Method DateTimeZone Provider.getZone(String)>
	//   13   30:astore_2        
		if(datetimezone != null)
	//*  14   31:aload_2         
	//*  15   32:ifnull          37
			return datetimezone;
	//   16   35:aload_2         
	//   17   36:areturn         
		if(!s.startsWith("+") && !s.startsWith("-"))
	//*  18   37:aload_0         
	//*  19   38:ldc1            #119 <String "+">
	//*  20   40:invokevirtual   #123 <Method boolean String.startsWith(String)>
	//*  21   43:ifne            98
	//*  22   46:aload_0         
	//*  23   47:ldc1            #125 <String "-">
	//*  24   49:invokevirtual   #123 <Method boolean String.startsWith(String)>
	//*  25   52:ifeq            58
	//*  26   55:goto            98
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   27   58:new             #127 <Class StringBuilder>
	//   28   61:dup             
	//   29   62:invokespecial   #128 <Method void StringBuilder()>
	//   30   65:astore_2        
			stringbuilder.append("The datetime zone id '");
	//   31   66:aload_2         
	//   32   67:ldc1            #130 <String "The datetime zone id '">
	//   33   69:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   34   72:pop             
			stringbuilder.append(s);
	//   35   73:aload_2         
	//   36   74:aload_0         
	//   37   75:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   38   78:pop             
			stringbuilder.append("' is not recognised");
	//   39   79:aload_2         
	//   40   80:ldc1            #136 <String "' is not recognised">
	//   41   82:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   42   85:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   43   86:new             #58  <Class IllegalArgumentException>
	//   44   89:dup             
	//   45   90:aload_2         
	//   46   91:invokevirtual   #140 <Method String StringBuilder.toString()>
	//   47   94:invokespecial   #62  <Method void IllegalArgumentException(String)>
	//   48   97:athrow          
		}
		int i = parseOffset(s);
	//   49   98:aload_0         
	//   50   99:invokestatic    #144 <Method int parseOffset(String)>
	//   51  102:istore_1        
		if((long)i == 0L)
	//*  52  103:iload_1         
	//*  53  104:i2l             
	//*  54  105:lconst_0        
	//*  55  106:lcmp            
	//*  56  107:ifne            114
			return UTC;
	//   57  110:getstatic       #43  <Field DateTimeZone UTC>
	//   58  113:areturn         
		else
			return fixedOffsetZone(printOffset(i), i);
	//   59  114:iload_1         
	//   60  115:invokestatic    #148 <Method String printOffset(int)>
	//   61  118:iload_1         
	//   62  119:invokestatic    #150 <Method DateTimeZone fixedOffsetZone(String, int)>
	//   63  122:areturn         
	}

	public static DateTimeZone forOffsetHours(int i)
		throws IllegalArgumentException
	{
		return forOffsetHoursMinutes(i, 0);
	//    0    0:iload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #157 <Method DateTimeZone forOffsetHoursMinutes(int, int)>
	//    3    5:areturn         
	}

	public static DateTimeZone forOffsetHoursMinutes(int i, int j)
		throws IllegalArgumentException
	{
		if(i == 0 && j == 0)
	//*   0    0:iload_0         
	//*   1    1:ifne            12
	//*   2    4:iload_1         
	//*   3    5:ifne            12
			return UTC;
	//    4    8:getstatic       #43  <Field DateTimeZone UTC>
	//    5   11:areturn         
		if(i < -23 || i > 23)
	//*   6   12:iload_0         
	//*   7   13:bipush          -23
	//*   8   15:icmplt          157
	//*   9   18:iload_0         
	//*  10   19:bipush          23
	//*  11   21:icmple          27
			break MISSING_BLOCK_LABEL_157;
	//   12   24:goto            157
		if(j < -59 || j > 59)
	//*  13   27:iload_1         
	//*  14   28:bipush          -59
	//*  15   30:icmplt          124
	//*  16   33:iload_1         
	//*  17   34:bipush          59
	//*  18   36:icmple          42
			break MISSING_BLOCK_LABEL_124;
	//   19   39:goto            124
		if(i > 0 && j < 0)
	//*  20   42:iload_0         
	//*  21   43:ifle            83
	//*  22   46:iload_1         
	//*  23   47:ifge            83
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   24   50:new             #127 <Class StringBuilder>
	//   25   53:dup             
	//   26   54:invokespecial   #128 <Method void StringBuilder()>
	//   27   57:astore_2        
			stringbuilder.append("Positive hours must not have negative minutes: ");
	//   28   58:aload_2         
	//   29   59:ldc1            #162 <String "Positive hours must not have negative minutes: ">
	//   30   61:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   31   64:pop             
			stringbuilder.append(j);
	//   32   65:aload_2         
	//   33   66:iload_1         
	//   34   67:invokevirtual   #165 <Method StringBuilder StringBuilder.append(int)>
	//   35   70:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   36   71:new             #58  <Class IllegalArgumentException>
	//   37   74:dup             
	//   38   75:aload_2         
	//   39   76:invokevirtual   #140 <Method String StringBuilder.toString()>
	//   40   79:invokespecial   #62  <Method void IllegalArgumentException(String)>
	//   41   82:athrow          
		}
		i *= 60;
	//   42   83:iload_0         
	//   43   84:bipush          60
	//   44   86:imul            
	//   45   87:istore_0        
		StringBuilder stringbuilder1;
		ArithmeticException arithmeticexception;
		if(i < 0)
	//*  46   88:iload_0         
	//*  47   89:ifge            194
			try
			{
				i -= Math.abs(j);
	//   48   92:iload_0         
	//   49   93:iload_1         
	//   50   94:invokestatic    #171 <Method int Math.abs(int)>
	//   51   97:isub            
	//   52   98:istore_0        
			}
	//*  53   99:goto            102
	//*  54  102:iload_0         
	//*  55  103:ldc1            #172 <Int 60000>
	//*  56  105:invokestatic    #178 <Method int FieldUtils.safeMultiply(int, int)>
	//*  57  108:istore_0        
	//*  58  109:iload_0         
	//*  59  110:invokestatic    #181 <Method DateTimeZone forOffsetMillis(int)>
	//*  60  113:areturn         
	//*  61  114:new             #58  <Class IllegalArgumentException>
	//*  62  117:dup             
	//*  63  118:ldc1            #183 <String "Offset is too large">
	//*  64  120:invokespecial   #62  <Method void IllegalArgumentException(String)>
	//*  65  123:athrow          
	//*  66  124:new             #127 <Class StringBuilder>
	//*  67  127:dup             
	//*  68  128:invokespecial   #128 <Method void StringBuilder()>
	//*  69  131:astore_2        
	//*  70  132:aload_2         
	//*  71  133:ldc1            #185 <String "Minutes out of range: ">
	//*  72  135:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//*  73  138:pop             
	//*  74  139:aload_2         
	//*  75  140:iload_1         
	//*  76  141:invokevirtual   #165 <Method StringBuilder StringBuilder.append(int)>
	//*  77  144:pop             
	//*  78  145:new             #58  <Class IllegalArgumentException>
	//*  79  148:dup             
	//*  80  149:aload_2         
	//*  81  150:invokevirtual   #140 <Method String StringBuilder.toString()>
	//*  82  153:invokespecial   #62  <Method void IllegalArgumentException(String)>
	//*  83  156:athrow          
	//*  84  157:new             #127 <Class StringBuilder>
	//*  85  160:dup             
	//*  86  161:invokespecial   #128 <Method void StringBuilder()>
	//*  87  164:astore_2        
	//*  88  165:aload_2         
	//*  89  166:ldc1            #187 <String "Hours out of range: ">
	//*  90  168:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//*  91  171:pop             
	//*  92  172:aload_2         
	//*  93  173:iload_0         
	//*  94  174:invokevirtual   #165 <Method StringBuilder StringBuilder.append(int)>
	//*  95  177:pop             
	//*  96  178:new             #58  <Class IllegalArgumentException>
	//*  97  181:dup             
	//*  98  182:aload_2         
	//*  99  183:invokevirtual   #140 <Method String StringBuilder.toString()>
	//* 100  186:invokespecial   #62  <Method void IllegalArgumentException(String)>
	//* 101  189:athrow          
			// Misplaced declaration of an exception variable
			catch(ArithmeticException arithmeticexception)
			{
				throw new IllegalArgumentException("Offset is too large");
			}
		else
	//* 102  190:astore_2        
	//* 103  191:goto            114
			i += j;
	//  104  194:iload_0         
	//  105  195:iload_1         
	//  106  196:iadd            
	//  107  197:istore_0        
		i = FieldUtils.safeMultiply(i, 60000);
		return forOffsetMillis(i);
		stringbuilder1 = new StringBuilder();
		stringbuilder1.append("Minutes out of range: ");
		stringbuilder1.append(j);
		throw new IllegalArgumentException(stringbuilder1.toString());
		stringbuilder1 = new StringBuilder();
		stringbuilder1.append("Hours out of range: ");
		stringbuilder1.append(i);
		throw new IllegalArgumentException(stringbuilder1.toString());
	//* 108  198:goto            102
	}

	public static DateTimeZone forOffsetMillis(int i)
	{
		if(i >= 0xfad9a401 && i <= 0x5265bff)
	//*   0    0:iload_0         
	//*   1    1:ldc1            #188 <Int 0xfad9a401>
	//*   2    3:icmplt          24
	//*   3    6:iload_0         
	//*   4    7:ldc1            #11  <Int 0x5265bff>
	//*   5    9:icmple          15
	//*   6   12:goto            24
		{
			return fixedOffsetZone(printOffset(i), i);
	//    7   15:iload_0         
	//    8   16:invokestatic    #148 <Method String printOffset(int)>
	//    9   19:iload_0         
	//   10   20:invokestatic    #150 <Method DateTimeZone fixedOffsetZone(String, int)>
	//   11   23:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   12   24:new             #127 <Class StringBuilder>
	//   13   27:dup             
	//   14   28:invokespecial   #128 <Method void StringBuilder()>
	//   15   31:astore_1        
			stringbuilder.append("Millis out of range: ");
	//   16   32:aload_1         
	//   17   33:ldc1            #190 <String "Millis out of range: ">
	//   18   35:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
			stringbuilder.append(i);
	//   20   39:aload_1         
	//   21   40:iload_0         
	//   22   41:invokevirtual   #165 <Method StringBuilder StringBuilder.append(int)>
	//   23   44:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   24   45:new             #58  <Class IllegalArgumentException>
	//   25   48:dup             
	//   26   49:aload_1         
	//   27   50:invokevirtual   #140 <Method String StringBuilder.toString()>
	//   28   53:invokespecial   #62  <Method void IllegalArgumentException(String)>
	//   29   56:athrow          
		}
	}

	public static DateTimeZone forTimeZone(TimeZone timezone)
	{
		if(timezone == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return getDefault();
	//    2    4:invokestatic    #103 <Method DateTimeZone getDefault()>
	//    3    7:areturn         
		String s = timezone.getID();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #197 <Method String TimeZone.getID()>
	//    6   12:astore_3        
		if(s == null)
	//*   7   13:aload_3         
	//*   8   14:ifnonnull       27
			throw new IllegalArgumentException("The TimeZone id must not be null");
	//    9   17:new             #58  <Class IllegalArgumentException>
	//   10   20:dup             
	//   11   21:ldc1            #199 <String "The TimeZone id must not be null">
	//   12   23:invokespecial   #62  <Method void IllegalArgumentException(String)>
	//   13   26:athrow          
		if(s.equals("UTC"))
	//*  14   27:aload_3         
	//*  15   28:ldc1            #104 <String "UTC">
	//*  16   30:invokevirtual   #110 <Method boolean String.equals(Object)>
	//*  17   33:ifeq            40
			return UTC;
	//   18   36:getstatic       #43  <Field DateTimeZone UTC>
	//   19   39:areturn         
		timezone = null;
	//   20   40:aconst_null     
	//   21   41:astore_0        
		String s1 = getConvertedId(s);
	//   22   42:aload_3         
	//   23   43:invokestatic    #203 <Method String getConvertedId(String)>
	//   24   46:astore          4
		if(s1 != null)
	//*  25   48:aload           4
	//*  26   50:ifnull          64
			timezone = ((TimeZone) (cProvider.getZone(s1)));
	//   27   53:getstatic       #112 <Field Provider cProvider>
	//   28   56:aload           4
	//   29   58:invokeinterface #117 <Method DateTimeZone Provider.getZone(String)>
	//   30   63:astore_0        
		Object obj = ((Object) (timezone));
	//   31   64:aload_0         
	//   32   65:astore_2        
		if(timezone == null)
	//*  33   66:aload_0         
	//*  34   67:ifnonnull       80
			obj = ((Object) (cProvider.getZone(s)));
	//   35   70:getstatic       #112 <Field Provider cProvider>
	//   36   73:aload_3         
	//   37   74:invokeinterface #117 <Method DateTimeZone Provider.getZone(String)>
	//   38   79:astore_2        
		if(obj != null)
	//*  39   80:aload_2         
	//*  40   81:ifnull          86
			return ((DateTimeZone) (obj));
	//   41   84:aload_2         
	//   42   85:areturn         
		if(s1 == null && (s.startsWith("GMT+") || s.startsWith("GMT-")))
	//*  43   86:aload           4
	//*  44   88:ifnonnull       138
	//*  45   91:aload_3         
	//*  46   92:ldc1            #205 <String "GMT+">
	//*  47   94:invokevirtual   #123 <Method boolean String.startsWith(String)>
	//*  48   97:ifne            109
	//*  49  100:aload_3         
	//*  50  101:ldc1            #207 <String "GMT-">
	//*  51  103:invokevirtual   #123 <Method boolean String.startsWith(String)>
	//*  52  106:ifeq            138
		{
			int i = parseOffset(s.substring(3));
	//   53  109:aload_3         
	//   54  110:iconst_3        
	//   55  111:invokevirtual   #210 <Method String String.substring(int)>
	//   56  114:invokestatic    #144 <Method int parseOffset(String)>
	//   57  117:istore_1        
			if((long)i == 0L)
	//*  58  118:iload_1         
	//*  59  119:i2l             
	//*  60  120:lconst_0        
	//*  61  121:lcmp            
	//*  62  122:ifne            129
				return UTC;
	//   63  125:getstatic       #43  <Field DateTimeZone UTC>
	//   64  128:areturn         
			else
				return fixedOffsetZone(printOffset(i), i);
	//   65  129:iload_1         
	//   66  130:invokestatic    #148 <Method String printOffset(int)>
	//   67  133:iload_1         
	//   68  134:invokestatic    #150 <Method DateTimeZone fixedOffsetZone(String, int)>
	//   69  137:areturn         
		} else
		{
			timezone = ((TimeZone) (new StringBuilder()));
	//   70  138:new             #127 <Class StringBuilder>
	//   71  141:dup             
	//   72  142:invokespecial   #128 <Method void StringBuilder()>
	//   73  145:astore_0        
			((StringBuilder) (timezone)).append("The datetime zone id '");
	//   74  146:aload_0         
	//   75  147:ldc1            #130 <String "The datetime zone id '">
	//   76  149:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   77  152:pop             
			((StringBuilder) (timezone)).append(s);
	//   78  153:aload_0         
	//   79  154:aload_3         
	//   80  155:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   81  158:pop             
			((StringBuilder) (timezone)).append("' is not recognised");
	//   82  159:aload_0         
	//   83  160:ldc1            #136 <String "' is not recognised">
	//   84  162:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   85  165:pop             
			throw new IllegalArgumentException(((StringBuilder) (timezone)).toString());
	//   86  166:new             #58  <Class IllegalArgumentException>
	//   87  169:dup             
	//   88  170:aload_0         
	//   89  171:invokevirtual   #140 <Method String StringBuilder.toString()>
	//   90  174:invokespecial   #62  <Method void IllegalArgumentException(String)>
	//   91  177:athrow          
		}
	}

	public static Set getAvailableIDs()
	{
		return cAvailableIDs;
	//    0    0:getstatic       #214 <Field Set cAvailableIDs>
	//    1    3:areturn         
	}

	private static String getConvertedId(String s)
	{
		org/joda/time/DateTimeZone;
	//    0    0:ldc1            #2   <Class DateTimeZone>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Map map = cZoneIdConversion;
	//    2    3:getstatic       #218 <Field Map cZoneIdConversion>
	//    3    6:astore_2        
		Object obj;
		obj = ((Object) (map));
	//    4    7:aload_2         
	//    5    8:astore_1        
		if(map != null)
			break MISSING_BLOCK_LABEL_430;
	//    6    9:aload_2         
	//    7   10:ifnonnull       430
		obj = ((Object) (new HashMap()));
	//    8   13:new             #70  <Class HashMap>
	//    9   16:dup             
	//   10   17:invokespecial   #71  <Method void HashMap()>
	//   11   20:astore_1        
		((Map) (obj)).put("GMT", "UTC");
	//   12   21:aload_1         
	//   13   22:ldc1            #220 <String "GMT">
	//   14   24:ldc1            #104 <String "UTC">
	//   15   26:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//   16   31:pop             
		((Map) (obj)).put("WET", "WET");
	//   17   32:aload_1         
	//   18   33:ldc1            #222 <String "WET">
	//   19   35:ldc1            #222 <String "WET">
	//   20   37:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//   21   42:pop             
		((Map) (obj)).put("CET", "CET");
	//   22   43:aload_1         
	//   23   44:ldc1            #224 <String "CET">
	//   24   46:ldc1            #224 <String "CET">
	//   25   48:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//   26   53:pop             
		((Map) (obj)).put("MET", "CET");
	//   27   54:aload_1         
	//   28   55:ldc1            #226 <String "MET">
	//   29   57:ldc1            #224 <String "CET">
	//   30   59:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//   31   64:pop             
		((Map) (obj)).put("ECT", "CET");
	//   32   65:aload_1         
	//   33   66:ldc1            #228 <String "ECT">
	//   34   68:ldc1            #224 <String "CET">
	//   35   70:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//   36   75:pop             
		((Map) (obj)).put("EET", "EET");
	//   37   76:aload_1         
	//   38   77:ldc1            #230 <String "EET">
	//   39   79:ldc1            #230 <String "EET">
	//   40   81:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//   41   86:pop             
		((Map) (obj)).put("MIT", "Pacific/Apia");
	//   42   87:aload_1         
	//   43   88:ldc1            #232 <String "MIT">
	//   44   90:ldc1            #234 <String "Pacific/Apia">
	//   45   92:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//   46   97:pop             
		((Map) (obj)).put("HST", "Pacific/Honolulu");
	//   47   98:aload_1         
	//   48   99:ldc1            #236 <String "HST">
	//   49  101:ldc1            #238 <String "Pacific/Honolulu">
	//   50  103:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//   51  108:pop             
		((Map) (obj)).put("AST", "America/Anchorage");
	//   52  109:aload_1         
	//   53  110:ldc1            #240 <String "AST">
	//   54  112:ldc1            #242 <String "America/Anchorage">
	//   55  114:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//   56  119:pop             
		((Map) (obj)).put("PST", "America/Los_Angeles");
	//   57  120:aload_1         
	//   58  121:ldc1            #244 <String "PST">
	//   59  123:ldc1            #246 <String "America/Los_Angeles">
	//   60  125:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//   61  130:pop             
		((Map) (obj)).put("MST", "America/Denver");
	//   62  131:aload_1         
	//   63  132:ldc1            #248 <String "MST">
	//   64  134:ldc1            #250 <String "America/Denver">
	//   65  136:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//   66  141:pop             
		((Map) (obj)).put("PNT", "America/Phoenix");
	//   67  142:aload_1         
	//   68  143:ldc1            #252 <String "PNT">
	//   69  145:ldc1            #254 <String "America/Phoenix">
	//   70  147:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//   71  152:pop             
		((Map) (obj)).put("CST", "America/Chicago");
	//   72  153:aload_1         
	//   73  154:ldc2            #256 <String "CST">
	//   74  157:ldc2            #258 <String "America/Chicago">
	//   75  160:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//   76  165:pop             
		((Map) (obj)).put("EST", "America/New_York");
	//   77  166:aload_1         
	//   78  167:ldc2            #260 <String "EST">
	//   79  170:ldc2            #262 <String "America/New_York">
	//   80  173:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//   81  178:pop             
		((Map) (obj)).put("IET", "America/Indiana/Indianapolis");
	//   82  179:aload_1         
	//   83  180:ldc2            #264 <String "IET">
	//   84  183:ldc2            #266 <String "America/Indiana/Indianapolis">
	//   85  186:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//   86  191:pop             
		((Map) (obj)).put("PRT", "America/Puerto_Rico");
	//   87  192:aload_1         
	//   88  193:ldc2            #268 <String "PRT">
	//   89  196:ldc2            #270 <String "America/Puerto_Rico">
	//   90  199:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//   91  204:pop             
		((Map) (obj)).put("CNT", "America/St_Johns");
	//   92  205:aload_1         
	//   93  206:ldc2            #272 <String "CNT">
	//   94  209:ldc2            #274 <String "America/St_Johns">
	//   95  212:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//   96  217:pop             
		((Map) (obj)).put("AGT", "America/Argentina/Buenos_Aires");
	//   97  218:aload_1         
	//   98  219:ldc2            #276 <String "AGT">
	//   99  222:ldc2            #278 <String "America/Argentina/Buenos_Aires">
	//  100  225:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//  101  230:pop             
		((Map) (obj)).put("BET", "America/Sao_Paulo");
	//  102  231:aload_1         
	//  103  232:ldc2            #280 <String "BET">
	//  104  235:ldc2            #282 <String "America/Sao_Paulo">
	//  105  238:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//  106  243:pop             
		((Map) (obj)).put("ART", "Africa/Cairo");
	//  107  244:aload_1         
	//  108  245:ldc2            #284 <String "ART">
	//  109  248:ldc2            #286 <String "Africa/Cairo">
	//  110  251:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//  111  256:pop             
		((Map) (obj)).put("CAT", "Africa/Harare");
	//  112  257:aload_1         
	//  113  258:ldc2            #288 <String "CAT">
	//  114  261:ldc2            #290 <String "Africa/Harare">
	//  115  264:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//  116  269:pop             
		((Map) (obj)).put("EAT", "Africa/Addis_Ababa");
	//  117  270:aload_1         
	//  118  271:ldc2            #292 <String "EAT">
	//  119  274:ldc2            #294 <String "Africa/Addis_Ababa">
	//  120  277:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//  121  282:pop             
		((Map) (obj)).put("NET", "Asia/Yerevan");
	//  122  283:aload_1         
	//  123  284:ldc2            #296 <String "NET">
	//  124  287:ldc2            #298 <String "Asia/Yerevan">
	//  125  290:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//  126  295:pop             
		((Map) (obj)).put("PLT", "Asia/Karachi");
	//  127  296:aload_1         
	//  128  297:ldc2            #300 <String "PLT">
	//  129  300:ldc2            #302 <String "Asia/Karachi">
	//  130  303:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//  131  308:pop             
		((Map) (obj)).put("IST", "Asia/Kolkata");
	//  132  309:aload_1         
	//  133  310:ldc2            #304 <String "IST">
	//  134  313:ldc2            #306 <String "Asia/Kolkata">
	//  135  316:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//  136  321:pop             
		((Map) (obj)).put("BST", "Asia/Dhaka");
	//  137  322:aload_1         
	//  138  323:ldc2            #308 <String "BST">
	//  139  326:ldc2            #310 <String "Asia/Dhaka">
	//  140  329:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//  141  334:pop             
		((Map) (obj)).put("VST", "Asia/Ho_Chi_Minh");
	//  142  335:aload_1         
	//  143  336:ldc2            #312 <String "VST">
	//  144  339:ldc2            #314 <String "Asia/Ho_Chi_Minh">
	//  145  342:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//  146  347:pop             
		((Map) (obj)).put("CTT", "Asia/Shanghai");
	//  147  348:aload_1         
	//  148  349:ldc2            #316 <String "CTT">
	//  149  352:ldc2            #318 <String "Asia/Shanghai">
	//  150  355:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//  151  360:pop             
		((Map) (obj)).put("JST", "Asia/Tokyo");
	//  152  361:aload_1         
	//  153  362:ldc2            #320 <String "JST">
	//  154  365:ldc2            #322 <String "Asia/Tokyo">
	//  155  368:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//  156  373:pop             
		((Map) (obj)).put("ACT", "Australia/Darwin");
	//  157  374:aload_1         
	//  158  375:ldc2            #324 <String "ACT">
	//  159  378:ldc2            #326 <String "Australia/Darwin">
	//  160  381:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//  161  386:pop             
		((Map) (obj)).put("AET", "Australia/Sydney");
	//  162  387:aload_1         
	//  163  388:ldc2            #328 <String "AET">
	//  164  391:ldc2            #330 <String "Australia/Sydney">
	//  165  394:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//  166  399:pop             
		((Map) (obj)).put("SST", "Pacific/Guadalcanal");
	//  167  400:aload_1         
	//  168  401:ldc2            #332 <String "SST">
	//  169  404:ldc2            #334 <String "Pacific/Guadalcanal">
	//  170  407:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//  171  412:pop             
		((Map) (obj)).put("NST", "Pacific/Auckland");
	//  172  413:aload_1         
	//  173  414:ldc2            #336 <String "NST">
	//  174  417:ldc2            #338 <String "Pacific/Auckland">
	//  175  420:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//  176  425:pop             
		cZoneIdConversion = ((Map) (obj));
	//  177  426:aload_1         
	//  178  427:putstatic       #218 <Field Map cZoneIdConversion>
		s = (String)((Map) (obj)).get(((Object) (s)));
	//  179  430:aload_1         
	//  180  431:aload_0         
	//  181  432:invokeinterface #77  <Method Object Map.get(Object)>
	//  182  437:checkcast       #106 <Class String>
	//  183  440:astore_0        
		org/joda/time/DateTimeZone;
	//  184  441:ldc1            #2   <Class DateTimeZone>
		JVM INSTR monitorexit ;
	//  185  443:monitorexit     
		return s;
	//  186  444:aload_0         
	//  187  445:areturn         
		s;
	//  188  446:astore_0        
	//* 189  447:ldc1            #2   <Class DateTimeZone>
		throw s;
	//  190  449:monitorexit     
	//  191  450:aload_0         
	//  192  451:athrow          
	}

	public static DateTimeZone getDefault()
	{
		Object obj = ((Object) (cDefault));
	//    0    0:getstatic       #342 <Field DateTimeZone cDefault>
	//    1    3:astore_0        
		if(obj != null) goto _L2; else goto _L1
	//    2    4:aload_0         
	//    3    5:ifnonnull       87
_L1:
		org/joda/time/DateTimeZone;
	//    4    8:ldc1            #2   <Class DateTimeZone>
		JVM INSTR monitorenter ;
	//    5   10:monitorenter    
		Object obj1 = ((Object) (cDefault));
	//    6   11:getstatic       #342 <Field DateTimeZone cDefault>
	//    7   14:astore_1        
		obj = obj1;
	//    8   15:aload_1         
	//    9   16:astore_0        
		if(obj1 != null) goto _L4; else goto _L3
	//   10   17:aload_1         
	//   11   18:ifnonnull       76
_L3:
		DateTimeZone datetimezone;
		datetimezone = null;
	//   12   21:aconst_null     
	//   13   22:astore_2        
		obj1 = null;
	//   14   23:aconst_null     
	//   15   24:astore_1        
		obj = ((Object) (datetimezone));
	//   16   25:aload_2         
	//   17   26:astore_0        
		String s = System.getProperty("user.timezone");
	//   18   27:ldc2            #344 <String "user.timezone">
	//   19   30:invokestatic    #349 <Method String System.getProperty(String)>
	//   20   33:astore_3        
		obj = obj1;
	//   21   34:aload_1         
	//   22   35:astore_0        
		if(s == null)
			break MISSING_BLOCK_LABEL_49;
	//   23   36:aload_3         
	//   24   37:ifnull          49
		obj = ((Object) (datetimezone));
	//   25   40:aload_2         
	//   26   41:astore_0        
		datetimezone = forID(s);
	//   27   42:aload_3         
	//   28   43:invokestatic    #351 <Method DateTimeZone forID(String)>
	//   29   46:astore_2        
		obj = ((Object) (datetimezone));
	//   30   47:aload_2         
	//   31   48:astore_0        
_L6:
		obj1 = obj;
	//   32   49:aload_0         
	//   33   50:astore_1        
		if(obj != null)
			break MISSING_BLOCK_LABEL_62;
	//   34   51:aload_0         
	//   35   52:ifnonnull       62
		try
		{
			obj1 = ((Object) (forTimeZone(TimeZone.getDefault())));
	//   36   55:invokestatic    #354 <Method TimeZone TimeZone.getDefault()>
	//   37   58:invokestatic    #356 <Method DateTimeZone forTimeZone(TimeZone)>
	//   38   61:astore_1        
		}
	//*  39   62:aload_1         
	//*  40   63:astore_0        
	//*  41   64:aload_1         
	//*  42   65:ifnonnull       72
	//*  43   68:getstatic       #43  <Field DateTimeZone UTC>
	//*  44   71:astore_0        
	//*  45   72:aload_0         
	//*  46   73:putstatic       #342 <Field DateTimeZone cDefault>
	//*  47   76:ldc1            #2   <Class DateTimeZone>
	//*  48   78:monitorexit     
	//*  49   79:aload_0         
	//*  50   80:areturn         
	//*  51   81:astore_0        
	//*  52   82:ldc1            #2   <Class DateTimeZone>
	//*  53   84:monitorexit     
	//*  54   85:aload_0         
	//*  55   86:athrow          
	//*  56   87:aload_0         
	//*  57   88:areturn         
	//*  58   89:astore_0        
	//*  59   90:aload_1         
	//*  60   91:astore_0        
	//*  61   92:goto            49
		catch(IllegalArgumentException illegalargumentexception)
	//*  62   95:astore_1        
		{
			illegalargumentexception = ((IllegalArgumentException) (obj));
	//   63   96:aload_0         
	//   64   97:astore_1        
		}
		obj = obj1;
		if(obj1 != null)
			break MISSING_BLOCK_LABEL_72;
		obj = ((Object) (UTC));
		cDefault = ((DateTimeZone) (obj));
_L4:
		org/joda/time/DateTimeZone;
		JVM INSTR monitorexit ;
		return ((DateTimeZone) (obj));
		obj;
		org/joda/time/DateTimeZone;
		JVM INSTR monitorexit ;
		throw obj;
_L2:
		return ((DateTimeZone) (obj));
		obj;
		obj = obj1;
		if(true) goto _L6; else goto _L5
_L5:
	//*  65   98:goto            62
	}

	private static NameProvider getDefaultNameProvider()
	{
		Object obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		String s = System.getProperty("org.joda.time.DateTimeZone.NameProvider");
	//    2    2:ldc2            #364 <String "org.joda.time.DateTimeZone.NameProvider">
	//    3    5:invokestatic    #349 <Method String System.getProperty(String)>
	//    4    8:astore_2        
		Object obj;
		obj = obj1;
	//    5    9:aload_1         
	//    6   10:astore_0        
		if(s == null)
			break MISSING_BLOCK_LABEL_39;
	//    7   11:aload_2         
	//    8   12:ifnull          39
		obj = ((Object) ((NameProvider)Class.forName(s).newInstance()));
	//    9   15:aload_2         
	//   10   16:invokestatic    #370 <Method Class Class.forName(String)>
	//   11   19:invokevirtual   #373 <Method Object Class.newInstance()>
	//   12   22:checkcast       #375 <Class NameProvider>
	//   13   25:astore_0        
		break MISSING_BLOCK_LABEL_39;
	//   14   26:goto            39
		obj;
	//   15   29:astore_0        
		try
		{
			throw new RuntimeException(((Throwable) (obj)));
	//   16   30:new             #340 <Class RuntimeException>
	//   17   33:dup             
	//   18   34:aload_0         
	//   19   35:invokespecial   #378 <Method void RuntimeException(Throwable)>
	//   20   38:athrow          
		}
	//*  21   39:aload_0         
	//*  22   40:astore_1        
	//*  23   41:aload_0         
	//*  24   42:ifnonnull       53
	//*  25   45:new             #380 <Class DefaultNameProvider>
	//*  26   48:dup             
	//*  27   49:invokespecial   #381 <Method void DefaultNameProvider()>
	//*  28   52:astore_1        
	//*  29   53:aload_1         
	//*  30   54:areturn         
		catch(SecurityException securityexception)
	//*  31   55:astore_0        
		{
			securityexception = ((SecurityException) (obj1));
	//   32   56:aload_1         
	//   33   57:astore_0        
		}
		obj1 = obj;
		if(obj == null)
			obj1 = ((Object) (new DefaultNameProvider()));
		return ((NameProvider) (obj1));
	//*  34   58:goto            39
	}

	private static Provider getDefaultProvider()
	{
		Object obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		String s = System.getProperty("org.joda.time.DateTimeZone.Provider");
	//    2    2:ldc2            #385 <String "org.joda.time.DateTimeZone.Provider">
	//    3    5:invokestatic    #349 <Method String System.getProperty(String)>
	//    4    8:astore_2        
		Object obj;
		obj = obj1;
	//    5    9:aload_1         
	//    6   10:astore_0        
		if(s == null)
			break MISSING_BLOCK_LABEL_39;
	//    7   11:aload_2         
	//    8   12:ifnull          39
		obj = ((Object) ((Provider)Class.forName(s).newInstance()));
	//    9   15:aload_2         
	//   10   16:invokestatic    #370 <Method Class Class.forName(String)>
	//   11   19:invokevirtual   #373 <Method Object Class.newInstance()>
	//   12   22:checkcast       #114 <Class Provider>
	//   13   25:astore_0        
		break MISSING_BLOCK_LABEL_39;
	//   14   26:goto            39
		obj;
	//   15   29:astore_0        
		try
		{
			throw new RuntimeException(((Throwable) (obj)));
	//   16   30:new             #340 <Class RuntimeException>
	//   17   33:dup             
	//   18   34:aload_0         
	//   19   35:invokespecial   #378 <Method void RuntimeException(Throwable)>
	//   20   38:athrow          
		}
	//*  21   39:aload_0         
	//*  22   40:astore_1        
	//*  23   41:aload_0         
	//*  24   42:ifnonnull       66
	//*  25   45:new             #387 <Class ZoneInfoProvider>
	//*  26   48:dup             
	//*  27   49:ldc2            #389 <String "org/joda/time/tz/data">
	//*  28   52:invokespecial   #390 <Method void ZoneInfoProvider(String)>
	//*  29   55:astore_1        
	//*  30   56:goto            66
	//*  31   59:astore_1        
	//*  32   60:aload_1         
	//*  33   61:invokestatic    #395 <Method void ThrowableExtension.printStackTrace(Throwable)>
	//*  34   64:aload_0         
	//*  35   65:astore_1        
	//*  36   66:aload_1         
	//*  37   67:astore_0        
	//*  38   68:aload_1         
	//*  39   69:ifnonnull       80
	//*  40   72:new             #397 <Class UTCProvider>
	//*  41   75:dup             
	//*  42   76:invokespecial   #398 <Method void UTCProvider()>
	//*  43   79:astore_0        
	//*  44   80:aload_0         
	//*  45   81:areturn         
		catch(SecurityException securityexception)
	//*  46   82:astore_0        
		{
			securityexception = ((SecurityException) (obj1));
	//   47   83:aload_1         
	//   48   84:astore_0        
		}
		obj1 = obj;
		if(obj == null)
			try
			{
				obj1 = ((Object) (new ZoneInfoProvider("org/joda/time/tz/data")));
			}
			// Misplaced declaration of an exception variable
			catch(Object obj1)
			{
				ThrowableExtension.printStackTrace(((Throwable) (obj1)));
				obj1 = obj;
			}
		obj = obj1;
		if(obj1 == null)
			obj = ((Object) (new UTCProvider()));
		return ((Provider) (obj));
	//*  49   85:goto            39
	}

	public static NameProvider getNameProvider()
	{
		return cNameProvider;
	//    0    0:getstatic       #401 <Field NameProvider cNameProvider>
	//    1    3:areturn         
	}

	public static Provider getProvider()
	{
		return cProvider;
	//    0    0:getstatic       #112 <Field Provider cProvider>
	//    1    3:areturn         
	}

	private static DateTimeFormatter offsetFormatter()
	{
		org/joda/time/DateTimeZone;
	//    0    0:ldc1            #2   <Class DateTimeZone>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		DateTimeFormatter datetimeformatter;
		if(cOffsetFormatter == null)
	//*   2    3:getstatic       #406 <Field DateTimeFormatter cOffsetFormatter>
	//*   3    6:ifnonnull       29
			cOffsetFormatter = (new DateTimeFormatterBuilder()).appendTimeZoneOffset(((String) (null)), true, 2, 4).toFormatter();
	//    4    9:new             #408 <Class DateTimeFormatterBuilder>
	//    5   12:dup             
	//    6   13:invokespecial   #409 <Method void DateTimeFormatterBuilder()>
	//    7   16:aconst_null     
	//    8   17:iconst_1        
	//    9   18:iconst_2        
	//   10   19:iconst_4        
	//   11   20:invokevirtual   #413 <Method DateTimeFormatterBuilder DateTimeFormatterBuilder.appendTimeZoneOffset(String, boolean, int, int)>
	//   12   23:invokevirtual   #416 <Method DateTimeFormatter DateTimeFormatterBuilder.toFormatter()>
	//   13   26:putstatic       #406 <Field DateTimeFormatter cOffsetFormatter>
		datetimeformatter = cOffsetFormatter;
	//   14   29:getstatic       #406 <Field DateTimeFormatter cOffsetFormatter>
	//   15   32:astore_0        
		org/joda/time/DateTimeZone;
	//   16   33:ldc1            #2   <Class DateTimeZone>
		JVM INSTR monitorexit ;
	//   17   35:monitorexit     
		return datetimeformatter;
	//   18   36:aload_0         
	//   19   37:areturn         
		Exception exception;
		exception;
	//   20   38:astore_0        
	//*  21   39:ldc1            #2   <Class DateTimeZone>
		throw exception;
	//   22   41:monitorexit     
	//   23   42:aload_0         
	//   24   43:athrow          
	}

	private static int parseOffset(String s)
	{
		_cls1 _lcls1 = new _cls1();
	//    0    0:new             #418 <Class DateTimeZone$1>
	//    1    3:dup             
	//    2    4:invokespecial   #419 <Method void DateTimeZone$1()>
	//    3    7:astore_1        
		return -(int)offsetFormatter().withChronology(((Chronology) (_lcls1))).parseMillis(s);
	//    4    8:invokestatic    #421 <Method DateTimeFormatter offsetFormatter()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #427 <Method DateTimeFormatter DateTimeFormatter.withChronology(Chronology)>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #431 <Method long DateTimeFormatter.parseMillis(String)>
	//    9   19:l2i             
	//   10   20:ineg            
	//   11   21:ireturn         
	}

	private static String printOffset(int i)
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #433 <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #434 <Method void StringBuffer()>
	//    3    7:astore_2        
		if(i >= 0)
	//*   4    8:iload_0         
	//*   5    9:iflt            22
		{
			stringbuffer.append('+');
	//    6   12:aload_2         
	//    7   13:bipush          43
	//    8   15:invokevirtual   #437 <Method StringBuffer StringBuffer.append(char)>
	//    9   18:pop             
		} else
	//*  10   19:goto            32
		{
			stringbuffer.append('-');
	//   11   22:aload_2         
	//   12   23:bipush          45
	//   13   25:invokevirtual   #437 <Method StringBuffer StringBuffer.append(char)>
	//   14   28:pop             
			i = -i;
	//   15   29:iload_0         
	//   16   30:ineg            
	//   17   31:istore_0        
		}
		int j = i / 0x36ee80;
	//   18   32:iload_0         
	//   19   33:ldc2            #438 <Int 0x36ee80>
	//   20   36:idiv            
	//   21   37:istore_1        
		FormatUtils.appendPaddedInteger(stringbuffer, j, 2);
	//   22   38:aload_2         
	//   23   39:iload_1         
	//   24   40:iconst_2        
	//   25   41:invokestatic    #444 <Method void FormatUtils.appendPaddedInteger(StringBuffer, int, int)>
		i -= j * 0x36ee80;
	//   26   44:iload_0         
	//   27   45:iload_1         
	//   28   46:ldc2            #438 <Int 0x36ee80>
	//   29   49:imul            
	//   30   50:isub            
	//   31   51:istore_0        
		j = i / 60000;
	//   32   52:iload_0         
	//   33   53:ldc1            #172 <Int 60000>
	//   34   55:idiv            
	//   35   56:istore_1        
		stringbuffer.append(':');
	//   36   57:aload_2         
	//   37   58:bipush          58
	//   38   60:invokevirtual   #437 <Method StringBuffer StringBuffer.append(char)>
	//   39   63:pop             
		FormatUtils.appendPaddedInteger(stringbuffer, j, 2);
	//   40   64:aload_2         
	//   41   65:iload_1         
	//   42   66:iconst_2        
	//   43   67:invokestatic    #444 <Method void FormatUtils.appendPaddedInteger(StringBuffer, int, int)>
		i -= j * 60000;
	//   44   70:iload_0         
	//   45   71:iload_1         
	//   46   72:ldc1            #172 <Int 60000>
	//   47   74:imul            
	//   48   75:isub            
	//   49   76:istore_0        
		if(i == 0)
	//*  50   77:iload_0         
	//*  51   78:ifne            86
			return stringbuffer.toString();
	//   52   81:aload_2         
	//   53   82:invokevirtual   #445 <Method String StringBuffer.toString()>
	//   54   85:areturn         
		j = i / 1000;
	//   55   86:iload_0         
	//   56   87:sipush          1000
	//   57   90:idiv            
	//   58   91:istore_1        
		stringbuffer.append(':');
	//   59   92:aload_2         
	//   60   93:bipush          58
	//   61   95:invokevirtual   #437 <Method StringBuffer StringBuffer.append(char)>
	//   62   98:pop             
		FormatUtils.appendPaddedInteger(stringbuffer, j, 2);
	//   63   99:aload_2         
	//   64  100:iload_1         
	//   65  101:iconst_2        
	//   66  102:invokestatic    #444 <Method void FormatUtils.appendPaddedInteger(StringBuffer, int, int)>
		i -= j * 1000;
	//   67  105:iload_0         
	//   68  106:iload_1         
	//   69  107:sipush          1000
	//   70  110:imul            
	//   71  111:isub            
	//   72  112:istore_0        
		if(i == 0)
	//*  73  113:iload_0         
	//*  74  114:ifne            122
		{
			return stringbuffer.toString();
	//   75  117:aload_2         
	//   76  118:invokevirtual   #445 <Method String StringBuffer.toString()>
	//   77  121:areturn         
		} else
		{
			stringbuffer.append('.');
	//   78  122:aload_2         
	//   79  123:bipush          46
	//   80  125:invokevirtual   #437 <Method StringBuffer StringBuffer.append(char)>
	//   81  128:pop             
			FormatUtils.appendPaddedInteger(stringbuffer, i, 3);
	//   82  129:aload_2         
	//   83  130:iload_0         
	//   84  131:iconst_3        
	//   85  132:invokestatic    #444 <Method void FormatUtils.appendPaddedInteger(StringBuffer, int, int)>
			return stringbuffer.toString();
	//   86  135:aload_2         
	//   87  136:invokevirtual   #445 <Method String StringBuffer.toString()>
	//   88  139:areturn         
		}
	}

	public static void setDefault(DateTimeZone datetimezone)
		throws SecurityException
	{
		SecurityManager securitymanager = System.getSecurityManager();
	//    0    0:invokestatic    #451 <Method SecurityManager System.getSecurityManager()>
	//    1    3:astore_1        
		if(securitymanager != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          22
			securitymanager.checkPermission(((java.security.Permission) (new JodaTimePermission("DateTimeZone.setDefault"))));
	//    4    8:aload_1         
	//    5    9:new             #453 <Class JodaTimePermission>
	//    6   12:dup             
	//    7   13:ldc2            #455 <String "DateTimeZone.setDefault">
	//    8   16:invokespecial   #456 <Method void JodaTimePermission(String)>
	//    9   19:invokevirtual   #462 <Method void SecurityManager.checkPermission(java.security.Permission)>
		if(datetimezone == null)
	//*  10   22:aload_0         
	//*  11   23:ifnonnull       37
			throw new IllegalArgumentException("The datetime zone must not be null");
	//   12   26:new             #58  <Class IllegalArgumentException>
	//   13   29:dup             
	//   14   30:ldc2            #464 <String "The datetime zone must not be null">
	//   15   33:invokespecial   #62  <Method void IllegalArgumentException(String)>
	//   16   36:athrow          
		org/joda/time/DateTimeZone;
	//   17   37:ldc1            #2   <Class DateTimeZone>
		JVM INSTR monitorenter ;
	//   18   39:monitorenter    
		cDefault = datetimezone;
	//   19   40:aload_0         
	//   20   41:putstatic       #342 <Field DateTimeZone cDefault>
		org/joda/time/DateTimeZone;
	//   21   44:ldc1            #2   <Class DateTimeZone>
		JVM INSTR monitorexit ;
	//   22   46:monitorexit     
		return;
	//   23   47:return          
		datetimezone;
	//   24   48:astore_0        
		org/joda/time/DateTimeZone;
	//   25   49:ldc1            #2   <Class DateTimeZone>
		JVM INSTR monitorexit ;
	//   26   51:monitorexit     
		throw datetimezone;
	//   27   52:aload_0         
	//   28   53:athrow          
	}

	public static void setNameProvider(NameProvider nameprovider)
		throws SecurityException
	{
		SecurityManager securitymanager = System.getSecurityManager();
	//    0    0:invokestatic    #451 <Method SecurityManager System.getSecurityManager()>
	//    1    3:astore_1        
		if(securitymanager != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          22
			securitymanager.checkPermission(((java.security.Permission) (new JodaTimePermission("DateTimeZone.setNameProvider"))));
	//    4    8:aload_1         
	//    5    9:new             #453 <Class JodaTimePermission>
	//    6   12:dup             
	//    7   13:ldc2            #467 <String "DateTimeZone.setNameProvider">
	//    8   16:invokespecial   #456 <Method void JodaTimePermission(String)>
	//    9   19:invokevirtual   #462 <Method void SecurityManager.checkPermission(java.security.Permission)>
		setNameProvider0(nameprovider);
	//   10   22:aload_0         
	//   11   23:invokestatic    #51  <Method void setNameProvider0(NameProvider)>
	//   12   26:return          
	}

	private static void setNameProvider0(NameProvider nameprovider)
	{
		NameProvider nameprovider1 = nameprovider;
	//    0    0:aload_0         
	//    1    1:astore_1        
		if(nameprovider == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       10
			nameprovider1 = getDefaultNameProvider();
	//    4    6:invokestatic    #469 <Method NameProvider getDefaultNameProvider()>
	//    5    9:astore_1        
		cNameProvider = nameprovider1;
	//    6   10:aload_1         
	//    7   11:putstatic       #401 <Field NameProvider cNameProvider>
	//    8   14:return          
	}

	public static void setProvider(Provider provider)
		throws SecurityException
	{
		SecurityManager securitymanager = System.getSecurityManager();
	//    0    0:invokestatic    #451 <Method SecurityManager System.getSecurityManager()>
	//    1    3:astore_1        
		if(securitymanager != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          22
			securitymanager.checkPermission(((java.security.Permission) (new JodaTimePermission("DateTimeZone.setProvider"))));
	//    4    8:aload_1         
	//    5    9:new             #453 <Class JodaTimePermission>
	//    6   12:dup             
	//    7   13:ldc2            #472 <String "DateTimeZone.setProvider">
	//    8   16:invokespecial   #456 <Method void JodaTimePermission(String)>
	//    9   19:invokevirtual   #462 <Method void SecurityManager.checkPermission(java.security.Permission)>
		setProvider0(provider);
	//   10   22:aload_0         
	//   11   23:invokestatic    #47  <Method void setProvider0(Provider)>
	//   12   26:return          
	}

	private static void setProvider0(Provider provider)
	{
		Provider provider1 = provider;
	//    0    0:aload_0         
	//    1    1:astore_1        
		if(provider == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       10
			provider1 = getDefaultProvider();
	//    4    6:invokestatic    #474 <Method Provider getDefaultProvider()>
	//    5    9:astore_1        
		provider = ((Provider) (provider1.getAvailableIDs()));
	//    6   10:aload_1         
	//    7   11:invokeinterface #476 <Method Set Provider.getAvailableIDs()>
	//    8   16:astore_0        
		if(provider != null && ((Set) (provider)).size() != 0)
	//*   9   17:aload_0         
	//*  10   18:ifnull          92
	//*  11   21:aload_0         
	//*  12   22:invokeinterface #482 <Method int Set.size()>
	//*  13   27:ifne            33
	//*  14   30:goto            92
		{
			if(!((Set) (provider)).contains("UTC"))
	//*  15   33:aload_0         
	//*  16   34:ldc1            #104 <String "UTC">
	//*  17   36:invokeinterface #485 <Method boolean Set.contains(Object)>
	//*  18   41:ifne            55
				throw new IllegalArgumentException("The provider doesn't support UTC");
	//   19   44:new             #58  <Class IllegalArgumentException>
	//   20   47:dup             
	//   21   48:ldc2            #487 <String "The provider doesn't support UTC">
	//   22   51:invokespecial   #62  <Method void IllegalArgumentException(String)>
	//   23   54:athrow          
			if(!UTC.equals(((Object) (provider1.getZone("UTC")))))
	//*  24   55:getstatic       #43  <Field DateTimeZone UTC>
	//*  25   58:aload_1         
	//*  26   59:ldc1            #104 <String "UTC">
	//*  27   61:invokeinterface #117 <Method DateTimeZone Provider.getZone(String)>
	//*  28   66:invokevirtual   #488 <Method boolean equals(Object)>
	//*  29   69:ifne            83
			{
				throw new IllegalArgumentException("Invalid UTC zone provided");
	//   30   72:new             #58  <Class IllegalArgumentException>
	//   31   75:dup             
	//   32   76:ldc2            #490 <String "Invalid UTC zone provided">
	//   33   79:invokespecial   #62  <Method void IllegalArgumentException(String)>
	//   34   82:athrow          
			} else
			{
				cProvider = provider1;
	//   35   83:aload_1         
	//   36   84:putstatic       #112 <Field Provider cProvider>
				cAvailableIDs = ((Set) (provider));
	//   37   87:aload_0         
	//   38   88:putstatic       #214 <Field Set cAvailableIDs>
				return;
	//   39   91:return          
			}
		} else
		{
			throw new IllegalArgumentException("The provider doesn't have any available ids");
	//   40   92:new             #58  <Class IllegalArgumentException>
	//   41   95:dup             
	//   42   96:ldc2            #492 <String "The provider doesn't have any available ids">
	//   43   99:invokespecial   #62  <Method void IllegalArgumentException(String)>
	//   44  102:athrow          
		}
	}

	public long adjustOffset(long l, boolean flag)
	{
		long l1 = l - 0xa4cb80L;
	//    0    0:lload_1         
	//    1    1:ldc2w           #495 <Long 0xa4cb80L>
	//    2    4:lsub            
	//    3    5:lstore          4
		long l2 = getOffset(l1);
	//    4    7:aload_0         
	//    5    8:lload           4
	//    6   10:invokevirtual   #500 <Method int getOffset(long)>
	//    7   13:i2l             
	//    8   14:lstore          6
		long l3 = getOffset(l + 0xa4cb80L);
	//    9   16:aload_0         
	//   10   17:lload_1         
	//   11   18:ldc2w           #495 <Long 0xa4cb80L>
	//   12   21:ladd            
	//   13   22:invokevirtual   #500 <Method int getOffset(long)>
	//   14   25:i2l             
	//   15   26:lstore          8
		if(l2 <= l3)
	//*  16   28:lload           6
	//*  17   30:lload           8
	//*  18   32:lcmp            
	//*  19   33:ifgt            38
			return l;
	//   20   36:lload_1         
	//   21   37:lreturn         
		l2 -= l3;
	//   22   38:lload           6
	//   23   40:lload           8
	//   24   42:lsub            
	//   25   43:lstore          6
		l1 = nextTransition(l1);
	//   26   45:aload_0         
	//   27   46:lload           4
	//   28   48:invokevirtual   #504 <Method long nextTransition(long)>
	//   29   51:lstore          4
		l3 = l1 - l2;
	//   30   53:lload           4
	//   31   55:lload           6
	//   32   57:lsub            
	//   33   58:lstore          8
		if(l >= l3)
	//*  34   60:lload_1         
	//*  35   61:lload           8
	//*  36   63:lcmp            
	//*  37   64:iflt            116
		{
			if(l >= l1 + l2)
	//*  38   67:lload_1         
	//*  39   68:lload           4
	//*  40   70:lload           6
	//*  41   72:ladd            
	//*  42   73:lcmp            
	//*  43   74:iflt            79
				return l;
	//   44   77:lload_1         
	//   45   78:lreturn         
			if(l - l3 >= l2)
	//*  46   79:lload_1         
	//*  47   80:lload           8
	//*  48   82:lsub            
	//*  49   83:lload           6
	//*  50   85:lcmp            
	//*  51   86:iflt            100
				if(flag)
	//*  52   89:iload_3         
	//*  53   90:ifeq            95
					return l;
	//   54   93:lload_1         
	//   55   94:lreturn         
				else
					return l - l2;
	//   56   95:lload_1         
	//   57   96:lload           6
	//   58   98:lsub            
	//   59   99:lreturn         
			l1 = l;
	//   60  100:lload_1         
	//   61  101:lstore          4
			if(flag)
	//*  62  103:iload_3         
	//*  63  104:ifeq            113
				l1 = l + l2;
	//   64  107:lload_1         
	//   65  108:lload           6
	//   66  110:ladd            
	//   67  111:lstore          4
			return l1;
	//   68  113:lload           4
	//   69  115:lreturn         
		} else
		{
			return l;
	//   70  116:lload_1         
	//   71  117:lreturn         
		}
	}

	public long convertLocalToUTC(long l, boolean flag)
	{
		int i;
label0:
		{
			i = getOffset(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #500 <Method int getOffset(long)>
	//    3    5:istore          4
			long l6 = l - (long)i;
	//    4    7:lload_1         
	//    5    8:iload           4
	//    6   10:i2l             
	//    7   11:lsub            
	//    8   12:lstore          12
			int j = getOffset(l6);
	//    9   14:aload_0         
	//   10   15:lload           12
	//   11   17:invokevirtual   #500 <Method int getOffset(long)>
	//   12   20:istore          5
			if(i != j && (flag || i < 0))
	//*  13   22:iload           4
	//*  14   24:iload           5
	//*  15   26:icmpeq          123
	//*  16   29:iload_3         
	//*  17   30:ifne            38
	//*  18   33:iload           4
	//*  19   35:ifge            123
			{
				long l5 = nextTransition(l6);
	//   20   38:aload_0         
	//   21   39:lload           12
	//   22   41:invokevirtual   #504 <Method long nextTransition(long)>
	//   23   44:lstore          10
				long l3 = 0xffffffffL;
	//   24   46:ldc2w           #506 <Long 0xffffffffL>
	//   25   49:lstore          8
				long l1 = l5;
	//   26   51:lload           10
	//   27   53:lstore          6
				if(l5 == l6)
	//*  28   55:lload           10
	//*  29   57:lload           12
	//*  30   59:lcmp            
	//*  31   60:ifne            68
					l1 = 0xffffffffL;
	//   32   63:ldc2w           #506 <Long 0xffffffffL>
	//   33   66:lstore          6
				l6 = l - (long)j;
	//   34   68:lload_1         
	//   35   69:iload           5
	//   36   71:i2l             
	//   37   72:lsub            
	//   38   73:lstore          12
				l5 = nextTransition(l6);
	//   39   75:aload_0         
	//   40   76:lload           12
	//   41   78:invokevirtual   #504 <Method long nextTransition(long)>
	//   42   81:lstore          10
				if(l5 != l6)
	//*  43   83:lload           10
	//*  44   85:lload           12
	//*  45   87:lcmp            
	//*  46   88:ifne            94
	//*  47   91:goto            98
					l3 = l5;
	//   48   94:lload           10
	//   49   96:lstore          8
				if(l1 != l3)
	//*  50   98:lload           6
	//*  51  100:lload           8
	//*  52  102:lcmp            
	//*  53  103:ifeq            123
				{
					if(flag)
	//*  54  106:iload_3         
	//*  55  107:ifeq            127
						throw new IllegalInstantException(l, getID());
	//   56  110:new             #509 <Class IllegalInstantException>
	//   57  113:dup             
	//   58  114:lload_1         
	//   59  115:aload_0         
	//   60  116:invokevirtual   #510 <Method String getID()>
	//   61  119:invokespecial   #513 <Method void IllegalInstantException(long, String)>
	//   62  122:athrow          
					break label0;
				}
			}
			i = j;
	//   63  123:iload           5
	//   64  125:istore          4
		}
		long l2 = i;
	//   65  127:iload           4
	//   66  129:i2l             
	//   67  130:lstore          6
		long l4 = l - l2;
	//   68  132:lload_1         
	//   69  133:lload           6
	//   70  135:lsub            
	//   71  136:lstore          8
		if((l ^ l4) < 0L && (l ^ l2) < 0L)
	//*  72  138:lload_1         
	//*  73  139:lload           8
	//*  74  141:lxor            
	//*  75  142:lconst_0        
	//*  76  143:lcmp            
	//*  77  144:ifge            167
	//*  78  147:lload_1         
	//*  79  148:lload           6
	//*  80  150:lxor            
	//*  81  151:lconst_0        
	//*  82  152:lcmp            
	//*  83  153:ifge            167
			throw new ArithmeticException("Subtracting time zone offset caused overflow");
	//   84  156:new             #160 <Class ArithmeticException>
	//   85  159:dup             
	//   86  160:ldc2            #515 <String "Subtracting time zone offset caused overflow">
	//   87  163:invokespecial   #516 <Method void ArithmeticException(String)>
	//   88  166:athrow          
		else
			return l4;
	//   89  167:lload           8
	//   90  169:lreturn         
	}

	public long convertLocalToUTC(long l, boolean flag, long l1)
	{
		int i = getOffset(l1);
	//    0    0:aload_0         
	//    1    1:lload           4
	//    2    3:invokevirtual   #500 <Method int getOffset(long)>
	//    3    6:istore          6
		l1 = l - (long)i;
	//    4    8:lload_1         
	//    5    9:iload           6
	//    6   11:i2l             
	//    7   12:lsub            
	//    8   13:lstore          4
		if(getOffset(l1) == i)
	//*   9   15:aload_0         
	//*  10   16:lload           4
	//*  11   18:invokevirtual   #500 <Method int getOffset(long)>
	//*  12   21:iload           6
	//*  13   23:icmpne          29
			return l1;
	//   14   26:lload           4
	//   15   28:lreturn         
		else
			return convertLocalToUTC(l, flag);
	//   16   29:aload_0         
	//   17   30:lload_1         
	//   18   31:iload_3         
	//   19   32:invokevirtual   #519 <Method long convertLocalToUTC(long, boolean)>
	//   20   35:lreturn         
	}

	public long convertUTCToLocal(long l)
	{
		long l1 = getOffset(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #500 <Method int getOffset(long)>
	//    3    5:i2l             
	//    4    6:lstore_3        
		long l2 = l + l1;
	//    5    7:lload_1         
	//    6    8:lload_3         
	//    7    9:ladd            
	//    8   10:lstore          5
		if((l ^ l2) < 0L && (l ^ l1) >= 0L)
	//*   9   12:lload_1         
	//*  10   13:lload           5
	//*  11   15:lxor            
	//*  12   16:lconst_0        
	//*  13   17:lcmp            
	//*  14   18:ifge            40
	//*  15   21:lload_1         
	//*  16   22:lload_3         
	//*  17   23:lxor            
	//*  18   24:lconst_0        
	//*  19   25:lcmp            
	//*  20   26:iflt            40
			throw new ArithmeticException("Adding time zone offset caused overflow");
	//   21   29:new             #160 <Class ArithmeticException>
	//   22   32:dup             
	//   23   33:ldc2            #522 <String "Adding time zone offset caused overflow">
	//   24   36:invokespecial   #516 <Method void ArithmeticException(String)>
	//   25   39:athrow          
		else
			return l2;
	//   26   40:lload           5
	//   27   42:lreturn         
	}

	public abstract boolean equals(Object obj);

	public final String getID()
	{
		return iID;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field String iID>
	//    2    4:areturn         
	}

	public long getMillisKeepLocal(DateTimeZone datetimezone, long l)
	{
		DateTimeZone datetimezone1 = datetimezone;
	//    0    0:aload_1         
	//    1    1:astore          4
		if(datetimezone == null)
	//*   2    3:aload_1         
	//*   3    4:ifnonnull       12
			datetimezone1 = getDefault();
	//    4    7:invokestatic    #103 <Method DateTimeZone getDefault()>
	//    5   10:astore          4
		if(datetimezone1 == this)
	//*   6   12:aload           4
	//*   7   14:aload_0         
	//*   8   15:if_acmpne       20
			return l;
	//    9   18:lload_2         
	//   10   19:lreturn         
		else
			return datetimezone1.convertLocalToUTC(convertUTCToLocal(l), false, l);
	//   11   20:aload           4
	//   12   22:aload_0         
	//   13   23:lload_2         
	//   14   24:invokevirtual   #527 <Method long convertUTCToLocal(long)>
	//   15   27:iconst_0        
	//   16   28:lload_2         
	//   17   29:invokevirtual   #529 <Method long convertLocalToUTC(long, boolean, long)>
	//   18   32:lreturn         
	}

	public final String getName(long l)
	{
		return getName(l, ((Locale) (null)));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #534 <Method String getName(long, Locale)>
	//    4    6:areturn         
	}

	public String getName(long l, Locale locale)
	{
		Locale locale1 = locale;
	//    0    0:aload_3         
	//    1    1:astore          4
		if(locale == null)
	//*   2    3:aload_3         
	//*   3    4:ifnonnull       12
			locale1 = Locale.getDefault();
	//    4    7:invokestatic    #539 <Method Locale Locale.getDefault()>
	//    5   10:astore          4
		locale = ((Locale) (getNameKey(l)));
	//    6   12:aload_0         
	//    7   13:lload_1         
	//    8   14:invokevirtual   #542 <Method String getNameKey(long)>
	//    9   17:astore_3        
		if(locale == null)
	//*  10   18:aload_3         
	//*  11   19:ifnonnull       27
			return iID;
	//   12   22:aload_0         
	//   13   23:getfield        #64  <Field String iID>
	//   14   26:areturn         
		locale = ((Locale) (cNameProvider.getName(locale1, iID, ((String) (locale)))));
	//   15   27:getstatic       #401 <Field NameProvider cNameProvider>
	//   16   30:aload           4
	//   17   32:aload_0         
	//   18   33:getfield        #64  <Field String iID>
	//   19   36:aload_3         
	//   20   37:invokeinterface #545 <Method String NameProvider.getName(Locale, String, String)>
	//   21   42:astore_3        
		if(locale != null)
	//*  22   43:aload_3         
	//*  23   44:ifnull          49
			return ((String) (locale));
	//   24   47:aload_3         
	//   25   48:areturn         
		else
			return printOffset(getOffset(l));
	//   26   49:aload_0         
	//   27   50:lload_1         
	//   28   51:invokevirtual   #500 <Method int getOffset(long)>
	//   29   54:invokestatic    #148 <Method String printOffset(int)>
	//   30   57:areturn         
	}

	public abstract String getNameKey(long l);

	public abstract int getOffset(long l);

	public final int getOffset(ReadableInstant readableinstant)
	{
		if(readableinstant == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
			return getOffset(DateTimeUtils.currentTimeMillis());
	//    2    4:aload_0         
	//    3    5:invokestatic    #552 <Method long DateTimeUtils.currentTimeMillis()>
	//    4    8:invokevirtual   #500 <Method int getOffset(long)>
	//    5   11:ireturn         
		else
			return getOffset(readableinstant.getMillis());
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokeinterface #557 <Method long ReadableInstant.getMillis()>
	//    9   19:invokevirtual   #500 <Method int getOffset(long)>
	//   10   22:ireturn         
	}

	public int getOffsetFromLocal(long l)
	{
		int i = getOffset(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #500 <Method int getOffset(long)>
	//    3    5:istore_3        
		long l3 = l - (long)i;
	//    4    6:lload_1         
	//    5    7:iload_3         
	//    6    8:i2l             
	//    7    9:lsub            
	//    8   10:lstore          10
		int j = getOffset(l3);
	//    9   12:aload_0         
	//   10   13:lload           10
	//   11   15:invokevirtual   #500 <Method int getOffset(long)>
	//   12   18:istore          4
		if(i != j)
	//*  13   20:iload_3         
	//*  14   21:iload           4
	//*  15   23:icmpeq          97
		{
			if(i - j < 0)
	//*  16   26:iload_3         
	//*  17   27:iload           4
	//*  18   29:isub            
	//*  19   30:ifge            138
			{
				long l2 = nextTransition(l3);
	//   20   33:aload_0         
	//   21   34:lload           10
	//   22   36:invokevirtual   #504 <Method long nextTransition(long)>
	//   23   39:lstore          8
				long l1 = l2;
	//   24   41:lload           8
	//   25   43:lstore          6
				if(l2 == l3)
	//*  26   45:lload           8
	//*  27   47:lload           10
	//*  28   49:lcmp            
	//*  29   50:ifne            58
					l1 = 0xffffffffL;
	//   30   53:ldc2w           #506 <Long 0xffffffffL>
	//   31   56:lstore          6
				l3 = l - (long)j;
	//   32   58:lload_1         
	//   33   59:iload           4
	//   34   61:i2l             
	//   35   62:lsub            
	//   36   63:lstore          10
				l2 = nextTransition(l3);
	//   37   65:aload_0         
	//   38   66:lload           10
	//   39   68:invokevirtual   #504 <Method long nextTransition(long)>
	//   40   71:lstore          8
				l = l2;
	//   41   73:lload           8
	//   42   75:lstore_1        
				if(l2 == l3)
	//*  43   76:lload           8
	//*  44   78:lload           10
	//*  45   80:lcmp            
	//*  46   81:ifne            88
					l = 0xffffffffL;
	//   47   84:ldc2w           #506 <Long 0xffffffffL>
	//   48   87:lstore_1        
				if(l1 != l)
	//*  49   88:lload           6
	//*  50   90:lload_1         
	//*  51   91:lcmp            
	//*  52   92:ifeq            138
					return i;
	//   53   95:iload_3         
	//   54   96:ireturn         
			}
		} else
		if(i >= 0)
	//*  55   97:iload_3         
	//*  56   98:iflt            138
		{
			l = previousTransition(l3);
	//   57  101:aload_0         
	//   58  102:lload           10
	//   59  104:invokevirtual   #561 <Method long previousTransition(long)>
	//   60  107:lstore_1        
			if(l < l3)
	//*  61  108:lload_1         
	//*  62  109:lload           10
	//*  63  111:lcmp            
	//*  64  112:ifge            138
			{
				int k = getOffset(l);
	//   65  115:aload_0         
	//   66  116:lload_1         
	//   67  117:invokevirtual   #500 <Method int getOffset(long)>
	//   68  120:istore          5
				if(l3 - l <= (long)(k - i))
	//*  69  122:lload           10
	//*  70  124:lload_1         
	//*  71  125:lsub            
	//*  72  126:iload           5
	//*  73  128:iload_3         
	//*  74  129:isub            
	//*  75  130:i2l             
	//*  76  131:lcmp            
	//*  77  132:ifgt            138
					return k;
	//   78  135:iload           5
	//   79  137:ireturn         
			}
		}
		return j;
	//   80  138:iload           4
	//   81  140:ireturn         
	}

	public final String getShortName(long l)
	{
		return getShortName(l, ((Locale) (null)));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #564 <Method String getShortName(long, Locale)>
	//    4    6:areturn         
	}

	public String getShortName(long l, Locale locale)
	{
		Locale locale1 = locale;
	//    0    0:aload_3         
	//    1    1:astore          4
		if(locale == null)
	//*   2    3:aload_3         
	//*   3    4:ifnonnull       12
			locale1 = Locale.getDefault();
	//    4    7:invokestatic    #539 <Method Locale Locale.getDefault()>
	//    5   10:astore          4
		locale = ((Locale) (getNameKey(l)));
	//    6   12:aload_0         
	//    7   13:lload_1         
	//    8   14:invokevirtual   #542 <Method String getNameKey(long)>
	//    9   17:astore_3        
		if(locale == null)
	//*  10   18:aload_3         
	//*  11   19:ifnonnull       27
			return iID;
	//   12   22:aload_0         
	//   13   23:getfield        #64  <Field String iID>
	//   14   26:areturn         
		locale = ((Locale) (cNameProvider.getShortName(locale1, iID, ((String) (locale)))));
	//   15   27:getstatic       #401 <Field NameProvider cNameProvider>
	//   16   30:aload           4
	//   17   32:aload_0         
	//   18   33:getfield        #64  <Field String iID>
	//   19   36:aload_3         
	//   20   37:invokeinterface #566 <Method String NameProvider.getShortName(Locale, String, String)>
	//   21   42:astore_3        
		if(locale != null)
	//*  22   43:aload_3         
	//*  23   44:ifnull          49
			return ((String) (locale));
	//   24   47:aload_3         
	//   25   48:areturn         
		else
			return printOffset(getOffset(l));
	//   26   49:aload_0         
	//   27   50:lload_1         
	//   28   51:invokevirtual   #500 <Method int getOffset(long)>
	//   29   54:invokestatic    #148 <Method String printOffset(int)>
	//   30   57:areturn         
	}

	public abstract int getStandardOffset(long l);

	public int hashCode()
	{
		return 57 + getID().hashCode();
	//    0    0:bipush          57
	//    1    2:aload_0         
	//    2    3:invokevirtual   #510 <Method String getID()>
	//    3    6:invokevirtual   #570 <Method int String.hashCode()>
	//    4    9:iadd            
	//    5   10:ireturn         
	}

	public abstract boolean isFixed();

	public boolean isLocalDateTimeGap(LocalDateTime localdatetime)
	{
		if(isFixed())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #576 <Method boolean isFixed()>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		try
		{
			localdatetime.toDateTime(this);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #582 <Method DateTime LocalDateTime.toDateTime(DateTimeZone)>
	//    8   14:pop             
		}
	//*   9   15:iconst_0        
	//*  10   16:ireturn         
	//*  11   17:iconst_1        
	//*  12   18:ireturn         
		// Misplaced declaration of an exception variable
		catch(LocalDateTime localdatetime)
		{
			return true;
		}
		return false;
	//*  13   19:astore_1        
	//*  14   20:goto            17
	}

	public boolean isStandardOffset(long l)
	{
		return getOffset(l) == getStandardOffset(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #500 <Method int getOffset(long)>
	//    3    5:aload_0         
	//    4    6:lload_1         
	//    5    7:invokevirtual   #586 <Method int getStandardOffset(long)>
	//    6   10:icmpne          15
	//    7   13:iconst_1        
	//    8   14:ireturn         
	//    9   15:iconst_0        
	//   10   16:ireturn         
	}

	public abstract long nextTransition(long l);

	public abstract long previousTransition(long l);

	public String toString()
	{
		return getID();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #510 <Method String getID()>
	//    2    4:areturn         
	}

	public TimeZone toTimeZone()
	{
		return TimeZone.getTimeZone(iID);
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field String iID>
	//    2    4:invokestatic    #591 <Method TimeZone TimeZone.getTimeZone(String)>
	//    3    7:areturn         
	}

	protected Object writeReplace()
		throws ObjectStreamException
	{
	/* block-local class not found */
	class Stub {}

		return ((Object) (new Stub(iID)));
	//    0    0:new             #8   <Class DateTimeZone$Stub>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #64  <Field String iID>
	//    4    8:invokespecial   #595 <Method void DateTimeZone$Stub(String)>
	//    5   11:areturn         
	}

	private static final int MAX_MILLIS = 0x5265bff;
	public static final DateTimeZone UTC;
	private static Set cAvailableIDs;
	private static volatile DateTimeZone cDefault;
	private static NameProvider cNameProvider;
	private static DateTimeFormatter cOffsetFormatter;
	private static Provider cProvider;
	private static Map cZoneIdConversion;
	private static Map iFixedOffsetCache;
	private static final long serialVersionUID = 0x9479892aL;
	private final String iID;

	static 
	{
		UTC = UTCDateTimeZone.INSTANCE;
	//    0    0:getstatic       #41  <Field DateTimeZone UTCDateTimeZone.INSTANCE>
	//    1    3:putstatic       #43  <Field DateTimeZone UTC>
		setProvider0(((Provider) (null)));
	//    2    6:aconst_null     
	//    3    7:invokestatic    #47  <Method void setProvider0(Provider)>
		setNameProvider0(((NameProvider) (null)));
	//    4   10:aconst_null     
	//    5   11:invokestatic    #51  <Method void setNameProvider0(NameProvider)>
	//*   6   14:return          
	}

	/* member class not found */
	class _cls1 {}

}
