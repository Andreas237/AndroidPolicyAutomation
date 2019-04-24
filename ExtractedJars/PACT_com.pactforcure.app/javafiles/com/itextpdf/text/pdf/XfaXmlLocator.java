// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.security.XmlLocator;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

// Referenced classes of package com.itextpdf.text.pdf:
//			XfaForm, PdfStamper, PdfStream, PdfWriter, 
//			PdfIndirectObject, PdfReader, PdfName, PRAcroForm

public class XfaXmlLocator
	implements XmlLocator
{

	public XfaXmlLocator(PdfStamper pdfstamper)
		throws DocumentException, IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		stamper = pdfstamper;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field PdfStamper stamper>
		try
		{
			createXfaForm();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #30  <Method void createXfaForm()>
			return;
	//    7   13:return          
		}
		// Misplaced declaration of an exception variable
		catch(PdfStamper pdfstamper)
	//*   8   14:astore_1        
		{
			throw new DocumentException(((Exception) (pdfstamper)));
	//    9   15:new             #16  <Class DocumentException>
	//   10   18:dup             
	//   11   19:aload_1         
	//   12   20:invokespecial   #33  <Method void DocumentException(Exception)>
	//   13   23:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(PdfStamper pdfstamper)
	//*  14   24:astore_1        
		{
			throw new DocumentException(((Exception) (pdfstamper)));
	//   15   25:new             #16  <Class DocumentException>
	//   16   28:dup             
	//   17   29:aload_1         
	//   18   30:invokespecial   #33  <Method void DocumentException(Exception)>
	//   19   33:athrow          
		}
	}

	protected void createXfaForm()
		throws ParserConfigurationException, SAXException, IOException
	{
		xfaForm = new XfaForm(stamper.getReader());
	//    0    0:aload_0         
	//    1    1:new             #37  <Class XfaForm>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field PdfStamper stamper>
	//    5    9:invokevirtual   #43  <Method PdfReader PdfStamper.getReader()>
	//    6   12:invokespecial   #46  <Method void XfaForm(PdfReader)>
	//    7   15:putfield        #48  <Field XfaForm xfaForm>
	//    8   18:return          
	}

	public Document getDocument()
	{
		return xfaForm.getDomDocument();
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field XfaForm xfaForm>
	//    2    4:invokevirtual   #53  <Method Document XfaForm.getDomDocument()>
	//    3    7:areturn         
	}

	public String getEncoding()
	{
		return encoding;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field String encoding>
	//    2    4:areturn         
	}

	public void setDocument(Document document)
		throws IOException, DocumentException
	{
		try
		{
			ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #65  <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #66  <Method void ByteArrayOutputStream()>
	//    3    7:astore_2        
			TransformerFactory.newInstance().newTransformer().transform(((javax.xml.transform.Source) (new DOMSource(((org.w3c.dom.Node) (document))))), ((javax.xml.transform.Result) (new StreamResult(((java.io.OutputStream) (bytearrayoutputstream))))));
	//    4    8:invokestatic    #72  <Method TransformerFactory TransformerFactory.newInstance()>
	//    5   11:invokevirtual   #76  <Method Transformer TransformerFactory.newTransformer()>
	//    6   14:new             #78  <Class DOMSource>
	//    7   17:dup             
	//    8   18:aload_1         
	//    9   19:invokespecial   #81  <Method void DOMSource(org.w3c.dom.Node)>
	//   10   22:new             #83  <Class StreamResult>
	//   11   25:dup             
	//   12   26:aload_2         
	//   13   27:invokespecial   #86  <Method void StreamResult(java.io.OutputStream)>
	//   14   30:invokevirtual   #92  <Method void Transformer.transform(javax.xml.transform.Source, javax.xml.transform.Result)>
			document = ((Document) (stamper.getWriter().addToBody(((PdfObject) (new PdfStream(bytearrayoutputstream.toByteArray())))).getIndirectReference()));
	//   15   33:aload_0         
	//   16   34:getfield        #27  <Field PdfStamper stamper>
	//   17   37:invokevirtual   #96  <Method PdfWriter PdfStamper.getWriter()>
	//   18   40:new             #98  <Class PdfStream>
	//   19   43:dup             
	//   20   44:aload_2         
	//   21   45:invokevirtual   #102 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   22   48:invokespecial   #105 <Method void PdfStream(byte[])>
	//   23   51:invokevirtual   #111 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//   24   54:invokevirtual   #117 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//   25   57:astore_1        
			stamper.getReader().getAcroForm().put(PdfName.XFA, ((PdfObject) (document)));
	//   26   58:aload_0         
	//   27   59:getfield        #27  <Field PdfStamper stamper>
	//   28   62:invokevirtual   #43  <Method PdfReader PdfStamper.getReader()>
	//   29   65:invokevirtual   #123 <Method PRAcroForm PdfReader.getAcroForm()>
	//   30   68:getstatic       #129 <Field PdfName PdfName.XFA>
	//   31   71:aload_1         
	//   32   72:invokevirtual   #135 <Method void PRAcroForm.put(PdfName, PdfObject)>
			return;
	//   33   75:return          
		}
		// Misplaced declaration of an exception variable
		catch(Document document)
	//*  34   76:astore_1        
		{
			throw new DocumentException(((Exception) (document)));
	//   35   77:new             #16  <Class DocumentException>
	//   36   80:dup             
	//   37   81:aload_1         
	//   38   82:invokespecial   #33  <Method void DocumentException(Exception)>
	//   39   85:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Document document)
	//*  40   86:astore_1        
		{
			throw new DocumentException(((Exception) (document)));
	//   41   87:new             #16  <Class DocumentException>
	//   42   90:dup             
	//   43   91:aload_1         
	//   44   92:invokespecial   #33  <Method void DocumentException(Exception)>
	//   45   95:athrow          
		}
	}

	public void setEncoding(String s)
	{
		encoding = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #57  <Field String encoding>
	//    3    5:return          
	}

	private String encoding;
	private PdfStamper stamper;
	private XfaForm xfaForm;
}
