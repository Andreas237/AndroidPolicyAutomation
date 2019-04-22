// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.account;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.zzk;

// Referenced classes of package com.google.android.gms.auth.account:
//			zzi, WorkAccountClient, WorkAccountApi

public class WorkAccount
{

	private WorkAccount()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
	//    2    4:return          
	}

	public static WorkAccountClient getClient(Activity activity)
	{
		return new WorkAccountClient(activity);
	//    0    0:new             #51  <Class WorkAccountClient>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #54  <Method void WorkAccountClient(Activity)>
	//    4    8:areturn         
	}

	public static WorkAccountClient getClient(Context context)
	{
		return new WorkAccountClient(context);
	//    0    0:new             #51  <Class WorkAccountClient>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #59  <Method void WorkAccountClient(Context)>
	//    4    8:areturn         
	}

	public static final Api API;
	private static final com.google.android.gms.common.api.Api.AbstractClientBuilder CLIENT_BUILDER;
	private static final com.google.android.gms.common.api.Api.ClientKey CLIENT_KEY;
	public static final WorkAccountApi WorkAccountApi = new zzk();

	static 
	{
		CLIENT_KEY = new com.google.android.gms.common.api.Api.ClientKey();
	//    0    0:new             #20  <Class com.google.android.gms.common.api.Api$ClientKey>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void com.google.android.gms.common.api.Api$ClientKey()>
	//    3    7:putstatic       #25  <Field com.google.android.gms.common.api.Api$ClientKey CLIENT_KEY>
		CLIENT_BUILDER = ((com.google.android.gms.common.api.Api.AbstractClientBuilder) (new zzi()));
	//    4   10:new             #27  <Class zzi>
	//    5   13:dup             
	//    6   14:invokespecial   #28  <Method void zzi()>
	//    7   17:putstatic       #30  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder CLIENT_BUILDER>
		API = new Api("WorkAccount.API", CLIENT_BUILDER, CLIENT_KEY);
	//    8   20:new             #32  <Class Api>
	//    9   23:dup             
	//   10   24:ldc1            #34  <String "WorkAccount.API">
	//   11   26:getstatic       #30  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder CLIENT_BUILDER>
	//   12   29:getstatic       #25  <Field com.google.android.gms.common.api.Api$ClientKey CLIENT_KEY>
	//   13   32:invokespecial   #37  <Method void Api(String, com.google.android.gms.common.api.Api$AbstractClientBuilder, com.google.android.gms.common.api.Api$ClientKey)>
	//   14   35:putstatic       #39  <Field Api API>
	//   15   38:new             #41  <Class zzk>
	//   16   41:dup             
	//   17   42:invokespecial   #42  <Method void zzk()>
	//   18   45:putstatic       #44  <Field WorkAccountApi WorkAccountApi>
	//*  19   48:return          
	}
}
