// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;

// Referenced classes of package com.google.android.gms.location:
//			LocationServices

public static abstract class LocationServices$zza extends com.google.android.gms.internal.zzaad.zza
{

	public void setResult(Object obj)
	{
		super.zzb((Result)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #22  <Class Result>
	//    3    5:invokespecial   #26  <Method void com.google.android.gms.internal.zzaad$zza.zzb(Result)>
	//    4    8:return          
	}

	public LocationServices$zza(GoogleApiClient googleapiclient)
	{
		super(LocationServices.API, googleapiclient);
	//    0    0:aload_0         
	//    1    1:getstatic       #14  <Field com.google.android.gms.common.api.Api LocationServices.API>
	//    2    4:aload_1         
	//    3    5:invokespecial   #17  <Method void com.google.android.gms.internal.zzaad$zza(com.google.android.gms.common.api.Api, GoogleApiClient)>
	//    4    8:return          
	}
}
