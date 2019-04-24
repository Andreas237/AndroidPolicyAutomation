// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.error_messages.MessageLocalization;
import java.io.IOException;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfTemplate, PdfReaderInstance, PdfReader, PdfWriter, 
//			PdfContentByte, PdfStream, PdfObject, PdfSpotColor, 
//			BaseFont, PdfTransparencyGroup

public class PdfImportedPage extends PdfTemplate
{

	PdfImportedPage(PdfReaderInstance pdfreaderinstance, PdfWriter pdfwriter, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void PdfTemplate()>
		toCopy = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #18  <Field boolean toCopy>
		readerInstance = pdfreaderinstance;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #20  <Field PdfReaderInstance readerInstance>
		pageNumber = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #22  <Field int pageNumber>
		writer = pdfwriter;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:putfield        #26  <Field PdfWriter writer>
		rotation = pdfreaderinstance.getReader().getPageRotation(i);
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:invokevirtual   #32  <Method PdfReader PdfReaderInstance.getReader()>
	//   17   29:iload_3         
	//   18   30:invokevirtual   #38  <Method int PdfReader.getPageRotation(int)>
	//   19   33:putfield        #40  <Field int rotation>
		bBox = pdfreaderinstance.getReader().getPageSize(i);
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:invokevirtual   #32  <Method PdfReader PdfReaderInstance.getReader()>
	//   23   41:iload_3         
	//   24   42:invokevirtual   #44  <Method Rectangle PdfReader.getPageSize(int)>
	//   25   45:putfield        #48  <Field Rectangle bBox>
		setMatrix(1.0F, 0.0F, 0.0F, 1.0F, -bBox.getLeft(), -bBox.getBottom());
	//   26   48:aload_0         
	//   27   49:fconst_1        
	//   28   50:fconst_0        
	//   29   51:fconst_0        
	//   30   52:fconst_1        
	//   31   53:aload_0         
	//   32   54:getfield        #48  <Field Rectangle bBox>
	//   33   57:invokevirtual   #54  <Method float Rectangle.getLeft()>
	//   34   60:fneg            
	//   35   61:aload_0         
	//   36   62:getfield        #48  <Field Rectangle bBox>
	//   37   65:invokevirtual   #57  <Method float Rectangle.getBottom()>
	//   38   68:fneg            
	//   39   69:invokevirtual   #61  <Method void setMatrix(float, float, float, float, float, float)>
		type = 2;
	//   40   72:aload_0         
	//   41   73:iconst_2        
	//   42   74:putfield        #64  <Field int type>
	//   43   77:return          
	}

	public void addImage(Image image, float f, float f1, float f2, float f3, float f4, float f5)
		throws DocumentException
	{
		throwError();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method void throwError()>
	//    2    4:return          
	}

	public void addTemplate(PdfTemplate pdftemplate, float f, float f1, float f2, float f3, float f4, float f5)
	{
		throwError();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method void throwError()>
	//    2    4:return          
	}

	public PdfContentByte getDuplicate()
	{
		throwError();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method void throwError()>
		return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
	}

	public PdfStream getFormXObject(int i)
		throws IOException
	{
		return readerInstance.getFormXObject(pageNumber, i);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field PdfReaderInstance readerInstance>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field int pageNumber>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #84  <Method PdfStream PdfReaderInstance.getFormXObject(int, int)>
	//    6   12:areturn         
	}

	public PdfImportedPage getFromReader()
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public int getPageNumber()
	{
		return pageNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int pageNumber>
	//    2    4:ireturn         
	}

	PdfReaderInstance getPdfReaderInstance()
	{
		return readerInstance;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field PdfReaderInstance readerInstance>
	//    2    4:areturn         
	}

	PdfObject getResources()
	{
		return readerInstance.getResources(pageNumber);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field PdfReaderInstance readerInstance>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field int pageNumber>
	//    4    8:invokevirtual   #95  <Method PdfObject PdfReaderInstance.getResources(int)>
	//    5   11:areturn         
	}

	public int getRotation()
	{
		return rotation;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int rotation>
	//    2    4:ireturn         
	}

	public boolean isToCopy()
	{
		return toCopy;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field boolean toCopy>
	//    2    4:ireturn         
	}

	public void setColorFill(PdfSpotColor pdfspotcolor, float f)
	{
		throwError();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method void throwError()>
	//    2    4:return          
	}

	public void setColorStroke(PdfSpotColor pdfspotcolor, float f)
	{
		throwError();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method void throwError()>
	//    2    4:return          
	}

	public void setCopied()
	{
		toCopy = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #18  <Field boolean toCopy>
	//    3    5:return          
	}

	public void setFontAndSize(BaseFont basefont, float f)
	{
		throwError();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method void throwError()>
	//    2    4:return          
	}

	public void setGroup(PdfTransparencyGroup pdftransparencygroup)
	{
		throwError();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method void throwError()>
	//    2    4:return          
	}

	void throwError()
	{
		throw new RuntimeException(MessageLocalization.getComposedMessage("content.can.not.be.added.to.a.pdfimportedpage", new Object[0]));
	//    0    0:new             #108 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #110 <String "content.can.not.be.added.to.a.pdfimportedpage">
	//    3    6:iconst_0        
	//    4    7:anewarray       Object[]
	//    5   10:invokestatic    #118 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    6   13:invokespecial   #121 <Method void RuntimeException(String)>
	//    7   16:athrow          
	}

	int pageNumber;
	PdfReaderInstance readerInstance;
	int rotation;
	protected boolean toCopy;
}
