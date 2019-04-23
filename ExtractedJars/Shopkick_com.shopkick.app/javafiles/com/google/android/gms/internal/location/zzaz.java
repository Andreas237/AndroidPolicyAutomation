// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.StatusCallback;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.*;

// Referenced classes of package com.google.android.gms.internal.location:
//			zzk, zzas, zzao, zzba, 
//			zzbc, zzbb, zzaj, zzbd

public final class zzaz extends zzk
{

	public zzaz(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s)
	{
		this(context, looper, connectioncallbacks, onconnectionfailedlistener, s, ClientSettings.createDefault(context));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload_1         
	//    7    9:invokestatic    #14  <Method ClientSettings ClientSettings.createDefault(Context)>
	//    8   12:invokespecial   #17  <Method void zzaz(Context, Looper, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener, String, ClientSettings)>
	//    9   15:return          
	}

	public zzaz(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s, ClientSettings clientsettings)
	{
		super(context, looper, connectioncallbacks, onconnectionfailedlistener, s, clientsettings);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:invokespecial   #20  <Method void zzk(Context, Looper, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener, String, ClientSettings)>
		zzde = new zzas(context, zzcb);
	//    8   13:aload_0         
	//    9   14:new             #22  <Class zzas>
	//   10   17:dup             
	//   11   18:aload_1         
	//   12   19:aload_0         
	//   13   20:getfield        #26  <Field zzbj zzcb>
	//   14   23:invokespecial   #29  <Method void zzas(Context, zzbj)>
	//   15   26:putfield        #31  <Field zzas zzde>
	//   16   29:return          
	}

	public final void disconnect()
	{
		zzas zzas1 = zzde;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field zzas zzde>
	//    2    4:astore_2        
		zzas1;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag = isConnected();
	//    5    7:aload_0         
	//    6    8:invokevirtual   #40  <Method boolean isConnected()>
	//    7   11:istore_1        
		if(!flag)
			break MISSING_BLOCK_LABEL_43;
	//    8   12:iload_1         
	//    9   13:ifeq            43
		zzde.removeAllListeners();
	//   10   16:aload_0         
	//   11   17:getfield        #31  <Field zzas zzde>
	//   12   20:invokevirtual   #43  <Method void zzas.removeAllListeners()>
		zzde.zzb();
	//   13   23:aload_0         
	//   14   24:getfield        #31  <Field zzas zzde>
	//   15   27:invokevirtual   #46  <Method void zzas.zzb()>
		break MISSING_BLOCK_LABEL_43;
	//   16   30:goto            43
		Object obj;
		obj;
	//   17   33:astore_3        
		Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", ((Throwable) (obj)));
	//   18   34:ldc1            #48  <String "LocationClientImpl">
	//   19   36:ldc1            #50  <String "Client disconnected before listeners could be cleaned up">
	//   20   38:aload_3         
	//   21   39:invokestatic    #56  <Method int Log.e(String, String, Throwable)>
	//   22   42:pop             
		super.disconnect();
	//   23   43:aload_0         
	//   24   44:invokespecial   #58  <Method void zzk.disconnect()>
		zzas1;
	//   25   47:aload_2         
		JVM INSTR monitorexit ;
	//   26   48:monitorexit     
		return;
	//   27   49:return          
		obj;
	//   28   50:astore_3        
		zzas1;
	//   29   51:aload_2         
		JVM INSTR monitorexit ;
	//   30   52:monitorexit     
		throw obj;
	//   31   53:aload_3         
	//   32   54:athrow          
	}

	public final Location getLastLocation()
		throws RemoteException
	{
		return zzde.getLastLocation();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field zzas zzde>
	//    2    4:invokevirtual   #64  <Method Location zzas.getLastLocation()>
	//    3    7:areturn         
	}

	public final LocationAvailability zza()
		throws RemoteException
	{
		return zzde.zza();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field zzas zzde>
	//    2    4:invokevirtual   #69  <Method LocationAvailability zzas.zza()>
	//    3    7:areturn         
	}

