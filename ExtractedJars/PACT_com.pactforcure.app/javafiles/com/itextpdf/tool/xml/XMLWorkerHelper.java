// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.css.CSSFileWrapper;
import com.itextpdf.tool.xml.css.CssFile;
import com.itextpdf.tool.xml.css.CssFileProcessor;
import com.itextpdf.tool.xml.css.CssFilesImpl;
import com.itextpdf.tool.xml.css.StyleAttrCSSResolver;
import com.itextpdf.tool.xml.exceptions.RuntimeWorkerException;
import com.itextpdf.tool.xml.html.CssAppliersImpl;
import com.itextpdf.tool.xml.html.TagProcessorFactory;
import com.itextpdf.tool.xml.html.Tags;
import com.itextpdf.tool.xml.parser.XMLParser;
import com.itextpdf.tool.xml.pipeline.css.CSSResolver;
import com.itextpdf.tool.xml.pipeline.css.CssResolverPipeline;
import com.itextpdf.tool.xml.pipeline.end.ElementHandlerPipeline;
import com.itextpdf.tool.xml.pipeline.end.PdfWriterPipeline;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipeline;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext;
import java.io.*;
import java.nio.charset.Charset;

// Referenced classes of package com.itextpdf.tool.xml:
//			ElementList, XMLWorker, XMLWorkerFontProvider, ElementHandler

public class XMLWorkerHelper
{

