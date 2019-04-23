// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor;

import com.google.android.exoplayer.upstream.Allocator;

// Referenced classes of package com.google.android.exoplayer.extractor:
//			DefaultTrackOutput, ExtractorSampleSource

private class ExtractorSampleSource$InternalTrackOutput extends DefaultTrackOutput
{

	public void sampleMetadata(long l, int i, int j, int k, byte abyte0[])
	{
		super.sampleMetadata(l, i, j, k, abyte0);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:iload           5
	//    5    7:aload           6
	//    6    9:invokespecial   #21  <Method void DefaultTrackOutput.sampleMetadata(long, int, int, int, byte[])>
		int _tmp = ExtractorSampleSource.access$308(ExtractorSampleSource.this);
	//    7   12:aload_0         
	//    8   13:getfield        #13  <Field ExtractorSampleSource this$0>
	//    9   16:invokestatic    #25  <Method int ExtractorSampleSource.access$308(ExtractorSampleSource)>
	//   10   19:pop             
	//   11   20:return          
	}

	final ExtractorSampleSource this$0;

	public ExtractorSampleSource$InternalTrackOutput(Allocator allocator)
	{
		this$0 = ExtractorSampleSource.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field ExtractorSampleSource this$0>
		super(allocator);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #16  <Method void DefaultTrackOutput(Allocator)>
	//    6   10:return          
	}
}
