// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompatApi21

public static interface MediaBrowserServiceCompatApi21$ServiceCompatProxy
{

	public abstract MediaBrowserServiceCompatApi21.BrowserRoot onGetRoot(String s, int i, Bundle bundle);

	public abstract void onLoadChildren(String s, MediaBrowserServiceCompatApi21.ResultWrapper resultwrapper);
}
