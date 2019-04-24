// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import com.irobot.core.NetworkStatistics;

// Referenced classes of package com.irobot.home:
//			DeveloperActivity

class DeveloperActivity$11
	implements android.content.ckListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		a.resetStatistics();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field NetworkStatistics a>
	//    2    4:invokevirtual   #31  <Method void NetworkStatistics.resetStatistics()>
	//    3    7:return          
	}

	final NetworkStatistics a;
	final DeveloperActivity b;

	DeveloperActivity$11(DeveloperActivity developeractivity, NetworkStatistics networkstatistics)
	{
		b = developeractivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field DeveloperActivity b>
		a = networkstatistics;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field NetworkStatistics a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
