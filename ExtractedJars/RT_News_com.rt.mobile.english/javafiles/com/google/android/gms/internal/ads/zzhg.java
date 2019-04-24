// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzhd, zzhk, zzakb

final class zzhg
	implements com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
{

	zzhg(zzhd zzhd1)
	{
		zzajt = zzhd1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzhd zzajt>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void onConnected(Bundle bundle)
	{
		bundle = ((Bundle) (zzhd.zzc(zzajt)));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzhd zzajt>
	//    2    4:invokestatic    #27  <Method Object zzhd.zzc(zzhd)>
	//    3    7:astore_1        
		bundle;
	//    4    8:aload_1         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		Object obj;
		try
		{
			if(zzhd.zzd(zzajt) != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #12  <Field zzhd zzajt>
	//*   8   14:invokestatic    #31  <Method zzhk zzhd.zzd(zzhd)>
	//*   9   17:ifnull          59
				zzhd.zza(zzajt, zzhd.zzd(zzajt).zzhl());
	//   10   20:aload_0         
	//   11   21:getfield        #12  <Field zzhd zzajt>
	//   12   24:aload_0         
	//   13   25:getfield        #12  <Field zzhd zzajt>
	//   14   28:invokestatic    #31  <Method zzhk zzhd.zzd(zzhd)>
	//   15   31:invokevirtual   #37  <Method zzho zzhk.zzhl()>
	//   16   34:invokestatic    #41  <Method zzho zzhd.zza(zzhd, zzho)>
	//   17   37:pop             
			break MISSING_BLOCK_LABEL_59;
	//   18   38:goto            59
		}
	//*  19   41:astore_2        
	//*  20   42:goto            72
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
	//   21   45:astore_2        
		break MISSING_BLOCK_LABEL_46;
		obj;
		break MISSING_BLOCK_LABEL_72;
		zzakb.zzb("Unable to obtain a cache service instance.", ((Throwable) (obj)));
	//   22   46:ldc1            #43  <String "Unable to obtain a cache service instance.">
	//   23   48:aload_2         
	//   24   49:invokestatic    #49  <Method void zzakb.zzb(String, Throwable)>
		zzhd.zza(zzajt);
	//   25   52:aload_0         
	//   26   53:getfield        #12  <Field zzhd zzajt>
	//   27   56:invokestatic    #51  <Method void zzhd.zza(zzhd)>
		zzhd.zzc(zzajt).notifyAll();
	//   28   59:aload_0         
	//   29   60:getfield        #12  <Field zzhd zzajt>
	//   30   63:invokestatic    #27  <Method Object zzhd.zzc(zzhd)>
	//   31   66:invokevirtual   #54  <Method void Object.notifyAll()>
		bundle;
	//   32   69:aload_1         
		JVM INSTR monitorexit ;
	//   33   70:monitorexit     
		return;
	//   34   71:return          
		bundle;
	//   35   72:aload_1         
		JVM INSTR monitorexit ;
	//   36   73:monitorexit     
		throw obj;
	//   37   74:aload_2         
	//   38   75:athrow          
	}

	public final void onConnectionSuspended(int i)
	{
		synchronized(zzhd.zzc(zzajt))
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field zzhd zzajt>
	//*   2    4:invokestatic    #27  <Method Object zzhd.zzc(zzhd)>
	//*   3    7:astore_2        
	//*   4    8:aload_2         
	//*   5    9:monitorenter    
		{
			zzhd.zza(zzajt, ((zzho) (null)));
	//    6   10:aload_0         
	//    7   11:getfield        #12  <Field zzhd zzajt>
	//    8   14:aconst_null     
	//    9   15:invokestatic    #41  <Method zzho zzhd.zza(zzhd, zzho)>
	//   10   18:pop             
			zzhd.zzc(zzajt).notifyAll();
	//   11   19:aload_0         
	//   12   20:getfield        #12  <Field zzhd zzajt>
	//   13   23:invokestatic    #27  <Method Object zzhd.zzc(zzhd)>
	//   14   26:invokevirtual   #54  <Method void Object.notifyAll()>
		}
	//   15   29:aload_2         
	//   16   30:monitorexit     
		return;
	//   17   31:return          
		exception;
	//   18   32:astore_3        
		obj;
	//   19   33:aload_2         
		JVM INSTR monitorexit ;
	//   20   34:monitorexit     
		throw exception;
	//   21   35:aload_3         
	//   22   36:athrow          
	}

	private final zzhd zzajt;
}
