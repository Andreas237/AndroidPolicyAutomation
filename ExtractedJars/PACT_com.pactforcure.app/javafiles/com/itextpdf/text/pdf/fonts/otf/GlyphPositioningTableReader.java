// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.fonts.otf;

import com.itextpdf.text.log.Logger;
import com.itextpdf.text.pdf.RandomAccessFileOrArray;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf.fonts.otf:
//			OpenTypeFontTableReader, FontReadingException

public class GlyphPositioningTableReader extends OpenTypeFontTableReader
{
	static class MarkRecord
	{

		final int markAnchorOffset;
		final int markClass;

		public MarkRecord(int i, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			markClass = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #17  <Field int markClass>
			markAnchorOffset = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #19  <Field int markAnchorOffset>
		//    8   14:return          
		}
	}

	static class PosLookupRecord
	{

		final int lookupListIndex;
		final int sequenceIndex;

		public PosLookupRecord(int i, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			sequenceIndex = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #17  <Field int sequenceIndex>
			lookupListIndex = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #19  <Field int lookupListIndex>
		//    8   14:return          
		}
	}


	public GlyphPositioningTableReader(RandomAccessFileOrArray randomaccessfileorarray, int i)
		throws IOException
	{
		super(randomaccessfileorarray, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #16  <Method void OpenTypeFontTableReader(RandomAccessFileOrArray, int)>
	//    4    6:return          
	}

	private void readAnchorTable(int i)
		throws IOException
	{
		rf.seek(i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field RandomAccessFileOrArray rf>
	//    2    4:iload_1         
	//    3    5:i2l             
	//    4    6:invokevirtual   #30  <Method void RandomAccessFileOrArray.seek(long)>
		i = ((int) (rf.readShort()));
	//    5    9:aload_0         
	//    6   10:getfield        #24  <Field RandomAccessFileOrArray rf>
	//    7   13:invokevirtual   #34  <Method short RandomAccessFileOrArray.readShort()>
	//    8   16:istore_1        
		if(i != 1)
	//*   9   17:iload_1         
	//*  10   18:iconst_1        
	//*  11   19:icmpeq          52
			System.err.println((new StringBuilder()).append("The extra features of the AnchorFormat ").append(i).append(" will not be used").toString());
	//   12   22:getstatic       #40  <Field PrintStream System.err>
	//   13   25:new             #42  <Class StringBuilder>
	//   14   28:dup             
	//   15   29:invokespecial   #45  <Method void StringBuilder()>
	//   16   32:ldc1            #47  <String "The extra features of the AnchorFormat ">
	//   17   34:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   18   37:iload_1         
	//   19   38:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//   20   41:ldc1            #56  <String " will not be used">
	//   21   43:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   22   46:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   23   49:invokevirtual   #66  <Method void PrintStream.println(String)>
		rf.readShort();
	//   24   52:aload_0         
	//   25   53:getfield        #24  <Field RandomAccessFileOrArray rf>
	//   26   56:invokevirtual   #34  <Method short RandomAccessFileOrArray.readShort()>
	//   27   59:pop             
		rf.readShort();
	//   28   60:aload_0         
	//   29   61:getfield        #24  <Field RandomAccessFileOrArray rf>
	//   30   64:invokevirtual   #34  <Method short RandomAccessFileOrArray.readShort()>
	//   31   67:pop             
	//   32   68:return          
	}

	private void readBaseArrayTable(int i, int j)
		throws IOException
	{
		rf.seek(i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field RandomAccessFileOrArray rf>
	//    2    4:iload_1         
	//    3    5:i2l             
	//    4    6:invokevirtual   #30  <Method void RandomAccessFileOrArray.seek(long)>
		short word0 = rf.readShort();
	//    5    9:aload_0         
	//    6   10:getfield        #24  <Field RandomAccessFileOrArray rf>
	//    7   13:invokevirtual   #34  <Method short RandomAccessFileOrArray.readShort()>
	//    8   16:istore          5
		Object obj = ((Object) (new HashSet()));
	//    9   18:new             #70  <Class HashSet>
	//   10   21:dup             
	//   11   22:invokespecial   #71  <Method void HashSet()>
	//   12   25:astore          6
		for(int k = 0; k < word0; k++)
	//*  13   27:iconst_0        
	//*  14   28:istore_3        
	//*  15   29:iload_3         
	//*  16   30:iload           5
	//*  17   32:icmpge          78
		{
			for(int l = 0; l < j; l++)
	//*  18   35:iconst_0        
	//*  19   36:istore          4
	//*  20   38:iload           4
	//*  21   40:iload_2         
	//*  22   41:icmpge          71
				((Set) (obj)).add(((Object) (Integer.valueOf(((int) (rf.readShort()))))));
	//   23   44:aload           6
	//   24   46:aload_0         
	//   25   47:getfield        #24  <Field RandomAccessFileOrArray rf>
	//   26   50:invokevirtual   #34  <Method short RandomAccessFileOrArray.readShort()>
	//   27   53:invokestatic    #77  <Method Integer Integer.valueOf(int)>
	//   28   56:invokeinterface #83  <Method boolean Set.add(Object)>
	//   29   61:pop             

	//   30   62:iload           4
	//   31   64:iconst_1        
	//   32   65:iadd            
	//   33   66:istore          4
		}

	//   34   68:goto            38
	//   35   71:iload_3         
	//   36   72:iconst_1        
	//   37   73:iadd            
	//   38   74:istore_3        
	//*  39   75:goto            29
		for(obj = ((Object) (((Set) (obj)).iterator())); ((Iterator) (obj)).hasNext(); readAnchorTable(i + ((Integer)((Iterator) (obj)).next()).intValue()));
	//   40   78:aload           6
	//   41   80:invokeinterface #87  <Method Iterator Set.iterator()>
	//   42   85:astore          6
	//   43   87:aload           6
	//   44   89:invokeinterface #93  <Method boolean Iterator.hasNext()>
	//   45   94:ifeq            119
	//   46   97:aload_0         
	//   47   98:iload_1         
	//   48   99:aload           6
	//   49  101:invokeinterface #97  <Method Object Iterator.next()>
	//   50  106:checkcast       #73  <Class Integer>
	//   51  109:invokevirtual   #101 <Method int Integer.intValue()>
	//   52  112:iadd            
	//   53  113:invokespecial   #103 <Method void readAnchorTable(int)>
	//*  54  116:goto            87
	//   55  119:return          
	}

	private void readChainingContextPositioningFormat_3(int i)
		throws IOException
	{
		short word0 = rf.readShort();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field RandomAccessFileOrArray rf>
	//    2    4:invokevirtual   #34  <Method short RandomAccessFileOrArray.readShort()>
	//    3    7:istore_3        
		LOG.debug((new StringBuilder()).append("backtrackGlyphCount=").append(((int) (word0))).toString());
	//    4    8:getstatic       #108 <Field Logger LOG>
	//    5   11:new             #42  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #45  <Method void StringBuilder()>
	//    8   18:ldc1            #110 <String "backtrackGlyphCount=">
	//    9   20:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:iload_3         
	//   11   24:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//   12   27:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   13   30:invokeinterface #115 <Method void Logger.debug(String)>
		Object obj2 = ((Object) (new ArrayList(((int) (word0)))));
	//   14   35:new             #117 <Class ArrayList>
	//   15   38:dup             
	//   16   39:iload_3         
	//   17   40:invokespecial   #119 <Method void ArrayList(int)>
	//   18   43:astore          8
		for(int j = 0; j < word0; j++)
	//*  19   45:iconst_0        
	//*  20   46:istore_2        
	//*  21   47:iload_2         
	//*  22   48:iload_3         
	//*  23   49:icmpge          77
			((List) (obj2)).add(((Object) (Integer.valueOf(((int) (rf.readShort()))))));
	//   24   52:aload           8
	//   25   54:aload_0         
	//   26   55:getfield        #24  <Field RandomAccessFileOrArray rf>
	//   27   58:invokevirtual   #34  <Method short RandomAccessFileOrArray.readShort()>
	//   28   61:invokestatic    #77  <Method Integer Integer.valueOf(int)>
	//   29   64:invokeinterface #122 <Method boolean List.add(Object)>
	//   30   69:pop             

	//   31   70:iload_2         
	//   32   71:iconst_1        
	//   33   72:iadd            
	//   34   73:istore_2        
	//*  35   74:goto            47
		word0 = rf.readShort();
	//   36   77:aload_0         
	//   37   78:getfield        #24  <Field RandomAccessFileOrArray rf>
	//   38   81:invokevirtual   #34  <Method short RandomAccessFileOrArray.readShort()>
	//   39   84:istore_3        
		LOG.debug((new StringBuilder()).append("inputGlyphCount=").append(((int) (word0))).toString());
	//   40   85:getstatic       #108 <Field Logger LOG>
	//   41   88:new             #42  <Class StringBuilder>
	//   42   91:dup             
	//   43   92:invokespecial   #45  <Method void StringBuilder()>
	//   44   95:ldc1            #124 <String "inputGlyphCount=">
	//   45   97:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   46  100:iload_3         
	//   47  101:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//   48  104:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   49  107:invokeinterface #115 <Method void Logger.debug(String)>
		Object obj1 = ((Object) (new ArrayList(((int) (word0)))));
	//   50  112:new             #117 <Class ArrayList>
	//   51  115:dup             
	//   52  116:iload_3         
	//   53  117:invokespecial   #119 <Method void ArrayList(int)>
	//   54  120:astore          7
		for(int k = 0; k < word0; k++)
	//*  55  122:iconst_0        
	//*  56  123:istore_2        
	//*  57  124:iload_2         
	//*  58  125:iload_3         
	//*  59  126:icmpge          154
			((List) (obj1)).add(((Object) (Integer.valueOf(((int) (rf.readShort()))))));
	//   60  129:aload           7
	//   61  131:aload_0         
	//   62  132:getfield        #24  <Field RandomAccessFileOrArray rf>
	//   63  135:invokevirtual   #34  <Method short RandomAccessFileOrArray.readShort()>
	//   64  138:invokestatic    #77  <Method Integer Integer.valueOf(int)>
	//   65  141:invokeinterface #122 <Method boolean List.add(Object)>
	//   66  146:pop             

	//   67  147:iload_2         
	//   68  148:iconst_1        
	//   69  149:iadd            
	//   70  150:istore_2        
	//*  71  151:goto            124
		word0 = rf.readShort();
	//   72  154:aload_0         
	//   73  155:getfield        #24  <Field RandomAccessFileOrArray rf>
	//   74  158:invokevirtual   #34  <Method short RandomAccessFileOrArray.readShort()>
	//   75  161:istore_3        
		LOG.debug((new StringBuilder()).append("lookaheadGlyphCount=").append(((int) (word0))).toString());
	//   76  162:getstatic       #108 <Field Logger LOG>
	//   77  165:new             #42  <Class StringBuilder>
	//   78  168:dup             
	//   79  169:invokespecial   #45  <Method void StringBuilder()>
	//   80  172:ldc1            #126 <String "lookaheadGlyphCount=">
	//   81  174:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   82  177:iload_3         
	//   83  178:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//   84  181:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   85  184:invokeinterface #115 <Method void Logger.debug(String)>
		Object obj = ((Object) (new ArrayList(((int) (word0)))));
	//   86  189:new             #117 <Class ArrayList>
	//   87  192:dup             
	//   88  193:iload_3         
	//   89  194:invokespecial   #119 <Method void ArrayList(int)>
	//   90  197:astore          6
		for(int l = 0; l < word0; l++)
	//*  91  199:iconst_0        
	//*  92  200:istore_2        
	//*  93  201:iload_2         
	//*  94  202:iload_3         
	//*  95  203:icmpge          231
			((List) (obj)).add(((Object) (Integer.valueOf(((int) (rf.readShort()))))));
	//   96  206:aload           6
	//   97  208:aload_0         
	//   98  209:getfield        #24  <Field RandomAccessFileOrArray rf>
	//   99  212:invokevirtual   #34  <Method short RandomAccessFileOrArray.readShort()>
	//  100  215:invokestatic    #77  <Method Integer Integer.valueOf(int)>
	//  101  218:invokeinterface #122 <Method boolean List.add(Object)>
	//  102  223:pop             

	//  103  224:iload_2         
	//  104  225:iconst_1        
	//  105  226:iadd            
	//  106  227:istore_2        
	//* 107  228:goto            201
		word0 = rf.readShort();
	//  108  231:aload_0         
	//  109  232:getfield        #24  <Field RandomAccessFileOrArray rf>
	//  110  235:invokevirtual   #34  <Method short RandomAccessFileOrArray.readShort()>
	//  111  238:istore_3        
		LOG.debug((new StringBuilder()).append("posCount=").append(((int) (word0))).toString());
	//  112  239:getstatic       #108 <Field Logger LOG>
	//  113  242:new             #42  <Class StringBuilder>
	//  114  245:dup             
	//  115  246:invokespecial   #45  <Method void StringBuilder()>
	//  116  249:ldc1            #128 <String "posCount=">
	//  117  251:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  118  254:iload_3         
	//  119  255:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//  120  258:invokevirtual   #60  <Method String StringBuilder.toString()>
	//  121  261:invokeinterface #115 <Method void Logger.debug(String)>
		ArrayList arraylist = new ArrayList(((int) (word0)));
	//  122  266:new             #117 <Class ArrayList>
	//  123  269:dup             
	//  124  270:iload_3         
	//  125  271:invokespecial   #119 <Method void ArrayList(int)>
	//  126  274:astore          9
		for(int i1 = 0; i1 < word0; i1++)
	//* 127  276:iconst_0        
	//* 128  277:istore_2        
	//* 129  278:iload_2         
	//* 130  279:iload_3         
	//* 131  280:icmpge          365
		{
			short word1 = rf.readShort();
	//  132  283:aload_0         
	//  133  284:getfield        #24  <Field RandomAccessFileOrArray rf>
	//  134  287:invokevirtual   #34  <Method short RandomAccessFileOrArray.readShort()>
	//  135  290:istore          4
			short word2 = rf.readShort();
	//  136  292:aload_0         
	//  137  293:getfield        #24  <Field RandomAccessFileOrArray rf>
	//  138  296:invokevirtual   #34  <Method short RandomAccessFileOrArray.readShort()>
	//  139  299:istore          5
			LOG.debug((new StringBuilder()).append("sequenceIndex=").append(((int) (word1))).append(", lookupListIndex=").append(((int) (word2))).toString());
	//  140  301:getstatic       #108 <Field Logger LOG>
	//  141  304:new             #42  <Class StringBuilder>
	//  142  307:dup             
	//  143  308:invokespecial   #45  <Method void StringBuilder()>
	//  144  311:ldc1            #130 <String "sequenceIndex=">
	//  145  313:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  146  316:iload           4
	//  147  318:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//  148  321:ldc1            #132 <String ", lookupListIndex=">
	//  149  323:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  150  326:iload           5
	//  151  328:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//  152  331:invokevirtual   #60  <Method String StringBuilder.toString()>
	//  153  334:invokeinterface #115 <Method void Logger.debug(String)>
			((List) (arraylist)).add(((Object) (new PosLookupRecord(((int) (word1)), ((int) (word2))))));
	//  154  339:aload           9
	//  155  341:new             #9   <Class GlyphPositioningTableReader$PosLookupRecord>
	//  156  344:dup             
	//  157  345:iload           4
	//  158  347:iload           5
	//  159  349:invokespecial   #134 <Method void GlyphPositioningTableReader$PosLookupRecord(int, int)>
	//  160  352:invokeinterface #122 <Method boolean List.add(Object)>
	//  161  357:pop             
		}

	//  162  358:iload_2         
	//  163  359:iconst_1        
	//  164  360:iadd            
	//  165  361:istore_2        
	//* 166  362:goto            278
		List list2;
		for(obj2 = ((Object) (((List) (obj2)).iterator())); ((Iterator) (obj2)).hasNext(); LOG.debug((new StringBuilder()).append("backtrackGlyphs=").append(((Object) (list2))).toString()))
	//* 167  365:aload           8
	//* 168  367:invokeinterface #135 <Method Iterator List.iterator()>
	//* 169  372:astore          8
	//* 170  374:aload           8
	//* 171  376:invokeinterface #93  <Method boolean Iterator.hasNext()>
	//* 172  381:ifeq            436
			list2 = readCoverageFormat(i + ((Integer)((Iterator) (obj2)).next()).intValue());
	//  173  384:aload_0         
	//  174  385:iload_1         
	//  175  386:aload           8
	//  176  388:invokeinterface #97  <Method Object Iterator.next()>
	//  177  393:checkcast       #73  <Class Integer>
	//  178  396:invokevirtual   #101 <Method int Integer.intValue()>
	//  179  399:iadd            
	//  180  400:invokevirtual   #139 <Method List readCoverageFormat(int)>
	//  181  403:astore          9

	//  182  405:getstatic       #108 <Field Logger LOG>
	//  183  408:new             #42  <Class StringBuilder>
	//  184  411:dup             
	//  185  412:invokespecial   #45  <Method void StringBuilder()>
	//  186  415:ldc1            #141 <String "backtrackGlyphs=">
	//  187  417:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  188  420:aload           9
	//  189  422:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
	//  190  425:invokevirtual   #60  <Method String StringBuilder.toString()>
	//  191  428:invokeinterface #115 <Method void Logger.debug(String)>
	//* 192  433:goto            374
		List list1;
		for(obj1 = ((Object) (((List) (obj1)).iterator())); ((Iterator) (obj1)).hasNext(); LOG.debug((new StringBuilder()).append("inputGlyphs=").append(((Object) (list1))).toString()))
	//* 193  436:aload           7
	//* 194  438:invokeinterface #135 <Method Iterator List.iterator()>
	//* 195  443:astore          7
	//* 196  445:aload           7
	//* 197  447:invokeinterface #93  <Method boolean Iterator.hasNext()>
	//* 198  452:ifeq            507
			list1 = readCoverageFormat(i + ((Integer)((Iterator) (obj1)).next()).intValue());
	//  199  455:aload_0         
	//  200  456:iload_1         
	//  201  457:aload           7
	//  202  459:invokeinterface #97  <Method Object Iterator.next()>
	//  203  464:checkcast       #73  <Class Integer>
	//  204  467:invokevirtual   #101 <Method int Integer.intValue()>
	//  205  470:iadd            
	//  206  471:invokevirtual   #139 <Method List readCoverageFormat(int)>
	//  207  474:astore          8

	//  208  476:getstatic       #108 <Field Logger LOG>
	//  209  479:new             #42  <Class StringBuilder>
	//  210  482:dup             
	//  211  483:invokespecial   #45  <Method void StringBuilder()>
	//  212  486:ldc1            #146 <String "inputGlyphs=">
	//  213  488:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  214  491:aload           8
	//  215  493:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
	//  216  496:invokevirtual   #60  <Method String StringBuilder.toString()>
	//  217  499:invokeinterface #115 <Method void Logger.debug(String)>
	//* 218  504:goto            445
		List list;
		for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); LOG.debug((new StringBuilder()).append("lookaheadGlyphs=").append(((Object) (list))).toString()))
	//* 219  507:aload           6
	//* 220  509:invokeinterface #135 <Method Iterator List.iterator()>
	//* 221  514:astore          6
	//* 222  516:aload           6
	//* 223  518:invokeinterface #93  <Method boolean Iterator.hasNext()>
	//* 224  523:ifeq            578
			list = readCoverageFormat(i + ((Integer)((Iterator) (obj)).next()).intValue());
	//  225  526:aload_0         
	//  226  527:iload_1         
	//  227  528:aload           6
	//  228  530:invokeinterface #97  <Method Object Iterator.next()>
	//  229  535:checkcast       #73  <Class Integer>
	//  230  538:invokevirtual   #101 <Method int Integer.intValue()>
	//  231  541:iadd            
	//  232  542:invokevirtual   #139 <Method List readCoverageFormat(int)>
	//  233  545:astore          7

	//  234  547:getstatic       #108 <Field Logger LOG>
	//  235  550:new             #42  <Class StringBuilder>
	//  236  553:dup             
	//  237  554:invokespecial   #45  <Method void StringBuilder()>
	//  238  557:ldc1            #148 <String "lookaheadGlyphs=">
	//  239  559:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  240  562:aload           7
	//  241  564:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
	//  242  567:invokevirtual   #60  <Method String StringBuilder.toString()>
	//  243  570:invokeinterface #115 <Method void Logger.debug(String)>
	//* 244  575:goto            516
	//  245  578:return          
	}

	private void readLookUpType_1(int i)
		throws IOException
	{
		rf.seek(i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field RandomAccessFileOrArray rf>
	//    2    4:iload_1         
	//    3    5:i2l             
	//    4    6:invokevirtual   #30  <Method void RandomAccessFileOrArray.seek(long)>
		short word0 = rf.readShort();
	//    5    9:aload_0         
	//    6   10:getfield        #24  <Field RandomAccessFileOrArray rf>
	//    7   13:invokevirtual   #34  <Method short RandomAccessFileOrArray.readShort()>
	//    8   16:istore_2        
		if(word0 == 1)
	//*   9   17:iload_2         
	//*  10   18:iconst_1        
	//*  11   19:icmpne          172
		{
			LOG.debug("Reading `Look Up Type 1, Format 1` ....");
	//   12   22:getstatic       #108 <Field Logger LOG>
	//   13   25:ldc1            #151 <String "Reading `Look Up Type 1, Format 1` ....">
	//   14   27:invokeinterface #115 <Method void Logger.debug(String)>
			word0 = rf.readShort();
	//   15   32:aload_0         
	//   16   33:getfield        #24  <Field RandomAccessFileOrArray rf>
	//   17   36:invokevirtual   #34  <Method short RandomAccessFileOrArray.readShort()>
	//   18   39:istore_2        
			short word1 = rf.readShort();
	//   19   40:aload_0         
	//   20   41:getfield        #24  <Field RandomAccessFileOrArray rf>
	//   21   44:invokevirtual   #34  <Method short RandomAccessFileOrArray.readShort()>
	//   22   47:istore_3        
			if((word1 & 1) == 1)
	//*  23   48:iload_3         
	//*  24   49:iconst_1        
	//*  25   50:iand            
	//*  26   51:iconst_1        
	//*  27   52:icmpne          92
			{
				short word3 = rf.readShort();
	//   28   55:aload_0         
	//   29   56:getfield        #24  <Field RandomAccessFileOrArray rf>
	//   30   59:invokevirtual   #34  <Method short RandomAccessFileOrArray.readShort()>
	//   31   62:istore          4
				LOG.debug((new StringBuilder()).append("xPlacement=").append(((int) (word3))).toString());
	//   32   64:getstatic       #108 <Field Logger LOG>
	//   33   67:new             #42  <Class StringBuilder>
	//   34   70:dup             
	//   35   71:invokespecial   #45  <Method void StringBuilder()>
	//   36   74:ldc1            #153 <String "xPlacement=">
	//   37   76:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   38   79:iload           4
	//   39   81:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//   40   84:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   41   87:invokeinterface #115 <Method void Logger.debug(String)>
			}
			if((word1 & 2) == 2)
	//*  42   92:iload_3         
	//*  43   93:iconst_2        
	//*  44   94:iand            
	//*  45   95:iconst_2        
	//*  46   96:icmpne          134
			{
				short word2 = rf.readShort();
	//   47   99:aload_0         
	//   48  100:getfield        #24  <Field RandomAccessFileOrArray rf>
	//   49  103:invokevirtual   #34  <Method short RandomAccessFileOrArray.readShort()>
	//   50  106:istore_3        
				LOG.debug((new StringBuilder()).append("yPlacement=").append(((int) (word2))).toString());
	//   51  107:getstatic       #108 <Field Logger LOG>
	//   52  110:new             #42  <Class StringBuilder>
	//   53  113:dup             
	//   54  114:invokespecial   #45  <Method void StringBuilder()>
	//   55  117:ldc1            #155 <String "yPlacement=">
	//   56  119:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   57  122:iload_3         
	//   58  123:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//   59  126:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   60  129:invokeinterface #115 <Method void Logger.debug(String)>
			}
			List list = readCoverageFormat(i + word0);
	//   61  134:aload_0         
	//   62  135:iload_1         
	//   63  136:iload_2         
	//   64  137:iadd            
	//   65  138:invokevirtual   #139 <Method List readCoverageFormat(int)>
	//   66  141:astore          5
			LOG.debug((new StringBuilder()).append("glyphCodes=").append(((Object) (list))).toString());
	//   67  143:getstatic       #108 <Field Logger LOG>
	//   68  146:new             #42  <Class StringBuilder>
	//   69  149:dup             
	//   70  150:invokespecial   #45  <Method void StringBuilder()>
	//   71  153:ldc1            #157 <String "glyphCodes=">
	//   72  155:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   73  158:aload           5
	//   74  160:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
	//   75  163:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   76  166:invokeinterface #115 <Method void Logger.debug(String)>
			return;
	//   77  171:return          
		} else
		{
			System.err.println((new StringBuilder()).append("The PosFormat ").append(((int) (word0))).append(" for `LookupType 1` is not yet supported by ").append(((Class) (com/itextpdf/text/pdf/fonts/otf/GlyphPositioningTableReader)).getSimpleName()).toString());
	//   78  172:getstatic       #40  <Field PrintStream System.err>
	//   79  175:new             #42  <Class StringBuilder>
	//   80  178:dup             
	//   81  179:invokespecial   #45  <Method void StringBuilder()>
	//   82  182:ldc1            #159 <String "The PosFormat ">
	//   83  184:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   84  187:iload_2         
	//   85  188:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//   86  191:ldc1            #161 <String " for `LookupType 1` is not yet supported by ">
	//   87  193:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   88  196:ldc1            #2   <Class GlyphPositioningTableReader>
	//   89  198:invokevirtual   #166 <Method String Class.getSimpleName()>
	//   90  201:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   91  204:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   92  207:invokevirtual   #66  <Method void PrintStream.println(String)>
			return;
	//   93  210:return          
		}
	}

	private void readLookUpType_4(int i)
		throws IOException
	{
		rf.seek(i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field RandomAccessFileOrArray rf>
	//    2    4:iload_1         
	//    3    5:i2l             
	//    4    6:invokevirtual   #30  <Method void RandomAccessFileOrArray.seek(long)>
		short word0 = rf.readShort();
	//    5    9:aload_0         
	//    6   10:getfield        #24  <Field RandomAccessFileOrArray rf>
	//    7   13:invokevirtual   #34  <Method short RandomAccessFileOrArray.readShort()>
	//    8   16:istore_2        
		if(word0 == 1)
	//*   9   17:iload_2         
	//*  10   18:iconst_1        
	//*  11   19:icmpne          168
		{
			LOG.debug("Reading `Look Up Type 4, Format 1` ....");
	//   12   22:getstatic       #108 <Field Logger LOG>
	//   13   25:ldc1            #169 <String "Reading `Look Up Type 4, Format 1` ....">
	//   14   27:invokeinterface #115 <Method void Logger.debug(String)>
			word0 = rf.readShort();
	//   15   32:aload_0         
	//   16   33:getfield        #24  <Field RandomAccessFileOrArray rf>
	//   17   36:invokevirtual   #34  <Method short RandomAccessFileOrArray.readShort()>
	//   18   39:istore_2        
			short word1 = rf.readShort();
	//   19   40:aload_0         
	//   20   41:getfield        #24  <Field RandomAccessFileOrArray rf>
	//   21   44:invokevirtual   #34  <Method short RandomAccessFileOrArray.readShort()>
	//   22   47:istore_3        
			short word2 = rf.readShort();
	//   23   48:aload_0         
	//   24   49:getfield        #24  <Field RandomAccessFileOrArray rf>
	//   25   52:invokevirtual   #34  <Method short RandomAccessFileOrArray.readShort()>
	//   26   55:istore          4
			short word3 = rf.readShort();
	//   27   57:aload_0         
	//   28   58:getfield        #24  <Field RandomAccessFileOrArray rf>
	//   29   61:invokevirtual   #34  <Method short RandomAccessFileOrArray.readShort()>
	//   30   64:istore          5
			short word4 = rf.readShort();
	//   31   66:aload_0         
	//   32   67:getfield        #24  <Field RandomAccessFileOrArray rf>
	//   33   70:invokevirtual   #34  <Method short RandomAccessFileOrArray.readShort()>
	//   34   73:istore          6
			List list = readCoverageFormat(i + word0);
	//   35   75:aload_0         
	//   36   76:iload_1         
	//   37   77:iload_2         
	//   38   78:iadd            
	//   39   79:invokevirtual   #139 <Method List readCoverageFormat(int)>
	//   40   82:astore          7
			LOG.debug((new StringBuilder()).append("markCoverages=").append(((Object) (list))).toString());
	//   41   84:getstatic       #108 <Field Logger LOG>
	//   42   87:new             #42  <Class StringBuilder>
	//   43   90:dup             
	//   44   91:invokespecial   #45  <Method void StringBuilder()>
	//   45   94:ldc1            #171 <String "markCoverages=">
	//   46   96:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   47   99:aload           7
	//   48  101:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
	//   49  104:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   50  107:invokeinterface #115 <Method void Logger.debug(String)>
			list = readCoverageFormat(i + word1);
	//   51  112:aload_0         
	//   52  113:iload_1         
	//   53  114:iload_3         
	//   54  115:iadd            
	//   55  116:invokevirtual   #139 <Method List readCoverageFormat(int)>
	//   56  119:astore          7
			LOG.debug((new StringBuilder()).append("baseCoverages=").append(((Object) (list))).toString());
	//   57  121:getstatic       #108 <Field Logger LOG>
	//   58  124:new             #42  <Class StringBuilder>
	//   59  127:dup             
	//   60  128:invokespecial   #45  <Method void StringBuilder()>
	//   61  131:ldc1            #173 <String "baseCoverages=">
	//   62  133:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   63  136:aload           7
	//   64  138:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
	//   65  141:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   66  144:invokeinterface #115 <Method void Logger.debug(String)>
			readMarkArrayTable(i + word3);
	//   67  149:aload_0         
	//   68  150:iload_1         
	//   69  151:iload           5
	//   70  153:iadd            
	//   71  154:invokespecial   #176 <Method void readMarkArrayTable(int)>
			readBaseArrayTable(i + word4, ((int) (word2)));
	//   72  157:aload_0         
	//   73  158:iload_1         
	//   74  159:iload           6
	//   75  161:iadd            
	//   76  162:iload           4
	//   77  164:invokespecial   #178 <Method void readBaseArrayTable(int, int)>
			return;
	//   78  167:return          
		} else
		{
			System.err.println((new StringBuilder()).append("The posFormat ").append(((int) (word0))).append(" is not supported by ").append(((Class) (com/itextpdf/text/pdf/fonts/otf/GlyphPositioningTableReader)).getSimpleName()).toString());
	//   79  168:getstatic       #40  <Field PrintStream System.err>
	//   80  171:new             #42  <Class StringBuilder>
	//   81  174:dup             
	//   82  175:invokespecial   #45  <Method void StringBuilder()>
	//   83  178:ldc1            #180 <String "The posFormat ">
	//   84  180:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   85  183:iload_2         
	//   86  184:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//   87  187:ldc1            #182 <String " is not supported by ">
	//   88  189:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   89  192:ldc1            #2   <Class GlyphPositioningTableReader>
	//   90  194:invokevirtual   #166 <Method String Class.getSimpleName()>
	//   91  197:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   92  200:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   93  203:invokevirtual   #66  <Method void PrintStream.println(String)>
			return;
	//   94  206:return          
		}
	}

	private void readLookUpType_8(int i)
		throws IOException
	{
		rf.seek(i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field RandomAccessFileOrArray rf>
	//    2    4:iload_1         
	//    3    5:i2l             
	//    4    6:invokevirtual   #30  <Method void RandomAccessFileOrArray.seek(long)>
		short word0 = rf.readShort();
	//    5    9:aload_0         
	//    6   10:getfield        #24  <Field RandomAccessFileOrArray rf>
	//    7   13:invokevirtual   #34  <Method short RandomAccessFileOrArray.readShort()>
	//    8   16:istore_2        
		if(word0 == 3)
	//*   9   17:iload_2         
	//*  10   18:iconst_3        
	//*  11   19:icmpne          38
		{
			LOG.debug("Reading `Look Up Type 8, Format 3` ....");
	//   12   22:getstatic       #108 <Field Logger LOG>
	//   13   25:ldc1            #185 <String "Reading `Look Up Type 8, Format 3` ....">
	//   14   27:invokeinterface #115 <Method void Logger.debug(String)>
			readChainingContextPositioningFormat_3(i);
	//   15   32:aload_0         
	//   16   33:iload_1         
	//   17   34:invokespecial   #187 <Method void readChainingContextPositioningFormat_3(int)>
			return;
	//   18   37:return          
		} else
		{
			System.err.println((new StringBuilder()).append("The posFormat ").append(((int) (word0))).append(" for `Look Up Type 8` is not supported by ").append(((Class) (com/itextpdf/text/pdf/fonts/otf/GlyphPositioningTableReader)).getSimpleName()).toString());
	//   19   38:getstatic       #40  <Field PrintStream System.err>
	//   20   41:new             #42  <Class StringBuilder>
	//   21   44:dup             
	//   22   45:invokespecial   #45  <Method void StringBuilder()>
	//   23   48:ldc1            #180 <String "The posFormat ">
	//   24   50:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   25   53:iload_2         
	//   26   54:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//   27   57:ldc1            #189 <String " for `Look Up Type 8` is not supported by ">
	//   28   59:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   29   62:ldc1            #2   <Class GlyphPositioningTableReader>
	//   30   64:invokevirtual   #166 <Method String Class.getSimpleName()>
	//   31   67:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   32   70:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   33   73:invokevirtual   #66  <Method void PrintStream.println(String)>
			return;
	//   34   76:return          
		}
	}

	private void readMarkArrayTable(int i)
		throws IOException
	{
		rf.seek(i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field RandomAccessFileOrArray rf>
	//    2    4:iload_1         
	//    3    5:i2l             
	//    4    6:invokevirtual   #30  <Method void RandomAccessFileOrArray.seek(long)>
		short word0 = rf.readShort();
	//    5    9:aload_0         
	//    6   10:getfield        #24  <Field RandomAccessFileOrArray rf>
	//    7   13:invokevirtual   #34  <Method short RandomAccessFileOrArray.readShort()>
	//    8   16:istore_3        
		Object obj = ((Object) (new ArrayList()));
	//    9   17:new             #117 <Class ArrayList>
	//   10   20:dup             
	//   11   21:invokespecial   #190 <Method void ArrayList()>
	//   12   24:astore          4
		for(int j = 0; j < word0; j++)
	//*  13   26:iconst_0        
	//*  14   27:istore_2        
	//*  15   28:iload_2         
	//*  16   29:iload_3         
	//*  17   30:icmpge          52
			((List) (obj)).add(((Object) (readMarkRecord())));
	//   18   33:aload           4
	//   19   35:aload_0         
	//   20   36:invokespecial   #194 <Method GlyphPositioningTableReader$MarkRecord readMarkRecord()>
	//   21   39:invokeinterface #122 <Method boolean List.add(Object)>
	//   22   44:pop             

	//   23   45:iload_2         
	//   24   46:iconst_1        
	//   25   47:iadd            
	//   26   48:istore_2        
	//*  27   49:goto            28
		for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); readAnchorTable(((MarkRecord)((Iterator) (obj)).next()).markAnchorOffset + i));
	//   28   52:aload           4
	//   29   54:invokeinterface #135 <Method Iterator List.iterator()>
	//   30   59:astore          4
	//   31   61:aload           4
	//   32   63:invokeinterface #93  <Method boolean Iterator.hasNext()>
	//   33   68:ifeq            93
	//   34   71:aload_0         
	//   35   72:aload           4
	//   36   74:invokeinterface #97  <Method Object Iterator.next()>
	//   37   79:checkcast       #6   <Class GlyphPositioningTableReader$MarkRecord>
	//   38   82:getfield        #198 <Field int GlyphPositioningTableReader$MarkRecord.markAnchorOffset>
	//   39   85:iload_1         
	//   40   86:iadd            
	//   41   87:invokespecial   #103 <Method void readAnchorTable(int)>
	//*  42   90:goto            61
	//   43   93:return          
	}

	private MarkRecord readMarkRecord()
		throws IOException
	{
		return new MarkRecord(((int) (rf.readShort())), ((int) (rf.readShort())));
	//    0    0:new             #6   <Class GlyphPositioningTableReader$MarkRecord>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field RandomAccessFileOrArray rf>
	//    4    8:invokevirtual   #34  <Method short RandomAccessFileOrArray.readShort()>
	//    5   11:aload_0         
	//    6   12:getfield        #24  <Field RandomAccessFileOrArray rf>
	//    7   15:invokevirtual   #34  <Method short RandomAccessFileOrArray.readShort()>
	//    8   18:invokespecial   #199 <Method void GlyphPositioningTableReader$MarkRecord(int, int)>
	//    9   21:areturn         
	}

	public void read()
		throws FontReadingException
	{
		startReadingTable();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #205 <Method void startReadingTable()>
	//    2    4:return          
	}

	protected void readSubTable(int i, int j)
		throws IOException
	{
		if(i == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          11
		{
			readLookUpType_1(j);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:invokespecial   #208 <Method void readLookUpType_1(int)>
			return;
	//    6   10:return          
		}
		if(i == 4)
	//*   7   11:iload_1         
	//*   8   12:iconst_4        
	//*   9   13:icmpne          22
		{
			readLookUpType_4(j);
	//   10   16:aload_0         
	//   11   17:iload_2         
	//   12   18:invokespecial   #210 <Method void readLookUpType_4(int)>
			return;
	//   13   21:return          
		}
		if(i == 8)
	//*  14   22:iload_1         
	//*  15   23:bipush          8
	//*  16   25:icmpne          34
		{
			readLookUpType_8(j);
	//   17   28:aload_0         
	//   18   29:iload_2         
	//   19   30:invokespecial   #212 <Method void readLookUpType_8(int)>
			return;
	//   20   33:return          
		} else
		{
			System.err.println((new StringBuilder()).append("The lookupType ").append(i).append(" is not yet supported by ").append(((Class) (com/itextpdf/text/pdf/fonts/otf/GlyphPositioningTableReader)).getSimpleName()).toString());
	//   21   34:getstatic       #40  <Field PrintStream System.err>
	//   22   37:new             #42  <Class StringBuilder>
	//   23   40:dup             
	//   24   41:invokespecial   #45  <Method void StringBuilder()>
	//   25   44:ldc1            #214 <String "The lookupType ">
	//   26   46:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   27   49:iload_1         
	//   28   50:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//   29   53:ldc1            #216 <String " is not yet supported by ">
	//   30   55:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   31   58:ldc1            #2   <Class GlyphPositioningTableReader>
	//   32   60:invokevirtual   #166 <Method String Class.getSimpleName()>
	//   33   63:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   34   66:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   35   69:invokevirtual   #66  <Method void PrintStream.println(String)>
			return;
	//   36   72:return          
		}
	}
}
