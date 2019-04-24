// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.source:
//			SequenceableLoader, TrackGroupArray, SampleStream

public interface MediaPeriod
	extends SequenceableLoader
{
	public static interface Callback
		extends SequenceableLoader.Callback
	{

		public abstract void onPrepared(MediaPeriod mediaperiod);
	}


	public abstract boolean continueLoading(long l);

	public abstract void discardBuffer(long l, boolean flag);

	public abstract long getAdjustedSeekPositionUs(long l, SeekParameters seekparameters);

	public abstract long getBufferedPositionUs();

	public abstract long getNextLoadPositionUs();

	public abstract TrackGroupArray getTrackGroups();

	public abstract void maybeThrowPrepareError()
		throws IOException;

	public abstract void prepare(Callback callback, long l);

	public abstract long readDiscontinuity();

	public abstract void reevaluateBuffer(long l);

	public abstract long seekToUs(long l);

	public abstract long selectTracks(TrackSelection atrackselection[], boolean aflag[], SampleStream asamplestream[], boolean aflag1[], long l);
}
