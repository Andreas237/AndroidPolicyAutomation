// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import java.text.SimpleDateFormat;
import java.util.*;

// Referenced classes of package bo.app:
//			r

public final class dl
{

	public dl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void Object()>
	//    2    4:return          
	}

	public static long a()
	{
		return System.currentTimeMillis() / 1000L;
	//    0    0:invokestatic    #58  <Method long System.currentTimeMillis()>
	//    1    3:ldc2w           #59  <Long 1000L>
	//    2    6:ldiv            
	//    3    7:lreturn         
	}

	public static long a(Date date)
	{
		return date.getTime() / 1000L;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method long Date.getTime()>
	//    2    4:ldc2w           #59  <Long 1000L>
	//    3    7:ldiv            
	//    4    8:lreturn         
	}

	public static String a(Date date, r r1)
	{
		Object obj = ((Object) (r1));
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(!c.contains(((Object) (r1))))
	//*   2    2:getstatic       #48  <Field EnumSet c>
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #71  <Method boolean EnumSet.contains(Object)>
	//*   5    9:ifne            65
		{
			obj = ((Object) (a));
	//    6   12:getstatic       #21  <Field String a>
	//    7   15:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    8   16:new             #73  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #74  <Method void StringBuilder()>
	//   11   23:astore_3        
			stringbuilder.append("Unsupported date format: ");
	//   12   24:aload_3         
	//   13   25:ldc1            #76  <String "Unsupported date format: ">
	//   14   27:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
			stringbuilder.append(((Object) (r1)));
	//   16   31:aload_3         
	//   17   32:aload_1         
	//   18   33:invokevirtual   #83  <Method StringBuilder StringBuilder.append(Object)>
	//   19   36:pop             
			stringbuilder.append(". Defaulting to ");
	//   20   37:aload_3         
	//   21   38:ldc1            #85  <String ". Defaulting to ">
	//   22   40:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
			stringbuilder.append(((Object) (r.b)));
	//   24   44:aload_3         
	//   25   45:getstatic       #38  <Field r r.b>
	//   26   48:invokevirtual   #83  <Method StringBuilder StringBuilder.append(Object)>
	//   27   51:pop             
			AppboyLogger.w(((String) (obj)), stringbuilder.toString());
	//   28   52:aload_2         
	//   29   53:aload_3         
	//   30   54:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   31   57:invokestatic    #93  <Method int AppboyLogger.w(String, String)>
	//   32   60:pop             
			obj = ((Object) (r.b));
	//   33   61:getstatic       #38  <Field r r.b>
	//   34   64:astore_2        
		}
		r1 = ((r) (new SimpleDateFormat(((r) (obj)).a(), Locale.US)));
	//   35   65:new             #95  <Class SimpleDateFormat>
	//   36   68:dup             
	//   37   69:aload_2         
	//   38   70:invokevirtual   #97  <Method String r.a()>
	//   39   73:getstatic       #103 <Field Locale Locale.US>
	//   40   76:invokespecial   #106 <Method void SimpleDateFormat(String, Locale)>
	//   41   79:astore_1        
		((SimpleDateFormat) (r1)).setTimeZone(b);
	//   42   80:aload_1         
	//   43   81:getstatic       #31  <Field TimeZone b>
	//   44   84:invokevirtual   #110 <Method void SimpleDateFormat.setTimeZone(TimeZone)>
		return ((SimpleDateFormat) (r1)).format(date);
	//   45   87:aload_1         
	//   46   88:aload_0         
	//   47   89:invokevirtual   #114 <Method String SimpleDateFormat.format(Date)>
	//   48   92:areturn         
	}

	public static Date a(int i, int j, int k)
	{
		return a(i, j, k, 0, 0, 0);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:iconst_0        
	//    5    5:iconst_0        
	//    6    6:invokestatic    #118 <Method Date a(int, int, int, int, int, int)>
	//    7    9:areturn         
	}

	public static Date a(int i, int j, int k, int l, int i1, int j1)
	{
		GregorianCalendar gregoriancalendar = new GregorianCalendar(i, j, k, l, i1, j1);
	//    0    0:new             #120 <Class GregorianCalendar>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:iload           4
	//    7   10:iload           5
	//    8   12:invokespecial   #123 <Method void GregorianCalendar(int, int, int, int, int, int)>
	//    9   15:astore          6
		((Calendar) (gregoriancalendar)).setTimeZone(b);
	//   10   17:aload           6
	//   11   19:getstatic       #31  <Field TimeZone b>
	//   12   22:invokevirtual   #126 <Method void Calendar.setTimeZone(TimeZone)>
		return ((Calendar) (gregoriancalendar)).getTime();
	//   13   25:aload           6
	//   14   27:invokevirtual   #129 <Method Date Calendar.getTime()>
	//   15   30:areturn         
	}

	public static Date a(long l)
	{
		return new Date(l * 1000L);
	//    0    0:new             #63  <Class Date>
	//    1    3:dup             
	//    2    4:lload_0         
	//    3    5:ldc2w           #59  <Long 1000L>
	//    4    8:lmul            
	//    5    9:invokespecial   #133 <Method void Date(long)>
	//    6   12:areturn         
	}

	public static Date a(String s, r r1)
	{
		if(StringUtils.isNullOrBlank(s))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #142 <Method boolean StringUtils.isNullOrBlank(String)>
	//*   2    4:ifeq            43
		{
			r1 = ((r) (a));
	//    3    7:getstatic       #21  <Field String a>
	//    4   10:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #73  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #74  <Method void StringBuilder()>
	//    8   18:astore_2        
			stringbuilder.append("Null or blank date string received: ");
	//    9   19:aload_2         
	//   10   20:ldc1            #144 <String "Null or blank date string received: ">
	//   11   22:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
			stringbuilder.append(s);
	//   13   26:aload_2         
	//   14   27:aload_0         
	//   15   28:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
			AppboyLogger.w(((String) (r1)), stringbuilder.toString());
	//   17   32:aload_1         
	//   18   33:aload_2         
	//   19   34:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   20   37:invokestatic    #93  <Method int AppboyLogger.w(String, String)>
	//   21   40:pop             
			return null;
	//   22   41:aconst_null     
	//   23   42:areturn         
		}
		if(!c.contains(((Object) (r1))))
	//*  24   43:getstatic       #48  <Field EnumSet c>
	//*  25   46:aload_1         
	//*  26   47:invokevirtual   #71  <Method boolean EnumSet.contains(Object)>
	//*  27   50:ifne            89
		{
			s = a;
	//   28   53:getstatic       #21  <Field String a>
	//   29   56:astore_0        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   30   57:new             #73  <Class StringBuilder>
	//   31   60:dup             
	//   32   61:invokespecial   #74  <Method void StringBuilder()>
	//   33   64:astore_2        
			stringbuilder1.append("Unsupported date format. Returning null. Got date format: ");
	//   34   65:aload_2         
	//   35   66:ldc1            #146 <String "Unsupported date format. Returning null. Got date format: ">
	//   36   68:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   37   71:pop             
			stringbuilder1.append(((Object) (r1)));
	//   38   72:aload_2         
	//   39   73:aload_1         
	//   40   74:invokevirtual   #83  <Method StringBuilder StringBuilder.append(Object)>
	//   41   77:pop             
			AppboyLogger.w(s, stringbuilder1.toString());
	//   42   78:aload_0         
	//   43   79:aload_2         
	//   44   80:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   45   83:invokestatic    #93  <Method int AppboyLogger.w(String, String)>
	//   46   86:pop             
			return null;
	//   47   87:aconst_null     
	//   48   88:areturn         
		}
		r1 = ((r) (new SimpleDateFormat(r1.a(), Locale.US)));
	//   49   89:new             #95  <Class SimpleDateFormat>
	//   50   92:dup             
	//   51   93:aload_1         
	//   52   94:invokevirtual   #97  <Method String r.a()>
	//   53   97:getstatic       #103 <Field Locale Locale.US>
	//   54  100:invokespecial   #106 <Method void SimpleDateFormat(String, Locale)>
	//   55  103:astore_1        
		((SimpleDateFormat) (r1)).setTimeZone(b);
	//   56  104:aload_1         
	//   57  105:getstatic       #31  <Field TimeZone b>
	//   58  108:invokevirtual   #110 <Method void SimpleDateFormat.setTimeZone(TimeZone)>
		try
		{
			r1 = ((r) (((SimpleDateFormat) (r1)).parse(s)));
	//   59  111:aload_1         
	//   60  112:aload_0         
	//   61  113:invokevirtual   #150 <Method Date SimpleDateFormat.parse(String)>
	//   62  116:astore_1        
		}
	//*  63  117:aload_1         
	//*  64  118:areturn         
		// Misplaced declaration of an exception variable
		catch(r r1)
	//*  65  119:astore_1        
		{
			String s1 = a;
	//   66  120:getstatic       #21  <Field String a>
	//   67  123:astore_2        
			StringBuilder stringbuilder2 = new StringBuilder();
	//   68  124:new             #73  <Class StringBuilder>
	//   69  127:dup             
	//   70  128:invokespecial   #74  <Method void StringBuilder()>
	//   71  131:astore_3        
			stringbuilder2.append("Exception parsing date ");
	//   72  132:aload_3         
	//   73  133:ldc1            #152 <String "Exception parsing date ">
	//   74  135:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   75  138:pop             
			stringbuilder2.append(s);
	//   76  139:aload_3         
	//   77  140:aload_0         
	//   78  141:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   79  144:pop             
			stringbuilder2.append(". Returning null");
	//   80  145:aload_3         
	//   81  146:ldc1            #154 <String ". Returning null">
	//   82  148:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   83  151:pop             
			AppboyLogger.e(s1, stringbuilder2.toString(), ((Throwable) (r1)));
	//   84  152:aload_2         
	//   85  153:aload_3         
	//   86  154:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   87  157:aload_1         
	//   88  158:invokestatic    #158 <Method int AppboyLogger.e(String, String, Throwable)>
	//   89  161:pop             
			return null;
	//   90  162:aconst_null     
	//   91  163:areturn         
		}
		return ((Date) (r1));
	}

	public static double b()
	{
		return (double)System.currentTimeMillis() / 1000D;
	//    0    0:invokestatic    #58  <Method long System.currentTimeMillis()>
	//    1    3:l2d             
	//    2    4:ldc2w           #160 <Double 1000D>
	//    3    7:ddiv            
	//    4    8:dreturn         
	}

	public static long c()
	{
		return System.currentTimeMillis();
	//    0    0:invokestatic    #58  <Method long System.currentTimeMillis()>
	//    1    3:lreturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/dl);
	private static final TimeZone b = TimeZone.getTimeZone("UTC");
	private static final EnumSet c;

	static 
	{
	//    0    0:ldc1            #2   <Class dl>
	//    1    2:invokestatic    #19  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #21  <Field String a>
	//    3    8:ldc1            #23  <String "UTC">
	//    4   10:invokestatic    #29  <Method TimeZone TimeZone.getTimeZone(String)>
	//    5   13:putstatic       #31  <Field TimeZone b>
		c = EnumSet.of(((Enum) (r.a)), ((Enum) (r.b)), ((Enum) (r.c)));
	//    6   16:getstatic       #36  <Field r r.a>
	//    7   19:getstatic       #38  <Field r r.b>
	//    8   22:getstatic       #40  <Field r r.c>
	//    9   25:invokestatic    #46  <Method EnumSet EnumSet.of(Enum, Enum, Enum)>
	//   10   28:putstatic       #48  <Field EnumSet c>
	//*  11   31:return          
	}
}
