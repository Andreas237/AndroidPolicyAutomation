// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;


// Referenced classes of package android.support.v7.media:
//			RegisteredMediaRouteProviderWatcher

class RegisteredMediaRouteProviderWatcher$2
	implements Runnable
{

	public void run()
	{
		scanPackages();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field RegisteredMediaRouteProviderWatcher this$0>
	//    2    4:invokevirtual   #22  <Method void RegisteredMediaRouteProviderWatcher.scanPackages()>
	//    3    7:return          
	}

	final RegisteredMediaRouteProviderWatcher this$0;

	RegisteredMediaRouteProviderWatcher$2()
	{
		this$0 = RegisteredMediaRouteProviderWatcher.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field RegisteredMediaRouteProviderWatcher this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}
}
