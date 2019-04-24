// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.l;

import com.irobot.core.RenderPresenter;
import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home.l:
//			a

class a$b$1
	implements Runnable
{

	public void run()
	{
		if(com.irobot.home.l.a.c(b.a) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field a$b b>
	//*   2    4:getfield        #30  <Field a a$b.a>
	//*   3    7:invokestatic    #34  <Method RenderPresenter a.c(a)>
	//*   4   10:ifnull          33
		{
			com.irobot.home.l.a.c(b.a).rotate(a, -1F);
	//    5   13:aload_0         
	//    6   14:getfield        #20  <Field a$b b>
	//    7   17:getfield        #30  <Field a a$b.a>
	//    8   20:invokestatic    #34  <Method RenderPresenter a.c(a)>
	//    9   23:aload_0         
	//   10   24:getfield        #22  <Field float a>
	//   11   27:ldc1            #35  <Float -1F>
	//   12   29:invokevirtual   #41  <Method void RenderPresenter.rotate(float, float)>
			return;
	//   13   32:return          
		} else
		{
			o.e(com.irobot.home.l.a.a(), "mRenderPresenter is null in onRotation");
	//   14   33:invokestatic    #44  <Method String a.a()>
	//   15   36:ldc1            #46  <String "mRenderPresenter is null in onRotation">
	//   16   38:invokestatic    #52  <Method void o.e(String, String)>
			return;
	//   17   41:return          
		}
	}

	final float a;
	final a.b b;

	a$b$1(a.b b1, float f)
	{
		b = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field a$b b>
		a = f;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #22  <Field float a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
