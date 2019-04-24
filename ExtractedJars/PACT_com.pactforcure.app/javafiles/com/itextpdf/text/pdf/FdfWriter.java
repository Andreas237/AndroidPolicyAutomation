// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.log.Counter;
import com.itextpdf.text.log.CounterFactory;
import java.io.IOException;
import java.io.OutputStream;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfTemplate, PdfObject, PdfString, PdfName, 
//			PdfIndirectObject, PdfDictionary, PdfAction, PdfAnnotation, 
//			PdfImportedPage, AcroFields, PdfReader, FdfReader, 
//			PdfWriter, PdfDocument, OutputStreamCounter, PdfArray, 
//			PdfReaderInstance

public class FdfWriter
{
	static class Wrt extends PdfWriter
	{

		PdfArray calculate(HashMap hashmap)
			throws IOException
		{
			PdfArray pdfarray = new PdfArray();
		//    0    0:new             #52  <Class PdfArray>
		//    1    3:dup             
		//    2    4:invokespecial   #53  <Method void PdfArray()>
		//    3    7:astore_2        
			hashmap = ((HashMap) (hashmap.entrySet().iterator()));
		//    4    8:aload_1         
		//    5    9:invokevirtual   #59  <Method Set HashMap.entrySet()>
		//    6   12:invokeinterface #65  <Method Iterator Set.iterator()>
		//    7   17:astore_1        
			while(((Iterator) (hashmap)).hasNext()) 
		//*   8   18:aload_1         
		//*   9   19:invokeinterface #71  <Method boolean Iterator.hasNext()>
		//*  10   24:ifeq            234
			{
				Object obj = ((Object) ((java.util.Map.Entry)((Iterator) (hashmap)).next()));
		//   11   27:aload_1         
		//   12   28:invokeinterface #75  <Method Object Iterator.next()>
		//   13   33:checkcast       #77  <Class java.util.Map$Entry>
		//   14   36:astore          4
				String s = (String)((java.util.Map.Entry) (obj)).getKey();
		//   15   38:aload           4
		//   16   40:invokeinterface #80  <Method Object java.util.Map$Entry.getKey()>
		//   17   45:checkcast       #82  <Class String>
		//   18   48:astore_3        
				obj = ((java.util.Map.Entry) (obj)).getValue();
		//   19   49:aload           4
		//   20   51:invokeinterface #85  <Method Object java.util.Map$Entry.getValue()>
		//   21   56:astore          4
				PdfDictionary pdfdictionary = new PdfDictionary();
		//   22   58:new             #87  <Class PdfDictionary>
		//   23   61:dup             
		//   24   62:invokespecial   #88  <Method void PdfDictionary()>
		//   25   65:astore          5
				pdfdictionary.put(PdfName.T, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
		//   26   67:aload           5
		//   27   69:getstatic       #94  <Field PdfName PdfName.T>
		//   28   72:new             #96  <Class PdfString>
		//   29   75:dup             
		//   30   76:aload_3         
		//   31   77:ldc1            #98  <String "UnicodeBig">
		//   32   79:invokespecial   #101 <Method void PdfString(String, String)>
		//   33   82:invokevirtual   #105 <Method void PdfDictionary.put(PdfName, PdfObject)>
				if(obj instanceof HashMap)
		//*  34   85:aload           4
		//*  35   87:instanceof      #55  <Class HashMap>
		//*  36   90:ifeq            120
					pdfdictionary.put(PdfName.KIDS, ((PdfObject) (calculate((HashMap)obj))));
		//   37   93:aload           5
		//   38   95:getstatic       #108 <Field PdfName PdfName.KIDS>
		//   39   98:aload_0         
		//   40   99:aload           4
		//   41  101:checkcast       #55  <Class HashMap>
		//   42  104:invokevirtual   #110 <Method PdfArray calculate(HashMap)>
		//   43  107:invokevirtual   #105 <Method void PdfDictionary.put(PdfName, PdfObject)>
				else
		//*  44  110:aload_2         
		//*  45  111:aload           5
		//*  46  113:invokevirtual   #114 <Method boolean PdfArray.add(PdfObject)>
		//*  47  116:pop             
		//*  48  117:goto            18
				if(obj instanceof PdfAction)
		//*  49  120:aload           4
		//*  50  122:instanceof      #116 <Class PdfAction>
		//*  51  125:ifeq            144
					pdfdictionary.put(PdfName.A, ((PdfObject) ((PdfAction)obj)));
		//   52  128:aload           5
		//   53  130:getstatic       #119 <Field PdfName PdfName.A>
		//   54  133:aload           4
		//   55  135:checkcast       #116 <Class PdfAction>
		//   56  138:invokevirtual   #105 <Method void PdfDictionary.put(PdfName, PdfObject)>
				else
		//*  57  141:goto            110
				if(obj instanceof PdfAnnotation)
		//*  58  144:aload           4
		//*  59  146:instanceof      #121 <Class PdfAnnotation>
		//*  60  149:ifeq            168
					pdfdictionary.put(PdfName.AA, ((PdfObject) ((PdfAnnotation)obj)));
		//   61  152:aload           5
		//   62  154:getstatic       #124 <Field PdfName PdfName.AA>
		//   63  157:aload           4
		//   64  159:checkcast       #121 <Class PdfAnnotation>
		//   65  162:invokevirtual   #105 <Method void PdfDictionary.put(PdfName, PdfObject)>
				else
		//*  66  165:goto            110
				if((obj instanceof PdfDictionary) && ((PdfDictionary)obj).size() == 1 && ((PdfDictionary)obj).contains(PdfName.N))
		//*  67  168:aload           4
		//*  68  170:instanceof      #87  <Class PdfDictionary>
		//*  69  173:ifeq            218
		//*  70  176:aload           4
		//*  71  178:checkcast       #87  <Class PdfDictionary>
		//*  72  181:invokevirtual   #128 <Method int PdfDictionary.size()>
		//*  73  184:iconst_1        
		//*  74  185:icmpne          218
		//*  75  188:aload           4
		//*  76  190:checkcast       #87  <Class PdfDictionary>
		//*  77  193:getstatic       #131 <Field PdfName PdfName.N>
		//*  78  196:invokevirtual   #135 <Method boolean PdfDictionary.contains(PdfName)>
		//*  79  199:ifeq            218
					pdfdictionary.put(PdfName.AP, ((PdfObject) ((PdfDictionary)obj)));
		//   80  202:aload           5
		//   81  204:getstatic       #138 <Field PdfName PdfName.AP>
		//   82  207:aload           4
		//   83  209:checkcast       #87  <Class PdfDictionary>
		//   84  212:invokevirtual   #105 <Method void PdfDictionary.put(PdfName, PdfObject)>
				else
		//*  85  215:goto            110
					pdfdictionary.put(PdfName.V, (PdfObject)obj);
		//   86  218:aload           5
		//   87  220:getstatic       #141 <Field PdfName PdfName.V>
		//   88  223:aload           4
		//   89  225:checkcast       #143 <Class PdfObject>
		//   90  228:invokevirtual   #105 <Method void PdfDictionary.put(PdfName, PdfObject)>
				pdfarray.add(((PdfObject) (pdfdictionary)));
			}
		//*  91  231:goto            110
			return pdfarray;
		//   92  234:aload_2         
		//   93  235:areturn         
		}

		void write()
			throws IOException
		{
			for(Iterator iterator = readerInstances.values().iterator(); iterator.hasNext(); currentPdfReaderInstance.writeAllPages())
		//*   0    0:aload_0         
		//*   1    1:getfield        #149 <Field HashMap readerInstances>
		//*   2    4:invokevirtual   #153 <Method Collection HashMap.values()>
		//*   3    7:invokeinterface #156 <Method Iterator Collection.iterator()>
		//*   4   12:astore_1        
		//*   5   13:aload_1         
		//*   6   14:invokeinterface #71  <Method boolean Iterator.hasNext()>
		//*   7   19:ifeq            45
				currentPdfReaderInstance = (PdfReaderInstance)iterator.next();
		//    8   22:aload_0         
		//    9   23:aload_1         
		//   10   24:invokeinterface #75  <Method Object Iterator.next()>
		//   11   29:checkcast       #158 <Class PdfReaderInstance>
		//   12   32:putfield        #162 <Field PdfReaderInstance currentPdfReaderInstance>

		//   13   35:aload_0         
		//   14   36:getfield        #162 <Field PdfReaderInstance currentPdfReaderInstance>
		//   15   39:invokevirtual   #165 <Method void PdfReaderInstance.writeAllPages()>
		//*  16   42:goto            13
			Object obj = ((Object) (new PdfDictionary()));
		//   17   45:new             #87  <Class PdfDictionary>
		//   18   48:dup             
		//   19   49:invokespecial   #88  <Method void PdfDictionary()>
		//   20   52:astore_1        
			((PdfDictionary) (obj)).put(PdfName.FIELDS, ((PdfObject) (calculate(fdf.fields))));
		//   21   53:aload_1         
		//   22   54:getstatic       #168 <Field PdfName PdfName.FIELDS>
		//   23   57:aload_0         
		//   24   58:aload_0         
		//   25   59:getfield        #23  <Field FdfWriter fdf>
		//   26   62:getfield        #171 <Field HashMap FdfWriter.fields>
		//   27   65:invokevirtual   #110 <Method PdfArray calculate(HashMap)>
		//   28   68:invokevirtual   #105 <Method void PdfDictionary.put(PdfName, PdfObject)>
			if(fdf.file != null)
		//*  29   71:aload_0         
		//*  30   72:getfield        #23  <Field FdfWriter fdf>
		//*  31   75:invokestatic    #175 <Method String FdfWriter.access$100(FdfWriter)>
		//*  32   78:ifnull          104
				((PdfDictionary) (obj)).put(PdfName.F, ((PdfObject) (new PdfString(fdf.file, "UnicodeBig"))));
		//   33   81:aload_1         
		//   34   82:getstatic       #178 <Field PdfName PdfName.F>
		//   35   85:new             #96  <Class PdfString>
		//   36   88:dup             
		//   37   89:aload_0         
		//   38   90:getfield        #23  <Field FdfWriter fdf>
		//   39   93:invokestatic    #175 <Method String FdfWriter.access$100(FdfWriter)>
		//   40   96:ldc1            #98  <String "UnicodeBig">
		//   41   98:invokespecial   #101 <Method void PdfString(String, String)>
		//   42  101:invokevirtual   #105 <Method void PdfDictionary.put(PdfName, PdfObject)>
			if(fdf.statusMessage != null && fdf.statusMessage.trim().length() != 0)
		//*  43  104:aload_0         
		//*  44  105:getfield        #23  <Field FdfWriter fdf>
		//*  45  108:invokestatic    #181 <Method String FdfWriter.access$200(FdfWriter)>
		//*  46  111:ifnull          151
		//*  47  114:aload_0         
		//*  48  115:getfield        #23  <Field FdfWriter fdf>
		//*  49  118:invokestatic    #181 <Method String FdfWriter.access$200(FdfWriter)>
		//*  50  121:invokevirtual   #185 <Method String String.trim()>
		//*  51  124:invokevirtual   #188 <Method int String.length()>
		//*  52  127:ifeq            151
				((PdfDictionary) (obj)).put(PdfName.STATUS, ((PdfObject) (new PdfString(fdf.statusMessage))));
		//   53  130:aload_1         
		//   54  131:getstatic       #191 <Field PdfName PdfName.STATUS>
		//   55  134:new             #96  <Class PdfString>
		//   56  137:dup             
		//   57  138:aload_0         
		//   58  139:getfield        #23  <Field FdfWriter fdf>
		//   59  142:invokestatic    #181 <Method String FdfWriter.access$200(FdfWriter)>
		//   60  145:invokespecial   #194 <Method void PdfString(String)>
		//   61  148:invokevirtual   #105 <Method void PdfDictionary.put(PdfName, PdfObject)>
			PdfDictionary pdfdictionary = new PdfDictionary();
		//   62  151:new             #87  <Class PdfDictionary>
		//   63  154:dup             
		//   64  155:invokespecial   #88  <Method void PdfDictionary()>
		//   65  158:astore_2        
			pdfdictionary.put(PdfName.FDF, ((PdfObject) (obj)));
		//   66  159:aload_2         
		//   67  160:getstatic       #197 <Field PdfName PdfName.FDF>
		//   68  163:aload_1         
		//   69  164:invokevirtual   #105 <Method void PdfDictionary.put(PdfName, PdfObject)>
			obj = ((Object) (addToBody(((PdfObject) (pdfdictionary))).getIndirectReference()));
		//   70  167:aload_0         
		//   71  168:aload_2         
		//   72  169:invokevirtual   #201 <Method PdfIndirectObject addToBody(PdfObject)>
		//   73  172:invokevirtual   #207 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
		//   74  175:astore_1        
			os.write(getISOBytes("trailer\n"));
		//   75  176:aload_0         
		//   76  177:getfield        #27  <Field OutputStreamCounter os>
		//   77  180:ldc1            #209 <String "trailer\n">
		//   78  182:invokestatic    #213 <Method byte[] getISOBytes(String)>
		//   79  185:invokevirtual   #37  <Method void OutputStreamCounter.write(byte[])>
			pdfdictionary = new PdfDictionary();
		//   80  188:new             #87  <Class PdfDictionary>
		//   81  191:dup             
		//   82  192:invokespecial   #88  <Method void PdfDictionary()>
		//   83  195:astore_2        
			pdfdictionary.put(PdfName.ROOT, ((PdfObject) (obj)));
		//   84  196:aload_2         
		//   85  197:getstatic       #216 <Field PdfName PdfName.ROOT>
		//   86  200:aload_1         
		//   87  201:invokevirtual   #105 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.toPdf(((PdfWriter) (null)), ((OutputStream) (os)));
		//   88  204:aload_2         
		//   89  205:aconst_null     
		//   90  206:aload_0         
		//   91  207:getfield        #27  <Field OutputStreamCounter os>
		//   92  210:invokevirtual   #220 <Method void PdfDictionary.toPdf(PdfWriter, OutputStream)>
			os.write(getISOBytes("\n%%EOF\n"));
		//   93  213:aload_0         
		//   94  214:getfield        #27  <Field OutputStreamCounter os>
		//   95  217:ldc1            #222 <String "\n%%EOF\n">
		//   96  219:invokestatic    #213 <Method byte[] getISOBytes(String)>
		//   97  222:invokevirtual   #37  <Method void OutputStreamCounter.write(byte[])>
			os.close();
		//   98  225:aload_0         
		//   99  226:getfield        #27  <Field OutputStreamCounter os>
		//  100  229:invokevirtual   #225 <Method void OutputStreamCounter.close()>
		//  101  232:return          
		}

		private FdfWriter fdf;

		Wrt(OutputStream outputstream, FdfWriter fdfwriter)
			throws IOException
		{
			super(new PdfDocument(), outputstream);
		//    0    0:aload_0         
		//    1    1:new             #15  <Class PdfDocument>
		//    2    4:dup             
		//    3    5:invokespecial   #18  <Method void PdfDocument()>
		//    4    8:aload_1         
		//    5    9:invokespecial   #21  <Method void PdfWriter(PdfDocument, OutputStream)>
			fdf = fdfwriter;
		//    6   12:aload_0         
		//    7   13:aload_2         
		//    8   14:putfield        #23  <Field FdfWriter fdf>
			os.write(FdfWriter.HEADER_FDF);
		//    9   17:aload_0         
		//   10   18:getfield        #27  <Field OutputStreamCounter os>
		//   11   21:invokestatic    #31  <Method byte[] FdfWriter.access$000()>
		//   12   24:invokevirtual   #37  <Method void OutputStreamCounter.write(byte[])>
			body = new PdfWriter.PdfBody(((PdfWriter) (this)));
		//   13   27:aload_0         
		//   14   28:new             #39  <Class PdfWriter$PdfBody>
		//   15   31:dup             
		//   16   32:aload_0         
		//   17   33:invokespecial   #42  <Method void PdfWriter$PdfBody(PdfWriter)>
		//   18   36:putfield        #46  <Field PdfWriter$PdfBody body>
		//   19   39:return          
		}
	}


