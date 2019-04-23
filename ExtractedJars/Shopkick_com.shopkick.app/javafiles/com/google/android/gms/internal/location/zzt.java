// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal.location:
//			zzab, zzaz, zzq

final class zzt extends zzab
{

	zzt(zzq zzq, GoogleApiClient googleapiclient, boolean flag)
	{
		zzcn = flag;
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:putfield        #10  <Field boolean zzcn>
		super(googleapiclient);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #13  <Method void zzab(GoogleApiClient)>
	//    6   10:return          
	}

	protected final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		((zzaz)anyclient).zza(zzcn);
	//    0    0:aload_1         
	//    1    1:checkcast       #20  <Class zzaz>
	//    2    4:aload_0         
	//    3    5:getfield        #10  <Field boolean zzcn>
	//    4    8:invokevirtual   #24  <Method void zzaz.zza(boolean)>
		setResult(((com.google.android.gms.common.api.Result) (Status.RESULT_SUCCESS)));
	//    5   11:aload_0         
	//    6   12:getstatic       #30  <Field Status Status.RESULT_SUCCESS>
	//    7   15:invokevirtual   #34  <Method void setResult(com.google.android.gms.common.api.Result)>
	//    8   18:return          
	}

	private final boolean zzcn;
}
