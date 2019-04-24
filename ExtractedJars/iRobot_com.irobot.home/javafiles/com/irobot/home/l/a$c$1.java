// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.l;

import com.irobot.core.RenderPresenter;
import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home.l:
//			a

class a$c$1
	implements Runnable
{

	public void run()
	{
		if(com.irobot.home.l.a.c(d.a) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field a$c d>
	//*   2    4:getfield        #37  <Field a a$c.a>
	//*   3    7:invokestatic    #40  <Method RenderPresenter a.c(a)>
	//*   4   10:ifnull          71
		{
			com.irobot.home.l.a.c(d.a).scale(a, b, c);
	//    5   13:aload_0         
	//    6   14:getfield        #23  <Field a$c d>
	//    7   17:getfield        #37  <Field a a$c.a>
	//    8   20:invokestatic    #40  <Method RenderPresenter a.c(a)>
	//    9   23:aload_0         
	//   10   24:getfield        #25  <Field float a>
	//   11   27:aload_0         
	//   12   28:getfield        #27  <Field float b>
	//   13   31:aload_0         
	//   14   32:getfield        #29  <Field float c>
	//   15   35:invokevirtual   #46  <Method void RenderPresenter.scale(float, float, float)>
			if(com.irobot.home.l.a.g(d.a) != null)
	//*  16   38:aload_0         
	//*  17   39:getfield        #23  <Field a$c d>
	//*  18   42:getfield        #37  <Field a a$c.a>
	//*  19   45:invokestatic    #50  <Method a$a a.g(a)>
	//*  20   48:ifnull          79
			{
				com.irobot.home.l.a.g(d.a).b(a);
	//   21   51:aload_0         
	//   22   52:getfield        #23  <Field a$c d>
	//   23   55:getfield        #37  <Field a a$c.a>
	//   24   58:invokestatic    #50  <Method a$a a.g(a)>
	//   25   61:aload_0         
	//   26   62:getfield        #25  <Field float a>
	//   27   65:invokeinterface #55  <Method void a$a.b(float)>
				return;
	//   28   70:return          
			}
		} else
		{
			o.e(com.irobot.home.l.a.a(), "mRenderPresenter is null in onScale");
	//   29   71:invokestatic    #58  <Method String a.a()>
	//   30   74:ldc1            #60  <String "mRenderPresenter is null in onScale">
	//   31   76:invokestatic    #66  <Method void o.e(String, String)>
		}
	//   32   79:return          
	}

	final float a;
	final float b;
	final float c;
	final a.c d;

	a$c$1(a.c c1, float f, float f1, float f2)
	{
		d = c1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field a$c d>
		a = f;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #25  <Field float a>
		b = f1;
	//    6   10:aload_0         
	//    7   11:fload_3         
	//    8   12:putfield        #27  <Field float b>
		c = f2;
	//    9   15:aload_0         
	//   10   16:fload           4
	//   11   18:putfield        #29  <Field float c>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #32  <Method void Object()>
	//   14   25:return          
	}
}
