// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.fitness.RecordingApi;
import com.google.android.gms.fitness.data.*;
import com.google.android.gms.fitness.request.*;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;

// Referenced classes of package com.google.android.gms.internal:
//			zzaoi, zzaox, zzapr

public class zzapo
	implements RecordingApi
{
	static class zza extends zzapa.zza
	{

		public void zza(ListSubscriptionsResult listsubscriptionsresult)
		{
			zzaGN.setResult(((Object) (listsubscriptionsresult)));
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
		//    1    1:invokespecial   #15  <Method void zzapa$zza()>
			zzaGN = zzb;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #17  <Field zzaad$zzb zzaGN>
		//    5    9:return          
		}

	}


	public zzapo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}

	private PendingResult zza(GoogleApiClient googleapiclient, Subscription subscription)
	{
		return ((PendingResult) (googleapiclient.zza(((zzaad.zza) (new zzaoi.zzc(googleapiclient, subscription) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
				throws RemoteException
			{
				zza((zzaoi)zzb);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #24  <Class zzaoi>
			//    3    5:invokevirtual   #27  <Method void zza(zzaoi)>
			//    4    8:return          
			}

			protected void zza(zzaoi zzaoi1)
				throws RemoteException
			{
				zzapr zzapr1 = new zzapr(((zzaad.zzb) (this)));
			//    0    0:new             #30  <Class zzapr>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #33  <Method void zzapr(zzaad$zzb)>
			//    4    8:astore_2        
				((zzaox)zzaoi1.zzxD()).zza(new zzbm(zzaUX, false, ((zzapf) (zzapr1))));
			//    5    9:aload_1         
			//    6   10:invokevirtual   #37  <Method android.os.IInterface zzaoi.zzxD()>
			//    7   13:checkcast       #39  <Class zzaox>
			//    8   16:new             #41  <Class zzbm>
			//    9   19:dup             
			//   10   20:aload_0         
			//   11   21:getfield        #15  <Field Subscription zzaUX>
			//   12   24:iconst_0        
			//   13   25:aload_2         
			//   14   26:invokespecial   #44  <Method void zzbm(Subscription, boolean, zzapf)>
			//   15   29:invokeinterface #47  <Method void zzaox.zza(zzbm)>
			//   16   34:return          
			}

			final Subscription zzaUX;

			
			{
				zzaUX = subscription;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #15  <Field Subscription zzaUX>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #18  <Method void zzaoi$zzc(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #12  <Class zzapo$3>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #28  <Method void zzapo$3(zzapo, GoogleApiClient, Subscription)>
	//    7   11:invokevirtual   #33  <Method zzaad$zza GoogleApiClient.zza(zzaad$zza)>
	//    8   14:areturn         
	}

	public PendingResult listSubscriptions(GoogleApiClient googleapiclient)
	{
		return ((PendingResult) (googleapiclient.zza(((zzaad.zza) (new zzaoi.zza(googleapiclient) {

			protected ListSubscriptionsResult zzZ(Status status)
			{
				return ListSubscriptionsResult.zzah(status);
			//    0    0:aload_1         
			//    1    1:invokestatic    #23  <Method ListSubscriptionsResult ListSubscriptionsResult.zzah(Status)>
			//    2    4:areturn         
			}

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
				throws RemoteException
			{
				zza((zzaoi)zzb);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #29  <Class zzaoi>
			//    3    5:invokevirtual   #32  <Method void zza(zzaoi)>
			//    4    8:return          
			}

			protected void zza(zzaoi zzaoi1)
				throws RemoteException
			{
				zza zza1 = new zza(((zzaad.zzb) (this)));
			//    0    0:new             #35  <Class zzapo$zza>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #38  <Method void zzapo$zza(zzaad$zzb, zzapo$1)>
			//    5    9:astore_2        
				((zzaox)zzaoi1.zzxD()).zza(new zzam(((DataType) (null)), ((zzapa) (zza1))));
			//    6   10:aload_1         
			//    7   11:invokevirtual   #42  <Method android.os.IInterface zzaoi.zzxD()>
			//    8   14:checkcast       #44  <Class zzaox>
			//    9   17:new             #46  <Class zzam>
			//   10   20:dup             
			//   11   21:aconst_null     
			//   12   22:aload_2         
			//   13   23:invokespecial   #49  <Method void zzam(DataType, zzapa)>
			//   14   26:invokeinterface #52  <Method void zzaox.zza(zzam)>
			//   15   31:return          
			}

			protected Result zzc(Status status)
			{
				return ((Result) (zzZ(status)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #56  <Method ListSubscriptionsResult zzZ(Status)>
			//    3    5:areturn         
			}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:invokespecial   #15  <Method void zzaoi$zza(GoogleApiClient)>
			//    3    5:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #8   <Class zzapo$1>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #40  <Method void zzapo$1(zzapo, GoogleApiClient)>
	//    6   10:invokevirtual   #33  <Method zzaad$zza GoogleApiClient.zza(zzaad$zza)>
	//    7   13:areturn         
	}

	public PendingResult listSubscriptions(GoogleApiClient googleapiclient, DataType datatype)
	{
		return ((PendingResult) (googleapiclient.zza(((zzaad.zza) (new zzaoi.zza(googleapiclient, datatype) {

			protected ListSubscriptionsResult zzZ(Status status)
			{
				return ListSubscriptionsResult.zzah(status);
			//    0    0:aload_1         
			//    1    1:invokestatic    #27  <Method ListSubscriptionsResult ListSubscriptionsResult.zzah(Status)>
			//    2    4:areturn         
			}

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
				throws RemoteException
			{
				zza((zzaoi)zzb);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #33  <Class zzaoi>
			//    3    5:invokevirtual   #36  <Method void zza(zzaoi)>
			//    4    8:return          
			}

			protected void zza(zzaoi zzaoi1)
				throws RemoteException
			{
				zza zza1 = new zza(((zzaad.zzb) (this)));
			//    0    0:new             #39  <Class zzapo$zza>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #42  <Method void zzapo$zza(zzaad$zzb, zzapo$1)>
			//    5    9:astore_2        
				((zzaox)zzaoi1.zzxD()).zza(new zzam(zzaUS, ((zzapa) (zza1))));
			//    6   10:aload_1         
			//    7   11:invokevirtual   #46  <Method android.os.IInterface zzaoi.zzxD()>
			//    8   14:checkcast       #48  <Class zzaox>
			//    9   17:new             #50  <Class zzam>
			//   10   20:dup             
			//   11   21:aload_0         
			//   12   22:getfield        #16  <Field DataType zzaUS>
			//   13   25:aload_2         
			//   14   26:invokespecial   #53  <Method void zzam(DataType, zzapa)>
			//   15   29:invokeinterface #56  <Method void zzaox.zza(zzam)>
			//   16   34:return          
			}

			protected Result zzc(Status status)
			{
				return ((Result) (zzZ(status)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #60  <Method ListSubscriptionsResult zzZ(Status)>
			//    3    5:areturn         
			}

			final DataType zzaUS;

			
			{
				zzaUS = datatype;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #16  <Field DataType zzaUS>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #19  <Method void zzaoi$zza(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #10  <Class zzapo$2>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #45  <Method void zzapo$2(zzapo, GoogleApiClient, DataType)>
	//    7   11:invokevirtual   #33  <Method zzaad$zza GoogleApiClient.zza(zzaad$zza)>
	//    8   14:areturn         
	}

	public PendingResult subscribe(GoogleApiClient googleapiclient, DataSource datasource)
	{
		return zza(googleapiclient, (new com.google.android.gms.fitness.data.Subscription.zza()).zzb(datasource).zzCB());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #50  <Class com.google.android.gms.fitness.data.Subscription$zza>
	//    3    5:dup             
	//    4    6:invokespecial   #51  <Method void com.google.android.gms.fitness.data.Subscription$zza()>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #55  <Method com.google.android.gms.fitness.data.Subscription$zza com.google.android.gms.fitness.data.Subscription$zza.zzb(DataSource)>
	//    7   13:invokevirtual   #59  <Method Subscription com.google.android.gms.fitness.data.Subscription$zza.zzCB()>
	//    8   16:invokespecial   #61  <Method PendingResult zza(GoogleApiClient, Subscription)>
	//    9   19:areturn         
	}

	public PendingResult subscribe(GoogleApiClient googleapiclient, DataType datatype)
	{
		return zza(googleapiclient, (new com.google.android.gms.fitness.data.Subscription.zza()).zzd(datatype).zzCB());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #50  <Class com.google.android.gms.fitness.data.Subscription$zza>
	//    3    5:dup             
	//    4    6:invokespecial   #51  <Method void com.google.android.gms.fitness.data.Subscription$zza()>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #66  <Method com.google.android.gms.fitness.data.Subscription$zza com.google.android.gms.fitness.data.Subscription$zza.zzd(DataType)>
	//    7   13:invokevirtual   #59  <Method Subscription com.google.android.gms.fitness.data.Subscription$zza.zzCB()>
	//    8   16:invokespecial   #61  <Method PendingResult zza(GoogleApiClient, Subscription)>
	//    9   19:areturn         
	}

	public PendingResult unsubscribe(GoogleApiClient googleapiclient, DataSource datasource)
	{
		return ((PendingResult) (googleapiclient.zzb(((zzaad.zza) (new zzaoi.zzc(googleapiclient, datasource) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
				throws RemoteException
			{
				zza((zzaoi)zzb);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #25  <Class zzaoi>
			//    3    5:invokevirtual   #28  <Method void zza(zzaoi)>
			//    4    8:return          
			}

			protected void zza(zzaoi zzaoi1)
				throws RemoteException
			{
				zzapr zzapr1 = new zzapr(((zzaad.zzb) (this)));
			//    0    0:new             #31  <Class zzapr>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #34  <Method void zzapr(zzaad$zzb)>
			//    4    8:astore_2        
				((zzaox)zzaoi1.zzxD()).zza(new zzbq(((DataType) (null)), zzaUY, ((zzapf) (zzapr1))));
			//    5    9:aload_1         
			//    6   10:invokevirtual   #38  <Method android.os.IInterface zzaoi.zzxD()>
			//    7   13:checkcast       #40  <Class zzaox>
			//    8   16:new             #42  <Class zzbq>
			//    9   19:dup             
			//   10   20:aconst_null     
			//   11   21:aload_0         
			//   12   22:getfield        #15  <Field DataSource zzaUY>
			//   13   25:aload_2         
			//   14   26:invokespecial   #45  <Method void zzbq(DataType, DataSource, zzapf)>
			//   15   29:invokeinterface #48  <Method void zzaox.zza(zzbq)>
			//   16   34:return          
			}

			final DataSource zzaUY;

			
			{
				zzaUY = datasource;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #15  <Field DataSource zzaUY>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #18  <Method void zzaoi$zzc(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #16  <Class zzapo$5>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #71  <Method void zzapo$5(zzapo, GoogleApiClient, DataSource)>
	//    7   11:invokevirtual   #73  <Method zzaad$zza GoogleApiClient.zzb(zzaad$zza)>
	//    8   14:areturn         
	}

	public PendingResult unsubscribe(GoogleApiClient googleapiclient, DataType datatype)
	{
		return ((PendingResult) (googleapiclient.zzb(((zzaad.zza) (new zzaoi.zzc(googleapiclient, datatype) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
				throws RemoteException
			{
				zza((zzaoi)zzb);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #25  <Class zzaoi>
			//    3    5:invokevirtual   #28  <Method void zza(zzaoi)>
			//    4    8:return          
			}

			protected void zza(zzaoi zzaoi1)
				throws RemoteException
			{
				zzapr zzapr1 = new zzapr(((zzaad.zzb) (this)));
			//    0    0:new             #31  <Class zzapr>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #34  <Method void zzapr(zzaad$zzb)>
			//    4    8:astore_2        
				((zzaox)zzaoi1.zzxD()).zza(new zzbq(zzaUS, ((DataSource) (null)), ((zzapf) (zzapr1))));
			//    5    9:aload_1         
			//    6   10:invokevirtual   #38  <Method android.os.IInterface zzaoi.zzxD()>
			//    7   13:checkcast       #40  <Class zzaox>
			//    8   16:new             #42  <Class zzbq>
			//    9   19:dup             
			//   10   20:aload_0         
			//   11   21:getfield        #15  <Field DataType zzaUS>
			//   12   24:aconst_null     
			//   13   25:aload_2         
			//   14   26:invokespecial   #45  <Method void zzbq(DataType, DataSource, zzapf)>
			//   15   29:invokeinterface #48  <Method void zzaox.zza(zzbq)>
			//   16   34:return          
			}

			final DataType zzaUS;

			
			{
				zzaUS = datatype;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #15  <Field DataType zzaUS>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #18  <Method void zzaoi$zzc(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #14  <Class zzapo$4>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #74  <Method void zzapo$4(zzapo, GoogleApiClient, DataType)>
	//    7   11:invokevirtual   #73  <Method zzaad$zza GoogleApiClient.zzb(zzaad$zza)>
	//    8   14:areturn         
	}

	public PendingResult unsubscribe(GoogleApiClient googleapiclient, Subscription subscription)
	{
		if(subscription.getDataType() == null)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #80  <Method DataType Subscription.getDataType()>
	//*   2    4:ifnonnull       17
			return unsubscribe(googleapiclient, subscription.getDataSource());
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #84  <Method DataSource Subscription.getDataSource()>
	//    7   13:invokevirtual   #86  <Method PendingResult unsubscribe(GoogleApiClient, DataSource)>
	//    8   16:areturn         
		else
			return unsubscribe(googleapiclient, subscription.getDataType());
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #80  <Method DataType Subscription.getDataType()>
	//   13   23:invokevirtual   #88  <Method PendingResult unsubscribe(GoogleApiClient, DataType)>
	//   14   26:areturn         
	}
}
