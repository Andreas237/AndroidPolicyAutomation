// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

// Referenced classes of package com.google.android.exoplayer:
//			MediaCodecUtil

private static final class MediaCodecUtil$MediaCodecListCompatV16
	implements MediaCodecUtil.MediaCodecListCompat
{

	public int getCodecCount()
	{
		return MediaCodecList.getCodecCount();
	//    0    0:invokestatic    #22  <Method int MediaCodecList.getCodecCount()>
	//    1    3:ireturn         
	}

	public MediaCodecInfo getCodecInfoAt(int i)
	{
		return MediaCodecList.getCodecInfoAt(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #26  <Method MediaCodecInfo MediaCodecList.getCodecInfoAt(int)>
	//    2    4:areturn         
	}

	public boolean isSecurePlaybackSupported(String s, android.media.MediaCodecInfo.CodecCapabilities codeccapabilities)
	{
		return "video/avc".equals(((Object) (s)));
	//    0    0:ldc1            #30  <String "video/avc">
	//    1    2:aload_1         
	//    2    3:invokevirtual   #36  <Method boolean String.equals(Object)>
	//    3    6:ireturn         
	}

	public boolean secureDecodersExplicit()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	private MediaCodecUtil$MediaCodecListCompatV16()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	MediaCodecUtil$MediaCodecListCompatV16(MediaCodecUtil._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void MediaCodecUtil$MediaCodecListCompatV16()>
	//    2    4:return          
	}
}
