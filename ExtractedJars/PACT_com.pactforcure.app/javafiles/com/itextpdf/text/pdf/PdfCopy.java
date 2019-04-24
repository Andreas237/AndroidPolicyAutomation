// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.exceptions.BadPasswordException;
import com.itextpdf.text.log.*;
import java.io.*;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfWriter, PdfName, PdfDocument, PdfDictionary, 
//			PdfString, PdfTemplate, PdfFormField, PdfIndirectObject, 
//			PdfNumber, PdfArray, BadPdfFormatException, TextField, 
//			AcroFields, PdfReader, PdfAppearance, RefKey, 
//			PdfObject, PdfIndirectReference, PdfBoolean, PRIndirectReference, 
//			PdfNull, PdfException, PdfStructTreeController, PdfRectangle, 
//			PageResources, PdfPage, PdfPages, PdfImportedPage, 
//			PdfStructureTreeRoot, PdfLiteral, PRStream, PdfReaderInstance, 
//			PdfOutline, PdfContents, PdfAnnotation, PdfStream, 
//			PdfPageEvent, ByteBuffer, PdfContentByte

public class PdfCopy extends PdfWriter
{
	protected static class ImportedPage
	{

		public boolean equals(Object obj)
		{
			if(obj instanceof ImportedPage)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #2   <Class PdfCopy$ImportedPage>
		//*   2    4:ifne            9
		//*   3    7:iconst_0        
		//*   4    8:ireturn         
		//*   5    9:aload_1         
		//*   6   10:checkcast       #2   <Class PdfCopy$ImportedPage>
		//*   7   13:astore_1        
				if(pageNumber == ((ImportedPage) (obj = ((Object) ((ImportedPage)obj)))).pageNumber && ((Object) (reader)).equals(((Object) (((ImportedPage) (obj)).reader))))
		//*   8   14:aload_0         
		//*   9   15:getfield        #22  <Field int pageNumber>
		//*  10   18:aload_1         
		//*  11   19:getfield        #22  <Field int pageNumber>
		//*  12   22:icmpne          7
		//*  13   25:aload_0         
		//*  14   26:getfield        #24  <Field PdfReader reader>
		//*  15   29:aload_1         
		//*  16   30:getfield        #24  <Field PdfReader reader>
		//*  17   33:invokevirtual   #34  <Method boolean Object.equals(Object)>
		//*  18   36:ifeq            7
					return true;
		//   19   39:iconst_1        
		//   20   40:ireturn         
			return false;
		}

		public String toString()
		{
			return Integer.toString(pageNumber);
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field int pageNumber>
		//    2    4:invokestatic    #41  <Method String Integer.toString(int)>
		//    3    7:areturn         
		}

		PdfIndirectReference annotsIndirectReference;
		PdfArray mergedFields;
		int pageNumber;
		PdfReader reader;

		ImportedPage(PdfReader pdfreader, int i, boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			pageNumber = i;
		//    2    4:aload_0         
		//    3    5:iload_2         
		//    4    6:putfield        #22  <Field int pageNumber>
			reader = pdfreader;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #24  <Field PdfReader reader>
			if(flag)
		//*   8   14:iload_3         
		//*   9   15:ifeq            29
				mergedFields = new PdfArray();
		//   10   18:aload_0         
		//   11   19:new             #26  <Class PdfArray>
		//   12   22:dup             
		//   13   23:invokespecial   #27  <Method void PdfArray()>
		//   14   26:putfield        #29  <Field PdfArray mergedFields>
		//   15   29:return          
		}
	}

	static class IndirectReferences
	{

		boolean getCopied()
		{
			return hasCopied;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field boolean hasCopied>
		//    2    4:ireturn         
		}

		PdfIndirectReference getRef()
		{
			return theRef;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field PdfIndirectReference theRef>
		//    2    4:areturn         
		}

		void setCopied()
		{
			hasCopied = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #20  <Field boolean hasCopied>
		//    3    5:return          
		}

		void setNotCopied()
		{
			hasCopied = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #20  <Field boolean hasCopied>
		//    3    5:return          
		}

		public String toString()
		{
			String s = "";
		//    0    0:ldc1            #31  <String "">
		//    1    2:astore_1        
			if(hasCopied)
		//*   2    3:aload_0         
		//*   3    4:getfield        #20  <Field boolean hasCopied>
		//*   4    7:ifeq            31
				s = (new StringBuilder()).append("").append(" Copied").toString();
		//    5   10:new             #33  <Class StringBuilder>
		//    6   13:dup             
		//    7   14:invokespecial   #34  <Method void StringBuilder()>
		//    8   17:ldc1            #31  <String "">
		//    9   19:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
		//   10   22:ldc1            #40  <String " Copied">
		//   11   24:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
		//   12   27:invokevirtual   #42  <Method String StringBuilder.toString()>
		//   13   30:astore_1        
			return (new StringBuilder()).append(((Object) (getRef()))).append(s).toString();
		//   14   31:new             #33  <Class StringBuilder>
		//   15   34:dup             
		//   16   35:invokespecial   #34  <Method void StringBuilder()>
		//   17   38:aload_0         
		//   18   39:invokevirtual   #44  <Method PdfIndirectReference getRef()>
		//   19   42:invokevirtual   #47  <Method StringBuilder StringBuilder.append(Object)>
		//   20   45:aload_1         
		//   21   46:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
		//   22   49:invokevirtual   #42  <Method String StringBuilder.toString()>
		//   23   52:areturn         
		}

		boolean hasCopied;
		PdfIndirectReference theRef;

		IndirectReferences(PdfIndirectReference pdfindirectreference)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			theRef = pdfindirectreference;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field PdfIndirectReference theRef>
			hasCopied = false;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #20  <Field boolean hasCopied>
		//    8   14:return          
		}
	}

	public static class PageStamp
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
		//*  53  117:invokevirtual   #114 <Method boolean HashSet.addAll(Collection)>
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
		//		               90: 387
		//		               180: 433
		//		               270: 491
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
			cstp.fieldTemplates.addAll(((Collection) (pdfannotation)));
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
		//		               90: 387
		//		               180: 433
		//		               270: 491;
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
			if(!cstp.rotateContents)
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
		//		               90: 61
		//		               180: 97
		//		               270: 139
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
				over = new StampContent(((PdfWriter) (cstp)), pageResources);
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
				under = new StampContent(((PdfWriter) (cstp)), pageResources);
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
		StampContent over;
		PdfDictionary pageN;
		PageResources pageResources;
		PdfReader reader;
		StampContent under;

		PageStamp(PdfReader pdfreader, PdfDictionary pdfdictionary, PdfCopy pdfcopy)
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

	public static class StampContent extends PdfContentByte
	{

		public PdfContentByte getDuplicate()
		{
			return ((PdfContentByte) (new StampContent(writer, pageResources)));
		//    0    0:new             #2   <Class PdfCopy$StampContent>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #23  <Field PdfWriter writer>
		//    4    8:aload_0         
		//    5    9:getfield        #16  <Field PageResources pageResources>
		//    6   12:invokespecial   #25  <Method void PdfCopy$StampContent(PdfWriter, PageResources)>
		//    7   15:areturn         
		}

		PageResources getPageResources()
		{
			return pageResources;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field PageResources pageResources>
		//    2    4:areturn         
		}

		PageResources pageResources;

		StampContent(PdfWriter pdfwriter, PageResources pageresources)
		{
			super(pdfwriter);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #14  <Method void PdfContentByte(PdfWriter)>
			pageResources = pageresources;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #16  <Field PageResources pageResources>
		//    6   10:return          
		}
	}


	public PdfCopy(Document document, OutputStream outputstream)
		throws DocumentException
	{
		super(new PdfDocument(), outputstream);
	//    0    0:aload_0         
	//    1    1:new             #259 <Class PdfDocument>
	//    2    4:dup             
	//    3    5:invokespecial   #260 <Method void PdfDocument()>
	//    4    8:aload_2         
	//    5    9:invokespecial   #263 <Method void PdfWriter(PdfDocument, OutputStream)>
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:newarray        int[]
	//    9   16:dup             
	//   10   17:iconst_0        
	//   11   18:iconst_0        
	//   12   19:iastore         
	//   13   20:putfield        #265 <Field int[] namePtr>
		rotateContents = true;
	//   14   23:aload_0         
	//   15   24:iconst_1        
	//   16   25:putfield        #267 <Field boolean rotateContents>
		structTreeController = null;
	//   17   28:aload_0         
	//   18   29:aconst_null     
	//   19   30:putfield        #269 <Field PdfStructTreeController structTreeController>
		currentStructArrayNumber = 0;
	//   20   33:aload_0         
	//   21   34:iconst_0        
	//   22   35:putfield        #271 <Field int currentStructArrayNumber>
		updateRootKids = false;
	//   23   38:aload_0         
	//   24   39:iconst_0        
	//   25   40:putfield        #273 <Field boolean updateRootKids>
		mergeFields = false;
	//   26   43:aload_0         
	//   27   44:iconst_0        
	//   28   45:putfield        #275 <Field boolean mergeFields>
		needAppearances = false;
	//   29   48:aload_0         
	//   30   49:iconst_0        
	//   31   50:putfield        #277 <Field boolean needAppearances>
		mergeFieldsInternalCall = false;
	//   32   53:aload_0         
	//   33   54:iconst_0        
	//   34   55:putfield        #279 <Field boolean mergeFieldsInternalCall>
		mergedRadioButtons = new HashSet();
	//   35   58:aload_0         
	//   36   59:new             #139 <Class HashSet>
	//   37   62:dup             
	//   38   63:invokespecial   #141 <Method void HashSet()>
	//   39   66:putfield        #281 <Field HashSet mergedRadioButtons>
		mergedTextFields = new HashMap();
	//   40   69:aload_0         
	//   41   70:new             #283 <Class HashMap>
	//   42   73:dup             
	//   43   74:invokespecial   #284 <Method void HashMap()>
	//   44   77:putfield        #286 <Field HashMap mergedTextFields>
		readersWithImportedStructureTreeRootKids = new HashSet();
	//   45   80:aload_0         
	//   46   81:new             #139 <Class HashSet>
	//   47   84:dup             
	//   48   85:invokespecial   #141 <Method void HashSet()>
	//   49   88:putfield        #288 <Field HashSet readersWithImportedStructureTreeRootKids>
		document.addDocListener(((com.itextpdf.text.DocListener) (pdf)));
	//   50   91:aload_1         
	//   51   92:aload_0         
	//   52   93:getfield        #292 <Field PdfDocument pdf>
	//   53   96:invokevirtual   #298 <Method void Document.addDocListener(com.itextpdf.text.DocListener)>
		pdf.addWriter(((PdfWriter) (this)));
	//   54   99:aload_0         
	//   55  100:getfield        #292 <Field PdfDocument pdf>
	//   56  103:aload_0         
	//   57  104:invokevirtual   #302 <Method void PdfDocument.addWriter(PdfWriter)>
		indirectMap = new HashMap();
	//   58  107:aload_0         
	//   59  108:new             #283 <Class HashMap>
	//   60  111:dup             
	//   61  112:invokespecial   #284 <Method void HashMap()>
	//   62  115:putfield        #304 <Field HashMap indirectMap>
		parentObjects = new HashMap();
	//   63  118:aload_0         
	//   64  119:new             #283 <Class HashMap>
	//   65  122:dup             
	//   66  123:invokespecial   #284 <Method void HashMap()>
	//   67  126:putfield        #306 <Field HashMap parentObjects>
		disableIndirects = new HashSet();
	//   68  129:aload_0         
	//   69  130:new             #139 <Class HashSet>
	//   70  133:dup             
	//   71  134:invokespecial   #141 <Method void HashSet()>
	//   72  137:putfield        #308 <Field HashSet disableIndirects>
		indirectObjects = new LinkedHashMap();
	//   73  140:aload_0         
	//   74  141:new             #310 <Class LinkedHashMap>
	//   75  144:dup             
	//   76  145:invokespecial   #311 <Method void LinkedHashMap()>
	//   77  148:putfield        #313 <Field LinkedHashMap indirectObjects>
		savedObjects = new ArrayList();
	//   78  151:aload_0         
	//   79  152:new             #315 <Class ArrayList>
	//   80  155:dup             
	//   81  156:invokespecial   #316 <Method void ArrayList()>
	//   82  159:putfield        #318 <Field ArrayList savedObjects>
		importedPages = new ArrayList();
	//   83  162:aload_0         
	//   84  163:new             #315 <Class ArrayList>
	//   85  166:dup             
	//   86  167:invokespecial   #316 <Method void ArrayList()>
	//   87  170:putfield        #320 <Field ArrayList importedPages>
	//   88  173:return          
	}

	private void addFieldResources(PdfDictionary pdfdictionary)
		throws IOException
	{
		if(fieldArray != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #329 <Field PdfArray fieldArray>
	//*   2    4:ifnonnull       8
	//*   3    7:return          
		{
			PdfDictionary pdfdictionary1 = new PdfDictionary();
	//    4    8:new             #331 <Class PdfDictionary>
	//    5   11:dup             
	//    6   12:invokespecial   #332 <Method void PdfDictionary()>
	//    7   15:astore_2        
			pdfdictionary.put(PdfName.ACROFORM, ((PdfObject) (pdfdictionary1)));
	//    8   16:aload_1         
	//    9   17:getstatic       #335 <Field PdfName PdfName.ACROFORM>
	//   10   20:aload_2         
	//   11   21:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary1.put(PdfName.FIELDS, ((PdfObject) (fieldArray)));
	//   12   24:aload_2         
	//   13   25:getstatic       #342 <Field PdfName PdfName.FIELDS>
	//   14   28:aload_0         
	//   15   29:getfield        #329 <Field PdfArray fieldArray>
	//   16   32:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary1.put(PdfName.DA, ((PdfObject) (new PdfString("/Helv 0 Tf 0 g "))));
	//   17   35:aload_2         
	//   18   36:getstatic       #200 <Field PdfName PdfName.DA>
	//   19   39:new             #344 <Class PdfString>
	//   20   42:dup             
	//   21   43:ldc2            #346 <String "/Helv 0 Tf 0 g ">
	//   22   46:invokespecial   #347 <Method void PdfString(String)>
	//   23   49:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
			if(!fieldTemplates.isEmpty())
	//*  24   52:aload_0         
	//*  25   53:getfield        #349 <Field HashSet fieldTemplates>
	//*  26   56:invokevirtual   #353 <Method boolean HashSet.isEmpty()>
	//*  27   59:ifne            7
			{
				PdfDictionary pdfdictionary4 = new PdfDictionary();
	//   28   62:new             #331 <Class PdfDictionary>
	//   29   65:dup             
	//   30   66:invokespecial   #332 <Method void PdfDictionary()>
	//   31   69:astore_3        
				pdfdictionary1.put(PdfName.DR, ((PdfObject) (pdfdictionary4)));
	//   32   70:aload_2         
	//   33   71:getstatic       #356 <Field PdfName PdfName.DR>
	//   34   74:aload_3         
	//   35   75:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
				for(pdfdictionary = ((PdfDictionary) (fieldTemplates.iterator())); ((Iterator) (pdfdictionary)).hasNext(); PdfFormField.mergeResources(pdfdictionary4, (PdfDictionary)((PdfTemplate)((Iterator) (pdfdictionary)).next()).getResources()));
	//   36   78:aload_0         
	//   37   79:getfield        #349 <Field HashSet fieldTemplates>
	//   38   82:invokevirtual   #360 <Method Iterator HashSet.iterator()>
	//   39   85:astore_1        
	//   40   86:aload_1         
	//   41   87:invokeinterface #365 <Method boolean Iterator.hasNext()>
	//   42   92:ifeq            117
	//   43   95:aload_3         
	//   44   96:aload_1         
	//   45   97:invokeinterface #369 <Method Object Iterator.next()>
	//   46  102:checkcast       #371 <Class PdfTemplate>
	//   47  105:invokevirtual   #375 <Method PdfObject PdfTemplate.getResources()>
	//   48  108:checkcast       #331 <Class PdfDictionary>
	//   49  111:invokestatic    #381 <Method void PdfFormField.mergeResources(PdfDictionary, PdfDictionary)>
	//*  50  114:goto            86
				pdfdictionary1 = pdfdictionary4.getAsDict(PdfName.FONT);
	//   51  117:aload_3         
	//   52  118:getstatic       #384 <Field PdfName PdfName.FONT>
	//   53  121:invokevirtual   #388 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   54  124:astore_2        
				pdfdictionary = pdfdictionary1;
	//   55  125:aload_2         
	//   56  126:astore_1        
				if(pdfdictionary1 == null)
	//*  57  127:aload_2         
	//*  58  128:ifnonnull       147
				{
					pdfdictionary = new PdfDictionary();
	//   59  131:new             #331 <Class PdfDictionary>
	//   60  134:dup             
	//   61  135:invokespecial   #332 <Method void PdfDictionary()>
	//   62  138:astore_1        
					pdfdictionary4.put(PdfName.FONT, ((PdfObject) (pdfdictionary)));
	//   63  139:aload_3         
	//   64  140:getstatic       #384 <Field PdfName PdfName.FONT>
	//   65  143:aload_1         
	//   66  144:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
				}
				if(!pdfdictionary.contains(PdfName.HELV))
	//*  67  147:aload_1         
	//*  68  148:getstatic       #391 <Field PdfName PdfName.HELV>
	//*  69  151:invokevirtual   #395 <Method boolean PdfDictionary.contains(PdfName)>
	//*  70  154:ifne            223
				{
					PdfDictionary pdfdictionary2 = new PdfDictionary(PdfName.FONT);
	//   71  157:new             #331 <Class PdfDictionary>
	//   72  160:dup             
	//   73  161:getstatic       #384 <Field PdfName PdfName.FONT>
	//   74  164:invokespecial   #398 <Method void PdfDictionary(PdfName)>
	//   75  167:astore_2        
					pdfdictionary2.put(PdfName.BASEFONT, ((PdfObject) (PdfName.HELVETICA)));
	//   76  168:aload_2         
	//   77  169:getstatic       #401 <Field PdfName PdfName.BASEFONT>
	//   78  172:getstatic       #404 <Field PdfName PdfName.HELVETICA>
	//   79  175:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
					pdfdictionary2.put(PdfName.ENCODING, ((PdfObject) (PdfName.WIN_ANSI_ENCODING)));
	//   80  178:aload_2         
	//   81  179:getstatic       #407 <Field PdfName PdfName.ENCODING>
	//   82  182:getstatic       #410 <Field PdfName PdfName.WIN_ANSI_ENCODING>
	//   83  185:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
					pdfdictionary2.put(PdfName.NAME, ((PdfObject) (PdfName.HELV)));
	//   84  188:aload_2         
	//   85  189:getstatic       #413 <Field PdfName PdfName.NAME>
	//   86  192:getstatic       #391 <Field PdfName PdfName.HELV>
	//   87  195:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
					pdfdictionary2.put(PdfName.SUBTYPE, ((PdfObject) (PdfName.TYPE1)));
	//   88  198:aload_2         
	//   89  199:getstatic       #148 <Field PdfName PdfName.SUBTYPE>
	//   90  202:getstatic       #416 <Field PdfName PdfName.TYPE1>
	//   91  205:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
					pdfdictionary.put(PdfName.HELV, ((PdfObject) (addToBody(((PdfObject) (pdfdictionary2))).getIndirectReference())));
	//   92  208:aload_1         
	//   93  209:getstatic       #391 <Field PdfName PdfName.HELV>
	//   94  212:aload_0         
	//   95  213:aload_2         
	//   96  214:invokevirtual   #420 <Method PdfIndirectObject addToBody(PdfObject)>
	//   97  217:invokevirtual   #426 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//   98  220:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
				}
				if(!pdfdictionary.contains(PdfName.ZADB))
	//*  99  223:aload_1         
	//* 100  224:getstatic       #429 <Field PdfName PdfName.ZADB>
	//* 101  227:invokevirtual   #395 <Method boolean PdfDictionary.contains(PdfName)>
	//* 102  230:ifne            7
				{
					PdfDictionary pdfdictionary3 = new PdfDictionary(PdfName.FONT);
	//  103  233:new             #331 <Class PdfDictionary>
	//  104  236:dup             
	//  105  237:getstatic       #384 <Field PdfName PdfName.FONT>
	//  106  240:invokespecial   #398 <Method void PdfDictionary(PdfName)>
	//  107  243:astore_2        
					pdfdictionary3.put(PdfName.BASEFONT, ((PdfObject) (PdfName.ZAPFDINGBATS)));
	//  108  244:aload_2         
	//  109  245:getstatic       #401 <Field PdfName PdfName.BASEFONT>
	//  110  248:getstatic       #432 <Field PdfName PdfName.ZAPFDINGBATS>
	//  111  251:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
					pdfdictionary3.put(PdfName.NAME, ((PdfObject) (PdfName.ZADB)));
	//  112  254:aload_2         
	//  113  255:getstatic       #413 <Field PdfName PdfName.NAME>
	//  114  258:getstatic       #429 <Field PdfName PdfName.ZADB>
	//  115  261:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
					pdfdictionary3.put(PdfName.SUBTYPE, ((PdfObject) (PdfName.TYPE1)));
	//  116  264:aload_2         
	//  117  265:getstatic       #148 <Field PdfName PdfName.SUBTYPE>
	//  118  268:getstatic       #416 <Field PdfName PdfName.TYPE1>
	//  119  271:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
					pdfdictionary.put(PdfName.ZADB, ((PdfObject) (addToBody(((PdfObject) (pdfdictionary3))).getIndirectReference())));
	//  120  274:aload_1         
	//  121  275:getstatic       #429 <Field PdfName PdfName.ZADB>
	//  122  278:aload_0         
	//  123  279:aload_2         
	//  124  280:invokevirtual   #420 <Method PdfIndirectObject addToBody(PdfObject)>
	//  125  283:invokevirtual   #426 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  126  286:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
					return;
	//  127  289:return          
				}
			}
		}
	}

	private void addPageOffsetToField(Map map, int i)
	{
		if(i != 0)
	//*   0    0:iload_2         
	//*   1    1:ifne            5
	//*   2    4:return          
		{
			map = ((Map) (map.values().iterator()));
	//    3    5:aload_1         
	//    4    6:invokeinterface #440 <Method Collection Map.values()>
	//    5   11:invokeinterface #443 <Method Iterator Collection.iterator()>
	//    6   16:astore_1        
			while(((Iterator) (map)).hasNext()) 
	//*   7   17:aload_1         
	//*   8   18:invokeinterface #365 <Method boolean Iterator.hasNext()>
	//*   9   23:ifeq            4
			{
				AcroFields.Item item = (AcroFields.Item)((Iterator) (map)).next();
	//   10   26:aload_1         
	//   11   27:invokeinterface #369 <Method Object Iterator.next()>
	//   12   32:checkcast       #445 <Class AcroFields$Item>
	//   13   35:astore          4
				int j = 0;
	//   14   37:iconst_0        
	//   15   38:istore_3        
				while(j < item.size()) 
	//*  16   39:iload_3         
	//*  17   40:aload           4
	//*  18   42:invokevirtual   #449 <Method int AcroFields$Item.size()>
	//*  19   45:icmpge          17
				{
					item.forcePage(j, item.getPage(j).intValue() + i);
	//   20   48:aload           4
	//   21   50:iload_3         
	//   22   51:aload           4
	//   23   53:iload_3         
	//   24   54:invokevirtual   #452 <Method Integer AcroFields$Item.getPage(int)>
	//   25   57:invokevirtual   #455 <Method int Integer.intValue()>
	//   26   60:iload_2         
	//   27   61:iadd            
	//   28   62:invokevirtual   #459 <Method void AcroFields$Item.forcePage(int, int)>
					j++;
	//   29   65:iload_3         
	//   30   66:iconst_1        
	//   31   67:iadd            
	//   32   68:istore_3        
				}
			}
		}
	//*  33   69:goto            39
	}

	private void adjustTabOrder(PdfArray pdfarray, PdfIndirectReference pdfindirectreference, PdfNumber pdfnumber)
	{
		int j1;
		j1 = pdfnumber.intValue();
	//    0    0:aload_3         
	//    1    1:invokevirtual   #466 <Method int PdfNumber.intValue()>
	//    2    4:istore          7
		pdfnumber = ((PdfNumber) ((ArrayList)tabOrder.get(((Object) (pdfarray)))));
	//    3    6:aload_0         
	//    4    7:getfield        #468 <Field HashMap tabOrder>
	//    5   10:aload_1         
	//    6   11:invokevirtual   #472 <Method Object HashMap.get(Object)>
	//    7   14:checkcast       #315 <Class ArrayList>
	//    8   17:astore_3        
		if(pdfnumber != null) goto _L2; else goto _L1
	//    9   18:aload_3         
	//   10   19:ifnonnull       92
_L1:
		pdfnumber = ((PdfNumber) (new ArrayList()));
	//   11   22:new             #315 <Class ArrayList>
	//   12   25:dup             
	//   13   26:invokespecial   #316 <Method void ArrayList()>
	//   14   29:astore_3        
		int k = pdfarray.size();
	//   15   30:aload_1         
	//   16   31:invokevirtual   #475 <Method int PdfArray.size()>
	//   17   34:istore          5
		for(int i = 0; i < k - 1; i++)
	//*  18   36:iconst_0        
	//*  19   37:istore          4
	//*  20   39:iload           4
	//*  21   41:iload           5
	//*  22   43:iconst_1        
	//*  23   44:isub            
	//*  24   45:icmpge          65
			((ArrayList) (pdfnumber)).add(((Object) (zero)));
	//   25   48:aload_3         
	//   26   49:getstatic       #137 <Field Integer zero>
	//   27   52:invokevirtual   #476 <Method boolean ArrayList.add(Object)>
	//   28   55:pop             

	//   29   56:iload           4
	//   30   58:iconst_1        
	//   31   59:iadd            
	//   32   60:istore          4
	//*  33   62:goto            39
		((ArrayList) (pdfnumber)).add(((Object) (Integer.valueOf(j1))));
	//   34   65:aload_3         
	//   35   66:iload           7
	//   36   68:invokestatic    #135 <Method Integer Integer.valueOf(int)>
	//   37   71:invokevirtual   #476 <Method boolean ArrayList.add(Object)>
	//   38   74:pop             
		tabOrder.put(((Object) (pdfarray)), ((Object) (pdfnumber)));
	//   39   75:aload_0         
	//   40   76:getfield        #468 <Field HashMap tabOrder>
	//   41   79:aload_1         
	//   42   80:aload_3         
	//   43   81:invokevirtual   #479 <Method Object HashMap.put(Object, Object)>
	//   44   84:pop             
		pdfarray.add(((PdfObject) (pdfindirectreference)));
	//   45   85:aload_1         
	//   46   86:aload_2         
	//   47   87:invokevirtual   #482 <Method boolean PdfArray.add(PdfObject)>
	//   48   90:pop             
_L4:
		return;
	//   49   91:return          
_L2:
		int j;
		int l;
		j = ((ArrayList) (pdfnumber)).size() - 1;
	//   50   92:aload_3         
	//   51   93:invokevirtual   #483 <Method int ArrayList.size()>
	//   52   96:iconst_1        
	//   53   97:isub            
	//   54   98:istore          4
		l = j;
	//   55  100:iload           4
	//   56  102:istore          5
_L5:
		int i1;
		i1 = j;
	//   57  104:iload           4
	//   58  106:istore          6
		if(l < 0)
			continue; /* Loop/switch isn't completed */
	//   59  108:iload           5
	//   60  110:iflt            156
		if(((Integer)((ArrayList) (pdfnumber)).get(l)).intValue() > j1)
			break MISSING_BLOCK_LABEL_180;
	//   61  113:aload_3         
	//   62  114:iload           5
	//   63  116:invokevirtual   #486 <Method Object ArrayList.get(int)>
	//   64  119:checkcast       #131 <Class Integer>
	//   65  122:invokevirtual   #455 <Method int Integer.intValue()>
	//   66  125:iload           7
	//   67  127:icmpgt          180
		((ArrayList) (pdfnumber)).add(l + 1, ((Object) (Integer.valueOf(j1))));
	//   68  130:aload_3         
	//   69  131:iload           5
	//   70  133:iconst_1        
	//   71  134:iadd            
	//   72  135:iload           7
	//   73  137:invokestatic    #135 <Method Integer Integer.valueOf(int)>
	//   74  140:invokevirtual   #489 <Method void ArrayList.add(int, Object)>
		pdfarray.add(l + 1, ((PdfObject) (pdfindirectreference)));
	//   75  143:aload_1         
	//   76  144:iload           5
	//   77  146:iconst_1        
	//   78  147:iadd            
	//   79  148:aload_2         
	//   80  149:invokevirtual   #492 <Method void PdfArray.add(int, PdfObject)>
		i1 = -2;
	//   81  152:bipush          -2
	//   82  154:istore          6
		if(i1 == -2) goto _L4; else goto _L3
	//   83  156:iload           6
	//   84  158:bipush          -2
	//   85  160:icmpeq          91
_L3:
		((ArrayList) (pdfnumber)).add(0, ((Object) (Integer.valueOf(j1))));
	//   86  163:aload_3         
	//   87  164:iconst_0        
	//   88  165:iload           7
	//   89  167:invokestatic    #135 <Method Integer Integer.valueOf(int)>
	//   90  170:invokevirtual   #489 <Method void ArrayList.add(int, Object)>
		pdfarray.add(0, ((PdfObject) (pdfindirectreference)));
	//   91  173:aload_1         
	//   92  174:iconst_0        
	//   93  175:aload_2         
	//   94  176:invokevirtual   #492 <Method void PdfArray.add(int, PdfObject)>
		return;
	//   95  179:return          
		l--;
	//   96  180:iload           5
	//   97  182:iconst_1        
	//   98  183:isub            
	//   99  184:istore          5
		  goto _L5
	//* 100  186:goto            104
	}

	private PdfArray branchForm(HashMap hashmap, PdfIndirectReference pdfindirectreference, String s)
		throws IOException, BadPdfFormatException
	{
		PdfArray pdfarray;
		Iterator iterator;
		pdfarray = new PdfArray();
	//    0    0:new             #474 <Class PdfArray>
	//    1    3:dup             
	//    2    4:invokespecial   #497 <Method void PdfArray()>
	//    3    7:astore          7
		iterator = hashmap.entrySet().iterator();
	//    4    9:aload_1         
	//    5   10:invokevirtual   #501 <Method Set HashMap.entrySet()>
	//    6   13:invokeinterface #504 <Method Iterator Set.iterator()>
	//    7   18:astore          8
_L10:
		if(!iterator.hasNext()) goto _L2; else goto _L1
	//    8   20:aload           8
	//    9   22:invokeinterface #365 <Method boolean Iterator.hasNext()>
	//   10   27:ifeq            871
_L1:
		PdfIndirectReference pdfindirectreference1;
		PdfDictionary pdfdictionary;
		ArrayList arraylist;
		Object obj = ((Object) ((java.util.Map.Entry)iterator.next()));
	//   11   30:aload           8
	//   12   32:invokeinterface #369 <Method Object Iterator.next()>
	//   13   37:checkcast       #506 <Class java.util.Map$Entry>
	//   14   40:astore          6
		hashmap = ((HashMap) ((String)((java.util.Map.Entry) (obj)).getKey()));
	//   15   42:aload           6
	//   16   44:invokeinterface #509 <Method Object java.util.Map$Entry.getKey()>
	//   17   49:checkcast       #511 <Class String>
	//   18   52:astore_1        
		obj = ((java.util.Map.Entry) (obj)).getValue();
	//   19   53:aload           6
	//   20   55:invokeinterface #514 <Method Object java.util.Map$Entry.getValue()>
	//   21   60:astore          6
		pdfindirectreference1 = getPdfIndirectReference();
	//   22   62:aload_0         
	//   23   63:invokevirtual   #517 <Method PdfIndirectReference getPdfIndirectReference()>
	//   24   66:astore          9
		pdfdictionary = new PdfDictionary();
	//   25   68:new             #331 <Class PdfDictionary>
	//   26   71:dup             
	//   27   72:invokespecial   #332 <Method void PdfDictionary()>
	//   28   75:astore          10
		if(pdfindirectreference != null)
	//*  29   77:aload_2         
	//*  30   78:ifnull          90
			pdfdictionary.put(PdfName.PARENT, ((PdfObject) (pdfindirectreference)));
	//   31   81:aload           10
	//   32   83:getstatic       #520 <Field PdfName PdfName.PARENT>
	//   33   86:aload_2         
	//   34   87:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary.put(PdfName.T, ((PdfObject) (new PdfString(((String) (hashmap)), "UnicodeBig"))));
	//   35   90:aload           10
	//   36   92:getstatic       #523 <Field PdfName PdfName.T>
	//   37   95:new             #344 <Class PdfString>
	//   38   98:dup             
	//   39   99:aload_1         
	//   40  100:ldc2            #525 <String "UnicodeBig">
	//   41  103:invokespecial   #528 <Method void PdfString(String, String)>
	//   42  106:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
		hashmap = ((HashMap) ((new StringBuilder()).append(s).append(".").append(((String) (hashmap))).toString()));
	//   43  109:new             #530 <Class StringBuilder>
	//   44  112:dup             
	//   45  113:invokespecial   #531 <Method void StringBuilder()>
	//   46  116:aload_3         
	//   47  117:invokevirtual   #535 <Method StringBuilder StringBuilder.append(String)>
	//   48  120:ldc2            #537 <String ".">
	//   49  123:invokevirtual   #535 <Method StringBuilder StringBuilder.append(String)>
	//   50  126:aload_1         
	//   51  127:invokevirtual   #535 <Method StringBuilder StringBuilder.append(String)>
	//   52  130:invokevirtual   #541 <Method String StringBuilder.toString()>
	//   53  133:astore_1        
		int i = calculationOrder.indexOf(((Object) (hashmap)));
	//   54  134:aload_0         
	//   55  135:getfield        #543 <Field ArrayList calculationOrder>
	//   56  138:aload_1         
	//   57  139:invokevirtual   #547 <Method int ArrayList.indexOf(Object)>
	//   58  142:istore          4
		if(i >= 0)
	//*  59  144:iload           4
	//*  60  146:iflt            161
			calculationOrderRefs.set(i, ((Object) (pdfindirectreference1)));
	//   61  149:aload_0         
	//   62  150:getfield        #549 <Field ArrayList calculationOrderRefs>
	//   63  153:iload           4
	//   64  155:aload           9
	//   65  157:invokevirtual   #553 <Method Object ArrayList.set(int, Object)>
	//   66  160:pop             
		if(obj instanceof HashMap)
	//*  67  161:aload           6
	//*  68  163:instanceof      #283 <Class HashMap>
	//*  69  166:ifeq            210
		{
			pdfdictionary.put(PdfName.KIDS, ((PdfObject) (branchForm((HashMap)obj, pdfindirectreference1, ((String) (hashmap))))));
	//   70  169:aload           10
	//   71  171:getstatic       #556 <Field PdfName PdfName.KIDS>
	//   72  174:aload_0         
	//   73  175:aload           6
	//   74  177:checkcast       #283 <Class HashMap>
	//   75  180:aload           9
	//   76  182:aload_1         
	//   77  183:invokespecial   #558 <Method PdfArray branchForm(HashMap, PdfIndirectReference, String)>
	//   78  186:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfarray.add(((PdfObject) (pdfindirectreference1)));
	//   79  189:aload           7
	//   80  191:aload           9
	//   81  193:invokevirtual   #482 <Method boolean PdfArray.add(PdfObject)>
	//   82  196:pop             
			addToBody(((PdfObject) (pdfdictionary)), pdfindirectreference1, true);
	//   83  197:aload_0         
	//   84  198:aload           10
	//   85  200:aload           9
	//   86  202:iconst_1        
	//   87  203:invokevirtual   #561 <Method PdfIndirectObject addToBody(PdfObject, PdfIndirectReference, boolean)>
	//   88  206:pop             
			continue; /* Loop/switch isn't completed */
	//   89  207:goto            20
		}
		arraylist = (ArrayList)obj;
	//   90  210:aload           6
	//   91  212:checkcast       #315 <Class ArrayList>
	//   92  215:astore          11
		pdfdictionary.mergeDifferent((PdfDictionary)arraylist.get(0));
	//   93  217:aload           10
	//   94  219:aload           11
	//   95  221:iconst_0        
	//   96  222:invokevirtual   #486 <Method Object ArrayList.get(int)>
	//   97  225:checkcast       #331 <Class PdfDictionary>
	//   98  228:invokevirtual   #564 <Method void PdfDictionary.mergeDifferent(PdfDictionary)>
		if(arraylist.size() != 3) goto _L4; else goto _L3
	//   99  231:aload           11
	//  100  233:invokevirtual   #483 <Method int ArrayList.size()>
	//  101  236:iconst_3        
	//  102  237:icmpne          348
_L3:
		pdfdictionary.mergeDifferent((PdfDictionary)arraylist.get(2));
	//  103  240:aload           10
	//  104  242:aload           11
	//  105  244:iconst_2        
	//  106  245:invokevirtual   #486 <Method Object ArrayList.get(int)>
	//  107  248:checkcast       #331 <Class PdfDictionary>
	//  108  251:invokevirtual   #564 <Method void PdfDictionary.mergeDifferent(PdfDictionary)>
		int j = ((Integer)arraylist.get(1)).intValue();
	//  109  254:aload           11
	//  110  256:iconst_1        
	//  111  257:invokevirtual   #486 <Method Object ArrayList.get(int)>
	//  112  260:checkcast       #131 <Class Integer>
	//  113  263:invokevirtual   #455 <Method int Integer.intValue()>
	//  114  266:istore          4
		hashmap = ((HashMap) (((ImportedPage)importedPages.get(j - 1)).mergedFields));
	//  115  268:aload_0         
	//  116  269:getfield        #320 <Field ArrayList importedPages>
	//  117  272:iload           4
	//  118  274:iconst_1        
	//  119  275:isub            
	//  120  276:invokevirtual   #486 <Method Object ArrayList.get(int)>
	//  121  279:checkcast       #6   <Class PdfCopy$ImportedPage>
	//  122  282:getfield        #567 <Field PdfArray PdfCopy$ImportedPage.mergedFields>
	//  123  285:astore_1        
		PdfNumber pdfnumber = (PdfNumber)pdfdictionary.get(iTextTag);
	//  124  286:aload           10
	//  125  288:getstatic       #129 <Field PdfName iTextTag>
	//  126  291:invokevirtual   #570 <Method PdfObject PdfDictionary.get(PdfName)>
	//  127  294:checkcast       #465 <Class PdfNumber>
	//  128  297:astore          6
		pdfdictionary.remove(iTextTag);
	//  129  299:aload           10
	//  130  301:getstatic       #129 <Field PdfName iTextTag>
	//  131  304:invokevirtual   #573 <Method void PdfDictionary.remove(PdfName)>
		pdfdictionary.put(PdfName.TYPE, ((PdfObject) (PdfName.ANNOT)));
	//  132  307:aload           10
	//  133  309:getstatic       #209 <Field PdfName PdfName.TYPE>
	//  134  312:getstatic       #576 <Field PdfName PdfName.ANNOT>
	//  135  315:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
		adjustTabOrder(((PdfArray) (hashmap)), pdfindirectreference1, pdfnumber);
	//  136  318:aload_0         
	//  137  319:aload_1         
	//  138  320:aload           9
	//  139  322:aload           6
	//  140  324:invokespecial   #578 <Method void adjustTabOrder(PdfArray, PdfIndirectReference, PdfNumber)>
_L8:
		pdfarray.add(((PdfObject) (pdfindirectreference1)));
	//  141  327:aload           7
	//  142  329:aload           9
	//  143  331:invokevirtual   #482 <Method boolean PdfArray.add(PdfObject)>
	//  144  334:pop             
		addToBody(((PdfObject) (pdfdictionary)), pdfindirectreference1, true);
	//  145  335:aload_0         
	//  146  336:aload           10
	//  147  338:aload           9
	//  148  340:iconst_1        
	//  149  341:invokevirtual   #561 <Method PdfIndirectObject addToBody(PdfObject, PdfIndirectReference, boolean)>
	//  150  344:pop             
		continue; /* Loop/switch isn't completed */
	//  151  345:goto            20
_L4:
		int k;
		PdfDictionary pdfdictionary1;
		PdfArray pdfarray1;
		pdfdictionary1 = (PdfDictionary)arraylist.get(0);
	//  152  348:aload           11
	//  153  350:iconst_0        
	//  154  351:invokevirtual   #486 <Method Object ArrayList.get(int)>
	//  155  354:checkcast       #331 <Class PdfDictionary>
	//  156  357:astore          12
		pdfarray1 = new PdfArray();
	//  157  359:new             #474 <Class PdfArray>
	//  158  362:dup             
	//  159  363:invokespecial   #497 <Method void PdfArray()>
	//  160  366:astore          13
		k = 1;
	//  161  368:iconst_1        
	//  162  369:istore          4
_L6:
		PdfArray pdfarray2;
		PdfNumber pdfnumber1;
		PdfDictionary pdfdictionary2;
		PdfObject pdfobject;
		if(k >= arraylist.size())
			break MISSING_BLOCK_LABEL_858;
	//  163  371:iload           4
	//  164  373:aload           11
	//  165  375:invokevirtual   #483 <Method int ArrayList.size()>
	//  166  378:icmpge          858
		int l = ((Integer)arraylist.get(k)).intValue();
	//  167  381:aload           11
	//  168  383:iload           4
	//  169  385:invokevirtual   #486 <Method Object ArrayList.get(int)>
	//  170  388:checkcast       #131 <Class Integer>
	//  171  391:invokevirtual   #455 <Method int Integer.intValue()>
	//  172  394:istore          5
		pdfarray2 = ((ImportedPage)importedPages.get(l - 1)).mergedFields;
	//  173  396:aload_0         
	//  174  397:getfield        #320 <Field ArrayList importedPages>
	//  175  400:iload           5
	//  176  402:iconst_1        
	//  177  403:isub            
	//  178  404:invokevirtual   #486 <Method Object ArrayList.get(int)>
	//  179  407:checkcast       #6   <Class PdfCopy$ImportedPage>
	//  180  410:getfield        #567 <Field PdfArray PdfCopy$ImportedPage.mergedFields>
	//  181  413:astore          14
		pdfdictionary2 = new PdfDictionary();
	//  182  415:new             #331 <Class PdfDictionary>
	//  183  418:dup             
	//  184  419:invokespecial   #332 <Method void PdfDictionary()>
	//  185  422:astore          16
		pdfdictionary2.merge((PdfDictionary)arraylist.get(k + 1));
	//  186  424:aload           16
	//  187  426:aload           11
	//  188  428:iload           4
	//  189  430:iconst_1        
	//  190  431:iadd            
	//  191  432:invokevirtual   #486 <Method Object ArrayList.get(int)>
	//  192  435:checkcast       #331 <Class PdfDictionary>
	//  193  438:invokevirtual   #581 <Method void PdfDictionary.merge(PdfDictionary)>
		pdfdictionary2.put(PdfName.PARENT, ((PdfObject) (pdfindirectreference1)));
	//  194  441:aload           16
	//  195  443:getstatic       #520 <Field PdfName PdfName.PARENT>
	//  196  446:aload           9
	//  197  448:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfnumber1 = (PdfNumber)pdfdictionary2.get(iTextTag);
	//  198  451:aload           16
	//  199  453:getstatic       #129 <Field PdfName iTextTag>
	//  200  456:invokevirtual   #570 <Method PdfObject PdfDictionary.get(PdfName)>
	//  201  459:checkcast       #465 <Class PdfNumber>
	//  202  462:astore          15
		pdfdictionary2.remove(iTextTag);
	//  203  464:aload           16
	//  204  466:getstatic       #129 <Field PdfName iTextTag>
	//  205  469:invokevirtual   #573 <Method void PdfDictionary.remove(PdfName)>
		if(!isTextField(pdfdictionary1))
			break MISSING_BLOCK_LABEL_709;
	//  206  472:aload           12
	//  207  474:invokestatic    #585 <Method boolean isTextField(PdfDictionary)>
	//  208  477:ifeq            709
		hashmap = ((HashMap) (pdfdictionary1.getAsString(PdfName.V)));
	//  209  480:aload           12
	//  210  482:getstatic       #227 <Field PdfName PdfName.V>
	//  211  485:invokevirtual   #589 <Method PdfString PdfDictionary.getAsString(PdfName)>
	//  212  488:astore_1        
		pdfobject = pdfdictionary2.getDirectObject(PdfName.AP);
	//  213  489:aload           16
	//  214  491:getstatic       #176 <Field PdfName PdfName.AP>
	//  215  494:invokevirtual   #592 <Method PdfObject PdfDictionary.getDirectObject(PdfName)>
	//  216  497:astore          17
		if(hashmap != null && pdfobject != null)
	//* 217  499:aload_1         
	//* 218  500:ifnull          531
	//* 219  503:aload           17
	//* 220  505:ifnull          531
		{
			if(mergedTextFields.containsKey(((Object) (arraylist))))
				break; /* Loop/switch isn't completed */
	//  221  508:aload_0         
	//  222  509:getfield        #286 <Field HashMap mergedTextFields>
	//  223  512:aload           11
	//  224  514:invokevirtual   #595 <Method boolean HashMap.containsKey(Object)>
	//  225  517:ifne            582
			mergedTextFields.put(((Object) (arraylist)), ((Object) (hashmap)));
	//  226  520:aload_0         
	//  227  521:getfield        #286 <Field HashMap mergedTextFields>
	//  228  524:aload           11
	//  229  526:aload_1         
	//  230  527:invokevirtual   #479 <Method Object HashMap.put(Object, Object)>
	//  231  530:pop             
		}
_L7:
		pdfdictionary2.put(PdfName.TYPE, ((PdfObject) (PdfName.ANNOT)));
	//  232  531:aload           16
	//  233  533:getstatic       #209 <Field PdfName PdfName.TYPE>
	//  234  536:getstatic       #576 <Field PdfName PdfName.ANNOT>
	//  235  539:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
		hashmap = ((HashMap) (addToBody(((PdfObject) (pdfdictionary2)), getPdfIndirectReference(), true).getIndirectReference()));
	//  236  542:aload_0         
	//  237  543:aload           16
	//  238  545:aload_0         
	//  239  546:invokevirtual   #517 <Method PdfIndirectReference getPdfIndirectReference()>
	//  240  549:iconst_1        
	//  241  550:invokevirtual   #561 <Method PdfIndirectObject addToBody(PdfObject, PdfIndirectReference, boolean)>
	//  242  553:invokevirtual   #426 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  243  556:astore_1        
		adjustTabOrder(pdfarray2, ((PdfIndirectReference) (hashmap)), pdfnumber1);
	//  244  557:aload_0         
	//  245  558:aload           14
	//  246  560:aload_1         
	//  247  561:aload           15
	//  248  563:invokespecial   #578 <Method void adjustTabOrder(PdfArray, PdfIndirectReference, PdfNumber)>
		pdfarray1.add(((PdfObject) (hashmap)));
	//  249  566:aload           13
	//  250  568:aload_1         
	//  251  569:invokevirtual   #482 <Method boolean PdfArray.add(PdfObject)>
	//  252  572:pop             
		k += 2;
	//  253  573:iload           4
	//  254  575:iconst_2        
	//  255  576:iadd            
	//  256  577:istore          4
		if(true) goto _L6; else goto _L5
	//  257  579:goto            371
_L5:
		Rectangle rectangle;
		TextField textfield;
		textfield = new TextField(((PdfWriter) (this)), ((Rectangle) (null)), ((String) (null)));
	//  258  582:new             #597 <Class TextField>
	//  259  585:dup             
	//  260  586:aload_0         
	//  261  587:aconst_null     
	//  262  588:aconst_null     
	//  263  589:invokespecial   #600 <Method void TextField(PdfWriter, Rectangle, String)>
	//  264  592:astore          18
		((AcroFields)fields.get(0)).decodeGenericDictionary(pdfdictionary2, ((BaseField) (textfield)));
	//  265  594:aload_0         
	//  266  595:getfield        #602 <Field ArrayList fields>
	//  267  598:iconst_0        
	//  268  599:invokevirtual   #486 <Method Object ArrayList.get(int)>
	//  269  602:checkcast       #604 <Class AcroFields>
	//  270  605:aload           16
	//  271  607:aload           18
	//  272  609:invokevirtual   #608 <Method void AcroFields.decodeGenericDictionary(PdfDictionary, BaseField)>
		rectangle = PdfReader.getNormalizedRectangle(pdfdictionary2.getAsArray(PdfName.RECT));
	//  273  612:aload           16
	//  274  614:getstatic       #158 <Field PdfName PdfName.RECT>
	//  275  617:invokevirtual   #612 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//  276  620:invokestatic    #618 <Method Rectangle PdfReader.getNormalizedRectangle(PdfArray)>
	//  277  623:astore          6
		if(textfield.getRotation() == 90)
			break MISSING_BLOCK_LABEL_649;
	//  278  625:aload           18
	//  279  627:invokevirtual   #621 <Method int TextField.getRotation()>
	//  280  630:bipush          90
	//  281  632:icmpeq          649
		hashmap = ((HashMap) (rectangle));
	//  282  635:aload           6
	//  283  637:astore_1        
		if(textfield.getRotation() != 270)
			break MISSING_BLOCK_LABEL_655;
	//  284  638:aload           18
	//  285  640:invokevirtual   #621 <Method int TextField.getRotation()>
	//  286  643:sipush          270
	//  287  646:icmpne          655
		hashmap = ((HashMap) (rectangle.rotate()));
	//  288  649:aload           6
	//  289  651:invokevirtual   #627 <Method Rectangle Rectangle.rotate()>
	//  290  654:astore_1        
		textfield.setBox(((Rectangle) (hashmap)));
	//  291  655:aload           18
	//  292  657:aload_1         
	//  293  658:invokevirtual   #631 <Method void TextField.setBox(Rectangle)>
		textfield.setText(((PdfString)mergedTextFields.get(((Object) (arraylist)))).toUnicodeString());
	//  294  661:aload           18
	//  295  663:aload_0         
	//  296  664:getfield        #286 <Field HashMap mergedTextFields>
	//  297  667:aload           11
	//  298  669:invokevirtual   #472 <Method Object HashMap.get(Object)>
	//  299  672:checkcast       #344 <Class PdfString>
	//  300  675:invokevirtual   #634 <Method String PdfString.toUnicodeString()>
	//  301  678:invokevirtual   #637 <Method void TextField.setText(String)>
		hashmap = ((HashMap) (textfield.getAppearance()));
	//  302  681:aload           18
	//  303  683:invokevirtual   #641 <Method PdfAppearance TextField.getAppearance()>
	//  304  686:astore_1        
		((PdfDictionary)pdfobject).put(PdfName.N, ((PdfObject) (((PdfAppearance) (hashmap)).getIndirectReference())));
	//  305  687:aload           17
	//  306  689:checkcast       #331 <Class PdfDictionary>
	//  307  692:getstatic       #644 <Field PdfName PdfName.N>
	//  308  695:aload_1         
	//  309  696:invokevirtual   #647 <Method PdfIndirectReference PdfAppearance.getIndirectReference()>
	//  310  699:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
		  goto _L7
	//* 311  702:goto            531
		hashmap;
	//  312  705:astore_1        
		  goto _L7
	//* 313  706:goto            531
		if(isCheckButton(pdfdictionary1))
	//* 314  709:aload           12
	//* 315  711:invokestatic    #650 <Method boolean isCheckButton(PdfDictionary)>
	//* 316  714:ifeq            757
		{
			hashmap = ((HashMap) (pdfdictionary1.getAsName(PdfName.V)));
	//  317  717:aload           12
	//  318  719:getstatic       #227 <Field PdfName PdfName.V>
	//  319  722:invokevirtual   #654 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//  320  725:astore_1        
			PdfName pdfname = pdfdictionary2.getAsName(PdfName.AS);
	//  321  726:aload           16
	//  322  728:getstatic       #179 <Field PdfName PdfName.AS>
	//  323  731:invokevirtual   #654 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//  324  734:astore          6
			if(hashmap != null && pdfname != null)
	//* 325  736:aload_1         
	//* 326  737:ifnull          531
	//* 327  740:aload           6
	//* 328  742:ifnull          531
				pdfdictionary2.put(PdfName.AS, ((PdfObject) (hashmap)));
	//  329  745:aload           16
	//  330  747:getstatic       #179 <Field PdfName PdfName.AS>
	//  331  750:aload_1         
	//  332  751:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
		} else
	//* 333  754:goto            531
		if(isRadioButton(pdfdictionary1))
	//* 334  757:aload           12
	//* 335  759:invokestatic    #657 <Method boolean isRadioButton(PdfDictionary)>
	//* 336  762:ifeq            531
		{
			hashmap = ((HashMap) (pdfdictionary1.getAsName(PdfName.V)));
	//  337  765:aload           12
	//  338  767:getstatic       #227 <Field PdfName PdfName.V>
	//  339  770:invokevirtual   #654 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//  340  773:astore_1        
			PdfName pdfname1 = pdfdictionary2.getAsName(PdfName.AS);
	//  341  774:aload           16
	//  342  776:getstatic       #179 <Field PdfName PdfName.AS>
	//  343  779:invokevirtual   #654 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//  344  782:astore          6
			if(hashmap != null && pdfname1 != null && !pdfname1.equals(((Object) (getOffStateName(pdfdictionary2)))))
	//* 345  784:aload_1         
	//* 346  785:ifnull          531
	//* 347  788:aload           6
	//* 348  790:ifnull          531
	//* 349  793:aload           6
	//* 350  795:aload_0         
	//* 351  796:aload           16
	//* 352  798:invokevirtual   #661 <Method PdfName getOffStateName(PdfDictionary)>
	//* 353  801:invokevirtual   #664 <Method boolean PdfName.equals(Object)>
	//* 354  804:ifne            531
				if(!mergedRadioButtons.contains(((Object) (arraylist))))
	//* 355  807:aload_0         
	//* 356  808:getfield        #281 <Field HashSet mergedRadioButtons>
	//* 357  811:aload           11
	//* 358  813:invokevirtual   #666 <Method boolean HashSet.contains(Object)>
	//* 359  816:ifne            841
				{
					mergedRadioButtons.add(((Object) (arraylist)));
	//  360  819:aload_0         
	//  361  820:getfield        #281 <Field HashSet mergedRadioButtons>
	//  362  823:aload           11
	//  363  825:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//  364  828:pop             
					pdfdictionary2.put(PdfName.AS, ((PdfObject) (hashmap)));
	//  365  829:aload           16
	//  366  831:getstatic       #179 <Field PdfName PdfName.AS>
	//  367  834:aload_1         
	//  368  835:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
				} else
	//* 369  838:goto            531
				{
					pdfdictionary2.put(PdfName.AS, ((PdfObject) (getOffStateName(pdfdictionary2))));
	//  370  841:aload           16
	//  371  843:getstatic       #179 <Field PdfName PdfName.AS>
	//  372  846:aload_0         
	//  373  847:aload           16
	//  374  849:invokevirtual   #661 <Method PdfName getOffStateName(PdfDictionary)>
	//  375  852:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
				}
		}
		  goto _L7
	//* 376  855:goto            531
		pdfdictionary.put(PdfName.KIDS, ((PdfObject) (pdfarray1)));
	//  377  858:aload           10
	//  378  860:getstatic       #556 <Field PdfName PdfName.KIDS>
	//  379  863:aload           13
	//  380  865:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(true) goto _L8; else goto _L2
	//  381  868:goto            327
_L2:
		return pdfarray;
	//  382  871:aload           7
	//  383  873:areturn         
		if(true) goto _L10; else goto _L9
_L9:
	}

	private int checkStructureTreeRootKids(ImportedPage importedpage)
	{
		if(importedPages.size() != 0) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #320 <Field ArrayList importedPages>
	//    2    4:invokevirtual   #483 <Method int ArrayList.size()>
	//    3    7:ifne            12
_L1:
		return 1;
	//    4   10:iconst_1        
	//    5   11:ireturn         
_L2:
		boolean flag;
		boolean flag1 = false;
	//    6   12:iconst_0        
	//    7   13:istore_3        
		Iterator iterator = importedPages.iterator();
	//    8   14:aload_0         
	//    9   15:getfield        #320 <Field ArrayList importedPages>
	//   10   18:invokevirtual   #670 <Method Iterator ArrayList.iterator()>
	//   11   21:astore          4
		do
		{
			flag = flag1;
	//   12   23:iload_3         
	//   13   24:istore_2        
			if(!iterator.hasNext())
				continue; /* Loop/switch isn't completed */
	//   14   25:aload           4
	//   15   27:invokeinterface #365 <Method boolean Iterator.hasNext()>
	//   16   32:ifeq            60
		} while(!((Object) (((ImportedPage)iterator.next()).reader)).equals(((Object) (importedpage.reader))));
	//   17   35:aload           4
	//   18   37:invokeinterface #369 <Method Object Iterator.next()>
	//   19   42:checkcast       #6   <Class PdfCopy$ImportedPage>
	//   20   45:getfield        #672 <Field PdfReader PdfCopy$ImportedPage.reader>
	//   21   48:aload_1         
	//   22   49:getfield        #672 <Field PdfReader PdfCopy$ImportedPage.reader>
	//   23   52:invokevirtual   #675 <Method boolean Object.equals(Object)>
	//   24   55:ifeq            23
		flag = true;
	//   25   58:iconst_1        
	//   26   59:istore_2        
		if(!flag) goto _L1; else goto _L3
	//   27   60:iload_2         
	//   28   61:ifeq            10
_L3:
		ImportedPage importedpage1 = (ImportedPage)importedPages.get(importedPages.size() - 1);
	//   29   64:aload_0         
	//   30   65:getfield        #320 <Field ArrayList importedPages>
	//   31   68:aload_0         
	//   32   69:getfield        #320 <Field ArrayList importedPages>
	//   33   72:invokevirtual   #483 <Method int ArrayList.size()>
	//   34   75:iconst_1        
	//   35   76:isub            
	//   36   77:invokevirtual   #486 <Method Object ArrayList.get(int)>
	//   37   80:checkcast       #6   <Class PdfCopy$ImportedPage>
	//   38   83:astore          4
		if(((Object) (importedpage1.reader)).equals(((Object) (importedpage.reader))) && importedpage.pageNumber > importedpage1.pageNumber)
	//*  39   85:aload           4
	//*  40   87:getfield        #672 <Field PdfReader PdfCopy$ImportedPage.reader>
	//*  41   90:aload_1         
	//*  42   91:getfield        #672 <Field PdfReader PdfCopy$ImportedPage.reader>
	//*  43   94:invokevirtual   #675 <Method boolean Object.equals(Object)>
	//*  44   97:ifeq            128
	//*  45  100:aload_1         
	//*  46  101:getfield        #678 <Field int PdfCopy$ImportedPage.pageNumber>
	//*  47  104:aload           4
	//*  48  106:getfield        #678 <Field int PdfCopy$ImportedPage.pageNumber>
	//*  49  109:icmple          128
		{
			if(readersWithImportedStructureTreeRootKids.contains(((Object) (importedpage.reader))))
	//*  50  112:aload_0         
	//*  51  113:getfield        #288 <Field HashSet readersWithImportedStructureTreeRootKids>
	//*  52  116:aload_1         
	//*  53  117:getfield        #672 <Field PdfReader PdfCopy$ImportedPage.reader>
	//*  54  120:invokevirtual   #666 <Method boolean HashSet.contains(Object)>
	//*  55  123:ifeq            10
				return 0;
	//   56  126:iconst_0        
	//   57  127:ireturn         
		} else
		{
			return -1;
	//   58  128:iconst_m1       
	//   59  129:ireturn         
		}
		if(true) goto _L1; else goto _L4
_L4:
	}

	private void clearIndirects(PdfReader pdfreader)
	{
		pdfreader = ((PdfReader) ((HashMap)indirectMap.get(((Object) (pdfreader)))));
	//    0    0:aload_0         
	//    1    1:getfield        #304 <Field HashMap indirectMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #472 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #283 <Class HashMap>
	//    5   11:astore_1        
		Object obj = ((Object) (new ArrayList()));
	//    6   12:new             #315 <Class ArrayList>
	//    7   15:dup             
	//    8   16:invokespecial   #316 <Method void ArrayList()>
	//    9   19:astore_2        
		Iterator iterator = ((HashMap) (pdfreader)).entrySet().iterator();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #501 <Method Set HashMap.entrySet()>
	//   12   24:invokeinterface #504 <Method Iterator Set.iterator()>
	//   13   29:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   14   30:aload_3         
	//   15   31:invokeinterface #365 <Method boolean Iterator.hasNext()>
	//   16   36:ifeq            154
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   17   39:aload_3         
	//   18   40:invokeinterface #369 <Method Object Iterator.next()>
	//   19   45:checkcast       #506 <Class java.util.Map$Entry>
	//   20   48:astore          4
			Object obj1 = ((Object) (new RefKey(((IndirectReferences)entry.getValue()).theRef)));
	//   21   50:new             #682 <Class RefKey>
	//   22   53:dup             
	//   23   54:aload           4
	//   24   56:invokeinterface #514 <Method Object java.util.Map$Entry.getValue()>
	//   25   61:checkcast       #9   <Class PdfCopy$IndirectReferences>
	//   26   64:getfield        #685 <Field PdfIndirectReference PdfCopy$IndirectReferences.theRef>
	//   27   67:invokespecial   #688 <Method void RefKey(PdfIndirectReference)>
	//   28   70:astore          5
			obj1 = ((Object) ((PdfIndirectObject)indirectObjects.get(obj1)));
	//   29   72:aload_0         
	//   30   73:getfield        #313 <Field LinkedHashMap indirectObjects>
	//   31   76:aload           5
	//   32   78:invokevirtual   #689 <Method Object LinkedHashMap.get(Object)>
	//   33   81:checkcast       #422 <Class PdfIndirectObject>
	//   34   84:astore          5
			if(obj1 == null)
	//*  35   86:aload           5
	//*  36   88:ifnonnull       106
				((ArrayList) (obj)).add(entry.getKey());
	//   37   91:aload_2         
	//   38   92:aload           4
	//   39   94:invokeinterface #509 <Method Object java.util.Map$Entry.getKey()>
	//   40   99:invokevirtual   #476 <Method boolean ArrayList.add(Object)>
	//   41  102:pop             
			else
	//*  42  103:goto            30
			if(((PdfIndirectObject) (obj1)).object.isArray() || ((PdfIndirectObject) (obj1)).object.isDictionary() || ((PdfIndirectObject) (obj1)).object.isStream())
	//*  43  106:aload           5
	//*  44  108:getfield        #693 <Field PdfObject PdfIndirectObject.object>
	//*  45  111:invokevirtual   #698 <Method boolean PdfObject.isArray()>
	//*  46  114:ifne            139
	//*  47  117:aload           5
	//*  48  119:getfield        #693 <Field PdfObject PdfIndirectObject.object>
	//*  49  122:invokevirtual   #701 <Method boolean PdfObject.isDictionary()>
	//*  50  125:ifne            139
	//*  51  128:aload           5
	//*  52  130:getfield        #693 <Field PdfObject PdfIndirectObject.object>
	//*  53  133:invokevirtual   #704 <Method boolean PdfObject.isStream()>
	//*  54  136:ifeq            30
				((ArrayList) (obj)).add(entry.getKey());
	//   55  139:aload_2         
	//   56  140:aload           4
	//   57  142:invokeinterface #509 <Method Object java.util.Map$Entry.getKey()>
	//   58  147:invokevirtual   #476 <Method boolean ArrayList.add(Object)>
	//   59  150:pop             
		} while(true);
	//   60  151:goto            30
		for(obj = ((Object) (((ArrayList) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((HashMap) (pdfreader)).remove(((Object) ((RefKey)((Iterator) (obj)).next()))));
	//   61  154:aload_2         
	//   62  155:invokevirtual   #670 <Method Iterator ArrayList.iterator()>
	//   63  158:astore_2        
	//   64  159:aload_2         
	//   65  160:invokeinterface #365 <Method boolean Iterator.hasNext()>
	//   66  165:ifeq            185
	//   67  168:aload_1         
	//   68  169:aload_2         
	//   69  170:invokeinterface #369 <Method Object Iterator.next()>
	//   70  175:checkcast       #682 <Class RefKey>
	//   71  178:invokevirtual   #706 <Method Object HashMap.remove(Object)>
	//   72  181:pop             
	//*  73  182:goto            159
	//   74  185:return          
	}

	private boolean containsInactivePg(PdfDictionary pdfdictionary, HashSet hashset)
	{
		pdfdictionary = ((PdfDictionary) (pdfdictionary.get(PdfName.PG)));
	//    0    0:aload_1         
	//    1    1:getstatic       #711 <Field PdfName PdfName.PG>
	//    2    4:invokevirtual   #570 <Method PdfObject PdfDictionary.get(PdfName)>
	//    3    7:astore_1        
		return pdfdictionary != null && !hashset.contains(((Object) (new RefKey((PdfIndirectReference)pdfdictionary))));
	//    4    8:aload_1         
	//    5    9:ifnull          32
	//    6   12:aload_2         
	//    7   13:new             #682 <Class RefKey>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:checkcast       #713 <Class PdfIndirectReference>
	//   11   21:invokespecial   #688 <Method void RefKey(PdfIndirectReference)>
	//   12   24:invokevirtual   #666 <Method boolean HashSet.contains(Object)>
	//   13   27:ifne            32
	//   14   30:iconst_1        
	//   15   31:ireturn         
	//   16   32:iconst_0        
	//   17   33:ireturn         
	}

	private void createAcroForms()
		throws IOException, BadPdfFormatException
	{
		if(fieldTree.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #717 <Field HashMap fieldTree>
	//*   2    4:invokevirtual   #718 <Method boolean HashMap.isEmpty()>
	//*   3    7:ifeq            63
		{
			Iterator iterator = importedPages.iterator();
	//    4   10:aload_0         
	//    5   11:getfield        #320 <Field ArrayList importedPages>
	//    6   14:invokevirtual   #670 <Method Iterator ArrayList.iterator()>
	//    7   17:astore_2        
			do
			{
				if(!iterator.hasNext())
					break;
	//    8   18:aload_2         
	//    9   19:invokeinterface #365 <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            313
				ImportedPage importedpage = (ImportedPage)iterator.next();
	//   11   27:aload_2         
	//   12   28:invokeinterface #369 <Method Object Iterator.next()>
	//   13   33:checkcast       #6   <Class PdfCopy$ImportedPage>
	//   14   36:astore_3        
				if(importedpage.mergedFields.size() > 0)
	//*  15   37:aload_3         
	//*  16   38:getfield        #567 <Field PdfArray PdfCopy$ImportedPage.mergedFields>
	//*  17   41:invokevirtual   #475 <Method int PdfArray.size()>
	//*  18   44:ifle            18
					addToBody(((PdfObject) (importedpage.mergedFields)), importedpage.annotsIndirectReference);
	//   19   47:aload_0         
	//   20   48:aload_3         
	//   21   49:getfield        #567 <Field PdfArray PdfCopy$ImportedPage.mergedFields>
	//   22   52:aload_3         
	//   23   53:getfield        #721 <Field PdfIndirectReference PdfCopy$ImportedPage.annotsIndirectReference>
	//   24   56:invokevirtual   #724 <Method PdfIndirectObject addToBody(PdfObject, PdfIndirectReference)>
	//   25   59:pop             
			} while(true);
	//   26   60:goto            18
		} else
		{
			PdfDictionary pdfdictionary = new PdfDictionary();
	//   27   63:new             #331 <Class PdfDictionary>
	//   28   66:dup             
	//   29   67:invokespecial   #332 <Method void PdfDictionary()>
	//   30   70:astore_2        
			pdfdictionary.put(PdfName.DR, propagate(((PdfObject) (resources))));
	//   31   71:aload_2         
	//   32   72:getstatic       #356 <Field PdfName PdfName.DR>
	//   33   75:aload_0         
	//   34   76:aload_0         
	//   35   77:getfield        #726 <Field PdfDictionary resources>
	//   36   80:invokespecial   #730 <Method PdfObject propagate(PdfObject)>
	//   37   83:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
			if(needAppearances)
	//*  38   86:aload_0         
	//*  39   87:getfield        #277 <Field boolean needAppearances>
	//*  40   90:ifeq            103
				pdfdictionary.put(PdfName.NEEDAPPEARANCES, ((PdfObject) (PdfBoolean.PDFTRUE)));
	//   41   93:aload_2         
	//   42   94:getstatic       #733 <Field PdfName PdfName.NEEDAPPEARANCES>
	//   43   97:getstatic       #739 <Field PdfBoolean PdfBoolean.PDFTRUE>
	//   44  100:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.DA, ((PdfObject) (new PdfString("/Helv 0 Tf 0 g "))));
	//   45  103:aload_2         
	//   46  104:getstatic       #200 <Field PdfName PdfName.DA>
	//   47  107:new             #344 <Class PdfString>
	//   48  110:dup             
	//   49  111:ldc2            #346 <String "/Helv 0 Tf 0 g ">
	//   50  114:invokespecial   #347 <Method void PdfString(String)>
	//   51  117:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
			tabOrder = new HashMap();
	//   52  120:aload_0         
	//   53  121:new             #283 <Class HashMap>
	//   54  124:dup             
	//   55  125:invokespecial   #284 <Method void HashMap()>
	//   56  128:putfield        #468 <Field HashMap tabOrder>
			calculationOrderRefs = new ArrayList(((Collection) (calculationOrder)));
	//   57  131:aload_0         
	//   58  132:new             #315 <Class ArrayList>
	//   59  135:dup             
	//   60  136:aload_0         
	//   61  137:getfield        #543 <Field ArrayList calculationOrder>
	//   62  140:invokespecial   #742 <Method void ArrayList(Collection)>
	//   63  143:putfield        #549 <Field ArrayList calculationOrderRefs>
			pdfdictionary.put(PdfName.FIELDS, ((PdfObject) (branchForm(fieldTree, ((PdfIndirectReference) (null)), ""))));
	//   64  146:aload_2         
	//   65  147:getstatic       #342 <Field PdfName PdfName.FIELDS>
	//   66  150:aload_0         
	//   67  151:aload_0         
	//   68  152:getfield        #717 <Field HashMap fieldTree>
	//   69  155:aconst_null     
	//   70  156:ldc2            #744 <String "">
	//   71  159:invokespecial   #558 <Method PdfArray branchForm(HashMap, PdfIndirectReference, String)>
	//   72  162:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
			if(hasSignature)
	//*  73  165:aload_0         
	//*  74  166:getfield        #746 <Field boolean hasSignature>
	//*  75  169:ifeq            187
				pdfdictionary.put(PdfName.SIGFLAGS, ((PdfObject) (new PdfNumber(3))));
	//   76  172:aload_2         
	//   77  173:getstatic       #749 <Field PdfName PdfName.SIGFLAGS>
	//   78  176:new             #465 <Class PdfNumber>
	//   79  179:dup             
	//   80  180:iconst_3        
	//   81  181:invokespecial   #752 <Method void PdfNumber(int)>
	//   82  184:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
			PdfArray pdfarray = new PdfArray();
	//   83  187:new             #474 <Class PdfArray>
	//   84  190:dup             
	//   85  191:invokespecial   #497 <Method void PdfArray()>
	//   86  194:astore_3        
			for(int i = 0; i < calculationOrderRefs.size(); i++)
	//*  87  195:iconst_0        
	//*  88  196:istore_1        
	//*  89  197:iload_1         
	//*  90  198:aload_0         
	//*  91  199:getfield        #549 <Field ArrayList calculationOrderRefs>
	//*  92  202:invokevirtual   #483 <Method int ArrayList.size()>
	//*  93  205:icmpge          243
			{
				Object obj = calculationOrderRefs.get(i);
	//   94  208:aload_0         
	//   95  209:getfield        #549 <Field ArrayList calculationOrderRefs>
	//   96  212:iload_1         
	//   97  213:invokevirtual   #486 <Method Object ArrayList.get(int)>
	//   98  216:astore          4
				if(obj instanceof PdfIndirectReference)
	//*  99  218:aload           4
	//* 100  220:instanceof      #713 <Class PdfIndirectReference>
	//* 101  223:ifeq            236
					pdfarray.add(((PdfObject) ((PdfIndirectReference)obj)));
	//  102  226:aload_3         
	//  103  227:aload           4
	//  104  229:checkcast       #713 <Class PdfIndirectReference>
	//  105  232:invokevirtual   #482 <Method boolean PdfArray.add(PdfObject)>
	//  106  235:pop             
			}

	//  107  236:iload_1         
	//  108  237:iconst_1        
	//  109  238:iadd            
	//  110  239:istore_1        
	//* 111  240:goto            197
			if(pdfarray.size() > 0)
	//* 112  243:aload_3         
	//* 113  244:invokevirtual   #475 <Method int PdfArray.size()>
	//* 114  247:ifle            258
				pdfdictionary.put(PdfName.CO, ((PdfObject) (pdfarray)));
	//  115  250:aload_2         
	//  116  251:getstatic       #755 <Field PdfName PdfName.CO>
	//  117  254:aload_3         
	//  118  255:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
			acroForm = addToBody(((PdfObject) (pdfdictionary))).getIndirectReference();
	//  119  258:aload_0         
	//  120  259:aload_0         
	//  121  260:aload_2         
	//  122  261:invokevirtual   #420 <Method PdfIndirectObject addToBody(PdfObject)>
	//  123  264:invokevirtual   #426 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  124  267:putfield        #757 <Field PdfIndirectReference acroForm>
			ImportedPage importedpage1;
			for(Iterator iterator1 = importedPages.iterator(); iterator1.hasNext(); addToBody(((PdfObject) (importedpage1.mergedFields)), importedpage1.annotsIndirectReference))
	//* 125  270:aload_0         
	//* 126  271:getfield        #320 <Field ArrayList importedPages>
	//* 127  274:invokevirtual   #670 <Method Iterator ArrayList.iterator()>
	//* 128  277:astore_2        
	//* 129  278:aload_2         
	//* 130  279:invokeinterface #365 <Method boolean Iterator.hasNext()>
	//* 131  284:ifeq            313
				importedpage1 = (ImportedPage)iterator1.next();
	//  132  287:aload_2         
	//  133  288:invokeinterface #369 <Method Object Iterator.next()>
	//  134  293:checkcast       #6   <Class PdfCopy$ImportedPage>
	//  135  296:astore_3        

	//  136  297:aload_0         
	//  137  298:aload_3         
	//  138  299:getfield        #567 <Field PdfArray PdfCopy$ImportedPage.mergedFields>
	//  139  302:aload_3         
	//  140  303:getfield        #721 <Field PdfIndirectReference PdfCopy$ImportedPage.annotsIndirectReference>
	//  141  306:invokevirtual   #724 <Method PdfIndirectObject addToBody(PdfObject, PdfIndirectReference)>
	//  142  309:pop             
		}
	//* 143  310:goto            278
	//  144  313:return          
	}

	private void createWidgets(ArrayList arraylist, AcroFields.Item item)
	{
		for(int i = 0; i < item.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_2         
	//*   4    4:invokevirtual   #449 <Method int AcroFields$Item.size()>
	//*   5    7:icmpge          167
		{
			arraylist.add(((Object) (item.getPage(i))));
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:iload_3         
	//    9   13:invokevirtual   #452 <Method Integer AcroFields$Item.getPage(int)>
	//   10   16:invokevirtual   #476 <Method boolean ArrayList.add(Object)>
	//   11   19:pop             
			PdfDictionary pdfdictionary = item.getMerged(i);
	//   12   20:aload_2         
	//   13   21:iload_3         
	//   14   22:invokevirtual   #763 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//   15   25:astore          4
			Object obj = ((Object) (pdfdictionary.get(PdfName.DR)));
	//   16   27:aload           4
	//   17   29:getstatic       #356 <Field PdfName PdfName.DR>
	//   18   32:invokevirtual   #570 <Method PdfObject PdfDictionary.get(PdfName)>
	//   19   35:astore          5
			if(obj != null)
	//*  20   37:aload           5
	//*  21   39:ifnull          57
				PdfFormField.mergeResources(resources, (PdfDictionary)PdfReader.getPdfObject(((PdfObject) (obj))));
	//   22   42:aload_0         
	//   23   43:getfield        #726 <Field PdfDictionary resources>
	//   24   46:aload           5
	//   25   48:invokestatic    #766 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//   26   51:checkcast       #331 <Class PdfDictionary>
	//   27   54:invokestatic    #381 <Method void PdfFormField.mergeResources(PdfDictionary, PdfDictionary)>
			obj = ((Object) (new PdfDictionary()));
	//   28   57:new             #331 <Class PdfDictionary>
	//   29   60:dup             
	//   30   61:invokespecial   #332 <Method void PdfDictionary()>
	//   31   64:astore          5
			Iterator iterator = pdfdictionary.getKeys().iterator();
	//   32   66:aload           4
	//   33   68:invokevirtual   #769 <Method Set PdfDictionary.getKeys()>
	//   34   71:invokeinterface #504 <Method Iterator Set.iterator()>
	//   35   76:astore          6
			do
			{
				if(!iterator.hasNext())
					break;
	//   36   78:aload           6
	//   37   80:invokeinterface #365 <Method boolean Iterator.hasNext()>
	//   38   85:ifeq            128
				PdfName pdfname = (PdfName)iterator.next();
	//   39   88:aload           6
	//   40   90:invokeinterface #369 <Method Object Iterator.next()>
	//   41   95:checkcast       #115 <Class PdfName>
	//   42   98:astore          7
				if(widgetKeys.contains(((Object) (pdfname))))
	//*  43  100:getstatic       #143 <Field HashSet widgetKeys>
	//*  44  103:aload           7
	//*  45  105:invokevirtual   #666 <Method boolean HashSet.contains(Object)>
	//*  46  108:ifeq            78
					((PdfDictionary) (obj)).put(pdfname, pdfdictionary.get(pdfname));
	//   47  111:aload           5
	//   48  113:aload           7
	//   49  115:aload           4
	//   50  117:aload           7
	//   51  119:invokevirtual   #570 <Method PdfObject PdfDictionary.get(PdfName)>
	//   52  122:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
			} while(true);
	//   53  125:goto            78
			((PdfDictionary) (obj)).put(iTextTag, ((PdfObject) (new PdfNumber(item.getTabOrder(i).intValue() + 1))));
	//   54  128:aload           5
	//   55  130:getstatic       #129 <Field PdfName iTextTag>
	//   56  133:new             #465 <Class PdfNumber>
	//   57  136:dup             
	//   58  137:aload_2         
	//   59  138:iload_3         
	//   60  139:invokevirtual   #772 <Method Integer AcroFields$Item.getTabOrder(int)>
	//   61  142:invokevirtual   #455 <Method int Integer.intValue()>
	//   62  145:iconst_1        
	//   63  146:iadd            
	//   64  147:invokespecial   #752 <Method void PdfNumber(int)>
	//   65  150:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
			arraylist.add(obj);
	//   66  153:aload_1         
	//   67  154:aload           5
	//   68  156:invokevirtual   #476 <Method boolean ArrayList.add(Object)>
	//   69  159:pop             
		}

	//   70  160:iload_3         
	//   71  161:iconst_1        
	//   72  162:iadd            
	//   73  163:istore_3        
	//*  74  164:goto            2
	//   75  167:return          
	}

	private ArrayList findActiveParents(HashSet hashset)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #315 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #316 <Method void ArrayList()>
	//    3    7:astore_3        
		ArrayList arraylist1 = new ArrayList(((Collection) (hashset)));
	//    4    8:new             #315 <Class ArrayList>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokespecial   #742 <Method void ArrayList(Collection)>
	//    8   16:astore          4
		int i = 0;
	//    9   18:iconst_0        
	//   10   19:istore_2        
		while(i < arraylist1.size()) 
	//*  11   20:iload_2         
	//*  12   21:aload           4
	//*  13   23:invokevirtual   #483 <Method int ArrayList.size()>
	//*  14   26:icmpge          150
		{
			Object obj = ((Object) ((PdfIndirectObject)indirectObjects.get(arraylist1.get(i))));
	//   15   29:aload_0         
	//   16   30:getfield        #313 <Field LinkedHashMap indirectObjects>
	//   17   33:aload           4
	//   18   35:iload_2         
	//   19   36:invokevirtual   #486 <Method Object ArrayList.get(int)>
	//   20   39:invokevirtual   #689 <Method Object LinkedHashMap.get(Object)>
	//   21   42:checkcast       #422 <Class PdfIndirectObject>
	//   22   45:astore          5
			if(obj != null && ((PdfIndirectObject) (obj)).object.isDictionary())
	//*  23   47:aload           5
	//*  24   49:ifnull          63
	//*  25   52:aload           5
	//*  26   54:getfield        #693 <Field PdfObject PdfIndirectObject.object>
	//*  27   57:invokevirtual   #701 <Method boolean PdfObject.isDictionary()>
	//*  28   60:ifne            70
	//*  29   63:iload_2         
	//*  30   64:iconst_1        
	//*  31   65:iadd            
	//*  32   66:istore_2        
	//*  33   67:goto            20
			{
				obj = ((Object) (((PdfDictionary)((PdfIndirectObject) (obj)).object).get(PdfName.P)));
	//   34   70:aload           5
	//   35   72:getfield        #693 <Field PdfObject PdfIndirectObject.object>
	//   36   75:checkcast       #331 <Class PdfDictionary>
	//   37   78:getstatic       #206 <Field PdfName PdfName.P>
	//   38   81:invokevirtual   #570 <Method PdfObject PdfDictionary.get(PdfName)>
	//   39   84:astore          5
				if(obj != null && ((PdfObject) (obj)).type() == 0)
	//*  40   86:aload           5
	//*  41   88:ifnull          63
	//*  42   91:aload           5
	//*  43   93:invokevirtual   #778 <Method int PdfObject.type()>
	//*  44   96:ifne            63
				{
					RefKey refkey = new RefKey((PdfIndirectReference)obj);
	//   45   99:new             #682 <Class RefKey>
	//   46  102:dup             
	//   47  103:aload           5
	//   48  105:checkcast       #713 <Class PdfIndirectReference>
	//   49  108:invokespecial   #688 <Method void RefKey(PdfIndirectReference)>
	//   50  111:astore          6
					if(!hashset.contains(((Object) (refkey))))
	//*  51  113:aload_1         
	//*  52  114:aload           6
	//*  53  116:invokevirtual   #666 <Method boolean HashSet.contains(Object)>
	//*  54  119:ifne            63
					{
						hashset.add(((Object) (refkey)));
	//   55  122:aload_1         
	//   56  123:aload           6
	//   57  125:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//   58  128:pop             
						arraylist1.add(((Object) (refkey)));
	//   59  129:aload           4
	//   60  131:aload           6
	//   61  133:invokevirtual   #476 <Method boolean ArrayList.add(Object)>
	//   62  136:pop             
						arraylist.add(((Object) ((PdfIndirectReference)obj)));
	//   63  137:aload_3         
	//   64  138:aload           5
	//   65  140:checkcast       #713 <Class PdfIndirectReference>
	//   66  143:invokevirtual   #476 <Method boolean ArrayList.add(Object)>
	//   67  146:pop             
					}
				}
			}
			i++;
		}
	//*  68  147:goto            63
		return arraylist;
	//   69  150:aload_3         
	//   70  151:areturn         
	}

	private void findActives(ArrayList arraylist, HashSet hashset, HashSet hashset1)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
_L5:
		if(i >= arraylist.size()) goto _L2; else goto _L1
	//    2    3:iload           4
	//    3    5:aload_1         
	//    4    6:invokevirtual   #483 <Method int ArrayList.size()>
	//    5    9:icmpge          176
_L1:
		Object obj;
		obj = ((Object) (new RefKey((PdfIndirectReference)arraylist.get(i))));
	//    6   12:new             #682 <Class RefKey>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:iload           4
	//   10   19:invokevirtual   #486 <Method Object ArrayList.get(int)>
	//   11   22:checkcast       #713 <Class PdfIndirectReference>
	//   12   25:invokespecial   #688 <Method void RefKey(PdfIndirectReference)>
	//   13   28:astore          5
		obj = ((Object) ((PdfIndirectObject)indirectObjects.get(obj)));
	//   14   30:aload_0         
	//   15   31:getfield        #313 <Field LinkedHashMap indirectObjects>
	//   16   34:aload           5
	//   17   36:invokevirtual   #689 <Method Object LinkedHashMap.get(Object)>
	//   18   39:checkcast       #422 <Class PdfIndirectObject>
	//   19   42:astore          5
		if(obj != null && ((PdfIndirectObject) (obj)).object != null) goto _L4; else goto _L3
	//   20   44:aload           5
	//   21   46:ifnull          57
	//   22   49:aload           5
	//   23   51:getfield        #693 <Field PdfObject PdfIndirectObject.object>
	//   24   54:ifnonnull       66
_L3:
		i++;
	//   25   57:iload           4
	//   26   59:iconst_1        
	//   27   60:iadd            
	//   28   61:istore          4
		  goto _L5
	//*  29   63:goto            3
_L4:
		switch(((PdfIndirectObject) (obj)).object.type())
	//*  30   66:aload           5
	//*  31   68:getfield        #693 <Field PdfObject PdfIndirectObject.object>
	//*  32   71:invokevirtual   #778 <Method int PdfObject.type()>
		{
	//*  33   74:tableswitch     0 7: default 120
	//	               0 123
	//	               1 120
	//	               2 120
	//	               3 120
	//	               4 120
	//	               5 140
	//	               6 158
	//	               7 158
	//*  34  120:goto            57
		case 0: // '\0'
			findActivesFromReference((PdfIndirectReference)((PdfIndirectObject) (obj)).object, arraylist, hashset);
	//   35  123:aload_0         
	//   36  124:aload           5
	//   37  126:getfield        #693 <Field PdfObject PdfIndirectObject.object>
	//   38  129:checkcast       #713 <Class PdfIndirectReference>
	//   39  132:aload_1         
	//   40  133:aload_2         
	//   41  134:invokespecial   #785 <Method void findActivesFromReference(PdfIndirectReference, ArrayList, HashSet)>
			break;

	//*  42  137:goto            57
		case 5: // '\005'
			findActivesFromArray((PdfArray)((PdfIndirectObject) (obj)).object, arraylist, hashset, hashset1);
	//   43  140:aload_0         
	//   44  141:aload           5
	//   45  143:getfield        #693 <Field PdfObject PdfIndirectObject.object>
	//   46  146:checkcast       #474 <Class PdfArray>
	//   47  149:aload_1         
	//   48  150:aload_2         
	//   49  151:aload_3         
	//   50  152:invokespecial   #789 <Method void findActivesFromArray(PdfArray, ArrayList, HashSet, HashSet)>
			break;

	//*  51  155:goto            57
		case 6: // '\006'
		case 7: // '\007'
			findActivesFromDict((PdfDictionary)((PdfIndirectObject) (obj)).object, arraylist, hashset, hashset1);
	//   52  158:aload_0         
	//   53  159:aload           5
	//   54  161:getfield        #693 <Field PdfObject PdfIndirectObject.object>
	//   55  164:checkcast       #331 <Class PdfDictionary>
	//   56  167:aload_1         
	//   57  168:aload_2         
	//   58  169:aload_3         
	//   59  170:invokespecial   #793 <Method void findActivesFromDict(PdfDictionary, ArrayList, HashSet, HashSet)>
			break;
		}
		if(true) goto _L3; else goto _L2
	//*  60  173:goto            57
_L2:
	//   61  176:return          
	}

	private void findActivesFromArray(PdfArray pdfarray, ArrayList arraylist, HashSet hashset, HashSet hashset1)
	{
		pdfarray = ((PdfArray) (pdfarray.iterator()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #795 <Method Iterator PdfArray.iterator()>
	//    2    4:astore_1        
		do
		{
			if(!((Iterator) (pdfarray)).hasNext())
				break;
	//    3    5:aload_1         
	//    4    6:invokeinterface #365 <Method boolean Iterator.hasNext()>
	//    5   11:ifeq            125
			PdfObject pdfobject = (PdfObject)((Iterator) (pdfarray)).next();
	//    6   14:aload_1         
	//    7   15:invokeinterface #369 <Method Object Iterator.next()>
	//    8   20:checkcast       #695 <Class PdfObject>
	//    9   23:astore          5
			switch(pdfobject.type())
	//*  10   25:aload           5
	//*  11   27:invokevirtual   #778 <Method int PdfObject.type()>
			{
	//*  12   30:tableswitch     0 7: default 76
	//	               0 79
	//	               1 76
	//	               2 76
	//	               3 76
	//	               4 76
	//	               5 93
	//	               6 109
	//	               7 109
	//*  13   76:goto            5
			case 0: // '\0'
				findActivesFromReference((PdfIndirectReference)pdfobject, arraylist, hashset);
	//   14   79:aload_0         
	//   15   80:aload           5
	//   16   82:checkcast       #713 <Class PdfIndirectReference>
	//   17   85:aload_2         
	//   18   86:aload_3         
	//   19   87:invokespecial   #785 <Method void findActivesFromReference(PdfIndirectReference, ArrayList, HashSet)>
				break;

	//*  20   90:goto            5
			case 5: // '\005'
				findActivesFromArray((PdfArray)pdfobject, arraylist, hashset, hashset1);
	//   21   93:aload_0         
	//   22   94:aload           5
	//   23   96:checkcast       #474 <Class PdfArray>
	//   24   99:aload_2         
	//   25  100:aload_3         
	//   26  101:aload           4
	//   27  103:invokespecial   #789 <Method void findActivesFromArray(PdfArray, ArrayList, HashSet, HashSet)>
				break;

	//*  28  106:goto            5
			case 6: // '\006'
			case 7: // '\007'
				findActivesFromDict((PdfDictionary)pdfobject, arraylist, hashset, hashset1);
	//   29  109:aload_0         
	//   30  110:aload           5
	//   31  112:checkcast       #331 <Class PdfDictionary>
	//   32  115:aload_2         
	//   33  116:aload_3         
	//   34  117:aload           4
	//   35  119:invokespecial   #793 <Method void findActivesFromDict(PdfDictionary, ArrayList, HashSet, HashSet)>
				break;
			}
		} while(true);
	//*  36  122:goto            5
	//   37  125:return          
	}

	private void findActivesFromDict(PdfDictionary pdfdictionary, ArrayList arraylist, HashSet hashset, HashSet hashset1)
	{
		if(!containsInactivePg(pdfdictionary, hashset)) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokespecial   #798 <Method boolean containsInactivePg(PdfDictionary, HashSet)>
	//    4    6:ifeq            10
_L1:
		return;
	//    5    9:return          
_L2:
		Iterator iterator = pdfdictionary.getKeys().iterator();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #769 <Method Set PdfDictionary.getKeys()>
	//    8   14:invokeinterface #504 <Method Iterator Set.iterator()>
	//    9   19:astore          5
_L5:
		PdfObject pdfobject;
		while(iterator.hasNext()) 
	//*  10   21:aload           5
	//*  11   23:invokeinterface #365 <Method boolean Iterator.hasNext()>
	//*  12   28:ifeq            9
		{
			PdfName pdfname = (PdfName)iterator.next();
	//   13   31:aload           5
	//   14   33:invokeinterface #369 <Method Object Iterator.next()>
	//   15   38:checkcast       #115 <Class PdfName>
	//   16   41:astore          6
			pdfobject = pdfdictionary.get(pdfname);
	//   17   43:aload_1         
	//   18   44:aload           6
	//   19   46:invokevirtual   #570 <Method PdfObject PdfDictionary.get(PdfName)>
	//   20   49:astore          7
			if(!pdfname.equals(((Object) (PdfName.P))))
	//*  21   51:aload           6
	//*  22   53:getstatic       #206 <Field PdfName PdfName.P>
	//*  23   56:invokevirtual   #664 <Method boolean PdfName.equals(Object)>
	//*  24   59:ifne            21
			{
label0:
				{
					if(!pdfname.equals(((Object) (PdfName.C))))
						break label0;
	//   25   62:aload           6
	//   26   64:getstatic       #182 <Field PdfName PdfName.C>
	//   27   67:invokevirtual   #664 <Method boolean PdfName.equals(Object)>
	//   28   70:ifeq            157
					if(pdfobject.isArray())
	//*  29   73:aload           7
	//*  30   75:invokevirtual   #698 <Method boolean PdfObject.isArray()>
	//*  31   78:ifeq            135
					{
						Iterator iterator1 = ((PdfArray)pdfobject).iterator();
	//   32   81:aload           7
	//   33   83:checkcast       #474 <Class PdfArray>
	//   34   86:invokevirtual   #795 <Method Iterator PdfArray.iterator()>
	//   35   89:astore          6
						while(iterator1.hasNext()) 
	//*  36   91:aload           6
	//*  37   93:invokeinterface #365 <Method boolean Iterator.hasNext()>
	//*  38   98:ifeq            21
						{
							pdfobject = (PdfObject)iterator1.next();
	//   39  101:aload           6
	//   40  103:invokeinterface #369 <Method Object Iterator.next()>
	//   41  108:checkcast       #695 <Class PdfObject>
	//   42  111:astore          7
							if(pdfobject.isName())
	//*  43  113:aload           7
	//*  44  115:invokevirtual   #801 <Method boolean PdfObject.isName()>
	//*  45  118:ifeq            91
								hashset1.add(((Object) ((PdfName)pdfobject)));
	//   46  121:aload           4
	//   47  123:aload           7
	//   48  125:checkcast       #115 <Class PdfName>
	//   49  128:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//   50  131:pop             
						}
					} else
	//*  51  132:goto            91
					if(pdfobject.isName())
	//*  52  135:aload           7
	//*  53  137:invokevirtual   #801 <Method boolean PdfObject.isName()>
	//*  54  140:ifeq            21
						hashset1.add(((Object) ((PdfName)pdfobject)));
	//   55  143:aload           4
	//   56  145:aload           7
	//   57  147:checkcast       #115 <Class PdfName>
	//   58  150:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//   59  153:pop             
				}
			}
		}
		if(true) goto _L1; else goto _L3
	//   60  154:goto            21
_L3:
		switch(pdfobject.type())
	//*  61  157:aload           7
	//*  62  159:invokevirtual   #778 <Method int PdfObject.type()>
		{
	//*  63  162:tableswitch     0 7: default 208
	//	               0 211
	//	               1 208
	//	               2 208
	//	               3 208
	//	               4 208
	//	               5 225
	//	               6 241
	//	               7 241
	//*  64  208:goto            21
		case 0: // '\0'
			findActivesFromReference((PdfIndirectReference)pdfobject, arraylist, hashset);
	//   65  211:aload_0         
	//   66  212:aload           7
	//   67  214:checkcast       #713 <Class PdfIndirectReference>
	//   68  217:aload_2         
	//   69  218:aload_3         
	//   70  219:invokespecial   #785 <Method void findActivesFromReference(PdfIndirectReference, ArrayList, HashSet)>
			break;

	//*  71  222:goto            21
		case 5: // '\005'
			findActivesFromArray((PdfArray)pdfobject, arraylist, hashset, hashset1);
	//   72  225:aload_0         
	//   73  226:aload           7
	//   74  228:checkcast       #474 <Class PdfArray>
	//   75  231:aload_2         
	//   76  232:aload_3         
	//   77  233:aload           4
	//   78  235:invokespecial   #789 <Method void findActivesFromArray(PdfArray, ArrayList, HashSet, HashSet)>
			break;

	//*  79  238:goto            21
		case 6: // '\006'
		case 7: // '\007'
			findActivesFromDict((PdfDictionary)pdfobject, arraylist, hashset, hashset1);
	//   80  241:aload_0         
	//   81  242:aload           7
	//   82  244:checkcast       #331 <Class PdfDictionary>
	//   83  247:aload_2         
	//   84  248:aload_3         
	//   85  249:aload           4
	//   86  251:invokespecial   #793 <Method void findActivesFromDict(PdfDictionary, ArrayList, HashSet, HashSet)>
			break;
		}
		if(true) goto _L5; else goto _L4
_L4:
	//*  87  254:goto            21
	}

	private void findActivesFromReference(PdfIndirectReference pdfindirectreference, ArrayList arraylist, HashSet hashset)
	{
		RefKey refkey = new RefKey(pdfindirectreference);
	//    0    0:new             #682 <Class RefKey>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #688 <Method void RefKey(PdfIndirectReference)>
	//    4    8:astore          4
		for(PdfIndirectObject pdfindirectobject = (PdfIndirectObject)indirectObjects.get(((Object) (refkey))); pdfindirectobject != null && pdfindirectobject.object.isDictionary() && containsInactivePg((PdfDictionary)pdfindirectobject.object, hashset) || hashset.contains(((Object) (refkey)));)
	//*   5   10:aload_0         
	//*   6   11:getfield        #313 <Field LinkedHashMap indirectObjects>
	//*   7   14:aload           4
	//*   8   16:invokevirtual   #689 <Method Object LinkedHashMap.get(Object)>
	//*   9   19:checkcast       #422 <Class PdfIndirectObject>
	//*  10   22:astore          5
	//*  11   24:aload           5
	//*  12   26:ifnull          57
	//*  13   29:aload           5
	//*  14   31:getfield        #693 <Field PdfObject PdfIndirectObject.object>
	//*  15   34:invokevirtual   #701 <Method boolean PdfObject.isDictionary()>
	//*  16   37:ifeq            57
	//*  17   40:aload_0         
	//*  18   41:aload           5
	//*  19   43:getfield        #693 <Field PdfObject PdfIndirectObject.object>
	//*  20   46:checkcast       #331 <Class PdfDictionary>
	//*  21   49:aload_3         
	//*  22   50:invokespecial   #798 <Method boolean containsInactivePg(PdfDictionary, HashSet)>
	//*  23   53:ifeq            57
			return;
	//   24   56:return          

	//   25   57:aload_3         
	//   26   58:aload           4
	//   27   60:invokevirtual   #666 <Method boolean HashSet.contains(Object)>
	//   28   63:ifne            56
		hashset.add(((Object) (refkey)));
	//   29   66:aload_3         
	//   30   67:aload           4
	//   31   69:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//   32   72:pop             
		arraylist.add(((Object) (pdfindirectreference)));
	//   33   73:aload_2         
	//   34   74:aload_1         
	//   35   75:invokevirtual   #476 <Method boolean ArrayList.add(Object)>
	//   36   78:pop             
	//   37   79:return          
	}

	private void fixPgKey(ArrayList arraylist, HashSet hashset)
	{
		arraylist = ((ArrayList) (arraylist.iterator()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #670 <Method Iterator ArrayList.iterator()>
	//    2    4:astore_1        
_L9:
		int i;
		Object obj;
		Object obj1;
		if(!((Iterator) (arraylist)).hasNext())
			break; /* Loop/switch isn't completed */
	//    3    5:aload_1         
	//    4    6:invokeinterface #365 <Method boolean Iterator.hasNext()>
	//    5   11:ifeq            273
		obj = ((Object) ((PdfIndirectReference)((Iterator) (arraylist)).next()));
	//    6   14:aload_1         
	//    7   15:invokeinterface #369 <Method Object Iterator.next()>
	//    8   20:checkcast       #713 <Class PdfIndirectReference>
	//    9   23:astore          5
		obj = ((Object) ((PdfIndirectObject)indirectObjects.get(((Object) (new RefKey(((PdfIndirectReference) (obj))))))));
	//   10   25:aload_0         
	//   11   26:getfield        #313 <Field LinkedHashMap indirectObjects>
	//   12   29:new             #682 <Class RefKey>
	//   13   32:dup             
	//   14   33:aload           5
	//   15   35:invokespecial   #688 <Method void RefKey(PdfIndirectReference)>
	//   16   38:invokevirtual   #689 <Method Object LinkedHashMap.get(Object)>
	//   17   41:checkcast       #422 <Class PdfIndirectObject>
	//   18   44:astore          5
		if(obj == null || !((PdfIndirectObject) (obj)).object.isDictionary())
			continue; /* Loop/switch isn't completed */
	//   19   46:aload           5
	//   20   48:ifnull          5
	//   21   51:aload           5
	//   22   53:getfield        #693 <Field PdfObject PdfIndirectObject.object>
	//   23   56:invokevirtual   #701 <Method boolean PdfObject.isDictionary()>
	//   24   59:ifeq            5
		obj = ((Object) ((PdfDictionary)((PdfIndirectObject) (obj)).object));
	//   25   62:aload           5
	//   26   64:getfield        #693 <Field PdfObject PdfIndirectObject.object>
	//   27   67:checkcast       #331 <Class PdfDictionary>
	//   28   70:astore          5
		obj1 = ((Object) (((PdfDictionary) (obj)).get(PdfName.PG)));
	//   29   72:aload           5
	//   30   74:getstatic       #711 <Field PdfName PdfName.PG>
	//   31   77:invokevirtual   #570 <Method PdfObject PdfDictionary.get(PdfName)>
	//   32   80:astore          6
		if(obj1 == null || hashset.contains(((Object) (new RefKey((PdfIndirectReference)obj1)))))
			continue; /* Loop/switch isn't completed */
	//   33   82:aload           6
	//   34   84:ifnull          5
	//   35   87:aload_2         
	//   36   88:new             #682 <Class RefKey>
	//   37   91:dup             
	//   38   92:aload           6
	//   39   94:checkcast       #713 <Class PdfIndirectReference>
	//   40   97:invokespecial   #688 <Method void RefKey(PdfIndirectReference)>
	//   41  100:invokevirtual   #666 <Method boolean HashSet.contains(Object)>
	//   42  103:ifne            5
		obj1 = ((Object) (((PdfDictionary) (obj)).getAsArray(PdfName.K)));
	//   43  106:aload           5
	//   44  108:getstatic       #808 <Field PdfName PdfName.K>
	//   45  111:invokevirtual   #612 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   46  114:astore          6
		if(obj1 == null)
			continue; /* Loop/switch isn't completed */
	//   47  116:aload           6
	//   48  118:ifnull          5
		i = 0;
	//   49  121:iconst_0        
	//   50  122:istore_3        
_L2:
		int j;
		Object obj2;
		if(i >= ((PdfArray) (obj1)).size())
			continue; /* Loop/switch isn't completed */
	//   51  123:iload_3         
	//   52  124:aload           6
	//   53  126:invokevirtual   #475 <Method int PdfArray.size()>
	//   54  129:icmpge          5
		obj2 = ((Object) (((PdfArray) (obj1)).getPdfObject(i)));
	//   55  132:aload           6
	//   56  134:iload_3         
	//   57  135:invokevirtual   #811 <Method PdfObject PdfArray.getPdfObject(int)>
	//   58  138:astore          7
		if(((PdfObject) (obj2)).type() == 0)
			break; /* Loop/switch isn't completed */
	//   59  140:aload           7
	//   60  142:invokevirtual   #778 <Method int PdfObject.type()>
	//   61  145:ifeq            168
		((PdfArray) (obj1)).remove(i);
	//   62  148:aload           6
	//   63  150:iload_3         
	//   64  151:invokevirtual   #813 <Method PdfObject PdfArray.remove(int)>
	//   65  154:pop             
		j = i - 1;
	//   66  155:iload_3         
	//   67  156:iconst_1        
	//   68  157:isub            
	//   69  158:istore          4
_L4:
		i = j + 1;
	//   70  160:iload           4
	//   71  162:iconst_1        
	//   72  163:iadd            
	//   73  164:istore_3        
		if(true) goto _L2; else goto _L1
	//   74  165:goto            123
_L1:
		obj2 = ((Object) ((PdfIndirectObject)indirectObjects.get(((Object) (new RefKey((PdfIndirectReference)obj2))))));
	//   75  168:aload_0         
	//   76  169:getfield        #313 <Field LinkedHashMap indirectObjects>
	//   77  172:new             #682 <Class RefKey>
	//   78  175:dup             
	//   79  176:aload           7
	//   80  178:checkcast       #713 <Class PdfIndirectReference>
	//   81  181:invokespecial   #688 <Method void RefKey(PdfIndirectReference)>
	//   82  184:invokevirtual   #689 <Method Object LinkedHashMap.get(Object)>
	//   83  187:checkcast       #422 <Class PdfIndirectObject>
	//   84  190:astore          7
		j = i;
	//   85  192:iload_3         
	//   86  193:istore          4
		if(obj2 == null) goto _L4; else goto _L3
	//   87  195:aload           7
	//   88  197:ifnull          160
_L3:
		j = i;
	//   89  200:iload_3         
	//   90  201:istore          4
		if(!((PdfIndirectObject) (obj2)).object.isDictionary()) goto _L4; else goto _L5
	//   91  203:aload           7
	//   92  205:getfield        #693 <Field PdfObject PdfIndirectObject.object>
	//   93  208:invokevirtual   #701 <Method boolean PdfObject.isDictionary()>
	//   94  211:ifeq            160
_L5:
		obj2 = ((Object) (((PdfDictionary)((PdfIndirectObject) (obj2)).object).get(PdfName.PG)));
	//   95  214:aload           7
	//   96  216:getfield        #693 <Field PdfObject PdfIndirectObject.object>
	//   97  219:checkcast       #331 <Class PdfDictionary>
	//   98  222:getstatic       #711 <Field PdfName PdfName.PG>
	//   99  225:invokevirtual   #570 <Method PdfObject PdfDictionary.get(PdfName)>
	//  100  228:astore          7
		j = i;
	//  101  230:iload_3         
	//  102  231:istore          4
		if(obj2 == null) goto _L4; else goto _L6
	//  103  233:aload           7
	//  104  235:ifnull          160
_L6:
		j = i;
	//  105  238:iload_3         
	//  106  239:istore          4
		if(!hashset.contains(((Object) (new RefKey((PdfIndirectReference)obj2))))) goto _L4; else goto _L7
	//  107  241:aload_2         
	//  108  242:new             #682 <Class RefKey>
	//  109  245:dup             
	//  110  246:aload           7
	//  111  248:checkcast       #713 <Class PdfIndirectReference>
	//  112  251:invokespecial   #688 <Method void RefKey(PdfIndirectReference)>
	//  113  254:invokevirtual   #666 <Method boolean HashSet.contains(Object)>
	//  114  257:ifeq            160
_L7:
		((PdfDictionary) (obj)).put(PdfName.PG, ((PdfObject) (obj2)));
	//  115  260:aload           5
	//  116  262:getstatic       #711 <Field PdfName PdfName.PG>
	//  117  265:aload           7
	//  118  267:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(true) goto _L9; else goto _L8
	//  119  270:goto            5
_L8:
	//  120  273:return          
	}

	private static String getCOName(PdfReader pdfreader, PRIndirectReference prindirectreference)
	{
		pdfreader = "";
	//    0    0:ldc2            #744 <String "">
	//    1    3:astore_0        
		do
		{
label0:
			{
				if(prindirectreference != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          26
				{
					prindirectreference = ((PRIndirectReference) (PdfReader.getPdfObject(((PdfObject) (prindirectreference)))));
	//    4    8:aload_1         
	//    5    9:invokestatic    #766 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//    6   12:astore_1        
					if(prindirectreference != null && ((PdfObject) (prindirectreference)).type() == 6)
						break label0;
	//    7   13:aload_1         
	//    8   14:ifnull          26
	//    9   17:aload_1         
	//   10   18:invokevirtual   #778 <Method int PdfObject.type()>
	//   11   21:bipush          6
	//   12   23:icmpeq          52
				}
				prindirectreference = ((PRIndirectReference) (pdfreader));
	//   13   26:aload_0         
	//   14   27:astore_1        
				if(((String) (pdfreader)).endsWith("."))
	//*  15   28:aload_0         
	//*  16   29:ldc2            #537 <String ".">
	//*  17   32:invokevirtual   #820 <Method boolean String.endsWith(String)>
	//*  18   35:ifeq            50
					prindirectreference = ((PRIndirectReference) (((String) (pdfreader)).substring(0, ((String) (pdfreader)).length() - 2)));
	//   19   38:aload_0         
	//   20   39:iconst_0        
	//   21   40:aload_0         
	//   22   41:invokevirtual   #823 <Method int String.length()>
	//   23   44:iconst_2        
	//   24   45:isub            
	//   25   46:invokevirtual   #827 <Method String String.substring(int, int)>
	//   26   49:astore_1        
				return ((String) (prindirectreference));
	//   27   50:aload_1         
	//   28   51:areturn         
			}
			Object obj = ((Object) ((PdfDictionary)prindirectreference));
	//   29   52:aload_1         
	//   30   53:checkcast       #331 <Class PdfDictionary>
	//   31   56:astore_2        
			PdfString pdfstring = ((PdfDictionary) (obj)).getAsString(PdfName.T);
	//   32   57:aload_2         
	//   33   58:getstatic       #523 <Field PdfName PdfName.T>
	//   34   61:invokevirtual   #589 <Method PdfString PdfDictionary.getAsString(PdfName)>
	//   35   64:astore_3        
			prindirectreference = ((PRIndirectReference) (pdfreader));
	//   36   65:aload_0         
	//   37   66:astore_1        
			if(pdfstring != null)
	//*  38   67:aload_3         
	//*  39   68:ifnull          99
				prindirectreference = ((PRIndirectReference) ((new StringBuilder()).append(pdfstring.toUnicodeString()).append(".").append(((String) (pdfreader))).toString()));
	//   40   71:new             #530 <Class StringBuilder>
	//   41   74:dup             
	//   42   75:invokespecial   #531 <Method void StringBuilder()>
	//   43   78:aload_3         
	//   44   79:invokevirtual   #634 <Method String PdfString.toUnicodeString()>
	//   45   82:invokevirtual   #535 <Method StringBuilder StringBuilder.append(String)>
	//   46   85:ldc2            #537 <String ".">
	//   47   88:invokevirtual   #535 <Method StringBuilder StringBuilder.append(String)>
	//   48   91:aload_0         
	//   49   92:invokevirtual   #535 <Method StringBuilder StringBuilder.append(String)>
	//   50   95:invokevirtual   #541 <Method String StringBuilder.toString()>
	//   51   98:astore_1        
			obj = ((Object) ((PRIndirectReference)((PdfDictionary) (obj)).get(PdfName.PARENT)));
	//   52   99:aload_2         
	//   53  100:getstatic       #520 <Field PdfName PdfName.PARENT>
	//   54  103:invokevirtual   #570 <Method PdfObject PdfDictionary.get(PdfName)>
	//   55  106:checkcast       #829 <Class PRIndirectReference>
	//   56  109:astore_2        
			pdfreader = ((PdfReader) (prindirectreference));
	//   57  110:aload_1         
	//   58  111:astore_0        
			prindirectreference = ((PRIndirectReference) (obj));
	//   59  112:aload_2         
	//   60  113:astore_1        
		} while(true);
	//   61  114:goto            4
	}

	static Integer getFlags(PdfDictionary pdfdictionary)
	{
		PdfName pdfname = pdfdictionary.getAsName(PdfName.FT);
	//    0    0:aload_0         
	//    1    1:getstatic       #215 <Field PdfName PdfName.FT>
	//    2    4:invokevirtual   #654 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//    3    7:astore_1        
		if(PdfName.BTN.equals(((Object) (pdfname))))
	//*   4    8:getstatic       #834 <Field PdfName PdfName.BTN>
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #664 <Method boolean PdfName.equals(Object)>
	//*   7   15:ifne            20
	//*   8   18:aconst_null     
	//*   9   19:areturn         
	//*  10   20:aload_0         
	//*  11   21:getstatic       #224 <Field PdfName PdfName.FF>
	//*  12   24:invokevirtual   #838 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//*  13   27:astore_0        
			if((pdfdictionary = ((PdfDictionary) (pdfdictionary.getAsNumber(PdfName.FF)))) != null)
	//*  14   28:aload_0         
	//*  15   29:ifnull          18
				return Integer.valueOf(((PdfNumber) (pdfdictionary)).intValue());
	//   16   32:aload_0         
	//   17   33:invokevirtual   #466 <Method int PdfNumber.intValue()>
	//   18   36:invokestatic    #135 <Method Integer Integer.valueOf(int)>
	//   19   39:areturn         
		return null;
	}

	static boolean isCheckButton(PdfDictionary pdfdictionary)
	{
		pdfdictionary = ((PdfDictionary) (getFlags(pdfdictionary)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #840 <Method Integer getFlags(PdfDictionary)>
	//    2    4:astore_0        
		return pdfdictionary == null || (((Integer) (pdfdictionary)).intValue() & 0x10000) == 0 && (((Integer) (pdfdictionary)).intValue() & 0x8000) == 0;
	//    3    5:aload_0         
	//    4    6:ifnull          31
	//    5    9:aload_0         
	//    6   10:invokevirtual   #455 <Method int Integer.intValue()>
	//    7   13:ldc2            #841 <Int 0x10000>
	//    8   16:iand            
	//    9   17:ifne            33
	//   10   20:aload_0         
	//   11   21:invokevirtual   #455 <Method int Integer.intValue()>
	//   12   24:ldc2            #842 <Int 32768>
	//   13   27:iand            
	//   14   28:ifne            33
	//   15   31:iconst_1        
	//   16   32:ireturn         
	//   17   33:iconst_0        
	//   18   34:ireturn         
	}

	static boolean isRadioButton(PdfDictionary pdfdictionary)
	{
		pdfdictionary = ((PdfDictionary) (getFlags(pdfdictionary)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #840 <Method Integer getFlags(PdfDictionary)>
	//    2    4:astore_0        
		return pdfdictionary != null && (((Integer) (pdfdictionary)).intValue() & 0x10000) == 0 && (((Integer) (pdfdictionary)).intValue() & 0x8000) != 0;
	//    3    5:aload_0         
	//    4    6:ifnull          33
	//    5    9:aload_0         
	//    6   10:invokevirtual   #455 <Method int Integer.intValue()>
	//    7   13:ldc2            #841 <Int 0x10000>
	//    8   16:iand            
	//    9   17:ifne            33
	//   10   20:aload_0         
	//   11   21:invokevirtual   #455 <Method int Integer.intValue()>
	//   12   24:ldc2            #842 <Int 32768>
	//   13   27:iand            
	//   14   28:ifeq            33
	//   15   31:iconst_1        
	//   16   32:ireturn         
	//   17   33:iconst_0        
	//   18   34:ireturn         
	}

	static boolean isTextField(PdfDictionary pdfdictionary)
	{
		pdfdictionary = ((PdfDictionary) (pdfdictionary.getAsName(PdfName.FT)));
	//    0    0:aload_0         
	//    1    1:getstatic       #215 <Field PdfName PdfName.FT>
	//    2    4:invokevirtual   #654 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//    3    7:astore_0        
		return PdfName.TX.equals(((Object) (pdfdictionary)));
	//    4    8:getstatic       #845 <Field PdfName PdfName.TX>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #664 <Method boolean PdfName.equals(Object)>
	//    7   15:ireturn         
	}

	private void mergeField(String s, AcroFields.Item item)
	{
		Object obj2;
		HashMap hashmap = fieldTree;
	//    0    0:aload_0         
	//    1    1:getfield        #717 <Field HashMap fieldTree>
	//    2    4:astore          6
		obj2 = ((Object) (new StringTokenizer(s, ".")));
	//    3    6:new             #849 <Class StringTokenizer>
	//    4    9:dup             
	//    5   10:aload_1         
	//    6   11:ldc2            #537 <String ".">
	//    7   14:invokespecial   #850 <Method void StringTokenizer(String, String)>
	//    8   17:astore          8
		s = ((String) (hashmap));
	//    9   19:aload           6
	//   10   21:astore_1        
		if(((StringTokenizer) (obj2)).hasMoreTokens()) goto _L2; else goto _L1
	//   11   22:aload           8
	//   12   24:invokevirtual   #853 <Method boolean StringTokenizer.hasMoreTokens()>
	//   13   27:ifne            31
_L1:
		return;
	//   14   30:return          
_L2:
		Object obj1;
		Object obj3;
		do
		{
			obj1 = ((Object) (((StringTokenizer) (obj2)).nextToken()));
	//   15   31:aload           8
	//   16   33:invokevirtual   #856 <Method String StringTokenizer.nextToken()>
	//   17   36:astore          7
			obj3 = ((HashMap) (s)).get(obj1);
	//   18   38:aload_1         
	//   19   39:aload           7
	//   20   41:invokevirtual   #472 <Method Object HashMap.get(Object)>
	//   21   44:astore          9
			if(!((StringTokenizer) (obj2)).hasMoreTokens())
				continue; /* Loop/switch isn't completed */
	//   22   46:aload           8
	//   23   48:invokevirtual   #853 <Method boolean StringTokenizer.hasMoreTokens()>
	//   24   51:ifeq            103
			if(obj3 != null)
				continue; /* Loop/switch isn't completed */
	//   25   54:aload           9
	//   26   56:ifnonnull       86
			LinkedHashMap linkedhashmap = new LinkedHashMap();
	//   27   59:new             #310 <Class LinkedHashMap>
	//   28   62:dup             
	//   29   63:invokespecial   #311 <Method void LinkedHashMap()>
	//   30   66:astore          6
			((HashMap) (s)).put(obj1, ((Object) (linkedhashmap)));
	//   31   68:aload_1         
	//   32   69:aload           7
	//   33   71:aload           6
	//   34   73:invokevirtual   #479 <Method Object HashMap.put(Object, Object)>
	//   35   76:pop             
			s = ((String) ((HashMap)linkedhashmap));
	//   36   77:aload           6
	//   37   79:checkcast       #283 <Class HashMap>
	//   38   82:astore_1        
		} while(true);
	//   39   83:goto            31
		if(!(obj3 instanceof HashMap)) goto _L1; else goto _L3
	//   40   86:aload           9
	//   41   88:instanceof      #283 <Class HashMap>
	//   42   91:ifeq            30
_L3:
		s = ((String) ((HashMap)obj3));
	//   43   94:aload           9
	//   44   96:checkcast       #283 <Class HashMap>
	//   45   99:astore_1        
		  goto _L2
	//*  46  100:goto            31
		if(obj3 instanceof HashMap) goto _L1; else goto _L4
	//   47  103:aload           9
	//   48  105:instanceof      #283 <Class HashMap>
	//   49  108:ifne            30
_L4:
		Object obj;
		obj = ((Object) (item.getMerged(0)));
	//   50  111:aload_2         
	//   51  112:iconst_0        
	//   52  113:invokevirtual   #763 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//   53  116:astore          6
		if(obj3 == null)
	//*  54  118:aload           9
	//*  55  120:ifnonnull       250
		{
			obj2 = ((Object) (new PdfDictionary()));
	//   56  123:new             #331 <Class PdfDictionary>
	//   57  126:dup             
	//   58  127:invokespecial   #332 <Method void PdfDictionary()>
	//   59  130:astore          8
			if(PdfName.SIG.equals(((Object) (((PdfDictionary) (obj)).get(PdfName.FT)))))
	//*  60  132:getstatic       #859 <Field PdfName PdfName.SIG>
	//*  61  135:aload           6
	//*  62  137:getstatic       #215 <Field PdfName PdfName.FT>
	//*  63  140:invokevirtual   #570 <Method PdfObject PdfDictionary.get(PdfName)>
	//*  64  143:invokevirtual   #664 <Method boolean PdfName.equals(Object)>
	//*  65  146:ifeq            154
				hasSignature = true;
	//   66  149:aload_0         
	//   67  150:iconst_1        
	//   68  151:putfield        #746 <Field boolean hasSignature>
			obj3 = ((Object) (((PdfDictionary) (obj)).getKeys().iterator()));
	//   69  154:aload           6
	//   70  156:invokevirtual   #769 <Method Set PdfDictionary.getKeys()>
	//   71  159:invokeinterface #504 <Method Iterator Set.iterator()>
	//   72  164:astore          9
			do
			{
				if(!((Iterator) (obj3)).hasNext())
					break;
	//   73  166:aload           9
	//   74  168:invokeinterface #365 <Method boolean Iterator.hasNext()>
	//   75  173:ifeq            216
				PdfName pdfname = (PdfName)((Iterator) (obj3)).next();
	//   76  176:aload           9
	//   77  178:invokeinterface #369 <Method Object Iterator.next()>
	//   78  183:checkcast       #115 <Class PdfName>
	//   79  186:astore          10
				if(fieldKeys.contains(((Object) (pdfname))))
	//*  80  188:getstatic       #145 <Field HashSet fieldKeys>
	//*  81  191:aload           10
	//*  82  193:invokevirtual   #666 <Method boolean HashSet.contains(Object)>
	//*  83  196:ifeq            166
					((PdfDictionary) (obj2)).put(pdfname, ((PdfDictionary) (obj)).get(pdfname));
	//   84  199:aload           8
	//   85  201:aload           10
	//   86  203:aload           6
	//   87  205:aload           10
	//   88  207:invokevirtual   #570 <Method PdfObject PdfDictionary.get(PdfName)>
	//   89  210:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
			} while(true);
	//   90  213:goto            166
			obj = ((Object) (new ArrayList()));
	//   91  216:new             #315 <Class ArrayList>
	//   92  219:dup             
	//   93  220:invokespecial   #316 <Method void ArrayList()>
	//   94  223:astore          6
			((ArrayList) (obj)).add(obj2);
	//   95  225:aload           6
	//   96  227:aload           8
	//   97  229:invokevirtual   #476 <Method boolean ArrayList.add(Object)>
	//   98  232:pop             
			createWidgets(((ArrayList) (obj)), item);
	//   99  233:aload_0         
	//  100  234:aload           6
	//  101  236:aload_2         
	//  102  237:invokespecial   #861 <Method void createWidgets(ArrayList, AcroFields$Item)>
			((HashMap) (s)).put(obj1, obj);
	//  103  240:aload_1         
	//  104  241:aload           7
	//  105  243:aload           6
	//  106  245:invokevirtual   #479 <Method Object HashMap.put(Object, Object)>
	//  107  248:pop             
			return;
	//  108  249:return          
		}
		s = ((String) ((ArrayList)obj3));
	//  109  250:aload           9
	//  110  252:checkcast       #315 <Class ArrayList>
	//  111  255:astore_1        
		obj2 = ((Object) ((PdfDictionary)((ArrayList) (s)).get(0)));
	//  112  256:aload_1         
	//  113  257:iconst_0        
	//  114  258:invokevirtual   #486 <Method Object ArrayList.get(int)>
	//  115  261:checkcast       #331 <Class PdfDictionary>
	//  116  264:astore          8
		obj1 = ((Object) ((PdfName)((PdfDictionary) (obj2)).get(PdfName.FT)));
	//  117  266:aload           8
	//  118  268:getstatic       #215 <Field PdfName PdfName.FT>
	//  119  271:invokevirtual   #570 <Method PdfObject PdfDictionary.get(PdfName)>
	//  120  274:checkcast       #115 <Class PdfName>
	//  121  277:astore          7
		obj3 = ((Object) ((PdfName)((PdfDictionary) (obj)).get(PdfName.FT)));
	//  122  279:aload           6
	//  123  281:getstatic       #215 <Field PdfName PdfName.FT>
	//  124  284:invokevirtual   #570 <Method PdfObject PdfDictionary.get(PdfName)>
	//  125  287:checkcast       #115 <Class PdfName>
	//  126  290:astore          9
		if(obj1 == null || !((PdfName) (obj1)).equals(obj3)) goto _L1; else goto _L5
	//  127  292:aload           7
	//  128  294:ifnull          30
	//  129  297:aload           7
	//  130  299:aload           9
	//  131  301:invokevirtual   #664 <Method boolean PdfName.equals(Object)>
	//  132  304:ifeq            30
_L5:
		int i;
		int j;
		j = 0;
	//  133  307:iconst_0        
	//  134  308:istore          4
		obj2 = ((Object) (((PdfDictionary) (obj2)).get(PdfName.FF)));
	//  135  310:aload           8
	//  136  312:getstatic       #224 <Field PdfName PdfName.FF>
	//  137  315:invokevirtual   #570 <Method PdfObject PdfDictionary.get(PdfName)>
	//  138  318:astore          8
		i = j;
	//  139  320:iload           4
	//  140  322:istore_3        
		if(obj2 != null)
	//* 141  323:aload           8
	//* 142  325:ifnull          348
		{
			i = j;
	//  143  328:iload           4
	//  144  330:istore_3        
			if(((PdfObject) (obj2)).isNumber())
	//* 145  331:aload           8
	//* 146  333:invokevirtual   #864 <Method boolean PdfObject.isNumber()>
	//* 147  336:ifeq            348
				i = ((PdfNumber)obj2).intValue();
	//  148  339:aload           8
	//  149  341:checkcast       #465 <Class PdfNumber>
	//  150  344:invokevirtual   #466 <Method int PdfNumber.intValue()>
	//  151  347:istore_3        
		}
		boolean flag = false;
	//  152  348:iconst_0        
	//  153  349:istore          5
		obj = ((Object) (((PdfDictionary) (obj)).get(PdfName.FF)));
	//  154  351:aload           6
	//  155  353:getstatic       #224 <Field PdfName PdfName.FF>
	//  156  356:invokevirtual   #570 <Method PdfObject PdfDictionary.get(PdfName)>
	//  157  359:astore          6
		j = ((int) (flag));
	//  158  361:iload           5
	//  159  363:istore          4
		if(obj != null)
	//* 160  365:aload           6
	//* 161  367:ifnull          392
		{
			j = ((int) (flag));
	//  162  370:iload           5
	//  163  372:istore          4
			if(((PdfObject) (obj)).isNumber())
	//* 164  374:aload           6
	//* 165  376:invokevirtual   #864 <Method boolean PdfObject.isNumber()>
	//* 166  379:ifeq            392
				j = ((PdfNumber)obj).intValue();
	//  167  382:aload           6
	//  168  384:checkcast       #465 <Class PdfNumber>
	//  169  387:invokevirtual   #466 <Method int PdfNumber.intValue()>
	//  170  390:istore          4
		}
		if(!((PdfName) (obj1)).equals(((Object) (PdfName.BTN)))) goto _L7; else goto _L6
	//  171  392:aload           7
	//  172  394:getstatic       #834 <Field PdfName PdfName.BTN>
	//  173  397:invokevirtual   #664 <Method boolean PdfName.equals(Object)>
	//  174  400:ifeq            440
_L6:
		if(((i ^ j) & 0x10000) != 0 || (0x10000 & i) == 0 && ((i ^ j) & 0x8000) != 0) goto _L1; else goto _L8
	//  175  403:iload_3         
	//  176  404:iload           4
	//  177  406:ixor            
	//  178  407:ldc2            #841 <Int 0x10000>
	//  179  410:iand            
	//  180  411:ifne            30
	//  181  414:ldc2            #841 <Int 0x10000>
	//  182  417:iload_3         
	//  183  418:iand            
	//  184  419:ifne            433
	//  185  422:iload_3         
	//  186  423:iload           4
	//  187  425:ixor            
	//  188  426:ldc2            #842 <Int 32768>
	//  189  429:iand            
	//  190  430:ifne            30
_L8:
		createWidgets(((ArrayList) (s)), item);
	//  191  433:aload_0         
	//  192  434:aload_1         
	//  193  435:aload_2         
	//  194  436:invokespecial   #861 <Method void createWidgets(ArrayList, AcroFields$Item)>
		return;
	//  195  439:return          
_L7:
		if(((PdfName) (obj1)).equals(((Object) (PdfName.CH))) && ((i ^ j) & 0x20000) != 0)
	//* 196  440:aload           7
	//* 197  442:getstatic       #867 <Field PdfName PdfName.CH>
	//* 198  445:invokevirtual   #664 <Method boolean PdfName.equals(Object)>
	//* 199  448:ifeq            433
	//* 200  451:iload_3         
	//* 201  452:iload           4
	//* 202  454:ixor            
	//* 203  455:ldc2            #868 <Int 0x20000>
	//* 204  458:iand            
	//* 205  459:ifeq            433
			return;
	//  206  462:return          
		if(true) goto _L8; else goto _L9
_L9:
	}

	private void mergeFields()
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		for(int i = 0; i < fields.size();)
	//*   2    2:iconst_0        
	//*   3    3:istore_1        
	//*   4    4:iload_1         
	//*   5    5:aload_0         
	//*   6    6:getfield        #602 <Field ArrayList fields>
	//*   7    9:invokevirtual   #483 <Method int ArrayList.size()>
	//*   8   12:icmpge          105
		{
			AcroFields acrofields = (AcroFields)fields.get(i);
	//    9   15:aload_0         
	//   10   16:getfield        #602 <Field ArrayList fields>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #486 <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #604 <Class AcroFields>
	//   14   26:astore          4
			Map map = acrofields.getFields();
	//   15   28:aload           4
	//   16   30:invokevirtual   #872 <Method Map AcroFields.getFields()>
	//   17   33:astore          5
			int k = j;
	//   18   35:iload_2         
	//   19   36:istore_3        
			if(j < importedPages.size())
	//*  20   37:iload_2         
	//*  21   38:aload_0         
	//*  22   39:getfield        #320 <Field ArrayList importedPages>
	//*  23   42:invokevirtual   #483 <Method int ArrayList.size()>
	//*  24   45:icmpge          90
			{
				k = j;
	//   25   48:iload_2         
	//   26   49:istore_3        
				if(((ImportedPage)importedPages.get(j)).reader == acrofields.reader)
	//*  27   50:aload_0         
	//*  28   51:getfield        #320 <Field ArrayList importedPages>
	//*  29   54:iload_2         
	//*  30   55:invokevirtual   #486 <Method Object ArrayList.get(int)>
	//*  31   58:checkcast       #6   <Class PdfCopy$ImportedPage>
	//*  32   61:getfield        #672 <Field PdfReader PdfCopy$ImportedPage.reader>
	//*  33   64:aload           4
	//*  34   66:getfield        #873 <Field PdfReader AcroFields.reader>
	//*  35   69:if_acmpne       90
				{
					addPageOffsetToField(map, j);
	//   36   72:aload_0         
	//   37   73:aload           5
	//   38   75:iload_2         
	//   39   76:invokespecial   #875 <Method void addPageOffsetToField(Map, int)>
					k = j + acrofields.reader.getNumberOfPages();
	//   40   79:iload_2         
	//   41   80:aload           4
	//   42   82:getfield        #873 <Field PdfReader AcroFields.reader>
	//   43   85:invokevirtual   #878 <Method int PdfReader.getNumberOfPages()>
	//   44   88:iadd            
	//   45   89:istore_3        
				}
			}
			mergeWithMaster(map);
	//   46   90:aload_0         
	//   47   91:aload           5
	//   48   93:invokespecial   #882 <Method void mergeWithMaster(Map)>
			i++;
	//   49   96:iload_1         
	//   50   97:iconst_1        
	//   51   98:iadd            
	//   52   99:istore_1        
			j = k;
	//   53  100:iload_3         
	//   54  101:istore_2        
		}

	//*  55  102:goto            4
	//   56  105:return          
	}

	private void mergeWithMaster(Map map)
	{
		java.util.Map.Entry entry;
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext(); mergeField((String)entry.getKey(), (AcroFields.Item)entry.getValue()))
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #883 <Method Set Map.entrySet()>
	//*   2    6:invokeinterface #504 <Method Iterator Set.iterator()>
	//*   3   11:astore_1        
	//*   4   12:aload_1         
	//*   5   13:invokeinterface #365 <Method boolean Iterator.hasNext()>
	//*   6   18:ifeq            56
			entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//    7   21:aload_1         
	//    8   22:invokeinterface #369 <Method Object Iterator.next()>
	//    9   27:checkcast       #506 <Class java.util.Map$Entry>
	//   10   30:astore_2        

	//   11   31:aload_0         
	//   12   32:aload_2         
	//   13   33:invokeinterface #509 <Method Object java.util.Map$Entry.getKey()>
	//   14   38:checkcast       #511 <Class String>
	//   15   41:aload_2         
	//   16   42:invokeinterface #514 <Method Object java.util.Map$Entry.getValue()>
	//   17   47:checkcast       #445 <Class AcroFields$Item>
	//   18   50:invokespecial   #885 <Method void mergeField(String, AcroFields$Item)>
	//*  19   53:goto            12
	//   20   56:return          
	}

	private PdfObject propagate(PdfObject pdfobject)
		throws IOException
	{
		if(pdfobject != null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnonnull       14
_L1:
		pdfobject = ((PdfObject) (new PdfNull()));
	//    2    4:new             #888 <Class PdfNull>
	//    3    7:dup             
	//    4    8:invokespecial   #889 <Method void PdfNull()>
	//    5   11:astore_1        
_L4:
		return pdfobject;
	//    6   12:aload_1         
	//    7   13:areturn         
_L2:
label0:
		{
			if(!pdfobject.isArray())
				break label0;
	//    8   14:aload_1         
	//    9   15:invokevirtual   #698 <Method boolean PdfObject.isArray()>
	//   10   18:ifeq            60
			PdfArray pdfarray = (PdfArray)pdfobject;
	//   11   21:aload_1         
	//   12   22:checkcast       #474 <Class PdfArray>
	//   13   25:astore_3        
			int i = 0;
	//   14   26:iconst_0        
	//   15   27:istore_2        
			do
			{
				pdfobject = ((PdfObject) (pdfarray));
	//   16   28:aload_3         
	//   17   29:astore_1        
				if(i >= pdfarray.size())
					break;
	//   18   30:iload_2         
	//   19   31:aload_3         
	//   20   32:invokevirtual   #475 <Method int PdfArray.size()>
	//   21   35:icmpge          12
				pdfarray.set(i, propagate(pdfarray.getPdfObject(i)));
	//   22   38:aload_3         
	//   23   39:iload_2         
	//   24   40:aload_0         
	//   25   41:aload_3         
	//   26   42:iload_2         
	//   27   43:invokevirtual   #811 <Method PdfObject PdfArray.getPdfObject(int)>
	//   28   46:invokespecial   #730 <Method PdfObject propagate(PdfObject)>
	//   29   49:invokevirtual   #892 <Method PdfObject PdfArray.set(int, PdfObject)>
	//   30   52:pop             
				i++;
	//   31   53:iload_2         
	//   32   54:iconst_1        
	//   33   55:iadd            
	//   34   56:istore_2        
			} while(true);
	//   35   57:goto            28
		}
		if(true) goto _L4; else goto _L3
_L3:
		if(pdfobject.isDictionary() || pdfobject.isStream())
	//*  36   60:aload_1         
	//*  37   61:invokevirtual   #701 <Method boolean PdfObject.isDictionary()>
	//*  38   64:ifne            74
	//*  39   67:aload_1         
	//*  40   68:invokevirtual   #704 <Method boolean PdfObject.isStream()>
	//*  41   71:ifeq            130
		{
			pdfobject = ((PdfObject) ((PdfDictionary)pdfobject));
	//   42   74:aload_1         
	//   43   75:checkcast       #331 <Class PdfDictionary>
	//   44   78:astore_1        
			PdfName pdfname;
			for(Iterator iterator = ((PdfDictionary) (pdfobject)).getKeys().iterator(); iterator.hasNext(); ((PdfDictionary) (pdfobject)).put(pdfname, propagate(((PdfDictionary) (pdfobject)).get(pdfname))))
	//*  45   79:aload_1         
	//*  46   80:invokevirtual   #769 <Method Set PdfDictionary.getKeys()>
	//*  47   83:invokeinterface #504 <Method Iterator Set.iterator()>
	//*  48   88:astore_3        
	//*  49   89:aload_3         
	//*  50   90:invokeinterface #365 <Method boolean Iterator.hasNext()>
	//*  51   95:ifeq            128
				pdfname = (PdfName)iterator.next();
	//   52   98:aload_3         
	//   53   99:invokeinterface #369 <Method Object Iterator.next()>
	//   54  104:checkcast       #115 <Class PdfName>
	//   55  107:astore          4

	//   56  109:aload_1         
	//   57  110:aload           4
	//   58  112:aload_0         
	//   59  113:aload_1         
	//   60  114:aload           4
	//   61  116:invokevirtual   #570 <Method PdfObject PdfDictionary.get(PdfName)>
	//   62  119:invokespecial   #730 <Method PdfObject propagate(PdfObject)>
	//   63  122:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  64  125:goto            89
			return pdfobject;
	//   65  128:aload_1         
	//   66  129:areturn         
		}
		if(pdfobject.isIndirect())
	//*  67  130:aload_1         
	//*  68  131:invokevirtual   #895 <Method boolean PdfObject.isIndirect()>
	//*  69  134:ifeq            153
			return ((PdfObject) (addToBody(propagate(PdfReader.getPdfObject(pdfobject))).getIndirectReference()));
	//   70  137:aload_0         
	//   71  138:aload_0         
	//   72  139:aload_1         
	//   73  140:invokestatic    #766 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//   74  143:invokespecial   #730 <Method PdfObject propagate(PdfObject)>
	//   75  146:invokevirtual   #420 <Method PdfIndirectObject addToBody(PdfObject)>
	//   76  149:invokevirtual   #426 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//   77  152:areturn         
		else
			return pdfobject;
	//   78  153:aload_1         
	//   79  154:areturn         
	}

	private void removeInactiveReferences(PdfArray pdfarray, HashSet hashset)
	{
		int j;
		for(int i = 0; i < pdfarray.size(); i = j + 1)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_1         
	//*   4    4:invokevirtual   #475 <Method int PdfArray.size()>
	//*   5    7:icmpge          90
		{
			PdfObject pdfobject = pdfarray.getPdfObject(i);
	//    6   10:aload_1         
	//    7   11:iload_3         
	//    8   12:invokevirtual   #811 <Method PdfObject PdfArray.getPdfObject(int)>
	//    9   15:astore          5
			if(pdfobject.type() != 0 || hashset.contains(((Object) (new RefKey((PdfIndirectReference)pdfobject)))))
	//*  10   17:aload           5
	//*  11   19:invokevirtual   #778 <Method int PdfObject.type()>
	//*  12   22:ifne            44
	//*  13   25:aload_2         
	//*  14   26:new             #682 <Class RefKey>
	//*  15   29:dup             
	//*  16   30:aload           5
	//*  17   32:checkcast       #713 <Class PdfIndirectReference>
	//*  18   35:invokespecial   #688 <Method void RefKey(PdfIndirectReference)>
	//*  19   38:invokevirtual   #666 <Method boolean HashSet.contains(Object)>
	//*  20   41:ifeq            71
			{
				j = i;
	//   21   44:iload_3         
	//   22   45:istore          4
				if(!pdfobject.isDictionary())
					continue;
	//   23   47:aload           5
	//   24   49:invokevirtual   #701 <Method boolean PdfObject.isDictionary()>
	//   25   52:ifeq            82
				j = i;
	//   26   55:iload_3         
	//   27   56:istore          4
				if(!containsInactivePg((PdfDictionary)pdfobject, hashset))
					continue;
	//   28   58:aload_0         
	//   29   59:aload           5
	//   30   61:checkcast       #331 <Class PdfDictionary>
	//   31   64:aload_2         
	//   32   65:invokespecial   #798 <Method boolean containsInactivePg(PdfDictionary, HashSet)>
	//   33   68:ifeq            82
			}
			pdfarray.remove(i);
	//   34   71:aload_1         
	//   35   72:iload_3         
	//   36   73:invokevirtual   #813 <Method PdfObject PdfArray.remove(int)>
	//   37   76:pop             
			j = i - 1;
	//   38   77:iload_3         
	//   39   78:iconst_1        
	//   40   79:isub            
	//   41   80:istore          4
		}

	//   42   82:iload           4
	//   43   84:iconst_1        
	//   44   85:iadd            
	//   45   86:istore_3        
	//*  46   87:goto            2
	//   47   90:return          
	}

	private void updateAnnotationReferences(PdfObject pdfobject)
	{
		if(pdfobject.isArray())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #698 <Method boolean PdfObject.isArray()>
	//*   2    4:ifeq            140
		{
			pdfobject = ((PdfObject) ((PdfArray)pdfobject));
	//    3    7:aload_1         
	//    4    8:checkcast       #474 <Class PdfArray>
	//    5   11:astore_1        
			int i = 0;
	//    6   12:iconst_0        
	//    7   13:istore_2        
			while(i < ((PdfArray) (pdfobject)).size()) 
	//*   8   14:iload_2         
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #475 <Method int PdfArray.size()>
	//*  11   19:icmpge          319
			{
				Object obj = ((Object) (((PdfArray) (pdfobject)).getPdfObject(i)));
	//   12   22:aload_1         
	//   13   23:iload_2         
	//   14   24:invokevirtual   #811 <Method PdfObject PdfArray.getPdfObject(int)>
	//   15   27:astore_3        
				if(obj != null && ((PdfObject) (obj)).type() == 0)
	//*  16   28:aload_3         
	//*  17   29:ifnull          132
	//*  18   32:aload_3         
	//*  19   33:invokevirtual   #778 <Method int PdfObject.type()>
	//*  20   36:ifne            132
				{
					obj = ((Object) ((PdfIndirectObject)unmergedIndirectRefsMap.get(((Object) (new RefKey((PdfIndirectReference)obj))))));
	//   21   39:aload_0         
	//   22   40:getfield        #902 <Field HashMap unmergedIndirectRefsMap>
	//   23   43:new             #682 <Class RefKey>
	//   24   46:dup             
	//   25   47:aload_3         
	//   26   48:checkcast       #713 <Class PdfIndirectReference>
	//   27   51:invokespecial   #688 <Method void RefKey(PdfIndirectReference)>
	//   28   54:invokevirtual   #472 <Method Object HashMap.get(Object)>
	//   29   57:checkcast       #422 <Class PdfIndirectObject>
	//   30   60:astore_3        
					if(obj != null && ((PdfIndirectObject) (obj)).object.isDictionary())
	//*  31   61:aload_3         
	//*  32   62:ifnull          125
	//*  33   65:aload_3         
	//*  34   66:getfield        #693 <Field PdfObject PdfIndirectObject.object>
	//*  35   69:invokevirtual   #701 <Method boolean PdfObject.isDictionary()>
	//*  36   72:ifeq            125
					{
						obj = ((Object) (((PdfDictionary)((PdfIndirectObject) (obj)).object).getAsNumber(annotId)));
	//   37   75:aload_3         
	//   38   76:getfield        #693 <Field PdfObject PdfIndirectObject.object>
	//   39   79:checkcast       #331 <Class PdfDictionary>
	//   40   82:getstatic       #123 <Field PdfName annotId>
	//   41   85:invokevirtual   #838 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//   42   88:astore_3        
						if(obj != null)
	//*  43   89:aload_3         
	//*  44   90:ifnull          125
						{
							obj = ((Object) ((PdfIndirectObject)mergedMap.get(((Object) (Integer.valueOf(((PdfNumber) (obj)).intValue()))))));
	//   45   93:aload_0         
	//   46   94:getfield        #904 <Field HashMap mergedMap>
	//   47   97:aload_3         
	//   48   98:invokevirtual   #466 <Method int PdfNumber.intValue()>
	//   49  101:invokestatic    #135 <Method Integer Integer.valueOf(int)>
	//   50  104:invokevirtual   #472 <Method Object HashMap.get(Object)>
	//   51  107:checkcast       #422 <Class PdfIndirectObject>
	//   52  110:astore_3        
							if(obj != null)
	//*  53  111:aload_3         
	//*  54  112:ifnull          125
								((PdfArray) (pdfobject)).set(i, ((PdfObject) (((PdfIndirectObject) (obj)).getIndirectReference())));
	//   55  115:aload_1         
	//   56  116:iload_2         
	//   57  117:aload_3         
	//   58  118:invokevirtual   #426 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//   59  121:invokevirtual   #892 <Method PdfObject PdfArray.set(int, PdfObject)>
	//   60  124:pop             
						}
					}
				} else
	//*  61  125:iload_2         
	//*  62  126:iconst_1        
	//*  63  127:iadd            
	//*  64  128:istore_2        
	//*  65  129:goto            14
				{
					updateAnnotationReferences(((PdfObject) (obj)));
	//   66  132:aload_0         
	//   67  133:aload_3         
	//   68  134:invokespecial   #906 <Method void updateAnnotationReferences(PdfObject)>
				}
				i++;
			}
		} else
	//*  69  137:goto            125
		if(pdfobject.isDictionary() || pdfobject.isStream())
	//*  70  140:aload_1         
	//*  71  141:invokevirtual   #701 <Method boolean PdfObject.isDictionary()>
	//*  72  144:ifne            154
	//*  73  147:aload_1         
	//*  74  148:invokevirtual   #704 <Method boolean PdfObject.isStream()>
	//*  75  151:ifeq            319
		{
			pdfobject = ((PdfObject) ((PdfDictionary)pdfobject));
	//   76  154:aload_1         
	//   77  155:checkcast       #331 <Class PdfDictionary>
	//   78  158:astore_1        
			Iterator iterator = ((PdfDictionary) (pdfobject)).getKeys().iterator();
	//   79  159:aload_1         
	//   80  160:invokevirtual   #769 <Method Set PdfDictionary.getKeys()>
	//   81  163:invokeinterface #504 <Method Iterator Set.iterator()>
	//   82  168:astore_3        
			do
			{
				if(!iterator.hasNext())
					break;
	//   83  169:aload_3         
	//   84  170:invokeinterface #365 <Method boolean Iterator.hasNext()>
	//   85  175:ifeq            319
				PdfName pdfname = (PdfName)iterator.next();
	//   86  178:aload_3         
	//   87  179:invokeinterface #369 <Method Object Iterator.next()>
	//   88  184:checkcast       #115 <Class PdfName>
	//   89  187:astore          4
				Object obj1 = ((Object) (((PdfDictionary) (pdfobject)).get(pdfname)));
	//   90  189:aload_1         
	//   91  190:aload           4
	//   92  192:invokevirtual   #570 <Method PdfObject PdfDictionary.get(PdfName)>
	//   93  195:astore          5
				if(obj1 != null && ((PdfObject) (obj1)).type() == 0)
	//*  94  197:aload           5
	//*  95  199:ifnull          310
	//*  96  202:aload           5
	//*  97  204:invokevirtual   #778 <Method int PdfObject.type()>
	//*  98  207:ifne            310
				{
					obj1 = ((Object) ((PdfIndirectObject)unmergedIndirectRefsMap.get(((Object) (new RefKey((PdfIndirectReference)obj1))))));
	//   99  210:aload_0         
	//  100  211:getfield        #902 <Field HashMap unmergedIndirectRefsMap>
	//  101  214:new             #682 <Class RefKey>
	//  102  217:dup             
	//  103  218:aload           5
	//  104  220:checkcast       #713 <Class PdfIndirectReference>
	//  105  223:invokespecial   #688 <Method void RefKey(PdfIndirectReference)>
	//  106  226:invokevirtual   #472 <Method Object HashMap.get(Object)>
	//  107  229:checkcast       #422 <Class PdfIndirectObject>
	//  108  232:astore          5
					if(obj1 != null && ((PdfIndirectObject) (obj1)).object.isDictionary())
	//* 109  234:aload           5
	//* 110  236:ifnull          169
	//* 111  239:aload           5
	//* 112  241:getfield        #693 <Field PdfObject PdfIndirectObject.object>
	//* 113  244:invokevirtual   #701 <Method boolean PdfObject.isDictionary()>
	//* 114  247:ifeq            169
					{
						obj1 = ((Object) (((PdfDictionary)((PdfIndirectObject) (obj1)).object).getAsNumber(annotId)));
	//  115  250:aload           5
	//  116  252:getfield        #693 <Field PdfObject PdfIndirectObject.object>
	//  117  255:checkcast       #331 <Class PdfDictionary>
	//  118  258:getstatic       #123 <Field PdfName annotId>
	//  119  261:invokevirtual   #838 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//  120  264:astore          5
						if(obj1 != null)
	//* 121  266:aload           5
	//* 122  268:ifnull          169
						{
							obj1 = ((Object) ((PdfIndirectObject)mergedMap.get(((Object) (Integer.valueOf(((PdfNumber) (obj1)).intValue()))))));
	//  123  271:aload_0         
	//  124  272:getfield        #904 <Field HashMap mergedMap>
	//  125  275:aload           5
	//  126  277:invokevirtual   #466 <Method int PdfNumber.intValue()>
	//  127  280:invokestatic    #135 <Method Integer Integer.valueOf(int)>
	//  128  283:invokevirtual   #472 <Method Object HashMap.get(Object)>
	//  129  286:checkcast       #422 <Class PdfIndirectObject>
	//  130  289:astore          5
							if(obj1 != null)
	//* 131  291:aload           5
	//* 132  293:ifnull          169
								((PdfDictionary) (pdfobject)).put(pdfname, ((PdfObject) (((PdfIndirectObject) (obj1)).getIndirectReference())));
	//  133  296:aload_1         
	//  134  297:aload           4
	//  135  299:aload           5
	//  136  301:invokevirtual   #426 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  137  304:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
						}
					}
				} else
	//* 138  307:goto            169
				{
					updateAnnotationReferences(((PdfObject) (obj1)));
	//  139  310:aload_0         
	//  140  311:aload           5
	//  141  313:invokespecial   #906 <Method void updateAnnotationReferences(PdfObject)>
				}
			} while(true);
	//  142  316:goto            169
		}
	//  143  319:return          
	}

	private void updateCalculationOrder(PdfReader pdfreader)
	{
		Object obj = ((Object) (pdfreader.getCatalog().getAsDict(PdfName.ACROFORM)));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #911 <Method PdfDictionary PdfReader.getCatalog()>
	//    2    4:getstatic       #335 <Field PdfName PdfName.ACROFORM>
	//    3    7:invokevirtual   #388 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//    4   10:astore_3        
		if(obj != null)
	//*   5   11:aload_3         
	//*   6   12:ifnonnull       16
	//*   7   15:return          
	//*   8   16:aload_3         
	//*   9   17:getstatic       #755 <Field PdfName PdfName.CO>
	//*  10   20:invokevirtual   #612 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//*  11   23:astore_3        
			if((obj = ((Object) (((PdfDictionary) (obj)).getAsArray(PdfName.CO)))) != null && ((PdfArray) (obj)).size() != 0)
	//*  12   24:aload_3         
	//*  13   25:ifnull          15
	//*  14   28:aload_3         
	//*  15   29:invokevirtual   #475 <Method int PdfArray.size()>
	//*  16   32:ifeq            15
			{
				AcroFields acrofields = pdfreader.getAcroFields();
	//   17   35:aload_1         
	//   18   36:invokevirtual   #915 <Method AcroFields PdfReader.getAcroFields()>
	//   19   39:astore          4
				int i = 0;
	//   20   41:iconst_0        
	//   21   42:istore_2        
				while(i < ((PdfArray) (obj)).size()) 
	//*  22   43:iload_2         
	//*  23   44:aload_3         
	//*  24   45:invokevirtual   #475 <Method int PdfArray.size()>
	//*  25   48:icmpge          15
				{
					Object obj1 = ((Object) (((PdfArray) (obj)).getPdfObject(i)));
	//   26   51:aload_3         
	//   27   52:iload_2         
	//   28   53:invokevirtual   #811 <Method PdfObject PdfArray.getPdfObject(int)>
	//   29   56:astore          5
					if(obj1 != null && ((PdfObject) (obj1)).isIndirect())
	//*  30   58:aload           5
	//*  31   60:ifnull          71
	//*  32   63:aload           5
	//*  33   65:invokevirtual   #895 <Method boolean PdfObject.isIndirect()>
	//*  34   68:ifne            78
	//*  35   71:iload_2         
	//*  36   72:iconst_1        
	//*  37   73:iadd            
	//*  38   74:istore_2        
	//*  39   75:goto            43
					{
						obj1 = ((Object) (getCOName(pdfreader, (PRIndirectReference)obj1)));
	//   40   78:aload_1         
	//   41   79:aload           5
	//   42   81:checkcast       #829 <Class PRIndirectReference>
	//   43   84:invokestatic    #917 <Method String getCOName(PdfReader, PRIndirectReference)>
	//   44   87:astore          5
						if(acrofields.getFieldItem(((String) (obj1))) != null)
	//*  45   89:aload           4
	//*  46   91:aload           5
	//*  47   93:invokevirtual   #921 <Method AcroFields$Item AcroFields.getFieldItem(String)>
	//*  48   96:ifnull          71
						{
							obj1 = ((Object) ((new StringBuilder()).append(".").append(((String) (obj1))).toString()));
	//   49   99:new             #530 <Class StringBuilder>
	//   50  102:dup             
	//   51  103:invokespecial   #531 <Method void StringBuilder()>
	//   52  106:ldc2            #537 <String ".">
	//   53  109:invokevirtual   #535 <Method StringBuilder StringBuilder.append(String)>
	//   54  112:aload           5
	//   55  114:invokevirtual   #535 <Method StringBuilder StringBuilder.append(String)>
	//   56  117:invokevirtual   #541 <Method String StringBuilder.toString()>
	//   57  120:astore          5
							if(!calculationOrder.contains(obj1))
	//*  58  122:aload_0         
	//*  59  123:getfield        #543 <Field ArrayList calculationOrder>
	//*  60  126:aload           5
	//*  61  128:invokevirtual   #922 <Method boolean ArrayList.contains(Object)>
	//*  62  131:ifne            71
								calculationOrder.add(obj1);
	//   63  134:aload_0         
	//   64  135:getfield        #543 <Field ArrayList calculationOrder>
	//   65  138:aload           5
	//   66  140:invokevirtual   #476 <Method boolean ArrayList.add(Object)>
	//   67  143:pop             
						}
					}
					i++;
				}
			}
	//*  68  144:goto            71
	}

	private void updateReferences(PdfObject pdfobject)
	{
		if(pdfobject.isDictionary() || pdfobject.isStream())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #701 <Method boolean PdfObject.isDictionary()>
	//*   2    4:ifne            14
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #704 <Method boolean PdfObject.isStream()>
	//*   5   11:ifeq            135
		{
			pdfobject = ((PdfObject) ((PdfDictionary)pdfobject));
	//    6   14:aload_1         
	//    7   15:checkcast       #331 <Class PdfDictionary>
	//    8   18:astore_1        
			Iterator iterator = ((PdfDictionary) (pdfobject)).getKeys().iterator();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #769 <Method Set PdfDictionary.getKeys()>
	//   11   23:invokeinterface #504 <Method Iterator Set.iterator()>
	//   12   28:astore_3        
			do
			{
				if(!iterator.hasNext())
					break;
	//   13   29:aload_3         
	//   14   30:invokeinterface #365 <Method boolean Iterator.hasNext()>
	//   15   35:ifeq            238
				PdfName pdfname = (PdfName)iterator.next();
	//   16   38:aload_3         
	//   17   39:invokeinterface #369 <Method Object Iterator.next()>
	//   18   44:checkcast       #115 <Class PdfName>
	//   19   47:astore          4
				Object obj1 = ((Object) (((PdfDictionary) (pdfobject)).get(pdfname)));
	//   20   49:aload_1         
	//   21   50:aload           4
	//   22   52:invokevirtual   #570 <Method PdfObject PdfDictionary.get(PdfName)>
	//   23   55:astore          5
				if(((PdfObject) (obj1)).isIndirect())
	//*  24   57:aload           5
	//*  25   59:invokevirtual   #895 <Method boolean PdfObject.isIndirect()>
	//*  26   62:ifeq            126
				{
					PdfReader pdfreader1 = ((PRIndirectReference)obj1).getReader();
	//   27   65:aload           5
	//   28   67:checkcast       #829 <Class PRIndirectReference>
	//   29   70:invokevirtual   #927 <Method PdfReader PRIndirectReference.getReader()>
	//   30   73:astore          6
					obj1 = ((Object) ((IndirectReferences)((HashMap)indirectMap.get(((Object) (pdfreader1)))).get(((Object) (new RefKey((PRIndirectReference)obj1))))));
	//   31   75:aload_0         
	//   32   76:getfield        #304 <Field HashMap indirectMap>
	//   33   79:aload           6
	//   34   81:invokevirtual   #472 <Method Object HashMap.get(Object)>
	//   35   84:checkcast       #283 <Class HashMap>
	//   36   87:new             #682 <Class RefKey>
	//   37   90:dup             
	//   38   91:aload           5
	//   39   93:checkcast       #829 <Class PRIndirectReference>
	//   40   96:invokespecial   #930 <Method void RefKey(PRIndirectReference)>
	//   41   99:invokevirtual   #472 <Method Object HashMap.get(Object)>
	//   42  102:checkcast       #9   <Class PdfCopy$IndirectReferences>
	//   43  105:astore          5
					if(obj1 != null)
	//*  44  107:aload           5
	//*  45  109:ifnull          29
						((PdfDictionary) (pdfobject)).put(pdfname, ((PdfObject) (((IndirectReferences) (obj1)).getRef())));
	//   46  112:aload_1         
	//   47  113:aload           4
	//   48  115:aload           5
	//   49  117:invokevirtual   #933 <Method PdfIndirectReference PdfCopy$IndirectReferences.getRef()>
	//   50  120:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
				} else
	//*  51  123:goto            29
				{
					updateReferences(((PdfObject) (obj1)));
	//   52  126:aload_0         
	//   53  127:aload           5
	//   54  129:invokespecial   #935 <Method void updateReferences(PdfObject)>
				}
			} while(true);
	//   55  132:goto            29
		} else
		if(pdfobject.isArray())
	//*  56  135:aload_1         
	//*  57  136:invokevirtual   #698 <Method boolean PdfObject.isArray()>
	//*  58  139:ifeq            238
		{
			pdfobject = ((PdfObject) ((PdfArray)pdfobject));
	//   59  142:aload_1         
	//   60  143:checkcast       #474 <Class PdfArray>
	//   61  146:astore_1        
			int i = 0;
	//   62  147:iconst_0        
	//   63  148:istore_2        
			while(i < ((PdfArray) (pdfobject)).size()) 
	//*  64  149:iload_2         
	//*  65  150:aload_1         
	//*  66  151:invokevirtual   #475 <Method int PdfArray.size()>
	//*  67  154:icmpge          238
			{
				Object obj = ((Object) (((PdfArray) (pdfobject)).getPdfObject(i)));
	//   68  157:aload_1         
	//   69  158:iload_2         
	//   70  159:invokevirtual   #811 <Method PdfObject PdfArray.getPdfObject(int)>
	//   71  162:astore_3        
				if(((PdfObject) (obj)).isIndirect())
	//*  72  163:aload_3         
	//*  73  164:invokevirtual   #895 <Method boolean PdfObject.isIndirect()>
	//*  74  167:ifeq            230
				{
					PdfReader pdfreader = ((PRIndirectReference)obj).getReader();
	//   75  170:aload_3         
	//   76  171:checkcast       #829 <Class PRIndirectReference>
	//   77  174:invokevirtual   #927 <Method PdfReader PRIndirectReference.getReader()>
	//   78  177:astore          4
					obj = ((Object) ((IndirectReferences)((HashMap)indirectMap.get(((Object) (pdfreader)))).get(((Object) (new RefKey((PRIndirectReference)obj))))));
	//   79  179:aload_0         
	//   80  180:getfield        #304 <Field HashMap indirectMap>
	//   81  183:aload           4
	//   82  185:invokevirtual   #472 <Method Object HashMap.get(Object)>
	//   83  188:checkcast       #283 <Class HashMap>
	//   84  191:new             #682 <Class RefKey>
	//   85  194:dup             
	//   86  195:aload_3         
	//   87  196:checkcast       #829 <Class PRIndirectReference>
	//   88  199:invokespecial   #930 <Method void RefKey(PRIndirectReference)>
	//   89  202:invokevirtual   #472 <Method Object HashMap.get(Object)>
	//   90  205:checkcast       #9   <Class PdfCopy$IndirectReferences>
	//   91  208:astore_3        
					if(obj != null)
	//*  92  209:aload_3         
	//*  93  210:ifnull          223
						((PdfArray) (pdfobject)).set(i, ((PdfObject) (((IndirectReferences) (obj)).getRef())));
	//   94  213:aload_1         
	//   95  214:iload_2         
	//   96  215:aload_3         
	//   97  216:invokevirtual   #933 <Method PdfIndirectReference PdfCopy$IndirectReferences.getRef()>
	//   98  219:invokevirtual   #892 <Method PdfObject PdfArray.set(int, PdfObject)>
	//   99  222:pop             
				} else
	//* 100  223:iload_2         
	//* 101  224:iconst_1        
	//* 102  225:iadd            
	//* 103  226:istore_2        
	//* 104  227:goto            149
				{
					updateReferences(((PdfObject) (obj)));
	//  105  230:aload_0         
	//  106  231:aload_3         
	//  107  232:invokespecial   #935 <Method void updateReferences(PdfObject)>
				}
				i++;
			}
		}
	//* 108  235:goto            223
	//  109  238:return          
	}

	private void writeObjectToBody(PdfIndirectObject pdfindirectobject)
		throws IOException
	{
		boolean flag1;
label0:
		{
			boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
			boolean flag2 = false;
	//    2    2:iconst_0        
	//    3    3:istore          4
			flag1 = flag;
	//    4    5:iload_2         
	//    5    6:istore_3        
			if(!mergeFields)
				break label0;
	//    6    7:aload_0         
	//    7    8:getfield        #275 <Field boolean mergeFields>
	//    8   11:ifeq            227
			updateAnnotationReferences(pdfindirectobject.object);
	//    9   14:aload_0         
	//   10   15:aload_1         
	//   11   16:getfield        #693 <Field PdfObject PdfIndirectObject.object>
	//   12   19:invokespecial   #906 <Method void updateAnnotationReferences(PdfObject)>
			if(!pdfindirectobject.object.isDictionary())
	//*  13   22:aload_1         
	//*  14   23:getfield        #693 <Field PdfObject PdfIndirectObject.object>
	//*  15   26:invokevirtual   #701 <Method boolean PdfObject.isDictionary()>
	//*  16   29:ifne            44
			{
				flag1 = flag;
	//   17   32:iload_2         
	//   18   33:istore_3        
				if(!pdfindirectobject.object.isStream())
					break label0;
	//   19   34:aload_1         
	//   20   35:getfield        #693 <Field PdfObject PdfIndirectObject.object>
	//   21   38:invokevirtual   #704 <Method boolean PdfObject.isStream()>
	//   22   41:ifeq            227
			}
			PdfDictionary pdfdictionary = (PdfDictionary)pdfindirectobject.object;
	//   23   44:aload_1         
	//   24   45:getfield        #693 <Field PdfObject PdfIndirectObject.object>
	//   25   48:checkcast       #331 <Class PdfDictionary>
	//   26   51:astore          5
			flag = flag2;
	//   27   53:iload           4
	//   28   55:istore_2        
			if(unmergedIndirectRefsMap.containsKey(((Object) (new RefKey(pdfindirectobject.number, pdfindirectobject.generation)))))
	//*  29   56:aload_0         
	//*  30   57:getfield        #902 <Field HashMap unmergedIndirectRefsMap>
	//*  31   60:new             #682 <Class RefKey>
	//*  32   63:dup             
	//*  33   64:aload_1         
	//*  34   65:getfield        #940 <Field int PdfIndirectObject.number>
	//*  35   68:aload_1         
	//*  36   69:getfield        #943 <Field int PdfIndirectObject.generation>
	//*  37   72:invokespecial   #945 <Method void RefKey(int, int)>
	//*  38   75:invokevirtual   #595 <Method boolean HashMap.containsKey(Object)>
	//*  39   78:ifeq            122
			{
				PdfNumber pdfnumber1 = pdfdictionary.getAsNumber(annotId);
	//   40   81:aload           5
	//   41   83:getstatic       #123 <Field PdfName annotId>
	//   42   86:invokevirtual   #838 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//   43   89:astore          6
				flag = flag2;
	//   44   91:iload           4
	//   45   93:istore_2        
				if(pdfnumber1 != null)
	//*  46   94:aload           6
	//*  47   96:ifnull          122
				{
					flag = flag2;
	//   48   99:iload           4
	//   49  101:istore_2        
					if(mergedMap.containsKey(((Object) (Integer.valueOf(pdfnumber1.intValue())))))
	//*  50  102:aload_0         
	//*  51  103:getfield        #904 <Field HashMap mergedMap>
	//*  52  106:aload           6
	//*  53  108:invokevirtual   #466 <Method int PdfNumber.intValue()>
	//*  54  111:invokestatic    #135 <Method Integer Integer.valueOf(int)>
	//*  55  114:invokevirtual   #595 <Method boolean HashMap.containsKey(Object)>
	//*  56  117:ifeq            122
						flag = true;
	//   57  120:iconst_1        
	//   58  121:istore_2        
				}
			}
			flag1 = flag;
	//   59  122:iload_2         
	//   60  123:istore_3        
			if(mergedSet.contains(((Object) (pdfindirectobject))))
	//*  61  124:aload_0         
	//*  62  125:getfield        #947 <Field HashSet mergedSet>
	//*  63  128:aload_1         
	//*  64  129:invokevirtual   #666 <Method boolean HashSet.contains(Object)>
	//*  65  132:ifeq            227
			{
				Object obj = ((Object) (pdfdictionary.getAsNumber(annotId)));
	//   66  135:aload           5
	//   67  137:getstatic       #123 <Field PdfName annotId>
	//   68  140:invokevirtual   #838 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//   69  143:astore          6
				flag1 = flag;
	//   70  145:iload_2         
	//   71  146:istore_3        
				if(obj != null)
	//*  72  147:aload           6
	//*  73  149:ifnull          227
				{
					obj = ((Object) ((PdfIndirectObject)unmergedMap.get(((Object) (Integer.valueOf(((PdfNumber) (obj)).intValue()))))));
	//   74  152:aload_0         
	//   75  153:getfield        #949 <Field HashMap unmergedMap>
	//   76  156:aload           6
	//   77  158:invokevirtual   #466 <Method int PdfNumber.intValue()>
	//   78  161:invokestatic    #135 <Method Integer Integer.valueOf(int)>
	//   79  164:invokevirtual   #472 <Method Object HashMap.get(Object)>
	//   80  167:checkcast       #422 <Class PdfIndirectObject>
	//   81  170:astore          6
					flag1 = flag;
	//   82  172:iload_2         
	//   83  173:istore_3        
					if(obj != null)
	//*  84  174:aload           6
	//*  85  176:ifnull          227
					{
						flag1 = flag;
	//   86  179:iload_2         
	//   87  180:istore_3        
						if(((PdfIndirectObject) (obj)).object.isDictionary())
	//*  88  181:aload           6
	//*  89  183:getfield        #693 <Field PdfObject PdfIndirectObject.object>
	//*  90  186:invokevirtual   #701 <Method boolean PdfObject.isDictionary()>
	//*  91  189:ifeq            227
						{
							obj = ((Object) (((PdfDictionary)((PdfIndirectObject) (obj)).object).getAsNumber(PdfName.STRUCTPARENT)));
	//   92  192:aload           6
	//   93  194:getfield        #693 <Field PdfObject PdfIndirectObject.object>
	//   94  197:checkcast       #331 <Class PdfDictionary>
	//   95  200:getstatic       #188 <Field PdfName PdfName.STRUCTPARENT>
	//   96  203:invokevirtual   #838 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//   97  206:astore          6
							flag1 = flag;
	//   98  208:iload_2         
	//   99  209:istore_3        
							if(obj != null)
	//* 100  210:aload           6
	//* 101  212:ifnull          227
							{
								pdfdictionary.put(PdfName.STRUCTPARENT, ((PdfObject) (obj)));
	//  102  215:aload           5
	//  103  217:getstatic       #188 <Field PdfName PdfName.STRUCTPARENT>
	//  104  220:aload           6
	//  105  222:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
								flag1 = flag;
	//  106  225:iload_2         
	//  107  226:istore_3        
							}
						}
					}
				}
			}
		}
		if(!flag1)
	//* 108  227:iload_3         
	//* 109  228:ifne            354
		{
			Object obj1 = null;
	//  110  231:aconst_null     
	//  111  232:astore          7
			Object obj2 = null;
	//  112  234:aconst_null     
	//  113  235:astore          8
			PdfNumber pdfnumber = ((PdfNumber) (obj2));
	//  114  237:aload           8
	//  115  239:astore          5
			PdfDictionary pdfdictionary1 = ((PdfDictionary) (obj1));
	//  116  241:aload           7
	//  117  243:astore          6
			if(mergeFields)
	//* 118  245:aload_0         
	//* 119  246:getfield        #275 <Field boolean mergeFields>
	//* 120  249:ifeq            318
			{
				pdfnumber = ((PdfNumber) (obj2));
	//  121  252:aload           8
	//  122  254:astore          5
				pdfdictionary1 = ((PdfDictionary) (obj1));
	//  123  256:aload           7
	//  124  258:astore          6
				if(pdfindirectobject.object.isDictionary())
	//* 125  260:aload_1         
	//* 126  261:getfield        #693 <Field PdfObject PdfIndirectObject.object>
	//* 127  264:invokevirtual   #701 <Method boolean PdfObject.isDictionary()>
	//* 128  267:ifeq            318
				{
					PdfDictionary pdfdictionary2 = (PdfDictionary)pdfindirectobject.object;
	//  129  270:aload_1         
	//  130  271:getfield        #693 <Field PdfObject PdfIndirectObject.object>
	//  131  274:checkcast       #331 <Class PdfDictionary>
	//  132  277:astore          7
					PdfNumber pdfnumber2 = pdfdictionary2.getAsNumber(annotId);
	//  133  279:aload           7
	//  134  281:getstatic       #123 <Field PdfName annotId>
	//  135  284:invokevirtual   #838 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//  136  287:astore          8
					pdfnumber = pdfnumber2;
	//  137  289:aload           8
	//  138  291:astore          5
					pdfdictionary1 = pdfdictionary2;
	//  139  293:aload           7
	//  140  295:astore          6
					if(pdfnumber2 != null)
	//* 141  297:aload           8
	//* 142  299:ifnull          318
					{
						pdfdictionary2.remove(annotId);
	//  143  302:aload           7
	//  144  304:getstatic       #123 <Field PdfName annotId>
	//  145  307:invokevirtual   #573 <Method void PdfDictionary.remove(PdfName)>
						pdfdictionary1 = pdfdictionary2;
	//  146  310:aload           7
	//  147  312:astore          6
						pdfnumber = pdfnumber2;
	//  148  314:aload           8
	//  149  316:astore          5
					}
				}
			}
			body.add(pdfindirectobject.object, pdfindirectobject.number, pdfindirectobject.generation, true);
	//  150  318:aload_0         
	//  151  319:getfield        #953 <Field PdfWriter$PdfBody body>
	//  152  322:aload_1         
	//  153  323:getfield        #693 <Field PdfObject PdfIndirectObject.object>
	//  154  326:aload_1         
	//  155  327:getfield        #940 <Field int PdfIndirectObject.number>
	//  156  330:aload_1         
	//  157  331:getfield        #943 <Field int PdfIndirectObject.generation>
	//  158  334:iconst_1        
	//  159  335:invokevirtual   #958 <Method PdfIndirectObject PdfWriter$PdfBody.add(PdfObject, int, int, boolean)>
	//  160  338:pop             
			if(pdfnumber != null)
	//* 161  339:aload           5
	//* 162  341:ifnull          354
				pdfdictionary1.put(annotId, ((PdfObject) (pdfnumber)));
	//  163  344:aload           6
	//  164  346:getstatic       #123 <Field PdfName annotId>
	//  165  349:aload           5
	//  166  351:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}
	//  167  354:return          
	}

	public PdfIndirectReference add(PdfOutline pdfoutline)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	PdfIndirectReference add(PdfPage pdfpage, PdfContents pdfcontents)
		throws PdfException
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void addAnnotation(PdfAnnotation pdfannotation)
	{
	//    0    0:return          
	}

	public void addDocument(PdfReader pdfreader)
		throws DocumentException, IOException
	{
		if(!document.isOpen())
	//*   0    0:aload_0         
	//*   1    1:getfield        #969 <Field Document document>
	//*   2    4:invokevirtual   #972 <Method boolean Document.isOpen()>
	//*   3    7:ifne            28
			throw new DocumentException(MessageLocalization.getComposedMessage("the.document.is.not.open.yet.you.can.only.add.meta.information", new Object[0]));
	//    4   10:new             #257 <Class DocumentException>
	//    5   13:dup             
	//    6   14:ldc2            #974 <String "the.document.is.not.open.yet.you.can.only.add.meta.information">
	//    7   17:iconst_0        
	//    8   18:anewarray       Object[]
	//    9   21:invokestatic    #980 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   10   24:invokespecial   #981 <Method void DocumentException(String)>
	//   11   27:athrow          
		if(indirectMap.containsKey(((Object) (pdfreader))))
	//*  12   28:aload_0         
	//*  13   29:getfield        #304 <Field HashMap indirectMap>
	//*  14   32:aload_1         
	//*  15   33:invokevirtual   #595 <Method boolean HashMap.containsKey(Object)>
	//*  16   36:ifeq            64
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("document.1.has.already.been.added", new Object[] {
				((Object) (pdfreader)).toString()
			}));
	//   17   39:new             #983 <Class IllegalArgumentException>
	//   18   42:dup             
	//   19   43:ldc2            #985 <String "document.1.has.already.been.added">
	//   20   46:iconst_1        
	//   21   47:anewarray       Object[]
	//   22   50:dup             
	//   23   51:iconst_0        
	//   24   52:aload_1         
	//   25   53:invokevirtual   #986 <Method String Object.toString()>
	//   26   56:aastore         
	//   27   57:invokestatic    #980 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   28   60:invokespecial   #987 <Method void IllegalArgumentException(String)>
	//   29   63:athrow          
		if(!pdfreader.isOpenedWithFullPermissions())
	//*  30   64:aload_1         
	//*  31   65:invokevirtual   #990 <Method boolean PdfReader.isOpenedWithFullPermissions()>
	//*  32   68:ifne            89
			throw new BadPasswordException(MessageLocalization.getComposedMessage("pdfreader.not.opened.with.owner.password", new Object[0]));
	//   33   71:new             #992 <Class BadPasswordException>
	//   34   74:dup             
	//   35   75:ldc2            #994 <String "pdfreader.not.opened.with.owner.password">
	//   36   78:iconst_0        
	//   37   79:anewarray       Object[]
	//   38   82:invokestatic    #980 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   39   85:invokespecial   #995 <Method void BadPasswordException(String)>
	//   40   88:athrow          
		boolean flag;
		if(mergeFields)
	//*  41   89:aload_0         
	//*  42   90:getfield        #275 <Field boolean mergeFields>
	//*  43   93:ifeq            264
		{
			pdfreader.consolidateNamedDestinations();
	//   44   96:aload_1         
	//   45   97:invokevirtual   #998 <Method void PdfReader.consolidateNamedDestinations()>
			pdfreader.shuffleSubsetNames();
	//   46  100:aload_1         
	//   47  101:invokevirtual   #1001 <Method int PdfReader.shuffleSubsetNames()>
	//   48  104:pop             
			for(int i = 1; i <= pdfreader.getNumberOfPages(); i++)
	//*  49  105:iconst_1        
	//*  50  106:istore_2        
	//*  51  107:iload_2         
	//*  52  108:aload_1         
	//*  53  109:invokevirtual   #878 <Method int PdfReader.getNumberOfPages()>
	//*  54  112:icmpgt          224
			{
				Object obj = ((Object) (pdfreader.getPageNRelease(i)));
	//   55  115:aload_1         
	//   56  116:iload_2         
	//   57  117:invokevirtual   #1004 <Method PdfDictionary PdfReader.getPageNRelease(int)>
	//   58  120:astore          6
				if(obj == null || !((PdfDictionary) (obj)).contains(PdfName.ANNOTS))
					continue;
	//   59  122:aload           6
	//   60  124:ifnull          217
	//   61  127:aload           6
	//   62  129:getstatic       #1007 <Field PdfName PdfName.ANNOTS>
	//   63  132:invokevirtual   #395 <Method boolean PdfDictionary.contains(PdfName)>
	//   64  135:ifeq            217
				obj = ((Object) (((PdfDictionary) (obj)).getAsArray(PdfName.ANNOTS)));
	//   65  138:aload           6
	//   66  140:getstatic       #1007 <Field PdfName PdfName.ANNOTS>
	//   67  143:invokevirtual   #612 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   68  146:astore          6
				if(obj == null)
					continue;
	//   69  148:aload           6
	//   70  150:ifnull          217
				for(int k = 0; k < ((PdfArray) (obj)).size(); k++)
	//*  71  153:iconst_0        
	//*  72  154:istore_3        
	//*  73  155:iload_3         
	//*  74  156:aload           6
	//*  75  158:invokevirtual   #475 <Method int PdfArray.size()>
	//*  76  161:icmpge          217
				{
					PdfDictionary pdfdictionary = ((PdfArray) (obj)).getAsDict(k);
	//   77  164:aload           6
	//   78  166:iload_3         
	//   79  167:invokevirtual   #1009 <Method PdfDictionary PdfArray.getAsDict(int)>
	//   80  170:astore          7
					if(pdfdictionary != null)
	//*  81  172:aload           7
	//*  82  174:ifnull          210
					{
						PdfName pdfname = annotId;
	//   83  177:getstatic       #123 <Field PdfName annotId>
	//   84  180:astore          8
						int l = annotIdCnt + 1;
	//   85  182:getstatic       #125 <Field int annotIdCnt>
	//   86  185:iconst_1        
	//   87  186:iadd            
	//   88  187:istore          4
						annotIdCnt = l;
	//   89  189:iload           4
	//   90  191:putstatic       #125 <Field int annotIdCnt>
						pdfdictionary.put(pdfname, ((PdfObject) (new PdfNumber(l))));
	//   91  194:aload           7
	//   92  196:aload           8
	//   93  198:new             #465 <Class PdfNumber>
	//   94  201:dup             
	//   95  202:iload           4
	//   96  204:invokespecial   #752 <Method void PdfNumber(int)>
	//   97  207:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
					}
				}

	//   98  210:iload_3         
	//   99  211:iconst_1        
	//  100  212:iadd            
	//  101  213:istore_3        
			}

	//  102  214:goto            155
	//  103  217:iload_2         
	//  104  218:iconst_1        
	//  105  219:iadd            
	//  106  220:istore_2        
	//* 107  221:goto            107
			AcroFields acrofields = pdfreader.getAcroFields();
	//  108  224:aload_1         
	//  109  225:invokevirtual   #915 <Method AcroFields PdfReader.getAcroFields()>
	//  110  228:astore          6
			int j;
			if(!acrofields.isGenerateAppearances())
	//* 111  230:aload           6
	//* 112  232:invokevirtual   #1012 <Method boolean AcroFields.isGenerateAppearances()>
	//* 113  235:ifne            315
				j = 1;
	//  114  238:iconst_1        
	//  115  239:istore_2        
			else
	//* 116  240:iload_2         
	//* 117  241:ifeq            249
	//* 118  244:aload_0         
	//* 119  245:iconst_1        
	//* 120  246:putfield        #277 <Field boolean needAppearances>
	//* 121  249:aload_0         
	//* 122  250:getfield        #602 <Field ArrayList fields>
	//* 123  253:aload           6
	//* 124  255:invokevirtual   #476 <Method boolean ArrayList.add(Object)>
	//* 125  258:pop             
	//* 126  259:aload_0         
	//* 127  260:aload_1         
	//* 128  261:invokespecial   #1014 <Method void updateCalculationOrder(PdfReader)>
	//* 129  264:aload_0         
	//* 130  265:getfield        #1017 <Field boolean tagged>
	//* 131  268:ifeq            320
	//* 132  271:aload_1         
	//* 133  272:invokestatic    #1023 <Method boolean PdfStructTreeController.checkTagged(PdfReader)>
	//* 134  275:ifeq            320
	//* 135  278:iconst_1        
	//* 136  279:istore          5
	//* 137  281:aload_0         
	//* 138  282:iconst_1        
	//* 139  283:putfield        #279 <Field boolean mergeFieldsInternalCall>
	//* 140  286:iconst_1        
	//* 141  287:istore_2        
	//* 142  288:iload_2         
	//* 143  289:aload_1         
	//* 144  290:invokevirtual   #878 <Method int PdfReader.getNumberOfPages()>
	//* 145  293:icmpgt          326
	//* 146  296:aload_0         
	//* 147  297:aload_0         
	//* 148  298:aload_1         
	//* 149  299:iload_2         
	//* 150  300:iload           5
	//* 151  302:invokevirtual   #1027 <Method PdfImportedPage getImportedPage(PdfReader, int, boolean)>
	//* 152  305:invokevirtual   #1031 <Method void addPage(PdfImportedPage)>
	//* 153  308:iload_2         
	//* 154  309:iconst_1        
	//* 155  310:iadd            
	//* 156  311:istore_2        
	//* 157  312:goto            288
				j = 0;
	//  158  315:iconst_0        
	//  159  316:istore_2        
			if(j != 0)
				needAppearances = true;
			fields.add(((Object) (acrofields)));
			updateCalculationOrder(pdfreader);
		}
		if(tagged && PdfStructTreeController.checkTagged(pdfreader))
			flag = true;
		else
	//* 160  317:goto            240
			flag = false;
	//  161  320:iconst_0        
	//  162  321:istore          5
		mergeFieldsInternalCall = true;
		for(j = 1; j <= pdfreader.getNumberOfPages(); j++)
			addPage(getImportedPage(pdfreader, j, flag));

	//* 163  323:goto            281
		mergeFieldsInternalCall = false;
	//  164  326:aload_0         
	//  165  327:iconst_0        
	//  166  328:putfield        #279 <Field boolean mergeFieldsInternalCall>
	//  167  331:return          
	}

	public void addDocument(PdfReader pdfreader, List list)
		throws DocumentException, IOException
	{
		if(indirectMap.containsKey(((Object) (pdfreader))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #304 <Field HashMap indirectMap>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #595 <Method boolean HashMap.containsKey(Object)>
	//*   4    8:ifeq            36
		{
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("document.1.has.already.been.added", new Object[] {
				((Object) (pdfreader)).toString()
			}));
	//    5   11:new             #983 <Class IllegalArgumentException>
	//    6   14:dup             
	//    7   15:ldc2            #985 <String "document.1.has.already.been.added">
	//    8   18:iconst_1        
	//    9   19:anewarray       Object[]
	//   10   22:dup             
	//   11   23:iconst_0        
	//   12   24:aload_1         
	//   13   25:invokevirtual   #986 <Method String Object.toString()>
	//   14   28:aastore         
	//   15   29:invokestatic    #980 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   16   32:invokespecial   #987 <Method void IllegalArgumentException(String)>
	//   17   35:athrow          
		} else
		{
			pdfreader.selectPages(list, false);
	//   18   36:aload_1         
	//   19   37:aload_2         
	//   20   38:iconst_0        
	//   21   39:invokevirtual   #1036 <Method void PdfReader.selectPages(List, boolean)>
			addDocument(pdfreader);
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:invokevirtual   #1038 <Method void addDocument(PdfReader)>
			return;
	//   25   47:return          
		}
	}

	public void addPage(Rectangle rectangle, int i)
		throws DocumentException
	{
		if(mergeFields && !mergeFieldsInternalCall)
	//*   0    0:aload_0         
	//*   1    1:getfield        #275 <Field boolean mergeFields>
	//*   2    4:ifeq            38
	//*   3    7:aload_0         
	//*   4    8:getfield        #279 <Field boolean mergeFieldsInternalCall>
	//*   5   11:ifne            38
		{
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("1.method.cannot.be.used.in.mergeFields.mode.please.use.addDocument", new Object[] {
				"addPage"
			}));
	//    6   14:new             #983 <Class IllegalArgumentException>
	//    7   17:dup             
	//    8   18:ldc2            #1042 <String "1.method.cannot.be.used.in.mergeFields.mode.please.use.addDocument">
	//    9   21:iconst_1        
	//   10   22:anewarray       Object[]
	//   11   25:dup             
	//   12   26:iconst_0        
	//   13   27:ldc2            #1043 <String "addPage">
	//   14   30:aastore         
	//   15   31:invokestatic    #980 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   16   34:invokespecial   #987 <Method void IllegalArgumentException(String)>
	//   17   37:athrow          
		} else
		{
			rectangle = ((Rectangle) (new PdfRectangle(rectangle, i)));
	//   18   38:new             #1045 <Class PdfRectangle>
	//   19   41:dup             
	//   20   42:aload_1         
	//   21   43:iload_2         
	//   22   44:invokespecial   #1047 <Method void PdfRectangle(Rectangle, int)>
	//   23   47:astore_1        
			PageResources pageresources = new PageResources();
	//   24   48:new             #1049 <Class PageResources>
	//   25   51:dup             
	//   26   52:invokespecial   #1050 <Method void PageResources()>
	//   27   55:astore_3        
			rectangle = ((Rectangle) (new PdfPage(((PdfRectangle) (rectangle)), new HashMap(), pageresources.getResources(), 0)));
	//   28   56:new             #1052 <Class PdfPage>
	//   29   59:dup             
	//   30   60:aload_1         
	//   31   61:new             #283 <Class HashMap>
	//   32   64:dup             
	//   33   65:invokespecial   #284 <Method void HashMap()>
	//   34   68:aload_3         
	//   35   69:invokevirtual   #1054 <Method PdfDictionary PageResources.getResources()>
	//   36   72:iconst_0        
	//   37   73:invokespecial   #1057 <Method void PdfPage(PdfRectangle, HashMap, PdfDictionary, int)>
	//   38   76:astore_1        
			((PdfPage) (rectangle)).put(PdfName.TABS, ((PdfObject) (getTabs())));
	//   39   77:aload_1         
	//   40   78:getstatic       #1060 <Field PdfName PdfName.TABS>
	//   41   81:aload_0         
	//   42   82:invokevirtual   #1064 <Method PdfName getTabs()>
	//   43   85:invokevirtual   #1065 <Method void PdfPage.put(PdfName, PdfObject)>
			root.addPage(((PdfDictionary) (rectangle)));
	//   44   88:aload_0         
	//   45   89:getfield        #1069 <Field PdfPages root>
	//   46   92:aload_1         
	//   47   93:invokevirtual   #1073 <Method void PdfPages.addPage(PdfDictionary)>
			currentPageNumber = currentPageNumber + 1;
	//   48   96:aload_0         
	//   49   97:aload_0         
	//   50   98:getfield        #1076 <Field int currentPageNumber>
	//   51  101:iconst_1        
	//   52  102:iadd            
	//   53  103:putfield        #1076 <Field int currentPageNumber>
			pdf.setPageCount(currentPageNumber);
	//   54  106:aload_0         
	//   55  107:getfield        #292 <Field PdfDocument pdf>
	//   56  110:aload_0         
	//   57  111:getfield        #1076 <Field int currentPageNumber>
	//   58  114:invokevirtual   #1079 <Method void PdfDocument.setPageCount(int)>
			return;
	//   59  117:return          
		}
	}

	public void addPage(PdfImportedPage pdfimportedpage)
		throws IOException, BadPdfFormatException
	{
		if(mergeFields && !mergeFieldsInternalCall)
	//*   0    0:aload_0         
	//*   1    1:getfield        #275 <Field boolean mergeFields>
	//*   2    4:ifeq            38
	//*   3    7:aload_0         
	//*   4    8:getfield        #279 <Field boolean mergeFieldsInternalCall>
	//*   5   11:ifne            38
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("1.method.cannot.be.used.in.mergeFields.mode.please.use.addDocument", new Object[] {
				"addPage"
			}));
	//    6   14:new             #983 <Class IllegalArgumentException>
	//    7   17:dup             
	//    8   18:ldc2            #1042 <String "1.method.cannot.be.used.in.mergeFields.mode.please.use.addDocument">
	//    9   21:iconst_1        
	//   10   22:anewarray       Object[]
	//   11   25:dup             
	//   12   26:iconst_0        
	//   13   27:ldc2            #1043 <String "addPage">
	//   14   30:aastore         
	//   15   31:invokestatic    #980 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   16   34:invokespecial   #987 <Method void IllegalArgumentException(String)>
	//   17   37:athrow          
		int i = setFromIPage(pdfimportedpage);
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:invokevirtual   #1083 <Method int setFromIPage(PdfImportedPage)>
	//   21   43:istore_2        
		PdfDictionary pdfdictionary = reader.getPageN(i);
	//   22   44:aload_0         
	//   23   45:getfield        #1084 <Field PdfReader reader>
	//   24   48:iload_2         
	//   25   49:invokevirtual   #1087 <Method PdfDictionary PdfReader.getPageN(int)>
	//   26   52:astore          5
		Object obj = ((Object) (reader.getPageOrigRef(i)));
	//   27   54:aload_0         
	//   28   55:getfield        #1084 <Field PdfReader reader>
	//   29   58:iload_2         
	//   30   59:invokevirtual   #1091 <Method PRIndirectReference PdfReader.getPageOrigRef(int)>
	//   31   62:astore_3        
		reader.releasePage(i);
	//   32   63:aload_0         
	//   33   64:getfield        #1084 <Field PdfReader reader>
	//   34   67:iload_2         
	//   35   68:invokevirtual   #1094 <Method void PdfReader.releasePage(int)>
		RefKey refkey = new RefKey(((PRIndirectReference) (obj)));
	//   36   71:new             #682 <Class RefKey>
	//   37   74:dup             
	//   38   75:aload_3         
	//   39   76:invokespecial   #930 <Method void RefKey(PRIndirectReference)>
	//   40   79:astore          6
		IndirectReferences indirectreferences = (IndirectReferences)indirects.get(((Object) (refkey)));
	//   41   81:aload_0         
	//   42   82:getfield        #1096 <Field HashMap indirects>
	//   43   85:aload           6
	//   44   87:invokevirtual   #472 <Method Object HashMap.get(Object)>
	//   45   90:checkcast       #9   <Class PdfCopy$IndirectReferences>
	//   46   93:astore          4
		if(indirectreferences != null && !indirectreferences.getCopied())
	//*  47   95:aload           4
	//*  48   97:ifnull          126
	//*  49  100:aload           4
	//*  50  102:invokevirtual   #1099 <Method boolean PdfCopy$IndirectReferences.getCopied()>
	//*  51  105:ifne            126
		{
			pageReferences.add(((Object) (indirectreferences.getRef())));
	//   52  108:aload_0         
	//   53  109:getfield        #1102 <Field ArrayList pageReferences>
	//   54  112:aload           4
	//   55  114:invokevirtual   #933 <Method PdfIndirectReference PdfCopy$IndirectReferences.getRef()>
	//   56  117:invokevirtual   #476 <Method boolean ArrayList.add(Object)>
	//   57  120:pop             
			indirectreferences.setCopied();
	//   58  121:aload           4
	//   59  123:invokevirtual   #1105 <Method void PdfCopy$IndirectReferences.setCopied()>
		}
		PdfIndirectReference pdfindirectreference = getCurrentPage();
	//   60  126:aload_0         
	//   61  127:invokevirtual   #1108 <Method PdfIndirectReference getCurrentPage()>
	//   62  130:astore          7
		obj = ((Object) (indirectreferences));
	//   63  132:aload           4
	//   64  134:astore_3        
		if(indirectreferences == null)
	//*  65  135:aload           4
	//*  66  137:ifnonnull       161
		{
			obj = ((Object) (new IndirectReferences(pdfindirectreference)));
	//   67  140:new             #9   <Class PdfCopy$IndirectReferences>
	//   68  143:dup             
	//   69  144:aload           7
	//   70  146:invokespecial   #1109 <Method void PdfCopy$IndirectReferences(PdfIndirectReference)>
	//   71  149:astore_3        
			indirects.put(((Object) (refkey)), obj);
	//   72  150:aload_0         
	//   73  151:getfield        #1096 <Field HashMap indirects>
	//   74  154:aload           6
	//   75  156:aload_3         
	//   76  157:invokevirtual   #479 <Method Object HashMap.put(Object, Object)>
	//   77  160:pop             
		}
		((IndirectReferences) (obj)).setCopied();
	//   78  161:aload_3         
	//   79  162:invokevirtual   #1105 <Method void PdfCopy$IndirectReferences.setCopied()>
		if(tagged)
	//*  80  165:aload_0         
	//*  81  166:getfield        #1017 <Field boolean tagged>
	//*  82  169:ifeq            192
			structTreeRootReference = (PRIndirectReference)reader.getCatalog().get(PdfName.STRUCTTREEROOT);
	//   83  172:aload_0         
	//   84  173:aload_0         
	//   85  174:getfield        #1084 <Field PdfReader reader>
	//   86  177:invokevirtual   #911 <Method PdfDictionary PdfReader.getCatalog()>
	//   87  180:getstatic       #1112 <Field PdfName PdfName.STRUCTTREEROOT>
	//   88  183:invokevirtual   #570 <Method PdfObject PdfDictionary.get(PdfName)>
	//   89  186:checkcast       #829 <Class PRIndirectReference>
	//   90  189:putfield        #1114 <Field PRIndirectReference structTreeRootReference>
		obj = ((Object) (copyDictionary(pdfdictionary)));
	//   91  192:aload_0         
	//   92  193:aload           5
	//   93  195:invokevirtual   #1118 <Method PdfDictionary copyDictionary(PdfDictionary)>
	//   94  198:astore_3        
		if(mergeFields)
	//*  95  199:aload_0         
	//*  96  200:getfield        #275 <Field boolean mergeFields>
	//*  97  203:ifeq            251
		{
			ImportedPage importedpage = (ImportedPage)importedPages.get(importedPages.size() - 1);
	//   98  206:aload_0         
	//   99  207:getfield        #320 <Field ArrayList importedPages>
	//  100  210:aload_0         
	//  101  211:getfield        #320 <Field ArrayList importedPages>
	//  102  214:invokevirtual   #483 <Method int ArrayList.size()>
	//  103  217:iconst_1        
	//  104  218:isub            
	//  105  219:invokevirtual   #486 <Method Object ArrayList.get(int)>
	//  106  222:checkcast       #6   <Class PdfCopy$ImportedPage>
	//  107  225:astore          4
			importedpage.annotsIndirectReference = body.getPdfIndirectReference();
	//  108  227:aload           4
	//  109  229:aload_0         
	//  110  230:getfield        #953 <Field PdfWriter$PdfBody body>
	//  111  233:invokevirtual   #1119 <Method PdfIndirectReference PdfWriter$PdfBody.getPdfIndirectReference()>
	//  112  236:putfield        #721 <Field PdfIndirectReference PdfCopy$ImportedPage.annotsIndirectReference>
			((PdfDictionary) (obj)).put(PdfName.ANNOTS, ((PdfObject) (importedpage.annotsIndirectReference)));
	//  113  239:aload_3         
	//  114  240:getstatic       #1007 <Field PdfName PdfName.ANNOTS>
	//  115  243:aload           4
	//  116  245:getfield        #721 <Field PdfIndirectReference PdfCopy$ImportedPage.annotsIndirectReference>
	//  117  248:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}
		root.addPage(((PdfDictionary) (obj)));
	//  118  251:aload_0         
	//  119  252:getfield        #1069 <Field PdfPages root>
	//  120  255:aload_3         
	//  121  256:invokevirtual   #1073 <Method void PdfPages.addPage(PdfDictionary)>
		pdfimportedpage.setCopied();
	//  122  259:aload_1         
	//  123  260:invokevirtual   #1122 <Method void PdfImportedPage.setCopied()>
		currentPageNumber = currentPageNumber + 1;
	//  124  263:aload_0         
	//  125  264:aload_0         
	//  126  265:getfield        #1076 <Field int currentPageNumber>
	//  127  268:iconst_1        
	//  128  269:iadd            
	//  129  270:putfield        #1076 <Field int currentPageNumber>
		pdf.setPageCount(currentPageNumber);
	//  130  273:aload_0         
	//  131  274:getfield        #292 <Field PdfDocument pdf>
	//  132  277:aload_0         
	//  133  278:getfield        #1076 <Field int currentPageNumber>
	//  134  281:invokevirtual   #1079 <Method void PdfDocument.setPageCount(int)>
		structTreeRootReference = null;
	//  135  284:aload_0         
	//  136  285:aconst_null     
	//  137  286:putfield        #1114 <Field PRIndirectReference structTreeRootReference>
	//  138  289:return          
	}

	public PdfIndirectObject addToBody(PdfObject pdfobject, PdfIndirectReference pdfindirectreference)
		throws IOException
	{
		return addToBody(pdfobject, pdfindirectreference, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #561 <Method PdfIndirectObject addToBody(PdfObject, PdfIndirectReference, boolean)>
	//    5    7:areturn         
	}

	public PdfIndirectObject addToBody(PdfObject pdfobject, PdfIndirectReference pdfindirectreference, boolean flag)
		throws IOException
	{
label0:
		{
			if(flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            9
				updateReferences(pdfobject);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #935 <Method void updateReferences(PdfObject)>
			if((tagged || mergeFields) && indirectObjects != null && (pdfobject.isArray() || pdfobject.isDictionary() || pdfobject.isStream() || pdfobject.isNull()))
	//*   5    9:aload_0         
	//*   6   10:getfield        #1017 <Field boolean tagged>
	//*   7   13:ifne            23
	//*   8   16:aload_0         
	//*   9   17:getfield        #275 <Field boolean mergeFields>
	//*  10   20:ifeq            178
	//*  11   23:aload_0         
	//*  12   24:getfield        #313 <Field LinkedHashMap indirectObjects>
	//*  13   27:ifnull          178
	//*  14   30:aload_1         
	//*  15   31:invokevirtual   #698 <Method boolean PdfObject.isArray()>
	//*  16   34:ifne            58
	//*  17   37:aload_1         
	//*  18   38:invokevirtual   #701 <Method boolean PdfObject.isDictionary()>
	//*  19   41:ifne            58
	//*  20   44:aload_1         
	//*  21   45:invokevirtual   #704 <Method boolean PdfObject.isStream()>
	//*  22   48:ifne            58
	//*  23   51:aload_1         
	//*  24   52:invokevirtual   #1125 <Method boolean PdfObject.isNull()>
	//*  25   55:ifeq            178
			{
				RefKey refkey = new RefKey(pdfindirectreference);
	//   26   58:new             #682 <Class RefKey>
	//   27   61:dup             
	//   28   62:aload_2         
	//   29   63:invokespecial   #688 <Method void RefKey(PdfIndirectReference)>
	//   30   66:astore          6
				PdfIndirectObject pdfindirectobject1 = (PdfIndirectObject)indirectObjects.get(((Object) (refkey)));
	//   31   68:aload_0         
	//   32   69:getfield        #313 <Field LinkedHashMap indirectObjects>
	//   33   72:aload           6
	//   34   74:invokevirtual   #689 <Method Object LinkedHashMap.get(Object)>
	//   35   77:checkcast       #422 <Class PdfIndirectObject>
	//   36   80:astore          5
				PdfIndirectObject pdfindirectobject = pdfindirectobject1;
	//   37   82:aload           5
	//   38   84:astore          4
				if(pdfindirectobject1 == null)
	//*  39   86:aload           5
	//*  40   88:ifnonnull       115
				{
					pdfindirectobject = new PdfIndirectObject(pdfindirectreference, pdfobject, ((PdfWriter) (this)));
	//   41   91:new             #422 <Class PdfIndirectObject>
	//   42   94:dup             
	//   43   95:aload_2         
	//   44   96:aload_1         
	//   45   97:aload_0         
	//   46   98:invokespecial   #1128 <Method void PdfIndirectObject(PdfIndirectReference, PdfObject, PdfWriter)>
	//   47  101:astore          4
					indirectObjects.put(((Object) (refkey)), ((Object) (pdfindirectobject)));
	//   48  103:aload_0         
	//   49  104:getfield        #313 <Field LinkedHashMap indirectObjects>
	//   50  107:aload           6
	//   51  109:aload           4
	//   52  111:invokevirtual   #1129 <Method Object LinkedHashMap.put(Object, Object)>
	//   53  114:pop             
				}
				pdfindirectreference = ((PdfIndirectReference) (pdfindirectobject));
	//   54  115:aload           4
	//   55  117:astore_2        
			} else
	//*  56  118:aload_0         
	//*  57  119:getfield        #275 <Field boolean mergeFields>
	//*  58  122:ifeq            176
	//*  59  125:aload_1         
	//*  60  126:invokevirtual   #701 <Method boolean PdfObject.isDictionary()>
	//*  61  129:ifeq            176
	//*  62  132:aload_1         
	//*  63  133:checkcast       #331 <Class PdfDictionary>
	//*  64  136:getstatic       #123 <Field PdfName annotId>
	//*  65  139:invokevirtual   #838 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//*  66  142:astore_1        
	//*  67  143:aload_1         
	//*  68  144:ifnull          176
	//*  69  147:iload_3         
	//*  70  148:ifeq            188
	//*  71  151:aload_0         
	//*  72  152:getfield        #904 <Field HashMap mergedMap>
	//*  73  155:aload_1         
	//*  74  156:invokevirtual   #466 <Method int PdfNumber.intValue()>
	//*  75  159:invokestatic    #135 <Method Integer Integer.valueOf(int)>
	//*  76  162:aload_2         
	//*  77  163:invokevirtual   #479 <Method Object HashMap.put(Object, Object)>
	//*  78  166:pop             
	//*  79  167:aload_0         
	//*  80  168:getfield        #947 <Field HashSet mergedSet>
	//*  81  171:aload_2         
	//*  82  172:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//*  83  175:pop             
	//*  84  176:aload_2         
	//*  85  177:areturn         
			{
				pdfindirectreference = ((PdfIndirectReference) (super.addToBody(pdfobject, pdfindirectreference)));
	//   86  178:aload_0         
	//   87  179:aload_1         
	//   88  180:aload_2         
	//   89  181:invokespecial   #1130 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject, PdfIndirectReference)>
	//   90  184:astore_2        
			}
			if(mergeFields && pdfobject.isDictionary())
			{
				pdfobject = ((PdfObject) (((PdfDictionary)pdfobject).getAsNumber(annotId)));
				if(pdfobject != null)
				{
					if(!flag)
						break label0;
					mergedMap.put(((Object) (Integer.valueOf(((PdfNumber) (pdfobject)).intValue()))), ((Object) (pdfindirectreference)));
					mergedSet.add(((Object) (pdfindirectreference)));
				}
			}
			return ((PdfIndirectObject) (pdfindirectreference));
		}
	//*  91  185:goto            118
		unmergedMap.put(((Object) (Integer.valueOf(((PdfNumber) (pdfobject)).intValue()))), ((Object) (pdfindirectreference)));
	//   92  188:aload_0         
	//   93  189:getfield        #949 <Field HashMap unmergedMap>
	//   94  192:aload_1         
	//   95  193:invokevirtual   #466 <Method int PdfNumber.intValue()>
	//   96  196:invokestatic    #135 <Method Integer Integer.valueOf(int)>
	//   97  199:aload_2         
	//   98  200:invokevirtual   #479 <Method Object HashMap.put(Object, Object)>
	//   99  203:pop             
		unmergedIndirectRefsMap.put(((Object) (new RefKey(((PdfIndirectObject) (pdfindirectreference)).number, ((PdfIndirectObject) (pdfindirectreference)).generation))), ((Object) (pdfindirectreference)));
	//  100  204:aload_0         
	//  101  205:getfield        #902 <Field HashMap unmergedIndirectRefsMap>
	//  102  208:new             #682 <Class RefKey>
	//  103  211:dup             
	//  104  212:aload_2         
	//  105  213:getfield        #940 <Field int PdfIndirectObject.number>
	//  106  216:aload_2         
	//  107  217:getfield        #943 <Field int PdfIndirectObject.generation>
	//  108  220:invokespecial   #945 <Method void RefKey(int, int)>
	//  109  223:aload_2         
	//  110  224:invokevirtual   #479 <Method Object HashMap.put(Object, Object)>
	//  111  227:pop             
		return ((PdfIndirectObject) (pdfindirectreference));
	//  112  228:aload_2         
	//  113  229:areturn         
	}

	protected void cacheObject(PdfIndirectObject pdfindirectobject)
	{
		if((tagged || mergeFields) && indirectObjects != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1017 <Field boolean tagged>
	//*   2    4:ifne            14
	//*   3    7:aload_0         
	//*   4    8:getfield        #275 <Field boolean mergeFields>
	//*   5   11:ifeq            67
	//*   6   14:aload_0         
	//*   7   15:getfield        #313 <Field LinkedHashMap indirectObjects>
	//*   8   18:ifnull          67
		{
			savedObjects.add(((Object) (pdfindirectobject)));
	//    9   21:aload_0         
	//   10   22:getfield        #318 <Field ArrayList savedObjects>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #476 <Method boolean ArrayList.add(Object)>
	//   13   29:pop             
			RefKey refkey = new RefKey(pdfindirectobject.number, pdfindirectobject.generation);
	//   14   30:new             #682 <Class RefKey>
	//   15   33:dup             
	//   16   34:aload_1         
	//   17   35:getfield        #940 <Field int PdfIndirectObject.number>
	//   18   38:aload_1         
	//   19   39:getfield        #943 <Field int PdfIndirectObject.generation>
	//   20   42:invokespecial   #945 <Method void RefKey(int, int)>
	//   21   45:astore_2        
			if(!indirectObjects.containsKey(((Object) (refkey))))
	//*  22   46:aload_0         
	//*  23   47:getfield        #313 <Field LinkedHashMap indirectObjects>
	//*  24   50:aload_2         
	//*  25   51:invokevirtual   #1132 <Method boolean LinkedHashMap.containsKey(Object)>
	//*  26   54:ifne            67
				indirectObjects.put(((Object) (refkey)), ((Object) (pdfindirectobject)));
	//   27   57:aload_0         
	//   28   58:getfield        #313 <Field LinkedHashMap indirectObjects>
	//   29   61:aload_2         
	//   30   62:aload_1         
	//   31   63:invokevirtual   #1129 <Method Object LinkedHashMap.put(Object, Object)>
	//   32   66:pop             
		}
	//   33   67:return          
	}

	public void close()
	{
		if(open)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1136 <Field boolean open>
	//*   2    4:ifeq            18
		{
			pdf.close();
	//    3    7:aload_0         
	//    4    8:getfield        #292 <Field PdfDocument pdf>
	//    5   11:invokevirtual   #1138 <Method void PdfDocument.close()>
			super.close();
	//    6   14:aload_0         
	//    7   15:invokespecial   #1139 <Method void PdfWriter.close()>
		}
	//    8   18:return          
	}

	protected PdfArray copyArray(PdfArray pdfarray)
		throws IOException, BadPdfFormatException
	{
		return copyArray(pdfarray, false, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #1144 <Method PdfArray copyArray(PdfArray, boolean, boolean)>
	//    5    7:areturn         
	}

	protected PdfArray copyArray(PdfArray pdfarray, boolean flag, boolean flag1)
		throws IOException, BadPdfFormatException
	{
		PdfArray pdfarray1 = new PdfArray(pdfarray.size());
	//    0    0:new             #474 <Class PdfArray>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #475 <Method int PdfArray.size()>
	//    4    8:invokespecial   #1145 <Method void PdfArray(int)>
	//    5   11:astore          4
		java.util.ListIterator listiterator = pdfarray.listIterator();
	//    6   13:aload_1         
	//    7   14:invokevirtual   #1149 <Method java.util.ListIterator PdfArray.listIterator()>
	//    8   17:astore          5
		do
		{
			if(!((Iterator) (listiterator)).hasNext())
				break;
	//    9   19:aload           5
	//   10   21:invokeinterface #365 <Method boolean Iterator.hasNext()>
	//   11   26:ifeq            78
			PdfObject pdfobject = (PdfObject)((Iterator) (listiterator)).next();
	//   12   29:aload           5
	//   13   31:invokeinterface #369 <Method Object Iterator.next()>
	//   14   36:checkcast       #695 <Class PdfObject>
	//   15   39:astore          6
			parentObjects.put(((Object) (pdfobject)), ((Object) (pdfarray)));
	//   16   41:aload_0         
	//   17   42:getfield        #306 <Field HashMap parentObjects>
	//   18   45:aload           6
	//   19   47:aload_1         
	//   20   48:invokevirtual   #479 <Method Object HashMap.put(Object, Object)>
	//   21   51:pop             
			pdfobject = copyObject(pdfobject, flag, flag1);
	//   22   52:aload_0         
	//   23   53:aload           6
	//   24   55:iload_2         
	//   25   56:iload_3         
	//   26   57:invokevirtual   #1153 <Method PdfObject copyObject(PdfObject, boolean, boolean)>
	//   27   60:astore          6
			if(pdfobject != null)
	//*  28   62:aload           6
	//*  29   64:ifnull          19
				pdfarray1.add(pdfobject);
	//   30   67:aload           4
	//   31   69:aload           6
	//   32   71:invokevirtual   #482 <Method boolean PdfArray.add(PdfObject)>
	//   33   74:pop             
		} while(true);
	//   34   75:goto            19
		return pdfarray1;
	//   35   78:aload           4
	//   36   80:areturn         
	}

	protected PdfDictionary copyDictionary(PdfDictionary pdfdictionary)
		throws IOException, BadPdfFormatException
	{
		return copyDictionary(pdfdictionary, false, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #1156 <Method PdfDictionary copyDictionary(PdfDictionary, boolean, boolean)>
	//    5    7:areturn         
	}

	protected PdfDictionary copyDictionary(PdfDictionary pdfdictionary, boolean flag, boolean flag1)
		throws IOException, BadPdfFormatException
	{
		PdfDictionary pdfdictionary1;
		PdfObject pdfobject;
		pdfdictionary1 = new PdfDictionary(pdfdictionary.size());
	//    0    0:new             #331 <Class PdfDictionary>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1157 <Method int PdfDictionary.size()>
	//    4    8:invokespecial   #1158 <Method void PdfDictionary(int)>
	//    5   11:astore          6
		pdfobject = PdfReader.getPdfObjectRelease(pdfdictionary.get(PdfName.TYPE));
	//    6   13:aload_1         
	//    7   14:getstatic       #209 <Field PdfName PdfName.TYPE>
	//    8   17:invokevirtual   #570 <Method PdfObject PdfDictionary.get(PdfName)>
	//    9   20:invokestatic    #1161 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   10   23:astore          7
		if(!flag) goto _L2; else goto _L1
	//   11   25:iload_2         
	//   12   26:ifeq            130
_L1:
		if(!flag1 || !pdfdictionary.contains(PdfName.PG)) goto _L4; else goto _L3
	//   13   29:iload_3         
	//   14   30:ifeq            104
	//   15   33:aload_1         
	//   16   34:getstatic       #711 <Field PdfName PdfName.PG>
	//   17   37:invokevirtual   #395 <Method boolean PdfDictionary.contains(PdfName)>
	//   18   40:ifeq            104
_L3:
		Object obj;
		disableIndirects.add(((Object) (pdfdictionary)));
	//   19   43:aload_0         
	//   20   44:getfield        #308 <Field HashSet disableIndirects>
	//   21   47:aload_1         
	//   22   48:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//   23   51:pop             
		for(; parentObjects.containsKey(((Object) (pdfdictionary))) && !disableIndirects.contains(((Object) (pdfdictionary))); disableIndirects.add(((Object) (pdfdictionary))))
	//*  24   52:aload_0         
	//*  25   53:getfield        #306 <Field HashMap parentObjects>
	//*  26   56:aload_1         
	//*  27   57:invokevirtual   #595 <Method boolean HashMap.containsKey(Object)>
	//*  28   60:ifeq            98
	//*  29   63:aload_0         
	//*  30   64:getfield        #308 <Field HashSet disableIndirects>
	//*  31   67:aload_1         
	//*  32   68:invokevirtual   #666 <Method boolean HashSet.contains(Object)>
	//*  33   71:ifne            98
			pdfdictionary = ((PdfDictionary) ((PdfObject)parentObjects.get(((Object) (pdfdictionary)))));
	//   34   74:aload_0         
	//   35   75:getfield        #306 <Field HashMap parentObjects>
	//   36   78:aload_1         
	//   37   79:invokevirtual   #472 <Method Object HashMap.get(Object)>
	//   38   82:checkcast       #695 <Class PdfObject>
	//   39   85:astore_1        

	//   40   86:aload_0         
	//   41   87:getfield        #308 <Field HashSet disableIndirects>
	//   42   90:aload_1         
	//   43   91:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//   44   94:pop             
	//*  45   95:goto            52
		obj = null;
	//   46   98:aconst_null     
	//   47   99:astore          5
_L6:
		return ((PdfDictionary) (obj));
	//   48  101:aload           5
	//   49  103:areturn         
_L4:
		obj = ((Object) (pdfdictionary.getAsName(PdfName.S)));
	//   50  104:aload_1         
	//   51  105:getstatic       #1164 <Field PdfName PdfName.S>
	//   52  108:invokevirtual   #654 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//   53  111:astore          5
		structTreeController.addRole(((PdfName) (obj)));
	//   54  113:aload_0         
	//   55  114:getfield        #269 <Field PdfStructTreeController structTreeController>
	//   56  117:aload           5
	//   57  119:invokevirtual   #1167 <Method void PdfStructTreeController.addRole(PdfName)>
		structTreeController.addClass(((PdfObject) (pdfdictionary)));
	//   58  122:aload_0         
	//   59  123:getfield        #269 <Field PdfStructTreeController structTreeController>
	//   60  126:aload_1         
	//   61  127:invokevirtual   #1170 <Method void PdfStructTreeController.addClass(PdfObject)>
_L2:
		if(structTreeController != null && structTreeController.reader != null && (pdfdictionary.contains(PdfName.STRUCTPARENTS) || pdfdictionary.contains(PdfName.STRUCTPARENT)))
	//*  62  130:aload_0         
	//*  63  131:getfield        #269 <Field PdfStructTreeController structTreeController>
	//*  64  134:ifnull          249
	//*  65  137:aload_0         
	//*  66  138:getfield        #269 <Field PdfStructTreeController structTreeController>
	//*  67  141:getfield        #1171 <Field PdfReader PdfStructTreeController.reader>
	//*  68  144:ifnull          249
	//*  69  147:aload_1         
	//*  70  148:getstatic       #1174 <Field PdfName PdfName.STRUCTPARENTS>
	//*  71  151:invokevirtual   #395 <Method boolean PdfDictionary.contains(PdfName)>
	//*  72  154:ifne            167
	//*  73  157:aload_1         
	//*  74  158:getstatic       #188 <Field PdfName PdfName.STRUCTPARENT>
	//*  75  161:invokevirtual   #395 <Method boolean PdfDictionary.contains(PdfName)>
	//*  76  164:ifeq            249
		{
			obj = ((Object) (PdfName.STRUCTPARENT));
	//   77  167:getstatic       #188 <Field PdfName PdfName.STRUCTPARENT>
	//   78  170:astore          5
			if(pdfdictionary.contains(PdfName.STRUCTPARENTS))
	//*  79  172:aload_1         
	//*  80  173:getstatic       #1174 <Field PdfName PdfName.STRUCTPARENTS>
	//*  81  176:invokevirtual   #395 <Method boolean PdfDictionary.contains(PdfName)>
	//*  82  179:ifeq            187
				obj = ((Object) (PdfName.STRUCTPARENTS));
	//   83  182:getstatic       #1174 <Field PdfName PdfName.STRUCTPARENTS>
	//   84  185:astore          5
			Object obj1 = ((Object) (pdfdictionary.get(((PdfName) (obj)))));
	//   85  187:aload_1         
	//   86  188:aload           5
	//   87  190:invokevirtual   #570 <Method PdfObject PdfDictionary.get(PdfName)>
	//   88  193:astore          8
			pdfdictionary1.put(((PdfName) (obj)), ((PdfObject) (new PdfNumber(currentStructArrayNumber))));
	//   89  195:aload           6
	//   90  197:aload           5
	//   91  199:new             #465 <Class PdfNumber>
	//   92  202:dup             
	//   93  203:aload_0         
	//   94  204:getfield        #271 <Field int currentStructArrayNumber>
	//   95  207:invokespecial   #752 <Method void PdfNumber(int)>
	//   96  210:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
			obj = ((Object) (structTreeController));
	//   97  213:aload_0         
	//   98  214:getfield        #269 <Field PdfStructTreeController structTreeController>
	//   99  217:astore          5
			obj1 = ((Object) ((PdfNumber)obj1));
	//  100  219:aload           8
	//  101  221:checkcast       #465 <Class PdfNumber>
	//  102  224:astore          8
			int i = currentStructArrayNumber;
	//  103  226:aload_0         
	//  104  227:getfield        #271 <Field int currentStructArrayNumber>
	//  105  230:istore          4
			currentStructArrayNumber = i + 1;
	//  106  232:aload_0         
	//  107  233:iload           4
	//  108  235:iconst_1        
	//  109  236:iadd            
	//  110  237:putfield        #271 <Field int currentStructArrayNumber>
			((PdfStructTreeController) (obj)).copyStructTreeForPage(((PdfNumber) (obj1)), i);
	//  111  240:aload           5
	//  112  242:aload           8
	//  113  244:iload           4
	//  114  246:invokevirtual   #1178 <Method void PdfStructTreeController.copyStructTreeForPage(PdfNumber, int)>
		}
		Iterator iterator = pdfdictionary.getKeys().iterator();
	//  115  249:aload_1         
	//  116  250:invokevirtual   #769 <Method Set PdfDictionary.getKeys()>
	//  117  253:invokeinterface #504 <Method Iterator Set.iterator()>
	//  118  258:astore          8
		do
		{
			obj = ((Object) (pdfdictionary1));
	//  119  260:aload           6
	//  120  262:astore          5
			if(!iterator.hasNext())
				continue;
	//  121  264:aload           8
	//  122  266:invokeinterface #365 <Method boolean Iterator.hasNext()>
	//  123  271:ifeq            101
			PdfName pdfname = (PdfName)iterator.next();
	//  124  274:aload           8
	//  125  276:invokeinterface #369 <Method Object Iterator.next()>
	//  126  281:checkcast       #115 <Class PdfName>
	//  127  284:astore          9
			obj = ((Object) (pdfdictionary.get(pdfname)));
	//  128  286:aload_1         
	//  129  287:aload           9
	//  130  289:invokevirtual   #570 <Method PdfObject PdfDictionary.get(PdfName)>
	//  131  292:astore          5
			if(structTreeController == null || structTreeController.reader == null || !pdfname.equals(((Object) (PdfName.STRUCTPARENTS))) && !pdfname.equals(((Object) (PdfName.STRUCTPARENT))))
	//* 132  294:aload_0         
	//* 133  295:getfield        #269 <Field PdfStructTreeController structTreeController>
	//* 134  298:ifnull          333
	//* 135  301:aload_0         
	//* 136  302:getfield        #269 <Field PdfStructTreeController structTreeController>
	//* 137  305:getfield        #1171 <Field PdfReader PdfStructTreeController.reader>
	//* 138  308:ifnull          333
	//* 139  311:aload           9
	//* 140  313:getstatic       #1174 <Field PdfName PdfName.STRUCTPARENTS>
	//* 141  316:invokevirtual   #664 <Method boolean PdfName.equals(Object)>
	//* 142  319:ifne            260
	//* 143  322:aload           9
	//* 144  324:getstatic       #188 <Field PdfName PdfName.STRUCTPARENT>
	//* 145  327:invokevirtual   #664 <Method boolean PdfName.equals(Object)>
	//* 146  330:ifne            260
				if(PdfName.PAGE.equals(((Object) (pdfobject))))
	//* 147  333:getstatic       #1181 <Field PdfName PdfName.PAGE>
	//* 148  336:aload           7
	//* 149  338:invokevirtual   #664 <Method boolean PdfName.equals(Object)>
	//* 150  341:ifeq            404
				{
					if(!pdfname.equals(((Object) (PdfName.B))) && !pdfname.equals(((Object) (PdfName.PARENT))))
	//* 151  344:aload           9
	//* 152  346:getstatic       #1184 <Field PdfName PdfName.B>
	//* 153  349:invokevirtual   #664 <Method boolean PdfName.equals(Object)>
	//* 154  352:ifne            260
	//* 155  355:aload           9
	//* 156  357:getstatic       #520 <Field PdfName PdfName.PARENT>
	//* 157  360:invokevirtual   #664 <Method boolean PdfName.equals(Object)>
	//* 158  363:ifne            260
					{
						parentObjects.put(obj, ((Object) (pdfdictionary)));
	//  159  366:aload_0         
	//  160  367:getfield        #306 <Field HashMap parentObjects>
	//  161  370:aload           5
	//  162  372:aload_1         
	//  163  373:invokevirtual   #479 <Method Object HashMap.put(Object, Object)>
	//  164  376:pop             
						obj = ((Object) (copyObject(((PdfObject) (obj)), flag, flag1)));
	//  165  377:aload_0         
	//  166  378:aload           5
	//  167  380:iload_2         
	//  168  381:iload_3         
	//  169  382:invokevirtual   #1153 <Method PdfObject copyObject(PdfObject, boolean, boolean)>
	//  170  385:astore          5
						if(obj != null)
	//* 171  387:aload           5
	//* 172  389:ifnull          260
							pdfdictionary1.put(pdfname, ((PdfObject) (obj)));
	//  173  392:aload           6
	//  174  394:aload           9
	//  175  396:aload           5
	//  176  398:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
					}
				} else
	//* 177  401:goto            260
				{
					if(tagged && ((PdfObject) (obj)).isIndirect() && isStructTreeRootReference(((PdfIndirectReference) ((PRIndirectReference)obj))))
	//* 178  404:aload_0         
	//* 179  405:getfield        #1017 <Field boolean tagged>
	//* 180  408:ifeq            457
	//* 181  411:aload           5
	//* 182  413:invokevirtual   #895 <Method boolean PdfObject.isIndirect()>
	//* 183  416:ifeq            457
	//* 184  419:aload_0         
	//* 185  420:aload           5
	//* 186  422:checkcast       #829 <Class PRIndirectReference>
	//* 187  425:invokevirtual   #1188 <Method boolean isStructTreeRootReference(PdfIndirectReference)>
	//* 188  428:ifeq            457
						obj = ((Object) (structureTreeRoot.getReference()));
	//  189  431:aload_0         
	//  190  432:getfield        #1192 <Field PdfStructureTreeRoot structureTreeRoot>
	//  191  435:invokevirtual   #1197 <Method PdfIndirectReference PdfStructureTreeRoot.getReference()>
	//  192  438:astore          5
					else
	//* 193  440:aload           5
	//* 194  442:ifnull          260
	//* 195  445:aload           6
	//* 196  447:aload           9
	//* 197  449:aload           5
	//* 198  451:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 199  454:goto            260
						obj = ((Object) (copyObject(((PdfObject) (obj)), flag, flag1)));
	//  200  457:aload_0         
	//  201  458:aload           5
	//  202  460:iload_2         
	//  203  461:iload_3         
	//  204  462:invokevirtual   #1153 <Method PdfObject copyObject(PdfObject, boolean, boolean)>
	//  205  465:astore          5
					if(obj != null)
						pdfdictionary1.put(pdfname, ((PdfObject) (obj)));
				}
		} while(true);
	//  206  467:goto            440
		if(true) goto _L6; else goto _L5
_L5:
	}

	public void copyDocumentFields(PdfReader pdfreader)
		throws DocumentException, IOException
	{
		if(!document.isOpen())
	//*   0    0:aload_0         
	//*   1    1:getfield        #969 <Field Document document>
	//*   2    4:invokevirtual   #972 <Method boolean Document.isOpen()>
	//*   3    7:ifne            28
			throw new DocumentException(MessageLocalization.getComposedMessage("the.document.is.not.open.yet.you.can.only.add.meta.information", new Object[0]));
	//    4   10:new             #257 <Class DocumentException>
	//    5   13:dup             
	//    6   14:ldc2            #974 <String "the.document.is.not.open.yet.you.can.only.add.meta.information">
	//    7   17:iconst_0        
	//    8   18:anewarray       Object[]
	//    9   21:invokestatic    #980 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   10   24:invokespecial   #981 <Method void DocumentException(String)>
	//   11   27:athrow          
		if(indirectMap.containsKey(((Object) (pdfreader))))
	//*  12   28:aload_0         
	//*  13   29:getfield        #304 <Field HashMap indirectMap>
	//*  14   32:aload_1         
	//*  15   33:invokevirtual   #595 <Method boolean HashMap.containsKey(Object)>
	//*  16   36:ifeq            64
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("document.1.has.already.been.added", new Object[] {
				((Object) (pdfreader)).toString()
			}));
	//   17   39:new             #983 <Class IllegalArgumentException>
	//   18   42:dup             
	//   19   43:ldc2            #985 <String "document.1.has.already.been.added">
	//   20   46:iconst_1        
	//   21   47:anewarray       Object[]
	//   22   50:dup             
	//   23   51:iconst_0        
	//   24   52:aload_1         
	//   25   53:invokevirtual   #986 <Method String Object.toString()>
	//   26   56:aastore         
	//   27   57:invokestatic    #980 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   28   60:invokespecial   #987 <Method void IllegalArgumentException(String)>
	//   29   63:athrow          
		if(!pdfreader.isOpenedWithFullPermissions())
	//*  30   64:aload_1         
	//*  31   65:invokevirtual   #990 <Method boolean PdfReader.isOpenedWithFullPermissions()>
	//*  32   68:ifne            89
			throw new BadPasswordException(MessageLocalization.getComposedMessage("pdfreader.not.opened.with.owner.password", new Object[0]));
	//   33   71:new             #992 <Class BadPasswordException>
	//   34   74:dup             
	//   35   75:ldc2            #994 <String "pdfreader.not.opened.with.owner.password">
	//   36   78:iconst_0        
	//   37   79:anewarray       Object[]
	//   38   82:invokestatic    #980 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   39   85:invokespecial   #995 <Method void BadPasswordException(String)>
	//   40   88:athrow          
		if(!mergeFields)
	//*  41   89:aload_0         
	//*  42   90:getfield        #275 <Field boolean mergeFields>
	//*  43   93:ifne            120
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("1.method.can.be.only.used.in.mergeFields.mode.please.use.addDocument", new Object[] {
				"copyDocumentFields"
			}));
	//   44   96:new             #983 <Class IllegalArgumentException>
	//   45   99:dup             
	//   46  100:ldc2            #1200 <String "1.method.can.be.only.used.in.mergeFields.mode.please.use.addDocument">
	//   47  103:iconst_1        
	//   48  104:anewarray       Object[]
	//   49  107:dup             
	//   50  108:iconst_0        
	//   51  109:ldc2            #1201 <String "copyDocumentFields">
	//   52  112:aastore         
	//   53  113:invokestatic    #980 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   54  116:invokespecial   #987 <Method void IllegalArgumentException(String)>
	//   55  119:athrow          
		indirects = new HashMap();
	//   56  120:aload_0         
	//   57  121:new             #283 <Class HashMap>
	//   58  124:dup             
	//   59  125:invokespecial   #284 <Method void HashMap()>
	//   60  128:putfield        #1096 <Field HashMap indirects>
		indirectMap.put(((Object) (pdfreader)), ((Object) (indirects)));
	//   61  131:aload_0         
	//   62  132:getfield        #304 <Field HashMap indirectMap>
	//   63  135:aload_1         
	//   64  136:aload_0         
	//   65  137:getfield        #1096 <Field HashMap indirects>
	//   66  140:invokevirtual   #479 <Method Object HashMap.put(Object, Object)>
	//   67  143:pop             
		pdfreader.consolidateNamedDestinations();
	//   68  144:aload_1         
	//   69  145:invokevirtual   #998 <Method void PdfReader.consolidateNamedDestinations()>
		pdfreader.shuffleSubsetNames();
	//   70  148:aload_1         
	//   71  149:invokevirtual   #1001 <Method int PdfReader.shuffleSubsetNames()>
	//   72  152:pop             
		Object obj;
		if(tagged && PdfStructTreeController.checkTagged(pdfreader))
	//*  73  153:aload_0         
	//*  74  154:getfield        #1017 <Field boolean tagged>
	//*  75  157:ifeq            210
	//*  76  160:aload_1         
	//*  77  161:invokestatic    #1023 <Method boolean PdfStructTreeController.checkTagged(PdfReader)>
	//*  78  164:ifeq            210
		{
			structTreeRootReference = (PRIndirectReference)pdfreader.getCatalog().get(PdfName.STRUCTTREEROOT);
	//   79  167:aload_0         
	//   80  168:aload_1         
	//   81  169:invokevirtual   #911 <Method PdfDictionary PdfReader.getCatalog()>
	//   82  172:getstatic       #1112 <Field PdfName PdfName.STRUCTTREEROOT>
	//   83  175:invokevirtual   #570 <Method PdfObject PdfDictionary.get(PdfName)>
	//   84  178:checkcast       #829 <Class PRIndirectReference>
	//   85  181:putfield        #1114 <Field PRIndirectReference structTreeRootReference>
			PdfDictionary pdfdictionary;
			if(structTreeController != null)
	//*  86  184:aload_0         
	//*  87  185:getfield        #269 <Field PdfStructTreeController structTreeController>
	//*  88  188:ifnull          304
			{
				if(pdfreader != structTreeController.reader)
	//*  89  191:aload_1         
	//*  90  192:aload_0         
	//*  91  193:getfield        #269 <Field PdfStructTreeController structTreeController>
	//*  92  196:getfield        #1171 <Field PdfReader PdfStructTreeController.reader>
	//*  93  199:if_acmpeq       210
					structTreeController.setReader(pdfreader);
	//   94  202:aload_0         
	//   95  203:getfield        #269 <Field PdfStructTreeController structTreeController>
	//   96  206:aload_1         
	//   97  207:invokevirtual   #1204 <Method void PdfStructTreeController.setReader(PdfReader)>
			} else
	//*  98  210:new             #315 <Class ArrayList>
	//*  99  213:dup             
	//* 100  214:invokespecial   #316 <Method void ArrayList()>
	//* 101  217:astore          5
	//* 102  219:iconst_1        
	//* 103  220:istore_2        
	//* 104  221:iload_2         
	//* 105  222:aload_1         
	//* 106  223:invokevirtual   #878 <Method int PdfReader.getNumberOfPages()>
	//* 107  226:icmpgt          455
	//* 108  229:aload_1         
	//* 109  230:iload_2         
	//* 110  231:invokevirtual   #1004 <Method PdfDictionary PdfReader.getPageNRelease(int)>
	//* 111  234:astore          6
	//* 112  236:aload           6
	//* 113  238:ifnull          448
	//* 114  241:aload           6
	//* 115  243:getstatic       #1007 <Field PdfName PdfName.ANNOTS>
	//* 116  246:invokevirtual   #395 <Method boolean PdfDictionary.contains(PdfName)>
	//* 117  249:ifeq            448
	//* 118  252:aload           6
	//* 119  254:getstatic       #1007 <Field PdfName PdfName.ANNOTS>
	//* 120  257:invokevirtual   #612 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//* 121  260:astore          6
	//* 122  262:aload           6
	//* 123  264:ifnull          448
	//* 124  267:aload           6
	//* 125  269:invokevirtual   #475 <Method int PdfArray.size()>
	//* 126  272:ifle            448
	//* 127  275:aload_0         
	//* 128  276:getfield        #320 <Field ArrayList importedPages>
	//* 129  279:invokevirtual   #483 <Method int ArrayList.size()>
	//* 130  282:iload_2         
	//* 131  283:icmpge          320
	//* 132  286:new             #257 <Class DocumentException>
	//* 133  289:dup             
	//* 134  290:ldc2            #1206 <String "there.are.not.enough.imported.pages.for.copied.fields">
	//* 135  293:iconst_0        
	//* 136  294:anewarray       Object[]
	//* 137  297:invokestatic    #980 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//* 138  300:invokespecial   #981 <Method void DocumentException(String)>
	//* 139  303:athrow          
			{
				structTreeController = new PdfStructTreeController(pdfreader, this);
	//  140  304:aload_0         
	//  141  305:new             #1019 <Class PdfStructTreeController>
	//  142  308:dup             
	//  143  309:aload_1         
	//  144  310:aload_0         
	//  145  311:invokespecial   #1209 <Method void PdfStructTreeController(PdfReader, PdfCopy)>
	//  146  314:putfield        #269 <Field PdfStructTreeController structTreeController>
			}
		}
		obj = ((Object) (new ArrayList()));
		for(int i = 1; i <= pdfreader.getNumberOfPages(); i++)
		{
			pdfdictionary = pdfreader.getPageNRelease(i);
			if(pdfdictionary == null || !pdfdictionary.contains(PdfName.ANNOTS))
				continue;
			PdfArray pdfarray = pdfdictionary.getAsArray(PdfName.ANNOTS);
			if(pdfarray == null || pdfarray.size() <= 0)
				continue;
			if(importedPages.size() < i)
				throw new DocumentException(MessageLocalization.getComposedMessage("there.are.not.enough.imported.pages.for.copied.fields", new Object[0]));
	//* 147  317:goto            210
			((HashMap)indirectMap.get(((Object) (pdfreader)))).put(((Object) (new RefKey(pdfreader.pageRefs.getPageOrigRef(i)))), ((Object) (new IndirectReferences((PdfIndirectReference)pageReferences.get(i - 1)))));
	//  148  320:aload_0         
	//  149  321:getfield        #304 <Field HashMap indirectMap>
	//  150  324:aload_1         
	//  151  325:invokevirtual   #472 <Method Object HashMap.get(Object)>
	//  152  328:checkcast       #283 <Class HashMap>
	//  153  331:new             #682 <Class RefKey>
	//  154  334:dup             
	//  155  335:aload_1         
	//  156  336:getfield        #1213 <Field PdfReader$PageRefs PdfReader.pageRefs>
	//  157  339:iload_2         
	//  158  340:invokevirtual   #1216 <Method PRIndirectReference PdfReader$PageRefs.getPageOrigRef(int)>
	//  159  343:invokespecial   #930 <Method void RefKey(PRIndirectReference)>
	//  160  346:new             #9   <Class PdfCopy$IndirectReferences>
	//  161  349:dup             
	//  162  350:aload_0         
	//  163  351:getfield        #1102 <Field ArrayList pageReferences>
	//  164  354:iload_2         
	//  165  355:iconst_1        
	//  166  356:isub            
	//  167  357:invokevirtual   #486 <Method Object ArrayList.get(int)>
	//  168  360:checkcast       #713 <Class PdfIndirectReference>
	//  169  363:invokespecial   #1109 <Method void PdfCopy$IndirectReferences(PdfIndirectReference)>
	//  170  366:invokevirtual   #479 <Method Object HashMap.put(Object, Object)>
	//  171  369:pop             
			for(int j = 0; j < pdfarray.size(); j++)
	//* 172  370:iconst_0        
	//* 173  371:istore_3        
	//* 174  372:iload_3         
	//* 175  373:aload           6
	//* 176  375:invokevirtual   #475 <Method int PdfArray.size()>
	//* 177  378:icmpge          448
			{
				PdfDictionary pdfdictionary1 = pdfarray.getAsDict(j);
	//  178  381:aload           6
	//  179  383:iload_3         
	//  180  384:invokevirtual   #1009 <Method PdfDictionary PdfArray.getAsDict(int)>
	//  181  387:astore          7
				if(pdfdictionary1 != null)
	//* 182  389:aload           7
	//* 183  391:ifnull          441
				{
					PdfName pdfname = annotId;
	//  184  394:getstatic       #123 <Field PdfName annotId>
	//  185  397:astore          8
					int k = annotIdCnt + 1;
	//  186  399:getstatic       #125 <Field int annotIdCnt>
	//  187  402:iconst_1        
	//  188  403:iadd            
	//  189  404:istore          4
					annotIdCnt = k;
	//  190  406:iload           4
	//  191  408:putstatic       #125 <Field int annotIdCnt>
					pdfdictionary1.put(pdfname, ((PdfObject) (new PdfNumber(k))));
	//  192  411:aload           7
	//  193  413:aload           8
	//  194  415:new             #465 <Class PdfNumber>
	//  195  418:dup             
	//  196  419:iload           4
	//  197  421:invokespecial   #752 <Method void PdfNumber(int)>
	//  198  424:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
					((List) (obj)).add(((Object) (pdfarray.getPdfObject(j))));
	//  199  427:aload           5
	//  200  429:aload           6
	//  201  431:iload_3         
	//  202  432:invokevirtual   #811 <Method PdfObject PdfArray.getPdfObject(int)>
	//  203  435:invokeinterface #1219 <Method boolean List.add(Object)>
	//  204  440:pop             
				}
			}

	//  205  441:iload_3         
	//  206  442:iconst_1        
	//  207  443:iadd            
	//  208  444:istore_3        
		}

	//  209  445:goto            372
	//  210  448:iload_2         
	//  211  449:iconst_1        
	//  212  450:iadd            
	//  213  451:istore_2        
	//* 214  452:goto            221
		for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); copyObject((PdfObject)((Iterator) (obj)).next()));
	//  215  455:aload           5
	//  216  457:invokeinterface #1220 <Method Iterator List.iterator()>
	//  217  462:astore          5
	//  218  464:aload           5
	//  219  466:invokeinterface #365 <Method boolean Iterator.hasNext()>
	//  220  471:ifeq            492
	//  221  474:aload_0         
	//  222  475:aload           5
	//  223  477:invokeinterface #369 <Method Object Iterator.next()>
	//  224  482:checkcast       #695 <Class PdfObject>
	//  225  485:invokevirtual   #1222 <Method PdfObject copyObject(PdfObject)>
	//  226  488:pop             
	//* 227  489:goto            464
		if(tagged && structTreeController != null)
	//* 228  492:aload_0         
	//* 229  493:getfield        #1017 <Field boolean tagged>
	//* 230  496:ifeq            514
	//* 231  499:aload_0         
	//* 232  500:getfield        #269 <Field PdfStructTreeController structTreeController>
	//* 233  503:ifnull          514
			structTreeController.attachStructTreeRootKids(((PdfObject) (null)));
	//  234  506:aload_0         
	//  235  507:getfield        #269 <Field PdfStructTreeController structTreeController>
	//  236  510:aconst_null     
	//  237  511:invokevirtual   #1225 <Method void PdfStructTreeController.attachStructTreeRootKids(PdfObject)>
		obj = ((Object) (pdfreader.getAcroFields()));
	//  238  514:aload_1         
	//  239  515:invokevirtual   #915 <Method AcroFields PdfReader.getAcroFields()>
	//  240  518:astore          5
		boolean flag;
		if(!((AcroFields) (obj)).isGenerateAppearances())
	//* 241  520:aload           5
	//* 242  522:invokevirtual   #1012 <Method boolean AcroFields.isGenerateAppearances()>
	//* 243  525:ifne            560
			flag = true;
	//  244  528:iconst_1        
	//  245  529:istore_2        
		else
	//* 246  530:iload_2         
	//* 247  531:ifeq            539
	//* 248  534:aload_0         
	//* 249  535:iconst_1        
	//* 250  536:putfield        #277 <Field boolean needAppearances>
	//* 251  539:aload_0         
	//* 252  540:getfield        #602 <Field ArrayList fields>
	//* 253  543:aload           5
	//* 254  545:invokevirtual   #476 <Method boolean ArrayList.add(Object)>
	//* 255  548:pop             
	//* 256  549:aload_0         
	//* 257  550:aload_1         
	//* 258  551:invokespecial   #1014 <Method void updateCalculationOrder(PdfReader)>
	//* 259  554:aload_0         
	//* 260  555:aconst_null     
	//* 261  556:putfield        #1114 <Field PRIndirectReference structTreeRootReference>
	//* 262  559:return          
			flag = false;
	//  263  560:iconst_0        
	//  264  561:istore_2        
		if(flag)
			needAppearances = true;
		fields.add(obj);
		updateCalculationOrder(pdfreader);
		structTreeRootReference = null;
	//* 265  562:goto            530
	}

	protected PdfIndirectReference copyIndirect(PRIndirectReference prindirectreference)
		throws IOException, BadPdfFormatException
	{
		return copyIndirect(prindirectreference, false, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #1230 <Method PdfIndirectReference copyIndirect(PRIndirectReference, boolean, boolean)>
	//    5    7:areturn         
	}

	protected PdfIndirectReference copyIndirect(PRIndirectReference prindirectreference, boolean flag, boolean flag1)
		throws IOException, BadPdfFormatException
	{
		IndirectReferences indirectreferences;
		RefKey refkey;
		PdfObject pdfobject;
		refkey = new RefKey(prindirectreference);
	//    0    0:new             #682 <Class RefKey>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #930 <Method void RefKey(PRIndirectReference)>
	//    4    8:astore          7
		indirectreferences = (IndirectReferences)indirects.get(((Object) (refkey)));
	//    5   10:aload_0         
	//    6   11:getfield        #1096 <Field HashMap indirects>
	//    7   14:aload           7
	//    8   16:invokevirtual   #472 <Method Object HashMap.get(Object)>
	//    9   19:checkcast       #9   <Class PdfCopy$IndirectReferences>
	//   10   22:astore          6
		pdfobject = PdfReader.getPdfObjectRelease(((PdfObject) (prindirectreference)));
	//   11   24:aload_1         
	//   12   25:invokestatic    #1161 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   13   28:astore          8
		if(!flag || !flag1 || !(pdfobject instanceof PdfDictionary) || !((PdfDictionary)pdfobject).contains(PdfName.PG)) goto _L2; else goto _L1
	//   14   30:iload_2         
	//   15   31:ifeq            66
	//   16   34:iload_3         
	//   17   35:ifeq            66
	//   18   38:aload           8
	//   19   40:instanceof      #331 <Class PdfDictionary>
	//   20   43:ifeq            66
	//   21   46:aload           8
	//   22   48:checkcast       #331 <Class PdfDictionary>
	//   23   51:getstatic       #711 <Field PdfName PdfName.PG>
	//   24   54:invokevirtual   #395 <Method boolean PdfDictionary.contains(PdfName)>
	//   25   57:ifeq            66
_L1:
		PdfIndirectReference pdfindirectreference = null;
	//   26   60:aconst_null     
	//   27   61:astore          4
_L4:
		return pdfindirectreference;
	//   28   63:aload           4
	//   29   65:areturn         
_L2:
		PdfIndirectReference pdfindirectreference1;
		if(indirectreferences == null)
			break; /* Loop/switch isn't completed */
	//   30   66:aload           6
	//   31   68:ifnull          170
		pdfindirectreference1 = indirectreferences.getRef();
	//   32   71:aload           6
	//   33   73:invokevirtual   #933 <Method PdfIndirectReference PdfCopy$IndirectReferences.getRef()>
	//   34   76:astore          5
		pdfindirectreference = pdfindirectreference1;
	//   35   78:aload           5
	//   36   80:astore          4
		if(indirectreferences.getCopied())
			continue; /* Loop/switch isn't completed */
	//   37   82:aload           6
	//   38   84:invokevirtual   #1099 <Method boolean PdfCopy$IndirectReferences.getCopied()>
	//   39   87:ifne            63
_L5:
		if(pdfobject == null || !pdfobject.isDictionary())
			break MISSING_BLOCK_LABEL_205;
	//   40   90:aload           8
	//   41   92:ifnull          205
	//   42   95:aload           8
	//   43   97:invokevirtual   #701 <Method boolean PdfObject.isDictionary()>
	//   44  100:ifeq            205
		PdfObject pdfobject1 = PdfReader.getPdfObjectRelease(((PdfDictionary)pdfobject).get(PdfName.TYPE));
	//   45  103:aload           8
	//   46  105:checkcast       #331 <Class PdfDictionary>
	//   47  108:getstatic       #209 <Field PdfName PdfName.TYPE>
	//   48  111:invokevirtual   #570 <Method PdfObject PdfDictionary.get(PdfName)>
	//   49  114:invokestatic    #1161 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   50  117:astore          9
		if(pdfobject1 == null)
			break MISSING_BLOCK_LABEL_205;
	//   51  119:aload           9
	//   52  121:ifnull          205
		pdfindirectreference = pdfindirectreference1;
	//   53  124:aload           5
	//   54  126:astore          4
		if(!PdfName.PAGE.equals(((Object) (pdfobject1))))
	//*  55  128:getstatic       #1181 <Field PdfName PdfName.PAGE>
	//*  56  131:aload           9
	//*  57  133:invokevirtual   #664 <Method boolean PdfName.equals(Object)>
	//*  58  136:ifne            63
		{
			if(PdfName.CATALOG.equals(((Object) (pdfobject1))))
	//*  59  139:getstatic       #1233 <Field PdfName PdfName.CATALOG>
	//*  60  142:aload           9
	//*  61  144:invokevirtual   #664 <Method boolean PdfName.equals(Object)>
	//*  62  147:ifeq            205
			{
				LOGGER.warn(MessageLocalization.getComposedMessage("make.copy.of.catalog.dictionary.is.forbidden", new Object[0]));
	//   63  150:getstatic       #105 <Field Logger LOGGER>
	//   64  153:ldc2            #1235 <String "make.copy.of.catalog.dictionary.is.forbidden">
	//   65  156:iconst_0        
	//   66  157:anewarray       Object[]
	//   67  160:invokestatic    #980 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   68  163:invokeinterface #1240 <Method void Logger.warn(String)>
				return null;
	//   69  168:aconst_null     
	//   70  169:areturn         
			}
			break MISSING_BLOCK_LABEL_205;
		}
		if(true) goto _L4; else goto _L3
_L3:
		pdfindirectreference1 = body.getPdfIndirectReference();
	//   71  170:aload_0         
	//   72  171:getfield        #953 <Field PdfWriter$PdfBody body>
	//   73  174:invokevirtual   #1119 <Method PdfIndirectReference PdfWriter$PdfBody.getPdfIndirectReference()>
	//   74  177:astore          5
		indirectreferences = new IndirectReferences(pdfindirectreference1);
	//   75  179:new             #9   <Class PdfCopy$IndirectReferences>
	//   76  182:dup             
	//   77  183:aload           5
	//   78  185:invokespecial   #1109 <Method void PdfCopy$IndirectReferences(PdfIndirectReference)>
	//   79  188:astore          6
		indirects.put(((Object) (refkey)), ((Object) (indirectreferences)));
	//   80  190:aload_0         
	//   81  191:getfield        #1096 <Field HashMap indirects>
	//   82  194:aload           7
	//   83  196:aload           6
	//   84  198:invokevirtual   #479 <Method Object HashMap.put(Object, Object)>
	//   85  201:pop             
		  goto _L5
		if(true) goto _L4; else goto _L6
	//*  86  202:goto            90
_L6:
		indirectreferences.setCopied();
	//   87  205:aload           6
	//   88  207:invokevirtual   #1105 <Method void PdfCopy$IndirectReferences.setCopied()>
		if(pdfobject != null)
	//*  89  210:aload           8
	//*  90  212:ifnull          226
			parentObjects.put(((Object) (pdfobject)), ((Object) (prindirectreference)));
	//   91  215:aload_0         
	//   92  216:getfield        #306 <Field HashMap parentObjects>
	//   93  219:aload           8
	//   94  221:aload_1         
	//   95  222:invokevirtual   #479 <Method Object HashMap.put(Object, Object)>
	//   96  225:pop             
		prindirectreference = ((PRIndirectReference) (copyObject(pdfobject, flag, flag1)));
	//   97  226:aload_0         
	//   98  227:aload           8
	//   99  229:iload_2         
	//  100  230:iload_3         
	//  101  231:invokevirtual   #1153 <Method PdfObject copyObject(PdfObject, boolean, boolean)>
	//  102  234:astore_1        
		if(disableIndirects.contains(((Object) (pdfobject))))
	//* 103  235:aload_0         
	//* 104  236:getfield        #308 <Field HashSet disableIndirects>
	//* 105  239:aload           8
	//* 106  241:invokevirtual   #666 <Method boolean HashSet.contains(Object)>
	//* 107  244:ifeq            252
			indirectreferences.setNotCopied();
	//  108  247:aload           6
	//  109  249:invokevirtual   #1243 <Method void PdfCopy$IndirectReferences.setNotCopied()>
		if(prindirectreference != null)
	//* 110  252:aload_1         
	//* 111  253:ifnull          267
		{
			addToBody(((PdfObject) (prindirectreference)), pdfindirectreference1);
	//  112  256:aload_0         
	//  113  257:aload_1         
	//  114  258:aload           5
	//  115  260:invokevirtual   #724 <Method PdfIndirectObject addToBody(PdfObject, PdfIndirectReference)>
	//  116  263:pop             
			return pdfindirectreference1;
	//  117  264:aload           5
	//  118  266:areturn         
		} else
		{
			indirects.remove(((Object) (refkey)));
	//  119  267:aload_0         
	//  120  268:getfield        #1096 <Field HashMap indirects>
	//  121  271:aload           7
	//  122  273:invokevirtual   #706 <Method Object HashMap.remove(Object)>
	//  123  276:pop             
			return null;
	//  124  277:aconst_null     
	//  125  278:areturn         
		}
	}

	protected PdfObject copyObject(PdfObject pdfobject)
		throws IOException, BadPdfFormatException
	{
		return copyObject(pdfobject, false, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #1153 <Method PdfObject copyObject(PdfObject, boolean, boolean)>
	//    5    7:areturn         
	}

	protected PdfObject copyObject(PdfObject pdfobject, boolean flag, boolean flag1)
		throws IOException, BadPdfFormatException
	{
		if(pdfobject != null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnonnull       12
_L1:
		Object obj = ((Object) (PdfNull.PDFNULL));
	//    2    4:getstatic       #1247 <Field PdfNull PdfNull.PDFNULL>
	//    3    7:astore          4
_L4:
		return ((PdfObject) (obj));
	//    4    9:aload           4
	//    5   11:areturn         
_L2:
		obj = ((Object) (pdfobject));
	//    6   12:aload_1         
	//    7   13:astore          4
		switch(pdfobject.type)
	//*   8   15:aload_1         
	//*   9   16:getfield        #1249 <Field int PdfObject.type>
		{
	//*  10   19:tableswitch     0 10: default 76
	//	               0 9
	//	               1 9
	//	               2 9
	//	               3 9
	//	               4 9
	//	               5 159
	//	               6 120
	//	               7 170
	//	               8 9
	//	               9 76
	//	               10 131
		case 9: // '\t'
		default:
			if(pdfobject.type < 0)
	//*  11   76:aload_1         
	//*  12   77:getfield        #1249 <Field int PdfObject.type>
	//*  13   80:ifge            188
			{
				pdfobject = ((PdfObject) (((PdfLiteral)pdfobject).toString()));
	//   14   83:aload_1         
	//   15   84:checkcast       #1251 <Class PdfLiteral>
	//   16   87:invokevirtual   #1252 <Method String PdfLiteral.toString()>
	//   17   90:astore_1        
				if(((String) (pdfobject)).equals("true") || ((String) (pdfobject)).equals("false"))
	//*  18   91:aload_1         
	//*  19   92:ldc2            #1254 <String "true">
	//*  20   95:invokevirtual   #1255 <Method boolean String.equals(Object)>
	//*  21   98:ifne            111
	//*  22  101:aload_1         
	//*  23  102:ldc2            #1257 <String "false">
	//*  24  105:invokevirtual   #1255 <Method boolean String.equals(Object)>
	//*  25  108:ifeq            179
					return ((PdfObject) (new PdfBoolean(((String) (pdfobject)))));
	//   26  111:new             #735 <Class PdfBoolean>
	//   27  114:dup             
	//   28  115:aload_1         
	//   29  116:invokespecial   #1258 <Method void PdfBoolean(String)>
	//   30  119:areturn         
				else
	//*  31  120:aload_0         
	//*  32  121:aload_1         
	//*  33  122:checkcast       #331 <Class PdfDictionary>
	//*  34  125:iload_2         
	//*  35  126:iload_3         
	//*  36  127:invokevirtual   #1156 <Method PdfDictionary copyDictionary(PdfDictionary, boolean, boolean)>
	//*  37  130:areturn         
	//*  38  131:iload_2         
	//*  39  132:ifne            148
	//*  40  135:iload_3         
	//*  41  136:ifne            148
	//*  42  139:aload_0         
	//*  43  140:aload_1         
	//*  44  141:checkcast       #829 <Class PRIndirectReference>
	//*  45  144:invokevirtual   #1260 <Method PdfIndirectReference copyIndirect(PRIndirectReference)>
	//*  46  147:areturn         
	//*  47  148:aload_0         
	//*  48  149:aload_1         
	//*  49  150:checkcast       #829 <Class PRIndirectReference>
	//*  50  153:iload_2         
	//*  51  154:iload_3         
	//*  52  155:invokevirtual   #1230 <Method PdfIndirectReference copyIndirect(PRIndirectReference, boolean, boolean)>
	//*  53  158:areturn         
	//*  54  159:aload_0         
	//*  55  160:aload_1         
	//*  56  161:checkcast       #474 <Class PdfArray>
	//*  57  164:iload_2         
	//*  58  165:iload_3         
	//*  59  166:invokevirtual   #1144 <Method PdfArray copyArray(PdfArray, boolean, boolean)>
	//*  60  169:areturn         
	//*  61  170:aload_0         
	//*  62  171:aload_1         
	//*  63  172:checkcast       #1262 <Class PRStream>
	//*  64  175:invokevirtual   #1266 <Method PdfStream copyStream(PRStream)>
	//*  65  178:areturn         
					return ((PdfObject) (new PdfLiteral(((String) (pdfobject)))));
	//   66  179:new             #1251 <Class PdfLiteral>
	//   67  182:dup             
	//   68  183:aload_1         
	//   69  184:invokespecial   #1267 <Method void PdfLiteral(String)>
	//   70  187:areturn         
			} else
			{
				System.out.println((new StringBuilder()).append("CANNOT COPY type ").append(pdfobject.type).toString());
	//   71  188:getstatic       #1273 <Field PrintStream System.out>
	//   72  191:new             #530 <Class StringBuilder>
	//   73  194:dup             
	//   74  195:invokespecial   #531 <Method void StringBuilder()>
	//   75  198:ldc2            #1275 <String "CANNOT COPY type ">
	//   76  201:invokevirtual   #535 <Method StringBuilder StringBuilder.append(String)>
	//   77  204:aload_1         
	//   78  205:getfield        #1249 <Field int PdfObject.type>
	//   79  208:invokevirtual   #1278 <Method StringBuilder StringBuilder.append(int)>
	//   80  211:invokevirtual   #541 <Method String StringBuilder.toString()>
	//   81  214:invokevirtual   #1283 <Method void PrintStream.println(String)>
				return null;
	//   82  217:aconst_null     
	//   83  218:areturn         
			}

		case 6: // '\006'
			return ((PdfObject) (copyDictionary((PdfDictionary)pdfobject, flag, flag1)));

		case 10: // '\n'
			if(!flag && !flag1)
				return ((PdfObject) (copyIndirect((PRIndirectReference)pdfobject)));
			else
				return ((PdfObject) (copyIndirect((PRIndirectReference)pdfobject, flag, flag1)));

		case 5: // '\005'
			return ((PdfObject) (copyArray((PdfArray)pdfobject, flag, flag1)));

		case 7: // '\007'
			return ((PdfObject) (copyStream((PRStream)pdfobject)));

		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
		case 8: // '\b'
			break;
		}
		if(true) goto _L4; else goto _L3
_L3:
	}

	protected PdfStream copyStream(PRStream prstream)
		throws IOException, BadPdfFormatException
	{
		PRStream prstream1 = new PRStream(prstream, ((PdfDictionary) (null)));
	//    0    0:new             #1262 <Class PRStream>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #1286 <Method void PRStream(PRStream, PdfDictionary)>
	//    5    9:astore_2        
		Iterator iterator = prstream.getKeys().iterator();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #1287 <Method Set PRStream.getKeys()>
	//    8   14:invokeinterface #504 <Method Iterator Set.iterator()>
	//    9   19:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   10   20:aload_3         
	//   11   21:invokeinterface #365 <Method boolean Iterator.hasNext()>
	//   12   26:ifeq            83
			PdfName pdfname = (PdfName)iterator.next();
	//   13   29:aload_3         
	//   14   30:invokeinterface #369 <Method Object Iterator.next()>
	//   15   35:checkcast       #115 <Class PdfName>
	//   16   38:astore          4
			PdfObject pdfobject = prstream.get(pdfname);
	//   17   40:aload_1         
	//   18   41:aload           4
	//   19   43:invokevirtual   #1288 <Method PdfObject PRStream.get(PdfName)>
	//   20   46:astore          5
			parentObjects.put(((Object) (pdfobject)), ((Object) (prstream)));
	//   21   48:aload_0         
	//   22   49:getfield        #306 <Field HashMap parentObjects>
	//   23   52:aload           5
	//   24   54:aload_1         
	//   25   55:invokevirtual   #479 <Method Object HashMap.put(Object, Object)>
	//   26   58:pop             
			pdfobject = copyObject(pdfobject);
	//   27   59:aload_0         
	//   28   60:aload           5
	//   29   62:invokevirtual   #1222 <Method PdfObject copyObject(PdfObject)>
	//   30   65:astore          5
			if(pdfobject != null)
	//*  31   67:aload           5
	//*  32   69:ifnull          20
				prstream1.put(pdfname, pdfobject);
	//   33   72:aload_2         
	//   34   73:aload           4
	//   35   75:aload           5
	//   36   77:invokevirtual   #1289 <Method void PRStream.put(PdfName, PdfObject)>
		} while(true);
	//   37   80:goto            20
		return ((PdfStream) (prstream1));
	//   38   83:aload_2         
	//   39   84:areturn         
	}

	public PageStamp createPageStamp(PdfImportedPage pdfimportedpage)
	{
		int i = pdfimportedpage.getPageNumber();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #1294 <Method int PdfImportedPage.getPageNumber()>
	//    2    4:istore_2        
		pdfimportedpage = ((PdfImportedPage) (pdfimportedpage.getPdfReaderInstance().getReader()));
	//    3    5:aload_1         
	//    4    6:invokevirtual   #1298 <Method PdfReaderInstance PdfImportedPage.getPdfReaderInstance()>
	//    5    9:invokevirtual   #1301 <Method PdfReader PdfReaderInstance.getReader()>
	//    6   12:astore_1        
		if(isTagged())
	//*   7   13:aload_0         
	//*   8   14:invokevirtual   #1304 <Method boolean isTagged()>
	//*   9   17:ifeq            38
			throw new RuntimeException(MessageLocalization.getComposedMessage("creating.page.stamp.not.allowed.for.tagged.reader", new Object[0]));
	//   10   20:new             #1306 <Class RuntimeException>
	//   11   23:dup             
	//   12   24:ldc2            #1308 <String "creating.page.stamp.not.allowed.for.tagged.reader">
	//   13   27:iconst_0        
	//   14   28:anewarray       Object[]
	//   15   31:invokestatic    #980 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   16   34:invokespecial   #1309 <Method void RuntimeException(String)>
	//   17   37:athrow          
		else
			return new PageStamp(((PdfReader) (pdfimportedpage)), ((PdfReader) (pdfimportedpage)).getPageN(i), this);
	//   18   38:new             #12  <Class PdfCopy$PageStamp>
	//   19   41:dup             
	//   20   42:aload_1         
	//   21   43:aload_1         
	//   22   44:iload_2         
	//   23   45:invokevirtual   #1087 <Method PdfDictionary PdfReader.getPageN(int)>
	//   24   48:aload_0         
	//   25   49:invokespecial   #1312 <Method void PdfCopy$PageStamp(PdfReader, PdfDictionary, PdfCopy)>
	//   26   52:areturn         
	}

	protected void fixStructureTreeRoot(HashSet hashset, HashSet hashset1)
	{
		HashMap hashmap = new HashMap(hashset1.size());
	//    0    0:new             #283 <Class HashMap>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:invokevirtual   #1315 <Method int HashSet.size()>
	//    4    8:invokespecial   #1316 <Method void HashMap(int)>
	//    5   11:astore          5
		hashset1 = ((HashSet) (hashset1.iterator()));
	//    6   13:aload_2         
	//    7   14:invokevirtual   #360 <Method Iterator HashSet.iterator()>
	//    8   17:astore_2        
		do
		{
			if(!((Iterator) (hashset1)).hasNext())
				break;
	//    9   18:aload_2         
	//   10   19:invokeinterface #365 <Method boolean Iterator.hasNext()>
	//   11   24:ifeq            73
			PdfName pdfname = (PdfName)((Iterator) (hashset1)).next();
	//   12   27:aload_2         
	//   13   28:invokeinterface #369 <Method Object Iterator.next()>
	//   14   33:checkcast       #115 <Class PdfName>
	//   15   36:astore          6
			PdfObject pdfobject = (PdfObject)structureTreeRoot.classes.get(((Object) (pdfname)));
	//   16   38:aload_0         
	//   17   39:getfield        #1192 <Field PdfStructureTreeRoot structureTreeRoot>
	//   18   42:getfield        #1319 <Field HashMap PdfStructureTreeRoot.classes>
	//   19   45:aload           6
	//   20   47:invokevirtual   #472 <Method Object HashMap.get(Object)>
	//   21   50:checkcast       #695 <Class PdfObject>
	//   22   53:astore          7
			if(pdfobject != null)
	//*  23   55:aload           7
	//*  24   57:ifnull          18
				hashmap.put(((Object) (pdfname)), ((Object) (pdfobject)));
	//   25   60:aload           5
	//   26   62:aload           6
	//   27   64:aload           7
	//   28   66:invokevirtual   #479 <Method Object HashMap.put(Object, Object)>
	//   29   69:pop             
		} while(true);
	//   30   70:goto            18
		structureTreeRoot.classes = hashmap;
	//   31   73:aload_0         
	//   32   74:getfield        #1192 <Field PdfStructureTreeRoot structureTreeRoot>
	//   33   77:aload           5
	//   34   79:putfield        #1319 <Field HashMap PdfStructureTreeRoot.classes>
		hashset1 = ((HashSet) (structureTreeRoot.getAsArray(PdfName.K)));
	//   35   82:aload_0         
	//   36   83:getfield        #1192 <Field PdfStructureTreeRoot structureTreeRoot>
	//   37   86:getstatic       #808 <Field PdfName PdfName.K>
	//   38   89:invokevirtual   #1320 <Method PdfArray PdfStructureTreeRoot.getAsArray(PdfName)>
	//   39   92:astore_2        
		if(hashset1 != null)
	//*  40   93:aload_2         
	//*  41   94:ifnull          151
		{
			int j;
			for(int i = 0; i < ((PdfArray) (hashset1)).size(); i = j + 1)
	//*  42   97:iconst_0        
	//*  43   98:istore_3        
	//*  44   99:iload_3         
	//*  45  100:aload_2         
	//*  46  101:invokevirtual   #475 <Method int PdfArray.size()>
	//*  47  104:icmpge          151
			{
				j = i;
	//   48  107:iload_3         
	//   49  108:istore          4
				if(!hashset.contains(((Object) (new RefKey((PdfIndirectReference)((PdfArray) (hashset1)).getPdfObject(i))))))
	//*  50  110:aload_1         
	//*  51  111:new             #682 <Class RefKey>
	//*  52  114:dup             
	//*  53  115:aload_2         
	//*  54  116:iload_3         
	//*  55  117:invokevirtual   #811 <Method PdfObject PdfArray.getPdfObject(int)>
	//*  56  120:checkcast       #713 <Class PdfIndirectReference>
	//*  57  123:invokespecial   #688 <Method void RefKey(PdfIndirectReference)>
	//*  58  126:invokevirtual   #666 <Method boolean HashSet.contains(Object)>
	//*  59  129:ifne            143
				{
					((PdfArray) (hashset1)).remove(i);
	//   60  132:aload_2         
	//   61  133:iload_3         
	//   62  134:invokevirtual   #813 <Method PdfObject PdfArray.remove(int)>
	//   63  137:pop             
					j = i - 1;
	//   64  138:iload_3         
	//   65  139:iconst_1        
	//   66  140:isub            
	//   67  141:istore          4
				}
			}

	//   68  143:iload           4
	//   69  145:iconst_1        
	//   70  146:iadd            
	//   71  147:istore_3        
		}
	//*  72  148:goto            99
	//   73  151:return          
	}

	protected void fixTaggedStructure()
		throws IOException
	{
		int i;
		int k;
		HashSet hashset;
		ArrayList arraylist;
		HashMap hashmap;
		hashmap = structureTreeRoot.getNumTree();
	//    0    0:aload_0         
	//    1    1:getfield        #1192 <Field PdfStructureTreeRoot structureTreeRoot>
	//    2    4:invokevirtual   #1326 <Method HashMap PdfStructureTreeRoot.getNumTree()>
	//    3    7:astore          9
		hashset = new HashSet();
	//    4    9:new             #139 <Class HashSet>
	//    5   12:dup             
	//    6   13:invokespecial   #141 <Method void HashSet()>
	//    7   16:astore          7
		arraylist = new ArrayList();
	//    8   18:new             #315 <Class ArrayList>
	//    9   21:dup             
	//   10   22:invokespecial   #316 <Method void ArrayList()>
	//   11   25:astore          8
		if(mergeFields && acroForm != null)
	//*  12   27:aload_0         
	//*  13   28:getfield        #275 <Field boolean mergeFields>
	//*  14   31:ifeq            68
	//*  15   34:aload_0         
	//*  16   35:getfield        #757 <Field PdfIndirectReference acroForm>
	//*  17   38:ifnull          68
		{
			arraylist.add(((Object) (acroForm)));
	//   18   41:aload           8
	//   19   43:aload_0         
	//   20   44:getfield        #757 <Field PdfIndirectReference acroForm>
	//   21   47:invokevirtual   #476 <Method boolean ArrayList.add(Object)>
	//   22   50:pop             
			hashset.add(((Object) (new RefKey(acroForm))));
	//   23   51:aload           7
	//   24   53:new             #682 <Class RefKey>
	//   25   56:dup             
	//   26   57:aload_0         
	//   27   58:getfield        #757 <Field PdfIndirectReference acroForm>
	//   28   61:invokespecial   #688 <Method void RefKey(PdfIndirectReference)>
	//   29   64:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//   30   67:pop             
		}
		PdfIndirectReference pdfindirectreference;
		for(Iterator iterator = pageReferences.iterator(); iterator.hasNext(); hashset.add(((Object) (new RefKey(pdfindirectreference)))))
	//*  31   68:aload_0         
	//*  32   69:getfield        #1102 <Field ArrayList pageReferences>
	//*  33   72:invokevirtual   #670 <Method Iterator ArrayList.iterator()>
	//*  34   75:astore          5
	//*  35   77:aload           5
	//*  36   79:invokeinterface #365 <Method boolean Iterator.hasNext()>
	//*  37   84:ifeq            125
		{
			pdfindirectreference = (PdfIndirectReference)iterator.next();
	//   38   87:aload           5
	//   39   89:invokeinterface #369 <Method Object Iterator.next()>
	//   40   94:checkcast       #713 <Class PdfIndirectReference>
	//   41   97:astore          6
			arraylist.add(((Object) (pdfindirectreference)));
	//   42   99:aload           8
	//   43  101:aload           6
	//   44  103:invokevirtual   #476 <Method boolean ArrayList.add(Object)>
	//   45  106:pop             
		}

	//   46  107:aload           7
	//   47  109:new             #682 <Class RefKey>
	//   48  112:dup             
	//   49  113:aload           6
	//   50  115:invokespecial   #688 <Method void RefKey(PdfIndirectReference)>
	//   51  118:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//   52  121:pop             
	//*  53  122:goto            77
		k = hashmap.size() - 1;
	//   54  125:aload           9
	//   55  127:invokevirtual   #1327 <Method int HashMap.size()>
	//   56  130:iconst_1        
	//   57  131:isub            
	//   58  132:istore_3        
		i = 0;
	//   59  133:iconst_0        
	//   60  134:istore_1        
_L1:
		Object obj;
		RefKey refkey;
		Object obj3;
		if(k < 0)
			break MISSING_BLOCK_LABEL_581;
	//   61  135:iload_3         
	//   62  136:iflt            581
		obj = ((Object) ((PdfIndirectReference)hashmap.get(((Object) (Integer.valueOf(k))))));
	//   63  139:aload           9
	//   64  141:iload_3         
	//   65  142:invokestatic    #135 <Method Integer Integer.valueOf(int)>
	//   66  145:invokevirtual   #472 <Method Object HashMap.get(Object)>
	//   67  148:checkcast       #713 <Class PdfIndirectReference>
	//   68  151:astore          5
		if(obj != null)
	//*  69  153:aload           5
	//*  70  155:ifnonnull       165
	//*  71  158:iload_3         
	//*  72  159:iconst_1        
	//*  73  160:isub            
	//*  74  161:istore_3        
	//*  75  162:goto            135
		{
			refkey = new RefKey(((PdfIndirectReference) (obj)));
	//   76  165:new             #682 <Class RefKey>
	//   77  168:dup             
	//   78  169:aload           5
	//   79  171:invokespecial   #688 <Method void RefKey(PdfIndirectReference)>
	//   80  174:astore          6
			obj3 = ((Object) (((PdfIndirectObject)indirectObjects.get(((Object) (refkey)))).object));
	//   81  176:aload_0         
	//   82  177:getfield        #313 <Field LinkedHashMap indirectObjects>
	//   83  180:aload           6
	//   84  182:invokevirtual   #689 <Method Object LinkedHashMap.get(Object)>
	//   85  185:checkcast       #422 <Class PdfIndirectObject>
	//   86  188:getfield        #693 <Field PdfObject PdfIndirectObject.object>
	//   87  191:astore          10
			if(!((PdfObject) (obj3)).isDictionary())
				continue; /* Loop/switch isn't completed */
	//   88  193:aload           10
	//   89  195:invokevirtual   #701 <Method boolean PdfObject.isDictionary()>
	//   90  198:ifeq            307
			boolean flag1 = false;
	//   91  201:iconst_0        
	//   92  202:istore          4
			boolean flag;
			if(pageReferences.contains(((Object) (((PdfDictionary)obj3).get(PdfName.PG)))))
	//*  93  204:aload_0         
	//*  94  205:getfield        #1102 <Field ArrayList pageReferences>
	//*  95  208:aload           10
	//*  96  210:checkcast       #331 <Class PdfDictionary>
	//*  97  213:getstatic       #711 <Field PdfName PdfName.PG>
	//*  98  216:invokevirtual   #570 <Method PdfObject PdfDictionary.get(PdfName)>
	//*  99  219:invokevirtual   #922 <Method boolean ArrayList.contains(Object)>
	//* 100  222:ifeq            250
			{
				flag = true;
	//  101  225:iconst_1        
	//  102  226:istore_2        
			} else
	//* 103  227:iload_2         
	//* 104  228:ifeq            294
	//* 105  231:aload           7
	//* 106  233:aload           6
	//* 107  235:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//* 108  238:pop             
	//* 109  239:aload           8
	//* 110  241:aload           5
	//* 111  243:invokevirtual   #476 <Method boolean ArrayList.add(Object)>
	//* 112  246:pop             
	//* 113  247:goto            158
			{
				obj3 = ((Object) (PdfStructTreeController.getKDict((PdfDictionary)obj3)));
	//  114  250:aload           10
	//  115  252:checkcast       #331 <Class PdfDictionary>
	//  116  255:invokestatic    #1330 <Method PdfDictionary PdfStructTreeController.getKDict(PdfDictionary)>
	//  117  258:astore          10
				flag = flag1;
	//  118  260:iload           4
	//  119  262:istore_2        
				if(obj3 != null)
	//* 120  263:aload           10
	//* 121  265:ifnull          227
				{
					flag = flag1;
	//  122  268:iload           4
	//  123  270:istore_2        
					if(pageReferences.contains(((Object) (((PdfDictionary) (obj3)).get(PdfName.PG)))))
	//* 124  271:aload_0         
	//* 125  272:getfield        #1102 <Field ArrayList pageReferences>
	//* 126  275:aload           10
	//* 127  277:getstatic       #711 <Field PdfName PdfName.PG>
	//* 128  280:invokevirtual   #570 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 129  283:invokevirtual   #922 <Method boolean ArrayList.contains(Object)>
	//* 130  286:ifeq            227
						flag = true;
	//  131  289:iconst_1        
	//  132  290:istore_2        
				}
			}
			if(flag)
			{
				hashset.add(((Object) (refkey)));
				arraylist.add(obj);
			} else
	//* 133  291:goto            227
			{
				hashmap.remove(((Object) (Integer.valueOf(k))));
	//  134  294:aload           9
	//  135  296:iload_3         
	//  136  297:invokestatic    #135 <Method Integer Integer.valueOf(int)>
	//  137  300:invokevirtual   #706 <Method Object HashMap.remove(Object)>
	//  138  303:pop             
			}
		}
_L3:
		k--;
		  goto _L1
	//* 139  304:goto            247
		if(!((PdfObject) (obj3)).isArray()) goto _L3; else goto _L2
	//  140  307:aload           10
	//  141  309:invokevirtual   #698 <Method boolean PdfObject.isArray()>
	//  142  312:ifeq            798
_L2:
		int j;
		int l;
		PdfIndirectReference pdfindirectreference2;
		hashset.add(((Object) (refkey)));
	//  143  315:aload           7
	//  144  317:aload           6
	//  145  319:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//  146  322:pop             
		arraylist.add(obj);
	//  147  323:aload           8
	//  148  325:aload           5
	//  149  327:invokevirtual   #476 <Method boolean ArrayList.add(Object)>
	//  150  330:pop             
		obj3 = ((Object) ((PdfArray)obj3));
	//  151  331:aload           10
	//  152  333:checkcast       #474 <Class PdfArray>
	//  153  336:astore          10
		obj = ((Object) (pageReferences));
	//  154  338:aload_0         
	//  155  339:getfield        #1102 <Field ArrayList pageReferences>
	//  156  342:astore          5
		l = i + 1;
	//  157  344:iload_1         
	//  158  345:iconst_1        
	//  159  346:iadd            
	//  160  347:istore          4
		pdfindirectreference2 = (PdfIndirectReference)((ArrayList) (obj)).get(i);
	//  161  349:aload           5
	//  162  351:iload_1         
	//  163  352:invokevirtual   #486 <Method Object ArrayList.get(int)>
	//  164  355:checkcast       #713 <Class PdfIndirectReference>
	//  165  358:astore          11
		arraylist.add(((Object) (pdfindirectreference2)));
	//  166  360:aload           8
	//  167  362:aload           11
	//  168  364:invokevirtual   #476 <Method boolean ArrayList.add(Object)>
	//  169  367:pop             
		hashset.add(((Object) (new RefKey(pdfindirectreference2))));
	//  170  368:aload           7
	//  171  370:new             #682 <Class RefKey>
	//  172  373:dup             
	//  173  374:aload           11
	//  174  376:invokespecial   #688 <Method void RefKey(PdfIndirectReference)>
	//  175  379:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//  176  382:pop             
		obj = null;
	//  177  383:aconst_null     
	//  178  384:astore          5
		j = 0;
	//  179  386:iconst_0        
	//  180  387:istore_2        
_L5:
		i = l;
	//  181  388:iload           4
	//  182  390:istore_1        
		if(j >= ((PdfArray) (obj3)).size()) goto _L3; else goto _L4
	//  183  391:iload_2         
	//  184  392:aload           10
	//  185  394:invokevirtual   #475 <Method int PdfArray.size()>
	//  186  397:icmpge          158
_L4:
		PdfIndirectReference pdfindirectreference1 = (PdfIndirectReference)((PdfArray) (obj3)).getDirectObject(j);
	//  187  400:aload           10
	//  188  402:iload_2         
	//  189  403:invokevirtual   #1332 <Method PdfObject PdfArray.getDirectObject(int)>
	//  190  406:checkcast       #713 <Class PdfIndirectReference>
	//  191  409:astore          6
		if(!((Object) (pdfindirectreference1)).equals(obj))
	//* 192  411:aload           6
	//* 193  413:aload           5
	//* 194  415:invokevirtual   #675 <Method boolean Object.equals(Object)>
	//* 195  418:ifeq            428
	//* 196  421:iload_2         
	//* 197  422:iconst_1        
	//* 198  423:iadd            
	//* 199  424:istore_2        
	//* 200  425:goto            388
		{
			obj = ((Object) (new RefKey(pdfindirectreference1)));
	//  201  428:new             #682 <Class RefKey>
	//  202  431:dup             
	//  203  432:aload           6
	//  204  434:invokespecial   #688 <Method void RefKey(PdfIndirectReference)>
	//  205  437:astore          5
			hashset.add(obj);
	//  206  439:aload           7
	//  207  441:aload           5
	//  208  443:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//  209  446:pop             
			arraylist.add(((Object) (pdfindirectreference1)));
	//  210  447:aload           8
	//  211  449:aload           6
	//  212  451:invokevirtual   #476 <Method boolean ArrayList.add(Object)>
	//  213  454:pop             
			obj = ((Object) ((PdfIndirectObject)indirectObjects.get(obj)));
	//  214  455:aload_0         
	//  215  456:getfield        #313 <Field LinkedHashMap indirectObjects>
	//  216  459:aload           5
	//  217  461:invokevirtual   #689 <Method Object LinkedHashMap.get(Object)>
	//  218  464:checkcast       #422 <Class PdfIndirectObject>
	//  219  467:astore          5
			if(((PdfIndirectObject) (obj)).object.isDictionary())
	//* 220  469:aload           5
	//* 221  471:getfield        #693 <Field PdfObject PdfIndirectObject.object>
	//* 222  474:invokevirtual   #701 <Method boolean PdfObject.isDictionary()>
	//* 223  477:ifeq            574
			{
				obj = ((Object) ((PdfDictionary)((PdfIndirectObject) (obj)).object));
	//  224  480:aload           5
	//  225  482:getfield        #693 <Field PdfObject PdfIndirectObject.object>
	//  226  485:checkcast       #331 <Class PdfDictionary>
	//  227  488:astore          5
				PdfIndirectReference pdfindirectreference3 = (PdfIndirectReference)((PdfDictionary) (obj)).get(PdfName.PG);
	//  228  490:aload           5
	//  229  492:getstatic       #711 <Field PdfName PdfName.PG>
	//  230  495:invokevirtual   #570 <Method PdfObject PdfDictionary.get(PdfName)>
	//  231  498:checkcast       #713 <Class PdfIndirectReference>
	//  232  501:astore          12
				if(pdfindirectreference3 != null && !pageReferences.contains(((Object) (pdfindirectreference3))) && !((Object) (pdfindirectreference3)).equals(((Object) (pdfindirectreference2))))
	//* 233  503:aload           12
	//* 234  505:ifnull          574
	//* 235  508:aload_0         
	//* 236  509:getfield        #1102 <Field ArrayList pageReferences>
	//* 237  512:aload           12
	//* 238  514:invokevirtual   #922 <Method boolean ArrayList.contains(Object)>
	//* 239  517:ifne            574
	//* 240  520:aload           12
	//* 241  522:aload           11
	//* 242  524:invokevirtual   #675 <Method boolean Object.equals(Object)>
	//* 243  527:ifne            574
				{
					((PdfDictionary) (obj)).put(PdfName.PG, ((PdfObject) (pdfindirectreference2)));
	//  244  530:aload           5
	//  245  532:getstatic       #711 <Field PdfName PdfName.PG>
	//  246  535:aload           11
	//  247  537:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
					obj = ((Object) (((PdfDictionary) (obj)).getAsArray(PdfName.K)));
	//  248  540:aload           5
	//  249  542:getstatic       #808 <Field PdfName PdfName.K>
	//  250  545:invokevirtual   #612 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//  251  548:astore          5
					if(obj != null && ((PdfArray) (obj)).getDirectObject(0).isNumber())
	//* 252  550:aload           5
	//* 253  552:ifnull          574
	//* 254  555:aload           5
	//* 255  557:iconst_0        
	//* 256  558:invokevirtual   #1332 <Method PdfObject PdfArray.getDirectObject(int)>
	//* 257  561:invokevirtual   #864 <Method boolean PdfObject.isNumber()>
	//* 258  564:ifeq            574
						((PdfArray) (obj)).remove(0);
	//  259  567:aload           5
	//  260  569:iconst_0        
	//  261  570:invokevirtual   #813 <Method PdfObject PdfArray.remove(int)>
	//  262  573:pop             
				}
			}
			obj = ((Object) (pdfindirectreference1));
	//  263  574:aload           6
	//  264  576:astore          5
		}
		j++;
		  goto _L5
		  goto _L3
	//* 265  578:goto            421
		Object obj1 = ((Object) (new HashSet()));
	//  266  581:new             #139 <Class HashSet>
	//  267  584:dup             
	//  268  585:invokespecial   #141 <Method void HashSet()>
	//  269  588:astore          5
		findActives(arraylist, hashset, ((HashSet) (obj1)));
	//  270  590:aload_0         
	//  271  591:aload           8
	//  272  593:aload           7
	//  273  595:aload           5
	//  274  597:invokespecial   #1334 <Method void findActives(ArrayList, HashSet, HashSet)>
		fixPgKey(findActiveParents(hashset), hashset);
	//  275  600:aload_0         
	//  276  601:aload_0         
	//  277  602:aload           7
	//  278  604:invokespecial   #1336 <Method ArrayList findActiveParents(HashSet)>
	//  279  607:aload           7
	//  280  609:invokespecial   #1338 <Method void fixPgKey(ArrayList, HashSet)>
		fixStructureTreeRoot(hashset, ((HashSet) (obj1)));
	//  281  612:aload_0         
	//  282  613:aload           7
	//  283  615:aload           5
	//  284  617:invokevirtual   #1340 <Method void fixStructureTreeRoot(HashSet, HashSet)>
		obj1 = ((Object) (indirectObjects.entrySet().iterator()));
	//  285  620:aload_0         
	//  286  621:getfield        #313 <Field LinkedHashMap indirectObjects>
	//  287  624:invokevirtual   #1341 <Method Set LinkedHashMap.entrySet()>
	//  288  627:invokeinterface #504 <Method Iterator Set.iterator()>
	//  289  632:astore          5
		do
		{
			if(!((Iterator) (obj1)).hasNext())
				break;
	//  290  634:aload           5
	//  291  636:invokeinterface #365 <Method boolean Iterator.hasNext()>
	//  292  641:ifeq            797
			Object obj2 = ((Object) ((java.util.Map.Entry)((Iterator) (obj1)).next()));
	//  293  644:aload           5
	//  294  646:invokeinterface #369 <Method Object Iterator.next()>
	//  295  651:checkcast       #506 <Class java.util.Map$Entry>
	//  296  654:astore          6
			if(!hashset.contains(((java.util.Map.Entry) (obj2)).getKey()))
	//* 297  656:aload           7
	//* 298  658:aload           6
	//* 299  660:invokeinterface #509 <Method Object java.util.Map$Entry.getKey()>
	//* 300  665:invokevirtual   #666 <Method boolean HashSet.contains(Object)>
	//* 301  668:ifne            683
				((java.util.Map.Entry) (obj2)).setValue(((Object) (null)));
	//  302  671:aload           6
	//  303  673:aconst_null     
	//  304  674:invokeinterface #1344 <Method Object java.util.Map$Entry.setValue(Object)>
	//  305  679:pop             
			else
	//* 306  680:goto            634
			if(((PdfIndirectObject)((java.util.Map.Entry) (obj2)).getValue()).object.isArray())
	//* 307  683:aload           6
	//* 308  685:invokeinterface #514 <Method Object java.util.Map$Entry.getValue()>
	//* 309  690:checkcast       #422 <Class PdfIndirectObject>
	//* 310  693:getfield        #693 <Field PdfObject PdfIndirectObject.object>
	//* 311  696:invokevirtual   #698 <Method boolean PdfObject.isArray()>
	//* 312  699:ifeq            727
				removeInactiveReferences((PdfArray)((PdfIndirectObject)((java.util.Map.Entry) (obj2)).getValue()).object, hashset);
	//  313  702:aload_0         
	//  314  703:aload           6
	//  315  705:invokeinterface #514 <Method Object java.util.Map$Entry.getValue()>
	//  316  710:checkcast       #422 <Class PdfIndirectObject>
	//  317  713:getfield        #693 <Field PdfObject PdfIndirectObject.object>
	//  318  716:checkcast       #474 <Class PdfArray>
	//  319  719:aload           7
	//  320  721:invokespecial   #1346 <Method void removeInactiveReferences(PdfArray, HashSet)>
			else
	//* 321  724:goto            634
			if(((PdfIndirectObject)((java.util.Map.Entry) (obj2)).getValue()).object.isDictionary())
	//* 322  727:aload           6
	//* 323  729:invokeinterface #514 <Method Object java.util.Map$Entry.getValue()>
	//* 324  734:checkcast       #422 <Class PdfIndirectObject>
	//* 325  737:getfield        #693 <Field PdfObject PdfIndirectObject.object>
	//* 326  740:invokevirtual   #701 <Method boolean PdfObject.isDictionary()>
	//* 327  743:ifeq            634
			{
				obj2 = ((Object) (((PdfDictionary)((PdfIndirectObject)((java.util.Map.Entry) (obj2)).getValue()).object).get(PdfName.K)));
	//  328  746:aload           6
	//  329  748:invokeinterface #514 <Method Object java.util.Map$Entry.getValue()>
	//  330  753:checkcast       #422 <Class PdfIndirectObject>
	//  331  756:getfield        #693 <Field PdfObject PdfIndirectObject.object>
	//  332  759:checkcast       #331 <Class PdfDictionary>
	//  333  762:getstatic       #808 <Field PdfName PdfName.K>
	//  334  765:invokevirtual   #570 <Method PdfObject PdfDictionary.get(PdfName)>
	//  335  768:astore          6
				if(obj2 != null && ((PdfObject) (obj2)).isArray())
	//* 336  770:aload           6
	//* 337  772:ifnull          634
	//* 338  775:aload           6
	//* 339  777:invokevirtual   #698 <Method boolean PdfObject.isArray()>
	//* 340  780:ifeq            634
					removeInactiveReferences((PdfArray)obj2, hashset);
	//  341  783:aload_0         
	//  342  784:aload           6
	//  343  786:checkcast       #474 <Class PdfArray>
	//  344  789:aload           7
	//  345  791:invokespecial   #1346 <Method void removeInactiveReferences(PdfArray, HashSet)>
			}
		} while(true);
	//  346  794:goto            634
		return;
	//  347  797:return          
	//* 348  798:goto            158
	}

	protected void flushAcroFields()
		throws IOException, BadPdfFormatException
	{
		if(!mergeFields) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #275 <Field boolean mergeFields>
	//    2    4:ifeq            166
_L1:
		Iterator iterator = importedPages.iterator();
	//    3    7:aload_0         
	//    4    8:getfield        #320 <Field ArrayList importedPages>
	//    5   11:invokevirtual   #670 <Method Iterator ArrayList.iterator()>
	//    6   14:astore_1        
_L6:
		if(!iterator.hasNext()) goto _L4; else goto _L3
	//    7   15:aload_1         
	//    8   16:invokeinterface #365 <Method boolean Iterator.hasNext()>
	//    9   21:ifeq            244
_L3:
		ImportedPage importedpage;
		Object obj1;
		importedpage = (ImportedPage)iterator.next();
	//   10   24:aload_1         
	//   11   25:invokeinterface #369 <Method Object Iterator.next()>
	//   12   30:checkcast       #6   <Class PdfCopy$ImportedPage>
	//   13   33:astore_2        
		obj1 = ((Object) (importedpage.reader.getPageN(importedpage.pageNumber)));
	//   14   34:aload_2         
	//   15   35:getfield        #672 <Field PdfReader PdfCopy$ImportedPage.reader>
	//   16   38:aload_2         
	//   17   39:getfield        #678 <Field int PdfCopy$ImportedPage.pageNumber>
	//   18   42:invokevirtual   #1087 <Method PdfDictionary PdfReader.getPageN(int)>
	//   19   45:astore_3        
		if(obj1 == null) goto _L6; else goto _L5
	//   20   46:aload_3         
	//   21   47:ifnull          15
_L5:
		obj1 = ((Object) (((PdfDictionary) (obj1)).getAsArray(PdfName.ANNOTS)));
	//   22   50:aload_3         
	//   23   51:getstatic       #1007 <Field PdfName PdfName.ANNOTS>
	//   24   54:invokevirtual   #612 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   25   57:astore_3        
		if(obj1 == null) goto _L6; else goto _L7
	//   26   58:aload_3         
	//   27   59:ifnull          15
_L7:
		if(((PdfArray) (obj1)).size() == 0) goto _L6; else goto _L8
	//   28   62:aload_3         
	//   29   63:invokevirtual   #475 <Method int PdfArray.size()>
	//   30   66:ifeq            15
_L8:
		for(Iterator iterator2 = importedpage.reader.getAcroFields().getFields().values().iterator(); iterator2.hasNext();)
	//*  31   69:aload_2         
	//*  32   70:getfield        #672 <Field PdfReader PdfCopy$ImportedPage.reader>
	//*  33   73:invokevirtual   #915 <Method AcroFields PdfReader.getAcroFields()>
	//*  34   76:invokevirtual   #872 <Method Map AcroFields.getFields()>
	//*  35   79:invokeinterface #440 <Method Collection Map.values()>
	//*  36   84:invokeinterface #443 <Method Iterator Collection.iterator()>
	//*  37   89:astore          4
	//*  38   91:aload           4
	//*  39   93:invokeinterface #365 <Method boolean Iterator.hasNext()>
	//*  40   98:ifeq            167
		{
			Iterator iterator3 = ((AcroFields.Item)iterator2.next()).widget_refs.iterator();
	//   41  101:aload           4
	//   42  103:invokeinterface #369 <Method Object Iterator.next()>
	//   43  108:checkcast       #445 <Class AcroFields$Item>
	//   44  111:getfield        #1352 <Field ArrayList AcroFields$Item.widget_refs>
	//   45  114:invokevirtual   #670 <Method Iterator ArrayList.iterator()>
	//   46  117:astore          5
			while(iterator3.hasNext()) 
	//*  47  119:aload           5
	//*  48  121:invokeinterface #365 <Method boolean Iterator.hasNext()>
	//*  49  126:ifeq            91
			{
				PdfIndirectReference pdfindirectreference = (PdfIndirectReference)iterator3.next();
	//   50  129:aload           5
	//   51  131:invokeinterface #369 <Method Object Iterator.next()>
	//   52  136:checkcast       #713 <Class PdfIndirectReference>
	//   53  139:astore          6
				((PdfArray) (obj1)).arrayList.remove(((Object) (pdfindirectreference)));
	//   54  141:aload_3         
	//   55  142:getfield        #1355 <Field ArrayList PdfArray.arrayList>
	//   56  145:aload           6
	//   57  147:invokevirtual   #1357 <Method boolean ArrayList.remove(Object)>
	//   58  150:pop             
			}
		}

		  goto _L9
	//*  59  151:goto            119
		Object obj;
		obj;
	//   60  154:astore_1        
		if(!tagged)
	//*  61  155:aload_0         
	//*  62  156:getfield        #1017 <Field boolean tagged>
	//*  63  159:ifne            166
			flushIndirectObjects();
	//   64  162:aload_0         
	//   65  163:invokevirtual   #1360 <Method void flushIndirectObjects()>
_L2:
		return;
	//   66  166:return          
_L9:
		indirects = (HashMap)indirectMap.get(((Object) (importedpage.reader)));
	//   67  167:aload_0         
	//   68  168:aload_0         
	//   69  169:getfield        #304 <Field HashMap indirectMap>
	//   70  172:aload_2         
	//   71  173:getfield        #672 <Field PdfReader PdfCopy$ImportedPage.reader>
	//   72  176:invokevirtual   #472 <Method Object HashMap.get(Object)>
	//   73  179:checkcast       #283 <Class HashMap>
	//   74  182:putfield        #1096 <Field HashMap indirects>
		obj1 = ((Object) (((PdfArray) (obj1)).arrayList.iterator()));
	//   75  185:aload_3         
	//   76  186:getfield        #1355 <Field ArrayList PdfArray.arrayList>
	//   77  189:invokevirtual   #670 <Method Iterator ArrayList.iterator()>
	//   78  192:astore_3        
		while(((Iterator) (obj1)).hasNext()) 
	//*  79  193:aload_3         
	//*  80  194:invokeinterface #365 <Method boolean Iterator.hasNext()>
	//*  81  199:ifeq            15
		{
			PdfObject pdfobject = (PdfObject)((Iterator) (obj1)).next();
	//   82  202:aload_3         
	//   83  203:invokeinterface #369 <Method Object Iterator.next()>
	//   84  208:checkcast       #695 <Class PdfObject>
	//   85  211:astore          4
			importedpage.mergedFields.add(copyObject(pdfobject));
	//   86  213:aload_2         
	//   87  214:getfield        #567 <Field PdfArray PdfCopy$ImportedPage.mergedFields>
	//   88  217:aload_0         
	//   89  218:aload           4
	//   90  220:invokevirtual   #1222 <Method PdfObject copyObject(PdfObject)>
	//   91  223:invokevirtual   #482 <Method boolean PdfArray.add(PdfObject)>
	//   92  226:pop             
		}
		  goto _L6
	//*  93  227:goto            193
		obj;
	//   94  230:astore_1        
		if(!tagged)
	//*  95  231:aload_0         
	//*  96  232:getfield        #1017 <Field boolean tagged>
	//*  97  235:ifne            242
			flushIndirectObjects();
	//   98  238:aload_0         
	//   99  239:invokevirtual   #1360 <Method void flushIndirectObjects()>
		throw obj;
	//  100  242:aload_1         
	//  101  243:athrow          
_L4:
		for(Iterator iterator1 = indirectMap.keySet().iterator(); iterator1.hasNext(); ((PdfReader)iterator1.next()).removeFields());
	//  102  244:aload_0         
	//  103  245:getfield        #304 <Field HashMap indirectMap>
	//  104  248:invokevirtual   #1363 <Method Set HashMap.keySet()>
	//  105  251:invokeinterface #504 <Method Iterator Set.iterator()>
	//  106  256:astore_1        
	//  107  257:aload_1         
	//  108  258:invokeinterface #365 <Method boolean Iterator.hasNext()>
	//  109  263:ifeq            281
	//  110  266:aload_1         
	//  111  267:invokeinterface #369 <Method Object Iterator.next()>
	//  112  272:checkcast       #614 <Class PdfReader>
	//  113  275:invokevirtual   #1366 <Method void PdfReader.removeFields()>
	//* 114  278:goto            257
		mergeFields();
	//  115  281:aload_0         
	//  116  282:invokespecial   #1368 <Method void mergeFields()>
		createAcroForms();
	//  117  285:aload_0         
	//  118  286:invokespecial   #1370 <Method void createAcroForms()>
		if(tagged) goto _L2; else goto _L10
	//  119  289:aload_0         
	//  120  290:getfield        #1017 <Field boolean tagged>
	//  121  293:ifne            166
_L10:
		flushIndirectObjects();
	//  122  296:aload_0         
	//  123  297:invokevirtual   #1360 <Method void flushIndirectObjects()>
		return;
	//  124  300:return          
		  goto _L6
	}

	protected void flushIndirectObjects()
		throws IOException
	{
		PdfIndirectObject pdfindirectobject;
		for(Iterator iterator = savedObjects.iterator(); iterator.hasNext(); indirectObjects.remove(((Object) (new RefKey(pdfindirectobject.number, pdfindirectobject.generation)))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #318 <Field ArrayList savedObjects>
	//*   2    4:invokevirtual   #670 <Method Iterator ArrayList.iterator()>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:invokeinterface #365 <Method boolean Iterator.hasNext()>
	//*   6   14:ifeq            53
			pdfindirectobject = (PdfIndirectObject)iterator.next();
	//    7   17:aload_1         
	//    8   18:invokeinterface #369 <Method Object Iterator.next()>
	//    9   23:checkcast       #422 <Class PdfIndirectObject>
	//   10   26:astore_2        

	//   11   27:aload_0         
	//   12   28:getfield        #313 <Field LinkedHashMap indirectObjects>
	//   13   31:new             #682 <Class RefKey>
	//   14   34:dup             
	//   15   35:aload_2         
	//   16   36:getfield        #940 <Field int PdfIndirectObject.number>
	//   17   39:aload_2         
	//   18   40:getfield        #943 <Field int PdfIndirectObject.generation>
	//   19   43:invokespecial   #945 <Method void RefKey(int, int)>
	//   20   46:invokevirtual   #1371 <Method Object LinkedHashMap.remove(Object)>
	//   21   49:pop             
	//*  22   50:goto            8
		HashSet hashset = new HashSet();
	//   23   53:new             #139 <Class HashSet>
	//   24   56:dup             
	//   25   57:invokespecial   #141 <Method void HashSet()>
	//   26   60:astore_1        
		for(Iterator iterator1 = indirectObjects.entrySet().iterator(); iterator1.hasNext();)
	//*  27   61:aload_0         
	//*  28   62:getfield        #313 <Field LinkedHashMap indirectObjects>
	//*  29   65:invokevirtual   #1341 <Method Set LinkedHashMap.entrySet()>
	//*  30   68:invokeinterface #504 <Method Iterator Set.iterator()>
	//*  31   73:astore_2        
	//*  32   74:aload_2         
	//*  33   75:invokeinterface #365 <Method boolean Iterator.hasNext()>
	//*  34   80:ifeq            132
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
	//   35   83:aload_2         
	//   36   84:invokeinterface #369 <Method Object Iterator.next()>
	//   37   89:checkcast       #506 <Class java.util.Map$Entry>
	//   38   92:astore_3        
			if(entry.getValue() != null)
	//*  39   93:aload_3         
	//*  40   94:invokeinterface #514 <Method Object java.util.Map$Entry.getValue()>
	//*  41   99:ifnull          118
				writeObjectToBody((PdfIndirectObject)entry.getValue());
	//   42  102:aload_0         
	//   43  103:aload_3         
	//   44  104:invokeinterface #514 <Method Object java.util.Map$Entry.getValue()>
	//   45  109:checkcast       #422 <Class PdfIndirectObject>
	//   46  112:invokespecial   #1373 <Method void writeObjectToBody(PdfIndirectObject)>
			else
	//*  47  115:goto            74
				hashset.add(entry.getKey());
	//   48  118:aload_1         
	//   49  119:aload_3         
	//   50  120:invokeinterface #509 <Method Object java.util.Map$Entry.getKey()>
	//   51  125:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//   52  128:pop             
		}

	//*  53  129:goto            74
		Iterator iterator2 = (new ArrayList(((Collection) (body.xrefs)))).iterator();
	//   54  132:new             #315 <Class ArrayList>
	//   55  135:dup             
	//   56  136:aload_0         
	//   57  137:getfield        #953 <Field PdfWriter$PdfBody body>
	//   58  140:getfield        #1377 <Field TreeSet PdfWriter$PdfBody.xrefs>
	//   59  143:invokespecial   #742 <Method void ArrayList(Collection)>
	//   60  146:invokevirtual   #670 <Method Iterator ArrayList.iterator()>
	//   61  149:astore_2        
		do
		{
			if(!iterator2.hasNext())
				break;
	//   62  150:aload_2         
	//   63  151:invokeinterface #365 <Method boolean Iterator.hasNext()>
	//   64  156:ifeq            203
			PdfWriter.PdfBody.PdfCrossReference pdfcrossreference = (PdfWriter.PdfBody.PdfCrossReference)iterator2.next();
	//   65  159:aload_2         
	//   66  160:invokeinterface #369 <Method Object Iterator.next()>
	//   67  165:checkcast       #1379 <Class PdfWriter$PdfBody$PdfCrossReference>
	//   68  168:astore_3        
			if(hashset.contains(((Object) (new RefKey(pdfcrossreference.getRefnum(), 0)))))
	//*  69  169:aload_1         
	//*  70  170:new             #682 <Class RefKey>
	//*  71  173:dup             
	//*  72  174:aload_3         
	//*  73  175:invokevirtual   #1382 <Method int PdfWriter$PdfBody$PdfCrossReference.getRefnum()>
	//*  74  178:iconst_0        
	//*  75  179:invokespecial   #945 <Method void RefKey(int, int)>
	//*  76  182:invokevirtual   #666 <Method boolean HashSet.contains(Object)>
	//*  77  185:ifeq            150
				body.xrefs.remove(((Object) (pdfcrossreference)));
	//   78  188:aload_0         
	//   79  189:getfield        #953 <Field PdfWriter$PdfBody body>
	//   80  192:getfield        #1377 <Field TreeSet PdfWriter$PdfBody.xrefs>
	//   81  195:aload_3         
	//   82  196:invokevirtual   #1385 <Method boolean TreeSet.remove(Object)>
	//   83  199:pop             
		} while(true);
	//   84  200:goto            150
		indirectObjects = null;
	//   85  203:aload_0         
	//   86  204:aconst_null     
	//   87  205:putfield        #313 <Field LinkedHashMap indirectObjects>
	//   88  208:return          
	}

	protected void flushTaggedObjects()
		throws IOException
	{
		try
		{
			fixTaggedStructure();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1388 <Method void fixTaggedStructure()>
		}
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #1360 <Method void flushIndirectObjects()>
	//*   4    8:return          
		catch(ClassCastException classcastexception)
	//*   5    9:astore_1        
		{
			flushIndirectObjects();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #1360 <Method void flushIndirectObjects()>
			return;
	//    8   14:return          
		}
		flushIndirectObjects();
		return;
		Exception exception;
		exception;
	//    9   15:astore_1        
		flushIndirectObjects();
	//   10   16:aload_0         
	//   11   17:invokevirtual   #1360 <Method void flushIndirectObjects()>
		throw exception;
	//   12   20:aload_1         
	//   13   21:athrow          
	}

	public void freeReader(PdfReader pdfreader)
		throws IOException
	{
		if(mergeFields)
	//*   0    0:aload_0         
	//*   1    1:getfield        #275 <Field boolean mergeFields>
	//*   2    4:ifeq            25
			throw new UnsupportedOperationException(MessageLocalization.getComposedMessage("it.is.not.possible.to.free.reader.in.merge.fields.mode", new Object[0]));
	//    3    7:new             #1391 <Class UnsupportedOperationException>
	//    4   10:dup             
	//    5   11:ldc2            #1393 <String "it.is.not.possible.to.free.reader.in.merge.fields.mode">
	//    6   14:iconst_0        
	//    7   15:anewarray       Object[]
	//    8   18:invokestatic    #980 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    9   21:invokespecial   #1394 <Method void UnsupportedOperationException(String)>
	//   10   24:athrow          
		PdfArray pdfarray = pdfreader.trailer.getAsArray(PdfName.ID);
	//   11   25:aload_1         
	//   12   26:getfield        #1397 <Field PdfDictionary PdfReader.trailer>
	//   13   29:getstatic       #1400 <Field PdfName PdfName.ID>
	//   14   32:invokevirtual   #612 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   15   35:astore_2        
		if(pdfarray != null)
	//*  16   36:aload_2         
	//*  17   37:ifnull          52
			originalFileID = pdfarray.getAsString(0).getBytes();
	//   18   40:aload_0         
	//   19   41:aload_2         
	//   20   42:iconst_0        
	//   21   43:invokevirtual   #1403 <Method PdfString PdfArray.getAsString(int)>
	//   22   46:invokevirtual   #1407 <Method byte[] PdfString.getBytes()>
	//   23   49:putfield        #1411 <Field byte[] originalFileID>
		indirectMap.remove(((Object) (pdfreader)));
	//   24   52:aload_0         
	//   25   53:getfield        #304 <Field HashMap indirectMap>
	//   26   56:aload_1         
	//   27   57:invokevirtual   #706 <Method Object HashMap.remove(Object)>
	//   28   60:pop             
		currentPdfReaderInstance = null;
	//   29   61:aload_0         
	//   30   62:aconst_null     
	//   31   63:putfield        #1415 <Field PdfReaderInstance currentPdfReaderInstance>
		super.freeReader(pdfreader);
	//   32   66:aload_0         
	//   33   67:aload_1         
	//   34   68:invokespecial   #1417 <Method void PdfWriter.freeReader(PdfReader)>
	//   35   71:return          
	}

	protected PdfDictionary getCatalog(PdfIndirectReference pdfindirectreference)
	{
		pdfindirectreference = ((PdfIndirectReference) (pdf.getCatalog(pdfindirectreference)));
	//    0    0:aload_0         
	//    1    1:getfield        #292 <Field PdfDocument pdf>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1421 <Method PdfDocument$PdfCatalog PdfDocument.getCatalog(PdfIndirectReference)>
	//    4    8:astore_1        
		buildStructTreeRootForTagged(((PdfDictionary) (pdfindirectreference)));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #1424 <Method void buildStructTreeRootForTagged(PdfDictionary)>
		if(fieldArray == null)
			break MISSING_BLOCK_LABEL_28;
	//    8   14:aload_0         
	//    9   15:getfield        #329 <Field PdfArray fieldArray>
	//   10   18:ifnull          28
		addFieldResources(((PdfDictionary) (pdfindirectreference)));
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #1426 <Method void addFieldResources(PdfDictionary)>
		return ((PdfDictionary) (pdfindirectreference));
	//   14   26:aload_1         
	//   15   27:areturn         
label0:
		{
			try
			{
				if(!mergeFields || acroForm == null)
					break label0;
	//   16   28:aload_0         
	//   17   29:getfield        #275 <Field boolean mergeFields>
	//   18   32:ifeq            65
	//   19   35:aload_0         
	//   20   36:getfield        #757 <Field PdfIndirectReference acroForm>
	//   21   39:ifnull          65
				((PdfDictionary) (pdfindirectreference)).put(PdfName.ACROFORM, ((PdfObject) (acroForm)));
	//   22   42:aload_1         
	//   23   43:getstatic       #335 <Field PdfName PdfName.ACROFORM>
	//   24   46:aload_0         
	//   25   47:getfield        #757 <Field PdfIndirectReference acroForm>
	//   26   50:invokevirtual   #339 <Method void PdfDictionary.put(PdfName, PdfObject)>
			}
	//*  27   53:aload_1         
	//*  28   54:areturn         
			// Misplaced declaration of an exception variable
			catch(PdfIndirectReference pdfindirectreference)
	//*  29   55:astore_1        
			{
				throw new ExceptionConverter(((Exception) (pdfindirectreference)));
	//   30   56:new             #1428 <Class ExceptionConverter>
	//   31   59:dup             
	//   32   60:aload_1         
	//   33   61:invokespecial   #1431 <Method void ExceptionConverter(Exception)>
	//   34   64:athrow          
			}
			return ((PdfDictionary) (pdfindirectreference));
		}
		return ((PdfDictionary) (pdfindirectreference));
	//   35   65:aload_1         
	//   36   66:areturn         
	}

	protected Counter getCounter()
	{
		return COUNTER;
	//    0    0:getstatic       #113 <Field Counter COUNTER>
	//    1    3:areturn         
	}

	public PdfImportedPage getImportedPage(PdfReader pdfreader, int i)
	{
		if(mergeFields && !mergeFieldsInternalCall)
	//*   0    0:aload_0         
	//*   1    1:getfield        #275 <Field boolean mergeFields>
	//*   2    4:ifeq            38
	//*   3    7:aload_0         
	//*   4    8:getfield        #279 <Field boolean mergeFieldsInternalCall>
	//*   5   11:ifne            38
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("1.method.cannot.be.used.in.mergeFields.mode.please.use.addDocument", new Object[] {
				"getImportedPage"
			}));
	//    6   14:new             #983 <Class IllegalArgumentException>
	//    7   17:dup             
	//    8   18:ldc2            #1042 <String "1.method.cannot.be.used.in.mergeFields.mode.please.use.addDocument">
	//    9   21:iconst_1        
	//   10   22:anewarray       Object[]
	//   11   25:dup             
	//   12   26:iconst_0        
	//   13   27:ldc2            #1434 <String "getImportedPage">
	//   14   30:aastore         
	//   15   31:invokestatic    #980 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   16   34:invokespecial   #987 <Method void IllegalArgumentException(String)>
	//   17   37:athrow          
		if(mergeFields)
	//*  18   38:aload_0         
	//*  19   39:getfield        #275 <Field boolean mergeFields>
	//*  20   42:ifeq            68
		{
			ImportedPage importedpage = new ImportedPage(pdfreader, i, mergeFields);
	//   21   45:new             #6   <Class PdfCopy$ImportedPage>
	//   22   48:dup             
	//   23   49:aload_1         
	//   24   50:iload_2         
	//   25   51:aload_0         
	//   26   52:getfield        #275 <Field boolean mergeFields>
	//   27   55:invokespecial   #1437 <Method void PdfCopy$ImportedPage(PdfReader, int, boolean)>
	//   28   58:astore_3        
			importedPages.add(((Object) (importedpage)));
	//   29   59:aload_0         
	//   30   60:getfield        #320 <Field ArrayList importedPages>
	//   31   63:aload_3         
	//   32   64:invokevirtual   #476 <Method boolean ArrayList.add(Object)>
	//   33   67:pop             
		}
		if(structTreeController != null)
	//*  34   68:aload_0         
	//*  35   69:getfield        #269 <Field PdfStructTreeController structTreeController>
	//*  36   72:ifnull          83
			structTreeController.reader = null;
	//   37   75:aload_0         
	//   38   76:getfield        #269 <Field PdfStructTreeController structTreeController>
	//   39   79:aconst_null     
	//   40   80:putfield        #1171 <Field PdfReader PdfStructTreeController.reader>
		disableIndirects.clear();
	//   41   83:aload_0         
	//   42   84:getfield        #308 <Field HashSet disableIndirects>
	//   43   87:invokevirtual   #1440 <Method void HashSet.clear()>
		parentObjects.clear();
	//   44   90:aload_0         
	//   45   91:getfield        #306 <Field HashMap parentObjects>
	//   46   94:invokevirtual   #1441 <Method void HashMap.clear()>
		return getImportedPageImpl(pdfreader, i);
	//   47   97:aload_0         
	//   48   98:aload_1         
	//   49   99:iload_2         
	//   50  100:invokevirtual   #1444 <Method PdfImportedPage getImportedPageImpl(PdfReader, int)>
	//   51  103:areturn         
	}

	public PdfImportedPage getImportedPage(PdfReader pdfreader, int i, boolean flag)
		throws BadPdfFormatException
	{
		if(mergeFields && !mergeFieldsInternalCall)
	//*   0    0:aload_0         
	//*   1    1:getfield        #275 <Field boolean mergeFields>
	//*   2    4:ifeq            38
	//*   3    7:aload_0         
	//*   4    8:getfield        #279 <Field boolean mergeFieldsInternalCall>
	//*   5   11:ifne            38
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("1.method.cannot.be.used.in.mergeFields.mode.please.use.addDocument", new Object[] {
				"getImportedPage"
			}));
	//    6   14:new             #983 <Class IllegalArgumentException>
	//    7   17:dup             
	//    8   18:ldc2            #1042 <String "1.method.cannot.be.used.in.mergeFields.mode.please.use.addDocument">
	//    9   21:iconst_1        
	//   10   22:anewarray       Object[]
	//   11   25:dup             
	//   12   26:iconst_0        
	//   13   27:ldc2            #1434 <String "getImportedPage">
	//   14   30:aastore         
	//   15   31:invokestatic    #980 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   16   34:invokespecial   #987 <Method void IllegalArgumentException(String)>
	//   17   37:athrow          
		updateRootKids = false;
	//   18   38:aload_0         
	//   19   39:iconst_0        
	//   20   40:putfield        #273 <Field boolean updateRootKids>
		if(!flag)
	//*  21   43:iload_3         
	//*  22   44:ifne            86
		{
			if(mergeFields)
	//*  23   47:aload_0         
	//*  24   48:getfield        #275 <Field boolean mergeFields>
	//*  25   51:ifeq            79
			{
				ImportedPage importedpage = new ImportedPage(pdfreader, i, mergeFields);
	//   26   54:new             #6   <Class PdfCopy$ImportedPage>
	//   27   57:dup             
	//   28   58:aload_1         
	//   29   59:iload_2         
	//   30   60:aload_0         
	//   31   61:getfield        #275 <Field boolean mergeFields>
	//   32   64:invokespecial   #1437 <Method void PdfCopy$ImportedPage(PdfReader, int, boolean)>
	//   33   67:astore          4
				importedPages.add(((Object) (importedpage)));
	//   34   69:aload_0         
	//   35   70:getfield        #320 <Field ArrayList importedPages>
	//   36   73:aload           4
	//   37   75:invokevirtual   #476 <Method boolean ArrayList.add(Object)>
	//   38   78:pop             
			}
			return getImportedPageImpl(pdfreader, i);
	//   39   79:aload_0         
	//   40   80:aload_1         
	//   41   81:iload_2         
	//   42   82:invokevirtual   #1444 <Method PdfImportedPage getImportedPageImpl(PdfReader, int)>
	//   43   85:areturn         
		}
		ImportedPage importedpage1;
		if(structTreeController != null)
	//*  44   86:aload_0         
	//*  45   87:getfield        #269 <Field PdfStructTreeController structTreeController>
	//*  46   90:ifnull          191
		{
			if(pdfreader != structTreeController.reader)
	//*  47   93:aload_1         
	//*  48   94:aload_0         
	//*  49   95:getfield        #269 <Field PdfStructTreeController structTreeController>
	//*  50   98:getfield        #1171 <Field PdfReader PdfStructTreeController.reader>
	//*  51  101:if_acmpeq       112
				structTreeController.setReader(pdfreader);
	//   52  104:aload_0         
	//   53  105:getfield        #269 <Field PdfStructTreeController structTreeController>
	//   54  108:aload_1         
	//   55  109:invokevirtual   #1204 <Method void PdfStructTreeController.setReader(PdfReader)>
		} else
	//*  56  112:new             #6   <Class PdfCopy$ImportedPage>
	//*  57  115:dup             
	//*  58  116:aload_1         
	//*  59  117:iload_2         
	//*  60  118:aload_0         
	//*  61  119:getfield        #275 <Field boolean mergeFields>
	//*  62  122:invokespecial   #1437 <Method void PdfCopy$ImportedPage(PdfReader, int, boolean)>
	//*  63  125:astore          4
	//*  64  127:aload_0         
	//*  65  128:aload           4
	//*  66  130:invokespecial   #1446 <Method int checkStructureTreeRootKids(PdfCopy$ImportedPage)>
	//*  67  133:tableswitch     -1 1: default 160
	//	               -1 207
	//	               0 220
	//	               1 228
	//*  68  160:aload_0         
	//*  69  161:getfield        #320 <Field ArrayList importedPages>
	//*  70  164:aload           4
	//*  71  166:invokevirtual   #476 <Method boolean ArrayList.add(Object)>
	//*  72  169:pop             
	//*  73  170:aload_0         
	//*  74  171:getfield        #308 <Field HashSet disableIndirects>
	//*  75  174:invokevirtual   #1440 <Method void HashSet.clear()>
	//*  76  177:aload_0         
	//*  77  178:getfield        #306 <Field HashMap parentObjects>
	//*  78  181:invokevirtual   #1441 <Method void HashMap.clear()>
	//*  79  184:aload_0         
	//*  80  185:aload_1         
	//*  81  186:iload_2         
	//*  82  187:invokevirtual   #1444 <Method PdfImportedPage getImportedPageImpl(PdfReader, int)>
	//*  83  190:areturn         
		{
			structTreeController = new PdfStructTreeController(pdfreader, this);
	//   84  191:aload_0         
	//   85  192:new             #1019 <Class PdfStructTreeController>
	//   86  195:dup             
	//   87  196:aload_1         
	//   88  197:aload_0         
	//   89  198:invokespecial   #1209 <Method void PdfStructTreeController(PdfReader, PdfCopy)>
	//   90  201:putfield        #269 <Field PdfStructTreeController structTreeController>
		}
		importedpage1 = new ImportedPage(pdfreader, i, mergeFields);
		checkStructureTreeRootKids(importedpage1);
		JVM INSTR tableswitch -1 1: default 160
	//	               -1 207
	//	               0 220
	//	               1 228;
		   goto _L1 _L2 _L3 _L4
_L1:
		importedPages.add(((Object) (importedpage1)));
		disableIndirects.clear();
		parentObjects.clear();
		return getImportedPageImpl(pdfreader, i);
	//*  91  204:goto            112
_L2:
		clearIndirects(pdfreader);
	//   92  207:aload_0         
	//   93  208:aload_1         
	//   94  209:invokespecial   #1448 <Method void clearIndirects(PdfReader)>
		updateRootKids = true;
	//   95  212:aload_0         
	//   96  213:iconst_1        
	//   97  214:putfield        #273 <Field boolean updateRootKids>
		continue; /* Loop/switch isn't completed */
	//   98  217:goto            160
_L3:
		updateRootKids = false;
	//   99  220:aload_0         
	//  100  221:iconst_0        
	//  101  222:putfield        #273 <Field boolean updateRootKids>
		continue; /* Loop/switch isn't completed */
	//  102  225:goto            160
_L4:
		updateRootKids = true;
	//  103  228:aload_0         
	//  104  229:iconst_1        
	//  105  230:putfield        #273 <Field boolean updateRootKids>
		if(true) goto _L1; else goto _L5
	//  106  233:goto            160
_L5:
	}

	protected PdfImportedPage getImportedPageImpl(PdfReader pdfreader, int i)
	{
		if(currentPdfReaderInstance != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1415 <Field PdfReaderInstance currentPdfReaderInstance>
	//*   2    4:ifnull          36
		{
			if(currentPdfReaderInstance.getReader() != pdfreader)
	//*   3    7:aload_0         
	//*   4    8:getfield        #1415 <Field PdfReaderInstance currentPdfReaderInstance>
	//*   5   11:invokevirtual   #1301 <Method PdfReader PdfReaderInstance.getReader()>
	//*   6   14:aload_1         
	//*   7   15:if_acmpeq       27
				currentPdfReaderInstance = super.getPdfReaderInstance(pdfreader);
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokespecial   #1451 <Method PdfReaderInstance PdfWriter.getPdfReaderInstance(PdfReader)>
	//   12   24:putfield        #1415 <Field PdfReaderInstance currentPdfReaderInstance>
		} else
	//*  13   27:aload_0         
	//*  14   28:getfield        #1415 <Field PdfReaderInstance currentPdfReaderInstance>
	//*  15   31:iload_2         
	//*  16   32:invokevirtual   #1454 <Method PdfImportedPage PdfReaderInstance.getImportedPage(int)>
	//*  17   35:areturn         
		{
			currentPdfReaderInstance = super.getPdfReaderInstance(pdfreader);
	//   18   36:aload_0         
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:invokespecial   #1451 <Method PdfReaderInstance PdfWriter.getPdfReaderInstance(PdfReader)>
	//   22   42:putfield        #1415 <Field PdfReaderInstance currentPdfReaderInstance>
		}
		return currentPdfReaderInstance.getImportedPage(i);
	//*  23   45:goto            27
	}

	protected PdfName getOffStateName(PdfDictionary pdfdictionary)
	{
		return PdfName.Off;
	//    0    0:getstatic       #1457 <Field PdfName PdfName.Off>
	//    1    3:areturn         
	}

	public boolean isRotateContents()
	{
		return rotateContents;
	//    0    0:aload_0         
	//    1    1:getfield        #267 <Field boolean rotateContents>
	//    2    4:ireturn         
	}

	protected boolean isStructTreeRootReference(PdfIndirectReference pdfindirectreference)
	{
		while(pdfindirectreference == null || structTreeRootReference == null || pdfindirectreference.number != structTreeRootReference.number || pdfindirectreference.generation != structTreeRootReference.generation) 
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
	//*   2    4:aload_0         
	//*   3    5:getfield        #1114 <Field PRIndirectReference structTreeRootReference>
	//*   4    8:ifnonnull       13
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
	//    7   13:aload_1         
	//    8   14:getfield        #1459 <Field int PdfIndirectReference.number>
	//    9   17:aload_0         
	//   10   18:getfield        #1114 <Field PRIndirectReference structTreeRootReference>
	//   11   21:getfield        #1460 <Field int PRIndirectReference.number>
	//   12   24:icmpne          11
	//   13   27:aload_1         
	//   14   28:getfield        #1461 <Field int PdfIndirectReference.generation>
	//   15   31:aload_0         
	//   16   32:getfield        #1114 <Field PRIndirectReference structTreeRootReference>
	//   17   35:getfield        #1462 <Field int PRIndirectReference.generation>
	//   18   38:icmpne          11
		return true;
	//   19   41:iconst_1        
	//   20   42:ireturn         
	}

	protected int setFromIPage(PdfImportedPage pdfimportedpage)
	{
		int i = pdfimportedpage.getPageNumber();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #1294 <Method int PdfImportedPage.getPageNumber()>
	//    2    4:istore_2        
		pdfimportedpage = ((PdfImportedPage) (pdfimportedpage.getPdfReaderInstance()));
	//    3    5:aload_1         
	//    4    6:invokevirtual   #1298 <Method PdfReaderInstance PdfImportedPage.getPdfReaderInstance()>
	//    5    9:astore_1        
		currentPdfReaderInstance = ((PdfReaderInstance) (pdfimportedpage));
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:putfield        #1415 <Field PdfReaderInstance currentPdfReaderInstance>
		reader = ((PdfReaderInstance) (pdfimportedpage)).getReader();
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #1301 <Method PdfReader PdfReaderInstance.getReader()>
	//   12   20:putfield        #1084 <Field PdfReader reader>
		setFromReader(reader);
	//   13   23:aload_0         
	//   14   24:aload_0         
	//   15   25:getfield        #1084 <Field PdfReader reader>
	//   16   28:invokevirtual   #1465 <Method void setFromReader(PdfReader)>
		return i;
	//   17   31:iload_2         
	//   18   32:ireturn         
	}

	protected void setFromReader(PdfReader pdfreader)
	{
		reader = pdfreader;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1084 <Field PdfReader reader>
		indirects = (HashMap)indirectMap.get(((Object) (pdfreader)));
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #304 <Field HashMap indirectMap>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #472 <Method Object HashMap.get(Object)>
	//    8   14:checkcast       #283 <Class HashMap>
	//    9   17:putfield        #1096 <Field HashMap indirects>
		if(indirects == null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #1096 <Field HashMap indirects>
	//*  12   24:ifnonnull       51
		{
			indirects = new HashMap();
	//   13   27:aload_0         
	//   14   28:new             #283 <Class HashMap>
	//   15   31:dup             
	//   16   32:invokespecial   #284 <Method void HashMap()>
	//   17   35:putfield        #1096 <Field HashMap indirects>
			indirectMap.put(((Object) (pdfreader)), ((Object) (indirects)));
	//   18   38:aload_0         
	//   19   39:getfield        #304 <Field HashMap indirectMap>
	//   20   42:aload_1         
	//   21   43:aload_0         
	//   22   44:getfield        #1096 <Field HashMap indirects>
	//   23   47:invokevirtual   #479 <Method Object HashMap.put(Object, Object)>
	//   24   50:pop             
		}
	//   25   51:return          
	}

	public void setMergeFields()
	{
		mergeFields = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #275 <Field boolean mergeFields>
		resources = new PdfDictionary();
	//    3    5:aload_0         
	//    4    6:new             #331 <Class PdfDictionary>
	//    5    9:dup             
	//    6   10:invokespecial   #332 <Method void PdfDictionary()>
	//    7   13:putfield        #726 <Field PdfDictionary resources>
		fields = new ArrayList();
	//    8   16:aload_0         
	//    9   17:new             #315 <Class ArrayList>
	//   10   20:dup             
	//   11   21:invokespecial   #316 <Method void ArrayList()>
	//   12   24:putfield        #602 <Field ArrayList fields>
		calculationOrder = new ArrayList();
	//   13   27:aload_0         
	//   14   28:new             #315 <Class ArrayList>
	//   15   31:dup             
	//   16   32:invokespecial   #316 <Method void ArrayList()>
	//   17   35:putfield        #543 <Field ArrayList calculationOrder>
		fieldTree = ((HashMap) (new LinkedHashMap()));
	//   18   38:aload_0         
	//   19   39:new             #310 <Class LinkedHashMap>
	//   20   42:dup             
	//   21   43:invokespecial   #311 <Method void LinkedHashMap()>
	//   22   46:putfield        #717 <Field HashMap fieldTree>
		unmergedMap = new HashMap();
	//   23   49:aload_0         
	//   24   50:new             #283 <Class HashMap>
	//   25   53:dup             
	//   26   54:invokespecial   #284 <Method void HashMap()>
	//   27   57:putfield        #949 <Field HashMap unmergedMap>
		unmergedIndirectRefsMap = new HashMap();
	//   28   60:aload_0         
	//   29   61:new             #283 <Class HashMap>
	//   30   64:dup             
	//   31   65:invokespecial   #284 <Method void HashMap()>
	//   32   68:putfield        #902 <Field HashMap unmergedIndirectRefsMap>
		mergedMap = new HashMap();
	//   33   71:aload_0         
	//   34   72:new             #283 <Class HashMap>
	//   35   75:dup             
	//   36   76:invokespecial   #284 <Method void HashMap()>
	//   37   79:putfield        #904 <Field HashMap mergedMap>
		mergedSet = new HashSet();
	//   38   82:aload_0         
	//   39   83:new             #139 <Class HashSet>
	//   40   86:dup             
	//   41   87:invokespecial   #141 <Method void HashSet()>
	//   42   90:putfield        #947 <Field HashSet mergedSet>
	//   43   93:return          
	}

	public void setPageEvent(PdfPageEvent pdfpageevent)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #1391 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #1469 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public void setRotateContents(boolean flag)
	{
		rotateContents = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #267 <Field boolean rotateContents>
	//    3    5:return          
	}

	protected void structureTreeRootKidsForReaderImported(PdfReader pdfreader)
	{
		readersWithImportedStructureTreeRootKids.add(((Object) (pdfreader)));
	//    0    0:aload_0         
	//    1    1:getfield        #288 <Field HashSet readersWithImportedStructureTreeRootKids>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	protected static Counter COUNTER = CounterFactory.getCounter(com/itextpdf/text/pdf/PdfCopy);
	private static final Logger LOGGER = LoggerFactory.getLogger(com/itextpdf/text/pdf/PdfCopy);
	private static final PdfName annotId;
	private static int annotIdCnt = 0;
	protected static final HashSet fieldKeys;
	private static final PdfName iTextTag = new PdfName("_iTextTag_");
	protected static final HashSet widgetKeys;
	private static final Integer zero = Integer.valueOf(0);
	private PdfIndirectReference acroForm;
	private ArrayList calculationOrder;
	private ArrayList calculationOrderRefs;
	private int currentStructArrayNumber;
	protected HashSet disableIndirects;
	protected PdfArray fieldArray;
	protected HashSet fieldTemplates;
	private HashMap fieldTree;
	protected ArrayList fields;
	private boolean hasSignature;
	protected ArrayList importedPages;
	protected HashMap indirectMap;
	protected LinkedHashMap indirectObjects;
	protected HashMap indirects;
	protected boolean mergeFields;
	private boolean mergeFieldsInternalCall;
	private HashMap mergedMap;
	private HashSet mergedRadioButtons;
	private HashSet mergedSet;
	private HashMap mergedTextFields;
	protected int namePtr[] = {
		0
	};
	private boolean needAppearances;
	protected HashMap parentObjects;
	protected PdfReader reader;
	private HashSet readersWithImportedStructureTreeRootKids;
	private PdfDictionary resources;
	private boolean rotateContents;
	protected ArrayList savedObjects;
	private PdfStructTreeController structTreeController;
	protected PRIndirectReference structTreeRootReference;
	private HashMap tabOrder;
	private HashMap unmergedIndirectRefsMap;
	private HashMap unmergedMap;
	protected boolean updateRootKids;

	static 
	{
	//    0    0:ldc1            #2   <Class PdfCopy>
	//    1    2:invokestatic    #103 <Method Logger LoggerFactory.getLogger(Class)>
	//    2    5:putstatic       #105 <Field Logger LOGGER>
	//    3    8:ldc1            #2   <Class PdfCopy>
	//    4   10:invokestatic    #111 <Method Counter CounterFactory.getCounter(Class)>
	//    5   13:putstatic       #113 <Field Counter COUNTER>
		annotId = new PdfName("iTextAnnotId");
	//    6   16:new             #115 <Class PdfName>
	//    7   19:dup             
	//    8   20:ldc1            #117 <String "iTextAnnotId">
	//    9   22:invokespecial   #121 <Method void PdfName(String)>
	//   10   25:putstatic       #123 <Field PdfName annotId>
	//   11   28:iconst_0        
	//   12   29:putstatic       #125 <Field int annotIdCnt>
	//   13   32:new             #115 <Class PdfName>
	//   14   35:dup             
	//   15   36:ldc1            #127 <String "_iTextTag_">
	//   16   38:invokespecial   #121 <Method void PdfName(String)>
	//   17   41:putstatic       #129 <Field PdfName iTextTag>
	//   18   44:iconst_0        
	//   19   45:invokestatic    #135 <Method Integer Integer.valueOf(int)>
	//   20   48:putstatic       #137 <Field Integer zero>
		widgetKeys = new HashSet();
	//   21   51:new             #139 <Class HashSet>
	//   22   54:dup             
	//   23   55:invokespecial   #141 <Method void HashSet()>
	//   24   58:putstatic       #143 <Field HashSet widgetKeys>
		fieldKeys = new HashSet();
	//   25   61:new             #139 <Class HashSet>
	//   26   64:dup             
	//   27   65:invokespecial   #141 <Method void HashSet()>
	//   28   68:putstatic       #145 <Field HashSet fieldKeys>
		widgetKeys.add(((Object) (PdfName.SUBTYPE)));
	//   29   71:getstatic       #143 <Field HashSet widgetKeys>
	//   30   74:getstatic       #148 <Field PdfName PdfName.SUBTYPE>
	//   31   77:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//   32   80:pop             
		widgetKeys.add(((Object) (PdfName.CONTENTS)));
	//   33   81:getstatic       #143 <Field HashSet widgetKeys>
	//   34   84:getstatic       #155 <Field PdfName PdfName.CONTENTS>
	//   35   87:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//   36   90:pop             
		widgetKeys.add(((Object) (PdfName.RECT)));
	//   37   91:getstatic       #143 <Field HashSet widgetKeys>
	//   38   94:getstatic       #158 <Field PdfName PdfName.RECT>
	//   39   97:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//   40  100:pop             
		widgetKeys.add(((Object) (PdfName.NM)));
	//   41  101:getstatic       #143 <Field HashSet widgetKeys>
	//   42  104:getstatic       #161 <Field PdfName PdfName.NM>
	//   43  107:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//   44  110:pop             
		widgetKeys.add(((Object) (PdfName.M)));
	//   45  111:getstatic       #143 <Field HashSet widgetKeys>
	//   46  114:getstatic       #164 <Field PdfName PdfName.M>
	//   47  117:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//   48  120:pop             
		widgetKeys.add(((Object) (PdfName.F)));
	//   49  121:getstatic       #143 <Field HashSet widgetKeys>
	//   50  124:getstatic       #167 <Field PdfName PdfName.F>
	//   51  127:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//   52  130:pop             
		widgetKeys.add(((Object) (PdfName.BS)));
	//   53  131:getstatic       #143 <Field HashSet widgetKeys>
	//   54  134:getstatic       #170 <Field PdfName PdfName.BS>
	//   55  137:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//   56  140:pop             
		widgetKeys.add(((Object) (PdfName.BORDER)));
	//   57  141:getstatic       #143 <Field HashSet widgetKeys>
	//   58  144:getstatic       #173 <Field PdfName PdfName.BORDER>
	//   59  147:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//   60  150:pop             
		widgetKeys.add(((Object) (PdfName.AP)));
	//   61  151:getstatic       #143 <Field HashSet widgetKeys>
	//   62  154:getstatic       #176 <Field PdfName PdfName.AP>
	//   63  157:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//   64  160:pop             
		widgetKeys.add(((Object) (PdfName.AS)));
	//   65  161:getstatic       #143 <Field HashSet widgetKeys>
	//   66  164:getstatic       #179 <Field PdfName PdfName.AS>
	//   67  167:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//   68  170:pop             
		widgetKeys.add(((Object) (PdfName.C)));
	//   69  171:getstatic       #143 <Field HashSet widgetKeys>
	//   70  174:getstatic       #182 <Field PdfName PdfName.C>
	//   71  177:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//   72  180:pop             
		widgetKeys.add(((Object) (PdfName.A)));
	//   73  181:getstatic       #143 <Field HashSet widgetKeys>
	//   74  184:getstatic       #185 <Field PdfName PdfName.A>
	//   75  187:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//   76  190:pop             
		widgetKeys.add(((Object) (PdfName.STRUCTPARENT)));
	//   77  191:getstatic       #143 <Field HashSet widgetKeys>
	//   78  194:getstatic       #188 <Field PdfName PdfName.STRUCTPARENT>
	//   79  197:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//   80  200:pop             
		widgetKeys.add(((Object) (PdfName.OC)));
	//   81  201:getstatic       #143 <Field HashSet widgetKeys>
	//   82  204:getstatic       #191 <Field PdfName PdfName.OC>
	//   83  207:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//   84  210:pop             
		widgetKeys.add(((Object) (PdfName.H)));
	//   85  211:getstatic       #143 <Field HashSet widgetKeys>
	//   86  214:getstatic       #194 <Field PdfName PdfName.H>
	//   87  217:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//   88  220:pop             
		widgetKeys.add(((Object) (PdfName.MK)));
	//   89  221:getstatic       #143 <Field HashSet widgetKeys>
	//   90  224:getstatic       #197 <Field PdfName PdfName.MK>
	//   91  227:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//   92  230:pop             
		widgetKeys.add(((Object) (PdfName.DA)));
	//   93  231:getstatic       #143 <Field HashSet widgetKeys>
	//   94  234:getstatic       #200 <Field PdfName PdfName.DA>
	//   95  237:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//   96  240:pop             
		widgetKeys.add(((Object) (PdfName.Q)));
	//   97  241:getstatic       #143 <Field HashSet widgetKeys>
	//   98  244:getstatic       #203 <Field PdfName PdfName.Q>
	//   99  247:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//  100  250:pop             
		widgetKeys.add(((Object) (PdfName.P)));
	//  101  251:getstatic       #143 <Field HashSet widgetKeys>
	//  102  254:getstatic       #206 <Field PdfName PdfName.P>
	//  103  257:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//  104  260:pop             
		widgetKeys.add(((Object) (PdfName.TYPE)));
	//  105  261:getstatic       #143 <Field HashSet widgetKeys>
	//  106  264:getstatic       #209 <Field PdfName PdfName.TYPE>
	//  107  267:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//  108  270:pop             
		widgetKeys.add(((Object) (annotId)));
	//  109  271:getstatic       #143 <Field HashSet widgetKeys>
	//  110  274:getstatic       #123 <Field PdfName annotId>
	//  111  277:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//  112  280:pop             
		fieldKeys.add(((Object) (PdfName.AA)));
	//  113  281:getstatic       #145 <Field HashSet fieldKeys>
	//  114  284:getstatic       #212 <Field PdfName PdfName.AA>
	//  115  287:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//  116  290:pop             
		fieldKeys.add(((Object) (PdfName.FT)));
	//  117  291:getstatic       #145 <Field HashSet fieldKeys>
	//  118  294:getstatic       #215 <Field PdfName PdfName.FT>
	//  119  297:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//  120  300:pop             
		fieldKeys.add(((Object) (PdfName.TU)));
	//  121  301:getstatic       #145 <Field HashSet fieldKeys>
	//  122  304:getstatic       #218 <Field PdfName PdfName.TU>
	//  123  307:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//  124  310:pop             
		fieldKeys.add(((Object) (PdfName.TM)));
	//  125  311:getstatic       #145 <Field HashSet fieldKeys>
	//  126  314:getstatic       #221 <Field PdfName PdfName.TM>
	//  127  317:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//  128  320:pop             
		fieldKeys.add(((Object) (PdfName.FF)));
	//  129  321:getstatic       #145 <Field HashSet fieldKeys>
	//  130  324:getstatic       #224 <Field PdfName PdfName.FF>
	//  131  327:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//  132  330:pop             
		fieldKeys.add(((Object) (PdfName.V)));
	//  133  331:getstatic       #145 <Field HashSet fieldKeys>
	//  134  334:getstatic       #227 <Field PdfName PdfName.V>
	//  135  337:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//  136  340:pop             
		fieldKeys.add(((Object) (PdfName.DV)));
	//  137  341:getstatic       #145 <Field HashSet fieldKeys>
	//  138  344:getstatic       #230 <Field PdfName PdfName.DV>
	//  139  347:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//  140  350:pop             
		fieldKeys.add(((Object) (PdfName.DS)));
	//  141  351:getstatic       #145 <Field HashSet fieldKeys>
	//  142  354:getstatic       #233 <Field PdfName PdfName.DS>
	//  143  357:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//  144  360:pop             
		fieldKeys.add(((Object) (PdfName.RV)));
	//  145  361:getstatic       #145 <Field HashSet fieldKeys>
	//  146  364:getstatic       #236 <Field PdfName PdfName.RV>
	//  147  367:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//  148  370:pop             
		fieldKeys.add(((Object) (PdfName.OPT)));
	//  149  371:getstatic       #145 <Field HashSet fieldKeys>
	//  150  374:getstatic       #239 <Field PdfName PdfName.OPT>
	//  151  377:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//  152  380:pop             
		fieldKeys.add(((Object) (PdfName.MAXLEN)));
	//  153  381:getstatic       #145 <Field HashSet fieldKeys>
	//  154  384:getstatic       #242 <Field PdfName PdfName.MAXLEN>
	//  155  387:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//  156  390:pop             
		fieldKeys.add(((Object) (PdfName.TI)));
	//  157  391:getstatic       #145 <Field HashSet fieldKeys>
	//  158  394:getstatic       #245 <Field PdfName PdfName.TI>
	//  159  397:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//  160  400:pop             
		fieldKeys.add(((Object) (PdfName.I)));
	//  161  401:getstatic       #145 <Field HashSet fieldKeys>
	//  162  404:getstatic       #247 <Field PdfName PdfName.I>
	//  163  407:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//  164  410:pop             
		fieldKeys.add(((Object) (PdfName.LOCK)));
	//  165  411:getstatic       #145 <Field HashSet fieldKeys>
	//  166  414:getstatic       #250 <Field PdfName PdfName.LOCK>
	//  167  417:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//  168  420:pop             
		fieldKeys.add(((Object) (PdfName.SV)));
	//  169  421:getstatic       #145 <Field HashSet fieldKeys>
	//  170  424:getstatic       #253 <Field PdfName PdfName.SV>
	//  171  427:invokevirtual   #152 <Method boolean HashSet.add(Object)>
	//  172  430:pop             
	//* 173  431:return          
	}


/*
	static boolean access$000(PdfCopy pdfcopy)
	{
		return pdfcopy.rotateContents;
	//    0    0:aload_0         
	//    1    1:getfield        #267 <Field boolean rotateContents>
	//    2    4:ireturn         
	}

*/
}
