// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzabv, zzaoj, zzakb

final class zzacc
	implements Runnable
{

	zzacc(AtomicInteger atomicinteger, int i, zzaoj zzaoj1, List list)
	{
		zzcay = atomicinteger;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field AtomicInteger zzcay>
		zzcaz = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #20  <Field int zzcaz>
		zzcba = zzaoj1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #22  <Field zzaoj zzcba>
		zzcbb = list;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #24  <Field List zzcbb>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #27  <Method void Object()>
	//   14   25:return          
	}

	public final void run()
	{
		if(zzcay.incrementAndGet() < zzcaz)
			break MISSING_BLOCK_LABEL_36;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field AtomicInteger zzcay>
	//    2    4:invokevirtual   #39  <Method int AtomicInteger.incrementAndGet()>
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field int zzcaz>
	//    5   11:icmplt          36
		try
		{
			zzcba.set(((Object) (zzabv.zzl(zzcbb))));
	//    6   14:aload_0         
	//    7   15:getfield        #22  <Field zzaoj zzcba>
	//    8   18:aload_0         
	//    9   19:getfield        #24  <Field List zzcbb>
	//   10   22:invokestatic    #45  <Method List zzabv.zzl(List)>
	//   11   25:invokevirtual   #51  <Method void zzaoj.set(Object)>
			return;
	//   12   28:return          
		}
		catch(Object obj)
	//*  13   29:astore_1        
		{
			zzakb.zzc("Unable to convert list of futures to a future of list", ((Throwable) (obj)));
	//   14   30:ldc1            #53  <String "Unable to convert list of futures to a future of list">
	//   15   32:aload_1         
	//   16   33:invokestatic    #59  <Method void zzakb.zzc(String, Throwable)>
		}
	//   17   36:return          
	}

	private final AtomicInteger zzcay;
	private final int zzcaz;
	private final zzaoj zzcba;
	private final List zzcbb;
}
