// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.Clock;

public final class zzamj
{

	public zzamj(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzcty = 0x0L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #18  <Long 0x0L>
	//    4    8:putfield        #21  <Field long zzcty>
		mLock = new Object();
	//    5   11:aload_0         
	//    6   12:new             #4   <Class Object>
	//    7   15:dup             
	//    8   16:invokespecial   #17  <Method void Object()>
	//    9   19:putfield        #23  <Field Object mLock>
		zzctx = l;
	//   10   22:aload_0         
	//   11   23:lload_1         
	//   12   24:putfield        #25  <Field long zzctx>
	//   13   27:return          
	}

	public final boolean tryAcquire()
	{
		long l;
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field Object mLock>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
			{
				l = zzbv.zzer().elapsedRealtime();
	//    5    7:invokestatic    #34  <Method Clock zzbv.zzer()>
	//    6   10:invokeinterface #40  <Method long Clock.elapsedRealtime()>
	//    7   15:lstore_1        
				if(zzcty + zzctx <= l)
					break label0;
	//    8   16:aload_0         
	//    9   17:getfield        #21  <Field long zzcty>
	//   10   20:aload_0         
	//   11   21:getfield        #25  <Field long zzctx>
	//   12   24:ladd            
	//   13   25:lload_1         
	//   14   26:lcmp            
	//   15   27:ifle            34
			}
	//   16   30:aload_3         
	//   17   31:monitorexit     
			return false;
	//   18   32:iconst_0        
	//   19   33:ireturn         
		}
		zzcty = l;
	//   20   34:aload_0         
	//   21   35:lload_1         
	//   22   36:putfield        #21  <Field long zzcty>
		obj;
	//   23   39:aload_3         
		JVM INSTR monitorexit ;
	//   24   40:monitorexit     
		return true;
	//   25   41:iconst_1        
	//   26   42:ireturn         
		exception;
	//   27   43:astore          4
		obj;
	//   28   45:aload_3         
		JVM INSTR monitorexit ;
	//   29   46:monitorexit     
		throw exception;
	//   30   47:aload           4
	//   31   49:athrow          
	}

	private Object mLock;
	private long zzctx;
	private long zzcty;
}
