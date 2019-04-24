// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.mediacodec;


// Referenced classes of package com.google.android.exoplayer2.mediacodec:
//			MediaCodecSelector, MediaCodecUtil, MediaCodecInfo

static final class MediaCodecSelector$1
	implements MediaCodecSelector
{

	public MediaCodecInfo getDecoderInfo(String s, boolean flag)
		throws rQueryException
	{
		return MediaCodecUtil.getDecoderInfo(s, flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #19  <Method MediaCodecInfo MediaCodecUtil.getDecoderInfo(String, boolean)>
	//    3    5:areturn         
	}

	public MediaCodecInfo getPassthroughDecoderInfo()
		throws rQueryException
	{
		return MediaCodecUtil.getPassthroughDecoderInfo();
	//    0    0:invokestatic    #24  <Method MediaCodecInfo MediaCodecUtil.getPassthroughDecoderInfo()>
	//    1    3:areturn         
	}

	MediaCodecSelector$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}
}
