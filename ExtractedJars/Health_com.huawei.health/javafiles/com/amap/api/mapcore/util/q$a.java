// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import java.io.Serializable;
import java.util.Comparator;

// Referenced classes of package com.amap.api.mapcore.util:
//			q, dd, hm

static class q$a
	implements Serializable, Comparator
{

	public int compare(Object obj, Object obj1)
	{
		obj = ((Object) ((dd)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #23  <Class dd>
	//    2    4:astore_1        
		obj1 = ((Object) ((dd)obj1));
	//    3    5:aload_2         
	//    4    6:checkcast       #23  <Class dd>
	//    5    9:astore_2        
		if(obj == null || obj1 == null)
			break MISSING_BLOCK_LABEL_82;
	//    6   10:aload_1         
	//    7   11:ifnull          66
	//    8   14:aload_2         
	//    9   15:ifnull          66
		float f;
		float f1;
		f = ((dd) (obj)).getZIndex();
	//   10   18:aload_1         
	//   11   19:invokeinterface #27  <Method float dd.getZIndex()>
	//   12   24:fstore_3        
		f1 = ((dd) (obj1)).getZIndex();
	//   13   25:aload_2         
	//   14   26:invokeinterface #27  <Method float dd.getZIndex()>
	//   15   31:fstore          4
		if(f > f1)
	//*  16   33:fload_3         
	//*  17   34:fload           4
	//*  18   36:fcmpl           
	//*  19   37:ifle            42
			return 1;
	//   20   40:iconst_1        
	//   21   41:ireturn         
		f = ((dd) (obj)).getZIndex();
	//   22   42:aload_1         
	//   23   43:invokeinterface #27  <Method float dd.getZIndex()>
	//   24   48:fstore_3        
		f1 = ((dd) (obj1)).getZIndex();
	//   25   49:aload_2         
	//   26   50:invokeinterface #27  <Method float dd.getZIndex()>
	//   27   55:fstore          4
		if(f < f1)
	//*  28   57:fload_3         
	//*  29   58:fload           4
	//*  30   60:fcmpg           
	//*  31   61:ifge            66
			return -1;
	//   32   64:iconst_m1       
	//   33   65:ireturn         
		break MISSING_BLOCK_LABEL_82;
	//   34   66:goto            82
		obj;
	//   35   69:astore_1        
		hm.c(((Throwable) (obj)), "GlOverlayLayer", "compare");
	//   36   70:aload_1         
	//   37   71:ldc1            #29  <String "GlOverlayLayer">
	//   38   73:ldc1            #30  <String "compare">
	//   39   75:invokestatic    #36  <Method void hm.c(Throwable, String, String)>
		((Throwable) (obj)).printStackTrace();
	//   40   78:aload_1         
	//   41   79:invokevirtual   #39  <Method void Throwable.printStackTrace()>
		return 0;
	//   42   82:iconst_0        
	//   43   83:ireturn         
	}

	q$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
