// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;


// Referenced classes of package com.facebook.appevents:
//			AppEventQueue, AppEventStore, AppEventCollection

static final class AppEventQueue$2
	implements Runnable
{

	public void run()
	{
		AppEventStore.persistEvents(AppEventQueue.access$100());
	//    0    0:invokestatic    #20  <Method AppEventCollection AppEventQueue.access$100()>
	//    1    3:invokestatic    #26  <Method void AppEventStore.persistEvents(AppEventCollection)>
		AppEventCollection _tmp = AppEventQueue.access$102(new AppEventCollection());
	//    2    6:new             #28  <Class AppEventCollection>
	//    3    9:dup             
	//    4   10:invokespecial   #29  <Method void AppEventCollection()>
	//    5   13:invokestatic    #33  <Method AppEventCollection AppEventQueue.access$102(AppEventCollection)>
	//    6   16:pop             
	//    7   17:return          
	}

	AppEventQueue$2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
