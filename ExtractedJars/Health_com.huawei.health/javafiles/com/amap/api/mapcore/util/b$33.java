// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import com.amap.api.maps.model.MyTrafficStyle;
import com.autonavi.ae.gmap.GLMapEngine;

// Referenced classes of package com.amap.api.mapcore.util:
//			b

class b$33
	implements Runnable
{

	public void run()
	{
		try
		{
			a.f.setTrafficStyle(1, b.q(a).getSmoothColor(), b.q(a).getSlowColor(), b.q(a).getCongestedColor(), b.q(a).getSeriousCongestedColor());
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field b a>
	//    2    4:getfield        #28  <Field GLMapEngine b.f>
	//    3    7:iconst_1        
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field b a>
	//    6   12:invokestatic    #32  <Method MyTrafficStyle b.q(b)>
	//    7   15:invokevirtual   #38  <Method int MyTrafficStyle.getSmoothColor()>
	//    8   18:aload_0         
	//    9   19:getfield        #17  <Field b a>
	//   10   22:invokestatic    #32  <Method MyTrafficStyle b.q(b)>
	//   11   25:invokevirtual   #41  <Method int MyTrafficStyle.getSlowColor()>
	//   12   28:aload_0         
	//   13   29:getfield        #17  <Field b a>
	//   14   32:invokestatic    #32  <Method MyTrafficStyle b.q(b)>
	//   15   35:invokevirtual   #44  <Method int MyTrafficStyle.getCongestedColor()>
	//   16   38:aload_0         
	//   17   39:getfield        #17  <Field b a>
	//   18   42:invokestatic    #32  <Method MyTrafficStyle b.q(b)>
	//   19   45:invokevirtual   #47  <Method int MyTrafficStyle.getSeriousCongestedColor()>
	//   20   48:invokevirtual   #53  <Method void GLMapEngine.setTrafficStyle(int, int, int, int, int)>
			return;
	//   21   51:return          
		}
		catch(Throwable throwable)
	//*  22   52:astore_1        
		{
			throwable.printStackTrace();
	//   23   53:aload_1         
	//   24   54:invokevirtual   #56  <Method void Throwable.printStackTrace()>
		}
	//   25   57:return          
	}

	final b a;

	b$33(b b1)
	{
		a = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field b a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
