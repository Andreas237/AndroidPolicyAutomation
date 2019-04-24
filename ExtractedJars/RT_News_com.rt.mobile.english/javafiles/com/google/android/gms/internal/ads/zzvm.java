// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzvf, zzaop, zzaoe, zzvn, 
//			zzakb, zzvw, zzuu

final class zzvm
	implements Runnable
{

	zzvm(zzvf zzvf1, zzvw zzvw, zzuu zzuu)
	{
		zzbqk = zzvf1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field zzvf zzbqk>
		zzbqi = zzvw;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field zzvw zzbqi>
		zzbqj = zzuu;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #20  <Field zzuu zzbqj>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #23  <Method void Object()>
	//   11   19:return          
	}

	public final void run()
	{
		Object obj = zzvf.zza(zzbqk);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field zzvf zzbqk>
	//    2    4:invokestatic    #31  <Method Object zzvf.zza(zzvf)>
	//    3    7:astore_1        
		obj;
	//    4    8:aload_1         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		if(((zzaop) (zzbqi)).getStatus() == -1 || ((zzaop) (zzbqi)).getStatus() == 1)
	//*   6   10:aload_0         
	//*   7   11:getfield        #18  <Field zzvw zzbqi>
	//*   8   14:invokevirtual   #37  <Method int zzaop.getStatus()>
	//*   9   17:iconst_m1       
	//*  10   18:icmpeq          74
	//*  11   21:aload_0         
	//*  12   22:getfield        #18  <Field zzvw zzbqi>
	//*  13   25:invokevirtual   #37  <Method int zzaop.getStatus()>
	//*  14   28:iconst_1        
	//*  15   29:icmpne          35
			break MISSING_BLOCK_LABEL_74;
	//   16   32:goto            74
		((zzaop) (zzbqi)).reject();
	//   17   35:aload_0         
	//   18   36:getfield        #18  <Field zzvw zzbqi>
	//   19   39:invokevirtual   #40  <Method void zzaop.reject()>
		Executor executor = zzaoe.zzcvy;
	//   20   42:getstatic       #46  <Field Executor zzaoe.zzcvy>
	//   21   45:astore_2        
		zzuu zzuu = zzbqj;
	//   22   46:aload_0         
	//   23   47:getfield        #20  <Field zzuu zzbqj>
	//   24   50:astore_3        
		((Object) (zzuu)).getClass();
	//   25   51:aload_3         
	//   26   52:invokevirtual   #50  <Method Class Object.getClass()>
	//   27   55:pop             
		executor.execute(zzvn.zza(zzuu));
	//   28   56:aload_2         
	//   29   57:aload_3         
	//   30   58:invokestatic    #55  <Method Runnable zzvn.zza(zzuu)>
	//   31   61:invokeinterface #61  <Method void Executor.execute(Runnable)>
		zzakb.v("Could not receive loaded message in a timely manner. Rejecting.");
	//   32   66:ldc1            #63  <String "Could not receive loaded message in a timely manner. Rejecting.">
	//   33   68:invokestatic    #69  <Method void zzakb.v(String)>
		obj;
	//   34   71:aload_1         
		JVM INSTR monitorexit ;
	//   35   72:monitorexit     
		return;
	//   36   73:return          
		obj;
	//   37   74:aload_1         
		JVM INSTR monitorexit ;
	//   38   75:monitorexit     
		return;
	//   39   76:return          
		Exception exception;
		exception;
	//   40   77:astore_2        
		obj;
	//   41   78:aload_1         
		JVM INSTR monitorexit ;
	//   42   79:monitorexit     
		throw exception;
	//   43   80:aload_2         
	//   44   81:athrow          
	}

	private final zzvw zzbqi;
	private final zzuu zzbqj;
	private final zzvf zzbqk;
}
