// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.util;

import com.irobot.home.IRobotApplication;

// Referenced classes of package com.irobot.home.util:
//			StandbyModeDetector, j

private static class StandbyModeDetector$b
{

	static StandbyModeDetector a()
	{
		return a;
	//    0    0:getstatic       #25  <Field StandbyModeDetector a>
	//    1    3:areturn         
	}

	private static StandbyModeDetector a = new StandbyModeDetector((IRobotApplication)j.g(), ((StandbyModeDetector$1) (null)));

	static 
	{
	//    0    0:new             #6   <Class StandbyModeDetector>
	//    1    3:dup             
	//    2    4:invokestatic    #17  <Method android.app.Application j.g()>
	//    3    7:checkcast       #19  <Class IRobotApplication>
	//    4   10:aconst_null     
	//    5   11:invokespecial   #23  <Method void StandbyModeDetector(IRobotApplication, StandbyModeDetector$1)>
	//    6   14:putstatic       #25  <Field StandbyModeDetector a>
	//*   7   17:return          
	}
}
