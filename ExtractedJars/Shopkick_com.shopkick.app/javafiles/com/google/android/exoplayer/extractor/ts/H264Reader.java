// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.ts;

import android.util.SparseArray;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.extractor.TrackOutput;
import com.google.android.exoplayer.util.*;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer.extractor.ts:
//			ElementaryStreamReader, NalUnitTargetBuffer, SeiReader

final class H264Reader extends ElementaryStreamReader
{
	private static final class SampleReader
	{

		private void outputSample(int i)
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #88  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #90  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #95  <Method void Runtime(String)>
		//    4    9:athrow          
		}

		public void appendToNalUnit(byte abyte0[], int i, int j)
		{
			int k;
			int l;
			int i1;
			int j1;
			int k1;
			int l1;
			int i2;
			boolean flag;
			boolean flag1;
			boolean flag2;
			boolean flag3;
			com.google.android.exoplayer.util.NalUnitUtil.SpsData spsdata;
label0:
			{
				if(!isFilling)
		//*   0    0:aload_0         
		//*   1    1:getfield        #99  <Field boolean isFilling>
		//*   2    4:ifne            8
					return;
		//    3    7:return          
				j -= i;
		//    4    8:iload_3         
		//    5    9:iload_2         
		//    6   10:isub            
		//    7   11:istore_3        
				byte abyte1[] = buffer;
		//    8   12:aload_0         
		//    9   13:getfield        #80  <Field byte[] buffer>
		//   10   16:astore          15
				k = abyte1.length;
		//   11   18:aload           15
		//   12   20:arraylength     
		//   13   21:istore          4
				l = bufferLength;
		//   14   23:aload_0         
		//   15   24:getfield        #101 <Field int bufferLength>
		//   16   27:istore          5
				if(k < l + j)
		//*  17   29:iload           4
		//*  18   31:iload           5
		//*  19   33:iload_3         
		//*  20   34:iadd            
		//*  21   35:icmpge          53
					buffer = Arrays.copyOf(abyte1, (l + j) * 2);
		//   22   38:aload_0         
		//   23   39:aload           15
		//   24   41:iload           5
		//   25   43:iload_3         
		//   26   44:iadd            
		//   27   45:iconst_2        
		//   28   46:imul            
		//   29   47:invokestatic    #107 <Method byte[] Arrays.copyOf(byte[], int)>
		//   30   50:putfield        #80  <Field byte[] buffer>
				System.arraycopy(((Object) (abyte0)), i, ((Object) (buffer)), bufferLength, j);
		//   31   53:aload_1         
		//   32   54:iload_2         
		//   33   55:aload_0         
		//   34   56:getfield        #80  <Field byte[] buffer>
		//   35   59:aload_0         
		//   36   60:getfield        #101 <Field int bufferLength>
		//   37   63:iload_3         
		//   38   64:invokestatic    #113 <Method void System.arraycopy(Object, int, Object, int, int)>
				bufferLength = bufferLength + j;
		//   39   67:aload_0         
		//   40   68:aload_0         
		//   41   69:getfield        #101 <Field int bufferLength>
		//   42   72:iload_3         
		//   43   73:iadd            
		//   44   74:putfield        #101 <Field int bufferLength>
				scratch.reset(buffer, bufferLength);
		//   45   77:aload_0         
		//   46   78:getfield        #78  <Field ParsableBitArray scratch>
		//   47   81:aload_0         
		//   48   82:getfield        #80  <Field byte[] buffer>
		//   49   85:aload_0         
		//   50   86:getfield        #101 <Field int bufferLength>
		//   51   89:invokevirtual   #116 <Method void ParsableBitArray.reset(byte[], int)>
				if(scratch.bitsLeft() < 8)
		//*  52   92:aload_0         
		//*  53   93:getfield        #78  <Field ParsableBitArray scratch>
		//*  54   96:invokevirtual   #120 <Method int ParsableBitArray.bitsLeft()>
		//*  55   99:bipush          8
		//*  56  101:icmpge          105
					return;
		//   57  104:return          
				scratch.skipBits(1);
		//   58  105:aload_0         
		//   59  106:getfield        #78  <Field ParsableBitArray scratch>
		//   60  109:iconst_1        
		//   61  110:invokevirtual   #123 <Method void ParsableBitArray.skipBits(int)>
				j1 = scratch.readBits(2);
		//   62  113:aload_0         
		//   63  114:getfield        #78  <Field ParsableBitArray scratch>
		//   64  117:iconst_2        
		//   65  118:invokevirtual   #127 <Method int ParsableBitArray.readBits(int)>
		//   66  121:istore          7
				scratch.skipBits(5);
		//   67  123:aload_0         
		//   68  124:getfield        #78  <Field ParsableBitArray scratch>
		//   69  127:iconst_5        
		//   70  128:invokevirtual   #123 <Method void ParsableBitArray.skipBits(int)>
				if(!scratch.canReadExpGolombCodedNum())
		//*  71  131:aload_0         
		//*  72  132:getfield        #78  <Field ParsableBitArray scratch>
		//*  73  135:invokevirtual   #131 <Method boolean ParsableBitArray.canReadExpGolombCodedNum()>
		//*  74  138:ifne            142
					return;
		//   75  141:return          
				scratch.readUnsignedExpGolombCodedInt();
		//   76  142:aload_0         
		//   77  143:getfield        #78  <Field ParsableBitArray scratch>
		//   78  146:invokevirtual   #134 <Method int ParsableBitArray.readUnsignedExpGolombCodedInt()>
		//   79  149:pop             
				if(!scratch.canReadExpGolombCodedNum())
		//*  80  150:aload_0         
		//*  81  151:getfield        #78  <Field ParsableBitArray scratch>
		//*  82  154:invokevirtual   #131 <Method boolean ParsableBitArray.canReadExpGolombCodedNum()>
		//*  83  157:ifne            161
					return;
		//   84  160:return          
				k1 = scratch.readUnsignedExpGolombCodedInt();
		//   85  161:aload_0         
		//   86  162:getfield        #78  <Field ParsableBitArray scratch>
		//   87  165:invokevirtual   #134 <Method int ParsableBitArray.readUnsignedExpGolombCodedInt()>
		//   88  168:istore          8
				if(!detectAccessUnits)
		//*  89  170:aload_0         
		//*  90  171:getfield        #59  <Field boolean detectAccessUnits>
		//*  91  174:ifne            192
				{
					isFilling = false;
		//   92  177:aload_0         
		//   93  178:iconst_0        
		//   94  179:putfield        #99  <Field boolean isFilling>
					sliceHeader.setSliceType(k1);
		//   95  182:aload_0         
		//   96  183:getfield        #73  <Field H264Reader$SampleReader$SliceHeaderData sliceHeader>
		//   97  186:iload           8
		//   98  188:invokevirtual   #137 <Method void H264Reader$SampleReader$SliceHeaderData.setSliceType(int)>
					return;
		//   99  191:return          
				}
				if(!scratch.canReadExpGolombCodedNum())
		//* 100  192:aload_0         
		//* 101  193:getfield        #78  <Field ParsableBitArray scratch>
		//* 102  196:invokevirtual   #131 <Method boolean ParsableBitArray.canReadExpGolombCodedNum()>
		//* 103  199:ifne            203
					return;
		//  104  202:return          
				l1 = scratch.readUnsignedExpGolombCodedInt();
		//  105  203:aload_0         
		//  106  204:getfield        #78  <Field ParsableBitArray scratch>
		//  107  207:invokevirtual   #134 <Method int ParsableBitArray.readUnsignedExpGolombCodedInt()>
		//  108  210:istore          9
				if(pps.indexOfKey(l1) < 0)
		//* 109  212:aload_0         
		//* 110  213:getfield        #66  <Field SparseArray pps>
		//* 111  216:iload           9
		//* 112  218:invokevirtual   #140 <Method int SparseArray.indexOfKey(int)>
		//* 113  221:ifge            230
				{
					isFilling = false;
		//  114  224:aload_0         
		//  115  225:iconst_0        
		//  116  226:putfield        #99  <Field boolean isFilling>
					return;
		//  117  229:return          
				}
				abyte0 = ((byte []) ((com.google.android.exoplayer.util.NalUnitUtil.PpsData)pps.get(l1)));
		//  118  230:aload_0         
		//  119  231:getfield        #66  <Field SparseArray pps>
		//  120  234:iload           9
		//  121  236:invokevirtual   #144 <Method Object SparseArray.get(int)>
		//  122  239:checkcast       #146 <Class com.google.android.exoplayer.util.NalUnitUtil$PpsData>
		//  123  242:astore_1        
				spsdata = (com.google.android.exoplayer.util.NalUnitUtil.SpsData)sps.get(((com.google.android.exoplayer.util.NalUnitUtil.PpsData) (abyte0)).seqParameterSetId);
		//  124  243:aload_0         
		//  125  244:getfield        #64  <Field SparseArray sps>
		//  126  247:aload_1         
		//  127  248:getfield        #149 <Field int com.google.android.exoplayer.util.NalUnitUtil$PpsData.seqParameterSetId>
		//  128  251:invokevirtual   #144 <Method Object SparseArray.get(int)>
		//  129  254:checkcast       #151 <Class com.google.android.exoplayer.util.NalUnitUtil$SpsData>
		//  130  257:astore          15
				if(spsdata.separateColorPlaneFlag)
		//* 131  259:aload           15
		//* 132  261:getfield        #154 <Field boolean com.google.android.exoplayer.util.NalUnitUtil$SpsData.separateColorPlaneFlag>
		//* 133  264:ifeq            287
				{
					if(scratch.bitsLeft() < 2)
		//* 134  267:aload_0         
		//* 135  268:getfield        #78  <Field ParsableBitArray scratch>
		//* 136  271:invokevirtual   #120 <Method int ParsableBitArray.bitsLeft()>
		//* 137  274:iconst_2        
		//* 138  275:icmpge          279
						return;
		//  139  278:return          
					scratch.skipBits(2);
		//  140  279:aload_0         
		//  141  280:getfield        #78  <Field ParsableBitArray scratch>
		//  142  283:iconst_2        
		//  143  284:invokevirtual   #123 <Method void ParsableBitArray.skipBits(int)>
				}
				if(scratch.bitsLeft() < spsdata.frameNumLength)
		//* 144  287:aload_0         
		//* 145  288:getfield        #78  <Field ParsableBitArray scratch>
		//* 146  291:invokevirtual   #120 <Method int ParsableBitArray.bitsLeft()>
		//* 147  294:aload           15
		//* 148  296:getfield        #157 <Field int com.google.android.exoplayer.util.NalUnitUtil$SpsData.frameNumLength>
		//* 149  299:icmpge          303
					return;
		//  150  302:return          
				i2 = scratch.readBits(spsdata.frameNumLength);
		//  151  303:aload_0         
		//  152  304:getfield        #78  <Field ParsableBitArray scratch>
		//  153  307:aload           15
		//  154  309:getfield        #157 <Field int com.google.android.exoplayer.util.NalUnitUtil$SpsData.frameNumLength>
		//  155  312:invokevirtual   #127 <Method int ParsableBitArray.readBits(int)>
		//  156  315:istore          10
				if(!spsdata.frameMbsOnlyFlag)
		//* 157  317:aload           15
		//* 158  319:getfield        #160 <Field boolean com.google.android.exoplayer.util.NalUnitUtil$SpsData.frameMbsOnlyFlag>
		//* 159  322:ifne            388
				{
					if(scratch.bitsLeft() < 1)
		//* 160  325:aload_0         
		//* 161  326:getfield        #78  <Field ParsableBitArray scratch>
		//* 162  329:invokevirtual   #120 <Method int ParsableBitArray.bitsLeft()>
		//* 163  332:iconst_1        
		//* 164  333:icmpge          337
						return;
		//  165  336:return          
					flag = scratch.readBit();
		//  166  337:aload_0         
		//  167  338:getfield        #78  <Field ParsableBitArray scratch>
		//  168  341:invokevirtual   #163 <Method boolean ParsableBitArray.readBit()>
		//  169  344:istore          11
					if(flag)
		//* 170  346:iload           11
		//* 171  348:ifeq            378
					{
						if(scratch.bitsLeft() < 1)
		//* 172  351:aload_0         
		//* 173  352:getfield        #78  <Field ParsableBitArray scratch>
		//* 174  355:invokevirtual   #120 <Method int ParsableBitArray.bitsLeft()>
		//* 175  358:iconst_1        
		//* 176  359:icmpge          363
							return;
		//  177  362:return          
						flag2 = scratch.readBit();
		//  178  363:aload_0         
		//  179  364:getfield        #78  <Field ParsableBitArray scratch>
		//  180  367:invokevirtual   #163 <Method boolean ParsableBitArray.readBit()>
		//  181  370:istore          13
						flag1 = true;
		//  182  372:iconst_1        
		//  183  373:istore          12
					} else
		//* 184  375:goto            399
					{
						flag1 = false;
		//  185  378:iconst_0        
		//  186  379:istore          12
						flag2 = flag1;
		//  187  381:iload           12
		//  188  383:istore          13
					}
				} else
		//* 189  385:goto            399
				{
					flag = false;
		//  190  388:iconst_0        
		//  191  389:istore          11
					flag1 = flag;
		//  192  391:iload           11
		//  193  393:istore          12
					flag2 = flag1;
		//  194  395:iload           12
		//  195  397:istore          13
				}
				if(nalUnitType == 5)
		//* 196  399:aload_0         
		//* 197  400:getfield        #165 <Field int nalUnitType>
		//* 198  403:iconst_5        
		//* 199  404:icmpne          413
					flag3 = true;
		//  200  407:iconst_1        
		//  201  408:istore          14
				else
		//* 202  410:goto            416
					flag3 = false;
		//  203  413:iconst_0        
		//  204  414:istore          14
				if(flag3)
		//* 205  416:iload           14
		//* 206  418:ifeq            444
				{
					if(!scratch.canReadExpGolombCodedNum())
		//* 207  421:aload_0         
		//* 208  422:getfield        #78  <Field ParsableBitArray scratch>
		//* 209  425:invokevirtual   #131 <Method boolean ParsableBitArray.canReadExpGolombCodedNum()>
		//* 210  428:ifne            432
						return;
		//  211  431:return          
					i1 = scratch.readUnsignedExpGolombCodedInt();
		//  212  432:aload_0         
		//  213  433:getfield        #78  <Field ParsableBitArray scratch>
		//  214  436:invokevirtual   #134 <Method int ParsableBitArray.readUnsignedExpGolombCodedInt()>
		//  215  439:istore          6
				} else
		//* 216  441:goto            447
				{
					i1 = 0;
		//  217  444:iconst_0        
		//  218  445:istore          6
				}
				if(spsdata.picOrderCountType == 0)
		//* 219  447:aload           15
		//* 220  449:getfield        #168 <Field int com.google.android.exoplayer.util.NalUnitUtil$SpsData.picOrderCountType>
		//* 221  452:ifne            528
				{
					if(scratch.bitsLeft() < spsdata.picOrderCntLsbLength)
		//* 222  455:aload_0         
		//* 223  456:getfield        #78  <Field ParsableBitArray scratch>
		//* 224  459:invokevirtual   #120 <Method int ParsableBitArray.bitsLeft()>
		//* 225  462:aload           15
		//* 226  464:getfield        #171 <Field int com.google.android.exoplayer.util.NalUnitUtil$SpsData.picOrderCntLsbLength>
		//* 227  467:icmpge          471
						return;
		//  228  470:return          
					i = scratch.readBits(spsdata.picOrderCntLsbLength);
		//  229  471:aload_0         
		//  230  472:getfield        #78  <Field ParsableBitArray scratch>
		//  231  475:aload           15
		//  232  477:getfield        #171 <Field int com.google.android.exoplayer.util.NalUnitUtil$SpsData.picOrderCntLsbLength>
		//  233  480:invokevirtual   #127 <Method int ParsableBitArray.readBits(int)>
		//  234  483:istore_2        
					if(((com.google.android.exoplayer.util.NalUnitUtil.PpsData) (abyte0)).bottomFieldPicOrderInFramePresentFlag && !flag)
		//* 235  484:aload_1         
		//* 236  485:getfield        #174 <Field boolean com.google.android.exoplayer.util.NalUnitUtil$PpsData.bottomFieldPicOrderInFramePresentFlag>
		//* 237  488:ifeq            525
		//* 238  491:iload           11
		//* 239  493:ifne            525
					{
						if(!scratch.canReadExpGolombCodedNum())
		//* 240  496:aload_0         
		//* 241  497:getfield        #78  <Field ParsableBitArray scratch>
		//* 242  500:invokevirtual   #131 <Method boolean ParsableBitArray.canReadExpGolombCodedNum()>
		//* 243  503:ifne            507
							return;
		//  244  506:return          
						j = scratch.readSignedExpGolombCodedInt();
		//  245  507:aload_0         
		//  246  508:getfield        #78  <Field ParsableBitArray scratch>
		//  247  511:invokevirtual   #177 <Method int ParsableBitArray.readSignedExpGolombCodedInt()>
		//  248  514:istore_3        
						k = 0;
		//  249  515:iconst_0        
		//  250  516:istore          4
						l = k;
		//  251  518:iload           4
		//  252  520:istore          5
						break label0;
		//  253  522:goto            625
					}
				} else
		//* 254  525:goto            616
				{
					if(spsdata.picOrderCountType == 1 && !spsdata.deltaPicOrderAlwaysZeroFlag)
		//* 255  528:aload           15
		//* 256  530:getfield        #168 <Field int com.google.android.exoplayer.util.NalUnitUtil$SpsData.picOrderCountType>
		//* 257  533:iconst_1        
		//* 258  534:icmpne          614
		//* 259  537:aload           15
		//* 260  539:getfield        #180 <Field boolean com.google.android.exoplayer.util.NalUnitUtil$SpsData.deltaPicOrderAlwaysZeroFlag>
		//* 261  542:ifne            614
					{
						if(!scratch.canReadExpGolombCodedNum())
		//* 262  545:aload_0         
		//* 263  546:getfield        #78  <Field ParsableBitArray scratch>
		//* 264  549:invokevirtual   #131 <Method boolean ParsableBitArray.canReadExpGolombCodedNum()>
		//* 265  552:ifne            556
							return;
		//  266  555:return          
						k = scratch.readSignedExpGolombCodedInt();
		//  267  556:aload_0         
		//  268  557:getfield        #78  <Field ParsableBitArray scratch>
		//  269  560:invokevirtual   #177 <Method int ParsableBitArray.readSignedExpGolombCodedInt()>
		//  270  563:istore          4
						if(((com.google.android.exoplayer.util.NalUnitUtil.PpsData) (abyte0)).bottomFieldPicOrderInFramePresentFlag && !flag)
		//* 271  565:aload_1         
		//* 272  566:getfield        #174 <Field boolean com.google.android.exoplayer.util.NalUnitUtil$PpsData.bottomFieldPicOrderInFramePresentFlag>
		//* 273  569:ifeq            604
		//* 274  572:iload           11
		//* 275  574:ifne            604
						{
							if(!scratch.canReadExpGolombCodedNum())
		//* 276  577:aload_0         
		//* 277  578:getfield        #78  <Field ParsableBitArray scratch>
		//* 278  581:invokevirtual   #131 <Method boolean ParsableBitArray.canReadExpGolombCodedNum()>
		//* 279  584:ifne            588
								return;
		//  280  587:return          
							l = scratch.readSignedExpGolombCodedInt();
		//  281  588:aload_0         
		//  282  589:getfield        #78  <Field ParsableBitArray scratch>
		//  283  592:invokevirtual   #177 <Method int ParsableBitArray.readSignedExpGolombCodedInt()>
		//  284  595:istore          5
							i = 0;
		//  285  597:iconst_0        
		//  286  598:istore_2        
							j = i;
		//  287  599:iload_2         
		//  288  600:istore_3        
						} else
		//* 289  601:goto            625
						{
							i = 0;
		//  290  604:iconst_0        
		//  291  605:istore_2        
							j = i;
		//  292  606:iload_2         
		//  293  607:istore_3        
							l = j;
		//  294  608:iload_3         
		//  295  609:istore          5
						}
						break label0;
		//  296  611:goto            625
					}
					i = 0;
		//  297  614:iconst_0        
		//  298  615:istore_2        
				}
				j = 0;
		//  299  616:iconst_0        
		//  300  617:istore_3        
				k = 0;
		//  301  618:iconst_0        
		//  302  619:istore          4
				l = k;
		//  303  621:iload           4
		//  304  623:istore          5
			}
			sliceHeader.setAll(spsdata, j1, k1, i2, l1, flag, flag1, flag2, flag3, i1, i, j, k, l);
		//  305  625:aload_0         
		//  306  626:getfield        #73  <Field H264Reader$SampleReader$SliceHeaderData sliceHeader>
		//  307  629:aload           15
		//  308  631:iload           7
		//  309  633:iload           8
		//  310  635:iload           10
		//  311  637:iload           9
		//  312  639:iload           11
		//  313  641:iload           12
		//  314  643:iload           13
		//  315  645:iload           14
		//  316  647:iload           6
		//  317  649:iload_2         
		//  318  650:iload_3         
		//  319  651:iload           4
		//  320  653:iload           5
		//  321  655:invokevirtual   #184 <Method void H264Reader$SampleReader$SliceHeaderData.setAll(com.google.android.exoplayer.util.NalUnitUtil$SpsData, int, int, int, int, boolean, boolean, boolean, boolean, int, int, int, int, int)>
			isFilling = false;
		//  322  658:aload_0         
		//  323  659:iconst_0        
		//  324  660:putfield        #99  <Field boolean isFilling>
		//  325  663:return          
		}

