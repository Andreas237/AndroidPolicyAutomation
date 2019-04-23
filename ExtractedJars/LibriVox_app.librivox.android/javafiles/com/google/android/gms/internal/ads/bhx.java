// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bhw, bhu

final class bhx
	implements bhw
{

	private bhx()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	bhx(bhu bhu)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void bhx()>
	//    2    4:return          
	}

	public final int a()
	{
		return MediaCodecList.getCodecCount();
	//    0    0:invokestatic    #20  <Method int MediaCodecList.getCodecCount()>
	//    1    3:ireturn         
	}

	public final MediaCodecInfo a(int i)
	{
		return MediaCodecList.getCodecInfoAt(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #24  <Method MediaCodecInfo MediaCodecList.getCodecInfoAt(int)>
	//    2    4:areturn         
	}

	public final boolean a(String s, android.media.MediaCodecInfo.CodecCapabilities codeccapabilities)
	{
		return "video/avc".equals(((Object) (s)));
	//    0    0:ldc1            #27  <String "video/avc">
	//    1    2:aload_1         
	//    2    3:invokevirtual   #33  <Method boolean String.equals(Object)>
	//    3    6:ireturn         
	}

	public final boolean b()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}
}
