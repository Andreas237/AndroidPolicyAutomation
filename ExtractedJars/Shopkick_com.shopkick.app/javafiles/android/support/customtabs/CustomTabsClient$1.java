// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.customtabs;

import android.content.ComponentName;
import android.content.Context;

// Referenced classes of package android.support.customtabs:
//			CustomTabsServiceConnection, CustomTabsClient

static final class CustomTabsClient$1 extends CustomTabsServiceConnection
{

	public final void onCustomTabsServiceConnected(ComponentName componentname, CustomTabsClient customtabsclient)
	{
		customtabsclient.warmup(0L);
	//    0    0:aload_2         
	//    1    1:lconst_0        
	//    2    2:invokevirtual   #25  <Method boolean CustomTabsClient.warmup(long)>
	//    3    5:pop             
		val$applicationContext.unbindService(((android.content.ServiceConnection) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #15  <Field Context val$applicationContext>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #31  <Method void Context.unbindService(android.content.ServiceConnection)>
	//    8   14:return          
	}

	public final void onServiceDisconnected(ComponentName componentname)
	{
	//    0    0:return          
	}

	final Context val$applicationContext;

	CustomTabsClient$1(Context context)
	{
		val$applicationContext = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field Context val$applicationContext>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void CustomTabsServiceConnection()>
	//    5    9:return          
	}
}
