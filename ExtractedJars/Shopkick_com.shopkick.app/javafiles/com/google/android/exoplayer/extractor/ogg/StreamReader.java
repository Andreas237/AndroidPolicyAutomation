// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.ogg;

import com.google.android.exoplayer.extractor.*;
import com.google.android.exoplayer.util.ParsableByteArray;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.extractor.ogg:
//			OggParser

abstract class StreamReader
{

	StreamReader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #18  <Class ParsableByteArray>
	//    4    8:dup             
	//    5    9:ldc1            #19  <Int 65025>
	//    6   11:newarray        byte[]
	//    7   13:iconst_0        
	//    8   14:invokespecial   #22  <Method void ParsableByteArray(byte[], int)>
	//    9   17:putfield        #24  <Field ParsableByteArray scratch>
	//   10   20:aload_0         
	//   11   21:new             #26  <Class OggParser>
	//   12   24:dup             
	//   13   25:invokespecial   #27  <Method void OggParser()>
	//   14   28:putfield        #29  <Field OggParser oggParser>
	//   15   31:return          
	}

	void init(ExtractorOutput extractoroutput, TrackOutput trackoutput)
	{
		extractorOutput = extractoroutput;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field ExtractorOutput extractorOutput>
		trackOutput = trackoutput;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #36  <Field TrackOutput trackOutput>
	//    6   10:return          
	}

	abstract int read(ExtractorInput extractorinput, PositionHolder positionholder)
		throws IOException, InterruptedException;

	void seek()
	{
		oggParser.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field OggParser oggParser>
	//    2    4:invokevirtual   #46  <Method void OggParser.reset()>
		scratch.reset();
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field ParsableByteArray scratch>
	//    5   11:invokevirtual   #47  <Method void ParsableByteArray.reset()>
	//    6   14:return          
	}

	protected ExtractorOutput extractorOutput;
	protected final OggParser oggParser = new OggParser();
	protected final ParsableByteArray scratch = new ParsableByteArray(new byte[65025], 0);
	protected TrackOutput trackOutput;
}
