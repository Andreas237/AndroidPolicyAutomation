// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.offlinemap;

import com.amap.api.mapcore.util.be;
import com.amap.api.mapcore.util.hm;
import com.amap.api.maps.AMapException;

// Referenced classes of package com.amap.api.maps.offlinemap:
//			OfflineMapManager

class OfflineMapManager$2
	implements Runnable
{

	public void run()
	{
		try
		{
			b.b.d(a);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field OfflineMapManager b>
	//    2    4:getfield        #31  <Field be OfflineMapManager.b>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field String a>
	//    5   11:invokevirtual   #36  <Method void be.d(String)>
			return;
	//    6   14:return          
		}
		catch(AMapException amapexception)
	//*   7   15:astore_1        
		{
			hm.c(((Throwable) (amapexception)), "OfflineMapManager", "downloadByProvinceName");
	//    8   16:aload_1         
	//    9   17:ldc1            #38  <String "OfflineMapManager">
	//   10   19:ldc1            #39  <String "downloadByProvinceName">
	//   11   21:invokestatic    #45  <Method void hm.c(Throwable, String, String)>
		}
	//   12   24:return          
	}

	final String a;
	final OfflineMapManager b;

	OfflineMapManager$2(OfflineMapManager offlinemapmanager, String s)
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
