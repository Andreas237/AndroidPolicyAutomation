// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.*;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zzdg, zzee, zzef, zzeb, 
//			zzec, zzeg

public final class zzea extends GmsClient
	implements android.os.IBinder.DeathRecipient
{

	public zzea(Context context, Looper looper, ClientSettings clientsettings, CastDevice castdevice, Bundle bundle, com.google.android.gms.cast.CastRemoteDisplay.CastRemoteDisplaySessionCallbacks castremotedisplaysessioncallbacks, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, 
			com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		super(context, looper, 83, clientsettings, connectioncallbacks, onconnectionfailedlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:bipush          83
	//    4    5:aload_3         
	//    5    6:aload           7
	//    6    8:aload           8
	//    7   10:invokespecial   #33  <Method void GmsClient(Context, Looper, int, ClientSettings, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
		zzbd.d("instance created", new Object[0]);
	//    8   13:getstatic       #28  <Field zzdg zzbd>
	//    9   16:ldc1            #35  <String "instance created">
	//   10   18:iconst_0        
	//   11   19:anewarray       Object[]
	//   12   22:invokevirtual   #41  <Method void zzdg.d(String, Object[])>
		zzxy = castremotedisplaysessioncallbacks;
	//   13   25:aload_0         
	//   14   26:aload           6
	//   15   28:putfield        #43  <Field com.google.android.gms.cast.CastRemoteDisplay$CastRemoteDisplaySessionCallbacks zzxy>
		zzai = castdevice;
	//   16   31:aload_0         
	//   17   32:aload           4
	//   18   34:putfield        #45  <Field CastDevice zzai>
		zzxz = bundle;
	//   19   37:aload_0         
	//   20   38:aload           5
	//   21   40:putfield        #47  <Field Bundle zzxz>
	//   22   43:return          
	}

	static com.google.android.gms.cast.CastRemoteDisplay.CastRemoteDisplaySessionCallbacks zzb(zzea zzea1)
	{
		return zzea1.zzxy;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field com.google.android.gms.cast.CastRemoteDisplay$CastRemoteDisplaySessionCallbacks zzxy>
	//    2    4:areturn         
	}

	static zzdg zzdd()
	{
		return zzbd;
	//    0    0:getstatic       #28  <Field zzdg zzbd>
	//    1    3:areturn         
	}

	public final void binderDied()
	{
	//    0    0:return          
	}

	public final IInterface createServiceInterface(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
	//    4    6:aload_1         
	//    5    7:ldc1            #56  <String "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService">
	//    6    9:invokeinterface #62  <Method IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_2        
		if(iinterface instanceof zzee)
	//*   8   15:aload_2         
	//*   9   16:instanceof      #64  <Class zzee>
	//*  10   19:ifeq            27
			return ((IInterface) ((zzee)iinterface));
	//   11   22:aload_2         
	//   12   23:checkcast       #64  <Class zzee>
	//   13   26:areturn         
		else
			return ((IInterface) (new zzef(ibinder)));
	//   14   27:new             #66  <Class zzef>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:invokespecial   #69  <Method void zzef(IBinder)>
	//   18   35:areturn         
	}

	public final void disconnect()
	{
		zzbd.d("disconnect", new Object[0]);
	//    0    0:getstatic       #28  <Field zzdg zzbd>
	//    1    3:ldc1            #75  <String "disconnect">
	//    2    5:iconst_0        
	//    3    6:anewarray       Object[]
	//    4    9:invokevirtual   #41  <Method void zzdg.d(String, Object[])>
		zzxy = null;
	//    5   12:aload_0         
	//    6   13:aconst_null     
	//    7   14:putfield        #43  <Field com.google.android.gms.cast.CastRemoteDisplay$CastRemoteDisplaySessionCallbacks zzxy>
		zzai = null;
	//    8   17:aload_0         
	//    9   18:aconst_null     
	//   10   19:putfield        #45  <Field CastDevice zzai>
		Exception exception;
		try
		{
			((zzee)getService()).disconnect();
	//   11   22:aload_0         
	//   12   23:invokevirtual   #79  <Method IInterface getService()>
	//   13   26:checkcast       #64  <Class zzee>
	//   14   29:invokeinterface #81  <Method void zzee.disconnect()>
		}
	//*  15   34:aload_0         
	//*  16   35:invokespecial   #82  <Method void GmsClient.disconnect()>
	//*  17   38:return          
	//*  18   39:astore_1        
	//*  19   40:aload_0         
	//*  20   41:invokespecial   #82  <Method void GmsClient.disconnect()>
	//*  21   44:aload_1         
	//*  22   45:athrow          
	//*  23   46:aload_0         
	//*  24   47:invokespecial   #82  <Method void GmsClient.disconnect()>
	//*  25   50:return          
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			super.disconnect();
			return;
		}
		super.disconnect();
		return;
		exception;
		Object obj;
		super.disconnect();
		throw exception;
	//*  26   51:astore_1        
	//*  27   52:goto            46
	}

	public final int getMinApkVersion()
	{
		return 0xbdfcb8;
	//    0    0:ldc1            #85  <Int 0xbdfcb8>
	//    1    2:ireturn         
	}

	protected final String getServiceDescriptor()
	{
		return "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService";
	//    0    0:ldc1            #56  <String "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService">
	//    1    2:areturn         
	}

	protected final String getStartServiceAction()
	{
		return "com.google.android.gms.cast.remote_display.service.START";
	//    0    0:ldc1            #90  <String "com.google.android.gms.cast.remote_display.service.START">
	//    1    2:areturn         
	}

	public final void zza(zzec zzec)
		throws RemoteException
	{
		zzbd.d("stopRemoteDisplay", new Object[0]);
	//    0    0:getstatic       #28  <Field zzdg zzbd>
	//    1    3:ldc1            #94  <String "stopRemoteDisplay">
	//    2    5:iconst_0        
	//    3    6:anewarray       Object[]
	//    4    9:invokevirtual   #41  <Method void zzdg.d(String, Object[])>
		((zzee)getService()).zza(zzec);
	//    5   12:aload_0         
	//    6   13:invokevirtual   #79  <Method IInterface getService()>
	//    7   16:checkcast       #64  <Class zzee>
	//    8   19:aload_1         
	//    9   20:invokeinterface #96  <Method void zzee.zza(zzec)>
	//   10   25:return          
	}

	public final void zza(zzec zzec, zzeg zzeg, String s)
		throws RemoteException
	{
		zzbd.d("startRemoteDisplay", new Object[0]);
	//    0    0:getstatic       #28  <Field zzdg zzbd>
	//    1    3:ldc1            #100 <String "startRemoteDisplay">
	//    2    5:iconst_0        
	//    3    6:anewarray       Object[]
	//    4    9:invokevirtual   #41  <Method void zzdg.d(String, Object[])>
		zzeg = ((zzeg) (new zzeb(this, zzeg)));
	//    5   12:new             #102 <Class zzeb>
	//    6   15:dup             
	//    7   16:aload_0         
	//    8   17:aload_2         
	//    9   18:invokespecial   #105 <Method void zzeb(zzea, zzeg)>
	//   10   21:astore_2        
		((zzee)getService()).zza(zzec, zzeg, zzai.getDeviceId(), s, zzxz);
	//   11   22:aload_0         
	//   12   23:invokevirtual   #79  <Method IInterface getService()>
	//   13   26:checkcast       #64  <Class zzee>
	//   14   29:aload_1         
	//   15   30:aload_2         
	//   16   31:aload_0         
	//   17   32:getfield        #45  <Field CastDevice zzai>
	//   18   35:invokevirtual   #110 <Method String CastDevice.getDeviceId()>
	//   19   38:aload_3         
	//   20   39:aload_0         
	//   21   40:getfield        #47  <Field Bundle zzxz>
	//   22   43:invokeinterface #113 <Method void zzee.zza(zzec, zzeg, String, String, Bundle)>
	//   23   48:return          
	}

	private static final zzdg zzbd = new zzdg("CastRemoteDisplayClientImpl");
	private CastDevice zzai;
	private com.google.android.gms.cast.CastRemoteDisplay.CastRemoteDisplaySessionCallbacks zzxy;
	private Bundle zzxz;

	static 
	{
	//    0    0:new             #20  <Class zzdg>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "CastRemoteDisplayClientImpl">
	//    3    6:invokespecial   #26  <Method void zzdg(String)>
	//    4    9:putstatic       #28  <Field zzdg zzbd>
	//*   5   12:return          
	}
}