		public void endNalUnit(long l, int i)
		{
			boolean flag1;
label0:
			{
				int j = nalUnitType;
		//    0    0:aload_0         
		//    1    1:getfield        #165 <Field int nalUnitType>
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
		//*  15   31:invokestatic    #190 <Method boolean H264Reader$SampleReader$SliceHeaderData.access$100(H264Reader$SampleReader$SliceHeaderData, H264Reader$SampleReader$SliceHeaderData)>
		//*  16   34:ifeq            83
				{
					if(readingSample)
		//*  17   37:aload_0         
		//*  18   38:getfield        #192 <Field boolean readingSample>
		//*  19   41:ifeq            57
						outputSample(i + (int)(l - nalUnitStartPosition));
		//   20   44:aload_0         
		//   21   45:iload_3         
		//   22   46:lload_1         
		//   23   47:aload_0         
		//   24   48:getfield        #194 <Field long nalUnitStartPosition>
		//   25   51:lsub            
		//   26   52:l2i             
		//   27   53:iadd            
		//   28   54:invokespecial   #196 <Method void outputSample(int)>
					samplePosition = nalUnitStartPosition;
		//   29   57:aload_0         
		//   30   58:aload_0         
		//   31   59:getfield        #194 <Field long nalUnitStartPosition>
		//   32   62:putfield        #198 <Field long samplePosition>
					sampleTimeUs = nalUnitTimeUs;
		//   33   65:aload_0         
		//   34   66:aload_0         
		//   35   67:getfield        #200 <Field long nalUnitTimeUs>
		//   36   70:putfield        #202 <Field long sampleTimeUs>
					sampleIsKeyframe = false;
		//   37   73:aload_0         
		//   38   74:iconst_0        
		//   39   75:putfield        #204 <Field boolean sampleIsKeyframe>
					readingSample = true;
		//   40   78:aload_0         
		//   41   79:iconst_1        
		//   42   80:putfield        #192 <Field boolean readingSample>
				}
				flag1 = sampleIsKeyframe;
		//   43   83:aload_0         
		//   44   84:getfield        #204 <Field boolean sampleIsKeyframe>
		//   45   87:istore          6
				j = nalUnitType;
		//   46   89:aload_0         
		//   47   90:getfield        #165 <Field int nalUnitType>
		//   48   93:istore          5
				if(j != 5)
		//*  49   95:iload           5
		//*  50   97:iconst_5        
		//*  51   98:icmpeq          133
				{
					i = ((int) (flag));
		//   52  101:iload           4
		//   53  103:istore_3        
					if(!allowNonIdrKeyframes)
						break label0;
		//   54  104:aload_0         
		//   55  105:getfield        #57  <Field boolean allowNonIdrKeyframes>
		//   56  108:ifeq            135
					i = ((int) (flag));
		//   57  111:iload           4
		//   58  113:istore_3        
					if(j != 1)
						break label0;
		//   59  114:iload           5
		//   60  116:iconst_1        
		//   61  117:icmpne          135
					i = ((int) (flag));
		//   62  120:iload           4
		//   63  122:istore_3        
					if(!sliceHeader.isISlice())
						break label0;
		//   64  123:aload_0         
		//   65  124:getfield        #73  <Field H264Reader$SampleReader$SliceHeaderData sliceHeader>
		//   66  127:invokevirtual   #207 <Method boolean H264Reader$SampleReader$SliceHeaderData.isISlice()>
		//   67  130:ifeq            135
				}
				i = 1;
		//   68  133:iconst_1        
		//   69  134:istore_3        
			}
			sampleIsKeyframe = ((boolean) (flag1 | i));
		//   70  135:aload_0         
		//   71  136:iload           6
		//   72  138:iload_3         
		//   73  139:ior             
		//   74  140:putfield        #204 <Field boolean sampleIsKeyframe>
		//   75  143:return          
		}

