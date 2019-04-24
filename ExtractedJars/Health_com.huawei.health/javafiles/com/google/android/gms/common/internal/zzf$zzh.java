// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzf

public final class zzf$zzh
	implements ServiceConnection
{

	public void onServiceConnected(ComponentName componentname, IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       19
		{
			zzaFu.zza(8, ((android.os.Bundle) (null)), zzaFx);
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field zzf zzaFu>
	//    4    8:bipush          8
	//    5   10:aconst_null     
	//    6   11:aload_0         
	//    7   12:getfield        #22  <Field int zzaFx>
	//    8   15:invokevirtual   #29  <Method void zzf.zza(int, android.os.Bundle, int)>
			return;
	//    9   18:return          
		}
		componentname = ((ComponentName) (zzf.zza(zzaFu)));
	//   10   19:aload_0         
	//   11   20:getfield        #17  <Field zzf zzaFu>
	//   12   23:invokestatic    #32  <Method Object zzf.zza(zzf)>
	//   13   26:astore_1        
		componentname;
	//   14   27:aload_1         
		JVM INSTR monitorenter ;
	//   15   28:monitorenter    
		zzf.zza(zzaFu, zzv$zza.zzbu(ibinder));
	//   16   29:aload_0         
	//   17   30:getfield        #17  <Field zzf zzaFu>
	//   18   33:aload_2         
	//   19   34:invokestatic    #38  <Method zzv zzv$zza.zzbu(IBinder)>
	//   20   37:invokestatic    #41  <Method zzv zzf.zza(zzf, zzv)>
	//   21   40:pop             
		componentname;
	//   22   41:aload_1         
		JVM INSTR monitorexit ;
	//   23   42:monitorexit     
		  goto _L1
	//*  24   43:goto            51
		ibinder;
	//   25   46:astore_2        
	//*  26   47:aload_1         
		throw ibinder;
	//   27   48:monitorexit     
	//   28   49:aload_2         
	//   29   50:athrow          
_L1:
		zzaFu.zza(0, ((android.os.Bundle) (null)), zzaFx);
	//   30   51:aload_0         
	//   31   52:getfield        #17  <Field zzf zzaFu>
	//   32   55:iconst_0        
	//   33   56:aconst_null     
	//   34   57:aload_0         
	//   35   58:getfield        #22  <Field int zzaFx>
	//   36   61:invokevirtual   #29  <Method void zzf.zza(int, android.os.Bundle, int)>
		return;
	//   37   64:return          
	}

	public void onServiceDisconnected(ComponentName componentname)
	{
		componentname = ((ComponentName) (zzf.zza(zzaFu)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzf zzaFu>
	//    2    4:invokestatic    #32  <Method Object zzf.zza(zzf)>
	//    3    7:astore_1        
		componentname;
	//    4    8:aload_1         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		zzf.zza(zzaFu, ((zzv) (null)));
	//    6   10:aload_0         
	//    7   11:getfield        #17  <Field zzf zzaFu>
	//    8   14:aconst_null     
	//    9   15:invokestatic    #41  <Method zzv zzf.zza(zzf, zzv)>
	//   10   18:pop             
		componentname;
	//   11   19:aload_1         
		JVM INSTR monitorexit ;
	//   12   20:monitorexit     
		  goto _L1
	//*  13   21:goto            29
		Exception exception;
		exception;
	//   14   24:astore_2        
	//*  15   25:aload_1         
		throw exception;
	//   16   26:monitorexit     
	//   17   27:aload_2         
	//   18   28:athrow          
_L1:
		zzaFu.mHandler.sendMessage(zzaFu.mHandler.obtainMessage(4, zzaFx, 1));
	//   19   29:aload_0         
	//   20   30:getfield        #17  <Field zzf zzaFu>
	//   21   33:getfield        #47  <Field Handler zzf.mHandler>
	//   22   36:aload_0         
	//   23   37:getfield        #17  <Field zzf zzaFu>
	//   24   40:getfield        #47  <Field Handler zzf.mHandler>
	//   25   43:iconst_4        
	//   26   44:aload_0         
	//   27   45:getfield        #22  <Field int zzaFx>
	//   28   48:iconst_1        
	//   29   49:invokevirtual   #53  <Method android.os.Message Handler.obtainMessage(int, int, int)>
	//   30   52:invokevirtual   #57  <Method boolean Handler.sendMessage(android.os.Message)>
	//   31   55:pop             
		return;
	//   32   56:return          
	}

	final zzf zzaFu;
	private final int zzaFx;

	public zzf$zzh(zzf zzf1, int i)
	{
		zzaFu = zzf1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field zzf zzaFu>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
		zzaFx = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #22  <Field int zzaFx>
	//    8   14:return          
	}
}
