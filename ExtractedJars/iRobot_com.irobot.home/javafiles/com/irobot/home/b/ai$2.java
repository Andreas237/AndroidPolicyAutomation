// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.b;

import android.view.View;

// Referenced classes of package com.irobot.home.b:
//			ai

class ai$2
	implements android.view.OnClickListener
{

	public void onClick(View view)
	{
		ai.a(b).f(a.e());
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ai b>
	//    2    4:invokestatic    #29  <Method ai$a ai.a(ai)>
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field ai$b a>
	//    5   11:invokevirtual   #35  <Method int ai$b.e()>
	//    6   14:invokeinterface #41  <Method void ai$a.f(int)>
	//    7   19:return          
	}

	final ai$b a;
	final ai b;

	ai$2(ai ai1, ai$b ai$b1)
	{
		b = ai1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field ai b>
		a = ai$b1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field ai$b a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
