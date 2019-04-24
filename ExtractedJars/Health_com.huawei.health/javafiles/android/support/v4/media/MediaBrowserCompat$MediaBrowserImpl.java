// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.ComponentName;
import android.os.Bundle;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat

static interface MediaBrowserCompat$MediaBrowserImpl
{

	public abstract void connect();

	public abstract void disconnect();

	public abstract Bundle getExtras();

	public abstract void getItem(String s, MediaBrowserCompat.ItemCallback itemcallback);

	public abstract String getRoot();

	public abstract ComponentName getServiceComponent();

	public abstract android.support.v4.media.session.MediaSessionCompat.Token getSessionToken();

	public abstract boolean isConnected();

	public abstract void search(String s, Bundle bundle, MediaBrowserCompat.SearchCallback searchcallback);

	public abstract void subscribe(String s, Bundle bundle, ack ack);

	public abstract void unsubscribe(String s, ack ack);
}
