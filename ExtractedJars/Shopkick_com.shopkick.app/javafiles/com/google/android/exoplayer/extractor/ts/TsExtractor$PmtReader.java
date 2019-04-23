// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer.extractor.DummyTrackOutput;
import com.google.android.exoplayer.extractor.ExtractorOutput;
import com.google.android.exoplayer.util.*;

// Referenced classes of package com.google.android.exoplayer.extractor.ts:
//			TsExtractor, Id3Reader, Ac3Reader, MpegAudioReader, 
//			H262Reader, DtsReader, H265Reader, SeiReader, 
//			H264Reader, AdtsReader

private class TsExtractor$PmtReader extends eader
{

	private int readPrivateDataStreamType(ParsableByteArray parsablebytearray, int i)
	{
		int k = parsablebytearray.getPosition() + i;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #48  <Method int ParsableByteArray.getPosition()>
	//    2    4:iload_2         
	//    3    5:iadd            
	//    4    6:istore          4
		int j = -1;
	//    5    8:iconst_m1       
	//    6    9:istore_3        
		do
		{
			i = j;
	//    7   10:iload_3         
	//    8   11:istore_2        
			if(parsablebytearray.getPosition() >= k)
				break;
	//    9   12:aload_1         
	//   10   13:invokevirtual   #48  <Method int ParsableByteArray.getPosition()>
	//   11   16:iload           4
	//   12   18:icmpge          146
			int i1 = parsablebytearray.readUnsignedByte();
	//   13   21:aload_1         
	//   14   22:invokevirtual   #51  <Method int ParsableByteArray.readUnsignedByte()>
	//   15   25:istore          6
			int l = parsablebytearray.readUnsignedByte();
	//   16   27:aload_1         
	//   17   28:invokevirtual   #51  <Method int ParsableByteArray.readUnsignedByte()>
	//   18   31:istore          5
			if(i1 == 5)
	//*  19   33:iload           6
	//*  20   35:iconst_5        
	//*  21   36:icmpne          94
			{
				long l1 = parsablebytearray.readUnsignedInt();
	//   22   39:aload_1         
	//   23   40:invokevirtual   #55  <Method long ParsableByteArray.readUnsignedInt()>
	//   24   43:lstore          7
				if(l1 == TsExtractor.access$500())
	//*  25   45:lload           7
	//*  26   47:invokestatic    #58  <Method long TsExtractor.access$500()>
	//*  27   50:lcmp            
	//*  28   51:ifne            61
					i = 129;
	//   29   54:sipush          129
	//   30   57:istore_2        
				else
	//*  31   58:goto            146
				if(l1 == TsExtractor.access$600())
	//*  32   61:lload           7
	//*  33   63:invokestatic    #61  <Method long TsExtractor.access$600()>
	//*  34   66:lcmp            
	//*  35   67:ifne            77
				{
					i = 135;
	//   36   70:sipush          135
	//   37   73:istore_2        
				} else
	//*  38   74:goto            146
				{
					i = j;
	//   39   77:iload_3         
	//   40   78:istore_2        
					if(l1 == TsExtractor.access$700())
	//*  41   79:lload           7
	//*  42   81:invokestatic    #64  <Method long TsExtractor.access$700()>
	//*  43   84:lcmp            
	//*  44   85:ifne            146
						i = 36;
	//   45   88:bipush          36
	//   46   90:istore_2        
				}
				break;
	//   47   91:goto            146
			}
			if(i1 == 106)
	//*  48   94:iload           6
	//*  49   96:bipush          106
	//*  50   98:icmpne          108
				i = 129;
	//   51  101:sipush          129
	//   52  104:istore_2        
			else
	//*  53  105:goto            135
			if(i1 == 122)
	//*  54  108:iload           6
	//*  55  110:bipush          122
	//*  56  112:icmpne          122
			{
				i = 135;
	//   57  115:sipush          135
	//   58  118:istore_2        
			} else
	//*  59  119:goto            135
			{
				i = j;
	//   60  122:iload_3         
	//   61  123:istore_2        
				if(i1 == 123)
	//*  62  124:iload           6
	//*  63  126:bipush          123
	//*  64  128:icmpne          135
					i = 138;
	//   65  131:sipush          138
	//   66  134:istore_2        
			}
			parsablebytearray.skipBytes(l);
	//   67  135:aload_1         
	//   68  136:iload           5
	//   69  138:invokevirtual   #68  <Method void ParsableByteArray.skipBytes(int)>
			j = i;
	//   70  141:iload_2         
	//   71  142:istore_3        
		} while(true);
	//   72  143:goto            10
		parsablebytearray.setPosition(k);
	//   73  146:aload_1         
	//   74  147:iload           4
	//   75  149:invokevirtual   #71  <Method void ParsableByteArray.setPosition(int)>
		return i;
	//   76  152:iload_2         
	//   77  153:ireturn         
	}

