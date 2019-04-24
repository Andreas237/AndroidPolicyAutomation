// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.ads;

import android.view.ViewGroup;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.source.ads:
//			AdPlaybackState

public interface AdsLoader
{
	public static interface EventListener
	{

		public abstract void onAdClicked();

		public abstract void onAdLoadError(AdsMediaSource.AdLoadException adloadexception, DataSpec dataspec);

		public abstract void onAdPlaybackState(AdPlaybackState adplaybackstate);

		public abstract void onAdTapped();
	}


	public abstract void attachPlayer(ExoPlayer exoplayer, EventListener eventlistener, ViewGroup viewgroup);

	public abstract void detachPlayer();

	public abstract void handlePrepareError(int i, int j, IOException ioexception);

	public abstract void release();

	public transient abstract void setSupportedContentTypes(int ai[]);
}
