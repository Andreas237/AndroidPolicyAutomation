// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzanz, zzaoj

final class zzanv
	implements Runnable
{

	zzanv(zzaoj zzaoj1, zzanz zzanz1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzbnu = zzaoj1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field zzaoj zzbnu>
		zzcvk = zzanz1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field zzanz zzcvk>
	//    8   14:return          
	}

	public final void run()
	{
		zzanz zzanz1;
		zzaoj zzaoj1;
		zzaoj1 = zzbnu;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzaoj zzbnu>
	//    2    4:astore_2        
		zzanz1 = zzcvk;
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field zzanz zzcvk>
	//    5    9:astore_1        
		zzaoj1.set(zzanz1.get());
	//    6   10:aload_2         
	//    7   11:aload_1         
	//    8   12:invokeinterface #33  <Method Object zzanz.get()>
	//    9   17:invokevirtual   #39  <Method void zzaoj.set(Object)>
		return;
	//   10   20:return          
		Object obj;
		obj;
	//   11   21:astore_1        
		zzaoj1.setException(((Throwable) (obj)));
	//   12   22:aload_2         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #43  <Method void zzaoj.setException(Throwable)>
		return;
	//   15   27:return          
		obj;
	//   16   28:astore_1        
		Thread.currentThread().interrupt();
	//   17   29:invokestatic    #49  <Method Thread Thread.currentThread()>
	//   18   32:invokevirtual   #52  <Method void Thread.interrupt()>
_L2:
		zzaoj1.setException(((Throwable) (obj)));
	//   19   35:aload_2         
	//   20   36:aload_1         
	//   21   37:invokevirtual   #43  <Method void zzaoj.setException(Throwable)>
		return;
	//   22   40:return          
		obj;
	//   23   41:astore_1        
		obj = ((Object) (((ExecutionException) (obj)).getCause()));
	//   24   42:aload_1         
	//   25   43:invokevirtual   #56  <Method Throwable ExecutionException.getCause()>
	//   26   46:astore_1        
		if(true) goto _L2; else goto _L1
	//   27   47:goto            35
_L1:
	}

	private final zzaoj zzbnu;
	private final zzanz zzcvk;
}
