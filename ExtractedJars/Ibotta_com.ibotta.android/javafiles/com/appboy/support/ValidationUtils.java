// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.support;

import bo.app.dx;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Set;

// Referenced classes of package com.appboy.support:
//			AppboyLogger, StringUtils

public final class ValidationUtils
{

	public ValidationUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}

	public static String ensureAppboyFieldLength(String s)
	{
		String s1 = s.trim();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #31  <Method String String.trim()>
	//    2    4:astore_1        
		s = s1;
	//    3    5:aload_1         
	//    4    6:astore_0        
		if(s1.length() > 255)
	//*   5    7:aload_1         
	//*   6    8:invokevirtual   #35  <Method int String.length()>
	//*   7   11:sipush          255
	//*   8   14:icmple          85
		{
			s = a;
	//    9   17:getstatic       #19  <Field String a>
	//   10   20:astore_0        
			StringBuilder stringbuilder = new StringBuilder();
	//   11   21:new             #37  <Class StringBuilder>
	//   12   24:dup             
	//   13   25:invokespecial   #38  <Method void StringBuilder()>
	//   14   28:astore_2        
			stringbuilder.append("Provided string field is too long [");
	//   15   29:aload_2         
	//   16   30:ldc1            #40  <String "Provided string field is too long [">
	//   17   32:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
			stringbuilder.append(s1.length());
	//   19   36:aload_2         
	//   20   37:aload_1         
	//   21   38:invokevirtual   #35  <Method int String.length()>
	//   22   41:invokevirtual   #47  <Method StringBuilder StringBuilder.append(int)>
	//   23   44:pop             
			stringbuilder.append("]. The max length is ");
	//   24   45:aload_2         
	//   25   46:ldc1            #49  <String "]. The max length is ">
	//   26   48:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   27   51:pop             
			stringbuilder.append(255);
	//   28   52:aload_2         
	//   29   53:sipush          255
	//   30   56:invokevirtual   #47  <Method StringBuilder StringBuilder.append(int)>
	//   31   59:pop             
			stringbuilder.append(", truncating provided field.");
	//   32   60:aload_2         
	//   33   61:ldc1            #51  <String ", truncating provided field.">
	//   34   63:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   35   66:pop             
			AppboyLogger.w(s, stringbuilder.toString());
	//   36   67:aload_0         
	//   37   68:aload_2         
	//   38   69:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   39   72:invokestatic    #58  <Method int AppboyLogger.w(String, String)>
	//   40   75:pop             
			s = s1.substring(0, 255);
	//   41   76:aload_1         
	//   42   77:iconst_0        
	//   43   78:sipush          255
	//   44   81:invokevirtual   #62  <Method String String.substring(int, int)>
	//   45   84:astore_0        
		}
		return s;
	//   46   85:aload_0         
	//   47   86:areturn         
	}

	public static boolean isValidEmailAddress(String s)
	{
		return s != null && s.toLowerCase(Locale.US).matches("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])");
	//    0    0:aload_0         
	//    1    1:ifnull          21
	//    2    4:aload_0         
	//    3    5:getstatic       #70  <Field Locale Locale.US>
	//    4    8:invokevirtual   #74  <Method String String.toLowerCase(Locale)>
	//    5   11:ldc1            #76  <String "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])">
	//    6   13:invokevirtual   #79  <Method boolean String.matches(String)>
	//    7   16:ifeq            21
	//    8   19:iconst_1        
	//    9   20:ireturn         
	//   10   21:iconst_0        
	//   11   22:ireturn         
	}

	public static boolean isValidLocation(double d, double d1)
	{
		return d < 90D && d > -90D && d1 < 180D && d1 > -180D;
	//    0    0:dload_0         
	//    1    1:ldc2w           #82  <Double 90D>
	//    2    4:dcmpg           
	//    3    5:ifge            34
	//    4    8:dload_0         
	//    5    9:ldc2w           #84  <Double -90D>
	//    6   12:dcmpl           
	//    7   13:ifle            34
	//    8   16:dload_2         
	//    9   17:ldc2w           #86  <Double 180D>
	//   10   20:dcmpg           
	//   11   21:ifge            34
	//   12   24:dload_2         
	//   13   25:ldc2w           #88  <Double -180D>
	//   14   28:dcmpl           
	//   15   29:ifle            34
	//   16   32:iconst_1        
	//   17   33:ireturn         
	//   18   34:iconst_0        
	//   19   35:ireturn         
	}

	public static boolean isValidLogCustomEventInput(String s, dx dx1)
	{
		if(StringUtils.isNullOrBlank(s))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #96  <Method boolean StringUtils.isNullOrBlank(String)>
	//*   2    4:ifeq            18
		{
			AppboyLogger.w(a, "The custom event name cannot be null or contain only whitespaces. Invalid custom event.");
	//    3    7:getstatic       #19  <Field String a>
	//    4   10:ldc1            #98  <String "The custom event name cannot be null or contain only whitespaces. Invalid custom event.">
	//    5   12:invokestatic    #58  <Method int AppboyLogger.w(String, String)>
	//    6   15:pop             
			return false;
	//    7   16:iconst_0        
	//    8   17:ireturn         
		}
		if(dx1.h().contains(((Object) (s))))
	//*   9   18:aload_1         
	//*  10   19:invokevirtual   #104 <Method Set dx.h()>
	//*  11   22:aload_0         
	//*  12   23:invokeinterface #110 <Method boolean Set.contains(Object)>
	//*  13   28:ifeq            74
		{
			dx1 = ((dx) (a));
	//   14   31:getstatic       #19  <Field String a>
	//   15   34:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   16   35:new             #37  <Class StringBuilder>
	//   17   38:dup             
	//   18   39:invokespecial   #38  <Method void StringBuilder()>
	//   19   42:astore_2        
			stringbuilder.append("The custom event is a blacklisted custom event: ");
	//   20   43:aload_2         
	//   21   44:ldc1            #112 <String "The custom event is a blacklisted custom event: ">
	//   22   46:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   23   49:pop             
			stringbuilder.append(s);
	//   24   50:aload_2         
	//   25   51:aload_0         
	//   26   52:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   27   55:pop             
			stringbuilder.append(". Invalid custom event.");
	//   28   56:aload_2         
	//   29   57:ldc1            #114 <String ". Invalid custom event.">
	//   30   59:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   31   62:pop             
			AppboyLogger.w(((String) (dx1)), stringbuilder.toString());
	//   32   63:aload_1         
	//   33   64:aload_2         
	//   34   65:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   35   68:invokestatic    #58  <Method int AppboyLogger.w(String, String)>
	//   36   71:pop             
			return false;
	//   37   72:iconst_0        
	//   38   73:ireturn         
		} else
		{
			return true;
	//   39   74:iconst_1        
	//   40   75:ireturn         
		}
	}

	public static boolean isValidLogPurchaseInput(String s, String s1, BigDecimal bigdecimal, int i, dx dx1, Set set)
	{
		if(StringUtils.isNullOrBlank(s))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #96  <Method boolean StringUtils.isNullOrBlank(String)>
	//*   2    4:ifeq            18
		{
			AppboyLogger.w(a, "The productId is empty, not logging in-app purchase to Appboy.");
	//    3    7:getstatic       #19  <Field String a>
	//    4   10:ldc1            #119 <String "The productId is empty, not logging in-app purchase to Appboy.">
	//    5   12:invokestatic    #58  <Method int AppboyLogger.w(String, String)>
	//    6   15:pop             
			return false;
	//    7   16:iconst_0        
	//    8   17:ireturn         
		}
		if(dx1.j().contains(((Object) (s))))
	//*   9   18:aload           4
	//*  10   20:invokevirtual   #122 <Method Set dx.j()>
	//*  11   23:aload_0         
	//*  12   24:invokeinterface #110 <Method boolean Set.contains(Object)>
	//*  13   29:ifeq            68
		{
			s1 = a;
	//   14   32:getstatic       #19  <Field String a>
	//   15   35:astore_1        
			bigdecimal = ((BigDecimal) (new StringBuilder()));
	//   16   36:new             #37  <Class StringBuilder>
	//   17   39:dup             
	//   18   40:invokespecial   #38  <Method void StringBuilder()>
	//   19   43:astore_2        
			((StringBuilder) (bigdecimal)).append("The productId is a blacklisted productId: ");
	//   20   44:aload_2         
	//   21   45:ldc1            #124 <String "The productId is a blacklisted productId: ">
	//   22   47:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   23   50:pop             
			((StringBuilder) (bigdecimal)).append(s);
	//   24   51:aload_2         
	//   25   52:aload_0         
	//   26   53:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   27   56:pop             
			AppboyLogger.w(s1, ((StringBuilder) (bigdecimal)).toString());
	//   28   57:aload_1         
	//   29   58:aload_2         
	//   30   59:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   31   62:invokestatic    #58  <Method int AppboyLogger.w(String, String)>
	//   32   65:pop             
			return false;
	//   33   66:iconst_0        
	//   34   67:ireturn         
		}
		if(s1 == null)
	//*  35   68:aload_1         
	//*  36   69:ifnonnull       109
		{
			s = a;
	//   37   72:getstatic       #19  <Field String a>
	//   38   75:astore_0        
			s1 = ((String) (new StringBuilder()));
	//   39   76:new             #37  <Class StringBuilder>
	//   40   79:dup             
	//   41   80:invokespecial   #38  <Method void StringBuilder()>
	//   42   83:astore_1        
			((StringBuilder) (s1)).append("The currencyCode is null. Expected one of ");
	//   43   84:aload_1         
	//   44   85:ldc1            #126 <String "The currencyCode is null. Expected one of ">
	//   45   87:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   46   90:pop             
			((StringBuilder) (s1)).append(((Object) (set)));
	//   47   91:aload_1         
	//   48   92:aload           5
	//   49   94:invokevirtual   #129 <Method StringBuilder StringBuilder.append(Object)>
	//   50   97:pop             
			AppboyLogger.w(s, ((StringBuilder) (s1)).toString());
	//   51   98:aload_0         
	//   52   99:aload_1         
	//   53  100:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   54  103:invokestatic    #58  <Method int AppboyLogger.w(String, String)>
	//   55  106:pop             
			return false;
	//   56  107:iconst_0        
	//   57  108:ireturn         
		}
		if(!set.contains(((Object) (s1))))
	//*  58  109:aload           5
	//*  59  111:aload_1         
	//*  60  112:invokeinterface #110 <Method boolean Set.contains(Object)>
	//*  61  117:ifne            170
		{
			s = a;
	//   62  120:getstatic       #19  <Field String a>
	//   63  123:astore_0        
			bigdecimal = ((BigDecimal) (new StringBuilder()));
	//   64  124:new             #37  <Class StringBuilder>
	//   65  127:dup             
	//   66  128:invokespecial   #38  <Method void StringBuilder()>
	//   67  131:astore_2        
			((StringBuilder) (bigdecimal)).append("The currencyCode ");
	//   68  132:aload_2         
	//   69  133:ldc1            #131 <String "The currencyCode ">
	//   70  135:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   71  138:pop             
			((StringBuilder) (bigdecimal)).append(s1);
	//   72  139:aload_2         
	//   73  140:aload_1         
	//   74  141:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   75  144:pop             
			((StringBuilder) (bigdecimal)).append(" is invalid. Expected one of ");
	//   76  145:aload_2         
	//   77  146:ldc1            #133 <String " is invalid. Expected one of ">
	//   78  148:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   79  151:pop             
			((StringBuilder) (bigdecimal)).append(((Object) (set)));
	//   80  152:aload_2         
	//   81  153:aload           5
	//   82  155:invokevirtual   #129 <Method StringBuilder StringBuilder.append(Object)>
	//   83  158:pop             
			AppboyLogger.w(s, ((StringBuilder) (bigdecimal)).toString());
	//   84  159:aload_0         
	//   85  160:aload_2         
	//   86  161:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   87  164:invokestatic    #58  <Method int AppboyLogger.w(String, String)>
	//   88  167:pop             
			return false;
	//   89  168:iconst_0        
	//   90  169:ireturn         
		}
		if(bigdecimal == null)
	//*  91  170:aload_2         
	//*  92  171:ifnonnull       185
		{
			AppboyLogger.w(a, "The price is null.");
	//   93  174:getstatic       #19  <Field String a>
	//   94  177:ldc1            #135 <String "The price is null.">
	//   95  179:invokestatic    #58  <Method int AppboyLogger.w(String, String)>
	//   96  182:pop             
			return false;
	//   97  183:iconst_0        
	//   98  184:ireturn         
		}
		if(i <= 0)
	//*  99  185:iload_3         
	//* 100  186:ifgt            232
		{
			s = a;
	//  101  189:getstatic       #19  <Field String a>
	//  102  192:astore_0        
			s1 = ((String) (new StringBuilder()));
	//  103  193:new             #37  <Class StringBuilder>
	//  104  196:dup             
	//  105  197:invokespecial   #38  <Method void StringBuilder()>
	//  106  200:astore_1        
			((StringBuilder) (s1)).append("The requested purchase quantity of ");
	//  107  201:aload_1         
	//  108  202:ldc1            #137 <String "The requested purchase quantity of ">
	//  109  204:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//  110  207:pop             
			((StringBuilder) (s1)).append(i);
	//  111  208:aload_1         
	//  112  209:iload_3         
	//  113  210:invokevirtual   #47  <Method StringBuilder StringBuilder.append(int)>
	//  114  213:pop             
			((StringBuilder) (s1)).append(" is less than zero.");
	//  115  214:aload_1         
	//  116  215:ldc1            #139 <String " is less than zero.">
	//  117  217:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//  118  220:pop             
			AppboyLogger.w(s, ((StringBuilder) (s1)).toString());
	//  119  221:aload_0         
	//  120  222:aload_1         
	//  121  223:invokevirtual   #54  <Method String StringBuilder.toString()>
	//  122  226:invokestatic    #58  <Method int AppboyLogger.w(String, String)>
	//  123  229:pop             
			return false;
	//  124  230:iconst_0        
	//  125  231:ireturn         
		}
		if(i > 100)
	//* 126  232:iload_3         
	//* 127  233:bipush          100
	//* 128  235:icmple          288
		{
			s = a;
	//  129  238:getstatic       #19  <Field String a>
	//  130  241:astore_0        
			s1 = ((String) (new StringBuilder()));
	//  131  242:new             #37  <Class StringBuilder>
	//  132  245:dup             
	//  133  246:invokespecial   #38  <Method void StringBuilder()>
	//  134  249:astore_1        
			((StringBuilder) (s1)).append("The requested purchase quantity of ");
	//  135  250:aload_1         
	//  136  251:ldc1            #137 <String "The requested purchase quantity of ">
	//  137  253:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//  138  256:pop             
			((StringBuilder) (s1)).append(i);
	//  139  257:aload_1         
	//  140  258:iload_3         
	//  141  259:invokevirtual   #47  <Method StringBuilder StringBuilder.append(int)>
	//  142  262:pop             
			((StringBuilder) (s1)).append(" is greater than the maximum of ");
	//  143  263:aload_1         
	//  144  264:ldc1            #141 <String " is greater than the maximum of ">
	//  145  266:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//  146  269:pop             
			((StringBuilder) (s1)).append(100);
	//  147  270:aload_1         
	//  148  271:bipush          100
	//  149  273:invokevirtual   #47  <Method StringBuilder StringBuilder.append(int)>
	//  150  276:pop             
			AppboyLogger.w(s, ((StringBuilder) (s1)).toString());
	//  151  277:aload_0         
	//  152  278:aload_1         
	//  153  279:invokevirtual   #54  <Method String StringBuilder.toString()>
	//  154  282:invokestatic    #58  <Method int AppboyLogger.w(String, String)>
	//  155  285:pop             
			return false;
	//  156  286:iconst_0        
	//  157  287:ireturn         
		} else
		{
			return true;
	//  158  288:iconst_1        
	//  159  289:ireturn         
		}
	}

	public static boolean isValidPhoneNumber(String s)
	{
		return s != null && s.matches("^[0-9 .\\(\\)\\+\\-]+$");
	//    0    0:aload_0         
	//    1    1:ifnull          15
	//    2    4:aload_0         
	//    3    5:ldc1            #147 <String "^[0-9 .\\(\\)\\+\\-]+$">
	//    4    7:invokevirtual   #79  <Method boolean String.matches(String)>
	//    5   10:ifeq            15
	//    6   13:iconst_1        
	//    7   14:ireturn         
	//    8   15:iconst_0        
	//    9   16:ireturn         
	}

	public static boolean isValidPushStoryClickInput(String s, String s1)
	{
		if(StringUtils.isNullOrBlank(s))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #96  <Method boolean StringUtils.isNullOrBlank(String)>
	//*   2    4:ifeq            18
		{
			AppboyLogger.w(a, "Campaign ID cannot be null or blank");
	//    3    7:getstatic       #19  <Field String a>
	//    4   10:ldc1            #151 <String "Campaign ID cannot be null or blank">
	//    5   12:invokestatic    #58  <Method int AppboyLogger.w(String, String)>
	//    6   15:pop             
			return false;
	//    7   16:iconst_0        
	//    8   17:ireturn         
		}
		if(StringUtils.isNullOrBlank(s1))
	//*   9   18:aload_1         
	//*  10   19:invokestatic    #96  <Method boolean StringUtils.isNullOrBlank(String)>
	//*  11   22:ifeq            36
		{
			AppboyLogger.w(a, "Push story page ID cannot be null or blank");
	//   12   25:getstatic       #19  <Field String a>
	//   13   28:ldc1            #153 <String "Push story page ID cannot be null or blank">
	//   14   30:invokestatic    #58  <Method int AppboyLogger.w(String, String)>
	//   15   33:pop             
			return false;
	//   16   34:iconst_0        
	//   17   35:ireturn         
		} else
		{
			return true;
	//   18   36:iconst_1        
	//   19   37:ireturn         
		}
	}

	public static final int APPBOY_STRING_MAX_LENGTH = 255;
	private static final String a = AppboyLogger.getAppboyLogTag(com/appboy/support/ValidationUtils);

	static 
	{
	//    0    0:ldc1            #2   <Class ValidationUtils>
	//    1    2:invokestatic    #17  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #19  <Field String a>
	//*   3    8:return          
	}
}
