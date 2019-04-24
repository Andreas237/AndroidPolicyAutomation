// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.audio;

import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.util.Assertions;

// Referenced classes of package com.google.android.exoplayer2.audio:
//			AudioRendererEventListener

public static final class AudioRendererEventListener$EventDispatcher
{

	public void audioSessionId(final int audioSessionId)
	{
		if(listener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field AudioRendererEventListener listener>
	//*   2    4:ifnull          24
			handler.post(new Runnable() {

				public void run()
				{
					listener.onAudioSessionId(audioSessionId);
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field AudioRendererEventListener$EventDispatcher this$0>
				//    2    4:invokestatic    #33  <Method AudioRendererEventListener AudioRendererEventListener$EventDispatcher.access$000(AudioRendererEventListener$EventDispatcher)>
				//    3    7:aload_0         
				//    4    8:getfield        #24  <Field int val$audioSessionId>
				//    5   11:invokeinterface #36  <Method void AudioRendererEventListener.onAudioSessionId(int)>
				//    6   16:return          
				}

				final AudioRendererEventListener.EventDispatcher this$0;
				final int val$audioSessionId;

			
			{
				this$0 = AudioRendererEventListener.EventDispatcher.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AudioRendererEventListener$EventDispatcher this$0>
				audioSessionId = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #24  <Field int val$audioSessionId>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #39  <Field Handler handler>
	//    5   11:new             #19  <Class AudioRendererEventListener$EventDispatcher$6>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:invokespecial   #50  <Method void AudioRendererEventListener$EventDispatcher$6(AudioRendererEventListener$EventDispatcher, int)>
	//   10   20:invokevirtual   #54  <Method boolean Handler.post(Runnable)>
	//   11   23:pop             
	//   12   24:return          
	}

	public void audioTrackUnderrun(final int bufferSize, final long bufferSizeMs, final long elapsedSinceLastFeedMs)
	{
		if(listener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field AudioRendererEventListener listener>
	//*   2    4:ifnull          27
			handler.post(new Runnable() {

				public void run()
				{
					listener.onAudioSinkUnderrun(bufferSize, bufferSizeMs, elapsedSinceLastFeedMs);
				//    0    0:aload_0         
				//    1    1:getfield        #25  <Field AudioRendererEventListener$EventDispatcher this$0>
				//    2    4:invokestatic    #40  <Method AudioRendererEventListener AudioRendererEventListener$EventDispatcher.access$000(AudioRendererEventListener$EventDispatcher)>
				//    3    7:aload_0         
				//    4    8:getfield        #27  <Field int val$bufferSize>
				//    5   11:aload_0         
				//    6   12:getfield        #29  <Field long val$bufferSizeMs>
				//    7   15:aload_0         
				//    8   16:getfield        #31  <Field long val$elapsedSinceLastFeedMs>
				//    9   19:invokeinterface #43  <Method void AudioRendererEventListener.onAudioSinkUnderrun(int, long, long)>
				//   10   24:return          
				}

				final AudioRendererEventListener.EventDispatcher this$0;
				final int val$bufferSize;
				final long val$bufferSizeMs;
				final long val$elapsedSinceLastFeedMs;

			
			{
				this$0 = AudioRendererEventListener.EventDispatcher.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field AudioRendererEventListener$EventDispatcher this$0>
				bufferSize = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #27  <Field int val$bufferSize>
				bufferSizeMs = l;
			//    6   10:aload_0         
			//    7   11:lload_3         
			//    8   12:putfield        #29  <Field long val$bufferSizeMs>
				elapsedSinceLastFeedMs = l1;
			//    9   15:aload_0         
			//   10   16:lload           5
			//   11   18:putfield        #31  <Field long val$elapsedSinceLastFeedMs>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #34  <Method void Object()>
			//   14   25:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #39  <Field Handler handler>
	//    5   11:new             #15  <Class AudioRendererEventListener$EventDispatcher$4>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:lload_2         
	//   10   18:lload           4
	//   11   20:invokespecial   #59  <Method void AudioRendererEventListener$EventDispatcher$4(AudioRendererEventListener$EventDispatcher, int, long, long)>
	//   12   23:invokevirtual   #54  <Method boolean Handler.post(Runnable)>
	//   13   26:pop             
	//   14   27:return          
	}

	public void decoderInitialized(final String decoderName, final long initializedTimestampMs, final long initializationDurationMs)
	{
		if(listener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field AudioRendererEventListener listener>
	//*   2    4:ifnull          27
			handler.post(new Runnable() {

				public void run()
				{
					listener.onAudioDecoderInitialized(decoderName, initializedTimestampMs, initializationDurationMs);
				//    0    0:aload_0         
				//    1    1:getfield        #25  <Field AudioRendererEventListener$EventDispatcher this$0>
				//    2    4:invokestatic    #40  <Method AudioRendererEventListener AudioRendererEventListener$EventDispatcher.access$000(AudioRendererEventListener$EventDispatcher)>
				//    3    7:aload_0         
				//    4    8:getfield        #27  <Field String val$decoderName>
				//    5   11:aload_0         
				//    6   12:getfield        #29  <Field long val$initializedTimestampMs>
				//    7   15:aload_0         
				//    8   16:getfield        #31  <Field long val$initializationDurationMs>
				//    9   19:invokeinterface #43  <Method void AudioRendererEventListener.onAudioDecoderInitialized(String, long, long)>
				//   10   24:return          
				}

				final AudioRendererEventListener.EventDispatcher this$0;
				final String val$decoderName;
				final long val$initializationDurationMs;
				final long val$initializedTimestampMs;

			
			{
				this$0 = AudioRendererEventListener.EventDispatcher.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field AudioRendererEventListener$EventDispatcher this$0>
				decoderName = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #27  <Field String val$decoderName>
				initializedTimestampMs = l;
			//    6   10:aload_0         
			//    7   11:lload_3         
			//    8   12:putfield        #29  <Field long val$initializedTimestampMs>
				initializationDurationMs = l1;
			//    9   15:aload_0         
			//   10   16:lload           5
			//   11   18:putfield        #31  <Field long val$initializationDurationMs>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #34  <Method void Object()>
			//   14   25:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #39  <Field Handler handler>
	//    5   11:new             #11  <Class AudioRendererEventListener$EventDispatcher$2>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:lload_2         
	//   10   18:lload           4
	//   11   20:invokespecial   #64  <Method void AudioRendererEventListener$EventDispatcher$2(AudioRendererEventListener$EventDispatcher, String, long, long)>
	//   12   23:invokevirtual   #54  <Method boolean Handler.post(Runnable)>
	//   13   26:pop             
	//   14   27:return          
	}

	public void disabled(final DecoderCounters counters)
	{
		if(listener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field AudioRendererEventListener listener>
	//*   2    4:ifnull          24
			handler.post(new Runnable() {

				public void run()
				{
					counters.ensureUpdated();
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field DecoderCounters val$counters>
				//    2    4:invokevirtual   #34  <Method void DecoderCounters.ensureUpdated()>
					listener.onAudioDisabled(counters);
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

			
			{
				this$0 = AudioRendererEventListener.EventDispatcher.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AudioRendererEventListener$EventDispatcher this$0>
				counters = decodercounters;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field DecoderCounters val$counters>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #39  <Field Handler handler>
	//    5   11:new             #17  <Class AudioRendererEventListener$EventDispatcher$5>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #69  <Method void AudioRendererEventListener$EventDispatcher$5(AudioRendererEventListener$EventDispatcher, DecoderCounters)>
	//   10   20:invokevirtual   #54  <Method boolean Handler.post(Runnable)>
	//   11   23:pop             
	//   12   24:return          
	}

	public void enabled(final DecoderCounters decoderCounters)
	{
		if(listener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field AudioRendererEventListener listener>
	//*   2    4:ifnull          24
			handler.post(new Runnable() {

				public void run()
				{
					listener.onAudioEnabled(decoderCounters);
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field AudioRendererEventListener$EventDispatcher this$0>
				//    2    4:invokestatic    #33  <Method AudioRendererEventListener AudioRendererEventListener$EventDispatcher.access$000(AudioRendererEventListener$EventDispatcher)>
				//    3    7:aload_0         
				//    4    8:getfield        #24  <Field DecoderCounters val$decoderCounters>
				//    5   11:invokeinterface #36  <Method void AudioRendererEventListener.onAudioEnabled(DecoderCounters)>
				//    6   16:return          
				}

				final AudioRendererEventListener.EventDispatcher this$0;
				final DecoderCounters val$decoderCounters;

			
			{
				this$0 = AudioRendererEventListener.EventDispatcher.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AudioRendererEventListener$EventDispatcher this$0>
				decoderCounters = decodercounters;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field DecoderCounters val$decoderCounters>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #39  <Field Handler handler>
	//    5   11:new             #9   <Class AudioRendererEventListener$EventDispatcher$1>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #71  <Method void AudioRendererEventListener$EventDispatcher$1(AudioRendererEventListener$EventDispatcher, DecoderCounters)>
	//   10   20:invokevirtual   #54  <Method boolean Handler.post(Runnable)>
	//   11   23:pop             
	//   12   24:return          
	}

	public void inputFormatChanged(final Format format)
	{
		if(listener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field AudioRendererEventListener listener>
	//*   2    4:ifnull          24
			handler.post(new Runnable() {

				public void run()
				{
					listener.onAudioInputFormatChanged(format);
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field AudioRendererEventListener$EventDispatcher this$0>
				//    2    4:invokestatic    #33  <Method AudioRendererEventListener AudioRendererEventListener$EventDispatcher.access$000(AudioRendererEventListener$EventDispatcher)>
				//    3    7:aload_0         
				//    4    8:getfield        #24  <Field Format val$format>
				//    5   11:invokeinterface #36  <Method void AudioRendererEventListener.onAudioInputFormatChanged(Format)>
				//    6   16:return          
				}

				final AudioRendererEventListener.EventDispatcher this$0;
				final Format val$format;

			
			{
				this$0 = AudioRendererEventListener.EventDispatcher.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AudioRendererEventListener$EventDispatcher this$0>
				format = format1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field Format val$format>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #39  <Field Handler handler>
	//    5   11:new             #13  <Class AudioRendererEventListener$EventDispatcher$3>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #76  <Method void AudioRendererEventListener$EventDispatcher$3(AudioRendererEventListener$EventDispatcher, Format)>
	//   10   20:invokevirtual   #54  <Method boolean Handler.post(Runnable)>
	//   11   23:pop             
	//   12   24:return          
	}

	private final Handler handler;
	private final AudioRendererEventListener listener;


/*
	static AudioRendererEventListener access$000(AudioRendererEventListener$EventDispatcher audiorenderereventlistener$eventdispatcher)
	{
		return audiorenderereventlistener$eventdispatcher.listener;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field AudioRendererEventListener listener>
	//    2    4:areturn         
	}

*/

	public AudioRendererEventListener$EventDispatcher(Handler handler1, AudioRendererEventListener audiorenderereventlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		if(audiorenderereventlistener != null)
	//*   2    4:aload_2         
	//*   3    5:ifnull          19
			handler1 = (Handler)Assertions.checkNotNull(((Object) (handler1)));
	//    4    8:aload_1         
	//    5    9:invokestatic    #35  <Method Object Assertions.checkNotNull(Object)>
	//    6   12:checkcast       #37  <Class Handler>
	//    7   15:astore_1        
		else
	//*   8   16:goto            21
			handler1 = null;
	//    9   19:aconst_null     
	//   10   20:astore_1        
		handler = handler1;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #39  <Field Handler handler>
		listener = audiorenderereventlistener;
	//   14   26:aload_0         
	//   15   27:aload_2         
	//   16   28:putfield        #41  <Field AudioRendererEventListener listener>
	//   17   31:return          
	}
}
