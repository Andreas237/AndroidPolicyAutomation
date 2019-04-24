// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.*;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.extractor.ts:
//			ElementaryStreamReader, NalUnitTargetBuffer, SeiReader

public final class H264Reader
	implements ElementaryStreamReader
{
	private static final class SampleReader
	{

		private void outputSample(int i)
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #90  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #92  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #97  <Method void Runtime(String)>
		//    4    9:athrow          
		}

		public void appendToNalUnit(byte abyte0[], int i, int j)
		{
			int k1;
			int l1;
			int i2;
			int j2;
			boolean flag;
			boolean flag1;
			boolean flag2;
			com.google.android.exoplayer2.util.NalUnitUtil.SpsData spsdata;
label0:
			{
				if(!isFilling)
		//*   0    0:aload_0         
		//*   1    1:getfield        #100 <Field boolean isFilling>
		//*   2    4:ifne            8
					return;
		//    3    7:return          
				j -= i;
		//    4    8:iload_3         
		//    5    9:iload_2         
		//    6   10:isub            
		//    7   11:istore_3        
				if(buffer.length < bufferLength + j)
		//*   8   12:aload_0         
		//*   9   13:getfield        #75  <Field byte[] buffer>
		//*  10   16:arraylength     
		//*  11   17:aload_0         
		//*  12   18:getfield        #102 <Field int bufferLength>
		//*  13   21:iload_3         
		//*  14   22:iadd            
		//*  15   23:icmpge          45
					buffer = Arrays.copyOf(buffer, (bufferLength + j) * 2);
		//   16   26:aload_0         
		//   17   27:aload_0         
		//   18   28:getfield        #75  <Field byte[] buffer>
		//   19   31:aload_0         
		//   20   32:getfield        #102 <Field int bufferLength>
		//   21   35:iload_3         
		//   22   36:iadd            
		//   23   37:iconst_2        
		//   24   38:imul            
		//   25   39:invokestatic    #108 <Method byte[] Arrays.copyOf(byte[], int)>
		//   26   42:putfield        #75  <Field byte[] buffer>
				System.arraycopy(((Object) (abyte0)), i, ((Object) (buffer)), bufferLength, j);
		//   27   45:aload_1         
		//   28   46:iload_2         
		//   29   47:aload_0         
		//   30   48:getfield        #75  <Field byte[] buffer>
		//   31   51:aload_0         
		//   32   52:getfield        #102 <Field int bufferLength>
		//   33   55:iload_3         
		//   34   56:invokestatic    #114 <Method void System.arraycopy(Object, int, Object, int, int)>
				bufferLength = bufferLength + j;
		//   35   59:aload_0         
		//   36   60:aload_0         
		//   37   61:getfield        #102 <Field int bufferLength>
		//   38   64:iload_3         
		//   39   65:iadd            
		//   40   66:putfield        #102 <Field int bufferLength>
				bitArray.reset(buffer, 0, bufferLength);
		//   41   69:aload_0         
		//   42   70:getfield        #82  <Field ParsableNalUnitBitArray bitArray>
		//   43   73:aload_0         
		//   44   74:getfield        #75  <Field byte[] buffer>
		//   45   77:iconst_0        
		//   46   78:aload_0         
		//   47   79:getfield        #102 <Field int bufferLength>
		//   48   82:invokevirtual   #116 <Method void ParsableNalUnitBitArray.reset(byte[], int, int)>
				if(!bitArray.canReadBits(8))
		//*  49   85:aload_0         
		//*  50   86:getfield        #82  <Field ParsableNalUnitBitArray bitArray>
		//*  51   89:bipush          8
		//*  52   91:invokevirtual   #120 <Method boolean ParsableNalUnitBitArray.canReadBits(int)>
		//*  53   94:ifne            98
					return;
		//   54   97:return          
				bitArray.skipBit();
		//   55   98:aload_0         
		//   56   99:getfield        #82  <Field ParsableNalUnitBitArray bitArray>
		//   57  102:invokevirtual   #123 <Method void ParsableNalUnitBitArray.skipBit()>
				k1 = bitArray.readBits(2);
		//   58  105:aload_0         
		//   59  106:getfield        #82  <Field ParsableNalUnitBitArray bitArray>
		//   60  109:iconst_2        
		//   61  110:invokevirtual   #127 <Method int ParsableNalUnitBitArray.readBits(int)>
		//   62  113:istore          8
				bitArray.skipBits(5);
		//   63  115:aload_0         
		//   64  116:getfield        #82  <Field ParsableNalUnitBitArray bitArray>
		//   65  119:iconst_5        
		//   66  120:invokevirtual   #130 <Method void ParsableNalUnitBitArray.skipBits(int)>
				if(!bitArray.canReadExpGolombCodedNum())
		//*  67  123:aload_0         
		//*  68  124:getfield        #82  <Field ParsableNalUnitBitArray bitArray>
		//*  69  127:invokevirtual   #134 <Method boolean ParsableNalUnitBitArray.canReadExpGolombCodedNum()>
		//*  70  130:ifne            134
					return;
		//   71  133:return          
				bitArray.readUnsignedExpGolombCodedInt();
		//   72  134:aload_0         
		//   73  135:getfield        #82  <Field ParsableNalUnitBitArray bitArray>
		//   74  138:invokevirtual   #138 <Method int ParsableNalUnitBitArray.readUnsignedExpGolombCodedInt()>
		//   75  141:pop             
				if(!bitArray.canReadExpGolombCodedNum())
		//*  76  142:aload_0         
		//*  77  143:getfield        #82  <Field ParsableNalUnitBitArray bitArray>
		//*  78  146:invokevirtual   #134 <Method boolean ParsableNalUnitBitArray.canReadExpGolombCodedNum()>
		//*  79  149:ifne            153
					return;
		//   80  152:return          
				l1 = bitArray.readUnsignedExpGolombCodedInt();
		//   81  153:aload_0         
		//   82  154:getfield        #82  <Field ParsableNalUnitBitArray bitArray>
		//   83  157:invokevirtual   #138 <Method int ParsableNalUnitBitArray.readUnsignedExpGolombCodedInt()>
		//   84  160:istore          9
				if(!detectAccessUnits)
		//*  85  162:aload_0         
		//*  86  163:getfield        #59  <Field boolean detectAccessUnits>
		//*  87  166:ifne            184
				{
					isFilling = false;
		//   88  169:aload_0         
		//   89  170:iconst_0        
		//   90  171:putfield        #100 <Field boolean isFilling>
					sliceHeader.setSliceType(l1);
		//   91  174:aload_0         
		//   92  175:getfield        #73  <Field H264Reader$SampleReader$SliceHeaderData sliceHeader>
		//   93  178:iload           9
		//   94  180:invokevirtual   #141 <Method void H264Reader$SampleReader$SliceHeaderData.setSliceType(int)>
					return;
		//   95  183:return          
				}
				if(!bitArray.canReadExpGolombCodedNum())
		//*  96  184:aload_0         
		//*  97  185:getfield        #82  <Field ParsableNalUnitBitArray bitArray>
		//*  98  188:invokevirtual   #134 <Method boolean ParsableNalUnitBitArray.canReadExpGolombCodedNum()>
		//*  99  191:ifne            195
					return;
		//  100  194:return          
				i2 = bitArray.readUnsignedExpGolombCodedInt();
		//  101  195:aload_0         
		//  102  196:getfield        #82  <Field ParsableNalUnitBitArray bitArray>
		//  103  199:invokevirtual   #138 <Method int ParsableNalUnitBitArray.readUnsignedExpGolombCodedInt()>
		//  104  202:istore          10
				if(pps.indexOfKey(i2) < 0)
		//* 105  204:aload_0         
		//* 106  205:getfield        #66  <Field SparseArray pps>
		//* 107  208:iload           10
		//* 108  210:invokevirtual   #144 <Method int SparseArray.indexOfKey(int)>
		//* 109  213:ifge            222
				{
					isFilling = false;
		//  110  216:aload_0         
		//  111  217:iconst_0        
		//  112  218:putfield        #100 <Field boolean isFilling>
					return;
		//  113  221:return          
				}
				abyte0 = ((byte []) ((com.google.android.exoplayer2.util.NalUnitUtil.PpsData)pps.get(i2)));
		//  114  222:aload_0         
		//  115  223:getfield        #66  <Field SparseArray pps>
		//  116  226:iload           10
		//  117  228:invokevirtual   #148 <Method Object SparseArray.get(int)>
		//  118  231:checkcast       #150 <Class com.google.android.exoplayer2.util.NalUnitUtil$PpsData>
		//  119  234:astore_1        
				spsdata = (com.google.android.exoplayer2.util.NalUnitUtil.SpsData)sps.get(((com.google.android.exoplayer2.util.NalUnitUtil.PpsData) (abyte0)).seqParameterSetId);
		//  120  235:aload_0         
		//  121  236:getfield        #64  <Field SparseArray sps>
		//  122  239:aload_1         
		//  123  240:getfield        #153 <Field int com.google.android.exoplayer2.util.NalUnitUtil$PpsData.seqParameterSetId>
		//  124  243:invokevirtual   #148 <Method Object SparseArray.get(int)>
		//  125  246:checkcast       #155 <Class com.google.android.exoplayer2.util.NalUnitUtil$SpsData>
		//  126  249:astore          16
				if(spsdata.separateColorPlaneFlag)
		//* 127  251:aload           16
		//* 128  253:getfield        #158 <Field boolean com.google.android.exoplayer2.util.NalUnitUtil$SpsData.separateColorPlaneFlag>
		//* 129  256:ifeq            279
				{
					if(!bitArray.canReadBits(2))
		//* 130  259:aload_0         
		//* 131  260:getfield        #82  <Field ParsableNalUnitBitArray bitArray>
		//* 132  263:iconst_2        
		//* 133  264:invokevirtual   #120 <Method boolean ParsableNalUnitBitArray.canReadBits(int)>
		//* 134  267:ifne            271
						return;
		//  135  270:return          
					bitArray.skipBits(2);
		//  136  271:aload_0         
		//  137  272:getfield        #82  <Field ParsableNalUnitBitArray bitArray>
		//  138  275:iconst_2        
		//  139  276:invokevirtual   #130 <Method void ParsableNalUnitBitArray.skipBits(int)>
				}
				if(!bitArray.canReadBits(spsdata.frameNumLength))
		//* 140  279:aload_0         
		//* 141  280:getfield        #82  <Field ParsableNalUnitBitArray bitArray>
		//* 142  283:aload           16
		//* 143  285:getfield        #161 <Field int com.google.android.exoplayer2.util.NalUnitUtil$SpsData.frameNumLength>
		//* 144  288:invokevirtual   #120 <Method boolean ParsableNalUnitBitArray.canReadBits(int)>
		//* 145  291:ifne            295
					return;
		//  146  294:return          
				j2 = bitArray.readBits(spsdata.frameNumLength);
		//  147  295:aload_0         
		//  148  296:getfield        #82  <Field ParsableNalUnitBitArray bitArray>
		//  149  299:aload           16
		//  150  301:getfield        #161 <Field int com.google.android.exoplayer2.util.NalUnitUtil$SpsData.frameNumLength>
		//  151  304:invokevirtual   #127 <Method int ParsableNalUnitBitArray.readBits(int)>
		//  152  307:istore          11
				if(!spsdata.frameMbsOnlyFlag)
		//* 153  309:aload           16
		//* 154  311:getfield        #164 <Field boolean com.google.android.exoplayer2.util.NalUnitUtil$SpsData.frameMbsOnlyFlag>
		//* 155  314:ifne            373
				{
					if(!bitArray.canReadBits(1))
		//* 156  317:aload_0         
		//* 157  318:getfield        #82  <Field ParsableNalUnitBitArray bitArray>
		//* 158  321:iconst_1        
		//* 159  322:invokevirtual   #120 <Method boolean ParsableNalUnitBitArray.canReadBits(int)>
		//* 160  325:ifne            329
						return;
		//  161  328:return          
					flag = bitArray.readBit();
		//  162  329:aload_0         
		//  163  330:getfield        #82  <Field ParsableNalUnitBitArray bitArray>
		//  164  333:invokevirtual   #167 <Method boolean ParsableNalUnitBitArray.readBit()>
		//  165  336:istore          12
					if(flag)
		//* 166  338:iload           12
		//* 167  340:ifeq            370
					{
						if(!bitArray.canReadBits(1))
		//* 168  343:aload_0         
		//* 169  344:getfield        #82  <Field ParsableNalUnitBitArray bitArray>
		//* 170  347:iconst_1        
		//* 171  348:invokevirtual   #120 <Method boolean ParsableNalUnitBitArray.canReadBits(int)>
		//* 172  351:ifne            355
							return;
		//  173  354:return          
						flag2 = bitArray.readBit();
		//  174  355:aload_0         
		//  175  356:getfield        #82  <Field ParsableNalUnitBitArray bitArray>
		//  176  359:invokevirtual   #167 <Method boolean ParsableNalUnitBitArray.readBit()>
		//  177  362:istore          14
						flag1 = true;
		//  178  364:iconst_1        
		//  179  365:istore          13
						break label0;
		//  180  367:goto            382
					}
				} else
		//* 181  370:goto            376
				{
					flag = false;
		//  182  373:iconst_0        
		//  183  374:istore          12
				}
				flag1 = false;
		//  184  376:iconst_0        
		//  185  377:istore          13
				flag2 = false;
		//  186  379:iconst_0        
		//  187  380:istore          14
			}
			int k;
			int l;
			int i1;
			int j1;
			boolean flag3;
label1:
			{
label2:
				{
					if(nalUnitType == 5)
		//* 188  382:aload_0         
		//* 189  383:getfield        #169 <Field int nalUnitType>
		//* 190  386:iconst_5        
		//* 191  387:icmpne          396
						flag3 = true;
		//  192  390:iconst_1        
		//  193  391:istore          15
					else
		//* 194  393:goto            399
						flag3 = false;
		//  195  396:iconst_0        
		//  196  397:istore          15
					if(flag3)
		//* 197  399:iload           15
		//* 198  401:ifeq            427
					{
						if(!bitArray.canReadExpGolombCodedNum())
		//* 199  404:aload_0         
		//* 200  405:getfield        #82  <Field ParsableNalUnitBitArray bitArray>
		//* 201  408:invokevirtual   #134 <Method boolean ParsableNalUnitBitArray.canReadExpGolombCodedNum()>
		//* 202  411:ifne            415
							return;
		//  203  414:return          
						j1 = bitArray.readUnsignedExpGolombCodedInt();
		//  204  415:aload_0         
		//  205  416:getfield        #82  <Field ParsableNalUnitBitArray bitArray>
		//  206  419:invokevirtual   #138 <Method int ParsableNalUnitBitArray.readUnsignedExpGolombCodedInt()>
		//  207  422:istore          7
					} else
		//* 208  424:goto            430
					{
						j1 = 0;
		//  209  427:iconst_0        
		//  210  428:istore          7
					}
					if(spsdata.picOrderCountType == 0)
		//* 211  430:aload           16
		//* 212  432:getfield        #172 <Field int com.google.android.exoplayer2.util.NalUnitUtil$SpsData.picOrderCountType>
		//* 213  435:ifne            507
					{
						if(!bitArray.canReadBits(spsdata.picOrderCntLsbLength))
		//* 214  438:aload_0         
		//* 215  439:getfield        #82  <Field ParsableNalUnitBitArray bitArray>
		//* 216  442:aload           16
		//* 217  444:getfield        #175 <Field int com.google.android.exoplayer2.util.NalUnitUtil$SpsData.picOrderCntLsbLength>
		//* 218  447:invokevirtual   #120 <Method boolean ParsableNalUnitBitArray.canReadBits(int)>
		//* 219  450:ifne            454
							return;
		//  220  453:return          
						j = bitArray.readBits(spsdata.picOrderCntLsbLength);
		//  221  454:aload_0         
		//  222  455:getfield        #82  <Field ParsableNalUnitBitArray bitArray>
		//  223  458:aload           16
		//  224  460:getfield        #175 <Field int com.google.android.exoplayer2.util.NalUnitUtil$SpsData.picOrderCntLsbLength>
		//  225  463:invokevirtual   #127 <Method int ParsableNalUnitBitArray.readBits(int)>
		//  226  466:istore_3        
						if(((com.google.android.exoplayer2.util.NalUnitUtil.PpsData) (abyte0)).bottomFieldPicOrderInFramePresentFlag && !flag)
		//* 227  467:aload_1         
		//* 228  468:getfield        #178 <Field boolean com.google.android.exoplayer2.util.NalUnitUtil$PpsData.bottomFieldPicOrderInFramePresentFlag>
		//* 229  471:ifeq            504
		//* 230  474:iload           12
		//* 231  476:ifne            504
						{
							if(!bitArray.canReadExpGolombCodedNum())
		//* 232  479:aload_0         
		//* 233  480:getfield        #82  <Field ParsableNalUnitBitArray bitArray>
		//* 234  483:invokevirtual   #134 <Method boolean ParsableNalUnitBitArray.canReadExpGolombCodedNum()>
		//* 235  486:ifne            490
								return;
		//  236  489:return          
							k = bitArray.readSignedExpGolombCodedInt();
		//  237  490:aload_0         
		//  238  491:getfield        #82  <Field ParsableNalUnitBitArray bitArray>
		//  239  494:invokevirtual   #181 <Method int ParsableNalUnitBitArray.readSignedExpGolombCodedInt()>
		//  240  497:istore          4
							i = 0;
		//  241  499:iconst_0        
		//  242  500:istore_2        
							break label2;
		//  243  501:goto            603
						}
					} else
		//* 244  504:goto            598
					{
						if(spsdata.picOrderCountType == 1 && !spsdata.deltaPicOrderAlwaysZeroFlag)
		//* 245  507:aload           16
		//* 246  509:getfield        #172 <Field int com.google.android.exoplayer2.util.NalUnitUtil$SpsData.picOrderCountType>
		//* 247  512:iconst_1        
		//* 248  513:icmpne          596
		//* 249  516:aload           16
		//* 250  518:getfield        #184 <Field boolean com.google.android.exoplayer2.util.NalUnitUtil$SpsData.deltaPicOrderAlwaysZeroFlag>
		//* 251  521:ifne            596
						{
							if(!bitArray.canReadExpGolombCodedNum())
		//* 252  524:aload_0         
		//* 253  525:getfield        #82  <Field ParsableNalUnitBitArray bitArray>
		//* 254  528:invokevirtual   #134 <Method boolean ParsableNalUnitBitArray.canReadExpGolombCodedNum()>
		//* 255  531:ifne            535
								return;
		//  256  534:return          
							l = bitArray.readSignedExpGolombCodedInt();
		//  257  535:aload_0         
		//  258  536:getfield        #82  <Field ParsableNalUnitBitArray bitArray>
		//  259  539:invokevirtual   #181 <Method int ParsableNalUnitBitArray.readSignedExpGolombCodedInt()>
		//  260  542:istore          5
							if(((com.google.android.exoplayer2.util.NalUnitUtil.PpsData) (abyte0)).bottomFieldPicOrderInFramePresentFlag && !flag)
		//* 261  544:aload_1         
		//* 262  545:getfield        #178 <Field boolean com.google.android.exoplayer2.util.NalUnitUtil$PpsData.bottomFieldPicOrderInFramePresentFlag>
		//* 263  548:ifeq            584
		//* 264  551:iload           12
		//* 265  553:ifne            584
							{
								if(!bitArray.canReadExpGolombCodedNum())
		//* 266  556:aload_0         
		//* 267  557:getfield        #82  <Field ParsableNalUnitBitArray bitArray>
		//* 268  560:invokevirtual   #134 <Method boolean ParsableNalUnitBitArray.canReadExpGolombCodedNum()>
		//* 269  563:ifne            567
									return;
		//  270  566:return          
								i1 = bitArray.readSignedExpGolombCodedInt();
		//  271  567:aload_0         
		//  272  568:getfield        #82  <Field ParsableNalUnitBitArray bitArray>
		//  273  571:invokevirtual   #181 <Method int ParsableNalUnitBitArray.readSignedExpGolombCodedInt()>
		//  274  574:istore          6
								i = 0;
		//  275  576:iconst_0        
		//  276  577:istore_2        
								k = i;
		//  277  578:iload_2         
		//  278  579:istore          4
							} else
		//* 279  581:goto            611
							{
								i = 0;
		//  280  584:iconst_0        
		//  281  585:istore_2        
								k = i;
		//  282  586:iload_2         
		//  283  587:istore          4
								i1 = k;
		//  284  589:iload           4
		//  285  591:istore          6
							}
							break label1;
		//  286  593:goto            611
						}
						j = 0;
		//  287  596:iconst_0        
		//  288  597:istore_3        
					}
					k = 0;
		//  289  598:iconst_0        
		//  290  599:istore          4
					i = 0;
		//  291  601:iconst_0        
		//  292  602:istore_2        
				}
				i1 = i;
		//  293  603:iload_2         
		//  294  604:istore          6
				l = i;
		//  295  606:iload_2         
		//  296  607:istore          5
				i = j;
		//  297  609:iload_3         
		//  298  610:istore_2        
			}
			sliceHeader.setAll(spsdata, k1, l1, j2, i2, flag, flag1, flag2, flag3, j1, i, k, l, i1);
		//  299  611:aload_0         
		//  300  612:getfield        #73  <Field H264Reader$SampleReader$SliceHeaderData sliceHeader>
		//  301  615:aload           16
		//  302  617:iload           8
		//  303  619:iload           9
		//  304  621:iload           11
		//  305  623:iload           10
		//  306  625:iload           12
		//  307  627:iload           13
		//  308  629:iload           14
		//  309  631:iload           15
		//  310  633:iload           7
		//  311  635:iload_2         
		//  312  636:iload           4
		//  313  638:iload           5
		//  314  640:iload           6
		//  315  642:invokevirtual   #188 <Method void H264Reader$SampleReader$SliceHeaderData.setAll(com.google.android.exoplayer2.util.NalUnitUtil$SpsData, int, int, int, int, boolean, boolean, boolean, boolean, int, int, int, int, int)>
			isFilling = false;
		//  316  645:aload_0         
		//  317  646:iconst_0        
		//  318  647:putfield        #100 <Field boolean isFilling>
		//  319  650:return          
		}

		public void endNalUnit(long l, int i)
		{
			boolean flag1;
label0:
			{
				int j = nalUnitType;
		//    0    0:aload_0         
		//    1    1:getfield        #169 <Field int nalUnitType>
		//    2    4:istore          5
				boolean flag = false;
		//    3    6:iconst_0        
		//    4    7:istore          4
				if(j == 9 || detectAccessUnits && sliceHeader.isFirstVclNalUnitOfPicture(previousSliceHeader))
		//*   5    9:iload           5
		//*   6   11:bipush          9
		//*   7   13:icmpeq          37
		//*   8   16:aload_0         
		//*   9   17:getfield        #59  <Field boolean detectAccessUnits>
		//*  10   20:ifeq            83
		//*  11   23:aload_0         
		//*  12   24:getfield        #73  <Field H264Reader$SampleReader$SliceHeaderData sliceHeader>
		//*  13   27:aload_0         
		//*  14   28:getfield        #71  <Field H264Reader$SampleReader$SliceHeaderData previousSliceHeader>
		//*  15   31:invokestatic    #194 <Method boolean H264Reader$SampleReader$SliceHeaderData.access$100(H264Reader$SampleReader$SliceHeaderData, H264Reader$SampleReader$SliceHeaderData)>
		//*  16   34:ifeq            83
				{
					if(readingSample)
		//*  17   37:aload_0         
		//*  18   38:getfield        #196 <Field boolean readingSample>
		//*  19   41:ifeq            57
						outputSample(i + (int)(l - nalUnitStartPosition));
		//   20   44:aload_0         
		//   21   45:iload_3         
		//   22   46:lload_1         
		//   23   47:aload_0         
		//   24   48:getfield        #198 <Field long nalUnitStartPosition>
		//   25   51:lsub            
		//   26   52:l2i             
		//   27   53:iadd            
		//   28   54:invokespecial   #200 <Method void outputSample(int)>
					samplePosition = nalUnitStartPosition;
		//   29   57:aload_0         
		//   30   58:aload_0         
		//   31   59:getfield        #198 <Field long nalUnitStartPosition>
		//   32   62:putfield        #202 <Field long samplePosition>
					sampleTimeUs = nalUnitTimeUs;
		//   33   65:aload_0         
		//   34   66:aload_0         
		//   35   67:getfield        #204 <Field long nalUnitTimeUs>
		//   36   70:putfield        #206 <Field long sampleTimeUs>
					sampleIsKeyframe = false;
		//   37   73:aload_0         
		//   38   74:iconst_0        
		//   39   75:putfield        #208 <Field boolean sampleIsKeyframe>
					readingSample = true;
		//   40   78:aload_0         
		//   41   79:iconst_1        
		//   42   80:putfield        #196 <Field boolean readingSample>
				}
				flag1 = sampleIsKeyframe;
		//   43   83:aload_0         
		//   44   84:getfield        #208 <Field boolean sampleIsKeyframe>
		//   45   87:istore          6
				if(nalUnitType != 5)
		//*  46   89:aload_0         
		//*  47   90:getfield        #169 <Field int nalUnitType>
		//*  48   93:iconst_5        
		//*  49   94:icmpeq          131
				{
					i = ((int) (flag));
		//   50   97:iload           4
		//   51   99:istore_3        
					if(!allowNonIdrKeyframes)
						break label0;
		//   52  100:aload_0         
		//   53  101:getfield        #57  <Field boolean allowNonIdrKeyframes>
		//   54  104:ifeq            133
					i = ((int) (flag));
		//   55  107:iload           4
		//   56  109:istore_3        
					if(nalUnitType != 1)
						break label0;
		//   57  110:aload_0         
		//   58  111:getfield        #169 <Field int nalUnitType>
		//   59  114:iconst_1        
		//   60  115:icmpne          133
					i = ((int) (flag));
		//   61  118:iload           4
		//   62  120:istore_3        
					if(!sliceHeader.isISlice())
						break label0;
		//   63  121:aload_0         
		//   64  122:getfield        #73  <Field H264Reader$SampleReader$SliceHeaderData sliceHeader>
		//   65  125:invokevirtual   #211 <Method boolean H264Reader$SampleReader$SliceHeaderData.isISlice()>
		//   66  128:ifeq            133
				}
				i = 1;
		//   67  131:iconst_1        
		//   68  132:istore_3        
			}
			sampleIsKeyframe = ((boolean) (flag1 | i));
		//   69  133:aload_0         
		//   70  134:iload           6
		//   71  136:iload_3         
		//   72  137:ior             
		//   73  138:putfield        #208 <Field boolean sampleIsKeyframe>
		//   74  141:return          
		}

		public boolean needsSpsPps()
		{
			return detectAccessUnits;
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field boolean detectAccessUnits>
		//    2    4:ireturn         
		}

		public void putPps(com.google.android.exoplayer2.util.NalUnitUtil.PpsData ppsdata)
		{
			pps.append(ppsdata.picParameterSetId, ((Object) (ppsdata)));
		//    0    0:aload_0         
		//    1    1:getfield        #66  <Field SparseArray pps>
		//    2    4:aload_1         
		//    3    5:getfield        #217 <Field int com.google.android.exoplayer2.util.NalUnitUtil$PpsData.picParameterSetId>
		//    4    8:aload_1         
		//    5    9:invokevirtual   #221 <Method void SparseArray.append(int, Object)>
		//    6   12:return          
		}

		public void putSps(com.google.android.exoplayer2.util.NalUnitUtil.SpsData spsdata)
		{
			sps.append(spsdata.seqParameterSetId, ((Object) (spsdata)));
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field SparseArray sps>
		//    2    4:aload_1         
		//    3    5:getfield        #224 <Field int com.google.android.exoplayer2.util.NalUnitUtil$SpsData.seqParameterSetId>
		//    4    8:aload_1         
		//    5    9:invokevirtual   #221 <Method void SparseArray.append(int, Object)>
		//    6   12:return          
		}

		public void reset()
		{
			isFilling = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #100 <Field boolean isFilling>
			readingSample = false;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #196 <Field boolean readingSample>
			sliceHeader.clear();
		//    6   10:aload_0         
		//    7   11:getfield        #73  <Field H264Reader$SampleReader$SliceHeaderData sliceHeader>
		//    8   14:invokevirtual   #227 <Method void H264Reader$SampleReader$SliceHeaderData.clear()>
		//    9   17:return          
		}

		public void startNalUnit(long l, int i, long l1)
		{
			nalUnitType = i;
		//    0    0:aload_0         
		//    1    1:iload_3         
		//    2    2:putfield        #169 <Field int nalUnitType>
			nalUnitTimeUs = l1;
		//    3    5:aload_0         
		//    4    6:lload           4
		//    5    8:putfield        #204 <Field long nalUnitTimeUs>
			nalUnitStartPosition = l;
		//    6   11:aload_0         
		//    7   12:lload_1         
		//    8   13:putfield        #198 <Field long nalUnitStartPosition>
			if(allowNonIdrKeyframes && nalUnitType == 1 || detectAccessUnits && (nalUnitType == 5 || nalUnitType == 1 || nalUnitType == 2))
		//*   9   16:aload_0         
		//*  10   17:getfield        #57  <Field boolean allowNonIdrKeyframes>
		//*  11   20:ifeq            31
		//*  12   23:aload_0         
		//*  13   24:getfield        #169 <Field int nalUnitType>
		//*  14   27:iconst_1        
		//*  15   28:icmpeq          62
		//*  16   31:aload_0         
		//*  17   32:getfield        #59  <Field boolean detectAccessUnits>
		//*  18   35:ifeq            99
		//*  19   38:aload_0         
		//*  20   39:getfield        #169 <Field int nalUnitType>
		//*  21   42:iconst_5        
		//*  22   43:icmpeq          62
		//*  23   46:aload_0         
		//*  24   47:getfield        #169 <Field int nalUnitType>
		//*  25   50:iconst_1        
		//*  26   51:icmpeq          62
		//*  27   54:aload_0         
		//*  28   55:getfield        #169 <Field int nalUnitType>
		//*  29   58:iconst_2        
		//*  30   59:icmpne          99
			{
				SliceHeaderData sliceheaderdata = previousSliceHeader;
		//   31   62:aload_0         
		//   32   63:getfield        #71  <Field H264Reader$SampleReader$SliceHeaderData previousSliceHeader>
		//   33   66:astore          6
				previousSliceHeader = sliceHeader;
		//   34   68:aload_0         
		//   35   69:aload_0         
		//   36   70:getfield        #73  <Field H264Reader$SampleReader$SliceHeaderData sliceHeader>
		//   37   73:putfield        #71  <Field H264Reader$SampleReader$SliceHeaderData previousSliceHeader>
				sliceHeader = sliceheaderdata;
		//   38   76:aload_0         
		//   39   77:aload           6
		//   40   79:putfield        #73  <Field H264Reader$SampleReader$SliceHeaderData sliceHeader>
				sliceHeader.clear();
		//   41   82:aload_0         
		//   42   83:getfield        #73  <Field H264Reader$SampleReader$SliceHeaderData sliceHeader>
		//   43   86:invokevirtual   #227 <Method void H264Reader$SampleReader$SliceHeaderData.clear()>
				bufferLength = 0;
		//   44   89:aload_0         
		//   45   90:iconst_0        
		//   46   91:putfield        #102 <Field int bufferLength>
				isFilling = true;
		//   47   94:aload_0         
		//   48   95:iconst_1        
		//   49   96:putfield        #100 <Field boolean isFilling>
			}
		//   50   99:return          
		}

		private static final int DEFAULT_BUFFER_SIZE = 128;
		private static final int NAL_UNIT_TYPE_AUD = 9;
		private static final int NAL_UNIT_TYPE_IDR = 5;
		private static final int NAL_UNIT_TYPE_NON_IDR = 1;
		private static final int NAL_UNIT_TYPE_PARTITION_A = 2;
		private final boolean allowNonIdrKeyframes;
		private final ParsableNalUnitBitArray bitArray;
		private byte buffer[];
		private int bufferLength;
		private final boolean detectAccessUnits;
		private boolean isFilling;
		private long nalUnitStartPosition;
		private long nalUnitTimeUs;
		private int nalUnitType;
		private final TrackOutput output;
		private final SparseArray pps = new SparseArray();
		private SliceHeaderData previousSliceHeader;
		private boolean readingSample;
		private boolean sampleIsKeyframe;
		private long samplePosition;
		private long sampleTimeUs;
		private SliceHeaderData sliceHeader;
		private final SparseArray sps = new SparseArray();

		public SampleReader(TrackOutput trackoutput, boolean flag, boolean flag1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #53  <Method void Object()>
			output = trackoutput;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #55  <Field TrackOutput output>
			allowNonIdrKeyframes = flag;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #57  <Field boolean allowNonIdrKeyframes>
			detectAccessUnits = flag1;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #59  <Field boolean detectAccessUnits>
		//   11   19:aload_0         
		//   12   20:new             #61  <Class SparseArray>
		//   13   23:dup             
		//   14   24:invokespecial   #62  <Method void SparseArray()>
		//   15   27:putfield        #64  <Field SparseArray sps>
		//   16   30:aload_0         
		//   17   31:new             #61  <Class SparseArray>
		//   18   34:dup             
		//   19   35:invokespecial   #62  <Method void SparseArray()>
		//   20   38:putfield        #66  <Field SparseArray pps>
			previousSliceHeader = new SliceHeaderData();
		//   21   41:aload_0         
		//   22   42:new             #9   <Class H264Reader$SampleReader$SliceHeaderData>
		//   23   45:dup             
		//   24   46:aconst_null     
		//   25   47:invokespecial   #69  <Method void H264Reader$SampleReader$SliceHeaderData(H264Reader$1)>
		//   26   50:putfield        #71  <Field H264Reader$SampleReader$SliceHeaderData previousSliceHeader>
			sliceHeader = new SliceHeaderData();
		//   27   53:aload_0         
		//   28   54:new             #9   <Class H264Reader$SampleReader$SliceHeaderData>
		//   29   57:dup             
		//   30   58:aconst_null     
		//   31   59:invokespecial   #69  <Method void H264Reader$SampleReader$SliceHeaderData(H264Reader$1)>
		//   32   62:putfield        #73  <Field H264Reader$SampleReader$SliceHeaderData sliceHeader>
			buffer = new byte[128];
		//   33   65:aload_0         
		//   34   66:sipush          128
		//   35   69:newarray        byte[]
		//   36   71:putfield        #75  <Field byte[] buffer>
			bitArray = new ParsableNalUnitBitArray(buffer, 0, 0);
		//   37   74:aload_0         
		//   38   75:new             #77  <Class ParsableNalUnitBitArray>
		//   39   78:dup             
		//   40   79:aload_0         
		//   41   80:getfield        #75  <Field byte[] buffer>
		//   42   83:iconst_0        
		//   43   84:iconst_0        
		//   44   85:invokespecial   #80  <Method void ParsableNalUnitBitArray(byte[], int, int)>
		//   45   88:putfield        #82  <Field ParsableNalUnitBitArray bitArray>
			reset();
		//   46   91:aload_0         
		//   47   92:invokevirtual   #85  <Method void reset()>
		//   48   95:return          
		}
	}

	private static final class SampleReader.SliceHeaderData
	{

		private boolean isFirstVclNalUnitOfPicture(SampleReader.SliceHeaderData sliceheaderdata)
		{
			boolean flag;
label0:
			{
				flag = isComplete;
		//    0    0:aload_0         
		//    1    1:getfield        #48  <Field boolean isComplete>
		//    2    4:istore_2        
				boolean flag1 = true;
		//    3    5:iconst_1        
		//    4    6:istore_3        
				if(flag)
		//*   5    7:iload_2         
		//*   6    8:ifeq            249
				{
					flag = flag1;
		//    7   11:iload_3         
		//    8   12:istore_2        
					if(!sliceheaderdata.isComplete)
						break label0;
		//    9   13:aload_1         
		//   10   14:getfield        #48  <Field boolean isComplete>
		//   11   17:ifeq            251
					flag = flag1;
		//   12   20:iload_3         
		//   13   21:istore_2        
					if(frameNum != sliceheaderdata.frameNum)
						break label0;
		//   14   22:aload_0         
		//   15   23:getfield        #50  <Field int frameNum>
		//   16   26:aload_1         
		//   17   27:getfield        #50  <Field int frameNum>
		//   18   30:icmpne          251
					flag = flag1;
		//   19   33:iload_3         
		//   20   34:istore_2        
					if(picParameterSetId != sliceheaderdata.picParameterSetId)
						break label0;
		//   21   35:aload_0         
		//   22   36:getfield        #52  <Field int picParameterSetId>
		//   23   39:aload_1         
		//   24   40:getfield        #52  <Field int picParameterSetId>
		//   25   43:icmpne          251
					flag = flag1;
		//   26   46:iload_3         
		//   27   47:istore_2        
					if(fieldPicFlag != sliceheaderdata.fieldPicFlag)
						break label0;
		//   28   48:aload_0         
		//   29   49:getfield        #54  <Field boolean fieldPicFlag>
		//   30   52:aload_1         
		//   31   53:getfield        #54  <Field boolean fieldPicFlag>
		//   32   56:icmpne          251
					if(bottomFieldFlagPresent && sliceheaderdata.bottomFieldFlagPresent)
		//*  33   59:aload_0         
		//*  34   60:getfield        #56  <Field boolean bottomFieldFlagPresent>
		//*  35   63:ifeq            86
		//*  36   66:aload_1         
		//*  37   67:getfield        #56  <Field boolean bottomFieldFlagPresent>
		//*  38   70:ifeq            86
					{
						flag = flag1;
		//   39   73:iload_3         
		//   40   74:istore_2        
						if(bottomFieldFlag != sliceheaderdata.bottomFieldFlag)
							break label0;
		//   41   75:aload_0         
		//   42   76:getfield        #58  <Field boolean bottomFieldFlag>
		//   43   79:aload_1         
		//   44   80:getfield        #58  <Field boolean bottomFieldFlag>
		//   45   83:icmpne          251
					}
					if(nalRefIdc != sliceheaderdata.nalRefIdc)
		//*  46   86:aload_0         
		//*  47   87:getfield        #60  <Field int nalRefIdc>
		//*  48   90:aload_1         
		//*  49   91:getfield        #60  <Field int nalRefIdc>
		//*  50   94:icmpeq          115
					{
						flag = flag1;
		//   51   97:iload_3         
		//   52   98:istore_2        
						if(nalRefIdc == 0)
							break label0;
		//   53   99:aload_0         
		//   54  100:getfield        #60  <Field int nalRefIdc>
		//   55  103:ifeq            251
						flag = flag1;
		//   56  106:iload_3         
		//   57  107:istore_2        
						if(sliceheaderdata.nalRefIdc == 0)
							break label0;
		//   58  108:aload_1         
		//   59  109:getfield        #60  <Field int nalRefIdc>
		//   60  112:ifeq            251
					}
					if(spsData.picOrderCountType == 0 && sliceheaderdata.spsData.picOrderCountType == 0)
		//*  61  115:aload_0         
		//*  62  116:getfield        #62  <Field com.google.android.exoplayer2.util.NalUnitUtil$SpsData spsData>
		//*  63  119:getfield        #67  <Field int com.google.android.exoplayer2.util.NalUnitUtil$SpsData.picOrderCountType>
		//*  64  122:ifne            161
		//*  65  125:aload_1         
		//*  66  126:getfield        #62  <Field com.google.android.exoplayer2.util.NalUnitUtil$SpsData spsData>
		//*  67  129:getfield        #67  <Field int com.google.android.exoplayer2.util.NalUnitUtil$SpsData.picOrderCountType>
		//*  68  132:ifne            161
					{
						flag = flag1;
		//   69  135:iload_3         
		//   70  136:istore_2        
						if(picOrderCntLsb != sliceheaderdata.picOrderCntLsb)
							break label0;
		//   71  137:aload_0         
		//   72  138:getfield        #69  <Field int picOrderCntLsb>
		//   73  141:aload_1         
		//   74  142:getfield        #69  <Field int picOrderCntLsb>
		//   75  145:icmpne          251
						flag = flag1;
		//   76  148:iload_3         
		//   77  149:istore_2        
						if(deltaPicOrderCntBottom != sliceheaderdata.deltaPicOrderCntBottom)
							break label0;
		//   78  150:aload_0         
		//   79  151:getfield        #71  <Field int deltaPicOrderCntBottom>
		//   80  154:aload_1         
		//   81  155:getfield        #71  <Field int deltaPicOrderCntBottom>
		//   82  158:icmpne          251
					}
					if(spsData.picOrderCountType == 1 && sliceheaderdata.spsData.picOrderCountType == 1)
		//*  83  161:aload_0         
		//*  84  162:getfield        #62  <Field com.google.android.exoplayer2.util.NalUnitUtil$SpsData spsData>
		//*  85  165:getfield        #67  <Field int com.google.android.exoplayer2.util.NalUnitUtil$SpsData.picOrderCountType>
		//*  86  168:iconst_1        
		//*  87  169:icmpne          209
		//*  88  172:aload_1         
		//*  89  173:getfield        #62  <Field com.google.android.exoplayer2.util.NalUnitUtil$SpsData spsData>
		//*  90  176:getfield        #67  <Field int com.google.android.exoplayer2.util.NalUnitUtil$SpsData.picOrderCountType>
		//*  91  179:iconst_1        
		//*  92  180:icmpne          209
					{
						flag = flag1;
		//   93  183:iload_3         
		//   94  184:istore_2        
						if(deltaPicOrderCnt0 != sliceheaderdata.deltaPicOrderCnt0)
							break label0;
		//   95  185:aload_0         
		//   96  186:getfield        #73  <Field int deltaPicOrderCnt0>
		//   97  189:aload_1         
		//   98  190:getfield        #73  <Field int deltaPicOrderCnt0>
		//   99  193:icmpne          251
						flag = flag1;
		//  100  196:iload_3         
		//  101  197:istore_2        
						if(deltaPicOrderCnt1 != sliceheaderdata.deltaPicOrderCnt1)
							break label0;
		//  102  198:aload_0         
		//  103  199:getfield        #75  <Field int deltaPicOrderCnt1>
		//  104  202:aload_1         
		//  105  203:getfield        #75  <Field int deltaPicOrderCnt1>
		//  106  206:icmpne          251
					}
					flag = flag1;
		//  107  209:iload_3         
		//  108  210:istore_2        
					if(idrPicFlag != sliceheaderdata.idrPicFlag)
						break label0;
		//  109  211:aload_0         
		//  110  212:getfield        #77  <Field boolean idrPicFlag>
		//  111  215:aload_1         
		//  112  216:getfield        #77  <Field boolean idrPicFlag>
		//  113  219:icmpne          251
					if(idrPicFlag && sliceheaderdata.idrPicFlag && idrPicId != sliceheaderdata.idrPicId)
		//* 114  222:aload_0         
		//* 115  223:getfield        #77  <Field boolean idrPicFlag>
		//* 116  226:ifeq            249
		//* 117  229:aload_1         
		//* 118  230:getfield        #77  <Field boolean idrPicFlag>
		//* 119  233:ifeq            249
		//* 120  236:aload_0         
		//* 121  237:getfield        #79  <Field int idrPicId>
		//* 122  240:aload_1         
		//* 123  241:getfield        #79  <Field int idrPicId>
		//* 124  244:icmpeq          249
						return true;
		//  125  247:iconst_1        
		//  126  248:ireturn         
				}
				flag = false;
		//  127  249:iconst_0        
		//  128  250:istore_2        
			}
			return flag;
		//  129  251:iload_2         
		//  130  252:ireturn         
		}

		public void clear()
		{
			hasSliceType = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #82  <Field boolean hasSliceType>
			isComplete = false;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #48  <Field boolean isComplete>
		//    6   10:return          
		}

		public boolean isISlice()
		{
			return hasSliceType && (sliceType == 7 || sliceType == 2);
		//    0    0:aload_0         
		//    1    1:getfield        #82  <Field boolean hasSliceType>
		//    2    4:ifeq            26
		//    3    7:aload_0         
		//    4    8:getfield        #86  <Field int sliceType>
		//    5   11:bipush          7
		//    6   13:icmpeq          24
		//    7   16:aload_0         
		//    8   17:getfield        #86  <Field int sliceType>
		//    9   20:iconst_2        
		//   10   21:icmpne          26
		//   11   24:iconst_1        
		//   12   25:ireturn         
		//   13   26:iconst_0        
		//   14   27:ireturn         
		}

		public void setAll(com.google.android.exoplayer2.util.NalUnitUtil.SpsData spsdata, int i, int j, int k, int l, boolean flag, boolean flag1, 
				boolean flag2, boolean flag3, int i1, int j1, int k1, int l1, int i2)
		{
			spsData = spsdata;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #62  <Field com.google.android.exoplayer2.util.NalUnitUtil$SpsData spsData>
			nalRefIdc = i;
		//    3    5:aload_0         
		//    4    6:iload_2         
		//    5    7:putfield        #60  <Field int nalRefIdc>
			sliceType = j;
		//    6   10:aload_0         
		//    7   11:iload_3         
		//    8   12:putfield        #86  <Field int sliceType>
			frameNum = k;
		//    9   15:aload_0         
		//   10   16:iload           4
		//   11   18:putfield        #50  <Field int frameNum>
			picParameterSetId = l;
		//   12   21:aload_0         
		//   13   22:iload           5
		//   14   24:putfield        #52  <Field int picParameterSetId>
			fieldPicFlag = flag;
		//   15   27:aload_0         
		//   16   28:iload           6
		//   17   30:putfield        #54  <Field boolean fieldPicFlag>
			bottomFieldFlagPresent = flag1;
		//   18   33:aload_0         
		//   19   34:iload           7
		//   20   36:putfield        #56  <Field boolean bottomFieldFlagPresent>
			bottomFieldFlag = flag2;
		//   21   39:aload_0         
		//   22   40:iload           8
		//   23   42:putfield        #58  <Field boolean bottomFieldFlag>
			idrPicFlag = flag3;
		//   24   45:aload_0         
		//   25   46:iload           9
		//   26   48:putfield        #77  <Field boolean idrPicFlag>
			idrPicId = i1;
		//   27   51:aload_0         
		//   28   52:iload           10
		//   29   54:putfield        #79  <Field int idrPicId>
			picOrderCntLsb = j1;
		//   30   57:aload_0         
		//   31   58:iload           11
		//   32   60:putfield        #69  <Field int picOrderCntLsb>
			deltaPicOrderCntBottom = k1;
		//   33   63:aload_0         
		//   34   64:iload           12
		//   35   66:putfield        #71  <Field int deltaPicOrderCntBottom>
			deltaPicOrderCnt0 = l1;
		//   36   69:aload_0         
		//   37   70:iload           13
		//   38   72:putfield        #73  <Field int deltaPicOrderCnt0>
			deltaPicOrderCnt1 = i2;
		//   39   75:aload_0         
		//   40   76:iload           14
		//   41   78:putfield        #75  <Field int deltaPicOrderCnt1>
			isComplete = true;
		//   42   81:aload_0         
		//   43   82:iconst_1        
		//   44   83:putfield        #48  <Field boolean isComplete>
			hasSliceType = true;
		//   45   86:aload_0         
		//   46   87:iconst_1        
		//   47   88:putfield        #82  <Field boolean hasSliceType>
		//   48   91:return          
		}

		public void setSliceType(int i)
		{
			sliceType = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #86  <Field int sliceType>
			hasSliceType = true;
		//    3    5:aload_0         
		//    4    6:iconst_1        
		//    5    7:putfield        #82  <Field boolean hasSliceType>
		//    6   10:return          
		}

		private static final int SLICE_TYPE_ALL_I = 7;
		private static final int SLICE_TYPE_I = 2;
		private boolean bottomFieldFlag;
		private boolean bottomFieldFlagPresent;
		private int deltaPicOrderCnt0;
		private int deltaPicOrderCnt1;
		private int deltaPicOrderCntBottom;
		private boolean fieldPicFlag;
		private int frameNum;
		private boolean hasSliceType;
		private boolean idrPicFlag;
		private int idrPicId;
		private boolean isComplete;
		private int nalRefIdc;
		private int picOrderCntLsb;
		private int picParameterSetId;
		private int sliceType;
		private com.google.android.exoplayer2.util.NalUnitUtil.SpsData spsData;


/*
		static boolean access$100(SampleReader.SliceHeaderData sliceheaderdata, SampleReader.SliceHeaderData sliceheaderdata1)
		{
			return sliceheaderdata.isFirstVclNalUnitOfPicture(sliceheaderdata1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #46  <Method boolean isFirstVclNalUnitOfPicture(H264Reader$SampleReader$SliceHeaderData)>
		//    3    5:ireturn         
		}

*/

		private SampleReader.SliceHeaderData()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #37  <Method void Object()>
		//    2    4:return          
		}

	}


	public H264Reader(SeiReader seireader, boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Object()>
		seiReader = seireader;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #51  <Field SeiReader seiReader>
		allowNonIdrKeyframes = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #53  <Field boolean allowNonIdrKeyframes>
		detectAccessUnits = flag1;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #55  <Field boolean detectAccessUnits>
	//   11   19:aload_0         
	//   12   20:iconst_3        
	//   13   21:newarray        boolean[]
	//   14   23:putfield        #57  <Field boolean[] prefixFlags>
	//   15   26:aload_0         
	//   16   27:new             #59  <Class NalUnitTargetBuffer>
	//   17   30:dup             
	//   18   31:bipush          7
	//   19   33:sipush          128
	//   20   36:invokespecial   #62  <Method void NalUnitTargetBuffer(int, int)>
	//   21   39:putfield        #64  <Field NalUnitTargetBuffer sps>
	//   22   42:aload_0         
	//   23   43:new             #59  <Class NalUnitTargetBuffer>
	//   24   46:dup             
	//   25   47:bipush          8
	//   26   49:sipush          128
	//   27   52:invokespecial   #62  <Method void NalUnitTargetBuffer(int, int)>
	//   28   55:putfield        #66  <Field NalUnitTargetBuffer pps>
	//   29   58:aload_0         
	//   30   59:new             #59  <Class NalUnitTargetBuffer>
	//   31   62:dup             
	//   32   63:bipush          6
	//   33   65:sipush          128
	//   34   68:invokespecial   #62  <Method void NalUnitTargetBuffer(int, int)>
	//   35   71:putfield        #68  <Field NalUnitTargetBuffer sei>
	//   36   74:aload_0         
	//   37   75:new             #70  <Class ParsableByteArray>
	//   38   78:dup             
	//   39   79:invokespecial   #71  <Method void ParsableByteArray()>
	//   40   82:putfield        #73  <Field ParsableByteArray seiWrapper>
	//   41   85:return          
	}

	private void endNalUnit(long l, int i, int j, long l1)
	{
		if(!hasOutputFormat || sampleReader.needsSpsPps())
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field boolean hasOutputFormat>
	//*   2    4:ifeq            17
	//*   3    7:aload_0         
	//*   4    8:getfield        #80  <Field H264Reader$SampleReader sampleReader>
	//*   5   11:invokevirtual   #84  <Method boolean H264Reader$SampleReader.needsSpsPps()>
	//*   6   14:ifeq            340
		{
			sps.endNalUnit(j);
	//    7   17:aload_0         
	//    8   18:getfield        #64  <Field NalUnitTargetBuffer sps>
	//    9   21:iload           4
	//   10   23:invokevirtual   #87  <Method boolean NalUnitTargetBuffer.endNalUnit(int)>
	//   11   26:pop             
			pps.endNalUnit(j);
	//   12   27:aload_0         
	//   13   28:getfield        #66  <Field NalUnitTargetBuffer pps>
	//   14   31:iload           4
	//   15   33:invokevirtual   #87  <Method boolean NalUnitTargetBuffer.endNalUnit(int)>
	//   16   36:pop             
			if(!hasOutputFormat)
	//*  17   37:aload_0         
	//*  18   38:getfield        #78  <Field boolean hasOutputFormat>
	//*  19   41:ifne            245
			{
				if(sps.isCompleted() && pps.isCompleted())
	//*  20   44:aload_0         
	//*  21   45:getfield        #64  <Field NalUnitTargetBuffer sps>
	//*  22   48:invokevirtual   #90  <Method boolean NalUnitTargetBuffer.isCompleted()>
	//*  23   51:ifeq            340
	//*  24   54:aload_0         
	//*  25   55:getfield        #66  <Field NalUnitTargetBuffer pps>
	//*  26   58:invokevirtual   #90  <Method boolean NalUnitTargetBuffer.isCompleted()>
	//*  27   61:ifeq            340
				{
					ArrayList arraylist = new ArrayList();
	//   28   64:new             #92  <Class ArrayList>
	//   29   67:dup             
	//   30   68:invokespecial   #93  <Method void ArrayList()>
	//   31   71:astore          7
					((List) (arraylist)).add(((Object) (Arrays.copyOf(sps.nalData, sps.nalLength))));
	//   32   73:aload           7
	//   33   75:aload_0         
	//   34   76:getfield        #64  <Field NalUnitTargetBuffer sps>
	//   35   79:getfield        #97  <Field byte[] NalUnitTargetBuffer.nalData>
	//   36   82:aload_0         
	//   37   83:getfield        #64  <Field NalUnitTargetBuffer sps>
	//   38   86:getfield        #100 <Field int NalUnitTargetBuffer.nalLength>
	//   39   89:invokestatic    #106 <Method byte[] Arrays.copyOf(byte[], int)>
	//   40   92:invokeinterface #112 <Method boolean List.add(Object)>
	//   41   97:pop             
					((List) (arraylist)).add(((Object) (Arrays.copyOf(pps.nalData, pps.nalLength))));
	//   42   98:aload           7
	//   43  100:aload_0         
	//   44  101:getfield        #66  <Field NalUnitTargetBuffer pps>
	//   45  104:getfield        #97  <Field byte[] NalUnitTargetBuffer.nalData>
	//   46  107:aload_0         
	//   47  108:getfield        #66  <Field NalUnitTargetBuffer pps>
	//   48  111:getfield        #100 <Field int NalUnitTargetBuffer.nalLength>
	//   49  114:invokestatic    #106 <Method byte[] Arrays.copyOf(byte[], int)>
	//   50  117:invokeinterface #112 <Method boolean List.add(Object)>
	//   51  122:pop             
					com.google.android.exoplayer2.util.NalUnitUtil.SpsData spsdata1 = NalUnitUtil.parseSpsNalUnit(sps.nalData, 3, sps.nalLength);
	//   52  123:aload_0         
	//   53  124:getfield        #64  <Field NalUnitTargetBuffer sps>
	//   54  127:getfield        #97  <Field byte[] NalUnitTargetBuffer.nalData>
	//   55  130:iconst_3        
	//   56  131:aload_0         
	//   57  132:getfield        #64  <Field NalUnitTargetBuffer sps>
	//   58  135:getfield        #100 <Field int NalUnitTargetBuffer.nalLength>
	//   59  138:invokestatic    #118 <Method com.google.android.exoplayer2.util.NalUnitUtil$SpsData NalUnitUtil.parseSpsNalUnit(byte[], int, int)>
	//   60  141:astore          8
					com.google.android.exoplayer2.util.NalUnitUtil.PpsData ppsdata1 = NalUnitUtil.parsePpsNalUnit(pps.nalData, 3, pps.nalLength);
	//   61  143:aload_0         
	//   62  144:getfield        #66  <Field NalUnitTargetBuffer pps>
	//   63  147:getfield        #97  <Field byte[] NalUnitTargetBuffer.nalData>
	//   64  150:iconst_3        
	//   65  151:aload_0         
	//   66  152:getfield        #66  <Field NalUnitTargetBuffer pps>
	//   67  155:getfield        #100 <Field int NalUnitTargetBuffer.nalLength>
	//   68  158:invokestatic    #122 <Method com.google.android.exoplayer2.util.NalUnitUtil$PpsData NalUnitUtil.parsePpsNalUnit(byte[], int, int)>
	//   69  161:astore          9
					output.format(Format.createVideoSampleFormat(formatId, "video/avc", ((String) (null)), -1, -1, spsdata1.width, spsdata1.height, -1F, ((List) (arraylist)), -1, spsdata1.pixelWidthAspectRatio, ((com.google.android.exoplayer2.drm.DrmInitData) (null))));
	//   70  163:aload_0         
	//   71  164:getfield        #124 <Field TrackOutput output>
	//   72  167:aload_0         
	//   73  168:getfield        #126 <Field String formatId>
	//   74  171:ldc1            #128 <String "video/avc">
	//   75  173:aconst_null     
	//   76  174:iconst_m1       
	//   77  175:iconst_m1       
	//   78  176:aload           8
	//   79  178:getfield        #133 <Field int com.google.android.exoplayer2.util.NalUnitUtil$SpsData.width>
	//   80  181:aload           8
	//   81  183:getfield        #136 <Field int com.google.android.exoplayer2.util.NalUnitUtil$SpsData.height>
	//   82  186:ldc1            #137 <Float -1F>
	//   83  188:aload           7
	//   84  190:iconst_m1       
	//   85  191:aload           8
	//   86  193:getfield        #141 <Field float com.google.android.exoplayer2.util.NalUnitUtil$SpsData.pixelWidthAspectRatio>
	//   87  196:aconst_null     
	//   88  197:invokestatic    #147 <Method Format Format.createVideoSampleFormat(String, String, String, int, int, int, int, float, List, int, float, com.google.android.exoplayer2.drm.DrmInitData)>
	//   89  200:invokeinterface #153 <Method void TrackOutput.format(Format)>
					hasOutputFormat = true;
	//   90  205:aload_0         
	//   91  206:iconst_1        
	//   92  207:putfield        #78  <Field boolean hasOutputFormat>
					sampleReader.putSps(spsdata1);
	//   93  210:aload_0         
	//   94  211:getfield        #80  <Field H264Reader$SampleReader sampleReader>
	//   95  214:aload           8
	//   96  216:invokevirtual   #157 <Method void H264Reader$SampleReader.putSps(com.google.android.exoplayer2.util.NalUnitUtil$SpsData)>
					sampleReader.putPps(ppsdata1);
	//   97  219:aload_0         
	//   98  220:getfield        #80  <Field H264Reader$SampleReader sampleReader>
	//   99  223:aload           9
	//  100  225:invokevirtual   #161 <Method void H264Reader$SampleReader.putPps(com.google.android.exoplayer2.util.NalUnitUtil$PpsData)>
					sps.reset();
	//  101  228:aload_0         
	//  102  229:getfield        #64  <Field NalUnitTargetBuffer sps>
	//  103  232:invokevirtual   #164 <Method void NalUnitTargetBuffer.reset()>
					pps.reset();
	//  104  235:aload_0         
	//  105  236:getfield        #66  <Field NalUnitTargetBuffer pps>
	//  106  239:invokevirtual   #164 <Method void NalUnitTargetBuffer.reset()>
				}
			} else
	//* 107  242:goto            340
			if(sps.isCompleted())
	//* 108  245:aload_0         
	//* 109  246:getfield        #64  <Field NalUnitTargetBuffer sps>
	//* 110  249:invokevirtual   #90  <Method boolean NalUnitTargetBuffer.isCompleted()>
	//* 111  252:ifeq            294
			{
				com.google.android.exoplayer2.util.NalUnitUtil.SpsData spsdata = NalUnitUtil.parseSpsNalUnit(sps.nalData, 3, sps.nalLength);
	//  112  255:aload_0         
	//  113  256:getfield        #64  <Field NalUnitTargetBuffer sps>
	//  114  259:getfield        #97  <Field byte[] NalUnitTargetBuffer.nalData>
	//  115  262:iconst_3        
	//  116  263:aload_0         
	//  117  264:getfield        #64  <Field NalUnitTargetBuffer sps>
	//  118  267:getfield        #100 <Field int NalUnitTargetBuffer.nalLength>
	//  119  270:invokestatic    #118 <Method com.google.android.exoplayer2.util.NalUnitUtil$SpsData NalUnitUtil.parseSpsNalUnit(byte[], int, int)>
	//  120  273:astore          7
				sampleReader.putSps(spsdata);
	//  121  275:aload_0         
	//  122  276:getfield        #80  <Field H264Reader$SampleReader sampleReader>
	//  123  279:aload           7
	//  124  281:invokevirtual   #157 <Method void H264Reader$SampleReader.putSps(com.google.android.exoplayer2.util.NalUnitUtil$SpsData)>
				sps.reset();
	//  125  284:aload_0         
	//  126  285:getfield        #64  <Field NalUnitTargetBuffer sps>
	//  127  288:invokevirtual   #164 <Method void NalUnitTargetBuffer.reset()>
			} else
	//* 128  291:goto            340
			if(pps.isCompleted())
	//* 129  294:aload_0         
	//* 130  295:getfield        #66  <Field NalUnitTargetBuffer pps>
	//* 131  298:invokevirtual   #90  <Method boolean NalUnitTargetBuffer.isCompleted()>
	//* 132  301:ifeq            340
			{
				com.google.android.exoplayer2.util.NalUnitUtil.PpsData ppsdata = NalUnitUtil.parsePpsNalUnit(pps.nalData, 3, pps.nalLength);
	//  133  304:aload_0         
	//  134  305:getfield        #66  <Field NalUnitTargetBuffer pps>
	//  135  308:getfield        #97  <Field byte[] NalUnitTargetBuffer.nalData>
	//  136  311:iconst_3        
	//  137  312:aload_0         
	//  138  313:getfield        #66  <Field NalUnitTargetBuffer pps>
	//  139  316:getfield        #100 <Field int NalUnitTargetBuffer.nalLength>
	//  140  319:invokestatic    #122 <Method com.google.android.exoplayer2.util.NalUnitUtil$PpsData NalUnitUtil.parsePpsNalUnit(byte[], int, int)>
	//  141  322:astore          7
				sampleReader.putPps(ppsdata);
	//  142  324:aload_0         
	//  143  325:getfield        #80  <Field H264Reader$SampleReader sampleReader>
	//  144  328:aload           7
	//  145  330:invokevirtual   #161 <Method void H264Reader$SampleReader.putPps(com.google.android.exoplayer2.util.NalUnitUtil$PpsData)>
				pps.reset();
	//  146  333:aload_0         
	//  147  334:getfield        #66  <Field NalUnitTargetBuffer pps>
	//  148  337:invokevirtual   #164 <Method void NalUnitTargetBuffer.reset()>
			}
		}
		if(sei.endNalUnit(j))
	//* 149  340:aload_0         
	//* 150  341:getfield        #68  <Field NalUnitTargetBuffer sei>
	//* 151  344:iload           4
	//* 152  346:invokevirtual   #87  <Method boolean NalUnitTargetBuffer.endNalUnit(int)>
	//* 153  349:ifeq            408
		{
			j = NalUnitUtil.unescapeStream(sei.nalData, sei.nalLength);
	//  154  352:aload_0         
	//  155  353:getfield        #68  <Field NalUnitTargetBuffer sei>
	//  156  356:getfield        #97  <Field byte[] NalUnitTargetBuffer.nalData>
	//  157  359:aload_0         
	//  158  360:getfield        #68  <Field NalUnitTargetBuffer sei>
	//  159  363:getfield        #100 <Field int NalUnitTargetBuffer.nalLength>
	//  160  366:invokestatic    #168 <Method int NalUnitUtil.unescapeStream(byte[], int)>
	//  161  369:istore          4
			seiWrapper.reset(sei.nalData, j);
	//  162  371:aload_0         
	//  163  372:getfield        #73  <Field ParsableByteArray seiWrapper>
	//  164  375:aload_0         
	//  165  376:getfield        #68  <Field NalUnitTargetBuffer sei>
	//  166  379:getfield        #97  <Field byte[] NalUnitTargetBuffer.nalData>
	//  167  382:iload           4
	//  168  384:invokevirtual   #171 <Method void ParsableByteArray.reset(byte[], int)>
			seiWrapper.setPosition(4);
	//  169  387:aload_0         
	//  170  388:getfield        #73  <Field ParsableByteArray seiWrapper>
	//  171  391:iconst_4        
	//  172  392:invokevirtual   #175 <Method void ParsableByteArray.setPosition(int)>
			seiReader.consume(l1, seiWrapper);
	//  173  395:aload_0         
	//  174  396:getfield        #51  <Field SeiReader seiReader>
	//  175  399:lload           5
	//  176  401:aload_0         
	//  177  402:getfield        #73  <Field ParsableByteArray seiWrapper>
	//  178  405:invokevirtual   #181 <Method void SeiReader.consume(long, ParsableByteArray)>
		}
		sampleReader.endNalUnit(l, i);
	//  179  408:aload_0         
	//  180  409:getfield        #80  <Field H264Reader$SampleReader sampleReader>
	//  181  412:lload_1         
	//  182  413:iload_3         
	//  183  414:invokevirtual   #184 <Method void H264Reader$SampleReader.endNalUnit(long, int)>
	//  184  417:return          
	}

	private void nalUnitData(byte abyte0[], int i, int j)
	{
		if(!hasOutputFormat || sampleReader.needsSpsPps())
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field boolean hasOutputFormat>
	//*   2    4:ifeq            17
	//*   3    7:aload_0         
	//*   4    8:getfield        #80  <Field H264Reader$SampleReader sampleReader>
	//*   5   11:invokevirtual   #84  <Method boolean H264Reader$SampleReader.needsSpsPps()>
	//*   6   14:ifeq            37
		{
			sps.appendToNalUnit(abyte0, i, j);
	//    7   17:aload_0         
	//    8   18:getfield        #64  <Field NalUnitTargetBuffer sps>
	//    9   21:aload_1         
	//   10   22:iload_2         
	//   11   23:iload_3         
	//   12   24:invokevirtual   #189 <Method void NalUnitTargetBuffer.appendToNalUnit(byte[], int, int)>
			pps.appendToNalUnit(abyte0, i, j);
	//   13   27:aload_0         
	//   14   28:getfield        #66  <Field NalUnitTargetBuffer pps>
	//   15   31:aload_1         
	//   16   32:iload_2         
	//   17   33:iload_3         
	//   18   34:invokevirtual   #189 <Method void NalUnitTargetBuffer.appendToNalUnit(byte[], int, int)>
		}
		sei.appendToNalUnit(abyte0, i, j);
	//   19   37:aload_0         
	//   20   38:getfield        #68  <Field NalUnitTargetBuffer sei>
	//   21   41:aload_1         
	//   22   42:iload_2         
	//   23   43:iload_3         
	//   24   44:invokevirtual   #189 <Method void NalUnitTargetBuffer.appendToNalUnit(byte[], int, int)>
		sampleReader.appendToNalUnit(abyte0, i, j);
	//   25   47:aload_0         
	//   26   48:getfield        #80  <Field H264Reader$SampleReader sampleReader>
	//   27   51:aload_1         
	//   28   52:iload_2         
	//   29   53:iload_3         
	//   30   54:invokevirtual   #190 <Method void H264Reader$SampleReader.appendToNalUnit(byte[], int, int)>
	//   31   57:return          
	}

	private void startNalUnit(long l, int i, long l1)
	{
		if(!hasOutputFormat || sampleReader.needsSpsPps())
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field boolean hasOutputFormat>
	//*   2    4:ifeq            17
	//*   3    7:aload_0         
	//*   4    8:getfield        #80  <Field H264Reader$SampleReader sampleReader>
	//*   5   11:invokevirtual   #84  <Method boolean H264Reader$SampleReader.needsSpsPps()>
	//*   6   14:ifeq            33
		{
			sps.startNalUnit(i);
	//    7   17:aload_0         
	//    8   18:getfield        #64  <Field NalUnitTargetBuffer sps>
	//    9   21:iload_3         
	//   10   22:invokevirtual   #194 <Method void NalUnitTargetBuffer.startNalUnit(int)>
			pps.startNalUnit(i);
	//   11   25:aload_0         
	//   12   26:getfield        #66  <Field NalUnitTargetBuffer pps>
	//   13   29:iload_3         
	//   14   30:invokevirtual   #194 <Method void NalUnitTargetBuffer.startNalUnit(int)>
		}
		sei.startNalUnit(i);
	//   15   33:aload_0         
	//   16   34:getfield        #68  <Field NalUnitTargetBuffer sei>
	//   17   37:iload_3         
	//   18   38:invokevirtual   #194 <Method void NalUnitTargetBuffer.startNalUnit(int)>
		sampleReader.startNalUnit(l, i, l1);
	//   19   41:aload_0         
	//   20   42:getfield        #80  <Field H264Reader$SampleReader sampleReader>
	//   21   45:lload_1         
	//   22   46:iload_3         
	//   23   47:lload           4
	//   24   49:invokevirtual   #196 <Method void H264Reader$SampleReader.startNalUnit(long, int, long)>
	//   25   52:return          
	}

	public void consume(ParsableByteArray parsablebytearray)
	{
		int i = parsablebytearray.getPosition();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #201 <Method int ParsableByteArray.getPosition()>
	//    2    4:istore_2        
		int j = parsablebytearray.limit();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #204 <Method int ParsableByteArray.limit()>
	//    5    9:istore_3        
		byte abyte0[] = parsablebytearray.data;
	//    6   10:aload_1         
	//    7   11:getfield        #207 <Field byte[] ParsableByteArray.data>
	//    8   14:astore          10
		totalBytesWritten = totalBytesWritten + (long)parsablebytearray.bytesLeft();
	//    9   16:aload_0         
	//   10   17:aload_0         
	//   11   18:getfield        #209 <Field long totalBytesWritten>
	//   12   21:aload_1         
	//   13   22:invokevirtual   #212 <Method int ParsableByteArray.bytesLeft()>
	//   14   25:i2l             
	//   15   26:ladd            
	//   16   27:putfield        #209 <Field long totalBytesWritten>
		output.sampleData(parsablebytearray, parsablebytearray.bytesLeft());
	//   17   30:aload_0         
	//   18   31:getfield        #124 <Field TrackOutput output>
	//   19   34:aload_1         
	//   20   35:aload_1         
	//   21   36:invokevirtual   #212 <Method int ParsableByteArray.bytesLeft()>
	//   22   39:invokeinterface #216 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
		do
		{
			int k = NalUnitUtil.findNalUnit(abyte0, i, j, prefixFlags);
	//   23   44:aload           10
	//   24   46:iload_2         
	//   25   47:iload_3         
	//   26   48:aload_0         
	//   27   49:getfield        #57  <Field boolean[] prefixFlags>
	//   28   52:invokestatic    #220 <Method int NalUnitUtil.findNalUnit(byte[], int, int, boolean[])>
	//   29   55:istore          4
			if(k == j)
	//*  30   57:iload           4
	//*  31   59:iload_3         
	//*  32   60:icmpne          72
			{
				nalUnitData(abyte0, i, j);
	//   33   63:aload_0         
	//   34   64:aload           10
	//   35   66:iload_2         
	//   36   67:iload_3         
	//   37   68:invokespecial   #222 <Method void nalUnitData(byte[], int, int)>
				return;
	//   38   71:return          
			}
			int l = NalUnitUtil.getNalUnitType(abyte0, k);
	//   39   72:aload           10
	//   40   74:iload           4
	//   41   76:invokestatic    #225 <Method int NalUnitUtil.getNalUnitType(byte[], int)>
	//   42   79:istore          5
			int j1 = k - i;
	//   43   81:iload           4
	//   44   83:iload_2         
	//   45   84:isub            
	//   46   85:istore          7
			if(j1 > 0)
	//*  47   87:iload           7
	//*  48   89:ifle            101
				nalUnitData(abyte0, i, k);
	//   49   92:aload_0         
	//   50   93:aload           10
	//   51   95:iload_2         
	//   52   96:iload           4
	//   53   98:invokespecial   #222 <Method void nalUnitData(byte[], int, int)>
			int i1 = j - k;
	//   54  101:iload_3         
	//   55  102:iload           4
	//   56  104:isub            
	//   57  105:istore          6
			long l1 = totalBytesWritten - (long)i1;
	//   58  107:aload_0         
	//   59  108:getfield        #209 <Field long totalBytesWritten>
	//   60  111:iload           6
	//   61  113:i2l             
	//   62  114:lsub            
	//   63  115:lstore          8
			if(j1 < 0)
	//*  64  117:iload           7
	//*  65  119:ifge            129
				i = -j1;
	//   66  122:iload           7
	//   67  124:ineg            
	//   68  125:istore_2        
			else
	//*  69  126:goto            134
				i = 0;
	//   70  129:iconst_0        
	//   71  130:istore_2        
	//*  72  131:goto            126
			endNalUnit(l1, i1, i, pesTimeUs);
	//   73  134:aload_0         
	//   74  135:lload           8
	//   75  137:iload           6
	//   76  139:iload_2         
	//   77  140:aload_0         
	//   78  141:getfield        #227 <Field long pesTimeUs>
	//   79  144:invokespecial   #229 <Method void endNalUnit(long, int, int, long)>
			startNalUnit(l1, l, pesTimeUs);
	//   80  147:aload_0         
	//   81  148:lload           8
	//   82  150:iload           5
	//   83  152:aload_0         
	//   84  153:getfield        #227 <Field long pesTimeUs>
	//   85  156:invokespecial   #230 <Method void startNalUnit(long, int, long)>
			i = k + 3;
	//   86  159:iload           4
	//   87  161:iconst_3        
	//   88  162:iadd            
	//   89  163:istore_2        
		} while(true);
	//   90  164:goto            44
	}

	public void createTracks(ExtractorOutput extractoroutput, TsPayloadReader.TrackIdGenerator trackidgenerator)
	{
		trackidgenerator.generateNewId();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #237 <Method void TsPayloadReader$TrackIdGenerator.generateNewId()>
		formatId = trackidgenerator.getFormatId();
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #241 <Method String TsPayloadReader$TrackIdGenerator.getFormatId()>
	//    5    9:putfield        #126 <Field String formatId>
		output = extractoroutput.track(trackidgenerator.getTrackId(), 2);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #244 <Method int TsPayloadReader$TrackIdGenerator.getTrackId()>
	//   10   18:iconst_2        
	//   11   19:invokeinterface #250 <Method TrackOutput ExtractorOutput.track(int, int)>
	//   12   24:putfield        #124 <Field TrackOutput output>
		sampleReader = new SampleReader(output, allowNonIdrKeyframes, detectAccessUnits);
	//   13   27:aload_0         
	//   14   28:new             #10  <Class H264Reader$SampleReader>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:getfield        #124 <Field TrackOutput output>
	//   18   36:aload_0         
	//   19   37:getfield        #53  <Field boolean allowNonIdrKeyframes>
	//   20   40:aload_0         
	//   21   41:getfield        #55  <Field boolean detectAccessUnits>
	//   22   44:invokespecial   #253 <Method void H264Reader$SampleReader(TrackOutput, boolean, boolean)>
	//   23   47:putfield        #80  <Field H264Reader$SampleReader sampleReader>
		seiReader.createTracks(extractoroutput, trackidgenerator);
	//   24   50:aload_0         
	//   25   51:getfield        #51  <Field SeiReader seiReader>
	//   26   54:aload_1         
	//   27   55:aload_2         
	//   28   56:invokevirtual   #255 <Method void SeiReader.createTracks(ExtractorOutput, TsPayloadReader$TrackIdGenerator)>
	//   29   59:return          
	}

	public void packetFinished()
	{
	//    0    0:return          
	}

	public void packetStarted(long l, boolean flag)
	{
		pesTimeUs = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #227 <Field long pesTimeUs>
	//    3    5:return          
	}

	public void seek()
	{
		NalUnitUtil.clearPrefixFlags(prefixFlags);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field boolean[] prefixFlags>
	//    2    4:invokestatic    #263 <Method void NalUnitUtil.clearPrefixFlags(boolean[])>
		sps.reset();
	//    3    7:aload_0         
	//    4    8:getfield        #64  <Field NalUnitTargetBuffer sps>
	//    5   11:invokevirtual   #164 <Method void NalUnitTargetBuffer.reset()>
		pps.reset();
	//    6   14:aload_0         
	//    7   15:getfield        #66  <Field NalUnitTargetBuffer pps>
	//    8   18:invokevirtual   #164 <Method void NalUnitTargetBuffer.reset()>
		sei.reset();
	//    9   21:aload_0         
	//   10   22:getfield        #68  <Field NalUnitTargetBuffer sei>
	//   11   25:invokevirtual   #164 <Method void NalUnitTargetBuffer.reset()>
		sampleReader.reset();
	//   12   28:aload_0         
	//   13   29:getfield        #80  <Field H264Reader$SampleReader sampleReader>
	//   14   32:invokevirtual   #264 <Method void H264Reader$SampleReader.reset()>
		totalBytesWritten = 0L;
	//   15   35:aload_0         
	//   16   36:lconst_0        
	//   17   37:putfield        #209 <Field long totalBytesWritten>
	//   18   40:return          
	}

	private static final int NAL_UNIT_TYPE_PPS = 8;
	private static final int NAL_UNIT_TYPE_SEI = 6;
	private static final int NAL_UNIT_TYPE_SPS = 7;
	private final boolean allowNonIdrKeyframes;
	private final boolean detectAccessUnits;
	private String formatId;
	private boolean hasOutputFormat;
	private TrackOutput output;
	private long pesTimeUs;
	private final NalUnitTargetBuffer pps = new NalUnitTargetBuffer(8, 128);
	private final boolean prefixFlags[] = new boolean[3];
	private SampleReader sampleReader;
	private final NalUnitTargetBuffer sei = new NalUnitTargetBuffer(6, 128);
	private final SeiReader seiReader;
	private final ParsableByteArray seiWrapper = new ParsableByteArray();
	private final NalUnitTargetBuffer sps = new NalUnitTargetBuffer(7, 128);
	private long totalBytesWritten;
}
