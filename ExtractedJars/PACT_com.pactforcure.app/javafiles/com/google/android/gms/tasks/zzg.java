// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tasks;

import java.util.ArrayDeque;
import java.util.Queue;

// Referenced classes of package com.google.android.gms.tasks:
//			zzf, Task

class zzg
{

	zzg()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #5   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void Object()>
	//    6   12:putfield        #18  <Field Object zzrN>
	//    7   15:return          
	}

	public void zza(Task task)
	{
label0:
		{
			synchronized(zzrN)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field Object zzrN>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(zzbLD != null && !zzbLE)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #24  <Field Queue zzbLD>
	//    7   11:ifnull          21
	//    8   14:aload_0         
	//    9   15:getfield        #26  <Field boolean zzbLE>
	//   10   18:ifeq            24
			}
	//   11   21:aload_2         
	//   12   22:monitorexit     
			return;
	//   13   23:return          
		}
		zzbLE = true;
	//   14   24:aload_0         
	//   15   25:iconst_1        
	//   16   26:putfield        #26  <Field boolean zzbLE>
		obj;
	//   17   29:aload_2         
		JVM INSTR monitorexit ;
	//   18   30:monitorexit     
_L2:
		obj = zzrN;
	//   19   31:aload_0         
	//   20   32:getfield        #18  <Field Object zzrN>
	//   21   35:astore_2        
		obj;
	//   22   36:aload_2         
		JVM INSTR monitorenter ;
	//   23   37:monitorenter    
		zzf zzf1 = (zzf)zzbLD.poll();
	//   24   38:aload_0         
	//   25   39:getfield        #24  <Field Queue zzbLD>
	//   26   42:invokeinterface #32  <Method Object Queue.poll()>
	//   27   47:checkcast       #34  <Class zzf>
	//   28   50:astore_3        
		if(zzf1 != null)
			break MISSING_BLOCK_LABEL_73;
	//   29   51:aload_3         
	//   30   52:ifnonnull       73
		zzbLE = false;
	//   31   55:aload_0         
	//   32   56:iconst_0        
	//   33   57:putfield        #26  <Field boolean zzbLE>
		obj;
	//   34   60:aload_2         
		JVM INSTR monitorexit ;
	//   35   61:monitorexit     
		return;
	//   36   62:return          
		task;
	//   37   63:astore_1        
		obj;
	//   38   64:aload_2         
		JVM INSTR monitorexit ;
	//   39   65:monitorexit     
		throw task;
	//   40   66:aload_1         
	//   41   67:athrow          
		task;
	//   42   68:astore_1        
		obj;
	//   43   69:aload_2         
		JVM INSTR monitorexit ;
	//   44   70:monitorexit     
		throw task;
	//   45   71:aload_1         
	//   46   72:athrow          
		obj;
	//   47   73:aload_2         
		JVM INSTR monitorexit ;
	//   48   74:monitorexit     
		zzf1.onComplete(task);
	//   49   75:aload_3         
	//   50   76:aload_1         
	//   51   77:invokeinterface #37  <Method void zzf.onComplete(Task)>
		if(true) goto _L2; else goto _L1
	//   52   82:goto            31
_L1:
	}

	public void zza(zzf zzf1)
	{
		synchronized(zzrN)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field Object zzrN>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if(zzbLD == null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #24  <Field Queue zzbLD>
	//*   7   11:ifnonnull       25
				zzbLD = ((Queue) (new ArrayDeque()));
	//    8   14:aload_0         
	//    9   15:new             #43  <Class ArrayDeque>
	//   10   18:dup             
	//   11   19:invokespecial   #44  <Method void ArrayDeque()>
	//   12   22:putfield        #24  <Field Queue zzbLD>
			zzbLD.add(((Object) (zzf1)));
	//   13   25:aload_0         
	//   14   26:getfield        #24  <Field Queue zzbLD>
	//   15   29:aload_1         
	//   16   30:invokeinterface #48  <Method boolean Queue.add(Object)>
	//   17   35:pop             
		}
	//   18   36:aload_2         
	//   19   37:monitorexit     
		return;
	//   20   38:return          
		zzf1;
	//   21   39:astore_1        
		obj;
	//   22   40:aload_2         
		JVM INSTR monitorexit ;
	//   23   41:monitorexit     
		throw zzf1;
	//   24   42:aload_1         
	//   25   43:athrow          
	}

	private Queue zzbLD;
	private boolean zzbLE;
	private final Object zzrN = new Object();
}
