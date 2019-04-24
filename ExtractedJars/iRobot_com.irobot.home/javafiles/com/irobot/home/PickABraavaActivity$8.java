// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import com.irobot.home.model.a;

// Referenced classes of package com.irobot.home:
//			PickABraavaActivity

class PickABraavaActivity$8
	implements android.content.kListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		com.irobot.home.PickABraavaActivity.a(b, a);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field PickABraavaActivity b>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field a a>
	//    4    8:invokestatic    #29  <Method void com.irobot.home.PickABraavaActivity.a(PickABraavaActivity, a)>
	//    5   11:return          
	}

	final a a;
	final PickABraavaActivity b;

	PickABraavaActivity$8(PickABraavaActivity pickabraavaactivity, a a1)
	{
		b = pickabraavaactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field PickABraavaActivity b>
		a = a1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field a a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
