// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import com.autonavi.ae.gmap.GLMapEngine;
import com.autonavi.ae.gmap.GLMapRender;
import com.autonavi.amap.mapcore.MapConfig;

// Referenced classes of package com.amap.api.mapcore.util:
//			b

class b$28
	implements Runnable
{

	public void run()
	{
		if(c.c.isTrafficEnabled() == a)
			break MISSING_BLOCK_LABEL_82;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field b c>
	//    2    4:getfield        #34  <Field MapConfig b.c>
	//    3    7:invokevirtual   #40  <Method boolean MapConfig.isTrafficEnabled()>
	//    4   10:aload_0         
	//    5   11:getfield        #22  <Field boolean a>
	//    6   14:icmpeq          82
		c.c.setTrafficEnabled(b);
	//    7   17:aload_0         
	//    8   18:getfield        #20  <Field b c>
	//    9   21:getfield        #34  <Field MapConfig b.c>
	//   10   24:aload_0         
	//   11   25:getfield        #24  <Field boolean b>
	//   12   28:invokevirtual   #41  <Method void MapConfig.setTrafficEnabled(boolean)>
		com.amap.api.mapcore.util.b.t(c).setTrafficMode(a);
	//   13   31:aload_0         
	//   14   32:getfield        #20  <Field b c>
	//   15   35:invokestatic    #45  <Method GLMapRender b.t(b)>
	//   16   38:aload_0         
	//   17   39:getfield        #22  <Field boolean a>
	//   18   42:invokevirtual   #50  <Method void GLMapRender.setTrafficMode(boolean)>
		int i;
		Throwable throwable;
		if(a)
	//*  19   45:aload_0         
	//*  20   46:getfield        #22  <Field boolean a>
	//*  21   49:ifeq            89
			i = 1;
	//   22   52:iconst_1        
	//   23   53:istore_1        
		else
	//*  24   54:goto            57
	//*  25   57:aload_0         
	//*  26   58:getfield        #20  <Field b c>
	//*  27   61:getfield        #54  <Field GLMapEngine b.f>
	//*  28   64:iconst_1        
	//*  29   65:sipush          2010
	//*  30   68:iload_1         
	//*  31   69:iconst_0        
	//*  32   70:iconst_0        
	//*  33   71:iconst_0        
	//*  34   72:invokevirtual   #60  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
	//*  35   75:aload_0         
	//*  36   76:getfield        #20  <Field b c>
	//*  37   79:invokevirtual   #63  <Method void b.resetRenderTime()>
	//*  38   82:return          
	//*  39   83:astore_2        
	//*  40   84:aload_2         
	//*  41   85:invokevirtual   #66  <Method void Throwable.printStackTrace()>
	//*  42   88:return          
			i = 0;
	//   43   89:iconst_0        
	//   44   90:istore_1        
		c.f.setParamater(1, 2010, i, 0, 0, 0);
		c.resetRenderTime();
		return;
		throwable;
		throwable.printStackTrace();
		return;
	//*  45   91:goto            57
	}

	final boolean a;
	final boolean b;
	final b c;

	b$28(b b1, boolean flag, boolean flag1)
	{
		c = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field b c>
		a = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #22  <Field boolean a>
		b = flag1;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #24  <Field boolean b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
