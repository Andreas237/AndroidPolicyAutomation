// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.support;

import android.content.Context;

// Referenced classes of package com.appboy.support:
//			AppboyLogger, StringUtils

public class PackageUtils
{

	public PackageUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	public static String getResourcePackageName(Context context)
	{
		String s = b;
	//    0    0:getstatic       #25  <Field String b>
	//    1    3:astore_1        
		if(s != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          10
		{
			return s;
	//    4    8:aload_1         
	//    5    9:areturn         
		} else
		{
			b = context.getPackageName();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #31  <Method String Context.getPackageName()>
	//    8   14:putstatic       #25  <Field String b>
			return b;
	//    9   17:getstatic       #25  <Field String b>
	//   10   20:areturn         
		}
	}

	public static void setResourcePackageName(String s)
	{
		if(!StringUtils.isNullOrBlank(s))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #39  <Method boolean StringUtils.isNullOrBlank(String)>
	//*   2    4:ifne            12
		{
			b = s;
	//    3    7:aload_0         
	//    4    8:putstatic       #25  <Field String b>
			return;
	//    5   11:return          
		} else
		{
			AppboyLogger.e(a, "Package name may not be null or blank");
	//    6   12:getstatic       #17  <Field String a>
	//    7   15:ldc1            #41  <String "Package name may not be null or blank">
	//    8   17:invokestatic    #45  <Method int AppboyLogger.e(String, String)>
	//    9   20:pop             
			return;
	//   10   21:return          
		}
	}

	private static final String a = AppboyLogger.getAppboyLogTag(com/appboy/support/PackageUtils);
	private static String b;

	static 
	{
	//    0    0:ldc1            #2   <Class PackageUtils>
	//    1    2:invokestatic    #15  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #17  <Field String a>
	//*   3    8:return          
	}
}
