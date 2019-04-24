// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzbv;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzakc, zzajm, zzakk

final class zzaof
	implements Executor
{

	zzaof()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #14  <Class zzakc>
	//    4    8:dup             
	//    5    9:invokestatic    #20  <Method Looper Looper.getMainLooper()>
	//    6   12:invokespecial   #23  <Method void zzakc(Looper)>
	//    7   15:putfield        #25  <Field Handler zzcwc>
	//    8   18:return          
	}

	public final void execute(Runnable runnable)
	{
		if(Looper.getMainLooper().getThread() == Thread.currentThread())
	//*   0    0:invokestatic    #20  <Method Looper Looper.getMainLooper()>
	//*   1    3:invokevirtual   #34  <Method Thread Looper.getThread()>
	//*   2    6:invokestatic    #39  <Method Thread Thread.currentThread()>
	//*   3    9:if_acmpne       36
		{
			try
			{
				runnable.run();
	//    4   12:aload_1         
	//    5   13:invokeinterface #44  <Method void Runnable.run()>
				return;
	//    6   18:return          
			}
			// Misplaced declaration of an exception variable
			catch(Runnable runnable)
	//*   7   19:astore_1        
			{
				zzbv.zzek();
	//    8   20:invokestatic    #50  <Method zzakk zzbv.zzek()>
	//    9   23:pop             
			}
			zzakk.zza(zzbv.zzeo().getApplicationContext(), ((Throwable) (runnable)));
	//   10   24:invokestatic    #54  <Method zzajm zzbv.zzeo()>
	//   11   27:invokevirtual   #60  <Method android.content.Context zzajm.getApplicationContext()>
	//   12   30:aload_1         
	//   13   31:invokestatic    #66  <Method void zzakk.zza(android.content.Context, Throwable)>
			throw runnable;
	//   14   34:aload_1         
	//   15   35:athrow          
		} else
		{
			zzcwc.post(runnable);
	//   16   36:aload_0         
	//   17   37:getfield        #25  <Field Handler zzcwc>
	//   18   40:aload_1         
	//   19   41:invokevirtual   #72  <Method boolean Handler.post(Runnable)>
	//   20   44:pop             
			return;
	//   21   45:return          
		}
	}

	private final Handler zzcwc = new zzakc(Looper.getMainLooper());
}
