// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;

import android.content.Context;

// Referenced classes of package com.startapp.android.publish.adsCommon:
//			l

static final class l$3
	implements Runnable
{

	public void run()
	{
		l.b(a);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Context a>
	//    2    4:invokestatic    #24  <Method void l.b(Context)>
	//    3    7:return          
	}

	final Context a;

	l$3(Context context)
	{
		a = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field Context a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
