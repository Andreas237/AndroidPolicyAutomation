// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

final class zzant
	implements Runnable
{

	zzant(Future future)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		zzcvo = future;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field Future zzcvo>
	//    5    9:return          
	}

	public final void run()
	{
		Future future = zzcvo;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Future zzcvo>
	//    2    4:astore_1        
		if(!future.isDone())
	//*   3    5:aload_1         
	//*   4    6:invokeinterface #23  <Method boolean Future.isDone()>
	//*   5   11:ifne            22
			future.cancel(true);
	//    6   14:aload_1         
	//    7   15:iconst_1        
	//    8   16:invokeinterface #27  <Method boolean Future.cancel(boolean)>
	//    9   21:pop             
	//   10   22:return          
	}

	private final Future zzcvo;
}
