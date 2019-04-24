// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.util.MediaClock;
import java.io.IOException;
import java.lang.annotation.Annotation;

// Referenced classes of package com.google.android.exoplayer2:
//			ExoPlaybackException, RendererConfiguration, Format, RendererCapabilities

public interface Renderer
	extends PlayerMessage.Target
{
	public static interface State
		extends Annotation
	{
	}


	public abstract void disable();

	public abstract void enable(RendererConfiguration rendererconfiguration, Format aformat[], SampleStream samplestream, long l, boolean flag, long l1)
		throws ExoPlaybackException;

	public abstract RendererCapabilities getCapabilities();

	public abstract MediaClock getMediaClock();

	public abstract int getState();

	public abstract SampleStream getStream();

	public abstract int getTrackType();

	public abstract boolean hasReadStreamToEnd();

	public abstract boolean isCurrentStreamFinal();

	public abstract boolean isEnded();

	public abstract boolean isReady();

	public abstract void maybeThrowStreamError()
		throws IOException;

	public abstract void render(long l, long l1)
		throws ExoPlaybackException;

	public abstract void replaceStream(Format aformat[], SampleStream samplestream, long l)
		throws ExoPlaybackException;

	public abstract void resetPosition(long l)
		throws ExoPlaybackException;

	public abstract void setCurrentStreamFinal();

	public abstract void setIndex(int i);

	public abstract void start()
		throws ExoPlaybackException;

	public abstract void stop()
		throws ExoPlaybackException;

	public static final int STATE_DISABLED = 0;
	public static final int STATE_ENABLED = 1;
	public static final int STATE_STARTED = 2;
}
