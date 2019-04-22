// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.Api;

// Referenced classes of package com.google.android.gms.common.internal.service:
//			zza, CommonApiImpl, CommonApi

public final class Common
{

	public Common()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
	//    2    4:return          
	}

	public static final Api API;
	private static final com.google.android.gms.common.api.Api.AbstractClientBuilder CLIENT_BUILDER;
	public static final com.google.android.gms.common.api.Api.ClientKey CLIENT_KEY;
	public static final CommonApi CommonApi = new CommonApiImpl();

	static 
	{
		CLIENT_KEY = new com.google.android.gms.common.api.Api.ClientKey();
	//    0    0:new             #19  <Class com.google.android.gms.common.api.Api$ClientKey>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void com.google.android.gms.common.api.Api$ClientKey()>
	//    3    7:putstatic       #24  <Field com.google.android.gms.common.api.Api$ClientKey CLIENT_KEY>
		CLIENT_BUILDER = ((com.google.android.gms.common.api.Api.AbstractClientBuilder) (new zza()));
	//    4   10:new             #26  <Class zza>
	//    5   13:dup             
	//    6   14:invokespecial   #27  <Method void zza()>
	//    7   17:putstatic       #29  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder CLIENT_BUILDER>
		API = new Api("Common.API", CLIENT_BUILDER, CLIENT_KEY);
	//    8   20:new             #31  <Class Api>
	//    9   23:dup             
	//   10   24:ldc1            #33  <String "Common.API">
	//   11   26:getstatic       #29  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder CLIENT_BUILDER>
	//   12   29:getstatic       #24  <Field com.google.android.gms.common.api.Api$ClientKey CLIENT_KEY>
	//   13   32:invokespecial   #36  <Method void Api(String, com.google.android.gms.common.api.Api$AbstractClientBuilder, com.google.android.gms.common.api.Api$ClientKey)>
	//   14   35:putstatic       #38  <Field Api API>
	//   15   38:new             #40  <Class CommonApiImpl>
	//   16   41:dup             
	//   17   42:invokespecial   #41  <Method void CommonApiImpl()>
	//   18   45:putstatic       #43  <Field CommonApi CommonApi>
	//*  19   48:return          
	}
}
