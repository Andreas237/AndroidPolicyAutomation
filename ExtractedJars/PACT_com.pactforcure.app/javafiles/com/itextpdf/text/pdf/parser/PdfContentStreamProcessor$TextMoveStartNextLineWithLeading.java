// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.PdfLiteral;
import com.itextpdf.text.pdf.PdfNumber;
import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			ContentOperator, PdfContentStreamProcessor

private static class PdfContentStreamProcessor$TextMoveStartNextLineWithLeading
	implements ContentOperator
{

	public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
	{
		float f = ((PdfNumber)arraylist.get(1)).floatValue();
	//    0    0:aload_3         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #31  <Method Object ArrayList.get(int)>
	//    3    5:checkcast       #33  <Class PdfNumber>
	//    4    8:invokevirtual   #37  <Method float PdfNumber.floatValue()>
	//    5   11:fstore          4
		pdfliteral = ((PdfLiteral) (new ArrayList(1)));
	//    6   13:new             #27  <Class ArrayList>
	//    7   16:dup             
	//    8   17:iconst_1        
	//    9   18:invokespecial   #40  <Method void ArrayList(int)>
	//   10   21:astore_2        
		((ArrayList) (pdfliteral)).add(0, ((Object) (new PdfNumber(-f))));
	//   11   22:aload_2         
	//   12   23:iconst_0        
	//   13   24:new             #33  <Class PdfNumber>
	//   14   27:dup             
	//   15   28:fload           4
	//   16   30:fneg            
	//   17   31:invokespecial   #43  <Method void PdfNumber(float)>
	//   18   34:invokevirtual   #47  <Method void ArrayList.add(int, Object)>
		setTextLeading.invoke(pdfcontentstreamprocessor, ((PdfLiteral) (null)), ((ArrayList) (pdfliteral)));
	//   19   37:aload_0         
	//   20   38:getfield        #22  <Field PdfContentStreamProcessor$SetTextLeading setTextLeading>
	//   21   41:aload_1         
	//   22   42:aconst_null     
	//   23   43:aload_2         
	//   24   44:invokevirtual   #51  <Method void PdfContentStreamProcessor$SetTextLeading.invoke(PdfContentStreamProcessor, PdfLiteral, ArrayList)>
		moveStartNextLine.invoke(pdfcontentstreamprocessor, ((PdfLiteral) (null)), arraylist);
	//   25   47:aload_0         
	//   26   48:getfield        #20  <Field PdfContentStreamProcessor$TextMoveStartNextLine moveStartNextLine>
	//   27   51:aload_1         
	//   28   52:aconst_null     
	//   29   53:aload_3         
	//   30   54:invokevirtual   #54  <Method void PdfContentStreamProcessor$TextMoveStartNextLine.invoke(PdfContentStreamProcessor, PdfLiteral, ArrayList)>
	//   31   57:return          
	}

	private final PdfContentStreamProcessor.TextMoveStartNextLine moveStartNextLine;
	private final PdfContentStreamProcessor.SetTextLeading setTextLeading;

	public PdfContentStreamProcessor$TextMoveStartNextLineWithLeading(PdfContentStreamProcessor.TextMoveStartNextLine textmovestartnextline, PdfContentStreamProcessor.SetTextLeading settextleading)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		moveStartNextLine = textmovestartnextline;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field PdfContentStreamProcessor$TextMoveStartNextLine moveStartNextLine>
		setTextLeading = settextleading;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field PdfContentStreamProcessor$SetTextLeading setTextLeading>
	//    8   14:return          
	}
}
