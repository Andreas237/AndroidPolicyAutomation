// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk.payments;

import android.app.Activity;
import android.content.Intent;
import java.util.Arrays;
import java.util.HashSet;

// Referenced classes of package com.paypal.android.sdk.payments:
//			dl, PayPalOAuthScopes, PayPalConfiguration

public final class FuturePaymentConsentActivity extends dl
{

	public FuturePaymentConsentActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void dl()>
	//    2    4:return          
	}

	static void a(Activity activity, int i, PayPalConfiguration paypalconfiguration)
	{
		Intent intent = new Intent(((android.content.Context) (activity)), com/paypal/android/sdk/payments/FuturePaymentConsentActivity);
	//    0    0:new             #18  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class FuturePaymentConsentActivity>
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
		b = new PayPalOAuthScopes(((java.util.Set) (new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
			PayPalOAuthScopes.a
		})))))))));
	//    0    0:aload_0         
	//    1    1:new             #43  <Class PayPalOAuthScopes>
	//    2    4:dup             
	//    3    5:new             #45  <Class HashSet>
	//    4    8:dup             
	//    5    9:iconst_1        
	//    6   10:anewarray       String[]
	//    7   13:dup             
	//    8   14:iconst_0        
	//    9   15:getstatic       #49  <Field String PayPalOAuthScopes.a>
	//   10   18:aastore         
	//   11   19:invokestatic    #55  <Method java.util.List Arrays.asList(Object[])>
	//   12   22:invokespecial   #58  <Method void HashSet(java.util.Collection)>
	//   13   25:invokespecial   #61  <Method void PayPalOAuthScopes(java.util.Set)>
	//   14   28:putfield        #65  <Field PayPalOAuthScopes b>
	//   15   31:return          
	}

	public final volatile void finish()
	{
		super.finish();
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void dl.finish()>
	//    2    4:return          
	}

	public final volatile void onBackPressed()
	{
		super.onBackPressed();
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method void dl.onBackPressed()>
	//    2    4:return          
	}

	private static final String d = "FuturePaymentConsentActivity";

	static 
	{
	//    0    0:return          
	}
}
