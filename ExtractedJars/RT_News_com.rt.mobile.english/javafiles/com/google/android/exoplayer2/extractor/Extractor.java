// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor;

import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.extractor:
//			ExtractorOutput, ExtractorInput, PositionHolder

public interface Extractor
{

	public abstract void init(ExtractorOutput extractoroutput);

	public abstract int read(ExtractorInput extractorinput, PositionHolder positionholder)
		throws IOException, InterruptedException;

	public abstract void release();

	public abstract void seek(long l, long l1);

	public abstract boolean sniff(ExtractorInput extractorinput)
		throws IOException, InterruptedException;

	public static final int RESULT_CONTINUE = 0;
	public static final int RESULT_END_OF_INPUT = -1;
	public static final int RESULT_SEEK = 1;
}
