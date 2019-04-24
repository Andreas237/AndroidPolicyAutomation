// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.exceptions.*;
import com.itextpdf.text.io.*;
import com.itextpdf.text.log.*;
import com.itextpdf.text.pdf.interfaces.PdfViewerPreferences;
import com.itextpdf.text.pdf.internal.PdfViewerPreferencesImp;
import com.itextpdf.text.pdf.security.ExternalDecryptionProcess;
import java.io.*;
import java.net.URL;
import java.security.*;
import java.security.cert.Certificate;
import java.util.*;
import java.util.zip.InflaterInputStream;
import org.spongycastle.cert.X509CertificateHolder;
import org.spongycastle.cms.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfName, PdfEncodings, PRTokeniser, PdfEncryption, 
//			PdfObject, PdfDictionary, PRIndirectReference, RandomAccessFileOrArray, 
//			LZWDecoder, PRStream, PdfNumber, PdfArray, 
//			FilterHandlers, PdfNull, PdfLiteral, PdfBoolean, 
//			PdfString, PdfEncryptor, BaseFont, IntHashtable, 
//			AcroFields, PRAcroForm, PdfIndirectReference, PdfNameTree, 
//			PdfReaderInstance, LongHashtable, SequenceList, PdfWriter

public class PdfReader
	implements PdfViewerPreferences
{
	static class PageRefs
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
			if(reader.partial)
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
				if(reader.partial)
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
			if(reader.lastXrefPartial != -1)
				break MISSING_BLOCK_LABEL_110;
			lastPageRead = -1;
_L1:
			reader.lastXrefPartial = -1;
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
						l = reader.lastXrefPartial;
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
						reader.lastXrefPartial = l;
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
			IntHashtable.Entry entry;
			for(Iterator iterator = refsp.getEntryIterator(); iterator.hasNext(); inthashtable.put(i, entry.getValue()))
		//*  57  106:aload_0         
		//*  58  107:getfield        #69  <Field IntHashtable refsp>
		//*  59  110:invokevirtual   #364 <Method Iterator IntHashtable.getEntryIterator()>
		//*  60  113:astore          6
		//*  61  115:aload           6
		//*  62  117:invokeinterface #178 <Method boolean Iterator.hasNext()>
		//*  63  122:ifeq            170
			{
				entry = (IntHashtable.Entry)iterator.next();
		//   64  125:aload           6
		//   65  127:invokeinterface #181 <Method Object Iterator.next()>
		//   66  132:checkcast       #366 <Class IntHashtable$Entry>
		//   67  135:astore          7
				int j = entry.getKey();
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
					reader.lastXrefPartial = refsp.get(i);
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
		static void access$100(PageRefs pagerefs, List list)
		{
			pagerefs.selectPages(list);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #121 <Method void selectPages(List)>
			return;
		//    3    5:return          
		}

*/

		PageRefs(PageRefs pagerefs, PdfReader pdfreader)
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
			sizep = pagerefs.sizep;
		//   13   25:aload_0         
		//   14   26:aload_1         
		//   15   27:getfield        #40  <Field int sizep>
		//   16   30:putfield        #40  <Field int sizep>
			if(pagerefs.refsn != null)
		//*  17   33:aload_1         
		//*  18   34:getfield        #42  <Field ArrayList refsn>
		//*  19   37:ifnull          102
			{
				refsn = new ArrayList(((Collection) (pagerefs.refsn)));
		//   20   40:aload_0         
		//   21   41:new             #44  <Class ArrayList>
		//   22   44:dup             
		//   23   45:aload_1         
		//   24   46:getfield        #42  <Field ArrayList refsn>
		//   25   49:invokespecial   #47  <Method void ArrayList(Collection)>
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
				refsp = (IntHashtable)pagerefs.refsp.clone();
		//   52  102:aload_0         
		//   53  103:aload_1         
		//   54  104:getfield        #69  <Field IntHashtable refsp>
		//   55  107:invokevirtual   #75  <Method Object IntHashtable.clone()>
		//   56  110:checkcast       #71  <Class IntHashtable>
		//   57  113:putfield        #69  <Field IntHashtable refsp>
			}
		//   58  116:return          
		}

		private PageRefs(PdfReader pdfreader)
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
			if(pdfreader.partial)
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

	}


	private PdfReader(RandomAccessSource randomaccesssource, boolean flag, byte abyte0[], Certificate certificate1, Key key, String s, ExternalDecryptionProcess externaldecryptionprocess, 
			boolean flag1)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #145 <Method void Object()>
		acroForm = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #147 <Field PRAcroForm acroForm>
		acroFormParsed = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #149 <Field boolean acroFormParsed>
		encrypted = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #151 <Field boolean encrypted>
		rebuilt = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #153 <Field boolean rebuilt>
		tampered = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #155 <Field boolean tampered>
		password = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #157 <Field byte[] password>
		certificateKey = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #159 <Field Key certificateKey>
		certificate = null;
	//   23   39:aload_0         
	//   24   40:aconst_null     
	//   25   41:putfield        #161 <Field Certificate certificate>
		certificateKeyProvider = null;
	//   26   44:aload_0         
	//   27   45:aconst_null     
	//   28   46:putfield        #163 <Field String certificateKeyProvider>
		externalDecryptionProcess = null;
	//   29   49:aload_0         
	//   30   50:aconst_null     
	//   31   51:putfield        #165 <Field ExternalDecryptionProcess externalDecryptionProcess>
		strings = new ArrayList();
	//   32   54:aload_0         
	//   33   55:new             #167 <Class ArrayList>
	//   34   58:dup             
	//   35   59:invokespecial   #168 <Method void ArrayList()>
	//   36   62:putfield        #170 <Field ArrayList strings>
		sharedStreams = true;
	//   37   65:aload_0         
	//   38   66:iconst_1        
	//   39   67:putfield        #172 <Field boolean sharedStreams>
		consolidateNamedDestinations = false;
	//   40   70:aload_0         
	//   41   71:iconst_0        
	//   42   72:putfield        #174 <Field boolean consolidateNamedDestinations>
		remoteToLocalNamedDestinations = false;
	//   43   75:aload_0         
	//   44   76:iconst_0        
	//   45   77:putfield        #176 <Field boolean remoteToLocalNamedDestinations>
		lastXrefPartial = -1;
	//   46   80:aload_0         
	//   47   81:iconst_m1       
	//   48   82:putfield        #178 <Field int lastXrefPartial>
		viewerPreferences = new PdfViewerPreferencesImp();
	//   49   85:aload_0         
	//   50   86:new             #180 <Class PdfViewerPreferencesImp>
	//   51   89:dup             
	//   52   90:invokespecial   #181 <Method void PdfViewerPreferencesImp()>
	//   53   93:putfield        #183 <Field PdfViewerPreferencesImp viewerPreferences>
		readDepth = 0;
	//   54   96:aload_0         
	//   55   97:iconst_0        
	//   56   98:putfield        #185 <Field int readDepth>
		certificate = certificate1;
	//   57  101:aload_0         
	//   58  102:aload           4
	//   59  104:putfield        #161 <Field Certificate certificate>
		certificateKey = key;
	//   60  107:aload_0         
	//   61  108:aload           5
	//   62  110:putfield        #159 <Field Key certificateKey>
		certificateKeyProvider = s;
	//   63  113:aload_0         
	//   64  114:aload           6
	//   65  116:putfield        #163 <Field String certificateKeyProvider>
		externalDecryptionProcess = externaldecryptionprocess;
	//   66  119:aload_0         
	//   67  120:aload           7
	//   68  122:putfield        #165 <Field ExternalDecryptionProcess externalDecryptionProcess>
		password = abyte0;
	//   69  125:aload_0         
	//   70  126:aload_3         
	//   71  127:putfield        #157 <Field byte[] password>
		partial = flag;
	//   72  130:aload_0         
	//   73  131:iload_2         
	//   74  132:putfield        #187 <Field boolean partial>
		try
		{
			tokens = getOffsetTokeniser(randomaccesssource);
	//   75  135:aload_0         
	//   76  136:aload_1         
	//   77  137:invokestatic    #191 <Method PRTokeniser getOffsetTokeniser(RandomAccessSource)>
	//   78  140:putfield        #193 <Field PRTokeniser tokens>
		}
	//*  79  143:iload_2         
	//*  80  144:ifeq            165
	//*  81  147:aload_0         
	//*  82  148:invokevirtual   #196 <Method void readPdfPartial()>
	//*  83  151:aload_0         
	//*  84  152:invokevirtual   #199 <Method Counter getCounter()>
	//*  85  155:aload_0         
	//*  86  156:getfield        #201 <Field long fileLength>
	//*  87  159:invokeinterface #207 <Method void Counter.read(long)>
	//*  88  164:return          
	//*  89  165:aload_0         
	//*  90  166:invokevirtual   #210 <Method void readPdf()>
	//*  91  169:goto            151
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  92  172:astore_3        
		{
			if(flag1)
	//*  93  173:iload           8
	//*  94  175:ifeq            184
				randomaccesssource.close();
	//   95  178:aload_1         
	//   96  179:invokeinterface #215 <Method void RandomAccessSource.close()>
			throw abyte0;
	//   97  184:aload_3         
	//   98  185:athrow          
		}
		if(!flag) goto _L2; else goto _L1
_L1:
		readPdfPartial();
_L4:
		getCounter().read(fileLength);
		return;
_L2:
		readPdf();
		if(true) goto _L4; else goto _L3
_L3:
	}

	public PdfReader(PdfReader pdfreader)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #145 <Method void Object()>
		acroForm = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #147 <Field PRAcroForm acroForm>
		acroFormParsed = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #149 <Field boolean acroFormParsed>
		encrypted = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #151 <Field boolean encrypted>
		rebuilt = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #153 <Field boolean rebuilt>
		tampered = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #155 <Field boolean tampered>
		password = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #157 <Field byte[] password>
		certificateKey = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #159 <Field Key certificateKey>
		certificate = null;
	//   23   39:aload_0         
	//   24   40:aconst_null     
	//   25   41:putfield        #161 <Field Certificate certificate>
		certificateKeyProvider = null;
	//   26   44:aload_0         
	//   27   45:aconst_null     
	//   28   46:putfield        #163 <Field String certificateKeyProvider>
		externalDecryptionProcess = null;
	//   29   49:aload_0         
	//   30   50:aconst_null     
	//   31   51:putfield        #165 <Field ExternalDecryptionProcess externalDecryptionProcess>
		strings = new ArrayList();
	//   32   54:aload_0         
	//   33   55:new             #167 <Class ArrayList>
	//   34   58:dup             
	//   35   59:invokespecial   #168 <Method void ArrayList()>
	//   36   62:putfield        #170 <Field ArrayList strings>
		sharedStreams = true;
	//   37   65:aload_0         
	//   38   66:iconst_1        
	//   39   67:putfield        #172 <Field boolean sharedStreams>
		consolidateNamedDestinations = false;
	//   40   70:aload_0         
	//   41   71:iconst_0        
	//   42   72:putfield        #174 <Field boolean consolidateNamedDestinations>
		remoteToLocalNamedDestinations = false;
	//   43   75:aload_0         
	//   44   76:iconst_0        
	//   45   77:putfield        #176 <Field boolean remoteToLocalNamedDestinations>
		lastXrefPartial = -1;
	//   46   80:aload_0         
	//   47   81:iconst_m1       
	//   48   82:putfield        #178 <Field int lastXrefPartial>
		viewerPreferences = new PdfViewerPreferencesImp();
	//   49   85:aload_0         
	//   50   86:new             #180 <Class PdfViewerPreferencesImp>
	//   51   89:dup             
	//   52   90:invokespecial   #181 <Method void PdfViewerPreferencesImp()>
	//   53   93:putfield        #183 <Field PdfViewerPreferencesImp viewerPreferences>
		readDepth = 0;
	//   54   96:aload_0         
	//   55   97:iconst_0        
	//   56   98:putfield        #185 <Field int readDepth>
		appendable = pdfreader.appendable;
	//   57  101:aload_0         
	//   58  102:aload_1         
	//   59  103:getfield        #219 <Field boolean appendable>
	//   60  106:putfield        #219 <Field boolean appendable>
		consolidateNamedDestinations = pdfreader.consolidateNamedDestinations;
	//   61  109:aload_0         
	//   62  110:aload_1         
	//   63  111:getfield        #174 <Field boolean consolidateNamedDestinations>
	//   64  114:putfield        #174 <Field boolean consolidateNamedDestinations>
		encrypted = pdfreader.encrypted;
	//   65  117:aload_0         
	//   66  118:aload_1         
	//   67  119:getfield        #151 <Field boolean encrypted>
	//   68  122:putfield        #151 <Field boolean encrypted>
		rebuilt = pdfreader.rebuilt;
	//   69  125:aload_0         
	//   70  126:aload_1         
	//   71  127:getfield        #153 <Field boolean rebuilt>
	//   72  130:putfield        #153 <Field boolean rebuilt>
		sharedStreams = pdfreader.sharedStreams;
	//   73  133:aload_0         
	//   74  134:aload_1         
	//   75  135:getfield        #172 <Field boolean sharedStreams>
	//   76  138:putfield        #172 <Field boolean sharedStreams>
		tampered = pdfreader.tampered;
	//   77  141:aload_0         
	//   78  142:aload_1         
	//   79  143:getfield        #155 <Field boolean tampered>
	//   80  146:putfield        #155 <Field boolean tampered>
		password = pdfreader.password;
	//   81  149:aload_0         
	//   82  150:aload_1         
	//   83  151:getfield        #157 <Field byte[] password>
	//   84  154:putfield        #157 <Field byte[] password>
		pdfVersion = pdfreader.pdfVersion;
	//   85  157:aload_0         
	//   86  158:aload_1         
	//   87  159:getfield        #221 <Field char pdfVersion>
	//   88  162:putfield        #221 <Field char pdfVersion>
		eofPos = pdfreader.eofPos;
	//   89  165:aload_0         
	//   90  166:aload_1         
	//   91  167:getfield        #223 <Field long eofPos>
	//   92  170:putfield        #223 <Field long eofPos>
		freeXref = pdfreader.freeXref;
	//   93  173:aload_0         
	//   94  174:aload_1         
	//   95  175:getfield        #225 <Field int freeXref>
	//   96  178:putfield        #225 <Field int freeXref>
		lastXref = pdfreader.lastXref;
	//   97  181:aload_0         
	//   98  182:aload_1         
	//   99  183:getfield        #227 <Field long lastXref>
	//  100  186:putfield        #227 <Field long lastXref>
		newXrefType = pdfreader.newXrefType;
	//  101  189:aload_0         
	//  102  190:aload_1         
	//  103  191:getfield        #229 <Field boolean newXrefType>
	//  104  194:putfield        #229 <Field boolean newXrefType>
		tokens = new PRTokeniser(pdfreader.tokens.getSafeFile());
	//  105  197:aload_0         
	//  106  198:new             #231 <Class PRTokeniser>
	//  107  201:dup             
	//  108  202:aload_1         
	//  109  203:getfield        #193 <Field PRTokeniser tokens>
	//  110  206:invokevirtual   #235 <Method RandomAccessFileOrArray PRTokeniser.getSafeFile()>
	//  111  209:invokespecial   #238 <Method void PRTokeniser(RandomAccessFileOrArray)>
	//  112  212:putfield        #193 <Field PRTokeniser tokens>
		if(pdfreader.decrypt != null)
	//* 113  215:aload_1         
	//* 114  216:getfield        #240 <Field PdfEncryption decrypt>
	//* 115  219:ifnull          237
			decrypt = new PdfEncryption(pdfreader.decrypt);
	//  116  222:aload_0         
	//  117  223:new             #242 <Class PdfEncryption>
	//  118  226:dup             
	//  119  227:aload_1         
	//  120  228:getfield        #240 <Field PdfEncryption decrypt>
	//  121  231:invokespecial   #245 <Method void PdfEncryption(PdfEncryption)>
	//  122  234:putfield        #240 <Field PdfEncryption decrypt>
		pValue = pdfreader.pValue;
	//  123  237:aload_0         
	//  124  238:aload_1         
	//  125  239:getfield        #247 <Field long pValue>
	//  126  242:putfield        #247 <Field long pValue>
		rValue = pdfreader.rValue;
	//  127  245:aload_0         
	//  128  246:aload_1         
	//  129  247:getfield        #249 <Field int rValue>
	//  130  250:putfield        #249 <Field int rValue>
		xrefObj = new ArrayList(((Collection) (pdfreader.xrefObj)));
	//  131  253:aload_0         
	//  132  254:new             #167 <Class ArrayList>
	//  133  257:dup             
	//  134  258:aload_1         
	//  135  259:getfield        #251 <Field ArrayList xrefObj>
	//  136  262:invokespecial   #254 <Method void ArrayList(Collection)>
	//  137  265:putfield        #251 <Field ArrayList xrefObj>
		for(int i = 0; i < pdfreader.xrefObj.size(); i++)
	//* 138  268:iconst_0        
	//* 139  269:istore_2        
	//* 140  270:iload_2         
	//* 141  271:aload_1         
	//* 142  272:getfield        #251 <Field ArrayList xrefObj>
	//* 143  275:invokevirtual   #258 <Method int ArrayList.size()>
	//* 144  278:icmpge          312
			xrefObj.set(i, ((Object) (duplicatePdfObject((PdfObject)pdfreader.xrefObj.get(i), this))));
	//  145  281:aload_0         
	//  146  282:getfield        #251 <Field ArrayList xrefObj>
	//  147  285:iload_2         
	//  148  286:aload_1         
	//  149  287:getfield        #251 <Field ArrayList xrefObj>
	//  150  290:iload_2         
	//  151  291:invokevirtual   #262 <Method Object ArrayList.get(int)>
	//  152  294:checkcast       #264 <Class PdfObject>
	//  153  297:aload_0         
	//  154  298:invokestatic    #268 <Method PdfObject duplicatePdfObject(PdfObject, PdfReader)>
	//  155  301:invokevirtual   #272 <Method Object ArrayList.set(int, Object)>
	//  156  304:pop             

	//  157  305:iload_2         
	//  158  306:iconst_1        
	//  159  307:iadd            
	//  160  308:istore_2        
	//* 161  309:goto            270
		pageRefs = new PageRefs(pdfreader.pageRefs, this);
	//  162  312:aload_0         
	//  163  313:new             #10  <Class PdfReader$PageRefs>
	//  164  316:dup             
	//  165  317:aload_1         
	//  166  318:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//  167  321:aload_0         
	//  168  322:invokespecial   #277 <Method void PdfReader$PageRefs(PdfReader$PageRefs, PdfReader)>
	//  169  325:putfield        #274 <Field PdfReader$PageRefs pageRefs>
		trailer = (PdfDictionary)duplicatePdfObject(((PdfObject) (pdfreader.trailer)), this);
	//  170  328:aload_0         
	//  171  329:aload_1         
	//  172  330:getfield        #279 <Field PdfDictionary trailer>
	//  173  333:aload_0         
	//  174  334:invokestatic    #268 <Method PdfObject duplicatePdfObject(PdfObject, PdfReader)>
	//  175  337:checkcast       #281 <Class PdfDictionary>
	//  176  340:putfield        #279 <Field PdfDictionary trailer>
		catalog = trailer.getAsDict(PdfName.ROOT);
	//  177  343:aload_0         
	//  178  344:aload_0         
	//  179  345:getfield        #279 <Field PdfDictionary trailer>
	//  180  348:getstatic       #284 <Field PdfName PdfName.ROOT>
	//  181  351:invokevirtual   #288 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//  182  354:putfield        #290 <Field PdfDictionary catalog>
		rootPages = catalog.getAsDict(PdfName.PAGES);
	//  183  357:aload_0         
	//  184  358:aload_0         
	//  185  359:getfield        #290 <Field PdfDictionary catalog>
	//  186  362:getstatic       #293 <Field PdfName PdfName.PAGES>
	//  187  365:invokevirtual   #288 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//  188  368:putfield        #295 <Field PdfDictionary rootPages>
		fileLength = pdfreader.fileLength;
	//  189  371:aload_0         
	//  190  372:aload_1         
	//  191  373:getfield        #201 <Field long fileLength>
	//  192  376:putfield        #201 <Field long fileLength>
		partial = pdfreader.partial;
	//  193  379:aload_0         
	//  194  380:aload_1         
	//  195  381:getfield        #187 <Field boolean partial>
	//  196  384:putfield        #187 <Field boolean partial>
		hybridXref = pdfreader.hybridXref;
	//  197  387:aload_0         
	//  198  388:aload_1         
	//  199  389:getfield        #297 <Field boolean hybridXref>
	//  200  392:putfield        #297 <Field boolean hybridXref>
		objStmToOffset = pdfreader.objStmToOffset;
	//  201  395:aload_0         
	//  202  396:aload_1         
	//  203  397:getfield        #299 <Field LongHashtable objStmToOffset>
	//  204  400:putfield        #299 <Field LongHashtable objStmToOffset>
		xref = pdfreader.xref;
	//  205  403:aload_0         
	//  206  404:aload_1         
	//  207  405:getfield        #301 <Field long[] xref>
	//  208  408:putfield        #301 <Field long[] xref>
		cryptoRef = (PRIndirectReference)duplicatePdfObject(((PdfObject) (pdfreader.cryptoRef)), this);
	//  209  411:aload_0         
	//  210  412:aload_1         
	//  211  413:getfield        #303 <Field PRIndirectReference cryptoRef>
	//  212  416:aload_0         
	//  213  417:invokestatic    #268 <Method PdfObject duplicatePdfObject(PdfObject, PdfReader)>
	//  214  420:checkcast       #305 <Class PRIndirectReference>
	//  215  423:putfield        #303 <Field PRIndirectReference cryptoRef>
		ownerPasswordUsed = pdfreader.ownerPasswordUsed;
	//  216  426:aload_0         
	//  217  427:aload_1         
	//  218  428:getfield        #307 <Field boolean ownerPasswordUsed>
	//  219  431:putfield        #307 <Field boolean ownerPasswordUsed>
	//  220  434:return          
	}

	public PdfReader(RandomAccessFileOrArray randomaccessfileorarray, byte abyte0[])
		throws IOException
	{
		this(randomaccessfileorarray, abyte0, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:invokespecial   #311 <Method void PdfReader(RandomAccessFileOrArray, byte[], boolean)>
	//    5    7:return          
	}

	public PdfReader(RandomAccessFileOrArray randomaccessfileorarray, byte abyte0[], boolean flag)
		throws IOException
	{
		this(randomaccessfileorarray.getByteSource(), flag, abyte0, ((Certificate) (null)), ((Key) (null)), ((String) (null)), ((ExternalDecryptionProcess) (null)), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #317 <Method RandomAccessSource RandomAccessFileOrArray.getByteSource()>
	//    3    5:iload_3         
	//    4    6:aload_2         
	//    5    7:aconst_null     
	//    6    8:aconst_null     
	//    7    9:aconst_null     
	//    8   10:aconst_null     
	//    9   11:iconst_0        
	//   10   12:invokespecial   #319 <Method void PdfReader(RandomAccessSource, boolean, byte[], Certificate, Key, String, ExternalDecryptionProcess, boolean)>
	//   11   15:return          
	}

	public PdfReader(InputStream inputstream)
		throws IOException
	{
		this(inputstream, ((byte []) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #323 <Method void PdfReader(InputStream, byte[])>
	//    4    6:return          
	}

	public PdfReader(InputStream inputstream, Certificate certificate1, ExternalDecryptionProcess externaldecryptionprocess)
		throws IOException
	{
		this((new RandomAccessSourceFactory()).setForceRead(false).setUsePlainRandomAccess(Document.plainRandomAccess).createSource(inputstream), false, ((byte []) (null)), certificate1, ((Key) (null)), ((String) (null)), externaldecryptionprocess, true);
	//    0    0:aload_0         
	//    1    1:new             #326 <Class RandomAccessSourceFactory>
	//    2    4:dup             
	//    3    5:invokespecial   #327 <Method void RandomAccessSourceFactory()>
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #331 <Method RandomAccessSourceFactory RandomAccessSourceFactory.setForceRead(boolean)>
	//    6   12:getstatic       #336 <Field boolean Document.plainRandomAccess>
	//    7   15:invokevirtual   #339 <Method RandomAccessSourceFactory RandomAccessSourceFactory.setUsePlainRandomAccess(boolean)>
	//    8   18:aload_1         
	//    9   19:invokevirtual   #343 <Method RandomAccessSource RandomAccessSourceFactory.createSource(InputStream)>
	//   10   22:iconst_0        
	//   11   23:aconst_null     
	//   12   24:aload_2         
	//   13   25:aconst_null     
	//   14   26:aconst_null     
	//   15   27:aload_3         
	//   16   28:iconst_1        
	//   17   29:invokespecial   #319 <Method void PdfReader(RandomAccessSource, boolean, byte[], Certificate, Key, String, ExternalDecryptionProcess, boolean)>
	//   18   32:return          
	}

	public PdfReader(InputStream inputstream, byte abyte0[])
		throws IOException
	{
		this((new RandomAccessSourceFactory()).createSource(inputstream), false, abyte0, ((Certificate) (null)), ((Key) (null)), ((String) (null)), ((ExternalDecryptionProcess) (null)), false);
	//    0    0:aload_0         
	//    1    1:new             #326 <Class RandomAccessSourceFactory>
	//    2    4:dup             
	//    3    5:invokespecial   #327 <Method void RandomAccessSourceFactory()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #343 <Method RandomAccessSource RandomAccessSourceFactory.createSource(InputStream)>
	//    6   12:iconst_0        
	//    7   13:aload_2         
	//    8   14:aconst_null     
	//    9   15:aconst_null     
	//   10   16:aconst_null     
	//   11   17:aconst_null     
	//   12   18:iconst_0        
	//   13   19:invokespecial   #319 <Method void PdfReader(RandomAccessSource, boolean, byte[], Certificate, Key, String, ExternalDecryptionProcess, boolean)>
	//   14   22:return          
	}

	public PdfReader(String s)
		throws IOException
	{
		this(s, (byte[])null);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:checkcast       #345 <Class byte[]>
	//    4    6:invokespecial   #348 <Method void PdfReader(String, byte[])>
	//    5    9:return          
	}

	public PdfReader(String s, Certificate certificate1, ExternalDecryptionProcess externaldecryptionprocess)
		throws IOException
	{
		this((new RandomAccessSourceFactory()).setForceRead(false).setUsePlainRandomAccess(Document.plainRandomAccess).createBestSource(s), false, ((byte []) (null)), certificate1, ((Key) (null)), ((String) (null)), externaldecryptionprocess, true);
	//    0    0:aload_0         
	//    1    1:new             #326 <Class RandomAccessSourceFactory>
	//    2    4:dup             
	//    3    5:invokespecial   #327 <Method void RandomAccessSourceFactory()>
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #331 <Method RandomAccessSourceFactory RandomAccessSourceFactory.setForceRead(boolean)>
	//    6   12:getstatic       #336 <Field boolean Document.plainRandomAccess>
	//    7   15:invokevirtual   #339 <Method RandomAccessSourceFactory RandomAccessSourceFactory.setUsePlainRandomAccess(boolean)>
	//    8   18:aload_1         
	//    9   19:invokevirtual   #353 <Method RandomAccessSource RandomAccessSourceFactory.createBestSource(String)>
	//   10   22:iconst_0        
	//   11   23:aconst_null     
	//   12   24:aload_2         
	//   13   25:aconst_null     
	//   14   26:aconst_null     
	//   15   27:aload_3         
	//   16   28:iconst_1        
	//   17   29:invokespecial   #319 <Method void PdfReader(RandomAccessSource, boolean, byte[], Certificate, Key, String, ExternalDecryptionProcess, boolean)>
	//   18   32:return          
	}

	public PdfReader(String s, Certificate certificate1, Key key, String s1)
		throws IOException
	{
		this((new RandomAccessSourceFactory()).setForceRead(false).setUsePlainRandomAccess(Document.plainRandomAccess).createBestSource(s), false, ((byte []) (null)), certificate1, key, s1, ((ExternalDecryptionProcess) (null)), true);
	//    0    0:aload_0         
	//    1    1:new             #326 <Class RandomAccessSourceFactory>
	//    2    4:dup             
	//    3    5:invokespecial   #327 <Method void RandomAccessSourceFactory()>
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #331 <Method RandomAccessSourceFactory RandomAccessSourceFactory.setForceRead(boolean)>
	//    6   12:getstatic       #336 <Field boolean Document.plainRandomAccess>
	//    7   15:invokevirtual   #339 <Method RandomAccessSourceFactory RandomAccessSourceFactory.setUsePlainRandomAccess(boolean)>
	//    8   18:aload_1         
	//    9   19:invokevirtual   #353 <Method RandomAccessSource RandomAccessSourceFactory.createBestSource(String)>
	//   10   22:iconst_0        
	//   11   23:aconst_null     
	//   12   24:aload_2         
	//   13   25:aload_3         
	//   14   26:aload           4
	//   15   28:aconst_null     
	//   16   29:iconst_1        
	//   17   30:invokespecial   #319 <Method void PdfReader(RandomAccessSource, boolean, byte[], Certificate, Key, String, ExternalDecryptionProcess, boolean)>
	//   18   33:return          
	}

	public PdfReader(String s, byte abyte0[])
		throws IOException
	{
		this(s, abyte0, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #357 <Method void PdfReader(String, byte[], boolean)>
	//    5    7:return          
	}

	public PdfReader(String s, byte abyte0[], boolean flag)
		throws IOException
	{
		this((new RandomAccessSourceFactory()).setForceRead(false).setUsePlainRandomAccess(Document.plainRandomAccess).createBestSource(s), flag, abyte0, ((Certificate) (null)), ((Key) (null)), ((String) (null)), ((ExternalDecryptionProcess) (null)), true);
	//    0    0:aload_0         
	//    1    1:new             #326 <Class RandomAccessSourceFactory>
	//    2    4:dup             
	//    3    5:invokespecial   #327 <Method void RandomAccessSourceFactory()>
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #331 <Method RandomAccessSourceFactory RandomAccessSourceFactory.setForceRead(boolean)>
	//    6   12:getstatic       #336 <Field boolean Document.plainRandomAccess>
	//    7   15:invokevirtual   #339 <Method RandomAccessSourceFactory RandomAccessSourceFactory.setUsePlainRandomAccess(boolean)>
	//    8   18:aload_1         
	//    9   19:invokevirtual   #353 <Method RandomAccessSource RandomAccessSourceFactory.createBestSource(String)>
	//   10   22:iload_3         
	//   11   23:aload_2         
	//   12   24:aconst_null     
	//   13   25:aconst_null     
	//   14   26:aconst_null     
	//   15   27:aconst_null     
	//   16   28:iconst_1        
	//   17   29:invokespecial   #319 <Method void PdfReader(RandomAccessSource, boolean, byte[], Certificate, Key, String, ExternalDecryptionProcess, boolean)>
	//   18   32:return          
	}

	public PdfReader(URL url)
		throws IOException
	{
		this(url, ((byte []) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #361 <Method void PdfReader(URL, byte[])>
	//    4    6:return          
	}

	public PdfReader(URL url, byte abyte0[])
		throws IOException
	{
		this((new RandomAccessSourceFactory()).createSource(url), false, abyte0, ((Certificate) (null)), ((Key) (null)), ((String) (null)), ((ExternalDecryptionProcess) (null)), true);
	//    0    0:aload_0         
	//    1    1:new             #326 <Class RandomAccessSourceFactory>
	//    2    4:dup             
	//    3    5:invokespecial   #327 <Method void RandomAccessSourceFactory()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #364 <Method RandomAccessSource RandomAccessSourceFactory.createSource(URL)>
	//    6   12:iconst_0        
	//    7   13:aload_2         
	//    8   14:aconst_null     
	//    9   15:aconst_null     
	//   10   16:aconst_null     
	//   11   17:aconst_null     
	//   12   18:iconst_1        
	//   13   19:invokespecial   #319 <Method void PdfReader(RandomAccessSource, boolean, byte[], Certificate, Key, String, ExternalDecryptionProcess, boolean)>
	//   14   22:return          
	}

	public PdfReader(byte abyte0[])
		throws IOException
	{
		this(abyte0, ((byte []) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #368 <Method void PdfReader(byte[], byte[])>
	//    4    6:return          
	}

	public PdfReader(byte abyte0[], Certificate certificate1, ExternalDecryptionProcess externaldecryptionprocess)
		throws IOException
	{
		this((new RandomAccessSourceFactory()).setForceRead(false).setUsePlainRandomAccess(Document.plainRandomAccess).createSource(abyte0), false, ((byte []) (null)), certificate1, ((Key) (null)), ((String) (null)), externaldecryptionprocess, true);
	//    0    0:aload_0         
	//    1    1:new             #326 <Class RandomAccessSourceFactory>
	//    2    4:dup             
	//    3    5:invokespecial   #327 <Method void RandomAccessSourceFactory()>
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #331 <Method RandomAccessSourceFactory RandomAccessSourceFactory.setForceRead(boolean)>
	//    6   12:getstatic       #336 <Field boolean Document.plainRandomAccess>
	//    7   15:invokevirtual   #339 <Method RandomAccessSourceFactory RandomAccessSourceFactory.setUsePlainRandomAccess(boolean)>
	//    8   18:aload_1         
	//    9   19:invokevirtual   #372 <Method RandomAccessSource RandomAccessSourceFactory.createSource(byte[])>
	//   10   22:iconst_0        
	//   11   23:aconst_null     
	//   12   24:aload_2         
	//   13   25:aconst_null     
	//   14   26:aconst_null     
	//   15   27:aload_3         
	//   16   28:iconst_1        
	//   17   29:invokespecial   #319 <Method void PdfReader(RandomAccessSource, boolean, byte[], Certificate, Key, String, ExternalDecryptionProcess, boolean)>
	//   18   32:return          
	}

	public PdfReader(byte abyte0[], byte abyte1[])
		throws IOException
	{
		this((new RandomAccessSourceFactory()).createSource(abyte0), false, abyte1, ((Certificate) (null)), ((Key) (null)), ((String) (null)), ((ExternalDecryptionProcess) (null)), true);
	//    0    0:aload_0         
	//    1    1:new             #326 <Class RandomAccessSourceFactory>
	//    2    4:dup             
	//    3    5:invokespecial   #327 <Method void RandomAccessSourceFactory()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #372 <Method RandomAccessSource RandomAccessSourceFactory.createSource(byte[])>
	//    6   12:iconst_0        
	//    7   13:aload_2         
	//    8   14:aconst_null     
	//    9   15:aconst_null     
	//   10   16:aconst_null     
	//   11   17:aconst_null     
	//   12   18:iconst_1        
	//   13   19:invokespecial   #319 <Method void PdfReader(RandomAccessSource, boolean, byte[], Certificate, Key, String, ExternalDecryptionProcess, boolean)>
	//   14   22:return          
	}

	public static byte[] ASCII85Decode(byte abyte0[])
	{
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #376 <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #377 <Method void ByteArrayOutputStream()>
	//    3    7:astore          5
		int i = 0;
	//    4    9:iconst_0        
	//    5   10:istore_1        
		int ai[] = new int[5];
	//    6   11:iconst_5        
	//    7   12:newarray        int[]
	//    8   14:astore          6
		int k = 0;
	//    9   16:iconst_0        
	//   10   17:istore_2        
		do
		{
label0:
			{
				int l;
				if(k < abyte0.length)
	//*  11   18:iload_2         
	//*  12   19:aload_0         
	//*  13   20:arraylength     
	//*  14   21:icmpge          38
				{
					l = abyte0[k] & 0xff;
	//   15   24:aload_0         
	//   16   25:iload_2         
	//   17   26:baload          
	//   18   27:sipush          255
	//   19   30:iand            
	//   20   31:istore_3        
					if(l != 126)
						break label0;
	//   21   32:iload_3         
	//   22   33:bipush          126
	//   23   35:icmpne          99
				}
				boolean flag;
				if(i == 2)
	//*  24   38:iload_1         
	//*  25   39:iconst_2        
	//*  26   40:icmpne          271
					bytearrayoutputstream.write(((int) ((byte)(ai[0] * 85 * 85 * 85 * 85 + ai[1] * 85 * 85 * 85 + 0x95eed + 7225 + 85 >> 24))));
	//   27   43:aload           5
	//   28   45:aload           6
	//   29   47:iconst_0        
	//   30   48:iaload          
	//   31   49:bipush          85
	//   32   51:imul            
	//   33   52:bipush          85
	//   34   54:imul            
	//   35   55:bipush          85
	//   36   57:imul            
	//   37   58:bipush          85
	//   38   60:imul            
	//   39   61:aload           6
	//   40   63:iconst_1        
	//   41   64:iaload          
	//   42   65:bipush          85
	//   43   67:imul            
	//   44   68:bipush          85
	//   45   70:imul            
	//   46   71:bipush          85
	//   47   73:imul            
	//   48   74:iadd            
	//   49   75:ldc2            #378 <Int 0x95eed>
	//   50   78:iadd            
	//   51   79:sipush          7225
	//   52   82:iadd            
	//   53   83:bipush          85
	//   54   85:iadd            
	//   55   86:bipush          24
	//   56   88:ishr            
	//   57   89:int2byte        
	//   58   90:invokevirtual   #382 <Method void ByteArrayOutputStream.write(int)>
				else
	//*  59   93:aload           5
	//*  60   95:invokevirtual   #386 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//*  61   98:areturn         
	//*  62   99:iload_3         
	//*  63  100:invokestatic    #390 <Method boolean PRTokeniser.isWhitespace(int)>
	//*  64  103:ifeq            113
	//*  65  106:iload_2         
	//*  66  107:iconst_1        
	//*  67  108:iadd            
	//*  68  109:istore_2        
	//*  69  110:goto            18
	//*  70  113:iload_3         
	//*  71  114:bipush          122
	//*  72  116:icmpne          150
	//*  73  119:iload_1         
	//*  74  120:ifne            150
	//*  75  123:aload           5
	//*  76  125:iconst_0        
	//*  77  126:invokevirtual   #382 <Method void ByteArrayOutputStream.write(int)>
	//*  78  129:aload           5
	//*  79  131:iconst_0        
	//*  80  132:invokevirtual   #382 <Method void ByteArrayOutputStream.write(int)>
	//*  81  135:aload           5
	//*  82  137:iconst_0        
	//*  83  138:invokevirtual   #382 <Method void ByteArrayOutputStream.write(int)>
	//*  84  141:aload           5
	//*  85  143:iconst_0        
	//*  86  144:invokevirtual   #382 <Method void ByteArrayOutputStream.write(int)>
	//*  87  147:goto            106
	//*  88  150:iload_3         
	//*  89  151:bipush          33
	//*  90  153:icmplt          162
	//*  91  156:iload_3         
	//*  92  157:bipush          117
	//*  93  159:icmple          180
	//*  94  162:new             #392 <Class RuntimeException>
	//*  95  165:dup             
	//*  96  166:ldc2            #394 <String "illegal.character.in.ascii85decode">
	//*  97  169:iconst_0        
	//*  98  170:anewarray       Object[]
	//*  99  173:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//* 100  176:invokespecial   #402 <Method void RuntimeException(String)>
	//* 101  179:athrow          
	//* 102  180:aload           6
	//* 103  182:iload_1         
	//* 104  183:iload_3         
	//* 105  184:bipush          33
	//* 106  186:isub            
	//* 107  187:iastore         
	//* 108  188:iload_1         
	//* 109  189:iconst_1        
	//* 110  190:iadd            
	//* 111  191:istore_3        
	//* 112  192:iload_3         
	//* 113  193:istore_1        
	//* 114  194:iload_3         
	//* 115  195:iconst_5        
	//* 116  196:icmpne          106
	//* 117  199:iconst_0        
	//* 118  200:istore          4
	//* 119  202:iconst_0        
	//* 120  203:istore_3        
	//* 121  204:iconst_0        
	//* 122  205:istore_1        
	//* 123  206:iload_1         
	//* 124  207:iconst_5        
	//* 125  208:icmpge          228
	//* 126  211:iload_3         
	//* 127  212:bipush          85
	//* 128  214:imul            
	//* 129  215:aload           6
	//* 130  217:iload_1         
	//* 131  218:iaload          
	//* 132  219:iadd            
	//* 133  220:istore_3        
	//* 134  221:iload_1         
	//* 135  222:iconst_1        
	//* 136  223:iadd            
	//* 137  224:istore_1        
	//* 138  225:goto            206
	//* 139  228:aload           5
	//* 140  230:iload_3         
	//* 141  231:bipush          24
	//* 142  233:ishr            
	//* 143  234:int2byte        
	//* 144  235:invokevirtual   #382 <Method void ByteArrayOutputStream.write(int)>
	//* 145  238:aload           5
	//* 146  240:iload_3         
	//* 147  241:bipush          16
	//* 148  243:ishr            
	//* 149  244:int2byte        
	//* 150  245:invokevirtual   #382 <Method void ByteArrayOutputStream.write(int)>
	//* 151  248:aload           5
	//* 152  250:iload_3         
	//* 153  251:bipush          8
	//* 154  253:ishr            
	//* 155  254:int2byte        
	//* 156  255:invokevirtual   #382 <Method void ByteArrayOutputStream.write(int)>
	//* 157  258:aload           5
	//* 158  260:iload_3         
	//* 159  261:int2byte        
	//* 160  262:invokevirtual   #382 <Method void ByteArrayOutputStream.write(int)>
	//* 161  265:iload           4
	//* 162  267:istore_1        
	//* 163  268:goto            106
				if(i == 3)
	//* 164  271:iload_1         
	//* 165  272:iconst_3        
	//* 166  273:icmpne          348
				{
					i = ai[0] * 85 * 85 * 85 * 85 + ai[1] * 85 * 85 * 85 + ai[2] * 85 * 85 + 7225 + 85;
	//  167  276:aload           6
	//  168  278:iconst_0        
	//  169  279:iaload          
	//  170  280:bipush          85
	//  171  282:imul            
	//  172  283:bipush          85
	//  173  285:imul            
	//  174  286:bipush          85
	//  175  288:imul            
	//  176  289:bipush          85
	//  177  291:imul            
	//  178  292:aload           6
	//  179  294:iconst_1        
	//  180  295:iaload          
	//  181  296:bipush          85
	//  182  298:imul            
	//  183  299:bipush          85
	//  184  301:imul            
	//  185  302:bipush          85
	//  186  304:imul            
	//  187  305:iadd            
	//  188  306:aload           6
	//  189  308:iconst_2        
	//  190  309:iaload          
	//  191  310:bipush          85
	//  192  312:imul            
	//  193  313:bipush          85
	//  194  315:imul            
	//  195  316:iadd            
	//  196  317:sipush          7225
	//  197  320:iadd            
	//  198  321:bipush          85
	//  199  323:iadd            
	//  200  324:istore_1        
					bytearrayoutputstream.write(((int) ((byte)(i >> 24))));
	//  201  325:aload           5
	//  202  327:iload_1         
	//  203  328:bipush          24
	//  204  330:ishr            
	//  205  331:int2byte        
	//  206  332:invokevirtual   #382 <Method void ByteArrayOutputStream.write(int)>
					bytearrayoutputstream.write(((int) ((byte)(i >> 16))));
	//  207  335:aload           5
	//  208  337:iload_1         
	//  209  338:bipush          16
	//  210  340:ishr            
	//  211  341:int2byte        
	//  212  342:invokevirtual   #382 <Method void ByteArrayOutputStream.write(int)>
				} else
	//* 213  345:goto            93
				if(i == 4)
	//* 214  348:iload_1         
	//* 215  349:iconst_4        
	//* 216  350:icmpne          93
				{
					int j = ai[0] * 85 * 85 * 85 * 85 + ai[1] * 85 * 85 * 85 + ai[2] * 85 * 85 + ai[3] * 85 + 85;
	//  217  353:aload           6
	//  218  355:iconst_0        
	//  219  356:iaload          
	//  220  357:bipush          85
	//  221  359:imul            
	//  222  360:bipush          85
	//  223  362:imul            
	//  224  363:bipush          85
	//  225  365:imul            
	//  226  366:bipush          85
	//  227  368:imul            
	//  228  369:aload           6
	//  229  371:iconst_1        
	//  230  372:iaload          
	//  231  373:bipush          85
	//  232  375:imul            
	//  233  376:bipush          85
	//  234  378:imul            
	//  235  379:bipush          85
	//  236  381:imul            
	//  237  382:iadd            
	//  238  383:aload           6
	//  239  385:iconst_2        
	//  240  386:iaload          
	//  241  387:bipush          85
	//  242  389:imul            
	//  243  390:bipush          85
	//  244  392:imul            
	//  245  393:iadd            
	//  246  394:aload           6
	//  247  396:iconst_3        
	//  248  397:iaload          
	//  249  398:bipush          85
	//  250  400:imul            
	//  251  401:iadd            
	//  252  402:bipush          85
	//  253  404:iadd            
	//  254  405:istore_1        
					bytearrayoutputstream.write(((int) ((byte)(j >> 24))));
	//  255  406:aload           5
	//  256  408:iload_1         
	//  257  409:bipush          24
	//  258  411:ishr            
	//  259  412:int2byte        
	//  260  413:invokevirtual   #382 <Method void ByteArrayOutputStream.write(int)>
					bytearrayoutputstream.write(((int) ((byte)(j >> 16))));
	//  261  416:aload           5
	//  262  418:iload_1         
	//  263  419:bipush          16
	//  264  421:ishr            
	//  265  422:int2byte        
	//  266  423:invokevirtual   #382 <Method void ByteArrayOutputStream.write(int)>
					bytearrayoutputstream.write(((int) ((byte)(j >> 8))));
	//  267  426:aload           5
	//  268  428:iload_1         
	//  269  429:bipush          8
	//  270  431:ishr            
	//  271  432:int2byte        
	//  272  433:invokevirtual   #382 <Method void ByteArrayOutputStream.write(int)>
				}
				return bytearrayoutputstream.toByteArray();
			}
			if(!PRTokeniser.isWhitespace(l))
				if(l == 122 && i == 0)
				{
					bytearrayoutputstream.write(0);
					bytearrayoutputstream.write(0);
					bytearrayoutputstream.write(0);
					bytearrayoutputstream.write(0);
				} else
				{
					if(l < 33 || l > 117)
						throw new RuntimeException(MessageLocalization.getComposedMessage("illegal.character.in.ascii85decode", new Object[0]));
					ai[i] = l - 33;
					l = i + 1;
					i = l;
					if(l == 5)
					{
						flag = false;
						l = 0;
						for(i = 0; i < 5; i++)
							l = l * 85 + ai[i];

						bytearrayoutputstream.write(((int) ((byte)(l >> 24))));
						bytearrayoutputstream.write(((int) ((byte)(l >> 16))));
						bytearrayoutputstream.write(((int) ((byte)(l >> 8))));
						bytearrayoutputstream.write(((int) ((byte)l)));
						i = ((int) (flag));
					}
				}
			k++;
		} while(true);
	//* 273  436:goto            93
	}

	public static byte[] ASCIIHexDecode(byte abyte0[])
	{
		int i;
		boolean flag;
		int j;
		ByteArrayOutputStream bytearrayoutputstream;
		bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #376 <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #377 <Method void ByteArrayOutputStream()>
	//    3    7:astore          5
		flag = true;
	//    4    9:iconst_1        
	//    5   10:istore_2        
		i = 0;
	//    6   11:iconst_0        
	//    7   12:istore_1        
		j = 0;
	//    8   13:iconst_0        
	//    9   14:istore_3        
_L2:
		int k;
label0:
		{
			if(j < abyte0.length)
	//*  10   15:iload_3         
	//*  11   16:aload_0         
	//*  12   17:arraylength     
	//*  13   18:icmpge          37
			{
				k = abyte0[j] & 0xff;
	//   14   21:aload_0         
	//   15   22:iload_3         
	//   16   23:baload          
	//   17   24:sipush          255
	//   18   27:iand            
	//   19   28:istore          4
				if(k != 62)
					break label0;
	//   20   30:iload           4
	//   21   32:bipush          62
	//   22   34:icmpne          56
			}
			if(!flag)
	//*  23   37:iload_2         
	//*  24   38:ifne            50
				bytearrayoutputstream.write(((int) ((byte)(i << 4))));
	//   25   41:aload           5
	//   26   43:iload_1         
	//   27   44:iconst_4        
	//   28   45:ishl            
	//   29   46:int2byte        
	//   30   47:invokevirtual   #382 <Method void ByteArrayOutputStream.write(int)>
			return bytearrayoutputstream.toByteArray();
	//   31   50:aload           5
	//   32   52:invokevirtual   #386 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   33   55:areturn         
		}
		if(!PRTokeniser.isWhitespace(k))
			break; /* Loop/switch isn't completed */
	//   34   56:iload           4
	//   35   58:invokestatic    #390 <Method boolean PRTokeniser.isWhitespace(int)>
	//   36   61:ifeq            71
_L3:
		j++;
	//   37   64:iload_3         
	//   38   65:iconst_1        
	//   39   66:iadd            
	//   40   67:istore_3        
		if(true) goto _L2; else goto _L1
	//   41   68:goto            15
_L1:
		k = PRTokeniser.getHex(k);
	//   42   71:iload           4
	//   43   73:invokestatic    #407 <Method int PRTokeniser.getHex(int)>
	//   44   76:istore          4
		if(k == -1)
	//*  45   78:iload           4
	//*  46   80:iconst_m1       
	//*  47   81:icmpne          102
			throw new RuntimeException(MessageLocalization.getComposedMessage("illegal.character.in.asciihexdecode", new Object[0]));
	//   48   84:new             #392 <Class RuntimeException>
	//   49   87:dup             
	//   50   88:ldc2            #409 <String "illegal.character.in.asciihexdecode">
	//   51   91:iconst_0        
	//   52   92:anewarray       Object[]
	//   53   95:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   54   98:invokespecial   #402 <Method void RuntimeException(String)>
	//   55  101:athrow          
		if(flag)
	//*  56  102:iload_2         
	//*  57  103:ifeq            118
			i = k;
	//   58  106:iload           4
	//   59  108:istore_1        
		else
	//*  60  109:iload_2         
	//*  61  110:ifne            133
	//*  62  113:iconst_1        
	//*  63  114:istore_2        
	//*  64  115:goto            64
			bytearrayoutputstream.write(((int) ((byte)((i << 4) + k))));
	//   65  118:aload           5
	//   66  120:iload_1         
	//   67  121:iconst_4        
	//   68  122:ishl            
	//   69  123:iload           4
	//   70  125:iadd            
	//   71  126:int2byte        
	//   72  127:invokevirtual   #382 <Method void ByteArrayOutputStream.write(int)>
		if(!flag)
			flag = true;
		else
	//*  73  130:goto            109
			flag = false;
	//   74  133:iconst_0        
	//   75  134:istore_2        
		  goto _L3
		if(true) goto _L2; else goto _L4
_L4:
	//*  76  135:goto            115
	}

	public static byte[] FlateDecode(byte abyte0[])
	{
		byte abyte2[] = FlateDecode(abyte0, true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #413 <Method byte[] FlateDecode(byte[], boolean)>
	//    3    5:astore_2        
		byte abyte1[] = abyte2;
	//    4    6:aload_2         
	//    5    7:astore_1        
		if(abyte2 == null)
	//*   6    8:aload_2         
	//*   7    9:ifnonnull       18
			abyte1 = FlateDecode(abyte0, false);
	//    8   12:aload_0         
	//    9   13:iconst_0        
	//   10   14:invokestatic    #413 <Method byte[] FlateDecode(byte[], boolean)>
	//   11   17:astore_1        
		return abyte1;
	//   12   18:aload_1         
	//   13   19:areturn         
	}

	public static byte[] FlateDecode(byte abyte0[], boolean flag)
	{
		InflaterInputStream inflaterinputstream = new InflaterInputStream(((InputStream) (new ByteArrayInputStream(abyte0))));
	//    0    0:new             #417 <Class InflaterInputStream>
	//    1    3:dup             
	//    2    4:new             #419 <Class ByteArrayInputStream>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #421 <Method void ByteArrayInputStream(byte[])>
	//    6   12:invokespecial   #423 <Method void InflaterInputStream(InputStream)>
	//    7   15:astore_3        
		abyte0 = ((byte []) (new ByteArrayOutputStream()));
	//    8   16:new             #376 <Class ByteArrayOutputStream>
	//    9   19:dup             
	//   10   20:invokespecial   #377 <Method void ByteArrayOutputStream()>
	//   11   23:astore_0        
		int i;
		byte abyte1[];
		Exception exception;
		byte abyte2[];
		if(flag)
	//*  12   24:iload_1         
	//*  13   25:ifeq            86
			i = 4092;
	//   14   28:sipush          4092
	//   15   31:istore_2        
		else
	//*  16   32:iload_2         
	//*  17   33:newarray        byte[]
	//*  18   35:astore          4
	//*  19   37:aload_3         
	//*  20   38:aload           4
	//*  21   40:invokevirtual   #426 <Method int InflaterInputStream.read(byte[])>
	//*  22   43:istore_2        
	//*  23   44:iload_2         
	//*  24   45:iflt            59
	//*  25   48:aload_0         
	//*  26   49:aload           4
	//*  27   51:iconst_0        
	//*  28   52:iload_2         
	//*  29   53:invokevirtual   #429 <Method void ByteArrayOutputStream.write(byte[], int, int)>
	//*  30   56:goto            37
	//*  31   59:aload_3         
	//*  32   60:invokevirtual   #430 <Method void InflaterInputStream.close()>
	//*  33   63:aload_0         
	//*  34   64:invokevirtual   #431 <Method void ByteArrayOutputStream.close()>
	//*  35   67:aload_0         
	//*  36   68:invokevirtual   #386 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//*  37   71:astore_3        
	//*  38   72:aload_3         
	//*  39   73:areturn         
	//*  40   74:aload_0         
	//*  41   75:invokevirtual   #386 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//*  42   78:areturn         
	//*  43   79:astore_3        
	//*  44   80:iload_1         
	//*  45   81:ifeq            74
	//*  46   84:aconst_null     
	//*  47   85:areturn         
			i = 1;
	//   48   86:iconst_1        
	//   49   87:istore_2        
		abyte2 = new byte[i];
		{
			i = inflaterinputstream.read(abyte2);
			break MISSING_BLOCK_LABEL_44;
		}
		inflaterinputstream.close();
		((ByteArrayOutputStream) (abyte0)).close();
		abyte1 = ((ByteArrayOutputStream) (abyte0)).toByteArray();
		return abyte1;
		if(i < 0)
			break MISSING_BLOCK_LABEL_59;
		try
		{
			((ByteArrayOutputStream) (abyte0)).write(abyte2, 0, i);
			break MISSING_BLOCK_LABEL_37;
		}
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			if(flag)
				return null;
		}
		while(true) 
			return ((ByteArrayOutputStream) (abyte0)).toByteArray();
	//*  50   88:goto            32
	}

	public static byte[] LZWDecode(byte abyte0[])
	{
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #376 <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #377 <Method void ByteArrayOutputStream()>
	//    3    7:astore_1        
		(new LZWDecoder()).decode(abyte0, ((java.io.OutputStream) (bytearrayoutputstream)));
	//    4    8:new             #434 <Class LZWDecoder>
	//    5   11:dup             
	//    6   12:invokespecial   #435 <Method void LZWDecoder()>
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #439 <Method void LZWDecoder.decode(byte[], java.io.OutputStream)>
		return bytearrayoutputstream.toByteArray();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #386 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   12   24:areturn         
	}

	private void checkPRStreamLength(PRStream prstream)
		throws IOException
	{
		long l;
		long l1;
		long l2;
		byte abyte0[];
		long l3 = tokens.length();
	//    0    0:aload_0         
	//    1    1:getfield        #193 <Field PRTokeniser tokens>
	//    2    4:invokevirtual   #451 <Method long PRTokeniser.length()>
	//    3    7:lstore          10
		l2 = prstream.getOffset();
	//    4    9:aload_1         
	//    5   10:invokevirtual   #456 <Method long PRStream.getOffset()>
	//    6   13:lstore          8
		boolean flag1 = false;
	//    7   15:iconst_0        
	//    8   16:istore_3        
		l = 0L;
	//    9   17:lconst_0        
	//   10   18:lstore          4
		PdfObject pdfobject = getPdfObjectRelease(prstream.get(PdfName.LENGTH));
	//   11   20:aload_1         
	//   12   21:getstatic       #459 <Field PdfName PdfName.LENGTH>
	//   13   24:invokevirtual   #462 <Method PdfObject PRStream.get(PdfName)>
	//   14   27:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//   15   30:astore          12
		boolean flag;
		if(pdfobject != null && pdfobject.type() == 2)
	//*  16   32:aload           12
	//*  17   34:ifnull          316
	//*  18   37:aload           12
	//*  19   39:invokevirtual   #469 <Method int PdfObject.type()>
	//*  20   42:iconst_2        
	//*  21   43:icmpne          316
		{
			l1 = ((PdfNumber)pdfobject).intValue();
	//   22   46:aload           12
	//   23   48:checkcast       #471 <Class PdfNumber>
	//   24   51:invokevirtual   #474 <Method int PdfNumber.intValue()>
	//   25   54:i2l             
	//   26   55:lstore          6
			if(l1 + l2 > l3 - 20L)
	//*  27   57:lload           6
	//*  28   59:lload           8
	//*  29   61:ladd            
	//*  30   62:lload           10
	//*  31   64:ldc2w           #475 <Long 20L>
	//*  32   67:lsub            
	//*  33   68:lcmp            
	//*  34   69:ifle            217
			{
				flag = true;
	//   35   72:iconst_1        
	//   36   73:istore_2        
				l = l1;
	//   37   74:lload           6
	//   38   76:lstore          4
			} else
	//*  39   78:lload           4
	//*  40   80:lstore          6
	//*  41   82:iload_2         
	//*  42   83:ifeq            209
	//*  43   86:bipush          16
	//*  44   88:newarray        byte[]
	//*  45   90:astore          12
	//*  46   92:aload_0         
	//*  47   93:getfield        #193 <Field PRTokeniser tokens>
	//*  48   96:lload           8
	//*  49   98:invokevirtual   #479 <Method void PRTokeniser.seek(long)>
	//*  50  101:aload_0         
	//*  51  102:getfield        #193 <Field PRTokeniser tokens>
	//*  52  105:invokevirtual   #482 <Method long PRTokeniser.getFilePointer()>
	//*  53  108:lstore          6
	//*  54  110:aload_0         
	//*  55  111:getfield        #193 <Field PRTokeniser tokens>
	//*  56  114:aload           12
	//*  57  116:iconst_0        
	//*  58  117:invokevirtual   #486 <Method boolean PRTokeniser.readLineSegment(byte[], boolean)>
	//*  59  120:ifne            321
	//*  60  123:lload           6
	//*  61  125:lstore          8
	//*  62  127:aload_0         
	//*  63  128:getfield        #193 <Field PRTokeniser tokens>
	//*  64  131:lload           8
	//*  65  133:ldc2w           #487 <Long 2L>
	//*  66  136:lsub            
	//*  67  137:invokevirtual   #479 <Method void PRTokeniser.seek(long)>
	//*  68  140:lload           4
	//*  69  142:lstore          6
	//*  70  144:aload_0         
	//*  71  145:getfield        #193 <Field PRTokeniser tokens>
	//*  72  148:invokevirtual   #490 <Method int PRTokeniser.read()>
	//*  73  151:bipush          13
	//*  74  153:icmpne          162
	//*  75  156:lload           4
	//*  76  158:lconst_1        
	//*  77  159:lsub            
	//*  78  160:lstore          6
	//*  79  162:aload_0         
	//*  80  163:getfield        #193 <Field PRTokeniser tokens>
	//*  81  166:lload           8
	//*  82  168:lconst_1        
	//*  83  169:lsub            
	//*  84  170:invokevirtual   #479 <Method void PRTokeniser.seek(long)>
	//*  85  173:lload           6
	//*  86  175:lstore          4
	//*  87  177:aload_0         
	//*  88  178:getfield        #193 <Field PRTokeniser tokens>
	//*  89  181:invokevirtual   #490 <Method int PRTokeniser.read()>
	//*  90  184:bipush          10
	//*  91  186:icmpne          195
	//*  92  189:lload           6
	//*  93  191:lconst_1        
	//*  94  192:lsub            
	//*  95  193:lstore          4
	//*  96  195:lload           4
	//*  97  197:lstore          6
	//*  98  199:lload           4
	//*  99  201:lconst_0        
	//* 100  202:lcmp            
	//* 101  203:ifge            209
	//* 102  206:lconst_0        
	//* 103  207:lstore          6
	//* 104  209:aload_1         
	//* 105  210:lload           6
	//* 106  212:l2i             
	//* 107  213:invokevirtual   #493 <Method void PRStream.setLength(int)>
	//* 108  216:return          
			{
				tokens.seek(l2 + l1);
	//  109  217:aload_0         
	//  110  218:getfield        #193 <Field PRTokeniser tokens>
	//  111  221:lload           8
	//  112  223:lload           6
	//  113  225:ladd            
	//  114  226:invokevirtual   #479 <Method void PRTokeniser.seek(long)>
				abyte0 = ((byte []) (tokens.readString(20)));
	//  115  229:aload_0         
	//  116  230:getfield        #193 <Field PRTokeniser tokens>
	//  117  233:bipush          20
	//  118  235:invokevirtual   #497 <Method String PRTokeniser.readString(int)>
	//  119  238:astore          12
				flag = flag1;
	//  120  240:iload_3         
	//  121  241:istore_2        
				l = l1;
	//  122  242:lload           6
	//  123  244:lstore          4
				if(!((String) (abyte0)).startsWith("\nendstream"))
	//* 124  246:aload           12
	//* 125  248:ldc2            #499 <String "\nendstream">
	//* 126  251:invokevirtual   #505 <Method boolean String.startsWith(String)>
	//* 127  254:ifne            78
				{
					flag = flag1;
	//  128  257:iload_3         
	//  129  258:istore_2        
					l = l1;
	//  130  259:lload           6
	//  131  261:lstore          4
					if(!((String) (abyte0)).startsWith("\r\nendstream"))
	//* 132  263:aload           12
	//* 133  265:ldc2            #507 <String "\r\nendstream">
	//* 134  268:invokevirtual   #505 <Method boolean String.startsWith(String)>
	//* 135  271:ifne            78
					{
						flag = flag1;
	//  136  274:iload_3         
	//  137  275:istore_2        
						l = l1;
	//  138  276:lload           6
	//  139  278:lstore          4
						if(!((String) (abyte0)).startsWith("\rendstream"))
	//* 140  280:aload           12
	//* 141  282:ldc2            #509 <String "\rendstream">
	//* 142  285:invokevirtual   #505 <Method boolean String.startsWith(String)>
	//* 143  288:ifne            78
						{
							flag = flag1;
	//  144  291:iload_3         
	//  145  292:istore_2        
							l = l1;
	//  146  293:lload           6
	//  147  295:lstore          4
							if(!((String) (abyte0)).startsWith("endstream"))
	//* 148  297:aload           12
	//* 149  299:ldc1            #119 <String "endstream">
	//* 150  301:invokevirtual   #505 <Method boolean String.startsWith(String)>
	//* 151  304:ifne            78
							{
								flag = true;
	//  152  307:iconst_1        
	//  153  308:istore_2        
								l = l1;
	//  154  309:lload           6
	//  155  311:lstore          4
							}
						}
					}
				}
			}
		} else
	//* 156  313:goto            78
		{
			flag = true;
	//  157  316:iconst_1        
	//  158  317:istore_2        
		}
		l1 = l;
		if(!flag) goto _L2; else goto _L1
_L1:
		abyte0 = new byte[16];
		tokens.seek(l2);
_L4:
		l1 = tokens.getFilePointer();
		if(!tokens.readLineSegment(abyte0, false))
		{
			l2 = l1;
		} else
	//* 159  318:goto            78
		{
			if(!equalsn(abyte0, endstream))
				continue; /* Loop/switch isn't completed */
	//  160  321:aload           12
	//  161  323:getstatic       #127 <Field byte[] endstream>
	//  162  326:invokestatic    #513 <Method boolean equalsn(byte[], byte[])>
	//  163  329:ifeq            346
			l = l1 - l2;
	//  164  332:lload           6
	//  165  334:lload           8
	//  166  336:lsub            
	//  167  337:lstore          4
			l2 = l1;
	//  168  339:lload           6
	//  169  341:lstore          8
		}
_L5:
		tokens.seek(l2 - 2L);
		l1 = l;
		if(tokens.read() == 13)
			l1 = l - 1L;
		tokens.seek(l2 - 1L);
		l = l1;
		if(tokens.read() == 10)
			l = l1 - 1L;
		l1 = l;
		if(l < 0L)
			l1 = 0L;
_L2:
		prstream.setLength((int)l1);
		return;
	//* 170  343:goto            127
		if(!equalsn(abyte0, endobj)) goto _L4; else goto _L3
	//  171  346:aload           12
	//  172  348:getstatic       #130 <Field byte[] endobj>
	//  173  351:invokestatic    #513 <Method boolean equalsn(byte[], byte[])>
	//  174  354:ifeq            101
_L3:
		tokens.seek(l1 - 16L);
	//  175  357:aload_0         
	//  176  358:getfield        #193 <Field PRTokeniser tokens>
	//  177  361:lload           6
	//  178  363:ldc2w           #514 <Long 16L>
	//  179  366:lsub            
	//  180  367:invokevirtual   #479 <Method void PRTokeniser.seek(long)>
		int i = tokens.readString(16).indexOf("endstream");
	//  181  370:aload_0         
	//  182  371:getfield        #193 <Field PRTokeniser tokens>
	//  183  374:bipush          16
	//  184  376:invokevirtual   #497 <Method String PRTokeniser.readString(int)>
	//  185  379:ldc1            #119 <String "endstream">
	//  186  381:invokevirtual   #519 <Method int String.indexOf(String)>
	//  187  384:istore_2        
		l = l1;
	//  188  385:lload           6
	//  189  387:lstore          4
		if(i >= 0)
	//* 190  389:iload_2         
	//* 191  390:iflt            404
			l = (l1 - 16L) + (long)i;
	//  192  393:lload           6
	//  193  395:ldc2w           #514 <Long 16L>
	//  194  398:lsub            
	//  195  399:iload_2         
	//  196  400:i2l             
	//  197  401:ladd            
	//  198  402:lstore          4
		l1 = l - l2;
	//  199  404:lload           4
	//  200  406:lload           8
	//  201  408:lsub            
	//  202  409:lstore          6
		l2 = l;
	//  203  411:lload           4
	//  204  413:lstore          8
		l = l1;
	//  205  415:lload           6
	//  206  417:lstore          4
		  goto _L5
		if(true) goto _L4; else goto _L6
_L6:
	//* 207  419:goto            127
	}

	private boolean convertNamedDestination(PdfObject pdfobject, HashMap hashmap)
	{
		int i;
		PdfObject pdfobject2;
		pdfobject2 = getPdfObject(pdfobject);
	//    0    0:aload_1         
	//    1    1:invokestatic    #524 <Method PdfObject getPdfObject(PdfObject)>
	//    2    4:astore          6
		i = lastXrefPartial;
	//    3    6:aload_0         
	//    4    7:getfield        #178 <Field int lastXrefPartial>
	//    5   10:istore_3        
		releaseLastXrefPartial();
	//    6   11:aload_0         
	//    7   12:invokevirtual   #527 <Method void releaseLastXrefPartial()>
		if(pdfobject2 == null || !pdfobject2.isDictionary()) goto _L2; else goto _L1
	//    8   15:aload           6
	//    9   17:ifnull          194
	//   10   20:aload           6
	//   11   22:invokevirtual   #531 <Method boolean PdfObject.isDictionary()>
	//   12   25:ifeq            194
_L1:
		PdfObject pdfobject3 = getPdfObject(((PdfDictionary)pdfobject2).get(PdfName.A));
	//   13   28:aload           6
	//   14   30:checkcast       #281 <Class PdfDictionary>
	//   15   33:getstatic       #534 <Field PdfName PdfName.A>
	//   16   36:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   17   39:invokestatic    #524 <Method PdfObject getPdfObject(PdfObject)>
	//   18   42:astore          7
		if(pdfobject3 == null) goto _L2; else goto _L3
	//   19   44:aload           7
	//   20   46:ifnull          194
_L3:
		int j;
		PdfDictionary pdfdictionary;
		j = lastXrefPartial;
	//   21   49:aload_0         
	//   22   50:getfield        #178 <Field int lastXrefPartial>
	//   23   53:istore          4
		releaseLastXrefPartial();
	//   24   55:aload_0         
	//   25   56:invokevirtual   #527 <Method void releaseLastXrefPartial()>
		pdfdictionary = (PdfDictionary)pdfobject3;
	//   26   59:aload           7
	//   27   61:checkcast       #281 <Class PdfDictionary>
	//   28   64:astore          8
		pdfobject = ((PdfObject) ((PdfName)getPdfObjectRelease(pdfdictionary.get(PdfName.S))));
	//   29   66:aload           8
	//   30   68:getstatic       #538 <Field PdfName PdfName.S>
	//   31   71:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   32   74:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//   33   77:checkcast       #103 <Class PdfName>
	//   34   80:astore_1        
		if(!PdfName.GOTOR.equals(((Object) (pdfobject)))) goto _L2; else goto _L4
	//   35   81:getstatic       #541 <Field PdfName PdfName.GOTOR>
	//   36   84:aload_1         
	//   37   85:invokevirtual   #545 <Method boolean PdfName.equals(Object)>
	//   38   88:ifeq            194
_L4:
		PdfObject pdfobject1;
		pdfobject1 = getPdfObjectRelease(pdfdictionary.get(PdfName.D));
	//   39   91:aload           8
	//   40   93:getstatic       #548 <Field PdfName PdfName.D>
	//   41   96:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   42   99:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//   43  102:astore          5
		pdfobject = null;
	//   44  104:aconst_null     
	//   45  105:astore_1        
		if(pdfobject1 == null) goto _L2; else goto _L5
	//   46  106:aload           5
	//   47  108:ifnull          194
_L5:
		if(!pdfobject1.isName()) goto _L7; else goto _L6
	//   48  111:aload           5
	//   49  113:invokevirtual   #551 <Method boolean PdfObject.isName()>
	//   50  116:ifeq            177
_L6:
		pdfobject = pdfobject1;
	//   51  119:aload           5
	//   52  121:astore_1        
_L8:
		if((PdfArray)hashmap.get(((Object) (pdfobject))) != null)
	//*  53  122:aload_2         
	//*  54  123:aload_1         
	//*  55  124:invokevirtual   #556 <Method Object HashMap.get(Object)>
	//*  56  127:checkcast       #558 <Class PdfArray>
	//*  57  130:ifnull          194
		{
			pdfdictionary.remove(PdfName.F);
	//   58  133:aload           8
	//   59  135:getstatic       #561 <Field PdfName PdfName.F>
	//   60  138:invokevirtual   #565 <Method void PdfDictionary.remove(PdfName)>
			pdfdictionary.remove(PdfName.NEWWINDOW);
	//   61  141:aload           8
	//   62  143:getstatic       #568 <Field PdfName PdfName.NEWWINDOW>
	//   63  146:invokevirtual   #565 <Method void PdfDictionary.remove(PdfName)>
			pdfdictionary.put(PdfName.S, ((PdfObject) (PdfName.GOTO)));
	//   64  149:aload           8
	//   65  151:getstatic       #538 <Field PdfName PdfName.S>
	//   66  154:getstatic       #571 <Field PdfName PdfName.GOTO>
	//   67  157:invokevirtual   #575 <Method void PdfDictionary.put(PdfName, PdfObject)>
			setXrefPartialObject(j, pdfobject3);
	//   68  160:aload_0         
	//   69  161:iload           4
	//   70  163:aload           7
	//   71  165:invokespecial   #579 <Method void setXrefPartialObject(int, PdfObject)>
			setXrefPartialObject(i, pdfobject2);
	//   72  168:aload_0         
	//   73  169:iload_3         
	//   74  170:aload           6
	//   75  172:invokespecial   #579 <Method void setXrefPartialObject(int, PdfObject)>
			return true;
	//   76  175:iconst_1        
	//   77  176:ireturn         
		}
		break; /* Loop/switch isn't completed */
_L7:
		if(pdfobject1.isString())
	//*  78  177:aload           5
	//*  79  179:invokevirtual   #582 <Method boolean PdfObject.isString()>
	//*  80  182:ifeq            122
			pdfobject = ((PdfObject) (pdfobject1.toString()));
	//   81  185:aload           5
	//   82  187:invokevirtual   #586 <Method String PdfObject.toString()>
	//   83  190:astore_1        
		if(true) goto _L8; else goto _L2
	//   84  191:goto            122
_L2:
		return false;
	//   85  194:iconst_0        
	//   86  195:ireturn         
	}

	public static byte[] decodeBytes(byte abyte0[], PdfDictionary pdfdictionary)
		throws IOException
	{
		return decodeBytes(abyte0, pdfdictionary, FilterHandlers.getDefaultFilterHandlers());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #596 <Method Map FilterHandlers.getDefaultFilterHandlers()>
	//    3    5:invokestatic    #599 <Method byte[] decodeBytes(byte[], PdfDictionary, Map)>
	//    4    8:areturn         
	}

	public static byte[] decodeBytes(byte abyte0[], PdfDictionary pdfdictionary, Map map)
		throws IOException
	{
		Object obj;
		Object obj1;
		byte abyte1[];
		abyte1 = ((byte []) (getPdfObjectRelease(pdfdictionary.get(PdfName.FILTER))));
	//    0    0:aload_1         
	//    1    1:getstatic       #602 <Field PdfName PdfName.FILTER>
	//    2    4:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//    3    7:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//    4   10:astore          6
		obj1 = ((Object) (new ArrayList()));
	//    5   12:new             #167 <Class ArrayList>
	//    6   15:dup             
	//    7   16:invokespecial   #168 <Method void ArrayList()>
	//    8   19:astore          5
		obj = obj1;
	//    9   21:aload           5
	//   10   23:astore          4
		if(abyte1 == null) goto _L2; else goto _L1
	//   11   25:aload           6
	//   12   27:ifnull          50
_L1:
		if(!((PdfObject) (abyte1)).isName()) goto _L4; else goto _L3
	//   13   30:aload           6
	//   14   32:invokevirtual   #551 <Method boolean PdfObject.isName()>
	//   15   35:ifeq            207
_L3:
		((ArrayList) (obj1)).add(((Object) (abyte1)));
	//   16   38:aload           5
	//   17   40:aload           6
	//   18   42:invokevirtual   #605 <Method boolean ArrayList.add(Object)>
	//   19   45:pop             
		obj = obj1;
	//   20   46:aload           5
	//   21   48:astore          4
_L2:
		int i;
		Object obj2;
		FilterHandlers.FilterHandler filterhandler;
label0:
		{
			obj2 = ((Object) (new ArrayList()));
	//   22   50:new             #167 <Class ArrayList>
	//   23   53:dup             
	//   24   54:invokespecial   #168 <Method void ArrayList()>
	//   25   57:astore          7
			obj1 = ((Object) (getPdfObjectRelease(pdfdictionary.get(PdfName.DECODEPARMS))));
	//   26   59:aload_1         
	//   27   60:getstatic       #608 <Field PdfName PdfName.DECODEPARMS>
	//   28   63:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   29   66:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//   30   69:astore          5
			if(obj1 != null)
	//*  31   71:aload           5
	//*  32   73:ifnull          100
			{
				abyte1 = ((byte []) (obj1));
	//   33   76:aload           5
	//   34   78:astore          6
				if(((PdfObject) (obj1)).isDictionary())
					break label0;
	//   35   80:aload           5
	//   36   82:invokevirtual   #531 <Method boolean PdfObject.isDictionary()>
	//   37   85:ifne            112
				abyte1 = ((byte []) (obj1));
	//   38   88:aload           5
	//   39   90:astore          6
				if(((PdfObject) (obj1)).isArray())
					break label0;
	//   40   92:aload           5
	//   41   94:invokevirtual   #611 <Method boolean PdfObject.isArray()>
	//   42   97:ifne            112
			}
			abyte1 = ((byte []) (getPdfObjectRelease(pdfdictionary.get(PdfName.DP))));
	//   43  100:aload_1         
	//   44  101:getstatic       #614 <Field PdfName PdfName.DP>
	//   45  104:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   46  107:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//   47  110:astore          6
		}
		obj1 = obj2;
	//   48  112:aload           7
	//   49  114:astore          5
		if(abyte1 != null)
	//*  50  116:aload           6
	//*  51  118:ifnull          141
			if(((PdfObject) (abyte1)).isDictionary())
	//*  52  121:aload           6
	//*  53  123:invokevirtual   #531 <Method boolean PdfObject.isDictionary()>
	//*  54  126:ifeq            232
			{
				((ArrayList) (obj2)).add(((Object) (abyte1)));
	//   55  129:aload           7
	//   56  131:aload           6
	//   57  133:invokevirtual   #605 <Method boolean ArrayList.add(Object)>
	//   58  136:pop             
				obj1 = obj2;
	//   59  137:aload           7
	//   60  139:astore          5
			} else
	//*  61  141:iconst_0        
	//*  62  142:istore_3        
	//*  63  143:aload_0         
	//*  64  144:astore          6
	//*  65  146:iload_3         
	//*  66  147:aload           4
	//*  67  149:invokevirtual   #258 <Method int ArrayList.size()>
	//*  68  152:icmpge          388
	//*  69  155:aload           4
	//*  70  157:iload_3         
	//*  71  158:invokevirtual   #262 <Method Object ArrayList.get(int)>
	//*  72  161:checkcast       #103 <Class PdfName>
	//*  73  164:astore          7
	//*  74  166:aload_2         
	//*  75  167:aload           7
	//*  76  169:invokeinterface #617 <Method Object Map.get(Object)>
	//*  77  174:checkcast       #619 <Class FilterHandlers$FilterHandler>
	//*  78  177:astore          8
	//*  79  179:aload           8
	//*  80  181:ifnonnull       257
	//*  81  184:new             #621 <Class UnsupportedPdfException>
	//*  82  187:dup             
	//*  83  188:ldc2            #623 <String "the.filter.1.is.not.supported">
	//*  84  191:iconst_1        
	//*  85  192:anewarray       Object[]
	//*  86  195:dup             
	//*  87  196:iconst_0        
	//*  88  197:aload           7
	//*  89  199:aastore         
	//*  90  200:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//*  91  203:invokespecial   #624 <Method void UnsupportedPdfException(String)>
	//*  92  206:athrow          
	//*  93  207:aload           5
	//*  94  209:astore          4
	//*  95  211:aload           6
	//*  96  213:invokevirtual   #611 <Method boolean PdfObject.isArray()>
	//*  97  216:ifeq            50
	//*  98  219:aload           6
	//*  99  221:checkcast       #558 <Class PdfArray>
	//* 100  224:invokevirtual   #628 <Method ArrayList PdfArray.getArrayList()>
	//* 101  227:astore          4
	//* 102  229:goto            50
			{
				obj1 = obj2;
	//  103  232:aload           7
	//  104  234:astore          5
				if(((PdfObject) (abyte1)).isArray())
	//* 105  236:aload           6
	//* 106  238:invokevirtual   #611 <Method boolean PdfObject.isArray()>
	//* 107  241:ifeq            141
					obj1 = ((Object) (((PdfArray)abyte1).getArrayList()));
	//  108  244:aload           6
	//  109  246:checkcast       #558 <Class PdfArray>
	//  110  249:invokevirtual   #628 <Method ArrayList PdfArray.getArrayList()>
	//  111  252:astore          5
			}
		i = 0;
		abyte1 = abyte0;
_L6:
		if(i >= ((ArrayList) (obj)).size())
			break; /* Loop/switch isn't completed */
		obj2 = ((Object) ((PdfName)((ArrayList) (obj)).get(i)));
		filterhandler = (FilterHandlers.FilterHandler)map.get(obj2);
		if(filterhandler == null)
			throw new UnsupportedPdfException(MessageLocalization.getComposedMessage("the.filter.1.is.not.supported", new Object[] {
				obj2
			}));
	//* 112  254:goto            141
		if(i < ((ArrayList) (obj1)).size())
	//* 113  257:iload_3         
	//* 114  258:aload           5
	//* 115  260:invokevirtual   #258 <Method int ArrayList.size()>
	//* 116  263:icmpge          383
		{
			abyte0 = ((byte []) (getPdfObject((PdfObject)((ArrayList) (obj1)).get(i))));
	//  117  266:aload           5
	//  118  268:iload_3         
	//  119  269:invokevirtual   #262 <Method Object ArrayList.get(int)>
	//  120  272:checkcast       #264 <Class PdfObject>
	//  121  275:invokestatic    #524 <Method PdfObject getPdfObject(PdfObject)>
	//  122  278:astore_0        
			if(abyte0 instanceof PdfDictionary)
	//* 123  279:aload_0         
	//* 124  280:instanceof      #281 <Class PdfDictionary>
	//* 125  283:ifeq            313
				abyte0 = ((byte []) ((PdfDictionary)abyte0));
	//  126  286:aload_0         
	//  127  287:checkcast       #281 <Class PdfDictionary>
	//  128  290:astore_0        
			else
	//* 129  291:aload           8
	//* 130  293:aload           6
	//* 131  295:aload           7
	//* 132  297:aload_0         
	//* 133  298:aload_1         
	//* 134  299:invokeinterface #631 <Method byte[] FilterHandlers$FilterHandler.decode(byte[], PdfName, PdfObject, PdfDictionary)>
	//* 135  304:astore          6
	//* 136  306:iload_3         
	//* 137  307:iconst_1        
	//* 138  308:iadd            
	//* 139  309:istore_3        
	//* 140  310:goto            146
			if(abyte0 == null || (abyte0 instanceof PdfNull) || (abyte0 instanceof PdfLiteral) && Arrays.equals("null".getBytes(), ((PdfLiteral)abyte0).getBytes()))
	//* 141  313:aload_0         
	//* 142  314:ifnull          350
	//* 143  317:aload_0         
	//* 144  318:instanceof      #633 <Class PdfNull>
	//* 145  321:ifne            350
	//* 146  324:aload_0         
	//* 147  325:instanceof      #635 <Class PdfLiteral>
	//* 148  328:ifeq            355
	//* 149  331:ldc2            #637 <String "null">
	//* 150  334:invokevirtual   #640 <Method byte[] String.getBytes()>
	//* 151  337:aload_0         
	//* 152  338:checkcast       #635 <Class PdfLiteral>
	//* 153  341:invokevirtual   #641 <Method byte[] PdfLiteral.getBytes()>
	//* 154  344:invokestatic    #645 <Method boolean Arrays.equals(byte[], byte[])>
	//* 155  347:ifeq            355
				abyte0 = null;
	//  156  350:aconst_null     
	//  157  351:astore_0        
			else
	//* 158  352:goto            291
				throw new UnsupportedPdfException(MessageLocalization.getComposedMessage("the.decode.parameter.type.1.is.not.supported", new Object[] {
					((Object) (abyte0)).getClass().toString()
				}));
	//  159  355:new             #621 <Class UnsupportedPdfException>
	//  160  358:dup             
	//  161  359:ldc2            #647 <String "the.decode.parameter.type.1.is.not.supported">
	//  162  362:iconst_1        
	//  163  363:anewarray       Object[]
	//  164  366:dup             
	//  165  367:iconst_0        
	//  166  368:aload_0         
	//  167  369:invokevirtual   #651 <Method Class Object.getClass()>
	//  168  372:invokevirtual   #654 <Method String Class.toString()>
	//  169  375:aastore         
	//  170  376:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  171  379:invokespecial   #624 <Method void UnsupportedPdfException(String)>
	//  172  382:athrow          
		} else
		{
			abyte0 = null;
	//  173  383:aconst_null     
	//  174  384:astore_0        
		}
		abyte1 = filterhandler.decode(abyte1, ((PdfName) (obj2)), ((PdfObject) (abyte0)), pdfdictionary);
		i++;
		continue; /* Loop/switch isn't completed */
	//  175  385:goto            291
_L4:
		obj = obj1;
		if(((PdfObject) (abyte1)).isArray())
			obj = ((Object) (((PdfArray)abyte1).getArrayList()));
		continue; /* Loop/switch isn't completed */
		if(true) goto _L6; else goto _L5
_L5:
		return abyte1;
	//  176  388:aload           6
	//  177  390:areturn         
		if(true) goto _L2; else goto _L7
_L7:
	}

	public static byte[] decodePredictor(byte abyte0[], PdfObject pdfobject)
	{
		if(pdfobject != null && pdfobject.isDictionary()) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnull          11
	//    2    4:aload_1         
	//    3    5:invokevirtual   #531 <Method boolean PdfObject.isDictionary()>
	//    4    8:ifne            13
_L1:
		return abyte0;
	//    5   11:aload_0         
	//    6   12:areturn         
_L2:
		int i;
		int j3;
		Object obj;
		ByteArrayOutputStream bytearrayoutputstream;
		DataInputStream datainputstream;
		pdfobject = ((PdfObject) ((PdfDictionary)pdfobject));
	//    7   13:aload_1         
	//    8   14:checkcast       #281 <Class PdfDictionary>
	//    9   17:astore_1        
		obj = ((Object) (getPdfObject(((PdfDictionary) (pdfobject)).get(PdfName.PREDICTOR))));
	//   10   18:aload_1         
	//   11   19:getstatic       #660 <Field PdfName PdfName.PREDICTOR>
	//   12   22:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   13   25:invokestatic    #524 <Method PdfObject getPdfObject(PdfObject)>
	//   14   28:astore          11
		if(obj == null || !((PdfObject) (obj)).isNumber())
			continue; /* Loop/switch isn't completed */
	//   15   30:aload           11
	//   16   32:ifnull          11
	//   17   35:aload           11
	//   18   37:invokevirtual   #663 <Method boolean PdfObject.isNumber()>
	//   19   40:ifeq            11
		int k2 = ((PdfNumber)obj).intValue();
	//   20   43:aload           11
	//   21   45:checkcast       #471 <Class PdfNumber>
	//   22   48:invokevirtual   #474 <Method int PdfNumber.intValue()>
	//   23   51:istore          6
		if(k2 < 10 && k2 != 2)
			continue; /* Loop/switch isn't completed */
	//   24   53:iload           6
	//   25   55:bipush          10
	//   26   57:icmpge          66
	//   27   60:iload           6
	//   28   62:iconst_2        
	//   29   63:icmpne          11
		i = 1;
	//   30   66:iconst_1        
	//   31   67:istore_2        
		obj = ((Object) (getPdfObject(((PdfDictionary) (pdfobject)).get(PdfName.COLUMNS))));
	//   32   68:aload_1         
	//   33   69:getstatic       #666 <Field PdfName PdfName.COLUMNS>
	//   34   72:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   35   75:invokestatic    #524 <Method PdfObject getPdfObject(PdfObject)>
	//   36   78:astore          11
		int j = i;
	//   37   80:iload_2         
	//   38   81:istore_3        
		if(obj != null)
	//*  39   82:aload           11
	//*  40   84:ifnull          106
		{
			j = i;
	//   41   87:iload_2         
	//   42   88:istore_3        
			if(((PdfObject) (obj)).isNumber())
	//*  43   89:aload           11
	//*  44   91:invokevirtual   #663 <Method boolean PdfObject.isNumber()>
	//*  45   94:ifeq            106
				j = ((PdfNumber)obj).intValue();
	//   46   97:aload           11
	//   47   99:checkcast       #471 <Class PdfNumber>
	//   48  102:invokevirtual   #474 <Method int PdfNumber.intValue()>
	//   49  105:istore_3        
		}
		i = 1;
	//   50  106:iconst_1        
	//   51  107:istore_2        
		obj = ((Object) (getPdfObject(((PdfDictionary) (pdfobject)).get(PdfName.COLORS))));
	//   52  108:aload_1         
	//   53  109:getstatic       #669 <Field PdfName PdfName.COLORS>
	//   54  112:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   55  115:invokestatic    #524 <Method PdfObject getPdfObject(PdfObject)>
	//   56  118:astore          11
		int i1 = i;
	//   57  120:iload_2         
	//   58  121:istore          4
		if(obj != null)
	//*  59  123:aload           11
	//*  60  125:ifnull          149
		{
			i1 = i;
	//   61  128:iload_2         
	//   62  129:istore          4
			if(((PdfObject) (obj)).isNumber())
	//*  63  131:aload           11
	//*  64  133:invokevirtual   #663 <Method boolean PdfObject.isNumber()>
	//*  65  136:ifeq            149
				i1 = ((PdfNumber)obj).intValue();
	//   66  139:aload           11
	//   67  141:checkcast       #471 <Class PdfNumber>
	//   68  144:invokevirtual   #474 <Method int PdfNumber.intValue()>
	//   69  147:istore          4
		}
		i = 8;
	//   70  149:bipush          8
	//   71  151:istore_2        
		pdfobject = getPdfObject(((PdfDictionary) (pdfobject)).get(PdfName.BITSPERCOMPONENT));
	//   72  152:aload_1         
	//   73  153:getstatic       #672 <Field PdfName PdfName.BITSPERCOMPONENT>
	//   74  156:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   75  159:invokestatic    #524 <Method PdfObject getPdfObject(PdfObject)>
	//   76  162:astore_1        
		int l1 = i;
	//   77  163:iload_2         
	//   78  164:istore          5
		if(pdfobject != null)
	//*  79  166:aload_1         
	//*  80  167:ifnull          189
		{
			l1 = i;
	//   81  170:iload_2         
	//   82  171:istore          5
			if(pdfobject.isNumber())
	//*  83  173:aload_1         
	//*  84  174:invokevirtual   #663 <Method boolean PdfObject.isNumber()>
	//*  85  177:ifeq            189
				l1 = ((PdfNumber)pdfobject).intValue();
	//   86  180:aload_1         
	//   87  181:checkcast       #471 <Class PdfNumber>
	//   88  184:invokevirtual   #474 <Method int PdfNumber.intValue()>
	//   89  187:istore          5
		}
		datainputstream = new DataInputStream(((InputStream) (new ByteArrayInputStream(abyte0))));
	//   90  189:new             #674 <Class DataInputStream>
	//   91  192:dup             
	//   92  193:new             #419 <Class ByteArrayInputStream>
	//   93  196:dup             
	//   94  197:aload_0         
	//   95  198:invokespecial   #421 <Method void ByteArrayInputStream(byte[])>
	//   96  201:invokespecial   #675 <Method void DataInputStream(InputStream)>
	//   97  204:astore          13
		bytearrayoutputstream = new ByteArrayOutputStream(abyte0.length);
	//   98  206:new             #376 <Class ByteArrayOutputStream>
	//   99  209:dup             
	//  100  210:aload_0         
	//  101  211:arraylength     
	//  102  212:invokespecial   #677 <Method void ByteArrayOutputStream(int)>
	//  103  215:astore          12
		i = (i1 * l1) / 8;
	//  104  217:iload           4
	//  105  219:iload           5
	//  106  221:imul            
	//  107  222:bipush          8
	//  108  224:idiv            
	//  109  225:istore_2        
		j3 = (i1 * j * l1 + 7) / 8;
	//  110  226:iload           4
	//  111  228:iload_3         
	//  112  229:imul            
	//  113  230:iload           5
	//  114  232:imul            
	//  115  233:bipush          7
	//  116  235:iadd            
	//  117  236:bipush          8
	//  118  238:idiv            
	//  119  239:istore          7
		pdfobject = ((PdfObject) (new byte[j3]));
	//  120  241:iload           7
	//  121  243:newarray        byte[]
	//  122  245:astore_1        
		obj = ((Object) (new byte[j3]));
	//  123  246:iload           7
	//  124  248:newarray        byte[]
	//  125  250:astore          11
		if(k2 != 2)
			break; /* Loop/switch isn't completed */
	//  126  252:iload           6
	//  127  254:iconst_2        
	//  128  255:icmpne          353
		if(l1 == 8)
	//* 129  258:iload           5
	//* 130  260:bipush          8
	//* 131  262:icmpne          11
		{
			int i2 = abyte0.length / j3;
	//  132  265:aload_0         
	//  133  266:arraylength     
	//  134  267:iload           7
	//  135  269:idiv            
	//  136  270:istore          5
			int k = 0;
	//  137  272:iconst_0        
	//  138  273:istore_3        
			while(k < i2) 
	//* 139  274:iload_3         
	//* 140  275:iload           5
	//* 141  277:icmpge          11
			{
				int l2 = k * j3;
	//  142  280:iload_3         
	//  143  281:iload           7
	//  144  283:imul            
	//  145  284:istore          6
				for(int j1 = i + 0; j1 < j3; j1++)
	//* 146  286:iload_2         
	//* 147  287:iconst_0        
	//* 148  288:iadd            
	//* 149  289:istore          4
	//* 150  291:iload           4
	//* 151  293:iload           7
	//* 152  295:icmpge          332
					abyte0[l2 + j1] = (byte)(abyte0[l2 + j1] + abyte0[(l2 + j1) - i]);
	//  153  298:aload_0         
	//  154  299:iload           6
	//  155  301:iload           4
	//  156  303:iadd            
	//  157  304:aload_0         
	//  158  305:iload           6
	//  159  307:iload           4
	//  160  309:iadd            
	//  161  310:baload          
	//  162  311:aload_0         
	//  163  312:iload           6
	//  164  314:iload           4
	//  165  316:iadd            
	//  166  317:iload_2         
	//  167  318:isub            
	//  168  319:baload          
	//  169  320:iadd            
	//  170  321:int2byte        
	//  171  322:bastore         

	//  172  323:iload           4
	//  173  325:iconst_1        
	//  174  326:iadd            
	//  175  327:istore          4
	//* 176  329:goto            291
				k++;
	//  177  332:iload_3         
	//  178  333:iconst_1        
	//  179  334:iadd            
	//  180  335:istore_3        
			}
		}
		if(true) goto _L1; else goto _L3
	//  181  336:goto            274
_L5:
		int l;
		int k1;
		int j2;
		int i3;
		int k3;
		int l3;
		int i4;
		try
		{
			bytearrayoutputstream.write(((byte []) (pdfobject)));
	//  182  339:aload           12
	//  183  341:aload_1         
	//  184  342:invokevirtual   #679 <Method void ByteArrayOutputStream.write(byte[])>
		}
	//* 185  345:aload           11
	//* 186  347:astore_0        
	//* 187  348:aload_1         
	//* 188  349:astore          11
	//* 189  351:aload_0         
	//* 190  352:astore_1        
	//* 191  353:aload           13
	//* 192  355:invokevirtual   #680 <Method int DataInputStream.read()>
	//* 193  358:istore_3        
	//* 194  359:iload_3         
	//* 195  360:ifge            369
	//* 196  363:aload           12
	//* 197  365:invokevirtual   #386 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//* 198  368:areturn         
	//* 199  369:aload           13
	//* 200  371:aload_1         
	//* 201  372:iconst_0        
	//* 202  373:iload           7
	//* 203  375:invokevirtual   #683 <Method void DataInputStream.readFully(byte[], int, int)>
	//* 204  378:iload_3         
	//* 205  379:tableswitch     0 4: default 412
	//	               0 339
	//	               1 437
	//	               2 465
	//	               3 492
	//	               4 563
	//* 206  412:new             #392 <Class RuntimeException>
	//* 207  415:dup             
	//* 208  416:ldc2            #685 <String "png.filter.unknown">
	//* 209  419:iconst_0        
	//* 210  420:anewarray       Object[]
	//* 211  423:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//* 212  426:invokespecial   #402 <Method void RuntimeException(String)>
	//* 213  429:athrow          
	//* 214  430:astore_0        
	//* 215  431:aload           12
	//* 216  433:invokevirtual   #386 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//* 217  436:areturn         
	//* 218  437:iload_2         
	//* 219  438:istore_3        
	//* 220  439:iload_3         
	//* 221  440:iload           7
	//* 222  442:icmpge          339
	//* 223  445:aload_1         
	//* 224  446:iload_3         
	//* 225  447:aload_1         
	//* 226  448:iload_3         
	//* 227  449:baload          
	//* 228  450:aload_1         
	//* 229  451:iload_3         
	//* 230  452:iload_2         
	//* 231  453:isub            
	//* 232  454:baload          
	//* 233  455:iadd            
	//* 234  456:int2byte        
	//* 235  457:bastore         
	//* 236  458:iload_3         
	//* 237  459:iconst_1        
	//* 238  460:iadd            
	//* 239  461:istore_3        
	//* 240  462:goto            439
	//* 241  465:iconst_0        
	//* 242  466:istore_3        
	//* 243  467:iload_3         
	//* 244  468:iload           7
	//* 245  470:icmpge          339
	//* 246  473:aload_1         
	//* 247  474:iload_3         
	//* 248  475:aload_1         
	//* 249  476:iload_3         
	//* 250  477:baload          
	//* 251  478:aload           11
	//* 252  480:iload_3         
	//* 253  481:baload          
	//* 254  482:iadd            
	//* 255  483:int2byte        
	//* 256  484:bastore         
	//* 257  485:iload_3         
	//* 258  486:iconst_1        
	//* 259  487:iadd            
	//* 260  488:istore_3        
	//* 261  489:goto            467
	//* 262  492:iconst_0        
	//* 263  493:istore_3        
	//* 264  494:iload_3         
	//* 265  495:iload_2         
	//* 266  496:icmpge          520
	//* 267  499:aload_1         
	//* 268  500:iload_3         
	//* 269  501:aload_1         
	//* 270  502:iload_3         
	//* 271  503:baload          
	//* 272  504:aload           11
	//* 273  506:iload_3         
	//* 274  507:baload          
	//* 275  508:iconst_2        
	//* 276  509:idiv            
	//* 277  510:iadd            
	//* 278  511:int2byte        
	//* 279  512:bastore         
	//* 280  513:iload_3         
	//* 281  514:iconst_1        
	//* 282  515:iadd            
	//* 283  516:istore_3        
	//* 284  517:goto            494
	//* 285  520:iload_2         
	//* 286  521:istore_3        
	//* 287  522:iload_3         
	//* 288  523:iload           7
	//* 289  525:icmpge          339
	//* 290  528:aload_1         
	//* 291  529:iload_3         
	//* 292  530:aload_1         
	//* 293  531:iload_3         
	//* 294  532:baload          
	//* 295  533:aload_1         
	//* 296  534:iload_3         
	//* 297  535:iload_2         
	//* 298  536:isub            
	//* 299  537:baload          
	//* 300  538:sipush          255
	//* 301  541:iand            
	//* 302  542:aload           11
	//* 303  544:iload_3         
	//* 304  545:baload          
	//* 305  546:sipush          255
	//* 306  549:iand            
	//* 307  550:iadd            
	//* 308  551:iconst_2        
	//* 309  552:idiv            
	//* 310  553:iadd            
	//* 311  554:int2byte        
	//* 312  555:bastore         
	//* 313  556:iload_3         
	//* 314  557:iconst_1        
	//* 315  558:iadd            
	//* 316  559:istore_3        
	//* 317  560:goto            522
	//* 318  563:iconst_0        
	//* 319  564:istore_3        
	//* 320  565:iload_3         
	//* 321  566:iload_2         
	//* 322  567:icmpge          589
	//* 323  570:aload_1         
	//* 324  571:iload_3         
	//* 325  572:aload_1         
	//* 326  573:iload_3         
	//* 327  574:baload          
	//* 328  575:aload           11
	//* 329  577:iload_3         
	//* 330  578:baload          
	//* 331  579:iadd            
	//* 332  580:int2byte        
	//* 333  581:bastore         
	//* 334  582:iload_3         
	//* 335  583:iconst_1        
	//* 336  584:iadd            
	//* 337  585:istore_3        
	//* 338  586:goto            565
	//* 339  589:iload_2         
	//* 340  590:istore          4
	//* 341  592:iload           4
	//* 342  594:iload           7
	//* 343  596:icmpge          339
	//* 344  599:aload_1         
	//* 345  600:iload           4
	//* 346  602:iload_2         
	//* 347  603:isub            
	//* 348  604:baload          
	//* 349  605:sipush          255
	//* 350  608:iand            
	//* 351  609:istore_3        
	//* 352  610:aload           11
	//* 353  612:iload           4
	//* 354  614:baload          
	//* 355  615:sipush          255
	//* 356  618:iand            
	//* 357  619:istore          5
	//* 358  621:aload           11
	//* 359  623:iload           4
	//* 360  625:iload_2         
	//* 361  626:isub            
	//* 362  627:baload          
	//* 363  628:sipush          255
	//* 364  631:iand            
	//* 365  632:istore          6
	//* 366  634:iload_3         
	//* 367  635:iload           5
	//* 368  637:iadd            
	//* 369  638:iload           6
	//* 370  640:isub            
	//* 371  641:istore          10
	//* 372  643:iload           10
	//* 373  645:iload_3         
	//* 374  646:isub            
	//* 375  647:invokestatic    #690 <Method int Math.abs(int)>
	//* 376  650:istore          8
	//* 377  652:iload           10
	//* 378  654:iload           5
	//* 379  656:isub            
	//* 380  657:invokestatic    #690 <Method int Math.abs(int)>
	//* 381  660:istore          9
	//* 382  662:iload           10
	//* 383  664:iload           6
	//* 384  666:isub            
	//* 385  667:invokestatic    #690 <Method int Math.abs(int)>
	//* 386  670:istore          10
	//* 387  672:iload           8
	//* 388  674:iload           9
	//* 389  676:icmpgt          707
	//* 390  679:iload           8
	//* 391  681:iload           10
	//* 392  683:icmpgt          707
	//* 393  686:aload_1         
	//* 394  687:iload           4
	//* 395  689:aload_1         
	//* 396  690:iload           4
	//* 397  692:baload          
	//* 398  693:iload_3         
	//* 399  694:int2byte        
	//* 400  695:iadd            
	//* 401  696:int2byte        
	//* 402  697:bastore         
	//* 403  698:iload           4
	//* 404  700:iconst_1        
	//* 405  701:iadd            
	//* 406  702:istore          4
	//* 407  704:goto            592
	//* 408  707:iload           9
	//* 409  709:iload           10
	//* 410  711:icmpgt          720
	//* 411  714:iload           5
	//* 412  716:istore_3        
	//* 413  717:goto            686
	//* 414  720:iload           6
	//* 415  722:istore_3        
	//* 416  723:goto            686
		// Misplaced declaration of an exception variable
		catch(byte abyte0[]) { }
	//  417  726:astore_0        
		abyte0 = ((byte []) (obj));
		obj = ((Object) (pdfobject));
		pdfobject = ((PdfObject) (abyte0));
_L3:
		try
		{
			l = datainputstream.read();
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
		{
			return bytearrayoutputstream.toByteArray();
		}
		if(l >= 0)
			break MISSING_BLOCK_LABEL_369;
		return bytearrayoutputstream.toByteArray();
		datainputstream.readFully(((byte []) (pdfobject)), 0, j3);
		switch(l)
		{
		default:
			throw new RuntimeException(MessageLocalization.getComposedMessage("png.filter.unknown", new Object[0]));

		case 0: // '\0'
			break;

		case 1: // '\001'
			l = i;
			while(l < j3) 
			{
				pdfobject[l] = (byte)(pdfobject[l] + pdfobject[l - i]);
				l++;
			}
			break;

		case 2: // '\002'
			l = 0;
			while(l < j3) 
			{
				pdfobject[l] = (byte)(pdfobject[l] + obj[l]);
				l++;
			}
			break;

		case 3: // '\003'
			for(l = 0; l < i; l++)
				pdfobject[l] = (byte)(pdfobject[l] + obj[l] / 2);

			l = i;
			while(l < j3) 
			{
				pdfobject[l] = (byte)(pdfobject[l] + ((pdfobject[l - i] & 0xff) + (obj[l] & 0xff)) / 2);
				l++;
			}
			break;

		case 4: // '\004'
			l = 0;
			break; /* Loop/switch isn't completed */
		}
		if(true) goto _L5; else goto _L4
_L4:
		for(; l < i; l++)
			pdfobject[l] = (byte)(pdfobject[l] + obj[l]);

		k1 = i;
		while(k1 < j3) 
		{
			l = pdfobject[k1 - i] & 0xff;
			j2 = obj[k1] & 0xff;
			i3 = obj[k1 - i] & 0xff;
			i4 = (l + j2) - i3;
			k3 = Math.abs(i4 - l);
			l3 = Math.abs(i4 - j2);
			i4 = Math.abs(i4 - i3);
			if(k3 > l3 || k3 > i4)
				if(l3 <= i4)
					l = j2;
				else
					l = i3;
			pdfobject[k1] = (byte)(pdfobject[k1] + (byte)l);
			k1++;
		}
		  goto _L5
	//* 418  727:goto            345
	}

	protected static PdfDictionary duplicatePdfDictionary(PdfDictionary pdfdictionary, PdfDictionary pdfdictionary1, PdfReader pdfreader)
	{
		PdfDictionary pdfdictionary2 = pdfdictionary1;
	//    0    0:aload_1         
	//    1    1:astore_3        
		if(pdfdictionary1 == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       18
			pdfdictionary2 = new PdfDictionary(pdfdictionary.size());
	//    4    6:new             #281 <Class PdfDictionary>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokevirtual   #693 <Method int PdfDictionary.size()>
	//    8   14:invokespecial   #694 <Method void PdfDictionary(int)>
	//    9   17:astore_3        
		PdfName pdfname;
		for(pdfdictionary1 = ((PdfDictionary) (pdfdictionary.getKeys().iterator())); ((Iterator) (pdfdictionary1)).hasNext(); pdfdictionary2.put(pdfname, duplicatePdfObject(pdfdictionary.get(pdfname), pdfreader)))
	//*  10   18:aload_0         
	//*  11   19:invokevirtual   #698 <Method Set PdfDictionary.getKeys()>
	//*  12   22:invokeinterface #704 <Method Iterator Set.iterator()>
	//*  13   27:astore_1        
	//*  14   28:aload_1         
	//*  15   29:invokeinterface #709 <Method boolean Iterator.hasNext()>
	//*  16   34:ifeq            67
			pdfname = (PdfName)((Iterator) (pdfdictionary1)).next();
	//   17   37:aload_1         
	//   18   38:invokeinterface #713 <Method Object Iterator.next()>
	//   19   43:checkcast       #103 <Class PdfName>
	//   20   46:astore          4

	//   21   48:aload_3         
	//   22   49:aload           4
	//   23   51:aload_0         
	//   24   52:aload           4
	//   25   54:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   26   57:aload_2         
	//   27   58:invokestatic    #268 <Method PdfObject duplicatePdfObject(PdfObject, PdfReader)>
	//   28   61:invokevirtual   #575 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  29   64:goto            28
		return pdfdictionary2;
	//   30   67:aload_3         
	//   31   68:areturn         
	}

	protected static PdfObject duplicatePdfObject(PdfObject pdfobject, PdfReader pdfreader)
	{
		if(pdfobject == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		switch(pdfobject.type())
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #469 <Method int PdfObject.type()>
		{
	//*   6   10:tableswitch     5 10: default 48
	//	               5 85
	//	               6 50
	//	               7 60
	//	               8 48
	//	               9 48
	//	               10 139
		case 8: // '\b'
		case 9: // '\t'
		default:
			return pdfobject;
	//    7   48:aload_0         
	//    8   49:areturn         

		case 6: // '\006'
			return ((PdfObject) (duplicatePdfDictionary((PdfDictionary)pdfobject, ((PdfDictionary) (null)), pdfreader)));
	//    9   50:aload_0         
	//   10   51:checkcast       #281 <Class PdfDictionary>
	//   11   54:aconst_null     
	//   12   55:aload_1         
	//   13   56:invokestatic    #715 <Method PdfDictionary duplicatePdfDictionary(PdfDictionary, PdfDictionary, PdfReader)>
	//   14   59:areturn         

		case 7: // '\007'
			pdfobject = ((PdfObject) ((PRStream)pdfobject));
	//   15   60:aload_0         
	//   16   61:checkcast       #453 <Class PRStream>
	//   17   64:astore_0        
			PRStream prstream = new PRStream(((PRStream) (pdfobject)), ((PdfDictionary) (null)), pdfreader);
	//   18   65:new             #453 <Class PRStream>
	//   19   68:dup             
	//   20   69:aload_0         
	//   21   70:aconst_null     
	//   22   71:aload_1         
	//   23   72:invokespecial   #718 <Method void PRStream(PRStream, PdfDictionary, PdfReader)>
	//   24   75:astore_2        
			duplicatePdfDictionary(((PdfDictionary) (pdfobject)), ((PdfDictionary) (prstream)), pdfreader);
	//   25   76:aload_0         
	//   26   77:aload_2         
	//   27   78:aload_1         
	//   28   79:invokestatic    #715 <Method PdfDictionary duplicatePdfDictionary(PdfDictionary, PdfDictionary, PdfReader)>
	//   29   82:pop             
			return ((PdfObject) (prstream));
	//   30   83:aload_2         
	//   31   84:areturn         

		case 5: // '\005'
			Object obj = ((Object) ((PdfArray)pdfobject));
	//   32   85:aload_0         
	//   33   86:checkcast       #558 <Class PdfArray>
	//   34   89:astore_2        
			pdfobject = ((PdfObject) (new PdfArray(((PdfArray) (obj)).size())));
	//   35   90:new             #558 <Class PdfArray>
	//   36   93:dup             
	//   37   94:aload_2         
	//   38   95:invokevirtual   #719 <Method int PdfArray.size()>
	//   39   98:invokespecial   #720 <Method void PdfArray(int)>
	//   40  101:astore_0        
			for(obj = ((Object) (((PdfArray) (obj)).listIterator())); ((Iterator) (obj)).hasNext(); ((PdfArray) (pdfobject)).add(duplicatePdfObject((PdfObject)((Iterator) (obj)).next(), pdfreader)));
	//   41  102:aload_2         
	//   42  103:invokevirtual   #724 <Method java.util.ListIterator PdfArray.listIterator()>
	//   43  106:astore_2        
	//   44  107:aload_2         
	//   45  108:invokeinterface #709 <Method boolean Iterator.hasNext()>
	//   46  113:ifeq            137
	//   47  116:aload_0         
	//   48  117:aload_2         
	//   49  118:invokeinterface #713 <Method Object Iterator.next()>
	//   50  123:checkcast       #264 <Class PdfObject>
	//   51  126:aload_1         
	//   52  127:invokestatic    #268 <Method PdfObject duplicatePdfObject(PdfObject, PdfReader)>
	//   53  130:invokevirtual   #727 <Method boolean PdfArray.add(PdfObject)>
	//   54  133:pop             
	//*  55  134:goto            107
			return pdfobject;
	//   56  137:aload_0         
	//   57  138:areturn         

		case 10: // '\n'
			pdfobject = ((PdfObject) ((PRIndirectReference)pdfobject));
	//   58  139:aload_0         
	//   59  140:checkcast       #305 <Class PRIndirectReference>
	//   60  143:astore_0        
			return ((PdfObject) (new PRIndirectReference(pdfreader, ((PRIndirectReference) (pdfobject)).getNumber(), ((PRIndirectReference) (pdfobject)).getGeneration())));
	//   61  144:new             #305 <Class PRIndirectReference>
	//   62  147:dup             
	//   63  148:aload_1         
	//   64  149:aload_0         
	//   65  150:invokevirtual   #730 <Method int PRIndirectReference.getNumber()>
	//   66  153:aload_0         
	//   67  154:invokevirtual   #733 <Method int PRIndirectReference.getGeneration()>
	//   68  157:invokespecial   #736 <Method void PRIndirectReference(PdfReader, int, int)>
	//   69  160:areturn         
		}
	}

	private void ensureXrefSize(int i)
	{
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            5
	//*   2    4:return          
		{
			if(xref == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #301 <Field long[] xref>
	//*   5    9:ifnonnull       20
			{
				xref = new long[i];
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:newarray        long[]
	//    9   16:putfield        #301 <Field long[] xref>
				return;
	//   10   19:return          
			}
			if(xref.length < i)
	//*  11   20:aload_0         
	//*  12   21:getfield        #301 <Field long[] xref>
	//*  13   24:arraylength     
	//*  14   25:iload_1         
	//*  15   26:icmpge          4
			{
				long al[] = new long[i];
	//   16   29:iload_1         
	//   17   30:newarray        long[]
	//   18   32:astore_2        
				System.arraycopy(((Object) (xref)), 0, ((Object) (al)), 0, xref.length);
	//   19   33:aload_0         
	//   20   34:getfield        #301 <Field long[] xref>
	//   21   37:iconst_0        
	//   22   38:aload_2         
	//   23   39:iconst_0        
	//   24   40:aload_0         
	//   25   41:getfield        #301 <Field long[] xref>
	//   26   44:arraylength     
	//   27   45:invokestatic    #743 <Method void System.arraycopy(Object, int, Object, int, int)>
				xref = al;
	//   28   48:aload_0         
	//   29   49:aload_2         
	//   30   50:putfield        #301 <Field long[] xref>
				return;
	//   31   53:return          
			}
		}
	}

	private boolean equalsArray(byte abyte0[], byte abyte1[], int i)
	{
		for(int j = 0; j < i; j++)
	//*   0    0:iconst_0        
	//*   1    1:istore          4
	//*   2    3:iload           4
	//*   3    5:iload_3         
	//*   4    6:icmpge          31
			if(abyte0[j] != abyte1[j])
	//*   5    9:aload_1         
	//*   6   10:iload           4
	//*   7   12:baload          
	//*   8   13:aload_2         
	//*   9   14:iload           4
	//*  10   16:baload          
	//*  11   17:icmpeq          22
				return false;
	//   12   20:iconst_0        
	//   13   21:ireturn         

	//   14   22:iload           4
	//   15   24:iconst_1        
	//   16   25:iadd            
	//   17   26:istore          4
	//*  18   28:goto            3
		return true;
	//   19   31:iconst_1        
	//   20   32:ireturn         
	}

	static boolean equalsn(byte abyte0[], byte abyte1[])
	{
		int j = abyte1.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          28
			if(abyte0[i] != abyte1[i])
	//*   8   10:aload_0         
	//*   9   11:iload_2         
	//*  10   12:baload          
	//*  11   13:aload_1         
	//*  12   14:iload_2         
	//*  13   15:baload          
	//*  14   16:icmpeq          21
				return false;
	//   15   19:iconst_0        
	//   16   20:ireturn         

	//   17   21:iload_2         
	//   18   22:iconst_1        
	//   19   23:iadd            
	//   20   24:istore_2        
	//*  21   25:goto            5
		return true;
	//   22   28:iconst_1        
	//   23   29:ireturn         
	}

	static boolean existsName(PdfDictionary pdfdictionary, PdfName pdfname, PdfName pdfname1)
	{
		pdfdictionary = ((PdfDictionary) (getPdfObjectRelease(pdfdictionary.get(pdfname))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//    3    5:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//    4    8:astore_0        
		if(pdfdictionary == null || !((PdfObject) (pdfdictionary)).isName())
	//*   5    9:aload_0         
	//*   6   10:ifnull          20
	//*   7   13:aload_0         
	//*   8   14:invokevirtual   #551 <Method boolean PdfObject.isName()>
	//*   9   17:ifne            22
			return false;
	//   10   20:iconst_0        
	//   11   21:ireturn         
		else
			return ((PdfName)pdfdictionary).equals(((Object) (pdfname1)));
	//   12   22:aload_0         
	//   13   23:checkcast       #103 <Class PdfName>
	//   14   26:aload_2         
	//   15   27:invokevirtual   #545 <Method boolean PdfName.equals(Object)>
	//   16   30:ireturn         
	}

	static String getFontName(PdfDictionary pdfdictionary)
	{
		if(pdfdictionary != null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
	//*   2    4:aconst_null     
	//*   3    5:areturn         
	//*   4    6:aload_0         
	//*   5    7:getstatic       #752 <Field PdfName PdfName.BASEFONT>
	//*   6   10:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//*   7   13:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//*   8   16:astore_0        
			if((pdfdictionary = ((PdfDictionary) (getPdfObjectRelease(pdfdictionary.get(PdfName.BASEFONT))))) != null && ((PdfObject) (pdfdictionary)).isName())
	//*   9   17:aload_0         
	//*  10   18:ifnull          4
	//*  11   21:aload_0         
	//*  12   22:invokevirtual   #551 <Method boolean PdfObject.isName()>
	//*  13   25:ifeq            4
				return PdfName.decodeName(((PdfObject) (pdfdictionary)).toString());
	//   14   28:aload_0         
	//   15   29:invokevirtual   #586 <Method String PdfObject.toString()>
	//   16   32:invokestatic    #756 <Method String PdfName.decodeName(String)>
	//   17   35:areturn         
		return null;
	}

	private static PdfArray getNameArray(PdfObject pdfobject)
	{
		if(pdfobject == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		pdfobject = getPdfObjectRelease(pdfobject);
	//    4    6:aload_0         
	//    5    7:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//    6   10:astore_0        
		if(pdfobject == null)
	//*   7   11:aload_0         
	//*   8   12:ifnonnull       17
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		if(pdfobject.isArray())
	//*  11   17:aload_0         
	//*  12   18:invokevirtual   #611 <Method boolean PdfObject.isArray()>
	//*  13   21:ifeq            29
			return (PdfArray)pdfobject;
	//   14   24:aload_0         
	//   15   25:checkcast       #558 <Class PdfArray>
	//   16   28:areturn         
		if(pdfobject.isDictionary())
	//*  17   29:aload_0         
	//*  18   30:invokevirtual   #531 <Method boolean PdfObject.isDictionary()>
	//*  19   33:ifeq            66
		{
			pdfobject = getPdfObjectRelease(((PdfDictionary)pdfobject).get(PdfName.D));
	//   20   36:aload_0         
	//   21   37:checkcast       #281 <Class PdfDictionary>
	//   22   40:getstatic       #548 <Field PdfName PdfName.D>
	//   23   43:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   24   46:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//   25   49:astore_0        
			if(pdfobject != null && pdfobject.isArray())
	//*  26   50:aload_0         
	//*  27   51:ifnull          66
	//*  28   54:aload_0         
	//*  29   55:invokevirtual   #611 <Method boolean PdfObject.isArray()>
	//*  30   58:ifeq            66
				return (PdfArray)pdfobject;
	//   31   61:aload_0         
	//   32   62:checkcast       #558 <Class PdfArray>
	//   33   65:areturn         
		}
		return null;
	//   34   66:aconst_null     
	//   35   67:areturn         
	}

	public static Rectangle getNormalizedRectangle(PdfArray pdfarray)
	{
		float f = ((PdfNumber)getPdfObjectRelease(pdfarray.getPdfObject(0))).floatValue();
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #763 <Method PdfObject PdfArray.getPdfObject(int)>
	//    3    5:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//    4    8:checkcast       #471 <Class PdfNumber>
	//    5   11:invokevirtual   #767 <Method float PdfNumber.floatValue()>
	//    6   14:fstore_1        
		float f1 = ((PdfNumber)getPdfObjectRelease(pdfarray.getPdfObject(1))).floatValue();
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:invokevirtual   #763 <Method PdfObject PdfArray.getPdfObject(int)>
	//   10   20:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//   11   23:checkcast       #471 <Class PdfNumber>
	//   12   26:invokevirtual   #767 <Method float PdfNumber.floatValue()>
	//   13   29:fstore_2        
		float f2 = ((PdfNumber)getPdfObjectRelease(pdfarray.getPdfObject(2))).floatValue();
	//   14   30:aload_0         
	//   15   31:iconst_2        
	//   16   32:invokevirtual   #763 <Method PdfObject PdfArray.getPdfObject(int)>
	//   17   35:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//   18   38:checkcast       #471 <Class PdfNumber>
	//   19   41:invokevirtual   #767 <Method float PdfNumber.floatValue()>
	//   20   44:fstore_3        
		float f3 = ((PdfNumber)getPdfObjectRelease(pdfarray.getPdfObject(3))).floatValue();
	//   21   45:aload_0         
	//   22   46:iconst_3        
	//   23   47:invokevirtual   #763 <Method PdfObject PdfArray.getPdfObject(int)>
	//   24   50:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//   25   53:checkcast       #471 <Class PdfNumber>
	//   26   56:invokevirtual   #767 <Method float PdfNumber.floatValue()>
	//   27   59:fstore          4
		return new Rectangle(Math.min(f, f2), Math.min(f1, f3), Math.max(f, f2), Math.max(f1, f3));
	//   28   61:new             #769 <Class Rectangle>
	//   29   64:dup             
	//   30   65:fload_1         
	//   31   66:fload_3         
	//   32   67:invokestatic    #773 <Method float Math.min(float, float)>
	//   33   70:fload_2         
	//   34   71:fload           4
	//   35   73:invokestatic    #773 <Method float Math.min(float, float)>
	//   36   76:fload_1         
	//   37   77:fload_3         
	//   38   78:invokestatic    #776 <Method float Math.max(float, float)>
	//   39   81:fload_2         
	//   40   82:fload           4
	//   41   84:invokestatic    #776 <Method float Math.max(float, float)>
	//   42   87:invokespecial   #779 <Method void Rectangle(float, float, float, float)>
	//   43   90:areturn         
	}

	private static PRTokeniser getOffsetTokeniser(RandomAccessSource randomaccesssource)
		throws IOException
	{
		PRTokeniser prtokeniser = new PRTokeniser(new RandomAccessFileOrArray(randomaccesssource));
	//    0    0:new             #231 <Class PRTokeniser>
	//    1    3:dup             
	//    2    4:new             #313 <Class RandomAccessFileOrArray>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #782 <Method void RandomAccessFileOrArray(RandomAccessSource)>
	//    6   12:invokespecial   #238 <Method void PRTokeniser(RandomAccessFileOrArray)>
	//    7   15:astore_2        
		int i = prtokeniser.getHeaderOffset();
	//    8   16:aload_2         
	//    9   17:invokevirtual   #785 <Method int PRTokeniser.getHeaderOffset()>
	//   10   20:istore_1        
		if(i != 0)
	//*  11   21:iload_1         
	//*  12   22:ifeq            50
			prtokeniser = new PRTokeniser(new RandomAccessFileOrArray(((RandomAccessSource) (new WindowRandomAccessSource(randomaccesssource, i)))));
	//   13   25:new             #231 <Class PRTokeniser>
	//   14   28:dup             
	//   15   29:new             #313 <Class RandomAccessFileOrArray>
	//   16   32:dup             
	//   17   33:new             #787 <Class WindowRandomAccessSource>
	//   18   36:dup             
	//   19   37:aload_0         
	//   20   38:iload_1         
	//   21   39:i2l             
	//   22   40:invokespecial   #790 <Method void WindowRandomAccessSource(RandomAccessSource, long)>
	//   23   43:invokespecial   #782 <Method void RandomAccessFileOrArray(RandomAccessSource)>
	//   24   46:invokespecial   #238 <Method void PRTokeniser(RandomAccessFileOrArray)>
	//   25   49:astore_2        
		return prtokeniser;
	//   26   50:aload_2         
	//   27   51:areturn         
	}

	public static byte[] getPageContent(PdfDictionary pdfdictionary)
		throws IOException
	{
		if(pdfdictionary != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnonnull       8
_L1:
		pdfdictionary = null;
	//    2    4:aconst_null     
	//    3    5:astore_0        
_L4:
		return ((byte []) (pdfdictionary));
	//    4    6:aload_0         
	//    5    7:areturn         
_L2:
		byte abyte0[];
		byte abyte1[];
		Object obj;
		PdfArray pdfarray;
		abyte1 = null;
	//    6    8:aconst_null     
	//    7    9:astore_3        
		obj = null;
	//    8   10:aconst_null     
	//    9   11:astore          4
		pdfarray = null;
	//   10   13:aconst_null     
	//   11   14:astore          5
		abyte0 = ((byte []) (obj));
	//   12   16:aload           4
	//   13   18:astore_2        
		pdfdictionary = ((PdfDictionary) (getPdfObjectRelease(pdfdictionary.get(PdfName.CONTENTS))));
	//   14   19:aload_0         
	//   15   20:getstatic       #795 <Field PdfName PdfName.CONTENTS>
	//   16   23:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   17   26:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//   18   29:astore_0        
		if(pdfdictionary != null)
			break; /* Loop/switch isn't completed */
	//   19   30:aload_0         
	//   20   31:ifnonnull       58
		abyte0 = ((byte []) (obj));
	//   21   34:aload           4
	//   22   36:astore_2        
		abyte1 = new byte[0];
	//   23   37:iconst_0        
	//   24   38:newarray        byte[]
	//   25   40:astore_3        
		pdfdictionary = ((PdfDictionary) (abyte1));
	//   26   41:aload_3         
	//   27   42:astore_0        
		if(false)
	//*  28   43:iconst_0        
	//*  29   44:ifeq            6
			try
			{
				throw new NullPointerException();
	//   30   47:new             #797 <Class NullPointerException>
	//   31   50:dup             
	//   32   51:invokespecial   #798 <Method void NullPointerException()>
	//   33   54:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(PdfDictionary pdfdictionary)
	//*  34   55:astore_0        
			{
				return abyte1;
	//   35   56:aload_3         
	//   36   57:areturn         
			}
		if(true) goto _L4; else goto _L3
_L3:
		abyte0 = ((byte []) (obj));
	//   37   58:aload           4
	//   38   60:astore_2        
		if(!((PdfObject) (pdfdictionary)).isStream())
			break; /* Loop/switch isn't completed */
	//   39   61:aload_0         
	//   40   62:invokevirtual   #801 <Method boolean PdfObject.isStream()>
	//   41   65:ifeq            123
		abyte1 = ((byte []) (pdfarray));
	//   42   68:aload           5
	//   43   70:astore_3        
		if(false)
			break MISSING_BLOCK_LABEL_95;
	//   44   71:iconst_0        
	//   45   72:ifne            95
		abyte0 = ((byte []) (obj));
	//   46   75:aload           4
	//   47   77:astore_2        
		abyte1 = ((byte []) (((PRStream)pdfdictionary).getReader().getSafeFile()));
	//   48   78:aload_0         
	//   49   79:checkcast       #453 <Class PRStream>
	//   50   82:invokevirtual   #805 <Method PdfReader PRStream.getReader()>
	//   51   85:invokevirtual   #806 <Method RandomAccessFileOrArray getSafeFile()>
	//   52   88:astore_3        
		abyte0 = abyte1;
	//   53   89:aload_3         
	//   54   90:astore_2        
		((RandomAccessFileOrArray) (abyte1)).reOpen();
	//   55   91:aload_3         
	//   56   92:invokevirtual   #809 <Method void RandomAccessFileOrArray.reOpen()>
		abyte0 = abyte1;
	//   57   95:aload_3         
	//   58   96:astore_2        
		pdfdictionary = ((PdfDictionary) (getStreamBytes((PRStream)pdfdictionary, ((RandomAccessFileOrArray) (abyte1)))));
	//   59   97:aload_0         
	//   60   98:checkcast       #453 <Class PRStream>
	//   61  101:aload_3         
	//   62  102:invokestatic    #813 <Method byte[] getStreamBytes(PRStream, RandomAccessFileOrArray)>
	//   63  105:astore_0        
		abyte0 = ((byte []) (pdfdictionary));
	//   64  106:aload_0         
	//   65  107:astore_2        
		pdfdictionary = ((PdfDictionary) (abyte0));
	//   66  108:aload_2         
	//   67  109:astore_0        
		if(abyte1 != null)
	//*  68  110:aload_3         
	//*  69  111:ifnull          6
		{
			try
			{
				((RandomAccessFileOrArray) (abyte1)).close();
	//   70  114:aload_3         
	//   71  115:invokevirtual   #814 <Method void RandomAccessFileOrArray.close()>
			}
	//*  72  118:aload_2         
	//*  73  119:areturn         
			// Misplaced declaration of an exception variable
			catch(PdfDictionary pdfdictionary)
	//*  74  120:astore_0        
			{
				return abyte0;
	//   75  121:aload_2         
	//   76  122:areturn         
			}
			return abyte0;
		}
		if(true) goto _L4; else goto _L5
_L5:
		abyte0 = ((byte []) (obj));
	//   77  123:aload           4
	//   78  125:astore_2        
		if(!((PdfObject) (pdfdictionary)).isArray()) goto _L7; else goto _L6
	//   79  126:aload_0         
	//   80  127:invokevirtual   #611 <Method boolean PdfObject.isArray()>
	//   81  130:ifeq            313
_L6:
		abyte0 = ((byte []) (obj));
	//   82  133:aload           4
	//   83  135:astore_2        
		pdfarray = (PdfArray)pdfdictionary;
	//   84  136:aload_0         
	//   85  137:checkcast       #558 <Class PdfArray>
	//   86  140:astore          5
		abyte0 = ((byte []) (obj));
	//   87  142:aload           4
	//   88  144:astore_2        
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//   89  145:new             #376 <Class ByteArrayOutputStream>
	//   90  148:dup             
	//   91  149:invokespecial   #377 <Method void ByteArrayOutputStream()>
	//   92  152:astore          6
		int i = 0;
	//   93  154:iconst_0        
	//   94  155:istore_1        
_L8:
		abyte0 = abyte1;
	//   95  156:aload_3         
	//   96  157:astore_2        
		if(i >= pdfarray.size())
			break MISSING_BLOCK_LABEL_288;
	//   97  158:iload_1         
	//   98  159:aload           5
	//   99  161:invokevirtual   #719 <Method int PdfArray.size()>
	//  100  164:icmpge          288
		abyte0 = abyte1;
	//  101  167:aload_3         
	//  102  168:astore_2        
		PdfObject pdfobject = getPdfObjectRelease(pdfarray.getPdfObject(i));
	//  103  169:aload           5
	//  104  171:iload_1         
	//  105  172:invokevirtual   #763 <Method PdfObject PdfArray.getPdfObject(int)>
	//  106  175:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//  107  178:astore          7
		obj = ((Object) (abyte1));
	//  108  180:aload_3         
	//  109  181:astore          4
		if(pdfobject == null)
			break MISSING_BLOCK_LABEL_341;
	//  110  183:aload           7
	//  111  185:ifnull          341
		abyte0 = abyte1;
	//  112  188:aload_3         
	//  113  189:astore_2        
		if(!pdfobject.isStream())
	//* 114  190:aload           7
	//* 115  192:invokevirtual   #801 <Method boolean PdfObject.isStream()>
	//* 116  195:ifne            204
		{
			obj = ((Object) (abyte1));
	//  117  198:aload_3         
	//  118  199:astore          4
			break MISSING_BLOCK_LABEL_341;
	//  119  201:goto            341
		}
		pdfdictionary = ((PdfDictionary) (abyte1));
	//  120  204:aload_3         
	//  121  205:astore_0        
		if(abyte1 != null)
			break MISSING_BLOCK_LABEL_230;
	//  122  206:aload_3         
	//  123  207:ifnonnull       230
		abyte0 = abyte1;
	//  124  210:aload_3         
	//  125  211:astore_2        
		pdfdictionary = ((PdfDictionary) (((PRStream)pdfobject).getReader().getSafeFile()));
	//  126  212:aload           7
	//  127  214:checkcast       #453 <Class PRStream>
	//  128  217:invokevirtual   #805 <Method PdfReader PRStream.getReader()>
	//  129  220:invokevirtual   #806 <Method RandomAccessFileOrArray getSafeFile()>
	//  130  223:astore_0        
		abyte0 = ((byte []) (pdfdictionary));
	//  131  224:aload_0         
	//  132  225:astore_2        
		((RandomAccessFileOrArray) (pdfdictionary)).reOpen();
	//  133  226:aload_0         
	//  134  227:invokevirtual   #809 <Method void RandomAccessFileOrArray.reOpen()>
		abyte0 = ((byte []) (pdfdictionary));
	//  135  230:aload_0         
	//  136  231:astore_2        
		bytearrayoutputstream.write(getStreamBytes((PRStream)pdfobject, ((RandomAccessFileOrArray) (pdfdictionary))));
	//  137  232:aload           6
	//  138  234:aload           7
	//  139  236:checkcast       #453 <Class PRStream>
	//  140  239:aload_0         
	//  141  240:invokestatic    #813 <Method byte[] getStreamBytes(PRStream, RandomAccessFileOrArray)>
	//  142  243:invokevirtual   #679 <Method void ByteArrayOutputStream.write(byte[])>
		abyte0 = ((byte []) (pdfdictionary));
	//  143  246:aload_0         
	//  144  247:astore_2        
		obj = ((Object) (pdfdictionary));
	//  145  248:aload_0         
	//  146  249:astore          4
		if(i == pdfarray.size() - 1)
			break MISSING_BLOCK_LABEL_341;
	//  147  251:iload_1         
	//  148  252:aload           5
	//  149  254:invokevirtual   #719 <Method int PdfArray.size()>
	//  150  257:iconst_1        
	//  151  258:isub            
	//  152  259:icmpeq          341
		abyte0 = ((byte []) (pdfdictionary));
	//  153  262:aload_0         
	//  154  263:astore_2        
		bytearrayoutputstream.write(10);
	//  155  264:aload           6
	//  156  266:bipush          10
	//  157  268:invokevirtual   #382 <Method void ByteArrayOutputStream.write(int)>
		obj = ((Object) (pdfdictionary));
	//  158  271:aload_0         
	//  159  272:astore          4
		break MISSING_BLOCK_LABEL_341;
	//  160  274:goto            341
		pdfdictionary;
	//  161  277:astore_0        
		if(abyte0 != null)
	//* 162  278:aload_2         
	//* 163  279:ifnull          286
			try
			{
				((RandomAccessFileOrArray) (abyte0)).close();
	//  164  282:aload_2         
	//  165  283:invokevirtual   #814 <Method void RandomAccessFileOrArray.close()>
			}
	//* 166  286:aload_0         
	//* 167  287:athrow          
	//* 168  288:aload_3         
	//* 169  289:astore_2        
	//* 170  290:aload           6
	//* 171  292:invokevirtual   #386 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//* 172  295:astore_0        
	//* 173  296:aload_0         
	//* 174  297:astore_2        
	//* 175  298:aload_2         
	//* 176  299:astore_0        
	//* 177  300:aload_3         
	//* 178  301:ifnull          6
	//* 179  304:aload_3         
	//* 180  305:invokevirtual   #814 <Method void RandomAccessFileOrArray.close()>
	//* 181  308:aload_2         
	//* 182  309:areturn         
	//* 183  310:astore_0        
	//* 184  311:aload_2         
	//* 185  312:areturn         
	//* 186  313:aload           4
	//* 187  315:astore_2        
	//* 188  316:iconst_0        
	//* 189  317:newarray        byte[]
	//* 190  319:astore_3        
	//* 191  320:aload_3         
	//* 192  321:astore_0        
	//* 193  322:iconst_0        
	//* 194  323:ifeq            6
	//* 195  326:new             #797 <Class NullPointerException>
	//* 196  329:dup             
	//* 197  330:invokespecial   #798 <Method void NullPointerException()>
	//* 198  333:athrow          
	//* 199  334:astore_0        
	//* 200  335:aload_3         
	//* 201  336:areturn         
			catch(Exception exception) { }
	//  202  337:astore_2        
		throw pdfdictionary;
		abyte0 = abyte1;
		pdfdictionary = ((PdfDictionary) (bytearrayoutputstream.toByteArray()));
		abyte0 = ((byte []) (pdfdictionary));
		pdfdictionary = ((PdfDictionary) (abyte0));
		if(abyte1 != null)
		{
			try
			{
				((RandomAccessFileOrArray) (abyte1)).close();
			}
			// Misplaced declaration of an exception variable
			catch(PdfDictionary pdfdictionary)
			{
				return abyte0;
			}
			return abyte0;
		}
		  goto _L4
_L7:
		abyte0 = ((byte []) (obj));
		abyte1 = new byte[0];
		pdfdictionary = ((PdfDictionary) (abyte1));
		if(false)
			try
			{
				throw new NullPointerException();
			}
			// Misplaced declaration of an exception variable
			catch(PdfDictionary pdfdictionary)
			{
				return abyte1;
			}
		  goto _L4
	//* 203  338:goto            286
		i++;
	//  204  341:iload_1         
	//  205  342:iconst_1        
	//  206  343:iadd            
	//  207  344:istore_1        
		abyte1 = ((byte []) (obj));
	//  208  345:aload           4
	//  209  347:astore_3        
		  goto _L8
	//* 210  348:goto            156
	}

	public static PdfObject getPdfObject(PdfObject pdfobject)
	{
		if(pdfobject != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnonnull       8
_L1:
		PdfObject pdfobject1 = null;
	//    2    4:aconst_null     
	//    3    5:astore_3        
_L4:
		return pdfobject1;
	//    4    6:aload_3         
	//    5    7:areturn         
_L2:
		pdfobject1 = pdfobject;
	//    6    8:aload_0         
	//    7    9:astore_3        
		if(!pdfobject.isIndirect()) goto _L4; else goto _L3
	//    8   10:aload_0         
	//    9   11:invokevirtual   #817 <Method boolean PdfObject.isIndirect()>
	//   10   14:ifeq            6
_L3:
		boolean flag;
		PRIndirectReference prindirectreference;
		try
		{
			prindirectreference = (PRIndirectReference)pdfobject;
	//   11   17:aload_0         
	//   12   18:checkcast       #305 <Class PRIndirectReference>
	//   13   21:astore          4
			int i = prindirectreference.getNumber();
	//   14   23:aload           4
	//   15   25:invokevirtual   #730 <Method int PRIndirectReference.getNumber()>
	//   16   28:istore_1        
			flag = prindirectreference.getReader().appendable;
	//   17   29:aload           4
	//   18   31:invokevirtual   #818 <Method PdfReader PRIndirectReference.getReader()>
	//   19   34:getfield        #219 <Field boolean appendable>
	//   20   37:istore_2        
			pdfobject = prindirectreference.getReader().getPdfObject(i);
	//   21   38:aload           4
	//   22   40:invokevirtual   #818 <Method PdfReader PRIndirectReference.getReader()>
	//   23   43:iload_1         
	//   24   44:invokevirtual   #819 <Method PdfObject getPdfObject(int)>
	//   25   47:astore_0        
		}
	//*  26   48:aload_0         
	//*  27   49:ifnonnull       54
	//*  28   52:aconst_null     
	//*  29   53:areturn         
	//*  30   54:aload_0         
	//*  31   55:astore_3        
	//*  32   56:iload_2         
	//*  33   57:ifeq            6
	//*  34   60:aload_0         
	//*  35   61:invokevirtual   #469 <Method int PdfObject.type()>
	//*  36   64:lookupswitch    3: default 162
	//	               1: 129
	//	               4: 147
	//	               8: 118
	//*  37  100:aload_0         
	//*  38  101:aload           4
	//*  39  103:invokevirtual   #823 <Method void PdfObject.setIndRef(PRIndirectReference)>
	//*  40  106:aload_0         
	//*  41  107:areturn         
		// Misplaced declaration of an exception variable
		catch(PdfObject pdfobject)
	//*  42  108:astore_0        
		{
			throw new ExceptionConverter(((Exception) (pdfobject)));
	//   43  109:new             #825 <Class ExceptionConverter>
	//   44  112:dup             
	//   45  113:aload_0         
	//   46  114:invokespecial   #828 <Method void ExceptionConverter(Exception)>
	//   47  117:athrow          
		}
		if(pdfobject == null)
			return null;
		pdfobject1 = pdfobject;
		if(!flag) goto _L4; else goto _L5
_L5:
		pdfobject.type();
		JVM INSTR lookupswitch 3: default 162
	//	               1: 129
	//	               4: 147
	//	               8: 118;
		   goto _L6 _L7 _L8 _L9
_L6:
		break; /* Loop/switch isn't completed */
_L8:
		break MISSING_BLOCK_LABEL_147;
_L10:
		pdfobject.setIndRef(prindirectreference);
		return pdfobject;
_L9:
		pdfobject = ((PdfObject) (new PdfNull()));
	//   48  118:new             #633 <Class PdfNull>
	//   49  121:dup             
	//   50  122:invokespecial   #829 <Method void PdfNull()>
	//   51  125:astore_0        
		  goto _L10
	//*  52  126:goto            100
_L7:
		pdfobject = ((PdfObject) (new PdfBoolean(((PdfBoolean)pdfobject).booleanValue())));
	//   53  129:new             #831 <Class PdfBoolean>
	//   54  132:dup             
	//   55  133:aload_0         
	//   56  134:checkcast       #831 <Class PdfBoolean>
	//   57  137:invokevirtual   #834 <Method boolean PdfBoolean.booleanValue()>
	//   58  140:invokespecial   #837 <Method void PdfBoolean(boolean)>
	//   59  143:astore_0        
		  goto _L10
	//*  60  144:goto            100
		pdfobject = ((PdfObject) (new PdfName(pdfobject.getBytes())));
	//   61  147:new             #103 <Class PdfName>
	//   62  150:dup             
	//   63  151:aload_0         
	//   64  152:invokevirtual   #838 <Method byte[] PdfObject.getBytes()>
	//   65  155:invokespecial   #839 <Method void PdfName(byte[])>
	//   66  158:astore_0        
		  goto _L10
	//*  67  159:goto            100
	//*  68  162:goto            100
	}

	public static PdfObject getPdfObject(PdfObject pdfobject, PdfObject pdfobject1)
	{
		if(pdfobject != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnonnull       8
_L1:
		PdfObject pdfobject2 = null;
	//    2    4:aconst_null     
	//    3    5:astore_2        
_L6:
		return pdfobject2;
	//    4    6:aload_2         
	//    5    7:areturn         
_L2:
		if(pdfobject.isIndirect()) goto _L4; else goto _L3
	//    6    8:aload_0         
	//    7    9:invokevirtual   #817 <Method boolean PdfObject.isIndirect()>
	//    8   12:ifne            135
_L3:
		pdfobject2 = pdfobject;
	//    9   15:aload_0         
	//   10   16:astore_2        
		if(pdfobject1 == null) goto _L6; else goto _L5
	//   11   17:aload_1         
	//   12   18:ifnull          6
_L5:
		pdfobject1 = ((PdfObject) (pdfobject1.getIndRef()));
	//   13   21:aload_1         
	//   14   22:invokevirtual   #844 <Method PRIndirectReference PdfObject.getIndRef()>
	//   15   25:astore_1        
		pdfobject2 = pdfobject;
	//   16   26:aload_0         
	//   17   27:astore_2        
		if(pdfobject1 == null) goto _L6; else goto _L7
	//   18   28:aload_1         
	//   19   29:ifnull          6
_L7:
		pdfobject2 = pdfobject;
	//   20   32:aload_0         
	//   21   33:astore_2        
		if(!((PRIndirectReference) (pdfobject1)).getReader().isAppendable()) goto _L6; else goto _L8
	//   22   34:aload_1         
	//   23   35:invokevirtual   #818 <Method PdfReader PRIndirectReference.getReader()>
	//   24   38:invokevirtual   #847 <Method boolean isAppendable()>
	//   25   41:ifeq            6
_L8:
		pdfobject.type();
	//   26   44:aload_0         
	//   27   45:invokevirtual   #469 <Method int PdfObject.type()>
		JVM INSTR lookupswitch 3: default 84
	//	               1: 102
	//	               4: 120
	//	               8: 91;
	//   28   48:lookupswitch    3: default 84
	//	               1: 102
	//	               4: 120
	//	               8: 91
		   goto _L9 _L10 _L11 _L12
_L9:
		pdfobject.setIndRef(((PRIndirectReference) (pdfobject1)));
	//   29   84:aload_0         
	//   30   85:aload_1         
	//   31   86:invokevirtual   #823 <Method void PdfObject.setIndRef(PRIndirectReference)>
		return pdfobject;
	//   32   89:aload_0         
	//   33   90:areturn         
_L12:
		pdfobject = ((PdfObject) (new PdfNull()));
	//   34   91:new             #633 <Class PdfNull>
	//   35   94:dup             
	//   36   95:invokespecial   #829 <Method void PdfNull()>
	//   37   98:astore_0        
		continue; /* Loop/switch isn't completed */
	//   38   99:goto            84
_L10:
		pdfobject = ((PdfObject) (new PdfBoolean(((PdfBoolean)pdfobject).booleanValue())));
	//   39  102:new             #831 <Class PdfBoolean>
	//   40  105:dup             
	//   41  106:aload_0         
	//   42  107:checkcast       #831 <Class PdfBoolean>
	//   43  110:invokevirtual   #834 <Method boolean PdfBoolean.booleanValue()>
	//   44  113:invokespecial   #837 <Method void PdfBoolean(boolean)>
	//   45  116:astore_0        
		continue; /* Loop/switch isn't completed */
	//   46  117:goto            84
_L11:
		pdfobject = ((PdfObject) (new PdfName(pdfobject.getBytes())));
	//   47  120:new             #103 <Class PdfName>
	//   48  123:dup             
	//   49  124:aload_0         
	//   50  125:invokevirtual   #838 <Method byte[] PdfObject.getBytes()>
	//   51  128:invokespecial   #839 <Method void PdfName(byte[])>
	//   52  131:astore_0        
		if(true) goto _L9; else goto _L4
	//   53  132:goto            84
_L4:
		return getPdfObject(pdfobject);
	//   54  135:aload_0         
	//   55  136:invokestatic    #524 <Method PdfObject getPdfObject(PdfObject)>
	//   56  139:areturn         
	}

	public static PdfObject getPdfObjectRelease(PdfObject pdfobject)
	{
		PdfObject pdfobject1 = getPdfObject(pdfobject);
	//    0    0:aload_0         
	//    1    1:invokestatic    #524 <Method PdfObject getPdfObject(PdfObject)>
	//    2    4:astore_1        
		releaseLastXrefPartial(pdfobject);
	//    3    5:aload_0         
	//    4    6:invokestatic    #850 <Method void releaseLastXrefPartial(PdfObject)>
		return pdfobject1;
	//    5    9:aload_1         
	//    6   10:areturn         
	}

	public static PdfObject getPdfObjectRelease(PdfObject pdfobject, PdfObject pdfobject1)
	{
		pdfobject1 = getPdfObject(pdfobject, pdfobject1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #852 <Method PdfObject getPdfObject(PdfObject, PdfObject)>
	//    3    5:astore_1        
		releaseLastXrefPartial(pdfobject);
	//    4    6:aload_0         
	//    5    7:invokestatic    #850 <Method void releaseLastXrefPartial(PdfObject)>
		return pdfobject1;
	//    6   10:aload_1         
	//    7   11:areturn         
	}

	public static byte[] getStreamBytes(PRStream prstream)
		throws IOException
	{
		RandomAccessFileOrArray randomaccessfileorarray = prstream.getReader().getSafeFile();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #805 <Method PdfReader PRStream.getReader()>
	//    2    4:invokevirtual   #806 <Method RandomAccessFileOrArray getSafeFile()>
	//    3    7:astore_1        
		randomaccessfileorarray.reOpen();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #809 <Method void RandomAccessFileOrArray.reOpen()>
		prstream = ((PRStream) (getStreamBytes(prstream, randomaccessfileorarray)));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #813 <Method byte[] getStreamBytes(PRStream, RandomAccessFileOrArray)>
	//    9   17:astore_0        
		try
		{
			randomaccessfileorarray.close();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #814 <Method void RandomAccessFileOrArray.close()>
		}
	//*  12   22:aload_0         
	//*  13   23:areturn         
	//*  14   24:astore_0        
	//*  15   25:aload_1         
	//*  16   26:invokevirtual   #814 <Method void RandomAccessFileOrArray.close()>
	//*  17   29:aload_0         
	//*  18   30:athrow          
		catch(Exception exception)
	//*  19   31:astore_1        
		{
			return ((byte []) (prstream));
	//   20   32:aload_0         
	//   21   33:areturn         
		}
		return ((byte []) (prstream));
		prstream;
		try
		{
			randomaccessfileorarray.close();
		}
		catch(Exception exception1) { }
	//   22   34:astore_1        
		throw prstream;
	//*  23   35:goto            29
	}

	public static byte[] getStreamBytes(PRStream prstream, RandomAccessFileOrArray randomaccessfileorarray)
		throws IOException
	{
		return decodeBytes(getStreamBytesRaw(prstream, randomaccessfileorarray), ((PdfDictionary) (prstream)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #856 <Method byte[] getStreamBytesRaw(PRStream, RandomAccessFileOrArray)>
	//    3    5:aload_0         
	//    4    6:invokestatic    #858 <Method byte[] decodeBytes(byte[], PdfDictionary)>
	//    5    9:areturn         
	}

	public static byte[] getStreamBytesRaw(PRStream prstream)
		throws IOException
	{
		RandomAccessFileOrArray randomaccessfileorarray = prstream.getReader().getSafeFile();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #805 <Method PdfReader PRStream.getReader()>
	//    2    4:invokevirtual   #806 <Method RandomAccessFileOrArray getSafeFile()>
	//    3    7:astore_1        
		randomaccessfileorarray.reOpen();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #809 <Method void RandomAccessFileOrArray.reOpen()>
		prstream = ((PRStream) (getStreamBytesRaw(prstream, randomaccessfileorarray)));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #856 <Method byte[] getStreamBytesRaw(PRStream, RandomAccessFileOrArray)>
	//    9   17:astore_0        
		try
		{
			randomaccessfileorarray.close();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #814 <Method void RandomAccessFileOrArray.close()>
		}
	//*  12   22:aload_0         
	//*  13   23:areturn         
	//*  14   24:astore_0        
	//*  15   25:aload_1         
	//*  16   26:invokevirtual   #814 <Method void RandomAccessFileOrArray.close()>
	//*  17   29:aload_0         
	//*  18   30:athrow          
		catch(Exception exception)
	//*  19   31:astore_1        
		{
			return ((byte []) (prstream));
	//   20   32:aload_0         
	//   21   33:areturn         
		}
		return ((byte []) (prstream));
		prstream;
		try
		{
			randomaccessfileorarray.close();
		}
		catch(Exception exception1) { }
	//   22   34:astore_1        
		throw prstream;
	//*  23   35:goto            29
	}

	public static byte[] getStreamBytesRaw(PRStream prstream, RandomAccessFileOrArray randomaccessfileorarray)
		throws IOException
	{
		Object obj = ((Object) (prstream.getReader()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #805 <Method PdfReader PRStream.getReader()>
	//    2    4:astore          6
		if(prstream.getOffset() >= 0L) goto _L2; else goto _L1
	//    3    6:aload_0         
	//    4    7:invokevirtual   #456 <Method long PRStream.getOffset()>
	//    5   10:lconst_0        
	//    6   11:lcmp            
	//    7   12:ifge            22
_L1:
		randomaccessfileorarray = ((RandomAccessFileOrArray) (prstream.getBytes()));
	//    8   15:aload_0         
	//    9   16:invokevirtual   #859 <Method byte[] PRStream.getBytes()>
	//   10   19:astore_1        
_L4:
		return ((byte []) (randomaccessfileorarray));
	//   11   20:aload_1         
	//   12   21:areturn         
_L2:
		int i;
		byte abyte0[] = new byte[prstream.getLength()];
	//   13   22:aload_0         
	//   14   23:invokevirtual   #862 <Method int PRStream.getLength()>
	//   15   26:newarray        byte[]
	//   16   28:astore          5
		randomaccessfileorarray.seek(prstream.getOffset());
	//   17   30:aload_1         
	//   18   31:aload_0         
	//   19   32:invokevirtual   #456 <Method long PRStream.getOffset()>
	//   20   35:invokevirtual   #863 <Method void RandomAccessFileOrArray.seek(long)>
		randomaccessfileorarray.readFully(abyte0);
	//   21   38:aload_1         
	//   22   39:aload           5
	//   23   41:invokevirtual   #865 <Method void RandomAccessFileOrArray.readFully(byte[])>
		PdfEncryption pdfencryption = ((PdfReader) (obj)).getDecrypt();
	//   24   44:aload           6
	//   25   46:invokevirtual   #869 <Method PdfEncryption getDecrypt()>
	//   26   49:astore          7
		randomaccessfileorarray = ((RandomAccessFileOrArray) (abyte0));
	//   27   51:aload           5
	//   28   53:astore_1        
		if(pdfencryption == null)
			continue; /* Loop/switch isn't completed */
	//   29   54:aload           7
	//   30   56:ifnull          20
		PdfObject pdfobject = getPdfObjectRelease(prstream.get(PdfName.FILTER));
	//   31   59:aload_0         
	//   32   60:getstatic       #602 <Field PdfName PdfName.FILTER>
	//   33   63:invokevirtual   #462 <Method PdfObject PRStream.get(PdfName)>
	//   34   66:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//   35   69:astore          8
		obj = ((Object) (new ArrayList()));
	//   36   71:new             #167 <Class ArrayList>
	//   37   74:dup             
	//   38   75:invokespecial   #168 <Method void ArrayList()>
	//   39   78:astore          6
		randomaccessfileorarray = ((RandomAccessFileOrArray) (obj));
	//   40   80:aload           6
	//   41   82:astore_1        
		boolean flag;
		boolean flag1;
		if(pdfobject != null)
	//*  42   83:aload           8
	//*  43   85:ifnull          107
			if(pdfobject.isName())
	//*  44   88:aload           8
	//*  45   90:invokevirtual   #551 <Method boolean PdfObject.isName()>
	//*  46   93:ifeq            185
			{
				((ArrayList) (obj)).add(((Object) (pdfobject)));
	//   47   96:aload           6
	//   48   98:aload           8
	//   49  100:invokevirtual   #605 <Method boolean ArrayList.add(Object)>
	//   50  103:pop             
				randomaccessfileorarray = ((RandomAccessFileOrArray) (obj));
	//   51  104:aload           6
	//   52  106:astore_1        
			} else
	//*  53  107:iconst_0        
	//*  54  108:istore          4
	//*  55  110:iconst_0        
	//*  56  111:istore_2        
	//*  57  112:iload           4
	//*  58  114:istore_3        
	//*  59  115:iload_2         
	//*  60  116:aload_1         
	//*  61  117:invokevirtual   #258 <Method int ArrayList.size()>
	//*  62  120:icmpge          157
	//*  63  123:aload_1         
	//*  64  124:iload_2         
	//*  65  125:invokevirtual   #262 <Method Object ArrayList.get(int)>
	//*  66  128:checkcast       #264 <Class PdfObject>
	//*  67  131:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//*  68  134:astore          6
	//*  69  136:aload           6
	//*  70  138:ifnull          208
	//*  71  141:aload           6
	//*  72  143:invokevirtual   #586 <Method String PdfObject.toString()>
	//*  73  146:ldc2            #871 <String "/Crypt">
	//*  74  149:invokevirtual   #872 <Method boolean String.equals(Object)>
	//*  75  152:ifeq            208
	//*  76  155:iconst_1        
	//*  77  156:istore_3        
	//*  78  157:aload           5
	//*  79  159:astore_1        
	//*  80  160:iload_3         
	//*  81  161:ifne            20
	//*  82  164:aload           7
	//*  83  166:aload_0         
	//*  84  167:invokevirtual   #875 <Method int PRStream.getObjNum()>
	//*  85  170:aload_0         
	//*  86  171:invokevirtual   #878 <Method int PRStream.getObjGen()>
	//*  87  174:invokevirtual   #882 <Method void PdfEncryption.setHashKey(int, int)>
	//*  88  177:aload           7
	//*  89  179:aload           5
	//*  90  181:invokevirtual   #885 <Method byte[] PdfEncryption.decryptByteArray(byte[])>
	//*  91  184:areturn         
			{
				randomaccessfileorarray = ((RandomAccessFileOrArray) (obj));
	//   92  185:aload           6
	//   93  187:astore_1        
				if(pdfobject.isArray())
	//*  94  188:aload           8
	//*  95  190:invokevirtual   #611 <Method boolean PdfObject.isArray()>
	//*  96  193:ifeq            107
					randomaccessfileorarray = ((RandomAccessFileOrArray) (((PdfArray)pdfobject).getArrayList()));
	//   97  196:aload           8
	//   98  198:checkcast       #558 <Class PdfArray>
	//   99  201:invokevirtual   #628 <Method ArrayList PdfArray.getArrayList()>
	//  100  204:astore_1        
			}
		flag1 = false;
		i = 0;
_L5:
label0:
		{
			flag = flag1;
			if(i < ((ArrayList) (randomaccessfileorarray)).size())
			{
				obj = ((Object) (getPdfObjectRelease((PdfObject)((ArrayList) (randomaccessfileorarray)).get(i))));
				if(obj == null || !((PdfObject) (obj)).toString().equals("/Crypt"))
					break label0;
				flag = true;
			}
			randomaccessfileorarray = ((RandomAccessFileOrArray) (abyte0));
			if(!flag)
			{
				pdfencryption.setHashKey(prstream.getObjNum(), prstream.getObjGen());
				return pdfencryption.decryptByteArray(abyte0);
			}
		}
		if(true) goto _L4; else goto _L3
	//* 101  205:goto            107
_L3:
		i++;
	//  102  208:iload_2         
	//  103  209:iconst_1        
	//  104  210:iadd            
	//  105  211:istore_2        
		  goto _L5
		if(true) goto _L4; else goto _L6
_L6:
	//* 106  212:goto            112
	}

	static String getSubsetPrefix(PdfDictionary pdfdictionary)
	{
		if(pdfdictionary != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnonnull       8
_L1:
		pdfdictionary = null;
	//    2    4:aconst_null     
	//    3    5:astore_0        
_L4:
		return ((String) (pdfdictionary));
	//    4    6:aload_0         
	//    5    7:areturn         
_L2:
		String s = getFontName(pdfdictionary);
	//    6    8:aload_0         
	//    7    9:invokestatic    #888 <Method String getFontName(PdfDictionary)>
	//    8   12:astore_3        
		if(s == null)
	//*   9   13:aload_3         
	//*  10   14:ifnonnull       19
			return null;
	//   11   17:aconst_null     
	//   12   18:areturn         
		if(s.length() < 8 || s.charAt(6) != '+')
	//*  13   19:aload_3         
	//*  14   20:invokevirtual   #890 <Method int String.length()>
	//*  15   23:bipush          8
	//*  16   25:icmplt          39
	//*  17   28:aload_3         
	//*  18   29:bipush          6
	//*  19   31:invokevirtual   #894 <Method char String.charAt(int)>
	//*  20   34:bipush          43
	//*  21   36:icmpeq          41
			return null;
	//   22   39:aconst_null     
	//   23   40:areturn         
		int i = 0;
	//   24   41:iconst_0        
	//   25   42:istore_1        
		do
		{
			pdfdictionary = ((PdfDictionary) (s));
	//   26   43:aload_3         
	//   27   44:astore_0        
			if(i >= 6)
				continue;
	//   28   45:iload_1         
	//   29   46:bipush          6
	//   30   48:icmpge          6
			char c = s.charAt(i);
	//   31   51:aload_3         
	//   32   52:iload_1         
	//   33   53:invokevirtual   #894 <Method char String.charAt(int)>
	//   34   56:istore_2        
			if(c < 'A' || c > 'Z')
	//*  35   57:iload_2         
	//*  36   58:bipush          65
	//*  37   60:icmplt          69
	//*  38   63:iload_2         
	//*  39   64:bipush          90
	//*  40   66:icmple          71
				return null;
	//   41   69:aconst_null     
	//   42   70:areturn         
			i++;
	//   43   71:iload_1         
	//   44   72:iconst_1        
	//   45   73:iadd            
	//   46   74:istore_1        
		} while(true);
	//   47   75:goto            43
		if(true) goto _L4; else goto _L3
_L3:
	}

	private void iterateBookmarks(PdfObject pdfobject, HashMap hashmap)
	{
		for(; pdfobject != null; pdfobject = ((PdfDictionary) (pdfobject)).get(PdfName.NEXT))
	//*   0    0:aload_1         
	//*   1    1:ifnull          48
		{
			replaceNamedDestination(pdfobject, hashmap);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #899 <Method boolean replaceNamedDestination(PdfObject, HashMap)>
	//    6   10:pop             
			pdfobject = ((PdfObject) ((PdfDictionary)getPdfObjectRelease(pdfobject)));
	//    7   11:aload_1         
	//    8   12:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//    9   15:checkcast       #281 <Class PdfDictionary>
	//   10   18:astore_1        
			PdfObject pdfobject1 = ((PdfDictionary) (pdfobject)).get(PdfName.FIRST);
	//   11   19:aload_1         
	//   12   20:getstatic       #902 <Field PdfName PdfName.FIRST>
	//   13   23:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   14   26:astore_3        
			if(pdfobject1 != null)
	//*  15   27:aload_3         
	//*  16   28:ifnull          37
				iterateBookmarks(pdfobject1, hashmap);
	//   17   31:aload_0         
	//   18   32:aload_3         
	//   19   33:aload_2         
	//   20   34:invokespecial   #904 <Method void iterateBookmarks(PdfObject, HashMap)>
		}

	//   21   37:aload_1         
	//   22   38:getstatic       #907 <Field PdfName PdfName.NEXT>
	//   23   41:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   24   44:astore_1        
	//*  25   45:goto            0
	//   26   48:return          
	}

	public static PdfObject killIndirect(PdfObject pdfobject)
	{
		Object obj;
		if(pdfobject == null || pdfobject.isNull())
	//*   0    0:aload_0         
	//*   1    1:ifnull          11
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #912 <Method boolean PdfObject.isNull()>
	//*   4    8:ifeq            15
		{
			obj = null;
	//    5   11:aconst_null     
	//    6   12:astore_2        
		} else
	//*   7   13:aload_2         
	//*   8   14:areturn         
		{
			PdfObject pdfobject1 = getPdfObjectRelease(pdfobject);
	//    9   15:aload_0         
	//   10   16:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//   11   19:astore_3        
			obj = ((Object) (pdfobject1));
	//   12   20:aload_3         
	//   13   21:astore_2        
			if(pdfobject.isIndirect())
	//*  14   22:aload_0         
	//*  15   23:invokevirtual   #817 <Method boolean PdfObject.isIndirect()>
	//*  16   26:ifeq            13
			{
				obj = ((Object) ((PRIndirectReference)pdfobject));
	//   17   29:aload_0         
	//   18   30:checkcast       #305 <Class PRIndirectReference>
	//   19   33:astore_2        
				pdfobject = ((PdfObject) (((PRIndirectReference) (obj)).getReader()));
	//   20   34:aload_2         
	//   21   35:invokevirtual   #818 <Method PdfReader PRIndirectReference.getReader()>
	//   22   38:astore_0        
				int i = ((PRIndirectReference) (obj)).getNumber();
	//   23   39:aload_2         
	//   24   40:invokevirtual   #730 <Method int PRIndirectReference.getNumber()>
	//   25   43:istore_1        
				((PdfReader) (pdfobject)).xrefObj.set(i, ((Object) (null)));
	//   26   44:aload_0         
	//   27   45:getfield        #251 <Field ArrayList xrefObj>
	//   28   48:iload_1         
	//   29   49:aconst_null     
	//   30   50:invokevirtual   #272 <Method Object ArrayList.set(int, Object)>
	//   31   53:pop             
				obj = ((Object) (pdfobject1));
	//   32   54:aload_3         
	//   33   55:astore_2        
				if(((PdfReader) (pdfobject)).partial)
	//*  34   56:aload_0         
	//*  35   57:getfield        #187 <Field boolean partial>
	//*  36   60:ifeq            13
				{
					((PdfReader) (pdfobject)).xref[i * 2] = -1L;
	//   37   63:aload_0         
	//   38   64:getfield        #301 <Field long[] xref>
	//   39   67:iload_1         
	//   40   68:iconst_2        
	//   41   69:imul            
	//   42   70:ldc2w           #913 <Long -1L>
	//   43   73:lastore         
					return pdfobject1;
	//   44   74:aload_3         
	//   45   75:areturn         
				}
			}
		}
		return ((PdfObject) (obj));
	}

	private void readDecryptedDocObj()
		throws IOException
	{
		if(!encrypted) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field boolean encrypted>
	//    2    4:ifeq            8
_L1:
		PdfObject pdfobject1;
		return;
	//    3    7:return          
	//*   4    8:aload_0         
	//*   5    9:getfield        #279 <Field PdfDictionary trailer>
	//*   6   12:getstatic       #918 <Field PdfName PdfName.ENCRYPT>
	//*   7   15:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//*   8   18:astore          14
_L2:
		if((pdfobject1 = trailer.get(PdfName.ENCRYPT)) == null || pdfobject1.toString().equals("null")) goto _L1; else goto _L3
	//    9   20:aload           14
	//   10   22:ifnull          7
	//   11   25:aload           14
	//   12   27:invokevirtual   #586 <Method String PdfObject.toString()>
	//   13   30:ldc2            #637 <String "null">
	//   14   33:invokevirtual   #872 <Method boolean String.equals(Object)>
	//   15   36:ifne            7
_L3:
		Object obj;
		X509CertificateHolder x509certificateholder;
		PdfDictionary pdfdictionary;
		encryptionError = true;
	//   16   39:aload_0         
	//   17   40:iconst_1        
	//   18   41:putfield        #920 <Field boolean encryptionError>
		x509certificateholder = null;
	//   19   44:aconst_null     
	//   20   45:astore          13
		encrypted = true;
	//   21   47:aload_0         
	//   22   48:iconst_1        
	//   23   49:putfield        #151 <Field boolean encrypted>
		pdfdictionary = (PdfDictionary)getPdfObject(pdfobject1);
	//   24   52:aload           14
	//   25   54:invokestatic    #524 <Method PdfObject getPdfObject(PdfObject)>
	//   26   57:checkcast       #281 <Class PdfDictionary>
	//   27   60:astore          15
		obj = ((Object) (pdfdictionary.getAsDict(PdfName.CF)));
	//   28   62:aload           15
	//   29   64:getstatic       #923 <Field PdfName PdfName.CF>
	//   30   67:invokevirtual   #288 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   31   70:astore          7
		if(obj == null)
			break; /* Loop/switch isn't completed */
	//   32   72:aload           7
	//   33   74:ifnull          125
		obj = ((Object) (((PdfDictionary) (obj)).getAsDict(PdfName.STDCF)));
	//   34   77:aload           7
	//   35   79:getstatic       #926 <Field PdfName PdfName.STDCF>
	//   36   82:invokevirtual   #288 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   37   85:astore          7
		if(obj == null)
			break; /* Loop/switch isn't completed */
	//   38   87:aload           7
	//   39   89:ifnull          125
		obj = ((Object) (((PdfDictionary) (obj)).getAsName(PdfName.AUTHEVENT)));
	//   40   92:aload           7
	//   41   94:getstatic       #929 <Field PdfName PdfName.AUTHEVENT>
	//   42   97:invokevirtual   #933 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//   43  100:astore          7
		if(obj != null && ((PdfName) (obj)).compareTo(PdfName.EFOPEN) == 0 && !ownerPasswordUsed) goto _L1; else goto _L4
	//   44  102:aload           7
	//   45  104:ifnull          125
	//   46  107:aload           7
	//   47  109:getstatic       #936 <Field PdfName PdfName.EFOPEN>
	//   48  112:invokevirtual   #940 <Method int PdfName.compareTo(PdfName)>
	//   49  115:ifne            125
	//   50  118:aload_0         
	//   51  119:getfield        #307 <Field boolean ownerPasswordUsed>
	//   52  122:ifeq            7
_L4:
		int i;
		int j1;
		byte abyte2[];
		byte abyte4[];
		byte abyte5[];
		PdfObject pdfobject2;
		PdfArray pdfarray = trailer.getAsArray(PdfName.ID);
	//   53  125:aload_0         
	//   54  126:getfield        #279 <Field PdfDictionary trailer>
	//   55  129:getstatic       #943 <Field PdfName PdfName.ID>
	//   56  132:invokevirtual   #947 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   57  135:astore          9
		obj = null;
	//   58  137:aconst_null     
	//   59  138:astore          7
		if(pdfarray != null)
	//*  60  140:aload           9
	//*  61  142:ifnull          204
		{
			obj = ((Object) (pdfarray.getPdfObject(0)));
	//   62  145:aload           9
	//   63  147:iconst_0        
	//   64  148:invokevirtual   #763 <Method PdfObject PdfArray.getPdfObject(int)>
	//   65  151:astore          7
			strings.remove(obj);
	//   66  153:aload_0         
	//   67  154:getfield        #170 <Field ArrayList strings>
	//   68  157:aload           7
	//   69  159:invokevirtual   #949 <Method boolean ArrayList.remove(Object)>
	//   70  162:pop             
			byte abyte0[] = DocWriter.getISOBytes(((PdfObject) (obj)).toString());
	//   71  163:aload           7
	//   72  165:invokevirtual   #586 <Method String PdfObject.toString()>
	//   73  168:invokestatic    #955 <Method byte[] DocWriter.getISOBytes(String)>
	//   74  171:astore          8
			obj = ((Object) (abyte0));
	//   75  173:aload           8
	//   76  175:astore          7
			if(pdfarray.size() > 1)
	//*  77  177:aload           9
	//*  78  179:invokevirtual   #719 <Method int PdfArray.size()>
	//*  79  182:iconst_1        
	//*  80  183:icmple          204
			{
				strings.remove(((Object) (pdfarray.getPdfObject(1))));
	//   81  186:aload_0         
	//   82  187:getfield        #170 <Field ArrayList strings>
	//   83  190:aload           9
	//   84  192:iconst_1        
	//   85  193:invokevirtual   #763 <Method PdfObject PdfArray.getPdfObject(int)>
	//   86  196:invokevirtual   #949 <Method boolean ArrayList.remove(Object)>
	//   87  199:pop             
				obj = ((Object) (abyte0));
	//   88  200:aload           8
	//   89  202:astore          7
			}
		}
		abyte2 = ((byte []) (obj));
	//   90  204:aload           7
	//   91  206:astore          9
		if(obj == null)
	//*  92  208:aload           7
	//*  93  210:ifnonnull       218
			abyte2 = new byte[0];
	//   94  213:iconst_0        
	//   95  214:newarray        byte[]
	//   96  216:astore          9
		abyte4 = null;
	//   97  218:aconst_null     
	//   98  219:astore          11
		abyte5 = null;
	//   99  221:aconst_null     
	//  100  222:astore          12
		i = 0;
	//  101  224:iconst_0        
	//  102  225:istore_1        
		j1 = 0;
	//  103  226:iconst_0        
	//  104  227:istore          4
		pdfobject2 = getPdfObjectRelease(pdfdictionary.get(PdfName.FILTER));
	//  105  229:aload           15
	//  106  231:getstatic       #602 <Field PdfName PdfName.FILTER>
	//  107  234:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//  108  237:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//  109  240:astore          16
		if(!((Object) (pdfobject2)).equals(((Object) (PdfName.STANDARD)))) goto _L6; else goto _L5
	//  110  242:aload           16
	//  111  244:getstatic       #958 <Field PdfName PdfName.STANDARD>
	//  112  247:invokevirtual   #959 <Method boolean Object.equals(Object)>
	//  113  250:ifeq            1087
_L5:
		obj = ((Object) (pdfdictionary.get(PdfName.U).toString()));
	//  114  253:aload           15
	//  115  255:getstatic       #962 <Field PdfName PdfName.U>
	//  116  258:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//  117  261:invokevirtual   #586 <Method String PdfObject.toString()>
	//  118  264:astore          7
		strings.remove(((Object) (pdfdictionary.get(PdfName.U))));
	//  119  266:aload_0         
	//  120  267:getfield        #170 <Field ArrayList strings>
	//  121  270:aload           15
	//  122  272:getstatic       #962 <Field PdfName PdfName.U>
	//  123  275:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//  124  278:invokevirtual   #949 <Method boolean ArrayList.remove(Object)>
	//  125  281:pop             
		abyte4 = DocWriter.getISOBytes(((String) (obj)));
	//  126  282:aload           7
	//  127  284:invokestatic    #955 <Method byte[] DocWriter.getISOBytes(String)>
	//  128  287:astore          11
		obj = ((Object) (pdfdictionary.get(PdfName.O).toString()));
	//  129  289:aload           15
	//  130  291:getstatic       #965 <Field PdfName PdfName.O>
	//  131  294:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//  132  297:invokevirtual   #586 <Method String PdfObject.toString()>
	//  133  300:astore          7
		strings.remove(((Object) (pdfdictionary.get(PdfName.O))));
	//  134  302:aload_0         
	//  135  303:getfield        #170 <Field ArrayList strings>
	//  136  306:aload           15
	//  137  308:getstatic       #965 <Field PdfName PdfName.O>
	//  138  311:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//  139  314:invokevirtual   #949 <Method boolean ArrayList.remove(Object)>
	//  140  317:pop             
		abyte5 = DocWriter.getISOBytes(((String) (obj)));
	//  141  318:aload           7
	//  142  320:invokestatic    #955 <Method byte[] DocWriter.getISOBytes(String)>
	//  143  323:astore          12
		if(pdfdictionary.contains(PdfName.OE))
	//* 144  325:aload           15
	//* 145  327:getstatic       #968 <Field PdfName PdfName.OE>
	//* 146  330:invokevirtual   #972 <Method boolean PdfDictionary.contains(PdfName)>
	//* 147  333:ifeq            352
			strings.remove(((Object) (pdfdictionary.get(PdfName.OE))));
	//  148  336:aload_0         
	//  149  337:getfield        #170 <Field ArrayList strings>
	//  150  340:aload           15
	//  151  342:getstatic       #968 <Field PdfName PdfName.OE>
	//  152  345:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//  153  348:invokevirtual   #949 <Method boolean ArrayList.remove(Object)>
	//  154  351:pop             
		if(pdfdictionary.contains(PdfName.UE))
	//* 155  352:aload           15
	//* 156  354:getstatic       #975 <Field PdfName PdfName.UE>
	//* 157  357:invokevirtual   #972 <Method boolean PdfDictionary.contains(PdfName)>
	//* 158  360:ifeq            379
			strings.remove(((Object) (pdfdictionary.get(PdfName.UE))));
	//  159  363:aload_0         
	//  160  364:getfield        #170 <Field ArrayList strings>
	//  161  367:aload           15
	//  162  369:getstatic       #975 <Field PdfName PdfName.UE>
	//  163  372:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//  164  375:invokevirtual   #949 <Method boolean ArrayList.remove(Object)>
	//  165  378:pop             
		if(pdfdictionary.contains(PdfName.PERMS))
	//* 166  379:aload           15
	//* 167  381:getstatic       #978 <Field PdfName PdfName.PERMS>
	//* 168  384:invokevirtual   #972 <Method boolean PdfDictionary.contains(PdfName)>
	//* 169  387:ifeq            406
			strings.remove(((Object) (pdfdictionary.get(PdfName.PERMS))));
	//  170  390:aload_0         
	//  171  391:getfield        #170 <Field ArrayList strings>
	//  172  394:aload           15
	//  173  396:getstatic       #978 <Field PdfName PdfName.PERMS>
	//  174  399:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//  175  402:invokevirtual   #949 <Method boolean ArrayList.remove(Object)>
	//  176  405:pop             
		obj = ((Object) (pdfdictionary.get(PdfName.P)));
	//  177  406:aload           15
	//  178  408:getstatic       #981 <Field PdfName PdfName.P>
	//  179  411:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//  180  414:astore          7
		if(!((PdfObject) (obj)).isNumber())
	//* 181  416:aload           7
	//* 182  418:invokevirtual   #663 <Method boolean PdfObject.isNumber()>
	//* 183  421:ifne            442
			throw new InvalidPdfException(MessageLocalization.getComposedMessage("illegal.p.value", new Object[0]));
	//  184  424:new             #983 <Class InvalidPdfException>
	//  185  427:dup             
	//  186  428:ldc2            #985 <String "illegal.p.value">
	//  187  431:iconst_0        
	//  188  432:anewarray       Object[]
	//  189  435:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  190  438:invokespecial   #986 <Method void InvalidPdfException(String)>
	//  191  441:athrow          
		pValue = ((PdfNumber)obj).longValue();
	//  192  442:aload_0         
	//  193  443:aload           7
	//  194  445:checkcast       #471 <Class PdfNumber>
	//  195  448:invokevirtual   #989 <Method long PdfNumber.longValue()>
	//  196  451:putfield        #247 <Field long pValue>
		obj = ((Object) (pdfdictionary.get(PdfName.R)));
	//  197  454:aload           15
	//  198  456:getstatic       #992 <Field PdfName PdfName.R>
	//  199  459:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//  200  462:astore          7
		if(!((PdfObject) (obj)).isNumber())
	//* 201  464:aload           7
	//* 202  466:invokevirtual   #663 <Method boolean PdfObject.isNumber()>
	//* 203  469:ifne            490
			throw new InvalidPdfException(MessageLocalization.getComposedMessage("illegal.r.value", new Object[0]));
	//  204  472:new             #983 <Class InvalidPdfException>
	//  205  475:dup             
	//  206  476:ldc2            #994 <String "illegal.r.value">
	//  207  479:iconst_0        
	//  208  480:anewarray       Object[]
	//  209  483:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  210  486:invokespecial   #986 <Method void InvalidPdfException(String)>
	//  211  489:athrow          
		rValue = ((PdfNumber)obj).intValue();
	//  212  490:aload_0         
	//  213  491:aload           7
	//  214  493:checkcast       #471 <Class PdfNumber>
	//  215  496:invokevirtual   #474 <Method int PdfNumber.intValue()>
	//  216  499:putfield        #249 <Field int rValue>
		rValue;
	//  217  502:aload_0         
	//  218  503:getfield        #249 <Field int rValue>
		JVM INSTR tableswitch 2 5: default 536
	//	               2 554
	//	               3 682
	//	               4 782
	//	               5 999;
	//  219  506:tableswitch     2 5: default 536
	//	               2 554
	//	               3 682
	//	               4 782
	//	               5 999
		   goto _L7 _L8 _L9 _L10 _L11
_L7:
		throw new UnsupportedPdfException(MessageLocalization.getComposedMessage("unknown.encryption.type.r.eq.1", rValue));
	//  220  536:new             #621 <Class UnsupportedPdfException>
	//  221  539:dup             
	//  222  540:ldc2            #996 <String "unknown.encryption.type.r.eq.1">
	//  223  543:aload_0         
	//  224  544:getfield        #249 <Field int rValue>
	//  225  547:invokestatic    #999 <Method String MessageLocalization.getComposedMessage(String, int)>
	//  226  550:invokespecial   #624 <Method void UnsupportedPdfException(String)>
	//  227  553:athrow          
_L8:
		int j;
		byte abyte1[];
		byte abyte3[];
		i = 0;
	//  228  554:iconst_0        
	//  229  555:istore_1        
		j = j1;
	//  230  556:iload           4
	//  231  558:istore_2        
		abyte3 = ((byte []) (x509certificateholder));
	//  232  559:aload           13
	//  233  561:astore          10
		abyte1 = abyte5;
	//  234  563:aload           12
	//  235  565:astore          8
		obj = ((Object) (abyte4));
	//  236  567:aload           11
	//  237  569:astore          7
		break; /* Loop/switch isn't completed */
	//* 238  571:aload_0         
	//* 239  572:new             #242 <Class PdfEncryption>
	//* 240  575:dup             
	//* 241  576:invokespecial   #1000 <Method void PdfEncryption()>
	//* 242  579:putfield        #240 <Field PdfEncryption decrypt>
	//* 243  582:aload_0         
	//* 244  583:getfield        #240 <Field PdfEncryption decrypt>
	//* 245  586:iload_1         
	//* 246  587:iload_2         
	//* 247  588:invokevirtual   #1003 <Method void PdfEncryption.setCryptoMode(int, int)>
	//* 248  591:aload           16
	//* 249  593:getstatic       #958 <Field PdfName PdfName.STANDARD>
	//* 250  596:invokevirtual   #959 <Method boolean Object.equals(Object)>
	//* 251  599:ifeq            2195
	//* 252  602:aload_0         
	//* 253  603:getfield        #249 <Field int rValue>
	//* 254  606:iconst_5        
	//* 255  607:icmpne          2037
	//* 256  610:aload_0         
	//* 257  611:aload_0         
	//* 258  612:getfield        #240 <Field PdfEncryption decrypt>
	//* 259  615:aload           15
	//* 260  617:aload_0         
	//* 261  618:getfield        #157 <Field byte[] password>
	//* 262  621:invokevirtual   #1007 <Method boolean PdfEncryption.readKey(PdfDictionary, byte[])>
	//* 263  624:putfield        #307 <Field boolean ownerPasswordUsed>
	//* 264  627:aload_0         
	//* 265  628:getfield        #240 <Field PdfEncryption decrypt>
	//* 266  631:aload           9
	//* 267  633:putfield        #1010 <Field byte[] PdfEncryption.documentID>
	//* 268  636:aload_0         
	//* 269  637:aload_0         
	//* 270  638:getfield        #240 <Field PdfEncryption decrypt>
	//* 271  641:invokevirtual   #1013 <Method long PdfEncryption.getPermissions()>
	//* 272  644:putfield        #247 <Field long pValue>
	//* 273  647:iconst_0        
	//* 274  648:istore_1        
	//* 275  649:iload_1         
	//* 276  650:aload_0         
	//* 277  651:getfield        #170 <Field ArrayList strings>
	//* 278  654:invokevirtual   #258 <Method int ArrayList.size()>
	//* 279  657:icmpge          2244
	//* 280  660:aload_0         
	//* 281  661:getfield        #170 <Field ArrayList strings>
	//* 282  664:iload_1         
	//* 283  665:invokevirtual   #262 <Method Object ArrayList.get(int)>
	//* 284  668:checkcast       #1015 <Class PdfString>
	//* 285  671:aload_0         
	//* 286  672:invokevirtual   #1017 <Method void PdfString.decrypt(PdfReader)>
	//* 287  675:iload_1         
	//* 288  676:iconst_1        
	//* 289  677:iadd            
	//* 290  678:istore_1        
	//* 291  679:goto            649
_L9:
		obj = ((Object) (pdfdictionary.get(PdfName.LENGTH)));
	//  292  682:aload           15
	//  293  684:getstatic       #459 <Field PdfName PdfName.LENGTH>
	//  294  687:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//  295  690:astore          7
		if(!((PdfObject) (obj)).isNumber())
	//* 296  692:aload           7
	//* 297  694:invokevirtual   #663 <Method boolean PdfObject.isNumber()>
	//* 298  697:ifne            718
			throw new InvalidPdfException(MessageLocalization.getComposedMessage("illegal.length.value", new Object[0]));
	//  299  700:new             #983 <Class InvalidPdfException>
	//  300  703:dup             
	//  301  704:ldc2            #1019 <String "illegal.length.value">
	//  302  707:iconst_0        
	//  303  708:anewarray       Object[]
	//  304  711:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  305  714:invokespecial   #986 <Method void InvalidPdfException(String)>
	//  306  717:athrow          
		j = ((PdfNumber)obj).intValue();
	//  307  718:aload           7
	//  308  720:checkcast       #471 <Class PdfNumber>
	//  309  723:invokevirtual   #474 <Method int PdfNumber.intValue()>
	//  310  726:istore_2        
		if(j > 128 || j < 40 || j % 8 != 0)
	//* 311  727:iload_2         
	//* 312  728:sipush          128
	//* 313  731:icmpgt          747
	//* 314  734:iload_2         
	//* 315  735:bipush          40
	//* 316  737:icmplt          747
	//* 317  740:iload_2         
	//* 318  741:bipush          8
	//* 319  743:irem            
	//* 320  744:ifeq            765
			throw new InvalidPdfException(MessageLocalization.getComposedMessage("illegal.length.value", new Object[0]));
	//  321  747:new             #983 <Class InvalidPdfException>
	//  322  750:dup             
	//  323  751:ldc2            #1019 <String "illegal.length.value">
	//  324  754:iconst_0        
	//  325  755:anewarray       Object[]
	//  326  758:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  327  761:invokespecial   #986 <Method void InvalidPdfException(String)>
	//  328  764:athrow          
		i = 1;
	//  329  765:iconst_1        
	//  330  766:istore_1        
		obj = ((Object) (abyte4));
	//  331  767:aload           11
	//  332  769:astore          7
		abyte1 = abyte5;
	//  333  771:aload           12
	//  334  773:astore          8
		abyte3 = ((byte []) (x509certificateholder));
	//  335  775:aload           13
	//  336  777:astore          10
		  goto _L12
	//* 337  779:goto            571
_L10:
		obj = ((Object) ((PdfDictionary)pdfdictionary.get(PdfName.CF)));
	//  338  782:aload           15
	//  339  784:getstatic       #923 <Field PdfName PdfName.CF>
	//  340  787:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//  341  790:checkcast       #281 <Class PdfDictionary>
	//  342  793:astore          7
		if(obj == null)
	//* 343  795:aload           7
	//* 344  797:ifnonnull       818
			throw new InvalidPdfException(MessageLocalization.getComposedMessage("cf.not.found.encryption", new Object[0]));
	//  345  800:new             #983 <Class InvalidPdfException>
	//  346  803:dup             
	//  347  804:ldc2            #1021 <String "cf.not.found.encryption">
	//  348  807:iconst_0        
	//  349  808:anewarray       Object[]
	//  350  811:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  351  814:invokespecial   #986 <Method void InvalidPdfException(String)>
	//  352  817:athrow          
		obj = ((Object) ((PdfDictionary)((PdfDictionary) (obj)).get(PdfName.STDCF)));
	//  353  818:aload           7
	//  354  820:getstatic       #926 <Field PdfName PdfName.STDCF>
	//  355  823:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//  356  826:checkcast       #281 <Class PdfDictionary>
	//  357  829:astore          7
		if(obj == null)
	//* 358  831:aload           7
	//* 359  833:ifnonnull       854
			throw new InvalidPdfException(MessageLocalization.getComposedMessage("stdcf.not.found.encryption", new Object[0]));
	//  360  836:new             #983 <Class InvalidPdfException>
	//  361  839:dup             
	//  362  840:ldc2            #1023 <String "stdcf.not.found.encryption">
	//  363  843:iconst_0        
	//  364  844:anewarray       Object[]
	//  365  847:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  366  850:invokespecial   #986 <Method void InvalidPdfException(String)>
	//  367  853:athrow          
		int k;
		PdfObject pdfobject3;
		if(PdfName.V2.equals(((Object) (((PdfDictionary) (obj)).get(PdfName.CFM)))))
	//* 368  854:getstatic       #1026 <Field PdfName PdfName.V2>
	//* 369  857:aload           7
	//* 370  859:getstatic       #1029 <Field PdfName PdfName.CFM>
	//* 371  862:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 372  865:invokevirtual   #545 <Method boolean PdfName.equals(Object)>
	//* 373  868:ifeq            959
			k = 1;
	//  374  871:iconst_1        
	//  375  872:istore_3        
		else
	//* 376  873:aload           15
	//* 377  875:getstatic       #1032 <Field PdfName PdfName.ENCRYPTMETADATA>
	//* 378  878:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 379  881:astore          17
	//* 380  883:aload           11
	//* 381  885:astore          7
	//* 382  887:aload           12
	//* 383  889:astore          8
	//* 384  891:iload_3         
	//* 385  892:istore_1        
	//* 386  893:aload           13
	//* 387  895:astore          10
	//* 388  897:iload           4
	//* 389  899:istore_2        
	//* 390  900:aload           17
	//* 391  902:ifnull          571
	//* 392  905:aload           11
	//* 393  907:astore          7
	//* 394  909:aload           12
	//* 395  911:astore          8
	//* 396  913:iload_3         
	//* 397  914:istore_1        
	//* 398  915:aload           13
	//* 399  917:astore          10
	//* 400  919:iload           4
	//* 401  921:istore_2        
	//* 402  922:aload           17
	//* 403  924:invokevirtual   #586 <Method String PdfObject.toString()>
	//* 404  927:ldc2            #1034 <String "false">
	//* 405  930:invokevirtual   #872 <Method boolean String.equals(Object)>
	//* 406  933:ifeq            571
	//* 407  936:iload_3         
	//* 408  937:bipush          8
	//* 409  939:ior             
	//* 410  940:istore_1        
	//* 411  941:aload           11
	//* 412  943:astore          7
	//* 413  945:aload           12
	//* 414  947:astore          8
	//* 415  949:aload           13
	//* 416  951:astore          10
	//* 417  953:iload           4
	//* 418  955:istore_2        
	//* 419  956:goto            571
		if(PdfName.AESV2.equals(((Object) (((PdfDictionary) (obj)).get(PdfName.CFM)))))
	//* 420  959:getstatic       #1037 <Field PdfName PdfName.AESV2>
	//* 421  962:aload           7
	//* 422  964:getstatic       #1029 <Field PdfName PdfName.CFM>
	//* 423  967:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 424  970:invokevirtual   #545 <Method boolean PdfName.equals(Object)>
	//* 425  973:ifeq            981
			k = 2;
	//  426  976:iconst_2        
	//  427  977:istore_3        
		else
	//* 428  978:goto            873
			throw new UnsupportedPdfException(MessageLocalization.getComposedMessage("no.compatible.encryption.found", new Object[0]));
	//  429  981:new             #621 <Class UnsupportedPdfException>
	//  430  984:dup             
	//  431  985:ldc2            #1039 <String "no.compatible.encryption.found">
	//  432  988:iconst_0        
	//  433  989:anewarray       Object[]
	//  434  992:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  435  995:invokespecial   #624 <Method void UnsupportedPdfException(String)>
	//  436  998:athrow          
		pdfobject3 = pdfdictionary.get(PdfName.ENCRYPTMETADATA);
		obj = ((Object) (abyte4));
		abyte1 = abyte5;
		i = k;
		abyte3 = ((byte []) (x509certificateholder));
		j = j1;
		if(pdfobject3 != null)
		{
			obj = ((Object) (abyte4));
			abyte1 = abyte5;
			i = k;
			abyte3 = ((byte []) (x509certificateholder));
			j = j1;
			if(pdfobject3.toString().equals("false"))
			{
				i = k | 8;
				obj = ((Object) (abyte4));
				abyte1 = abyte5;
				abyte3 = ((byte []) (x509certificateholder));
				j = j1;
			}
		}
		  goto _L12
_L11:
		byte byte0 = 3;
	//  437  999:iconst_3        
	//  438 1000:istore_3        
		PdfObject pdfobject4 = pdfdictionary.get(PdfName.ENCRYPTMETADATA);
	//  439 1001:aload           15
	//  440 1003:getstatic       #1032 <Field PdfName PdfName.ENCRYPTMETADATA>
	//  441 1006:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//  442 1009:astore          17
		obj = ((Object) (abyte4));
	//  443 1011:aload           11
	//  444 1013:astore          7
		abyte1 = abyte5;
	//  445 1015:aload           12
	//  446 1017:astore          8
		i = ((int) (byte0));
	//  447 1019:iload_3         
	//  448 1020:istore_1        
		abyte3 = ((byte []) (x509certificateholder));
	//  449 1021:aload           13
	//  450 1023:astore          10
		j = j1;
	//  451 1025:iload           4
	//  452 1027:istore_2        
		if(pdfobject4 != null)
	//* 453 1028:aload           17
	//* 454 1030:ifnull          571
		{
			obj = ((Object) (abyte4));
	//  455 1033:aload           11
	//  456 1035:astore          7
			abyte1 = abyte5;
	//  457 1037:aload           12
	//  458 1039:astore          8
			i = ((int) (byte0));
	//  459 1041:iload_3         
	//  460 1042:istore_1        
			abyte3 = ((byte []) (x509certificateholder));
	//  461 1043:aload           13
	//  462 1045:astore          10
			j = j1;
	//  463 1047:iload           4
	//  464 1049:istore_2        
			if(pdfobject4.toString().equals("false"))
	//* 465 1050:aload           17
	//* 466 1052:invokevirtual   #586 <Method String PdfObject.toString()>
	//* 467 1055:ldc2            #1034 <String "false">
	//* 468 1058:invokevirtual   #872 <Method boolean String.equals(Object)>
	//* 469 1061:ifeq            571
			{
				i = 3 | 8;
	//  470 1064:iconst_3        
	//  471 1065:bipush          8
	//  472 1067:ior             
	//  473 1068:istore_1        
				obj = ((Object) (abyte4));
	//  474 1069:aload           11
	//  475 1071:astore          7
				abyte1 = abyte5;
	//  476 1073:aload           12
	//  477 1075:astore          8
				abyte3 = ((byte []) (x509certificateholder));
	//  478 1077:aload           13
	//  479 1079:astore          10
				j = j1;
	//  480 1081:iload           4
	//  481 1083:istore_2        
			}
		}
		  goto _L12
	//* 482 1084:goto            571
_L6:
		obj = ((Object) (abyte4));
	//  483 1087:aload           11
	//  484 1089:astore          7
		abyte1 = abyte5;
	//  485 1091:aload           12
	//  486 1093:astore          8
		abyte3 = ((byte []) (x509certificateholder));
	//  487 1095:aload           13
	//  488 1097:astore          10
		j = j1;
	//  489 1099:iload           4
	//  490 1101:istore_2        
		if(!((Object) (pdfobject2)).equals(((Object) (PdfName.PUBSEC)))) goto _L12; else goto _L13
	//  491 1102:aload           16
	//  492 1104:getstatic       #1042 <Field PdfName PdfName.PUBSEC>
	//  493 1107:invokevirtual   #959 <Method boolean Object.equals(Object)>
	//  494 1110:ifeq            571
_L13:
		flag2 = false;
	//  495 1113:iconst_0        
	//  496 1114:istore          6
		flag1 = false;
	//  497 1116:iconst_0        
	//  498 1117:istore          5
		abyte3 = null;
	//  499 1119:aconst_null     
	//  500 1120:astore          10
		abyte1 = null;
	//  501 1122:aconst_null     
	//  502 1123:astore          8
		obj = ((Object) (pdfdictionary.get(PdfName.V)));
	//  503 1125:aload           15
	//  504 1127:getstatic       #1045 <Field PdfName PdfName.V>
	//  505 1130:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//  506 1133:astore          7
		if(!((PdfObject) (obj)).isNumber())
	//* 507 1135:aload           7
	//* 508 1137:invokevirtual   #663 <Method boolean PdfObject.isNumber()>
	//* 509 1140:ifne            1161
			throw new InvalidPdfException(MessageLocalization.getComposedMessage("illegal.v.value", new Object[0]));
	//  510 1143:new             #983 <Class InvalidPdfException>
	//  511 1146:dup             
	//  512 1147:ldc2            #1047 <String "illegal.v.value">
	//  513 1150:iconst_0        
	//  514 1151:anewarray       Object[]
	//  515 1154:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  516 1157:invokespecial   #986 <Method void InvalidPdfException(String)>
	//  517 1160:athrow          
		i = ((PdfNumber)obj).intValue();
	//  518 1161:aload           7
	//  519 1163:checkcast       #471 <Class PdfNumber>
	//  520 1166:invokevirtual   #474 <Method int PdfNumber.intValue()>
	//  521 1169:istore_1        
		i;
	//  522 1170:iload_1         
		JVM INSTR tableswitch 1 5: default 1204
	//	               1 1219
	//	               2 1393
	//	               3 1204
	//	               4 1494
	//	               5 1494;
	//  523 1171:tableswitch     1 5: default 1204
	//	               1 1219
	//	               2 1393
	//	               3 1204
	//	               4 1494
	//	               5 1494
		   goto _L14 _L15 _L16 _L14 _L17 _L17
_L14:
		throw new UnsupportedPdfException(MessageLocalization.getComposedMessage("unknown.encryption.type.v.eq.1", i));
	//  524 1204:new             #621 <Class UnsupportedPdfException>
	//  525 1207:dup             
	//  526 1208:ldc2            #1049 <String "unknown.encryption.type.v.eq.1">
	//  527 1211:iload_1         
	//  528 1212:invokestatic    #999 <Method String MessageLocalization.getComposedMessage(String, int)>
	//  529 1215:invokespecial   #624 <Method void UnsupportedPdfException(String)>
	//  530 1218:athrow          
_L15:
		i = 0;
	//  531 1219:iconst_0        
	//  532 1220:istore_1        
		j = 40;
	//  533 1221:bipush          40
	//  534 1223:istore_2        
		obj = ((Object) ((PdfArray)pdfdictionary.get(PdfName.RECIPIENTS)));
	//  535 1224:aload           15
	//  536 1226:getstatic       #1052 <Field PdfName PdfName.RECIPIENTS>
	//  537 1229:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//  538 1232:checkcast       #558 <Class PdfArray>
	//  539 1235:astore          7
_L26:
		try
		{
			x509certificateholder = new X509CertificateHolder(certificate.getEncoded());
	//  540 1237:new             #1054 <Class X509CertificateHolder>
	//  541 1240:dup             
	//  542 1241:aload_0         
	//  543 1242:getfield        #161 <Field Certificate certificate>
	//  544 1245:invokevirtual   #1059 <Method byte[] Certificate.getEncoded()>
	//  545 1248:invokespecial   #1060 <Method void X509CertificateHolder(byte[])>
	//  546 1251:astore          13
		}
	//* 547 1253:aload_0         
	//* 548 1254:getfield        #165 <Field ExternalDecryptionProcess externalDecryptionProcess>
	//* 549 1257:ifnonnull       1748
	//* 550 1260:iconst_0        
	//* 551 1261:istore          4
	//* 552 1263:iload           5
	//* 553 1265:istore_3        
	//* 554 1266:aload           8
	//* 555 1268:astore          10
	//* 556 1270:iload_3         
	//* 557 1271:istore          5
	//* 558 1273:iload           4
	//* 559 1275:aload           7
	//* 560 1277:invokevirtual   #719 <Method int PdfArray.size()>
	//* 561 1280:icmpge          1871
	//* 562 1283:aload           7
	//* 563 1285:iload           4
	//* 564 1287:invokevirtual   #763 <Method PdfObject PdfArray.getPdfObject(int)>
	//* 565 1290:astore          10
	//* 566 1292:aload_0         
	//* 567 1293:getfield        #170 <Field ArrayList strings>
	//* 568 1296:aload           10
	//* 569 1298:invokevirtual   #949 <Method boolean ArrayList.remove(Object)>
	//* 570 1301:pop             
	//* 571 1302:new             #1062 <Class CMSEnvelopedData>
	//* 572 1305:dup             
	//* 573 1306:aload           10
	//* 574 1308:invokevirtual   #838 <Method byte[] PdfObject.getBytes()>
	//* 575 1311:invokespecial   #1063 <Method void CMSEnvelopedData(byte[])>
	//* 576 1314:astore          10
	//* 577 1316:aload           10
	//* 578 1318:invokevirtual   #1067 <Method RecipientInformationStore CMSEnvelopedData.getRecipientInfos()>
	//* 579 1321:invokevirtual   #1073 <Method Collection RecipientInformationStore.getRecipients()>
	//* 580 1324:invokeinterface #1076 <Method Iterator Collection.iterator()>
	//* 581 1329:astore          10
	//* 582 1331:aload           10
	//* 583 1333:invokeinterface #709 <Method boolean Iterator.hasNext()>
	//* 584 1338:ifeq            1739
	//* 585 1341:aload           10
	//* 586 1343:invokeinterface #713 <Method Object Iterator.next()>
	//* 587 1348:checkcast       #1078 <Class RecipientInformation>
	//* 588 1351:astore          17
	//* 589 1353:aload           17
	//* 590 1355:invokevirtual   #1082 <Method RecipientId RecipientInformation.getRID()>
	//* 591 1358:aload           13
	//* 592 1360:invokevirtual   #1087 <Method boolean RecipientId.match(Object)>
	//* 593 1363:ifeq            1331
	//* 594 1366:iload_3         
	//* 595 1367:ifne            1331
	//* 596 1370:aload           17
	//* 597 1372:aload_0         
	//* 598 1373:getfield        #159 <Field Key certificateKey>
	//* 599 1376:checkcast       #1089 <Class PrivateKey>
	//* 600 1379:aload_0         
	//* 601 1380:getfield        #163 <Field String certificateKeyProvider>
	//* 602 1383:invokestatic    #1095 <Method byte[] PdfEncryptor.getContent(RecipientInformation, PrivateKey, String)>
	//* 603 1386:astore          8
	//* 604 1388:iconst_1        
	//* 605 1389:istore_3        
	//* 606 1390:goto            1331
	//* 607 1393:aload           15
	//* 608 1395:getstatic       #459 <Field PdfName PdfName.LENGTH>
	//* 609 1398:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 610 1401:astore          7
	//* 611 1403:aload           7
	//* 612 1405:invokevirtual   #663 <Method boolean PdfObject.isNumber()>
	//* 613 1408:ifne            1429
	//* 614 1411:new             #983 <Class InvalidPdfException>
	//* 615 1414:dup             
	//* 616 1415:ldc2            #1019 <String "illegal.length.value">
	//* 617 1418:iconst_0        
	//* 618 1419:anewarray       Object[]
	//* 619 1422:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//* 620 1425:invokespecial   #986 <Method void InvalidPdfException(String)>
	//* 621 1428:athrow          
	//* 622 1429:aload           7
	//* 623 1431:checkcast       #471 <Class PdfNumber>
	//* 624 1434:invokevirtual   #474 <Method int PdfNumber.intValue()>
	//* 625 1437:istore_2        
	//* 626 1438:iload_2         
	//* 627 1439:sipush          128
	//* 628 1442:icmpgt          1458
	//* 629 1445:iload_2         
	//* 630 1446:bipush          40
	//* 631 1448:icmplt          1458
	//* 632 1451:iload_2         
	//* 633 1452:bipush          8
	//* 634 1454:irem            
	//* 635 1455:ifeq            1476
	//* 636 1458:new             #983 <Class InvalidPdfException>
	//* 637 1461:dup             
	//* 638 1462:ldc2            #1019 <String "illegal.length.value">
	//* 639 1465:iconst_0        
	//* 640 1466:anewarray       Object[]
	//* 641 1469:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//* 642 1472:invokespecial   #986 <Method void InvalidPdfException(String)>
	//* 643 1475:athrow          
	//* 644 1476:iconst_1        
	//* 645 1477:istore_1        
	//* 646 1478:aload           15
	//* 647 1480:getstatic       #1052 <Field PdfName PdfName.RECIPIENTS>
	//* 648 1483:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 649 1486:checkcast       #558 <Class PdfArray>
	//* 650 1489:astore          7
	//* 651 1491:goto            1237
	//* 652 1494:aload           15
	//* 653 1496:getstatic       #923 <Field PdfName PdfName.CF>
	//* 654 1499:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 655 1502:checkcast       #281 <Class PdfDictionary>
	//* 656 1505:astore          7
	//* 657 1507:aload           7
	//* 658 1509:ifnonnull       1530
	//* 659 1512:new             #983 <Class InvalidPdfException>
	//* 660 1515:dup             
	//* 661 1516:ldc2            #1021 <String "cf.not.found.encryption">
	//* 662 1519:iconst_0        
	//* 663 1520:anewarray       Object[]
	//* 664 1523:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//* 665 1526:invokespecial   #986 <Method void InvalidPdfException(String)>
	//* 666 1529:athrow          
	//* 667 1530:aload           7
	//* 668 1532:getstatic       #1098 <Field PdfName PdfName.DEFAULTCRYPTFILTER>
	//* 669 1535:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 670 1538:checkcast       #281 <Class PdfDictionary>
	//* 671 1541:astore          7
	//* 672 1543:aload           7
	//* 673 1545:ifnonnull       1566
	//* 674 1548:new             #983 <Class InvalidPdfException>
	//* 675 1551:dup             
	//* 676 1552:ldc2            #1100 <String "defaultcryptfilter.not.found.encryption">
	//* 677 1555:iconst_0        
	//* 678 1556:anewarray       Object[]
	//* 679 1559:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//* 680 1562:invokespecial   #986 <Method void InvalidPdfException(String)>
	//* 681 1565:athrow          
	//* 682 1566:getstatic       #1026 <Field PdfName PdfName.V2>
	//* 683 1569:aload           7
	//* 684 1571:getstatic       #1029 <Field PdfName PdfName.CFM>
	//* 685 1574:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 686 1577:invokevirtual   #545 <Method boolean PdfName.equals(Object)>
	//* 687 1580:ifeq            1645
	//* 688 1583:iconst_1        
	//* 689 1584:istore_1        
	//* 690 1585:sipush          128
	//* 691 1588:istore_2        
	//* 692 1589:aload           7
	//* 693 1591:getstatic       #1032 <Field PdfName PdfName.ENCRYPTMETADATA>
	//* 694 1594:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 695 1597:astore          13
	//* 696 1599:iload_1         
	//* 697 1600:istore_3        
	//* 698 1601:aload           13
	//* 699 1603:ifnull          1627
	//* 700 1606:iload_1         
	//* 701 1607:istore_3        
	//* 702 1608:aload           13
	//* 703 1610:invokevirtual   #586 <Method String PdfObject.toString()>
	//* 704 1613:ldc2            #1034 <String "false">
	//* 705 1616:invokevirtual   #872 <Method boolean String.equals(Object)>
	//* 706 1619:ifeq            1627
	//* 707 1622:iload_1         
	//* 708 1623:bipush          8
	//* 709 1625:ior             
	//* 710 1626:istore_3        
	//* 711 1627:aload           7
	//* 712 1629:getstatic       #1052 <Field PdfName PdfName.RECIPIENTS>
	//* 713 1632:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 714 1635:checkcast       #558 <Class PdfArray>
	//* 715 1638:astore          7
	//* 716 1640:iload_3         
	//* 717 1641:istore_1        
	//* 718 1642:goto            1237
	//* 719 1645:getstatic       #1037 <Field PdfName PdfName.AESV2>
	//* 720 1648:aload           7
	//* 721 1650:getstatic       #1029 <Field PdfName PdfName.CFM>
	//* 722 1653:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 723 1656:invokevirtual   #545 <Method boolean PdfName.equals(Object)>
	//* 724 1659:ifeq            1671
	//* 725 1662:iconst_2        
	//* 726 1663:istore_1        
	//* 727 1664:sipush          128
	//* 728 1667:istore_2        
	//* 729 1668:goto            1589
	//* 730 1671:getstatic       #1103 <Field PdfName PdfName.AESV3>
	//* 731 1674:aload           7
	//* 732 1676:getstatic       #1029 <Field PdfName PdfName.CFM>
	//* 733 1679:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 734 1682:invokevirtual   #545 <Method boolean PdfName.equals(Object)>
	//* 735 1685:ifeq            1697
	//* 736 1688:iconst_3        
	//* 737 1689:istore_1        
	//* 738 1690:sipush          256
	//* 739 1693:istore_2        
	//* 740 1694:goto            1589
	//* 741 1697:new             #621 <Class UnsupportedPdfException>
	//* 742 1700:dup             
	//* 743 1701:ldc2            #1039 <String "no.compatible.encryption.found">
	//* 744 1704:iconst_0        
	//* 745 1705:anewarray       Object[]
	//* 746 1708:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//* 747 1711:invokespecial   #624 <Method void UnsupportedPdfException(String)>
	//* 748 1714:athrow          
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 749 1715:astore          7
		{
			throw new ExceptionConverter(((Exception) (obj)));
	//  750 1717:new             #825 <Class ExceptionConverter>
	//  751 1720:dup             
	//  752 1721:aload           7
	//  753 1723:invokespecial   #828 <Method void ExceptionConverter(Exception)>
	//  754 1726:athrow          
		}
		if(externalDecryptionProcess != null) goto _L19; else goto _L18
_L18:
		j1 = 0;
		flag = flag1;
_L27:
		abyte3 = abyte1;
		flag1 = flag;
		if(j1 >= ((PdfArray) (obj)).size()) goto _L21; else goto _L20
_L20:
		abyte3 = ((byte []) (((PdfArray) (obj)).getPdfObject(j1)));
		strings.remove(((Object) (abyte3)));
		abyte3 = ((byte []) (new CMSEnvelopedData(((PdfObject) (abyte3)).getBytes())));
		abyte3 = ((byte []) (((CMSEnvelopedData) (abyte3)).getRecipientInfos().getRecipients().iterator()));
_L25:
		if(!((Iterator) (abyte3)).hasNext()) goto _L23; else goto _L22
_L22:
		recipientinformation = (RecipientInformation)((Iterator) (abyte3)).next();
		if(!recipientinformation.getRID().match(((Object) (x509certificateholder))) || flag) goto _L25; else goto _L24
_L24:
		abyte1 = PdfEncryptor.getContent(recipientinformation, (PrivateKey)certificateKey, certificateKeyProvider);
		flag = true;
		  goto _L25
_L16:
		obj = ((Object) (pdfdictionary.get(PdfName.LENGTH)));
		if(!((PdfObject) (obj)).isNumber())
			throw new InvalidPdfException(MessageLocalization.getComposedMessage("illegal.length.value", new Object[0]));
		j = ((PdfNumber)obj).intValue();
		if(j > 128 || j < 40 || j % 8 != 0)
			throw new InvalidPdfException(MessageLocalization.getComposedMessage("illegal.length.value", new Object[0]));
		i = 1;
		obj = ((Object) ((PdfArray)pdfdictionary.get(PdfName.RECIPIENTS)));
		  goto _L26
_L17:
		obj = ((Object) ((PdfDictionary)pdfdictionary.get(PdfName.CF)));
		if(obj == null)
			throw new InvalidPdfException(MessageLocalization.getComposedMessage("cf.not.found.encryption", new Object[0]));
		obj = ((Object) ((PdfDictionary)((PdfDictionary) (obj)).get(PdfName.DEFAULTCRYPTFILTER)));
		if(obj == null)
			throw new InvalidPdfException(MessageLocalization.getComposedMessage("defaultcryptfilter.not.found.encryption", new Object[0]));
		int l;
		PdfObject pdfobject;
		if(PdfName.V2.equals(((Object) (((PdfDictionary) (obj)).get(PdfName.CFM)))))
		{
			i = 1;
			j = 128;
		} else
		if(PdfName.AESV2.equals(((Object) (((PdfDictionary) (obj)).get(PdfName.CFM)))))
		{
			i = 2;
			j = 128;
		} else
		if(PdfName.AESV3.equals(((Object) (((PdfDictionary) (obj)).get(PdfName.CFM)))))
		{
			i = 3;
			j = 256;
		} else
		{
			throw new UnsupportedPdfException(MessageLocalization.getComposedMessage("no.compatible.encryption.found", new Object[0]));
		}
		pdfobject = ((PdfDictionary) (obj)).get(PdfName.ENCRYPTMETADATA);
		l = i;
		if(pdfobject != null)
		{
			l = i;
			if(pdfobject.toString().equals("false"))
				l = i | 8;
		}
		obj = ((Object) ((PdfArray)((PdfDictionary) (obj)).get(PdfName.RECIPIENTS)));
		i = l;
		  goto _L26
		obj;
	//  755 1727:astore          7
_L31:
		throw new ExceptionConverter(((Exception) (obj)));
	//  756 1729:new             #825 <Class ExceptionConverter>
	//  757 1732:dup             
	//  758 1733:aload           7
	//  759 1735:invokespecial   #828 <Method void ExceptionConverter(Exception)>
	//  760 1738:athrow          
_L23:
		j1++;
	//  761 1739:iload           4
	//  762 1741:iconst_1        
	//  763 1742:iadd            
	//  764 1743:istore          4
		  goto _L27
	//* 765 1745:goto            1266
_L19:
		j1 = 0;
	//  766 1748:iconst_0        
	//  767 1749:istore          4
		l = ((int) (flag2));
	//  768 1751:iload           6
	//  769 1753:istore_3        
		abyte1 = abyte3;
	//  770 1754:aload           10
	//  771 1756:astore          8
_L28:
		abyte3 = abyte1;
	//  772 1758:aload           8
	//  773 1760:astore          10
		flag1 = ((boolean) (l));
	//  774 1762:iload_3         
	//  775 1763:istore          5
		if(j1 >= ((PdfArray) (obj)).size())
			break; /* Loop/switch isn't completed */
	//  776 1765:iload           4
	//  777 1767:aload           7
	//  778 1769:invokevirtual   #719 <Method int PdfArray.size()>
	//  779 1772:icmpge          1871
		abyte3 = ((byte []) (((PdfArray) (obj)).getPdfObject(j1)));
	//  780 1775:aload           7
	//  781 1777:iload           4
	//  782 1779:invokevirtual   #763 <Method PdfObject PdfArray.getPdfObject(int)>
	//  783 1782:astore          10
		strings.remove(((Object) (abyte3)));
	//  784 1784:aload_0         
	//  785 1785:getfield        #170 <Field ArrayList strings>
	//  786 1788:aload           10
	//  787 1790:invokevirtual   #949 <Method boolean ArrayList.remove(Object)>
	//  788 1793:pop             
		abyte3 = ((byte []) (new CMSEnvelopedData(((PdfObject) (abyte3)).getBytes())));
	//  789 1794:new             #1062 <Class CMSEnvelopedData>
	//  790 1797:dup             
	//  791 1798:aload           10
	//  792 1800:invokevirtual   #838 <Method byte[] PdfObject.getBytes()>
	//  793 1803:invokespecial   #1063 <Method void CMSEnvelopedData(byte[])>
	//  794 1806:astore          10
		abyte3 = ((byte []) (((CMSEnvelopedData) (abyte3)).getRecipientInfos().get(externalDecryptionProcess.getCmsRecipientId())));
	//  795 1808:aload           10
	//  796 1810:invokevirtual   #1067 <Method RecipientInformationStore CMSEnvelopedData.getRecipientInfos()>
	//  797 1813:aload_0         
	//  798 1814:getfield        #165 <Field ExternalDecryptionProcess externalDecryptionProcess>
	//  799 1817:invokeinterface #1108 <Method RecipientId ExternalDecryptionProcess.getCmsRecipientId()>
	//  800 1822:invokevirtual   #1111 <Method RecipientInformation RecipientInformationStore.get(RecipientId)>
	//  801 1825:astore          10
		if(abyte3 == null)
			break MISSING_BLOCK_LABEL_1850;
	//  802 1827:aload           10
	//  803 1829:ifnull          1850
		abyte1 = ((RecipientInformation) (abyte3)).getContent(externalDecryptionProcess.getCmsRecipient());
	//  804 1832:aload           10
	//  805 1834:aload_0         
	//  806 1835:getfield        #165 <Field ExternalDecryptionProcess externalDecryptionProcess>
	//  807 1838:invokeinterface #1115 <Method org.spongycastle.cms.Recipient ExternalDecryptionProcess.getCmsRecipient()>
	//  808 1843:invokevirtual   #1118 <Method byte[] RecipientInformation.getContent(org.spongycastle.cms.Recipient)>
	//  809 1846:astore          8
		l = 1;
	//  810 1848:iconst_1        
	//  811 1849:istore_3        
		j1++;
	//  812 1850:iload           4
	//  813 1852:iconst_1        
	//  814 1853:iadd            
	//  815 1854:istore          4
		if(true) goto _L28; else goto _L21
	//  816 1856:goto            1758
		obj;
	//  817 1859:astore          7
_L30:
		throw new ExceptionConverter(((Exception) (obj)));
	//  818 1861:new             #825 <Class ExceptionConverter>
	//  819 1864:dup             
	//  820 1865:aload           7
	//  821 1867:invokespecial   #828 <Method void ExceptionConverter(Exception)>
	//  822 1870:athrow          
_L21:
		if(!flag1 || abyte3 == null)
	//* 823 1871:iload           5
	//* 824 1873:ifeq            1881
	//* 825 1876:aload           10
	//* 826 1878:ifnonnull       1899
			throw new UnsupportedPdfException(MessageLocalization.getComposedMessage("bad.certificate.and.key", new Object[0]));
	//  827 1881:new             #621 <Class UnsupportedPdfException>
	//  828 1884:dup             
	//  829 1885:ldc2            #1120 <String "bad.certificate.and.key">
	//  830 1888:iconst_0        
	//  831 1889:anewarray       Object[]
	//  832 1892:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  833 1895:invokespecial   #624 <Method void UnsupportedPdfException(String)>
	//  834 1898:athrow          
		if((i & 7) != 3)
			break MISSING_BLOCK_LABEL_1957;
	//  835 1899:iload_1         
	//  836 1900:bipush          7
	//  837 1902:iand            
	//  838 1903:iconst_3        
	//  839 1904:icmpne          1957
		abyte1 = ((byte []) (MessageDigest.getInstance("SHA-256")));
	//  840 1907:ldc2            #1122 <String "SHA-256">
	//  841 1910:invokestatic    #1128 <Method MessageDigest MessageDigest.getInstance(String)>
	//  842 1913:astore          8
_L29:
		((MessageDigest) (abyte1)).update(abyte3, 0, 20);
	//  843 1915:aload           8
	//  844 1917:aload           10
	//  845 1919:iconst_0        
	//  846 1920:bipush          20
	//  847 1922:invokevirtual   #1131 <Method void MessageDigest.update(byte[], int, int)>
		int i1 = 0;
	//  848 1925:iconst_0        
	//  849 1926:istore_3        
		do
		{
			try
			{
				if(i1 >= ((PdfArray) (obj)).size())
					break;
	//  850 1927:iload_3         
	//  851 1928:aload           7
	//  852 1930:invokevirtual   #719 <Method int PdfArray.size()>
	//  853 1933:icmpge          1968
				((MessageDigest) (abyte1)).update(((PdfArray) (obj)).getPdfObject(i1).getBytes());
	//  854 1936:aload           8
	//  855 1938:aload           7
	//  856 1940:iload_3         
	//  857 1941:invokevirtual   #763 <Method PdfObject PdfArray.getPdfObject(int)>
	//  858 1944:invokevirtual   #838 <Method byte[] PdfObject.getBytes()>
	//  859 1947:invokevirtual   #1133 <Method void MessageDigest.update(byte[])>
			}
	//* 860 1950:iload_3         
	//* 861 1951:iconst_1        
	//* 862 1952:iadd            
	//* 863 1953:istore_3        
	//* 864 1954:goto            1927
	//* 865 1957:ldc2            #1135 <String "SHA-1">
	//* 866 1960:invokestatic    #1128 <Method MessageDigest MessageDigest.getInstance(String)>
	//* 867 1963:astore          8
	//* 868 1965:goto            1915
	//* 869 1968:iload_1         
	//* 870 1969:bipush          8
	//* 871 1971:iand            
	//* 872 1972:ifeq            2007
	//* 873 1975:aload           8
	//* 874 1977:iconst_4        
	//* 875 1978:newarray        byte[]
	//* 876 1980:dup             
	//* 877 1981:iconst_0        
	//* 878 1982:ldc2            #1136 <Int -1>
	//* 879 1985:bastore         
	//* 880 1986:dup             
	//* 881 1987:iconst_1        
	//* 882 1988:ldc2            #1136 <Int -1>
	//* 883 1991:bastore         
	//* 884 1992:dup             
	//* 885 1993:iconst_2        
	//* 886 1994:ldc2            #1136 <Int -1>
	//* 887 1997:bastore         
	//* 888 1998:dup             
	//* 889 1999:iconst_3        
	//* 890 2000:ldc2            #1136 <Int -1>
	//* 891 2003:bastore         
	//* 892 2004:invokevirtual   #1133 <Method void MessageDigest.update(byte[])>
	//* 893 2007:aload           8
	//* 894 2009:invokevirtual   #1139 <Method byte[] MessageDigest.digest()>
	//* 895 2012:astore          10
	//* 896 2014:aload           11
	//* 897 2016:astore          7
	//* 898 2018:aload           12
	//* 899 2020:astore          8
	//* 900 2022:goto            571
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//* 901 2025:astore          7
			{
				throw new ExceptionConverter(((Exception) (obj)));
	//  902 2027:new             #825 <Class ExceptionConverter>
	//  903 2030:dup             
	//  904 2031:aload           7
	//  905 2033:invokespecial   #828 <Method void ExceptionConverter(Exception)>
	//  906 2036:athrow          
			}
			i1++;
		} while(true);
		break MISSING_BLOCK_LABEL_1968;
		abyte1 = ((byte []) (MessageDigest.getInstance("SHA-1")));
		  goto _L29
		if((i & 8) == 0)
			break MISSING_BLOCK_LABEL_2007;
		((MessageDigest) (abyte1)).update(new byte[] {
			-1, -1, -1, -1
		});
		abyte3 = ((MessageDigest) (abyte1)).digest();
		obj = ((Object) (abyte4));
		abyte1 = abyte5;
_L12:
		decrypt = new PdfEncryption();
		decrypt.setCryptoMode(i, j);
		boolean flag;
		boolean flag1;
		boolean flag2;
		RecipientInformation recipientinformation;
		if(((Object) (pdfobject2)).equals(((Object) (PdfName.STANDARD))))
		{
			if(rValue == 5)
			{
				ownerPasswordUsed = decrypt.readKey(pdfdictionary, password);
				decrypt.documentID = abyte2;
				pValue = decrypt.getPermissions();
			} else
			{
				decrypt.setupByOwnerPassword(abyte2, password, ((byte []) (obj)), abyte1, pValue);
	//  907 2037:aload_0         
	//  908 2038:getfield        #240 <Field PdfEncryption decrypt>
	//  909 2041:aload           9
	//  910 2043:aload_0         
	//  911 2044:getfield        #157 <Field byte[] password>
	//  912 2047:aload           7
	//  913 2049:aload           8
	//  914 2051:aload_0         
	//  915 2052:getfield        #247 <Field long pValue>
	//  916 2055:invokevirtual   #1143 <Method void PdfEncryption.setupByOwnerPassword(byte[], byte[], byte[], byte[], long)>
				abyte3 = decrypt.userKey;
	//  917 2058:aload_0         
	//  918 2059:getfield        #240 <Field PdfEncryption decrypt>
	//  919 2062:getfield        #1146 <Field byte[] PdfEncryption.userKey>
	//  920 2065:astore          10
				if(rValue == 3 || rValue == 4)
	//* 921 2067:aload_0         
	//* 922 2068:getfield        #249 <Field int rValue>
	//* 923 2071:iconst_3        
	//* 924 2072:icmpeq          2083
	//* 925 2075:aload_0         
	//* 926 2076:getfield        #249 <Field int rValue>
	//* 927 2079:iconst_4        
	//* 928 2080:icmpne          2175
					i = 16;
	//  929 2083:bipush          16
	//  930 2085:istore_1        
				else
	//* 931 2086:aload_0         
	//* 932 2087:aload           7
	//* 933 2089:aload           10
	//* 934 2091:iload_1         
	//* 935 2092:invokespecial   #1148 <Method boolean equalsArray(byte[], byte[], int)>
	//* 936 2095:ifne            2187
	//* 937 2098:aload_0         
	//* 938 2099:getfield        #240 <Field PdfEncryption decrypt>
	//* 939 2102:aload           9
	//* 940 2104:aload_0         
	//* 941 2105:getfield        #157 <Field byte[] password>
	//* 942 2108:aload           8
	//* 943 2110:aload_0         
	//* 944 2111:getfield        #247 <Field long pValue>
	//* 945 2114:invokevirtual   #1152 <Method void PdfEncryption.setupByUserPassword(byte[], byte[], byte[], long)>
	//* 946 2117:aload_0         
	//* 947 2118:getfield        #240 <Field PdfEncryption decrypt>
	//* 948 2121:getfield        #1146 <Field byte[] PdfEncryption.userKey>
	//* 949 2124:astore          8
	//* 950 2126:aload_0         
	//* 951 2127:getfield        #249 <Field int rValue>
	//* 952 2130:iconst_3        
	//* 953 2131:icmpeq          2142
	//* 954 2134:aload_0         
	//* 955 2135:getfield        #249 <Field int rValue>
	//* 956 2138:iconst_4        
	//* 957 2139:icmpne          2181
	//* 958 2142:bipush          16
	//* 959 2144:istore_1        
	//* 960 2145:aload_0         
	//* 961 2146:aload           7
	//* 962 2148:aload           8
	//* 963 2150:iload_1         
	//* 964 2151:invokespecial   #1148 <Method boolean equalsArray(byte[], byte[], int)>
	//* 965 2154:ifne            647
	//* 966 2157:new             #1154 <Class BadPasswordException>
	//* 967 2160:dup             
	//* 968 2161:ldc2            #1156 <String "bad.user.password">
	//* 969 2164:iconst_0        
	//* 970 2165:anewarray       Object[]
	//* 971 2168:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//* 972 2171:invokespecial   #1157 <Method void BadPasswordException(String)>
	//* 973 2174:athrow          
					i = 32;
	//  974 2175:bipush          32
	//  975 2177:istore_1        
				if(!equalsArray(((byte []) (obj)), abyte3, i))
				{
					decrypt.setupByUserPassword(abyte2, password, abyte1, pValue);
					abyte1 = decrypt.userKey;
					if(rValue == 3 || rValue == 4)
						i = 16;
					else
	//* 976 2178:goto            2086
						i = 32;
	//  977 2181:bipush          32
	//  978 2183:istore_1        
					if(!equalsArray(((byte []) (obj)), abyte1, i))
						throw new BadPasswordException(MessageLocalization.getComposedMessage("bad.user.password", new Object[0]));
				} else
	//* 979 2184:goto            2145
				{
					ownerPasswordUsed = true;
	//  980 2187:aload_0         
	//  981 2188:iconst_1        
	//  982 2189:putfield        #307 <Field boolean ownerPasswordUsed>
				}
			}
		} else
	//* 983 2192:goto            647
		if(((Object) (pdfobject2)).equals(((Object) (PdfName.PUBSEC))))
	//* 984 2195:aload           16
	//* 985 2197:getstatic       #1042 <Field PdfName PdfName.PUBSEC>
	//* 986 2200:invokevirtual   #959 <Method boolean Object.equals(Object)>
	//* 987 2203:ifeq            647
		{
			if((i & 7) == 3)
	//* 988 2206:iload_1         
	//* 989 2207:bipush          7
	//* 990 2209:iand            
	//* 991 2210:iconst_3        
	//* 992 2211:icmpne          2231
				decrypt.setKey(abyte3);
	//  993 2214:aload_0         
	//  994 2215:getfield        #240 <Field PdfEncryption decrypt>
	//  995 2218:aload           10
	//  996 2220:invokevirtual   #1160 <Method void PdfEncryption.setKey(byte[])>
			else
	//* 997 2223:aload_0         
	//* 998 2224:iconst_1        
	//* 999 2225:putfield        #307 <Field boolean ownerPasswordUsed>
	//*1000 2228:goto            647
				decrypt.setupByEncryptionKey(abyte3, j);
	// 1001 2231:aload_0         
	// 1002 2232:getfield        #240 <Field PdfEncryption decrypt>
	// 1003 2235:aload           10
	// 1004 2237:iload_2         
	// 1005 2238:invokevirtual   #1164 <Method void PdfEncryption.setupByEncryptionKey(byte[], int)>
			ownerPasswordUsed = true;
		}
		for(i = 0; i < strings.size(); i++)
			((PdfString)strings.get(i)).decrypt(this);

	//*1006 2241:goto            2223
		if(pdfobject1.isIndirect())
	//*1007 2244:aload           14
	//*1008 2246:invokevirtual   #817 <Method boolean PdfObject.isIndirect()>
	//*1009 2249:ifeq            2277
		{
			cryptoRef = (PRIndirectReference)pdfobject1;
	// 1010 2252:aload_0         
	// 1011 2253:aload           14
	// 1012 2255:checkcast       #305 <Class PRIndirectReference>
	// 1013 2258:putfield        #303 <Field PRIndirectReference cryptoRef>
			xrefObj.set(cryptoRef.getNumber(), ((Object) (null)));
	// 1014 2261:aload_0         
	// 1015 2262:getfield        #251 <Field ArrayList xrefObj>
	// 1016 2265:aload_0         
	// 1017 2266:getfield        #303 <Field PRIndirectReference cryptoRef>
	// 1018 2269:invokevirtual   #730 <Method int PRIndirectReference.getNumber()>
	// 1019 2272:aconst_null     
	// 1020 2273:invokevirtual   #272 <Method Object ArrayList.set(int, Object)>
	// 1021 2276:pop             
		}
		encryptionError = false;
	// 1022 2277:aload_0         
	// 1023 2278:iconst_0        
	// 1024 2279:putfield        #920 <Field boolean encryptionError>
		return;
	// 1025 2282:return          
		obj;
	// 1026 2283:astore          7
		  goto _L30
	//*1027 2285:goto            1861
		obj;
	// 1028 2288:astore          7
		  goto _L31
	//*1029 2290:goto            1729
	}

	public static void releaseLastXrefPartial(PdfObject pdfobject)
	{
		while(pdfobject == null || !pdfobject.isIndirect() || !(pdfobject instanceof PRIndirectReference)) 
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
	//    3    5:aload_0         
	//    4    6:invokevirtual   #817 <Method boolean PdfObject.isIndirect()>
	//    5    9:ifeq            4
	//    6   12:aload_0         
	//    7   13:instanceof      #305 <Class PRIndirectReference>
	//    8   16:ifeq            4
		pdfobject = ((PdfObject) ((PRIndirectReference)pdfobject));
	//    9   19:aload_0         
	//   10   20:checkcast       #305 <Class PRIndirectReference>
	//   11   23:astore_0        
		PdfReader pdfreader = ((PRIndirectReference) (pdfobject)).getReader();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #818 <Method PdfReader PRIndirectReference.getReader()>
	//   14   28:astore_1        
		if(pdfreader.partial && pdfreader.lastXrefPartial != -1 && pdfreader.lastXrefPartial == ((PRIndirectReference) (pdfobject)).getNumber())
	//*  15   29:aload_1         
	//*  16   30:getfield        #187 <Field boolean partial>
	//*  17   33:ifeq            68
	//*  18   36:aload_1         
	//*  19   37:getfield        #178 <Field int lastXrefPartial>
	//*  20   40:iconst_m1       
	//*  21   41:icmpeq          68
	//*  22   44:aload_1         
	//*  23   45:getfield        #178 <Field int lastXrefPartial>
	//*  24   48:aload_0         
	//*  25   49:invokevirtual   #730 <Method int PRIndirectReference.getNumber()>
	//*  26   52:icmpne          68
			pdfreader.xrefObj.set(pdfreader.lastXrefPartial, ((Object) (null)));
	//   27   55:aload_1         
	//   28   56:getfield        #251 <Field ArrayList xrefObj>
	//   29   59:aload_1         
	//   30   60:getfield        #178 <Field int lastXrefPartial>
	//   31   63:aconst_null     
	//   32   64:invokevirtual   #272 <Method Object ArrayList.set(int, Object)>
	//   33   67:pop             
		pdfreader.lastXrefPartial = -1;
	//   34   68:aload_1         
	//   35   69:iconst_m1       
	//   36   70:putfield        #178 <Field int lastXrefPartial>
	//   37   73:return          
	}

	private boolean replaceNamedDestination(PdfObject pdfobject, HashMap hashmap)
	{
		int i;
		PdfObject pdfobject2;
		pdfobject2 = getPdfObject(pdfobject);
	//    0    0:aload_1         
	//    1    1:invokestatic    #524 <Method PdfObject getPdfObject(PdfObject)>
	//    2    4:astore          7
		i = lastXrefPartial;
	//    3    6:aload_0         
	//    4    7:getfield        #178 <Field int lastXrefPartial>
	//    5   10:istore_3        
		releaseLastXrefPartial();
	//    6   11:aload_0         
	//    7   12:invokevirtual   #527 <Method void releaseLastXrefPartial()>
		if(pdfobject2 == null || !pdfobject2.isDictionary()) goto _L2; else goto _L1
	//    8   15:aload           7
	//    9   17:ifnull          270
	//   10   20:aload           7
	//   11   22:invokevirtual   #531 <Method boolean PdfObject.isDictionary()>
	//   12   25:ifeq            270
_L1:
		Object obj;
		PdfObject pdfobject1;
		pdfobject1 = getPdfObjectRelease(((PdfDictionary)pdfobject2).get(PdfName.DEST));
	//   13   28:aload           7
	//   14   30:checkcast       #281 <Class PdfDictionary>
	//   15   33:getstatic       #1167 <Field PdfName PdfName.DEST>
	//   16   36:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   17   39:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//   18   42:astore          6
		obj = null;
	//   19   44:aconst_null     
	//   20   45:astore          5
		pdfobject = null;
	//   21   47:aconst_null     
	//   22   48:astore_1        
		if(pdfobject1 == null) goto _L4; else goto _L3
	//   23   49:aload           6
	//   24   51:ifnull          116
_L3:
		if(!pdfobject1.isName()) goto _L6; else goto _L5
	//   25   54:aload           6
	//   26   56:invokevirtual   #551 <Method boolean PdfObject.isName()>
	//   27   59:ifeq            99
_L5:
		pdfobject = pdfobject1;
	//   28   62:aload           6
	//   29   64:astore_1        
_L7:
		pdfobject = ((PdfObject) ((PdfArray)hashmap.get(((Object) (pdfobject)))));
	//   30   65:aload_2         
	//   31   66:aload_1         
	//   32   67:invokevirtual   #556 <Method Object HashMap.get(Object)>
	//   33   70:checkcast       #558 <Class PdfArray>
	//   34   73:astore_1        
		if(pdfobject != null)
	//*  35   74:aload_1         
	//*  36   75:ifnull          270
		{
			((PdfDictionary)pdfobject2).put(PdfName.DEST, pdfobject);
	//   37   78:aload           7
	//   38   80:checkcast       #281 <Class PdfDictionary>
	//   39   83:getstatic       #1167 <Field PdfName PdfName.DEST>
	//   40   86:aload_1         
	//   41   87:invokevirtual   #575 <Method void PdfDictionary.put(PdfName, PdfObject)>
			setXrefPartialObject(i, pdfobject2);
	//   42   90:aload_0         
	//   43   91:iload_3         
	//   44   92:aload           7
	//   45   94:invokespecial   #579 <Method void setXrefPartialObject(int, PdfObject)>
			return true;
	//   46   97:iconst_1        
	//   47   98:ireturn         
		}
		break; /* Loop/switch isn't completed */
_L6:
		if(pdfobject1.isString())
	//*  48   99:aload           6
	//*  49  101:invokevirtual   #582 <Method boolean PdfObject.isString()>
	//*  50  104:ifeq            65
			pdfobject = ((PdfObject) (pdfobject1.toString()));
	//   51  107:aload           6
	//   52  109:invokevirtual   #586 <Method String PdfObject.toString()>
	//   53  112:astore_1        
		if(true) goto _L7; else goto _L2
	//   54  113:goto            65
_L4:
		PdfObject pdfobject3 = getPdfObject(((PdfDictionary)pdfobject2).get(PdfName.A));
	//   55  116:aload           7
	//   56  118:checkcast       #281 <Class PdfDictionary>
	//   57  121:getstatic       #534 <Field PdfName PdfName.A>
	//   58  124:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   59  127:invokestatic    #524 <Method PdfObject getPdfObject(PdfObject)>
	//   60  130:astore          8
		if(pdfobject3 == null) goto _L2; else goto _L8
	//   61  132:aload           8
	//   62  134:ifnull          270
_L8:
		int j;
		PdfDictionary pdfdictionary;
		j = lastXrefPartial;
	//   63  137:aload_0         
	//   64  138:getfield        #178 <Field int lastXrefPartial>
	//   65  141:istore          4
		releaseLastXrefPartial();
	//   66  143:aload_0         
	//   67  144:invokevirtual   #527 <Method void releaseLastXrefPartial()>
		pdfdictionary = (PdfDictionary)pdfobject3;
	//   68  147:aload           8
	//   69  149:checkcast       #281 <Class PdfDictionary>
	//   70  152:astore          9
		pdfobject = ((PdfObject) ((PdfName)getPdfObjectRelease(pdfdictionary.get(PdfName.S))));
	//   71  154:aload           9
	//   72  156:getstatic       #538 <Field PdfName PdfName.S>
	//   73  159:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   74  162:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//   75  165:checkcast       #103 <Class PdfName>
	//   76  168:astore_1        
		if(!PdfName.GOTO.equals(((Object) (pdfobject)))) goto _L2; else goto _L9
	//   77  169:getstatic       #571 <Field PdfName PdfName.GOTO>
	//   78  172:aload_1         
	//   79  173:invokevirtual   #545 <Method boolean PdfName.equals(Object)>
	//   80  176:ifeq            270
_L9:
		pdfobject1 = getPdfObjectRelease(pdfdictionary.get(PdfName.D));
	//   81  179:aload           9
	//   82  181:getstatic       #548 <Field PdfName PdfName.D>
	//   83  184:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   84  187:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//   85  190:astore          6
		pdfobject = ((PdfObject) (obj));
	//   86  192:aload           5
	//   87  194:astore_1        
		if(pdfobject1 == null) goto _L11; else goto _L10
	//   88  195:aload           6
	//   89  197:ifnull          211
_L10:
		if(!pdfobject1.isName()) goto _L13; else goto _L12
	//   90  200:aload           6
	//   91  202:invokevirtual   #551 <Method boolean PdfObject.isName()>
	//   92  205:ifeq            250
_L12:
		pdfobject = pdfobject1;
	//   93  208:aload           6
	//   94  210:astore_1        
_L11:
		pdfobject = ((PdfObject) ((PdfArray)hashmap.get(((Object) (pdfobject)))));
	//   95  211:aload_2         
	//   96  212:aload_1         
	//   97  213:invokevirtual   #556 <Method Object HashMap.get(Object)>
	//   98  216:checkcast       #558 <Class PdfArray>
	//   99  219:astore_1        
		if(pdfobject != null)
	//* 100  220:aload_1         
	//* 101  221:ifnull          270
		{
			pdfdictionary.put(PdfName.D, pdfobject);
	//  102  224:aload           9
	//  103  226:getstatic       #548 <Field PdfName PdfName.D>
	//  104  229:aload_1         
	//  105  230:invokevirtual   #575 <Method void PdfDictionary.put(PdfName, PdfObject)>
			setXrefPartialObject(j, pdfobject3);
	//  106  233:aload_0         
	//  107  234:iload           4
	//  108  236:aload           8
	//  109  238:invokespecial   #579 <Method void setXrefPartialObject(int, PdfObject)>
			setXrefPartialObject(i, pdfobject2);
	//  110  241:aload_0         
	//  111  242:iload_3         
	//  112  243:aload           7
	//  113  245:invokespecial   #579 <Method void setXrefPartialObject(int, PdfObject)>
			return true;
	//  114  248:iconst_1        
	//  115  249:ireturn         
		}
		break; /* Loop/switch isn't completed */
_L13:
		pdfobject = ((PdfObject) (obj));
	//  116  250:aload           5
	//  117  252:astore_1        
		if(pdfobject1.isString())
	//* 118  253:aload           6
	//* 119  255:invokevirtual   #582 <Method boolean PdfObject.isString()>
	//* 120  258:ifeq            211
			pdfobject = ((PdfObject) (pdfobject1.toString()));
	//  121  261:aload           6
	//  122  263:invokevirtual   #586 <Method String PdfObject.toString()>
	//  123  266:astore_1        
		if(true) goto _L11; else goto _L2
	//  124  267:goto            211
_L2:
		return false;
	//  125  270:iconst_0        
	//  126  271:ireturn         
	}

	private void setXrefPartialObject(int i, PdfObject pdfobject)
	{
		if(!partial || i < 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #187 <Field boolean partial>
	//*   2    4:ifeq            11
	//*   3    7:iload_1         
	//*   4    8:ifge            12
		{
			return;
	//    5   11:return          
		} else
		{
			xrefObj.set(i, ((Object) (pdfobject)));
	//    6   12:aload_0         
	//    7   13:getfield        #251 <Field ArrayList xrefObj>
	//    8   16:iload_1         
	//    9   17:aload_2         
	//   10   18:invokevirtual   #272 <Method Object ArrayList.set(int, Object)>
	//   11   21:pop             
			return;
	//   12   22:return          
		}
	}

	public PRIndirectReference addPdfObject(PdfObject pdfobject)
	{
		xrefObj.add(((Object) (pdfobject)));
	//    0    0:aload_0         
	//    1    1:getfield        #251 <Field ArrayList xrefObj>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #605 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
		return new PRIndirectReference(this, xrefObj.size() - 1);
	//    5    9:new             #305 <Class PRIndirectReference>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #251 <Field ArrayList xrefObj>
	//   10   18:invokevirtual   #258 <Method int ArrayList.size()>
	//   11   21:iconst_1        
	//   12   22:isub            
	//   13   23:invokespecial   #1172 <Method void PRIndirectReference(PdfReader, int)>
	//   14   26:areturn         
	}

	public void addViewerPreference(PdfName pdfname, PdfObject pdfobject)
	{
		viewerPreferences.addViewerPreference(pdfname, pdfobject);
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field PdfViewerPreferencesImp viewerPreferences>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #1175 <Method void PdfViewerPreferencesImp.addViewerPreference(PdfName, PdfObject)>
		setViewerPreferences(viewerPreferences);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #183 <Field PdfViewerPreferencesImp viewerPreferences>
	//    8   14:invokevirtual   #1179 <Method void setViewerPreferences(PdfViewerPreferencesImp)>
	//    9   17:return          
	}

	public void close()
	{
		try
		{
			tokens.close();
	//    0    0:aload_0         
	//    1    1:getfield        #193 <Field PRTokeniser tokens>
	//    2    4:invokevirtual   #1180 <Method void PRTokeniser.close()>
			return;
	//    3    7:return          
		}
		catch(IOException ioexception)
	//*   4    8:astore_1        
		{
			throw new ExceptionConverter(((Exception) (ioexception)));
	//    5    9:new             #825 <Class ExceptionConverter>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #828 <Method void ExceptionConverter(Exception)>
	//    9   17:athrow          
		}
	}

	public byte[] computeUserPassword()
	{
		if(!encrypted || !ownerPasswordUsed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #151 <Field boolean encrypted>
	//*   2    4:ifeq            14
	//*   3    7:aload_0         
	//*   4    8:getfield        #307 <Field boolean ownerPasswordUsed>
	//*   5   11:ifne            16
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		else
			return decrypt.computeUserPassword(password);
	//    8   16:aload_0         
	//    9   17:getfield        #240 <Field PdfEncryption decrypt>
	//   10   20:aload_0         
	//   11   21:getfield        #157 <Field byte[] password>
	//   12   24:invokevirtual   #1183 <Method byte[] PdfEncryption.computeUserPassword(byte[])>
	//   13   27:areturn         
	}

	public void consolidateNamedDestinations()
	{
		if(!consolidateNamedDestinations)
	//*   0    0:aload_0         
	//*   1    1:getfield        #174 <Field boolean consolidateNamedDestinations>
	//*   2    4:ifeq            8
	//*   3    7:return          
		{
			consolidateNamedDestinations = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #174 <Field boolean consolidateNamedDestinations>
			HashMap hashmap = getNamedDestination(true);
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #1187 <Method HashMap getNamedDestination(boolean)>
	//   10   18:astore          6
			if(!hashmap.isEmpty())
	//*  11   20:aload           6
	//*  12   22:invokevirtual   #1190 <Method boolean HashMap.isEmpty()>
	//*  13   25:ifne            7
			{
				int i = 1;
	//   14   28:iconst_1        
	//   15   29:istore_1        
				while(i <= pageRefs.size()) 
	//*  16   30:iload_1         
	//*  17   31:aload_0         
	//*  18   32:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//*  19   35:invokevirtual   #1191 <Method int PdfReader$PageRefs.size()>
	//*  20   38:icmpgt          191
				{
					PdfObject pdfobject = pageRefs.getPageN(i).get(PdfName.ANNOTS);
	//   21   41:aload_0         
	//   22   42:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//   23   45:iload_1         
	//   24   46:invokevirtual   #1195 <Method PdfDictionary PdfReader$PageRefs.getPageN(int)>
	//   25   49:getstatic       #1198 <Field PdfName PdfName.ANNOTS>
	//   26   52:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   27   55:astore          7
					PdfArray pdfarray = (PdfArray)getPdfObject(pdfobject);
	//   28   57:aload           7
	//   29   59:invokestatic    #524 <Method PdfObject getPdfObject(PdfObject)>
	//   30   62:checkcast       #558 <Class PdfArray>
	//   31   65:astore          8
					int k = lastXrefPartial;
	//   32   67:aload_0         
	//   33   68:getfield        #178 <Field int lastXrefPartial>
	//   34   71:istore          5
					releaseLastXrefPartial();
	//   35   73:aload_0         
	//   36   74:invokevirtual   #527 <Method void releaseLastXrefPartial()>
					if(pdfarray == null)
	//*  37   77:aload           8
	//*  38   79:ifnonnull       97
					{
						pageRefs.releasePage(i);
	//   39   82:aload_0         
	//   40   83:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//   41   86:iload_1         
	//   42   87:invokevirtual   #1201 <Method void PdfReader$PageRefs.releasePage(int)>
					} else
	//*  43   90:iload_1         
	//*  44   91:iconst_1        
	//*  45   92:iadd            
	//*  46   93:istore_1        
	//*  47   94:goto            30
					{
						boolean flag = false;
	//   48   97:iconst_0        
	//   49   98:istore_3        
						for(int j = 0; j < pdfarray.size();)
	//*  50   99:iconst_0        
	//*  51  100:istore_2        
	//*  52  101:iload_2         
	//*  53  102:aload           8
	//*  54  104:invokevirtual   #719 <Method int PdfArray.size()>
	//*  55  107:icmpge          156
						{
							PdfObject pdfobject1 = pdfarray.getPdfObject(j);
	//   56  110:aload           8
	//   57  112:iload_2         
	//   58  113:invokevirtual   #763 <Method PdfObject PdfArray.getPdfObject(int)>
	//   59  116:astore          9
							boolean flag1 = flag;
	//   60  118:iload_3         
	//   61  119:istore          4
							if(replaceNamedDestination(pdfobject1, hashmap))
	//*  62  121:aload_0         
	//*  63  122:aload           9
	//*  64  124:aload           6
	//*  65  126:invokespecial   #899 <Method boolean replaceNamedDestination(PdfObject, HashMap)>
	//*  66  129:ifeq            146
							{
								flag1 = flag;
	//   67  132:iload_3         
	//   68  133:istore          4
								if(!pdfobject1.isIndirect())
	//*  69  135:aload           9
	//*  70  137:invokevirtual   #817 <Method boolean PdfObject.isIndirect()>
	//*  71  140:ifne            146
									flag1 = true;
	//   72  143:iconst_1        
	//   73  144:istore          4
							}
							j++;
	//   74  146:iload_2         
	//   75  147:iconst_1        
	//   76  148:iadd            
	//   77  149:istore_2        
							flag = flag1;
	//   78  150:iload           4
	//   79  152:istore_3        
						}

	//*  80  153:goto            101
						if(flag)
	//*  81  156:iload_3         
	//*  82  157:ifeq            168
							setXrefPartialObject(k, ((PdfObject) (pdfarray)));
	//   83  160:aload_0         
	//   84  161:iload           5
	//   85  163:aload           8
	//   86  165:invokespecial   #579 <Method void setXrefPartialObject(int, PdfObject)>
						if(!flag || pdfobject.isIndirect())
	//*  87  168:iload_3         
	//*  88  169:ifeq            180
	//*  89  172:aload           7
	//*  90  174:invokevirtual   #817 <Method boolean PdfObject.isIndirect()>
	//*  91  177:ifeq            90
							pageRefs.releasePage(i);
	//   92  180:aload_0         
	//   93  181:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//   94  184:iload_1         
	//   95  185:invokevirtual   #1201 <Method void PdfReader$PageRefs.releasePage(int)>
					}
					i++;
				}
	//*  96  188:goto            90
				PdfDictionary pdfdictionary = (PdfDictionary)getPdfObjectRelease(catalog.get(PdfName.OUTLINES));
	//   97  191:aload_0         
	//   98  192:getfield        #290 <Field PdfDictionary catalog>
	//   99  195:getstatic       #1204 <Field PdfName PdfName.OUTLINES>
	//  100  198:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//  101  201:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//  102  204:checkcast       #281 <Class PdfDictionary>
	//  103  207:astore          7
				if(pdfdictionary != null)
	//* 104  209:aload           7
	//* 105  211:ifnull          7
				{
					iterateBookmarks(pdfdictionary.get(PdfName.FIRST), hashmap);
	//  106  214:aload_0         
	//  107  215:aload           7
	//  108  217:getstatic       #902 <Field PdfName PdfName.FIRST>
	//  109  220:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//  110  223:aload           6
	//  111  225:invokespecial   #904 <Method void iterateBookmarks(PdfObject, HashMap)>
					return;
	//  112  228:return          
				}
			}
		}
	}

	public int createFakeFontSubsets()
	{
		int i;
		int j;
		j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		i = 1;
	//    2    2:iconst_1        
	//    3    3:istore_1        
_L2:
		int k;
		Object obj;
		if(i >= xrefObj.size())
			break MISSING_BLOCK_LABEL_275;
	//    4    4:iload_1         
	//    5    5:aload_0         
	//    6    6:getfield        #251 <Field ArrayList xrefObj>
	//    7    9:invokevirtual   #258 <Method int ArrayList.size()>
	//    8   12:icmpge          275
		obj = ((Object) (getPdfObjectRelease(i)));
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:invokevirtual   #1207 <Method PdfObject getPdfObjectRelease(int)>
	//   12   20:astore          4
		k = j;
	//   13   22:iload_2         
	//   14   23:istore_3        
		if(obj != null)
	//*  15   24:aload           4
	//*  16   26:ifnull          39
		{
			if(((PdfObject) (obj)).isDictionary())
				break; /* Loop/switch isn't completed */
	//   17   29:aload           4
	//   18   31:invokevirtual   #531 <Method boolean PdfObject.isDictionary()>
	//   19   34:ifne            48
			k = j;
	//   20   37:iload_2         
	//   21   38:istore_3        
		}
_L4:
		i++;
	//   22   39:iload_1         
	//   23   40:iconst_1        
	//   24   41:iadd            
	//   25   42:istore_1        
		j = k;
	//   26   43:iload_3         
	//   27   44:istore_2        
		if(true) goto _L2; else goto _L1
	//   28   45:goto            4
_L1:
		obj = ((Object) ((PdfDictionary)obj));
	//   29   48:aload           4
	//   30   50:checkcast       #281 <Class PdfDictionary>
	//   31   53:astore          4
		k = j;
	//   32   55:iload_2         
	//   33   56:istore_3        
		if(!existsName(((PdfDictionary) (obj)), PdfName.TYPE, PdfName.FONT)) goto _L4; else goto _L3
	//   34   57:aload           4
	//   35   59:getstatic       #1210 <Field PdfName PdfName.TYPE>
	//   36   62:getstatic       #1213 <Field PdfName PdfName.FONT>
	//   37   65:invokestatic    #1215 <Method boolean existsName(PdfDictionary, PdfName, PdfName)>
	//   38   68:ifeq            39
_L3:
		if(existsName(((PdfDictionary) (obj)), PdfName.SUBTYPE, PdfName.TYPE1) || existsName(((PdfDictionary) (obj)), PdfName.SUBTYPE, PdfName.MMTYPE1)) goto _L6; else goto _L5
	//   39   71:aload           4
	//   40   73:getstatic       #1218 <Field PdfName PdfName.SUBTYPE>
	//   41   76:getstatic       #1221 <Field PdfName PdfName.TYPE1>
	//   42   79:invokestatic    #1215 <Method boolean existsName(PdfDictionary, PdfName, PdfName)>
	//   43   82:ifne            115
	//   44   85:aload           4
	//   45   87:getstatic       #1218 <Field PdfName PdfName.SUBTYPE>
	//   46   90:getstatic       #1224 <Field PdfName PdfName.MMTYPE1>
	//   47   93:invokestatic    #1215 <Method boolean existsName(PdfDictionary, PdfName, PdfName)>
	//   48   96:ifne            115
_L5:
		k = j;
	//   49   99:iload_2         
	//   50  100:istore_3        
		if(!existsName(((PdfDictionary) (obj)), PdfName.SUBTYPE, PdfName.TRUETYPE)) goto _L4; else goto _L6
	//   51  101:aload           4
	//   52  103:getstatic       #1218 <Field PdfName PdfName.SUBTYPE>
	//   53  106:getstatic       #1227 <Field PdfName PdfName.TRUETYPE>
	//   54  109:invokestatic    #1215 <Method boolean existsName(PdfDictionary, PdfName, PdfName)>
	//   55  112:ifeq            39
_L6:
		k = j;
	//   56  115:iload_2         
	//   57  116:istore_3        
		if(getSubsetPrefix(((PdfDictionary) (obj))) != null) goto _L4; else goto _L7
	//   58  117:aload           4
	//   59  119:invokestatic    #1229 <Method String getSubsetPrefix(PdfDictionary)>
	//   60  122:ifnonnull       39
_L7:
		Object obj1;
		obj1 = ((Object) (getFontName(((PdfDictionary) (obj)))));
	//   61  125:aload           4
	//   62  127:invokestatic    #888 <Method String getFontName(PdfDictionary)>
	//   63  130:astore          5
		k = j;
	//   64  132:iload_2         
	//   65  133:istore_3        
		if(obj1 == null) goto _L4; else goto _L8
	//   66  134:aload           5
	//   67  136:ifnull          39
_L8:
		PdfDictionary pdfdictionary;
		obj1 = ((Object) ((new StringBuilder()).append(BaseFont.createSubsetPrefix()).append(((String) (obj1))).toString()));
	//   68  139:new             #1231 <Class StringBuilder>
	//   69  142:dup             
	//   70  143:invokespecial   #1232 <Method void StringBuilder()>
	//   71  146:invokestatic    #1237 <Method String BaseFont.createSubsetPrefix()>
	//   72  149:invokevirtual   #1241 <Method StringBuilder StringBuilder.append(String)>
	//   73  152:aload           5
	//   74  154:invokevirtual   #1241 <Method StringBuilder StringBuilder.append(String)>
	//   75  157:invokevirtual   #1242 <Method String StringBuilder.toString()>
	//   76  160:astore          5
		pdfdictionary = (PdfDictionary)getPdfObjectRelease(((PdfDictionary) (obj)).get(PdfName.FONTDESCRIPTOR));
	//   77  162:aload           4
	//   78  164:getstatic       #1245 <Field PdfName PdfName.FONTDESCRIPTOR>
	//   79  167:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   80  170:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//   81  173:checkcast       #281 <Class PdfDictionary>
	//   82  176:astore          6
		k = j;
	//   83  178:iload_2         
	//   84  179:istore_3        
		if(pdfdictionary == null) goto _L4; else goto _L9
	//   85  180:aload           6
	//   86  182:ifnull          39
_L9:
		if(pdfdictionary.get(PdfName.FONTFILE) != null || pdfdictionary.get(PdfName.FONTFILE2) != null) goto _L11; else goto _L10
	//   87  185:aload           6
	//   88  187:getstatic       #1248 <Field PdfName PdfName.FONTFILE>
	//   89  190:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   90  193:ifnonnull       220
	//   91  196:aload           6
	//   92  198:getstatic       #1251 <Field PdfName PdfName.FONTFILE2>
	//   93  201:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   94  204:ifnonnull       220
_L10:
		k = j;
	//   95  207:iload_2         
	//   96  208:istore_3        
		if(pdfdictionary.get(PdfName.FONTFILE3) == null) goto _L4; else goto _L11
	//   97  209:aload           6
	//   98  211:getstatic       #1254 <Field PdfName PdfName.FONTFILE3>
	//   99  214:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//  100  217:ifnull          39
_L11:
		PdfDictionary pdfdictionary1 = ((PdfDictionary) (obj)).getAsDict(PdfName.FONTDESCRIPTOR);
	//  101  220:aload           4
	//  102  222:getstatic       #1245 <Field PdfName PdfName.FONTDESCRIPTOR>
	//  103  225:invokevirtual   #288 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//  104  228:astore          6
		obj1 = ((Object) (new PdfName(((String) (obj1)))));
	//  105  230:new             #103 <Class PdfName>
	//  106  233:dup             
	//  107  234:aload           5
	//  108  236:invokespecial   #1255 <Method void PdfName(String)>
	//  109  239:astore          5
		((PdfDictionary) (obj)).put(PdfName.BASEFONT, ((PdfObject) (obj1)));
	//  110  241:aload           4
	//  111  243:getstatic       #752 <Field PdfName PdfName.BASEFONT>
	//  112  246:aload           5
	//  113  248:invokevirtual   #575 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary1.put(PdfName.FONTNAME, ((PdfObject) (obj1)));
	//  114  251:aload           6
	//  115  253:getstatic       #1258 <Field PdfName PdfName.FONTNAME>
	//  116  256:aload           5
	//  117  258:invokevirtual   #575 <Method void PdfDictionary.put(PdfName, PdfObject)>
		setXrefPartialObject(i, ((PdfObject) (obj)));
	//  118  261:aload_0         
	//  119  262:iload_1         
	//  120  263:aload           4
	//  121  265:invokespecial   #579 <Method void setXrefPartialObject(int, PdfObject)>
		k = j + 1;
	//  122  268:iload_2         
	//  123  269:iconst_1        
	//  124  270:iadd            
	//  125  271:istore_3        
		  goto _L4
	//* 126  272:goto            39
		return j;
	//  127  275:iload_2         
	//  128  276:ireturn         
	}

	public double dumpPerc()
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		for(int i = 0; i < xrefObj.size();)
	//*   2    2:iconst_0        
	//*   3    3:istore_1        
	//*   4    4:iload_1         
	//*   5    5:aload_0         
	//*   6    6:getfield        #251 <Field ArrayList xrefObj>
	//*   7    9:invokevirtual   #258 <Method int ArrayList.size()>
	//*   8   12:icmpge          41
		{
			int k = j;
	//    9   15:iload_2         
	//   10   16:istore_3        
			if(xrefObj.get(i) != null)
	//*  11   17:aload_0         
	//*  12   18:getfield        #251 <Field ArrayList xrefObj>
	//*  13   21:iload_1         
	//*  14   22:invokevirtual   #262 <Method Object ArrayList.get(int)>
	//*  15   25:ifnull          32
				k = j + 1;
	//   16   28:iload_2         
	//   17   29:iconst_1        
	//   18   30:iadd            
	//   19   31:istore_3        
			i++;
	//   20   32:iload_1         
	//   21   33:iconst_1        
	//   22   34:iadd            
	//   23   35:istore_1        
			j = k;
	//   24   36:iload_3         
	//   25   37:istore_2        
		}

	//*  26   38:goto            4
		return ((double)j * 100D) / (double)xrefObj.size();
	//   27   41:iload_2         
	//   28   42:i2d             
	//   29   43:ldc2w           #1261 <Double 100D>
	//   30   46:dmul            
	//   31   47:aload_0         
	//   32   48:getfield        #251 <Field ArrayList xrefObj>
	//   33   51:invokevirtual   #258 <Method int ArrayList.size()>
	//   34   54:i2d             
	//   35   55:ddiv            
	//   36   56:dreturn         
	}

	public void eliminateSharedStreams()
	{
		if(sharedStreams) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field boolean sharedStreams>
	//    2    4:ifne            8
_L1:
		return;
	//    3    7:return          
_L2:
		int i;
		ArrayList arraylist;
		ArrayList arraylist1;
		IntHashtable inthashtable;
		sharedStreams = false;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #172 <Field boolean sharedStreams>
		if(pageRefs.size() == 1)
			continue; /* Loop/switch isn't completed */
	//    7   13:aload_0         
	//    8   14:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//    9   17:invokevirtual   #1191 <Method int PdfReader$PageRefs.size()>
	//   10   20:iconst_1        
	//   11   21:icmpeq          7
		arraylist = new ArrayList();
	//   12   24:new             #167 <Class ArrayList>
	//   13   27:dup             
	//   14   28:invokespecial   #168 <Method void ArrayList()>
	//   15   31:astore_3        
		arraylist1 = new ArrayList();
	//   16   32:new             #167 <Class ArrayList>
	//   17   35:dup             
	//   18   36:invokespecial   #168 <Method void ArrayList()>
	//   19   39:astore          4
		inthashtable = new IntHashtable();
	//   20   41:new             #1265 <Class IntHashtable>
	//   21   44:dup             
	//   22   45:invokespecial   #1266 <Method void IntHashtable()>
	//   23   48:astore          5
		i = 1;
	//   24   50:iconst_1        
	//   25   51:istore_1        
_L4:
		Object obj1;
		if(i > pageRefs.size())
			continue; /* Loop/switch isn't completed */
	//   26   52:iload_1         
	//   27   53:aload_0         
	//   28   54:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//   29   57:invokevirtual   #1191 <Method int PdfReader$PageRefs.size()>
	//   30   60:icmpgt          282
		obj1 = ((Object) (pageRefs.getPageN(i)));
	//   31   63:aload_0         
	//   32   64:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//   33   67:iload_1         
	//   34   68:invokevirtual   #1195 <Method PdfDictionary PdfReader$PageRefs.getPageN(int)>
	//   35   71:astore          7
		if(obj1 != null)
			break; /* Loop/switch isn't completed */
	//   36   73:aload           7
	//   37   75:ifnonnull       85
_L5:
		i++;
	//   38   78:iload_1         
	//   39   79:iconst_1        
	//   40   80:iadd            
	//   41   81:istore_1        
		if(true) goto _L4; else goto _L3
	//   42   82:goto            52
_L3:
		Object obj;
		obj = ((Object) (getPdfObject(((PdfDictionary) (obj1)).get(PdfName.CONTENTS))));
	//   43   85:aload           7
	//   44   87:getstatic       #795 <Field PdfName PdfName.CONTENTS>
	//   45   90:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   46   93:invokestatic    #524 <Method PdfObject getPdfObject(PdfObject)>
	//   47   96:astore          6
		if(obj != null)
	//*  48   98:aload           6
	//*  49  100:ifnull          78
		{
			if(!((PdfObject) (obj)).isStream())
				continue; /* Loop/switch isn't completed */
	//   50  103:aload           6
	//   51  105:invokevirtual   #801 <Method boolean PdfObject.isStream()>
	//   52  108:ifeq            181
			obj1 = ((Object) ((PRIndirectReference)((PdfDictionary) (obj1)).get(PdfName.CONTENTS)));
	//   53  111:aload           7
	//   54  113:getstatic       #795 <Field PdfName PdfName.CONTENTS>
	//   55  116:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   56  119:checkcast       #305 <Class PRIndirectReference>
	//   57  122:astore          7
			if(inthashtable.containsKey(((PRIndirectReference) (obj1)).getNumber()))
	//*  58  124:aload           5
	//*  59  126:aload           7
	//*  60  128:invokevirtual   #730 <Method int PRIndirectReference.getNumber()>
	//*  61  131:invokevirtual   #1269 <Method boolean IntHashtable.containsKey(int)>
	//*  62  134:ifeq            166
			{
				arraylist.add(obj1);
	//   63  137:aload_3         
	//   64  138:aload           7
	//   65  140:invokevirtual   #605 <Method boolean ArrayList.add(Object)>
	//   66  143:pop             
				arraylist1.add(((Object) (new PRStream((PRStream)obj, ((PdfDictionary) (null))))));
	//   67  144:aload           4
	//   68  146:new             #453 <Class PRStream>
	//   69  149:dup             
	//   70  150:aload           6
	//   71  152:checkcast       #453 <Class PRStream>
	//   72  155:aconst_null     
	//   73  156:invokespecial   #1272 <Method void PRStream(PRStream, PdfDictionary)>
	//   74  159:invokevirtual   #605 <Method boolean ArrayList.add(Object)>
	//   75  162:pop             
			} else
	//*  76  163:goto            78
			{
				inthashtable.put(((PRIndirectReference) (obj1)).getNumber(), 1);
	//   77  166:aload           5
	//   78  168:aload           7
	//   79  170:invokevirtual   #730 <Method int PRIndirectReference.getNumber()>
	//   80  173:iconst_1        
	//   81  174:invokevirtual   #1275 <Method int IntHashtable.put(int, int)>
	//   82  177:pop             
			}
		}
		  goto _L5
	//*  83  178:goto            78
		if(!((PdfObject) (obj)).isArray()) goto _L5; else goto _L6
	//   84  181:aload           6
	//   85  183:invokevirtual   #611 <Method boolean PdfObject.isArray()>
	//   86  186:ifeq            78
_L6:
		obj = ((Object) ((PdfArray)obj));
	//   87  189:aload           6
	//   88  191:checkcast       #558 <Class PdfArray>
	//   89  194:astore          6
		int k = 0;
	//   90  196:iconst_0        
	//   91  197:istore_2        
		while(k < ((PdfArray) (obj)).size()) 
	//*  92  198:iload_2         
	//*  93  199:aload           6
	//*  94  201:invokevirtual   #719 <Method int PdfArray.size()>
	//*  95  204:icmpge          78
		{
			PRIndirectReference prindirectreference = (PRIndirectReference)((PdfArray) (obj)).getPdfObject(k);
	//   96  207:aload           6
	//   97  209:iload_2         
	//   98  210:invokevirtual   #763 <Method PdfObject PdfArray.getPdfObject(int)>
	//   99  213:checkcast       #305 <Class PRIndirectReference>
	//  100  216:astore          7
			if(inthashtable.containsKey(prindirectreference.getNumber()))
	//* 101  218:aload           5
	//* 102  220:aload           7
	//* 103  222:invokevirtual   #730 <Method int PRIndirectReference.getNumber()>
	//* 104  225:invokevirtual   #1269 <Method boolean IntHashtable.containsKey(int)>
	//* 105  228:ifeq            267
			{
				arraylist.add(((Object) (prindirectreference)));
	//  106  231:aload_3         
	//  107  232:aload           7
	//  108  234:invokevirtual   #605 <Method boolean ArrayList.add(Object)>
	//  109  237:pop             
				arraylist1.add(((Object) (new PRStream((PRStream)getPdfObject(((PdfObject) (prindirectreference))), ((PdfDictionary) (null))))));
	//  110  238:aload           4
	//  111  240:new             #453 <Class PRStream>
	//  112  243:dup             
	//  113  244:aload           7
	//  114  246:invokestatic    #524 <Method PdfObject getPdfObject(PdfObject)>
	//  115  249:checkcast       #453 <Class PRStream>
	//  116  252:aconst_null     
	//  117  253:invokespecial   #1272 <Method void PRStream(PRStream, PdfDictionary)>
	//  118  256:invokevirtual   #605 <Method boolean ArrayList.add(Object)>
	//  119  259:pop             
			} else
	//* 120  260:iload_2         
	//* 121  261:iconst_1        
	//* 122  262:iadd            
	//* 123  263:istore_2        
	//* 124  264:goto            198
			{
				inthashtable.put(prindirectreference.getNumber(), 1);
	//  125  267:aload           5
	//  126  269:aload           7
	//  127  271:invokevirtual   #730 <Method int PRIndirectReference.getNumber()>
	//  128  274:iconst_1        
	//  129  275:invokevirtual   #1275 <Method int IntHashtable.put(int, int)>
	//  130  278:pop             
			}
			k++;
		}
		  goto _L5
	//* 131  279:goto            260
		if(arraylist1.isEmpty()) goto _L1; else goto _L7
	//  132  282:aload           4
	//  133  284:invokevirtual   #1276 <Method boolean ArrayList.isEmpty()>
	//  134  287:ifne            7
_L7:
		int j = 0;
	//  135  290:iconst_0        
	//  136  291:istore_1        
		while(j < arraylist1.size()) 
	//* 137  292:iload_1         
	//* 138  293:aload           4
	//* 139  295:invokevirtual   #258 <Method int ArrayList.size()>
	//* 140  298:icmpge          7
		{
			xrefObj.add(arraylist1.get(j));
	//  141  301:aload_0         
	//  142  302:getfield        #251 <Field ArrayList xrefObj>
	//  143  305:aload           4
	//  144  307:iload_1         
	//  145  308:invokevirtual   #262 <Method Object ArrayList.get(int)>
	//  146  311:invokevirtual   #605 <Method boolean ArrayList.add(Object)>
	//  147  314:pop             
			((PRIndirectReference)arraylist.get(j)).setNumber(xrefObj.size() - 1, 0);
	//  148  315:aload_3         
	//  149  316:iload_1         
	//  150  317:invokevirtual   #262 <Method Object ArrayList.get(int)>
	//  151  320:checkcast       #305 <Class PRIndirectReference>
	//  152  323:aload_0         
	//  153  324:getfield        #251 <Field ArrayList xrefObj>
	//  154  327:invokevirtual   #258 <Method int ArrayList.size()>
	//  155  330:iconst_1        
	//  156  331:isub            
	//  157  332:iconst_0        
	//  158  333:invokevirtual   #1279 <Method void PRIndirectReference.setNumber(int, int)>
			j++;
	//  159  336:iload_1         
	//  160  337:iconst_1        
	//  161  338:iadd            
	//  162  339:istore_1        
		}
		if(true) goto _L1; else goto _L8
	//  163  340:goto            292
_L8:
	}

	public AcroFields getAcroFields()
	{
		return new AcroFields(this, ((PdfWriter) (null)));
	//    0    0:new             #1283 <Class AcroFields>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #1286 <Method void AcroFields(PdfReader, PdfWriter)>
	//    5    9:areturn         
	}

	public PRAcroForm getAcroForm()
	{
		if(!acroFormParsed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field boolean acroFormParsed>
	//*   2    4:ifne            53
		{
			acroFormParsed = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #149 <Field boolean acroFormParsed>
			PdfObject pdfobject = catalog.get(PdfName.ACROFORM);
	//    6   12:aload_0         
	//    7   13:getfield        #290 <Field PdfDictionary catalog>
	//    8   16:getstatic       #1291 <Field PdfName PdfName.ACROFORM>
	//    9   19:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   10   22:astore_1        
			if(pdfobject != null)
	//*  11   23:aload_1         
	//*  12   24:ifnull          53
				try
				{
					acroForm = new PRAcroForm(this);
	//   13   27:aload_0         
	//   14   28:new             #1293 <Class PRAcroForm>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:invokespecial   #1295 <Method void PRAcroForm(PdfReader)>
	//   18   36:putfield        #147 <Field PRAcroForm acroForm>
					acroForm.readAcroForm((PdfDictionary)getPdfObject(pdfobject));
	//   19   39:aload_0         
	//   20   40:getfield        #147 <Field PRAcroForm acroForm>
	//   21   43:aload_1         
	//   22   44:invokestatic    #524 <Method PdfObject getPdfObject(PdfObject)>
	//   23   47:checkcast       #281 <Class PdfDictionary>
	//   24   50:invokevirtual   #1299 <Method void PRAcroForm.readAcroForm(PdfDictionary)>
				}
	//*  25   53:aload_0         
	//*  26   54:getfield        #147 <Field PRAcroForm acroForm>
	//*  27   57:areturn         
				catch(Exception exception)
	//*  28   58:astore_1        
				{
					acroForm = null;
	//   29   59:aload_0         
	//   30   60:aconst_null     
	//   31   61:putfield        #147 <Field PRAcroForm acroForm>
				}
		}
		return acroForm;
	//*  32   64:goto            53
	}

	public Rectangle getBoxSize(int i, String s)
	{
		PdfDictionary pdfdictionary = pageRefs.getPageNRelease(i);
	//    0    0:aload_0         
	//    1    1:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #1304 <Method PdfDictionary PdfReader$PageRefs.getPageNRelease(int)>
	//    4    8:astore          4
		PdfArray pdfarray = null;
	//    5   10:aconst_null     
	//    6   11:astore_3        
		if(s.equals("trim"))
	//*   7   12:aload_2         
	//*   8   13:ldc2            #1306 <String "trim">
	//*   9   16:invokevirtual   #872 <Method boolean String.equals(Object)>
	//*  10   19:ifeq            43
			pdfarray = (PdfArray)getPdfObjectRelease(pdfdictionary.get(PdfName.TRIMBOX));
	//   11   22:aload           4
	//   12   24:getstatic       #1309 <Field PdfName PdfName.TRIMBOX>
	//   13   27:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   14   30:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//   15   33:checkcast       #558 <Class PdfArray>
	//   16   36:astore_3        
		else
	//*  17   37:aload_3         
	//*  18   38:ifnonnull       155
	//*  19   41:aconst_null     
	//*  20   42:areturn         
		if(s.equals("art"))
	//*  21   43:aload_2         
	//*  22   44:ldc2            #1311 <String "art">
	//*  23   47:invokevirtual   #872 <Method boolean String.equals(Object)>
	//*  24   50:ifeq            71
			pdfarray = (PdfArray)getPdfObjectRelease(pdfdictionary.get(PdfName.ARTBOX));
	//   25   53:aload           4
	//   26   55:getstatic       #1314 <Field PdfName PdfName.ARTBOX>
	//   27   58:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   28   61:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//   29   64:checkcast       #558 <Class PdfArray>
	//   30   67:astore_3        
		else
	//*  31   68:goto            37
		if(s.equals("bleed"))
	//*  32   71:aload_2         
	//*  33   72:ldc2            #1316 <String "bleed">
	//*  34   75:invokevirtual   #872 <Method boolean String.equals(Object)>
	//*  35   78:ifeq            99
			pdfarray = (PdfArray)getPdfObjectRelease(pdfdictionary.get(PdfName.BLEEDBOX));
	//   36   81:aload           4
	//   37   83:getstatic       #1319 <Field PdfName PdfName.BLEEDBOX>
	//   38   86:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   39   89:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//   40   92:checkcast       #558 <Class PdfArray>
	//   41   95:astore_3        
		else
	//*  42   96:goto            37
		if(s.equals("crop"))
	//*  43   99:aload_2         
	//*  44  100:ldc2            #1321 <String "crop">
	//*  45  103:invokevirtual   #872 <Method boolean String.equals(Object)>
	//*  46  106:ifeq            127
			pdfarray = (PdfArray)getPdfObjectRelease(pdfdictionary.get(PdfName.CROPBOX));
	//   47  109:aload           4
	//   48  111:getstatic       #116 <Field PdfName PdfName.CROPBOX>
	//   49  114:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   50  117:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//   51  120:checkcast       #558 <Class PdfArray>
	//   52  123:astore_3        
		else
	//*  53  124:goto            37
		if(s.equals("media"))
	//*  54  127:aload_2         
	//*  55  128:ldc2            #1323 <String "media">
	//*  56  131:invokevirtual   #872 <Method boolean String.equals(Object)>
	//*  57  134:ifeq            37
			pdfarray = (PdfArray)getPdfObjectRelease(pdfdictionary.get(PdfName.MEDIABOX));
	//   58  137:aload           4
	//   59  139:getstatic       #107 <Field PdfName PdfName.MEDIABOX>
	//   60  142:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   61  145:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//   62  148:checkcast       #558 <Class PdfArray>
	//   63  151:astore_3        
		if(pdfarray == null)
			return null;
		else
	//*  64  152:goto            37
			return getNormalizedRectangle(pdfarray);
	//   65  155:aload_3         
	//   66  156:invokestatic    #1325 <Method Rectangle getNormalizedRectangle(PdfArray)>
	//   67  159:areturn         
	}

	public PdfDictionary getCatalog()
	{
		return catalog;
	//    0    0:aload_0         
	//    1    1:getfield        #290 <Field PdfDictionary catalog>
	//    2    4:areturn         
	}

	public int getCertificationLevel()
	{
		Object obj = ((Object) (catalog.getAsDict(PdfName.PERMS)));
	//    0    0:aload_0         
	//    1    1:getfield        #290 <Field PdfDictionary catalog>
	//    2    4:getstatic       #978 <Field PdfName PdfName.PERMS>
	//    3    7:invokevirtual   #288 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//    4   10:astore_1        
		if(obj != null)
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       17
	//*   7   15:iconst_0        
	//*   8   16:ireturn         
	//*   9   17:aload_1         
	//*  10   18:getstatic       #1331 <Field PdfName PdfName.DOCMDP>
	//*  11   21:invokevirtual   #288 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//*  12   24:astore_1        
			if((obj = ((Object) (((PdfDictionary) (obj)).getAsDict(PdfName.DOCMDP)))) != null && ((obj = ((Object) (((PdfDictionary) (obj)).getAsArray(PdfName.REFERENCE)))) != null && ((PdfArray) (obj)).size() != 0) && (obj = ((Object) (((PdfArray) (obj)).getAsDict(0)))) != null && (obj = ((Object) (((PdfDictionary) (obj)).getAsDict(PdfName.TRANSFORMPARAMS)))) != null && (obj = ((Object) (((PdfDictionary) (obj)).getAsNumber(PdfName.P)))) != null)
	//*  13   25:aload_1         
	//*  14   26:ifnull          15
	//*  15   29:aload_1         
	//*  16   30:getstatic       #1334 <Field PdfName PdfName.REFERENCE>
	//*  17   33:invokevirtual   #947 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//*  18   36:astore_1        
	//*  19   37:aload_1         
	//*  20   38:ifnull          15
	//*  21   41:aload_1         
	//*  22   42:invokevirtual   #719 <Method int PdfArray.size()>
	//*  23   45:ifeq            15
	//*  24   48:aload_1         
	//*  25   49:iconst_0        
	//*  26   50:invokevirtual   #1336 <Method PdfDictionary PdfArray.getAsDict(int)>
	//*  27   53:astore_1        
	//*  28   54:aload_1         
	//*  29   55:ifnull          15
	//*  30   58:aload_1         
	//*  31   59:getstatic       #1339 <Field PdfName PdfName.TRANSFORMPARAMS>
	//*  32   62:invokevirtual   #288 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//*  33   65:astore_1        
	//*  34   66:aload_1         
	//*  35   67:ifnull          15
	//*  36   70:aload_1         
	//*  37   71:getstatic       #981 <Field PdfName PdfName.P>
	//*  38   74:invokevirtual   #1343 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//*  39   77:astore_1        
	//*  40   78:aload_1         
	//*  41   79:ifnull          15
				return ((PdfNumber) (obj)).intValue();
	//   42   82:aload_1         
	//   43   83:invokevirtual   #474 <Method int PdfNumber.intValue()>
	//   44   86:ireturn         
		return 0;
	}

	protected Counter getCounter()
	{
		return COUNTER;
	//    0    0:getstatic       #138 <Field Counter COUNTER>
	//    1    3:areturn         
	}

	public Rectangle getCropBox(int i)
	{
		PdfDictionary pdfdictionary = pageRefs.getPageNRelease(i);
	//    0    0:aload_0         
	//    1    1:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #1304 <Method PdfDictionary PdfReader$PageRefs.getPageNRelease(int)>
	//    4    8:astore_2        
		PdfArray pdfarray = (PdfArray)getPdfObjectRelease(pdfdictionary.get(PdfName.CROPBOX));
	//    5    9:aload_2         
	//    6   10:getstatic       #116 <Field PdfName PdfName.CROPBOX>
	//    7   13:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//    8   16:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//    9   19:checkcast       #558 <Class PdfArray>
	//   10   22:astore_3        
		if(pdfarray == null)
	//*  11   23:aload_3         
	//*  12   24:ifnonnull       33
			return getPageSize(pdfdictionary);
	//   13   27:aload_0         
	//   14   28:aload_2         
	//   15   29:invokevirtual   #1349 <Method Rectangle getPageSize(PdfDictionary)>
	//   16   32:areturn         
		else
			return getNormalizedRectangle(pdfarray);
	//   17   33:aload_3         
	//   18   34:invokestatic    #1325 <Method Rectangle getNormalizedRectangle(PdfArray)>
	//   19   37:areturn         
	}

	public int getCryptoMode()
	{
		if(decrypt == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #240 <Field PdfEncryption decrypt>
	//*   2    4:ifnonnull       9
			return -1;
	//    3    7:iconst_m1       
	//    4    8:ireturn         
		else
			return decrypt.getCryptoMode();
	//    5    9:aload_0         
	//    6   10:getfield        #240 <Field PdfEncryption decrypt>
	//    7   13:invokevirtual   #1352 <Method int PdfEncryption.getCryptoMode()>
	//    8   16:ireturn         
	}

	PdfIndirectReference getCryptoRef()
	{
		if(cryptoRef == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #303 <Field PRIndirectReference cryptoRef>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return new PdfIndirectReference(0, cryptoRef.getNumber(), cryptoRef.getGeneration());
	//    5    9:new             #1356 <Class PdfIndirectReference>
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_0         
	//    9   15:getfield        #303 <Field PRIndirectReference cryptoRef>
	//   10   18:invokevirtual   #730 <Method int PRIndirectReference.getNumber()>
	//   11   21:aload_0         
	//   12   22:getfield        #303 <Field PRIndirectReference cryptoRef>
	//   13   25:invokevirtual   #733 <Method int PRIndirectReference.getGeneration()>
	//   14   28:invokespecial   #1359 <Method void PdfIndirectReference(int, int, int)>
	//   15   31:areturn         
	}

	PdfEncryption getDecrypt()
	{
		return decrypt;
	//    0    0:aload_0         
	//    1    1:getfield        #240 <Field PdfEncryption decrypt>
	//    2    4:areturn         
	}

	public long getEofPos()
	{
		return eofPos;
	//    0    0:aload_0         
	//    1    1:getfield        #223 <Field long eofPos>
	//    2    4:lreturn         
	}

	public long getFileLength()
	{
		return fileLength;
	//    0    0:aload_0         
	//    1    1:getfield        #201 <Field long fileLength>
	//    2    4:lreturn         
	}

	public HashMap getInfo()
	{
		HashMap hashmap;
		PdfDictionary pdfdictionary;
		hashmap = new HashMap();
	//    0    0:new             #553 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #1364 <Method void HashMap()>
	//    3    7:astore_2        
		pdfdictionary = trailer.getAsDict(PdfName.INFO);
	//    4    8:aload_0         
	//    5    9:getfield        #279 <Field PdfDictionary trailer>
	//    6   12:getstatic       #1367 <Field PdfName PdfName.INFO>
	//    7   15:invokevirtual   #288 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//    8   18:astore_3        
		if(pdfdictionary != null) goto _L2; else goto _L1
	//    9   19:aload_3         
	//   10   20:ifnonnull       25
_L1:
		return hashmap;
	//   11   23:aload_2         
	//   12   24:areturn         
_L2:
		Iterator iterator = pdfdictionary.getKeys().iterator();
	//   13   25:aload_3         
	//   14   26:invokevirtual   #698 <Method Set PdfDictionary.getKeys()>
	//   15   29:invokeinterface #704 <Method Iterator Set.iterator()>
	//   16   34:astore          4
_L5:
		if(!iterator.hasNext()) goto _L1; else goto _L3
	//   17   36:aload           4
	//   18   38:invokeinterface #709 <Method boolean Iterator.hasNext()>
	//   19   43:ifeq            23
_L3:
		PdfName pdfname;
		PdfObject pdfobject;
		pdfname = (PdfName)iterator.next();
	//   20   46:aload           4
	//   21   48:invokeinterface #713 <Method Object Iterator.next()>
	//   22   53:checkcast       #103 <Class PdfName>
	//   23   56:astore          5
		pdfobject = getPdfObject(pdfdictionary.get(pdfname));
	//   24   58:aload_3         
	//   25   59:aload           5
	//   26   61:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   27   64:invokestatic    #524 <Method PdfObject getPdfObject(PdfObject)>
	//   28   67:astore          6
		if(pdfobject == null) goto _L5; else goto _L4
	//   29   69:aload           6
	//   30   71:ifnull          36
_L4:
		String s = pdfobject.toString();
	//   31   74:aload           6
	//   32   76:invokevirtual   #586 <Method String PdfObject.toString()>
	//   33   79:astore_1        
		pdfobject.type();
	//   34   80:aload           6
	//   35   82:invokevirtual   #469 <Method int PdfObject.type()>
		JVM INSTR tableswitch 3 4: default 108
	//	               3 125
	//	               4 137;
	//   36   85:tableswitch     3 4: default 108
	//	               3 125
	//	               4 137
		   goto _L6 _L7 _L8
_L6:
		break; /* Loop/switch isn't completed */
_L8:
		break MISSING_BLOCK_LABEL_137;
_L9:
		hashmap.put(((Object) (PdfName.decodeName(pdfname.toString()))), ((Object) (s)));
	//   37  108:aload_2         
	//   38  109:aload           5
	//   39  111:invokevirtual   #1368 <Method String PdfName.toString()>
	//   40  114:invokestatic    #756 <Method String PdfName.decodeName(String)>
	//   41  117:aload_1         
	//   42  118:invokevirtual   #1371 <Method Object HashMap.put(Object, Object)>
	//   43  121:pop             
		  goto _L5
	//*  44  122:goto            36
_L7:
		s = ((PdfString)pdfobject).toUnicodeString();
	//   45  125:aload           6
	//   46  127:checkcast       #1015 <Class PdfString>
	//   47  130:invokevirtual   #1374 <Method String PdfString.toUnicodeString()>
	//   48  133:astore_1        
		  goto _L9
	//*  49  134:goto            108
		s = PdfName.decodeName(s);
	//   50  137:aload_1         
	//   51  138:invokestatic    #756 <Method String PdfName.decodeName(String)>
	//   52  141:astore_1        
		  goto _L9
	//*  53  142:goto            108
	}

	public String getJavaScript()
		throws IOException
	{
		RandomAccessFileOrArray randomaccessfileorarray = getSafeFile();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #806 <Method RandomAccessFileOrArray getSafeFile()>
	//    2    4:astore_1        
		Object obj;
		randomaccessfileorarray.reOpen();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #809 <Method void RandomAccessFileOrArray.reOpen()>
		obj = ((Object) (getJavaScript(randomaccessfileorarray)));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #1379 <Method String getJavaScript(RandomAccessFileOrArray)>
	//    8   14:astore_2        
		try
		{
			randomaccessfileorarray.close();
	//    9   15:aload_1         
	//   10   16:invokevirtual   #814 <Method void RandomAccessFileOrArray.close()>
		}
	//*  11   19:aload_2         
	//*  12   20:areturn         
	//*  13   21:astore_2        
	//*  14   22:aload_1         
	//*  15   23:invokevirtual   #814 <Method void RandomAccessFileOrArray.close()>
	//*  16   26:aload_2         
	//*  17   27:athrow          
		catch(Exception exception)
	//*  18   28:astore_1        
		{
			return ((String) (obj));
	//   19   29:aload_2         
	//   20   30:areturn         
		}
		return ((String) (obj));
		obj;
		try
		{
			randomaccessfileorarray.close();
		}
		catch(Exception exception1) { }
	//   21   31:astore_1        
		throw obj;
	//*  22   32:goto            26
	}

	public String getJavaScript(RandomAccessFileOrArray randomaccessfileorarray)
		throws IOException
	{
		Object obj = ((Object) ((PdfDictionary)getPdfObjectRelease(catalog.get(PdfName.NAMES))));
	//    0    0:aload_0         
	//    1    1:getfield        #290 <Field PdfDictionary catalog>
	//    2    4:getstatic       #1382 <Field PdfName PdfName.NAMES>
	//    3    7:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//    4   10:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//    5   13:checkcast       #281 <Class PdfDictionary>
	//    6   16:astore_3        
		if(obj != null)
	//*   7   17:aload_3         
	//*   8   18:ifnonnull       23
	//*   9   21:aconst_null     
	//*  10   22:areturn         
	//*  11   23:aload_3         
	//*  12   24:getstatic       #1385 <Field PdfName PdfName.JAVASCRIPT>
	//*  13   27:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//*  14   30:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//*  15   33:checkcast       #281 <Class PdfDictionary>
	//*  16   36:astore_3        
			if((obj = ((Object) ((PdfDictionary)getPdfObjectRelease(((PdfDictionary) (obj)).get(PdfName.JAVASCRIPT))))) != null)
	//*  17   37:aload_3         
	//*  18   38:ifnull          21
			{
				obj = ((Object) (PdfNameTree.readTree(((PdfDictionary) (obj)))));
	//   19   41:aload_3         
	//   20   42:invokestatic    #1391 <Method HashMap PdfNameTree.readTree(PdfDictionary)>
	//   21   45:astore_3        
				String as[] = new String[((HashMap) (obj)).size()];
	//   22   46:aload_3         
	//   23   47:invokevirtual   #1392 <Method int HashMap.size()>
	//   24   50:anewarray       String[]
	//   25   53:astore          4
				as = (String[])((HashMap) (obj)).keySet().toArray(((Object []) (as)));
	//   26   55:aload_3         
	//   27   56:invokevirtual   #1395 <Method Set HashMap.keySet()>
	//   28   59:aload           4
	//   29   61:invokeinterface #1399 <Method Object[] Set.toArray(Object[])>
	//   30   66:checkcast       #1401 <Class String[]>
	//   31   69:astore          4
				Arrays.sort(((Object []) (as)));
	//   32   71:aload           4
	//   33   73:invokestatic    #1405 <Method void Arrays.sort(Object[])>
				StringBuffer stringbuffer = new StringBuffer();
	//   34   76:new             #1407 <Class StringBuffer>
	//   35   79:dup             
	//   36   80:invokespecial   #1408 <Method void StringBuffer()>
	//   37   83:astore          5
				int i = 0;
	//   38   85:iconst_0        
	//   39   86:istore_2        
				while(i < as.length) 
	//*  40   87:iload_2         
	//*  41   88:aload           4
	//*  42   90:arraylength     
	//*  43   91:icmpge          258
				{
					Object obj1 = ((Object) ((PdfDictionary)getPdfObjectRelease((PdfObject)((HashMap) (obj)).get(((Object) (as[i]))))));
	//   44   94:aload_3         
	//   45   95:aload           4
	//   46   97:iload_2         
	//   47   98:aaload          
	//   48   99:invokevirtual   #556 <Method Object HashMap.get(Object)>
	//   49  102:checkcast       #264 <Class PdfObject>
	//   50  105:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//   51  108:checkcast       #281 <Class PdfDictionary>
	//   52  111:astore          6
					if(obj1 != null)
	//*  53  113:aload           6
	//*  54  115:ifnonnull       125
	//*  55  118:iload_2         
	//*  56  119:iconst_1        
	//*  57  120:iadd            
	//*  58  121:istore_2        
	//*  59  122:goto            87
					{
						obj1 = ((Object) (getPdfObjectRelease(((PdfDictionary) (obj1)).get(PdfName.JS))));
	//   60  125:aload           6
	//   61  127:getstatic       #1411 <Field PdfName PdfName.JS>
	//   62  130:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   63  133:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//   64  136:astore          6
						if(obj1 != null)
	//*  65  138:aload           6
	//*  66  140:ifnull          118
							if(((PdfObject) (obj1)).isString())
	//*  67  143:aload           6
	//*  68  145:invokevirtual   #582 <Method boolean PdfObject.isString()>
	//*  69  148:ifeq            173
								stringbuffer.append(((PdfString)obj1).toUnicodeString()).append('\n');
	//   70  151:aload           5
	//   71  153:aload           6
	//   72  155:checkcast       #1015 <Class PdfString>
	//   73  158:invokevirtual   #1374 <Method String PdfString.toUnicodeString()>
	//   74  161:invokevirtual   #1414 <Method StringBuffer StringBuffer.append(String)>
	//   75  164:bipush          10
	//   76  166:invokevirtual   #1417 <Method StringBuffer StringBuffer.append(char)>
	//   77  169:pop             
							else
	//*  78  170:goto            118
							if(((PdfObject) (obj1)).isStream())
	//*  79  173:aload           6
	//*  80  175:invokevirtual   #801 <Method boolean PdfObject.isStream()>
	//*  81  178:ifeq            118
							{
								byte abyte0[] = getStreamBytes((PRStream)obj1, randomaccessfileorarray);
	//   82  181:aload           6
	//   83  183:checkcast       #453 <Class PRStream>
	//   84  186:aload_1         
	//   85  187:invokestatic    #813 <Method byte[] getStreamBytes(PRStream, RandomAccessFileOrArray)>
	//   86  190:astore          6
								if(abyte0.length >= 2 && abyte0[0] == -2 && abyte0[1] == -1)
	//*  87  192:aload           6
	//*  88  194:arraylength     
	//*  89  195:iconst_2        
	//*  90  196:icmplt          241
	//*  91  199:aload           6
	//*  92  201:iconst_0        
	//*  93  202:baload          
	//*  94  203:bipush          -2
	//*  95  205:icmpne          241
	//*  96  208:aload           6
	//*  97  210:iconst_1        
	//*  98  211:baload          
	//*  99  212:iconst_m1       
	//* 100  213:icmpne          241
									stringbuffer.append(PdfEncodings.convertToString(abyte0, "UnicodeBig"));
	//  101  216:aload           5
	//  102  218:aload           6
	//  103  220:ldc2            #1419 <String "UnicodeBig">
	//  104  223:invokestatic    #1423 <Method String PdfEncodings.convertToString(byte[], String)>
	//  105  226:invokevirtual   #1414 <Method StringBuffer StringBuffer.append(String)>
	//  106  229:pop             
								else
	//* 107  230:aload           5
	//* 108  232:bipush          10
	//* 109  234:invokevirtual   #1417 <Method StringBuffer StringBuffer.append(char)>
	//* 110  237:pop             
	//* 111  238:goto            118
									stringbuffer.append(PdfEncodings.convertToString(abyte0, "PDF"));
	//  112  241:aload           5
	//  113  243:aload           6
	//  114  245:ldc2            #1425 <String "PDF">
	//  115  248:invokestatic    #1423 <Method String PdfEncodings.convertToString(byte[], String)>
	//  116  251:invokevirtual   #1414 <Method StringBuffer StringBuffer.append(String)>
	//  117  254:pop             
								stringbuffer.append('\n');
							}
					}
					i++;
				}
	//* 118  255:goto            230
				return stringbuffer.toString();
	//  119  258:aload           5
	//  120  260:invokevirtual   #1426 <Method String StringBuffer.toString()>
	//  121  263:areturn         
			}
		return null;
	}

	public long getLastXref()
	{
		return lastXref;
	//    0    0:aload_0         
	//    1    1:getfield        #227 <Field long lastXref>
	//    2    4:lreturn         
	}

	public ArrayList getLinks(int i)
	{
		pageRefs.resetReleasePage();
	//    0    0:aload_0         
	//    1    1:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//    2    4:invokevirtual   #1432 <Method void PdfReader$PageRefs.resetReleasePage()>
		ArrayList arraylist = new ArrayList();
	//    3    7:new             #167 <Class ArrayList>
	//    4   10:dup             
	//    5   11:invokespecial   #168 <Method void ArrayList()>
	//    6   14:astore_3        
		Object obj = ((Object) (pageRefs.getPageN(i)));
	//    7   15:aload_0         
	//    8   16:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//    9   19:iload_1         
	//   10   20:invokevirtual   #1195 <Method PdfDictionary PdfReader$PageRefs.getPageN(int)>
	//   11   23:astore          4
		if(((PdfDictionary) (obj)).get(PdfName.ANNOTS) != null)
	//*  12   25:aload           4
	//*  13   27:getstatic       #1198 <Field PdfName PdfName.ANNOTS>
	//*  14   30:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//*  15   33:ifnull          109
		{
			obj = ((Object) (((PdfDictionary) (obj)).getAsArray(PdfName.ANNOTS)));
	//   16   36:aload           4
	//   17   38:getstatic       #1198 <Field PdfName PdfName.ANNOTS>
	//   18   41:invokevirtual   #947 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   19   44:astore          4
			for(int j = 0; j < ((PdfArray) (obj)).size(); j++)
	//*  20   46:iconst_0        
	//*  21   47:istore_2        
	//*  22   48:iload_2         
	//*  23   49:aload           4
	//*  24   51:invokevirtual   #719 <Method int PdfArray.size()>
	//*  25   54:icmpge          109
			{
				PdfDictionary pdfdictionary = (PdfDictionary)getPdfObjectRelease(((PdfArray) (obj)).getPdfObject(j));
	//   26   57:aload           4
	//   27   59:iload_2         
	//   28   60:invokevirtual   #763 <Method PdfObject PdfArray.getPdfObject(int)>
	//   29   63:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//   30   66:checkcast       #281 <Class PdfDictionary>
	//   31   69:astore          5
				if(PdfName.LINK.equals(((Object) (pdfdictionary.get(PdfName.SUBTYPE)))))
	//*  32   71:getstatic       #1435 <Field PdfName PdfName.LINK>
	//*  33   74:aload           5
	//*  34   76:getstatic       #1218 <Field PdfName PdfName.SUBTYPE>
	//*  35   79:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//*  36   82:invokevirtual   #545 <Method boolean PdfName.equals(Object)>
	//*  37   85:ifeq            102
					arraylist.add(((Object) (new PdfAnnotation.PdfImportedLink(pdfdictionary))));
	//   38   88:aload_3         
	//   39   89:new             #1437 <Class PdfAnnotation$PdfImportedLink>
	//   40   92:dup             
	//   41   93:aload           5
	//   42   95:invokespecial   #1439 <Method void PdfAnnotation$PdfImportedLink(PdfDictionary)>
	//   43   98:invokevirtual   #605 <Method boolean ArrayList.add(Object)>
	//   44  101:pop             
			}

	//   45  102:iload_2         
	//   46  103:iconst_1        
	//   47  104:iadd            
	//   48  105:istore_2        
		}
	//*  49  106:goto            48
		pageRefs.releasePage(i);
	//   50  109:aload_0         
	//   51  110:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//   52  113:iload_1         
	//   53  114:invokevirtual   #1201 <Method void PdfReader$PageRefs.releasePage(int)>
		pageRefs.resetReleasePage();
	//   54  117:aload_0         
	//   55  118:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//   56  121:invokevirtual   #1432 <Method void PdfReader$PageRefs.resetReleasePage()>
		return arraylist;
	//   57  124:aload_3         
	//   58  125:areturn         
	}

	public byte[] getMetadata()
		throws IOException
	{
		Object obj;
		PdfObject pdfobject;
		pdfobject = getPdfObject(catalog.get(PdfName.METADATA));
	//    0    0:aload_0         
	//    1    1:getfield        #290 <Field PdfDictionary catalog>
	//    2    4:getstatic       #1444 <Field PdfName PdfName.METADATA>
	//    3    7:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//    4   10:invokestatic    #524 <Method PdfObject getPdfObject(PdfObject)>
	//    5   13:astore_2        
		if(!(pdfobject instanceof PRStream))
	//*   6   14:aload_2         
	//*   7   15:instanceof      #453 <Class PRStream>
	//*   8   18:ifne            23
			return null;
	//    9   21:aconst_null     
	//   10   22:areturn         
		obj = ((Object) (getSafeFile()));
	//   11   23:aload_0         
	//   12   24:invokevirtual   #806 <Method RandomAccessFileOrArray getSafeFile()>
	//   13   27:astore_1        
		byte abyte0[];
		((RandomAccessFileOrArray) (obj)).reOpen();
	//   14   28:aload_1         
	//   15   29:invokevirtual   #809 <Method void RandomAccessFileOrArray.reOpen()>
		abyte0 = getStreamBytes((PRStream)pdfobject, ((RandomAccessFileOrArray) (obj)));
	//   16   32:aload_2         
	//   17   33:checkcast       #453 <Class PRStream>
	//   18   36:aload_1         
	//   19   37:invokestatic    #813 <Method byte[] getStreamBytes(PRStream, RandomAccessFileOrArray)>
	//   20   40:astore_2        
		try
		{
			((RandomAccessFileOrArray) (obj)).close();
	//   21   41:aload_1         
	//   22   42:invokevirtual   #814 <Method void RandomAccessFileOrArray.close()>
		}
	//*  23   45:aload_2         
	//*  24   46:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  25   47:astore_1        
		{
			return abyte0;
	//   26   48:aload_2         
	//   27   49:areturn         
		}
		return abyte0;
		Exception exception1;
		exception1;
	//   28   50:astore_2        
		try
		{
			((RandomAccessFileOrArray) (obj)).close();
	//   29   51:aload_1         
	//   30   52:invokevirtual   #814 <Method void RandomAccessFileOrArray.close()>
		}
	//*  31   55:aload_2         
	//*  32   56:athrow          
		catch(Exception exception) { }
	//   33   57:astore_1        
		throw exception1;
	//*  34   58:goto            55
	}

	public HashMap getNamedDestination()
	{
		return getNamedDestination(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #1187 <Method HashMap getNamedDestination(boolean)>
	//    3    5:areturn         
	}

	public HashMap getNamedDestination(boolean flag)
	{
		HashMap hashmap = getNamedDestinationFromNames(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #1448 <Method HashMap getNamedDestinationFromNames(boolean)>
	//    3    5:astore_2        
		hashmap.putAll(((Map) (getNamedDestinationFromStrings())));
	//    4    6:aload_2         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #1451 <Method HashMap getNamedDestinationFromStrings()>
	//    7   11:invokevirtual   #1455 <Method void HashMap.putAll(Map)>
		return hashmap;
	//    8   14:aload_2         
	//    9   15:areturn         
	}

	public HashMap getNamedDestinationFromNames()
	{
		return new HashMap(((Map) (getNamedDestinationFromNames(false))));
	//    0    0:new             #553 <Class HashMap>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #1448 <Method HashMap getNamedDestinationFromNames(boolean)>
	//    5    9:invokespecial   #1458 <Method void HashMap(Map)>
	//    6   12:areturn         
	}

	public HashMap getNamedDestinationFromNames(boolean flag)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #553 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #1364 <Method void HashMap()>
	//    3    7:astore_2        
		if(catalog.get(PdfName.DESTS) != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #290 <Field PdfDictionary catalog>
	//*   6   12:getstatic       #1462 <Field PdfName PdfName.DESTS>
	//*   7   15:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//*   8   18:ifnull          42
		{
			PdfDictionary pdfdictionary = (PdfDictionary)getPdfObjectRelease(catalog.get(PdfName.DESTS));
	//    9   21:aload_0         
	//   10   22:getfield        #290 <Field PdfDictionary catalog>
	//   11   25:getstatic       #1462 <Field PdfName PdfName.DESTS>
	//   12   28:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   13   31:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//   14   34:checkcast       #281 <Class PdfDictionary>
	//   15   37:astore_3        
			if(pdfdictionary != null)
	//*  16   38:aload_3         
	//*  17   39:ifnonnull       44
	//*  18   42:aload_2         
	//*  19   43:areturn         
			{
				Iterator iterator = pdfdictionary.getKeys().iterator();
	//   20   44:aload_3         
	//   21   45:invokevirtual   #698 <Method Set PdfDictionary.getKeys()>
	//   22   48:invokeinterface #704 <Method Iterator Set.iterator()>
	//   23   53:astore          4
				while(iterator.hasNext()) 
	//*  24   55:aload           4
	//*  25   57:invokeinterface #709 <Method boolean Iterator.hasNext()>
	//*  26   62:ifeq            42
				{
					PdfName pdfname = (PdfName)iterator.next();
	//   27   65:aload           4
	//   28   67:invokeinterface #713 <Method Object Iterator.next()>
	//   29   72:checkcast       #103 <Class PdfName>
	//   30   75:astore          5
					PdfArray pdfarray = getNameArray(pdfdictionary.get(pdfname));
	//   31   77:aload_3         
	//   32   78:aload           5
	//   33   80:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   34   83:invokestatic    #1464 <Method PdfArray getNameArray(PdfObject)>
	//   35   86:astore          6
					if(pdfarray != null)
	//*  36   88:aload           6
	//*  37   90:ifnull          55
						if(flag)
	//*  38   93:iload_1         
	//*  39   94:ifeq            109
							hashmap.put(((Object) (pdfname)), ((Object) (pdfarray)));
	//   40   97:aload_2         
	//   41   98:aload           5
	//   42  100:aload           6
	//   43  102:invokevirtual   #1371 <Method Object HashMap.put(Object, Object)>
	//   44  105:pop             
						else
	//*  45  106:goto            55
							hashmap.put(((Object) (PdfName.decodeName(pdfname.toString()))), ((Object) (pdfarray)));
	//   46  109:aload_2         
	//   47  110:aload           5
	//   48  112:invokevirtual   #1368 <Method String PdfName.toString()>
	//   49  115:invokestatic    #756 <Method String PdfName.decodeName(String)>
	//   50  118:aload           6
	//   51  120:invokevirtual   #1371 <Method Object HashMap.put(Object, Object)>
	//   52  123:pop             
				}
			}
		}
		return hashmap;
	//*  53  124:goto            55
	}

	public HashMap getNamedDestinationFromStrings()
	{
		Object obj;
label0:
		{
			if(catalog.get(PdfName.NAMES) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #290 <Field PdfDictionary catalog>
	//*   2    4:getstatic       #1382 <Field PdfName PdfName.NAMES>
	//*   3    7:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//*   4   10:ifnull          128
			{
				obj = ((Object) ((PdfDictionary)getPdfObjectRelease(catalog.get(PdfName.NAMES))));
	//    5   13:aload_0         
	//    6   14:getfield        #290 <Field PdfDictionary catalog>
	//    7   17:getstatic       #1382 <Field PdfName PdfName.NAMES>
	//    8   20:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//    9   23:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//   10   26:checkcast       #281 <Class PdfDictionary>
	//   11   29:astore_1        
				if(obj != null)
	//*  12   30:aload_1         
	//*  13   31:ifnull          128
				{
					obj = ((Object) ((PdfDictionary)getPdfObjectRelease(((PdfDictionary) (obj)).get(PdfName.DESTS))));
	//   14   34:aload_1         
	//   15   35:getstatic       #1462 <Field PdfName PdfName.DESTS>
	//   16   38:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   17   41:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//   18   44:checkcast       #281 <Class PdfDictionary>
	//   19   47:astore_1        
					if(obj != null)
	//*  20   48:aload_1         
	//*  21   49:ifnull          128
					{
						HashMap hashmap = PdfNameTree.readTree(((PdfDictionary) (obj)));
	//   22   52:aload_1         
	//   23   53:invokestatic    #1391 <Method HashMap PdfNameTree.readTree(PdfDictionary)>
	//   24   56:astore_2        
						Iterator iterator = hashmap.entrySet().iterator();
	//   25   57:aload_2         
	//   26   58:invokevirtual   #1467 <Method Set HashMap.entrySet()>
	//   27   61:invokeinterface #704 <Method Iterator Set.iterator()>
	//   28   66:astore_3        
						do
						{
							obj = ((Object) (hashmap));
	//   29   67:aload_2         
	//   30   68:astore_1        
							if(!iterator.hasNext())
								break;
	//   31   69:aload_3         
	//   32   70:invokeinterface #709 <Method boolean Iterator.hasNext()>
	//   33   75:ifeq            136
							obj = ((Object) ((java.util.Map.Entry)iterator.next()));
	//   34   78:aload_3         
	//   35   79:invokeinterface #713 <Method Object Iterator.next()>
	//   36   84:checkcast       #1469 <Class java.util.Map$Entry>
	//   37   87:astore_1        
							PdfArray pdfarray = getNameArray((PdfObject)((java.util.Map.Entry) (obj)).getValue());
	//   38   88:aload_1         
	//   39   89:invokeinterface #1472 <Method Object java.util.Map$Entry.getValue()>
	//   40   94:checkcast       #264 <Class PdfObject>
	//   41   97:invokestatic    #1464 <Method PdfArray getNameArray(PdfObject)>
	//   42  100:astore          4
							if(pdfarray != null)
	//*  43  102:aload           4
	//*  44  104:ifnull          119
								((java.util.Map.Entry) (obj)).setValue(((Object) (pdfarray)));
	//   45  107:aload_1         
	//   46  108:aload           4
	//   47  110:invokeinterface #1475 <Method Object java.util.Map$Entry.setValue(Object)>
	//   48  115:pop             
							else
	//*  49  116:goto            67
								iterator.remove();
	//   50  119:aload_3         
	//   51  120:invokeinterface #1477 <Method void Iterator.remove()>
						} while(true);
	//   52  125:goto            67
						break label0;
					}
				}
			}
			obj = ((Object) (new HashMap()));
	//   53  128:new             #553 <Class HashMap>
	//   54  131:dup             
	//   55  132:invokespecial   #1364 <Method void HashMap()>
	//   56  135:astore_1        
		}
		return ((HashMap) (obj));
	//   57  136:aload_1         
	//   58  137:areturn         
	}

	public int getNumberOfPages()
	{
		return pageRefs.size();
	//    0    0:aload_0         
	//    1    1:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//    2    4:invokevirtual   #1191 <Method int PdfReader$PageRefs.size()>
	//    3    7:ireturn         
	}

	public byte[] getPageContent(int i)
		throws IOException
	{
		RandomAccessFileOrArray randomaccessfileorarray = getSafeFile();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #806 <Method RandomAccessFileOrArray getSafeFile()>
	//    2    4:astore_2        
		byte abyte0[];
		randomaccessfileorarray.reOpen();
	//    3    5:aload_2         
	//    4    6:invokevirtual   #809 <Method void RandomAccessFileOrArray.reOpen()>
		abyte0 = getPageContent(i, randomaccessfileorarray);
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #1482 <Method byte[] getPageContent(int, RandomAccessFileOrArray)>
	//    9   15:astore_3        
		try
		{
			randomaccessfileorarray.close();
	//   10   16:aload_2         
	//   11   17:invokevirtual   #814 <Method void RandomAccessFileOrArray.close()>
		}
	//*  12   20:aload_3         
	//*  13   21:areturn         
	//*  14   22:astore_3        
	//*  15   23:aload_2         
	//*  16   24:invokevirtual   #814 <Method void RandomAccessFileOrArray.close()>
	//*  17   27:aload_3         
	//*  18   28:athrow          
		catch(Exception exception)
	//*  19   29:astore_2        
		{
			return abyte0;
	//   20   30:aload_3         
	//   21   31:areturn         
		}
		return abyte0;
		abyte0;
		try
		{
			randomaccessfileorarray.close();
		}
		catch(Exception exception1) { }
	//   22   32:astore_2        
		throw abyte0;
	//*  23   33:goto            27
	}

	public byte[] getPageContent(int i, RandomAccessFileOrArray randomaccessfileorarray)
		throws IOException
	{
		Object obj = ((Object) (getPageNRelease(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #1483 <Method PdfDictionary getPageNRelease(int)>
	//    3    5:astore_3        
		if(obj == null)
	//*   4    6:aload_3         
	//*   5    7:ifnonnull       12
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		obj = ((Object) (getPdfObjectRelease(((PdfDictionary) (obj)).get(PdfName.CONTENTS))));
	//    8   12:aload_3         
	//    9   13:getstatic       #795 <Field PdfName PdfName.CONTENTS>
	//   10   16:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   11   19:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//   12   22:astore_3        
		if(obj == null)
	//*  13   23:aload_3         
	//*  14   24:ifnonnull       31
			return new byte[0];
	//   15   27:iconst_0        
	//   16   28:newarray        byte[]
	//   17   30:areturn         
		if(((PdfObject) (obj)).isStream())
	//*  18   31:aload_3         
	//*  19   32:invokevirtual   #801 <Method boolean PdfObject.isStream()>
	//*  20   35:ifeq            47
			return getStreamBytes((PRStream)obj, randomaccessfileorarray);
	//   21   38:aload_3         
	//   22   39:checkcast       #453 <Class PRStream>
	//   23   42:aload_2         
	//   24   43:invokestatic    #813 <Method byte[] getStreamBytes(PRStream, RandomAccessFileOrArray)>
	//   25   46:areturn         
		if(((PdfObject) (obj)).isArray())
	//*  26   47:aload_3         
	//*  27   48:invokevirtual   #611 <Method boolean PdfObject.isArray()>
	//*  28   51:ifeq            148
		{
			obj = ((Object) ((PdfArray)obj));
	//   29   54:aload_3         
	//   30   55:checkcast       #558 <Class PdfArray>
	//   31   58:astore_3        
			ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//   32   59:new             #376 <Class ByteArrayOutputStream>
	//   33   62:dup             
	//   34   63:invokespecial   #377 <Method void ByteArrayOutputStream()>
	//   35   66:astore          4
			i = 0;
	//   36   68:iconst_0        
	//   37   69:istore_1        
			while(i < ((PdfArray) (obj)).size()) 
	//*  38   70:iload_1         
	//*  39   71:aload_3         
	//*  40   72:invokevirtual   #719 <Method int PdfArray.size()>
	//*  41   75:icmpge          142
			{
				PdfObject pdfobject = getPdfObjectRelease(((PdfArray) (obj)).getPdfObject(i));
	//   42   78:aload_3         
	//   43   79:iload_1         
	//   44   80:invokevirtual   #763 <Method PdfObject PdfArray.getPdfObject(int)>
	//   45   83:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//   46   86:astore          5
				if(pdfobject != null && pdfobject.isStream())
	//*  47   88:aload           5
	//*  48   90:ifnull          101
	//*  49   93:aload           5
	//*  50   95:invokevirtual   #801 <Method boolean PdfObject.isStream()>
	//*  51   98:ifne            108
	//*  52  101:iload_1         
	//*  53  102:iconst_1        
	//*  54  103:iadd            
	//*  55  104:istore_1        
	//*  56  105:goto            70
				{
					bytearrayoutputstream.write(getStreamBytes((PRStream)pdfobject, randomaccessfileorarray));
	//   57  108:aload           4
	//   58  110:aload           5
	//   59  112:checkcast       #453 <Class PRStream>
	//   60  115:aload_2         
	//   61  116:invokestatic    #813 <Method byte[] getStreamBytes(PRStream, RandomAccessFileOrArray)>
	//   62  119:invokevirtual   #679 <Method void ByteArrayOutputStream.write(byte[])>
					if(i != ((PdfArray) (obj)).size() - 1)
	//*  63  122:iload_1         
	//*  64  123:aload_3         
	//*  65  124:invokevirtual   #719 <Method int PdfArray.size()>
	//*  66  127:iconst_1        
	//*  67  128:isub            
	//*  68  129:icmpeq          101
						bytearrayoutputstream.write(10);
	//   69  132:aload           4
	//   70  134:bipush          10
	//   71  136:invokevirtual   #382 <Method void ByteArrayOutputStream.write(int)>
				}
				i++;
			}
	//*  72  139:goto            101
			return bytearrayoutputstream.toByteArray();
	//   73  142:aload           4
	//   74  144:invokevirtual   #386 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   75  147:areturn         
		} else
		{
			return new byte[0];
	//   76  148:iconst_0        
	//   77  149:newarray        byte[]
	//   78  151:areturn         
		}
	}

	public PdfDictionary getPageN(int i)
	{
		PdfDictionary pdfdictionary1 = pageRefs.getPageN(i);
	//    0    0:aload_0         
	//    1    1:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #1195 <Method PdfDictionary PdfReader$PageRefs.getPageN(int)>
	//    4    8:astore_3        
		PdfDictionary pdfdictionary;
		if(pdfdictionary1 == null)
	//*   5    9:aload_3         
	//*   6   10:ifnonnull       17
		{
			pdfdictionary = null;
	//    7   13:aconst_null     
	//    8   14:astore_2        
		} else
	//*   9   15:aload_2         
	//*  10   16:areturn         
		{
			pdfdictionary = pdfdictionary1;
	//   11   17:aload_3         
	//   12   18:astore_2        
			if(appendable)
	//*  13   19:aload_0         
	//*  14   20:getfield        #219 <Field boolean appendable>
	//*  15   23:ifeq            15
			{
				pdfdictionary1.setIndRef(pageRefs.getPageOrigRef(i));
	//   16   26:aload_3         
	//   17   27:aload_0         
	//   18   28:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//   19   31:iload_1         
	//   20   32:invokevirtual   #1487 <Method PRIndirectReference PdfReader$PageRefs.getPageOrigRef(int)>
	//   21   35:invokevirtual   #1488 <Method void PdfDictionary.setIndRef(PRIndirectReference)>
				return pdfdictionary1;
	//   22   38:aload_3         
	//   23   39:areturn         
			}
		}
		return pdfdictionary;
	}

	public PdfDictionary getPageNRelease(int i)
	{
		PdfDictionary pdfdictionary = getPageN(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #1489 <Method PdfDictionary getPageN(int)>
	//    3    5:astore_2        
		pageRefs.releasePage(i);
	//    4    6:aload_0         
	//    5    7:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//    6   10:iload_1         
	//    7   11:invokevirtual   #1201 <Method void PdfReader$PageRefs.releasePage(int)>
		return pdfdictionary;
	//    8   14:aload_2         
	//    9   15:areturn         
	}

	public PRIndirectReference getPageOrigRef(int i)
	{
		return pageRefs.getPageOrigRef(i);
	//    0    0:aload_0         
	//    1    1:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #1487 <Method PRIndirectReference PdfReader$PageRefs.getPageOrigRef(int)>
	//    4    8:areturn         
	}

	public PdfDictionary getPageResources(int i)
	{
		return getPageResources(getPageN(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iload_1         
	//    3    3:invokevirtual   #1489 <Method PdfDictionary getPageN(int)>
	//    4    6:invokevirtual   #1493 <Method PdfDictionary getPageResources(PdfDictionary)>
	//    5    9:areturn         
	}

	public PdfDictionary getPageResources(PdfDictionary pdfdictionary)
	{
		return pdfdictionary.getAsDict(PdfName.RESOURCES);
	//    0    0:aload_1         
	//    1    1:getstatic       #113 <Field PdfName PdfName.RESOURCES>
	//    2    4:invokevirtual   #288 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//    3    7:areturn         
	}

	public int getPageRotation(int i)
	{
		return getPageRotation(pageRefs.getPageNRelease(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #1304 <Method PdfDictionary PdfReader$PageRefs.getPageNRelease(int)>
	//    5    9:invokevirtual   #1497 <Method int getPageRotation(PdfDictionary)>
	//    6   12:ireturn         
	}

	int getPageRotation(PdfDictionary pdfdictionary)
	{
		pdfdictionary = ((PdfDictionary) (pdfdictionary.getAsNumber(PdfName.ROTATE)));
	//    0    0:aload_1         
	//    1    1:getstatic       #110 <Field PdfName PdfName.ROTATE>
	//    2    4:invokevirtual   #1343 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//    3    7:astore_1        
		int i;
		if(pdfdictionary == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       16
		{
			i = 0;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		} else
	//*   8   14:iload_2         
	//*   9   15:ireturn         
		{
			int j = ((PdfNumber) (pdfdictionary)).intValue() % 360;
	//   10   16:aload_1         
	//   11   17:invokevirtual   #474 <Method int PdfNumber.intValue()>
	//   12   20:sipush          360
	//   13   23:irem            
	//   14   24:istore_3        
			i = j;
	//   15   25:iload_3         
	//   16   26:istore_2        
			if(j < 0)
	//*  17   27:iload_3         
	//*  18   28:ifge            14
				return j + 360;
	//   19   31:iload_3         
	//   20   32:sipush          360
	//   21   35:iadd            
	//   22   36:ireturn         
		}
		return i;
	}

	public Rectangle getPageSize(int i)
	{
		return getPageSize(pageRefs.getPageNRelease(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #1304 <Method PdfDictionary PdfReader$PageRefs.getPageNRelease(int)>
	//    5    9:invokevirtual   #1349 <Method Rectangle getPageSize(PdfDictionary)>
	//    6   12:areturn         
	}

	public Rectangle getPageSize(PdfDictionary pdfdictionary)
	{
		return getNormalizedRectangle(pdfdictionary.getAsArray(PdfName.MEDIABOX));
	//    0    0:aload_1         
	//    1    1:getstatic       #107 <Field PdfName PdfName.MEDIABOX>
	//    2    4:invokevirtual   #947 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//    3    7:invokestatic    #1325 <Method Rectangle getNormalizedRectangle(PdfArray)>
	//    4   10:areturn         
	}

	public Rectangle getPageSizeWithRotation(int i)
	{
		return getPageSizeWithRotation(pageRefs.getPageNRelease(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #1304 <Method PdfDictionary PdfReader$PageRefs.getPageNRelease(int)>
	//    5    9:invokevirtual   #1500 <Method Rectangle getPageSizeWithRotation(PdfDictionary)>
	//    6   12:areturn         
	}

	public Rectangle getPageSizeWithRotation(PdfDictionary pdfdictionary)
	{
		Rectangle rectangle = getPageSize(pdfdictionary);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #1349 <Method Rectangle getPageSize(PdfDictionary)>
	//    3    5:astore_3        
		int i = getPageRotation(pdfdictionary);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #1497 <Method int getPageRotation(PdfDictionary)>
	//    7   11:istore_2        
		pdfdictionary = ((PdfDictionary) (rectangle));
	//    8   12:aload_3         
	//    9   13:astore_1        
		for(; i > 0; i -= 90)
	//*  10   14:iload_2         
	//*  11   15:ifle            31
			pdfdictionary = ((PdfDictionary) (((Rectangle) (pdfdictionary)).rotate()));
	//   12   18:aload_1         
	//   13   19:invokevirtual   #1504 <Method Rectangle Rectangle.rotate()>
	//   14   22:astore_1        

	//   15   23:iload_2         
	//   16   24:bipush          90
	//   17   26:isub            
	//   18   27:istore_2        
	//*  19   28:goto            14
		return ((Rectangle) (pdfdictionary));
	//   20   31:aload_1         
	//   21   32:areturn         
	}

	public PdfObject getPdfObject(int i)
	{
		Object obj;
		PdfObject pdfobject;
		try
		{
			lastXrefPartial = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #178 <Field int lastXrefPartial>
		}
	//*   3    5:iload_1         
	//*   4    6:iflt            97
	//*   5    9:iload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #251 <Field ArrayList xrefObj>
	//*   8   14:invokevirtual   #258 <Method int ArrayList.size()>
	//*   9   17:icmplt          23
	//*  10   20:goto            97
	//*  11   23:aload_0         
	//*  12   24:getfield        #251 <Field ArrayList xrefObj>
	//*  13   27:iload_1         
	//*  14   28:invokevirtual   #262 <Method Object ArrayList.get(int)>
	//*  15   31:checkcast       #264 <Class PdfObject>
	//*  16   34:astore_3        
	//*  17   35:aload_3         
	//*  18   36:astore_2        
	//*  19   37:aload_0         
	//*  20   38:getfield        #187 <Field boolean partial>
	//*  21   41:ifeq            99
	//*  22   44:aload_3         
	//*  23   45:astore_2        
	//*  24   46:aload_3         
	//*  25   47:ifnonnull       99
	//*  26   50:iload_1         
	//*  27   51:iconst_2        
	//*  28   52:imul            
	//*  29   53:aload_0         
	//*  30   54:getfield        #301 <Field long[] xref>
	//*  31   57:arraylength     
	//*  32   58:icmplt          63
	//*  33   61:aconst_null     
	//*  34   62:areturn         
	//*  35   63:aload_0         
	//*  36   64:iload_1         
	//*  37   65:invokevirtual   #1507 <Method PdfObject readSingleObject(int)>
	//*  38   68:astore_3        
	//*  39   69:aload_0         
	//*  40   70:iconst_m1       
	//*  41   71:putfield        #178 <Field int lastXrefPartial>
	//*  42   74:aload_3         
	//*  43   75:astore_2        
	//*  44   76:aload_3         
	//*  45   77:ifnull          99
	//*  46   80:aload_0         
	//*  47   81:iload_1         
	//*  48   82:putfield        #178 <Field int lastXrefPartial>
	//*  49   85:aload_3         
	//*  50   86:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  51   87:astore_2        
		{
			throw new ExceptionConverter(((Exception) (obj)));
	//   52   88:new             #825 <Class ExceptionConverter>
	//   53   91:dup             
	//   54   92:aload_2         
	//   55   93:invokespecial   #828 <Method void ExceptionConverter(Exception)>
	//   56   96:athrow          
		}
		if(i < 0)
			break MISSING_BLOCK_LABEL_97;
		if(i >= xrefObj.size())
			break MISSING_BLOCK_LABEL_97;
		pdfobject = (PdfObject)xrefObj.get(i);
		obj = ((Object) (pdfobject));
		if(!partial)
			break MISSING_BLOCK_LABEL_99;
		obj = ((Object) (pdfobject));
		if(pdfobject != null)
			break MISSING_BLOCK_LABEL_99;
		if(i * 2 >= xref.length)
			return null;
		pdfobject = readSingleObject(i);
		lastXrefPartial = -1;
		obj = ((Object) (pdfobject));
		if(pdfobject == null)
			break MISSING_BLOCK_LABEL_99;
		lastXrefPartial = i;
		return pdfobject;
		obj = null;
	//   57   97:aconst_null     
	//   58   98:astore_2        
		return ((PdfObject) (obj));
	//   59   99:aload_2         
	//   60  100:areturn         
	}

	public PdfObject getPdfObjectRelease(int i)
	{
		PdfObject pdfobject = getPdfObject(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #819 <Method PdfObject getPdfObject(int)>
	//    3    5:astore_2        
		releaseLastXrefPartial();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #527 <Method void releaseLastXrefPartial()>
		return pdfobject;
	//    6   10:aload_2         
	//    7   11:areturn         
	}

	protected PdfReaderInstance getPdfReaderInstance(PdfWriter pdfwriter)
	{
		return new PdfReaderInstance(this, pdfwriter);
	//    0    0:new             #1511 <Class PdfReaderInstance>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #1512 <Method void PdfReaderInstance(PdfReader, PdfWriter)>
	//    5    9:areturn         
	}

	public char getPdfVersion()
	{
		return pdfVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #221 <Field char pdfVersion>
	//    2    4:ireturn         
	}

	public long getPermissions()
	{
		return pValue;
	//    0    0:aload_0         
	//    1    1:getfield        #247 <Field long pValue>
	//    2    4:lreturn         
	}

	public RandomAccessFileOrArray getSafeFile()
	{
		return tokens.getSafeFile();
	//    0    0:aload_0         
	//    1    1:getfield        #193 <Field PRTokeniser tokens>
	//    2    4:invokevirtual   #235 <Method RandomAccessFileOrArray PRTokeniser.getSafeFile()>
	//    3    7:areturn         
	}

	public int getSimpleViewerPreferences()
	{
		return PdfViewerPreferencesImp.getViewerPreferences(catalog).getPageLayoutAndMode();
	//    0    0:aload_0         
	//    1    1:getfield        #290 <Field PdfDictionary catalog>
	//    2    4:invokestatic    #1519 <Method PdfViewerPreferencesImp PdfViewerPreferencesImp.getViewerPreferences(PdfDictionary)>
	//    3    7:invokevirtual   #1522 <Method int PdfViewerPreferencesImp.getPageLayoutAndMode()>
	//    4   10:ireturn         
	}

	public PdfDictionary getTrailer()
	{
		return trailer;
	//    0    0:aload_0         
	//    1    1:getfield        #279 <Field PdfDictionary trailer>
	//    2    4:areturn         
	}

	public int getXrefSize()
	{
		return xrefObj.size();
	//    0    0:aload_0         
	//    1    1:getfield        #251 <Field ArrayList xrefObj>
	//    2    4:invokevirtual   #258 <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public boolean hasUsageRights()
	{
		for(PdfDictionary pdfdictionary = catalog.getAsDict(PdfName.PERMS); pdfdictionary == null || !pdfdictionary.contains(PdfName.UR) && !pdfdictionary.contains(PdfName.UR3);)
	//*   0    0:aload_0         
	//*   1    1:getfield        #290 <Field PdfDictionary catalog>
	//*   2    4:getstatic       #978 <Field PdfName PdfName.PERMS>
	//*   3    7:invokevirtual   #288 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//*   4   10:astore_1        
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       17
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         

	//    9   17:aload_1         
	//   10   18:getstatic       #1528 <Field PdfName PdfName.UR>
	//   11   21:invokevirtual   #972 <Method boolean PdfDictionary.contains(PdfName)>
	//   12   24:ifne            37
	//   13   27:aload_1         
	//   14   28:getstatic       #1531 <Field PdfName PdfName.UR3>
	//   15   31:invokevirtual   #972 <Method boolean PdfDictionary.contains(PdfName)>
	//   16   34:ifeq            15
		return true;
	//   17   37:iconst_1        
	//   18   38:ireturn         
	}

	public boolean is128Key()
	{
		return rValue == 3;
	//    0    0:aload_0         
	//    1    1:getfield        #249 <Field int rValue>
	//    2    4:iconst_3        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean isAppendable()
	{
		return appendable;
	//    0    0:aload_0         
	//    1    1:getfield        #219 <Field boolean appendable>
	//    2    4:ireturn         
	}

	public boolean isEncrypted()
	{
		return encrypted;
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field boolean encrypted>
	//    2    4:ireturn         
	}

	public boolean isHybridXref()
	{
		return hybridXref;
	//    0    0:aload_0         
	//    1    1:getfield        #297 <Field boolean hybridXref>
	//    2    4:ireturn         
	}

	public boolean isMetadataEncrypted()
	{
		if(decrypt == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #240 <Field PdfEncryption decrypt>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return decrypt.isMetadataEncrypted();
	//    5    9:aload_0         
	//    6   10:getfield        #240 <Field PdfEncryption decrypt>
	//    7   13:invokevirtual   #1537 <Method boolean PdfEncryption.isMetadataEncrypted()>
	//    8   16:ireturn         
	}

	public boolean isNewXrefType()
	{
		return newXrefType;
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field boolean newXrefType>
	//    2    4:ireturn         
	}

	public final boolean isOpenedWithFullPermissions()
	{
		return !encrypted || ownerPasswordUsed || unethicalreading;
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field boolean encrypted>
	//    2    4:ifeq            20
	//    3    7:aload_0         
	//    4    8:getfield        #307 <Field boolean ownerPasswordUsed>
	//    5   11:ifne            20
	//    6   14:getstatic       #91  <Field boolean unethicalreading>
	//    7   17:ifeq            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	public boolean isRebuilt()
	{
		return rebuilt;
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field boolean rebuilt>
	//    2    4:ireturn         
	}

	public boolean isTagged()
	{
		for(PdfDictionary pdfdictionary = catalog.getAsDict(PdfName.MARKINFO); pdfdictionary == null || !((Object) (PdfBoolean.PDFTRUE)).equals(((Object) (pdfdictionary.getAsBoolean(PdfName.MARKED)))) || catalog.getAsDict(PdfName.STRUCTTREEROOT) == null;)
	//*   0    0:aload_0         
	//*   1    1:getfield        #290 <Field PdfDictionary catalog>
	//*   2    4:getstatic       #1544 <Field PdfName PdfName.MARKINFO>
	//*   3    7:invokevirtual   #288 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//*   4   10:astore_1        
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       17
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         

	//    9   17:getstatic       #1548 <Field PdfBoolean PdfBoolean.PDFTRUE>
	//   10   20:aload_1         
	//   11   21:getstatic       #1551 <Field PdfName PdfName.MARKED>
	//   12   24:invokevirtual   #1555 <Method PdfBoolean PdfDictionary.getAsBoolean(PdfName)>
	//   13   27:invokevirtual   #959 <Method boolean Object.equals(Object)>
	//   14   30:ifeq            15
	//   15   33:aload_0         
	//   16   34:getfield        #290 <Field PdfDictionary catalog>
	//   17   37:getstatic       #1558 <Field PdfName PdfName.STRUCTTREEROOT>
	//   18   40:invokevirtual   #288 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   19   43:ifnull          15
		return true;
	//   20   46:iconst_1        
	//   21   47:ireturn         
	}

	public boolean isTampered()
	{
		return tampered;
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field boolean tampered>
	//    2    4:ireturn         
	}

	protected void killXref(PdfObject pdfobject)
	{
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
_L2:
		return;
	//    2    4:return          
		if(pdfobject == null || (pdfobject instanceof PdfIndirectReference) && !pdfobject.isIndirect()) goto _L2; else goto _L1
	//    3    5:aload_1         
	//    4    6:instanceof      #1356 <Class PdfIndirectReference>
	//    5    9:ifeq            19
	//    6   12:aload_1         
	//    7   13:invokevirtual   #817 <Method boolean PdfObject.isIndirect()>
	//    8   16:ifeq            4
_L1:
		Iterator iterator;
		switch(pdfobject.type())
	//*   9   19:aload_1         
	//*  10   20:invokevirtual   #469 <Method int PdfObject.type()>
		{
	//*  11   23:tableswitch     5 10: default 60
	//	               5 61
	//	               6 133
	//	               7 133
	//	               8 60
	//	               9 60
	//	               10 92
		case 8: // '\b'
		case 9: // '\t'
		default:
			return;
	//   12   60:return          

		case 5: // '\005'
			pdfobject = ((PdfObject) ((PdfArray)pdfobject));
	//   13   61:aload_1         
	//   14   62:checkcast       #558 <Class PdfArray>
	//   15   65:astore_1        
			int i = 0;
	//   16   66:iconst_0        
	//   17   67:istore_2        
			while(i < ((PdfArray) (pdfobject)).size()) 
	//*  18   68:iload_2         
	//*  19   69:aload_1         
	//*  20   70:invokevirtual   #719 <Method int PdfArray.size()>
	//*  21   73:icmpge          4
			{
				killXref(((PdfArray) (pdfobject)).getPdfObject(i));
	//   22   76:aload_0         
	//   23   77:aload_1         
	//   24   78:iload_2         
	//   25   79:invokevirtual   #763 <Method PdfObject PdfArray.getPdfObject(int)>
	//   26   82:invokevirtual   #1562 <Method void killXref(PdfObject)>
				i++;
	//   27   85:iload_2         
	//   28   86:iconst_1        
	//   29   87:iadd            
	//   30   88:istore_2        
			}
			break;
	//   31   89:goto            68

		case 10: // '\n'
			int j = ((PRIndirectReference)pdfobject).getNumber();
	//   32   92:aload_1         
	//   33   93:checkcast       #305 <Class PRIndirectReference>
	//   34   96:invokevirtual   #730 <Method int PRIndirectReference.getNumber()>
	//   35   99:istore_2        
			pdfobject = (PdfObject)xrefObj.get(j);
	//   36  100:aload_0         
	//   37  101:getfield        #251 <Field ArrayList xrefObj>
	//   38  104:iload_2         
	//   39  105:invokevirtual   #262 <Method Object ArrayList.get(int)>
	//   40  108:checkcast       #264 <Class PdfObject>
	//   41  111:astore_1        
			xrefObj.set(j, ((Object) (null)));
	//   42  112:aload_0         
	//   43  113:getfield        #251 <Field ArrayList xrefObj>
	//   44  116:iload_2         
	//   45  117:aconst_null     
	//   46  118:invokevirtual   #272 <Method Object ArrayList.set(int, Object)>
	//   47  121:pop             
			freeXref = j;
	//   48  122:aload_0         
	//   49  123:iload_2         
	//   50  124:putfield        #225 <Field int freeXref>
			killXref(pdfobject);
	//   51  127:aload_0         
	//   52  128:aload_1         
	//   53  129:invokevirtual   #1562 <Method void killXref(PdfObject)>
			return;
	//   54  132:return          

		case 6: // '\006'
		case 7: // '\007'
			pdfobject = ((PdfObject) ((PdfDictionary)pdfobject));
	//   55  133:aload_1         
	//   56  134:checkcast       #281 <Class PdfDictionary>
	//   57  137:astore_1        
			iterator = ((PdfDictionary) (pdfobject)).getKeys().iterator();
	//   58  138:aload_1         
	//   59  139:invokevirtual   #698 <Method Set PdfDictionary.getKeys()>
	//   60  142:invokeinterface #704 <Method Iterator Set.iterator()>
	//   61  147:astore_3        
			break; /* Loop/switch isn't completed */
		}
		if(true) goto _L2; else goto _L3
_L3:
		while(iterator.hasNext()) 
	//*  62  148:aload_3         
	//*  63  149:invokeinterface #709 <Method boolean Iterator.hasNext()>
	//*  64  154:ifeq            4
			killXref(((PdfDictionary) (pdfobject)).get((PdfName)iterator.next()));
	//   65  157:aload_0         
	//   66  158:aload_1         
	//   67  159:aload_3         
	//   68  160:invokeinterface #713 <Method Object Iterator.next()>
	//   69  165:checkcast       #103 <Class PdfName>
	//   70  168:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   71  171:invokevirtual   #1562 <Method void killXref(PdfObject)>
		if(true) goto _L2; else goto _L4
	//   72  174:goto            148
_L4:
	}

	public void makeRemoteNamedDestinationsLocal()
	{
		if(!remoteToLocalNamedDestinations)
	//*   0    0:aload_0         
	//*   1    1:getfield        #176 <Field boolean remoteToLocalNamedDestinations>
	//*   2    4:ifeq            8
	//*   3    7:return          
		{
			remoteToLocalNamedDestinations = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #176 <Field boolean remoteToLocalNamedDestinations>
			HashMap hashmap = getNamedDestination(true);
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #1187 <Method HashMap getNamedDestination(boolean)>
	//   10   18:astore          6
			if(!hashmap.isEmpty())
	//*  11   20:aload           6
	//*  12   22:invokevirtual   #1190 <Method boolean HashMap.isEmpty()>
	//*  13   25:ifne            7
			{
				int i = 1;
	//   14   28:iconst_1        
	//   15   29:istore_1        
				while(i <= pageRefs.size()) 
	//*  16   30:iload_1         
	//*  17   31:aload_0         
	//*  18   32:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//*  19   35:invokevirtual   #1191 <Method int PdfReader$PageRefs.size()>
	//*  20   38:icmpgt          7
				{
					PdfObject pdfobject = pageRefs.getPageN(i).get(PdfName.ANNOTS);
	//   21   41:aload_0         
	//   22   42:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//   23   45:iload_1         
	//   24   46:invokevirtual   #1195 <Method PdfDictionary PdfReader$PageRefs.getPageN(int)>
	//   25   49:getstatic       #1198 <Field PdfName PdfName.ANNOTS>
	//   26   52:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   27   55:astore          7
					PdfArray pdfarray = (PdfArray)getPdfObject(pdfobject);
	//   28   57:aload           7
	//   29   59:invokestatic    #524 <Method PdfObject getPdfObject(PdfObject)>
	//   30   62:checkcast       #558 <Class PdfArray>
	//   31   65:astore          8
					int k = lastXrefPartial;
	//   32   67:aload_0         
	//   33   68:getfield        #178 <Field int lastXrefPartial>
	//   34   71:istore          5
					releaseLastXrefPartial();
	//   35   73:aload_0         
	//   36   74:invokevirtual   #527 <Method void releaseLastXrefPartial()>
					if(pdfarray == null)
	//*  37   77:aload           8
	//*  38   79:ifnonnull       97
					{
						pageRefs.releasePage(i);
	//   39   82:aload_0         
	//   40   83:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//   41   86:iload_1         
	//   42   87:invokevirtual   #1201 <Method void PdfReader$PageRefs.releasePage(int)>
					} else
	//*  43   90:iload_1         
	//*  44   91:iconst_1        
	//*  45   92:iadd            
	//*  46   93:istore_1        
	//*  47   94:goto            30
					{
						boolean flag = false;
	//   48   97:iconst_0        
	//   49   98:istore_3        
						for(int j = 0; j < pdfarray.size();)
	//*  50   99:iconst_0        
	//*  51  100:istore_2        
	//*  52  101:iload_2         
	//*  53  102:aload           8
	//*  54  104:invokevirtual   #719 <Method int PdfArray.size()>
	//*  55  107:icmpge          156
						{
							PdfObject pdfobject1 = pdfarray.getPdfObject(j);
	//   56  110:aload           8
	//   57  112:iload_2         
	//   58  113:invokevirtual   #763 <Method PdfObject PdfArray.getPdfObject(int)>
	//   59  116:astore          9
							boolean flag1 = flag;
	//   60  118:iload_3         
	//   61  119:istore          4
							if(convertNamedDestination(pdfobject1, hashmap))
	//*  62  121:aload_0         
	//*  63  122:aload           9
	//*  64  124:aload           6
	//*  65  126:invokespecial   #1565 <Method boolean convertNamedDestination(PdfObject, HashMap)>
	//*  66  129:ifeq            146
							{
								flag1 = flag;
	//   67  132:iload_3         
	//   68  133:istore          4
								if(!pdfobject1.isIndirect())
	//*  69  135:aload           9
	//*  70  137:invokevirtual   #817 <Method boolean PdfObject.isIndirect()>
	//*  71  140:ifne            146
									flag1 = true;
	//   72  143:iconst_1        
	//   73  144:istore          4
							}
							j++;
	//   74  146:iload_2         
	//   75  147:iconst_1        
	//   76  148:iadd            
	//   77  149:istore_2        
							flag = flag1;
	//   78  150:iload           4
	//   79  152:istore_3        
						}

	//*  80  153:goto            101
						if(flag)
	//*  81  156:iload_3         
	//*  82  157:ifeq            168
							setXrefPartialObject(k, ((PdfObject) (pdfarray)));
	//   83  160:aload_0         
	//   84  161:iload           5
	//   85  163:aload           8
	//   86  165:invokespecial   #579 <Method void setXrefPartialObject(int, PdfObject)>
						if(!flag || pdfobject.isIndirect())
	//*  87  168:iload_3         
	//*  88  169:ifeq            180
	//*  89  172:aload           7
	//*  90  174:invokevirtual   #817 <Method boolean PdfObject.isIndirect()>
	//*  91  177:ifeq            90
							pageRefs.releasePage(i);
	//   92  180:aload_0         
	//   93  181:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//   94  184:iload_1         
	//   95  185:invokevirtual   #1201 <Method void PdfReader$PageRefs.releasePage(int)>
					}
					i++;
				}
			}
		}
	//*  96  188:goto            90
	}

	protected PdfArray readArray()
		throws IOException
	{
		PdfArray pdfarray = new PdfArray();
	//    0    0:new             #558 <Class PdfArray>
	//    1    3:dup             
	//    2    4:invokespecial   #1568 <Method void PdfArray()>
	//    3    7:astore_2        
		do
		{
			PdfObject pdfobject = readPRObject();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #1572 <Method PdfObject readPRObject()>
	//    6   12:astore_3        
			int i = pdfobject.type();
	//    7   13:aload_3         
	//    8   14:invokevirtual   #469 <Method int PdfObject.type()>
	//    9   17:istore_1        
			if(-i == PRTokeniser.TokenType.END_ARRAY.ordinal())
	//*  10   18:iload_1         
	//*  11   19:ineg            
	//*  12   20:getstatic       #1578 <Field PRTokeniser$TokenType PRTokeniser$TokenType.END_ARRAY>
	//*  13   23:invokevirtual   #1581 <Method int PRTokeniser$TokenType.ordinal()>
	//*  14   26:icmpne          31
				return pdfarray;
	//   15   29:aload_2         
	//   16   30:areturn         
			if(-i == PRTokeniser.TokenType.END_DIC.ordinal())
	//*  17   31:iload_1         
	//*  18   32:ineg            
	//*  19   33:getstatic       #1584 <Field PRTokeniser$TokenType PRTokeniser$TokenType.END_DIC>
	//*  20   36:invokevirtual   #1581 <Method int PRTokeniser$TokenType.ordinal()>
	//*  21   39:icmpne          59
				tokens.throwError(MessageLocalization.getComposedMessage("unexpected.gt.gt", new Object[0]));
	//   22   42:aload_0         
	//   23   43:getfield        #193 <Field PRTokeniser tokens>
	//   24   46:ldc2            #1586 <String "unexpected.gt.gt">
	//   25   49:iconst_0        
	//   26   50:anewarray       Object[]
	//   27   53:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   28   56:invokevirtual   #1589 <Method void PRTokeniser.throwError(String)>
			pdfarray.add(pdfobject);
	//   29   59:aload_2         
	//   30   60:aload_3         
	//   31   61:invokevirtual   #727 <Method boolean PdfArray.add(PdfObject)>
	//   32   64:pop             
		} while(true);
	//   33   65:goto            8
	}

	protected PdfDictionary readDictionary()
		throws IOException
	{
		PdfDictionary pdfdictionary = new PdfDictionary();
	//    0    0:new             #281 <Class PdfDictionary>
	//    1    3:dup             
	//    2    4:invokespecial   #1591 <Method void PdfDictionary()>
	//    3    7:astore_2        
		do
		{
			tokens.nextValidToken();
	//    4    8:aload_0         
	//    5    9:getfield        #193 <Field PRTokeniser tokens>
	//    6   12:invokevirtual   #1594 <Method void PRTokeniser.nextValidToken()>
			if(tokens.getTokenType() == PRTokeniser.TokenType.END_DIC)
	//*   7   15:aload_0         
	//*   8   16:getfield        #193 <Field PRTokeniser tokens>
	//*   9   19:invokevirtual   #1598 <Method PRTokeniser$TokenType PRTokeniser.getTokenType()>
	//*  10   22:getstatic       #1584 <Field PRTokeniser$TokenType PRTokeniser$TokenType.END_DIC>
	//*  11   25:if_acmpne       30
				return pdfdictionary;
	//   12   28:aload_2         
	//   13   29:areturn         
			if(tokens.getTokenType() != PRTokeniser.TokenType.NAME)
	//*  14   30:aload_0         
	//*  15   31:getfield        #193 <Field PRTokeniser tokens>
	//*  16   34:invokevirtual   #1598 <Method PRTokeniser$TokenType PRTokeniser.getTokenType()>
	//*  17   37:getstatic       #1601 <Field PRTokeniser$TokenType PRTokeniser$TokenType.NAME>
	//*  18   40:if_acmpeq       70
				tokens.throwError(MessageLocalization.getComposedMessage("dictionary.key.1.is.not.a.name", new Object[] {
					tokens.getStringValue()
				}));
	//   19   43:aload_0         
	//   20   44:getfield        #193 <Field PRTokeniser tokens>
	//   21   47:ldc2            #1603 <String "dictionary.key.1.is.not.a.name">
	//   22   50:iconst_1        
	//   23   51:anewarray       Object[]
	//   24   54:dup             
	//   25   55:iconst_0        
	//   26   56:aload_0         
	//   27   57:getfield        #193 <Field PRTokeniser tokens>
	//   28   60:invokevirtual   #1606 <Method String PRTokeniser.getStringValue()>
	//   29   63:aastore         
	//   30   64:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   31   67:invokevirtual   #1589 <Method void PRTokeniser.throwError(String)>
			PdfName pdfname = new PdfName(tokens.getStringValue(), false);
	//   32   70:new             #103 <Class PdfName>
	//   33   73:dup             
	//   34   74:aload_0         
	//   35   75:getfield        #193 <Field PRTokeniser tokens>
	//   36   78:invokevirtual   #1606 <Method String PRTokeniser.getStringValue()>
	//   37   81:iconst_0        
	//   38   82:invokespecial   #1609 <Method void PdfName(String, boolean)>
	//   39   85:astore_3        
			PdfObject pdfobject = readPRObject();
	//   40   86:aload_0         
	//   41   87:invokevirtual   #1572 <Method PdfObject readPRObject()>
	//   42   90:astore          4
			int i = pdfobject.type();
	//   43   92:aload           4
	//   44   94:invokevirtual   #469 <Method int PdfObject.type()>
	//   45   97:istore_1        
			if(-i == PRTokeniser.TokenType.END_DIC.ordinal())
	//*  46   98:iload_1         
	//*  47   99:ineg            
	//*  48  100:getstatic       #1584 <Field PRTokeniser$TokenType PRTokeniser$TokenType.END_DIC>
	//*  49  103:invokevirtual   #1581 <Method int PRTokeniser$TokenType.ordinal()>
	//*  50  106:icmpne          126
				tokens.throwError(MessageLocalization.getComposedMessage("unexpected.gt.gt", new Object[0]));
	//   51  109:aload_0         
	//   52  110:getfield        #193 <Field PRTokeniser tokens>
	//   53  113:ldc2            #1586 <String "unexpected.gt.gt">
	//   54  116:iconst_0        
	//   55  117:anewarray       Object[]
	//   56  120:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   57  123:invokevirtual   #1589 <Method void PRTokeniser.throwError(String)>
			if(-i == PRTokeniser.TokenType.END_ARRAY.ordinal())
	//*  58  126:iload_1         
	//*  59  127:ineg            
	//*  60  128:getstatic       #1578 <Field PRTokeniser$TokenType PRTokeniser$TokenType.END_ARRAY>
	//*  61  131:invokevirtual   #1581 <Method int PRTokeniser$TokenType.ordinal()>
	//*  62  134:icmpne          154
				tokens.throwError(MessageLocalization.getComposedMessage("unexpected.close.bracket", new Object[0]));
	//   63  137:aload_0         
	//   64  138:getfield        #193 <Field PRTokeniser tokens>
	//   65  141:ldc2            #1611 <String "unexpected.close.bracket">
	//   66  144:iconst_0        
	//   67  145:anewarray       Object[]
	//   68  148:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   69  151:invokevirtual   #1589 <Method void PRTokeniser.throwError(String)>
			pdfdictionary.put(pdfname, pdfobject);
	//   70  154:aload_2         
	//   71  155:aload_3         
	//   72  156:aload           4
	//   73  158:invokevirtual   #575 <Method void PdfDictionary.put(PdfName, PdfObject)>
		} while(true);
	//   74  161:goto            8
	}

	protected void readDocObj()
		throws IOException
	{
		int i;
		ArrayList arraylist;
		arraylist = new ArrayList();
	//    0    0:new             #167 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #168 <Method void ArrayList()>
	//    3    7:astore          6
		xrefObj = new ArrayList(xref.length / 2);
	//    4    9:aload_0         
	//    5   10:new             #167 <Class ArrayList>
	//    6   13:dup             
	//    7   14:aload_0         
	//    8   15:getfield        #301 <Field long[] xref>
	//    9   18:arraylength     
	//   10   19:iconst_2        
	//   11   20:idiv            
	//   12   21:invokespecial   #1613 <Method void ArrayList(int)>
	//   13   24:putfield        #251 <Field ArrayList xrefObj>
		xrefObj.addAll(((Collection) (Collections.nCopies(xref.length / 2, ((Object) (null))))));
	//   14   27:aload_0         
	//   15   28:getfield        #251 <Field ArrayList xrefObj>
	//   16   31:aload_0         
	//   17   32:getfield        #301 <Field long[] xref>
	//   18   35:arraylength     
	//   19   36:iconst_2        
	//   20   37:idiv            
	//   21   38:aconst_null     
	//   22   39:invokestatic    #1619 <Method List Collections.nCopies(int, Object)>
	//   23   42:invokevirtual   #1623 <Method boolean ArrayList.addAll(Collection)>
	//   24   45:pop             
		i = 2;
	//   25   46:iconst_2        
	//   26   47:istore_1        
_L2:
		long l;
		if(i >= xref.length)
			break MISSING_BLOCK_LABEL_329;
	//   27   48:iload_1         
	//   28   49:aload_0         
	//   29   50:getfield        #301 <Field long[] xref>
	//   30   53:arraylength     
	//   31   54:icmpge          329
		l = xref[i];
	//   32   57:aload_0         
	//   33   58:getfield        #301 <Field long[] xref>
	//   34   61:iload_1         
	//   35   62:laload          
	//   36   63:lstore_2        
		if(l > 0L && xref[i + 1] <= 0L)
			break; /* Loop/switch isn't completed */
	//   37   64:lload_2         
	//   38   65:lconst_0        
	//   39   66:lcmp            
	//   40   67:ifle            83
	//   41   70:aload_0         
	//   42   71:getfield        #301 <Field long[] xref>
	//   43   74:iload_1         
	//   44   75:iconst_1        
	//   45   76:iadd            
	//   46   77:laload          
	//   47   78:lconst_0        
	//   48   79:lcmp            
	//   49   80:ifle            90
_L3:
		i += 2;
	//   50   83:iload_1         
	//   51   84:iconst_2        
	//   52   85:iadd            
	//   53   86:istore_1        
		if(true) goto _L2; else goto _L1
	//   54   87:goto            48
_L1:
		tokens.seek(l);
	//   55   90:aload_0         
	//   56   91:getfield        #193 <Field PRTokeniser tokens>
	//   57   94:lload_2         
	//   58   95:invokevirtual   #479 <Method void PRTokeniser.seek(long)>
		tokens.nextValidToken();
	//   59   98:aload_0         
	//   60   99:getfield        #193 <Field PRTokeniser tokens>
	//   61  102:invokevirtual   #1594 <Method void PRTokeniser.nextValidToken()>
		if(tokens.getTokenType() != PRTokeniser.TokenType.NUMBER)
	//*  62  105:aload_0         
	//*  63  106:getfield        #193 <Field PRTokeniser tokens>
	//*  64  109:invokevirtual   #1598 <Method PRTokeniser$TokenType PRTokeniser.getTokenType()>
	//*  65  112:getstatic       #1626 <Field PRTokeniser$TokenType PRTokeniser$TokenType.NUMBER>
	//*  66  115:if_acmpeq       135
			tokens.throwError(MessageLocalization.getComposedMessage("invalid.object.number", new Object[0]));
	//   67  118:aload_0         
	//   68  119:getfield        #193 <Field PRTokeniser tokens>
	//   69  122:ldc2            #1628 <String "invalid.object.number">
	//   70  125:iconst_0        
	//   71  126:anewarray       Object[]
	//   72  129:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   73  132:invokevirtual   #1589 <Method void PRTokeniser.throwError(String)>
		objNum = tokens.intValue();
	//   74  135:aload_0         
	//   75  136:aload_0         
	//   76  137:getfield        #193 <Field PRTokeniser tokens>
	//   77  140:invokevirtual   #1629 <Method int PRTokeniser.intValue()>
	//   78  143:putfield        #1631 <Field int objNum>
		tokens.nextValidToken();
	//   79  146:aload_0         
	//   80  147:getfield        #193 <Field PRTokeniser tokens>
	//   81  150:invokevirtual   #1594 <Method void PRTokeniser.nextValidToken()>
		if(tokens.getTokenType() != PRTokeniser.TokenType.NUMBER)
	//*  82  153:aload_0         
	//*  83  154:getfield        #193 <Field PRTokeniser tokens>
	//*  84  157:invokevirtual   #1598 <Method PRTokeniser$TokenType PRTokeniser.getTokenType()>
	//*  85  160:getstatic       #1626 <Field PRTokeniser$TokenType PRTokeniser$TokenType.NUMBER>
	//*  86  163:if_acmpeq       183
			tokens.throwError(MessageLocalization.getComposedMessage("invalid.generation.number", new Object[0]));
	//   87  166:aload_0         
	//   88  167:getfield        #193 <Field PRTokeniser tokens>
	//   89  170:ldc2            #1633 <String "invalid.generation.number">
	//   90  173:iconst_0        
	//   91  174:anewarray       Object[]
	//   92  177:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   93  180:invokevirtual   #1589 <Method void PRTokeniser.throwError(String)>
		objGen = tokens.intValue();
	//   94  183:aload_0         
	//   95  184:aload_0         
	//   96  185:getfield        #193 <Field PRTokeniser tokens>
	//   97  188:invokevirtual   #1629 <Method int PRTokeniser.intValue()>
	//   98  191:putfield        #1635 <Field int objGen>
		tokens.nextValidToken();
	//   99  194:aload_0         
	//  100  195:getfield        #193 <Field PRTokeniser tokens>
	//  101  198:invokevirtual   #1594 <Method void PRTokeniser.nextValidToken()>
		if(!tokens.getStringValue().equals("obj"))
	//* 102  201:aload_0         
	//* 103  202:getfield        #193 <Field PRTokeniser tokens>
	//* 104  205:invokevirtual   #1606 <Method String PRTokeniser.getStringValue()>
	//* 105  208:ldc2            #1637 <String "obj">
	//* 106  211:invokevirtual   #872 <Method boolean String.equals(Object)>
	//* 107  214:ifne            234
			tokens.throwError(MessageLocalization.getComposedMessage("token.obj.expected", new Object[0]));
	//  108  217:aload_0         
	//  109  218:getfield        #193 <Field PRTokeniser tokens>
	//  110  221:ldc2            #1639 <String "token.obj.expected">
	//  111  224:iconst_0        
	//  112  225:anewarray       Object[]
	//  113  228:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  114  231:invokevirtual   #1589 <Method void PRTokeniser.throwError(String)>
		PdfObject pdfobject = readPRObject();
	//  115  234:aload_0         
	//  116  235:invokevirtual   #1572 <Method PdfObject readPRObject()>
	//  117  238:astore          5
		Object obj = ((Object) (pdfobject));
	//  118  240:aload           5
	//  119  242:astore          4
		if(!pdfobject.isStream())
			break MISSING_BLOCK_LABEL_267;
	//  120  244:aload           5
	//  121  246:invokevirtual   #801 <Method boolean PdfObject.isStream()>
	//  122  249:ifeq            267
		arraylist.add(((Object) ((PRStream)pdfobject)));
	//  123  252:aload           6
	//  124  254:aload           5
	//  125  256:checkcast       #453 <Class PRStream>
	//  126  259:invokevirtual   #605 <Method boolean ArrayList.add(Object)>
	//  127  262:pop             
		obj = ((Object) (pdfobject));
	//  128  263:aload           5
	//  129  265:astore          4
_L4:
		xrefObj.set(i / 2, obj);
	//  130  267:aload_0         
	//  131  268:getfield        #251 <Field ArrayList xrefObj>
	//  132  271:iload_1         
	//  133  272:iconst_2        
	//  134  273:idiv            
	//  135  274:aload           4
	//  136  276:invokevirtual   #272 <Method Object ArrayList.set(int, Object)>
	//  137  279:pop             
		  goto _L3
	//* 138  280:goto            83
		IOException ioexception;
		ioexception;
	//  139  283:astore          4
		if(debugmode)
	//* 140  285:getstatic       #93  <Field boolean debugmode>
	//* 141  288:ifeq            326
		{
			if(LOGGER.isLogging(Level.ERROR))
	//* 142  291:getstatic       #101 <Field Logger LOGGER>
	//* 143  294:getstatic       #1645 <Field Level Level.ERROR>
	//* 144  297:invokeinterface #1651 <Method boolean Logger.isLogging(Level)>
	//* 145  302:ifeq            320
				LOGGER.error(ioexception.getMessage(), ((Exception) (ioexception)));
	//  146  305:getstatic       #101 <Field Logger LOGGER>
	//  147  308:aload           4
	//  148  310:invokevirtual   #1654 <Method String IOException.getMessage()>
	//  149  313:aload           4
	//  150  315:invokeinterface #1658 <Method void Logger.error(String, Exception)>
			ioexception = null;
	//  151  320:aconst_null     
	//  152  321:astore          4
		} else
	//* 153  323:goto            267
		{
			throw ioexception;
	//  154  326:aload           4
	//  155  328:athrow          
		}
		  goto _L4
		for(int j = 0; j < arraylist.size(); j++)
	//* 156  329:iconst_0        
	//* 157  330:istore_1        
	//* 158  331:iload_1         
	//* 159  332:aload           6
	//* 160  334:invokevirtual   #258 <Method int ArrayList.size()>
	//* 161  337:icmpge          360
			checkPRStreamLength((PRStream)arraylist.get(j));
	//  162  340:aload_0         
	//  163  341:aload           6
	//  164  343:iload_1         
	//  165  344:invokevirtual   #262 <Method Object ArrayList.get(int)>
	//  166  347:checkcast       #453 <Class PRStream>
	//  167  350:invokespecial   #1660 <Method void checkPRStreamLength(PRStream)>

	//  168  353:iload_1         
	//  169  354:iconst_1        
	//  170  355:iadd            
	//  171  356:istore_1        
	//* 172  357:goto            331
		readDecryptedDocObj();
	//  173  360:aload_0         
	//  174  361:invokespecial   #1662 <Method void readDecryptedDocObj()>
		if(objStmMark != null)
	//* 175  364:aload_0         
	//* 176  365:getfield        #1664 <Field HashMap objStmMark>
	//* 177  368:ifnull          468
		{
			int k;
			for(Iterator iterator = objStmMark.entrySet().iterator(); iterator.hasNext(); xrefObj.set(k, ((Object) (null))))
	//* 178  371:aload_0         
	//* 179  372:getfield        #1664 <Field HashMap objStmMark>
	//* 180  375:invokevirtual   #1467 <Method Set HashMap.entrySet()>
	//* 181  378:invokeinterface #704 <Method Iterator Set.iterator()>
	//* 182  383:astore          4
	//* 183  385:aload           4
	//* 184  387:invokeinterface #709 <Method boolean Iterator.hasNext()>
	//* 185  392:ifeq            463
			{
				Object obj1 = ((Object) ((java.util.Map.Entry)iterator.next()));
	//  186  395:aload           4
	//  187  397:invokeinterface #713 <Method Object Iterator.next()>
	//  188  402:checkcast       #1469 <Class java.util.Map$Entry>
	//  189  405:astore          5
				k = ((Integer)((java.util.Map.Entry) (obj1)).getKey()).intValue();
	//  190  407:aload           5
	//  191  409:invokeinterface #1667 <Method Object java.util.Map$Entry.getKey()>
	//  192  414:checkcast       #1669 <Class Integer>
	//  193  417:invokevirtual   #1670 <Method int Integer.intValue()>
	//  194  420:istore_1        
				obj1 = ((Object) ((IntHashtable)((java.util.Map.Entry) (obj1)).getValue()));
	//  195  421:aload           5
	//  196  423:invokeinterface #1472 <Method Object java.util.Map$Entry.getValue()>
	//  197  428:checkcast       #1265 <Class IntHashtable>
	//  198  431:astore          5
				readObjStm((PRStream)xrefObj.get(k), ((IntHashtable) (obj1)));
	//  199  433:aload_0         
	//  200  434:aload_0         
	//  201  435:getfield        #251 <Field ArrayList xrefObj>
	//  202  438:iload_1         
	//  203  439:invokevirtual   #262 <Method Object ArrayList.get(int)>
	//  204  442:checkcast       #453 <Class PRStream>
	//  205  445:aload           5
	//  206  447:invokevirtual   #1674 <Method void readObjStm(PRStream, IntHashtable)>
			}

	//  207  450:aload_0         
	//  208  451:getfield        #251 <Field ArrayList xrefObj>
	//  209  454:iload_1         
	//  210  455:aconst_null     
	//  211  456:invokevirtual   #272 <Method Object ArrayList.set(int, Object)>
	//  212  459:pop             
	//* 213  460:goto            385
			objStmMark = null;
	//  214  463:aload_0         
	//  215  464:aconst_null     
	//  216  465:putfield        #1664 <Field HashMap objStmMark>
		}
		xref = null;
	//  217  468:aload_0         
	//  218  469:aconst_null     
	//  219  470:putfield        #301 <Field long[] xref>
		return;
	//  220  473:return          
	}

	protected void readDocObjPartial()
		throws IOException
	{
		xrefObj = new ArrayList(xref.length / 2);
	//    0    0:aload_0         
	//    1    1:new             #167 <Class ArrayList>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #301 <Field long[] xref>
	//    5    9:arraylength     
	//    6   10:iconst_2        
	//    7   11:idiv            
	//    8   12:invokespecial   #1613 <Method void ArrayList(int)>
	//    9   15:putfield        #251 <Field ArrayList xrefObj>
		xrefObj.addAll(((Collection) (Collections.nCopies(xref.length / 2, ((Object) (null))))));
	//   10   18:aload_0         
	//   11   19:getfield        #251 <Field ArrayList xrefObj>
	//   12   22:aload_0         
	//   13   23:getfield        #301 <Field long[] xref>
	//   14   26:arraylength     
	//   15   27:iconst_2        
	//   16   28:idiv            
	//   17   29:aconst_null     
	//   18   30:invokestatic    #1619 <Method List Collections.nCopies(int, Object)>
	//   19   33:invokevirtual   #1623 <Method boolean ArrayList.addAll(Collection)>
	//   20   36:pop             
		readDecryptedDocObj();
	//   21   37:aload_0         
	//   22   38:invokespecial   #1662 <Method void readDecryptedDocObj()>
		if(objStmToOffset != null)
	//*  23   41:aload_0         
	//*  24   42:getfield        #299 <Field LongHashtable objStmToOffset>
	//*  25   45:ifnull          112
		{
			long al[] = objStmToOffset.getKeys();
	//   26   48:aload_0         
	//   27   49:getfield        #299 <Field LongHashtable objStmToOffset>
	//   28   52:invokevirtual   #1680 <Method long[] LongHashtable.getKeys()>
	//   29   55:astore          4
			for(int i = 0; i < al.length; i++)
	//*  30   57:iconst_0        
	//*  31   58:istore_1        
	//*  32   59:iload_1         
	//*  33   60:aload           4
	//*  34   62:arraylength     
	//*  35   63:icmpge          112
			{
				long l = al[i];
	//   36   66:aload           4
	//   37   68:iload_1         
	//   38   69:laload          
	//   39   70:lstore_2        
				objStmToOffset.put(l, xref[(int)(l * 2L)]);
	//   40   71:aload_0         
	//   41   72:getfield        #299 <Field LongHashtable objStmToOffset>
	//   42   75:lload_2         
	//   43   76:aload_0         
	//   44   77:getfield        #301 <Field long[] xref>
	//   45   80:lload_2         
	//   46   81:ldc2w           #487 <Long 2L>
	//   47   84:lmul            
	//   48   85:l2i             
	//   49   86:laload          
	//   50   87:invokevirtual   #1683 <Method long LongHashtable.put(long, long)>
	//   51   90:pop2            
				xref[(int)(l * 2L)] = -1L;
	//   52   91:aload_0         
	//   53   92:getfield        #301 <Field long[] xref>
	//   54   95:lload_2         
	//   55   96:ldc2w           #487 <Long 2L>
	//   56   99:lmul            
	//   57  100:l2i             
	//   58  101:ldc2w           #913 <Long -1L>
	//   59  104:lastore         
			}

	//   60  105:iload_1         
	//   61  106:iconst_1        
	//   62  107:iadd            
	//   63  108:istore_1        
		}
	//*  64  109:goto            59
	//   65  112:return          
	}

	protected void readObjStm(PRStream prstream, IntHashtable inthashtable)
		throws IOException
	{
		int j;
		int k;
		PRTokeniser prtokeniser;
		if(prstream == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		k = prstream.getAsNumber(PdfName.FIRST).intValue();
	//    3    5:aload_1         
	//    4    6:getstatic       #902 <Field PdfName PdfName.FIRST>
	//    5    9:invokevirtual   #1684 <Method PdfNumber PRStream.getAsNumber(PdfName)>
	//    6   12:invokevirtual   #474 <Method int PdfNumber.intValue()>
	//    7   15:istore          5
		j = prstream.getAsNumber(PdfName.N).intValue();
	//    8   17:aload_1         
	//    9   18:getstatic       #1687 <Field PdfName PdfName.N>
	//   10   21:invokevirtual   #1684 <Method PdfNumber PRStream.getAsNumber(PdfName)>
	//   11   24:invokevirtual   #474 <Method int PdfNumber.intValue()>
	//   12   27:istore          4
		prstream = ((PRStream) (getStreamBytes(prstream, tokens.getFile())));
	//   13   29:aload_1         
	//   14   30:aload_0         
	//   15   31:getfield        #193 <Field PRTokeniser tokens>
	//   16   34:invokevirtual   #1690 <Method RandomAccessFileOrArray PRTokeniser.getFile()>
	//   17   37:invokestatic    #813 <Method byte[] getStreamBytes(PRStream, RandomAccessFileOrArray)>
	//   18   40:astore_1        
		prtokeniser = tokens;
	//   19   41:aload_0         
	//   20   42:getfield        #193 <Field PRTokeniser tokens>
	//   21   45:astore          8
		tokens = new PRTokeniser(new RandomAccessFileOrArray((new RandomAccessSourceFactory()).createSource(((byte []) (prstream)))));
	//   22   47:aload_0         
	//   23   48:new             #231 <Class PRTokeniser>
	//   24   51:dup             
	//   25   52:new             #313 <Class RandomAccessFileOrArray>
	//   26   55:dup             
	//   27   56:new             #326 <Class RandomAccessSourceFactory>
	//   28   59:dup             
	//   29   60:invokespecial   #327 <Method void RandomAccessSourceFactory()>
	//   30   63:aload_1         
	//   31   64:invokevirtual   #372 <Method RandomAccessSource RandomAccessSourceFactory.createSource(byte[])>
	//   32   67:invokespecial   #782 <Method void RandomAccessFileOrArray(RandomAccessSource)>
	//   33   70:invokespecial   #238 <Method void PRTokeniser(RandomAccessFileOrArray)>
	//   34   73:putfield        #193 <Field PRTokeniser tokens>
		int ai[];
		int ai1[];
		ai = new int[j];
	//   35   76:iload           4
	//   36   78:newarray        int[]
	//   37   80:astore          9
		ai1 = new int[j];
	//   38   82:iload           4
	//   39   84:newarray        int[]
	//   40   86:astore          10
		int i;
		boolean flag;
		flag = true;
	//   41   88:iconst_1        
	//   42   89:istore          6
		i = 0;
	//   43   91:iconst_0        
	//   44   92:istore_3        
_L6:
		if(i >= j) goto _L2; else goto _L1
	//   45   93:iload_3         
	//   46   94:iload           4
	//   47   96:icmpge          113
_L1:
		flag = tokens.nextToken();
	//   48   99:aload_0         
	//   49  100:getfield        #193 <Field PRTokeniser tokens>
	//   50  103:invokevirtual   #1693 <Method boolean PRTokeniser.nextToken()>
	//   51  106:istore          6
		if(flag) goto _L3; else goto _L2
	//   52  108:iload           6
	//   53  110:ifne            145
_L2:
		if(flag)
			break; /* Loop/switch isn't completed */
	//   54  113:iload           6
	//   55  115:ifne            342
		throw new InvalidPdfException(MessageLocalization.getComposedMessage("error.reading.objstm", new Object[0]));
	//   56  118:new             #983 <Class InvalidPdfException>
	//   57  121:dup             
	//   58  122:ldc2            #1695 <String "error.reading.objstm">
	//   59  125:iconst_0        
	//   60  126:anewarray       Object[]
	//   61  129:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   62  132:invokespecial   #986 <Method void InvalidPdfException(String)>
	//   63  135:athrow          
		prstream;
	//   64  136:astore_1        
		tokens = prtokeniser;
	//   65  137:aload_0         
	//   66  138:aload           8
	//   67  140:putfield        #193 <Field PRTokeniser tokens>
		throw prstream;
	//   68  143:aload_1         
	//   69  144:athrow          
_L3:
		if(tokens.getTokenType() != PRTokeniser.TokenType.NUMBER)
	//*  70  145:aload_0         
	//*  71  146:getfield        #193 <Field PRTokeniser tokens>
	//*  72  149:invokevirtual   #1598 <Method PRTokeniser$TokenType PRTokeniser.getTokenType()>
	//*  73  152:getstatic       #1626 <Field PRTokeniser$TokenType PRTokeniser$TokenType.NUMBER>
	//*  74  155:if_acmpeq       164
		{
			flag = false;
	//   75  158:iconst_0        
	//   76  159:istore          6
			continue; /* Loop/switch isn't completed */
	//   77  161:goto            113
		}
		boolean flag1;
		ai1[i] = tokens.intValue();
	//   78  164:aload           10
	//   79  166:iload_3         
	//   80  167:aload_0         
	//   81  168:getfield        #193 <Field PRTokeniser tokens>
	//   82  171:invokevirtual   #1629 <Method int PRTokeniser.intValue()>
	//   83  174:iastore         
		flag1 = tokens.nextToken();
	//   84  175:aload_0         
	//   85  176:getfield        #193 <Field PRTokeniser tokens>
	//   86  179:invokevirtual   #1693 <Method boolean PRTokeniser.nextToken()>
	//   87  182:istore          7
		flag = flag1;
	//   88  184:iload           7
	//   89  186:istore          6
		if(!flag1)
			continue; /* Loop/switch isn't completed */
	//   90  188:iload           7
	//   91  190:ifeq            113
		if(tokens.getTokenType() == PRTokeniser.TokenType.NUMBER)
			break; /* Loop/switch isn't completed */
	//   92  193:aload_0         
	//   93  194:getfield        #193 <Field PRTokeniser tokens>
	//   94  197:invokevirtual   #1598 <Method PRTokeniser$TokenType PRTokeniser.getTokenType()>
	//   95  200:getstatic       #1626 <Field PRTokeniser$TokenType PRTokeniser$TokenType.NUMBER>
	//   96  203:if_acmpeq       212
		flag = false;
	//   97  206:iconst_0        
	//   98  207:istore          6
		if(true) goto _L2; else goto _L4
	//   99  209:goto            113
_L4:
		ai[i] = tokens.intValue() + k;
	//  100  212:aload           9
	//  101  214:iload_3         
	//  102  215:aload_0         
	//  103  216:getfield        #193 <Field PRTokeniser tokens>
	//  104  219:invokevirtual   #1629 <Method int PRTokeniser.intValue()>
	//  105  222:iload           5
	//  106  224:iadd            
	//  107  225:iastore         
		i++;
	//  108  226:iload_3         
	//  109  227:iconst_1        
	//  110  228:iadd            
	//  111  229:istore_3        
		flag = flag1;
	//  112  230:iload           7
	//  113  232:istore          6
		if(true) goto _L6; else goto _L5
	//  114  234:goto            93
_L15:
		if(i >= j) goto _L8; else goto _L7
	//  115  237:iload_3         
	//  116  238:iload           4
	//  117  240:icmpge          335
_L7:
		if(!inthashtable.containsKey(i)) goto _L10; else goto _L9
	//  118  243:aload_2         
	//  119  244:iload_3         
	//  120  245:invokevirtual   #1269 <Method boolean IntHashtable.containsKey(int)>
	//  121  248:ifeq            347
_L9:
		tokens.seek(ai[i]);
	//  122  251:aload_0         
	//  123  252:getfield        #193 <Field PRTokeniser tokens>
	//  124  255:aload           9
	//  125  257:iload_3         
	//  126  258:iaload          
	//  127  259:i2l             
	//  128  260:invokevirtual   #479 <Method void PRTokeniser.seek(long)>
		tokens.nextToken();
	//  129  263:aload_0         
	//  130  264:getfield        #193 <Field PRTokeniser tokens>
	//  131  267:invokevirtual   #1693 <Method boolean PRTokeniser.nextToken()>
	//  132  270:pop             
		if(tokens.getTokenType() != PRTokeniser.TokenType.NUMBER) goto _L12; else goto _L11
	//  133  271:aload_0         
	//  134  272:getfield        #193 <Field PRTokeniser tokens>
	//  135  275:invokevirtual   #1598 <Method PRTokeniser$TokenType PRTokeniser.getTokenType()>
	//  136  278:getstatic       #1626 <Field PRTokeniser$TokenType PRTokeniser$TokenType.NUMBER>
	//  137  281:if_acmpne       315
_L11:
		prstream = ((PRStream) (new PdfNumber(tokens.getStringValue())));
	//  138  284:new             #471 <Class PdfNumber>
	//  139  287:dup             
	//  140  288:aload_0         
	//  141  289:getfield        #193 <Field PRTokeniser tokens>
	//  142  292:invokevirtual   #1606 <Method String PRTokeniser.getStringValue()>
	//  143  295:invokespecial   #1696 <Method void PdfNumber(String)>
	//  144  298:astore_1        
_L13:
		xrefObj.set(ai1[i], ((Object) (prstream)));
	//  145  299:aload_0         
	//  146  300:getfield        #251 <Field ArrayList xrefObj>
	//  147  303:aload           10
	//  148  305:iload_3         
	//  149  306:iaload          
	//  150  307:aload_1         
	//  151  308:invokevirtual   #272 <Method Object ArrayList.set(int, Object)>
	//  152  311:pop             
		  goto _L10
	//* 153  312:goto            347
_L12:
		tokens.seek(ai[i]);
	//  154  315:aload_0         
	//  155  316:getfield        #193 <Field PRTokeniser tokens>
	//  156  319:aload           9
	//  157  321:iload_3         
	//  158  322:iaload          
	//  159  323:i2l             
	//  160  324:invokevirtual   #479 <Method void PRTokeniser.seek(long)>
		prstream = ((PRStream) (readPRObject()));
	//  161  327:aload_0         
	//  162  328:invokevirtual   #1572 <Method PdfObject readPRObject()>
	//  163  331:astore_1        
		  goto _L13
	//* 164  332:goto            299
_L8:
		tokens = prtokeniser;
	//  165  335:aload_0         
	//  166  336:aload           8
	//  167  338:putfield        #193 <Field PRTokeniser tokens>
		return;
	//  168  341:return          
_L5:
		i = 0;
	//  169  342:iconst_0        
	//  170  343:istore_3        
		continue; /* Loop/switch isn't completed */
	//  171  344:goto            237
_L10:
		i++;
	//  172  347:iload_3         
	//  173  348:iconst_1        
	//  174  349:iadd            
	//  175  350:istore_3        
		if(true) goto _L15; else goto _L14
	//  176  351:goto            237
_L14:
	}

	protected PdfObject readOneObjStm(PRStream prstream, int i)
		throws IOException
	{
		int j;
		int k;
		int l;
		boolean flag;
		PRTokeniser prtokeniser;
		l = prstream.getAsNumber(PdfName.FIRST).intValue();
	//    0    0:aload_1         
	//    1    1:getstatic       #902 <Field PdfName PdfName.FIRST>
	//    2    4:invokevirtual   #1684 <Method PdfNumber PRStream.getAsNumber(PdfName)>
	//    3    7:invokevirtual   #474 <Method int PdfNumber.intValue()>
	//    4   10:istore          5
		prstream = ((PRStream) (getStreamBytes(prstream, tokens.getFile())));
	//    5   12:aload_1         
	//    6   13:aload_0         
	//    7   14:getfield        #193 <Field PRTokeniser tokens>
	//    8   17:invokevirtual   #1690 <Method RandomAccessFileOrArray PRTokeniser.getFile()>
	//    9   20:invokestatic    #813 <Method byte[] getStreamBytes(PRStream, RandomAccessFileOrArray)>
	//   10   23:astore_1        
		prtokeniser = tokens;
	//   11   24:aload_0         
	//   12   25:getfield        #193 <Field PRTokeniser tokens>
	//   13   28:astore          8
		tokens = new PRTokeniser(new RandomAccessFileOrArray((new RandomAccessSourceFactory()).createSource(((byte []) (prstream)))));
	//   14   30:aload_0         
	//   15   31:new             #231 <Class PRTokeniser>
	//   16   34:dup             
	//   17   35:new             #313 <Class RandomAccessFileOrArray>
	//   18   38:dup             
	//   19   39:new             #326 <Class RandomAccessSourceFactory>
	//   20   42:dup             
	//   21   43:invokespecial   #327 <Method void RandomAccessSourceFactory()>
	//   22   46:aload_1         
	//   23   47:invokevirtual   #372 <Method RandomAccessSource RandomAccessSourceFactory.createSource(byte[])>
	//   24   50:invokespecial   #782 <Method void RandomAccessFileOrArray(RandomAccessSource)>
	//   25   53:invokespecial   #238 <Method void PRTokeniser(RandomAccessFileOrArray)>
	//   26   56:putfield        #193 <Field PRTokeniser tokens>
		k = 0;
	//   27   59:iconst_0        
	//   28   60:istore          4
		flag = true;
	//   29   62:iconst_1        
	//   30   63:istore          6
		j = 0;
	//   31   65:iconst_0        
	//   32   66:istore_3        
_L6:
		if(j >= i + 1) goto _L2; else goto _L1
	//   33   67:iload_3         
	//   34   68:iload_2         
	//   35   69:iconst_1        
	//   36   70:iadd            
	//   37   71:icmpge          88
_L1:
		flag = tokens.nextToken();
	//   38   74:aload_0         
	//   39   75:getfield        #193 <Field PRTokeniser tokens>
	//   40   78:invokevirtual   #1693 <Method boolean PRTokeniser.nextToken()>
	//   41   81:istore          6
		if(flag) goto _L3; else goto _L2
	//   42   83:iload           6
	//   43   85:ifne            120
_L2:
		if(flag)
			break; /* Loop/switch isn't completed */
	//   44   88:iload           6
	//   45   90:ifne            199
		throw new InvalidPdfException(MessageLocalization.getComposedMessage("error.reading.objstm", new Object[0]));
	//   46   93:new             #983 <Class InvalidPdfException>
	//   47   96:dup             
	//   48   97:ldc2            #1695 <String "error.reading.objstm">
	//   49  100:iconst_0        
	//   50  101:anewarray       Object[]
	//   51  104:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   52  107:invokespecial   #986 <Method void InvalidPdfException(String)>
	//   53  110:athrow          
		prstream;
	//   54  111:astore_1        
		tokens = prtokeniser;
	//   55  112:aload_0         
	//   56  113:aload           8
	//   57  115:putfield        #193 <Field PRTokeniser tokens>
		throw prstream;
	//   58  118:aload_1         
	//   59  119:athrow          
_L3:
		if(tokens.getTokenType() != PRTokeniser.TokenType.NUMBER)
	//*  60  120:aload_0         
	//*  61  121:getfield        #193 <Field PRTokeniser tokens>
	//*  62  124:invokevirtual   #1598 <Method PRTokeniser$TokenType PRTokeniser.getTokenType()>
	//*  63  127:getstatic       #1626 <Field PRTokeniser$TokenType PRTokeniser$TokenType.NUMBER>
	//*  64  130:if_acmpeq       139
		{
			flag = false;
	//   65  133:iconst_0        
	//   66  134:istore          6
			continue; /* Loop/switch isn't completed */
	//   67  136:goto            88
		}
		boolean flag1 = tokens.nextToken();
	//   68  139:aload_0         
	//   69  140:getfield        #193 <Field PRTokeniser tokens>
	//   70  143:invokevirtual   #1693 <Method boolean PRTokeniser.nextToken()>
	//   71  146:istore          7
		flag = flag1;
	//   72  148:iload           7
	//   73  150:istore          6
		if(!flag1)
			continue; /* Loop/switch isn't completed */
	//   74  152:iload           7
	//   75  154:ifeq            88
		if(tokens.getTokenType() == PRTokeniser.TokenType.NUMBER)
			break; /* Loop/switch isn't completed */
	//   76  157:aload_0         
	//   77  158:getfield        #193 <Field PRTokeniser tokens>
	//   78  161:invokevirtual   #1598 <Method PRTokeniser$TokenType PRTokeniser.getTokenType()>
	//   79  164:getstatic       #1626 <Field PRTokeniser$TokenType PRTokeniser$TokenType.NUMBER>
	//   80  167:if_acmpeq       176
		flag = false;
	//   81  170:iconst_0        
	//   82  171:istore          6
		if(true) goto _L2; else goto _L4
	//   83  173:goto            88
_L4:
		k = tokens.intValue() + l;
	//   84  176:aload_0         
	//   85  177:getfield        #193 <Field PRTokeniser tokens>
	//   86  180:invokevirtual   #1629 <Method int PRTokeniser.intValue()>
	//   87  183:iload           5
	//   88  185:iadd            
	//   89  186:istore          4
		j++;
	//   90  188:iload_3         
	//   91  189:iconst_1        
	//   92  190:iadd            
	//   93  191:istore_3        
		flag = flag1;
	//   94  192:iload           7
	//   95  194:istore          6
		if(true) goto _L6; else goto _L5
	//   96  196:goto            67
_L5:
		tokens.seek(k);
	//   97  199:aload_0         
	//   98  200:getfield        #193 <Field PRTokeniser tokens>
	//   99  203:iload           4
	//  100  205:i2l             
	//  101  206:invokevirtual   #479 <Method void PRTokeniser.seek(long)>
		tokens.nextToken();
	//  102  209:aload_0         
	//  103  210:getfield        #193 <Field PRTokeniser tokens>
	//  104  213:invokevirtual   #1693 <Method boolean PRTokeniser.nextToken()>
	//  105  216:pop             
		if(tokens.getTokenType() != PRTokeniser.TokenType.NUMBER)
			break MISSING_BLOCK_LABEL_253;
	//  106  217:aload_0         
	//  107  218:getfield        #193 <Field PRTokeniser tokens>
	//  108  221:invokevirtual   #1598 <Method PRTokeniser$TokenType PRTokeniser.getTokenType()>
	//  109  224:getstatic       #1626 <Field PRTokeniser$TokenType PRTokeniser$TokenType.NUMBER>
	//  110  227:if_acmpne       253
		prstream = ((PRStream) (new PdfNumber(tokens.getStringValue())));
	//  111  230:new             #471 <Class PdfNumber>
	//  112  233:dup             
	//  113  234:aload_0         
	//  114  235:getfield        #193 <Field PRTokeniser tokens>
	//  115  238:invokevirtual   #1606 <Method String PRTokeniser.getStringValue()>
	//  116  241:invokespecial   #1696 <Method void PdfNumber(String)>
	//  117  244:astore_1        
_L7:
		tokens = prtokeniser;
	//  118  245:aload_0         
	//  119  246:aload           8
	//  120  248:putfield        #193 <Field PRTokeniser tokens>
		return ((PdfObject) (prstream));
	//  121  251:aload_1         
	//  122  252:areturn         
		tokens.seek(k);
	//  123  253:aload_0         
	//  124  254:getfield        #193 <Field PRTokeniser tokens>
	//  125  257:iload           4
	//  126  259:i2l             
	//  127  260:invokevirtual   #479 <Method void PRTokeniser.seek(long)>
		prstream = ((PRStream) (readPRObject()));
	//  128  263:aload_0         
	//  129  264:invokevirtual   #1572 <Method PdfObject readPRObject()>
	//  130  267:astore_1        
		  goto _L7
	//* 131  268:goto            245
	}

	protected PdfObject readPRObject()
		throws IOException
	{
		tokens.nextValidToken();
	//    0    0:aload_0         
	//    1    1:getfield        #193 <Field PRTokeniser tokens>
	//    2    4:invokevirtual   #1594 <Method void PRTokeniser.nextValidToken()>
		Object obj = ((Object) (tokens.getTokenType()));
	//    3    7:aload_0         
	//    4    8:getfield        #193 <Field PRTokeniser tokens>
	//    5   11:invokevirtual   #1598 <Method PRTokeniser$TokenType PRTokeniser.getTokenType()>
	//    6   14:astore          6
		static class _cls1
		{

			static final int $SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType[];

			static 
			{
				$SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType = new int[PRTokeniser.TokenType.values().length];
			//    0    0:invokestatic    #18  <Method PRTokeniser$TokenType[] PRTokeniser$TokenType.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType>
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType[PRTokeniser.TokenType.START_DIC.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType>
			//    5   12:getstatic       #24  <Field PRTokeniser$TokenType PRTokeniser$TokenType.START_DIC>
			//    6   15:invokevirtual   #28  <Method int PRTokeniser$TokenType.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType>
			//*  10   23:getstatic       #31  <Field PRTokeniser$TokenType PRTokeniser$TokenType.START_ARRAY>
			//*  11   26:invokevirtual   #28  <Method int PRTokeniser$TokenType.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType>
			//*  15   34:getstatic       #34  <Field PRTokeniser$TokenType PRTokeniser$TokenType.NUMBER>
			//*  16   37:invokevirtual   #28  <Method int PRTokeniser$TokenType.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType>
			//*  20   45:getstatic       #37  <Field PRTokeniser$TokenType PRTokeniser$TokenType.STRING>
			//*  21   48:invokevirtual   #28  <Method int PRTokeniser$TokenType.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType>
			//*  25   56:getstatic       #40  <Field PRTokeniser$TokenType PRTokeniser$TokenType.NAME>
			//*  26   59:invokevirtual   #28  <Method int PRTokeniser$TokenType.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType>
			//*  30   67:getstatic       #43  <Field PRTokeniser$TokenType PRTokeniser$TokenType.REF>
			//*  31   70:invokevirtual   #28  <Method int PRTokeniser$TokenType.ordinal()>
			//*  32   73:bipush          6
			//*  33   75:iastore         
			//*  34   76:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType>
			//*  35   79:getstatic       #46  <Field PRTokeniser$TokenType PRTokeniser$TokenType.ENDOFFILE>
			//*  36   82:invokevirtual   #28  <Method int PRTokeniser$TokenType.ordinal()>
			//*  37   85:bipush          7
			//*  38   87:iastore         
			//*  39   88:return          
			//*  40   89:astore_0        
			//*  41   90:return          
			//*  42   91:astore_0        
			//*  43   92:goto            76
			//*  44   95:astore_0        
			//*  45   96:goto            64
			//*  46   99:astore_0        
			//*  47  100:goto            53
			//*  48  103:astore_0        
			//*  49  104:goto            42
			//*  50  107:astore_0        
			//*  51  108:goto            31
				catch(NoSuchFieldError nosuchfielderror6) { }
			//   52  111:astore_0        
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType[PRTokeniser.TokenType.START_ARRAY.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror5) { }
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType[PRTokeniser.TokenType.NUMBER.ordinal()] = 3;
				}
				catch(NoSuchFieldError nosuchfielderror4) { }
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType[PRTokeniser.TokenType.STRING.ordinal()] = 4;
				}
				catch(NoSuchFieldError nosuchfielderror3) { }
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType[PRTokeniser.TokenType.NAME.ordinal()] = 5;
				}
				catch(NoSuchFieldError nosuchfielderror2) { }
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType[PRTokeniser.TokenType.REF.ordinal()] = 6;
				}
				catch(NoSuchFieldError nosuchfielderror1) { }
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType[PRTokeniser.TokenType.ENDOFFILE.ordinal()] = 7;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//*  53  112:goto            20
			}
		}

		Object obj1;
		switch(_cls1..SwitchMap.com.itextpdf.text.pdf.PRTokeniser.TokenType[((PRTokeniser.TokenType) (obj)).ordinal()])
	//*   7   16:getstatic       #1702 <Field int[] PdfReader$1.$SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType>
	//*   8   19:aload           6
	//*   9   21:invokevirtual   #1581 <Method int PRTokeniser$TokenType.ordinal()>
	//*  10   24:iaload          
		{
	//*  11   25:tableswitch     1 7: default 68
	//	               1 103
	//	               2 296
	//	               3 325
	//	               4 340
	//	               5 400
	//	               6 451
	//	               7 474
		default:
			obj1 = ((Object) (tokens.getStringValue()));
	//   12   68:aload_0         
	//   13   69:getfield        #193 <Field PRTokeniser tokens>
	//   14   72:invokevirtual   #1606 <Method String PRTokeniser.getStringValue()>
	//   15   75:astore          7
			int i;
			int j;
			long l;
			boolean flag;
			if("null".equals(obj1))
	//*  16   77:ldc2            #637 <String "null">
	//*  17   80:aload           7
	//*  18   82:invokevirtual   #872 <Method boolean String.equals(Object)>
	//*  19   85:ifeq            496
				if(readDepth == 0)
	//*  20   88:aload_0         
	//*  21   89:getfield        #185 <Field int readDepth>
	//*  22   92:ifne            492
					return ((PdfObject) (new PdfNull()));
	//   23   95:new             #633 <Class PdfNull>
	//   24   98:dup             
	//   25   99:invokespecial   #829 <Method void PdfNull()>
	//   26  102:areturn         
				else
	//*  27  103:aload_0         
	//*  28  104:aload_0         
	//*  29  105:getfield        #185 <Field int readDepth>
	//*  30  108:iconst_1        
	//*  31  109:iadd            
	//*  32  110:putfield        #185 <Field int readDepth>
	//*  33  113:aload_0         
	//*  34  114:invokevirtual   #1704 <Method PdfDictionary readDictionary()>
	//*  35  117:astore          6
	//*  36  119:aload_0         
	//*  37  120:aload_0         
	//*  38  121:getfield        #185 <Field int readDepth>
	//*  39  124:iconst_1        
	//*  40  125:isub            
	//*  41  126:putfield        #185 <Field int readDepth>
	//*  42  129:aload_0         
	//*  43  130:getfield        #193 <Field PRTokeniser tokens>
	//*  44  133:invokevirtual   #482 <Method long PRTokeniser.getFilePointer()>
	//*  45  136:lstore_3        
	//*  46  137:aload_0         
	//*  47  138:getfield        #193 <Field PRTokeniser tokens>
	//*  48  141:invokevirtual   #1693 <Method boolean PRTokeniser.nextToken()>
	//*  49  144:istore          5
	//*  50  146:iload           5
	//*  51  148:ifeq            164
	//*  52  151:aload_0         
	//*  53  152:getfield        #193 <Field PRTokeniser tokens>
	//*  54  155:invokevirtual   #1598 <Method PRTokeniser$TokenType PRTokeniser.getTokenType()>
	//*  55  158:getstatic       #1707 <Field PRTokeniser$TokenType PRTokeniser$TokenType.COMMENT>
	//*  56  161:if_acmpeq       137
	//*  57  164:iload           5
	//*  58  166:ifeq            285
	//*  59  169:aload_0         
	//*  60  170:getfield        #193 <Field PRTokeniser tokens>
	//*  61  173:invokevirtual   #1606 <Method String PRTokeniser.getStringValue()>
	//*  62  176:ldc2            #1709 <String "stream">
	//*  63  179:invokevirtual   #872 <Method boolean String.equals(Object)>
	//*  64  182:ifeq            285
	//*  65  185:aload_0         
	//*  66  186:getfield        #193 <Field PRTokeniser tokens>
	//*  67  189:invokevirtual   #490 <Method int PRTokeniser.read()>
	//*  68  192:istore_2        
	//*  69  193:iload_2         
	//*  70  194:bipush          32
	//*  71  196:icmpeq          185
	//*  72  199:iload_2         
	//*  73  200:bipush          9
	//*  74  202:icmpeq          185
	//*  75  205:iload_2         
	//*  76  206:ifeq            185
	//*  77  209:iload_2         
	//*  78  210:bipush          12
	//*  79  212:icmpeq          185
	//*  80  215:iload_2         
	//*  81  216:istore_1        
	//*  82  217:iload_2         
	//*  83  218:bipush          10
	//*  84  220:icmpeq          231
	//*  85  223:aload_0         
	//*  86  224:getfield        #193 <Field PRTokeniser tokens>
	//*  87  227:invokevirtual   #490 <Method int PRTokeniser.read()>
	//*  88  230:istore_1        
	//*  89  231:iload_1         
	//*  90  232:bipush          10
	//*  91  234:icmpeq          245
	//*  92  237:aload_0         
	//*  93  238:getfield        #193 <Field PRTokeniser tokens>
	//*  94  241:iload_1         
	//*  95  242:invokevirtual   #1712 <Method void PRTokeniser.backOnePosition(int)>
	//*  96  245:new             #453 <Class PRStream>
	//*  97  248:dup             
	//*  98  249:aload_0         
	//*  99  250:aload_0         
	//* 100  251:getfield        #193 <Field PRTokeniser tokens>
	//* 101  254:invokevirtual   #482 <Method long PRTokeniser.getFilePointer()>
	//* 102  257:invokespecial   #1715 <Method void PRStream(PdfReader, long)>
	//* 103  260:astore          7
	//* 104  262:aload           7
	//* 105  264:aload           6
	//* 106  266:invokevirtual   #1717 <Method void PRStream.putAll(PdfDictionary)>
	//* 107  269:aload           7
	//* 108  271:aload_0         
	//* 109  272:getfield        #1631 <Field int objNum>
	//* 110  275:aload_0         
	//* 111  276:getfield        #1635 <Field int objGen>
	//* 112  279:invokevirtual   #1720 <Method void PRStream.setObjNum(int, int)>
	//* 113  282:aload           7
	//* 114  284:areturn         
	//* 115  285:aload_0         
	//* 116  286:getfield        #193 <Field PRTokeniser tokens>
	//* 117  289:lload_3         
	//* 118  290:invokevirtual   #479 <Method void PRTokeniser.seek(long)>
	//* 119  293:aload           6
	//* 120  295:areturn         
	//* 121  296:aload_0         
	//* 122  297:aload_0         
	//* 123  298:getfield        #185 <Field int readDepth>
	//* 124  301:iconst_1        
	//* 125  302:iadd            
	//* 126  303:putfield        #185 <Field int readDepth>
	//* 127  306:aload_0         
	//* 128  307:invokevirtual   #1722 <Method PdfArray readArray()>
	//* 129  310:astore          6
	//* 130  312:aload_0         
	//* 131  313:aload_0         
	//* 132  314:getfield        #185 <Field int readDepth>
	//* 133  317:iconst_1        
	//* 134  318:isub            
	//* 135  319:putfield        #185 <Field int readDepth>
	//* 136  322:aload           6
	//* 137  324:areturn         
	//* 138  325:new             #471 <Class PdfNumber>
	//* 139  328:dup             
	//* 140  329:aload_0         
	//* 141  330:getfield        #193 <Field PRTokeniser tokens>
	//* 142  333:invokevirtual   #1606 <Method String PRTokeniser.getStringValue()>
	//* 143  336:invokespecial   #1696 <Method void PdfNumber(String)>
	//* 144  339:areturn         
	//* 145  340:new             #1015 <Class PdfString>
	//* 146  343:dup             
	//* 147  344:aload_0         
	//* 148  345:getfield        #193 <Field PRTokeniser tokens>
	//* 149  348:invokevirtual   #1606 <Method String PRTokeniser.getStringValue()>
	//* 150  351:aconst_null     
	//* 151  352:invokespecial   #1725 <Method void PdfString(String, String)>
	//* 152  355:aload_0         
	//* 153  356:getfield        #193 <Field PRTokeniser tokens>
	//* 154  359:invokevirtual   #1728 <Method boolean PRTokeniser.isHexString()>
	//* 155  362:invokevirtual   #1732 <Method PdfString PdfString.setHexWriting(boolean)>
	//* 156  365:astore          6
	//* 157  367:aload           6
	//* 158  369:aload_0         
	//* 159  370:getfield        #1631 <Field int objNum>
	//* 160  373:aload_0         
	//* 161  374:getfield        #1635 <Field int objGen>
	//* 162  377:invokevirtual   #1733 <Method void PdfString.setObjNum(int, int)>
	//* 163  380:aload_0         
	//* 164  381:getfield        #170 <Field ArrayList strings>
	//* 165  384:ifnull          397
	//* 166  387:aload_0         
	//* 167  388:getfield        #170 <Field ArrayList strings>
	//* 168  391:aload           6
	//* 169  393:invokevirtual   #605 <Method boolean ArrayList.add(Object)>
	//* 170  396:pop             
	//* 171  397:aload           6
	//* 172  399:areturn         
	//* 173  400:getstatic       #1737 <Field Map PdfName.staticNames>
	//* 174  403:aload_0         
	//* 175  404:getfield        #193 <Field PRTokeniser tokens>
	//* 176  407:invokevirtual   #1606 <Method String PRTokeniser.getStringValue()>
	//* 177  410:invokeinterface #617 <Method Object Map.get(Object)>
	//* 178  415:checkcast       #103 <Class PdfName>
	//* 179  418:astore          6
	//* 180  420:aload_0         
	//* 181  421:getfield        #185 <Field int readDepth>
	//* 182  424:ifle            435
	//* 183  427:aload           6
	//* 184  429:ifnull          435
	//* 185  432:aload           6
	//* 186  434:areturn         
	//* 187  435:new             #103 <Class PdfName>
	//* 188  438:dup             
	//* 189  439:aload_0         
	//* 190  440:getfield        #193 <Field PRTokeniser tokens>
	//* 191  443:invokevirtual   #1606 <Method String PRTokeniser.getStringValue()>
	//* 192  446:iconst_0        
	//* 193  447:invokespecial   #1609 <Method void PdfName(String, boolean)>
	//* 194  450:areturn         
	//* 195  451:new             #305 <Class PRIndirectReference>
	//* 196  454:dup             
	//* 197  455:aload_0         
	//* 198  456:aload_0         
	//* 199  457:getfield        #193 <Field PRTokeniser tokens>
	//* 200  460:invokevirtual   #1740 <Method int PRTokeniser.getReference()>
	//* 201  463:aload_0         
	//* 202  464:getfield        #193 <Field PRTokeniser tokens>
	//* 203  467:invokevirtual   #1741 <Method int PRTokeniser.getGeneration()>
	//* 204  470:invokespecial   #736 <Method void PRIndirectReference(PdfReader, int, int)>
	//* 205  473:areturn         
	//* 206  474:new             #143 <Class IOException>
	//* 207  477:dup             
	//* 208  478:ldc2            #1743 <String "unexpected.end.of.file">
	//* 209  481:iconst_0        
	//* 210  482:anewarray       Object[]
	//* 211  485:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//* 212  488:invokespecial   #1744 <Method void IOException(String)>
	//* 213  491:athrow          
					return ((PdfObject) (PdfNull.PDFNULL));
	//  214  492:getstatic       #1748 <Field PdfNull PdfNull.PDFNULL>
	//  215  495:areturn         
			break;

		case 1: // '\001'
			readDepth = readDepth + 1;
			obj = ((Object) (readDictionary()));
			readDepth = readDepth - 1;
			l = tokens.getFilePointer();
			do
				flag = tokens.nextToken();
			while(flag && tokens.getTokenType() == PRTokeniser.TokenType.COMMENT);
			if(flag && tokens.getStringValue().equals("stream"))
			{
				do
					j = tokens.read();
				while(j == 32 || j == 9 || j == 0 || j == 12);
				i = j;
				if(j != 10)
					i = tokens.read();
				if(i != 10)
					tokens.backOnePosition(i);
				obj1 = ((Object) (new PRStream(this, tokens.getFilePointer())));
				((PRStream) (obj1)).putAll(((PdfDictionary) (obj)));
				((PRStream) (obj1)).setObjNum(objNum, objGen);
				return ((PdfObject) (obj1));
			} else
			{
				tokens.seek(l);
				return ((PdfObject) (obj));
			}

		case 2: // '\002'
			readDepth = readDepth + 1;
			obj = ((Object) (readArray()));
			readDepth = readDepth - 1;
			return ((PdfObject) (obj));

		case 3: // '\003'
			return ((PdfObject) (new PdfNumber(tokens.getStringValue())));

		case 4: // '\004'
			obj = ((Object) ((new PdfString(tokens.getStringValue(), ((String) (null)))).setHexWriting(tokens.isHexString())));
			((PdfString) (obj)).setObjNum(objNum, objGen);
			if(strings != null)
				strings.add(obj);
			return ((PdfObject) (obj));

		case 5: // '\005'
			obj = ((Object) ((PdfName)PdfName.staticNames.get(((Object) (tokens.getStringValue())))));
			if(readDepth > 0 && obj != null)
				return ((PdfObject) (obj));
			else
				return ((PdfObject) (new PdfName(tokens.getStringValue(), false)));

		case 6: // '\006'
			return ((PdfObject) (new PRIndirectReference(this, tokens.getReference(), tokens.getGeneration())));

		case 7: // '\007'
			throw new IOException(MessageLocalization.getComposedMessage("unexpected.end.of.file", new Object[0]));
		}
		if("true".equals(obj1))
	//* 216  496:ldc2            #1750 <String "true">
	//* 217  499:aload           7
	//* 218  501:invokevirtual   #872 <Method boolean String.equals(Object)>
	//* 219  504:ifeq            527
			if(readDepth == 0)
	//* 220  507:aload_0         
	//* 221  508:getfield        #185 <Field int readDepth>
	//* 222  511:ifne            523
				return ((PdfObject) (new PdfBoolean(true)));
	//  223  514:new             #831 <Class PdfBoolean>
	//  224  517:dup             
	//  225  518:iconst_1        
	//  226  519:invokespecial   #837 <Method void PdfBoolean(boolean)>
	//  227  522:areturn         
			else
				return ((PdfObject) (PdfBoolean.PDFTRUE));
	//  228  523:getstatic       #1548 <Field PdfBoolean PdfBoolean.PDFTRUE>
	//  229  526:areturn         
		if("false".equals(obj1))
	//* 230  527:ldc2            #1034 <String "false">
	//* 231  530:aload           7
	//* 232  532:invokevirtual   #872 <Method boolean String.equals(Object)>
	//* 233  535:ifeq            558
		{
			if(readDepth == 0)
	//* 234  538:aload_0         
	//* 235  539:getfield        #185 <Field int readDepth>
	//* 236  542:ifne            554
				return ((PdfObject) (new PdfBoolean(false)));
	//  237  545:new             #831 <Class PdfBoolean>
	//  238  548:dup             
	//  239  549:iconst_0        
	//  240  550:invokespecial   #837 <Method void PdfBoolean(boolean)>
	//  241  553:areturn         
			else
				return ((PdfObject) (PdfBoolean.PDFFALSE));
	//  242  554:getstatic       #1753 <Field PdfBoolean PdfBoolean.PDFFALSE>
	//  243  557:areturn         
		} else
		{
			return ((PdfObject) (new PdfLiteral(-((PRTokeniser.TokenType) (obj)).ordinal(), tokens.getStringValue())));
	//  244  558:new             #635 <Class PdfLiteral>
	//  245  561:dup             
	//  246  562:aload           6
	//  247  564:invokevirtual   #1581 <Method int PRTokeniser$TokenType.ordinal()>
	//  248  567:ineg            
	//  249  568:aload_0         
	//  250  569:getfield        #193 <Field PRTokeniser tokens>
	//  251  572:invokevirtual   #1606 <Method String PRTokeniser.getStringValue()>
	//  252  575:invokespecial   #1756 <Method void PdfLiteral(int, String)>
	//  253  578:areturn         
		}
	}

	protected void readPages()
		throws IOException
	{
label0:
		{
			catalog = trailer.getAsDict(PdfName.ROOT);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #279 <Field PdfDictionary trailer>
	//    3    5:getstatic       #284 <Field PdfName PdfName.ROOT>
	//    4    8:invokevirtual   #288 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//    5   11:putfield        #290 <Field PdfDictionary catalog>
			if(catalog == null)
	//*   6   14:aload_0         
	//*   7   15:getfield        #290 <Field PdfDictionary catalog>
	//*   8   18:ifnonnull       39
				throw new InvalidPdfException(MessageLocalization.getComposedMessage("the.document.has.no.catalog.object", new Object[0]));
	//    9   21:new             #983 <Class InvalidPdfException>
	//   10   24:dup             
	//   11   25:ldc2            #1759 <String "the.document.has.no.catalog.object">
	//   12   28:iconst_0        
	//   13   29:anewarray       Object[]
	//   14   32:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   15   35:invokespecial   #986 <Method void InvalidPdfException(String)>
	//   16   38:athrow          
			rootPages = catalog.getAsDict(PdfName.PAGES);
	//   17   39:aload_0         
	//   18   40:aload_0         
	//   19   41:getfield        #290 <Field PdfDictionary catalog>
	//   20   44:getstatic       #293 <Field PdfName PdfName.PAGES>
	//   21   47:invokevirtual   #288 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   22   50:putfield        #295 <Field PdfDictionary rootPages>
			if(rootPages == null || !PdfName.PAGES.equals(((Object) (rootPages.get(PdfName.TYPE)))) && !PdfName.PAGES.equals(((Object) (rootPages.get(new PdfName("Types"))))))
	//*  23   53:aload_0         
	//*  24   54:getfield        #295 <Field PdfDictionary rootPages>
	//*  25   57:ifnull          105
	//*  26   60:getstatic       #293 <Field PdfName PdfName.PAGES>
	//*  27   63:aload_0         
	//*  28   64:getfield        #295 <Field PdfDictionary rootPages>
	//*  29   67:getstatic       #1210 <Field PdfName PdfName.TYPE>
	//*  30   70:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//*  31   73:invokevirtual   #545 <Method boolean PdfName.equals(Object)>
	//*  32   76:ifne            143
	//*  33   79:getstatic       #293 <Field PdfName PdfName.PAGES>
	//*  34   82:aload_0         
	//*  35   83:getfield        #295 <Field PdfDictionary rootPages>
	//*  36   86:new             #103 <Class PdfName>
	//*  37   89:dup             
	//*  38   90:ldc2            #1761 <String "Types">
	//*  39   93:invokespecial   #1255 <Method void PdfName(String)>
	//*  40   96:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//*  41   99:invokevirtual   #545 <Method boolean PdfName.equals(Object)>
	//*  42  102:ifne            143
			{
				if(!debugmode)
					break label0;
	//   43  105:getstatic       #93  <Field boolean debugmode>
	//   44  108:ifeq            157
				if(LOGGER.isLogging(Level.ERROR))
	//*  45  111:getstatic       #101 <Field Logger LOGGER>
	//*  46  114:getstatic       #1645 <Field Level Level.ERROR>
	//*  47  117:invokeinterface #1651 <Method boolean Logger.isLogging(Level)>
	//*  48  122:ifeq            143
					LOGGER.error(MessageLocalization.getComposedMessage("the.document.has.no.page.root", new Object[0]));
	//   49  125:getstatic       #101 <Field Logger LOGGER>
	//   50  128:ldc2            #1763 <String "the.document.has.no.page.root">
	//   51  131:iconst_0        
	//   52  132:anewarray       Object[]
	//   53  135:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   54  138:invokeinterface #1765 <Method void Logger.error(String)>
			}
			pageRefs = new PageRefs(this, ((_cls1) (null)));
	//   55  143:aload_0         
	//   56  144:new             #10  <Class PdfReader$PageRefs>
	//   57  147:dup             
	//   58  148:aload_0         
	//   59  149:aconst_null     
	//   60  150:invokespecial   #1768 <Method void PdfReader$PageRefs(PdfReader, PdfReader$1)>
	//   61  153:putfield        #274 <Field PdfReader$PageRefs pageRefs>
			return;
	//   62  156:return          
		}
		throw new InvalidPdfException(MessageLocalization.getComposedMessage("the.document.has.no.page.root", new Object[0]));
	//   63  157:new             #983 <Class InvalidPdfException>
	//   64  160:dup             
	//   65  161:ldc2            #1763 <String "the.document.has.no.page.root">
	//   66  164:iconst_0        
	//   67  165:anewarray       Object[]
	//   68  168:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   69  171:invokespecial   #986 <Method void InvalidPdfException(String)>
	//   70  174:athrow          
	}

	protected void readPdf()
		throws IOException
	{
		fileLength = tokens.getFile().length();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #193 <Field PRTokeniser tokens>
	//    3    5:invokevirtual   #1690 <Method RandomAccessFileOrArray PRTokeniser.getFile()>
	//    4    8:invokevirtual   #1769 <Method long RandomAccessFileOrArray.length()>
	//    5   11:putfield        #201 <Field long fileLength>
		pdfVersion = tokens.checkPdfHeader();
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #193 <Field PRTokeniser tokens>
	//    9   19:invokevirtual   #1772 <Method char PRTokeniser.checkPdfHeader()>
	//   10   22:putfield        #221 <Field char pdfVersion>
		try
		{
			readXref();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #1775 <Method void readXref()>
		}
	//*  13   29:aload_0         
	//*  14   30:invokevirtual   #1777 <Method void readDocObj()>
	//*  15   33:aload_0         
	//*  16   34:getfield        #170 <Field ArrayList strings>
	//*  17   37:invokevirtual   #1780 <Method void ArrayList.clear()>
	//*  18   40:aload_0         
	//*  19   41:invokevirtual   #1782 <Method void readPages()>
	//*  20   44:aload_0         
	//*  21   45:invokevirtual   #1785 <Method int removeUnusedObjects()>
	//*  22   48:pop             
	//*  23   49:return          
		catch(Exception exception)
	//*  24   50:astore_1        
		{
			try
			{
				rebuilt = true;
	//   25   51:aload_0         
	//   26   52:iconst_1        
	//   27   53:putfield        #153 <Field boolean rebuilt>
				rebuildXref();
	//   28   56:aload_0         
	//   29   57:invokevirtual   #1788 <Method void rebuildXref()>
				lastXref = -1L;
	//   30   60:aload_0         
	//   31   61:ldc2w           #913 <Long -1L>
	//   32   64:putfield        #227 <Field long lastXref>
			}
	//*  33   67:goto            29
			catch(Exception exception2)
	//*  34   70:astore_2        
			{
				throw new InvalidPdfException(MessageLocalization.getComposedMessage("rebuild.failed.1.original.message.2", new Object[] {
					exception2.getMessage(), exception.getMessage()
				}));
	//   35   71:new             #983 <Class InvalidPdfException>
	//   36   74:dup             
	//   37   75:ldc2            #1790 <String "rebuild.failed.1.original.message.2">
	//   38   78:iconst_2        
	//   39   79:anewarray       Object[]
	//   40   82:dup             
	//   41   83:iconst_0        
	//   42   84:aload_2         
	//   43   85:invokevirtual   #1791 <Method String Exception.getMessage()>
	//   44   88:aastore         
	//   45   89:dup             
	//   46   90:iconst_1        
	//   47   91:aload_1         
	//   48   92:invokevirtual   #1791 <Method String Exception.getMessage()>
	//   49   95:aastore         
	//   50   96:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   51   99:invokespecial   #986 <Method void InvalidPdfException(String)>
	//   52  102:athrow          
			}
		}
		try
		{
			readDocObj();
		}
		catch(Exception exception1)
	//*  53  103:astore_1        
		{
			if(exception1 instanceof BadPasswordException)
	//*  54  104:aload_1         
	//*  55  105:instanceof      #1154 <Class BadPasswordException>
	//*  56  108:ifeq            123
				throw new BadPasswordException(exception1.getMessage());
	//   57  111:new             #1154 <Class BadPasswordException>
	//   58  114:dup             
	//   59  115:aload_1         
	//   60  116:invokevirtual   #1791 <Method String Exception.getMessage()>
	//   61  119:invokespecial   #1157 <Method void BadPasswordException(String)>
	//   62  122:athrow          
			if(rebuilt || encryptionError)
	//*  63  123:aload_0         
	//*  64  124:getfield        #153 <Field boolean rebuilt>
	//*  65  127:ifne            137
	//*  66  130:aload_0         
	//*  67  131:getfield        #920 <Field boolean encryptionError>
	//*  68  134:ifeq            149
				throw new InvalidPdfException(exception1.getMessage());
	//   69  137:new             #983 <Class InvalidPdfException>
	//   70  140:dup             
	//   71  141:aload_1         
	//   72  142:invokevirtual   #1791 <Method String Exception.getMessage()>
	//   73  145:invokespecial   #986 <Method void InvalidPdfException(String)>
	//   74  148:athrow          
			rebuilt = true;
	//   75  149:aload_0         
	//   76  150:iconst_1        
	//   77  151:putfield        #153 <Field boolean rebuilt>
			encrypted = false;
	//   78  154:aload_0         
	//   79  155:iconst_0        
	//   80  156:putfield        #151 <Field boolean encrypted>
			try
			{
				rebuildXref();
	//   81  159:aload_0         
	//   82  160:invokevirtual   #1788 <Method void rebuildXref()>
				lastXref = -1L;
	//   83  163:aload_0         
	//   84  164:ldc2w           #913 <Long -1L>
	//   85  167:putfield        #227 <Field long lastXref>
				readDocObj();
	//   86  170:aload_0         
	//   87  171:invokevirtual   #1777 <Method void readDocObj()>
			}
	//*  88  174:goto            33
			catch(Exception exception3)
	//*  89  177:astore_2        
			{
				throw new InvalidPdfException(MessageLocalization.getComposedMessage("rebuild.failed.1.original.message.2", new Object[] {
					exception3.getMessage(), exception1.getMessage()
				}));
	//   90  178:new             #983 <Class InvalidPdfException>
	//   91  181:dup             
	//   92  182:ldc2            #1790 <String "rebuild.failed.1.original.message.2">
	//   93  185:iconst_2        
	//   94  186:anewarray       Object[]
	//   95  189:dup             
	//   96  190:iconst_0        
	//   97  191:aload_2         
	//   98  192:invokevirtual   #1791 <Method String Exception.getMessage()>
	//   99  195:aastore         
	//  100  196:dup             
	//  101  197:iconst_1        
	//  102  198:aload_1         
	//  103  199:invokevirtual   #1791 <Method String Exception.getMessage()>
	//  104  202:aastore         
	//  105  203:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  106  206:invokespecial   #986 <Method void InvalidPdfException(String)>
	//  107  209:athrow          
			}
		}
		strings.clear();
		readPages();
		removeUnusedObjects();
	}

	protected void readPdfPartial()
		throws IOException
	{
		fileLength = tokens.getFile().length();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #193 <Field PRTokeniser tokens>
	//    3    5:invokevirtual   #1690 <Method RandomAccessFileOrArray PRTokeniser.getFile()>
	//    4    8:invokevirtual   #1769 <Method long RandomAccessFileOrArray.length()>
	//    5   11:putfield        #201 <Field long fileLength>
		pdfVersion = tokens.checkPdfHeader();
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #193 <Field PRTokeniser tokens>
	//    9   19:invokevirtual   #1772 <Method char PRTokeniser.checkPdfHeader()>
	//   10   22:putfield        #221 <Field char pdfVersion>
		try
		{
			readXref();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #1775 <Method void readXref()>
		}
	//*  13   29:aload_0         
	//*  14   30:invokevirtual   #1793 <Method void readDocObjPartial()>
	//*  15   33:aload_0         
	//*  16   34:invokevirtual   #1782 <Method void readPages()>
	//*  17   37:return          
		catch(Exception exception)
	//*  18   38:astore_1        
		{
			try
			{
				rebuilt = true;
	//   19   39:aload_0         
	//   20   40:iconst_1        
	//   21   41:putfield        #153 <Field boolean rebuilt>
				rebuildXref();
	//   22   44:aload_0         
	//   23   45:invokevirtual   #1788 <Method void rebuildXref()>
				lastXref = -1L;
	//   24   48:aload_0         
	//   25   49:ldc2w           #913 <Long -1L>
	//   26   52:putfield        #227 <Field long lastXref>
			}
	//*  27   55:goto            29
			catch(Exception exception1)
	//*  28   58:astore_2        
			{
				throw new InvalidPdfException(MessageLocalization.getComposedMessage("rebuild.failed.1.original.message.2", new Object[] {
					exception1.getMessage(), exception.getMessage()
				}), ((Throwable) (exception1)));
	//   29   59:new             #983 <Class InvalidPdfException>
	//   30   62:dup             
	//   31   63:ldc2            #1790 <String "rebuild.failed.1.original.message.2">
	//   32   66:iconst_2        
	//   33   67:anewarray       Object[]
	//   34   70:dup             
	//   35   71:iconst_0        
	//   36   72:aload_2         
	//   37   73:invokevirtual   #1791 <Method String Exception.getMessage()>
	//   38   76:aastore         
	//   39   77:dup             
	//   40   78:iconst_1        
	//   41   79:aload_1         
	//   42   80:invokevirtual   #1791 <Method String Exception.getMessage()>
	//   43   83:aastore         
	//   44   84:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   45   87:aload_2         
	//   46   88:invokespecial   #1796 <Method void InvalidPdfException(String, Throwable)>
	//   47   91:athrow          
			}
		}
		readDocObjPartial();
		readPages();
	}

	protected PdfObject readSingleObject(int i)
		throws IOException
	{
		int k;
		long l;
		strings.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #170 <Field ArrayList strings>
	//    2    4:invokevirtual   #1780 <Method void ArrayList.clear()>
		k = i * 2;
	//    3    7:iload_1         
	//    4    8:iconst_2        
	//    5    9:imul            
	//    6   10:istore_3        
		l = xref[k];
	//    7   11:aload_0         
	//    8   12:getfield        #301 <Field long[] xref>
	//    9   15:iload_3         
	//   10   16:laload          
	//   11   17:lstore          4
		if(l >= 0L) goto _L2; else goto _L1
	//   12   19:lload           4
	//   13   21:lconst_0        
	//   14   22:lcmp            
	//   15   23:ifge            28
_L1:
		return null;
	//   16   26:aconst_null     
	//   17   27:areturn         
_L2:
		if(xref[k + 1] > 0L)
	//*  18   28:aload_0         
	//*  19   29:getfield        #301 <Field long[] xref>
	//*  20   32:iload_3         
	//*  21   33:iconst_1        
	//*  22   34:iadd            
	//*  23   35:laload          
	//*  24   36:lconst_0        
	//*  25   37:lcmp            
	//*  26   38:ifle            58
			l = objStmToOffset.get(xref[k + 1]);
	//   27   41:aload_0         
	//   28   42:getfield        #299 <Field LongHashtable objStmToOffset>
	//   29   45:aload_0         
	//   30   46:getfield        #301 <Field long[] xref>
	//   31   49:iload_3         
	//   32   50:iconst_1        
	//   33   51:iadd            
	//   34   52:laload          
	//   35   53:invokevirtual   #1799 <Method long LongHashtable.get(long)>
	//   36   56:lstore          4
		if(l == 0L) goto _L1; else goto _L3
	//   37   58:lload           4
	//   38   60:lconst_0        
	//   39   61:lcmp            
	//   40   62:ifeq            26
_L3:
		tokens.seek(l);
	//   41   65:aload_0         
	//   42   66:getfield        #193 <Field PRTokeniser tokens>
	//   43   69:lload           4
	//   44   71:invokevirtual   #479 <Method void PRTokeniser.seek(long)>
		tokens.nextValidToken();
	//   45   74:aload_0         
	//   46   75:getfield        #193 <Field PRTokeniser tokens>
	//   47   78:invokevirtual   #1594 <Method void PRTokeniser.nextValidToken()>
		if(tokens.getTokenType() != PRTokeniser.TokenType.NUMBER)
	//*  48   81:aload_0         
	//*  49   82:getfield        #193 <Field PRTokeniser tokens>
	//*  50   85:invokevirtual   #1598 <Method PRTokeniser$TokenType PRTokeniser.getTokenType()>
	//*  51   88:getstatic       #1626 <Field PRTokeniser$TokenType PRTokeniser$TokenType.NUMBER>
	//*  52   91:if_acmpeq       111
			tokens.throwError(MessageLocalization.getComposedMessage("invalid.object.number", new Object[0]));
	//   53   94:aload_0         
	//   54   95:getfield        #193 <Field PRTokeniser tokens>
	//   55   98:ldc2            #1628 <String "invalid.object.number">
	//   56  101:iconst_0        
	//   57  102:anewarray       Object[]
	//   58  105:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   59  108:invokevirtual   #1589 <Method void PRTokeniser.throwError(String)>
		objNum = tokens.intValue();
	//   60  111:aload_0         
	//   61  112:aload_0         
	//   62  113:getfield        #193 <Field PRTokeniser tokens>
	//   63  116:invokevirtual   #1629 <Method int PRTokeniser.intValue()>
	//   64  119:putfield        #1631 <Field int objNum>
		tokens.nextValidToken();
	//   65  122:aload_0         
	//   66  123:getfield        #193 <Field PRTokeniser tokens>
	//   67  126:invokevirtual   #1594 <Method void PRTokeniser.nextValidToken()>
		if(tokens.getTokenType() != PRTokeniser.TokenType.NUMBER)
	//*  68  129:aload_0         
	//*  69  130:getfield        #193 <Field PRTokeniser tokens>
	//*  70  133:invokevirtual   #1598 <Method PRTokeniser$TokenType PRTokeniser.getTokenType()>
	//*  71  136:getstatic       #1626 <Field PRTokeniser$TokenType PRTokeniser$TokenType.NUMBER>
	//*  72  139:if_acmpeq       159
			tokens.throwError(MessageLocalization.getComposedMessage("invalid.generation.number", new Object[0]));
	//   73  142:aload_0         
	//   74  143:getfield        #193 <Field PRTokeniser tokens>
	//   75  146:ldc2            #1633 <String "invalid.generation.number">
	//   76  149:iconst_0        
	//   77  150:anewarray       Object[]
	//   78  153:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   79  156:invokevirtual   #1589 <Method void PRTokeniser.throwError(String)>
		objGen = tokens.intValue();
	//   80  159:aload_0         
	//   81  160:aload_0         
	//   82  161:getfield        #193 <Field PRTokeniser tokens>
	//   83  164:invokevirtual   #1629 <Method int PRTokeniser.intValue()>
	//   84  167:putfield        #1635 <Field int objGen>
		tokens.nextValidToken();
	//   85  170:aload_0         
	//   86  171:getfield        #193 <Field PRTokeniser tokens>
	//   87  174:invokevirtual   #1594 <Method void PRTokeniser.nextValidToken()>
		if(!tokens.getStringValue().equals("obj"))
	//*  88  177:aload_0         
	//*  89  178:getfield        #193 <Field PRTokeniser tokens>
	//*  90  181:invokevirtual   #1606 <Method String PRTokeniser.getStringValue()>
	//*  91  184:ldc2            #1637 <String "obj">
	//*  92  187:invokevirtual   #872 <Method boolean String.equals(Object)>
	//*  93  190:ifne            210
			tokens.throwError(MessageLocalization.getComposedMessage("token.obj.expected", new Object[0]));
	//   94  193:aload_0         
	//   95  194:getfield        #193 <Field PRTokeniser tokens>
	//   96  197:ldc2            #1639 <String "token.obj.expected">
	//   97  200:iconst_0        
	//   98  201:anewarray       Object[]
	//   99  204:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  100  207:invokevirtual   #1589 <Method void PRTokeniser.throwError(String)>
		PdfObject pdfobject = readPRObject();
	//  101  210:aload_0         
	//  102  211:invokevirtual   #1572 <Method PdfObject readPRObject()>
	//  103  214:astore          7
		int j = 0;
	//  104  216:iconst_0        
	//  105  217:istore_2        
_L5:
		if(j >= strings.size())
			break; /* Loop/switch isn't completed */
	//  106  218:iload_2         
	//  107  219:aload_0         
	//  108  220:getfield        #170 <Field ArrayList strings>
	//  109  223:invokevirtual   #258 <Method int ArrayList.size()>
	//  110  226:icmpge          251
		((PdfString)strings.get(j)).decrypt(this);
	//  111  229:aload_0         
	//  112  230:getfield        #170 <Field ArrayList strings>
	//  113  233:iload_2         
	//  114  234:invokevirtual   #262 <Method Object ArrayList.get(int)>
	//  115  237:checkcast       #1015 <Class PdfString>
	//  116  240:aload_0         
	//  117  241:invokevirtual   #1017 <Method void PdfString.decrypt(PdfReader)>
		j++;
	//  118  244:iload_2         
	//  119  245:iconst_1        
	//  120  246:iadd            
	//  121  247:istore_2        
		if(true) goto _L5; else goto _L4
	//  122  248:goto            218
_L4:
		Object obj = ((Object) (pdfobject));
	//  123  251:aload           7
	//  124  253:astore          6
		if(!pdfobject.isStream())
			break MISSING_BLOCK_LABEL_276;
	//  125  255:aload           7
	//  126  257:invokevirtual   #801 <Method boolean PdfObject.isStream()>
	//  127  260:ifeq            276
		checkPRStreamLength((PRStream)pdfobject);
	//  128  263:aload_0         
	//  129  264:aload           7
	//  130  266:checkcast       #453 <Class PRStream>
	//  131  269:invokespecial   #1660 <Method void checkPRStreamLength(PRStream)>
		obj = ((Object) (pdfobject));
	//  132  272:aload           7
	//  133  274:astore          6
_L7:
		PdfObject pdfobject1 = ((PdfObject) (obj));
	//  134  276:aload           6
	//  135  278:astore          7
		if(xref[k + 1] > 0L)
	//* 136  280:aload_0         
	//* 137  281:getfield        #301 <Field long[] xref>
	//* 138  284:iload_3         
	//* 139  285:iconst_1        
	//* 140  286:iadd            
	//* 141  287:laload          
	//* 142  288:lconst_0        
	//* 143  289:lcmp            
	//* 144  290:ifle            311
			pdfobject1 = readOneObjStm((PRStream)obj, (int)xref[k]);
	//  145  293:aload_0         
	//  146  294:aload           6
	//  147  296:checkcast       #453 <Class PRStream>
	//  148  299:aload_0         
	//  149  300:getfield        #301 <Field long[] xref>
	//  150  303:iload_3         
	//  151  304:laload          
	//  152  305:l2i             
	//  153  306:invokevirtual   #1801 <Method PdfObject readOneObjStm(PRStream, int)>
	//  154  309:astore          7
		xrefObj.set(i, ((Object) (pdfobject1)));
	//  155  311:aload_0         
	//  156  312:getfield        #251 <Field ArrayList xrefObj>
	//  157  315:iload_1         
	//  158  316:aload           7
	//  159  318:invokevirtual   #272 <Method Object ArrayList.set(int, Object)>
	//  160  321:pop             
		return pdfobject1;
	//  161  322:aload           7
	//  162  324:areturn         
		IOException ioexception;
		ioexception;
	//  163  325:astore          6
		if(debugmode)
	//* 164  327:getstatic       #93  <Field boolean debugmode>
	//* 165  330:ifeq            368
		{
			if(LOGGER.isLogging(Level.ERROR))
	//* 166  333:getstatic       #101 <Field Logger LOGGER>
	//* 167  336:getstatic       #1645 <Field Level Level.ERROR>
	//* 168  339:invokeinterface #1651 <Method boolean Logger.isLogging(Level)>
	//* 169  344:ifeq            362
				LOGGER.error(ioexception.getMessage(), ((Exception) (ioexception)));
	//  170  347:getstatic       #101 <Field Logger LOGGER>
	//  171  350:aload           6
	//  172  352:invokevirtual   #1654 <Method String IOException.getMessage()>
	//  173  355:aload           6
	//  174  357:invokeinterface #1658 <Method void Logger.error(String, Exception)>
			ioexception = null;
	//  175  362:aconst_null     
	//  176  363:astore          6
		} else
	//* 177  365:goto            276
		{
			throw ioexception;
	//  178  368:aload           6
	//  179  370:athrow          
		}
		if(true) goto _L7; else goto _L6
_L6:
	}

	protected boolean readXRefStream(long l)
		throws IOException
	{
		int i;
		int k1;
		int l2;
		Object obj;
		byte abyte0[];
		int ai[];
		tokens.seek(l);
	//    0    0:aload_0         
	//    1    1:getfield        #193 <Field PRTokeniser tokens>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #479 <Method void PRTokeniser.seek(long)>
		if(!tokens.nextToken())
	//*   4    8:aload_0         
	//*   5    9:getfield        #193 <Field PRTokeniser tokens>
	//*   6   12:invokevirtual   #1693 <Method boolean PRTokeniser.nextToken()>
	//*   7   15:ifne            20
			return false;
	//    8   18:iconst_0        
	//    9   19:ireturn         
		if(tokens.getTokenType() != PRTokeniser.TokenType.NUMBER)
	//*  10   20:aload_0         
	//*  11   21:getfield        #193 <Field PRTokeniser tokens>
	//*  12   24:invokevirtual   #1598 <Method PRTokeniser$TokenType PRTokeniser.getTokenType()>
	//*  13   27:getstatic       #1626 <Field PRTokeniser$TokenType PRTokeniser$TokenType.NUMBER>
	//*  14   30:if_acmpeq       35
			return false;
	//   15   33:iconst_0        
	//   16   34:ireturn         
		l2 = tokens.intValue();
	//   17   35:aload_0         
	//   18   36:getfield        #193 <Field PRTokeniser tokens>
	//   19   39:invokevirtual   #1629 <Method int PRTokeniser.intValue()>
	//   20   42:istore          11
		if(!tokens.nextToken() || tokens.getTokenType() != PRTokeniser.TokenType.NUMBER)
	//*  21   44:aload_0         
	//*  22   45:getfield        #193 <Field PRTokeniser tokens>
	//*  23   48:invokevirtual   #1693 <Method boolean PRTokeniser.nextToken()>
	//*  24   51:ifeq            67
	//*  25   54:aload_0         
	//*  26   55:getfield        #193 <Field PRTokeniser tokens>
	//*  27   58:invokevirtual   #1598 <Method PRTokeniser$TokenType PRTokeniser.getTokenType()>
	//*  28   61:getstatic       #1626 <Field PRTokeniser$TokenType PRTokeniser$TokenType.NUMBER>
	//*  29   64:if_acmpeq       69
			return false;
	//   30   67:iconst_0        
	//   31   68:ireturn         
		if(!tokens.nextToken() || !tokens.getStringValue().equals("obj"))
	//*  32   69:aload_0         
	//*  33   70:getfield        #193 <Field PRTokeniser tokens>
	//*  34   73:invokevirtual   #1693 <Method boolean PRTokeniser.nextToken()>
	//*  35   76:ifeq            95
	//*  36   79:aload_0         
	//*  37   80:getfield        #193 <Field PRTokeniser tokens>
	//*  38   83:invokevirtual   #1606 <Method String PRTokeniser.getStringValue()>
	//*  39   86:ldc2            #1637 <String "obj">
	//*  40   89:invokevirtual   #872 <Method boolean String.equals(Object)>
	//*  41   92:ifne            97
			return false;
	//   42   95:iconst_0        
	//   43   96:ireturn         
		obj = ((Object) (readPRObject()));
	//   44   97:aload_0         
	//   45   98:invokevirtual   #1572 <Method PdfObject readPRObject()>
	//   46  101:astore          14
		PRStream prstream;
		if(((PdfObject) (obj)).isStream())
	//*  47  103:aload           14
	//*  48  105:invokevirtual   #801 <Method boolean PdfObject.isStream()>
	//*  49  108:ifeq            137
		{
			prstream = (PRStream)obj;
	//   50  111:aload           14
	//   51  113:checkcast       #453 <Class PRStream>
	//   52  116:astore          15
			if(!PdfName.XREF.equals(((Object) (prstream.get(PdfName.TYPE)))))
	//*  53  118:getstatic       #1806 <Field PdfName PdfName.XREF>
	//*  54  121:aload           15
	//*  55  123:getstatic       #1210 <Field PdfName PdfName.TYPE>
	//*  56  126:invokevirtual   #462 <Method PdfObject PRStream.get(PdfName)>
	//*  57  129:invokevirtual   #545 <Method boolean PdfName.equals(Object)>
	//*  58  132:ifne            139
				return false;
	//   59  135:iconst_0        
	//   60  136:ireturn         
		} else
		{
			return false;
	//   61  137:iconst_0        
	//   62  138:ireturn         
		}
		if(trailer == null)
	//*  63  139:aload_0         
	//*  64  140:getfield        #279 <Field PdfDictionary trailer>
	//*  65  143:ifnonnull       166
		{
			trailer = new PdfDictionary();
	//   66  146:aload_0         
	//   67  147:new             #281 <Class PdfDictionary>
	//   68  150:dup             
	//   69  151:invokespecial   #1591 <Method void PdfDictionary()>
	//   70  154:putfield        #279 <Field PdfDictionary trailer>
			trailer.putAll(((PdfDictionary) (prstream)));
	//   71  157:aload_0         
	//   72  158:getfield        #279 <Field PdfDictionary trailer>
	//   73  161:aload           15
	//   74  163:invokevirtual   #1807 <Method void PdfDictionary.putAll(PdfDictionary)>
		}
		prstream.setLength(((PdfNumber)prstream.get(PdfName.LENGTH)).intValue());
	//   75  166:aload           15
	//   76  168:aload           15
	//   77  170:getstatic       #459 <Field PdfName PdfName.LENGTH>
	//   78  173:invokevirtual   #462 <Method PdfObject PRStream.get(PdfName)>
	//   79  176:checkcast       #471 <Class PdfNumber>
	//   80  179:invokevirtual   #474 <Method int PdfNumber.intValue()>
	//   81  182:invokevirtual   #493 <Method void PRStream.setLength(int)>
		i = ((PdfNumber)prstream.get(PdfName.SIZE)).intValue();
	//   82  185:aload           15
	//   83  187:getstatic       #1810 <Field PdfName PdfName.SIZE>
	//   84  190:invokevirtual   #462 <Method PdfObject PRStream.get(PdfName)>
	//   85  193:checkcast       #471 <Class PdfNumber>
	//   86  196:invokevirtual   #474 <Method int PdfNumber.intValue()>
	//   87  199:istore_3        
		obj = ((Object) (prstream.get(PdfName.INDEX)));
	//   88  200:aload           15
	//   89  202:getstatic       #1813 <Field PdfName PdfName.INDEX>
	//   90  205:invokevirtual   #462 <Method PdfObject PRStream.get(PdfName)>
	//   91  208:astore          14
		boolean flag;
		PdfObject pdfobject;
		PdfArray pdfarray;
		if(obj == null)
	//*  92  210:aload           14
	//*  93  212:ifnonnull       388
		{
			obj = ((Object) (new PdfArray()));
	//   94  215:new             #558 <Class PdfArray>
	//   95  218:dup             
	//   96  219:invokespecial   #1568 <Method void PdfArray()>
	//   97  222:astore          14
			((PdfArray) (obj)).add(new int[] {
				0, i
			});
	//   98  224:aload           14
	//   99  226:iconst_2        
	//  100  227:newarray        int[]
	//  101  229:dup             
	//  102  230:iconst_0        
	//  103  231:iconst_0        
	//  104  232:iastore         
	//  105  233:dup             
	//  106  234:iconst_1        
	//  107  235:iload_3         
	//  108  236:iastore         
	//  109  237:invokevirtual   #1816 <Method boolean PdfArray.add(int[])>
	//  110  240:pop             
		} else
	//* 111  241:aload           15
	//* 112  243:getstatic       #1819 <Field PdfName PdfName.W>
	//* 113  246:invokevirtual   #462 <Method PdfObject PRStream.get(PdfName)>
	//* 114  249:checkcast       #558 <Class PdfArray>
	//* 115  252:astore          17
	//* 116  254:ldc2w           #913 <Long -1L>
	//* 117  257:lstore_1        
	//* 118  258:aload           15
	//* 119  260:getstatic       #1822 <Field PdfName PdfName.PREV>
	//* 120  263:invokevirtual   #462 <Method PdfObject PRStream.get(PdfName)>
	//* 121  266:astore          16
	//* 122  268:aload           16
	//* 123  270:ifnull          282
	//* 124  273:aload           16
	//* 125  275:checkcast       #471 <Class PdfNumber>
	//* 126  278:invokevirtual   #989 <Method long PdfNumber.longValue()>
	//* 127  281:lstore_1        
	//* 128  282:aload_0         
	//* 129  283:iload_3         
	//* 130  284:iconst_2        
	//* 131  285:imul            
	//* 132  286:invokespecial   #1824 <Method void ensureXrefSize(int)>
	//* 133  289:aload_0         
	//* 134  290:getfield        #1664 <Field HashMap objStmMark>
	//* 135  293:ifnonnull       314
	//* 136  296:aload_0         
	//* 137  297:getfield        #187 <Field boolean partial>
	//* 138  300:ifne            314
	//* 139  303:aload_0         
	//* 140  304:new             #553 <Class HashMap>
	//* 141  307:dup             
	//* 142  308:invokespecial   #1364 <Method void HashMap()>
	//* 143  311:putfield        #1664 <Field HashMap objStmMark>
	//* 144  314:aload_0         
	//* 145  315:getfield        #299 <Field LongHashtable objStmToOffset>
	//* 146  318:ifnonnull       339
	//* 147  321:aload_0         
	//* 148  322:getfield        #187 <Field boolean partial>
	//* 149  325:ifeq            339
	//* 150  328:aload_0         
	//* 151  329:new             #1677 <Class LongHashtable>
	//* 152  332:dup             
	//* 153  333:invokespecial   #1825 <Method void LongHashtable()>
	//* 154  336:putfield        #299 <Field LongHashtable objStmToOffset>
	//* 155  339:aload           15
	//* 156  341:aload_0         
	//* 157  342:getfield        #193 <Field PRTokeniser tokens>
	//* 158  345:invokevirtual   #1690 <Method RandomAccessFileOrArray PRTokeniser.getFile()>
	//* 159  348:invokestatic    #813 <Method byte[] getStreamBytes(PRStream, RandomAccessFileOrArray)>
	//* 160  351:astore          15
	//* 161  353:iconst_0        
	//* 162  354:istore          4
	//* 163  356:iconst_3        
	//* 164  357:newarray        int[]
	//* 165  359:astore          16
	//* 166  361:iconst_0        
	//* 167  362:istore_3        
	//* 168  363:iload_3         
	//* 169  364:iconst_3        
	//* 170  365:icmpge          398
	//* 171  368:aload           16
	//* 172  370:iload_3         
	//* 173  371:aload           17
	//* 174  373:iload_3         
	//* 175  374:invokevirtual   #1828 <Method PdfNumber PdfArray.getAsNumber(int)>
	//* 176  377:invokevirtual   #474 <Method int PdfNumber.intValue()>
	//* 177  380:iastore         
	//* 178  381:iload_3         
	//* 179  382:iconst_1        
	//* 180  383:iadd            
	//* 181  384:istore_3        
	//* 182  385:goto            363
		{
			obj = ((Object) ((PdfArray)obj));
	//  183  388:aload           14
	//  184  390:checkcast       #558 <Class PdfArray>
	//  185  393:astore          14
		}
		pdfarray = (PdfArray)prstream.get(PdfName.W);
		l = -1L;
		pdfobject = prstream.get(PdfName.PREV);
		if(pdfobject != null)
			l = ((PdfNumber)pdfobject).longValue();
		ensureXrefSize(i * 2);
		if(objStmMark == null && !partial)
			objStmMark = new HashMap();
		if(objStmToOffset == null && partial)
			objStmToOffset = new LongHashtable();
		abyte0 = getStreamBytes(prstream, tokens.getFile());
		flag = false;
		ai = new int[3];
		for(i = 0; i < 3; i++)
			ai[i] = pdfarray.getAsNumber(i).intValue();

	//* 186  395:goto            241
		k1 = 0;
	//  187  398:iconst_0        
	//  188  399:istore          6
		i = ((int) (flag));
	//  189  401:iload           4
	//  190  403:istore_3        
_L10:
		int l1;
		int i2;
		if(k1 >= ((PdfArray) (obj)).size())
			break; /* Loop/switch isn't completed */
	//  191  404:iload           6
	//  192  406:aload           14
	//  193  408:invokevirtual   #719 <Method int PdfArray.size()>
	//  194  411:icmpge          835
		i2 = ((PdfArray) (obj)).getAsNumber(k1).intValue();
	//  195  414:aload           14
	//  196  416:iload           6
	//  197  418:invokevirtual   #1828 <Method PdfNumber PdfArray.getAsNumber(int)>
	//  198  421:invokevirtual   #474 <Method int PdfNumber.intValue()>
	//  199  424:istore          8
		l1 = ((PdfArray) (obj)).getAsNumber(k1 + 1).intValue();
	//  200  426:aload           14
	//  201  428:iload           6
	//  202  430:iconst_1        
	//  203  431:iadd            
	//  204  432:invokevirtual   #1828 <Method PdfNumber PdfArray.getAsNumber(int)>
	//  205  435:invokevirtual   #474 <Method int PdfNumber.intValue()>
	//  206  438:istore          7
		ensureXrefSize((i2 + l1) * 2);
	//  207  440:aload_0         
	//  208  441:iload           8
	//  209  443:iload           7
	//  210  445:iadd            
	//  211  446:iconst_2        
	//  212  447:imul            
	//  213  448:invokespecial   #1824 <Method void ensureXrefSize(int)>
_L8:
		int k;
		int j1;
		int j2;
		long l3;
		if(l1 <= 0)
			break MISSING_BLOCK_LABEL_826;
	//  214  451:iload           7
	//  215  453:ifle            826
		j2 = 1;
	//  216  456:iconst_1        
	//  217  457:istore          9
		k = i;
	//  218  459:iload_3         
	//  219  460:istore          4
		if(ai[0] > 0)
	//* 220  462:aload           16
	//* 221  464:iconst_0        
	//* 222  465:iaload          
	//* 223  466:ifle            520
		{
			int i1 = 0;
	//  224  469:iconst_0        
	//  225  470:istore          5
			int k2 = 0;
	//  226  472:iconst_0        
	//  227  473:istore          10
			do
			{
				k = i;
	//  228  475:iload_3         
	//  229  476:istore          4
				j2 = i1;
	//  230  478:iload           5
	//  231  480:istore          9
				if(k2 >= ai[0])
					break;
	//  232  482:iload           10
	//  233  484:aload           16
	//  234  486:iconst_0        
	//  235  487:iaload          
	//  236  488:icmpge          520
				i1 = (i1 << 8) + (abyte0[i] & 0xff);
	//  237  491:iload           5
	//  238  493:bipush          8
	//  239  495:ishl            
	//  240  496:aload           15
	//  241  498:iload_3         
	//  242  499:baload          
	//  243  500:sipush          255
	//  244  503:iand            
	//  245  504:iadd            
	//  246  505:istore          5
				k2++;
	//  247  507:iload           10
	//  248  509:iconst_1        
	//  249  510:iadd            
	//  250  511:istore          10
				i++;
	//  251  513:iload_3         
	//  252  514:iconst_1        
	//  253  515:iadd            
	//  254  516:istore_3        
			} while(true);
	//  255  517:goto            475
		}
		l3 = 0L;
	//  256  520:lconst_0        
	//  257  521:lstore          12
		j1 = 0;
	//  258  523:iconst_0        
	//  259  524:istore          5
		for(i = k; j1 < ai[1]; i++)
	//* 260  526:iload           4
	//* 261  528:istore_3        
	//* 262  529:iload           5
	//* 263  531:aload           16
	//* 264  533:iconst_1        
	//* 265  534:iaload          
	//* 266  535:icmpge          568
		{
			l3 = (l3 << 8) + (long)(abyte0[i] & 0xff);
	//  267  538:lload           12
	//  268  540:bipush          8
	//  269  542:lshl            
	//  270  543:aload           15
	//  271  545:iload_3         
	//  272  546:baload          
	//  273  547:sipush          255
	//  274  550:iand            
	//  275  551:i2l             
	//  276  552:ladd            
	//  277  553:lstore          12
			j1++;
	//  278  555:iload           5
	//  279  557:iconst_1        
	//  280  558:iadd            
	//  281  559:istore          5
		}

	//  282  561:iload_3         
	//  283  562:iconst_1        
	//  284  563:iadd            
	//  285  564:istore_3        
	//* 286  565:goto            529
		k = 0;
	//  287  568:iconst_0        
	//  288  569:istore          4
		for(j1 = 0; j1 < ai[2];)
	//* 289  571:iconst_0        
	//* 290  572:istore          5
	//* 291  574:iload           5
	//* 292  576:aload           16
	//* 293  578:iconst_2        
	//* 294  579:iaload          
	//* 295  580:icmpge          612
		{
			k = (k << 8) + (abyte0[i] & 0xff);
	//  296  583:iload           4
	//  297  585:bipush          8
	//  298  587:ishl            
	//  299  588:aload           15
	//  300  590:iload_3         
	//  301  591:baload          
	//  302  592:sipush          255
	//  303  595:iand            
	//  304  596:iadd            
	//  305  597:istore          4
			j1++;
	//  306  599:iload           5
	//  307  601:iconst_1        
	//  308  602:iadd            
	//  309  603:istore          5
			i++;
	//  310  605:iload_3         
	//  311  606:iconst_1        
	//  312  607:iadd            
	//  313  608:istore_3        
		}

	//* 314  609:goto            574
		j1 = i2 * 2;
	//  315  612:iload           8
	//  316  614:iconst_2        
	//  317  615:imul            
	//  318  616:istore          5
		if(xref[j1] != 0L || xref[j1 + 1] != 0L) goto _L2; else goto _L1
	//  319  618:aload_0         
	//  320  619:getfield        #301 <Field long[] xref>
	//  321  622:iload           5
	//  322  624:laload          
	//  323  625:lconst_0        
	//  324  626:lcmp            
	//  325  627:ifne            672
	//  326  630:aload_0         
	//  327  631:getfield        #301 <Field long[] xref>
	//  328  634:iload           5
	//  329  636:iconst_1        
	//  330  637:iadd            
	//  331  638:laload          
	//  332  639:lconst_0        
	//  333  640:lcmp            
	//  334  641:ifne            672
_L1:
		j2;
	//  335  644:iload           9
		JVM INSTR tableswitch 0 2: default 672
	//	               0 687
	//	               1 700
	//	               2 712;
	//  336  646:tableswitch     0 2: default 672
	//	               0 687
	//	               1 700
	//	               2 712
		   goto _L3 _L4 _L5 _L6
_L6:
		break MISSING_BLOCK_LABEL_712;
_L3:
		break; /* Loop/switch isn't completed */
_L4:
		break; /* Loop/switch isn't completed */
_L2:
		i2++;
	//  337  672:iload           8
	//  338  674:iconst_1        
	//  339  675:iadd            
	//  340  676:istore          8
		l1--;
	//  341  678:iload           7
	//  342  680:iconst_1        
	//  343  681:isub            
	//  344  682:istore          7
		if(true) goto _L8; else goto _L7
	//  345  684:goto            451
_L7:
		xref[j1] = -1L;
	//  346  687:aload_0         
	//  347  688:getfield        #301 <Field long[] xref>
	//  348  691:iload           5
	//  349  693:ldc2w           #913 <Long -1L>
	//  350  696:lastore         
		  goto _L2
	//* 351  697:goto            672
_L5:
		xref[j1] = l3;
	//  352  700:aload_0         
	//  353  701:getfield        #301 <Field long[] xref>
	//  354  704:iload           5
	//  355  706:lload           12
	//  356  708:lastore         
		  goto _L2
	//* 357  709:goto            672
		xref[j1] = k;
	//  358  712:aload_0         
	//  359  713:getfield        #301 <Field long[] xref>
	//  360  716:iload           5
	//  361  718:iload           4
	//  362  720:i2l             
	//  363  721:lastore         
		xref[j1 + 1] = l3;
	//  364  722:aload_0         
	//  365  723:getfield        #301 <Field long[] xref>
	//  366  726:iload           5
	//  367  728:iconst_1        
	//  368  729:iadd            
	//  369  730:lload           12
	//  370  732:lastore         
		if(partial)
	//* 371  733:aload_0         
	//* 372  734:getfield        #187 <Field boolean partial>
	//* 373  737:ifeq            754
		{
			objStmToOffset.put(l3, 0L);
	//  374  740:aload_0         
	//  375  741:getfield        #299 <Field LongHashtable objStmToOffset>
	//  376  744:lload           12
	//  377  746:lconst_0        
	//  378  747:invokevirtual   #1683 <Method long LongHashtable.put(long, long)>
	//  379  750:pop2            
		} else
	//* 380  751:goto            672
		{
			Integer integer = Integer.valueOf((int)l3);
	//  381  754:lload           12
	//  382  756:l2i             
	//  383  757:invokestatic    #1832 <Method Integer Integer.valueOf(int)>
	//  384  760:astore          17
			IntHashtable inthashtable = (IntHashtable)objStmMark.get(((Object) (integer)));
	//  385  762:aload_0         
	//  386  763:getfield        #1664 <Field HashMap objStmMark>
	//  387  766:aload           17
	//  388  768:invokevirtual   #556 <Method Object HashMap.get(Object)>
	//  389  771:checkcast       #1265 <Class IntHashtable>
	//  390  774:astore          18
			if(inthashtable == null)
	//* 391  776:aload           18
	//* 392  778:ifnonnull       814
			{
				inthashtable = new IntHashtable();
	//  393  781:new             #1265 <Class IntHashtable>
	//  394  784:dup             
	//  395  785:invokespecial   #1266 <Method void IntHashtable()>
	//  396  788:astore          18
				inthashtable.put(k, 1);
	//  397  790:aload           18
	//  398  792:iload           4
	//  399  794:iconst_1        
	//  400  795:invokevirtual   #1275 <Method int IntHashtable.put(int, int)>
	//  401  798:pop             
				objStmMark.put(((Object) (integer)), ((Object) (inthashtable)));
	//  402  799:aload_0         
	//  403  800:getfield        #1664 <Field HashMap objStmMark>
	//  404  803:aload           17
	//  405  805:aload           18
	//  406  807:invokevirtual   #1371 <Method Object HashMap.put(Object, Object)>
	//  407  810:pop             
			} else
	//* 408  811:goto            672
			{
				inthashtable.put(k, 1);
	//  409  814:aload           18
	//  410  816:iload           4
	//  411  818:iconst_1        
	//  412  819:invokevirtual   #1275 <Method int IntHashtable.put(int, int)>
	//  413  822:pop             
			}
		}
		  goto _L2
	//* 414  823:goto            672
		k1 += 2;
	//  415  826:iload           6
	//  416  828:iconst_2        
	//  417  829:iadd            
	//  418  830:istore          6
		if(true) goto _L10; else goto _L9
	//  419  832:goto            404
_L9:
		int j = l2 * 2;
	//  420  835:iload           11
	//  421  837:iconst_2        
	//  422  838:imul            
	//  423  839:istore_3        
		if(j + 1 < xref.length && xref[j] == 0L && xref[j + 1] == 0L)
	//* 424  840:iload_3         
	//* 425  841:iconst_1        
	//* 426  842:iadd            
	//* 427  843:aload_0         
	//* 428  844:getfield        #301 <Field long[] xref>
	//* 429  847:arraylength     
	//* 430  848:icmpge          884
	//* 431  851:aload_0         
	//* 432  852:getfield        #301 <Field long[] xref>
	//* 433  855:iload_3         
	//* 434  856:laload          
	//* 435  857:lconst_0        
	//* 436  858:lcmp            
	//* 437  859:ifne            884
	//* 438  862:aload_0         
	//* 439  863:getfield        #301 <Field long[] xref>
	//* 440  866:iload_3         
	//* 441  867:iconst_1        
	//* 442  868:iadd            
	//* 443  869:laload          
	//* 444  870:lconst_0        
	//* 445  871:lcmp            
	//* 446  872:ifne            884
			xref[j] = -1L;
	//  447  875:aload_0         
	//  448  876:getfield        #301 <Field long[] xref>
	//  449  879:iload_3         
	//  450  880:ldc2w           #913 <Long -1L>
	//  451  883:lastore         
		if(l == -1L)
	//* 452  884:lload_1         
	//* 453  885:ldc2w           #913 <Long -1L>
	//* 454  888:lcmp            
	//* 455  889:ifne            894
			return true;
	//  456  892:iconst_1        
	//  457  893:ireturn         
		else
			return readXRefStream(l);
	//  458  894:aload_0         
	//  459  895:lload_1         
	//  460  896:invokevirtual   #1834 <Method boolean readXRefStream(long)>
	//  461  899:ireturn         
	}

	protected void readXref()
		throws IOException
	{
		long l;
		hybridXref = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #297 <Field boolean hybridXref>
		newXrefType = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #229 <Field boolean newXrefType>
		tokens.seek(tokens.getStartxref());
	//    6   10:aload_0         
	//    7   11:getfield        #193 <Field PRTokeniser tokens>
	//    8   14:aload_0         
	//    9   15:getfield        #193 <Field PRTokeniser tokens>
	//   10   18:invokevirtual   #1837 <Method long PRTokeniser.getStartxref()>
	//   11   21:invokevirtual   #479 <Method void PRTokeniser.seek(long)>
		tokens.nextToken();
	//   12   24:aload_0         
	//   13   25:getfield        #193 <Field PRTokeniser tokens>
	//   14   28:invokevirtual   #1693 <Method boolean PRTokeniser.nextToken()>
	//   15   31:pop             
		if(!tokens.getStringValue().equals("startxref"))
	//*  16   32:aload_0         
	//*  17   33:getfield        #193 <Field PRTokeniser tokens>
	//*  18   36:invokevirtual   #1606 <Method String PRTokeniser.getStringValue()>
	//*  19   39:ldc2            #1839 <String "startxref">
	//*  20   42:invokevirtual   #872 <Method boolean String.equals(Object)>
	//*  21   45:ifne            66
			throw new InvalidPdfException(MessageLocalization.getComposedMessage("startxref.not.found", new Object[0]));
	//   22   48:new             #983 <Class InvalidPdfException>
	//   23   51:dup             
	//   24   52:ldc2            #1841 <String "startxref.not.found">
	//   25   55:iconst_0        
	//   26   56:anewarray       Object[]
	//   27   59:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   28   62:invokespecial   #986 <Method void InvalidPdfException(String)>
	//   29   65:athrow          
		tokens.nextToken();
	//   30   66:aload_0         
	//   31   67:getfield        #193 <Field PRTokeniser tokens>
	//   32   70:invokevirtual   #1693 <Method boolean PRTokeniser.nextToken()>
	//   33   73:pop             
		if(tokens.getTokenType() != PRTokeniser.TokenType.NUMBER)
	//*  34   74:aload_0         
	//*  35   75:getfield        #193 <Field PRTokeniser tokens>
	//*  36   78:invokevirtual   #1598 <Method PRTokeniser$TokenType PRTokeniser.getTokenType()>
	//*  37   81:getstatic       #1626 <Field PRTokeniser$TokenType PRTokeniser$TokenType.NUMBER>
	//*  38   84:if_acmpeq       105
			throw new InvalidPdfException(MessageLocalization.getComposedMessage("startxref.is.not.followed.by.a.number", new Object[0]));
	//   39   87:new             #983 <Class InvalidPdfException>
	//   40   90:dup             
	//   41   91:ldc2            #1843 <String "startxref.is.not.followed.by.a.number">
	//   42   94:iconst_0        
	//   43   95:anewarray       Object[]
	//   44   98:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   45  101:invokespecial   #986 <Method void InvalidPdfException(String)>
	//   46  104:athrow          
		l = tokens.longValue();
	//   47  105:aload_0         
	//   48  106:getfield        #193 <Field PRTokeniser tokens>
	//   49  109:invokevirtual   #1844 <Method long PRTokeniser.longValue()>
	//   50  112:lstore_1        
		lastXref = l;
	//   51  113:aload_0         
	//   52  114:lload_1         
	//   53  115:putfield        #227 <Field long lastXref>
		eofPos = tokens.getFilePointer();
	//   54  118:aload_0         
	//   55  119:aload_0         
	//   56  120:getfield        #193 <Field PRTokeniser tokens>
	//   57  123:invokevirtual   #482 <Method long PRTokeniser.getFilePointer()>
	//   58  126:putfield        #223 <Field long eofPos>
		if(!readXRefStream(l)) goto _L2; else goto _L1
	//   59  129:aload_0         
	//   60  130:lload_1         
	//   61  131:invokevirtual   #1834 <Method boolean readXRefStream(long)>
	//   62  134:ifeq            144
_L1:
		newXrefType = true;
	//   63  137:aload_0         
	//   64  138:iconst_1        
	//   65  139:putfield        #229 <Field boolean newXrefType>
_L4:
		return;
	//   66  142:return          
		Exception exception;
		exception;
	//   67  143:astore_3        
_L2:
		xref = null;
	//   68  144:aload_0         
	//   69  145:aconst_null     
	//   70  146:putfield        #301 <Field long[] xref>
		tokens.seek(l);
	//   71  149:aload_0         
	//   72  150:getfield        #193 <Field PRTokeniser tokens>
	//   73  153:lload_1         
	//   74  154:invokevirtual   #479 <Method void PRTokeniser.seek(long)>
		trailer = readXrefSection();
	//   75  157:aload_0         
	//   76  158:aload_0         
	//   77  159:invokevirtual   #1847 <Method PdfDictionary readXrefSection()>
	//   78  162:putfield        #279 <Field PdfDictionary trailer>
		Object obj = ((Object) (trailer));
	//   79  165:aload_0         
	//   80  166:getfield        #279 <Field PdfDictionary trailer>
	//   81  169:astore_3        
		do
		{
			obj = ((Object) ((PdfNumber)((PdfDictionary) (obj)).get(PdfName.PREV)));
	//   82  170:aload_3         
	//   83  171:getstatic       #1822 <Field PdfName PdfName.PREV>
	//   84  174:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   85  177:checkcast       #471 <Class PdfNumber>
	//   86  180:astore_3        
			if(obj == null)
				continue;
	//   87  181:aload_3         
	//   88  182:ifnull          142
			if(((PdfNumber) (obj)).longValue() == l)
	//*  89  185:aload_3         
	//*  90  186:invokevirtual   #989 <Method long PdfNumber.longValue()>
	//*  91  189:lload_1         
	//*  92  190:lcmp            
	//*  93  191:ifne            212
				throw new InvalidPdfException(MessageLocalization.getComposedMessage("trailer.prev.entry.points.to.its.own.cross.reference.section", new Object[0]));
	//   94  194:new             #983 <Class InvalidPdfException>
	//   95  197:dup             
	//   96  198:ldc2            #1849 <String "trailer.prev.entry.points.to.its.own.cross.reference.section">
	//   97  201:iconst_0        
	//   98  202:anewarray       Object[]
	//   99  205:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  100  208:invokespecial   #986 <Method void InvalidPdfException(String)>
	//  101  211:athrow          
			l = ((PdfNumber) (obj)).longValue();
	//  102  212:aload_3         
	//  103  213:invokevirtual   #989 <Method long PdfNumber.longValue()>
	//  104  216:lstore_1        
			tokens.seek(l);
	//  105  217:aload_0         
	//  106  218:getfield        #193 <Field PRTokeniser tokens>
	//  107  221:lload_1         
	//  108  222:invokevirtual   #479 <Method void PRTokeniser.seek(long)>
			obj = ((Object) (readXrefSection()));
	//  109  225:aload_0         
	//  110  226:invokevirtual   #1847 <Method PdfDictionary readXrefSection()>
	//  111  229:astore_3        
		} while(true);
	//  112  230:goto            170
		if(true) goto _L4; else goto _L3
_L3:
	}

	protected PdfDictionary readXrefSection()
		throws IOException
	{
		tokens.nextValidToken();
	//    0    0:aload_0         
	//    1    1:getfield        #193 <Field PRTokeniser tokens>
	//    2    4:invokevirtual   #1594 <Method void PRTokeniser.nextValidToken()>
		if(!tokens.getStringValue().equals("xref"))
	//*   3    7:aload_0         
	//*   4    8:getfield        #193 <Field PRTokeniser tokens>
	//*   5   11:invokevirtual   #1606 <Method String PRTokeniser.getStringValue()>
	//*   6   14:ldc2            #1850 <String "xref">
	//*   7   17:invokevirtual   #872 <Method boolean String.equals(Object)>
	//*   8   20:ifne            40
			tokens.throwError(MessageLocalization.getComposedMessage("xref.subsection.not.found", new Object[0]));
	//    9   23:aload_0         
	//   10   24:getfield        #193 <Field PRTokeniser tokens>
	//   11   27:ldc2            #1852 <String "xref.subsection.not.found">
	//   12   30:iconst_0        
	//   13   31:anewarray       Object[]
	//   14   34:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   15   37:invokevirtual   #1589 <Method void PRTokeniser.throwError(String)>
		do
		{
			tokens.nextValidToken();
	//   16   40:aload_0         
	//   17   41:getfield        #193 <Field PRTokeniser tokens>
	//   18   44:invokevirtual   #1594 <Method void PRTokeniser.nextValidToken()>
			if(tokens.getStringValue().equals("trailer"))
	//*  19   47:aload_0         
	//*  20   48:getfield        #193 <Field PRTokeniser tokens>
	//*  21   51:invokevirtual   #1606 <Method String PRTokeniser.getStringValue()>
	//*  22   54:ldc2            #1853 <String "trailer">
	//*  23   57:invokevirtual   #872 <Method boolean String.equals(Object)>
	//*  24   60:ifeq            146
			{
				PdfDictionary pdfdictionary = (PdfDictionary)readPRObject();
	//   25   63:aload_0         
	//   26   64:invokevirtual   #1572 <Method PdfObject readPRObject()>
	//   27   67:checkcast       #281 <Class PdfDictionary>
	//   28   70:astore          10
				ensureXrefSize(((PdfNumber)pdfdictionary.get(PdfName.SIZE)).intValue() * 2);
	//   29   72:aload_0         
	//   30   73:aload           10
	//   31   75:getstatic       #1810 <Field PdfName PdfName.SIZE>
	//   32   78:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   33   81:checkcast       #471 <Class PdfNumber>
	//   34   84:invokevirtual   #474 <Method int PdfNumber.intValue()>
	//   35   87:iconst_2        
	//   36   88:imul            
	//   37   89:invokespecial   #1824 <Method void ensureXrefSize(int)>
				PdfObject pdfobject = pdfdictionary.get(PdfName.XREFSTM);
	//   38   92:aload           10
	//   39   94:getstatic       #1856 <Field PdfName PdfName.XREFSTM>
	//   40   97:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   41  100:astore          11
				if(pdfobject != null && pdfobject.isNumber())
	//*  42  102:aload           11
	//*  43  104:ifnull          143
	//*  44  107:aload           11
	//*  45  109:invokevirtual   #663 <Method boolean PdfObject.isNumber()>
	//*  46  112:ifeq            143
				{
					long l1 = ((PdfNumber)pdfobject).intValue();
	//   47  115:aload           11
	//   48  117:checkcast       #471 <Class PdfNumber>
	//   49  120:invokevirtual   #474 <Method int PdfNumber.intValue()>
	//   50  123:i2l             
	//   51  124:lstore          6
					int i;
					int j;
					int k;
					int l;
					int i1;
					long l2;
					try
					{
						readXRefStream(l1);
	//   52  126:aload_0         
	//   53  127:lload           6
	//   54  129:invokevirtual   #1834 <Method boolean readXRefStream(long)>
	//   55  132:pop             
						newXrefType = true;
	//   56  133:aload_0         
	//   57  134:iconst_1        
	//   58  135:putfield        #229 <Field boolean newXrefType>
						hybridXref = true;
	//   59  138:aload_0         
	//   60  139:iconst_1        
	//   61  140:putfield        #297 <Field boolean hybridXref>
					}
	//*  62  143:aload           10
	//*  63  145:areturn         
	//*  64  146:aload_0         
	//*  65  147:getfield        #193 <Field PRTokeniser tokens>
	//*  66  150:invokevirtual   #1598 <Method PRTokeniser$TokenType PRTokeniser.getTokenType()>
	//*  67  153:getstatic       #1626 <Field PRTokeniser$TokenType PRTokeniser$TokenType.NUMBER>
	//*  68  156:if_acmpeq       176
	//*  69  159:aload_0         
	//*  70  160:getfield        #193 <Field PRTokeniser tokens>
	//*  71  163:ldc2            #1858 <String "object.number.of.the.first.object.in.this.xref.subsection.not.found">
	//*  72  166:iconst_0        
	//*  73  167:anewarray       Object[]
	//*  74  170:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//*  75  173:invokevirtual   #1589 <Method void PRTokeniser.throwError(String)>
	//*  76  176:aload_0         
	//*  77  177:getfield        #193 <Field PRTokeniser tokens>
	//*  78  180:invokevirtual   #1629 <Method int PRTokeniser.intValue()>
	//*  79  183:istore          4
	//*  80  185:aload_0         
	//*  81  186:getfield        #193 <Field PRTokeniser tokens>
	//*  82  189:invokevirtual   #1594 <Method void PRTokeniser.nextValidToken()>
	//*  83  192:aload_0         
	//*  84  193:getfield        #193 <Field PRTokeniser tokens>
	//*  85  196:invokevirtual   #1598 <Method PRTokeniser$TokenType PRTokeniser.getTokenType()>
	//*  86  199:getstatic       #1626 <Field PRTokeniser$TokenType PRTokeniser$TokenType.NUMBER>
	//*  87  202:if_acmpeq       222
	//*  88  205:aload_0         
	//*  89  206:getfield        #193 <Field PRTokeniser tokens>
	//*  90  209:ldc2            #1860 <String "number.of.entries.in.this.xref.subsection.not.found">
	//*  91  212:iconst_0        
	//*  92  213:anewarray       Object[]
	//*  93  216:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//*  94  219:invokevirtual   #1589 <Method void PRTokeniser.throwError(String)>
	//*  95  222:aload_0         
	//*  96  223:getfield        #193 <Field PRTokeniser tokens>
	//*  97  226:invokevirtual   #1629 <Method int PRTokeniser.intValue()>
	//*  98  229:iload           4
	//*  99  231:iadd            
	//* 100  232:istore_3        
	//* 101  233:iload_3         
	//* 102  234:istore_1        
	//* 103  235:iload           4
	//* 104  237:istore_2        
	//* 105  238:iload           4
	//* 106  240:iconst_1        
	//* 107  241:icmpne          328
	//* 108  244:aload_0         
	//* 109  245:getfield        #193 <Field PRTokeniser tokens>
	//* 110  248:invokevirtual   #482 <Method long PRTokeniser.getFilePointer()>
	//* 111  251:lstore          6
	//* 112  253:aload_0         
	//* 113  254:getfield        #193 <Field PRTokeniser tokens>
	//* 114  257:invokevirtual   #1594 <Method void PRTokeniser.nextValidToken()>
	//* 115  260:aload_0         
	//* 116  261:getfield        #193 <Field PRTokeniser tokens>
	//* 117  264:invokevirtual   #1844 <Method long PRTokeniser.longValue()>
	//* 118  267:lstore          8
	//* 119  269:aload_0         
	//* 120  270:getfield        #193 <Field PRTokeniser tokens>
	//* 121  273:invokevirtual   #1594 <Method void PRTokeniser.nextValidToken()>
	//* 122  276:aload_0         
	//* 123  277:getfield        #193 <Field PRTokeniser tokens>
	//* 124  280:invokevirtual   #1629 <Method int PRTokeniser.intValue()>
	//* 125  283:istore          5
	//* 126  285:iload_3         
	//* 127  286:istore_1        
	//* 128  287:iload           4
	//* 129  289:istore_2        
	//* 130  290:lload           8
	//* 131  292:lconst_0        
	//* 132  293:lcmp            
	//* 133  294:ifne            319
	//* 134  297:iload_3         
	//* 135  298:istore_1        
	//* 136  299:iload           4
	//* 137  301:istore_2        
	//* 138  302:iload           5
	//* 139  304:ldc2            #1861 <Int 65535>
	//* 140  307:icmpne          319
	//* 141  310:iload           4
	//* 142  312:iconst_1        
	//* 143  313:isub            
	//* 144  314:istore_2        
	//* 145  315:iload_3         
	//* 146  316:iconst_1        
	//* 147  317:isub            
	//* 148  318:istore_1        
	//* 149  319:aload_0         
	//* 150  320:getfield        #193 <Field PRTokeniser tokens>
	//* 151  323:lload           6
	//* 152  325:invokevirtual   #479 <Method void PRTokeniser.seek(long)>
	//* 153  328:aload_0         
	//* 154  329:iload_1         
	//* 155  330:iconst_2        
	//* 156  331:imul            
	//* 157  332:invokespecial   #1824 <Method void ensureXrefSize(int)>
	//* 158  335:iload_2         
	//* 159  336:iload_1         
	//* 160  337:icmpge          40
	//* 161  340:aload_0         
	//* 162  341:getfield        #193 <Field PRTokeniser tokens>
	//* 163  344:invokevirtual   #1594 <Method void PRTokeniser.nextValidToken()>
	//* 164  347:aload_0         
	//* 165  348:getfield        #193 <Field PRTokeniser tokens>
	//* 166  351:invokevirtual   #1844 <Method long PRTokeniser.longValue()>
	//* 167  354:lstore          6
	//* 168  356:aload_0         
	//* 169  357:getfield        #193 <Field PRTokeniser tokens>
	//* 170  360:invokevirtual   #1594 <Method void PRTokeniser.nextValidToken()>
	//* 171  363:aload_0         
	//* 172  364:getfield        #193 <Field PRTokeniser tokens>
	//* 173  367:invokevirtual   #1629 <Method int PRTokeniser.intValue()>
	//* 174  370:pop             
	//* 175  371:aload_0         
	//* 176  372:getfield        #193 <Field PRTokeniser tokens>
	//* 177  375:invokevirtual   #1594 <Method void PRTokeniser.nextValidToken()>
	//* 178  378:iload_2         
	//* 179  379:iconst_2        
	//* 180  380:imul            
	//* 181  381:istore_3        
	//* 182  382:aload_0         
	//* 183  383:getfield        #193 <Field PRTokeniser tokens>
	//* 184  386:invokevirtual   #1606 <Method String PRTokeniser.getStringValue()>
	//* 185  389:ldc2            #1863 <String "n">
	//* 186  392:invokevirtual   #872 <Method boolean String.equals(Object)>
	//* 187  395:ifeq            437
	//* 188  398:aload_0         
	//* 189  399:getfield        #301 <Field long[] xref>
	//* 190  402:iload_3         
	//* 191  403:laload          
	//* 192  404:lconst_0        
	//* 193  405:lcmp            
	//* 194  406:ifne            430
	//* 195  409:aload_0         
	//* 196  410:getfield        #301 <Field long[] xref>
	//* 197  413:iload_3         
	//* 198  414:iconst_1        
	//* 199  415:iadd            
	//* 200  416:laload          
	//* 201  417:lconst_0        
	//* 202  418:lcmp            
	//* 203  419:ifne            430
	//* 204  422:aload_0         
	//* 205  423:getfield        #301 <Field long[] xref>
	//* 206  426:iload_3         
	//* 207  427:lload           6
	//* 208  429:lastore         
	//* 209  430:iload_2         
	//* 210  431:iconst_1        
	//* 211  432:iadd            
	//* 212  433:istore_2        
	//* 213  434:goto            335
	//* 214  437:aload_0         
	//* 215  438:getfield        #193 <Field PRTokeniser tokens>
	//* 216  441:invokevirtual   #1606 <Method String PRTokeniser.getStringValue()>
	//* 217  444:ldc2            #1865 <String "f">
	//* 218  447:invokevirtual   #872 <Method boolean String.equals(Object)>
	//* 219  450:ifeq            489
	//* 220  453:aload_0         
	//* 221  454:getfield        #301 <Field long[] xref>
	//* 222  457:iload_3         
	//* 223  458:laload          
	//* 224  459:lconst_0        
	//* 225  460:lcmp            
	//* 226  461:ifne            430
	//* 227  464:aload_0         
	//* 228  465:getfield        #301 <Field long[] xref>
	//* 229  468:iload_3         
	//* 230  469:iconst_1        
	//* 231  470:iadd            
	//* 232  471:laload          
	//* 233  472:lconst_0        
	//* 234  473:lcmp            
	//* 235  474:ifne            430
	//* 236  477:aload_0         
	//* 237  478:getfield        #301 <Field long[] xref>
	//* 238  481:iload_3         
	//* 239  482:ldc2w           #913 <Long -1L>
	//* 240  485:lastore         
	//* 241  486:goto            430
	//* 242  489:aload_0         
	//* 243  490:getfield        #193 <Field PRTokeniser tokens>
	//* 244  493:ldc2            #1867 <String "invalid.cross.reference.entry.in.this.xref.subsection">
	//* 245  496:iconst_0        
	//* 246  497:anewarray       Object[]
	//* 247  500:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//* 248  503:invokevirtual   #1589 <Method void PRTokeniser.throwError(String)>
	//* 249  506:goto            430
					catch(IOException ioexception)
	//* 250  509:astore          10
					{
						xref = null;
	//  251  511:aload_0         
	//  252  512:aconst_null     
	//  253  513:putfield        #301 <Field long[] xref>
						throw ioexception;
	//  254  516:aload           10
	//  255  518:athrow          
					}
				}
				return pdfdictionary;
			}
			if(tokens.getTokenType() != PRTokeniser.TokenType.NUMBER)
				tokens.throwError(MessageLocalization.getComposedMessage("object.number.of.the.first.object.in.this.xref.subsection.not.found", new Object[0]));
			l = tokens.intValue();
			tokens.nextValidToken();
			if(tokens.getTokenType() != PRTokeniser.TokenType.NUMBER)
				tokens.throwError(MessageLocalization.getComposedMessage("number.of.entries.in.this.xref.subsection.not.found", new Object[0]));
			k = tokens.intValue() + l;
			i = k;
			j = l;
			if(l == 1)
			{
				l1 = tokens.getFilePointer();
				tokens.nextValidToken();
				l2 = tokens.longValue();
				tokens.nextValidToken();
				i1 = tokens.intValue();
				i = k;
				j = l;
				if(l2 == 0L)
				{
					i = k;
					j = l;
					if(i1 == 65535)
					{
						j = l - 1;
						i = k - 1;
					}
				}
				tokens.seek(l1);
			}
			ensureXrefSize(i * 2);
			while(j < i) 
			{
				tokens.nextValidToken();
				l1 = tokens.longValue();
				tokens.nextValidToken();
				tokens.intValue();
				tokens.nextValidToken();
				k = j * 2;
				if(tokens.getStringValue().equals("n"))
				{
					if(xref[k] == 0L && xref[k + 1] == 0L)
						xref[k] = l1;
				} else
				if(tokens.getStringValue().equals("f"))
				{
					if(xref[k] == 0L && xref[k + 1] == 0L)
						xref[k] = -1L;
				} else
				{
					tokens.throwError(MessageLocalization.getComposedMessage("invalid.cross.reference.entry.in.this.xref.subsection", new Object[0]));
				}
				j++;
			}
		} while(true);
	}

	protected void rebuildXref()
		throws IOException
	{
		long l;
		long al[][];
		byte abyte0[];
		hybridXref = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #297 <Field boolean hybridXref>
		newXrefType = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #229 <Field boolean newXrefType>
		tokens.seek(0L);
	//    6   10:aload_0         
	//    7   11:getfield        #193 <Field PRTokeniser tokens>
	//    8   14:lconst_0        
	//    9   15:invokevirtual   #479 <Method void PRTokeniser.seek(long)>
		al = new long[1024][];
	//   10   18:sipush          1024
	//   11   21:anewarray       long[][]
	//   12   24:astore          12
		l = 0L;
	//   13   26:lconst_0        
	//   14   27:lstore_2        
		trailer = null;
	//   15   28:aload_0         
	//   16   29:aconst_null     
	//   17   30:putfield        #279 <Field PdfDictionary trailer>
		abyte0 = new byte[64];
	//   18   33:bipush          64
	//   19   35:newarray        byte[]
	//   20   37:astore          14
_L2:
		long l1;
		long l3;
		l3 = tokens.getFilePointer();
	//   21   39:aload_0         
	//   22   40:getfield        #193 <Field PRTokeniser tokens>
	//   23   43:invokevirtual   #482 <Method long PRTokeniser.getFilePointer()>
	//   24   46:lstore          6
		if(!tokens.readLineSegment(abyte0, true))
	//*  25   48:aload_0         
	//*  26   49:getfield        #193 <Field PRTokeniser tokens>
	//*  27   52:aload           14
	//*  28   54:iconst_1        
	//*  29   55:invokevirtual   #486 <Method boolean PRTokeniser.readLineSegment(byte[], boolean)>
	//*  30   58:ifne            86
		{
			if(trailer == null)
	//*  31   61:aload_0         
	//*  32   62:getfield        #279 <Field PdfDictionary trailer>
	//*  33   65:ifnonnull       340
				throw new InvalidPdfException(MessageLocalization.getComposedMessage("trailer.not.found", new Object[0]));
	//   34   68:new             #983 <Class InvalidPdfException>
	//   35   71:dup             
	//   36   72:ldc2            #1870 <String "trailer.not.found">
	//   37   75:iconst_0        
	//   38   76:anewarray       Object[]
	//   39   79:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   40   82:invokespecial   #986 <Method void InvalidPdfException(String)>
	//   41   85:athrow          
			break; /* Loop/switch isn't completed */
		}
		if(abyte0[0] != 116)
			break MISSING_BLOCK_LABEL_191;
	//   42   86:aload           14
	//   43   88:iconst_0        
	//   44   89:baload          
	//   45   90:bipush          116
	//   46   92:icmpne          191
		if(!PdfEncodings.convertToString(abyte0, ((String) (null))).startsWith("trailer"))
			continue; /* Loop/switch isn't completed */
	//   47   95:aload           14
	//   48   97:aconst_null     
	//   49   98:invokestatic    #1423 <Method String PdfEncodings.convertToString(byte[], String)>
	//   50  101:ldc2            #1853 <String "trailer">
	//   51  104:invokevirtual   #505 <Method boolean String.startsWith(String)>
	//   52  107:ifeq            39
		tokens.seek(l3);
	//   53  110:aload_0         
	//   54  111:getfield        #193 <Field PRTokeniser tokens>
	//   55  114:lload           6
	//   56  116:invokevirtual   #479 <Method void PRTokeniser.seek(long)>
		tokens.nextToken();
	//   57  119:aload_0         
	//   58  120:getfield        #193 <Field PRTokeniser tokens>
	//   59  123:invokevirtual   #1693 <Method boolean PRTokeniser.nextToken()>
	//   60  126:pop             
		l1 = tokens.getFilePointer();
	//   61  127:aload_0         
	//   62  128:getfield        #193 <Field PRTokeniser tokens>
	//   63  131:invokevirtual   #482 <Method long PRTokeniser.getFilePointer()>
	//   64  134:lstore          4
		PdfDictionary pdfdictionary = (PdfDictionary)readPRObject();
	//   65  136:aload_0         
	//   66  137:invokevirtual   #1572 <Method PdfObject readPRObject()>
	//   67  140:checkcast       #281 <Class PdfDictionary>
	//   68  143:astore          13
		Exception exception;
		if(pdfdictionary.get(PdfName.ROOT) != null)
	//*  69  145:aload           13
	//*  70  147:getstatic       #284 <Field PdfName PdfName.ROOT>
	//*  71  150:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//*  72  153:ifnull          179
		{
			trailer = pdfdictionary;
	//   73  156:aload_0         
	//   74  157:aload           13
	//   75  159:putfield        #279 <Field PdfDictionary trailer>
			continue; /* Loop/switch isn't completed */
	//   76  162:goto            39
		}
	//*  77  165:astore          13
	//*  78  167:aload_0         
	//*  79  168:getfield        #193 <Field PRTokeniser tokens>
	//*  80  171:lload           4
	//*  81  173:invokevirtual   #479 <Method void PRTokeniser.seek(long)>
	//*  82  176:goto            39
		try
		{
			tokens.seek(l1);
	//   83  179:aload_0         
	//   84  180:getfield        #193 <Field PRTokeniser tokens>
	//   85  183:lload           4
	//   86  185:invokevirtual   #479 <Method void PRTokeniser.seek(long)>
		}
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			tokens.seek(l1);
		}
		continue; /* Loop/switch isn't completed */
	//   87  188:goto            39
		if(abyte0[0] < 48 || abyte0[0] > 57)
			continue; /* Loop/switch isn't completed */
	//   88  191:aload           14
	//   89  193:iconst_0        
	//   90  194:baload          
	//   91  195:bipush          48
	//   92  197:icmplt          39
	//   93  200:aload           14
	//   94  202:iconst_0        
	//   95  203:baload          
	//   96  204:bipush          57
	//   97  206:icmpgt          39
		long al3[] = PRTokeniser.checkObjectStart(abyte0);
	//   98  209:aload           14
	//   99  211:invokestatic    #1874 <Method long[] PRTokeniser.checkObjectStart(byte[])>
	//  100  214:astore          15
		if(al3 == null)
			continue; /* Loop/switch isn't completed */
	//  101  216:aload           15
	//  102  218:ifnull          39
		long l4 = al3[0];
	//  103  221:aload           15
	//  104  223:iconst_0        
	//  105  224:laload          
	//  106  225:lstore          8
		long l5 = al3[1];
	//  107  227:aload           15
	//  108  229:iconst_1        
	//  109  230:laload          
	//  110  231:lstore          10
		long al1[][] = al;
	//  111  233:aload           12
	//  112  235:astore          13
		if(l4 >= (long)al.length)
	//* 113  237:lload           8
	//* 114  239:aload           12
	//* 115  241:arraylength     
	//* 116  242:i2l             
	//* 117  243:lcmp            
	//* 118  244:iflt            270
		{
			al1 = new long[(int)(l4 * 2L)][];
	//  119  247:lload           8
	//  120  249:ldc2w           #487 <Long 2L>
	//  121  252:lmul            
	//  122  253:l2i             
	//  123  254:anewarray       long[][]
	//  124  257:astore          13
			System.arraycopy(((Object) (al)), 0, ((Object) (al1)), 0, (int)l);
	//  125  259:aload           12
	//  126  261:iconst_0        
	//  127  262:aload           13
	//  128  264:iconst_0        
	//  129  265:lload_2         
	//  130  266:l2i             
	//  131  267:invokestatic    #743 <Method void System.arraycopy(Object, int, Object, int, int)>
		}
		long l2 = l;
	//  132  270:lload_2         
	//  133  271:lstore          4
		if(l4 >= l)
	//* 134  273:lload           8
	//* 135  275:lload_2         
	//* 136  276:lcmp            
	//* 137  277:iflt            286
			l2 = l4 + 1L;
	//  138  280:lload           8
	//  139  282:lconst_1        
	//  140  283:ladd            
	//  141  284:lstore          4
		if(al1[(int)l4] != null)
	//* 142  286:aload           13
	//* 143  288:lload           8
	//* 144  290:l2i             
	//* 145  291:aaload          
	//* 146  292:ifnull          316
		{
			al = al1;
	//  147  295:aload           13
	//  148  297:astore          12
			l = l2;
	//  149  299:lload           4
	//  150  301:lstore_2        
			if(l5 < al1[(int)l4][1])
				continue; /* Loop/switch isn't completed */
	//  151  302:lload           10
	//  152  304:aload           13
	//  153  306:lload           8
	//  154  308:l2i             
	//  155  309:aaload          
	//  156  310:iconst_1        
	//  157  311:laload          
	//  158  312:lcmp            
	//  159  313:iflt            39
		}
		al3[0] = l3;
	//  160  316:aload           15
	//  161  318:iconst_0        
	//  162  319:lload           6
	//  163  321:lastore         
		al1[(int)l4] = al3;
	//  164  322:aload           13
	//  165  324:lload           8
	//  166  326:l2i             
	//  167  327:aload           15
	//  168  329:aastore         
		al = al1;
	//  169  330:aload           13
	//  170  332:astore          12
		l = l2;
	//  171  334:lload           4
	//  172  336:lstore_2        
		if(true) goto _L2; else goto _L1
	//  173  337:goto            39
_L1:
		xref = new long[(int)(2L * l)];
	//  174  340:aload_0         
	//  175  341:ldc2w           #487 <Long 2L>
	//  176  344:lload_2         
	//  177  345:lmul            
	//  178  346:l2i             
	//  179  347:newarray        long[]
	//  180  349:putfield        #301 <Field long[] xref>
		for(int i = 0; (long)i < l; i++)
	//* 181  352:iconst_0        
	//* 182  353:istore_1        
	//* 183  354:iload_1         
	//* 184  355:i2l             
	//* 185  356:lload_2         
	//* 186  357:lcmp            
	//* 187  358:ifge            391
		{
			long al2[] = al[i];
	//  188  361:aload           12
	//  189  363:iload_1         
	//  190  364:aaload          
	//  191  365:astore          13
			if(al2 != null)
	//* 192  367:aload           13
	//* 193  369:ifnull          384
				xref[i * 2] = al2[0];
	//  194  372:aload_0         
	//  195  373:getfield        #301 <Field long[] xref>
	//  196  376:iload_1         
	//  197  377:iconst_2        
	//  198  378:imul            
	//  199  379:aload           13
	//  200  381:iconst_0        
	//  201  382:laload          
	//  202  383:lastore         
		}

	//  203  384:iload_1         
	//  204  385:iconst_1        
	//  205  386:iadd            
	//  206  387:istore_1        
	//* 207  388:goto            354
		return;
	//  208  391:return          
	}

	public void releaseLastXrefPartial()
	{
		if(partial && lastXrefPartial != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #187 <Field boolean partial>
	//*   2    4:ifeq            33
	//*   3    7:aload_0         
	//*   4    8:getfield        #178 <Field int lastXrefPartial>
	//*   5   11:iconst_m1       
	//*   6   12:icmpeq          33
		{
			xrefObj.set(lastXrefPartial, ((Object) (null)));
	//    7   15:aload_0         
	//    8   16:getfield        #251 <Field ArrayList xrefObj>
	//    9   19:aload_0         
	//   10   20:getfield        #178 <Field int lastXrefPartial>
	//   11   23:aconst_null     
	//   12   24:invokevirtual   #272 <Method Object ArrayList.set(int, Object)>
	//   13   27:pop             
			lastXrefPartial = -1;
	//   14   28:aload_0         
	//   15   29:iconst_m1       
	//   16   30:putfield        #178 <Field int lastXrefPartial>
		}
	//   17   33:return          
	}

	public void releasePage(int i)
	{
		pageRefs.releasePage(i);
	//    0    0:aload_0         
	//    1    1:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #1201 <Method void PdfReader$PageRefs.releasePage(int)>
	//    4    8:return          
	}

	public void removeAnnotations()
	{
		pageRefs.resetReleasePage();
	//    0    0:aload_0         
	//    1    1:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//    2    4:invokevirtual   #1432 <Method void PdfReader$PageRefs.resetReleasePage()>
		int i = 1;
	//    3    7:iconst_1        
	//    4    8:istore_1        
		while(i <= pageRefs.size()) 
	//*   5    9:iload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//*   8   14:invokevirtual   #1191 <Method int PdfReader$PageRefs.size()>
	//*   9   17:icmpgt          64
		{
			PdfDictionary pdfdictionary = pageRefs.getPageN(i);
	//   10   20:aload_0         
	//   11   21:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//   12   24:iload_1         
	//   13   25:invokevirtual   #1195 <Method PdfDictionary PdfReader$PageRefs.getPageN(int)>
	//   14   28:astore_2        
			if(pdfdictionary.get(PdfName.ANNOTS) == null)
	//*  15   29:aload_2         
	//*  16   30:getstatic       #1198 <Field PdfName PdfName.ANNOTS>
	//*  17   33:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//*  18   36:ifnonnull       54
				pageRefs.releasePage(i);
	//   19   39:aload_0         
	//   20   40:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//   21   43:iload_1         
	//   22   44:invokevirtual   #1201 <Method void PdfReader$PageRefs.releasePage(int)>
			else
	//*  23   47:iload_1         
	//*  24   48:iconst_1        
	//*  25   49:iadd            
	//*  26   50:istore_1        
	//*  27   51:goto            9
				pdfdictionary.remove(PdfName.ANNOTS);
	//   28   54:aload_2         
	//   29   55:getstatic       #1198 <Field PdfName PdfName.ANNOTS>
	//   30   58:invokevirtual   #565 <Method void PdfDictionary.remove(PdfName)>
			i++;
		}
	//*  31   61:goto            47
		catalog.remove(PdfName.ACROFORM);
	//   32   64:aload_0         
	//   33   65:getfield        #290 <Field PdfDictionary catalog>
	//   34   68:getstatic       #1291 <Field PdfName PdfName.ACROFORM>
	//   35   71:invokevirtual   #565 <Method void PdfDictionary.remove(PdfName)>
		pageRefs.resetReleasePage();
	//   36   74:aload_0         
	//   37   75:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//   38   78:invokevirtual   #1432 <Method void PdfReader$PageRefs.resetReleasePage()>
	//   39   81:return          
	}

	public void removeFields()
	{
		pageRefs.resetReleasePage();
	//    0    0:aload_0         
	//    1    1:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//    2    4:invokevirtual   #1432 <Method void PdfReader$PageRefs.resetReleasePage()>
		int j = 1;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		while(j <= pageRefs.size()) 
	//*   5    9:iload_2         
	//*   6   10:aload_0         
	//*   7   11:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//*   8   14:invokevirtual   #1191 <Method int PdfReader$PageRefs.size()>
	//*   9   17:icmpgt          176
		{
			PdfDictionary pdfdictionary = pageRefs.getPageN(j);
	//   10   20:aload_0         
	//   11   21:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//   12   24:iload_2         
	//   13   25:invokevirtual   #1195 <Method PdfDictionary PdfReader$PageRefs.getPageN(int)>
	//   14   28:astore          4
			PdfArray pdfarray = pdfdictionary.getAsArray(PdfName.ANNOTS);
	//   15   30:aload           4
	//   16   32:getstatic       #1198 <Field PdfName PdfName.ANNOTS>
	//   17   35:invokevirtual   #947 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   18   38:astore          5
			if(pdfarray == null)
	//*  19   40:aload           5
	//*  20   42:ifnonnull       60
			{
				pageRefs.releasePage(j);
	//   21   45:aload_0         
	//   22   46:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//   23   49:iload_2         
	//   24   50:invokevirtual   #1201 <Method void PdfReader$PageRefs.releasePage(int)>
			} else
	//*  25   53:iload_2         
	//*  26   54:iconst_1        
	//*  27   55:iadd            
	//*  28   56:istore_2        
	//*  29   57:goto            9
			{
				int i = 0;
	//   30   60:iconst_0        
	//   31   61:istore_1        
				while(i < pdfarray.size()) 
	//*  32   62:iload_1         
	//*  33   63:aload           5
	//*  34   65:invokevirtual   #719 <Method int PdfArray.size()>
	//*  35   68:icmpge          146
				{
					Object obj = ((Object) (getPdfObjectRelease(pdfarray.getPdfObject(i))));
	//   36   71:aload           5
	//   37   73:iload_1         
	//   38   74:invokevirtual   #763 <Method PdfObject PdfArray.getPdfObject(int)>
	//   39   77:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//   40   80:astore          6
					int k = i;
	//   41   82:iload_1         
	//   42   83:istore_3        
					if(obj != null)
	//*  43   84:aload           6
	//*  44   86:ifnull          99
						if(!((PdfObject) (obj)).isDictionary())
	//*  45   89:aload           6
	//*  46   91:invokevirtual   #531 <Method boolean PdfObject.isDictionary()>
	//*  47   94:ifne            106
						{
							k = i;
	//   48   97:iload_1         
	//   49   98:istore_3        
						} else
	//*  50   99:iload_3         
	//*  51  100:iconst_1        
	//*  52  101:iadd            
	//*  53  102:istore_1        
	//*  54  103:goto            62
						{
							obj = ((Object) ((PdfDictionary)obj));
	//   55  106:aload           6
	//   56  108:checkcast       #281 <Class PdfDictionary>
	//   57  111:astore          6
							k = i;
	//   58  113:iload_1         
	//   59  114:istore_3        
							if(PdfName.WIDGET.equals(((Object) (((PdfDictionary) (obj)).get(PdfName.SUBTYPE)))))
	//*  60  115:getstatic       #1879 <Field PdfName PdfName.WIDGET>
	//*  61  118:aload           6
	//*  62  120:getstatic       #1218 <Field PdfName PdfName.SUBTYPE>
	//*  63  123:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//*  64  126:invokevirtual   #545 <Method boolean PdfName.equals(Object)>
	//*  65  129:ifeq            99
							{
								pdfarray.remove(i);
	//   66  132:aload           5
	//   67  134:iload_1         
	//   68  135:invokevirtual   #1881 <Method PdfObject PdfArray.remove(int)>
	//   69  138:pop             
								k = i - 1;
	//   70  139:iload_1         
	//   71  140:iconst_1        
	//   72  141:isub            
	//   73  142:istore_3        
							}
						}
					i = k + 1;
				}
	//*  74  143:goto            99
				if(pdfarray.isEmpty())
	//*  75  146:aload           5
	//*  76  148:invokevirtual   #1882 <Method boolean PdfArray.isEmpty()>
	//*  77  151:ifeq            165
					pdfdictionary.remove(PdfName.ANNOTS);
	//   78  154:aload           4
	//   79  156:getstatic       #1198 <Field PdfName PdfName.ANNOTS>
	//   80  159:invokevirtual   #565 <Method void PdfDictionary.remove(PdfName)>
				else
	//*  81  162:goto            53
					pageRefs.releasePage(j);
	//   82  165:aload_0         
	//   83  166:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//   84  169:iload_2         
	//   85  170:invokevirtual   #1201 <Method void PdfReader$PageRefs.releasePage(int)>
			}
			j++;
		}
	//*  86  173:goto            53
		catalog.remove(PdfName.ACROFORM);
	//   87  176:aload_0         
	//   88  177:getfield        #290 <Field PdfDictionary catalog>
	//   89  180:getstatic       #1291 <Field PdfName PdfName.ACROFORM>
	//   90  183:invokevirtual   #565 <Method void PdfDictionary.remove(PdfName)>
		pageRefs.resetReleasePage();
	//   91  186:aload_0         
	//   92  187:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//   93  190:invokevirtual   #1432 <Method void PdfReader$PageRefs.resetReleasePage()>
	//   94  193:return          
	}

	protected void removeUnusedNode(PdfObject pdfobject, boolean aflag[])
	{
		Stack stack;
		stack = new Stack();
	//    0    0:new             #1886 <Class Stack>
	//    1    3:dup             
	//    2    4:invokespecial   #1887 <Method void Stack()>
	//    3    7:astore          8
		stack.push(((Object) (pdfobject)));
	//    4    9:aload           8
	//    5   11:aload_1         
	//    6   12:invokevirtual   #1890 <Method Object Stack.push(Object)>
	//    7   15:pop             
_L7:
		int i;
		Object obj;
		PdfName apdfname[];
		Object aobj[];
		Object obj1;
		if(stack.empty())
			break; /* Loop/switch isn't completed */
	//    8   16:aload           8
	//    9   18:invokevirtual   #1893 <Method boolean Stack.empty()>
	//   10   21:ifne            567
		obj1 = stack.pop();
	//   11   24:aload           8
	//   12   26:invokevirtual   #1896 <Method Object Stack.pop()>
	//   13   29:astore          9
		if(obj1 == null)
			continue; /* Loop/switch isn't completed */
	//   14   31:aload           9
	//   15   33:ifnull          16
		pdfobject = null;
	//   16   36:aconst_null     
	//   17   37:astore_1        
		obj = null;
	//   18   38:aconst_null     
	//   19   39:astore          5
		apdfname = null;
	//   20   41:aconst_null     
	//   21   42:astore          6
		aobj = null;
	//   22   44:aconst_null     
	//   23   45:astore          7
		i = 0;
	//   24   47:iconst_0        
	//   25   48:istore_3        
		if(!(obj1 instanceof PdfObject))
			break MISSING_BLOCK_LABEL_274;
	//   26   49:aload           9
	//   27   51:instanceof      #264 <Class PdfObject>
	//   28   54:ifeq            274
		obj1 = ((Object) ((PdfObject)obj1));
	//   29   57:aload           9
	//   30   59:checkcast       #264 <Class PdfObject>
	//   31   62:astore          9
		((PdfObject) (obj1)).type();
	//   32   64:aload           9
	//   33   66:invokevirtual   #469 <Method int PdfObject.type()>
		JVM INSTR tableswitch 5 10: default 108
	//	               5 111
	//	               6 207
	//	               7 207
	//	               8 108
	//	               9 108
	//	               10 240;
	//   34   69:tableswitch     5 10: default 108
	//	               5 111
	//	               6 207
	//	               7 207
	//	               8 108
	//	               9 108
	//	               10 240
		   goto _L1 _L2 _L3 _L3 _L1 _L1 _L4
_L1:
		continue; /* Loop/switch isn't completed */
	//   35  108:goto            16
_L2:
		pdfobject = ((PdfObject) (((PdfArray)obj1).getArrayList()));
	//   36  111:aload           9
	//   37  113:checkcast       #558 <Class PdfArray>
	//   38  116:invokevirtual   #628 <Method ArrayList PdfArray.getArrayList()>
	//   39  119:astore_1        
		break MISSING_BLOCK_LABEL_120;
	//*  40  120:aload_1         
	//*  41  121:ifnull          411
	//*  42  124:iload_3         
	//*  43  125:aload_1         
	//*  44  126:invokevirtual   #258 <Method int ArrayList.size()>
	//*  45  129:icmpge          16
	//*  46  132:aload_1         
	//*  47  133:iload_3         
	//*  48  134:invokevirtual   #262 <Method Object ArrayList.get(int)>
	//*  49  137:checkcast       #264 <Class PdfObject>
	//*  50  140:astore          5
	//*  51  142:aload           5
	//*  52  144:invokevirtual   #817 <Method boolean PdfObject.isIndirect()>
	//*  53  147:ifeq            351
	//*  54  150:aload           5
	//*  55  152:checkcast       #305 <Class PRIndirectReference>
	//*  56  155:invokevirtual   #730 <Method int PRIndirectReference.getNumber()>
	//*  57  158:istore          4
	//*  58  160:iload           4
	//*  59  162:aload_0         
	//*  60  163:getfield        #251 <Field ArrayList xrefObj>
	//*  61  166:invokevirtual   #258 <Method int ArrayList.size()>
	//*  62  169:icmpge          191
	//*  63  172:aload_0         
	//*  64  173:getfield        #187 <Field boolean partial>
	//*  65  176:ifne            351
	//*  66  179:aload_0         
	//*  67  180:getfield        #251 <Field ArrayList xrefObj>
	//*  68  183:iload           4
	//*  69  185:invokevirtual   #262 <Method Object ArrayList.get(int)>
	//*  70  188:ifnonnull       351
	//*  71  191:aload_1         
	//*  72  192:iload_3         
	//*  73  193:getstatic       #1748 <Field PdfNull PdfNull.PDFNULL>
	//*  74  196:invokevirtual   #272 <Method Object ArrayList.set(int, Object)>
	//*  75  199:pop             
	//*  76  200:iload_3         
	//*  77  201:iconst_1        
	//*  78  202:iadd            
	//*  79  203:istore_3        
	//*  80  204:goto            124
_L3:
		obj = ((Object) ((PdfDictionary)obj1));
	//   81  207:aload           9
	//   82  209:checkcast       #281 <Class PdfDictionary>
	//   83  212:astore          5
		apdfname = new PdfName[((PdfDictionary) (obj)).size()];
	//   84  214:aload           5
	//   85  216:invokevirtual   #693 <Method int PdfDictionary.size()>
	//   86  219:anewarray       PdfName[]
	//   87  222:astore          6
		((PdfDictionary) (obj)).getKeys().toArray(((Object []) (apdfname)));
	//   88  224:aload           5
	//   89  226:invokevirtual   #698 <Method Set PdfDictionary.getKeys()>
	//   90  229:aload           6
	//   91  231:invokeinterface #1399 <Method Object[] Set.toArray(Object[])>
	//   92  236:pop             
		  goto _L5
	//*  93  237:goto            120
_L4:
		pdfobject = ((PdfObject) ((PRIndirectReference)obj1));
	//   94  240:aload           9
	//   95  242:checkcast       #305 <Class PRIndirectReference>
	//   96  245:astore_1        
		i = ((PRIndirectReference) (pdfobject)).getNumber();
	//   97  246:aload_1         
	//   98  247:invokevirtual   #730 <Method int PRIndirectReference.getNumber()>
	//   99  250:istore_3        
		if(!aflag[i])
	//* 100  251:aload_2         
	//* 101  252:iload_3         
	//* 102  253:baload          
	//* 103  254:ifne            16
		{
			aflag[i] = true;
	//  104  257:aload_2         
	//  105  258:iload_3         
	//  106  259:iconst_1        
	//  107  260:bastore         
			stack.push(((Object) (getPdfObjectRelease(pdfobject))));
	//  108  261:aload           8
	//  109  263:aload_1         
	//  110  264:invokestatic    #466 <Method PdfObject getPdfObjectRelease(PdfObject)>
	//  111  267:invokevirtual   #1890 <Method Object Stack.push(Object)>
	//  112  270:pop             
		}
		continue; /* Loop/switch isn't completed */
	//  113  271:goto            16
		aobj = (Object[])(Object[])obj1;
	//  114  274:aload           9
	//  115  276:checkcast       #1898 <Class Object[]>
	//  116  279:checkcast       #1898 <Class Object[]>
	//  117  282:astore          7
		if(aobj[0] instanceof ArrayList)
	//* 118  284:aload           7
	//* 119  286:iconst_0        
	//* 120  287:aaload          
	//* 121  288:instanceof      #167 <Class ArrayList>
	//* 122  291:ifeq            316
		{
			pdfobject = ((PdfObject) ((ArrayList)aobj[0]));
	//  123  294:aload           7
	//  124  296:iconst_0        
	//  125  297:aaload          
	//  126  298:checkcast       #167 <Class ArrayList>
	//  127  301:astore_1        
			i = ((Integer)aobj[1]).intValue();
	//  128  302:aload           7
	//  129  304:iconst_1        
	//  130  305:aaload          
	//  131  306:checkcast       #1669 <Class Integer>
	//  132  309:invokevirtual   #1670 <Method int Integer.intValue()>
	//  133  312:istore_3        
		} else
	//* 134  313:goto            120
		{
			apdfname = (PdfName[])(PdfName[])aobj[0];
	//  135  316:aload           7
	//  136  318:iconst_0        
	//  137  319:aaload          
	//  138  320:checkcast       #1899 <Class PdfName[]>
	//  139  323:checkcast       #1899 <Class PdfName[]>
	//  140  326:astore          6
			obj = ((Object) ((PdfDictionary)aobj[1]));
	//  141  328:aload           7
	//  142  330:iconst_1        
	//  143  331:aaload          
	//  144  332:checkcast       #281 <Class PdfDictionary>
	//  145  335:astore          5
			i = ((Integer)aobj[2]).intValue();
	//  146  337:aload           7
	//  147  339:iconst_2        
	//  148  340:aaload          
	//  149  341:checkcast       #1669 <Class Integer>
	//  150  344:invokevirtual   #1670 <Method int Integer.intValue()>
	//  151  347:istore_3        
		}
_L5:
		if(pdfobject != null)
		{
			do
			{
				if(i >= ((ArrayList) (pdfobject)).size())
					continue; /* Loop/switch isn't completed */
				obj = ((Object) ((PdfObject)((ArrayList) (pdfobject)).get(i)));
				if(!((PdfObject) (obj)).isIndirect())
					break;
				int j = ((PRIndirectReference)obj).getNumber();
				if(j < xrefObj.size() && (partial || xrefObj.get(j) != null))
					break;
				((ArrayList) (pdfobject)).set(i, ((Object) (PdfNull.PDFNULL)));
				i++;
			} while(true);
	//* 152  348:goto            120
			if(aobj == null)
	//* 153  351:aload           7
	//* 154  353:ifnonnull       390
			{
				stack.push(((Object) (new Object[] {
					pdfobject, Integer.valueOf(i + 1)
				})));
	//  155  356:aload           8
	//  156  358:iconst_2        
	//  157  359:anewarray       Object[]
	//  158  362:dup             
	//  159  363:iconst_0        
	//  160  364:aload_1         
	//  161  365:aastore         
	//  162  366:dup             
	//  163  367:iconst_1        
	//  164  368:iload_3         
	//  165  369:iconst_1        
	//  166  370:iadd            
	//  167  371:invokestatic    #1832 <Method Integer Integer.valueOf(int)>
	//  168  374:aastore         
	//  169  375:invokevirtual   #1890 <Method Object Stack.push(Object)>
	//  170  378:pop             
			} else
	//* 171  379:aload           8
	//* 172  381:aload           5
	//* 173  383:invokevirtual   #1890 <Method Object Stack.push(Object)>
	//* 174  386:pop             
	//* 175  387:goto            16
			{
				aobj[1] = ((Object) (Integer.valueOf(i + 1)));
	//  176  390:aload           7
	//  177  392:iconst_1        
	//  178  393:iload_3         
	//  179  394:iconst_1        
	//  180  395:iadd            
	//  181  396:invokestatic    #1832 <Method Integer Integer.valueOf(int)>
	//  182  399:aastore         
				stack.push(((Object) (aobj)));
	//  183  400:aload           8
	//  184  402:aload           7
	//  185  404:invokevirtual   #1890 <Method Object Stack.push(Object)>
	//  186  407:pop             
			}
			stack.push(obj);
			continue; /* Loop/switch isn't completed */
	//  187  408:goto            379
		}
		do
		{
			if(i >= apdfname.length)
				continue; /* Loop/switch isn't completed */
	//  188  411:iload_3         
	//  189  412:aload           6
	//  190  414:arraylength     
	//  191  415:icmpge          16
			pdfobject = ((PdfObject) (apdfname[i]));
	//  192  418:aload           6
	//  193  420:iload_3         
	//  194  421:aaload          
	//  195  422:astore_1        
			obj1 = ((Object) (((PdfDictionary) (obj)).get(((PdfName) (pdfobject)))));
	//  196  423:aload           5
	//  197  425:aload_1         
	//  198  426:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//  199  429:astore          9
			if(!((PdfObject) (obj1)).isIndirect())
				break;
	//  200  431:aload           9
	//  201  433:invokevirtual   #817 <Method boolean PdfObject.isIndirect()>
	//  202  436:ifeq            501
			int k = ((PRIndirectReference)obj1).getNumber();
	//  203  439:aload           9
	//  204  441:checkcast       #305 <Class PRIndirectReference>
	//  205  444:invokevirtual   #730 <Method int PRIndirectReference.getNumber()>
	//  206  447:istore          4
			if(k >= 0 && k < xrefObj.size() && (partial || xrefObj.get(k) != null))
				break;
	//  207  449:iload           4
	//  208  451:iflt            485
	//  209  454:iload           4
	//  210  456:aload_0         
	//  211  457:getfield        #251 <Field ArrayList xrefObj>
	//  212  460:invokevirtual   #258 <Method int ArrayList.size()>
	//  213  463:icmpge          485
	//  214  466:aload_0         
	//  215  467:getfield        #187 <Field boolean partial>
	//  216  470:ifne            501
	//  217  473:aload_0         
	//  218  474:getfield        #251 <Field ArrayList xrefObj>
	//  219  477:iload           4
	//  220  479:invokevirtual   #262 <Method Object ArrayList.get(int)>
	//  221  482:ifnonnull       501
			((PdfDictionary) (obj)).put(((PdfName) (pdfobject)), ((PdfObject) (PdfNull.PDFNULL)));
	//  222  485:aload           5
	//  223  487:aload_1         
	//  224  488:getstatic       #1748 <Field PdfNull PdfNull.PDFNULL>
	//  225  491:invokevirtual   #575 <Method void PdfDictionary.put(PdfName, PdfObject)>
			i++;
	//  226  494:iload_3         
	//  227  495:iconst_1        
	//  228  496:iadd            
	//  229  497:istore_3        
		} while(true);
	//  230  498:goto            411
		if(aobj == null)
	//* 231  501:aload           7
	//* 232  503:ifnonnull       546
		{
			stack.push(((Object) (new Object[] {
				apdfname, obj, Integer.valueOf(i + 1)
			})));
	//  233  506:aload           8
	//  234  508:iconst_3        
	//  235  509:anewarray       Object[]
	//  236  512:dup             
	//  237  513:iconst_0        
	//  238  514:aload           6
	//  239  516:aastore         
	//  240  517:dup             
	//  241  518:iconst_1        
	//  242  519:aload           5
	//  243  521:aastore         
	//  244  522:dup             
	//  245  523:iconst_2        
	//  246  524:iload_3         
	//  247  525:iconst_1        
	//  248  526:iadd            
	//  249  527:invokestatic    #1832 <Method Integer Integer.valueOf(int)>
	//  250  530:aastore         
	//  251  531:invokevirtual   #1890 <Method Object Stack.push(Object)>
	//  252  534:pop             
		} else
	//* 253  535:aload           8
	//* 254  537:aload           9
	//* 255  539:invokevirtual   #1890 <Method Object Stack.push(Object)>
	//* 256  542:pop             
	//* 257  543:goto            16
		{
			aobj[2] = ((Object) (Integer.valueOf(i + 1)));
	//  258  546:aload           7
	//  259  548:iconst_2        
	//  260  549:iload_3         
	//  261  550:iconst_1        
	//  262  551:iadd            
	//  263  552:invokestatic    #1832 <Method Integer Integer.valueOf(int)>
	//  264  555:aastore         
			stack.push(((Object) (aobj)));
	//  265  556:aload           8
	//  266  558:aload           7
	//  267  560:invokevirtual   #1890 <Method Object Stack.push(Object)>
	//  268  563:pop             
		}
		stack.push(obj1);
		if(true) goto _L7; else goto _L6
	//  269  564:goto            535
_L6:
	//  270  567:return          
	}

	public int removeUnusedObjects()
	{
		boolean aflag[] = new boolean[xrefObj.size()];
	//    0    0:aload_0         
	//    1    1:getfield        #251 <Field ArrayList xrefObj>
	//    2    4:invokevirtual   #258 <Method int ArrayList.size()>
	//    3    7:newarray        boolean[]
	//    4    9:astore          4
		removeUnusedNode(((PdfObject) (trailer)), aflag);
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #279 <Field PdfDictionary trailer>
	//    8   16:aload           4
	//    9   18:invokevirtual   #1901 <Method void removeUnusedNode(PdfObject, boolean[])>
		int i1 = 0;
	//   10   21:iconst_0        
	//   11   22:istore_3        
		int i = 0;
	//   12   23:iconst_0        
	//   13   24:istore_1        
		if(partial)
	//*  14   25:aload_0         
	//*  15   26:getfield        #187 <Field boolean partial>
	//*  16   29:ifeq            97
		{
			int k = 1;
	//   17   32:iconst_1        
	//   18   33:istore_2        
			do
			{
				i1 = i;
	//   19   34:iload_1         
	//   20   35:istore_3        
				if(k >= aflag.length)
					break;
	//   21   36:iload_2         
	//   22   37:aload           4
	//   23   39:arraylength     
	//   24   40:icmpge          142
				i1 = i;
	//   25   43:iload_1         
	//   26   44:istore_3        
				if(!aflag[k])
	//*  27   45:aload           4
	//*  28   47:iload_2         
	//*  29   48:baload          
	//*  30   49:ifne            88
				{
					xref[k * 2] = -1L;
	//   31   52:aload_0         
	//   32   53:getfield        #301 <Field long[] xref>
	//   33   56:iload_2         
	//   34   57:iconst_2        
	//   35   58:imul            
	//   36   59:ldc2w           #913 <Long -1L>
	//   37   62:lastore         
					xref[k * 2 + 1] = 0L;
	//   38   63:aload_0         
	//   39   64:getfield        #301 <Field long[] xref>
	//   40   67:iload_2         
	//   41   68:iconst_2        
	//   42   69:imul            
	//   43   70:iconst_1        
	//   44   71:iadd            
	//   45   72:lconst_0        
	//   46   73:lastore         
					xrefObj.set(k, ((Object) (null)));
	//   47   74:aload_0         
	//   48   75:getfield        #251 <Field ArrayList xrefObj>
	//   49   78:iload_2         
	//   50   79:aconst_null     
	//   51   80:invokevirtual   #272 <Method Object ArrayList.set(int, Object)>
	//   52   83:pop             
					i1 = i + 1;
	//   53   84:iload_1         
	//   54   85:iconst_1        
	//   55   86:iadd            
	//   56   87:istore_3        
				}
				k++;
	//   57   88:iload_2         
	//   58   89:iconst_1        
	//   59   90:iadd            
	//   60   91:istore_2        
				i = i1;
	//   61   92:iload_3         
	//   62   93:istore_1        
			} while(true);
	//   63   94:goto            34
		} else
		{
			int l = 1;
	//   64   97:iconst_1        
	//   65   98:istore_2        
			int j = i1;
	//   66   99:iload_3         
	//   67  100:istore_1        
			do
			{
				i1 = j;
	//   68  101:iload_1         
	//   69  102:istore_3        
				if(l >= aflag.length)
					break;
	//   70  103:iload_2         
	//   71  104:aload           4
	//   72  106:arraylength     
	//   73  107:icmpge          142
				i1 = j;
	//   74  110:iload_1         
	//   75  111:istore_3        
				if(!aflag[l])
	//*  76  112:aload           4
	//*  77  114:iload_2         
	//*  78  115:baload          
	//*  79  116:ifne            133
				{
					xrefObj.set(l, ((Object) (null)));
	//   80  119:aload_0         
	//   81  120:getfield        #251 <Field ArrayList xrefObj>
	//   82  123:iload_2         
	//   83  124:aconst_null     
	//   84  125:invokevirtual   #272 <Method Object ArrayList.set(int, Object)>
	//   85  128:pop             
					i1 = j + 1;
	//   86  129:iload_1         
	//   87  130:iconst_1        
	//   88  131:iadd            
	//   89  132:istore_3        
				}
				l++;
	//   90  133:iload_2         
	//   91  134:iconst_1        
	//   92  135:iadd            
	//   93  136:istore_2        
				j = i1;
	//   94  137:iload_3         
	//   95  138:istore_1        
			} while(true);
	//   96  139:goto            101
		}
		return i1;
	//   97  142:iload_3         
	//   98  143:ireturn         
	}

	public void removeUsageRights()
	{
		PdfDictionary pdfdictionary = catalog.getAsDict(PdfName.PERMS);
	//    0    0:aload_0         
	//    1    1:getfield        #290 <Field PdfDictionary catalog>
	//    2    4:getstatic       #978 <Field PdfName PdfName.PERMS>
	//    3    7:invokevirtual   #288 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//    4   10:astore_1        
		if(pdfdictionary != null)
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       16
	//*   7   15:return          
		{
			pdfdictionary.remove(PdfName.UR);
	//    8   16:aload_1         
	//    9   17:getstatic       #1528 <Field PdfName PdfName.UR>
	//   10   20:invokevirtual   #565 <Method void PdfDictionary.remove(PdfName)>
			pdfdictionary.remove(PdfName.UR3);
	//   11   23:aload_1         
	//   12   24:getstatic       #1531 <Field PdfName PdfName.UR3>
	//   13   27:invokevirtual   #565 <Method void PdfDictionary.remove(PdfName)>
			if(pdfdictionary.size() == 0)
	//*  14   30:aload_1         
	//*  15   31:invokevirtual   #693 <Method int PdfDictionary.size()>
	//*  16   34:ifne            15
			{
				catalog.remove(PdfName.PERMS);
	//   17   37:aload_0         
	//   18   38:getfield        #290 <Field PdfDictionary catalog>
	//   19   41:getstatic       #978 <Field PdfName PdfName.PERMS>
	//   20   44:invokevirtual   #565 <Method void PdfDictionary.remove(PdfName)>
				return;
	//   21   47:return          
			}
		}
	}

	public void resetLastXrefPartial()
	{
		lastXrefPartial = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #178 <Field int lastXrefPartial>
	//    3    5:return          
	}

	public void resetReleasePage()
	{
		pageRefs.resetReleasePage();
	//    0    0:aload_0         
	//    1    1:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//    2    4:invokevirtual   #1432 <Method void PdfReader$PageRefs.resetReleasePage()>
	//    3    7:return          
	}

	public void selectPages(String s)
	{
		selectPages(SequenceList.expand(s, getNumberOfPages()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #1906 <Method int getNumberOfPages()>
	//    4    6:invokestatic    #1912 <Method List SequenceList.expand(String, int)>
	//    5    9:invokevirtual   #1915 <Method void selectPages(List)>
	//    6   12:return          
	}

	public void selectPages(List list)
	{
		selectPages(list, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #1918 <Method void selectPages(List, boolean)>
	//    4    6:return          
	}

	protected void selectPages(List list, boolean flag)
	{
		pageRefs.selectPages(list);
	//    0    0:aload_0         
	//    1    1:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//    2    4:aload_1         
	//    3    5:invokestatic    #1923 <Method void PdfReader$PageRefs.access$100(PdfReader$PageRefs, List)>
		if(flag)
	//*   4    8:iload_2         
	//*   5    9:ifeq            17
			removeUnusedObjects();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #1785 <Method int removeUnusedObjects()>
	//    8   16:pop             
	//    9   17:return          
	}

	public void setAppendable(boolean flag)
	{
		appendable = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #219 <Field boolean appendable>
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            23
			getPdfObject(trailer.get(PdfName.ROOT));
	//    5    9:aload_0         
	//    6   10:getfield        #279 <Field PdfDictionary trailer>
	//    7   13:getstatic       #284 <Field PdfName PdfName.ROOT>
	//    8   16:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//    9   19:invokestatic    #524 <Method PdfObject getPdfObject(PdfObject)>
	//   10   22:pop             
	//   11   23:return          
	}

	public void setPageContent(int i, byte abyte0[])
	{
		setPageContent(i, abyte0, -1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:iconst_m1       
	//    4    4:invokevirtual   #1930 <Method void setPageContent(int, byte[], int)>
	//    5    7:return          
	}

	public void setPageContent(int i, byte abyte0[], int j)
	{
		setPageContent(i, abyte0, j, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #1933 <Method void setPageContent(int, byte[], int, boolean)>
	//    6    8:return          
	}

	public void setPageContent(int i, byte abyte0[], int j, boolean flag)
	{
		PdfDictionary pdfdictionary = getPageN(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #1489 <Method PdfDictionary getPageN(int)>
	//    3    5:astore          5
		if(pdfdictionary == null)
	//*   4    7:aload           5
	//*   5    9:ifnonnull       13
			return;
	//    6   12:return          
		PdfObject pdfobject = pdfdictionary.get(PdfName.CONTENTS);
	//    7   13:aload           5
	//    8   15:getstatic       #795 <Field PdfName PdfName.CONTENTS>
	//    9   18:invokevirtual   #535 <Method PdfObject PdfDictionary.get(PdfName)>
	//   10   21:astore          6
		freeXref = -1;
	//   11   23:aload_0         
	//   12   24:iconst_m1       
	//   13   25:putfield        #225 <Field int freeXref>
		if(flag)
	//*  14   28:iload           4
	//*  15   30:ifeq            39
			killXref(pdfobject);
	//   16   33:aload_0         
	//   17   34:aload           6
	//   18   36:invokevirtual   #1562 <Method void killXref(PdfObject)>
		if(freeXref == -1)
	//*  19   39:aload_0         
	//*  20   40:getfield        #225 <Field int freeXref>
	//*  21   43:iconst_m1       
	//*  22   44:icmpne          69
		{
			xrefObj.add(((Object) (null)));
	//   23   47:aload_0         
	//   24   48:getfield        #251 <Field ArrayList xrefObj>
	//   25   51:aconst_null     
	//   26   52:invokevirtual   #605 <Method boolean ArrayList.add(Object)>
	//   27   55:pop             
			freeXref = xrefObj.size() - 1;
	//   28   56:aload_0         
	//   29   57:aload_0         
	//   30   58:getfield        #251 <Field ArrayList xrefObj>
	//   31   61:invokevirtual   #258 <Method int ArrayList.size()>
	//   32   64:iconst_1        
	//   33   65:isub            
	//   34   66:putfield        #225 <Field int freeXref>
		}
		pdfdictionary.put(PdfName.CONTENTS, ((PdfObject) (new PRIndirectReference(this, freeXref))));
	//   35   69:aload           5
	//   36   71:getstatic       #795 <Field PdfName PdfName.CONTENTS>
	//   37   74:new             #305 <Class PRIndirectReference>
	//   38   77:dup             
	//   39   78:aload_0         
	//   40   79:aload_0         
	//   41   80:getfield        #225 <Field int freeXref>
	//   42   83:invokespecial   #1172 <Method void PRIndirectReference(PdfReader, int)>
	//   43   86:invokevirtual   #575 <Method void PdfDictionary.put(PdfName, PdfObject)>
		xrefObj.set(freeXref, ((Object) (new PRStream(this, abyte0, j))));
	//   44   89:aload_0         
	//   45   90:getfield        #251 <Field ArrayList xrefObj>
	//   46   93:aload_0         
	//   47   94:getfield        #225 <Field int freeXref>
	//   48   97:new             #453 <Class PRStream>
	//   49  100:dup             
	//   50  101:aload_0         
	//   51  102:aload_2         
	//   52  103:iload_3         
	//   53  104:invokespecial   #1936 <Method void PRStream(PdfReader, byte[], int)>
	//   54  107:invokevirtual   #272 <Method Object ArrayList.set(int, Object)>
	//   55  110:pop             
	//   56  111:return          
	}

	public void setTampered(boolean flag)
	{
		tampered = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #155 <Field boolean tampered>
		pageRefs.keepPages();
	//    3    5:aload_0         
	//    4    6:getfield        #274 <Field PdfReader$PageRefs pageRefs>
	//    5    9:invokevirtual   #1940 <Method void PdfReader$PageRefs.keepPages()>
	//    6   12:return          
	}

	public void setViewerPreferences(int i)
	{
		viewerPreferences.setViewerPreferences(i);
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field PdfViewerPreferencesImp viewerPreferences>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #1942 <Method void PdfViewerPreferencesImp.setViewerPreferences(int)>
		setViewerPreferences(viewerPreferences);
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #183 <Field PdfViewerPreferencesImp viewerPreferences>
	//    7   13:invokevirtual   #1179 <Method void setViewerPreferences(PdfViewerPreferencesImp)>
	//    8   16:return          
	}

	public void setViewerPreferences(PdfViewerPreferencesImp pdfviewerpreferencesimp)
	{
		pdfviewerpreferencesimp.addToCatalog(catalog);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #290 <Field PdfDictionary catalog>
	//    3    5:invokevirtual   #1945 <Method void PdfViewerPreferencesImp.addToCatalog(PdfDictionary)>
	//    4    8:return          
	}

	public int shuffleSubsetNames()
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int j = 1;
	//    2    2:iconst_1        
	//    3    3:istore_2        
		while(j < xrefObj.size()) 
	//*   4    4:iload_2         
	//*   5    5:aload_0         
	//*   6    6:getfield        #251 <Field ArrayList xrefObj>
	//*   7    9:invokevirtual   #258 <Method int ArrayList.size()>
	//*   8   12:icmpge          424
		{
			Object obj = ((Object) (getPdfObjectRelease(j)));
	//    9   15:aload_0         
	//   10   16:iload_2         
	//   11   17:invokevirtual   #1207 <Method PdfObject getPdfObjectRelease(int)>
	//   12   20:astore          4
			int i = k;
	//   13   22:iload_3         
	//   14   23:istore_1        
			if(obj != null)
	//*  15   24:aload           4
	//*  16   26:ifnull          39
				if(!((PdfObject) (obj)).isDictionary())
	//*  17   29:aload           4
	//*  18   31:invokevirtual   #531 <Method boolean PdfObject.isDictionary()>
	//*  19   34:ifne            48
				{
					i = k;
	//   20   37:iload_3         
	//   21   38:istore_1        
				} else
	//*  22   39:iload_2         
	//*  23   40:iconst_1        
	//*  24   41:iadd            
	//*  25   42:istore_2        
	//*  26   43:iload_1         
	//*  27   44:istore_3        
	//*  28   45:goto            4
				{
					obj = ((Object) ((PdfDictionary)obj));
	//   29   48:aload           4
	//   30   50:checkcast       #281 <Class PdfDictionary>
	//   31   53:astore          4
					i = k;
	//   32   55:iload_3         
	//   33   56:istore_1        
					if(existsName(((PdfDictionary) (obj)), PdfName.TYPE, PdfName.FONT))
	//*  34   57:aload           4
	//*  35   59:getstatic       #1210 <Field PdfName PdfName.TYPE>
	//*  36   62:getstatic       #1213 <Field PdfName PdfName.FONT>
	//*  37   65:invokestatic    #1215 <Method boolean existsName(PdfDictionary, PdfName, PdfName)>
	//*  38   68:ifeq            39
						if(existsName(((PdfDictionary) (obj)), PdfName.SUBTYPE, PdfName.TYPE1) || existsName(((PdfDictionary) (obj)), PdfName.SUBTYPE, PdfName.MMTYPE1) || existsName(((PdfDictionary) (obj)), PdfName.SUBTYPE, PdfName.TRUETYPE))
	//*  39   71:aload           4
	//*  40   73:getstatic       #1218 <Field PdfName PdfName.SUBTYPE>
	//*  41   76:getstatic       #1221 <Field PdfName PdfName.TYPE1>
	//*  42   79:invokestatic    #1215 <Method boolean existsName(PdfDictionary, PdfName, PdfName)>
	//*  43   82:ifne            113
	//*  44   85:aload           4
	//*  45   87:getstatic       #1218 <Field PdfName PdfName.SUBTYPE>
	//*  46   90:getstatic       #1224 <Field PdfName PdfName.MMTYPE1>
	//*  47   93:invokestatic    #1215 <Method boolean existsName(PdfDictionary, PdfName, PdfName)>
	//*  48   96:ifne            113
	//*  49   99:aload           4
	//*  50  101:getstatic       #1218 <Field PdfName PdfName.SUBTYPE>
	//*  51  104:getstatic       #1227 <Field PdfName PdfName.TRUETYPE>
	//*  52  107:invokestatic    #1215 <Method boolean existsName(PdfDictionary, PdfName, PdfName)>
	//*  53  110:ifeq            215
						{
							Object obj1 = ((Object) (getSubsetPrefix(((PdfDictionary) (obj)))));
	//   54  113:aload           4
	//   55  115:invokestatic    #1229 <Method String getSubsetPrefix(PdfDictionary)>
	//   56  118:astore          5
							i = k;
	//   57  120:iload_3         
	//   58  121:istore_1        
							if(obj1 != null)
	//*  59  122:aload           5
	//*  60  124:ifnull          39
							{
								obj1 = ((Object) (new PdfName((new StringBuilder()).append(BaseFont.createSubsetPrefix()).append(((String) (obj1)).substring(7)).toString())));
	//   61  127:new             #103 <Class PdfName>
	//   62  130:dup             
	//   63  131:new             #1231 <Class StringBuilder>
	//   64  134:dup             
	//   65  135:invokespecial   #1232 <Method void StringBuilder()>
	//   66  138:invokestatic    #1237 <Method String BaseFont.createSubsetPrefix()>
	//   67  141:invokevirtual   #1241 <Method StringBuilder StringBuilder.append(String)>
	//   68  144:aload           5
	//   69  146:bipush          7
	//   70  148:invokevirtual   #1949 <Method String String.substring(int)>
	//   71  151:invokevirtual   #1241 <Method StringBuilder StringBuilder.append(String)>
	//   72  154:invokevirtual   #1242 <Method String StringBuilder.toString()>
	//   73  157:invokespecial   #1255 <Method void PdfName(String)>
	//   74  160:astore          5
								((PdfDictionary) (obj)).put(PdfName.BASEFONT, ((PdfObject) (obj1)));
	//   75  162:aload           4
	//   76  164:getstatic       #752 <Field PdfName PdfName.BASEFONT>
	//   77  167:aload           5
	//   78  169:invokevirtual   #575 <Method void PdfDictionary.put(PdfName, PdfObject)>
								setXrefPartialObject(j, ((PdfObject) (obj)));
	//   79  172:aload_0         
	//   80  173:iload_2         
	//   81  174:aload           4
	//   82  176:invokespecial   #579 <Method void setXrefPartialObject(int, PdfObject)>
								k++;
	//   83  179:iload_3         
	//   84  180:iconst_1        
	//   85  181:iadd            
	//   86  182:istore_3        
								obj = ((Object) (((PdfDictionary) (obj)).getAsDict(PdfName.FONTDESCRIPTOR)));
	//   87  183:aload           4
	//   88  185:getstatic       #1245 <Field PdfName PdfName.FONTDESCRIPTOR>
	//   89  188:invokevirtual   #288 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   90  191:astore          4
								i = k;
	//   91  193:iload_3         
	//   92  194:istore_1        
								if(obj != null)
	//*  93  195:aload           4
	//*  94  197:ifnull          39
								{
									((PdfDictionary) (obj)).put(PdfName.FONTNAME, ((PdfObject) (obj1)));
	//   95  200:aload           4
	//   96  202:getstatic       #1258 <Field PdfName PdfName.FONTNAME>
	//   97  205:aload           5
	//   98  207:invokevirtual   #575 <Method void PdfDictionary.put(PdfName, PdfObject)>
									i = k;
	//   99  210:iload_3         
	//  100  211:istore_1        
								}
							}
						} else
	//* 101  212:goto            39
						{
							i = k;
	//  102  215:iload_3         
	//  103  216:istore_1        
							if(existsName(((PdfDictionary) (obj)), PdfName.SUBTYPE, PdfName.TYPE0))
	//* 104  217:aload           4
	//* 105  219:getstatic       #1218 <Field PdfName PdfName.SUBTYPE>
	//* 106  222:getstatic       #1952 <Field PdfName PdfName.TYPE0>
	//* 107  225:invokestatic    #1215 <Method boolean existsName(PdfDictionary, PdfName, PdfName)>
	//* 108  228:ifeq            39
							{
								Object obj2 = ((Object) (getSubsetPrefix(((PdfDictionary) (obj)))));
	//  109  231:aload           4
	//  110  233:invokestatic    #1229 <Method String getSubsetPrefix(PdfDictionary)>
	//  111  236:astore          5
								Object obj3 = ((Object) (((PdfDictionary) (obj)).getAsArray(PdfName.DESCENDANTFONTS)));
	//  112  238:aload           4
	//  113  240:getstatic       #1955 <Field PdfName PdfName.DESCENDANTFONTS>
	//  114  243:invokevirtual   #947 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//  115  246:astore          6
								i = k;
	//  116  248:iload_3         
	//  117  249:istore_1        
								if(obj3 != null)
	//* 118  250:aload           6
	//* 119  252:ifnull          39
								{
									i = k;
	//  120  255:iload_3         
	//  121  256:istore_1        
									if(!((PdfArray) (obj3)).isEmpty())
	//* 122  257:aload           6
	//* 123  259:invokevirtual   #1882 <Method boolean PdfArray.isEmpty()>
	//* 124  262:ifne            39
									{
										obj3 = ((Object) (((PdfArray) (obj3)).getAsDict(0)));
	//  125  265:aload           6
	//  126  267:iconst_0        
	//  127  268:invokevirtual   #1336 <Method PdfDictionary PdfArray.getAsDict(int)>
	//  128  271:astore          6
										String s = getSubsetPrefix(((PdfDictionary) (obj3)));
	//  129  273:aload           6
	//  130  275:invokestatic    #1229 <Method String getSubsetPrefix(PdfDictionary)>
	//  131  278:astore          7
										i = k;
	//  132  280:iload_3         
	//  133  281:istore_1        
										if(s != null)
	//* 134  282:aload           7
	//* 135  284:ifnull          39
										{
											String s1 = BaseFont.createSubsetPrefix();
	//  136  287:invokestatic    #1237 <Method String BaseFont.createSubsetPrefix()>
	//  137  290:astore          8
											if(obj2 != null)
	//* 138  292:aload           5
	//* 139  294:ifnull          337
												((PdfDictionary) (obj)).put(PdfName.BASEFONT, ((PdfObject) (new PdfName((new StringBuilder()).append(s1).append(((String) (obj2)).substring(7)).toString()))));
	//  140  297:aload           4
	//  141  299:getstatic       #752 <Field PdfName PdfName.BASEFONT>
	//  142  302:new             #103 <Class PdfName>
	//  143  305:dup             
	//  144  306:new             #1231 <Class StringBuilder>
	//  145  309:dup             
	//  146  310:invokespecial   #1232 <Method void StringBuilder()>
	//  147  313:aload           8
	//  148  315:invokevirtual   #1241 <Method StringBuilder StringBuilder.append(String)>
	//  149  318:aload           5
	//  150  320:bipush          7
	//  151  322:invokevirtual   #1949 <Method String String.substring(int)>
	//  152  325:invokevirtual   #1241 <Method StringBuilder StringBuilder.append(String)>
	//  153  328:invokevirtual   #1242 <Method String StringBuilder.toString()>
	//  154  331:invokespecial   #1255 <Method void PdfName(String)>
	//  155  334:invokevirtual   #575 <Method void PdfDictionary.put(PdfName, PdfObject)>
											setXrefPartialObject(j, ((PdfObject) (obj)));
	//  156  337:aload_0         
	//  157  338:iload_2         
	//  158  339:aload           4
	//  159  341:invokespecial   #579 <Method void setXrefPartialObject(int, PdfObject)>
											obj = ((Object) (new PdfName((new StringBuilder()).append(s1).append(s.substring(7)).toString())));
	//  160  344:new             #103 <Class PdfName>
	//  161  347:dup             
	//  162  348:new             #1231 <Class StringBuilder>
	//  163  351:dup             
	//  164  352:invokespecial   #1232 <Method void StringBuilder()>
	//  165  355:aload           8
	//  166  357:invokevirtual   #1241 <Method StringBuilder StringBuilder.append(String)>
	//  167  360:aload           7
	//  168  362:bipush          7
	//  169  364:invokevirtual   #1949 <Method String String.substring(int)>
	//  170  367:invokevirtual   #1241 <Method StringBuilder StringBuilder.append(String)>
	//  171  370:invokevirtual   #1242 <Method String StringBuilder.toString()>
	//  172  373:invokespecial   #1255 <Method void PdfName(String)>
	//  173  376:astore          4
											((PdfDictionary) (obj3)).put(PdfName.BASEFONT, ((PdfObject) (obj)));
	//  174  378:aload           6
	//  175  380:getstatic       #752 <Field PdfName PdfName.BASEFONT>
	//  176  383:aload           4
	//  177  385:invokevirtual   #575 <Method void PdfDictionary.put(PdfName, PdfObject)>
											k++;
	//  178  388:iload_3         
	//  179  389:iconst_1        
	//  180  390:iadd            
	//  181  391:istore_3        
											obj2 = ((Object) (((PdfDictionary) (obj3)).getAsDict(PdfName.FONTDESCRIPTOR)));
	//  182  392:aload           6
	//  183  394:getstatic       #1245 <Field PdfName PdfName.FONTDESCRIPTOR>
	//  184  397:invokevirtual   #288 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//  185  400:astore          5
											i = k;
	//  186  402:iload_3         
	//  187  403:istore_1        
											if(obj2 != null)
	//* 188  404:aload           5
	//* 189  406:ifnull          39
											{
												((PdfDictionary) (obj2)).put(PdfName.FONTNAME, ((PdfObject) (obj)));
	//  190  409:aload           5
	//  191  411:getstatic       #1258 <Field PdfName PdfName.FONTNAME>
	//  192  414:aload           4
	//  193  416:invokevirtual   #575 <Method void PdfDictionary.put(PdfName, PdfObject)>
												i = k;
	//  194  419:iload_3         
	//  195  420:istore_1        
											}
										}
									}
								}
							}
						}
				}
			j++;
			k = i;
		}
	//* 196  421:goto            39
		return k;
	//  197  424:iload_3         
	//  198  425:ireturn         
	}

	protected static Counter COUNTER = CounterFactory.getCounter(com/itextpdf/text/pdf/PdfReader);
	private static final Logger LOGGER = LoggerFactory.getLogger(com/itextpdf/text/pdf/PdfReader);
	public static boolean debugmode = false;
	static final byte endobj[] = PdfEncodings.convertToBytes("endobj", ((String) (null)));
	static final byte endstream[] = PdfEncodings.convertToBytes("endstream", ((String) (null)));
	static final PdfName pageInhCandidates[];
	public static boolean unethicalreading = false;
	protected PRAcroForm acroForm;
	protected boolean acroFormParsed;
	private boolean appendable;
	protected PdfDictionary catalog;
	protected Certificate certificate;
	protected Key certificateKey;
	protected String certificateKeyProvider;
	protected boolean consolidateNamedDestinations;
	private PRIndirectReference cryptoRef;
	protected PdfEncryption decrypt;
	protected boolean encrypted;
	private boolean encryptionError;
	protected long eofPos;
	protected ExternalDecryptionProcess externalDecryptionProcess;
	private long fileLength;
	protected int freeXref;
	private boolean hybridXref;
	protected long lastXref;
	private int lastXrefPartial;
	protected boolean newXrefType;
	private int objGen;
	private int objNum;
	protected HashMap objStmMark;
	protected LongHashtable objStmToOffset;
	private boolean ownerPasswordUsed;
	protected long pValue;
	protected PageRefs pageRefs;
	private boolean partial;
	protected byte password[];
	protected char pdfVersion;
	protected int rValue;
	private int readDepth;
	protected boolean rebuilt;
	protected boolean remoteToLocalNamedDestinations;
	PdfDictionary rootPages;
	protected boolean sharedStreams;
	protected ArrayList strings;
	protected boolean tampered;
	protected PRTokeniser tokens;
	protected PdfDictionary trailer;
	private final PdfViewerPreferencesImp viewerPreferences;
	protected long xref[];
	protected ArrayList xrefObj;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:putstatic       #91  <Field boolean unethicalreading>
	//    2    4:iconst_0        
	//    3    5:putstatic       #93  <Field boolean debugmode>
	//    4    8:ldc1            #2   <Class PdfReader>
	//    5   10:invokestatic    #99  <Method Logger LoggerFactory.getLogger(Class)>
	//    6   13:putstatic       #101 <Field Logger LOGGER>
		pageInhCandidates = (new PdfName[] {
			PdfName.MEDIABOX, PdfName.ROTATE, PdfName.RESOURCES, PdfName.CROPBOX
		});
	//    7   16:iconst_4        
	//    8   17:anewarray       PdfName[]
	//    9   20:dup             
	//   10   21:iconst_0        
	//   11   22:getstatic       #107 <Field PdfName PdfName.MEDIABOX>
	//   12   25:aastore         
	//   13   26:dup             
	//   14   27:iconst_1        
	//   15   28:getstatic       #110 <Field PdfName PdfName.ROTATE>
	//   16   31:aastore         
	//   17   32:dup             
	//   18   33:iconst_2        
	//   19   34:getstatic       #113 <Field PdfName PdfName.RESOURCES>
	//   20   37:aastore         
	//   21   38:dup             
	//   22   39:iconst_3        
	//   23   40:getstatic       #116 <Field PdfName PdfName.CROPBOX>
	//   24   43:aastore         
	//   25   44:putstatic       #118 <Field PdfName[] pageInhCandidates>
	//   26   47:ldc1            #119 <String "endstream">
	//   27   49:aconst_null     
	//   28   50:invokestatic    #125 <Method byte[] PdfEncodings.convertToBytes(String, String)>
	//   29   53:putstatic       #127 <Field byte[] endstream>
	//   30   56:ldc1            #128 <String "endobj">
	//   31   58:aconst_null     
	//   32   59:invokestatic    #125 <Method byte[] PdfEncodings.convertToBytes(String, String)>
	//   33   62:putstatic       #130 <Field byte[] endobj>
	//   34   65:ldc1            #2   <Class PdfReader>
	//   35   67:invokestatic    #136 <Method Counter CounterFactory.getCounter(Class)>
	//   36   70:putstatic       #138 <Field Counter COUNTER>
	//*  37   73:return          
	}


/*
	static boolean access$200(PdfReader pdfreader)
	{
		return pdfreader.partial;
	//    0    0:aload_0         
	//    1    1:getfield        #187 <Field boolean partial>
	//    2    4:ireturn         
	}

*/


/*
	static int access$300(PdfReader pdfreader)
	{
		return pdfreader.lastXrefPartial;
	//    0    0:aload_0         
	//    1    1:getfield        #178 <Field int lastXrefPartial>
	//    2    4:ireturn         
	}

*/


/*
	static int access$302(PdfReader pdfreader, int i)
	{
		pdfreader.lastXrefPartial = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #178 <Field int lastXrefPartial>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/
}
