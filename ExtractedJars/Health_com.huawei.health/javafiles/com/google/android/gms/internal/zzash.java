// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.location.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzarv, zzasg, zzase, zzasc, 
//			zzasi, zzabh

public class zzash extends zzarv
{
	static final class zza extends zzasd.zza
	{

		public void zza(int i, PendingIntent pendingintent)
		{
			Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByPendingIntentResult");
		//    0    0:ldc1            #23  <String "LocationClientImpl">
		//    1    2:ldc1            #25  <String "Unexpected call to onRemoveGeofencesByPendingIntentResult">
		//    2    4:invokestatic    #31  <Method int Log.wtf(String, String)>
		//    3    7:pop             
		//    4    8:return          
		}

		public void zza(int i, String as[])
		{
			if(zzbkL == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field zzaad$zzb zzbkL>
		//*   2    4:ifnonnull       16
			{
				Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times");
		//    3    7:ldc1            #23  <String "LocationClientImpl">
		//    4    9:ldc1            #34  <String "onAddGeofenceResult called multiple times">
		//    5   11:invokestatic    #31  <Method int Log.wtf(String, String)>
		//    6   14:pop             
				return;
		//    7   15:return          
			} else
			{
				as = ((String []) (LocationStatusCodes.zzkt(LocationStatusCodes.zzks(i))));
		//    8   16:iload_1         
		//    9   17:invokestatic    #40  <Method int LocationStatusCodes.zzks(int)>
		//   10   20:invokestatic    #44  <Method com.google.android.gms.common.api.Status LocationStatusCodes.zzkt(int)>
		//   11   23:astore_2        
				zzbkL.setResult(((Object) (as)));
		//   12   24:aload_0         
		//   13   25:getfield        #17  <Field zzaad$zzb zzbkL>
		//   14   28:aload_2         
		//   15   29:invokeinterface #50  <Method void zzaad$zzb.setResult(Object)>
				zzbkL = null;
		//   16   34:aload_0         
		//   17   35:aconst_null     
		//   18   36:putfield        #17  <Field zzaad$zzb zzbkL>
				return;
		//   19   39:return          
			}
		}

		public void zzb(int i, String as[])
		{
			Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByRequestIdsResult");
		//    0    0:ldc1            #23  <String "LocationClientImpl">
		//    1    2:ldc1            #53  <String "Unexpected call to onRemoveGeofencesByRequestIdsResult">
		//    2    4:invokestatic    #31  <Method int Log.wtf(String, String)>
		//    3    7:pop             
		//    4    8:return          
		}

		private zzaad.zzb zzbkL;

		public zza(zzaad.zzb zzb1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void zzasd$zza()>
			zzbkL = zzb1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #17  <Field zzaad$zzb zzbkL>
		//    5    9:return          
		}
	}

	static final class zzb extends zzasd.zza
	{

