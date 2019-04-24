// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.mpmetrics;

import java.util.*;
import java.util.concurrent.*;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//			j, m

private class j$e
	implements j$g, Runnable
{

	public void a()
	{
		c.execute(((Runnable) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Executor c>
	//    2    4:aload_0         
	//    3    5:invokeinterface #54  <Method void Executor.execute(Runnable)>
	//    4   10:return          
	}

	public void run()
	{
		for(Iterator iterator = b.iterator(); iterator.hasNext(); ((m)iterator.next()).a());
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Set b>
	//    2    4:invokeinterface #61  <Method Iterator Set.iterator()>
	//    3    9:astore_1        
	//    4   10:aload_1         
	//    5   11:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            36
	//    7   19:aload_1         
	//    8   20:invokeinterface #71  <Method Object Iterator.next()>
	//    9   25:checkcast       #73  <Class m>
	//   10   28:invokeinterface #75  <Method void m.a()>
	//*  11   33:goto            10
	//   12   36:return          
	}

	final j a;
	private final Set b;
	private final Executor c;

	private j$e(j j1)
	{
		a = j1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field j a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #25  <Method void Object()>
		b = Collections.newSetFromMap(((java.util.Map) (new ConcurrentHashMap())));
	//    5    9:aload_0         
	//    6   10:new             #27  <Class ConcurrentHashMap>
	//    7   13:dup             
	//    8   14:invokespecial   #28  <Method void ConcurrentHashMap()>
	//    9   17:invokestatic    #34  <Method Set Collections.newSetFromMap(java.util.Map)>
	//   10   20:putfield        #36  <Field Set b>
		c = ((Executor) (Executors.newSingleThreadExecutor()));
	//   11   23:aload_0         
	//   12   24:invokestatic    #42  <Method java.util.concurrent.ExecutorService Executors.newSingleThreadExecutor()>
	//   13   27:putfield        #44  <Field Executor c>
	//   14   30:return          
	}

	j$e(j j1, j$1 j$1)
	{
		this(j1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #48  <Method void j$e(j)>
	//    3    5:return          
	}
}
