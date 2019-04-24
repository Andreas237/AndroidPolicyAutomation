// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.xml.XMLUtil;
import java.io.*;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			MarkedContentRenderFilter, FilteredTextRenderListener, SimpleTextExtractionStrategy, RenderFilter, 
//			PdfContentStreamProcessor

public class TaggedPdfReaderTool
{

	public TaggedPdfReaderTool()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	private static String fixTagName(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #17  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void StringBuilder()>
	//    3    7:astore          5
		int i = 0;
	//    4    9:iconst_0        
	//    5   10:istore_2        
		while(i < s.length()) 
	//*   6   11:iload_2         
	//*   7   12:aload_0         
	//*   8   13:invokevirtual   #24  <Method int String.length()>
	//*   9   16:icmpge          325
		{
			char c = s.charAt(i);
	//   10   19:aload_0         
	//   11   20:iload_2         
	//   12   21:invokevirtual   #28  <Method char String.charAt(int)>
	//   13   24:istore_1        
			boolean flag;
			boolean flag1;
			if(c == ':' || c >= 'A' && c <= 'Z' || c == '_' || c >= 'a' && c <= 'z' || c >= '\300' && c <= '\326' || c >= '\330' && c <= '\366' || c >= '\370' && c <= '\u02FF' || c >= '\u0370' && c <= '\u037D' || c >= '\u037F' && c <= '\u1FFF' || c >= '\u200C' && c <= '\u200D' || c >= '\u2070' && c <= '\u218F' || c >= '\u2C00' && c <= '\u2FEF' || c >= '\u3001' && c <= '\uD7FF' || c >= '\uF900' && c <= '\uFDCF' || c >= '\uFDF0' && c <= '\uFFFD')
	//*  14   25:iload_1         
	//*  15   26:bipush          58
	//*  16   28:icmpeq          210
	//*  17   31:iload_1         
	//*  18   32:bipush          65
	//*  19   34:icmplt          43
	//*  20   37:iload_1         
	//*  21   38:bipush          90
	//*  22   40:icmple          210
	//*  23   43:iload_1         
	//*  24   44:bipush          95
	//*  25   46:icmpeq          210
	//*  26   49:iload_1         
	//*  27   50:bipush          97
	//*  28   52:icmplt          61
	//*  29   55:iload_1         
	//*  30   56:bipush          122
	//*  31   58:icmple          210
	//*  32   61:iload_1         
	//*  33   62:sipush          192
	//*  34   65:icmplt          75
	//*  35   68:iload_1         
	//*  36   69:sipush          214
	//*  37   72:icmple          210
	//*  38   75:iload_1         
	//*  39   76:sipush          216
	//*  40   79:icmplt          89
	//*  41   82:iload_1         
	//*  42   83:sipush          246
	//*  43   86:icmple          210
	//*  44   89:iload_1         
	//*  45   90:sipush          248
	//*  46   93:icmplt          103
	//*  47   96:iload_1         
	//*  48   97:sipush          767
	//*  49  100:icmple          210
	//*  50  103:iload_1         
	//*  51  104:sipush          880
	//*  52  107:icmplt          117
	//*  53  110:iload_1         
	//*  54  111:sipush          893
	//*  55  114:icmple          210
	//*  56  117:iload_1         
	//*  57  118:sipush          895
	//*  58  121:icmplt          131
	//*  59  124:iload_1         
	//*  60  125:sipush          8191
	//*  61  128:icmple          210
	//*  62  131:iload_1         
	//*  63  132:sipush          8204
	//*  64  135:icmplt          145
	//*  65  138:iload_1         
	//*  66  139:sipush          8205
	//*  67  142:icmple          210
	//*  68  145:iload_1         
	//*  69  146:sipush          8304
	//*  70  149:icmplt          159
	//*  71  152:iload_1         
	//*  72  153:sipush          8591
	//*  73  156:icmple          210
	//*  74  159:iload_1         
	//*  75  160:sipush          11264
	//*  76  163:icmplt          173
	//*  77  166:iload_1         
	//*  78  167:sipush          12271
	//*  79  170:icmple          210
	//*  80  173:iload_1         
	//*  81  174:sipush          12289
	//*  82  177:icmplt          186
	//*  83  180:iload_1         
	//*  84  181:ldc1            #29  <Int 55295>
	//*  85  183:icmple          210
	//*  86  186:iload_1         
	//*  87  187:ldc1            #30  <Int 63744>
	//*  88  189:icmplt          198
	//*  89  192:iload_1         
	//*  90  193:ldc1            #31  <Int 64975>
	//*  91  195:icmple          210
	//*  92  198:iload_1         
	//*  93  199:ldc1            #32  <Int 65008>
	//*  94  201:icmplt          303
	//*  95  204:iload_1         
	//*  96  205:ldc1            #33  <Int 65533>
	//*  97  207:icmpgt          303
				flag = true;
	//   98  210:iconst_1        
	//   99  211:istore_3        
			else
	//* 100  212:iload_1         
	//* 101  213:bipush          45
	//* 102  215:icmpeq          275
	//* 103  218:iload_1         
	//* 104  219:bipush          46
	//* 105  221:icmpeq          275
	//* 106  224:iload_1         
	//* 107  225:bipush          48
	//* 108  227:icmplt          236
	//* 109  230:iload_1         
	//* 110  231:bipush          57
	//* 111  233:icmple          275
	//* 112  236:iload_1         
	//* 113  237:sipush          183
	//* 114  240:icmpeq          275
	//* 115  243:iload_1         
	//* 116  244:sipush          768
	//* 117  247:icmplt          257
	//* 118  250:iload_1         
	//* 119  251:sipush          879
	//* 120  254:icmple          275
	//* 121  257:iload_1         
	//* 122  258:sipush          8255
	//* 123  261:icmplt          271
	//* 124  264:iload_1         
	//* 125  265:sipush          8256
	//* 126  268:icmple          275
	//* 127  271:iload_3         
	//* 128  272:ifeq            308
	//* 129  275:iconst_1        
	//* 130  276:istore          4
	//* 131  278:iload_2         
	//* 132  279:ifne            314
	//* 133  282:iload_3         
	//* 134  283:ifne            289
	//* 135  286:bipush          95
	//* 136  288:istore_1        
	//* 137  289:aload           5
	//* 138  291:iload_1         
	//* 139  292:invokevirtual   #37  <Method StringBuilder StringBuilder.append(char)>
	//* 140  295:pop             
	//* 141  296:iload_2         
	//* 142  297:iconst_1        
	//* 143  298:iadd            
	//* 144  299:istore_2        
	//* 145  300:goto            11
				flag = false;
	//  146  303:iconst_0        
	//  147  304:istore_3        
			if(c == '-' || c == '.' || c >= '0' && c <= '9' || c == '\267' || c >= '\u0300' && c <= '\u036F' || c >= '\u203F' && c <= '\u2040' || flag)
				flag1 = true;
			else
	//* 148  305:goto            212
				flag1 = false;
	//  149  308:iconst_0        
	//  150  309:istore          4
			if(i == 0)
			{
				if(!flag)
					c = '_';
			} else
	//* 151  311:goto            278
			if(!flag1)
	//* 152  314:iload           4
	//* 153  316:ifne            289
				c = '-';
	//  154  319:bipush          45
	//  155  321:istore_1        
			stringbuilder.append(c);
			i++;
		}
	//* 156  322:goto            289
		return stringbuilder.toString();
	//  157  325:aload           5
	//  158  327:invokevirtual   #41  <Method String StringBuilder.toString()>
	//  159  330:areturn         
	}

