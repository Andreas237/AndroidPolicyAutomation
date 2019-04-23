// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.ts;

import android.util.SparseArray;
import com.google.android.exoplayer.extractor.ExtractorOutput;
import com.google.android.exoplayer.util.*;

// Referenced classes of package com.google.android.exoplayer.extractor.ts:
//			TsExtractor

private class TsExtractor$PatReader extends eader
{

	public void consume(ParsableByteArray parsablebytearray, boolean flag, ExtractorOutput extractoroutput)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(flag)
	//*   2    3:iload_2         
	//*   3    4:ifeq            79
		{
			parsablebytearray.skipBytes(parsablebytearray.readUnsignedByte());
	//    4    7:aload_1         
	//    5    8:aload_1         
	//    6    9:invokevirtual   #45  <Method int ParsableByteArray.readUnsignedByte()>
	//    7   12:invokevirtual   #49  <Method void ParsableByteArray.skipBytes(int)>
			parsablebytearray.readBytes(patScratch, 3);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #38  <Field ParsableBitArray patScratch>
	//   11   20:iconst_3        
	//   12   21:invokevirtual   #53  <Method void ParsableByteArray.readBytes(ParsableBitArray, int)>
			patScratch.skipBits(12);
	//   13   24:aload_0         
	//   14   25:getfield        #38  <Field ParsableBitArray patScratch>
	//   15   28:bipush          12
	//   16   30:invokevirtual   #56  <Method void ParsableBitArray.skipBits(int)>
			sectionLength = patScratch.readBits(12);
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:getfield        #38  <Field ParsableBitArray patScratch>
	//   20   38:bipush          12
	//   21   40:invokevirtual   #60  <Method int ParsableBitArray.readBits(int)>
	//   22   43:putfield        #62  <Field int sectionLength>
			sectionBytesRead = 0;
	//   23   46:aload_0         
	//   24   47:iconst_0        
	//   25   48:putfield        #64  <Field int sectionBytesRead>
			crc = Util.crc(patScratch.data, 0, 3, -1);
	//   26   51:aload_0         
	//   27   52:aload_0         
	//   28   53:getfield        #38  <Field ParsableBitArray patScratch>
	//   29   56:getfield        #68  <Field byte[] ParsableBitArray.data>
	//   30   59:iconst_0        
	//   31   60:iconst_3        
	//   32   61:iconst_m1       
	//   33   62:invokestatic    #73  <Method int Util.crc(byte[], int, int, int)>
	//   34   65:putfield        #75  <Field int crc>
			sectionData.reset(sectionLength);
	//   35   68:aload_0         
	//   36   69:getfield        #31  <Field ParsableByteArray sectionData>
	//   37   72:aload_0         
	//   38   73:getfield        #62  <Field int sectionLength>
	//   39   76:invokevirtual   #78  <Method void ParsableByteArray.reset(int)>
		}
		int j = Math.min(parsablebytearray.bytesLeft(), sectionLength - sectionBytesRead);
	//   40   79:aload_1         
	//   41   80:invokevirtual   #81  <Method int ParsableByteArray.bytesLeft()>
	//   42   83:aload_0         
	//   43   84:getfield        #62  <Field int sectionLength>
	//   44   87:aload_0         
	//   45   88:getfield        #64  <Field int sectionBytesRead>
	//   46   91:isub            
	//   47   92:invokestatic    #87  <Method int Math.min(int, int)>
	//   48   95:istore          5
		parsablebytearray.readBytes(sectionData.data, sectionBytesRead, j);
	//   49   97:aload_1         
	//   50   98:aload_0         
	//   51   99:getfield        #31  <Field ParsableByteArray sectionData>
	//   52  102:getfield        #88  <Field byte[] ParsableByteArray.data>
	//   53  105:aload_0         
	//   54  106:getfield        #64  <Field int sectionBytesRead>
	//   55  109:iload           5
	//   56  111:invokevirtual   #91  <Method void ParsableByteArray.readBytes(byte[], int, int)>
		sectionBytesRead = sectionBytesRead + j;
	//   57  114:aload_0         
	//   58  115:aload_0         
	//   59  116:getfield        #64  <Field int sectionBytesRead>
	//   60  119:iload           5
	//   61  121:iadd            
	//   62  122:putfield        #64  <Field int sectionBytesRead>
		if(sectionBytesRead < sectionLength)
	//*  63  125:aload_0         
	//*  64  126:getfield        #64  <Field int sectionBytesRead>
	//*  65  129:aload_0         
	//*  66  130:getfield        #62  <Field int sectionLength>
	//*  67  133:icmpge          137
			return;
	//   68  136:return          
		if(Util.crc(sectionData.data, 0, sectionLength, crc) != 0)
	//*  69  137:aload_0         
	//*  70  138:getfield        #31  <Field ParsableByteArray sectionData>
	//*  71  141:getfield        #88  <Field byte[] ParsableByteArray.data>
	//*  72  144:iconst_0        
	//*  73  145:aload_0         
	//*  74  146:getfield        #62  <Field int sectionLength>
	//*  75  149:aload_0         
	//*  76  150:getfield        #75  <Field int crc>
	//*  77  153:invokestatic    #73  <Method int Util.crc(byte[], int, int, int)>
	//*  78  156:ifeq            160
			return;
	//   79  159:return          
		sectionData.skipBytes(5);
	//   80  160:aload_0         
	//   81  161:getfield        #31  <Field ParsableByteArray sectionData>
	//   82  164:iconst_5        
	//   83  165:invokevirtual   #49  <Method void ParsableByteArray.skipBytes(int)>
		for(int k = (sectionLength - 9) / 4; i < k; i++)
	//*  84  168:aload_0         
	//*  85  169:getfield        #62  <Field int sectionLength>
	//*  86  172:bipush          9
	//*  87  174:isub            
	//*  88  175:iconst_4        
	//*  89  176:idiv            
	//*  90  177:istore          5
	//*  91  179:iload           4
	//*  92  181:iload           5
	//*  93  183:icmpge          279
		{
			sectionData.readBytes(patScratch, 4);
	//   94  186:aload_0         
	//   95  187:getfield        #31  <Field ParsableByteArray sectionData>
	//   96  190:aload_0         
	//   97  191:getfield        #38  <Field ParsableBitArray patScratch>
	//   98  194:iconst_4        
	//   99  195:invokevirtual   #53  <Method void ParsableByteArray.readBytes(ParsableBitArray, int)>
			int l = patScratch.readBits(16);
	//  100  198:aload_0         
	//  101  199:getfield        #38  <Field ParsableBitArray patScratch>
	//  102  202:bipush          16
	//  103  204:invokevirtual   #60  <Method int ParsableBitArray.readBits(int)>
	//  104  207:istore          6
			patScratch.skipBits(3);
	//  105  209:aload_0         
	//  106  210:getfield        #38  <Field ParsableBitArray patScratch>
	//  107  213:iconst_3        
	//  108  214:invokevirtual   #56  <Method void ParsableBitArray.skipBits(int)>
			if(l == 0)
	//* 109  217:iload           6
	//* 110  219:ifne            234
			{
				patScratch.skipBits(13);
	//  111  222:aload_0         
	//  112  223:getfield        #38  <Field ParsableBitArray patScratch>
	//  113  226:bipush          13
	//  114  228:invokevirtual   #56  <Method void ParsableBitArray.skipBits(int)>
			} else
	//* 115  231:goto            270
			{
				int i1 = patScratch.readBits(13);
	//  116  234:aload_0         
	//  117  235:getfield        #38  <Field ParsableBitArray patScratch>
	//  118  238:bipush          13
	//  119  240:invokevirtual   #60  <Method int ParsableBitArray.readBits(int)>
	//  120  243:istore          6
				tsPayloadReaders.put(i1, ((Object) (new TsExtractor$PmtReader(TsExtractor.this, i1))));
	//  121  245:aload_0         
	//  122  246:getfield        #21  <Field TsExtractor this$0>
	//  123  249:getfield        #95  <Field SparseArray TsExtractor.tsPayloadReaders>
	//  124  252:iload           6
	//  125  254:new             #97  <Class TsExtractor$PmtReader>
	//  126  257:dup             
	//  127  258:aload_0         
	//  128  259:getfield        #21  <Field TsExtractor this$0>
	//  129  262:iload           6
	//  130  264:invokespecial   #100 <Method void TsExtractor$PmtReader(TsExtractor, int)>
	//  131  267:invokevirtual   #106 <Method void SparseArray.put(int, Object)>
			}
		}

