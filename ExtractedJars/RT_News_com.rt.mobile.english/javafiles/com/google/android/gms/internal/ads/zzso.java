// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzsm, zzsp, zzaki, zzsq, 
//			zzaoe, zzaoj, zzsg

final class zzso
	implements com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
{

	zzso(zzsm zzsm1, zzaoj zzaoj1, zzsg zzsg)
	{
		zzbnn = zzsm1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field zzsm zzbnn>
		zzbno = zzaoj1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field zzaoj zzbno>
		zzbnp = zzsg;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #20  <Field zzsg zzbnp>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #23  <Method void Object()>
	//   11   19:return          
	}

	public final void onConnected(Bundle bundle)
	{
label0:
		{
			synchronized(zzsm.zzb(zzbnn))
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field zzsm zzbnn>
	//*   2    4:invokestatic    #33  <Method Object zzsm.zzb(zzsm)>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:monitorenter    
			{
				if(!zzsm.zzc(zzbnn))
					break label0;
	//    6   10:aload_0         
	//    7   11:getfield        #16  <Field zzsm zzbnn>
	//    8   14:invokestatic    #37  <Method boolean zzsm.zzc(zzsm)>
	//    9   17:ifeq            23
			}
	//   10   20:aload_1         
	//   11   21:monitorexit     
			return;
	//   12   22:return          
		}
		Object obj;
		zzsm.zza(zzbnn, true);
	//   13   23:aload_0         
	//   14   24:getfield        #16  <Field zzsm zzbnn>
	//   15   27:iconst_1        
	//   16   28:invokestatic    #41  <Method boolean zzsm.zza(zzsm, boolean)>
	//   17   31:pop             
		obj = ((Object) (zzsm.zzd(zzbnn)));
	//   18   32:aload_0         
	//   19   33:getfield        #16  <Field zzsm zzbnn>
	//   20   36:invokestatic    #45  <Method zzsf zzsm.zzd(zzsm)>
	//   21   39:astore_2        
		if(obj != null)
			break MISSING_BLOCK_LABEL_47;
	//   22   40:aload_2         
	//   23   41:ifnonnull       47
		bundle;
	//   24   44:aload_1         
		JVM INSTR monitorexit ;
	//   25   45:monitorexit     
		return;
	//   26   46:return          
		obj = ((Object) (zzaki.zzb(((Runnable) (new zzsp(this, ((zzsf) (obj)), zzbno, zzbnp))))));
	//   27   47:new             #47  <Class zzsp>
	//   28   50:dup             
	//   29   51:aload_0         
	//   30   52:aload_2         
	//   31   53:aload_0         
	//   32   54:getfield        #18  <Field zzaoj zzbno>
	//   33   57:aload_0         
	//   34   58:getfield        #20  <Field zzsg zzbnp>
	//   35   61:invokespecial   #50  <Method void zzsp(zzso, zzsf, zzaoj, zzsg)>
	//   36   64:invokestatic    #55  <Method zzanz zzaki.zzb(Runnable)>
	//   37   67:astore_2        
		zzbno.zza(((Runnable) (new zzsq(zzbno, ((java.util.concurrent.Future) (obj))))), zzaoe.zzcvz);
	//   38   68:aload_0         
	//   39   69:getfield        #18  <Field zzaoj zzbno>
	//   40   72:new             #57  <Class zzsq>
	//   41   75:dup             
	//   42   76:aload_0         
	//   43   77:getfield        #18  <Field zzaoj zzbno>
	//   44   80:aload_2         
	//   45   81:invokespecial   #60  <Method void zzsq(zzaoj, java.util.concurrent.Future)>
	//   46   84:getstatic       #66  <Field java.util.concurrent.Executor zzaoe.zzcvz>
	//   47   87:invokevirtual   #71  <Method void zzaoj.zza(Runnable, java.util.concurrent.Executor)>
		bundle;
	//   48   90:aload_1         
		JVM INSTR monitorexit ;
	//   49   91:monitorexit     
		return;
	//   50   92:return          
		exception;
	//   51   93:astore_2        
		bundle;
	//   52   94:aload_1         
		JVM INSTR monitorexit ;
	//   53   95:monitorexit     
		throw exception;
	//   54   96:aload_2         
	//   55   97:athrow          
	}

	public final void onConnectionSuspended(int i)
	{
	//    0    0:return          
	}

	final zzsm zzbnn;
	private final zzaoj zzbno;
	private final zzsg zzbnp;
}
