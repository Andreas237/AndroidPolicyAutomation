// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.flv;

import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.extractor.TrackOutput;
import com.google.android.exoplayer.util.ParsableByteArray;

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
	//    1    1:invokespecial   #16  <Method void Object()>
		output = trackoutput;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field TrackOutput output>
		durationUs = -1L;
	//    5    9:aload_0         
	//    6   10:ldc2w           #19  <Long -1L>
	//    7   13:putfield        #22  <Field long durationUs>
	//    8   16:return          
	}

	public final void consume(ParsableByteArray parsablebytearray, long l)
		throws ParserException
	{
		if(parseHeader(parsablebytearray))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #31  <Method boolean parseHeader(ParsableByteArray)>
	//*   3    5:ifeq            14
			parsePayload(parsablebytearray, l);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:lload_2         
	//    7   11:invokevirtual   #34  <Method void parsePayload(ParsableByteArray, long)>
	//    8   14:return          
	}

	public final long getDurationUs()
	{
		return durationUs;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field long durationUs>
	//    2    4:lreturn         
	}

	protected abstract boolean parseHeader(ParsableByteArray parsablebytearray)
		throws ParserException;

	protected abstract void parsePayload(ParsableByteArray parsablebytearray, long l)
		throws ParserException;

	public abstract void seek();

	public final void setDurationUs(long l)
	{
		durationUs = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #22  <Field long durationUs>
	//    3    5:return          
	}

	private long durationUs;
	protected final TrackOutput output;
}
