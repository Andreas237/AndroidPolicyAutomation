// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.truenet.android;

import android.support.v7.w;

// Referenced classes of package com.truenet.android:
//			c, b

static final class c$b
	implements Runnable
{

	public final void run()
	{
		a.g();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field b a>
	//    2    4:invokevirtual   #38  <Method void b.g()>
		d.a(((Object) (a)), ((Object) (Integer.valueOf(b))));
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field w d>
	//    5   11:aload_0         
	//    6   12:getfield        #22  <Field b a>
	//    7   15:aload_0         
	//    8   16:getfield        #24  <Field int b>
	//    9   19:invokestatic    #44  <Method Integer Integer.valueOf(int)>
	//   10   22:invokeinterface #49  <Method Object w.a(Object, Object)>
	//   11   27:pop             
		com.truenet.android.c.a(c);
	//   12   28:aload_0         
	//   13   29:getfield        #26  <Field c c>
	//   14   32:invokestatic    #52  <Method void c.a(c)>
	//   15   35:return          
	}

	final b a;
	final int b;
	final c c;
	final w d;

	c$b(b b1, int i, c c1, w w1)
	{
		a = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field b a>
		b = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #24  <Field int b>
		c = c1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field c c>
		d = w1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #28  <Field w d>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #31  <Method void Object()>
	//   14   25:return          
	}
}
