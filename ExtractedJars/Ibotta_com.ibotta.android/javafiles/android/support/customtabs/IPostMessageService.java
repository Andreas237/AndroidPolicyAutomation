// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.customtabs;

import android.os.*;

// Referenced classes of package android.support.customtabs:
//			ICustomTabsCallback

public interface IPostMessageService
	extends IInterface
{

	public abstract void onMessageChannelReady(ICustomTabsCallback icustomtabscallback, Bundle bundle)
		throws RemoteException;

	public abstract void onPostMessage(ICustomTabsCallback icustomtabscallback, String s, Bundle bundle)
		throws RemoteException;
}
