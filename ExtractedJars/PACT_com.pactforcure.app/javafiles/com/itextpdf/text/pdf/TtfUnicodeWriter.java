// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.log.Logger;
import com.itextpdf.text.log.LoggerFactory;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			TrueTypeFontUnicode, CFFFontSubset, RandomAccessFileOrArray, PdfWriter, 
//			PdfIndirectObject, TrueTypeFontSubSet, PdfIndirectReference

public class TtfUnicodeWriter
{

	public TtfUnicodeWriter(PdfWriter pdfwriter)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		writer = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #13  <Field PdfWriter writer>
		writer = pdfwriter;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #13  <Field PdfWriter writer>
	//    8   14:return          
	}

	public void writeFont(TrueTypeFontUnicode truetypefontunicode, PdfIndirectReference pdfindirectreference, Object aobj[], byte abyte0[])
		throws DocumentException, IOException
	{
		HashMap hashmap;
		hashmap = (HashMap)aobj[0];
	//    0    0:aload_3         
	//    1    1:iconst_0        
	//    2    2:aaload          
	//    3    3:checkcast       #24  <Class HashMap>
	//    4    6:astore          9
		truetypefontunicode.addRangeUni(hashmap, true, truetypefontunicode.subset);
	//    5    8:aload_1         
	//    6    9:aload           9
	//    7   11:iconst_1        
	//    8   12:aload_1         
	//    9   13:getfield        #30  <Field boolean TrueTypeFontUnicode.subset>
	//   10   16:invokevirtual   #34  <Method void TrueTypeFontUnicode.addRangeUni(HashMap, boolean, boolean)>
		abyte0 = ((byte []) ((int[][])hashmap.values().toArray(((Object []) (new int[0][])))));
	//   11   19:aload           9
	//   12   21:invokevirtual   #38  <Method Collection HashMap.values()>
	//   13   24:iconst_0        
	//   14   25:anewarray       int[][]
	//   15   28:invokeinterface #46  <Method Object[] Collection.toArray(Object[])>
	//   16   33:checkcast       #48  <Class int[][]>
	//   17   36:astore          4
		Arrays.sort(((Object []) (abyte0)), ((java.util.Comparator) (truetypefontunicode)));
	//   18   38:aload           4
	//   19   40:aload_1         
	//   20   41:invokestatic    #54  <Method void Arrays.sort(Object[], java.util.Comparator)>
		if(!truetypefontunicode.cff) goto _L2; else goto _L1
	//   21   44:aload_1         
	//   22   45:getfield        #57  <Field boolean TrueTypeFontUnicode.cff>
	//   23   48:ifeq            316
_L1:
label0:
		{
			Object obj = ((Object) (truetypefontunicode.readCffFont()));
	//   24   51:aload_1         
	//   25   52:invokevirtual   #61  <Method byte[] TrueTypeFontUnicode.readCffFont()>
	//   26   55:astore          8
			if(!truetypefontunicode.subset)
	//*  27   57:aload_1         
	//*  28   58:getfield        #30  <Field boolean TrueTypeFontUnicode.subset>
	//*  29   61:ifne            78
			{
				abyte1 = ((byte []) (obj));
	//   30   64:aload           8
	//   31   66:astore          7
				aobj = ((Object []) (abyte0));
	//   32   68:aload           4
	//   33   70:astore_3        
				if(truetypefontunicode.subsetRanges == null)
					break label0;
	//   34   71:aload_1         
	//   35   72:getfield        #65  <Field java.util.ArrayList TrueTypeFontUnicode.subsetRanges>
	//   36   75:ifnull          112
			}
			aobj = ((Object []) (new CFFFontSubset(new RandomAccessFileOrArray(((byte []) (obj))), hashmap)));
	//   37   78:new             #67  <Class CFFFontSubset>
	//   38   81:dup             
	//   39   82:new             #69  <Class RandomAccessFileOrArray>
	//   40   85:dup             
	//   41   86:aload           8
	//   42   88:invokespecial   #72  <Method void RandomAccessFileOrArray(byte[])>
	//   43   91:aload           9
	//   44   93:invokespecial   #75  <Method void CFFFontSubset(RandomAccessFileOrArray, HashMap)>
	//   45   96:astore_3        
			try
			{
				abyte1 = ((CFFFontSubset) (aobj)).Process(((CFFFontSubset) (aobj)).getNames()[0]);
	//   46   97:aload_3         
	//   47   98:aload_3         
	//   48   99:invokevirtual   #79  <Method String[] CFFFontSubset.getNames()>
	//   49  102:iconst_0        
	//   50  103:aaload          
	//   51  104:invokevirtual   #83  <Method byte[] CFFFontSubset.Process(String)>
	//   52  107:astore          7
			}
	//*  53  109:aload           4
	//*  54  111:astore_3        
	//*  55  112:new             #85  <Class BaseFont$StreamFont>
	//*  56  115:dup             
	//*  57  116:aload           7
	//*  58  118:ldc1            #87  <String "CIDFontType0C">
	//*  59  120:aload_1         
	//*  60  121:getfield        #91  <Field int TrueTypeFontUnicode.compressionLevel>
	//*  61  124:invokespecial   #94  <Method void BaseFont$StreamFont(byte[], String, int)>
	//*  62  127:astore          4
	//*  63  129:aload_0         
	//*  64  130:getfield        #13  <Field PdfWriter writer>
	//*  65  133:aload           4
	//*  66  135:invokevirtual   #100 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//*  67  138:invokevirtual   #106 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//*  68  141:astore          7
	//*  69  143:aload_3         
	//*  70  144:astore          4
	//*  71  146:ldc1            #108 <String "">
	//*  72  148:astore_3        
	//*  73  149:aload_1         
	//*  74  150:getfield        #30  <Field boolean TrueTypeFontUnicode.subset>
	//*  75  153:ifeq            160
	//*  76  156:invokestatic    #112 <Method String TrueTypeFontUnicode.createSubsetPrefix()>
	//*  77  159:astore_3        
	//*  78  160:aload_1         
	//*  79  161:aload           7
	//*  80  163:aload_3         
	//*  81  164:aconst_null     
	//*  82  165:invokevirtual   #116 <Method PdfDictionary TrueTypeFontUnicode.getFontDescriptor(PdfIndirectReference, String, PdfIndirectReference)>
	//*  83  168:astore          7
	//*  84  170:aload_1         
	//*  85  171:aload_0         
	//*  86  172:getfield        #13  <Field PdfWriter writer>
	//*  87  175:aload           7
	//*  88  177:invokevirtual   #100 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//*  89  180:invokevirtual   #106 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//*  90  183:aload_3         
	//*  91  184:aload           4
	//*  92  186:invokevirtual   #120 <Method PdfDictionary TrueTypeFontUnicode.getCIDFontType2(PdfIndirectReference, String, Object[])>
	//*  93  189:astore          7
	//*  94  191:aload_0         
	//*  95  192:getfield        #13  <Field PdfWriter writer>
	//*  96  195:aload           7
	//*  97  197:invokevirtual   #100 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//*  98  200:invokevirtual   #106 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//*  99  203:astore          7
	//* 100  205:aload_1         
	//* 101  206:aload           4
	//* 102  208:invokevirtual   #124 <Method PdfStream TrueTypeFontUnicode.getToUnicode(Object[])>
	//* 103  211:astore          8
	//* 104  213:aconst_null     
	//* 105  214:astore          4
	//* 106  216:aload           8
	//* 107  218:ifnull          235
	//* 108  221:aload_0         
	//* 109  222:getfield        #13  <Field PdfWriter writer>
	//* 110  225:aload           8
	//* 111  227:invokevirtual   #100 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//* 112  230:invokevirtual   #106 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//* 113  233:astore          4
	//* 114  235:aload_1         
	//* 115  236:aload           7
	//* 116  238:aload_3         
	//* 117  239:aload           4
	//* 118  241:invokevirtual   #127 <Method PdfDictionary TrueTypeFontUnicode.getFontBaseType(PdfIndirectReference, String, PdfIndirectReference)>
	//* 119  244:astore_1        
	//* 120  245:aload_0         
	//* 121  246:getfield        #13  <Field PdfWriter writer>
	//* 122  249:aload_1         
	//* 123  250:aload_2         
	//* 124  251:invokevirtual   #130 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject, PdfIndirectReference)>
	//* 125  254:pop             
	//* 126  255:return          
			// Misplaced declaration of an exception variable
			catch(Object aobj[])
	//* 127  256:astore_3        
			{
				LoggerFactory.getLogger(com/itextpdf/text/pdf/TtfUnicodeWriter).error("Issue in CFF font subsetting.Subsetting was disabled", ((Exception) (aobj)));
	//  128  257:ldc1            #2   <Class TtfUnicodeWriter>
	//  129  259:invokestatic    #136 <Method Logger LoggerFactory.getLogger(Class)>
	//  130  262:ldc1            #138 <String "Issue in CFF font subsetting.Subsetting was disabled">
	//  131  264:aload_3         
	//  132  265:invokeinterface #144 <Method void Logger.error(String, Exception)>
				truetypefontunicode.setSubset(false);
	//  133  270:aload_1         
	//  134  271:iconst_0        
	//  135  272:invokevirtual   #148 <Method void TrueTypeFontUnicode.setSubset(boolean)>
				truetypefontunicode.addRangeUni(hashmap, true, truetypefontunicode.subset);
	//  136  275:aload_1         
	//  137  276:aload           9
	//  138  278:iconst_1        
	//  139  279:aload_1         
	//  140  280:getfield        #30  <Field boolean TrueTypeFontUnicode.subset>
	//  141  283:invokevirtual   #34  <Method void TrueTypeFontUnicode.addRangeUni(HashMap, boolean, boolean)>
				aobj = ((Object []) ((int[][])hashmap.values().toArray(((Object []) (new int[0][])))));
	//  142  286:aload           9
	//  143  288:invokevirtual   #38  <Method Collection HashMap.values()>
	//  144  291:iconst_0        
	//  145  292:anewarray       int[][]
	//  146  295:invokeinterface #46  <Method Object[] Collection.toArray(Object[])>
	//  147  300:checkcast       #48  <Class int[][]>
	//  148  303:astore_3        
				Arrays.sort(aobj, ((java.util.Comparator) (truetypefontunicode)));
	//  149  304:aload_3         
	//  150  305:aload_1         
	//  151  306:invokestatic    #54  <Method void Arrays.sort(Object[], java.util.Comparator)>
				abyte1 = ((byte []) (obj));
	//  152  309:aload           8
	//  153  311:astore          7
				continue; /* Loop/switch isn't completed */
	//  154  313:goto            112
			}
			aobj = ((Object []) (abyte0));
		}
_L6:
		abyte0 = ((byte []) (new BaseFont.StreamFont(abyte1, "CIDFontType0C", truetypefontunicode.compressionLevel)));
		abyte1 = ((byte []) (writer.addToBody(((PdfObject) (abyte0))).getIndirectReference()));
		abyte0 = ((byte []) (aobj));
_L4:
		aobj = "";
		if(truetypefontunicode.subset)
			aobj = ((Object []) (TrueTypeFontUnicode.createSubsetPrefix()));
		abyte1 = ((byte []) (truetypefontunicode.getFontDescriptor(((PdfIndirectReference) (abyte1)), ((String) (aobj)), ((PdfIndirectReference) (null)))));
		abyte1 = ((byte []) (truetypefontunicode.getCIDFontType2(writer.addToBody(((PdfObject) (abyte1))).getIndirectReference(), ((String) (aobj)), ((Object []) (abyte0)))));
		abyte1 = ((byte []) (writer.addToBody(((PdfObject) (abyte1))).getIndirectReference()));
		obj = ((Object) (truetypefontunicode.getToUnicode(((Object []) (abyte0)))));
		abyte0 = null;
		if(obj != null)
			abyte0 = ((byte []) (writer.addToBody(((PdfObject) (obj))).getIndirectReference()));
		truetypefontunicode = ((TrueTypeFontUnicode) (truetypefontunicode.getFontBaseType(((PdfIndirectReference) (abyte1)), ((String) (aobj)), ((PdfIndirectReference) (abyte0)))));
		writer.addToBody(((PdfObject) (truetypefontunicode)), pdfindirectreference);
		return;
_L2:
		int i;
		int j;
		if(truetypefontunicode.subset || truetypefontunicode.directoryOffset != 0)
	//* 155  316:aload_1         
	//* 156  317:getfield        #30  <Field boolean TrueTypeFontUnicode.subset>
	//* 157  320:ifne            330
	//* 158  323:aload_1         
	//* 159  324:getfield        #151 <Field int TrueTypeFontUnicode.directoryOffset>
	//* 160  327:ifeq            437
			synchronized(truetypefontunicode.rf)
	//* 161  330:aload_1         
	//* 162  331:getfield        #155 <Field RandomAccessFileOrArray TrueTypeFontUnicode.rf>
	//* 163  334:astore          7
	//* 164  336:aload           7
	//* 165  338:monitorenter    
			{
				aobj = ((Object []) ((new TrueTypeFontSubSet(truetypefontunicode.fileName, new RandomAccessFileOrArray(truetypefontunicode.rf), new HashSet(((Collection) (hashmap.keySet()))), truetypefontunicode.directoryOffset, true, false)).process()));
	//  166  339:new             #157 <Class TrueTypeFontSubSet>
	//  167  342:dup             
	//  168  343:aload_1         
	//  169  344:getfield        #161 <Field String TrueTypeFontUnicode.fileName>
	//  170  347:new             #69  <Class RandomAccessFileOrArray>
	//  171  350:dup             
	//  172  351:aload_1         
	//  173  352:getfield        #155 <Field RandomAccessFileOrArray TrueTypeFontUnicode.rf>
	//  174  355:invokespecial   #164 <Method void RandomAccessFileOrArray(RandomAccessFileOrArray)>
	//  175  358:new             #166 <Class HashSet>
	//  176  361:dup             
	//  177  362:aload           9
	//  178  364:invokevirtual   #170 <Method java.util.Set HashMap.keySet()>
	//  179  367:invokespecial   #173 <Method void HashSet(Collection)>
	//  180  370:aload_1         
	//  181  371:getfield        #151 <Field int TrueTypeFontUnicode.directoryOffset>
	//  182  374:iconst_1        
	//  183  375:iconst_0        
	//  184  376:invokespecial   #176 <Method void TrueTypeFontSubSet(String, RandomAccessFileOrArray, HashSet, int, boolean, boolean)>
	//  185  379:invokevirtual   #179 <Method byte[] TrueTypeFontSubSet.process()>
	//  186  382:astore_3        
			}
	//  187  383:aload           7
	//  188  385:monitorexit     
		else
	//* 189  386:aload_3         
	//* 190  387:arraylength     
	//* 191  388:istore          5
	//* 192  390:aload_1         
	//* 193  391:getfield        #91  <Field int TrueTypeFontUnicode.compressionLevel>
	//* 194  394:istore          6
	//* 195  396:new             #85  <Class BaseFont$StreamFont>
	//* 196  399:dup             
	//* 197  400:aload_3         
	//* 198  401:iconst_1        
	//* 199  402:newarray        int[]
	//* 200  404:dup             
	//* 201  405:iconst_0        
	//* 202  406:iload           5
	//* 203  408:iastore         
	//* 204  409:iload           6
	//* 205  411:invokespecial   #182 <Method void BaseFont$StreamFont(byte[], int[], int)>
	//* 206  414:astore_3        
	//* 207  415:aload_0         
	//* 208  416:getfield        #13  <Field PdfWriter writer>
	//* 209  419:aload_3         
	//* 210  420:invokevirtual   #100 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//* 211  423:invokevirtual   #106 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//* 212  426:astore          7
	//* 213  428:goto            146
	//* 214  431:astore_1        
	//* 215  432:aload           7
	//* 216  434:monitorexit     
	//* 217  435:aload_1         
	//* 218  436:athrow          
			aobj = ((Object []) (truetypefontunicode.getFullFont()));
	//  219  437:aload_1         
	//  220  438:invokevirtual   #185 <Method byte[] TrueTypeFontUnicode.getFullFont()>
	//  221  441:astore_3        
		i = aobj.length;
		j = truetypefontunicode.compressionLevel;
		aobj = ((Object []) (new BaseFont.StreamFont(((byte []) (aobj)), new int[] {
			i
		}, j)));
		abyte1 = ((byte []) (writer.addToBody(((PdfObject) (aobj))).getIndirectReference()));
		if(true) goto _L4; else goto _L3
	//  222  442:goto            386
_L3:
		truetypefontunicode;
		abyte1;
		JVM INSTR monitorexit ;
		throw truetypefontunicode;
		if(true) goto _L6; else goto _L5
_L5:
	}

	protected PdfWriter writer;
}