		private void zzkx(int i)
		{
			if(zzbkL == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field zzaad$zzb zzbkL>
		//*   2    4:ifnonnull       16
			{
				Log.wtf("LocationClientImpl", "onRemoveGeofencesResult called multiple times");
		//    3    7:ldc1            #24  <String "LocationClientImpl">
		//    4    9:ldc1            #26  <String "onRemoveGeofencesResult called multiple times">
		//    5   11:invokestatic    #32  <Method int Log.wtf(String, String)>
		//    6   14:pop             
				return;
		//    7   15:return          
			} else
			{
				com.google.android.gms.common.api.Status status = LocationStatusCodes.zzkt(LocationStatusCodes.zzks(i));
		//    8   16:iload_1         
		//    9   17:invokestatic    #38  <Method int LocationStatusCodes.zzks(int)>
		//   10   20:invokestatic    #42  <Method com.google.android.gms.common.api.Status LocationStatusCodes.zzkt(int)>
		//   11   23:astore_2        
				zzbkL.setResult(((Object) (status)));
		//   12   24:aload_0         
		//   13   25:getfield        #17  <Field zzaad$zzb zzbkL>
		//   14   28:aload_2         
		//   15   29:invokeinterface #48  <Method void zzaad$zzb.setResult(Object)>
				zzbkL = null;
		//   16   34:aload_0         
		//   17   35:aconst_null     
		//   18   36:putfield        #17  <Field zzaad$zzb zzbkL>
				return;
		//   19   39:return          
			}
		}

		public void zza(int i, PendingIntent pendingintent)
		{
			zzkx(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #52  <Method void zzkx(int)>
		//    3    5:return          
		}

		public void zza(int i, String as[])
		{
			Log.wtf("LocationClientImpl", "Unexpected call to onAddGeofencesResult");
		//    0    0:ldc1            #24  <String "LocationClientImpl">
		//    1    2:ldc1            #55  <String "Unexpected call to onAddGeofencesResult">
		//    2    4:invokestatic    #32  <Method int Log.wtf(String, String)>
		//    3    7:pop             
		//    4    8:return          
		}

		public void zzb(int i, String as[])
		{
			zzkx(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #52  <Method void zzkx(int)>
		//    3    5:return          
		}

		private zzaad.zzb zzbkL;

		public zzb(zzaad.zzb zzb1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void zzasd$zza()>
			zzbkL = zzb1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #17  <Field zzaad$zzb zzbkL>
		//    5    9:return          
		}
	}

	static final class zzc extends zzasf.zza
	{

		public void zza(LocationSettingsResult locationsettingsresult)
			throws RemoteException
		{
			zzbkL.setResult(((Object) (locationsettingsresult)));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field zzaad$zzb zzbkL>
		//    2    4:aload_1         
		//    3    5:invokeinterface #38  <Method void zzaad$zzb.setResult(Object)>
			zzbkL = null;
		//    4   10:aload_0         
		//    5   11:aconst_null     
		//    6   12:putfield        #25  <Field zzaad$zzb zzbkL>
		//    7   15:return          
		}

		private zzaad.zzb zzbkL;

		public zzc(zzaad.zzb zzb1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void zzasf$zza()>
			boolean flag;
			if(zzb1 != null)
		//*   2    4:aload_1         
		//*   3    5:ifnull          13
				flag = true;
		//    4    8:iconst_1        
		//    5    9:istore_2        
			else
		//*   6   10:goto            15
				flag = false;
		//    7   13:iconst_0        
		//    8   14:istore_2        
			zzac.zzb(flag, "listener can't be null.");
		//    9   15:iload_2         
		//   10   16:ldc1            #17  <String "listener can't be null.">
		//   11   18:invokestatic    #23  <Method void zzac.zzb(boolean, Object)>
			zzbkL = zzb1;
		//   12   21:aload_0         
		//   13   22:aload_1         
		//   14   23:putfield        #25  <Field zzaad$zzb zzbkL>
		//   15   26:return          
		}
	}


	public zzash(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s)
	{
		this(context, looper, connectioncallbacks, onconnectionfailedlistener, s, zzg.zzaS(context));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload_1         
	//    7    9:invokestatic    #23  <Method zzg zzg.zzaS(Context)>
	//    8   12:invokespecial   #26  <Method void zzash(Context, Looper, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener, String, zzg)>
	//    9   15:return          
	}

	public zzash(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s, zzg zzg1)
	{
		super(context, looper, connectioncallbacks, onconnectionfailedlistener, s, zzg1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:invokespecial   #28  <Method void zzarv(Context, Looper, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener, String, zzg)>
		zzbkK = new zzasg(context, zzbkt);
	//    8   13:aload_0         
	//    9   14:new             #30  <Class zzasg>
	//   10   17:dup             
	//   11   18:aload_1         
	//   12   19:aload_0         
	//   13   20:getfield        #34  <Field zzaso zzbkt>
	//   14   23:invokespecial   #37  <Method void zzasg(Context, zzaso)>
	//   15   26:putfield        #39  <Field zzasg zzbkK>
	//   16   29:return          
	}

	public void disconnect()
	{
		zzasg zzasg1 = zzbkK;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field zzasg zzbkK>
	//    2    4:astore_2        
		zzasg1;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag = isConnected();
	//    5    7:aload_0         
	//    6    8:invokevirtual   #47  <Method boolean isConnected()>
	//    7   11:istore_1        
		if(!flag)
			break MISSING_BLOCK_LABEL_43;
	//    8   12:iload_1         
	//    9   13:ifeq            43
		zzbkK.removeAllListeners();
	//   10   16:aload_0         
	//   11   17:getfield        #39  <Field zzasg zzbkK>
	//   12   20:invokevirtual   #50  <Method void zzasg.removeAllListeners()>
		zzbkK.zzIq();
	//   13   23:aload_0         
	//   14   24:getfield        #39  <Field zzasg zzbkK>
	//   15   27:invokevirtual   #53  <Method void zzasg.zzIq()>
		break MISSING_BLOCK_LABEL_43;
	//   16   30:goto            43
		Object obj;
		obj;
	//   17   33:astore_3        
		Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", ((Throwable) (obj)));
	//   18   34:ldc1            #55  <String "LocationClientImpl">
	//   19   36:ldc1            #57  <String "Client disconnected before listeners could be cleaned up">
	//   20   38:aload_3         
	//   21   39:invokestatic    #63  <Method int Log.e(String, String, Throwable)>
	//   22   42:pop             
		super.disconnect();
	//   23   43:aload_0         
	//   24   44:invokespecial   #65  <Method void zzarv.disconnect()>
		zzasg1;
	//   25   47:aload_2         
		JVM INSTR monitorexit ;
	//   26   48:monitorexit     
		return;
	//   27   49:return          
		obj;
	//   28   50:astore_3        
	//*  29   51:aload_2         
		throw obj;
	//   30   52:monitorexit     
	//   31   53:aload_3         
	//   32   54:athrow          
	}

	public Location getLastLocation()
	{
		return zzbkK.getLastLocation();
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field zzasg zzbkK>
	//    2    4:invokevirtual   #69  <Method Location zzasg.getLastLocation()>
	//    3    7:areturn         
	}

	public LocationAvailability zzIp()
	{
		return zzbkK.zzIp();
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field zzasg zzbkK>
	//    2    4:invokevirtual   #73  <Method LocationAvailability zzasg.zzIp()>
	//    3    7:areturn         
	}

	public void zza(long l, PendingIntent pendingintent)
		throws RemoteException
	{
		zzxC();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #79  <Method void zzxC()>
		zzac.zzw(((Object) (pendingintent)));
	//    2    4:aload_3         
	//    3    5:invokestatic    #85  <Method Object zzac.zzw(Object)>
	//    4    8:pop             
		boolean flag;
		if(l >= 0L)
	//*   5    9:lload_1         
	//*   6   10:lconst_0        
	//*   7   11:lcmp            
	//*   8   12:iflt            21
			flag = true;
	//    9   15:iconst_1        
	//   10   16:istore          4
		else
	//*  11   18:goto            24
			flag = false;
	//   12   21:iconst_0        
	//   13   22:istore          4
		zzac.zzb(flag, "detectionIntervalMillis must be >= 0");
	//   14   24:iload           4
	//   15   26:ldc1            #87  <String "detectionIntervalMillis must be >= 0">
	//   16   28:invokestatic    #90  <Method void zzac.zzb(boolean, Object)>
		((zzase)zzxD()).zza(l, true, pendingintent);
	//   17   31:aload_0         
	//   18   32:invokevirtual   #94  <Method android.os.IInterface zzxD()>
	//   19   35:checkcast       #96  <Class zzase>
	//   20   38:lload_1         
	//   21   39:iconst_1        
	//   22   40:aload_3         
	//   23   41:invokeinterface #99  <Method void zzase.zza(long, boolean, PendingIntent)>
	//   24   46:return          
	}

	public void zza(PendingIntent pendingintent, zzasc zzasc)
		throws RemoteException
	{
		zzbkK.zza(pendingintent, zzasc);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field zzasg zzbkK>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #103 <Method void zzasg.zza(PendingIntent, zzasc)>
	//    5    9:return          
	}

	public void zza(zzabh.zzb zzb1, zzasc zzasc)
		throws RemoteException
	{
		zzbkK.zza(zzb1, zzasc);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field zzasg zzbkK>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #106 <Method void zzasg.zza(zzabh$zzb, zzasc)>
	//    5    9:return          
	}

	public void zza(zzasc zzasc)
		throws RemoteException
	{
		zzbkK.zza(zzasc);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field zzasg zzbkK>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #111 <Method void zzasg.zza(zzasc)>
	//    4    8:return          
	}

	public void zza(zzasi zzasi, zzabh zzabh, zzasc zzasc)
		throws RemoteException
	{
		zzasg zzasg1 = zzbkK;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field zzasg zzbkK>
	//    2    4:astore          4
		zzasg1;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		zzbkK.zza(zzasi, zzabh, zzasc);
	//    5    9:aload_0         
	//    6   10:getfield        #39  <Field zzasg zzbkK>
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:invokevirtual   #114 <Method void zzasg.zza(zzasi, zzabh, zzasc)>
		zzasg1;
	//   11   19:aload           4
		JVM INSTR monitorexit ;
	//   12   21:monitorexit     
		return;
	//   13   22:return          
		zzasi;
	//   14   23:astore_1        
	//*  15   24:aload           4
		throw zzasi;
	//   16   26:monitorexit     
	//   17   27:aload_1         
	//   18   28:athrow          
	}

	public void zza(GeofencingRequest geofencingrequest, PendingIntent pendingintent, zzaad.zzb zzb1)
		throws RemoteException
	{
		zzxC();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #79  <Method void zzxC()>
		zzac.zzb(((Object) (geofencingrequest)), "geofencingRequest can't be null.");
	//    2    4:aload_1         
	//    3    5:ldc1            #118 <String "geofencingRequest can't be null.">
	//    4    7:invokestatic    #121 <Method Object zzac.zzb(Object, Object)>
	//    5   10:pop             
		zzac.zzb(((Object) (pendingintent)), "PendingIntent must be specified.");
	//    6   11:aload_2         
	//    7   12:ldc1            #123 <String "PendingIntent must be specified.">
	//    8   14:invokestatic    #121 <Method Object zzac.zzb(Object, Object)>
	//    9   17:pop             
		zzac.zzb(((Object) (zzb1)), "ResultHolder not provided.");
	//   10   18:aload_3         
	//   11   19:ldc1            #125 <String "ResultHolder not provided.">
	//   12   21:invokestatic    #121 <Method Object zzac.zzb(Object, Object)>
	//   13   24:pop             
		zzb1 = ((zzaad.zzb) (new zza(zzb1)));
	//   14   25:new             #6   <Class zzash$zza>
	//   15   28:dup             
	//   16   29:aload_3         
	//   17   30:invokespecial   #128 <Method void zzash$zza(zzaad$zzb)>
	//   18   33:astore_3        
		((zzase)zzxD()).zza(geofencingrequest, pendingintent, ((zzasd) (zzb1)));
	//   19   34:aload_0         
	//   20   35:invokevirtual   #94  <Method android.os.IInterface zzxD()>
	//   21   38:checkcast       #96  <Class zzase>
	//   22   41:aload_1         
	//   23   42:aload_2         
	//   24   43:aload_3         
	//   25   44:invokeinterface #131 <Method void zzase.zza(GeofencingRequest, PendingIntent, zzasd)>
	//   26   49:return          
	}

	public void zza(LocationRequest locationrequest, PendingIntent pendingintent, zzasc zzasc)
		throws RemoteException
	{
		zzbkK.zza(locationrequest, pendingintent, zzasc);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field zzasg zzbkK>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #135 <Method void zzasg.zza(LocationRequest, PendingIntent, zzasc)>
	//    6   10:return          
	}

	public void zza(LocationRequest locationrequest, zzabh zzabh, zzasc zzasc)
		throws RemoteException
	{
		zzasg zzasg1 = zzbkK;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field zzasg zzbkK>
	//    2    4:astore          4
		zzasg1;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		zzbkK.zza(locationrequest, zzabh, zzasc);
	//    5    9:aload_0         
	//    6   10:getfield        #39  <Field zzasg zzbkK>
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:invokevirtual   #138 <Method void zzasg.zza(LocationRequest, zzabh, zzasc)>
		zzasg1;
	//   11   19:aload           4
		JVM INSTR monitorexit ;
	//   12   21:monitorexit     
		return;
	//   13   22:return          
		locationrequest;
	//   14   23:astore_1        
	//*  15   24:aload           4
		throw locationrequest;
	//   16   26:monitorexit     
	//   17   27:aload_1         
	//   18   28:athrow          
	}

	public void zza(LocationSettingsRequest locationsettingsrequest, zzaad.zzb zzb1, String s)
		throws RemoteException
	{
		zzxC();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #79  <Method void zzxC()>
		boolean flag;
		if(locationsettingsrequest != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          14
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore          4
		else
	//*   6   11:goto            17
			flag = false;
	//    7   14:iconst_0        
	//    8   15:istore          4
		zzac.zzb(flag, "locationSettingsRequest can't be null nor empty.");
	//    9   17:iload           4
	//   10   19:ldc1            #142 <String "locationSettingsRequest can't be null nor empty.">
	//   11   21:invokestatic    #90  <Method void zzac.zzb(boolean, Object)>
		if(zzb1 != null)
	//*  12   24:aload_2         
	//*  13   25:ifnull          34
			flag = true;
	//   14   28:iconst_1        
	//   15   29:istore          4
		else
	//*  16   31:goto            37
			flag = false;
	//   17   34:iconst_0        
	//   18   35:istore          4
		zzac.zzb(flag, "listener can't be null.");
	//   19   37:iload           4
	//   20   39:ldc1            #144 <String "listener can't be null.">
	//   21   41:invokestatic    #90  <Method void zzac.zzb(boolean, Object)>
		zzb1 = ((zzaad.zzb) (new zzc(zzb1)));
	//   22   44:new             #12  <Class zzash$zzc>
	//   23   47:dup             
	//   24   48:aload_2         
	//   25   49:invokespecial   #145 <Method void zzash$zzc(zzaad$zzb)>
	//   26   52:astore_2        
		((zzase)zzxD()).zza(locationsettingsrequest, ((zzasf) (zzb1)), s);
	//   27   53:aload_0         
	//   28   54:invokevirtual   #94  <Method android.os.IInterface zzxD()>
	//   29   57:checkcast       #96  <Class zzase>
	//   30   60:aload_1         
	//   31   61:aload_2         
	//   32   62:aload_3         
	//   33   63:invokeinterface #148 <Method void zzase.zza(LocationSettingsRequest, zzasf, String)>
	//   34   68:return          
	}

	public void zza(zzt zzt, zzaad.zzb zzb1)
		throws RemoteException
	{
		zzxC();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #79  <Method void zzxC()>
		zzac.zzb(((Object) (zzt)), "removeGeofencingRequest can't be null.");
	//    2    4:aload_1         
	//    3    5:ldc1            #152 <String "removeGeofencingRequest can't be null.">
	//    4    7:invokestatic    #121 <Method Object zzac.zzb(Object, Object)>
	//    5   10:pop             
		zzac.zzb(((Object) (zzb1)), "ResultHolder not provided.");
	//    6   11:aload_2         
	//    7   12:ldc1            #125 <String "ResultHolder not provided.">
	//    8   14:invokestatic    #121 <Method Object zzac.zzb(Object, Object)>
	//    9   17:pop             
		zzb1 = ((zzaad.zzb) (new zzb(zzb1)));
	//   10   18:new             #9   <Class zzash$zzb>
	//   11   21:dup             
	//   12   22:aload_2         
	//   13   23:invokespecial   #153 <Method void zzash$zzb(zzaad$zzb)>
	//   14   26:astore_2        
		((zzase)zzxD()).zza(zzt, ((zzasd) (zzb1)));
	//   15   27:aload_0         
	//   16   28:invokevirtual   #94  <Method android.os.IInterface zzxD()>
	//   17   31:checkcast       #96  <Class zzase>
	//   18   34:aload_1         
	//   19   35:aload_2         
	//   20   36:invokeinterface #156 <Method void zzase.zza(zzt, zzasd)>
	//   21   41:return          
	}

	public void zzaH(boolean flag)
		throws RemoteException
	{
		zzbkK.zzaH(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field zzasg zzbkK>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #161 <Method void zzasg.zzaH(boolean)>
	//    4    8:return          
	}

	public void zzb(zzabh.zzb zzb1, zzasc zzasc)
		throws RemoteException
	{
		zzbkK.zzb(zzb1, zzasc);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field zzasg zzbkK>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #163 <Method void zzasg.zzb(zzabh$zzb, zzasc)>
	//    5    9:return          
	}

	public void zzc(PendingIntent pendingintent)
		throws RemoteException
	{
		zzxC();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #79  <Method void zzxC()>
		zzac.zzw(((Object) (pendingintent)));
	//    2    4:aload_1         
	//    3    5:invokestatic    #85  <Method Object zzac.zzw(Object)>
	//    4    8:pop             
		((zzase)zzxD()).zzc(pendingintent);
	//    5    9:aload_0         
	//    6   10:invokevirtual   #94  <Method android.os.IInterface zzxD()>
	//    7   13:checkcast       #96  <Class zzase>
	//    8   16:aload_1         
	//    9   17:invokeinterface #167 <Method void zzase.zzc(PendingIntent)>
	//   10   22:return          
	}

	public void zzd(Location location)
		throws RemoteException
	{
		zzbkK.zzd(location);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field zzasg zzbkK>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #171 <Method void zzasg.zzd(Location)>
	//    4    8:return          
	}

	private final zzasg zzbkK;
}
