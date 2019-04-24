// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.util;

import com.irobot.home.IRobotApplication;

// Referenced classes of package com.irobot.home.util:
//			ConnectivityStateReceiver, j

private static class ConnectivityStateReceiver$b
{

	static ConnectivityStateReceiver a()
	{
		return a;
	//    0    0:getstatic       #25  <Field ConnectivityStateReceiver a>
	//    1    3:areturn         
	}

	private static ConnectivityStateReceiver a = new ConnectivityStateReceiver((IRobotApplication)j.g(), ((ConnectivityStateReceiver$1) (null)));

	static 
	{
	//    0    0:new             #6   <Class ConnectivityStateReceiver>
	//    1    3:dup             
	//    2    4:invokestatic    #17  <Method android.app.Application j.g()>
	//    3    7:checkcast       #19  <Class IRobotApplication>
	//    4   10:aconst_null     
	//    5   11:invokespecial   #23  <Method void ConnectivityStateReceiver(IRobotApplication, ConnectivityStateReceiver$1)>
	//    6   14:putstatic       #25  <Field ConnectivityStateReceiver a>
	//*   7   17:return          
	}
}
