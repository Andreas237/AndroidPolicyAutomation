// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.ExceptionConverter;
import com.itextpdf.text.Rectangle;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfCopy, PdfArray, PdfFormField, PdfAnnotation, 
//			PdfName, PdfDictionary, PdfReader, PdfObject, 
//			PdfRectangle, ByteBuffer, PdfContents, PdfStream, 
//			PdfIndirectObject, PageResources, PdfIndirectReference, PdfContentByte

public static class PdfCopy$PageStamp
{

	private void addDocumentField(PdfIndirectReference pdfindirectreference)
	{
		if(cstp.fieldArray == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field PdfCopy cstp>
	//*   2    4:getfield        #36  <Field PdfArray PdfCopy.fieldArray>
	//*   3    7:ifnonnull       24
			cstp.fieldArray = new PdfArray();
	//    4   10:aload_0         
	//    5   11:getfield        #29  <Field PdfCopy cstp>
	//    6   14:new             #38  <Class PdfArray>
	//    7   17:dup             
	//    8   18:invokespecial   #39  <Method void PdfArray()>
	//    9   21:putfield        #36  <Field PdfArray PdfCopy.fieldArray>
		cstp.fieldArray.add(((PdfObject) (pdfindirectreference)));
	//   10   24:aload_0         
	//   11   25:getfield        #29  <Field PdfCopy cstp>
	//   12   28:getfield        #36  <Field PdfArray PdfCopy.fieldArray>
	//   13   31:aload_1         
	//   14   32:invokevirtual   #43  <Method boolean PdfArray.add(PdfObject)>
	//   15   35:pop             
	//   16   36:return          
	}

	private void expandFields(PdfFormField pdfformfield, ArrayList arraylist)
	{
		arraylist.add(((Object) (pdfformfield)));
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #50  <Method boolean ArrayList.add(Object)>
	//    3    5:pop             
		pdfformfield = ((PdfFormField) (pdfformfield.getKids()));
	//    4    6:aload_1         
	//    5    7:invokevirtual   #56  <Method ArrayList PdfFormField.getKids()>
	//    6   10:astore_1        
		if(pdfformfield != null)
	//*   7   11:aload_1         
	//*   8   12:ifnull          46
			for(pdfformfield = ((PdfFormField) (((ArrayList) (pdfformfield)).iterator())); ((Iterator) (pdfformfield)).hasNext(); expandFields((PdfFormField)((Iterator) (pdfformfield)).next(), arraylist));
	//    9   15:aload_1         
	//   10   16:invokevirtual   #60  <Method Iterator ArrayList.iterator()>
	//   11   19:astore_1        
	//   12   20:aload_1         
	//   13   21:invokeinterface #66  <Method boolean Iterator.hasNext()>
	//   14   26:ifeq            46
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokeinterface #70  <Method Object Iterator.next()>
	//   18   36:checkcast       #52  <Class PdfFormField>
	//   19   39:aload_2         
	//   20   40:invokespecial   #72  <Method void expandFields(PdfFormField, ArrayList)>
	//*  21   43:goto            20
	//   22   46:return          
	}

	public void addAnnotation(PdfAnnotation pdfannotation)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #47  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #79  <Method void ArrayList()>
	//    3    7:astore          4
		if(!pdfannotation.isForm()) goto _L2; else goto _L1
	//    4    9:aload_1         
	//    5   10:invokevirtual   #84  <Method boolean PdfAnnotation.isForm()>
	//    6   13:ifeq            359
_L1:
		pdfannotation = ((PdfAnnotation) ((PdfFormField)pdfannotation));
	//    7   16:aload_1         
	//    8   17:checkcast       #52  <Class PdfFormField>
	//    9   20:astore_1        
		if(((PdfFormField) (pdfannotation)).getParent() != null)
	//*  10   21:aload_1         
	//*  11   22:invokevirtual   #88  <Method PdfFormField PdfFormField.getParent()>
	//*  12   25:ifnull          29
			return;
	//   13   28:return          
		int i;
		int j;
		PdfAnnotation pdfannotation1;
		Rectangle rectangle;
		try
		{
			expandFields(((PdfFormField) (pdfannotation)), arraylist);
	//   14   29:aload_0         
	//   15   30:aload_1         
	//   16   31:aload           4
	//   17   33:invokespecial   #72  <Method void expandFields(PdfFormField, ArrayList)>
			if(cstp.fieldTemplates == null)
	//*  18   36:aload_0         
	//*  19   37:getfield        #29  <Field PdfCopy cstp>
	//*  20   40:getfield        #92  <Field HashSet PdfCopy.fieldTemplates>
	//*  21   43:ifnonnull       538
				cstp.fieldTemplates = new HashSet();
	//   22   46:aload_0         
	//   23   47:getfield        #29  <Field PdfCopy cstp>
	//   24   50:new             #94  <Class HashSet>
	//   25   53:dup             
	//   26   54:invokespecial   #95  <Method void HashSet()>
	//   27   57:putfield        #92  <Field HashSet PdfCopy.fieldTemplates>
		}
	//*  28   60:goto            538
	//*  29   63:iload_2         
	//*  30   64:aload           4
	//*  31   66:invokevirtual   #99  <Method int ArrayList.size()>
	//*  32   69:icmpge          537
	//*  33   72:aload           4
	//*  34   74:iload_2         
	//*  35   75:invokevirtual   #103 <Method Object ArrayList.get(int)>
	//*  36   78:checkcast       #81  <Class PdfAnnotation>
	//*  37   81:astore          5
	//*  38   83:aload           5
	//*  39   85:invokevirtual   #84  <Method boolean PdfAnnotation.isForm()>
	//*  40   88:ifeq            142
	//*  41   91:aload           5
	//*  42   93:invokevirtual   #106 <Method boolean PdfAnnotation.isUsed()>
	//*  43   96:ifne            121
	//*  44   99:aload           5
	//*  45  101:invokevirtual   #110 <Method HashSet PdfAnnotation.getTemplates()>
	//*  46  104:astore_1        
	//*  47  105:aload_1         
	//*  48  106:ifnull          121
	//*  49  109:aload_0         
	//*  50  110:getfield        #29  <Field PdfCopy cstp>
	//*  51  113:getfield        #92  <Field HashSet PdfCopy.fieldTemplates>
	//*  52  116:aload_1         
	//*  53  117:invokevirtual   #114 <Method boolean HashSet.addAll(java.util.Collection)>
	//*  54  120:pop             
	//*  55  121:aload           5
	//*  56  123:checkcast       #52  <Class PdfFormField>
	//*  57  126:astore_1        
	//*  58  127:aload_1         
	//*  59  128:invokevirtual   #88  <Method PdfFormField PdfFormField.getParent()>
	//*  60  131:ifnonnull       142
	//*  61  134:aload_0         
	//*  62  135:aload_1         
	//*  63  136:invokevirtual   #118 <Method PdfIndirectReference PdfFormField.getIndirectReference()>
	//*  64  139:invokespecial   #120 <Method void addDocumentField(PdfIndirectReference)>
	//*  65  142:aload           5
	//*  66  144:invokevirtual   #123 <Method boolean PdfAnnotation.isAnnotation()>
	//*  67  147:ifeq            328
	//*  68  150:aload_0         
	//*  69  151:getfield        #25  <Field PdfDictionary pageN>
	//*  70  154:getstatic       #129 <Field PdfName PdfName.ANNOTS>
	//*  71  157:invokevirtual   #134 <Method PdfObject PdfDictionary.get(PdfName)>
	//*  72  160:aload_0         
	//*  73  161:getfield        #25  <Field PdfDictionary pageN>
	//*  74  164:invokestatic    #140 <Method PdfObject PdfReader.getPdfObject(PdfObject, PdfObject)>
	//*  75  167:astore_1        
	//*  76  168:aload_1         
	//*  77  169:ifnull          179
	//*  78  172:aload_1         
	//*  79  173:invokevirtual   #145 <Method boolean PdfObject.isArray()>
	//*  80  176:ifne            379
	//*  81  179:new             #38  <Class PdfArray>
	//*  82  182:dup             
	//*  83  183:invokespecial   #39  <Method void PdfArray()>
	//*  84  186:astore_1        
	//*  85  187:aload_0         
	//*  86  188:getfield        #25  <Field PdfDictionary pageN>
	//*  87  191:getstatic       #129 <Field PdfName PdfName.ANNOTS>
	//*  88  194:aload_1         
	//*  89  195:invokevirtual   #149 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  90  198:aload_1         
	//*  91  199:aload           5
	//*  92  201:invokevirtual   #150 <Method PdfIndirectReference PdfAnnotation.getIndirectReference()>
	//*  93  204:invokevirtual   #43  <Method boolean PdfArray.add(PdfObject)>
	//*  94  207:pop             
	//*  95  208:aload           5
	//*  96  210:invokevirtual   #106 <Method boolean PdfAnnotation.isUsed()>
	//*  97  213:ifne            328
	//*  98  216:aload           5
	//*  99  218:getstatic       #153 <Field PdfName PdfName.RECT>
	//* 100  221:invokevirtual   #154 <Method PdfObject PdfAnnotation.get(PdfName)>
	//* 101  224:checkcast       #156 <Class PdfRectangle>
	//* 102  227:astore_1        
	//* 103  228:aload_1         
	//* 104  229:ifnull          328
	//* 105  232:aload_1         
	//* 106  233:invokevirtual   #160 <Method float PdfRectangle.left()>
	//* 107  236:fconst_0        
	//* 108  237:fcmpl           
	//* 109  238:ifne            268
	//* 110  241:aload_1         
	//* 111  242:invokevirtual   #163 <Method float PdfRectangle.right()>
	//* 112  245:fconst_0        
	//* 113  246:fcmpl           
	//* 114  247:ifne            268
	//* 115  250:aload_1         
	//* 116  251:invokevirtual   #166 <Method float PdfRectangle.top()>
	//* 117  254:fconst_0        
	//* 118  255:fcmpl           
	//* 119  256:ifne            268
	//* 120  259:aload_1         
	//* 121  260:invokevirtual   #169 <Method float PdfRectangle.bottom()>
	//* 122  263:fconst_0        
	//* 123  264:fcmpl           
	//* 124  265:ifeq            328
	//* 125  268:aload_0         
	//* 126  269:getfield        #27  <Field PdfReader reader>
	//* 127  272:aload_0         
	//* 128  273:getfield        #25  <Field PdfDictionary pageN>
	//* 129  276:invokevirtual   #173 <Method int PdfReader.getPageRotation(PdfDictionary)>
	//* 130  279:istore_3        
	//* 131  280:aload_0         
	//* 132  281:getfield        #27  <Field PdfReader reader>
	//* 133  284:aload_0         
	//* 134  285:getfield        #25  <Field PdfDictionary pageN>
	//* 135  288:invokevirtual   #177 <Method Rectangle PdfReader.getPageSizeWithRotation(PdfDictionary)>
	//* 136  291:astore          6
	//* 137  293:iload_3         
	//* 138  294:lookupswitch    3: default 543
	//	               90: 387
	//	               180: 433
	//	               270: 491
	//* 139  328:aload           5
	//* 140  330:invokevirtual   #106 <Method boolean PdfAnnotation.isUsed()>
	//* 141  333:ifne            546
	//* 142  336:aload           5
	//* 143  338:invokevirtual   #180 <Method void PdfAnnotation.setUsed()>
	//* 144  341:aload_0         
	//* 145  342:getfield        #29  <Field PdfCopy cstp>
	//* 146  345:aload           5
	//* 147  347:aload           5
	//* 148  349:invokevirtual   #150 <Method PdfIndirectReference PdfAnnotation.getIndirectReference()>
	//* 149  352:invokevirtual   #184 <Method PdfIndirectObject PdfCopy.addToBody(PdfObject, PdfIndirectReference)>
	//* 150  355:pop             
	//* 151  356:goto            546
	//* 152  359:aload           4
	//* 153  361:aload_1         
	//* 154  362:invokevirtual   #50  <Method boolean ArrayList.add(Object)>
	//* 155  365:pop             
	//* 156  366:goto            538
		// Misplaced declaration of an exception variable
		catch(PdfAnnotation pdfannotation)
	//* 157  369:astore_1        
		{
			throw new ExceptionConverter(((Exception) (pdfannotation)));
	//  158  370:new             #186 <Class ExceptionConverter>
	//  159  373:dup             
	//  160  374:aload_1         
	//  161  375:invokespecial   #189 <Method void ExceptionConverter(Exception)>
	//  162  378:athrow          
		}
		  goto _L3
_L20:
		if(i >= arraylist.size()) goto _L5; else goto _L4
_L4:
		pdfannotation1 = (PdfAnnotation)arraylist.get(i);
		if(!pdfannotation1.isForm())
			break MISSING_BLOCK_LABEL_142;
		if(pdfannotation1.isUsed())
			break MISSING_BLOCK_LABEL_121;
		pdfannotation = ((PdfAnnotation) (pdfannotation1.getTemplates()));
		if(pdfannotation == null)
			break MISSING_BLOCK_LABEL_121;
		cstp.fieldTemplates.addAll(((java.util.Collection) (pdfannotation)));
		pdfannotation = ((PdfAnnotation) ((PdfFormField)pdfannotation1));
		if(((PdfFormField) (pdfannotation)).getParent() == null)
			addDocumentField(((PdfFormField) (pdfannotation)).getIndirectReference());
		if(!pdfannotation1.isAnnotation()) goto _L7; else goto _L6
_L6:
		pdfannotation = ((PdfAnnotation) (PdfReader.getPdfObject(pageN.get(PdfName.ANNOTS), ((PdfObject) (pageN)))));
		if(pdfannotation == null) goto _L9; else goto _L8
_L8:
		if(((PdfObject) (pdfannotation)).isArray()) goto _L10; else goto _L9
_L9:
		pdfannotation = ((PdfAnnotation) (new PdfArray()));
		pageN.put(PdfName.ANNOTS, ((PdfObject) (pdfannotation)));
_L18:
		((PdfArray) (pdfannotation)).add(((PdfObject) (pdfannotation1.getIndirectReference())));
		if(pdfannotation1.isUsed()) goto _L7; else goto _L11
_L11:
		pdfannotation = ((PdfAnnotation) ((PdfRectangle)pdfannotation1.get(PdfName.RECT)));
		if(pdfannotation == null) goto _L7; else goto _L12
_L12:
		if(((PdfRectangle) (pdfannotation)).left() == 0.0F && ((PdfRectangle) (pdfannotation)).right() == 0.0F && ((PdfRectangle) (pdfannotation)).top() == 0.0F && ((PdfRectangle) (pdfannotation)).bottom() == 0.0F) goto _L7; else goto _L13
_L13:
		j = reader.getPageRotation(pageN);
		rectangle = reader.getPageSizeWithRotation(pageN);
		j;
		JVM INSTR lookupswitch 3: default 543
	//	               90: 387
	//	               180: 433
	//	               270: 491;
		   goto _L7 _L14 _L15 _L16
_L7:
		if(!pdfannotation1.isUsed())
		{
			pdfannotation1.setUsed();
			cstp.addToBody(((PdfObject) (pdfannotation1)), pdfannotation1.getIndirectReference());
		}
		  goto _L17
_L2:
		arraylist.add(((Object) (pdfannotation)));
		  goto _L3
_L10:
		pdfannotation = ((PdfAnnotation) ((PdfArray)pdfannotation));
	//  163  379:aload_1         
	//  164  380:checkcast       #38  <Class PdfArray>
	//  165  383:astore_1        
		  goto _L18
	//* 166  384:goto            198
_L14:
		pdfannotation1.put(PdfName.RECT, ((PdfObject) (new PdfRectangle(rectangle.getTop() - ((PdfRectangle) (pdfannotation)).bottom(), ((PdfRectangle) (pdfannotation)).left(), rectangle.getTop() - ((PdfRectangle) (pdfannotation)).top(), ((PdfRectangle) (pdfannotation)).right()))));
	//  167  387:aload           5
	//  168  389:getstatic       #153 <Field PdfName PdfName.RECT>
	//  169  392:new             #156 <Class PdfRectangle>
	//  170  395:dup             
	//  171  396:aload           6
	//  172  398:invokevirtual   #194 <Method float Rectangle.getTop()>
	//  173  401:aload_1         
	//  174  402:invokevirtual   #169 <Method float PdfRectangle.bottom()>
	//  175  405:fsub            
	//  176  406:aload_1         
	//  177  407:invokevirtual   #160 <Method float PdfRectangle.left()>
	//  178  410:aload           6
	//  179  412:invokevirtual   #194 <Method float Rectangle.getTop()>
	//  180  415:aload_1         
	//  181  416:invokevirtual   #166 <Method float PdfRectangle.top()>
	//  182  419:fsub            
	//  183  420:aload_1         
	//  184  421:invokevirtual   #163 <Method float PdfRectangle.right()>
	//  185  424:invokespecial   #197 <Method void PdfRectangle(float, float, float, float)>
	//  186  427:invokevirtual   #198 <Method void PdfAnnotation.put(PdfName, PdfObject)>
		  goto _L7
	//* 187  430:goto            328
_L15:
		pdfannotation1.put(PdfName.RECT, ((PdfObject) (new PdfRectangle(rectangle.getRight() - ((PdfRectangle) (pdfannotation)).left(), rectangle.getTop() - ((PdfRectangle) (pdfannotation)).bottom(), rectangle.getRight() - ((PdfRectangle) (pdfannotation)).right(), rectangle.getTop() - ((PdfRectangle) (pdfannotation)).top()))));
	//  188  433:aload           5
	//  189  435:getstatic       #153 <Field PdfName PdfName.RECT>
	//  190  438:new             #156 <Class PdfRectangle>
	//  191  441:dup             
	//  192  442:aload           6
	//  193  444:invokevirtual   #201 <Method float Rectangle.getRight()>
	//  194  447:aload_1         
	//  195  448:invokevirtual   #160 <Method float PdfRectangle.left()>
	//  196  451:fsub            
	//  197  452:aload           6
	//  198  454:invokevirtual   #194 <Method float Rectangle.getTop()>
	//  199  457:aload_1         
	//  200  458:invokevirtual   #169 <Method float PdfRectangle.bottom()>
	//  201  461:fsub            
	//  202  462:aload           6
	//  203  464:invokevirtual   #201 <Method float Rectangle.getRight()>
	//  204  467:aload_1         
	//  205  468:invokevirtual   #163 <Method float PdfRectangle.right()>
	//  206  471:fsub            
	//  207  472:aload           6
	//  208  474:invokevirtual   #194 <Method float Rectangle.getTop()>
	//  209  477:aload_1         
	//  210  478:invokevirtual   #166 <Method float PdfRectangle.top()>
	//  211  481:fsub            
	//  212  482:invokespecial   #197 <Method void PdfRectangle(float, float, float, float)>
	//  213  485:invokevirtual   #198 <Method void PdfAnnotation.put(PdfName, PdfObject)>
		  goto _L7
	//* 214  488:goto            328
_L16:
		pdfannotation1.put(PdfName.RECT, ((PdfObject) (new PdfRectangle(((PdfRectangle) (pdfannotation)).bottom(), rectangle.getRight() - ((PdfRectangle) (pdfannotation)).left(), ((PdfRectangle) (pdfannotation)).top(), rectangle.getRight() - ((PdfRectangle) (pdfannotation)).right()))));
	//  215  491:aload           5
	//  216  493:getstatic       #153 <Field PdfName PdfName.RECT>
	//  217  496:new             #156 <Class PdfRectangle>
	//  218  499:dup             
	//  219  500:aload_1         
	//  220  501:invokevirtual   #169 <Method float PdfRectangle.bottom()>
	//  221  504:aload           6
	//  222  506:invokevirtual   #201 <Method float Rectangle.getRight()>
	//  223  509:aload_1         
	//  224  510:invokevirtual   #160 <Method float PdfRectangle.left()>
	//  225  513:fsub            
	//  226  514:aload_1         
	//  227  515:invokevirtual   #166 <Method float PdfRectangle.top()>
	//  228  518:aload           6
	//  229  520:invokevirtual   #201 <Method float Rectangle.getRight()>
	//  230  523:aload_1         
	//  231  524:invokevirtual   #163 <Method float PdfRectangle.right()>
	//  232  527:fsub            
	//  233  528:invokespecial   #197 <Method void PdfRectangle(float, float, float, float)>
	//  234  531:invokevirtual   #198 <Method void PdfAnnotation.put(PdfName, PdfObject)>
		  goto _L7
	//* 235  534:goto            328
_L5:
		return;
	//  236  537:return          
_L3:
		i = 0;
	//  237  538:iconst_0        
	//  238  539:istore_2        
		continue; /* Loop/switch isn't completed */
	//  239  540:goto            63
	//* 240  543:goto            328
_L17:
		i++;
	//  241  546:iload_2         
	//  242  547:iconst_1        
	//  243  548:iadd            
	//  244  549:istore_2        
		if(true) goto _L20; else goto _L19
	//  245  550:goto            63
_L19:
	}

