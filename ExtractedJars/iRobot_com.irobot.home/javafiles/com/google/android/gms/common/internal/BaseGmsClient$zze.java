// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.common.internal:
//			BaseGmsClient, IGmsServiceBroker

public final class BaseGmsClient$zze
	implements ServiceConnection
{

	public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       14
		{
			BaseGmsClient.zza(zzcs, 16);
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field BaseGmsClient zzcs>
	//    4    8:bipush          16
	//    5   10:invokestatic    #29  <Method void BaseGmsClient.zza(BaseGmsClient, int)>
			return;
	//    6   13:return          
		}
		Object obj = BaseGmsClient.zza(zzcs);
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field BaseGmsClient zzcs>
	//    9   18:invokestatic    #32  <Method Object BaseGmsClient.zza(BaseGmsClient)>
	//   10   21:astore_3        
		obj;
	//   11   22:aload_3         
		JVM INSTR monitorenter ;
	//   12   23:monitorenter    
		BaseGmsClient basegmsclient = zzcs;
	//   13   24:aload_0         
	//   14   25:getfield        #18  <Field BaseGmsClient zzcs>
	//   15   28:astore          4
		if(ibinder == null)
	//*  16   30:aload_2         
	//*  17   31:ifnonnull       39
		{
			componentname = null;
	//   18   34:aconst_null     
	//   19   35:astore_1        
			break MISSING_BLOCK_LABEL_76;
	//   20   36:goto            76
		}
		componentname = ((ComponentName) (ibinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker")));
	//   21   39:aload_2         
	//   22   40:ldc1            #34  <String "com.google.android.gms.common.internal.IGmsServiceBroker">
	//   23   42:invokeinterface #40  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   24   47:astore_1        
		if(componentname == null)
			break MISSING_BLOCK_LABEL_67;
	//   25   48:aload_1         
	//   26   49:ifnull          67
		if(componentname instanceof IGmsServiceBroker)
	//*  27   52:aload_1         
	//*  28   53:instanceof      #42  <Class IGmsServiceBroker>
	//*  29   56:ifeq            67
		{
			componentname = ((ComponentName) ((IGmsServiceBroker)componentname));
	//   30   59:aload_1         
	//   31   60:checkcast       #42  <Class IGmsServiceBroker>
	//   32   63:astore_1        
			break MISSING_BLOCK_LABEL_76;
	//   33   64:goto            76
		}
		componentname = ((ComponentName) (new Stub.zza(ibinder)));
	//   34   67:new             #44  <Class IGmsServiceBroker$Stub$zza>
	//   35   70:dup             
	//   36   71:aload_2         
	//   37   72:invokespecial   #47  <Method void IGmsServiceBroker$Stub$zza(IBinder)>
	//   38   75:astore_1        
		BaseGmsClient.zza(basegmsclient, ((IGmsServiceBroker) (componentname)));
	//   39   76:aload           4
	//   40   78:aload_1         
	//   41   79:invokestatic    #50  <Method IGmsServiceBroker BaseGmsClient.zza(BaseGmsClient, IGmsServiceBroker)>
	//   42   82:pop             
		obj;
	//   43   83:aload_3         
		JVM INSTR monitorexit ;
	//   44   84:monitorexit     
		zzcs.zza(0, ((android.os.Bundle) (null)), zzcw);
	//   45   85:aload_0         
	//   46   86:getfield        #18  <Field BaseGmsClient zzcs>
	//   47   89:iconst_0        
	//   48   90:aconst_null     
	//   49   91:aload_0         
	//   50   92:getfield        #23  <Field int zzcw>
	//   51   95:invokevirtual   #53  <Method void BaseGmsClient.zza(int, android.os.Bundle, int)>
		return;
	//   52   98:return          
		componentname;
	//   53   99:astore_1        
		obj;
	//   54  100:aload_3         
		JVM INSTR monitorexit ;
	//   55  101:monitorexit     
		throw componentname;
	//   56  102:aload_1         
	//   57  103:athrow          
	}

	public final void onServiceDisconnected(ComponentName componentname)
	{
		synchronized(BaseGmsClient.zza(zzcs))
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field BaseGmsClient zzcs>
	//*   2    4:invokestatic    #32  <Method Object BaseGmsClient.zza(BaseGmsClient)>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:monitorenter    
		{
			BaseGmsClient.zza(zzcs, ((IGmsServiceBroker) (null)));
	//    6   10:aload_0         
	//    7   11:getfield        #18  <Field BaseGmsClient zzcs>
	//    8   14:aconst_null     
	//    9   15:invokestatic    #50  <Method IGmsServiceBroker BaseGmsClient.zza(BaseGmsClient, IGmsServiceBroker)>
	//   10   18:pop             
		}
	//   11   19:aload_1         
	//   12   20:monitorexit     
		zzcs.mHandler.sendMessage(zzcs.mHandler.obtainMessage(6, zzcw, 1));
	//   13   21:aload_0         
	//   14   22:getfield        #18  <Field BaseGmsClient zzcs>
	//   15   25:getfield        #59  <Field Handler BaseGmsClient.mHandler>
	//   16   28:aload_0         
	//   17   29:getfield        #18  <Field BaseGmsClient zzcs>
	//   18   32:getfield        #59  <Field Handler BaseGmsClient.mHandler>
	//   19   35:bipush          6
	//   20   37:aload_0         
	//   21   38:getfield        #23  <Field int zzcw>
	//   22   41:iconst_1        
	//   23   42:invokevirtual   #65  <Method android.os.Message Handler.obtainMessage(int, int, int)>
	//   24   45:invokevirtual   #69  <Method boolean Handler.sendMessage(android.os.Message)>
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

	private final BaseGmsClient zzcs;
	private final int zzcw;

	public BaseGmsClient$zze(BaseGmsClient basegmsclient, int i)
	{
		zzcs = basegmsclient;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field BaseGmsClient zzcs>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
		zzcw = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #23  <Field int zzcw>
	//    8   14:return          
	}
}
