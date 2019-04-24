// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.exceptions.BadPasswordException;
import com.itextpdf.text.log.Counter;
import com.itextpdf.text.log.CounterFactory;
import java.io.IOException;
import java.io.OutputStream;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfWriter, PdfName, PdfDocument, PdfDictionary, 
//			PdfCopyFields, PdfNumber, PdfArray, PdfReader, 
//			PdfObject, PdfString, PRIndirectReference, IntHashtable, 
//			AcroFields, PdfCopy, PdfIndirectObject, PdfPages, 
//			RandomAccessFileOrArray, PdfBoolean, PdfIndirectReference, PdfFormField

class PdfCopyFieldsImp extends PdfWriter
{

	PdfCopyFieldsImp(OutputStream outputstream)
		throws DocumentException
	{
		this(outputstream, '\0');
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #191 <Method void PdfCopyFieldsImp(OutputStream, char)>
	//    4    6:return          
	}

	PdfCopyFieldsImp(OutputStream outputstream, char c)
		throws DocumentException
	{
		super(new PdfDocument(), outputstream);
	//    0    0:aload_0         
	//    1    1:new             #194 <Class PdfDocument>
	//    2    4:dup             
	//    3    5:invokespecial   #195 <Method void PdfDocument()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #198 <Method void PdfWriter(PdfDocument, OutputStream)>
		readers = new ArrayList();
	//    6   12:aload_0         
	//    7   13:new             #200 <Class ArrayList>
	//    8   16:dup             
	//    9   17:invokespecial   #201 <Method void ArrayList()>
	//   10   20:putfield        #203 <Field ArrayList readers>
		readers2intrefs = new HashMap();
	//   11   23:aload_0         
	//   12   24:new             #72  <Class HashMap>
	//   13   27:dup             
	//   14   28:invokespecial   #74  <Method void HashMap()>
	//   15   31:putfield        #205 <Field HashMap readers2intrefs>
		pages2intrefs = new HashMap();
	//   16   34:aload_0         
	//   17   35:new             #72  <Class HashMap>
	//   18   38:dup             
	//   19   39:invokespecial   #74  <Method void HashMap()>
	//   20   42:putfield        #207 <Field HashMap pages2intrefs>
		visited = new HashMap();
	//   21   45:aload_0         
	//   22   46:new             #72  <Class HashMap>
	//   23   49:dup             
	//   24   50:invokespecial   #74  <Method void HashMap()>
	//   25   53:putfield        #209 <Field HashMap visited>
		fields = new ArrayList();
	//   26   56:aload_0         
	//   27   57:new             #200 <Class ArrayList>
	//   28   60:dup             
	//   29   61:invokespecial   #201 <Method void ArrayList()>
	//   30   64:putfield        #211 <Field ArrayList fields>
		fieldTree = new HashMap();
	//   31   67:aload_0         
	//   32   68:new             #72  <Class HashMap>
	//   33   71:dup             
	//   34   72:invokespecial   #74  <Method void HashMap()>
	//   35   75:putfield        #213 <Field HashMap fieldTree>
		pageRefs = new ArrayList();
	//   36   78:aload_0         
	//   37   79:new             #200 <Class ArrayList>
	//   38   82:dup             
	//   39   83:invokespecial   #201 <Method void ArrayList()>
	//   40   86:putfield        #215 <Field ArrayList pageRefs>
		pageDics = new ArrayList();
	//   41   89:aload_0         
	//   42   90:new             #200 <Class ArrayList>
	//   43   93:dup             
	//   44   94:invokespecial   #201 <Method void ArrayList()>
	//   45   97:putfield        #217 <Field ArrayList pageDics>
		resources = new PdfDictionary();
	//   46  100:aload_0         
	//   47  101:new             #219 <Class PdfDictionary>
	//   48  104:dup             
	//   49  105:invokespecial   #220 <Method void PdfDictionary()>
	//   50  108:putfield        #222 <Field PdfDictionary resources>
		closing = false;
	//   51  111:aload_0         
	//   52  112:iconst_0        
	//   53  113:putfield        #224 <Field boolean closing>
		calculationOrder = new ArrayList();
	//   54  116:aload_0         
	//   55  117:new             #200 <Class ArrayList>
	//   56  120:dup             
	//   57  121:invokespecial   #201 <Method void ArrayList()>
	//   58  124:putfield        #226 <Field ArrayList calculationOrder>
		needAppearances = false;
	//   59  127:aload_0         
	//   60  128:iconst_0        
	//   61  129:putfield        #228 <Field boolean needAppearances>
		mergedRadioButtons = new HashSet();
	//   62  132:aload_0         
	//   63  133:new             #230 <Class HashSet>
	//   64  136:dup             
	//   65  137:invokespecial   #231 <Method void HashSet()>
	//   66  140:putfield        #233 <Field HashSet mergedRadioButtons>
		COUNTER = CounterFactory.getCounter(com/itextpdf/text/pdf/PdfCopyFields);
	//   67  143:aload_0         
	//   68  144:ldc1            #235 <Class PdfCopyFields>
	//   69  146:invokestatic    #241 <Method Counter CounterFactory.getCounter(Class)>
	//   70  149:putfield        #243 <Field Counter COUNTER>
		pdf.addWriter(((PdfWriter) (this)));
	//   71  152:aload_0         
	//   72  153:getfield        #247 <Field PdfDocument pdf>
	//   73  156:aload_0         
	//   74  157:invokevirtual   #251 <Method void PdfDocument.addWriter(PdfWriter)>
		if(c != 0)
	//*  75  160:iload_2         
	//*  76  161:ifeq            169
			super.setPdfVersion(c);
	//   77  164:aload_0         
	//   78  165:iload_2         
	//   79  166:invokespecial   #255 <Method void PdfWriter.setPdfVersion(char)>
		nd = new Document();
	//   80  169:aload_0         
	//   81  170:new             #257 <Class Document>
	//   82  173:dup             
	//   83  174:invokespecial   #258 <Method void Document()>
	//   84  177:putfield        #260 <Field Document nd>
		nd.addDocListener(((com.itextpdf.text.DocListener) (pdf)));
	//   85  180:aload_0         
	//   86  181:getfield        #260 <Field Document nd>
	//   87  184:aload_0         
	//   88  185:getfield        #247 <Field PdfDocument pdf>
	//   89  188:invokevirtual   #264 <Method void Document.addDocListener(com.itextpdf.text.DocListener)>
	//   90  191:return          
	}

	private void adjustTabOrder(PdfArray pdfarray, PdfIndirectReference pdfindirectreference, PdfNumber pdfnumber)
	{
		int j1;
		j1 = pdfnumber.intValue();
	//    0    0:aload_3         
	//    1    1:invokevirtual   #272 <Method int PdfNumber.intValue()>
	//    2    4:istore          7
		pdfnumber = ((PdfNumber) ((ArrayList)tabOrder.get(((Object) (pdfarray)))));
	//    3    6:aload_0         
	//    4    7:getfield        #274 <Field HashMap tabOrder>
	//    5   10:aload_1         
	//    6   11:invokevirtual   #278 <Method Object HashMap.get(Object)>
	//    7   14:checkcast       #200 <Class ArrayList>
	//    8   17:astore_3        
		if(pdfnumber != null) goto _L2; else goto _L1
	//    9   18:aload_3         
	//   10   19:ifnonnull       92
_L1:
		pdfnumber = ((PdfNumber) (new ArrayList()));
	//   11   22:new             #200 <Class ArrayList>
	//   12   25:dup             
	//   13   26:invokespecial   #201 <Method void ArrayList()>
	//   14   29:astore_3        
		int k = pdfarray.size();
	//   15   30:aload_1         
	//   16   31:invokevirtual   #283 <Method int PdfArray.size()>
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
	//   26   49:getstatic       #70  <Field Integer zero>
	//   27   52:invokevirtual   #287 <Method boolean ArrayList.add(Object)>
	//   28   55:pop             

	//   29   56:iload           4
	//   30   58:iconst_1        
	//   31   59:iadd            
	//   32   60:istore          4
	//*  33   62:goto            39
		((ArrayList) (pdfnumber)).add(((Object) (Integer.valueOf(j1))));
	//   34   65:aload_3         
	//   35   66:iload           7
	//   36   68:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//   37   71:invokevirtual   #287 <Method boolean ArrayList.add(Object)>
	//   38   74:pop             
		tabOrder.put(((Object) (pdfarray)), ((Object) (pdfnumber)));
	//   39   75:aload_0         
	//   40   76:getfield        #274 <Field HashMap tabOrder>
	//   41   79:aload_1         
	//   42   80:aload_3         
	//   43   81:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//   44   84:pop             
		pdfarray.add(((PdfObject) (pdfindirectreference)));
	//   45   85:aload_1         
	//   46   86:aload_2         
	//   47   87:invokevirtual   #290 <Method boolean PdfArray.add(PdfObject)>
	//   48   90:pop             
_L4:
		return;
	//   49   91:return          
_L2:
		int j;
		int l;
		j = ((ArrayList) (pdfnumber)).size() - 1;
	//   50   92:aload_3         
	//   51   93:invokevirtual   #291 <Method int ArrayList.size()>
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
	//   63  116:invokevirtual   #294 <Method Object ArrayList.get(int)>
	//   64  119:checkcast       #64  <Class Integer>
	//   65  122:invokevirtual   #295 <Method int Integer.intValue()>
	//   66  125:iload           7
	//   67  127:icmpgt          180
		((ArrayList) (pdfnumber)).add(l + 1, ((Object) (Integer.valueOf(j1))));
	//   68  130:aload_3         
	//   69  131:iload           5
	//   70  133:iconst_1        
	//   71  134:iadd            
	//   72  135:iload           7
	//   73  137:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//   74  140:invokevirtual   #298 <Method void ArrayList.add(int, Object)>
		pdfarray.add(l + 1, ((PdfObject) (pdfindirectreference)));
	//   75  143:aload_1         
	//   76  144:iload           5
	//   77  146:iconst_1        
	//   78  147:iadd            
	//   79  148:aload_2         
	//   80  149:invokevirtual   #301 <Method void PdfArray.add(int, PdfObject)>
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
	//   89  167:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//   90  170:invokevirtual   #298 <Method void ArrayList.add(int, Object)>
		pdfarray.add(0, ((PdfObject) (pdfindirectreference)));
	//   91  173:aload_1         
	//   92  174:iconst_0        
	//   93  175:aload_2         
	//   94  176:invokevirtual   #301 <Method void PdfArray.add(int, PdfObject)>
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

	private static String getCOName(PdfReader pdfreader, PRIndirectReference prindirectreference)
	{
		pdfreader = "";
	//    0    0:ldc2            #305 <String "">
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
	//    5    9:invokestatic    #311 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//    6   12:astore_1        
					if(prindirectreference != null && ((PdfObject) (prindirectreference)).type() == 6)
						break label0;
	//    7   13:aload_1         
	//    8   14:ifnull          26
	//    9   17:aload_1         
	//   10   18:invokevirtual   #316 <Method int PdfObject.type()>
	//   11   21:bipush          6
	//   12   23:icmpeq          52
				}
				prindirectreference = ((PRIndirectReference) (pdfreader));
	//   13   26:aload_0         
	//   14   27:astore_1        
				if(((String) (pdfreader)).endsWith("."))
	//*  15   28:aload_0         
	//*  16   29:ldc2            #318 <String ".">
	//*  17   32:invokevirtual   #324 <Method boolean String.endsWith(String)>
	//*  18   35:ifeq            50
					prindirectreference = ((PRIndirectReference) (((String) (pdfreader)).substring(0, ((String) (pdfreader)).length() - 1)));
	//   19   38:aload_0         
	//   20   39:iconst_0        
	//   21   40:aload_0         
	//   22   41:invokevirtual   #327 <Method int String.length()>
	//   23   44:iconst_1        
	//   24   45:isub            
	//   25   46:invokevirtual   #331 <Method String String.substring(int, int)>
	//   26   49:astore_1        
				return ((String) (prindirectreference));
	//   27   50:aload_1         
	//   28   51:areturn         
			}
			Object obj = ((Object) ((PdfDictionary)prindirectreference));
	//   29   52:aload_1         
	//   30   53:checkcast       #219 <Class PdfDictionary>
	//   31   56:astore_2        
			PdfString pdfstring = ((PdfDictionary) (obj)).getAsString(PdfName.T);
	//   32   57:aload_2         
	//   33   58:getstatic       #334 <Field PdfName PdfName.T>
	//   34   61:invokevirtual   #338 <Method PdfString PdfDictionary.getAsString(PdfName)>
	//   35   64:astore_3        
			prindirectreference = ((PRIndirectReference) (pdfreader));
	//   36   65:aload_0         
	//   37   66:astore_1        
			if(pdfstring != null)
	//*  38   67:aload_3         
	//*  39   68:ifnull          99
				prindirectreference = ((PRIndirectReference) ((new StringBuilder()).append(pdfstring.toUnicodeString()).append(".").append(((String) (pdfreader))).toString()));
	//   40   71:new             #340 <Class StringBuilder>
	//   41   74:dup             
	//   42   75:invokespecial   #341 <Method void StringBuilder()>
	//   43   78:aload_3         
	//   44   79:invokevirtual   #347 <Method String PdfString.toUnicodeString()>
	//   45   82:invokevirtual   #351 <Method StringBuilder StringBuilder.append(String)>
	//   46   85:ldc2            #318 <String ".">
	//   47   88:invokevirtual   #351 <Method StringBuilder StringBuilder.append(String)>
	//   48   91:aload_0         
	//   49   92:invokevirtual   #351 <Method StringBuilder StringBuilder.append(String)>
	//   50   95:invokevirtual   #354 <Method String StringBuilder.toString()>
	//   51   98:astore_1        
			obj = ((Object) ((PRIndirectReference)((PdfDictionary) (obj)).get(PdfName.PARENT)));
	//   52   99:aload_2         
	//   53  100:getstatic       #357 <Field PdfName PdfName.PARENT>
	//   54  103:invokevirtual   #360 <Method PdfObject PdfDictionary.get(PdfName)>
	//   55  106:checkcast       #362 <Class PRIndirectReference>
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

