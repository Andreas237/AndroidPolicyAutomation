// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.cache;

import java.util.*;

// Referenced classes of package com.startapp.android.publish.cache:
//			a, c, g

class a$5
	implements g$b
{

	public void a(g g1)
	{
		Map map = a.a;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field a a>
	//    2    4:getfield        #25  <Field Map a.a>
	//    3    7:astore          4
		map;
	//    4    9:aload           4
		JVM INSTR monitorenter ;
	//    5   11:monitorenter    
		c c1 = null;
	//    6   12:aconst_null     
	//    7   13:astore_2        
		Iterator iterator = a.a.keySet().iterator();
	//    8   14:aload_0         
	//    9   15:getfield        #17  <Field a a>
	//   10   18:getfield        #25  <Field Map a.a>
	//   11   21:invokeinterface #31  <Method Set Map.keySet()>
	//   12   26:invokeinterface #37  <Method Iterator Set.iterator()>
	//   13   31:astore          5
_L1:
		c c2;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_79;
	//   14   33:aload           5
	//   15   35:invokeinterface #43  <Method boolean Iterator.hasNext()>
	//   16   40:ifeq            79
		c2 = (c)iterator.next();
	//   17   43:aload           5
	//   18   45:invokeinterface #47  <Method Object Iterator.next()>
	//   19   50:checkcast       #49  <Class c>
	//   20   53:astore_3        
		if((g)a.a.get(((Object) (c2))) == g1)
	//*  21   54:aload_0         
	//*  22   55:getfield        #17  <Field a a>
	//*  23   58:getfield        #25  <Field Map a.a>
	//*  24   61:aload_3         
	//*  25   62:invokeinterface #53  <Method Object Map.get(Object)>
	//*  26   67:checkcast       #55  <Class g>
	//*  27   70:aload_1         
	//*  28   71:if_acmpne       107
			c1 = c2;
	//   29   74:aload_3         
	//   30   75:astore_2        
		  goto _L1
	//*  31   76:goto            107
		if(c1 == null)
			break MISSING_BLOCK_LABEL_97;
	//   32   79:aload_2         
	//   33   80:ifnull          97
		a.a.remove(((Object) (c1)));
	//   34   83:aload_0         
	//   35   84:getfield        #17  <Field a a>
	//   36   87:getfield        #25  <Field Map a.a>
	//   37   90:aload_2         
	//   38   91:invokeinterface #58  <Method Object Map.remove(Object)>
	//   39   96:pop             
		map;
	//   40   97:aload           4
		JVM INSTR monitorexit ;
	//   41   99:monitorexit     
		return;
	//   42  100:return          
		g1;
	//   43  101:astore_1        
		map;
	//   44  102:aload           4
		JVM INSTR monitorexit ;
	//   45  104:monitorexit     
		throw g1;
	//   46  105:aload_1         
	//   47  106:athrow          
	//*  48  107:goto            33
	}

	final a a;

	a$5(a a1)
	{
		a = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field a a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
