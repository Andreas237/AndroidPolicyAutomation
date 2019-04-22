// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.phone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.tasks.Task;

// Referenced classes of package com.google.android.gms.auth.api.phone:
//			SmsRetrieverApi, zza

public abstract class SmsRetrieverClient extends GoogleApi
	implements SmsRetrieverApi
{

	public SmsRetrieverClient(Activity activity)
	{
		super(activity, API, ((com.google.android.gms.common.api.Api.ApiOptions) (null)), ((com.google.android.gms.common.api.internal.StatusExceptionMapper) (new ApiExceptionMapper())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #39  <Field Api API>
	//    3    5:aconst_null     
	//    4    6:new             #44  <Class ApiExceptionMapper>
	//    5    9:dup             
	//    6   10:invokespecial   #45  <Method void ApiExceptionMapper()>
	//    7   13:invokespecial   #48  <Method void GoogleApi(Activity, Api, com.google.android.gms.common.api.Api$ApiOptions, com.google.android.gms.common.api.internal.StatusExceptionMapper)>
	//    8   16:return          
	}

	public SmsRetrieverClient(Context context)
	{
		super(context, API, ((com.google.android.gms.common.api.Api.ApiOptions) (null)), ((com.google.android.gms.common.api.internal.StatusExceptionMapper) (new ApiExceptionMapper())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #39  <Field Api API>
	//    3    5:aconst_null     
	//    4    6:new             #44  <Class ApiExceptionMapper>
	//    5    9:dup             
	//    6   10:invokespecial   #45  <Method void ApiExceptionMapper()>
	//    7   13:invokespecial   #53  <Method void GoogleApi(Context, Api, com.google.android.gms.common.api.Api$ApiOptions, com.google.android.gms.common.api.internal.StatusExceptionMapper)>
	//    8   16:return          
	}

	public abstract Task startSmsRetriever();

	private static final Api API;
	private static final com.google.android.gms.common.api.Api.AbstractClientBuilder CLIENT_BUILDER;
	private static final com.google.android.gms.common.api.Api.ClientKey CLIENT_KEY;

	static 
	{
		CLIENT_KEY = new com.google.android.gms.common.api.Api.ClientKey();
	//    0    0:new             #20  <Class com.google.android.gms.common.api.Api$ClientKey>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void com.google.android.gms.common.api.Api$ClientKey()>
	//    3    7:putstatic       #25  <Field com.google.android.gms.common.api.Api$ClientKey CLIENT_KEY>
		CLIENT_BUILDER = ((com.google.android.gms.common.api.Api.AbstractClientBuilder) (new zza()));
	//    4   10:new             #27  <Class zza>
	//    5   13:dup             
	//    6   14:invokespecial   #28  <Method void zza()>
	//    7   17:putstatic       #30  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder CLIENT_BUILDER>
		API = new Api("SmsRetriever.API", CLIENT_BUILDER, CLIENT_KEY);
	//    8   20:new             #32  <Class Api>
	//    9   23:dup             
	//   10   24:ldc1            #34  <String "SmsRetriever.API">
	//   11   26:getstatic       #30  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder CLIENT_BUILDER>
	//   12   29:getstatic       #25  <Field com.google.android.gms.common.api.Api$ClientKey CLIENT_KEY>
	//   13   32:invokespecial   #37  <Method void Api(String, com.google.android.gms.common.api.Api$AbstractClientBuilder, com.google.android.gms.common.api.Api$ClientKey)>
	//   14   35:putstatic       #39  <Field Api API>
	//*  15   38:return          
	}
}
