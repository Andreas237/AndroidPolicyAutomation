// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaoj

final class zzsq
	implements Runnable
{

	zzsq(zzaoj zzaoj1, Future future)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzbnu = zzaoj1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field zzaoj zzbnu>
		zzbnv = future;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field Future zzbnv>
	//    8   14:return          
	}

	public final void run()
	{
		zzaoj zzaoj1 = zzbnu;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzaoj zzbnu>
	//    2    4:astore_1        
		Future future = zzbnv;
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field Future zzbnv>
	//    5    9:astore_2        
		if(zzaoj1.isCancelled())
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #27  <Method boolean zzaoj.isCancelled()>
	//*   8   14:ifeq            25
			future.cancel(true);
	//    9   17:aload_2         
	//   10   18:iconst_1        
	//   11   19:invokeinterface #33  <Method boolean Future.cancel(boolean)>
	//   12   24:pop             
	//   13   25:return          
	}

	private final zzaoj zzbnu;
	private final Future zzbnv;
}
