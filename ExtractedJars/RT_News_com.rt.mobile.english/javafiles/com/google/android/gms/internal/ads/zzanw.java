// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzanz

final class zzanw
	implements Runnable
{

	zzanw(zzanz zzanz1, Future future)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzcvs = zzanz1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field zzanz zzcvs>
		zzbnv = future;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field Future zzbnv>
	//    8   14:return          
	}

	public final void run()
	{
		zzanz zzanz1 = zzcvs;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzanz zzcvs>
	//    2    4:astore_1        
		Future future = zzbnv;
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field Future zzbnv>
	//    5    9:astore_2        
		if(zzanz1.isCancelled())
	//*   6   10:aload_1         
	//*   7   11:invokeinterface #27  <Method boolean zzanz.isCancelled()>
	//*   8   16:ifeq            27
			future.cancel(true);
	//    9   19:aload_2         
	//   10   20:iconst_1        
	//   11   21:invokeinterface #33  <Method boolean Future.cancel(boolean)>
	//   12   26:pop             
	//   13   27:return          
	}

	private final Future zzbnv;
	private final zzanz zzcvs;
}
