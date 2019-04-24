// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaol, zzaoq, zzaom, zzaoo

public class zzaop
	implements zzaol
{

	public zzaop()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #5   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void Object()>
	//    6   12:putfield        #23  <Field Object mLock>
		zzbqb = 0;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #25  <Field int zzbqb>
	//   10   20:aload_0         
	//   11   21:new             #27  <Class LinkedBlockingQueue>
	//   12   24:dup             
	//   13   25:invokespecial   #28  <Method void LinkedBlockingQueue()>
	//   14   28:putfield        #30  <Field BlockingQueue zzcwi>
	//   15   31:return          
	}

	public final int getStatus()
	{
		return zzbqb;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int zzbqb>
	//    2    4:ireturn         
	}

	public final void reject()
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Object mLock>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(zzbqb != 0)
	//*   5    7:aload_0         
	//*   6    8:getfield        #25  <Field int zzbqb>
	//*   7   11:ifeq            22
			throw new UnsupportedOperationException();
	//    8   14:new             #36  <Class UnsupportedOperationException>
	//    9   17:dup             
	//   10   18:invokespecial   #37  <Method void UnsupportedOperationException()>
	//   11   21:athrow          
		zzbqb = -1;
	//   12   22:aload_0         
	//   13   23:iconst_m1       
	//   14   24:putfield        #25  <Field int zzbqb>
		for(Iterator iterator = zzcwi.iterator(); iterator.hasNext(); ((zzaoq)iterator.next()).zzcwl.run());
	//   15   27:aload_0         
	//   16   28:getfield        #30  <Field BlockingQueue zzcwi>
	//   17   31:invokeinterface #43  <Method Iterator BlockingQueue.iterator()>
	//   18   36:astore_2        
	//   19   37:aload_2         
	//   20   38:invokeinterface #49  <Method boolean Iterator.hasNext()>
	//   21   43:ifeq            66
	//   22   46:aload_2         
	//   23   47:invokeinterface #53  <Method Object Iterator.next()>
	//   24   52:checkcast       #55  <Class zzaoq>
	//   25   55:getfield        #59  <Field zzaom zzaoq.zzcwl>
	//   26   58:invokeinterface #64  <Method void zzaom.run()>
	//*  27   63:goto            37
		zzcwi.clear();
	//   28   66:aload_0         
	//   29   67:getfield        #30  <Field BlockingQueue zzcwi>
	//   30   70:invokeinterface #67  <Method void BlockingQueue.clear()>
		obj;
	//   31   75:aload_1         
		JVM INSTR monitorexit ;
	//   32   76:monitorexit     
		return;
	//   33   77:return          
		Exception exception;
		exception;
	//   34   78:astore_2        
		obj;
	//   35   79:aload_1         
		JVM INSTR monitorexit ;
	//   36   80:monitorexit     
		throw exception;
	//   37   81:aload_2         
	//   38   82:athrow          
	}

	public final void zza(zzaoo zzaoo1, zzaom zzaom1)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Object mLock>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(zzbqb == 1)
	//*   5    7:aload_0         
	//*   6    8:getfield        #25  <Field int zzbqb>
	//*   7   11:iconst_1        
	//*   8   12:icmpne          28
		{
			zzaoo1.zze(zzcwj);
	//    9   15:aload_1         
	//   10   16:aload_0         
	//   11   17:getfield        #71  <Field Object zzcwj>
	//   12   20:invokeinterface #77  <Method void zzaoo.zze(Object)>
			break MISSING_BLOCK_LABEL_72;
	//   13   25:goto            72
		}
		if(zzbqb == -1)
	//*  14   28:aload_0         
	//*  15   29:getfield        #25  <Field int zzbqb>
	//*  16   32:iconst_m1       
	//*  17   33:icmpne          45
		{
			zzaom1.run();
	//   18   36:aload_2         
	//   19   37:invokeinterface #64  <Method void zzaom.run()>
			break MISSING_BLOCK_LABEL_72;
	//   20   42:goto            72
		}
		if(zzbqb == 0)
	//*  21   45:aload_0         
	//*  22   46:getfield        #25  <Field int zzbqb>
	//*  23   49:ifne            72
			zzcwi.add(((Object) (new zzaoq(this, zzaoo1, zzaom1))));
	//   24   52:aload_0         
	//   25   53:getfield        #30  <Field BlockingQueue zzcwi>
	//   26   56:new             #55  <Class zzaoq>
	//   27   59:dup             
	//   28   60:aload_0         
	//   29   61:aload_1         
	//   30   62:aload_2         
	//   31   63:invokespecial   #80  <Method void zzaoq(zzaop, zzaoo, zzaom)>
	//   32   66:invokeinterface #84  <Method boolean BlockingQueue.add(Object)>
	//   33   71:pop             
		obj;
	//   34   72:aload_3         
		JVM INSTR monitorexit ;
	//   35   73:monitorexit     
		return;
	//   36   74:return          
		zzaoo1;
	//   37   75:astore_1        
		obj;
	//   38   76:aload_3         
		JVM INSTR monitorexit ;
	//   39   77:monitorexit     
		throw zzaoo1;
	//   40   78:aload_1         
	//   41   79:athrow          
	}

	public final void zzk(Object obj)
	{
		Object obj1 = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Object mLock>
	//    2    4:astore_2        
		obj1;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(zzbqb != 0)
	//*   5    7:aload_0         
	//*   6    8:getfield        #25  <Field int zzbqb>
	//*   7   11:ifeq            22
			throw new UnsupportedOperationException();
	//    8   14:new             #36  <Class UnsupportedOperationException>
	//    9   17:dup             
	//   10   18:invokespecial   #37  <Method void UnsupportedOperationException()>
	//   11   21:athrow          
		zzcwj = obj;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:putfield        #71  <Field Object zzcwj>
		zzbqb = 1;
	//   15   27:aload_0         
	//   16   28:iconst_1        
	//   17   29:putfield        #25  <Field int zzbqb>
		for(Iterator iterator = zzcwi.iterator(); iterator.hasNext(); ((zzaoq)iterator.next()).zzcwk.zze(obj));
	//   18   32:aload_0         
	//   19   33:getfield        #30  <Field BlockingQueue zzcwi>
	//   20   36:invokeinterface #43  <Method Iterator BlockingQueue.iterator()>
	//   21   41:astore_3        
	//   22   42:aload_3         
	//   23   43:invokeinterface #49  <Method boolean Iterator.hasNext()>
	//   24   48:ifeq            72
	//   25   51:aload_3         
	//   26   52:invokeinterface #53  <Method Object Iterator.next()>
	//   27   57:checkcast       #55  <Class zzaoq>
	//   28   60:getfield        #91  <Field zzaoo zzaoq.zzcwk>
	//   29   63:aload_1         
	//   30   64:invokeinterface #77  <Method void zzaoo.zze(Object)>
	//*  31   69:goto            42
		zzcwi.clear();
	//   32   72:aload_0         
	//   33   73:getfield        #30  <Field BlockingQueue zzcwi>
	//   34   76:invokeinterface #67  <Method void BlockingQueue.clear()>
		obj1;
	//   35   81:aload_2         
		JVM INSTR monitorexit ;
	//   36   82:monitorexit     
		return;
	//   37   83:return          
		obj;
	//   38   84:astore_1        
		obj1;
	//   39   85:aload_2         
		JVM INSTR monitorexit ;
	//   40   86:monitorexit     
		throw obj;
	//   41   87:aload_1         
	//   42   88:athrow          
	}

	private final Object mLock = new Object();
	private int zzbqb;
	private final BlockingQueue zzcwi = new LinkedBlockingQueue();
	private Object zzcwj;
}
