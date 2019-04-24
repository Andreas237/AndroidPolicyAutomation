// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import com.irobot.home.m.b;
import com.irobot.home.util.j;

// Referenced classes of package com.irobot.home.fragments:
//			be

class be$1
	implements Runnable
{

	public void run()
	{
		if(j.a(((android.app.Fragment) (a))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field be a>
	//*   2    4:invokestatic    #26  <Method boolean j.a(android.app.Fragment)>
	//*   3    7:ifeq            27
			com.irobot.home.fragments.be.b(a).a(a.getActivity());
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field be a>
	//    6   14:invokestatic    #30  <Method b com.irobot.home.fragments.be.b(be)>
	//    7   17:aload_0         
	//    8   18:getfield        #17  <Field be a>
	//    9   21:invokevirtual   #34  <Method android.app.Activity be.getActivity()>
	//   10   24:invokevirtual   #39  <Method void b.a(android.app.Activity)>
	//   11   27:return          
	}

	final be a;

	be$1(be be1)
	{
		a = be1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field be a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
