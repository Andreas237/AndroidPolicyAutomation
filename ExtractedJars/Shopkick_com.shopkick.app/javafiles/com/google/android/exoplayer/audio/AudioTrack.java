// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.audio;

import android.media.AudioTimestamp;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.exoplayer.C;
import com.google.android.exoplayer.util.Ac3Util;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.DtsUtil;
import com.google.android.exoplayer.util.Util;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.exoplayer.audio:
//			AudioCapabilities

public final class AudioTrack
{
	private static class AudioTrackUtil
	{

		public long getPlaybackHeadPosition()
		{
			if(stopTimestampUs != -1L)
		//*   0    0:aload_0         
		//*   1    1:getfield        #31  <Field long stopTimestampUs>
		//*   2    4:ldc2w           #32  <Long -1L>
		//*   3    7:lcmp            
		//*   4    8:ifeq            48
			{
				long l = ((SystemClock.elapsedRealtime() * 1000L - stopTimestampUs) * (long)sampleRate) / 0xf4240L;
		//    5   11:invokestatic    #38  <Method long SystemClock.elapsedRealtime()>
		//    6   14:ldc2w           #39  <Long 1000L>
		//    7   17:lmul            
		//    8   18:aload_0         
		//    9   19:getfield        #31  <Field long stopTimestampUs>
		//   10   22:lsub            
		//   11   23:aload_0         
		//   12   24:getfield        #42  <Field int sampleRate>
		//   13   27:i2l             
		//   14   28:lmul            
		//   15   29:ldc2w           #43  <Long 0xf4240L>
		//   16   32:ldiv            
		//   17   33:lstore_2        
				return Math.min(endPlaybackHeadPosition, stopPlaybackHeadPosition + l);
		//   18   34:aload_0         
		//   19   35:getfield        #46  <Field long endPlaybackHeadPosition>
		//   20   38:aload_0         
		//   21   39:getfield        #48  <Field long stopPlaybackHeadPosition>
		//   22   42:lload_2         
		//   23   43:ladd            
		//   24   44:invokestatic    #54  <Method long Math.min(long, long)>
		//   25   47:lreturn         
			}
			int i = audioTrack.getPlayState();
		//   26   48:aload_0         
		//   27   49:getfield        #56  <Field android.media.AudioTrack audioTrack>
		//   28   52:invokevirtual   #62  <Method int android.media.AudioTrack.getPlayState()>
		//   29   55:istore_1        
			if(i == 1)
		//*  30   56:iload_1         
		//*  31   57:iconst_1        
		//*  32   58:icmpne          63
				return 0L;
		//   33   61:lconst_0        
		//   34   62:lreturn         
			long l2 = 0xffffffffL & (long)audioTrack.getPlaybackHeadPosition();
		//   35   63:ldc2w           #63  <Long 0xffffffffL>
		//   36   66:aload_0         
		//   37   67:getfield        #56  <Field android.media.AudioTrack audioTrack>
		//   38   70:invokevirtual   #66  <Method int android.media.AudioTrack.getPlaybackHeadPosition()>
		//   39   73:i2l             
		//   40   74:land            
		//   41   75:lstore          4
			long l1 = l2;
		//   42   77:lload           4
		//   43   79:lstore_2        
			if(needsPassthroughWorkaround)
		//*  44   80:aload_0         
		//*  45   81:getfield        #68  <Field boolean needsPassthroughWorkaround>
		//*  46   84:ifeq            115
			{
				if(i == 2 && l2 == 0L)
		//*  47   87:iload_1         
		//*  48   88:iconst_2        
		//*  49   89:icmpne          107
		//*  50   92:lload           4
		//*  51   94:lconst_0        
		//*  52   95:lcmp            
		//*  53   96:ifne            107
					passthroughWorkaroundPauseOffset = lastRawPlaybackHeadPosition;
		//   54   99:aload_0         
		//   55  100:aload_0         
		//   56  101:getfield        #70  <Field long lastRawPlaybackHeadPosition>
		//   57  104:putfield        #72  <Field long passthroughWorkaroundPauseOffset>
				l1 = l2 + passthroughWorkaroundPauseOffset;
		//   58  107:lload           4
		//   59  109:aload_0         
		//   60  110:getfield        #72  <Field long passthroughWorkaroundPauseOffset>
		//   61  113:ladd            
		//   62  114:lstore_2        
			}
			if(lastRawPlaybackHeadPosition > l1)
		//*  63  115:aload_0         
		//*  64  116:getfield        #70  <Field long lastRawPlaybackHeadPosition>
		//*  65  119:lload_2         
		//*  66  120:lcmp            
		//*  67  121:ifle            134
				rawPlaybackHeadWrapCount = rawPlaybackHeadWrapCount + 1L;
		//   68  124:aload_0         
		//   69  125:aload_0         
		//   70  126:getfield        #74  <Field long rawPlaybackHeadWrapCount>
		//   71  129:lconst_1        
		//   72  130:ladd            
		//   73  131:putfield        #74  <Field long rawPlaybackHeadWrapCount>
			lastRawPlaybackHeadPosition = l1;
		//   74  134:aload_0         
		//   75  135:lload_2         
		//   76  136:putfield        #70  <Field long lastRawPlaybackHeadPosition>
			return l1 + (rawPlaybackHeadWrapCount << 32);
		//   77  139:lload_2         
		//   78  140:aload_0         
		//   79  141:getfield        #74  <Field long rawPlaybackHeadWrapCount>
		//   80  144:bipush          32
		//   81  146:lshl            
		//   82  147:ladd            
		//   83  148:lreturn         
		}

		public long getPlaybackHeadPositionUs()
		{
			return (getPlaybackHeadPosition() * 0xf4240L) / (long)sampleRate;
		//    0    0:aload_0         
		//    1    1:invokevirtual   #77  <Method long getPlaybackHeadPosition()>
		//    2    4:ldc2w           #43  <Long 0xf4240L>
		//    3    7:lmul            
		//    4    8:aload_0         
		//    5    9:getfield        #42  <Field int sampleRate>
		//    6   12:i2l             
		//    7   13:ldiv            
		//    8   14:lreturn         
		}

		public float getPlaybackSpeed()
		{
			return 1.0F;
		//    0    0:fconst_1        
		//    1    1:freturn         
		}

		public long getTimestampFramePosition()
		{
			throw new UnsupportedOperationException();
		//    0    0:new             #82  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:invokespecial   #83  <Method void UnsupportedOperationException()>
		//    3    7:athrow          
		}

		public long getTimestampNanoTime()
		{
			throw new UnsupportedOperationException();
		//    0    0:new             #82  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:invokespecial   #83  <Method void UnsupportedOperationException()>
		//    3    7:athrow          
		}

		public void handleEndOfStream(long l)
		{
			stopPlaybackHeadPosition = getPlaybackHeadPosition();
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:invokevirtual   #77  <Method long getPlaybackHeadPosition()>
		//    3    5:putfield        #48  <Field long stopPlaybackHeadPosition>
			stopTimestampUs = SystemClock.elapsedRealtime() * 1000L;
		//    4    8:aload_0         
		//    5    9:invokestatic    #38  <Method long SystemClock.elapsedRealtime()>
		//    6   12:ldc2w           #39  <Long 1000L>
		//    7   15:lmul            
		//    8   16:putfield        #31  <Field long stopTimestampUs>
			endPlaybackHeadPosition = l;
		//    9   19:aload_0         
		//   10   20:lload_1         
		//   11   21:putfield        #46  <Field long endPlaybackHeadPosition>
			audioTrack.stop();
		//   12   24:aload_0         
		//   13   25:getfield        #56  <Field android.media.AudioTrack audioTrack>
		//   14   28:invokevirtual   #89  <Method void android.media.AudioTrack.stop()>
		//   15   31:return          
		}

		public void pause()
		{
			if(stopTimestampUs != -1L)
		//*   0    0:aload_0         
		//*   1    1:getfield        #31  <Field long stopTimestampUs>
		//*   2    4:ldc2w           #32  <Long -1L>
		//*   3    7:lcmp            
		//*   4    8:ifeq            12
			{
				return;
		//    5   11:return          
			} else
			{
				audioTrack.pause();
		//    6   12:aload_0         
		//    7   13:getfield        #56  <Field android.media.AudioTrack audioTrack>
		//    8   16:invokevirtual   #92  <Method void android.media.AudioTrack.pause()>
				return;
		//    9   19:return          
			}
		}

		public void reconfigure(android.media.AudioTrack audiotrack, boolean flag)
		{
			audioTrack = audiotrack;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #56  <Field android.media.AudioTrack audioTrack>
			needsPassthroughWorkaround = flag;
		//    3    5:aload_0         
		//    4    6:iload_2         
		//    5    7:putfield        #68  <Field boolean needsPassthroughWorkaround>
			stopTimestampUs = -1L;
		//    6   10:aload_0         
		//    7   11:ldc2w           #32  <Long -1L>
		//    8   14:putfield        #31  <Field long stopTimestampUs>
			lastRawPlaybackHeadPosition = 0L;
		//    9   17:aload_0         
		//   10   18:lconst_0        
		//   11   19:putfield        #70  <Field long lastRawPlaybackHeadPosition>
			rawPlaybackHeadWrapCount = 0L;
		//   12   22:aload_0         
		//   13   23:lconst_0        
		//   14   24:putfield        #74  <Field long rawPlaybackHeadWrapCount>
			passthroughWorkaroundPauseOffset = 0L;
		//   15   27:aload_0         
		//   16   28:lconst_0        
		//   17   29:putfield        #72  <Field long passthroughWorkaroundPauseOffset>
			if(audiotrack != null)
		//*  18   32:aload_1         
		//*  19   33:ifnull          44
				sampleRate = audiotrack.getSampleRate();
		//   20   36:aload_0         
		//   21   37:aload_1         
		//   22   38:invokevirtual   #97  <Method int android.media.AudioTrack.getSampleRate()>
		//   23   41:putfield        #42  <Field int sampleRate>
		//   24   44:return          
		}

		public void setPlaybackParameters(PlaybackParams playbackparams)
		{
			throw new UnsupportedOperationException();
		//    0    0:new             #82  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:invokespecial   #83  <Method void UnsupportedOperationException()>
		//    3    7:athrow          
		}

		public boolean updateTimestamp()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		protected android.media.AudioTrack audioTrack;
		private long endPlaybackHeadPosition;
		private long lastRawPlaybackHeadPosition;
		private boolean needsPassthroughWorkaround;
		private long passthroughWorkaroundPauseOffset;
		private long rawPlaybackHeadWrapCount;
		private int sampleRate;
		private long stopPlaybackHeadPosition;
		private long stopTimestampUs;

		private AudioTrackUtil()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class AudioTrackUtilV19 extends AudioTrackUtil
	{

		public long getTimestampFramePosition()
		{
			return lastTimestampFramePosition;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field long lastTimestampFramePosition>
		//    2    4:lreturn         
		}

		public long getTimestampNanoTime()
		{
			return audioTimestamp.nanoTime;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field AudioTimestamp audioTimestamp>
		//    2    4:getfield        #36  <Field long AudioTimestamp.nanoTime>
		//    3    7:lreturn         
		}

		public void reconfigure(android.media.AudioTrack audiotrack, boolean flag)
		{
			super.reconfigure(audiotrack, flag);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #40  <Method void AudioTrack$AudioTrackUtil.reconfigure(android.media.AudioTrack, boolean)>
			rawTimestampFramePositionWrapCount = 0L;
		//    4    6:aload_0         
		//    5    7:lconst_0        
		//    6    8:putfield        #42  <Field long rawTimestampFramePositionWrapCount>
			lastRawTimestampFramePosition = 0L;
		//    7   11:aload_0         
		//    8   12:lconst_0        
		//    9   13:putfield        #44  <Field long lastRawTimestampFramePosition>
			lastTimestampFramePosition = 0L;
		//   10   16:aload_0         
		//   11   17:lconst_0        
		//   12   18:putfield        #32  <Field long lastTimestampFramePosition>
		//   13   21:return          
		}

		public boolean updateTimestamp()
		{
			boolean flag = audioTrack.getTimestamp(audioTimestamp);
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field android.media.AudioTrack audioTrack>
		//    2    4:aload_0         
		//    3    5:getfield        #27  <Field AudioTimestamp audioTimestamp>
		//    4    8:invokevirtual   #56  <Method boolean android.media.AudioTrack.getTimestamp(AudioTimestamp)>
		//    5   11:istore_1        
			if(flag)
		//*   6   12:iload_1         
		//*   7   13:ifeq            61
			{
				long l = audioTimestamp.framePosition;
		//    8   16:aload_0         
		//    9   17:getfield        #27  <Field AudioTimestamp audioTimestamp>
		//   10   20:getfield        #59  <Field long AudioTimestamp.framePosition>
		//   11   23:lstore_2        
				if(lastRawTimestampFramePosition > l)
		//*  12   24:aload_0         
		//*  13   25:getfield        #44  <Field long lastRawTimestampFramePosition>
		//*  14   28:lload_2         
		//*  15   29:lcmp            
		//*  16   30:ifle            43
					rawTimestampFramePositionWrapCount = rawTimestampFramePositionWrapCount + 1L;
		//   17   33:aload_0         
		//   18   34:aload_0         
		//   19   35:getfield        #42  <Field long rawTimestampFramePositionWrapCount>
		//   20   38:lconst_1        
		//   21   39:ladd            
		//   22   40:putfield        #42  <Field long rawTimestampFramePositionWrapCount>
				lastRawTimestampFramePosition = l;
		//   23   43:aload_0         
		//   24   44:lload_2         
		//   25   45:putfield        #44  <Field long lastRawTimestampFramePosition>
				lastTimestampFramePosition = l + (rawTimestampFramePositionWrapCount << 32);
		//   26   48:aload_0         
		//   27   49:lload_2         
		//   28   50:aload_0         
		//   29   51:getfield        #42  <Field long rawTimestampFramePositionWrapCount>
		//   30   54:bipush          32
		//   31   56:lshl            
		//   32   57:ladd            
		//   33   58:putfield        #32  <Field long lastTimestampFramePosition>
			}
			return flag;
		//   34   61:iload_1         
		//   35   62:ireturn         
		}

		private final AudioTimestamp audioTimestamp = new AudioTimestamp();
		private long lastRawTimestampFramePosition;
		private long lastTimestampFramePosition;
		private long rawTimestampFramePositionWrapCount;

		public AudioTrackUtilV19()
		{
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #21  <Method void AudioTrack$AudioTrackUtil(AudioTrack$1)>
		//    3    5:aload_0         
		//    4    6:new             #23  <Class AudioTimestamp>
		//    5    9:dup             
		//    6   10:invokespecial   #25  <Method void AudioTimestamp()>
		//    7   13:putfield        #27  <Field AudioTimestamp audioTimestamp>
		//    8   16:return          
		}
	}

	private static class AudioTrackUtilV23 extends AudioTrackUtilV19
	{

