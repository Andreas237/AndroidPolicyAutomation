// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.view.View;

// Referenced classes of package com.irobot.home.fragments:
//			k

class k$5
	implements android.view..OnClickListener
{

	public void onClick(View view)
	{
		a.b(k.b(a));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field k a>
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field k a>
	//    4    8:invokestatic    #26  <Method String k.b(k)>
	//    5   11:invokevirtual   #29  <Method void k.b(String)>
	//    6   14:return          
	}

	final k a;

	k$5(k k1)
	{
		a = k1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field k a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
