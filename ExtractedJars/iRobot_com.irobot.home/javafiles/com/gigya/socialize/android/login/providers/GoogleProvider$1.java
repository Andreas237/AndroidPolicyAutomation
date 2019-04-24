// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.login.providers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.gigya.socialize.GSObject;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.gigya.socialize.android.login.providers:
//			GoogleProvider

class GoogleProvider$1
	implements com.gigya.socialize.android.ui.ActivityHandler
{

	public void onActivityResult(FragmentActivity fragmentactivity, int i, int j, Intent intent)
	{
		if(i == GoogleProvider.access$100())
	//*   0    0:iload_2         
	//*   1    1:invokestatic    #39  <Method int GoogleProvider.access$100()>
	//*   2    4:icmpne          72
		{
			if(j == -1)
	//*   3    7:iload_3         
	//*   4    8:iconst_m1       
	//*   5    9:icmpne          40
			{
				fragmentactivity = ((FragmentActivity) (Auth.GoogleSignInApi.getSignInResultFromIntent(intent)));
	//    6   12:getstatic       #45  <Field GoogleSignInApi Auth.GoogleSignInApi>
	//    7   15:aload           4
	//    8   17:invokeinterface #51  <Method com.google.android.gms.auth.api.signin.GoogleSignInResult GoogleSignInApi.getSignInResultFromIntent(Intent)>
	//    9   22:astore_1        
				GoogleProvider.access$200(GoogleProvider.this, ((com.google.android.gms.auth.api.signin.GoogleSignInResult) (fragmentactivity)), val$silent, val$callback);
	//   10   23:aload_0         
	//   11   24:getfield        #23  <Field GoogleProvider this$0>
	//   12   27:aload_1         
	//   13   28:aload_0         
	//   14   29:getfield        #29  <Field Boolean val$silent>
	//   15   32:aload_0         
	//   16   33:getfield        #27  <Field LoginProvider$ProviderCallback val$callback>
	//   17   36:invokestatic    #55  <Method void GoogleProvider.access$200(GoogleProvider, com.google.android.gms.auth.api.signin.GoogleSignInResult, Boolean, LoginProvider$ProviderCallback)>
				return;
	//   18   39:return          
			}
			if(j == 0)
	//*  19   40:iload_3         
	//*  20   41:ifne            56
			{
				cancel(val$callback);
	//   21   44:aload_0         
	//   22   45:getfield        #23  <Field GoogleProvider this$0>
	//   23   48:aload_0         
	//   24   49:getfield        #27  <Field LoginProvider$ProviderCallback val$callback>
	//   25   52:invokevirtual   #59  <Method void GoogleProvider.cancel(LoginProvider$ProviderCallback)>
				return;
	//   26   55:return          
			}
			fail(val$callback, intent.toString());
	//   27   56:aload_0         
	//   28   57:getfield        #23  <Field GoogleProvider this$0>
	//   29   60:aload_0         
	//   30   61:getfield        #27  <Field LoginProvider$ProviderCallback val$callback>
	//   31   64:aload           4
	//   32   66:invokevirtual   #65  <Method String Intent.toString()>
	//   33   69:invokevirtual   #69  <Method void GoogleProvider.fail(LoginProvider$ProviderCallback, String)>
		}
	//   34   72:return          
	}

	public void onCancel(FragmentActivity fragmentactivity)
	{
		cancel(val$callback);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field GoogleProvider this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field LoginProvider$ProviderCallback val$callback>
	//    4    8:invokevirtual   #59  <Method void GoogleProvider.cancel(LoginProvider$ProviderCallback)>
	//    5   11:return          
	}

	public void onCreate(FragmentActivity fragmentactivity, Bundle bundle)
	{
		currentActivity = ((android.app.Activity) (fragmentactivity));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field GoogleProvider this$0>
	//    2    4:aload_1         
	//    3    5:putfield        #77  <Field android.app.Activity GoogleProvider.currentActivity>
		googleClient = GoogleProvider.access$000(GoogleProvider.this, val$params, Boolean.valueOf(false), val$callback);
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field GoogleProvider this$0>
	//    6   12:aload_0         
	//    7   13:getfield        #23  <Field GoogleProvider this$0>
	//    8   16:aload_0         
	//    9   17:getfield        #25  <Field GSObject val$params>
	//   10   20:iconst_0        
	//   11   21:invokestatic    #83  <Method Boolean Boolean.valueOf(boolean)>
	//   12   24:aload_0         
	//   13   25:getfield        #27  <Field LoginProvider$ProviderCallback val$callback>
	//   14   28:invokestatic    #87  <Method GoogleApiClient GoogleProvider.access$000(GoogleProvider, GSObject, Boolean, LoginProvider$ProviderCallback)>
	//   15   31:putfield        #91  <Field GoogleApiClient GoogleProvider.googleClient>
		googleClient.connect();
	//   16   34:aload_0         
	//   17   35:getfield        #23  <Field GoogleProvider this$0>
	//   18   38:getfield        #91  <Field GoogleApiClient GoogleProvider.googleClient>
	//   19   41:invokevirtual   #96  <Method void GoogleApiClient.connect()>
	//   20   44:return          
	}

	public void onResume(FragmentActivity fragmentactivity)
	{
	//    0    0:return          
	}

	public void onStart(FragmentActivity fragmentactivity)
	{
	//    0    0:return          
	}

	final GoogleProvider this$0;
	final viderCallback val$callback;
	final GSObject val$params;
	final Boolean val$silent;

	GoogleProvider$1()
	{
		this$0 = final_googleprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field GoogleProvider this$0>
		val$params = gsobject;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field GSObject val$params>
		val$callback = vidercallback;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field LoginProvider$ProviderCallback val$callback>
		val$silent = Boolean.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #29  <Field Boolean val$silent>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #32  <Method void Object()>
	//   14   25:return          
	}
}