	public final void zza(long l, PendingIntent pendingintent)
		throws RemoteException
	{
		checkConnected();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #73  <Method void checkConnected()>
		Preconditions.checkNotNull(((Object) (pendingintent)));
	//    2    4:aload_3         
	//    3    5:invokestatic    #79  <Method Object Preconditions.checkNotNull(Object)>
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
		Preconditions.checkArgument(flag, "detectionIntervalMillis must be >= 0");
	//   14   24:iload           4
	//   15   26:ldc1            #81  <String "detectionIntervalMillis must be >= 0">
	//   16   28:invokestatic    #85  <Method void Preconditions.checkArgument(boolean, Object)>
		((zzao)getService()).zza(l, true, pendingintent);
	//   17   31:aload_0         
	//   18   32:invokevirtual   #89  <Method android.os.IInterface getService()>
	//   19   35:checkcast       #91  <Class zzao>
	//   20   38:lload_1         
	//   21   39:iconst_1        
	//   22   40:aload_3         
	//   23   41:invokeinterface #94  <Method void zzao.zza(long, boolean, PendingIntent)>
	//   24   46:return          
	}

	public final void zza(PendingIntent pendingintent, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
		throws RemoteException
	{
		checkConnected();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #73  <Method void checkConnected()>
		Preconditions.checkNotNull(((Object) (resultholder)), "ResultHolder not provided.");
	//    2    4:aload_2         
	//    3    5:ldc1            #97  <String "ResultHolder not provided.">
	//    4    7:invokestatic    #100 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    5   10:pop             
		resultholder = ((com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder) (new StatusCallback(resultholder)));
	//    6   11:new             #102 <Class StatusCallback>
	//    7   14:dup             
	//    8   15:aload_2         
	//    9   16:invokespecial   #105 <Method void StatusCallback(com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder)>
	//   10   19:astore_2        
		((zzao)getService()).zza(pendingintent, ((com.google.android.gms.common.api.internal.IStatusCallback) (resultholder)));
	//   11   20:aload_0         
	//   12   21:invokevirtual   #89  <Method android.os.IInterface getService()>
	//   13   24:checkcast       #91  <Class zzao>
	//   14   27:aload_1         
	//   15   28:aload_2         
	//   16   29:invokeinterface #108 <Method void zzao.zza(PendingIntent, com.google.android.gms.common.api.internal.IStatusCallback)>
	//   17   34:return          
	}

	public final void zza(PendingIntent pendingintent, zzaj zzaj)
		throws RemoteException
	{
		zzde.zza(pendingintent, zzaj);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field zzas zzde>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #113 <Method void zzas.zza(PendingIntent, zzaj)>
	//    5    9:return          
	}

	public final void zza(Location location)
		throws RemoteException
	{
		zzde.zza(location);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field zzas zzde>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #116 <Method void zzas.zza(Location)>
	//    4    8:return          
	}

	public final void zza(com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerkey, zzaj zzaj)
		throws RemoteException
	{
		zzde.zza(listenerkey, zzaj);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field zzas zzde>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #119 <Method void zzas.zza(com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey, zzaj)>
	//    5    9:return          
	}

	public final void zza(zzaj zzaj)
		throws RemoteException
	{
		zzde.zza(zzaj);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field zzas zzde>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #123 <Method void zzas.zza(zzaj)>
	//    4    8:return          
	}

	public final void zza(zzbd zzbd, ListenerHolder listenerholder, zzaj zzaj)
		throws RemoteException
	{
		synchronized(zzde)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field zzas zzde>
	//*   2    4:astore          4
	//*   3    6:aload           4
	//*   4    8:monitorenter    
		{
			zzde.zza(zzbd, listenerholder, zzaj);
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field zzas zzde>
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:invokevirtual   #126 <Method void zzas.zza(zzbd, ListenerHolder, zzaj)>
		}
	//   11   19:aload           4
	//   12   21:monitorexit     
		return;
	//   13   22:return          
		zzbd;
	//   14   23:astore_1        
		zzas1;
	//   15   24:aload           4
		JVM INSTR monitorexit ;
	//   16   26:monitorexit     
		throw zzbd;
	//   17   27:aload_1         
	//   18   28:athrow          
	}

	public final void zza(ActivityTransitionRequest activitytransitionrequest, PendingIntent pendingintent, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
		throws RemoteException
	{
		checkConnected();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #73  <Method void checkConnected()>
		Preconditions.checkNotNull(((Object) (resultholder)), "ResultHolder not provided.");
	//    2    4:aload_3         
	//    3    5:ldc1            #97  <String "ResultHolder not provided.">
	//    4    7:invokestatic    #100 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    5   10:pop             
		resultholder = ((com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder) (new StatusCallback(resultholder)));
	//    6   11:new             #102 <Class StatusCallback>
	//    7   14:dup             
	//    8   15:aload_3         
	//    9   16:invokespecial   #105 <Method void StatusCallback(com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder)>
	//   10   19:astore_3        
		((zzao)getService()).zza(activitytransitionrequest, pendingintent, ((com.google.android.gms.common.api.internal.IStatusCallback) (resultholder)));
	//   11   20:aload_0         
	//   12   21:invokevirtual   #89  <Method android.os.IInterface getService()>
	//   13   24:checkcast       #91  <Class zzao>
	//   14   27:aload_1         
	//   15   28:aload_2         
	//   16   29:aload_3         
	//   17   30:invokeinterface #131 <Method void zzao.zza(ActivityTransitionRequest, PendingIntent, com.google.android.gms.common.api.internal.IStatusCallback)>
	//   18   35:return          
	}

	public final void zza(GeofencingRequest geofencingrequest, PendingIntent pendingintent, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
		throws RemoteException
	{
		checkConnected();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #73  <Method void checkConnected()>
		Preconditions.checkNotNull(((Object) (geofencingrequest)), "geofencingRequest can't be null.");
	//    2    4:aload_1         
	//    3    5:ldc1            #135 <String "geofencingRequest can't be null.">
	//    4    7:invokestatic    #100 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    5   10:pop             
		Preconditions.checkNotNull(((Object) (pendingintent)), "PendingIntent must be specified.");
	//    6   11:aload_2         
	//    7   12:ldc1            #137 <String "PendingIntent must be specified.">
	//    8   14:invokestatic    #100 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    9   17:pop             
		Preconditions.checkNotNull(((Object) (resultholder)), "ResultHolder not provided.");
	//   10   18:aload_3         
	//   11   19:ldc1            #97  <String "ResultHolder not provided.">
	//   12   21:invokestatic    #100 <Method Object Preconditions.checkNotNull(Object, Object)>
	//   13   24:pop             
		resultholder = ((com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder) (new zzba(resultholder)));
	//   14   25:new             #139 <Class zzba>
	//   15   28:dup             
	//   16   29:aload_3         
	//   17   30:invokespecial   #140 <Method void zzba(com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder)>
	//   18   33:astore_3        
		((zzao)getService()).zza(geofencingrequest, pendingintent, ((zzam) (resultholder)));
	//   19   34:aload_0         
	//   20   35:invokevirtual   #89  <Method android.os.IInterface getService()>
	//   21   38:checkcast       #91  <Class zzao>
	//   22   41:aload_1         
	//   23   42:aload_2         
	//   24   43:aload_3         
	//   25   44:invokeinterface #143 <Method void zzao.zza(GeofencingRequest, PendingIntent, zzam)>
	//   26   49:return          
	}

	public final void zza(LocationRequest locationrequest, PendingIntent pendingintent, zzaj zzaj)
		throws RemoteException
	{
		zzde.zza(locationrequest, pendingintent, zzaj);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field zzas zzde>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #147 <Method void zzas.zza(LocationRequest, PendingIntent, zzaj)>
	//    6   10:return          
	}

	public final void zza(LocationRequest locationrequest, ListenerHolder listenerholder, zzaj zzaj)
		throws RemoteException
	{
		synchronized(zzde)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field zzas zzde>
	//*   2    4:astore          4
	//*   3    6:aload           4
	//*   4    8:monitorenter    
		{
			zzde.zza(locationrequest, listenerholder, zzaj);
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field zzas zzde>
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:invokevirtual   #150 <Method void zzas.zza(LocationRequest, ListenerHolder, zzaj)>
		}
	//   11   19:aload           4
	//   12   21:monitorexit     
		return;
	//   13   22:return          
		locationrequest;
	//   14   23:astore_1        
		zzas1;
	//   15   24:aload           4
		JVM INSTR monitorexit ;
	//   16   26:monitorexit     
		throw locationrequest;
	//   17   27:aload_1         
	//   18   28:athrow          
	}

	public final void zza(LocationSettingsRequest locationsettingsrequest, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder, String s)
		throws RemoteException
	{
		checkConnected();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #73  <Method void checkConnected()>
		boolean flag1 = true;
	//    2    4:iconst_1        
	//    3    5:istore          5
		boolean flag;
		if(locationsettingsrequest != null)
	//*   4    7:aload_1         
	//*   5    8:ifnull          17
			flag = true;
	//    6   11:iconst_1        
	//    7   12:istore          4
		else
	//*   8   14:goto            20
			flag = false;
	//    9   17:iconst_0        
	//   10   18:istore          4
		Preconditions.checkArgument(flag, "locationSettingsRequest can't be null nor empty.");
	//   11   20:iload           4
	//   12   22:ldc1            #154 <String "locationSettingsRequest can't be null nor empty.">
	//   13   24:invokestatic    #85  <Method void Preconditions.checkArgument(boolean, Object)>
		if(resultholder != null)
	//*  14   27:aload_2         
	//*  15   28:ifnull          38
			flag = flag1;
	//   16   31:iload           5
	//   17   33:istore          4
		else
	//*  18   35:goto            41
			flag = false;
	//   19   38:iconst_0        
	//   20   39:istore          4
		Preconditions.checkArgument(flag, "listener can't be null.");
	//   21   41:iload           4
	//   22   43:ldc1            #156 <String "listener can't be null.">
	//   23   45:invokestatic    #85  <Method void Preconditions.checkArgument(boolean, Object)>
		resultholder = ((com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder) (new zzbc(resultholder)));
	//   24   48:new             #158 <Class zzbc>
	//   25   51:dup             
	//   26   52:aload_2         
	//   27   53:invokespecial   #159 <Method void zzbc(com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder)>
	//   28   56:astore_2        
		((zzao)getService()).zza(locationsettingsrequest, ((zzaq) (resultholder)), s);
	//   29   57:aload_0         
	//   30   58:invokevirtual   #89  <Method android.os.IInterface getService()>
	//   31   61:checkcast       #91  <Class zzao>
	//   32   64:aload_1         
	//   33   65:aload_2         
	//   34   66:aload_3         
	//   35   67:invokeinterface #162 <Method void zzao.zza(LocationSettingsRequest, zzaq, String)>
	//   36   72:return          
	}

	public final void zza(zzal zzal, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
		throws RemoteException
	{
		checkConnected();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #73  <Method void checkConnected()>
		Preconditions.checkNotNull(((Object) (zzal)), "removeGeofencingRequest can't be null.");
	//    2    4:aload_1         
	//    3    5:ldc1            #166 <String "removeGeofencingRequest can't be null.">
	//    4    7:invokestatic    #100 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    5   10:pop             
		Preconditions.checkNotNull(((Object) (resultholder)), "ResultHolder not provided.");
	//    6   11:aload_2         
	//    7   12:ldc1            #97  <String "ResultHolder not provided.">
	//    8   14:invokestatic    #100 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    9   17:pop             
		resultholder = ((com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder) (new zzbb(resultholder)));
	//   10   18:new             #168 <Class zzbb>
	//   11   21:dup             
	//   12   22:aload_2         
	//   13   23:invokespecial   #169 <Method void zzbb(com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder)>
	//   14   26:astore_2        
		((zzao)getService()).zza(zzal, ((zzam) (resultholder)));
	//   15   27:aload_0         
	//   16   28:invokevirtual   #89  <Method android.os.IInterface getService()>
	//   17   31:checkcast       #91  <Class zzao>
	//   18   34:aload_1         
	//   19   35:aload_2         
	//   20   36:invokeinterface #172 <Method void zzao.zza(zzal, zzam)>
	//   21   41:return          
	}

	public final void zza(boolean flag)
		throws RemoteException
	{
		zzde.zza(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field zzas zzde>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #176 <Method void zzas.zza(boolean)>
	//    4    8:return          
	}

	public final void zzb(PendingIntent pendingintent)
		throws RemoteException
	{
		checkConnected();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #73  <Method void checkConnected()>
		Preconditions.checkNotNull(((Object) (pendingintent)));
	//    2    4:aload_1         
	//    3    5:invokestatic    #79  <Method Object Preconditions.checkNotNull(Object)>
	//    4    8:pop             
		((zzao)getService()).zzb(pendingintent);
	//    5    9:aload_0         
	//    6   10:invokevirtual   #89  <Method android.os.IInterface getService()>
	//    7   13:checkcast       #91  <Class zzao>
	//    8   16:aload_1         
	//    9   17:invokeinterface #179 <Method void zzao.zzb(PendingIntent)>
	//   10   22:return          
	}

	public final void zzb(com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerkey, zzaj zzaj)
		throws RemoteException
	{
		zzde.zzb(listenerkey, zzaj);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field zzas zzde>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #181 <Method void zzas.zzb(com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey, zzaj)>
	//    5    9:return          
	}

	private final zzas zzde;
}
