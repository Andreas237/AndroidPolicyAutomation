// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import com.autonavi.ae.gmap.GLMapEngine;

// Referenced classes of package com.amap.api.mapcore.util:
//			b

class b$27
	implements Runnable
{

	public void run()
	{
		if(d.f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field b d>
	//*   2    4:getfield        #36  <Field GLMapEngine b.f>
	//*   3    7:ifnull          56
		{
			GLMapEngine glmapengine = d.f;
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field b d>
	//    6   14:getfield        #36  <Field GLMapEngine b.f>
	//    7   17:astore          4
			int j = a;
	//    8   19:aload_0         
	//    9   20:getfield        #23  <Field int a>
	//   10   23:istore_2        
			int k = b;
	//   11   24:aload_0         
	//   12   25:getfield        #25  <Field int b>
	//   13   28:istore_3        
			int i;
			if(c)
	//*  14   29:aload_0         
	//*  15   30:getfield        #27  <Field boolean c>
	//*  16   33:ifeq            41
				i = 1;
	//   17   36:iconst_1        
	//   18   37:istore_1        
			else
	//*  19   38:goto            43
				i = 0;
	//   20   41:iconst_0        
	//   21   42:istore_1        
			glmapengine.setParamater(j, 2702, k, i, 0, 0);
	//   22   43:aload           4
	//   23   45:iload_2         
	//   24   46:sipush          2702
	//   25   49:iload_3         
	//   26   50:iload_1         
	//   27   51:iconst_0        
	//   28   52:iconst_0        
	//   29   53:invokevirtual   #42  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
		}
	//   30   56:return          
	}

	final int a;
	final int b;
	final boolean c;
	final b d;

	b$27(b b1, int i, int j, boolean flag)
	{
		d = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field b d>
		a = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #23  <Field int a>
		b = j;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #25  <Field int b>
		c = flag;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #27  <Field boolean c>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #30  <Method void Object()>
	//   14   25:return          
	}
}
