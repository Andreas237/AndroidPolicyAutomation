// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

static interface MediaBrowserServiceCompat$MediaBrowserServiceImpl
{

	public abstract Bundle getBrowserRootHints();

	public abstract MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo();

	public abstract void notifyChildrenChanged(MediaSessionManager.RemoteUserInfo remoteuserinfo, String s, Bundle bundle);

	public abstract void notifyChildrenChanged(String s, Bundle bundle);

	public abstract IBinder onBind(Intent intent);

	public abstract void onCreate();

	public abstract void setSessionToken(android.support.v4.media.session.MediaSessionCompat.Token token);
}
