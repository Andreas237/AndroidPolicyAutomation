// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.pattern.DynamicConverter;
import ch.qos.logback.core.util.CachingDateFormatter;
import ch.qos.logback.core.util.DatePatternToRegexUtil;
import java.util.Date;
import java.util.List;

// Referenced classes of package ch.qos.logback.core.rolling.helper:
//			MonoTypedConverter

public class DateTokenConverter extends DynamicConverter
	implements MonoTypedConverter
{

	public DateTokenConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void DynamicConverter()>
		primary = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #28  <Field boolean primary>
	//    5    9:return          
	}

	public String convert(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("Null argument forbidden");
	//    2    4:new             #33  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #35  <String "Null argument forbidden">
	//    5   10:invokespecial   #38  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		if(obj instanceof Date)
	//*   7   14:aload_1         
	//*   8   15:instanceof      #40  <Class Date>
	//*   9   18:ifeq            30
		{
			return convert((Date)obj);
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:checkcast       #40  <Class Date>
	//   13   26:invokevirtual   #43  <Method String convert(Date)>
	//   14   29:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   15   30:new             #45  <Class StringBuilder>
	//   16   33:dup             
	//   17   34:invokespecial   #46  <Method void StringBuilder()>
	//   18   37:astore_2        
			stringbuilder.append("Cannot convert ");
	//   19   38:aload_2         
	//   20   39:ldc1            #48  <String "Cannot convert ">
	//   21   41:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   22   44:pop             
			stringbuilder.append(obj);
	//   23   45:aload_2         
	//   24   46:aload_1         
	//   25   47:invokevirtual   #55  <Method StringBuilder StringBuilder.append(Object)>
	//   26   50:pop             
			stringbuilder.append(" of type");
	//   27   51:aload_2         
	//   28   52:ldc1            #57  <String " of type">
	//   29   54:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   30   57:pop             
			stringbuilder.append(obj.getClass().getName());
	//   31   58:aload_2         
	//   32   59:aload_1         
	//   33   60:invokevirtual   #63  <Method Class Object.getClass()>
	//   34   63:invokevirtual   #69  <Method String Class.getName()>
	//   35   66:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   36   69:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   37   70:new             #33  <Class IllegalArgumentException>
	//   38   73:dup             
	//   39   74:aload_2         
	//   40   75:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   41   78:invokespecial   #38  <Method void IllegalArgumentException(String)>
	//   42   81:athrow          
		}
	}

	public String convert(Date date)
	{
		return cdf.format(date.getTime());
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field CachingDateFormatter cdf>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #78  <Method long Date.getTime()>
	//    4    8:invokevirtual   #84  <Method String CachingDateFormatter.format(long)>
	//    5   11:areturn         
	}

	public String getDatePattern()
	{
		return datePattern;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field String datePattern>
	//    2    4:areturn         
	}

	public boolean isApplicable(Object obj)
	{
		return obj instanceof Date;
	//    0    0:aload_1         
	//    1    1:instanceof      #40  <Class Date>
	//    2    4:ireturn         
	}

	public boolean isPrimary()
	{
		return primary;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field boolean primary>
	//    2    4:ireturn         
	}

	public void start()
	{
		datePattern = getFirstOption();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #95  <Method String getFirstOption()>
	//    3    5:putfield        #87  <Field String datePattern>
		if(datePattern == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #87  <Field String datePattern>
	//*   6   12:ifnonnull       21
			datePattern = "yyyy-MM-dd";
	//    7   15:aload_0         
	//    8   16:ldc1            #17  <String "yyyy-MM-dd">
	//    9   18:putfield        #87  <Field String datePattern>
		List list = getOptionList();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #99  <Method List getOptionList()>
	//   12   25:astore_1        
		if(list != null && list.size() > 1 && "AUX".equalsIgnoreCase((String)list.get(1)))
	//*  13   26:aload_1         
	//*  14   27:ifnull          63
	//*  15   30:aload_1         
	//*  16   31:invokeinterface #105 <Method int List.size()>
	//*  17   36:iconst_1        
	//*  18   37:icmple          63
	//*  19   40:ldc1            #11  <String "AUX">
	//*  20   42:aload_1         
	//*  21   43:iconst_1        
	//*  22   44:invokeinterface #109 <Method Object List.get(int)>
	//*  23   49:checkcast       #111 <Class String>
	//*  24   52:invokevirtual   #115 <Method boolean String.equalsIgnoreCase(String)>
	//*  25   55:ifeq            63
			primary = false;
	//   26   58:aload_0         
	//   27   59:iconst_0        
	//   28   60:putfield        #28  <Field boolean primary>
		cdf = new CachingDateFormatter(datePattern);
	//   29   63:aload_0         
	//   30   64:new             #80  <Class CachingDateFormatter>
	//   31   67:dup             
	//   32   68:aload_0         
	//   33   69:getfield        #87  <Field String datePattern>
	//   34   72:invokespecial   #116 <Method void CachingDateFormatter(String)>
	//   35   75:putfield        #74  <Field CachingDateFormatter cdf>
	//   36   78:return          
	}

	public String toRegex()
	{
		return (new DatePatternToRegexUtil(datePattern)).toRegex();
	//    0    0:new             #119 <Class DatePatternToRegexUtil>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #87  <Field String datePattern>
	//    4    8:invokespecial   #120 <Method void DatePatternToRegexUtil(String)>
	//    5   11:invokevirtual   #122 <Method String DatePatternToRegexUtil.toRegex()>
	//    6   14:areturn         
	}

	public static final String AUXILIARY_TOKEN = "AUX";
	public static final String CONVERTER_KEY = "d";
	public static final String DEFAULT_DATE_PATTERN = "yyyy-MM-dd";
	private CachingDateFormatter cdf;
	private String datePattern;
	private boolean primary;
}
