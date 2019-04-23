// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;

import com.google.android.exoplayer.util.Util;

public final class DecoderInfo
{

	DecoderInfo(String s, android.media.MediaCodecInfo.CodecCapabilities codeccapabilities)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field String name>
		capabilities = codeccapabilities;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field android.media.MediaCodecInfo$CodecCapabilities capabilities>
		adaptive = isAdaptive(codeccapabilities);
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:invokestatic    #26  <Method boolean isAdaptive(android.media.MediaCodecInfo$CodecCapabilities)>
	//   11   19:putfield        #28  <Field boolean adaptive>
	//   12   22:return          
	}

	private static boolean isAdaptive(android.media.MediaCodecInfo.CodecCapabilities codeccapabilities)
	{
		return codeccapabilities != null && Util.SDK_INT >= 19 && isAdaptiveV19(codeccapabilities);
	//    0    0:aload_0         
	//    1    1:ifnull          21
	//    2    4:getstatic       #35  <Field int Util.SDK_INT>
	//    3    7:bipush          19
	//    4    9:icmplt          21
	//    5   12:aload_0         
	//    6   13:invokestatic    #38  <Method boolean isAdaptiveV19(android.media.MediaCodecInfo$CodecCapabilities)>
	//    7   16:ifeq            21
	//    8   19:iconst_1        
	//    9   20:ireturn         
	//   10   21:iconst_0        
	//   11   22:ireturn         
	}

	private static boolean isAdaptiveV19(android.media.MediaCodecInfo.CodecCapabilities codeccapabilities)
	{
		return codeccapabilities.isFeatureSupported("adaptive-playback");
	//    0    0:aload_0         
	//    1    1:ldc1            #41  <String "adaptive-playback">
	//    2    3:invokevirtual   #47  <Method boolean android.media.MediaCodecInfo$CodecCapabilities.isFeatureSupported(String)>
	//    3    6:ireturn         
	}

	public final boolean adaptive;
	public final android.media.MediaCodecInfo.CodecCapabilities capabilities;
	public final String name;
}
