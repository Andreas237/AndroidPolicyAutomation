// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.content.Context;
import com.facebook.FacebookSdk;

// Referenced classes of package com.facebook.login:
//			LoginManager, LoginLogger

private static class LoginManager$LoginLoggerHolder
{

	private static LoginLogger getLogger(Context context)
	{
		com/facebook/login/LoginManager$LoginLoggerHolder;
	//    0    0:ldc1            #2   <Class LoginManager$LoginLoggerHolder>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(context != null)
	//*   2    3:aload_0         
	//*   3    4:ifnull          10
			break MISSING_BLOCK_LABEL_14;
	//    4    7:goto            14
		context = FacebookSdk.getApplicationContext();
	//    5   10:invokestatic    #25  <Method Context FacebookSdk.getApplicationContext()>
	//    6   13:astore_0        
		if(context != null)
			break MISSING_BLOCK_LABEL_23;
	//    7   14:aload_0         
	//    8   15:ifnonnull       23
		com/facebook/login/LoginManager$LoginLoggerHolder;
	//    9   18:ldc1            #2   <Class LoginManager$LoginLoggerHolder>
		JVM INSTR monitorexit ;
	//   10   20:monitorexit     
		return null;
	//   11   21:aconst_null     
	//   12   22:areturn         
		if(logger == null)
	//*  13   23:getstatic       #27  <Field LoginLogger logger>
	//*  14   26:ifnonnull       43
			logger = new LoginLogger(context, FacebookSdk.getApplicationId());
	//   15   29:new             #29  <Class LoginLogger>
	//   16   32:dup             
	//   17   33:aload_0         
	//   18   34:invokestatic    #33  <Method String FacebookSdk.getApplicationId()>
	//   19   37:invokespecial   #36  <Method void LoginLogger(Context, String)>
	//   20   40:putstatic       #27  <Field LoginLogger logger>
		context = ((Context) (logger));
	//   21   43:getstatic       #27  <Field LoginLogger logger>
	//   22   46:astore_0        
		com/facebook/login/LoginManager$LoginLoggerHolder;
	//   23   47:ldc1            #2   <Class LoginManager$LoginLoggerHolder>
		JVM INSTR monitorexit ;
	//   24   49:monitorexit     
		return ((LoginLogger) (context));
	//   25   50:aload_0         
	//   26   51:areturn         
		context;
	//   27   52:astore_0        
	//*  28   53:ldc1            #2   <Class LoginManager$LoginLoggerHolder>
		throw context;
	//   29   55:monitorexit     
	//   30   56:aload_0         
	//   31   57:athrow          
	}

	private static LoginLogger logger;


/*
	static LoginLogger access$000(Context context)
	{
		return getLogger(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #19  <Method LoginLogger getLogger(Context)>
	//    2    4:areturn         
	}

*/

	private LoginManager$LoginLoggerHolder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
