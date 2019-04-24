// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;

// Referenced classes of package com.irobot.home:
//			BaseHelpTableActivity

class BaseHelpTableActivity$1
	implements android.content.istener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		dialoginterface.dismiss();
	//    0    0:aload_1         
	//    1    1:invokeinterface #27  <Method void DialogInterface.dismiss()>
	//    2    6:return          
	}

	final BaseHelpTableActivity a;

	BaseHelpTableActivity$1(BaseHelpTableActivity basehelptableactivity)
	{
		a = basehelptableactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BaseHelpTableActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
