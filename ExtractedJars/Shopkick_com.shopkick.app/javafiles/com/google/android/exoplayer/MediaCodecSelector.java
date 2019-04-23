// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;


// Referenced classes of package com.google.android.exoplayer:
//			DecoderInfo, MediaCodecUtil

public interface MediaCodecSelector
{

	public abstract DecoderInfo getDecoderInfo(String s, boolean flag)
		throws MediaCodecUtil.DecoderQueryException;

	public abstract DecoderInfo getPassthroughDecoderInfo()
		throws MediaCodecUtil.DecoderQueryException;

	public static final MediaCodecSelector DEFAULT = new MediaCodecSelector() {

		public DecoderInfo getDecoderInfo(String s, boolean flag)
			throws MediaCodecUtil.DecoderQueryException
		{
			return MediaCodecUtil.getDecoderInfo(s, flag);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokestatic    #19  <Method DecoderInfo MediaCodecUtil.getDecoderInfo(String, boolean)>
		//    3    5:areturn         
		}

		public DecoderInfo getPassthroughDecoderInfo()
			throws MediaCodecUtil.DecoderQueryException
		{
			return MediaCodecUtil.getPassthroughDecoderInfo();
		//    0    0:invokestatic    #24  <Method DecoderInfo MediaCodecUtil.getPassthroughDecoderInfo()>
		//    1    3:areturn         
		}

	}
;

	/* static  */
	/* { */
	//    0    0:new             #6   <Class MediaCodecSelector$1>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void MediaCodecSelector$1()>
	//    3    7:putstatic       #15  <Field MediaCodecSelector DEFAULT>
	//*   4   10:return          
	/* } */
}
