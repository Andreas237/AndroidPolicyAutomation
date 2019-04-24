// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.ads;

import com.google.android.exoplayer2.upstream.DataSpec;

// Referenced classes of package com.google.android.exoplayer2.source.ads:
//			AdsLoader, AdPlaybackState

public static interface AdsLoader$EventListener
{

	public abstract void onAdClicked();

	public abstract void onAdLoadError(eption eption, DataSpec dataspec);

	public abstract void onAdPlaybackState(AdPlaybackState adplaybackstate);

	public abstract void onAdTapped();
}
