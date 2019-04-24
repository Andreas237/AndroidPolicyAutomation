// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.PlaybackParameters;

public interface MediaClock
{

	public abstract PlaybackParameters getPlaybackParameters();

	public abstract long getPositionUs();

	public abstract PlaybackParameters setPlaybackParameters(PlaybackParameters playbackparameters);
}
