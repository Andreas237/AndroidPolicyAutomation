// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import java.util.List;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompatApi26

static interface MediaBrowserCompatApi26$SubscriptionCallback
	extends MediaBrowserCompatApi21$SubscriptionCallback
{

	public abstract void onChildrenLoaded(String s, List list, Bundle bundle);

	public abstract void onError(String s, Bundle bundle);
}
