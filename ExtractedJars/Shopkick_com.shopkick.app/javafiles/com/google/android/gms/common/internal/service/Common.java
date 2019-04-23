// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.Api;

// Referenced classes of package com.google.android.gms.common.internal.service:
//			zab, zad, zac

public final class Common
{

	public Common()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
	//    2    4:return          
	}

	public static final Api API;
	public static final com.google.android.gms.common.api.Api.ClientKey CLIENT_KEY;
	private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zapg;
	public static final zac zaph = new zad();

	static 
	{
		CLIENT_KEY = new com.google.android.gms.common.api.Api.ClientKey();
	//    0    0:new             #20  <Class com.google.android.gms.common.api.Api$ClientKey>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void com.google.android.gms.common.api.Api$ClientKey()>
	//    3    7:putstatic       #25  <Field com.google.android.gms.common.api.Api$ClientKey CLIENT_KEY>
		zapg = ((com.google.android.gms.common.api.Api.AbstractClientBuilder) (new zab()));
	//    4   10:new             #27  <Class zab>
	//    5   13:dup             
	//    6   14:invokespecial   #28  <Method void zab()>
	//    7   17:putstatic       #30  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zapg>
		API = new Api("Common.API", zapg, CLIENT_KEY);
	//    8   20:new             #32  <Class Api>
	//    9   23:dup             
	//   10   24:ldc1            #34  <String "Common.API">
	//   11   26:getstatic       #30  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zapg>
	//   12   29:getstatic       #25  <Field com.google.android.gms.common.api.Api$ClientKey CLIENT_KEY>
	//   13   32:invokespecial   #37  <Method void Api(String, com.google.android.gms.common.api.Api$AbstractClientBuilder, com.google.android.gms.common.api.Api$ClientKey)>
	//   14   35:putstatic       #39  <Field Api API>
	//   15   38:new             #41  <Class zad>
	//   16   41:dup             
	//   17   42:invokespecial   #42  <Method void zad()>
	//   18   45:putstatic       #44  <Field zac zaph>
	//*  19   48:return          
	}
}
