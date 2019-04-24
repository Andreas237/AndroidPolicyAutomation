// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.io.IOException;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfName, PdfDictionary, PdfReader, PdfArray, 
//			PdfString, PdfEncodings, PdfObject, PdfIndirectReference, 
//			PdfWriter, PdfIndirectObject

public class PdfNameTree
{

	public PdfNameTree()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	private static PdfString iterateItems(PdfDictionary pdfdictionary, HashMap hashmap, PdfString pdfstring)
	{
		PdfDictionary pdfdictionary1;
label0:
		{
			PdfArray pdfarray = (PdfArray)PdfReader.getPdfObjectRelease(pdfdictionary.get(PdfName.NAMES));
	//    0    0:aload_0         
	//    1    1:getstatic       #20  <Field PdfName PdfName.NAMES>
	//    2    4:invokevirtual   #26  <Method PdfObject PdfDictionary.get(PdfName)>
	//    3    7:invokestatic    #32  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//    4   10:checkcast       #34  <Class PdfArray>
	//    5   13:astore          5
			if(pdfarray != null)
	//*   6   15:aload           5
	//*   7   17:ifnull          97
			{
				int i = 0;
	//    8   20:iconst_0        
	//    9   21:istore_3        
				while(i < pdfarray.size()) 
	//*  10   22:iload_3         
	//*  11   23:aload           5
	//*  12   25:invokevirtual   #38  <Method int PdfArray.size()>
	//*  13   28:icmpge          149
				{
					if(pdfstring == null)
	//*  14   31:aload_2         
	//*  15   32:ifnonnull       90
					{
						pdfdictionary = ((PdfDictionary) ((PdfString)PdfReader.getPdfObjectRelease(pdfarray.getPdfObject(i))));
	//   16   35:aload           5
	//   17   37:iload_3         
	//   18   38:invokevirtual   #42  <Method PdfObject PdfArray.getPdfObject(int)>
	//   19   41:invokestatic    #32  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   20   44:checkcast       #44  <Class PdfString>
	//   21   47:astore_0        
						i++;
	//   22   48:iload_3         
	//   23   49:iconst_1        
	//   24   50:iadd            
	//   25   51:istore_3        
					} else
	//*  26   52:aload_0         
	//*  27   53:astore          4
	//*  28   55:iload_3         
	//*  29   56:aload           5
	//*  30   58:invokevirtual   #38  <Method int PdfArray.size()>
	//*  31   61:icmpge          152
	//*  32   64:aload_1         
	//*  33   65:aload_0         
	//*  34   66:invokevirtual   #48  <Method byte[] PdfString.getBytes()>
	//*  35   69:aconst_null     
	//*  36   70:invokestatic    #54  <Method String PdfEncodings.convertToString(byte[], String)>
	//*  37   73:aload           5
	//*  38   75:iload_3         
	//*  39   76:invokevirtual   #42  <Method PdfObject PdfArray.getPdfObject(int)>
	//*  40   79:invokevirtual   #60  <Method Object HashMap.put(Object, Object)>
	//*  41   82:pop             
	//*  42   83:iload_3         
	//*  43   84:iconst_1        
	//*  44   85:iadd            
	//*  45   86:istore_3        
	//*  46   87:goto            22
					{
						pdfdictionary = ((PdfDictionary) (pdfstring));
	//   47   90:aload_2         
	//   48   91:astore_0        
						pdfstring = null;
	//   49   92:aconst_null     
	//   50   93:astore_2        
					}
					pdfdictionary1 = pdfdictionary;
					if(i >= pdfarray.size())
						break label0;
					hashmap.put(((Object) (PdfEncodings.convertToString(((PdfString) (pdfdictionary)).getBytes(), ((String) (null))))), ((Object) (pdfarray.getPdfObject(i))));
					i++;
				}
			} else
	//*  51   94:goto            52
			{
				pdfdictionary = ((PdfDictionary) ((PdfArray)PdfReader.getPdfObjectRelease(pdfdictionary.get(PdfName.KIDS))));
	//   52   97:aload_0         
	//   53   98:getstatic       #63  <Field PdfName PdfName.KIDS>
	//   54  101:invokevirtual   #26  <Method PdfObject PdfDictionary.get(PdfName)>
	//   55  104:invokestatic    #32  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   56  107:checkcast       #34  <Class PdfArray>
	//   57  110:astore_0        
				if(pdfdictionary != null)
	//*  58  111:aload_0         
	//*  59  112:ifnull          149
				{
					for(int j = 0; j < ((PdfArray) (pdfdictionary)).size(); j++)
	//*  60  115:iconst_0        
	//*  61  116:istore_3        
	//*  62  117:iload_3         
	//*  63  118:aload_0         
	//*  64  119:invokevirtual   #38  <Method int PdfArray.size()>
	//*  65  122:icmpge          149
						pdfstring = iterateItems((PdfDictionary)PdfReader.getPdfObjectRelease(((PdfArray) (pdfdictionary)).getPdfObject(j)), hashmap, pdfstring);
	//   66  125:aload_0         
	//   67  126:iload_3         
	//   68  127:invokevirtual   #42  <Method PdfObject PdfArray.getPdfObject(int)>
	//   69  130:invokestatic    #32  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   70  133:checkcast       #22  <Class PdfDictionary>
	//   71  136:aload_1         
	//   72  137:aload_2         
	//   73  138:invokestatic    #65  <Method PdfString iterateItems(PdfDictionary, HashMap, PdfString)>
	//   74  141:astore_2        

	//   75  142:iload_3         
	//   76  143:iconst_1        
	//   77  144:iadd            
	//   78  145:istore_3        
				}
			}
	//*  79  146:goto            117
			pdfdictionary1 = null;
	//   80  149:aconst_null     
	//   81  150:astore          4
		}
		return ((PdfString) (pdfdictionary1));
	//   82  152:aload           4
	//   83  154:areturn         
	}

