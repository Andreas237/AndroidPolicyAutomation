// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;

public interface SectionPayloadReader
{

	public abstract void consume(ParsableByteArray parsablebytearray);

	public abstract void init(TimestampAdjuster timestampadjuster, ExtractorOutput extractoroutput, TsPayloadReader.TrackIdGenerator trackidgenerator);
}
