// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.beta;


// Referenced classes of package com.crashlytics.android.beta:
//			AbstractCheckForUpdatesController

class ImmediateCheckForUpdatesController extends AbstractCheckForUpdatesController
{

	public ImmediateCheckForUpdatesController()
	{
		super(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #9   <Method void AbstractCheckForUpdatesController(boolean)>
	//    3    5:return          
	}

	public boolean isActivityLifecycleTriggered()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}
}
