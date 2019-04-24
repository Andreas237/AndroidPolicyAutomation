// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.extractor.MpegAudioHeader;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Util;

final class ConstantBitrateSeeker
	implements Mp3Extractor.Seeker
{

	public ConstantBitrateSeeker(long l, long l1, MpegAudioHeader mpegaudioheader)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		firstFramePosition = l1;
	//    2    4:aload_0         
	//    3    5:lload_3         
	//    4    6:putfield        #22  <Field long firstFramePosition>
		frameSize = mpegaudioheader.frameSize;
	//    5    9:aload_0         
	//    6   10:aload           5
	//    7   12:getfield        #26  <Field int MpegAudioHeader.frameSize>
	//    8   15:putfield        #27  <Field int frameSize>
		bitrate = mpegaudioheader.bitrate;
	//    9   18:aload_0         
	//   10   19:aload           5
	//   11   21:getfield        #29  <Field int MpegAudioHeader.bitrate>
	//   12   24:putfield        #30  <Field int bitrate>
		if(l == -1L)
	//*  13   27:lload_1         
	//*  14   28:ldc2w           #31  <Long -1L>
	//*  15   31:lcmp            
	//*  16   32:ifne            50
		{
			dataSize = -1L;
	//   17   35:aload_0         
	//   18   36:ldc2w           #31  <Long -1L>
	//   19   39:putfield        #34  <Field long dataSize>
			durationUs = 0x1L;
	//   20   42:aload_0         
	//   21   43:ldc2w           #35  <Long 0x1L>
	//   22   46:putfield        #38  <Field long durationUs>
			return;
	//   23   49:return          
		} else
		{
			dataSize = l - l1;
	//   24   50:aload_0         
	//   25   51:lload_1         
	//   26   52:lload_3         
	//   27   53:lsub            
	//   28   54:putfield        #34  <Field long dataSize>
			durationUs = getTimeUs(l);
	//   29   57:aload_0         
	//   30   58:aload_0         
	//   31   59:lload_1         
	//   32   60:invokevirtual   #42  <Method long getTimeUs(long)>
	//   33   63:putfield        #38  <Field long durationUs>
			return;
	//   34   66:return          
		}
	}

	public long getDurationUs()
	{
		return durationUs;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field long durationUs>
	//    2    4:lreturn         
	}

	public com.google.android.exoplayer2.extractor.SeekMap.SeekPoints getSeekPoints(long l)
	{
		if(dataSize == -1L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field long dataSize>
	//*   2    4:ldc2w           #31  <Long -1L>
	//*   3    7:lcmp            
	//*   4    8:ifne            31
			return new com.google.android.exoplayer2.extractor.SeekMap.SeekPoints(new SeekPoint(0L, firstFramePosition));
	//    5   11:new             #49  <Class com.google.android.exoplayer2.extractor.SeekMap$SeekPoints>
	//    6   14:dup             
	//    7   15:new             #51  <Class SeekPoint>
	//    8   18:dup             
	//    9   19:lconst_0        
	//   10   20:aload_0         
	//   11   21:getfield        #22  <Field long firstFramePosition>
	//   12   24:invokespecial   #54  <Method void SeekPoint(long, long)>
	//   13   27:invokespecial   #57  <Method void com.google.android.exoplayer2.extractor.SeekMap$SeekPoints(SeekPoint)>
	//   14   30:areturn         
		long l1 = Util.constrainValue((((long)bitrate * l) / 0x7a1200L / (long)frameSize) * (long)frameSize, 0L, dataSize - (long)frameSize);
	//   15   31:aload_0         
	//   16   32:getfield        #30  <Field int bitrate>
	//   17   35:i2l             
	//   18   36:lload_1         
	//   19   37:lmul            
	//   20   38:ldc2w           #58  <Long 0x7a1200L>
	//   21   41:ldiv            
	//   22   42:aload_0         
	//   23   43:getfield        #27  <Field int frameSize>
	//   24   46:i2l             
	//   25   47:ldiv            
	//   26   48:aload_0         
	//   27   49:getfield        #27  <Field int frameSize>
	//   28   52:i2l             
	//   29   53:lmul            
	//   30   54:lconst_0        
	//   31   55:aload_0         
	//   32   56:getfield        #34  <Field long dataSize>
	//   33   59:aload_0         
	//   34   60:getfield        #27  <Field int frameSize>
	//   35   63:i2l             
	//   36   64:lsub            
	//   37   65:invokestatic    #65  <Method long Util.constrainValue(long, long, long)>
	//   38   68:lstore_3        
		long l2 = firstFramePosition + l1;
	//   39   69:aload_0         
	//   40   70:getfield        #22  <Field long firstFramePosition>
	//   41   73:lload_3         
	//   42   74:ladd            
	//   43   75:lstore          5
		long l3 = getTimeUs(l2);
	//   44   77:aload_0         
	//   45   78:lload           5
	//   46   80:invokevirtual   #42  <Method long getTimeUs(long)>
	//   47   83:lstore          7
		SeekPoint seekpoint = new SeekPoint(l3, l2);
	//   48   85:new             #51  <Class SeekPoint>
	//   49   88:dup             
	//   50   89:lload           7
	//   51   91:lload           5
	//   52   93:invokespecial   #54  <Method void SeekPoint(long, long)>
	//   53   96:astore          9
		if(l3 < l && l1 != dataSize - (long)frameSize)
	//*  54   98:lload           7
	//*  55  100:lload_1         
	//*  56  101:lcmp            
	//*  57  102:ifge            155
	//*  58  105:lload_3         
	//*  59  106:aload_0         
	//*  60  107:getfield        #34  <Field long dataSize>
	//*  61  110:aload_0         
	//*  62  111:getfield        #27  <Field int frameSize>
	//*  63  114:i2l             
	//*  64  115:lsub            
	//*  65  116:lcmp            
	//*  66  117:ifne            123
	//*  67  120:goto            155
		{
			l = l2 + (long)frameSize;
	//   68  123:lload           5
	//   69  125:aload_0         
	//   70  126:getfield        #27  <Field int frameSize>
	//   71  129:i2l             
	//   72  130:ladd            
	//   73  131:lstore_1        
			return new com.google.android.exoplayer2.extractor.SeekMap.SeekPoints(seekpoint, new SeekPoint(getTimeUs(l), l));
	//   74  132:new             #49  <Class com.google.android.exoplayer2.extractor.SeekMap$SeekPoints>
	//   75  135:dup             
	//   76  136:aload           9
	//   77  138:new             #51  <Class SeekPoint>
	//   78  141:dup             
	//   79  142:aload_0         
	//   80  143:lload_1         
	//   81  144:invokevirtual   #42  <Method long getTimeUs(long)>
	//   82  147:lload_1         
	//   83  148:invokespecial   #54  <Method void SeekPoint(long, long)>
	//   84  151:invokespecial   #68  <Method void com.google.android.exoplayer2.extractor.SeekMap$SeekPoints(SeekPoint, SeekPoint)>
	//   85  154:areturn         
		} else
		{
			return new com.google.android.exoplayer2.extractor.SeekMap.SeekPoints(seekpoint);
	//   86  155:new             #49  <Class com.google.android.exoplayer2.extractor.SeekMap$SeekPoints>
	//   87  158:dup             
	//   88  159:aload           9
	//   89  161:invokespecial   #57  <Method void com.google.android.exoplayer2.extractor.SeekMap$SeekPoints(SeekPoint)>
	//   90  164:areturn         
		}
	}

	public long getTimeUs(long l)
	{
		return (Math.max(0L, l - firstFramePosition) * 0xf4240L * 8L) / (long)bitrate;
	//    0    0:lconst_0        
	//    1    1:lload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #22  <Field long firstFramePosition>
	//    4    6:lsub            
	//    5    7:invokestatic    #74  <Method long Math.max(long, long)>
	//    6   10:ldc2w           #75  <Long 0xf4240L>
	//    7   13:lmul            
	//    8   14:ldc2w           #77  <Long 8L>
	//    9   17:lmul            
	//   10   18:aload_0         
	//   11   19:getfield        #30  <Field int bitrate>
	//   12   22:i2l             
	//   13   23:ldiv            
	//   14   24:lreturn         
	}

	public boolean isSeekable()
	{
		return dataSize != -1L;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field long dataSize>
	//    2    4:ldc2w           #31  <Long -1L>
	//    3    7:lcmp            
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	private static final int BITS_PER_BYTE = 8;
	private final int bitrate;
	private final long dataSize;
	private final long durationUs;
	private final long firstFramePosition;
	private final int frameSize;
}
