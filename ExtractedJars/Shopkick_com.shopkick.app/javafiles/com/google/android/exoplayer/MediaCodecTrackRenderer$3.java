// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;


// Referenced classes of package com.google.android.exoplayer:
//			MediaCodecTrackRenderer

class MediaCodecTrackRenderer$3
	implements Runnable
{

	public void run()
	{
		MediaCodecTrackRenderer.access$000(MediaCodecTrackRenderer.this).onDecoderInitialized(val$decoderName, val$initializedTimestamp, val$initializationDuration);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field MediaCodecTrackRenderer this$0>
	//    2    4:invokestatic    #37  <Method MediaCodecTrackRenderer$EventListener MediaCodecTrackRenderer.access$000(MediaCodecTrackRenderer)>
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field String val$decoderName>
	//    5   11:aload_0         
	//    6   12:getfield        #26  <Field long val$initializedTimestamp>
	//    7   15:aload_0         
	//    8   16:getfield        #28  <Field long val$initializationDuration>
	//    9   19:invokeinterface #42  <Method void MediaCodecTrackRenderer$EventListener.onDecoderInitialized(String, long, long)>
	//   10   24:return          
	}

	final MediaCodecTrackRenderer this$0;
	final String val$decoderName;
	final long val$initializationDuration;
	final long val$initializedTimestamp;

	MediaCodecTrackRenderer$3()
	{
		this$0 = final_mediacodectrackrenderer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field MediaCodecTrackRenderer this$0>
		val$decoderName = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field String val$decoderName>
		val$initializedTimestamp = l;
	//    6   10:aload_0         
	//    7   11:lload_3         
	//    8   12:putfield        #26  <Field long val$initializedTimestamp>
		val$initializationDuration = J.this;
	//    9   15:aload_0         
	//   10   16:lload           5
	//   11   18:putfield        #28  <Field long val$initializationDuration>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #31  <Method void Object()>
	//   14   25:return          
	}
}
