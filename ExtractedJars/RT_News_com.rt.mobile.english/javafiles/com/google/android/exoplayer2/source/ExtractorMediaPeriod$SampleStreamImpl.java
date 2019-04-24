// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.source:
//			SampleStream, ExtractorMediaPeriod

private final class ExtractorMediaPeriod$SampleStreamImpl
	implements SampleStream
{

	public boolean isReady()
	{
		return ExtractorMediaPeriod.this.isReady(track);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ExtractorMediaPeriod this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field int track>
	//    4    8:invokevirtual   #30  <Method boolean ExtractorMediaPeriod.isReady(int)>
	//    5   11:ireturn         
	}

	public void maybeThrowError()
		throws IOException
	{
		ExtractorMediaPeriod.this.maybeThrowError();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ExtractorMediaPeriod this$0>
	//    2    4:invokevirtual   #35  <Method void ExtractorMediaPeriod.maybeThrowError()>
	//    3    7:return          
	}

	public int readData(FormatHolder formatholder, DecoderInputBuffer decoderinputbuffer, boolean flag)
	{
		return ExtractorMediaPeriod.this.readData(track, formatholder, decoderinputbuffer, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ExtractorMediaPeriod this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field int track>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:iload_3         
	//    7   11:invokevirtual   #41  <Method int ExtractorMediaPeriod.readData(int, FormatHolder, DecoderInputBuffer, boolean)>
	//    8   14:ireturn         
	}

	public int skipData(long l)
	{
		return ExtractorMediaPeriod.this.skipData(track, l);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ExtractorMediaPeriod this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field int track>
	//    4    8:lload_1         
	//    5    9:invokevirtual   #46  <Method int ExtractorMediaPeriod.skipData(int, long)>
	//    6   12:ireturn         
	}

	final ExtractorMediaPeriod this$0;
	private final int track;


/*
	static int access$300(ExtractorMediaPeriod$SampleStreamImpl extractormediaperiod$samplestreamimpl)
	{
		return extractormediaperiod$samplestreamimpl.track;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int track>
	//    2    4:ireturn         
	}

*/

	public ExtractorMediaPeriod$SampleStreamImpl(int i)
	{
		this$0 = ExtractorMediaPeriod.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ExtractorMediaPeriod this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
		track = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #22  <Field int track>
	//    8   14:return          
	}
}
