// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.testutils;

import com.itextpdf.text.pdf.*;
import com.itextpdf.text.pdf.parser.PdfContentStreamProcessor;
import com.itextpdf.text.pdf.parser.TaggedPdfReaderTool;
import com.itextpdf.text.xml.XMLUtil;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.itextpdf.testutils:
//			CompareTool

class CompareTool$CmpTaggedPdfReaderTool extends TaggedPdfReaderTool
{

	public void inspectChildDictionary(PdfDictionary pdfdictionary)
		throws IOException
	{
		inspectChildDictionary(pdfdictionary, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #32  <Method void inspectChildDictionary(PdfDictionary, boolean)>
	//    4    6:return          
	}

	public void parseTag(String s, PdfObject pdfobject, PdfDictionary pdfdictionary)
		throws IOException
	{
		if(pdfobject instanceof PdfNumber)
	//*   0    0:aload_2         
	//*   1    1:instanceof      #37  <Class PdfNumber>
	//*   2    4:ifeq            148
		{
			if(!parsedTags.containsKey(((Object) (pdfdictionary))))
	//*   3    7:aload_0         
	//*   4    8:getfield        #24  <Field Map parsedTags>
	//*   5   11:aload_3         
	//*   6   12:invokeinterface #43  <Method boolean Map.containsKey(Object)>
	//*   7   17:ifne            69
			{
				s = ((String) (new ilter(CompareTool.this)));
	//    8   20:new             #45  <Class CompareTool$CmpMarkedContentRenderFilter>
	//    9   23:dup             
	//   10   24:aload_0         
	//   11   25:getfield        #16  <Field CompareTool this$0>
	//   12   28:invokespecial   #47  <Method void CompareTool$CmpMarkedContentRenderFilter(CompareTool)>
	//   13   31:astore_1        
				(new PdfContentStreamProcessor(((com.itextpdf.text.pdf.parser.RenderListener) (s)))).processContent(PdfReader.getPageContent(pdfdictionary), pdfdictionary.getAsDict(PdfName.RESOURCES));
	//   14   32:new             #49  <Class PdfContentStreamProcessor>
	//   15   35:dup             
	//   16   36:aload_1         
	//   17   37:invokespecial   #52  <Method void PdfContentStreamProcessor(com.itextpdf.text.pdf.parser.RenderListener)>
	//   18   40:aload_3         
	//   19   41:invokestatic    #58  <Method byte[] PdfReader.getPageContent(PdfDictionary)>
	//   20   44:aload_3         
	//   21   45:getstatic       #64  <Field PdfName PdfName.RESOURCES>
	//   22   48:invokevirtual   #70  <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   23   51:invokevirtual   #74  <Method void PdfContentStreamProcessor.processContent(byte[], PdfDictionary)>
				parsedTags.put(((Object) (pdfdictionary)), ((Object) (((ilter) (s)).getParsedTagContent())));
	//   24   54:aload_0         
	//   25   55:getfield        #24  <Field Map parsedTags>
	//   26   58:aload_3         
	//   27   59:aload_1         
	//   28   60:invokevirtual   #78  <Method Map CompareTool$CmpMarkedContentRenderFilter.getParsedTagContent()>
	//   29   63:invokeinterface #82  <Method Object Map.put(Object, Object)>
	//   30   68:pop             
			}
			s = "";
	//   31   69:ldc1            #84  <String "">
	//   32   71:astore_1        
			if(((Map)parsedTags.get(((Object) (pdfdictionary)))).containsKey(((Object) (Integer.valueOf(((PdfNumber)pdfobject).intValue())))))
	//*  33   72:aload_0         
	//*  34   73:getfield        #24  <Field Map parsedTags>
	//*  35   76:aload_3         
	//*  36   77:invokeinterface #88  <Method Object Map.get(Object)>
	//*  37   82:checkcast       #39  <Class Map>
	//*  38   85:aload_2         
	//*  39   86:checkcast       #37  <Class PdfNumber>
	//*  40   89:invokevirtual   #92  <Method int PdfNumber.intValue()>
	//*  41   92:invokestatic    #98  <Method Integer Integer.valueOf(int)>
	//*  42   95:invokeinterface #43  <Method boolean Map.containsKey(Object)>
	//*  43  100:ifeq            135
				s = (String)((Map)parsedTags.get(((Object) (pdfdictionary)))).get(((Object) (Integer.valueOf(((PdfNumber)pdfobject).intValue()))));
	//   44  103:aload_0         
	//   45  104:getfield        #24  <Field Map parsedTags>
	//   46  107:aload_3         
	//   47  108:invokeinterface #88  <Method Object Map.get(Object)>
	//   48  113:checkcast       #39  <Class Map>
	//   49  116:aload_2         
	//   50  117:checkcast       #37  <Class PdfNumber>
	//   51  120:invokevirtual   #92  <Method int PdfNumber.intValue()>
	//   52  123:invokestatic    #98  <Method Integer Integer.valueOf(int)>
	//   53  126:invokeinterface #88  <Method Object Map.get(Object)>
	//   54  131:checkcast       #100 <Class String>
	//   55  134:astore_1        
			out.print(XMLUtil.escapeXML(s, true));
	//   56  135:aload_0         
	//   57  136:getfield        #104 <Field PrintWriter out>
	//   58  139:aload_1         
	//   59  140:iconst_1        
	//   60  141:invokestatic    #110 <Method String XMLUtil.escapeXML(String, boolean)>
	//   61  144:invokevirtual   #116 <Method void PrintWriter.print(String)>
			return;
	//   62  147:return          
		} else
		{
			super.parseTag(s, pdfobject, pdfdictionary);
	//   63  148:aload_0         
	//   64  149:aload_1         
	//   65  150:aload_2         
	//   66  151:aload_3         
	//   67  152:invokespecial   #118 <Method void TaggedPdfReaderTool.parseTag(String, PdfObject, PdfDictionary)>
			return;
	//   68  155:return          
		}
	}

	Map parsedTags;
	final CompareTool this$0;

	CompareTool$CmpTaggedPdfReaderTool()
	{
		this$0 = CompareTool.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field CompareTool this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void TaggedPdfReaderTool()>
		parsedTags = ((Map) (new HashMap()));
	//    5    9:aload_0         
	//    6   10:new             #21  <Class HashMap>
	//    7   13:dup             
	//    8   14:invokespecial   #22  <Method void HashMap()>
	//    9   17:putfield        #24  <Field Map parsedTags>
	//   10   20:return          
	}
}
