// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.cea;

import com.google.android.exoplayer2.text.SubtitleOutputBuffer;

// Referenced classes of package com.google.android.exoplayer2.text.cea:
//			CeaDecoder

private final class CeaDecoder$CeaOutputBuffer extends SubtitleOutputBuffer
{

	public final void release()
	{
		releaseOutputBuffer(((SubtitleOutputBuffer) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field CeaDecoder this$0>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #25  <Method void CeaDecoder.releaseOutputBuffer(SubtitleOutputBuffer)>
	//    4    8:return          
	}

	final CeaDecoder this$0;

	private CeaDecoder$CeaOutputBuffer()
	{
		this$0 = CeaDecoder.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field CeaDecoder this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void SubtitleOutputBuffer()>
	//    5    9:return          
	}

	CeaDecoder$CeaOutputBuffer(CeaDecoder._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void CeaDecoder$CeaOutputBuffer(CeaDecoder)>
	//    3    5:return          
	}
}
