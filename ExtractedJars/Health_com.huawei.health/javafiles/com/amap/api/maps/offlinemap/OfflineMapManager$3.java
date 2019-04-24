// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.offlinemap;

import com.amap.api.mapcore.util.be;

// Referenced classes of package com.amap.api.maps.offlinemap:
//			OfflineMapManager

class OfflineMapManager$3
	implements Runnable
{

	public void run()
	{
		b.b.c(a);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field OfflineMapManager b>
	//    2    4:getfield        #29  <Field be OfflineMapManager.b>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field String a>
	//    5   11:invokevirtual   #34  <Method void be.c(String)>
	//    6   14:return          
	}

	final String a;
	final OfflineMapManager b;

	OfflineMapManager$3(OfflineMapManager offlinemapmanager, String s)
	{
		b = offlinemapmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field OfflineMapManager b>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field String a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