	void addDocument(PdfReader pdfreader)
		throws DocumentException, IOException
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(!pdfreader.isOpenedWithFullPermissions())
	//*   2    2:aload_1         
	//*   3    3:invokevirtual   #370 <Method boolean PdfReader.isOpenedWithFullPermissions()>
	//*   4    6:ifne            27
			throw new BadPasswordException(MessageLocalization.getComposedMessage("pdfreader.not.opened.with.owner.password", new Object[0]));
	//    5    9:new             #372 <Class BadPasswordException>
	//    6   12:dup             
	//    7   13:ldc2            #374 <String "pdfreader.not.opened.with.owner.password">
	//    8   16:iconst_0        
	//    9   17:anewarray       Object[]
	//   10   20:invokestatic    #382 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   11   23:invokespecial   #383 <Method void BadPasswordException(String)>
	//   12   26:athrow          
		openDoc();
	//   13   27:aload_0         
	//   14   28:invokevirtual   #386 <Method void openDoc()>
		int j;
		Object obj;
		if(readers2intrefs.containsKey(((Object) (pdfreader))))
	//*  15   31:aload_0         
	//*  16   32:getfield        #205 <Field HashMap readers2intrefs>
	//*  17   35:aload_1         
	//*  18   36:invokevirtual   #389 <Method boolean HashMap.containsKey(Object)>
	//*  19   39:ifeq            131
		{
			pdfreader = new PdfReader(pdfreader);
	//   20   42:new             #307 <Class PdfReader>
	//   21   45:dup             
	//   22   46:aload_1         
	//   23   47:invokespecial   #391 <Method void PdfReader(PdfReader)>
	//   24   50:astore_1        
		} else
	//*  25   51:aload_1         
	//*  26   52:invokevirtual   #394 <Method int PdfReader.shuffleSubsetNames()>
	//*  27   55:pop             
	//*  28   56:aload_0         
	//*  29   57:getfield        #205 <Field HashMap readers2intrefs>
	//*  30   60:aload_1         
	//*  31   61:new             #396 <Class IntHashtable>
	//*  32   64:dup             
	//*  33   65:invokespecial   #397 <Method void IntHashtable()>
	//*  34   68:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//*  35   71:pop             
	//*  36   72:aload_0         
	//*  37   73:getfield        #203 <Field ArrayList readers>
	//*  38   76:aload_1         
	//*  39   77:invokevirtual   #287 <Method boolean ArrayList.add(Object)>
	//*  40   80:pop             
	//*  41   81:aload_1         
	//*  42   82:invokevirtual   #400 <Method int PdfReader.getNumberOfPages()>
	//*  43   85:istore          4
	//*  44   87:new             #396 <Class IntHashtable>
	//*  45   90:dup             
	//*  46   91:invokespecial   #397 <Method void IntHashtable()>
	//*  47   94:astore          5
	//*  48   96:iconst_1        
	//*  49   97:istore_2        
	//*  50   98:iload_2         
	//*  51   99:iload           4
	//*  52  101:icmpgt          168
	//*  53  104:aload           5
	//*  54  106:aload_1         
	//*  55  107:iload_2         
	//*  56  108:invokevirtual   #404 <Method PRIndirectReference PdfReader.getPageOrigRef(int)>
	//*  57  111:invokevirtual   #407 <Method int PRIndirectReference.getNumber()>
	//*  58  114:iconst_1        
	//*  59  115:invokevirtual   #410 <Method int IntHashtable.put(int, int)>
	//*  60  118:pop             
	//*  61  119:aload_1         
	//*  62  120:iload_2         
	//*  63  121:invokevirtual   #414 <Method void PdfReader.releasePage(int)>
	//*  64  124:iload_2         
	//*  65  125:iconst_1        
	//*  66  126:iadd            
	//*  67  127:istore_2        
	//*  68  128:goto            98
		{
			if(pdfreader.isTampered())
	//*  69  131:aload_1         
	//*  70  132:invokevirtual   #417 <Method boolean PdfReader.isTampered()>
	//*  71  135:ifeq            156
				throw new DocumentException(MessageLocalization.getComposedMessage("the.document.was.reused", new Object[0]));
	//   72  138:new             #188 <Class DocumentException>
	//   73  141:dup             
	//   74  142:ldc2            #419 <String "the.document.was.reused">
	//   75  145:iconst_0        
	//   76  146:anewarray       Object[]
	//   77  149:invokestatic    #382 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   78  152:invokespecial   #420 <Method void DocumentException(String)>
	//   79  155:athrow          
			pdfreader.consolidateNamedDestinations();
	//   80  156:aload_1         
	//   81  157:invokevirtual   #423 <Method void PdfReader.consolidateNamedDestinations()>
			pdfreader.setTampered(true);
	//   82  160:aload_1         
	//   83  161:iconst_1        
	//   84  162:invokevirtual   #427 <Method void PdfReader.setTampered(boolean)>
		}
		pdfreader.shuffleSubsetNames();
		readers2intrefs.put(((Object) (pdfreader)), ((Object) (new IntHashtable())));
		readers.add(((Object) (pdfreader)));
		j = pdfreader.getNumberOfPages();
		obj = ((Object) (new IntHashtable()));
		for(int i = 1; i <= j; i++)
		{
			((IntHashtable) (obj)).put(pdfreader.getPageOrigRef(i).getNumber(), 1);
			pdfreader.releasePage(i);
		}