		public boolean needsSpsPps()
		{
			return detectAccessUnits;
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field boolean detectAccessUnits>
		//    2    4:ireturn         
		}

		public void putPps(com.google.android.exoplayer.util.NalUnitUtil.PpsData ppsdata)
		{
			pps.append(ppsdata.picParameterSetId, ((Object) (ppsdata)));
		//    0    0:aload_0         
		//    1    1:getfield        #66  <Field SparseArray pps>
		//    2    4:aload_1         
		//    3    5:getfield        #213 <Field int com.google.android.exoplayer.util.NalUnitUtil$PpsData.picParameterSetId>
		//    4    8:aload_1         
		//    5    9:invokevirtual   #217 <Method void SparseArray.append(int, Object)>
		//    6   12:return          
		}

		public void putSps(com.google.android.exoplayer.util.NalUnitUtil.SpsData spsdata)
		{
			sps.append(spsdata.seqParameterSetId, ((Object) (spsdata)));
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field SparseArray sps>
		//    2    4:aload_1         
		//    3    5:getfield        #220 <Field int com.google.android.exoplayer.util.NalUnitUtil$SpsData.seqParameterSetId>
		//    4    8:aload_1         
		//    5    9:invokevirtual   #217 <Method void SparseArray.append(int, Object)>
		//    6   12:return          
		}

