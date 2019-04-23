// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers.shim;


// Referenced classes of package com.crashlytics.android.answers.shim:
//			KitEventLogger, KitEvent

class NoopKitEventLogger
	implements KitEventLogger
{

	NoopKitEventLogger()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public static KitEventLogger create()
	{
		return ((KitEventLogger) (new NoopKitEventLogger()));
	//    0    0:new             #2   <Class NoopKitEventLogger>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void NoopKitEventLogger()>
	//    3    7:areturn         
	}

	public void logKitEvent(KitEvent kitevent)
	{
	//    0    0:return          
	}
}
