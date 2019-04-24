// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.splash;


// Referenced classes of package com.startapp.android.publish.ads.splash:
//			h, c

class h$4
	implements Runnable
{

	public void run()
	{
		if(a.b.b(a.g, a.c))
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field h a>
	//*   2    4:getfield        #25  <Field c h.b>
	//*   3    7:aload_0         
	//*   4    8:getfield        #17  <Field h a>
	//*   5   11:getfield        #29  <Field Runnable h.g>
	//*   6   14:aload_0         
	//*   7   15:getfield        #17  <Field h a>
	//*   8   18:getfield        #33  <Field com.startapp.android.publish.cache.c h.c>
	//*   9   21:invokevirtual   #38  <Method boolean c.b(Runnable, com.startapp.android.publish.cache.c)>
	//*  10   24:ifeq            43
		{
			a.f = null;
	//   11   27:aload_0         
	//   12   28:getfield        #17  <Field h a>
	//   13   31:aconst_null     
	//   14   32:putfield        #42  <Field h$a h.f>
			a.c = null;
	//   15   35:aload_0         
	//   16   36:getfield        #17  <Field h a>
	//   17   39:aconst_null     
	//   18   40:putfield        #33  <Field com.startapp.android.publish.cache.c h.c>
		}
	//   19   43:return          
	}

	final h a;

	h$4(h h1)
	{
		a = h1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field h a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
