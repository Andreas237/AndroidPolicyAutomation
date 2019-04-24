// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			ExtendedColor, PdfPatternPainter

public class PatternColor extends ExtendedColor
{

	public PatternColor(PdfPatternPainter pdfpatternpainter)
	{
		super(4, 0.5F, 0.5F, 0.5F);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:ldc1            #13  <Float 0.5F>
	//    3    4:ldc1            #13  <Float 0.5F>
	//    4    6:ldc1            #13  <Float 0.5F>
	//    5    8:invokespecial   #16  <Method void ExtendedColor(int, float, float, float)>
		painter = pdfpatternpainter;
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:putfield        #18  <Field PdfPatternPainter painter>
	//    9   16:return          
	}

	public boolean equals(Object obj)
	{
		return (obj instanceof PatternColor) && ((Object) (((PatternColor)obj).painter)).equals(((Object) (painter)));
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class PatternColor>
	//    2    4:ifeq            26
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class PatternColor>
	//    5   11:getfield        #18  <Field PdfPatternPainter painter>
	//    6   14:aload_0         
	//    7   15:getfield        #18  <Field PdfPatternPainter painter>
	//    8   18:invokevirtual   #25  <Method boolean Object.equals(Object)>
	//    9   21:ifeq            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public PdfPatternPainter getPainter()
	{
		return painter;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field PdfPatternPainter painter>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return ((Object) (painter)).hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field PdfPatternPainter painter>
	//    2    4:invokevirtual   #31  <Method int Object.hashCode()>
	//    3    7:ireturn         
	}

	private static final long serialVersionUID = 0x6b3dfae4L;
	PdfPatternPainter painter;
}
