// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.Cast;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

public abstract class zzcf extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
{

	public zzcf(GoogleApiClient googleapiclient)
	{
		super(Cast.API, googleapiclient);
	//    0    0:aload_0         
	//    1    1:getstatic       #13  <Field com.google.android.gms.common.api.Api Cast.API>
	//    2    4:aload_1         
	//    3    5:invokespecial   #16  <Method void com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl(com.google.android.gms.common.api.Api, GoogleApiClient)>
	//    4    8:return          
	}

	public final void zzk(int i)
	{
		setResult(createFailedResult(new Status(2001)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:new             #21  <Class Status>
	//    3    5:dup             
	//    4    6:sipush          2001
	//    5    9:invokespecial   #23  <Method void Status(int)>
	//    6   12:invokevirtual   #27  <Method com.google.android.gms.common.api.Result createFailedResult(Status)>
	//    7   15:invokevirtual   #31  <Method void setResult(com.google.android.gms.common.api.Result)>
	//    8   18:return          
	}
}