		public void reset()
		{
			isFilling = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #99  <Field boolean isFilling>
			readingSample = false;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #192 <Field boolean readingSample>
			sliceHeader.clear();
		//    6   10:aload_0         
		//    7   11:getfield        #73  <Field H264Reader$SampleReader$SliceHeaderData sliceHeader>
		//    8   14:invokevirtual   #223 <Method void H264Reader$SampleReader$SliceHeaderData.clear()>
		//    9   17:return          
		}

		public void startNalUnit(long l, int i, long l1)
		{
label0:
			{
				nalUnitType = i;
		//    0    0:aload_0         
		//    1    1:iload_3         
		//    2    2:putfield        #165 <Field int nalUnitType>
				nalUnitTimeUs = l1;
		//    3    5:aload_0         
		//    4    6:lload           4
		//    5    8:putfield        #200 <Field long nalUnitTimeUs>
				nalUnitStartPosition = l;
		//    6   11:aload_0         
		//    7   12:lload_1         
		//    8   13:putfield        #194 <Field long nalUnitStartPosition>
				if(!allowNonIdrKeyframes || nalUnitType != 1)
		//*   9   16:aload_0         
		//*  10   17:getfield        #57  <Field boolean allowNonIdrKeyframes>
		//*  11   20:ifeq            31
		//*  12   23:aload_0         
		//*  13   24:getfield        #165 <Field int nalUnitType>
		//*  14   27:iconst_1        
		//*  15   28:icmpeq          58
				{
					if(!detectAccessUnits)
						break label0;
		//   16   31:aload_0         
		//   17   32:getfield        #59  <Field boolean detectAccessUnits>
		//   18   35:ifeq            95
					i = nalUnitType;
		//   19   38:aload_0         
		//   20   39:getfield        #165 <Field int nalUnitType>
		//   21   42:istore_3        
					if(i != 5 && i != 1 && i != 2)
						break label0;
		//   22   43:iload_3         
		//   23   44:iconst_5        
		//   24   45:icmpeq          58
		//   25   48:iload_3         
		//   26   49:iconst_1        
		//   27   50:icmpeq          58
		//   28   53:iload_3         
		//   29   54:iconst_2        
		//   30   55:icmpne          95
				}
				SliceHeaderData sliceheaderdata = previousSliceHeader;
		//   31   58:aload_0         
		//   32   59:getfield        #71  <Field H264Reader$SampleReader$SliceHeaderData previousSliceHeader>
		//   33   62:astore          6
				previousSliceHeader = sliceHeader;
		//   34   64:aload_0         
		//   35   65:aload_0         
		//   36   66:getfield        #73  <Field H264Reader$SampleReader$SliceHeaderData sliceHeader>
		//   37   69:putfield        #71  <Field H264Reader$SampleReader$SliceHeaderData previousSliceHeader>
				sliceHeader = sliceheaderdata;
		//   38   72:aload_0         
		//   39   73:aload           6
		//   40   75:putfield        #73  <Field H264Reader$SampleReader$SliceHeaderData sliceHeader>
				sliceHeader.clear();
		//   41   78:aload_0         
		//   42   79:getfield        #73  <Field H264Reader$SampleReader$SliceHeaderData sliceHeader>
		//   43   82:invokevirtual   #223 <Method void H264Reader$SampleReader$SliceHeaderData.clear()>
				bufferLength = 0;
		//   44   85:aload_0         
		//   45   86:iconst_0        
		//   46   87:putfield        #101 <Field int bufferLength>
				isFilling = true;
		//   47   90:aload_0         
		//   48   91:iconst_1        
		//   49   92:putfield        #99  <Field boolean isFilling>
			}
		//   50   95:return          
		}

