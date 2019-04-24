// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.audio:
//			AudioSink, AudioTrackPositionTracker, ChannelMappingAudioProcessor, TrimmingAudioProcessor, 
//			AudioProcessor, ResamplingAudioProcessor, FloatResamplingAudioProcessor, AudioAttributes, 
//			Ac3Util, DtsUtil, AudioCapabilities, SilenceSkippingAudioProcessor, 
//			SonicAudioProcessor

public final class DefaultAudioSink
	implements AudioSink
{
	public static interface AudioProcessorChain
	{

		public abstract PlaybackParameters applyPlaybackParameters(PlaybackParameters playbackparameters);

		public abstract AudioProcessor[] getAudioProcessors();

		public abstract long getMediaDuration(long l);

		public abstract long getSkippedOutputFrameCount();
	}

	public static class DefaultAudioProcessorChain
		implements AudioProcessorChain
	{

		public PlaybackParameters applyPlaybackParameters(PlaybackParameters playbackparameters)
		{
			silenceSkippingAudioProcessor.setEnabled(playbackparameters.skipSilence);
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field SilenceSkippingAudioProcessor silenceSkippingAudioProcessor>
		//    2    4:aload_1         
		//    3    5:getfield        #48  <Field boolean PlaybackParameters.skipSilence>
		//    4    8:invokevirtual   #52  <Method void SilenceSkippingAudioProcessor.setEnabled(boolean)>
			return new PlaybackParameters(sonicAudioProcessor.setSpeed(playbackparameters.speed), sonicAudioProcessor.setPitch(playbackparameters.pitch), playbackparameters.skipSilence);
		//    5   11:new             #44  <Class PlaybackParameters>
		//    6   14:dup             
		//    7   15:aload_0         
		//    8   16:getfield        #39  <Field SonicAudioProcessor sonicAudioProcessor>
		//    9   19:aload_1         
		//   10   20:getfield        #56  <Field float PlaybackParameters.speed>
		//   11   23:invokevirtual   #60  <Method float SonicAudioProcessor.setSpeed(float)>
		//   12   26:aload_0         
		//   13   27:getfield        #39  <Field SonicAudioProcessor sonicAudioProcessor>
		//   14   30:aload_1         
		//   15   31:getfield        #63  <Field float PlaybackParameters.pitch>
		//   16   34:invokevirtual   #66  <Method float SonicAudioProcessor.setPitch(float)>
		//   17   37:aload_1         
		//   18   38:getfield        #48  <Field boolean PlaybackParameters.skipSilence>
		//   19   41:invokespecial   #69  <Method void PlaybackParameters(float, float, boolean)>
		//   20   44:areturn         
		}

		public AudioProcessor[] getAudioProcessors()
		{
			return audioProcessors;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field AudioProcessor[] audioProcessors>
		//    2    4:areturn         
		}

		public long getMediaDuration(long l)
		{
			return sonicAudioProcessor.scaleDurationForSpeedup(l);
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field SonicAudioProcessor sonicAudioProcessor>
		//    2    4:lload_1         
		//    3    5:invokevirtual   #76  <Method long SonicAudioProcessor.scaleDurationForSpeedup(long)>
		//    4    8:lreturn         
		}

		public long getSkippedOutputFrameCount()
		{
			return silenceSkippingAudioProcessor.getSkippedFrames();
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field SilenceSkippingAudioProcessor silenceSkippingAudioProcessor>
		//    2    4:invokevirtual   #81  <Method long SilenceSkippingAudioProcessor.getSkippedFrames()>
		//    3    7:lreturn         
		}

		private final AudioProcessor audioProcessors[];
		private final SilenceSkippingAudioProcessor silenceSkippingAudioProcessor = new SilenceSkippingAudioProcessor();
		private final SonicAudioProcessor sonicAudioProcessor = new SonicAudioProcessor();

		public transient DefaultAudioProcessorChain(AudioProcessor aaudioprocessor[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			audioProcessors = (AudioProcessor[])Arrays.copyOf(((Object []) (aaudioprocessor)), aaudioprocessor.length + 2);
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:aload_1         
		//    5    7:arraylength     
		//    6    8:iconst_2        
		//    7    9:iadd            
		//    8   10:invokestatic    #26  <Method Object[] Arrays.copyOf(Object[], int)>
		//    9   13:checkcast       #27  <Class AudioProcessor[]>
		//   10   16:putfield        #29  <Field AudioProcessor[] audioProcessors>
		//   11   19:aload_0         
		//   12   20:new             #31  <Class SilenceSkippingAudioProcessor>
		//   13   23:dup             
		//   14   24:invokespecial   #32  <Method void SilenceSkippingAudioProcessor()>
		//   15   27:putfield        #34  <Field SilenceSkippingAudioProcessor silenceSkippingAudioProcessor>
		//   16   30:aload_0         
		//   17   31:new             #36  <Class SonicAudioProcessor>
		//   18   34:dup             
		//   19   35:invokespecial   #37  <Method void SonicAudioProcessor()>
		//   20   38:putfield        #39  <Field SonicAudioProcessor sonicAudioProcessor>
			audioProcessors[aaudioprocessor.length] = ((AudioProcessor) (silenceSkippingAudioProcessor));
		//   21   41:aload_0         
		//   22   42:getfield        #29  <Field AudioProcessor[] audioProcessors>
		//   23   45:aload_1         
		//   24   46:arraylength     
		//   25   47:aload_0         
		//   26   48:getfield        #34  <Field SilenceSkippingAudioProcessor silenceSkippingAudioProcessor>
		//   27   51:aastore         
			audioProcessors[aaudioprocessor.length + 1] = ((AudioProcessor) (sonicAudioProcessor));
		//   28   52:aload_0         
		//   29   53:getfield        #29  <Field AudioProcessor[] audioProcessors>
		//   30   56:aload_1         
		//   31   57:arraylength     
		//   32   58:iconst_1        
		//   33   59:iadd            
		//   34   60:aload_0         
		//   35   61:getfield        #39  <Field SonicAudioProcessor sonicAudioProcessor>
		//   36   64:aastore         
		//   37   65:return          
		}
	}

	public static final class InvalidAudioTrackTimestampException extends RuntimeException
	{

		private InvalidAudioTrackTimestampException(String s)
		{
			super(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void RuntimeException(String)>
		//    3    5:return          
		}

	}

	private static final class PlaybackParametersCheckpoint
	{

		private final long mediaTimeUs;
		private final PlaybackParameters playbackParameters;
		private final long positionUs;


/*
		static PlaybackParameters access$200(PlaybackParametersCheckpoint playbackparameterscheckpoint)
		{
			return playbackparameterscheckpoint.playbackParameters;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field PlaybackParameters playbackParameters>
		//    2    4:areturn         
		}

*/


/*
		static long access$400(PlaybackParametersCheckpoint playbackparameterscheckpoint)
		{
			return playbackparameterscheckpoint.positionUs;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field long positionUs>
		//    2    4:lreturn         
		}

*/


/*
		static long access$500(PlaybackParametersCheckpoint playbackparameterscheckpoint)
		{
			return playbackparameterscheckpoint.mediaTimeUs;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field long mediaTimeUs>
		//    2    4:lreturn         
		}

*/

		private PlaybackParametersCheckpoint(PlaybackParameters playbackparameters, long l, long l1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			playbackParameters = playbackparameters;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field PlaybackParameters playbackParameters>
			mediaTimeUs = l;
		//    5    9:aload_0         
		//    6   10:lload_2         
		//    7   11:putfield        #21  <Field long mediaTimeUs>
			positionUs = l1;
		//    8   14:aload_0         
		//    9   15:lload           4
		//   10   17:putfield        #23  <Field long positionUs>
		//   11   20:return          
		}

		PlaybackParametersCheckpoint(PlaybackParameters playbackparameters, long l, long l1, _cls1 _pcls1)
		{
			this(playbackparameters, l, l1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:lload_2         
		//    3    3:lload           4
		//    4    5:invokespecial   #27  <Method void DefaultAudioSink$PlaybackParametersCheckpoint(PlaybackParameters, long, long)>
		//    5    8:return          
		}
	}

	private final class PositionTrackerListener
		implements AudioTrackPositionTracker.Listener
	{

		public void onInvalidLatency(long l)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #26  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #27  <Method void StringBuilder()>
		//    3    7:astore_3        
			stringbuilder.append("Ignoring impossibly large audio latency: ");
		//    4    8:aload_3         
		//    5    9:ldc1            #29  <String "Ignoring impossibly large audio latency: ">
		//    6   11:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(l);
		//    8   15:aload_3         
		//    9   16:lload_1         
		//   10   17:invokevirtual   #36  <Method StringBuilder StringBuilder.append(long)>
		//   11   20:pop             
			Log.w("AudioTrack", stringbuilder.toString());
		//   12   21:ldc1            #38  <String "AudioTrack">
		//   13   23:aload_3         
		//   14   24:invokevirtual   #42  <Method String StringBuilder.toString()>
		//   15   27:invokestatic    #48  <Method int Log.w(String, String)>
		//   16   30:pop             
		//   17   31:return          
		}

		public void onPositionFramesMismatch(long l, long l1, long l2, long l3)
		{
			Object obj = ((Object) (new StringBuilder()));
		//    0    0:new             #26  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #27  <Method void StringBuilder()>
		//    3    7:astore          9
			((StringBuilder) (obj)).append("Spurious audio timestamp (frame position mismatch): ");
		//    4    9:aload           9
		//    5   11:ldc1            #52  <String "Spurious audio timestamp (frame position mismatch): ">
		//    6   13:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
		//    7   16:pop             
			((StringBuilder) (obj)).append(l);
		//    8   17:aload           9
		//    9   19:lload_1         
		//   10   20:invokevirtual   #36  <Method StringBuilder StringBuilder.append(long)>
		//   11   23:pop             
			((StringBuilder) (obj)).append(", ");
		//   12   24:aload           9
		//   13   26:ldc1            #54  <String ", ">
		//   14   28:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
		//   15   31:pop             
			((StringBuilder) (obj)).append(l1);
		//   16   32:aload           9
		//   17   34:lload_3         
		//   18   35:invokevirtual   #36  <Method StringBuilder StringBuilder.append(long)>
		//   19   38:pop             
			((StringBuilder) (obj)).append(", ");
		//   20   39:aload           9
		//   21   41:ldc1            #54  <String ", ">
		//   22   43:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
		//   23   46:pop             
			((StringBuilder) (obj)).append(l2);
		//   24   47:aload           9
		//   25   49:lload           5
		//   26   51:invokevirtual   #36  <Method StringBuilder StringBuilder.append(long)>
		//   27   54:pop             
			((StringBuilder) (obj)).append(", ");
		//   28   55:aload           9
		//   29   57:ldc1            #54  <String ", ">
		//   30   59:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
		//   31   62:pop             
			((StringBuilder) (obj)).append(l3);
		//   32   63:aload           9
		//   33   65:lload           7
		//   34   67:invokevirtual   #36  <Method StringBuilder StringBuilder.append(long)>
		//   35   70:pop             
			((StringBuilder) (obj)).append(", ");
		//   36   71:aload           9
		//   37   73:ldc1            #54  <String ", ">
		//   38   75:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
		//   39   78:pop             
			((StringBuilder) (obj)).append(getSubmittedFrames());
		//   40   79:aload           9
		//   41   81:aload_0         
		//   42   82:getfield        #15  <Field DefaultAudioSink this$0>
		//   43   85:invokestatic    #58  <Method long DefaultAudioSink.access$600(DefaultAudioSink)>
		//   44   88:invokevirtual   #36  <Method StringBuilder StringBuilder.append(long)>
		//   45   91:pop             
			((StringBuilder) (obj)).append(", ");
		//   46   92:aload           9
		//   47   94:ldc1            #54  <String ", ">
		//   48   96:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
		//   49   99:pop             
			((StringBuilder) (obj)).append(getWrittenFrames());
		//   50  100:aload           9
		//   51  102:aload_0         
		//   52  103:getfield        #15  <Field DefaultAudioSink this$0>
		//   53  106:invokestatic    #61  <Method long DefaultAudioSink.access$700(DefaultAudioSink)>
		//   54  109:invokevirtual   #36  <Method StringBuilder StringBuilder.append(long)>
		//   55  112:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
		//   56  113:aload           9
		//   57  115:invokevirtual   #42  <Method String StringBuilder.toString()>
		//   58  118:astore          9
			if(DefaultAudioSink.failOnSpuriousAudioTimestamp)
		//*  59  120:getstatic       #65  <Field boolean DefaultAudioSink.failOnSpuriousAudioTimestamp>
		//*  60  123:ifeq            137
			{
				throw new InvalidAudioTrackTimestampException(((String) (obj)));
		//   61  126:new             #67  <Class DefaultAudioSink$InvalidAudioTrackTimestampException>
		//   62  129:dup             
		//   63  130:aload           9
		//   64  132:aconst_null     
		//   65  133:invokespecial   #70  <Method void DefaultAudioSink$InvalidAudioTrackTimestampException(String, DefaultAudioSink$1)>
		//   66  136:athrow          
			} else
			{
				Log.w("AudioTrack", ((String) (obj)));
		//   67  137:ldc1            #38  <String "AudioTrack">
		//   68  139:aload           9
		//   69  141:invokestatic    #48  <Method int Log.w(String, String)>
		//   70  144:pop             
				return;
		//   71  145:return          
			}
		}

		public void onSystemTimeUsMismatch(long l, long l1, long l2, long l3)
		{
			Object obj = ((Object) (new StringBuilder()));
		//    0    0:new             #26  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #27  <Method void StringBuilder()>
		//    3    7:astore          9
			((StringBuilder) (obj)).append("Spurious audio timestamp (system clock mismatch): ");
		//    4    9:aload           9
		//    5   11:ldc1            #73  <String "Spurious audio timestamp (system clock mismatch): ">
		//    6   13:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
		//    7   16:pop             
			((StringBuilder) (obj)).append(l);
		//    8   17:aload           9
		//    9   19:lload_1         
		//   10   20:invokevirtual   #36  <Method StringBuilder StringBuilder.append(long)>
		//   11   23:pop             
			((StringBuilder) (obj)).append(", ");
		//   12   24:aload           9
		//   13   26:ldc1            #54  <String ", ">
		//   14   28:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
		//   15   31:pop             
			((StringBuilder) (obj)).append(l1);
		//   16   32:aload           9
		//   17   34:lload_3         
		//   18   35:invokevirtual   #36  <Method StringBuilder StringBuilder.append(long)>
		//   19   38:pop             
			((StringBuilder) (obj)).append(", ");
		//   20   39:aload           9
		//   21   41:ldc1            #54  <String ", ">
		//   22   43:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
		//   23   46:pop             
			((StringBuilder) (obj)).append(l2);
		//   24   47:aload           9
		//   25   49:lload           5
		//   26   51:invokevirtual   #36  <Method StringBuilder StringBuilder.append(long)>
		//   27   54:pop             
			((StringBuilder) (obj)).append(", ");
		//   28   55:aload           9
		//   29   57:ldc1            #54  <String ", ">
		//   30   59:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
		//   31   62:pop             
			((StringBuilder) (obj)).append(l3);
		//   32   63:aload           9
		//   33   65:lload           7
		//   34   67:invokevirtual   #36  <Method StringBuilder StringBuilder.append(long)>
		//   35   70:pop             
			((StringBuilder) (obj)).append(", ");
		//   36   71:aload           9
		//   37   73:ldc1            #54  <String ", ">
		//   38   75:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
		//   39   78:pop             
			((StringBuilder) (obj)).append(getSubmittedFrames());
		//   40   79:aload           9
		//   41   81:aload_0         
		//   42   82:getfield        #15  <Field DefaultAudioSink this$0>
		//   43   85:invokestatic    #58  <Method long DefaultAudioSink.access$600(DefaultAudioSink)>
		//   44   88:invokevirtual   #36  <Method StringBuilder StringBuilder.append(long)>
		//   45   91:pop             
			((StringBuilder) (obj)).append(", ");
		//   46   92:aload           9
		//   47   94:ldc1            #54  <String ", ">
		//   48   96:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
		//   49   99:pop             
			((StringBuilder) (obj)).append(getWrittenFrames());
		//   50  100:aload           9
		//   51  102:aload_0         
		//   52  103:getfield        #15  <Field DefaultAudioSink this$0>
		//   53  106:invokestatic    #61  <Method long DefaultAudioSink.access$700(DefaultAudioSink)>
		//   54  109:invokevirtual   #36  <Method StringBuilder StringBuilder.append(long)>
		//   55  112:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
		//   56  113:aload           9
		//   57  115:invokevirtual   #42  <Method String StringBuilder.toString()>
		//   58  118:astore          9
			if(DefaultAudioSink.failOnSpuriousAudioTimestamp)
		//*  59  120:getstatic       #65  <Field boolean DefaultAudioSink.failOnSpuriousAudioTimestamp>
		//*  60  123:ifeq            137
			{
				throw new InvalidAudioTrackTimestampException(((String) (obj)));
		//   61  126:new             #67  <Class DefaultAudioSink$InvalidAudioTrackTimestampException>
		//   62  129:dup             
		//   63  130:aload           9
		//   64  132:aconst_null     
		//   65  133:invokespecial   #70  <Method void DefaultAudioSink$InvalidAudioTrackTimestampException(String, DefaultAudioSink$1)>
		//   66  136:athrow          
			} else
			{
				Log.w("AudioTrack", ((String) (obj)));
		//   67  137:ldc1            #38  <String "AudioTrack">
		//   68  139:aload           9
		//   69  141:invokestatic    #48  <Method int Log.w(String, String)>
		//   70  144:pop             
				return;
		//   71  145:return          
			}
		}

		public void onUnderrun(int i, long l)
		{
			if(listener != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field DefaultAudioSink this$0>
		//*   2    4:invokestatic    #79  <Method AudioSink$Listener DefaultAudioSink.access$900(DefaultAudioSink)>
		//*   3    7:ifnull          43
			{
				long l1 = SystemClock.elapsedRealtime();
		//    4   10:invokestatic    #85  <Method long SystemClock.elapsedRealtime()>
		//    5   13:lstore          4
				long l2 = lastFeedElapsedRealtimeMs;
		//    6   15:aload_0         
		//    7   16:getfield        #15  <Field DefaultAudioSink this$0>
		//    8   19:invokestatic    #88  <Method long DefaultAudioSink.access$1000(DefaultAudioSink)>
		//    9   22:lstore          6
				listener.onUnderrun(i, l, l1 - l2);
		//   10   24:aload_0         
		//   11   25:getfield        #15  <Field DefaultAudioSink this$0>
		//   12   28:invokestatic    #79  <Method AudioSink$Listener DefaultAudioSink.access$900(DefaultAudioSink)>
		//   13   31:iload_1         
		//   14   32:lload_2         
		//   15   33:lload           4
		//   16   35:lload           6
		//   17   37:lsub            
		//   18   38:invokeinterface #93  <Method void AudioSink$Listener.onUnderrun(int, long, long)>
			}
		//   19   43:return          
		}

		final DefaultAudioSink this$0;

		private PositionTrackerListener()
		{
			this$0 = DefaultAudioSink.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field DefaultAudioSink this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}


	public DefaultAudioSink(AudioCapabilities audiocapabilities, AudioProcessorChain audioprocessorchain, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #134 <Method void Object()>
		audioCapabilities = audiocapabilities;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #136 <Field AudioCapabilities audioCapabilities>
		audioProcessorChain = (AudioProcessorChain)Assertions.checkNotNull(((Object) (audioprocessorchain)));
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokestatic    #142 <Method Object Assertions.checkNotNull(Object)>
	//    8   14:checkcast       #12  <Class DefaultAudioSink$AudioProcessorChain>
	//    9   17:putfield        #144 <Field DefaultAudioSink$AudioProcessorChain audioProcessorChain>
		enableConvertHighResIntPcmToFloat = flag;
	//   10   20:aload_0         
	//   11   21:iload_3         
	//   12   22:putfield        #146 <Field boolean enableConvertHighResIntPcmToFloat>
		releasingConditionVariable = new ConditionVariable(true);
	//   13   25:aload_0         
	//   14   26:new             #148 <Class ConditionVariable>
	//   15   29:dup             
	//   16   30:iconst_1        
	//   17   31:invokespecial   #151 <Method void ConditionVariable(boolean)>
	//   18   34:putfield        #153 <Field ConditionVariable releasingConditionVariable>
		audioTrackPositionTracker = new AudioTrackPositionTracker(((AudioTrackPositionTracker.Listener) (new PositionTrackerListener())));
	//   19   37:aload_0         
	//   20   38:new             #155 <Class AudioTrackPositionTracker>
	//   21   41:dup             
	//   22   42:new             #24  <Class DefaultAudioSink$PositionTrackerListener>
	//   23   45:dup             
	//   24   46:aload_0         
	//   25   47:aconst_null     
	//   26   48:invokespecial   #158 <Method void DefaultAudioSink$PositionTrackerListener(DefaultAudioSink, DefaultAudioSink$1)>
	//   27   51:invokespecial   #161 <Method void AudioTrackPositionTracker(AudioTrackPositionTracker$Listener)>
	//   28   54:putfield        #163 <Field AudioTrackPositionTracker audioTrackPositionTracker>
		channelMappingAudioProcessor = new ChannelMappingAudioProcessor();
	//   29   57:aload_0         
	//   30   58:new             #165 <Class ChannelMappingAudioProcessor>
	//   31   61:dup             
	//   32   62:invokespecial   #166 <Method void ChannelMappingAudioProcessor()>
	//   33   65:putfield        #168 <Field ChannelMappingAudioProcessor channelMappingAudioProcessor>
		trimmingAudioProcessor = new TrimmingAudioProcessor();
	//   34   68:aload_0         
	//   35   69:new             #170 <Class TrimmingAudioProcessor>
	//   36   72:dup             
	//   37   73:invokespecial   #171 <Method void TrimmingAudioProcessor()>
	//   38   76:putfield        #173 <Field TrimmingAudioProcessor trimmingAudioProcessor>
		audiocapabilities = ((AudioCapabilities) (new ArrayList()));
	//   39   79:new             #175 <Class ArrayList>
	//   40   82:dup             
	//   41   83:invokespecial   #176 <Method void ArrayList()>
	//   42   86:astore_1        
		Collections.addAll(((java.util.Collection) (audiocapabilities)), ((Object []) (new AudioProcessor[] {
			new ResamplingAudioProcessor(), channelMappingAudioProcessor, trimmingAudioProcessor
		})));
	//   43   87:aload_1         
	//   44   88:iconst_3        
	//   45   89:anewarray       AudioProcessor[]
	//   46   92:dup             
	//   47   93:iconst_0        
	//   48   94:new             #180 <Class ResamplingAudioProcessor>
	//   49   97:dup             
	//   50   98:invokespecial   #181 <Method void ResamplingAudioProcessor()>
	//   51  101:aastore         
	//   52  102:dup             
	//   53  103:iconst_1        
	//   54  104:aload_0         
	//   55  105:getfield        #168 <Field ChannelMappingAudioProcessor channelMappingAudioProcessor>
	//   56  108:aastore         
	//   57  109:dup             
	//   58  110:iconst_2        
	//   59  111:aload_0         
	//   60  112:getfield        #173 <Field TrimmingAudioProcessor trimmingAudioProcessor>
	//   61  115:aastore         
	//   62  116:invokestatic    #187 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//   63  119:pop             
		Collections.addAll(((java.util.Collection) (audiocapabilities)), ((Object []) (audioprocessorchain.getAudioProcessors())));
	//   64  120:aload_1         
	//   65  121:aload_2         
	//   66  122:invokeinterface #191 <Method AudioProcessor[] DefaultAudioSink$AudioProcessorChain.getAudioProcessors()>
	//   67  127:invokestatic    #187 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//   68  130:pop             
		toIntPcmAvailableAudioProcessors = (AudioProcessor[])((ArrayList) (audiocapabilities)).toArray(((Object []) (new AudioProcessor[((ArrayList) (audiocapabilities)).size()])));
	//   69  131:aload_0         
	//   70  132:aload_1         
	//   71  133:aload_1         
	//   72  134:invokevirtual   #195 <Method int ArrayList.size()>
	//   73  137:anewarray       AudioProcessor[]
	//   74  140:invokevirtual   #199 <Method Object[] ArrayList.toArray(Object[])>
	//   75  143:checkcast       #200 <Class AudioProcessor[]>
	//   76  146:putfield        #202 <Field AudioProcessor[] toIntPcmAvailableAudioProcessors>
	//   77  149:aload_0         
	//   78  150:iconst_1        
	//   79  151:anewarray       AudioProcessor[]
	//   80  154:dup             
	//   81  155:iconst_0        
	//   82  156:new             #204 <Class FloatResamplingAudioProcessor>
	//   83  159:dup             
	//   84  160:invokespecial   #205 <Method void FloatResamplingAudioProcessor()>
	//   85  163:aastore         
	//   86  164:putfield        #207 <Field AudioProcessor[] toFloatPcmAvailableAudioProcessors>
		volume = 1.0F;
	//   87  167:aload_0         
	//   88  168:fconst_1        
	//   89  169:putfield        #209 <Field float volume>
		startMediaTimeState = 0;
	//   90  172:aload_0         
	//   91  173:iconst_0        
	//   92  174:putfield        #211 <Field int startMediaTimeState>
		audioAttributes = AudioAttributes.DEFAULT;
	//   93  177:aload_0         
	//   94  178:getstatic       #216 <Field AudioAttributes AudioAttributes.DEFAULT>
	//   95  181:putfield        #218 <Field AudioAttributes audioAttributes>
		audioSessionId = 0;
	//   96  184:aload_0         
	//   97  185:iconst_0        
	//   98  186:putfield        #220 <Field int audioSessionId>
		playbackParameters = PlaybackParameters.DEFAULT;
	//   99  189:aload_0         
	//  100  190:getstatic       #224 <Field PlaybackParameters PlaybackParameters.DEFAULT>
	//  101  193:putfield        #226 <Field PlaybackParameters playbackParameters>
		drainingAudioProcessorIndex = -1;
	//  102  196:aload_0         
	//  103  197:iconst_m1       
	//  104  198:putfield        #228 <Field int drainingAudioProcessorIndex>
		activeAudioProcessors = new AudioProcessor[0];
	//  105  201:aload_0         
	//  106  202:iconst_0        
	//  107  203:anewarray       AudioProcessor[]
	//  108  206:putfield        #230 <Field AudioProcessor[] activeAudioProcessors>
		outputBuffers = new ByteBuffer[0];
	//  109  209:aload_0         
	//  110  210:iconst_0        
	//  111  211:anewarray       ByteBuffer[]
	//  112  214:putfield        #234 <Field ByteBuffer[] outputBuffers>
		playbackParametersCheckpoints = new ArrayDeque();
	//  113  217:aload_0         
	//  114  218:new             #236 <Class ArrayDeque>
	//  115  221:dup             
	//  116  222:invokespecial   #237 <Method void ArrayDeque()>
	//  117  225:putfield        #239 <Field ArrayDeque playbackParametersCheckpoints>
	//  118  228:return          
	}

	public DefaultAudioSink(AudioCapabilities audiocapabilities, AudioProcessor aaudioprocessor[])
	{
		this(audiocapabilities, aaudioprocessor, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #244 <Method void DefaultAudioSink(AudioCapabilities, AudioProcessor[], boolean)>
	//    5    7:return          
	}

	public DefaultAudioSink(AudioCapabilities audiocapabilities, AudioProcessor aaudioprocessor[], boolean flag)
	{
		this(audiocapabilities, ((AudioProcessorChain) (new DefaultAudioProcessorChain(aaudioprocessor))), flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #15  <Class DefaultAudioSink$DefaultAudioProcessorChain>
	//    3    5:dup             
	//    4    6:aload_2         
	//    5    7:invokespecial   #247 <Method void DefaultAudioSink$DefaultAudioProcessorChain(AudioProcessor[])>
	//    6   10:iload_3         
	//    7   11:invokespecial   #249 <Method void DefaultAudioSink(AudioCapabilities, DefaultAudioSink$AudioProcessorChain, boolean)>
	//    8   14:return          
	}

	private long applySkipping(long l)
	{
		return l + framesToDurationUs(audioProcessorChain.getSkippedOutputFrameCount());
	//    0    0:lload_1         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #144 <Field DefaultAudioSink$AudioProcessorChain audioProcessorChain>
	//    4    6:invokeinterface #273 <Method long DefaultAudioSink$AudioProcessorChain.getSkippedOutputFrameCount()>
	//    5   11:invokespecial   #276 <Method long framesToDurationUs(long)>
	//    6   14:ladd            
	//    7   15:lreturn         
	}

	private long applySpeedup(long l)
	{
		PlaybackParametersCheckpoint playbackparameterscheckpoint;
		for(playbackparameterscheckpoint = null; !playbackParametersCheckpoints.isEmpty() && l >= ((PlaybackParametersCheckpoint)playbackParametersCheckpoints.getFirst()).positionUs; playbackparameterscheckpoint = (PlaybackParametersCheckpoint)playbackParametersCheckpoints.remove());
	//    0    0:aconst_null     
	//    1    1:astore_3        
	//    2    2:aload_0         
	//    3    3:getfield        #239 <Field ArrayDeque playbackParametersCheckpoints>
	//    4    6:invokevirtual   #281 <Method boolean ArrayDeque.isEmpty()>
	//    5    9:ifne            44
	//    6   12:lload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #239 <Field ArrayDeque playbackParametersCheckpoints>
	//    9   17:invokevirtual   #285 <Method Object ArrayDeque.getFirst()>
	//   10   20:checkcast       #21  <Class DefaultAudioSink$PlaybackParametersCheckpoint>
	//   11   23:invokestatic    #289 <Method long DefaultAudioSink$PlaybackParametersCheckpoint.access$400(DefaultAudioSink$PlaybackParametersCheckpoint)>
	//   12   26:lcmp            
	//   13   27:iflt            44
	//   14   30:aload_0         
	//   15   31:getfield        #239 <Field ArrayDeque playbackParametersCheckpoints>
	//   16   34:invokevirtual   #292 <Method Object ArrayDeque.remove()>
	//   17   37:checkcast       #21  <Class DefaultAudioSink$PlaybackParametersCheckpoint>
	//   18   40:astore_3        
	//*  19   41:goto            2
		if(playbackparameterscheckpoint != null)
	//*  20   44:aload_3         
	//*  21   45:ifnull          77
		{
			playbackParameters = playbackparameterscheckpoint.playbackParameters;
	//   22   48:aload_0         
	//   23   49:aload_3         
	//   24   50:invokestatic    #296 <Method PlaybackParameters DefaultAudioSink$PlaybackParametersCheckpoint.access$200(DefaultAudioSink$PlaybackParametersCheckpoint)>
	//   25   53:putfield        #226 <Field PlaybackParameters playbackParameters>
			playbackParametersPositionUs = playbackparameterscheckpoint.positionUs;
	//   26   56:aload_0         
	//   27   57:aload_3         
	//   28   58:invokestatic    #289 <Method long DefaultAudioSink$PlaybackParametersCheckpoint.access$400(DefaultAudioSink$PlaybackParametersCheckpoint)>
	//   29   61:putfield        #298 <Field long playbackParametersPositionUs>
			playbackParametersOffsetUs = playbackparameterscheckpoint.mediaTimeUs - startMediaTimeUs;
	//   30   64:aload_0         
	//   31   65:aload_3         
	//   32   66:invokestatic    #301 <Method long DefaultAudioSink$PlaybackParametersCheckpoint.access$500(DefaultAudioSink$PlaybackParametersCheckpoint)>
	//   33   69:aload_0         
	//   34   70:getfield        #303 <Field long startMediaTimeUs>
	//   35   73:lsub            
	//   36   74:putfield        #305 <Field long playbackParametersOffsetUs>
		}
		if(playbackParameters.speed == 1.0F)
	//*  37   77:aload_0         
	//*  38   78:getfield        #226 <Field PlaybackParameters playbackParameters>
	//*  39   81:getfield        #308 <Field float PlaybackParameters.speed>
	//*  40   84:fconst_1        
	//*  41   85:fcmpl           
	//*  42   86:ifne            101
			return (l + playbackParametersOffsetUs) - playbackParametersPositionUs;
	//   43   89:lload_1         
	//   44   90:aload_0         
	//   45   91:getfield        #305 <Field long playbackParametersOffsetUs>
	//   46   94:ladd            
	//   47   95:aload_0         
	//   48   96:getfield        #298 <Field long playbackParametersPositionUs>
	//   49   99:lsub            
	//   50  100:lreturn         
		if(playbackParametersCheckpoints.isEmpty())
	//*  51  101:aload_0         
	//*  52  102:getfield        #239 <Field ArrayDeque playbackParametersCheckpoints>
	//*  53  105:invokevirtual   #281 <Method boolean ArrayDeque.isEmpty()>
	//*  54  108:ifeq            132
			return playbackParametersOffsetUs + audioProcessorChain.getMediaDuration(l - playbackParametersPositionUs);
	//   55  111:aload_0         
	//   56  112:getfield        #305 <Field long playbackParametersOffsetUs>
	//   57  115:aload_0         
	//   58  116:getfield        #144 <Field DefaultAudioSink$AudioProcessorChain audioProcessorChain>
	//   59  119:lload_1         
	//   60  120:aload_0         
	//   61  121:getfield        #298 <Field long playbackParametersPositionUs>
	//   62  124:lsub            
	//   63  125:invokeinterface #311 <Method long DefaultAudioSink$AudioProcessorChain.getMediaDuration(long)>
	//   64  130:ladd            
	//   65  131:lreturn         
		else
			return playbackParametersOffsetUs + Util.getMediaDurationForPlayoutDuration(l - playbackParametersPositionUs, playbackParameters.speed);
	//   66  132:aload_0         
	//   67  133:getfield        #305 <Field long playbackParametersOffsetUs>
	//   68  136:lload_1         
	//   69  137:aload_0         
	//   70  138:getfield        #298 <Field long playbackParametersPositionUs>
	//   71  141:lsub            
	//   72  142:aload_0         
	//   73  143:getfield        #226 <Field PlaybackParameters playbackParameters>
	//   74  146:getfield        #308 <Field float PlaybackParameters.speed>
	//   75  149:invokestatic    #317 <Method long Util.getMediaDurationForPlayoutDuration(long, float)>
	//   76  152:ladd            
	//   77  153:lreturn         
	}

	private AudioTrack createAudioTrackV21()
	{
		android.media.AudioAttributes audioattributes;
		if(tunneling)
	//*   0    0:aload_0         
	//*   1    1:getfield        #323 <Field boolean tunneling>
	//*   2    4:ifeq            34
			audioattributes = (new android.media.AudioAttributes.Builder()).setContentType(3).setFlags(16).setUsage(1).build();
	//    3    7:new             #325 <Class android.media.AudioAttributes$Builder>
	//    4   10:dup             
	//    5   11:invokespecial   #326 <Method void android.media.AudioAttributes$Builder()>
	//    6   14:iconst_3        
	//    7   15:invokevirtual   #330 <Method android.media.AudioAttributes$Builder android.media.AudioAttributes$Builder.setContentType(int)>
	//    8   18:bipush          16
	//    9   20:invokevirtual   #333 <Method android.media.AudioAttributes$Builder android.media.AudioAttributes$Builder.setFlags(int)>
	//   10   23:iconst_1        
	//   11   24:invokevirtual   #336 <Method android.media.AudioAttributes$Builder android.media.AudioAttributes$Builder.setUsage(int)>
	//   12   27:invokevirtual   #340 <Method android.media.AudioAttributes android.media.AudioAttributes$Builder.build()>
	//   13   30:astore_2        
		else
	//*  14   31:goto            45
			audioattributes = audioAttributes.getAudioAttributesV21();
	//   15   34:aload_0         
	//   16   35:getfield        #218 <Field AudioAttributes audioAttributes>
	//   17   38:invokevirtual   #343 <Method android.media.AudioAttributes AudioAttributes.getAudioAttributesV21()>
	//   18   41:astore_2        
	//*  19   42:goto            31
		android.media.AudioFormat audioformat = (new android.media.AudioFormat.Builder()).setChannelMask(outputChannelConfig).setEncoding(outputEncoding).setSampleRate(outputSampleRate).build();
	//   20   45:new             #345 <Class android.media.AudioFormat$Builder>
	//   21   48:dup             
	//   22   49:invokespecial   #346 <Method void android.media.AudioFormat$Builder()>
	//   23   52:aload_0         
	//   24   53:getfield        #348 <Field int outputChannelConfig>
	//   25   56:invokevirtual   #352 <Method android.media.AudioFormat$Builder android.media.AudioFormat$Builder.setChannelMask(int)>
	//   26   59:aload_0         
	//   27   60:getfield        #354 <Field int outputEncoding>
	//   28   63:invokevirtual   #357 <Method android.media.AudioFormat$Builder android.media.AudioFormat$Builder.setEncoding(int)>
	//   29   66:aload_0         
	//   30   67:getfield        #359 <Field int outputSampleRate>
	//   31   70:invokevirtual   #362 <Method android.media.AudioFormat$Builder android.media.AudioFormat$Builder.setSampleRate(int)>
	//   32   73:invokevirtual   #365 <Method android.media.AudioFormat android.media.AudioFormat$Builder.build()>
	//   33   76:astore_3        
		int i;
		if(audioSessionId != 0)
	//*  34   77:aload_0         
	//*  35   78:getfield        #220 <Field int audioSessionId>
	//*  36   81:ifeq            92
			i = audioSessionId;
	//   37   84:aload_0         
	//   38   85:getfield        #220 <Field int audioSessionId>
	//   39   88:istore_1        
		else
	//*  40   89:goto            97
			i = 0;
	//   41   92:iconst_0        
	//   42   93:istore_1        
	//*  43   94:goto            89
		return new AudioTrack(audioattributes, audioformat, bufferSize, 1, i);
	//   44   97:new             #367 <Class AudioTrack>
	//   45  100:dup             
	//   46  101:aload_2         
	//   47  102:aload_3         
	//   48  103:aload_0         
	//   49  104:getfield        #369 <Field int bufferSize>
	//   50  107:iconst_1        
	//   51  108:iload_1         
	//   52  109:invokespecial   #372 <Method void AudioTrack(android.media.AudioAttributes, android.media.AudioFormat, int, int, int)>
	//   53  112:areturn         
	}

	private boolean drainAudioProcessorsToEndOfStream()
		throws AudioSink.WriteException
	{
		if(drainingAudioProcessorIndex != -1) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #228 <Field int drainingAudioProcessorIndex>
	//    2    4:iconst_m1       
	//    3    5:icmpne          36
_L1:
		int i;
		if(processingEnabled)
	//*   4    8:aload_0         
	//*   5    9:getfield        #378 <Field boolean processingEnabled>
	//*   6   12:ifeq            20
			i = 0;
	//    7   15:iconst_0        
	//    8   16:istore_1        
		else
	//*   9   17:goto            26
			i = activeAudioProcessors.length;
	//   10   20:aload_0         
	//   11   21:getfield        #230 <Field AudioProcessor[] activeAudioProcessors>
	//   12   24:arraylength     
	//   13   25:istore_1        
		drainingAudioProcessorIndex = i;
	//   14   26:aload_0         
	//   15   27:iload_1         
	//   16   28:putfield        #228 <Field int drainingAudioProcessorIndex>
_L5:
		boolean flag = true;
	//   17   31:iconst_1        
	//   18   32:istore_1        
		  goto _L3
	//*  19   33:goto            38
_L2:
		flag = false;
	//   20   36:iconst_0        
	//   21   37:istore_1        
_L3:
		if(drainingAudioProcessorIndex >= activeAudioProcessors.length)
			break; /* Loop/switch isn't completed */
	//   22   38:aload_0         
	//   23   39:getfield        #228 <Field int drainingAudioProcessorIndex>
	//   24   42:aload_0         
	//   25   43:getfield        #230 <Field AudioProcessor[] activeAudioProcessors>
	//   26   46:arraylength     
	//   27   47:icmpge          101
		AudioProcessor audioprocessor = activeAudioProcessors[drainingAudioProcessorIndex];
	//   28   50:aload_0         
	//   29   51:getfield        #230 <Field AudioProcessor[] activeAudioProcessors>
	//   30   54:aload_0         
	//   31   55:getfield        #228 <Field int drainingAudioProcessorIndex>
	//   32   58:aaload          
	//   33   59:astore_2        
		if(flag)
	//*  34   60:iload_1         
	//*  35   61:ifeq            70
			audioprocessor.queueEndOfStream();
	//   36   64:aload_2         
	//   37   65:invokeinterface #381 <Method void AudioProcessor.queueEndOfStream()>
		processBuffers(0x1L);
	//   38   70:aload_0         
	//   39   71:ldc2w           #382 <Long 0x1L>
	//   40   74:invokespecial   #387 <Method void processBuffers(long)>
		if(!audioprocessor.isEnded())
	//*  41   77:aload_2         
	//*  42   78:invokeinterface #390 <Method boolean AudioProcessor.isEnded()>
	//*  43   83:ifne            88
			return false;
	//   44   86:iconst_0        
	//   45   87:ireturn         
		drainingAudioProcessorIndex = drainingAudioProcessorIndex + 1;
	//   46   88:aload_0         
	//   47   89:aload_0         
	//   48   90:getfield        #228 <Field int drainingAudioProcessorIndex>
	//   49   93:iconst_1        
	//   50   94:iadd            
	//   51   95:putfield        #228 <Field int drainingAudioProcessorIndex>
		if(true) goto _L5; else goto _L4
	//   52   98:goto            31
_L4:
		if(outputBuffer != null)
	//*  53  101:aload_0         
	//*  54  102:getfield        #392 <Field ByteBuffer outputBuffer>
	//*  55  105:ifnull          128
		{
			writeBuffer(outputBuffer, 0x1L);
	//   56  108:aload_0         
	//   57  109:aload_0         
	//   58  110:getfield        #392 <Field ByteBuffer outputBuffer>
	//   59  113:ldc2w           #382 <Long 0x1L>
	//   60  116:invokespecial   #396 <Method void writeBuffer(ByteBuffer, long)>
			if(outputBuffer != null)
	//*  61  119:aload_0         
	//*  62  120:getfield        #392 <Field ByteBuffer outputBuffer>
	//*  63  123:ifnull          128
				return false;
	//   64  126:iconst_0        
	//   65  127:ireturn         
		}
		drainingAudioProcessorIndex = -1;
	//   66  128:aload_0         
	//   67  129:iconst_m1       
	//   68  130:putfield        #228 <Field int drainingAudioProcessorIndex>
		return true;
	//   69  133:iconst_1        
	//   70  134:ireturn         
	}

	private long durationUsToFrames(long l)
	{
		return (l * (long)outputSampleRate) / 0xf4240L;
	//    0    0:lload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #359 <Field int outputSampleRate>
	//    3    5:i2l             
	//    4    6:lmul            
	//    5    7:ldc2w           #399 <Long 0xf4240L>
	//    6   10:ldiv            
	//    7   11:lreturn         
	}

	private void flushAudioProcessors()
	{
		for(int i = 0; i < activeAudioProcessors.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #230 <Field AudioProcessor[] activeAudioProcessors>
	//*   5    7:arraylength     
	//*   6    8:icmpge          43
		{
			AudioProcessor audioprocessor = activeAudioProcessors[i];
	//    7   11:aload_0         
	//    8   12:getfield        #230 <Field AudioProcessor[] activeAudioProcessors>
	//    9   15:iload_1         
	//   10   16:aaload          
	//   11   17:astore_2        
			audioprocessor.flush();
	//   12   18:aload_2         
	//   13   19:invokeinterface #404 <Method void AudioProcessor.flush()>
			outputBuffers[i] = audioprocessor.getOutput();
	//   14   24:aload_0         
	//   15   25:getfield        #234 <Field ByteBuffer[] outputBuffers>
	//   16   28:iload_1         
	//   17   29:aload_2         
	//   18   30:invokeinterface #408 <Method ByteBuffer AudioProcessor.getOutput()>
	//   19   35:aastore         
		}

	//   20   36:iload_1         
	//   21   37:iconst_1        
	//   22   38:iadd            
	//   23   39:istore_1        
	//*  24   40:goto            2
	//   25   43:return          
	}

	private long framesToDurationUs(long l)
	{
		return (l * 0xf4240L) / (long)outputSampleRate;
	//    0    0:lload_1         
	//    1    1:ldc2w           #399 <Long 0xf4240L>
	//    2    4:lmul            
	//    3    5:aload_0         
	//    4    6:getfield        #359 <Field int outputSampleRate>
	//    5    9:i2l             
	//    6   10:ldiv            
	//    7   11:lreturn         
	}

	private AudioProcessor[] getAvailableAudioProcessors()
	{
		if(shouldConvertHighResIntPcmToFloat)
	//*   0    0:aload_0         
	//*   1    1:getfield        #411 <Field boolean shouldConvertHighResIntPcmToFloat>
	//*   2    4:ifeq            12
			return toFloatPcmAvailableAudioProcessors;
	//    3    7:aload_0         
	//    4    8:getfield        #207 <Field AudioProcessor[] toFloatPcmAvailableAudioProcessors>
	//    5   11:areturn         
		else
			return toIntPcmAvailableAudioProcessors;
	//    6   12:aload_0         
	//    7   13:getfield        #202 <Field AudioProcessor[] toIntPcmAvailableAudioProcessors>
	//    8   16:areturn         
	}

	private static int getFramesPerEncodedSample(int i, ByteBuffer bytebuffer)
	{
		if(i != 7 && i != 8)
	//*   0    0:iload_0         
	//*   1    1:bipush          7
	//*   2    3:icmpeq          96
	//*   3    6:iload_0         
	//*   4    7:bipush          8
	//*   5    9:icmpne          15
	//*   6   12:goto            96
		{
			if(i == 5)
	//*   7   15:iload_0         
	//*   8   16:iconst_5        
	//*   9   17:icmpne          24
				return Ac3Util.getAc3SyncframeAudioSampleCount();
	//   10   20:invokestatic    #418 <Method int Ac3Util.getAc3SyncframeAudioSampleCount()>
	//   11   23:ireturn         
			if(i == 6)
	//*  12   24:iload_0         
	//*  13   25:bipush          6
	//*  14   27:icmpne          35
				return Ac3Util.parseEAc3SyncframeAudioSampleCount(bytebuffer);
	//   15   30:aload_1         
	//   16   31:invokestatic    #422 <Method int Ac3Util.parseEAc3SyncframeAudioSampleCount(ByteBuffer)>
	//   17   34:ireturn         
			if(i == 14)
	//*  18   35:iload_0         
	//*  19   36:bipush          14
	//*  20   38:icmpne          62
			{
				i = Ac3Util.findTrueHdSyncframeOffset(bytebuffer);
	//   21   41:aload_1         
	//   22   42:invokestatic    #425 <Method int Ac3Util.findTrueHdSyncframeOffset(ByteBuffer)>
	//   23   45:istore_0        
				if(i == -1)
	//*  24   46:iload_0         
	//*  25   47:iconst_m1       
	//*  26   48:icmpne          53
					return 0;
	//   27   51:iconst_0        
	//   28   52:ireturn         
				else
					return Ac3Util.parseTrueHdSyncframeAudioSampleCount(bytebuffer, i) * 16;
	//   29   53:aload_1         
	//   30   54:iload_0         
	//   31   55:invokestatic    #429 <Method int Ac3Util.parseTrueHdSyncframeAudioSampleCount(ByteBuffer, int)>
	//   32   58:bipush          16
	//   33   60:imul            
	//   34   61:ireturn         
			} else
			{
				bytebuffer = ((ByteBuffer) (new StringBuilder()));
	//   35   62:new             #431 <Class StringBuilder>
	//   36   65:dup             
	//   37   66:invokespecial   #432 <Method void StringBuilder()>
	//   38   69:astore_1        
				((StringBuilder) (bytebuffer)).append("Unexpected audio encoding: ");
	//   39   70:aload_1         
	//   40   71:ldc2            #434 <String "Unexpected audio encoding: ">
	//   41   74:invokevirtual   #438 <Method StringBuilder StringBuilder.append(String)>
	//   42   77:pop             
				((StringBuilder) (bytebuffer)).append(i);
	//   43   78:aload_1         
	//   44   79:iload_0         
	//   45   80:invokevirtual   #441 <Method StringBuilder StringBuilder.append(int)>
	//   46   83:pop             
				throw new IllegalStateException(((StringBuilder) (bytebuffer)).toString());
	//   47   84:new             #443 <Class IllegalStateException>
	//   48   87:dup             
	//   49   88:aload_1         
	//   50   89:invokevirtual   #447 <Method String StringBuilder.toString()>
	//   51   92:invokespecial   #450 <Method void IllegalStateException(String)>
	//   52   95:athrow          
			}
		} else
		{
			return DtsUtil.parseDtsAudioSampleCount(bytebuffer);
	//   53   96:aload_1         
	//   54   97:invokestatic    #455 <Method int DtsUtil.parseDtsAudioSampleCount(ByteBuffer)>
	//   55  100:ireturn         
		}
	}

	private long getSubmittedFrames()
	{
		if(isInputPcm)
	//*   0    0:aload_0         
	//*   1    1:getfield        #457 <Field boolean isInputPcm>
	//*   2    4:ifeq            18
			return submittedPcmBytes / (long)pcmFrameSize;
	//    3    7:aload_0         
	//    4    8:getfield        #459 <Field long submittedPcmBytes>
	//    5   11:aload_0         
	//    6   12:getfield        #461 <Field int pcmFrameSize>
	//    7   15:i2l             
	//    8   16:ldiv            
	//    9   17:lreturn         
		else
			return submittedEncodedFrames;
	//   10   18:aload_0         
	//   11   19:getfield        #463 <Field long submittedEncodedFrames>
	//   12   22:lreturn         
	}

	private long getWrittenFrames()
	{
		if(isInputPcm)
	//*   0    0:aload_0         
	//*   1    1:getfield        #457 <Field boolean isInputPcm>
	//*   2    4:ifeq            18
			return writtenPcmBytes / (long)outputPcmFrameSize;
	//    3    7:aload_0         
	//    4    8:getfield        #465 <Field long writtenPcmBytes>
	//    5   11:aload_0         
	//    6   12:getfield        #467 <Field int outputPcmFrameSize>
	//    7   15:i2l             
	//    8   16:ldiv            
	//    9   17:lreturn         
		else
			return writtenEncodedFrames;
	//   10   18:aload_0         
	//   11   19:getfield        #469 <Field long writtenEncodedFrames>
	//   12   22:lreturn         
	}

	private void initialize()
		throws AudioSink.InitializationException
	{
		releasingConditionVariable.block();
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field ConditionVariable releasingConditionVariable>
	//    2    4:invokevirtual   #475 <Method void ConditionVariable.block()>
		audioTrack = initializeAudioTrack();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokespecial   #478 <Method AudioTrack initializeAudioTrack()>
	//    6   12:putfield        #480 <Field AudioTrack audioTrack>
		int i = audioTrack.getAudioSessionId();
	//    7   15:aload_0         
	//    8   16:getfield        #480 <Field AudioTrack audioTrack>
	//    9   19:invokevirtual   #483 <Method int AudioTrack.getAudioSessionId()>
	//   10   22:istore_1        
		if(enablePreV21AudioSessionWorkaround && Util.SDK_INT < 21)
	//*  11   23:getstatic       #485 <Field boolean enablePreV21AudioSessionWorkaround>
	//*  12   26:ifeq            75
	//*  13   29:getstatic       #488 <Field int Util.SDK_INT>
	//*  14   32:bipush          21
	//*  15   34:icmpge          75
		{
			if(keepSessionIdAudioTrack != null && i != keepSessionIdAudioTrack.getAudioSessionId())
	//*  16   37:aload_0         
	//*  17   38:getfield        #490 <Field AudioTrack keepSessionIdAudioTrack>
	//*  18   41:ifnull          59
	//*  19   44:iload_1         
	//*  20   45:aload_0         
	//*  21   46:getfield        #490 <Field AudioTrack keepSessionIdAudioTrack>
	//*  22   49:invokevirtual   #483 <Method int AudioTrack.getAudioSessionId()>
	//*  23   52:icmpeq          59
				releaseKeepSessionIdAudioTrack();
	//   24   55:aload_0         
	//   25   56:invokespecial   #493 <Method void releaseKeepSessionIdAudioTrack()>
			if(keepSessionIdAudioTrack == null)
	//*  26   59:aload_0         
	//*  27   60:getfield        #490 <Field AudioTrack keepSessionIdAudioTrack>
	//*  28   63:ifnonnull       75
				keepSessionIdAudioTrack = initializeKeepSessionIdAudioTrack(i);
	//   29   66:aload_0         
	//   30   67:aload_0         
	//   31   68:iload_1         
	//   32   69:invokespecial   #497 <Method AudioTrack initializeKeepSessionIdAudioTrack(int)>
	//   33   72:putfield        #490 <Field AudioTrack keepSessionIdAudioTrack>
		}
		if(audioSessionId != i)
	//*  34   75:aload_0         
	//*  35   76:getfield        #220 <Field int audioSessionId>
	//*  36   79:iload_1         
	//*  37   80:icmpeq          105
		{
			audioSessionId = i;
	//   38   83:aload_0         
	//   39   84:iload_1         
	//   40   85:putfield        #220 <Field int audioSessionId>
			if(listener != null)
	//*  41   88:aload_0         
	//*  42   89:getfield        #268 <Field AudioSink$Listener listener>
	//*  43   92:ifnull          105
				listener.onAudioSessionId(i);
	//   44   95:aload_0         
	//   45   96:getfield        #268 <Field AudioSink$Listener listener>
	//   46   99:iload_1         
	//   47  100:invokeinterface #503 <Method void AudioSink$Listener.onAudioSessionId(int)>
		}
		PlaybackParameters playbackparameters;
		if(canApplyPlaybackParameters)
	//*  48  105:aload_0         
	//*  49  106:getfield        #505 <Field boolean canApplyPlaybackParameters>
	//*  50  109:ifeq            129
			playbackparameters = audioProcessorChain.applyPlaybackParameters(playbackParameters);
	//   51  112:aload_0         
	//   52  113:getfield        #144 <Field DefaultAudioSink$AudioProcessorChain audioProcessorChain>
	//   53  116:aload_0         
	//   54  117:getfield        #226 <Field PlaybackParameters playbackParameters>
	//   55  120:invokeinterface #509 <Method PlaybackParameters DefaultAudioSink$AudioProcessorChain.applyPlaybackParameters(PlaybackParameters)>
	//   56  125:astore_2        
		else
	//*  57  126:goto            133
			playbackparameters = PlaybackParameters.DEFAULT;
	//   58  129:getstatic       #224 <Field PlaybackParameters PlaybackParameters.DEFAULT>
	//   59  132:astore_2        
		playbackParameters = playbackparameters;
	//   60  133:aload_0         
	//   61  134:aload_2         
	//   62  135:putfield        #226 <Field PlaybackParameters playbackParameters>
		setupAudioProcessors();
	//   63  138:aload_0         
	//   64  139:invokespecial   #512 <Method void setupAudioProcessors()>
		audioTrackPositionTracker.setAudioTrack(audioTrack, outputEncoding, outputPcmFrameSize, bufferSize);
	//   65  142:aload_0         
	//   66  143:getfield        #163 <Field AudioTrackPositionTracker audioTrackPositionTracker>
	//   67  146:aload_0         
	//   68  147:getfield        #480 <Field AudioTrack audioTrack>
	//   69  150:aload_0         
	//   70  151:getfield        #354 <Field int outputEncoding>
	//   71  154:aload_0         
	//   72  155:getfield        #467 <Field int outputPcmFrameSize>
	//   73  158:aload_0         
	//   74  159:getfield        #369 <Field int bufferSize>
	//   75  162:invokevirtual   #516 <Method void AudioTrackPositionTracker.setAudioTrack(AudioTrack, int, int, int)>
		setVolumeInternal();
	//   76  165:aload_0         
	//   77  166:invokespecial   #519 <Method void setVolumeInternal()>
	//   78  169:return          
	}

	private AudioTrack initializeAudioTrack()
		throws AudioSink.InitializationException
	{
		AudioTrack audiotrack;
		if(Util.SDK_INT >= 21)
	//*   0    0:getstatic       #488 <Field int Util.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          16
		{
			audiotrack = createAudioTrackV21();
	//    3    8:aload_0         
	//    4    9:invokespecial   #523 <Method AudioTrack createAudioTrackV21()>
	//    5   12:astore_2        
		} else
	//*   6   13:goto            93
		{
			int i = Util.getStreamTypeForAudioUsage(audioAttributes.usage);
	//    7   16:aload_0         
	//    8   17:getfield        #218 <Field AudioAttributes audioAttributes>
	//    9   20:getfield        #526 <Field int AudioAttributes.usage>
	//   10   23:invokestatic    #530 <Method int Util.getStreamTypeForAudioUsage(int)>
	//   11   26:istore_1        
			if(audioSessionId == 0)
	//*  12   27:aload_0         
	//*  13   28:getfield        #220 <Field int audioSessionId>
	//*  14   31:ifne            63
				audiotrack = new AudioTrack(i, outputSampleRate, outputChannelConfig, outputEncoding, bufferSize, 1);
	//   15   34:new             #367 <Class AudioTrack>
	//   16   37:dup             
	//   17   38:iload_1         
	//   18   39:aload_0         
	//   19   40:getfield        #359 <Field int outputSampleRate>
	//   20   43:aload_0         
	//   21   44:getfield        #348 <Field int outputChannelConfig>
	//   22   47:aload_0         
	//   23   48:getfield        #354 <Field int outputEncoding>
	//   24   51:aload_0         
	//   25   52:getfield        #369 <Field int bufferSize>
	//   26   55:iconst_1        
	//   27   56:invokespecial   #533 <Method void AudioTrack(int, int, int, int, int, int)>
	//   28   59:astore_2        
			else
	//*  29   60:goto            93
				audiotrack = new AudioTrack(i, outputSampleRate, outputChannelConfig, outputEncoding, bufferSize, 1, audioSessionId);
	//   30   63:new             #367 <Class AudioTrack>
	//   31   66:dup             
	//   32   67:iload_1         
	//   33   68:aload_0         
	//   34   69:getfield        #359 <Field int outputSampleRate>
	//   35   72:aload_0         
	//   36   73:getfield        #348 <Field int outputChannelConfig>
	//   37   76:aload_0         
	//   38   77:getfield        #354 <Field int outputEncoding>
	//   39   80:aload_0         
	//   40   81:getfield        #369 <Field int bufferSize>
	//   41   84:iconst_1        
	//   42   85:aload_0         
	//   43   86:getfield        #220 <Field int audioSessionId>
	//   44   89:invokespecial   #536 <Method void AudioTrack(int, int, int, int, int, int, int)>
	//   45   92:astore_2        
		}
		int j = audiotrack.getState();
	//   46   93:aload_2         
	//   47   94:invokevirtual   #539 <Method int AudioTrack.getState()>
	//   48   97:istore_1        
		if(j != 1)
	//*  49   98:iload_1         
	//*  50   99:iconst_1        
	//*  51  100:icmpeq          128
		{
			try
			{
				audiotrack.release();
	//   52  103:aload_2         
	//   53  104:invokevirtual   #542 <Method void AudioTrack.release()>
			}
	//*  54  107:new             #472 <Class AudioSink$InitializationException>
	//*  55  110:dup             
	//*  56  111:iload_1         
	//*  57  112:aload_0         
	//*  58  113:getfield        #359 <Field int outputSampleRate>
	//*  59  116:aload_0         
	//*  60  117:getfield        #348 <Field int outputChannelConfig>
	//*  61  120:aload_0         
	//*  62  121:getfield        #369 <Field int bufferSize>
	//*  63  124:invokespecial   #545 <Method void AudioSink$InitializationException(int, int, int, int)>
	//*  64  127:athrow          
	//*  65  128:aload_2         
	//*  66  129:areturn         
			catch(Exception exception) { }
	//   67  130:astore_2        
			throw new AudioSink.InitializationException(j, outputSampleRate, outputChannelConfig, bufferSize);
		} else
		{
			return audiotrack;
		}
	//*  68  131:goto            107
	}

	private AudioTrack initializeKeepSessionIdAudioTrack(int i)
	{
		return new AudioTrack(3, 4000, 4, 2, 2, 0, i);
	//    0    0:new             #367 <Class AudioTrack>
	//    1    3:dup             
	//    2    4:iconst_3        
	//    3    5:sipush          4000
	//    4    8:iconst_4        
	//    5    9:iconst_2        
	//    6   10:iconst_2        
	//    7   11:iconst_0        
	//    8   12:iload_1         
	//    9   13:invokespecial   #536 <Method void AudioTrack(int, int, int, int, int, int, int)>
	//   10   16:areturn         
	}

	private long inputFramesToDurationUs(long l)
	{
		return (l * 0xf4240L) / (long)inputSampleRate;
	//    0    0:lload_1         
	//    1    1:ldc2w           #399 <Long 0xf4240L>
	//    2    4:lmul            
	//    3    5:aload_0         
	//    4    6:getfield        #548 <Field int inputSampleRate>
	//    5    9:i2l             
	//    6   10:ldiv            
	//    7   11:lreturn         
	}

	private boolean isInitialized()
	{
		return audioTrack != null;
	//    0    0:aload_0         
	//    1    1:getfield        #480 <Field AudioTrack audioTrack>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	private void processBuffers(long l)
		throws AudioSink.WriteException
	{
		int j = activeAudioProcessors.length;
	//    0    0:aload_0         
	//    1    1:getfield        #230 <Field AudioProcessor[] activeAudioProcessors>
	//    2    4:arraylength     
	//    3    5:istore          4
		int i = j;
	//    4    7:iload           4
	//    5    9:istore_3        
		do
		{
			if(i < 0)
				break;
	//    6   10:iload_3         
	//    7   11:iflt            133
			ByteBuffer bytebuffer;
			if(i > 0)
	//*   8   14:iload_3         
	//*   9   15:ifle            31
				bytebuffer = outputBuffers[i - 1];
	//   10   18:aload_0         
	//   11   19:getfield        #234 <Field ByteBuffer[] outputBuffers>
	//   12   22:iload_3         
	//   13   23:iconst_1        
	//   14   24:isub            
	//   15   25:aaload          
	//   16   26:astore          5
			else
	//*  17   28:goto            52
			if(inputBuffer != null)
	//*  18   31:aload_0         
	//*  19   32:getfield        #551 <Field ByteBuffer inputBuffer>
	//*  20   35:ifnull          47
				bytebuffer = inputBuffer;
	//   21   38:aload_0         
	//   22   39:getfield        #551 <Field ByteBuffer inputBuffer>
	//   23   42:astore          5
			else
	//*  24   44:goto            52
				bytebuffer = AudioProcessor.EMPTY_BUFFER;
	//   25   47:getstatic       #554 <Field ByteBuffer AudioProcessor.EMPTY_BUFFER>
	//   26   50:astore          5
			if(i == j)
	//*  27   52:iload_3         
	//*  28   53:iload           4
	//*  29   55:icmpne          68
			{
				writeBuffer(bytebuffer, l);
	//   30   58:aload_0         
	//   31   59:aload           5
	//   32   61:lload_1         
	//   33   62:invokespecial   #396 <Method void writeBuffer(ByteBuffer, long)>
			} else
	//*  34   65:goto            117
			{
				Object obj = ((Object) (activeAudioProcessors[i]));
	//   35   68:aload_0         
	//   36   69:getfield        #230 <Field AudioProcessor[] activeAudioProcessors>
	//   37   72:iload_3         
	//   38   73:aaload          
	//   39   74:astore          6
				((AudioProcessor) (obj)).queueInput(bytebuffer);
	//   40   76:aload           6
	//   41   78:aload           5
	//   42   80:invokeinterface #558 <Method void AudioProcessor.queueInput(ByteBuffer)>
				obj = ((Object) (((AudioProcessor) (obj)).getOutput()));
	//   43   85:aload           6
	//   44   87:invokeinterface #408 <Method ByteBuffer AudioProcessor.getOutput()>
	//   45   92:astore          6
				outputBuffers[i] = ((ByteBuffer) (obj));
	//   46   94:aload_0         
	//   47   95:getfield        #234 <Field ByteBuffer[] outputBuffers>
	//   48   98:iload_3         
	//   49   99:aload           6
	//   50  101:aastore         
				if(((ByteBuffer) (obj)).hasRemaining())
	//*  51  102:aload           6
	//*  52  104:invokevirtual   #561 <Method boolean ByteBuffer.hasRemaining()>
	//*  53  107:ifeq            117
				{
					i++;
	//   54  110:iload_3         
	//   55  111:iconst_1        
	//   56  112:iadd            
	//   57  113:istore_3        
					continue;
	//   58  114:goto            10
				}
			}
			if(bytebuffer.hasRemaining())
	//*  59  117:aload           5
	//*  60  119:invokevirtual   #561 <Method boolean ByteBuffer.hasRemaining()>
	//*  61  122:ifeq            126
				return;
	//   62  125:return          
			i--;
	//   63  126:iload_3         
	//   64  127:iconst_1        
	//   65  128:isub            
	//   66  129:istore_3        
		} while(true);
	//   67  130:goto            10
	//   68  133:return          
	}

	private void releaseKeepSessionIdAudioTrack()
	{
		if(keepSessionIdAudioTrack == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #490 <Field AudioTrack keepSessionIdAudioTrack>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			final AudioTrack toRelease = keepSessionIdAudioTrack;
	//    4    8:aload_0         
	//    5    9:getfield        #490 <Field AudioTrack keepSessionIdAudioTrack>
	//    6   12:astore_1        
			keepSessionIdAudioTrack = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #490 <Field AudioTrack keepSessionIdAudioTrack>
			((_cls2) (new Thread() {

				public void run()
				{
					toRelease.release();
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field AudioTrack val$toRelease>
				//    2    4:invokevirtual   #28  <Method void AudioTrack.release()>
				//    3    7:return          
				}

				final DefaultAudioSink this$0;
				final AudioTrack val$toRelease;

			
			{
				this$0 = DefaultAudioSink.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field DefaultAudioSink this$0>
				toRelease = audiotrack;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field AudioTrack val$toRelease>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #21  <Method void Thread()>
			//    8   14:return          
			}
			}
)).start();
	//   10   18:new             #10  <Class DefaultAudioSink$2>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokespecial   #564 <Method void DefaultAudioSink$2(DefaultAudioSink, AudioTrack)>
	//   15   27:invokevirtual   #567 <Method void DefaultAudioSink$2.start()>
			return;
	//   16   30:return          
		}
	}

	private void setVolumeInternal()
	{
		if(!isInitialized())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #569 <Method boolean isInitialized()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(Util.SDK_INT >= 21)
	//*   4    8:getstatic       #488 <Field int Util.SDK_INT>
	//*   5   11:bipush          21
	//*   6   13:icmplt          28
		{
			setVolumeInternalV21(audioTrack, volume);
	//    7   16:aload_0         
	//    8   17:getfield        #480 <Field AudioTrack audioTrack>
	//    9   20:aload_0         
	//   10   21:getfield        #209 <Field float volume>
	//   11   24:invokestatic    #573 <Method void setVolumeInternalV21(AudioTrack, float)>
			return;
	//   12   27:return          
		} else
		{
			setVolumeInternalV3(audioTrack, volume);
	//   13   28:aload_0         
	//   14   29:getfield        #480 <Field AudioTrack audioTrack>
	//   15   32:aload_0         
	//   16   33:getfield        #209 <Field float volume>
	//   17   36:invokestatic    #576 <Method void setVolumeInternalV3(AudioTrack, float)>
			return;
	//   18   39:return          
		}
	}

	private static void setVolumeInternalV21(AudioTrack audiotrack, float f)
	{
		audiotrack.setVolume(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokevirtual   #580 <Method int AudioTrack.setVolume(float)>
	//    3    5:pop             
	//    4    6:return          
	}

	private static void setVolumeInternalV3(AudioTrack audiotrack, float f)
	{
		audiotrack.setStereoVolume(f, f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_1         
	//    3    3:invokevirtual   #584 <Method int AudioTrack.setStereoVolume(float, float)>
	//    4    6:pop             
	//    5    7:return          
	}

	private void setupAudioProcessors()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #175 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #176 <Method void ArrayList()>
	//    3    7:astore_3        
		AudioProcessor aaudioprocessor[] = getAvailableAudioProcessors();
	//    4    8:aload_0         
	//    5    9:invokespecial   #586 <Method AudioProcessor[] getAvailableAudioProcessors()>
	//    6   12:astore          4
		int i = 0;
	//    7   14:iconst_0        
	//    8   15:istore_1        
		for(int j = aaudioprocessor.length; i < j; i++)
	//*   9   16:aload           4
	//*  10   18:arraylength     
	//*  11   19:istore_2        
	//*  12   20:iload_1         
	//*  13   21:iload_2         
	//*  14   22:icmpge          65
		{
			AudioProcessor audioprocessor = aaudioprocessor[i];
	//   15   25:aload           4
	//   16   27:iload_1         
	//   17   28:aaload          
	//   18   29:astore          5
			if(audioprocessor.isActive())
	//*  19   31:aload           5
	//*  20   33:invokeinterface #589 <Method boolean AudioProcessor.isActive()>
	//*  21   38:ifeq            51
				arraylist.add(((Object) (audioprocessor)));
	//   22   41:aload_3         
	//   23   42:aload           5
	//   24   44:invokevirtual   #593 <Method boolean ArrayList.add(Object)>
	//   25   47:pop             
			else
	//*  26   48:goto            58
				audioprocessor.flush();
	//   27   51:aload           5
	//   28   53:invokeinterface #404 <Method void AudioProcessor.flush()>
		}

	//   29   58:iload_1         
	//   30   59:iconst_1        
	//   31   60:iadd            
	//   32   61:istore_1        
	//*  33   62:goto            20
		i = arraylist.size();
	//   34   65:aload_3         
	//   35   66:invokevirtual   #195 <Method int ArrayList.size()>
	//   36   69:istore_1        
		activeAudioProcessors = (AudioProcessor[])arraylist.toArray(((Object []) (new AudioProcessor[i])));
	//   37   70:aload_0         
	//   38   71:aload_3         
	//   39   72:iload_1         
	//   40   73:anewarray       AudioProcessor[]
	//   41   76:invokevirtual   #199 <Method Object[] ArrayList.toArray(Object[])>
	//   42   79:checkcast       #200 <Class AudioProcessor[]>
	//   43   82:putfield        #230 <Field AudioProcessor[] activeAudioProcessors>
		outputBuffers = new ByteBuffer[i];
	//   44   85:aload_0         
	//   45   86:iload_1         
	//   46   87:anewarray       ByteBuffer[]
	//   47   90:putfield        #234 <Field ByteBuffer[] outputBuffers>
		flushAudioProcessors();
	//   48   93:aload_0         
	//   49   94:invokespecial   #595 <Method void flushAudioProcessors()>
	//   50   97:return          
	}

	private void writeBuffer(ByteBuffer bytebuffer, long l)
		throws AudioSink.WriteException
	{
		if(!bytebuffer.hasRemaining())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #561 <Method boolean ByteBuffer.hasRemaining()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		ByteBuffer bytebuffer1 = outputBuffer;
	//    4    8:aload_0         
	//    5    9:getfield        #392 <Field ByteBuffer outputBuffer>
	//    6   12:astore          9
		boolean flag2 = true;
	//    7   14:iconst_1        
	//    8   15:istore          8
		int i = 0;
	//    9   17:iconst_0        
	//   10   18:istore          4
		if(bytebuffer1 != null)
	//*  11   20:aload           9
	//*  12   22:ifnull          50
		{
			boolean flag;
			if(outputBuffer == bytebuffer)
	//*  13   25:aload_0         
	//*  14   26:getfield        #392 <Field ByteBuffer outputBuffer>
	//*  15   29:aload_1         
	//*  16   30:if_acmpne       39
				flag = true;
	//   17   33:iconst_1        
	//   18   34:istore          7
			else
	//*  19   36:goto            42
				flag = false;
	//   20   39:iconst_0        
	//   21   40:istore          7
			Assertions.checkArgument(flag);
	//   22   42:iload           7
	//   23   44:invokestatic    #598 <Method void Assertions.checkArgument(boolean)>
		} else
	//*  24   47:goto            124
		{
			outputBuffer = bytebuffer;
	//   25   50:aload_0         
	//   26   51:aload_1         
	//   27   52:putfield        #392 <Field ByteBuffer outputBuffer>
			if(Util.SDK_INT < 21)
	//*  28   55:getstatic       #488 <Field int Util.SDK_INT>
	//*  29   58:bipush          21
	//*  30   60:icmpge          124
			{
				int j = bytebuffer.remaining();
	//   31   63:aload_1         
	//   32   64:invokevirtual   #601 <Method int ByteBuffer.remaining()>
	//   33   67:istore          5
				if(preV21OutputBuffer == null || preV21OutputBuffer.length < j)
	//*  34   69:aload_0         
	//*  35   70:getfield        #603 <Field byte[] preV21OutputBuffer>
	//*  36   73:ifnull          86
	//*  37   76:aload_0         
	//*  38   77:getfield        #603 <Field byte[] preV21OutputBuffer>
	//*  39   80:arraylength     
	//*  40   81:iload           5
	//*  41   83:icmpge          94
					preV21OutputBuffer = new byte[j];
	//   42   86:aload_0         
	//   43   87:iload           5
	//   44   89:newarray        byte[]
	//   45   91:putfield        #603 <Field byte[] preV21OutputBuffer>
				int i1 = bytebuffer.position();
	//   46   94:aload_1         
	//   47   95:invokevirtual   #606 <Method int ByteBuffer.position()>
	//   48   98:istore          6
				bytebuffer.get(preV21OutputBuffer, 0, j);
	//   49  100:aload_1         
	//   50  101:aload_0         
	//   51  102:getfield        #603 <Field byte[] preV21OutputBuffer>
	//   52  105:iconst_0        
	//   53  106:iload           5
	//   54  108:invokevirtual   #610 <Method ByteBuffer ByteBuffer.get(byte[], int, int)>
	//   55  111:pop             
				bytebuffer.position(i1);
	//   56  112:aload_1         
	//   57  113:iload           6
	//   58  115:invokevirtual   #613 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   59  118:pop             
				preV21OutputBufferOffset = 0;
	//   60  119:aload_0         
	//   61  120:iconst_0        
	//   62  121:putfield        #615 <Field int preV21OutputBufferOffset>
			}
		}
		int j1 = bytebuffer.remaining();
	//   63  124:aload_1         
	//   64  125:invokevirtual   #601 <Method int ByteBuffer.remaining()>
	//   65  128:istore          6
		if(Util.SDK_INT < 21)
	//*  66  130:getstatic       #488 <Field int Util.SDK_INT>
	//*  67  133:bipush          21
	//*  68  135:icmpge          223
		{
			int k = audioTrackPositionTracker.getAvailableBufferSize(writtenPcmBytes);
	//   69  138:aload_0         
	//   70  139:getfield        #163 <Field AudioTrackPositionTracker audioTrackPositionTracker>
	//   71  142:aload_0         
	//   72  143:getfield        #465 <Field long writtenPcmBytes>
	//   73  146:invokevirtual   #619 <Method int AudioTrackPositionTracker.getAvailableBufferSize(long)>
	//   74  149:istore          5
			if(k > 0)
	//*  75  151:iload           5
	//*  76  153:ifle            282
			{
				i = Math.min(j1, k);
	//   77  156:iload           6
	//   78  158:iload           5
	//   79  160:invokestatic    #625 <Method int Math.min(int, int)>
	//   80  163:istore          4
				k = audioTrack.write(preV21OutputBuffer, preV21OutputBufferOffset, i);
	//   81  165:aload_0         
	//   82  166:getfield        #480 <Field AudioTrack audioTrack>
	//   83  169:aload_0         
	//   84  170:getfield        #603 <Field byte[] preV21OutputBuffer>
	//   85  173:aload_0         
	//   86  174:getfield        #615 <Field int preV21OutputBufferOffset>
	//   87  177:iload           4
	//   88  179:invokevirtual   #629 <Method int AudioTrack.write(byte[], int, int)>
	//   89  182:istore          5
				i = k;
	//   90  184:iload           5
	//   91  186:istore          4
				if(k > 0)
	//*  92  188:iload           5
	//*  93  190:ifle            282
				{
					preV21OutputBufferOffset = preV21OutputBufferOffset + k;
	//   94  193:aload_0         
	//   95  194:aload_0         
	//   96  195:getfield        #615 <Field int preV21OutputBufferOffset>
	//   97  198:iload           5
	//   98  200:iadd            
	//   99  201:putfield        #615 <Field int preV21OutputBufferOffset>
					bytebuffer.position(bytebuffer.position() + k);
	//  100  204:aload_1         
	//  101  205:aload_1         
	//  102  206:invokevirtual   #606 <Method int ByteBuffer.position()>
	//  103  209:iload           5
	//  104  211:iadd            
	//  105  212:invokevirtual   #613 <Method java.nio.Buffer ByteBuffer.position(int)>
	//  106  215:pop             
					i = k;
	//  107  216:iload           5
	//  108  218:istore          4
				}
			}
		} else
	//* 109  220:goto            282
		if(tunneling)
	//* 110  223:aload_0         
	//* 111  224:getfield        #323 <Field boolean tunneling>
	//* 112  227:ifeq            270
		{
			boolean flag1;
			if(l != 0x1L)
	//* 113  230:lload_2         
	//* 114  231:ldc2w           #382 <Long 0x1L>
	//* 115  234:lcmp            
	//* 116  235:ifeq            245
				flag1 = flag2;
	//  117  238:iload           8
	//  118  240:istore          7
			else
	//* 119  242:goto            248
				flag1 = false;
	//  120  245:iconst_0        
	//  121  246:istore          7
			Assertions.checkState(flag1);
	//  122  248:iload           7
	//  123  250:invokestatic    #632 <Method void Assertions.checkState(boolean)>
			i = writeNonBlockingWithAvSyncV21(audioTrack, bytebuffer, j1, l);
	//  124  253:aload_0         
	//  125  254:aload_0         
	//  126  255:getfield        #480 <Field AudioTrack audioTrack>
	//  127  258:aload_1         
	//  128  259:iload           6
	//  129  261:lload_2         
	//  130  262:invokespecial   #636 <Method int writeNonBlockingWithAvSyncV21(AudioTrack, ByteBuffer, int, long)>
	//  131  265:istore          4
		} else
	//* 132  267:goto            282
		{
			i = writeNonBlockingV21(audioTrack, bytebuffer, j1);
	//  133  270:aload_0         
	//  134  271:getfield        #480 <Field AudioTrack audioTrack>
	//  135  274:aload_1         
	//  136  275:iload           6
	//  137  277:invokestatic    #640 <Method int writeNonBlockingV21(AudioTrack, ByteBuffer, int)>
	//  138  280:istore          4
		}
		lastFeedElapsedRealtimeMs = SystemClock.elapsedRealtime();
	//  139  282:aload_0         
	//  140  283:invokestatic    #645 <Method long SystemClock.elapsedRealtime()>
	//  141  286:putfield        #253 <Field long lastFeedElapsedRealtimeMs>
		if(i < 0)
	//* 142  289:iload           4
	//* 143  291:ifge            304
			throw new AudioSink.WriteException(i);
	//  144  294:new             #376 <Class AudioSink$WriteException>
	//  145  297:dup             
	//  146  298:iload           4
	//  147  300:invokespecial   #647 <Method void AudioSink$WriteException(int)>
	//  148  303:athrow          
		if(isInputPcm)
	//* 149  304:aload_0         
	//* 150  305:getfield        #457 <Field boolean isInputPcm>
	//* 151  308:ifeq            323
			writtenPcmBytes = writtenPcmBytes + (long)i;
	//  152  311:aload_0         
	//  153  312:aload_0         
	//  154  313:getfield        #465 <Field long writtenPcmBytes>
	//  155  316:iload           4
	//  156  318:i2l             
	//  157  319:ladd            
	//  158  320:putfield        #465 <Field long writtenPcmBytes>
		if(i == j1)
	//* 159  323:iload           4
	//* 160  325:iload           6
	//* 161  327:icmpne          356
		{
			if(!isInputPcm)
	//* 162  330:aload_0         
	//* 163  331:getfield        #457 <Field boolean isInputPcm>
	//* 164  334:ifne            351
				writtenEncodedFrames = writtenEncodedFrames + (long)framesPerEncodedSample;
	//  165  337:aload_0         
	//  166  338:aload_0         
	//  167  339:getfield        #469 <Field long writtenEncodedFrames>
	//  168  342:aload_0         
	//  169  343:getfield        #649 <Field int framesPerEncodedSample>
	//  170  346:i2l             
	//  171  347:ladd            
	//  172  348:putfield        #469 <Field long writtenEncodedFrames>
			outputBuffer = null;
	//  173  351:aload_0         
	//  174  352:aconst_null     
	//  175  353:putfield        #392 <Field ByteBuffer outputBuffer>
		}
	//  176  356:return          
	}

	private static int writeNonBlockingV21(AudioTrack audiotrack, ByteBuffer bytebuffer, int i)
	{
		return audiotrack.write(bytebuffer, i, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_1        
	//    4    4:invokevirtual   #652 <Method int AudioTrack.write(ByteBuffer, int, int)>
	//    5    7:ireturn         
	}

	private int writeNonBlockingWithAvSyncV21(AudioTrack audiotrack, ByteBuffer bytebuffer, int i, long l)
	{
		if(avSyncHeader == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #654 <Field ByteBuffer avSyncHeader>
	//*   2    4:ifnonnull       38
		{
			avSyncHeader = ByteBuffer.allocate(16);
	//    3    7:aload_0         
	//    4    8:bipush          16
	//    5   10:invokestatic    #658 <Method ByteBuffer ByteBuffer.allocate(int)>
	//    6   13:putfield        #654 <Field ByteBuffer avSyncHeader>
			avSyncHeader.order(ByteOrder.BIG_ENDIAN);
	//    7   16:aload_0         
	//    8   17:getfield        #654 <Field ByteBuffer avSyncHeader>
	//    9   20:getstatic       #664 <Field ByteOrder ByteOrder.BIG_ENDIAN>
	//   10   23:invokevirtual   #668 <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   11   26:pop             
			avSyncHeader.putInt(0x55550001);
	//   12   27:aload_0         
	//   13   28:getfield        #654 <Field ByteBuffer avSyncHeader>
	//   14   31:ldc2            #669 <Int 0x55550001>
	//   15   34:invokevirtual   #672 <Method ByteBuffer ByteBuffer.putInt(int)>
	//   16   37:pop             
		}
		if(bytesUntilNextAvSync == 0)
	//*  17   38:aload_0         
	//*  18   39:getfield        #674 <Field int bytesUntilNextAvSync>
	//*  19   42:ifne            85
		{
			avSyncHeader.putInt(4, i);
	//   20   45:aload_0         
	//   21   46:getfield        #654 <Field ByteBuffer avSyncHeader>
	//   22   49:iconst_4        
	//   23   50:iload_3         
	//   24   51:invokevirtual   #677 <Method ByteBuffer ByteBuffer.putInt(int, int)>
	//   25   54:pop             
			avSyncHeader.putLong(8, l * 1000L);
	//   26   55:aload_0         
	//   27   56:getfield        #654 <Field ByteBuffer avSyncHeader>
	//   28   59:bipush          8
	//   29   61:lload           4
	//   30   63:ldc2w           #678 <Long 1000L>
	//   31   66:lmul            
	//   32   67:invokevirtual   #683 <Method ByteBuffer ByteBuffer.putLong(int, long)>
	//   33   70:pop             
			avSyncHeader.position(0);
	//   34   71:aload_0         
	//   35   72:getfield        #654 <Field ByteBuffer avSyncHeader>
	//   36   75:iconst_0        
	//   37   76:invokevirtual   #613 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   38   79:pop             
			bytesUntilNextAvSync = i;
	//   39   80:aload_0         
	//   40   81:iload_3         
	//   41   82:putfield        #674 <Field int bytesUntilNextAvSync>
		}
		int j = avSyncHeader.remaining();
	//   42   85:aload_0         
	//   43   86:getfield        #654 <Field ByteBuffer avSyncHeader>
	//   44   89:invokevirtual   #601 <Method int ByteBuffer.remaining()>
	//   45   92:istore          6
		if(j > 0)
	//*  46   94:iload           6
	//*  47   96:ifle            134
		{
			int k = audiotrack.write(avSyncHeader, j, 1);
	//   48   99:aload_1         
	//   49  100:aload_0         
	//   50  101:getfield        #654 <Field ByteBuffer avSyncHeader>
	//   51  104:iload           6
	//   52  106:iconst_1        
	//   53  107:invokevirtual   #652 <Method int AudioTrack.write(ByteBuffer, int, int)>
	//   54  110:istore          7
			if(k < 0)
	//*  55  112:iload           7
	//*  56  114:ifge            125
			{
				bytesUntilNextAvSync = 0;
	//   57  117:aload_0         
	//   58  118:iconst_0        
	//   59  119:putfield        #674 <Field int bytesUntilNextAvSync>
				return k;
	//   60  122:iload           7
	//   61  124:ireturn         
			}
			if(k < j)
	//*  62  125:iload           7
	//*  63  127:iload           6
	//*  64  129:icmpge          134
				return 0;
	//   65  132:iconst_0        
	//   66  133:ireturn         
		}
		i = writeNonBlockingV21(audiotrack, bytebuffer, i);
	//   67  134:aload_1         
	//   68  135:aload_2         
	//   69  136:iload_3         
	//   70  137:invokestatic    #640 <Method int writeNonBlockingV21(AudioTrack, ByteBuffer, int)>
	//   71  140:istore_3        
		if(i < 0)
	//*  72  141:iload_3         
	//*  73  142:ifge            152
		{
			bytesUntilNextAvSync = 0;
	//   74  145:aload_0         
	//   75  146:iconst_0        
	//   76  147:putfield        #674 <Field int bytesUntilNextAvSync>
			return i;
	//   77  150:iload_3         
	//   78  151:ireturn         
		} else
		{
			bytesUntilNextAvSync = bytesUntilNextAvSync - i;
	//   79  152:aload_0         
	//   80  153:aload_0         
	//   81  154:getfield        #674 <Field int bytesUntilNextAvSync>
	//   82  157:iload_3         
	//   83  158:isub            
	//   84  159:putfield        #674 <Field int bytesUntilNextAvSync>
			return i;
	//   85  162:iload_3         
	//   86  163:ireturn         
		}
	}

	public void configure(int i, int j, int k, int l, int ai[], int i1, int j1)
		throws AudioSink.ConfigurationException
	{
		int k1;
		byte byte1;
		boolean flag;
		boolean flag4;
label0:
		{
			inputSampleRate = k;
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:putfield        #548 <Field int inputSampleRate>
			isInputPcm = Util.isEncodingPcm(i);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokestatic    #693 <Method boolean Util.isEncodingPcm(int)>
	//    6   10:putfield        #457 <Field boolean isInputPcm>
			flag = enableConvertHighResIntPcmToFloat;
	//    7   13:aload_0         
	//    8   14:getfield        #146 <Field boolean enableConvertHighResIntPcmToFloat>
	//    9   17:istore          12
			flag4 = true;
	//   10   19:iconst_1        
	//   11   20:istore          14
			if(flag && isEncodingSupported(0x40000000) && Util.isEncodingHighResolutionIntegerPcm(i))
	//*  12   22:iload           12
	//*  13   24:ifeq            50
	//*  14   27:aload_0         
	//*  15   28:ldc2            #694 <Int 0x40000000>
	//*  16   31:invokevirtual   #697 <Method boolean isEncodingSupported(int)>
	//*  17   34:ifeq            50
	//*  18   37:iload_1         
	//*  19   38:invokestatic    #700 <Method boolean Util.isEncodingHighResolutionIntegerPcm(int)>
	//*  20   41:ifeq            50
				flag = true;
	//   21   44:iconst_1        
	//   22   45:istore          12
			else
	//*  23   47:goto            53
				flag = false;
	//   24   50:iconst_0        
	//   25   51:istore          12
			shouldConvertHighResIntPcmToFloat = flag;
	//   26   53:aload_0         
	//   27   54:iload           12
	//   28   56:putfield        #411 <Field boolean shouldConvertHighResIntPcmToFloat>
			if(isInputPcm)
	//*  29   59:aload_0         
	//*  30   60:getfield        #457 <Field boolean isInputPcm>
	//*  31   63:ifeq            75
				pcmFrameSize = Util.getPcmFrameSize(i, j);
	//   32   66:aload_0         
	//   33   67:iload_1         
	//   34   68:iload_2         
	//   35   69:invokestatic    #703 <Method int Util.getPcmFrameSize(int, int)>
	//   36   72:putfield        #461 <Field int pcmFrameSize>
			flag = isInputPcm;
	//   37   75:aload_0         
	//   38   76:getfield        #457 <Field boolean isInputPcm>
	//   39   79:istore          12
			byte byte0 = 4;
	//   40   81:iconst_4        
	//   41   82:istore          9
			if(flag && i != 4)
	//*  42   84:iload           12
	//*  43   86:ifeq            100
	//*  44   89:iload_1         
	//*  45   90:iconst_4        
	//*  46   91:icmpeq          100
				flag = true;
	//   47   94:iconst_1        
	//   48   95:istore          12
			else
	//*  49   97:goto            103
				flag = false;
	//   50  100:iconst_0        
	//   51  101:istore          12
			boolean flag2;
			if(flag && !shouldConvertHighResIntPcmToFloat)
	//*  52  103:iload           12
	//*  53  105:ifeq            121
	//*  54  108:aload_0         
	//*  55  109:getfield        #411 <Field boolean shouldConvertHighResIntPcmToFloat>
	//*  56  112:ifne            121
				flag2 = true;
	//   57  115:iconst_1        
	//   58  116:istore          13
			else
	//*  59  118:goto            124
				flag2 = false;
	//   60  121:iconst_0        
	//   61  122:istore          13
			canApplyPlaybackParameters = flag2;
	//   62  124:aload_0         
	//   63  125:iload           13
	//   64  127:putfield        #505 <Field boolean canApplyPlaybackParameters>
			if(flag)
	//*  65  130:iload           12
	//*  66  132:ifeq            276
			{
				trimmingAudioProcessor.setTrimFrameCount(i1, j1);
	//   67  135:aload_0         
	//   68  136:getfield        #173 <Field TrimmingAudioProcessor trimmingAudioProcessor>
	//   69  139:iload           6
	//   70  141:iload           7
	//   71  143:invokevirtual   #707 <Method void TrimmingAudioProcessor.setTrimFrameCount(int, int)>
				channelMappingAudioProcessor.setChannelMap(ai);
	//   72  146:aload_0         
	//   73  147:getfield        #168 <Field ChannelMappingAudioProcessor channelMappingAudioProcessor>
	//   74  150:aload           5
	//   75  152:invokevirtual   #711 <Method void ChannelMappingAudioProcessor.setChannelMap(int[])>
				ai = ((int []) (getAvailableAudioProcessors()));
	//   76  155:aload_0         
	//   77  156:invokespecial   #586 <Method AudioProcessor[] getAvailableAudioProcessors()>
	//   78  159:astore          5
				k1 = ai.length;
	//   79  161:aload           5
	//   80  163:arraylength     
	//   81  164:istore          8
				i1 = i;
	//   82  166:iload_1         
	//   83  167:istore          6
				i = k;
	//   84  169:iload_3         
	//   85  170:istore_1        
				j1 = 0;
	//   86  171:iconst_0        
	//   87  172:istore          7
				k = j1;
	//   88  174:iload           7
	//   89  176:istore_3        
				while(j1 < k1) 
	//*  90  177:iload           7
	//*  91  179:iload           8
	//*  92  181:icmpge          265
				{
					int l1 = ai[j1];
	//   93  184:aload           5
	//   94  186:iload           7
	//   95  188:aaload          
	//   96  189:astore          15
					boolean flag3;
					try
					{
						flag3 = ((AudioProcessor) (l1)).configure(i, j, i1);
	//   97  191:aload           15
	//   98  193:iload_1         
	//   99  194:iload_2         
	//  100  195:iload           6
	//  101  197:invokeinterface #714 <Method boolean AudioProcessor.configure(int, int, int)>
	//  102  202:istore          13
					}
	//* 103  204:iload_3         
	//* 104  205:iload           13
	//* 105  207:ior             
	//* 106  208:istore_3        
	//* 107  209:aload           15
	//* 108  211:invokeinterface #589 <Method boolean AudioProcessor.isActive()>
	//* 109  216:ifeq            244
	//* 110  219:aload           15
	//* 111  221:invokeinterface #717 <Method int AudioProcessor.getOutputChannelCount()>
	//* 112  226:istore_2        
	//* 113  227:aload           15
	//* 114  229:invokeinterface #720 <Method int AudioProcessor.getOutputSampleRateHz()>
	//* 115  234:istore_1        
	//* 116  235:aload           15
	//* 117  237:invokeinterface #723 <Method int AudioProcessor.getOutputEncoding()>
	//* 118  242:istore          6
	//* 119  244:iload           7
	//* 120  246:iconst_1        
	//* 121  247:iadd            
	//* 122  248:istore          7
	//* 123  250:goto            177
					// Misplaced declaration of an exception variable
					catch(int ai[])
	//* 124  253:astore          5
					{
						throw new AudioSink.ConfigurationException(((Throwable) (ai)));
	//  125  255:new             #687 <Class AudioSink$ConfigurationException>
	//  126  258:dup             
	//  127  259:aload           5
	//  128  261:invokespecial   #726 <Method void AudioSink$ConfigurationException(Throwable)>
	//  129  264:athrow          
					}
					k |= ((int) (flag3));
					if(((AudioProcessor) (l1)).isActive())
					{
						j = ((AudioProcessor) (l1)).getOutputChannelCount();
						i = ((AudioProcessor) (l1)).getOutputSampleRateHz();
						i1 = ((AudioProcessor) (l1)).getOutputEncoding();
					}
					j1++;
				}
				j1 = j;
	//  130  265:iload_2         
	//  131  266:istore          7
				k1 = k;
	//  132  268:iload_3         
	//  133  269:istore          8
				k = i;
	//  134  271:iload_1         
	//  135  272:istore_3        
			} else
	//* 136  273:goto            285
			{
				k1 = 0;
	//  137  276:iconst_0        
	//  138  277:istore          8
				j1 = j;
	//  139  279:iload_2         
	//  140  280:istore          7
				i1 = i;
	//  141  282:iload_1         
	//  142  283:istore          6
			}
			byte1 = 12;
	//  143  285:bipush          12
	//  144  287:istore          10
			char c = '\374';
	//  145  289:sipush          252
	//  146  292:istore          11
			i = ((int) (byte0));
	//  147  294:iload           9
	//  148  296:istore_1        
			switch(j1)
	//* 149  297:iload           7
			{
	//* 150  299:tableswitch     1 8: default 344
	//	               1 427
	//	               2 424
	//	               3 418
	//	               4 411
	//	               5 404
	//	               6 397
	//	               7 390
	//	               8 383
			default:
				ai = ((int []) (new StringBuilder()));
	//  151  344:new             #431 <Class StringBuilder>
	//  152  347:dup             
	//  153  348:invokespecial   #432 <Method void StringBuilder()>
	//  154  351:astore          5
				((StringBuilder) (ai)).append("Unsupported channel count: ");
	//  155  353:aload           5
	//  156  355:ldc2            #728 <String "Unsupported channel count: ">
	//  157  358:invokevirtual   #438 <Method StringBuilder StringBuilder.append(String)>
	//  158  361:pop             
				((StringBuilder) (ai)).append(j1);
	//  159  362:aload           5
	//  160  364:iload           7
	//  161  366:invokevirtual   #441 <Method StringBuilder StringBuilder.append(int)>
	//  162  369:pop             
				throw new AudioSink.ConfigurationException(((StringBuilder) (ai)).toString());
	//  163  370:new             #687 <Class AudioSink$ConfigurationException>
	//  164  373:dup             
	//  165  374:aload           5
	//  166  376:invokevirtual   #447 <Method String StringBuilder.toString()>
	//  167  379:invokespecial   #729 <Method void AudioSink$ConfigurationException(String)>
	//  168  382:athrow          

			case 8: // '\b'
				i = C.CHANNEL_OUT_7POINT1_SURROUND;
	//  169  383:getstatic       #734 <Field int C.CHANNEL_OUT_7POINT1_SURROUND>
	//  170  386:istore_1        
				break;

	//* 171  387:goto            427
			case 7: // '\007'
				i = 1276;
	//  172  390:sipush          1276
	//  173  393:istore_1        
				break;

	//* 174  394:goto            427
			case 6: // '\006'
				i = 252;
	//  175  397:sipush          252
	//  176  400:istore_1        
				break;

	//* 177  401:goto            427
			case 5: // '\005'
				i = 220;
	//  178  404:sipush          220
	//  179  407:istore_1        
				break;

	//* 180  408:goto            427
			case 4: // '\004'
				i = 204;
	//  181  411:sipush          204
	//  182  414:istore_1        
				break;

	//* 183  415:goto            427
			case 3: // '\003'
				i = 28;
	//  184  418:bipush          28
	//  185  420:istore_1        
				break;

	//* 186  421:goto            427
			case 2: // '\002'
				i = 12;
	//  187  424:bipush          12
	//  188  426:istore_1        
				break;

			case 1: // '\001'
				break;
			}
			if(Util.SDK_INT <= 23 && "foster".equals(((Object) (Util.DEVICE))) && "NVIDIA".equals(((Object) (Util.MANUFACTURER))))
	//* 189  427:getstatic       #488 <Field int Util.SDK_INT>
	//* 190  430:bipush          23
	//* 191  432:icmpgt          494
	//* 192  435:ldc2            #736 <String "foster">
	//* 193  438:getstatic       #739 <Field String Util.DEVICE>
	//* 194  441:invokevirtual   #744 <Method boolean String.equals(Object)>
	//* 195  444:ifeq            494
	//* 196  447:ldc2            #746 <String "NVIDIA">
	//* 197  450:getstatic       #749 <Field String Util.MANUFACTURER>
	//* 198  453:invokevirtual   #744 <Method boolean String.equals(Object)>
	//* 199  456:ifeq            494
			{
				j = ((int) (c));
	//  200  459:iload           11
	//  201  461:istore_2        
				if(j1 == 3)
					break label0;
	//  202  462:iload           7
	//  203  464:iconst_3        
	//  204  465:icmpeq          496
				j = ((int) (c));
	//  205  468:iload           11
	//  206  470:istore_2        
				if(j1 == 5)
					break label0;
	//  207  471:iload           7
	//  208  473:iconst_5        
	//  209  474:icmpeq          496
				if(j1 == 7)
	//* 210  477:iload           7
	//* 211  479:bipush          7
	//* 212  481:icmpeq          487
	//* 213  484:goto            494
				{
					j = C.CHANNEL_OUT_7POINT1_SURROUND;
	//  214  487:getstatic       #734 <Field int C.CHANNEL_OUT_7POINT1_SURROUND>
	//  215  490:istore_2        
					break label0;
	//  216  491:goto            496
				}
			}
			j = i;
	//  217  494:iload_1         
	//  218  495:istore_2        
		}
		if(Util.SDK_INT <= 25 && "fugu".equals(((Object) (Util.DEVICE))) && !isInputPcm && j1 == 1)
	//* 219  496:getstatic       #488 <Field int Util.SDK_INT>
	//* 220  499:bipush          25
	//* 221  501:icmpgt          535
	//* 222  504:ldc2            #751 <String "fugu">
	//* 223  507:getstatic       #739 <Field String Util.DEVICE>
	//* 224  510:invokevirtual   #744 <Method boolean String.equals(Object)>
	//* 225  513:ifeq            535
	//* 226  516:aload_0         
	//* 227  517:getfield        #457 <Field boolean isInputPcm>
	//* 228  520:ifne            535
	//* 229  523:iload           7
	//* 230  525:iconst_1        
	//* 231  526:icmpne          535
			i = ((int) (byte1));
	//  232  529:iload           10
	//  233  531:istore_1        
		else
	//* 234  532:goto            537
			i = j;
	//  235  535:iload_2         
	//  236  536:istore_1        
		if(k1 == 0 && isInitialized() && outputEncoding == i1 && outputSampleRate == k && outputChannelConfig == i)
	//* 237  537:iload           8
	//* 238  539:ifne            575
	//* 239  542:aload_0         
	//* 240  543:invokespecial   #569 <Method boolean isInitialized()>
	//* 241  546:ifeq            575
	//* 242  549:aload_0         
	//* 243  550:getfield        #354 <Field int outputEncoding>
	//* 244  553:iload           6
	//* 245  555:icmpne          575
	//* 246  558:aload_0         
	//* 247  559:getfield        #359 <Field int outputSampleRate>
	//* 248  562:iload_3         
	//* 249  563:icmpne          575
	//* 250  566:aload_0         
	//* 251  567:getfield        #348 <Field int outputChannelConfig>
	//* 252  570:iload_1         
	//* 253  571:icmpne          575
			return;
	//  254  574:return          
		reset();
	//  255  575:aload_0         
	//  256  576:invokevirtual   #754 <Method void reset()>
		processingEnabled = flag;
	//  257  579:aload_0         
	//  258  580:iload           12
	//  259  582:putfield        #378 <Field boolean processingEnabled>
		outputSampleRate = k;
	//  260  585:aload_0         
	//  261  586:iload_3         
	//  262  587:putfield        #359 <Field int outputSampleRate>
		outputChannelConfig = i;
	//  263  590:aload_0         
	//  264  591:iload_1         
	//  265  592:putfield        #348 <Field int outputChannelConfig>
		outputEncoding = i1;
	//  266  595:aload_0         
	//  267  596:iload           6
	//  268  598:putfield        #354 <Field int outputEncoding>
		if(isInputPcm)
	//* 269  601:aload_0         
	//* 270  602:getfield        #457 <Field boolean isInputPcm>
	//* 271  605:ifeq            621
			j = Util.getPcmFrameSize(outputEncoding, j1);
	//  272  608:aload_0         
	//  273  609:getfield        #354 <Field int outputEncoding>
	//  274  612:iload           7
	//  275  614:invokestatic    #703 <Method int Util.getPcmFrameSize(int, int)>
	//  276  617:istore_2        
		else
	//* 277  618:goto            623
			j = -1;
	//  278  621:iconst_m1       
	//  279  622:istore_2        
		outputPcmFrameSize = j;
	//  280  623:aload_0         
	//  281  624:iload_2         
	//  282  625:putfield        #467 <Field int outputPcmFrameSize>
		if(l != 0)
	//* 283  628:iload           4
	//* 284  630:ifeq            640
		{
			bufferSize = l;
	//  285  633:aload_0         
	//  286  634:iload           4
	//  287  636:putfield        #369 <Field int bufferSize>
			return;
	//  288  639:return          
		}
		if(isInputPcm)
	//* 289  640:aload_0         
	//* 290  641:getfield        #457 <Field boolean isInputPcm>
	//* 291  644:ifeq            721
		{
			i = AudioTrack.getMinBufferSize(k, i, outputEncoding);
	//  292  647:iload_3         
	//  293  648:iload_1         
	//  294  649:aload_0         
	//  295  650:getfield        #354 <Field int outputEncoding>
	//  296  653:invokestatic    #758 <Method int AudioTrack.getMinBufferSize(int, int, int)>
	//  297  656:istore_1        
			boolean flag1;
			if(i != -2)
	//* 298  657:iload_1         
	//* 299  658:bipush          -2
	//* 300  660:icmpeq          670
				flag1 = flag4;
	//  301  663:iload           14
	//  302  665:istore          12
			else
	//* 303  667:goto            673
				flag1 = false;
	//  304  670:iconst_0        
	//  305  671:istore          12
			Assertions.checkState(flag1);
	//  306  673:iload           12
	//  307  675:invokestatic    #632 <Method void Assertions.checkState(boolean)>
			bufferSize = Util.constrainValue(i * 4, (int)durationUsToFrames(0x3d090L) * outputPcmFrameSize, (int)Math.max(i, durationUsToFrames(0xb71b0L) * (long)outputPcmFrameSize));
	//  308  678:aload_0         
	//  309  679:iload_1         
	//  310  680:iconst_4        
	//  311  681:imul            
	//  312  682:aload_0         
	//  313  683:ldc2w           #36  <Long 0x3d090L>
	//  314  686:invokespecial   #760 <Method long durationUsToFrames(long)>
	//  315  689:l2i             
	//  316  690:aload_0         
	//  317  691:getfield        #467 <Field int outputPcmFrameSize>
	//  318  694:imul            
	//  319  695:iload_1         
	//  320  696:i2l             
	//  321  697:aload_0         
	//  322  698:ldc2w           #33  <Long 0xb71b0L>
	//  323  701:invokespecial   #760 <Method long durationUsToFrames(long)>
	//  324  704:aload_0         
	//  325  705:getfield        #467 <Field int outputPcmFrameSize>
	//  326  708:i2l             
	//  327  709:lmul            
	//  328  710:invokestatic    #764 <Method long Math.max(long, long)>
	//  329  713:l2i             
	//  330  714:invokestatic    #767 <Method int Util.constrainValue(int, int, int)>
	//  331  717:putfield        #369 <Field int bufferSize>
			return;
	//  332  720:return          
		}
		if(outputEncoding != 5 && outputEncoding != 6)
	//* 333  721:aload_0         
	//* 334  722:getfield        #354 <Field int outputEncoding>
	//* 335  725:iconst_5        
	//* 336  726:icmpeq          766
	//* 337  729:aload_0         
	//* 338  730:getfield        #354 <Field int outputEncoding>
	//* 339  733:bipush          6
	//* 340  735:icmpne          741
	//* 341  738:goto            766
		{
			if(outputEncoding == 7)
	//* 342  741:aload_0         
	//* 343  742:getfield        #354 <Field int outputEncoding>
	//* 344  745:bipush          7
	//* 345  747:icmpne          758
			{
				bufferSize = 49152;
	//  346  750:aload_0         
	//  347  751:ldc2            #768 <Int 49152>
	//  348  754:putfield        #369 <Field int bufferSize>
				return;
	//  349  757:return          
			} else
			{
				bufferSize = 0x48000;
	//  350  758:aload_0         
	//  351  759:ldc2            #769 <Int 0x48000>
	//  352  762:putfield        #369 <Field int bufferSize>
				return;
	//  353  765:return          
			}
		} else
		{
			bufferSize = 20480;
	//  354  766:aload_0         
	//  355  767:sipush          20480
	//  356  770:putfield        #369 <Field int bufferSize>
			return;
	//  357  773:return          
		}
	}

	public void disableTunneling()
	{
		if(tunneling)
	//*   0    0:aload_0         
	//*   1    1:getfield        #323 <Field boolean tunneling>
	//*   2    4:ifeq            21
		{
			tunneling = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #323 <Field boolean tunneling>
			audioSessionId = 0;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #220 <Field int audioSessionId>
			reset();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #754 <Method void reset()>
		}
	//   11   21:return          
	}

	public void enableTunnelingV21(int i)
	{
		boolean flag;
		if(Util.SDK_INT >= 21)
	//*   0    0:getstatic       #488 <Field int Util.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			flag = true;
	//    3    8:iconst_1        
	//    4    9:istore_2        
		else
	//*   5   10:goto            15
			flag = false;
	//    6   13:iconst_0        
	//    7   14:istore_2        
		Assertions.checkState(flag);
	//    8   15:iload_2         
	//    9   16:invokestatic    #632 <Method void Assertions.checkState(boolean)>
		if(!tunneling || audioSessionId != i)
	//*  10   19:aload_0         
	//*  11   20:getfield        #323 <Field boolean tunneling>
	//*  12   23:ifeq            34
	//*  13   26:aload_0         
	//*  14   27:getfield        #220 <Field int audioSessionId>
	//*  15   30:iload_1         
	//*  16   31:icmpeq          48
		{
			tunneling = true;
	//   17   34:aload_0         
	//   18   35:iconst_1        
	//   19   36:putfield        #323 <Field boolean tunneling>
			audioSessionId = i;
	//   20   39:aload_0         
	//   21   40:iload_1         
	//   22   41:putfield        #220 <Field int audioSessionId>
			reset();
	//   23   44:aload_0         
	//   24   45:invokevirtual   #754 <Method void reset()>
		}
	//   25   48:return          
	}

	public long getCurrentPositionUs(boolean flag)
	{
		if(isInitialized() && startMediaTimeState != 0)
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #569 <Method boolean isInitialized()>
	//*   2    4:ifeq            52
	//*   3    7:aload_0         
	//*   4    8:getfield        #211 <Field int startMediaTimeState>
	//*   5   11:ifne            17
	//*   6   14:goto            52
		{
			long l = Math.min(audioTrackPositionTracker.getCurrentPositionUs(flag), framesToDurationUs(getWrittenFrames()));
	//    7   17:aload_0         
	//    8   18:getfield        #163 <Field AudioTrackPositionTracker audioTrackPositionTracker>
	//    9   21:iload_1         
	//   10   22:invokevirtual   #775 <Method long AudioTrackPositionTracker.getCurrentPositionUs(boolean)>
	//   11   25:aload_0         
	//   12   26:aload_0         
	//   13   27:invokespecial   #264 <Method long getWrittenFrames()>
	//   14   30:invokespecial   #276 <Method long framesToDurationUs(long)>
	//   15   33:invokestatic    #777 <Method long Math.min(long, long)>
	//   16   36:lstore_2        
			return startMediaTimeUs + applySkipping(applySpeedup(l));
	//   17   37:aload_0         
	//   18   38:getfield        #303 <Field long startMediaTimeUs>
	//   19   41:aload_0         
	//   20   42:aload_0         
	//   21   43:lload_2         
	//   22   44:invokespecial   #779 <Method long applySpeedup(long)>
	//   23   47:invokespecial   #781 <Method long applySkipping(long)>
	//   24   50:ladd            
	//   25   51:lreturn         
		} else
		{
			return 0x0L;
	//   26   52:ldc2w           #782 <Long 0x0L>
	//   27   55:lreturn         
		}
	}

	public PlaybackParameters getPlaybackParameters()
	{
		return playbackParameters;
	//    0    0:aload_0         
	//    1    1:getfield        #226 <Field PlaybackParameters playbackParameters>
	//    2    4:areturn         
	}

	public boolean handleBuffer(ByteBuffer bytebuffer, long l)
		throws AudioSink.InitializationException, AudioSink.WriteException
	{
		boolean flag;
		if(inputBuffer != null && bytebuffer != inputBuffer)
	//*   0    0:aload_0         
	//*   1    1:getfield        #551 <Field ByteBuffer inputBuffer>
	//*   2    4:ifnull          24
	//*   3    7:aload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #551 <Field ByteBuffer inputBuffer>
	//*   6   12:if_acmpne       18
	//*   7   15:goto            24
			flag = false;
	//    8   18:iconst_0        
	//    9   19:istore          6
		else
	//*  10   21:goto            27
			flag = true;
	//   11   24:iconst_1        
	//   12   25:istore          6
		Assertions.checkArgument(flag);
	//   13   27:iload           6
	//   14   29:invokestatic    #598 <Method void Assertions.checkArgument(boolean)>
		if(!isInitialized())
	//*  15   32:aload_0         
	//*  16   33:invokespecial   #569 <Method boolean isInitialized()>
	//*  17   36:ifne            54
		{
			initialize();
	//   18   39:aload_0         
	//   19   40:invokespecial   #789 <Method void initialize()>
			if(playing)
	//*  20   43:aload_0         
	//*  21   44:getfield        #791 <Field boolean playing>
	//*  22   47:ifeq            54
				play();
	//   23   50:aload_0         
	//   24   51:invokevirtual   #794 <Method void play()>
		}
		if(!audioTrackPositionTracker.mayHandleBuffer(getWrittenFrames()))
	//*  25   54:aload_0         
	//*  26   55:getfield        #163 <Field AudioTrackPositionTracker audioTrackPositionTracker>
	//*  27   58:aload_0         
	//*  28   59:invokespecial   #264 <Method long getWrittenFrames()>
	//*  29   62:invokevirtual   #798 <Method boolean AudioTrackPositionTracker.mayHandleBuffer(long)>
	//*  30   65:ifne            70
			return false;
	//   31   68:iconst_0        
	//   32   69:ireturn         
		if(inputBuffer == null)
	//*  33   70:aload_0         
	//*  34   71:getfield        #551 <Field ByteBuffer inputBuffer>
	//*  35   74:ifnonnull       409
		{
			if(!bytebuffer.hasRemaining())
	//*  36   77:aload_1         
	//*  37   78:invokevirtual   #561 <Method boolean ByteBuffer.hasRemaining()>
	//*  38   81:ifne            86
				return true;
	//   39   84:iconst_1        
	//   40   85:ireturn         
			if(!isInputPcm && framesPerEncodedSample == 0)
	//*  41   86:aload_0         
	//*  42   87:getfield        #457 <Field boolean isInputPcm>
	//*  43   90:ifne            121
	//*  44   93:aload_0         
	//*  45   94:getfield        #649 <Field int framesPerEncodedSample>
	//*  46   97:ifne            121
			{
				framesPerEncodedSample = getFramesPerEncodedSample(outputEncoding, bytebuffer);
	//   47  100:aload_0         
	//   48  101:aload_0         
	//   49  102:getfield        #354 <Field int outputEncoding>
	//   50  105:aload_1         
	//   51  106:invokestatic    #800 <Method int getFramesPerEncodedSample(int, ByteBuffer)>
	//   52  109:putfield        #649 <Field int framesPerEncodedSample>
				if(framesPerEncodedSample == 0)
	//*  53  112:aload_0         
	//*  54  113:getfield        #649 <Field int framesPerEncodedSample>
	//*  55  116:ifne            121
					return true;
	//   56  119:iconst_1        
	//   57  120:ireturn         
			}
			if(afterDrainPlaybackParameters != null)
	//*  58  121:aload_0         
	//*  59  122:getfield        #802 <Field PlaybackParameters afterDrainPlaybackParameters>
	//*  60  125:ifnull          196
			{
				if(!drainAudioProcessorsToEndOfStream())
	//*  61  128:aload_0         
	//*  62  129:invokespecial   #804 <Method boolean drainAudioProcessorsToEndOfStream()>
	//*  63  132:ifne            137
					return false;
	//   64  135:iconst_0        
	//   65  136:ireturn         
				PlaybackParameters playbackparameters = afterDrainPlaybackParameters;
	//   66  137:aload_0         
	//   67  138:getfield        #802 <Field PlaybackParameters afterDrainPlaybackParameters>
	//   68  141:astore          7
				afterDrainPlaybackParameters = null;
	//   69  143:aload_0         
	//   70  144:aconst_null     
	//   71  145:putfield        #802 <Field PlaybackParameters afterDrainPlaybackParameters>
				playbackparameters = audioProcessorChain.applyPlaybackParameters(playbackparameters);
	//   72  148:aload_0         
	//   73  149:getfield        #144 <Field DefaultAudioSink$AudioProcessorChain audioProcessorChain>
	//   74  152:aload           7
	//   75  154:invokeinterface #509 <Method PlaybackParameters DefaultAudioSink$AudioProcessorChain.applyPlaybackParameters(PlaybackParameters)>
	//   76  159:astore          7
				playbackParametersCheckpoints.add(((Object) (new PlaybackParametersCheckpoint(playbackparameters, Math.max(0L, l), framesToDurationUs(getWrittenFrames())))));
	//   77  161:aload_0         
	//   78  162:getfield        #239 <Field ArrayDeque playbackParametersCheckpoints>
	//   79  165:new             #21  <Class DefaultAudioSink$PlaybackParametersCheckpoint>
	//   80  168:dup             
	//   81  169:aload           7
	//   82  171:lconst_0        
	//   83  172:lload_2         
	//   84  173:invokestatic    #764 <Method long Math.max(long, long)>
	//   85  176:aload_0         
	//   86  177:aload_0         
	//   87  178:invokespecial   #264 <Method long getWrittenFrames()>
	//   88  181:invokespecial   #276 <Method long framesToDurationUs(long)>
	//   89  184:aconst_null     
	//   90  185:invokespecial   #807 <Method void DefaultAudioSink$PlaybackParametersCheckpoint(PlaybackParameters, long, long, DefaultAudioSink$1)>
	//   91  188:invokevirtual   #808 <Method boolean ArrayDeque.add(Object)>
	//   92  191:pop             
				setupAudioProcessors();
	//   93  192:aload_0         
	//   94  193:invokespecial   #512 <Method void setupAudioProcessors()>
			}
			if(startMediaTimeState == 0)
	//*  95  196:aload_0         
	//*  96  197:getfield        #211 <Field int startMediaTimeState>
	//*  97  200:ifne            220
			{
				startMediaTimeUs = Math.max(0L, l);
	//   98  203:aload_0         
	//   99  204:lconst_0        
	//  100  205:lload_2         
	//  101  206:invokestatic    #764 <Method long Math.max(long, long)>
	//  102  209:putfield        #303 <Field long startMediaTimeUs>
				startMediaTimeState = 1;
	//  103  212:aload_0         
	//  104  213:iconst_1        
	//  105  214:putfield        #211 <Field int startMediaTimeState>
			} else
	//* 106  217:goto            366
			{
				long l1 = startMediaTimeUs + inputFramesToDurationUs(getSubmittedFrames());
	//  107  220:aload_0         
	//  108  221:getfield        #303 <Field long startMediaTimeUs>
	//  109  224:aload_0         
	//  110  225:aload_0         
	//  111  226:invokespecial   #260 <Method long getSubmittedFrames()>
	//  112  229:invokespecial   #810 <Method long inputFramesToDurationUs(long)>
	//  113  232:ladd            
	//  114  233:lstore          4
				if(startMediaTimeState == 1 && Math.abs(l1 - l) > 0x30d40L)
	//* 115  235:aload_0         
	//* 116  236:getfield        #211 <Field int startMediaTimeState>
	//* 117  239:iconst_1        
	//* 118  240:icmpne          324
	//* 119  243:lload           4
	//* 120  245:lload_2         
	//* 121  246:lsub            
	//* 122  247:invokestatic    #813 <Method long Math.abs(long)>
	//* 123  250:ldc2w           #814 <Long 0x30d40L>
	//* 124  253:lcmp            
	//* 125  254:ifle            324
				{
					StringBuilder stringbuilder = new StringBuilder();
	//  126  257:new             #431 <Class StringBuilder>
	//  127  260:dup             
	//  128  261:invokespecial   #432 <Method void StringBuilder()>
	//  129  264:astore          7
					stringbuilder.append("Discontinuity detected [expected ");
	//  130  266:aload           7
	//  131  268:ldc2            #817 <String "Discontinuity detected [expected ">
	//  132  271:invokevirtual   #438 <Method StringBuilder StringBuilder.append(String)>
	//  133  274:pop             
					stringbuilder.append(l1);
	//  134  275:aload           7
	//  135  277:lload           4
	//  136  279:invokevirtual   #820 <Method StringBuilder StringBuilder.append(long)>
	//  137  282:pop             
					stringbuilder.append(", got ");
	//  138  283:aload           7
	//  139  285:ldc2            #822 <String ", got ">
	//  140  288:invokevirtual   #438 <Method StringBuilder StringBuilder.append(String)>
	//  141  291:pop             
					stringbuilder.append(l);
	//  142  292:aload           7
	//  143  294:lload_2         
	//  144  295:invokevirtual   #820 <Method StringBuilder StringBuilder.append(long)>
	//  145  298:pop             
					stringbuilder.append("]");
	//  146  299:aload           7
	//  147  301:ldc2            #824 <String "]">
	//  148  304:invokevirtual   #438 <Method StringBuilder StringBuilder.append(String)>
	//  149  307:pop             
					Log.e("AudioTrack", stringbuilder.toString());
	//  150  308:ldc1            #51  <String "AudioTrack">
	//  151  310:aload           7
	//  152  312:invokevirtual   #447 <Method String StringBuilder.toString()>
	//  153  315:invokestatic    #830 <Method int Log.e(String, String)>
	//  154  318:pop             
					startMediaTimeState = 2;
	//  155  319:aload_0         
	//  156  320:iconst_2        
	//  157  321:putfield        #211 <Field int startMediaTimeState>
				}
				if(startMediaTimeState == 2)
	//* 158  324:aload_0         
	//* 159  325:getfield        #211 <Field int startMediaTimeState>
	//* 160  328:iconst_2        
	//* 161  329:icmpne          366
				{
					startMediaTimeUs = startMediaTimeUs + (l - l1);
	//  162  332:aload_0         
	//  163  333:aload_0         
	//  164  334:getfield        #303 <Field long startMediaTimeUs>
	//  165  337:lload_2         
	//  166  338:lload           4
	//  167  340:lsub            
	//  168  341:ladd            
	//  169  342:putfield        #303 <Field long startMediaTimeUs>
					startMediaTimeState = 1;
	//  170  345:aload_0         
	//  171  346:iconst_1        
	//  172  347:putfield        #211 <Field int startMediaTimeState>
					if(listener != null)
	//* 173  350:aload_0         
	//* 174  351:getfield        #268 <Field AudioSink$Listener listener>
	//* 175  354:ifnull          366
						listener.onPositionDiscontinuity();
	//  176  357:aload_0         
	//  177  358:getfield        #268 <Field AudioSink$Listener listener>
	//  178  361:invokeinterface #833 <Method void AudioSink$Listener.onPositionDiscontinuity()>
				}
			}
			if(isInputPcm)
	//* 179  366:aload_0         
	//* 180  367:getfield        #457 <Field boolean isInputPcm>
	//* 181  370:ifeq            390
				submittedPcmBytes = submittedPcmBytes + (long)bytebuffer.remaining();
	//  182  373:aload_0         
	//  183  374:aload_0         
	//  184  375:getfield        #459 <Field long submittedPcmBytes>
	//  185  378:aload_1         
	//  186  379:invokevirtual   #601 <Method int ByteBuffer.remaining()>
	//  187  382:i2l             
	//  188  383:ladd            
	//  189  384:putfield        #459 <Field long submittedPcmBytes>
			else
	//* 190  387:goto            404
				submittedEncodedFrames = submittedEncodedFrames + (long)framesPerEncodedSample;
	//  191  390:aload_0         
	//  192  391:aload_0         
	//  193  392:getfield        #463 <Field long submittedEncodedFrames>
	//  194  395:aload_0         
	//  195  396:getfield        #649 <Field int framesPerEncodedSample>
	//  196  399:i2l             
	//  197  400:ladd            
	//  198  401:putfield        #463 <Field long submittedEncodedFrames>
			inputBuffer = bytebuffer;
	//  199  404:aload_0         
	//  200  405:aload_1         
	//  201  406:putfield        #551 <Field ByteBuffer inputBuffer>
		}
		if(processingEnabled)
	//* 202  409:aload_0         
	//* 203  410:getfield        #378 <Field boolean processingEnabled>
	//* 204  413:ifeq            424
			processBuffers(l);
	//  205  416:aload_0         
	//  206  417:lload_2         
	//  207  418:invokespecial   #387 <Method void processBuffers(long)>
		else
	//* 208  421:goto            433
			writeBuffer(inputBuffer, l);
	//  209  424:aload_0         
	//  210  425:aload_0         
	//  211  426:getfield        #551 <Field ByteBuffer inputBuffer>
	//  212  429:lload_2         
	//  213  430:invokespecial   #396 <Method void writeBuffer(ByteBuffer, long)>
		if(!inputBuffer.hasRemaining())
	//* 214  433:aload_0         
	//* 215  434:getfield        #551 <Field ByteBuffer inputBuffer>
	//* 216  437:invokevirtual   #561 <Method boolean ByteBuffer.hasRemaining()>
	//* 217  440:ifne            450
		{
			inputBuffer = null;
	//  218  443:aload_0         
	//  219  444:aconst_null     
	//  220  445:putfield        #551 <Field ByteBuffer inputBuffer>
			return true;
	//  221  448:iconst_1        
	//  222  449:ireturn         
		}
		if(audioTrackPositionTracker.isStalled(getWrittenFrames()))
	//* 223  450:aload_0         
	//* 224  451:getfield        #163 <Field AudioTrackPositionTracker audioTrackPositionTracker>
	//* 225  454:aload_0         
	//* 226  455:invokespecial   #264 <Method long getWrittenFrames()>
	//* 227  458:invokevirtual   #836 <Method boolean AudioTrackPositionTracker.isStalled(long)>
	//* 228  461:ifeq            479
		{
			Log.w("AudioTrack", "Resetting stalled audio track");
	//  229  464:ldc1            #51  <String "AudioTrack">
	//  230  466:ldc2            #838 <String "Resetting stalled audio track">
	//  231  469:invokestatic    #841 <Method int Log.w(String, String)>
	//  232  472:pop             
			reset();
	//  233  473:aload_0         
	//  234  474:invokevirtual   #754 <Method void reset()>
			return true;
	//  235  477:iconst_1        
	//  236  478:ireturn         
		} else
		{
			return false;
	//  237  479:iconst_0        
	//  238  480:ireturn         
		}
	}

	public void handleDiscontinuity()
	{
		if(startMediaTimeState == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #211 <Field int startMediaTimeState>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          13
			startMediaTimeState = 2;
	//    4    8:aload_0         
	//    5    9:iconst_2        
	//    6   10:putfield        #211 <Field int startMediaTimeState>
	//    7   13:return          
	}

	public boolean hasPendingData()
	{
		return isInitialized() && audioTrackPositionTracker.hasPendingData(getWrittenFrames());
	//    0    0:aload_0         
	//    1    1:invokespecial   #569 <Method boolean isInitialized()>
	//    2    4:ifeq            23
	//    3    7:aload_0         
	//    4    8:getfield        #163 <Field AudioTrackPositionTracker audioTrackPositionTracker>
	//    5   11:aload_0         
	//    6   12:invokespecial   #264 <Method long getWrittenFrames()>
	//    7   15:invokevirtual   #845 <Method boolean AudioTrackPositionTracker.hasPendingData(long)>
	//    8   18:ifeq            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	public boolean isEncodingSupported(int i)
	{
		boolean flag1 = Util.isEncodingPcm(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #693 <Method boolean Util.isEncodingPcm(int)>
	//    2    4:istore_3        
		boolean flag = true;
	//    3    5:iconst_1        
	//    4    6:istore_2        
		if(flag1)
	//*   5    7:iload_3         
	//*   6    8:ifeq            30
		{
			if(i == 4)
	//*   7   11:iload_1         
	//*   8   12:iconst_4        
	//*   9   13:icmpne          28
			{
				if(Util.SDK_INT >= 21)
	//*  10   16:getstatic       #488 <Field int Util.SDK_INT>
	//*  11   19:bipush          21
	//*  12   21:icmplt          26
					return true;
	//   13   24:iconst_1        
	//   14   25:ireturn         
				flag = false;
	//   15   26:iconst_0        
	//   16   27:istore_2        
			}
			return flag;
	//   17   28:iload_2         
	//   18   29:ireturn         
		}
		return audioCapabilities != null && audioCapabilities.supportsEncoding(i);
	//   19   30:aload_0         
	//   20   31:getfield        #136 <Field AudioCapabilities audioCapabilities>
	//   21   34:ifnull          50
	//   22   37:aload_0         
	//   23   38:getfield        #136 <Field AudioCapabilities audioCapabilities>
	//   24   41:iload_1         
	//   25   42:invokevirtual   #850 <Method boolean AudioCapabilities.supportsEncoding(int)>
	//   26   45:ifeq            50
	//   27   48:iconst_1        
	//   28   49:ireturn         
	//   29   50:iconst_0        
	//   30   51:ireturn         
	}

	public boolean isEnded()
	{
		return !isInitialized() || handledEndOfStream && !hasPendingData();
	//    0    0:aload_0         
	//    1    1:invokespecial   #569 <Method boolean isInitialized()>
	//    2    4:ifeq            26
	//    3    7:aload_0         
	//    4    8:getfield        #852 <Field boolean handledEndOfStream>
	//    5   11:ifeq            24
	//    6   14:aload_0         
	//    7   15:invokevirtual   #854 <Method boolean hasPendingData()>
	//    8   18:ifne            24
	//    9   21:goto            26
	//   10   24:iconst_0        
	//   11   25:ireturn         
	//   12   26:iconst_1        
	//   13   27:ireturn         
	}

	public void pause()
	{
		playing = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #791 <Field boolean playing>
		if(isInitialized() && audioTrackPositionTracker.pause())
	//*   3    5:aload_0         
	//*   4    6:invokespecial   #569 <Method boolean isInitialized()>
	//*   5    9:ifeq            29
	//*   6   12:aload_0         
	//*   7   13:getfield        #163 <Field AudioTrackPositionTracker audioTrackPositionTracker>
	//*   8   16:invokevirtual   #857 <Method boolean AudioTrackPositionTracker.pause()>
	//*   9   19:ifeq            29
			audioTrack.pause();
	//   10   22:aload_0         
	//   11   23:getfield        #480 <Field AudioTrack audioTrack>
	//   12   26:invokevirtual   #859 <Method void AudioTrack.pause()>
	//   13   29:return          
	}

	public void play()
	{
		playing = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #791 <Field boolean playing>
		if(isInitialized())
	//*   3    5:aload_0         
	//*   4    6:invokespecial   #569 <Method boolean isInitialized()>
	//*   5    9:ifeq            26
		{
			audioTrackPositionTracker.start();
	//    6   12:aload_0         
	//    7   13:getfield        #163 <Field AudioTrackPositionTracker audioTrackPositionTracker>
	//    8   16:invokevirtual   #860 <Method void AudioTrackPositionTracker.start()>
			audioTrack.play();
	//    9   19:aload_0         
	//   10   20:getfield        #480 <Field AudioTrack audioTrack>
	//   11   23:invokevirtual   #861 <Method void AudioTrack.play()>
		}
	//   12   26:return          
	}

	public void playToEndOfStream()
		throws AudioSink.WriteException
	{
		if(!handledEndOfStream)
	//*   0    0:aload_0         
	//*   1    1:getfield        #852 <Field boolean handledEndOfStream>
	//*   2    4:ifne            51
		{
			if(!isInitialized())
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #569 <Method boolean isInitialized()>
	//*   5   11:ifne            15
				return;
	//    6   14:return          
			if(drainAudioProcessorsToEndOfStream())
	//*   7   15:aload_0         
	//*   8   16:invokespecial   #804 <Method boolean drainAudioProcessorsToEndOfStream()>
	//*   9   19:ifeq            50
			{
				audioTrackPositionTracker.handleEndOfStream(getWrittenFrames());
	//   10   22:aload_0         
	//   11   23:getfield        #163 <Field AudioTrackPositionTracker audioTrackPositionTracker>
	//   12   26:aload_0         
	//   13   27:invokespecial   #264 <Method long getWrittenFrames()>
	//   14   30:invokevirtual   #865 <Method void AudioTrackPositionTracker.handleEndOfStream(long)>
				audioTrack.stop();
	//   15   33:aload_0         
	//   16   34:getfield        #480 <Field AudioTrack audioTrack>
	//   17   37:invokevirtual   #868 <Method void AudioTrack.stop()>
				bytesUntilNextAvSync = 0;
	//   18   40:aload_0         
	//   19   41:iconst_0        
	//   20   42:putfield        #674 <Field int bytesUntilNextAvSync>
				handledEndOfStream = true;
	//   21   45:aload_0         
	//   22   46:iconst_1        
	//   23   47:putfield        #852 <Field boolean handledEndOfStream>
			}
			return;
	//   24   50:return          
		} else
		{
			return;
	//   25   51:return          
		}
	}

	public void release()
	{
		reset();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #754 <Method void reset()>
		releaseKeepSessionIdAudioTrack();
	//    2    4:aload_0         
	//    3    5:invokespecial   #493 <Method void releaseKeepSessionIdAudioTrack()>
		AudioProcessor aaudioprocessor[] = toIntPcmAvailableAudioProcessors;
	//    4    8:aload_0         
	//    5    9:getfield        #202 <Field AudioProcessor[] toIntPcmAvailableAudioProcessors>
	//    6   12:astore_3        
		int k = aaudioprocessor.length;
	//    7   13:aload_3         
	//    8   14:arraylength     
	//    9   15:istore_2        
		for(int i = 0; i < k; i++)
	//*  10   16:iconst_0        
	//*  11   17:istore_1        
	//*  12   18:iload_1         
	//*  13   19:iload_2         
	//*  14   20:icmpge          38
			aaudioprocessor[i].reset();
	//   15   23:aload_3         
	//   16   24:iload_1         
	//   17   25:aaload          
	//   18   26:invokeinterface #869 <Method void AudioProcessor.reset()>

	//   19   31:iload_1         
	//   20   32:iconst_1        
	//   21   33:iadd            
	//   22   34:istore_1        
	//*  23   35:goto            18
		aaudioprocessor = toFloatPcmAvailableAudioProcessors;
	//   24   38:aload_0         
	//   25   39:getfield        #207 <Field AudioProcessor[] toFloatPcmAvailableAudioProcessors>
	//   26   42:astore_3        
		k = aaudioprocessor.length;
	//   27   43:aload_3         
	//   28   44:arraylength     
	//   29   45:istore_2        
		for(int j = 0; j < k; j++)
	//*  30   46:iconst_0        
	//*  31   47:istore_1        
	//*  32   48:iload_1         
	//*  33   49:iload_2         
	//*  34   50:icmpge          68
			aaudioprocessor[j].reset();
	//   35   53:aload_3         
	//   36   54:iload_1         
	//   37   55:aaload          
	//   38   56:invokeinterface #869 <Method void AudioProcessor.reset()>

	//   39   61:iload_1         
	//   40   62:iconst_1        
	//   41   63:iadd            
	//   42   64:istore_1        
	//*  43   65:goto            48
		audioSessionId = 0;
	//   44   68:aload_0         
	//   45   69:iconst_0        
	//   46   70:putfield        #220 <Field int audioSessionId>
		playing = false;
	//   47   73:aload_0         
	//   48   74:iconst_0        
	//   49   75:putfield        #791 <Field boolean playing>
	//   50   78:return          
	}

	public void reset()
	{
		if(isInitialized())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #569 <Method boolean isInitialized()>
	//*   2    4:ifeq            191
		{
			submittedPcmBytes = 0L;
	//    3    7:aload_0         
	//    4    8:lconst_0        
	//    5    9:putfield        #459 <Field long submittedPcmBytes>
			submittedEncodedFrames = 0L;
	//    6   12:aload_0         
	//    7   13:lconst_0        
	//    8   14:putfield        #463 <Field long submittedEncodedFrames>
			writtenPcmBytes = 0L;
	//    9   17:aload_0         
	//   10   18:lconst_0        
	//   11   19:putfield        #465 <Field long writtenPcmBytes>
			writtenEncodedFrames = 0L;
	//   12   22:aload_0         
	//   13   23:lconst_0        
	//   14   24:putfield        #469 <Field long writtenEncodedFrames>
			framesPerEncodedSample = 0;
	//   15   27:aload_0         
	//   16   28:iconst_0        
	//   17   29:putfield        #649 <Field int framesPerEncodedSample>
			if(afterDrainPlaybackParameters != null)
	//*  18   32:aload_0         
	//*  19   33:getfield        #802 <Field PlaybackParameters afterDrainPlaybackParameters>
	//*  20   36:ifnull          55
			{
				playbackParameters = afterDrainPlaybackParameters;
	//   21   39:aload_0         
	//   22   40:aload_0         
	//   23   41:getfield        #802 <Field PlaybackParameters afterDrainPlaybackParameters>
	//   24   44:putfield        #226 <Field PlaybackParameters playbackParameters>
				afterDrainPlaybackParameters = null;
	//   25   47:aload_0         
	//   26   48:aconst_null     
	//   27   49:putfield        #802 <Field PlaybackParameters afterDrainPlaybackParameters>
			} else
	//*  28   52:goto            82
			if(!playbackParametersCheckpoints.isEmpty())
	//*  29   55:aload_0         
	//*  30   56:getfield        #239 <Field ArrayDeque playbackParametersCheckpoints>
	//*  31   59:invokevirtual   #281 <Method boolean ArrayDeque.isEmpty()>
	//*  32   62:ifne            82
				playbackParameters = ((PlaybackParametersCheckpoint)playbackParametersCheckpoints.getLast()).playbackParameters;
	//   33   65:aload_0         
	//   34   66:aload_0         
	//   35   67:getfield        #239 <Field ArrayDeque playbackParametersCheckpoints>
	//   36   70:invokevirtual   #872 <Method Object ArrayDeque.getLast()>
	//   37   73:checkcast       #21  <Class DefaultAudioSink$PlaybackParametersCheckpoint>
	//   38   76:invokestatic    #296 <Method PlaybackParameters DefaultAudioSink$PlaybackParametersCheckpoint.access$200(DefaultAudioSink$PlaybackParametersCheckpoint)>
	//   39   79:putfield        #226 <Field PlaybackParameters playbackParameters>
			playbackParametersCheckpoints.clear();
	//   40   82:aload_0         
	//   41   83:getfield        #239 <Field ArrayDeque playbackParametersCheckpoints>
	//   42   86:invokevirtual   #875 <Method void ArrayDeque.clear()>
			playbackParametersOffsetUs = 0L;
	//   43   89:aload_0         
	//   44   90:lconst_0        
	//   45   91:putfield        #305 <Field long playbackParametersOffsetUs>
			playbackParametersPositionUs = 0L;
	//   46   94:aload_0         
	//   47   95:lconst_0        
	//   48   96:putfield        #298 <Field long playbackParametersPositionUs>
			inputBuffer = null;
	//   49   99:aload_0         
	//   50  100:aconst_null     
	//   51  101:putfield        #551 <Field ByteBuffer inputBuffer>
			outputBuffer = null;
	//   52  104:aload_0         
	//   53  105:aconst_null     
	//   54  106:putfield        #392 <Field ByteBuffer outputBuffer>
			flushAudioProcessors();
	//   55  109:aload_0         
	//   56  110:invokespecial   #595 <Method void flushAudioProcessors()>
			handledEndOfStream = false;
	//   57  113:aload_0         
	//   58  114:iconst_0        
	//   59  115:putfield        #852 <Field boolean handledEndOfStream>
			drainingAudioProcessorIndex = -1;
	//   60  118:aload_0         
	//   61  119:iconst_m1       
	//   62  120:putfield        #228 <Field int drainingAudioProcessorIndex>
			avSyncHeader = null;
	//   63  123:aload_0         
	//   64  124:aconst_null     
	//   65  125:putfield        #654 <Field ByteBuffer avSyncHeader>
			bytesUntilNextAvSync = 0;
	//   66  128:aload_0         
	//   67  129:iconst_0        
	//   68  130:putfield        #674 <Field int bytesUntilNextAvSync>
			startMediaTimeState = 0;
	//   69  133:aload_0         
	//   70  134:iconst_0        
	//   71  135:putfield        #211 <Field int startMediaTimeState>
			if(audioTrackPositionTracker.isPlaying())
	//*  72  138:aload_0         
	//*  73  139:getfield        #163 <Field AudioTrackPositionTracker audioTrackPositionTracker>
	//*  74  142:invokevirtual   #878 <Method boolean AudioTrackPositionTracker.isPlaying()>
	//*  75  145:ifeq            155
				audioTrack.pause();
	//   76  148:aload_0         
	//   77  149:getfield        #480 <Field AudioTrack audioTrack>
	//   78  152:invokevirtual   #859 <Method void AudioTrack.pause()>
			final AudioTrack toRelease = audioTrack;
	//   79  155:aload_0         
	//   80  156:getfield        #480 <Field AudioTrack audioTrack>
	//   81  159:astore_1        
			audioTrack = null;
	//   82  160:aload_0         
	//   83  161:aconst_null     
	//   84  162:putfield        #480 <Field AudioTrack audioTrack>
			audioTrackPositionTracker.reset();
	//   85  165:aload_0         
	//   86  166:getfield        #163 <Field AudioTrackPositionTracker audioTrackPositionTracker>
	//   87  169:invokevirtual   #879 <Method void AudioTrackPositionTracker.reset()>
			releasingConditionVariable.close();
	//   88  172:aload_0         
	//   89  173:getfield        #153 <Field ConditionVariable releasingConditionVariable>
	//   90  176:invokevirtual   #882 <Method void ConditionVariable.close()>
			((_cls1) (new Thread() {

				public void run()
				{
					toRelease.flush();
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field AudioTrack val$toRelease>
				//    2    4:invokevirtual   #28  <Method void AudioTrack.flush()>
					toRelease.release();
				//    3    7:aload_0         
				//    4    8:getfield        #19  <Field AudioTrack val$toRelease>
				//    5   11:invokevirtual   #31  <Method void AudioTrack.release()>
					releasingConditionVariable.open();
				//    6   14:aload_0         
				//    7   15:getfield        #17  <Field DefaultAudioSink this$0>
				//    8   18:invokestatic    #35  <Method ConditionVariable DefaultAudioSink.access$300(DefaultAudioSink)>
				//    9   21:invokevirtual   #40  <Method void ConditionVariable.open()>
					return;
				//   10   24:return          
					Exception exception;
					exception;
				//   11   25:astore_1        
					releasingConditionVariable.open();
				//   12   26:aload_0         
				//   13   27:getfield        #17  <Field DefaultAudioSink this$0>
				//   14   30:invokestatic    #35  <Method ConditionVariable DefaultAudioSink.access$300(DefaultAudioSink)>
				//   15   33:invokevirtual   #40  <Method void ConditionVariable.open()>
					throw exception;
				//   16   36:aload_1         
				//   17   37:athrow          
				}

				final DefaultAudioSink this$0;
				final AudioTrack val$toRelease;

			
			{
				this$0 = DefaultAudioSink.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field DefaultAudioSink this$0>
				toRelease = audiotrack;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field AudioTrack val$toRelease>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #21  <Method void Thread()>
			//    8   14:return          
			}
			}
)).start();
	//   91  179:new             #8   <Class DefaultAudioSink$1>
	//   92  182:dup             
	//   93  183:aload_0         
	//   94  184:aload_1         
	//   95  185:invokespecial   #883 <Method void DefaultAudioSink$1(DefaultAudioSink, AudioTrack)>
	//   96  188:invokevirtual   #884 <Method void DefaultAudioSink$1.start()>
		}
	//   97  191:return          
	}

	public void setAudioAttributes(AudioAttributes audioattributes)
	{
		if(audioAttributes.equals(((Object) (audioattributes))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #218 <Field AudioAttributes audioAttributes>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #887 <Method boolean AudioAttributes.equals(Object)>
	//*   4    8:ifeq            12
			return;
	//    5   11:return          
		audioAttributes = audioattributes;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #218 <Field AudioAttributes audioAttributes>
		if(tunneling)
	//*   9   17:aload_0         
	//*  10   18:getfield        #323 <Field boolean tunneling>
	//*  11   21:ifeq            25
		{
			return;
	//   12   24:return          
		} else
		{
			reset();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #754 <Method void reset()>
			audioSessionId = 0;
	//   15   29:aload_0         
	//   16   30:iconst_0        
	//   17   31:putfield        #220 <Field int audioSessionId>
			return;
	//   18   34:return          
		}
	}

	public void setAudioSessionId(int i)
	{
		if(audioSessionId != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #220 <Field int audioSessionId>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			audioSessionId = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #220 <Field int audioSessionId>
			reset();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #754 <Method void reset()>
		}
	//    9   17:return          
	}

	public void setListener(AudioSink.Listener listener1)
	{
		listener = listener1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #268 <Field AudioSink$Listener listener>
	//    3    5:return          
	}

	public PlaybackParameters setPlaybackParameters(PlaybackParameters playbackparameters)
	{
		if(isInitialized() && !canApplyPlaybackParameters)
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #569 <Method boolean isInitialized()>
	//*   2    4:ifeq            26
	//*   3    7:aload_0         
	//*   4    8:getfield        #505 <Field boolean canApplyPlaybackParameters>
	//*   5   11:ifne            26
		{
			playbackParameters = PlaybackParameters.DEFAULT;
	//    6   14:aload_0         
	//    7   15:getstatic       #224 <Field PlaybackParameters PlaybackParameters.DEFAULT>
	//    8   18:putfield        #226 <Field PlaybackParameters playbackParameters>
			return playbackParameters;
	//    9   21:aload_0         
	//   10   22:getfield        #226 <Field PlaybackParameters playbackParameters>
	//   11   25:areturn         
		}
		PlaybackParameters playbackparameters1;
		if(afterDrainPlaybackParameters != null)
	//*  12   26:aload_0         
	//*  13   27:getfield        #802 <Field PlaybackParameters afterDrainPlaybackParameters>
	//*  14   30:ifnull          41
			playbackparameters1 = afterDrainPlaybackParameters;
	//   15   33:aload_0         
	//   16   34:getfield        #802 <Field PlaybackParameters afterDrainPlaybackParameters>
	//   17   37:astore_2        
		else
	//*  18   38:goto            73
		if(!playbackParametersCheckpoints.isEmpty())
	//*  19   41:aload_0         
	//*  20   42:getfield        #239 <Field ArrayDeque playbackParametersCheckpoints>
	//*  21   45:invokevirtual   #281 <Method boolean ArrayDeque.isEmpty()>
	//*  22   48:ifne            68
			playbackparameters1 = ((PlaybackParametersCheckpoint)playbackParametersCheckpoints.getLast()).playbackParameters;
	//   23   51:aload_0         
	//   24   52:getfield        #239 <Field ArrayDeque playbackParametersCheckpoints>
	//   25   55:invokevirtual   #872 <Method Object ArrayDeque.getLast()>
	//   26   58:checkcast       #21  <Class DefaultAudioSink$PlaybackParametersCheckpoint>
	//   27   61:invokestatic    #296 <Method PlaybackParameters DefaultAudioSink$PlaybackParametersCheckpoint.access$200(DefaultAudioSink$PlaybackParametersCheckpoint)>
	//   28   64:astore_2        
		else
	//*  29   65:goto            73
			playbackparameters1 = playbackParameters;
	//   30   68:aload_0         
	//   31   69:getfield        #226 <Field PlaybackParameters playbackParameters>
	//   32   72:astore_2        
		if(!playbackparameters.equals(((Object) (playbackparameters1))))
	//*  33   73:aload_1         
	//*  34   74:aload_2         
	//*  35   75:invokevirtual   #892 <Method boolean PlaybackParameters.equals(Object)>
	//*  36   78:ifne            110
			if(isInitialized())
	//*  37   81:aload_0         
	//*  38   82:invokespecial   #569 <Method boolean isInitialized()>
	//*  39   85:ifeq            96
				afterDrainPlaybackParameters = playbackparameters;
	//   40   88:aload_0         
	//   41   89:aload_1         
	//   42   90:putfield        #802 <Field PlaybackParameters afterDrainPlaybackParameters>
			else
	//*  43   93:goto            110
				playbackParameters = audioProcessorChain.applyPlaybackParameters(playbackparameters);
	//   44   96:aload_0         
	//   45   97:aload_0         
	//   46   98:getfield        #144 <Field DefaultAudioSink$AudioProcessorChain audioProcessorChain>
	//   47  101:aload_1         
	//   48  102:invokeinterface #509 <Method PlaybackParameters DefaultAudioSink$AudioProcessorChain.applyPlaybackParameters(PlaybackParameters)>
	//   49  107:putfield        #226 <Field PlaybackParameters playbackParameters>
		return playbackParameters;
	//   50  110:aload_0         
	//   51  111:getfield        #226 <Field PlaybackParameters playbackParameters>
	//   52  114:areturn         
	}

	public void setVolume(float f)
	{
		if(volume != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #209 <Field float volume>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			volume = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #209 <Field float volume>
			setVolumeInternal();
	//    8   14:aload_0         
	//    9   15:invokespecial   #519 <Method void setVolumeInternal()>
		}
	//   10   18:return          
	}

	private static final int BUFFER_MULTIPLICATION_FACTOR = 4;
	private static final int ERROR_BAD_VALUE = -2;
	private static final long MAX_BUFFER_DURATION_US = 0xb71b0L;
	private static final long MIN_BUFFER_DURATION_US = 0x3d090L;
	private static final int MODE_STATIC = 0;
	private static final int MODE_STREAM = 1;
	private static final long PASSTHROUGH_BUFFER_DURATION_US = 0x3d090L;
	private static final int START_IN_SYNC = 1;
	private static final int START_NEED_SYNC = 2;
	private static final int START_NOT_SET = 0;
	private static final int STATE_INITIALIZED = 1;
	private static final String TAG = "AudioTrack";
	private static final int WRITE_NON_BLOCKING = 1;
	public static boolean enablePreV21AudioSessionWorkaround = false;
	public static boolean failOnSpuriousAudioTimestamp = false;
	private AudioProcessor activeAudioProcessors[];
	private PlaybackParameters afterDrainPlaybackParameters;
	private AudioAttributes audioAttributes;
	private final AudioCapabilities audioCapabilities;
	private final AudioProcessorChain audioProcessorChain;
	private int audioSessionId;
	private AudioTrack audioTrack;
	private final AudioTrackPositionTracker audioTrackPositionTracker;
	private ByteBuffer avSyncHeader;
	private int bufferSize;
	private int bytesUntilNextAvSync;
	private boolean canApplyPlaybackParameters;
	private final ChannelMappingAudioProcessor channelMappingAudioProcessor;
	private int drainingAudioProcessorIndex;
	private final boolean enableConvertHighResIntPcmToFloat;
	private int framesPerEncodedSample;
	private boolean handledEndOfStream;
	private ByteBuffer inputBuffer;
	private int inputSampleRate;
	private boolean isInputPcm;
	private AudioTrack keepSessionIdAudioTrack;
	private long lastFeedElapsedRealtimeMs;
	private AudioSink.Listener listener;
	private ByteBuffer outputBuffer;
	private ByteBuffer outputBuffers[];
	private int outputChannelConfig;
	private int outputEncoding;
	private int outputPcmFrameSize;
	private int outputSampleRate;
	private int pcmFrameSize;
	private PlaybackParameters playbackParameters;
	private final ArrayDeque playbackParametersCheckpoints;
	private long playbackParametersOffsetUs;
	private long playbackParametersPositionUs;
	private boolean playing;
	private byte preV21OutputBuffer[];
	private int preV21OutputBufferOffset;
	private boolean processingEnabled;
	private final ConditionVariable releasingConditionVariable;
	private boolean shouldConvertHighResIntPcmToFloat;
	private int startMediaTimeState;
	private long startMediaTimeUs;
	private long submittedEncodedFrames;
	private long submittedPcmBytes;
	private final AudioProcessor toFloatPcmAvailableAudioProcessors[] = {
		new FloatResamplingAudioProcessor()
	};
	private final AudioProcessor toIntPcmAvailableAudioProcessors[];
	private final TrimmingAudioProcessor trimmingAudioProcessor;
	private boolean tunneling;
	private float volume;
	private long writtenEncodedFrames;
	private long writtenPcmBytes;

	static 
	{
	//    0    0:return          
	}


/*
	static long access$1000(DefaultAudioSink defaultaudiosink)
	{
		return defaultaudiosink.lastFeedElapsedRealtimeMs;
	//    0    0:aload_0         
	//    1    1:getfield        #253 <Field long lastFeedElapsedRealtimeMs>
	//    2    4:lreturn         
	}

*/


/*
	static ConditionVariable access$300(DefaultAudioSink defaultaudiosink)
	{
		return defaultaudiosink.releasingConditionVariable;
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field ConditionVariable releasingConditionVariable>
	//    2    4:areturn         
	}

*/


/*
	static long access$600(DefaultAudioSink defaultaudiosink)
	{
		return defaultaudiosink.getSubmittedFrames();
	//    0    0:aload_0         
	//    1    1:invokespecial   #260 <Method long getSubmittedFrames()>
	//    2    4:lreturn         
	}

*/


/*
	static long access$700(DefaultAudioSink defaultaudiosink)
	{
		return defaultaudiosink.getWrittenFrames();
	//    0    0:aload_0         
	//    1    1:invokespecial   #264 <Method long getWrittenFrames()>
	//    2    4:lreturn         
	}

*/


/*
	static AudioSink.Listener access$900(DefaultAudioSink defaultaudiosink)
	{
		return defaultaudiosink.listener;
	//    0    0:aload_0         
	//    1    1:getfield        #268 <Field AudioSink$Listener listener>
	//    2    4:areturn         
	}

*/
}
