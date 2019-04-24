// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.*;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzadz, zznk, zzkb, zzni, 
//			zzamg, zzaee, zzakb, zzaec, 
//			zzalc, zzang, zzakk, zzaol, 
//			zzadx, zzaen

public final class zzaed extends zzadz
	implements com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
{

	public zzaed(Context context, zzang zzang1, zzaol zzaol, zzadx zzadx)
	{
		super(zzaol, zzadx);
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:aload           4
	//    3    4:invokespecial   #28  <Method void zzadz(zzaol, zzadx)>
	//    4    7:aload_0         
	//    5    8:new             #30  <Class Object>
	//    6   11:dup             
	//    7   12:invokespecial   #33  <Method void Object()>
	//    8   15:putfield        #35  <Field Object mLock>
		mContext = context;
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:putfield        #37  <Field Context mContext>
		zzyf = zzang1;
	//   12   23:aload_0         
	//   13   24:aload_2         
	//   14   25:putfield        #39  <Field zzang zzyf>
		zzccp = zzaol;
	//   15   28:aload_0         
	//   16   29:aload_3         
	//   17   30:putfield        #41  <Field zzaol zzccp>
		zzccq = zzadx;
	//   18   33:aload_0         
	//   19   34:aload           4
	//   20   36:putfield        #43  <Field zzadx zzccq>
		zzang1 = ((zzang) (zznk.zzavz));
	//   21   39:getstatic       #49  <Field zzna zznk.zzavz>
	//   22   42:astore_2        
		if(((Boolean)zzkb.zzik().zzd(((zzna) (zzang1)))).booleanValue())
	//*  23   43:invokestatic    #55  <Method zzni zzkb.zzik()>
	//*  24   46:aload_2         
	//*  25   47:invokevirtual   #61  <Method Object zzni.zzd(zzna)>
	//*  26   50:checkcast       #63  <Class Boolean>
	//*  27   53:invokevirtual   #67  <Method boolean Boolean.booleanValue()>
	//*  28   56:ifeq            69
			zzang1 = ((zzang) (zzbv.zzez().zzsa()));
	//   29   59:invokestatic    #73  <Method zzamg zzbv.zzez()>
	//   30   62:invokevirtual   #79  <Method android.os.Looper zzamg.zzsa()>
	//   31   65:astore_2        
		else
	//*  32   66:goto            74
			zzang1 = ((zzang) (context.getMainLooper()));
	//   33   69:aload_1         
	//   34   70:invokevirtual   #84  <Method android.os.Looper Context.getMainLooper()>
	//   35   73:astore_2        
		zzcct = new zzaee(context, ((android.os.Looper) (zzang1)), ((com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks) (this)), ((com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener) (this)));
	//   36   74:aload_0         
	//   37   75:new             #86  <Class zzaee>
	//   38   78:dup             
	//   39   79:aload_1         
	//   40   80:aload_2         
	//   41   81:aload_0         
	//   42   82:aload_0         
	//   43   83:invokespecial   #89  <Method void zzaee(Context, android.os.Looper, com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener)>
	//   44   86:putfield        #91  <Field zzaee zzcct>
		zzcct.checkAvailabilityAndConnect();
	//   45   89:aload_0         
	//   46   90:getfield        #91  <Field zzaee zzcct>
	//   47   93:invokevirtual   #94  <Method void zzaee.checkAvailabilityAndConnect()>
	//   48   96:return          
	}

	public final void onConnected(Bundle bundle)
	{
		((zzadz)this).zznt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #103 <Method Object zzadz.zznt()>
	//    2    4:pop             
	//    3    5:return          
	}

	public final void onConnectionFailed(ConnectionResult connectionresult)
	{
		zzakb.zzck("Cannot connect to remote service, fallback to local instance.");
	//    0    0:ldc1            #108 <String "Cannot connect to remote service, fallback to local instance.">
	//    1    2:invokestatic    #114 <Method void zzakb.zzck(String)>
		((zzalc) (new zzaec(mContext, zzccp, zzccq))).zznt();
	//    2    5:new             #116 <Class zzaec>
	//    3    8:dup             
	//    4    9:aload_0         
	//    5   10:getfield        #37  <Field Context mContext>
	//    6   13:aload_0         
	//    7   14:getfield        #41  <Field zzaol zzccp>
	//    8   17:aload_0         
	//    9   18:getfield        #43  <Field zzadx zzccq>
	//   10   21:invokespecial   #119 <Method void zzaec(Context, zzaol, zzadx)>
	//   11   24:invokeinterface #122 <Method Object zzalc.zznt()>
	//   12   29:pop             
		connectionresult = ((ConnectionResult) (new Bundle()));
	//   13   30:new             #124 <Class Bundle>
	//   14   33:dup             
	//   15   34:invokespecial   #125 <Method void Bundle()>
	//   16   37:astore_1        
		((Bundle) (connectionresult)).putString("action", "gms_connection_failed_fallback_to_local");
	//   17   38:aload_1         
	//   18   39:ldc1            #127 <String "action">
	//   19   41:ldc1            #129 <String "gms_connection_failed_fallback_to_local">
	//   20   43:invokevirtual   #133 <Method void Bundle.putString(String, String)>
		zzbv.zzek().zzb(mContext, zzyf.zzcw, "gmob-apps", ((Bundle) (connectionresult)), true);
	//   21   46:invokestatic    #137 <Method zzakk zzbv.zzek()>
	//   22   49:aload_0         
	//   23   50:getfield        #37  <Field Context mContext>
	//   24   53:aload_0         
	//   25   54:getfield        #39  <Field zzang zzyf>
	//   26   57:getfield        #143 <Field String zzang.zzcw>
	//   27   60:ldc1            #145 <String "gmob-apps">
	//   28   62:aload_1         
	//   29   63:iconst_1        
	//   30   64:invokevirtual   #151 <Method void zzakk.zzb(Context, String, String, Bundle, boolean)>
	//   31   67:return          
	}

	public final void onConnectionSuspended(int i)
	{
		zzakb.zzck("Disconnected from remote ad request service.");
	//    0    0:ldc1            #156 <String "Disconnected from remote ad request service.">
	//    1    2:invokestatic    #114 <Method void zzakb.zzck(String)>
	//    2    5:return          
	}

	public final void zznz()
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			if(zzcct.isConnected() || zzcct.isConnecting())
	//*   5    7:aload_0         
	//*   6    8:getfield        #91  <Field zzaee zzcct>
	//*   7   11:invokevirtual   #160 <Method boolean zzaee.isConnected()>
	//*   8   14:ifne            27
	//*   9   17:aload_0         
	//*  10   18:getfield        #91  <Field zzaee zzcct>
	//*  11   21:invokevirtual   #163 <Method boolean zzaee.isConnecting()>
	//*  12   24:ifeq            34
				zzcct.disconnect();
	//   13   27:aload_0         
	//   14   28:getfield        #91  <Field zzaee zzcct>
	//   15   31:invokevirtual   #166 <Method void zzaee.disconnect()>
			Binder.flushPendingCommands();
	//   16   34:invokestatic    #171 <Method void Binder.flushPendingCommands()>
		}
	//   17   37:aload_1         
	//   18   38:monitorexit     
		return;
	//   19   39:return          
		exception;
	//   20   40:astore_2        
		obj;
	//   21   41:aload_1         
		JVM INSTR monitorexit ;
	//   22   42:monitorexit     
		throw exception;
	//   23   43:aload_2         
	//   24   44:athrow          
	}

	public final zzaen zzoa()
	{
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object mLock>
	//*   2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		zzaen zzaen;
		synchronized(mLock)
		{
			zzaen = zzcct.zzob();
	//    5    7:aload_0         
	//    6    8:getfield        #91  <Field zzaee zzcct>
	//    7   11:invokevirtual   #180 <Method zzaen zzaee.zzob()>
	//    8   14:astore_2        
		}
	//    9   15:aload_1         
	//   10   16:monitorexit     
		return zzaen;
	//   11   17:aload_2         
	//   12   18:areturn         
_L1:
		obj;
	//   13   19:aload_1         
		JVM INSTR monitorexit ;
	//   14   20:monitorexit     
		return null;
	//   15   21:aconst_null     
	//   16   22:areturn         
_L2:
		obj;
	//   17   23:aload_1         
		JVM INSTR monitorexit ;
	//   18   24:monitorexit     
		throw obj1;
	//   19   25:aload_2         
	//   20   26:athrow          
		obj1;
	//   21   27:astore_2        
		  goto _L1
	//*  22   28:goto            19
		obj1;
	//   23   31:astore_2        
		  goto _L2
	//*  24   32:goto            23
	}

	private Context mContext;
	private final Object mLock = new Object();
	private zzaol zzccp;
	private final zzadx zzccq;
	private zzaee zzcct;
	private zzang zzyf;
}
