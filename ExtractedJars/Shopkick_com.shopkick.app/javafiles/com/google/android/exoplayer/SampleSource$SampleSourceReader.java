// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;

import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer:
//			SampleSource, MediaFormat, MediaFormatHolder, SampleHolder

public static interface SampleSource$SampleSourceReader
{

	public abstract boolean continueBuffering(int i, long l);

	public abstract void disable(int i);

	public abstract void enable(int i, long l);

	public abstract long getBufferedPositionUs();

	public abstract MediaFormat getFormat(int i);

	public abstract int getTrackCount();

	public abstract void maybeThrowError()
		throws IOException;

	public abstract boolean prepare(long l);

	public abstract int readData(int i, long l, MediaFormatHolder mediaformatholder, SampleHolder sampleholder);

	public abstract long readDiscontinuity(int i);

	public abstract void release();

	public abstract void seekToUs(long l);
}
