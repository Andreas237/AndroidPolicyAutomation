// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.customtabs;

import android.os.Bundle;
import android.os.RemoteException;

// Referenced classes of package android.support.customtabs:
//			PostMessageService, ICustomTabsCallback

class PostMessageService$1 extends tub
{

	public void onMessageChannelReady(ICustomTabsCallback icustomtabscallback, Bundle bundle)
		throws RemoteException
	{
		icustomtabscallback.onMessageChannelReady(bundle);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #25  <Method void ICustomTabsCallback.onMessageChannelReady(Bundle)>
	//    3    7:return          
	}

	public void onPostMessage(ICustomTabsCallback icustomtabscallback, String s, Bundle bundle)
		throws RemoteException
	{
		icustomtabscallback.onPostMessage(s, bundle);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokeinterface #31  <Method void ICustomTabsCallback.onPostMessage(String, Bundle)>
	//    4    8:return          
	}

	final PostMessageService this$0;

	PostMessageService$1()
	{
		this$0 = PostMessageService.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field PostMessageService this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void IPostMessageService$Stub()>
	//    5    9:return          
	}
}
