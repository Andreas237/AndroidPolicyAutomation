// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import com.irobot.core.NetworkDiagnosticEvent;

// Referenced classes of package com.irobot.home.fragments:
//			CheckRemoteConnectionFragment_

class CheckRemoteConnectionFragment_$4
	implements Runnable
{

	public void run()
	{
		CheckRemoteConnectionFragment_.a(b, a);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field CheckRemoteConnectionFragment_ b>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field NetworkDiagnosticEvent a>
	//    4    8:invokestatic    #28  <Method void CheckRemoteConnectionFragment_.a(CheckRemoteConnectionFragment_, NetworkDiagnosticEvent)>
	//    5   11:return          
	}

	final NetworkDiagnosticEvent a;
	final CheckRemoteConnectionFragment_ b;

	CheckRemoteConnectionFragment_$4(CheckRemoteConnectionFragment_ checkremoteconnectionfragment_, NetworkDiagnosticEvent networkdiagnosticevent)
	{
		b = checkremoteconnectionfragment_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field CheckRemoteConnectionFragment_ b>
		a = networkdiagnosticevent;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field NetworkDiagnosticEvent a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
