// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import com.autonavi.ae.gmap.GLMapEngine;
import com.autonavi.amap.mapcore.MapConfig;

// Referenced classes of package com.amap.api.mapcore.util:
//			b

class b$34
	implements Runnable
{

	public void run()
	{
		try
		{
			a.c.setAnchorX(Math.max(0, Math.min(b.o(a), a.g)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field b a>
	//    2    4:getfield        #28  <Field MapConfig b.c>
	//    3    7:iconst_0        
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field b a>
	//    6   12:invokestatic    #32  <Method int b.o(b)>
	//    7   15:aload_0         
	//    8   16:getfield        #17  <Field b a>
	//    9   19:getfield        #36  <Field int b.g>
	//   10   22:invokestatic    #42  <Method int Math.min(int, int)>
	//   11   25:invokestatic    #45  <Method int Math.max(int, int)>
	//   12   28:invokevirtual   #51  <Method void MapConfig.setAnchorX(int)>
			a.c.setAnchorY(Math.max(0, Math.min(b.p(a), a.h)));
	//   13   31:aload_0         
	//   14   32:getfield        #17  <Field b a>
	//   15   35:getfield        #28  <Field MapConfig b.c>
	//   16   38:iconst_0        
	//   17   39:aload_0         
	//   18   40:getfield        #17  <Field b a>
	//   19   43:invokestatic    #54  <Method int b.p(b)>
	//   20   46:aload_0         
	//   21   47:getfield        #17  <Field b a>
	//   22   50:getfield        #57  <Field int b.h>
	//   23   53:invokestatic    #42  <Method int Math.min(int, int)>
	//   24   56:invokestatic    #45  <Method int Math.max(int, int)>
	//   25   59:invokevirtual   #60  <Method void MapConfig.setAnchorY(int)>
			a.f.setParamater(1, 1100, a.c.getAnchorX(), a.c.getAnchorY(), 0, 0);
	//   26   62:aload_0         
	//   27   63:getfield        #17  <Field b a>
	//   28   66:getfield        #64  <Field GLMapEngine b.f>
	//   29   69:iconst_1        
	//   30   70:sipush          1100
	//   31   73:aload_0         
	//   32   74:getfield        #17  <Field b a>
	//   33   77:getfield        #28  <Field MapConfig b.c>
	//   34   80:invokevirtual   #68  <Method int MapConfig.getAnchorX()>
	//   35   83:aload_0         
	//   36   84:getfield        #17  <Field b a>
	//   37   87:getfield        #28  <Field MapConfig b.c>
	//   38   90:invokevirtual   #71  <Method int MapConfig.getAnchorY()>
	//   39   93:iconst_0        
	//   40   94:iconst_0        
	//   41   95:invokevirtual   #77  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
			b.c(a, true);
	//   42   98:aload_0         
	//   43   99:getfield        #17  <Field b a>
	//   44  102:iconst_1        
	//   45  103:invokestatic    #80  <Method boolean b.c(b, boolean)>
	//   46  106:pop             
			return;
	//   47  107:return          
		}
		catch(Throwable throwable)
	//*  48  108:astore_1        
		{
			throwable.printStackTrace();
	//   49  109:aload_1         
	//   50  110:invokevirtual   #83  <Method void Throwable.printStackTrace()>
		}
	//   51  113:return          
	}

	final b a;

	b$34(b b1)
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
