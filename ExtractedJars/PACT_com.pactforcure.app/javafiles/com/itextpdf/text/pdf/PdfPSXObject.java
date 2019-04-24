// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.io.IOException;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfTemplate, PdfStream, ByteBuffer, PdfName, 
//			PdfWriter, PdfContentByte

public class PdfPSXObject extends PdfTemplate
{

	protected PdfPSXObject()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void PdfTemplate()>
	//    2    4:return          
	}

	public PdfPSXObject(PdfWriter pdfwriter)
	{
		super(pdfwriter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void PdfTemplate(PdfWriter)>
	//    3    5:return          
	}

	public PdfContentByte getDuplicate()
	{
		PdfPSXObject pdfpsxobject = new PdfPSXObject();
	//    0    0:new             #2   <Class PdfPSXObject>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void PdfPSXObject()>
	//    3    7:astore_1        
		pdfpsxobject.writer = writer;
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field PdfWriter writer>
	//    7   13:putfield        #19  <Field PdfWriter writer>
		pdfpsxobject.pdf = pdf;
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #23  <Field PdfDocument pdf>
	//   11   21:putfield        #23  <Field PdfDocument pdf>
		pdfpsxobject.thisReference = thisReference;
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #27  <Field PdfIndirectReference thisReference>
	//   15   29:putfield        #27  <Field PdfIndirectReference thisReference>
		pdfpsxobject.pageResources = pageResources;
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #31  <Field PageResources pageResources>
	//   19   37:putfield        #31  <Field PageResources pageResources>
		pdfpsxobject.separator = separator;
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #35  <Field int separator>
	//   23   45:putfield        #35  <Field int separator>
		return ((PdfContentByte) (pdfpsxobject));
	//   24   48:aload_1         
	//   25   49:areturn         
	}

	public PdfStream getFormXObject(int i)
		throws IOException
	{
		PdfStream pdfstream = new PdfStream(content.toByteArray());
	//    0    0:new             #41  <Class PdfStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #45  <Field ByteBuffer content>
	//    4    8:invokevirtual   #51  <Method byte[] ByteBuffer.toByteArray()>
	//    5   11:invokespecial   #54  <Method void PdfStream(byte[])>
	//    6   14:astore_2        
		pdfstream.put(PdfName.TYPE, ((PdfObject) (PdfName.XOBJECT)));
	//    7   15:aload_2         
	//    8   16:getstatic       #60  <Field PdfName PdfName.TYPE>
	//    9   19:getstatic       #63  <Field PdfName PdfName.XOBJECT>
	//   10   22:invokevirtual   #67  <Method void PdfStream.put(PdfName, PdfObject)>
		pdfstream.put(PdfName.SUBTYPE, ((PdfObject) (PdfName.PS)));
	//   11   25:aload_2         
	//   12   26:getstatic       #70  <Field PdfName PdfName.SUBTYPE>
	//   13   29:getstatic       #73  <Field PdfName PdfName.PS>
	//   14   32:invokevirtual   #67  <Method void PdfStream.put(PdfName, PdfObject)>
		pdfstream.flateCompress(i);
	//   15   35:aload_2         
	//   16   36:iload_1         
	//   17   37:invokevirtual   #77  <Method void PdfStream.flateCompress(int)>
		return pdfstream;
	//   18   40:aload_2         
	//   19   41:areturn         
	}
}
