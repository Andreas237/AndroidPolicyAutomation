// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.io.StreamUtil;
import com.itextpdf.text.pdf.collection.PdfCollectionItem;
import java.io.*;
import java.net.URL;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfDictionary, PdfName, PdfString, PdfWriter, 
//			PdfEFStream, PdfDate, PdfIndirectObject, PdfNumber, 
//			PdfBoolean, PdfIndirectReference

public class PdfFileSpecification extends PdfDictionary
{

	public PdfFileSpecification()
	{
		super(PdfName.FILESPEC);
	//    0    0:aload_0         
	//    1    1:getstatic       #16  <Field PdfName PdfName.FILESPEC>
	//    2    4:invokespecial   #19  <Method void PdfDictionary(PdfName)>
	//    3    7:return          
	}

	public static PdfFileSpecification fileEmbedded(PdfWriter pdfwriter, String s, String s1, byte abyte0[])
		throws IOException
	{
		return fileEmbedded(pdfwriter, s, s1, abyte0, 9);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:bipush          9
	//    5    6:invokestatic    #27  <Method PdfFileSpecification fileEmbedded(PdfWriter, String, String, byte[], int)>
	//    6    9:areturn         
	}

	public static PdfFileSpecification fileEmbedded(PdfWriter pdfwriter, String s, String s1, byte abyte0[], int i)
		throws IOException
	{
		return fileEmbedded(pdfwriter, s, s1, abyte0, ((String) (null)), ((PdfDictionary) (null)), i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:iload           4
	//    7    8:invokestatic    #31  <Method PdfFileSpecification fileEmbedded(PdfWriter, String, String, byte[], String, PdfDictionary, int)>
	//    8   11:areturn         
	}

	public static PdfFileSpecification fileEmbedded(PdfWriter pdfwriter, String s, String s1, byte abyte0[], String s2, PdfDictionary pdfdictionary, int i)
		throws IOException
	{
		Object obj1;
		Object obj3;
		PdfFileSpecification pdffilespecification;
		pdffilespecification = new PdfFileSpecification();
	//    0    0:new             #2   <Class PdfFileSpecification>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void PdfFileSpecification()>
	//    3    7:astore          11
		pdffilespecification.writer = pdfwriter;
	//    4    9:aload           11
	//    5   11:aload_0         
	//    6   12:putfield        #37  <Field PdfWriter writer>
		pdffilespecification.put(PdfName.F, ((PdfObject) (new PdfString(s1))));
	//    7   15:aload           11
	//    8   17:getstatic       #40  <Field PdfName PdfName.F>
	//    9   20:new             #42  <Class PdfString>
	//   10   23:dup             
	//   11   24:aload_2         
	//   12   25:invokespecial   #45  <Method void PdfString(String)>
	//   13   28:invokevirtual   #49  <Method void put(PdfName, PdfObject)>
		pdffilespecification.setUnicodeFileName(s1, false);
	//   14   31:aload           11
	//   15   33:aload_2         
	//   16   34:iconst_0        
	//   17   35:invokevirtual   #53  <Method void setUnicodeFileName(String, boolean)>
		obj3 = null;
	//   18   38:aconst_null     
	//   19   39:astore          10
		s1 = null;
	//   20   41:aconst_null     
	//   21   42:astore_2        
		obj1 = null;
	//   22   43:aconst_null     
	//   23   44:astore          8
		if(abyte0 != null) goto _L2; else goto _L1
	//   24   46:aload_3         
	//   25   47:ifnonnull       465
_L1:
		Object obj = ((Object) (obj3));
	//   26   50:aload           10
	//   27   52:astore          7
		Object obj2 = ((Object) (pdfwriter.getPdfIndirectReference()));
	//   28   54:aload_0         
	//   29   55:invokevirtual   #59  <Method PdfIndirectReference PdfWriter.getPdfIndirectReference()>
	//   30   58:astore          9
		obj = ((Object) (obj3));
	//   31   60:aload           10
	//   32   62:astore          7
		if(!(new File(s)).canRead()) goto _L4; else goto _L3
	//   33   64:new             #61  <Class File>
	//   34   67:dup             
	//   35   68:aload_1         
	//   36   69:invokespecial   #62  <Method void File(String)>
	//   37   72:invokevirtual   #66  <Method boolean File.canRead()>
	//   38   75:ifeq            338
_L3:
		obj = ((Object) (obj3));
	//   39   78:aload           10
	//   40   80:astore          7
		s1 = ((String) (new FileInputStream(s)));
	//   41   82:new             #68  <Class FileInputStream>
	//   42   85:dup             
	//   43   86:aload_1         
	//   44   87:invokespecial   #69  <Method void FileInputStream(String)>
	//   45   90:astore_2        
_L7:
		obj = ((Object) (s1));
	//   46   91:aload_2         
	//   47   92:astore          7
		obj1 = ((Object) (new PdfEFStream(((InputStream) (s1)), pdfwriter)));
	//   48   94:new             #71  <Class PdfEFStream>
	//   49   97:dup             
	//   50   98:aload_2         
	//   51   99:aload_0         
	//   52  100:invokespecial   #74  <Method void PdfEFStream(InputStream, PdfWriter)>
	//   53  103:astore          8
		s = ((String) (obj2));
	//   54  105:aload           9
	//   55  107:astore_1        
_L9:
		obj = ((Object) (s1));
	//   56  108:aload_2         
	//   57  109:astore          7
		((PdfEFStream) (obj1)).put(PdfName.TYPE, ((PdfObject) (PdfName.EMBEDDEDFILE)));
	//   58  111:aload           8
	//   59  113:getstatic       #77  <Field PdfName PdfName.TYPE>
	//   60  116:getstatic       #80  <Field PdfName PdfName.EMBEDDEDFILE>
	//   61  119:invokevirtual   #81  <Method void PdfEFStream.put(PdfName, PdfObject)>
		obj = ((Object) (s1));
	//   62  122:aload_2         
	//   63  123:astore          7
		((PdfEFStream) (obj1)).flateCompress(i);
	//   64  125:aload           8
	//   65  127:iload           6
	//   66  129:invokevirtual   #85  <Method void PdfEFStream.flateCompress(int)>
		obj = ((Object) (s1));
	//   67  132:aload_2         
	//   68  133:astore          7
		obj2 = ((Object) (new PdfDictionary()));
	//   69  135:new             #4   <Class PdfDictionary>
	//   70  138:dup             
	//   71  139:invokespecial   #86  <Method void PdfDictionary()>
	//   72  142:astore          9
		if(pdfdictionary == null)
			break MISSING_BLOCK_LABEL_159;
	//   73  144:aload           5
	//   74  146:ifnull          159
		obj = ((Object) (s1));
	//   75  149:aload_2         
	//   76  150:astore          7
		((PdfDictionary) (obj2)).merge(pdfdictionary);
	//   77  152:aload           9
	//   78  154:aload           5
	//   79  156:invokevirtual   #90  <Method void PdfDictionary.merge(PdfDictionary)>
		obj = ((Object) (s1));
	//   80  159:aload_2         
	//   81  160:astore          7
		if(((PdfDictionary) (obj2)).contains(PdfName.MODDATE))
			break MISSING_BLOCK_LABEL_191;
	//   82  162:aload           9
	//   83  164:getstatic       #93  <Field PdfName PdfName.MODDATE>
	//   84  167:invokevirtual   #97  <Method boolean PdfDictionary.contains(PdfName)>
	//   85  170:ifne            191
		obj = ((Object) (s1));
	//   86  173:aload_2         
	//   87  174:astore          7
		((PdfDictionary) (obj2)).put(PdfName.MODDATE, ((PdfObject) (new PdfDate())));
	//   88  176:aload           9
	//   89  178:getstatic       #93  <Field PdfName PdfName.MODDATE>
	//   90  181:new             #99  <Class PdfDate>
	//   91  184:dup             
	//   92  185:invokespecial   #100 <Method void PdfDate()>
	//   93  188:invokevirtual   #101 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(abyte0 != null) goto _L6; else goto _L5
	//   94  191:aload_3         
	//   95  192:ifnonnull       489
_L5:
		obj = ((Object) (s1));
	//   96  195:aload_2         
	//   97  196:astore          7
		((PdfEFStream) (obj1)).put(PdfName.PARAMS, ((PdfObject) (s)));
	//   98  198:aload           8
	//   99  200:getstatic       #104 <Field PdfName PdfName.PARAMS>
	//  100  203:aload_1         
	//  101  204:invokevirtual   #81  <Method void PdfEFStream.put(PdfName, PdfObject)>
_L10:
		if(s2 == null)
			break MISSING_BLOCK_LABEL_232;
	//  102  207:aload           4
	//  103  209:ifnull          232
		obj = ((Object) (s1));
	//  104  212:aload_2         
	//  105  213:astore          7
		((PdfEFStream) (obj1)).put(PdfName.SUBTYPE, ((PdfObject) (new PdfName(s2))));
	//  106  215:aload           8
	//  107  217:getstatic       #107 <Field PdfName PdfName.SUBTYPE>
	//  108  220:new             #12  <Class PdfName>
	//  109  223:dup             
	//  110  224:aload           4
	//  111  226:invokespecial   #108 <Method void PdfName(String)>
	//  112  229:invokevirtual   #81  <Method void PdfEFStream.put(PdfName, PdfObject)>
		obj = ((Object) (s1));
	//  113  232:aload_2         
	//  114  233:astore          7
		s2 = ((String) (pdfwriter.addToBody(((PdfObject) (obj1))).getIndirectReference()));
	//  115  235:aload_0         
	//  116  236:aload           8
	//  117  238:invokevirtual   #112 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//  118  241:invokevirtual   #117 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  119  244:astore          4
		if(abyte0 != null)
			break MISSING_BLOCK_LABEL_292;
	//  120  246:aload_3         
	//  121  247:ifnonnull       292
		obj = ((Object) (s1));
	//  122  250:aload_2         
	//  123  251:astore          7
		((PdfEFStream) (obj1)).writeLength();
	//  124  253:aload           8
	//  125  255:invokevirtual   #120 <Method void PdfEFStream.writeLength()>
		obj = ((Object) (s1));
	//  126  258:aload_2         
	//  127  259:astore          7
		((PdfDictionary) (obj2)).put(PdfName.SIZE, ((PdfObject) (new PdfNumber(((PdfEFStream) (obj1)).getRawLength()))));
	//  128  261:aload           9
	//  129  263:getstatic       #123 <Field PdfName PdfName.SIZE>
	//  130  266:new             #125 <Class PdfNumber>
	//  131  269:dup             
	//  132  270:aload           8
	//  133  272:invokevirtual   #129 <Method int PdfEFStream.getRawLength()>
	//  134  275:invokespecial   #131 <Method void PdfNumber(int)>
	//  135  278:invokevirtual   #101 <Method void PdfDictionary.put(PdfName, PdfObject)>
		obj = ((Object) (s1));
	//  136  281:aload_2         
	//  137  282:astore          7
		pdfwriter.addToBody(((PdfObject) (obj2)), ((PdfIndirectReference) (s)));
	//  138  284:aload_0         
	//  139  285:aload           9
	//  140  287:aload_1         
	//  141  288:invokevirtual   #134 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject, PdfIndirectReference)>
	//  142  291:pop             
		if(s1 != null)
	//* 143  292:aload_2         
	//* 144  293:ifnull          300
			try
			{
				((InputStream) (s1)).close();
	//  145  296:aload_2         
	//  146  297:invokevirtual   #139 <Method void InputStream.close()>
			}
	//* 147  300:new             #4   <Class PdfDictionary>
	//* 148  303:dup             
	//* 149  304:invokespecial   #86  <Method void PdfDictionary()>
	//* 150  307:astore_0        
	//* 151  308:aload_0         
	//* 152  309:getstatic       #40  <Field PdfName PdfName.F>
	//* 153  312:aload           4
	//* 154  314:invokevirtual   #101 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 155  317:aload_0         
	//* 156  318:getstatic       #142 <Field PdfName PdfName.UF>
	//* 157  321:aload           4
	//* 158  323:invokevirtual   #101 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 159  326:aload           11
	//* 160  328:getstatic       #145 <Field PdfName PdfName.EF>
	//* 161  331:aload_0         
	//* 162  332:invokevirtual   #49  <Method void put(PdfName, PdfObject)>
	//* 163  335:aload           11
	//* 164  337:areturn         
	//* 165  338:aload           10
	//* 166  340:astore          7
	//* 167  342:aload_1         
	//* 168  343:ldc1            #147 <String "file:/">
	//* 169  345:invokevirtual   #153 <Method boolean String.startsWith(String)>
	//* 170  348:ifne            390
	//* 171  351:aload           10
	//* 172  353:astore          7
	//* 173  355:aload_1         
	//* 174  356:ldc1            #155 <String "http://">
	//* 175  358:invokevirtual   #153 <Method boolean String.startsWith(String)>
	//* 176  361:ifne            390
	//* 177  364:aload           10
	//* 178  366:astore          7
	//* 179  368:aload_1         
	//* 180  369:ldc1            #157 <String "https://">
	//* 181  371:invokevirtual   #153 <Method boolean String.startsWith(String)>
	//* 182  374:ifne            390
	//* 183  377:aload           10
	//* 184  379:astore          7
	//* 185  381:aload_1         
	//* 186  382:ldc1            #159 <String "jar:">
	//* 187  384:invokevirtual   #153 <Method boolean String.startsWith(String)>
	//* 188  387:ifeq            409
	//* 189  390:aload           10
	//* 190  392:astore          7
	//* 191  394:new             #161 <Class URL>
	//* 192  397:dup             
	//* 193  398:aload_1         
	//* 194  399:invokespecial   #162 <Method void URL(String)>
	//* 195  402:invokevirtual   #166 <Method InputStream URL.openStream()>
	//* 196  405:astore_2        
	//* 197  406:goto            91
	//* 198  409:aload           10
	//* 199  411:astore          7
	//* 200  413:aload_1         
	//* 201  414:invokestatic    #172 <Method InputStream StreamUtil.getResourceStream(String)>
	//* 202  417:astore          8
	//* 203  419:aload           8
	//* 204  421:astore_2        
	//* 205  422:aload           8
	//* 206  424:ifnonnull       91
	//* 207  427:aload           8
	//* 208  429:astore          7
	//* 209  431:new             #24  <Class IOException>
	//* 210  434:dup             
	//* 211  435:ldc1            #174 <String "1.not.found.as.file.or.resource">
	//* 212  437:iconst_1        
	//* 213  438:anewarray       Object[]
	//* 214  441:dup             
	//* 215  442:iconst_0        
	//* 216  443:aload_1         
	//* 217  444:aastore         
	//* 218  445:invokestatic    #182 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//* 219  448:invokespecial   #183 <Method void IOException(String)>
	//* 220  451:athrow          
	//* 221  452:astore_0        
	//* 222  453:aload           7
	//* 223  455:ifnull          463
	//* 224  458:aload           7
	//* 225  460:invokevirtual   #139 <Method void InputStream.close()>
	//* 226  463:aload_0         
	//* 227  464:athrow          
	//* 228  465:aload           10
	//* 229  467:astore          7
	//* 230  469:new             #71  <Class PdfEFStream>
	//* 231  472:dup             
	//* 232  473:aload_3         
	//* 233  474:invokespecial   #186 <Method void PdfEFStream(byte[])>
	//* 234  477:astore          9
	//* 235  479:aload           8
	//* 236  481:astore_1        
	//* 237  482:aload           9
	//* 238  484:astore          8
	//* 239  486:goto            108
	//* 240  489:aload_2         
	//* 241  490:astore          7
	//* 242  492:aload           9
	//* 243  494:getstatic       #123 <Field PdfName PdfName.SIZE>
	//* 244  497:new             #125 <Class PdfNumber>
	//* 245  500:dup             
	//* 246  501:aload           8
	//* 247  503:invokevirtual   #129 <Method int PdfEFStream.getRawLength()>
	//* 248  506:invokespecial   #131 <Method void PdfNumber(int)>
	//* 249  509:invokevirtual   #101 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 250  512:aload_2         
	//* 251  513:astore          7
	//* 252  515:aload           8
	//* 253  517:getstatic       #104 <Field PdfName PdfName.PARAMS>
	//* 254  520:aload           9
	//* 255  522:invokevirtual   #81  <Method void PdfEFStream.put(PdfName, PdfObject)>
	//* 256  525:goto            207
			// Misplaced declaration of an exception variable
			catch(PdfWriter pdfwriter) { }
	//  257  528:astore_0        
		pdfwriter = ((PdfWriter) (new PdfDictionary()));
		((PdfDictionary) (pdfwriter)).put(PdfName.F, ((PdfObject) (s2)));
		((PdfDictionary) (pdfwriter)).put(PdfName.UF, ((PdfObject) (s2)));
		pdffilespecification.put(PdfName.EF, ((PdfObject) (pdfwriter)));
		return pdffilespecification;
_L4:
		obj = ((Object) (obj3));
		if(s.startsWith("file:/"))
			break MISSING_BLOCK_LABEL_390;
		obj = ((Object) (obj3));
		if(s.startsWith("http://"))
			break MISSING_BLOCK_LABEL_390;
		obj = ((Object) (obj3));
		if(s.startsWith("https://"))
			break MISSING_BLOCK_LABEL_390;
		obj = ((Object) (obj3));
		if(!s.startsWith("jar:"))
			break MISSING_BLOCK_LABEL_409;
		obj = ((Object) (obj3));
		s1 = ((String) ((new URL(s)).openStream()));
		  goto _L7
		obj = ((Object) (obj3));
		obj1 = ((Object) (StreamUtil.getResourceStream(s)));
		s1 = ((String) (obj1));
		if(obj1 != null) goto _L7; else goto _L8
_L8:
		obj = obj1;
		throw new IOException(MessageLocalization.getComposedMessage("1.not.found.as.file.or.resource", new Object[] {
			s
		}));
		pdfwriter;
		if(obj != null)
			try
			{
				((InputStream) (obj)).close();
			}
	//* 258  529:goto            300
			// Misplaced declaration of an exception variable
			catch(String s) { }
	//  259  532:astore_1        
		throw pdfwriter;
_L2:
		obj = ((Object) (obj3));
		obj2 = ((Object) (new PdfEFStream(abyte0)));
		s = ((String) (obj1));
		obj1 = obj2;
		  goto _L9
_L6:
		obj = ((Object) (s1));
		((PdfDictionary) (obj2)).put(PdfName.SIZE, ((PdfObject) (new PdfNumber(((PdfEFStream) (obj1)).getRawLength()))));
		obj = ((Object) (s1));
		((PdfEFStream) (obj1)).put(PdfName.PARAMS, ((PdfObject) (obj2)));
		  goto _L10
	//* 260  533:goto            463
	}

	public static PdfFileSpecification fileEmbedded(PdfWriter pdfwriter, String s, String s1, byte abyte0[], boolean flag)
		throws IOException
	{
		byte byte0;
		if(flag)
	//*   0    0:iload           4
	//*   1    2:ifeq            21
			byte0 = 9;
	//    2    5:bipush          9
	//    3    7:istore          5
		else
	//*   4    9:aload_0         
	//*   5   10:aload_1         
	//*   6   11:aload_2         
	//*   7   12:aload_3         
	//*   8   13:aconst_null     
	//*   9   14:aconst_null     
	//*  10   15:iload           5
	//*  11   17:invokestatic    #31  <Method PdfFileSpecification fileEmbedded(PdfWriter, String, String, byte[], String, PdfDictionary, int)>
	//*  12   20:areturn         
			byte0 = 0;
	//   13   21:iconst_0        
	//   14   22:istore          5
		return fileEmbedded(pdfwriter, s, s1, abyte0, ((String) (null)), ((PdfDictionary) (null)), ((int) (byte0)));
	//*  15   24:goto            9
	}

	public static PdfFileSpecification fileEmbedded(PdfWriter pdfwriter, String s, String s1, byte abyte0[], boolean flag, String s2, PdfDictionary pdfdictionary)
		throws IOException
	{
		byte byte0;
		if(flag)
	//*   0    0:iload           4
	//*   1    2:ifeq            23
			byte0 = 9;
	//    2    5:bipush          9
	//    3    7:istore          7
		else
	//*   4    9:aload_0         
	//*   5   10:aload_1         
	//*   6   11:aload_2         
	//*   7   12:aload_3         
	//*   8   13:aload           5
	//*   9   15:aload           6
	//*  10   17:iload           7
	//*  11   19:invokestatic    #31  <Method PdfFileSpecification fileEmbedded(PdfWriter, String, String, byte[], String, PdfDictionary, int)>
	//*  12   22:areturn         
			byte0 = 0;
	//   13   23:iconst_0        
	//   14   24:istore          7
		return fileEmbedded(pdfwriter, s, s1, abyte0, s2, pdfdictionary, ((int) (byte0)));
	//*  15   26:goto            9
	}

	public static PdfFileSpecification fileExtern(PdfWriter pdfwriter, String s)
	{
		PdfFileSpecification pdffilespecification = new PdfFileSpecification();
	//    0    0:new             #2   <Class PdfFileSpecification>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void PdfFileSpecification()>
	//    3    7:astore_2        
		pdffilespecification.writer = pdfwriter;
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:putfield        #37  <Field PdfWriter writer>
		pdffilespecification.put(PdfName.F, ((PdfObject) (new PdfString(s))));
	//    7   13:aload_2         
	//    8   14:getstatic       #40  <Field PdfName PdfName.F>
	//    9   17:new             #42  <Class PdfString>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:invokespecial   #45  <Method void PdfString(String)>
	//   13   25:invokevirtual   #49  <Method void put(PdfName, PdfObject)>
		pdffilespecification.setUnicodeFileName(s, false);
	//   14   28:aload_2         
	//   15   29:aload_1         
	//   16   30:iconst_0        
	//   17   31:invokevirtual   #53  <Method void setUnicodeFileName(String, boolean)>
		return pdffilespecification;
	//   18   34:aload_2         
	//   19   35:areturn         
	}

	public static PdfFileSpecification url(PdfWriter pdfwriter, String s)
	{
		PdfFileSpecification pdffilespecification = new PdfFileSpecification();
	//    0    0:new             #2   <Class PdfFileSpecification>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void PdfFileSpecification()>
	//    3    7:astore_2        
		pdffilespecification.writer = pdfwriter;
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:putfield        #37  <Field PdfWriter writer>
		pdffilespecification.put(PdfName.FS, ((PdfObject) (com.itextpdf.text.pdf.PdfName.URL)));
	//    7   13:aload_2         
	//    8   14:getstatic       #194 <Field PdfName PdfName.FS>
	//    9   17:getstatic       #197 <Field PdfName com.itextpdf.text.pdf.PdfName.URL>
	//   10   20:invokevirtual   #49  <Method void put(PdfName, PdfObject)>
		pdffilespecification.put(PdfName.F, ((PdfObject) (new PdfString(s))));
	//   11   23:aload_2         
	//   12   24:getstatic       #40  <Field PdfName PdfName.F>
	//   13   27:new             #42  <Class PdfString>
	//   14   30:dup             
	//   15   31:aload_1         
	//   16   32:invokespecial   #45  <Method void PdfString(String)>
	//   17   35:invokevirtual   #49  <Method void put(PdfName, PdfObject)>
		return pdffilespecification;
	//   18   38:aload_2         
	//   19   39:areturn         
	}

	public void addCollectionItem(PdfCollectionItem pdfcollectionitem)
	{
		put(PdfName.CI, ((PdfObject) (pdfcollectionitem)));
	//    0    0:aload_0         
	//    1    1:getstatic       #202 <Field PdfName PdfName.CI>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #49  <Method void put(PdfName, PdfObject)>
	//    4    8:return          
	}

	public void addDescription(String s, boolean flag)
	{
		PdfName pdfname = PdfName.DESC;
	//    0    0:getstatic       #206 <Field PdfName PdfName.DESC>
	//    1    3:astore          4
		String s1;
		if(flag)
	//*   2    5:iload_2         
	//*   3    6:ifeq            28
			s1 = "UnicodeBig";
	//    4    9:ldc1            #208 <String "UnicodeBig">
	//    5   11:astore_3        
		else
	//*   6   12:aload_0         
	//*   7   13:aload           4
	//*   8   15:new             #42  <Class PdfString>
	//*   9   18:dup             
	//*  10   19:aload_1         
	//*  11   20:aload_3         
	//*  12   21:invokespecial   #211 <Method void PdfString(String, String)>
	//*  13   24:invokevirtual   #49  <Method void put(PdfName, PdfObject)>
	//*  14   27:return          
			s1 = "PDF";
	//   15   28:ldc1            #213 <String "PDF">
	//   16   30:astore_3        
		put(pdfname, ((PdfObject) (new PdfString(s, s1))));
	//*  17   31:goto            12
	}

	public PdfIndirectReference getReference()
		throws IOException
	{
		if(ref != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #216 <Field PdfIndirectReference ref>
	//*   2    4:ifnull          12
		{
			return ref;
	//    3    7:aload_0         
	//    4    8:getfield        #216 <Field PdfIndirectReference ref>
	//    5   11:areturn         
		} else
		{
			ref = writer.addToBody(((PdfObject) (this))).getIndirectReference();
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #37  <Field PdfWriter writer>
	//    9   17:aload_0         
	//   10   18:invokevirtual   #112 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//   11   21:invokevirtual   #117 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//   12   24:putfield        #216 <Field PdfIndirectReference ref>
			return ref;
	//   13   27:aload_0         
	//   14   28:getfield        #216 <Field PdfIndirectReference ref>
	//   15   31:areturn         
		}
	}

	public void setMultiByteFileName(byte abyte0[])
	{
		put(PdfName.F, ((PdfObject) ((new PdfString(abyte0)).setHexWriting(true))));
	//    0    0:aload_0         
	//    1    1:getstatic       #40  <Field PdfName PdfName.F>
	//    2    4:new             #42  <Class PdfString>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #218 <Method void PdfString(byte[])>
	//    6   12:iconst_1        
	//    7   13:invokevirtual   #222 <Method PdfString PdfString.setHexWriting(boolean)>
	//    8   16:invokevirtual   #49  <Method void put(PdfName, PdfObject)>
	//    9   19:return          
	}

	public void setUnicodeFileName(String s, boolean flag)
	{
		PdfName pdfname = PdfName.UF;
	//    0    0:getstatic       #142 <Field PdfName PdfName.UF>
	//    1    3:astore          4
		String s1;
		if(flag)
	//*   2    5:iload_2         
	//*   3    6:ifeq            28
			s1 = "UnicodeBig";
	//    4    9:ldc1            #208 <String "UnicodeBig">
	//    5   11:astore_3        
		else
	//*   6   12:aload_0         
	//*   7   13:aload           4
	//*   8   15:new             #42  <Class PdfString>
	//*   9   18:dup             
	//*  10   19:aload_1         
	//*  11   20:aload_3         
	//*  12   21:invokespecial   #211 <Method void PdfString(String, String)>
	//*  13   24:invokevirtual   #49  <Method void put(PdfName, PdfObject)>
	//*  14   27:return          
			s1 = "PDF";
	//   15   28:ldc1            #213 <String "PDF">
	//   16   30:astore_3        
		put(pdfname, ((PdfObject) (new PdfString(s, s1))));
	//*  17   31:goto            12
	}

	public void setVolatile(boolean flag)
	{
		put(PdfName.V, ((PdfObject) (new PdfBoolean(flag))));
	//    0    0:aload_0         
	//    1    1:getstatic       #227 <Field PdfName PdfName.V>
	//    2    4:new             #229 <Class PdfBoolean>
	//    3    7:dup             
	//    4    8:iload_1         
	//    5    9:invokespecial   #231 <Method void PdfBoolean(boolean)>
	//    6   12:invokevirtual   #49  <Method void put(PdfName, PdfObject)>
	//    7   15:return          
	}

	public void toPdf(PdfWriter pdfwriter, OutputStream outputstream)
		throws IOException
	{
		PdfWriter.checkPdfIsoConformance(pdfwriter, 10, ((Object) (this)));
	//    0    0:aload_1         
	//    1    1:bipush          10
	//    2    3:aload_0         
	//    3    4:invokestatic    #237 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
		super.toPdf(pdfwriter, outputstream);
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:aload_2         
	//    7   10:invokespecial   #239 <Method void PdfDictionary.toPdf(PdfWriter, OutputStream)>
	//    8   13:return          
	}

	protected PdfIndirectReference ref;
	protected PdfWriter writer;
}
