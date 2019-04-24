// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.*;
import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			ContentOperator, PdfContentStreamProcessor

private static class PdfContentStreamProcessor$MoveNextLineAndShowTextWithSpacing
	implements ContentOperator
{

	public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
	{
		Object obj = ((Object) ((PdfNumber)arraylist.get(0)));
	//    0    0:aload_3         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #35  <Method Object ArrayList.get(int)>
	//    3    5:checkcast       #37  <Class PdfNumber>
	//    4    8:astore          4
		pdfliteral = ((PdfLiteral) ((PdfNumber)arraylist.get(1)));
	//    5   10:aload_3         
	//    6   11:iconst_1        
	//    7   12:invokevirtual   #35  <Method Object ArrayList.get(int)>
	//    8   15:checkcast       #37  <Class PdfNumber>
	//    9   18:astore_2        
		arraylist = ((ArrayList) ((PdfString)arraylist.get(2)));
	//   10   19:aload_3         
	//   11   20:iconst_2        
	//   12   21:invokevirtual   #35  <Method Object ArrayList.get(int)>
	//   13   24:checkcast       #39  <Class PdfString>
	//   14   27:astore_3        
		ArrayList arraylist1 = new ArrayList(1);
	//   15   28:new             #31  <Class ArrayList>
	//   16   31:dup             
	//   17   32:iconst_1        
	//   18   33:invokespecial   #42  <Method void ArrayList(int)>
	//   19   36:astore          5
		arraylist1.add(0, obj);
	//   20   38:aload           5
	//   21   40:iconst_0        
	//   22   41:aload           4
	//   23   43:invokevirtual   #46  <Method void ArrayList.add(int, Object)>
		setTextWordSpacing.invoke(pdfcontentstreamprocessor, ((PdfLiteral) (null)), arraylist1);
	//   24   46:aload_0         
	//   25   47:getfield        #22  <Field PdfContentStreamProcessor$SetTextWordSpacing setTextWordSpacing>
	//   26   50:aload_1         
	//   27   51:aconst_null     
	//   28   52:aload           5
	//   29   54:invokevirtual   #50  <Method void PdfContentStreamProcessor$SetTextWordSpacing.invoke(PdfContentStreamProcessor, PdfLiteral, ArrayList)>
		obj = ((Object) (new ArrayList(1)));
	//   30   57:new             #31  <Class ArrayList>
	//   31   60:dup             
	//   32   61:iconst_1        
	//   33   62:invokespecial   #42  <Method void ArrayList(int)>
	//   34   65:astore          4
		((ArrayList) (obj)).add(0, ((Object) (pdfliteral)));
	//   35   67:aload           4
	//   36   69:iconst_0        
	//   37   70:aload_2         
	//   38   71:invokevirtual   #46  <Method void ArrayList.add(int, Object)>
		setTextCharacterSpacing.invoke(pdfcontentstreamprocessor, ((PdfLiteral) (null)), ((ArrayList) (obj)));
	//   39   74:aload_0         
	//   40   75:getfield        #24  <Field PdfContentStreamProcessor$SetTextCharacterSpacing setTextCharacterSpacing>
	//   41   78:aload_1         
	//   42   79:aconst_null     
	//   43   80:aload           4
	//   44   82:invokevirtual   #53  <Method void PdfContentStreamProcessor$SetTextCharacterSpacing.invoke(PdfContentStreamProcessor, PdfLiteral, ArrayList)>
		pdfliteral = ((PdfLiteral) (new ArrayList(1)));
	//   45   85:new             #31  <Class ArrayList>
	//   46   88:dup             
	//   47   89:iconst_1        
	//   48   90:invokespecial   #42  <Method void ArrayList(int)>
	//   49   93:astore_2        
		((ArrayList) (pdfliteral)).add(0, ((Object) (arraylist)));
	//   50   94:aload_2         
	//   51   95:iconst_0        
	//   52   96:aload_3         
	//   53   97:invokevirtual   #46  <Method void ArrayList.add(int, Object)>
		moveNextLineAndShowText.invoke(pdfcontentstreamprocessor, ((PdfLiteral) (null)), ((ArrayList) (pdfliteral)));
	//   54  100:aload_0         
	//   55  101:getfield        #26  <Field PdfContentStreamProcessor$MoveNextLineAndShowText moveNextLineAndShowText>
	//   56  104:aload_1         
	//   57  105:aconst_null     
	//   58  106:aload_2         
	//   59  107:invokevirtual   #56  <Method void PdfContentStreamProcessor$MoveNextLineAndShowText.invoke(PdfContentStreamProcessor, PdfLiteral, ArrayList)>
	//   60  110:return          
	}

	private final PdfContentStreamProcessor.MoveNextLineAndShowText moveNextLineAndShowText;
	private final PdfContentStreamProcessor.SetTextCharacterSpacing setTextCharacterSpacing;
	private final PdfContentStreamProcessor.SetTextWordSpacing setTextWordSpacing;

	public PdfContentStreamProcessor$MoveNextLineAndShowTextWithSpacing(PdfContentStreamProcessor.SetTextWordSpacing settextwordspacing, PdfContentStreamProcessor.SetTextCharacterSpacing settextcharacterspacing, PdfContentStreamProcessor.MoveNextLineAndShowText movenextlineandshowtext)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		setTextWordSpacing = settextwordspacing;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field PdfContentStreamProcessor$SetTextWordSpacing setTextWordSpacing>
		setTextCharacterSpacing = settextcharacterspacing;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field PdfContentStreamProcessor$SetTextCharacterSpacing setTextCharacterSpacing>
		moveNextLineAndShowText = movenextlineandshowtext;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #26  <Field PdfContentStreamProcessor$MoveNextLineAndShowText moveNextLineAndShowText>
	//   11   19:return          
	}
}
