// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.extractor.*;
import com.google.android.exoplayer2.util.*;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.extractor.ogg:
//			OggSeeker, FlacReader

private class FlacReader$FlacOggSeeker
	implements OggSeeker, SeekMap
{

	public SeekMap createSeekMap()
	{
		return ((SeekMap) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public long getDurationUs()
	{
		return FlacReader.access$000(FlacReader.this).durationUs();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field FlacReader this$0>
	//    2    4:invokestatic    #46  <Method FlacStreamInfo FlacReader.access$000(FlacReader)>
	//    3    7:invokevirtual   #51  <Method long FlacStreamInfo.durationUs()>
	//    4   10:lreturn         
	}

	public com.google.android.exoplayer2.extractor.SeekMap.SeekPoints getSeekPoints(long l)
	{
		long l1 = convertTimeToGranule(l);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field FlacReader this$0>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #57  <Method long FlacReader.convertTimeToGranule(long)>
	//    4    8:lstore          4
		int i = Util.binarySearchFloor(seekPointGranules, l1, true, true);
	//    5   10:aload_0         
	//    6   11:getfield        #59  <Field long[] seekPointGranules>
	//    7   14:lload           4
	//    8   16:iconst_1        
	//    9   17:iconst_1        
	//   10   18:invokestatic    #65  <Method int Util.binarySearchFloor(long[], long, boolean, boolean)>
	//   11   21:istore_3        
		l1 = convertGranuleToTime(seekPointGranules[i]);
	//   12   22:aload_0         
	//   13   23:getfield        #28  <Field FlacReader this$0>
	//   14   26:aload_0         
	//   15   27:getfield        #59  <Field long[] seekPointGranules>
	//   16   30:iload_3         
	//   17   31:laload          
	//   18   32:invokevirtual   #68  <Method long FlacReader.convertGranuleToTime(long)>
	//   19   35:lstore          4
		SeekPoint seekpoint = new SeekPoint(l1, firstFrameOffset + seekPointOffsets[i]);
	//   20   37:new             #70  <Class SeekPoint>
	//   21   40:dup             
	//   22   41:lload           4
	//   23   43:aload_0         
	//   24   44:getfield        #35  <Field long firstFrameOffset>
	//   25   47:aload_0         
	//   26   48:getfield        #72  <Field long[] seekPointOffsets>
	//   27   51:iload_3         
	//   28   52:laload          
	//   29   53:ladd            
	//   30   54:invokespecial   #75  <Method void SeekPoint(long, long)>
	//   31   57:astore          6
		if(l1 < l && i != seekPointGranules.length - 1)
	//*  32   59:lload           4
	//*  33   61:lload_1         
	//*  34   62:lcmp            
	//*  35   63:ifge            133
	//*  36   66:iload_3         
	//*  37   67:aload_0         
	//*  38   68:getfield        #59  <Field long[] seekPointGranules>
	//*  39   71:arraylength     
	//*  40   72:iconst_1        
	//*  41   73:isub            
	//*  42   74:icmpne          80
	//*  43   77:goto            133
		{
			FlacReader flacreader = FlacReader.this;
	//   44   80:aload_0         
	//   45   81:getfield        #28  <Field FlacReader this$0>
	//   46   84:astore          7
			long al[] = seekPointGranules;
	//   47   86:aload_0         
	//   48   87:getfield        #59  <Field long[] seekPointGranules>
	//   49   90:astore          8
			i++;
	//   50   92:iload_3         
	//   51   93:iconst_1        
	//   52   94:iadd            
	//   53   95:istore_3        
			return new com.google.android.exoplayer2.extractor.SeekMap.SeekPoints(seekpoint, new SeekPoint(flacreader.convertGranuleToTime(al[i]), firstFrameOffset + seekPointOffsets[i]));
	//   54   96:new             #77  <Class com.google.android.exoplayer2.extractor.SeekMap$SeekPoints>
	//   55   99:dup             
	//   56  100:aload           6
	//   57  102:new             #70  <Class SeekPoint>
	//   58  105:dup             
	//   59  106:aload           7
	//   60  108:aload           8
	//   61  110:iload_3         
	//   62  111:laload          
	//   63  112:invokevirtual   #68  <Method long FlacReader.convertGranuleToTime(long)>
	//   64  115:aload_0         
	//   65  116:getfield        #35  <Field long firstFrameOffset>
	//   66  119:aload_0         
	//   67  120:getfield        #72  <Field long[] seekPointOffsets>
	//   68  123:iload_3         
	//   69  124:laload          
	//   70  125:ladd            
	//   71  126:invokespecial   #75  <Method void SeekPoint(long, long)>
	//   72  129:invokespecial   #80  <Method void com.google.android.exoplayer2.extractor.SeekMap$SeekPoints(SeekPoint, SeekPoint)>
	//   73  132:areturn         
		} else
		{
			return new com.google.android.exoplayer2.extractor.SeekMap.SeekPoints(seekpoint);
	//   74  133:new             #77  <Class com.google.android.exoplayer2.extractor.SeekMap$SeekPoints>
	//   75  136:dup             
	//   76  137:aload           6
	//   77  139:invokespecial   #83  <Method void com.google.android.exoplayer2.extractor.SeekMap$SeekPoints(SeekPoint)>
	//   78  142:areturn         
		}
	}

	public boolean isSeekable()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void parseSeekTable(ParsableByteArray parsablebytearray)
	{
		parsablebytearray.skipBytes(1);
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #93  <Method void ParsableByteArray.skipBytes(int)>
		int j = parsablebytearray.readUnsignedInt24() / 18;
	//    3    5:aload_1         
	//    4    6:invokevirtual   #97  <Method int ParsableByteArray.readUnsignedInt24()>
	//    5    9:bipush          18
	//    6   11:idiv            
	//    7   12:istore_3        
		seekPointGranules = new long[j];
	//    8   13:aload_0         
	//    9   14:iload_3         
	//   10   15:newarray        long[]
	//   11   17:putfield        #59  <Field long[] seekPointGranules>
		seekPointOffsets = new long[j];
	//   12   20:aload_0         
	//   13   21:iload_3         
	//   14   22:newarray        long[]
	//   15   24:putfield        #72  <Field long[] seekPointOffsets>
		for(int i = 0; i < j; i++)
	//*  16   27:iconst_0        
	//*  17   28:istore_2        
	//*  18   29:iload_2         
	//*  19   30:iload_3         
	//*  20   31:icmpge          66
		{
			seekPointGranules[i] = parsablebytearray.readLong();
	//   21   34:aload_0         
	//   22   35:getfield        #59  <Field long[] seekPointGranules>
	//   23   38:iload_2         
	//   24   39:aload_1         
	//   25   40:invokevirtual   #100 <Method long ParsableByteArray.readLong()>
	//   26   43:lastore         
			seekPointOffsets[i] = parsablebytearray.readLong();
	//   27   44:aload_0         
	//   28   45:getfield        #72  <Field long[] seekPointOffsets>
	//   29   48:iload_2         
	//   30   49:aload_1         
	//   31   50:invokevirtual   #100 <Method long ParsableByteArray.readLong()>
	//   32   53:lastore         
			parsablebytearray.skipBytes(2);
	//   33   54:aload_1         
	//   34   55:iconst_2        
	//   35   56:invokevirtual   #93  <Method void ParsableByteArray.skipBytes(int)>
		}

	//   36   59:iload_2         
	//   37   60:iconst_1        
	//   38   61:iadd            
	//   39   62:istore_2        
	//*  40   63:goto            29
	//   41   66:return          
	}

	public long read(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		if(pendingSeekGranule >= 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field long pendingSeekGranule>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:iflt            28
		{
			long l = -(pendingSeekGranule + 2L);
	//    5    9:aload_0         
	//    6   10:getfield        #37  <Field long pendingSeekGranule>
	//    7   13:ldc2w           #107 <Long 2L>
	//    8   16:ladd            
	//    9   17:lneg            
	//   10   18:lstore_2        
			pendingSeekGranule = -1L;
	//   11   19:aload_0         
	//   12   20:ldc2w           #32  <Long -1L>
	//   13   23:putfield        #37  <Field long pendingSeekGranule>
			return l;
	//   14   26:lload_2         
	//   15   27:lreturn         
		} else
		{
			return -1L;
	//   16   28:ldc2w           #32  <Long -1L>
	//   17   31:lreturn         
		}
	}

	public void setFirstFrameOffset(long l)
	{
		firstFrameOffset = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #35  <Field long firstFrameOffset>
	//    3    5:return          
	}

	public long startSeek(long l)
	{
		l = convertTimeToGranule(l);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field FlacReader this$0>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #57  <Method long FlacReader.convertTimeToGranule(long)>
	//    4    8:lstore_1        
		int i = Util.binarySearchFloor(seekPointGranules, l, true, true);
	//    5    9:aload_0         
	//    6   10:getfield        #59  <Field long[] seekPointGranules>
	//    7   13:lload_1         
	//    8   14:iconst_1        
	//    9   15:iconst_1        
	//   10   16:invokestatic    #65  <Method int Util.binarySearchFloor(long[], long, boolean, boolean)>
	//   11   19:istore_3        
		pendingSeekGranule = seekPointGranules[i];
	//   12   20:aload_0         
	//   13   21:aload_0         
	//   14   22:getfield        #59  <Field long[] seekPointGranules>
	//   15   25:iload_3         
	//   16   26:laload          
	//   17   27:putfield        #37  <Field long pendingSeekGranule>
		return l;
	//   18   30:lload_1         
	//   19   31:lreturn         
	}

	private static final int METADATA_LENGTH_OFFSET = 1;
	private static final int SEEK_POINT_SIZE = 18;
	private long firstFrameOffset;
	private long pendingSeekGranule;
	private long seekPointGranules[];
	private long seekPointOffsets[];
	final FlacReader this$0;

	public FlacReader$FlacOggSeeker()
	{
		this$0 = FlacReader.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field FlacReader this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #31  <Method void Object()>
		firstFrameOffset = -1L;
	//    5    9:aload_0         
	//    6   10:ldc2w           #32  <Long -1L>
	//    7   13:putfield        #35  <Field long firstFrameOffset>
		pendingSeekGranule = -1L;
	//    8   16:aload_0         
	//    9   17:ldc2w           #32  <Long -1L>
	//   10   20:putfield        #37  <Field long pendingSeekGranule>
	//   11   23:return          
	}
}