	public void consume(ParsableByteArray parsablebytearray, boolean flag, ExtractorOutput extractoroutput)
	{
		int k;
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            76
		{
			parsablebytearray.skipBytes(parsablebytearray.readUnsignedByte());
	//    2    4:aload_1         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #51  <Method int ParsableByteArray.readUnsignedByte()>
	//    5    9:invokevirtual   #68  <Method void ParsableByteArray.skipBytes(int)>
			parsablebytearray.readBytes(pmtScratch, 3);
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #32  <Field ParsableBitArray pmtScratch>
	//    9   17:iconst_3        
	//   10   18:invokevirtual   #77  <Method void ParsableByteArray.readBytes(ParsableBitArray, int)>
			pmtScratch.skipBits(12);
	//   11   21:aload_0         
	//   12   22:getfield        #32  <Field ParsableBitArray pmtScratch>
	//   13   25:bipush          12
	//   14   27:invokevirtual   #80  <Method void ParsableBitArray.skipBits(int)>
			sectionLength = pmtScratch.readBits(12);
	//   15   30:aload_0         
	//   16   31:aload_0         
	//   17   32:getfield        #32  <Field ParsableBitArray pmtScratch>
	//   18   35:bipush          12
	//   19   37:invokevirtual   #84  <Method int ParsableBitArray.readBits(int)>
	//   20   40:putfield        #86  <Field int sectionLength>
			sectionBytesRead = 0;
	//   21   43:aload_0         
	//   22   44:iconst_0        
	//   23   45:putfield        #88  <Field int sectionBytesRead>
			crc = Util.crc(pmtScratch.data, 0, 3, -1);
	//   24   48:aload_0         
	//   25   49:aload_0         
	//   26   50:getfield        #32  <Field ParsableBitArray pmtScratch>
	//   27   53:getfield        #92  <Field byte[] ParsableBitArray.data>
	//   28   56:iconst_0        
	//   29   57:iconst_3        
	//   30   58:iconst_m1       
	//   31   59:invokestatic    #97  <Method int Util.crc(byte[], int, int, int)>
	//   32   62:putfield        #99  <Field int crc>
			sectionData.reset(sectionLength);
	//   33   65:aload_0         
	//   34   66:getfield        #39  <Field ParsableByteArray sectionData>
	//   35   69:aload_0         
	//   36   70:getfield        #86  <Field int sectionLength>
	//   37   73:invokevirtual   #102 <Method void ParsableByteArray.reset(int)>
		}
		int i = Math.min(parsablebytearray.bytesLeft(), sectionLength - sectionBytesRead);
	//   38   76:aload_1         
	//   39   77:invokevirtual   #105 <Method int ParsableByteArray.bytesLeft()>
	//   40   80:aload_0         
	//   41   81:getfield        #86  <Field int sectionLength>
	//   42   84:aload_0         
	//   43   85:getfield        #88  <Field int sectionBytesRead>
	//   44   88:isub            
	//   45   89:invokestatic    #111 <Method int Math.min(int, int)>
	//   46   92:istore          4
		parsablebytearray.readBytes(sectionData.data, sectionBytesRead, i);
	//   47   94:aload_1         
	//   48   95:aload_0         
	//   49   96:getfield        #39  <Field ParsableByteArray sectionData>
	//   50   99:getfield        #112 <Field byte[] ParsableByteArray.data>
	//   51  102:aload_0         
	//   52  103:getfield        #88  <Field int sectionBytesRead>
	//   53  106:iload           4
	//   54  108:invokevirtual   #115 <Method void ParsableByteArray.readBytes(byte[], int, int)>
		sectionBytesRead = sectionBytesRead + i;
	//   55  111:aload_0         
	//   56  112:aload_0         
	//   57  113:getfield        #88  <Field int sectionBytesRead>
	//   58  116:iload           4
	//   59  118:iadd            
	//   60  119:putfield        #88  <Field int sectionBytesRead>
		if(sectionBytesRead < sectionLength)
	//*  61  122:aload_0         
	//*  62  123:getfield        #88  <Field int sectionBytesRead>
	//*  63  126:aload_0         
	//*  64  127:getfield        #86  <Field int sectionLength>
	//*  65  130:icmpge          134
			return;
	//   66  133:return          
		if(Util.crc(sectionData.data, 0, sectionLength, crc) != 0)
	//*  67  134:aload_0         
	//*  68  135:getfield        #39  <Field ParsableByteArray sectionData>
	//*  69  138:getfield        #112 <Field byte[] ParsableByteArray.data>
	//*  70  141:iconst_0        
	//*  71  142:aload_0         
	//*  72  143:getfield        #86  <Field int sectionLength>
	//*  73  146:aload_0         
	//*  74  147:getfield        #99  <Field int crc>
	//*  75  150:invokestatic    #97  <Method int Util.crc(byte[], int, int, int)>
	//*  76  153:ifeq            157
			return;
	//   77  156:return          
		sectionData.skipBytes(7);
	//   78  157:aload_0         
	//   79  158:getfield        #39  <Field ParsableByteArray sectionData>
	//   80  161:bipush          7
	//   81  163:invokevirtual   #68  <Method void ParsableByteArray.skipBytes(int)>
		sectionData.readBytes(pmtScratch, 2);
	//   82  166:aload_0         
	//   83  167:getfield        #39  <Field ParsableByteArray sectionData>
	//   84  170:aload_0         
	//   85  171:getfield        #32  <Field ParsableBitArray pmtScratch>
	//   86  174:iconst_2        
	//   87  175:invokevirtual   #77  <Method void ParsableByteArray.readBytes(ParsableBitArray, int)>
		pmtScratch.skipBits(4);
	//   88  178:aload_0         
	//   89  179:getfield        #32  <Field ParsableBitArray pmtScratch>
	//   90  182:iconst_4        
	//   91  183:invokevirtual   #80  <Method void ParsableBitArray.skipBits(int)>
		i = pmtScratch.readBits(12);
	//   92  186:aload_0         
	//   93  187:getfield        #32  <Field ParsableBitArray pmtScratch>
	//   94  190:bipush          12
	//   95  192:invokevirtual   #84  <Method int ParsableBitArray.readBits(int)>
	//   96  195:istore          4
		sectionData.skipBytes(i);
	//   97  197:aload_0         
	//   98  198:getfield        #39  <Field ParsableByteArray sectionData>
	//   99  201:iload           4
	//  100  203:invokevirtual   #68  <Method void ParsableByteArray.skipBytes(int)>
		if((TsExtractor.access$100(TsExtractor.this) & 0x10) != 0 && id3Reader == null)
	//* 101  206:aload_0         
	//* 102  207:getfield        #22  <Field TsExtractor this$0>
	//* 103  210:invokestatic    #119 <Method int TsExtractor.access$100(TsExtractor)>
	//* 104  213:bipush          16
	//* 105  215:iand            
	//* 106  216:ifeq            251
	//* 107  219:aload_0         
	//* 108  220:getfield        #22  <Field TsExtractor this$0>
	//* 109  223:getfield        #123 <Field Id3Reader TsExtractor.id3Reader>
	//* 110  226:ifnonnull       251
			id3Reader = new Id3Reader(extractoroutput.track(21));
	//  111  229:aload_0         
	//  112  230:getfield        #22  <Field TsExtractor this$0>
	//  113  233:new             #125 <Class Id3Reader>
	//  114  236:dup             
	//  115  237:aload_3         
	//  116  238:bipush          21
	//  117  240:invokeinterface #131 <Method com.google.android.exoplayer.extractor.TrackOutput ExtractorOutput.track(int)>
	//  118  245:invokespecial   #134 <Method void Id3Reader(com.google.android.exoplayer.extractor.TrackOutput)>
	//  119  248:putfield        #123 <Field Id3Reader TsExtractor.id3Reader>
		k = sectionLength - 9 - i - 4;
	//  120  251:aload_0         
	//  121  252:getfield        #86  <Field int sectionLength>
	//  122  255:bipush          9
	//  123  257:isub            
	//  124  258:iload           4
	//  125  260:isub            
	//  126  261:iconst_4        
	//  127  262:isub            
	//  128  263:istore          5
_L19:
		if(k <= 0) goto _L2; else goto _L1
	//  129  265:iload           5
	//  130  267:ifle            911
_L1:
		int j;
		int l;
		int i1;
		sectionData.readBytes(pmtScratch, 5);
	//  131  270:aload_0         
	//  132  271:getfield        #39  <Field ParsableByteArray sectionData>
	//  133  274:aload_0         
	//  134  275:getfield        #32  <Field ParsableBitArray pmtScratch>
	//  135  278:iconst_5        
	//  136  279:invokevirtual   #77  <Method void ParsableByteArray.readBytes(ParsableBitArray, int)>
		j = pmtScratch.readBits(8);
	//  137  282:aload_0         
	//  138  283:getfield        #32  <Field ParsableBitArray pmtScratch>
	//  139  286:bipush          8
	//  140  288:invokevirtual   #84  <Method int ParsableBitArray.readBits(int)>
	//  141  291:istore          4
		pmtScratch.skipBits(3);
	//  142  293:aload_0         
	//  143  294:getfield        #32  <Field ParsableBitArray pmtScratch>
	//  144  297:iconst_3        
	//  145  298:invokevirtual   #80  <Method void ParsableBitArray.skipBits(int)>
		l = pmtScratch.readBits(13);
	//  146  301:aload_0         
	//  147  302:getfield        #32  <Field ParsableBitArray pmtScratch>
	//  148  305:bipush          13
	//  149  307:invokevirtual   #84  <Method int ParsableBitArray.readBits(int)>
	//  150  310:istore          6
		pmtScratch.skipBits(4);
	//  151  312:aload_0         
	//  152  313:getfield        #32  <Field ParsableBitArray pmtScratch>
	//  153  316:iconst_4        
	//  154  317:invokevirtual   #80  <Method void ParsableBitArray.skipBits(int)>
		i1 = pmtScratch.readBits(12);
	//  155  320:aload_0         
	//  156  321:getfield        #32  <Field ParsableBitArray pmtScratch>
	//  157  324:bipush          12
	//  158  326:invokevirtual   #84  <Method int ParsableBitArray.readBits(int)>
	//  159  329:istore          7
		if(j == 6)
	//* 160  331:iload           4
	//* 161  333:bipush          6
	//* 162  335:icmpne          353
			j = readPrivateDataStreamType(sectionData, i1);
	//  163  338:aload_0         
	//  164  339:aload_0         
	//  165  340:getfield        #39  <Field ParsableByteArray sectionData>
	//  166  343:iload           7
	//  167  345:invokespecial   #136 <Method int readPrivateDataStreamType(ParsableByteArray, int)>
	//  168  348:istore          4
		else
	//* 169  350:goto            362
			sectionData.skipBytes(i1);
	//  170  353:aload_0         
	//  171  354:getfield        #39  <Field ParsableByteArray sectionData>
	//  172  357:iload           7
	//  173  359:invokevirtual   #68  <Method void ParsableByteArray.skipBytes(int)>
		i1 = k - (i1 + 5);
	//  174  362:iload           5
	//  175  364:iload           7
	//  176  366:iconst_5        
	//  177  367:iadd            
	//  178  368:isub            
	//  179  369:istore          7
		if((TsExtractor.access$100(TsExtractor.this) & 0x10) != 0)
	//* 180  371:aload_0         
	//* 181  372:getfield        #22  <Field TsExtractor this$0>
	//* 182  375:invokestatic    #119 <Method int TsExtractor.access$100(TsExtractor)>
	//* 183  378:bipush          16
	//* 184  380:iand            
	//* 185  381:ifeq            391
			k = j;
	//  186  384:iload           4
	//  187  386:istore          5
		else
	//* 188  388:goto            395
			k = l;
	//  189  391:iload           6
	//  190  393:istore          5
		if(trackIds.get(k))
	//* 191  395:aload_0         
	//* 192  396:getfield        #22  <Field TsExtractor this$0>
	//* 193  399:getfield        #140 <Field SparseBooleanArray TsExtractor.trackIds>
	//* 194  402:iload           5
	//* 195  404:invokevirtual   #146 <Method boolean SparseBooleanArray.get(int)>
	//* 196  407:ifeq            413
			continue; /* Loop/switch isn't completed */
	//  197  410:goto            904
		parsablebytearray = null;
	//  198  413:aconst_null     
	//  199  414:astore_1        
		if(j == 15) goto _L4; else goto _L3
	//  200  415:iload           4
	//  201  417:bipush          15
	//  202  419:icmpeq          822
_L3:
		if(j == 21) goto _L6; else goto _L5
	//  203  422:iload           4
	//  204  424:bipush          21
	//  205  426:icmpeq          774
_L5:
		if(j == 27) goto _L8; else goto _L7
	//  206  429:iload           4
	//  207  431:bipush          27
	//  208  433:icmpeq          670
_L7:
		if(j == 36) goto _L10; else goto _L9
	//  209  436:iload           4
	//  210  438:bipush          36
	//  211  440:icmpeq          631
_L9:
		if(j == 135) goto _L12; else goto _L11
	//  212  443:iload           4
	//  213  445:sipush          135
	//  214  448:icmpeq          611
_L11:
		if(j == 138) goto _L14; else goto _L13
	//  215  451:iload           4
	//  216  453:sipush          138
	//  217  456:icmpeq          592
_L13:
		j;
	//  218  459:iload           4
		JVM INSTR tableswitch 2 4: default 488
	//	               2 573
	//	               3 554
	//	               4 535;
	//  219  461:tableswitch     2 4: default 488
	//	               2 573
	//	               3 554
	//	               4 535
		   goto _L15 _L16 _L17 _L18
_L15:
		switch(j)
	//* 220  488:iload           4
		{
	//* 221  490:tableswitch     129 130: default 512
	//	               129 515
	//	               130 592
		default:
			break; /* Loop/switch isn't completed */
	//  222  512:goto            860

		case 129: 
			parsablebytearray = ((ParsableByteArray) (new Ac3Reader(extractoroutput.track(k), false)));
	//  223  515:new             #148 <Class Ac3Reader>
	//  224  518:dup             
	//  225  519:aload_3         
	//  226  520:iload           5
	//  227  522:invokeinterface #131 <Method com.google.android.exoplayer.extractor.TrackOutput ExtractorOutput.track(int)>
	//  228  527:iconst_0        
	//  229  528:invokespecial   #151 <Method void Ac3Reader(com.google.android.exoplayer.extractor.TrackOutput, boolean)>
	//  230  531:astore_1        
			break; /* Loop/switch isn't completed */
	//  231  532:goto            860

		case 130: 
			break;
		}
		  goto _L14
_L18:
		parsablebytearray = ((ParsableByteArray) (new MpegAudioReader(extractoroutput.track(k))));
	//  232  535:new             #153 <Class MpegAudioReader>
	//  233  538:dup             
	//  234  539:aload_3         
	//  235  540:iload           5
	//  236  542:invokeinterface #131 <Method com.google.android.exoplayer.extractor.TrackOutput ExtractorOutput.track(int)>
	//  237  547:invokespecial   #154 <Method void MpegAudioReader(com.google.android.exoplayer.extractor.TrackOutput)>
	//  238  550:astore_1        
		break; /* Loop/switch isn't completed */
	//  239  551:goto            860
_L17:
		parsablebytearray = ((ParsableByteArray) (new MpegAudioReader(extractoroutput.track(k))));
	//  240  554:new             #153 <Class MpegAudioReader>
	//  241  557:dup             
	//  242  558:aload_3         
	//  243  559:iload           5
	//  244  561:invokeinterface #131 <Method com.google.android.exoplayer.extractor.TrackOutput ExtractorOutput.track(int)>
	//  245  566:invokespecial   #154 <Method void MpegAudioReader(com.google.android.exoplayer.extractor.TrackOutput)>
	//  246  569:astore_1        
		break; /* Loop/switch isn't completed */
	//  247  570:goto            860
_L16:
		parsablebytearray = ((ParsableByteArray) (new H262Reader(extractoroutput.track(k))));
	//  248  573:new             #156 <Class H262Reader>
	//  249  576:dup             
	//  250  577:aload_3         
	//  251  578:iload           5
	//  252  580:invokeinterface #131 <Method com.google.android.exoplayer.extractor.TrackOutput ExtractorOutput.track(int)>
	//  253  585:invokespecial   #157 <Method void H262Reader(com.google.android.exoplayer.extractor.TrackOutput)>
	//  254  588:astore_1        
		break; /* Loop/switch isn't completed */
	//  255  589:goto            860
_L14:
		parsablebytearray = ((ParsableByteArray) (new DtsReader(extractoroutput.track(k))));
	//  256  592:new             #159 <Class DtsReader>
	//  257  595:dup             
	//  258  596:aload_3         
	//  259  597:iload           5
	//  260  599:invokeinterface #131 <Method com.google.android.exoplayer.extractor.TrackOutput ExtractorOutput.track(int)>
	//  261  604:invokespecial   #160 <Method void DtsReader(com.google.android.exoplayer.extractor.TrackOutput)>
	//  262  607:astore_1        
		break; /* Loop/switch isn't completed */
	//  263  608:goto            860
_L12:
		parsablebytearray = ((ParsableByteArray) (new Ac3Reader(extractoroutput.track(k), true)));
	//  264  611:new             #148 <Class Ac3Reader>
	//  265  614:dup             
	//  266  615:aload_3         
	//  267  616:iload           5
	//  268  618:invokeinterface #131 <Method com.google.android.exoplayer.extractor.TrackOutput ExtractorOutput.track(int)>
	//  269  623:iconst_1        
	//  270  624:invokespecial   #151 <Method void Ac3Reader(com.google.android.exoplayer.extractor.TrackOutput, boolean)>
	//  271  627:astore_1        
		break; /* Loop/switch isn't completed */
	//  272  628:goto            860
_L10:
		parsablebytearray = ((ParsableByteArray) (new H265Reader(extractoroutput.track(k), new SeiReader(extractoroutput.track(TsExtractor.access$208(TsExtractor.this))))));
	//  273  631:new             #162 <Class H265Reader>
	//  274  634:dup             
	//  275  635:aload_3         
	//  276  636:iload           5
	//  277  638:invokeinterface #131 <Method com.google.android.exoplayer.extractor.TrackOutput ExtractorOutput.track(int)>
	//  278  643:new             #164 <Class SeiReader>
	//  279  646:dup             
	//  280  647:aload_3         
	//  281  648:aload_0         
	//  282  649:getfield        #22  <Field TsExtractor this$0>
	//  283  652:invokestatic    #167 <Method int TsExtractor.access$208(TsExtractor)>
	//  284  655:invokeinterface #131 <Method com.google.android.exoplayer.extractor.TrackOutput ExtractorOutput.track(int)>
	//  285  660:invokespecial   #168 <Method void SeiReader(com.google.android.exoplayer.extractor.TrackOutput)>
	//  286  663:invokespecial   #171 <Method void H265Reader(com.google.android.exoplayer.extractor.TrackOutput, SeiReader)>
	//  287  666:astore_1        
		break; /* Loop/switch isn't completed */
	//  288  667:goto            860
_L8:
		if((TsExtractor.access$100(TsExtractor.this) & 4) == 0)
	//* 289  670:aload_0         
	//* 290  671:getfield        #22  <Field TsExtractor this$0>
	//* 291  674:invokestatic    #119 <Method int TsExtractor.access$100(TsExtractor)>
	//* 292  677:iconst_4        
	//* 293  678:iand            
	//* 294  679:ifeq            685
	//* 295  682:goto            860
		{
			parsablebytearray = ((ParsableByteArray) (extractoroutput.track(k)));
	//  296  685:aload_3         
	//  297  686:iload           5
	//  298  688:invokeinterface #131 <Method com.google.android.exoplayer.extractor.TrackOutput ExtractorOutput.track(int)>
	//  299  693:astore_1        
			SeiReader seireader = new SeiReader(extractoroutput.track(TsExtractor.access$208(TsExtractor.this)));
	//  300  694:new             #164 <Class SeiReader>
	//  301  697:dup             
	//  302  698:aload_3         
	//  303  699:aload_0         
	//  304  700:getfield        #22  <Field TsExtractor this$0>
	//  305  703:invokestatic    #167 <Method int TsExtractor.access$208(TsExtractor)>
	//  306  706:invokeinterface #131 <Method com.google.android.exoplayer.extractor.TrackOutput ExtractorOutput.track(int)>
	//  307  711:invokespecial   #168 <Method void SeiReader(com.google.android.exoplayer.extractor.TrackOutput)>
	//  308  714:astore          9
			if((TsExtractor.access$100(TsExtractor.this) & 1) != 0)
	//* 309  716:aload_0         
	//* 310  717:getfield        #22  <Field TsExtractor this$0>
	//* 311  720:invokestatic    #119 <Method int TsExtractor.access$100(TsExtractor)>
	//* 312  723:iconst_1        
	//* 313  724:iand            
	//* 314  725:ifeq            733
				flag = true;
	//  315  728:iconst_1        
	//  316  729:istore_2        
			else
	//* 317  730:goto            735
				flag = false;
	//  318  733:iconst_0        
	//  319  734:istore_2        
			boolean flag1;
			if((TsExtractor.access$100(TsExtractor.this) & 8) != 0)
	//* 320  735:aload_0         
	//* 321  736:getfield        #22  <Field TsExtractor this$0>
	//* 322  739:invokestatic    #119 <Method int TsExtractor.access$100(TsExtractor)>
	//* 323  742:bipush          8
	//* 324  744:iand            
	//* 325  745:ifeq            754
				flag1 = true;
	//  326  748:iconst_1        
	//  327  749:istore          8
			else
	//* 328  751:goto            757
				flag1 = false;
	//  329  754:iconst_0        
	//  330  755:istore          8
			parsablebytearray = ((ParsableByteArray) (new H264Reader(((com.google.android.exoplayer.extractor.TrackOutput) (parsablebytearray)), seireader, flag, flag1)));
	//  331  757:new             #173 <Class H264Reader>
	//  332  760:dup             
	//  333  761:aload_1         
	//  334  762:aload           9
	//  335  764:iload_2         
	//  336  765:iload           8
	//  337  767:invokespecial   #176 <Method void H264Reader(com.google.android.exoplayer.extractor.TrackOutput, SeiReader, boolean, boolean)>
	//  338  770:astore_1        
		}
		break; /* Loop/switch isn't completed */
	//  339  771:goto            860
_L6:
		if((TsExtractor.access$100(TsExtractor.this) & 0x10) != 0)
	//* 340  774:aload_0         
	//* 341  775:getfield        #22  <Field TsExtractor this$0>
	//* 342  778:invokestatic    #119 <Method int TsExtractor.access$100(TsExtractor)>
	//* 343  781:bipush          16
	//* 344  783:iand            
	//* 345  784:ifeq            798
			parsablebytearray = ((ParsableByteArray) (id3Reader));
	//  346  787:aload_0         
	//  347  788:getfield        #22  <Field TsExtractor this$0>
	//  348  791:getfield        #123 <Field Id3Reader TsExtractor.id3Reader>
	//  349  794:astore_1        
		else
	//* 350  795:goto            860
			parsablebytearray = ((ParsableByteArray) (new Id3Reader(extractoroutput.track(TsExtractor.access$208(TsExtractor.this)))));
	//  351  798:new             #125 <Class Id3Reader>
	//  352  801:dup             
	//  353  802:aload_3         
	//  354  803:aload_0         
	//  355  804:getfield        #22  <Field TsExtractor this$0>
	//  356  807:invokestatic    #167 <Method int TsExtractor.access$208(TsExtractor)>
	//  357  810:invokeinterface #131 <Method com.google.android.exoplayer.extractor.TrackOutput ExtractorOutput.track(int)>
	//  358  815:invokespecial   #134 <Method void Id3Reader(com.google.android.exoplayer.extractor.TrackOutput)>
	//  359  818:astore_1        
		break; /* Loop/switch isn't completed */
	//  360  819:goto            860
_L4:
		if((TsExtractor.access$100(TsExtractor.this) & 2) == 0)
	//* 361  822:aload_0         
	//* 362  823:getfield        #22  <Field TsExtractor this$0>
	//* 363  826:invokestatic    #119 <Method int TsExtractor.access$100(TsExtractor)>
	//* 364  829:iconst_2        
	//* 365  830:iand            
	//* 366  831:ifeq            837
	//* 367  834:goto            860
			parsablebytearray = ((ParsableByteArray) (new AdtsReader(extractoroutput.track(k), ((com.google.android.exoplayer.extractor.TrackOutput) (new DummyTrackOutput())))));
	//  368  837:new             #178 <Class AdtsReader>
	//  369  840:dup             
	//  370  841:aload_3         
	//  371  842:iload           5
	//  372  844:invokeinterface #131 <Method com.google.android.exoplayer.extractor.TrackOutput ExtractorOutput.track(int)>
	//  373  849:new             #180 <Class DummyTrackOutput>
	//  374  852:dup             
	//  375  853:invokespecial   #181 <Method void DummyTrackOutput()>
	//  376  856:invokespecial   #184 <Method void AdtsReader(com.google.android.exoplayer.extractor.TrackOutput, com.google.android.exoplayer.extractor.TrackOutput)>
	//  377  859:astore_1        
		if(parsablebytearray != null)
	//* 378  860:aload_1         
	//* 379  861:ifnull          904
		{
			trackIds.put(k, true);
	//  380  864:aload_0         
	//  381  865:getfield        #22  <Field TsExtractor this$0>
	//  382  868:getfield        #140 <Field SparseBooleanArray TsExtractor.trackIds>
	//  383  871:iload           5
	//  384  873:iconst_1        
	//  385  874:invokevirtual   #188 <Method void SparseBooleanArray.put(int, boolean)>
			tsPayloadReaders.put(l, ((Object) (new TsExtractor$PesReader(((ElementaryStreamReader) (parsablebytearray)), TsExtractor.access$300(TsExtractor.this)))));
	//  386  877:aload_0         
	//  387  878:getfield        #22  <Field TsExtractor this$0>
	//  388  881:getfield        #192 <Field SparseArray TsExtractor.tsPayloadReaders>
	//  389  884:iload           6
	//  390  886:new             #194 <Class TsExtractor$PesReader>
	//  391  889:dup             
	//  392  890:aload_1         
	//  393  891:aload_0         
	//  394  892:getfield        #22  <Field TsExtractor this$0>
	//  395  895:invokestatic    #198 <Method PtsTimestampAdjuster TsExtractor.access$300(TsExtractor)>
	//  396  898:invokespecial   #201 <Method void TsExtractor$PesReader(ElementaryStreamReader, PtsTimestampAdjuster)>
	//  397  901:invokevirtual   #206 <Method void SparseArray.put(int, Object)>
		}
		k = i1;
	//  398  904:iload           7
	//  399  906:istore          5
		  goto _L19
	//* 400  908:goto            265
_L2:
		if((TsExtractor.access$100(TsExtractor.this) & 0x10) != 0)
	//* 401  911:aload_0         
	//* 402  912:getfield        #22  <Field TsExtractor this$0>
	//* 403  915:invokestatic    #119 <Method int TsExtractor.access$100(TsExtractor)>
	//* 404  918:bipush          16
	//* 405  920:iand            
	//* 406  921:ifeq            943
		{
			if(!TsExtractor.access$400(TsExtractor.this))
	//* 407  924:aload_0         
	//* 408  925:getfield        #22  <Field TsExtractor this$0>
	//* 409  928:invokestatic    #210 <Method boolean TsExtractor.access$400(TsExtractor)>
	//* 410  931:ifne            974
				extractoroutput.endTracks();
	//  411  934:aload_3         
	//  412  935:invokeinterface #213 <Method void ExtractorOutput.endTracks()>
		} else
	//* 413  940:goto            974
		{
			tsPayloadReaders.remove(0);
	//  414  943:aload_0         
	//  415  944:getfield        #22  <Field TsExtractor this$0>
	//  416  947:getfield        #192 <Field SparseArray TsExtractor.tsPayloadReaders>
	//  417  950:iconst_0        
	//  418  951:invokevirtual   #216 <Method void SparseArray.remove(int)>
			tsPayloadReaders.remove(pid);
	//  419  954:aload_0         
	//  420  955:getfield        #22  <Field TsExtractor this$0>
	//  421  958:getfield        #192 <Field SparseArray TsExtractor.tsPayloadReaders>
	//  422  961:aload_0         
	//  423  962:getfield        #41  <Field int pid>
	//  424  965:invokevirtual   #216 <Method void SparseArray.remove(int)>
			extractoroutput.endTracks();
	//  425  968:aload_3         
	//  426  969:invokeinterface #213 <Method void ExtractorOutput.endTracks()>
		}
		TsExtractor.access$402(TsExtractor.this, true);
	//  427  974:aload_0         
	//  428  975:getfield        #22  <Field TsExtractor this$0>
	//  429  978:iconst_1        
	//  430  979:invokestatic    #220 <Method boolean TsExtractor.access$402(TsExtractor, boolean)>
	//  431  982:pop             
		return;
	//  432  983:return          
	}

