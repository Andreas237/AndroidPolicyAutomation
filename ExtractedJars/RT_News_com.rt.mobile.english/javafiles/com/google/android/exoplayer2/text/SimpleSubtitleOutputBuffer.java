// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text;


// Referenced classes of package com.google.android.exoplayer2.text:
//			SubtitleOutputBuffer, SimpleSubtitleDecoder

final class SimpleSubtitleOutputBuffer extends SubtitleOutputBuffer
{

	public SimpleSubtitleOutputBuffer(SimpleSubtitleDecoder simplesubtitledecoder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void SubtitleOutputBuffer()>
		owner = simplesubtitledecoder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field SimpleSubtitleDecoder owner>
	//    5    9:return          
	}

	public final void release()
	{
		owner.releaseOutputBuffer(((SubtitleOutputBuffer) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field SimpleSubtitleDecoder owner>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #21  <Method void SimpleSubtitleDecoder.releaseOutputBuffer(SubtitleOutputBuffer)>
	//    4    8:return          
	}

	private final SimpleSubtitleDecoder owner;
}
