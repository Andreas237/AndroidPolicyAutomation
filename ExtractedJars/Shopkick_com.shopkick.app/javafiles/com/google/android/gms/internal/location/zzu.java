// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.location;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal.location:
//			zzab, zzaz, zzq

final class zzu extends zzab
{

	zzu(zzq zzq, GoogleApiClient googleapiclient, Location location)
	{
		zzco = location;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #10  <Field Location zzco>
		super(googleapiclient);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #13  <Method void zzab(GoogleApiClient)>
	//    6   10:return          
	}

	protected final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		((zzaz)anyclient).zza(zzco);
	//    0    0:aload_1         
	//    1    1:checkcast       #20  <Class zzaz>
	//    2    4:aload_0         
	//    3    5:getfield        #10  <Field Location zzco>
	//    4    8:invokevirtual   #24  <Method void zzaz.zza(Location)>
		setResult(((com.google.android.gms.common.api.Result) (Status.RESULT_SUCCESS)));
	//    5   11:aload_0         
	//    6   12:getstatic       #30  <Field Status Status.RESULT_SUCCESS>
	//    7   15:invokevirtual   #34  <Method void setResult(com.google.android.gms.common.api.Result)>
	//    8   18:return          
	}

	private final Location zzco;
}
