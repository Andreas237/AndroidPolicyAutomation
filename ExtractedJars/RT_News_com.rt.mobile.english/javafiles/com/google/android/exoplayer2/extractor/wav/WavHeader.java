// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.wav;

import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Util;

final class WavHeader
	implements SeekMap
{

	public WavHeader(int i, int j, int k, int l, int i1, int j1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		numChannels = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #23  <Field int numChannels>
		sampleRateHz = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #25  <Field int sampleRateHz>
		averageBytesPerSecond = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #27  <Field int averageBytesPerSecond>
		blockAlignment = l;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #29  <Field int blockAlignment>
		bitsPerSample = i1;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #31  <Field int bitsPerSample>
		encoding = j1;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #33  <Field int encoding>
	//   20   37:return          
	}

	public int getBitrate()
	{
		return sampleRateHz * bitsPerSample * numChannels;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int sampleRateHz>
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field int bitsPerSample>
	//    4    8:imul            
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field int numChannels>
	//    7   13:imul            
	//    8   14:ireturn         
	}

	public int getBytesPerFrame()
	{
		return blockAlignment;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int blockAlignment>
	//    2    4:ireturn         
	}

	public long getDurationUs()
	{
		return ((dataSize / (long)blockAlignment) * 0xf4240L) / (long)sampleRateHz;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field long dataSize>
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field int blockAlignment>
	//    4    8:i2l             
	//    5    9:ldiv            
	//    6   10:ldc2w           #42  <Long 0xf4240L>
	//    7   13:lmul            
	//    8   14:aload_0         
	//    9   15:getfield        #25  <Field int sampleRateHz>
	//   10   18:i2l             
	//   11   19:ldiv            
	//   12   20:lreturn         
	}

	public int getEncoding()
	{
		return encoding;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int encoding>
	//    2    4:ireturn         
	}

	public int getNumChannels()
	{
		return numChannels;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int numChannels>
	//    2    4:ireturn         
	}

	public int getSampleRateHz()
	{
		return sampleRateHz;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int sampleRateHz>
	//    2    4:ireturn         
	}

	public com.google.android.exoplayer2.extractor.SeekMap.SeekPoints getSeekPoints(long l)
	{
		long l1 = Util.constrainValue((((long)averageBytesPerSecond * l) / 0xf4240L / (long)blockAlignment) * (long)blockAlignment, 0L, dataSize - (long)blockAlignment);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int averageBytesPerSecond>
	//    2    4:i2l             
	//    3    5:lload_1         
	//    4    6:lmul            
	//    5    7:ldc2w           #42  <Long 0xf4240L>
	//    6   10:ldiv            
	//    7   11:aload_0         
	//    8   12:getfield        #29  <Field int blockAlignment>
	//    9   15:i2l             
	//   10   16:ldiv            
	//   11   17:aload_0         
	//   12   18:getfield        #29  <Field int blockAlignment>
	//   13   21:i2l             
	//   14   22:lmul            
	//   15   23:lconst_0        
	//   16   24:aload_0         
	//   17   25:getfield        #41  <Field long dataSize>
	//   18   28:aload_0         
	//   19   29:getfield        #29  <Field int blockAlignment>
	//   20   32:i2l             
	//   21   33:lsub            
	//   22   34:invokestatic    #54  <Method long Util.constrainValue(long, long, long)>
	//   23   37:lstore_3        
		long l2 = dataStartPosition + l1;
	//   24   38:aload_0         
	//   25   39:getfield        #56  <Field long dataStartPosition>
	//   26   42:lload_3         
	//   27   43:ladd            
	//   28   44:lstore          5
		long l3 = getTimeUs(l2);
	//   29   46:aload_0         
	//   30   47:lload           5
	//   31   49:invokevirtual   #60  <Method long getTimeUs(long)>
	//   32   52:lstore          7
		SeekPoint seekpoint = new SeekPoint(l3, l2);
	//   33   54:new             #62  <Class SeekPoint>
	//   34   57:dup             
	//   35   58:lload           7
	//   36   60:lload           5
	//   37   62:invokespecial   #65  <Method void SeekPoint(long, long)>
	//   38   65:astore          9
		if(l3 < l && l1 != dataSize - (long)blockAlignment)
	//*  39   67:lload           7
	//*  40   69:lload_1         
	//*  41   70:lcmp            
	//*  42   71:ifge            124
	//*  43   74:lload_3         
	//*  44   75:aload_0         
	//*  45   76:getfield        #41  <Field long dataSize>
	//*  46   79:aload_0         
	//*  47   80:getfield        #29  <Field int blockAlignment>
	//*  48   83:i2l             
	//*  49   84:lsub            
	//*  50   85:lcmp            
	//*  51   86:ifne            92
	//*  52   89:goto            124
		{
			l = l2 + (long)blockAlignment;
	//   53   92:lload           5
	//   54   94:aload_0         
	//   55   95:getfield        #29  <Field int blockAlignment>
	//   56   98:i2l             
	//   57   99:ladd            
	//   58  100:lstore_1        
			return new com.google.android.exoplayer2.extractor.SeekMap.SeekPoints(seekpoint, new SeekPoint(getTimeUs(l), l));
	//   59  101:new             #67  <Class com.google.android.exoplayer2.extractor.SeekMap$SeekPoints>
	//   60  104:dup             
	//   61  105:aload           9
	//   62  107:new             #62  <Class SeekPoint>
	//   63  110:dup             
	//   64  111:aload_0         
	//   65  112:lload_1         
	//   66  113:invokevirtual   #60  <Method long getTimeUs(long)>
	//   67  116:lload_1         
	//   68  117:invokespecial   #65  <Method void SeekPoint(long, long)>
	//   69  120:invokespecial   #70  <Method void com.google.android.exoplayer2.extractor.SeekMap$SeekPoints(SeekPoint, SeekPoint)>
	//   70  123:areturn         
		} else
		{
			return new com.google.android.exoplayer2.extractor.SeekMap.SeekPoints(seekpoint);
	//   71  124:new             #67  <Class com.google.android.exoplayer2.extractor.SeekMap$SeekPoints>
	//   72  127:dup             
	//   73  128:aload           9
	//   74  130:invokespecial   #73  <Method void com.google.android.exoplayer2.extractor.SeekMap$SeekPoints(SeekPoint)>
	//   75  133:areturn         
		}
	}

	public long getTimeUs(long l)
	{
		return (Math.max(0L, l - dataStartPosition) * 0xf4240L) / (long)averageBytesPerSecond;
	//    0    0:lconst_0        
	//    1    1:lload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #56  <Field long dataStartPosition>
	//    4    6:lsub            
	//    5    7:invokestatic    #79  <Method long Math.max(long, long)>
	//    6   10:ldc2w           #42  <Long 0xf4240L>
	//    7   13:lmul            
	//    8   14:aload_0         
	//    9   15:getfield        #27  <Field int averageBytesPerSecond>
	//   10   18:i2l             
	//   11   19:ldiv            
	//   12   20:lreturn         
	}

	public boolean hasDataBounds()
	{
		return dataStartPosition != 0L && dataSize != 0L;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field long dataStartPosition>
	//    2    4:lconst_0        
	//    3    5:lcmp            
	//    4    6:ifeq            20
	//    5    9:aload_0         
	//    6   10:getfield        #41  <Field long dataSize>
	//    7   13:lconst_0        
	//    8   14:lcmp            
	//    9   15:ifeq            20
	//   10   18:iconst_1        
	//   11   19:ireturn         
	//   12   20:iconst_0        
	//   13   21:ireturn         
	}

	public boolean isSeekable()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void setDataBounds(long l, long l1)
	{
		dataStartPosition = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #56  <Field long dataStartPosition>
		dataSize = l1;
	//    3    5:aload_0         
	//    4    6:lload_3         
	//    5    7:putfield        #41  <Field long dataSize>
	//    6   10:return          
	}

	private final int averageBytesPerSecond;
	private final int bitsPerSample;
	private final int blockAlignment;
	private long dataSize;
	private long dataStartPosition;
	private final int encoding;
	private final int numChannels;
	private final int sampleRateHz;
}
