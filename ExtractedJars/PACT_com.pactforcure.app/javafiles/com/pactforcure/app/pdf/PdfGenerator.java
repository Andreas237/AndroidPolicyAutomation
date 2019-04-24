// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.codec.Base64;
import com.itextpdf.tool.xml.XMLWorker;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import com.itextpdf.tool.xml.exceptions.CssResolverException;
import com.itextpdf.tool.xml.html.Tags;
import com.itextpdf.tool.xml.parser.XMLParser;
import com.itextpdf.tool.xml.pipeline.css.CSSResolver;
import com.itextpdf.tool.xml.pipeline.css.CssResolverPipeline;
import com.itextpdf.tool.xml.pipeline.end.PdfWriterPipeline;
import com.itextpdf.tool.xml.pipeline.html.*;
import java.io.*;

public class PdfGenerator
{
	static class Base64ImageProvider extends AbstractImageProvider
	{

		public String getImageRootPath()
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public Image retrieve(String s)
		{
			int i = s.indexOf("base64,");
		//    0    0:aload_1         
		//    1    1:ldc1            #22  <String "base64,">
		//    2    3:invokevirtual   #28  <Method int String.indexOf(String)>
		//    3    6:istore_2        
			if(s.startsWith("data") && i > 0)
		//*   4    7:aload_1         
		//*   5    8:ldc1            #30  <String "data">
		//*   6   10:invokevirtual   #34  <Method boolean String.startsWith(String)>
		//*   7   13:ifeq            43
		//*   8   16:iload_2         
		//*   9   17:ifle            43
			{
				try
				{
					s = ((String) (Image.getInstance(Base64.decode(s.substring(i + 7)))));
		//   10   20:aload_1         
		//   11   21:iload_2         
		//   12   22:bipush          7
		//   13   24:iadd            
		//   14   25:invokevirtual   #38  <Method String String.substring(int)>
		//   15   28:invokestatic    #44  <Method byte[] Base64.decode(String)>
		//   16   31:invokestatic    #50  <Method Image Image.getInstance(byte[])>
		//   17   34:astore_1        
					((Image) (s)).scalePercent(50F);
		//   18   35:aload_1         
		//   19   36:ldc1            #51  <Float 50F>
		//   20   38:invokevirtual   #55  <Method void Image.scalePercent(float)>
				}
		//*  21   41:aload_1         
		//*  22   42:areturn         
		//*  23   43:aload_1         
		//*  24   44:invokestatic    #57  <Method Image Image.getInstance(String)>
		//*  25   47:astore_1        
		//*  26   48:aload_1         
		//*  27   49:areturn         
				// Misplaced declaration of an exception variable
				catch(String s)
		//*  28   50:astore_1        
				{
					return null;
		//   29   51:aconst_null     
		//   30   52:areturn         
				}
				// Misplaced declaration of an exception variable
				catch(String s)
		//*  31   53:astore_1        
				{
					return null;
		//   32   54:aconst_null     
		//   33   55:areturn         
				}
				return ((Image) (s));
			}
			s = ((String) (Image.getInstance(s)));
			return ((Image) (s));
		}