	public void convertToXml(PdfReader pdfreader, OutputStream outputstream)
		throws IOException
	{
		convertToXml(pdfreader, outputstream, "UTF-8");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #47  <String "UTF-8">
	//    4    5:invokevirtual   #50  <Method void convertToXml(PdfReader, OutputStream, String)>
	//    5    8:return          
	}

	public void convertToXml(PdfReader pdfreader, OutputStream outputstream, String s)
		throws IOException
	{
		reader = pdfreader;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #53  <Field PdfReader reader>
		out = new PrintWriter(((java.io.Writer) (new OutputStreamWriter(outputstream, s))));
	//    3    5:aload_0         
	//    4    6:new             #55  <Class PrintWriter>
	//    5    9:dup             
	//    6   10:new             #57  <Class OutputStreamWriter>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:invokespecial   #60  <Method void OutputStreamWriter(OutputStream, String)>
	//   11   19:invokespecial   #63  <Method void PrintWriter(java.io.Writer)>
	//   12   22:putfield        #65  <Field PrintWriter out>
		pdfreader = ((PdfReader) (pdfreader.getCatalog().getAsDict(PdfName.STRUCTTREEROOT)));
	//   13   25:aload_1         
	//   14   26:invokevirtual   #71  <Method PdfDictionary PdfReader.getCatalog()>
	//   15   29:getstatic       #77  <Field PdfName PdfName.STRUCTTREEROOT>
	//   16   32:invokevirtual   #83  <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   17   35:astore_1        
		if(pdfreader == null)
	//*  18   36:aload_1         
	//*  19   37:ifnonnull       57
		{
			throw new IOException(MessageLocalization.getComposedMessage("no.structtreeroot.found", new Object[0]));
	//   20   40:new             #45  <Class IOException>
	//   21   43:dup             
	//   22   44:ldc1            #85  <String "no.structtreeroot.found">
	//   23   46:iconst_0        
	//   24   47:anewarray       Object[]
	//   25   50:invokestatic    #91  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   26   53:invokespecial   #94  <Method void IOException(String)>
	//   27   56:athrow          
		} else
		{
			inspectChild(((PdfDictionary) (pdfreader)).getDirectObject(PdfName.K));
	//   28   57:aload_0         
	//   29   58:aload_1         
	//   30   59:getstatic       #97  <Field PdfName PdfName.K>
	//   31   62:invokevirtual   #101 <Method PdfObject PdfDictionary.getDirectObject(PdfName)>
	//   32   65:invokevirtual   #105 <Method void inspectChild(PdfObject)>
			out.flush();
	//   33   68:aload_0         
	//   34   69:getfield        #65  <Field PrintWriter out>
	//   35   72:invokevirtual   #108 <Method void PrintWriter.flush()>
			out.close();
	//   36   75:aload_0         
	//   37   76:getfield        #65  <Field PrintWriter out>
	//   38   79:invokevirtual   #111 <Method void PrintWriter.close()>
			return;
	//   39   82:return          
		}
	}

