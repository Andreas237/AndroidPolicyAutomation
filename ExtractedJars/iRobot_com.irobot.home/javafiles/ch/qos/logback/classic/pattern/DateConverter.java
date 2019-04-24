// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.util.CachingDateFormatter;
import java.util.*;

// Referenced classes of package ch.qos.logback.classic.pattern:
//			ClassicConverter

public class DateConverter extends ClassicConverter
{

	public DateConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void ClassicConverter()>
		cachingDateFormatter = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #12  <Field CachingDateFormatter cachingDateFormatter>
	//    5    9:return          
	}

	private Locale parseLocale(String s)
	{
		s = ((String) (s.split(",")));
	//    0    0:aload_1         
	//    1    1:ldc1            #17  <String ",">
	//    2    3:invokevirtual   #23  <Method String[] String.split(String)>
	//    3    6:astore_1        
		if(s.length > 1)
	//*   4    7:aload_1         
	//*   5    8:arraylength     
	//*   6    9:iconst_1        
	//*   7   10:icmple          27
			return new Locale(((String) (s[0])), ((String) (s[1])));
	//    8   13:new             #25  <Class Locale>
	//    9   16:dup             
	//   10   17:aload_1         
	//   11   18:iconst_0        
	//   12   19:aaload          
	//   13   20:aload_1         
	//   14   21:iconst_1        
	//   15   22:aaload          
	//   16   23:invokespecial   #28  <Method void Locale(String, String)>
	//   17   26:areturn         
		else
			return new Locale(((String) (s[0])));
	//   18   27:new             #25  <Class Locale>
	//   19   30:dup             
	//   20   31:aload_1         
	//   21   32:iconst_0        
	//   22   33:aaload          
	//   23   34:invokespecial   #31  <Method void Locale(String)>
	//   24   37:areturn         
	}

	public String convert(ILoggingEvent iloggingevent)
	{
		long l = iloggingevent.getTimeStamp();
	//    0    0:aload_1         
	//    1    1:invokeinterface #39  <Method long ILoggingEvent.getTimeStamp()>
	//    2    6:lstore_2        
		return cachingDateFormatter.format(l);
	//    3    7:aload_0         
	//    4    8:getfield        #12  <Field CachingDateFormatter cachingDateFormatter>
	//    5   11:lload_2         
	//    6   12:invokevirtual   #45  <Method String CachingDateFormatter.format(long)>
	//    7   15:areturn         
	}

	public volatile String convert(Object obj)
	{
		return convert((ILoggingEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #35  <Class ILoggingEvent>
	//    3    5:invokevirtual   #48  <Method String convert(ILoggingEvent)>
	//    4    8:areturn         
	}

	public void start()
	{
		String s = getFirstOption();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #55  <Method String getFirstOption()>
	//    2    4:astore_2        
		Object obj = ((Object) (s));
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(s == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       14
			obj = "yyyy-MM-dd HH:mm:ss,SSS";
	//    7   11:ldc1            #57  <String "yyyy-MM-dd HH:mm:ss,SSS">
	//    8   13:astore_1        
		s = ((String) (obj));
	//    9   14:aload_1         
	//   10   15:astore_2        
		if(((String) (obj)).equals("ISO8601"))
	//*  11   16:aload_1         
	//*  12   17:ldc1            #59  <String "ISO8601">
	//*  13   19:invokevirtual   #63  <Method boolean String.equals(Object)>
	//*  14   22:ifeq            28
			s = "yyyy-MM-dd HH:mm:ss,SSS";
	//   15   25:ldc1            #57  <String "yyyy-MM-dd HH:mm:ss,SSS">
	//   16   27:astore_2        
		obj = ((Object) (TimeZone.getDefault()));
	//   17   28:invokestatic    #69  <Method TimeZone TimeZone.getDefault()>
	//   18   31:astore_1        
		Locale locale1 = Locale.ENGLISH;
	//   19   32:getstatic       #73  <Field Locale Locale.ENGLISH>
	//   20   35:astore          5
		List list = getOptionList();
	//   21   37:aload_0         
	//   22   38:invokevirtual   #77  <Method List getOptionList()>
	//   23   41:astore          6
		TimeZone timezone = ((TimeZone) (obj));
	//   24   43:aload_1         
	//   25   44:astore_3        
		Locale locale = locale1;
	//   26   45:aload           5
	//   27   47:astore          4
		if(list != null)
	//*  28   49:aload           6
	//*  29   51:ifnull          116
		{
			if(list.size() > 1)
	//*  30   54:aload           6
	//*  31   56:invokeinterface #83  <Method int List.size()>
	//*  32   61:iconst_1        
	//*  33   62:icmple          80
				obj = ((Object) (TimeZone.getTimeZone((String)list.get(1))));
	//   34   65:aload           6
	//   35   67:iconst_1        
	//   36   68:invokeinterface #87  <Method Object List.get(int)>
	//   37   73:checkcast       #19  <Class String>
	//   38   76:invokestatic    #91  <Method TimeZone TimeZone.getTimeZone(String)>
	//   39   79:astore_1        
			timezone = ((TimeZone) (obj));
	//   40   80:aload_1         
	//   41   81:astore_3        
			locale = locale1;
	//   42   82:aload           5
	//   43   84:astore          4
			if(list.size() > 2)
	//*  44   86:aload           6
	//*  45   88:invokeinterface #83  <Method int List.size()>
	//*  46   93:iconst_2        
	//*  47   94:icmple          116
			{
				locale = parseLocale((String)list.get(2));
	//   48   97:aload_0         
	//   49   98:aload           6
	//   50  100:iconst_2        
	//   51  101:invokeinterface #87  <Method Object List.get(int)>
	//   52  106:checkcast       #19  <Class String>
	//   53  109:invokespecial   #93  <Method Locale parseLocale(String)>
	//   54  112:astore          4
				timezone = ((TimeZone) (obj));
	//   55  114:aload_1         
	//   56  115:astore_3        
			}
		}
		try
		{
			cachingDateFormatter = new CachingDateFormatter(s, locale);
	//   57  116:aload_0         
	//   58  117:new             #41  <Class CachingDateFormatter>
	//   59  120:dup             
	//   60  121:aload_2         
	//   61  122:aload           4
	//   62  124:invokespecial   #96  <Method void CachingDateFormatter(String, Locale)>
	//   63  127:putfield        #12  <Field CachingDateFormatter cachingDateFormatter>
		}
	//*  64  130:goto            183
		catch(IllegalArgumentException illegalargumentexception)
	//*  65  133:astore_1        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   66  134:new             #98  <Class StringBuilder>
	//   67  137:dup             
	//   68  138:invokespecial   #99  <Method void StringBuilder()>
	//   69  141:astore          5
			stringbuilder.append("Could not instantiate SimpleDateFormat with pattern ");
	//   70  143:aload           5
	//   71  145:ldc1            #101 <String "Could not instantiate SimpleDateFormat with pattern ">
	//   72  147:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   73  150:pop             
			stringbuilder.append(s);
	//   74  151:aload           5
	//   75  153:aload_2         
	//   76  154:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   77  157:pop             
			addWarn(stringbuilder.toString(), ((Throwable) (illegalargumentexception)));
	//   78  158:aload_0         
	//   79  159:aload           5
	//   80  161:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   81  164:aload_1         
	//   82  165:invokevirtual   #112 <Method void addWarn(String, Throwable)>
			cachingDateFormatter = new CachingDateFormatter("yyyy-MM-dd HH:mm:ss,SSS", locale);
	//   83  168:aload_0         
	//   84  169:new             #41  <Class CachingDateFormatter>
	//   85  172:dup             
	//   86  173:ldc1            #57  <String "yyyy-MM-dd HH:mm:ss,SSS">
	//   87  175:aload           4
	//   88  177:invokespecial   #96  <Method void CachingDateFormatter(String, Locale)>
	//   89  180:putfield        #12  <Field CachingDateFormatter cachingDateFormatter>
		}
		cachingDateFormatter.setTimeZone(timezone);
	//   90  183:aload_0         
	//   91  184:getfield        #12  <Field CachingDateFormatter cachingDateFormatter>
	//   92  187:aload_3         
	//   93  188:invokevirtual   #116 <Method void CachingDateFormatter.setTimeZone(TimeZone)>
	//   94  191:return          
	}

	CachingDateFormatter cachingDateFormatter;
}
