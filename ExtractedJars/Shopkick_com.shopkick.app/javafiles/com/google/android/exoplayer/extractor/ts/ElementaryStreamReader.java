// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.ts;

import com.google.android.exoplayer.extractor.TrackOutput;
import com.google.android.exoplayer.util.ParsableByteArray;

abstract class ElementaryStreamReader
{

	protected ElementaryStreamReader(TrackOutput trackoutput)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		output = trackoutput;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field TrackOutput output>
	//    5    9:return          
	}

	public abstract void consume(ParsableByteArray parsablebytearray);

	public abstract void packetFinished();

	public abstract void packetStarted(long l, boolean flag);

	public abstract void seek();

	protected final TrackOutput output;
}