		Base64ImageProvider()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void AbstractImageProvider()>
		//    2    4:return          
		}
	}


	public PdfGenerator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public static void genPdfFromHtmlAndCss(String s, String s1, File file)
		throws IOException, DocumentException, CssResolverException
	{
		Document document = new Document();
	//    0    0:new             #23  <Class Document>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void Document()>
	//    3    7:astore          4
		document.setPageSize(PageSize.A4);
	//    4    9:aload           4
	//    5   11:getstatic       #30  <Field com.itextpdf.text.Rectangle PageSize.A4>
	//    6   14:invokevirtual   #34  <Method boolean Document.setPageSize(com.itextpdf.text.Rectangle)>
	//    7   17:pop             
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    8   18:new             #36  <Class ByteArrayOutputStream>
	//    9   21:dup             
	//   10   22:invokespecial   #37  <Method void ByteArrayOutputStream()>
	//   11   25:astore_3        
		PdfWriter pdfwriter = PdfWriter.getInstance(document, ((OutputStream) (bytearrayoutputstream)));
	//   12   26:aload           4
	//   13   28:aload_3         
	//   14   29:invokestatic    #43  <Method PdfWriter PdfWriter.getInstance(Document, OutputStream)>
	//   15   32:astore          5
		document.open();
	//   16   34:aload           4
	//   17   36:invokevirtual   #46  <Method void Document.open()>
		Object obj = ((Object) (XMLWorkerHelper.getCSS(((java.io.InputStream) (new ByteArrayInputStream(s1.getBytes()))))));
	//   18   39:new             #48  <Class ByteArrayInputStream>
	//   19   42:dup             
	//   20   43:aload_1         
	//   21   44:invokevirtual   #54  <Method byte[] String.getBytes()>
	//   22   47:invokespecial   #57  <Method void ByteArrayInputStream(byte[])>
	//   23   50:invokestatic    #63  <Method com.itextpdf.tool.xml.css.CssFile XMLWorkerHelper.getCSS(java.io.InputStream)>
	//   24   53:astore          6
		s1 = ((String) (XMLWorkerHelper.getInstance().getDefaultCssResolver(true)));
	//   25   55:invokestatic    #66  <Method XMLWorkerHelper XMLWorkerHelper.getInstance()>
	//   26   58:iconst_1        
	//   27   59:invokevirtual   #70  <Method CSSResolver XMLWorkerHelper.getDefaultCssResolver(boolean)>
	//   28   62:astore_1        
		((CSSResolver) (s1)).addCss(((com.itextpdf.tool.xml.css.CssFile) (obj)));
	//   29   63:aload_1         
	//   30   64:aload           6
	//   31   66:invokeinterface #76  <Method void CSSResolver.addCss(com.itextpdf.tool.xml.css.CssFile)>
		obj = ((Object) (new HtmlPipelineContext(((com.itextpdf.tool.xml.html.CssAppliers) (null)))));
	//   32   71:new             #78  <Class HtmlPipelineContext>
	//   33   74:dup             
	//   34   75:aconst_null     
	//   35   76:invokespecial   #81  <Method void HtmlPipelineContext(com.itextpdf.tool.xml.html.CssAppliers)>
	//   36   79:astore          6
		((HtmlPipelineContext) (obj)).setTagFactory(Tags.getHtmlTagProcessorFactory());
	//   37   81:aload           6
	//   38   83:invokestatic    #87  <Method com.itextpdf.tool.xml.html.TagProcessorFactory Tags.getHtmlTagProcessorFactory()>
	//   39   86:invokevirtual   #91  <Method HtmlPipelineContext HtmlPipelineContext.setTagFactory(com.itextpdf.tool.xml.html.TagProcessorFactory)>
	//   40   89:pop             
		((HtmlPipelineContext) (obj)).setImageProvider(((com.itextpdf.tool.xml.pipeline.html.ImageProvider) (new Base64ImageProvider())));
	//   41   90:aload           6
	//   42   92:new             #6   <Class PdfGenerator$Base64ImageProvider>
	//   43   95:dup             
	//   44   96:invokespecial   #92  <Method void PdfGenerator$Base64ImageProvider()>
	//   45   99:invokevirtual   #96  <Method HtmlPipelineContext HtmlPipelineContext.setImageProvider(com.itextpdf.tool.xml.pipeline.html.ImageProvider)>
	//   46  102:pop             
		(new XMLParser(((com.itextpdf.tool.xml.parser.XMLParserListener) (new XMLWorker(((com.itextpdf.tool.xml.Pipeline) (new CssResolverPipeline(((CSSResolver) (s1)), ((com.itextpdf.tool.xml.Pipeline) (new HtmlPipeline(((HtmlPipelineContext) (obj)), ((com.itextpdf.tool.xml.Pipeline) (new PdfWriterPipeline(document, pdfwriter))))))))), true))))).parse(((java.io.InputStream) (new ByteArrayInputStream(s.getBytes()))));
	//   47  103:new             #98  <Class XMLParser>
	//   48  106:dup             
	//   49  107:new             #100 <Class XMLWorker>
	//   50  110:dup             
	//   51  111:new             #102 <Class CssResolverPipeline>
	//   52  114:dup             
	//   53  115:aload_1         
	//   54  116:new             #104 <Class HtmlPipeline>
	//   55  119:dup             
	//   56  120:aload           6
	//   57  122:new             #106 <Class PdfWriterPipeline>
	//   58  125:dup             
	//   59  126:aload           4
	//   60  128:aload           5
	//   61  130:invokespecial   #109 <Method void PdfWriterPipeline(Document, PdfWriter)>
	//   62  133:invokespecial   #112 <Method void HtmlPipeline(HtmlPipelineContext, com.itextpdf.tool.xml.Pipeline)>
	//   63  136:invokespecial   #115 <Method void CssResolverPipeline(CSSResolver, com.itextpdf.tool.xml.Pipeline)>
	//   64  139:iconst_1        
	//   65  140:invokespecial   #118 <Method void XMLWorker(com.itextpdf.tool.xml.Pipeline, boolean)>
	//   66  143:invokespecial   #121 <Method void XMLParser(com.itextpdf.tool.xml.parser.XMLParserListener)>
	//   67  146:new             #48  <Class ByteArrayInputStream>
	//   68  149:dup             
	//   69  150:aload_0         
	//   70  151:invokevirtual   #54  <Method byte[] String.getBytes()>
	//   71  154:invokespecial   #57  <Method void ByteArrayInputStream(byte[])>
	//   72  157:invokevirtual   #125 <Method void XMLParser.parse(java.io.InputStream)>
		document.close();
	//   73  160:aload           4
	//   74  162:invokevirtual   #128 <Method void Document.close()>
		file.createNewFile();
	//   75  165:aload_2         
	//   76  166:invokevirtual   #134 <Method boolean File.createNewFile()>
	//   77  169:pop             
		s = ((String) (new FileOutputStream(file)));
	//   78  170:new             #136 <Class FileOutputStream>
	//   79  173:dup             
	//   80  174:aload_2         
	//   81  175:invokespecial   #139 <Method void FileOutputStream(File)>
	//   82  178:astore_0        
		bytearrayoutputstream.writeTo(((OutputStream) (s)));
	//   83  179:aload_3         
	//   84  180:aload_0         
	//   85  181:invokevirtual   #143 <Method void ByteArrayOutputStream.writeTo(OutputStream)>
		((OutputStream) (s)).close();
	//   86  184:aload_0         
	//   87  185:invokevirtual   #146 <Method void OutputStream.close()>
	//   88  188:return          
	}

	static 
	{
	//    0    0:return          
	}
}
