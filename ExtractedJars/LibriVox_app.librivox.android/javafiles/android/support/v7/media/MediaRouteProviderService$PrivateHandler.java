// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.os.*;

// Referenced classes of package android.support.v7.media:
//			MediaRouteProviderService

final class MediaRouteProviderService$PrivateHandler extends Handler
{

	public void handleMessage(Message message)
	{
		if(message.what != 1)
	//*   0    0:aload_1         
	//*   1    1:getfield        #22  <Field int Message.what>
	//*   2    4:iconst_1        
	//*   3    5:icmpeq          9
		{
			return;
	//    4    8:return          
		} else
		{
			onBinderDied((Messenger)message.obj);
	//    5    9:aload_0         
	//    6   10:getfield        #10  <Field MediaRouteProviderService this$0>
	//    7   13:aload_1         
	//    8   14:getfield        #26  <Field Object Message.obj>
	//    9   17:checkcast       #28  <Class Messenger>
	//   10   20:invokevirtual   #34  <Method void MediaRouteProviderService.onBinderDied(Messenger)>
			return;
	//   11   23:return          
		}
	}

	final MediaRouteProviderService this$0;

	MediaRouteProviderService$PrivateHandler()
	{
		this$0 = MediaRouteProviderService.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field MediaRouteProviderService this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void Handler()>
	//    5    9:return          
	}
}
