// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.fitness.SensorsApi;
import com.google.android.gms.fitness.data.zzs;
import com.google.android.gms.fitness.request.*;
import com.google.android.gms.fitness.result.DataSourcesResult;

// Referenced classes of package com.google.android.gms.internal:
//			zzaoj, zzaoc, zzaoy, zzapr

public class zzapp
	implements SensorsApi
{
	static interface zza
	{

		public abstract void zzCJ();
	}

	static class zzb extends zzapf.zza
	{

		public void zzp(Status status)
		{
			if(zzaVg != null && status.isSuccess())
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field zzapp$zza zzaVg>
		//*   2    4:ifnull          23
		//*   3    7:aload_1         
		//*   4    8:invokevirtual   #35  <Method boolean Status.isSuccess()>
		//*   5   11:ifeq            23
				zzaVg.zzCJ();
		//    6   14:aload_0         
		//    7   15:getfield        #21  <Field zzapp$zza zzaVg>
		//    8   18:invokeinterface #40  <Method void zzapp$zza.zzCJ()>
			zzaGN.setResult(((Object) (status)));
		//    9   23:aload_0         
		//   10   24:getfield        #19  <Field zzaad$zzb zzaGN>
		//   11   27:aload_1         
		//   12   28:invokeinterface #46  <Method void zzaad$zzb.setResult(Object)>
		//   13   33:return          
		}

		private final zzaad.zzb zzaGN;
		private final zza zzaVg;

		private zzb(zzaad.zzb zzb1, zza zza1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void zzapf$zza()>
			zzaGN = zzb1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field zzaad$zzb zzaGN>
			zzaVg = zza1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #21  <Field zzapp$zza zzaVg>
		//    8   14:return          
		}

	}


	public zzapp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:return          
	}

	private PendingResult zza(GoogleApiClient googleapiclient, zzs zzs, PendingIntent pendingintent, zza zza1)
	{
		return ((PendingResult) (googleapiclient.zzb(((zzaad.zza) (new zzaoj.zzc(googleapiclient, zza1, zzs, pendingintent) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzaoj)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #32  <Class zzaoj>
			//    3    5:invokevirtual   #35  <Method void zza(zzaoj)>
			//    4    8:return          
			}

			protected void zza(zzaoj zzaoj1)
				throws RemoteException
			{
				zzb zzb1 = new zzb(((zzaad.zzb) (this)), zzaVe);
			//    0    0:new             #38  <Class zzapp$zzb>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:aload_0         
			//    4    6:getfield        #19  <Field zzapp$zza zzaVe>
			//    5    9:aconst_null     
			//    6   10:invokespecial   #41  <Method void zzapp$zzb(zzaad$zzb, zzapp$zza, zzapp$1)>
			//    7   13:astore_2        
				((zzaoy)zzaoj1.zzxD()).zza(new zzax(zzaVf, zzaUQ, ((zzapf) (zzb1))));
			//    8   14:aload_1         
			//    9   15:invokevirtual   #45  <Method android.os.IInterface zzaoj.zzxD()>
			//   10   18:checkcast       #47  <Class zzaoy>
			//   11   21:new             #49  <Class zzax>
			//   12   24:dup             
			//   13   25:aload_0         
			//   14   26:getfield        #21  <Field zzs zzaVf>
			//   15   29:aload_0         
			//   16   30:getfield        #23  <Field PendingIntent zzaUQ>
			//   17   33:aload_2         
			//   18   34:invokespecial   #52  <Method void zzax(zzs, PendingIntent, zzapf)>
			//   19   37:invokeinterface #55  <Method void zzaoy.zza(zzax)>
			//   20   42:return          
			}

			protected Status zzb(Status status)
			{
				return status;
			//    0    0:aload_1         
			//    1    1:areturn         
			}

			protected Result zzc(Status status)
			{
				return ((Result) (zzb(status)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #61  <Method Status zzb(Status)>
			//    3    5:areturn         
			}

			final PendingIntent zzaUQ;
			final zza zzaVe;
			final zzs zzaVf;

			
			{
				zzaVe = zza1;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #19  <Field zzapp$zza zzaVe>
				zzaVf = zzs;
			//    3    5:aload_0         
			//    4    6:aload           4
			//    5    8:putfield        #21  <Field zzs zzaVf>
				zzaUQ = pendingintent;
			//    6   11:aload_0         
			//    7   12:aload           5
			//    8   14:putfield        #23  <Field PendingIntent zzaUQ>
				super(googleapiclient);
			//    9   17:aload_0         
			//   10   18:aload_2         
			//   11   19:invokespecial   #26  <Method void zzaoj$zzc(GoogleApiClient)>
			//   12   22:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #14  <Class zzapp$4>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload           4
	//    6    9:aload_2         
	//    7   10:aload_3         
	//    8   11:invokespecial   #29  <Method void zzapp$4(zzapp, GoogleApiClient, zzapp$zza, zzs, PendingIntent)>
	//    9   14:invokevirtual   #34  <Method zzaad$zza GoogleApiClient.zzb(zzaad$zza)>
	//   10   17:areturn         
	}

	private PendingResult zza(GoogleApiClient googleapiclient, SensorRequest sensorrequest, zzs zzs, PendingIntent pendingintent)
	{
		return ((PendingResult) (googleapiclient.zza(((zzaad.zza) (new zzaoj.zzc(googleapiclient, sensorrequest, zzs, pendingintent) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzaoj)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #32  <Class zzaoj>
			//    3    5:invokevirtual   #35  <Method void zza(zzaoj)>
			//    4    8:return          
			}

			protected void zza(zzaoj zzaoj1)
				throws RemoteException
			{
				zzapr zzapr1 = new zzapr(((zzaad.zzb) (this)));
			//    0    0:new             #38  <Class zzapr>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #41  <Method void zzapr(zzaad$zzb)>
			//    4    8:astore_2        
				((zzaoy)zzaoj1.zzxD()).zza(new zzav(zzaVa, zzaVb, zzaVc, ((zzapf) (zzapr1))));
			//    5    9:aload_1         
			//    6   10:invokevirtual   #45  <Method android.os.IInterface zzaoj.zzxD()>
			//    7   13:checkcast       #47  <Class zzaoy>
			//    8   16:new             #49  <Class zzav>
			//    9   19:dup             
			//   10   20:aload_0         
			//   11   21:getfield        #19  <Field SensorRequest zzaVa>
			//   12   24:aload_0         
			//   13   25:getfield        #21  <Field zzs zzaVb>
			//   14   28:aload_0         
			//   15   29:getfield        #23  <Field PendingIntent zzaVc>
			//   16   32:aload_2         
			//   17   33:invokespecial   #52  <Method void zzav(SensorRequest, zzs, PendingIntent, zzapf)>
			//   18   36:invokeinterface #55  <Method void zzaoy.zza(zzav)>
			//   19   41:return          
			}

			protected Status zzb(Status status)
			{
				return status;
			//    0    0:aload_1         
			//    1    1:areturn         
			}

			protected Result zzc(Status status)
			{
				return ((Result) (zzb(status)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #61  <Method Status zzb(Status)>
			//    3    5:areturn         
			}

			final SensorRequest zzaVa;
			final zzs zzaVb;
			final PendingIntent zzaVc;

			
			{
				zzaVa = sensorrequest;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #19  <Field SensorRequest zzaVa>
				zzaVb = zzs;
			//    3    5:aload_0         
			//    4    6:aload           4
			//    5    8:putfield        #21  <Field zzs zzaVb>
				zzaVc = pendingintent;
			//    6   11:aload_0         
			//    7   12:aload           5
			//    8   14:putfield        #23  <Field PendingIntent zzaVc>
				super(googleapiclient);
			//    9   17:aload_0         
			//   10   18:aload_2         
			//   11   19:invokespecial   #26  <Method void zzaoj$zzc(GoogleApiClient)>
			//   12   22:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #10  <Class zzapp$2>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:aload           4
	//    8   11:invokespecial   #40  <Method void zzapp$2(zzapp, GoogleApiClient, SensorRequest, zzs, PendingIntent)>
	//    9   14:invokevirtual   #42  <Method zzaad$zza GoogleApiClient.zza(zzaad$zza)>
	//   10   17:areturn         
	}

	public PendingResult add(GoogleApiClient googleapiclient, SensorRequest sensorrequest, PendingIntent pendingintent)
	{
		return zza(googleapiclient, sensorrequest, ((zzs) (null)), pendingintent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aload_3         
	//    5    5:invokespecial   #47  <Method PendingResult zza(GoogleApiClient, SensorRequest, zzs, PendingIntent)>
	//    6    8:areturn         
	}

	public PendingResult add(GoogleApiClient googleapiclient, SensorRequest sensorrequest, OnDataPointListener ondatapointlistener)
	{
		return zza(googleapiclient, sensorrequest, ((zzs) (com.google.android.gms.fitness.request.zzao.zza.zzDa().zza(ondatapointlistener))), ((PendingIntent) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #55  <Method com.google.android.gms.fitness.request.zzao$zza com.google.android.gms.fitness.request.zzao$zza.zzDa()>
	//    4    6:aload_3         
	//    5    7:invokevirtual   #58  <Method com.google.android.gms.fitness.request.zzao com.google.android.gms.fitness.request.zzao$zza.zza(OnDataPointListener)>
	//    6   10:aconst_null     
	//    7   11:invokespecial   #47  <Method PendingResult zza(GoogleApiClient, SensorRequest, zzs, PendingIntent)>
	//    8   14:areturn         
	}

	public PendingResult findDataSources(GoogleApiClient googleapiclient, DataSourcesRequest datasourcesrequest)
	{
		return ((PendingResult) (googleapiclient.zza(((zzaad.zza) (new zzaoj.zza(googleapiclient, datasourcesrequest) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzaoj)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class zzaoj>
			//    3    5:invokevirtual   #29  <Method void zza(zzaoj)>
			//    4    8:return          
			}

			protected void zza(zzaoj zzaoj1)
				throws RemoteException
			{
				zzaoc zzaoc1 = new zzaoc(((zzaad.zzb) (this)));
			//    0    0:new             #32  <Class zzaoc>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #35  <Method void zzaoc(zzaad$zzb)>
			//    4    8:astore_2        
				((zzaoy)zzaoj1.zzxD()).zza(new DataSourcesRequest(zzaUZ, ((zzaon) (zzaoc1))));
			//    5    9:aload_1         
			//    6   10:invokevirtual   #39  <Method android.os.IInterface zzaoj.zzxD()>
			//    7   13:checkcast       #41  <Class zzaoy>
			//    8   16:new             #43  <Class DataSourcesRequest>
			//    9   19:dup             
			//   10   20:aload_0         
			//   11   21:getfield        #16  <Field DataSourcesRequest zzaUZ>
			//   12   24:aload_2         
			//   13   25:invokespecial   #46  <Method void DataSourcesRequest(DataSourcesRequest, zzaon)>
			//   14   28:invokeinterface #49  <Method void zzaoy.zza(DataSourcesRequest)>
			//   15   33:return          
			}

			protected DataSourcesResult zzaa(Status status)
			{
				return DataSourcesResult.zzae(status);
			//    0    0:aload_1         
			//    1    1:invokestatic    #56  <Method DataSourcesResult DataSourcesResult.zzae(Status)>
			//    2    4:areturn         
			}

			protected Result zzc(Status status)
			{
				return ((Result) (zzaa(status)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #60  <Method DataSourcesResult zzaa(Status)>
			//    3    5:areturn         
			}

			final DataSourcesRequest zzaUZ;

			
			{
				zzaUZ = datasourcesrequest;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #16  <Field DataSourcesRequest zzaUZ>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #19  <Method void zzaoj$zza(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #8   <Class zzapp$1>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #64  <Method void zzapp$1(zzapp, GoogleApiClient, DataSourcesRequest)>
	//    7   11:invokevirtual   #42  <Method zzaad$zza GoogleApiClient.zza(zzaad$zza)>
	//    8   14:areturn         
	}

	public PendingResult remove(GoogleApiClient googleapiclient, PendingIntent pendingintent)
	{
		return zza(googleapiclient, ((zzs) (null)), pendingintent, ((zza) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:aconst_null     
	//    5    5:invokespecial   #69  <Method PendingResult zza(GoogleApiClient, zzs, PendingIntent, zzapp$zza)>
	//    6    8:areturn         
	}

	public PendingResult remove(GoogleApiClient googleapiclient, OnDataPointListener ondatapointlistener)
	{
		com.google.android.gms.fitness.request.zzao zzao = com.google.android.gms.fitness.request.zzao.zza.zzDa().zzb(ondatapointlistener);
	//    0    0:invokestatic    #55  <Method com.google.android.gms.fitness.request.zzao$zza com.google.android.gms.fitness.request.zzao$zza.zzDa()>
	//    1    3:aload_2         
	//    2    4:invokevirtual   #73  <Method com.google.android.gms.fitness.request.zzao com.google.android.gms.fitness.request.zzao$zza.zzb(OnDataPointListener)>
	//    3    7:astore_3        
		if(zzao == null)
	//*   4    8:aload_3         
	//*   5    9:ifnonnull       20
			return PendingResults.zza(Status.zzazx, googleapiclient);
	//    6   12:getstatic       #79  <Field Status Status.zzazx>
	//    7   15:aload_1         
	//    8   16:invokestatic    #84  <Method PendingResult PendingResults.zza(Status, GoogleApiClient)>
	//    9   19:areturn         
		else
			return zza(googleapiclient, ((zzs) (zzao)), ((PendingIntent) (null)), new zza(ondatapointlistener) {

				public void zzCJ()
				{
					com.google.android.gms.fitness.request.zzao.zza.zzDa().zzc(zzaVd);
				//    0    0:invokestatic    #28  <Method com.google.android.gms.fitness.request.zzao$zza com.google.android.gms.fitness.request.zzao$zza.zzDa()>
				//    1    3:aload_0         
				//    2    4:getfield        #17  <Field OnDataPointListener zzaVd>
				//    3    7:invokevirtual   #32  <Method com.google.android.gms.fitness.request.zzao com.google.android.gms.fitness.request.zzao$zza.zzc(OnDataPointListener)>
				//    4   10:pop             
				//    5   11:return          
				}

				final OnDataPointListener zzaVd;

			
			{
				zzaVd = ondatapointlistener;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #17  <Field OnDataPointListener zzaVd>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:aload_3         
	//   13   23:aconst_null     
	//   14   24:new             #12  <Class zzapp$3>
	//   15   27:dup             
	//   16   28:aload_0         
	//   17   29:aload_2         
	//   18   30:invokespecial   #87  <Method void zzapp$3(zzapp, OnDataPointListener)>
	//   19   33:invokespecial   #69  <Method PendingResult zza(GoogleApiClient, zzs, PendingIntent, zzapp$zza)>
	//   20   36:areturn         
	}
}
