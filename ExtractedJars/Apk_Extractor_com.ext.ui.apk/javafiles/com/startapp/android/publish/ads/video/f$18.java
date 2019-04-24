// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.video;

import android.view.View;

// Referenced classes of package com.startapp.android.publish.ads.video:
//			f

class f$18
	implements com.startapp.common.a.c.a
{

	public void a(View view, int i, int j, int k, int l, int i1, int j1, 
			int k1, int l1)
	{
		a.p = true;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field f a>
	//    2    4:iconst_1        
	//    3    5:putfield        #25  <Field boolean f.p>
		if(a.o && a.X())
	//*   4    8:aload_0         
	//*   5    9:getfield        #17  <Field f a>
	//*   6   12:getfield        #28  <Field boolean f.o>
	//*   7   15:ifeq            35
	//*   8   18:aload_0         
	//*   9   19:getfield        #17  <Field f a>
	//*  10   22:invokevirtual   #32  <Method boolean f.X()>
	//*  11   25:ifeq            35
			a.G();
	//   12   28:aload_0         
	//   13   29:getfield        #17  <Field f a>
	//   14   32:invokevirtual   #35  <Method void f.G()>
	//   15   35:return          
	}

	final f a;

	f$18(f f1)
	{
		a = f1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field f a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
