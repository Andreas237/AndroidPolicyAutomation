// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;

// Referenced classes of package com.irobot.home:
//			BraavaSoftwareUpdateActivity

class BraavaSoftwareUpdateActivity$1
	implements android.content.
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		a.finish();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BraavaSoftwareUpdateActivity a>
	//    2    4:invokevirtual   #25  <Method void BraavaSoftwareUpdateActivity.finish()>
	//    3    7:return          
	}

	final BraavaSoftwareUpdateActivity a;

	BraavaSoftwareUpdateActivity$1(BraavaSoftwareUpdateActivity braavasoftwareupdateactivity)
	{
		a = braavasoftwareupdateactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BraavaSoftwareUpdateActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}