// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.util.*;

// Referenced classes of package com.google.android.exoplayer2.extractor.ts:
//			SectionPayloadReader, TsExtractor, SectionReader

private class TsExtractor$PatReader
	implements SectionPayloadReader
{

	public void consume(ParsableByteArray parsablebytearray)
	{
		if(parsablebytearray.readUnsignedByte() != 0)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #36  <Method int ParsableByteArray.readUnsignedByte()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		parsablebytearray.skipBytes(7);
	//    4    8:aload_1         
	//    5    9:bipush          7
	//    6   11:invokevirtual   #40  <Method void ParsableByteArray.skipBytes(int)>
		int j = parsablebytearray.bytesLeft() / 4;
	//    7   14:aload_1         
	//    8   15:invokevirtual   #43  <Method int ParsableByteArray.bytesLeft()>
	//    9   18:iconst_4        
	//   10   19:idiv            
	//   11   20:istore_3        
		for(int i = 0; i < j; i++)
	//*  12   21:iconst_0        
	//*  13   22:istore_2        
	//*  14   23:iload_2         
	//*  15   24:iload_3         
	//*  16   25:icmpge          131
		{
			parsablebytearray.readBytes(patScratch, 4);
	//   17   28:aload_1         
	//   18   29:aload_0         
	//   19   30:getfield        #27  <Field ParsableBitArray patScratch>
	//   20   33:iconst_4        
	//   21   34:invokevirtual   #47  <Method void ParsableByteArray.readBytes(ParsableBitArray, int)>
			int k = patScratch.readBits(16);
	//   22   37:aload_0         
	//   23   38:getfield        #27  <Field ParsableBitArray patScratch>
	//   24   41:bipush          16
	//   25   43:invokevirtual   #51  <Method int ParsableBitArray.readBits(int)>
	//   26   46:istore          4
			patScratch.skipBits(3);
	//   27   48:aload_0         
	//   28   49:getfield        #27  <Field ParsableBitArray patScratch>
	//   29   52:iconst_3        
	//   30   53:invokevirtual   #54  <Method void ParsableBitArray.skipBits(int)>
			if(k == 0)
	//*  31   56:iload           4
	//*  32   58:ifne            73
			{
				patScratch.skipBits(13);
	//   33   61:aload_0         
	//   34   62:getfield        #27  <Field ParsableBitArray patScratch>
	//   35   65:bipush          13
	//   36   67:invokevirtual   #54  <Method void ParsableBitArray.skipBits(int)>
			} else
	//*  37   70:goto            124
			{
				int l = patScratch.readBits(13);
	//   38   73:aload_0         
	//   39   74:getfield        #27  <Field ParsableBitArray patScratch>
	//   40   77:bipush          13
	//   41   79:invokevirtual   #51  <Method int ParsableBitArray.readBits(int)>
	//   42   82:istore          4
				TsExtractor.access$000(TsExtractor.this).put(l, ((Object) (new SectionReader(((SectionPayloadReader) (new TsExtractor$PmtReader(TsExtractor.this, l)))))));
	//   43   84:aload_0         
	//   44   85:getfield        #17  <Field TsExtractor this$0>
	//   45   88:invokestatic    #58  <Method SparseArray TsExtractor.access$000(TsExtractor)>
	//   46   91:iload           4
	//   47   93:new             #60  <Class SectionReader>
	//   48   96:dup             
	//   49   97:new             #62  <Class TsExtractor$PmtReader>
	//   50  100:dup             
	//   51  101:aload_0         
	//   52  102:getfield        #17  <Field TsExtractor this$0>
	//   53  105:iload           4
	//   54  107:invokespecial   #65  <Method void TsExtractor$PmtReader(TsExtractor, int)>
	//   55  110:invokespecial   #68  <Method void SectionReader(SectionPayloadReader)>
	//   56  113:invokevirtual   #74  <Method void SparseArray.put(int, Object)>
				int _tmp = TsExtractor.access$108(TsExtractor.this);
	//   57  116:aload_0         
	//   58  117:getfield        #17  <Field TsExtractor this$0>
	//   59  120:invokestatic    #78  <Method int TsExtractor.access$108(TsExtractor)>
	//   60  123:pop             
			}
		}

	//   61  124:iload_2         
	//   62  125:iconst_1        
	//   63  126:iadd            
	//   64  127:istore_2        
	//*  65  128:goto            23
		if(TsExtractor.access$200(TsExtractor.this) != 2)
	//*  66  131:aload_0         
	//*  67  132:getfield        #17  <Field TsExtractor this$0>
	//*  68  135:invokestatic    #81  <Method int TsExtractor.access$200(TsExtractor)>
	//*  69  138:iconst_2        
	//*  70  139:icmpeq          153
			TsExtractor.access$000(TsExtractor.this).remove(0);
	//   71  142:aload_0         
	//   72  143:getfield        #17  <Field TsExtractor this$0>
	//   73  146:invokestatic    #58  <Method SparseArray TsExtractor.access$000(TsExtractor)>
	//   74  149:iconst_0        
	//   75  150:invokevirtual   #84  <Method void SparseArray.remove(int)>
	//   76  153:return          
	}

	public void init(TimestampAdjuster timestampadjuster, ExtractorOutput extractoroutput, dGenerator dgenerator)
	{
	//    0    0:return          
	}

	private final ParsableBitArray patScratch = new ParsableBitArray(new byte[4]);
	final TsExtractor this$0;

	public TsExtractor$PatReader()
	{
		this$0 = TsExtractor.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field TsExtractor this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:aload_0         
	//    6   10:new             #22  <Class ParsableBitArray>
	//    7   13:dup             
	//    8   14:iconst_4        
	//    9   15:newarray        byte[]
	//   10   17:invokespecial   #25  <Method void ParsableBitArray(byte[])>
	//   11   20:putfield        #27  <Field ParsableBitArray patScratch>
	//   12   23:return          
	}
}
