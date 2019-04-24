// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.splash;

import android.app.Activity;

// Referenced classes of package com.startapp.android.publish.ads.splash:
//			h

class h$1
	implements Runnable
{

	public void run()
	{
		if(a.c())
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field h a>
	//*   2    4:invokevirtual   #23  <Method boolean h.c()>
	//*   3    7:ifeq            25
		{
			a.d();
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field h a>
	//    6   14:invokevirtual   #26  <Method void h.d()>
			a.e();
	//    7   17:aload_0         
	//    8   18:getfield        #14  <Field h a>
	//    9   21:invokevirtual   #29  <Method void h.e()>
			return;
	//   10   24:return          
		} else
		{
			a.a.finish();
	//   11   25:aload_0         
	//   12   26:getfield        #14  <Field h a>
	//   13   29:getfield        #32  <Field Activity h.a>
	//   14   32:invokevirtual   #37  <Method void Activity.finish()>
			return;
	//   15   35:return          
		}
	}

	final h a;

	h$1(h h1)
	{
		a = h1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field h a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
