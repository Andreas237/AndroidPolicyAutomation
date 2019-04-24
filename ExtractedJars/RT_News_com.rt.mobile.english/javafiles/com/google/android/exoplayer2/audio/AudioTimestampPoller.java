// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import com.google.android.exoplayer2.util.Util;

final class AudioTimestampPoller
{
	private static final class AudioTimestampV19
	{

		public long getTimestampPositionFrames()
		{
			return lastTimestampPositionFrames;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field long lastTimestampPositionFrames>
		//    2    4:lreturn         
		}

		public long getTimestampSystemTimeUs()
		{
			return audioTimestamp.nanoTime / 1000L;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field AudioTimestamp audioTimestamp>
		//    2    4:getfield        #39  <Field long AudioTimestamp.nanoTime>
		//    3    7:ldc2w           #40  <Long 1000L>
		//    4   10:ldiv            
		//    5   11:lreturn         
		}

		public boolean maybeUpdateTimestamp()
		{
			boolean flag = audioTrack.getTimestamp(audioTimestamp);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field AudioTrack audioTrack>
		//    2    4:aload_0         
		//    3    5:getfield        #30  <Field AudioTimestamp audioTimestamp>
		//    4    8:invokevirtual   #49  <Method boolean AudioTrack.getTimestamp(AudioTimestamp)>
		//    5   11:istore_1        
			if(flag)
		//*   6   12:iload_1         
		//*   7   13:ifeq            61
			{
				long l = audioTimestamp.framePosition;
		//    8   16:aload_0         
		//    9   17:getfield        #30  <Field AudioTimestamp audioTimestamp>
		//   10   20:getfield        #52  <Field long AudioTimestamp.framePosition>
		//   11   23:lstore_2        
				if(lastTimestampRawPositionFrames > l)
		//*  12   24:aload_0         
		//*  13   25:getfield        #54  <Field long lastTimestampRawPositionFrames>
		//*  14   28:lload_2         
		//*  15   29:lcmp            
		//*  16   30:ifle            43
					rawTimestampFramePositionWrapCount = rawTimestampFramePositionWrapCount + 1L;
		//   17   33:aload_0         
		//   18   34:aload_0         
		//   19   35:getfield        #56  <Field long rawTimestampFramePositionWrapCount>
		//   20   38:lconst_1        
		//   21   39:ladd            
		//   22   40:putfield        #56  <Field long rawTimestampFramePositionWrapCount>
				lastTimestampRawPositionFrames = l;
		//   23   43:aload_0         
		//   24   44:lload_2         
		//   25   45:putfield        #54  <Field long lastTimestampRawPositionFrames>
				lastTimestampPositionFrames = l + (rawTimestampFramePositionWrapCount << 32);
		//   26   48:aload_0         
		//   27   49:lload_2         
		//   28   50:aload_0         
		//   29   51:getfield        #56  <Field long rawTimestampFramePositionWrapCount>
		//   30   54:bipush          32
		//   31   56:lshl            
		//   32   57:ladd            
		//   33   58:putfield        #35  <Field long lastTimestampPositionFrames>
			}
			return flag;
		//   34   61:iload_1         
		//   35   62:ireturn         
		}

		private final AudioTimestamp audioTimestamp = new AudioTimestamp();
		private final AudioTrack audioTrack;
		private long lastTimestampPositionFrames;
		private long lastTimestampRawPositionFrames;
		private long rawTimestampFramePositionWrapCount;