	public FdfWriter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		fields = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #37  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #38  <Method void HashMap()>
	//    6   12:putfield        #40  <Field HashMap fields>
		wrt = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #42  <Field FdfWriter$Wrt wrt>
		COUNTER = CounterFactory.getCounter(com/itextpdf/text/pdf/FdfWriter);
	//   10   20:aload_0         
	//   11   21:ldc1            #2   <Class FdfWriter>
	//   12   23:invokestatic    #48  <Method Counter CounterFactory.getCounter(Class)>
	//   13   26:putfield        #50  <Field Counter COUNTER>
	//   14   29:return          
	}

	public FdfWriter(OutputStream outputstream)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		fields = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #37  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #38  <Method void HashMap()>
	//    6   12:putfield        #40  <Field HashMap fields>
		wrt = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #42  <Field FdfWriter$Wrt wrt>
		COUNTER = CounterFactory.getCounter(com/itextpdf/text/pdf/FdfWriter);
	//   10   20:aload_0         
	//   11   21:ldc1            #2   <Class FdfWriter>
	//   12   23:invokestatic    #48  <Method Counter CounterFactory.getCounter(Class)>
	//   13   26:putfield        #50  <Field Counter COUNTER>
		wrt = new Wrt(outputstream, this);
	//   14   29:aload_0         
	//   15   30:new             #6   <Class FdfWriter$Wrt>
	//   16   33:dup             
	//   17   34:aload_1         
	//   18   35:aload_0         
	//   19   36:invokespecial   #56  <Method void FdfWriter$Wrt(OutputStream, FdfWriter)>
	//   20   39:putfield        #42  <Field FdfWriter$Wrt wrt>
	//   21   42:return          
	}

	public PdfTemplate createTemplate(float f, float f1)
	{
		return PdfTemplate.createTemplate(((PdfWriter) (wrt)), f, f1);
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field FdfWriter$Wrt wrt>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokestatic    #73  <Method PdfTemplate PdfTemplate.createTemplate(PdfWriter, float, float)>
	//    5    9:areturn         
	}

	protected Counter getCounter()
	{
		return COUNTER;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Counter COUNTER>
	//    2    4:areturn         
	}

	public String getField(String s)
	{
		StringTokenizer stringtokenizer;
		HashMap hashmap = fields;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field HashMap fields>
	//    2    4:astore_2        
		stringtokenizer = new StringTokenizer(s, ".");
	//    3    5:new             #78  <Class StringTokenizer>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:ldc1            #80  <String ".">
	//    7   12:invokespecial   #83  <Method void StringTokenizer(String, String)>
	//    8   15:astore_3        
		s = ((String) (hashmap));
	//    9   16:aload_2         
	//   10   17:astore_1        
		if(stringtokenizer.hasMoreTokens()) goto _L2; else goto _L1
	//   11   18:aload_3         
	//   12   19:invokevirtual   #87  <Method boolean StringTokenizer.hasMoreTokens()>
	//   13   22:ifne            46
_L1:
		return null;
	//   14   25:aconst_null     
	//   15   26:areturn         
_L5:
		if(!stringtokenizer.hasMoreTokens())
			continue; /* Loop/switch isn't completed */
	//   16   27:aload_3         
	//   17   28:invokevirtual   #87  <Method boolean StringTokenizer.hasMoreTokens()>
	//   18   31:ifeq            61
		if(!(s instanceof HashMap)) goto _L1; else goto _L3
	//   19   34:aload_1         
	//   20   35:instanceof      #37  <Class HashMap>
	//   21   38:ifeq            25
_L3:
		s = ((String) ((HashMap)s));
	//   22   41:aload_1         
	//   23   42:checkcast       #37  <Class HashMap>
	//   24   45:astore_1        
_L2:
		s = ((String) (((HashMap) (s)).get(((Object) (stringtokenizer.nextToken())))));
	//   25   46:aload_1         
	//   26   47:aload_3         
	//   27   48:invokevirtual   #91  <Method String StringTokenizer.nextToken()>
	//   28   51:invokevirtual   #95  <Method Object HashMap.get(Object)>
	//   29   54:astore_1        
		if(s != null) goto _L5; else goto _L4
	//   30   55:aload_1         
	//   31   56:ifnonnull       27
_L4:
		return null;
	//   32   59:aconst_null     
	//   33   60:areturn         
		if(s instanceof HashMap) goto _L1; else goto _L6
	//   34   61:aload_1         
	//   35   62:instanceof      #37  <Class HashMap>
	//   36   65:ifne            25
_L6:
		if(((PdfObject)s).isString())
	//*  37   68:aload_1         
	//*  38   69:checkcast       #97  <Class PdfObject>
	//*  39   72:invokevirtual   #100 <Method boolean PdfObject.isString()>
	//*  40   75:ifeq            86
			return ((PdfString)s).toUnicodeString();
	//   41   78:aload_1         
	//   42   79:checkcast       #102 <Class PdfString>
	//   43   82:invokevirtual   #105 <Method String PdfString.toUnicodeString()>
	//   44   85:areturn         
		else
			return PdfName.decodeName(((Object) (s)).toString());
	//   45   86:aload_1         
	//   46   87:invokevirtual   #108 <Method String Object.toString()>
	//   47   90:invokestatic    #113 <Method String PdfName.decodeName(String)>
	//   48   93:areturn         
	}

	public HashMap getFields()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #37  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void HashMap()>
	//    3    7:astore_1        
		iterateFields(hashmap, fields, "");
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #40  <Field HashMap fields>
	//    8   14:ldc1            #117 <String "">
	//    9   16:invokevirtual   #121 <Method void iterateFields(HashMap, HashMap, String)>
		return hashmap;
	//   10   19:aload_1         
	//   11   20:areturn         
	}

	public String getFile()
	{
		return file;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field String file>
	//    2    4:areturn         
	}

	public PdfImportedPage getImportedPage(PdfReader pdfreader, int i)
	{
		return wrt.getImportedPage(pdfreader, i);
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field FdfWriter$Wrt wrt>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #128 <Method PdfImportedPage FdfWriter$Wrt.getImportedPage(PdfReader, int)>
	//    5    9:areturn         
	}

	public String getStatusMessage()
	{
		return statusMessage;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field String statusMessage>
	//    2    4:areturn         
	}

	void iterateFields(HashMap hashmap, HashMap hashmap1, String s)
	{
		for(hashmap1 = ((HashMap) (hashmap1.entrySet().iterator())); ((Iterator) (hashmap1)).hasNext();)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #133 <Method Set HashMap.entrySet()>
	//*   2    4:invokeinterface #139 <Method Iterator Set.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #144 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            134
		{
			Object obj = ((Object) ((java.util.Map.Entry)((Iterator) (hashmap1)).next()));
	//    7   19:aload_2         
	//    8   20:invokeinterface #148 <Method Object Iterator.next()>
	//    9   25:checkcast       #150 <Class java.util.Map$Entry>
	//   10   28:astore          5
			String s1 = (String)((java.util.Map.Entry) (obj)).getKey();
	//   11   30:aload           5
	//   12   32:invokeinterface #153 <Method Object java.util.Map$Entry.getKey()>
	//   13   37:checkcast       #155 <Class String>
	//   14   40:astore          4
			obj = ((java.util.Map.Entry) (obj)).getValue();
	//   15   42:aload           5
	//   16   44:invokeinterface #158 <Method Object java.util.Map$Entry.getValue()>
	//   17   49:astore          5
			if(obj instanceof HashMap)
	//*  18   51:aload           5
	//*  19   53:instanceof      #37  <Class HashMap>
	//*  20   56:ifeq            96
				iterateFields(hashmap, (HashMap)obj, (new StringBuilder()).append(s).append(".").append(s1).toString());
	//   21   59:aload_0         
	//   22   60:aload_1         
	//   23   61:aload           5
	//   24   63:checkcast       #37  <Class HashMap>
	//   25   66:new             #160 <Class StringBuilder>
	//   26   69:dup             
	//   27   70:invokespecial   #161 <Method void StringBuilder()>
	//   28   73:aload_3         
	//   29   74:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   30   77:ldc1            #80  <String ".">
	//   31   79:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   32   82:aload           4
	//   33   84:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   34   87:invokevirtual   #166 <Method String StringBuilder.toString()>
	//   35   90:invokevirtual   #121 <Method void iterateFields(HashMap, HashMap, String)>
			else
	//*  36   93:goto            10
				hashmap.put(((Object) ((new StringBuilder()).append(s).append(".").append(s1).toString().substring(1))), obj);
	//   37   96:aload_1         
	//   38   97:new             #160 <Class StringBuilder>
	//   39  100:dup             
	//   40  101:invokespecial   #161 <Method void StringBuilder()>
	//   41  104:aload_3         
	//   42  105:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   43  108:ldc1            #80  <String ".">
	//   44  110:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   45  113:aload           4
	//   46  115:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   47  118:invokevirtual   #166 <Method String StringBuilder.toString()>
	//   48  121:iconst_1        
	//   49  122:invokevirtual   #170 <Method String String.substring(int)>
	//   50  125:aload           5
	//   51  127:invokevirtual   #174 <Method Object HashMap.put(Object, Object)>
	//   52  130:pop             
		}

	//*  53  131:goto            10
	//   54  134:return          
	}

	public boolean removeField(String s)
	{
		Object obj;
		StringTokenizer stringtokenizer;
		obj = ((Object) (fields));
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field HashMap fields>
	//    2    4:astore_3        
		stringtokenizer = new StringTokenizer(s, ".");
	//    3    5:new             #78  <Class StringTokenizer>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:ldc1            #80  <String ".">
	//    7   12:invokespecial   #83  <Method void StringTokenizer(String, String)>
	//    8   15:astore          5
		if(stringtokenizer.hasMoreTokens()) goto _L2; else goto _L1
	//    9   17:aload           5
	//   10   19:invokevirtual   #87  <Method boolean StringTokenizer.hasMoreTokens()>
	//   11   22:ifne            27
_L1:
		return false;
	//   12   25:iconst_0        
	//   13   26:ireturn         
_L2:
		ArrayList arraylist;
		arraylist = new ArrayList();
	//   14   27:new             #179 <Class ArrayList>
	//   15   30:dup             
	//   16   31:invokespecial   #180 <Method void ArrayList()>
	//   17   34:astore          4
		s = ((String) (obj));
	//   18   36:aload_3         
	//   19   37:astore_1        
_L5:
		Object obj1;
		obj = ((Object) (stringtokenizer.nextToken()));
	//   20   38:aload           5
	//   21   40:invokevirtual   #91  <Method String StringTokenizer.nextToken()>
	//   22   43:astore_3        
		obj1 = ((HashMap) (s)).get(obj);
	//   23   44:aload_1         
	//   24   45:aload_3         
	//   25   46:invokevirtual   #95  <Method Object HashMap.get(Object)>
	//   26   49:astore          6
		if(obj1 == null) goto _L1; else goto _L3
	//   27   51:aload           6
	//   28   53:ifnull          25
_L3:
		arraylist.add(((Object) (s)));
	//   29   56:aload           4
	//   30   58:aload_1         
	//   31   59:invokevirtual   #184 <Method boolean ArrayList.add(Object)>
	//   32   62:pop             
		arraylist.add(obj);
	//   33   63:aload           4
	//   34   65:aload_3         
	//   35   66:invokevirtual   #184 <Method boolean ArrayList.add(Object)>
	//   36   69:pop             
		if(!stringtokenizer.hasMoreTokens())
			continue; /* Loop/switch isn't completed */
	//   37   70:aload           5
	//   38   72:invokevirtual   #87  <Method boolean StringTokenizer.hasMoreTokens()>
	//   39   75:ifeq            95
		if(!(obj1 instanceof HashMap)) goto _L1; else goto _L4
	//   40   78:aload           6
	//   41   80:instanceof      #37  <Class HashMap>
	//   42   83:ifeq            25
_L4:
		s = ((String) ((HashMap)obj1));
	//   43   86:aload           6
	//   44   88:checkcast       #37  <Class HashMap>
	//   45   91:astore_1        
		  goto _L5
	//*  46   92:goto            38
		if(obj1 instanceof HashMap) goto _L1; else goto _L6
	//   47   95:aload           6
	//   48   97:instanceof      #37  <Class HashMap>
	//   49  100:ifne            25
_L6:
		int i = arraylist.size() - 2;
	//   50  103:aload           4
	//   51  105:invokevirtual   #188 <Method int ArrayList.size()>
	//   52  108:iconst_2        
	//   53  109:isub            
	//   54  110:istore_2        
		do
		{
label0:
			{
				if(i >= 0)
	//*  55  111:iload_2         
	//*  56  112:iflt            148
				{
					s = ((String) ((HashMap)arraylist.get(i)));
	//   57  115:aload           4
	//   58  117:iload_2         
	//   59  118:invokevirtual   #191 <Method Object ArrayList.get(int)>
	//   60  121:checkcast       #37  <Class HashMap>
	//   61  124:astore_1        
					((HashMap) (s)).remove(((Object) ((String)arraylist.get(i + 1))));
	//   62  125:aload_1         
	//   63  126:aload           4
	//   64  128:iload_2         
	//   65  129:iconst_1        
	//   66  130:iadd            
	//   67  131:invokevirtual   #191 <Method Object ArrayList.get(int)>
	//   68  134:checkcast       #155 <Class String>
	//   69  137:invokevirtual   #194 <Method Object HashMap.remove(Object)>
	//   70  140:pop             
					if(((HashMap) (s)).isEmpty())
						break label0;
	//   71  141:aload_1         
	//   72  142:invokevirtual   #197 <Method boolean HashMap.isEmpty()>
	//   73  145:ifne            150
				}
				return true;
	//   74  148:iconst_1        
	//   75  149:ireturn         
			}
			i -= 2;
	//   76  150:iload_2         
	//   77  151:iconst_2        
	//   78  152:isub            
	//   79  153:istore_2        
		} while(true);
	//   80  154:goto            111
	}

	boolean setField(String s, PdfObject pdfobject)
	{
		StringTokenizer stringtokenizer;
		HashMap hashmap = fields;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field HashMap fields>
	//    2    4:astore_3        
		stringtokenizer = new StringTokenizer(s, ".");
	//    3    5:new             #78  <Class StringTokenizer>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:ldc1            #80  <String ".">
	//    7   12:invokespecial   #83  <Method void StringTokenizer(String, String)>
	//    8   15:astore          4
		s = ((String) (hashmap));
	//    9   17:aload_3         
	//   10   18:astore_1        
		if(stringtokenizer.hasMoreTokens()) goto _L2; else goto _L1
	//   11   19:aload           4
	//   12   21:invokevirtual   #87  <Method boolean StringTokenizer.hasMoreTokens()>
	//   13   24:ifne            29
_L1:
		return false;
	//   14   27:iconst_0        
	//   15   28:ireturn         
_L2:
		String s1;
		Object obj;
		do
		{
			s1 = stringtokenizer.nextToken();
	//   16   29:aload           4
	//   17   31:invokevirtual   #91  <Method String StringTokenizer.nextToken()>
	//   18   34:astore_3        
			obj = ((HashMap) (s)).get(((Object) (s1)));
	//   19   35:aload_1         
	//   20   36:aload_3         
	//   21   37:invokevirtual   #95  <Method Object HashMap.get(Object)>
	//   22   40:astore          5
			if(!stringtokenizer.hasMoreTokens())
				continue; /* Loop/switch isn't completed */
	//   23   42:aload           4
	//   24   44:invokevirtual   #87  <Method boolean StringTokenizer.hasMoreTokens()>
	//   25   47:ifeq            98
			if(obj != null)
				continue; /* Loop/switch isn't completed */
	//   26   50:aload           5
	//   27   52:ifnonnull       81
			obj = ((Object) (new HashMap()));
	//   28   55:new             #37  <Class HashMap>
	//   29   58:dup             
	//   30   59:invokespecial   #38  <Method void HashMap()>
	//   31   62:astore          5
			((HashMap) (s)).put(((Object) (s1)), obj);
	//   32   64:aload_1         
	//   33   65:aload_3         
	//   34   66:aload           5
	//   35   68:invokevirtual   #174 <Method Object HashMap.put(Object, Object)>
	//   36   71:pop             
			s = ((String) ((HashMap)obj));
	//   37   72:aload           5
	//   38   74:checkcast       #37  <Class HashMap>
	//   39   77:astore_1        
		} while(true);
	//   40   78:goto            29
		if(!(obj instanceof HashMap)) goto _L1; else goto _L3
	//   41   81:aload           5
	//   42   83:instanceof      #37  <Class HashMap>
	//   43   86:ifeq            27
_L3:
		s = ((String) ((HashMap)obj));
	//   44   89:aload           5
	//   45   91:checkcast       #37  <Class HashMap>
	//   46   94:astore_1        
		  goto _L2
	//*  47   95:goto            29
		if(obj instanceof HashMap) goto _L1; else goto _L4
	//   48   98:aload           5
	//   49  100:instanceof      #37  <Class HashMap>
	//   50  103:ifne            27
_L4:
		((HashMap) (s)).put(((Object) (s1)), ((Object) (pdfobject)));
	//   51  106:aload_1         
	//   52  107:aload_3         
	//   53  108:aload_2         
	//   54  109:invokevirtual   #174 <Method Object HashMap.put(Object, Object)>
	//   55  112:pop             
		return true;
	//   56  113:iconst_1        
	//   57  114:ireturn         
	}

	public boolean setFieldAsAction(String s, PdfAction pdfaction)
	{
		return setField(s, ((PdfObject) (pdfaction)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #203 <Method boolean setField(String, PdfObject)>
	//    4    6:ireturn         
	}

	public boolean setFieldAsImage(String s, Image image)
	{
		boolean flag;
		try
		{
			if(Float.isNaN(image.getAbsoluteX()))
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #213 <Method float Image.getAbsoluteX()>
	//*   2    4:invokestatic    #219 <Method boolean Float.isNaN(float)>
	//*   3    7:ifeq            19
				image.setAbsolutePosition(0.0F, image.getAbsoluteY());
	//    4   10:aload_2         
	//    5   11:fconst_0        
	//    6   12:aload_2         
	//    7   13:invokevirtual   #222 <Method float Image.getAbsoluteY()>
	//    8   16:invokevirtual   #226 <Method void Image.setAbsolutePosition(float, float)>
			if(Float.isNaN(image.getAbsoluteY()))
	//*   9   19:aload_2         
	//*  10   20:invokevirtual   #222 <Method float Image.getAbsoluteY()>
	//*  11   23:invokestatic    #219 <Method boolean Float.isNaN(float)>
	//*  12   26:ifeq            38
				image.setAbsolutePosition(image.getAbsoluteY(), 0.0F);
	//   13   29:aload_2         
	//   14   30:aload_2         
	//   15   31:invokevirtual   #222 <Method float Image.getAbsoluteY()>
	//   16   34:fconst_0        
	//   17   35:invokevirtual   #226 <Method void Image.setAbsolutePosition(float, float)>
			Object obj = ((Object) (PdfTemplate.createTemplate(((PdfWriter) (wrt)), image.getWidth(), image.getHeight())));
	//   18   38:aload_0         
	//   19   39:getfield        #42  <Field FdfWriter$Wrt wrt>
	//   20   42:aload_2         
	//   21   43:invokevirtual   #229 <Method float Image.getWidth()>
	//   22   46:aload_2         
	//   23   47:invokevirtual   #232 <Method float Image.getHeight()>
	//   24   50:invokestatic    #73  <Method PdfTemplate PdfTemplate.createTemplate(PdfWriter, float, float)>
	//   25   53:astore          4
			((PdfTemplate) (obj)).addImage(image);
	//   26   55:aload           4
	//   27   57:aload_2         
	//   28   58:invokevirtual   #236 <Method void PdfTemplate.addImage(Image)>
			image = ((Image) (((PdfTemplate) (obj)).getFormXObject(0)));
	//   29   61:aload           4
	//   30   63:iconst_0        
	//   31   64:invokevirtual   #240 <Method PdfStream PdfTemplate.getFormXObject(int)>
	//   32   67:astore_2        
			image = ((Image) (wrt.addToBody(((PdfObject) (image))).getIndirectReference()));
	//   33   68:aload_0         
	//   34   69:getfield        #42  <Field FdfWriter$Wrt wrt>
	//   35   72:aload_2         
	//   36   73:invokevirtual   #244 <Method PdfIndirectObject FdfWriter$Wrt.addToBody(PdfObject)>
	//   37   76:invokevirtual   #250 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//   38   79:astore_2        
			obj = ((Object) (new PdfDictionary()));
	//   39   80:new             #252 <Class PdfDictionary>
	//   40   83:dup             
	//   41   84:invokespecial   #253 <Method void PdfDictionary()>
	//   42   87:astore          4
			((PdfDictionary) (obj)).put(PdfName.N, ((PdfObject) (image)));
	//   43   89:aload           4
	//   44   91:getstatic       #257 <Field PdfName PdfName.N>
	//   45   94:aload_2         
	//   46   95:invokevirtual   #260 <Method void PdfDictionary.put(PdfName, PdfObject)>
			flag = setField(s, ((PdfObject) (obj)));
	//   47   98:aload_0         
	//   48   99:aload_1         
	//   49  100:aload           4
	//   50  102:invokevirtual   #203 <Method boolean setField(String, PdfObject)>
	//   51  105:istore_3        
		}
	//*  52  106:iload_3         
	//*  53  107:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  54  108:astore_1        
		{
			throw new ExceptionConverter(((Exception) (s)));
	//   55  109:new             #262 <Class ExceptionConverter>
	//   56  112:dup             
	//   57  113:aload_1         
	//   58  114:invokespecial   #265 <Method void ExceptionConverter(Exception)>
	//   59  117:athrow          
		}
		return flag;
	}

	public boolean setFieldAsJavascript(String s, PdfName pdfname, String s1)
	{
		PdfAnnotation pdfannotation = wrt.createAnnotation(((com.itextpdf.text.Rectangle) (null)), ((PdfName) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field FdfWriter$Wrt wrt>
	//    2    4:aconst_null     
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #271 <Method PdfAnnotation FdfWriter$Wrt.createAnnotation(com.itextpdf.text.Rectangle, PdfName)>
	//    5    9:astore          4
		pdfannotation.put(pdfname, ((PdfObject) (PdfAction.javaScript(s1, ((PdfWriter) (wrt))))));
	//    6   11:aload           4
	//    7   13:aload_2         
	//    8   14:aload_3         
	//    9   15:aload_0         
	//   10   16:getfield        #42  <Field FdfWriter$Wrt wrt>
	//   11   19:invokestatic    #277 <Method PdfAction PdfAction.javaScript(String, PdfWriter)>
	//   12   22:invokevirtual   #280 <Method void PdfAnnotation.put(PdfName, PdfObject)>
		return setField(s, ((PdfObject) (pdfannotation)));
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:aload           4
	//   16   29:invokevirtual   #203 <Method boolean setField(String, PdfObject)>
	//   17   32:ireturn         
	}

	public boolean setFieldAsName(String s, String s1)
	{
		return setField(s, ((PdfObject) (new PdfName(s1))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #110 <Class PdfName>
	//    3    5:dup             
	//    4    6:aload_2         
	//    5    7:invokespecial   #285 <Method void PdfName(String)>
	//    6   10:invokevirtual   #203 <Method boolean setField(String, PdfObject)>
	//    7   13:ireturn         
	}

	public boolean setFieldAsString(String s, String s1)
	{
		return setField(s, ((PdfObject) (new PdfString(s1, "UnicodeBig"))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #102 <Class PdfString>
	//    3    5:dup             
	//    4    6:aload_2         
	//    5    7:ldc2            #288 <String "UnicodeBig">
	//    6   10:invokespecial   #289 <Method void PdfString(String, String)>
	//    7   13:invokevirtual   #203 <Method boolean setField(String, PdfObject)>
	//    8   16:ireturn         
	}

	public boolean setFieldAsTemplate(String s, PdfTemplate pdftemplate)
	{
		try
		{
			PdfDictionary pdfdictionary = new PdfDictionary();
	//    0    0:new             #252 <Class PdfDictionary>
	//    1    3:dup             
	//    2    4:invokespecial   #253 <Method void PdfDictionary()>
	//    3    7:astore_3        
			if(pdftemplate instanceof PdfImportedPage)
	//*   4    8:aload_2         
	//*   5    9:instanceof      #293 <Class PdfImportedPage>
	//*   6   12:ifeq            33
			{
				pdfdictionary.put(PdfName.N, ((PdfObject) (pdftemplate.getIndirectReference())));
	//    7   15:aload_3         
	//    8   16:getstatic       #257 <Field PdfName PdfName.N>
	//    9   19:aload_2         
	//   10   20:invokevirtual   #294 <Method PdfIndirectReference PdfTemplate.getIndirectReference()>
	//   11   23:invokevirtual   #260 <Method void PdfDictionary.put(PdfName, PdfObject)>
			} else
	//*  12   26:aload_0         
	//*  13   27:aload_1         
	//*  14   28:aload_3         
	//*  15   29:invokevirtual   #203 <Method boolean setField(String, PdfObject)>
	//*  16   32:ireturn         
			{
				pdftemplate = ((PdfTemplate) (pdftemplate.getFormXObject(0)));
	//   17   33:aload_2         
	//   18   34:iconst_0        
	//   19   35:invokevirtual   #240 <Method PdfStream PdfTemplate.getFormXObject(int)>
	//   20   38:astore_2        
				pdftemplate = ((PdfTemplate) (wrt.addToBody(((PdfObject) (pdftemplate))).getIndirectReference()));
	//   21   39:aload_0         
	//   22   40:getfield        #42  <Field FdfWriter$Wrt wrt>
	//   23   43:aload_2         
	//   24   44:invokevirtual   #244 <Method PdfIndirectObject FdfWriter$Wrt.addToBody(PdfObject)>
	//   25   47:invokevirtual   #250 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//   26   50:astore_2        
				pdfdictionary.put(PdfName.N, ((PdfObject) (pdftemplate)));
	//   27   51:aload_3         
	//   28   52:getstatic       #257 <Field PdfName PdfName.N>
	//   29   55:aload_2         
	//   30   56:invokevirtual   #260 <Method void PdfDictionary.put(PdfName, PdfObject)>
			}
			return setField(s, ((PdfObject) (pdfdictionary)));
		}
	//*  31   59:goto            26
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  32   62:astore_1        
		{
			throw new ExceptionConverter(((Exception) (s)));
	//   33   63:new             #262 <Class ExceptionConverter>
	//   34   66:dup             
	//   35   67:aload_1         
	//   36   68:invokespecial   #265 <Method void ExceptionConverter(Exception)>
	//   37   71:athrow          
		}
	}

	public void setFields(AcroFields acrofields)
	{
		acrofields = ((AcroFields) (acrofields.getFields().entrySet().iterator()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #301 <Method Map AcroFields.getFields()>
	//    2    4:invokeinterface #304 <Method Set Map.entrySet()>
	//    3    9:invokeinterface #139 <Method Iterator Set.iterator()>
	//    4   14:astore_1        
		do
		{
			if(!((Iterator) (acrofields)).hasNext())
				break;
	//    5   15:aload_1         
	//    6   16:invokeinterface #144 <Method boolean Iterator.hasNext()>
	//    7   21:ifeq            114
			Object obj = ((Object) ((java.util.Map.Entry)((Iterator) (acrofields)).next()));
	//    8   24:aload_1         
	//    9   25:invokeinterface #148 <Method Object Iterator.next()>
	//   10   30:checkcast       #150 <Class java.util.Map$Entry>
	//   11   33:astore_3        
			String s = (String)((java.util.Map.Entry) (obj)).getKey();
	//   12   34:aload_3         
	//   13   35:invokeinterface #153 <Method Object java.util.Map$Entry.getKey()>
	//   14   40:checkcast       #155 <Class String>
	//   15   43:astore_2        
			Object obj1 = ((Object) (((AcroFields.Item)((java.util.Map.Entry) (obj)).getValue()).getMerged(0)));
	//   16   44:aload_3         
	//   17   45:invokeinterface #158 <Method Object java.util.Map$Entry.getValue()>
	//   18   50:checkcast       #306 <Class AcroFields$Item>
	//   19   53:iconst_0        
	//   20   54:invokevirtual   #310 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//   21   57:astore          4
			obj = ((Object) (PdfReader.getPdfObjectRelease(((PdfDictionary) (obj1)).get(PdfName.V))));
	//   22   59:aload           4
	//   23   61:getstatic       #313 <Field PdfName PdfName.V>
	//   24   64:invokevirtual   #316 <Method PdfObject PdfDictionary.get(PdfName)>
	//   25   67:invokestatic    #322 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   26   70:astore_3        
			if(obj != null)
	//*  27   71:aload_3         
	//*  28   72:ifnull          15
			{
				obj1 = ((Object) (PdfReader.getPdfObjectRelease(((PdfDictionary) (obj1)).get(PdfName.FT))));
	//   29   75:aload           4
	//   30   77:getstatic       #325 <Field PdfName PdfName.FT>
	//   31   80:invokevirtual   #316 <Method PdfObject PdfDictionary.get(PdfName)>
	//   32   83:invokestatic    #322 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   33   86:astore          4
				if(obj1 != null && !PdfName.SIG.equals(obj1))
	//*  34   88:aload           4
	//*  35   90:ifnull          15
	//*  36   93:getstatic       #328 <Field PdfName PdfName.SIG>
	//*  37   96:aload           4
	//*  38   98:invokevirtual   #331 <Method boolean PdfName.equals(Object)>
	//*  39  101:ifne            15
					setField(s, ((PdfObject) (obj)));
	//   40  104:aload_0         
	//   41  105:aload_2         
	//   42  106:aload_3         
	//   43  107:invokevirtual   #203 <Method boolean setField(String, PdfObject)>
	//   44  110:pop             
			}
		} while(true);
	//   45  111:goto            15
	//   46  114:return          
	}

	public void setFields(FdfReader fdfreader)
	{
		fdfreader = ((FdfReader) (fdfreader.getFields().entrySet().iterator()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #336 <Method HashMap FdfReader.getFields()>
	//    2    4:invokevirtual   #133 <Method Set HashMap.entrySet()>
	//    3    7:invokeinterface #139 <Method Iterator Set.iterator()>
	//    4   12:astore_1        
		do
		{
			if(!((Iterator) (fdfreader)).hasNext())
				break;
	//    5   13:aload_1         
	//    6   14:invokeinterface #144 <Method boolean Iterator.hasNext()>
	//    7   19:ifeq            96
			Object obj = ((Object) ((java.util.Map.Entry)((Iterator) (fdfreader)).next()));
	//    8   22:aload_1         
	//    9   23:invokeinterface #148 <Method Object Iterator.next()>
	//   10   28:checkcast       #150 <Class java.util.Map$Entry>
	//   11   31:astore_3        
			String s = (String)((java.util.Map.Entry) (obj)).getKey();
	//   12   32:aload_3         
	//   13   33:invokeinterface #153 <Method Object java.util.Map$Entry.getKey()>
	//   14   38:checkcast       #155 <Class String>
	//   15   41:astore_2        
			obj = ((Object) ((PdfDictionary)((java.util.Map.Entry) (obj)).getValue()));
	//   16   42:aload_3         
	//   17   43:invokeinterface #158 <Method Object java.util.Map$Entry.getValue()>
	//   18   48:checkcast       #252 <Class PdfDictionary>
	//   19   51:astore_3        
			PdfObject pdfobject = ((PdfDictionary) (obj)).get(PdfName.V);
	//   20   52:aload_3         
	//   21   53:getstatic       #313 <Field PdfName PdfName.V>
	//   22   56:invokevirtual   #316 <Method PdfObject PdfDictionary.get(PdfName)>
	//   23   59:astore          4
			if(pdfobject != null)
	//*  24   61:aload           4
	//*  25   63:ifnull          74
				setField(s, pdfobject);
	//   26   66:aload_0         
	//   27   67:aload_2         
	//   28   68:aload           4
	//   29   70:invokevirtual   #203 <Method boolean setField(String, PdfObject)>
	//   30   73:pop             
			obj = ((Object) (((PdfDictionary) (obj)).get(PdfName.A)));
	//   31   74:aload_3         
	//   32   75:getstatic       #339 <Field PdfName PdfName.A>
	//   33   78:invokevirtual   #316 <Method PdfObject PdfDictionary.get(PdfName)>
	//   34   81:astore_3        
			if(obj != null)
	//*  35   82:aload_3         
	//*  36   83:ifnull          13
				setField(s, ((PdfObject) (obj)));
	//   37   86:aload_0         
	//   38   87:aload_2         
	//   39   88:aload_3         
	//   40   89:invokevirtual   #203 <Method boolean setField(String, PdfObject)>
	//   41   92:pop             
		} while(true);
	//   42   93:goto            13
	//   43   96:return          
	}

	public void setFields(PdfReader pdfreader)
	{
		setFields(pdfreader.getAcroFields());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #344 <Method AcroFields PdfReader.getAcroFields()>
	//    3    5:invokevirtual   #346 <Method void setFields(AcroFields)>
	//    4    8:return          
	}

	public void setFile(String s)
	{
		file = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #63  <Field String file>
	//    3    5:return          
	}

	public void setStatusMessage(String s)
	{
		statusMessage = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #66  <Field String statusMessage>
	//    3    5:return          
	}

	public void write()
		throws IOException
	{
		wrt.write();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field FdfWriter$Wrt wrt>
	//    2    4:invokevirtual   #351 <Method void FdfWriter$Wrt.write()>
	//    3    7:return          
	}

	public void writeTo(OutputStream outputstream)
		throws IOException
	{
		if(wrt == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field FdfWriter$Wrt wrt>
	//*   2    4:ifnonnull       20
			wrt = new Wrt(outputstream, this);
	//    3    7:aload_0         
	//    4    8:new             #6   <Class FdfWriter$Wrt>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokespecial   #56  <Method void FdfWriter$Wrt(OutputStream, FdfWriter)>
	//    9   17:putfield        #42  <Field FdfWriter$Wrt wrt>
		wrt.write();
	//   10   20:aload_0         
	//   11   21:getfield        #42  <Field FdfWriter$Wrt wrt>
	//   12   24:invokevirtual   #351 <Method void FdfWriter$Wrt.write()>
	//   13   27:return          
	}

	private static final byte HEADER_FDF[] = DocWriter.getISOBytes("%FDF-1.4\n%\342\343\317\323\n");
	protected Counter COUNTER;
	HashMap fields;
	private String file;
	private String statusMessage;
	Wrt wrt;

	static 
	{
	//    0    0:ldc1            #23  <String "%FDF-1.4\n%\342\343\317\323\n">
	//    1    2:invokestatic    #29  <Method byte[] DocWriter.getISOBytes(String)>
	//    2    5:putstatic       #31  <Field byte[] HEADER_FDF>
	//*   3    8:return          
	}


/*
	static byte[] access$000()
	{
		return HEADER_FDF;
	//    0    0:getstatic       #31  <Field byte[] HEADER_FDF>
	//    1    3:areturn         
	}

*/


/*
	static String access$100(FdfWriter fdfwriter)
	{
		return fdfwriter.file;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field String file>
	//    2    4:areturn         
	}

*/


/*
	static String access$200(FdfWriter fdfwriter)
	{
		return fdfwriter.statusMessage;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field String statusMessage>
	//    2    4:areturn         
	}

*/
}
