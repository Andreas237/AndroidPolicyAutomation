// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.fitness.BleApi;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.request.*;
import com.google.android.gms.fitness.result.BleDevicesResult;

// Referenced classes of package com.google.android.gms.internal:
//			zzaod, zzapr, zzaos

public class zzapj
	implements BleApi
{
	static class zza extends zzapt.zza
	{

		public void zza(BleDevicesResult bledevicesresult)
		{
			zzaGN.setResult(((Object) (bledevicesresult)));
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
		//    1    1:invokespecial   #15  <Method void zzapt$zza()>
			zzaGN = zzb;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #17  <Field zzaad$zzb zzaGN>
		//    5    9:return          
		}

	}


	public zzapj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	public PendingResult claimBleDevice(GoogleApiClient googleapiclient, BleDevice bledevice)
	{
		return ((PendingResult) (googleapiclient.zzb(((zzaad.zza) (new zzaod.zzc(googleapiclient, bledevice) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzaod)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #25  <Class zzaod>
			//    3    5:invokevirtual   #28  <Method void zza(zzaod)>
			//    4    8:return          
			}

			protected void zza(zzaod zzaod1)
				throws RemoteException
			{
				zzapr zzapr1 = new zzapr(((zzaad.zzb) (this)));
			//    0    0:new             #31  <Class zzapr>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #34  <Method void zzapr(zzaad$zzb)>
			//    4    8:astore_2        
				((zzaos)zzaod1.zzxD()).zza(new zzb(zzaUG.getAddress(), zzaUG, ((zzapf) (zzapr1))));
			//    5    9:aload_1         
			//    6   10:invokevirtual   #38  <Method android.os.IInterface zzaod.zzxD()>
			//    7   13:checkcast       #40  <Class zzaos>
			//    8   16:new             #42  <Class zzb>
			//    9   19:dup             
			//   10   20:aload_0         
			//   11   21:getfield        #15  <Field BleDevice zzaUG>
			//   12   24:invokevirtual   #48  <Method String BleDevice.getAddress()>
			//   13   27:aload_0         
			//   14   28:getfield        #15  <Field BleDevice zzaUG>
			//   15   31:aload_2         
			//   16   32:invokespecial   #51  <Method void zzb(String, BleDevice, zzapf)>
			//   17   35:invokeinterface #54  <Method void zzaos.zza(zzb)>
			//   18   40:return          
			}

			final BleDevice zzaUG;

			
			{
				zzaUG = bledevice;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #15  <Field BleDevice zzaUG>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #18  <Method void zzaod$zzc(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #14  <Class zzapj$4>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #31  <Method void zzapj$4(zzapj, GoogleApiClient, BleDevice)>
	//    7   11:invokevirtual   #37  <Method zzaad$zza GoogleApiClient.zzb(zzaad$zza)>
	//    8   14:areturn         
	}

	public PendingResult claimBleDevice(GoogleApiClient googleapiclient, String s)
	{
		return ((PendingResult) (googleapiclient.zzb(((zzaad.zza) (new zzaod.zzc(googleapiclient, s) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzaod)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #25  <Class zzaod>
			//    3    5:invokevirtual   #28  <Method void zza(zzaod)>
			//    4    8:return          
			}

			protected void zza(zzaod zzaod1)
				throws RemoteException
			{
				zzapr zzapr1 = new zzapr(((zzaad.zzb) (this)));
			//    0    0:new             #31  <Class zzapr>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #34  <Method void zzapr(zzaad$zzb)>
			//    4    8:astore_2        
				((zzaos)zzaod1.zzxD()).zza(new zzb(zzaUF, ((BleDevice) (null)), ((zzapf) (zzapr1))));
			//    5    9:aload_1         
			//    6   10:invokevirtual   #38  <Method android.os.IInterface zzaod.zzxD()>
			//    7   13:checkcast       #40  <Class zzaos>
			//    8   16:new             #42  <Class zzb>
			//    9   19:dup             
			//   10   20:aload_0         
			//   11   21:getfield        #15  <Field String zzaUF>
			//   12   24:aconst_null     
			//   13   25:aload_2         
			//   14   26:invokespecial   #45  <Method void zzb(String, BleDevice, zzapf)>
			//   15   29:invokeinterface #48  <Method void zzaos.zza(zzb)>
			//   16   34:return          
			}

			final String zzaUF;

			
			{
				zzaUF = s;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #15  <Field String zzaUF>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #18  <Method void zzaod$zzc(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #12  <Class zzapj$3>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #43  <Method void zzapj$3(zzapj, GoogleApiClient, String)>
	//    7   11:invokevirtual   #37  <Method zzaad$zza GoogleApiClient.zzb(zzaad$zza)>
	//    8   14:areturn         
	}

	public PendingResult listClaimedBleDevices(GoogleApiClient googleapiclient)
	{
		return ((PendingResult) (googleapiclient.zza(((zzaad.zza) (new zzaod.zza(googleapiclient) {

			protected BleDevicesResult zzU(Status status)
			{
				return BleDevicesResult.zzad(status);
			//    0    0:aload_1         
			//    1    1:invokestatic    #23  <Method BleDevicesResult BleDevicesResult.zzad(Status)>
			//    2    4:areturn         
			}

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
				throws RemoteException
			{
				zza((zzaod)zzb);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #29  <Class zzaod>
			//    3    5:invokevirtual   #32  <Method void zza(zzaod)>
			//    4    8:return          
			}

			protected void zza(zzaod zzaod1)
				throws RemoteException
			{
				zza zza1 = new zza(((zzaad.zzb) (this)));
			//    0    0:new             #35  <Class zzapj$zza>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #38  <Method void zzapj$zza(zzaad$zzb, zzapj$1)>
			//    5    9:astore_2        
				((zzaos)zzaod1.zzxD()).zza(new zzak(((zzapt) (zza1))));
			//    6   10:aload_1         
			//    7   11:invokevirtual   #42  <Method android.os.IInterface zzaod.zzxD()>
			//    8   14:checkcast       #44  <Class zzaos>
			//    9   17:new             #46  <Class zzak>
			//   10   20:dup             
			//   11   21:aload_2         
			//   12   22:invokespecial   #49  <Method void zzak(zzapt)>
			//   13   25:invokeinterface #52  <Method void zzaos.zza(zzak)>
			//   14   30:return          
			}

			protected Result zzc(Status status)
			{
				return ((Result) (zzU(status)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #56  <Method BleDevicesResult zzU(Status)>
			//    3    5:areturn         
			}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:invokespecial   #15  <Method void zzaod$zza(GoogleApiClient)>
			//    3    5:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #18  <Class zzapj$6>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #49  <Method void zzapj$6(zzapj, GoogleApiClient)>
	//    6   10:invokevirtual   #51  <Method zzaad$zza GoogleApiClient.zza(zzaad$zza)>
	//    7   13:areturn         
	}

	public PendingResult startBleScan(GoogleApiClient googleapiclient, StartBleScanRequest startblescanrequest)
	{
		return ((PendingResult) (googleapiclient.zza(((zzaad.zza) (new zzaod.zzc(googleapiclient, startblescanrequest) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
				throws RemoteException
			{
				zza((zzaod)zzb);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #25  <Class zzaod>
			//    3    5:invokevirtual   #28  <Method void zza(zzaod)>
			//    4    8:return          
			}

			protected void zza(zzaod zzaod1)
				throws RemoteException
			{
				zzapr zzapr1 = new zzapr(((zzaad.zzb) (this)));
			//    0    0:new             #31  <Class zzapr>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #34  <Method void zzapr(zzaad$zzb)>
			//    4    8:astore_2        
				((zzaos)zzaod1.zzxD()).zza(new StartBleScanRequest(zzaUD, ((zzapf) (zzapr1))));
			//    5    9:aload_1         
			//    6   10:invokevirtual   #38  <Method android.os.IInterface zzaod.zzxD()>
			//    7   13:checkcast       #40  <Class zzaos>
			//    8   16:new             #42  <Class StartBleScanRequest>
			//    9   19:dup             
			//   10   20:aload_0         
			//   11   21:getfield        #15  <Field StartBleScanRequest zzaUD>
			//   12   24:aload_2         
			//   13   25:invokespecial   #45  <Method void StartBleScanRequest(StartBleScanRequest, zzapf)>
			//   14   28:invokeinterface #48  <Method void zzaos.zza(StartBleScanRequest)>
			//   15   33:return          
			}

			final StartBleScanRequest zzaUD;

			
			{
				zzaUD = startblescanrequest;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #15  <Field StartBleScanRequest zzaUD>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #18  <Method void zzaod$zzc(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #8   <Class zzapj$1>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #57  <Method void zzapj$1(zzapj, GoogleApiClient, StartBleScanRequest)>
	//    7   11:invokevirtual   #51  <Method zzaad$zza GoogleApiClient.zza(zzaad$zza)>
	//    8   14:areturn         
	}

	public PendingResult stopBleScan(GoogleApiClient googleapiclient, BleScanCallback blescancallback)
	{
		return ((PendingResult) (googleapiclient.zza(((zzaad.zza) (new zzaod.zzc(googleapiclient, blescancallback) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
				throws RemoteException
			{
				zza((zzaod)zzb);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #25  <Class zzaod>
			//    3    5:invokevirtual   #28  <Method void zza(zzaod)>
			//    4    8:return          
			}

			protected void zza(zzaod zzaod1)
				throws RemoteException
			{
				zzapr zzapr1 = new zzapr(((zzaad.zzb) (this)));
			//    0    0:new             #31  <Class zzapr>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #34  <Method void zzapr(zzaad$zzb)>
			//    4    8:astore_2        
				((zzaos)zzaod1.zzxD()).zza(new zzbk(zzaUE, ((zzapf) (zzapr1))));
			//    5    9:aload_1         
			//    6   10:invokevirtual   #38  <Method android.os.IInterface zzaod.zzxD()>
			//    7   13:checkcast       #40  <Class zzaos>
			//    8   16:new             #42  <Class zzbk>
			//    9   19:dup             
			//   10   20:aload_0         
			//   11   21:getfield        #15  <Field BleScanCallback zzaUE>
			//   12   24:aload_2         
			//   13   25:invokespecial   #45  <Method void zzbk(BleScanCallback, zzapf)>
			//   14   28:invokeinterface #48  <Method void zzaos.zza(zzbk)>
			//   15   33:return          
			}

			final BleScanCallback zzaUE;

			
			{
				zzaUE = blescancallback;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #15  <Field BleScanCallback zzaUE>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #18  <Method void zzaod$zzc(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #10  <Class zzapj$2>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #63  <Method void zzapj$2(zzapj, GoogleApiClient, BleScanCallback)>
	//    7   11:invokevirtual   #51  <Method zzaad$zza GoogleApiClient.zza(zzaad$zza)>
	//    8   14:areturn         
	}

	public PendingResult unclaimBleDevice(GoogleApiClient googleapiclient, BleDevice bledevice)
	{
		return unclaimBleDevice(googleapiclient, bledevice.getAddress());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #71  <Method String BleDevice.getAddress()>
	//    4    6:invokevirtual   #73  <Method PendingResult unclaimBleDevice(GoogleApiClient, String)>
	//    5    9:areturn         
	}

	public PendingResult unclaimBleDevice(GoogleApiClient googleapiclient, String s)
	{
		return ((PendingResult) (googleapiclient.zzb(((zzaad.zza) (new zzaod.zzc(googleapiclient, s) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
				throws RemoteException
			{
				zza((zzaod)zzb);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #25  <Class zzaod>
			//    3    5:invokevirtual   #28  <Method void zza(zzaod)>
			//    4    8:return          
			}

			protected void zza(zzaod zzaod1)
				throws RemoteException
			{
				zzapr zzapr1 = new zzapr(((zzaad.zzb) (this)));
			//    0    0:new             #31  <Class zzapr>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #34  <Method void zzapr(zzaad$zzb)>
			//    4    8:astore_2        
				((zzaos)zzaod1.zzxD()).zza(new zzbo(zzaUF, ((zzapf) (zzapr1))));
			//    5    9:aload_1         
			//    6   10:invokevirtual   #38  <Method android.os.IInterface zzaod.zzxD()>
			//    7   13:checkcast       #40  <Class zzaos>
			//    8   16:new             #42  <Class zzbo>
			//    9   19:dup             
			//   10   20:aload_0         
			//   11   21:getfield        #15  <Field String zzaUF>
			//   12   24:aload_2         
			//   13   25:invokespecial   #45  <Method void zzbo(String, zzapf)>
			//   14   28:invokeinterface #48  <Method void zzaos.zza(zzbo)>
			//   15   33:return          
			}

			final String zzaUF;

			
			{
				zzaUF = s;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #15  <Field String zzaUF>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #18  <Method void zzaod$zzc(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #16  <Class zzapj$5>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #74  <Method void zzapj$5(zzapj, GoogleApiClient, String)>
	//    7   11:invokevirtual   #37  <Method zzaad$zza GoogleApiClient.zzb(zzaad$zza)>
	//    8   14:areturn         
	}
}
