// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import com.autonavi.ae.gmap.GLMapEngine;

// Referenced classes of package com.amap.api.mapcore.util:
//			b, r, ds, n

class b$38
	implements Runnable
{

	public void run()
	{
		try
		{
			if(b.w(a) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field b a>
	//*   2    4:invokestatic    #27  <Method r b.w(b)>
	//*   3    7:ifnull          20
				b.w(a).c();
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field b a>
	//    6   14:invokestatic    #27  <Method r b.w(b)>
	//    7   17:invokevirtual   #32  <Method void r.c()>
			b.x(a).a();
	//    8   20:aload_0         
	//    9   21:getfield        #17  <Field b a>
	//   10   24:invokestatic    #36  <Method ds b.x(b)>
	//   11   27:invokevirtual   #40  <Method void ds.a()>
			b.a(a, ((ds) (null)));
	//   12   30:aload_0         
	//   13   31:getfield        #17  <Field b a>
	//   14   34:aconst_null     
	//   15   35:invokestatic    #43  <Method ds b.a(b, ds)>
	//   16   38:pop             
			a.f.destroyAMapEngine();
	//   17   39:aload_0         
	//   18   40:getfield        #17  <Field b a>
	//   19   43:getfield        #47  <Field GLMapEngine b.f>
	//   20   46:invokevirtual   #52  <Method void GLMapEngine.destroyAMapEngine()>
			a.f = null;
	//   21   49:aload_0         
	//   22   50:getfield        #17  <Field b a>
	//   23   53:aconst_null     
	//   24   54:putfield        #47  <Field GLMapEngine b.f>
			b.y(a).d();
	//   25   57:aload_0         
	//   26   58:getfield        #17  <Field b a>
	//   27   61:invokestatic    #56  <Method n b.y(b)>
	//   28   64:invokevirtual   #61  <Method void n.d()>
			return;
	//   29   67:return          
		}
		catch(Throwable throwable)
	//*  30   68:astore_1        
		{
			throwable.printStackTrace();
	//   31   69:aload_1         
	//   32   70:invokevirtual   #64  <Method void Throwable.printStackTrace()>
		}
	//   33   73:return          
	}

	final b a;

	b$38(b b1)
	{
		a = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field b a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
