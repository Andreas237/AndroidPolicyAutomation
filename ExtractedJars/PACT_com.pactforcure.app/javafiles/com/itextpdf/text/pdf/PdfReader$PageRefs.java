// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.exceptions.InvalidPdfException;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfReader, PdfObject, PRIndirectReference, IntHashtable, 
//			PdfName, PdfDictionary, PdfNumber, PdfArray, 
//			AcroFields

static class PdfReader$PageRefs
{

	private void iteratePages(PRIndirectReference prindirectreference)
		throws IOException
	{
		if(!pagesNodes.add(((Object) (PdfReader.getPdfObject(((PdfObject) (prindirectreference)))))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field Set pagesNodes>
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #126 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//*   4    8:invokeinterface #132 <Method boolean Set.add(Object)>
	//*   5   13:ifne            33
			throw new InvalidPdfException(MessageLocalization.getComposedMessage("illegal.pages.tree", new Object[0]));
	//    6   16:new             #134 <Class InvalidPdfException>
	//    7   19:dup             
	//    8   20:ldc1            #136 <String "illegal.pages.tree">
	//    9   22:iconst_0        
	//   10   23:anewarray       Object[]
	//   11   26:invokestatic    #142 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   12   29:invokespecial   #145 <Method void InvalidPdfException(String)>
	//   13   32:athrow          
		PdfDictionary pdfdictionary = (PdfDictionary)PdfReader.getPdfObject(((PdfObject) (prindirectreference)));
	//   14   33:aload_1         
	//   15   34:invokestatic    #126 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//   16   37:checkcast       #96  <Class PdfDictionary>
	//   17   40:astore_3        
		if(pdfdictionary == null)
	//*  18   41:aload_3         
	//*  19   42:ifnonnull       46
			return;
	//   20   45:return          
		Object obj = ((Object) (pdfdictionary.getAsArray(PdfName.KIDS)));
	//   21   46:aload_3         
	//   22   47:getstatic       #148 <Field PdfName PdfName.KIDS>
	//   23   50:invokevirtual   #152 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   24   53:astore          4
		if(obj == null)
	//*  25   55:aload           4
	//*  26   57:ifnonnull       217
		{
			pdfdictionary.put(PdfName.TYPE, ((PdfObject) (PdfName.PAGE)));
	//   27   60:aload_3         
	//   28   61:getstatic       #155 <Field PdfName PdfName.TYPE>
	//   29   64:getstatic       #158 <Field PdfName PdfName.PAGE>
	//   30   67:invokevirtual   #162 <Method void PdfDictionary.put(PdfName, PdfObject)>
			obj = ((Object) ((PdfDictionary)pageInh.get(pageInh.size() - 1)));
	//   31   70:aload_0         
	//   32   71:getfield        #164 <Field ArrayList pageInh>
	//   33   74:aload_0         
	//   34   75:getfield        #164 <Field ArrayList pageInh>
	//   35   78:invokevirtual   #51  <Method int ArrayList.size()>
	//   36   81:iconst_1        
	//   37   82:isub            
	//   38   83:invokevirtual   #55  <Method Object ArrayList.get(int)>
	//   39   86:checkcast       #96  <Class PdfDictionary>
	//   40   89:astore          4
			Iterator iterator = ((PdfDictionary) (obj)).getKeys().iterator();
	//   41   91:aload           4
	//   42   93:invokevirtual   #168 <Method Set PdfDictionary.getKeys()>
	//   43   96:invokeinterface #172 <Method Iterator Set.iterator()>
	//   44  101:astore          5
			do
			{
				if(!iterator.hasNext())
					break;
	//   45  103:aload           5
	//   46  105:invokeinterface #178 <Method boolean Iterator.hasNext()>
	//   47  110:ifeq            150
				PdfName pdfname = (PdfName)iterator.next();
	//   48  113:aload           5
	//   49  115:invokeinterface #181 <Method Object Iterator.next()>
	//   50  120:checkcast       #90  <Class PdfName>
	//   51  123:astore          6
				if(pdfdictionary.get(pdfname) == null)
	//*  52  125:aload_3         
	//*  53  126:aload           6
	//*  54  128:invokevirtual   #99  <Method PdfObject PdfDictionary.get(PdfName)>
	//*  55  131:ifnonnull       103
					pdfdictionary.put(pdfname, ((PdfDictionary) (obj)).get(pdfname));
	//   56  134:aload_3         
	//   57  135:aload           6
	//   58  137:aload           4
	//   59  139:aload           6
	//   60  141:invokevirtual   #99  <Method PdfObject PdfDictionary.get(PdfName)>
	//   61  144:invokevirtual   #162 <Method void PdfDictionary.put(PdfName, PdfObject)>
			} while(true);
	//   62  147:goto            103
			if(pdfdictionary.get(PdfName.MEDIABOX) == null)
	//*  63  150:aload_3         
	//*  64  151:getstatic       #184 <Field PdfName PdfName.MEDIABOX>
	//*  65  154:invokevirtual   #99  <Method PdfObject PdfDictionary.get(PdfName)>
	//*  66  157:ifnonnull       207
			{
				obj = ((Object) (new PdfArray(new float[] {
					0.0F, 0.0F, PageSize.LETTER.getRight(), PageSize.LETTER.getTop()
				})));
	//   67  160:new             #186 <Class PdfArray>
	//   68  163:dup             
	//   69  164:iconst_4        
	//   70  165:newarray        float[]
	//   71  167:dup             
	//   72  168:iconst_0        
	//   73  169:fconst_0        
	//   74  170:fastore         
	//   75  171:dup             
	//   76  172:iconst_1        
	//   77  173:fconst_0        
	//   78  174:fastore         
	//   79  175:dup             
	//   80  176:iconst_2        
	//   81  177:getstatic       #192 <Field Rectangle PageSize.LETTER>
	//   82  180:invokevirtual   #198 <Method float Rectangle.getRight()>
	//   83  183:fastore         
	//   84  184:dup             
	//   85  185:iconst_3        
	//   86  186:getstatic       #192 <Field Rectangle PageSize.LETTER>
	//   87  189:invokevirtual   #201 <Method float Rectangle.getTop()>
	//   88  192:fastore         
	//   89  193:invokespecial   #204 <Method void PdfArray(float[])>
	//   90  196:astore          4
				pdfdictionary.put(PdfName.MEDIABOX, ((PdfObject) (obj)));
	//   91  198:aload_3         
	//   92  199:getstatic       #184 <Field PdfName PdfName.MEDIABOX>
	//   93  202:aload           4
	//   94  204:invokevirtual   #162 <Method void PdfDictionary.put(PdfName, PdfObject)>
			}
			refsn.add(((Object) (prindirectreference)));
	//   95  207:aload_0         
	//   96  208:getfield        #42  <Field ArrayList refsn>
	//   97  211:aload_1         
	//   98  212:invokevirtual   #205 <Method boolean ArrayList.add(Object)>
	//   99  215:pop             
			return;
	//  100  216:return          
		}
		pdfdictionary.put(PdfName.TYPE, ((PdfObject) (PdfName.PAGES)));
	//  101  217:aload_3         
	//  102  218:getstatic       #155 <Field PdfName PdfName.TYPE>
	//  103  221:getstatic       #208 <Field PdfName PdfName.PAGES>
	//  104  224:invokevirtual   #162 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pushPageAttributes(pdfdictionary);
	//  105  227:aload_0         
	//  106  228:aload_3         
	//  107  229:invokespecial   #212 <Method void pushPageAttributes(PdfDictionary)>
		int i = 0;
	//  108  232:iconst_0        
	//  109  233:istore_2        
		do
		{
			if(i >= ((PdfArray) (obj)).size())
				break;
	//  110  234:iload_2         
	//  111  235:aload           4
	//  112  237:invokevirtual   #213 <Method int PdfArray.size()>
	//  113  240:icmpge          291
			prindirectreference = ((PRIndirectReference) (((PdfArray) (obj)).getPdfObject(i)));
	//  114  243:aload           4
	//  115  245:iload_2         
	//  116  246:invokevirtual   #216 <Method PdfObject PdfArray.getPdfObject(int)>
	//  117  249:astore_1        
			if(!((PdfObject) (prindirectreference)).isIndirect())
	//* 118  250:aload_1         
	//* 119  251:invokevirtual   #219 <Method boolean PdfObject.isIndirect()>
	//* 120  254:ifne            276
			{
				for(; i < ((PdfArray) (obj)).size(); ((PdfArray) (obj)).remove(i));
	//  121  257:iload_2         
	//  122  258:aload           4
	//  123  260:invokevirtual   #213 <Method int PdfArray.size()>
	//  124  263:icmpge          291
	//  125  266:aload           4
	//  126  268:iload_2         
	//  127  269:invokevirtual   #222 <Method PdfObject PdfArray.remove(int)>
	//  128  272:pop             
				break;
	//  129  273:goto            257
			}
			iteratePages((PRIndirectReference)prindirectreference);
	//  130  276:aload_0         
	//  131  277:aload_1         
	//  132  278:checkcast       #63  <Class PRIndirectReference>
	//  133  281:invokespecial   #224 <Method void iteratePages(PRIndirectReference)>
			i++;
	//  134  284:iload_2         
	//  135  285:iconst_1        
	//  136  286:iadd            
	//  137  287:istore_2        
		} while(true);
	//  138  288:goto            234
		popPageAttributes();
	//  139  291:aload_0         
	//  140  292:invokespecial   #227 <Method void popPageAttributes()>
	//  141  295:return          
	}

	private void popPageAttributes()
	{
		pageInh.remove(pageInh.size() - 1);
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field ArrayList pageInh>
	//    2    4:aload_0         
	//    3    5:getfield        #164 <Field ArrayList pageInh>
	//    4    8:invokevirtual   #51  <Method int ArrayList.size()>
	//    5   11:iconst_1        
	//    6   12:isub            
	//    7   13:invokevirtual   #229 <Method Object ArrayList.remove(int)>
	//    8   16:pop             
	//    9   17:return          
	}

	private void pushPageAttributes(PdfDictionary pdfdictionary)
	{
		PdfDictionary pdfdictionary1 = new PdfDictionary();
	//    0    0:new             #96  <Class PdfDictionary>
	//    1    3:dup             
	//    2    4:invokespecial   #230 <Method void PdfDictionary()>
	//    3    7:astore_3        
		if(!pageInh.isEmpty())
	//*   4    8:aload_0         
	//*   5    9:getfield        #164 <Field ArrayList pageInh>
	//*   6   12:invokevirtual   #233 <Method boolean ArrayList.isEmpty()>
	//*   7   15:ifne            41
			pdfdictionary1.putAll((PdfDictionary)pageInh.get(pageInh.size() - 1));
	//    8   18:aload_3         
	//    9   19:aload_0         
	//   10   20:getfield        #164 <Field ArrayList pageInh>
	//   11   23:aload_0         
	//   12   24:getfield        #164 <Field ArrayList pageInh>
	//   13   27:invokevirtual   #51  <Method int ArrayList.size()>
	//   14   30:iconst_1        
	//   15   31:isub            
	//   16   32:invokevirtual   #55  <Method Object ArrayList.get(int)>
	//   17   35:checkcast       #96  <Class PdfDictionary>
	//   18   38:invokevirtual   #236 <Method void PdfDictionary.putAll(PdfDictionary)>
		for(int i = 0; i < PdfReader.pageInhCandidates.length; i++)
	//*  19   41:iconst_0        
	//*  20   42:istore_2        
	//*  21   43:iload_2         
	//*  22   44:getstatic       #240 <Field PdfName[] PdfReader.pageInhCandidates>
	//*  23   47:arraylength     
	//*  24   48:icmpge          85
		{
			PdfObject pdfobject = pdfdictionary.get(PdfReader.pageInhCandidates[i]);
	//   25   51:aload_1         
	//   26   52:getstatic       #240 <Field PdfName[] PdfReader.pageInhCandidates>
	//   27   55:iload_2         
	//   28   56:aaload          
	//   29   57:invokevirtual   #99  <Method PdfObject PdfDictionary.get(PdfName)>
	//   30   60:astore          4
			if(pdfobject != null)
	//*  31   62:aload           4
	//*  32   64:ifnull          78
				pdfdictionary1.put(PdfReader.pageInhCandidates[i], pdfobject);
	//   33   67:aload_3         
	//   34   68:getstatic       #240 <Field PdfName[] PdfReader.pageInhCandidates>
	//   35   71:iload_2         
	//   36   72:aaload          
	//   37   73:aload           4
	//   38   75:invokevirtual   #162 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}

	//   39   78:iload_2         
	//   40   79:iconst_1        
	//   41   80:iadd            
	//   42   81:istore_2        
	//*  43   82:goto            43
		pageInh.add(((Object) (pdfdictionary1)));
	//   44   85:aload_0         
	//   45   86:getfield        #164 <Field ArrayList pageInh>
	//   46   89:aload_3         
	//   47   90:invokevirtual   #205 <Method boolean ArrayList.add(Object)>
	//   48   93:pop             
	//   49   94:return          
	}

	private void selectPages(List list)
	{
		IntHashtable inthashtable = new IntHashtable();
	//    0    0:new             #71  <Class IntHashtable>
	//    1    3:dup             
	//    2    4:invokespecial   #84  <Method void IntHashtable()>
	//    3    7:astore          6
		ArrayList arraylist = new ArrayList();
	//    4    9:new             #44  <Class ArrayList>
	//    5   12:dup             
	//    6   13:invokespecial   #241 <Method void ArrayList()>
	//    7   16:astore          7
		int j1 = size();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #242 <Method int size()>
	//   10   22:istore          4
		list = ((List) (list.iterator()));
	//   11   24:aload_1         
	//   12   25:invokeinterface #245 <Method Iterator List.iterator()>
	//   13   30:astore_1        
		do
		{
			if(!((Iterator) (list)).hasNext())
				break;
	//   14   31:aload_1         
	//   15   32:invokeinterface #178 <Method boolean Iterator.hasNext()>
	//   16   37:ifeq            89
			Integer integer = (Integer)((Iterator) (list)).next();
	//   17   40:aload_1         
	//   18   41:invokeinterface #181 <Method Object Iterator.next()>
	//   19   46:checkcast       #247 <Class Integer>
	//   20   49:astore          8
			int i = integer.intValue();
	//   21   51:aload           8
	//   22   53:invokevirtual   #248 <Method int Integer.intValue()>
	//   23   56:istore_2        
			if(i >= 1 && i <= j1 && inthashtable.put(i, 1) == 0)
	//*  24   57:iload_2         
	//*  25   58:iconst_1        
	//*  26   59:icmplt          31
	//*  27   62:iload_2         
	//*  28   63:iload           4
	//*  29   65:icmpgt          31
	//*  30   68:aload           6
	//*  31   70:iload_2         
	//*  32   71:iconst_1        
	//*  33   72:invokevirtual   #251 <Method int IntHashtable.put(int, int)>
	//*  34   75:ifne            31
				arraylist.add(((Object) (integer)));
	//   35   78:aload           7
	//   36   80:aload           8
	//   37   82:invokevirtual   #205 <Method boolean ArrayList.add(Object)>
	//   38   85:pop             
		} while(true);
	//   39   86:goto            31
		if(PdfReader.access$200(reader))
	//*  40   89:aload_0         
	//*  41   90:getfield        #38  <Field PdfReader reader>
	//*  42   93:invokestatic    #83  <Method boolean PdfReader.access$200(PdfReader)>
	//*  43   96:ifeq            124
		{
			for(int j = 1; j <= j1; j++)
	//*  44   99:iconst_1        
	//*  45  100:istore_2        
	//*  46  101:iload_2         
	//*  47  102:iload           4
	//*  48  104:icmpgt          124
			{
				getPageOrigRef(j);
	//   49  107:aload_0         
	//   50  108:iload_2         
	//   51  109:invokevirtual   #255 <Method PRIndirectReference getPageOrigRef(int)>
	//   52  112:pop             
				resetReleasePage();
	//   53  113:aload_0         
	//   54  114:invokevirtual   #258 <Method void resetReleasePage()>
			}

	//   55  117:iload_2         
	//   56  118:iconst_1        
	//   57  119:iadd            
	//   58  120:istore_2        
		}
	//*  59  121:goto            101
		Object obj = ((Object) ((PRIndirectReference)reader.catalog.get(PdfName.PAGES)));
	//   60  124:aload_0         
	//   61  125:getfield        #38  <Field PdfReader reader>
	//   62  128:getfield        #261 <Field PdfDictionary PdfReader.catalog>
	//   63  131:getstatic       #208 <Field PdfName PdfName.PAGES>
	//   64  134:invokevirtual   #99  <Method PdfObject PdfDictionary.get(PdfName)>
	//   65  137:checkcast       #63  <Class PRIndirectReference>
	//   66  140:astore          10
		list = ((List) ((PdfDictionary)PdfReader.getPdfObject(((PdfObject) (obj)))));
	//   67  142:aload           10
	//   68  144:invokestatic    #126 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//   69  147:checkcast       #96  <Class PdfDictionary>
	//   70  150:astore_1        
		ArrayList arraylist1 = new ArrayList(arraylist.size());
	//   71  151:new             #44  <Class ArrayList>
	//   72  154:dup             
	//   73  155:aload           7
	//   74  157:invokevirtual   #51  <Method int ArrayList.size()>
	//   75  160:invokespecial   #264 <Method void ArrayList(int)>
	//   76  163:astore          8
		PdfArray pdfarray = new PdfArray();
	//   77  165:new             #186 <Class PdfArray>
	//   78  168:dup             
	//   79  169:invokespecial   #265 <Method void PdfArray()>
	//   80  172:astore          9
		for(int k = 0; k < arraylist.size(); k++)
	//*  81  174:iconst_0        
	//*  82  175:istore_2        
	//*  83  176:iload_2         
	//*  84  177:aload           7
	//*  85  179:invokevirtual   #51  <Method int ArrayList.size()>
	//*  86  182:icmpge          245
		{
			int l = ((Integer)arraylist.get(k)).intValue();
	//   87  185:aload           7
	//   88  187:iload_2         
	//   89  188:invokevirtual   #55  <Method Object ArrayList.get(int)>
	//   90  191:checkcast       #247 <Class Integer>
	//   91  194:invokevirtual   #248 <Method int Integer.intValue()>
	//   92  197:istore_3        
			PRIndirectReference prindirectreference = getPageOrigRef(l);
	//   93  198:aload_0         
	//   94  199:iload_3         
	//   95  200:invokevirtual   #255 <Method PRIndirectReference getPageOrigRef(int)>
	//   96  203:astore          11
			resetReleasePage();
	//   97  205:aload_0         
	//   98  206:invokevirtual   #258 <Method void resetReleasePage()>
			pdfarray.add(((PdfObject) (prindirectreference)));
	//   99  209:aload           9
	//  100  211:aload           11
	//  101  213:invokevirtual   #268 <Method boolean PdfArray.add(PdfObject)>
	//  102  216:pop             
			arraylist1.add(((Object) (prindirectreference)));
	//  103  217:aload           8
	//  104  219:aload           11
	//  105  221:invokevirtual   #205 <Method boolean ArrayList.add(Object)>
	//  106  224:pop             
			getPageN(l).put(PdfName.PARENT, ((PdfObject) (obj)));
	//  107  225:aload_0         
	//  108  226:iload_3         
	//  109  227:invokevirtual   #272 <Method PdfDictionary getPageN(int)>
	//  110  230:getstatic       #275 <Field PdfName PdfName.PARENT>
	//  111  233:aload           10
	//  112  235:invokevirtual   #162 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}

	//  113  238:iload_2         
	//  114  239:iconst_1        
	//  115  240:iadd            
	//  116  241:istore_2        
	//* 117  242:goto            176
		obj = ((Object) (reader.getAcroFields()));
	//  118  245:aload_0         
	//  119  246:getfield        #38  <Field PdfReader reader>
	//  120  249:invokevirtual   #279 <Method AcroFields PdfReader.getAcroFields()>
	//  121  252:astore          10
		boolean flag;
		int i1;
		if(((AcroFields) (obj)).getFields().size() > 0)
	//* 122  254:aload           10
	//* 123  256:invokevirtual   #285 <Method Map AcroFields.getFields()>
	//* 124  259:invokeinterface #288 <Method int Map.size()>
	//* 125  264:ifle            368
			flag = true;
	//  126  267:iconst_1        
	//  127  268:istore_2        
		else
	//* 128  269:iconst_1        
	//* 129  270:istore_3        
	//* 130  271:iload_3         
	//* 131  272:iload           4
	//* 132  274:icmpgt          373
	//* 133  277:aload           6
	//* 134  279:iload_3         
	//* 135  280:invokevirtual   #292 <Method boolean IntHashtable.containsKey(int)>
	//* 136  283:ifne            361
	//* 137  286:iload_2         
	//* 138  287:ifeq            297
	//* 139  290:aload           10
	//* 140  292:iload_3         
	//* 141  293:invokevirtual   #295 <Method boolean AcroFields.removeFieldsFromPage(int)>
	//* 142  296:pop             
	//* 143  297:aload_0         
	//* 144  298:iload_3         
	//* 145  299:invokevirtual   #255 <Method PRIndirectReference getPageOrigRef(int)>
	//* 146  302:invokevirtual   #298 <Method int PRIndirectReference.getNumber()>
	//* 147  305:istore          5
	//* 148  307:aload_0         
	//* 149  308:getfield        #38  <Field PdfReader reader>
	//* 150  311:getfield        #301 <Field ArrayList PdfReader.xrefObj>
	//* 151  314:iload           5
	//* 152  316:aconst_null     
	//* 153  317:invokevirtual   #67  <Method Object ArrayList.set(int, Object)>
	//* 154  320:pop             
	//* 155  321:aload_0         
	//* 156  322:getfield        #38  <Field PdfReader reader>
	//* 157  325:invokestatic    #83  <Method boolean PdfReader.access$200(PdfReader)>
	//* 158  328:ifeq            361
	//* 159  331:aload_0         
	//* 160  332:getfield        #38  <Field PdfReader reader>
	//* 161  335:getfield        #305 <Field long[] PdfReader.xref>
	//* 162  338:iload           5
	//* 163  340:iconst_2        
	//* 164  341:imul            
	//* 165  342:ldc2w           #306 <Long -1L>
	//* 166  345:lastore         
	//* 167  346:aload_0         
	//* 168  347:getfield        #38  <Field PdfReader reader>
	//* 169  350:getfield        #305 <Field long[] PdfReader.xref>
	//* 170  353:iload           5
	//* 171  355:iconst_2        
	//* 172  356:imul            
	//* 173  357:iconst_1        
	//* 174  358:iadd            
	//* 175  359:lconst_0        
	//* 176  360:lastore         
	//* 177  361:iload_3         
	//* 178  362:iconst_1        
	//* 179  363:iadd            
	//* 180  364:istore_3        
	//* 181  365:goto            271
			flag = false;
	//  182  368:iconst_0        
	//  183  369:istore_2        
		for(i1 = 1; i1 <= j1; i1++)
		{
			if(inthashtable.containsKey(i1))
				continue;
			if(flag)
				((AcroFields) (obj)).removeFieldsFromPage(i1);
			int k1 = getPageOrigRef(i1).getNumber();
			reader.xrefObj.set(k1, ((Object) (null)));
			if(PdfReader.access$200(reader))
			{
				reader.xref[k1 * 2] = -1L;
				reader.xref[k1 * 2 + 1] = 0L;
			}
		}

	//* 184  370:goto            269
		((PdfDictionary) (list)).put(PdfName.COUNT, ((PdfObject) (new PdfNumber(arraylist.size()))));
	//  185  373:aload_1         
	//  186  374:getstatic       #94  <Field PdfName PdfName.COUNT>
	//  187  377:new             #105 <Class PdfNumber>
	//  188  380:dup             
	//  189  381:aload           7
	//  190  383:invokevirtual   #51  <Method int ArrayList.size()>
	//  191  386:invokespecial   #308 <Method void PdfNumber(int)>
	//  192  389:invokevirtual   #162 <Method void PdfDictionary.put(PdfName, PdfObject)>
		((PdfDictionary) (list)).put(PdfName.KIDS, ((PdfObject) (pdfarray)));
	//  193  392:aload_1         
	//  194  393:getstatic       #148 <Field PdfName PdfName.KIDS>
	//  195  396:aload           9
	//  196  398:invokevirtual   #162 <Method void PdfDictionary.put(PdfName, PdfObject)>
		refsp = null;
	//  197  401:aload_0         
	//  198  402:aconst_null     
	//  199  403:putfield        #69  <Field IntHashtable refsp>
		refsn = arraylist1;
	//  200  406:aload_0         
	//  201  407:aload           8
	//  202  409:putfield        #42  <Field ArrayList refsn>
	//  203  412:return          
	}

	public PdfDictionary getPageN(int i)
	{
		return (PdfDictionary)PdfReader.getPdfObject(((PdfObject) (getPageOrigRef(i))));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #255 <Method PRIndirectReference getPageOrigRef(int)>
	//    3    5:invokestatic    #126 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//    4    8:checkcast       #96  <Class PdfDictionary>
	//    5   11:areturn         
	}

	public PdfDictionary getPageNRelease(int i)
	{
		PdfDictionary pdfdictionary = getPageN(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #272 <Method PdfDictionary getPageN(int)>
	//    3    5:astore_2        
		releasePage(i);
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:invokevirtual   #314 <Method void releasePage(int)>
		return pdfdictionary;
	//    7   11:aload_2         
	//    8   12:areturn         
	}

	public PRIndirectReference getPageOrigRef(int i)
	{
		i--;
	//    0    0:iload_1         
	//    1    1:iconst_1        
	//    2    2:isub            
	//    3    3:istore_1        
		if(i < 0)
			break MISSING_BLOCK_LABEL_168;
	//    4    4:iload_1         
	//    5    5:iflt            168
		int j;
		Object obj;
		if(i >= size())
	//*   6    8:iload_1         
	//*   7    9:aload_0         
	//*   8   10:invokevirtual   #242 <Method int size()>
	//*   9   13:icmplt          19
			break MISSING_BLOCK_LABEL_168;
	//   10   16:goto            168
		try
		{
			if(refsn != null)
	//*  11   19:aload_0         
	//*  12   20:getfield        #42  <Field ArrayList refsn>
	//*  13   23:ifnull          38
				return (PRIndirectReference)refsn.get(i);
	//   14   26:aload_0         
	//   15   27:getfield        #42  <Field ArrayList refsn>
	//   16   30:iload_1         
	//   17   31:invokevirtual   #55  <Method Object ArrayList.get(int)>
	//   18   34:checkcast       #63  <Class PRIndirectReference>
	//   19   37:areturn         
			j = refsp.get(i);
	//   20   38:aload_0         
	//   21   39:getfield        #69  <Field IntHashtable refsp>
	//   22   42:iload_1         
	//   23   43:invokevirtual   #319 <Method int IntHashtable.get(int)>
	//   24   46:istore_2        
		}
	//*  25   47:iload_2         
	//*  26   48:ifne            128
	//*  27   51:aload_0         
	//*  28   52:iload_1         
	//*  29   53:invokevirtual   #322 <Method PRIndirectReference getSinglePage(int)>
	//*  30   56:astore_3        
	//*  31   57:aload_0         
	//*  32   58:getfield        #38  <Field PdfReader reader>
	//*  33   61:invokestatic    #326 <Method int PdfReader.access$300(PdfReader)>
	//*  34   64:iconst_m1       
	//*  35   65:icmpne          110
	//*  36   68:aload_0         
	//*  37   69:iconst_m1       
	//*  38   70:putfield        #31  <Field int lastPageRead>
	//*  39   73:aload_0         
	//*  40   74:getfield        #38  <Field PdfReader reader>
	//*  41   77:iconst_m1       
	//*  42   78:invokestatic    #330 <Method int PdfReader.access$302(PdfReader, int)>
	//*  43   81:pop             
	//*  44   82:aload_0         
	//*  45   83:getfield        #69  <Field IntHashtable refsp>
	//*  46   86:iload_1         
	//*  47   87:aload_3         
	//*  48   88:invokevirtual   #298 <Method int PRIndirectReference.getNumber()>
	//*  49   91:invokevirtual   #251 <Method int IntHashtable.put(int, int)>
	//*  50   94:pop             
	//*  51   95:aload_0         
	//*  52   96:getfield        #332 <Field boolean keepPages>
	//*  53   99:ifeq            170
	//*  54  102:aload_0         
	//*  55  103:iconst_m1       
	//*  56  104:putfield        #31  <Field int lastPageRead>
	//*  57  107:goto            170
	//*  58  110:aload_0         
	//*  59  111:iload_1         
	//*  60  112:putfield        #31  <Field int lastPageRead>
	//*  61  115:goto            73
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  62  118:astore_3        
		{
			throw new ExceptionConverter(((Exception) (obj)));
	//   63  119:new             #334 <Class ExceptionConverter>
	//   64  122:dup             
	//   65  123:aload_3         
	//   66  124:invokespecial   #337 <Method void ExceptionConverter(Exception)>
	//   67  127:athrow          
		}
		if(j != 0)
			break MISSING_BLOCK_LABEL_128;
		obj = ((Object) (getSinglePage(i)));
		if(PdfReader.access$300(reader) != -1)
			break MISSING_BLOCK_LABEL_110;
		lastPageRead = -1;
_L1:
		PdfReader.access$302(reader, -1);
		refsp.put(i, ((PRIndirectReference) (obj)).getNumber());
		if(keepPages)
			lastPageRead = -1;
		break MISSING_BLOCK_LABEL_170;
		lastPageRead = i;
		  goto _L1
		if(lastPageRead != i)
	//*  68  128:aload_0         
	//*  69  129:getfield        #31  <Field int lastPageRead>
	//*  70  132:iload_1         
	//*  71  133:icmpeq          141
			lastPageRead = -1;
	//   72  136:aload_0         
	//   73  137:iconst_m1       
	//   74  138:putfield        #31  <Field int lastPageRead>
		if(keepPages)
	//*  75  141:aload_0         
	//*  76  142:getfield        #332 <Field boolean keepPages>
	//*  77  145:ifeq            153
			lastPageRead = -1;
	//   78  148:aload_0         
	//   79  149:iconst_m1       
	//   80  150:putfield        #31  <Field int lastPageRead>
		obj = ((Object) (new PRIndirectReference(reader, j)));
	//   81  153:new             #63  <Class PRIndirectReference>
	//   82  156:dup             
	//   83  157:aload_0         
	//   84  158:getfield        #38  <Field PdfReader reader>
	//   85  161:iload_2         
	//   86  162:invokespecial   #340 <Method void PRIndirectReference(PdfReader, int)>
	//   87  165:astore_3        
		return ((PRIndirectReference) (obj));
	//   88  166:aload_3         
	//   89  167:areturn         
		return null;
	//   90  168:aconst_null     
	//   91  169:areturn         
		return ((PRIndirectReference) (obj));
	//   92  170:aload_3         
	//   93  171:areturn         
	}

	public PRIndirectReference getPageOrigRefRelease(int i)
	{
		PRIndirectReference prindirectreference = getPageOrigRef(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #255 <Method PRIndirectReference getPageOrigRef(int)>
	//    3    5:astore_2        
		releasePage(i);
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:invokevirtual   #314 <Method void releasePage(int)>
		return prindirectreference;
	//    7   11:aload_2         
	//    8   12:areturn         
	}

	protected PRIndirectReference getSinglePage(int i)
	{
		int l;
		PdfDictionary pdfdictionary;
		PdfDictionary pdfdictionary2;
		pdfdictionary2 = new PdfDictionary();
	//    0    0:new             #96  <Class PdfDictionary>
	//    1    3:dup             
	//    2    4:invokespecial   #230 <Method void PdfDictionary()>
	//    3    7:astore          7
		pdfdictionary = reader.rootPages;
	//    4    9:aload_0         
	//    5   10:getfield        #38  <Field PdfReader reader>
	//    6   13:getfield        #88  <Field PdfDictionary PdfReader.rootPages>
	//    7   16:astore          5
		l = 0;
	//    8   18:iconst_0        
	//    9   19:istore_3        
_L2:
		for(int j = 0; j < PdfReader.pageInhCandidates.length; j++)
	//*  10   20:iconst_0        
	//*  11   21:istore_2        
	//*  12   22:iload_2         
	//*  13   23:getstatic       #240 <Field PdfName[] PdfReader.pageInhCandidates>
	//*  14   26:arraylength     
	//*  15   27:icmpge          66
		{
			PdfObject pdfobject = pdfdictionary.get(PdfReader.pageInhCandidates[j]);
	//   16   30:aload           5
	//   17   32:getstatic       #240 <Field PdfName[] PdfReader.pageInhCandidates>
	//   18   35:iload_2         
	//   19   36:aaload          
	//   20   37:invokevirtual   #99  <Method PdfObject PdfDictionary.get(PdfName)>
	//   21   40:astore          6
			if(pdfobject != null)
	//*  22   42:aload           6
	//*  23   44:ifnull          59
				pdfdictionary2.put(PdfReader.pageInhCandidates[j], pdfobject);
	//   24   47:aload           7
	//   25   49:getstatic       #240 <Field PdfName[] PdfReader.pageInhCandidates>
	//   26   52:iload_2         
	//   27   53:aaload          
	//   28   54:aload           6
	//   29   56:invokevirtual   #162 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}

	//   30   59:iload_2         
	//   31   60:iconst_1        
	//   32   61:iadd            
	//   33   62:istore_2        
	//*  34   63:goto            22
		java.util.ListIterator listiterator = ((PdfArray)PdfReader.getPdfObjectRelease(pdfdictionary.get(PdfName.KIDS))).listIterator();
	//   35   66:aload           5
	//   36   68:getstatic       #148 <Field PdfName PdfName.KIDS>
	//   37   71:invokevirtual   #99  <Method PdfObject PdfDictionary.get(PdfName)>
	//   38   74:invokestatic    #103 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   39   77:checkcast       #186 <Class PdfArray>
	//   40   80:invokevirtual   #345 <Method java.util.ListIterator PdfArray.listIterator()>
	//   41   83:astore          8
		int k = l;
	//   42   85:iload_3         
	//   43   86:istore_2        
		do
		{
			l = k;
	//   44   87:iload_2         
	//   45   88:istore_3        
			if(((Iterator) (listiterator)).hasNext())
	//*  46   89:aload           8
	//*  47   91:invokeinterface #178 <Method boolean Iterator.hasNext()>
	//*  48   96:ifeq            20
			{
label0:
				{
					PRIndirectReference prindirectreference = (PRIndirectReference)((Iterator) (listiterator)).next();
	//   49   99:aload           8
	//   50  101:invokeinterface #181 <Method Object Iterator.next()>
	//   51  106:checkcast       #63  <Class PRIndirectReference>
	//   52  109:astore          9
					PdfDictionary pdfdictionary1 = (PdfDictionary)PdfReader.getPdfObject(((PdfObject) (prindirectreference)));
	//   53  111:aload           9
	//   54  113:invokestatic    #126 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//   55  116:checkcast       #96  <Class PdfDictionary>
	//   56  119:astore          6
					l = PdfReader.access$300(reader);
	//   57  121:aload_0         
	//   58  122:getfield        #38  <Field PdfReader reader>
	//   59  125:invokestatic    #326 <Method int PdfReader.access$300(PdfReader)>
	//   60  128:istore_3        
					PdfObject pdfobject1 = PdfReader.getPdfObjectRelease(pdfdictionary1.get(PdfName.COUNT));
	//   61  129:aload           6
	//   62  131:getstatic       #94  <Field PdfName PdfName.COUNT>
	//   63  134:invokevirtual   #99  <Method PdfObject PdfDictionary.get(PdfName)>
	//   64  137:invokestatic    #103 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   65  140:astore          10
					PdfReader.access$302(reader, l);
	//   66  142:aload_0         
	//   67  143:getfield        #38  <Field PdfReader reader>
	//   68  146:iload_3         
	//   69  147:invokestatic    #330 <Method int PdfReader.access$302(PdfReader, int)>
	//   70  150:pop             
					boolean flag = true;
	//   71  151:iconst_1        
	//   72  152:istore          4
					l = ((int) (flag));
	//   73  154:iload           4
	//   74  156:istore_3        
					if(pdfobject1 != null)
	//*  75  157:aload           10
	//*  76  159:ifnull          183
					{
						l = ((int) (flag));
	//   77  162:iload           4
	//   78  164:istore_3        
						if(pdfobject1.type() == 2)
	//*  79  165:aload           10
	//*  80  167:invokevirtual   #348 <Method int PdfObject.type()>
	//*  81  170:iconst_2        
	//*  82  171:icmpne          183
							l = ((PdfNumber)pdfobject1).intValue();
	//   83  174:aload           10
	//   84  176:checkcast       #105 <Class PdfNumber>
	//   85  179:invokevirtual   #108 <Method int PdfNumber.intValue()>
	//   86  182:istore_3        
					}
					if(i >= k + l)
						break label0;
	//   87  183:iload_1         
	//   88  184:iload_2         
	//   89  185:iload_3         
	//   90  186:iadd            
	//   91  187:icmpge          221
					if(pdfobject1 == null)
	//*  92  190:aload           10
	//*  93  192:ifnonnull       205
					{
						pdfdictionary1.mergeDifferent(pdfdictionary2);
	//   94  195:aload           6
	//   95  197:aload           7
	//   96  199:invokevirtual   #351 <Method void PdfDictionary.mergeDifferent(PdfDictionary)>
						return prindirectreference;
	//   97  202:aload           9
	//   98  204:areturn         
					}
					reader.releaseLastXrefPartial();
	//   99  205:aload_0         
	//  100  206:getfield        #38  <Field PdfReader reader>
	//  101  209:invokevirtual   #354 <Method void PdfReader.releaseLastXrefPartial()>
					pdfdictionary = pdfdictionary1;
	//  102  212:aload           6
	//  103  214:astore          5
					l = k;
	//  104  216:iload_2         
	//  105  217:istore_3        
				}
			}
			if(true)
				continue;
	//  106  218:goto            20
			reader.releaseLastXrefPartial();
	//  107  221:aload_0         
	//  108  222:getfield        #38  <Field PdfReader reader>
	//  109  225:invokevirtual   #354 <Method void PdfReader.releaseLastXrefPartial()>
			k += l;
	//  110  228:iload_2         
	//  111  229:iload_3         
	//  112  230:iadd            
	//  113  231:istore_2        
		} while(true);
	//  114  232:goto            87
		if(true) goto _L2; else goto _L1
_L1:
	}

	void insertPage(int i, PRIndirectReference prindirectreference)
	{
		int k = i - 1;
	//    0    0:iload_1         
	//    1    1:iconst_1        
	//    2    2:isub            
	//    3    3:istore          4
		if(refsn != null)
	//*   4    5:aload_0         
	//*   5    6:getfield        #42  <Field ArrayList refsn>
	//*   6    9:ifnull          45
			if(k >= refsn.size())
	//*   7   12:iload           4
	//*   8   14:aload_0         
	//*   9   15:getfield        #42  <Field ArrayList refsn>
	//*  10   18:invokevirtual   #51  <Method int ArrayList.size()>
	//*  11   21:icmplt          34
			{
				refsn.add(((Object) (prindirectreference)));
	//   12   24:aload_0         
	//   13   25:getfield        #42  <Field ArrayList refsn>
	//   14   28:aload_2         
	//   15   29:invokevirtual   #205 <Method boolean ArrayList.add(Object)>
	//   16   32:pop             
				return;
	//   17   33:return          
			} else
			{
				refsn.add(k, ((Object) (prindirectreference)));
	//   18   34:aload_0         
	//   19   35:getfield        #42  <Field ArrayList refsn>
	//   20   38:iload           4
	//   21   40:aload_2         
	//   22   41:invokevirtual   #359 <Method void ArrayList.add(int, Object)>
				return;
	//   23   44:return          
			}
		sizep = sizep + 1;
	//   24   45:aload_0         
	//   25   46:aload_0         
	//   26   47:getfield        #40  <Field int sizep>
	//   27   50:iconst_1        
	//   28   51:iadd            
	//   29   52:putfield        #40  <Field int sizep>
		lastPageRead = -1;
	//   30   55:aload_0         
	//   31   56:iconst_m1       
	//   32   57:putfield        #31  <Field int lastPageRead>
		if(k >= size())
	//*  33   60:iload           4
	//*  34   62:aload_0         
	//*  35   63:invokevirtual   #242 <Method int size()>
	//*  36   66:icmplt          86
		{
			refsp.put(size(), prindirectreference.getNumber());
	//   37   69:aload_0         
	//   38   70:getfield        #69  <Field IntHashtable refsp>
	//   39   73:aload_0         
	//   40   74:invokevirtual   #242 <Method int size()>
	//   41   77:aload_2         
	//   42   78:invokevirtual   #298 <Method int PRIndirectReference.getNumber()>
	//   43   81:invokevirtual   #251 <Method int IntHashtable.put(int, int)>
	//   44   84:pop             
			return;
	//   45   85:return          
		}
		IntHashtable inthashtable = new IntHashtable((refsp.size() + 1) * 2);
	//   46   86:new             #71  <Class IntHashtable>
	//   47   89:dup             
	//   48   90:aload_0         
	//   49   91:getfield        #69  <Field IntHashtable refsp>
	//   50   94:invokevirtual   #360 <Method int IntHashtable.size()>
	//   51   97:iconst_1        
	//   52   98:iadd            
	//   53   99:iconst_2        
	//   54  100:imul            
	//   55  101:invokespecial   #361 <Method void IntHashtable(int)>
	//   56  104:astore          5
		IntHashtable$Entry inthashtable$entry;
		for(Iterator iterator = refsp.getEntryIterator(); iterator.hasNext(); inthashtable.put(i, inthashtable$entry.getValue()))
	//*  57  106:aload_0         
	//*  58  107:getfield        #69  <Field IntHashtable refsp>
	//*  59  110:invokevirtual   #364 <Method Iterator IntHashtable.getEntryIterator()>
	//*  60  113:astore          6
	//*  61  115:aload           6
	//*  62  117:invokeinterface #178 <Method boolean Iterator.hasNext()>
	//*  63  122:ifeq            170
		{
			inthashtable$entry = (IntHashtable$Entry)iterator.next();
	//   64  125:aload           6
	//   65  127:invokeinterface #181 <Method Object Iterator.next()>
	//   66  132:checkcast       #366 <Class IntHashtable$Entry>
	//   67  135:astore          7
			int j = inthashtable$entry.getKey();
	//   68  137:aload           7
	//   69  139:invokevirtual   #369 <Method int IntHashtable$Entry.getKey()>
	//   70  142:istore_3        
			i = j;
	//   71  143:iload_3         
	//   72  144:istore_1        
			if(j >= k)
	//*  73  145:iload_3         
	//*  74  146:iload           4
	//*  75  148:icmplt          155
				i = j + 1;
	//   76  151:iload_3         
	//   77  152:iconst_1        
	//   78  153:iadd            
	//   79  154:istore_1        
		}

	//   80  155:aload           5
	//   81  157:iload_1         
	//   82  158:aload           7
	//   83  160:invokevirtual   #372 <Method int IntHashtable$Entry.getValue()>
	//   84  163:invokevirtual   #251 <Method int IntHashtable.put(int, int)>
	//   85  166:pop             
	//*  86  167:goto            115
		inthashtable.put(k, prindirectreference.getNumber());
	//   87  170:aload           5
	//   88  172:iload           4
	//   89  174:aload_2         
	//   90  175:invokevirtual   #298 <Method int PRIndirectReference.getNumber()>
	//   91  178:invokevirtual   #251 <Method int IntHashtable.put(int, int)>
	//   92  181:pop             
		refsp = inthashtable;
	//   93  182:aload_0         
	//   94  183:aload           5
	//   95  185:putfield        #69  <Field IntHashtable refsp>
	//   96  188:return          
	}

	void keepPages()
	{
		if(refsp == null || keepPages)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field IntHashtable refsp>
	//*   2    4:ifnull          14
	//*   3    7:aload_0         
	//*   4    8:getfield        #332 <Field boolean keepPages>
	//*   5   11:ifeq            15
		{
			return;
	//    6   14:return          
		} else
		{
			keepPages = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #332 <Field boolean keepPages>
			refsp.clear();
	//   10   20:aload_0         
	//   11   21:getfield        #69  <Field IntHashtable refsp>
	//   12   24:invokevirtual   #375 <Method void IntHashtable.clear()>
			return;
	//   13   27:return          
		}
	}

	void reReadPages()
		throws IOException
	{
		refsn = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #42  <Field ArrayList refsn>
		readPages();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #111 <Method void readPages()>
	//    5    9:return          
	}

	void readPages()
		throws IOException
	{
		if(refsn != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field ArrayList refsn>
	//*   2    4:ifnull          8
		{
			return;
	//    3    7:return          
		} else
		{
			refsp = null;
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:putfield        #69  <Field IntHashtable refsp>
			refsn = new ArrayList();
	//    7   13:aload_0         
	//    8   14:new             #44  <Class ArrayList>
	//    9   17:dup             
	//   10   18:invokespecial   #241 <Method void ArrayList()>
	//   11   21:putfield        #42  <Field ArrayList refsn>
			pageInh = new ArrayList();
	//   12   24:aload_0         
	//   13   25:new             #44  <Class ArrayList>
	//   14   28:dup             
	//   15   29:invokespecial   #241 <Method void ArrayList()>
	//   16   32:putfield        #164 <Field ArrayList pageInh>
			iteratePages((PRIndirectReference)reader.catalog.get(PdfName.PAGES));
	//   17   35:aload_0         
	//   18   36:aload_0         
	//   19   37:getfield        #38  <Field PdfReader reader>
	//   20   40:getfield        #261 <Field PdfDictionary PdfReader.catalog>
	//   21   43:getstatic       #208 <Field PdfName PdfName.PAGES>
	//   22   46:invokevirtual   #99  <Method PdfObject PdfDictionary.get(PdfName)>
	//   23   49:checkcast       #63  <Class PRIndirectReference>
	//   24   52:invokespecial   #224 <Method void iteratePages(PRIndirectReference)>
			pageInh = null;
	//   25   55:aload_0         
	//   26   56:aconst_null     
	//   27   57:putfield        #164 <Field ArrayList pageInh>
			reader.rootPages.put(PdfName.COUNT, ((PdfObject) (new PdfNumber(refsn.size()))));
	//   28   60:aload_0         
	//   29   61:getfield        #38  <Field PdfReader reader>
	//   30   64:getfield        #88  <Field PdfDictionary PdfReader.rootPages>
	//   31   67:getstatic       #94  <Field PdfName PdfName.COUNT>
	//   32   70:new             #105 <Class PdfNumber>
	//   33   73:dup             
	//   34   74:aload_0         
	//   35   75:getfield        #42  <Field ArrayList refsn>
	//   36   78:invokevirtual   #51  <Method int ArrayList.size()>
	//   37   81:invokespecial   #308 <Method void PdfNumber(int)>
	//   38   84:invokevirtual   #162 <Method void PdfDictionary.put(PdfName, PdfObject)>
			return;
	//   39   87:return          
		}
	}

	public void releasePage(int i)
	{
		if(refsp != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field IntHashtable refsp>
	//*   2    4:ifnonnull       8
	//*   3    7:return          
	//*   4    8:iload_1         
	//*   5    9:iconst_1        
	//*   6   10:isub            
	//*   7   11:istore_1        
			if(i-- >= 0 && i < size() && i == lastPageRead)
	//*   8   12:iload_1         
	//*   9   13:iflt            7
	//*  10   16:iload_1         
	//*  11   17:aload_0         
	//*  12   18:invokevirtual   #242 <Method int size()>
	//*  13   21:icmpge          7
	//*  14   24:iload_1         
	//*  15   25:aload_0         
	//*  16   26:getfield        #31  <Field int lastPageRead>
	//*  17   29:icmpne          7
			{
				lastPageRead = -1;
	//   18   32:aload_0         
	//   19   33:iconst_m1       
	//   20   34:putfield        #31  <Field int lastPageRead>
				PdfReader.access$302(reader, refsp.get(i));
	//   21   37:aload_0         
	//   22   38:getfield        #38  <Field PdfReader reader>
	//   23   41:aload_0         
	//   24   42:getfield        #69  <Field IntHashtable refsp>
	//   25   45:iload_1         
	//   26   46:invokevirtual   #319 <Method int IntHashtable.get(int)>
	//   27   49:invokestatic    #330 <Method int PdfReader.access$302(PdfReader, int)>
	//   28   52:pop             
				reader.releaseLastXrefPartial();
	//   29   53:aload_0         
	//   30   54:getfield        #38  <Field PdfReader reader>
	//   31   57:invokevirtual   #354 <Method void PdfReader.releaseLastXrefPartial()>
				refsp.remove(i);
	//   32   60:aload_0         
	//   33   61:getfield        #69  <Field IntHashtable refsp>
	//   34   64:iload_1         
	//   35   65:invokevirtual   #378 <Method int IntHashtable.remove(int)>
	//   36   68:pop             
				return;
	//   37   69:return          
			}
	}

	public void resetReleasePage()
	{
		if(refsp == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field IntHashtable refsp>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			lastPageRead = -1;
	//    4    8:aload_0         
	//    5    9:iconst_m1       
	//    6   10:putfield        #31  <Field int lastPageRead>
			return;
	//    7   13:return          
		}
	}

	int size()
	{
		if(refsn != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field ArrayList refsn>
	//*   2    4:ifnull          15
			return refsn.size();
	//    3    7:aload_0         
	//    4    8:getfield        #42  <Field ArrayList refsn>
	//    5   11:invokevirtual   #51  <Method int ArrayList.size()>
	//    6   14:ireturn         
		else
			return sizep;
	//    7   15:aload_0         
	//    8   16:getfield        #40  <Field int sizep>
	//    9   19:ireturn         
	}

	private boolean keepPages;
	private int lastPageRead;
	private ArrayList pageInh;
	private Set pagesNodes;
	private final PdfReader reader;
	private ArrayList refsn;
	private IntHashtable refsp;
	private int sizep;


/*
	static void access$100(PdfReader$PageRefs pdfreader$pagerefs, List list)
	{
		pdfreader$pagerefs.selectPages(list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #121 <Method void selectPages(List)>
		return;
	//    3    5:return          
	}

*/

	PdfReader$PageRefs(PdfReader$PageRefs pdfreader$pagerefs, PdfReader pdfreader)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		lastPageRead = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #31  <Field int lastPageRead>
		pagesNodes = ((Set) (new HashSet()));
	//    5    9:aload_0         
	//    6   10:new             #33  <Class HashSet>
	//    7   13:dup             
	//    8   14:invokespecial   #34  <Method void HashSet()>
	//    9   17:putfield        #36  <Field Set pagesNodes>
		reader = pdfreader;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #38  <Field PdfReader reader>
		sizep = pdfreader$pagerefs.sizep;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:getfield        #40  <Field int sizep>
	//   16   30:putfield        #40  <Field int sizep>
		if(pdfreader$pagerefs.refsn != null)
	//*  17   33:aload_1         
	//*  18   34:getfield        #42  <Field ArrayList refsn>
	//*  19   37:ifnull          102
		{
			refsn = new ArrayList(((java.util.Collection) (pdfreader$pagerefs.refsn)));
	//   20   40:aload_0         
	//   21   41:new             #44  <Class ArrayList>
	//   22   44:dup             
	//   23   45:aload_1         
	//   24   46:getfield        #42  <Field ArrayList refsn>
	//   25   49:invokespecial   #47  <Method void ArrayList(java.util.Collection)>
	//   26   52:putfield        #42  <Field ArrayList refsn>
			for(int i = 0; i < refsn.size(); i++)
	//*  27   55:iconst_0        
	//*  28   56:istore_3        
	//*  29   57:iload_3         
	//*  30   58:aload_0         
	//*  31   59:getfield        #42  <Field ArrayList refsn>
	//*  32   62:invokevirtual   #51  <Method int ArrayList.size()>
	//*  33   65:icmpge          116
				refsn.set(i, ((Object) ((PRIndirectReference)PdfReader.duplicatePdfObject((PdfObject)refsn.get(i), pdfreader))));
	//   34   68:aload_0         
	//   35   69:getfield        #42  <Field ArrayList refsn>
	//   36   72:iload_3         
	//   37   73:aload_0         
	//   38   74:getfield        #42  <Field ArrayList refsn>
	//   39   77:iload_3         
	//   40   78:invokevirtual   #55  <Method Object ArrayList.get(int)>
	//   41   81:checkcast       #57  <Class PdfObject>
	//   42   84:aload_2         
	//   43   85:invokestatic    #61  <Method PdfObject PdfReader.duplicatePdfObject(PdfObject, PdfReader)>
	//   44   88:checkcast       #63  <Class PRIndirectReference>
	//   45   91:invokevirtual   #67  <Method Object ArrayList.set(int, Object)>
	//   46   94:pop             

	//   47   95:iload_3         
	//   48   96:iconst_1        
	//   49   97:iadd            
	//   50   98:istore_3        
		} else
	//*  51   99:goto            57
		{
			refsp = (IntHashtable)pdfreader$pagerefs.refsp.clone();
	//   52  102:aload_0         
	//   53  103:aload_1         
	//   54  104:getfield        #69  <Field IntHashtable refsp>
	//   55  107:invokevirtual   #75  <Method Object IntHashtable.clone()>
	//   56  110:checkcast       #71  <Class IntHashtable>
	//   57  113:putfield        #69  <Field IntHashtable refsp>
		}
	//   58  116:return          
	}

	private PdfReader$PageRefs(PdfReader pdfreader)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		lastPageRead = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #31  <Field int lastPageRead>
		pagesNodes = ((Set) (new HashSet()));
	//    5    9:aload_0         
	//    6   10:new             #33  <Class HashSet>
	//    7   13:dup             
	//    8   14:invokespecial   #34  <Method void HashSet()>
	//    9   17:putfield        #36  <Field Set pagesNodes>
		reader = pdfreader;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #38  <Field PdfReader reader>
		if(PdfReader.access$200(pdfreader))
	//*  13   25:aload_1         
	//*  14   26:invokestatic    #83  <Method boolean PdfReader.access$200(PdfReader)>
	//*  15   29:ifeq            67
		{
			refsp = new IntHashtable();
	//   16   32:aload_0         
	//   17   33:new             #71  <Class IntHashtable>
	//   18   36:dup             
	//   19   37:invokespecial   #84  <Method void IntHashtable()>
	//   20   40:putfield        #69  <Field IntHashtable refsp>
			sizep = ((PdfNumber)PdfReader.getPdfObjectRelease(pdfreader.rootPages.get(PdfName.COUNT))).intValue();
	//   21   43:aload_0         
	//   22   44:aload_1         
	//   23   45:getfield        #88  <Field PdfDictionary PdfReader.rootPages>
	//   24   48:getstatic       #94  <Field PdfName PdfName.COUNT>
	//   25   51:invokevirtual   #99  <Method PdfObject PdfDictionary.get(PdfName)>
	//   26   54:invokestatic    #103 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   27   57:checkcast       #105 <Class PdfNumber>
	//   28   60:invokevirtual   #108 <Method int PdfNumber.intValue()>
	//   29   63:putfield        #40  <Field int sizep>
			return;
	//   30   66:return          
		} else
		{
			readPages();
	//   31   67:aload_0         
	//   32   68:invokevirtual   #111 <Method void readPages()>
			return;
	//   33   71:return          
		}
	}

	PdfReader$PageRefs(PdfReader pdfreader, PdfReader._cls1 _pcls1)
		throws IOException
	{
		this(pdfreader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #115 <Method void PdfReader$PageRefs(PdfReader)>
	//    3    5:return          
	}
}
