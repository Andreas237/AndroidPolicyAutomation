// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzaru

static abstract class zzaru$zza extends com.google.android.gms.location.cognition.zza
{

	public Status zzb(Status status)
	{
		return status;
	//    0    0:aload_1         
	//    1    1:areturn         
	}

	public Result zzc(Status status)
	{
		return ((Result) (zzb(status)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #19  <Method Status zzb(Status)>
	//    3    5:areturn         
	}

	public zzaru$zza(GoogleApiClient googleapiclient)
	{
		super(googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void com.google.android.gms.location.ActivityRecognition$zza(GoogleApiClient)>
	//    3    5:return          
	}
}
