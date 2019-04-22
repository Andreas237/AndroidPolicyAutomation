// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.common.internal:
//			BaseGmsClient

public final class BaseGmsClient$GmsServiceConnection
	implements ServiceConnection
{

	public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       14
		{
			BaseGmsClient.zza(zzru, 16);
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field BaseGmsClient zzru>
	//    4    8:bipush          16
	//    5   10:invokestatic    #29  <Method void BaseGmsClient.zza(BaseGmsClient, int)>
			return;
	//    6   13:return          
		}
		synchronized(BaseGmsClient.zza(zzru))
	//*   7   14:aload_0         
	//*   8   15:getfield        #18  <Field BaseGmsClient zzru>
	//*   9   18:invokestatic    #32  <Method Object BaseGmsClient.zza(BaseGmsClient)>
	//*  10   21:astore_1        
	//*  11   22:aload_1         
	//*  12   23:monitorenter    
		{
			BaseGmsClient.zza(zzru, IGmsServiceBroker.Stub.asInterface(ibinder));
	//   13   24:aload_0         
	//   14   25:getfield        #18  <Field BaseGmsClient zzru>
	//   15   28:aload_2         
	//   16   29:invokestatic    #38  <Method IGmsServiceBroker IGmsServiceBroker$Stub.asInterface(IBinder)>
	//   17   32:invokestatic    #41  <Method IGmsServiceBroker BaseGmsClient.zza(BaseGmsClient, IGmsServiceBroker)>
	//   18   35:pop             
		}
	//   19   36:aload_1         
	//   20   37:monitorexit     
		zzru.onPostServiceBindingHandler(0, ((android.os.Bundle) (null)), zzrx);
	//   21   38:aload_0         
	//   22   39:getfield        #18  <Field BaseGmsClient zzru>
	//   23   42:iconst_0        
	//   24   43:aconst_null     
	//   25   44:aload_0         
	//   26   45:getfield        #23  <Field int zzrx>
	//   27   48:invokevirtual   #45  <Method void BaseGmsClient.onPostServiceBindingHandler(int, android.os.Bundle, int)>
		return;
	//   28   51:return          
		ibinder;
	//   29   52:astore_2        
		componentname;
	//   30   53:aload_1         
		JVM INSTR monitorexit ;
	//   31   54:monitorexit     
		throw ibinder;
	//   32   55:aload_2         
	//   33   56:athrow          
	}

	public final void onServiceDisconnected(ComponentName componentname)
	{
		synchronized(BaseGmsClient.zza(zzru))
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field BaseGmsClient zzru>
	//*   2    4:invokestatic    #32  <Method Object BaseGmsClient.zza(BaseGmsClient)>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:monitorenter    
		{
			BaseGmsClient.zza(zzru, ((IGmsServiceBroker) (null)));
	//    6   10:aload_0         
	//    7   11:getfield        #18  <Field BaseGmsClient zzru>
	//    8   14:aconst_null     
	//    9   15:invokestatic    #41  <Method IGmsServiceBroker BaseGmsClient.zza(BaseGmsClient, IGmsServiceBroker)>
	//   10   18:pop             
		}
	//   11   19:aload_1         
	//   12   20:monitorexit     
		zzru.mHandler.sendMessage(zzru.mHandler.obtainMessage(6, zzrx, 1));
	//   13   21:aload_0         
	//   14   22:getfield        #18  <Field BaseGmsClient zzru>
	//   15   25:getfield        #51  <Field Handler BaseGmsClient.mHandler>
	//   16   28:aload_0         
	//   17   29:getfield        #18  <Field BaseGmsClient zzru>
	//   18   32:getfield        #51  <Field Handler BaseGmsClient.mHandler>
	//   19   35:bipush          6
	//   20   37:aload_0         
	//   21   38:getfield        #23  <Field int zzrx>
	//   22   41:iconst_1        
	//   23   42:invokevirtual   #57  <Method android.os.Message Handler.obtainMessage(int, int, int)>
	//   24   45:invokevirtual   #61  <Method boolean Handler.sendMessage(android.os.Message)>
	//   25   48:pop             
		return;
	//   26   49:return          
		exception;
	//   27   50:astore_2        
		componentname;
	//   28   51:aload_1         
		JVM INSTR monitorexit ;
	//   29   52:monitorexit     
		throw exception;
	//   30   53:aload_2         
	//   31   54:athrow          
	}

	private final BaseGmsClient zzru;
	private final int zzrx;

	public BaseGmsClient$GmsServiceConnection(BaseGmsClient basegmsclient, int i)
	{
		zzru = basegmsclient;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field BaseGmsClient zzru>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
		zzrx = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #23  <Field int zzrx>
	//    8   14:return          
	}
}
