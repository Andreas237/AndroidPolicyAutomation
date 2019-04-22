// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.a;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

// Referenced classes of package com.google.ads.interactivemedia.v3.a:
//			n

private static final class n$d
	implements n$c
{

	public int a()
	{
		return MediaCodecList.getCodecCount();
	//    0    0:invokestatic    #23  <Method int MediaCodecList.getCodecCount()>
	//    1    3:ireturn         
	}

	public MediaCodecInfo a(int i)
	{
		return MediaCodecList.getCodecInfoAt(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #27  <Method MediaCodecInfo MediaCodecList.getCodecInfoAt(int)>
	//    2    4:areturn         
	}

	public boolean a(String s, android.media.aCodecInfo.CodecCapabilities codeccapabilities)
	{
		return "video/avc".equals(((Object) (s)));
	//    0    0:ldc1            #30  <String "video/avc">
	//    1    2:aload_1         
	//    2    3:invokevirtual   #36  <Method boolean String.equals(Object)>
	//    3    6:ireturn         
	}

	public boolean b()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	private n$d()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	n$d(n$1 n$1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void n$d()>
	//    2    4:return          
	}
}
