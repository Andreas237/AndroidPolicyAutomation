// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;


// Referenced classes of package com.google.android.exoplayer:
//			MediaCodecAudioTrackRenderer

class MediaCodecAudioTrackRenderer$3
	implements Runnable
{

	public void run()
	{
		MediaCodecAudioTrackRenderer.access$000(MediaCodecAudioTrackRenderer.this).onAudioTrackUnderrun(val$bufferSize, val$bufferSizeMs, val$elapsedSinceLastFeedMs);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field MediaCodecAudioTrackRenderer this$0>
	//    2    4:invokestatic    #37  <Method MediaCodecAudioTrackRenderer$EventListener MediaCodecAudioTrackRenderer.access$000(MediaCodecAudioTrackRenderer)>
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field int val$bufferSize>
	//    5   11:aload_0         
	//    6   12:getfield        #26  <Field long val$bufferSizeMs>
	//    7   15:aload_0         
	//    8   16:getfield        #28  <Field long val$elapsedSinceLastFeedMs>
	//    9   19:invokeinterface #42  <Method void MediaCodecAudioTrackRenderer$EventListener.onAudioTrackUnderrun(int, long, long)>
	//   10   24:return          
	}

	final MediaCodecAudioTrackRenderer this$0;
	final int val$bufferSize;
	final long val$bufferSizeMs;
	final long val$elapsedSinceLastFeedMs;

	MediaCodecAudioTrackRenderer$3()
	{
		this$0 = final_mediacodecaudiotrackrenderer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field MediaCodecAudioTrackRenderer this$0>
		val$bufferSize = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #24  <Field int val$bufferSize>
		val$bufferSizeMs = l;
	//    6   10:aload_0         
	//    7   11:lload_3         
	//    8   12:putfield        #26  <Field long val$bufferSizeMs>
		val$elapsedSinceLastFeedMs = J.this;
	//    9   15:aload_0         
	//   10   16:lload           5
	//   11   18:putfield        #28  <Field long val$elapsedSinceLastFeedMs>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #31  <Method void Object()>
	//   14   25:return          
	}
}
