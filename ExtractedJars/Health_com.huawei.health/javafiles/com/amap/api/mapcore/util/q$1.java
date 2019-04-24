// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import java.util.Collections;
import java.util.List;

// Referenced classes of package com.amap.api.mapcore.util:
//			q, hm

class q$1
	implements Runnable
{

	public void run()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		q q1 = a;
	//    2    2:aload_0         
	//    3    3:getfield        #14  <Field q a>
	//    4    6:astore_1        
		q1;
	//    5    7:aload_1         
		JVM INSTR monitorenter ;
	//    6    8:monitorenter    
		if(q.a(a) != null && q.a(a).size() > 0)
	//*   7    9:aload_0         
	//*   8   10:getfield        #14  <Field q a>
	//*   9   13:invokestatic    #24  <Method List q.a(q)>
	//*  10   16:ifnull          51
	//*  11   19:aload_0         
	//*  12   20:getfield        #14  <Field q a>
	//*  13   23:invokestatic    #24  <Method List q.a(q)>
	//*  14   26:invokeinterface #30  <Method int List.size()>
	//*  15   31:ifle            51
			Collections.sort(q.a(a), ((java.util.Comparator) (a.b)));
	//   16   34:aload_0         
	//   17   35:getfield        #14  <Field q a>
	//   18   38:invokestatic    #24  <Method List q.a(q)>
	//   19   41:aload_0         
	//   20   42:getfield        #14  <Field q a>
	//   21   45:getfield        #34  <Field q$a q.b>
	//   22   48:invokestatic    #40  <Method void Collections.sort(List, java.util.Comparator)>
		q1;
	//   23   51:aload_1         
		JVM INSTR monitorexit ;
	//   24   52:monitorexit     
		break MISSING_BLOCK_LABEL_73;
	//   25   53:goto            61
		Exception exception;
		exception;
	//   26   56:astore_2        
	//*  27   57:aload_1         
		throw exception;
	//   28   58:monitorexit     
	//   29   59:aload_2         
	//   30   60:athrow          
	//*  31   61:goto            73
		Object obj;
		obj;
	//   32   64:astore_1        
		hm.c(((Throwable) (obj)), "MapOverlayImageView", "changeOverlayIndex");
	//   33   65:aload_1         
	//   34   66:ldc1            #42  <String "MapOverlayImageView">
	//   35   68:ldc1            #44  <String "changeOverlayIndex">
	//   36   70:invokestatic    #50  <Method void hm.c(Throwable, String, String)>
		this;
	//   37   73:aload_0         
		JVM INSTR monitorexit ;
	//   38   74:monitorexit     
		return;
	//   39   75:return          
		obj;
	//   40   76:astore_1        
	//*  41   77:aload_0         
		throw obj;
	//   42   78:monitorexit     
	//   43   79:aload_1         
	//   44   80:athrow          
	}

	final q a;

	q$1(q q1)
	{
		a = q1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field q a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