	public void inspectChild(PdfObject pdfobject)
		throws IOException
	{
		if(pdfobject != null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
	//*   2    4:return          
		{
			if(pdfobject instanceof PdfArray)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #113 <Class PdfArray>
	//*   5    9:ifeq            21
			{
				inspectChildArray((PdfArray)pdfobject);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #113 <Class PdfArray>
	//    9   17:invokevirtual   #117 <Method void inspectChildArray(PdfArray)>
				return;
	//   10   20:return          
			}
			if(pdfobject instanceof PdfDictionary)
	//*  11   21:aload_1         
	//*  12   22:instanceof      #79  <Class PdfDictionary>
	//*  13   25:ifeq            4
			{
				inspectChildDictionary((PdfDictionary)pdfobject);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:checkcast       #79  <Class PdfDictionary>
	//   17   33:invokevirtual   #121 <Method void inspectChildDictionary(PdfDictionary)>
				return;
	//   18   36:return          
			}
		}
	}

	public void inspectChildArray(PdfArray pdfarray)
		throws IOException
	{
		if(pdfarray != null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
	//*   2    4:return          
		{
			int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
			while(i < pdfarray.size()) 
	//*   5    7:iload_2         
	//*   6    8:aload_1         
	//*   7    9:invokevirtual   #124 <Method int PdfArray.size()>
	//*   8   12:icmpge          4
			{
				inspectChild(pdfarray.getDirectObject(i));
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:iload_2         
	//   12   18:invokevirtual   #127 <Method PdfObject PdfArray.getDirectObject(int)>
	//   13   21:invokevirtual   #105 <Method void inspectChild(PdfObject)>
				i++;
	//   14   24:iload_2         
	//   15   25:iconst_1        
	//   16   26:iadd            
	//   17   27:istore_2        
			}
		}
	//*  18   28:goto            7
	}

	public void inspectChildDictionary(PdfDictionary pdfdictionary)
		throws IOException
	{
		inspectChildDictionary(pdfdictionary, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #130 <Method void inspectChildDictionary(PdfDictionary, boolean)>
	//    4    6:return          
	}

	public void inspectChildDictionary(PdfDictionary pdfdictionary, boolean flag)
		throws IOException
	{
		if(pdfdictionary == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		Object obj = ((Object) (pdfdictionary.getAsName(PdfName.S)));
	//    3    5:aload_1         
	//    4    6:getstatic       #133 <Field PdfName PdfName.S>
	//    5    9:invokevirtual   #137 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//    6   12:astore_3        
		if(obj != null)
	//*   7   13:aload_3         
	//*   8   14:ifnull          303
		{
			obj = ((Object) (PdfName.decodeName(((PdfName) (obj)).toString())));
	//    9   17:aload_3         
	//   10   18:invokevirtual   #138 <Method String PdfName.toString()>
	//   11   21:invokestatic    #141 <Method String PdfName.decodeName(String)>
	//   12   24:astore_3        
			String s = fixTagName(((String) (obj)));
	//   13   25:aload_3         
	//   14   26:invokestatic    #143 <Method String fixTagName(String)>
	//   15   29:astore          4
			out.print("<");
	//   16   31:aload_0         
	//   17   32:getfield        #65  <Field PrintWriter out>
	//   18   35:ldc1            #145 <String "<">
	//   19   37:invokevirtual   #148 <Method void PrintWriter.print(String)>
			out.print(s);
	//   20   40:aload_0         
	//   21   41:getfield        #65  <Field PrintWriter out>
	//   22   44:aload           4
	//   23   46:invokevirtual   #148 <Method void PrintWriter.print(String)>
			if(flag)
	//*  24   49:iload_2         
	//*  25   50:ifeq            168
			{
				PdfDictionary pdfdictionary1 = pdfdictionary.getAsDict(PdfName.A);
	//   26   53:aload_1         
	//   27   54:getstatic       #151 <Field PdfName PdfName.A>
	//   28   57:invokevirtual   #83  <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   29   60:astore          5
				if(pdfdictionary1 != null)
	//*  30   62:aload           5
	//*  31   64:ifnull          168
				{
					for(Iterator iterator = pdfdictionary1.getKeys().iterator(); iterator.hasNext(); out.print("\""))
	//*  32   67:aload           5
	//*  33   69:invokevirtual   #155 <Method Set PdfDictionary.getKeys()>
	//*  34   72:invokeinterface #161 <Method Iterator Set.iterator()>
	//*  35   77:astore          6
	//*  36   79:aload           6
	//*  37   81:invokeinterface #167 <Method boolean Iterator.hasNext()>
	//*  38   86:ifeq            168
					{
						PdfName pdfname = (PdfName)iterator.next();
	//   39   89:aload           6
	//   40   91:invokeinterface #171 <Method Object Iterator.next()>
	//   41   96:checkcast       #73  <Class PdfName>
	//   42   99:astore          7
						out.print(' ');
	//   43  101:aload_0         
	//   44  102:getfield        #65  <Field PrintWriter out>
	//   45  105:bipush          32
	//   46  107:invokevirtual   #174 <Method void PrintWriter.print(char)>
						PdfObject pdfobject = PdfReader.getPdfObject(pdfdictionary1.get(pdfname));
	//   47  110:aload           5
	//   48  112:aload           7
	//   49  114:invokevirtual   #177 <Method PdfObject PdfDictionary.get(PdfName)>
	//   50  117:invokestatic    #181 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//   51  120:astore          8
						out.print(xmlName(pdfname));
	//   52  122:aload_0         
	//   53  123:getfield        #65  <Field PrintWriter out>
	//   54  126:aload_0         
	//   55  127:aload           7
	//   56  129:invokevirtual   #185 <Method String xmlName(PdfName)>
	//   57  132:invokevirtual   #148 <Method void PrintWriter.print(String)>
						out.print("=\"");
	//   58  135:aload_0         
	//   59  136:getfield        #65  <Field PrintWriter out>
	//   60  139:ldc1            #187 <String "=\"">
	//   61  141:invokevirtual   #148 <Method void PrintWriter.print(String)>
						out.print(pdfobject.toString());
	//   62  144:aload_0         
	//   63  145:getfield        #65  <Field PrintWriter out>
	//   64  148:aload           8
	//   65  150:invokevirtual   #190 <Method String PdfObject.toString()>
	//   66  153:invokevirtual   #148 <Method void PrintWriter.print(String)>
					}

	//   67  156:aload_0         
	//   68  157:getfield        #65  <Field PrintWriter out>
	//   69  160:ldc1            #192 <String "\"">
	//   70  162:invokevirtual   #148 <Method void PrintWriter.print(String)>
				}
			}
	//*  71  165:goto            79
			out.print(">");
	//   72  168:aload_0         
	//   73  169:getfield        #65  <Field PrintWriter out>
	//   74  172:ldc1            #194 <String ">">
	//   75  174:invokevirtual   #148 <Method void PrintWriter.print(String)>
			Object obj1 = ((Object) (pdfdictionary.get(PdfName.ALT)));
	//   76  177:aload_1         
	//   77  178:getstatic       #197 <Field PdfName PdfName.ALT>
	//   78  181:invokevirtual   #177 <Method PdfObject PdfDictionary.get(PdfName)>
	//   79  184:astore          5
			if(obj1 != null && ((PdfObject) (obj1)).toString() != null)
	//*  80  186:aload           5
	//*  81  188:ifnull          236
	//*  82  191:aload           5
	//*  83  193:invokevirtual   #190 <Method String PdfObject.toString()>
	//*  84  196:ifnull          236
			{
				out.print("<alt><![CDATA[");
	//   85  199:aload_0         
	//   86  200:getfield        #65  <Field PrintWriter out>
	//   87  203:ldc1            #199 <String "<alt><![CDATA[">
	//   88  205:invokevirtual   #148 <Method void PrintWriter.print(String)>
				out.print(((PdfObject) (obj1)).toString().replaceAll("[\\000]*", ""));
	//   89  208:aload_0         
	//   90  209:getfield        #65  <Field PrintWriter out>
	//   91  212:aload           5
	//   92  214:invokevirtual   #190 <Method String PdfObject.toString()>
	//   93  217:ldc1            #201 <String "[\\000]*">
	//   94  219:ldc1            #203 <String "">
	//   95  221:invokevirtual   #207 <Method String String.replaceAll(String, String)>
	//   96  224:invokevirtual   #148 <Method void PrintWriter.print(String)>
				out.print("]]></alt>");
	//   97  227:aload_0         
	//   98  228:getfield        #65  <Field PrintWriter out>
	//   99  231:ldc1            #209 <String "]]></alt>">
	//  100  233:invokevirtual   #148 <Method void PrintWriter.print(String)>
			}
			obj1 = ((Object) (pdfdictionary.getAsDict(PdfName.PG)));
	//  101  236:aload_1         
	//  102  237:getstatic       #212 <Field PdfName PdfName.PG>
	//  103  240:invokevirtual   #83  <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//  104  243:astore          5
			if(obj1 != null)
	//* 105  245:aload           5
	//* 106  247:ifnull          264
				parseTag(((String) (obj)), pdfdictionary.getDirectObject(PdfName.K), ((PdfDictionary) (obj1)));
	//  107  250:aload_0         
	//  108  251:aload_3         
	//  109  252:aload_1         
	//  110  253:getstatic       #97  <Field PdfName PdfName.K>
	//  111  256:invokevirtual   #101 <Method PdfObject PdfDictionary.getDirectObject(PdfName)>
	//  112  259:aload           5
	//  113  261:invokevirtual   #216 <Method void parseTag(String, PdfObject, PdfDictionary)>
			inspectChild(pdfdictionary.getDirectObject(PdfName.K));
	//  114  264:aload_0         
	//  115  265:aload_1         
	//  116  266:getstatic       #97  <Field PdfName PdfName.K>
	//  117  269:invokevirtual   #101 <Method PdfObject PdfDictionary.getDirectObject(PdfName)>
	//  118  272:invokevirtual   #105 <Method void inspectChild(PdfObject)>
			out.print("</");
	//  119  275:aload_0         
	//  120  276:getfield        #65  <Field PrintWriter out>
	//  121  279:ldc1            #218 <String "</">
	//  122  281:invokevirtual   #148 <Method void PrintWriter.print(String)>
			out.print(s);
	//  123  284:aload_0         
	//  124  285:getfield        #65  <Field PrintWriter out>
	//  125  288:aload           4
	//  126  290:invokevirtual   #148 <Method void PrintWriter.print(String)>
			out.println(">");
	//  127  293:aload_0         
	//  128  294:getfield        #65  <Field PrintWriter out>
	//  129  297:ldc1            #194 <String ">">
	//  130  299:invokevirtual   #221 <Method void PrintWriter.println(String)>
			return;
	//  131  302:return          
		} else
		{
			inspectChild(pdfdictionary.getDirectObject(PdfName.K));
	//  132  303:aload_0         
	//  133  304:aload_1         
	//  134  305:getstatic       #97  <Field PdfName PdfName.K>
	//  135  308:invokevirtual   #101 <Method PdfObject PdfDictionary.getDirectObject(PdfName)>
	//  136  311:invokevirtual   #105 <Method void inspectChild(PdfObject)>
			return;
	//  137  314:return          
		}
	}

	public void parseTag(String s, PdfObject pdfobject, PdfDictionary pdfdictionary)
		throws IOException
	{
		if(!(pdfobject instanceof PdfNumber)) goto _L2; else goto _L1
	//    0    0:aload_2         
	//    1    1:instanceof      #223 <Class PdfNumber>
	//    2    4:ifeq            83
_L1:
		s = ((String) (new MarkedContentRenderFilter(((PdfNumber)pdfobject).intValue())));
	//    3    7:new             #225 <Class MarkedContentRenderFilter>
	//    4   10:dup             
	//    5   11:aload_2         
	//    6   12:checkcast       #223 <Class PdfNumber>
	//    7   15:invokevirtual   #228 <Method int PdfNumber.intValue()>
	//    8   18:invokespecial   #231 <Method void MarkedContentRenderFilter(int)>
	//    9   21:astore_1        
		s = ((String) (new FilteredTextRenderListener(((TextExtractionStrategy) (new SimpleTextExtractionStrategy())), new RenderFilter[] {
			s
		})));
	//   10   22:new             #233 <Class FilteredTextRenderListener>
	//   11   25:dup             
	//   12   26:new             #235 <Class SimpleTextExtractionStrategy>
	//   13   29:dup             
	//   14   30:invokespecial   #236 <Method void SimpleTextExtractionStrategy()>
	//   15   33:iconst_1        
	//   16   34:anewarray       RenderFilter[]
	//   17   37:dup             
	//   18   38:iconst_0        
	//   19   39:aload_1         
	//   20   40:aastore         
	//   21   41:invokespecial   #241 <Method void FilteredTextRenderListener(TextExtractionStrategy, RenderFilter[])>
	//   22   44:astore_1        
		(new PdfContentStreamProcessor(((RenderListener) (s)))).processContent(PdfReader.getPageContent(pdfdictionary), pdfdictionary.getAsDict(PdfName.RESOURCES));
	//   23   45:new             #243 <Class PdfContentStreamProcessor>
	//   24   48:dup             
	//   25   49:aload_1         
	//   26   50:invokespecial   #246 <Method void PdfContentStreamProcessor(RenderListener)>
	//   27   53:aload_3         
	//   28   54:invokestatic    #250 <Method byte[] PdfReader.getPageContent(PdfDictionary)>
	//   29   57:aload_3         
	//   30   58:getstatic       #253 <Field PdfName PdfName.RESOURCES>
	//   31   61:invokevirtual   #83  <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   32   64:invokevirtual   #257 <Method void PdfContentStreamProcessor.processContent(byte[], PdfDictionary)>
		out.print(XMLUtil.escapeXML(((FilteredTextRenderListener) (s)).getResultantText(), true));
	//   33   67:aload_0         
	//   34   68:getfield        #65  <Field PrintWriter out>
	//   35   71:aload_1         
	//   36   72:invokevirtual   #260 <Method String FilteredTextRenderListener.getResultantText()>
	//   37   75:iconst_1        
	//   38   76:invokestatic    #266 <Method String XMLUtil.escapeXML(String, boolean)>
	//   39   79:invokevirtual   #148 <Method void PrintWriter.print(String)>
_L4:
		return;
	//   40   82:return          
_L2:
		if(!(pdfobject instanceof PdfArray))
			break; /* Loop/switch isn't completed */
	//   41   83:aload_2         
	//   42   84:instanceof      #113 <Class PdfArray>
	//   43   87:ifeq            148
		pdfobject = ((PdfObject) ((PdfArray)pdfobject));
	//   44   90:aload_2         
	//   45   91:checkcast       #113 <Class PdfArray>
	//   46   94:astore_2        
		int j = ((PdfArray) (pdfobject)).size();
	//   47   95:aload_2         
	//   48   96:invokevirtual   #124 <Method int PdfArray.size()>
	//   49   99:istore          5
		int i = 0;
	//   50  101:iconst_0        
	//   51  102:istore          4
		while(i < j) 
	//*  52  104:iload           4
	//*  53  106:iload           5
	//*  54  108:icmpge          82
		{
			parseTag(s, ((PdfArray) (pdfobject)).getPdfObject(i), pdfdictionary);
	//   55  111:aload_0         
	//   56  112:aload_1         
	//   57  113:aload_2         
	//   58  114:iload           4
	//   59  116:invokevirtual   #268 <Method PdfObject PdfArray.getPdfObject(int)>
	//   60  119:aload_3         
	//   61  120:invokevirtual   #216 <Method void parseTag(String, PdfObject, PdfDictionary)>
			if(i < j - 1)
	//*  62  123:iload           4
	//*  63  125:iload           5
	//*  64  127:iconst_1        
	//*  65  128:isub            
	//*  66  129:icmpge          139
				out.println();
	//   67  132:aload_0         
	//   68  133:getfield        #65  <Field PrintWriter out>
	//   69  136:invokevirtual   #270 <Method void PrintWriter.println()>
			i++;
	//   70  139:iload           4
	//   71  141:iconst_1        
	//   72  142:iadd            
	//   73  143:istore          4
		}
		if(true) goto _L4; else goto _L3
	//   74  145:goto            104
_L3:
		if(!(pdfobject instanceof PdfDictionary)) goto _L4; else goto _L5
	//   75  148:aload_2         
	//   76  149:instanceof      #79  <Class PdfDictionary>
	//   77  152:ifeq            82
_L5:
		pdfobject = ((PdfObject) ((PdfDictionary)pdfobject));
	//   78  155:aload_2         
	//   79  156:checkcast       #79  <Class PdfDictionary>
	//   80  159:astore_2        
		parseTag(s, ((PdfDictionary) (pdfobject)).getDirectObject(PdfName.MCID), ((PdfDictionary) (pdfobject)).getAsDict(PdfName.PG));
	//   81  160:aload_0         
	//   82  161:aload_1         
	//   83  162:aload_2         
	//   84  163:getstatic       #273 <Field PdfName PdfName.MCID>
	//   85  166:invokevirtual   #101 <Method PdfObject PdfDictionary.getDirectObject(PdfName)>
	//   86  169:aload_2         
	//   87  170:getstatic       #212 <Field PdfName PdfName.PG>
	//   88  173:invokevirtual   #83  <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   89  176:invokevirtual   #216 <Method void parseTag(String, PdfObject, PdfDictionary)>
		return;
	//   90  179:return          
	}

	protected String xmlName(PdfName pdfname)
	{
		pdfname = ((PdfName) (pdfname.toString().replaceFirst("/", "")));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #138 <Method String PdfName.toString()>
	//    2    4:ldc2            #275 <String "/">
	//    3    7:ldc1            #203 <String "">
	//    4    9:invokevirtual   #278 <Method String String.replaceFirst(String, String)>
	//    5   12:astore_1        
		return (new StringBuilder()).append(Character.toLowerCase(((String) (pdfname)).charAt(0))).append(((String) (pdfname)).substring(1)).toString();
	//    6   13:new             #17  <Class StringBuilder>
	//    7   16:dup             
	//    8   17:invokespecial   #18  <Method void StringBuilder()>
	//    9   20:aload_1         
	//   10   21:iconst_0        
	//   11   22:invokevirtual   #28  <Method char String.charAt(int)>
	//   12   25:invokestatic    #284 <Method char Character.toLowerCase(char)>
	//   13   28:invokevirtual   #37  <Method StringBuilder StringBuilder.append(char)>
	//   14   31:aload_1         
	//   15   32:iconst_1        
	//   16   33:invokevirtual   #288 <Method String String.substring(int)>
	//   17   36:invokevirtual   #291 <Method StringBuilder StringBuilder.append(String)>
	//   18   39:invokevirtual   #41  <Method String StringBuilder.toString()>
	//   19   42:areturn         
	}

	protected PrintWriter out;
	protected PdfReader reader;
}
