// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzacg, zzace, zzacj, zzacl

public final class zzach
	implements zzacg
{
	static class zza extends zzace
	{

		public void zzdd(int i)
			throws RemoteException
		{
			zzaGN.setResult(((Object) (new Status(i))));
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field zzaad$zzb zzaGN>
		//    2    4:new             #26  <Class Status>
		//    3    7:dup             
		//    4    8:iload_1         
		//    5    9:invokespecial   #28  <Method void Status(int)>
		//    6   12:invokeinterface #34  <Method void zzaad$zzb.setResult(Object)>
		//    7   17:return          
		}

		private final zzaad.zzb zzaGN;

		public zza(zzaad.zzb zzb)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void zzace()>
			zzaGN = zzb;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #17  <Field zzaad$zzb zzaGN>
		//    5    9:return          
		}
	}


	public zzach()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public PendingResult zzg(GoogleApiClient googleapiclient)
	{
		return ((PendingResult) (googleapiclient.zzb(((zzaad.zza) (new zzaci.zza(googleapiclient) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
				throws RemoteException
			{
				zza((zzacj)zzb);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #21  <Class zzacj>
			//    3    5:invokevirtual   #24  <Method void zza(zzacj)>
			//    4    8:return          
			}

			protected void zza(zzacj zzacj1)
				throws RemoteException
			{
				((zzacl)zzacj1.zzxD()).zza(((zzack) (new zza(((zzaad.zzb) (this))))));
			//    0    0:aload_1         
			//    1    1:invokevirtual   #29  <Method android.os.IInterface zzacj.zzxD()>
			//    2    4:checkcast       #31  <Class zzacl>
			//    3    7:new             #33  <Class zzach$zza>
			//    4   10:dup             
			//    5   11:aload_0         
			//    6   12:invokespecial   #36  <Method void zzach$zza(zzaad$zzb)>
			//    7   15:invokeinterface #39  <Method void zzacl.zza(zzack)>
			//    8   20:return          
			}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:invokespecial   #14  <Method void zzaci$zza(GoogleApiClient)>
			//    3    5:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #8   <Class zzach$1>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #21  <Method void zzach$1(zzach, GoogleApiClient)>
	//    6   10:invokevirtual   #27  <Method zzaad$zza GoogleApiClient.zzb(zzaad$zza)>
	//    7   13:areturn         
	}
}
