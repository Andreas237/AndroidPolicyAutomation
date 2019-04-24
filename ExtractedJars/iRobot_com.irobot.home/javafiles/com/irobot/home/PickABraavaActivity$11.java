// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;

// Referenced classes of package com.irobot.home:
//			PickABraavaActivity

class PickABraavaActivity$11
	implements android.content.ssListener
{

	public void onDismiss(DialogInterface dialoginterface)
	{
		PickABraavaActivity.b(a, false);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field PickABraavaActivity a>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #26  <Method boolean PickABraavaActivity.b(PickABraavaActivity, boolean)>
	//    4    8:pop             
	//    5    9:return          
	}

	final PickABraavaActivity a;

	PickABraavaActivity$11(PickABraavaActivity pickabraavaactivity)
	{
		a = pickabraavaactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field PickABraavaActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
