// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzafn

final class zzafq
	implements Runnable
{

	zzafq(zzafn zzafn, Future future)
	{
		zzchn = future;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #12  <Field Future zzchn>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		if(!zzchn.isDone())
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field Future zzchn>
	//*   2    4:invokeinterface #23  <Method boolean Future.isDone()>
	//*   3    9:ifne            23
			zzchn.cancel(true);
	//    4   12:aload_0         
	//    5   13:getfield        #12  <Field Future zzchn>
	//    6   16:iconst_1        
	//    7   17:invokeinterface #27  <Method boolean Future.cancel(boolean)>
	//    8   22:pop             
	//    9   23:return          
	}

	private final Future zzchn;
}
