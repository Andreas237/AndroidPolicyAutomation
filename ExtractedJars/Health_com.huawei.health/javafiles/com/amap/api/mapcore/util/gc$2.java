// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import com.amap.api.maps.offlinemap.OfflineMapCity;
import java.util.Comparator;

// Referenced classes of package com.amap.api.mapcore.util:
//			gc

class gc$2
	implements Comparator
{

	public int a(OfflineMapCity offlinemapcity, OfflineMapCity offlinemapcity1)
	{
		offlinemapcity = ((OfflineMapCity) (offlinemapcity.getJianpin().toCharArray()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #29  <Method String OfflineMapCity.getJianpin()>
	//    2    4:invokevirtual   #35  <Method char[] String.toCharArray()>
	//    3    7:astore_1        
		offlinemapcity1 = ((OfflineMapCity) (offlinemapcity1.getJianpin().toCharArray()));
	//    4    8:aload_2         
	//    5    9:invokevirtual   #29  <Method String OfflineMapCity.getJianpin()>
	//    6   12:invokevirtual   #35  <Method char[] String.toCharArray()>
	//    7   15:astore_2        
		if(offlinemapcity[0] < offlinemapcity1[0])
	//*   8   16:aload_1         
	//*   9   17:iconst_0        
	//*  10   18:caload          
	//*  11   19:aload_2         
	//*  12   20:iconst_0        
	//*  13   21:caload          
	//*  14   22:icmpge          27
			return 1;
	//   15   25:iconst_1        
	//   16   26:ireturn         
		return offlinemapcity[1] >= offlinemapcity1[1] ? 0 : 1;
	//   17   27:aload_1         
	//   18   28:iconst_1        
	//   19   29:caload          
	//   20   30:aload_2         
	//   21   31:iconst_1        
	//   22   32:caload          
	//   23   33:icmpge          38
	//   24   36:iconst_1        
	//   25   37:ireturn         
	//   26   38:iconst_0        
	//   27   39:ireturn         
	}

	public int compare(Object obj, Object obj1)
	{
		return a((OfflineMapCity)obj, (OfflineMapCity)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #25  <Class OfflineMapCity>
	//    3    5:aload_2         
	//    4    6:checkcast       #25  <Class OfflineMapCity>
	//    5    9:invokevirtual   #39  <Method int a(OfflineMapCity, OfflineMapCity)>
	//    6   12:ireturn         
	}

	final gc a;

	gc$2(gc gc1)
	{
		a = gc1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field gc a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
