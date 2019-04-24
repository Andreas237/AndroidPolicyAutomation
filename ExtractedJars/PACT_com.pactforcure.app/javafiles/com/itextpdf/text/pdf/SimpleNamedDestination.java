// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.xml.XMLUtil;
import com.itextpdf.text.xml.simpleparser.*;
import java.io.*;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfArray, PdfWriter, PdfName, PdfNull, 
//			PdfNumber, IntHashtable, PdfReader, PRIndirectReference, 
//			PdfIndirectReference, PdfObject, PdfDictionary, PdfIndirectObject, 
//			PdfNameTree

public final class SimpleNamedDestination
	implements SimpleXMLDocHandler
{

	private SimpleNamedDestination()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	static PdfArray createDestinationArray(String s, PdfWriter pdfwriter)
	{
		PdfArray pdfarray = new PdfArray();
	//    0    0:new             #19  <Class PdfArray>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void PdfArray()>
	//    3    7:astore_3        
		StringTokenizer stringtokenizer = new StringTokenizer(s);
	//    4    8:new             #22  <Class StringTokenizer>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #25  <Method void StringTokenizer(String)>
	//    8   16:astore          4
		pdfarray.add(((PdfObject) (pdfwriter.getPageReference(Integer.parseInt(stringtokenizer.nextToken())))));
	//    9   18:aload_3         
	//   10   19:aload_1         
	//   11   20:aload           4
	//   12   22:invokevirtual   #29  <Method String StringTokenizer.nextToken()>
	//   13   25:invokestatic    #35  <Method int Integer.parseInt(String)>
	//   14   28:invokevirtual   #41  <Method PdfIndirectReference PdfWriter.getPageReference(int)>
	//   15   31:invokevirtual   #45  <Method boolean PdfArray.add(PdfObject)>
	//   16   34:pop             
		if(!stringtokenizer.hasMoreTokens())
	//*  17   35:aload           4
	//*  18   37:invokevirtual   #49  <Method boolean StringTokenizer.hasMoreTokens()>
	//*  19   40:ifne            74
		{
			pdfarray.add(((PdfObject) (PdfName.XYZ)));
	//   20   43:aload_3         
	//   21   44:getstatic       #55  <Field PdfName PdfName.XYZ>
	//   22   47:invokevirtual   #45  <Method boolean PdfArray.add(PdfObject)>
	//   23   50:pop             
			pdfarray.add(new float[] {
				0.0F, 10000F, 0.0F
			});
	//   24   51:aload_3         
	//   25   52:iconst_3        
	//   26   53:newarray        float[]
	//   27   55:dup             
	//   28   56:iconst_0        
	//   29   57:fconst_0        
	//   30   58:fastore         
	//   31   59:dup             
	//   32   60:iconst_1        
	//   33   61:ldc1            #56  <Float 10000F>
	//   34   63:fastore         
	//   35   64:dup             
	//   36   65:iconst_2        
	//   37   66:fconst_0        
	//   38   67:fastore         
	//   39   68:invokevirtual   #59  <Method boolean PdfArray.add(float[])>
	//   40   71:pop             
		} else
	//*  41   72:aload_3         
	//*  42   73:areturn         
		{
			pdfwriter = ((PdfWriter) (stringtokenizer.nextToken()));
	//   43   74:aload           4
	//   44   76:invokevirtual   #29  <Method String StringTokenizer.nextToken()>
	//   45   79:astore_1        
			s = ((String) (pdfwriter));
	//   46   80:aload_1         
	//   47   81:astore_0        
			if(((String) (pdfwriter)).startsWith("/"))
	//*  48   82:aload_1         
	//*  49   83:ldc1            #61  <String "/">
	//*  50   85:invokevirtual   #67  <Method boolean String.startsWith(String)>
	//*  51   88:ifeq            97
				s = ((String) (pdfwriter)).substring(1);
	//   52   91:aload_1         
	//   53   92:iconst_1        
	//   54   93:invokevirtual   #71  <Method String String.substring(int)>
	//   55   96:astore_0        
			pdfarray.add(((PdfObject) (new PdfName(s))));
	//   56   97:aload_3         
	//   57   98:new             #51  <Class PdfName>
	//   58  101:dup             
	//   59  102:aload_0         
	//   60  103:invokespecial   #72  <Method void PdfName(String)>
	//   61  106:invokevirtual   #45  <Method boolean PdfArray.add(PdfObject)>
	//   62  109:pop             
			int i = 0;
	//   63  110:iconst_0        
	//   64  111:istore_2        
			while(i < 4 && stringtokenizer.hasMoreTokens()) 
	//*  65  112:iload_2         
	//*  66  113:iconst_4        
	//*  67  114:icmpge          72
	//*  68  117:aload           4
	//*  69  119:invokevirtual   #49  <Method boolean StringTokenizer.hasMoreTokens()>
	//*  70  122:ifeq            72
			{
				s = stringtokenizer.nextToken();
	//   71  125:aload           4
	//   72  127:invokevirtual   #29  <Method String StringTokenizer.nextToken()>
	//   73  130:astore_0        
				if(s.equals("null"))
	//*  74  131:aload_0         
	//*  75  132:ldc1            #74  <String "null">
	//*  76  134:invokevirtual   #78  <Method boolean String.equals(Object)>
	//*  77  137:ifeq            155
					pdfarray.add(((PdfObject) (PdfNull.PDFNULL)));
	//   78  140:aload_3         
	//   79  141:getstatic       #84  <Field PdfNull PdfNull.PDFNULL>
	//   80  144:invokevirtual   #45  <Method boolean PdfArray.add(PdfObject)>
	//   81  147:pop             
				else
	//*  82  148:iload_2         
	//*  83  149:iconst_1        
	//*  84  150:iadd            
	//*  85  151:istore_2        
	//*  86  152:goto            112
					pdfarray.add(((PdfObject) (new PdfNumber(s))));
	//   87  155:aload_3         
	//   88  156:new             #86  <Class PdfNumber>
	//   89  159:dup             
	//   90  160:aload_0         
	//   91  161:invokespecial   #87  <Method void PdfNumber(String)>
	//   92  164:invokevirtual   #45  <Method boolean PdfArray.add(PdfObject)>
	//   93  167:pop             
				i++;
			}
		}
		return pdfarray;
	//*  94  168:goto            148
	}

	public static String escapeBinaryString(String s)
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #91  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void StringBuffer()>
	//    3    7:astore          4
		s = ((String) (s.toCharArray()));
	//    4    9:aload_0         
	//    5   10:invokevirtual   #96  <Method char[] String.toCharArray()>
	//    6   13:astore_0        
		int j = s.length;
	//    7   14:aload_0         
	//    8   15:arraylength     
	//    9   16:istore_3        
		int i = 0;
	//   10   17:iconst_0        
	//   11   18:istore_2        
		while(i < j) 
	//*  12   19:iload_2         
	//*  13   20:iload_3         
	//*  14   21:icmpge          118
		{
			char c = s[i];
	//   15   24:aload_0         
	//   16   25:iload_2         
	//   17   26:caload          
	//   18   27:istore_1        
			if(c < ' ')
	//*  19   28:iload_1         
	//*  20   29:bipush          32
	//*  21   31:icmpge          91
			{
				stringbuffer.append('\\');
	//   22   34:aload           4
	//   23   36:bipush          92
	//   24   38:invokevirtual   #100 <Method StringBuffer StringBuffer.append(char)>
	//   25   41:pop             
				String s1 = (new StringBuilder()).append("00").append(Integer.toOctalString(((int) (c)))).toString();
	//   26   42:new             #102 <Class StringBuilder>
	//   27   45:dup             
	//   28   46:invokespecial   #103 <Method void StringBuilder()>
	//   29   49:ldc1            #105 <String "00">
	//   30   51:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   31   54:iload_1         
	//   32   55:invokestatic    #111 <Method String Integer.toOctalString(int)>
	//   33   58:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   34   61:invokevirtual   #114 <Method String StringBuilder.toString()>
	//   35   64:astore          5
				stringbuffer.append(s1.substring(s1.length() - 3));
	//   36   66:aload           4
	//   37   68:aload           5
	//   38   70:aload           5
	//   39   72:invokevirtual   #118 <Method int String.length()>
	//   40   75:iconst_3        
	//   41   76:isub            
	//   42   77:invokevirtual   #71  <Method String String.substring(int)>
	//   43   80:invokevirtual   #121 <Method StringBuffer StringBuffer.append(String)>
	//   44   83:pop             
			} else
	//*  45   84:iload_2         
	//*  46   85:iconst_1        
	//*  47   86:iadd            
	//*  48   87:istore_2        
	//*  49   88:goto            19
			if(c == '\\')
	//*  50   91:iload_1         
	//*  51   92:bipush          92
	//*  52   94:icmpne          108
				stringbuffer.append("\\\\");
	//   53   97:aload           4
	//   54   99:ldc1            #123 <String "\\\\">
	//   55  101:invokevirtual   #121 <Method StringBuffer StringBuffer.append(String)>
	//   56  104:pop             
			else
	//*  57  105:goto            84
				stringbuffer.append(c);
	//   58  108:aload           4
	//   59  110:iload_1         
	//   60  111:invokevirtual   #100 <Method StringBuffer StringBuffer.append(char)>
	//   61  114:pop             
			i++;
		}
	//*  62  115:goto            84
		return stringbuffer.toString();
	//   63  118:aload           4
	//   64  120:invokevirtual   #124 <Method String StringBuffer.toString()>
	//   65  123:areturn         
	}

	public static void exportToXML(HashMap hashmap, OutputStream outputstream, String s, boolean flag)
		throws IOException
	{
		exportToXML(hashmap, ((Writer) (new BufferedWriter(((Writer) (new OutputStreamWriter(outputstream, IanaEncodings.getJavaEncoding(s))))))), s, flag);
	//    0    0:aload_0         
	//    1    1:new             #130 <Class BufferedWriter>
	//    2    4:dup             
	//    3    5:new             #132 <Class OutputStreamWriter>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokestatic    #137 <Method String IanaEncodings.getJavaEncoding(String)>
	//    8   14:invokespecial   #140 <Method void OutputStreamWriter(OutputStream, String)>
	//    9   17:invokespecial   #143 <Method void BufferedWriter(Writer)>
	//   10   20:aload_2         
	//   11   21:iload_3         
	//   12   22:invokestatic    #146 <Method void exportToXML(HashMap, Writer, String, boolean)>
	//   13   25:return          
	}

	public static void exportToXML(HashMap hashmap, Writer writer, String s, boolean flag)
		throws IOException
	{
		writer.write("<?xml version=\"1.0\" encoding=\"");
	//    0    0:aload_1         
	//    1    1:ldc1            #151 <String "<?xml version=\"1.0\" encoding=\"">
	//    2    3:invokevirtual   #156 <Method void Writer.write(String)>
		writer.write(XMLUtil.escapeXML(s, flag));
	//    3    6:aload_1         
	//    4    7:aload_2         
	//    5    8:iload_3         
	//    6    9:invokestatic    #162 <Method String XMLUtil.escapeXML(String, boolean)>
	//    7   12:invokevirtual   #156 <Method void Writer.write(String)>
		writer.write("\"?>\n<Destination>\n");
	//    8   15:aload_1         
	//    9   16:ldc1            #164 <String "\"?>\n<Destination>\n">
	//   10   18:invokevirtual   #156 <Method void Writer.write(String)>
		for(hashmap = ((HashMap) (hashmap.entrySet().iterator())); ((Iterator) (hashmap)).hasNext(); writer.write("</Name>\n"))
	//*  11   21:aload_0         
	//*  12   22:invokevirtual   #170 <Method Set HashMap.entrySet()>
	//*  13   25:invokeinterface #176 <Method Iterator Set.iterator()>
	//*  14   30:astore_0        
	//*  15   31:aload_0         
	//*  16   32:invokeinterface #181 <Method boolean Iterator.hasNext()>
	//*  17   37:ifeq            117
		{
			Object obj = ((Object) ((java.util.Map.Entry)((Iterator) (hashmap)).next()));
	//   18   40:aload_0         
	//   19   41:invokeinterface #185 <Method Object Iterator.next()>
	//   20   46:checkcast       #187 <Class java.util.Map$Entry>
	//   21   49:astore          4
			s = (String)((java.util.Map.Entry) (obj)).getKey();
	//   22   51:aload           4
	//   23   53:invokeinterface #190 <Method Object java.util.Map$Entry.getKey()>
	//   24   58:checkcast       #63  <Class String>
	//   25   61:astore_2        
			obj = ((Object) ((String)((java.util.Map.Entry) (obj)).getValue()));
	//   26   62:aload           4
	//   27   64:invokeinterface #193 <Method Object java.util.Map$Entry.getValue()>
	//   28   69:checkcast       #63  <Class String>
	//   29   72:astore          4
			writer.write("  <Name Page=\"");
	//   30   74:aload_1         
	//   31   75:ldc1            #195 <String "  <Name Page=\"">
	//   32   77:invokevirtual   #156 <Method void Writer.write(String)>
			writer.write(XMLUtil.escapeXML(((String) (obj)), flag));
	//   33   80:aload_1         
	//   34   81:aload           4
	//   35   83:iload_3         
	//   36   84:invokestatic    #162 <Method String XMLUtil.escapeXML(String, boolean)>
	//   37   87:invokevirtual   #156 <Method void Writer.write(String)>
			writer.write("\">");
	//   38   90:aload_1         
	//   39   91:ldc1            #197 <String "\">">
	//   40   93:invokevirtual   #156 <Method void Writer.write(String)>
			writer.write(XMLUtil.escapeXML(escapeBinaryString(s), flag));
	//   41   96:aload_1         
	//   42   97:aload_2         
	//   43   98:invokestatic    #199 <Method String escapeBinaryString(String)>
	//   44  101:iload_3         
	//   45  102:invokestatic    #162 <Method String XMLUtil.escapeXML(String, boolean)>
	//   46  105:invokevirtual   #156 <Method void Writer.write(String)>
		}

	//   47  108:aload_1         
	//   48  109:ldc1            #201 <String "</Name>\n">
	//   49  111:invokevirtual   #156 <Method void Writer.write(String)>
	//*  50  114:goto            31
		writer.write("</Destination>\n");
	//   51  117:aload_1         
	//   52  118:ldc1            #203 <String "</Destination>\n">
	//   53  120:invokevirtual   #156 <Method void Writer.write(String)>
		writer.flush();
	//   54  123:aload_1         
	//   55  124:invokevirtual   #206 <Method void Writer.flush()>
	//   56  127:return          
	}

	public static HashMap getNamedDestination(PdfReader pdfreader, boolean flag)
	{
		HashMap hashmap;
		java.util.Map.Entry entry;
		StringBuffer stringbuffer;
		IntHashtable inthashtable = new IntHashtable();
	//    0    0:new             #213 <Class IntHashtable>
	//    1    3:dup             
	//    2    4:invokespecial   #214 <Method void IntHashtable()>
	//    3    7:astore          4
		int k = pdfreader.getNumberOfPages();
	//    4    9:aload_0         
	//    5   10:invokevirtual   #219 <Method int PdfReader.getNumberOfPages()>
	//    6   13:istore_3        
		for(int i = 1; i <= k; i++)
	//*   7   14:iconst_1        
	//*   8   15:istore_2        
	//*   9   16:iload_2         
	//*  10   17:iload_3         
	//*  11   18:icmpgt          43
			inthashtable.put(pdfreader.getPageOrigRef(i).getNumber(), i);
	//   12   21:aload           4
	//   13   23:aload_0         
	//   14   24:iload_2         
	//   15   25:invokevirtual   #223 <Method PRIndirectReference PdfReader.getPageOrigRef(int)>
	//   16   28:invokevirtual   #228 <Method int PRIndirectReference.getNumber()>
	//   17   31:iload_2         
	//   18   32:invokevirtual   #232 <Method int IntHashtable.put(int, int)>
	//   19   35:pop             

	//   20   36:iload_2         
	//   21   37:iconst_1        
	//   22   38:iadd            
	//   23   39:istore_2        
	//*  24   40:goto            16
		int j;
		PdfArray pdfarray;
		if(flag)
	//*  25   43:iload_1         
	//*  26   44:ifeq            198
			pdfreader = ((PdfReader) (pdfreader.getNamedDestinationFromNames()));
	//   27   47:aload_0         
	//   28   48:invokevirtual   #236 <Method HashMap PdfReader.getNamedDestinationFromNames()>
	//   29   51:astore_0        
		else
	//*  30   52:new             #166 <Class HashMap>
	//*  31   55:dup             
	//*  32   56:aload_0         
	//*  33   57:invokevirtual   #239 <Method int HashMap.size()>
	//*  34   60:invokespecial   #242 <Method void HashMap(int)>
	//*  35   63:astore          5
	//*  36   65:aload_0         
	//*  37   66:invokevirtual   #170 <Method Set HashMap.entrySet()>
	//*  38   69:invokeinterface #176 <Method Iterator Set.iterator()>
	//*  39   74:astore_0        
	//*  40   75:aload_0         
	//*  41   76:invokeinterface #181 <Method boolean Iterator.hasNext()>
	//*  42   81:ifeq            232
	//*  43   84:aload_0         
	//*  44   85:invokeinterface #185 <Method Object Iterator.next()>
	//*  45   90:checkcast       #187 <Class java.util.Map$Entry>
	//*  46   93:astore          6
	//*  47   95:aload           6
	//*  48   97:invokeinterface #193 <Method Object java.util.Map$Entry.getValue()>
	//*  49  102:checkcast       #19  <Class PdfArray>
	//*  50  105:astore          7
	//*  51  107:new             #91  <Class StringBuffer>
	//*  52  110:dup             
	//*  53  111:invokespecial   #92  <Method void StringBuffer()>
	//*  54  114:astore          8
	//*  55  116:aload           8
	//*  56  118:aload           4
	//*  57  120:aload           7
	//*  58  122:iconst_0        
	//*  59  123:invokevirtual   #245 <Method PdfIndirectReference PdfArray.getAsIndirectObject(int)>
	//*  60  126:invokevirtual   #248 <Method int PdfIndirectReference.getNumber()>
	//*  61  129:invokevirtual   #252 <Method int IntHashtable.get(int)>
	//*  62  132:invokevirtual   #255 <Method StringBuffer StringBuffer.append(int)>
	//*  63  135:pop             
	//*  64  136:aload           8
	//*  65  138:bipush          32
	//*  66  140:invokevirtual   #100 <Method StringBuffer StringBuffer.append(char)>
	//*  67  143:aload           7
	//*  68  145:iconst_1        
	//*  69  146:invokevirtual   #259 <Method PdfObject PdfArray.getPdfObject(int)>
	//*  70  149:invokevirtual   #262 <Method String PdfObject.toString()>
	//*  71  152:iconst_1        
	//*  72  153:invokevirtual   #71  <Method String String.substring(int)>
	//*  73  156:invokevirtual   #121 <Method StringBuffer StringBuffer.append(String)>
	//*  74  159:pop             
	//*  75  160:iconst_2        
	//*  76  161:istore_2        
	//*  77  162:iload_2         
	//*  78  163:aload           7
	//*  79  165:invokevirtual   #263 <Method int PdfArray.size()>
	//*  80  168:icmpge          206
	//*  81  171:aload           8
	//*  82  173:bipush          32
	//*  83  175:invokevirtual   #100 <Method StringBuffer StringBuffer.append(char)>
	//*  84  178:aload           7
	//*  85  180:iload_2         
	//*  86  181:invokevirtual   #259 <Method PdfObject PdfArray.getPdfObject(int)>
	//*  87  184:invokevirtual   #262 <Method String PdfObject.toString()>
	//*  88  187:invokevirtual   #121 <Method StringBuffer StringBuffer.append(String)>
	//*  89  190:pop             
	//*  90  191:iload_2         
	//*  91  192:iconst_1        
	//*  92  193:iadd            
	//*  93  194:istore_2        
	//*  94  195:goto            162
			pdfreader = ((PdfReader) (pdfreader.getNamedDestinationFromStrings()));
	//   95  198:aload_0         
	//   96  199:invokevirtual   #266 <Method HashMap PdfReader.getNamedDestinationFromStrings()>
	//   97  202:astore_0        
		hashmap = new HashMap(((HashMap) (pdfreader)).size());
		pdfreader = ((PdfReader) (((HashMap) (pdfreader)).entrySet().iterator()));
_L4:
		if(!((Iterator) (pdfreader)).hasNext())
			break; /* Loop/switch isn't completed */
		entry = (java.util.Map.Entry)((Iterator) (pdfreader)).next();
		pdfarray = (PdfArray)entry.getValue();
		stringbuffer = new StringBuffer();
		stringbuffer.append(inthashtable.get(pdfarray.getAsIndirectObject(0).getNumber()));
		stringbuffer.append(' ').append(pdfarray.getPdfObject(1).toString().substring(1));
		j = 2;
_L2:
		if(j >= pdfarray.size())
			break; /* Loop/switch isn't completed */
		stringbuffer.append(' ').append(pdfarray.getPdfObject(j).toString());
		j++;
		if(true) goto _L2; else goto _L1
	//*  98  203:goto            52
_L1:
		try
		{
			hashmap.put(entry.getKey(), ((Object) (stringbuffer.toString())));
	//   99  206:aload           5
	//  100  208:aload           6
	//  101  210:invokeinterface #190 <Method Object java.util.Map$Entry.getKey()>
	//  102  215:aload           8
	//  103  217:invokevirtual   #124 <Method String StringBuffer.toString()>
	//  104  220:invokevirtual   #269 <Method Object HashMap.put(Object, Object)>
	//  105  223:pop             
		}
	//* 106  224:goto            75
		catch(Exception exception) { }
	//  107  227:astore          6
		if(true) goto _L4; else goto _L3
	//  108  229:goto            75
_L3:
		return hashmap;
	//  109  232:aload           5
	//  110  234:areturn         
	}

	public static HashMap importFromXML(InputStream inputstream)
		throws IOException
	{
		SimpleNamedDestination simplenameddestination = new SimpleNamedDestination();
	//    0    0:new             #2   <Class SimpleNamedDestination>
	//    1    3:dup             
	//    2    4:invokespecial   #273 <Method void SimpleNamedDestination()>
	//    3    7:astore_1        
		SimpleXMLParser.parse(((SimpleXMLDocHandler) (simplenameddestination)), inputstream);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokestatic    #279 <Method void SimpleXMLParser.parse(SimpleXMLDocHandler, InputStream)>
		return simplenameddestination.xmlNames;
	//    7   13:aload_1         
	//    8   14:getfield        #281 <Field HashMap xmlNames>
	//    9   17:areturn         
	}

	public static HashMap importFromXML(Reader reader)
		throws IOException
	{
		SimpleNamedDestination simplenameddestination = new SimpleNamedDestination();
	//    0    0:new             #2   <Class SimpleNamedDestination>
	//    1    3:dup             
	//    2    4:invokespecial   #273 <Method void SimpleNamedDestination()>
	//    3    7:astore_1        
		SimpleXMLParser.parse(((SimpleXMLDocHandler) (simplenameddestination)), reader);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokestatic    #286 <Method void SimpleXMLParser.parse(SimpleXMLDocHandler, Reader)>
		return simplenameddestination.xmlNames;
	//    7   13:aload_1         
	//    8   14:getfield        #281 <Field HashMap xmlNames>
	//    9   17:areturn         
	}

	public static PdfDictionary outputNamedDestinationAsNames(HashMap hashmap, PdfWriter pdfwriter)
	{
		PdfDictionary pdfdictionary = new PdfDictionary();
	//    0    0:new             #291 <Class PdfDictionary>
	//    1    3:dup             
	//    2    4:invokespecial   #292 <Method void PdfDictionary()>
	//    3    7:astore_2        
		for(hashmap = ((HashMap) (hashmap.entrySet().iterator())); ((Iterator) (hashmap)).hasNext();)
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #170 <Method Set HashMap.entrySet()>
	//*   6   12:invokeinterface #176 <Method Iterator Set.iterator()>
	//*   7   17:astore_0        
	//*   8   18:aload_0         
	//*   9   19:invokeinterface #181 <Method boolean Iterator.hasNext()>
	//*  10   24:ifeq            86
		{
			Object obj = ((Object) ((java.util.Map.Entry)((Iterator) (hashmap)).next()));
	//   11   27:aload_0         
	//   12   28:invokeinterface #185 <Method Object Iterator.next()>
	//   13   33:checkcast       #187 <Class java.util.Map$Entry>
	//   14   36:astore          4
			try
			{
				String s = (String)((java.util.Map.Entry) (obj)).getKey();
	//   15   38:aload           4
	//   16   40:invokeinterface #190 <Method Object java.util.Map$Entry.getKey()>
	//   17   45:checkcast       #63  <Class String>
	//   18   48:astore_3        
				obj = ((Object) (createDestinationArray((String)((java.util.Map.Entry) (obj)).getValue(), pdfwriter)));
	//   19   49:aload           4
	//   20   51:invokeinterface #193 <Method Object java.util.Map$Entry.getValue()>
	//   21   56:checkcast       #63  <Class String>
	//   22   59:aload_1         
	//   23   60:invokestatic    #294 <Method PdfArray createDestinationArray(String, PdfWriter)>
	//   24   63:astore          4
				pdfdictionary.put(new PdfName(s), ((PdfObject) (obj)));
	//   25   65:aload_2         
	//   26   66:new             #51  <Class PdfName>
	//   27   69:dup             
	//   28   70:aload_3         
	//   29   71:invokespecial   #72  <Method void PdfName(String)>
	//   30   74:aload           4
	//   31   76:invokevirtual   #297 <Method void PdfDictionary.put(PdfName, PdfObject)>
			}
	//*  32   79:goto            18
			catch(Exception exception) { }
	//   33   82:astore_3        
		}

	//*  34   83:goto            18
		return pdfdictionary;
	//   35   86:aload_2         
	//   36   87:areturn         
	}

	public static PdfDictionary outputNamedDestinationAsStrings(HashMap hashmap, PdfWriter pdfwriter)
		throws IOException
	{
		HashMap hashmap1 = new HashMap(hashmap.size());
	//    0    0:new             #166 <Class HashMap>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #239 <Method int HashMap.size()>
	//    4    8:invokespecial   #242 <Method void HashMap(int)>
	//    5   11:astore_2        
		for(hashmap = ((HashMap) (hashmap.entrySet().iterator())); ((Iterator) (hashmap)).hasNext();)
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #170 <Method Set HashMap.entrySet()>
	//*   8   16:invokeinterface #176 <Method Iterator Set.iterator()>
	//*   9   21:astore_0        
	//*  10   22:aload_0         
	//*  11   23:invokeinterface #181 <Method boolean Iterator.hasNext()>
	//*  12   28:ifeq            83
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (hashmap)).next();
	//   13   31:aload_0         
	//   14   32:invokeinterface #185 <Method Object Iterator.next()>
	//   15   37:checkcast       #187 <Class java.util.Map$Entry>
	//   16   40:astore_3        
			try
			{
				PdfArray pdfarray = createDestinationArray((String)entry.getValue(), pdfwriter);
	//   17   41:aload_3         
	//   18   42:invokeinterface #193 <Method Object java.util.Map$Entry.getValue()>
	//   19   47:checkcast       #63  <Class String>
	//   20   50:aload_1         
	//   21   51:invokestatic    #294 <Method PdfArray createDestinationArray(String, PdfWriter)>
	//   22   54:astore          4
				hashmap1.put(entry.getKey(), ((Object) (pdfwriter.addToBody(((PdfObject) (pdfarray))).getIndirectReference())));
	//   23   56:aload_2         
	//   24   57:aload_3         
	//   25   58:invokeinterface #190 <Method Object java.util.Map$Entry.getKey()>
	//   26   63:aload_1         
	//   27   64:aload           4
	//   28   66:invokevirtual   #303 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//   29   69:invokevirtual   #309 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//   30   72:invokevirtual   #269 <Method Object HashMap.put(Object, Object)>
	//   31   75:pop             
			}
	//*  32   76:goto            22
			catch(Exception exception) { }
	//   33   79:astore_3        
		}

	//*  34   80:goto            22
		return PdfNameTree.writeTree(hashmap1, pdfwriter);
	//   35   83:aload_2         
	//   36   84:aload_1         
	//   37   85:invokestatic    #314 <Method PdfDictionary PdfNameTree.writeTree(HashMap, PdfWriter)>
	//   38   88:areturn         
	}

	public static String unEscapeBinaryString(String s)
	{
		int i;
		int l;
		StringBuffer stringbuffer;
		stringbuffer = new StringBuffer();
	//    0    0:new             #91  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void StringBuffer()>
	//    3    7:astore          7
		s = ((String) (s.toCharArray()));
	//    4    9:aload_0         
	//    5   10:invokevirtual   #96  <Method char[] String.toCharArray()>
	//    6   13:astore_0        
		l = s.length;
	//    7   14:aload_0         
	//    8   15:arraylength     
	//    9   16:istore          5
		i = 0;
	//   10   18:iconst_0        
	//   11   19:istore_2        
_L2:
		char c;
		int j;
label0:
		{
			if(i < l)
	//*  12   20:iload_2         
	//*  13   21:iload           5
	//*  14   23:icmpge          54
			{
				c = s[i];
	//   15   26:aload_0         
	//   16   27:iload_2         
	//   17   28:caload          
	//   18   29:istore_1        
				if(c != '\\')
					break; /* Loop/switch isn't completed */
	//   19   30:iload_1         
	//   20   31:bipush          92
	//   21   33:icmpne          178
				j = i + 1;
	//   22   36:iload_2         
	//   23   37:iconst_1        
	//   24   38:iadd            
	//   25   39:istore_3        
				if(j < l)
					break label0;
	//   26   40:iload_3         
	//   27   41:iload           5
	//   28   43:icmplt          60
				stringbuffer.append('\\');
	//   29   46:aload           7
	//   30   48:bipush          92
	//   31   50:invokevirtual   #100 <Method StringBuffer StringBuffer.append(char)>
	//   32   53:pop             
			}
			return stringbuffer.toString();
	//   33   54:aload           7
	//   34   56:invokevirtual   #124 <Method String StringBuffer.toString()>
	//   35   59:areturn         
		}
		c = s[j];
	//   36   60:aload_0         
	//   37   61:iload_3         
	//   38   62:caload          
	//   39   63:istore_1        
		if(c >= '0' && c <= '7')
	//*  40   64:iload_1         
	//*  41   65:bipush          48
	//*  42   67:icmplt          166
	//*  43   70:iload_1         
	//*  44   71:bipush          55
	//*  45   73:icmpgt          166
		{
			i = c - 48;
	//   46   76:iload_1         
	//   47   77:bipush          48
	//   48   79:isub            
	//   49   80:istore_2        
			int k = j + 1;
	//   50   81:iload_3         
	//   51   82:iconst_1        
	//   52   83:iadd            
	//   53   84:istore          4
			j = 0;
	//   54   86:iconst_0        
	//   55   87:istore_3        
			do
			{
				if(j >= 2 || k >= l)
					break;
	//   56   88:iload_3         
	//   57   89:iconst_2        
	//   58   90:icmpge          144
	//   59   93:iload           4
	//   60   95:iload           5
	//   61   97:icmpge          144
				char c1 = s[k];
	//   62  100:aload_0         
	//   63  101:iload           4
	//   64  103:caload          
	//   65  104:istore          6
				if(c1 < '0' || c1 > '7')
					break;
	//   66  106:iload           6
	//   67  108:bipush          48
	//   68  110:icmplt          144
	//   69  113:iload           6
	//   70  115:bipush          55
	//   71  117:icmpgt          144
				k++;
	//   72  120:iload           4
	//   73  122:iconst_1        
	//   74  123:iadd            
	//   75  124:istore          4
				i = (i * 8 + c1) - 48;
	//   76  126:iload_2         
	//   77  127:bipush          8
	//   78  129:imul            
	//   79  130:iload           6
	//   80  132:iadd            
	//   81  133:bipush          48
	//   82  135:isub            
	//   83  136:istore_2        
				j++;
	//   84  137:iload_3         
	//   85  138:iconst_1        
	//   86  139:iadd            
	//   87  140:istore_3        
			} while(true);
	//   88  141:goto            88
			j = k - 1;
	//   89  144:iload           4
	//   90  146:iconst_1        
	//   91  147:isub            
	//   92  148:istore_3        
			stringbuffer.append((char)i);
	//   93  149:aload           7
	//   94  151:iload_2         
	//   95  152:int2char        
	//   96  153:invokevirtual   #100 <Method StringBuffer StringBuffer.append(char)>
	//   97  156:pop             
			i = j;
	//   98  157:iload_3         
	//   99  158:istore_2        
		} else
	//* 100  159:iload_2         
	//* 101  160:iconst_1        
	//* 102  161:iadd            
	//* 103  162:istore_2        
	//* 104  163:goto            20
		{
			stringbuffer.append(c);
	//  105  166:aload           7
	//  106  168:iload_1         
	//  107  169:invokevirtual   #100 <Method StringBuffer StringBuffer.append(char)>
	//  108  172:pop             
			i = j;
	//  109  173:iload_3         
	//  110  174:istore_2        
		}
_L3:
		i++;
		if(true) goto _L2; else goto _L1
	//* 111  175:goto            159
_L1:
		stringbuffer.append(c);
	//  112  178:aload           7
	//  113  180:iload_1         
	//  114  181:invokevirtual   #100 <Method StringBuffer StringBuffer.append(char)>
	//  115  184:pop             
		  goto _L3
		if(true) goto _L2; else goto _L4
_L4:
	//* 116  185:goto            159
	}

	public void endDocument()
	{
	//    0    0:return          
	}

	public void endElement(String s)
	{
		if(s.equals("Destination"))
	//*   0    0:aload_1         
	//*   1    1:ldc2            #319 <String "Destination">
	//*   2    4:invokevirtual   #78  <Method boolean String.equals(Object)>
	//*   3    7:ifeq            43
			if(xmlLast == null && xmlNames != null)
	//*   4   10:aload_0         
	//*   5   11:getfield        #321 <Field HashMap xmlLast>
	//*   6   14:ifnonnull       25
	//*   7   17:aload_0         
	//*   8   18:getfield        #281 <Field HashMap xmlNames>
	//*   9   21:ifnull          25
				return;
	//   10   24:return          
			else
				throw new RuntimeException(MessageLocalization.getComposedMessage("destination.end.tag.out.of.place", new Object[0]));
	//   11   25:new             #323 <Class RuntimeException>
	//   12   28:dup             
	//   13   29:ldc2            #325 <String "destination.end.tag.out.of.place">
	//   14   32:iconst_0        
	//   15   33:anewarray       Object[]
	//   16   36:invokestatic    #331 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   17   39:invokespecial   #332 <Method void RuntimeException(String)>
	//   18   42:athrow          
		if(!s.equals("Name"))
	//*  19   43:aload_1         
	//*  20   44:ldc2            #334 <String "Name">
	//*  21   47:invokevirtual   #78  <Method boolean String.equals(Object)>
	//*  22   50:ifne            75
			throw new RuntimeException(MessageLocalization.getComposedMessage("invalid.end.tag.1", new Object[] {
				s
			}));
	//   23   53:new             #323 <Class RuntimeException>
	//   24   56:dup             
	//   25   57:ldc2            #336 <String "invalid.end.tag.1">
	//   26   60:iconst_1        
	//   27   61:anewarray       Object[]
	//   28   64:dup             
	//   29   65:iconst_0        
	//   30   66:aload_1         
	//   31   67:aastore         
	//   32   68:invokestatic    #331 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   33   71:invokespecial   #332 <Method void RuntimeException(String)>
	//   34   74:athrow          
		if(xmlLast == null || xmlNames == null)
	//*  35   75:aload_0         
	//*  36   76:getfield        #321 <Field HashMap xmlLast>
	//*  37   79:ifnull          89
	//*  38   82:aload_0         
	//*  39   83:getfield        #281 <Field HashMap xmlNames>
	//*  40   86:ifnonnull       107
			throw new RuntimeException(MessageLocalization.getComposedMessage("name.end.tag.out.of.place", new Object[0]));
	//   41   89:new             #323 <Class RuntimeException>
	//   42   92:dup             
	//   43   93:ldc2            #338 <String "name.end.tag.out.of.place">
	//   44   96:iconst_0        
	//   45   97:anewarray       Object[]
	//   46  100:invokestatic    #331 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   47  103:invokespecial   #332 <Method void RuntimeException(String)>
	//   48  106:athrow          
		if(!xmlLast.containsKey("Page"))
	//*  49  107:aload_0         
	//*  50  108:getfield        #321 <Field HashMap xmlLast>
	//*  51  111:ldc2            #340 <String "Page">
	//*  52  114:invokevirtual   #343 <Method boolean HashMap.containsKey(Object)>
	//*  53  117:ifne            138
		{
			throw new RuntimeException(MessageLocalization.getComposedMessage("page.attribute.missing", new Object[0]));
	//   54  120:new             #323 <Class RuntimeException>
	//   55  123:dup             
	//   56  124:ldc2            #345 <String "page.attribute.missing">
	//   57  127:iconst_0        
	//   58  128:anewarray       Object[]
	//   59  131:invokestatic    #331 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   60  134:invokespecial   #332 <Method void RuntimeException(String)>
	//   61  137:athrow          
		} else
		{
			xmlNames.put(((Object) (unEscapeBinaryString((String)xmlLast.get("Name")))), xmlLast.get("Page"));
	//   62  138:aload_0         
	//   63  139:getfield        #281 <Field HashMap xmlNames>
	//   64  142:aload_0         
	//   65  143:getfield        #321 <Field HashMap xmlLast>
	//   66  146:ldc2            #334 <String "Name">
	//   67  149:invokevirtual   #348 <Method Object HashMap.get(Object)>
	//   68  152:checkcast       #63  <Class String>
	//   69  155:invokestatic    #350 <Method String unEscapeBinaryString(String)>
	//   70  158:aload_0         
	//   71  159:getfield        #321 <Field HashMap xmlLast>
	//   72  162:ldc2            #340 <String "Page">
	//   73  165:invokevirtual   #348 <Method Object HashMap.get(Object)>
	//   74  168:invokevirtual   #269 <Method Object HashMap.put(Object, Object)>
	//   75  171:pop             
			xmlLast = null;
	//   76  172:aload_0         
	//   77  173:aconst_null     
	//   78  174:putfield        #321 <Field HashMap xmlLast>
			return;
	//   79  177:return          
		}
	}

	public void startDocument()
	{
	//    0    0:return          
	}

	public void startElement(String s, Map map)
	{
		if(xmlNames == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #281 <Field HashMap xmlNames>
	//*   2    4:ifnonnull       47
			if(s.equals("Destination"))
	//*   3    7:aload_1         
	//*   4    8:ldc2            #319 <String "Destination">
	//*   5   11:invokevirtual   #78  <Method boolean String.equals(Object)>
	//*   6   14:ifeq            29
			{
				xmlNames = new HashMap();
	//    7   17:aload_0         
	//    8   18:new             #166 <Class HashMap>
	//    9   21:dup             
	//   10   22:invokespecial   #354 <Method void HashMap()>
	//   11   25:putfield        #281 <Field HashMap xmlNames>
				return;
	//   12   28:return          
			} else
			{
				throw new RuntimeException(MessageLocalization.getComposedMessage("root.element.is.not.destination", new Object[0]));
	//   13   29:new             #323 <Class RuntimeException>
	//   14   32:dup             
	//   15   33:ldc2            #356 <String "root.element.is.not.destination">
	//   16   36:iconst_0        
	//   17   37:anewarray       Object[]
	//   18   40:invokestatic    #331 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   19   43:invokespecial   #332 <Method void RuntimeException(String)>
	//   20   46:athrow          
			}
		if(!s.equals("Name"))
	//*  21   47:aload_1         
	//*  22   48:ldc2            #334 <String "Name">
	//*  23   51:invokevirtual   #78  <Method boolean String.equals(Object)>
	//*  24   54:ifne            79
			throw new RuntimeException(MessageLocalization.getComposedMessage("tag.1.not.allowed", new Object[] {
				s
			}));
	//   25   57:new             #323 <Class RuntimeException>
	//   26   60:dup             
	//   27   61:ldc2            #358 <String "tag.1.not.allowed">
	//   28   64:iconst_1        
	//   29   65:anewarray       Object[]
	//   30   68:dup             
	//   31   69:iconst_0        
	//   32   70:aload_1         
	//   33   71:aastore         
	//   34   72:invokestatic    #331 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   35   75:invokespecial   #332 <Method void RuntimeException(String)>
	//   36   78:athrow          
		if(xmlLast != null)
	//*  37   79:aload_0         
	//*  38   80:getfield        #321 <Field HashMap xmlLast>
	//*  39   83:ifnull          104
		{
			throw new RuntimeException(MessageLocalization.getComposedMessage("nested.tags.are.not.allowed", new Object[0]));
	//   40   86:new             #323 <Class RuntimeException>
	//   41   89:dup             
	//   42   90:ldc2            #360 <String "nested.tags.are.not.allowed">
	//   43   93:iconst_0        
	//   44   94:anewarray       Object[]
	//   45   97:invokestatic    #331 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   46  100:invokespecial   #332 <Method void RuntimeException(String)>
	//   47  103:athrow          
		} else
		{
			xmlLast = new HashMap(map);
	//   48  104:aload_0         
	//   49  105:new             #166 <Class HashMap>
	//   50  108:dup             
	//   51  109:aload_2         
	//   52  110:invokespecial   #363 <Method void HashMap(Map)>
	//   53  113:putfield        #321 <Field HashMap xmlLast>
			xmlLast.put("Name", "");
	//   54  116:aload_0         
	//   55  117:getfield        #321 <Field HashMap xmlLast>
	//   56  120:ldc2            #334 <String "Name">
	//   57  123:ldc2            #365 <String "">
	//   58  126:invokevirtual   #269 <Method Object HashMap.put(Object, Object)>
	//   59  129:pop             
			return;
	//   60  130:return          
		}
	}

	public void text(String s)
	{
		if(xmlLast == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #321 <Field HashMap xmlLast>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			String s1 = (String)xmlLast.get("Name");
	//    4    8:aload_0         
	//    5    9:getfield        #321 <Field HashMap xmlLast>
	//    6   12:ldc2            #334 <String "Name">
	//    7   15:invokevirtual   #348 <Method Object HashMap.get(Object)>
	//    8   18:checkcast       #63  <Class String>
	//    9   21:astore_2        
			s = (new StringBuilder()).append(s1).append(s).toString();
	//   10   22:new             #102 <Class StringBuilder>
	//   11   25:dup             
	//   12   26:invokespecial   #103 <Method void StringBuilder()>
	//   13   29:aload_2         
	//   14   30:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   15   33:aload_1         
	//   16   34:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   17   37:invokevirtual   #114 <Method String StringBuilder.toString()>
	//   18   40:astore_1        
			xmlLast.put("Name", ((Object) (s)));
	//   19   41:aload_0         
	//   20   42:getfield        #321 <Field HashMap xmlLast>
	//   21   45:ldc2            #334 <String "Name">
	//   22   48:aload_1         
	//   23   49:invokevirtual   #269 <Method Object HashMap.put(Object, Object)>
	//   24   52:pop             
			return;
	//   25   53:return          
		}
	}

	private HashMap xmlLast;
	private HashMap xmlNames;
}
