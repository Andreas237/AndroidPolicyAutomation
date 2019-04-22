// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.identity.intents;

import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.identity.intents:
//			Address

private static abstract class Address$zza extends com.google.android.gms.common.api.internal.tation.ApiMethodImpl
{

	public Result createFailedResult(Status status)
	{
		return ((Result) (status));
	//    0    0:aload_1         
	//    1    1:areturn         
	}

	public Address$zza(GoogleApiClient googleapiclient)
	{
		super(Address.API, googleapiclient);
	//    0    0:aload_0         
	//    1    1:getstatic       #14  <Field com.google.android.gms.common.api.Api Address.API>
	//    2    4:aload_1         
	//    3    5:invokespecial   #17  <Method void com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl(com.google.android.gms.common.api.Api, GoogleApiClient)>
	//    4    8:return          
	}
}