	//  132  270:iload           4
	//  133  272:iconst_1        
	//  134  273:iadd            
	//  135  274:istore          4
	//* 136  276:goto            179
	//  137  279:return          
	}

	public void seek()
	{
	//    0    0:return          
	}

	private int crc;
	private final ParsableBitArray patScratch = new ParsableBitArray(new byte[4]);
	private int sectionBytesRead;
	private final ParsableByteArray sectionData = new ParsableByteArray();
	private int sectionLength;
	final TsExtractor this$0;

	public TsExtractor$PatReader()
	{
		this$0 = TsExtractor.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field TsExtractor this$0>
		super(((TsExtractor._cls1) (null)));
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:invokespecial   #24  <Method void TsExtractor$TsPayloadReader(TsExtractor$1)>
	//    6   10:aload_0         
	//    7   11:new             #26  <Class ParsableByteArray>
	//    8   14:dup             
	//    9   15:invokespecial   #29  <Method void ParsableByteArray()>
	//   10   18:putfield        #31  <Field ParsableByteArray sectionData>
	//   11   21:aload_0         
	//   12   22:new             #33  <Class ParsableBitArray>
	//   13   25:dup             
	//   14   26:iconst_4        
	//   15   27:newarray        byte[]
	//   16   29:invokespecial   #36  <Method void ParsableBitArray(byte[])>
	//   17   32:putfield        #38  <Field ParsableBitArray patScratch>
	//   18   35:return          
	}
}
