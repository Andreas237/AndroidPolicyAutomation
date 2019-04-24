// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;


// Referenced classes of package com.irobot.home:
//			BaseCleanActivity

class BaseCleanActivity$4
	implements Runnable
{

	public void run()
	{
		if(a.q != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field BaseCleanActivity a>
	//*   2    4:getfield        #23  <Field android.widget.TextView BaseCleanActivity.q>
	//*   3    7:ifnull          24
			a.e(a.j);
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field BaseCleanActivity a>
	//    6   14:aload_0         
	//    7   15:getfield        #14  <Field BaseCleanActivity a>
	//    8   18:getfield        #27  <Field String BaseCleanActivity.j>
	//    9   21:invokevirtual   #31  <Method void BaseCleanActivity.e(String)>
	//   10   24:return          
	}

	final BaseCleanActivity a;

	BaseCleanActivity$4(BaseCleanActivity basecleanactivity)
	{
		a = basecleanactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field BaseCleanActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
