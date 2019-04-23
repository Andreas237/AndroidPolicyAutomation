// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;

import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer:
//			MediaCodecUtil

public static class MediaCodecUtil$DecoderQueryException extends IOException
{

	private MediaCodecUtil$DecoderQueryException(Throwable throwable)
	{
		super("Failed to query underlying media codecs", throwable);
	//    0    0:aload_0         
	//    1    1:ldc1            #11  <String "Failed to query underlying media codecs">
	//    2    3:aload_1         
	//    3    4:invokespecial   #14  <Method void IOException(String, Throwable)>
	//    4    7:return          
	}

	MediaCodecUtil$DecoderQueryException(Throwable throwable, MediaCodecUtil._cls1 _pcls1)
	{
		this(throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void MediaCodecUtil$DecoderQueryException(Throwable)>
	//    3    5:return          
	}
}