		public AudioTimestampV19(AudioTrack audiotrack)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			audioTrack = audiotrack;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #25  <Field AudioTrack audioTrack>
		//    5    9:aload_0         
		//    6   10:new             #27  <Class AudioTimestamp>
		//    7   13:dup             
		//    8   14:invokespecial   #28  <Method void AudioTimestamp()>
		//    9   17:putfield        #30  <Field AudioTimestamp audioTimestamp>
		//   10   20:return          
		}
	}


	public AudioTimestampPoller(AudioTrack audiotrack)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
		if(Util.SDK_INT >= 19)
	//*   2    4:getstatic       #44  <Field int Util.SDK_INT>
	//*   3    7:bipush          19
	//*   4    9:icmplt          29
		{
			audioTimestamp = new AudioTimestampV19(audiotrack);
	//    5   12:aload_0         
	//    6   13:new             #6   <Class AudioTimestampPoller$AudioTimestampV19>
	//    7   16:dup             
	//    8   17:aload_1         
	//    9   18:invokespecial   #46  <Method void AudioTimestampPoller$AudioTimestampV19(AudioTrack)>
	//   10   21:putfield        #48  <Field AudioTimestampPoller$AudioTimestampV19 audioTimestamp>
			reset();
	//   11   24:aload_0         
	//   12   25:invokevirtual   #51  <Method void reset()>
			return;
	//   13   28:return          
		} else
		{
			audioTimestamp = null;
	//   14   29:aload_0         
	//   15   30:aconst_null     
	//   16   31:putfield        #48  <Field AudioTimestampPoller$AudioTimestampV19 audioTimestamp>
			updateState(3);
	//   17   34:aload_0         
	//   18   35:iconst_3        
	//   19   36:invokespecial   #55  <Method void updateState(int)>
			return;
	//   20   39:return          
		}
	}

	private void updateState(int i)
	{
		state = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #58  <Field int state>
		switch(i)
	//*   3    5:iload_1         
		{
	//*   4    6:tableswitch     0 4: default 40
	//	               0 72
	//	               1 64
	//	               2 56
	//	               3 56
	//	               4 48
		default:
			throw new IllegalStateException();
	//    5   40:new             #60  <Class IllegalStateException>
	//    6   43:dup             
	//    7   44:invokespecial   #61  <Method void IllegalStateException()>
	//    8   47:athrow          

		case 4: // '\004'
			sampleIntervalUs = 0x7a120L;
	//    9   48:aload_0         
	//   10   49:ldc2w           #62  <Long 0x7a120L>
	//   11   52:putfield        #65  <Field long sampleIntervalUs>
			return;
	//   12   55:return          

		case 2: // '\002'
		case 3: // '\003'
			sampleIntervalUs = 0x989680L;
	//   13   56:aload_0         
	//   14   57:ldc2w           #66  <Long 0x989680L>
	//   15   60:putfield        #65  <Field long sampleIntervalUs>
			return;
	//   16   63:return          

		case 1: // '\001'
			sampleIntervalUs = 5000L;
	//   17   64:aload_0         
	//   18   65:ldc2w           #68  <Long 5000L>
	//   19   68:putfield        #65  <Field long sampleIntervalUs>
			return;
	//   20   71:return          

		case 0: // '\0'
			lastTimestampSampleTimeUs = 0L;
	//   21   72:aload_0         
	//   22   73:lconst_0        
	//   23   74:putfield        #71  <Field long lastTimestampSampleTimeUs>
			initialTimestampPositionFrames = -1L;
	//   24   77:aload_0         
	//   25   78:ldc2w           #72  <Long -1L>
	//   26   81:putfield        #75  <Field long initialTimestampPositionFrames>
			initializeSystemTimeUs = System.nanoTime() / 1000L;
	//   27   84:aload_0         
	//   28   85:invokestatic    #81  <Method long System.nanoTime()>
	//   29   88:ldc2w           #82  <Long 1000L>
	//   30   91:ldiv            
	//   31   92:putfield        #85  <Field long initializeSystemTimeUs>
			sampleIntervalUs = 5000L;
	//   32   95:aload_0         
	//   33   96:ldc2w           #68  <Long 5000L>
	//   34   99:putfield        #65  <Field long sampleIntervalUs>
			return;
	//   35  102:return          
		}
	}

	public void acceptTimestamp()
	{
		if(state == 4)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field int state>
	//*   2    4:iconst_4        
	//*   3    5:icmpne          12
			reset();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #51  <Method void reset()>
	//    6   12:return          
	}

	public long getTimestampPositionFrames()
	{
		if(audioTimestamp != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field AudioTimestampPoller$AudioTimestampV19 audioTimestamp>
	//*   2    4:ifnull          15
			return audioTimestamp.getTimestampPositionFrames();
	//    3    7:aload_0         
	//    4    8:getfield        #48  <Field AudioTimestampPoller$AudioTimestampV19 audioTimestamp>
	//    5   11:invokevirtual   #89  <Method long AudioTimestampPoller$AudioTimestampV19.getTimestampPositionFrames()>
	//    6   14:lreturn         
		else
			return -1L;
	//    7   15:ldc2w           #72  <Long -1L>
	//    8   18:lreturn         
	}

	public long getTimestampSystemTimeUs()
	{
		if(audioTimestamp != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field AudioTimestampPoller$AudioTimestampV19 audioTimestamp>
	//*   2    4:ifnull          15
			return audioTimestamp.getTimestampSystemTimeUs();
	//    3    7:aload_0         
	//    4    8:getfield        #48  <Field AudioTimestampPoller$AudioTimestampV19 audioTimestamp>
	//    5   11:invokevirtual   #92  <Method long AudioTimestampPoller$AudioTimestampV19.getTimestampSystemTimeUs()>
	//    6   14:lreturn         
		else
			return 0x1L;
	//    7   15:ldc2w           #93  <Long 0x1L>
	//    8   18:lreturn         
	}

	public boolean hasTimestamp()
	{
		int i = state;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int state>
	//    2    4:istore_1        
		boolean flag = true;
	//    3    5:iconst_1        
	//    4    6:istore_2        
		if(i != 1)
	//*   5    7:iload_1         
	//*   6    8:iconst_1        
	//*   7    9:icmpeq          24
		{
			if(state == 2)
	//*   8   12:aload_0         
	//*   9   13:getfield        #58  <Field int state>
	//*  10   16:iconst_2        
	//*  11   17:icmpne          22
				return true;
	//   12   20:iconst_1        
	//   13   21:ireturn         
			flag = false;
	//   14   22:iconst_0        
	//   15   23:istore_2        
		}
		return flag;
	//   16   24:iload_2         
	//   17   25:ireturn         
	}

	public boolean isTimestampAdvancing()
	{
		return state == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int state>
	//    2    4:iconst_2        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean maybePollTimestamp(long l)
	{
		if(audioTimestamp != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field AudioTimestampPoller$AudioTimestampV19 audioTimestamp>
	//*   2    4:ifnull          195
		{
			if(l - lastTimestampSampleTimeUs < sampleIntervalUs)
	//*   3    7:lload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #71  <Field long lastTimestampSampleTimeUs>
	//*   6   12:lsub            
	//*   7   13:aload_0         
	//*   8   14:getfield        #65  <Field long sampleIntervalUs>
	//*   9   17:lcmp            
	//*  10   18:ifge            23
				return false;
	//   11   21:iconst_0        
	//   12   22:ireturn         
			lastTimestampSampleTimeUs = l;
	//   13   23:aload_0         
	//   14   24:lload_1         
	//   15   25:putfield        #71  <Field long lastTimestampSampleTimeUs>
			boolean flag = audioTimestamp.maybeUpdateTimestamp();
	//   16   28:aload_0         
	//   17   29:getfield        #48  <Field AudioTimestampPoller$AudioTimestampV19 audioTimestamp>
	//   18   32:invokevirtual   #102 <Method boolean AudioTimestampPoller$AudioTimestampV19.maybeUpdateTimestamp()>
	//   19   35:istore_3        
			switch(state)
	//*  20   36:aload_0         
	//*  21   37:getfield        #58  <Field int state>
			{
	//*  22   40:tableswitch     0 4: default 76
	//	               0 136
	//	               1 104
	//	               2 94
	//	               3 84
	//	               4 193
			default:
				throw new IllegalStateException();
	//   23   76:new             #60  <Class IllegalStateException>
	//   24   79:dup             
	//   25   80:invokespecial   #61  <Method void IllegalStateException()>
	//   26   83:athrow          

			case 4: // '\004'
				break;

			case 3: // '\003'
				if(flag)
	//*  27   84:iload_3         
	//*  28   85:ifeq            193
				{
					reset();
	//   29   88:aload_0         
	//   30   89:invokevirtual   #51  <Method void reset()>
					return flag;
	//   31   92:iload_3         
	//   32   93:ireturn         
				}
				break;

			case 2: // '\002'
				if(!flag)
	//*  33   94:iload_3         
	//*  34   95:ifne            193
				{
					reset();
	//   35   98:aload_0         
	//   36   99:invokevirtual   #51  <Method void reset()>
					return flag;
	//   37  102:iload_3         
	//   38  103:ireturn         
				}
				break;

			case 1: // '\001'
				if(flag)
	//*  39  104:iload_3         
	//*  40  105:ifeq            130
				{
					if(audioTimestamp.getTimestampPositionFrames() > initialTimestampPositionFrames)
	//*  41  108:aload_0         
	//*  42  109:getfield        #48  <Field AudioTimestampPoller$AudioTimestampV19 audioTimestamp>
	//*  43  112:invokevirtual   #89  <Method long AudioTimestampPoller$AudioTimestampV19.getTimestampPositionFrames()>
	//*  44  115:aload_0         
	//*  45  116:getfield        #75  <Field long initialTimestampPositionFrames>
	//*  46  119:lcmp            
	//*  47  120:ifle            193
					{
						updateState(2);
	//   48  123:aload_0         
	//   49  124:iconst_2        
	//   50  125:invokespecial   #55  <Method void updateState(int)>
						return flag;
	//   51  128:iload_3         
	//   52  129:ireturn         
					}
				} else
				{
					reset();
	//   53  130:aload_0         
	//   54  131:invokevirtual   #51  <Method void reset()>
					return flag;
	//   55  134:iload_3         
	//   56  135:ireturn         
				}
				break;

			case 0: // '\0'
				if(flag)
	//*  57  136:iload_3         
	//*  58  137:ifeq            175
					if(audioTimestamp.getTimestampSystemTimeUs() >= initializeSystemTimeUs)
	//*  59  140:aload_0         
	//*  60  141:getfield        #48  <Field AudioTimestampPoller$AudioTimestampV19 audioTimestamp>
	//*  61  144:invokevirtual   #92  <Method long AudioTimestampPoller$AudioTimestampV19.getTimestampSystemTimeUs()>
	//*  62  147:aload_0         
	//*  63  148:getfield        #85  <Field long initializeSystemTimeUs>
	//*  64  151:lcmp            
	//*  65  152:iflt            173
					{
						initialTimestampPositionFrames = audioTimestamp.getTimestampPositionFrames();
	//   66  155:aload_0         
	//   67  156:aload_0         
	//   68  157:getfield        #48  <Field AudioTimestampPoller$AudioTimestampV19 audioTimestamp>
	//   69  160:invokevirtual   #89  <Method long AudioTimestampPoller$AudioTimestampV19.getTimestampPositionFrames()>
	//   70  163:putfield        #75  <Field long initialTimestampPositionFrames>
						updateState(1);
	//   71  166:aload_0         
	//   72  167:iconst_1        
	//   73  168:invokespecial   #55  <Method void updateState(int)>
						return flag;
	//   74  171:iload_3         
	//   75  172:ireturn         
					} else
					{
						return false;
	//   76  173:iconst_0        
	//   77  174:ireturn         
					}
				if(l - initializeSystemTimeUs > 0x7a120L)
	//*  78  175:lload_1         
	//*  79  176:aload_0         
	//*  80  177:getfield        #85  <Field long initializeSystemTimeUs>
	//*  81  180:lsub            
	//*  82  181:ldc2w           #62  <Long 0x7a120L>
	//*  83  184:lcmp            
	//*  84  185:ifle            193
					updateState(3);
	//   85  188:aload_0         
	//   86  189:iconst_3        
	//   87  190:invokespecial   #55  <Method void updateState(int)>
				break;
			}
			return flag;
	//   88  193:iload_3         
	//   89  194:ireturn         
		} else
		{
			return false;
	//   90  195:iconst_0        
	//   91  196:ireturn         
		}
	}

	public void rejectTimestamp()
	{
		updateState(4);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:invokespecial   #55  <Method void updateState(int)>
	//    3    5:return          
	}

	public void reset()
	{
		if(audioTimestamp != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field AudioTimestampPoller$AudioTimestampV19 audioTimestamp>
	//*   2    4:ifnull          12
			updateState(0);
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:invokespecial   #55  <Method void updateState(int)>
	//    6   12:return          
	}

	private static final int ERROR_POLL_INTERVAL_US = 0x7a120;
	private static final int FAST_POLL_INTERVAL_US = 5000;
	private static final int INITIALIZING_DURATION_US = 0x7a120;
	private static final int SLOW_POLL_INTERVAL_US = 0x989680;
	private static final int STATE_ERROR = 4;
	private static final int STATE_INITIALIZING = 0;
	private static final int STATE_NO_TIMESTAMP = 3;
	private static final int STATE_TIMESTAMP = 1;
	private static final int STATE_TIMESTAMP_ADVANCING = 2;
	private final AudioTimestampV19 audioTimestamp;
	private long initialTimestampPositionFrames;
	private long initializeSystemTimeUs;
	private long lastTimestampSampleTimeUs;
	private long sampleIntervalUs;
	private int state;
}
