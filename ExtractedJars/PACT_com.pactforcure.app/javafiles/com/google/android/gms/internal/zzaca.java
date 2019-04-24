// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzabx

abstract class zzaca extends zzzv.zza
{
	static abstract class zza extends zzaca
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
		//    2    2:invokevirtual   #17  <Method Status zzb(Status)>
		//    3    5:areturn         
		}

		public zza(GoogleApiClient googleapiclient)
		{
			super(googleapiclient);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #10  <Method void zzaca(GoogleApiClient)>
		//    3    5:return          
		}
	}


	public zzaca(GoogleApiClient googleapiclient)
	{
		super(zzabx.API, googleapiclient);
	//    0    0:aload_0         
	//    1    1:getstatic       #16  <Field com.google.android.gms.common.api.Api zzabx.API>
	//    2    4:aload_1         
	//    3    5:invokespecial   #19  <Method void zzzv$zza(com.google.android.gms.common.api.Api, GoogleApiClient)>
	//    4    8:return          
	}
}
