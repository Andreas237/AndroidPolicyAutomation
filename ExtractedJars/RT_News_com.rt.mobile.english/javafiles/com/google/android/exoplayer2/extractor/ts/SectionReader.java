// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.util.*;

// Referenced classes of package com.google.android.exoplayer2.extractor.ts:
//			TsPayloadReader, SectionPayloadReader

public final class SectionReader
	implements TsPayloadReader
{

	public SectionReader(SectionPayloadReader sectionpayloadreader)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		reader = sectionpayloadreader;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #29  <Field SectionPayloadReader reader>
	//    5    9:aload_0         
	//    6   10:new             #31  <Class ParsableByteArray>
	//    7   13:dup             
	//    8   14:bipush          32
	//    9   16:invokespecial   #34  <Method void ParsableByteArray(int)>
	//   10   19:putfield        #36  <Field ParsableByteArray sectionData>
	//   11   22:return          
	}

	public void consume(ParsableByteArray parsablebytearray, boolean flag)
	{
		int i;
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            17
			i = parsablebytearray.readUnsignedByte() + parsablebytearray.getPosition();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #43  <Method int ParsableByteArray.readUnsignedByte()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #46  <Method int ParsableByteArray.getPosition()>
	//    6   12:iadd            
	//    7   13:istore_3        
		else
	//*   8   14:goto            19
			i = -1;
	//    9   17:iconst_m1       
	//   10   18:istore_3        
		if(waitingForPayloadStart)
	//*  11   19:aload_0         
	//*  12   20:getfield        #48  <Field boolean waitingForPayloadStart>
	//*  13   23:ifeq            46
		{
			if(!flag)
	//*  14   26:iload_2         
	//*  15   27:ifne            31
				return;
	//   16   30:return          
			waitingForPayloadStart = false;
	//   17   31:aload_0         
	//   18   32:iconst_0        
	//   19   33:putfield        #48  <Field boolean waitingForPayloadStart>
			parsablebytearray.setPosition(i);
	//   20   36:aload_1         
	//   21   37:iload_3         
	//   22   38:invokevirtual   #51  <Method void ParsableByteArray.setPosition(int)>
			bytesRead = 0;
	//   23   41:aload_0         
	//   24   42:iconst_0        
	//   25   43:putfield        #53  <Field int bytesRead>
		}
		do
		{
			if(parsablebytearray.bytesLeft() <= 0)
				break;
	//   26   46:aload_1         
	//   27   47:invokevirtual   #56  <Method int ParsableByteArray.bytesLeft()>
	//   28   50:ifle            415
			int j = bytesRead;
	//   29   53:aload_0         
	//   30   54:getfield        #53  <Field int bytesRead>
	//   31   57:istore_3        
			flag = true;
	//   32   58:iconst_1        
	//   33   59:istore_2        
			if(j < 3)
	//*  34   60:iload_3         
	//*  35   61:iconst_3        
	//*  36   62:icmpge          281
			{
				if(bytesRead == 0)
	//*  37   65:aload_0         
	//*  38   66:getfield        #53  <Field int bytesRead>
	//*  39   69:ifne            100
				{
					int k = parsablebytearray.readUnsignedByte();
	//   40   72:aload_1         
	//   41   73:invokevirtual   #43  <Method int ParsableByteArray.readUnsignedByte()>
	//   42   76:istore_3        
					parsablebytearray.setPosition(parsablebytearray.getPosition() - 1);
	//   43   77:aload_1         
	//   44   78:aload_1         
	//   45   79:invokevirtual   #46  <Method int ParsableByteArray.getPosition()>
	//   46   82:iconst_1        
	//   47   83:isub            
	//   48   84:invokevirtual   #51  <Method void ParsableByteArray.setPosition(int)>
					if(k == 255)
	//*  49   87:iload_3         
	//*  50   88:sipush          255
	//*  51   91:icmpne          100
					{
						waitingForPayloadStart = true;
	//   52   94:aload_0         
	//   53   95:iconst_1        
	//   54   96:putfield        #48  <Field boolean waitingForPayloadStart>
						return;
	//   55   99:return          
					}
				}
				int l = Math.min(parsablebytearray.bytesLeft(), 3 - bytesRead);
	//   56  100:aload_1         
	//   57  101:invokevirtual   #56  <Method int ParsableByteArray.bytesLeft()>
	//   58  104:iconst_3        
	//   59  105:aload_0         
	//   60  106:getfield        #53  <Field int bytesRead>
	//   61  109:isub            
	//   62  110:invokestatic    #62  <Method int Math.min(int, int)>
	//   63  113:istore_3        
				parsablebytearray.readBytes(sectionData.data, bytesRead, l);
	//   64  114:aload_1         
	//   65  115:aload_0         
	//   66  116:getfield        #36  <Field ParsableByteArray sectionData>
	//   67  119:getfield        #66  <Field byte[] ParsableByteArray.data>
	//   68  122:aload_0         
	//   69  123:getfield        #53  <Field int bytesRead>
	//   70  126:iload_3         
	//   71  127:invokevirtual   #70  <Method void ParsableByteArray.readBytes(byte[], int, int)>
				bytesRead = bytesRead + l;
	//   72  130:aload_0         
	//   73  131:aload_0         
	//   74  132:getfield        #53  <Field int bytesRead>
	//   75  135:iload_3         
	//   76  136:iadd            
	//   77  137:putfield        #53  <Field int bytesRead>
				if(bytesRead == 3)
	//*  78  140:aload_0         
	//*  79  141:getfield        #53  <Field int bytesRead>
	//*  80  144:iconst_3        
	//*  81  145:icmpne          46
				{
					sectionData.reset(3);
	//   82  148:aload_0         
	//   83  149:getfield        #36  <Field ParsableByteArray sectionData>
	//   84  152:iconst_3        
	//   85  153:invokevirtual   #73  <Method void ParsableByteArray.reset(int)>
					sectionData.skipBytes(1);
	//   86  156:aload_0         
	//   87  157:getfield        #36  <Field ParsableByteArray sectionData>
	//   88  160:iconst_1        
	//   89  161:invokevirtual   #76  <Method void ParsableByteArray.skipBytes(int)>
					int i1 = sectionData.readUnsignedByte();
	//   90  164:aload_0         
	//   91  165:getfield        #36  <Field ParsableByteArray sectionData>
	//   92  168:invokevirtual   #43  <Method int ParsableByteArray.readUnsignedByte()>
	//   93  171:istore_3        
					int k1 = sectionData.readUnsignedByte();
	//   94  172:aload_0         
	//   95  173:getfield        #36  <Field ParsableByteArray sectionData>
	//   96  176:invokevirtual   #43  <Method int ParsableByteArray.readUnsignedByte()>
	//   97  179:istore          4
					if((i1 & 0x80) == 0)
	//*  98  181:iload_3         
	//*  99  182:sipush          128
	//* 100  185:iand            
	//* 101  186:ifeq            192
	//* 102  189:goto            194
						flag = false;
	//  103  192:iconst_0        
	//  104  193:istore_2        
					sectionSyntaxIndicator = flag;
	//  105  194:aload_0         
	//  106  195:iload_2         
	//  107  196:putfield        #78  <Field boolean sectionSyntaxIndicator>
					totalSectionLength = ((i1 & 0xf) << 8 | k1) + 3;
	//  108  199:aload_0         
	//  109  200:iload_3         
	//  110  201:bipush          15
	//  111  203:iand            
	//  112  204:bipush          8
	//  113  206:ishl            
	//  114  207:iload           4
	//  115  209:ior             
	//  116  210:iconst_3        
	//  117  211:iadd            
	//  118  212:putfield        #80  <Field int totalSectionLength>
					if(sectionData.capacity() < totalSectionLength)
	//* 119  215:aload_0         
	//* 120  216:getfield        #36  <Field ParsableByteArray sectionData>
	//* 121  219:invokevirtual   #83  <Method int ParsableByteArray.capacity()>
	//* 122  222:aload_0         
	//* 123  223:getfield        #80  <Field int totalSectionLength>
	//* 124  226:icmpge          46
					{
						byte abyte0[] = sectionData.data;
	//  125  229:aload_0         
	//  126  230:getfield        #36  <Field ParsableByteArray sectionData>
	//  127  233:getfield        #66  <Field byte[] ParsableByteArray.data>
	//  128  236:astore          5
						sectionData.reset(Math.min(4098, Math.max(totalSectionLength, abyte0.length * 2)));
	//  129  238:aload_0         
	//  130  239:getfield        #36  <Field ParsableByteArray sectionData>
	//  131  242:sipush          4098
	//  132  245:aload_0         
	//  133  246:getfield        #80  <Field int totalSectionLength>
	//  134  249:aload           5
	//  135  251:arraylength     
	//  136  252:iconst_2        
	//  137  253:imul            
	//  138  254:invokestatic    #86  <Method int Math.max(int, int)>
	//  139  257:invokestatic    #62  <Method int Math.min(int, int)>
	//  140  260:invokevirtual   #73  <Method void ParsableByteArray.reset(int)>
						System.arraycopy(((Object) (abyte0)), 0, ((Object) (sectionData.data)), 0, 3);
	//  141  263:aload           5
	//  142  265:iconst_0        
	//  143  266:aload_0         
	//  144  267:getfield        #36  <Field ParsableByteArray sectionData>
	//  145  270:getfield        #66  <Field byte[] ParsableByteArray.data>
	//  146  273:iconst_0        
	//  147  274:iconst_3        
	//  148  275:invokestatic    #92  <Method void System.arraycopy(Object, int, Object, int, int)>
					}
				}
			} else
	//* 149  278:goto            46
			{
				int j1 = Math.min(parsablebytearray.bytesLeft(), totalSectionLength - bytesRead);
	//  150  281:aload_1         
	//  151  282:invokevirtual   #56  <Method int ParsableByteArray.bytesLeft()>
	//  152  285:aload_0         
	//  153  286:getfield        #80  <Field int totalSectionLength>
	//  154  289:aload_0         
	//  155  290:getfield        #53  <Field int bytesRead>
	//  156  293:isub            
	//  157  294:invokestatic    #62  <Method int Math.min(int, int)>
	//  158  297:istore_3        
				parsablebytearray.readBytes(sectionData.data, bytesRead, j1);
	//  159  298:aload_1         
	//  160  299:aload_0         
	//  161  300:getfield        #36  <Field ParsableByteArray sectionData>
	//  162  303:getfield        #66  <Field byte[] ParsableByteArray.data>
	//  163  306:aload_0         
	//  164  307:getfield        #53  <Field int bytesRead>
	//  165  310:iload_3         
	//  166  311:invokevirtual   #70  <Method void ParsableByteArray.readBytes(byte[], int, int)>
				bytesRead = bytesRead + j1;
	//  167  314:aload_0         
	//  168  315:aload_0         
	//  169  316:getfield        #53  <Field int bytesRead>
	//  170  319:iload_3         
	//  171  320:iadd            
	//  172  321:putfield        #53  <Field int bytesRead>
				if(bytesRead == totalSectionLength)
	//* 173  324:aload_0         
	//* 174  325:getfield        #53  <Field int bytesRead>
	//* 175  328:aload_0         
	//* 176  329:getfield        #80  <Field int totalSectionLength>
	//* 177  332:icmpne          46
				{
					if(sectionSyntaxIndicator)
	//* 178  335:aload_0         
	//* 179  336:getfield        #78  <Field boolean sectionSyntaxIndicator>
	//* 180  339:ifeq            383
					{
						if(Util.crc(sectionData.data, 0, totalSectionLength, -1) != 0)
	//* 181  342:aload_0         
	//* 182  343:getfield        #36  <Field ParsableByteArray sectionData>
	//* 183  346:getfield        #66  <Field byte[] ParsableByteArray.data>
	//* 184  349:iconst_0        
	//* 185  350:aload_0         
	//* 186  351:getfield        #80  <Field int totalSectionLength>
	//* 187  354:iconst_m1       
	//* 188  355:invokestatic    #98  <Method int Util.crc(byte[], int, int, int)>
	//* 189  358:ifeq            367
						{
							waitingForPayloadStart = true;
	//  190  361:aload_0         
	//  191  362:iconst_1        
	//  192  363:putfield        #48  <Field boolean waitingForPayloadStart>
							return;
	//  193  366:return          
						}
						sectionData.reset(totalSectionLength - 4);
	//  194  367:aload_0         
	//  195  368:getfield        #36  <Field ParsableByteArray sectionData>
	//  196  371:aload_0         
	//  197  372:getfield        #80  <Field int totalSectionLength>
	//  198  375:iconst_4        
	//  199  376:isub            
	//  200  377:invokevirtual   #73  <Method void ParsableByteArray.reset(int)>
					} else
	//* 201  380:goto            394
					{
						sectionData.reset(totalSectionLength);
	//  202  383:aload_0         
	//  203  384:getfield        #36  <Field ParsableByteArray sectionData>
	//  204  387:aload_0         
	//  205  388:getfield        #80  <Field int totalSectionLength>
	//  206  391:invokevirtual   #73  <Method void ParsableByteArray.reset(int)>
					}
					reader.consume(sectionData);
	//  207  394:aload_0         
	//  208  395:getfield        #29  <Field SectionPayloadReader reader>
	//  209  398:aload_0         
	//  210  399:getfield        #36  <Field ParsableByteArray sectionData>
	//  211  402:invokeinterface #103 <Method void SectionPayloadReader.consume(ParsableByteArray)>
					bytesRead = 0;
	//  212  407:aload_0         
	//  213  408:iconst_0        
	//  214  409:putfield        #53  <Field int bytesRead>
				}
			}
		} while(true);
	//  215  412:goto            46
	//  216  415:return          
	}

	public void init(TimestampAdjuster timestampadjuster, ExtractorOutput extractoroutput, TsPayloadReader.TrackIdGenerator trackidgenerator)
	{
		reader.init(timestampadjuster, extractoroutput, trackidgenerator);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field SectionPayloadReader reader>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokeinterface #107 <Method void SectionPayloadReader.init(TimestampAdjuster, ExtractorOutput, TsPayloadReader$TrackIdGenerator)>
		waitingForPayloadStart = true;
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:putfield        #48  <Field boolean waitingForPayloadStart>
	//    9   17:return          
	}

	public void seek()
	{
		waitingForPayloadStart = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #48  <Field boolean waitingForPayloadStart>
	//    3    5:return          
	}

	private static final int DEFAULT_SECTION_BUFFER_LENGTH = 32;
	private static final int MAX_SECTION_LENGTH = 4098;
	private static final int SECTION_HEADER_LENGTH = 3;
	private int bytesRead;
	private final SectionPayloadReader reader;
	private final ParsableByteArray sectionData = new ParsableByteArray(32);
	private boolean sectionSyntaxIndicator;
	private int totalSectionLength;
	private boolean waitingForPayloadStart;
}
