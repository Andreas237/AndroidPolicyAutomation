// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package android.support.v7.media:
//			MediaRouteProvider

private final class MediaRouteProvider$ProviderHandler extends Handler
{

	public void handleMessage(Message message)
	{
		switch(message.what)
	//*   0    0:aload_1         
	//*   1    1:getfield        #25  <Field int Message.what>
		{
	//*   2    4:tableswitch     1 2: default 28
	//	               1 37
	//	               2 29
		default:
			return;
	//    3   28:return          

		case 2: // '\002'
			deliverDiscoveryRequestChanged();
	//    4   29:aload_0         
	//    5   30:getfield        #13  <Field MediaRouteProvider this$0>
	//    6   33:invokevirtual   #28  <Method void MediaRouteProvider.deliverDiscoveryRequestChanged()>
			return;
	//    7   36:return          

		case 1: // '\001'
			deliverDescriptorChanged();
	//    8   37:aload_0         
	//    9   38:getfield        #13  <Field MediaRouteProvider this$0>
	//   10   41:invokevirtual   #31  <Method void MediaRouteProvider.deliverDescriptorChanged()>
			return;
	//   11   44:return          
		}
	}

	final MediaRouteProvider this$0;

	MediaRouteProvider$ProviderHandler()
	{
		this$0 = MediaRouteProvider.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field MediaRouteProvider this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void Handler()>
	//    5    9:return          
	}
}
