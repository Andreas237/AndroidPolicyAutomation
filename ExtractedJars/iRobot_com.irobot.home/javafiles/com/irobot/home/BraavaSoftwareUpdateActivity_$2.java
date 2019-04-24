// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.CurrentConnectionStateEvent;

// Referenced classes of package com.irobot.home:
//			BraavaSoftwareUpdateActivity_

class BraavaSoftwareUpdateActivity_$2
	implements Runnable
{

	public void run()
	{
		BraavaSoftwareUpdateActivity_.a(b, a);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field BraavaSoftwareUpdateActivity_ b>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field CurrentConnectionStateEvent a>
	//    4    8:invokestatic    #28  <Method void BraavaSoftwareUpdateActivity_.a(BraavaSoftwareUpdateActivity_, CurrentConnectionStateEvent)>
	//    5   11:return          
	}

	final CurrentConnectionStateEvent a;
	final BraavaSoftwareUpdateActivity_ b;

	BraavaSoftwareUpdateActivity_$2(BraavaSoftwareUpdateActivity_ braavasoftwareupdateactivity_, CurrentConnectionStateEvent currentconnectionstateevent)
	{
		b = braavasoftwareupdateactivity_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field BraavaSoftwareUpdateActivity_ b>
		a = currentconnectionstateevent;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field CurrentConnectionStateEvent a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
