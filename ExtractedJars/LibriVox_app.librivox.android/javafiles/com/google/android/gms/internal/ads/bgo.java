// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bfn

final class bgo
	implements Executor
{

	bgo(bfn bfn, Handler handler)
	{
		a = handler;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #12  <Field Handler a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void execute(Runnable runnable)
	{
		a.post(runnable);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field Handler a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #24  <Method boolean Handler.post(Runnable)>
	//    4    8:pop             
	//    5    9:return          
	}

	private final Handler a;
}
