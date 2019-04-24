// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.location.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzash, zzarz, zzata, zzabi, 
//			zzasi

public class zzary
	implements FusedLocationProviderApi
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

	static class zzb extends zzasc.zza
	{

		public void zza(zzarz zzarz1)
		{
			zzaGN.setResult(((Object) (zzarz1.getStatus())));
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field zzaad$zzb zzaGN>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #28  <Method Status zzarz.getStatus()>
		//    4    8:invokeinterface #34  <Method void zzaad$zzb.setResult(Object)>
		//    5   13:return          
		}

		private final zzaad.zzb zzaGN;

		public zzb(zzaad.zzb zzb1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void zzasc$zza()>
			zzaGN = zzb1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #17  <Field zzaad$zzb zzaGN>
		//    5    9:return          
		}
	}


	public zzary()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
	//    2    4:return          
	}

	public PendingResult flushLocations(GoogleApiClient googleapiclient)
	{
		return ((PendingResult) (googleapiclient.zzb(((zzaad.zza) (new zza(googleapiclient) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzash)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #21  <Class zzash>
			//    3    5:invokevirtual   #24  <Method void zza(zzash)>
			//    4    8:return          
			}

			protected void zza(zzash zzash1)
				throws RemoteException
			{
				zzash1.zza(((zzasc) (new zzb(((zzaad.zzb) (this))))));
			//    0    0:aload_1         
			//    1    1:new             #27  <Class zzary$zzb>
			//    2    4:dup             
			//    3    5:aload_0         
			//    4    6:invokespecial   #30  <Method void zzary$zzb(zzaad$zzb)>
			//    5    9:invokevirtual   #33  <Method void zzash.zza(zzasc)>
			//    6   12:return          
			}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:invokespecial   #14  <Method void zzary$zza(GoogleApiClient)>
			//    3    5:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #18  <Class zzary$5>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #42  <Method void zzary$5(zzary, GoogleApiClient)>
	//    6   10:invokevirtual   #47  <Method zzaad$zza GoogleApiClient.zzb(zzaad$zza)>
	//    7   13:areturn         
	}

	public Location getLastLocation(GoogleApiClient googleapiclient)
	{
		googleapiclient = ((GoogleApiClient) (LocationServices.zzj(googleapiclient)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #59  <Method zzash LocationServices.zzj(GoogleApiClient)>
	//    2    4:astore_1        
		try
		{
			googleapiclient = ((GoogleApiClient) (((zzash) (googleapiclient)).getLastLocation()));
	//    3    5:aload_1         
	//    4    6:invokevirtual   #64  <Method Location zzash.getLastLocation()>
	//    5    9:astore_1        
		}
	//*   6   10:aload_1         
	//*   7   11:areturn         
	//*   8   12:aconst_null     
	//*   9   13:areturn         
		// Misplaced declaration of an exception variable
		catch(GoogleApiClient googleapiclient)
		{
			return null;
		}
		return ((Location) (googleapiclient));
	//*  10   14:astore_1        
	//*  11   15:goto            12
	}

	public LocationAvailability getLocationAvailability(GoogleApiClient googleapiclient)
	{
		googleapiclient = ((GoogleApiClient) (LocationServices.zzj(googleapiclient)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #59  <Method zzash LocationServices.zzj(GoogleApiClient)>
	//    2    4:astore_1        
		try
		{
			googleapiclient = ((GoogleApiClient) (((zzash) (googleapiclient)).zzIp()));
	//    3    5:aload_1         
	//    4    6:invokevirtual   #70  <Method LocationAvailability zzash.zzIp()>
	//    5    9:astore_1        
		}
	//*   6   10:aload_1         
	//*   7   11:areturn         
	//*   8   12:aconst_null     
	//*   9   13:areturn         
		// Misplaced declaration of an exception variable
		catch(GoogleApiClient googleapiclient)
		{
			return null;
		}
		return ((LocationAvailability) (googleapiclient));
	//*  10   14:astore_1        
	//*  11   15:goto            12
	}

	public PendingResult removeLocationUpdates(GoogleApiClient googleapiclient, PendingIntent pendingintent)
	{
		return ((PendingResult) (googleapiclient.zzb(((zzaad.zza) (new zza(googleapiclient, pendingintent) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzash)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #25  <Class zzash>
			//    3    5:invokevirtual   #28  <Method void zza(zzash)>
			//    4    8:return          
			}

			protected void zza(zzash zzash1)
				throws RemoteException
			{
				zzb zzb1 = new zzb(((zzaad.zzb) (this)));
			//    0    0:new             #31  <Class zzary$zzb>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #34  <Method void zzary$zzb(zzaad$zzb)>
			//    4    8:astore_2        
				zzash1.zza(zzbkr, ((zzasc) (zzb1)));
			//    5    9:aload_1         
			//    6   10:aload_0         
			//    7   11:getfield        #15  <Field PendingIntent zzbkr>
			//    8   14:aload_2         
			//    9   15:invokevirtual   #37  <Method void zzash.zza(PendingIntent, zzasc)>
			//   10   18:return          
			}

			final PendingIntent zzbkr;

			
			{
				zzbkr = pendingintent;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #15  <Field PendingIntent zzbkr>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #18  <Method void zzary$zza(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #10  <Class zzary$10>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #75  <Method void zzary$10(zzary, GoogleApiClient, PendingIntent)>
	//    7   11:invokevirtual   #47  <Method zzaad$zza GoogleApiClient.zzb(zzaad$zza)>
	//    8   14:areturn         
	}

	public PendingResult removeLocationUpdates(GoogleApiClient googleapiclient, LocationCallback locationcallback)
	{
		return ((PendingResult) (googleapiclient.zzb(((zzaad.zza) (new zza(googleapiclient, locationcallback) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzash)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #25  <Class zzash>
			//    3    5:invokevirtual   #28  <Method void zza(zzash)>
			//    4    8:return          
			}

			protected void zza(zzash zzash1)
				throws RemoteException
			{
				zzash1.zzb(zzabi.zza(((Object) (zzbkx)), ((Class) (com/google/android/gms/location/LocationCallback)).getSimpleName()), ((zzasc) (new zzb(((zzaad.zzb) (this))))));
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:getfield        #15  <Field LocationCallback zzbkx>
			//    3    5:ldc1            #31  <Class LocationCallback>
			//    4    7:invokevirtual   #37  <Method String Class.getSimpleName()>
			//    5   10:invokestatic    #42  <Method zzabh$zzb zzabi.zza(Object, String)>
			//    6   13:new             #44  <Class zzary$zzb>
			//    7   16:dup             
			//    8   17:aload_0         
			//    9   18:invokespecial   #47  <Method void zzary$zzb(zzaad$zzb)>
			//   10   21:invokevirtual   #51  <Method void zzash.zzb(zzabh$zzb, zzasc)>
			//   11   24:return          
			}

			final LocationCallback zzbkx;

			
			{
				zzbkx = locationcallback;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #15  <Field LocationCallback zzbkx>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #18  <Method void zzary$zza(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #12  <Class zzary$2>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #80  <Method void zzary$2(zzary, GoogleApiClient, LocationCallback)>
	//    7   11:invokevirtual   #47  <Method zzaad$zza GoogleApiClient.zzb(zzaad$zza)>
	//    8   14:areturn         
	}

	public PendingResult removeLocationUpdates(GoogleApiClient googleapiclient, LocationListener locationlistener)
	{
		return ((PendingResult) (googleapiclient.zzb(((zzaad.zza) (new zza(googleapiclient, locationlistener) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzash)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #25  <Class zzash>
			//    3    5:invokevirtual   #28  <Method void zza(zzash)>
			//    4    8:return          
			}

			protected void zza(zzash zzash1)
				throws RemoteException
			{
				zzash1.zza(zzabi.zza(((Object) (zzbkw)), ((Class) (com/google/android/gms/location/LocationListener)).getSimpleName()), ((zzasc) (new zzb(((zzaad.zzb) (this))))));
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:getfield        #15  <Field LocationListener zzbkw>
			//    3    5:ldc1            #31  <Class LocationListener>
			//    4    7:invokevirtual   #37  <Method String Class.getSimpleName()>
			//    5   10:invokestatic    #42  <Method zzabh$zzb zzabi.zza(Object, String)>
			//    6   13:new             #44  <Class zzary$zzb>
			//    7   16:dup             
			//    8   17:aload_0         
			//    9   18:invokespecial   #47  <Method void zzary$zzb(zzaad$zzb)>
			//   10   21:invokevirtual   #50  <Method void zzash.zza(zzabh$zzb, zzasc)>
			//   11   24:return          
			}

			final LocationListener zzbkw;

			
			{
				zzbkw = locationlistener;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #15  <Field LocationListener zzbkw>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #18  <Method void zzary$zza(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #26  <Class zzary$9>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #85  <Method void zzary$9(zzary, GoogleApiClient, LocationListener)>
	//    7   11:invokevirtual   #47  <Method zzaad$zza GoogleApiClient.zzb(zzaad$zza)>
	//    8   14:areturn         
	}

	public PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, PendingIntent pendingintent)
	{
		return ((PendingResult) (googleapiclient.zzb(((zzaad.zza) (new zza(googleapiclient, locationrequest, pendingintent) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzash)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #29  <Class zzash>
			//    3    5:invokevirtual   #32  <Method void zza(zzash)>
			//    4    8:return          
			}

			protected void zza(zzash zzash1)
				throws RemoteException
			{
				zzb zzb1 = new zzb(((zzaad.zzb) (this)));
			//    0    0:new             #35  <Class zzary$zzb>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #38  <Method void zzary$zzb(zzaad$zzb)>
			//    4    8:astore_2        
				zzash1.zza(zzbkv, zzbkr, ((zzasc) (zzb1)));
			//    5    9:aload_1         
			//    6   10:aload_0         
			//    7   11:getfield        #17  <Field LocationRequest zzbkv>
			//    8   14:aload_0         
			//    9   15:getfield        #19  <Field PendingIntent zzbkr>
			//   10   18:aload_2         
			//   11   19:invokevirtual   #41  <Method void zzash.zza(LocationRequest, PendingIntent, zzasc)>
			//   12   22:return          
			}

			final PendingIntent zzbkr;
			final LocationRequest zzbkv;

			
			{
				zzbkv = locationrequest;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #17  <Field LocationRequest zzbkv>
				zzbkr = pendingintent;
			//    3    5:aload_0         
			//    4    6:aload           4
			//    5    8:putfield        #19  <Field PendingIntent zzbkr>
				super(googleapiclient);
			//    6   11:aload_0         
			//    7   12:aload_2         
			//    8   13:invokespecial   #22  <Method void zzary$zza(GoogleApiClient)>
			//    9   16:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #24  <Class zzary$8>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokespecial   #91  <Method void zzary$8(zzary, GoogleApiClient, LocationRequest, PendingIntent)>
	//    8   12:invokevirtual   #47  <Method zzaad$zza GoogleApiClient.zzb(zzaad$zza)>
	//    9   15:areturn         
	}

	public PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationCallback locationcallback, Looper looper)
	{
		return ((PendingResult) (googleapiclient.zzb(((zzaad.zza) (new zza(googleapiclient, locationrequest, locationcallback, looper) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzash)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #33  <Class zzash>
			//    3    5:invokevirtual   #36  <Method void zza(zzash)>
			//    4    8:return          
			}

			protected void zza(zzash zzash1)
				throws RemoteException
			{
				zzb zzb1 = new zzb(((zzaad.zzb) (this)));
			//    0    0:new             #39  <Class zzary$zzb>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #42  <Method void zzary$zzb(zzaad$zzb)>
			//    4    8:astore_2        
				zzash1.zza(zzasi.zzb(zzbkv), zzabi.zzb(((Object) (zzbkx)), zzata.zzc(zzbkA), ((Class) (com/google/android/gms/location/LocationCallback)).getSimpleName()), ((zzasc) (zzb1)));
			//    5    9:aload_1         
			//    6   10:aload_0         
			//    7   11:getfield        #19  <Field LocationRequest zzbkv>
			//    8   14:invokestatic    #48  <Method zzasi zzasi.zzb(LocationRequest)>
			//    9   17:aload_0         
			//   10   18:getfield        #21  <Field LocationCallback zzbkx>
			//   11   21:aload_0         
			//   12   22:getfield        #23  <Field Looper zzbkA>
			//   13   25:invokestatic    #54  <Method Looper zzata.zzc(Looper)>
			//   14   28:ldc1            #56  <Class LocationCallback>
			//   15   30:invokevirtual   #62  <Method String Class.getSimpleName()>
			//   16   33:invokestatic    #67  <Method zzabh zzabi.zzb(Object, Looper, String)>
			//   17   36:aload_2         
			//   18   37:invokevirtual   #70  <Method void zzash.zza(zzasi, zzabh, zzasc)>
			//   19   40:return          
			}

			final Looper zzbkA;
			final LocationRequest zzbkv;
			final LocationCallback zzbkx;

			
			{
				zzbkv = locationrequest;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #19  <Field LocationRequest zzbkv>
				zzbkx = locationcallback;
			//    3    5:aload_0         
			//    4    6:aload           4
			//    5    8:putfield        #21  <Field LocationCallback zzbkx>
				zzbkA = looper;
			//    6   11:aload_0         
			//    7   12:aload           5
			//    8   14:putfield        #23  <Field Looper zzbkA>
				super(googleapiclient);
			//    9   17:aload_0         
			//   10   18:aload_2         
			//   11   19:invokespecial   #26  <Method void zzary$zza(GoogleApiClient)>
			//   12   22:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #22  <Class zzary$7>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:aload           4
	//    8   11:invokespecial   #96  <Method void zzary$7(zzary, GoogleApiClient, LocationRequest, LocationCallback, Looper)>
	//    9   14:invokevirtual   #47  <Method zzaad$zza GoogleApiClient.zzb(zzaad$zza)>
	//   10   17:areturn         
	}

	public PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationListener locationlistener)
	{
		zzac.zzb(((Object) (Looper.myLooper())), "Calling thread must be a prepared Looper thread.");
	//    0    0:invokestatic    #104 <Method Looper Looper.myLooper()>
	//    1    3:ldc1            #106 <String "Calling thread must be a prepared Looper thread.">
	//    2    5:invokestatic    #111 <Method Object zzac.zzb(Object, Object)>
	//    3    8:pop             
		return ((PendingResult) (googleapiclient.zzb(((zzaad.zza) (new zza(googleapiclient, locationrequest, locationlistener) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzash)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #29  <Class zzash>
			//    3    5:invokevirtual   #32  <Method void zza(zzash)>
			//    4    8:return          
			}

			protected void zza(zzash zzash1)
				throws RemoteException
			{
				zzb zzb1 = new zzb(((zzaad.zzb) (this)));
			//    0    0:new             #35  <Class zzary$zzb>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #38  <Method void zzary$zzb(zzaad$zzb)>
			//    4    8:astore_2        
				zzash1.zza(zzbkv, zzabi.zzb(((Object) (zzbkw)), zzata.zzJl(), ((Class) (com/google/android/gms/location/LocationListener)).getSimpleName()), ((zzasc) (zzb1)));
			//    5    9:aload_1         
			//    6   10:aload_0         
			//    7   11:getfield        #17  <Field LocationRequest zzbkv>
			//    8   14:aload_0         
			//    9   15:getfield        #19  <Field LocationListener zzbkw>
			//   10   18:invokestatic    #44  <Method Looper zzata.zzJl()>
			//   11   21:ldc1            #46  <Class LocationListener>
			//   12   23:invokevirtual   #52  <Method String Class.getSimpleName()>
			//   13   26:invokestatic    #58  <Method zzabh zzabi.zzb(Object, Looper, String)>
			//   14   29:aload_2         
			//   15   30:invokevirtual   #61  <Method void zzash.zza(LocationRequest, zzabh, zzasc)>
			//   16   33:return          
			}

			final LocationRequest zzbkv;
			final LocationListener zzbkw;

			
			{
				zzbkv = locationrequest;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #17  <Field LocationRequest zzbkv>
				zzbkw = locationlistener;
			//    3    5:aload_0         
			//    4    6:aload           4
			//    5    8:putfield        #19  <Field LocationListener zzbkw>
				super(googleapiclient);
			//    6   11:aload_0         
			//    7   12:aload_2         
			//    8   13:invokespecial   #22  <Method void zzary$zza(GoogleApiClient)>
			//    9   16:return          
			}
		}
)))));
	//    4    9:aload_1         
	//    5   10:new             #8   <Class zzary$1>
	//    6   13:dup             
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:aload_2         
	//   10   17:aload_3         
	//   11   18:invokespecial   #114 <Method void zzary$1(zzary, GoogleApiClient, LocationRequest, LocationListener)>
	//   12   21:invokevirtual   #47  <Method zzaad$zza GoogleApiClient.zzb(zzaad$zza)>
	//   13   24:areturn         
	}

	public PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationListener locationlistener, Looper looper)
	{
		return ((PendingResult) (googleapiclient.zzb(((zzaad.zza) (new zza(googleapiclient, locationrequest, locationlistener, looper) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzash)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #33  <Class zzash>
			//    3    5:invokevirtual   #36  <Method void zza(zzash)>
			//    4    8:return          
			}

			protected void zza(zzash zzash1)
				throws RemoteException
			{
				zzb zzb1 = new zzb(((zzaad.zzb) (this)));
			//    0    0:new             #39  <Class zzary$zzb>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #42  <Method void zzary$zzb(zzaad$zzb)>
			//    4    8:astore_2        
				zzash1.zza(zzbkv, zzabi.zzb(((Object) (zzbkw)), zzata.zzc(zzbkA), ((Class) (com/google/android/gms/location/LocationListener)).getSimpleName()), ((zzasc) (zzb1)));
			//    5    9:aload_1         
			//    6   10:aload_0         
			//    7   11:getfield        #19  <Field LocationRequest zzbkv>
			//    8   14:aload_0         
			//    9   15:getfield        #21  <Field LocationListener zzbkw>
			//   10   18:aload_0         
			//   11   19:getfield        #23  <Field Looper zzbkA>
			//   12   22:invokestatic    #48  <Method Looper zzata.zzc(Looper)>
			//   13   25:ldc1            #50  <Class LocationListener>
			//   14   27:invokevirtual   #56  <Method String Class.getSimpleName()>
			//   15   30:invokestatic    #62  <Method zzabh zzabi.zzb(Object, Looper, String)>
			//   16   33:aload_2         
			//   17   34:invokevirtual   #65  <Method void zzash.zza(LocationRequest, zzabh, zzasc)>
			//   18   37:return          
			}

			final Looper zzbkA;
			final LocationRequest zzbkv;
			final LocationListener zzbkw;

			
			{
				zzbkv = locationrequest;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #19  <Field LocationRequest zzbkv>
				zzbkw = locationlistener;
			//    3    5:aload_0         
			//    4    6:aload           4
			//    5    8:putfield        #21  <Field LocationListener zzbkw>
				zzbkA = looper;
			//    6   11:aload_0         
			//    7   12:aload           5
			//    8   14:putfield        #23  <Field Looper zzbkA>
				super(googleapiclient);
			//    9   17:aload_0         
			//   10   18:aload_2         
			//   11   19:invokespecial   #26  <Method void zzary$zza(GoogleApiClient)>
			//   12   22:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #20  <Class zzary$6>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:aload           4
	//    8   11:invokespecial   #119 <Method void zzary$6(zzary, GoogleApiClient, LocationRequest, LocationListener, Looper)>
	//    9   14:invokevirtual   #47  <Method zzaad$zza GoogleApiClient.zzb(zzaad$zza)>
	//   10   17:areturn         
	}

	public PendingResult setMockLocation(GoogleApiClient googleapiclient, Location location)
	{
		return ((PendingResult) (googleapiclient.zzb(((zzaad.zza) (new zza(googleapiclient, location) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzash)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #25  <Class zzash>
			//    3    5:invokevirtual   #28  <Method void zza(zzash)>
			//    4    8:return          
			}

			protected void zza(zzash zzash1)
				throws RemoteException
			{
				zzash1.zzd(zzbkz);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:getfield        #15  <Field Location zzbkz>
			//    3    5:invokevirtual   #33  <Method void zzash.zzd(Location)>
				zzb(((Result) (Status.zzazx)));
			//    4    8:aload_0         
			//    5    9:getstatic       #39  <Field Status Status.zzazx>
			//    6   12:invokevirtual   #43  <Method void zzb(Result)>
			//    7   15:return          
			}

			final Location zzbkz;

			
			{
				zzbkz = location;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #15  <Field Location zzbkz>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #18  <Method void zzary$zza(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #16  <Class zzary$4>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #125 <Method void zzary$4(zzary, GoogleApiClient, Location)>
	//    7   11:invokevirtual   #47  <Method zzaad$zza GoogleApiClient.zzb(zzaad$zza)>
	//    8   14:areturn         
	}

	public PendingResult setMockMode(GoogleApiClient googleapiclient, boolean flag)
	{
		return ((PendingResult) (googleapiclient.zzb(((zzaad.zza) (new zza(googleapiclient, flag) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzash)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #25  <Class zzash>
			//    3    5:invokevirtual   #28  <Method void zza(zzash)>
			//    4    8:return          
			}

			protected void zza(zzash zzash1)
				throws RemoteException
			{
				zzash1.zzaH(zzbky);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:getfield        #15  <Field boolean zzbky>
			//    3    5:invokevirtual   #33  <Method void zzash.zzaH(boolean)>
				zzb(((Result) (Status.zzazx)));
			//    4    8:aload_0         
			//    5    9:getstatic       #39  <Field Status Status.zzazx>
			//    6   12:invokevirtual   #43  <Method void zzb(Result)>
			//    7   15:return          
			}

			final boolean zzbky;

			
			{
				zzbky = flag;
			//    0    0:aload_0         
			//    1    1:iload_3         
			//    2    2:putfield        #15  <Field boolean zzbky>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #18  <Method void zzary$zza(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #14  <Class zzary$3>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:invokespecial   #131 <Method void zzary$3(zzary, GoogleApiClient, boolean)>
	//    7   11:invokevirtual   #47  <Method zzaad$zza GoogleApiClient.zzb(zzaad$zza)>
	//    8   14:areturn         
	}
}
