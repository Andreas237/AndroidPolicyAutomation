// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.*;

// Referenced classes of package android.support.customtabs:
//			ICustomTabsCallback

public class PostMessageService extends Service
{

	public PostMessageService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Service()>
		mBinder = ((IPostMessageService.Stub) (new IPostMessageService.Stub() {

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
));
	//    2    4:aload_0         
	//    3    5:new             #6   <Class PostMessageService$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #15  <Method void PostMessageService$1(PostMessageService)>
	//    7   13:putfield        #17  <Field IPostMessageService$Stub mBinder>
	//    8   16:return          
	}

	public IBinder onBind(Intent intent)
	{
		return ((IBinder) (mBinder));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field IPostMessageService$Stub mBinder>
	//    2    4:areturn         
	}

	private IPostMessageService.Stub mBinder;
}
