// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfWriter, FdfWriter, PdfDocument, OutputStreamCounter, 
//			PdfArray, PdfDictionary, PdfName, PdfString, 
//			PdfAction, PdfAnnotation, PdfObject, PdfReaderInstance, 
//			PdfIndirectObject

static class FdfWriter$Wrt extends PdfWriter
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
		if(FdfWriter.access$100(fdf) != null)
	//*  29   71:aload_0         
	//*  30   72:getfield        #23  <Field FdfWriter fdf>
	//*  31   75:invokestatic    #175 <Method String FdfWriter.access$100(FdfWriter)>
	//*  32   78:ifnull          104
			((PdfDictionary) (obj)).put(PdfName.F, ((PdfObject) (new PdfString(FdfWriter.access$100(fdf), "UnicodeBig"))));
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
		if(FdfWriter.access$200(fdf) != null && FdfWriter.access$200(fdf).trim().length() != 0)
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
			((PdfDictionary) (obj)).put(PdfName.STATUS, ((PdfObject) (new PdfString(FdfWriter.access$200(fdf)))));
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

	FdfWriter$Wrt(OutputStream outputstream, FdfWriter fdfwriter)
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
		os.write(FdfWriter.access$000());
	//    9   17:aload_0         
	//   10   18:getfield        #27  <Field OutputStreamCounter os>
	//   11   21:invokestatic    #31  <Method byte[] FdfWriter.access$000()>
	//   12   24:invokevirtual   #37  <Method void OutputStreamCounter.write(byte[])>
		body = new ody(((PdfWriter) (this)));
	//   13   27:aload_0         
	//   14   28:new             #39  <Class PdfWriter$PdfBody>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:invokespecial   #42  <Method void PdfWriter$PdfBody(PdfWriter)>
	//   18   36:putfield        #46  <Field PdfWriter$PdfBody body>
	//   19   39:return          
	}
}