		private static final int DEFAULT_BUFFER_SIZE = 128;
		private static final int NAL_UNIT_TYPE_AUD = 9;
		private static final int NAL_UNIT_TYPE_IDR = 5;
		private static final int NAL_UNIT_TYPE_NON_IDR = 1;
		private static final int NAL_UNIT_TYPE_PARTITION_A = 2;
		private final boolean allowNonIdrKeyframes;
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
		private final ParsableBitArray scratch = new ParsableBitArray();
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
		//   33   65:aload_0         
		//   34   66:new             #75  <Class ParsableBitArray>
		//   35   69:dup             
		//   36   70:invokespecial   #76  <Method void ParsableBitArray()>
		//   37   73:putfield        #78  <Field ParsableBitArray scratch>
			buffer = new byte[128];
		//   38   76:aload_0         
		//   39   77:sipush          128
		//   40   80:newarray        byte[]
		//   41   82:putfield        #80  <Field byte[] buffer>
			reset();
		//   42   85:aload_0         
		//   43   86:invokevirtual   #83  <Method void reset()>
		//   44   89:return          
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
		//    2    4:istore          4
				boolean flag1 = true;
		//    3    6:iconst_1        
		//    4    7:istore          5
				if(flag)
		//*   5    9:iload           4
		//*   6   11:ifeq            278
				{
					flag = flag1;
		//    7   14:iload           5
		//    8   16:istore          4
					if(!sliceheaderdata.isComplete)
						break label0;
		//    9   18:aload_1         
		//   10   19:getfield        #48  <Field boolean isComplete>
		//   11   22:ifeq            281
					flag = flag1;
		//   12   25:iload           5
		//   13   27:istore          4
					if(frameNum != sliceheaderdata.frameNum)
						break label0;
		//   14   29:aload_0         
		//   15   30:getfield        #50  <Field int frameNum>
		//   16   33:aload_1         
		//   17   34:getfield        #50  <Field int frameNum>
		//   18   37:icmpne          281
					flag = flag1;
		//   19   40:iload           5
		//   20   42:istore          4
					if(picParameterSetId != sliceheaderdata.picParameterSetId)
						break label0;
		//   21   44:aload_0         
		//   22   45:getfield        #52  <Field int picParameterSetId>
		//   23   48:aload_1         
		//   24   49:getfield        #52  <Field int picParameterSetId>
		//   25   52:icmpne          281
					flag = flag1;
		//   26   55:iload           5
		//   27   57:istore          4
					if(fieldPicFlag != sliceheaderdata.fieldPicFlag)
						break label0;
		//   28   59:aload_0         
		//   29   60:getfield        #54  <Field boolean fieldPicFlag>
		//   30   63:aload_1         
		//   31   64:getfield        #54  <Field boolean fieldPicFlag>
		//   32   67:icmpne          281
					if(bottomFieldFlagPresent && sliceheaderdata.bottomFieldFlagPresent)
		//*  33   70:aload_0         
		//*  34   71:getfield        #56  <Field boolean bottomFieldFlagPresent>
		//*  35   74:ifeq            99
		//*  36   77:aload_1         
		//*  37   78:getfield        #56  <Field boolean bottomFieldFlagPresent>
		//*  38   81:ifeq            99
					{
						flag = flag1;
		//   39   84:iload           5
		//   40   86:istore          4
						if(bottomFieldFlag != sliceheaderdata.bottomFieldFlag)
							break label0;
		//   41   88:aload_0         
		//   42   89:getfield        #58  <Field boolean bottomFieldFlag>
		//   43   92:aload_1         
		//   44   93:getfield        #58  <Field boolean bottomFieldFlag>
		//   45   96:icmpne          281
					}
					int i = nalRefIdc;
		//   46   99:aload_0         
		//   47  100:getfield        #60  <Field int nalRefIdc>
		//   48  103:istore_2        
					int j = sliceheaderdata.nalRefIdc;
		//   49  104:aload_1         
		//   50  105:getfield        #60  <Field int nalRefIdc>
		//   51  108:istore_3        
					if(i != j)
		//*  52  109:iload_2         
		//*  53  110:iload_3         
		//*  54  111:icmpeq          130
					{
						flag = flag1;
		//   55  114:iload           5
		//   56  116:istore          4
						if(i == 0)
							break label0;
		//   57  118:iload_2         
		//   58  119:ifeq            281
						flag = flag1;
		//   59  122:iload           5
		//   60  124:istore          4
						if(j == 0)
							break label0;
		//   61  126:iload_3         
		//   62  127:ifeq            281
					}
					if(spsData.picOrderCountType == 0 && sliceheaderdata.spsData.picOrderCountType == 0)
		//*  63  130:aload_0         
		//*  64  131:getfield        #62  <Field com.google.android.exoplayer.util.NalUnitUtil$SpsData spsData>
		//*  65  134:getfield        #67  <Field int com.google.android.exoplayer.util.NalUnitUtil$SpsData.picOrderCountType>
		//*  66  137:ifne            180
		//*  67  140:aload_1         
		//*  68  141:getfield        #62  <Field com.google.android.exoplayer.util.NalUnitUtil$SpsData spsData>
		//*  69  144:getfield        #67  <Field int com.google.android.exoplayer.util.NalUnitUtil$SpsData.picOrderCountType>
		//*  70  147:ifne            180
					{
						flag = flag1;
		//   71  150:iload           5
		//   72  152:istore          4
						if(picOrderCntLsb != sliceheaderdata.picOrderCntLsb)
							break label0;
		//   73  154:aload_0         
		//   74  155:getfield        #69  <Field int picOrderCntLsb>
		//   75  158:aload_1         
		//   76  159:getfield        #69  <Field int picOrderCntLsb>
		//   77  162:icmpne          281
						flag = flag1;
		//   78  165:iload           5
		//   79  167:istore          4
						if(deltaPicOrderCntBottom != sliceheaderdata.deltaPicOrderCntBottom)
							break label0;
		//   80  169:aload_0         
		//   81  170:getfield        #71  <Field int deltaPicOrderCntBottom>
		//   82  173:aload_1         
		//   83  174:getfield        #71  <Field int deltaPicOrderCntBottom>
		//   84  177:icmpne          281
					}
					if(spsData.picOrderCountType == 1 && sliceheaderdata.spsData.picOrderCountType == 1)
		//*  85  180:aload_0         
		//*  86  181:getfield        #62  <Field com.google.android.exoplayer.util.NalUnitUtil$SpsData spsData>
		//*  87  184:getfield        #67  <Field int com.google.android.exoplayer.util.NalUnitUtil$SpsData.picOrderCountType>
		//*  88  187:iconst_1        
		//*  89  188:icmpne          232
		//*  90  191:aload_1         
		//*  91  192:getfield        #62  <Field com.google.android.exoplayer.util.NalUnitUtil$SpsData spsData>
		//*  92  195:getfield        #67  <Field int com.google.android.exoplayer.util.NalUnitUtil$SpsData.picOrderCountType>
		//*  93  198:iconst_1        
		//*  94  199:icmpne          232
					{
						flag = flag1;
		//   95  202:iload           5
		//   96  204:istore          4
						if(deltaPicOrderCnt0 != sliceheaderdata.deltaPicOrderCnt0)
							break label0;
		//   97  206:aload_0         
		//   98  207:getfield        #73  <Field int deltaPicOrderCnt0>
		//   99  210:aload_1         
		//  100  211:getfield        #73  <Field int deltaPicOrderCnt0>
		//  101  214:icmpne          281
						flag = flag1;
		//  102  217:iload           5
		//  103  219:istore          4
						if(deltaPicOrderCnt1 != sliceheaderdata.deltaPicOrderCnt1)
							break label0;
		//  104  221:aload_0         
		//  105  222:getfield        #75  <Field int deltaPicOrderCnt1>
		//  106  225:aload_1         
		//  107  226:getfield        #75  <Field int deltaPicOrderCnt1>
		//  108  229:icmpne          281
					}
					boolean flag2 = idrPicFlag;
		//  109  232:aload_0         
		//  110  233:getfield        #77  <Field boolean idrPicFlag>
		//  111  236:istore          6
					boolean flag3 = sliceheaderdata.idrPicFlag;
		//  112  238:aload_1         
		//  113  239:getfield        #77  <Field boolean idrPicFlag>
		//  114  242:istore          7
					flag = flag1;
		//  115  244:iload           5
		//  116  246:istore          4
					if(flag2 != flag3)
						break label0;
		//  117  248:iload           6
		//  118  250:iload           7
		//  119  252:icmpne          281
					if(flag2 && flag3 && idrPicId != sliceheaderdata.idrPicId)
		//* 120  255:iload           6
		//* 121  257:ifeq            278
		//* 122  260:iload           7
		//* 123  262:ifeq            278
		//* 124  265:aload_0         
		//* 125  266:getfield        #79  <Field int idrPicId>
		//* 126  269:aload_1         
		//* 127  270:getfield        #79  <Field int idrPicId>
		//* 128  273:icmpeq          278
						return true;
		//  129  276:iconst_1        
		//  130  277:ireturn         
				}
				flag = false;
		//  131  278:iconst_0        
		//  132  279:istore          4
			}
			return flag;
		//  133  281:iload           4
		//  134  283:ireturn         
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
			if(hasSliceType)
		//*   0    0:aload_0         
		//*   1    1:getfield        #82  <Field boolean hasSliceType>
		//*   2    4:ifeq            25
			{
				int i = sliceType;
		//    3    7:aload_0         
		//    4    8:getfield        #86  <Field int sliceType>
		//    5   11:istore_1        
				if(i == 7 || i == 2)
		//*   6   12:iload_1         
		//*   7   13:bipush          7
		//*   8   15:icmpeq          23
		//*   9   18:iload_1         
		//*  10   19:iconst_2        
		//*  11   20:icmpne          25
					return true;
		//   12   23:iconst_1        
		//   13   24:ireturn         
			}
			return false;
		//   14   25:iconst_0        
		//   15   26:ireturn         
		}

		public void setAll(com.google.android.exoplayer.util.NalUnitUtil.SpsData spsdata, int i, int j, int k, int l, boolean flag, boolean flag1, 
				boolean flag2, boolean flag3, int i1, int j1, int k1, int l1, int i2)
		{
			spsData = spsdata;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #62  <Field com.google.android.exoplayer.util.NalUnitUtil$SpsData spsData>
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
		private com.google.android.exoplayer.util.NalUnitUtil.SpsData spsData;


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


	public H264Reader(TrackOutput trackoutput, SeiReader seireader, boolean flag, boolean flag1)
	{
		super(trackoutput);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #41  <Method void ElementaryStreamReader(TrackOutput)>
		seiReader = seireader;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #43  <Field SeiReader seiReader>
	//    6   10:aload_0         
	//    7   11:iconst_3        
	//    8   12:newarray        boolean[]
	//    9   14:putfield        #45  <Field boolean[] prefixFlags>
		sampleReader = new SampleReader(trackoutput, flag, flag1);
	//   10   17:aload_0         
	//   11   18:new             #8   <Class H264Reader$SampleReader>
	//   12   21:dup             
	//   13   22:aload_1         
	//   14   23:iload_3         
	//   15   24:iload           4
	//   16   26:invokespecial   #48  <Method void H264Reader$SampleReader(TrackOutput, boolean, boolean)>
	//   17   29:putfield        #50  <Field H264Reader$SampleReader sampleReader>
	//   18   32:aload_0         
	//   19   33:new             #52  <Class NalUnitTargetBuffer>
	//   20   36:dup             
	//   21   37:bipush          7
	//   22   39:sipush          128
	//   23   42:invokespecial   #55  <Method void NalUnitTargetBuffer(int, int)>
	//   24   45:putfield        #57  <Field NalUnitTargetBuffer sps>
	//   25   48:aload_0         
	//   26   49:new             #52  <Class NalUnitTargetBuffer>
	//   27   52:dup             
	//   28   53:bipush          8
	//   29   55:sipush          128
	//   30   58:invokespecial   #55  <Method void NalUnitTargetBuffer(int, int)>
	//   31   61:putfield        #59  <Field NalUnitTargetBuffer pps>
	//   32   64:aload_0         
	//   33   65:new             #52  <Class NalUnitTargetBuffer>
	//   34   68:dup             
	//   35   69:bipush          6
	//   36   71:sipush          128
	//   37   74:invokespecial   #55  <Method void NalUnitTargetBuffer(int, int)>
	//   38   77:putfield        #61  <Field NalUnitTargetBuffer sei>
	//   39   80:aload_0         
	//   40   81:new             #63  <Class ParsableByteArray>
	//   41   84:dup             
	//   42   85:invokespecial   #66  <Method void ParsableByteArray()>
	//   43   88:putfield        #68  <Field ParsableByteArray seiWrapper>
	//   44   91:return          
	}

	private void endNalUnit(long l, int i, int j, long l1)
	{
		if(!hasOutputFormat || sampleReader.needsSpsPps())
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field boolean hasOutputFormat>
	//*   2    4:ifeq            17
	//*   3    7:aload_0         
	//*   4    8:getfield        #50  <Field H264Reader$SampleReader sampleReader>
	//*   5   11:invokevirtual   #77  <Method boolean H264Reader$SampleReader.needsSpsPps()>
	//*   6   14:ifeq            304
		{
			sps.endNalUnit(j);
	//    7   17:aload_0         
	//    8   18:getfield        #57  <Field NalUnitTargetBuffer sps>
	//    9   21:iload           4
	//   10   23:invokevirtual   #80  <Method boolean NalUnitTargetBuffer.endNalUnit(int)>
	//   11   26:pop             
			pps.endNalUnit(j);
	//   12   27:aload_0         
	//   13   28:getfield        #59  <Field NalUnitTargetBuffer pps>
	//   14   31:iload           4
	//   15   33:invokevirtual   #80  <Method boolean NalUnitTargetBuffer.endNalUnit(int)>
	//   16   36:pop             
			if(!hasOutputFormat)
	//*  17   37:aload_0         
	//*  18   38:getfield        #73  <Field boolean hasOutputFormat>
	//*  19   41:ifne            225
			{
				if(sps.isCompleted() && pps.isCompleted())
	//*  20   44:aload_0         
	//*  21   45:getfield        #57  <Field NalUnitTargetBuffer sps>
	//*  22   48:invokevirtual   #83  <Method boolean NalUnitTargetBuffer.isCompleted()>
	//*  23   51:ifeq            304
	//*  24   54:aload_0         
	//*  25   55:getfield        #59  <Field NalUnitTargetBuffer pps>
	//*  26   58:invokevirtual   #83  <Method boolean NalUnitTargetBuffer.isCompleted()>
	//*  27   61:ifeq            304
				{
					ArrayList arraylist = new ArrayList();
	//   28   64:new             #85  <Class ArrayList>
	//   29   67:dup             
	//   30   68:invokespecial   #86  <Method void ArrayList()>
	//   31   71:astore          7
					((List) (arraylist)).add(((Object) (Arrays.copyOf(sps.nalData, sps.nalLength))));
	//   32   73:aload           7
	//   33   75:aload_0         
	//   34   76:getfield        #57  <Field NalUnitTargetBuffer sps>
	//   35   79:getfield        #90  <Field byte[] NalUnitTargetBuffer.nalData>
	//   36   82:aload_0         
	//   37   83:getfield        #57  <Field NalUnitTargetBuffer sps>
	//   38   86:getfield        #93  <Field int NalUnitTargetBuffer.nalLength>
	//   39   89:invokestatic    #99  <Method byte[] Arrays.copyOf(byte[], int)>
	//   40   92:invokeinterface #105 <Method boolean List.add(Object)>
	//   41   97:pop             
					((List) (arraylist)).add(((Object) (Arrays.copyOf(pps.nalData, pps.nalLength))));
	//   42   98:aload           7
	//   43  100:aload_0         
	//   44  101:getfield        #59  <Field NalUnitTargetBuffer pps>
	//   45  104:getfield        #90  <Field byte[] NalUnitTargetBuffer.nalData>
	//   46  107:aload_0         
	//   47  108:getfield        #59  <Field NalUnitTargetBuffer pps>
	//   48  111:getfield        #93  <Field int NalUnitTargetBuffer.nalLength>
	//   49  114:invokestatic    #99  <Method byte[] Arrays.copyOf(byte[], int)>
	//   50  117:invokeinterface #105 <Method boolean List.add(Object)>
	//   51  122:pop             
					com.google.android.exoplayer.util.NalUnitUtil.SpsData spsdata1 = NalUnitUtil.parseSpsNalUnit(unescape(sps));
	//   52  123:aload_0         
	//   53  124:getfield        #57  <Field NalUnitTargetBuffer sps>
	//   54  127:invokestatic    #109 <Method ParsableBitArray unescape(NalUnitTargetBuffer)>
	//   55  130:invokestatic    #115 <Method com.google.android.exoplayer.util.NalUnitUtil$SpsData NalUnitUtil.parseSpsNalUnit(ParsableBitArray)>
	//   56  133:astore          8
					com.google.android.exoplayer.util.NalUnitUtil.PpsData ppsdata1 = NalUnitUtil.parsePpsNalUnit(unescape(pps));
	//   57  135:aload_0         
	//   58  136:getfield        #59  <Field NalUnitTargetBuffer pps>
	//   59  139:invokestatic    #109 <Method ParsableBitArray unescape(NalUnitTargetBuffer)>
	//   60  142:invokestatic    #119 <Method com.google.android.exoplayer.util.NalUnitUtil$PpsData NalUnitUtil.parsePpsNalUnit(ParsableBitArray)>
	//   61  145:astore          9
					output.format(MediaFormat.createVideoFormat(((String) (null)), "video/avc", -1, -1, -1L, spsdata1.width, spsdata1.height, ((List) (arraylist)), -1, spsdata1.pixelWidthAspectRatio));
	//   62  147:aload_0         
	//   63  148:getfield        #123 <Field TrackOutput output>
	//   64  151:aconst_null     
	//   65  152:ldc1            #125 <String "video/avc">
	//   66  154:iconst_m1       
	//   67  155:iconst_m1       
	//   68  156:ldc2w           #126 <Long -1L>
	//   69  159:aload           8
	//   70  161:getfield        #132 <Field int com.google.android.exoplayer.util.NalUnitUtil$SpsData.width>
	//   71  164:aload           8
	//   72  166:getfield        #135 <Field int com.google.android.exoplayer.util.NalUnitUtil$SpsData.height>
	//   73  169:aload           7
	//   74  171:iconst_m1       
	//   75  172:aload           8
	//   76  174:getfield        #139 <Field float com.google.android.exoplayer.util.NalUnitUtil$SpsData.pixelWidthAspectRatio>
	//   77  177:invokestatic    #145 <Method MediaFormat MediaFormat.createVideoFormat(String, String, int, int, long, int, int, List, int, float)>
	//   78  180:invokeinterface #151 <Method void TrackOutput.format(MediaFormat)>
					hasOutputFormat = true;
	//   79  185:aload_0         
	//   80  186:iconst_1        
	//   81  187:putfield        #73  <Field boolean hasOutputFormat>
					sampleReader.putSps(spsdata1);
	//   82  190:aload_0         
	//   83  191:getfield        #50  <Field H264Reader$SampleReader sampleReader>
	//   84  194:aload           8
	//   85  196:invokevirtual   #155 <Method void H264Reader$SampleReader.putSps(com.google.android.exoplayer.util.NalUnitUtil$SpsData)>
					sampleReader.putPps(ppsdata1);
	//   86  199:aload_0         
	//   87  200:getfield        #50  <Field H264Reader$SampleReader sampleReader>
	//   88  203:aload           9
	//   89  205:invokevirtual   #159 <Method void H264Reader$SampleReader.putPps(com.google.android.exoplayer.util.NalUnitUtil$PpsData)>
					sps.reset();
	//   90  208:aload_0         
	//   91  209:getfield        #57  <Field NalUnitTargetBuffer sps>
	//   92  212:invokevirtual   #162 <Method void NalUnitTargetBuffer.reset()>
					pps.reset();
	//   93  215:aload_0         
	//   94  216:getfield        #59  <Field NalUnitTargetBuffer pps>
	//   95  219:invokevirtual   #162 <Method void NalUnitTargetBuffer.reset()>
				}
			} else
	//*  96  222:goto            304
			if(sps.isCompleted())
	//*  97  225:aload_0         
	//*  98  226:getfield        #57  <Field NalUnitTargetBuffer sps>
	//*  99  229:invokevirtual   #83  <Method boolean NalUnitTargetBuffer.isCompleted()>
	//* 100  232:ifeq            266
			{
				com.google.android.exoplayer.util.NalUnitUtil.SpsData spsdata = NalUnitUtil.parseSpsNalUnit(unescape(sps));
	//  101  235:aload_0         
	//  102  236:getfield        #57  <Field NalUnitTargetBuffer sps>
	//  103  239:invokestatic    #109 <Method ParsableBitArray unescape(NalUnitTargetBuffer)>
	//  104  242:invokestatic    #115 <Method com.google.android.exoplayer.util.NalUnitUtil$SpsData NalUnitUtil.parseSpsNalUnit(ParsableBitArray)>
	//  105  245:astore          7
				sampleReader.putSps(spsdata);
	//  106  247:aload_0         
	//  107  248:getfield        #50  <Field H264Reader$SampleReader sampleReader>
	//  108  251:aload           7
	//  109  253:invokevirtual   #155 <Method void H264Reader$SampleReader.putSps(com.google.android.exoplayer.util.NalUnitUtil$SpsData)>
				sps.reset();
	//  110  256:aload_0         
	//  111  257:getfield        #57  <Field NalUnitTargetBuffer sps>
	//  112  260:invokevirtual   #162 <Method void NalUnitTargetBuffer.reset()>
			} else
	//* 113  263:goto            304
			if(pps.isCompleted())
	//* 114  266:aload_0         
	//* 115  267:getfield        #59  <Field NalUnitTargetBuffer pps>
	//* 116  270:invokevirtual   #83  <Method boolean NalUnitTargetBuffer.isCompleted()>
	//* 117  273:ifeq            304
			{
				com.google.android.exoplayer.util.NalUnitUtil.PpsData ppsdata = NalUnitUtil.parsePpsNalUnit(unescape(pps));
	//  118  276:aload_0         
	//  119  277:getfield        #59  <Field NalUnitTargetBuffer pps>
	//  120  280:invokestatic    #109 <Method ParsableBitArray unescape(NalUnitTargetBuffer)>
	//  121  283:invokestatic    #119 <Method com.google.android.exoplayer.util.NalUnitUtil$PpsData NalUnitUtil.parsePpsNalUnit(ParsableBitArray)>
	//  122  286:astore          7
				sampleReader.putPps(ppsdata);
	//  123  288:aload_0         
	//  124  289:getfield        #50  <Field H264Reader$SampleReader sampleReader>
	//  125  292:aload           7
	//  126  294:invokevirtual   #159 <Method void H264Reader$SampleReader.putPps(com.google.android.exoplayer.util.NalUnitUtil$PpsData)>
				pps.reset();
	//  127  297:aload_0         
	//  128  298:getfield        #59  <Field NalUnitTargetBuffer pps>
	//  129  301:invokevirtual   #162 <Method void NalUnitTargetBuffer.reset()>
			}
		}
		if(sei.endNalUnit(j))
	//* 130  304:aload_0         
	//* 131  305:getfield        #61  <Field NalUnitTargetBuffer sei>
	//* 132  308:iload           4
	//* 133  310:invokevirtual   #80  <Method boolean NalUnitTargetBuffer.endNalUnit(int)>
	//* 134  313:ifeq            372
		{
			j = NalUnitUtil.unescapeStream(sei.nalData, sei.nalLength);
	//  135  316:aload_0         
	//  136  317:getfield        #61  <Field NalUnitTargetBuffer sei>
	//  137  320:getfield        #90  <Field byte[] NalUnitTargetBuffer.nalData>
	//  138  323:aload_0         
	//  139  324:getfield        #61  <Field NalUnitTargetBuffer sei>
	//  140  327:getfield        #93  <Field int NalUnitTargetBuffer.nalLength>
	//  141  330:invokestatic    #166 <Method int NalUnitUtil.unescapeStream(byte[], int)>
	//  142  333:istore          4
			seiWrapper.reset(sei.nalData, j);
	//  143  335:aload_0         
	//  144  336:getfield        #68  <Field ParsableByteArray seiWrapper>
	//  145  339:aload_0         
	//  146  340:getfield        #61  <Field NalUnitTargetBuffer sei>
	//  147  343:getfield        #90  <Field byte[] NalUnitTargetBuffer.nalData>
	//  148  346:iload           4
	//  149  348:invokevirtual   #169 <Method void ParsableByteArray.reset(byte[], int)>
			seiWrapper.setPosition(4);
	//  150  351:aload_0         
	//  151  352:getfield        #68  <Field ParsableByteArray seiWrapper>
	//  152  355:iconst_4        
	//  153  356:invokevirtual   #173 <Method void ParsableByteArray.setPosition(int)>
			seiReader.consume(l1, seiWrapper);
	//  154  359:aload_0         
	//  155  360:getfield        #43  <Field SeiReader seiReader>
	//  156  363:lload           5
	//  157  365:aload_0         
	//  158  366:getfield        #68  <Field ParsableByteArray seiWrapper>
	//  159  369:invokevirtual   #179 <Method void SeiReader.consume(long, ParsableByteArray)>
		}
		sampleReader.endNalUnit(l, i);
	//  160  372:aload_0         
	//  161  373:getfield        #50  <Field H264Reader$SampleReader sampleReader>
	//  162  376:lload_1         
	//  163  377:iload_3         
	//  164  378:invokevirtual   #182 <Method void H264Reader$SampleReader.endNalUnit(long, int)>
	//  165  381:return          
	}

	private void nalUnitData(byte abyte0[], int i, int j)
	{
		if(!hasOutputFormat || sampleReader.needsSpsPps())
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field boolean hasOutputFormat>
	//*   2    4:ifeq            17
	//*   3    7:aload_0         
	//*   4    8:getfield        #50  <Field H264Reader$SampleReader sampleReader>
	//*   5   11:invokevirtual   #77  <Method boolean H264Reader$SampleReader.needsSpsPps()>
	//*   6   14:ifeq            37
		{
			sps.appendToNalUnit(abyte0, i, j);
	//    7   17:aload_0         
	//    8   18:getfield        #57  <Field NalUnitTargetBuffer sps>
	//    9   21:aload_1         
	//   10   22:iload_2         
	//   11   23:iload_3         
	//   12   24:invokevirtual   #187 <Method void NalUnitTargetBuffer.appendToNalUnit(byte[], int, int)>
			pps.appendToNalUnit(abyte0, i, j);
	//   13   27:aload_0         
	//   14   28:getfield        #59  <Field NalUnitTargetBuffer pps>
	//   15   31:aload_1         
	//   16   32:iload_2         
	//   17   33:iload_3         
	//   18   34:invokevirtual   #187 <Method void NalUnitTargetBuffer.appendToNalUnit(byte[], int, int)>
		}
		sei.appendToNalUnit(abyte0, i, j);
	//   19   37:aload_0         
	//   20   38:getfield        #61  <Field NalUnitTargetBuffer sei>
	//   21   41:aload_1         
	//   22   42:iload_2         
	//   23   43:iload_3         
	//   24   44:invokevirtual   #187 <Method void NalUnitTargetBuffer.appendToNalUnit(byte[], int, int)>
		sampleReader.appendToNalUnit(abyte0, i, j);
	//   25   47:aload_0         
	//   26   48:getfield        #50  <Field H264Reader$SampleReader sampleReader>
	//   27   51:aload_1         
	//   28   52:iload_2         
	//   29   53:iload_3         
	//   30   54:invokevirtual   #188 <Method void H264Reader$SampleReader.appendToNalUnit(byte[], int, int)>
	//   31   57:return          
	}

	private void startNalUnit(long l, int i, long l1)
	{
		if(!hasOutputFormat || sampleReader.needsSpsPps())
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field boolean hasOutputFormat>
	//*   2    4:ifeq            17
	//*   3    7:aload_0         
	//*   4    8:getfield        #50  <Field H264Reader$SampleReader sampleReader>
	//*   5   11:invokevirtual   #77  <Method boolean H264Reader$SampleReader.needsSpsPps()>
	//*   6   14:ifeq            33
		{
			sps.startNalUnit(i);
	//    7   17:aload_0         
	//    8   18:getfield        #57  <Field NalUnitTargetBuffer sps>
	//    9   21:iload_3         
	//   10   22:invokevirtual   #192 <Method void NalUnitTargetBuffer.startNalUnit(int)>
			pps.startNalUnit(i);
	//   11   25:aload_0         
	//   12   26:getfield        #59  <Field NalUnitTargetBuffer pps>
	//   13   29:iload_3         
	//   14   30:invokevirtual   #192 <Method void NalUnitTargetBuffer.startNalUnit(int)>
		}
		sei.startNalUnit(i);
	//   15   33:aload_0         
	//   16   34:getfield        #61  <Field NalUnitTargetBuffer sei>
	//   17   37:iload_3         
	//   18   38:invokevirtual   #192 <Method void NalUnitTargetBuffer.startNalUnit(int)>
		sampleReader.startNalUnit(l, i, l1);
	//   19   41:aload_0         
	//   20   42:getfield        #50  <Field H264Reader$SampleReader sampleReader>
	//   21   45:lload_1         
	//   22   46:iload_3         
	//   23   47:lload           4
	//   24   49:invokevirtual   #194 <Method void H264Reader$SampleReader.startNalUnit(long, int, long)>
	//   25   52:return          
	}

	private static ParsableBitArray unescape(NalUnitTargetBuffer nalunittargetbuffer)
	{
		int i = NalUnitUtil.unescapeStream(nalunittargetbuffer.nalData, nalunittargetbuffer.nalLength);
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field byte[] NalUnitTargetBuffer.nalData>
	//    2    4:aload_0         
	//    3    5:getfield        #93  <Field int NalUnitTargetBuffer.nalLength>
	//    4    8:invokestatic    #166 <Method int NalUnitUtil.unescapeStream(byte[], int)>
	//    5   11:istore_1        
		nalunittargetbuffer = ((NalUnitTargetBuffer) (new ParsableBitArray(nalunittargetbuffer.nalData, i)));
	//    6   12:new             #196 <Class ParsableBitArray>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:getfield        #90  <Field byte[] NalUnitTargetBuffer.nalData>
	//   10   20:iload_1         
	//   11   21:invokespecial   #198 <Method void ParsableBitArray(byte[], int)>
	//   12   24:astore_0        
		((ParsableBitArray) (nalunittargetbuffer)).skipBits(32);
	//   13   25:aload_0         
	//   14   26:bipush          32
	//   15   28:invokevirtual   #201 <Method void ParsableBitArray.skipBits(int)>
		return ((ParsableBitArray) (nalunittargetbuffer));
	//   16   31:aload_0         
	//   17   32:areturn         
	}

	public void consume(ParsableByteArray parsablebytearray)
	{
		if(parsablebytearray.bytesLeft() > 0)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #206 <Method int ParsableByteArray.bytesLeft()>
	//*   2    4:ifle            171
		{
			int i = parsablebytearray.getPosition();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #209 <Method int ParsableByteArray.getPosition()>
	//    5   11:istore_2        
			int j = parsablebytearray.limit();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #212 <Method int ParsableByteArray.limit()>
	//    8   16:istore_3        
			byte abyte0[] = parsablebytearray.data;
	//    9   17:aload_1         
	//   10   18:getfield        #215 <Field byte[] ParsableByteArray.data>
	//   11   21:astore          10
			totalBytesWritten = totalBytesWritten + (long)parsablebytearray.bytesLeft();
	//   12   23:aload_0         
	//   13   24:aload_0         
	//   14   25:getfield        #217 <Field long totalBytesWritten>
	//   15   28:aload_1         
	//   16   29:invokevirtual   #206 <Method int ParsableByteArray.bytesLeft()>
	//   17   32:i2l             
	//   18   33:ladd            
	//   19   34:putfield        #217 <Field long totalBytesWritten>
			output.sampleData(parsablebytearray, parsablebytearray.bytesLeft());
	//   20   37:aload_0         
	//   21   38:getfield        #123 <Field TrackOutput output>
	//   22   41:aload_1         
	//   23   42:aload_1         
	//   24   43:invokevirtual   #206 <Method int ParsableByteArray.bytesLeft()>
	//   25   46:invokeinterface #221 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
			do
			{
				int k = NalUnitUtil.findNalUnit(abyte0, i, j, prefixFlags);
	//   26   51:aload           10
	//   27   53:iload_2         
	//   28   54:iload_3         
	//   29   55:aload_0         
	//   30   56:getfield        #45  <Field boolean[] prefixFlags>
	//   31   59:invokestatic    #225 <Method int NalUnitUtil.findNalUnit(byte[], int, int, boolean[])>
	//   32   62:istore          4
				if(k == j)
	//*  33   64:iload           4
	//*  34   66:iload_3         
	//*  35   67:icmpne          79
				{
					nalUnitData(abyte0, i, j);
	//   36   70:aload_0         
	//   37   71:aload           10
	//   38   73:iload_2         
	//   39   74:iload_3         
	//   40   75:invokespecial   #227 <Method void nalUnitData(byte[], int, int)>
					return;
	//   41   78:return          
				}
				int l = NalUnitUtil.getNalUnitType(abyte0, k);
	//   42   79:aload           10
	//   43   81:iload           4
	//   44   83:invokestatic    #230 <Method int NalUnitUtil.getNalUnitType(byte[], int)>
	//   45   86:istore          5
				int j1 = k - i;
	//   46   88:iload           4
	//   47   90:iload_2         
	//   48   91:isub            
	//   49   92:istore          7
				if(j1 > 0)
	//*  50   94:iload           7
	//*  51   96:ifle            108
					nalUnitData(abyte0, i, k);
	//   52   99:aload_0         
	//   53  100:aload           10
	//   54  102:iload_2         
	//   55  103:iload           4
	//   56  105:invokespecial   #227 <Method void nalUnitData(byte[], int, int)>
				int i1 = j - k;
	//   57  108:iload_3         
	//   58  109:iload           4
	//   59  111:isub            
	//   60  112:istore          6
				long l1 = totalBytesWritten - (long)i1;
	//   61  114:aload_0         
	//   62  115:getfield        #217 <Field long totalBytesWritten>
	//   63  118:iload           6
	//   64  120:i2l             
	//   65  121:lsub            
	//   66  122:lstore          8
				if(j1 < 0)
	//*  67  124:iload           7
	//*  68  126:ifge            136
					i = -j1;
	//   69  129:iload           7
	//   70  131:ineg            
	//   71  132:istore_2        
				else
	//*  72  133:goto            138
					i = 0;
	//   73  136:iconst_0        
	//   74  137:istore_2        
				endNalUnit(l1, i1, i, pesTimeUs);
	//   75  138:aload_0         
	//   76  139:lload           8
	//   77  141:iload           6
	//   78  143:iload_2         
	//   79  144:aload_0         
	//   80  145:getfield        #232 <Field long pesTimeUs>
	//   81  148:invokespecial   #234 <Method void endNalUnit(long, int, int, long)>
				startNalUnit(l1, l, pesTimeUs);
	//   82  151:aload_0         
	//   83  152:lload           8
	//   84  154:iload           5
	//   85  156:aload_0         
	//   86  157:getfield        #232 <Field long pesTimeUs>
	//   87  160:invokespecial   #235 <Method void startNalUnit(long, int, long)>
				i = k + 3;
	//   88  163:iload           4
	//   89  165:iconst_3        
	//   90  166:iadd            
	//   91  167:istore_2        
			} while(true);
	//   92  168:goto            51
		} else
		{
			return;
	//   93  171:return          
		}
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
	//    2    2:putfield        #232 <Field long pesTimeUs>
	//    3    5:return          
	}

	public void seek()
	{
		NalUnitUtil.clearPrefixFlags(prefixFlags);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field boolean[] prefixFlags>
	//    2    4:invokestatic    #243 <Method void NalUnitUtil.clearPrefixFlags(boolean[])>
		sps.reset();
	//    3    7:aload_0         
	//    4    8:getfield        #57  <Field NalUnitTargetBuffer sps>
	//    5   11:invokevirtual   #162 <Method void NalUnitTargetBuffer.reset()>
		pps.reset();
	//    6   14:aload_0         
	//    7   15:getfield        #59  <Field NalUnitTargetBuffer pps>
	//    8   18:invokevirtual   #162 <Method void NalUnitTargetBuffer.reset()>
		sei.reset();
	//    9   21:aload_0         
	//   10   22:getfield        #61  <Field NalUnitTargetBuffer sei>
	//   11   25:invokevirtual   #162 <Method void NalUnitTargetBuffer.reset()>
		sampleReader.reset();
	//   12   28:aload_0         
	//   13   29:getfield        #50  <Field H264Reader$SampleReader sampleReader>
	//   14   32:invokevirtual   #244 <Method void H264Reader$SampleReader.reset()>
		totalBytesWritten = 0L;
	//   15   35:aload_0         
	//   16   36:lconst_0        
	//   17   37:putfield        #217 <Field long totalBytesWritten>
	//   18   40:return          
	}

	private static final int NAL_UNIT_TYPE_PPS = 8;
	private static final int NAL_UNIT_TYPE_SEI = 6;
	private static final int NAL_UNIT_TYPE_SPS = 7;
	private boolean hasOutputFormat;
	private long pesTimeUs;
	private final NalUnitTargetBuffer pps = new NalUnitTargetBuffer(8, 128);
	private final boolean prefixFlags[] = new boolean[3];
	private final SampleReader sampleReader;
	private final NalUnitTargetBuffer sei = new NalUnitTargetBuffer(6, 128);
	private final SeiReader seiReader;
	private final ParsableByteArray seiWrapper = new ParsableByteArray();
	private final NalUnitTargetBuffer sps = new NalUnitTargetBuffer(7, 128);
	private long totalBytesWritten;
}
