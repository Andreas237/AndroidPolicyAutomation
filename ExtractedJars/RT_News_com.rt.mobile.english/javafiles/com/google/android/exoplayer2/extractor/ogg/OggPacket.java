// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer2.extractor.ogg:
//			OggPageHeader

final class OggPacket
{

	OggPacket()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #19  <Class OggPageHeader>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void OggPageHeader()>
	//    6   12:putfield        #22  <Field OggPageHeader pageHeader>
	//    7   15:aload_0         
	//    8   16:new             #24  <Class ParsableByteArray>
	//    9   19:dup             
	//   10   20:ldc1            #25  <Int 65025>
	//   11   22:newarray        byte[]
	//   12   24:iconst_0        
	//   13   25:invokespecial   #28  <Method void ParsableByteArray(byte[], int)>
	//   14   28:putfield        #30  <Field ParsableByteArray packetArray>
		currentSegmentIndex = -1;
	//   15   31:aload_0         
	//   16   32:iconst_m1       
	//   17   33:putfield        #32  <Field int currentSegmentIndex>
	//   18   36:return          
	}

	private int calculatePacketSize(int i)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		segmentCount = 0;
	//    2    2:aload_0         
	//    3    3:iconst_0        
	//    4    4:putfield        #37  <Field int segmentCount>
		int k;
		int l;
		do
		{
			k = j;
	//    5    7:iload_2         
	//    6    8:istore_3        
			if(segmentCount + i >= pageHeader.pageSegmentCount)
				break;
	//    7    9:aload_0         
	//    8   10:getfield        #37  <Field int segmentCount>
	//    9   13:iload_1         
	//   10   14:iadd            
	//   11   15:aload_0         
	//   12   16:getfield        #22  <Field OggPageHeader pageHeader>
	//   13   19:getfield        #40  <Field int OggPageHeader.pageSegmentCount>
	//   14   22:icmpge          69
			int ai[] = pageHeader.laces;
	//   15   25:aload_0         
	//   16   26:getfield        #22  <Field OggPageHeader pageHeader>
	//   17   29:getfield        #44  <Field int[] OggPageHeader.laces>
	//   18   32:astore          5
			k = segmentCount;
	//   19   34:aload_0         
	//   20   35:getfield        #37  <Field int segmentCount>
	//   21   38:istore_3        
			segmentCount = k + 1;
	//   22   39:aload_0         
	//   23   40:iload_3         
	//   24   41:iconst_1        
	//   25   42:iadd            
	//   26   43:putfield        #37  <Field int segmentCount>
			l = ai[k + i];
	//   27   46:aload           5
	//   28   48:iload_3         
	//   29   49:iload_1         
	//   30   50:iadd            
	//   31   51:iaload          
	//   32   52:istore          4
			k = j + l;
	//   33   54:iload_2         
	//   34   55:iload           4
	//   35   57:iadd            
	//   36   58:istore_3        
			j = k;
	//   37   59:iload_3         
	//   38   60:istore_2        
		} while(l == 255);
	//   39   61:iload           4
	//   40   63:sipush          255
	//   41   66:icmpeq          7
		return k;
	//   42   69:iload_3         
	//   43   70:ireturn         
	}

	public OggPageHeader getPageHeader()
	{
		return pageHeader;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field OggPageHeader pageHeader>
	//    2    4:areturn         
	}

	public ParsableByteArray getPayload()
	{
		return packetArray;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field ParsableByteArray packetArray>
	//    2    4:areturn         
	}

	public boolean populate(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		boolean flag;
		if(extractorinput != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
			flag = true;
	//    2    4:iconst_1        
	//    3    5:istore          4
		else
	//*   4    7:goto            13
			flag = false;
	//    5   10:iconst_0        
	//    6   11:istore          4
		Assertions.checkState(flag);
	//    7   13:iload           4
	//    8   15:invokestatic    #60  <Method void Assertions.checkState(boolean)>
		if(populated)
	//*   9   18:aload_0         
	//*  10   19:getfield        #62  <Field boolean populated>
	//*  11   22:ifeq            37
		{
			populated = false;
	//   12   25:aload_0         
	//   13   26:iconst_0        
	//   14   27:putfield        #62  <Field boolean populated>
			packetArray.reset();
	//   15   30:aload_0         
	//   16   31:getfield        #30  <Field ParsableByteArray packetArray>
	//   17   34:invokevirtual   #65  <Method void ParsableByteArray.reset()>
		}
		while(!populated) 
	//*  18   37:aload_0         
	//*  19   38:getfield        #62  <Field boolean populated>
	//*  20   41:ifne            288
		{
			if(currentSegmentIndex < 0)
	//*  21   44:aload_0         
	//*  22   45:getfield        #32  <Field int currentSegmentIndex>
	//*  23   48:ifge            128
			{
				if(!pageHeader.populate(extractorinput, true))
	//*  24   51:aload_0         
	//*  25   52:getfield        #22  <Field OggPageHeader pageHeader>
	//*  26   55:aload_1         
	//*  27   56:iconst_1        
	//*  28   57:invokevirtual   #68  <Method boolean OggPageHeader.populate(ExtractorInput, boolean)>
	//*  29   60:ifne            65
					return false;
	//   30   63:iconst_0        
	//   31   64:ireturn         
				int i = pageHeader.headerSize;
	//   32   65:aload_0         
	//   33   66:getfield        #22  <Field OggPageHeader pageHeader>
	//   34   69:getfield        #71  <Field int OggPageHeader.headerSize>
	//   35   72:istore_2        
				int k;
				if((pageHeader.type & 1) == 1 && packetArray.limit() == 0)
	//*  36   73:aload_0         
	//*  37   74:getfield        #22  <Field OggPageHeader pageHeader>
	//*  38   77:getfield        #74  <Field int OggPageHeader.type>
	//*  39   80:iconst_1        
	//*  40   81:iand            
	//*  41   82:iconst_1        
	//*  42   83:icmpne          114
	//*  43   86:aload_0         
	//*  44   87:getfield        #30  <Field ParsableByteArray packetArray>
	//*  45   90:invokevirtual   #78  <Method int ParsableByteArray.limit()>
	//*  46   93:ifne            114
				{
					i += calculatePacketSize(0);
	//   47   96:iload_2         
	//   48   97:aload_0         
	//   49   98:iconst_0        
	//   50   99:invokespecial   #80  <Method int calculatePacketSize(int)>
	//   51  102:iadd            
	//   52  103:istore_2        
					k = segmentCount + 0;
	//   53  104:aload_0         
	//   54  105:getfield        #37  <Field int segmentCount>
	//   55  108:iconst_0        
	//   56  109:iadd            
	//   57  110:istore_3        
				} else
	//*  58  111:goto            116
				{
					k = 0;
	//   59  114:iconst_0        
	//   60  115:istore_3        
				}
				extractorinput.skipFully(i);
	//   61  116:aload_1         
	//   62  117:iload_2         
	//   63  118:invokeinterface #86  <Method void ExtractorInput.skipFully(int)>
				currentSegmentIndex = k;
	//   64  123:aload_0         
	//   65  124:iload_3         
	//   66  125:putfield        #32  <Field int currentSegmentIndex>
			}
			int j = calculatePacketSize(currentSegmentIndex);
	//   67  128:aload_0         
	//   68  129:aload_0         
	//   69  130:getfield        #32  <Field int currentSegmentIndex>
	//   70  133:invokespecial   #80  <Method int calculatePacketSize(int)>
	//   71  136:istore_2        
			int l = currentSegmentIndex + segmentCount;
	//   72  137:aload_0         
	//   73  138:getfield        #32  <Field int currentSegmentIndex>
	//   74  141:aload_0         
	//   75  142:getfield        #37  <Field int segmentCount>
	//   76  145:iadd            
	//   77  146:istore_3        
			if(j > 0)
	//*  78  147:iload_2         
	//*  79  148:ifle            265
			{
				if(packetArray.capacity() < packetArray.limit() + j)
	//*  80  151:aload_0         
	//*  81  152:getfield        #30  <Field ParsableByteArray packetArray>
	//*  82  155:invokevirtual   #89  <Method int ParsableByteArray.capacity()>
	//*  83  158:aload_0         
	//*  84  159:getfield        #30  <Field ParsableByteArray packetArray>
	//*  85  162:invokevirtual   #78  <Method int ParsableByteArray.limit()>
	//*  86  165:iload_2         
	//*  87  166:iadd            
	//*  88  167:icmpge          196
					packetArray.data = Arrays.copyOf(packetArray.data, packetArray.limit() + j);
	//   89  170:aload_0         
	//   90  171:getfield        #30  <Field ParsableByteArray packetArray>
	//   91  174:aload_0         
	//   92  175:getfield        #30  <Field ParsableByteArray packetArray>
	//   93  178:getfield        #93  <Field byte[] ParsableByteArray.data>
	//   94  181:aload_0         
	//   95  182:getfield        #30  <Field ParsableByteArray packetArray>
	//   96  185:invokevirtual   #78  <Method int ParsableByteArray.limit()>
	//   97  188:iload_2         
	//   98  189:iadd            
	//   99  190:invokestatic    #99  <Method byte[] Arrays.copyOf(byte[], int)>
	//  100  193:putfield        #93  <Field byte[] ParsableByteArray.data>
				extractorinput.readFully(packetArray.data, packetArray.limit(), j);
	//  101  196:aload_1         
	//  102  197:aload_0         
	//  103  198:getfield        #30  <Field ParsableByteArray packetArray>
	//  104  201:getfield        #93  <Field byte[] ParsableByteArray.data>
	//  105  204:aload_0         
	//  106  205:getfield        #30  <Field ParsableByteArray packetArray>
	//  107  208:invokevirtual   #78  <Method int ParsableByteArray.limit()>
	//  108  211:iload_2         
	//  109  212:invokeinterface #103 <Method void ExtractorInput.readFully(byte[], int, int)>
				packetArray.setLimit(packetArray.limit() + j);
	//  110  217:aload_0         
	//  111  218:getfield        #30  <Field ParsableByteArray packetArray>
	//  112  221:aload_0         
	//  113  222:getfield        #30  <Field ParsableByteArray packetArray>
	//  114  225:invokevirtual   #78  <Method int ParsableByteArray.limit()>
	//  115  228:iload_2         
	//  116  229:iadd            
	//  117  230:invokevirtual   #106 <Method void ParsableByteArray.setLimit(int)>
				boolean flag1;
				if(pageHeader.laces[l - 1] != 255)
	//* 118  233:aload_0         
	//* 119  234:getfield        #22  <Field OggPageHeader pageHeader>
	//* 120  237:getfield        #44  <Field int[] OggPageHeader.laces>
	//* 121  240:iload_3         
	//* 122  241:iconst_1        
	//* 123  242:isub            
	//* 124  243:iaload          
	//* 125  244:sipush          255
	//* 126  247:icmpeq          256
					flag1 = true;
	//  127  250:iconst_1        
	//  128  251:istore          4
				else
	//* 129  253:goto            259
					flag1 = false;
	//  130  256:iconst_0        
	//  131  257:istore          4
				populated = flag1;
	//  132  259:aload_0         
	//  133  260:iload           4
	//  134  262:putfield        #62  <Field boolean populated>
			}
			j = l;
	//  135  265:iload_3         
	//  136  266:istore_2        
			if(l == pageHeader.pageSegmentCount)
	//* 137  267:iload_3         
	//* 138  268:aload_0         
	//* 139  269:getfield        #22  <Field OggPageHeader pageHeader>
	//* 140  272:getfield        #40  <Field int OggPageHeader.pageSegmentCount>
	//* 141  275:icmpne          280
				j = -1;
	//  142  278:iconst_m1       
	//  143  279:istore_2        
			currentSegmentIndex = j;
	//  144  280:aload_0         
	//  145  281:iload_2         
	//  146  282:putfield        #32  <Field int currentSegmentIndex>
		}
	//* 147  285:goto            37
		return true;
	//  148  288:iconst_1        
	//  149  289:ireturn         
	}

	public void reset()
	{
		pageHeader.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field OggPageHeader pageHeader>
	//    2    4:invokevirtual   #108 <Method void OggPageHeader.reset()>
		packetArray.reset();
	//    3    7:aload_0         
	//    4    8:getfield        #30  <Field ParsableByteArray packetArray>
	//    5   11:invokevirtual   #65  <Method void ParsableByteArray.reset()>
		currentSegmentIndex = -1;
	//    6   14:aload_0         
	//    7   15:iconst_m1       
	//    8   16:putfield        #32  <Field int currentSegmentIndex>
		populated = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #62  <Field boolean populated>
	//   12   24:return          
	}

	public void trimPayload()
	{
		if(packetArray.data.length == 65025)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field ParsableByteArray packetArray>
	//*   2    4:getfield        #93  <Field byte[] ParsableByteArray.data>
	//*   3    7:arraylength     
	//*   4    8:ldc1            #25  <Int 65025>
	//*   5   10:icmpne          14
		{
			return;
	//    6   13:return          
		} else
		{
			packetArray.data = Arrays.copyOf(packetArray.data, Math.max(65025, packetArray.limit()));
	//    7   14:aload_0         
	//    8   15:getfield        #30  <Field ParsableByteArray packetArray>
	//    9   18:aload_0         
	//   10   19:getfield        #30  <Field ParsableByteArray packetArray>
	//   11   22:getfield        #93  <Field byte[] ParsableByteArray.data>
	//   12   25:ldc1            #25  <Int 65025>
	//   13   27:aload_0         
	//   14   28:getfield        #30  <Field ParsableByteArray packetArray>
	//   15   31:invokevirtual   #78  <Method int ParsableByteArray.limit()>
	//   16   34:invokestatic    #115 <Method int Math.max(int, int)>
	//   17   37:invokestatic    #99  <Method byte[] Arrays.copyOf(byte[], int)>
	//   18   40:putfield        #93  <Field byte[] ParsableByteArray.data>
			return;
	//   19   43:return          
		}
	}

	private int currentSegmentIndex;
	private final ParsableByteArray packetArray = new ParsableByteArray(new byte[65025], 0);
	private final OggPageHeader pageHeader = new OggPageHeader();
	private boolean populated;
	private int segmentCount;
}
