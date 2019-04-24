// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;

public interface ElementaryStreamReader
{

	public abstract void consume(ParsableByteArray parsablebytearray)
		throws ParserException;

	public abstract void createTracks(ExtractorOutput extractoroutput, TsPayloadReader.TrackIdGenerator trackidgenerator);

	public abstract void packetFinished();

	public abstract void packetStarted(long l, boolean flag);

	public abstract void seek();
}
