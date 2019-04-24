// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.BaseColor;

// Referenced classes of package com.itextpdf.text.pdf:
//			ExtendedColor, PdfSpotColor

public class SpotColor extends ExtendedColor
{

	public SpotColor(PdfSpotColor pdfspotcolor, float f)
	{
		super(3, ((float)pdfspotcolor.getAlternativeCS().getRed() / 255F - 1.0F) * f + 1.0F, ((float)pdfspotcolor.getAlternativeCS().getGreen() / 255F - 1.0F) * f + 1.0F, ((float)pdfspotcolor.getAlternativeCS().getBlue() / 255F - 1.0F) * f + 1.0F);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:aload_1         
	//    3    3:invokevirtual   #20  <Method BaseColor PdfSpotColor.getAlternativeCS()>
	//    4    6:invokevirtual   #26  <Method int BaseColor.getRed()>
	//    5    9:i2f             
	//    6   10:ldc1            #27  <Float 255F>
	//    7   12:fdiv            
	//    8   13:fconst_1        
	//    9   14:fsub            
	//   10   15:fload_2         
	//   11   16:fmul            
	//   12   17:fconst_1        
	//   13   18:fadd            
	//   14   19:aload_1         
	//   15   20:invokevirtual   #20  <Method BaseColor PdfSpotColor.getAlternativeCS()>
	//   16   23:invokevirtual   #30  <Method int BaseColor.getGreen()>
	//   17   26:i2f             
	//   18   27:ldc1            #27  <Float 255F>
	//   19   29:fdiv            
	//   20   30:fconst_1        
	//   21   31:fsub            
	//   22   32:fload_2         
	//   23   33:fmul            
	//   24   34:fconst_1        
	//   25   35:fadd            
	//   26   36:aload_1         
	//   27   37:invokevirtual   #20  <Method BaseColor PdfSpotColor.getAlternativeCS()>
	//   28   40:invokevirtual   #33  <Method int BaseColor.getBlue()>
	//   29   43:i2f             
	//   30   44:ldc1            #27  <Float 255F>
	//   31   46:fdiv            
	//   32   47:fconst_1        
	//   33   48:fsub            
	//   34   49:fload_2         
	//   35   50:fmul            
	//   36   51:fconst_1        
	//   37   52:fadd            
	//   38   53:invokespecial   #36  <Method void ExtendedColor(int, float, float, float)>
		spot = pdfspotcolor;
	//   39   56:aload_0         
	//   40   57:aload_1         
	//   41   58:putfield        #38  <Field PdfSpotColor spot>
		tint = f;
	//   42   61:aload_0         
	//   43   62:fload_2         
	//   44   63:putfield        #40  <Field float tint>
	//   45   66:return          
	}

	public boolean equals(Object obj)
	{
		return (obj instanceof SpotColor) && ((SpotColor)obj).spot.equals(((Object) (spot))) && ((SpotColor)obj).tint == tint;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class SpotColor>
	//    2    4:ifeq            41
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class SpotColor>
	//    5   11:getfield        #38  <Field PdfSpotColor spot>
	//    6   14:aload_0         
	//    7   15:getfield        #38  <Field PdfSpotColor spot>
	//    8   18:invokevirtual   #45  <Method boolean PdfSpotColor.equals(Object)>
	//    9   21:ifeq            41
	//   10   24:aload_1         
	//   11   25:checkcast       #2   <Class SpotColor>
	//   12   28:getfield        #40  <Field float tint>
	//   13   31:aload_0         
	//   14   32:getfield        #40  <Field float tint>
	//   15   35:fcmpl           
	//   16   36:ifne            41
	//   17   39:iconst_1        
	//   18   40:ireturn         
	//   19   41:iconst_0        
	//   20   42:ireturn         
	}

	public PdfSpotColor getPdfSpotColor()
	{
		return spot;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfSpotColor spot>
	//    2    4:areturn         
	}

	public float getTint()
	{
		return tint;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field float tint>
	//    2    4:freturn         
	}

	public int hashCode()
	{
		return spot.hashCode() ^ Float.floatToIntBits(tint);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfSpotColor spot>
	//    2    4:invokevirtual   #52  <Method int PdfSpotColor.hashCode()>
	//    3    7:aload_0         
	//    4    8:getfield        #40  <Field float tint>
	//    5   11:invokestatic    #58  <Method int Float.floatToIntBits(float)>
	//    6   14:ixor            
	//    7   15:ireturn         
	}

	private static final long serialVersionUID = 0xcd25fcb1L;
	PdfSpotColor spot;
	float tint;
}
