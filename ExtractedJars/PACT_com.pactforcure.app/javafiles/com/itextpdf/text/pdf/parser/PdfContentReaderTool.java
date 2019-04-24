// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.*;
import java.io.*;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			ContentByteUtils, LocationTextExtractionStrategy, PdfTextExtractor

public class PdfContentReaderTool
{

	public PdfContentReaderTool()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static String getDictionaryDetail(PdfDictionary pdfdictionary)
	{
		return getDictionaryDetail(pdfdictionary, 0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #14  <Method String getDictionaryDetail(PdfDictionary, int)>
	//    3    5:areturn         
	}

	public static String getDictionaryDetail(PdfDictionary pdfdictionary, int i)
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #16  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void StringBuffer()>
	//    3    7:astore_3        
		stringbuffer.append('(');
	//    4    8:aload_3         
	//    5    9:bipush          40
	//    6   11:invokevirtual   #21  <Method StringBuffer StringBuffer.append(char)>
	//    7   14:pop             
		Object obj = ((Object) (new ArrayList()));
	//    8   15:new             #23  <Class ArrayList>
	//    9   18:dup             
	//   10   19:invokespecial   #24  <Method void ArrayList()>
	//   11   22:astore          4
		for(Iterator iterator = pdfdictionary.getKeys().iterator(); iterator.hasNext(); stringbuffer.append(", "))
	//*  12   24:aload_0         
	//*  13   25:invokevirtual   #30  <Method Set PdfDictionary.getKeys()>
	//*  14   28:invokeinterface #36  <Method Iterator Set.iterator()>
	//*  15   33:astore          5
	//*  16   35:aload           5
	//*  17   37:invokeinterface #42  <Method boolean Iterator.hasNext()>
	//*  18   42:ifeq            114
		{
			PdfName pdfname1 = (PdfName)iterator.next();
	//   19   45:aload           5
	//   20   47:invokeinterface #46  <Method Object Iterator.next()>
	//   21   52:checkcast       #48  <Class PdfName>
	//   22   55:astore          6
			PdfObject pdfobject = pdfdictionary.getDirectObject(pdfname1);
	//   23   57:aload_0         
	//   24   58:aload           6
	//   25   60:invokevirtual   #52  <Method PdfObject PdfDictionary.getDirectObject(PdfName)>
	//   26   63:astore          7
			if(pdfobject.isDictionary())
	//*  27   65:aload           7
	//*  28   67:invokevirtual   #57  <Method boolean PdfObject.isDictionary()>
	//*  29   70:ifeq            83
				((List) (obj)).add(((Object) (pdfname1)));
	//   30   73:aload           4
	//   31   75:aload           6
	//   32   77:invokeinterface #63  <Method boolean List.add(Object)>
	//   33   82:pop             
			stringbuffer.append(((Object) (pdfname1)));
	//   34   83:aload_3         
	//   35   84:aload           6
	//   36   86:invokevirtual   #66  <Method StringBuffer StringBuffer.append(Object)>
	//   37   89:pop             
			stringbuffer.append('=');
	//   38   90:aload_3         
	//   39   91:bipush          61
	//   40   93:invokevirtual   #21  <Method StringBuffer StringBuffer.append(char)>
	//   41   96:pop             
			stringbuffer.append(((Object) (pdfobject)));
	//   42   97:aload_3         
	//   43   98:aload           7
	//   44  100:invokevirtual   #66  <Method StringBuffer StringBuffer.append(Object)>
	//   45  103:pop             
		}

	//   46  104:aload_3         
	//   47  105:ldc1            #68  <String ", ">
	//   48  107:invokevirtual   #71  <Method StringBuffer StringBuffer.append(String)>
	//   49  110:pop             
	//*  50  111:goto            35
		if(stringbuffer.length() >= 2)
	//*  51  114:aload_3         
	//*  52  115:invokevirtual   #75  <Method int StringBuffer.length()>
	//*  53  118:iconst_2        
	//*  54  119:icmplt          132
			stringbuffer.setLength(stringbuffer.length() - 2);
	//   55  122:aload_3         
	//   56  123:aload_3         
	//   57  124:invokevirtual   #75  <Method int StringBuffer.length()>
	//   58  127:iconst_2        
	//   59  128:isub            
	//   60  129:invokevirtual   #79  <Method void StringBuffer.setLength(int)>
		stringbuffer.append(')');
	//   61  132:aload_3         
	//   62  133:bipush          41
	//   63  135:invokevirtual   #21  <Method StringBuffer StringBuffer.append(char)>
	//   64  138:pop             
		PdfName pdfname;
		for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); stringbuffer.append(getDictionaryDetail(pdfdictionary.getAsDict(pdfname), i + 1)))
	//*  65  139:aload           4
	//*  66  141:invokeinterface #80  <Method Iterator List.iterator()>
	//*  67  146:astore          4
	//*  68  148:aload           4
	//*  69  150:invokeinterface #42  <Method boolean Iterator.hasNext()>
	//*  70  155:ifeq            241
		{
			pdfname = (PdfName)((Iterator) (obj)).next();
	//   71  158:aload           4
	//   72  160:invokeinterface #46  <Method Object Iterator.next()>
	//   73  165:checkcast       #48  <Class PdfName>
	//   74  168:astore          5
			stringbuffer.append('\n');
	//   75  170:aload_3         
	//   76  171:bipush          10
	//   77  173:invokevirtual   #21  <Method StringBuffer StringBuffer.append(char)>
	//   78  176:pop             
			for(int j = 0; j < i + 1; j++)
	//*  79  177:iconst_0        
	//*  80  178:istore_2        
	//*  81  179:iload_2         
	//*  82  180:iload_1         
	//*  83  181:iconst_1        
	//*  84  182:iadd            
	//*  85  183:icmpge          200
				stringbuffer.append('\t');
	//   86  186:aload_3         
	//   87  187:bipush          9
	//   88  189:invokevirtual   #21  <Method StringBuffer StringBuffer.append(char)>
	//   89  192:pop             

	//   90  193:iload_2         
	//   91  194:iconst_1        
	//   92  195:iadd            
	//   93  196:istore_2        
	//*  94  197:goto            179
			stringbuffer.append("Subdictionary ");
	//   95  200:aload_3         
	//   96  201:ldc1            #82  <String "Subdictionary ">
	//   97  203:invokevirtual   #71  <Method StringBuffer StringBuffer.append(String)>
	//   98  206:pop             
			stringbuffer.append(((Object) (pdfname)));
	//   99  207:aload_3         
	//  100  208:aload           5
	//  101  210:invokevirtual   #66  <Method StringBuffer StringBuffer.append(Object)>
	//  102  213:pop             
			stringbuffer.append(" = ");
	//  103  214:aload_3         
	//  104  215:ldc1            #84  <String " = ">
	//  105  217:invokevirtual   #71  <Method StringBuffer StringBuffer.append(String)>
	//  106  220:pop             
		}

	//  107  221:aload_3         
	//  108  222:aload_0         
	//  109  223:aload           5
	//  110  225:invokevirtual   #88  <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//  111  228:iload_1         
	//  112  229:iconst_1        
	//  113  230:iadd            
	//  114  231:invokestatic    #14  <Method String getDictionaryDetail(PdfDictionary, int)>
	//  115  234:invokevirtual   #71  <Method StringBuffer StringBuffer.append(String)>
	//  116  237:pop             
	//* 117  238:goto            148
		return stringbuffer.toString();
	//  118  241:aload_3         
	//  119  242:invokevirtual   #92  <Method String StringBuffer.toString()>
	//  120  245:areturn         
	}

	public static String getXObjectDetail(PdfDictionary pdfdictionary)
		throws IOException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #97  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #98  <Method void StringBuilder()>
	//    3    7:astore_2        
		pdfdictionary = pdfdictionary.getAsDict(PdfName.XOBJECT);
	//    4    8:aload_0         
	//    5    9:getstatic       #102 <Field PdfName PdfName.XOBJECT>
	//    6   12:invokevirtual   #88  <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//    7   15:astore_0        
		if(pdfdictionary == null)
	//*   8   16:aload_0         
	//*   9   17:ifnonnull       23
			return "No XObjects";
	//   10   20:ldc1            #104 <String "No XObjects">
	//   11   22:areturn         
		Iterator iterator = pdfdictionary.getKeys().iterator();
	//   12   23:aload_0         
	//   13   24:invokevirtual   #30  <Method Set PdfDictionary.getKeys()>
	//   14   27:invokeinterface #36  <Method Iterator Set.iterator()>
	//   15   32:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   16   33:aload_3         
	//   17   34:invokeinterface #42  <Method boolean Iterator.hasNext()>
	//   18   39:ifeq            229
			PdfName pdfname = (PdfName)iterator.next();
	//   19   42:aload_3         
	//   20   43:invokeinterface #46  <Method Object Iterator.next()>
	//   21   48:checkcast       #48  <Class PdfName>
	//   22   51:astore          4
			PdfStream pdfstream = pdfdictionary.getAsStream(pdfname);
	//   23   53:aload_0         
	//   24   54:aload           4
	//   25   56:invokevirtual   #108 <Method PdfStream PdfDictionary.getAsStream(PdfName)>
	//   26   59:astore          5
			stringbuilder.append((new StringBuilder()).append("------ ").append(((Object) (pdfname))).append(" - subtype = ").append(((Object) (pdfstream.get(PdfName.SUBTYPE)))).append(" = ").append(((Object) (pdfstream.getAsNumber(PdfName.LENGTH)))).append(" bytes ------\n").toString());
	//   27   61:aload_2         
	//   28   62:new             #97  <Class StringBuilder>
	//   29   65:dup             
	//   30   66:invokespecial   #98  <Method void StringBuilder()>
	//   31   69:ldc1            #110 <String "------ ">
	//   32   71:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   33   74:aload           4
	//   34   76:invokevirtual   #116 <Method StringBuilder StringBuilder.append(Object)>
	//   35   79:ldc1            #118 <String " - subtype = ">
	//   36   81:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   37   84:aload           5
	//   38   86:getstatic       #121 <Field PdfName PdfName.SUBTYPE>
	//   39   89:invokevirtual   #126 <Method PdfObject PdfStream.get(PdfName)>
	//   40   92:invokevirtual   #116 <Method StringBuilder StringBuilder.append(Object)>
	//   41   95:ldc1            #84  <String " = ">
	//   42   97:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   43  100:aload           5
	//   44  102:getstatic       #129 <Field PdfName PdfName.LENGTH>
	//   45  105:invokevirtual   #133 <Method com.itextpdf.text.pdf.PdfNumber PdfStream.getAsNumber(PdfName)>
	//   46  108:invokevirtual   #116 <Method StringBuilder StringBuilder.append(Object)>
	//   47  111:ldc1            #135 <String " bytes ------\n">
	//   48  113:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   49  116:invokevirtual   #136 <Method String StringBuilder.toString()>
	//   50  119:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   51  122:pop             
			if(!((Object) (pdfstream.get(PdfName.SUBTYPE))).equals(((Object) (PdfName.IMAGE))))
	//*  52  123:aload           5
	//*  53  125:getstatic       #121 <Field PdfName PdfName.SUBTYPE>
	//*  54  128:invokevirtual   #126 <Method PdfObject PdfStream.get(PdfName)>
	//*  55  131:getstatic       #139 <Field PdfName PdfName.IMAGE>
	//*  56  134:invokevirtual   #142 <Method boolean Object.equals(Object)>
	//*  57  137:ifne            33
			{
				ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(ContentByteUtils.getContentBytesFromContentObject(((PdfObject) (pdfstream))));
	//   58  140:new             #144 <Class ByteArrayInputStream>
	//   59  143:dup             
	//   60  144:aload           5
	//   61  146:invokestatic    #150 <Method byte[] ContentByteUtils.getContentBytesFromContentObject(PdfObject)>
	//   62  149:invokespecial   #153 <Method void ByteArrayInputStream(byte[])>
	//   63  152:astore          6
				do
				{
					int i = ((InputStream) (bytearrayinputstream)).read();
	//   64  154:aload           6
	//   65  156:invokevirtual   #158 <Method int InputStream.read()>
	//   66  159:istore_1        
					if(i == -1)
						break;
	//   67  160:iload_1         
	//   68  161:iconst_m1       
	//   69  162:icmpeq          175
					stringbuilder.append((char)i);
	//   70  165:aload_2         
	//   71  166:iload_1         
	//   72  167:int2char        
	//   73  168:invokevirtual   #161 <Method StringBuilder StringBuilder.append(char)>
	//   74  171:pop             
				} while(true);
	//   75  172:goto            154
				stringbuilder.append((new StringBuilder()).append("------ ").append(((Object) (pdfname))).append(" - subtype = ").append(((Object) (pdfstream.get(PdfName.SUBTYPE)))).append("End of Content").append("------\n").toString());
	//   76  175:aload_2         
	//   77  176:new             #97  <Class StringBuilder>
	//   78  179:dup             
	//   79  180:invokespecial   #98  <Method void StringBuilder()>
	//   80  183:ldc1            #110 <String "------ ">
	//   81  185:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   82  188:aload           4
	//   83  190:invokevirtual   #116 <Method StringBuilder StringBuilder.append(Object)>
	//   84  193:ldc1            #118 <String " - subtype = ">
	//   85  195:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   86  198:aload           5
	//   87  200:getstatic       #121 <Field PdfName PdfName.SUBTYPE>
	//   88  203:invokevirtual   #126 <Method PdfObject PdfStream.get(PdfName)>
	//   89  206:invokevirtual   #116 <Method StringBuilder StringBuilder.append(Object)>
	//   90  209:ldc1            #163 <String "End of Content">
	//   91  211:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   92  214:ldc1            #165 <String "------\n">
	//   93  216:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   94  219:invokevirtual   #136 <Method String StringBuilder.toString()>
	//   95  222:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   96  225:pop             
			}
		} while(true);
	//   97  226:goto            33
		return stringbuilder.toString();
	//   98  229:aload_2         
	//   99  230:invokevirtual   #136 <Method String StringBuilder.toString()>
	//  100  233:areturn         
	}

	public static void listContentStream(File file, int i, PrintWriter printwriter)
		throws IOException
	{
		listContentStreamForPage(new PdfReader(file.getCanonicalPath()), i, printwriter);
	//    0    0:new             #170 <Class PdfReader>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #175 <Method String File.getCanonicalPath()>
	//    4    8:invokespecial   #178 <Method void PdfReader(String)>
	//    5   11:iload_1         
	//    6   12:aload_2         
	//    7   13:invokestatic    #182 <Method void listContentStreamForPage(PdfReader, int, PrintWriter)>
	//    8   16:return          
	}

	public static void listContentStream(File file, PrintWriter printwriter)
		throws IOException
	{
		file = ((File) (new PdfReader(file.getCanonicalPath())));
	//    0    0:new             #170 <Class PdfReader>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #175 <Method String File.getCanonicalPath()>
	//    4    8:invokespecial   #178 <Method void PdfReader(String)>
	//    5   11:astore_0        
		int j = ((PdfReader) (file)).getNumberOfPages();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #186 <Method int PdfReader.getNumberOfPages()>
	//    8   16:istore_3        
		for(int i = 1; i <= j; i++)
	//*   9   17:iconst_1        
	//*  10   18:istore_2        
	//*  11   19:iload_2         
	//*  12   20:iload_3         
	//*  13   21:icmpgt          37
			listContentStreamForPage(((PdfReader) (file)), i, printwriter);
	//   14   24:aload_0         
	//   15   25:iload_2         
	//   16   26:aload_1         
	//   17   27:invokestatic    #182 <Method void listContentStreamForPage(PdfReader, int, PrintWriter)>

	//   18   30:iload_2         
	//   19   31:iconst_1        
	//   20   32:iadd            
	//   21   33:istore_2        
	//*  22   34:goto            19
	//   23   37:return          
	}

	public static void listContentStreamForPage(PdfReader pdfreader, int i, PrintWriter printwriter)
		throws IOException
	{
		printwriter.println((new StringBuilder()).append("==============Page ").append(i).append("====================").toString());
	//    0    0:aload_2         
	//    1    1:new             #97  <Class StringBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #98  <Method void StringBuilder()>
	//    4    8:ldc1            #188 <String "==============Page ">
	//    5   10:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//    6   13:iload_1         
	//    7   14:invokevirtual   #191 <Method StringBuilder StringBuilder.append(int)>
	//    8   17:ldc1            #193 <String "====================">
	//    9   19:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:invokevirtual   #136 <Method String StringBuilder.toString()>
	//   11   25:invokevirtual   #198 <Method void PrintWriter.println(String)>
		printwriter.println("- - - - - Dictionary - - - - - -");
	//   12   28:aload_2         
	//   13   29:ldc1            #200 <String "- - - - - Dictionary - - - - - -">
	//   14   31:invokevirtual   #198 <Method void PrintWriter.println(String)>
		Object obj = ((Object) (pdfreader.getPageN(i)));
	//   15   34:aload_0         
	//   16   35:iload_1         
	//   17   36:invokevirtual   #204 <Method PdfDictionary PdfReader.getPageN(int)>
	//   18   39:astore          4
		printwriter.println(getDictionaryDetail(((PdfDictionary) (obj))));
	//   19   41:aload_2         
	//   20   42:aload           4
	//   21   44:invokestatic    #206 <Method String getDictionaryDetail(PdfDictionary)>
	//   22   47:invokevirtual   #198 <Method void PrintWriter.println(String)>
		printwriter.println("- - - - - XObject Summary - - - - - -");
	//   23   50:aload_2         
	//   24   51:ldc1            #208 <String "- - - - - XObject Summary - - - - - -">
	//   25   53:invokevirtual   #198 <Method void PrintWriter.println(String)>
		printwriter.println(getXObjectDetail(((PdfDictionary) (obj)).getAsDict(PdfName.RESOURCES)));
	//   26   56:aload_2         
	//   27   57:aload           4
	//   28   59:getstatic       #211 <Field PdfName PdfName.RESOURCES>
	//   29   62:invokevirtual   #88  <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   30   65:invokestatic    #213 <Method String getXObjectDetail(PdfDictionary)>
	//   31   68:invokevirtual   #198 <Method void PrintWriter.println(String)>
		printwriter.println("- - - - - Content Stream - - - - - -");
	//   32   71:aload_2         
	//   33   72:ldc1            #215 <String "- - - - - Content Stream - - - - - -">
	//   34   74:invokevirtual   #198 <Method void PrintWriter.println(String)>
		obj = ((Object) (pdfreader.getSafeFile()));
	//   35   77:aload_0         
	//   36   78:invokevirtual   #219 <Method RandomAccessFileOrArray PdfReader.getSafeFile()>
	//   37   81:astore          4
		byte abyte0[] = pdfreader.getPageContent(i, ((RandomAccessFileOrArray) (obj)));
	//   38   83:aload_0         
	//   39   84:iload_1         
	//   40   85:aload           4
	//   41   87:invokevirtual   #223 <Method byte[] PdfReader.getPageContent(int, RandomAccessFileOrArray)>
	//   42   90:astore          5
		((RandomAccessFileOrArray) (obj)).close();
	//   43   92:aload           4
	//   44   94:invokevirtual   #228 <Method void RandomAccessFileOrArray.close()>
		printwriter.flush();
	//   45   97:aload_2         
	//   46   98:invokevirtual   #231 <Method void PrintWriter.flush()>
		obj = ((Object) (new ByteArrayInputStream(abyte0)));
	//   47  101:new             #144 <Class ByteArrayInputStream>
	//   48  104:dup             
	//   49  105:aload           5
	//   50  107:invokespecial   #153 <Method void ByteArrayInputStream(byte[])>
	//   51  110:astore          4
		do
		{
			int j = ((InputStream) (obj)).read();
	//   52  112:aload           4
	//   53  114:invokevirtual   #158 <Method int InputStream.read()>
	//   54  117:istore_3        
			if(j == -1)
				break;
	//   55  118:iload_3         
	//   56  119:iconst_m1       
	//   57  120:icmpeq          132
			printwriter.print((char)j);
	//   58  123:aload_2         
	//   59  124:iload_3         
	//   60  125:int2char        
	//   61  126:invokevirtual   #235 <Method void PrintWriter.print(char)>
		} while(true);
	//   62  129:goto            112
		printwriter.flush();
	//   63  132:aload_2         
	//   64  133:invokevirtual   #231 <Method void PrintWriter.flush()>
		printwriter.println("- - - - - Text Extraction - - - - - -");
	//   65  136:aload_2         
	//   66  137:ldc1            #237 <String "- - - - - Text Extraction - - - - - -">
	//   67  139:invokevirtual   #198 <Method void PrintWriter.println(String)>
		pdfreader = ((PdfReader) (PdfTextExtractor.getTextFromPage(pdfreader, i, ((TextExtractionStrategy) (new LocationTextExtractionStrategy())))));
	//   68  142:aload_0         
	//   69  143:iload_1         
	//   70  144:new             #239 <Class LocationTextExtractionStrategy>
	//   71  147:dup             
	//   72  148:invokespecial   #240 <Method void LocationTextExtractionStrategy()>
	//   73  151:invokestatic    #246 <Method String PdfTextExtractor.getTextFromPage(PdfReader, int, TextExtractionStrategy)>
	//   74  154:astore_0        
		if(((String) (pdfreader)).length() != 0)
	//*  75  155:aload_0         
	//*  76  156:invokevirtual   #249 <Method int String.length()>
	//*  77  159:ifeq            172
			printwriter.println(((String) (pdfreader)));
	//   78  162:aload_2         
	//   79  163:aload_0         
	//   80  164:invokevirtual   #198 <Method void PrintWriter.println(String)>
		else
	//*  81  167:aload_2         
	//*  82  168:invokevirtual   #251 <Method void PrintWriter.println()>
	//*  83  171:return          
			printwriter.println((new StringBuilder()).append("No text found on page ").append(i).toString());
	//   84  172:aload_2         
	//   85  173:new             #97  <Class StringBuilder>
	//   86  176:dup             
	//   87  177:invokespecial   #98  <Method void StringBuilder()>
	//   88  180:ldc1            #253 <String "No text found on page ">
	//   89  182:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   90  185:iload_1         
	//   91  186:invokevirtual   #191 <Method StringBuilder StringBuilder.append(int)>
	//   92  189:invokevirtual   #136 <Method String StringBuilder.toString()>
	//   93  192:invokevirtual   #198 <Method void PrintWriter.println(String)>
		printwriter.println();
	//*  94  195:goto            167
	}

	public static void main(String args[])
	{
		int i;
		PrintWriter printwriter;
		PrintWriter printwriter1;
		try
		{
			if(args.length < 1 || args.length > 3)
	//*   0    0:aload_0         
	//*   1    1:arraylength     
	//*   2    2:iconst_1        
	//*   3    3:icmplt          12
	//*   4    6:aload_0         
	//*   5    7:arraylength     
	//*   6    8:iconst_3        
	//*   7    9:icmple          22
			{
				System.out.println("Usage:  PdfContentReaderTool <pdf file> [<output file>|stdout] [<page num>]");
	//    8   12:getstatic       #263 <Field PrintStream System.out>
	//    9   15:ldc2            #265 <String "Usage:  PdfContentReaderTool <pdf file> [<output file>|stdout] [<page num>]">
	//   10   18:invokevirtual   #268 <Method void PrintStream.println(String)>
				return;
	//   11   21:return          
			}
		}
	//*  12   22:new             #195 <Class PrintWriter>
	//*  13   25:dup             
	//*  14   26:getstatic       #263 <Field PrintStream System.out>
	//*  15   29:invokespecial   #271 <Method void PrintWriter(java.io.OutputStream)>
	//*  16   32:astore_3        
	//*  17   33:aload_3         
	//*  18   34:astore_2        
	//*  19   35:aload_0         
	//*  20   36:arraylength     
	//*  21   37:iconst_2        
	//*  22   38:icmplt          108
	//*  23   41:aload_3         
	//*  24   42:astore_2        
	//*  25   43:aload_0         
	//*  26   44:iconst_1        
	//*  27   45:aaload          
	//*  28   46:ldc2            #273 <String "stdout">
	//*  29   49:invokevirtual   #277 <Method int String.compareToIgnoreCase(String)>
	//*  30   52:ifeq            108
	//*  31   55:getstatic       #263 <Field PrintStream System.out>
	//*  32   58:new             #97  <Class StringBuilder>
	//*  33   61:dup             
	//*  34   62:invokespecial   #98  <Method void StringBuilder()>
	//*  35   65:ldc2            #279 <String "Writing PDF content to ">
	//*  36   68:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//*  37   71:aload_0         
	//*  38   72:iconst_1        
	//*  39   73:aaload          
	//*  40   74:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//*  41   77:invokevirtual   #136 <Method String StringBuilder.toString()>
	//*  42   80:invokevirtual   #268 <Method void PrintStream.println(String)>
	//*  43   83:new             #195 <Class PrintWriter>
	//*  44   86:dup             
	//*  45   87:new             #281 <Class FileOutputStream>
	//*  46   90:dup             
	//*  47   91:new             #172 <Class File>
	//*  48   94:dup             
	//*  49   95:aload_0         
	//*  50   96:iconst_1        
	//*  51   97:aaload          
	//*  52   98:invokespecial   #282 <Method void File(String)>
	//*  53  101:invokespecial   #285 <Method void FileOutputStream(File)>
	//*  54  104:invokespecial   #271 <Method void PrintWriter(java.io.OutputStream)>
	//*  55  107:astore_2        
	//*  56  108:iconst_m1       
	//*  57  109:istore_1        
	//*  58  110:aload_0         
	//*  59  111:arraylength     
	//*  60  112:iconst_3        
	//*  61  113:icmplt          123
	//*  62  116:aload_0         
	//*  63  117:iconst_2        
	//*  64  118:aaload          
	//*  65  119:invokestatic    #290 <Method int Integer.parseInt(String)>
	//*  66  122:istore_1        
	//*  67  123:iload_1         
	//*  68  124:iconst_m1       
	//*  69  125:icmpne          194
	//*  70  128:new             #172 <Class File>
	//*  71  131:dup             
	//*  72  132:aload_0         
	//*  73  133:iconst_0        
	//*  74  134:aaload          
	//*  75  135:invokespecial   #282 <Method void File(String)>
	//*  76  138:aload_2         
	//*  77  139:invokestatic    #292 <Method void listContentStream(File, PrintWriter)>
	//*  78  142:aload_2         
	//*  79  143:invokevirtual   #231 <Method void PrintWriter.flush()>
	//*  80  146:aload_0         
	//*  81  147:arraylength     
	//*  82  148:iconst_2        
	//*  83  149:icmplt          212
	//*  84  152:aload_2         
	//*  85  153:invokevirtual   #293 <Method void PrintWriter.close()>
	//*  86  156:getstatic       #263 <Field PrintStream System.out>
	//*  87  159:new             #97  <Class StringBuilder>
	//*  88  162:dup             
	//*  89  163:invokespecial   #98  <Method void StringBuilder()>
	//*  90  166:ldc2            #295 <String "Finished writing content to ">
	//*  91  169:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//*  92  172:aload_0         
	//*  93  173:iconst_1        
	//*  94  174:aaload          
	//*  95  175:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//*  96  178:invokevirtual   #136 <Method String StringBuilder.toString()>
	//*  97  181:invokevirtual   #268 <Method void PrintStream.println(String)>
	//*  98  184:return          
		// Misplaced declaration of an exception variable
		catch(String args[])
	//*  99  185:astore_0        
		{
			((Exception) (args)).printStackTrace(System.err);
	//  100  186:aload_0         
	//  101  187:getstatic       #298 <Field PrintStream System.err>
	//  102  190:invokevirtual   #302 <Method void Exception.printStackTrace(PrintStream)>
			return;
	//  103  193:return          
		}
		printwriter1 = new PrintWriter(((java.io.OutputStream) (System.out)));
		printwriter = printwriter1;
		if(args.length < 2)
			break MISSING_BLOCK_LABEL_108;
		printwriter = printwriter1;
		if(args[1].compareToIgnoreCase("stdout") != 0)
		{
			System.out.println((new StringBuilder()).append("Writing PDF content to ").append(args[1]).toString());
			printwriter = new PrintWriter(((java.io.OutputStream) (new FileOutputStream(new File(args[1])))));
		}
		i = -1;
		if(args.length >= 3)
			i = Integer.parseInt(args[2]);
		if(i != -1)
			break MISSING_BLOCK_LABEL_194;
		listContentStream(new File(args[0]), printwriter);
_L1:
		printwriter.flush();
		if(args.length >= 2)
		{
			printwriter.close();
			System.out.println((new StringBuilder()).append("Finished writing content to ").append(args[1]).toString());
			return;
		}
		break MISSING_BLOCK_LABEL_212;
		listContentStream(new File(args[0]), i, printwriter);
	//  104  194:new             #172 <Class File>
	//  105  197:dup             
	//  106  198:aload_0         
	//  107  199:iconst_0        
	//  108  200:aaload          
	//  109  201:invokespecial   #282 <Method void File(String)>
	//  110  204:iload_1         
	//  111  205:aload_2         
	//  112  206:invokestatic    #304 <Method void listContentStream(File, int, PrintWriter)>
		  goto _L1
	//* 113  209:goto            142
	//  114  212:return          
	}
}
