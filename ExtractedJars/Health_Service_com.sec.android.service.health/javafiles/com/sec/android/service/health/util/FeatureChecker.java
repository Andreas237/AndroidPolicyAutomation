// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.util;

import android.content.Context;
import android.content.pm.PackageManager;

// Referenced classes of package com.sec.android.service.health.util:
//			LOG

public final class FeatureChecker
{

	public FeatureChecker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}

	private static void checkSupportSemAPI(Context context)
	{
		LOG.d(TAG, "checkSupportSemAPI");
	//    0    0:getstatic       #13  <Field Class TAG>
	//    1    3:ldc1            #24  <String "checkSupportSemAPI">
	//    2    5:invokestatic    #30  <Method void LOG.d(Class, String)>
		try
		{
			if(context.getPackageManager().hasSystemFeature("com.samsung.feature.samsung_experience_mobile"))
	//*   3    8:aload_0         
	//*   4    9:invokevirtual   #36  <Method PackageManager Context.getPackageManager()>
	//*   5   12:ldc1            #38  <String "com.samsung.feature.samsung_experience_mobile">
	//*   6   14:invokevirtual   #44  <Method boolean PackageManager.hasSystemFeature(String)>
	//*   7   17:ifeq            32
			{
				semAvailable = true;
	//    8   20:iconst_1        
	//    9   21:putstatic       #15  <Field boolean semAvailable>
				LOG.d(TAG, "semAvailable set as true ");
	//   10   24:getstatic       #13  <Field Class TAG>
	//   11   27:ldc1            #46  <String "semAvailable set as true ">
	//   12   29:invokestatic    #30  <Method void LOG.d(Class, String)>
			}
			return;
	//   13   32:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  14   33:astore_0        
		{
			((Exception) (context)).printStackTrace();
	//   15   34:aload_0         
	//   16   35:invokevirtual   #49  <Method void Exception.printStackTrace()>
		}
		semAvailable = false;
	//   17   38:iconst_0        
	//   18   39:putstatic       #15  <Field boolean semAvailable>
		LOG.d(TAG, "semAvailable set as false ");
	//   19   42:getstatic       #13  <Field Class TAG>
	//   20   45:ldc1            #51  <String "semAvailable set as false ">
	//   21   47:invokestatic    #30  <Method void LOG.d(Class, String)>
	//   22   50:return          
	}

	public static void init(Context context)
	{
		checkSupportSemAPI(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #54  <Method void checkSupportSemAPI(Context)>
	//    2    4:return          
	}

	public static boolean supportSem()
	{
		LOG.d(TAG, (new StringBuilder()).append("semAvailable = ").append(semAvailable).toString());
	//    0    0:getstatic       #13  <Field Class TAG>
	//    1    3:new             #58  <Class StringBuilder>
	//    2    6:dup             
	//    3    7:invokespecial   #59  <Method void StringBuilder()>
	//    4   10:ldc1            #61  <String "semAvailable = ">
	//    5   12:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//    6   15:getstatic       #15  <Field boolean semAvailable>
	//    7   18:invokevirtual   #68  <Method StringBuilder StringBuilder.append(boolean)>
	//    8   21:invokevirtual   #72  <Method String StringBuilder.toString()>
	//    9   24:invokestatic    #30  <Method void LOG.d(Class, String)>
		return semAvailable;
	//   10   27:getstatic       #15  <Field boolean semAvailable>
	//   11   30:ireturn         
	}

	private static final Class TAG = com/sec/android/service/health/util/FeatureChecker;
	private static boolean semAvailable = false;

	static 
	{
	//    0    0:ldc1            #2   <Class FeatureChecker>
	//    1    2:putstatic       #13  <Field Class TAG>
	//    2    5:iconst_0        
	//    3    6:putstatic       #15  <Field boolean semAvailable>
	//*   4    9:return          
	}
}
