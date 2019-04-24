// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import com.autonavi.ae.gmap.GLMapEngine;

// Referenced classes of package com.amap.api.mapcore.util:
//			b

class b$30
	implements Runnable
{

	public void run()
	{
		if(b.f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field b b>
	//*   2    4:getfield        #30  <Field GLMapEngine b.f>
	//*   3    7:ifnull          44
		{
			GLMapEngine glmapengine = b.f;
	//    4   10:aload_0         
	//    5   11:getfield        #19  <Field b b>
	//    6   14:getfield        #30  <Field GLMapEngine b.f>
	//    7   17:astore_2        
			int i;
			if(a)
	//*   8   18:aload_0         
	//*   9   19:getfield        #21  <Field boolean a>
	//*  10   22:ifeq            30
				i = 1;
	//   11   25:iconst_1        
	//   12   26:istore_1        
			else
	//*  13   27:goto            32
				i = 0;
	//   14   30:iconst_0        
	//   15   31:istore_1        
			glmapengine.setParamater(1, 2601, i, 0, 0, 0);
	//   16   32:aload_2         
	//   17   33:iconst_1        
	//   18   34:sipush          2601
	//   19   37:iload_1         
	//   20   38:iconst_0        
	//   21   39:iconst_0        
	//   22   40:iconst_0        
	//   23   41:invokevirtual   #36  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
		}
	//   24   44:return          
	}

	final boolean a;
	final b b;

	b$30(b b1, boolean flag)
	{
		b = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field b b>
		a = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #21  <Field boolean a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
