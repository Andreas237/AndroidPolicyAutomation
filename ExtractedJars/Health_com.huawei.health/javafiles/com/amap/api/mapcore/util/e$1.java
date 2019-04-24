// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import com.autonavi.ae.gmap.GLMapRender;

// Referenced classes of package com.amap.api.mapcore.util:
//			e

class e$1
	implements Runnable
{

	public void run()
	{
		try
		{
			if(e.a(a) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field e a>
	//*   2    4:invokestatic    #26  <Method GLMapRender e.a(e)>
	//*   3    7:ifnull          20
				e.a(a).onSurfaceDestory();
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field e a>
	//    6   14:invokestatic    #26  <Method GLMapRender e.a(e)>
	//    7   17:invokevirtual   #31  <Method void GLMapRender.onSurfaceDestory()>
			return;
	//    8   20:return          
		}
		catch(Throwable throwable)
	//*   9   21:astore_1        
		{
			throwable.printStackTrace();
	//   10   22:aload_1         
	//   11   23:invokevirtual   #34  <Method void Throwable.printStackTrace()>
		}
	//   12   26:return          
	}

	final e a;

	e$1(e e1)
	{
		a = e1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field e a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
