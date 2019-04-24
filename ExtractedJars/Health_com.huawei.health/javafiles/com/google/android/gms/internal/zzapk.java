// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.fitness.ConfigApi;
import com.google.android.gms.fitness.request.*;
import com.google.android.gms.fitness.result.DataTypeResult;

// Referenced classes of package com.google.android.gms.internal:
//			zzaoe, zzaot, zzapr

public class zzapk
	implements ConfigApi
{
	static class zza extends zzaoo.zza
	{

		public void zza(DataTypeResult datatyperesult)
		{
			zzaGN.setResult(((Object) (datatyperesult)));
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field zzaad$zzb zzaGN>
		//    2    4:aload_1         
		//    3    5:invokeinterface #30  <Method void zzaad$zzb.setResult(Object)>
		//    4   10:return          
		}

		private final zzaad.zzb zzaGN;

		private zza(zzaad.zzb zzb)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void zzaoo$zza()>
			zzaGN = zzb;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #17  <Field zzaad$zzb zzaGN>
		//    5    9:return          
		}

	}


	public zzapk()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}

	public PendingResult createCustomDataType(GoogleApiClient googleapiclient, DataTypeCreateRequest datatypecreaterequest)
	{
		return ((PendingResult) (googleapiclient.zzb(((zzaad.zza) (new zzaoe.zza(googleapiclient, datatypecreaterequest) {

			protected DataTypeResult zzV(Status status)
			{
				return DataTypeResult.zzaf(status);
			//    0    0:aload_1         
			//    1    1:invokestatic    #27  <Method DataTypeResult DataTypeResult.zzaf(Status)>
			//    2    4:areturn         
			}

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
				throws RemoteException
			{
				zza((zzaoe)zzb);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #33  <Class zzaoe>
			//    3    5:invokevirtual   #36  <Method void zza(zzaoe)>
			//    4    8:return          
			}

			protected void zza(zzaoe zzaoe1)
				throws RemoteException
			{
				zza zza1 = new zza(((zzaad.zzb) (this)));
			//    0    0:new             #39  <Class zzapk$zza>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #42  <Method void zzapk$zza(zzaad$zzb, zzapk$1)>
			//    5    9:astore_2        
				((zzaot)zzaoe1.zzxD()).zza(new DataTypeCreateRequest(zzaUH, ((zzaoo) (zza1))));
			//    6   10:aload_1         
			//    7   11:invokevirtual   #46  <Method android.os.IInterface zzaoe.zzxD()>
			//    8   14:checkcast       #48  <Class zzaot>
			//    9   17:new             #50  <Class DataTypeCreateRequest>
			//   10   20:dup             
			//   11   21:aload_0         
			//   12   22:getfield        #16  <Field DataTypeCreateRequest zzaUH>
			//   13   25:aload_2         
			//   14   26:invokespecial   #53  <Method void DataTypeCreateRequest(DataTypeCreateRequest, zzaoo)>
			//   15   29:invokeinterface #56  <Method void zzaot.zza(DataTypeCreateRequest)>
			//   16   34:return          
			}

			protected Result zzc(Status status)
			{
				return ((Result) (zzV(status)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #60  <Method DataTypeResult zzV(Status)>
			//    3    5:areturn         
			}

			final DataTypeCreateRequest zzaUH;

			
			{
				zzaUH = datatypecreaterequest;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #16  <Field DataTypeCreateRequest zzaUH>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #19  <Method void zzaoe$zza(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #8   <Class zzapk$1>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #25  <Method void zzapk$1(zzapk, GoogleApiClient, DataTypeCreateRequest)>
	//    7   11:invokevirtual   #31  <Method zzaad$zza GoogleApiClient.zzb(zzaad$zza)>
	//    8   14:areturn         
	}

	public PendingResult disableFit(GoogleApiClient googleapiclient)
	{
		return ((PendingResult) (googleapiclient.zzb(((zzaad.zza) (new zzaoe.zzc(googleapiclient) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
				throws RemoteException
			{
				zza((zzaoe)zzb);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #21  <Class zzaoe>
			//    3    5:invokevirtual   #24  <Method void zza(zzaoe)>
			//    4    8:return          
			}

			protected void zza(zzaoe zzaoe1)
				throws RemoteException
			{
				zzapr zzapr1 = new zzapr(((zzaad.zzb) (this)));
			//    0    0:new             #27  <Class zzapr>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #30  <Method void zzapr(zzaad$zzb)>
			//    4    8:astore_2        
				((zzaot)zzaoe1.zzxD()).zza(new zzw(((zzapf) (zzapr1))));
			//    5    9:aload_1         
			//    6   10:invokevirtual   #34  <Method android.os.IInterface zzaoe.zzxD()>
			//    7   13:checkcast       #36  <Class zzaot>
			//    8   16:new             #38  <Class zzw>
			//    9   19:dup             
			//   10   20:aload_2         
			//   11   21:invokespecial   #41  <Method void zzw(zzapf)>
			//   12   24:invokeinterface #44  <Method void zzaot.zza(zzw)>
			//   13   29:return          
			}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:invokespecial   #14  <Method void zzaoe$zzc(GoogleApiClient)>
			//    3    5:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #12  <Class zzapk$3>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #38  <Method void zzapk$3(zzapk, GoogleApiClient)>
	//    6   10:invokevirtual   #31  <Method zzaad$zza GoogleApiClient.zzb(zzaad$zza)>
	//    7   13:areturn         
	}

	public PendingResult readDataType(GoogleApiClient googleapiclient, String s)
	{
		return ((PendingResult) (googleapiclient.zza(((zzaad.zza) (new zzaoe.zza(googleapiclient, s) {

			protected DataTypeResult zzV(Status status)
			{
				return DataTypeResult.zzaf(status);
			//    0    0:aload_1         
			//    1    1:invokestatic    #27  <Method DataTypeResult DataTypeResult.zzaf(Status)>
			//    2    4:areturn         
			}

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
				throws RemoteException
			{
				zza((zzaoe)zzb);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #33  <Class zzaoe>
			//    3    5:invokevirtual   #36  <Method void zza(zzaoe)>
			//    4    8:return          
			}

			protected void zza(zzaoe zzaoe1)
				throws RemoteException
			{
				zza zza1 = new zza(((zzaad.zzb) (this)));
			//    0    0:new             #39  <Class zzapk$zza>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #42  <Method void zzapk$zza(zzaad$zzb, zzapk$1)>
			//    5    9:astore_2        
				((zzaot)zzaoe1.zzxD()).zza(new zzn(zzaUI, ((zzaoo) (zza1))));
			//    6   10:aload_1         
			//    7   11:invokevirtual   #46  <Method android.os.IInterface zzaoe.zzxD()>
			//    8   14:checkcast       #48  <Class zzaot>
			//    9   17:new             #50  <Class zzn>
			//   10   20:dup             
			//   11   21:aload_0         
			//   12   22:getfield        #16  <Field String zzaUI>
			//   13   25:aload_2         
			//   14   26:invokespecial   #53  <Method void zzn(String, zzaoo)>
			//   15   29:invokeinterface #56  <Method void zzaot.zza(zzn)>
			//   16   34:return          
			}

			protected Result zzc(Status status)
			{
				return ((Result) (zzV(status)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #60  <Method DataTypeResult zzV(Status)>
			//    3    5:areturn         
			}

			final String zzaUI;

			
			{
				zzaUI = s;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #16  <Field String zzaUI>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #19  <Method void zzaoe$zza(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #10  <Class zzapk$2>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #44  <Method void zzapk$2(zzapk, GoogleApiClient, String)>
	//    7   11:invokevirtual   #46  <Method zzaad$zza GoogleApiClient.zza(zzaad$zza)>
	//    8   14:areturn         
	}
}
