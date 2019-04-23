// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.*;

abstract class zzab extends com.google.android.gms.location.LocationServices.zza
{

	public zzab(GoogleApiClient googleapiclient)
	{
		super(googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void com.google.android.gms.location.LocationServices$zza(GoogleApiClient)>
	//    3    5:return          
	}

	public Result createFailedResult(Status status)
	{
		return ((Result) (status));
	//    0    0:aload_1         
	//    1    1:areturn         
	}
}