		private void maybeApplyPlaybackParams()
		{
			if(audioTrack != null && playbackParams != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field android.media.AudioTrack audioTrack>
		//*   2    4:ifnull          25
		//*   3    7:aload_0         
		//*   4    8:getfield        #28  <Field PlaybackParams playbackParams>
		//*   5   11:ifnull          25
				audioTrack.setPlaybackParams(playbackParams);
		//    6   14:aload_0         
		//    7   15:getfield        #26  <Field android.media.AudioTrack audioTrack>
		//    8   18:aload_0         
		//    9   19:getfield        #28  <Field PlaybackParams playbackParams>
		//   10   22:invokevirtual   #34  <Method void android.media.AudioTrack.setPlaybackParams(PlaybackParams)>
		//   11   25:return          
		}

		public float getPlaybackSpeed()
		{
			return playbackSpeed;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field float playbackSpeed>
		//    2    4:freturn         
		}

		public void reconfigure(android.media.AudioTrack audiotrack, boolean flag)
		{
			super.reconfigure(audiotrack, flag);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #40  <Method void AudioTrack$AudioTrackUtilV19.reconfigure(android.media.AudioTrack, boolean)>
			maybeApplyPlaybackParams();
		//    4    6:aload_0         
		//    5    7:invokespecial   #42  <Method void maybeApplyPlaybackParams()>
		//    6   10:return          
		}

		public void setPlaybackParameters(PlaybackParams playbackparams)
		{
			if(playbackparams == null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          7
		//*   2    4:goto            15
				playbackparams = new PlaybackParams();
		//    3    7:new             #45  <Class PlaybackParams>
		//    4   10:dup             
		//    5   11:invokespecial   #46  <Method void PlaybackParams()>
		//    6   14:astore_1        
			playbackparams = playbackparams.allowDefaults();
		//    7   15:aload_1         
		//    8   16:invokevirtual   #50  <Method PlaybackParams PlaybackParams.allowDefaults()>
		//    9   19:astore_1        
			playbackParams = playbackparams;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:putfield        #28  <Field PlaybackParams playbackParams>
			playbackSpeed = playbackparams.getSpeed();
		//   13   25:aload_0         
		//   14   26:aload_1         
		//   15   27:invokevirtual   #53  <Method float PlaybackParams.getSpeed()>
		//   16   30:putfield        #20  <Field float playbackSpeed>
			maybeApplyPlaybackParams();
		//   17   33:aload_0         
		//   18   34:invokespecial   #42  <Method void maybeApplyPlaybackParams()>
		//   19   37:return          
		}

		private PlaybackParams playbackParams;
		private float playbackSpeed;

		public AudioTrackUtilV23()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void AudioTrack$AudioTrackUtilV19()>
			playbackSpeed = 1.0F;
		//    2    4:aload_0         
		//    3    5:fconst_1        
		//    4    6:putfield        #20  <Field float playbackSpeed>
		//    5    9:return          
		}
	}

	public static final class InitializationException extends Exception
	{

		public final int audioTrackState;

		public InitializationException(int i, int j, int k, int l)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #13  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #16  <Method void StringBuilder()>
		//    3    7:astore          5
			stringbuilder.append("AudioTrack init failed: ");
		//    4    9:aload           5
		//    5   11:ldc1            #18  <String "AudioTrack init failed: ">
		//    6   13:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
		//    7   16:pop             
			stringbuilder.append(i);
		//    8   17:aload           5
		//    9   19:iload_1         
		//   10   20:invokevirtual   #25  <Method StringBuilder StringBuilder.append(int)>
		//   11   23:pop             
			stringbuilder.append(", Config(");
		//   12   24:aload           5
		//   13   26:ldc1            #27  <String ", Config(">
		//   14   28:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
		//   15   31:pop             
			stringbuilder.append(j);
		//   16   32:aload           5
		//   17   34:iload_2         
		//   18   35:invokevirtual   #25  <Method StringBuilder StringBuilder.append(int)>
		//   19   38:pop             
			stringbuilder.append(", ");
		//   20   39:aload           5
		//   21   41:ldc1            #29  <String ", ">
		//   22   43:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
		//   23   46:pop             
			stringbuilder.append(k);
		//   24   47:aload           5
		//   25   49:iload_3         
		//   26   50:invokevirtual   #25  <Method StringBuilder StringBuilder.append(int)>
		//   27   53:pop             
			stringbuilder.append(", ");
		//   28   54:aload           5
		//   29   56:ldc1            #29  <String ", ">
		//   30   58:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
		//   31   61:pop             
			stringbuilder.append(l);
		//   32   62:aload           5
		//   33   64:iload           4
		//   34   66:invokevirtual   #25  <Method StringBuilder StringBuilder.append(int)>
		//   35   69:pop             
			stringbuilder.append(")");
		//   36   70:aload           5
		//   37   72:ldc1            #31  <String ")">
		//   38   74:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
		//   39   77:pop             
			super(stringbuilder.toString());
		//   40   78:aload_0         
		//   41   79:aload           5
		//   42   81:invokevirtual   #35  <Method String StringBuilder.toString()>
		//   43   84:invokespecial   #38  <Method void Exception(String)>
			audioTrackState = i;
		//   44   87:aload_0         
		//   45   88:iload_1         
		//   46   89:putfield        #40  <Field int audioTrackState>
		//   47   92:return          
		}
	}

	public static final class InvalidAudioTrackTimestampException extends RuntimeException
	{

		public InvalidAudioTrackTimestampException(String s)
		{
			super(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void RuntimeException(String)>
		//    3    5:return          
		}
	}

	public static final class WriteException extends Exception
	{

		public final int errorCode;

		public WriteException(int i)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #13  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #16  <Method void StringBuilder()>
		//    3    7:astore_2        
			stringbuilder.append("AudioTrack write failed: ");
		//    4    8:aload_2         
		//    5    9:ldc1            #18  <String "AudioTrack write failed: ">
		//    6   11:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(i);
		//    8   15:aload_2         
		//    9   16:iload_1         
		//   10   17:invokevirtual   #25  <Method StringBuilder StringBuilder.append(int)>
		//   11   20:pop             
			super(stringbuilder.toString());
		//   12   21:aload_0         
		//   13   22:aload_2         
		//   14   23:invokevirtual   #29  <Method String StringBuilder.toString()>
		//   15   26:invokespecial   #32  <Method void Exception(String)>
			errorCode = i;
		//   16   29:aload_0         
		//   17   30:iload_1         
		//   18   31:putfield        #34  <Field int errorCode>
		//   19   34:return          
		}
	}


	public AudioTrack()
	{
		this(((AudioCapabilities) (null)), 3);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:iconst_3        
	//    3    3:invokespecial   #117 <Method void AudioTrack(AudioCapabilities, int)>
	//    4    6:return          
	}

	public AudioTrack(AudioCapabilities audiocapabilities, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #121 <Method void Object()>
		audioCapabilities = audiocapabilities;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #123 <Field AudioCapabilities audioCapabilities>
		releasingConditionVariable = new ConditionVariable(true);
	//    5    9:aload_0         
	//    6   10:new             #125 <Class ConditionVariable>
	//    7   13:dup             
	//    8   14:iconst_1        
	//    9   15:invokespecial   #128 <Method void ConditionVariable(boolean)>
	//   10   18:putfield        #130 <Field ConditionVariable releasingConditionVariable>
		if(Util.SDK_INT >= 18)
	//*  11   21:getstatic       #135 <Field int Util.SDK_INT>
	//*  12   24:bipush          18
	//*  13   26:icmplt          44
			try
			{
				getLatencyMethod = ((Class) (android/media/AudioTrack)).getMethod("getLatency", (Class[])null);
	//   14   29:aload_0         
	//   15   30:ldc1            #137 <Class android.media.AudioTrack>
	//   16   32:ldc1            #139 <String "getLatency">
	//   17   34:aconst_null     
	//   18   35:checkcast       #141 <Class Class[]>
	//   19   38:invokevirtual   #147 <Method Method Class.getMethod(String, Class[])>
	//   20   41:putfield        #149 <Field Method getLatencyMethod>
			}
	//*  21   44:getstatic       #135 <Field int Util.SDK_INT>
	//*  22   47:bipush          23
	//*  23   49:icmplt          66
	//*  24   52:aload_0         
	//*  25   53:new             #16  <Class AudioTrack$AudioTrackUtilV23>
	//*  26   56:dup             
	//*  27   57:invokespecial   #150 <Method void AudioTrack$AudioTrackUtilV23()>
	//*  28   60:putfield        #152 <Field AudioTrack$AudioTrackUtil audioTrackUtil>
	//*  29   63:goto            100
	//*  30   66:getstatic       #135 <Field int Util.SDK_INT>
	//*  31   69:bipush          19
	//*  32   71:icmplt          88
	//*  33   74:aload_0         
	//*  34   75:new             #13  <Class AudioTrack$AudioTrackUtilV19>
	//*  35   78:dup             
	//*  36   79:invokespecial   #153 <Method void AudioTrack$AudioTrackUtilV19()>
	//*  37   82:putfield        #152 <Field AudioTrack$AudioTrackUtil audioTrackUtil>
	//*  38   85:goto            100
	//*  39   88:aload_0         
	//*  40   89:new             #10  <Class AudioTrack$AudioTrackUtil>
	//*  41   92:dup             
	//*  42   93:aconst_null     
	//*  43   94:invokespecial   #156 <Method void AudioTrack$AudioTrackUtil(AudioTrack$1)>
	//*  44   97:putfield        #152 <Field AudioTrack$AudioTrackUtil audioTrackUtil>
	//*  45  100:aload_0         
	//*  46  101:bipush          10
	//*  47  103:newarray        long[]
	//*  48  105:putfield        #158 <Field long[] playheadOffsets>
	//*  49  108:aload_0         
	//*  50  109:iload_2         
	//*  51  110:putfield        #160 <Field int streamType>
	//*  52  113:aload_0         
	//*  53  114:fconst_1        
	//*  54  115:putfield        #162 <Field float volume>
	//*  55  118:aload_0         
	//*  56  119:iconst_0        
	//*  57  120:putfield        #164 <Field int startMediaTimeState>
	//*  58  123:return          
			// Misplaced declaration of an exception variable
			catch(AudioCapabilities audiocapabilities) { }
	//   59  124:astore_1        
		if(Util.SDK_INT >= 23)
			audioTrackUtil = ((AudioTrackUtil) (new AudioTrackUtilV23()));
		else
		if(Util.SDK_INT >= 19)
			audioTrackUtil = ((AudioTrackUtil) (new AudioTrackUtilV19()));
		else
			audioTrackUtil = new AudioTrackUtil();
		playheadOffsets = new long[10];
		streamType = i;
		volume = 1.0F;
		startMediaTimeState = 0;
	//*  60  125:goto            44
	}

	private void checkAudioTrackInitialized()
		throws InitializationException
	{
		int i;
		i = audioTrack.getState();
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field android.media.AudioTrack audioTrack>
	//    2    4:invokevirtual   #175 <Method int android.media.AudioTrack.getState()>
	//    3    7:istore_1        
		if(i == 1)
	//*   4    8:iload_1         
	//*   5    9:iconst_1        
	//*   6   10:icmpne          14
			return;
	//    7   13:return          
		Exception exception;
		try
		{
			audioTrack.release();
	//    8   14:aload_0         
	//    9   15:getfield        #171 <Field android.media.AudioTrack audioTrack>
	//   10   18:invokevirtual   #178 <Method void android.media.AudioTrack.release()>
		}
	//*  11   21:goto            32
	//*  12   24:astore_2        
	//*  13   25:aload_0         
	//*  14   26:aconst_null     
	//*  15   27:putfield        #171 <Field android.media.AudioTrack audioTrack>
	//*  16   30:aload_2         
	//*  17   31:athrow          
	//*  18   32:aload_0         
	//*  19   33:aconst_null     
	//*  20   34:putfield        #171 <Field android.media.AudioTrack audioTrack>
	//*  21   37:new             #19  <Class AudioTrack$InitializationException>
	//*  22   40:dup             
	//*  23   41:iload_1         
	//*  24   42:aload_0         
	//*  25   43:getfield        #180 <Field int sampleRate>
	//*  26   46:aload_0         
	//*  27   47:getfield        #182 <Field int channelConfig>
	//*  28   50:aload_0         
	//*  29   51:getfield        #184 <Field int bufferSize>
	//*  30   54:invokespecial   #187 <Method void AudioTrack$InitializationException(int, int, int, int)>
	//*  31   57:athrow          
		catch(Exception exception1) { }
	//   32   58:astore_2        
		break MISSING_BLOCK_LABEL_32;
	//   33   59:goto            32
		exception;
		audioTrack = null;
		throw exception;
		audioTrack = null;
		throw new InitializationException(i, sampleRate, channelConfig, bufferSize);
	}

	private long durationUsToFrames(long l)
	{
		return (l * (long)sampleRate) / 0xf4240L;
	//    0    0:lload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #180 <Field int sampleRate>
	//    3    5:i2l             
	//    4    6:lmul            
	//    5    7:ldc2w           #191 <Long 0xf4240L>
	//    6   10:ldiv            
	//    7   11:lreturn         
	}

	private long framesToDurationUs(long l)
	{
		return (l * 0xf4240L) / (long)sampleRate;
	//    0    0:lload_1         
	//    1    1:ldc2w           #191 <Long 0xf4240L>
	//    2    4:lmul            
	//    3    5:aload_0         
	//    4    6:getfield        #180 <Field int sampleRate>
	//    5    9:i2l             
	//    6   10:ldiv            
	//    7   11:lreturn         
	}

	private static int getEncodingForMimeType(String s)
	{
		int i;
label0:
		{
			i = s.hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #200 <Method int String.hashCode()>
	//    2    4:istore_1        
			if(i != 0xbebaa468)
	//*   3    5:iload_1         
	//*   4    6:ldc1            #201 <Int 0xbebaa468>
	//*   5    8:icmpeq          74
			{
				if(i != 0xb269698)
	//*   6   11:iload_1         
	//*   7   12:ldc1            #202 <Int 0xb269698>
	//*   8   14:icmpeq          60
				{
					if(i != 0x59ae0c65)
	//*   9   17:iload_1         
	//*  10   18:ldc1            #203 <Int 0x59ae0c65>
	//*  11   20:icmpeq          46
					{
						if(i == 0x59c2dc42 && s.equals("audio/vnd.dts.hd"))
	//*  12   23:iload_1         
	//*  13   24:ldc1            #204 <Int 0x59c2dc42>
	//*  14   26:icmpeq          32
	//*  15   29:goto            88
	//*  16   32:aload_0         
	//*  17   33:ldc1            #206 <String "audio/vnd.dts.hd">
	//*  18   35:invokevirtual   #210 <Method boolean String.equals(Object)>
	//*  19   38:ifeq            88
						{
							i = 3;
	//   20   41:iconst_3        
	//   21   42:istore_1        
							break label0;
	//   22   43:goto            90
						}
					} else
					if(s.equals("audio/eac3"))
	//*  23   46:aload_0         
	//*  24   47:ldc1            #212 <String "audio/eac3">
	//*  25   49:invokevirtual   #210 <Method boolean String.equals(Object)>
	//*  26   52:ifeq            88
					{
						i = 1;
	//   27   55:iconst_1        
	//   28   56:istore_1        
						break label0;
	//   29   57:goto            90
					}
				} else
				if(s.equals("audio/ac3"))
	//*  30   60:aload_0         
	//*  31   61:ldc1            #214 <String "audio/ac3">
	//*  32   63:invokevirtual   #210 <Method boolean String.equals(Object)>
	//*  33   66:ifeq            88
				{
					i = 0;
	//   34   69:iconst_0        
	//   35   70:istore_1        
					break label0;
	//   36   71:goto            90
				}
			} else
			if(s.equals("audio/vnd.dts"))
	//*  37   74:aload_0         
	//*  38   75:ldc1            #216 <String "audio/vnd.dts">
	//*  39   77:invokevirtual   #210 <Method boolean String.equals(Object)>
	//*  40   80:ifeq            88
			{
				i = 2;
	//   41   83:iconst_2        
	//   42   84:istore_1        
				break label0;
	//   43   85:goto            90
			}
			i = -1;
	//   44   88:iconst_m1       
	//   45   89:istore_1        
		}
		switch(i)
	//*  46   90:iload_1         
		{
	//*  47   91:tableswitch     0 3: default 120
	//	               0 131
	//	               1 128
	//	               2 125
	//	               3 122
		default:
			return 0;
	//   48  120:iconst_0        
	//   49  121:ireturn         

		case 3: // '\003'
			return 8;
	//   50  122:bipush          8
	//   51  124:ireturn         

		case 2: // '\002'
			return 7;
	//   52  125:bipush          7
	//   53  127:ireturn         

		case 1: // '\001'
			return 6;
	//   54  128:bipush          6
	//   55  130:ireturn         

		case 0: // '\0'
			return 5;
	//   56  131:iconst_5        
	//   57  132:ireturn         
		}
	}

