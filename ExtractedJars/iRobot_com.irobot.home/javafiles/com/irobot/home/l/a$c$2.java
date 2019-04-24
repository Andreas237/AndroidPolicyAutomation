// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.l;

import com.irobot.core.RenderPresenter;
import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home.l:
//			a

class a$c$2
	implements Runnable
{

	public void run()
	{
		if(com.irobot.home.l.a.c(a.a) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field a$c a>
	//*   2    4:getfield        #28  <Field a a$c.a>
	//*   3    7:invokestatic    #31  <Method RenderPresenter a.c(a)>
	//*   4   10:ifnull          27
		{
			com.irobot.home.l.a.c(a.a).onScalingEnd();
	//    5   13:aload_0         
	//    6   14:getfield        #20  <Field a$c a>
	//    7   17:getfield        #28  <Field a a$c.a>
	//    8   20:invokestatic    #31  <Method RenderPresenter a.c(a)>
	//    9   23:invokevirtual   #36  <Method void RenderPresenter.onScalingEnd()>
			return;
	//   10   26:return          
		} else
		{
			o.e(com.irobot.home.l.a.a(), "mRenderPresenter null in onScaleEnd");
	//   11   27:invokestatic    #39  <Method String a.a()>
	//   12   30:ldc1            #41  <String "mRenderPresenter null in onScaleEnd">
	//   13   32:invokestatic    #47  <Method void o.e(String, String)>
			return;
	//   14   35:return          
		}
	}

	final a.c a;

	a$c$2(a.c c1)
	{
		a = c1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field a$c a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void Object()>
	//    5    9:return          
	}
}