	public void seek()
	{
	//    0    0:return          
	}

	private int crc;
	private final int pid;
	private final ParsableBitArray pmtScratch = new ParsableBitArray(new byte[5]);
	private int sectionBytesRead;
	private final ParsableByteArray sectionData = new ParsableByteArray();
	private int sectionLength;
	final TsExtractor this$0;

	public TsExtractor$PmtReader(int i)
	{
		this$0 = TsExtractor.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field TsExtractor this$0>
		super(((TsExtractor._cls1) (null)));
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:invokespecial   #25  <Method void TsExtractor$TsPayloadReader(TsExtractor$1)>
	//    6   10:aload_0         
	//    7   11:new             #27  <Class ParsableBitArray>
	//    8   14:dup             
	//    9   15:iconst_5        
	//   10   16:newarray        byte[]
	//   11   18:invokespecial   #30  <Method void ParsableBitArray(byte[])>
	//   12   21:putfield        #32  <Field ParsableBitArray pmtScratch>
	//   13   24:aload_0         
	//   14   25:new             #34  <Class ParsableByteArray>
	//   15   28:dup             
	//   16   29:invokespecial   #37  <Method void ParsableByteArray()>
	//   17   32:putfield        #39  <Field ParsableByteArray sectionData>
		pid = i;
	//   18   35:aload_0         
	//   19   36:iload_2         
	//   20   37:putfield        #41  <Field int pid>
	//   21   40:return          
	}
}
