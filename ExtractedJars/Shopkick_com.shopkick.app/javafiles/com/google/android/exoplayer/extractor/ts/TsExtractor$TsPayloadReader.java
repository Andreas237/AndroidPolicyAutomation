// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.ts;

import com.google.android.exoplayer.extractor.ExtractorOutput;
import com.google.android.exoplayer.util.ParsableByteArray;

// Referenced classes of package com.google.android.exoplayer.extractor.ts:
//			TsExtractor

private static abstract class TsExtractor$TsPayloadReader
{

	public abstract void consume(ParsableByteArray parsablebytearray, boolean flag, ExtractorOutput extractoroutput);

	public abstract void seek();

	private TsExtractor$TsPayloadReader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	TsExtractor$TsPayloadReader(TsExtractor._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void TsExtractor$TsPayloadReader()>
	//    2    4:return          
	}
}
