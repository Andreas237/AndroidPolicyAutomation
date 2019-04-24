// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import android.content.Intent;
import com.gigya.socialize.android.login.LoginProviderFactory;
import com.gigya.socialize.android.login.providers.FacebookProvider;

// Referenced classes of package com.gigya.socialize.android:
//			GSAPI

class GSAPI$6
	implements Runnable
{

	public void run()
	{
		com.gigya.socialize.android.login.providers.LoginProvider loginprovider = loginProviderFactory.getLoginProvider("facebook");
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field GSAPI this$0>
	//    2    4:getfield        #30  <Field LoginProviderFactory GSAPI.loginProviderFactory>
	//    3    7:ldc1            #32  <String "facebook">
	//    4    9:invokevirtual   #38  <Method com.gigya.socialize.android.login.providers.LoginProvider LoginProviderFactory.getLoginProvider(String)>
	//    5   12:astore_1        
		if(((Object) (loginprovider)).getClass() == com/gigya/socialize/android/login/providers/FacebookProvider)
	//*   6   13:aload_1         
	//*   7   14:invokevirtual   #42  <Method Class Object.getClass()>
	//*   8   17:ldc1            #44  <Class FacebookProvider>
	//*   9   19:if_acmpne       33
			((FacebookProvider)loginprovider).reportDeepLink(val$intent);
	//   10   22:aload_1         
	//   11   23:checkcast       #44  <Class FacebookProvider>
	//   12   26:aload_0         
	//   13   27:getfield        #21  <Field Intent val$intent>
	//   14   30:invokevirtual   #45  <Method void FacebookProvider.reportDeepLink(Intent)>
	//   15   33:return          
	}

	final GSAPI this$0;
	final Intent val$intent;

	GSAPI$6()
	{
		this$0 = final_gsapi;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field GSAPI this$0>
		val$intent = Intent.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Intent val$intent>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
