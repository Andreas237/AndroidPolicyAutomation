// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.api.GoogleApiClient;

abstract class zzp extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
{

	public zzp(GoogleApiClient googleapiclient)
	{
		super(Auth.GOOGLE_SIGN_IN_API, googleapiclient);
	//    0    0:aload_0         
	//    1    1:getstatic       #13  <Field com.google.android.gms.common.api.Api Auth.GOOGLE_SIGN_IN_API>
	//    2    4:aload_1         
	//    3    5:invokespecial   #16  <Method void com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl(com.google.android.gms.common.api.Api, GoogleApiClient)>
	//    4    8:return          
	}
}
