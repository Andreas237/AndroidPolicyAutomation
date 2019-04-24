// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.extractor.mkv:
//			EbmlReaderOutput

interface EbmlReader
{

	public abstract void init(EbmlReaderOutput ebmlreaderoutput);

	public abstract boolean read(ExtractorInput extractorinput)
		throws IOException, InterruptedException;

	public abstract void reset();
}
