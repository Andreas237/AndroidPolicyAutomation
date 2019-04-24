// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.PdfLiteral;
import com.itextpdf.text.pdf.PdfNumber;
import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			ContentOperator, PdfContentStreamProcessor, GraphicsState

private static class PdfContentStreamProcessor$TextMoveNextLine
	implements ContentOperator
{

	public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
	{
		pdfliteral = ((PdfLiteral) (new ArrayList(2)));
	//    0    0:new             #23  <Class ArrayList>
	//    1    3:dup             
	//    2    4:iconst_2        
	//    3    5:invokespecial   #26  <Method void ArrayList(int)>
	//    4    8:astore_2        
		((ArrayList) (pdfliteral)).add(0, ((Object) (new PdfNumber(0))));
	//    5    9:aload_2         
	//    6   10:iconst_0        
	//    7   11:new             #28  <Class PdfNumber>
	//    8   14:dup             
	//    9   15:iconst_0        
	//   10   16:invokespecial   #29  <Method void PdfNumber(int)>
	//   11   19:invokevirtual   #33  <Method void ArrayList.add(int, Object)>
		((ArrayList) (pdfliteral)).add(1, ((Object) (new PdfNumber(-pdfcontentstreamprocessor.gs().leading))));
	//   12   22:aload_2         
	//   13   23:iconst_1        
	//   14   24:new             #28  <Class PdfNumber>
	//   15   27:dup             
	//   16   28:aload_1         
	//   17   29:invokevirtual   #37  <Method GraphicsState PdfContentStreamProcessor.gs()>
	//   18   32:getfield        #43  <Field float GraphicsState.leading>
	//   19   35:fneg            
	//   20   36:invokespecial   #46  <Method void PdfNumber(float)>
	//   21   39:invokevirtual   #33  <Method void ArrayList.add(int, Object)>
		moveStartNextLine.invoke(pdfcontentstreamprocessor, ((PdfLiteral) (null)), ((ArrayList) (pdfliteral)));
	//   22   42:aload_0         
	//   23   43:getfield        #18  <Field PdfContentStreamProcessor$TextMoveStartNextLine moveStartNextLine>
	//   24   46:aload_1         
	//   25   47:aconst_null     
	//   26   48:aload_2         
	//   27   49:invokevirtual   #50  <Method void PdfContentStreamProcessor$TextMoveStartNextLine.invoke(PdfContentStreamProcessor, PdfLiteral, ArrayList)>
	//   28   52:return          
	}

	private final Line moveStartNextLine;

	public PdfContentStreamProcessor$TextMoveNextLine(Line line)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		moveStartNextLine = line;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field PdfContentStreamProcessor$TextMoveStartNextLine moveStartNextLine>
	//    5    9:return          
	}
}
