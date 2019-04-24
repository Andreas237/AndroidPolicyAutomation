// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.video;

import android.content.Context;
import com.startapp.android.publish.cache.h;

// Referenced classes of package com.startapp.android.publish.ads.video:
//			d

class d$2
	implements g$a
{

	public void a(String s)
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field g$a a>
	//*   2    4:ifnull          17
			a.a(s);
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field g$a a>
	//    5   11:aload_1         
	//    6   12:invokeinterface #35  <Method void g$a.a(String)>
		if(s != null)
	//*   7   17:aload_1         
	//*   8   18:ifnull          54
		{
			b.a(System.currentTimeMillis());
	//    9   21:aload_0         
	//   10   22:getfield        #26  <Field h b>
	//   11   25:invokestatic    #41  <Method long System.currentTimeMillis()>
	//   12   28:invokevirtual   #46  <Method void h.a(long)>
			b.a(s);
	//   13   31:aload_0         
	//   14   32:getfield        #26  <Field h b>
	//   15   35:aload_1         
	//   16   36:invokevirtual   #47  <Method void h.a(String)>
			d.a(c, b);
	//   17   39:aload_0         
	//   18   40:getfield        #22  <Field d d>
	//   19   43:aload_0         
	//   20   44:getfield        #28  <Field Context c>
	//   21   47:aload_0         
	//   22   48:getfield        #26  <Field h b>
	//   23   51:invokevirtual   #50  <Method void d.a(Context, h)>
		}
	//   24   54:return          
	}

	final g$a a;
	final h b;
	final Context c;
	final d d;

	d$2(d d1, g$a g$a1, h h1, Context context)
	{
		d = d1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field d d>
		a = g$a1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field g$a a>
		b = h1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field h b>
		c = context;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #28  <Field Context c>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #31  <Method void Object()>
	//   14   25:return          
	}
}
