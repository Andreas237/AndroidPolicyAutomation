// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ts;

import android.util.*;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.util.*;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.extractor.ts:
//			SectionPayloadReader, TsExtractor, TsPayloadReader

private class TsExtractor$PmtReader
	implements SectionPayloadReader
{

	private  readEsInfo(ParsableByteArray parsablebytearray, int i)
	{
		int j = parsablebytearray.getPosition();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #67  <Method int ParsableByteArray.getPosition()>
	//    2    4:istore_3        
		int k = i + j;
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iadd            
	//    6    8:istore          4
		String s = null;
	//    7   10:aconst_null     
	//    8   11:astore          9
		i = -1;
	//    9   13:iconst_m1       
	//   10   14:istore_2        
		Object obj;
		Object obj2;
		for(obj = null; parsablebytearray.getPosition() < k; obj = obj2)
	//*  11   15:aconst_null     
	//*  12   16:astore          10
	//*  13   18:aload_1         
	//*  14   19:invokevirtual   #67  <Method int ParsableByteArray.getPosition()>
	//*  15   22:iload           4
	//*  16   24:icmpge          318
		{
			int l;
			Object obj1;
label0:
			{
				int i1;
label1:
				{
label2:
					{
label3:
						{
							i1 = parsablebytearray.readUnsignedByte();
	//   17   27:aload_1         
	//   18   28:invokevirtual   #70  <Method int ParsableByteArray.readUnsignedByte()>
	//   19   31:istore          6
							l = parsablebytearray.readUnsignedByte();
	//   20   33:aload_1         
	//   21   34:invokevirtual   #70  <Method int ParsableByteArray.readUnsignedByte()>
	//   22   37:istore          5
							l = parsablebytearray.getPosition() + l;
	//   23   39:aload_1         
	//   24   40:invokevirtual   #67  <Method int ParsableByteArray.getPosition()>
	//   25   43:iload           5
	//   26   45:iadd            
	//   27   46:istore          5
							if(i1 == 5)
	//*  28   48:iload           6
	//*  29   50:iconst_5        
	//*  30   51:icmpne          115
							{
								long l1 = parsablebytearray.readUnsignedInt();
	//   31   54:aload_1         
	//   32   55:invokevirtual   #74  <Method long ParsableByteArray.readUnsignedInt()>
	//   33   58:lstore          7
								if(l1 != TsExtractor.access$900())
	//*  34   60:lload           7
	//*  35   62:invokestatic    #77  <Method long TsExtractor.access$900()>
	//*  36   65:lcmp            
	//*  37   66:ifne            72
	//*  38   69:goto            122
								{
									if(l1 != TsExtractor.access$1000())
	//*  39   72:lload           7
	//*  40   74:invokestatic    #80  <Method long TsExtractor.access$1000()>
	//*  41   77:lcmp            
	//*  42   78:ifne            84
	//*  43   81:goto            144
									{
										obj1 = ((Object) (s));
	//   44   84:aload           9
	//   45   86:astore          11
										obj2 = obj;
	//   46   88:aload           10
	//   47   90:astore          12
										if(l1 == TsExtractor.access$1100())
	//*  48   92:lload           7
	//*  49   94:invokestatic    #83  <Method long TsExtractor.access$1100()>
	//*  50   97:lcmp            
	//*  51   98:ifne            296
										{
											i = 36;
	//   52  101:bipush          36
	//   53  103:istore_2        
											obj1 = ((Object) (s));
	//   54  104:aload           9
	//   55  106:astore          11
											obj2 = obj;
	//   56  108:aload           10
	//   57  110:astore          12
										}
										break label0;
	//   58  112:goto            296
									}
									break label2;
								}
							} else
							if(i1 != 106)
								break label3;
	//   59  115:iload           6
	//   60  117:bipush          106
	//   61  119:icmpne          137
							i = 129;
	//   62  122:sipush          129
	//   63  125:istore_2        
							obj1 = ((Object) (s));
	//   64  126:aload           9
	//   65  128:astore          11
							obj2 = obj;
	//   66  130:aload           10
	//   67  132:astore          12
							break label0;
	//   68  134:goto            296
						}
						if(i1 != 122)
							break label1;
	//   69  137:iload           6
	//   70  139:bipush          122
	//   71  141:icmpne          159
					}
					i = 135;
	//   72  144:sipush          135
	//   73  147:istore_2        
					obj1 = ((Object) (s));
	//   74  148:aload           9
	//   75  150:astore          11
					obj2 = obj;
	//   76  152:aload           10
	//   77  154:astore          12
					break label0;
	//   78  156:goto            296
				}
				if(i1 == 123)
	//*  79  159:iload           6
	//*  80  161:bipush          123
	//*  81  163:icmpne          181
				{
					i = 138;
	//   82  166:sipush          138
	//   83  169:istore_2        
					obj1 = ((Object) (s));
	//   84  170:aload           9
	//   85  172:astore          11
					obj2 = obj;
	//   86  174:aload           10
	//   87  176:astore          12
				} else
	//*  88  178:goto            296
				if(i1 == 10)
	//*  89  181:iload           6
	//*  90  183:bipush          10
	//*  91  185:icmpne          205
				{
					obj1 = ((Object) (parsablebytearray.readString(3).trim()));
	//   92  188:aload_1         
	//   93  189:iconst_3        
	//   94  190:invokevirtual   #87  <Method String ParsableByteArray.readString(int)>
	//   95  193:invokevirtual   #93  <Method String String.trim()>
	//   96  196:astore          11
					obj2 = obj;
	//   97  198:aload           10
	//   98  200:astore          12
				} else
	//*  99  202:goto            296
				{
					obj1 = ((Object) (s));
	//  100  205:aload           9
	//  101  207:astore          11
					obj2 = obj;
	//  102  209:aload           10
	//  103  211:astore          12
					if(i1 == 89)
	//* 104  213:iload           6
	//* 105  215:bipush          89
	//* 106  217:icmpne          296
					{
						obj2 = ((Object) (new ArrayList()));
	//  107  220:new             #95  <Class ArrayList>
	//  108  223:dup             
	//  109  224:invokespecial   #96  <Method void ArrayList()>
	//  110  227:astore          12
						for(; parsablebytearray.getPosition() < l; ((List) (obj2)).add(((Object) (new titleInfo(((String) (obj)), i, ((byte []) (obj1)))))))
	//* 111  229:aload_1         
	//* 112  230:invokevirtual   #67  <Method int ParsableByteArray.getPosition()>
	//* 113  233:iload           5
	//* 114  235:icmpge          289
						{
							obj = ((Object) (parsablebytearray.readString(3).trim()));
	//  115  238:aload_1         
	//  116  239:iconst_3        
	//  117  240:invokevirtual   #87  <Method String ParsableByteArray.readString(int)>
	//  118  243:invokevirtual   #93  <Method String String.trim()>
	//  119  246:astore          10
							i = parsablebytearray.readUnsignedByte();
	//  120  248:aload_1         
	//  121  249:invokevirtual   #70  <Method int ParsableByteArray.readUnsignedByte()>
	//  122  252:istore_2        
							obj1 = ((Object) (new byte[4]));
	//  123  253:iconst_4        
	//  124  254:newarray        byte[]
	//  125  256:astore          11
							parsablebytearray.readBytes(((byte []) (obj1)), 0, 4);
	//  126  258:aload_1         
	//  127  259:aload           11
	//  128  261:iconst_0        
	//  129  262:iconst_4        
	//  130  263:invokevirtual   #100 <Method void ParsableByteArray.readBytes(byte[], int, int)>
						}

	//  131  266:aload           12
	//  132  268:new             #102 <Class TsPayloadReader$DvbSubtitleInfo>
	//  133  271:dup             
	//  134  272:aload           10
	//  135  274:iload_2         
	//  136  275:aload           11
	//  137  277:invokespecial   #105 <Method void TsPayloadReader$DvbSubtitleInfo(String, int, byte[])>
	//  138  280:invokeinterface #111 <Method boolean List.add(Object)>
	//  139  285:pop             
	//* 140  286:goto            229
						i = 89;
	//  141  289:bipush          89
	//  142  291:istore_2        
						obj1 = ((Object) (s));
	//  143  292:aload           9
	//  144  294:astore          11
					}
				}
			}
			parsablebytearray.skipBytes(l - parsablebytearray.getPosition());
	//  145  296:aload_1         
	//  146  297:iload           5
	//  147  299:aload_1         
	//  148  300:invokevirtual   #67  <Method int ParsableByteArray.getPosition()>
	//  149  303:isub            
	//  150  304:invokevirtual   #115 <Method void ParsableByteArray.skipBytes(int)>
			s = ((String) (obj1));
	//  151  307:aload           11
	//  152  309:astore          9
		}

	//  153  311:aload           12
	//  154  313:astore          10
	//* 155  315:goto            18
		parsablebytearray.setPosition(k);
	//  156  318:aload_1         
	//  157  319:iload           4
	//  158  321:invokevirtual   #118 <Method void ParsableByteArray.setPosition(int)>
		return new (i, s, ((List) (obj)), Arrays.copyOfRange(parsablebytearray.data, j, k));
	//  159  324:new             #120 <Class TsPayloadReader$EsInfo>
	//  160  327:dup             
	//  161  328:iload_2         
	//  162  329:aload           9
	//  163  331:aload           10
	//  164  333:aload_1         
	//  165  334:getfield        #124 <Field byte[] ParsableByteArray.data>
	//  166  337:iload_3         
	//  167  338:iload           4
	//  168  340:invokestatic    #130 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//  169  343:invokespecial   #133 <Method void TsPayloadReader$EsInfo(int, String, List, byte[])>
	//  170  346:areturn         
	}

	public void consume(ParsableByteArray parsablebytearray)
	{
		if(parsablebytearray.readUnsignedByte() != 2)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #70  <Method int ParsableByteArray.readUnsignedByte()>
	//*   2    4:iconst_2        
	//*   3    5:icmpeq          9
			return;
	//    4    8:return          
		int i = TsExtractor.access$200(TsExtractor.this);
	//    5    9:aload_0         
	//    6   10:getfield        #36  <Field TsExtractor this$0>
	//    7   13:invokestatic    #139 <Method int TsExtractor.access$200(TsExtractor)>
	//    8   16:istore_2        
		boolean flag = false;
	//    9   17:iconst_0        
	//   10   18:istore          4
		TimestampAdjuster timestampadjuster;
		if(i != 1 && TsExtractor.access$200(TsExtractor.this) != 2 && TsExtractor.access$100(TsExtractor.this) != 1)
	//*  11   20:iload_2         
	//*  12   21:iconst_1        
	//*  13   22:icmpeq          96
	//*  14   25:aload_0         
	//*  15   26:getfield        #36  <Field TsExtractor this$0>
	//*  16   29:invokestatic    #139 <Method int TsExtractor.access$200(TsExtractor)>
	//*  17   32:iconst_2        
	//*  18   33:icmpeq          96
	//*  19   36:aload_0         
	//*  20   37:getfield        #36  <Field TsExtractor this$0>
	//*  21   40:invokestatic    #142 <Method int TsExtractor.access$100(TsExtractor)>
	//*  22   43:iconst_1        
	//*  23   44:icmpne          50
	//*  24   47:goto            96
		{
			timestampadjuster = new TimestampAdjuster(((TimestampAdjuster)TsExtractor.access$300(TsExtractor.this).get(0)).getFirstSampleTimestampUs());
	//   25   50:new             #144 <Class TimestampAdjuster>
	//   26   53:dup             
	//   27   54:aload_0         
	//   28   55:getfield        #36  <Field TsExtractor this$0>
	//   29   58:invokestatic    #148 <Method List TsExtractor.access$300(TsExtractor)>
	//   30   61:iconst_0        
	//   31   62:invokeinterface #152 <Method Object List.get(int)>
	//   32   67:checkcast       #144 <Class TimestampAdjuster>
	//   33   70:invokevirtual   #155 <Method long TimestampAdjuster.getFirstSampleTimestampUs()>
	//   34   73:invokespecial   #158 <Method void TimestampAdjuster(long)>
	//   35   76:astore          9
			TsExtractor.access$300(TsExtractor.this).add(((Object) (timestampadjuster)));
	//   36   78:aload_0         
	//   37   79:getfield        #36  <Field TsExtractor this$0>
	//   38   82:invokestatic    #148 <Method List TsExtractor.access$300(TsExtractor)>
	//   39   85:aload           9
	//   40   87:invokeinterface #111 <Method boolean List.add(Object)>
	//   41   92:pop             
		} else
	//*  42   93:goto            114
		{
			timestampadjuster = (TimestampAdjuster)TsExtractor.access$300(TsExtractor.this).get(0);
	//   43   96:aload_0         
	//   44   97:getfield        #36  <Field TsExtractor this$0>
	//   45  100:invokestatic    #148 <Method List TsExtractor.access$300(TsExtractor)>
	//   46  103:iconst_0        
	//   47  104:invokeinterface #152 <Method Object List.get(int)>
	//   48  109:checkcast       #144 <Class TimestampAdjuster>
	//   49  112:astore          9
		}
		parsablebytearray.skipBytes(2);
	//   50  114:aload_1         
	//   51  115:iconst_2        
	//   52  116:invokevirtual   #115 <Method void ParsableByteArray.skipBytes(int)>
		int j2 = parsablebytearray.readUnsignedShort();
	//   53  119:aload_1         
	//   54  120:invokevirtual   #161 <Method int ParsableByteArray.readUnsignedShort()>
	//   55  123:istore          7
		parsablebytearray.skipBytes(5);
	//   56  125:aload_1         
	//   57  126:iconst_5        
	//   58  127:invokevirtual   #115 <Method void ParsableByteArray.skipBytes(int)>
		parsablebytearray.readBytes(pmtScratch, 2);
	//   59  130:aload_1         
	//   60  131:aload_0         
	//   61  132:getfield        #46  <Field ParsableBitArray pmtScratch>
	//   62  135:iconst_2        
	//   63  136:invokevirtual   #164 <Method void ParsableByteArray.readBytes(ParsableBitArray, int)>
		pmtScratch.skipBits(4);
	//   64  139:aload_0         
	//   65  140:getfield        #46  <Field ParsableBitArray pmtScratch>
	//   66  143:iconst_4        
	//   67  144:invokevirtual   #167 <Method void ParsableBitArray.skipBits(int)>
		parsablebytearray.skipBytes(pmtScratch.readBits(12));
	//   68  147:aload_1         
	//   69  148:aload_0         
	//   70  149:getfield        #46  <Field ParsableBitArray pmtScratch>
	//   71  152:bipush          12
	//   72  154:invokevirtual   #171 <Method int ParsableBitArray.readBits(int)>
	//   73  157:invokevirtual   #115 <Method void ParsableByteArray.skipBytes(int)>
		if(TsExtractor.access$200(TsExtractor.this) == 2 && TsExtractor.access$400(TsExtractor.this) == null)
	//*  74  160:aload_0         
	//*  75  161:getfield        #36  <Field TsExtractor this$0>
	//*  76  164:invokestatic    #139 <Method int TsExtractor.access$200(TsExtractor)>
	//*  77  167:iconst_2        
	//*  78  168:icmpne          256
	//*  79  171:aload_0         
	//*  80  172:getfield        #36  <Field TsExtractor this$0>
	//*  81  175:invokestatic    #175 <Method TsPayloadReader TsExtractor.access$400(TsExtractor)>
	//*  82  178:ifnonnull       256
		{
			  = new (21, ((String) (null)), ((List) (null)), new byte[0]);
	//   83  181:new             #120 <Class TsPayloadReader$EsInfo>
	//   84  184:dup             
	//   85  185:bipush          21
	//   86  187:aconst_null     
	//   87  188:aconst_null     
	//   88  189:iconst_0        
	//   89  190:newarray        byte[]
	//   90  192:invokespecial   #133 <Method void TsPayloadReader$EsInfo(int, String, List, byte[])>
	//   91  195:astore          10
			TsExtractor.access$402(TsExtractor.this, TsExtractor.access$500(TsExtractor.this).createPayloadReader(21, ));
	//   92  197:aload_0         
	//   93  198:getfield        #36  <Field TsExtractor this$0>
	//   94  201:aload_0         
	//   95  202:getfield        #36  <Field TsExtractor this$0>
	//   96  205:invokestatic    #179 <Method TsPayloadReader$Factory TsExtractor.access$500(TsExtractor)>
	//   97  208:bipush          21
	//   98  210:aload           10
	//   99  212:invokeinterface #185 <Method TsPayloadReader TsPayloadReader$Factory.createPayloadReader(int, TsPayloadReader$EsInfo)>
	//  100  217:invokestatic    #189 <Method TsPayloadReader TsExtractor.access$402(TsExtractor, TsPayloadReader)>
	//  101  220:pop             
			TsExtractor.access$400(TsExtractor.this).init(timestampadjuster, TsExtractor.access$600(TsExtractor.this), new dGenerator(j2, 21, 8192));
	//  102  221:aload_0         
	//  103  222:getfield        #36  <Field TsExtractor this$0>
	//  104  225:invokestatic    #175 <Method TsPayloadReader TsExtractor.access$400(TsExtractor)>
	//  105  228:aload           9
	//  106  230:aload_0         
	//  107  231:getfield        #36  <Field TsExtractor this$0>
	//  108  234:invokestatic    #193 <Method ExtractorOutput TsExtractor.access$600(TsExtractor)>
	//  109  237:new             #195 <Class TsPayloadReader$TrackIdGenerator>
	//  110  240:dup             
	//  111  241:iload           7
	//  112  243:bipush          21
	//  113  245:sipush          8192
	//  114  248:invokespecial   #198 <Method void TsPayloadReader$TrackIdGenerator(int, int, int)>
	//  115  251:invokeinterface #204 <Method void TsPayloadReader.init(TimestampAdjuster, ExtractorOutput, TsPayloadReader$TrackIdGenerator)>
		}
		trackIdToReaderScratch.clear();
	//  116  256:aload_0         
	//  117  257:getfield        #51  <Field SparseArray trackIdToReaderScratch>
	//  118  260:invokevirtual   #207 <Method void SparseArray.clear()>
		trackIdToPidScratch.clear();
	//  119  263:aload_0         
	//  120  264:getfield        #56  <Field SparseIntArray trackIdToPidScratch>
	//  121  267:invokevirtual   #208 <Method void SparseIntArray.clear()>
		int i2;
		for(int i1 = parsablebytearray.bytesLeft(); i1 > 0; i1 = i2)
	//* 122  270:aload_1         
	//* 123  271:invokevirtual   #211 <Method int ParsableByteArray.bytesLeft()>
	//* 124  274:istore_3        
	//* 125  275:iload_3         
	//* 126  276:ifle            505
		{
			parsablebytearray.readBytes(pmtScratch, 5);
	//  127  279:aload_1         
	//  128  280:aload_0         
	//  129  281:getfield        #46  <Field ParsableBitArray pmtScratch>
	//  130  284:iconst_5        
	//  131  285:invokevirtual   #164 <Method void ParsableByteArray.readBytes(ParsableBitArray, int)>
			i2 = pmtScratch.readBits(8);
	//  132  288:aload_0         
	//  133  289:getfield        #46  <Field ParsableBitArray pmtScratch>
	//  134  292:bipush          8
	//  135  294:invokevirtual   #171 <Method int ParsableBitArray.readBits(int)>
	//  136  297:istore          6
			pmtScratch.skipBits(3);
	//  137  299:aload_0         
	//  138  300:getfield        #46  <Field ParsableBitArray pmtScratch>
	//  139  303:iconst_3        
	//  140  304:invokevirtual   #167 <Method void ParsableBitArray.skipBits(int)>
			int k1 = pmtScratch.readBits(13);
	//  141  307:aload_0         
	//  142  308:getfield        #46  <Field ParsableBitArray pmtScratch>
	//  143  311:bipush          13
	//  144  313:invokevirtual   #171 <Method int ParsableBitArray.readBits(int)>
	//  145  316:istore          5
			pmtScratch.skipBits(4);
	//  146  318:aload_0         
	//  147  319:getfield        #46  <Field ParsableBitArray pmtScratch>
	//  148  322:iconst_4        
	//  149  323:invokevirtual   #167 <Method void ParsableBitArray.skipBits(int)>
			int k2 = pmtScratch.readBits(12);
	//  150  326:aload_0         
	//  151  327:getfield        #46  <Field ParsableBitArray pmtScratch>
	//  152  330:bipush          12
	//  153  332:invokevirtual   #171 <Method int ParsableBitArray.readBits(int)>
	//  154  335:istore          8
			Object obj = ((Object) (readEsInfo(parsablebytearray, k2)));
	//  155  337:aload_0         
	//  156  338:aload_1         
	//  157  339:iload           8
	//  158  341:invokespecial   #213 <Method TsPayloadReader$EsInfo readEsInfo(ParsableByteArray, int)>
	//  159  344:astore          10
			int j = i2;
	//  160  346:iload           6
	//  161  348:istore_2        
			if(i2 == 6)
	//* 162  349:iload           6
	//* 163  351:bipush          6
	//* 164  353:icmpne          362
				j = (() (obj)).streamType;
	//  165  356:aload           10
	//  166  358:getfield        #216 <Field int TsPayloadReader$EsInfo.streamType>
	//  167  361:istore_2        
			i2 = i1 - (k2 + 5);
	//  168  362:iload_3         
	//  169  363:iload           8
	//  170  365:iconst_5        
	//  171  366:iadd            
	//  172  367:isub            
	//  173  368:istore          6
			if(TsExtractor.access$200(TsExtractor.this) == 2)
	//* 174  370:aload_0         
	//* 175  371:getfield        #36  <Field TsExtractor this$0>
	//* 176  374:invokestatic    #139 <Method int TsExtractor.access$200(TsExtractor)>
	//* 177  377:iconst_2        
	//* 178  378:icmpne          386
				i1 = j;
	//  179  381:iload_2         
	//  180  382:istore_3        
			else
	//* 181  383:goto            389
				i1 = k1;
	//  182  386:iload           5
	//  183  388:istore_3        
			if(TsExtractor.access$700(TsExtractor.this).get(i1))
	//* 184  389:aload_0         
	//* 185  390:getfield        #36  <Field TsExtractor this$0>
	//* 186  393:invokestatic    #220 <Method SparseBooleanArray TsExtractor.access$700(TsExtractor)>
	//* 187  396:iload_3         
	//* 188  397:invokevirtual   #225 <Method boolean SparseBooleanArray.get(int)>
	//* 189  400:ifeq            406
				continue;
	//  190  403:goto            499
			if(TsExtractor.access$200(TsExtractor.this) == 2 && j == 21)
	//* 191  406:aload_0         
	//* 192  407:getfield        #36  <Field TsExtractor this$0>
	//* 193  410:invokestatic    #139 <Method int TsExtractor.access$200(TsExtractor)>
	//* 194  413:iconst_2        
	//* 195  414:icmpne          435
	//* 196  417:iload_2         
	//* 197  418:bipush          21
	//* 198  420:icmpne          435
				obj = ((Object) (TsExtractor.access$400(TsExtractor.this)));
	//  199  423:aload_0         
	//  200  424:getfield        #36  <Field TsExtractor this$0>
	//  201  427:invokestatic    #175 <Method TsPayloadReader TsExtractor.access$400(TsExtractor)>
	//  202  430:astore          10
			else
	//* 203  432:goto            452
				obj = ((Object) (TsExtractor.access$500(TsExtractor.this).createPayloadReader(j, (() (obj)))));
	//  204  435:aload_0         
	//  205  436:getfield        #36  <Field TsExtractor this$0>
	//  206  439:invokestatic    #179 <Method TsPayloadReader$Factory TsExtractor.access$500(TsExtractor)>
	//  207  442:iload_2         
	//  208  443:aload           10
	//  209  445:invokeinterface #185 <Method TsPayloadReader TsPayloadReader$Factory.createPayloadReader(int, TsPayloadReader$EsInfo)>
	//  210  450:astore          10
			if(TsExtractor.access$200(TsExtractor.this) != 2 || k1 < trackIdToPidScratch.get(i1, 8192))
	//* 211  452:aload_0         
	//* 212  453:getfield        #36  <Field TsExtractor this$0>
	//* 213  456:invokestatic    #139 <Method int TsExtractor.access$200(TsExtractor)>
	//* 214  459:iconst_2        
	//* 215  460:icmpne          479
	//* 216  463:iload           5
	//* 217  465:aload_0         
	//* 218  466:getfield        #56  <Field SparseIntArray trackIdToPidScratch>
	//* 219  469:iload_3         
	//* 220  470:sipush          8192
	//* 221  473:invokevirtual   #228 <Method int SparseIntArray.get(int, int)>
	//* 222  476:icmpge          499
			{
				trackIdToPidScratch.put(i1, k1);
	//  223  479:aload_0         
	//  224  480:getfield        #56  <Field SparseIntArray trackIdToPidScratch>
	//  225  483:iload_3         
	//  226  484:iload           5
	//  227  486:invokevirtual   #232 <Method void SparseIntArray.put(int, int)>
				trackIdToReaderScratch.put(i1, obj);
	//  228  489:aload_0         
	//  229  490:getfield        #51  <Field SparseArray trackIdToReaderScratch>
	//  230  493:iload_3         
	//  231  494:aload           10
	//  232  496:invokevirtual   #235 <Method void SparseArray.put(int, Object)>
			}
		}

	//  233  499:iload           6
	//  234  501:istore_3        
	//* 235  502:goto            275
		int j1 = trackIdToPidScratch.size();
	//  236  505:aload_0         
	//  237  506:getfield        #56  <Field SparseIntArray trackIdToPidScratch>
	//  238  509:invokevirtual   #238 <Method int SparseIntArray.size()>
	//  239  512:istore_3        
		for(int k = 0; k < j1; k++)
	//* 240  513:iconst_0        
	//* 241  514:istore_2        
	//* 242  515:iload_2         
	//* 243  516:iload_3         
	//* 244  517:icmpge          625
		{
			int l1 = trackIdToPidScratch.keyAt(k);
	//  245  520:aload_0         
	//  246  521:getfield        #56  <Field SparseIntArray trackIdToPidScratch>
	//  247  524:iload_2         
	//  248  525:invokevirtual   #241 <Method int SparseIntArray.keyAt(int)>
	//  249  528:istore          5
			TsExtractor.access$700(TsExtractor.this).put(l1, true);
	//  250  530:aload_0         
	//  251  531:getfield        #36  <Field TsExtractor this$0>
	//  252  534:invokestatic    #220 <Method SparseBooleanArray TsExtractor.access$700(TsExtractor)>
	//  253  537:iload           5
	//  254  539:iconst_1        
	//  255  540:invokevirtual   #244 <Method void SparseBooleanArray.put(int, boolean)>
			parsablebytearray = ((ParsableByteArray) ((TsPayloadReader)trackIdToReaderScratch.valueAt(k)));
	//  256  543:aload_0         
	//  257  544:getfield        #51  <Field SparseArray trackIdToReaderScratch>
	//  258  547:iload_2         
	//  259  548:invokevirtual   #247 <Method Object SparseArray.valueAt(int)>
	//  260  551:checkcast       #200 <Class TsPayloadReader>
	//  261  554:astore_1        
			if(parsablebytearray == null)
				continue;
	//  262  555:aload_1         
	//  263  556:ifnull          618
			if(parsablebytearray != TsExtractor.access$400(TsExtractor.this))
	//* 264  559:aload_1         
	//* 265  560:aload_0         
	//* 266  561:getfield        #36  <Field TsExtractor this$0>
	//* 267  564:invokestatic    #175 <Method TsPayloadReader TsExtractor.access$400(TsExtractor)>
	//* 268  567:if_acmpeq       599
				((TsPayloadReader) (parsablebytearray)).init(timestampadjuster, TsExtractor.access$600(TsExtractor.this), new dGenerator(j2, l1, 8192));
	//  269  570:aload_1         
	//  270  571:aload           9
	//  271  573:aload_0         
	//  272  574:getfield        #36  <Field TsExtractor this$0>
	//  273  577:invokestatic    #193 <Method ExtractorOutput TsExtractor.access$600(TsExtractor)>
	//  274  580:new             #195 <Class TsPayloadReader$TrackIdGenerator>
	//  275  583:dup             
	//  276  584:iload           7
	//  277  586:iload           5
	//  278  588:sipush          8192
	//  279  591:invokespecial   #198 <Method void TsPayloadReader$TrackIdGenerator(int, int, int)>
	//  280  594:invokeinterface #204 <Method void TsPayloadReader.init(TimestampAdjuster, ExtractorOutput, TsPayloadReader$TrackIdGenerator)>
			TsExtractor.access$000(TsExtractor.this).put(trackIdToPidScratch.valueAt(k), ((Object) (parsablebytearray)));
	//  281  599:aload_0         
	//  282  600:getfield        #36  <Field TsExtractor this$0>
	//  283  603:invokestatic    #251 <Method SparseArray TsExtractor.access$000(TsExtractor)>
	//  284  606:aload_0         
	//  285  607:getfield        #56  <Field SparseIntArray trackIdToPidScratch>
	//  286  610:iload_2         
	//  287  611:invokevirtual   #253 <Method int SparseIntArray.valueAt(int)>
	//  288  614:aload_1         
	//  289  615:invokevirtual   #235 <Method void SparseArray.put(int, Object)>
		}

	//  290  618:iload_2         
	//  291  619:iconst_1        
	//  292  620:iadd            
	//  293  621:istore_2        
	//* 294  622:goto            515
		if(TsExtractor.access$200(TsExtractor.this) == 2)
	//* 295  625:aload_0         
	//* 296  626:getfield        #36  <Field TsExtractor this$0>
	//* 297  629:invokestatic    #139 <Method int TsExtractor.access$200(TsExtractor)>
	//* 298  632:iconst_2        
	//* 299  633:icmpne          677
		{
			if(!TsExtractor.access$800(TsExtractor.this))
	//* 300  636:aload_0         
	//* 301  637:getfield        #36  <Field TsExtractor this$0>
	//* 302  640:invokestatic    #257 <Method boolean TsExtractor.access$800(TsExtractor)>
	//* 303  643:ifne            760
			{
				TsExtractor.access$600(TsExtractor.this).endTracks();
	//  304  646:aload_0         
	//  305  647:getfield        #36  <Field TsExtractor this$0>
	//  306  650:invokestatic    #193 <Method ExtractorOutput TsExtractor.access$600(TsExtractor)>
	//  307  653:invokeinterface #262 <Method void ExtractorOutput.endTracks()>
				TsExtractor.access$102(TsExtractor.this, 0);
	//  308  658:aload_0         
	//  309  659:getfield        #36  <Field TsExtractor this$0>
	//  310  662:iconst_0        
	//  311  663:invokestatic    #266 <Method int TsExtractor.access$102(TsExtractor, int)>
	//  312  666:pop             
				TsExtractor.access$802(TsExtractor.this, true);
	//  313  667:aload_0         
	//  314  668:getfield        #36  <Field TsExtractor this$0>
	//  315  671:iconst_1        
	//  316  672:invokestatic    #270 <Method boolean TsExtractor.access$802(TsExtractor, boolean)>
	//  317  675:pop             
				return;
	//  318  676:return          
			}
		} else
		{
			TsExtractor.access$000(TsExtractor.this).remove(pid);
	//  319  677:aload_0         
	//  320  678:getfield        #36  <Field TsExtractor this$0>
	//  321  681:invokestatic    #251 <Method SparseArray TsExtractor.access$000(TsExtractor)>
	//  322  684:aload_0         
	//  323  685:getfield        #58  <Field int pid>
	//  324  688:invokevirtual   #273 <Method void SparseArray.remove(int)>
			parsablebytearray = ((ParsableByteArray) (TsExtractor.this));
	//  325  691:aload_0         
	//  326  692:getfield        #36  <Field TsExtractor this$0>
	//  327  695:astore_1        
			int l;
			if(TsExtractor.access$200(TsExtractor.this) == 1)
	//* 328  696:aload_0         
	//* 329  697:getfield        #36  <Field TsExtractor this$0>
	//* 330  700:invokestatic    #139 <Method int TsExtractor.access$200(TsExtractor)>
	//* 331  703:iconst_1        
	//* 332  704:icmpne          713
				l = ((int) (flag));
	//  333  707:iload           4
	//  334  709:istore_2        
			else
	//* 335  710:goto            723
				l = TsExtractor.access$100(TsExtractor.this) - 1;
	//  336  713:aload_0         
	//  337  714:getfield        #36  <Field TsExtractor this$0>
	//  338  717:invokestatic    #142 <Method int TsExtractor.access$100(TsExtractor)>
	//  339  720:iconst_1        
	//  340  721:isub            
	//  341  722:istore_2        
			TsExtractor.access$102(((TsExtractor) (parsablebytearray)), l);
	//  342  723:aload_1         
	//  343  724:iload_2         
	//  344  725:invokestatic    #266 <Method int TsExtractor.access$102(TsExtractor, int)>
	//  345  728:pop             
			if(TsExtractor.access$100(TsExtractor.this) == 0)
	//* 346  729:aload_0         
	//* 347  730:getfield        #36  <Field TsExtractor this$0>
	//* 348  733:invokestatic    #142 <Method int TsExtractor.access$100(TsExtractor)>
	//* 349  736:ifne            760
			{
				TsExtractor.access$600(TsExtractor.this).endTracks();
	//  350  739:aload_0         
	//  351  740:getfield        #36  <Field TsExtractor this$0>
	//  352  743:invokestatic    #193 <Method ExtractorOutput TsExtractor.access$600(TsExtractor)>
	//  353  746:invokeinterface #262 <Method void ExtractorOutput.endTracks()>
				TsExtractor.access$802(TsExtractor.this, true);
	//  354  751:aload_0         
	//  355  752:getfield        #36  <Field TsExtractor this$0>
	//  356  755:iconst_1        
	//  357  756:invokestatic    #270 <Method boolean TsExtractor.access$802(TsExtractor, boolean)>
	//  358  759:pop             
			}
		}
	//  359  760:return          
	}

	public void init(TimestampAdjuster timestampadjuster, ExtractorOutput extractoroutput, dGenerator dgenerator)
	{
	//    0    0:return          
	}

	private static final int TS_PMT_DESC_AC3 = 106;
	private static final int TS_PMT_DESC_DTS = 123;
	private static final int TS_PMT_DESC_DVBSUBS = 89;
	private static final int TS_PMT_DESC_EAC3 = 122;
	private static final int TS_PMT_DESC_ISO639_LANG = 10;
	private static final int TS_PMT_DESC_REGISTRATION = 5;
	private final int pid;
	private final ParsableBitArray pmtScratch = new ParsableBitArray(new byte[5]);
	final TsExtractor this$0;
	private final SparseIntArray trackIdToPidScratch = new SparseIntArray();
	private final SparseArray trackIdToReaderScratch = new SparseArray();

	public TsExtractor$PmtReader(int i)
	{
		this$0 = TsExtractor.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field TsExtractor this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #39  <Method void Object()>
	//    5    9:aload_0         
	//    6   10:new             #41  <Class ParsableBitArray>
	//    7   13:dup             
	//    8   14:iconst_5        
	//    9   15:newarray        byte[]
	//   10   17:invokespecial   #44  <Method void ParsableBitArray(byte[])>
	//   11   20:putfield        #46  <Field ParsableBitArray pmtScratch>
	//   12   23:aload_0         
	//   13   24:new             #48  <Class SparseArray>
	//   14   27:dup             
	//   15   28:invokespecial   #49  <Method void SparseArray()>
	//   16   31:putfield        #51  <Field SparseArray trackIdToReaderScratch>
	//   17   34:aload_0         
	//   18   35:new             #53  <Class SparseIntArray>
	//   19   38:dup             
	//   20   39:invokespecial   #54  <Method void SparseIntArray()>
	//   21   42:putfield        #56  <Field SparseIntArray trackIdToPidScratch>
		pid = i;
	//   22   45:aload_0         
	//   23   46:iload_2         
	//   24   47:putfield        #58  <Field int pid>
	//   25   50:return          
	}
}
