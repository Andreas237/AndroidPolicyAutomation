// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;


// Referenced classes of package com.google.android.exoplayer:
//			MediaCodecAudioTrackRenderer

class MediaCodecAudioTrackRenderer$1
	implements Runnable
{

	public void run()
	{
		MediaCodecAudioTrackRenderer.access$000(MediaCodecAudioTrackRenderer.this).onAudioTrackInitializationError(val$e);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field MediaCodecAudioTrackRenderer this$0>
	//    2    4:invokestatic    #30  <Method MediaCodecAudioTrackRenderer$EventListener MediaCodecAudioTrackRenderer.access$000(MediaCodecAudioTrackRenderer)>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field com.google.android.exoplayer.audio.AudioTrack$InitializationException val$e>
	//    5   11:invokeinterface #35  <Method void MediaCodecAudioTrackRenderer$EventListener.onAudioTrackInitializationError(com.google.android.exoplayer.audio.AudioTrack$InitializationException)>
	//    6   16:return          
	}

	final MediaCodecAudioTrackRenderer this$0;
	final com.google.android.exoplayer.audio.ion val$e;

	MediaCodecAudioTrackRenderer$1()
	{
		this$0 = final_mediacodecaudiotrackrenderer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field MediaCodecAudioTrackRenderer this$0>
		val$e = com.google.android.exoplayer.audio.ion.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field com.google.android.exoplayer.audio.AudioTrack$InitializationException val$e>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
