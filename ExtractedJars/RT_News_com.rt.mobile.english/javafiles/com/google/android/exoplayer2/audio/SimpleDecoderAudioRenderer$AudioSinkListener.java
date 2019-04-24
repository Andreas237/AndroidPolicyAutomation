// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.audio;


// Referenced classes of package com.google.android.exoplayer2.audio:
//			SimpleDecoderAudioRenderer

private final class SimpleDecoderAudioRenderer$AudioSinkListener
	implements AudioSink.Listener
{

	public void onAudioSessionId(int i)
	{
		SimpleDecoderAudioRenderer.access$100(SimpleDecoderAudioRenderer.this).audioSessionId(i);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SimpleDecoderAudioRenderer this$0>
	//    2    4:invokestatic    #28  <Method AudioRendererEventListener$EventDispatcher SimpleDecoderAudioRenderer.access$100(SimpleDecoderAudioRenderer)>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #33  <Method void AudioRendererEventListener$EventDispatcher.audioSessionId(int)>
		SimpleDecoderAudioRenderer.this.onAudioSessionId(i);
	//    5   11:aload_0         
	//    6   12:getfield        #15  <Field SimpleDecoderAudioRenderer this$0>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #35  <Method void SimpleDecoderAudioRenderer.onAudioSessionId(int)>
	//    9   19:return          
	}

	public void onPositionDiscontinuity()
	{
		onAudioTrackPositionDiscontinuity();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SimpleDecoderAudioRenderer this$0>
	//    2    4:invokevirtual   #39  <Method void SimpleDecoderAudioRenderer.onAudioTrackPositionDiscontinuity()>
		SimpleDecoderAudioRenderer.access$202(SimpleDecoderAudioRenderer.this, true);
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field SimpleDecoderAudioRenderer this$0>
	//    5   11:iconst_1        
	//    6   12:invokestatic    #43  <Method boolean SimpleDecoderAudioRenderer.access$202(SimpleDecoderAudioRenderer, boolean)>
	//    7   15:pop             
	//    8   16:return          
	}

	public void onUnderrun(int i, long l, long l1)
	{
		SimpleDecoderAudioRenderer.access$100(SimpleDecoderAudioRenderer.this).audioTrackUnderrun(i, l, l1);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SimpleDecoderAudioRenderer this$0>
	//    2    4:invokestatic    #28  <Method AudioRendererEventListener$EventDispatcher SimpleDecoderAudioRenderer.access$100(SimpleDecoderAudioRenderer)>
	//    3    7:iload_1         
	//    4    8:lload_2         
	//    5    9:lload           4
	//    6   11:invokevirtual   #48  <Method void AudioRendererEventListener$EventDispatcher.audioTrackUnderrun(int, long, long)>
		onAudioTrackUnderrun(i, l, l1);
	//    7   14:aload_0         
	//    8   15:getfield        #15  <Field SimpleDecoderAudioRenderer this$0>
	//    9   18:iload_1         
	//   10   19:lload_2         
	//   11   20:lload           4
	//   12   22:invokevirtual   #51  <Method void SimpleDecoderAudioRenderer.onAudioTrackUnderrun(int, long, long)>
	//   13   25:return          
	}

	final SimpleDecoderAudioRenderer this$0;

	private SimpleDecoderAudioRenderer$AudioSinkListener()
	{
		this$0 = SimpleDecoderAudioRenderer.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field SimpleDecoderAudioRenderer this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}

	SimpleDecoderAudioRenderer$AudioSinkListener(SimpleDecoderAudioRenderer._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void SimpleDecoderAudioRenderer$AudioSinkListener(SimpleDecoderAudioRenderer)>
	//    3    5:return          
	}
}
