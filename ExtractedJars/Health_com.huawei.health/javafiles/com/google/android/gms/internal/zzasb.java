// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.location.*;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//			zzash

public class zzasb
	implements GeofencingApi
{
	static abstract class zza extends com.google.android.gms.location.LocationServices.zza
	{

		public Status zzb(Status status)
		{
			return status;
		//    0    0:aload_1         
		//    1    1:areturn         
		}

		public Result zzc(Status status)
		{
			return ((Result) (zzb(status)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #19  <Method Status zzb(Status)>
		//    3    5:areturn         
		}

		public zza(GoogleApiClient googleapiclient)
		{
			super(googleapiclient);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #12  <Method void com.google.android.gms.location.LocationServices$zza(GoogleApiClient)>
		//    3    5:return          
		}
	}


	public zzasb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public PendingResult addGeofences(GoogleApiClient googleapiclient, GeofencingRequest geofencingrequest, PendingIntent pendingintent)
	{
		return ((PendingResult) (googleapiclient.zzb(((zzaad.zza) (new zza(googleapiclient, geofencingrequest, pendingintent) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
				throws RemoteException
			{
				zza((zzash)zzb);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #29  <Class zzash>
			//    3    5:invokevirtual   #32  <Method void zza(zzash)>
			//    4    8:return          
			}

			protected void zza(zzash zzash1)
				throws RemoteException
			{
				zzash1.zza(zzbkC, zzaUQ, ((zzaad.zzb) (this)));
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:getfield        #17  <Field GeofencingRequest zzbkC>
			//    3    5:aload_0         
			//    4    6:getfield        #19  <Field PendingIntent zzaUQ>
			//    5    9:aload_0         
			//    6   10:invokevirtual   #36  <Method void zzash.zza(GeofencingRequest, PendingIntent, zzaad$zzb)>
			//    7   13:return          
			}

			final PendingIntent zzaUQ;
			final GeofencingRequest zzbkC;

			
			{
				zzbkC = geofencingrequest;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #17  <Field GeofencingRequest zzbkC>
				zzaUQ = pendingintent;
			//    3    5:aload_0         
			//    4    6:aload           4
			//    5    8:putfield        #19  <Field PendingIntent zzaUQ>
				super(googleapiclient);
			//    6   11:aload_0         
			//    7   12:aload_2         
			//    8   13:invokespecial   #22  <Method void zzasb$zza(GoogleApiClient)>
			//    9   16:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #8   <Class zzasb$1>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokespecial   #23  <Method void zzasb$1(zzasb, GoogleApiClient, GeofencingRequest, PendingIntent)>
	//    8   12:invokevirtual   #29  <Method zzaad$zza GoogleApiClient.zzb(zzaad$zza)>
	//    9   15:areturn         
	}

	public PendingResult addGeofences(GoogleApiClient googleapiclient, List list, PendingIntent pendingintent)
	{
		com.google.android.gms.location.GeofencingRequest.Builder builder = new com.google.android.gms.location.GeofencingRequest.Builder();
	//    0    0:new             #35  <Class com.google.android.gms.location.GeofencingRequest$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void com.google.android.gms.location.GeofencingRequest$Builder()>
	//    3    7:astore          4
		builder.addGeofences(list);
	//    4    9:aload           4
	//    5   11:aload_2         
	//    6   12:invokevirtual   #39  <Method com.google.android.gms.location.GeofencingRequest$Builder com.google.android.gms.location.GeofencingRequest$Builder.addGeofences(List)>
	//    7   15:pop             
		builder.setInitialTrigger(5);
	//    8   16:aload           4
	//    9   18:iconst_5        
	//   10   19:invokevirtual   #43  <Method com.google.android.gms.location.GeofencingRequest$Builder com.google.android.gms.location.GeofencingRequest$Builder.setInitialTrigger(int)>
	//   11   22:pop             
		return addGeofences(googleapiclient, builder.build(), pendingintent);
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:aload           4
	//   15   27:invokevirtual   #47  <Method GeofencingRequest com.google.android.gms.location.GeofencingRequest$Builder.build()>
	//   16   30:aload_3         
	//   17   31:invokevirtual   #49  <Method PendingResult addGeofences(GoogleApiClient, GeofencingRequest, PendingIntent)>
	//   18   34:areturn         
	}

	public PendingResult removeGeofences(GoogleApiClient googleapiclient, PendingIntent pendingintent)
	{
		return zza(googleapiclient, zzt.zzb(pendingintent));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #58  <Method zzt zzt.zzb(PendingIntent)>
	//    4    6:invokevirtual   #61  <Method PendingResult zza(GoogleApiClient, zzt)>
	//    5    9:areturn         
	}

	public PendingResult removeGeofences(GoogleApiClient googleapiclient, List list)
	{
		return zza(googleapiclient, zzt.zzE(list));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #67  <Method zzt zzt.zzE(List)>
	//    4    6:invokevirtual   #61  <Method PendingResult zza(GoogleApiClient, zzt)>
	//    5    9:areturn         
	}

	public PendingResult zza(GoogleApiClient googleapiclient, zzt zzt1)
	{
		return ((PendingResult) (googleapiclient.zzb(((zzaad.zza) (new zza(googleapiclient, zzt1) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
				throws RemoteException
			{
				zza((zzash)zzb);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #24  <Class zzash>
			//    3    5:invokevirtual   #27  <Method void zza(zzash)>
			//    4    8:return          
			}

			protected void zza(zzash zzash1)
				throws RemoteException
			{
				zzash1.zza(zzbkD, ((zzaad.zzb) (this)));
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:getfield        #15  <Field zzt zzbkD>
			//    3    5:aload_0         
			//    4    6:invokevirtual   #31  <Method void zzash.zza(zzt, zzaad$zzb)>
			//    5    9:return          
			}

			final zzt zzbkD;

			
			{
				zzbkD = zzt1;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #15  <Field zzt zzbkD>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #18  <Method void zzasb$zza(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #10  <Class zzasb$2>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #71  <Method void zzasb$2(zzasb, GoogleApiClient, zzt)>
	//    7   11:invokevirtual   #29  <Method zzaad$zza GoogleApiClient.zzb(zzaad$zza)>
	//    8   14:areturn         
	}
}
