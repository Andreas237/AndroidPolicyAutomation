// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.decoder.DecoderCounters;

// Referenced classes of package com.google.android.exoplayer2.audio:
//			AudioRendererEventListener

class AudioRendererEventListener$EventDispatcher$5
	implements Runnable
{

	public void run()
	{
		val$counters.ensureUpdated();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field DecoderCounters val$counters>
	//    2    4:invokevirtual   #34  <Method void DecoderCounters.ensureUpdated()>
		AudioRendererEventListener.EventDispatcher.access$000(AudioRendererEventListener.EventDispatcher.this).onAudioDisabled(val$counters);
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field AudioRendererEventListener$EventDispatcher this$0>
	//    5   11:invokestatic    #38  <Method AudioRendererEventListener AudioRendererEventListener$EventDispatcher.access$000(AudioRendererEventListener$EventDispatcher)>
	//    6   14:aload_0         
	//    7   15:getfield        #24  <Field DecoderCounters val$counters>
	//    8   18:invokeinterface #41  <Method void AudioRendererEventListener.onAudioDisabled(DecoderCounters)>
	//    9   23:return          
	}

	final AudioRendererEventListener.EventDispatcher this$0;
	final DecoderCounters val$counters;

	AudioRendererEventListener$EventDispatcher$5()
	{
		this$0 = final_eventdispatcher;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field AudioRendererEventListener$EventDispatcher this$0>
		val$counters = DecoderCounters.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field DecoderCounters val$counters>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void Object()>
	//    8   14:return          
	}
}
