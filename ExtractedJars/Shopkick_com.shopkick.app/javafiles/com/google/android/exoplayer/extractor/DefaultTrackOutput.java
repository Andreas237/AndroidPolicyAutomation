// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor;

import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.SampleHolder;
import com.google.android.exoplayer.upstream.Allocator;
import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.util.ParsableByteArray;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.extractor:
//			TrackOutput, RollingSampleBuffer, ExtractorInput

public class DefaultTrackOutput
	implements TrackOutput
{

	public DefaultTrackOutput(Allocator allocator)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		rollingBuffer = new RollingSampleBuffer(allocator);
	//    2    4:aload_0         
	//    3    5:new             #25  <Class RollingSampleBuffer>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #27  <Method void RollingSampleBuffer(Allocator)>
	//    7   13:putfield        #29  <Field RollingSampleBuffer rollingBuffer>
	//    8   16:aload_0         
	//    9   17:new             #31  <Class SampleHolder>
	//   10   20:dup             
	//   11   21:iconst_0        
	//   12   22:invokespecial   #34  <Method void SampleHolder(int)>
	//   13   25:putfield        #36  <Field SampleHolder sampleInfoHolder>
		needKeyframe = true;
	//   14   28:aload_0         
	//   15   29:iconst_1        
	//   16   30:putfield        #38  <Field boolean needKeyframe>
		lastReadTimeUs = 0x0L;
	//   17   33:aload_0         
	//   18   34:ldc2w           #39  <Long 0x0L>
	//   19   37:putfield        #42  <Field long lastReadTimeUs>
		spliceOutTimeUs = 0x0L;
	//   20   40:aload_0         
	//   21   41:ldc2w           #39  <Long 0x0L>
	//   22   44:putfield        #44  <Field long spliceOutTimeUs>
		largestParsedTimestampUs = 0x0L;
	//   23   47:aload_0         
	//   24   48:ldc2w           #39  <Long 0x0L>
	//   25   51:putfield        #46  <Field long largestParsedTimestampUs>
	//   26   54:return          
	}

	private boolean advanceToEligibleSample()
	{
		boolean flag = rollingBuffer.peekSample(sampleInfoHolder);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field RollingSampleBuffer rollingBuffer>
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field SampleHolder sampleInfoHolder>
	//    4    8:invokevirtual   #53  <Method boolean RollingSampleBuffer.peekSample(SampleHolder)>
	//    5   11:istore_1        
		boolean flag1 = flag;
	//    6   12:iload_1         
	//    7   13:istore_2        
		if(needKeyframe)
	//*   8   14:aload_0         
	//*   9   15:getfield        #38  <Field boolean needKeyframe>
	//*  10   18:ifeq            61
			do
			{
				flag1 = flag;
	//   11   21:iload_1         
	//   12   22:istore_2        
				if(!flag)
					break;
	//   13   23:iload_1         
	//   14   24:ifeq            61
				flag1 = flag;
	//   15   27:iload_1         
	//   16   28:istore_2        
				if(sampleInfoHolder.isSyncFrame())
					break;
	//   17   29:aload_0         
	//   18   30:getfield        #36  <Field SampleHolder sampleInfoHolder>
	//   19   33:invokevirtual   #56  <Method boolean SampleHolder.isSyncFrame()>
	//   20   36:ifne            61
				rollingBuffer.skipSample();
	//   21   39:aload_0         
	//   22   40:getfield        #29  <Field RollingSampleBuffer rollingBuffer>
	//   23   43:invokevirtual   #59  <Method void RollingSampleBuffer.skipSample()>
				flag = rollingBuffer.peekSample(sampleInfoHolder);
	//   24   46:aload_0         
	//   25   47:getfield        #29  <Field RollingSampleBuffer rollingBuffer>
	//   26   50:aload_0         
	//   27   51:getfield        #36  <Field SampleHolder sampleInfoHolder>
	//   28   54:invokevirtual   #53  <Method boolean RollingSampleBuffer.peekSample(SampleHolder)>
	//   29   57:istore_1        
			} while(true);
	//   30   58:goto            21
		if(!flag1)
	//*  31   61:iload_2         
	//*  32   62:ifne            67
			return false;
	//   33   65:iconst_0        
	//   34   66:ireturn         
		return spliceOutTimeUs == 0x0L || sampleInfoHolder.timeUs < spliceOutTimeUs;
	//   35   67:aload_0         
	//   36   68:getfield        #44  <Field long spliceOutTimeUs>
	//   37   71:ldc2w           #39  <Long 0x0L>
	//   38   74:lcmp            
	//   39   75:ifeq            95
	//   40   78:aload_0         
	//   41   79:getfield        #36  <Field SampleHolder sampleInfoHolder>
	//   42   82:getfield        #62  <Field long SampleHolder.timeUs>
	//   43   85:aload_0         
	//   44   86:getfield        #44  <Field long spliceOutTimeUs>
	//   45   89:lcmp            
	//   46   90:iflt            95
	//   47   93:iconst_0        
	//   48   94:ireturn         
	//   49   95:iconst_1        
	//   50   96:ireturn         
	}

	public void clear()
	{
		rollingBuffer.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field RollingSampleBuffer rollingBuffer>
	//    2    4:invokevirtual   #65  <Method void RollingSampleBuffer.clear()>
		needKeyframe = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #38  <Field boolean needKeyframe>
		lastReadTimeUs = 0x0L;
	//    6   12:aload_0         
	//    7   13:ldc2w           #39  <Long 0x0L>
	//    8   16:putfield        #42  <Field long lastReadTimeUs>
		spliceOutTimeUs = 0x0L;
	//    9   19:aload_0         
	//   10   20:ldc2w           #39  <Long 0x0L>
	//   11   23:putfield        #44  <Field long spliceOutTimeUs>
		largestParsedTimestampUs = 0x0L;
	//   12   26:aload_0         
	//   13   27:ldc2w           #39  <Long 0x0L>
	//   14   30:putfield        #46  <Field long largestParsedTimestampUs>
	//   15   33:return          
	}

	public boolean configureSpliceTo(DefaultTrackOutput defaulttrackoutput)
	{
		if(spliceOutTimeUs != 0x0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field long spliceOutTimeUs>
	//*   2    4:ldc2w           #39  <Long 0x0L>
	//*   3    7:lcmp            
	//*   4    8:ifeq            13
			return true;
	//    5   11:iconst_1        
	//    6   12:ireturn         
		long l;
		if(rollingBuffer.peekSample(sampleInfoHolder))
	//*   7   13:aload_0         
	//*   8   14:getfield        #29  <Field RollingSampleBuffer rollingBuffer>
	//*   9   17:aload_0         
	//*  10   18:getfield        #36  <Field SampleHolder sampleInfoHolder>
	//*  11   21:invokevirtual   #53  <Method boolean RollingSampleBuffer.peekSample(SampleHolder)>
	//*  12   24:ifeq            38
			l = sampleInfoHolder.timeUs;
	//   13   27:aload_0         
	//   14   28:getfield        #36  <Field SampleHolder sampleInfoHolder>
	//   15   31:getfield        #62  <Field long SampleHolder.timeUs>
	//   16   34:lstore_2        
		else
	//*  17   35:goto            45
			l = lastReadTimeUs + 1L;
	//   18   38:aload_0         
	//   19   39:getfield        #42  <Field long lastReadTimeUs>
	//   20   42:lconst_1        
	//   21   43:ladd            
	//   22   44:lstore_2        
		for(defaulttrackoutput = ((DefaultTrackOutput) (defaulttrackoutput.rollingBuffer)); ((RollingSampleBuffer) (defaulttrackoutput)).peekSample(sampleInfoHolder) && (sampleInfoHolder.timeUs < l || !sampleInfoHolder.isSyncFrame()); ((RollingSampleBuffer) (defaulttrackoutput)).skipSample());
	//   23   45:aload_1         
	//   24   46:getfield        #29  <Field RollingSampleBuffer rollingBuffer>
	//   25   49:astore_1        
	//   26   50:aload_1         
	//   27   51:aload_0         
	//   28   52:getfield        #36  <Field SampleHolder sampleInfoHolder>
	//   29   55:invokevirtual   #53  <Method boolean RollingSampleBuffer.peekSample(SampleHolder)>
	//   30   58:ifeq            90
	//   31   61:aload_0         
	//   32   62:getfield        #36  <Field SampleHolder sampleInfoHolder>
	//   33   65:getfield        #62  <Field long SampleHolder.timeUs>
	//   34   68:lload_2         
	//   35   69:lcmp            
	//   36   70:iflt            83
	//   37   73:aload_0         
	//   38   74:getfield        #36  <Field SampleHolder sampleInfoHolder>
	//   39   77:invokevirtual   #56  <Method boolean SampleHolder.isSyncFrame()>
	//   40   80:ifne            90
	//   41   83:aload_1         
	//   42   84:invokevirtual   #59  <Method void RollingSampleBuffer.skipSample()>
	//*  43   87:goto            50
		if(((RollingSampleBuffer) (defaulttrackoutput)).peekSample(sampleInfoHolder))
	//*  44   90:aload_1         
	//*  45   91:aload_0         
	//*  46   92:getfield        #36  <Field SampleHolder sampleInfoHolder>
	//*  47   95:invokevirtual   #53  <Method boolean RollingSampleBuffer.peekSample(SampleHolder)>
	//*  48   98:ifeq            114
		{
			spliceOutTimeUs = sampleInfoHolder.timeUs;
	//   49  101:aload_0         
	//   50  102:aload_0         
	//   51  103:getfield        #36  <Field SampleHolder sampleInfoHolder>
	//   52  106:getfield        #62  <Field long SampleHolder.timeUs>
	//   53  109:putfield        #44  <Field long spliceOutTimeUs>
			return true;
	//   54  112:iconst_1        
	//   55  113:ireturn         
		} else
		{
			return false;
	//   56  114:iconst_0        
	//   57  115:ireturn         
		}
	}

	public void discardUntil(long l)
	{
		while(rollingBuffer.peekSample(sampleInfoHolder) && sampleInfoHolder.timeUs < l) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field RollingSampleBuffer rollingBuffer>
	//*   2    4:aload_0         
	//*   3    5:getfield        #36  <Field SampleHolder sampleInfoHolder>
	//*   4    8:invokevirtual   #53  <Method boolean RollingSampleBuffer.peekSample(SampleHolder)>
	//*   5   11:ifeq            41
	//*   6   14:aload_0         
	//*   7   15:getfield        #36  <Field SampleHolder sampleInfoHolder>
	//*   8   18:getfield        #62  <Field long SampleHolder.timeUs>
	//*   9   21:lload_1         
	//*  10   22:lcmp            
	//*  11   23:ifge            41
		{
			rollingBuffer.skipSample();
	//   12   26:aload_0         
	//   13   27:getfield        #29  <Field RollingSampleBuffer rollingBuffer>
	//   14   30:invokevirtual   #59  <Method void RollingSampleBuffer.skipSample()>
			needKeyframe = true;
	//   15   33:aload_0         
	//   16   34:iconst_1        
	//   17   35:putfield        #38  <Field boolean needKeyframe>
		}
	//*  18   38:goto            0
		lastReadTimeUs = 0x0L;
	//   19   41:aload_0         
	//   20   42:ldc2w           #39  <Long 0x0L>
	//   21   45:putfield        #42  <Field long lastReadTimeUs>
	//   22   48:return          
	}

	public void discardUpstreamSamples(int i)
	{
		rollingBuffer.discardUpstreamSamples(i);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field RollingSampleBuffer rollingBuffer>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #72  <Method void RollingSampleBuffer.discardUpstreamSamples(int)>
		long l;
		if(rollingBuffer.peekSample(sampleInfoHolder))
	//*   4    8:aload_0         
	//*   5    9:getfield        #29  <Field RollingSampleBuffer rollingBuffer>
	//*   6   12:aload_0         
	//*   7   13:getfield        #36  <Field SampleHolder sampleInfoHolder>
	//*   8   16:invokevirtual   #53  <Method boolean RollingSampleBuffer.peekSample(SampleHolder)>
	//*   9   19:ifeq            33
			l = sampleInfoHolder.timeUs;
	//   10   22:aload_0         
	//   11   23:getfield        #36  <Field SampleHolder sampleInfoHolder>
	//   12   26:getfield        #62  <Field long SampleHolder.timeUs>
	//   13   29:lstore_2        
		else
	//*  14   30:goto            37
			l = 0x0L;
	//   15   33:ldc2w           #39  <Long 0x0L>
	//   16   36:lstore_2        
		largestParsedTimestampUs = l;
	//   17   37:aload_0         
	//   18   38:lload_2         
	//   19   39:putfield        #46  <Field long largestParsedTimestampUs>
	//   20   42:return          
	}

	public void format(MediaFormat mediaformat)
	{
		format = mediaformat;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #75  <Field MediaFormat format>
	//    3    5:return          
	}

	public MediaFormat getFormat()
	{
		return format;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field MediaFormat format>
	//    2    4:areturn         
	}

	public long getLargestParsedTimestampUs()
	{
		return largestParsedTimestampUs;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field long largestParsedTimestampUs>
	//    2    4:lreturn         
	}

	public int getReadIndex()
	{
		return rollingBuffer.getReadIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field RollingSampleBuffer rollingBuffer>
	//    2    4:invokevirtual   #83  <Method int RollingSampleBuffer.getReadIndex()>
	//    3    7:ireturn         
	}

	public boolean getSample(SampleHolder sampleholder)
	{
		if(!advanceToEligibleSample())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #86  <Method boolean advanceToEligibleSample()>
	//*   2    4:ifne            9
		{
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		} else
		{
			rollingBuffer.readSample(sampleholder);
	//    5    9:aload_0         
	//    6   10:getfield        #29  <Field RollingSampleBuffer rollingBuffer>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #89  <Method boolean RollingSampleBuffer.readSample(SampleHolder)>
	//    9   17:pop             
			needKeyframe = false;
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:putfield        #38  <Field boolean needKeyframe>
			lastReadTimeUs = sampleholder.timeUs;
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:getfield        #62  <Field long SampleHolder.timeUs>
	//   16   28:putfield        #42  <Field long lastReadTimeUs>
			return true;
	//   17   31:iconst_1        
	//   18   32:ireturn         
		}
	}

	public int getWriteIndex()
	{
		return rollingBuffer.getWriteIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field RollingSampleBuffer rollingBuffer>
	//    2    4:invokevirtual   #92  <Method int RollingSampleBuffer.getWriteIndex()>
	//    3    7:ireturn         
	}

	public boolean hasFormat()
	{
		return format != null;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field MediaFormat format>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean isEmpty()
	{
		return advanceToEligibleSample() ^ true;
	//    0    0:aload_0         
	//    1    1:invokespecial   #86  <Method boolean advanceToEligibleSample()>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:ireturn         
	}

	public int sampleData(ExtractorInput extractorinput, int i, boolean flag)
		throws IOException, InterruptedException
	{
		return rollingBuffer.appendData(extractorinput, i, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field RollingSampleBuffer rollingBuffer>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #103 <Method int RollingSampleBuffer.appendData(ExtractorInput, int, boolean)>
	//    6   10:ireturn         
	}

	public int sampleData(DataSource datasource, int i, boolean flag)
		throws IOException
	{
		return rollingBuffer.appendData(datasource, i, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field RollingSampleBuffer rollingBuffer>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #107 <Method int RollingSampleBuffer.appendData(DataSource, int, boolean)>
	//    6   10:ireturn         
	}

	public void sampleData(ParsableByteArray parsablebytearray, int i)
	{
		rollingBuffer.appendData(parsablebytearray, i);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field RollingSampleBuffer rollingBuffer>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #110 <Method void RollingSampleBuffer.appendData(ParsableByteArray, int)>
	//    5    9:return          
	}

	public void sampleMetadata(long l, int i, int j, int k, byte abyte0[])
	{
		largestParsedTimestampUs = Math.max(largestParsedTimestampUs, l);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #46  <Field long largestParsedTimestampUs>
	//    3    5:lload_1         
	//    4    6:invokestatic    #118 <Method long Math.max(long, long)>
	//    5    9:putfield        #46  <Field long largestParsedTimestampUs>
		RollingSampleBuffer rollingsamplebuffer = rollingBuffer;
	//    6   12:aload_0         
	//    7   13:getfield        #29  <Field RollingSampleBuffer rollingBuffer>
	//    8   16:astore          7
		rollingsamplebuffer.commitSample(l, i, rollingsamplebuffer.getWritePosition() - (long)j - (long)k, j, abyte0);
	//    9   18:aload           7
	//   10   20:lload_1         
	//   11   21:iload_3         
	//   12   22:aload           7
	//   13   24:invokevirtual   #121 <Method long RollingSampleBuffer.getWritePosition()>
	//   14   27:iload           4
	//   15   29:i2l             
	//   16   30:lsub            
	//   17   31:iload           5
	//   18   33:i2l             
	//   19   34:lsub            
	//   20   35:iload           4
	//   21   37:aload           6
	//   22   39:invokevirtual   #125 <Method void RollingSampleBuffer.commitSample(long, int, long, int, byte[])>
	//   23   42:return          
	}

	public boolean skipToKeyframeBefore(long l)
	{
		return rollingBuffer.skipToKeyframeBefore(l);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field RollingSampleBuffer rollingBuffer>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #129 <Method boolean RollingSampleBuffer.skipToKeyframeBefore(long)>
	//    4    8:ireturn         
	}

	private volatile MediaFormat format;
	private volatile long largestParsedTimestampUs;
	private long lastReadTimeUs;
	private boolean needKeyframe;
	private final RollingSampleBuffer rollingBuffer;
	private final SampleHolder sampleInfoHolder = new SampleHolder(0);
	private long spliceOutTimeUs;
}
