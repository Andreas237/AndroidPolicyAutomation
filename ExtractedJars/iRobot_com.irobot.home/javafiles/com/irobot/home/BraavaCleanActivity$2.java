// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import com.irobot.home.fragments.k;

// Referenced classes of package com.irobot.home:
//			BraavaCleanActivity

class BraavaCleanActivity$2
	implements android.content.kListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		BraavaCleanActivity.c(a).c(false);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BraavaCleanActivity a>
	//    2    4:invokestatic    #26  <Method k BraavaCleanActivity.c(BraavaCleanActivity)>
	//    3    7:iconst_0        
	//    4    8:invokevirtual   #31  <Method void k.c(boolean)>
		BraavaCleanActivity.c(a).f(true);
	//    5   11:aload_0         
	//    6   12:getfield        #17  <Field BraavaCleanActivity a>
	//    7   15:invokestatic    #26  <Method k BraavaCleanActivity.c(BraavaCleanActivity)>
	//    8   18:iconst_1        
	//    9   19:invokevirtual   #34  <Method void k.f(boolean)>
		BraavaCleanActivity.d(a);
	//   10   22:aload_0         
	//   11   23:getfield        #17  <Field BraavaCleanActivity a>
	//   12   26:invokestatic    #37  <Method void BraavaCleanActivity.d(BraavaCleanActivity)>
	//   13   29:return          
	}

	final BraavaCleanActivity a;

	BraavaCleanActivity$2(BraavaCleanActivity braavacleanactivity)
	{
		a = braavacleanactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BraavaCleanActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
