// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon.adinformation;

import android.widget.RelativeLayout;

// Referenced classes of package com.startapp.android.publish.adsCommon.adinformation:
//			b

class b$4
	implements Runnable
{

	public void run()
	{
		a.c.removeView(((android.view.View) (a.b)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field b a>
	//    2    4:getfield        #25  <Field RelativeLayout b.c>
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field b a>
	//    5   11:getfield        #28  <Field RelativeLayout b.b>
	//    6   14:invokevirtual   #34  <Method void RelativeLayout.removeView(android.view.View)>
	//    7   17:return          
	}

	final b a;

	b$4(b b1)
	{
		a = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field b a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
