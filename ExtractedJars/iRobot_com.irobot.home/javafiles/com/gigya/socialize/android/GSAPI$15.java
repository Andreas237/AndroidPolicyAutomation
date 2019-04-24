// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import com.gigya.socialize.android.login.LoginProviderFactory;
import com.gigya.socialize.android.login.providers.FacebookProvider;
import java.util.List;

// Referenced classes of package com.gigya.socialize.android:
//			GSAPI, GSPermissionResultHandler

class GSAPI$15
	implements Runnable
{

	public void run()
	{
		com.gigya.socialize.android.login.providers.LoginProvider loginprovider = loginProviderFactory.getLoginProvider("facebook");
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field GSAPI this$0>
	//    2    4:getfield        #34  <Field LoginProviderFactory GSAPI.loginProviderFactory>
	//    3    7:ldc1            #36  <String "facebook">
	//    4    9:invokevirtual   #42  <Method com.gigya.socialize.android.login.providers.LoginProvider LoginProviderFactory.getLoginProvider(String)>
	//    5   12:astore_1        
		if(((Object) (loginProviderFactory.getLoginProvider("facebook"))).getClass() == com/gigya/socialize/android/login/providers/FacebookProvider)
	//*   6   13:aload_0         
	//*   7   14:getfield        #21  <Field GSAPI this$0>
	//*   8   17:getfield        #34  <Field LoginProviderFactory GSAPI.loginProviderFactory>
	//*   9   20:ldc1            #36  <String "facebook">
	//*  10   22:invokevirtual   #42  <Method com.gigya.socialize.android.login.providers.LoginProvider LoginProviderFactory.getLoginProvider(String)>
	//*  11   25:invokevirtual   #46  <Method Class Object.getClass()>
	//*  12   28:ldc1            #48  <Class FacebookProvider>
	//*  13   30:if_acmpne       51
		{
			((FacebookProvider)loginprovider).requestPermissions("read", val$permissions, val$callback);
	//   14   33:aload_1         
	//   15   34:checkcast       #48  <Class FacebookProvider>
	//   16   37:ldc1            #50  <String "read">
	//   17   39:aload_0         
	//   18   40:getfield        #23  <Field List val$permissions>
	//   19   43:aload_0         
	//   20   44:getfield        #25  <Field GSPermissionResultHandler val$callback>
	//   21   47:invokevirtual   #54  <Method void FacebookProvider.requestPermissions(String, List, GSPermissionResultHandler)>
			return;
	//   22   50:return          
		}
		if(val$callback != null)
	//*  23   51:aload_0         
	//*  24   52:getfield        #25  <Field GSPermissionResultHandler val$callback>
	//*  25   55:ifnull          78
			val$callback.onResult(false, new Exception("App isn't configured for Facebook native login."), ((List) (null)));
	//   26   58:aload_0         
	//   27   59:getfield        #25  <Field GSPermissionResultHandler val$callback>
	//   28   62:iconst_0        
	//   29   63:new             #56  <Class Exception>
	//   30   66:dup             
	//   31   67:ldc1            #58  <String "App isn't configured for Facebook native login.">
	//   32   69:invokespecial   #61  <Method void Exception(String)>
	//   33   72:aconst_null     
	//   34   73:invokeinterface #67  <Method void GSPermissionResultHandler.onResult(boolean, Exception, List)>
	//   35   78:return          
	}

	final GSAPI this$0;
	final GSPermissionResultHandler val$callback;
	final List val$permissions;

	GSAPI$15()
	{
		this$0 = final_gsapi;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field GSAPI this$0>
		val$permissions = list;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field List val$permissions>
		val$callback = GSPermissionResultHandler.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field GSPermissionResultHandler val$callback>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
