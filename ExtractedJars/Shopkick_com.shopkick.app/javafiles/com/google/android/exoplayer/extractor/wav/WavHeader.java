// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.wav;


final class WavHeader
{

	public WavHeader(int i, int j, int k, int l, int i1, int j1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		numChannels = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #21  <Field int numChannels>
		sampleRateHz = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #23  <Field int sampleRateHz>
		averageBytesPerSecond = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #25  <Field int averageBytesPerSecond>
		blockAlignment = l;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #27  <Field int blockAlignment>
		bitsPerSample = i1;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #29  <Field int bitsPerSample>
		encoding = j1;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #31  <Field int encoding>
	//   20   37:return          
	}

	public int getBitrate()
	{
		return sampleRateHz * bitsPerSample * numChannels;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int sampleRateHz>
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field int bitsPerSample>
	//    4    8:imul            
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field int numChannels>
	//    7   13:imul            
	//    8   14:ireturn         
	}

	public int getBytesPerFrame()
	{
		return blockAlignment;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int blockAlignment>
	//    2    4:ireturn         
	}

	public long getDurationUs()
	{
		return ((dataSize / (long)blockAlignment) * 0xf4240L) / (long)sampleRateHz;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field long dataSize>
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field int blockAlignment>
	//    4    8:i2l             
	//    5    9:ldiv            
	//    6   10:ldc2w           #40  <Long 0xf4240L>
	//    7   13:lmul            
	//    8   14:aload_0         
	//    9   15:getfield        #23  <Field int sampleRateHz>
	//   10   18:i2l             
	//   11   19:ldiv            
	//   12   20:lreturn         
	}

	public int getEncoding()
	{
		return encoding;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int encoding>
	//    2    4:ireturn         
	}

	public int getNumChannels()
	{
		return numChannels;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int numChannels>
	//    2    4:ireturn         
	}

	public long getPosition(long l)
	{
		l = (l * (long)averageBytesPerSecond) / 0xf4240L;
	//    0    0:lload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #25  <Field int averageBytesPerSecond>
	//    3    5:i2l             
	//    4    6:lmul            
	//    5    7:ldc2w           #40  <Long 0xf4240L>
	//    6   10:ldiv            
	//    7   11:lstore_1        
		int i = blockAlignment;
	//    8   12:aload_0         
	//    9   13:getfield        #27  <Field int blockAlignment>
	//   10   16:istore_3        
		return (l / (long)i) * (long)i + dataStartPosition;
	//   11   17:lload_1         
	//   12   18:iload_3         
	//   13   19:i2l             
	//   14   20:ldiv            
	//   15   21:iload_3         
	//   16   22:i2l             
	//   17   23:lmul            
	//   18   24:aload_0         
	//   19   25:getfield        #47  <Field long dataStartPosition>
	//   20   28:ladd            
	//   21   29:lreturn         
	}

	public int getSampleRateHz()
	{
		return sampleRateHz;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int sampleRateHz>
	//    2    4:ireturn         
	}

	public long getTimeUs(long l)
	{
		return (l * 0xf4240L) / (long)averageBytesPerSecond;
	//    0    0:lload_1         
	//    1    1:ldc2w           #40  <Long 0xf4240L>
	//    2    4:lmul            
	//    3    5:aload_0         
	//    4    6:getfield        #25  <Field int averageBytesPerSecond>
	//    5    9:i2l             
	//    6   10:ldiv            
	//    7   11:lreturn         
	}

	public boolean hasDataBounds()
	{
		return dataStartPosition != 0L && dataSize != 0L;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field long dataStartPosition>
	//    2    4:lconst_0        
	//    3    5:lcmp            
	//    4    6:ifeq            20
	//    5    9:aload_0         
	//    6   10:getfield        #39  <Field long dataSize>
	//    7   13:lconst_0        
	//    8   14:lcmp            
	//    9   15:ifeq            20
	//   10   18:iconst_1        
	//   11   19:ireturn         
	//   12   20:iconst_0        
	//   13   21:ireturn         
	}

	public void setDataBounds(long l, long l1)
	{
		dataStartPosition = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #47  <Field long dataStartPosition>
		dataSize = l1;
	//    3    5:aload_0         
	//    4    6:lload_3         
	//    5    7:putfield        #39  <Field long dataSize>
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
