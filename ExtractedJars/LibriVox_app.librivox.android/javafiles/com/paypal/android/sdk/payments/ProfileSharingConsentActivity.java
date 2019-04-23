// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk.payments;

import android.app.Activity;
import android.content.Intent;

// Referenced classes of package com.paypal.android.sdk.payments:
//			dl, PayPalOAuthScopes, PayPalConfiguration

public final class ProfileSharingConsentActivity extends dl
{

	public ProfileSharingConsentActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void dl()>
	//    2    4:return          
	}

	static void a(Activity activity, int i, PayPalConfiguration paypalconfiguration)
	{
		Intent intent = new Intent(((android.content.Context) (activity)), com/paypal/android/sdk/payments/ProfileSharingConsentActivity);
	//    0    0:new             #18  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class ProfileSharingConsentActivity>
	//    4    7:invokespecial   #21  <Method void Intent(android.content.Context, Class)>
	//    5   10:astore_3        
		intent.putExtras(activity.getIntent());
	//    6   11:aload_3         
	//    7   12:aload_0         
	//    8   13:invokevirtual   #27  <Method Intent Activity.getIntent()>
	//    9   16:invokevirtual   #31  <Method Intent Intent.putExtras(Intent)>
	//   10   19:pop             
		intent.putExtra("com.paypal.android.sdk.paypalConfiguration", ((android.os.Parcelable) (paypalconfiguration)));
	//   11   20:aload_3         
	//   12   21:ldc1            #33  <String "com.paypal.android.sdk.paypalConfiguration">
	//   13   23:aload_2         
	//   14   24:invokevirtual   #37  <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   15   27:pop             
		activity.startActivityForResult(intent, 1);
	//   16   28:aload_0         
	//   17   29:aload_3         
	//   18   30:iconst_1        
	//   19   31:invokevirtual   #41  <Method void Activity.startActivityForResult(Intent, int)>
	//   20   34:return          
	}

	protected final void a()
	{
		b = (PayPalOAuthScopes)getIntent().getParcelableExtra("com.paypal.android.sdk.requested_scopes");
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #42  <Method Intent getIntent()>
	//    3    5:ldc1            #44  <String "com.paypal.android.sdk.requested_scopes">
	//    4    7:invokevirtual   #48  <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//    5   10:checkcast       #50  <Class PayPalOAuthScopes>
	//    6   13:putfield        #54  <Field PayPalOAuthScopes b>
	//    7   16:return          
	}

	public final volatile void finish()
	{
		super.finish();
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void dl.finish()>
	//    2    4:return          
	}

	public final volatile void onBackPressed()
	{
		super.onBackPressed();
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void dl.onBackPressed()>
	//    2    4:return          
	}

	private static final String d = "ProfileSharingConsentActivity";

	static 
	{
	//    0    0:return          
	}
}
