// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.testutils;

import com.itextpdf.text.*;
import com.itextpdf.text.io.RandomAccessSourceFactory;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.pdf.parser.*;
import com.itextpdf.text.xml.XMLUtil;
import com.itextpdf.xmp.*;
import com.itextpdf.xmp.options.SerializeOptions;
import java.io.*;
import java.util.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class CompareTool
{
	class CmpMarkedContentRenderFilter
		implements RenderListener
	{

		public void beginTextBlock()
		{
			int i;
			for(Iterator iterator = tagsByMcid.keySet().iterator(); iterator.hasNext(); ((TextExtractionStrategy)tagsByMcid.get(((Object) (Integer.valueOf(i))))).beginTextBlock())
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field Map tagsByMcid>
		//*   2    4:invokeinterface #34  <Method Set Map.keySet()>
		//*   3    9:invokeinterface #40  <Method Iterator Set.iterator()>
		//*   4   14:astore_2        
		//*   5   15:aload_2         
		//*   6   16:invokeinterface #46  <Method boolean Iterator.hasNext()>
		//*   7   21:ifeq            61
				i = ((Integer)iterator.next()).intValue();
		//    8   24:aload_2         
		//    9   25:invokeinterface #50  <Method Object Iterator.next()>
		//   10   30:checkcast       #52  <Class Integer>
		//   11   33:invokevirtual   #56  <Method int Integer.intValue()>
		//   12   36:istore_1        

		//   13   37:aload_0         
		//   14   38:getfield        #26  <Field Map tagsByMcid>
		//   15   41:iload_1         
		//   16   42:invokestatic    #60  <Method Integer Integer.valueOf(int)>
		//   17   45:invokeinterface #64  <Method Object Map.get(Object)>
		//   18   50:checkcast       #66  <Class TextExtractionStrategy>
		//   19   53:invokeinterface #68  <Method void TextExtractionStrategy.beginTextBlock()>
		//*  20   58:goto            15
		//   21   61:return          
		}

		public void endTextBlock()
		{
			int i;
			for(Iterator iterator = tagsByMcid.keySet().iterator(); iterator.hasNext(); ((TextExtractionStrategy)tagsByMcid.get(((Object) (Integer.valueOf(i))))).endTextBlock())
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field Map tagsByMcid>
		//*   2    4:invokeinterface #34  <Method Set Map.keySet()>
		//*   3    9:invokeinterface #40  <Method Iterator Set.iterator()>
		//*   4   14:astore_2        
		//*   5   15:aload_2         
		//*   6   16:invokeinterface #46  <Method boolean Iterator.hasNext()>
		//*   7   21:ifeq            61
				i = ((Integer)iterator.next()).intValue();
		//    8   24:aload_2         
		//    9   25:invokeinterface #50  <Method Object Iterator.next()>
		//   10   30:checkcast       #52  <Class Integer>
		//   11   33:invokevirtual   #56  <Method int Integer.intValue()>
		//   12   36:istore_1        

		//   13   37:aload_0         
		//   14   38:getfield        #26  <Field Map tagsByMcid>
		//   15   41:iload_1         
		//   16   42:invokestatic    #60  <Method Integer Integer.valueOf(int)>
		//   17   45:invokeinterface #64  <Method Object Map.get(Object)>
		//   18   50:checkcast       #66  <Class TextExtractionStrategy>
		//   19   53:invokeinterface #71  <Method void TextExtractionStrategy.endTextBlock()>
		//*  20   58:goto            15
		//   21   61:return          
		}

		public Map getParsedTagContent()
		{
			HashMap hashmap = new HashMap();
		//    0    0:new             #23  <Class HashMap>
		//    1    3:dup             
		//    2    4:invokespecial   #24  <Method void HashMap()>
		//    3    7:astore_2        
			int i;
			for(Iterator iterator = tagsByMcid.keySet().iterator(); iterator.hasNext(); ((Map) (hashmap)).put(((Object) (Integer.valueOf(i))), ((Object) (((TextExtractionStrategy)tagsByMcid.get(((Object) (Integer.valueOf(i))))).getResultantText()))))
		//*   4    8:aload_0         
		//*   5    9:getfield        #26  <Field Map tagsByMcid>
		//*   6   12:invokeinterface #34  <Method Set Map.keySet()>
		//*   7   17:invokeinterface #40  <Method Iterator Set.iterator()>
		//*   8   22:astore_3        
		//*   9   23:aload_3         
		//*  10   24:invokeinterface #46  <Method boolean Iterator.hasNext()>
		//*  11   29:ifeq            80
				i = ((Integer)iterator.next()).intValue();
		//   12   32:aload_3         
		//   13   33:invokeinterface #50  <Method Object Iterator.next()>
		//   14   38:checkcast       #52  <Class Integer>
		//   15   41:invokevirtual   #56  <Method int Integer.intValue()>
		//   16   44:istore_1        

		//   17   45:aload_2         
		//   18   46:iload_1         
		//   19   47:invokestatic    #60  <Method Integer Integer.valueOf(int)>
		//   20   50:aload_0         
		//   21   51:getfield        #26  <Field Map tagsByMcid>
		//   22   54:iload_1         
		//   23   55:invokestatic    #60  <Method Integer Integer.valueOf(int)>
		//   24   58:invokeinterface #64  <Method Object Map.get(Object)>
		//   25   63:checkcast       #66  <Class TextExtractionStrategy>
		//   26   66:invokeinterface #77  <Method String TextExtractionStrategy.getResultantText()>
		//   27   71:invokeinterface #81  <Method Object Map.put(Object, Object)>
		//   28   76:pop             
		//*  29   77:goto            23
			return ((Map) (hashmap));
		//   30   80:aload_2         
		//   31   81:areturn         
		}

		public void renderImage(ImageRenderInfo imagerenderinfo)
		{
		//    0    0:return          
		}

		public void renderText(TextRenderInfo textrenderinfo)
		{
			Integer integer = textrenderinfo.getMcid();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #93  <Method Integer TextRenderInfo.getMcid()>
		//    2    4:astore_2        
			if(integer != null && tagsByMcid.containsKey(((Object) (integer))))
		//*   3    5:aload_2         
		//*   4    6:ifnull          42
		//*   5    9:aload_0         
		//*   6   10:getfield        #26  <Field Map tagsByMcid>
		//*   7   13:aload_2         
		//*   8   14:invokeinterface #97  <Method boolean Map.containsKey(Object)>
		//*   9   19:ifeq            42
				((TextExtractionStrategy)tagsByMcid.get(((Object) (integer)))).renderText(textrenderinfo);
		//   10   22:aload_0         
		//   11   23:getfield        #26  <Field Map tagsByMcid>
		//   12   26:aload_2         
		//   13   27:invokeinterface #64  <Method Object Map.get(Object)>
		//   14   32:checkcast       #66  <Class TextExtractionStrategy>
		//   15   35:aload_1         
		//   16   36:invokeinterface #99  <Method void TextExtractionStrategy.renderText(TextRenderInfo)>
			else
		//*  17   41:return          
			if(integer != null)
		//*  18   42:aload_2         
		//*  19   43:ifnull          41
			{
				tagsByMcid.put(((Object) (integer)), ((Object) (new SimpleTextExtractionStrategy())));
		//   20   46:aload_0         
		//   21   47:getfield        #26  <Field Map tagsByMcid>
		//   22   50:aload_2         
		//   23   51:new             #101 <Class SimpleTextExtractionStrategy>
		//   24   54:dup             
		//   25   55:invokespecial   #102 <Method void SimpleTextExtractionStrategy()>
		//   26   58:invokeinterface #81  <Method Object Map.put(Object, Object)>
		//   27   63:pop             
				((TextExtractionStrategy)tagsByMcid.get(((Object) (integer)))).renderText(textrenderinfo);
		//   28   64:aload_0         
		//   29   65:getfield        #26  <Field Map tagsByMcid>
		//   30   68:aload_2         
		//   31   69:invokeinterface #64  <Method Object Map.get(Object)>
		//   32   74:checkcast       #66  <Class TextExtractionStrategy>
		//   33   77:aload_1         
		//   34   78:invokeinterface #99  <Method void TextExtractionStrategy.renderText(TextRenderInfo)>
				return;
		//   35   83:return          
			}
		}

		Map tagsByMcid;
		final CompareTool this$0;

		CmpMarkedContentRenderFilter()
		{
			this$0 = CompareTool.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field CompareTool this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
			tagsByMcid = ((Map) (new HashMap()));
		//    5    9:aload_0         
		//    6   10:new             #23  <Class HashMap>
		//    7   13:dup             
		//    8   14:invokespecial   #24  <Method void HashMap()>
		//    9   17:putfield        #26  <Field Map tagsByMcid>
		//   10   20:return          
		}
	}

	class CmpPngFileFilter
		implements FileFilter
	{

		public boolean accept(File file)
		{
			file = ((File) (file.getAbsolutePath()));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #27  <Method String File.getAbsolutePath()>
		//    2    4:astore_1        
			boolean flag = ((String) (file)).endsWith(".png");
		//    3    5:aload_1         
		//    4    6:ldc1            #29  <String ".png">
		//    5    8:invokevirtual   #35  <Method boolean String.endsWith(String)>
		//    6   11:istore_2        
			boolean flag1 = ((String) (file)).contains("cmp_");
		//    7   12:aload_1         
		//    8   13:ldc1            #37  <String "cmp_">
		//    9   15:invokevirtual   #41  <Method boolean String.contains(CharSequence)>
		//   10   18:istore_3        
			return flag && flag1 && ((String) (file)).contains(((CharSequence) (cmpPdfName)));
		//   11   19:iload_2         
		//   12   20:ifeq            43
		//   13   23:iload_3         
		//   14   24:ifeq            43
		//   15   27:aload_1         
		//   16   28:aload_0         
		//   17   29:getfield        #15  <Field CompareTool this$0>
		//   18   32:invokestatic    #45  <Method String CompareTool.access$200(CompareTool)>
		//   19   35:invokevirtual   #41  <Method boolean String.contains(CharSequence)>
		//   20   38:ifeq            43
		//   21   41:iconst_1        
		//   22   42:ireturn         
		//   23   43:iconst_0        
		//   24   44:ireturn         
		}

		final CompareTool this$0;

		CmpPngFileFilter()
		{
			this$0 = CompareTool.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field CompareTool this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}

	class CmpTaggedPdfReaderTool extends TaggedPdfReaderTool
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
					s = ((String) (new CmpMarkedContentRenderFilter()));
		//    8   20:new             #45  <Class CompareTool$CmpMarkedContentRenderFilter>
		//    9   23:dup             
		//   10   24:aload_0         
		//   11   25:getfield        #16  <Field CompareTool this$0>
		//   12   28:invokespecial   #47  <Method void CompareTool$CmpMarkedContentRenderFilter(CompareTool)>
		//   13   31:astore_1        
					(new PdfContentStreamProcessor(((RenderListener) (s)))).processContent(PdfReader.getPageContent(pdfdictionary), pdfdictionary.getAsDict(PdfName.RESOURCES));
		//   14   32:new             #49  <Class PdfContentStreamProcessor>
		//   15   35:dup             
		//   16   36:aload_1         
		//   17   37:invokespecial   #52  <Method void PdfContentStreamProcessor(RenderListener)>
		//   18   40:aload_3         
		//   19   41:invokestatic    #58  <Method byte[] PdfReader.getPageContent(PdfDictionary)>
		//   20   44:aload_3         
		//   21   45:getstatic       #64  <Field PdfName PdfName.RESOURCES>
		//   22   48:invokevirtual   #70  <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
		//   23   51:invokevirtual   #74  <Method void PdfContentStreamProcessor.processContent(byte[], PdfDictionary)>
					parsedTags.put(((Object) (pdfdictionary)), ((Object) (((CmpMarkedContentRenderFilter) (s)).getParsedTagContent())));
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

		CmpTaggedPdfReaderTool()
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

	protected class CompareResult
	{

		protected void addError(ObjectPath objectpath, String s)
		{
			if(differences.size() < messageLimit)
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field Map differences>
		//*   2    4:invokeinterface #37  <Method int Map.size()>
		//*   3    9:aload_0         
		//*   4   10:getfield        #28  <Field int messageLimit>
		//*   5   13:icmpge          34
				differences.put(((Object) ((ObjectPath)objectpath.clone())), ((Object) (s)));
		//    6   16:aload_0         
		//    7   17:getfield        #26  <Field Map differences>
		//    8   20:aload_1         
		//    9   21:invokevirtual   #43  <Method Object CompareTool$ObjectPath.clone()>
		//   10   24:checkcast       #39  <Class CompareTool$ObjectPath>
		//   11   27:aload_2         
		//   12   28:invokeinterface #47  <Method Object Map.put(Object, Object)>
		//   13   33:pop             
		//   14   34:return          
		}

		public int getErrorCount()
		{
			return differences.size();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field Map differences>
		//    2    4:invokeinterface #37  <Method int Map.size()>
		//    3    9:ireturn         
		}

		public String getReport()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #52  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #53  <Method void StringBuilder()>
		//    3    7:astore_2        
			boolean flag = true;
		//    4    8:iconst_1        
		//    5    9:istore_1        
			for(Iterator iterator = differences.entrySet().iterator(); iterator.hasNext();)
		//*   6   10:aload_0         
		//*   7   11:getfield        #26  <Field Map differences>
		//*   8   14:invokeinterface #57  <Method Set Map.entrySet()>
		//*   9   19:invokeinterface #63  <Method Iterator Set.iterator()>
		//*  10   24:astore_3        
		//*  11   25:aload_3         
		//*  12   26:invokeinterface #69  <Method boolean Iterator.hasNext()>
		//*  13   31:ifeq            111
			{
				java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
		//   14   34:aload_3         
		//   15   35:invokeinterface #72  <Method Object Iterator.next()>
		//   16   40:checkcast       #74  <Class java.util.Map$Entry>
		//   17   43:astore          4
				if(!flag)
		//*  18   45:iload_1         
		//*  19   46:ifne            61
					stringbuilder.append("-----------------------------").append("\n");
		//   20   49:aload_2         
		//   21   50:ldc1            #76  <String "-----------------------------">
		//   22   52:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
		//   23   55:ldc1            #82  <String "\n">
		//   24   57:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
		//   25   60:pop             
				ObjectPath objectpath = (ObjectPath)entry.getKey();
		//   26   61:aload           4
		//   27   63:invokeinterface #85  <Method Object java.util.Map$Entry.getKey()>
		//   28   68:checkcast       #39  <Class CompareTool$ObjectPath>
		//   29   71:astore          5
				stringbuilder.append((String)entry.getValue()).append("\n").append(objectpath.toString()).append("\n");
		//   30   73:aload_2         
		//   31   74:aload           4
		//   32   76:invokeinterface #88  <Method Object java.util.Map$Entry.getValue()>
		//   33   81:checkcast       #90  <Class String>
		//   34   84:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
		//   35   87:ldc1            #82  <String "\n">
		//   36   89:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
		//   37   92:aload           5
		//   38   94:invokevirtual   #93  <Method String CompareTool$ObjectPath.toString()>
		//   39   97:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
		//   40  100:ldc1            #82  <String "\n">
		//   41  102:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
		//   42  105:pop             
				flag = false;
		//   43  106:iconst_0        
		//   44  107:istore_1        
			}

		//*  45  108:goto            25
			return stringbuilder.toString();
		//   46  111:aload_2         
		//   47  112:invokevirtual   #94  <Method String StringBuilder.toString()>
		//   48  115:areturn         
		}

		protected boolean isMessageLimitReached()
		{
			return differences.size() >= messageLimit;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field Map differences>
		//    2    4:invokeinterface #37  <Method int Map.size()>
		//    3    9:aload_0         
		//    4   10:getfield        #28  <Field int messageLimit>
		//    5   13:icmplt          18
		//    6   16:iconst_1        
		//    7   17:ireturn         
		//    8   18:iconst_0        
		//    9   19:ireturn         
		}

		public boolean isOk()
		{
			return differences.size() == 0;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field Map differences>
		//    2    4:invokeinterface #37  <Method int Map.size()>
		//    3    9:ifne            14
		//    4   12:iconst_1        
		//    5   13:ireturn         
		//    6   14:iconst_0        
		//    7   15:ireturn         
		}

		public void writeReportToXml(OutputStream outputstream)
			throws ParserConfigurationException, TransformerException
		{
			Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
		//    0    0:invokestatic    #108 <Method DocumentBuilderFactory DocumentBuilderFactory.newInstance()>
		//    1    3:invokevirtual   #112 <Method DocumentBuilder DocumentBuilderFactory.newDocumentBuilder()>
		//    2    6:invokevirtual   #118 <Method Document DocumentBuilder.newDocument()>
		//    3    9:astore_2        
			Object obj = ((Object) (document.createElement("report")));
		//    4   10:aload_2         
		//    5   11:ldc1            #120 <String "report">
		//    6   13:invokeinterface #126 <Method Element Document.createElement(String)>
		//    7   18:astore_3        
			Element element = document.createElement("errors");
		//    8   19:aload_2         
		//    9   20:ldc1            #128 <String "errors">
		//   10   22:invokeinterface #126 <Method Element Document.createElement(String)>
		//   11   27:astore          4
			element.setAttribute("count", String.valueOf(differences.size()));
		//   12   29:aload           4
		//   13   31:ldc1            #130 <String "count">
		//   14   33:aload_0         
		//   15   34:getfield        #26  <Field Map differences>
		//   16   37:invokeinterface #37  <Method int Map.size()>
		//   17   42:invokestatic    #134 <Method String String.valueOf(int)>
		//   18   45:invokeinterface #140 <Method void Element.setAttribute(String, String)>
			((Element) (obj)).appendChild(((Node) (element)));
		//   19   50:aload_3         
		//   20   51:aload           4
		//   21   53:invokeinterface #144 <Method Node Element.appendChild(Node)>
		//   22   58:pop             
			Element element1;
			for(Iterator iterator = differences.entrySet().iterator(); iterator.hasNext(); element.appendChild(((Node) (element1))))
		//*  23   59:aload_0         
		//*  24   60:getfield        #26  <Field Map differences>
		//*  25   63:invokeinterface #57  <Method Set Map.entrySet()>
		//*  26   68:invokeinterface #63  <Method Iterator Set.iterator()>
		//*  27   73:astore          5
		//*  28   75:aload           5
		//*  29   77:invokeinterface #69  <Method boolean Iterator.hasNext()>
		//*  30   82:ifeq            190
			{
				Object obj1 = ((Object) ((java.util.Map.Entry)iterator.next()));
		//   31   85:aload           5
		//   32   87:invokeinterface #72  <Method Object Iterator.next()>
		//   33   92:checkcast       #74  <Class java.util.Map$Entry>
		//   34   95:astore          8
				element1 = document.createElement("error");
		//   35   97:aload_2         
		//   36   98:ldc1            #146 <String "error">
		//   37  100:invokeinterface #126 <Method Element Document.createElement(String)>
		//   38  105:astore          6
				Element element2 = document.createElement("message");
		//   39  107:aload_2         
		//   40  108:ldc1            #148 <String "message">
		//   41  110:invokeinterface #126 <Method Element Document.createElement(String)>
		//   42  115:astore          7
				((Node) (element2)).appendChild(((Node) (document.createTextNode((String)((java.util.Map.Entry) (obj1)).getValue()))));
		//   43  117:aload           7
		//   44  119:aload_2         
		//   45  120:aload           8
		//   46  122:invokeinterface #88  <Method Object java.util.Map$Entry.getValue()>
		//   47  127:checkcast       #90  <Class String>
		//   48  130:invokeinterface #152 <Method org.w3c.dom.Text Document.createTextNode(String)>
		//   49  135:invokeinterface #155 <Method Node Node.appendChild(Node)>
		//   50  140:pop             
				obj1 = ((Object) (((ObjectPath)((java.util.Map.Entry) (obj1)).getKey()).toXmlNode(document)));
		//   51  141:aload           8
		//   52  143:invokeinterface #85  <Method Object java.util.Map$Entry.getKey()>
		//   53  148:checkcast       #39  <Class CompareTool$ObjectPath>
		//   54  151:aload_2         
		//   55  152:invokevirtual   #159 <Method Node CompareTool$ObjectPath.toXmlNode(Document)>
		//   56  155:astore          8
				((Node) (element1)).appendChild(((Node) (element2)));
		//   57  157:aload           6
		//   58  159:aload           7
		//   59  161:invokeinterface #155 <Method Node Node.appendChild(Node)>
		//   60  166:pop             
				((Node) (element1)).appendChild(((Node) (obj1)));
		//   61  167:aload           6
		//   62  169:aload           8
		//   63  171:invokeinterface #155 <Method Node Node.appendChild(Node)>
		//   64  176:pop             
			}

		//   65  177:aload           4
		//   66  179:aload           6
		//   67  181:invokeinterface #144 <Method Node Element.appendChild(Node)>
		//   68  186:pop             
		//*  69  187:goto            75
			document.appendChild(((Node) (obj)));
		//   70  190:aload_2         
		//   71  191:aload_3         
		//   72  192:invokeinterface #160 <Method Node Document.appendChild(Node)>
		//   73  197:pop             
			obj = ((Object) (TransformerFactory.newInstance().newTransformer()));
		//   74  198:invokestatic    #165 <Method TransformerFactory TransformerFactory.newInstance()>
		//   75  201:invokevirtual   #169 <Method Transformer TransformerFactory.newTransformer()>
		//   76  204:astore_3        
			((Transformer) (obj)).setOutputProperty("indent", "yes");
		//   77  205:aload_3         
		//   78  206:ldc1            #171 <String "indent">
		//   79  208:ldc1            #173 <String "yes">
		//   80  210:invokevirtual   #178 <Method void Transformer.setOutputProperty(String, String)>
			((Transformer) (obj)).transform(((javax.xml.transform.Source) (new DOMSource(((Node) (document))))), ((javax.xml.transform.Result) (new StreamResult(outputstream))));
		//   81  213:aload_3         
		//   82  214:new             #180 <Class DOMSource>
		//   83  217:dup             
		//   84  218:aload_2         
		//   85  219:invokespecial   #183 <Method void DOMSource(Node)>
		//   86  222:new             #185 <Class StreamResult>
		//   87  225:dup             
		//   88  226:aload_1         
		//   89  227:invokespecial   #187 <Method void StreamResult(OutputStream)>
		//   90  230:invokevirtual   #191 <Method void Transformer.transform(javax.xml.transform.Source, javax.xml.transform.Result)>
		//   91  233:return          
		}

		protected Map differences;
		protected int messageLimit;
		final CompareTool this$0;

		public CompareResult(int i)
		{
			this$0 = CompareTool.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field CompareTool this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
			differences = ((Map) (new LinkedHashMap()));
		//    5    9:aload_0         
		//    6   10:new             #23  <Class LinkedHashMap>
		//    7   13:dup             
		//    8   14:invokespecial   #24  <Method void LinkedHashMap()>
		//    9   17:putfield        #26  <Field Map differences>
			messageLimit = 1;
		//   10   20:aload_0         
		//   11   21:iconst_1        
		//   12   22:putfield        #28  <Field int messageLimit>
			messageLimit = i;
		//   13   25:aload_0         
		//   14   26:iload_2         
		//   15   27:putfield        #28  <Field int messageLimit>
		//   16   30:return          
		}
	}

	class ImageNameComparator
		implements Comparator
	{

		public int compare(File file, File file1)
		{
			return file.getAbsolutePath().compareTo(file1.getAbsolutePath());
		//    0    0:aload_1         
		//    1    1:invokevirtual   #28  <Method String File.getAbsolutePath()>
		//    2    4:aload_2         
		//    3    5:invokevirtual   #28  <Method String File.getAbsolutePath()>
		//    4    8:invokevirtual   #34  <Method int String.compareTo(String)>
		//    5   11:ireturn         
		}

		public volatile int compare(Object obj, Object obj1)
		{
			return compare((File)obj, (File)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #24  <Class File>
		//    3    5:aload_2         
		//    4    6:checkcast       #24  <Class File>
		//    5    9:invokevirtual   #37  <Method int compare(File, File)>
		//    6   12:ireturn         
		}

		final CompareTool this$0;

		ImageNameComparator()
		{
			this$0 = CompareTool.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field CompareTool this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void Object()>
		//    5    9:return          
		}
	}

	private class ObjectPath
	{

		protected Object clone()
		{
			return ((Object) (new ObjectPath(baseCmpObject, baseOutObject, (Stack)path.clone())));
		//    0    0:new             #2   <Class CompareTool$ObjectPath>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #36  <Field CompareTool this$0>
		//    4    8:aload_0         
		//    5    9:getfield        #50  <Field RefKey baseCmpObject>
		//    6   12:aload_0         
		//    7   13:getfield        #52  <Field RefKey baseOutObject>
		//    8   16:aload_0         
		//    9   17:getfield        #44  <Field Stack path>
		//   10   20:invokevirtual   #59  <Method Object Stack.clone()>
		//   11   23:checkcast       #41  <Class Stack>
		//   12   26:invokespecial   #61  <Method void CompareTool$ObjectPath(CompareTool, RefKey, RefKey, Stack)>
		//   13   29:areturn         
		}

		public boolean equals(Object obj)
		{
			return (obj instanceof ObjectPath) && baseCmpObject.equals(((Object) (((ObjectPath)obj).baseCmpObject))) && baseOutObject.equals(((Object) (((ObjectPath)obj).baseOutObject))) && path.equals(((Object) (((ObjectPath)obj).path)));
		//    0    0:aload_1         
		//    1    1:instanceof      #2   <Class CompareTool$ObjectPath>
		//    2    4:ifeq            60
		//    3    7:aload_0         
		//    4    8:getfield        #50  <Field RefKey baseCmpObject>
		//    5   11:aload_1         
		//    6   12:checkcast       #2   <Class CompareTool$ObjectPath>
		//    7   15:getfield        #50  <Field RefKey baseCmpObject>
		//    8   18:invokevirtual   #67  <Method boolean RefKey.equals(Object)>
		//    9   21:ifeq            60
		//   10   24:aload_0         
		//   11   25:getfield        #52  <Field RefKey baseOutObject>
		//   12   28:aload_1         
		//   13   29:checkcast       #2   <Class CompareTool$ObjectPath>
		//   14   32:getfield        #52  <Field RefKey baseOutObject>
		//   15   35:invokevirtual   #67  <Method boolean RefKey.equals(Object)>
		//   16   38:ifeq            60
		//   17   41:aload_0         
		//   18   42:getfield        #44  <Field Stack path>
		//   19   45:aload_1         
		//   20   46:checkcast       #2   <Class CompareTool$ObjectPath>
		//   21   49:getfield        #44  <Field Stack path>
		//   22   52:invokevirtual   #68  <Method boolean Stack.equals(Object)>
		//   23   55:ifeq            60
		//   24   58:iconst_1        
		//   25   59:ireturn         
		//   26   60:iconst_0        
		//   27   61:ireturn         
		}

		public int hashCode()
		{
			int i;
			int j;
			if(baseCmpObject != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #50  <Field RefKey baseCmpObject>
		//*   2    4:ifnull          75
				i = baseCmpObject.hashCode();
		//    3    7:aload_0         
		//    4    8:getfield        #50  <Field RefKey baseCmpObject>
		//    5   11:invokevirtual   #72  <Method int RefKey.hashCode()>
		//    6   14:istore_1        
			else
		//*   7   15:aload_0         
		//*   8   16:getfield        #52  <Field RefKey baseOutObject>
		//*   9   19:ifnull          80
		//*  10   22:aload_0         
		//*  11   23:getfield        #52  <Field RefKey baseOutObject>
		//*  12   26:invokevirtual   #72  <Method int RefKey.hashCode()>
		//*  13   29:istore_2        
		//*  14   30:iload_1         
		//*  15   31:bipush          31
		//*  16   33:imul            
		//*  17   34:iload_2         
		//*  18   35:iadd            
		//*  19   36:istore_1        
		//*  20   37:aload_0         
		//*  21   38:getfield        #44  <Field Stack path>
		//*  22   41:invokevirtual   #76  <Method Iterator Stack.iterator()>
		//*  23   44:astore_3        
		//*  24   45:aload_3         
		//*  25   46:invokeinterface #82  <Method boolean Iterator.hasNext()>
		//*  26   51:ifeq            85
		//*  27   54:iload_1         
		//*  28   55:bipush          31
		//*  29   57:imul            
		//*  30   58:aload_3         
		//*  31   59:invokeinterface #85  <Method Object Iterator.next()>
		//*  32   64:checkcast       #21  <Class CompareTool$ObjectPath$PathItem>
		//*  33   67:invokevirtual   #86  <Method int Object.hashCode()>
		//*  34   70:iadd            
		//*  35   71:istore_1        
		//*  36   72:goto            45
				i = 1;
		//   37   75:iconst_1        
		//   38   76:istore_1        
			if(baseOutObject != null)
				j = baseOutObject.hashCode();
			else
		//*  39   77:goto            15
				j = 1;
		//   40   80:iconst_1        
		//   41   81:istore_2        
			i = i * 31 + j;
			for(Iterator iterator = path.iterator(); iterator.hasNext();)
				i = i * 31 + ((Object) ((PathItem)iterator.next())).hashCode();

		//*  42   82:goto            30
			return i;
		//   43   85:iload_1         
		//   44   86:ireturn         
		}

		public boolean isComparing(RefKey refkey, RefKey refkey1)
		{
			return indirects.contains(((Object) (new Pair(((Object) (refkey)), ((Object) (refkey1))))));
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field Stack indirects>
		//    2    4:new             #18  <Class CompareTool$ObjectPath$Pair>
		//    3    7:dup             
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:invokespecial   #91  <Method void CompareTool$ObjectPath$Pair(CompareTool$ObjectPath, Object, Object)>
		//    8   14:invokevirtual   #94  <Method boolean Stack.contains(Object)>
		//    9   17:ireturn         
		}

		public void pop()
		{
			path.pop();
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field Stack path>
		//    2    4:invokevirtual   #97  <Method Object Stack.pop()>
		//    3    7:pop             
		//    4    8:return          
		}

		public void pushArrayItemToPath(int i)
		{
			path.add(((Object) (new ArrayPathItem(i))));
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field Stack path>
		//    2    4:new             #9   <Class CompareTool$ObjectPath$ArrayPathItem>
		//    3    7:dup             
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:invokespecial   #102 <Method void CompareTool$ObjectPath$ArrayPathItem(CompareTool$ObjectPath, int)>
		//    7   13:invokevirtual   #105 <Method boolean Stack.add(Object)>
		//    8   16:pop             
		//    9   17:return          
		}

		public void pushDictItemToPath(String s)
		{
			path.add(((Object) (new DictPathItem(s))));
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field Stack path>
		//    2    4:new             #12  <Class CompareTool$ObjectPath$DictPathItem>
		//    3    7:dup             
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:invokespecial   #110 <Method void CompareTool$ObjectPath$DictPathItem(CompareTool$ObjectPath, String)>
		//    7   13:invokevirtual   #105 <Method boolean Stack.add(Object)>
		//    8   16:pop             
		//    9   17:return          
		}

		public void pushOffsetToPath(int i)
		{
			path.add(((Object) (new OffsetPathItem(i))));
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field Stack path>
		//    2    4:new             #15  <Class CompareTool$ObjectPath$OffsetPathItem>
		//    3    7:dup             
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:invokespecial   #112 <Method void CompareTool$ObjectPath$OffsetPathItem(CompareTool$ObjectPath, int)>
		//    7   13:invokevirtual   #105 <Method boolean Stack.add(Object)>
		//    8   16:pop             
		//    9   17:return          
		}

		public ObjectPath resetDirectPath(RefKey refkey, RefKey refkey1)
		{
			ObjectPath objectpath = new ObjectPath(refkey, refkey1);
		//    0    0:new             #2   <Class CompareTool$ObjectPath>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #36  <Field CompareTool this$0>
		//    4    8:aload_1         
		//    5    9:aload_2         
		//    6   10:invokespecial   #116 <Method void CompareTool$ObjectPath(CompareTool, RefKey, RefKey)>
		//    7   13:astore_3        
			objectpath.indirects = (Stack)indirects.clone();
		//    8   14:aload_3         
		//    9   15:aload_0         
		//   10   16:getfield        #46  <Field Stack indirects>
		//   11   19:invokevirtual   #59  <Method Object Stack.clone()>
		//   12   22:checkcast       #41  <Class Stack>
		//   13   25:putfield        #46  <Field Stack indirects>
			objectpath.indirects.add(((Object) (new Pair(((Object) (refkey)), ((Object) (refkey1))))));
		//   14   28:aload_3         
		//   15   29:getfield        #46  <Field Stack indirects>
		//   16   32:new             #18  <Class CompareTool$ObjectPath$Pair>
		//   17   35:dup             
		//   18   36:aload_0         
		//   19   37:aload_1         
		//   20   38:aload_2         
		//   21   39:invokespecial   #91  <Method void CompareTool$ObjectPath$Pair(CompareTool$ObjectPath, Object, Object)>
		//   22   42:invokevirtual   #105 <Method boolean Stack.add(Object)>
		//   23   45:pop             
			return objectpath;
		//   24   46:aload_3         
		//   25   47:areturn         
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #120 <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #121 <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append(String.format("Base cmp object: %s obj. Base out object: %s obj", new Object[] {
				baseCmpObject, baseOutObject
			}));
		//    4    8:aload_1         
		//    5    9:ldc1            #123 <String "Base cmp object: %s obj. Base out object: %s obj">
		//    6   11:iconst_2        
		//    7   12:anewarray       Object[]
		//    8   15:dup             
		//    9   16:iconst_0        
		//   10   17:aload_0         
		//   11   18:getfield        #50  <Field RefKey baseCmpObject>
		//   12   21:aastore         
		//   13   22:dup             
		//   14   23:iconst_1        
		//   15   24:aload_0         
		//   16   25:getfield        #52  <Field RefKey baseOutObject>
		//   17   28:aastore         
		//   18   29:invokestatic    #129 <Method String String.format(String, Object[])>
		//   19   32:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
		//   20   35:pop             
			PathItem pathitem;
			for(Iterator iterator = path.iterator(); iterator.hasNext(); stringbuilder.append(((Object) (pathitem)).toString()))
		//*  21   36:aload_0         
		//*  22   37:getfield        #44  <Field Stack path>
		//*  23   40:invokevirtual   #76  <Method Iterator Stack.iterator()>
		//*  24   43:astore_2        
		//*  25   44:aload_2         
		//*  26   45:invokeinterface #82  <Method boolean Iterator.hasNext()>
		//*  27   50:ifeq            82
			{
				pathitem = (PathItem)iterator.next();
		//   28   53:aload_2         
		//   29   54:invokeinterface #85  <Method Object Iterator.next()>
		//   30   59:checkcast       #21  <Class CompareTool$ObjectPath$PathItem>
		//   31   62:astore_3        
				stringbuilder.append("\n");
		//   32   63:aload_1         
		//   33   64:ldc1            #135 <String "\n">
		//   34   66:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
		//   35   69:pop             
			}

		//   36   70:aload_1         
		//   37   71:aload_3         
		//   38   72:invokevirtual   #137 <Method String Object.toString()>
		//   39   75:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
		//   40   78:pop             
		//*  41   79:goto            44
			return stringbuilder.toString();
		//   42   82:aload_1         
		//   43   83:invokevirtual   #138 <Method String StringBuilder.toString()>
		//   44   86:areturn         
		}

		public Node toXmlNode(Document document)
		{
			Element element = document.createElement("path");
		//    0    0:aload_1         
		//    1    1:ldc1            #141 <String "path">
		//    2    3:invokeinterface #147 <Method Element Document.createElement(String)>
		//    3    8:astore_2        
			Element element1 = document.createElement("base");
		//    4    9:aload_1         
		//    5   10:ldc1            #149 <String "base">
		//    6   12:invokeinterface #147 <Method Element Document.createElement(String)>
		//    7   17:astore_3        
			element1.setAttribute("cmp", (new StringBuilder()).append(baseCmpObject.toString()).append(" obj").toString());
		//    8   18:aload_3         
		//    9   19:ldc1            #151 <String "cmp">
		//   10   21:new             #120 <Class StringBuilder>
		//   11   24:dup             
		//   12   25:invokespecial   #121 <Method void StringBuilder()>
		//   13   28:aload_0         
		//   14   29:getfield        #50  <Field RefKey baseCmpObject>
		//   15   32:invokevirtual   #152 <Method String RefKey.toString()>
		//   16   35:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
		//   17   38:ldc1            #154 <String " obj">
		//   18   40:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
		//   19   43:invokevirtual   #138 <Method String StringBuilder.toString()>
		//   20   46:invokeinterface #160 <Method void Element.setAttribute(String, String)>
			element1.setAttribute("out", (new StringBuilder()).append(baseOutObject.toString()).append(" obj").toString());
		//   21   51:aload_3         
		//   22   52:ldc1            #162 <String "out">
		//   23   54:new             #120 <Class StringBuilder>
		//   24   57:dup             
		//   25   58:invokespecial   #121 <Method void StringBuilder()>
		//   26   61:aload_0         
		//   27   62:getfield        #52  <Field RefKey baseOutObject>
		//   28   65:invokevirtual   #152 <Method String RefKey.toString()>
		//   29   68:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
		//   30   71:ldc1            #154 <String " obj">
		//   31   73:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
		//   32   76:invokevirtual   #138 <Method String StringBuilder.toString()>
		//   33   79:invokeinterface #160 <Method void Element.setAttribute(String, String)>
			element.appendChild(((Node) (element1)));
		//   34   84:aload_2         
		//   35   85:aload_3         
		//   36   86:invokeinterface #166 <Method Node Element.appendChild(Node)>
		//   37   91:pop             
			for(Iterator iterator = path.iterator(); iterator.hasNext(); element.appendChild(((PathItem)iterator.next()).toXmlNode(document)));
		//   38   92:aload_0         
		//   39   93:getfield        #44  <Field Stack path>
		//   40   96:invokevirtual   #76  <Method Iterator Stack.iterator()>
		//   41   99:astore_3        
		//   42  100:aload_3         
		//   43  101:invokeinterface #82  <Method boolean Iterator.hasNext()>
		//   44  106:ifeq            132
		//   45  109:aload_2         
		//   46  110:aload_3         
		//   47  111:invokeinterface #85  <Method Object Iterator.next()>
		//   48  116:checkcast       #21  <Class CompareTool$ObjectPath$PathItem>
		//   49  119:aload_1         
		//   50  120:invokevirtual   #168 <Method Node CompareTool$ObjectPath$PathItem.toXmlNode(Document)>
		//   51  123:invokeinterface #166 <Method Node Element.appendChild(Node)>
		//   52  128:pop             
		//*  53  129:goto            100
			return ((Node) (element));
		//   54  132:aload_2         
		//   55  133:areturn         
		}

		protected RefKey baseCmpObject;
		protected RefKey baseOutObject;
		protected Stack indirects;
		protected Stack path;
		final CompareTool this$0;

		public ObjectPath()
		{
			this$0 = CompareTool.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #36  <Field CompareTool this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #39  <Method void Object()>
			path = new Stack();
		//    5    9:aload_0         
		//    6   10:new             #41  <Class Stack>
		//    7   13:dup             
		//    8   14:invokespecial   #42  <Method void Stack()>
		//    9   17:putfield        #44  <Field Stack path>
			indirects = new Stack();
		//   10   20:aload_0         
		//   11   21:new             #41  <Class Stack>
		//   12   24:dup             
		//   13   25:invokespecial   #42  <Method void Stack()>
		//   14   28:putfield        #46  <Field Stack indirects>
		//   15   31:return          
		}

		protected ObjectPath(RefKey refkey, RefKey refkey1)
		{
			this$0 = CompareTool.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #36  <Field CompareTool this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #39  <Method void Object()>
			path = new Stack();
		//    5    9:aload_0         
		//    6   10:new             #41  <Class Stack>
		//    7   13:dup             
		//    8   14:invokespecial   #42  <Method void Stack()>
		//    9   17:putfield        #44  <Field Stack path>
			indirects = new Stack();
		//   10   20:aload_0         
		//   11   21:new             #41  <Class Stack>
		//   12   24:dup             
		//   13   25:invokespecial   #42  <Method void Stack()>
		//   14   28:putfield        #46  <Field Stack indirects>
			baseCmpObject = refkey;
		//   15   31:aload_0         
		//   16   32:aload_2         
		//   17   33:putfield        #50  <Field RefKey baseCmpObject>
			baseOutObject = refkey1;
		//   18   36:aload_0         
		//   19   37:aload_3         
		//   20   38:putfield        #52  <Field RefKey baseOutObject>
		//   21   41:return          
		}

		private ObjectPath(RefKey refkey, RefKey refkey1, Stack stack)
		{
			this$0 = CompareTool.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #36  <Field CompareTool this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #39  <Method void Object()>
			path = new Stack();
		//    5    9:aload_0         
		//    6   10:new             #41  <Class Stack>
		//    7   13:dup             
		//    8   14:invokespecial   #42  <Method void Stack()>
		//    9   17:putfield        #44  <Field Stack path>
			indirects = new Stack();
		//   10   20:aload_0         
		//   11   21:new             #41  <Class Stack>
		//   12   24:dup             
		//   13   25:invokespecial   #42  <Method void Stack()>
		//   14   28:putfield        #46  <Field Stack indirects>
			baseCmpObject = refkey;
		//   15   31:aload_0         
		//   16   32:aload_2         
		//   17   33:putfield        #50  <Field RefKey baseCmpObject>
			baseOutObject = refkey1;
		//   18   36:aload_0         
		//   19   37:aload_3         
		//   20   38:putfield        #52  <Field RefKey baseOutObject>
			path = stack;
		//   21   41:aload_0         
		//   22   42:aload           4
		//   23   44:putfield        #44  <Field Stack path>
		//   24   47:return          
		}
	}

	private class ObjectPath.ArrayPathItem extends ObjectPath.PathItem
	{

		public boolean equals(Object obj)
		{
			return (obj instanceof ObjectPath.ArrayPathItem) && index == ((ObjectPath.ArrayPathItem)obj).index;
		//    0    0:aload_1         
		//    1    1:instanceof      #2   <Class CompareTool$ObjectPath$ArrayPathItem>
		//    2    4:ifeq            23
		//    3    7:aload_0         
		//    4    8:getfield        #23  <Field int index>
		//    5   11:aload_1         
		//    6   12:checkcast       #2   <Class CompareTool$ObjectPath$ArrayPathItem>
		//    7   15:getfield        #23  <Field int index>
		//    8   18:icmpne          23
		//    9   21:iconst_1        
		//   10   22:ireturn         
		//   11   23:iconst_0        
		//   12   24:ireturn         
		}

		public int hashCode()
		{
			return index;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field int index>
		//    2    4:ireturn         
		}

		public String toString()
		{
			return (new StringBuilder()).append("Array index: ").append(String.valueOf(index)).toString();
		//    0    0:new             #32  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #35  <Method void StringBuilder()>
		//    3    7:ldc1            #37  <String "Array index: ">
		//    4    9:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
		//    5   12:aload_0         
		//    6   13:getfield        #23  <Field int index>
		//    7   16:invokestatic    #47  <Method String String.valueOf(int)>
		//    8   19:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
		//    9   22:invokevirtual   #49  <Method String StringBuilder.toString()>
		//   10   25:areturn         
		}

		protected Node toXmlNode(Document document)
		{
			Element element = document.createElement("arrayIndex");
		//    0    0:aload_1         
		//    1    1:ldc1            #53  <String "arrayIndex">
		//    2    3:invokeinterface #59  <Method Element Document.createElement(String)>
		//    3    8:astore_2        
			((Node) (element)).appendChild(((Node) (document.createTextNode(String.valueOf(index)))));
		//    4    9:aload_2         
		//    5   10:aload_1         
		//    6   11:aload_0         
		//    7   12:getfield        #23  <Field int index>
		//    8   15:invokestatic    #47  <Method String String.valueOf(int)>
		//    9   18:invokeinterface #63  <Method org.w3c.dom.Text Document.createTextNode(String)>
		//   10   23:invokeinterface #69  <Method Node Node.appendChild(Node)>
		//   11   28:pop             
			return ((Node) (element));
		//   12   29:aload_2         
		//   13   30:areturn         
		}

		int index;
		final ObjectPath this$1;

		public ObjectPath.ArrayPathItem(int i)
		{
			this$1 = ObjectPath.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field CompareTool$ObjectPath this$1>
			super();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aconst_null     
		//    6    8:invokespecial   #21  <Method void CompareTool$ObjectPath$PathItem(CompareTool$ObjectPath, CompareTool$1)>
			index = i;
		//    7   11:aload_0         
		//    8   12:iload_2         
		//    9   13:putfield        #23  <Field int index>
		//   10   16:return          
		}
	}

	private class ObjectPath.DictPathItem extends ObjectPath.PathItem
	{

		public boolean equals(Object obj)
		{
			return (obj instanceof ObjectPath.DictPathItem) && key.equals(((Object) (((ObjectPath.DictPathItem)obj).key)));
		//    0    0:aload_1         
		//    1    1:instanceof      #2   <Class CompareTool$ObjectPath$DictPathItem>
		//    2    4:ifeq            26
		//    3    7:aload_0         
		//    4    8:getfield        #23  <Field String key>
		//    5   11:aload_1         
		//    6   12:checkcast       #2   <Class CompareTool$ObjectPath$DictPathItem>
		//    7   15:getfield        #23  <Field String key>
		//    8   18:invokevirtual   #30  <Method boolean String.equals(Object)>
		//    9   21:ifeq            26
		//   10   24:iconst_1        
		//   11   25:ireturn         
		//   12   26:iconst_0        
		//   13   27:ireturn         
		}

		public int hashCode()
		{
			return key.hashCode();
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field String key>
		//    2    4:invokevirtual   #34  <Method int String.hashCode()>
		//    3    7:ireturn         
		}

		public String toString()
		{
			return (new StringBuilder()).append("Dict key: ").append(key).toString();
		//    0    0:new             #38  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #41  <Method void StringBuilder()>
		//    3    7:ldc1            #43  <String "Dict key: ">
		//    4    9:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//    5   12:aload_0         
		//    6   13:getfield        #23  <Field String key>
		//    7   16:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//    8   19:invokevirtual   #49  <Method String StringBuilder.toString()>
		//    9   22:areturn         
		}

		protected Node toXmlNode(Document document)
		{
			Element element = document.createElement("dictKey");
		//    0    0:aload_1         
		//    1    1:ldc1            #53  <String "dictKey">
		//    2    3:invokeinterface #59  <Method Element Document.createElement(String)>
		//    3    8:astore_2        
			((Node) (element)).appendChild(((Node) (document.createTextNode(key))));
		//    4    9:aload_2         
		//    5   10:aload_1         
		//    6   11:aload_0         
		//    7   12:getfield        #23  <Field String key>
		//    8   15:invokeinterface #63  <Method org.w3c.dom.Text Document.createTextNode(String)>
		//    9   20:invokeinterface #69  <Method Node Node.appendChild(Node)>
		//   10   25:pop             
			return ((Node) (element));
		//   11   26:aload_2         
		//   12   27:areturn         
		}

		String key;
		final ObjectPath this$1;

		public ObjectPath.DictPathItem(String s)
		{
			this$1 = ObjectPath.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field CompareTool$ObjectPath this$1>
			super();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aconst_null     
		//    6    8:invokespecial   #21  <Method void CompareTool$ObjectPath$PathItem(CompareTool$ObjectPath, CompareTool$1)>
			key = s;
		//    7   11:aload_0         
		//    8   12:aload_2         
		//    9   13:putfield        #23  <Field String key>
		//   10   16:return          
		}
	}

	private class ObjectPath.OffsetPathItem extends ObjectPath.PathItem
	{

		public boolean equals(Object obj)
		{
			return (obj instanceof ObjectPath.OffsetPathItem) && offset == ((ObjectPath.OffsetPathItem)obj).offset;
		//    0    0:aload_1         
		//    1    1:instanceof      #2   <Class CompareTool$ObjectPath$OffsetPathItem>
		//    2    4:ifeq            23
		//    3    7:aload_0         
		//    4    8:getfield        #23  <Field int offset>
		//    5   11:aload_1         
		//    6   12:checkcast       #2   <Class CompareTool$ObjectPath$OffsetPathItem>
		//    7   15:getfield        #23  <Field int offset>
		//    8   18:icmpne          23
		//    9   21:iconst_1        
		//   10   22:ireturn         
		//   11   23:iconst_0        
		//   12   24:ireturn         
		}

		public int hashCode()
		{
			return offset;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field int offset>
		//    2    4:ireturn         
		}

		public String toString()
		{
			return (new StringBuilder()).append("Offset: ").append(String.valueOf(offset)).toString();
		//    0    0:new             #32  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #35  <Method void StringBuilder()>
		//    3    7:ldc1            #37  <String "Offset: ">
		//    4    9:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
		//    5   12:aload_0         
		//    6   13:getfield        #23  <Field int offset>
		//    7   16:invokestatic    #47  <Method String String.valueOf(int)>
		//    8   19:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
		//    9   22:invokevirtual   #49  <Method String StringBuilder.toString()>
		//   10   25:areturn         
		}

		protected Node toXmlNode(Document document)
		{
			Element element = document.createElement("offset");
		//    0    0:aload_1         
		//    1    1:ldc1            #52  <String "offset">
		//    2    3:invokeinterface #58  <Method Element Document.createElement(String)>
		//    3    8:astore_2        
			((Node) (element)).appendChild(((Node) (document.createTextNode(String.valueOf(offset)))));
		//    4    9:aload_2         
		//    5   10:aload_1         
		//    6   11:aload_0         
		//    7   12:getfield        #23  <Field int offset>
		//    8   15:invokestatic    #47  <Method String String.valueOf(int)>
		//    9   18:invokeinterface #62  <Method org.w3c.dom.Text Document.createTextNode(String)>
		//   10   23:invokeinterface #68  <Method Node Node.appendChild(Node)>
		//   11   28:pop             
			return ((Node) (element));
		//   12   29:aload_2         
		//   13   30:areturn         
		}

		int offset;
		final ObjectPath this$1;

		public ObjectPath.OffsetPathItem(int i)
		{
			this$1 = ObjectPath.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field CompareTool$ObjectPath this$1>
			super();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aconst_null     
		//    6    8:invokespecial   #21  <Method void CompareTool$ObjectPath$PathItem(CompareTool$ObjectPath, CompareTool$1)>
			offset = i;
		//    7   11:aload_0         
		//    8   12:iload_2         
		//    9   13:putfield        #23  <Field int offset>
		//   10   16:return          
		}
	}

	private class ObjectPath.Pair
	{

		public boolean equals(Object obj)
		{
			return (obj instanceof ObjectPath.Pair) && first.equals(((ObjectPath.Pair)obj).first) && second.equals(((ObjectPath.Pair)obj).second);
		//    0    0:aload_1         
		//    1    1:instanceof      #2   <Class CompareTool$ObjectPath$Pair>
		//    2    4:ifeq            43
		//    3    7:aload_0         
		//    4    8:getfield        #26  <Field Object first>
		//    5   11:aload_1         
		//    6   12:checkcast       #2   <Class CompareTool$ObjectPath$Pair>
		//    7   15:getfield        #26  <Field Object first>
		//    8   18:invokevirtual   #35  <Method boolean Object.equals(Object)>
		//    9   21:ifeq            43
		//   10   24:aload_0         
		//   11   25:getfield        #28  <Field Object second>
		//   12   28:aload_1         
		//   13   29:checkcast       #2   <Class CompareTool$ObjectPath$Pair>
		//   14   32:getfield        #28  <Field Object second>
		//   15   35:invokevirtual   #35  <Method boolean Object.equals(Object)>
		//   16   38:ifeq            43
		//   17   41:iconst_1        
		//   18   42:ireturn         
		//   19   43:iconst_0        
		//   20   44:ireturn         
		}

		public int hashCode()
		{
			return first.hashCode() * 31 + second.hashCode();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field Object first>
		//    2    4:invokevirtual   #39  <Method int Object.hashCode()>
		//    3    7:bipush          31
		//    4    9:imul            
		//    5   10:aload_0         
		//    6   11:getfield        #28  <Field Object second>
		//    7   14:invokevirtual   #39  <Method int Object.hashCode()>
		//    8   17:iadd            
		//    9   18:ireturn         
		}

		private Object first;
		private Object second;
		final ObjectPath this$1;

		public ObjectPath.Pair(Object obj, Object obj1)
		{
			this$1 = ObjectPath.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field CompareTool$ObjectPath this$1>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #24  <Method void Object()>
			first = obj;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #26  <Field Object first>
			second = obj1;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #28  <Field Object second>
		//   11   19:return          
		}
	}

	private abstract class ObjectPath.PathItem
	{

		protected abstract Node toXmlNode(Document document);

		final ObjectPath this$1;

		private ObjectPath.PathItem()
		{
			this$1 = ObjectPath.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field CompareTool$ObjectPath this$1>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void Object()>
		//    5    9:return          
		}

	}

	class PngFileFilter
		implements FileFilter
	{

		public boolean accept(File file)
		{
			file = ((File) (file.getAbsolutePath()));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #27  <Method String File.getAbsolutePath()>
		//    2    4:astore_1        
			boolean flag = ((String) (file)).endsWith(".png");
		//    3    5:aload_1         
		//    4    6:ldc1            #29  <String ".png">
		//    5    8:invokevirtual   #35  <Method boolean String.endsWith(String)>
		//    6   11:istore_2        
			boolean flag1 = ((String) (file)).contains("cmp_");
		//    7   12:aload_1         
		//    8   13:ldc1            #37  <String "cmp_">
		//    9   15:invokevirtual   #41  <Method boolean String.contains(CharSequence)>
		//   10   18:istore_3        
			return flag && !flag1 && ((String) (file)).contains(((CharSequence) (outPdfName)));
		//   11   19:iload_2         
		//   12   20:ifeq            43
		//   13   23:iload_3         
		//   14   24:ifne            43
		//   15   27:aload_1         
		//   16   28:aload_0         
		//   17   29:getfield        #15  <Field CompareTool this$0>
		//   18   32:invokestatic    #45  <Method String CompareTool.access$100(CompareTool)>
		//   19   35:invokevirtual   #41  <Method boolean String.contains(CharSequence)>
		//   20   38:ifeq            43
		//   21   41:iconst_1        
		//   22   42:ireturn         
		//   23   43:iconst_0        
		//   24   44:ireturn         
		}

		final CompareTool this$0;

		PngFileFilter()
		{
			this$0 = CompareTool.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field CompareTool this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}


	public CompareTool()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #90  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:ldc1            #92  <String " -dNOPAUSE -dBATCH -sDEVICE=png16m -r150 -sOutputFile=<outputfile> <inputfile>">
	//    4    7:putfield        #94  <Field String gsParams>
	//    5   10:aload_0         
	//    6   11:ldc1            #96  <String " \"<image1>\" \"<image2>\" \"<difference>\"">
	//    7   13:putfield        #98  <Field String compareParams>
		compareByContentErrorsLimit = 1;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #100 <Field int compareByContentErrorsLimit>
		generateCompareByContentXmlReport = false;
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:putfield        #102 <Field boolean generateCompareByContentXmlReport>
		xmlReportName = "report";
	//   14   26:aload_0         
	//   15   27:ldc1            #104 <String "report">
	//   16   29:putfield        #106 <Field String xmlReportName>
		floatComparisonError = 0.0D;
	//   17   32:aload_0         
	//   18   33:dconst_0        
	//   19   34:putfield        #108 <Field double floatComparisonError>
		absoluteError = true;
	//   20   37:aload_0         
	//   21   38:iconst_1        
	//   22   39:putfield        #110 <Field boolean absoluteError>
		gsExec = System.getProperty("gsExec");
	//   23   42:aload_0         
	//   24   43:ldc1            #111 <String "gsExec">
	//   25   45:invokestatic    #117 <Method String System.getProperty(String)>
	//   26   48:putfield        #119 <Field String gsExec>
		if(gsExec == null)
	//*  27   51:aload_0         
	//*  28   52:getfield        #119 <Field String gsExec>
	//*  29   55:ifnonnull       67
			gsExec = System.getenv("gsExec");
	//   30   58:aload_0         
	//   31   59:ldc1            #111 <String "gsExec">
	//   32   61:invokestatic    #122 <Method String System.getenv(String)>
	//   33   64:putfield        #119 <Field String gsExec>
		compareExec = System.getProperty("compareExec");
	//   34   67:aload_0         
	//   35   68:ldc1            #123 <String "compareExec">
	//   36   70:invokestatic    #117 <Method String System.getProperty(String)>
	//   37   73:putfield        #125 <Field String compareExec>
		if(compareExec == null)
	//*  38   76:aload_0         
	//*  39   77:getfield        #125 <Field String compareExec>
	//*  40   80:ifnonnull       92
			compareExec = System.getenv("compareExec");
	//   41   83:aload_0         
	//   42   84:ldc1            #123 <String "compareExec">
	//   43   86:invokestatic    #122 <Method String System.getenv(String)>
	//   44   89:putfield        #125 <Field String compareExec>
	//   45   92:return          
	}

	private void addPagesFromDict(PdfObject pdfobject, List list, List list1)
	{
		PdfDictionary pdfdictionary = (PdfDictionary)PdfReader.getPdfObject(pdfobject);
	//    0    0:aload_1         
	//    1    1:invokestatic    #141 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//    2    4:checkcast       #143 <Class PdfDictionary>
	//    3    7:astore          4
		if(pdfdictionary.isPages())
	//*   4    9:aload           4
	//*   5   11:invokevirtual   #147 <Method boolean PdfDictionary.isPages()>
	//*   6   14:ifeq            63
		{
			pdfobject = ((PdfObject) (pdfdictionary.getAsArray(PdfName.KIDS)));
	//    7   17:aload           4
	//    8   19:getstatic       #153 <Field PdfName PdfName.KIDS>
	//    9   22:invokevirtual   #157 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   10   25:astore_1        
			if(pdfobject != null)
	//*  11   26:aload_1         
	//*  12   27:ifnonnull       31
	//*  13   30:return          
			{
				pdfobject = ((PdfObject) (((PdfArray) (pdfobject)).iterator()));
	//   14   31:aload_1         
	//   15   32:invokevirtual   #163 <Method Iterator PdfArray.iterator()>
	//   16   35:astore_1        
				while(((Iterator) (pdfobject)).hasNext()) 
	//*  17   36:aload_1         
	//*  18   37:invokeinterface #168 <Method boolean Iterator.hasNext()>
	//*  19   42:ifeq            30
					addPagesFromDict((PdfObject)((Iterator) (pdfobject)).next(), list, list1);
	//   20   45:aload_0         
	//   21   46:aload_1         
	//   22   47:invokeinterface #172 <Method Object Iterator.next()>
	//   23   52:checkcast       #174 <Class PdfObject>
	//   24   55:aload_2         
	//   25   56:aload_3         
	//   26   57:invokespecial   #176 <Method void addPagesFromDict(PdfObject, List, List)>
			}
		} else
	//*  27   60:goto            36
		if(pdfdictionary.isPage())
	//*  28   63:aload           4
	//*  29   65:invokevirtual   #179 <Method boolean PdfDictionary.isPage()>
	//*  30   68:ifeq            30
		{
			list.add(((Object) (pdfdictionary)));
	//   31   71:aload_2         
	//   32   72:aload           4
	//   33   74:invokeinterface #185 <Method boolean List.add(Object)>
	//   34   79:pop             
			list1.add(((Object) (new RefKey(((PdfIndirectReference) ((PRIndirectReference)pdfobject))))));
	//   35   80:aload_3         
	//   36   81:new             #187 <Class RefKey>
	//   37   84:dup             
	//   38   85:aload_1         
	//   39   86:checkcast       #189 <Class PRIndirectReference>
	//   40   89:invokespecial   #192 <Method void RefKey(PdfIndirectReference)>
	//   41   92:invokeinterface #185 <Method boolean List.add(Object)>
	//   42   97:pop             
			return;
	//   43   98:return          
		}
	}

	private String compare(String s, String s1, Map map)
		throws IOException, InterruptedException, DocumentException
	{
		return compare(s, s1, map, ((List) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:invokespecial   #205 <Method String compare(String, String, Map, List)>
	//    6    8:areturn         
	}

	private String compare(String s, String s1, Map map, List list)
		throws IOException, InterruptedException, DocumentException
	{
		if(gsExec != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field String gsExec>
	//    2    4:ifnonnull       12
_L1:
		s = "Path to GhostScript is not specified. Please use -DgsExec=<path_to_ghostscript> (e.g. -DgsExec=\"C:/Program Files/gs/gs9.14/bin/gswin32c.exe\")";
	//    3    7:ldc1            #58  <String "Path to GhostScript is not specified. Please use -DgsExec=<path_to_ghostscript> (e.g. -DgsExec=\"C:/Program Files/gs/gs9.14/bin/gswin32c.exe\")">
	//    4    9:astore_1        
_L7:
		return s;
	//    5   10:aload_1         
	//    6   11:areturn         
_L2:
		boolean flag;
		int i1;
		int j1;
		String s2;
		File afile[];
		File afile1[];
		if(!(new File(gsExec)).exists())
	//*   7   12:new             #209 <Class File>
	//*   8   15:dup             
	//*   9   16:aload_0         
	//*  10   17:getfield        #119 <Field String gsExec>
	//*  11   20:invokespecial   #212 <Method void File(String)>
	//*  12   23:invokevirtual   #215 <Method boolean File.exists()>
	//*  13   26:ifne            62
			return (new StringBuilder()).append((new File(gsExec)).getAbsolutePath()).append(" does not exist").toString();
	//   14   29:new             #217 <Class StringBuilder>
	//   15   32:dup             
	//   16   33:invokespecial   #218 <Method void StringBuilder()>
	//   17   36:new             #209 <Class File>
	//   18   39:dup             
	//   19   40:aload_0         
	//   20   41:getfield        #119 <Field String gsExec>
	//   21   44:invokespecial   #212 <Method void File(String)>
	//   22   47:invokevirtual   #222 <Method String File.getAbsolutePath()>
	//   23   50:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//   24   53:ldc1            #228 <String " does not exist">
	//   25   55:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//   26   58:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   27   61:areturn         
		s2 = s;
	//   28   62:aload_1         
	//   29   63:astore          9
		if(!s.endsWith("/"))
	//*  30   65:aload_1         
	//*  31   66:ldc1            #233 <String "/">
	//*  32   68:invokevirtual   #239 <Method boolean String.endsWith(String)>
	//*  33   71:ifne            95
			s2 = (new StringBuilder()).append(s).append("/").toString();
	//   34   74:new             #217 <Class StringBuilder>
	//   35   77:dup             
	//   36   78:invokespecial   #218 <Method void StringBuilder()>
	//   37   81:aload_1         
	//   38   82:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//   39   85:ldc1            #233 <String "/">
	//   40   87:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//   41   90:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   42   93:astore          9
		s = ((String) (new File(s2)));
	//   43   95:new             #209 <Class File>
	//   44   98:dup             
	//   45   99:aload           9
	//   46  101:invokespecial   #212 <Method void File(String)>
	//   47  104:astore_1        
		Object obj;
		if(!((File) (s)).exists())
	//*  48  105:aload_1         
	//*  49  106:invokevirtual   #215 <Method boolean File.exists()>
	//*  50  109:ifne            436
		{
			((File) (s)).mkdirs();
	//   51  112:aload_1         
	//   52  113:invokevirtual   #242 <Method boolean File.mkdirs()>
	//   53  116:pop             
		} else
	//*  54  117:new             #209 <Class File>
	//*  55  120:dup             
	//*  56  121:new             #217 <Class StringBuilder>
	//*  57  124:dup             
	//*  58  125:invokespecial   #218 <Method void StringBuilder()>
	//*  59  128:aload           9
	//*  60  130:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//*  61  133:aload_2         
	//*  62  134:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//*  63  137:invokevirtual   #231 <Method String StringBuilder.toString()>
	//*  64  140:invokespecial   #212 <Method void File(String)>
	//*  65  143:astore          10
	//*  66  145:aload           10
	//*  67  147:invokevirtual   #215 <Method boolean File.exists()>
	//*  68  150:ifeq            159
	//*  69  153:aload           10
	//*  70  155:invokevirtual   #245 <Method boolean File.delete()>
	//*  71  158:pop             
	//*  72  159:aload_3         
	//*  73  160:ifnull          608
	//*  74  163:aload_3         
	//*  75  164:invokeinterface #250 <Method boolean Map.isEmpty()>
	//*  76  169:ifne            608
	//*  77  172:new             #137 <Class PdfReader>
	//*  78  175:dup             
	//*  79  176:aload_0         
	//*  80  177:getfield        #252 <Field String cmpPdf>
	//*  81  180:invokespecial   #253 <Method void PdfReader(String)>
	//*  82  183:astore          10
	//*  83  185:new             #137 <Class PdfReader>
	//*  84  188:dup             
	//*  85  189:aload_0         
	//*  86  190:getfield        #255 <Field String outPdf>
	//*  87  193:invokespecial   #253 <Method void PdfReader(String)>
	//*  88  196:astore          11
	//*  89  198:new             #257 <Class PdfStamper>
	//*  90  201:dup             
	//*  91  202:aload           11
	//*  92  204:new             #259 <Class FileOutputStream>
	//*  93  207:dup             
	//*  94  208:new             #217 <Class StringBuilder>
	//*  95  211:dup             
	//*  96  212:invokespecial   #218 <Method void StringBuilder()>
	//*  97  215:aload           9
	//*  98  217:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//*  99  220:ldc1            #55  <String "ignored_areas_">
	//* 100  222:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//* 101  225:aload_0         
	//* 102  226:getfield        #130 <Field String outPdfName>
	//* 103  229:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//* 104  232:invokevirtual   #231 <Method String StringBuilder.toString()>
	//* 105  235:invokespecial   #260 <Method void FileOutputStream(String)>
	//* 106  238:invokespecial   #263 <Method void PdfStamper(PdfReader, OutputStream)>
	//* 107  241:astore          12
	//* 108  243:new             #257 <Class PdfStamper>
	//* 109  246:dup             
	//* 110  247:aload           10
	//* 111  249:new             #259 <Class FileOutputStream>
	//* 112  252:dup             
	//* 113  253:new             #217 <Class StringBuilder>
	//* 114  256:dup             
	//* 115  257:invokespecial   #218 <Method void StringBuilder()>
	//* 116  260:aload           9
	//* 117  262:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//* 118  265:ldc1            #55  <String "ignored_areas_">
	//* 119  267:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//* 120  270:aload_0         
	//* 121  271:getfield        #133 <Field String cmpPdfName>
	//* 122  274:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//* 123  277:invokevirtual   #231 <Method String StringBuilder.toString()>
	//* 124  280:invokespecial   #260 <Method void FileOutputStream(String)>
	//* 125  283:invokespecial   #263 <Method void PdfStamper(PdfReader, OutputStream)>
	//* 126  286:astore          13
	//* 127  288:aload_3         
	//* 128  289:invokeinterface #267 <Method Set Map.entrySet()>
	//* 129  294:invokeinterface #270 <Method Iterator Set.iterator()>
	//* 130  299:astore_3        
	//* 131  300:aload_3         
	//* 132  301:invokeinterface #168 <Method boolean Iterator.hasNext()>
	//* 133  306:ifeq            530
	//* 134  309:aload_3         
	//* 135  310:invokeinterface #172 <Method Object Iterator.next()>
	//* 136  315:checkcast       #272 <Class java.util.Map$Entry>
	//* 137  318:astore          14
	//* 138  320:aload           14
	//* 139  322:invokeinterface #275 <Method Object java.util.Map$Entry.getKey()>
	//* 140  327:checkcast       #277 <Class Integer>
	//* 141  330:invokevirtual   #281 <Method int Integer.intValue()>
	//* 142  333:istore          5
	//* 143  335:aload           14
	//* 144  337:invokeinterface #284 <Method Object java.util.Map$Entry.getValue()>
	//* 145  342:checkcast       #181 <Class List>
	//* 146  345:astore          16
	//* 147  347:aload           16
	//* 148  349:ifnull          300
	//* 149  352:aload           16
	//* 150  354:invokeinterface #285 <Method boolean List.isEmpty()>
	//* 151  359:ifne            300
	//* 152  362:aload           12
	//* 153  364:iload           5
	//* 154  366:invokevirtual   #289 <Method PdfContentByte PdfStamper.getOverContent(int)>
	//* 155  369:astore          14
	//* 156  371:aload           13
	//* 157  373:iload           5
	//* 158  375:invokevirtual   #289 <Method PdfContentByte PdfStamper.getOverContent(int)>
	//* 159  378:astore          15
	//* 160  380:aload           16
	//* 161  382:invokeinterface #290 <Method Iterator List.iterator()>
	//* 162  387:astore          16
	//* 163  389:aload           16
	//* 164  391:invokeinterface #168 <Method boolean Iterator.hasNext()>
	//* 165  396:ifeq            300
	//* 166  399:aload           16
	//* 167  401:invokeinterface #172 <Method Object Iterator.next()>
	//* 168  406:checkcast       #292 <Class Rectangle>
	//* 169  409:astore          17
	//* 170  411:aload           17
	//* 171  413:getstatic       #298 <Field BaseColor BaseColor.BLACK>
	//* 172  416:invokevirtual   #302 <Method void Rectangle.setBackgroundColor(BaseColor)>
	//* 173  419:aload           14
	//* 174  421:aload           17
	//* 175  423:invokevirtual   #308 <Method void PdfContentByte.rectangle(Rectangle)>
	//* 176  426:aload           15
	//* 177  428:aload           17
	//* 178  430:invokevirtual   #308 <Method void PdfContentByte.rectangle(Rectangle)>
	//* 179  433:goto            389
		{
			obj = ((Object) (((File) (s)).listFiles(((FileFilter) (new PngFileFilter())))));
	//  180  436:aload_1         
	//  181  437:new             #41  <Class CompareTool$PngFileFilter>
	//  182  440:dup             
	//  183  441:aload_0         
	//  184  442:invokespecial   #311 <Method void CompareTool$PngFileFilter(CompareTool)>
	//  185  445:invokevirtual   #315 <Method File[] File.listFiles(FileFilter)>
	//  186  448:astore          10
			int l = obj.length;
	//  187  450:aload           10
	//  188  452:arraylength     
	//  189  453:istore          6
			for(int j = 0; j < l; j++)
	//* 190  455:iconst_0        
	//* 191  456:istore          5
	//* 192  458:iload           5
	//* 193  460:iload           6
	//* 194  462:icmpge          483
				((File) (obj[j])).delete();
	//  195  465:aload           10
	//  196  467:iload           5
	//  197  469:aaload          
	//  198  470:invokevirtual   #245 <Method boolean File.delete()>
	//  199  473:pop             

	//  200  474:iload           5
	//  201  476:iconst_1        
	//  202  477:iadd            
	//  203  478:istore          5
	//* 204  480:goto            458
			obj = ((Object) (((File) (s)).listFiles(((FileFilter) (new CmpPngFileFilter())))));
	//  205  483:aload_1         
	//  206  484:new             #11  <Class CompareTool$CmpPngFileFilter>
	//  207  487:dup             
	//  208  488:aload_0         
	//  209  489:invokespecial   #316 <Method void CompareTool$CmpPngFileFilter(CompareTool)>
	//  210  492:invokevirtual   #315 <Method File[] File.listFiles(FileFilter)>
	//  211  495:astore          10
			l = obj.length;
	//  212  497:aload           10
	//  213  499:arraylength     
	//  214  500:istore          6
			int k = 0;
	//  215  502:iconst_0        
	//  216  503:istore          5
			while(k < l) 
	//* 217  505:iload           5
	//* 218  507:iload           6
	//* 219  509:icmpge          117
			{
				((File) (obj[k])).delete();
	//  220  512:aload           10
	//  221  514:iload           5
	//  222  516:aaload          
	//  223  517:invokevirtual   #245 <Method boolean File.delete()>
	//  224  520:pop             
				k++;
	//  225  521:iload           5
	//  226  523:iconst_1        
	//  227  524:iadd            
	//  228  525:istore          5
			}
		}
		obj = ((Object) (new File((new StringBuilder()).append(s2).append(s1).toString())));
		if(((File) (obj)).exists())
			((File) (obj)).delete();
		if(map != null && !map.isEmpty())
		{
			obj = ((Object) (new PdfReader(cmpPdf)));
			PdfReader pdfreader = new PdfReader(outPdf);
			PdfStamper pdfstamper = new PdfStamper(pdfreader, ((OutputStream) (new FileOutputStream((new StringBuilder()).append(s2).append("ignored_areas_").append(outPdfName).toString()))));
			PdfStamper pdfstamper1 = new PdfStamper(((PdfReader) (obj)), ((OutputStream) (new FileOutputStream((new StringBuilder()).append(s2).append("ignored_areas_").append(cmpPdfName).toString()))));
			map = ((Map) (map.entrySet().iterator()));
			do
			{
				if(!((Iterator) (map)).hasNext())
					break;
				java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (map)).next();
				int i = ((Integer)entry.getKey()).intValue();
				Object obj3 = ((Object) ((List)entry.getValue()));
				if(obj3 != null && !((List) (obj3)).isEmpty())
				{
					PdfContentByte pdfcontentbyte = pdfstamper.getOverContent(i);
					PdfContentByte pdfcontentbyte1 = pdfstamper1.getOverContent(i);
					obj3 = ((Object) (((List) (obj3)).iterator()));
					while(((Iterator) (obj3)).hasNext()) 
					{
						Rectangle rectangle = (Rectangle)((Iterator) (obj3)).next();
						rectangle.setBackgroundColor(BaseColor.BLACK);
						pdfcontentbyte.rectangle(rectangle);
						pdfcontentbyte1.rectangle(rectangle);
					}
				}
			} while(true);
	//* 229  527:goto            505
			pdfstamper.close();
	//  230  530:aload           12
	//  231  532:invokevirtual   #319 <Method void PdfStamper.close()>
			pdfstamper1.close();
	//  232  535:aload           13
	//  233  537:invokevirtual   #319 <Method void PdfStamper.close()>
			pdfreader.close();
	//  234  540:aload           11
	//  235  542:invokevirtual   #320 <Method void PdfReader.close()>
			((PdfReader) (obj)).close();
	//  236  545:aload           10
	//  237  547:invokevirtual   #320 <Method void PdfReader.close()>
			init((new StringBuilder()).append(s2).append("ignored_areas_").append(outPdfName).toString(), (new StringBuilder()).append(s2).append("ignored_areas_").append(cmpPdfName).toString());
	//  238  550:aload_0         
	//  239  551:new             #217 <Class StringBuilder>
	//  240  554:dup             
	//  241  555:invokespecial   #218 <Method void StringBuilder()>
	//  242  558:aload           9
	//  243  560:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  244  563:ldc1            #55  <String "ignored_areas_">
	//  245  565:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  246  568:aload_0         
	//  247  569:getfield        #130 <Field String outPdfName>
	//  248  572:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  249  575:invokevirtual   #231 <Method String StringBuilder.toString()>
	//  250  578:new             #217 <Class StringBuilder>
	//  251  581:dup             
	//  252  582:invokespecial   #218 <Method void StringBuilder()>
	//  253  585:aload           9
	//  254  587:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  255  590:ldc1            #55  <String "ignored_areas_">
	//  256  592:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  257  595:aload_0         
	//  258  596:getfield        #133 <Field String cmpPdfName>
	//  259  599:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  260  602:invokevirtual   #231 <Method String StringBuilder.toString()>
	//  261  605:invokespecial   #324 <Method void init(String, String)>
		}
		if(!((File) (s)).exists())
			break MISSING_BLOCK_LABEL_1594;
	//  262  608:aload_1         
	//  263  609:invokevirtual   #215 <Method boolean File.exists()>
	//  264  612:ifeq            1594
		((Object)this).getClass();
	//  265  615:aload_0         
	//  266  616:invokevirtual   #328 <Method Class Object.getClass()>
	//  267  619:pop             
		map = ((Map) (" -dNOPAUSE -dBATCH -sDEVICE=png16m -r150 -sOutputFile=<outputfile> <inputfile>".replace("<outputfile>", ((CharSequence) ((new StringBuilder()).append(s2).append(cmpImage).toString()))).replace("<inputfile>", ((CharSequence) (cmpPdf)))));
	//  268  620:ldc1            #92  <String " -dNOPAUSE -dBATCH -sDEVICE=png16m -r150 -sOutputFile=<outputfile> <inputfile>">
	//  269  622:ldc2            #330 <String "<outputfile>">
	//  270  625:new             #217 <Class StringBuilder>
	//  271  628:dup             
	//  272  629:invokespecial   #218 <Method void StringBuilder()>
	//  273  632:aload           9
	//  274  634:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  275  637:aload_0         
	//  276  638:getfield        #332 <Field String cmpImage>
	//  277  641:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  278  644:invokevirtual   #231 <Method String StringBuilder.toString()>
	//  279  647:invokevirtual   #336 <Method String String.replace(CharSequence, CharSequence)>
	//  280  650:ldc2            #338 <String "<inputfile>">
	//  281  653:aload_0         
	//  282  654:getfield        #252 <Field String cmpPdf>
	//  283  657:invokevirtual   #336 <Method String String.replace(CharSequence, CharSequence)>
	//  284  660:astore_3        
		map = ((Map) (runProcess(gsExec, ((String) (map)))));
	//  285  661:aload_0         
	//  286  662:aload_0         
	//  287  663:getfield        #119 <Field String gsExec>
	//  288  666:aload_3         
	//  289  667:invokespecial   #342 <Method Process runProcess(String, String)>
	//  290  670:astore_3        
		Object obj1 = ((Object) (new BufferedReader(((java.io.Reader) (new InputStreamReader(((Process) (map)).getInputStream()))))));
	//  291  671:new             #344 <Class BufferedReader>
	//  292  674:dup             
	//  293  675:new             #346 <Class InputStreamReader>
	//  294  678:dup             
	//  295  679:aload_3         
	//  296  680:invokevirtual   #352 <Method InputStream Process.getInputStream()>
	//  297  683:invokespecial   #355 <Method void InputStreamReader(InputStream)>
	//  298  686:invokespecial   #358 <Method void BufferedReader(java.io.Reader)>
	//  299  689:astore          11
		obj = ((Object) (new BufferedReader(((java.io.Reader) (new InputStreamReader(((Process) (map)).getErrorStream()))))));
	//  300  691:new             #344 <Class BufferedReader>
	//  301  694:dup             
	//  302  695:new             #346 <Class InputStreamReader>
	//  303  698:dup             
	//  304  699:aload_3         
	//  305  700:invokevirtual   #361 <Method InputStream Process.getErrorStream()>
	//  306  703:invokespecial   #355 <Method void InputStreamReader(InputStream)>
	//  307  706:invokespecial   #358 <Method void BufferedReader(java.io.Reader)>
	//  308  709:astore          10
		do
		{
			String s4 = ((BufferedReader) (obj1)).readLine();
	//  309  711:aload           11
	//  310  713:invokevirtual   #364 <Method String BufferedReader.readLine()>
	//  311  716:astore          12
			if(s4 == null)
				break;
	//  312  718:aload           12
	//  313  720:ifnull          734
			System.out.println(s4);
	//  314  723:getstatic       #368 <Field PrintStream System.out>
	//  315  726:aload           12
	//  316  728:invokevirtual   #373 <Method void PrintStream.println(String)>
		} while(true);
	//  317  731:goto            711
		((BufferedReader) (obj1)).close();
	//  318  734:aload           11
	//  319  736:invokevirtual   #374 <Method void BufferedReader.close()>
		do
		{
			obj1 = ((Object) (((BufferedReader) (obj)).readLine()));
	//  320  739:aload           10
	//  321  741:invokevirtual   #364 <Method String BufferedReader.readLine()>
	//  322  744:astore          11
			if(obj1 == null)
				break;
	//  323  746:aload           11
	//  324  748:ifnull          762
			System.out.println(((String) (obj1)));
	//  325  751:getstatic       #368 <Field PrintStream System.out>
	//  326  754:aload           11
	//  327  756:invokevirtual   #373 <Method void PrintStream.println(String)>
		} while(true);
	//  328  759:goto            739
		((BufferedReader) (obj)).close();
	//  329  762:aload           10
	//  330  764:invokevirtual   #374 <Method void BufferedReader.close()>
		if(((Process) (map)).waitFor() != 0)
			break MISSING_BLOCK_LABEL_1581;
	//  331  767:aload_3         
	//  332  768:invokevirtual   #377 <Method int Process.waitFor()>
	//  333  771:ifne            1581
		((Object)this).getClass();
	//  334  774:aload_0         
	//  335  775:invokevirtual   #328 <Method Class Object.getClass()>
	//  336  778:pop             
		map = ((Map) (" -dNOPAUSE -dBATCH -sDEVICE=png16m -r150 -sOutputFile=<outputfile> <inputfile>".replace("<outputfile>", ((CharSequence) ((new StringBuilder()).append(s2).append(outImage).toString()))).replace("<inputfile>", ((CharSequence) (outPdf)))));
	//  337  779:ldc1            #92  <String " -dNOPAUSE -dBATCH -sDEVICE=png16m -r150 -sOutputFile=<outputfile> <inputfile>">
	//  338  781:ldc2            #330 <String "<outputfile>">
	//  339  784:new             #217 <Class StringBuilder>
	//  340  787:dup             
	//  341  788:invokespecial   #218 <Method void StringBuilder()>
	//  342  791:aload           9
	//  343  793:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  344  796:aload_0         
	//  345  797:getfield        #379 <Field String outImage>
	//  346  800:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  347  803:invokevirtual   #231 <Method String StringBuilder.toString()>
	//  348  806:invokevirtual   #336 <Method String String.replace(CharSequence, CharSequence)>
	//  349  809:ldc2            #338 <String "<inputfile>">
	//  350  812:aload_0         
	//  351  813:getfield        #255 <Field String outPdf>
	//  352  816:invokevirtual   #336 <Method String String.replace(CharSequence, CharSequence)>
	//  353  819:astore_3        
		map = ((Map) (runProcess(gsExec, ((String) (map)))));
	//  354  820:aload_0         
	//  355  821:aload_0         
	//  356  822:getfield        #119 <Field String gsExec>
	//  357  825:aload_3         
	//  358  826:invokespecial   #342 <Method Process runProcess(String, String)>
	//  359  829:astore_3        
		obj1 = ((Object) (new BufferedReader(((java.io.Reader) (new InputStreamReader(((Process) (map)).getInputStream()))))));
	//  360  830:new             #344 <Class BufferedReader>
	//  361  833:dup             
	//  362  834:new             #346 <Class InputStreamReader>
	//  363  837:dup             
	//  364  838:aload_3         
	//  365  839:invokevirtual   #352 <Method InputStream Process.getInputStream()>
	//  366  842:invokespecial   #355 <Method void InputStreamReader(InputStream)>
	//  367  845:invokespecial   #358 <Method void BufferedReader(java.io.Reader)>
	//  368  848:astore          11
		obj = ((Object) (new BufferedReader(((java.io.Reader) (new InputStreamReader(((Process) (map)).getErrorStream()))))));
	//  369  850:new             #344 <Class BufferedReader>
	//  370  853:dup             
	//  371  854:new             #346 <Class InputStreamReader>
	//  372  857:dup             
	//  373  858:aload_3         
	//  374  859:invokevirtual   #361 <Method InputStream Process.getErrorStream()>
	//  375  862:invokespecial   #355 <Method void InputStreamReader(InputStream)>
	//  376  865:invokespecial   #358 <Method void BufferedReader(java.io.Reader)>
	//  377  868:astore          10
		do
		{
			String s5 = ((BufferedReader) (obj1)).readLine();
	//  378  870:aload           11
	//  379  872:invokevirtual   #364 <Method String BufferedReader.readLine()>
	//  380  875:astore          12
			if(s5 == null)
				break;
	//  381  877:aload           12
	//  382  879:ifnull          893
			System.out.println(s5);
	//  383  882:getstatic       #368 <Field PrintStream System.out>
	//  384  885:aload           12
	//  385  887:invokevirtual   #373 <Method void PrintStream.println(String)>
		} while(true);
	//  386  890:goto            870
		((BufferedReader) (obj1)).close();
	//  387  893:aload           11
	//  388  895:invokevirtual   #374 <Method void BufferedReader.close()>
		do
		{
			String s3 = ((BufferedReader) (obj)).readLine();
	//  389  898:aload           10
	//  390  900:invokevirtual   #364 <Method String BufferedReader.readLine()>
	//  391  903:astore          11
			if(s3 == null)
				break;
	//  392  905:aload           11
	//  393  907:ifnull          921
			System.out.println(s3);
	//  394  910:getstatic       #368 <Field PrintStream System.out>
	//  395  913:aload           11
	//  396  915:invokevirtual   #373 <Method void PrintStream.println(String)>
		} while(true);
	//  397  918:goto            898
		((BufferedReader) (obj)).close();
	//  398  921:aload           10
	//  399  923:invokevirtual   #374 <Method void BufferedReader.close()>
		if(((Process) (map)).waitFor() != 0)
			break MISSING_BLOCK_LABEL_1568;
	//  400  926:aload_3         
	//  401  927:invokevirtual   #377 <Method int Process.waitFor()>
	//  402  930:ifne            1568
		afile = ((File) (s)).listFiles(((FileFilter) (new PngFileFilter())));
	//  403  933:aload_1         
	//  404  934:new             #41  <Class CompareTool$PngFileFilter>
	//  405  937:dup             
	//  406  938:aload_0         
	//  407  939:invokespecial   #311 <Method void CompareTool$PngFileFilter(CompareTool)>
	//  408  942:invokevirtual   #315 <Method File[] File.listFiles(FileFilter)>
	//  409  945:astore          10
		afile1 = ((File) (s)).listFiles(((FileFilter) (new CmpPngFileFilter())));
	//  410  947:aload_1         
	//  411  948:new             #11  <Class CompareTool$CmpPngFileFilter>
	//  412  951:dup             
	//  413  952:aload_0         
	//  414  953:invokespecial   #316 <Method void CompareTool$CmpPngFileFilter(CompareTool)>
	//  415  956:invokevirtual   #315 <Method File[] File.listFiles(FileFilter)>
	//  416  959:astore          11
		flag = false;
	//  417  961:iconst_0        
	//  418  962:istore          5
		if(afile.length != afile1.length)
	//* 419  964:aload           10
	//* 420  966:arraylength     
	//* 421  967:aload           11
	//* 422  969:arraylength     
	//* 423  970:icmpeq          976
			flag = true;
	//  424  973:iconst_1        
	//  425  974:istore          5
		j1 = Math.min(afile.length, afile1.length);
	//  426  976:aload           10
	//  427  978:arraylength     
	//  428  979:aload           11
	//  429  981:arraylength     
	//  430  982:invokestatic    #385 <Method int Math.min(int, int)>
	//  431  985:istore          7
		if(j1 < 1)
	//* 432  987:iload           7
	//* 433  989:iconst_1        
	//* 434  990:icmpge          997
			return "No files for comparing!!!\nThe result or sample pdf file is not processed by GhostScript.";
	//  435  993:ldc2            #387 <String "No files for comparing!!!\nThe result or sample pdf file is not processed by GhostScript.">
	//  436  996:areturn         
		Arrays.sort(((Object []) (afile)), ((Comparator) (new ImageNameComparator())));
	//  437  997:aload           10
	//  438  999:new             #20  <Class CompareTool$ImageNameComparator>
	//  439 1002:dup             
	//  440 1003:aload_0         
	//  441 1004:invokespecial   #388 <Method void CompareTool$ImageNameComparator(CompareTool)>
	//  442 1007:invokestatic    #394 <Method void Arrays.sort(Object[], Comparator)>
		Arrays.sort(((Object []) (afile1)), ((Comparator) (new ImageNameComparator())));
	//  443 1010:aload           11
	//  444 1012:new             #20  <Class CompareTool$ImageNameComparator>
	//  445 1015:dup             
	//  446 1016:aload_0         
	//  447 1017:invokespecial   #388 <Method void CompareTool$ImageNameComparator(CompareTool)>
	//  448 1020:invokestatic    #394 <Method void Arrays.sort(Object[], Comparator)>
		s = null;
	//  449 1023:aconst_null     
	//  450 1024:astore_1        
		i1 = 0;
	//  451 1025:iconst_0        
	//  452 1026:istore          6
_L4:
		map = ((Map) (s));
	//  453 1028:aload_1         
	//  454 1029:astore_3        
		if(i1 >= j1)
			break; /* Loop/switch isn't completed */
	//  455 1030:iload           6
	//  456 1032:iload           7
	//  457 1034:icmpge          1532
		if(list == null || !list.contains(((Object) (Integer.valueOf(i1)))))
	//* 458 1037:aload           4
	//* 459 1039:ifnull          1066
	//* 460 1042:aload           4
	//* 461 1044:iload           6
	//* 462 1046:invokestatic    #398 <Method Integer Integer.valueOf(int)>
	//* 463 1049:invokeinterface #401 <Method boolean List.contains(Object)>
	//* 464 1054:ifeq            1066
	//* 465 1057:iload           6
	//* 466 1059:iconst_1        
	//* 467 1060:iadd            
	//* 468 1061:istore          6
	//* 469 1063:goto            1028
		{
label0:
			{
				System.out.print((new StringBuilder()).append("Comparing page ").append(Integer.toString(i1 + 1)).append(" (").append(afile[i1].getAbsolutePath()).append(")...").toString());
	//  470 1066:getstatic       #368 <Field PrintStream System.out>
	//  471 1069:new             #217 <Class StringBuilder>
	//  472 1072:dup             
	//  473 1073:invokespecial   #218 <Method void StringBuilder()>
	//  474 1076:ldc2            #403 <String "Comparing page ">
	//  475 1079:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  476 1082:iload           6
	//  477 1084:iconst_1        
	//  478 1085:iadd            
	//  479 1086:invokestatic    #406 <Method String Integer.toString(int)>
	//  480 1089:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  481 1092:ldc2            #408 <String " (">
	//  482 1095:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  483 1098:aload           10
	//  484 1100:iload           6
	//  485 1102:aaload          
	//  486 1103:invokevirtual   #222 <Method String File.getAbsolutePath()>
	//  487 1106:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  488 1109:ldc2            #410 <String ")...">
	//  489 1112:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  490 1115:invokevirtual   #231 <Method String StringBuilder.toString()>
	//  491 1118:invokevirtual   #413 <Method void PrintStream.print(String)>
				map = ((Map) (new FileInputStream(afile[i1])));
	//  492 1121:new             #415 <Class FileInputStream>
	//  493 1124:dup             
	//  494 1125:aload           10
	//  495 1127:iload           6
	//  496 1129:aaload          
	//  497 1130:invokespecial   #418 <Method void FileInputStream(File)>
	//  498 1133:astore_3        
				Object obj2 = ((Object) (new FileInputStream(afile1[i1])));
	//  499 1134:new             #415 <Class FileInputStream>
	//  500 1137:dup             
	//  501 1138:aload           11
	//  502 1140:iload           6
	//  503 1142:aaload          
	//  504 1143:invokespecial   #418 <Method void FileInputStream(File)>
	//  505 1146:astore          12
				boolean flag1 = compareStreams(((InputStream) (map)), ((InputStream) (obj2)));
	//  506 1148:aload_0         
	//  507 1149:aload_3         
	//  508 1150:aload           12
	//  509 1152:invokespecial   #422 <Method boolean compareStreams(InputStream, InputStream)>
	//  510 1155:istore          8
				((FileInputStream) (map)).close();
	//  511 1157:aload_3         
	//  512 1158:invokevirtual   #423 <Method void FileInputStream.close()>
				((FileInputStream) (obj2)).close();
	//  513 1161:aload           12
	//  514 1163:invokevirtual   #423 <Method void FileInputStream.close()>
				if(flag1)
					break MISSING_BLOCK_LABEL_1556;
	//  515 1166:iload           8
	//  516 1168:ifne            1556
				if(compareExec == null || !(new File(compareExec)).exists())
					break label0;
	//  517 1171:aload_0         
	//  518 1172:getfield        #125 <Field String compareExec>
	//  519 1175:ifnull          1485
	//  520 1178:new             #209 <Class File>
	//  521 1181:dup             
	//  522 1182:aload_0         
	//  523 1183:getfield        #125 <Field String compareExec>
	//  524 1186:invokespecial   #212 <Method void File(String)>
	//  525 1189:invokevirtual   #215 <Method boolean File.exists()>
	//  526 1192:ifeq            1485
				((Object)this).getClass();
	//  527 1195:aload_0         
	//  528 1196:invokevirtual   #328 <Method Class Object.getClass()>
	//  529 1199:pop             
				map = ((Map) (" \"<image1>\" \"<image2>\" \"<difference>\"".replace("<image1>", ((CharSequence) (afile[i1].getAbsolutePath()))).replace("<image2>", ((CharSequence) (afile1[i1].getAbsolutePath()))).replace("<difference>", ((CharSequence) ((new StringBuilder()).append(s2).append(s1).append(Integer.toString(i1 + 1)).append(".png").toString())))));
	//  530 1200:ldc1            #96  <String " \"<image1>\" \"<image2>\" \"<difference>\"">
	//  531 1202:ldc2            #425 <String "<image1>">
	//  532 1205:aload           10
	//  533 1207:iload           6
	//  534 1209:aaload          
	//  535 1210:invokevirtual   #222 <Method String File.getAbsolutePath()>
	//  536 1213:invokevirtual   #336 <Method String String.replace(CharSequence, CharSequence)>
	//  537 1216:ldc2            #427 <String "<image2>">
	//  538 1219:aload           11
	//  539 1221:iload           6
	//  540 1223:aaload          
	//  541 1224:invokevirtual   #222 <Method String File.getAbsolutePath()>
	//  542 1227:invokevirtual   #336 <Method String String.replace(CharSequence, CharSequence)>
	//  543 1230:ldc2            #429 <String "<difference>">
	//  544 1233:new             #217 <Class StringBuilder>
	//  545 1236:dup             
	//  546 1237:invokespecial   #218 <Method void StringBuilder()>
	//  547 1240:aload           9
	//  548 1242:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  549 1245:aload_2         
	//  550 1246:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  551 1249:iload           6
	//  552 1251:iconst_1        
	//  553 1252:iadd            
	//  554 1253:invokestatic    #406 <Method String Integer.toString(int)>
	//  555 1256:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  556 1259:ldc2            #431 <String ".png">
	//  557 1262:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  558 1265:invokevirtual   #231 <Method String StringBuilder.toString()>
	//  559 1268:invokevirtual   #336 <Method String String.replace(CharSequence, CharSequence)>
	//  560 1271:astore_3        
				map = ((Map) (runProcess(compareExec, ((String) (map)))));
	//  561 1272:aload_0         
	//  562 1273:aload_0         
	//  563 1274:getfield        #125 <Field String compareExec>
	//  564 1277:aload_3         
	//  565 1278:invokespecial   #342 <Method Process runProcess(String, String)>
	//  566 1281:astore_3        
				obj2 = ((Object) (new BufferedReader(((java.io.Reader) (new InputStreamReader(((Process) (map)).getErrorStream()))))));
	//  567 1282:new             #344 <Class BufferedReader>
	//  568 1285:dup             
	//  569 1286:new             #346 <Class InputStreamReader>
	//  570 1289:dup             
	//  571 1290:aload_3         
	//  572 1291:invokevirtual   #361 <Method InputStream Process.getErrorStream()>
	//  573 1294:invokespecial   #355 <Method void InputStreamReader(InputStream)>
	//  574 1297:invokespecial   #358 <Method void BufferedReader(java.io.Reader)>
	//  575 1300:astore          12
				do
				{
					String s6 = ((BufferedReader) (obj2)).readLine();
	//  576 1302:aload           12
	//  577 1304:invokevirtual   #364 <Method String BufferedReader.readLine()>
	//  578 1307:astore          13
					if(s6 == null)
						break;
	//  579 1309:aload           13
	//  580 1311:ifnull          1325
					System.out.println(s6);
	//  581 1314:getstatic       #368 <Field PrintStream System.out>
	//  582 1317:aload           13
	//  583 1319:invokevirtual   #373 <Method void PrintStream.println(String)>
				} while(true);
	//  584 1322:goto            1302
				((BufferedReader) (obj2)).close();
	//  585 1325:aload           12
	//  586 1327:invokevirtual   #374 <Method void BufferedReader.close()>
				if(((Process) (map)).waitFor() == 0)
	//* 587 1330:aload_3         
	//* 588 1331:invokevirtual   #377 <Method int Process.waitFor()>
	//* 589 1334:ifne            1456
				{
					if(s == null)
	//* 590 1337:aload_1         
	//* 591 1338:ifnonnull       1423
					{
						s = "File <filename> differs on page <pagenumber>.".replace("<filename>", ((CharSequence) (outPdf))).replace("<pagenumber>", ((CharSequence) (Integer.toString(i1 + 1))));
	//  592 1341:ldc1            #49  <String "File <filename> differs on page <pagenumber>.">
	//  593 1343:ldc2            #433 <String "<filename>">
	//  594 1346:aload_0         
	//  595 1347:getfield        #255 <Field String outPdf>
	//  596 1350:invokevirtual   #336 <Method String String.replace(CharSequence, CharSequence)>
	//  597 1353:ldc2            #435 <String "<pagenumber>">
	//  598 1356:iload           6
	//  599 1358:iconst_1        
	//  600 1359:iadd            
	//  601 1360:invokestatic    #406 <Method String Integer.toString(int)>
	//  602 1363:invokevirtual   #336 <Method String String.replace(CharSequence, CharSequence)>
	//  603 1366:astore_1        
						s = (new StringBuilder()).append(s).append("\nPlease, examine ").append(s2).append(s1).append(Integer.toString(i1 + 1)).append(".png for more details.").toString();
	//  604 1367:new             #217 <Class StringBuilder>
	//  605 1370:dup             
	//  606 1371:invokespecial   #218 <Method void StringBuilder()>
	//  607 1374:aload_1         
	//  608 1375:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  609 1378:ldc2            #437 <String "\nPlease, examine ">
	//  610 1381:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  611 1384:aload           9
	//  612 1386:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  613 1389:aload_2         
	//  614 1390:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  615 1393:iload           6
	//  616 1395:iconst_1        
	//  617 1396:iadd            
	//  618 1397:invokestatic    #406 <Method String Integer.toString(int)>
	//  619 1400:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  620 1403:ldc2            #439 <String ".png for more details.">
	//  621 1406:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  622 1409:invokevirtual   #231 <Method String StringBuilder.toString()>
	//  623 1412:astore_1        
					} else
	//* 624 1413:getstatic       #368 <Field PrintStream System.out>
	//* 625 1416:aload_1         
	//* 626 1417:invokevirtual   #373 <Method void PrintStream.println(String)>
	//* 627 1420:goto            1057
					{
						s = (new StringBuilder()).append("File ").append(outPdf).append(" differs.\nPlease, examine difference images for more details.").toString();
	//  628 1423:new             #217 <Class StringBuilder>
	//  629 1426:dup             
	//  630 1427:invokespecial   #218 <Method void StringBuilder()>
	//  631 1430:ldc2            #441 <String "File ">
	//  632 1433:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  633 1436:aload_0         
	//  634 1437:getfield        #255 <Field String outPdf>
	//  635 1440:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  636 1443:ldc2            #443 <String " differs.\nPlease, examine difference images for more details.">
	//  637 1446:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  638 1449:invokevirtual   #231 <Method String StringBuilder.toString()>
	//  639 1452:astore_1        
					}
				} else
	//* 640 1453:goto            1413
				{
					s = "File <filename> differs on page <pagenumber>.".replace("<filename>", ((CharSequence) (outPdf))).replace("<pagenumber>", ((CharSequence) (Integer.toString(i1 + 1))));
	//  641 1456:ldc1            #49  <String "File <filename> differs on page <pagenumber>.">
	//  642 1458:ldc2            #433 <String "<filename>">
	//  643 1461:aload_0         
	//  644 1462:getfield        #255 <Field String outPdf>
	//  645 1465:invokevirtual   #336 <Method String String.replace(CharSequence, CharSequence)>
	//  646 1468:ldc2            #435 <String "<pagenumber>">
	//  647 1471:iload           6
	//  648 1473:iconst_1        
	//  649 1474:iadd            
	//  650 1475:invokestatic    #406 <Method String Integer.toString(int)>
	//  651 1478:invokevirtual   #336 <Method String String.replace(CharSequence, CharSequence)>
	//  652 1481:astore_1        
				}
				System.out.println(s);
			}
		}
_L5:
		i1++;
		if(true) goto _L4; else goto _L3
	//* 653 1482:goto            1413
		s = "File <filename> differs on page <pagenumber>.".replace("<filename>", ((CharSequence) (outPdf))).replace("<pagenumber>", ((CharSequence) (Integer.toString(i1 + 1))));
	//  654 1485:ldc1            #49  <String "File <filename> differs on page <pagenumber>.">
	//  655 1487:ldc2            #433 <String "<filename>">
	//  656 1490:aload_0         
	//  657 1491:getfield        #255 <Field String outPdf>
	//  658 1494:invokevirtual   #336 <Method String String.replace(CharSequence, CharSequence)>
	//  659 1497:ldc2            #435 <String "<pagenumber>">
	//  660 1500:iload           6
	//  661 1502:iconst_1        
	//  662 1503:iadd            
	//  663 1504:invokestatic    #406 <Method String Integer.toString(int)>
	//  664 1507:invokevirtual   #336 <Method String String.replace(CharSequence, CharSequence)>
	//  665 1510:astore_1        
		map = ((Map) ((new StringBuilder()).append(s).append("\nYou can optionally specify path to ImageMagick compare tool (e.g. -DcompareExec=\"C:/Program Files/ImageMagick-6.5.4-2/compare.exe\") to visualize differences.").toString()));
	//  666 1511:new             #217 <Class StringBuilder>
	//  667 1514:dup             
	//  668 1515:invokespecial   #218 <Method void StringBuilder()>
	//  669 1518:aload_1         
	//  670 1519:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  671 1522:ldc2            #445 <String "\nYou can optionally specify path to ImageMagick compare tool (e.g. -DcompareExec=\"C:/Program Files/ImageMagick-6.5.4-2/compare.exe\") to visualize differences.">
	//  672 1525:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  673 1528:invokevirtual   #231 <Method String StringBuilder.toString()>
	//  674 1531:astore_3        
_L3:
		s = ((String) (map));
	//  675 1532:aload_3         
	//  676 1533:astore_1        
		if(map == null)
	//* 677 1534:aload_3         
	//* 678 1535:ifnonnull       10
			if(flag)
	//* 679 1538:iload           5
	//* 680 1540:ifeq            1607
				return "Unexpected number of pages for <filename>.".replace("<filename>", ((CharSequence) (outPdf)));
	//  681 1543:ldc1            #61  <String "Unexpected number of pages for <filename>.">
	//  682 1545:ldc2            #433 <String "<filename>">
	//  683 1548:aload_0         
	//  684 1549:getfield        #255 <Field String outPdf>
	//  685 1552:invokevirtual   #336 <Method String String.replace(CharSequence, CharSequence)>
	//  686 1555:areturn         
			else
	//* 687 1556:getstatic       #368 <Field PrintStream System.out>
	//* 688 1559:ldc2            #447 <String "done.">
	//* 689 1562:invokevirtual   #373 <Method void PrintStream.println(String)>
	//* 690 1565:goto            1057
	//* 691 1568:ldc1            #52  <String "GhostScript failed for <filename>.">
	//* 692 1570:ldc2            #433 <String "<filename>">
	//* 693 1573:aload_0         
	//* 694 1574:getfield        #255 <Field String outPdf>
	//* 695 1577:invokevirtual   #336 <Method String String.replace(CharSequence, CharSequence)>
	//* 696 1580:areturn         
	//* 697 1581:ldc1            #52  <String "GhostScript failed for <filename>.">
	//* 698 1583:ldc2            #433 <String "<filename>">
	//* 699 1586:aload_0         
	//* 700 1587:getfield        #252 <Field String cmpPdf>
	//* 701 1590:invokevirtual   #336 <Method String String.replace(CharSequence, CharSequence)>
	//* 702 1593:areturn         
	//* 703 1594:ldc1            #46  <String "Cannot open target directory for <filename>.">
	//* 704 1596:ldc2            #433 <String "<filename>">
	//* 705 1599:aload_0         
	//* 706 1600:getfield        #255 <Field String outPdf>
	//* 707 1603:invokevirtual   #336 <Method String String.replace(CharSequence, CharSequence)>
	//* 708 1606:areturn         
				return null;
	//  709 1607:aconst_null     
	//  710 1608:areturn         
		continue; /* Loop/switch isn't completed */
		System.out.println("done.");
		  goto _L5
		return "GhostScript failed for <filename>.".replace("<filename>", ((CharSequence) (outPdf)));
		return "GhostScript failed for <filename>.".replace("<filename>", ((CharSequence) (cmpPdf)));
		return "Cannot open target directory for <filename>.".replace("<filename>", ((CharSequence) (outPdf)));
		if(true) goto _L7; else goto _L6
_L6:
	}

	private boolean compareArraysExtended(PdfArray pdfarray, PdfArray pdfarray1, ObjectPath objectpath, CompareResult compareresult)
		throws IOException
	{
		if(pdfarray != null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnonnull       28
_L1:
		boolean flag1;
		if(compareresult != null && objectpath != null)
	//*   2    4:aload           4
	//*   3    6:ifnull          22
	//*   4    9:aload_3         
	//*   5   10:ifnull          22
			compareresult.addError(objectpath, "Found null. Expected PdfArray.");
	//    6   13:aload           4
	//    7   15:aload_3         
	//    8   16:ldc2            #452 <String "Found null. Expected PdfArray.">
	//    9   19:invokevirtual   #456 <Method void CompareTool$CompareResult.addError(CompareTool$ObjectPath, String)>
		flag1 = false;
	//   10   22:iconst_0        
	//   11   23:istore          7
_L4:
		return flag1;
	//   12   25:iload           7
	//   13   27:ireturn         
_L2:
		if(pdfarray.size() != pdfarray1.size())
	//*  14   28:aload_1         
	//*  15   29:invokevirtual   #459 <Method int PdfArray.size()>
	//*  16   32:aload_2         
	//*  17   33:invokevirtual   #459 <Method int PdfArray.size()>
	//*  18   36:icmpeq          86
		{
			if(compareresult != null && objectpath != null)
	//*  19   39:aload           4
	//*  20   41:ifnull          84
	//*  21   44:aload_3         
	//*  22   45:ifnull          84
				compareresult.addError(objectpath, String.format("PdfArrays. Lengths are different. Expected: %s. Found: %s.", new Object[] {
					Integer.valueOf(pdfarray1.size()), Integer.valueOf(pdfarray.size())
				}));
	//   23   48:aload           4
	//   24   50:aload_3         
	//   25   51:ldc2            #461 <String "PdfArrays. Lengths are different. Expected: %s. Found: %s.">
	//   26   54:iconst_2        
	//   27   55:anewarray       Object[]
	//   28   58:dup             
	//   29   59:iconst_0        
	//   30   60:aload_2         
	//   31   61:invokevirtual   #459 <Method int PdfArray.size()>
	//   32   64:invokestatic    #398 <Method Integer Integer.valueOf(int)>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_1        
	//   36   70:aload_1         
	//   37   71:invokevirtual   #459 <Method int PdfArray.size()>
	//   38   74:invokestatic    #398 <Method Integer Integer.valueOf(int)>
	//   39   77:aastore         
	//   40   78:invokestatic    #465 <Method String String.format(String, Object[])>
	//   41   81:invokevirtual   #456 <Method void CompareTool$CompareResult.addError(CompareTool$ObjectPath, String)>
			return false;
	//   42   84:iconst_0        
	//   43   85:ireturn         
		}
		boolean flag = true;
	//   44   86:iconst_1        
	//   45   87:istore          6
		int i = 0;
	//   46   89:iconst_0        
	//   47   90:istore          5
		do
		{
			flag1 = flag;
	//   48   92:iload           6
	//   49   94:istore          7
			if(i >= pdfarray1.size())
				continue;
	//   50   96:iload           5
	//   51   98:aload_2         
	//   52   99:invokevirtual   #459 <Method int PdfArray.size()>
	//   53  102:icmpge          25
			if(objectpath != null)
	//*  54  105:aload_3         
	//*  55  106:ifnull          115
				objectpath.pushArrayItemToPath(i);
	//   56  109:aload_3         
	//   57  110:iload           5
	//   58  112:invokevirtual   #469 <Method void CompareTool$ObjectPath.pushArrayItemToPath(int)>
			if(compareObjects(pdfarray.getPdfObject(i), pdfarray1.getPdfObject(i), objectpath, compareresult) && flag)
	//*  59  115:aload_0         
	//*  60  116:aload_1         
	//*  61  117:iload           5
	//*  62  119:invokevirtual   #472 <Method PdfObject PdfArray.getPdfObject(int)>
	//*  63  122:aload_2         
	//*  64  123:iload           5
	//*  65  125:invokevirtual   #472 <Method PdfObject PdfArray.getPdfObject(int)>
	//*  66  128:aload_3         
	//*  67  129:aload           4
	//*  68  131:invokespecial   #476 <Method boolean compareObjects(PdfObject, PdfObject, CompareTool$ObjectPath, CompareTool$CompareResult)>
	//*  69  134:ifeq            177
	//*  70  137:iload           6
	//*  71  139:ifeq            177
				flag = true;
	//   72  142:iconst_1        
	//   73  143:istore          6
			else
	//*  74  145:aload_3         
	//*  75  146:ifnull          153
	//*  76  149:aload_3         
	//*  77  150:invokevirtual   #479 <Method void CompareTool$ObjectPath.pop()>
	//*  78  153:iload           6
	//*  79  155:ifne            183
	//*  80  158:aload_3         
	//*  81  159:ifnull          175
	//*  82  162:aload           4
	//*  83  164:ifnull          175
	//*  84  167:aload           4
	//*  85  169:invokevirtual   #482 <Method boolean CompareTool$CompareResult.isMessageLimitReached()>
	//*  86  172:ifeq            183
	//*  87  175:iconst_0        
	//*  88  176:ireturn         
				flag = false;
	//   89  177:iconst_0        
	//   90  178:istore          6
			if(objectpath != null)
				objectpath.pop();
			if(!flag && (objectpath == null || compareresult == null || compareresult.isMessageLimitReached()))
				return false;
	//*  91  180:goto            145
			i++;
	//   92  183:iload           5
	//   93  185:iconst_1        
	//   94  186:iadd            
	//   95  187:istore          5
		} while(true);
	//   96  189:goto            92
		if(true) goto _L4; else goto _L3
_L3:
	}

	private boolean compareBooleansExtended(PdfBoolean pdfboolean, PdfBoolean pdfboolean1, ObjectPath objectpath, CompareResult compareresult)
	{
		if(pdfboolean1.booleanValue() == pdfboolean.booleanValue())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #489 <Method boolean PdfBoolean.booleanValue()>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #489 <Method boolean PdfBoolean.booleanValue()>
	//*   4    8:icmpne          13
			return true;
	//    5   11:iconst_1        
	//    6   12:ireturn         
		if(compareresult != null && objectpath != null)
	//*   7   13:aload           4
	//*   8   15:ifnull          58
	//*   9   18:aload_3         
	//*  10   19:ifnull          58
			compareresult.addError(objectpath, String.format("PdfBoolean. Expected: %s. Found: %s.", new Object[] {
				Boolean.valueOf(pdfboolean1.booleanValue()), Boolean.valueOf(pdfboolean.booleanValue())
			}));
	//   11   22:aload           4
	//   12   24:aload_3         
	//   13   25:ldc2            #491 <String "PdfBoolean. Expected: %s. Found: %s.">
	//   14   28:iconst_2        
	//   15   29:anewarray       Object[]
	//   16   32:dup             
	//   17   33:iconst_0        
	//   18   34:aload_2         
	//   19   35:invokevirtual   #489 <Method boolean PdfBoolean.booleanValue()>
	//   20   38:invokestatic    #496 <Method Boolean Boolean.valueOf(boolean)>
	//   21   41:aastore         
	//   22   42:dup             
	//   23   43:iconst_1        
	//   24   44:aload_1         
	//   25   45:invokevirtual   #489 <Method boolean PdfBoolean.booleanValue()>
	//   26   48:invokestatic    #496 <Method Boolean Boolean.valueOf(boolean)>
	//   27   51:aastore         
	//   28   52:invokestatic    #465 <Method String String.format(String, Object[])>
	//   29   55:invokevirtual   #456 <Method void CompareTool$CompareResult.addError(CompareTool$ObjectPath, String)>
		return false;
	//   30   58:iconst_0        
	//   31   59:ireturn         
	}

	private boolean compareContentStreamsByParsingExtended(PdfObject pdfobject, PdfObject pdfobject1, PdfDictionary pdfdictionary, PdfDictionary pdfdictionary1, ObjectPath objectpath, CompareResult compareresult)
		throws IOException
	{
		if(pdfobject.type() != pdfobject.type())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #501 <Method int PdfObject.type()>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #501 <Method int PdfObject.type()>
	//*   4    8:icmpeq          50
		{
			compareresult.addError(objectpath, String.format("PdfObject. Types are different. Expected: %s. Found: %s", new Object[] {
				Integer.valueOf(pdfobject1.type()), Integer.valueOf(pdfobject.type())
			}));
	//    5   11:aload           6
	//    6   13:aload           5
	//    7   15:ldc2            #503 <String "PdfObject. Types are different. Expected: %s. Found: %s">
	//    8   18:iconst_2        
	//    9   19:anewarray       Object[]
	//   10   22:dup             
	//   11   23:iconst_0        
	//   12   24:aload_2         
	//   13   25:invokevirtual   #501 <Method int PdfObject.type()>
	//   14   28:invokestatic    #398 <Method Integer Integer.valueOf(int)>
	//   15   31:aastore         
	//   16   32:dup             
	//   17   33:iconst_1        
	//   18   34:aload_1         
	//   19   35:invokevirtual   #501 <Method int PdfObject.type()>
	//   20   38:invokestatic    #398 <Method Integer Integer.valueOf(int)>
	//   21   41:aastore         
	//   22   42:invokestatic    #465 <Method String String.format(String, Object[])>
	//   23   45:invokevirtual   #456 <Method void CompareTool$CompareResult.addError(CompareTool$ObjectPath, String)>
			return false;
	//   24   48:iconst_0        
	//   25   49:ireturn         
		}
		if(pdfobject.isArray())
	//*  26   50:aload_1         
	//*  27   51:invokevirtual   #506 <Method boolean PdfObject.isArray()>
	//*  28   54:ifeq            175
		{
			PdfArray pdfarray = (PdfArray)pdfobject;
	//   29   57:aload_1         
	//   30   58:checkcast       #159 <Class PdfArray>
	//   31   61:astore          8
			PdfArray pdfarray1 = (PdfArray)pdfobject1;
	//   32   63:aload_2         
	//   33   64:checkcast       #159 <Class PdfArray>
	//   34   67:astore          9
			if(pdfarray1.size() != pdfarray.size())
	//*  35   69:aload           9
	//*  36   71:invokevirtual   #459 <Method int PdfArray.size()>
	//*  37   74:aload           8
	//*  38   76:invokevirtual   #459 <Method int PdfArray.size()>
	//*  39   79:icmpeq          123
			{
				compareresult.addError(objectpath, String.format("PdfArray. Sizes are different. Expected: %s. Found: %s", new Object[] {
					Integer.valueOf(pdfarray1.size()), Integer.valueOf(pdfarray.size())
				}));
	//   40   82:aload           6
	//   41   84:aload           5
	//   42   86:ldc2            #508 <String "PdfArray. Sizes are different. Expected: %s. Found: %s">
	//   43   89:iconst_2        
	//   44   90:anewarray       Object[]
	//   45   93:dup             
	//   46   94:iconst_0        
	//   47   95:aload           9
	//   48   97:invokevirtual   #459 <Method int PdfArray.size()>
	//   49  100:invokestatic    #398 <Method Integer Integer.valueOf(int)>
	//   50  103:aastore         
	//   51  104:dup             
	//   52  105:iconst_1        
	//   53  106:aload           8
	//   54  108:invokevirtual   #459 <Method int PdfArray.size()>
	//   55  111:invokestatic    #398 <Method Integer Integer.valueOf(int)>
	//   56  114:aastore         
	//   57  115:invokestatic    #465 <Method String String.format(String, Object[])>
	//   58  118:invokevirtual   #456 <Method void CompareTool$CompareResult.addError(CompareTool$ObjectPath, String)>
				return false;
	//   59  121:iconst_0        
	//   60  122:ireturn         
			}
			for(int i = 0; i < pdfarray1.size(); i++)
	//*  61  123:iconst_0        
	//*  62  124:istore          7
	//*  63  126:iload           7
	//*  64  128:aload           9
	//*  65  130:invokevirtual   #459 <Method int PdfArray.size()>
	//*  66  133:icmpge          175
				if(!compareContentStreamsByParsingExtended(pdfarray.getPdfObject(i), pdfarray1.getPdfObject(i), pdfdictionary, pdfdictionary1, objectpath, compareresult))
	//*  67  136:aload_0         
	//*  68  137:aload           8
	//*  69  139:iload           7
	//*  70  141:invokevirtual   #472 <Method PdfObject PdfArray.getPdfObject(int)>
	//*  71  144:aload           9
	//*  72  146:iload           7
	//*  73  148:invokevirtual   #472 <Method PdfObject PdfArray.getPdfObject(int)>
	//*  74  151:aload_3         
	//*  75  152:aload           4
	//*  76  154:aload           5
	//*  77  156:aload           6
	//*  78  158:invokespecial   #510 <Method boolean compareContentStreamsByParsingExtended(PdfObject, PdfObject, PdfDictionary, PdfDictionary, CompareTool$ObjectPath, CompareTool$CompareResult)>
	//*  79  161:ifne            166
					return false;
	//   80  164:iconst_0        
	//   81  165:ireturn         

	//   82  166:iload           7
	//   83  168:iconst_1        
	//   84  169:iadd            
	//   85  170:istore          7
		}
	//*  86  172:goto            126
		PRTokeniser prtokeniser = new PRTokeniser(new RandomAccessFileOrArray((new RandomAccessSourceFactory()).createSource(ContentByteUtils.getContentBytesFromContentObject(pdfobject1))));
	//   87  175:new             #512 <Class PRTokeniser>
	//   88  178:dup             
	//   89  179:new             #514 <Class RandomAccessFileOrArray>
	//   90  182:dup             
	//   91  183:new             #516 <Class RandomAccessSourceFactory>
	//   92  186:dup             
	//   93  187:invokespecial   #517 <Method void RandomAccessSourceFactory()>
	//   94  190:aload_2         
	//   95  191:invokestatic    #523 <Method byte[] ContentByteUtils.getContentBytesFromContentObject(PdfObject)>
	//   96  194:invokevirtual   #527 <Method com.itextpdf.text.io.RandomAccessSource RandomAccessSourceFactory.createSource(byte[])>
	//   97  197:invokespecial   #530 <Method void RandomAccessFileOrArray(com.itextpdf.text.io.RandomAccessSource)>
	//   98  200:invokespecial   #533 <Method void PRTokeniser(RandomAccessFileOrArray)>
	//   99  203:astore          9
		Object obj = ((Object) (new PRTokeniser(new RandomAccessFileOrArray((new RandomAccessSourceFactory()).createSource(ContentByteUtils.getContentBytesFromContentObject(pdfobject))))));
	//  100  205:new             #512 <Class PRTokeniser>
	//  101  208:dup             
	//  102  209:new             #514 <Class RandomAccessFileOrArray>
	//  103  212:dup             
	//  104  213:new             #516 <Class RandomAccessSourceFactory>
	//  105  216:dup             
	//  106  217:invokespecial   #517 <Method void RandomAccessSourceFactory()>
	//  107  220:aload_1         
	//  108  221:invokestatic    #523 <Method byte[] ContentByteUtils.getContentBytesFromContentObject(PdfObject)>
	//  109  224:invokevirtual   #527 <Method com.itextpdf.text.io.RandomAccessSource RandomAccessSourceFactory.createSource(byte[])>
	//  110  227:invokespecial   #530 <Method void RandomAccessFileOrArray(com.itextpdf.text.io.RandomAccessSource)>
	//  111  230:invokespecial   #533 <Method void PRTokeniser(RandomAccessFileOrArray)>
	//  112  233:astore          8
		PdfContentParser pdfcontentparser = new PdfContentParser(prtokeniser);
	//  113  235:new             #535 <Class PdfContentParser>
	//  114  238:dup             
	//  115  239:aload           9
	//  116  241:invokespecial   #538 <Method void PdfContentParser(PRTokeniser)>
	//  117  244:astore          10
		PdfContentParser pdfcontentparser1 = new PdfContentParser(((PRTokeniser) (obj)));
	//  118  246:new             #535 <Class PdfContentParser>
	//  119  249:dup             
	//  120  250:aload           8
	//  121  252:invokespecial   #538 <Method void PdfContentParser(PRTokeniser)>
	//  122  255:astore          11
		ArrayList arraylist = new ArrayList();
	//  123  257:new             #540 <Class ArrayList>
	//  124  260:dup             
	//  125  261:invokespecial   #541 <Method void ArrayList()>
	//  126  264:astore          12
		ArrayList arraylist1 = new ArrayList();
	//  127  266:new             #540 <Class ArrayList>
	//  128  269:dup             
	//  129  270:invokespecial   #541 <Method void ArrayList()>
	//  130  273:astore          13
		obj = ((Object) (pdfdictionary));
	//  131  275:aload_3         
	//  132  276:astore          8
		do
		{
			if(pdfcontentparser.parse(arraylist).size() <= 0)
				break;
	//  133  278:aload           10
	//  134  280:aload           12
	//  135  282:invokevirtual   #545 <Method ArrayList PdfContentParser.parse(ArrayList)>
	//  136  285:invokevirtual   #546 <Method int ArrayList.size()>
	//  137  288:ifle            569
			pdfcontentparser1.parse(arraylist1);
	//  138  291:aload           11
	//  139  293:aload           13
	//  140  295:invokevirtual   #545 <Method ArrayList PdfContentParser.parse(ArrayList)>
	//  141  298:pop             
			if(arraylist.size() != arraylist1.size())
	//* 142  299:aload           12
	//* 143  301:invokevirtual   #546 <Method int ArrayList.size()>
	//* 144  304:aload           13
	//* 145  306:invokevirtual   #546 <Method int ArrayList.size()>
	//* 146  309:icmpeq          353
			{
				compareresult.addError(objectpath, String.format("PdfObject. Different commands lengths. Expected: %s. Found: %s", new Object[] {
					Integer.valueOf(arraylist.size()), Integer.valueOf(arraylist1.size())
				}));
	//  147  312:aload           6
	//  148  314:aload           5
	//  149  316:ldc2            #548 <String "PdfObject. Different commands lengths. Expected: %s. Found: %s">
	//  150  319:iconst_2        
	//  151  320:anewarray       Object[]
	//  152  323:dup             
	//  153  324:iconst_0        
	//  154  325:aload           12
	//  155  327:invokevirtual   #546 <Method int ArrayList.size()>
	//  156  330:invokestatic    #398 <Method Integer Integer.valueOf(int)>
	//  157  333:aastore         
	//  158  334:dup             
	//  159  335:iconst_1        
	//  160  336:aload           13
	//  161  338:invokevirtual   #546 <Method int ArrayList.size()>
	//  162  341:invokestatic    #398 <Method Integer Integer.valueOf(int)>
	//  163  344:aastore         
	//  164  345:invokestatic    #465 <Method String String.format(String, Object[])>
	//  165  348:invokevirtual   #456 <Method void CompareTool$CompareResult.addError(CompareTool$ObjectPath, String)>
				return false;
	//  166  351:iconst_0        
	//  167  352:ireturn         
			}
			if(arraylist.size() == 1 && compareLiterals((PdfLiteral)arraylist.get(0), new PdfLiteral("BI")) && compareLiterals((PdfLiteral)arraylist1.get(0), new PdfLiteral("BI")))
	//* 168  353:aload           12
	//* 169  355:invokevirtual   #546 <Method int ArrayList.size()>
	//* 170  358:iconst_1        
	//* 171  359:icmpne          514
	//* 172  362:aload_0         
	//* 173  363:aload           12
	//* 174  365:iconst_0        
	//* 175  366:invokevirtual   #552 <Method Object ArrayList.get(int)>
	//* 176  369:checkcast       #554 <Class PdfLiteral>
	//* 177  372:new             #554 <Class PdfLiteral>
	//* 178  375:dup             
	//* 179  376:ldc2            #556 <String "BI">
	//* 180  379:invokespecial   #557 <Method void PdfLiteral(String)>
	//* 181  382:invokevirtual   #561 <Method boolean compareLiterals(PdfLiteral, PdfLiteral)>
	//* 182  385:ifeq            514
	//* 183  388:aload_0         
	//* 184  389:aload           13
	//* 185  391:iconst_0        
	//* 186  392:invokevirtual   #552 <Method Object ArrayList.get(int)>
	//* 187  395:checkcast       #554 <Class PdfLiteral>
	//* 188  398:new             #554 <Class PdfLiteral>
	//* 189  401:dup             
	//* 190  402:ldc2            #556 <String "BI">
	//* 191  405:invokespecial   #557 <Method void PdfLiteral(String)>
	//* 192  408:invokevirtual   #561 <Method boolean compareLiterals(PdfLiteral, PdfLiteral)>
	//* 193  411:ifeq            514
			{
				PRStream prstream = (PRStream)pdfobject1;
	//  194  414:aload_2         
	//  195  415:checkcast       #563 <Class PRStream>
	//  196  418:astore          14
				PRStream prstream1 = (PRStream)pdfobject;
	//  197  420:aload_1         
	//  198  421:checkcast       #563 <Class PRStream>
	//  199  424:astore          15
				PdfDictionary pdfdictionary2 = ((PdfDictionary) (obj));
	//  200  426:aload           8
	//  201  428:astore          9
				pdfdictionary = pdfdictionary1;
	//  202  430:aload           4
	//  203  432:astore_3        
				if(prstream1.getDirectObject(PdfName.RESOURCES) != null)
	//* 204  433:aload           15
	//* 205  435:getstatic       #566 <Field PdfName PdfName.RESOURCES>
	//* 206  438:invokevirtual   #570 <Method PdfObject PRStream.getDirectObject(PdfName)>
	//* 207  441:ifnull          487
				{
					pdfdictionary2 = ((PdfDictionary) (obj));
	//  208  444:aload           8
	//  209  446:astore          9
					pdfdictionary = pdfdictionary1;
	//  210  448:aload           4
	//  211  450:astore_3        
					if(prstream.getDirectObject(PdfName.RESOURCES) != null)
	//* 212  451:aload           14
	//* 213  453:getstatic       #566 <Field PdfName PdfName.RESOURCES>
	//* 214  456:invokevirtual   #570 <Method PdfObject PRStream.getDirectObject(PdfName)>
	//* 215  459:ifnull          487
					{
						pdfdictionary2 = (PdfDictionary)prstream1.getDirectObject(PdfName.RESOURCES);
	//  216  462:aload           15
	//  217  464:getstatic       #566 <Field PdfName PdfName.RESOURCES>
	//  218  467:invokevirtual   #570 <Method PdfObject PRStream.getDirectObject(PdfName)>
	//  219  470:checkcast       #143 <Class PdfDictionary>
	//  220  473:astore          9
						pdfdictionary = (PdfDictionary)prstream.getDirectObject(PdfName.RESOURCES);
	//  221  475:aload           14
	//  222  477:getstatic       #566 <Field PdfName PdfName.RESOURCES>
	//  223  480:invokevirtual   #570 <Method PdfObject PRStream.getDirectObject(PdfName)>
	//  224  483:checkcast       #143 <Class PdfDictionary>
	//  225  486:astore_3        
					}
				}
				obj = ((Object) (pdfdictionary2));
	//  226  487:aload           9
	//  227  489:astore          8
				pdfdictionary1 = pdfdictionary;
	//  228  491:aload_3         
	//  229  492:astore          4
				if(!compareInlineImagesExtended(pdfcontentparser1, pdfcontentparser, pdfdictionary2, pdfdictionary, objectpath, compareresult))
	//* 230  494:aload_0         
	//* 231  495:aload           11
	//* 232  497:aload           10
	//* 233  499:aload           9
	//* 234  501:aload_3         
	//* 235  502:aload           5
	//* 236  504:aload           6
	//* 237  506:invokespecial   #574 <Method boolean compareInlineImagesExtended(PdfContentParser, PdfContentParser, PdfDictionary, PdfDictionary, CompareTool$ObjectPath, CompareTool$CompareResult)>
	//* 238  509:ifne            278
					return false;
	//  239  512:iconst_0        
	//  240  513:ireturn         
			} else
			{
				int j = 0;
	//  241  514:iconst_0        
	//  242  515:istore          7
				while(j < arraylist.size()) 
	//* 243  517:iload           7
	//* 244  519:aload           12
	//* 245  521:invokevirtual   #546 <Method int ArrayList.size()>
	//* 246  524:icmpge          278
				{
					if(!compareObjects((PdfObject)arraylist1.get(j), (PdfObject)arraylist.get(j), objectpath, compareresult))
	//* 247  527:aload_0         
	//* 248  528:aload           13
	//* 249  530:iload           7
	//* 250  532:invokevirtual   #552 <Method Object ArrayList.get(int)>
	//* 251  535:checkcast       #174 <Class PdfObject>
	//* 252  538:aload           12
	//* 253  540:iload           7
	//* 254  542:invokevirtual   #552 <Method Object ArrayList.get(int)>
	//* 255  545:checkcast       #174 <Class PdfObject>
	//* 256  548:aload           5
	//* 257  550:aload           6
	//* 258  552:invokespecial   #476 <Method boolean compareObjects(PdfObject, PdfObject, CompareTool$ObjectPath, CompareTool$CompareResult)>
	//* 259  555:ifne            560
						return false;
	//  260  558:iconst_0        
	//  261  559:ireturn         
					j++;
	//  262  560:iload           7
	//  263  562:iconst_1        
	//  264  563:iadd            
	//  265  564:istore          7
				}
			}
		} while(true);
	//  266  566:goto            517
		return true;
	//  267  569:iconst_1        
	//  268  570:ireturn         
	}

	private boolean compareDictionariesExtended(PdfDictionary pdfdictionary, PdfDictionary pdfdictionary1, ObjectPath objectpath, CompareResult compareresult)
		throws IOException
	{
		if((pdfdictionary1 == null || pdfdictionary != null) && (pdfdictionary == null || pdfdictionary1 != null)) goto _L2; else goto _L1
	//    0    0:aload_2         
	//    1    1:ifnull          8
	//    2    4:aload_1         
	//    3    5:ifnull          16
	//    4    8:aload_1         
	//    5    9:ifnull          31
	//    6   12:aload_2         
	//    7   13:ifnonnull       31
_L1:
		boolean flag1;
		compareresult.addError(objectpath, "One of the dictionaries is null, the other is not.");
	//    8   16:aload           4
	//    9   18:aload_3         
	//   10   19:ldc2            #578 <String "One of the dictionaries is null, the other is not.">
	//   11   22:invokevirtual   #456 <Method void CompareTool$CompareResult.addError(CompareTool$ObjectPath, String)>
		flag1 = false;
	//   12   25:iconst_0        
	//   13   26:istore          6
_L4:
		return flag1;
	//   14   28:iload           6
	//   15   30:ireturn         
_L2:
		boolean flag;
		Object obj;
		flag = true;
	//   16   31:iconst_1        
	//   17   32:istore          5
		obj = ((Object) (new TreeSet(((java.util.Collection) (pdfdictionary1.getKeys())))));
	//   18   34:new             #580 <Class TreeSet>
	//   19   37:dup             
	//   20   38:aload_2         
	//   21   39:invokevirtual   #583 <Method Set PdfDictionary.getKeys()>
	//   22   42:invokespecial   #586 <Method void TreeSet(java.util.Collection)>
	//   23   45:astore          7
		((Set) (obj)).addAll(((java.util.Collection) (pdfdictionary.getKeys())));
	//   24   47:aload           7
	//   25   49:aload_1         
	//   26   50:invokevirtual   #583 <Method Set PdfDictionary.getKeys()>
	//   27   53:invokeinterface #590 <Method boolean Set.addAll(java.util.Collection)>
	//   28   58:pop             
		obj = ((Object) (((Set) (obj)).iterator()));
	//   29   59:aload           7
	//   30   61:invokeinterface #270 <Method Iterator Set.iterator()>
	//   31   66:astore          7
_L5:
		flag1 = flag;
	//   32   68:iload           5
	//   33   70:istore          6
		if(!((Iterator) (obj)).hasNext()) goto _L4; else goto _L3
	//   34   72:aload           7
	//   35   74:invokeinterface #168 <Method boolean Iterator.hasNext()>
	//   36   79:ifeq            28
_L3:
		PdfName pdfname;
		pdfname = (PdfName)((Iterator) (obj)).next();
	//   37   82:aload           7
	//   38   84:invokeinterface #172 <Method Object Iterator.next()>
	//   39   89:checkcast       #149 <Class PdfName>
	//   40   92:astore          8
		if(pdfname.compareTo(PdfName.PARENT) != 0 && pdfname.compareTo(PdfName.P) != 0 && (!pdfdictionary.isStream() || !pdfdictionary1.isStream() || !pdfname.equals(((Object) (PdfName.FILTER))) && !pdfname.equals(((Object) (PdfName.LENGTH)))))
	//*  41   94:aload           8
	//*  42   96:getstatic       #593 <Field PdfName PdfName.PARENT>
	//*  43   99:invokevirtual   #597 <Method int PdfName.compareTo(PdfName)>
	//*  44  102:ifeq            68
	//*  45  105:aload           8
	//*  46  107:getstatic       #600 <Field PdfName PdfName.P>
	//*  47  110:invokevirtual   #597 <Method int PdfName.compareTo(PdfName)>
	//*  48  113:ifeq            68
	//*  49  116:aload_1         
	//*  50  117:invokevirtual   #603 <Method boolean PdfDictionary.isStream()>
	//*  51  120:ifeq            152
	//*  52  123:aload_2         
	//*  53  124:invokevirtual   #603 <Method boolean PdfDictionary.isStream()>
	//*  54  127:ifeq            152
	//*  55  130:aload           8
	//*  56  132:getstatic       #606 <Field PdfName PdfName.FILTER>
	//*  57  135:invokevirtual   #609 <Method boolean PdfName.equals(Object)>
	//*  58  138:ifne            68
	//*  59  141:aload           8
	//*  60  143:getstatic       #612 <Field PdfName PdfName.LENGTH>
	//*  61  146:invokevirtual   #609 <Method boolean PdfName.equals(Object)>
	//*  62  149:ifne            68
		{
label0:
			{
				if(pdfname.compareTo(PdfName.BASEFONT) != 0 && pdfname.compareTo(PdfName.FONTNAME) != 0)
					break label0;
	//   63  152:aload           8
	//   64  154:getstatic       #615 <Field PdfName PdfName.BASEFONT>
	//   65  157:invokevirtual   #597 <Method int PdfName.compareTo(PdfName)>
	//   66  160:ifeq            174
	//   67  163:aload           8
	//   68  165:getstatic       #618 <Field PdfName PdfName.FONTNAME>
	//   69  168:invokevirtual   #597 <Method int PdfName.compareTo(PdfName)>
	//   70  171:ifne            382
				PdfObject pdfobject = pdfdictionary1.getDirectObject(pdfname);
	//   71  174:aload_2         
	//   72  175:aload           8
	//   73  177:invokevirtual   #619 <Method PdfObject PdfDictionary.getDirectObject(PdfName)>
	//   74  180:astore          9
				if(!pdfobject.isName() || pdfobject.toString().indexOf('+') <= 0)
					break label0;
	//   75  182:aload           9
	//   76  184:invokevirtual   #622 <Method boolean PdfObject.isName()>
	//   77  187:ifeq            382
	//   78  190:aload           9
	//   79  192:invokevirtual   #623 <Method String PdfObject.toString()>
	//   80  195:bipush          43
	//   81  197:invokevirtual   #627 <Method int String.indexOf(int)>
	//   82  200:ifle            382
				PdfObject pdfobject1 = pdfdictionary.getDirectObject(pdfname);
	//   83  203:aload_1         
	//   84  204:aload           8
	//   85  206:invokevirtual   #619 <Method PdfObject PdfDictionary.getDirectObject(PdfName)>
	//   86  209:astore          10
				if(!pdfobject1.isName() || pdfobject1.toString().indexOf('+') == -1)
	//*  87  211:aload           10
	//*  88  213:invokevirtual   #622 <Method boolean PdfObject.isName()>
	//*  89  216:ifeq            233
	//*  90  219:aload           10
	//*  91  221:invokevirtual   #623 <Method String PdfObject.toString()>
	//*  92  224:bipush          43
	//*  93  226:invokevirtual   #627 <Method int String.indexOf(int)>
	//*  94  229:iconst_m1       
	//*  95  230:icmpne          285
				{
					if(compareresult != null && objectpath != null)
	//*  96  233:aload           4
	//*  97  235:ifnull          282
	//*  98  238:aload_3         
	//*  99  239:ifnull          282
						compareresult.addError(objectpath, String.format("PdfDictionary %s entry: Expected: %s. Found: %s", new Object[] {
							pdfname.toString(), pdfobject.toString(), pdfobject1.toString()
						}));
	//  100  242:aload           4
	//  101  244:aload_3         
	//  102  245:ldc2            #629 <String "PdfDictionary %s entry: Expected: %s. Found: %s">
	//  103  248:iconst_3        
	//  104  249:anewarray       Object[]
	//  105  252:dup             
	//  106  253:iconst_0        
	//  107  254:aload           8
	//  108  256:invokevirtual   #630 <Method String PdfName.toString()>
	//  109  259:aastore         
	//  110  260:dup             
	//  111  261:iconst_1        
	//  112  262:aload           9
	//  113  264:invokevirtual   #623 <Method String PdfObject.toString()>
	//  114  267:aastore         
	//  115  268:dup             
	//  116  269:iconst_2        
	//  117  270:aload           10
	//  118  272:invokevirtual   #623 <Method String PdfObject.toString()>
	//  119  275:aastore         
	//  120  276:invokestatic    #465 <Method String String.format(String, Object[])>
	//  121  279:invokevirtual   #456 <Method void CompareTool$CompareResult.addError(CompareTool$ObjectPath, String)>
					flag = false;
	//  122  282:iconst_0        
	//  123  283:istore          5
				}
				if(!pdfobject.toString().substring(pdfobject.toString().indexOf('+')).equals(((Object) (pdfobject1.toString().substring(pdfobject1.toString().indexOf('+'))))))
	//* 124  285:aload           9
	//* 125  287:invokevirtual   #623 <Method String PdfObject.toString()>
	//* 126  290:aload           9
	//* 127  292:invokevirtual   #623 <Method String PdfObject.toString()>
	//* 128  295:bipush          43
	//* 129  297:invokevirtual   #627 <Method int String.indexOf(int)>
	//* 130  300:invokevirtual   #633 <Method String String.substring(int)>
	//* 131  303:aload           10
	//* 132  305:invokevirtual   #623 <Method String PdfObject.toString()>
	//* 133  308:aload           10
	//* 134  310:invokevirtual   #623 <Method String PdfObject.toString()>
	//* 135  313:bipush          43
	//* 136  315:invokevirtual   #627 <Method int String.indexOf(int)>
	//* 137  318:invokevirtual   #633 <Method String String.substring(int)>
	//* 138  321:invokevirtual   #634 <Method boolean String.equals(Object)>
	//* 139  324:ifne            68
				{
					if(compareresult != null && objectpath != null)
	//* 140  327:aload           4
	//* 141  329:ifnull          376
	//* 142  332:aload_3         
	//* 143  333:ifnull          376
						compareresult.addError(objectpath, String.format("PdfDictionary %s entry: Expected: %s. Found: %s", new Object[] {
							pdfname.toString(), pdfobject.toString(), pdfobject1.toString()
						}));
	//  144  336:aload           4
	//  145  338:aload_3         
	//  146  339:ldc2            #629 <String "PdfDictionary %s entry: Expected: %s. Found: %s">
	//  147  342:iconst_3        
	//  148  343:anewarray       Object[]
	//  149  346:dup             
	//  150  347:iconst_0        
	//  151  348:aload           8
	//  152  350:invokevirtual   #630 <Method String PdfName.toString()>
	//  153  353:aastore         
	//  154  354:dup             
	//  155  355:iconst_1        
	//  156  356:aload           9
	//  157  358:invokevirtual   #623 <Method String PdfObject.toString()>
	//  158  361:aastore         
	//  159  362:dup             
	//  160  363:iconst_2        
	//  161  364:aload           10
	//  162  366:invokevirtual   #623 <Method String PdfObject.toString()>
	//  163  369:aastore         
	//  164  370:invokestatic    #465 <Method String String.format(String, Object[])>
	//  165  373:invokevirtual   #456 <Method void CompareTool$CompareResult.addError(CompareTool$ObjectPath, String)>
					flag = false;
	//  166  376:iconst_0        
	//  167  377:istore          5
				}
			}
		}
		  goto _L5
	//* 168  379:goto            68
label1:
		{
			if(floatComparisonError == 0.0D || !pdfdictionary1.isPage() || !pdfdictionary.isPage() || !pdfname.equals(((Object) (PdfName.CONTENTS))))
				break label1;
	//  169  382:aload_0         
	//  170  383:getfield        #108 <Field double floatComparisonError>
	//  171  386:dconst_0        
	//  172  387:dcmpl           
	//  173  388:ifeq            464
	//  174  391:aload_2         
	//  175  392:invokevirtual   #179 <Method boolean PdfDictionary.isPage()>
	//  176  395:ifeq            464
	//  177  398:aload_1         
	//  178  399:invokevirtual   #179 <Method boolean PdfDictionary.isPage()>
	//  179  402:ifeq            464
	//  180  405:aload           8
	//  181  407:getstatic       #637 <Field PdfName PdfName.CONTENTS>
	//  182  410:invokevirtual   #609 <Method boolean PdfName.equals(Object)>
	//  183  413:ifeq            464
			if(!compareContentStreamsByParsingExtended(pdfdictionary.getDirectObject(pdfname), pdfdictionary1.getDirectObject(pdfname), (PdfDictionary)pdfdictionary.getDirectObject(PdfName.RESOURCES), (PdfDictionary)pdfdictionary1.getDirectObject(PdfName.RESOURCES), objectpath, compareresult))
	//* 184  416:aload_0         
	//* 185  417:aload_1         
	//* 186  418:aload           8
	//* 187  420:invokevirtual   #619 <Method PdfObject PdfDictionary.getDirectObject(PdfName)>
	//* 188  423:aload_2         
	//* 189  424:aload           8
	//* 190  426:invokevirtual   #619 <Method PdfObject PdfDictionary.getDirectObject(PdfName)>
	//* 191  429:aload_1         
	//* 192  430:getstatic       #566 <Field PdfName PdfName.RESOURCES>
	//* 193  433:invokevirtual   #619 <Method PdfObject PdfDictionary.getDirectObject(PdfName)>
	//* 194  436:checkcast       #143 <Class PdfDictionary>
	//* 195  439:aload_2         
	//* 196  440:getstatic       #566 <Field PdfName PdfName.RESOURCES>
	//* 197  443:invokevirtual   #619 <Method PdfObject PdfDictionary.getDirectObject(PdfName)>
	//* 198  446:checkcast       #143 <Class PdfDictionary>
	//* 199  449:aload_3         
	//* 200  450:aload           4
	//* 201  452:invokespecial   #510 <Method boolean compareContentStreamsByParsingExtended(PdfObject, PdfObject, PdfDictionary, PdfDictionary, CompareTool$ObjectPath, CompareTool$CompareResult)>
	//* 202  455:ifne            68
				flag = false;
	//  203  458:iconst_0        
	//  204  459:istore          5
		}
		  goto _L5
	//* 205  461:goto            68
		if(objectpath != null)
	//* 206  464:aload_3         
	//* 207  465:ifnull          477
			objectpath.pushDictItemToPath(pdfname.toString());
	//  208  468:aload_3         
	//  209  469:aload           8
	//  210  471:invokevirtual   #630 <Method String PdfName.toString()>
	//  211  474:invokevirtual   #640 <Method void CompareTool$ObjectPath.pushDictItemToPath(String)>
		boolean flag2;
		if(compareObjects(pdfdictionary.get(pdfname), pdfdictionary1.get(pdfname), objectpath, compareresult) && flag)
	//* 212  477:aload_0         
	//* 213  478:aload_1         
	//* 214  479:aload           8
	//* 215  481:invokevirtual   #642 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 216  484:aload_2         
	//* 217  485:aload           8
	//* 218  487:invokevirtual   #642 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 219  490:aload_3         
	//* 220  491:aload           4
	//* 221  493:invokespecial   #476 <Method boolean compareObjects(PdfObject, PdfObject, CompareTool$ObjectPath, CompareTool$CompareResult)>
	//* 222  496:ifeq            547
	//* 223  499:iload           5
	//* 224  501:ifeq            547
			flag2 = true;
	//  225  504:iconst_1        
	//  226  505:istore          6
		else
	//* 227  507:aload_3         
	//* 228  508:ifnull          515
	//* 229  511:aload_3         
	//* 230  512:invokevirtual   #479 <Method void CompareTool$ObjectPath.pop()>
	//* 231  515:iload           6
	//* 232  517:istore          5
	//* 233  519:iload           6
	//* 234  521:ifne            68
	//* 235  524:aload_3         
	//* 236  525:ifnull          545
	//* 237  528:aload           4
	//* 238  530:ifnull          545
	//* 239  533:iload           6
	//* 240  535:istore          5
	//* 241  537:aload           4
	//* 242  539:invokevirtual   #482 <Method boolean CompareTool$CompareResult.isMessageLimitReached()>
	//* 243  542:ifeq            68
	//* 244  545:iconst_0        
	//* 245  546:ireturn         
			flag2 = false;
	//  246  547:iconst_0        
	//  247  548:istore          6
		if(objectpath != null)
			objectpath.pop();
		flag = flag2;
		if(flag2) goto _L5; else goto _L6
_L6:
		if(objectpath == null || compareresult == null)
			break; /* Loop/switch isn't completed */
		flag = flag2;
		if(!compareresult.isMessageLimitReached()) goto _L5; else goto _L7
_L7:
		return false;
	//* 248  550:goto            507
	}

	private boolean compareInlineImagesExtended(PdfContentParser pdfcontentparser, PdfContentParser pdfcontentparser1, PdfDictionary pdfdictionary, PdfDictionary pdfdictionary1, ObjectPath objectpath, CompareResult compareresult)
		throws IOException
	{
		pdfcontentparser1 = ((PdfContentParser) (InlineImageUtils.parseInlineImage(pdfcontentparser1, pdfdictionary1)));
	//    0    0:aload_2         
	//    1    1:aload           4
	//    2    3:invokestatic    #648 <Method InlineImageInfo InlineImageUtils.parseInlineImage(PdfContentParser, PdfDictionary)>
	//    3    6:astore_2        
		pdfcontentparser = ((PdfContentParser) (InlineImageUtils.parseInlineImage(pdfcontentparser, pdfdictionary)));
	//    4    7:aload_1         
	//    5    8:aload_3         
	//    6    9:invokestatic    #648 <Method InlineImageInfo InlineImageUtils.parseInlineImage(PdfContentParser, PdfDictionary)>
	//    7   12:astore_1        
		return compareObjects(((PdfObject) (((InlineImageInfo) (pdfcontentparser)).getImageDictionary())), ((PdfObject) (((InlineImageInfo) (pdfcontentparser1)).getImageDictionary())), objectpath, compareresult) && Arrays.equals(((InlineImageInfo) (pdfcontentparser)).getSamples(), ((InlineImageInfo) (pdfcontentparser1)).getSamples());
	//    8   13:aload_0         
	//    9   14:aload_1         
	//   10   15:invokevirtual   #654 <Method PdfDictionary InlineImageInfo.getImageDictionary()>
	//   11   18:aload_2         
	//   12   19:invokevirtual   #654 <Method PdfDictionary InlineImageInfo.getImageDictionary()>
	//   13   22:aload           5
	//   14   24:aload           6
	//   15   26:invokespecial   #476 <Method boolean compareObjects(PdfObject, PdfObject, CompareTool$ObjectPath, CompareTool$CompareResult)>
	//   16   29:ifeq            48
	//   17   32:aload_1         
	//   18   33:invokevirtual   #658 <Method byte[] InlineImageInfo.getSamples()>
	//   19   36:aload_2         
	//   20   37:invokevirtual   #658 <Method byte[] InlineImageInfo.getSamples()>
	//   21   40:invokestatic    #661 <Method boolean Arrays.equals(byte[], byte[])>
	//   22   43:ifeq            48
	//   23   46:iconst_1        
	//   24   47:ireturn         
	//   25   48:iconst_0        
	//   26   49:ireturn         
	}

	private boolean compareLiteralsExtended(PdfLiteral pdfliteral, PdfLiteral pdfliteral1, ObjectPath objectpath, CompareResult compareresult)
	{
		if(compareLiterals(pdfliteral, pdfliteral1))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:aload_2         
	//*   3    3:invokevirtual   #561 <Method boolean compareLiterals(PdfLiteral, PdfLiteral)>
	//*   4    6:ifeq            11
			return true;
	//    5    9:iconst_1        
	//    6   10:ireturn         
		if(compareresult != null && objectpath != null)
	//*   7   11:aload           4
	//*   8   13:ifnull          44
	//*   9   16:aload_3         
	//*  10   17:ifnull          44
			compareresult.addError(objectpath, String.format("PdfLiteral. Expected: %s. Found: %s", new Object[] {
				pdfliteral1, pdfliteral
			}));
	//   11   20:aload           4
	//   12   22:aload_3         
	//   13   23:ldc2            #665 <String "PdfLiteral. Expected: %s. Found: %s">
	//   14   26:iconst_2        
	//   15   27:anewarray       Object[]
	//   16   30:dup             
	//   17   31:iconst_0        
	//   18   32:aload_2         
	//   19   33:aastore         
	//   20   34:dup             
	//   21   35:iconst_1        
	//   22   36:aload_1         
	//   23   37:aastore         
	//   24   38:invokestatic    #465 <Method String String.format(String, Object[])>
	//   25   41:invokevirtual   #456 <Method void CompareTool$CompareResult.addError(CompareTool$ObjectPath, String)>
		return false;
	//   26   44:iconst_0        
	//   27   45:ireturn         
	}

	private boolean compareNamesExtended(PdfName pdfname, PdfName pdfname1, ObjectPath objectpath, CompareResult compareresult)
	{
		if(pdfname1.compareTo(pdfname) == 0)
	//*   0    0:aload_2         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #597 <Method int PdfName.compareTo(PdfName)>
	//*   3    5:ifne            10
			return true;
	//    4    8:iconst_1        
	//    5    9:ireturn         
		if(compareresult != null && objectpath != null)
	//*   6   10:aload           4
	//*   7   12:ifnull          49
	//*   8   15:aload_3         
	//*   9   16:ifnull          49
			compareresult.addError(objectpath, String.format("PdfName. Expected: %s. Found: %s", new Object[] {
				pdfname1.toString(), pdfname.toString()
			}));
	//   10   19:aload           4
	//   11   21:aload_3         
	//   12   22:ldc2            #669 <String "PdfName. Expected: %s. Found: %s">
	//   13   25:iconst_2        
	//   14   26:anewarray       Object[]
	//   15   29:dup             
	//   16   30:iconst_0        
	//   17   31:aload_2         
	//   18   32:invokevirtual   #630 <Method String PdfName.toString()>
	//   19   35:aastore         
	//   20   36:dup             
	//   21   37:iconst_1        
	//   22   38:aload_1         
	//   23   39:invokevirtual   #630 <Method String PdfName.toString()>
	//   24   42:aastore         
	//   25   43:invokestatic    #465 <Method String String.format(String, Object[])>
	//   26   46:invokevirtual   #456 <Method void CompareTool$CompareResult.addError(CompareTool$ObjectPath, String)>
		return false;
	//   27   49:iconst_0        
	//   28   50:ireturn         
	}

	private boolean compareNumbersExtended(PdfNumber pdfnumber, PdfNumber pdfnumber1, ObjectPath objectpath, CompareResult compareresult)
	{
		if(compareNumbers(pdfnumber, pdfnumber1))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:aload_2         
	//*   3    3:invokevirtual   #675 <Method boolean compareNumbers(PdfNumber, PdfNumber)>
	//*   4    6:ifeq            11
			return true;
	//    5    9:iconst_1        
	//    6   10:ireturn         
		if(compareresult != null && objectpath != null)
	//*   7   11:aload           4
	//*   8   13:ifnull          44
	//*   9   16:aload_3         
	//*  10   17:ifnull          44
			compareresult.addError(objectpath, String.format("PdfNumber. Expected: %s. Found: %s", new Object[] {
				pdfnumber1, pdfnumber
			}));
	//   11   20:aload           4
	//   12   22:aload_3         
	//   13   23:ldc2            #677 <String "PdfNumber. Expected: %s. Found: %s">
	//   14   26:iconst_2        
	//   15   27:anewarray       Object[]
	//   16   30:dup             
	//   17   31:iconst_0        
	//   18   32:aload_2         
	//   19   33:aastore         
	//   20   34:dup             
	//   21   35:iconst_1        
	//   22   36:aload_1         
	//   23   37:aastore         
	//   24   38:invokestatic    #465 <Method String String.format(String, Object[])>
	//   25   41:invokevirtual   #456 <Method void CompareTool$CompareResult.addError(CompareTool$ObjectPath, String)>
		return false;
	//   26   44:iconst_0        
	//   27   45:ireturn         
	}

	private boolean compareObjects(PdfObject pdfobject, PdfObject pdfobject1, ObjectPath objectpath, CompareResult compareresult)
		throws IOException
	{
label0:
		{
			PdfObject pdfobject2 = PdfReader.getPdfObject(pdfobject);
	//    0    0:aload_1         
	//    1    1:invokestatic    #141 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//    2    4:astore          6
			PdfObject pdfobject3 = PdfReader.getPdfObject(pdfobject1);
	//    3    6:aload_2         
	//    4    7:invokestatic    #141 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//    5   10:astore          7
			if(pdfobject3 == null && pdfobject2 == null)
	//*   6   12:aload           7
	//*   7   14:ifnonnull       24
	//*   8   17:aload           6
	//*   9   19:ifnonnull       24
				return true;
	//   10   22:iconst_1        
	//   11   23:ireturn         
			if(pdfobject2 == null)
	//*  12   24:aload           6
	//*  13   26:ifnonnull       40
			{
				compareresult.addError(objectpath, "Expected object was not found.");
	//   14   29:aload           4
	//   15   31:aload_3         
	//   16   32:ldc2            #679 <String "Expected object was not found.">
	//   17   35:invokevirtual   #456 <Method void CompareTool$CompareResult.addError(CompareTool$ObjectPath, String)>
				return false;
	//   18   38:iconst_0        
	//   19   39:ireturn         
			}
			if(pdfobject3 == null)
	//*  20   40:aload           7
	//*  21   42:ifnonnull       56
			{
				compareresult.addError(objectpath, "Found object which was not expected to be found.");
	//   22   45:aload           4
	//   23   47:aload_3         
	//   24   48:ldc2            #681 <String "Found object which was not expected to be found.">
	//   25   51:invokevirtual   #456 <Method void CompareTool$CompareResult.addError(CompareTool$ObjectPath, String)>
				return false;
	//   26   54:iconst_0        
	//   27   55:ireturn         
			}
			if(pdfobject3.type() != pdfobject2.type())
	//*  28   56:aload           7
	//*  29   58:invokevirtual   #501 <Method int PdfObject.type()>
	//*  30   61:aload           6
	//*  31   63:invokevirtual   #501 <Method int PdfObject.type()>
	//*  32   66:icmpeq          109
			{
				compareresult.addError(objectpath, String.format("Types do not match. Expected: %s. Found: %s.", new Object[] {
					((Object) (pdfobject3)).getClass().getSimpleName(), ((Object) (pdfobject2)).getClass().getSimpleName()
				}));
	//   33   69:aload           4
	//   34   71:aload_3         
	//   35   72:ldc2            #683 <String "Types do not match. Expected: %s. Found: %s.">
	//   36   75:iconst_2        
	//   37   76:anewarray       Object[]
	//   38   79:dup             
	//   39   80:iconst_0        
	//   40   81:aload           7
	//   41   83:invokevirtual   #328 <Method Class Object.getClass()>
	//   42   86:invokevirtual   #688 <Method String Class.getSimpleName()>
	//   43   89:aastore         
	//   44   90:dup             
	//   45   91:iconst_1        
	//   46   92:aload           6
	//   47   94:invokevirtual   #328 <Method Class Object.getClass()>
	//   48   97:invokevirtual   #688 <Method String Class.getSimpleName()>
	//   49  100:aastore         
	//   50  101:invokestatic    #465 <Method String String.format(String, Object[])>
	//   51  104:invokevirtual   #456 <Method void CompareTool$CompareResult.addError(CompareTool$ObjectPath, String)>
				return false;
	//   52  107:iconst_0        
	//   53  108:ireturn         
			}
			ObjectPath objectpath1 = objectpath;
	//   54  109:aload_3         
	//   55  110:astore          5
			if(pdfobject1.isIndirect())
	//*  56  112:aload_2         
	//*  57  113:invokevirtual   #691 <Method boolean PdfObject.isIndirect()>
	//*  58  116:ifeq            188
			{
				objectpath1 = objectpath;
	//   59  119:aload_3         
	//   60  120:astore          5
				if(pdfobject.isIndirect())
	//*  61  122:aload_1         
	//*  62  123:invokevirtual   #691 <Method boolean PdfObject.isIndirect()>
	//*  63  126:ifeq            188
				{
					if(objectpath.isComparing(new RefKey((PdfIndirectReference)pdfobject1), new RefKey((PdfIndirectReference)pdfobject)))
	//*  64  129:aload_3         
	//*  65  130:new             #187 <Class RefKey>
	//*  66  133:dup             
	//*  67  134:aload_2         
	//*  68  135:checkcast       #693 <Class PdfIndirectReference>
	//*  69  138:invokespecial   #192 <Method void RefKey(PdfIndirectReference)>
	//*  70  141:new             #187 <Class RefKey>
	//*  71  144:dup             
	//*  72  145:aload_1         
	//*  73  146:checkcast       #693 <Class PdfIndirectReference>
	//*  74  149:invokespecial   #192 <Method void RefKey(PdfIndirectReference)>
	//*  75  152:invokevirtual   #697 <Method boolean CompareTool$ObjectPath.isComparing(RefKey, RefKey)>
	//*  76  155:ifeq            160
						return true;
	//   77  158:iconst_1        
	//   78  159:ireturn         
					objectpath1 = objectpath.resetDirectPath(new RefKey((PdfIndirectReference)pdfobject1), new RefKey((PdfIndirectReference)pdfobject));
	//   79  160:aload_3         
	//   80  161:new             #187 <Class RefKey>
	//   81  164:dup             
	//   82  165:aload_2         
	//   83  166:checkcast       #693 <Class PdfIndirectReference>
	//   84  169:invokespecial   #192 <Method void RefKey(PdfIndirectReference)>
	//   85  172:new             #187 <Class RefKey>
	//   86  175:dup             
	//   87  176:aload_1         
	//   88  177:checkcast       #693 <Class PdfIndirectReference>
	//   89  180:invokespecial   #192 <Method void RefKey(PdfIndirectReference)>
	//   90  183:invokevirtual   #701 <Method CompareTool$ObjectPath CompareTool$ObjectPath.resetDirectPath(RefKey, RefKey)>
	//   91  186:astore          5
				}
			}
			if(pdfobject3.isDictionary() && ((PdfDictionary)pdfobject3).isPage())
	//*  92  188:aload           7
	//*  93  190:invokevirtual   #704 <Method boolean PdfObject.isDictionary()>
	//*  94  193:ifeq            371
	//*  95  196:aload           7
	//*  96  198:checkcast       #143 <Class PdfDictionary>
	//*  97  201:invokevirtual   #179 <Method boolean PdfDictionary.isPage()>
	//*  98  204:ifeq            371
			{
				if(!pdfobject2.isDictionary() || !((PdfDictionary)pdfobject2).isPage())
	//*  99  207:aload           6
	//* 100  209:invokevirtual   #704 <Method boolean PdfObject.isDictionary()>
	//* 101  212:ifeq            226
	//* 102  215:aload           6
	//* 103  217:checkcast       #143 <Class PdfDictionary>
	//* 104  220:invokevirtual   #179 <Method boolean PdfDictionary.isPage()>
	//* 105  223:ifne            248
				{
					if(compareresult != null && objectpath1 != null)
	//* 106  226:aload           4
	//* 107  228:ifnull          246
	//* 108  231:aload           5
	//* 109  233:ifnull          246
						compareresult.addError(objectpath1, "Expected a page. Found not a page.");
	//  110  236:aload           4
	//  111  238:aload           5
	//  112  240:ldc2            #706 <String "Expected a page. Found not a page.">
	//  113  243:invokevirtual   #456 <Method void CompareTool$CompareResult.addError(CompareTool$ObjectPath, String)>
					return false;
	//  114  246:iconst_0        
	//  115  247:ireturn         
				}
				pdfobject1 = ((PdfObject) (new RefKey(((PdfIndirectReference) ((PRIndirectReference)pdfobject1)))));
	//  116  248:new             #187 <Class RefKey>
	//  117  251:dup             
	//  118  252:aload_2         
	//  119  253:checkcast       #189 <Class PRIndirectReference>
	//  120  256:invokespecial   #192 <Method void RefKey(PdfIndirectReference)>
	//  121  259:astore_2        
				pdfobject = ((PdfObject) (new RefKey(((PdfIndirectReference) ((PRIndirectReference)pdfobject)))));
	//  122  260:new             #187 <Class RefKey>
	//  123  263:dup             
	//  124  264:aload_1         
	//  125  265:checkcast       #189 <Class PRIndirectReference>
	//  126  268:invokespecial   #192 <Method void RefKey(PdfIndirectReference)>
	//  127  271:astore_1        
				if(cmpPagesRef.contains(((Object) (pdfobject1))) && cmpPagesRef.indexOf(((Object) (pdfobject1))) == outPagesRef.indexOf(((Object) (pdfobject))))
	//* 128  272:aload_0         
	//* 129  273:getfield        #708 <Field List cmpPagesRef>
	//* 130  276:aload_2         
	//* 131  277:invokeinterface #401 <Method boolean List.contains(Object)>
	//* 132  282:ifeq            310
	//* 133  285:aload_0         
	//* 134  286:getfield        #708 <Field List cmpPagesRef>
	//* 135  289:aload_2         
	//* 136  290:invokeinterface #711 <Method int List.indexOf(Object)>
	//* 137  295:aload_0         
	//* 138  296:getfield        #713 <Field List outPagesRef>
	//* 139  299:aload_1         
	//* 140  300:invokeinterface #711 <Method int List.indexOf(Object)>
	//* 141  305:icmpne          310
					return true;
	//  142  308:iconst_1        
	//  143  309:ireturn         
				if(compareresult != null && objectpath1 != null)
	//* 144  310:aload           4
	//* 145  312:ifnull          369
	//* 146  315:aload           5
	//* 147  317:ifnull          369
					compareresult.addError(objectpath1, String.format("The dictionaries refer to different pages. Expected page number: %s. Found: %s", new Object[] {
						Integer.valueOf(cmpPagesRef.indexOf(((Object) (pdfobject1)))), Integer.valueOf(outPagesRef.indexOf(((Object) (pdfobject))))
					}));
	//  148  320:aload           4
	//  149  322:aload           5
	//  150  324:ldc2            #715 <String "The dictionaries refer to different pages. Expected page number: %s. Found: %s">
	//  151  327:iconst_2        
	//  152  328:anewarray       Object[]
	//  153  331:dup             
	//  154  332:iconst_0        
	//  155  333:aload_0         
	//  156  334:getfield        #708 <Field List cmpPagesRef>
	//  157  337:aload_2         
	//  158  338:invokeinterface #711 <Method int List.indexOf(Object)>
	//  159  343:invokestatic    #398 <Method Integer Integer.valueOf(int)>
	//  160  346:aastore         
	//  161  347:dup             
	//  162  348:iconst_1        
	//  163  349:aload_0         
	//  164  350:getfield        #713 <Field List outPagesRef>
	//  165  353:aload_1         
	//  166  354:invokeinterface #711 <Method int List.indexOf(Object)>
	//  167  359:invokestatic    #398 <Method Integer Integer.valueOf(int)>
	//  168  362:aastore         
	//  169  363:invokestatic    #465 <Method String String.format(String, Object[])>
	//  170  366:invokevirtual   #456 <Method void CompareTool$CompareResult.addError(CompareTool$ObjectPath, String)>
				return false;
	//  171  369:iconst_0        
	//  172  370:ireturn         
			}
			if(pdfobject3.isDictionary())
	//* 173  371:aload           7
	//* 174  373:invokevirtual   #704 <Method boolean PdfObject.isDictionary()>
	//* 175  376:ifeq            402
			{
				if(!compareDictionariesExtended((PdfDictionary)pdfobject2, (PdfDictionary)pdfobject3, objectpath1, compareresult))
	//* 176  379:aload_0         
	//* 177  380:aload           6
	//* 178  382:checkcast       #143 <Class PdfDictionary>
	//* 179  385:aload           7
	//* 180  387:checkcast       #143 <Class PdfDictionary>
	//* 181  390:aload           5
	//* 182  392:aload           4
	//* 183  394:invokespecial   #717 <Method boolean compareDictionariesExtended(PdfDictionary, PdfDictionary, CompareTool$ObjectPath, CompareTool$CompareResult)>
	//* 184  397:ifne            635
					return false;
	//  185  400:iconst_0        
	//  186  401:ireturn         
			} else
			if(pdfobject3.isStream())
	//* 187  402:aload           7
	//* 188  404:invokevirtual   #718 <Method boolean PdfObject.isStream()>
	//* 189  407:ifeq            433
			{
				if(!compareStreamsExtended((PRStream)pdfobject2, (PRStream)pdfobject3, objectpath1, compareresult))
	//* 190  410:aload_0         
	//* 191  411:aload           6
	//* 192  413:checkcast       #563 <Class PRStream>
	//* 193  416:aload           7
	//* 194  418:checkcast       #563 <Class PRStream>
	//* 195  421:aload           5
	//* 196  423:aload           4
	//* 197  425:invokespecial   #722 <Method boolean compareStreamsExtended(PRStream, PRStream, CompareTool$ObjectPath, CompareTool$CompareResult)>
	//* 198  428:ifne            635
					return false;
	//  199  431:iconst_0        
	//  200  432:ireturn         
			} else
			if(pdfobject3.isArray())
	//* 201  433:aload           7
	//* 202  435:invokevirtual   #506 <Method boolean PdfObject.isArray()>
	//* 203  438:ifeq            464
			{
				if(!compareArraysExtended((PdfArray)pdfobject2, (PdfArray)pdfobject3, objectpath1, compareresult))
	//* 204  441:aload_0         
	//* 205  442:aload           6
	//* 206  444:checkcast       #159 <Class PdfArray>
	//* 207  447:aload           7
	//* 208  449:checkcast       #159 <Class PdfArray>
	//* 209  452:aload           5
	//* 210  454:aload           4
	//* 211  456:invokespecial   #724 <Method boolean compareArraysExtended(PdfArray, PdfArray, CompareTool$ObjectPath, CompareTool$CompareResult)>
	//* 212  459:ifne            635
					return false;
	//  213  462:iconst_0        
	//  214  463:ireturn         
			} else
			if(pdfobject3.isName())
	//* 215  464:aload           7
	//* 216  466:invokevirtual   #622 <Method boolean PdfObject.isName()>
	//* 217  469:ifeq            495
			{
				if(!compareNamesExtended((PdfName)pdfobject2, (PdfName)pdfobject3, objectpath1, compareresult))
	//* 218  472:aload_0         
	//* 219  473:aload           6
	//* 220  475:checkcast       #149 <Class PdfName>
	//* 221  478:aload           7
	//* 222  480:checkcast       #149 <Class PdfName>
	//* 223  483:aload           5
	//* 224  485:aload           4
	//* 225  487:invokespecial   #726 <Method boolean compareNamesExtended(PdfName, PdfName, CompareTool$ObjectPath, CompareTool$CompareResult)>
	//* 226  490:ifne            635
					return false;
	//  227  493:iconst_0        
	//  228  494:ireturn         
			} else
			if(pdfobject3.isNumber())
	//* 229  495:aload           7
	//* 230  497:invokevirtual   #729 <Method boolean PdfObject.isNumber()>
	//* 231  500:ifeq            526
			{
				if(!compareNumbersExtended((PdfNumber)pdfobject2, (PdfNumber)pdfobject3, objectpath1, compareresult))
	//* 232  503:aload_0         
	//* 233  504:aload           6
	//* 234  506:checkcast       #731 <Class PdfNumber>
	//* 235  509:aload           7
	//* 236  511:checkcast       #731 <Class PdfNumber>
	//* 237  514:aload           5
	//* 238  516:aload           4
	//* 239  518:invokespecial   #733 <Method boolean compareNumbersExtended(PdfNumber, PdfNumber, CompareTool$ObjectPath, CompareTool$CompareResult)>
	//* 240  521:ifne            635
					return false;
	//  241  524:iconst_0        
	//  242  525:ireturn         
			} else
			if(pdfobject3.isString())
	//* 243  526:aload           7
	//* 244  528:invokevirtual   #736 <Method boolean PdfObject.isString()>
	//* 245  531:ifeq            557
			{
				if(!compareStringsExtended((PdfString)pdfobject2, (PdfString)pdfobject3, objectpath1, compareresult))
	//* 246  534:aload_0         
	//* 247  535:aload           6
	//* 248  537:checkcast       #738 <Class PdfString>
	//* 249  540:aload           7
	//* 250  542:checkcast       #738 <Class PdfString>
	//* 251  545:aload           5
	//* 252  547:aload           4
	//* 253  549:invokespecial   #742 <Method boolean compareStringsExtended(PdfString, PdfString, CompareTool$ObjectPath, CompareTool$CompareResult)>
	//* 254  552:ifne            635
					return false;
	//  255  555:iconst_0        
	//  256  556:ireturn         
			} else
			if(pdfobject3.isBoolean())
	//* 257  557:aload           7
	//* 258  559:invokevirtual   #745 <Method boolean PdfObject.isBoolean()>
	//* 259  562:ifeq            588
			{
				if(!compareBooleansExtended((PdfBoolean)pdfobject2, (PdfBoolean)pdfobject3, objectpath1, compareresult))
	//* 260  565:aload_0         
	//* 261  566:aload           6
	//* 262  568:checkcast       #486 <Class PdfBoolean>
	//* 263  571:aload           7
	//* 264  573:checkcast       #486 <Class PdfBoolean>
	//* 265  576:aload           5
	//* 266  578:aload           4
	//* 267  580:invokespecial   #747 <Method boolean compareBooleansExtended(PdfBoolean, PdfBoolean, CompareTool$ObjectPath, CompareTool$CompareResult)>
	//* 268  583:ifne            635
					return false;
	//  269  586:iconst_0        
	//  270  587:ireturn         
			} else
			if(pdfobject3 instanceof PdfLiteral)
	//* 271  588:aload           7
	//* 272  590:instanceof      #554 <Class PdfLiteral>
	//* 273  593:ifeq            619
			{
				if(!compareLiteralsExtended((PdfLiteral)pdfobject2, (PdfLiteral)pdfobject3, objectpath1, compareresult))
	//* 274  596:aload_0         
	//* 275  597:aload           6
	//* 276  599:checkcast       #554 <Class PdfLiteral>
	//* 277  602:aload           7
	//* 278  604:checkcast       #554 <Class PdfLiteral>
	//* 279  607:aload           5
	//* 280  609:aload           4
	//* 281  611:invokespecial   #749 <Method boolean compareLiteralsExtended(PdfLiteral, PdfLiteral, CompareTool$ObjectPath, CompareTool$CompareResult)>
	//* 282  614:ifne            635
					return false;
	//  283  617:iconst_0        
	//  284  618:ireturn         
			} else
			if(!pdfobject2.isNull() || !pdfobject3.isNull())
				break label0;
	//  285  619:aload           6
	//  286  621:invokevirtual   #752 <Method boolean PdfObject.isNull()>
	//  287  624:ifeq            637
	//  288  627:aload           7
	//  289  629:invokevirtual   #752 <Method boolean PdfObject.isNull()>
	//  290  632:ifeq            637
			return true;
	//  291  635:iconst_1        
	//  292  636:ireturn         
		}
		throw new UnsupportedOperationException();
	//  293  637:new             #754 <Class UnsupportedOperationException>
	//  294  640:dup             
	//  295  641:invokespecial   #755 <Method void UnsupportedOperationException()>
	//  296  644:athrow          
	}

	private boolean compareStreams(InputStream inputstream, InputStream inputstream1)
		throws IOException
	{
		byte abyte0[] = new byte[0x10000];
	//    0    0:ldc2            #756 <Int 0x10000>
	//    1    3:newarray        byte[]
	//    2    5:astore          4
		byte abyte1[] = new byte[0x10000];
	//    3    7:ldc2            #756 <Int 0x10000>
	//    4   10:newarray        byte[]
	//    5   12:astore          5
		int i;
		do
			for(i = inputstream.read(abyte0); i != inputstream1.read(abyte1) || !Arrays.equals(abyte0, abyte1);)
	//*   6   14:aload_1         
	//*   7   15:aload           4
	//*   8   17:invokevirtual   #762 <Method int InputStream.read(byte[])>
	//*   9   20:istore_3        
	//*  10   21:iload_3         
	//*  11   22:aload_2         
	//*  12   23:aload           5
	//*  13   25:invokevirtual   #762 <Method int InputStream.read(byte[])>
	//*  14   28:icmpeq          33
				return false;
	//   15   31:iconst_0        
	//   16   32:ireturn         

	//   17   33:aload           4
	//   18   35:aload           5
	//   19   37:invokestatic    #661 <Method boolean Arrays.equals(byte[], byte[])>
	//   20   40:ifeq            31
		while(i != -1);
	//   21   43:iload_3         
	//   22   44:iconst_m1       
	//   23   45:icmpne          14
		return true;
	//   24   48:iconst_1        
	//   25   49:ireturn         
	}

	private boolean compareStreamsExtended(PRStream prstream, PRStream prstream1, ObjectPath objectpath, CompareResult compareresult)
		throws IOException
	{
		boolean flag = PdfName.FLATEDECODE.equals(((Object) (prstream.get(PdfName.FILTER))));
	//    0    0:getstatic       #765 <Field PdfName PdfName.FLATEDECODE>
	//    1    3:aload_1         
	//    2    4:getstatic       #606 <Field PdfName PdfName.FILTER>
	//    3    7:invokevirtual   #766 <Method PdfObject PRStream.get(PdfName)>
	//    4   10:invokevirtual   #609 <Method boolean PdfName.equals(Object)>
	//    5   13:istore          8
		byte abyte3[] = PdfReader.getStreamBytesRaw(prstream);
	//    6   15:aload_1         
	//    7   16:invokestatic    #770 <Method byte[] PdfReader.getStreamBytesRaw(PRStream)>
	//    8   19:astore          12
		byte abyte2[] = PdfReader.getStreamBytesRaw(prstream1);
	//    9   21:aload_2         
	//   10   22:invokestatic    #770 <Method byte[] PdfReader.getStreamBytesRaw(PRStream)>
	//   11   25:astore          11
		byte abyte1[] = abyte2;
	//   12   27:aload           11
	//   13   29:astore          10
		byte abyte0[] = abyte3;
	//   14   31:aload           12
	//   15   33:astore          9
		if(flag)
	//*  16   35:iload           8
	//*  17   37:ifeq            56
		{
			abyte0 = PdfReader.decodeBytes(abyte3, ((PdfDictionary) (prstream)));
	//   18   40:aload           12
	//   19   42:aload_1         
	//   20   43:invokestatic    #774 <Method byte[] PdfReader.decodeBytes(byte[], PdfDictionary)>
	//   21   46:astore          9
			abyte1 = PdfReader.decodeBytes(abyte2, ((PdfDictionary) (prstream1)));
	//   22   48:aload           11
	//   23   50:aload_2         
	//   24   51:invokestatic    #774 <Method byte[] PdfReader.decodeBytes(byte[], PdfDictionary)>
	//   25   54:astore          10
		}
		if(floatComparisonError != 0.0D && PdfName.XOBJECT.equals(((Object) (prstream1.getDirectObject(PdfName.TYPE)))) && PdfName.XOBJECT.equals(((Object) (prstream.getDirectObject(PdfName.TYPE)))) && PdfName.FORM.equals(((Object) (prstream1.getDirectObject(PdfName.SUBTYPE)))) && PdfName.FORM.equals(((Object) (prstream.getDirectObject(PdfName.SUBTYPE)))))
	//*  26   56:aload_0         
	//*  27   57:getfield        #108 <Field double floatComparisonError>
	//*  28   60:dconst_0        
	//*  29   61:dcmpl           
	//*  30   62:ifeq            171
	//*  31   65:getstatic       #777 <Field PdfName PdfName.XOBJECT>
	//*  32   68:aload_2         
	//*  33   69:getstatic       #780 <Field PdfName PdfName.TYPE>
	//*  34   72:invokevirtual   #570 <Method PdfObject PRStream.getDirectObject(PdfName)>
	//*  35   75:invokevirtual   #609 <Method boolean PdfName.equals(Object)>
	//*  36   78:ifeq            171
	//*  37   81:getstatic       #777 <Field PdfName PdfName.XOBJECT>
	//*  38   84:aload_1         
	//*  39   85:getstatic       #780 <Field PdfName PdfName.TYPE>
	//*  40   88:invokevirtual   #570 <Method PdfObject PRStream.getDirectObject(PdfName)>
	//*  41   91:invokevirtual   #609 <Method boolean PdfName.equals(Object)>
	//*  42   94:ifeq            171
	//*  43   97:getstatic       #783 <Field PdfName PdfName.FORM>
	//*  44  100:aload_2         
	//*  45  101:getstatic       #786 <Field PdfName PdfName.SUBTYPE>
	//*  46  104:invokevirtual   #570 <Method PdfObject PRStream.getDirectObject(PdfName)>
	//*  47  107:invokevirtual   #609 <Method boolean PdfName.equals(Object)>
	//*  48  110:ifeq            171
	//*  49  113:getstatic       #783 <Field PdfName PdfName.FORM>
	//*  50  116:aload_1         
	//*  51  117:getstatic       #786 <Field PdfName PdfName.SUBTYPE>
	//*  52  120:invokevirtual   #570 <Method PdfObject PRStream.getDirectObject(PdfName)>
	//*  53  123:invokevirtual   #609 <Method boolean PdfName.equals(Object)>
	//*  54  126:ifeq            171
			return compareContentStreamsByParsingExtended(((PdfObject) (prstream)), ((PdfObject) (prstream1)), prstream.getAsDict(PdfName.RESOURCES), prstream1.getAsDict(PdfName.RESOURCES), objectpath, compareresult) && compareDictionariesExtended(((PdfDictionary) (prstream)), ((PdfDictionary) (prstream1)), objectpath, compareresult);
	//   55  129:aload_0         
	//   56  130:aload_1         
	//   57  131:aload_2         
	//   58  132:aload_1         
	//   59  133:getstatic       #566 <Field PdfName PdfName.RESOURCES>
	//   60  136:invokevirtual   #790 <Method PdfDictionary PRStream.getAsDict(PdfName)>
	//   61  139:aload_2         
	//   62  140:getstatic       #566 <Field PdfName PdfName.RESOURCES>
	//   63  143:invokevirtual   #790 <Method PdfDictionary PRStream.getAsDict(PdfName)>
	//   64  146:aload_3         
	//   65  147:aload           4
	//   66  149:invokespecial   #510 <Method boolean compareContentStreamsByParsingExtended(PdfObject, PdfObject, PdfDictionary, PdfDictionary, CompareTool$ObjectPath, CompareTool$CompareResult)>
	//   67  152:ifeq            169
	//   68  155:aload_0         
	//   69  156:aload_1         
	//   70  157:aload_2         
	//   71  158:aload_3         
	//   72  159:aload           4
	//   73  161:invokespecial   #717 <Method boolean compareDictionariesExtended(PdfDictionary, PdfDictionary, CompareTool$ObjectPath, CompareTool$CompareResult)>
	//   74  164:ifeq            169
	//   75  167:iconst_1        
	//   76  168:ireturn         
	//   77  169:iconst_0        
	//   78  170:ireturn         
		if(Arrays.equals(abyte0, abyte1))
	//*  79  171:aload           9
	//*  80  173:aload           10
	//*  81  175:invokestatic    #661 <Method boolean Arrays.equals(byte[], byte[])>
	//*  82  178:ifeq            191
			return compareDictionariesExtended(((PdfDictionary) (prstream)), ((PdfDictionary) (prstream1)), objectpath, compareresult);
	//   83  181:aload_0         
	//   84  182:aload_1         
	//   85  183:aload_2         
	//   86  184:aload_3         
	//   87  185:aload           4
	//   88  187:invokespecial   #717 <Method boolean compareDictionariesExtended(PdfDictionary, PdfDictionary, CompareTool$ObjectPath, CompareTool$CompareResult)>
	//   89  190:ireturn         
		if(abyte1.length != abyte0.length)
	//*  90  191:aload           10
	//*  91  193:arraylength     
	//*  92  194:aload           9
	//*  93  196:arraylength     
	//*  94  197:icmpeq          245
		{
			if(compareresult != null && objectpath != null)
	//*  95  200:aload           4
	//*  96  202:ifnull          243
	//*  97  205:aload_3         
	//*  98  206:ifnull          243
				compareresult.addError(objectpath, String.format("PRStream. Lengths are different. Expected: %s. Found: %s", new Object[] {
					Integer.valueOf(abyte1.length), Integer.valueOf(abyte0.length)
				}));
	//   99  209:aload           4
	//  100  211:aload_3         
	//  101  212:ldc2            #792 <String "PRStream. Lengths are different. Expected: %s. Found: %s">
	//  102  215:iconst_2        
	//  103  216:anewarray       Object[]
	//  104  219:dup             
	//  105  220:iconst_0        
	//  106  221:aload           10
	//  107  223:arraylength     
	//  108  224:invokestatic    #398 <Method Integer Integer.valueOf(int)>
	//  109  227:aastore         
	//  110  228:dup             
	//  111  229:iconst_1        
	//  112  230:aload           9
	//  113  232:arraylength     
	//  114  233:invokestatic    #398 <Method Integer Integer.valueOf(int)>
	//  115  236:aastore         
	//  116  237:invokestatic    #465 <Method String String.format(String, Object[])>
	//  117  240:invokevirtual   #456 <Method void CompareTool$CompareResult.addError(CompareTool$ObjectPath, String)>
		} else
	//* 118  243:iconst_0        
	//* 119  244:ireturn         
		{
			int i = 0;
	//  120  245:iconst_0        
	//  121  246:istore          5
			while(i < abyte1.length) 
	//* 122  248:iload           5
	//* 123  250:aload           10
	//* 124  252:arraylength     
	//* 125  253:icmpge          243
			{
				if(abyte1[i] != abyte0[i])
	//* 126  256:aload           10
	//* 127  258:iload           5
	//* 128  260:baload          
	//* 129  261:aload           9
	//* 130  263:iload           5
	//* 131  265:baload          
	//* 132  266:icmpeq          434
				{
					int j = Math.max(0, i - 10);
	//  133  269:iconst_0        
	//  134  270:iload           5
	//  135  272:bipush          10
	//  136  274:isub            
	//  137  275:invokestatic    #795 <Method int Math.max(int, int)>
	//  138  278:istore          6
					int k = Math.min(abyte1.length, i + 10);
	//  139  280:aload           10
	//  140  282:arraylength     
	//  141  283:iload           5
	//  142  285:bipush          10
	//  143  287:iadd            
	//  144  288:invokestatic    #385 <Method int Math.min(int, int)>
	//  145  291:istore          7
					if(compareresult != null && objectpath != null)
	//* 146  293:aload           4
	//* 147  295:ifnull          434
	//* 148  298:aload_3         
	//* 149  299:ifnull          434
					{
						objectpath.pushOffsetToPath(i);
	//  150  302:aload_3         
	//  151  303:iload           5
	//  152  305:invokevirtual   #798 <Method void CompareTool$ObjectPath.pushOffsetToPath(int)>
						compareresult.addError(objectpath, String.format("PRStream. The bytes differ at index %s. Expected: %s (%s). Found: %s (%s)", new Object[] {
							Integer.valueOf(i), new String(new byte[] {
								abyte1[i]
							}), (new String(abyte1, j, k - j)).replaceAll("\\n", "\\\\n"), new String(new byte[] {
								abyte0[i]
							}), (new String(abyte0, j, k - j)).replaceAll("\\n", "\\\\n")
						}));
	//  153  308:aload           4
	//  154  310:aload_3         
	//  155  311:ldc2            #800 <String "PRStream. The bytes differ at index %s. Expected: %s (%s). Found: %s (%s)">
	//  156  314:iconst_5        
	//  157  315:anewarray       Object[]
	//  158  318:dup             
	//  159  319:iconst_0        
	//  160  320:iload           5
	//  161  322:invokestatic    #398 <Method Integer Integer.valueOf(int)>
	//  162  325:aastore         
	//  163  326:dup             
	//  164  327:iconst_1        
	//  165  328:new             #235 <Class String>
	//  166  331:dup             
	//  167  332:iconst_1        
	//  168  333:newarray        byte[]
	//  169  335:dup             
	//  170  336:iconst_0        
	//  171  337:aload           10
	//  172  339:iload           5
	//  173  341:baload          
	//  174  342:bastore         
	//  175  343:invokespecial   #803 <Method void String(byte[])>
	//  176  346:aastore         
	//  177  347:dup             
	//  178  348:iconst_2        
	//  179  349:new             #235 <Class String>
	//  180  352:dup             
	//  181  353:aload           10
	//  182  355:iload           6
	//  183  357:iload           7
	//  184  359:iload           6
	//  185  361:isub            
	//  186  362:invokespecial   #806 <Method void String(byte[], int, int)>
	//  187  365:ldc2            #808 <String "\\n">
	//  188  368:ldc2            #810 <String "\\\\n">
	//  189  371:invokevirtual   #814 <Method String String.replaceAll(String, String)>
	//  190  374:aastore         
	//  191  375:dup             
	//  192  376:iconst_3        
	//  193  377:new             #235 <Class String>
	//  194  380:dup             
	//  195  381:iconst_1        
	//  196  382:newarray        byte[]
	//  197  384:dup             
	//  198  385:iconst_0        
	//  199  386:aload           9
	//  200  388:iload           5
	//  201  390:baload          
	//  202  391:bastore         
	//  203  392:invokespecial   #803 <Method void String(byte[])>
	//  204  395:aastore         
	//  205  396:dup             
	//  206  397:iconst_4        
	//  207  398:new             #235 <Class String>
	//  208  401:dup             
	//  209  402:aload           9
	//  210  404:iload           6
	//  211  406:iload           7
	//  212  408:iload           6
	//  213  410:isub            
	//  214  411:invokespecial   #806 <Method void String(byte[], int, int)>
	//  215  414:ldc2            #808 <String "\\n">
	//  216  417:ldc2            #810 <String "\\\\n">
	//  217  420:invokevirtual   #814 <Method String String.replaceAll(String, String)>
	//  218  423:aastore         
	//  219  424:invokestatic    #465 <Method String String.format(String, Object[])>
	//  220  427:invokevirtual   #456 <Method void CompareTool$CompareResult.addError(CompareTool$ObjectPath, String)>
						objectpath.pop();
	//  221  430:aload_3         
	//  222  431:invokevirtual   #479 <Method void CompareTool$ObjectPath.pop()>
					}
				}
				i++;
	//  223  434:iload           5
	//  224  436:iconst_1        
	//  225  437:iadd            
	//  226  438:istore          5
			}
		}
		return false;
	//* 227  440:goto            248
	}

	private boolean compareStringsExtended(PdfString pdfstring, PdfString pdfstring1, ObjectPath objectpath, CompareResult compareresult)
	{
		if(Arrays.equals(pdfstring1.getBytes(), pdfstring.getBytes()))
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #817 <Method byte[] PdfString.getBytes()>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #817 <Method byte[] PdfString.getBytes()>
	//*   4    8:invokestatic    #661 <Method boolean Arrays.equals(byte[], byte[])>
	//*   5   11:ifeq            16
			return true;
	//    6   14:iconst_1        
	//    7   15:ireturn         
		pdfstring1 = ((PdfString) (pdfstring1.toUnicodeString()));
	//    8   16:aload_2         
	//    9   17:invokevirtual   #820 <Method String PdfString.toUnicodeString()>
	//   10   20:astore_2        
		pdfstring = ((PdfString) (pdfstring.toUnicodeString()));
	//   11   21:aload_1         
	//   12   22:invokevirtual   #820 <Method String PdfString.toUnicodeString()>
	//   13   25:astore_1        
		if(((String) (pdfstring1)).length() == ((String) (pdfstring)).length()) goto _L2; else goto _L1
	//   14   26:aload_2         
	//   15   27:invokevirtual   #823 <Method int String.length()>
	//   16   30:aload_1         
	//   17   31:invokevirtual   #823 <Method int String.length()>
	//   18   34:icmpeq          84
_L1:
		if(compareresult != null && objectpath != null)
	//*  19   37:aload           4
	//*  20   39:ifnull          82
	//*  21   42:aload_3         
	//*  22   43:ifnull          82
			compareresult.addError(objectpath, String.format("PdfString. Lengths are different. Expected: %s. Found: %s", new Object[] {
				Integer.valueOf(((String) (pdfstring1)).length()), Integer.valueOf(((String) (pdfstring)).length())
			}));
	//   23   46:aload           4
	//   24   48:aload_3         
	//   25   49:ldc2            #825 <String "PdfString. Lengths are different. Expected: %s. Found: %s">
	//   26   52:iconst_2        
	//   27   53:anewarray       Object[]
	//   28   56:dup             
	//   29   57:iconst_0        
	//   30   58:aload_2         
	//   31   59:invokevirtual   #823 <Method int String.length()>
	//   32   62:invokestatic    #398 <Method Integer Integer.valueOf(int)>
	//   33   65:aastore         
	//   34   66:dup             
	//   35   67:iconst_1        
	//   36   68:aload_1         
	//   37   69:invokevirtual   #823 <Method int String.length()>
	//   38   72:invokestatic    #398 <Method Integer Integer.valueOf(int)>
	//   39   75:aastore         
	//   40   76:invokestatic    #465 <Method String String.format(String, Object[])>
	//   41   79:invokevirtual   #456 <Method void CompareTool$CompareResult.addError(CompareTool$ObjectPath, String)>
_L4:
		return false;
	//   42   82:iconst_0        
	//   43   83:ireturn         
_L2:
		int i = 0;
	//   44   84:iconst_0        
	//   45   85:istore          5
		do
		{
			if(i < ((String) (pdfstring1)).length())
	//*  46   87:iload           5
	//*  47   89:aload_2         
	//*  48   90:invokevirtual   #823 <Method int String.length()>
	//*  49   93:icmpge          82
			{
label0:
				{
					if(((String) (pdfstring1)).charAt(i) == ((String) (pdfstring)).charAt(i))
						break label0;
	//   50   96:aload_2         
	//   51   97:iload           5
	//   52   99:invokevirtual   #829 <Method char String.charAt(int)>
	//   53  102:aload_1         
	//   54  103:iload           5
	//   55  105:invokevirtual   #829 <Method char String.charAt(int)>
	//   56  108:icmpeq          246
					int j = Math.max(0, i - 10);
	//   57  111:iconst_0        
	//   58  112:iload           5
	//   59  114:bipush          10
	//   60  116:isub            
	//   61  117:invokestatic    #795 <Method int Math.max(int, int)>
	//   62  120:istore          6
					int k = Math.min(((String) (pdfstring1)).length(), i + 10);
	//   63  122:aload_2         
	//   64  123:invokevirtual   #823 <Method int String.length()>
	//   65  126:iload           5
	//   66  128:bipush          10
	//   67  130:iadd            
	//   68  131:invokestatic    #385 <Method int Math.min(int, int)>
	//   69  134:istore          7
					if(compareresult != null && objectpath != null)
	//*  70  136:aload           4
	//*  71  138:ifnull          82
	//*  72  141:aload_3         
	//*  73  142:ifnull          82
					{
						objectpath.pushOffsetToPath(i);
	//   74  145:aload_3         
	//   75  146:iload           5
	//   76  148:invokevirtual   #798 <Method void CompareTool$ObjectPath.pushOffsetToPath(int)>
						compareresult.addError(objectpath, String.format("PdfString. Characters differ at position %s. Expected: %s (%s). Found: %s (%s).", new Object[] {
							Integer.valueOf(i), Character.toString(((String) (pdfstring1)).charAt(i)), ((String) (pdfstring1)).substring(j, k).replace("\n", "\\n"), Character.toString(((String) (pdfstring)).charAt(i)), ((String) (pdfstring)).substring(j, k).replace("\n", "\\n")
						}));
	//   77  151:aload           4
	//   78  153:aload_3         
	//   79  154:ldc2            #831 <String "PdfString. Characters differ at position %s. Expected: %s (%s). Found: %s (%s).">
	//   80  157:iconst_5        
	//   81  158:anewarray       Object[]
	//   82  161:dup             
	//   83  162:iconst_0        
	//   84  163:iload           5
	//   85  165:invokestatic    #398 <Method Integer Integer.valueOf(int)>
	//   86  168:aastore         
	//   87  169:dup             
	//   88  170:iconst_1        
	//   89  171:aload_2         
	//   90  172:iload           5
	//   91  174:invokevirtual   #829 <Method char String.charAt(int)>
	//   92  177:invokestatic    #836 <Method String Character.toString(char)>
	//   93  180:aastore         
	//   94  181:dup             
	//   95  182:iconst_2        
	//   96  183:aload_2         
	//   97  184:iload           6
	//   98  186:iload           7
	//   99  188:invokevirtual   #839 <Method String String.substring(int, int)>
	//  100  191:ldc2            #841 <String "\n">
	//  101  194:ldc2            #808 <String "\\n">
	//  102  197:invokevirtual   #336 <Method String String.replace(CharSequence, CharSequence)>
	//  103  200:aastore         
	//  104  201:dup             
	//  105  202:iconst_3        
	//  106  203:aload_1         
	//  107  204:iload           5
	//  108  206:invokevirtual   #829 <Method char String.charAt(int)>
	//  109  209:invokestatic    #836 <Method String Character.toString(char)>
	//  110  212:aastore         
	//  111  213:dup             
	//  112  214:iconst_4        
	//  113  215:aload_1         
	//  114  216:iload           6
	//  115  218:iload           7
	//  116  220:invokevirtual   #839 <Method String String.substring(int, int)>
	//  117  223:ldc2            #841 <String "\n">
	//  118  226:ldc2            #808 <String "\\n">
	//  119  229:invokevirtual   #336 <Method String String.replace(CharSequence, CharSequence)>
	//  120  232:aastore         
	//  121  233:invokestatic    #465 <Method String String.format(String, Object[])>
	//  122  236:invokevirtual   #456 <Method void CompareTool$CompareResult.addError(CompareTool$ObjectPath, String)>
						objectpath.pop();
	//  123  239:aload_3         
	//  124  240:invokevirtual   #479 <Method void CompareTool$ObjectPath.pop()>
					}
				}
			}
			if(true)
				continue;
	//  125  243:goto            82
			i++;
	//  126  246:iload           5
	//  127  248:iconst_1        
	//  128  249:iadd            
	//  129  250:istore          5
		} while(true);
	//  130  252:goto            87
		if(true) goto _L4; else goto _L3
_L3:
	}

	private String[] convertInfo(HashMap hashmap)
	{
		String as[] = new String[4];
	//    0    0:iconst_4        
	//    1    1:anewarray       String[]
	//    2    4:astore_2        
		as[0] = "";
	//    3    5:aload_2         
	//    4    6:iconst_0        
	//    5    7:ldc2            #845 <String "">
	//    6   10:aastore         
		as[1] = "";
	//    7   11:aload_2         
	//    8   12:iconst_1        
	//    9   13:ldc2            #845 <String "">
	//   10   16:aastore         
		as[2] = "";
	//   11   17:aload_2         
	//   12   18:iconst_2        
	//   13   19:ldc2            #845 <String "">
	//   14   22:aastore         
		as[3] = "";
	//   15   23:aload_2         
	//   16   24:iconst_3        
	//   17   25:ldc2            #845 <String "">
	//   18   28:aastore         
		hashmap = ((HashMap) (hashmap.entrySet().iterator()));
	//   19   29:aload_1         
	//   20   30:invokevirtual   #848 <Method Set HashMap.entrySet()>
	//   21   33:invokeinterface #270 <Method Iterator Set.iterator()>
	//   22   38:astore_1        
		do
		{
			if(!((Iterator) (hashmap)).hasNext())
				break;
	//   23   39:aload_1         
	//   24   40:invokeinterface #168 <Method boolean Iterator.hasNext()>
	//   25   45:ifeq            190
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (hashmap)).next();
	//   26   48:aload_1         
	//   27   49:invokeinterface #172 <Method Object Iterator.next()>
	//   28   54:checkcast       #272 <Class java.util.Map$Entry>
	//   29   57:astore_3        
			if("title".equalsIgnoreCase((String)entry.getKey()))
	//*  30   58:ldc2            #850 <String "title">
	//*  31   61:aload_3         
	//*  32   62:invokeinterface #275 <Method Object java.util.Map$Entry.getKey()>
	//*  33   67:checkcast       #235 <Class String>
	//*  34   70:invokevirtual   #853 <Method boolean String.equalsIgnoreCase(String)>
	//*  35   73:ifeq            91
				as[0] = (String)entry.getValue();
	//   36   76:aload_2         
	//   37   77:iconst_0        
	//   38   78:aload_3         
	//   39   79:invokeinterface #284 <Method Object java.util.Map$Entry.getValue()>
	//   40   84:checkcast       #235 <Class String>
	//   41   87:aastore         
			else
	//*  42   88:goto            39
			if("author".equalsIgnoreCase((String)entry.getKey()))
	//*  43   91:ldc2            #855 <String "author">
	//*  44   94:aload_3         
	//*  45   95:invokeinterface #275 <Method Object java.util.Map$Entry.getKey()>
	//*  46  100:checkcast       #235 <Class String>
	//*  47  103:invokevirtual   #853 <Method boolean String.equalsIgnoreCase(String)>
	//*  48  106:ifeq            124
				as[1] = (String)entry.getValue();
	//   49  109:aload_2         
	//   50  110:iconst_1        
	//   51  111:aload_3         
	//   52  112:invokeinterface #284 <Method Object java.util.Map$Entry.getValue()>
	//   53  117:checkcast       #235 <Class String>
	//   54  120:aastore         
			else
	//*  55  121:goto            39
			if("subject".equalsIgnoreCase((String)entry.getKey()))
	//*  56  124:ldc2            #857 <String "subject">
	//*  57  127:aload_3         
	//*  58  128:invokeinterface #275 <Method Object java.util.Map$Entry.getKey()>
	//*  59  133:checkcast       #235 <Class String>
	//*  60  136:invokevirtual   #853 <Method boolean String.equalsIgnoreCase(String)>
	//*  61  139:ifeq            157
				as[2] = (String)entry.getValue();
	//   62  142:aload_2         
	//   63  143:iconst_2        
	//   64  144:aload_3         
	//   65  145:invokeinterface #284 <Method Object java.util.Map$Entry.getValue()>
	//   66  150:checkcast       #235 <Class String>
	//   67  153:aastore         
			else
	//*  68  154:goto            39
			if("keywords".equalsIgnoreCase((String)entry.getKey()))
	//*  69  157:ldc2            #859 <String "keywords">
	//*  70  160:aload_3         
	//*  71  161:invokeinterface #275 <Method Object java.util.Map$Entry.getKey()>
	//*  72  166:checkcast       #235 <Class String>
	//*  73  169:invokevirtual   #853 <Method boolean String.equalsIgnoreCase(String)>
	//*  74  172:ifeq            39
				as[3] = (String)entry.getValue();
	//   75  175:aload_2         
	//   76  176:iconst_3        
	//   77  177:aload_3         
	//   78  178:invokeinterface #284 <Method Object java.util.Map$Entry.getValue()>
	//   79  183:checkcast       #235 <Class String>
	//   80  186:aastore         
		} while(true);
	//   81  187:goto            39
		return as;
	//   82  190:aload_2         
	//   83  191:areturn         
	}

	private void init(String s, String s1)
	{
		outPdf = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #255 <Field String outPdf>
		cmpPdf = s1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #252 <Field String cmpPdf>
		outPdfName = (new File(s)).getName();
	//    6   10:aload_0         
	//    7   11:new             #209 <Class File>
	//    8   14:dup             
	//    9   15:aload_1         
	//   10   16:invokespecial   #212 <Method void File(String)>
	//   11   19:invokevirtual   #863 <Method String File.getName()>
	//   12   22:putfield        #130 <Field String outPdfName>
		cmpPdfName = (new File(s1)).getName();
	//   13   25:aload_0         
	//   14   26:new             #209 <Class File>
	//   15   29:dup             
	//   16   30:aload_2         
	//   17   31:invokespecial   #212 <Method void File(String)>
	//   18   34:invokevirtual   #863 <Method String File.getName()>
	//   19   37:putfield        #133 <Field String cmpPdfName>
		outImage = (new StringBuilder()).append(outPdfName).append("-%03d.png").toString();
	//   20   40:aload_0         
	//   21   41:new             #217 <Class StringBuilder>
	//   22   44:dup             
	//   23   45:invokespecial   #218 <Method void StringBuilder()>
	//   24   48:aload_0         
	//   25   49:getfield        #130 <Field String outPdfName>
	//   26   52:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//   27   55:ldc2            #865 <String "-%03d.png">
	//   28   58:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//   29   61:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   30   64:putfield        #379 <Field String outImage>
		if(cmpPdfName.startsWith("cmp_"))
	//*  31   67:aload_0         
	//*  32   68:getfield        #133 <Field String cmpPdfName>
	//*  33   71:ldc2            #867 <String "cmp_">
	//*  34   74:invokevirtual   #870 <Method boolean String.startsWith(String)>
	//*  35   77:ifeq            108
		{
			cmpImage = (new StringBuilder()).append(cmpPdfName).append("-%03d.png").toString();
	//   36   80:aload_0         
	//   37   81:new             #217 <Class StringBuilder>
	//   38   84:dup             
	//   39   85:invokespecial   #218 <Method void StringBuilder()>
	//   40   88:aload_0         
	//   41   89:getfield        #133 <Field String cmpPdfName>
	//   42   92:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//   43   95:ldc2            #865 <String "-%03d.png">
	//   44   98:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//   45  101:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   46  104:putfield        #332 <Field String cmpImage>
			return;
	//   47  107:return          
		} else
		{
			cmpImage = (new StringBuilder()).append("cmp_").append(cmpPdfName).append("-%03d.png").toString();
	//   48  108:aload_0         
	//   49  109:new             #217 <Class StringBuilder>
	//   50  112:dup             
	//   51  113:invokespecial   #218 <Method void StringBuilder()>
	//   52  116:ldc2            #867 <String "cmp_">
	//   53  119:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//   54  122:aload_0         
	//   55  123:getfield        #133 <Field String cmpPdfName>
	//   56  126:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//   57  129:ldc2            #865 <String "-%03d.png">
	//   58  132:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//   59  135:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   60  138:putfield        #332 <Field String cmpImage>
			return;
	//   61  141:return          
		}
	}

	private boolean linksAreSame(com.itextpdf.text.pdf.PdfAnnotation.PdfImportedLink pdfimportedlink, com.itextpdf.text.pdf.PdfAnnotation.PdfImportedLink pdfimportedlink1)
	{
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #877 <Method int com.itextpdf.text.pdf.PdfAnnotation$PdfImportedLink.getDestinationPage()>
	//*   2    4:aload_2         
	//*   3    5:invokevirtual   #877 <Method int com.itextpdf.text.pdf.PdfAnnotation$PdfImportedLink.getDestinationPage()>
	//*   4    8:icmpeq          13
_L2:
		return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		if(pdfimportedlink.getDestinationPage() != pdfimportedlink1.getDestinationPage() || !pdfimportedlink.getRect().toString().equals(((Object) (pdfimportedlink1.getRect().toString())))) goto _L2; else goto _L1
	//    7   13:aload_1         
	//    8   14:invokevirtual   #881 <Method PdfArray com.itextpdf.text.pdf.PdfAnnotation$PdfImportedLink.getRect()>
	//    9   17:invokevirtual   #882 <Method String PdfArray.toString()>
	//   10   20:aload_2         
	//   11   21:invokevirtual   #881 <Method PdfArray com.itextpdf.text.pdf.PdfAnnotation$PdfImportedLink.getRect()>
	//   12   24:invokevirtual   #882 <Method String PdfArray.toString()>
	//   13   27:invokevirtual   #634 <Method boolean String.equals(Object)>
	//   14   30:ifeq            11
_L1:
		Map map;
		map = pdfimportedlink.getParameters();
	//   15   33:aload_1         
	//   16   34:invokevirtual   #886 <Method Map com.itextpdf.text.pdf.PdfAnnotation$PdfImportedLink.getParameters()>
	//   17   37:astore_3        
		pdfimportedlink = ((com.itextpdf.text.pdf.PdfAnnotation.PdfImportedLink) (pdfimportedlink1.getParameters()));
	//   18   38:aload_2         
	//   19   39:invokevirtual   #886 <Method Map com.itextpdf.text.pdf.PdfAnnotation$PdfImportedLink.getParameters()>
	//   20   42:astore_1        
		if(map.size() != ((Map) (pdfimportedlink)).size()) goto _L4; else goto _L3
	//   21   43:aload_3         
	//   22   44:invokeinterface #887 <Method int Map.size()>
	//   23   49:aload_1         
	//   24   50:invokeinterface #887 <Method int Map.size()>
	//   25   55:icmpne          11
_L3:
		pdfimportedlink1 = ((com.itextpdf.text.pdf.PdfAnnotation.PdfImportedLink) (map.entrySet().iterator()));
	//   26   58:aload_3         
	//   27   59:invokeinterface #267 <Method Set Map.entrySet()>
	//   28   64:invokeinterface #270 <Method Iterator Set.iterator()>
	//   29   69:astore_2        
_L7:
		if(((Iterator) (pdfimportedlink1)).hasNext())
	//*  30   70:aload_2         
	//*  31   71:invokeinterface #168 <Method boolean Iterator.hasNext()>
	//*  32   76:ifeq            216
		{
			Object obj = ((Object) ((java.util.Map.Entry)((Iterator) (pdfimportedlink1)).next()));
	//   33   79:aload_2         
	//   34   80:invokeinterface #172 <Method Object Iterator.next()>
	//   35   85:checkcast       #272 <Class java.util.Map$Entry>
	//   36   88:astore          4
			PdfObject pdfobject = (PdfObject)((java.util.Map.Entry) (obj)).getValue();
	//   37   90:aload           4
	//   38   92:invokeinterface #284 <Method Object java.util.Map$Entry.getValue()>
	//   39   97:checkcast       #174 <Class PdfObject>
	//   40  100:astore_3        
			if(((Map) (pdfimportedlink)).containsKey(((java.util.Map.Entry) (obj)).getKey()))
	//*  41  101:aload_1         
	//*  42  102:aload           4
	//*  43  104:invokeinterface #275 <Method Object java.util.Map$Entry.getKey()>
	//*  44  109:invokeinterface #890 <Method boolean Map.containsKey(Object)>
	//*  45  114:ifeq            11
			{
				obj = ((Object) ((PdfObject)((Map) (pdfimportedlink)).get(((java.util.Map.Entry) (obj)).getKey())));
	//   46  117:aload_1         
	//   47  118:aload           4
	//   48  120:invokeinterface #275 <Method Object java.util.Map$Entry.getKey()>
	//   49  125:invokeinterface #893 <Method Object Map.get(Object)>
	//   50  130:checkcast       #174 <Class PdfObject>
	//   51  133:astore          4
				if(pdfobject.type() == ((PdfObject) (obj)).type())
	//*  52  135:aload_3         
	//*  53  136:invokevirtual   #501 <Method int PdfObject.type()>
	//*  54  139:aload           4
	//*  55  141:invokevirtual   #501 <Method int PdfObject.type()>
	//*  56  144:icmpne          11
				{
					switch(pdfobject.type())
	//*  57  147:aload_3         
	//*  58  148:invokevirtual   #501 <Method int PdfObject.type()>
					{
	//*  59  151:tableswitch     1 8: default 196
	//	               1 199
	//	               2 199
	//	               3 199
	//	               4 199
	//	               5 196
	//	               6 196
	//	               7 196
	//	               8 199
	//*  60  196:goto            70
					case 1: // '\001'
					case 2: // '\002'
					case 3: // '\003'
					case 4: // '\004'
					case 8: // '\b'
						if(!pdfobject.toString().equals(((Object) (((PdfObject) (obj)).toString()))))
	//*  61  199:aload_3         
	//*  62  200:invokevirtual   #623 <Method String PdfObject.toString()>
	//*  63  203:aload           4
	//*  64  205:invokevirtual   #623 <Method String PdfObject.toString()>
	//*  65  208:invokevirtual   #634 <Method boolean String.equals(Object)>
	//*  66  211:ifne            70
							return false;
	//   67  214:iconst_0        
	//   68  215:ireturn         
						break;
					}
					continue; /* Loop/switch isn't completed */
				}
			}
		} else
		{
			return true;
	//   69  216:iconst_1        
	//   70  217:ireturn         
		}
_L4:
		if(true) goto _L2; else goto _L5
_L5:
		if(true) goto _L7; else goto _L6
_L6:
	}

	private void loadPagesFromReader(PdfReader pdfreader, List list, List list1)
	{
		addPagesFromDict(pdfreader.getCatalog().get(PdfName.PAGES), list, list1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #898 <Method PdfDictionary PdfReader.getCatalog()>
	//    3    5:getstatic       #901 <Field PdfName PdfName.PAGES>
	//    4    8:invokevirtual   #642 <Method PdfObject PdfDictionary.get(PdfName)>
	//    5   11:aload_2         
	//    6   12:aload_3         
	//    7   13:invokespecial   #176 <Method void addPagesFromDict(PdfObject, List, List)>
	//    8   16:return          
	}

	private Process runProcess(String s, String s1)
		throws IOException, InterruptedException
	{
		s1 = ((String) (new StringTokenizer(s1)));
	//    0    0:new             #904 <Class StringTokenizer>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:invokespecial   #905 <Method void StringTokenizer(String)>
	//    4    8:astore_2        
		String as[] = new String[((StringTokenizer) (s1)).countTokens() + 1];
	//    5    9:aload_2         
	//    6   10:invokevirtual   #908 <Method int StringTokenizer.countTokens()>
	//    7   13:iconst_1        
	//    8   14:iadd            
	//    9   15:anewarray       String[]
	//   10   18:astore          4
		as[0] = s;
	//   11   20:aload           4
	//   12   22:iconst_0        
	//   13   23:aload_1         
	//   14   24:aastore         
		for(int i = 1; ((StringTokenizer) (s1)).hasMoreTokens(); i++)
	//*  15   25:iconst_1        
	//*  16   26:istore_3        
	//*  17   27:aload_2         
	//*  18   28:invokevirtual   #911 <Method boolean StringTokenizer.hasMoreTokens()>
	//*  19   31:ifeq            49
			as[i] = ((StringTokenizer) (s1)).nextToken();
	//   20   34:aload           4
	//   21   36:iload_3         
	//   22   37:aload_2         
	//   23   38:invokevirtual   #914 <Method String StringTokenizer.nextToken()>
	//   24   41:aastore         

	//   25   42:iload_3         
	//   26   43:iconst_1        
	//   27   44:iadd            
	//   28   45:istore_3        
	//*  29   46:goto            27
		return Runtime.getRuntime().exec(as);
	//   30   49:invokestatic    #920 <Method Runtime Runtime.getRuntime()>
	//   31   52:aload           4
	//   32   54:invokevirtual   #924 <Method Process Runtime.exec(String[])>
	//   33   57:areturn         
	}

	public String compare(String s, String s1, String s2, String s3)
		throws IOException, InterruptedException, DocumentException
	{
		return compare(s, s1, s2, s3, ((Map) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aconst_null     
	//    6    7:invokevirtual   #928 <Method String compare(String, String, String, String, Map)>
	//    7   10:areturn         
	}

	public String compare(String s, String s1, String s2, String s3, Map map)
		throws IOException, InterruptedException, DocumentException
	{
		init(s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #324 <Method void init(String, String)>
		return compare(s2, s3, map);
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:aload           5
	//    8   12:invokespecial   #930 <Method String compare(String, String, Map)>
	//    9   15:areturn         
	}

	public boolean compareArrays(PdfArray pdfarray, PdfArray pdfarray1)
		throws IOException
	{
		return compareArraysExtended(pdfarray, pdfarray1, ((ObjectPath) (null)), ((CompareResult) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:invokespecial   #724 <Method boolean compareArraysExtended(PdfArray, PdfArray, CompareTool$ObjectPath, CompareTool$CompareResult)>
	//    6    8:ireturn         
	}

	public boolean compareBooleans(PdfBoolean pdfboolean, PdfBoolean pdfboolean1)
	{
		return Arrays.equals(pdfboolean1.getBytes(), pdfboolean.getBytes());
	//    0    0:aload_2         
	//    1    1:invokevirtual   #936 <Method byte[] PdfBoolean.getBytes()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #936 <Method byte[] PdfBoolean.getBytes()>
	//    4    8:invokestatic    #661 <Method boolean Arrays.equals(byte[], byte[])>
	//    5   11:ireturn         
	}

	public String compareByContent(String s, String s1, String s2, String s3)
		throws DocumentException, InterruptedException, IOException
	{
		return compareByContent(s, s1, s2, s3, ((Map) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aconst_null     
	//    6    7:invokevirtual   #939 <Method String compareByContent(String, String, String, String, Map)>
	//    7   10:areturn         
	}

	public String compareByContent(String s, String s1, String s2, String s3, Map map)
		throws DocumentException, InterruptedException, IOException
	{
		init(s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #324 <Method void init(String, String)>
		return compareByContent(s2, s3, map);
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:aload           5
	//    8   12:invokevirtual   #941 <Method String compareByContent(String, String, Map)>
	//    9   15:areturn         
	}

	protected String compareByContent(String s, String s1, Map map)
		throws DocumentException, InterruptedException, IOException
	{
		PdfReader pdfreader;
		PdfReader pdfreader1;
		System.out.print("[itext] INFO  Comparing by content..........");
	//    0    0:getstatic       #368 <Field PrintStream System.out>
	//    1    3:ldc2            #945 <String "[itext] INFO  Comparing by content..........">
	//    2    6:invokevirtual   #413 <Method void PrintStream.print(String)>
		pdfreader = new PdfReader(outPdf);
	//    3    9:new             #137 <Class PdfReader>
	//    4   12:dup             
	//    5   13:aload_0         
	//    6   14:getfield        #255 <Field String outPdf>
	//    7   17:invokespecial   #253 <Method void PdfReader(String)>
	//    8   20:astore          9
		outPages = ((List) (new ArrayList()));
	//    9   22:aload_0         
	//   10   23:new             #540 <Class ArrayList>
	//   11   26:dup             
	//   12   27:invokespecial   #541 <Method void ArrayList()>
	//   13   30:putfield        #947 <Field List outPages>
		outPagesRef = ((List) (new ArrayList()));
	//   14   33:aload_0         
	//   15   34:new             #540 <Class ArrayList>
	//   16   37:dup             
	//   17   38:invokespecial   #541 <Method void ArrayList()>
	//   18   41:putfield        #713 <Field List outPagesRef>
		loadPagesFromReader(pdfreader, outPages, outPagesRef);
	//   19   44:aload_0         
	//   20   45:aload           9
	//   21   47:aload_0         
	//   22   48:getfield        #947 <Field List outPages>
	//   23   51:aload_0         
	//   24   52:getfield        #713 <Field List outPagesRef>
	//   25   55:invokespecial   #949 <Method void loadPagesFromReader(PdfReader, List, List)>
		pdfreader1 = new PdfReader(cmpPdf);
	//   26   58:new             #137 <Class PdfReader>
	//   27   61:dup             
	//   28   62:aload_0         
	//   29   63:getfield        #252 <Field String cmpPdf>
	//   30   66:invokespecial   #253 <Method void PdfReader(String)>
	//   31   69:astore          10
		cmpPages = ((List) (new ArrayList()));
	//   32   71:aload_0         
	//   33   72:new             #540 <Class ArrayList>
	//   34   75:dup             
	//   35   76:invokespecial   #541 <Method void ArrayList()>
	//   36   79:putfield        #951 <Field List cmpPages>
		cmpPagesRef = ((List) (new ArrayList()));
	//   37   82:aload_0         
	//   38   83:new             #540 <Class ArrayList>
	//   39   86:dup             
	//   40   87:invokespecial   #541 <Method void ArrayList()>
	//   41   90:putfield        #708 <Field List cmpPagesRef>
		loadPagesFromReader(pdfreader1, cmpPages, cmpPagesRef);
	//   42   93:aload_0         
	//   43   94:aload           10
	//   44   96:aload_0         
	//   45   97:getfield        #951 <Field List cmpPages>
	//   46  100:aload_0         
	//   47  101:getfield        #708 <Field List cmpPagesRef>
	//   48  104:invokespecial   #949 <Method void loadPagesFromReader(PdfReader, List, List)>
		if(outPages.size() == cmpPages.size()) goto _L2; else goto _L1
	//   49  107:aload_0         
	//   50  108:getfield        #947 <Field List outPages>
	//   51  111:invokeinterface #952 <Method int List.size()>
	//   52  116:aload_0         
	//   53  117:getfield        #951 <Field List cmpPages>
	//   54  120:invokeinterface #952 <Method int List.size()>
	//   55  125:icmpeq          138
_L1:
		s = compare(s, s1, map);
	//   56  128:aload_0         
	//   57  129:aload_1         
	//   58  130:aload_2         
	//   59  131:aload_3         
	//   60  132:invokespecial   #930 <Method String compare(String, String, Map)>
	//   61  135:astore_1        
_L4:
		return s;
	//   62  136:aload_1         
	//   63  137:areturn         
_L2:
		CompareResult compareresult = new CompareResult(compareByContentErrorsLimit);
	//   64  138:new             #17  <Class CompareTool$CompareResult>
	//   65  141:dup             
	//   66  142:aload_0         
	//   67  143:aload_0         
	//   68  144:getfield        #100 <Field int compareByContentErrorsLimit>
	//   69  147:invokespecial   #955 <Method void CompareTool$CompareResult(CompareTool, int)>
	//   70  150:astore          8
		ArrayList arraylist = new ArrayList(cmpPages.size());
	//   71  152:new             #540 <Class ArrayList>
	//   72  155:dup             
	//   73  156:aload_0         
	//   74  157:getfield        #951 <Field List cmpPages>
	//   75  160:invokeinterface #952 <Method int List.size()>
	//   76  165:invokespecial   #957 <Method void ArrayList(int)>
	//   77  168:astore          7
		for(int i = 0; i < cmpPages.size(); i++)
	//*  78  170:iconst_0        
	//*  79  171:istore          4
	//*  80  173:iload           4
	//*  81  175:aload_0         
	//*  82  176:getfield        #951 <Field List cmpPages>
	//*  83  179:invokeinterface #952 <Method int List.size()>
	//*  84  184:icmpge          286
		{
			ObjectPath objectpath = new ObjectPath((RefKey)cmpPagesRef.get(i), (RefKey)outPagesRef.get(i));
	//   85  187:new             #23  <Class CompareTool$ObjectPath>
	//   86  190:dup             
	//   87  191:aload_0         
	//   88  192:aload_0         
	//   89  193:getfield        #708 <Field List cmpPagesRef>
	//   90  196:iload           4
	//   91  198:invokeinterface #958 <Method Object List.get(int)>
	//   92  203:checkcast       #187 <Class RefKey>
	//   93  206:aload_0         
	//   94  207:getfield        #713 <Field List outPagesRef>
	//   95  210:iload           4
	//   96  212:invokeinterface #958 <Method Object List.get(int)>
	//   97  217:checkcast       #187 <Class RefKey>
	//   98  220:invokespecial   #961 <Method void CompareTool$ObjectPath(CompareTool, RefKey, RefKey)>
	//   99  223:astore          5
			if(compareDictionariesExtended((PdfDictionary)outPages.get(i), (PdfDictionary)cmpPages.get(i), objectpath, compareresult))
	//* 100  225:aload_0         
	//* 101  226:aload_0         
	//* 102  227:getfield        #947 <Field List outPages>
	//* 103  230:iload           4
	//* 104  232:invokeinterface #958 <Method Object List.get(int)>
	//* 105  237:checkcast       #143 <Class PdfDictionary>
	//* 106  240:aload_0         
	//* 107  241:getfield        #951 <Field List cmpPages>
	//* 108  244:iload           4
	//* 109  246:invokeinterface #958 <Method Object List.get(int)>
	//* 110  251:checkcast       #143 <Class PdfDictionary>
	//* 111  254:aload           5
	//* 112  256:aload           8
	//* 113  258:invokespecial   #717 <Method boolean compareDictionariesExtended(PdfDictionary, PdfDictionary, CompareTool$ObjectPath, CompareTool$CompareResult)>
	//* 114  261:ifeq            277
				((List) (arraylist)).add(((Object) (Integer.valueOf(i))));
	//  115  264:aload           7
	//  116  266:iload           4
	//  117  268:invokestatic    #398 <Method Integer Integer.valueOf(int)>
	//  118  271:invokeinterface #185 <Method boolean List.add(Object)>
	//  119  276:pop             
		}

	//  120  277:iload           4
	//  121  279:iconst_1        
	//  122  280:iadd            
	//  123  281:istore          4
	//* 124  283:goto            173
		PdfObject pdfobject = pdfreader.getCatalog().get(PdfName.STRUCTTREEROOT);
	//  125  286:aload           9
	//  126  288:invokevirtual   #898 <Method PdfDictionary PdfReader.getCatalog()>
	//  127  291:getstatic       #964 <Field PdfName PdfName.STRUCTTREEROOT>
	//  128  294:invokevirtual   #642 <Method PdfObject PdfDictionary.get(PdfName)>
	//  129  297:astore          11
		PdfObject pdfobject1 = pdfreader1.getCatalog().get(PdfName.STRUCTTREEROOT);
	//  130  299:aload           10
	//  131  301:invokevirtual   #898 <Method PdfDictionary PdfReader.getCatalog()>
	//  132  304:getstatic       #964 <Field PdfName PdfName.STRUCTTREEROOT>
	//  133  307:invokevirtual   #642 <Method PdfObject PdfDictionary.get(PdfName)>
	//  134  310:astore          12
		Object obj;
		RefKey refkey;
		if(pdfobject == null)
	//* 135  312:aload           11
	//* 136  314:ifnonnull       549
			obj = null;
	//  137  317:aconst_null     
	//  138  318:astore          5
		else
	//* 139  320:aload           12
	//* 140  322:ifnonnull       566
	//* 141  325:aconst_null     
	//* 142  326:astore          6
	//* 143  328:aload_0         
	//* 144  329:aload           11
	//* 145  331:aload           12
	//* 146  333:new             #23  <Class CompareTool$ObjectPath>
	//* 147  336:dup             
	//* 148  337:aload_0         
	//* 149  338:aload           5
	//* 150  340:aload           6
	//* 151  342:invokespecial   #961 <Method void CompareTool$ObjectPath(CompareTool, RefKey, RefKey)>
	//* 152  345:aload           8
	//* 153  347:invokespecial   #476 <Method boolean compareObjects(PdfObject, PdfObject, CompareTool$ObjectPath, CompareTool$CompareResult)>
	//* 154  350:pop             
	//* 155  351:aload           9
	//* 156  353:invokevirtual   #898 <Method PdfDictionary PdfReader.getCatalog()>
	//* 157  356:getstatic       #967 <Field PdfName PdfName.OCPROPERTIES>
	//* 158  359:invokevirtual   #642 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 159  362:astore          11
	//* 160  364:aload           10
	//* 161  366:invokevirtual   #898 <Method PdfDictionary PdfReader.getCatalog()>
	//* 162  369:getstatic       #967 <Field PdfName PdfName.OCPROPERTIES>
	//* 163  372:invokevirtual   #642 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 164  375:astore          12
	//* 165  377:aload           11
	//* 166  379:instanceof      #693 <Class PdfIndirectReference>
	//* 167  382:ifeq            583
	//* 168  385:new             #187 <Class RefKey>
	//* 169  388:dup             
	//* 170  389:aload           11
	//* 171  391:checkcast       #693 <Class PdfIndirectReference>
	//* 172  394:invokespecial   #192 <Method void RefKey(PdfIndirectReference)>
	//* 173  397:astore          5
	//* 174  399:aload           12
	//* 175  401:instanceof      #693 <Class PdfIndirectReference>
	//* 176  404:ifeq            589
	//* 177  407:new             #187 <Class RefKey>
	//* 178  410:dup             
	//* 179  411:aload           12
	//* 180  413:checkcast       #693 <Class PdfIndirectReference>
	//* 181  416:invokespecial   #192 <Method void RefKey(PdfIndirectReference)>
	//* 182  419:astore          6
	//* 183  421:aload_0         
	//* 184  422:aload           11
	//* 185  424:aload           12
	//* 186  426:new             #23  <Class CompareTool$ObjectPath>
	//* 187  429:dup             
	//* 188  430:aload_0         
	//* 189  431:aload           5
	//* 190  433:aload           6
	//* 191  435:invokespecial   #961 <Method void CompareTool$ObjectPath(CompareTool, RefKey, RefKey)>
	//* 192  438:aload           8
	//* 193  440:invokespecial   #476 <Method boolean compareObjects(PdfObject, PdfObject, CompareTool$ObjectPath, CompareTool$CompareResult)>
	//* 194  443:pop             
	//* 195  444:aload           9
	//* 196  446:invokevirtual   #320 <Method void PdfReader.close()>
	//* 197  449:aload           10
	//* 198  451:invokevirtual   #320 <Method void PdfReader.close()>
	//* 199  454:aload_0         
	//* 200  455:getfield        #102 <Field boolean generateCompareByContentXmlReport>
	//* 201  458:ifeq            505
	//* 202  461:aload           8
	//* 203  463:new             #259 <Class FileOutputStream>
	//* 204  466:dup             
	//* 205  467:new             #217 <Class StringBuilder>
	//* 206  470:dup             
	//* 207  471:invokespecial   #218 <Method void StringBuilder()>
	//* 208  474:aload_1         
	//* 209  475:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//* 210  478:ldc1            #233 <String "/">
	//* 211  480:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//* 212  483:aload_0         
	//* 213  484:getfield        #106 <Field String xmlReportName>
	//* 214  487:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//* 215  490:ldc2            #969 <String ".xml">
	//* 216  493:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//* 217  496:invokevirtual   #231 <Method String StringBuilder.toString()>
	//* 218  499:invokespecial   #260 <Method void FileOutputStream(String)>
	//* 219  502:invokevirtual   #973 <Method void CompareTool$CompareResult.writeReportToXml(OutputStream)>
	//* 220  505:aload           7
	//* 221  507:invokeinterface #952 <Method int List.size()>
	//* 222  512:aload_0         
	//* 223  513:getfield        #951 <Field List cmpPages>
	//* 224  516:invokeinterface #952 <Method int List.size()>
	//* 225  521:icmpne          595
	//* 226  524:aload           8
	//* 227  526:invokevirtual   #976 <Method boolean CompareTool$CompareResult.isOk()>
	//* 228  529:ifeq            595
	//* 229  532:getstatic       #368 <Field PrintStream System.out>
	//* 230  535:ldc2            #978 <String "OK">
	//* 231  538:invokevirtual   #373 <Method void PrintStream.println(String)>
	//* 232  541:getstatic       #368 <Field PrintStream System.out>
	//* 233  544:invokevirtual   #981 <Method void PrintStream.flush()>
	//* 234  547:aconst_null     
	//* 235  548:areturn         
			obj = ((Object) (new RefKey((PdfIndirectReference)pdfobject)));
	//  236  549:new             #187 <Class RefKey>
	//  237  552:dup             
	//  238  553:aload           11
	//  239  555:checkcast       #693 <Class PdfIndirectReference>
	//  240  558:invokespecial   #192 <Method void RefKey(PdfIndirectReference)>
	//  241  561:astore          5
		if(pdfobject1 == null)
			refkey = null;
		else
	//* 242  563:goto            320
			refkey = new RefKey((PdfIndirectReference)pdfobject1);
	//  243  566:new             #187 <Class RefKey>
	//  244  569:dup             
	//  245  570:aload           12
	//  246  572:checkcast       #693 <Class PdfIndirectReference>
	//  247  575:invokespecial   #192 <Method void RefKey(PdfIndirectReference)>
	//  248  578:astore          6
		compareObjects(pdfobject, pdfobject1, new ObjectPath(((RefKey) (obj)), refkey), compareresult);
		pdfobject = pdfreader.getCatalog().get(PdfName.OCPROPERTIES);
		pdfobject1 = pdfreader1.getCatalog().get(PdfName.OCPROPERTIES);
		if(pdfobject instanceof PdfIndirectReference)
			obj = ((Object) (new RefKey((PdfIndirectReference)pdfobject)));
		else
	//* 249  580:goto            328
			obj = null;
	//  250  583:aconst_null     
	//  251  584:astore          5
		if(pdfobject1 instanceof PdfIndirectReference)
			refkey = new RefKey((PdfIndirectReference)pdfobject1);
		else
	//* 252  586:goto            399
			refkey = null;
	//  253  589:aconst_null     
	//  254  590:astore          6
		compareObjects(pdfobject, pdfobject1, new ObjectPath(((RefKey) (obj)), refkey), compareresult);
		pdfreader.close();
		pdfreader1.close();
		if(generateCompareByContentXmlReport)
			try
			{
				compareresult.writeReportToXml(((OutputStream) (new FileOutputStream((new StringBuilder()).append(s).append("/").append(xmlReportName).append(".xml").toString()))));
			}
	//* 255  592:goto            421
	//* 256  595:getstatic       #368 <Field PrintStream System.out>
	//* 257  598:ldc2            #983 <String "Fail">
	//* 258  601:invokevirtual   #373 <Method void PrintStream.println(String)>
	//* 259  604:getstatic       #368 <Field PrintStream System.out>
	//* 260  607:invokevirtual   #981 <Method void PrintStream.flush()>
	//* 261  610:new             #217 <Class StringBuilder>
	//* 262  613:dup             
	//* 263  614:invokespecial   #218 <Method void StringBuilder()>
	//* 264  617:ldc2            #985 <String "Compare by content report:\n">
	//* 265  620:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//* 266  623:aload           8
	//* 267  625:invokevirtual   #988 <Method String CompareTool$CompareResult.getReport()>
	//* 268  628:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//* 269  631:invokevirtual   #231 <Method String StringBuilder.toString()>
	//* 270  634:astore          5
	//* 271  636:getstatic       #368 <Field PrintStream System.out>
	//* 272  639:aload           5
	//* 273  641:invokevirtual   #373 <Method void PrintStream.println(String)>
	//* 274  644:getstatic       #368 <Field PrintStream System.out>
	//* 275  647:invokevirtual   #981 <Method void PrintStream.flush()>
	//* 276  650:aload_0         
	//* 277  651:aload_1         
	//* 278  652:aload_2         
	//* 279  653:aload_3         
	//* 280  654:aload           7
	//* 281  656:invokespecial   #205 <Method String compare(String, String, Map, List)>
	//* 282  659:astore_2        
	//* 283  660:aload_2         
	//* 284  661:ifnull          673
	//* 285  664:aload_2         
	//* 286  665:astore_1        
	//* 287  666:aload_2         
	//* 288  667:invokevirtual   #823 <Method int String.length()>
	//* 289  670:ifne            136
	//* 290  673:ldc2            #990 <String "Compare by content fails. No visual differences">
	//* 291  676:areturn         
			catch(Exception exception) { }
	//  292  677:astore          5
		if(((List) (arraylist)).size() == cmpPages.size() && compareresult.isOk())
		{
			System.out.println("OK");
			System.out.flush();
			return null;
		}
		System.out.println("Fail");
		System.out.flush();
		obj = ((Object) ((new StringBuilder()).append("Compare by content report:\n").append(compareresult.getReport()).toString()));
		System.out.println(((String) (obj)));
		System.out.flush();
		s1 = compare(s, s1, map, ((List) (arraylist)));
		if(s1 == null)
			break; /* Loop/switch isn't completed */
		s = s1;
		if(s1.length() != 0) goto _L4; else goto _L3
_L3:
		return "Compare by content fails. No visual differences";
	//* 293  679:goto            505
	}

	public boolean compareContentStreamsByParsing(PdfObject pdfobject, PdfObject pdfobject1)
		throws IOException
	{
		return compareContentStreamsByParsingExtended(pdfobject, pdfobject1, ((PdfDictionary) (null)), ((PdfDictionary) (null)), ((ObjectPath) (null)), ((CompareResult) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:aconst_null     
	//    7    7:invokespecial   #510 <Method boolean compareContentStreamsByParsingExtended(PdfObject, PdfObject, PdfDictionary, PdfDictionary, CompareTool$ObjectPath, CompareTool$CompareResult)>
	//    8   10:ireturn         
	}

	public boolean compareContentStreamsByParsing(PdfObject pdfobject, PdfObject pdfobject1, PdfDictionary pdfdictionary, PdfDictionary pdfdictionary1)
		throws IOException
	{
		return compareContentStreamsByParsingExtended(pdfobject, pdfobject1, pdfdictionary, pdfdictionary1, ((ObjectPath) (null)), ((CompareResult) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aconst_null     
	//    6    7:aconst_null     
	//    7    8:invokespecial   #510 <Method boolean compareContentStreamsByParsingExtended(PdfObject, PdfObject, PdfDictionary, PdfDictionary, CompareTool$ObjectPath, CompareTool$CompareResult)>
	//    8   11:ireturn         
	}

	public boolean compareDictionaries(PdfDictionary pdfdictionary, PdfDictionary pdfdictionary1)
		throws IOException
	{
		return compareDictionariesExtended(pdfdictionary, pdfdictionary1, ((ObjectPath) (null)), ((CompareResult) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:invokespecial   #717 <Method boolean compareDictionariesExtended(PdfDictionary, PdfDictionary, CompareTool$ObjectPath, CompareTool$CompareResult)>
	//    6    8:ireturn         
	}

	public String compareDocumentInfo(String s, String s1)
		throws IOException
	{
		System.out.print("[itext] INFO  Comparing document info.......");
	//    0    0:getstatic       #368 <Field PrintStream System.out>
	//    1    3:ldc2            #998 <String "[itext] INFO  Comparing document info.......">
	//    2    6:invokevirtual   #413 <Method void PrintStream.print(String)>
		Object obj = null;
	//    3    9:aconst_null     
	//    4   10:astore          4
		PdfReader pdfreader = new PdfReader(s);
	//    5   12:new             #137 <Class PdfReader>
	//    6   15:dup             
	//    7   16:aload_1         
	//    8   17:invokespecial   #253 <Method void PdfReader(String)>
	//    9   20:astore          5
		s1 = ((String) (new PdfReader(s1)));
	//   10   22:new             #137 <Class PdfReader>
	//   11   25:dup             
	//   12   26:aload_2         
	//   13   27:invokespecial   #253 <Method void PdfReader(String)>
	//   14   30:astore_2        
		String as[] = convertInfo(((PdfReader) (s1)).getInfo());
	//   15   31:aload_0         
	//   16   32:aload_2         
	//   17   33:invokevirtual   #1002 <Method HashMap PdfReader.getInfo()>
	//   18   36:invokespecial   #1004 <Method String[] convertInfo(HashMap)>
	//   19   39:astore          6
		String as1[] = convertInfo(pdfreader.getInfo());
	//   20   41:aload_0         
	//   21   42:aload           5
	//   22   44:invokevirtual   #1002 <Method HashMap PdfReader.getInfo()>
	//   23   47:invokespecial   #1004 <Method String[] convertInfo(HashMap)>
	//   24   50:astore          7
		int i = 0;
	//   25   52:iconst_0        
	//   26   53:istore_3        
		do
		{
label0:
			{
				s = ((String) (obj));
	//   27   54:aload           4
	//   28   56:astore_1        
				if(i < as.length)
	//*  29   57:iload_3         
	//*  30   58:aload           6
	//*  31   60:arraylength     
	//*  32   61:icmpge          82
				{
					if(as[i].equals(((Object) (as1[i]))))
						break label0;
	//   33   64:aload           6
	//   34   66:iload_3         
	//   35   67:aaload          
	//   36   68:aload           7
	//   37   70:iload_3         
	//   38   71:aaload          
	//   39   72:invokevirtual   #634 <Method boolean String.equals(Object)>
	//   40   75:ifne            112
					s = "Document info fail";
	//   41   78:ldc2            #1006 <String "Document info fail">
	//   42   81:astore_1        
				}
				pdfreader.close();
	//   43   82:aload           5
	//   44   84:invokevirtual   #320 <Method void PdfReader.close()>
				((PdfReader) (s1)).close();
	//   45   87:aload_2         
	//   46   88:invokevirtual   #320 <Method void PdfReader.close()>
				if(s == null)
	//*  47   91:aload_1         
	//*  48   92:ifnonnull       119
					System.out.println("OK");
	//   49   95:getstatic       #368 <Field PrintStream System.out>
	//   50   98:ldc2            #978 <String "OK">
	//   51  101:invokevirtual   #373 <Method void PrintStream.println(String)>
				else
	//*  52  104:getstatic       #368 <Field PrintStream System.out>
	//*  53  107:invokevirtual   #981 <Method void PrintStream.flush()>
	//*  54  110:aload_1         
	//*  55  111:areturn         
	//*  56  112:iload_3         
	//*  57  113:iconst_1        
	//*  58  114:iadd            
	//*  59  115:istore_3        
	//*  60  116:goto            54
					System.out.println("Fail");
	//   61  119:getstatic       #368 <Field PrintStream System.out>
	//   62  122:ldc2            #983 <String "Fail">
	//   63  125:invokevirtual   #373 <Method void PrintStream.println(String)>
				System.out.flush();
				return s;
			}
			i++;
		} while(true);
	//*  64  128:goto            104
	}

	public String compareLinks(String s, String s1)
		throws IOException
	{
		int i;
		PdfReader pdfreader;
		PdfReader pdfreader1;
		System.out.print("[itext] INFO  Comparing link annotations....");
	//    0    0:getstatic       #368 <Field PrintStream System.out>
	//    1    3:ldc2            #1009 <String "[itext] INFO  Comparing link annotations....">
	//    2    6:invokevirtual   #413 <Method void PrintStream.print(String)>
		Object obj = null;
	//    3    9:aconst_null     
	//    4   10:astore          5
		pdfreader = new PdfReader(s);
	//    5   12:new             #137 <Class PdfReader>
	//    6   15:dup             
	//    7   16:aload_1         
	//    8   17:invokespecial   #253 <Method void PdfReader(String)>
	//    9   20:astore          6
		pdfreader1 = new PdfReader(s1);
	//   10   22:new             #137 <Class PdfReader>
	//   11   25:dup             
	//   12   26:aload_2         
	//   13   27:invokespecial   #253 <Method void PdfReader(String)>
	//   14   30:astore          7
		i = 0;
	//   15   32:iconst_0        
	//   16   33:istore_3        
		s = ((String) (obj));
	//   17   34:aload           5
	//   18   36:astore_1        
_L2:
label0:
		{
			s1 = s;
	//   19   37:aload_1         
	//   20   38:astore_2        
			ArrayList arraylist;
			ArrayList arraylist1;
			if(i < pdfreader.getNumberOfPages())
	//*  21   39:iload_3         
	//*  22   40:aload           6
	//*  23   42:invokevirtual   #1012 <Method int PdfReader.getNumberOfPages()>
	//*  24   45:icmpge          116
			{
				s1 = s;
	//   25   48:aload_1         
	//   26   49:astore_2        
				if(i < pdfreader1.getNumberOfPages())
	//*  27   50:iload_3         
	//*  28   51:aload           7
	//*  29   53:invokevirtual   #1012 <Method int PdfReader.getNumberOfPages()>
	//*  30   56:icmpge          116
				{
					arraylist = pdfreader.getLinks(i + 1);
	//   31   59:aload           6
	//   32   61:iload_3         
	//   33   62:iconst_1        
	//   34   63:iadd            
	//   35   64:invokevirtual   #1016 <Method ArrayList PdfReader.getLinks(int)>
	//   36   67:astore          5
					arraylist1 = pdfreader1.getLinks(i + 1);
	//   37   69:aload           7
	//   38   71:iload_3         
	//   39   72:iconst_1        
	//   40   73:iadd            
	//   41   74:invokevirtual   #1016 <Method ArrayList PdfReader.getLinks(int)>
	//   42   77:astore          8
					if(((List) (arraylist1)).size() == ((List) (arraylist)).size())
						break label0;
	//   43   79:aload           8
	//   44   81:invokeinterface #952 <Method int List.size()>
	//   45   86:aload           5
	//   46   88:invokeinterface #952 <Method int List.size()>
	//   47   93:icmpeq          147
					s1 = String.format("Different number of links on page %d.", new Object[] {
						Integer.valueOf(i + 1)
					});
	//   48   96:ldc2            #1018 <String "Different number of links on page %d.">
	//   49   99:iconst_1        
	//   50  100:anewarray       Object[]
	//   51  103:dup             
	//   52  104:iconst_0        
	//   53  105:iload_3         
	//   54  106:iconst_1        
	//   55  107:iadd            
	//   56  108:invokestatic    #398 <Method Integer Integer.valueOf(int)>
	//   57  111:aastore         
	//   58  112:invokestatic    #465 <Method String String.format(String, Object[])>
	//   59  115:astore_2        
				}
			}
			pdfreader.close();
	//   60  116:aload           6
	//   61  118:invokevirtual   #320 <Method void PdfReader.close()>
			pdfreader1.close();
	//   62  121:aload           7
	//   63  123:invokevirtual   #320 <Method void PdfReader.close()>
			int j;
			if(s1 == null)
	//*  64  126:aload_2         
	//*  65  127:ifnonnull       269
				System.out.println("OK");
	//   66  130:getstatic       #368 <Field PrintStream System.out>
	//   67  133:ldc2            #978 <String "OK">
	//   68  136:invokevirtual   #373 <Method void PrintStream.println(String)>
			else
	//*  69  139:getstatic       #368 <Field PrintStream System.out>
	//*  70  142:invokevirtual   #981 <Method void PrintStream.flush()>
	//*  71  145:aload_2         
	//*  72  146:areturn         
	//*  73  147:iconst_0        
	//*  74  148:istore          4
	//*  75  150:aload_1         
	//*  76  151:astore_2        
	//*  77  152:iload           4
	//*  78  154:aload           8
	//*  79  156:invokeinterface #952 <Method int List.size()>
	//*  80  161:icmpge          251
	//*  81  164:aload_0         
	//*  82  165:aload           8
	//*  83  167:iload           4
	//*  84  169:invokeinterface #958 <Method Object List.get(int)>
	//*  85  174:checkcast       #874 <Class com.itextpdf.text.pdf.PdfAnnotation$PdfImportedLink>
	//*  86  177:aload           5
	//*  87  179:iload           4
	//*  88  181:invokeinterface #958 <Method Object List.get(int)>
	//*  89  186:checkcast       #874 <Class com.itextpdf.text.pdf.PdfAnnotation$PdfImportedLink>
	//*  90  189:invokespecial   #1020 <Method boolean linksAreSame(com.itextpdf.text.pdf.PdfAnnotation$PdfImportedLink, com.itextpdf.text.pdf.PdfAnnotation$PdfImportedLink)>
	//*  91  192:ifne            260
	//*  92  195:ldc2            #1022 <String "Different links on page %d.\n%s\n%s">
	//*  93  198:iconst_3        
	//*  94  199:anewarray       Object[]
	//*  95  202:dup             
	//*  96  203:iconst_0        
	//*  97  204:iload_3         
	//*  98  205:iconst_1        
	//*  99  206:iadd            
	//* 100  207:invokestatic    #398 <Method Integer Integer.valueOf(int)>
	//* 101  210:aastore         
	//* 102  211:dup             
	//* 103  212:iconst_1        
	//* 104  213:aload           8
	//* 105  215:iload           4
	//* 106  217:invokeinterface #958 <Method Object List.get(int)>
	//* 107  222:checkcast       #874 <Class com.itextpdf.text.pdf.PdfAnnotation$PdfImportedLink>
	//* 108  225:invokevirtual   #1023 <Method String com.itextpdf.text.pdf.PdfAnnotation$PdfImportedLink.toString()>
	//* 109  228:aastore         
	//* 110  229:dup             
	//* 111  230:iconst_2        
	//* 112  231:aload           5
	//* 113  233:iload           4
	//* 114  235:invokeinterface #958 <Method Object List.get(int)>
	//* 115  240:checkcast       #874 <Class com.itextpdf.text.pdf.PdfAnnotation$PdfImportedLink>
	//* 116  243:invokevirtual   #1023 <Method String com.itextpdf.text.pdf.PdfAnnotation$PdfImportedLink.toString()>
	//* 117  246:aastore         
	//* 118  247:invokestatic    #465 <Method String String.format(String, Object[])>
	//* 119  250:astore_2        
	//* 120  251:iload_3         
	//* 121  252:iconst_1        
	//* 122  253:iadd            
	//* 123  254:istore_3        
	//* 124  255:aload_2         
	//* 125  256:astore_1        
	//* 126  257:goto            37
	//* 127  260:iload           4
	//* 128  262:iconst_1        
	//* 129  263:iadd            
	//* 130  264:istore          4
	//* 131  266:goto            150
				System.out.println("Fail");
	//  132  269:getstatic       #368 <Field PrintStream System.out>
	//  133  272:ldc2            #983 <String "Fail">
	//  134  275:invokevirtual   #373 <Method void PrintStream.println(String)>
			System.out.flush();
			return s1;
		}
		j = 0;
		do
		{
label1:
			{
				s1 = s;
				if(j < ((List) (arraylist1)).size())
				{
					if(linksAreSame((com.itextpdf.text.pdf.PdfAnnotation.PdfImportedLink)((List) (arraylist1)).get(j), (com.itextpdf.text.pdf.PdfAnnotation.PdfImportedLink)((List) (arraylist)).get(j)))
						break label1;
					s1 = String.format("Different links on page %d.\n%s\n%s", new Object[] {
						Integer.valueOf(i + 1), ((com.itextpdf.text.pdf.PdfAnnotation.PdfImportedLink)((List) (arraylist1)).get(j)).toString(), ((com.itextpdf.text.pdf.PdfAnnotation.PdfImportedLink)((List) (arraylist)).get(j)).toString()
					});
				}
				i++;
				s = s1;
			}
			if(true)
				continue;
			j++;
		} while(true);
		if(true) goto _L2; else goto _L1
_L1:
	//* 135  278:goto            139
	}

	public boolean compareLiterals(PdfLiteral pdfliteral, PdfLiteral pdfliteral1)
	{
		return Arrays.equals(pdfliteral1.getBytes(), pdfliteral.getBytes());
	//    0    0:aload_2         
	//    1    1:invokevirtual   #1024 <Method byte[] PdfLiteral.getBytes()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1024 <Method byte[] PdfLiteral.getBytes()>
	//    4    8:invokestatic    #661 <Method boolean Arrays.equals(byte[], byte[])>
	//    5   11:ireturn         
	}

	public boolean compareNames(PdfName pdfname, PdfName pdfname1)
	{
		return pdfname1.compareTo(pdfname) == 0;
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #597 <Method int PdfName.compareTo(PdfName)>
	//    3    5:ifne            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean compareNumbers(PdfNumber pdfnumber, PdfNumber pdfnumber1)
	{
		double d1 = Math.abs(pdfnumber.doubleValue() - pdfnumber1.doubleValue());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #1030 <Method double PdfNumber.doubleValue()>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #1030 <Method double PdfNumber.doubleValue()>
	//    4    8:dsub            
	//    5    9:invokestatic    #1034 <Method double Math.abs(double)>
	//    6   12:dstore          5
		double d = d1;
	//    7   14:dload           5
	//    8   16:dstore_3        
		if(!absoluteError)
	//*   9   17:aload_0         
	//*  10   18:getfield        #110 <Field boolean absoluteError>
	//*  11   21:ifne            44
		{
			d = d1;
	//   12   24:dload           5
	//   13   26:dstore_3        
			if(pdfnumber1.doubleValue() != 0.0D)
	//*  14   27:aload_2         
	//*  15   28:invokevirtual   #1030 <Method double PdfNumber.doubleValue()>
	//*  16   31:dconst_0        
	//*  17   32:dcmpl           
	//*  18   33:ifeq            44
				d = d1 / pdfnumber1.doubleValue();
	//   19   36:dload           5
	//   20   38:aload_2         
	//   21   39:invokevirtual   #1030 <Method double PdfNumber.doubleValue()>
	//   22   42:ddiv            
	//   23   43:dstore_3        
		}
		return d <= floatComparisonError;
	//   24   44:dload_3         
	//   25   45:aload_0         
	//   26   46:getfield        #108 <Field double floatComparisonError>
	//   27   49:dcmpg           
	//   28   50:ifgt            55
	//   29   53:iconst_1        
	//   30   54:ireturn         
	//   31   55:iconst_0        
	//   32   56:ireturn         
	}

	public boolean compareStreams(PRStream prstream, PRStream prstream1)
		throws IOException
	{
		return compareStreamsExtended(prstream, prstream1, ((ObjectPath) (null)), ((CompareResult) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:invokespecial   #722 <Method boolean compareStreamsExtended(PRStream, PRStream, CompareTool$ObjectPath, CompareTool$CompareResult)>
	//    6    8:ireturn         
	}

	public boolean compareStrings(PdfString pdfstring, PdfString pdfstring1)
	{
		return Arrays.equals(pdfstring1.getBytes(), pdfstring.getBytes());
	//    0    0:aload_2         
	//    1    1:invokevirtual   #817 <Method byte[] PdfString.getBytes()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #817 <Method byte[] PdfString.getBytes()>
	//    4    8:invokestatic    #661 <Method boolean Arrays.equals(byte[], byte[])>
	//    5   11:ireturn         
	}

	public String compareTagStructures(String s, String s1)
		throws IOException, ParserConfigurationException, SAXException
	{
		System.out.print("[itext] INFO  Comparing tag structures......");
	//    0    0:getstatic       #368 <Field PrintStream System.out>
	//    1    3:ldc2            #1044 <String "[itext] INFO  Comparing tag structures......">
	//    2    6:invokevirtual   #413 <Method void PrintStream.print(String)>
		String s2 = s.replace(".pdf", ".xml");
	//    3    9:aload_1         
	//    4   10:ldc2            #1046 <String ".pdf">
	//    5   13:ldc2            #969 <String ".xml">
	//    6   16:invokevirtual   #336 <Method String String.replace(CharSequence, CharSequence)>
	//    7   19:astore          4
		String s3 = s.replace(".pdf", ".cmp.xml");
	//    8   21:aload_1         
	//    9   22:ldc2            #1046 <String ".pdf">
	//   10   25:ldc2            #1048 <String ".cmp.xml">
	//   11   28:invokevirtual   #336 <Method String String.replace(CharSequence, CharSequence)>
	//   12   31:astore          5
		Object obj = null;
	//   13   33:aconst_null     
	//   14   34:astore_3        
		s = ((String) (new PdfReader(s)));
	//   15   35:new             #137 <Class PdfReader>
	//   16   38:dup             
	//   17   39:aload_1         
	//   18   40:invokespecial   #253 <Method void PdfReader(String)>
	//   19   43:astore_1        
		FileOutputStream fileoutputstream = new FileOutputStream(s2);
	//   20   44:new             #259 <Class FileOutputStream>
	//   21   47:dup             
	//   22   48:aload           4
	//   23   50:invokespecial   #260 <Method void FileOutputStream(String)>
	//   24   53:astore          6
		(new CmpTaggedPdfReaderTool()).convertToXml(((PdfReader) (s)), ((OutputStream) (fileoutputstream)));
	//   25   55:new             #14  <Class CompareTool$CmpTaggedPdfReaderTool>
	//   26   58:dup             
	//   27   59:aload_0         
	//   28   60:invokespecial   #1049 <Method void CompareTool$CmpTaggedPdfReaderTool(CompareTool)>
	//   29   63:aload_1         
	//   30   64:aload           6
	//   31   66:invokevirtual   #1052 <Method void CompareTool$CmpTaggedPdfReaderTool.convertToXml(PdfReader, OutputStream)>
		((PdfReader) (s)).close();
	//   32   69:aload_1         
	//   33   70:invokevirtual   #320 <Method void PdfReader.close()>
		s = ((String) (new PdfReader(s1)));
	//   34   73:new             #137 <Class PdfReader>
	//   35   76:dup             
	//   36   77:aload_2         
	//   37   78:invokespecial   #253 <Method void PdfReader(String)>
	//   38   81:astore_1        
		s1 = ((String) (new FileOutputStream(s3)));
	//   39   82:new             #259 <Class FileOutputStream>
	//   40   85:dup             
	//   41   86:aload           5
	//   42   88:invokespecial   #260 <Method void FileOutputStream(String)>
	//   43   91:astore_2        
		(new CmpTaggedPdfReaderTool()).convertToXml(((PdfReader) (s)), ((OutputStream) (s1)));
	//   44   92:new             #14  <Class CompareTool$CmpTaggedPdfReaderTool>
	//   45   95:dup             
	//   46   96:aload_0         
	//   47   97:invokespecial   #1049 <Method void CompareTool$CmpTaggedPdfReaderTool(CompareTool)>
	//   48  100:aload_1         
	//   49  101:aload_2         
	//   50  102:invokevirtual   #1052 <Method void CompareTool$CmpTaggedPdfReaderTool.convertToXml(PdfReader, OutputStream)>
		((PdfReader) (s)).close();
	//   51  105:aload_1         
	//   52  106:invokevirtual   #320 <Method void PdfReader.close()>
		s = ((String) (obj));
	//   53  109:aload_3         
	//   54  110:astore_1        
		if(!compareXmls(s2, s3))
	//*  55  111:aload_0         
	//*  56  112:aload           4
	//*  57  114:aload           5
	//*  58  116:invokevirtual   #1056 <Method boolean compareXmls(String, String)>
	//*  59  119:ifne            126
			s = "The tag structures are different.";
	//   60  122:ldc2            #1058 <String "The tag structures are different.">
	//   61  125:astore_1        
		fileoutputstream.close();
	//   62  126:aload           6
	//   63  128:invokevirtual   #1059 <Method void FileOutputStream.close()>
		((FileOutputStream) (s1)).close();
	//   64  131:aload_2         
	//   65  132:invokevirtual   #1059 <Method void FileOutputStream.close()>
		if(s == null)
	//*  66  135:aload_1         
	//*  67  136:ifnonnull       156
			System.out.println("OK");
	//   68  139:getstatic       #368 <Field PrintStream System.out>
	//   69  142:ldc2            #978 <String "OK">
	//   70  145:invokevirtual   #373 <Method void PrintStream.println(String)>
		else
	//*  71  148:getstatic       #368 <Field PrintStream System.out>
	//*  72  151:invokevirtual   #981 <Method void PrintStream.flush()>
	//*  73  154:aload_1         
	//*  74  155:areturn         
			System.out.println("Fail");
	//   75  156:getstatic       #368 <Field PrintStream System.out>
	//   76  159:ldc2            #983 <String "Fail">
	//   77  162:invokevirtual   #373 <Method void PrintStream.println(String)>
		System.out.flush();
		return s;
	//*  78  165:goto            148
	}

	public boolean compareXmls(String s, String s1)
		throws ParserConfigurationException, SAXException, IOException
	{
		Object obj = ((Object) (DocumentBuilderFactory.newInstance()));
	//    0    0:invokestatic    #1065 <Method DocumentBuilderFactory DocumentBuilderFactory.newInstance()>
	//    1    3:astore_3        
		((DocumentBuilderFactory) (obj)).setNamespaceAware(true);
	//    2    4:aload_3         
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #1069 <Method void DocumentBuilderFactory.setNamespaceAware(boolean)>
		((DocumentBuilderFactory) (obj)).setCoalescing(true);
	//    5    9:aload_3         
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #1072 <Method void DocumentBuilderFactory.setCoalescing(boolean)>
		((DocumentBuilderFactory) (obj)).setIgnoringElementContentWhitespace(true);
	//    8   14:aload_3         
	//    9   15:iconst_1        
	//   10   16:invokevirtual   #1075 <Method void DocumentBuilderFactory.setIgnoringElementContentWhitespace(boolean)>
		((DocumentBuilderFactory) (obj)).setIgnoringComments(true);
	//   11   19:aload_3         
	//   12   20:iconst_1        
	//   13   21:invokevirtual   #1078 <Method void DocumentBuilderFactory.setIgnoringComments(boolean)>
		obj = ((Object) (((DocumentBuilderFactory) (obj)).newDocumentBuilder()));
	//   14   24:aload_3         
	//   15   25:invokevirtual   #1082 <Method DocumentBuilder DocumentBuilderFactory.newDocumentBuilder()>
	//   16   28:astore_3        
		s = ((String) (((DocumentBuilder) (obj)).parse(new File(s))));
	//   17   29:aload_3         
	//   18   30:new             #209 <Class File>
	//   19   33:dup             
	//   20   34:aload_1         
	//   21   35:invokespecial   #212 <Method void File(String)>
	//   22   38:invokevirtual   #1087 <Method Document DocumentBuilder.parse(File)>
	//   23   41:astore_1        
		((Document) (s)).normalizeDocument();
	//   24   42:aload_1         
	//   25   43:invokeinterface #1092 <Method void Document.normalizeDocument()>
		s1 = ((String) (((DocumentBuilder) (obj)).parse(new File(s1))));
	//   26   48:aload_3         
	//   27   49:new             #209 <Class File>
	//   28   52:dup             
	//   29   53:aload_2         
	//   30   54:invokespecial   #212 <Method void File(String)>
	//   31   57:invokevirtual   #1087 <Method Document DocumentBuilder.parse(File)>
	//   32   60:astore_2        
		((Document) (s1)).normalizeDocument();
	//   33   61:aload_2         
	//   34   62:invokeinterface #1092 <Method void Document.normalizeDocument()>
		return ((Document) (s1)).isEqualNode(((Node) (s)));
	//   35   67:aload_2         
	//   36   68:aload_1         
	//   37   69:invokeinterface #1096 <Method boolean Document.isEqualNode(Node)>
	//   38   74:ireturn         
	}

	public boolean compareXmls(byte abyte0[], byte abyte1[])
		throws ParserConfigurationException, SAXException, IOException
	{
		Object obj = ((Object) (DocumentBuilderFactory.newInstance()));
	//    0    0:invokestatic    #1065 <Method DocumentBuilderFactory DocumentBuilderFactory.newInstance()>
	//    1    3:astore_3        
		((DocumentBuilderFactory) (obj)).setNamespaceAware(true);
	//    2    4:aload_3         
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #1069 <Method void DocumentBuilderFactory.setNamespaceAware(boolean)>
		((DocumentBuilderFactory) (obj)).setCoalescing(true);
	//    5    9:aload_3         
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #1072 <Method void DocumentBuilderFactory.setCoalescing(boolean)>
		((DocumentBuilderFactory) (obj)).setIgnoringElementContentWhitespace(true);
	//    8   14:aload_3         
	//    9   15:iconst_1        
	//   10   16:invokevirtual   #1075 <Method void DocumentBuilderFactory.setIgnoringElementContentWhitespace(boolean)>
		((DocumentBuilderFactory) (obj)).setIgnoringComments(true);
	//   11   19:aload_3         
	//   12   20:iconst_1        
	//   13   21:invokevirtual   #1078 <Method void DocumentBuilderFactory.setIgnoringComments(boolean)>
		obj = ((Object) (((DocumentBuilderFactory) (obj)).newDocumentBuilder()));
	//   14   24:aload_3         
	//   15   25:invokevirtual   #1082 <Method DocumentBuilder DocumentBuilderFactory.newDocumentBuilder()>
	//   16   28:astore_3        
		abyte0 = ((byte []) (((DocumentBuilder) (obj)).parse(((InputStream) (new ByteArrayInputStream(abyte0))))));
	//   17   29:aload_3         
	//   18   30:new             #1098 <Class ByteArrayInputStream>
	//   19   33:dup             
	//   20   34:aload_1         
	//   21   35:invokespecial   #1099 <Method void ByteArrayInputStream(byte[])>
	//   22   38:invokevirtual   #1102 <Method Document DocumentBuilder.parse(InputStream)>
	//   23   41:astore_1        
		((Document) (abyte0)).normalizeDocument();
	//   24   42:aload_1         
	//   25   43:invokeinterface #1092 <Method void Document.normalizeDocument()>
		abyte1 = ((byte []) (((DocumentBuilder) (obj)).parse(((InputStream) (new ByteArrayInputStream(abyte1))))));
	//   26   48:aload_3         
	//   27   49:new             #1098 <Class ByteArrayInputStream>
	//   28   52:dup             
	//   29   53:aload_2         
	//   30   54:invokespecial   #1099 <Method void ByteArrayInputStream(byte[])>
	//   31   57:invokevirtual   #1102 <Method Document DocumentBuilder.parse(InputStream)>
	//   32   60:astore_2        
		((Document) (abyte1)).normalizeDocument();
	//   33   61:aload_2         
	//   34   62:invokeinterface #1092 <Method void Document.normalizeDocument()>
		return ((Document) (abyte1)).isEqualNode(((Node) (abyte0)));
	//   35   67:aload_2         
	//   36   68:aload_1         
	//   37   69:invokeinterface #1096 <Method boolean Document.isEqualNode(Node)>
	//   38   74:ireturn         
	}

	public String compareXmp(String s, String s1)
	{
		return compareXmp(s, s1, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #1106 <Method String compareXmp(String, String, boolean)>
	//    5    7:areturn         
	}

	public String compareXmp(String s, String s1, boolean flag)
	{
		String s2;
		Exception exception;
		Object obj;
		Object obj1;
		init(s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #324 <Method void init(String, String)>
		obj = null;
	//    4    6:aconst_null     
	//    5    7:astore          6
		obj1 = null;
	//    6    9:aconst_null     
	//    7   10:astore          7
		s2 = null;
	//    8   12:aconst_null     
	//    9   13:astore          4
		exception = null;
	//   10   15:aconst_null     
	//   11   16:astore          5
		s = ((String) (new PdfReader(cmpPdf)));
	//   12   18:new             #137 <Class PdfReader>
	//   13   21:dup             
	//   14   22:aload_0         
	//   15   23:getfield        #252 <Field String cmpPdf>
	//   16   26:invokespecial   #253 <Method void PdfReader(String)>
	//   17   29:astore_1        
		s1 = ((String) (new PdfReader(outPdf)));
	//   18   30:new             #137 <Class PdfReader>
	//   19   33:dup             
	//   20   34:aload_0         
	//   21   35:getfield        #255 <Field String outPdf>
	//   22   38:invokespecial   #253 <Method void PdfReader(String)>
	//   23   41:astore_2        
		s2 = compareXmp(((PdfReader) (s)).getMetadata(), ((PdfReader) (s1)).getMetadata(), flag);
	//   24   42:aload_0         
	//   25   43:aload_1         
	//   26   44:invokevirtual   #1109 <Method byte[] PdfReader.getMetadata()>
	//   27   47:aload_2         
	//   28   48:invokevirtual   #1109 <Method byte[] PdfReader.getMetadata()>
	//   29   51:iload_3         
	//   30   52:invokevirtual   #1112 <Method String compareXmp(byte[], byte[], boolean)>
	//   31   55:astore          4
		if(s != null)
	//*  32   57:aload_1         
	//*  33   58:ifnull          65
			((PdfReader) (s)).close();
	//   34   61:aload_1         
	//   35   62:invokevirtual   #320 <Method void PdfReader.close()>
		if(s1 != null)
	//*  36   65:aload_2         
	//*  37   66:ifnull          73
			((PdfReader) (s1)).close();
	//   38   69:aload_2         
	//   39   70:invokevirtual   #320 <Method void PdfReader.close()>
_L2:
		return s2;
	//   40   73:aload           4
	//   41   75:areturn         
		s;
	//   42   76:astore_1        
		s1 = ((String) (exception));
	//   43   77:aload           5
	//   44   79:astore_2        
		s = ((String) (obj1));
	//   45   80:aload           7
	//   46   82:astore_1        
_L5:
		s2 = "XMP parsing failure!";
	//   47   83:ldc2            #1114 <String "XMP parsing failure!">
	//   48   86:astore          4
		if(s != null)
	//*  49   88:aload_1         
	//*  50   89:ifnull          96
			((PdfReader) (s)).close();
	//   51   92:aload_1         
	//   52   93:invokevirtual   #320 <Method void PdfReader.close()>
		if(s1 == null) goto _L2; else goto _L1
	//   53   96:aload_2         
	//   54   97:ifnull          73
_L1:
		((PdfReader) (s1)).close();
	//   55  100:aload_2         
	//   56  101:invokevirtual   #320 <Method void PdfReader.close()>
		return "XMP parsing failure!";
	//   57  104:ldc2            #1114 <String "XMP parsing failure!">
	//   58  107:areturn         
		s1;
	//   59  108:astore_2        
		s = ((String) (obj));
	//   60  109:aload           6
	//   61  111:astore_1        
_L4:
		if(s != null)
	//*  62  112:aload_1         
	//*  63  113:ifnull          120
			((PdfReader) (s)).close();
	//   64  116:aload_1         
	//   65  117:invokevirtual   #320 <Method void PdfReader.close()>
		if(s2 != null)
	//*  66  120:aload           4
	//*  67  122:ifnull          130
			((PdfReader) (s2)).close();
	//   68  125:aload           4
	//   69  127:invokevirtual   #320 <Method void PdfReader.close()>
		throw s1;
	//   70  130:aload_2         
	//   71  131:athrow          
		s1;
	//   72  132:astore_2        
		continue; /* Loop/switch isn't completed */
	//   73  133:goto            112
		exception;
	//   74  136:astore          5
		s2 = s1;
	//   75  138:aload_2         
	//   76  139:astore          4
		s1 = ((String) (exception));
	//   77  141:aload           5
	//   78  143:astore_2        
		if(true) goto _L4; else goto _L3
	//   79  144:goto            112
_L3:
		s1;
	//   80  147:astore_2        
		s1 = ((String) (exception));
	//   81  148:aload           5
	//   82  150:astore_2        
		  goto _L5
	//*  83  151:goto            83
		IOException ioexception;
		ioexception;
	//   84  154:astore          4
		  goto _L5
	//*  85  156:goto            83
	}

	public String compareXmp(byte abyte0[], byte abyte1[])
	{
		return compareXmp(abyte0, abyte1, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #1112 <Method String compareXmp(byte[], byte[], boolean)>
	//    5    7:areturn         
	}

	public String compareXmp(byte abyte0[], byte abyte1[], boolean flag)
	{
		byte abyte2[];
		byte abyte3[];
		abyte3 = abyte0;
	//    0    0:aload_1         
	//    1    1:astore          5
		abyte2 = abyte1;
	//    2    3:aload_2         
	//    3    4:astore          4
		if(!flag)
			break MISSING_BLOCK_LABEL_148;
	//    4    6:iload_3         
	//    5    7:ifeq            148
		abyte0 = ((byte []) (XMPMetaFactory.parseFromBuffer(abyte0)));
	//    6   10:aload_1         
	//    7   11:invokestatic    #1123 <Method com.itextpdf.xmp.XMPMeta XMPMetaFactory.parseFromBuffer(byte[])>
	//    8   14:astore_1        
		XMPUtils.removeProperties(((com.itextpdf.xmp.XMPMeta) (abyte0)), "http://ns.adobe.com/xap/1.0/", "CreateDate", true, true);
	//    9   15:aload_1         
	//   10   16:ldc2            #1125 <String "http://ns.adobe.com/xap/1.0/">
	//   11   19:ldc2            #1127 <String "CreateDate">
	//   12   22:iconst_1        
	//   13   23:iconst_1        
	//   14   24:invokestatic    #1133 <Method void XMPUtils.removeProperties(com.itextpdf.xmp.XMPMeta, String, String, boolean, boolean)>
		XMPUtils.removeProperties(((com.itextpdf.xmp.XMPMeta) (abyte0)), "http://ns.adobe.com/xap/1.0/", "ModifyDate", true, true);
	//   15   27:aload_1         
	//   16   28:ldc2            #1125 <String "http://ns.adobe.com/xap/1.0/">
	//   17   31:ldc2            #1135 <String "ModifyDate">
	//   18   34:iconst_1        
	//   19   35:iconst_1        
	//   20   36:invokestatic    #1133 <Method void XMPUtils.removeProperties(com.itextpdf.xmp.XMPMeta, String, String, boolean, boolean)>
		XMPUtils.removeProperties(((com.itextpdf.xmp.XMPMeta) (abyte0)), "http://ns.adobe.com/xap/1.0/", "MetadataDate", true, true);
	//   21   39:aload_1         
	//   22   40:ldc2            #1125 <String "http://ns.adobe.com/xap/1.0/">
	//   23   43:ldc2            #1137 <String "MetadataDate">
	//   24   46:iconst_1        
	//   25   47:iconst_1        
	//   26   48:invokestatic    #1133 <Method void XMPUtils.removeProperties(com.itextpdf.xmp.XMPMeta, String, String, boolean, boolean)>
		XMPUtils.removeProperties(((com.itextpdf.xmp.XMPMeta) (abyte0)), "http://ns.adobe.com/pdf/1.3/", "Producer", true, true);
	//   27   51:aload_1         
	//   28   52:ldc2            #1139 <String "http://ns.adobe.com/pdf/1.3/">
	//   29   55:ldc2            #1141 <String "Producer">
	//   30   58:iconst_1        
	//   31   59:iconst_1        
	//   32   60:invokestatic    #1133 <Method void XMPUtils.removeProperties(com.itextpdf.xmp.XMPMeta, String, String, boolean, boolean)>
		abyte3 = XMPMetaFactory.serializeToBuffer(((com.itextpdf.xmp.XMPMeta) (abyte0)), new SerializeOptions(8192));
	//   33   63:aload_1         
	//   34   64:new             #1143 <Class SerializeOptions>
	//   35   67:dup             
	//   36   68:sipush          8192
	//   37   71:invokespecial   #1144 <Method void SerializeOptions(int)>
	//   38   74:invokestatic    #1148 <Method byte[] XMPMetaFactory.serializeToBuffer(com.itextpdf.xmp.XMPMeta, SerializeOptions)>
	//   39   77:astore          5
		abyte0 = ((byte []) (XMPMetaFactory.parseFromBuffer(abyte1)));
	//   40   79:aload_2         
	//   41   80:invokestatic    #1123 <Method com.itextpdf.xmp.XMPMeta XMPMetaFactory.parseFromBuffer(byte[])>
	//   42   83:astore_1        
		XMPUtils.removeProperties(((com.itextpdf.xmp.XMPMeta) (abyte0)), "http://ns.adobe.com/xap/1.0/", "CreateDate", true, true);
	//   43   84:aload_1         
	//   44   85:ldc2            #1125 <String "http://ns.adobe.com/xap/1.0/">
	//   45   88:ldc2            #1127 <String "CreateDate">
	//   46   91:iconst_1        
	//   47   92:iconst_1        
	//   48   93:invokestatic    #1133 <Method void XMPUtils.removeProperties(com.itextpdf.xmp.XMPMeta, String, String, boolean, boolean)>
		XMPUtils.removeProperties(((com.itextpdf.xmp.XMPMeta) (abyte0)), "http://ns.adobe.com/xap/1.0/", "ModifyDate", true, true);
	//   49   96:aload_1         
	//   50   97:ldc2            #1125 <String "http://ns.adobe.com/xap/1.0/">
	//   51  100:ldc2            #1135 <String "ModifyDate">
	//   52  103:iconst_1        
	//   53  104:iconst_1        
	//   54  105:invokestatic    #1133 <Method void XMPUtils.removeProperties(com.itextpdf.xmp.XMPMeta, String, String, boolean, boolean)>
		XMPUtils.removeProperties(((com.itextpdf.xmp.XMPMeta) (abyte0)), "http://ns.adobe.com/xap/1.0/", "MetadataDate", true, true);
	//   55  108:aload_1         
	//   56  109:ldc2            #1125 <String "http://ns.adobe.com/xap/1.0/">
	//   57  112:ldc2            #1137 <String "MetadataDate">
	//   58  115:iconst_1        
	//   59  116:iconst_1        
	//   60  117:invokestatic    #1133 <Method void XMPUtils.removeProperties(com.itextpdf.xmp.XMPMeta, String, String, boolean, boolean)>
		XMPUtils.removeProperties(((com.itextpdf.xmp.XMPMeta) (abyte0)), "http://ns.adobe.com/pdf/1.3/", "Producer", true, true);
	//   61  120:aload_1         
	//   62  121:ldc2            #1139 <String "http://ns.adobe.com/pdf/1.3/">
	//   63  124:ldc2            #1141 <String "Producer">
	//   64  127:iconst_1        
	//   65  128:iconst_1        
	//   66  129:invokestatic    #1133 <Method void XMPUtils.removeProperties(com.itextpdf.xmp.XMPMeta, String, String, boolean, boolean)>
		abyte2 = XMPMetaFactory.serializeToBuffer(((com.itextpdf.xmp.XMPMeta) (abyte0)), new SerializeOptions(8192));
	//   67  132:aload_1         
	//   68  133:new             #1143 <Class SerializeOptions>
	//   69  136:dup             
	//   70  137:sipush          8192
	//   71  140:invokespecial   #1144 <Method void SerializeOptions(int)>
	//   72  143:invokestatic    #1148 <Method byte[] XMPMetaFactory.serializeToBuffer(com.itextpdf.xmp.XMPMeta, SerializeOptions)>
	//   73  146:astore          4
		if(!compareXmls(abyte3, abyte2))
	//*  74  148:aload_0         
	//*  75  149:aload           5
	//*  76  151:aload           4
	//*  77  153:invokevirtual   #1150 <Method boolean compareXmls(byte[], byte[])>
	//*  78  156:ifne            183
			return "The XMP packages different!";
	//   79  159:ldc2            #1152 <String "The XMP packages different!">
	//   80  162:areturn         
		else
	//*  81  163:astore_1        
	//*  82  164:ldc2            #1114 <String "XMP parsing failure!">
	//*  83  167:areturn         
	//*  84  168:astore_1        
	//*  85  169:ldc2            #1114 <String "XMP parsing failure!">
	//*  86  172:areturn         
	//*  87  173:astore_1        
	//*  88  174:ldc2            #1114 <String "XMP parsing failure!">
	//*  89  177:areturn         
	//*  90  178:astore_1        
	//*  91  179:ldc2            #1114 <String "XMP parsing failure!">
	//*  92  182:areturn         
			return null;
	//   93  183:aconst_null     
	//   94  184:areturn         
		abyte0;
		return "XMP parsing failure!";
		abyte0;
		return "XMP parsing failure!";
		abyte0;
		return "XMP parsing failure!";
		abyte0;
		return "XMP parsing failure!";
	}

	public String getXmlReportName()
	{
		return xmlReportName;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field String xmlReportName>
	//    2    4:areturn         
	}

	public CompareTool setCompareByContentErrorsLimit(int i)
	{
		compareByContentErrorsLimit = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #100 <Field int compareByContentErrorsLimit>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public CompareTool setFloatAbsoluteError(float f)
	{
		floatComparisonError = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:f2d             
	//    3    3:putfield        #108 <Field double floatComparisonError>
		absoluteError = true;
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:putfield        #110 <Field boolean absoluteError>
		return this;
	//    7   11:aload_0         
	//    8   12:areturn         
	}

	public CompareTool setFloatRelativeError(float f)
	{
		floatComparisonError = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:f2d             
	//    3    3:putfield        #108 <Field double floatComparisonError>
		absoluteError = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #110 <Field boolean absoluteError>
		return this;
	//    7   11:aload_0         
	//    8   12:areturn         
	}

	public void setGenerateCompareByContentXmlReport(boolean flag)
	{
		generateCompareByContentXmlReport = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #102 <Field boolean generateCompareByContentXmlReport>
	//    3    5:return          
	}

	public void setXmlReportName(String s)
	{
		xmlReportName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #106 <Field String xmlReportName>
	//    3    5:return          
	}

	private static final String cannotOpenTargetDirectory = "Cannot open target directory for <filename>.";
	private static final String differentPages = "File <filename> differs on page <pagenumber>.";
	private static final String gsFailed = "GhostScript failed for <filename>.";
	private static final String ignoredAreasPrefix = "ignored_areas_";
	private static final String undefinedGsPath = "Path to GhostScript is not specified. Please use -DgsExec=<path_to_ghostscript> (e.g. -DgsExec=\"C:/Program Files/gs/gs9.14/bin/gswin32c.exe\")";
	private static final String unexpectedNumberOfPages = "Unexpected number of pages for <filename>.";
	private boolean absoluteError;
	private String cmpImage;
	List cmpPages;
	List cmpPagesRef;
	private String cmpPdf;
	private String cmpPdfName;
	private int compareByContentErrorsLimit;
	private String compareExec;
	private final String compareParams = " \"<image1>\" \"<image2>\" \"<difference>\"";
	private double floatComparisonError;
	private boolean generateCompareByContentXmlReport;
	private String gsExec;
	private final String gsParams = " -dNOPAUSE -dBATCH -sDEVICE=png16m -r150 -sOutputFile=<outputfile> <inputfile>";
	private String outImage;
	List outPages;
	List outPagesRef;
	private String outPdf;
	private String outPdfName;
	private String xmlReportName;


/*
	static String access$100(CompareTool comparetool)
	{
		return comparetool.outPdfName;
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field String outPdfName>
	//    2    4:areturn         
	}

*/


/*
	static String access$200(CompareTool comparetool)
	{
		return comparetool.cmpPdfName;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field String cmpPdfName>
	//    2    4:areturn         
	}

*/
}
