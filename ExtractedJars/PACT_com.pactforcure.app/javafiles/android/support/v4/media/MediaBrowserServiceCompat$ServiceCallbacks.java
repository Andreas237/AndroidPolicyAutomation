// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.*;
import java.util.List;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

private static interface MediaBrowserServiceCompat$ServiceCallbacks
{

	public abstract IBinder asBinder();

	public abstract void onConnect(String s, android.support.v4.media.session.MediaSessionCompat.Token token, Bundle bundle)
		throws RemoteException;

	public abstract void onConnectFailed()
		throws RemoteException;

	public abstract void onLoadChildren(String s, List list, Bundle bundle)
		throws RemoteException;
}
