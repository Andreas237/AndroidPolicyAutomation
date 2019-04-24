// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ts;

import android.util.*;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.*;
import com.google.android.exoplayer2.util.*;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.extractor.ts:
//			DefaultTsPayloadReaderFactory, SectionReader, TsPayloadReader, SectionPayloadReader

public final class TsExtractor
	implements Extractor
{
	public static interface Mode
		extends Annotation
	{
	}

	private class PmtReader
		implements SectionPayloadReader
	{

		private TsPayloadReader.EsInfo readEsInfo(ParsableByteArray parsablebytearray, int i)
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
									if(l1 != TsExtractor.AC3_FORMAT_IDENTIFIER)
		//*  34   60:lload           7
		//*  35   62:invokestatic    #77  <Method long TsExtractor.access$900()>
		//*  36   65:lcmp            
		//*  37   66:ifne            72
		//*  38   69:goto            122
									{
										if(l1 != TsExtractor.E_AC3_FORMAT_IDENTIFIER)
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
											if(l1 == TsExtractor.HEVC_FORMAT_IDENTIFIER)
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
							for(; parsablebytearray.getPosition() < l; ((List) (obj2)).add(((Object) (new DvbSubtitleInfo(((String) (obj)), i, ((byte []) (obj1)))))))
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
			return new EsInfo(i, s, ((List) (obj)), Arrays.copyOfRange(parsablebytearray.data, j, k));
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
			int i = mode;
		//    5    9:aload_0         
		//    6   10:getfield        #36  <Field TsExtractor this$0>
		//    7   13:invokestatic    #139 <Method int TsExtractor.access$200(TsExtractor)>
		//    8   16:istore_2        
			boolean flag = false;
		//    9   17:iconst_0        
		//   10   18:istore          4
			TimestampAdjuster timestampadjuster;
			if(i != 1 && mode != 2 && remainingPmts != 1)
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
				timestampadjuster = new TimestampAdjuster(((TimestampAdjuster)timestampAdjusters.get(0)).getFirstSampleTimestampUs());
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
				timestampAdjusters.add(((Object) (timestampadjuster)));
		//   36   78:aload_0         
		//   37   79:getfield        #36  <Field TsExtractor this$0>
		//   38   82:invokestatic    #148 <Method List TsExtractor.access$300(TsExtractor)>
		//   39   85:aload           9
		//   40   87:invokeinterface #111 <Method boolean List.add(Object)>
		//   41   92:pop             
			} else
		//*  42   93:goto            114
			{
				timestampadjuster = (TimestampAdjuster)timestampAdjusters.get(0);
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
			if(mode == 2 && id3Reader == null)
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
				TsPayloadReader.EsInfo esinfo = new EsInfo(21, ((String) (null)), ((List) (null)), new byte[0]);
		//   83  181:new             #120 <Class TsPayloadReader$EsInfo>
		//   84  184:dup             
		//   85  185:bipush          21
		//   86  187:aconst_null     
		//   87  188:aconst_null     
		//   88  189:iconst_0        
		//   89  190:newarray        byte[]
		//   90  192:invokespecial   #133 <Method void TsPayloadReader$EsInfo(int, String, List, byte[])>
		//   91  195:astore          10
				id3Reader = payloadReaderFactory.createPayloadReader(21, esinfo);
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
				id3Reader.init(timestampadjuster, output, new TrackIdGenerator(j2, 21, 8192));
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
					j = ((TsPayloadReader.EsInfo) (obj)).streamType;
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
				if(mode == 2)
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
				if(trackIds.get(i1))
		//* 184  389:aload_0         
		//* 185  390:getfield        #36  <Field TsExtractor this$0>
		//* 186  393:invokestatic    #220 <Method SparseBooleanArray TsExtractor.access$700(TsExtractor)>
		//* 187  396:iload_3         
		//* 188  397:invokevirtual   #225 <Method boolean SparseBooleanArray.get(int)>
		//* 189  400:ifeq            406
					continue;
		//  190  403:goto            499
				if(mode == 2 && j == 21)
		//* 191  406:aload_0         
		//* 192  407:getfield        #36  <Field TsExtractor this$0>
		//* 193  410:invokestatic    #139 <Method int TsExtractor.access$200(TsExtractor)>
		//* 194  413:iconst_2        
		//* 195  414:icmpne          435
		//* 196  417:iload_2         
		//* 197  418:bipush          21
		//* 198  420:icmpne          435
					obj = ((Object) (id3Reader));
		//  199  423:aload_0         
		//  200  424:getfield        #36  <Field TsExtractor this$0>
		//  201  427:invokestatic    #175 <Method TsPayloadReader TsExtractor.access$400(TsExtractor)>
		//  202  430:astore          10
				else
		//* 203  432:goto            452
					obj = ((Object) (payloadReaderFactory.createPayloadReader(j, ((TsPayloadReader.EsInfo) (obj)))));
		//  204  435:aload_0         
		//  205  436:getfield        #36  <Field TsExtractor this$0>
		//  206  439:invokestatic    #179 <Method TsPayloadReader$Factory TsExtractor.access$500(TsExtractor)>
		//  207  442:iload_2         
		//  208  443:aload           10
		//  209  445:invokeinterface #185 <Method TsPayloadReader TsPayloadReader$Factory.createPayloadReader(int, TsPayloadReader$EsInfo)>
		//  210  450:astore          10
				if(mode != 2 || k1 < trackIdToPidScratch.get(i1, 8192))
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
				trackIds.put(l1, true);
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
				if(parsablebytearray != id3Reader)
		//* 264  559:aload_1         
		//* 265  560:aload_0         
		//* 266  561:getfield        #36  <Field TsExtractor this$0>
		//* 267  564:invokestatic    #175 <Method TsPayloadReader TsExtractor.access$400(TsExtractor)>
		//* 268  567:if_acmpeq       599
					((TsPayloadReader) (parsablebytearray)).init(timestampadjuster, output, new TrackIdGenerator(j2, l1, 8192));
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
				tsPayloadReaders.put(trackIdToPidScratch.valueAt(k), ((Object) (parsablebytearray)));
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
			if(mode == 2)
		//* 295  625:aload_0         
		//* 296  626:getfield        #36  <Field TsExtractor this$0>
		//* 297  629:invokestatic    #139 <Method int TsExtractor.access$200(TsExtractor)>
		//* 298  632:iconst_2        
		//* 299  633:icmpne          677
			{
				if(!tracksEnded)
		//* 300  636:aload_0         
		//* 301  637:getfield        #36  <Field TsExtractor this$0>
		//* 302  640:invokestatic    #257 <Method boolean TsExtractor.access$800(TsExtractor)>
		//* 303  643:ifne            760
				{
					output.endTracks();
		//  304  646:aload_0         
		//  305  647:getfield        #36  <Field TsExtractor this$0>
		//  306  650:invokestatic    #193 <Method ExtractorOutput TsExtractor.access$600(TsExtractor)>
		//  307  653:invokeinterface #262 <Method void ExtractorOutput.endTracks()>
					remainingPmts = 0;
		//  308  658:aload_0         
		//  309  659:getfield        #36  <Field TsExtractor this$0>
		//  310  662:iconst_0        
		//  311  663:invokestatic    #266 <Method int TsExtractor.access$102(TsExtractor, int)>
		//  312  666:pop             
					tracksEnded = true;
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
				tsPayloadReaders.remove(pid);
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
				if(mode == 1)
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
					l = remainingPmts - 1;
		//  336  713:aload_0         
		//  337  714:getfield        #36  <Field TsExtractor this$0>
		//  338  717:invokestatic    #142 <Method int TsExtractor.access$100(TsExtractor)>
		//  339  720:iconst_1        
		//  340  721:isub            
		//  341  722:istore_2        
				parsablebytearray.remainingPmts = l;
		//  342  723:aload_1         
		//  343  724:iload_2         
		//  344  725:invokestatic    #266 <Method int TsExtractor.access$102(TsExtractor, int)>
		//  345  728:pop             
				if(remainingPmts == 0)
		//* 346  729:aload_0         
		//* 347  730:getfield        #36  <Field TsExtractor this$0>
		//* 348  733:invokestatic    #142 <Method int TsExtractor.access$100(TsExtractor)>
		//* 349  736:ifne            760
				{
					output.endTracks();
		//  350  739:aload_0         
		//  351  740:getfield        #36  <Field TsExtractor this$0>
		//  352  743:invokestatic    #193 <Method ExtractorOutput TsExtractor.access$600(TsExtractor)>
		//  353  746:invokeinterface #262 <Method void ExtractorOutput.endTracks()>
					tracksEnded = true;
		//  354  751:aload_0         
		//  355  752:getfield        #36  <Field TsExtractor this$0>
		//  356  755:iconst_1        
		//  357  756:invokestatic    #270 <Method boolean TsExtractor.access$802(TsExtractor, boolean)>
		//  358  759:pop             
				}
			}
		//  359  760:return          
		}

		public void init(TimestampAdjuster timestampadjuster, ExtractorOutput extractoroutput, TsPayloadReader.TrackIdGenerator trackidgenerator)
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

		public PmtReader(int i)
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


	public TsExtractor()
	{
		TsExtractor(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #120 <Method void TsExtractor(int)>
	//    3    5:return          
	}

	public TsExtractor(int i)
	{
		TsExtractor(1, i);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iload_1         
	//    3    3:invokespecial   #123 <Method void TsExtractor(int, int)>
	//    4    6:return          
	}

	public TsExtractor(int i, int j)
	{
		TsExtractor(i, new TimestampAdjuster(0L), ((TsPayloadReader.Factory) (new DefaultTsPayloadReaderFactory(j))));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:new             #125 <Class TimestampAdjuster>
	//    3    5:dup             
	//    4    6:lconst_0        
	//    5    7:invokespecial   #128 <Method void TimestampAdjuster(long)>
	//    6   10:new             #130 <Class DefaultTsPayloadReaderFactory>
	//    7   13:dup             
	//    8   14:iload_2         
	//    9   15:invokespecial   #131 <Method void DefaultTsPayloadReaderFactory(int)>
	//   10   18:invokespecial   #134 <Method void TsExtractor(int, TimestampAdjuster, TsPayloadReader$Factory)>
	//   11   21:return          
	}

	public TsExtractor(int i, TimestampAdjuster timestampadjuster, TsPayloadReader.Factory factory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #135 <Method void Object()>
		payloadReaderFactory = (TsPayloadReader.Factory)Assertions.checkNotNull(((Object) (factory)));
	//    2    4:aload_0         
	//    3    5:aload_3         
	//    4    6:invokestatic    #141 <Method Object Assertions.checkNotNull(Object)>
	//    5    9:checkcast       #143 <Class TsPayloadReader$Factory>
	//    6   12:putfield        #145 <Field TsPayloadReader$Factory payloadReaderFactory>
		mode = i;
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:putfield        #147 <Field int mode>
		if(i != 1 && i != 2)
	//*  10   20:iload_1         
	//*  11   21:iconst_1        
	//*  12   22:icmpeq          58
	//*  13   25:iload_1         
	//*  14   26:iconst_2        
	//*  15   27:icmpne          33
	//*  16   30:goto            58
		{
			timestampAdjusters = ((List) (new ArrayList()));
	//   17   33:aload_0         
	//   18   34:new             #149 <Class ArrayList>
	//   19   37:dup             
	//   20   38:invokespecial   #150 <Method void ArrayList()>
	//   21   41:putfield        #152 <Field List timestampAdjusters>
			timestampAdjusters.add(((Object) (timestampadjuster)));
	//   22   44:aload_0         
	//   23   45:getfield        #152 <Field List timestampAdjusters>
	//   24   48:aload_2         
	//   25   49:invokeinterface #158 <Method boolean List.add(Object)>
	//   26   54:pop             
		} else
	//*  27   55:goto            66
		{
			timestampAdjusters = Collections.singletonList(((Object) (timestampadjuster)));
	//   28   58:aload_0         
	//   29   59:aload_2         
	//   30   60:invokestatic    #164 <Method List Collections.singletonList(Object)>
	//   31   63:putfield        #152 <Field List timestampAdjusters>
		}
		tsPacketBuffer = new ParsableByteArray(new byte[9400], 0);
	//   32   66:aload_0         
	//   33   67:new             #166 <Class ParsableByteArray>
	//   34   70:dup             
	//   35   71:sipush          9400
	//   36   74:newarray        byte[]
	//   37   76:iconst_0        
	//   38   77:invokespecial   #169 <Method void ParsableByteArray(byte[], int)>
	//   39   80:putfield        #171 <Field ParsableByteArray tsPacketBuffer>
		trackIds = new SparseBooleanArray();
	//   40   83:aload_0         
	//   41   84:new             #173 <Class SparseBooleanArray>
	//   42   87:dup             
	//   43   88:invokespecial   #174 <Method void SparseBooleanArray()>
	//   44   91:putfield        #176 <Field SparseBooleanArray trackIds>
		tsPayloadReaders = new SparseArray();
	//   45   94:aload_0         
	//   46   95:new             #178 <Class SparseArray>
	//   47   98:dup             
	//   48   99:invokespecial   #179 <Method void SparseArray()>
	//   49  102:putfield        #181 <Field SparseArray tsPayloadReaders>
		continuityCounters = new SparseIntArray();
	//   50  105:aload_0         
	//   51  106:new             #183 <Class SparseIntArray>
	//   52  109:dup             
	//   53  110:invokespecial   #184 <Method void SparseIntArray()>
	//   54  113:putfield        #186 <Field SparseIntArray continuityCounters>
		resetPayloadReaders();
	//   55  116:aload_0         
	//   56  117:invokespecial   #189 <Method void resetPayloadReaders()>
	//   57  120:return          
	}

	private void resetPayloadReaders()
	{
		trackIds.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #176 <Field SparseBooleanArray trackIds>
	//    2    4:invokevirtual   #228 <Method void SparseBooleanArray.clear()>
		tsPayloadReaders.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #181 <Field SparseArray tsPayloadReaders>
	//    5   11:invokevirtual   #229 <Method void SparseArray.clear()>
		SparseArray sparsearray = payloadReaderFactory.createInitialPayloadReaders();
	//    6   14:aload_0         
	//    7   15:getfield        #145 <Field TsPayloadReader$Factory payloadReaderFactory>
	//    8   18:invokeinterface #233 <Method SparseArray TsPayloadReader$Factory.createInitialPayloadReaders()>
	//    9   23:astore_3        
		int j = sparsearray.size();
	//   10   24:aload_3         
	//   11   25:invokevirtual   #237 <Method int SparseArray.size()>
	//   12   28:istore_2        
		for(int i = 0; i < j; i++)
	//*  13   29:iconst_0        
	//*  14   30:istore_1        
	//*  15   31:iload_1         
	//*  16   32:iload_2         
	//*  17   33:icmpge          60
			tsPayloadReaders.put(sparsearray.keyAt(i), sparsearray.valueAt(i));
	//   18   36:aload_0         
	//   19   37:getfield        #181 <Field SparseArray tsPayloadReaders>
	//   20   40:aload_3         
	//   21   41:iload_1         
	//   22   42:invokevirtual   #241 <Method int SparseArray.keyAt(int)>
	//   23   45:aload_3         
	//   24   46:iload_1         
	//   25   47:invokevirtual   #245 <Method Object SparseArray.valueAt(int)>
	//   26   50:invokevirtual   #249 <Method void SparseArray.put(int, Object)>

	//   27   53:iload_1         
	//   28   54:iconst_1        
	//   29   55:iadd            
	//   30   56:istore_1        
	//*  31   57:goto            31
		tsPayloadReaders.put(0, ((Object) (new SectionReader(((SectionPayloadReader) (new ((PatReader)this).PatReader()))))));
	//   32   60:aload_0         
	//   33   61:getfield        #181 <Field SparseArray tsPayloadReaders>
	//   34   64:iconst_0        
	//   35   65:new             #251 <Class SectionReader>
	//   36   68:dup             
	//   37   69:new             #13  <Class TsExtractor$PatReader>
	//   38   72:dup             
	//   39   73:aload_0         
	//   40   74:invokespecial   #254 <Method void TsExtractor$PatReader(TsExtractor)>
	//   41   77:invokespecial   #257 <Method void SectionReader(SectionPayloadReader)>
	//   42   80:invokevirtual   #249 <Method void SparseArray.put(int, Object)>
		id3Reader = null;
	//   43   83:aload_0         
	//   44   84:aconst_null     
	//   45   85:putfield        #208 <Field TsPayloadReader id3Reader>
	//   46   88:return          
	}

	public void init(ExtractorOutput extractoroutput)
	{
		output = extractoroutput;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #216 <Field ExtractorOutput output>
		extractoroutput.seekMap(((com.google.android.exoplayer2.extractor.SeekMap) (new Unseekable(0x1L))));
	//    3    5:aload_1         
	//    4    6:new             #261 <Class com.google.android.exoplayer2.extractor.SeekMap$Unseekable>
	//    5    9:dup             
	//    6   10:ldc2w           #262 <Long 0x1L>
	//    7   13:invokespecial   #264 <Method void com.google.android.exoplayer2.extractor.SeekMap$Unseekable(long)>
	//    8   16:invokeinterface #270 <Method void ExtractorOutput.seekMap(com.google.android.exoplayer2.extractor.SeekMap)>
	//    9   21:return          
	}

	public int read(ExtractorInput extractorinput, PositionHolder positionholder)
		throws IOException, InterruptedException
	{
		positionholder = ((PositionHolder) (tsPacketBuffer.data));
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field ParsableByteArray tsPacketBuffer>
	//    2    4:getfield        #280 <Field byte[] ParsableByteArray.data>
	//    3    7:astore_2        
		if(9400 - tsPacketBuffer.getPosition() < 188)
	//*   4    8:sipush          9400
	//*   5   11:aload_0         
	//*   6   12:getfield        #171 <Field ParsableByteArray tsPacketBuffer>
	//*   7   15:invokevirtual   #283 <Method int ParsableByteArray.getPosition()>
	//*   8   18:isub            
	//*   9   19:sipush          188
	//*  10   22:icmpge          60
		{
			int i = tsPacketBuffer.bytesLeft();
	//   11   25:aload_0         
	//   12   26:getfield        #171 <Field ParsableByteArray tsPacketBuffer>
	//   13   29:invokevirtual   #286 <Method int ParsableByteArray.bytesLeft()>
	//   14   32:istore_3        
			if(i > 0)
	//*  15   33:iload_3         
	//*  16   34:ifle            51
				System.arraycopy(((Object) (positionholder)), tsPacketBuffer.getPosition(), ((Object) (positionholder)), 0, i);
	//   17   37:aload_2         
	//   18   38:aload_0         
	//   19   39:getfield        #171 <Field ParsableByteArray tsPacketBuffer>
	//   20   42:invokevirtual   #283 <Method int ParsableByteArray.getPosition()>
	//   21   45:aload_2         
	//   22   46:iconst_0        
	//   23   47:iload_3         
	//   24   48:invokestatic    #292 <Method void System.arraycopy(Object, int, Object, int, int)>
			tsPacketBuffer.reset(((byte []) (positionholder)), i);
	//   25   51:aload_0         
	//   26   52:getfield        #171 <Field ParsableByteArray tsPacketBuffer>
	//   27   55:aload_2         
	//   28   56:iload_3         
	//   29   57:invokevirtual   #295 <Method void ParsableByteArray.reset(byte[], int)>
		}
		int j;
		int i1;
		for(; tsPacketBuffer.bytesLeft() < 188; tsPacketBuffer.setLimit(j + i1))
	//*  30   60:aload_0         
	//*  31   61:getfield        #171 <Field ParsableByteArray tsPacketBuffer>
	//*  32   64:invokevirtual   #286 <Method int ParsableByteArray.bytesLeft()>
	//*  33   67:sipush          188
	//*  34   70:icmpge          118
		{
			j = tsPacketBuffer.limit();
	//   35   73:aload_0         
	//   36   74:getfield        #171 <Field ParsableByteArray tsPacketBuffer>
	//   37   77:invokevirtual   #298 <Method int ParsableByteArray.limit()>
	//   38   80:istore_3        
			i1 = extractorinput.read(((byte []) (positionholder)), j, 9400 - j);
	//   39   81:aload_1         
	//   40   82:aload_2         
	//   41   83:iload_3         
	//   42   84:sipush          9400
	//   43   87:iload_3         
	//   44   88:isub            
	//   45   89:invokeinterface #303 <Method int ExtractorInput.read(byte[], int, int)>
	//   46   94:istore          4
			if(i1 == -1)
	//*  47   96:iload           4
	//*  48   98:iconst_m1       
	//*  49   99:icmpne          104
				return -1;
	//   50  102:iconst_m1       
	//   51  103:ireturn         
		}

	//   52  104:aload_0         
	//   53  105:getfield        #171 <Field ParsableByteArray tsPacketBuffer>
	//   54  108:iload_3         
	//   55  109:iload           4
	//   56  111:iadd            
	//   57  112:invokevirtual   #306 <Method void ParsableByteArray.setLimit(int)>
	//*  58  115:goto            60
		int l1 = tsPacketBuffer.limit();
	//   59  118:aload_0         
	//   60  119:getfield        #171 <Field ParsableByteArray tsPacketBuffer>
	//   61  122:invokevirtual   #298 <Method int ParsableByteArray.limit()>
	//   62  125:istore          5
		int j1 = tsPacketBuffer.getPosition();
	//   63  127:aload_0         
	//   64  128:getfield        #171 <Field ParsableByteArray tsPacketBuffer>
	//   65  131:invokevirtual   #283 <Method int ParsableByteArray.getPosition()>
	//   66  134:istore          4
		int k;
		for(k = j1; k < l1 && positionholder[k] != 71; k++);
	//   67  136:iload           4
	//   68  138:istore_3        
	//   69  139:iload_3         
	//   70  140:iload           5
	//   71  142:icmpge          160
	//   72  145:aload_2         
	//   73  146:iload_3         
	//   74  147:baload          
	//   75  148:bipush          71
	//   76  150:icmpeq          160
	//   77  153:iload_3         
	//   78  154:iconst_1        
	//   79  155:iadd            
	//   80  156:istore_3        
	//*  81  157:goto            139
		tsPacketBuffer.setPosition(k);
	//   82  160:aload_0         
	//   83  161:getfield        #171 <Field ParsableByteArray tsPacketBuffer>
	//   84  164:iload_3         
	//   85  165:invokevirtual   #309 <Method void ParsableByteArray.setPosition(int)>
		int i2 = k + 188;
	//   86  168:iload_3         
	//   87  169:sipush          188
	//   88  172:iadd            
	//   89  173:istore          6
		if(i2 > l1)
	//*  90  175:iload           6
	//*  91  177:iload           5
	//*  92  179:icmple          226
		{
			bytesSinceLastSync = bytesSinceLastSync + (k - j1);
	//   93  182:aload_0         
	//   94  183:aload_0         
	//   95  184:getfield        #311 <Field int bytesSinceLastSync>
	//   96  187:iload_3         
	//   97  188:iload           4
	//   98  190:isub            
	//   99  191:iadd            
	//  100  192:putfield        #311 <Field int bytesSinceLastSync>
			if(mode == 2 && bytesSinceLastSync > 376)
	//* 101  195:aload_0         
	//* 102  196:getfield        #147 <Field int mode>
	//* 103  199:iconst_2        
	//* 104  200:icmpne          224
	//* 105  203:aload_0         
	//* 106  204:getfield        #311 <Field int bytesSinceLastSync>
	//* 107  207:sipush          376
	//* 108  210:icmple          224
				throw new ParserException("Cannot find sync byte. Most likely not a Transport Stream.");
	//  109  213:new             #313 <Class ParserException>
	//  110  216:dup             
	//  111  217:ldc2            #315 <String "Cannot find sync byte. Most likely not a Transport Stream.">
	//  112  220:invokespecial   #318 <Method void ParserException(String)>
	//  113  223:athrow          
			else
				return 0;
	//  114  224:iconst_0        
	//  115  225:ireturn         
		}
		bytesSinceLastSync = 0;
	//  116  226:aload_0         
	//  117  227:iconst_0        
	//  118  228:putfield        #311 <Field int bytesSinceLastSync>
		int k2 = tsPacketBuffer.readInt();
	//  119  231:aload_0         
	//  120  232:getfield        #171 <Field ParsableByteArray tsPacketBuffer>
	//  121  235:invokevirtual   #321 <Method int ParsableByteArray.readInt()>
	//  122  238:istore          8
		if((0x800000 & k2) != 0)
	//* 123  240:ldc2            #322 <Int 0x800000>
	//* 124  243:iload           8
	//* 125  245:iand            
	//* 126  246:ifeq            260
		{
			tsPacketBuffer.setPosition(i2);
	//  127  249:aload_0         
	//  128  250:getfield        #171 <Field ParsableByteArray tsPacketBuffer>
	//  129  253:iload           6
	//  130  255:invokevirtual   #309 <Method void ParsableByteArray.setPosition(int)>
			return 0;
	//  131  258:iconst_0        
	//  132  259:ireturn         
		}
		boolean flag2;
		if((0x400000 & k2) != 0)
	//* 133  260:ldc2            #323 <Int 0x400000>
	//* 134  263:iload           8
	//* 135  265:iand            
	//* 136  266:ifeq            275
			flag2 = true;
	//  137  269:iconst_1        
	//  138  270:istore          9
		else
	//* 139  272:goto            278
			flag2 = false;
	//  140  275:iconst_0        
	//  141  276:istore          9
		int j2 = (0x1fff00 & k2) >> 8;
	//  142  278:ldc2            #324 <Int 0x1fff00>
	//  143  281:iload           8
	//  144  283:iand            
	//  145  284:bipush          8
	//  146  286:ishr            
	//  147  287:istore          7
		boolean flag;
		if((k2 & 0x20) != 0)
	//* 148  289:iload           8
	//* 149  291:bipush          32
	//* 150  293:iand            
	//* 151  294:ifeq            302
			flag = true;
	//  152  297:iconst_1        
	//  153  298:istore_3        
		else
	//* 154  299:goto            304
			flag = false;
	//  155  302:iconst_0        
	//  156  303:istore_3        
		boolean flag1;
		if((k2 & 0x10) != 0)
	//* 157  304:iload           8
	//* 158  306:bipush          16
	//* 159  308:iand            
	//* 160  309:ifeq            318
			flag1 = true;
	//  161  312:iconst_1        
	//  162  313:istore          4
		else
	//* 163  315:goto            321
			flag1 = false;
	//  164  318:iconst_0        
	//  165  319:istore          4
		if(flag1)
	//* 166  321:iload           4
	//* 167  323:ifeq            342
			extractorinput = ((ExtractorInput) ((TsPayloadReader)tsPayloadReaders.get(j2)));
	//  168  326:aload_0         
	//  169  327:getfield        #181 <Field SparseArray tsPayloadReaders>
	//  170  330:iload           7
	//  171  332:invokevirtual   #327 <Method Object SparseArray.get(int)>
	//  172  335:checkcast       #329 <Class TsPayloadReader>
	//  173  338:astore_1        
		else
	//* 174  339:goto            344
			extractorinput = null;
	//  175  342:aconst_null     
	//  176  343:astore_1        
		if(extractorinput == null)
	//* 177  344:aload_1         
	//* 178  345:ifnonnull       359
		{
			tsPacketBuffer.setPosition(i2);
	//  179  348:aload_0         
	//  180  349:getfield        #171 <Field ParsableByteArray tsPacketBuffer>
	//  181  352:iload           6
	//  182  354:invokevirtual   #309 <Method void ParsableByteArray.setPosition(int)>
			return 0;
	//  183  357:iconst_0        
	//  184  358:ireturn         
		}
		if(mode != 2)
	//* 185  359:aload_0         
	//* 186  360:getfield        #147 <Field int mode>
	//* 187  363:iconst_2        
	//* 188  364:icmpeq          436
		{
			int k1 = k2 & 0xf;
	//  189  367:iload           8
	//  190  369:bipush          15
	//  191  371:iand            
	//  192  372:istore          4
			k2 = continuityCounters.get(j2, k1 - 1);
	//  193  374:aload_0         
	//  194  375:getfield        #186 <Field SparseIntArray continuityCounters>
	//  195  378:iload           7
	//  196  380:iload           4
	//  197  382:iconst_1        
	//  198  383:isub            
	//  199  384:invokevirtual   #332 <Method int SparseIntArray.get(int, int)>
	//  200  387:istore          8
			continuityCounters.put(j2, k1);
	//  201  389:aload_0         
	//  202  390:getfield        #186 <Field SparseIntArray continuityCounters>
	//  203  393:iload           7
	//  204  395:iload           4
	//  205  397:invokevirtual   #334 <Method void SparseIntArray.put(int, int)>
			if(k2 == k1)
	//* 206  400:iload           8
	//* 207  402:iload           4
	//* 208  404:icmpne          418
			{
				tsPacketBuffer.setPosition(i2);
	//  209  407:aload_0         
	//  210  408:getfield        #171 <Field ParsableByteArray tsPacketBuffer>
	//  211  411:iload           6
	//  212  413:invokevirtual   #309 <Method void ParsableByteArray.setPosition(int)>
				return 0;
	//  213  416:iconst_0        
	//  214  417:ireturn         
			}
			if(k1 != (k2 + 1 & 0xf))
	//* 215  418:iload           4
	//* 216  420:iload           8
	//* 217  422:iconst_1        
	//* 218  423:iadd            
	//* 219  424:bipush          15
	//* 220  426:iand            
	//* 221  427:icmpeq          436
				((TsPayloadReader) (extractorinput)).seek();
	//  222  430:aload_1         
	//  223  431:invokeinterface #337 <Method void TsPayloadReader.seek()>
		}
		if(flag)
	//* 224  436:iload_3         
	//* 225  437:ifeq            456
		{
			int l = tsPacketBuffer.readUnsignedByte();
	//  226  440:aload_0         
	//  227  441:getfield        #171 <Field ParsableByteArray tsPacketBuffer>
	//  228  444:invokevirtual   #340 <Method int ParsableByteArray.readUnsignedByte()>
	//  229  447:istore_3        
			tsPacketBuffer.skipBytes(l);
	//  230  448:aload_0         
	//  231  449:getfield        #171 <Field ParsableByteArray tsPacketBuffer>
	//  232  452:iload_3         
	//  233  453:invokevirtual   #343 <Method void ParsableByteArray.skipBytes(int)>
		}
		tsPacketBuffer.setLimit(i2);
	//  234  456:aload_0         
	//  235  457:getfield        #171 <Field ParsableByteArray tsPacketBuffer>
	//  236  460:iload           6
	//  237  462:invokevirtual   #306 <Method void ParsableByteArray.setLimit(int)>
		((TsPayloadReader) (extractorinput)).consume(tsPacketBuffer, flag2);
	//  238  465:aload_1         
	//  239  466:aload_0         
	//  240  467:getfield        #171 <Field ParsableByteArray tsPacketBuffer>
	//  241  470:iload           9
	//  242  472:invokeinterface #347 <Method void TsPayloadReader.consume(ParsableByteArray, boolean)>
		tsPacketBuffer.setLimit(l1);
	//  243  477:aload_0         
	//  244  478:getfield        #171 <Field ParsableByteArray tsPacketBuffer>
	//  245  481:iload           5
	//  246  483:invokevirtual   #306 <Method void ParsableByteArray.setLimit(int)>
		tsPacketBuffer.setPosition(i2);
	//  247  486:aload_0         
	//  248  487:getfield        #171 <Field ParsableByteArray tsPacketBuffer>
	//  249  490:iload           6
	//  250  492:invokevirtual   #309 <Method void ParsableByteArray.setPosition(int)>
		return 0;
	//  251  495:iconst_0        
	//  252  496:ireturn         
	}

	public void release()
	{
	//    0    0:return          
	}

	public void seek(long l, long l1)
	{
		int j = timestampAdjusters.size();
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field List timestampAdjusters>
	//    2    4:invokeinterface #351 <Method int List.size()>
	//    3    9:istore          6
		for(int i = 0; i < j; i++)
	//*   4   11:iconst_0        
	//*   5   12:istore          5
	//*   6   14:iload           5
	//*   7   16:iload           6
	//*   8   18:icmpge          47
			((TimestampAdjuster)timestampAdjusters.get(i)).reset();
	//    9   21:aload_0         
	//   10   22:getfield        #152 <Field List timestampAdjusters>
	//   11   25:iload           5
	//   12   27:invokeinterface #352 <Method Object List.get(int)>
	//   13   32:checkcast       #125 <Class TimestampAdjuster>
	//   14   35:invokevirtual   #354 <Method void TimestampAdjuster.reset()>

	//   15   38:iload           5
	//   16   40:iconst_1        
	//   17   41:iadd            
	//   18   42:istore          5
	//*  19   44:goto            14
		tsPacketBuffer.reset();
	//   20   47:aload_0         
	//   21   48:getfield        #171 <Field ParsableByteArray tsPacketBuffer>
	//   22   51:invokevirtual   #355 <Method void ParsableByteArray.reset()>
		continuityCounters.clear();
	//   23   54:aload_0         
	//   24   55:getfield        #186 <Field SparseIntArray continuityCounters>
	//   25   58:invokevirtual   #356 <Method void SparseIntArray.clear()>
		resetPayloadReaders();
	//   26   61:aload_0         
	//   27   62:invokespecial   #189 <Method void resetPayloadReaders()>
		bytesSinceLastSync = 0;
	//   28   65:aload_0         
	//   29   66:iconst_0        
	//   30   67:putfield        #311 <Field int bytesSinceLastSync>
	//   31   70:return          
	}

	public boolean sniff(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		byte abyte0[] = tsPacketBuffer.data;
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field ParsableByteArray tsPacketBuffer>
	//    2    4:getfield        #280 <Field byte[] ParsableByteArray.data>
	//    3    7:astore          4
		extractorinput.peekFully(abyte0, 0, 940);
	//    4    9:aload_1         
	//    5   10:aload           4
	//    6   12:iconst_0        
	//    7   13:sipush          940
	//    8   16:invokeinterface #362 <Method void ExtractorInput.peekFully(byte[], int, int)>
		int i = 0;
	//    9   21:iconst_0        
	//   10   22:istore_2        
label0:
		do
		{
			if(i < 188)
	//*  11   23:iload_2         
	//*  12   24:sipush          188
	//*  13   27:icmpge          75
			{
				int j = 0;
	//   14   30:iconst_0        
	//   15   31:istore_3        
				do
				{
					if(j == 5)
	//*  16   32:iload_3         
	//*  17   33:iconst_5        
	//*  18   34:icmpne          46
					{
						extractorinput.skipFully(i);
	//   19   37:aload_1         
	//   20   38:iload_2         
	//   21   39:invokeinterface #365 <Method void ExtractorInput.skipFully(int)>
						return true;
	//   22   44:iconst_1        
	//   23   45:ireturn         
					}
					if(abyte0[j * 188 + i] != 71)
	//*  24   46:aload           4
	//*  25   48:iload_3         
	//*  26   49:sipush          188
	//*  27   52:imul            
	//*  28   53:iload_2         
	//*  29   54:iadd            
	//*  30   55:baload          
	//*  31   56:bipush          71
	//*  32   58:icmpeq          68
					{
						i++;
	//   33   61:iload_2         
	//   34   62:iconst_1        
	//   35   63:iadd            
	//   36   64:istore_2        
						continue label0;
	//   37   65:goto            23
					}
					j++;
	//   38   68:iload_3         
	//   39   69:iconst_1        
	//   40   70:iadd            
	//   41   71:istore_3        
				} while(true);
	//   42   72:goto            32
			}
			return false;
	//   43   75:iconst_0        
	//   44   76:ireturn         
		} while(true);
	}

	private static final long AC3_FORMAT_IDENTIFIER = (long)Util.getIntegerCodeForString("AC-3");
	private static final int BUFFER_SIZE = 9400;
	private static final long E_AC3_FORMAT_IDENTIFIER = (long)Util.getIntegerCodeForString("EAC3");
	public static final ExtractorsFactory FACTORY = new ExtractorsFactory() {

		public Extractor[] createExtractors()
		{
			return (new Extractor[] {
				new TsExtractor()
			});
		//    0    0:iconst_1        
		//    1    1:anewarray       Extractor[]
		//    2    4:dup             
		//    3    5:iconst_0        
		//    4    6:new             #8   <Class TsExtractor>
		//    5    9:dup             
		//    6   10:invokespecial   #18  <Method void TsExtractor()>
		//    7   13:aastore         
		//    8   14:areturn         
		}

	}
;
	private static final long HEVC_FORMAT_IDENTIFIER = (long)Util.getIntegerCodeForString("HEVC");
	private static final int MAX_PID_PLUS_ONE = 8192;
	public static final int MODE_HLS = 2;
	public static final int MODE_MULTI_PMT = 0;
	public static final int MODE_SINGLE_PMT = 1;
	private static final int SNIFF_TS_PACKET_COUNT = 5;
	private static final int TS_PACKET_SIZE = 188;
	private static final int TS_PAT_PID = 0;
	public static final int TS_STREAM_TYPE_AAC_ADTS = 15;
	public static final int TS_STREAM_TYPE_AAC_LATM = 17;
	public static final int TS_STREAM_TYPE_AC3 = 129;
	public static final int TS_STREAM_TYPE_DTS = 138;
	public static final int TS_STREAM_TYPE_DVBSUBS = 89;
	public static final int TS_STREAM_TYPE_E_AC3 = 135;
	public static final int TS_STREAM_TYPE_H262 = 2;
	public static final int TS_STREAM_TYPE_H264 = 27;
	public static final int TS_STREAM_TYPE_H265 = 36;
	public static final int TS_STREAM_TYPE_HDMV_DTS = 130;
	public static final int TS_STREAM_TYPE_ID3 = 21;
	public static final int TS_STREAM_TYPE_MPA = 3;
	public static final int TS_STREAM_TYPE_MPA_LSF = 4;
	public static final int TS_STREAM_TYPE_SPLICE_INFO = 134;
	private static final int TS_SYNC_BYTE = 71;
	private int bytesSinceLastSync;
	private final SparseIntArray continuityCounters;
	private TsPayloadReader id3Reader;
	private final int mode;
	private ExtractorOutput output;
	private final TsPayloadReader.Factory payloadReaderFactory;
	private int remainingPmts;
	private final List timestampAdjusters;
	private final SparseBooleanArray trackIds;
	private boolean tracksEnded;
	private final ParsableByteArray tsPacketBuffer;
	private final SparseArray tsPayloadReaders;

	static 
	{
	//    0    0:new             #8   <Class TsExtractor$1>
	//    1    3:dup             
	//    2    4:invokespecial   #96  <Method void TsExtractor$1()>
	//    3    7:putstatic       #98  <Field ExtractorsFactory FACTORY>
	//    4   10:ldc1            #100 <String "AC-3">
	//    5   12:invokestatic    #106 <Method int Util.getIntegerCodeForString(String)>
	//    6   15:i2l             
	//    7   16:putstatic       #108 <Field long AC3_FORMAT_IDENTIFIER>
	//    8   19:ldc1            #110 <String "EAC3">
	//    9   21:invokestatic    #106 <Method int Util.getIntegerCodeForString(String)>
	//   10   24:i2l             
	//   11   25:putstatic       #112 <Field long E_AC3_FORMAT_IDENTIFIER>
	//   12   28:ldc1            #114 <String "HEVC">
	//   13   30:invokestatic    #106 <Method int Util.getIntegerCodeForString(String)>
	//   14   33:i2l             
	//   15   34:putstatic       #116 <Field long HEVC_FORMAT_IDENTIFIER>
	//*  16   37:return          
	}


/*
	static SparseArray access$000(TsExtractor tsextractor)
	{
		return tsextractor.tsPayloadReaders;
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field SparseArray tsPayloadReaders>
	//    2    4:areturn         
	}

*/


/*
	static int access$100(TsExtractor tsextractor)
	{
		return tsextractor.remainingPmts;
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field int remainingPmts>
	//    2    4:ireturn         
	}

*/


/*
	static long access$1000()
	{
		return E_AC3_FORMAT_IDENTIFIER;
	//    0    0:getstatic       #112 <Field long E_AC3_FORMAT_IDENTIFIER>
	//    1    3:lreturn         
	}

*/


/*
	static int access$102(TsExtractor tsextractor, int i)
	{
		tsextractor.remainingPmts = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #195 <Field int remainingPmts>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static int access$108(TsExtractor tsextractor)
	{
		int i = tsextractor.remainingPmts;
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field int remainingPmts>
	//    2    4:istore_1        
		tsextractor.remainingPmts = i + 1;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iconst_1        
	//    6    8:iadd            
	//    7    9:putfield        #195 <Field int remainingPmts>
		return i;
	//    8   12:iload_1         
	//    9   13:ireturn         
	}

*/


/*
	static long access$1100()
	{
		return HEVC_FORMAT_IDENTIFIER;
	//    0    0:getstatic       #116 <Field long HEVC_FORMAT_IDENTIFIER>
	//    1    3:lreturn         
	}

*/


/*
	static int access$200(TsExtractor tsextractor)
	{
		return tsextractor.mode;
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field int mode>
	//    2    4:ireturn         
	}

*/


/*
	static List access$300(TsExtractor tsextractor)
	{
		return tsextractor.timestampAdjusters;
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field List timestampAdjusters>
	//    2    4:areturn         
	}

*/


/*
	static TsPayloadReader access$400(TsExtractor tsextractor)
	{
		return tsextractor.id3Reader;
	//    0    0:aload_0         
	//    1    1:getfield        #208 <Field TsPayloadReader id3Reader>
	//    2    4:areturn         
	}

*/


/*
	static TsPayloadReader access$402(TsExtractor tsextractor, TsPayloadReader tspayloadreader)
	{
		tsextractor.id3Reader = tspayloadreader;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #208 <Field TsPayloadReader id3Reader>
		return tspayloadreader;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static TsPayloadReader.Factory access$500(TsExtractor tsextractor)
	{
		return tsextractor.payloadReaderFactory;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field TsPayloadReader$Factory payloadReaderFactory>
	//    2    4:areturn         
	}

*/


/*
	static ExtractorOutput access$600(TsExtractor tsextractor)
	{
		return tsextractor.output;
	//    0    0:aload_0         
	//    1    1:getfield        #216 <Field ExtractorOutput output>
	//    2    4:areturn         
	}

*/


/*
	static SparseBooleanArray access$700(TsExtractor tsextractor)
	{
		return tsextractor.trackIds;
	//    0    0:aload_0         
	//    1    1:getfield        #176 <Field SparseBooleanArray trackIds>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$800(TsExtractor tsextractor)
	{
		return tsextractor.tracksEnded;
	//    0    0:aload_0         
	//    1    1:getfield        #222 <Field boolean tracksEnded>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$802(TsExtractor tsextractor, boolean flag)
	{
		tsextractor.tracksEnded = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #222 <Field boolean tracksEnded>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static long access$900()
	{
		return AC3_FORMAT_IDENTIFIER;
	//    0    0:getstatic       #108 <Field long AC3_FORMAT_IDENTIFIER>
	//    1    3:lreturn         
	}

*/
}
