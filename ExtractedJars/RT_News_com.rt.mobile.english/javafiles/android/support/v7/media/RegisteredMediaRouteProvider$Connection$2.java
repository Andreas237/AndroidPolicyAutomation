// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;


// Referenced classes of package android.support.v7.media:
//			RegisteredMediaRouteProvider

class RegisteredMediaRouteProvider$Connection$2
	implements Runnable
{

	public void run()
	{
		onConnectionDied(RegisteredMediaRouteProvider.Connection.this);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field RegisteredMediaRouteProvider$Connection this$1>
	//    2    4:getfield        #28  <Field RegisteredMediaRouteProvider RegisteredMediaRouteProvider$Connection.this$0>
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field RegisteredMediaRouteProvider$Connection this$1>
	//    5   11:invokevirtual   #31  <Method void RegisteredMediaRouteProvider.onConnectionDied(RegisteredMediaRouteProvider$Connection)>
	//    6   14:return          
	}

	final RegisteredMediaRouteProvider.Connection this$1;

	RegisteredMediaRouteProvider$Connection$2()
	{
		this$1 = RegisteredMediaRouteProvider.Connection.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field RegisteredMediaRouteProvider$Connection this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
	//    5    9:return          
	}
}
