// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzab

final class zzab$2
	implements com.google.android.gms.common.api.Result.zza
{

	public void zzx(Status status)
	{
		if(status.isSuccess())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #41  <Method boolean Status.isSuccess()>
	//*   2    4:ifeq            37
		{
			status = ((Status) (zzaFa.await(0L, TimeUnit.MILLISECONDS)));
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field PendingResult zzaFa>
	//    5   11:lconst_0        
	//    6   12:getstatic       #47  <Field TimeUnit TimeUnit.MILLISECONDS>
	//    7   15:invokevirtual   #53  <Method com.google.android.gms.common.api.Result PendingResult.await(long, TimeUnit)>
	//    8   18:astore_1        
			zzaFb.setResult(zzaFc.zzf(((com.google.android.gms.common.api.Result) (status))));
	//    9   19:aload_0         
	//   10   20:getfield        #25  <Field TaskCompletionSource zzaFb>
	//   11   23:aload_0         
	//   12   24:getfield        #27  <Field zzab$zza zzaFc>
	//   13   27:aload_1         
	//   14   28:invokeinterface #59  <Method Object zzab$zza.zzf(com.google.android.gms.common.api.Result)>
	//   15   33:invokevirtual   #65  <Method void TaskCompletionSource.setResult(Object)>
			return;
	//   16   36:return          
		} else
		{
			zzaFb.setException(((Exception) (zzaFd.zzG(status))));
	//   17   37:aload_0         
	//   18   38:getfield        #25  <Field TaskCompletionSource zzaFb>
	//   19   41:aload_0         
	//   20   42:getfield        #29  <Field zzab$zzb zzaFd>
	//   21   45:aload_1         
	//   22   46:invokeinterface #71  <Method com.google.android.gms.common.api.zza zzab$zzb.zzG(Status)>
	//   23   51:invokevirtual   #75  <Method void TaskCompletionSource.setException(Exception)>
			return;
	//   24   54:return          
		}
	}

	final PendingResult zzaFa;
	final TaskCompletionSource zzaFb;
	final a zzaFc;
	final b zzaFd;

	zzab$2(PendingResult pendingresult, TaskCompletionSource taskcompletionsource, a a, b b)
	{
		zzaFa = pendingresult;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field PendingResult zzaFa>
		zzaFb = taskcompletionsource;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field TaskCompletionSource zzaFb>
		zzaFc = a;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field zzab$zza zzaFc>
		zzaFd = b;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #29  <Field zzab$zzb zzaFd>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #32  <Method void Object()>
	//   14   25:return          
	}
}
