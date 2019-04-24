// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.exceptions.RuntimeWorkerException;

// Referenced classes of package com.itextpdf.tool.xml.html:
//			Anchor

class Anchor$1 extends WritableDirectElement
{

	public void write(PdfWriter pdfwriter, Document document)
		throws DocumentException
	{
		document = ((Document) (new ColumnText(pdfwriter.getDirectContent())));
	//    0    0:new             #29  <Class ColumnText>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #35  <Method com.itextpdf.text.pdf.PdfContentByte PdfWriter.getDirectContent()>
	//    4    8:invokespecial   #38  <Method void ColumnText(com.itextpdf.text.pdf.PdfContentByte)>
	//    5   11:astore_2        
		float f = pdfwriter.getVerticalPosition(false);
	//    6   12:aload_1         
	//    7   13:iconst_0        
	//    8   14:invokevirtual   #42  <Method float PdfWriter.getVerticalPosition(boolean)>
	//    9   17:fstore_3        
		((ColumnText) (document)).setSimpleColumn(new Phrase((new Chunk(" ")).setLocalDestination(val$name)), 1.0F, f - 5F, 6F, f, 5F, 0);
	//   10   18:aload_2         
	//   11   19:new             #44  <Class Phrase>
	//   12   22:dup             
	//   13   23:new             #46  <Class Chunk>
	//   14   26:dup             
	//   15   27:ldc1            #48  <String " ">
	//   16   29:invokespecial   #51  <Method void Chunk(String)>
	//   17   32:aload_0         
	//   18   33:getfield        #19  <Field String val$name>
	//   19   36:invokevirtual   #55  <Method Chunk Chunk.setLocalDestination(String)>
	//   20   39:invokespecial   #58  <Method void Phrase(Chunk)>
	//   21   42:fconst_1        
	//   22   43:fload_3         
	//   23   44:ldc1            #59  <Float 5F>
	//   24   46:fsub            
	//   25   47:ldc1            #60  <Float 6F>
	//   26   49:fload_3         
	//   27   50:ldc1            #59  <Float 5F>
	//   28   52:iconst_0        
	//   29   53:invokevirtual   #64  <Method void ColumnText.setSimpleColumn(Phrase, float, float, float, float, float, int)>
		try
		{
			((ColumnText) (document)).go();
	//   30   56:aload_2         
	//   31   57:invokevirtual   #68  <Method int ColumnText.go()>
	//   32   60:pop             
			return;
	//   33   61:return          
		}
		// Misplaced declaration of an exception variable
		catch(PdfWriter pdfwriter)
	//*  34   62:astore_1        
		{
			throw new RuntimeWorkerException(((Throwable) (pdfwriter)));
	//   35   63:new             #70  <Class RuntimeWorkerException>
	//   36   66:dup             
	//   37   67:aload_1         
	//   38   68:invokespecial   #73  <Method void RuntimeWorkerException(Throwable)>
	//   39   71:athrow          
		}
	}

	final Anchor this$0;
	final String val$name;

	Anchor$1()
	{
		this$0 = final_anchor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field Anchor this$0>
		val$name = String.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field String val$name>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void WritableDirectElement()>
	//    8   14:return          
	}
}
