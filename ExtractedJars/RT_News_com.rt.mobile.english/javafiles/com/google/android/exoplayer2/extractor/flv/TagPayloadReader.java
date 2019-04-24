// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;

abstract class TagPayloadReader
{
	public static final class UnsupportedFormatException extends ParserException
	{

		public UnsupportedFormatException(String s)
		{
			super(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void ParserException(String)>
		//    3    5:return          
		}
	}


	protected TagPayloadReader(TrackOutput trackoutput)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		output = trackoutput;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field TrackOutput output>
	//    5    9:return          
	}

	public final void consume(ParsableByteArray parsablebytearray, long l)
		throws ParserException
	{
		if(parseHeader(parsablebytearray))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #25  <Method boolean parseHeader(ParsableByteArray)>
	//*   3    5:ifeq            14
			parsePayload(parsablebytearray, l);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:lload_2         
	//    7   11:invokevirtual   #28  <Method void parsePayload(ParsableByteArray, long)>
	//    8   14:return          
	}

	protected abstract boolean parseHeader(ParsableByteArray parsablebytearray)
		throws ParserException;

	protected abstract void parsePayload(ParsableByteArray parsablebytearray, long l)
		throws ParserException;

	public abstract void seek();

	protected final TrackOutput output;
}
