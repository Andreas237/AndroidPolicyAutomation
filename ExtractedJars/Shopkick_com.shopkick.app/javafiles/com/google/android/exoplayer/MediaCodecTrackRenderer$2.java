// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;


// Referenced classes of package com.google.android.exoplayer:
//			MediaCodecTrackRenderer

class MediaCodecTrackRenderer$2
	implements Runnable
{

	public void run()
	{
		MediaCodecTrackRenderer.access$000(MediaCodecTrackRenderer.this).onCryptoError(val$e);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field MediaCodecTrackRenderer this$0>
	//    2    4:invokestatic    #30  <Method MediaCodecTrackRenderer$EventListener MediaCodecTrackRenderer.access$000(MediaCodecTrackRenderer)>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field android.media.MediaCodec$CryptoException val$e>
	//    5   11:invokeinterface #35  <Method void MediaCodecTrackRenderer$EventListener.onCryptoError(android.media.MediaCodec$CryptoException)>
	//    6   16:return          
	}

	final MediaCodecTrackRenderer this$0;
	final android.media. val$e;

	MediaCodecTrackRenderer$2()
	{
		this$0 = final_mediacodectrackrenderer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field MediaCodecTrackRenderer this$0>
		val$e = android.media..this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field android.media.MediaCodec$CryptoException val$e>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