	private static int getFramesPerEncodedSample(int i, ByteBuffer bytebuffer)
	{
		if(i != 7 && i != 8)
	//*   0    0:iload_0         
	//*   1    1:bipush          7
	//*   2    3:icmpeq          68
	//*   3    6:iload_0         
	//*   4    7:bipush          8
	//*   5    9:icmpne          15
	//*   6   12:goto            68
		{
			if(i == 5)
	//*   7   15:iload_0         
	//*   8   16:iconst_5        
	//*   9   17:icmpne          24
				return Ac3Util.getAc3SyncframeAudioSampleCount();
	//   10   20:invokestatic    #223 <Method int Ac3Util.getAc3SyncframeAudioSampleCount()>
	//   11   23:ireturn         
			if(i == 6)
	//*  12   24:iload_0         
	//*  13   25:bipush          6
	//*  14   27:icmpne          35
			{
				return Ac3Util.parseEAc3SyncframeAudioSampleCount(bytebuffer);
	//   15   30:aload_1         
	//   16   31:invokestatic    #227 <Method int Ac3Util.parseEAc3SyncframeAudioSampleCount(ByteBuffer)>
	//   17   34:ireturn         
			} else
			{
				bytebuffer = ((ByteBuffer) (new StringBuilder()));
	//   18   35:new             #229 <Class StringBuilder>
	//   19   38:dup             
	//   20   39:invokespecial   #230 <Method void StringBuilder()>
	//   21   42:astore_1        
				((StringBuilder) (bytebuffer)).append("Unexpected audio encoding: ");
	//   22   43:aload_1         
	//   23   44:ldc1            #232 <String "Unexpected audio encoding: ">
	//   24   46:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   25   49:pop             
				((StringBuilder) (bytebuffer)).append(i);
	//   26   50:aload_1         
	//   27   51:iload_0         
	//   28   52:invokevirtual   #239 <Method StringBuilder StringBuilder.append(int)>
	//   29   55:pop             
				throw new IllegalStateException(((StringBuilder) (bytebuffer)).toString());
	//   30   56:new             #241 <Class IllegalStateException>
	//   31   59:dup             
	//   32   60:aload_1         
	//   33   61:invokevirtual   #245 <Method String StringBuilder.toString()>
	//   34   64:invokespecial   #248 <Method void IllegalStateException(String)>
	//   35   67:athrow          
			}
		} else
		{
			return DtsUtil.parseDtsAudioSampleCount(bytebuffer);
	//   36   68:aload_1         
	//   37   69:invokestatic    #253 <Method int DtsUtil.parseDtsAudioSampleCount(ByteBuffer)>
	//   38   72:ireturn         
		}
	}

	private long getSubmittedFrames()
	{
		if(passthrough)
	//*   0    0:aload_0         
	//*   1    1:getfield        #257 <Field boolean passthrough>
	//*   2    4:ifeq            12
			return submittedEncodedFrames;
	//    3    7:aload_0         
	//    4    8:getfield        #259 <Field long submittedEncodedFrames>
	//    5   11:lreturn         
		else
			return pcmBytesToFrames(submittedPcmBytes);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #261 <Field long submittedPcmBytes>
	//    9   17:invokespecial   #264 <Method long pcmBytesToFrames(long)>
	//   10   20:lreturn         
	}

