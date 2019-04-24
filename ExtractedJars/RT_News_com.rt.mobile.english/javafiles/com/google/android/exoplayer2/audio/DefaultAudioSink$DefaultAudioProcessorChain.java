// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.PlaybackParameters;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer2.audio:
//			DefaultAudioSink, SilenceSkippingAudioProcessor, SonicAudioProcessor, AudioProcessor

public static class DefaultAudioSink$DefaultAudioProcessorChain
	implements DefaultAudioSink.AudioProcessorChain
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

	public transient DefaultAudioSink$DefaultAudioProcessorChain(AudioProcessor aaudioprocessor[])
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
