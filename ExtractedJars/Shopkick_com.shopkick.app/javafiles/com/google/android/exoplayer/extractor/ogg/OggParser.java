// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.ogg;

import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.extractor.ExtractorInput;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.ParsableByteArray;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.extractor.ogg:
//			OggUtil

final class OggParser
{

	OggParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #22  <Class OggUtil$PageHeader>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void OggUtil$PageHeader()>
	//    6   12:putfield        #25  <Field OggUtil$PageHeader pageHeader>
	//    7   15:aload_0         
	//    8   16:new             #27  <Class ParsableByteArray>
	//    9   19:dup             
	//   10   20:sipush          282
	//   11   23:invokespecial   #30  <Method void ParsableByteArray(int)>
	//   12   26:putfield        #32  <Field ParsableByteArray headerArray>
	//   13   29:aload_0         
	//   14   30:new             #34  <Class OggUtil$PacketInfoHolder>
	//   15   33:dup             
	//   16   34:invokespecial   #35  <Method void OggUtil$PacketInfoHolder()>
	//   17   37:putfield        #37  <Field OggUtil$PacketInfoHolder holder>
		currentSegmentIndex = -1;
	//   18   40:aload_0         
	//   19   41:iconst_m1       
	//   20   42:putfield        #39  <Field int currentSegmentIndex>
	//   21   45:return          
	}

	public OggUtil.PageHeader getPageHeader()
	{
		return pageHeader;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field OggUtil$PageHeader pageHeader>
	//    2    4:areturn         
	}

	public long readGranuleOfLastPage(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		boolean flag;
		if(extractorinput.getLength() != -1L)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #54  <Method long ExtractorInput.getLength()>
	//*   2    6:ldc2w           #55  <Long -1L>
	//*   3    9:lcmp            
	//*   4   10:ifeq            18
			flag = true;
	//    5   13:iconst_1        
	//    6   14:istore_2        
		else
	//*   7   15:goto            20
			flag = false;
	//    8   18:iconst_0        
	//    9   19:istore_2        
		Assertions.checkArgument(flag);
	//   10   20:iload_2         
	//   11   21:invokestatic    #62  <Method void Assertions.checkArgument(boolean)>
		OggUtil.skipToNextPage(extractorinput);
	//   12   24:aload_1         
	//   13   25:invokestatic    #68  <Method void OggUtil.skipToNextPage(ExtractorInput)>
		pageHeader.reset();
	//   14   28:aload_0         
	//   15   29:getfield        #25  <Field OggUtil$PageHeader pageHeader>
	//   16   32:invokevirtual   #71  <Method void OggUtil$PageHeader.reset()>
		for(; (pageHeader.type & 4) != 4 && extractorinput.getPosition() < extractorinput.getLength(); extractorinput.skipFully(pageHeader.headerSize + pageHeader.bodySize))
	//*  17   35:aload_0         
	//*  18   36:getfield        #25  <Field OggUtil$PageHeader pageHeader>
	//*  19   39:getfield        #74  <Field int OggUtil$PageHeader.type>
	//*  20   42:iconst_4        
	//*  21   43:iand            
	//*  22   44:iconst_4        
	//*  23   45:icmpeq          102
	//*  24   48:aload_1         
	//*  25   49:invokeinterface #77  <Method long ExtractorInput.getPosition()>
	//*  26   54:aload_1         
	//*  27   55:invokeinterface #54  <Method long ExtractorInput.getLength()>
	//*  28   60:lcmp            
	//*  29   61:ifge            102
			OggUtil.populatePageHeader(extractorinput, pageHeader, headerArray, false);
	//   30   64:aload_1         
	//   31   65:aload_0         
	//   32   66:getfield        #25  <Field OggUtil$PageHeader pageHeader>
	//   33   69:aload_0         
	//   34   70:getfield        #32  <Field ParsableByteArray headerArray>
	//   35   73:iconst_0        
	//   36   74:invokestatic    #81  <Method boolean OggUtil.populatePageHeader(ExtractorInput, OggUtil$PageHeader, ParsableByteArray, boolean)>
	//   37   77:pop             

	//   38   78:aload_1         
	//   39   79:aload_0         
	//   40   80:getfield        #25  <Field OggUtil$PageHeader pageHeader>
	//   41   83:getfield        #84  <Field int OggUtil$PageHeader.headerSize>
	//   42   86:aload_0         
	//   43   87:getfield        #25  <Field OggUtil$PageHeader pageHeader>
	//   44   90:getfield        #87  <Field int OggUtil$PageHeader.bodySize>
	//   45   93:iadd            
	//   46   94:invokeinterface #90  <Method void ExtractorInput.skipFully(int)>
	//*  47   99:goto            35
		return pageHeader.granulePosition;
	//   48  102:aload_0         
	//   49  103:getfield        #25  <Field OggUtil$PageHeader pageHeader>
	//   50  106:getfield        #93  <Field long OggUtil$PageHeader.granulePosition>
	//   51  109:lreturn         
	}

	public boolean readPacket(ExtractorInput extractorinput, ParsableByteArray parsablebytearray)
		throws IOException, InterruptedException
	{
		boolean flag1;
		if(extractorinput != null && parsablebytearray != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          14
	//*   2    4:aload_2         
	//*   3    5:ifnull          14
			flag1 = true;
	//    4    8:iconst_1        
	//    5    9:istore          6
		else
	//*   6   11:goto            17
			flag1 = false;
	//    7   14:iconst_0        
	//    8   15:istore          6
		Assertions.checkState(flag1);
	//    9   17:iload           6
	//   10   19:invokestatic    #99  <Method void Assertions.checkState(boolean)>
		boolean flag = false;
	//   11   22:iconst_0        
	//   12   23:istore_3        
		while(!flag) 
	//*  13   24:iload_3         
	//*  14   25:ifne            266
		{
			if(currentSegmentIndex < 0)
	//*  15   28:aload_0         
	//*  16   29:getfield        #39  <Field int currentSegmentIndex>
	//*  17   32:ifge            137
			{
				if(!OggUtil.populatePageHeader(extractorinput, pageHeader, headerArray, true))
	//*  18   35:aload_1         
	//*  19   36:aload_0         
	//*  20   37:getfield        #25  <Field OggUtil$PageHeader pageHeader>
	//*  21   40:aload_0         
	//*  22   41:getfield        #32  <Field ParsableByteArray headerArray>
	//*  23   44:iconst_1        
	//*  24   45:invokestatic    #81  <Method boolean OggUtil.populatePageHeader(ExtractorInput, OggUtil$PageHeader, ParsableByteArray, boolean)>
	//*  25   48:ifne            53
					return false;
	//   26   51:iconst_0        
	//   27   52:ireturn         
				int i = pageHeader.headerSize;
	//   28   53:aload_0         
	//   29   54:getfield        #25  <Field OggUtil$PageHeader pageHeader>
	//   30   57:getfield        #84  <Field int OggUtil$PageHeader.headerSize>
	//   31   60:istore          4
				int k;
				if((pageHeader.type & 1) == 1 && parsablebytearray.limit() == 0)
	//*  32   62:aload_0         
	//*  33   63:getfield        #25  <Field OggUtil$PageHeader pageHeader>
	//*  34   66:getfield        #74  <Field int OggUtil$PageHeader.type>
	//*  35   69:iconst_1        
	//*  36   70:iand            
	//*  37   71:iconst_1        
	//*  38   72:icmpne          120
	//*  39   75:aload_2         
	//*  40   76:invokevirtual   #103 <Method int ParsableByteArray.limit()>
	//*  41   79:ifne            120
				{
					OggUtil.calculatePacketSize(pageHeader, 0, holder);
	//   42   82:aload_0         
	//   43   83:getfield        #25  <Field OggUtil$PageHeader pageHeader>
	//   44   86:iconst_0        
	//   45   87:aload_0         
	//   46   88:getfield        #37  <Field OggUtil$PacketInfoHolder holder>
	//   47   91:invokestatic    #107 <Method void OggUtil.calculatePacketSize(OggUtil$PageHeader, int, OggUtil$PacketInfoHolder)>
					k = holder.segmentCount + 0;
	//   48   94:aload_0         
	//   49   95:getfield        #37  <Field OggUtil$PacketInfoHolder holder>
	//   50   98:getfield        #110 <Field int OggUtil$PacketInfoHolder.segmentCount>
	//   51  101:iconst_0        
	//   52  102:iadd            
	//   53  103:istore          5
					i += holder.size;
	//   54  105:iload           4
	//   55  107:aload_0         
	//   56  108:getfield        #37  <Field OggUtil$PacketInfoHolder holder>
	//   57  111:getfield        #113 <Field int OggUtil$PacketInfoHolder.size>
	//   58  114:iadd            
	//   59  115:istore          4
				} else
	//*  60  117:goto            123
				{
					k = 0;
	//   61  120:iconst_0        
	//   62  121:istore          5
				}
				extractorinput.skipFully(i);
	//   63  123:aload_1         
	//   64  124:iload           4
	//   65  126:invokeinterface #90  <Method void ExtractorInput.skipFully(int)>
				currentSegmentIndex = k;
	//   66  131:aload_0         
	//   67  132:iload           5
	//   68  134:putfield        #39  <Field int currentSegmentIndex>
			}
			OggUtil.calculatePacketSize(pageHeader, currentSegmentIndex, holder);
	//   69  137:aload_0         
	//   70  138:getfield        #25  <Field OggUtil$PageHeader pageHeader>
	//   71  141:aload_0         
	//   72  142:getfield        #39  <Field int currentSegmentIndex>
	//   73  145:aload_0         
	//   74  146:getfield        #37  <Field OggUtil$PacketInfoHolder holder>
	//   75  149:invokestatic    #107 <Method void OggUtil.calculatePacketSize(OggUtil$PageHeader, int, OggUtil$PacketInfoHolder)>
			int l = currentSegmentIndex + holder.segmentCount;
	//   76  152:aload_0         
	//   77  153:getfield        #39  <Field int currentSegmentIndex>
	//   78  156:aload_0         
	//   79  157:getfield        #37  <Field OggUtil$PacketInfoHolder holder>
	//   80  160:getfield        #110 <Field int OggUtil$PacketInfoHolder.segmentCount>
	//   81  163:iadd            
	//   82  164:istore          5
			if(holder.size > 0)
	//*  83  166:aload_0         
	//*  84  167:getfield        #37  <Field OggUtil$PacketInfoHolder holder>
	//*  85  170:getfield        #113 <Field int OggUtil$PacketInfoHolder.size>
	//*  86  173:ifle            238
			{
				extractorinput.readFully(parsablebytearray.data, parsablebytearray.limit(), holder.size);
	//   87  176:aload_1         
	//   88  177:aload_2         
	//   89  178:getfield        #117 <Field byte[] ParsableByteArray.data>
	//   90  181:aload_2         
	//   91  182:invokevirtual   #103 <Method int ParsableByteArray.limit()>
	//   92  185:aload_0         
	//   93  186:getfield        #37  <Field OggUtil$PacketInfoHolder holder>
	//   94  189:getfield        #113 <Field int OggUtil$PacketInfoHolder.size>
	//   95  192:invokeinterface #121 <Method void ExtractorInput.readFully(byte[], int, int)>
				parsablebytearray.setLimit(parsablebytearray.limit() + holder.size);
	//   96  197:aload_2         
	//   97  198:aload_2         
	//   98  199:invokevirtual   #103 <Method int ParsableByteArray.limit()>
	//   99  202:aload_0         
	//  100  203:getfield        #37  <Field OggUtil$PacketInfoHolder holder>
	//  101  206:getfield        #113 <Field int OggUtil$PacketInfoHolder.size>
	//  102  209:iadd            
	//  103  210:invokevirtual   #124 <Method void ParsableByteArray.setLimit(int)>
				if(pageHeader.laces[l - 1] != 255)
	//* 104  213:aload_0         
	//* 105  214:getfield        #25  <Field OggUtil$PageHeader pageHeader>
	//* 106  217:getfield        #128 <Field int[] OggUtil$PageHeader.laces>
	//* 107  220:iload           5
	//* 108  222:iconst_1        
	//* 109  223:isub            
	//* 110  224:iaload          
	//* 111  225:sipush          255
	//* 112  228:icmpeq          236
					flag = true;
	//  113  231:iconst_1        
	//  114  232:istore_3        
				else
	//* 115  233:goto            238
					flag = false;
	//  116  236:iconst_0        
	//  117  237:istore_3        
			}
			int j = l;
	//  118  238:iload           5
	//  119  240:istore          4
			if(l == pageHeader.pageSegmentCount)
	//* 120  242:iload           5
	//* 121  244:aload_0         
	//* 122  245:getfield        #25  <Field OggUtil$PageHeader pageHeader>
	//* 123  248:getfield        #131 <Field int OggUtil$PageHeader.pageSegmentCount>
	//* 124  251:icmpne          257
				j = -1;
	//  125  254:iconst_m1       
	//  126  255:istore          4
			currentSegmentIndex = j;
	//  127  257:aload_0         
	//  128  258:iload           4
	//  129  260:putfield        #39  <Field int currentSegmentIndex>
		}
	//* 130  263:goto            24
		return true;
	//  131  266:iconst_1        
	//  132  267:ireturn         
	}

	public void reset()
	{
		pageHeader.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field OggUtil$PageHeader pageHeader>
	//    2    4:invokevirtual   #71  <Method void OggUtil$PageHeader.reset()>
		headerArray.reset();
	//    3    7:aload_0         
	//    4    8:getfield        #32  <Field ParsableByteArray headerArray>
	//    5   11:invokevirtual   #132 <Method void ParsableByteArray.reset()>
		currentSegmentIndex = -1;
	//    6   14:aload_0         
	//    7   15:iconst_m1       
	//    8   16:putfield        #39  <Field int currentSegmentIndex>
	//    9   19:return          
	}

	public long skipToPageOfGranule(ExtractorInput extractorinput, long l)
		throws IOException, InterruptedException
	{
		OggUtil.skipToNextPage(extractorinput);
	//    0    0:aload_1         
	//    1    1:invokestatic    #68  <Method void OggUtil.skipToNextPage(ExtractorInput)>
		OggUtil.populatePageHeader(extractorinput, pageHeader, headerArray, false);
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #25  <Field OggUtil$PageHeader pageHeader>
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field ParsableByteArray headerArray>
	//    7   13:iconst_0        
	//    8   14:invokestatic    #81  <Method boolean OggUtil.populatePageHeader(ExtractorInput, OggUtil$PageHeader, ParsableByteArray, boolean)>
	//    9   17:pop             
		while(pageHeader.granulePosition < l) 
	//*  10   18:aload_0         
	//*  11   19:getfield        #25  <Field OggUtil$PageHeader pageHeader>
	//*  12   22:getfield        #93  <Field long OggUtil$PageHeader.granulePosition>
	//*  13   25:lload_2         
	//*  14   26:lcmp            
	//*  15   27:ifge            79
		{
			extractorinput.skipFully(pageHeader.headerSize + pageHeader.bodySize);
	//   16   30:aload_1         
	//   17   31:aload_0         
	//   18   32:getfield        #25  <Field OggUtil$PageHeader pageHeader>
	//   19   35:getfield        #84  <Field int OggUtil$PageHeader.headerSize>
	//   20   38:aload_0         
	//   21   39:getfield        #25  <Field OggUtil$PageHeader pageHeader>
	//   22   42:getfield        #87  <Field int OggUtil$PageHeader.bodySize>
	//   23   45:iadd            
	//   24   46:invokeinterface #90  <Method void ExtractorInput.skipFully(int)>
			elapsedSamples = pageHeader.granulePosition;
	//   25   51:aload_0         
	//   26   52:aload_0         
	//   27   53:getfield        #25  <Field OggUtil$PageHeader pageHeader>
	//   28   56:getfield        #93  <Field long OggUtil$PageHeader.granulePosition>
	//   29   59:putfield        #136 <Field long elapsedSamples>
			OggUtil.populatePageHeader(extractorinput, pageHeader, headerArray, false);
	//   30   62:aload_1         
	//   31   63:aload_0         
	//   32   64:getfield        #25  <Field OggUtil$PageHeader pageHeader>
	//   33   67:aload_0         
	//   34   68:getfield        #32  <Field ParsableByteArray headerArray>
	//   35   71:iconst_0        
	//   36   72:invokestatic    #81  <Method boolean OggUtil.populatePageHeader(ExtractorInput, OggUtil$PageHeader, ParsableByteArray, boolean)>
	//   37   75:pop             
		}
	//*  38   76:goto            18
		if(elapsedSamples != 0L)
	//*  39   79:aload_0         
	//*  40   80:getfield        #136 <Field long elapsedSamples>
	//*  41   83:lconst_0        
	//*  42   84:lcmp            
	//*  43   85:ifeq            111
		{
			extractorinput.resetPeekPosition();
	//   44   88:aload_1         
	//   45   89:invokeinterface #139 <Method void ExtractorInput.resetPeekPosition()>
			l = elapsedSamples;
	//   46   94:aload_0         
	//   47   95:getfield        #136 <Field long elapsedSamples>
	//   48   98:lstore_2        
			elapsedSamples = 0L;
	//   49   99:aload_0         
	//   50  100:lconst_0        
	//   51  101:putfield        #136 <Field long elapsedSamples>
			currentSegmentIndex = -1;
	//   52  104:aload_0         
	//   53  105:iconst_m1       
	//   54  106:putfield        #39  <Field int currentSegmentIndex>
			return l;
	//   55  109:lload_2         
	//   56  110:lreturn         
		} else
		{
			throw new ParserException();
	//   57  111:new             #141 <Class ParserException>
	//   58  114:dup             
	//   59  115:invokespecial   #142 <Method void ParserException()>
	//   60  118:athrow          
		}
	}

	public static final int OGG_MAX_SEGMENT_SIZE = 255;
	private int currentSegmentIndex;
	private long elapsedSamples;
	private final ParsableByteArray headerArray = new ParsableByteArray(282);
	private final OggUtil.PacketInfoHolder holder = new OggUtil.PacketInfoHolder();
	private final OggUtil.PageHeader pageHeader = new OggUtil.PageHeader();
}
