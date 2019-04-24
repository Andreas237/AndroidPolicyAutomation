// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.l;

import com.irobot.core.RenderPresenter;
import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home.l:
//			a

class a$d$2
	implements Runnable
{

	public void run()
	{
		if(com.irobot.home.l.a.c(c.a) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field a$d c>
	//*   2    4:getfield        #35  <Field a a$d.a>
	//*   3    7:invokestatic    #38  <Method RenderPresenter a.c(a)>
	//*   4   10:ifnull          74
		{
			com.irobot.home.l.a.c(c.a).translate(a, -b, 1.0F);
	//    5   13:aload_0         
	//    6   14:getfield        #23  <Field a$d c>
	//    7   17:getfield        #35  <Field a a$d.a>
	//    8   20:invokestatic    #38  <Method RenderPresenter a.c(a)>
	//    9   23:aload_0         
	//   10   24:getfield        #25  <Field float a>
	//   11   27:aload_0         
	//   12   28:getfield        #27  <Field float b>
	//   13   31:fneg            
	//   14   32:fconst_1        
	//   15   33:invokevirtual   #44  <Method void RenderPresenter.translate(float, float, float)>
			if(com.irobot.home.l.a.g(c.a) != null)
	//*  16   36:aload_0         
	//*  17   37:getfield        #23  <Field a$d c>
	//*  18   40:getfield        #35  <Field a a$d.a>
	//*  19   43:invokestatic    #48  <Method a$a a.g(a)>
	//*  20   46:ifnull          82
			{
				com.irobot.home.l.a.g(c.a).a(a, -b);
	//   21   49:aload_0         
	//   22   50:getfield        #23  <Field a$d c>
	//   23   53:getfield        #35  <Field a a$d.a>
	//   24   56:invokestatic    #48  <Method a$a a.g(a)>
	//   25   59:aload_0         
	//   26   60:getfield        #25  <Field float a>
	//   27   63:aload_0         
	//   28   64:getfield        #27  <Field float b>
	//   29   67:fneg            
	//   30   68:invokeinterface #53  <Method void a$a.a(float, float)>
				return;
	//   31   73:return          
			}
		} else
		{
			o.e(com.irobot.home.l.a.a(), "mRenderPresenter null in onScroll");
	//   32   74:invokestatic    #56  <Method String a.a()>
	//   33   77:ldc1            #58  <String "mRenderPresenter null in onScroll">
	//   34   79:invokestatic    #64  <Method void o.e(String, String)>
		}
	//   35   82:return          
	}

	final float a;
	final float b;
	final a.d c;

	a$d$2(a.d d1, float f, float f1)
	{
		c = d1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field a$d c>
		a = f;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #25  <Field float a>
		b = f1;
	//    6   10:aload_0         
	//    7   11:fload_3         
	//    8   12:putfield        #27  <Field float b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #30  <Method void Object()>
	//   11   19:return          
	}
}
