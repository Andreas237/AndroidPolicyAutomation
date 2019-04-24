// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.io.IOException;

public interface SampleStream
{

	public abstract boolean isReady();

	public abstract void maybeThrowError()
		throws IOException;

	public abstract int readData(FormatHolder formatholder, DecoderInputBuffer decoderinputbuffer, boolean flag);

	public abstract int skipData(long l);
}
