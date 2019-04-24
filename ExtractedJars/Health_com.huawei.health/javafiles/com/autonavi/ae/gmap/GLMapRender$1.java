// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.ae.gmap;

import android.os.*;
import com.autonavi.amap.mapcore.interfaces.IAMap;

// Referenced classes of package com.autonavi.ae.gmap:
//			GLMapRender

class GLMapRender$1 extends Handler
{

	public void handleMessage(Message message)
	{
		switch(message.what)
	//*   0    0:aload_1         
	//*   1    1:getfield        #27  <Field int Message.what>
		{
	//*   2    4:lookupswitch    2: default 32
	//	               10: 33
	//	               100: 81
		default:
			return;
	//    3   32:return          

		case 10: // '\n'
			if(!GLMapRender.access$000(GLMapRender.this) && mGLMapView != null && mGLMapView.getRenderMode() == 0)
	//*   4   33:aload_0         
	//*   5   34:getfield        #15  <Field GLMapRender this$0>
	//*   6   37:invokestatic    #31  <Method boolean GLMapRender.access$000(GLMapRender)>
	//*   7   40:ifne            93
	//*   8   43:aload_0         
	//*   9   44:getfield        #15  <Field GLMapRender this$0>
	//*  10   47:getfield        #35  <Field IAMap GLMapRender.mGLMapView>
	//*  11   50:ifnull          93
	//*  12   53:aload_0         
	//*  13   54:getfield        #15  <Field GLMapRender this$0>
	//*  14   57:getfield        #35  <Field IAMap GLMapRender.mGLMapView>
	//*  15   60:invokeinterface #41  <Method int IAMap.getRenderMode()>
	//*  16   65:ifne            93
			{
				mGLMapView.requestRender();
	//   17   68:aload_0         
	//   18   69:getfield        #15  <Field GLMapRender this$0>
	//   19   72:getfield        #35  <Field IAMap GLMapRender.mGLMapView>
	//   20   75:invokeinterface #44  <Method void IAMap.requestRender()>
				return;
	//   21   80:return          
			}
			break;

		case 100: // 'd'
			((Runnable)message.obj).run();
	//   22   81:aload_1         
	//   23   82:getfield        #48  <Field Object Message.obj>
	//   24   85:checkcast       #50  <Class Runnable>
	//   25   88:invokeinterface #53  <Method void Runnable.run()>
			break;
		}
	//   26   93:return          
	}

	final GLMapRender this$0;

	GLMapRender$1(Looper looper)
	{
		this$0 = GLMapRender.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field GLMapRender this$0>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #18  <Method void Handler(Looper)>
	//    6   10:return          
	}
}
