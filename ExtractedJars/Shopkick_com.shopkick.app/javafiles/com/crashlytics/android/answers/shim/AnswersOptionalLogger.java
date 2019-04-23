// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers.shim;

import android.util.Log;

// Referenced classes of package com.crashlytics.android.answers.shim:
//			AnswersKitEventLogger, NoopKitEventLogger, KitEventLogger

public class AnswersOptionalLogger
{

	public AnswersOptionalLogger()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
	//    2    4:return          
	}

	public static KitEventLogger get()
	{
		return logger;
	//    0    0:getstatic       #39  <Field KitEventLogger logger>
	//    1    3:areturn         
	}

	private static final String TAG = "AnswersOptionalLogger";
	private static final KitEventLogger logger;

	static 
	{
		Object obj = ((Object) (AnswersKitEventLogger.create()));
	//    0    0:invokestatic    #24  <Method AnswersKitEventLogger AnswersKitEventLogger.create()>
	//    1    3:astore_0        
		  goto _L1
	//*   2    4:goto            19
		obj;
	//    3    7:astore_0        
		Log.w("AnswersOptionalLogger", "Unexpected error creating AnswersKitEventLogger", ((Throwable) (obj)));
	//    4    8:ldc1            #8   <String "AnswersOptionalLogger">
	//    5   10:ldc1            #26  <String "Unexpected error creating AnswersKitEventLogger">
	//    6   12:aload_0         
	//    7   13:invokestatic    #32  <Method int Log.w(String, String, Throwable)>
	//    8   16:pop             
_L3:
		obj = null;
	//    9   17:aconst_null     
	//   10   18:astore_0        
_L1:
		if(obj == null)
	//*  11   19:aload_0         
	//*  12   20:ifnull          26
	//*  13   23:goto            30
			obj = ((Object) (NoopKitEventLogger.create()));
	//   14   26:invokestatic    #37  <Method KitEventLogger NoopKitEventLogger.create()>
	//   15   29:astore_0        
		logger = ((KitEventLogger) (obj));
	//   16   30:aload_0         
	//   17   31:putstatic       #39  <Field KitEventLogger logger>
		return;
	//   18   34:return          
		Object obj1;
		obj1;
	//   19   35:astore_0        
		if(true) goto _L3; else goto _L2
_L2:
	//*  20   36:goto            17
	}
}
