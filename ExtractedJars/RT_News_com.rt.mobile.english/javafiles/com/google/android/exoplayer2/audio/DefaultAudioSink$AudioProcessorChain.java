// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.PlaybackParameters;

// Referenced classes of package com.google.android.exoplayer2.audio:
//			DefaultAudioSink, AudioProcessor

public static interface DefaultAudioSink$AudioProcessorChain
{

	public abstract PlaybackParameters applyPlaybackParameters(PlaybackParameters playbackparameters);

	public abstract AudioProcessor[] getAudioProcessors();

	public abstract long getMediaDuration(long l);

	public abstract long getSkippedOutputFrameCount();
}
