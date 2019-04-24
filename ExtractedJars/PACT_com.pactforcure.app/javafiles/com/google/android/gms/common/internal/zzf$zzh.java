// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzf

public final class zzf$zzh
	implements ServiceConnection
{

	public void onServiceConnected(ComponentName componentname, IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       24
		{
			zzf.zza(zzaDV, new ConnectionResult(8, ((android.app.PendingIntent) (null)), "ServiceBroker IBinder is null"));
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field zzf zzaDV>
	//    4    8:new             #27  <Class ConnectionResult>
	//    5   11:dup             
	//    6   12:bipush          8
	//    7   14:aconst_null     
	//    8   15:ldc1            #29  <String "ServiceBroker IBinder is null">
	//    9   17:invokespecial   #32  <Method void ConnectionResult(int, android.app.PendingIntent, String)>
	//   10   20:invokestatic    #36  <Method void zzf.zza(zzf, ConnectionResult)>
			return;
	//   11   23:return          
		}
		synchronized(zzf.zza(zzaDV))
	//*  12   24:aload_0         
	//*  13   25:getfield        #17  <Field zzf zzaDV>
	//*  14   28:invokestatic    #39  <Method Object zzf.zza(zzf)>
	//*  15   31:astore_1        
	//*  16   32:aload_1         
	//*  17   33:monitorenter    
		{
			zzf.zza(zzaDV, zzv$zza.zzbu(ibinder));
	//   18   34:aload_0         
	//   19   35:getfield        #17  <Field zzf zzaDV>
	//   20   38:aload_2         
	//   21   39:invokestatic    #45  <Method zzv zzv$zza.zzbu(IBinder)>
	//   22   42:invokestatic    #48  <Method zzv zzf.zza(zzf, zzv)>
	//   23   45:pop             
		}
	//   24   46:aload_1         
	//   25   47:monitorexit     
		zzaDV.zza(0, ((android.os.Bundle) (null)), zzaDY);
	//   26   48:aload_0         
	//   27   49:getfield        #17  <Field zzf zzaDV>
	//   28   52:iconst_0        
	//   29   53:aconst_null     
	//   30   54:aload_0         
	//   31   55:getfield        #22  <Field int zzaDY>
	//   32   58:invokevirtual   #51  <Method void zzf.zza(int, android.os.Bundle, int)>
		return;
	//   33   61:return          
		ibinder;
	//   34   62:astore_2        
		componentname;
	//   35   63:aload_1         
		JVM INSTR monitorexit ;
	//   36   64:monitorexit     
		throw ibinder;
	//   37   65:aload_2         
	//   38   66:athrow          
	}

	public void onServiceDisconnected(ComponentName componentname)
	{
		synchronized(zzf.zza(zzaDV))
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field zzf zzaDV>
	//*   2    4:invokestatic    #39  <Method Object zzf.zza(zzf)>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:monitorenter    
		{
			zzf.zza(zzaDV, ((zzv) (null)));
	//    6   10:aload_0         
	//    7   11:getfield        #17  <Field zzf zzaDV>
	//    8   14:aconst_null     
	//    9   15:invokestatic    #48  <Method zzv zzf.zza(zzf, zzv)>
	//   10   18:pop             
		}
	//   11   19:aload_1         
	//   12   20:monitorexit     
		zzaDV.mHandler.sendMessage(zzaDV.mHandler.obtainMessage(4, zzaDY, 1));
	//   13   21:aload_0         
	//   14   22:getfield        #17  <Field zzf zzaDV>
	//   15   25:getfield        #57  <Field Handler zzf.mHandler>
	//   16   28:aload_0         
	//   17   29:getfield        #17  <Field zzf zzaDV>
	//   18   32:getfield        #57  <Field Handler zzf.mHandler>
	//   19   35:iconst_4        
	//   20   36:aload_0         
	//   21   37:getfield        #22  <Field int zzaDY>
	//   22   40:iconst_1        
	//   23   41:invokevirtual   #63  <Method android.os.Message Handler.obtainMessage(int, int, int)>
	//   24   44:invokevirtual   #67  <Method boolean Handler.sendMessage(android.os.Message)>
	//   25   47:pop             
		return;
	//   26   48:return          
		exception;
	//   27   49:astore_2        
		componentname;
	//   28   50:aload_1         
		JVM INSTR monitorexit ;
	//   29   51:monitorexit     
		throw exception;
	//   30   52:aload_2         
	//   31   53:athrow          
	}

	final zzf zzaDV;
	private final int zzaDY;

	public zzf$zzh(zzf zzf1, int i)
	{
		zzaDV = zzf1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field zzf zzaDV>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
		zzaDY = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #22  <Field int zzaDY>
	//    8   14:return          
	}
}
