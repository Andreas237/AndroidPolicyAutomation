// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.io.IOException;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfName, PdfDictionary, PdfReader, PdfArray, 
//			PdfNumber, PdfObject, PdfIndirectReference, PdfWriter, 
//			PdfIndirectObject

public class PdfNumberTree
{

	public PdfNumberTree()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	private static void iterateItems(PdfDictionary pdfdictionary, HashMap hashmap)
	{
		PdfArray pdfarray = (PdfArray)PdfReader.getPdfObjectRelease(pdfdictionary.get(PdfName.NUMS));
	//    0    0:aload_0         
	//    1    1:getstatic       #20  <Field PdfName PdfName.NUMS>
	//    2    4:invokevirtual   #26  <Method PdfObject PdfDictionary.get(PdfName)>
	//    3    7:invokestatic    #32  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//    4   10:checkcast       #34  <Class PdfArray>
	//    5   13:astore          4
		if(pdfarray != null)
	//*   6   15:aload           4
	//*   7   17:ifnull          71
		{
			int k;
			for(int i = 0; i < pdfarray.size(); i = k + 1)
	//*   8   20:iconst_0        
	//*   9   21:istore_2        
	//*  10   22:iload_2         
	//*  11   23:aload           4
	//*  12   25:invokevirtual   #38  <Method int PdfArray.size()>
	//*  13   28:icmpge          121
			{
				k = i + 1;
	//   14   31:iload_2         
	//   15   32:iconst_1        
	//   16   33:iadd            
	//   17   34:istore_3        
				hashmap.put(((Object) (Integer.valueOf(((PdfNumber)PdfReader.getPdfObjectRelease(pdfarray.getPdfObject(i))).intValue()))), ((Object) (pdfarray.getPdfObject(k))));
	//   18   35:aload_1         
	//   19   36:aload           4
	//   20   38:iload_2         
	//   21   39:invokevirtual   #42  <Method PdfObject PdfArray.getPdfObject(int)>
	//   22   42:invokestatic    #32  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   23   45:checkcast       #44  <Class PdfNumber>
	//   24   48:invokevirtual   #47  <Method int PdfNumber.intValue()>
	//   25   51:invokestatic    #53  <Method Integer Integer.valueOf(int)>
	//   26   54:aload           4
	//   27   56:iload_3         
	//   28   57:invokevirtual   #42  <Method PdfObject PdfArray.getPdfObject(int)>
	//   29   60:invokevirtual   #59  <Method Object HashMap.put(Object, Object)>
	//   30   63:pop             
			}

	//   31   64:iload_3         
	//   32   65:iconst_1        
	//   33   66:iadd            
	//   34   67:istore_2        
		} else
	//*  35   68:goto            22
		{
			pdfdictionary = ((PdfDictionary) ((PdfArray)PdfReader.getPdfObjectRelease(pdfdictionary.get(PdfName.KIDS))));
	//   36   71:aload_0         
	//   37   72:getstatic       #62  <Field PdfName PdfName.KIDS>
	//   38   75:invokevirtual   #26  <Method PdfObject PdfDictionary.get(PdfName)>
	//   39   78:invokestatic    #32  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   40   81:checkcast       #34  <Class PdfArray>
	//   41   84:astore_0        
			if(pdfdictionary != null)
	//*  42   85:aload_0         
	//*  43   86:ifnull          121
			{
				for(int j = 0; j < ((PdfArray) (pdfdictionary)).size(); j++)
	//*  44   89:iconst_0        
	//*  45   90:istore_2        
	//*  46   91:iload_2         
	//*  47   92:aload_0         
	//*  48   93:invokevirtual   #38  <Method int PdfArray.size()>
	//*  49   96:icmpge          121
					iterateItems((PdfDictionary)PdfReader.getPdfObjectRelease(((PdfArray) (pdfdictionary)).getPdfObject(j)), hashmap);
	//   50   99:aload_0         
	//   51  100:iload_2         
	//   52  101:invokevirtual   #42  <Method PdfObject PdfArray.getPdfObject(int)>
	//   53  104:invokestatic    #32  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   54  107:checkcast       #22  <Class PdfDictionary>
	//   55  110:aload_1         
	//   56  111:invokestatic    #64  <Method void iterateItems(PdfDictionary, HashMap)>

	//   57  114:iload_2         
	//   58  115:iconst_1        
	//   59  116:iadd            
	//   60  117:istore_2        
			}
		}
	//*  61  118:goto            91
	//   62  121:return          
	}

