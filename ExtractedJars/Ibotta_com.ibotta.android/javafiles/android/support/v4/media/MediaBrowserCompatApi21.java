// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import java.util.List;

class MediaBrowserCompatApi21
{
	static interface ConnectionCallback
	{

		public abstract void onConnected();

		public abstract void onConnectionFailed();

		public abstract void onConnectionSuspended();
	}

	static interface SubscriptionCallback
	{

		public abstract void onChildrenLoaded(String s, List list);

		public abstract void onError(String s);
	}

}
