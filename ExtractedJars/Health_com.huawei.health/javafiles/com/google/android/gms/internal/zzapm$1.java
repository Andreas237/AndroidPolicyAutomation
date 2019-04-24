// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.request.zzg;

// Referenced classes of package com.google.android.gms.internal:
//			zzapm, zzaog, zzapr, zzaov

class zzapm$1 extends c
{

	protected volatile void zza(com.google.android.gms.common.api.Api$zzb api$zzb)
		throws RemoteException
	{
		zza((zzaog)api$zzb);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #28  <Class zzaog>
	//    3    5:invokevirtual   #31  <Method void zza(zzaog)>
	//    4    8:return          
	}

	protected void zza(zzaog zzaog1)
		throws RemoteException
	{
		zzapr zzapr1 = new zzapr(((b) (this)));
	//    0    0:new             #34  <Class zzapr>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #37  <Method void zzapr(zzaad$zzb)>
	//    4    8:astore_2        
		((zzaov)zzaog1.zzxD()).zza(new zzg(zzaUL, ((zzapf) (zzapr1)), zzaUM));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #41  <Method android.os.IInterface zzaog.zzxD()>
	//    7   13:checkcast       #43  <Class zzaov>
	//    8   16:new             #45  <Class zzg>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:getfield        #17  <Field DataSet zzaUL>
	//   12   24:aload_2         
	//   13   25:aload_0         
	//   14   26:getfield        #19  <Field boolean zzaUM>
	//   15   29:invokespecial   #48  <Method void zzg(DataSet, zzapf, boolean)>
	//   16   32:invokeinterface #51  <Method void zzaov.zza(zzg)>
	//   17   37:return          
	}

	final DataSet zzaUL;
	final boolean zzaUM;

	zzapm$1(zzapm zzapm1, GoogleApiClient googleapiclient, DataSet dataset, boolean flag)
	{
		zzaUL = dataset;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #17  <Field DataSet zzaUL>
		zzaUM = flag;
	//    3    5:aload_0         
	//    4    6:iload           4
	//    5    8:putfield        #19  <Field boolean zzaUM>
		super(googleapiclient);
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:invokespecial   #22  <Method void zzaog$zzc(GoogleApiClient)>
	//    9   16:return          
	}
}
