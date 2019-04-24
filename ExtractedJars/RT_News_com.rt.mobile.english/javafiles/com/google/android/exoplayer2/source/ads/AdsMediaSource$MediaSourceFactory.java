// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import com.google.android.exoplayer2.source.MediaSource;

// Referenced classes of package com.google.android.exoplayer2.source.ads:
//			AdsMediaSource

public static interface AdsMediaSource$MediaSourceFactory
{

	public abstract MediaSource createMediaSource(Uri uri);

	public abstract int[] getSupportedTypes();
}
