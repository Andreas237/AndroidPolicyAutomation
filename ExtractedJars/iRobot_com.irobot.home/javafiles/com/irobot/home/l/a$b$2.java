// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.l;

import com.irobot.core.RenderPresenter;

// Referenced classes of package com.irobot.home.l:
//			a

class a$b$2
	implements Runnable
{

	public void run()
	{
		if(com.irobot.home.l.a.c(b.a) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field a$b b>
	//*   2    4:getfield        #31  <Field a a$b.a>
	//*   3    7:invokestatic    #34  <Method RenderPresenter a.c(a)>
	//*   4   10:ifnull          58
		{
			com.irobot.home.l.a.c(b.a).onRotationEnd();
	//    5   13:aload_0         
	//    6   14:getfield        #21  <Field a$b b>
	//    7   17:getfield        #31  <Field a a$b.a>
	//    8   20:invokestatic    #34  <Method RenderPresenter a.c(a)>
	//    9   23:invokevirtual   #39  <Method void RenderPresenter.onRotationEnd()>
			if(com.irobot.home.l.a.g(b.a) != null)
	//*  10   26:aload_0         
	//*  11   27:getfield        #21  <Field a$b b>
	//*  12   30:getfield        #31  <Field a a$b.a>
	//*  13   33:invokestatic    #43  <Method a$a a.g(a)>
	//*  14   36:ifnull          58
				com.irobot.home.l.a.g(b.a).a(a);
	//   15   39:aload_0         
	//   16   40:getfield        #21  <Field a$b b>
	//   17   43:getfield        #31  <Field a a$b.a>
	//   18   46:invokestatic    #43  <Method a$a a.g(a)>
	//   19   49:aload_0         
	//   20   50:getfield        #23  <Field float a>
	//   21   53:invokeinterface #48  <Method void a$a.a(float)>
		}
	//   22   58:return          
	}

	final float a;
	final a.b b;

	a$b$2(a.b b1, float f)
	{
		b = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field a$b b>
		a = f;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #23  <Field float a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #26  <Method void Object()>
	//    8   14:return          
	}
}
