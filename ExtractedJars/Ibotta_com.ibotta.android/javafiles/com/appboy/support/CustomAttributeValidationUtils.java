// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.support;

import java.util.Set;

// Referenced classes of package com.appboy.support:
//			AppboyLogger, ValidationUtils

public class CustomAttributeValidationUtils
{

	public CustomAttributeValidationUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public static String[] ensureCustomAttributeArrayValues(String as[])
	{
		if(as != null && as.length > 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          33
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:ifle            33
		{
			for(int i = 0; i < as.length; i++)
	//*   5    9:iconst_0        
	//*   6   10:istore_1        
	//*   7   11:iload_1         
	//*   8   12:aload_0         
	//*   9   13:arraylength     
	//*  10   14:icmpge          33
				as[i] = ValidationUtils.ensureAppboyFieldLength(as[i]);
	//   11   17:aload_0         
	//   12   18:iload_1         
	//   13   19:aload_0         
	//   14   20:iload_1         
	//   15   21:aaload          
	//   16   22:invokestatic    #28  <Method String ValidationUtils.ensureAppboyFieldLength(String)>
	//   17   25:aastore         

	//   18   26:iload_1         
	//   19   27:iconst_1        
	//   20   28:iadd            
	//   21   29:istore_1        
		}
	//*  22   30:goto            11
		return as;
	//   23   33:aload_0         
	//   24   34:areturn         
	}

	public static boolean isValidCustomAttributeKey(String s, Set set)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       15
		{
			AppboyLogger.w(a, "Custom attribute key cannot be null.");
	//    2    4:getstatic       #16  <Field String a>
	//    3    7:ldc1            #32  <String "Custom attribute key cannot be null.">
	//    4    9:invokestatic    #36  <Method int AppboyLogger.w(String, String)>
	//    5   12:pop             
			return false;
	//    6   13:iconst_0        
	//    7   14:ireturn         
		}
		if(set.contains(((Object) (s))))
	//*   8   15:aload_1         
	//*   9   16:aload_0         
	//*  10   17:invokeinterface #42  <Method boolean Set.contains(Object)>
	//*  11   22:ifeq            68
		{
			set = ((Set) (a));
	//   12   25:getstatic       #16  <Field String a>
	//   13   28:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   14   29:new             #44  <Class StringBuilder>
	//   15   32:dup             
	//   16   33:invokespecial   #45  <Method void StringBuilder()>
	//   17   36:astore_2        
			stringbuilder.append("Custom attribute key cannot be blacklisted attribute: ");
	//   18   37:aload_2         
	//   19   38:ldc1            #47  <String "Custom attribute key cannot be blacklisted attribute: ">
	//   20   40:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   21   43:pop             
			stringbuilder.append(s);
	//   22   44:aload_2         
	//   23   45:aload_0         
	//   24   46:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   25   49:pop             
			stringbuilder.append(".");
	//   26   50:aload_2         
	//   27   51:ldc1            #53  <String ".">
	//   28   53:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   29   56:pop             
			AppboyLogger.w(((String) (set)), stringbuilder.toString());
	//   30   57:aload_1         
	//   31   58:aload_2         
	//   32   59:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   33   62:invokestatic    #36  <Method int AppboyLogger.w(String, String)>
	//   34   65:pop             
			return false;
	//   35   66:iconst_0        
	//   36   67:ireturn         
		} else
		{
			return true;
	//   37   68:iconst_1        
	//   38   69:ireturn         
		}
	}

	public static boolean isValidCustomAttributeValue(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       15
		{
			AppboyLogger.w(a, "Custom attribute value cannot be null.");
	//    2    4:getstatic       #16  <Field String a>
	//    3    7:ldc1            #63  <String "Custom attribute value cannot be null.">
	//    4    9:invokestatic    #36  <Method int AppboyLogger.w(String, String)>
	//    5   12:pop             
			return false;
	//    6   13:iconst_0        
	//    7   14:ireturn         
		} else
		{
			return true;
	//    8   15:iconst_1        
	//    9   16:ireturn         
		}
	}

	private static final String a = AppboyLogger.getAppboyLogTag(com/appboy/support/CustomAttributeValidationUtils);

	static 
	{
	//    0    0:ldc1            #2   <Class CustomAttributeValidationUtils>
	//    1    2:invokestatic    #14  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #16  <Field String a>
	//*   3    8:return          
	}
}
