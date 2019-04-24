// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.os.IBinder;
import java.util.List;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

private static interface MediaBrowserServiceCompat$e
{

	public abstract IBinder a();

	public abstract void a(String s, android.support.v4.media.session.MediaSessionCompat.Token token, Bundle bundle);

	public abstract void a(String s, List list, Bundle bundle);

	public abstract void b();
}
