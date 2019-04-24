// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfSmartCopy, PdfCopy, PdfReader

public class PdfConcatenate
{

	public PdfConcatenate(OutputStream outputstream)
		throws DocumentException
	{
		this(outputstream, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #15  <Method void PdfConcatenate(OutputStream, boolean)>
	//    4    6:return          
	}

	public PdfConcatenate(OutputStream outputstream, boolean flag)
		throws DocumentException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		document = new Document();
	//    2    4:aload_0         
	//    3    5:new             #22  <Class Document>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void Document()>
	//    6   12:putfield        #25  <Field Document document>
		if(flag)
	//*   7   15:iload_2         
	//*   8   16:ifeq            36
		{
			copy = ((PdfCopy) (new PdfSmartCopy(document, outputstream)));
	//    9   19:aload_0         
	//   10   20:new             #27  <Class PdfSmartCopy>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:getfield        #25  <Field Document document>
	//   14   28:aload_1         
	//   15   29:invokespecial   #30  <Method void PdfSmartCopy(Document, OutputStream)>
	//   16   32:putfield        #32  <Field PdfCopy copy>
			return;
	//   17   35:return          
		} else
		{
			copy = new PdfCopy(document, outputstream);
	//   18   36:aload_0         
	//   19   37:new             #34  <Class PdfCopy>
	//   20   40:dup             
	//   21   41:aload_0         
	//   22   42:getfield        #25  <Field Document document>
	//   23   45:aload_1         
	//   24   46:invokespecial   #35  <Method void PdfCopy(Document, OutputStream)>
	//   25   49:putfield        #32  <Field PdfCopy copy>
			return;
	//   26   52:return          
		}
	}

	public int addPages(PdfReader pdfreader)
		throws DocumentException, IOException
	{
		open();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #42  <Method void open()>
		int j = pdfreader.getNumberOfPages();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #48  <Method int PdfReader.getNumberOfPages()>
	//    4    8:istore_3        
		for(int i = 1; i <= j; i++)
	//*   5    9:iconst_1        
	//*   6   10:istore_2        
	//*   7   11:iload_2         
	//*   8   12:iload_3         
	//*   9   13:icmpgt          39
			copy.addPage(copy.getImportedPage(pdfreader, i));
	//   10   16:aload_0         
	//   11   17:getfield        #32  <Field PdfCopy copy>
	//   12   20:aload_0         
	//   13   21:getfield        #32  <Field PdfCopy copy>
	//   14   24:aload_1         
	//   15   25:iload_2         
	//   16   26:invokevirtual   #52  <Method PdfImportedPage PdfCopy.getImportedPage(PdfReader, int)>
	//   17   29:invokevirtual   #56  <Method void PdfCopy.addPage(PdfImportedPage)>

	//   18   32:iload_2         
	//   19   33:iconst_1        
	//   20   34:iadd            
	//   21   35:istore_2        
	//*  22   36:goto            11
		copy.freeReader(pdfreader);
	//   23   39:aload_0         
	//   24   40:getfield        #32  <Field PdfCopy copy>
	//   25   43:aload_1         
	//   26   44:invokevirtual   #60  <Method void PdfCopy.freeReader(PdfReader)>
		pdfreader.close();
	//   27   47:aload_1         
	//   28   48:invokevirtual   #63  <Method void PdfReader.close()>
		return j;
	//   29   51:iload_3         
	//   30   52:ireturn         
	}

	public void close()
	{
		document.close();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Document document>
	//    2    4:invokevirtual   #64  <Method void Document.close()>
	//    3    7:return          
	}

	public PdfCopy getWriter()
	{
		return copy;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field PdfCopy copy>
	//    2    4:areturn         
	}

	public void open()
	{
		if(!document.isOpen())
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field Document document>
	//*   2    4:invokevirtual   #70  <Method boolean Document.isOpen()>
	//*   3    7:ifne            17
			document.open();
	//    4   10:aload_0         
	//    5   11:getfield        #25  <Field Document document>
	//    6   14:invokevirtual   #71  <Method void Document.open()>
	//    7   17:return          
	}

	protected PdfCopy copy;
	protected Document document;
}
