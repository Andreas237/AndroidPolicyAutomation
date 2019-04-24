// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.zzac;

// Referenced classes of package com.google.android.gms.internal:
//			zzaod

static abstract class zzaod$zzc extends zzaod$zza
{

	protected Status zzb(Status status)
	{
		boolean flag;
		if(!status.isSuccess())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #21  <Method boolean Status.isSuccess()>
	//*   2    4:ifne            12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		zzac.zzax(flag);
	//    8   14:iload_2         
	//    9   15:invokestatic    #27  <Method void zzac.zzax(boolean)>
		return status;
	//   10   18:aload_1         
	//   11   19:areturn         
	}

	protected Result zzc(Status status)
	{
		return ((Result) (zzb(status)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #30  <Method Status zzb(Status)>
	//    3    5:areturn         
	}

	zzaod$zzc(GoogleApiClient googleapiclient)
	{
		super(googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void zzaod$zza(GoogleApiClient)>
	//    3    5:return          
	}
}