	public static HashMap readTree(PdfDictionary pdfdictionary)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #55  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #69  <Method void HashMap()>
	//    3    7:astore_1        
		if(pdfdictionary != null)
	//*   4    8:aload_0         
	//*   5    9:ifnull          17
			iterateItems(pdfdictionary, hashmap);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #64  <Method void iterateItems(PdfDictionary, HashMap)>
		return hashmap;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public static PdfDictionary writeTree(HashMap hashmap, PdfWriter pdfwriter)
		throws IOException
	{
		if(hashmap.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #78  <Method boolean HashMap.isEmpty()>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		Integer ainteger[] = new Integer[hashmap.size()];
	//    5    9:aload_0         
	//    6   10:invokevirtual   #79  <Method int HashMap.size()>
	//    7   13:anewarray       Integer[]
	//    8   16:astore          8
		ainteger = (Integer[])hashmap.keySet().toArray(((Object []) (ainteger)));
	//    9   18:aload_0         
	//   10   19:invokevirtual   #83  <Method Set HashMap.keySet()>
	//   11   22:aload           8
	//   12   24:invokeinterface #89  <Method Object[] Set.toArray(Object[])>
	//   13   29:checkcast       #91  <Class Integer[]>
	//   14   32:astore          8
		Arrays.sort(((Object []) (ainteger)));
	//   15   34:aload           8
	//   16   36:invokestatic    #97  <Method void Arrays.sort(Object[])>
		if(ainteger.length <= 64)
	//*  17   39:aload           8
	//*  18   41:arraylength     
	//*  19   42:bipush          64
	//*  20   44:icmpgt          128
		{
			pdfwriter = ((PdfWriter) (new PdfDictionary()));
	//   21   47:new             #22  <Class PdfDictionary>
	//   22   50:dup             
	//   23   51:invokespecial   #98  <Method void PdfDictionary()>
	//   24   54:astore_1        
			PdfArray pdfarray = new PdfArray();
	//   25   55:new             #34  <Class PdfArray>
	//   26   58:dup             
	//   27   59:invokespecial   #99  <Method void PdfArray()>
	//   28   62:astore          9
			for(int i = 0; i < ainteger.length; i++)
	//*  29   64:iconst_0        
	//*  30   65:istore_2        
	//*  31   66:iload_2         
	//*  32   67:aload           8
	//*  33   69:arraylength     
	//*  34   70:icmpge          117
			{
				pdfarray.add(((PdfObject) (new PdfNumber(ainteger[i].intValue()))));
	//   35   73:aload           9
	//   36   75:new             #44  <Class PdfNumber>
	//   37   78:dup             
	//   38   79:aload           8
	//   39   81:iload_2         
	//   40   82:aaload          
	//   41   83:invokevirtual   #100 <Method int Integer.intValue()>
	//   42   86:invokespecial   #103 <Method void PdfNumber(int)>
	//   43   89:invokevirtual   #107 <Method boolean PdfArray.add(PdfObject)>
	//   44   92:pop             
				pdfarray.add((PdfObject)hashmap.get(((Object) (ainteger[i]))));
	//   45   93:aload           9
	//   46   95:aload_0         
	//   47   96:aload           8
	//   48   98:iload_2         
	//   49   99:aaload          
	//   50  100:invokevirtual   #110 <Method Object HashMap.get(Object)>
	//   51  103:checkcast       #112 <Class PdfObject>
	//   52  106:invokevirtual   #107 <Method boolean PdfArray.add(PdfObject)>
	//   53  109:pop             
			}

	//   54  110:iload_2         
	//   55  111:iconst_1        
	//   56  112:iadd            
	//   57  113:istore_2        
	//*  58  114:goto            66
			((PdfDictionary) (pdfwriter)).put(PdfName.NUMS, ((PdfObject) (pdfarray)));
	//   59  117:aload_1         
	//   60  118:getstatic       #20  <Field PdfName PdfName.NUMS>
	//   61  121:aload           9
	//   62  123:invokevirtual   #115 <Method void PdfDictionary.put(PdfName, PdfObject)>
			return ((PdfDictionary) (pdfwriter));
	//   63  126:aload_1         
	//   64  127:areturn         
		}
		byte byte0 = 64;
	//   65  128:bipush          64
	//   66  130:istore          4
		PdfIndirectReference apdfindirectreference[] = new PdfIndirectReference[((ainteger.length + 64) - 1) / 64];
	//   67  132:aload           8
	//   68  134:arraylength     
	//   69  135:bipush          64
	//   70  137:iadd            
	//   71  138:iconst_1        
	//   72  139:isub            
	//   73  140:bipush          64
	//   74  142:idiv            
	//   75  143:anewarray       PdfIndirectReference[]
	//   76  146:astore          9
		for(int j = 0; j < apdfindirectreference.length; j++)
	//*  77  148:iconst_0        
	//*  78  149:istore_2        
	//*  79  150:iload_2         
	//*  80  151:aload           9
	//*  81  153:arraylength     
	//*  82  154:icmpge          334
		{
			int l = j * 64;
	//   83  157:iload_2         
	//   84  158:bipush          64
	//   85  160:imul            
	//   86  161:istore_3        
			int k1 = Math.min(l + 64, ainteger.length);
	//   87  162:iload_3         
	//   88  163:bipush          64
	//   89  165:iadd            
	//   90  166:aload           8
	//   91  168:arraylength     
	//   92  169:invokestatic    #123 <Method int Math.min(int, int)>
	//   93  172:istore          5
			PdfDictionary pdfdictionary = new PdfDictionary();
	//   94  174:new             #22  <Class PdfDictionary>
	//   95  177:dup             
	//   96  178:invokespecial   #98  <Method void PdfDictionary()>
	//   97  181:astore          10
			PdfArray pdfarray2 = new PdfArray();
	//   98  183:new             #34  <Class PdfArray>
	//   99  186:dup             
	//  100  187:invokespecial   #99  <Method void PdfArray()>
	//  101  190:astore          11
			pdfarray2.add(((PdfObject) (new PdfNumber(ainteger[l].intValue()))));
	//  102  192:aload           11
	//  103  194:new             #44  <Class PdfNumber>
	//  104  197:dup             
	//  105  198:aload           8
	//  106  200:iload_3         
	//  107  201:aaload          
	//  108  202:invokevirtual   #100 <Method int Integer.intValue()>
	//  109  205:invokespecial   #103 <Method void PdfNumber(int)>
	//  110  208:invokevirtual   #107 <Method boolean PdfArray.add(PdfObject)>
	//  111  211:pop             
			pdfarray2.add(((PdfObject) (new PdfNumber(ainteger[k1 - 1].intValue()))));
	//  112  212:aload           11
	//  113  214:new             #44  <Class PdfNumber>
	//  114  217:dup             
	//  115  218:aload           8
	//  116  220:iload           5
	//  117  222:iconst_1        
	//  118  223:isub            
	//  119  224:aaload          
	//  120  225:invokevirtual   #100 <Method int Integer.intValue()>
	//  121  228:invokespecial   #103 <Method void PdfNumber(int)>
	//  122  231:invokevirtual   #107 <Method boolean PdfArray.add(PdfObject)>
	//  123  234:pop             
			pdfdictionary.put(PdfName.LIMITS, ((PdfObject) (pdfarray2)));
	//  124  235:aload           10
	//  125  237:getstatic       #126 <Field PdfName PdfName.LIMITS>
	//  126  240:aload           11
	//  127  242:invokevirtual   #115 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfarray2 = new PdfArray();
	//  128  245:new             #34  <Class PdfArray>
	//  129  248:dup             
	//  130  249:invokespecial   #99  <Method void PdfArray()>
	//  131  252:astore          11
			for(; l < k1; l++)
	//* 132  254:iload_3         
	//* 133  255:iload           5
	//* 134  257:icmpge          304
			{
				pdfarray2.add(((PdfObject) (new PdfNumber(ainteger[l].intValue()))));
	//  135  260:aload           11
	//  136  262:new             #44  <Class PdfNumber>
	//  137  265:dup             
	//  138  266:aload           8
	//  139  268:iload_3         
	//  140  269:aaload          
	//  141  270:invokevirtual   #100 <Method int Integer.intValue()>
	//  142  273:invokespecial   #103 <Method void PdfNumber(int)>
	//  143  276:invokevirtual   #107 <Method boolean PdfArray.add(PdfObject)>
	//  144  279:pop             
				pdfarray2.add((PdfObject)hashmap.get(((Object) (ainteger[l]))));
	//  145  280:aload           11
	//  146  282:aload_0         
	//  147  283:aload           8
	//  148  285:iload_3         
	//  149  286:aaload          
	//  150  287:invokevirtual   #110 <Method Object HashMap.get(Object)>
	//  151  290:checkcast       #112 <Class PdfObject>
	//  152  293:invokevirtual   #107 <Method boolean PdfArray.add(PdfObject)>
	//  153  296:pop             
			}

	//  154  297:iload_3         
	//  155  298:iconst_1        
	//  156  299:iadd            
	//  157  300:istore_3        
	//* 158  301:goto            254
			pdfdictionary.put(PdfName.NUMS, ((PdfObject) (pdfarray2)));
	//  159  304:aload           10
	//  160  306:getstatic       #20  <Field PdfName PdfName.NUMS>
	//  161  309:aload           11
	//  162  311:invokevirtual   #115 <Method void PdfDictionary.put(PdfName, PdfObject)>
			apdfindirectreference[j] = pdfwriter.addToBody(((PdfObject) (pdfdictionary))).getIndirectReference();
	//  163  314:aload           9
	//  164  316:iload_2         
	//  165  317:aload_1         
	//  166  318:aload           10
	//  167  320:invokevirtual   #132 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//  168  323:invokevirtual   #138 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  169  326:aastore         
		}

	//  170  327:iload_2         
	//  171  328:iconst_1        
	//  172  329:iadd            
	//  173  330:istore_2        
	//* 174  331:goto            150
		int k = apdfindirectreference.length;
	//  175  334:aload           9
	//  176  336:arraylength     
	//  177  337:istore_2        
		int i1 = ((int) (byte0));
	//  178  338:iload           4
	//  179  340:istore_3        
		do
		{
			if(k <= 64)
	//* 180  341:iload_2         
	//* 181  342:bipush          64
	//* 182  344:icmpgt          396
			{
				hashmap = ((HashMap) (new PdfArray()));
	//  183  347:new             #34  <Class PdfArray>
	//  184  350:dup             
	//  185  351:invokespecial   #99  <Method void PdfArray()>
	//  186  354:astore_0        
				for(i1 = 0; i1 < k; i1++)
	//* 187  355:iconst_0        
	//* 188  356:istore_3        
	//* 189  357:iload_3         
	//* 190  358:iload_2         
	//* 191  359:icmpge          378
					((PdfArray) (hashmap)).add(((PdfObject) (apdfindirectreference[i1])));
	//  192  362:aload_0         
	//  193  363:aload           9
	//  194  365:iload_3         
	//  195  366:aaload          
	//  196  367:invokevirtual   #107 <Method boolean PdfArray.add(PdfObject)>
	//  197  370:pop             

	//  198  371:iload_3         
	//  199  372:iconst_1        
	//  200  373:iadd            
	//  201  374:istore_3        
	//* 202  375:goto            357
				pdfwriter = ((PdfWriter) (new PdfDictionary()));
	//  203  378:new             #22  <Class PdfDictionary>
	//  204  381:dup             
	//  205  382:invokespecial   #98  <Method void PdfDictionary()>
	//  206  385:astore_1        
				((PdfDictionary) (pdfwriter)).put(PdfName.KIDS, ((PdfObject) (hashmap)));
	//  207  386:aload_1         
	//  208  387:getstatic       #62  <Field PdfName PdfName.KIDS>
	//  209  390:aload_0         
	//  210  391:invokevirtual   #115 <Method void PdfDictionary.put(PdfName, PdfObject)>
				return ((PdfDictionary) (pdfwriter));
	//  211  394:aload_1         
	//  212  395:areturn         
			}
			int l1 = i1 * 64;
	//  213  396:iload_3         
	//  214  397:bipush          64
	//  215  399:imul            
	//  216  400:istore          5
			int i2 = ((ainteger.length + l1) - 1) / l1;
	//  217  402:aload           8
	//  218  404:arraylength     
	//  219  405:iload           5
	//  220  407:iadd            
	//  221  408:iconst_1        
	//  222  409:isub            
	//  223  410:iload           5
	//  224  412:idiv            
	//  225  413:istore          6
			for(i1 = 0; i1 < i2; i1++)
	//* 226  415:iconst_0        
	//* 227  416:istore_3        
	//* 228  417:iload_3         
	//* 229  418:iload           6
	//* 230  420:icmpge          586
			{
				int j1 = i1 * 64;
	//  231  423:iload_3         
	//  232  424:bipush          64
	//  233  426:imul            
	//  234  427:istore          4
				int j2 = Math.min(j1 + 64, k);
	//  235  429:iload           4
	//  236  431:bipush          64
	//  237  433:iadd            
	//  238  434:iload_2         
	//  239  435:invokestatic    #123 <Method int Math.min(int, int)>
	//  240  438:istore          7
				hashmap = ((HashMap) (new PdfDictionary()));
	//  241  440:new             #22  <Class PdfDictionary>
	//  242  443:dup             
	//  243  444:invokespecial   #98  <Method void PdfDictionary()>
	//  244  447:astore_0        
				PdfArray pdfarray1 = new PdfArray();
	//  245  448:new             #34  <Class PdfArray>
	//  246  451:dup             
	//  247  452:invokespecial   #99  <Method void PdfArray()>
	//  248  455:astore          10
				pdfarray1.add(((PdfObject) (new PdfNumber(ainteger[i1 * l1].intValue()))));
	//  249  457:aload           10
	//  250  459:new             #44  <Class PdfNumber>
	//  251  462:dup             
	//  252  463:aload           8
	//  253  465:iload_3         
	//  254  466:iload           5
	//  255  468:imul            
	//  256  469:aaload          
	//  257  470:invokevirtual   #100 <Method int Integer.intValue()>
	//  258  473:invokespecial   #103 <Method void PdfNumber(int)>
	//  259  476:invokevirtual   #107 <Method boolean PdfArray.add(PdfObject)>
	//  260  479:pop             
				pdfarray1.add(((PdfObject) (new PdfNumber(ainteger[Math.min((i1 + 1) * l1, ainteger.length) - 1].intValue()))));
	//  261  480:aload           10
	//  262  482:new             #44  <Class PdfNumber>
	//  263  485:dup             
	//  264  486:aload           8
	//  265  488:iload_3         
	//  266  489:iconst_1        
	//  267  490:iadd            
	//  268  491:iload           5
	//  269  493:imul            
	//  270  494:aload           8
	//  271  496:arraylength     
	//  272  497:invokestatic    #123 <Method int Math.min(int, int)>
	//  273  500:iconst_1        
	//  274  501:isub            
	//  275  502:aaload          
	//  276  503:invokevirtual   #100 <Method int Integer.intValue()>
	//  277  506:invokespecial   #103 <Method void PdfNumber(int)>
	//  278  509:invokevirtual   #107 <Method boolean PdfArray.add(PdfObject)>
	//  279  512:pop             
				((PdfDictionary) (hashmap)).put(PdfName.LIMITS, ((PdfObject) (pdfarray1)));
	//  280  513:aload_0         
	//  281  514:getstatic       #126 <Field PdfName PdfName.LIMITS>
	//  282  517:aload           10
	//  283  519:invokevirtual   #115 <Method void PdfDictionary.put(PdfName, PdfObject)>
				pdfarray1 = new PdfArray();
	//  284  522:new             #34  <Class PdfArray>
	//  285  525:dup             
	//  286  526:invokespecial   #99  <Method void PdfArray()>
	//  287  529:astore          10
				for(; j1 < j2; j1++)
	//* 288  531:iload           4
	//* 289  533:iload           7
	//* 290  535:icmpge          558
					pdfarray1.add(((PdfObject) (apdfindirectreference[j1])));
	//  291  538:aload           10
	//  292  540:aload           9
	//  293  542:iload           4
	//  294  544:aaload          
	//  295  545:invokevirtual   #107 <Method boolean PdfArray.add(PdfObject)>
	//  296  548:pop             

	//  297  549:iload           4
	//  298  551:iconst_1        
	//  299  552:iadd            
	//  300  553:istore          4
	//* 301  555:goto            531
				((PdfDictionary) (hashmap)).put(PdfName.KIDS, ((PdfObject) (pdfarray1)));
	//  302  558:aload_0         
	//  303  559:getstatic       #62  <Field PdfName PdfName.KIDS>
	//  304  562:aload           10
	//  305  564:invokevirtual   #115 <Method void PdfDictionary.put(PdfName, PdfObject)>
				apdfindirectreference[i1] = pdfwriter.addToBody(((PdfObject) (hashmap))).getIndirectReference();
	//  306  567:aload           9
	//  307  569:iload_3         
	//  308  570:aload_1         
	//  309  571:aload_0         
	//  310  572:invokevirtual   #132 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//  311  575:invokevirtual   #138 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  312  578:aastore         
			}

	//  313  579:iload_3         
	//  314  580:iconst_1        
	//  315  581:iadd            
	//  316  582:istore_3        
	//* 317  583:goto            417
			k = i2;
	//  318  586:iload           6
	//  319  588:istore_2        
			i1 = l1;
	//  320  589:iload           5
	//  321  591:istore_3        
		} while(true);
	//  322  592:goto            341
	}

	private static final int leafSize = 64;
}
