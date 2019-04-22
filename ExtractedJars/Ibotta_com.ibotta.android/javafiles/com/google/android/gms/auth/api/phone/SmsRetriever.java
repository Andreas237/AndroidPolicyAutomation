// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.phone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.auth-api-phone.zzj;

// Referenced classes of package com.google.android.gms.auth.api.phone:
//			SmsRetrieverClient

public final class SmsRetriever
{

	private SmsRetriever()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	public static SmsRetrieverClient getClient(Activity activity)
	{
		return ((SmsRetrieverClient) (new zzj(activity)));
	//    0    0:new             #24  <Class zzj>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #27  <Method void zzj(Activity)>
	//    4    8:areturn         
	}

	public static SmsRetrieverClient getClient(Context context)
	{
		return ((SmsRetrieverClient) (new zzj(context)));
	//    0    0:new             #24  <Class zzj>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #32  <Method void zzj(Context)>
	//    4    8:areturn         
	}

	public static final String EXTRA_SMS_MESSAGE = "com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE";
	public static final String EXTRA_STATUS = "com.google.android.gms.auth.api.phone.EXTRA_STATUS";
	public static final String SMS_RETRIEVED_ACTION = "com.google.android.gms.auth.api.phone.SMS_RETRIEVED";
}
