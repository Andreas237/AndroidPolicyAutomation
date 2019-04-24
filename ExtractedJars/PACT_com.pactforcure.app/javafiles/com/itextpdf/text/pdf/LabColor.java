// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.BaseColor;

// Referenced classes of package com.itextpdf.text.pdf:
//			ExtendedColor, PdfLabColor, CMYKColor

public class LabColor extends ExtendedColor
{

	public LabColor(PdfLabColor pdflabcolor, float f, float f1, float f2)
	{
		super(7);
	//    0    0:aload_0         
	//    1    1:bipush          7
	//    2    3:invokespecial   #15  <Method void ExtendedColor(int)>
		labColorSpace = pdflabcolor;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #17  <Field PdfLabColor labColorSpace>
		l = f;
	//    6   11:aload_0         
	//    7   12:fload_2         
	//    8   13:putfield        #19  <Field float l>
		a = f1;
	//    9   16:aload_0         
	//   10   17:fload_3         
	//   11   18:putfield        #21  <Field float a>
		b = f2;
	//   12   21:aload_0         
	//   13   22:fload           4
	//   14   24:putfield        #23  <Field float b>
		pdflabcolor = ((PdfLabColor) (pdflabcolor.lab2Rgb(f, f1, f2)));
	//   15   27:aload_1         
	//   16   28:fload_2         
	//   17   29:fload_3         
	//   18   30:fload           4
	//   19   32:invokevirtual   #29  <Method BaseColor PdfLabColor.lab2Rgb(float, float, float)>
	//   20   35:astore_1        
		setValue(((BaseColor) (pdflabcolor)).getRed(), ((BaseColor) (pdflabcolor)).getGreen(), ((BaseColor) (pdflabcolor)).getBlue(), 255);
	//   21   36:aload_0         
	//   22   37:aload_1         
	//   23   38:invokevirtual   #35  <Method int BaseColor.getRed()>
	//   24   41:aload_1         
	//   25   42:invokevirtual   #38  <Method int BaseColor.getGreen()>
	//   26   45:aload_1         
	//   27   46:invokevirtual   #41  <Method int BaseColor.getBlue()>
	//   28   49:sipush          255
	//   29   52:invokevirtual   #45  <Method void setValue(int, int, int, int)>
	//   30   55:return          
	}

	public float getA()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field float a>
	//    2    4:freturn         
	}

	public float getB()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field float b>
	//    2    4:freturn         
	}

	public float getL()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field float l>
	//    2    4:freturn         
	}

	public PdfLabColor getLabColorSpace()
	{
		return labColorSpace;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field PdfLabColor labColorSpace>
	//    2    4:areturn         
	}

	CMYKColor toCmyk()
	{
		return labColorSpace.lab2Cmyk(l, a, b);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field PdfLabColor labColorSpace>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field float l>
	//    4    8:aload_0         
	//    5    9:getfield        #21  <Field float a>
	//    6   12:aload_0         
	//    7   13:getfield        #23  <Field float b>
	//    8   16:invokevirtual   #58  <Method CMYKColor PdfLabColor.lab2Cmyk(float, float, float)>
	//    9   19:areturn         
	}

	public BaseColor toRgb()
	{
		return labColorSpace.lab2Rgb(l, a, b);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field PdfLabColor labColorSpace>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field float l>
	//    4    8:aload_0         
	//    5    9:getfield        #21  <Field float a>
	//    6   12:aload_0         
	//    7   13:getfield        #23  <Field float b>
	//    8   16:invokevirtual   #29  <Method BaseColor PdfLabColor.lab2Rgb(float, float, float)>
	//    9   19:areturn         
	}

	private float a;
	private float b;
	private float l;
	PdfLabColor labColorSpace;
}
