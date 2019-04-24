// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Parcel;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompatApi23

static interface MediaBrowserCompatApi23$ItemCallback
{

	public abstract void onError(String s);

	public abstract void onItemLoaded(Parcel parcel);
}
