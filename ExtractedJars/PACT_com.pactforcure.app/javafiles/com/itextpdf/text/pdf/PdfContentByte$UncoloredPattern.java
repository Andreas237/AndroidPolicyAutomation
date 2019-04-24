// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.BaseColor;

// Referenced classes of package com.itextpdf.text.pdf:
//			PatternColor, PdfContentByte, PdfPatternPainter

static class PdfContentByte$UncoloredPattern extends PatternColor
{

	public boolean equals(Object obj)
	{
		return (obj instanceof PdfContentByte$UncoloredPattern) && ((Object) (((PdfContentByte$UncoloredPattern)obj).painter)).equals(((Object) (painter))) && ((PdfContentByte$UncoloredPattern)obj).color.equals(((Object) (color))) && ((PdfContentByte$UncoloredPattern)obj).tint == tint;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class PdfContentByte$UncoloredPattern>
	//    2    4:ifeq            58
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class PdfContentByte$UncoloredPattern>
	//    5   11:getfield        #27  <Field PdfPatternPainter painter>
	//    6   14:aload_0         
	//    7   15:getfield        #27  <Field PdfPatternPainter painter>
	//    8   18:invokevirtual   #31  <Method boolean Object.equals(Object)>
	//    9   21:ifeq            58
	//   10   24:aload_1         
	//   11   25:checkcast       #2   <Class PdfContentByte$UncoloredPattern>
	//   12   28:getfield        #18  <Field BaseColor color>
	//   13   31:aload_0         
	//   14   32:getfield        #18  <Field BaseColor color>
	//   15   35:invokevirtual   #34  <Method boolean BaseColor.equals(Object)>
	//   16   38:ifeq            58
	//   17   41:aload_1         
	//   18   42:checkcast       #2   <Class PdfContentByte$UncoloredPattern>
	//   19   45:getfield        #20  <Field float tint>
	//   20   48:aload_0         
	//   21   49:getfield        #20  <Field float tint>
	//   22   52:fcmpl           
	//   23   53:ifne            58
	//   24   56:iconst_1        
	//   25   57:ireturn         
	//   26   58:iconst_0        
	//   27   59:ireturn         
	}

	protected BaseColor color;
	protected float tint;

	protected PdfContentByte$UncoloredPattern(PdfPatternPainter pdfpatternpainter, BaseColor basecolor, float f)
	{
		super(pdfpatternpainter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void PatternColor(PdfPatternPainter)>
		color = basecolor;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field BaseColor color>
		tint = f;
	//    6   10:aload_0         
	//    7   11:fload_3         
	//    8   12:putfield        #20  <Field float tint>
	//    9   15:return          
	}
}
