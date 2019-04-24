// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.util;


// Referenced classes of package com.google.android.exoplayer2.util:
//			ParsableBitArray, Util

public final class FlacStreamInfo
{

	public FlacStreamInfo(int i, int j, int k, int l, int i1, int j1, int k1, 
			long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		minBlockSize = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #21  <Field int minBlockSize>
		maxBlockSize = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #23  <Field int maxBlockSize>
		minFrameSize = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #25  <Field int minFrameSize>
		maxFrameSize = l;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #27  <Field int maxFrameSize>
		sampleRate = i1;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #29  <Field int sampleRate>
		channels = j1;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #31  <Field int channels>
		bitsPerSample = k1;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #33  <Field int bitsPerSample>
		totalSamples = l1;
	//   23   43:aload_0         
	//   24   44:lload           8
	//   25   46:putfield        #35  <Field long totalSamples>
	//   26   49:return          
	}

	public FlacStreamInfo(byte abyte0[], int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		abyte0 = ((byte []) (new ParsableBitArray(abyte0)));
	//    2    4:new             #39  <Class ParsableBitArray>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #42  <Method void ParsableBitArray(byte[])>
	//    6   12:astore_1        
		((ParsableBitArray) (abyte0)).setPosition(i * 8);
	//    7   13:aload_1         
	//    8   14:iload_2         
	//    9   15:bipush          8
	//   10   17:imul            
	//   11   18:invokevirtual   #46  <Method void ParsableBitArray.setPosition(int)>
		minBlockSize = ((ParsableBitArray) (abyte0)).readBits(16);
	//   12   21:aload_0         
	//   13   22:aload_1         
	//   14   23:bipush          16
	//   15   25:invokevirtual   #50  <Method int ParsableBitArray.readBits(int)>
	//   16   28:putfield        #21  <Field int minBlockSize>
		maxBlockSize = ((ParsableBitArray) (abyte0)).readBits(16);
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:bipush          16
	//   20   35:invokevirtual   #50  <Method int ParsableBitArray.readBits(int)>
	//   21   38:putfield        #23  <Field int maxBlockSize>
		minFrameSize = ((ParsableBitArray) (abyte0)).readBits(24);
	//   22   41:aload_0         
	//   23   42:aload_1         
	//   24   43:bipush          24
	//   25   45:invokevirtual   #50  <Method int ParsableBitArray.readBits(int)>
	//   26   48:putfield        #25  <Field int minFrameSize>
		maxFrameSize = ((ParsableBitArray) (abyte0)).readBits(24);
	//   27   51:aload_0         
	//   28   52:aload_1         
	//   29   53:bipush          24
	//   30   55:invokevirtual   #50  <Method int ParsableBitArray.readBits(int)>
	//   31   58:putfield        #27  <Field int maxFrameSize>
		sampleRate = ((ParsableBitArray) (abyte0)).readBits(20);
	//   32   61:aload_0         
	//   33   62:aload_1         
	//   34   63:bipush          20
	//   35   65:invokevirtual   #50  <Method int ParsableBitArray.readBits(int)>
	//   36   68:putfield        #29  <Field int sampleRate>
		channels = ((ParsableBitArray) (abyte0)).readBits(3) + 1;
	//   37   71:aload_0         
	//   38   72:aload_1         
	//   39   73:iconst_3        
	//   40   74:invokevirtual   #50  <Method int ParsableBitArray.readBits(int)>
	//   41   77:iconst_1        
	//   42   78:iadd            
	//   43   79:putfield        #31  <Field int channels>
		bitsPerSample = ((ParsableBitArray) (abyte0)).readBits(5) + 1;
	//   44   82:aload_0         
	//   45   83:aload_1         
	//   46   84:iconst_5        
	//   47   85:invokevirtual   #50  <Method int ParsableBitArray.readBits(int)>
	//   48   88:iconst_1        
	//   49   89:iadd            
	//   50   90:putfield        #33  <Field int bitsPerSample>
		totalSamples = ((long)((ParsableBitArray) (abyte0)).readBits(4) & 15L) << 32 | (long)((ParsableBitArray) (abyte0)).readBits(32) & 0xffffffffL;
	//   51   93:aload_0         
	//   52   94:aload_1         
	//   53   95:iconst_4        
	//   54   96:invokevirtual   #50  <Method int ParsableBitArray.readBits(int)>
	//   55   99:i2l             
	//   56  100:ldc2w           #51  <Long 15L>
	//   57  103:land            
	//   58  104:bipush          32
	//   59  106:lshl            
	//   60  107:aload_1         
	//   61  108:bipush          32
	//   62  110:invokevirtual   #50  <Method int ParsableBitArray.readBits(int)>
	//   63  113:i2l             
	//   64  114:ldc2w           #53  <Long 0xffffffffL>
	//   65  117:land            
	//   66  118:lor             
	//   67  119:putfield        #35  <Field long totalSamples>
	//   68  122:return          
	}

