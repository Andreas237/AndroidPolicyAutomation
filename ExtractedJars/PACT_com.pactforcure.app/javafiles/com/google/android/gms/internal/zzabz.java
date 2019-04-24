// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzaby, zzabw, zzacb, zzacd

public final class zzabz
	implements zzaby
{
	private static class zza extends zzabw
	{

		public void zzcX(int i)
			throws RemoteException
		{
			zzaFq.setResult(((Object) (new Status(i))));
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field zzzv$zzb zzaFq>
		//    2    4:new             #26  <Class Status>
		//    3    7:dup             
		//    4    8:iload_1         
		//    5    9:invokespecial   #28  <Method void Status(int)>
		//    6   12:invokeinterface #34  <Method void zzzv$zzb.setResult(Object)>
		//    7   17:return          
		}

		private final zzzv.zzb zzaFq;

		public zza(zzzv.zzb zzb)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void zzabw()>
			zzaFq = zzb;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #17  <Field zzzv$zzb zzaFq>
		//    5    9:return          
		}
	}


	public zzabz()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public PendingResult zzg(GoogleApiClient googleapiclient)
	{
		return ((PendingResult) (googleapiclient.zzb(((zzzv.zza) (new zzaca.zza(googleapiclient) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
				throws RemoteException
			{
				zza((zzacb)zzb);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #21  <Class zzacb>
			//    3    5:invokevirtual   #24  <Method void zza(zzacb)>
			//    4    8:return          
			}

			protected void zza(zzacb zzacb1)
				throws RemoteException
			{
				((zzacd)zzacb1.zzwW()).zza(((zzacc) (new zza(((zzzv.zzb) (this))))));
			//    0    0:aload_1         
			//    1    1:invokevirtual   #29  <Method android.os.IInterface zzacb.zzwW()>
			//    2    4:checkcast       #31  <Class zzacd>
			//    3    7:new             #33  <Class zzabz$zza>
			//    4   10:dup             
			//    5   11:aload_0         
			//    6   12:invokespecial   #36  <Method void zzabz$zza(zzzv$zzb)>
			//    7   15:invokeinterface #39  <Method void zzacd.zza(zzacc)>
			//    8   20:return          
			}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:invokespecial   #14  <Method void zzaca$zza(GoogleApiClient)>
			//    3    5:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #8   <Class zzabz$1>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #21  <Method void zzabz$1(zzabz, GoogleApiClient)>
	//    6   10:invokevirtual   #27  <Method zzzv$zza GoogleApiClient.zzb(zzzv$zza)>
	//    7   13:areturn         
	}
}