	public void alterContents()
		throws IOException
	{
		if(over == null && under == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #204 <Field PdfCopy$StampContent over>
	//*   2    4:ifnonnull       15
	//*   3    7:aload_0         
	//*   4    8:getfield        #206 <Field PdfCopy$StampContent under>
	//*   5   11:ifnonnull       15
			return;
	//    6   14:return          
		Object obj = ((Object) (PdfReader.getPdfObject(pageN.get(PdfName.CONTENTS), ((PdfObject) (pageN)))));
	//    7   15:aload_0         
	//    8   16:getfield        #25  <Field PdfDictionary pageN>
	//    9   19:getstatic       #209 <Field PdfName PdfName.CONTENTS>
	//   10   22:invokevirtual   #134 <Method PdfObject PdfDictionary.get(PdfName)>
	//   11   25:aload_0         
	//   12   26:getfield        #25  <Field PdfDictionary pageN>
	//   13   29:invokestatic    #140 <Method PdfObject PdfReader.getPdfObject(PdfObject, PdfObject)>
	//   14   32:astore_1        
		Object obj1;
		PdfStream pdfstream;
		if(obj == null)
	//*  15   33:aload_1         
	//*  16   34:ifnonnull       281
		{
			obj = ((Object) (new PdfArray()));
	//   17   37:new             #38  <Class PdfArray>
	//   18   40:dup             
	//   19   41:invokespecial   #39  <Method void PdfArray()>
	//   20   44:astore_1        
			pageN.put(PdfName.CONTENTS, ((PdfObject) (obj)));
	//   21   45:aload_0         
	//   22   46:getfield        #25  <Field PdfDictionary pageN>
	//   23   49:getstatic       #209 <Field PdfName PdfName.CONTENTS>
	//   24   52:aload_1         
	//   25   53:invokevirtual   #149 <Method void PdfDictionary.put(PdfName, PdfObject)>
		} else
	//*  26   56:new             #211 <Class ByteBuffer>
	//*  27   59:dup             
	//*  28   60:invokespecial   #212 <Method void ByteBuffer()>
	//*  29   63:astore_2        
	//*  30   64:aload_0         
	//*  31   65:getfield        #206 <Field PdfCopy$StampContent under>
	//*  32   68:ifnull          108
	//*  33   71:aload_2         
	//*  34   72:getstatic       #218 <Field byte[] PdfContents.SAVESTATE>
	//*  35   75:invokevirtual   #222 <Method ByteBuffer ByteBuffer.append(byte[])>
	//*  36   78:pop             
	//*  37   79:aload_0         
	//*  38   80:aload_0         
	//*  39   81:getfield        #25  <Field PdfDictionary pageN>
	//*  40   84:aload_2         
	//*  41   85:invokevirtual   #226 <Method void applyRotation(PdfDictionary, ByteBuffer)>
	//*  42   88:aload_2         
	//*  43   89:aload_0         
	//*  44   90:getfield        #206 <Field PdfCopy$StampContent under>
	//*  45   93:invokevirtual   #232 <Method ByteBuffer PdfCopy$StampContent.getInternalBuffer()>
	//*  46   96:invokevirtual   #235 <Method ByteBuffer ByteBuffer.append(ByteBuffer)>
	//*  47   99:pop             
	//*  48  100:aload_2         
	//*  49  101:getstatic       #238 <Field byte[] PdfContents.RESTORESTATE>
	//*  50  104:invokevirtual   #222 <Method ByteBuffer ByteBuffer.append(byte[])>
	//*  51  107:pop             
	//*  52  108:aload_0         
	//*  53  109:getfield        #204 <Field PdfCopy$StampContent over>
	//*  54  112:ifnull          123
	//*  55  115:aload_2         
	//*  56  116:getstatic       #218 <Field byte[] PdfContents.SAVESTATE>
	//*  57  119:invokevirtual   #222 <Method ByteBuffer ByteBuffer.append(byte[])>
	//*  58  122:pop             
	//*  59  123:new             #240 <Class PdfStream>
	//*  60  126:dup             
	//*  61  127:aload_2         
	//*  62  128:invokevirtual   #244 <Method byte[] ByteBuffer.toByteArray()>
	//*  63  131:invokespecial   #247 <Method void PdfStream(byte[])>
	//*  64  134:astore_3        
	//*  65  135:aload_3         
	//*  66  136:aload_0         
	//*  67  137:getfield        #29  <Field PdfCopy cstp>
	//*  68  140:invokevirtual   #250 <Method int PdfCopy.getCompressionLevel()>
	//*  69  143:invokevirtual   #254 <Method void PdfStream.flateCompress(int)>
	//*  70  146:aload_1         
	//*  71  147:aload_0         
	//*  72  148:getfield        #29  <Field PdfCopy cstp>
	//*  73  151:aload_3         
	//*  74  152:invokevirtual   #257 <Method PdfIndirectObject PdfCopy.addToBody(PdfObject)>
	//*  75  155:invokevirtual   #260 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//*  76  158:invokevirtual   #264 <Method void PdfArray.addFirst(PdfObject)>
	//*  77  161:aload_2         
	//*  78  162:invokevirtual   #267 <Method void ByteBuffer.reset()>
	//*  79  165:aload_0         
	//*  80  166:getfield        #204 <Field PdfCopy$StampContent over>
	//*  81  169:ifnull          263
	//*  82  172:aload_2         
	//*  83  173:bipush          32
	//*  84  175:invokevirtual   #270 <Method ByteBuffer ByteBuffer.append(char)>
	//*  85  178:pop             
	//*  86  179:aload_2         
	//*  87  180:getstatic       #238 <Field byte[] PdfContents.RESTORESTATE>
	//*  88  183:invokevirtual   #222 <Method ByteBuffer ByteBuffer.append(byte[])>
	//*  89  186:pop             
	//*  90  187:aload_2         
	//*  91  188:getstatic       #218 <Field byte[] PdfContents.SAVESTATE>
	//*  92  191:invokevirtual   #222 <Method ByteBuffer ByteBuffer.append(byte[])>
	//*  93  194:pop             
	//*  94  195:aload_0         
	//*  95  196:aload_0         
	//*  96  197:getfield        #25  <Field PdfDictionary pageN>
	//*  97  200:aload_2         
	//*  98  201:invokevirtual   #226 <Method void applyRotation(PdfDictionary, ByteBuffer)>
	//*  99  204:aload_2         
	//* 100  205:aload_0         
	//* 101  206:getfield        #204 <Field PdfCopy$StampContent over>
	//* 102  209:invokevirtual   #232 <Method ByteBuffer PdfCopy$StampContent.getInternalBuffer()>
	//* 103  212:invokevirtual   #235 <Method ByteBuffer ByteBuffer.append(ByteBuffer)>
	//* 104  215:pop             
	//* 105  216:aload_2         
	//* 106  217:getstatic       #238 <Field byte[] PdfContents.RESTORESTATE>
	//* 107  220:invokevirtual   #222 <Method ByteBuffer ByteBuffer.append(byte[])>
	//* 108  223:pop             
	//* 109  224:new             #240 <Class PdfStream>
	//* 110  227:dup             
	//* 111  228:aload_2         
	//* 112  229:invokevirtual   #244 <Method byte[] ByteBuffer.toByteArray()>
	//* 113  232:invokespecial   #247 <Method void PdfStream(byte[])>
	//* 114  235:astore_2        
	//* 115  236:aload_2         
	//* 116  237:aload_0         
	//* 117  238:getfield        #29  <Field PdfCopy cstp>
	//* 118  241:invokevirtual   #250 <Method int PdfCopy.getCompressionLevel()>
	//* 119  244:invokevirtual   #254 <Method void PdfStream.flateCompress(int)>
	//* 120  247:aload_1         
	//* 121  248:aload_0         
	//* 122  249:getfield        #29  <Field PdfCopy cstp>
	//* 123  252:aload_2         
	//* 124  253:invokevirtual   #257 <Method PdfIndirectObject PdfCopy.addToBody(PdfObject)>
	//* 125  256:invokevirtual   #260 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//* 126  259:invokevirtual   #43  <Method boolean PdfArray.add(PdfObject)>
	//* 127  262:pop             
	//* 128  263:aload_0         
	//* 129  264:getfield        #25  <Field PdfDictionary pageN>
	//* 130  267:getstatic       #273 <Field PdfName PdfName.RESOURCES>
	//* 131  270:aload_0         
	//* 132  271:getfield        #275 <Field PageResources pageResources>
	//* 133  274:invokevirtual   #281 <Method PdfDictionary PageResources.getResources()>
	//* 134  277:invokevirtual   #149 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 135  280:return          
		if(((PdfObject) (obj)).isArray())
	//* 136  281:aload_1         
	//* 137  282:invokevirtual   #145 <Method boolean PdfObject.isArray()>
	//* 138  285:ifeq            296
			obj = ((Object) ((PdfArray)obj));
	//  139  288:aload_1         
	//  140  289:checkcast       #38  <Class PdfArray>
	//  141  292:astore_1        
		else
	//* 142  293:goto            56
		if(((PdfObject) (obj)).isStream())
	//* 143  296:aload_1         
	//* 144  297:invokevirtual   #284 <Method boolean PdfObject.isStream()>
	//* 145  300:ifeq            340
		{
			obj = ((Object) (new PdfArray()));
	//  146  303:new             #38  <Class PdfArray>
	//  147  306:dup             
	//  148  307:invokespecial   #39  <Method void PdfArray()>
	//  149  310:astore_1        
			((PdfArray) (obj)).add(pageN.get(PdfName.CONTENTS));
	//  150  311:aload_1         
	//  151  312:aload_0         
	//  152  313:getfield        #25  <Field PdfDictionary pageN>
	//  153  316:getstatic       #209 <Field PdfName PdfName.CONTENTS>
	//  154  319:invokevirtual   #134 <Method PdfObject PdfDictionary.get(PdfName)>
	//  155  322:invokevirtual   #43  <Method boolean PdfArray.add(PdfObject)>
	//  156  325:pop             
			pageN.put(PdfName.CONTENTS, ((PdfObject) (obj)));
	//  157  326:aload_0         
	//  158  327:getfield        #25  <Field PdfDictionary pageN>
	//  159  330:getstatic       #209 <Field PdfName PdfName.CONTENTS>
	//  160  333:aload_1         
	//  161  334:invokevirtual   #149 <Method void PdfDictionary.put(PdfName, PdfObject)>
		} else
	//* 162  337:goto            56
		{
			obj = ((Object) (new PdfArray()));
	//  163  340:new             #38  <Class PdfArray>
	//  164  343:dup             
	//  165  344:invokespecial   #39  <Method void PdfArray()>
	//  166  347:astore_1        
			pageN.put(PdfName.CONTENTS, ((PdfObject) (obj)));
	//  167  348:aload_0         
	//  168  349:getfield        #25  <Field PdfDictionary pageN>
	//  169  352:getstatic       #209 <Field PdfName PdfName.CONTENTS>
	//  170  355:aload_1         
	//  171  356:invokevirtual   #149 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}
		obj1 = ((Object) (new ByteBuffer()));
		if(under != null)
		{
			((ByteBuffer) (obj1)).append(PdfContents.SAVESTATE);
			applyRotation(pageN, ((ByteBuffer) (obj1)));
			((ByteBuffer) (obj1)).append(under.getInternalBuffer());
			((ByteBuffer) (obj1)).append(PdfContents.RESTORESTATE);
		}
		if(over != null)
			((ByteBuffer) (obj1)).append(PdfContents.SAVESTATE);
		pdfstream = new PdfStream(((ByteBuffer) (obj1)).toByteArray());
		pdfstream.flateCompress(cstp.getCompressionLevel());
		((PdfArray) (obj)).addFirst(((PdfObject) (cstp.addToBody(((PdfObject) (pdfstream))).getIndirectReference())));
		((ByteBuffer) (obj1)).reset();
		if(over != null)
		{
			((ByteBuffer) (obj1)).append(' ');
			((ByteBuffer) (obj1)).append(PdfContents.RESTORESTATE);
			((ByteBuffer) (obj1)).append(PdfContents.SAVESTATE);
			applyRotation(pageN, ((ByteBuffer) (obj1)));
			((ByteBuffer) (obj1)).append(over.getInternalBuffer());
			((ByteBuffer) (obj1)).append(PdfContents.RESTORESTATE);
			obj1 = ((Object) (new PdfStream(((ByteBuffer) (obj1)).toByteArray())));
			((PdfStream) (obj1)).flateCompress(cstp.getCompressionLevel());
			((PdfArray) (obj)).add(((PdfObject) (cstp.addToBody(((PdfObject) (obj1))).getIndirectReference())));
		}
		pageN.put(PdfName.RESOURCES, ((PdfObject) (pageResources.getResources())));
	//* 172  359:goto            56
	}

	void applyRotation(PdfDictionary pdfdictionary, ByteBuffer bytebuffer)
	{
		if(!PdfCopy.access$000(cstp))
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field PdfCopy cstp>
	//*   2    4:invokestatic    #289 <Method boolean PdfCopy.access$000(PdfCopy)>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		pdfdictionary = ((PdfDictionary) (reader.getPageSizeWithRotation(pdfdictionary)));
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field PdfReader reader>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #177 <Method Rectangle PdfReader.getPageSizeWithRotation(PdfDictionary)>
	//    9   19:astore_1        
		switch(((Rectangle) (pdfdictionary)).getRotation())
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #292 <Method int Rectangle.getRotation()>
		{
	//*  12   24:lookupswitch    3: default 60
	//	               90: 61
	//	               180: 97
	//	               270: 139
		default:
			return;
	//   13   60:return          

		case 90: // 'Z'
			bytebuffer.append(PdfContents.ROTATE90);
	//   14   61:aload_2         
	//   15   62:getstatic       #295 <Field byte[] PdfContents.ROTATE90>
	//   16   65:invokevirtual   #222 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   17   68:pop             
			bytebuffer.append(((Rectangle) (pdfdictionary)).getTop());
	//   18   69:aload_2         
	//   19   70:aload_1         
	//   20   71:invokevirtual   #194 <Method float Rectangle.getTop()>
	//   21   74:invokevirtual   #298 <Method ByteBuffer ByteBuffer.append(float)>
	//   22   77:pop             
			bytebuffer.append(' ').append('0').append(PdfContents.ROTATEFINAL);
	//   23   78:aload_2         
	//   24   79:bipush          32
	//   25   81:invokevirtual   #270 <Method ByteBuffer ByteBuffer.append(char)>
	//   26   84:bipush          48
	//   27   86:invokevirtual   #270 <Method ByteBuffer ByteBuffer.append(char)>
	//   28   89:getstatic       #301 <Field byte[] PdfContents.ROTATEFINAL>
	//   29   92:invokevirtual   #222 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   30   95:pop             
			return;
	//   31   96:return          

		case 180: 
			bytebuffer.append(PdfContents.ROTATE180);
	//   32   97:aload_2         
	//   33   98:getstatic       #304 <Field byte[] PdfContents.ROTATE180>
	//   34  101:invokevirtual   #222 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   35  104:pop             
			bytebuffer.append(((Rectangle) (pdfdictionary)).getRight());
	//   36  105:aload_2         
	//   37  106:aload_1         
	//   38  107:invokevirtual   #201 <Method float Rectangle.getRight()>
	//   39  110:invokevirtual   #298 <Method ByteBuffer ByteBuffer.append(float)>
	//   40  113:pop             
			bytebuffer.append(' ');
	//   41  114:aload_2         
	//   42  115:bipush          32
	//   43  117:invokevirtual   #270 <Method ByteBuffer ByteBuffer.append(char)>
	//   44  120:pop             
			bytebuffer.append(((Rectangle) (pdfdictionary)).getTop());
	//   45  121:aload_2         
	//   46  122:aload_1         
	//   47  123:invokevirtual   #194 <Method float Rectangle.getTop()>
	//   48  126:invokevirtual   #298 <Method ByteBuffer ByteBuffer.append(float)>
	//   49  129:pop             
			bytebuffer.append(PdfContents.ROTATEFINAL);
	//   50  130:aload_2         
	//   51  131:getstatic       #301 <Field byte[] PdfContents.ROTATEFINAL>
	//   52  134:invokevirtual   #222 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   53  137:pop             
			return;
	//   54  138:return          

		case 270: 
			bytebuffer.append(PdfContents.ROTATE270);
	//   55  139:aload_2         
	//   56  140:getstatic       #307 <Field byte[] PdfContents.ROTATE270>
	//   57  143:invokevirtual   #222 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   58  146:pop             
			break;
		}
		bytebuffer.append('0').append(' ');
	//   59  147:aload_2         
	//   60  148:bipush          48
	//   61  150:invokevirtual   #270 <Method ByteBuffer ByteBuffer.append(char)>
	//   62  153:bipush          32
	//   63  155:invokevirtual   #270 <Method ByteBuffer ByteBuffer.append(char)>
	//   64  158:pop             
		bytebuffer.append(((Rectangle) (pdfdictionary)).getRight());
	//   65  159:aload_2         
	//   66  160:aload_1         
	//   67  161:invokevirtual   #201 <Method float Rectangle.getRight()>
	//   68  164:invokevirtual   #298 <Method ByteBuffer ByteBuffer.append(float)>
	//   69  167:pop             
		bytebuffer.append(PdfContents.ROTATEFINAL);
	//   70  168:aload_2         
	//   71  169:getstatic       #301 <Field byte[] PdfContents.ROTATEFINAL>
	//   72  172:invokevirtual   #222 <Method ByteBuffer ByteBuffer.append(byte[])>
	//   73  175:pop             
	//   74  176:return          
	}

	public PdfContentByte getOverContent()
	{
		if(over == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #204 <Field PdfCopy$StampContent over>
	//*   2    4:ifnonnull       70
		{
			if(pageResources == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #275 <Field PageResources pageResources>
	//*   5   11:ifnonnull       51
			{
				pageResources = new PageResources();
	//    6   14:aload_0         
	//    7   15:new             #277 <Class PageResources>
	//    8   18:dup             
	//    9   19:invokespecial   #310 <Method void PageResources()>
	//   10   22:putfield        #275 <Field PageResources pageResources>
				PdfDictionary pdfdictionary = pageN.getAsDict(PdfName.RESOURCES);
	//   11   25:aload_0         
	//   12   26:getfield        #25  <Field PdfDictionary pageN>
	//   13   29:getstatic       #273 <Field PdfName PdfName.RESOURCES>
	//   14   32:invokevirtual   #314 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   15   35:astore_1        
				pageResources.setOriginalResources(pdfdictionary, cstp.namePtr);
	//   16   36:aload_0         
	//   17   37:getfield        #275 <Field PageResources pageResources>
	//   18   40:aload_1         
	//   19   41:aload_0         
	//   20   42:getfield        #29  <Field PdfCopy cstp>
	//   21   45:getfield        #318 <Field int[] PdfCopy.namePtr>
	//   22   48:invokevirtual   #322 <Method void PageResources.setOriginalResources(PdfDictionary, int[])>
			}
			over = new nt(((PdfWriter) (cstp)), pageResources);
	//   23   51:aload_0         
	//   24   52:new             #228 <Class PdfCopy$StampContent>
	//   25   55:dup             
	//   26   56:aload_0         
	//   27   57:getfield        #29  <Field PdfCopy cstp>
	//   28   60:aload_0         
	//   29   61:getfield        #275 <Field PageResources pageResources>
	//   30   64:invokespecial   #325 <Method void PdfCopy$StampContent(PdfWriter, PageResources)>
	//   31   67:putfield        #204 <Field PdfCopy$StampContent over>
		}
		return ((PdfContentByte) (over));
	//   32   70:aload_0         
	//   33   71:getfield        #204 <Field PdfCopy$StampContent over>
	//   34   74:areturn         
	}

	public PdfContentByte getUnderContent()
	{
		if(under == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #206 <Field PdfCopy$StampContent under>
	//*   2    4:ifnonnull       70
		{
			if(pageResources == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #275 <Field PageResources pageResources>
	//*   5   11:ifnonnull       51
			{
				pageResources = new PageResources();
	//    6   14:aload_0         
	//    7   15:new             #277 <Class PageResources>
	//    8   18:dup             
	//    9   19:invokespecial   #310 <Method void PageResources()>
	//   10   22:putfield        #275 <Field PageResources pageResources>
				PdfDictionary pdfdictionary = pageN.getAsDict(PdfName.RESOURCES);
	//   11   25:aload_0         
	//   12   26:getfield        #25  <Field PdfDictionary pageN>
	//   13   29:getstatic       #273 <Field PdfName PdfName.RESOURCES>
	//   14   32:invokevirtual   #314 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   15   35:astore_1        
				pageResources.setOriginalResources(pdfdictionary, cstp.namePtr);
	//   16   36:aload_0         
	//   17   37:getfield        #275 <Field PageResources pageResources>
	//   18   40:aload_1         
	//   19   41:aload_0         
	//   20   42:getfield        #29  <Field PdfCopy cstp>
	//   21   45:getfield        #318 <Field int[] PdfCopy.namePtr>
	//   22   48:invokevirtual   #322 <Method void PageResources.setOriginalResources(PdfDictionary, int[])>
			}
			under = new nt(((PdfWriter) (cstp)), pageResources);
	//   23   51:aload_0         
	//   24   52:new             #228 <Class PdfCopy$StampContent>
	//   25   55:dup             
	//   26   56:aload_0         
	//   27   57:getfield        #29  <Field PdfCopy cstp>
	//   28   60:aload_0         
	//   29   61:getfield        #275 <Field PageResources pageResources>
	//   30   64:invokespecial   #325 <Method void PdfCopy$StampContent(PdfWriter, PageResources)>
	//   31   67:putfield        #206 <Field PdfCopy$StampContent under>
		}
		return ((PdfContentByte) (under));
	//   32   70:aload_0         
	//   33   71:getfield        #206 <Field PdfCopy$StampContent under>
	//   34   74:areturn         
	}

	PdfCopy cstp;
	nt over;
	PdfDictionary pageN;
	PageResources pageResources;
	PdfReader reader;
	nt under;

	PdfCopy$PageStamp(PdfReader pdfreader, PdfDictionary pdfdictionary, PdfCopy pdfcopy)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		pageN = pdfdictionary;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #25  <Field PdfDictionary pageN>
		reader = pdfreader;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #27  <Field PdfReader reader>
		cstp = pdfcopy;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #29  <Field PdfCopy cstp>
	//   11   19:return          
	}
}
