// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.internal;

import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.Utility;
import java.math.BigDecimal;
import java.util.Currency;

class InternalAppEventsLogger extends AppEventsLogger
{

	InternalAppEventsLogger(Context context)
	{
		this(Utility.getActivityName(context), ((String) (null)), ((AccessToken) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #12  <Method String Utility.getActivityName(Context)>
	//    3    5:aconst_null     
	//    4    6:aconst_null     
	//    5    7:invokespecial   #15  <Method void InternalAppEventsLogger(String, String, AccessToken)>
	//    6   10:return          
	}

	InternalAppEventsLogger(String s, String s1, AccessToken accesstoken)
	{
		super(s, s1, accesstoken);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #17  <Method void AppEventsLogger(String, String, AccessToken)>
	//    5    7:return          
	}

	protected void logEventImplicitly(String s, BigDecimal bigdecimal, Currency currency, Bundle bundle)
	{
		super.logEventImplicitly(s, bigdecimal, currency, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #21  <Method void AppEventsLogger.logEventImplicitly(String, BigDecimal, Currency, Bundle)>
	//    6    9:return          
	}

	protected void logPurchaseImplicitlyInternal(BigDecimal bigdecimal, Currency currency, Bundle bundle)
	{
		super.logPurchaseImplicitlyInternal(bigdecimal, currency, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #25  <Method void AppEventsLogger.logPurchaseImplicitlyInternal(BigDecimal, Currency, Bundle)>
	//    5    7:return          
	}
}