	private XMLWorkerHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}

	public static CssFile getCSS(InputStream inputstream)
	{
		com/itextpdf/tool/xml/XMLWorkerHelper;
	//    0    0:ldc1            #2   <Class XMLWorkerHelper>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Object obj;
		obj = null;
	//    2    3:aconst_null     
	//    3    4:astore_3        
		if(inputstream == null)
			break MISSING_BLOCK_LABEL_92;
	//    4    5:aload_0         
	//    5    6:ifnull          92
		BufferedReader bufferedreader;
		obj = ((Object) (new CssFileProcessor()));
	//    6    9:new             #25  <Class CssFileProcessor>
	//    7   12:dup             
	//    8   13:invokespecial   #26  <Method void CssFileProcessor()>
	//    9   16:astore_3        
		bufferedreader = new BufferedReader(((Reader) (new InputStreamReader(inputstream))));
	//   10   17:new             #28  <Class BufferedReader>
	//   11   20:dup             
	//   12   21:new             #30  <Class InputStreamReader>
	//   13   24:dup             
	//   14   25:aload_0         
	//   15   26:invokespecial   #33  <Method void InputStreamReader(InputStream)>
	//   16   29:invokespecial   #36  <Method void BufferedReader(Reader)>
	//   17   32:astore          4
		char ac[] = new char[8192];
	//   18   34:sipush          8192
	//   19   37:newarray        char[]
	//   20   39:astore          5
_L4:
		int j = bufferedreader.read(ac);
	//   21   41:aload           4
	//   22   43:aload           5
	//   23   45:invokevirtual   #40  <Method int BufferedReader.read(char[])>
	//   24   48:istore_2        
		int i;
		if(j <= 0)
			break; /* Loop/switch isn't completed */
	//   25   49:iload_2         
	//   26   50:ifle            75
		i = 0;
	//   27   53:iconst_0        
	//   28   54:istore_1        
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   29   55:iload_1         
	//   30   56:iload_2         
	//   31   57:icmpge          41
		((CssFileProcessor) (obj)).process(((int) (ac[i])));
	//   32   60:aload_3         
	//   33   61:aload           5
	//   34   63:iload_1         
	//   35   64:caload          
	//   36   65:invokevirtual   #44  <Method void CssFileProcessor.process(int)>
		i++;
	//   37   68:iload_1         
	//   38   69:iconst_1        
	//   39   70:iadd            
	//   40   71:istore_1        
		if(true) goto _L2; else goto _L1
_L1:
		if(true) goto _L4; else goto _L3
	//*  41   72:goto            55
_L3:
		obj = ((Object) (new CSSFileWrapper(((CssFileProcessor) (obj)).getCss(), true)));
	//   42   75:new             #46  <Class CSSFileWrapper>
	//   43   78:dup             
	//   44   79:aload_3         
	//   45   80:invokevirtual   #50  <Method CssFile CssFileProcessor.getCss()>
	//   46   83:iconst_1        
	//   47   84:invokespecial   #53  <Method void CSSFileWrapper(CssFile, boolean)>
	//   48   87:astore_3        
		inputstream.close();
	//   49   88:aload_0         
	//   50   89:invokevirtual   #58  <Method void InputStream.close()>
		com/itextpdf/tool/xml/XMLWorkerHelper;
	//   51   92:ldc1            #2   <Class XMLWorkerHelper>
		JVM INSTR monitorexit ;
	//   52   94:monitorexit     
		return ((CssFile) (obj));
	//   53   95:aload_3         
	//   54   96:areturn         
		inputstream;
	//   55   97:astore_0        
		throw new RuntimeWorkerException(((Throwable) (inputstream)));
	//   56   98:new             #60  <Class RuntimeWorkerException>
	//   57  101:dup             
	//   58  102:aload_0         
	//   59  103:invokespecial   #63  <Method void RuntimeWorkerException(Throwable)>
	//   60  106:athrow          
		inputstream;
	//   61  107:astore_0        
_L6:
		com/itextpdf/tool/xml/XMLWorkerHelper;
	//   62  108:ldc1            #2   <Class XMLWorkerHelper>
		JVM INSTR monitorexit ;
	//   63  110:monitorexit     
		throw inputstream;
	//   64  111:aload_0         
	//   65  112:athrow          
		Object obj1;
		obj1;
	//   66  113:astore_3        
		throw new RuntimeWorkerException(((Throwable) (obj1)));
	//   67  114:new             #60  <Class RuntimeWorkerException>
	//   68  117:dup             
	//   69  118:aload_3         
	//   70  119:invokespecial   #63  <Method void RuntimeWorkerException(Throwable)>
	//   71  122:athrow          
		obj1;
	//   72  123:astore_3        
		inputstream.close();
	//   73  124:aload_0         
	//   74  125:invokevirtual   #58  <Method void InputStream.close()>
		throw obj1;
	//   75  128:aload_3         
	//   76  129:athrow          
		inputstream;
	//   77  130:astore_0        
		throw new RuntimeWorkerException(((Throwable) (inputstream)));
	//   78  131:new             #60  <Class RuntimeWorkerException>
	//   79  134:dup             
	//   80  135:aload_0         
	//   81  136:invokespecial   #63  <Method void RuntimeWorkerException(Throwable)>
	//   82  139:athrow          
		inputstream;
	//   83  140:astore_0        
		if(true) goto _L6; else goto _L5
_L5:
	//*  84  141:goto            108
	}

	public static XMLWorkerHelper getInstance()
	{
		com/itextpdf/tool/xml/XMLWorkerHelper;
	//    0    0:ldc1            #2   <Class XMLWorkerHelper>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		XMLWorkerHelper xmlworkerhelper = myself;
	//    2    3:getstatic       #17  <Field XMLWorkerHelper myself>
	//    3    6:astore_0        
		com/itextpdf/tool/xml/XMLWorkerHelper;
	//    4    7:ldc1            #2   <Class XMLWorkerHelper>
		JVM INSTR monitorexit ;
	//    5    9:monitorexit     
		return xmlworkerhelper;
	//    6   10:aload_0         
	//    7   11:areturn         
		Exception exception;
		exception;
	//    8   12:astore_0        
	//*   9   13:ldc1            #2   <Class XMLWorkerHelper>
		throw exception;
	//   10   15:monitorexit     
	//   11   16:aload_0         
	//   12   17:athrow          
	}

	public static ElementList parseToElementList(String s, String s1)
		throws IOException
	{
		StyleAttrCSSResolver styleattrcssresolver = new StyleAttrCSSResolver();
	//    0    0:new             #69  <Class StyleAttrCSSResolver>
	//    1    3:dup             
	//    2    4:invokespecial   #70  <Method void StyleAttrCSSResolver()>
	//    3    7:astore_2        
		if(s1 != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          32
			((CSSResolver) (styleattrcssresolver)).addCss(getCSS(((InputStream) (new ByteArrayInputStream(s1.getBytes())))));
	//    6   12:aload_2         
	//    7   13:new             #72  <Class ByteArrayInputStream>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokevirtual   #78  <Method byte[] String.getBytes()>
	//   11   21:invokespecial   #81  <Method void ByteArrayInputStream(byte[])>
	//   12   24:invokestatic    #83  <Method CssFile getCSS(InputStream)>
	//   13   27:invokeinterface #89  <Method void CSSResolver.addCss(CssFile)>
		s1 = ((String) (new HtmlPipelineContext(((com.itextpdf.tool.xml.html.CssAppliers) (new CssAppliersImpl(((FontProvider) (FontFactory.getFontImp()))))))));
	//   14   32:new             #91  <Class HtmlPipelineContext>
	//   15   35:dup             
	//   16   36:new             #93  <Class CssAppliersImpl>
	//   17   39:dup             
	//   18   40:invokestatic    #99  <Method com.itextpdf.text.FontFactoryImp FontFactory.getFontImp()>
	//   19   43:invokespecial   #102 <Method void CssAppliersImpl(FontProvider)>
	//   20   46:invokespecial   #105 <Method void HtmlPipelineContext(com.itextpdf.tool.xml.html.CssAppliers)>
	//   21   49:astore_1        
		((HtmlPipelineContext) (s1)).setTagFactory(Tags.getHtmlTagProcessorFactory());
	//   22   50:aload_1         
	//   23   51:invokestatic    #111 <Method TagProcessorFactory Tags.getHtmlTagProcessorFactory()>
	//   24   54:invokevirtual   #115 <Method HtmlPipelineContext HtmlPipelineContext.setTagFactory(TagProcessorFactory)>
	//   25   57:pop             
		((HtmlPipelineContext) (s1)).autoBookmark(false);
	//   26   58:aload_1         
	//   27   59:iconst_0        
	//   28   60:invokevirtual   #119 <Method HtmlPipelineContext HtmlPipelineContext.autoBookmark(boolean)>
	//   29   63:pop             
		ElementList elementlist = new ElementList();
	//   30   64:new             #121 <Class ElementList>
	//   31   67:dup             
	//   32   68:invokespecial   #122 <Method void ElementList()>
	//   33   71:astore_3        
		(new XMLParser(((com.itextpdf.tool.xml.parser.XMLParserListener) (new XMLWorker(((Pipeline) (new CssResolverPipeline(((CSSResolver) (styleattrcssresolver)), ((Pipeline) (new HtmlPipeline(((HtmlPipelineContext) (s1)), ((Pipeline) (new ElementHandlerPipeline(((ElementHandler) (elementlist)), ((Pipeline) (null))))))))))), true))))).parse(((InputStream) (new ByteArrayInputStream(s.getBytes()))));
	//   34   72:new             #124 <Class XMLParser>
	//   35   75:dup             
	//   36   76:new             #126 <Class XMLWorker>
	//   37   79:dup             
	//   38   80:new             #128 <Class CssResolverPipeline>
	//   39   83:dup             
	//   40   84:aload_2         
	//   41   85:new             #130 <Class HtmlPipeline>
	//   42   88:dup             
	//   43   89:aload_1         
	//   44   90:new             #132 <Class ElementHandlerPipeline>
	//   45   93:dup             
	//   46   94:aload_3         
	//   47   95:aconst_null     
	//   48   96:invokespecial   #135 <Method void ElementHandlerPipeline(ElementHandler, Pipeline)>
	//   49   99:invokespecial   #138 <Method void HtmlPipeline(HtmlPipelineContext, Pipeline)>
	//   50  102:invokespecial   #141 <Method void CssResolverPipeline(CSSResolver, Pipeline)>
	//   51  105:iconst_1        
	//   52  106:invokespecial   #144 <Method void XMLWorker(Pipeline, boolean)>
	//   53  109:invokespecial   #147 <Method void XMLParser(com.itextpdf.tool.xml.parser.XMLParserListener)>
	//   54  112:new             #72  <Class ByteArrayInputStream>
	//   55  115:dup             
	//   56  116:aload_0         
	//   57  117:invokevirtual   #78  <Method byte[] String.getBytes()>
	//   58  120:invokespecial   #81  <Method void ByteArrayInputStream(byte[])>
	//   59  123:invokevirtual   #150 <Method void XMLParser.parse(InputStream)>
		return elementlist;
	//   60  126:aload_3         
	//   61  127:areturn         
	}

	public CssFile getDefaultCSS()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		CssFile cssfile;
		if(defaultCssFile == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #154 <Field CssFile defaultCssFile>
	//*   4    6:ifnonnull       23
			defaultCssFile = getCSS(((Class) (com/itextpdf/tool/xml/XMLWorkerHelper)).getResourceAsStream("/default.css"));
	//    5    9:aload_0         
	//    6   10:ldc1            #2   <Class XMLWorkerHelper>
	//    7   12:ldc1            #156 <String "/default.css">
	//    8   14:invokevirtual   #162 <Method InputStream Class.getResourceAsStream(String)>
	//    9   17:invokestatic    #83  <Method CssFile getCSS(InputStream)>
	//   10   20:putfield        #154 <Field CssFile defaultCssFile>
		cssfile = defaultCssFile;
	//   11   23:aload_0         
	//   12   24:getfield        #154 <Field CssFile defaultCssFile>
	//   13   27:astore_1        
		this;
	//   14   28:aload_0         
		JVM INSTR monitorexit ;
	//   15   29:monitorexit     
		return cssfile;
	//   16   30:aload_1         
	//   17   31:areturn         
		Exception exception;
		exception;
	//   18   32:astore_1        
	//*  19   33:aload_0         
		throw exception;
	//   20   34:monitorexit     
	//   21   35:aload_1         
	//   22   36:athrow          
	}

	public CSSResolver getDefaultCssResolver(boolean flag)
	{
		StyleAttrCSSResolver styleattrcssresolver = new StyleAttrCSSResolver();
	//    0    0:new             #69  <Class StyleAttrCSSResolver>
	//    1    3:dup             
	//    2    4:invokespecial   #70  <Method void StyleAttrCSSResolver()>
	//    3    7:astore_2        
		if(flag)
	//*   4    8:iload_1         
	//*   5    9:ifeq            22
			((CSSResolver) (styleattrcssresolver)).addCss(getDefaultCSS());
	//    6   12:aload_2         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #166 <Method CssFile getDefaultCSS()>
	//    9   17:invokeinterface #89  <Method void CSSResolver.addCss(CssFile)>
		return ((CSSResolver) (styleattrcssresolver));
	//   10   22:aload_2         
	//   11   23:areturn         
	}

	protected TagProcessorFactory getDefaultTagProcessorFactory()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		TagProcessorFactory tagprocessorfactory;
		if(tpf == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #169 <Field TagProcessorFactory tpf>
	//*   4    6:ifnonnull       16
			tpf = Tags.getHtmlTagProcessorFactory();
	//    5    9:aload_0         
	//    6   10:invokestatic    #111 <Method TagProcessorFactory Tags.getHtmlTagProcessorFactory()>
	//    7   13:putfield        #169 <Field TagProcessorFactory tpf>
		tagprocessorfactory = tpf;
	//    8   16:aload_0         
	//    9   17:getfield        #169 <Field TagProcessorFactory tpf>
	//   10   20:astore_1        
		this;
	//   11   21:aload_0         
		JVM INSTR monitorexit ;
	//   12   22:monitorexit     
		return tagprocessorfactory;
	//   13   23:aload_1         
	//   14   24:areturn         
		Exception exception;
		exception;
	//   15   25:astore_1        
	//*  16   26:aload_0         
		throw exception;
	//   17   27:monitorexit     
	//   18   28:aload_1         
	//   19   29:athrow          
	}

	public void parseXHtml(PdfWriter pdfwriter, Document document, InputStream inputstream)
		throws IOException
	{
		parseXHtml(pdfwriter, document, inputstream, ((Class) (com/itextpdf/tool/xml/XMLWorkerHelper)).getResourceAsStream("/default.css"), ((Charset) (null)), ((FontProvider) (new XMLWorkerFontProvider())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:ldc1            #2   <Class XMLWorkerHelper>
	//    5    6:ldc1            #156 <String "/default.css">
	//    6    8:invokevirtual   #162 <Method InputStream Class.getResourceAsStream(String)>
	//    7   11:aconst_null     
	//    8   12:new             #173 <Class XMLWorkerFontProvider>
	//    9   15:dup             
	//   10   16:invokespecial   #174 <Method void XMLWorkerFontProvider()>
	//   11   19:invokevirtual   #177 <Method void parseXHtml(PdfWriter, Document, InputStream, InputStream, Charset, FontProvider)>
	//   12   22:return          
	}

	public void parseXHtml(PdfWriter pdfwriter, Document document, InputStream inputstream, InputStream inputstream1)
		throws IOException
	{
		parseXHtml(pdfwriter, document, inputstream, inputstream1, ((Charset) (null)), ((FontProvider) (new XMLWorkerFontProvider())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aconst_null     
	//    6    7:new             #173 <Class XMLWorkerFontProvider>
	//    7   10:dup             
	//    8   11:invokespecial   #174 <Method void XMLWorkerFontProvider()>
	//    9   14:invokevirtual   #177 <Method void parseXHtml(PdfWriter, Document, InputStream, InputStream, Charset, FontProvider)>
	//   10   17:return          
	}

	public void parseXHtml(PdfWriter pdfwriter, Document document, InputStream inputstream, InputStream inputstream1, FontProvider fontprovider)
		throws IOException
	{
		parseXHtml(pdfwriter, document, inputstream, inputstream1, ((Charset) (null)), fontprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aconst_null     
	//    6    7:aload           5
	//    7    9:invokevirtual   #177 <Method void parseXHtml(PdfWriter, Document, InputStream, InputStream, Charset, FontProvider)>
	//    8   12:return          
	}

	public void parseXHtml(PdfWriter pdfwriter, Document document, InputStream inputstream, InputStream inputstream1, Charset charset)
		throws IOException
	{
		parseXHtml(pdfwriter, document, inputstream, inputstream1, charset, ((FontProvider) (new XMLWorkerFontProvider())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:new             #173 <Class XMLWorkerFontProvider>
	//    7   11:dup             
	//    8   12:invokespecial   #174 <Method void XMLWorkerFontProvider()>
	//    9   15:invokevirtual   #177 <Method void parseXHtml(PdfWriter, Document, InputStream, InputStream, Charset, FontProvider)>
	//   10   18:return          
	}

	public void parseXHtml(PdfWriter pdfwriter, Document document, InputStream inputstream, InputStream inputstream1, Charset charset, FontProvider fontprovider)
		throws IOException
	{
		parseXHtml(pdfwriter, document, inputstream, inputstream1, charset, fontprovider, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:aconst_null     
	//    8   11:invokevirtual   #183 <Method void parseXHtml(PdfWriter, Document, InputStream, InputStream, Charset, FontProvider, String)>
	//    9   14:return          
	}

	public void parseXHtml(PdfWriter pdfwriter, Document document, InputStream inputstream, InputStream inputstream1, Charset charset, FontProvider fontprovider, String s)
		throws IOException
	{
		CssFilesImpl cssfilesimpl = new CssFilesImpl();
	//    0    0:new             #185 <Class CssFilesImpl>
	//    1    3:dup             
	//    2    4:invokespecial   #186 <Method void CssFilesImpl()>
	//    3    7:astore          8
		if(inputstream1 != null)
	//*   4    9:aload           4
	//*   5   11:ifnull          134
			cssfilesimpl.add(getCSS(inputstream1));
	//    6   14:aload           8
	//    7   16:aload           4
	//    8   18:invokestatic    #83  <Method CssFile getCSS(InputStream)>
	//    9   21:invokevirtual   #189 <Method void CssFilesImpl.add(CssFile)>
		else
	//*  10   24:new             #69  <Class StyleAttrCSSResolver>
	//*  11   27:dup             
	//*  12   28:aload           8
	//*  13   30:invokespecial   #192 <Method void StyleAttrCSSResolver(com.itextpdf.tool.xml.css.CssFiles)>
	//*  14   33:astore          4
	//*  15   35:new             #91  <Class HtmlPipelineContext>
	//*  16   38:dup             
	//*  17   39:new             #93  <Class CssAppliersImpl>
	//*  18   42:dup             
	//*  19   43:aload           6
	//*  20   45:invokespecial   #102 <Method void CssAppliersImpl(FontProvider)>
	//*  21   48:invokespecial   #105 <Method void HtmlPipelineContext(com.itextpdf.tool.xml.html.CssAppliers)>
	//*  22   51:astore          6
	//*  23   53:aload           6
	//*  24   55:iconst_1        
	//*  25   56:invokevirtual   #195 <Method HtmlPipelineContext HtmlPipelineContext.setAcceptUnknown(boolean)>
	//*  26   59:iconst_1        
	//*  27   60:invokevirtual   #119 <Method HtmlPipelineContext HtmlPipelineContext.autoBookmark(boolean)>
	//*  28   63:aload_0         
	//*  29   64:invokevirtual   #197 <Method TagProcessorFactory getDefaultTagProcessorFactory()>
	//*  30   67:invokevirtual   #115 <Method HtmlPipelineContext HtmlPipelineContext.setTagFactory(TagProcessorFactory)>
	//*  31   70:aload           7
	//*  32   72:invokevirtual   #201 <Method void HtmlPipelineContext.setResourcesRootPath(String)>
	//*  33   75:new             #124 <Class XMLParser>
	//*  34   78:dup             
	//*  35   79:iconst_1        
	//*  36   80:new             #126 <Class XMLWorker>
	//*  37   83:dup             
	//*  38   84:new             #128 <Class CssResolverPipeline>
	//*  39   87:dup             
	//*  40   88:aload           4
	//*  41   90:new             #130 <Class HtmlPipeline>
	//*  42   93:dup             
	//*  43   94:aload           6
	//*  44   96:new             #203 <Class PdfWriterPipeline>
	//*  45   99:dup             
	//*  46  100:aload_2         
	//*  47  101:aload_1         
	//*  48  102:invokespecial   #206 <Method void PdfWriterPipeline(Document, PdfWriter)>
	//*  49  105:invokespecial   #138 <Method void HtmlPipeline(HtmlPipelineContext, Pipeline)>
	//*  50  108:invokespecial   #141 <Method void CssResolverPipeline(CSSResolver, Pipeline)>
	//*  51  111:iconst_1        
	//*  52  112:invokespecial   #144 <Method void XMLWorker(Pipeline, boolean)>
	//*  53  115:aload           5
	//*  54  117:invokespecial   #209 <Method void XMLParser(boolean, com.itextpdf.tool.xml.parser.XMLParserListener, Charset)>
	//*  55  120:astore_1        
	//*  56  121:aload           5
	//*  57  123:ifnull          146
	//*  58  126:aload_1         
	//*  59  127:aload_3         
	//*  60  128:aload           5
	//*  61  130:invokevirtual   #212 <Method void XMLParser.parse(InputStream, Charset)>
	//*  62  133:return          
			cssfilesimpl.add(getDefaultCSS());
	//   63  134:aload           8
	//   64  136:aload_0         
	//   65  137:invokevirtual   #166 <Method CssFile getDefaultCSS()>
	//   66  140:invokevirtual   #189 <Method void CssFilesImpl.add(CssFile)>
		inputstream1 = ((InputStream) (new StyleAttrCSSResolver(((com.itextpdf.tool.xml.css.CssFiles) (cssfilesimpl)))));
		fontprovider = ((FontProvider) (new HtmlPipelineContext(((com.itextpdf.tool.xml.html.CssAppliers) (new CssAppliersImpl(fontprovider))))));
		((HtmlPipelineContext) (fontprovider)).setAcceptUnknown(true).autoBookmark(true).setTagFactory(getDefaultTagProcessorFactory()).setResourcesRootPath(s);
		pdfwriter = ((PdfWriter) (new XMLParser(true, ((com.itextpdf.tool.xml.parser.XMLParserListener) (new XMLWorker(((Pipeline) (new CssResolverPipeline(((CSSResolver) (inputstream1)), ((Pipeline) (new HtmlPipeline(((HtmlPipelineContext) (fontprovider)), ((Pipeline) (new PdfWriterPipeline(document, pdfwriter))))))))), true))), charset)));
		if(charset != null)
		{
			((XMLParser) (pdfwriter)).parse(inputstream, charset);
			return;
		} else
	//*  67  143:goto            24
		{
			((XMLParser) (pdfwriter)).parse(inputstream);
	//   68  146:aload_1         
	//   69  147:aload_3         
	//   70  148:invokevirtual   #150 <Method void XMLParser.parse(InputStream)>
			return;
	//   71  151:return          
		}
	}

	public void parseXHtml(PdfWriter pdfwriter, Document document, InputStream inputstream, Charset charset)
		throws IOException
	{
		parseXHtml(pdfwriter, document, inputstream, ((Class) (com/itextpdf/tool/xml/XMLWorkerHelper)).getResourceAsStream("/default.css"), charset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:ldc1            #2   <Class XMLWorkerHelper>
	//    5    6:ldc1            #156 <String "/default.css">
	//    6    8:invokevirtual   #162 <Method InputStream Class.getResourceAsStream(String)>
	//    7   11:aload           4
	//    8   13:invokevirtual   #215 <Method void parseXHtml(PdfWriter, Document, InputStream, InputStream, Charset)>
	//    9   16:return          
	}

	public void parseXHtml(PdfWriter pdfwriter, Document document, InputStream inputstream, Charset charset, FontProvider fontprovider)
		throws IOException
	{
		parseXHtml(pdfwriter, document, inputstream, ((Class) (com/itextpdf/tool/xml/XMLWorkerHelper)).getResourceAsStream("/default.css"), charset, fontprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:ldc1            #2   <Class XMLWorkerHelper>
	//    5    6:ldc1            #156 <String "/default.css">
	//    6    8:invokevirtual   #162 <Method InputStream Class.getResourceAsStream(String)>
	//    7   11:aload           4
	//    8   13:aload           5
	//    9   15:invokevirtual   #177 <Method void parseXHtml(PdfWriter, Document, InputStream, InputStream, Charset, FontProvider)>
	//   10   18:return          
	}

	public void parseXHtml(PdfWriter pdfwriter, Document document, Reader reader)
		throws IOException
	{
		Object obj = ((Object) (new CssFilesImpl()));
	//    0    0:new             #185 <Class CssFilesImpl>
	//    1    3:dup             
	//    2    4:invokespecial   #186 <Method void CssFilesImpl()>
	//    3    7:astore          4
		((CssFilesImpl) (obj)).add(getDefaultCSS());
	//    4    9:aload           4
	//    5   11:aload_0         
	//    6   12:invokevirtual   #166 <Method CssFile getDefaultCSS()>
	//    7   15:invokevirtual   #189 <Method void CssFilesImpl.add(CssFile)>
		obj = ((Object) (new StyleAttrCSSResolver(((com.itextpdf.tool.xml.css.CssFiles) (obj)))));
	//    8   18:new             #69  <Class StyleAttrCSSResolver>
	//    9   21:dup             
	//   10   22:aload           4
	//   11   24:invokespecial   #192 <Method void StyleAttrCSSResolver(com.itextpdf.tool.xml.css.CssFiles)>
	//   12   27:astore          4
		HtmlPipelineContext htmlpipelinecontext = new HtmlPipelineContext(((com.itextpdf.tool.xml.html.CssAppliers) (null)));
	//   13   29:new             #91  <Class HtmlPipelineContext>
	//   14   32:dup             
	//   15   33:aconst_null     
	//   16   34:invokespecial   #105 <Method void HtmlPipelineContext(com.itextpdf.tool.xml.html.CssAppliers)>
	//   17   37:astore          5
		htmlpipelinecontext.setAcceptUnknown(true).autoBookmark(true).setTagFactory(getDefaultTagProcessorFactory());
	//   18   39:aload           5
	//   19   41:iconst_1        
	//   20   42:invokevirtual   #195 <Method HtmlPipelineContext HtmlPipelineContext.setAcceptUnknown(boolean)>
	//   21   45:iconst_1        
	//   22   46:invokevirtual   #119 <Method HtmlPipelineContext HtmlPipelineContext.autoBookmark(boolean)>
	//   23   49:aload_0         
	//   24   50:invokevirtual   #197 <Method TagProcessorFactory getDefaultTagProcessorFactory()>
	//   25   53:invokevirtual   #115 <Method HtmlPipelineContext HtmlPipelineContext.setTagFactory(TagProcessorFactory)>
	//   26   56:pop             
		pdfwriter = ((PdfWriter) (new XMLWorker(((Pipeline) (new CssResolverPipeline(((CSSResolver) (obj)), ((Pipeline) (new HtmlPipeline(htmlpipelinecontext, ((Pipeline) (new PdfWriterPipeline(document, pdfwriter))))))))), true)));
	//   27   57:new             #126 <Class XMLWorker>
	//   28   60:dup             
	//   29   61:new             #128 <Class CssResolverPipeline>
	//   30   64:dup             
	//   31   65:aload           4
	//   32   67:new             #130 <Class HtmlPipeline>
	//   33   70:dup             
	//   34   71:aload           5
	//   35   73:new             #203 <Class PdfWriterPipeline>
	//   36   76:dup             
	//   37   77:aload_2         
	//   38   78:aload_1         
	//   39   79:invokespecial   #206 <Method void PdfWriterPipeline(Document, PdfWriter)>
	//   40   82:invokespecial   #138 <Method void HtmlPipeline(HtmlPipelineContext, Pipeline)>
	//   41   85:invokespecial   #141 <Method void CssResolverPipeline(CSSResolver, Pipeline)>
	//   42   88:iconst_1        
	//   43   89:invokespecial   #144 <Method void XMLWorker(Pipeline, boolean)>
	//   44   92:astore_1        
		document = ((Document) (new XMLParser()));
	//   45   93:new             #124 <Class XMLParser>
	//   46   96:dup             
	//   47   97:invokespecial   #218 <Method void XMLParser()>
	//   48  100:astore_2        
		((XMLParser) (document)).addListener(((com.itextpdf.tool.xml.parser.XMLParserListener) (pdfwriter)));
	//   49  101:aload_2         
	//   50  102:aload_1         
	//   51  103:invokevirtual   #222 <Method XMLParser XMLParser.addListener(com.itextpdf.tool.xml.parser.XMLParserListener)>
	//   52  106:pop             
		((XMLParser) (document)).parse(reader);
	//   53  107:aload_2         
	//   54  108:aload_3         
	//   55  109:invokevirtual   #224 <Method void XMLParser.parse(Reader)>
	//   56  112:return          
	}

	public void parseXHtml(ElementHandler elementhandler, InputStream inputstream, Charset charset)
		throws IOException
	{
		Object obj = ((Object) (new CssFilesImpl()));
	//    0    0:new             #185 <Class CssFilesImpl>
	//    1    3:dup             
	//    2    4:invokespecial   #186 <Method void CssFilesImpl()>
	//    3    7:astore          4
		((CssFilesImpl) (obj)).add(getDefaultCSS());
	//    4    9:aload           4
	//    5   11:aload_0         
	//    6   12:invokevirtual   #166 <Method CssFile getDefaultCSS()>
	//    7   15:invokevirtual   #189 <Method void CssFilesImpl.add(CssFile)>
		obj = ((Object) (new StyleAttrCSSResolver(((com.itextpdf.tool.xml.css.CssFiles) (obj)))));
	//    8   18:new             #69  <Class StyleAttrCSSResolver>
	//    9   21:dup             
	//   10   22:aload           4
	//   11   24:invokespecial   #192 <Method void StyleAttrCSSResolver(com.itextpdf.tool.xml.css.CssFiles)>
	//   12   27:astore          4
		HtmlPipelineContext htmlpipelinecontext = new HtmlPipelineContext(((com.itextpdf.tool.xml.html.CssAppliers) (null)));
	//   13   29:new             #91  <Class HtmlPipelineContext>
	//   14   32:dup             
	//   15   33:aconst_null     
	//   16   34:invokespecial   #105 <Method void HtmlPipelineContext(com.itextpdf.tool.xml.html.CssAppliers)>
	//   17   37:astore          5
		htmlpipelinecontext.setAcceptUnknown(true).autoBookmark(true).setTagFactory(getDefaultTagProcessorFactory());
	//   18   39:aload           5
	//   19   41:iconst_1        
	//   20   42:invokevirtual   #195 <Method HtmlPipelineContext HtmlPipelineContext.setAcceptUnknown(boolean)>
	//   21   45:iconst_1        
	//   22   46:invokevirtual   #119 <Method HtmlPipelineContext HtmlPipelineContext.autoBookmark(boolean)>
	//   23   49:aload_0         
	//   24   50:invokevirtual   #197 <Method TagProcessorFactory getDefaultTagProcessorFactory()>
	//   25   53:invokevirtual   #115 <Method HtmlPipelineContext HtmlPipelineContext.setTagFactory(TagProcessorFactory)>
	//   26   56:pop             
		elementhandler = ((ElementHandler) (new XMLParser(true, ((com.itextpdf.tool.xml.parser.XMLParserListener) (new XMLWorker(((Pipeline) (new CssResolverPipeline(((CSSResolver) (obj)), ((Pipeline) (new HtmlPipeline(htmlpipelinecontext, ((Pipeline) (new ElementHandlerPipeline(elementhandler, ((Pipeline) (null))))))))))), true))), charset)));
	//   27   57:new             #124 <Class XMLParser>
	//   28   60:dup             
	//   29   61:iconst_1        
	//   30   62:new             #126 <Class XMLWorker>
	//   31   65:dup             
	//   32   66:new             #128 <Class CssResolverPipeline>
	//   33   69:dup             
	//   34   70:aload           4
	//   35   72:new             #130 <Class HtmlPipeline>
	//   36   75:dup             
	//   37   76:aload           5
	//   38   78:new             #132 <Class ElementHandlerPipeline>
	//   39   81:dup             
	//   40   82:aload_1         
	//   41   83:aconst_null     
	//   42   84:invokespecial   #135 <Method void ElementHandlerPipeline(ElementHandler, Pipeline)>
	//   43   87:invokespecial   #138 <Method void HtmlPipeline(HtmlPipelineContext, Pipeline)>
	//   44   90:invokespecial   #141 <Method void CssResolverPipeline(CSSResolver, Pipeline)>
	//   45   93:iconst_1        
	//   46   94:invokespecial   #144 <Method void XMLWorker(Pipeline, boolean)>
	//   47   97:aload_3         
	//   48   98:invokespecial   #209 <Method void XMLParser(boolean, com.itextpdf.tool.xml.parser.XMLParserListener, Charset)>
	//   49  101:astore_1        
		if(charset != null)
	//*  50  102:aload_3         
	//*  51  103:ifnull          113
		{
			((XMLParser) (elementhandler)).parse(inputstream, charset);
	//   52  106:aload_1         
	//   53  107:aload_2         
	//   54  108:aload_3         
	//   55  109:invokevirtual   #212 <Method void XMLParser.parse(InputStream, Charset)>
			return;
	//   56  112:return          
		} else
		{
			((XMLParser) (elementhandler)).parse(inputstream);
	//   57  113:aload_1         
	//   58  114:aload_2         
	//   59  115:invokevirtual   #150 <Method void XMLParser.parse(InputStream)>
			return;
	//   60  118:return          
		}
	}

	public void parseXHtml(ElementHandler elementhandler, Reader reader)
		throws IOException
	{
		Object obj = ((Object) (new CssFilesImpl()));
	//    0    0:new             #185 <Class CssFilesImpl>
	//    1    3:dup             
	//    2    4:invokespecial   #186 <Method void CssFilesImpl()>
	//    3    7:astore_3        
		((CssFilesImpl) (obj)).add(getDefaultCSS());
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #166 <Method CssFile getDefaultCSS()>
	//    7   13:invokevirtual   #189 <Method void CssFilesImpl.add(CssFile)>
		obj = ((Object) (new StyleAttrCSSResolver(((com.itextpdf.tool.xml.css.CssFiles) (obj)))));
	//    8   16:new             #69  <Class StyleAttrCSSResolver>
	//    9   19:dup             
	//   10   20:aload_3         
	//   11   21:invokespecial   #192 <Method void StyleAttrCSSResolver(com.itextpdf.tool.xml.css.CssFiles)>
	//   12   24:astore_3        
		HtmlPipelineContext htmlpipelinecontext = new HtmlPipelineContext(((com.itextpdf.tool.xml.html.CssAppliers) (null)));
	//   13   25:new             #91  <Class HtmlPipelineContext>
	//   14   28:dup             
	//   15   29:aconst_null     
	//   16   30:invokespecial   #105 <Method void HtmlPipelineContext(com.itextpdf.tool.xml.html.CssAppliers)>
	//   17   33:astore          4
		htmlpipelinecontext.setAcceptUnknown(true).autoBookmark(true).setTagFactory(getDefaultTagProcessorFactory());
	//   18   35:aload           4
	//   19   37:iconst_1        
	//   20   38:invokevirtual   #195 <Method HtmlPipelineContext HtmlPipelineContext.setAcceptUnknown(boolean)>
	//   21   41:iconst_1        
	//   22   42:invokevirtual   #119 <Method HtmlPipelineContext HtmlPipelineContext.autoBookmark(boolean)>
	//   23   45:aload_0         
	//   24   46:invokevirtual   #197 <Method TagProcessorFactory getDefaultTagProcessorFactory()>
	//   25   49:invokevirtual   #115 <Method HtmlPipelineContext HtmlPipelineContext.setTagFactory(TagProcessorFactory)>
	//   26   52:pop             
		elementhandler = ((ElementHandler) (new XMLWorker(((Pipeline) (new CssResolverPipeline(((CSSResolver) (obj)), ((Pipeline) (new HtmlPipeline(htmlpipelinecontext, ((Pipeline) (new ElementHandlerPipeline(elementhandler, ((Pipeline) (null))))))))))), true)));
	//   27   53:new             #126 <Class XMLWorker>
	//   28   56:dup             
	//   29   57:new             #128 <Class CssResolverPipeline>
	//   30   60:dup             
	//   31   61:aload_3         
	//   32   62:new             #130 <Class HtmlPipeline>
	//   33   65:dup             
	//   34   66:aload           4
	//   35   68:new             #132 <Class ElementHandlerPipeline>
	//   36   71:dup             
	//   37   72:aload_1         
	//   38   73:aconst_null     
	//   39   74:invokespecial   #135 <Method void ElementHandlerPipeline(ElementHandler, Pipeline)>
	//   40   77:invokespecial   #138 <Method void HtmlPipeline(HtmlPipelineContext, Pipeline)>
	//   41   80:invokespecial   #141 <Method void CssResolverPipeline(CSSResolver, Pipeline)>
	//   42   83:iconst_1        
	//   43   84:invokespecial   #144 <Method void XMLWorker(Pipeline, boolean)>
	//   44   87:astore_1        
		obj = ((Object) (new XMLParser()));
	//   45   88:new             #124 <Class XMLParser>
	//   46   91:dup             
	//   47   92:invokespecial   #218 <Method void XMLParser()>
	//   48   95:astore_3        
		((XMLParser) (obj)).addListener(((com.itextpdf.tool.xml.parser.XMLParserListener) (elementhandler)));
	//   49   96:aload_3         
	//   50   97:aload_1         
	//   51   98:invokevirtual   #222 <Method XMLParser XMLParser.addListener(com.itextpdf.tool.xml.parser.XMLParserListener)>
	//   52  101:pop             
		((XMLParser) (obj)).parse(reader);
	//   53  102:aload_3         
	//   54  103:aload_2         
	//   55  104:invokevirtual   #224 <Method void XMLParser.parse(Reader)>
	//   56  107:return          
	}

	private static XMLWorkerHelper myself = new XMLWorkerHelper();
	private CssFile defaultCssFile;
	private TagProcessorFactory tpf;

	static 
	{
	//    0    0:new             #2   <Class XMLWorkerHelper>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void XMLWorkerHelper()>
	//    3    7:putstatic       #17  <Field XMLWorkerHelper myself>
	//*   4   10:return          
	}
}