	public static HashMap readTree(PdfDictionary pdfdictionary)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #56  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #70  <Method void HashMap()>
	//    3    7:astore_1        
		if(pdfdictionary != null)
	//*   4    8:aload_0         
	//*   5    9:ifnull          19
			iterateItems(pdfdictionary, hashmap, ((PdfString) (null)));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aconst_null     
	//    9   15:invokestatic    #65  <Method PdfString iterateItems(PdfDictionary, HashMap, PdfString)>
	//   10   18:pop             
		return hashmap;
	//   11   19:aload_1         
	//   12   20:areturn         
	}

	public static PdfDictionary writeTree(HashMap hashmap, PdfWriter pdfwriter)
		throws IOException
	{
		if(hashmap.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #79  <Method boolean HashMap.isEmpty()>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		String as[] = new String[hashmap.size()];
	//    5    9:aload_0         
	//    6   10:invokevirtual   #80  <Method int HashMap.size()>
	//    7   13:anewarray       String[]
	//    8   16:astore          8
		as = (String[])hashmap.keySet().toArray(((Object []) (as)));
	//    9   18:aload_0         
	//   10   19:invokevirtual   #86  <Method Set HashMap.keySet()>
	//   11   22:aload           8
	//   12   24:invokeinterface #92  <Method Object[] Set.toArray(Object[])>
	//   13   29:checkcast       #94  <Class String[]>
	//   14   32:astore          8
		Arrays.sort(((Object []) (as)));
	//   15   34:aload           8
	//   16   36:invokestatic    #100 <Method void Arrays.sort(Object[])>
		if(as.length <= 64)
	//*  17   39:aload           8
	//*  18   41:arraylength     
	//*  19   42:bipush          64
	//*  20   44:icmpgt          126
		{
			pdfwriter = ((PdfWriter) (new PdfDictionary()));
	//   21   47:new             #22  <Class PdfDictionary>
	//   22   50:dup             
	//   23   51:invokespecial   #101 <Method void PdfDictionary()>
	//   24   54:astore_1        
			PdfArray pdfarray = new PdfArray();
	//   25   55:new             #34  <Class PdfArray>
	//   26   58:dup             
	//   27   59:invokespecial   #102 <Method void PdfArray()>
	//   28   62:astore          9
			for(int i = 0; i < as.length; i++)
	//*  29   64:iconst_0        
	//*  30   65:istore_2        
	//*  31   66:iload_2         
	//*  32   67:aload           8
	//*  33   69:arraylength     
	//*  34   70:icmpge          115
			{
				pdfarray.add(((PdfObject) (new PdfString(as[i], ((String) (null))))));
	//   35   73:aload           9
	//   36   75:new             #44  <Class PdfString>
	//   37   78:dup             
	//   38   79:aload           8
	//   39   81:iload_2         
	//   40   82:aaload          
	//   41   83:aconst_null     
	//   42   84:invokespecial   #105 <Method void PdfString(String, String)>
	//   43   87:invokevirtual   #109 <Method boolean PdfArray.add(PdfObject)>
	//   44   90:pop             
				pdfarray.add((PdfObject)hashmap.get(((Object) (as[i]))));
	//   45   91:aload           9
	//   46   93:aload_0         
	//   47   94:aload           8
	//   48   96:iload_2         
	//   49   97:aaload          
	//   50   98:invokevirtual   #112 <Method Object HashMap.get(Object)>
	//   51  101:checkcast       #114 <Class PdfObject>
	//   52  104:invokevirtual   #109 <Method boolean PdfArray.add(PdfObject)>
	//   53  107:pop             
			}

	//   54  108:iload_2         
	//   55  109:iconst_1        
	//   56  110:iadd            
	//   57  111:istore_2        
	//*  58  112:goto            66
			((PdfDictionary) (pdfwriter)).put(PdfName.NAMES, ((PdfObject) (pdfarray)));
	//   59  115:aload_1         
	//   60  116:getstatic       #20  <Field PdfName PdfName.NAMES>
	//   61  119:aload           9
	//   62  121:invokevirtual   #117 <Method void PdfDictionary.put(PdfName, PdfObject)>
			return ((PdfDictionary) (pdfwriter));
	//   63  124:aload_1         
	//   64  125:areturn         
		}
		byte byte0 = 64;
	//   65  126:bipush          64
	//   66  128:istore          4
		PdfIndirectReference apdfindirectreference[] = new PdfIndirectReference[((as.length + 64) - 1) / 64];
	//   67  130:aload           8
	//   68  132:arraylength     
	//   69  133:bipush          64
	//   70  135:iadd            
	//   71  136:iconst_1        
	//   72  137:isub            
	//   73  138:bipush          64
	//   74  140:idiv            
	//   75  141:anewarray       PdfIndirectReference[]
	//   76  144:astore          9
		for(int j = 0; j < apdfindirectreference.length; j++)
	//*  77  146:iconst_0        
	//*  78  147:istore_2        
	//*  79  148:iload_2         
	//*  80  149:aload           9
	//*  81  151:arraylength     
	//*  82  152:icmpge          326
		{
			int l = j * 64;
	//   83  155:iload_2         
	//   84  156:bipush          64
	//   85  158:imul            
	//   86  159:istore_3        
			int k1 = Math.min(l + 64, as.length);
	//   87  160:iload_3         
	//   88  161:bipush          64
	//   89  163:iadd            
	//   90  164:aload           8
	//   91  166:arraylength     
	//   92  167:invokestatic    #125 <Method int Math.min(int, int)>
	//   93  170:istore          5
			PdfDictionary pdfdictionary = new PdfDictionary();
	//   94  172:new             #22  <Class PdfDictionary>
	//   95  175:dup             
	//   96  176:invokespecial   #101 <Method void PdfDictionary()>
	//   97  179:astore          10
			PdfArray pdfarray2 = new PdfArray();
	//   98  181:new             #34  <Class PdfArray>
	//   99  184:dup             
	//  100  185:invokespecial   #102 <Method void PdfArray()>
	//  101  188:astore          11
			pdfarray2.add(((PdfObject) (new PdfString(as[l], ((String) (null))))));
	//  102  190:aload           11
	//  103  192:new             #44  <Class PdfString>
	//  104  195:dup             
	//  105  196:aload           8
	//  106  198:iload_3         
	//  107  199:aaload          
	//  108  200:aconst_null     
	//  109  201:invokespecial   #105 <Method void PdfString(String, String)>
	//  110  204:invokevirtual   #109 <Method boolean PdfArray.add(PdfObject)>
	//  111  207:pop             
			pdfarray2.add(((PdfObject) (new PdfString(as[k1 - 1], ((String) (null))))));
	//  112  208:aload           11
	//  113  210:new             #44  <Class PdfString>
	//  114  213:dup             
	//  115  214:aload           8
	//  116  216:iload           5
	//  117  218:iconst_1        
	//  118  219:isub            
	//  119  220:aaload          
	//  120  221:aconst_null     
	//  121  222:invokespecial   #105 <Method void PdfString(String, String)>
	//  122  225:invokevirtual   #109 <Method boolean PdfArray.add(PdfObject)>
	//  123  228:pop             
			pdfdictionary.put(PdfName.LIMITS, ((PdfObject) (pdfarray2)));
	//  124  229:aload           10
	//  125  231:getstatic       #128 <Field PdfName PdfName.LIMITS>
	//  126  234:aload           11
	//  127  236:invokevirtual   #117 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfarray2 = new PdfArray();
	//  128  239:new             #34  <Class PdfArray>
	//  129  242:dup             
	//  130  243:invokespecial   #102 <Method void PdfArray()>
	//  131  246:astore          11
			for(; l < k1; l++)
	//* 132  248:iload_3         
	//* 133  249:iload           5
	//* 134  251:icmpge          296
			{
				pdfarray2.add(((PdfObject) (new PdfString(as[l], ((String) (null))))));
	//  135  254:aload           11
	//  136  256:new             #44  <Class PdfString>
	//  137  259:dup             
	//  138  260:aload           8
	//  139  262:iload_3         
	//  140  263:aaload          
	//  141  264:aconst_null     
	//  142  265:invokespecial   #105 <Method void PdfString(String, String)>
	//  143  268:invokevirtual   #109 <Method boolean PdfArray.add(PdfObject)>
	//  144  271:pop             
				pdfarray2.add((PdfObject)hashmap.get(((Object) (as[l]))));
	//  145  272:aload           11
	//  146  274:aload_0         
	//  147  275:aload           8
	//  148  277:iload_3         
	//  149  278:aaload          
	//  150  279:invokevirtual   #112 <Method Object HashMap.get(Object)>
	//  151  282:checkcast       #114 <Class PdfObject>
	//  152  285:invokevirtual   #109 <Method boolean PdfArray.add(PdfObject)>
	//  153  288:pop             
			}

	//  154  289:iload_3         
	//  155  290:iconst_1        
	//  156  291:iadd            
	//  157  292:istore_3        
	//* 158  293:goto            248
			pdfdictionary.put(PdfName.NAMES, ((PdfObject) (pdfarray2)));
	//  159  296:aload           10
	//  160  298:getstatic       #20  <Field PdfName PdfName.NAMES>
	//  161  301:aload           11
	//  162  303:invokevirtual   #117 <Method void PdfDictionary.put(PdfName, PdfObject)>
			apdfindirectreference[j] = pdfwriter.addToBody(((PdfObject) (pdfdictionary))).getIndirectReference();
	//  163  306:aload           9
	//  164  308:iload_2         
	//  165  309:aload_1         
	//  166  310:aload           10
	//  167  312:invokevirtual   #134 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//  168  315:invokevirtual   #140 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  169  318:aastore         
		}

	//  170  319:iload_2         
	//  171  320:iconst_1        
	//  172  321:iadd            
	//  173  322:istore_2        
	//* 174  323:goto            148
		int k = apdfindirectreference.length;
	//  175  326:aload           9
	//  176  328:arraylength     
	//  177  329:istore_2        
		int i1 = ((int) (byte0));
	//  178  330:iload           4
	//  179  332:istore_3        
		do
		{
			if(k <= 64)
	//* 180  333:iload_2         
	//* 181  334:bipush          64
	//* 182  336:icmpgt          388
			{
				hashmap = ((HashMap) (new PdfArray()));
	//  183  339:new             #34  <Class PdfArray>
	//  184  342:dup             
	//  185  343:invokespecial   #102 <Method void PdfArray()>
	//  186  346:astore_0        
				for(i1 = 0; i1 < k; i1++)
	//* 187  347:iconst_0        
	//* 188  348:istore_3        
	//* 189  349:iload_3         
	//* 190  350:iload_2         
	//* 191  351:icmpge          370
					((PdfArray) (hashmap)).add(((PdfObject) (apdfindirectreference[i1])));
	//  192  354:aload_0         
	//  193  355:aload           9
	//  194  357:iload_3         
	//  195  358:aaload          
	//  196  359:invokevirtual   #109 <Method boolean PdfArray.add(PdfObject)>
	//  197  362:pop             

	//  198  363:iload_3         
	//  199  364:iconst_1        
	//  200  365:iadd            
	//  201  366:istore_3        
	//* 202  367:goto            349
				pdfwriter = ((PdfWriter) (new PdfDictionary()));
	//  203  370:new             #22  <Class PdfDictionary>
	//  204  373:dup             
	//  205  374:invokespecial   #101 <Method void PdfDictionary()>
	//  206  377:astore_1        
				((PdfDictionary) (pdfwriter)).put(PdfName.KIDS, ((PdfObject) (hashmap)));
	//  207  378:aload_1         
	//  208  379:getstatic       #63  <Field PdfName PdfName.KIDS>
	//  209  382:aload_0         
	//  210  383:invokevirtual   #117 <Method void PdfDictionary.put(PdfName, PdfObject)>
				return ((PdfDictionary) (pdfwriter));
	//  211  386:aload_1         
	//  212  387:areturn         
			}
			int l1 = i1 * 64;
	//  213  388:iload_3         
	//  214  389:bipush          64
	//  215  391:imul            
	//  216  392:istore          5
			int i2 = ((as.length + l1) - 1) / l1;
	//  217  394:aload           8
	//  218  396:arraylength     
	//  219  397:iload           5
	//  220  399:iadd            
	//  221  400:iconst_1        
	//  222  401:isub            
	//  223  402:iload           5
	//  224  404:idiv            
	//  225  405:istore          6
			for(i1 = 0; i1 < i2; i1++)
	//* 226  407:iconst_0        
	//* 227  408:istore_3        
	//* 228  409:iload_3         
	//* 229  410:iload           6
	//* 230  412:icmpge          574
			{
				int j1 = i1 * 64;
	//  231  415:iload_3         
	//  232  416:bipush          64
	//  233  418:imul            
	//  234  419:istore          4
				int j2 = Math.min(j1 + 64, k);
	//  235  421:iload           4
	//  236  423:bipush          64
	//  237  425:iadd            
	//  238  426:iload_2         
	//  239  427:invokestatic    #125 <Method int Math.min(int, int)>
	//  240  430:istore          7
				hashmap = ((HashMap) (new PdfDictionary()));
	//  241  432:new             #22  <Class PdfDictionary>
	//  242  435:dup             
	//  243  436:invokespecial   #101 <Method void PdfDictionary()>
	//  244  439:astore_0        
				PdfArray pdfarray1 = new PdfArray();
	//  245  440:new             #34  <Class PdfArray>
	//  246  443:dup             
	//  247  444:invokespecial   #102 <Method void PdfArray()>
	//  248  447:astore          10
				pdfarray1.add(((PdfObject) (new PdfString(as[i1 * l1], ((String) (null))))));
	//  249  449:aload           10
	//  250  451:new             #44  <Class PdfString>
	//  251  454:dup             
	//  252  455:aload           8
	//  253  457:iload_3         
	//  254  458:iload           5
	//  255  460:imul            
	//  256  461:aaload          
	//  257  462:aconst_null     
	//  258  463:invokespecial   #105 <Method void PdfString(String, String)>
	//  259  466:invokevirtual   #109 <Method boolean PdfArray.add(PdfObject)>
	//  260  469:pop             
				pdfarray1.add(((PdfObject) (new PdfString(as[Math.min((i1 + 1) * l1, as.length) - 1], ((String) (null))))));
	//  261  470:aload           10
	//  262  472:new             #44  <Class PdfString>
	//  263  475:dup             
	//  264  476:aload           8
	//  265  478:iload_3         
	//  266  479:iconst_1        
	//  267  480:iadd            
	//  268  481:iload           5
	//  269  483:imul            
	//  270  484:aload           8
	//  271  486:arraylength     
	//  272  487:invokestatic    #125 <Method int Math.min(int, int)>
	//  273  490:iconst_1        
	//  274  491:isub            
	//  275  492:aaload          
	//  276  493:aconst_null     
	//  277  494:invokespecial   #105 <Method void PdfString(String, String)>
	//  278  497:invokevirtual   #109 <Method boolean PdfArray.add(PdfObject)>
	//  279  500:pop             
				((PdfDictionary) (hashmap)).put(PdfName.LIMITS, ((PdfObject) (pdfarray1)));
	//  280  501:aload_0         
	//  281  502:getstatic       #128 <Field PdfName PdfName.LIMITS>
	//  282  505:aload           10
	//  283  507:invokevirtual   #117 <Method void PdfDictionary.put(PdfName, PdfObject)>
				pdfarray1 = new PdfArray();
	//  284  510:new             #34  <Class PdfArray>
	//  285  513:dup             
	//  286  514:invokespecial   #102 <Method void PdfArray()>
	//  287  517:astore          10
				for(; j1 < j2; j1++)
	//* 288  519:iload           4
	//* 289  521:iload           7
	//* 290  523:icmpge          546
					pdfarray1.add(((PdfObject) (apdfindirectreference[j1])));
	//  291  526:aload           10
	//  292  528:aload           9
	//  293  530:iload           4
	//  294  532:aaload          
	//  295  533:invokevirtual   #109 <Method boolean PdfArray.add(PdfObject)>
	//  296  536:pop             

	//  297  537:iload           4
	//  298  539:iconst_1        
	//  299  540:iadd            
	//  300  541:istore          4
	//* 301  543:goto            519
				((PdfDictionary) (hashmap)).put(PdfName.KIDS, ((PdfObject) (pdfarray1)));
	//  302  546:aload_0         
	//  303  547:getstatic       #63  <Field PdfName PdfName.KIDS>
	//  304  550:aload           10
	//  305  552:invokevirtual   #117 <Method void PdfDictionary.put(PdfName, PdfObject)>
				apdfindirectreference[i1] = pdfwriter.addToBody(((PdfObject) (hashmap))).getIndirectReference();
	//  306  555:aload           9
	//  307  557:iload_3         
	//  308  558:aload_1         
	//  309  559:aload_0         
	//  310  560:invokevirtual   #134 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//  311  563:invokevirtual   #140 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  312  566:aastore         
			}

	//  313  567:iload_3         
	//  314  568:iconst_1        
	//  315  569:iadd            
	//  316  570:istore_3        
	//* 317  571:goto            409
			k = i2;
	//  318  574:iload           6
	//  319  576:istore_2        
			i1 = l1;
	//  320  577:iload           5
	//  321  579:istore_3        
		} while(true);
	//  322  580:goto            333
	}

	private static final int leafSize = 64;
}
