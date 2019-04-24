// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.lang.reflect.Method;

// Referenced classes of package com.google.android.exoplayer2.audio:
//			AudioTimestampPoller

final class AudioTrackPositionTracker
{
	public static interface Listener
	{

		public abstract void onInvalidLatency(long l);

		public abstract void onPositionFramesMismatch(long l, long l1, long l2, long l3);

		public abstract void onSystemTimeUsMismatch(long l, long l1, long l2, long l3);

		public abstract void onUnderrun(int i, long l);
	}


	public AudioTrackPositionTracker(Listener listener1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #66  <Method void Object()>
		listener = (Listener)Assertions.checkNotNull(((Object) (listener1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #72  <Method Object Assertions.checkNotNull(Object)>
	//    5    9:checkcast       #6   <Class AudioTrackPositionTracker$Listener>
	//    6   12:putfield        #74  <Field AudioTrackPositionTracker$Listener listener>
		if(Util.SDK_INT >= 18)
	//*   7   15:getstatic       #79  <Field int Util.SDK_INT>
	//*   8   18:bipush          18
	//*   9   20:icmplt          38
			try
			{
				getLatencyMethod = ((Class) (android/media/AudioTrack)).getMethod("getLatency", (Class[])null);
	//   10   23:aload_0         
	//   11   24:ldc1            #81  <Class AudioTrack>
	//   12   26:ldc1            #83  <String "getLatency">
	//   13   28:aconst_null     
	//   14   29:checkcast       #85  <Class Class[]>
	//   15   32:invokevirtual   #91  <Method Method Class.getMethod(String, Class[])>
	//   16   35:putfield        #93  <Field Method getLatencyMethod>
			}
	//*  17   38:aload_0         
	//*  18   39:bipush          10
	//*  19   41:newarray        long[]
	//*  20   43:putfield        #95  <Field long[] playheadOffsets>
	//*  21   46:return          
			// Misplaced declaration of an exception variable
			catch(Listener listener1) { }
	//   22   47:astore_1        
	//*  23   48:goto            38
	}

	private boolean forceHasPendingData()
	{
		return needsPassthroughWorkarounds && audioTrack.getPlayState() == 2 && getPlaybackHeadPosition() == 0L;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field boolean needsPassthroughWorkarounds>
	//    2    4:ifeq            29
	//    3    7:aload_0         
	//    4    8:getfield        #102 <Field AudioTrack audioTrack>
	//    5   11:invokevirtual   #106 <Method int AudioTrack.getPlayState()>
	//    6   14:iconst_2        
	//    7   15:icmpne          29
	//    8   18:aload_0         
	//    9   19:invokespecial   #110 <Method long getPlaybackHeadPosition()>
	//   10   22:lconst_0        
	//   11   23:lcmp            
	//   12   24:ifne            29
	//   13   27:iconst_1        
	//   14   28:ireturn         
	//   15   29:iconst_0        
	//   16   30:ireturn         
	}

	private long framesToDurationUs(long l)
	{
		return (l * 0xf4240L) / (long)outputSampleRate;
	//    0    0:lload_1         
	//    1    1:ldc2w           #113 <Long 0xf4240L>
	//    2    4:lmul            
	//    3    5:aload_0         
	//    4    6:getfield        #116 <Field int outputSampleRate>
	//    5    9:i2l             
	//    6   10:ldiv            
	//    7   11:lreturn         
	}

	private long getPlaybackHeadPosition()
	{
		if(stopTimestampUs != 0x1L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field long stopTimestampUs>
	//*   2    4:ldc2w           #119 <Long 0x1L>
	//*   3    7:lcmp            
	//*   4    8:ifeq            48
		{
			long l = ((SystemClock.elapsedRealtime() * 1000L - stopTimestampUs) * (long)outputSampleRate) / 0xf4240L;
	//    5   11:invokestatic    #125 <Method long SystemClock.elapsedRealtime()>
	//    6   14:ldc2w           #126 <Long 1000L>
	//    7   17:lmul            
	//    8   18:aload_0         
	//    9   19:getfield        #118 <Field long stopTimestampUs>
	//   10   22:lsub            
	//   11   23:aload_0         
	//   12   24:getfield        #116 <Field int outputSampleRate>
	//   13   27:i2l             
	//   14   28:lmul            
	//   15   29:ldc2w           #113 <Long 0xf4240L>
	//   16   32:ldiv            
	//   17   33:lstore_2        
			return Math.min(endPlaybackHeadPosition, stopPlaybackHeadPosition + l);
	//   18   34:aload_0         
	//   19   35:getfield        #129 <Field long endPlaybackHeadPosition>
	//   20   38:aload_0         
	//   21   39:getfield        #131 <Field long stopPlaybackHeadPosition>
	//   22   42:lload_2         
	//   23   43:ladd            
	//   24   44:invokestatic    #137 <Method long Math.min(long, long)>
	//   25   47:lreturn         
		}
		int i = audioTrack.getPlayState();
	//   26   48:aload_0         
	//   27   49:getfield        #102 <Field AudioTrack audioTrack>
	//   28   52:invokevirtual   #106 <Method int AudioTrack.getPlayState()>
	//   29   55:istore_1        
		if(i == 1)
	//*  30   56:iload_1         
	//*  31   57:iconst_1        
	//*  32   58:icmpne          63
			return 0L;
	//   33   61:lconst_0        
	//   34   62:lreturn         
		long l1 = 0xffffffffL & (long)audioTrack.getPlaybackHeadPosition();
	//   35   63:ldc2w           #138 <Long 0xffffffffL>
	//   36   66:aload_0         
	//   37   67:getfield        #102 <Field AudioTrack audioTrack>
	//   38   70:invokevirtual   #141 <Method int AudioTrack.getPlaybackHeadPosition()>
	//   39   73:i2l             
	//   40   74:land            
	//   41   75:lstore_2        
		if(needsPassthroughWorkarounds)
	//*  42   76:aload_0         
	//*  43   77:getfield        #100 <Field boolean needsPassthroughWorkarounds>
	//*  44   80:ifeq            112
		{
			if(i == 2 && l1 == 0L)
	//*  45   83:iload_1         
	//*  46   84:iconst_2        
	//*  47   85:icmpne          102
	//*  48   88:lload_2         
	//*  49   89:lconst_0        
	//*  50   90:lcmp            
	//*  51   91:ifne            102
				passthroughWorkaroundPauseOffset = lastRawPlaybackHeadPosition;
	//   52   94:aload_0         
	//   53   95:aload_0         
	//   54   96:getfield        #143 <Field long lastRawPlaybackHeadPosition>
	//   55   99:putfield        #145 <Field long passthroughWorkaroundPauseOffset>
			l1 += passthroughWorkaroundPauseOffset;
	//   56  102:lload_2         
	//   57  103:aload_0         
	//   58  104:getfield        #145 <Field long passthroughWorkaroundPauseOffset>
	//   59  107:ladd            
	//   60  108:lstore_2        
		}
	//*  61  109:goto            112
		if(Util.SDK_INT <= 28)
	//*  62  112:getstatic       #79  <Field int Util.SDK_INT>
	//*  63  115:bipush          28
	//*  64  117:icmpgt          170
		{
			if(l1 == 0L && lastRawPlaybackHeadPosition > 0L && i == 3)
	//*  65  120:lload_2         
	//*  66  121:lconst_0        
	//*  67  122:lcmp            
	//*  68  123:ifne            163
	//*  69  126:aload_0         
	//*  70  127:getfield        #143 <Field long lastRawPlaybackHeadPosition>
	//*  71  130:lconst_0        
	//*  72  131:lcmp            
	//*  73  132:ifle            163
	//*  74  135:iload_1         
	//*  75  136:iconst_3        
	//*  76  137:icmpne          163
			{
				if(forceResetWorkaroundTimeMs == 0x1L)
	//*  77  140:aload_0         
	//*  78  141:getfield        #147 <Field long forceResetWorkaroundTimeMs>
	//*  79  144:ldc2w           #119 <Long 0x1L>
	//*  80  147:lcmp            
	//*  81  148:ifne            158
					forceResetWorkaroundTimeMs = SystemClock.elapsedRealtime();
	//   82  151:aload_0         
	//   83  152:invokestatic    #125 <Method long SystemClock.elapsedRealtime()>
	//   84  155:putfield        #147 <Field long forceResetWorkaroundTimeMs>
				return lastRawPlaybackHeadPosition;
	//   85  158:aload_0         
	//   86  159:getfield        #143 <Field long lastRawPlaybackHeadPosition>
	//   87  162:lreturn         
			}
			forceResetWorkaroundTimeMs = 0x1L;
	//   88  163:aload_0         
	//   89  164:ldc2w           #119 <Long 0x1L>
	//   90  167:putfield        #147 <Field long forceResetWorkaroundTimeMs>
		}
		if(lastRawPlaybackHeadPosition > l1)
	//*  91  170:aload_0         
	//*  92  171:getfield        #143 <Field long lastRawPlaybackHeadPosition>
	//*  93  174:lload_2         
	//*  94  175:lcmp            
	//*  95  176:ifle            189
			rawPlaybackHeadWrapCount = rawPlaybackHeadWrapCount + 1L;
	//   96  179:aload_0         
	//   97  180:aload_0         
	//   98  181:getfield        #149 <Field long rawPlaybackHeadWrapCount>
	//   99  184:lconst_1        
	//  100  185:ladd            
	//  101  186:putfield        #149 <Field long rawPlaybackHeadWrapCount>
		lastRawPlaybackHeadPosition = l1;
	//  102  189:aload_0         
	//  103  190:lload_2         
	//  104  191:putfield        #143 <Field long lastRawPlaybackHeadPosition>
		return l1 + (rawPlaybackHeadWrapCount << 32);
	//  105  194:lload_2         
	//  106  195:aload_0         
	//  107  196:getfield        #149 <Field long rawPlaybackHeadWrapCount>
	//  108  199:bipush          32
	//  109  201:lshl            
	//  110  202:ladd            
	//  111  203:lreturn         
	}

	private long getPlaybackHeadPositionUs()
	{
		return framesToDurationUs(getPlaybackHeadPosition());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #110 <Method long getPlaybackHeadPosition()>
	//    3    5:invokespecial   #152 <Method long framesToDurationUs(long)>
	//    4    8:lreturn         
	}

	private void maybePollAndCheckTimestamp(long l, long l1)
	{
		if(!audioTimestampPoller.maybePollTimestamp(l))
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field AudioTimestampPoller audioTimestampPoller>
	//*   2    4:lload_1         
	//*   3    5:invokevirtual   #162 <Method boolean AudioTimestampPoller.maybePollTimestamp(long)>
	//*   4    8:ifne            12
			return;
	//    5   11:return          
		long l2 = audioTimestampPoller.getTimestampSystemTimeUs();
	//    6   12:aload_0         
	//    7   13:getfield        #156 <Field AudioTimestampPoller audioTimestampPoller>
	//    8   16:invokevirtual   #165 <Method long AudioTimestampPoller.getTimestampSystemTimeUs()>
	//    9   19:lstore          5
		long l3 = audioTimestampPoller.getTimestampPositionFrames();
	//   10   21:aload_0         
	//   11   22:getfield        #156 <Field AudioTimestampPoller audioTimestampPoller>
	//   12   25:invokevirtual   #168 <Method long AudioTimestampPoller.getTimestampPositionFrames()>
	//   13   28:lstore          7
		if(Math.abs(l2 - l) > 0x4c4b40L)
	//*  14   30:lload           5
	//*  15   32:lload_1         
	//*  16   33:lsub            
	//*  17   34:invokestatic    #171 <Method long Math.abs(long)>
	//*  18   37:ldc2w           #13  <Long 0x4c4b40L>
	//*  19   40:lcmp            
	//*  20   41:ifle            67
		{
			listener.onSystemTimeUsMismatch(l3, l2, l, l1);
	//   21   44:aload_0         
	//   22   45:getfield        #74  <Field AudioTrackPositionTracker$Listener listener>
	//   23   48:lload           7
	//   24   50:lload           5
	//   25   52:lload_1         
	//   26   53:lload_3         
	//   27   54:invokeinterface #175 <Method void AudioTrackPositionTracker$Listener.onSystemTimeUsMismatch(long, long, long, long)>
			audioTimestampPoller.rejectTimestamp();
	//   28   59:aload_0         
	//   29   60:getfield        #156 <Field AudioTimestampPoller audioTimestampPoller>
	//   30   63:invokevirtual   #178 <Method void AudioTimestampPoller.rejectTimestamp()>
			return;
	//   31   66:return          
		}
		if(Math.abs(framesToDurationUs(l3) - l1) > 0x4c4b40L)
	//*  32   67:aload_0         
	//*  33   68:lload           7
	//*  34   70:invokespecial   #152 <Method long framesToDurationUs(long)>
	//*  35   73:lload_3         
	//*  36   74:lsub            
	//*  37   75:invokestatic    #171 <Method long Math.abs(long)>
	//*  38   78:ldc2w           #13  <Long 0x4c4b40L>
	//*  39   81:lcmp            
	//*  40   82:ifle            108
		{
			listener.onPositionFramesMismatch(l3, l2, l, l1);
	//   41   85:aload_0         
	//   42   86:getfield        #74  <Field AudioTrackPositionTracker$Listener listener>
	//   43   89:lload           7
	//   44   91:lload           5
	//   45   93:lload_1         
	//   46   94:lload_3         
	//   47   95:invokeinterface #181 <Method void AudioTrackPositionTracker$Listener.onPositionFramesMismatch(long, long, long, long)>
			audioTimestampPoller.rejectTimestamp();
	//   48  100:aload_0         
	//   49  101:getfield        #156 <Field AudioTimestampPoller audioTimestampPoller>
	//   50  104:invokevirtual   #178 <Method void AudioTimestampPoller.rejectTimestamp()>
			return;
	//   51  107:return          
		} else
		{
			audioTimestampPoller.acceptTimestamp();
	//   52  108:aload_0         
	//   53  109:getfield        #156 <Field AudioTimestampPoller audioTimestampPoller>
	//   54  112:invokevirtual   #184 <Method void AudioTimestampPoller.acceptTimestamp()>
			return;
	//   55  115:return          
		}
	}

	private void maybeSampleSyncParams()
	{
		long l = getPlaybackHeadPositionUs();
	//    0    0:aload_0         
	//    1    1:invokespecial   #187 <Method long getPlaybackHeadPositionUs()>
	//    2    4:lstore_2        
		if(l == 0L)
	//*   3    5:lload_2         
	//*   4    6:lconst_0        
	//*   5    7:lcmp            
	//*   6    8:ifne            12
			return;
	//    7   11:return          
		long l1 = System.nanoTime() / 1000L;
	//    8   12:invokestatic    #192 <Method long System.nanoTime()>
	//    9   15:ldc2w           #126 <Long 1000L>
	//   10   18:ldiv            
	//   11   19:lstore          4
		if(l1 - lastPlayheadSampleTimeUs >= 30000L)
	//*  12   21:lload           4
	//*  13   23:aload_0         
	//*  14   24:getfield        #194 <Field long lastPlayheadSampleTimeUs>
	//*  15   27:lsub            
	//*  16   28:ldc2w           #195 <Long 30000L>
	//*  17   31:lcmp            
	//*  18   32:iflt            129
		{
			playheadOffsets[nextPlayheadOffsetIndex] = l - l1;
	//   19   35:aload_0         
	//   20   36:getfield        #95  <Field long[] playheadOffsets>
	//   21   39:aload_0         
	//   22   40:getfield        #198 <Field int nextPlayheadOffsetIndex>
	//   23   43:lload_2         
	//   24   44:lload           4
	//   25   46:lsub            
	//   26   47:lastore         
			nextPlayheadOffsetIndex = (nextPlayheadOffsetIndex + 1) % 10;
	//   27   48:aload_0         
	//   28   49:aload_0         
	//   29   50:getfield        #198 <Field int nextPlayheadOffsetIndex>
	//   30   53:iconst_1        
	//   31   54:iadd            
	//   32   55:bipush          10
	//   33   57:irem            
	//   34   58:putfield        #198 <Field int nextPlayheadOffsetIndex>
			if(playheadOffsetCount < 10)
	//*  35   61:aload_0         
	//*  36   62:getfield        #200 <Field int playheadOffsetCount>
	//*  37   65:bipush          10
	//*  38   67:icmpge          80
				playheadOffsetCount = playheadOffsetCount + 1;
	//   39   70:aload_0         
	//   40   71:aload_0         
	//   41   72:getfield        #200 <Field int playheadOffsetCount>
	//   42   75:iconst_1        
	//   43   76:iadd            
	//   44   77:putfield        #200 <Field int playheadOffsetCount>
			lastPlayheadSampleTimeUs = l1;
	//   45   80:aload_0         
	//   46   81:lload           4
	//   47   83:putfield        #194 <Field long lastPlayheadSampleTimeUs>
			smoothedPlayheadOffsetUs = 0L;
	//   48   86:aload_0         
	//   49   87:lconst_0        
	//   50   88:putfield        #202 <Field long smoothedPlayheadOffsetUs>
			for(int i = 0; i < playheadOffsetCount; i++)
	//*  51   91:iconst_0        
	//*  52   92:istore_1        
	//*  53   93:iload_1         
	//*  54   94:aload_0         
	//*  55   95:getfield        #200 <Field int playheadOffsetCount>
	//*  56   98:icmpge          129
				smoothedPlayheadOffsetUs = smoothedPlayheadOffsetUs + playheadOffsets[i] / (long)playheadOffsetCount;
	//   57  101:aload_0         
	//   58  102:aload_0         
	//   59  103:getfield        #202 <Field long smoothedPlayheadOffsetUs>
	//   60  106:aload_0         
	//   61  107:getfield        #95  <Field long[] playheadOffsets>
	//   62  110:iload_1         
	//   63  111:laload          
	//   64  112:aload_0         
	//   65  113:getfield        #200 <Field int playheadOffsetCount>
	//   66  116:i2l             
	//   67  117:ldiv            
	//   68  118:ladd            
	//   69  119:putfield        #202 <Field long smoothedPlayheadOffsetUs>

	//   70  122:iload_1         
	//   71  123:iconst_1        
	//   72  124:iadd            
	//   73  125:istore_1        
		}
	//*  74  126:goto            93
		if(needsPassthroughWorkarounds)
	//*  75  129:aload_0         
	//*  76  130:getfield        #100 <Field boolean needsPassthroughWorkarounds>
	//*  77  133:ifeq            137
		{
			return;
	//   78  136:return          
		} else
		{
			maybePollAndCheckTimestamp(l1, l);
	//   79  137:aload_0         
	//   80  138:lload           4
	//   81  140:lload_2         
	//   82  141:invokespecial   #204 <Method void maybePollAndCheckTimestamp(long, long)>
			maybeUpdateLatency(l1);
	//   83  144:aload_0         
	//   84  145:lload           4
	//   85  147:invokespecial   #208 <Method void maybeUpdateLatency(long)>
			return;
	//   86  150:return          
		}
	}

	private void maybeUpdateLatency(long l)
	{
		Exception exception;
		if(isOutputPcm && getLatencyMethod != null && l - lastLatencySampleTimeUs >= 0x7a120L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #212 <Field boolean isOutputPcm>
	//*   2    4:ifeq            116
	//*   3    7:aload_0         
	//*   4    8:getfield        #93  <Field Method getLatencyMethod>
	//*   5   11:ifnull          116
	//*   6   14:lload_1         
	//*   7   15:aload_0         
	//*   8   16:getfield        #214 <Field long lastLatencySampleTimeUs>
	//*   9   19:lsub            
	//*  10   20:ldc2w           #215 <Long 0x7a120L>
	//*  11   23:lcmp            
	//*  12   24:iflt            116
		{
			try
			{
				latencyUs = (long)((Integer)getLatencyMethod.invoke(((Object) (audioTrack)), (Object[])null)).intValue() * 1000L - bufferSizeUs;
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #93  <Field Method getLatencyMethod>
	//   16   32:aload_0         
	//   17   33:getfield        #102 <Field AudioTrack audioTrack>
	//   18   36:aconst_null     
	//   19   37:checkcast       #218 <Class Object[]>
	//   20   40:invokevirtual   #224 <Method Object Method.invoke(Object, Object[])>
	//   21   43:checkcast       #226 <Class Integer>
	//   22   46:invokevirtual   #229 <Method int Integer.intValue()>
	//   23   49:i2l             
	//   24   50:ldc2w           #126 <Long 1000L>
	//   25   53:lmul            
	//   26   54:aload_0         
	//   27   55:getfield        #231 <Field long bufferSizeUs>
	//   28   58:lsub            
	//   29   59:putfield        #233 <Field long latencyUs>
				latencyUs = Math.max(latencyUs, 0L);
	//   30   62:aload_0         
	//   31   63:aload_0         
	//   32   64:getfield        #233 <Field long latencyUs>
	//   33   67:lconst_0        
	//   34   68:invokestatic    #236 <Method long Math.max(long, long)>
	//   35   71:putfield        #233 <Field long latencyUs>
				if(latencyUs > 0x4c4b40L)
	//*  36   74:aload_0         
	//*  37   75:getfield        #233 <Field long latencyUs>
	//*  38   78:ldc2w           #13  <Long 0x4c4b40L>
	//*  39   81:lcmp            
	//*  40   82:ifle            111
				{
					listener.onInvalidLatency(latencyUs);
	//   41   85:aload_0         
	//   42   86:getfield        #74  <Field AudioTrackPositionTracker$Listener listener>
	//   43   89:aload_0         
	//   44   90:getfield        #233 <Field long latencyUs>
	//   45   93:invokeinterface #239 <Method void AudioTrackPositionTracker$Listener.onInvalidLatency(long)>
					latencyUs = 0L;
	//   46   98:aload_0         
	//   47   99:lconst_0        
	//   48  100:putfield        #233 <Field long latencyUs>
				}
			}
	//*  49  103:goto            111
	//*  50  106:aload_0         
	//*  51  107:aconst_null     
	//*  52  108:putfield        #93  <Field Method getLatencyMethod>
	//*  53  111:aload_0         
	//*  54  112:lload_1         
	//*  55  113:putfield        #214 <Field long lastLatencySampleTimeUs>
	//*  56  116:return          
			// Misplaced declaration of an exception variable
			catch(Exception exception)
			{
				getLatencyMethod = null;
			}
			lastLatencySampleTimeUs = l;
		}
	//*  57  117:astore_3        
	//*  58  118:goto            106
	}

	private static boolean needsPassthroughWorkarounds(int i)
	{
		return Util.SDK_INT < 23 && (i == 5 || i == 6);
	//    0    0:getstatic       #79  <Field int Util.SDK_INT>
	//    1    3:bipush          23
	//    2    5:icmpge          21
	//    3    8:iload_0         
	//    4    9:iconst_5        
	//    5   10:icmpeq          19
	//    6   13:iload_0         
	//    7   14:bipush          6
	//    8   16:icmpne          21
	//    9   19:iconst_1        
	//   10   20:ireturn         
	//   11   21:iconst_0        
	//   12   22:ireturn         
	}

	private void resetSyncParams()
	{
		smoothedPlayheadOffsetUs = 0L;
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:putfield        #202 <Field long smoothedPlayheadOffsetUs>
		playheadOffsetCount = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #200 <Field int playheadOffsetCount>
		nextPlayheadOffsetIndex = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #198 <Field int nextPlayheadOffsetIndex>
		lastPlayheadSampleTimeUs = 0L;
	//    9   15:aload_0         
	//   10   16:lconst_0        
	//   11   17:putfield        #194 <Field long lastPlayheadSampleTimeUs>
	//   12   20:return          
	}

	public int getAvailableBufferSize(long l)
	{
		int i = (int)(l - getPlaybackHeadPosition() * (long)outputPcmFrameSize);
	//    0    0:lload_1         
	//    1    1:aload_0         
	//    2    2:invokespecial   #110 <Method long getPlaybackHeadPosition()>
	//    3    5:aload_0         
	//    4    6:getfield        #245 <Field int outputPcmFrameSize>
	//    5    9:i2l             
	//    6   10:lmul            
	//    7   11:lsub            
	//    8   12:l2i             
	//    9   13:istore_3        
		return bufferSize - i;
	//   10   14:aload_0         
	//   11   15:getfield        #247 <Field int bufferSize>
	//   12   18:iload_3         
	//   13   19:isub            
	//   14   20:ireturn         
	}

	public long getCurrentPositionUs(boolean flag)
	{
		if(audioTrack.getPlayState() == 3)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field AudioTrack audioTrack>
	//*   2    4:invokevirtual   #106 <Method int AudioTrack.getPlayState()>
	//*   3    7:iconst_3        
	//*   4    8:icmpne          15
			maybeSampleSyncParams();
	//    5   11:aload_0         
	//    6   12:invokespecial   #251 <Method void maybeSampleSyncParams()>
		long l = System.nanoTime() / 1000L;
	//    7   15:invokestatic    #192 <Method long System.nanoTime()>
	//    8   18:ldc2w           #126 <Long 1000L>
	//    9   21:ldiv            
	//   10   22:lstore_2        
		if(audioTimestampPoller.hasTimestamp())
	//*  11   23:aload_0         
	//*  12   24:getfield        #156 <Field AudioTimestampPoller audioTimestampPoller>
	//*  13   27:invokevirtual   #254 <Method boolean AudioTimestampPoller.hasTimestamp()>
	//*  14   30:ifeq            72
		{
			long l1 = framesToDurationUs(audioTimestampPoller.getTimestampPositionFrames());
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:getfield        #156 <Field AudioTimestampPoller audioTimestampPoller>
	//   18   38:invokevirtual   #168 <Method long AudioTimestampPoller.getTimestampPositionFrames()>
	//   19   41:invokespecial   #152 <Method long framesToDurationUs(long)>
	//   20   44:lstore          4
			if(!audioTimestampPoller.isTimestampAdvancing())
	//*  21   46:aload_0         
	//*  22   47:getfield        #156 <Field AudioTimestampPoller audioTimestampPoller>
	//*  23   50:invokevirtual   #257 <Method boolean AudioTimestampPoller.isTimestampAdvancing()>
	//*  24   53:ifne            59
				return l1;
	//   25   56:lload           4
	//   26   58:lreturn         
			else
				return l1 + (l - audioTimestampPoller.getTimestampSystemTimeUs());
	//   27   59:lload           4
	//   28   61:lload_2         
	//   29   62:aload_0         
	//   30   63:getfield        #156 <Field AudioTimestampPoller audioTimestampPoller>
	//   31   66:invokevirtual   #165 <Method long AudioTimestampPoller.getTimestampSystemTimeUs()>
	//   32   69:lsub            
	//   33   70:ladd            
	//   34   71:lreturn         
		}
		if(playheadOffsetCount == 0)
	//*  35   72:aload_0         
	//*  36   73:getfield        #200 <Field int playheadOffsetCount>
	//*  37   76:ifne            87
			l = getPlaybackHeadPositionUs();
	//   38   79:aload_0         
	//   39   80:invokespecial   #187 <Method long getPlaybackHeadPositionUs()>
	//   40   83:lstore_2        
		else
	//*  41   84:goto            94
			l += smoothedPlayheadOffsetUs;
	//   42   87:lload_2         
	//   43   88:aload_0         
	//   44   89:getfield        #202 <Field long smoothedPlayheadOffsetUs>
	//   45   92:ladd            
	//   46   93:lstore_2        
		long l2 = l;
	//   47   94:lload_2         
	//   48   95:lstore          4
		if(!flag)
	//*  49   97:iload_1         
	//*  50   98:ifne            109
			l2 = l - latencyUs;
	//   51  101:lload_2         
	//   52  102:aload_0         
	//   53  103:getfield        #233 <Field long latencyUs>
	//   54  106:lsub            
	//   55  107:lstore          4
		return l2;
	//   56  109:lload           4
	//   57  111:lreturn         
	}

	public void handleEndOfStream(long l)
	{
		stopPlaybackHeadPosition = getPlaybackHeadPosition();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #110 <Method long getPlaybackHeadPosition()>
	//    3    5:putfield        #131 <Field long stopPlaybackHeadPosition>
		stopTimestampUs = SystemClock.elapsedRealtime() * 1000L;
	//    4    8:aload_0         
	//    5    9:invokestatic    #125 <Method long SystemClock.elapsedRealtime()>
	//    6   12:ldc2w           #126 <Long 1000L>
	//    7   15:lmul            
	//    8   16:putfield        #118 <Field long stopTimestampUs>
		endPlaybackHeadPosition = l;
	//    9   19:aload_0         
	//   10   20:lload_1         
	//   11   21:putfield        #129 <Field long endPlaybackHeadPosition>
	//   12   24:return          
	}

	public boolean hasPendingData(long l)
	{
		return l > getPlaybackHeadPosition() || forceHasPendingData();
	//    0    0:lload_1         
	//    1    1:aload_0         
	//    2    2:invokespecial   #110 <Method long getPlaybackHeadPosition()>
	//    3    5:lcmp            
	//    4    6:ifgt            21
	//    5    9:aload_0         
	//    6   10:invokespecial   #261 <Method boolean forceHasPendingData()>
	//    7   13:ifeq            19
	//    8   16:goto            21
	//    9   19:iconst_0        
	//   10   20:ireturn         
	//   11   21:iconst_1        
	//   12   22:ireturn         
	}

	public boolean isPlaying()
	{
		return audioTrack.getPlayState() == 3;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field AudioTrack audioTrack>
	//    2    4:invokevirtual   #106 <Method int AudioTrack.getPlayState()>
	//    3    7:iconst_3        
	//    4    8:icmpne          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public boolean isStalled(long l)
	{
		return forceResetWorkaroundTimeMs != 0x1L && l > 0L && SystemClock.elapsedRealtime() - forceResetWorkaroundTimeMs >= 200L;
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field long forceResetWorkaroundTimeMs>
	//    2    4:ldc2w           #119 <Long 0x1L>
	//    3    7:lcmp            
	//    4    8:ifeq            34
	//    5   11:lload_1         
	//    6   12:lconst_0        
	//    7   13:lcmp            
	//    8   14:ifle            34
	//    9   17:invokestatic    #125 <Method long SystemClock.elapsedRealtime()>
	//   10   20:aload_0         
	//   11   21:getfield        #147 <Field long forceResetWorkaroundTimeMs>
	//   12   24:lsub            
	//   13   25:ldc2w           #10  <Long 200L>
	//   14   28:lcmp            
	//   15   29:iflt            34
	//   16   32:iconst_1        
	//   17   33:ireturn         
	//   18   34:iconst_0        
	//   19   35:ireturn         
	}

	public boolean mayHandleBuffer(long l)
	{
		int i = audioTrack.getPlayState();
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field AudioTrack audioTrack>
	//    2    4:invokevirtual   #106 <Method int AudioTrack.getPlayState()>
	//    3    7:istore_3        
		if(needsPassthroughWorkarounds)
	//*   4    8:aload_0         
	//*   5    9:getfield        #100 <Field boolean needsPassthroughWorkarounds>
	//*   6   12:ifeq            43
		{
			if(i == 2)
	//*   7   15:iload_3         
	//*   8   16:iconst_2        
	//*   9   17:icmpne          27
			{
				hasData = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #266 <Field boolean hasData>
				return false;
	//   13   25:iconst_0        
	//   14   26:ireturn         
			}
			if(i == 1 && getPlaybackHeadPosition() == 0L)
	//*  15   27:iload_3         
	//*  16   28:iconst_1        
	//*  17   29:icmpne          43
	//*  18   32:aload_0         
	//*  19   33:invokespecial   #110 <Method long getPlaybackHeadPosition()>
	//*  20   36:lconst_0        
	//*  21   37:lcmp            
	//*  22   38:ifne            43
				return false;
	//   23   41:iconst_0        
	//   24   42:ireturn         
		}
		boolean flag = hasData;
	//   25   43:aload_0         
	//   26   44:getfield        #266 <Field boolean hasData>
	//   27   47:istore          4
		hasData = hasPendingData(l);
	//   28   49:aload_0         
	//   29   50:aload_0         
	//   30   51:lload_1         
	//   31   52:invokevirtual   #268 <Method boolean hasPendingData(long)>
	//   32   55:putfield        #266 <Field boolean hasData>
		if(flag && !hasData && i != 1 && listener != null)
	//*  33   58:iload           4
	//*  34   60:ifeq            102
	//*  35   63:aload_0         
	//*  36   64:getfield        #266 <Field boolean hasData>
	//*  37   67:ifne            102
	//*  38   70:iload_3         
	//*  39   71:iconst_1        
	//*  40   72:icmpeq          102
	//*  41   75:aload_0         
	//*  42   76:getfield        #74  <Field AudioTrackPositionTracker$Listener listener>
	//*  43   79:ifnull          102
			listener.onUnderrun(bufferSize, C.usToMs(bufferSizeUs));
	//   44   82:aload_0         
	//   45   83:getfield        #74  <Field AudioTrackPositionTracker$Listener listener>
	//   46   86:aload_0         
	//   47   87:getfield        #247 <Field int bufferSize>
	//   48   90:aload_0         
	//   49   91:getfield        #231 <Field long bufferSizeUs>
	//   50   94:invokestatic    #273 <Method long C.usToMs(long)>
	//   51   97:invokeinterface #277 <Method void AudioTrackPositionTracker$Listener.onUnderrun(int, long)>
		return true;
	//   52  102:iconst_1        
	//   53  103:ireturn         
	}

	public boolean pause()
	{
		resetSyncParams();
	//    0    0:aload_0         
	//    1    1:invokespecial   #280 <Method void resetSyncParams()>
		if(stopTimestampUs == 0x1L)
	//*   2    4:aload_0         
	//*   3    5:getfield        #118 <Field long stopTimestampUs>
	//*   4    8:ldc2w           #119 <Long 0x1L>
	//*   5   11:lcmp            
	//*   6   12:ifne            24
		{
			audioTimestampPoller.reset();
	//    7   15:aload_0         
	//    8   16:getfield        #156 <Field AudioTimestampPoller audioTimestampPoller>
	//    9   19:invokevirtual   #283 <Method void AudioTimestampPoller.reset()>
			return true;
	//   10   22:iconst_1        
	//   11   23:ireturn         
		} else
		{
			return false;
	//   12   24:iconst_0        
	//   13   25:ireturn         
		}
	}

	public void reset()
	{
		resetSyncParams();
	//    0    0:aload_0         
	//    1    1:invokespecial   #280 <Method void resetSyncParams()>
		audioTrack = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #102 <Field AudioTrack audioTrack>
		audioTimestampPoller = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #156 <Field AudioTimestampPoller audioTimestampPoller>
	//    8   14:return          
	}

	public void setAudioTrack(AudioTrack audiotrack, int i, int j, int k)
	{
		audioTrack = audiotrack;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #102 <Field AudioTrack audioTrack>
		outputPcmFrameSize = j;
	//    3    5:aload_0         
	//    4    6:iload_3         
	//    5    7:putfield        #245 <Field int outputPcmFrameSize>
		bufferSize = k;
	//    6   10:aload_0         
	//    7   11:iload           4
	//    8   13:putfield        #247 <Field int bufferSize>
		audioTimestampPoller = new AudioTimestampPoller(audiotrack);
	//    9   16:aload_0         
	//   10   17:new             #158 <Class AudioTimestampPoller>
	//   11   20:dup             
	//   12   21:aload_1         
	//   13   22:invokespecial   #288 <Method void AudioTimestampPoller(AudioTrack)>
	//   14   25:putfield        #156 <Field AudioTimestampPoller audioTimestampPoller>
		outputSampleRate = audiotrack.getSampleRate();
	//   15   28:aload_0         
	//   16   29:aload_1         
	//   17   30:invokevirtual   #291 <Method int AudioTrack.getSampleRate()>
	//   18   33:putfield        #116 <Field int outputSampleRate>
		needsPassthroughWorkarounds = needsPassthroughWorkarounds(i);
	//   19   36:aload_0         
	//   20   37:iload_2         
	//   21   38:invokestatic    #293 <Method boolean needsPassthroughWorkarounds(int)>
	//   22   41:putfield        #100 <Field boolean needsPassthroughWorkarounds>
		isOutputPcm = Util.isEncodingPcm(i);
	//   23   44:aload_0         
	//   24   45:iload_2         
	//   25   46:invokestatic    #296 <Method boolean Util.isEncodingPcm(int)>
	//   26   49:putfield        #212 <Field boolean isOutputPcm>
		long l;
		if(isOutputPcm)
	//*  27   52:aload_0         
	//*  28   53:getfield        #212 <Field boolean isOutputPcm>
	//*  29   56:ifeq            73
			l = framesToDurationUs(k / j);
	//   30   59:aload_0         
	//   31   60:iload           4
	//   32   62:iload_3         
	//   33   63:idiv            
	//   34   64:i2l             
	//   35   65:invokespecial   #152 <Method long framesToDurationUs(long)>
	//   36   68:lstore          5
		else
	//*  37   70:goto            78
			l = 0x1L;
	//   38   73:ldc2w           #119 <Long 0x1L>
	//   39   76:lstore          5
		bufferSizeUs = l;
	//   40   78:aload_0         
	//   41   79:lload           5
	//   42   81:putfield        #231 <Field long bufferSizeUs>
		lastRawPlaybackHeadPosition = 0L;
	//   43   84:aload_0         
	//   44   85:lconst_0        
	//   45   86:putfield        #143 <Field long lastRawPlaybackHeadPosition>
		rawPlaybackHeadWrapCount = 0L;
	//   46   89:aload_0         
	//   47   90:lconst_0        
	//   48   91:putfield        #149 <Field long rawPlaybackHeadWrapCount>
		passthroughWorkaroundPauseOffset = 0L;
	//   49   94:aload_0         
	//   50   95:lconst_0        
	//   51   96:putfield        #145 <Field long passthroughWorkaroundPauseOffset>
		hasData = false;
	//   52   99:aload_0         
	//   53  100:iconst_0        
	//   54  101:putfield        #266 <Field boolean hasData>
		stopTimestampUs = 0x1L;
	//   55  104:aload_0         
	//   56  105:ldc2w           #119 <Long 0x1L>
	//   57  108:putfield        #118 <Field long stopTimestampUs>
		forceResetWorkaroundTimeMs = 0x1L;
	//   58  111:aload_0         
	//   59  112:ldc2w           #119 <Long 0x1L>
	//   60  115:putfield        #147 <Field long forceResetWorkaroundTimeMs>
		latencyUs = 0L;
	//   61  118:aload_0         
	//   62  119:lconst_0        
	//   63  120:putfield        #233 <Field long latencyUs>
	//   64  123:return          
	}

	public void start()
	{
		audioTimestampPoller.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field AudioTimestampPoller audioTimestampPoller>
	//    2    4:invokevirtual   #283 <Method void AudioTimestampPoller.reset()>
	//    3    7:return          
	}

	private static final long FORCE_RESET_WORKAROUND_TIMEOUT_MS = 200L;
	private static final long MAX_AUDIO_TIMESTAMP_OFFSET_US = 0x4c4b40L;
	private static final long MAX_LATENCY_US = 0x4c4b40L;
	private static final int MAX_PLAYHEAD_OFFSET_COUNT = 10;
	private static final int MIN_LATENCY_SAMPLE_INTERVAL_US = 0x7a120;
	private static final int MIN_PLAYHEAD_OFFSET_SAMPLE_INTERVAL_US = 30000;
	private static final int PLAYSTATE_PAUSED = 2;
	private static final int PLAYSTATE_PLAYING = 3;
	private static final int PLAYSTATE_STOPPED = 1;
	private AudioTimestampPoller audioTimestampPoller;
	private AudioTrack audioTrack;
	private int bufferSize;
	private long bufferSizeUs;
	private long endPlaybackHeadPosition;
	private long forceResetWorkaroundTimeMs;
	private Method getLatencyMethod;
	private boolean hasData;
	private boolean isOutputPcm;
	private long lastLatencySampleTimeUs;
	private long lastPlayheadSampleTimeUs;
	private long lastRawPlaybackHeadPosition;
	private long latencyUs;
	private final Listener listener;
	private boolean needsPassthroughWorkarounds;
	private int nextPlayheadOffsetIndex;
	private int outputPcmFrameSize;
	private int outputSampleRate;
	private long passthroughWorkaroundPauseOffset;
	private int playheadOffsetCount;
	private final long playheadOffsets[] = new long[10];
	private long rawPlaybackHeadWrapCount;
	private long smoothedPlayheadOffsetUs;
	private long stopPlaybackHeadPosition;
	private long stopTimestampUs;
}
