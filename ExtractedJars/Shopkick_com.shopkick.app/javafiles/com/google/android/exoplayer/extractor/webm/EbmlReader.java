// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.webm;

import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.extractor.ExtractorInput;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.extractor.webm:
//			EbmlReaderOutput

interface EbmlReader
{

	public abstract void init(EbmlReaderOutput ebmlreaderoutput);

	public abstract boolean read(ExtractorInput extractorinput)
		throws ParserException, IOException, InterruptedException;

	public abstract void reset();

	public static final int TYPE_BINARY = 4;
	public static final int TYPE_FLOAT = 5;
	public static final int TYPE_MASTER = 1;
	public static final int TYPE_STRING = 3;
	public static final int TYPE_UNKNOWN = 0;
	public static final int TYPE_UNSIGNED_INT = 2;
}
