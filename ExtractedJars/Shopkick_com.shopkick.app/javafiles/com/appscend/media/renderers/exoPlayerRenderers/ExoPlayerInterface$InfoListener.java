// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media.renderers.exoPlayerRenderers;

import com.google.android.exoplayer.TimeRange;
import com.google.android.exoplayer.chunk.Format;

// Referenced classes of package com.appscend.media.renderers.exoPlayerRenderers:
//			ExoPlayerInterface

public static interface ExoPlayerInterface$InfoListener
{

	public abstract void onAudioFormatEnabled(Format format, int i, long l);

	public abstract void onAvailableRangeChanged(int i, TimeRange timerange);

	public abstract void onBandwidthSample(int i, long l, long l1);

	public abstract void onDecoderInitialized(String s, long l, long l1);

	public abstract void onDroppedFrames(int i, long l);

	public abstract void onLoadCompleted(int i, long l, int j, int k, Format format, long l1, long l2, long l3, long l4);

	public abstract void onLoadStarted(int i, long l, int j, int k, Format format, long l1, long l2);

	public abstract void onVideoFormatEnabled(Format format, int i, long l);
}
