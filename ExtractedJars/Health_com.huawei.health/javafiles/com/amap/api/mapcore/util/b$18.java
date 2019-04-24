// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import com.autonavi.ae.gmap.GLMapEngine;
import com.autonavi.ae.gmap.style.StyleItem;

// Referenced classes of package com.amap.api.mapcore.util:
//			b

class b$18
	implements Runnable
{

	public void run()
	{
		try
		{
			h.f.setMapModeAndStyle(a, b, c, d, e, f, g);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field b h>
	//    2    4:getfield        #50  <Field GLMapEngine b.f>
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field int a>
	//    5   11:aload_0         
	//    6   12:getfield        #30  <Field int b>
	//    7   15:aload_0         
	//    8   16:getfield        #32  <Field int c>
	//    9   19:aload_0         
	//   10   20:getfield        #34  <Field int d>
	//   11   23:aload_0         
	//   12   24:getfield        #36  <Field boolean e>
	//   13   27:aload_0         
	//   14   28:getfield        #38  <Field boolean f>
	//   15   31:aload_0         
	//   16   32:getfield        #40  <Field StyleItem[] g>
	//   17   35:invokevirtual   #56  <Method boolean GLMapEngine.setMapModeAndStyle(int, int, int, int, boolean, boolean, StyleItem[])>
	//   18   38:pop             
			h.f.setParamater(a, 2053, b, c, d, 0);
	//   19   39:aload_0         
	//   20   40:getfield        #26  <Field b h>
	//   21   43:getfield        #50  <Field GLMapEngine b.f>
	//   22   46:aload_0         
	//   23   47:getfield        #28  <Field int a>
	//   24   50:sipush          2053
	//   25   53:aload_0         
	//   26   54:getfield        #30  <Field int b>
	//   27   57:aload_0         
	//   28   58:getfield        #32  <Field int c>
	//   29   61:aload_0         
	//   30   62:getfield        #34  <Field int d>
	//   31   65:iconst_0        
	//   32   66:invokevirtual   #60  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
			return;
	//   33   69:return          
		}
		catch(Throwable throwable)
	//*  34   70:astore_1        
		{
			throwable.printStackTrace();
	//   35   71:aload_1         
	//   36   72:invokevirtual   #63  <Method void Throwable.printStackTrace()>
		}
	//   37   75:return          
	}

	final int a;
	final int b;
	final int c;
	final int d;
	final boolean e;
	final boolean f;
	final StyleItem g[];
	final b h;

	b$18(b b1, int i, int j, int k, int l, boolean flag, boolean flag1, 
			StyleItem astyleitem[])
	{
		h = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field b h>
		a = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #28  <Field int a>
		b = j;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #30  <Field int b>
		c = k;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #32  <Field int c>
		d = l;
	//   12   21:aload_0         
	//   13   22:iload           5
	//   14   24:putfield        #34  <Field int d>
		e = flag;
	//   15   27:aload_0         
	//   16   28:iload           6
	//   17   30:putfield        #36  <Field boolean e>
		f = flag1;
	//   18   33:aload_0         
	//   19   34:iload           7
	//   20   36:putfield        #38  <Field boolean f>
		g = astyleitem;
	//   21   39:aload_0         
	//   22   40:aload           8
	//   23   42:putfield        #40  <Field StyleItem[] g>
		super();
	//   24   45:aload_0         
	//   25   46:invokespecial   #43  <Method void Object()>
	//   26   49:return          
	}
}
