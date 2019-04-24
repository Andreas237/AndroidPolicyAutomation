// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import java.io.Serializable;
import java.util.Comparator;

// Referenced classes of package com.amap.api.mapcore.util:
//			y, de, hm

static class y$a
	implements Serializable, Comparator
{

	public int compare(Object obj, Object obj1)
	{
		obj = ((Object) ((de)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #23  <Class de>
	//    2    4:astore_1        
		obj1 = ((Object) ((de)obj1));
	//    3    5:aload_2         
	//    4    6:checkcast       #23  <Class de>
	//    5    9:astore_2        
		if(obj == null || obj1 == null)
			break MISSING_BLOCK_LABEL_52;
	//    6   10:aload_1         
	//    7   11:ifnull          36
	//    8   14:aload_2         
	//    9   15:ifnull          36
		int i = Float.compare(((de) (obj)).getZIndex(), ((de) (obj1)).getZIndex());
	//   10   18:aload_1         
	//   11   19:invokeinterface #27  <Method float de.getZIndex()>
	//   12   24:aload_2         
	//   13   25:invokeinterface #27  <Method float de.getZIndex()>
	//   14   30:invokestatic    #32  <Method int Float.compare(float, float)>
	//   15   33:istore_3        
		return i;
	//   16   34:iload_3         
	//   17   35:ireturn         
	//*  18   36:goto            52
		obj;
	//   19   39:astore_1        
		hm.c(((Throwable) (obj)), "MapOverlayImageView", "compare");
	//   20   40:aload_1         
	//   21   41:ldc1            #34  <String "MapOverlayImageView">
	//   22   43:ldc1            #35  <String "compare">
	//   23   45:invokestatic    #41  <Method void hm.c(Throwable, String, String)>
		((Throwable) (obj)).printStackTrace();
	//   24   48:aload_1         
	//   25   49:invokevirtual   #44  <Method void Throwable.printStackTrace()>
		return 0;
	//   26   52:iconst_0        
	//   27   53:ireturn         
	}

	y$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
