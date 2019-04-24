// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.*;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			PdfContentStreamProcessor, ContentOperator, ContentByteUtils, RenderListener

public class PdfReaderContentParser
{

	public PdfReaderContentParser(PdfReader pdfreader)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		reader = pdfreader;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field PdfReader reader>
	//    5    9:return          
	}

	public RenderListener processContent(int i, RenderListener renderlistener)
		throws IOException
	{
		return processContent(i, renderlistener, ((Map) (new HashMap())));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:new             #20  <Class HashMap>
	//    4    6:dup             
	//    5    7:invokespecial   #21  <Method void HashMap()>
	//    6   10:invokevirtual   #24  <Method RenderListener processContent(int, RenderListener, Map)>
	//    7   13:areturn         
	}

	public RenderListener processContent(int i, RenderListener renderlistener, Map map)
		throws IOException
	{
		PdfDictionary pdfdictionary = reader.getPageN(i).getAsDict(PdfName.RESOURCES);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field PdfReader reader>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #33  <Method PdfDictionary PdfReader.getPageN(int)>
	//    4    8:getstatic       #39  <Field PdfName PdfName.RESOURCES>
	//    5   11:invokevirtual   #45  <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//    6   14:astore          4
		PdfContentStreamProcessor pdfcontentstreamprocessor = new PdfContentStreamProcessor(renderlistener);
	//    7   16:new             #47  <Class PdfContentStreamProcessor>
	//    8   19:dup             
	//    9   20:aload_2         
	//   10   21:invokespecial   #50  <Method void PdfContentStreamProcessor(RenderListener)>
	//   11   24:astore          5
		java.util.Map.Entry entry;
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext(); pdfcontentstreamprocessor.registerContentOperator((String)entry.getKey(), (ContentOperator)entry.getValue()))
	//*  12   26:aload_3         
	//*  13   27:invokeinterface #56  <Method Set Map.entrySet()>
	//*  14   32:invokeinterface #62  <Method Iterator Set.iterator()>
	//*  15   37:astore_3        
	//*  16   38:aload_3         
	//*  17   39:invokeinterface #68  <Method boolean Iterator.hasNext()>
	//*  18   44:ifeq            87
			entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//   19   47:aload_3         
	//   20   48:invokeinterface #72  <Method Object Iterator.next()>
	//   21   53:checkcast       #74  <Class java.util.Map$Entry>
	//   22   56:astore          6

	//   23   58:aload           5
	//   24   60:aload           6
	//   25   62:invokeinterface #77  <Method Object java.util.Map$Entry.getKey()>
	//   26   67:checkcast       #79  <Class String>
	//   27   70:aload           6
	//   28   72:invokeinterface #82  <Method Object java.util.Map$Entry.getValue()>
	//   29   77:checkcast       #84  <Class ContentOperator>
	//   30   80:invokevirtual   #88  <Method ContentOperator PdfContentStreamProcessor.registerContentOperator(String, ContentOperator)>
	//   31   83:pop             
	//*  32   84:goto            38
		pdfcontentstreamprocessor.processContent(ContentByteUtils.getContentBytesForPage(reader, i), pdfdictionary);
	//   33   87:aload           5
	//   34   89:aload_0         
	//   35   90:getfield        #13  <Field PdfReader reader>
	//   36   93:iload_1         
	//   37   94:invokestatic    #94  <Method byte[] ContentByteUtils.getContentBytesForPage(PdfReader, int)>
	//   38   97:aload           4
	//   39   99:invokevirtual   #97  <Method void PdfContentStreamProcessor.processContent(byte[], PdfDictionary)>
		return renderlistener;
	//   40  102:aload_2         
	//   41  103:areturn         
	}

	private final PdfReader reader;
}
