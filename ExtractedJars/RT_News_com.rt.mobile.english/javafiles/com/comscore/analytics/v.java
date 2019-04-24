// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.analytics;

import com.comscore.utils.OfflineMeasurementsCache;

// Referenced classes of package com.comscore.analytics:
//			Core

class v
	implements Runnable
{

	v(Core core)
	{
		a = core;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field Core a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public void run()
	{
		a.a.flush();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field Core a>
	//    2    4:getfield        #22  <Field OfflineMeasurementsCache Core.a>
	//    3    7:invokevirtual   #28  <Method boolean OfflineMeasurementsCache.flush()>
	//    4   10:pop             
	//    5   11:return          
	}

	final Core a;
}