	private boolean hasCurrentPositionUs()
	{
		return isInitialized() && startMediaTimeState != 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #269 <Method boolean isInitialized()>
	//    2    4:ifeq            16
	//    3    7:aload_0         
	//    4    8:getfield        #164 <Field int startMediaTimeState>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	private void maybeSampleSyncParams()
	{
		Exception exception;
		long l = audioTrackUtil.getPlaybackHeadPositionUs();
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field AudioTrack$AudioTrackUtil audioTrackUtil>
	//    2    4:invokevirtual   #273 <Method long AudioTrack$AudioTrackUtil.getPlaybackHeadPositionUs()>
	//    3    7:lstore_3        
		if(l == 0L)
	//*   4    8:lload_3         
	//*   5    9:lconst_0        
	//*   6   10:lcmp            
	//*   7   11:ifne            15
			return;
	//    8   14:return          
		long l1 = System.nanoTime() / 1000L;
	//    9   15:invokestatic    #278 <Method long System.nanoTime()>
	//   10   18:ldc2w           #279 <Long 1000L>
	//   11   21:ldiv            
	//   12   22:lstore          5
		if(l1 - lastPlayheadSampleTimeUs >= 30000L)
	//*  13   24:lload           5
	//*  14   26:aload_0         
	//*  15   27:getfield        #282 <Field long lastPlayheadSampleTimeUs>
	//*  16   30:lsub            
	//*  17   31:ldc2w           #283 <Long 30000L>
	//*  18   34:lcmp            
	//*  19   35:iflt            133
		{
			long al[] = playheadOffsets;
	//   20   38:aload_0         
	//   21   39:getfield        #158 <Field long[] playheadOffsets>
	//   22   42:astore          11
			int i = nextPlayheadOffsetIndex;
	//   23   44:aload_0         
	//   24   45:getfield        #286 <Field int nextPlayheadOffsetIndex>
	//   25   48:istore_1        
			al[i] = l - l1;
	//   26   49:aload           11
	//   27   51:iload_1         
	//   28   52:lload_3         
	//   29   53:lload           5
	//   30   55:lsub            
	//   31   56:lastore         
			nextPlayheadOffsetIndex = (i + 1) % 10;
	//   32   57:aload_0         
	//   33   58:iload_1         
	//   34   59:iconst_1        
	//   35   60:iadd            
	//   36   61:bipush          10
	//   37   63:irem            
	//   38   64:putfield        #286 <Field int nextPlayheadOffsetIndex>
			i = playheadOffsetCount;
	//   39   67:aload_0         
	//   40   68:getfield        #288 <Field int playheadOffsetCount>
	//   41   71:istore_1        
			if(i < 10)
	//*  42   72:iload_1         
	//*  43   73:bipush          10
	//*  44   75:icmpge          85
				playheadOffsetCount = i + 1;
	//   45   78:aload_0         
	//   46   79:iload_1         
	//   47   80:iconst_1        
	//   48   81:iadd            
	//   49   82:putfield        #288 <Field int playheadOffsetCount>
			lastPlayheadSampleTimeUs = l1;
	//   50   85:aload_0         
	//   51   86:lload           5
	//   52   88:putfield        #282 <Field long lastPlayheadSampleTimeUs>
			smoothedPlayheadOffsetUs = 0L;
	//   53   91:aload_0         
	//   54   92:lconst_0        
	//   55   93:putfield        #290 <Field long smoothedPlayheadOffsetUs>
			i = 0;
	//   56   96:iconst_0        
	//   57   97:istore_1        
			do
			{
				int j = playheadOffsetCount;
	//   58   98:aload_0         
	//   59   99:getfield        #288 <Field int playheadOffsetCount>
	//   60  102:istore_2        
				if(i >= j)
					break;
	//   61  103:iload_1         
	//   62  104:iload_2         
	//   63  105:icmpge          133
				smoothedPlayheadOffsetUs = smoothedPlayheadOffsetUs + playheadOffsets[i] / (long)j;
	//   64  108:aload_0         
	//   65  109:aload_0         
	//   66  110:getfield        #290 <Field long smoothedPlayheadOffsetUs>
	//   67  113:aload_0         
	//   68  114:getfield        #158 <Field long[] playheadOffsets>
	//   69  117:iload_1         
	//   70  118:laload          
	//   71  119:iload_2         
	//   72  120:i2l             
	//   73  121:ldiv            
	//   74  122:ladd            
	//   75  123:putfield        #290 <Field long smoothedPlayheadOffsetUs>
				i++;
	//   76  126:iload_1         
	//   77  127:iconst_1        
	//   78  128:iadd            
	//   79  129:istore_1        
			} while(true);
	//   80  130:goto            98
		}
		if(needsPassthroughWorkarounds())
	//*  81  133:aload_0         
	//*  82  134:invokespecial   #293 <Method boolean needsPassthroughWorkarounds()>
	//*  83  137:ifeq            141
			return;
	//   84  140:return          
		if(l1 - lastTimestampSampleTimeUs >= 0x7a120L)
	//*  85  141:lload           5
	//*  86  143:aload_0         
	//*  87  144:getfield        #295 <Field long lastTimestampSampleTimeUs>
	//*  88  147:lsub            
	//*  89  148:ldc2w           #296 <Long 0x7a120L>
	//*  90  151:lcmp            
	//*  91  152:iflt            608
		{
			audioTimestampSet = audioTrackUtil.updateTimestamp();
	//   92  155:aload_0         
	//   93  156:aload_0         
	//   94  157:getfield        #152 <Field AudioTrack$AudioTrackUtil audioTrackUtil>
	//   95  160:invokevirtual   #300 <Method boolean AudioTrack$AudioTrackUtil.updateTimestamp()>
	//   96  163:putfield        #302 <Field boolean audioTimestampSet>
			if(audioTimestampSet)
	//*  97  166:aload_0         
	//*  98  167:getfield        #302 <Field boolean audioTimestampSet>
	//*  99  170:ifeq            476
			{
				long l2 = audioTrackUtil.getTimestampNanoTime() / 1000L;
	//  100  173:aload_0         
	//  101  174:getfield        #152 <Field AudioTrack$AudioTrackUtil audioTrackUtil>
	//  102  177:invokevirtual   #305 <Method long AudioTrack$AudioTrackUtil.getTimestampNanoTime()>
	//  103  180:ldc2w           #279 <Long 1000L>
	//  104  183:ldiv            
	//  105  184:lstore          7
				long l3 = audioTrackUtil.getTimestampFramePosition();
	//  106  186:aload_0         
	//  107  187:getfield        #152 <Field AudioTrack$AudioTrackUtil audioTrackUtil>
	//  108  190:invokevirtual   #308 <Method long AudioTrack$AudioTrackUtil.getTimestampFramePosition()>
	//  109  193:lstore          9
				if(l2 < resumeSystemTimeUs)
	//* 110  195:lload           7
	//* 111  197:aload_0         
	//* 112  198:getfield        #310 <Field long resumeSystemTimeUs>
	//* 113  201:lcmp            
	//* 114  202:ifge            213
					audioTimestampSet = false;
	//  115  205:aload_0         
	//  116  206:iconst_0        
	//  117  207:putfield        #302 <Field boolean audioTimestampSet>
				else
	//* 118  210:goto            476
				if(Math.abs(l2 - l1) > 0x4c4b40L)
	//* 119  213:lload           7
	//* 120  215:lload           5
	//* 121  217:lsub            
	//* 122  218:invokestatic    #315 <Method long Math.abs(long)>
	//* 123  221:ldc2w           #35  <Long 0x4c4b40L>
	//* 124  224:lcmp            
	//* 125  225:ifle            343
				{
					Object obj = ((Object) (new StringBuilder()));
	//  126  228:new             #229 <Class StringBuilder>
	//  127  231:dup             
	//  128  232:invokespecial   #230 <Method void StringBuilder()>
	//  129  235:astore          11
					((StringBuilder) (obj)).append("Spurious audio timestamp (system clock mismatch): ");
	//  130  237:aload           11
	//  131  239:ldc2            #317 <String "Spurious audio timestamp (system clock mismatch): ">
	//  132  242:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//  133  245:pop             
					((StringBuilder) (obj)).append(l3);
	//  134  246:aload           11
	//  135  248:lload           9
	//  136  250:invokevirtual   #320 <Method StringBuilder StringBuilder.append(long)>
	//  137  253:pop             
					((StringBuilder) (obj)).append(", ");
	//  138  254:aload           11
	//  139  256:ldc2            #322 <String ", ">
	//  140  259:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//  141  262:pop             
					((StringBuilder) (obj)).append(l2);
	//  142  263:aload           11
	//  143  265:lload           7
	//  144  267:invokevirtual   #320 <Method StringBuilder StringBuilder.append(long)>
	//  145  270:pop             
					((StringBuilder) (obj)).append(", ");
	//  146  271:aload           11
	//  147  273:ldc2            #322 <String ", ">
	//  148  276:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//  149  279:pop             
					((StringBuilder) (obj)).append(l1);
	//  150  280:aload           11
	//  151  282:lload           5
	//  152  284:invokevirtual   #320 <Method StringBuilder StringBuilder.append(long)>
	//  153  287:pop             
					((StringBuilder) (obj)).append(", ");
	//  154  288:aload           11
	//  155  290:ldc2            #322 <String ", ">
	//  156  293:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//  157  296:pop             
					((StringBuilder) (obj)).append(l);
	//  158  297:aload           11
	//  159  299:lload_3         
	//  160  300:invokevirtual   #320 <Method StringBuilder StringBuilder.append(long)>
	//  161  303:pop             
					obj = ((Object) (((StringBuilder) (obj)).toString()));
	//  162  304:aload           11
	//  163  306:invokevirtual   #245 <Method String StringBuilder.toString()>
	//  164  309:astore          11
					if(!failOnSpuriousAudioTimestamp)
	//* 165  311:getstatic       #324 <Field boolean failOnSpuriousAudioTimestamp>
	//* 166  314:ifne            333
					{
						Log.w("AudioTrack", ((String) (obj)));
	//  167  317:ldc1            #63  <String "AudioTrack">
	//  168  319:aload           11
	//  169  321:invokestatic    #330 <Method int Log.w(String, String)>
	//  170  324:pop             
						audioTimestampSet = false;
	//  171  325:aload_0         
	//  172  326:iconst_0        
	//  173  327:putfield        #302 <Field boolean audioTimestampSet>
					} else
	//* 174  330:goto            476
					{
						throw new InvalidAudioTrackTimestampException(((String) (obj)));
	//  175  333:new             #22  <Class AudioTrack$InvalidAudioTrackTimestampException>
	//  176  336:dup             
	//  177  337:aload           11
	//  178  339:invokespecial   #331 <Method void AudioTrack$InvalidAudioTrackTimestampException(String)>
	//  179  342:athrow          
					}
				} else
				if(Math.abs(framesToDurationUs(l3) - l) > 0x4c4b40L)
	//* 180  343:aload_0         
	//* 181  344:lload           9
	//* 182  346:invokespecial   #333 <Method long framesToDurationUs(long)>
	//* 183  349:lload_3         
	//* 184  350:lsub            
	//* 185  351:invokestatic    #315 <Method long Math.abs(long)>
	//* 186  354:ldc2w           #35  <Long 0x4c4b40L>
	//* 187  357:lcmp            
	//* 188  358:ifle            476
				{
					Object obj1 = ((Object) (new StringBuilder()));
	//  189  361:new             #229 <Class StringBuilder>
	//  190  364:dup             
	//  191  365:invokespecial   #230 <Method void StringBuilder()>
	//  192  368:astore          11
					((StringBuilder) (obj1)).append("Spurious audio timestamp (frame position mismatch): ");
	//  193  370:aload           11
	//  194  372:ldc2            #335 <String "Spurious audio timestamp (frame position mismatch): ">
	//  195  375:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//  196  378:pop             
					((StringBuilder) (obj1)).append(l3);
	//  197  379:aload           11
	//  198  381:lload           9
	//  199  383:invokevirtual   #320 <Method StringBuilder StringBuilder.append(long)>
	//  200  386:pop             
					((StringBuilder) (obj1)).append(", ");
	//  201  387:aload           11
	//  202  389:ldc2            #322 <String ", ">
	//  203  392:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//  204  395:pop             
					((StringBuilder) (obj1)).append(l2);
	//  205  396:aload           11
	//  206  398:lload           7
	//  207  400:invokevirtual   #320 <Method StringBuilder StringBuilder.append(long)>
	//  208  403:pop             
					((StringBuilder) (obj1)).append(", ");
	//  209  404:aload           11
	//  210  406:ldc2            #322 <String ", ">
	//  211  409:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//  212  412:pop             
					((StringBuilder) (obj1)).append(l1);
	//  213  413:aload           11
	//  214  415:lload           5
	//  215  417:invokevirtual   #320 <Method StringBuilder StringBuilder.append(long)>
	//  216  420:pop             
					((StringBuilder) (obj1)).append(", ");
	//  217  421:aload           11
	//  218  423:ldc2            #322 <String ", ">
	//  219  426:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//  220  429:pop             
					((StringBuilder) (obj1)).append(l);
	//  221  430:aload           11
	//  222  432:lload_3         
	//  223  433:invokevirtual   #320 <Method StringBuilder StringBuilder.append(long)>
	//  224  436:pop             
					obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//  225  437:aload           11
	//  226  439:invokevirtual   #245 <Method String StringBuilder.toString()>
	//  227  442:astore          11
					if(!failOnSpuriousAudioTimestamp)
	//* 228  444:getstatic       #324 <Field boolean failOnSpuriousAudioTimestamp>
	//* 229  447:ifne            466
					{
						Log.w("AudioTrack", ((String) (obj1)));
	//  230  450:ldc1            #63  <String "AudioTrack">
	//  231  452:aload           11
	//  232  454:invokestatic    #330 <Method int Log.w(String, String)>
	//  233  457:pop             
						audioTimestampSet = false;
	//  234  458:aload_0         
	//  235  459:iconst_0        
	//  236  460:putfield        #302 <Field boolean audioTimestampSet>
					} else
	//* 237  463:goto            476
					{
						throw new InvalidAudioTrackTimestampException(((String) (obj1)));
	//  238  466:new             #22  <Class AudioTrack$InvalidAudioTrackTimestampException>
	//  239  469:dup             
	//  240  470:aload           11
	//  241  472:invokespecial   #331 <Method void AudioTrack$InvalidAudioTrackTimestampException(String)>
	//  242  475:athrow          
					}
				}
			}
			Method method = getLatencyMethod;
	//  243  476:aload_0         
	//  244  477:getfield        #149 <Field Method getLatencyMethod>
	//  245  480:astore          11
			if(method != null && !passthrough)
	//* 246  482:aload           11
	//* 247  484:ifnull          602
	//* 248  487:aload_0         
	//* 249  488:getfield        #257 <Field boolean passthrough>
	//* 250  491:ifne            602
				try
				{
					latencyUs = (long)((Integer)method.invoke(((Object) (audioTrack)), (Object[])null)).intValue() * 1000L - bufferSizeUs;
	//  251  494:aload_0         
	//  252  495:aload           11
	//  253  497:aload_0         
	//  254  498:getfield        #171 <Field android.media.AudioTrack audioTrack>
	//  255  501:aconst_null     
	//  256  502:checkcast       #337 <Class Object[]>
	//  257  505:invokevirtual   #343 <Method Object Method.invoke(Object, Object[])>
	//  258  508:checkcast       #345 <Class Integer>
	//  259  511:invokevirtual   #348 <Method int Integer.intValue()>
	//  260  514:i2l             
	//  261  515:ldc2w           #279 <Long 1000L>
	//  262  518:lmul            
	//  263  519:aload_0         
	//  264  520:getfield        #350 <Field long bufferSizeUs>
	//  265  523:lsub            
	//  266  524:putfield        #352 <Field long latencyUs>
					latencyUs = Math.max(latencyUs, 0L);
	//  267  527:aload_0         
	//  268  528:aload_0         
	//  269  529:getfield        #352 <Field long latencyUs>
	//  270  532:lconst_0        
	//  271  533:invokestatic    #356 <Method long Math.max(long, long)>
	//  272  536:putfield        #352 <Field long latencyUs>
					if(latencyUs > 0x4c4b40L)
	//* 273  539:aload_0         
	//* 274  540:getfield        #352 <Field long latencyUs>
	//* 275  543:ldc2w           #35  <Long 0x4c4b40L>
	//* 276  546:lcmp            
	//* 277  547:ifle            602
					{
						StringBuilder stringbuilder = new StringBuilder();
	//  278  550:new             #229 <Class StringBuilder>
	//  279  553:dup             
	//  280  554:invokespecial   #230 <Method void StringBuilder()>
	//  281  557:astore          11
						stringbuilder.append("Ignoring impossibly large audio latency: ");
	//  282  559:aload           11
	//  283  561:ldc2            #358 <String "Ignoring impossibly large audio latency: ">
	//  284  564:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//  285  567:pop             
						stringbuilder.append(latencyUs);
	//  286  568:aload           11
	//  287  570:aload_0         
	//  288  571:getfield        #352 <Field long latencyUs>
	//  289  574:invokevirtual   #320 <Method StringBuilder StringBuilder.append(long)>
	//  290  577:pop             
						Log.w("AudioTrack", stringbuilder.toString());
	//  291  578:ldc1            #63  <String "AudioTrack">
	//  292  580:aload           11
	//  293  582:invokevirtual   #245 <Method String StringBuilder.toString()>
	//  294  585:invokestatic    #330 <Method int Log.w(String, String)>
	//  295  588:pop             
						latencyUs = 0L;
	//  296  589:aload_0         
	//  297  590:lconst_0        
	//  298  591:putfield        #352 <Field long latencyUs>
					}
				}
	//* 299  594:goto            602
	//* 300  597:aload_0         
	//* 301  598:aconst_null     
	//* 302  599:putfield        #149 <Field Method getLatencyMethod>
	//* 303  602:aload_0         
	//* 304  603:lload           5
	//* 305  605:putfield        #295 <Field long lastTimestampSampleTimeUs>
	//* 306  608:return          
				// Misplaced declaration of an exception variable
				catch(Exception exception)
				{
					getLatencyMethod = null;
				}
			lastTimestampSampleTimeUs = l1;
		}
	//* 307  609:astore          11
	//* 308  611:goto            597
	}

	private boolean needsPassthroughWorkarounds()
	{
		if(Util.SDK_INT < 23)
	//*   0    0:getstatic       #135 <Field int Util.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmpge          26
		{
			int i = targetEncoding;
	//    3    8:aload_0         
	//    4    9:getfield        #360 <Field int targetEncoding>
	//    5   12:istore_1        
			if(i == 5 || i == 6)
	//*   6   13:iload_1         
	//*   7   14:iconst_5        
	//*   8   15:icmpeq          24
	//*   9   18:iload_1         
	//*  10   19:bipush          6
	//*  11   21:icmpne          26
				return true;
	//   12   24:iconst_1        
	//   13   25:ireturn         
		}
		return false;
	//   14   26:iconst_0        
	//   15   27:ireturn         
	}

	private boolean overrideHasPendingData()
	{
		return needsPassthroughWorkarounds() && audioTrack.getPlayState() == 2 && audioTrack.getPlaybackHeadPosition() == 0;
	//    0    0:aload_0         
	//    1    1:invokespecial   #293 <Method boolean needsPassthroughWorkarounds()>
	//    2    4:ifeq            30
	//    3    7:aload_0         
	//    4    8:getfield        #171 <Field android.media.AudioTrack audioTrack>
	//    5   11:invokevirtual   #364 <Method int android.media.AudioTrack.getPlayState()>
	//    6   14:iconst_2        
	//    7   15:icmpne          30
	//    8   18:aload_0         
	//    9   19:getfield        #171 <Field android.media.AudioTrack audioTrack>
	//   10   22:invokevirtual   #367 <Method int android.media.AudioTrack.getPlaybackHeadPosition()>
	//   11   25:ifne            30
	//   12   28:iconst_1        
	//   13   29:ireturn         
	//   14   30:iconst_0        
	//   15   31:ireturn         
	}

	private long pcmBytesToFrames(long l)
	{
		return l / (long)pcmFrameSize;
	//    0    0:lload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #369 <Field int pcmFrameSize>
	//    3    5:i2l             
	//    4    6:ldiv            
	//    5    7:lreturn         
	}

	private void releaseKeepSessionIdAudioTrack()
	{
		final android.media.AudioTrack toRelease = keepSessionIdAudioTrack;
	//    0    0:aload_0         
	//    1    1:getfield        #372 <Field android.media.AudioTrack keepSessionIdAudioTrack>
	//    2    4:astore_1        
		if(toRelease == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			keepSessionIdAudioTrack = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #372 <Field android.media.AudioTrack keepSessionIdAudioTrack>
			((_cls2) (new Thread() {

				public void run()
				{
					toRelease.release();
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field android.media.AudioTrack val$toRelease>
				//    2    4:invokevirtual   #28  <Method void android.media.AudioTrack.release()>
				//    3    7:return          
				}

				final AudioTrack this$0;
				final android.media.AudioTrack val$toRelease;

			
			{
				this$0 = AudioTrack.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AudioTrack this$0>
				toRelease = audiotrack1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field android.media.AudioTrack val$toRelease>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #21  <Method void Thread()>
			//    8   14:return          
			}
			}
)).start();
	//    9   15:new             #8   <Class AudioTrack$2>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokespecial   #375 <Method void AudioTrack$2(AudioTrack, android.media.AudioTrack)>
	//   14   24:invokevirtual   #378 <Method void AudioTrack$2.start()>
			return;
	//   15   27:return          
		}
	}

	private static ByteBuffer resampleTo16BitPcm(ByteBuffer bytebuffer, int i, int j, int k, ByteBuffer bytebuffer1)
	{
		int l;
		ByteBuffer bytebuffer2;
label0:
		{
			if(k != 0x80000000)
	//*   0    0:iload_3         
	//*   1    1:ldc2            #381 <Int 0x80000000>
	//*   2    4:icmpeq          43
			{
				if(k != 3)
	//*   3    7:iload_3         
	//*   4    8:iconst_3        
	//*   5    9:icmpeq          35
				{
					if(k == 0x40000000)
	//*   6   12:iload_3         
	//*   7   13:ldc2            #382 <Int 0x40000000>
	//*   8   16:icmpne          27
						l = j / 2;
	//    9   19:iload_2         
	//   10   20:iconst_2        
	//   11   21:idiv            
	//   12   22:istore          5
					else
	//*  13   24:goto            50
						throw new IllegalStateException();
	//   14   27:new             #241 <Class IllegalStateException>
	//   15   30:dup             
	//   16   31:invokespecial   #383 <Method void IllegalStateException()>
	//   17   34:athrow          
				} else
				{
					l = j * 2;
	//   18   35:iload_2         
	//   19   36:iconst_2        
	//   20   37:imul            
	//   21   38:istore          5
				}
			} else
	//*  22   40:goto            50
			{
				l = (j / 3) * 2;
	//   23   43:iload_2         
	//   24   44:iconst_3        
	//   25   45:idiv            
	//   26   46:iconst_2        
	//   27   47:imul            
	//   28   48:istore          5
			}
			if(bytebuffer1 != null)
	//*  29   50:aload           4
	//*  30   52:ifnull          69
			{
				bytebuffer2 = bytebuffer1;
	//   31   55:aload           4
	//   32   57:astore          6
				if(bytebuffer1.capacity() >= l)
					break label0;
	//   33   59:aload           4
	//   34   61:invokevirtual   #388 <Method int ByteBuffer.capacity()>
	//   35   64:iload           5
	//   36   66:icmpge          76
			}
			bytebuffer2 = ByteBuffer.allocateDirect(l);
	//   37   69:iload           5
	//   38   71:invokestatic    #392 <Method ByteBuffer ByteBuffer.allocateDirect(int)>
	//   39   74:astore          6
		}
		bytebuffer2.position(0);
	//   40   76:aload           6
	//   41   78:iconst_0        
	//   42   79:invokevirtual   #396 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   43   82:pop             
		bytebuffer2.limit(l);
	//   44   83:aload           6
	//   45   85:iload           5
	//   46   87:invokevirtual   #399 <Method java.nio.Buffer ByteBuffer.limit(int)>
	//   47   90:pop             
		l = j + i;
	//   48   91:iload_2         
	//   49   92:iload_1         
	//   50   93:iadd            
	//   51   94:istore          5
		j = i;
	//   52   96:iload_1         
	//   53   97:istore_2        
		if(k != 0x80000000)
	//*  54   98:iload_3         
	//*  55   99:ldc2            #381 <Int 0x80000000>
	//*  56  102:icmpeq          206
		{
			j = i;
	//   57  105:iload_1         
	//   58  106:istore_2        
			if(k != 3)
	//*  59  107:iload_3         
	//*  60  108:iconst_3        
	//*  61  109:icmpeq          166
			{
				if(k == 0x40000000)
	//*  62  112:iload_3         
	//*  63  113:ldc2            #382 <Int 0x40000000>
	//*  64  116:icmpne          158
					for(; i < l; i += 4)
	//*  65  119:iload_1         
	//*  66  120:iload           5
	//*  67  122:icmpge          245
					{
						bytebuffer2.put(bytebuffer.get(i + 2));
	//   68  125:aload           6
	//   69  127:aload_0         
	//   70  128:iload_1         
	//   71  129:iconst_2        
	//   72  130:iadd            
	//   73  131:invokevirtual   #403 <Method byte ByteBuffer.get(int)>
	//   74  134:invokevirtual   #407 <Method ByteBuffer ByteBuffer.put(byte)>
	//   75  137:pop             
						bytebuffer2.put(bytebuffer.get(i + 3));
	//   76  138:aload           6
	//   77  140:aload_0         
	//   78  141:iload_1         
	//   79  142:iconst_3        
	//   80  143:iadd            
	//   81  144:invokevirtual   #403 <Method byte ByteBuffer.get(int)>
	//   82  147:invokevirtual   #407 <Method ByteBuffer ByteBuffer.put(byte)>
	//   83  150:pop             
					}

	//   84  151:iload_1         
	//   85  152:iconst_4        
	//   86  153:iadd            
	//   87  154:istore_1        
				else
	//*  88  155:goto            119
					throw new IllegalStateException();
	//   89  158:new             #241 <Class IllegalStateException>
	//   90  161:dup             
	//   91  162:invokespecial   #383 <Method void IllegalStateException()>
	//   92  165:athrow          
			} else
			{
				for(; j < l; j++)
	//*  93  166:iload_2         
	//*  94  167:iload           5
	//*  95  169:icmpge          245
				{
					bytebuffer2.put((byte)0);
	//   96  172:aload           6
	//   97  174:iconst_0        
	//   98  175:invokevirtual   #407 <Method ByteBuffer ByteBuffer.put(byte)>
	//   99  178:pop             
					bytebuffer2.put((byte)((bytebuffer.get(j) & 0xff) - 128));
	//  100  179:aload           6
	//  101  181:aload_0         
	//  102  182:iload_2         
	//  103  183:invokevirtual   #403 <Method byte ByteBuffer.get(int)>
	//  104  186:sipush          255
	//  105  189:iand            
	//  106  190:sipush          128
	//  107  193:isub            
	//  108  194:int2byte        
	//  109  195:invokevirtual   #407 <Method ByteBuffer ByteBuffer.put(byte)>
	//  110  198:pop             
				}

	//  111  199:iload_2         
	//  112  200:iconst_1        
	//  113  201:iadd            
	//  114  202:istore_2        
			}
		} else
	//* 115  203:goto            166
		{
			for(; j < l; j += 3)
	//* 116  206:iload_2         
	//* 117  207:iload           5
	//* 118  209:icmpge          245
			{
				bytebuffer2.put(bytebuffer.get(j + 1));
	//  119  212:aload           6
	//  120  214:aload_0         
	//  121  215:iload_2         
	//  122  216:iconst_1        
	//  123  217:iadd            
	//  124  218:invokevirtual   #403 <Method byte ByteBuffer.get(int)>
	//  125  221:invokevirtual   #407 <Method ByteBuffer ByteBuffer.put(byte)>
	//  126  224:pop             
				bytebuffer2.put(bytebuffer.get(j + 2));
	//  127  225:aload           6
	//  128  227:aload_0         
	//  129  228:iload_2         
	//  130  229:iconst_2        
	//  131  230:iadd            
	//  132  231:invokevirtual   #403 <Method byte ByteBuffer.get(int)>
	//  133  234:invokevirtual   #407 <Method ByteBuffer ByteBuffer.put(byte)>
	//  134  237:pop             
			}

	//  135  238:iload_2         
	//  136  239:iconst_3        
	//  137  240:iadd            
	//  138  241:istore_2        
		}
	//* 139  242:goto            206
		bytebuffer2.position(0);
	//  140  245:aload           6
	//  141  247:iconst_0        
	//  142  248:invokevirtual   #396 <Method java.nio.Buffer ByteBuffer.position(int)>
	//  143  251:pop             
		return bytebuffer2;
	//  144  252:aload           6
	//  145  254:areturn         
	}

	private void resetSyncParams()
	{
		smoothedPlayheadOffsetUs = 0L;
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:putfield        #290 <Field long smoothedPlayheadOffsetUs>
		playheadOffsetCount = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #288 <Field int playheadOffsetCount>
		nextPlayheadOffsetIndex = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #286 <Field int nextPlayheadOffsetIndex>
		lastPlayheadSampleTimeUs = 0L;
	//    9   15:aload_0         
	//   10   16:lconst_0        
	//   11   17:putfield        #282 <Field long lastPlayheadSampleTimeUs>
		audioTimestampSet = false;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #302 <Field boolean audioTimestampSet>
		lastTimestampSampleTimeUs = 0L;
	//   15   25:aload_0         
	//   16   26:lconst_0        
	//   17   27:putfield        #295 <Field long lastTimestampSampleTimeUs>
	//   18   30:return          
	}

	private void setAudioTrackVolume()
	{
		if(!isInitialized())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #269 <Method boolean isInitialized()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(Util.SDK_INT >= 21)
	//*   4    8:getstatic       #135 <Field int Util.SDK_INT>
	//*   5   11:bipush          21
	//*   6   13:icmplt          28
		{
			setAudioTrackVolumeV21(audioTrack, volume);
	//    7   16:aload_0         
	//    8   17:getfield        #171 <Field android.media.AudioTrack audioTrack>
	//    9   20:aload_0         
	//   10   21:getfield        #162 <Field float volume>
	//   11   24:invokestatic    #413 <Method void setAudioTrackVolumeV21(android.media.AudioTrack, float)>
			return;
	//   12   27:return          
		} else
		{
			setAudioTrackVolumeV3(audioTrack, volume);
	//   13   28:aload_0         
	//   14   29:getfield        #171 <Field android.media.AudioTrack audioTrack>
	//   15   32:aload_0         
	//   16   33:getfield        #162 <Field float volume>
	//   17   36:invokestatic    #416 <Method void setAudioTrackVolumeV3(android.media.AudioTrack, float)>
			return;
	//   18   39:return          
		}
	}

	private static void setAudioTrackVolumeV21(android.media.AudioTrack audiotrack, float f)
	{
		audiotrack.setVolume(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokevirtual   #423 <Method int android.media.AudioTrack.setVolume(float)>
	//    3    5:pop             
	//    4    6:return          
	}

	private static void setAudioTrackVolumeV3(android.media.AudioTrack audiotrack, float f)
	{
		audiotrack.setStereoVolume(f, f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_1         
	//    3    3:invokevirtual   #428 <Method int android.media.AudioTrack.setStereoVolume(float, float)>
	//    4    6:pop             
	//    5    7:return          
	}

	private static int writeNonBlockingV21(android.media.AudioTrack audiotrack, ByteBuffer bytebuffer, int i)
	{
		return audiotrack.write(bytebuffer, i, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_1        
	//    4    4:invokevirtual   #434 <Method int android.media.AudioTrack.write(ByteBuffer, int, int)>
	//    5    7:ireturn         
	}

	public void configure(String s, int i, int j, int k)
	{
		configure(s, i, j, k, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iconst_0        
	//    6    7:invokevirtual   #439 <Method void configure(String, int, int, int, int)>
	//    7   10:return          
	}

	public void configure(String s, int i, int j, int k, int l)
	{
		int k1;
label0:
		{
			char c = '\374';
	//    0    0:sipush          252
	//    1    3:istore          8
			int i1;
			switch(i)
	//*   2    5:iload_2         
			{
	//*   3    6:tableswitch     1 8: default 52
	//	               1 140
	//	               2 133
	//	               3 126
	//	               4 118
	//	               5 110
	//	               6 102
	//	               7 94
	//	               8 86
			default:
				s = ((String) (new StringBuilder()));
	//    4   52:new             #229 <Class StringBuilder>
	//    5   55:dup             
	//    6   56:invokespecial   #230 <Method void StringBuilder()>
	//    7   59:astore_1        
				((StringBuilder) (s)).append("Unsupported channel count: ");
	//    8   60:aload_1         
	//    9   61:ldc2            #441 <String "Unsupported channel count: ">
	//   10   64:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   11   67:pop             
				((StringBuilder) (s)).append(i);
	//   12   68:aload_1         
	//   13   69:iload_2         
	//   14   70:invokevirtual   #239 <Method StringBuilder StringBuilder.append(int)>
	//   15   73:pop             
				throw new IllegalArgumentException(((StringBuilder) (s)).toString());
	//   16   74:new             #443 <Class IllegalArgumentException>
	//   17   77:dup             
	//   18   78:aload_1         
	//   19   79:invokevirtual   #245 <Method String StringBuilder.toString()>
	//   20   82:invokespecial   #444 <Method void IllegalArgumentException(String)>
	//   21   85:athrow          

			case 8: // '\b'
				i1 = C.CHANNEL_OUT_7POINT1_SURROUND;
	//   22   86:getstatic       #449 <Field int C.CHANNEL_OUT_7POINT1_SURROUND>
	//   23   89:istore          6
				break;

	//*  24   91:goto            143
			case 7: // '\007'
				i1 = 1276;
	//   25   94:sipush          1276
	//   26   97:istore          6
				break;

	//*  27   99:goto            143
			case 6: // '\006'
				i1 = 252;
	//   28  102:sipush          252
	//   29  105:istore          6
				break;

	//*  30  107:goto            143
			case 5: // '\005'
				i1 = 220;
	//   31  110:sipush          220
	//   32  113:istore          6
				break;

	//*  33  115:goto            143
			case 4: // '\004'
				i1 = 204;
	//   34  118:sipush          204
	//   35  121:istore          6
				break;

	//*  36  123:goto            143
			case 3: // '\003'
				i1 = 28;
	//   37  126:bipush          28
	//   38  128:istore          6
				break;

	//*  39  130:goto            143
			case 2: // '\002'
				i1 = 12;
	//   40  133:bipush          12
	//   41  135:istore          6
				break;

	//*  42  137:goto            143
			case 1: // '\001'
				i1 = 4;
	//   43  140:iconst_4        
	//   44  141:istore          6
				break;
			}
			if(Util.SDK_INT <= 23 && "foster".equals(((Object) (Util.DEVICE))) && "NVIDIA".equals(((Object) (Util.MANUFACTURER))))
	//*  45  143:getstatic       #135 <Field int Util.SDK_INT>
	//*  46  146:bipush          23
	//*  47  148:icmpgt          210
	//*  48  151:ldc2            #451 <String "foster">
	//*  49  154:getstatic       #454 <Field String Util.DEVICE>
	//*  50  157:invokevirtual   #210 <Method boolean String.equals(Object)>
	//*  51  160:ifeq            210
	//*  52  163:ldc2            #456 <String "NVIDIA">
	//*  53  166:getstatic       #459 <Field String Util.MANUFACTURER>
	//*  54  169:invokevirtual   #210 <Method boolean String.equals(Object)>
	//*  55  172:ifeq            210
			{
				k1 = ((int) (c));
	//   56  175:iload           8
	//   57  177:istore          7
				if(i == 3)
					break label0;
	//   58  179:iload_2         
	//   59  180:iconst_3        
	//   60  181:icmpeq          214
				k1 = ((int) (c));
	//   61  184:iload           8
	//   62  186:istore          7
				if(i == 5)
					break label0;
	//   63  188:iload_2         
	//   64  189:iconst_5        
	//   65  190:icmpeq          214
				if(i == 7)
	//*  66  193:iload_2         
	//*  67  194:bipush          7
	//*  68  196:icmpeq          202
	//*  69  199:goto            210
				{
					k1 = C.CHANNEL_OUT_7POINT1_SURROUND;
	//   70  202:getstatic       #449 <Field int C.CHANNEL_OUT_7POINT1_SURROUND>
	//   71  205:istore          7
					break label0;
	//   72  207:goto            214
				}
			}
			k1 = i1;
	//   73  210:iload           6
	//   74  212:istore          7
		}
		boolean flag1 = "audio/raw".equals(((Object) (s)));
	//   75  214:ldc2            #461 <String "audio/raw">
	//   76  217:aload_1         
	//   77  218:invokevirtual   #210 <Method boolean String.equals(Object)>
	//   78  221:istore          10
		boolean flag = true;
	//   79  223:iconst_1        
	//   80  224:istore          9
		flag1 ^= true;
	//   81  226:iload           10
	//   82  228:iconst_1        
	//   83  229:ixor            
	//   84  230:istore          10
		int l1 = k1;
	//   85  232:iload           7
	//   86  234:istore          8
		if(Util.SDK_INT <= 25)
	//*  87  236:getstatic       #135 <Field int Util.SDK_INT>
	//*  88  239:bipush          25
	//*  89  241:icmpgt          282
		{
			l1 = k1;
	//   90  244:iload           7
	//   91  246:istore          8
			if("fugu".equals(((Object) (Util.DEVICE))))
	//*  92  248:ldc2            #463 <String "fugu">
	//*  93  251:getstatic       #454 <Field String Util.DEVICE>
	//*  94  254:invokevirtual   #210 <Method boolean String.equals(Object)>
	//*  95  257:ifeq            282
			{
				l1 = k1;
	//   96  260:iload           7
	//   97  262:istore          8
				if(flag1)
	//*  98  264:iload           10
	//*  99  266:ifeq            282
				{
					l1 = k1;
	//  100  269:iload           7
	//  101  271:istore          8
					if(i == 1)
	//* 102  273:iload_2         
	//* 103  274:iconst_1        
	//* 104  275:icmpne          282
						l1 = 12;
	//  105  278:bipush          12
	//  106  280:istore          8
				}
			}
		}
		int j1;
		if(flag1)
	//* 107  282:iload           10
	//* 108  284:ifeq            296
		{
			j1 = getEncodingForMimeType(s);
	//  109  287:aload_1         
	//  110  288:invokestatic    #465 <Method int getEncodingForMimeType(String)>
	//  111  291:istore          6
		} else
	//* 112  293:goto            378
		{
			j1 = k;
	//  113  296:iload           4
	//  114  298:istore          6
			if(k != 3)
	//* 115  300:iload           4
	//* 116  302:iconst_3        
	//* 117  303:icmpeq          378
			{
				j1 = k;
	//  118  306:iload           4
	//  119  308:istore          6
				if(k != 2)
	//* 120  310:iload           4
	//* 121  312:iconst_2        
	//* 122  313:icmpeq          378
				{
					j1 = k;
	//  123  316:iload           4
	//  124  318:istore          6
					if(k != 0x80000000)
	//* 125  320:iload           4
	//* 126  322:ldc2            #381 <Int 0x80000000>
	//* 127  325:icmpeq          378
						if(k == 0x40000000)
	//* 128  328:iload           4
	//* 129  330:ldc2            #382 <Int 0x40000000>
	//* 130  333:icmpne          343
						{
							j1 = k;
	//  131  336:iload           4
	//  132  338:istore          6
						} else
	//* 133  340:goto            378
						{
							s = ((String) (new StringBuilder()));
	//  134  343:new             #229 <Class StringBuilder>
	//  135  346:dup             
	//  136  347:invokespecial   #230 <Method void StringBuilder()>
	//  137  350:astore_1        
							((StringBuilder) (s)).append("Unsupported PCM encoding: ");
	//  138  351:aload_1         
	//  139  352:ldc2            #467 <String "Unsupported PCM encoding: ">
	//  140  355:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//  141  358:pop             
							((StringBuilder) (s)).append(k);
	//  142  359:aload_1         
	//  143  360:iload           4
	//  144  362:invokevirtual   #239 <Method StringBuilder StringBuilder.append(int)>
	//  145  365:pop             
							throw new IllegalArgumentException(((StringBuilder) (s)).toString());
	//  146  366:new             #443 <Class IllegalArgumentException>
	//  147  369:dup             
	//  148  370:aload_1         
	//  149  371:invokevirtual   #245 <Method String StringBuilder.toString()>
	//  150  374:invokespecial   #444 <Method void IllegalArgumentException(String)>
	//  151  377:athrow          
						}
				}
			}
		}
		if(isInitialized() && sourceEncoding == j1 && sampleRate == j && channelConfig == l1)
	//* 152  378:aload_0         
	//* 153  379:invokevirtual   #269 <Method boolean isInitialized()>
	//* 154  382:ifeq            412
	//* 155  385:aload_0         
	//* 156  386:getfield        #469 <Field int sourceEncoding>
	//* 157  389:iload           6
	//* 158  391:icmpne          412
	//* 159  394:aload_0         
	//* 160  395:getfield        #180 <Field int sampleRate>
	//* 161  398:iload_3         
	//* 162  399:icmpne          412
	//* 163  402:aload_0         
	//* 164  403:getfield        #182 <Field int channelConfig>
	//* 165  406:iload           8
	//* 166  408:icmpne          412
			return;
	//  167  411:return          
		reset();
	//  168  412:aload_0         
	//  169  413:invokevirtual   #472 <Method void reset()>
		sourceEncoding = j1;
	//  170  416:aload_0         
	//  171  417:iload           6
	//  172  419:putfield        #469 <Field int sourceEncoding>
		passthrough = flag1;
	//  173  422:aload_0         
	//  174  423:iload           10
	//  175  425:putfield        #257 <Field boolean passthrough>
		sampleRate = j;
	//  176  428:aload_0         
	//  177  429:iload_3         
	//  178  430:putfield        #180 <Field int sampleRate>
		channelConfig = l1;
	//  179  433:aload_0         
	//  180  434:iload           8
	//  181  436:putfield        #182 <Field int channelConfig>
		if(!flag1)
	//* 182  439:iload           10
	//* 183  441:ifeq            447
	//* 184  444:goto            450
			j1 = 2;
	//  185  447:iconst_2        
	//  186  448:istore          6
		targetEncoding = j1;
	//  187  450:aload_0         
	//  188  451:iload           6
	//  189  453:putfield        #360 <Field int targetEncoding>
		pcmFrameSize = i * 2;
	//  190  456:aload_0         
	//  191  457:iload_2         
	//  192  458:iconst_2        
	//  193  459:imul            
	//  194  460:putfield        #369 <Field int pcmFrameSize>
		if(l != 0)
	//* 195  463:iload           5
	//* 196  465:ifeq            477
			bufferSize = l;
	//  197  468:aload_0         
	//  198  469:iload           5
	//  199  471:putfield        #184 <Field int bufferSize>
		else
	//* 200  474:goto            619
		if(flag1)
	//* 201  477:iload           10
	//* 202  479:ifeq            521
		{
			i = targetEncoding;
	//  203  482:aload_0         
	//  204  483:getfield        #360 <Field int targetEncoding>
	//  205  486:istore_2        
			if(i != 5 && i != 6)
	//* 206  487:iload_2         
	//* 207  488:iconst_5        
	//* 208  489:icmpeq          511
	//* 209  492:iload_2         
	//* 210  493:bipush          6
	//* 211  495:icmpne          501
	//* 212  498:goto            511
				bufferSize = 49152;
	//  213  501:aload_0         
	//  214  502:ldc2            #473 <Int 49152>
	//  215  505:putfield        #184 <Field int bufferSize>
			else
	//* 216  508:goto            619
				bufferSize = 20480;
	//  217  511:aload_0         
	//  218  512:sipush          20480
	//  219  515:putfield        #184 <Field int bufferSize>
		} else
	//* 220  518:goto            619
		{
			k = android.media.AudioTrack.getMinBufferSize(j, l1, targetEncoding);
	//  221  521:iload_3         
	//  222  522:iload           8
	//  223  524:aload_0         
	//  224  525:getfield        #360 <Field int targetEncoding>
	//  225  528:invokestatic    #477 <Method int android.media.AudioTrack.getMinBufferSize(int, int, int)>
	//  226  531:istore          4
			if(k == -2)
	//* 227  533:iload           4
	//* 228  535:bipush          -2
	//* 229  537:icmpeq          543
	//* 230  540:goto            546
				flag = false;
	//  231  543:iconst_0        
	//  232  544:istore          9
			Assertions.checkState(flag);
	//  233  546:iload           9
	//  234  548:invokestatic    #482 <Method void Assertions.checkState(boolean)>
			i = k * 4;
	//  235  551:iload           4
	//  236  553:iconst_4        
	//  237  554:imul            
	//  238  555:istore_2        
			j = (int)durationUsToFrames(0x3d090L) * pcmFrameSize;
	//  239  556:aload_0         
	//  240  557:ldc2w           #44  <Long 0x3d090L>
	//  241  560:invokespecial   #484 <Method long durationUsToFrames(long)>
	//  242  563:l2i             
	//  243  564:aload_0         
	//  244  565:getfield        #369 <Field int pcmFrameSize>
	//  245  568:imul            
	//  246  569:istore_3        
			k = (int)Math.max(k, durationUsToFrames(0xb71b0L) * (long)pcmFrameSize);
	//  247  570:iload           4
	//  248  572:i2l             
	//  249  573:aload_0         
	//  250  574:ldc2w           #38  <Long 0xb71b0L>
	//  251  577:invokespecial   #484 <Method long durationUsToFrames(long)>
	//  252  580:aload_0         
	//  253  581:getfield        #369 <Field int pcmFrameSize>
	//  254  584:i2l             
	//  255  585:lmul            
	//  256  586:invokestatic    #356 <Method long Math.max(long, long)>
	//  257  589:l2i             
	//  258  590:istore          4
			if(i < j)
	//* 259  592:iload_2         
	//* 260  593:iload_3         
	//* 261  594:icmpge          602
				i = j;
	//  262  597:iload_3         
	//  263  598:istore_2        
			else
	//* 264  599:goto            614
			if(i > k)
	//* 265  602:iload_2         
	//* 266  603:iload           4
	//* 267  605:icmple          614
				i = k;
	//  268  608:iload           4
	//  269  610:istore_2        
	//* 270  611:goto            614
			bufferSize = i;
	//  271  614:aload_0         
	//  272  615:iload_2         
	//  273  616:putfield        #184 <Field int bufferSize>
		}
		long l2;
		if(flag1)
	//* 274  619:iload           10
	//* 275  621:ifeq            632
			l2 = -1L;
	//  276  624:ldc2w           #485 <Long -1L>
	//  277  627:lstore          11
		else
	//* 278  629:goto            647
			l2 = framesToDurationUs(pcmBytesToFrames(bufferSize));
	//  279  632:aload_0         
	//  280  633:aload_0         
	//  281  634:aload_0         
	//  282  635:getfield        #184 <Field int bufferSize>
	//  283  638:i2l             
	//  284  639:invokespecial   #264 <Method long pcmBytesToFrames(long)>
	//  285  642:invokespecial   #333 <Method long framesToDurationUs(long)>
	//  286  645:lstore          11
		bufferSizeUs = l2;
	//  287  647:aload_0         
	//  288  648:lload           11
	//  289  650:putfield        #350 <Field long bufferSizeUs>
	//  290  653:return          
	}

	public int getBufferSize()
	{
		return bufferSize;
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field int bufferSize>
	//    2    4:ireturn         
	}

	public long getBufferSizeUs()
	{
		return bufferSizeUs;
	//    0    0:aload_0         
	//    1    1:getfield        #350 <Field long bufferSizeUs>
	//    2    4:lreturn         
	}

	public long getCurrentPositionUs(boolean flag)
	{
		if(!hasCurrentPositionUs())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #492 <Method boolean hasCurrentPositionUs()>
	//*   2    4:ifne            11
			return 0x0L;
	//    3    7:ldc2w           #32  <Long 0x0L>
	//    4   10:lreturn         
		if(audioTrack.getPlayState() == 3)
	//*   5   11:aload_0         
	//*   6   12:getfield        #171 <Field android.media.AudioTrack audioTrack>
	//*   7   15:invokevirtual   #364 <Method int android.media.AudioTrack.getPlayState()>
	//*   8   18:iconst_3        
	//*   9   19:icmpne          26
			maybeSampleSyncParams();
	//   10   22:aload_0         
	//   11   23:invokespecial   #494 <Method void maybeSampleSyncParams()>
		long l = System.nanoTime() / 1000L;
	//   12   26:invokestatic    #278 <Method long System.nanoTime()>
	//   13   29:ldc2w           #279 <Long 1000L>
	//   14   32:ldiv            
	//   15   33:lstore_2        
		if(audioTimestampSet)
	//*  16   34:aload_0         
	//*  17   35:getfield        #302 <Field boolean audioTimestampSet>
	//*  18   38:ifeq            88
		{
			l = durationUsToFrames((long)((float)(l - audioTrackUtil.getTimestampNanoTime() / 1000L) * audioTrackUtil.getPlaybackSpeed()));
	//   19   41:aload_0         
	//   20   42:lload_2         
	//   21   43:aload_0         
	//   22   44:getfield        #152 <Field AudioTrack$AudioTrackUtil audioTrackUtil>
	//   23   47:invokevirtual   #305 <Method long AudioTrack$AudioTrackUtil.getTimestampNanoTime()>
	//   24   50:ldc2w           #279 <Long 1000L>
	//   25   53:ldiv            
	//   26   54:lsub            
	//   27   55:l2f             
	//   28   56:aload_0         
	//   29   57:getfield        #152 <Field AudioTrack$AudioTrackUtil audioTrackUtil>
	//   30   60:invokevirtual   #498 <Method float AudioTrack$AudioTrackUtil.getPlaybackSpeed()>
	//   31   63:fmul            
	//   32   64:f2l             
	//   33   65:invokespecial   #484 <Method long durationUsToFrames(long)>
	//   34   68:lstore_2        
			return framesToDurationUs(audioTrackUtil.getTimestampFramePosition() + l) + startMediaTimeUs;
	//   35   69:aload_0         
	//   36   70:aload_0         
	//   37   71:getfield        #152 <Field AudioTrack$AudioTrackUtil audioTrackUtil>
	//   38   74:invokevirtual   #308 <Method long AudioTrack$AudioTrackUtil.getTimestampFramePosition()>
	//   39   77:lload_2         
	//   40   78:ladd            
	//   41   79:invokespecial   #333 <Method long framesToDurationUs(long)>
	//   42   82:aload_0         
	//   43   83:getfield        #500 <Field long startMediaTimeUs>
	//   44   86:ladd            
	//   45   87:lreturn         
		}
		if(playheadOffsetCount == 0)
	//*  46   88:aload_0         
	//*  47   89:getfield        #288 <Field int playheadOffsetCount>
	//*  48   92:ifne            111
			l = audioTrackUtil.getPlaybackHeadPositionUs() + startMediaTimeUs;
	//   49   95:aload_0         
	//   50   96:getfield        #152 <Field AudioTrack$AudioTrackUtil audioTrackUtil>
	//   51   99:invokevirtual   #273 <Method long AudioTrack$AudioTrackUtil.getPlaybackHeadPositionUs()>
	//   52  102:aload_0         
	//   53  103:getfield        #500 <Field long startMediaTimeUs>
	//   54  106:ladd            
	//   55  107:lstore_2        
		else
	//*  56  108:goto            123
			l = l + smoothedPlayheadOffsetUs + startMediaTimeUs;
	//   57  111:lload_2         
	//   58  112:aload_0         
	//   59  113:getfield        #290 <Field long smoothedPlayheadOffsetUs>
	//   60  116:ladd            
	//   61  117:aload_0         
	//   62  118:getfield        #500 <Field long startMediaTimeUs>
	//   63  121:ladd            
	//   64  122:lstore_2        
		long l1 = l;
	//   65  123:lload_2         
	//   66  124:lstore          4
		if(!flag)
	//*  67  126:iload_1         
	//*  68  127:ifne            138
			l1 = l - latencyUs;
	//   69  130:lload_2         
	//   70  131:aload_0         
	//   71  132:getfield        #352 <Field long latencyUs>
	//   72  135:lsub            
	//   73  136:lstore          4
		return l1;
	//   74  138:lload           4
	//   75  140:lreturn         
	}

	public int handleBuffer(ByteBuffer bytebuffer, int i, int j, long l)
		throws WriteException
	{
		boolean flag;
		Object obj;
label0:
		{
label1:
			{
				int k;
label2:
				{
					boolean flag2 = needsPassthroughWorkarounds();
	//    0    0:aload_0         
	//    1    1:invokespecial   #293 <Method boolean needsPassthroughWorkarounds()>
	//    2    4:istore          11
					boolean flag1 = true;
	//    3    6:iconst_1        
	//    4    7:istore          8
					flag = false;
	//    5    9:iconst_0        
	//    6   10:istore          7
					if(flag2)
	//*   7   12:iload           11
	//*   8   14:ifeq            55
					{
						if(audioTrack.getPlayState() == 2)
	//*   9   17:aload_0         
	//*  10   18:getfield        #171 <Field android.media.AudioTrack audioTrack>
	//*  11   21:invokevirtual   #364 <Method int android.media.AudioTrack.getPlayState()>
	//*  12   24:iconst_2        
	//*  13   25:icmpne          30
							return 0;
	//   14   28:iconst_0        
	//   15   29:ireturn         
						if(audioTrack.getPlayState() == 1 && audioTrackUtil.getPlaybackHeadPosition() != 0L)
	//*  16   30:aload_0         
	//*  17   31:getfield        #171 <Field android.media.AudioTrack audioTrack>
	//*  18   34:invokevirtual   #364 <Method int android.media.AudioTrack.getPlayState()>
	//*  19   37:iconst_1        
	//*  20   38:icmpne          55
	//*  21   41:aload_0         
	//*  22   42:getfield        #152 <Field AudioTrack$AudioTrackUtil audioTrackUtil>
	//*  23   45:invokevirtual   #504 <Method long AudioTrack$AudioTrackUtil.getPlaybackHeadPosition()>
	//*  24   48:lconst_0        
	//*  25   49:lcmp            
	//*  26   50:ifeq            55
							return 0;
	//   27   53:iconst_0        
	//   28   54:ireturn         
					}
					if(bufferBytesRemaining != 0)
						break label1;
	//   29   55:aload_0         
	//   30   56:getfield        #506 <Field int bufferBytesRemaining>
	//   31   59:ifne            435
					if(j == 0)
	//*  32   62:iload_3         
	//*  33   63:ifne            68
						return 2;
	//   34   66:iconst_2        
	//   35   67:ireturn         
					if(targetEncoding != sourceEncoding)
	//*  36   68:aload_0         
	//*  37   69:getfield        #360 <Field int targetEncoding>
	//*  38   72:aload_0         
	//*  39   73:getfield        #469 <Field int sourceEncoding>
	//*  40   76:icmpeq          85
						flag2 = true;
	//   41   79:iconst_1        
	//   42   80:istore          11
					else
	//*  43   82:goto            88
						flag2 = false;
	//   44   85:iconst_0        
	//   45   86:istore          11
					useResampledBuffer = flag2;
	//   46   88:aload_0         
	//   47   89:iload           11
	//   48   91:putfield        #508 <Field boolean useResampledBuffer>
					if(useResampledBuffer)
	//*  49   94:aload_0         
	//*  50   95:getfield        #508 <Field boolean useResampledBuffer>
	//*  51   98:ifeq            163
					{
						boolean flag3;
						if(targetEncoding == 2)
	//*  52  101:aload_0         
	//*  53  102:getfield        #360 <Field int targetEncoding>
	//*  54  105:iconst_2        
	//*  55  106:icmpne          115
							flag3 = true;
	//   56  109:iconst_1        
	//   57  110:istore          11
						else
	//*  58  112:goto            118
							flag3 = false;
	//   59  115:iconst_0        
	//   60  116:istore          11
						Assertions.checkState(flag3);
	//   61  118:iload           11
	//   62  120:invokestatic    #482 <Method void Assertions.checkState(boolean)>
						resampledBuffer = resampleTo16BitPcm(bytebuffer, i, j, sourceEncoding, resampledBuffer);
	//   63  123:aload_0         
	//   64  124:aload_1         
	//   65  125:iload_2         
	//   66  126:iload_3         
	//   67  127:aload_0         
	//   68  128:getfield        #469 <Field int sourceEncoding>
	//   69  131:aload_0         
	//   70  132:getfield        #510 <Field ByteBuffer resampledBuffer>
	//   71  135:invokestatic    #512 <Method ByteBuffer resampleTo16BitPcm(ByteBuffer, int, int, int, ByteBuffer)>
	//   72  138:putfield        #510 <Field ByteBuffer resampledBuffer>
						bytebuffer = resampledBuffer;
	//   73  141:aload_0         
	//   74  142:getfield        #510 <Field ByteBuffer resampledBuffer>
	//   75  145:astore_1        
						i = bytebuffer.position();
	//   76  146:aload_1         
	//   77  147:invokevirtual   #514 <Method int ByteBuffer.position()>
	//   78  150:istore_2        
						k = resampledBuffer.limit();
	//   79  151:aload_0         
	//   80  152:getfield        #510 <Field ByteBuffer resampledBuffer>
	//   81  155:invokevirtual   #516 <Method int ByteBuffer.limit()>
	//   82  158:istore          6
					} else
	//*  83  160:goto            166
					{
						k = j;
	//   84  163:iload_3         
	//   85  164:istore          6
					}
					bufferBytesRemaining = k;
	//   86  166:aload_0         
	//   87  167:iload           6
	//   88  169:putfield        #506 <Field int bufferBytesRemaining>
					bytebuffer.position(i);
	//   89  172:aload_1         
	//   90  173:iload_2         
	//   91  174:invokevirtual   #396 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   92  177:pop             
					if(passthrough && framesPerEncodedSample == 0)
	//*  93  178:aload_0         
	//*  94  179:getfield        #257 <Field boolean passthrough>
	//*  95  182:ifeq            204
	//*  96  185:aload_0         
	//*  97  186:getfield        #518 <Field int framesPerEncodedSample>
	//*  98  189:ifne            204
						framesPerEncodedSample = getFramesPerEncodedSample(targetEncoding, bytebuffer);
	//   99  192:aload_0         
	//  100  193:aload_0         
	//  101  194:getfield        #360 <Field int targetEncoding>
	//  102  197:aload_1         
	//  103  198:invokestatic    #520 <Method int getFramesPerEncodedSample(int, ByteBuffer)>
	//  104  201:putfield        #518 <Field int framesPerEncodedSample>
					if(startMediaTimeState == 0)
	//* 105  204:aload_0         
	//* 106  205:getfield        #164 <Field int startMediaTimeState>
	//* 107  208:ifne            229
					{
						startMediaTimeUs = Math.max(0L, l);
	//  108  211:aload_0         
	//  109  212:lconst_0        
	//  110  213:lload           4
	//  111  215:invokestatic    #356 <Method long Math.max(long, long)>
	//  112  218:putfield        #500 <Field long startMediaTimeUs>
						startMediaTimeState = 1;
	//  113  221:aload_0         
	//  114  222:iconst_1        
	//  115  223:putfield        #164 <Field int startMediaTimeState>
					} else
	//* 116  226:goto            368
					{
						long l1 = startMediaTimeUs + framesToDurationUs(getSubmittedFrames());
	//  117  229:aload_0         
	//  118  230:getfield        #500 <Field long startMediaTimeUs>
	//  119  233:aload_0         
	//  120  234:aload_0         
	//  121  235:invokespecial   #522 <Method long getSubmittedFrames()>
	//  122  238:invokespecial   #333 <Method long framesToDurationUs(long)>
	//  123  241:ladd            
	//  124  242:lstore          9
						if(startMediaTimeState == 1 && Math.abs(l1 - l) > 0x30d40L)
	//* 125  244:aload_0         
	//* 126  245:getfield        #164 <Field int startMediaTimeState>
	//* 127  248:iconst_1        
	//* 128  249:icmpne          335
	//* 129  252:lload           9
	//* 130  254:lload           4
	//* 131  256:lsub            
	//* 132  257:invokestatic    #315 <Method long Math.abs(long)>
	//* 133  260:ldc2w           #523 <Long 0x30d40L>
	//* 134  263:lcmp            
	//* 135  264:ifle            335
						{
							StringBuilder stringbuilder = new StringBuilder();
	//  136  267:new             #229 <Class StringBuilder>
	//  137  270:dup             
	//  138  271:invokespecial   #230 <Method void StringBuilder()>
	//  139  274:astore          12
							stringbuilder.append("Discontinuity detected [expected ");
	//  140  276:aload           12
	//  141  278:ldc2            #526 <String "Discontinuity detected [expected ">
	//  142  281:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//  143  284:pop             
							stringbuilder.append(l1);
	//  144  285:aload           12
	//  145  287:lload           9
	//  146  289:invokevirtual   #320 <Method StringBuilder StringBuilder.append(long)>
	//  147  292:pop             
							stringbuilder.append(", got ");
	//  148  293:aload           12
	//  149  295:ldc2            #528 <String ", got ">
	//  150  298:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//  151  301:pop             
							stringbuilder.append(l);
	//  152  302:aload           12
	//  153  304:lload           4
	//  154  306:invokevirtual   #320 <Method StringBuilder StringBuilder.append(long)>
	//  155  309:pop             
							stringbuilder.append("]");
	//  156  310:aload           12
	//  157  312:ldc2            #530 <String "]">
	//  158  315:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//  159  318:pop             
							Log.e("AudioTrack", stringbuilder.toString());
	//  160  319:ldc1            #63  <String "AudioTrack">
	//  161  321:aload           12
	//  162  323:invokevirtual   #245 <Method String StringBuilder.toString()>
	//  163  326:invokestatic    #533 <Method int Log.e(String, String)>
	//  164  329:pop             
							startMediaTimeState = 2;
	//  165  330:aload_0         
	//  166  331:iconst_2        
	//  167  332:putfield        #164 <Field int startMediaTimeState>
						}
						if(startMediaTimeState == 2)
	//* 168  335:aload_0         
	//* 169  336:getfield        #164 <Field int startMediaTimeState>
	//* 170  339:iconst_2        
	//* 171  340:icmpne          368
						{
							startMediaTimeUs = startMediaTimeUs + (l - l1);
	//  172  343:aload_0         
	//  173  344:aload_0         
	//  174  345:getfield        #500 <Field long startMediaTimeUs>
	//  175  348:lload           4
	//  176  350:lload           9
	//  177  352:lsub            
	//  178  353:ladd            
	//  179  354:putfield        #500 <Field long startMediaTimeUs>
							startMediaTimeState = 1;
	//  180  357:aload_0         
	//  181  358:iconst_1        
	//  182  359:putfield        #164 <Field int startMediaTimeState>
							j = ((int) (flag1));
	//  183  362:iload           8
	//  184  364:istore_3        
							break label2;
	//  185  365:goto            370
						}
					}
					j = 0;
	//  186  368:iconst_0        
	//  187  369:istore_3        
				}
				i = j;
	//  188  370:iload_3         
	//  189  371:istore_2        
				obj = ((Object) (bytebuffer));
	//  190  372:aload_1         
	//  191  373:astore          12
				if(Util.SDK_INT < 21)
	//* 192  375:getstatic       #135 <Field int Util.SDK_INT>
	//* 193  378:bipush          21
	//* 194  380:icmpge          440
				{
					obj = ((Object) (temporaryBuffer));
	//  195  383:aload_0         
	//  196  384:getfield        #535 <Field byte[] temporaryBuffer>
	//  197  387:astore          12
					if(obj == null || obj.length < k)
	//* 198  389:aload           12
	//* 199  391:ifnull          402
	//* 200  394:aload           12
	//* 201  396:arraylength     
	//* 202  397:iload           6
	//* 203  399:icmpge          410
						temporaryBuffer = new byte[k];
	//  204  402:aload_0         
	//  205  403:iload           6
	//  206  405:newarray        byte[]
	//  207  407:putfield        #535 <Field byte[] temporaryBuffer>
					bytebuffer.get(temporaryBuffer, 0, k);
	//  208  410:aload_1         
	//  209  411:aload_0         
	//  210  412:getfield        #535 <Field byte[] temporaryBuffer>
	//  211  415:iconst_0        
	//  212  416:iload           6
	//  213  418:invokevirtual   #538 <Method ByteBuffer ByteBuffer.get(byte[], int, int)>
	//  214  421:pop             
					temporaryBufferOffset = 0;
	//  215  422:aload_0         
	//  216  423:iconst_0        
	//  217  424:putfield        #540 <Field int temporaryBufferOffset>
					i = j;
	//  218  427:iload_3         
	//  219  428:istore_2        
					obj = ((Object) (bytebuffer));
	//  220  429:aload_1         
	//  221  430:astore          12
				}
				break label0;
	//  222  432:goto            440
			}
			i = 0;
	//  223  435:iconst_0        
	//  224  436:istore_2        
			obj = ((Object) (bytebuffer));
	//  225  437:aload_1         
	//  226  438:astore          12
		}
		if(Util.SDK_INT < 21)
	//* 227  440:getstatic       #135 <Field int Util.SDK_INT>
	//* 228  443:bipush          21
	//* 229  445:icmpge          537
		{
			j = (int)(submittedPcmBytes - audioTrackUtil.getPlaybackHeadPosition() * (long)pcmFrameSize);
	//  230  448:aload_0         
	//  231  449:getfield        #261 <Field long submittedPcmBytes>
	//  232  452:aload_0         
	//  233  453:getfield        #152 <Field AudioTrack$AudioTrackUtil audioTrackUtil>
	//  234  456:invokevirtual   #504 <Method long AudioTrack$AudioTrackUtil.getPlaybackHeadPosition()>
	//  235  459:aload_0         
	//  236  460:getfield        #369 <Field int pcmFrameSize>
	//  237  463:i2l             
	//  238  464:lmul            
	//  239  465:lsub            
	//  240  466:l2i             
	//  241  467:istore_3        
			int i1 = bufferSize - j;
	//  242  468:aload_0         
	//  243  469:getfield        #184 <Field int bufferSize>
	//  244  472:iload_3         
	//  245  473:isub            
	//  246  474:istore          6
			j = ((int) (flag));
	//  247  476:iload           7
	//  248  478:istore_3        
			if(i1 > 0)
	//* 249  479:iload           6
	//* 250  481:ifle            564
			{
				j = Math.min(bufferBytesRemaining, i1);
	//  251  484:aload_0         
	//  252  485:getfield        #506 <Field int bufferBytesRemaining>
	//  253  488:iload           6
	//  254  490:invokestatic    #544 <Method int Math.min(int, int)>
	//  255  493:istore_3        
				i1 = audioTrack.write(temporaryBuffer, temporaryBufferOffset, j);
	//  256  494:aload_0         
	//  257  495:getfield        #171 <Field android.media.AudioTrack audioTrack>
	//  258  498:aload_0         
	//  259  499:getfield        #535 <Field byte[] temporaryBuffer>
	//  260  502:aload_0         
	//  261  503:getfield        #540 <Field int temporaryBufferOffset>
	//  262  506:iload_3         
	//  263  507:invokevirtual   #547 <Method int android.media.AudioTrack.write(byte[], int, int)>
	//  264  510:istore          6
				j = i1;
	//  265  512:iload           6
	//  266  514:istore_3        
				if(i1 >= 0)
	//* 267  515:iload           6
	//* 268  517:iflt            564
				{
					temporaryBufferOffset = temporaryBufferOffset + i1;
	//  269  520:aload_0         
	//  270  521:aload_0         
	//  271  522:getfield        #540 <Field int temporaryBufferOffset>
	//  272  525:iload           6
	//  273  527:iadd            
	//  274  528:putfield        #540 <Field int temporaryBufferOffset>
					j = i1;
	//  275  531:iload           6
	//  276  533:istore_3        
				}
			}
		} else
	//* 277  534:goto            564
		{
			if(useResampledBuffer)
	//* 278  537:aload_0         
	//* 279  538:getfield        #508 <Field boolean useResampledBuffer>
	//* 280  541:ifeq            550
				obj = ((Object) (resampledBuffer));
	//  281  544:aload_0         
	//  282  545:getfield        #510 <Field ByteBuffer resampledBuffer>
	//  283  548:astore          12
			j = writeNonBlockingV21(audioTrack, ((ByteBuffer) (obj)), bufferBytesRemaining);
	//  284  550:aload_0         
	//  285  551:getfield        #171 <Field android.media.AudioTrack audioTrack>
	//  286  554:aload           12
	//  287  556:aload_0         
	//  288  557:getfield        #506 <Field int bufferBytesRemaining>
	//  289  560:invokestatic    #549 <Method int writeNonBlockingV21(android.media.AudioTrack, ByteBuffer, int)>
	//  290  563:istore_3        
		}
		if(j >= 0)
	//* 291  564:iload_3         
	//* 292  565:iflt            632
		{
			bufferBytesRemaining = bufferBytesRemaining - j;
	//  293  568:aload_0         
	//  294  569:aload_0         
	//  295  570:getfield        #506 <Field int bufferBytesRemaining>
	//  296  573:iload_3         
	//  297  574:isub            
	//  298  575:putfield        #506 <Field int bufferBytesRemaining>
			if(!passthrough)
	//* 299  578:aload_0         
	//* 300  579:getfield        #257 <Field boolean passthrough>
	//* 301  582:ifne            596
				submittedPcmBytes = submittedPcmBytes + (long)j;
	//  302  585:aload_0         
	//  303  586:aload_0         
	//  304  587:getfield        #261 <Field long submittedPcmBytes>
	//  305  590:iload_3         
	//  306  591:i2l             
	//  307  592:ladd            
	//  308  593:putfield        #261 <Field long submittedPcmBytes>
			j = i;
	//  309  596:iload_2         
	//  310  597:istore_3        
			if(bufferBytesRemaining == 0)
	//* 311  598:aload_0         
	//* 312  599:getfield        #506 <Field int bufferBytesRemaining>
	//* 313  602:ifne            630
			{
				if(passthrough)
	//* 314  605:aload_0         
	//* 315  606:getfield        #257 <Field boolean passthrough>
	//* 316  609:ifeq            626
					submittedEncodedFrames = submittedEncodedFrames + (long)framesPerEncodedSample;
	//  317  612:aload_0         
	//  318  613:aload_0         
	//  319  614:getfield        #259 <Field long submittedEncodedFrames>
	//  320  617:aload_0         
	//  321  618:getfield        #518 <Field int framesPerEncodedSample>
	//  322  621:i2l             
	//  323  622:ladd            
	//  324  623:putfield        #259 <Field long submittedEncodedFrames>
				j = i | 2;
	//  325  626:iload_2         
	//  326  627:iconst_2        
	//  327  628:ior             
	//  328  629:istore_3        
			}
			return j;
	//  329  630:iload_3         
	//  330  631:ireturn         
		} else
		{
			throw new WriteException(j);
	//  331  632:new             #25  <Class AudioTrack$WriteException>
	//  332  635:dup             
	//  333  636:iload_3         
	//  334  637:invokespecial   #552 <Method void AudioTrack$WriteException(int)>
	//  335  640:athrow          
		}
	}

	public void handleDiscontinuity()
	{
		if(startMediaTimeState == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #164 <Field int startMediaTimeState>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          13
			startMediaTimeState = 2;
	//    4    8:aload_0         
	//    5    9:iconst_2        
	//    6   10:putfield        #164 <Field int startMediaTimeState>
	//    7   13:return          
	}

	public void handleEndOfStream()
	{
		if(isInitialized())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #269 <Method boolean isInitialized()>
	//*   2    4:ifeq            18
			audioTrackUtil.handleEndOfStream(getSubmittedFrames());
	//    3    7:aload_0         
	//    4    8:getfield        #152 <Field AudioTrack$AudioTrackUtil audioTrackUtil>
	//    5   11:aload_0         
	//    6   12:invokespecial   #522 <Method long getSubmittedFrames()>
	//    7   15:invokevirtual   #557 <Method void AudioTrack$AudioTrackUtil.handleEndOfStream(long)>
	//    8   18:return          
	}

	public boolean hasPendingData()
	{
		return isInitialized() && (getSubmittedFrames() > audioTrackUtil.getPlaybackHeadPosition() || overrideHasPendingData());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #269 <Method boolean isInitialized()>
	//    2    4:ifeq            31
	//    3    7:aload_0         
	//    4    8:invokespecial   #522 <Method long getSubmittedFrames()>
	//    5   11:aload_0         
	//    6   12:getfield        #152 <Field AudioTrack$AudioTrackUtil audioTrackUtil>
	//    7   15:invokevirtual   #504 <Method long AudioTrack$AudioTrackUtil.getPlaybackHeadPosition()>
	//    8   18:lcmp            
	//    9   19:ifgt            29
	//   10   22:aload_0         
	//   11   23:invokespecial   #560 <Method boolean overrideHasPendingData()>
	//   12   26:ifeq            31
	//   13   29:iconst_1        
	//   14   30:ireturn         
	//   15   31:iconst_0        
	//   16   32:ireturn         
	}

	public int initialize()
		throws InitializationException
	{
		return initialize(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #564 <Method int initialize(int)>
	//    3    5:ireturn         
	}

	public int initialize(int i)
		throws InitializationException
	{
		releasingConditionVariable.block();
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field ConditionVariable releasingConditionVariable>
	//    2    4:invokevirtual   #567 <Method void ConditionVariable.block()>
		if(i == 0)
	//*   3    7:iload_1         
	//*   4    8:ifne            46
			audioTrack = new android.media.AudioTrack(streamType, sampleRate, channelConfig, targetEncoding, bufferSize, 1);
	//    5   11:aload_0         
	//    6   12:new             #137 <Class android.media.AudioTrack>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:getfield        #160 <Field int streamType>
	//   10   20:aload_0         
	//   11   21:getfield        #180 <Field int sampleRate>
	//   12   24:aload_0         
	//   13   25:getfield        #182 <Field int channelConfig>
	//   14   28:aload_0         
	//   15   29:getfield        #360 <Field int targetEncoding>
	//   16   32:aload_0         
	//   17   33:getfield        #184 <Field int bufferSize>
	//   18   36:iconst_1        
	//   19   37:invokespecial   #570 <Method void android.media.AudioTrack(int, int, int, int, int, int)>
	//   20   40:putfield        #171 <Field android.media.AudioTrack audioTrack>
		else
	//*  21   43:goto            79
			audioTrack = new android.media.AudioTrack(streamType, sampleRate, channelConfig, targetEncoding, bufferSize, 1, i);
	//   22   46:aload_0         
	//   23   47:new             #137 <Class android.media.AudioTrack>
	//   24   50:dup             
	//   25   51:aload_0         
	//   26   52:getfield        #160 <Field int streamType>
	//   27   55:aload_0         
	//   28   56:getfield        #180 <Field int sampleRate>
	//   29   59:aload_0         
	//   30   60:getfield        #182 <Field int channelConfig>
	//   31   63:aload_0         
	//   32   64:getfield        #360 <Field int targetEncoding>
	//   33   67:aload_0         
	//   34   68:getfield        #184 <Field int bufferSize>
	//   35   71:iconst_1        
	//   36   72:iload_1         
	//   37   73:invokespecial   #573 <Method void android.media.AudioTrack(int, int, int, int, int, int, int)>
	//   38   76:putfield        #171 <Field android.media.AudioTrack audioTrack>
		checkAudioTrackInitialized();
	//   39   79:aload_0         
	//   40   80:invokespecial   #575 <Method void checkAudioTrackInitialized()>
		i = audioTrack.getAudioSessionId();
	//   41   83:aload_0         
	//   42   84:getfield        #171 <Field android.media.AudioTrack audioTrack>
	//   43   87:invokevirtual   #578 <Method int android.media.AudioTrack.getAudioSessionId()>
	//   44   90:istore_1        
		if(enablePreV21AudioSessionWorkaround && Util.SDK_INT < 21)
	//*  45   91:getstatic       #580 <Field boolean enablePreV21AudioSessionWorkaround>
	//*  46   94:ifeq            156
	//*  47   97:getstatic       #135 <Field int Util.SDK_INT>
	//*  48  100:bipush          21
	//*  49  102:icmpge          156
		{
			android.media.AudioTrack audiotrack = keepSessionIdAudioTrack;
	//   50  105:aload_0         
	//   51  106:getfield        #372 <Field android.media.AudioTrack keepSessionIdAudioTrack>
	//   52  109:astore_2        
			if(audiotrack != null && i != audiotrack.getAudioSessionId())
	//*  53  110:aload_2         
	//*  54  111:ifnull          126
	//*  55  114:iload_1         
	//*  56  115:aload_2         
	//*  57  116:invokevirtual   #578 <Method int android.media.AudioTrack.getAudioSessionId()>
	//*  58  119:icmpeq          126
				releaseKeepSessionIdAudioTrack();
	//   59  122:aload_0         
	//   60  123:invokespecial   #582 <Method void releaseKeepSessionIdAudioTrack()>
			if(keepSessionIdAudioTrack == null)
	//*  61  126:aload_0         
	//*  62  127:getfield        #372 <Field android.media.AudioTrack keepSessionIdAudioTrack>
	//*  63  130:ifnonnull       156
				keepSessionIdAudioTrack = new android.media.AudioTrack(streamType, 4000, 4, 2, 2, 0, i);
	//   64  133:aload_0         
	//   65  134:new             #137 <Class android.media.AudioTrack>
	//   66  137:dup             
	//   67  138:aload_0         
	//   68  139:getfield        #160 <Field int streamType>
	//   69  142:sipush          4000
	//   70  145:iconst_4        
	//   71  146:iconst_2        
	//   72  147:iconst_2        
	//   73  148:iconst_0        
	//   74  149:iload_1         
	//   75  150:invokespecial   #573 <Method void android.media.AudioTrack(int, int, int, int, int, int, int)>
	//   76  153:putfield        #372 <Field android.media.AudioTrack keepSessionIdAudioTrack>
		}
		audioTrackUtil.reconfigure(audioTrack, needsPassthroughWorkarounds());
	//   77  156:aload_0         
	//   78  157:getfield        #152 <Field AudioTrack$AudioTrackUtil audioTrackUtil>
	//   79  160:aload_0         
	//   80  161:getfield        #171 <Field android.media.AudioTrack audioTrack>
	//   81  164:aload_0         
	//   82  165:invokespecial   #293 <Method boolean needsPassthroughWorkarounds()>
	//   83  168:invokevirtual   #586 <Method void AudioTrack$AudioTrackUtil.reconfigure(android.media.AudioTrack, boolean)>
		setAudioTrackVolume();
	//   84  171:aload_0         
	//   85  172:invokespecial   #588 <Method void setAudioTrackVolume()>
		return i;
	//   86  175:iload_1         
	//   87  176:ireturn         
	}

	public boolean isInitialized()
	{
		return audioTrack != null;
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field android.media.AudioTrack audioTrack>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean isPassthroughSupported(String s)
	{
		AudioCapabilities audiocapabilities = audioCapabilities;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field AudioCapabilities audioCapabilities>
	//    2    4:astore_2        
		return audiocapabilities != null && audiocapabilities.supportsEncoding(getEncodingForMimeType(s));
	//    3    5:aload_2         
	//    4    6:ifnull          22
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokestatic    #465 <Method int getEncodingForMimeType(String)>
	//    8   14:invokevirtual   #596 <Method boolean AudioCapabilities.supportsEncoding(int)>
	//    9   17:ifeq            22
	//   10   20:iconst_1        
	//   11   21:ireturn         
	//   12   22:iconst_0        
	//   13   23:ireturn         
	}

	public void pause()
	{
		if(isInitialized())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #269 <Method boolean isInitialized()>
	//*   2    4:ifeq            18
		{
			resetSyncParams();
	//    3    7:aload_0         
	//    4    8:invokespecial   #599 <Method void resetSyncParams()>
			audioTrackUtil.pause();
	//    5   11:aload_0         
	//    6   12:getfield        #152 <Field AudioTrack$AudioTrackUtil audioTrackUtil>
	//    7   15:invokevirtual   #601 <Method void AudioTrack$AudioTrackUtil.pause()>
		}
	//    8   18:return          
	}

	public void play()
	{
		if(isInitialized())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #269 <Method boolean isInitialized()>
	//*   2    4:ifeq            25
		{
			resumeSystemTimeUs = System.nanoTime() / 1000L;
	//    3    7:aload_0         
	//    4    8:invokestatic    #278 <Method long System.nanoTime()>
	//    5   11:ldc2w           #279 <Long 1000L>
	//    6   14:ldiv            
	//    7   15:putfield        #310 <Field long resumeSystemTimeUs>
			audioTrack.play();
	//    8   18:aload_0         
	//    9   19:getfield        #171 <Field android.media.AudioTrack audioTrack>
	//   10   22:invokevirtual   #604 <Method void android.media.AudioTrack.play()>
		}
	//   11   25:return          
	}

	public void release()
	{
		reset();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #472 <Method void reset()>
		releaseKeepSessionIdAudioTrack();
	//    2    4:aload_0         
	//    3    5:invokespecial   #582 <Method void releaseKeepSessionIdAudioTrack()>
	//    4    8:return          
	}

	public void reset()
	{
		if(isInitialized())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #269 <Method boolean isInitialized()>
	//*   2    4:ifeq            97
		{
			submittedPcmBytes = 0L;
	//    3    7:aload_0         
	//    4    8:lconst_0        
	//    5    9:putfield        #261 <Field long submittedPcmBytes>
			submittedEncodedFrames = 0L;
	//    6   12:aload_0         
	//    7   13:lconst_0        
	//    8   14:putfield        #259 <Field long submittedEncodedFrames>
			framesPerEncodedSample = 0;
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:putfield        #518 <Field int framesPerEncodedSample>
			bufferBytesRemaining = 0;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #506 <Field int bufferBytesRemaining>
			startMediaTimeState = 0;
	//   15   27:aload_0         
	//   16   28:iconst_0        
	//   17   29:putfield        #164 <Field int startMediaTimeState>
			latencyUs = 0L;
	//   18   32:aload_0         
	//   19   33:lconst_0        
	//   20   34:putfield        #352 <Field long latencyUs>
			resetSyncParams();
	//   21   37:aload_0         
	//   22   38:invokespecial   #599 <Method void resetSyncParams()>
			if(audioTrack.getPlayState() == 3)
	//*  23   41:aload_0         
	//*  24   42:getfield        #171 <Field android.media.AudioTrack audioTrack>
	//*  25   45:invokevirtual   #364 <Method int android.media.AudioTrack.getPlayState()>
	//*  26   48:iconst_3        
	//*  27   49:icmpne          59
				audioTrack.pause();
	//   28   52:aload_0         
	//   29   53:getfield        #171 <Field android.media.AudioTrack audioTrack>
	//   30   56:invokevirtual   #605 <Method void android.media.AudioTrack.pause()>
			final android.media.AudioTrack toRelease = audioTrack;
	//   31   59:aload_0         
	//   32   60:getfield        #171 <Field android.media.AudioTrack audioTrack>
	//   33   63:astore_1        
			audioTrack = null;
	//   34   64:aload_0         
	//   35   65:aconst_null     
	//   36   66:putfield        #171 <Field android.media.AudioTrack audioTrack>
			audioTrackUtil.reconfigure(((android.media.AudioTrack) (null)), false);
	//   37   69:aload_0         
	//   38   70:getfield        #152 <Field AudioTrack$AudioTrackUtil audioTrackUtil>
	//   39   73:aconst_null     
	//   40   74:iconst_0        
	//   41   75:invokevirtual   #586 <Method void AudioTrack$AudioTrackUtil.reconfigure(android.media.AudioTrack, boolean)>
			releasingConditionVariable.close();
	//   42   78:aload_0         
	//   43   79:getfield        #130 <Field ConditionVariable releasingConditionVariable>
	//   44   82:invokevirtual   #608 <Method void ConditionVariable.close()>
			((_cls1) (new Thread() {

				public void run()
				{
					toRelease.flush();
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field android.media.AudioTrack val$toRelease>
				//    2    4:invokevirtual   #28  <Method void android.media.AudioTrack.flush()>
					toRelease.release();
				//    3    7:aload_0         
				//    4    8:getfield        #19  <Field android.media.AudioTrack val$toRelease>
				//    5   11:invokevirtual   #31  <Method void android.media.AudioTrack.release()>
					releasingConditionVariable.open();
				//    6   14:aload_0         
				//    7   15:getfield        #17  <Field AudioTrack this$0>
				//    8   18:invokestatic    #35  <Method ConditionVariable AudioTrack.access$100(AudioTrack)>
				//    9   21:invokevirtual   #40  <Method void ConditionVariable.open()>
					return;
				//   10   24:return          
					Exception exception;
					exception;
				//   11   25:astore_1        
					releasingConditionVariable.open();
				//   12   26:aload_0         
				//   13   27:getfield        #17  <Field AudioTrack this$0>
				//   14   30:invokestatic    #35  <Method ConditionVariable AudioTrack.access$100(AudioTrack)>
				//   15   33:invokevirtual   #40  <Method void ConditionVariable.open()>
					throw exception;
				//   16   36:aload_1         
				//   17   37:athrow          
				}

				final AudioTrack this$0;
				final android.media.AudioTrack val$toRelease;

			
			{
				this$0 = AudioTrack.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AudioTrack this$0>
				toRelease = audiotrack1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field android.media.AudioTrack val$toRelease>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #21  <Method void Thread()>
			//    8   14:return          
			}
			}
)).start();
	//   45   85:new             #6   <Class AudioTrack$1>
	//   46   88:dup             
	//   47   89:aload_0         
	//   48   90:aload_1         
	//   49   91:invokespecial   #609 <Method void AudioTrack$1(AudioTrack, android.media.AudioTrack)>
	//   50   94:invokevirtual   #610 <Method void AudioTrack$1.start()>
		}
	//   51   97:return          
	}

	public void setPlaybackParams(PlaybackParams playbackparams)
	{
		audioTrackUtil.setPlaybackParameters(playbackparams);
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field AudioTrack$AudioTrackUtil audioTrackUtil>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #615 <Method void AudioTrack$AudioTrackUtil.setPlaybackParameters(PlaybackParams)>
	//    4    8:return          
	}

	public boolean setStreamType(int i)
	{
		if(streamType == i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #160 <Field int streamType>
	//*   2    4:iload_1         
	//*   3    5:icmpne          10
		{
			return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
		} else
		{
			streamType = i;
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:putfield        #160 <Field int streamType>
			reset();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #472 <Method void reset()>
			return true;
	//   11   19:iconst_1        
	//   12   20:ireturn         
		}
	}

	public void setVolume(float f)
	{
		if(volume != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #162 <Field float volume>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			volume = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #162 <Field float volume>
			setAudioTrackVolume();
	//    8   14:aload_0         
	//    9   15:invokespecial   #588 <Method void setAudioTrackVolume()>
		}
	//   10   18:return          
	}

	private static final int BUFFER_MULTIPLICATION_FACTOR = 4;
	public static final long CURRENT_POSITION_NOT_SET = 0x0L;
	private static final long MAX_AUDIO_TIMESTAMP_OFFSET_US = 0x4c4b40L;
	private static final long MAX_BUFFER_DURATION_US = 0xb71b0L;
	private static final long MAX_LATENCY_US = 0x4c4b40L;
	private static final int MAX_PLAYHEAD_OFFSET_COUNT = 10;
	private static final long MIN_BUFFER_DURATION_US = 0x3d090L;
	private static final int MIN_PLAYHEAD_OFFSET_SAMPLE_INTERVAL_US = 30000;
	private static final int MIN_TIMESTAMP_SAMPLE_INTERVAL_US = 0x7a120;
	private static final long PASSTHROUGH_BUFFER_DURATION_US = 0x3d090L;
	public static final int RESULT_BUFFER_CONSUMED = 2;
	public static final int RESULT_POSITION_DISCONTINUITY = 1;
	public static final int SESSION_ID_NOT_SET = 0;
	private static final int START_IN_SYNC = 1;
	private static final int START_NEED_SYNC = 2;
	private static final int START_NOT_SET = 0;
	private static final String TAG = "AudioTrack";
	public static boolean enablePreV21AudioSessionWorkaround = false;
	public static boolean failOnSpuriousAudioTimestamp = false;
	private final AudioCapabilities audioCapabilities;
	private boolean audioTimestampSet;
	private android.media.AudioTrack audioTrack;
	private final AudioTrackUtil audioTrackUtil;
	private int bufferBytesRemaining;
	private int bufferSize;
	private long bufferSizeUs;
	private int channelConfig;
	private int framesPerEncodedSample;
	private Method getLatencyMethod;
	private android.media.AudioTrack keepSessionIdAudioTrack;
	private long lastPlayheadSampleTimeUs;
	private long lastTimestampSampleTimeUs;
	private long latencyUs;
	private int nextPlayheadOffsetIndex;
	private boolean passthrough;
	private int pcmFrameSize;
	private int playheadOffsetCount;
	private final long playheadOffsets[];
	private final ConditionVariable releasingConditionVariable;
	private ByteBuffer resampledBuffer;
	private long resumeSystemTimeUs;
	private int sampleRate;
	private long smoothedPlayheadOffsetUs;
	private int sourceEncoding;
	private int startMediaTimeState;
	private long startMediaTimeUs;
	private int streamType;
	private long submittedEncodedFrames;
	private long submittedPcmBytes;
	private int targetEncoding;
	private byte temporaryBuffer[];
	private int temporaryBufferOffset;
	private boolean useResampledBuffer;
	private float volume;

	static 
	{
	//    0    0:return          
	}


/*
	static ConditionVariable access$100(AudioTrack audiotrack)
	{
		return audiotrack.releasingConditionVariable;
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field ConditionVariable releasingConditionVariable>
	//    2    4:areturn         
	}

*/
}
