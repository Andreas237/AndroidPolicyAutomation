// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.analytics;

import com.comscore.utils.OfflineMeasurementsCache;

// Referenced classes of package com.comscore.analytics:
//			Core

class s
	implements Runnable
{

	s(Core core, int i)
	{
		b = core;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field Core b>
		a = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #16  <Field int a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public void run()
	{
		b.a.setCacheMeasurementExpiry(a);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Core b>
	//    2    4:getfield        #26  <Field OfflineMeasurementsCache Core.a>
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field int a>
	//    5   11:invokevirtual   #32  <Method void OfflineMeasurementsCache.setCacheMeasurementExpiry(int)>
	//    6   14:return          
	}

	final int a;
	final Core b;
}
