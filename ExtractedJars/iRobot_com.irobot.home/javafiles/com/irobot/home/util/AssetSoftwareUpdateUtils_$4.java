// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.util;


// Referenced classes of package com.irobot.home.util:
//			AssetSoftwareUpdateUtils_

class AssetSoftwareUpdateUtils_$4 extends org.androidannotations.api.a.a
{

	public void a()
	{
		try
		{
			AssetSoftwareUpdateUtils_.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field AssetSoftwareUpdateUtils_ a>
	//    2    4:invokestatic    #23  <Method void AssetSoftwareUpdateUtils_.a(AssetSoftwareUpdateUtils_)>
			return;
	//    3    7:return          
		}
		catch(Throwable throwable)
	//*   4    8:astore_1        
		{
			Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
	//    5    9:invokestatic    #29  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
	//    6   12:invokestatic    #33  <Method Thread Thread.currentThread()>
	//    7   15:aload_1         
	//    8   16:invokeinterface #39  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
		}
	//    9   21:return          
	}

	final AssetSoftwareUpdateUtils_ a;

	AssetSoftwareUpdateUtils_$4(AssetSoftwareUpdateUtils_ assetsoftwareupdateutils_, String s, long l, String s1)
	{
		a = assetsoftwareupdateutils_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field AssetSoftwareUpdateUtils_ a>
		super(s, l, s1);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:lload_3         
	//    6    8:aload           5
	//    7   10:invokespecial   #17  <Method void org.androidannotations.api.a$a(String, long, String)>
	//    8   13:return          
	}
}
