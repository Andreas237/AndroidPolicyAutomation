// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.customtabs;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

// Referenced classes of package android.support.customtabs:
//			CustomTabsClient, ICustomTabsService

public abstract class CustomTabsServiceConnection
	implements ServiceConnection
{

	public CustomTabsServiceConnection()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public abstract void onCustomTabsServiceConnected(ComponentName componentname, CustomTabsClient customtabsclient);

	public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
	{
		onCustomTabsServiceConnected(componentname, ((CustomTabsClient) (new CustomTabsClient(ICustomTabsService.Stub.asInterface(ibinder), componentname) {

			final CustomTabsServiceConnection this$0;

			
			{
				this$0 = CustomTabsServiceConnection.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field CustomTabsServiceConnection this$0>
				super(icustomtabsservice, componentname);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:aload_3         
			//    6    8:invokespecial   #18  <Method void CustomTabsClient(ICustomTabsService, ComponentName)>
			//    7   11:return          
			}
		}
)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #8   <Class CustomTabsServiceConnection$1>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokestatic    #23  <Method ICustomTabsService ICustomTabsService$Stub.asInterface(IBinder)>
	//    7   11:aload_1         
	//    8   12:invokespecial   #26  <Method void CustomTabsServiceConnection$1(CustomTabsServiceConnection, ICustomTabsService, ComponentName)>
	//    9   15:invokevirtual   #28  <Method void onCustomTabsServiceConnected(ComponentName, CustomTabsClient)>
	//   10   18:return          
	}
}
