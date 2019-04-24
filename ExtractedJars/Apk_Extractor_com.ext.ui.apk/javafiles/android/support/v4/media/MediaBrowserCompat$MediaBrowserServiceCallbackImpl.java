// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.os.Messenger;
import java.util.List;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat

static interface MediaBrowserCompat$MediaBrowserServiceCallbackImpl
{

	public abstract void onConnectionFailed(Messenger messenger);

	public abstract void onLoadChildren(Messenger messenger, String s, List list, Bundle bundle);

	public abstract void onServiceConnected(Messenger messenger, String s, android.support.v4.media.session.MediaSessionCompat.Token token, Bundle bundle);
}
