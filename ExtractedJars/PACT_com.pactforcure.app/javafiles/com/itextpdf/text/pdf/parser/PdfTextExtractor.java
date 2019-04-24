// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.PdfReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			LocationTextExtractionStrategy, PdfReaderContentParser, TextExtractionStrategy

public final class PdfTextExtractor
{

	private PdfTextExtractor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static String getTextFromPage(PdfReader pdfreader, int i)
		throws IOException
	{
		return getTextFromPage(pdfreader, i, ((TextExtractionStrategy) (new LocationTextExtractionStrategy())));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:new             #15  <Class LocationTextExtractionStrategy>
	//    3    5:dup             
	//    4    6:invokespecial   #16  <Method void LocationTextExtractionStrategy()>
	//    5    9:invokestatic    #19  <Method String getTextFromPage(PdfReader, int, TextExtractionStrategy)>
	//    6   12:areturn         
	}

	public static String getTextFromPage(PdfReader pdfreader, int i, TextExtractionStrategy textextractionstrategy)
		throws IOException
	{
		return getTextFromPage(pdfreader, i, textextractionstrategy, ((Map) (new HashMap())));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:new             #22  <Class HashMap>
	//    4    6:dup             
	//    5    7:invokespecial   #23  <Method void HashMap()>
	//    6   10:invokestatic    #26  <Method String getTextFromPage(PdfReader, int, TextExtractionStrategy, Map)>
	//    7   13:areturn         
	}

	public static String getTextFromPage(PdfReader pdfreader, int i, TextExtractionStrategy textextractionstrategy, Map map)
		throws IOException
	{
		return ((TextExtractionStrategy)(new PdfReaderContentParser(pdfreader)).processContent(i, ((RenderListener) (textextractionstrategy)), map)).getResultantText();
	//    0    0:new             #28  <Class PdfReaderContentParser>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #31  <Method void PdfReaderContentParser(PdfReader)>
	//    4    8:iload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #35  <Method RenderListener PdfReaderContentParser.processContent(int, RenderListener, Map)>
	//    8   14:checkcast       #37  <Class TextExtractionStrategy>
	//    9   17:invokeinterface #41  <Method String TextExtractionStrategy.getResultantText()>
	//   10   22:areturn         
	}
}