	public int bitRate()
	{
		return bitsPerSample * sampleRate;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int bitsPerSample>
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field int sampleRate>
	//    4    8:imul            
	//    5    9:ireturn         
	}

	public long durationUs()
	{
		return (totalSamples * 0xf4240L) / (long)sampleRate;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field long totalSamples>
	//    2    4:ldc2w           #59  <Long 0xf4240L>
	//    3    7:lmul            
	//    4    8:aload_0         
	//    5    9:getfield        #29  <Field int sampleRate>
	//    6   12:i2l             
	//    7   13:ldiv            
	//    8   14:lreturn         
	}

	public long getApproxBytesPerFrame()
	{
		if(maxFrameSize > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field int maxFrameSize>
	//*   2    4:ifle            25
			return ((long)maxFrameSize + (long)minFrameSize) / 2L + 1L;
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field int maxFrameSize>
	//    5   11:i2l             
	//    6   12:aload_0         
	//    7   13:getfield        #25  <Field int minFrameSize>
	//    8   16:i2l             
	//    9   17:ladd            
	//   10   18:ldc2w           #62  <Long 2L>
	//   11   21:ldiv            
	//   12   22:lconst_1        
	//   13   23:ladd            
	//   14   24:lreturn         
		long l;
		if(minBlockSize == maxBlockSize && minBlockSize > 0)
	//*  15   25:aload_0         
	//*  16   26:getfield        #21  <Field int minBlockSize>
	//*  17   29:aload_0         
	//*  18   30:getfield        #23  <Field int maxBlockSize>
	//*  19   33:icmpne          52
	//*  20   36:aload_0         
	//*  21   37:getfield        #21  <Field int minBlockSize>
	//*  22   40:ifle            52
			l = minBlockSize;
	//   23   43:aload_0         
	//   24   44:getfield        #21  <Field int minBlockSize>
	//   25   47:i2l             
	//   26   48:lstore_1        
		else
	//*  27   49:goto            56
			l = 4096L;
	//   28   52:ldc2w           #64  <Long 4096L>
	//   29   55:lstore_1        
		return (l * (long)channels * (long)bitsPerSample) / 8L + 64L;
	//   30   56:lload_1         
	//   31   57:aload_0         
	//   32   58:getfield        #31  <Field int channels>
	//   33   61:i2l             
	//   34   62:lmul            
	//   35   63:aload_0         
	//   36   64:getfield        #33  <Field int bitsPerSample>
	//   37   67:i2l             
	//   38   68:lmul            
	//   39   69:ldc2w           #66  <Long 8L>
	//   40   72:ldiv            
	//   41   73:ldc2w           #68  <Long 64L>
	//   42   76:ladd            
	//   43   77:lreturn         
	}

	public long getSampleIndex(long l)
	{
		return Util.constrainValue((l * (long)sampleRate) / 0xf4240L, 0L, totalSamples - 1L);
	//    0    0:lload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #29  <Field int sampleRate>
	//    3    5:i2l             
	//    4    6:lmul            
	//    5    7:ldc2w           #59  <Long 0xf4240L>
	//    6   10:ldiv            
	//    7   11:lconst_0        
	//    8   12:aload_0         
	//    9   13:getfield        #35  <Field long totalSamples>
	//   10   16:lconst_1        
	//   11   17:lsub            
	//   12   18:invokestatic    #77  <Method long Util.constrainValue(long, long, long)>
	//   13   21:lreturn         
	}

	public int maxDecodedFrameSize()
	{
		return maxBlockSize * channels * (bitsPerSample / 8);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int maxBlockSize>
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field int channels>
	//    4    8:imul            
	//    5    9:aload_0         
	//    6   10:getfield        #33  <Field int bitsPerSample>
	//    7   13:bipush          8
	//    8   15:idiv            
	//    9   16:imul            
	//   10   17:ireturn         
	}

	public final int bitsPerSample;
	public final int channels;
	public final int maxBlockSize;
	public final int maxFrameSize;
	public final int minBlockSize;
	public final int minFrameSize;
	public final int sampleRate;
	public final long totalSamples;
}