	//*  85  165:goto            51
		pages2intrefs.put(((Object) (pdfreader)), obj);
	//   86  168:aload_0         
	//   87  169:getfield        #207 <Field HashMap pages2intrefs>
	//   88  172:aload_1         
	//   89  173:aload           5
	//   90  175:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//   91  178:pop             
		visited.put(((Object) (pdfreader)), ((Object) (new IntHashtable())));
	//   92  179:aload_0         
	//   93  180:getfield        #209 <Field HashMap visited>
	//   94  183:aload_1         
	//   95  184:new             #396 <Class IntHashtable>
	//   96  187:dup             
	//   97  188:invokespecial   #397 <Method void IntHashtable()>
	//   98  191:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//   99  194:pop             
		obj = ((Object) (pdfreader.getAcroFields()));
	//  100  195:aload_1         
	//  101  196:invokevirtual   #431 <Method AcroFields PdfReader.getAcroFields()>
	//  102  199:astore          5
		boolean flag = flag1;
	//  103  201:iload_3         
	//  104  202:istore_2        
		if(!((AcroFields) (obj)).isGenerateAppearances())
	//* 105  203:aload           5
	//* 106  205:invokevirtual   #436 <Method boolean AcroFields.isGenerateAppearances()>
	//* 107  208:ifne            213
			flag = true;
	//  108  211:iconst_1        
	//  109  212:istore_2        
		if(flag)
	//* 110  213:iload_2         
	//* 111  214:ifeq            222
			needAppearances = true;
	//  112  217:aload_0         
	//  113  218:iconst_1        
	//  114  219:putfield        #228 <Field boolean needAppearances>
		fields.add(obj);
	//  115  222:aload_0         
	//  116  223:getfield        #211 <Field ArrayList fields>
	//  117  226:aload           5
	//  118  228:invokevirtual   #287 <Method boolean ArrayList.add(Object)>
	//  119  231:pop             
		updateCalculationOrder(pdfreader);
	//  120  232:aload_0         
	//  121  233:aload_1         
	//  122  234:invokevirtual   #439 <Method void updateCalculationOrder(PdfReader)>
	//  123  237:return          
	}

	void addDocument(PdfReader pdfreader, List list)
		throws DocumentException, IOException
	{
		if(!readers2intrefs.containsKey(((Object) (pdfreader))) && pdfreader.isTampered())
	//*   0    0:aload_0         
	//*   1    1:getfield        #205 <Field HashMap readers2intrefs>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #389 <Method boolean HashMap.containsKey(Object)>
	//*   4    8:ifne            36
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #417 <Method boolean PdfReader.isTampered()>
	//*   7   15:ifeq            36
			throw new DocumentException(MessageLocalization.getComposedMessage("the.document.was.reused", new Object[0]));
	//    8   18:new             #188 <Class DocumentException>
	//    9   21:dup             
	//   10   22:ldc2            #419 <String "the.document.was.reused">
	//   11   25:iconst_0        
	//   12   26:anewarray       Object[]
	//   13   29:invokestatic    #382 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   14   32:invokespecial   #420 <Method void DocumentException(String)>
	//   15   35:athrow          
		pdfreader = new PdfReader(pdfreader);
	//   16   36:new             #307 <Class PdfReader>
	//   17   39:dup             
	//   18   40:aload_1         
	//   19   41:invokespecial   #391 <Method void PdfReader(PdfReader)>
	//   20   44:astore_1        
		pdfreader.selectPages(list);
	//   21   45:aload_1         
	//   22   46:aload_2         
	//   23   47:invokevirtual   #444 <Method void PdfReader.selectPages(List)>
		if(pdfreader.getNumberOfPages() == 0)
	//*  24   50:aload_1         
	//*  25   51:invokevirtual   #400 <Method int PdfReader.getNumberOfPages()>
	//*  26   54:ifne            58
		{
			return;
	//   27   57:return          
		} else
		{
			pdfreader.setTampered(false);
	//   28   58:aload_1         
	//   29   59:iconst_0        
	//   30   60:invokevirtual   #427 <Method void PdfReader.setTampered(boolean)>
			addDocument(pdfreader);
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:invokevirtual   #446 <Method void addDocument(PdfReader)>
			return;
	//   34   68:return          
		}
	}

	void addPageOffsetToField(Map map, int i)
	{
		if(i != 0)
	//*   0    0:iload_2         
	//*   1    1:ifne            5
	//*   2    4:return          
		{
			map = ((Map) (map.values().iterator()));
	//    3    5:aload_1         
	//    4    6:invokeinterface #456 <Method Collection Map.values()>
	//    5   11:invokeinterface #462 <Method Iterator Collection.iterator()>
	//    6   16:astore_1        
			while(((Iterator) (map)).hasNext()) 
	//*   7   17:aload_1         
	//*   8   18:invokeinterface #467 <Method boolean Iterator.hasNext()>
	//*   9   23:ifeq            4
			{
				AcroFields.Item item = (AcroFields.Item)((Iterator) (map)).next();
	//   10   26:aload_1         
	//   11   27:invokeinterface #471 <Method Object Iterator.next()>
	//   12   32:checkcast       #473 <Class AcroFields$Item>
	//   13   35:astore          4
				int j = 0;
	//   14   37:iconst_0        
	//   15   38:istore_3        
				while(j < item.size()) 
	//*  16   39:iload_3         
	//*  17   40:aload           4
	//*  18   42:invokevirtual   #474 <Method int AcroFields$Item.size()>
	//*  19   45:icmpge          17
				{
					item.forcePage(j, item.getPage(j).intValue() + i);
	//   20   48:aload           4
	//   21   50:iload_3         
	//   22   51:aload           4
	//   23   53:iload_3         
	//   24   54:invokevirtual   #477 <Method Integer AcroFields$Item.getPage(int)>
	//   25   57:invokevirtual   #295 <Method int Integer.intValue()>
	//   26   60:iload_2         
	//   27   61:iadd            
	//   28   62:invokevirtual   #481 <Method void AcroFields$Item.forcePage(int, int)>
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

	protected PdfArray branchForm(HashMap hashmap, PdfIndirectReference pdfindirectreference, String s)
		throws IOException
	{
		PdfArray pdfarray;
		Iterator iterator;
		pdfarray = new PdfArray();
	//    0    0:new             #280 <Class PdfArray>
	//    1    3:dup             
	//    2    4:invokespecial   #485 <Method void PdfArray()>
	//    3    7:astore          7
		iterator = hashmap.entrySet().iterator();
	//    4    9:aload_1         
	//    5   10:invokevirtual   #489 <Method Set HashMap.entrySet()>
	//    6   13:invokeinterface #492 <Method Iterator Set.iterator()>
	//    7   18:astore          8
_L7:
		if(!iterator.hasNext()) goto _L2; else goto _L1
	//    8   20:aload           8
	//    9   22:invokeinterface #467 <Method boolean Iterator.hasNext()>
	//   10   27:ifeq            732
_L1:
		PdfIndirectReference pdfindirectreference1;
		PdfDictionary pdfdictionary;
		Object obj3;
		Object obj = ((Object) ((java.util.Map.Entry)iterator.next()));
	//   11   30:aload           8
	//   12   32:invokeinterface #471 <Method Object Iterator.next()>
	//   13   37:checkcast       #494 <Class java.util.Map$Entry>
	//   14   40:astore          6
		hashmap = ((HashMap) ((String)((java.util.Map.Entry) (obj)).getKey()));
	//   15   42:aload           6
	//   16   44:invokeinterface #497 <Method Object java.util.Map$Entry.getKey()>
	//   17   49:checkcast       #320 <Class String>
	//   18   52:astore_1        
		obj = ((java.util.Map.Entry) (obj)).getValue();
	//   19   53:aload           6
	//   20   55:invokeinterface #500 <Method Object java.util.Map$Entry.getValue()>
	//   21   60:astore          6
		pdfindirectreference1 = getPdfIndirectReference();
	//   22   62:aload_0         
	//   23   63:invokevirtual   #504 <Method PdfIndirectReference getPdfIndirectReference()>
	//   24   66:astore          9
		pdfdictionary = new PdfDictionary();
	//   25   68:new             #219 <Class PdfDictionary>
	//   26   71:dup             
	//   27   72:invokespecial   #220 <Method void PdfDictionary()>
	//   28   75:astore          10
		if(pdfindirectreference != null)
	//*  29   77:aload_2         
	//*  30   78:ifnull          90
			pdfdictionary.put(PdfName.PARENT, ((PdfObject) (pdfindirectreference)));
	//   31   81:aload           10
	//   32   83:getstatic       #357 <Field PdfName PdfName.PARENT>
	//   33   86:aload_2         
	//   34   87:invokevirtual   #507 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary.put(PdfName.T, ((PdfObject) (new PdfString(((String) (hashmap)), "UnicodeBig"))));
	//   35   90:aload           10
	//   36   92:getstatic       #334 <Field PdfName PdfName.T>
	//   37   95:new             #343 <Class PdfString>
	//   38   98:dup             
	//   39   99:aload_1         
	//   40  100:ldc2            #509 <String "UnicodeBig">
	//   41  103:invokespecial   #512 <Method void PdfString(String, String)>
	//   42  106:invokevirtual   #507 <Method void PdfDictionary.put(PdfName, PdfObject)>
		hashmap = ((HashMap) ((new StringBuilder()).append(s).append(".").append(((String) (hashmap))).toString()));
	//   43  109:new             #340 <Class StringBuilder>
	//   44  112:dup             
	//   45  113:invokespecial   #341 <Method void StringBuilder()>
	//   46  116:aload_3         
	//   47  117:invokevirtual   #351 <Method StringBuilder StringBuilder.append(String)>
	//   48  120:ldc2            #318 <String ".">
	//   49  123:invokevirtual   #351 <Method StringBuilder StringBuilder.append(String)>
	//   50  126:aload_1         
	//   51  127:invokevirtual   #351 <Method StringBuilder StringBuilder.append(String)>
	//   52  130:invokevirtual   #354 <Method String StringBuilder.toString()>
	//   53  133:astore_1        
		int i = calculationOrder.indexOf(((Object) (hashmap)));
	//   54  134:aload_0         
	//   55  135:getfield        #226 <Field ArrayList calculationOrder>
	//   56  138:aload_1         
	//   57  139:invokevirtual   #516 <Method int ArrayList.indexOf(Object)>
	//   58  142:istore          4
		if(i >= 0)
	//*  59  144:iload           4
	//*  60  146:iflt            161
			calculationOrderRefs.set(i, ((Object) (pdfindirectreference1)));
	//   61  149:aload_0         
	//   62  150:getfield        #518 <Field ArrayList calculationOrderRefs>
	//   63  153:iload           4
	//   64  155:aload           9
	//   65  157:invokevirtual   #522 <Method Object ArrayList.set(int, Object)>
	//   66  160:pop             
		if(obj instanceof HashMap)
	//*  67  161:aload           6
	//*  68  163:instanceof      #72  <Class HashMap>
	//*  69  166:ifeq            209
		{
			pdfdictionary.put(PdfName.KIDS, ((PdfObject) (branchForm((HashMap)obj, pdfindirectreference1, ((String) (hashmap))))));
	//   70  169:aload           10
	//   71  171:getstatic       #525 <Field PdfName PdfName.KIDS>
	//   72  174:aload_0         
	//   73  175:aload           6
	//   74  177:checkcast       #72  <Class HashMap>
	//   75  180:aload           9
	//   76  182:aload_1         
	//   77  183:invokevirtual   #527 <Method PdfArray branchForm(HashMap, PdfIndirectReference, String)>
	//   78  186:invokevirtual   #507 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfarray.add(((PdfObject) (pdfindirectreference1)));
	//   79  189:aload           7
	//   80  191:aload           9
	//   81  193:invokevirtual   #290 <Method boolean PdfArray.add(PdfObject)>
	//   82  196:pop             
			addToBody(((PdfObject) (pdfdictionary)), pdfindirectreference1);
	//   83  197:aload_0         
	//   84  198:aload           10
	//   85  200:aload           9
	//   86  202:invokevirtual   #531 <Method PdfIndirectObject addToBody(PdfObject, PdfIndirectReference)>
	//   87  205:pop             
			continue; /* Loop/switch isn't completed */
	//   88  206:goto            20
		}
		obj3 = ((Object) ((ArrayList)obj));
	//   89  209:aload           6
	//   90  211:checkcast       #200 <Class ArrayList>
	//   91  214:astore          11
		pdfdictionary.mergeDifferent((PdfDictionary)((ArrayList) (obj3)).get(0));
	//   92  216:aload           10
	//   93  218:aload           11
	//   94  220:iconst_0        
	//   95  221:invokevirtual   #294 <Method Object ArrayList.get(int)>
	//   96  224:checkcast       #219 <Class PdfDictionary>
	//   97  227:invokevirtual   #535 <Method void PdfDictionary.mergeDifferent(PdfDictionary)>
		if(((ArrayList) (obj3)).size() != 3) goto _L4; else goto _L3
	//   98  230:aload           11
	//   99  232:invokevirtual   #291 <Method int ArrayList.size()>
	//  100  235:iconst_3        
	//  101  236:icmpne          376
_L3:
		pdfdictionary.mergeDifferent((PdfDictionary)((ArrayList) (obj3)).get(2));
	//  102  239:aload           10
	//  103  241:aload           11
	//  104  243:iconst_2        
	//  105  244:invokevirtual   #294 <Method Object ArrayList.get(int)>
	//  106  247:checkcast       #219 <Class PdfDictionary>
	//  107  250:invokevirtual   #535 <Method void PdfDictionary.mergeDifferent(PdfDictionary)>
		int j = ((Integer)((ArrayList) (obj3)).get(1)).intValue();
	//  108  253:aload           11
	//  109  255:iconst_1        
	//  110  256:invokevirtual   #294 <Method Object ArrayList.get(int)>
	//  111  259:checkcast       #64  <Class Integer>
	//  112  262:invokevirtual   #295 <Method int Integer.intValue()>
	//  113  265:istore          4
		obj3 = ((Object) ((PdfDictionary)pageDics.get(j - 1)));
	//  114  267:aload_0         
	//  115  268:getfield        #217 <Field ArrayList pageDics>
	//  116  271:iload           4
	//  117  273:iconst_1        
	//  118  274:isub            
	//  119  275:invokevirtual   #294 <Method Object ArrayList.get(int)>
	//  120  278:checkcast       #219 <Class PdfDictionary>
	//  121  281:astore          11
		Object obj1 = ((Object) (((PdfDictionary) (obj3)).getAsArray(PdfName.ANNOTS)));
	//  122  283:aload           11
	//  123  285:getstatic       #538 <Field PdfName PdfName.ANNOTS>
	//  124  288:invokevirtual   #542 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//  125  291:astore          6
		hashmap = ((HashMap) (obj1));
	//  126  293:aload           6
	//  127  295:astore_1        
		if(obj1 == null)
	//* 128  296:aload           6
	//* 129  298:ifnonnull       318
		{
			hashmap = ((HashMap) (new PdfArray()));
	//  130  301:new             #280 <Class PdfArray>
	//  131  304:dup             
	//  132  305:invokespecial   #485 <Method void PdfArray()>
	//  133  308:astore_1        
			((PdfDictionary) (obj3)).put(PdfName.ANNOTS, ((PdfObject) (hashmap)));
	//  134  309:aload           11
	//  135  311:getstatic       #538 <Field PdfName PdfName.ANNOTS>
	//  136  314:aload_1         
	//  137  315:invokevirtual   #507 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}
		obj1 = ((Object) ((PdfNumber)pdfdictionary.get(iTextTag)));
	//  138  318:aload           10
	//  139  320:getstatic       #62  <Field PdfName iTextTag>
	//  140  323:invokevirtual   #360 <Method PdfObject PdfDictionary.get(PdfName)>
	//  141  326:checkcast       #268 <Class PdfNumber>
	//  142  329:astore          6
		pdfdictionary.remove(iTextTag);
	//  143  331:aload           10
	//  144  333:getstatic       #62  <Field PdfName iTextTag>
	//  145  336:invokevirtual   #546 <Method void PdfDictionary.remove(PdfName)>
		adjustTabOrder(((PdfArray) (hashmap)), pdfindirectreference1, ((PdfNumber) (obj1)));
	//  146  339:aload_0         
	//  147  340:aload_1         
	//  148  341:aload           9
	//  149  343:aload           6
	//  150  345:invokespecial   #548 <Method void adjustTabOrder(PdfArray, PdfIndirectReference, PdfNumber)>
_L5:
		pdfarray.add(((PdfObject) (pdfindirectreference1)));
	//  151  348:aload           7
	//  152  350:aload           9
	//  153  352:invokevirtual   #290 <Method boolean PdfArray.add(PdfObject)>
	//  154  355:pop             
		addToBody(((PdfObject) (pdfdictionary)), pdfindirectreference1);
	//  155  356:aload_0         
	//  156  357:aload           10
	//  157  359:aload           9
	//  158  361:invokevirtual   #531 <Method PdfIndirectObject addToBody(PdfObject, PdfIndirectReference)>
	//  159  364:pop             
		propagate(((PdfObject) (pdfdictionary)), ((PdfIndirectReference) (null)), false);
	//  160  365:aload_0         
	//  161  366:aload           10
	//  162  368:aconst_null     
	//  163  369:iconst_0        
	//  164  370:invokevirtual   #552 <Method void propagate(PdfObject, PdfIndirectReference, boolean)>
		continue; /* Loop/switch isn't completed */
	//  165  373:goto            20
_L4:
		PdfDictionary pdfdictionary1 = (PdfDictionary)((ArrayList) (obj3)).get(0);
	//  166  376:aload           11
	//  167  378:iconst_0        
	//  168  379:invokevirtual   #294 <Method Object ArrayList.get(int)>
	//  169  382:checkcast       #219 <Class PdfDictionary>
	//  170  385:astore          12
		PdfName pdfname = pdfdictionary1.getAsName(PdfName.V);
	//  171  387:aload           12
	//  172  389:getstatic       #157 <Field PdfName PdfName.V>
	//  173  392:invokevirtual   #556 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//  174  395:astore          13
		PdfArray pdfarray1 = new PdfArray();
	//  175  397:new             #280 <Class PdfArray>
	//  176  400:dup             
	//  177  401:invokespecial   #485 <Method void PdfArray()>
	//  178  404:astore          14
		int k = 1;
	//  179  406:iconst_1        
	//  180  407:istore          4
		while(k < ((ArrayList) (obj3)).size()) 
	//* 181  409:iload           4
	//* 182  411:aload           11
	//* 183  413:invokevirtual   #291 <Method int ArrayList.size()>
	//* 184  416:icmpge          719
		{
			int l = ((Integer)((ArrayList) (obj3)).get(k)).intValue();
	//  185  419:aload           11
	//  186  421:iload           4
	//  187  423:invokevirtual   #294 <Method Object ArrayList.get(int)>
	//  188  426:checkcast       #64  <Class Integer>
	//  189  429:invokevirtual   #295 <Method int Integer.intValue()>
	//  190  432:istore          5
			Object obj4 = ((Object) ((PdfDictionary)pageDics.get(l - 1)));
	//  191  434:aload_0         
	//  192  435:getfield        #217 <Field ArrayList pageDics>
	//  193  438:iload           5
	//  194  440:iconst_1        
	//  195  441:isub            
	//  196  442:invokevirtual   #294 <Method Object ArrayList.get(int)>
	//  197  445:checkcast       #219 <Class PdfDictionary>
	//  198  448:astore          15
			Object obj2 = ((Object) (((PdfDictionary) (obj4)).getAsArray(PdfName.ANNOTS)));
	//  199  450:aload           15
	//  200  452:getstatic       #538 <Field PdfName PdfName.ANNOTS>
	//  201  455:invokevirtual   #542 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//  202  458:astore          6
			hashmap = ((HashMap) (obj2));
	//  203  460:aload           6
	//  204  462:astore_1        
			if(obj2 == null)
	//* 205  463:aload           6
	//* 206  465:ifnonnull       485
			{
				hashmap = ((HashMap) (new PdfArray()));
	//  207  468:new             #280 <Class PdfArray>
	//  208  471:dup             
	//  209  472:invokespecial   #485 <Method void PdfArray()>
	//  210  475:astore_1        
				((PdfDictionary) (obj4)).put(PdfName.ANNOTS, ((PdfObject) (hashmap)));
	//  211  476:aload           15
	//  212  478:getstatic       #538 <Field PdfName PdfName.ANNOTS>
	//  213  481:aload_1         
	//  214  482:invokevirtual   #507 <Method void PdfDictionary.put(PdfName, PdfObject)>
			}
			obj2 = ((Object) (new PdfDictionary()));
	//  215  485:new             #219 <Class PdfDictionary>
	//  216  488:dup             
	//  217  489:invokespecial   #220 <Method void PdfDictionary()>
	//  218  492:astore          6
			((PdfDictionary) (obj2)).merge((PdfDictionary)((ArrayList) (obj3)).get(k + 1));
	//  219  494:aload           6
	//  220  496:aload           11
	//  221  498:iload           4
	//  222  500:iconst_1        
	//  223  501:iadd            
	//  224  502:invokevirtual   #294 <Method Object ArrayList.get(int)>
	//  225  505:checkcast       #219 <Class PdfDictionary>
	//  226  508:invokevirtual   #559 <Method void PdfDictionary.merge(PdfDictionary)>
			((PdfDictionary) (obj2)).put(PdfName.PARENT, ((PdfObject) (pdfindirectreference1)));
	//  227  511:aload           6
	//  228  513:getstatic       #357 <Field PdfName PdfName.PARENT>
	//  229  516:aload           9
	//  230  518:invokevirtual   #507 <Method void PdfDictionary.put(PdfName, PdfObject)>
			obj4 = ((Object) ((PdfNumber)((PdfDictionary) (obj2)).get(iTextTag)));
	//  231  521:aload           6
	//  232  523:getstatic       #62  <Field PdfName iTextTag>
	//  233  526:invokevirtual   #360 <Method PdfObject PdfDictionary.get(PdfName)>
	//  234  529:checkcast       #268 <Class PdfNumber>
	//  235  532:astore          15
			((PdfDictionary) (obj2)).remove(iTextTag);
	//  236  534:aload           6
	//  237  536:getstatic       #62  <Field PdfName iTextTag>
	//  238  539:invokevirtual   #546 <Method void PdfDictionary.remove(PdfName)>
			PdfIndirectReference pdfindirectreference2;
			if(PdfCopy.isCheckButton(pdfdictionary1))
	//* 239  542:aload           12
	//* 240  544:invokestatic    #565 <Method boolean PdfCopy.isCheckButton(PdfDictionary)>
	//* 241  547:ifeq            625
			{
				PdfName pdfname1 = ((PdfDictionary) (obj2)).getAsName(PdfName.AS);
	//  242  550:aload           6
	//  243  552:getstatic       #112 <Field PdfName PdfName.AS>
	//  244  555:invokevirtual   #556 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//  245  558:astore          16
				if(pdfname != null && pdfname1 != null)
	//* 246  560:aload           13
	//* 247  562:ifnull          580
	//* 248  565:aload           16
	//* 249  567:ifnull          580
					((PdfDictionary) (obj2)).put(PdfName.AS, ((PdfObject) (pdfname)));
	//  250  570:aload           6
	//  251  572:getstatic       #112 <Field PdfName PdfName.AS>
	//  252  575:aload           13
	//  253  577:invokevirtual   #507 <Method void PdfDictionary.put(PdfName, PdfObject)>
			} else
	//* 254  580:aload_0         
	//* 255  581:aload           6
	//* 256  583:invokevirtual   #568 <Method PdfIndirectObject addToBody(PdfObject)>
	//* 257  586:invokevirtual   #573 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//* 258  589:astore          16
	//* 259  591:aload_0         
	//* 260  592:aload_1         
	//* 261  593:aload           16
	//* 262  595:aload           15
	//* 263  597:invokespecial   #548 <Method void adjustTabOrder(PdfArray, PdfIndirectReference, PdfNumber)>
	//* 264  600:aload           14
	//* 265  602:aload           16
	//* 266  604:invokevirtual   #290 <Method boolean PdfArray.add(PdfObject)>
	//* 267  607:pop             
	//* 268  608:aload_0         
	//* 269  609:aload           6
	//* 270  611:aconst_null     
	//* 271  612:iconst_0        
	//* 272  613:invokevirtual   #552 <Method void propagate(PdfObject, PdfIndirectReference, boolean)>
	//* 273  616:iload           4
	//* 274  618:iconst_2        
	//* 275  619:iadd            
	//* 276  620:istore          4
	//* 277  622:goto            409
			if(PdfCopy.isRadioButton(pdfdictionary1))
	//* 278  625:aload           12
	//* 279  627:invokestatic    #576 <Method boolean PdfCopy.isRadioButton(PdfDictionary)>
	//* 280  630:ifeq            580
			{
				PdfName pdfname2 = ((PdfDictionary) (obj2)).getAsName(PdfName.AS);
	//  281  633:aload           6
	//  282  635:getstatic       #112 <Field PdfName PdfName.AS>
	//  283  638:invokevirtual   #556 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//  284  641:astore          16
				if(pdfname != null && pdfname2 != null && !pdfname2.equals(((Object) (getOffStateName(((PdfDictionary) (obj2)))))))
	//* 285  643:aload           13
	//* 286  645:ifnull          580
	//* 287  648:aload           16
	//* 288  650:ifnull          580
	//* 289  653:aload           16
	//* 290  655:aload_0         
	//* 291  656:aload           6
	//* 292  658:invokevirtual   #580 <Method PdfName getOffStateName(PdfDictionary)>
	//* 293  661:invokevirtual   #583 <Method boolean PdfName.equals(Object)>
	//* 294  664:ifne            580
					if(!mergedRadioButtons.contains(obj3))
	//* 295  667:aload_0         
	//* 296  668:getfield        #233 <Field HashSet mergedRadioButtons>
	//* 297  671:aload           11
	//* 298  673:invokevirtual   #586 <Method boolean HashSet.contains(Object)>
	//* 299  676:ifne            702
					{
						mergedRadioButtons.add(obj3);
	//  300  679:aload_0         
	//  301  680:getfield        #233 <Field HashSet mergedRadioButtons>
	//  302  683:aload           11
	//  303  685:invokevirtual   #587 <Method boolean HashSet.add(Object)>
	//  304  688:pop             
						((PdfDictionary) (obj2)).put(PdfName.AS, ((PdfObject) (pdfname)));
	//  305  689:aload           6
	//  306  691:getstatic       #112 <Field PdfName PdfName.AS>
	//  307  694:aload           13
	//  308  696:invokevirtual   #507 <Method void PdfDictionary.put(PdfName, PdfObject)>
					} else
	//* 309  699:goto            580
					{
						((PdfDictionary) (obj2)).put(PdfName.AS, ((PdfObject) (getOffStateName(((PdfDictionary) (obj2))))));
	//  310  702:aload           6
	//  311  704:getstatic       #112 <Field PdfName PdfName.AS>
	//  312  707:aload_0         
	//  313  708:aload           6
	//  314  710:invokevirtual   #580 <Method PdfName getOffStateName(PdfDictionary)>
	//  315  713:invokevirtual   #507 <Method void PdfDictionary.put(PdfName, PdfObject)>
					}
			}
			pdfindirectreference2 = addToBody(((PdfObject) (obj2))).getIndirectReference();
			adjustTabOrder(((PdfArray) (hashmap)), pdfindirectreference2, ((PdfNumber) (obj4)));
			pdfarray1.add(((PdfObject) (pdfindirectreference2)));
			propagate(((PdfObject) (obj2)), ((PdfIndirectReference) (null)), false);
			k += 2;
		}
	//* 316  716:goto            580
		pdfdictionary.put(PdfName.KIDS, ((PdfObject) (pdfarray1)));
	//  317  719:aload           10
	//  318  721:getstatic       #525 <Field PdfName PdfName.KIDS>
	//  319  724:aload           14
	//  320  726:invokevirtual   #507 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(true) goto _L5; else goto _L2
	//  321  729:goto            348
_L2:
		return pdfarray;
	//  322  732:aload           7
	//  323  734:areturn         
		if(true) goto _L7; else goto _L6
_L6:
	}

	public void close()
	{
		if(closing)
	//*   0    0:aload_0         
	//*   1    1:getfield        #224 <Field boolean closing>
	//*   2    4:ifeq            12
		{
			super.close();
	//    3    7:aload_0         
	//    4    8:invokespecial   #593 <Method void PdfWriter.close()>
			return;
	//    5   11:return          
		}
		closing = true;
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:putfield        #224 <Field boolean closing>
		try
		{
			closeIt();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #596 <Method void closeIt()>
			return;
	//   11   21:return          
		}
		catch(Exception exception)
	//*  12   22:astore_1        
		{
			throw new ExceptionConverter(exception);
	//   13   23:new             #598 <Class ExceptionConverter>
	//   14   26:dup             
	//   15   27:aload_1         
	//   16   28:invokespecial   #601 <Method void ExceptionConverter(Exception)>
	//   17   31:athrow          
		}
	}

	protected void closeIt()
		throws IOException
	{
		Iterator iterator;
		for(int i = 0; i < readers.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #203 <Field ArrayList readers>
	//*   5    7:invokevirtual   #291 <Method int ArrayList.size()>
	//*   6   10:icmpge          34
			((PdfReader)readers.get(i)).removeFields();
	//    7   13:aload_0         
	//    8   14:getfield        #203 <Field ArrayList readers>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #294 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #307 <Class PdfReader>
	//   12   24:invokevirtual   #604 <Method void PdfReader.removeFields()>

	//   13   27:iload_1         
	//   14   28:iconst_1        
	//   15   29:iadd            
	//   16   30:istore_1        
	//*  17   31:goto            2
		for(int j = 0; j < readers.size(); j++)
	//*  18   34:iconst_0        
	//*  19   35:istore_1        
	//*  20   36:iload_1         
	//*  21   37:aload_0         
	//*  22   38:getfield        #203 <Field ArrayList readers>
	//*  23   41:invokevirtual   #291 <Method int ArrayList.size()>
	//*  24   44:icmpge          113
		{
			PdfReader pdfreader = (PdfReader)readers.get(j);
	//   25   47:aload_0         
	//   26   48:getfield        #203 <Field ArrayList readers>
	//   27   51:iload_1         
	//   28   52:invokevirtual   #294 <Method Object ArrayList.get(int)>
	//   29   55:checkcast       #307 <Class PdfReader>
	//   30   58:astore_3        
			for(int i1 = 1; i1 <= pdfreader.getNumberOfPages(); i1++)
	//*  31   59:iconst_1        
	//*  32   60:istore_2        
	//*  33   61:iload_2         
	//*  34   62:aload_3         
	//*  35   63:invokevirtual   #400 <Method int PdfReader.getNumberOfPages()>
	//*  36   66:icmpgt          106
			{
				pageRefs.add(((Object) (getNewReference(pdfreader.getPageOrigRef(i1)))));
	//   37   69:aload_0         
	//   38   70:getfield        #215 <Field ArrayList pageRefs>
	//   39   73:aload_0         
	//   40   74:aload_3         
	//   41   75:iload_2         
	//   42   76:invokevirtual   #404 <Method PRIndirectReference PdfReader.getPageOrigRef(int)>
	//   43   79:invokevirtual   #608 <Method PdfIndirectReference getNewReference(PRIndirectReference)>
	//   44   82:invokevirtual   #287 <Method boolean ArrayList.add(Object)>
	//   45   85:pop             
				pageDics.add(((Object) (pdfreader.getPageN(i1))));
	//   46   86:aload_0         
	//   47   87:getfield        #217 <Field ArrayList pageDics>
	//   48   90:aload_3         
	//   49   91:iload_2         
	//   50   92:invokevirtual   #612 <Method PdfDictionary PdfReader.getPageN(int)>
	//   51   95:invokevirtual   #287 <Method boolean ArrayList.add(Object)>
	//   52   98:pop             
			}

	//   53   99:iload_2         
	//   54  100:iconst_1        
	//   55  101:iadd            
	//   56  102:istore_2        
		}

	//   57  103:goto            61
	//   58  106:iload_1         
	//   59  107:iconst_1        
	//   60  108:iadd            
	//   61  109:istore_1        
	//*  62  110:goto            36
		mergeFields();
	//   63  113:aload_0         
	//   64  114:invokevirtual   #615 <Method void mergeFields()>
		createAcroForms();
	//   65  117:aload_0         
	//   66  118:invokevirtual   #618 <Method void createAcroForms()>
		for(int k = 0; k < readers.size(); k++)
	//*  67  121:iconst_0        
	//*  68  122:istore_1        
	//*  69  123:iload_1         
	//*  70  124:aload_0         
	//*  71  125:getfield        #203 <Field ArrayList readers>
	//*  72  128:invokevirtual   #291 <Method int ArrayList.size()>
	//*  73  131:icmpge          218
		{
			PdfReader pdfreader1 = (PdfReader)readers.get(k);
	//   74  134:aload_0         
	//   75  135:getfield        #203 <Field ArrayList readers>
	//   76  138:iload_1         
	//   77  139:invokevirtual   #294 <Method Object ArrayList.get(int)>
	//   78  142:checkcast       #307 <Class PdfReader>
	//   79  145:astore_3        
			for(int j1 = 1; j1 <= pdfreader1.getNumberOfPages(); j1++)
	//*  80  146:iconst_1        
	//*  81  147:istore_2        
	//*  82  148:iload_2         
	//*  83  149:aload_3         
	//*  84  150:invokevirtual   #400 <Method int PdfReader.getNumberOfPages()>
	//*  85  153:icmpgt          211
			{
				PdfDictionary pdfdictionary = pdfreader1.getPageN(j1);
	//   86  156:aload_3         
	//   87  157:iload_2         
	//   88  158:invokevirtual   #612 <Method PdfDictionary PdfReader.getPageN(int)>
	//   89  161:astore          4
				PdfIndirectReference pdfindirectreference = getNewReference(pdfreader1.getPageOrigRef(j1));
	//   90  163:aload_0         
	//   91  164:aload_3         
	//   92  165:iload_2         
	//   93  166:invokevirtual   #404 <Method PRIndirectReference PdfReader.getPageOrigRef(int)>
	//   94  169:invokevirtual   #608 <Method PdfIndirectReference getNewReference(PRIndirectReference)>
	//   95  172:astore          5
				PdfIndirectReference pdfindirectreference1 = root.addPageRef(pdfindirectreference);
	//   96  174:aload_0         
	//   97  175:getfield        #622 <Field PdfPages root>
	//   98  178:aload           5
	//   99  180:invokevirtual   #628 <Method PdfIndirectReference PdfPages.addPageRef(PdfIndirectReference)>
	//  100  183:astore          6
				pdfdictionary.put(PdfName.PARENT, ((PdfObject) (pdfindirectreference1)));
	//  101  185:aload           4
	//  102  187:getstatic       #357 <Field PdfName PdfName.PARENT>
	//  103  190:aload           6
	//  104  192:invokevirtual   #507 <Method void PdfDictionary.put(PdfName, PdfObject)>
				propagate(((PdfObject) (pdfdictionary)), pdfindirectreference, false);
	//  105  195:aload_0         
	//  106  196:aload           4
	//  107  198:aload           5
	//  108  200:iconst_0        
	//  109  201:invokevirtual   #552 <Method void propagate(PdfObject, PdfIndirectReference, boolean)>
			}

	//  110  204:iload_2         
	//  111  205:iconst_1        
	//  112  206:iadd            
	//  113  207:istore_2        
		}

	//  114  208:goto            148
	//  115  211:iload_1         
	//  116  212:iconst_1        
	//  117  213:iadd            
	//  118  214:istore_1        
	//* 119  215:goto            123
		iterator = readers2intrefs.entrySet().iterator();
	//  120  218:aload_0         
	//  121  219:getfield        #205 <Field HashMap readers2intrefs>
	//  122  222:invokevirtual   #489 <Method Set HashMap.entrySet()>
	//  123  225:invokeinterface #492 <Method Iterator Set.iterator()>
	//  124  230:astore_3        
_L4:
		PdfReader pdfreader2;
		Object obj;
		if(!iterator.hasNext())
			break; /* Loop/switch isn't completed */
	//  125  231:aload_3         
	//  126  232:invokeinterface #467 <Method boolean Iterator.hasNext()>
	//  127  237:ifeq            369
		obj = ((Object) ((java.util.Map.Entry)iterator.next()));
	//  128  240:aload_3         
	//  129  241:invokeinterface #471 <Method Object Iterator.next()>
	//  130  246:checkcast       #494 <Class java.util.Map$Entry>
	//  131  249:astore          5
		pdfreader2 = (PdfReader)((java.util.Map.Entry) (obj)).getKey();
	//  132  251:aload           5
	//  133  253:invokeinterface #497 <Method Object java.util.Map$Entry.getKey()>
	//  134  258:checkcast       #307 <Class PdfReader>
	//  135  261:astore          4
		int ai[];
		file = pdfreader2.getSafeFile();
	//  136  263:aload_0         
	//  137  264:aload           4
	//  138  266:invokevirtual   #632 <Method RandomAccessFileOrArray PdfReader.getSafeFile()>
	//  139  269:putfield        #634 <Field RandomAccessFileOrArray file>
		file.reOpen();
	//  140  272:aload_0         
	//  141  273:getfield        #634 <Field RandomAccessFileOrArray file>
	//  142  276:invokevirtual   #639 <Method void RandomAccessFileOrArray.reOpen()>
		obj = ((Object) ((IntHashtable)((java.util.Map.Entry) (obj)).getValue()));
	//  143  279:aload           5
	//  144  281:invokeinterface #500 <Method Object java.util.Map$Entry.getValue()>
	//  145  286:checkcast       #396 <Class IntHashtable>
	//  146  289:astore          5
		ai = ((IntHashtable) (obj)).toOrderedKeys();
	//  147  291:aload           5
	//  148  293:invokevirtual   #643 <Method int[] IntHashtable.toOrderedKeys()>
	//  149  296:astore          6
		int l = 0;
	//  150  298:iconst_0        
	//  151  299:istore_1        
_L2:
		if(l >= ai.length)
			break; /* Loop/switch isn't completed */
	//  152  300:iload_1         
	//  153  301:aload           6
	//  154  303:arraylength     
	//  155  304:icmpge          344
		addToBody(PdfReader.getPdfObjectRelease(((PdfObject) (new PRIndirectReference(pdfreader2, ai[l])))), ((IntHashtable) (obj)).get(ai[l]));
	//  156  307:aload_0         
	//  157  308:new             #362 <Class PRIndirectReference>
	//  158  311:dup             
	//  159  312:aload           4
	//  160  314:aload           6
	//  161  316:iload_1         
	//  162  317:iaload          
	//  163  318:invokespecial   #646 <Method void PRIndirectReference(PdfReader, int)>
	//  164  321:invokestatic    #649 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//  165  324:aload           5
	//  166  326:aload           6
	//  167  328:iload_1         
	//  168  329:iaload          
	//  169  330:invokevirtual   #652 <Method int IntHashtable.get(int)>
	//  170  333:invokevirtual   #655 <Method PdfIndirectObject addToBody(PdfObject, int)>
	//  171  336:pop             
		l++;
	//  172  337:iload_1         
	//  173  338:iconst_1        
	//  174  339:iadd            
	//  175  340:istore_1        
		if(true) goto _L2; else goto _L1
	//  176  341:goto            300
_L1:
		try
		{
			file.close();
	//  177  344:aload_0         
	//  178  345:getfield        #634 <Field RandomAccessFileOrArray file>
	//  179  348:invokevirtual   #656 <Method void RandomAccessFileOrArray.close()>
		}
	//* 180  351:goto            231
		catch(Exception exception1) { }
	//  181  354:astore          4
		if(true) goto _L4; else goto _L3
	//  182  356:goto            231
		Exception exception;
		exception;
	//  183  359:astore_3        
		try
		{
			file.close();
	//  184  360:aload_0         
	//  185  361:getfield        #634 <Field RandomAccessFileOrArray file>
	//  186  364:invokevirtual   #656 <Method void RandomAccessFileOrArray.close()>
		}
	//* 187  367:aload_3         
	//* 188  368:athrow          
	//* 189  369:aload_0         
	//* 190  370:getfield        #247 <Field PdfDocument pdf>
	//* 191  373:invokevirtual   #657 <Method void PdfDocument.close()>
	//* 192  376:return          
		catch(Exception exception2) { }
	//  193  377:astore          4
		throw exception;
_L3:
		pdf.close();
		return;
	//* 194  379:goto            367
	}

	protected void createAcroForms()
		throws IOException
	{
		if(!fieldTree.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #213 <Field HashMap fieldTree>
	//*   2    4:invokevirtual   #660 <Method boolean HashMap.isEmpty()>
	//*   3    7:ifeq            11
	//*   4   10:return          
		{
			form = new PdfDictionary();
	//    5   11:aload_0         
	//    6   12:new             #219 <Class PdfDictionary>
	//    7   15:dup             
	//    8   16:invokespecial   #220 <Method void PdfDictionary()>
	//    9   19:putfield        #662 <Field PdfDictionary form>
			form.put(PdfName.DR, ((PdfObject) (resources)));
	//   10   22:aload_0         
	//   11   23:getfield        #662 <Field PdfDictionary form>
	//   12   26:getstatic       #665 <Field PdfName PdfName.DR>
	//   13   29:aload_0         
	//   14   30:getfield        #222 <Field PdfDictionary resources>
	//   15   33:invokevirtual   #507 <Method void PdfDictionary.put(PdfName, PdfObject)>
			propagate(((PdfObject) (resources)), ((PdfIndirectReference) (null)), false);
	//   16   36:aload_0         
	//   17   37:aload_0         
	//   18   38:getfield        #222 <Field PdfDictionary resources>
	//   19   41:aconst_null     
	//   20   42:iconst_0        
	//   21   43:invokevirtual   #552 <Method void propagate(PdfObject, PdfIndirectReference, boolean)>
			if(needAppearances)
	//*  22   46:aload_0         
	//*  23   47:getfield        #228 <Field boolean needAppearances>
	//*  24   50:ifeq            66
				form.put(PdfName.NEEDAPPEARANCES, ((PdfObject) (PdfBoolean.PDFTRUE)));
	//   25   53:aload_0         
	//   26   54:getfield        #662 <Field PdfDictionary form>
	//   27   57:getstatic       #668 <Field PdfName PdfName.NEEDAPPEARANCES>
	//   28   60:getstatic       #674 <Field PdfBoolean PdfBoolean.PDFTRUE>
	//   29   63:invokevirtual   #507 <Method void PdfDictionary.put(PdfName, PdfObject)>
			form.put(PdfName.DA, ((PdfObject) (new PdfString("/Helv 0 Tf 0 g "))));
	//   30   66:aload_0         
	//   31   67:getfield        #662 <Field PdfDictionary form>
	//   32   70:getstatic       #133 <Field PdfName PdfName.DA>
	//   33   73:new             #343 <Class PdfString>
	//   34   76:dup             
	//   35   77:ldc2            #676 <String "/Helv 0 Tf 0 g ">
	//   36   80:invokespecial   #677 <Method void PdfString(String)>
	//   37   83:invokevirtual   #507 <Method void PdfDictionary.put(PdfName, PdfObject)>
			tabOrder = new HashMap();
	//   38   86:aload_0         
	//   39   87:new             #72  <Class HashMap>
	//   40   90:dup             
	//   41   91:invokespecial   #74  <Method void HashMap()>
	//   42   94:putfield        #274 <Field HashMap tabOrder>
			calculationOrderRefs = new ArrayList(((Collection) (calculationOrder)));
	//   43   97:aload_0         
	//   44   98:new             #200 <Class ArrayList>
	//   45  101:dup             
	//   46  102:aload_0         
	//   47  103:getfield        #226 <Field ArrayList calculationOrder>
	//   48  106:invokespecial   #680 <Method void ArrayList(Collection)>
	//   49  109:putfield        #518 <Field ArrayList calculationOrderRefs>
			form.put(PdfName.FIELDS, ((PdfObject) (branchForm(fieldTree, ((PdfIndirectReference) (null)), ""))));
	//   50  112:aload_0         
	//   51  113:getfield        #662 <Field PdfDictionary form>
	//   52  116:getstatic       #683 <Field PdfName PdfName.FIELDS>
	//   53  119:aload_0         
	//   54  120:aload_0         
	//   55  121:getfield        #213 <Field HashMap fieldTree>
	//   56  124:aconst_null     
	//   57  125:ldc2            #305 <String "">
	//   58  128:invokevirtual   #527 <Method PdfArray branchForm(HashMap, PdfIndirectReference, String)>
	//   59  131:invokevirtual   #507 <Method void PdfDictionary.put(PdfName, PdfObject)>
			if(hasSignature)
	//*  60  134:aload_0         
	//*  61  135:getfield        #685 <Field boolean hasSignature>
	//*  62  138:ifeq            159
				form.put(PdfName.SIGFLAGS, ((PdfObject) (new PdfNumber(3))));
	//   63  141:aload_0         
	//   64  142:getfield        #662 <Field PdfDictionary form>
	//   65  145:getstatic       #688 <Field PdfName PdfName.SIGFLAGS>
	//   66  148:new             #268 <Class PdfNumber>
	//   67  151:dup             
	//   68  152:iconst_3        
	//   69  153:invokespecial   #690 <Method void PdfNumber(int)>
	//   70  156:invokevirtual   #507 <Method void PdfDictionary.put(PdfName, PdfObject)>
			PdfArray pdfarray = new PdfArray();
	//   71  159:new             #280 <Class PdfArray>
	//   72  162:dup             
	//   73  163:invokespecial   #485 <Method void PdfArray()>
	//   74  166:astore_2        
			for(int i = 0; i < calculationOrderRefs.size(); i++)
	//*  75  167:iconst_0        
	//*  76  168:istore_1        
	//*  77  169:iload_1         
	//*  78  170:aload_0         
	//*  79  171:getfield        #518 <Field ArrayList calculationOrderRefs>
	//*  80  174:invokevirtual   #291 <Method int ArrayList.size()>
	//*  81  177:icmpge          212
			{
				Object obj = calculationOrderRefs.get(i);
	//   82  180:aload_0         
	//   83  181:getfield        #518 <Field ArrayList calculationOrderRefs>
	//   84  184:iload_1         
	//   85  185:invokevirtual   #294 <Method Object ArrayList.get(int)>
	//   86  188:astore_3        
				if(obj instanceof PdfIndirectReference)
	//*  87  189:aload_3         
	//*  88  190:instanceof      #692 <Class PdfIndirectReference>
	//*  89  193:ifeq            205
					pdfarray.add(((PdfObject) ((PdfIndirectReference)obj)));
	//   90  196:aload_2         
	//   91  197:aload_3         
	//   92  198:checkcast       #692 <Class PdfIndirectReference>
	//   93  201:invokevirtual   #290 <Method boolean PdfArray.add(PdfObject)>
	//   94  204:pop             
			}

	//   95  205:iload_1         
	//   96  206:iconst_1        
	//   97  207:iadd            
	//   98  208:istore_1        
	//*  99  209:goto            169
			if(pdfarray.size() > 0)
	//* 100  212:aload_2         
	//* 101  213:invokevirtual   #283 <Method int PdfArray.size()>
	//* 102  216:ifle            10
			{
				form.put(PdfName.CO, ((PdfObject) (pdfarray)));
	//  103  219:aload_0         
	//  104  220:getfield        #662 <Field PdfDictionary form>
	//  105  223:getstatic       #695 <Field PdfName PdfName.CO>
	//  106  226:aload_2         
	//  107  227:invokevirtual   #507 <Method void PdfDictionary.put(PdfName, PdfObject)>
				return;
	//  108  230:return          
			}
		}
	}

	void createWidgets(ArrayList arraylist, AcroFields.Item item)
	{
		for(int i = 0; i < item.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_2         
	//*   4    4:invokevirtual   #474 <Method int AcroFields$Item.size()>
	//*   5    7:icmpge          167
		{
			arraylist.add(((Object) (item.getPage(i))));
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:iload_3         
	//    9   13:invokevirtual   #477 <Method Integer AcroFields$Item.getPage(int)>
	//   10   16:invokevirtual   #287 <Method boolean ArrayList.add(Object)>
	//   11   19:pop             
			PdfDictionary pdfdictionary = item.getMerged(i);
	//   12   20:aload_2         
	//   13   21:iload_3         
	//   14   22:invokevirtual   #700 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//   15   25:astore          4
			Object obj = ((Object) (pdfdictionary.get(PdfName.DR)));
	//   16   27:aload           4
	//   17   29:getstatic       #665 <Field PdfName PdfName.DR>
	//   18   32:invokevirtual   #360 <Method PdfObject PdfDictionary.get(PdfName)>
	//   19   35:astore          5
			if(obj != null)
	//*  20   37:aload           5
	//*  21   39:ifnull          57
				PdfFormField.mergeResources(resources, (PdfDictionary)PdfReader.getPdfObject(((PdfObject) (obj))));
	//   22   42:aload_0         
	//   23   43:getfield        #222 <Field PdfDictionary resources>
	//   24   46:aload           5
	//   25   48:invokestatic    #311 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//   26   51:checkcast       #219 <Class PdfDictionary>
	//   27   54:invokestatic    #706 <Method void PdfFormField.mergeResources(PdfDictionary, PdfDictionary)>
			obj = ((Object) (new PdfDictionary()));
	//   28   57:new             #219 <Class PdfDictionary>
	//   29   60:dup             
	//   30   61:invokespecial   #220 <Method void PdfDictionary()>
	//   31   64:astore          5
			Iterator iterator = pdfdictionary.getKeys().iterator();
	//   32   66:aload           4
	//   33   68:invokevirtual   #709 <Method Set PdfDictionary.getKeys()>
	//   34   71:invokeinterface #492 <Method Iterator Set.iterator()>
	//   35   76:astore          6
			do
			{
				if(!iterator.hasNext())
					break;
	//   36   78:aload           6
	//   37   80:invokeinterface #467 <Method boolean Iterator.hasNext()>
	//   38   85:ifeq            128
				PdfName pdfname = (PdfName)iterator.next();
	//   39   88:aload           6
	//   40   90:invokeinterface #471 <Method Object Iterator.next()>
	//   41   95:checkcast       #54  <Class PdfName>
	//   42   98:astore          7
				if(widgetKeys.containsKey(((Object) (pdfname))))
	//*  43  100:getstatic       #76  <Field HashMap widgetKeys>
	//*  44  103:aload           7
	//*  45  105:invokevirtual   #389 <Method boolean HashMap.containsKey(Object)>
	//*  46  108:ifeq            78
					((PdfDictionary) (obj)).put(pdfname, pdfdictionary.get(pdfname));
	//   47  111:aload           5
	//   48  113:aload           7
	//   49  115:aload           4
	//   50  117:aload           7
	//   51  119:invokevirtual   #360 <Method PdfObject PdfDictionary.get(PdfName)>
	//   52  122:invokevirtual   #507 <Method void PdfDictionary.put(PdfName, PdfObject)>
			} while(true);
	//   53  125:goto            78
			((PdfDictionary) (obj)).put(iTextTag, ((PdfObject) (new PdfNumber(item.getTabOrder(i).intValue() + 1))));
	//   54  128:aload           5
	//   55  130:getstatic       #62  <Field PdfName iTextTag>
	//   56  133:new             #268 <Class PdfNumber>
	//   57  136:dup             
	//   58  137:aload_2         
	//   59  138:iload_3         
	//   60  139:invokevirtual   #712 <Method Integer AcroFields$Item.getTabOrder(int)>
	//   61  142:invokevirtual   #295 <Method int Integer.intValue()>
	//   62  145:iconst_1        
	//   63  146:iadd            
	//   64  147:invokespecial   #690 <Method void PdfNumber(int)>
	//   65  150:invokevirtual   #507 <Method void PdfDictionary.put(PdfName, PdfObject)>
			arraylist.add(obj);
	//   66  153:aload_1         
	//   67  154:aload           5
	//   68  156:invokevirtual   #287 <Method boolean ArrayList.add(Object)>
	//   69  159:pop             
		}

	//   70  160:iload_3         
	//   71  161:iconst_1        
	//   72  162:iadd            
	//   73  163:istore_3        
	//*  74  164:goto            2
	//   75  167:return          
	}

	protected PdfDictionary getCatalog(PdfIndirectReference pdfindirectreference)
	{
		try
		{
			pdfindirectreference = ((PdfIndirectReference) (pdf.getCatalog(pdfindirectreference)));
	//    0    0:aload_0         
	//    1    1:getfield        #247 <Field PdfDocument pdf>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #718 <Method PdfDocument$PdfCatalog PdfDocument.getCatalog(PdfIndirectReference)>
	//    4    8:astore_1        
			if(form != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #662 <Field PdfDictionary form>
	//*   7   13:ifnull          36
			{
				PdfIndirectReference pdfindirectreference1 = addToBody(((PdfObject) (form))).getIndirectReference();
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #662 <Field PdfDictionary form>
	//   11   21:invokevirtual   #568 <Method PdfIndirectObject addToBody(PdfObject)>
	//   12   24:invokevirtual   #573 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//   13   27:astore_2        
				((PdfDictionary) (pdfindirectreference)).put(PdfName.ACROFORM, ((PdfObject) (pdfindirectreference1)));
	//   14   28:aload_1         
	//   15   29:getstatic       #721 <Field PdfName PdfName.ACROFORM>
	//   16   32:aload_2         
	//   17   33:invokevirtual   #507 <Method void PdfDictionary.put(PdfName, PdfObject)>
			}
		}
	//*  18   36:aload_1         
	//*  19   37:areturn         
		// Misplaced declaration of an exception variable
		catch(PdfIndirectReference pdfindirectreference)
	//*  20   38:astore_1        
		{
			throw new ExceptionConverter(((Exception) (pdfindirectreference)));
	//   21   39:new             #598 <Class ExceptionConverter>
	//   22   42:dup             
	//   23   43:aload_1         
	//   24   44:invokespecial   #601 <Method void ExceptionConverter(Exception)>
	//   25   47:athrow          
		}
		return ((PdfDictionary) (pdfindirectreference));
	}

	protected Counter getCounter()
	{
		return COUNTER;
	//    0    0:aload_0         
	//    1    1:getfield        #243 <Field Counter COUNTER>
	//    2    4:areturn         
	}

	protected int getNewObjectNumber(PdfReader pdfreader, int i, int j)
	{
		pdfreader = ((PdfReader) ((IntHashtable)readers2intrefs.get(((Object) (pdfreader)))));
	//    0    0:aload_0         
	//    1    1:getfield        #205 <Field HashMap readers2intrefs>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #278 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #396 <Class IntHashtable>
	//    5   11:astore_1        
		int k = ((IntHashtable) (pdfreader)).get(i);
	//    6   12:aload_1         
	//    7   13:iload_2         
	//    8   14:invokevirtual   #652 <Method int IntHashtable.get(int)>
	//    9   17:istore          4
		j = k;
	//   10   19:iload           4
	//   11   21:istore_3        
		if(k == 0)
	//*  12   22:iload           4
	//*  13   24:ifne            39
		{
			j = getIndirectReferenceNumber();
	//   14   27:aload_0         
	//   15   28:invokevirtual   #727 <Method int getIndirectReferenceNumber()>
	//   16   31:istore_3        
			((IntHashtable) (pdfreader)).put(i, j);
	//   17   32:aload_1         
	//   18   33:iload_2         
	//   19   34:iload_3         
	//   20   35:invokevirtual   #410 <Method int IntHashtable.put(int, int)>
	//   21   38:pop             
		}
		return j;
	//   22   39:iload_3         
	//   23   40:ireturn         
	}

	protected PdfIndirectReference getNewReference(PRIndirectReference prindirectreference)
	{
		return new PdfIndirectReference(0, getNewObjectNumber(prindirectreference.getReader(), prindirectreference.getNumber(), 0));
	//    0    0:new             #692 <Class PdfIndirectReference>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #731 <Method PdfReader PRIndirectReference.getReader()>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #407 <Method int PRIndirectReference.getNumber()>
	//    8   14:iconst_0        
	//    9   15:invokevirtual   #733 <Method int getNewObjectNumber(PdfReader, int, int)>
	//   10   18:invokespecial   #735 <Method void PdfIndirectReference(int, int)>
	//   11   21:areturn         
	}

	protected PdfName getOffStateName(PdfDictionary pdfdictionary)
	{
		return PdfName.Off;
	//    0    0:getstatic       #738 <Field PdfName PdfName.Off>
	//    1    3:areturn         
	}

	public PdfIndirectReference getPageReference(int i)
	{
		return (PdfIndirectReference)pageRefs.get(i - 1);
	//    0    0:aload_0         
	//    1    1:getfield        #215 <Field ArrayList pageRefs>
	//    2    4:iload_1         
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:invokevirtual   #294 <Method Object ArrayList.get(int)>
	//    6   10:checkcast       #692 <Class PdfIndirectReference>
	//    7   13:areturn         
	}

	RandomAccessFileOrArray getReaderFile(PdfReader pdfreader)
	{
		return file;
	//    0    0:aload_0         
	//    1    1:getfield        #634 <Field RandomAccessFileOrArray file>
	//    2    4:areturn         
	}

	protected boolean isPage(PRIndirectReference prindirectreference)
	{
		IntHashtable inthashtable = (IntHashtable)pages2intrefs.get(((Object) (prindirectreference.getReader())));
	//    0    0:aload_0         
	//    1    1:getfield        #207 <Field HashMap pages2intrefs>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #731 <Method PdfReader PRIndirectReference.getReader()>
	//    4    8:invokevirtual   #278 <Method Object HashMap.get(Object)>
	//    5   11:checkcast       #396 <Class IntHashtable>
	//    6   14:astore_2        
		if(inthashtable != null)
	//*   7   15:aload_2         
	//*   8   16:ifnull          28
			return inthashtable.containsKey(prindirectreference.getNumber());
	//    9   19:aload_2         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #407 <Method int PRIndirectReference.getNumber()>
	//   12   24:invokevirtual   #747 <Method boolean IntHashtable.containsKey(int)>
	//   13   27:ireturn         
		else
			return false;
	//   14   28:iconst_0        
	//   15   29:ireturn         
	}

	protected boolean isVisited(PRIndirectReference prindirectreference)
	{
		IntHashtable inthashtable = (IntHashtable)visited.get(((Object) (prindirectreference.getReader())));
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field HashMap visited>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #731 <Method PdfReader PRIndirectReference.getReader()>
	//    4    8:invokevirtual   #278 <Method Object HashMap.get(Object)>
	//    5   11:checkcast       #396 <Class IntHashtable>
	//    6   14:astore_2        
		if(inthashtable != null)
	//*   7   15:aload_2         
	//*   8   16:ifnull          28
			return inthashtable.containsKey(prindirectreference.getNumber());
	//    9   19:aload_2         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #407 <Method int PRIndirectReference.getNumber()>
	//   12   24:invokevirtual   #747 <Method boolean IntHashtable.containsKey(int)>
	//   13   27:ireturn         
		else
			return false;
	//   14   28:iconst_0        
	//   15   29:ireturn         
	}

	protected boolean isVisited(PdfReader pdfreader, int i, int j)
	{
		return ((IntHashtable)readers2intrefs.get(((Object) (pdfreader)))).containsKey(i);
	//    0    0:aload_0         
	//    1    1:getfield        #205 <Field HashMap readers2intrefs>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #278 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #396 <Class IntHashtable>
	//    5   11:iload_2         
	//    6   12:invokevirtual   #747 <Method boolean IntHashtable.containsKey(int)>
	//    7   15:ireturn         
	}

	void mergeField(String s, AcroFields.Item item)
	{
		Object obj2;
		HashMap hashmap = fieldTree;
	//    0    0:aload_0         
	//    1    1:getfield        #213 <Field HashMap fieldTree>
	//    2    4:astore          6
		obj2 = ((Object) (new StringTokenizer(s, ".")));
	//    3    6:new             #753 <Class StringTokenizer>
	//    4    9:dup             
	//    5   10:aload_1         
	//    6   11:ldc2            #318 <String ".">
	//    7   14:invokespecial   #754 <Method void StringTokenizer(String, String)>
	//    8   17:astore          8
		s = ((String) (hashmap));
	//    9   19:aload           6
	//   10   21:astore_1        
		if(((StringTokenizer) (obj2)).hasMoreTokens()) goto _L2; else goto _L1
	//   11   22:aload           8
	//   12   24:invokevirtual   #757 <Method boolean StringTokenizer.hasMoreTokens()>
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
	//   16   33:invokevirtual   #760 <Method String StringTokenizer.nextToken()>
	//   17   36:astore          7
			obj3 = ((HashMap) (s)).get(obj1);
	//   18   38:aload_1         
	//   19   39:aload           7
	//   20   41:invokevirtual   #278 <Method Object HashMap.get(Object)>
	//   21   44:astore          9
			if(!((StringTokenizer) (obj2)).hasMoreTokens())
				continue; /* Loop/switch isn't completed */
	//   22   46:aload           8
	//   23   48:invokevirtual   #757 <Method boolean StringTokenizer.hasMoreTokens()>
	//   24   51:ifeq            103
			if(obj3 != null)
				continue; /* Loop/switch isn't completed */
	//   25   54:aload           9
	//   26   56:ifnonnull       86
			HashMap hashmap1 = new HashMap();
	//   27   59:new             #72  <Class HashMap>
	//   28   62:dup             
	//   29   63:invokespecial   #74  <Method void HashMap()>
	//   30   66:astore          6
			((HashMap) (s)).put(obj1, ((Object) (hashmap1)));
	//   31   68:aload_1         
	//   32   69:aload           7
	//   33   71:aload           6
	//   34   73:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//   35   76:pop             
			s = ((String) ((HashMap)hashmap1));
	//   36   77:aload           6
	//   37   79:checkcast       #72  <Class HashMap>
	//   38   82:astore_1        
		} while(true);
	//   39   83:goto            31
		if(!(obj3 instanceof HashMap)) goto _L1; else goto _L3
	//   40   86:aload           9
	//   41   88:instanceof      #72  <Class HashMap>
	//   42   91:ifeq            30
_L3:
		s = ((String) ((HashMap)obj3));
	//   43   94:aload           9
	//   44   96:checkcast       #72  <Class HashMap>
	//   45   99:astore_1        
		  goto _L2
	//*  46  100:goto            31
		if(obj3 instanceof HashMap) goto _L1; else goto _L4
	//   47  103:aload           9
	//   48  105:instanceof      #72  <Class HashMap>
	//   49  108:ifne            30
_L4:
		Object obj;
		obj = ((Object) (item.getMerged(0)));
	//   50  111:aload_2         
	//   51  112:iconst_0        
	//   52  113:invokevirtual   #700 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//   53  116:astore          6
		if(obj3 == null)
	//*  54  118:aload           9
	//*  55  120:ifnonnull       250
		{
			obj2 = ((Object) (new PdfDictionary()));
	//   56  123:new             #219 <Class PdfDictionary>
	//   57  126:dup             
	//   58  127:invokespecial   #220 <Method void PdfDictionary()>
	//   59  130:astore          8
			if(PdfName.SIG.equals(((Object) (((PdfDictionary) (obj)).get(PdfName.FT)))))
	//*  60  132:getstatic       #763 <Field PdfName PdfName.SIG>
	//*  61  135:aload           6
	//*  62  137:getstatic       #145 <Field PdfName PdfName.FT>
	//*  63  140:invokevirtual   #360 <Method PdfObject PdfDictionary.get(PdfName)>
	//*  64  143:invokevirtual   #583 <Method boolean PdfName.equals(Object)>
	//*  65  146:ifeq            154
				hasSignature = true;
	//   66  149:aload_0         
	//   67  150:iconst_1        
	//   68  151:putfield        #685 <Field boolean hasSignature>
			obj3 = ((Object) (((PdfDictionary) (obj)).getKeys().iterator()));
	//   69  154:aload           6
	//   70  156:invokevirtual   #709 <Method Set PdfDictionary.getKeys()>
	//   71  159:invokeinterface #492 <Method Iterator Set.iterator()>
	//   72  164:astore          9
			do
			{
				if(!((Iterator) (obj3)).hasNext())
					break;
	//   73  166:aload           9
	//   74  168:invokeinterface #467 <Method boolean Iterator.hasNext()>
	//   75  173:ifeq            216
				PdfName pdfname = (PdfName)((Iterator) (obj3)).next();
	//   76  176:aload           9
	//   77  178:invokeinterface #471 <Method Object Iterator.next()>
	//   78  183:checkcast       #54  <Class PdfName>
	//   79  186:astore          10
				if(fieldKeys.containsKey(((Object) (pdfname))))
	//*  80  188:getstatic       #78  <Field HashMap fieldKeys>
	//*  81  191:aload           10
	//*  82  193:invokevirtual   #389 <Method boolean HashMap.containsKey(Object)>
	//*  83  196:ifeq            166
					((PdfDictionary) (obj2)).put(pdfname, ((PdfDictionary) (obj)).get(pdfname));
	//   84  199:aload           8
	//   85  201:aload           10
	//   86  203:aload           6
	//   87  205:aload           10
	//   88  207:invokevirtual   #360 <Method PdfObject PdfDictionary.get(PdfName)>
	//   89  210:invokevirtual   #507 <Method void PdfDictionary.put(PdfName, PdfObject)>
			} while(true);
	//   90  213:goto            166
			obj = ((Object) (new ArrayList()));
	//   91  216:new             #200 <Class ArrayList>
	//   92  219:dup             
	//   93  220:invokespecial   #201 <Method void ArrayList()>
	//   94  223:astore          6
			((ArrayList) (obj)).add(obj2);
	//   95  225:aload           6
	//   96  227:aload           8
	//   97  229:invokevirtual   #287 <Method boolean ArrayList.add(Object)>
	//   98  232:pop             
			createWidgets(((ArrayList) (obj)), item);
	//   99  233:aload_0         
	//  100  234:aload           6
	//  101  236:aload_2         
	//  102  237:invokevirtual   #765 <Method void createWidgets(ArrayList, AcroFields$Item)>
			((HashMap) (s)).put(obj1, obj);
	//  103  240:aload_1         
	//  104  241:aload           7
	//  105  243:aload           6
	//  106  245:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//  107  248:pop             
			return;
	//  108  249:return          
		}
		s = ((String) ((ArrayList)obj3));
	//  109  250:aload           9
	//  110  252:checkcast       #200 <Class ArrayList>
	//  111  255:astore_1        
		obj2 = ((Object) ((PdfDictionary)((ArrayList) (s)).get(0)));
	//  112  256:aload_1         
	//  113  257:iconst_0        
	//  114  258:invokevirtual   #294 <Method Object ArrayList.get(int)>
	//  115  261:checkcast       #219 <Class PdfDictionary>
	//  116  264:astore          8
		obj1 = ((Object) ((PdfName)((PdfDictionary) (obj2)).get(PdfName.FT)));
	//  117  266:aload           8
	//  118  268:getstatic       #145 <Field PdfName PdfName.FT>
	//  119  271:invokevirtual   #360 <Method PdfObject PdfDictionary.get(PdfName)>
	//  120  274:checkcast       #54  <Class PdfName>
	//  121  277:astore          7
		obj3 = ((Object) ((PdfName)((PdfDictionary) (obj)).get(PdfName.FT)));
	//  122  279:aload           6
	//  123  281:getstatic       #145 <Field PdfName PdfName.FT>
	//  124  284:invokevirtual   #360 <Method PdfObject PdfDictionary.get(PdfName)>
	//  125  287:checkcast       #54  <Class PdfName>
	//  126  290:astore          9
		if(obj1 == null || !((PdfName) (obj1)).equals(obj3)) goto _L1; else goto _L5
	//  127  292:aload           7
	//  128  294:ifnull          30
	//  129  297:aload           7
	//  130  299:aload           9
	//  131  301:invokevirtual   #583 <Method boolean PdfName.equals(Object)>
	//  132  304:ifeq            30
_L5:
		int i;
		int j;
		j = 0;
	//  133  307:iconst_0        
	//  134  308:istore          4
		obj2 = ((Object) (((PdfDictionary) (obj2)).get(PdfName.FF)));
	//  135  310:aload           8
	//  136  312:getstatic       #154 <Field PdfName PdfName.FF>
	//  137  315:invokevirtual   #360 <Method PdfObject PdfDictionary.get(PdfName)>
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
	//* 146  333:invokevirtual   #768 <Method boolean PdfObject.isNumber()>
	//* 147  336:ifeq            348
				i = ((PdfNumber)obj2).intValue();
	//  148  339:aload           8
	//  149  341:checkcast       #268 <Class PdfNumber>
	//  150  344:invokevirtual   #272 <Method int PdfNumber.intValue()>
	//  151  347:istore_3        
		}
		boolean flag = false;
	//  152  348:iconst_0        
	//  153  349:istore          5
		obj = ((Object) (((PdfDictionary) (obj)).get(PdfName.FF)));
	//  154  351:aload           6
	//  155  353:getstatic       #154 <Field PdfName PdfName.FF>
	//  156  356:invokevirtual   #360 <Method PdfObject PdfDictionary.get(PdfName)>
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
	//* 165  376:invokevirtual   #768 <Method boolean PdfObject.isNumber()>
	//* 166  379:ifeq            392
				j = ((PdfNumber)obj).intValue();
	//  167  382:aload           6
	//  168  384:checkcast       #268 <Class PdfNumber>
	//  169  387:invokevirtual   #272 <Method int PdfNumber.intValue()>
	//  170  390:istore          4
		}
		if(!((PdfName) (obj1)).equals(((Object) (PdfName.BTN)))) goto _L7; else goto _L6
	//  171  392:aload           7
	//  172  394:getstatic       #771 <Field PdfName PdfName.BTN>
	//  173  397:invokevirtual   #583 <Method boolean PdfName.equals(Object)>
	//  174  400:ifeq            440
_L6:
		if(((i ^ j) & 0x10000) != 0 || (0x10000 & i) == 0 && ((i ^ j) & 0x8000) != 0) goto _L1; else goto _L8
	//  175  403:iload_3         
	//  176  404:iload           4
	//  177  406:ixor            
	//  178  407:ldc2            #772 <Int 0x10000>
	//  179  410:iand            
	//  180  411:ifne            30
	//  181  414:ldc2            #772 <Int 0x10000>
	//  182  417:iload_3         
	//  183  418:iand            
	//  184  419:ifne            433
	//  185  422:iload_3         
	//  186  423:iload           4
	//  187  425:ixor            
	//  188  426:ldc2            #773 <Int 32768>
	//  189  429:iand            
	//  190  430:ifne            30
_L8:
		createWidgets(((ArrayList) (s)), item);
	//  191  433:aload_0         
	//  192  434:aload_1         
	//  193  435:aload_2         
	//  194  436:invokevirtual   #765 <Method void createWidgets(ArrayList, AcroFields$Item)>
		return;
	//  195  439:return          
_L7:
		if(((PdfName) (obj1)).equals(((Object) (PdfName.CH))) && ((i ^ j) & 0x20000) != 0)
	//* 196  440:aload           7
	//* 197  442:getstatic       #776 <Field PdfName PdfName.CH>
	//* 198  445:invokevirtual   #583 <Method boolean PdfName.equals(Object)>
	//* 199  448:ifeq            433
	//* 200  451:iload_3         
	//* 201  452:iload           4
	//* 202  454:ixor            
	//* 203  455:ldc2            #777 <Int 0x20000>
	//* 204  458:iand            
	//* 205  459:ifeq            433
			return;
	//  206  462:return          
		if(true) goto _L8; else goto _L9
_L9:
	}

	void mergeFields()
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		for(int i = 0; i < fields.size(); i++)
	//*   2    2:iconst_0        
	//*   3    3:istore_1        
	//*   4    4:iload_1         
	//*   5    5:aload_0         
	//*   6    6:getfield        #211 <Field ArrayList fields>
	//*   7    9:invokevirtual   #291 <Method int ArrayList.size()>
	//*   8   12:icmpge          65
		{
			Map map = ((AcroFields)fields.get(i)).getFields();
	//    9   15:aload_0         
	//   10   16:getfield        #211 <Field ArrayList fields>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #294 <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #433 <Class AcroFields>
	//   14   26:invokevirtual   #781 <Method Map AcroFields.getFields()>
	//   15   29:astore_3        
			addPageOffsetToField(map, j);
	//   16   30:aload_0         
	//   17   31:aload_3         
	//   18   32:iload_2         
	//   19   33:invokevirtual   #783 <Method void addPageOffsetToField(Map, int)>
			mergeWithMaster(map);
	//   20   36:aload_0         
	//   21   37:aload_3         
	//   22   38:invokevirtual   #787 <Method void mergeWithMaster(Map)>
			j += ((PdfReader)readers.get(i)).getNumberOfPages();
	//   23   41:iload_2         
	//   24   42:aload_0         
	//   25   43:getfield        #203 <Field ArrayList readers>
	//   26   46:iload_1         
	//   27   47:invokevirtual   #294 <Method Object ArrayList.get(int)>
	//   28   50:checkcast       #307 <Class PdfReader>
	//   29   53:invokevirtual   #400 <Method int PdfReader.getNumberOfPages()>
	//   30   56:iadd            
	//   31   57:istore_2        
		}

	//   32   58:iload_1         
	//   33   59:iconst_1        
	//   34   60:iadd            
	//   35   61:istore_1        
	//*  36   62:goto            4
	//   37   65:return          
	}

	void mergeWithMaster(Map map)
	{
		java.util.Map.Entry entry;
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext(); mergeField((String)entry.getKey(), (AcroFields.Item)entry.getValue()))
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #788 <Method Set Map.entrySet()>
	//*   2    6:invokeinterface #492 <Method Iterator Set.iterator()>
	//*   3   11:astore_1        
	//*   4   12:aload_1         
	//*   5   13:invokeinterface #467 <Method boolean Iterator.hasNext()>
	//*   6   18:ifeq            56
			entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//    7   21:aload_1         
	//    8   22:invokeinterface #471 <Method Object Iterator.next()>
	//    9   27:checkcast       #494 <Class java.util.Map$Entry>
	//   10   30:astore_2        

	//   11   31:aload_0         
	//   12   32:aload_2         
	//   13   33:invokeinterface #497 <Method Object java.util.Map$Entry.getKey()>
	//   14   38:checkcast       #320 <Class String>
	//   15   41:aload_2         
	//   16   42:invokeinterface #500 <Method Object java.util.Map$Entry.getValue()>
	//   17   47:checkcast       #473 <Class AcroFields$Item>
	//   18   50:invokevirtual   #790 <Method void mergeField(String, AcroFields$Item)>
	//*  19   53:goto            12
	//   20   56:return          
	}

	public void openDoc()
	{
		if(!nd.isOpen())
	//*   0    0:aload_0         
	//*   1    1:getfield        #260 <Field Document nd>
	//*   2    4:invokevirtual   #794 <Method boolean Document.isOpen()>
	//*   3    7:ifne            17
			nd.open();
	//    4   10:aload_0         
	//    5   11:getfield        #260 <Field Document nd>
	//    6   14:invokevirtual   #797 <Method void Document.open()>
	//    7   17:return          
	}

	void propagate(PdfObject pdfobject, PdfIndirectReference pdfindirectreference, boolean flag)
		throws IOException
	{
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
_L2:
		return;
	//    2    4:return          
		if(pdfobject == null || (pdfobject instanceof PdfIndirectReference)) goto _L2; else goto _L1
	//    3    5:aload_1         
	//    4    6:instanceof      #692 <Class PdfIndirectReference>
	//    5    9:ifne            4
_L1:
		switch(pdfobject.type())
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #316 <Method int PdfObject.type()>
		{
	//*   8   16:tableswitch     5 10: default 56
	//	               5 57
	//	               6 137
	//	               7 137
	//	               8 56
	//	               9 56
	//	               10 288
		case 8: // '\b'
		case 9: // '\t'
		default:
			return;
	//    9   56:return          

		case 5: // '\005'
			pdfobject = ((PdfObject) (((PdfArray)pdfobject).listIterator()));
	//   10   57:aload_1         
	//   11   58:checkcast       #280 <Class PdfArray>
	//   12   61:invokevirtual   #801 <Method java.util.ListIterator PdfArray.listIterator()>
	//   13   64:astore_1        
			while(((Iterator) (pdfobject)).hasNext()) 
	//*  14   65:aload_1         
	//*  15   66:invokeinterface #467 <Method boolean Iterator.hasNext()>
	//*  16   71:ifeq            4
			{
				pdfindirectreference = ((PdfIndirectReference) ((PdfObject)((Iterator) (pdfobject)).next()));
	//   17   74:aload_1         
	//   18   75:invokeinterface #471 <Method Object Iterator.next()>
	//   19   80:checkcast       #313 <Class PdfObject>
	//   20   83:astore_2        
				Object obj;
				PdfIndirectReference pdfindirectreference2;
				if(pdfindirectreference != null && ((PdfObject) (pdfindirectreference)).isIndirect())
	//*  21   84:aload_2         
	//*  22   85:ifnull          278
	//*  23   88:aload_2         
	//*  24   89:invokevirtual   #804 <Method boolean PdfObject.isIndirect()>
	//*  25   92:ifeq            278
				{
					pdfindirectreference = ((PdfIndirectReference) ((PRIndirectReference)pdfindirectreference));
	//   26   95:aload_2         
	//   27   96:checkcast       #362 <Class PRIndirectReference>
	//   28   99:astore_2        
					if(!isVisited(((PRIndirectReference) (pdfindirectreference))) && !isPage(((PRIndirectReference) (pdfindirectreference))))
	//*  29  100:aload_0         
	//*  30  101:aload_2         
	//*  31  102:invokevirtual   #806 <Method boolean isVisited(PRIndirectReference)>
	//*  32  105:ifne            65
	//*  33  108:aload_0         
	//*  34  109:aload_2         
	//*  35  110:invokevirtual   #808 <Method boolean isPage(PRIndirectReference)>
	//*  36  113:ifne            65
					{
						PdfIndirectReference pdfindirectreference1 = getNewReference(((PRIndirectReference) (pdfindirectreference)));
	//   37  116:aload_0         
	//   38  117:aload_2         
	//   39  118:invokevirtual   #608 <Method PdfIndirectReference getNewReference(PRIndirectReference)>
	//   40  121:astore          4
						propagate(PdfReader.getPdfObjectRelease(((PdfObject) (pdfindirectreference))), pdfindirectreference1, flag);
	//   41  123:aload_0         
	//   42  124:aload_2         
	//   43  125:invokestatic    #649 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   44  128:aload           4
	//   45  130:iload_3         
	//   46  131:invokevirtual   #552 <Method void propagate(PdfObject, PdfIndirectReference, boolean)>
					}
				} else
	//*  47  134:goto            65
	//*  48  137:aload_1         
	//*  49  138:checkcast       #219 <Class PdfDictionary>
	//*  50  141:astore_1        
	//*  51  142:aload_1         
	//*  52  143:invokevirtual   #709 <Method Set PdfDictionary.getKeys()>
	//*  53  146:invokeinterface #492 <Method Iterator Set.iterator()>
	//*  54  151:astore_2        
	//*  55  152:aload_2         
	//*  56  153:invokeinterface #467 <Method boolean Iterator.hasNext()>
	//*  57  158:ifeq            4
	//*  58  161:aload_2         
	//*  59  162:invokeinterface #471 <Method Object Iterator.next()>
	//*  60  167:checkcast       #54  <Class PdfName>
	//*  61  170:astore          4
	//*  62  172:iload_3         
	//*  63  173:ifeq            198
	//*  64  176:aload           4
	//*  65  178:getstatic       #357 <Field PdfName PdfName.PARENT>
	//*  66  181:invokevirtual   #583 <Method boolean PdfName.equals(Object)>
	//*  67  184:ifne            152
	//*  68  187:aload           4
	//*  69  189:getstatic       #525 <Field PdfName PdfName.KIDS>
	//*  70  192:invokevirtual   #583 <Method boolean PdfName.equals(Object)>
	//*  71  195:ifne            152
	//*  72  198:aload_1         
	//*  73  199:aload           4
	//*  74  201:invokevirtual   #360 <Method PdfObject PdfDictionary.get(PdfName)>
	//*  75  204:astore          4
	//*  76  206:aload           4
	//*  77  208:ifnull          267
	//*  78  211:aload           4
	//*  79  213:invokevirtual   #804 <Method boolean PdfObject.isIndirect()>
	//*  80  216:ifeq            267
	//*  81  219:aload           4
	//*  82  221:checkcast       #362 <Class PRIndirectReference>
	//*  83  224:astore          4
	//*  84  226:aload_0         
	//*  85  227:aload           4
	//*  86  229:invokevirtual   #811 <Method boolean setVisited(PRIndirectReference)>
	//*  87  232:ifne            152
	//*  88  235:aload_0         
	//*  89  236:aload           4
	//*  90  238:invokevirtual   #808 <Method boolean isPage(PRIndirectReference)>
	//*  91  241:ifne            152
	//*  92  244:aload_0         
	//*  93  245:aload           4
	//*  94  247:invokevirtual   #608 <Method PdfIndirectReference getNewReference(PRIndirectReference)>
	//*  95  250:astore          5
	//*  96  252:aload_0         
	//*  97  253:aload           4
	//*  98  255:invokestatic    #649 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//*  99  258:aload           5
	//* 100  260:iload_3         
	//* 101  261:invokevirtual   #552 <Method void propagate(PdfObject, PdfIndirectReference, boolean)>
	//* 102  264:goto            152
	//* 103  267:aload_0         
	//* 104  268:aload           4
	//* 105  270:aconst_null     
	//* 106  271:iload_3         
	//* 107  272:invokevirtual   #552 <Method void propagate(PdfObject, PdfIndirectReference, boolean)>
	//* 108  275:goto            152
				{
					propagate(((PdfObject) (pdfindirectreference)), ((PdfIndirectReference) (null)), flag);
	//  109  278:aload_0         
	//  110  279:aload_2         
	//  111  280:aconst_null     
	//  112  281:iload_3         
	//  113  282:invokevirtual   #552 <Method void propagate(PdfObject, PdfIndirectReference, boolean)>
				}
			}
			break;

		case 6: // '\006'
		case 7: // '\007'
			pdfobject = ((PdfObject) ((PdfDictionary)pdfobject));
			pdfindirectreference = ((PdfIndirectReference) (((PdfDictionary) (pdfobject)).getKeys().iterator()));
			while(((Iterator) (pdfindirectreference)).hasNext()) 
			{
				obj = ((Object) ((PdfName)((Iterator) (pdfindirectreference)).next()));
				if(!flag || !((PdfName) (obj)).equals(((Object) (PdfName.PARENT))) && !((PdfName) (obj)).equals(((Object) (PdfName.KIDS))))
				{
					obj = ((Object) (((PdfDictionary) (pdfobject)).get(((PdfName) (obj)))));
					if(obj != null && ((PdfObject) (obj)).isIndirect())
					{
						obj = ((Object) ((PRIndirectReference)obj));
						if(!setVisited(((PRIndirectReference) (obj))) && !isPage(((PRIndirectReference) (obj))))
						{
							pdfindirectreference2 = getNewReference(((PRIndirectReference) (obj)));
							propagate(PdfReader.getPdfObjectRelease(((PdfObject) (obj))), pdfindirectreference2, flag);
						}
					} else
					{
						propagate(((PdfObject) (obj)), ((PdfIndirectReference) (null)), flag);
					}
				}
			}
			break;

	//* 114  285:goto            65
		case 10: // '\n'
			throw new RuntimeException(MessageLocalization.getComposedMessage("reference.pointing.to.reference", new Object[0]));
	//  115  288:new             #813 <Class RuntimeException>
	//  116  291:dup             
	//  117  292:ldc2            #815 <String "reference.pointing.to.reference">
	//  118  295:iconst_0        
	//  119  296:anewarray       Object[]
	//  120  299:invokestatic    #382 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  121  302:invokespecial   #816 <Method void RuntimeException(String)>
	//  122  305:athrow          
		}
		if(true) goto _L2; else goto _L3
_L3:
	}

	protected boolean setVisited(PRIndirectReference prindirectreference)
	{
		IntHashtable inthashtable = (IntHashtable)visited.get(((Object) (prindirectreference.getReader())));
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field HashMap visited>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #731 <Method PdfReader PRIndirectReference.getReader()>
	//    4    8:invokevirtual   #278 <Method Object HashMap.get(Object)>
	//    5   11:checkcast       #396 <Class IntHashtable>
	//    6   14:astore_2        
		if(inthashtable != null)
	//*   7   15:aload_2         
	//*   8   16:ifnull          35
			return inthashtable.put(prindirectreference.getNumber(), 1) != 0;
	//    9   19:aload_2         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #407 <Method int PRIndirectReference.getNumber()>
	//   12   24:iconst_1        
	//   13   25:invokevirtual   #410 <Method int IntHashtable.put(int, int)>
	//   14   28:ifeq            33
	//   15   31:iconst_1        
	//   16   32:ireturn         
	//   17   33:iconst_0        
	//   18   34:ireturn         
		else
			return false;
	//   19   35:iconst_0        
	//   20   36:ireturn         
	}

	protected void updateCalculationOrder(PdfReader pdfreader)
	{
		Object obj = ((Object) (pdfreader.getCatalog().getAsDict(PdfName.ACROFORM)));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #819 <Method PdfDictionary PdfReader.getCatalog()>
	//    2    4:getstatic       #721 <Field PdfName PdfName.ACROFORM>
	//    3    7:invokevirtual   #823 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//    4   10:astore_3        
		if(obj != null)
	//*   5   11:aload_3         
	//*   6   12:ifnonnull       16
	//*   7   15:return          
	//*   8   16:aload_3         
	//*   9   17:getstatic       #695 <Field PdfName PdfName.CO>
	//*  10   20:invokevirtual   #542 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//*  11   23:astore_3        
			if((obj = ((Object) (((PdfDictionary) (obj)).getAsArray(PdfName.CO)))) != null && ((PdfArray) (obj)).size() != 0)
	//*  12   24:aload_3         
	//*  13   25:ifnull          15
	//*  14   28:aload_3         
	//*  15   29:invokevirtual   #283 <Method int PdfArray.size()>
	//*  16   32:ifeq            15
			{
				AcroFields acrofields = pdfreader.getAcroFields();
	//   17   35:aload_1         
	//   18   36:invokevirtual   #431 <Method AcroFields PdfReader.getAcroFields()>
	//   19   39:astore          4
				int i = 0;
	//   20   41:iconst_0        
	//   21   42:istore_2        
				while(i < ((PdfArray) (obj)).size()) 
	//*  22   43:iload_2         
	//*  23   44:aload_3         
	//*  24   45:invokevirtual   #283 <Method int PdfArray.size()>
	//*  25   48:icmpge          15
				{
					Object obj1 = ((Object) (((PdfArray) (obj)).getPdfObject(i)));
	//   26   51:aload_3         
	//   27   52:iload_2         
	//   28   53:invokevirtual   #826 <Method PdfObject PdfArray.getPdfObject(int)>
	//   29   56:astore          5
					if(obj1 != null && ((PdfObject) (obj1)).isIndirect())
	//*  30   58:aload           5
	//*  31   60:ifnull          71
	//*  32   63:aload           5
	//*  33   65:invokevirtual   #804 <Method boolean PdfObject.isIndirect()>
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
	//   42   81:checkcast       #362 <Class PRIndirectReference>
	//   43   84:invokestatic    #828 <Method String getCOName(PdfReader, PRIndirectReference)>
	//   44   87:astore          5
						if(acrofields.getFieldItem(((String) (obj1))) != null)
	//*  45   89:aload           4
	//*  46   91:aload           5
	//*  47   93:invokevirtual   #832 <Method AcroFields$Item AcroFields.getFieldItem(String)>
	//*  48   96:ifnull          71
						{
							obj1 = ((Object) ((new StringBuilder()).append(".").append(((String) (obj1))).toString()));
	//   49   99:new             #340 <Class StringBuilder>
	//   50  102:dup             
	//   51  103:invokespecial   #341 <Method void StringBuilder()>
	//   52  106:ldc2            #318 <String ".">
	//   53  109:invokevirtual   #351 <Method StringBuilder StringBuilder.append(String)>
	//   54  112:aload           5
	//   55  114:invokevirtual   #351 <Method StringBuilder StringBuilder.append(String)>
	//   56  117:invokevirtual   #354 <Method String StringBuilder.toString()>
	//   57  120:astore          5
							if(!calculationOrder.contains(obj1))
	//*  58  122:aload_0         
	//*  59  123:getfield        #226 <Field ArrayList calculationOrder>
	//*  60  126:aload           5
	//*  61  128:invokevirtual   #833 <Method boolean ArrayList.contains(Object)>
	//*  62  131:ifne            71
								calculationOrder.add(obj1);
	//   63  134:aload_0         
	//   64  135:getfield        #226 <Field ArrayList calculationOrder>
	//   65  138:aload           5
	//   66  140:invokevirtual   #287 <Method boolean ArrayList.add(Object)>
	//   67  143:pop             
						}
					}
					i++;
				}
			}
	//*  68  144:goto            71
	}

	protected static final HashMap fieldKeys;
	private static final PdfName iTextTag = new PdfName("_iTextTag_");
	protected static final HashMap widgetKeys;
	private static final Integer zero = Integer.valueOf(0);
	protected Counter COUNTER;
	private ArrayList calculationOrder;
	private ArrayList calculationOrderRefs;
	boolean closing;
	HashMap fieldTree;
	ArrayList fields;
	RandomAccessFileOrArray file;
	PdfDictionary form;
	private boolean hasSignature;
	private HashSet mergedRadioButtons;
	Document nd;
	private boolean needAppearances;
	ArrayList pageDics;
	ArrayList pageRefs;
	HashMap pages2intrefs;
	ArrayList readers;
	HashMap readers2intrefs;
	PdfDictionary resources;
	private HashMap tabOrder;
	HashMap visited;

	static 
	{
	//    0    0:new             #54  <Class PdfName>
	//    1    3:dup             
	//    2    4:ldc1            #56  <String "_iTextTag_">
	//    3    6:invokespecial   #60  <Method void PdfName(String)>
	//    4    9:putstatic       #62  <Field PdfName iTextTag>
	//    5   12:iconst_0        
	//    6   13:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//    7   16:putstatic       #70  <Field Integer zero>
		widgetKeys = new HashMap();
	//    8   19:new             #72  <Class HashMap>
	//    9   22:dup             
	//   10   23:invokespecial   #74  <Method void HashMap()>
	//   11   26:putstatic       #76  <Field HashMap widgetKeys>
		fieldKeys = new HashMap();
	//   12   29:new             #72  <Class HashMap>
	//   13   32:dup             
	//   14   33:invokespecial   #74  <Method void HashMap()>
	//   15   36:putstatic       #78  <Field HashMap fieldKeys>
		Integer integer = Integer.valueOf(1);
	//   16   39:iconst_1        
	//   17   40:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//   18   43:astore_0        
		widgetKeys.put(((Object) (PdfName.SUBTYPE)), ((Object) (integer)));
	//   19   44:getstatic       #76  <Field HashMap widgetKeys>
	//   20   47:getstatic       #81  <Field PdfName PdfName.SUBTYPE>
	//   21   50:aload_0         
	//   22   51:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//   23   54:pop             
		widgetKeys.put(((Object) (PdfName.CONTENTS)), ((Object) (integer)));
	//   24   55:getstatic       #76  <Field HashMap widgetKeys>
	//   25   58:getstatic       #88  <Field PdfName PdfName.CONTENTS>
	//   26   61:aload_0         
	//   27   62:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//   28   65:pop             
		widgetKeys.put(((Object) (PdfName.RECT)), ((Object) (integer)));
	//   29   66:getstatic       #76  <Field HashMap widgetKeys>
	//   30   69:getstatic       #91  <Field PdfName PdfName.RECT>
	//   31   72:aload_0         
	//   32   73:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//   33   76:pop             
		widgetKeys.put(((Object) (PdfName.NM)), ((Object) (integer)));
	//   34   77:getstatic       #76  <Field HashMap widgetKeys>
	//   35   80:getstatic       #94  <Field PdfName PdfName.NM>
	//   36   83:aload_0         
	//   37   84:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//   38   87:pop             
		widgetKeys.put(((Object) (PdfName.M)), ((Object) (integer)));
	//   39   88:getstatic       #76  <Field HashMap widgetKeys>
	//   40   91:getstatic       #97  <Field PdfName PdfName.M>
	//   41   94:aload_0         
	//   42   95:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//   43   98:pop             
		widgetKeys.put(((Object) (PdfName.F)), ((Object) (integer)));
	//   44   99:getstatic       #76  <Field HashMap widgetKeys>
	//   45  102:getstatic       #100 <Field PdfName PdfName.F>
	//   46  105:aload_0         
	//   47  106:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//   48  109:pop             
		widgetKeys.put(((Object) (PdfName.BS)), ((Object) (integer)));
	//   49  110:getstatic       #76  <Field HashMap widgetKeys>
	//   50  113:getstatic       #103 <Field PdfName PdfName.BS>
	//   51  116:aload_0         
	//   52  117:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//   53  120:pop             
		widgetKeys.put(((Object) (PdfName.BORDER)), ((Object) (integer)));
	//   54  121:getstatic       #76  <Field HashMap widgetKeys>
	//   55  124:getstatic       #106 <Field PdfName PdfName.BORDER>
	//   56  127:aload_0         
	//   57  128:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//   58  131:pop             
		widgetKeys.put(((Object) (PdfName.AP)), ((Object) (integer)));
	//   59  132:getstatic       #76  <Field HashMap widgetKeys>
	//   60  135:getstatic       #109 <Field PdfName PdfName.AP>
	//   61  138:aload_0         
	//   62  139:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//   63  142:pop             
		widgetKeys.put(((Object) (PdfName.AS)), ((Object) (integer)));
	//   64  143:getstatic       #76  <Field HashMap widgetKeys>
	//   65  146:getstatic       #112 <Field PdfName PdfName.AS>
	//   66  149:aload_0         
	//   67  150:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//   68  153:pop             
		widgetKeys.put(((Object) (PdfName.C)), ((Object) (integer)));
	//   69  154:getstatic       #76  <Field HashMap widgetKeys>
	//   70  157:getstatic       #115 <Field PdfName PdfName.C>
	//   71  160:aload_0         
	//   72  161:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//   73  164:pop             
		widgetKeys.put(((Object) (PdfName.A)), ((Object) (integer)));
	//   74  165:getstatic       #76  <Field HashMap widgetKeys>
	//   75  168:getstatic       #118 <Field PdfName PdfName.A>
	//   76  171:aload_0         
	//   77  172:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//   78  175:pop             
		widgetKeys.put(((Object) (PdfName.STRUCTPARENT)), ((Object) (integer)));
	//   79  176:getstatic       #76  <Field HashMap widgetKeys>
	//   80  179:getstatic       #121 <Field PdfName PdfName.STRUCTPARENT>
	//   81  182:aload_0         
	//   82  183:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//   83  186:pop             
		widgetKeys.put(((Object) (PdfName.OC)), ((Object) (integer)));
	//   84  187:getstatic       #76  <Field HashMap widgetKeys>
	//   85  190:getstatic       #124 <Field PdfName PdfName.OC>
	//   86  193:aload_0         
	//   87  194:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//   88  197:pop             
		widgetKeys.put(((Object) (PdfName.H)), ((Object) (integer)));
	//   89  198:getstatic       #76  <Field HashMap widgetKeys>
	//   90  201:getstatic       #127 <Field PdfName PdfName.H>
	//   91  204:aload_0         
	//   92  205:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//   93  208:pop             
		widgetKeys.put(((Object) (PdfName.MK)), ((Object) (integer)));
	//   94  209:getstatic       #76  <Field HashMap widgetKeys>
	//   95  212:getstatic       #130 <Field PdfName PdfName.MK>
	//   96  215:aload_0         
	//   97  216:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//   98  219:pop             
		widgetKeys.put(((Object) (PdfName.DA)), ((Object) (integer)));
	//   99  220:getstatic       #76  <Field HashMap widgetKeys>
	//  100  223:getstatic       #133 <Field PdfName PdfName.DA>
	//  101  226:aload_0         
	//  102  227:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//  103  230:pop             
		widgetKeys.put(((Object) (PdfName.Q)), ((Object) (integer)));
	//  104  231:getstatic       #76  <Field HashMap widgetKeys>
	//  105  234:getstatic       #136 <Field PdfName PdfName.Q>
	//  106  237:aload_0         
	//  107  238:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//  108  241:pop             
		widgetKeys.put(((Object) (PdfName.P)), ((Object) (integer)));
	//  109  242:getstatic       #76  <Field HashMap widgetKeys>
	//  110  245:getstatic       #139 <Field PdfName PdfName.P>
	//  111  248:aload_0         
	//  112  249:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//  113  252:pop             
		fieldKeys.put(((Object) (PdfName.AA)), ((Object) (integer)));
	//  114  253:getstatic       #78  <Field HashMap fieldKeys>
	//  115  256:getstatic       #142 <Field PdfName PdfName.AA>
	//  116  259:aload_0         
	//  117  260:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//  118  263:pop             
		fieldKeys.put(((Object) (PdfName.FT)), ((Object) (integer)));
	//  119  264:getstatic       #78  <Field HashMap fieldKeys>
	//  120  267:getstatic       #145 <Field PdfName PdfName.FT>
	//  121  270:aload_0         
	//  122  271:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//  123  274:pop             
		fieldKeys.put(((Object) (PdfName.TU)), ((Object) (integer)));
	//  124  275:getstatic       #78  <Field HashMap fieldKeys>
	//  125  278:getstatic       #148 <Field PdfName PdfName.TU>
	//  126  281:aload_0         
	//  127  282:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//  128  285:pop             
		fieldKeys.put(((Object) (PdfName.TM)), ((Object) (integer)));
	//  129  286:getstatic       #78  <Field HashMap fieldKeys>
	//  130  289:getstatic       #151 <Field PdfName PdfName.TM>
	//  131  292:aload_0         
	//  132  293:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//  133  296:pop             
		fieldKeys.put(((Object) (PdfName.FF)), ((Object) (integer)));
	//  134  297:getstatic       #78  <Field HashMap fieldKeys>
	//  135  300:getstatic       #154 <Field PdfName PdfName.FF>
	//  136  303:aload_0         
	//  137  304:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//  138  307:pop             
		fieldKeys.put(((Object) (PdfName.V)), ((Object) (integer)));
	//  139  308:getstatic       #78  <Field HashMap fieldKeys>
	//  140  311:getstatic       #157 <Field PdfName PdfName.V>
	//  141  314:aload_0         
	//  142  315:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//  143  318:pop             
		fieldKeys.put(((Object) (PdfName.DV)), ((Object) (integer)));
	//  144  319:getstatic       #78  <Field HashMap fieldKeys>
	//  145  322:getstatic       #160 <Field PdfName PdfName.DV>
	//  146  325:aload_0         
	//  147  326:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//  148  329:pop             
		fieldKeys.put(((Object) (PdfName.DS)), ((Object) (integer)));
	//  149  330:getstatic       #78  <Field HashMap fieldKeys>
	//  150  333:getstatic       #163 <Field PdfName PdfName.DS>
	//  151  336:aload_0         
	//  152  337:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//  153  340:pop             
		fieldKeys.put(((Object) (PdfName.RV)), ((Object) (integer)));
	//  154  341:getstatic       #78  <Field HashMap fieldKeys>
	//  155  344:getstatic       #166 <Field PdfName PdfName.RV>
	//  156  347:aload_0         
	//  157  348:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//  158  351:pop             
		fieldKeys.put(((Object) (PdfName.OPT)), ((Object) (integer)));
	//  159  352:getstatic       #78  <Field HashMap fieldKeys>
	//  160  355:getstatic       #169 <Field PdfName PdfName.OPT>
	//  161  358:aload_0         
	//  162  359:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//  163  362:pop             
		fieldKeys.put(((Object) (PdfName.MAXLEN)), ((Object) (integer)));
	//  164  363:getstatic       #78  <Field HashMap fieldKeys>
	//  165  366:getstatic       #172 <Field PdfName PdfName.MAXLEN>
	//  166  369:aload_0         
	//  167  370:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//  168  373:pop             
		fieldKeys.put(((Object) (PdfName.TI)), ((Object) (integer)));
	//  169  374:getstatic       #78  <Field HashMap fieldKeys>
	//  170  377:getstatic       #175 <Field PdfName PdfName.TI>
	//  171  380:aload_0         
	//  172  381:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//  173  384:pop             
		fieldKeys.put(((Object) (PdfName.I)), ((Object) (integer)));
	//  174  385:getstatic       #78  <Field HashMap fieldKeys>
	//  175  388:getstatic       #178 <Field PdfName PdfName.I>
	//  176  391:aload_0         
	//  177  392:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//  178  395:pop             
		fieldKeys.put(((Object) (PdfName.LOCK)), ((Object) (integer)));
	//  179  396:getstatic       #78  <Field HashMap fieldKeys>
	//  180  399:getstatic       #181 <Field PdfName PdfName.LOCK>
	//  181  402:aload_0         
	//  182  403:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//  183  406:pop             
		fieldKeys.put(((Object) (PdfName.SV)), ((Object) (integer)));
	//  184  407:getstatic       #78  <Field HashMap fieldKeys>
	//  185  410:getstatic       #184 <Field PdfName PdfName.SV>
	//  186  413:aload_0         
	//  187  414:invokevirtual   #85  <Method Object HashMap.put(Object, Object)>
	//  188  417:pop             
	//* 189  418:return          
	}
}
