// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.ExceptionConverter;

// Referenced classes of package com.itextpdf.text.pdf:
//			BaseFont

class PdfFont
	implements Comparable
{

	PdfFont(BaseFont basefont, float f)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		hScale = 1.0F;
	//    2    4:aload_0         
	//    3    5:fconst_1        
	//    4    6:putfield        #19  <Field float hScale>
		size = f;
	//    5    9:aload_0         
	//    6   10:fload_2         
	//    7   11:putfield        #21  <Field float size>
		font = basefont;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #23  <Field BaseFont font>
	//   11   19:return          
	}

	static PdfFont getDefaultFont()
	{
		PdfFont pdffont;
		try
		{
			pdffont = new PdfFont(BaseFont.createFont("Helvetica", "Cp1252", false), 12F);
	//    0    0:new             #2   <Class PdfFont>
	//    1    3:dup             
	//    2    4:ldc1            #30  <String "Helvetica">
	//    3    6:ldc1            #32  <String "Cp1252">
	//    4    8:iconst_0        
	//    5    9:invokestatic    #38  <Method BaseFont BaseFont.createFont(String, String, boolean)>
	//    6   12:ldc1            #39  <Float 12F>
	//    7   14:invokespecial   #41  <Method void PdfFont(BaseFont, float)>
	//    8   17:astore_0        
		}
	//*   9   18:aload_0         
	//*  10   19:areturn         
		catch(Exception exception)
	//*  11   20:astore_0        
		{
			throw new ExceptionConverter(exception);
	//   12   21:new             #43  <Class ExceptionConverter>
	//   13   24:dup             
	//   14   25:aload_0         
	//   15   26:invokespecial   #46  <Method void ExceptionConverter(Exception)>
	//   16   29:athrow          
		}
		return pdffont;
	}

	public int compareTo(PdfFont pdffont)
	{
		if(pdffont == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return -1;
	//    2    4:iconst_m1       
	//    3    5:ireturn         
		if(font != pdffont.font)
	//*   4    6:aload_0         
	//*   5    7:getfield        #23  <Field BaseFont font>
	//*   6   10:aload_1         
	//*   7   11:getfield        #23  <Field BaseFont font>
	//*   8   14:if_acmpeq       19
			return 1;
	//    9   17:iconst_1        
	//   10   18:ireturn         
		float f;
		float f1;
		try
		{
			f = size();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #53  <Method float size()>
	//   13   23:fstore_2        
			f1 = pdffont.size();
	//   14   24:aload_1         
	//   15   25:invokevirtual   #53  <Method float size()>
	//   16   28:fstore_3        
		}
	//*  17   29:fload_2         
	//*  18   30:fload_3         
	//*  19   31:fcmpl           
	//*  20   32:ifeq            37
	//*  21   35:iconst_2        
	//*  22   36:ireturn         
	//*  23   37:iconst_0        
	//*  24   38:ireturn         
		// Misplaced declaration of an exception variable
		catch(PdfFont pdffont)
	//*  25   39:astore_1        
		{
			return -2;
	//   26   40:bipush          -2
	//   27   42:ireturn         
		}
		return f == f1 ? 0 : 2;
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((PdfFont)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class PdfFont>
	//    3    5:invokevirtual   #56  <Method int compareTo(PdfFont)>
	//    4    8:ireturn         
	}

	BaseFont getFont()
	{
		return font;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field BaseFont font>
	//    2    4:areturn         
	}

	float getHorizontalScaling()
	{
		return hScale;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field float hScale>
	//    2    4:freturn         
	}

	void setHorizontalScaling(float f)
	{
		hScale = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #19  <Field float hScale>
	//    3    5:return          
	}

	float size()
	{
		return size;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field float size>
	//    2    4:freturn         
	}

	float width()
	{
		return width(32);
	//    0    0:aload_0         
	//    1    1:bipush          32
	//    2    3:invokevirtual   #65  <Method float width(int)>
	//    3    6:freturn         
	}

	float width(int i)
	{
		return font.getWidthPoint(i, size) * hScale;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field BaseFont font>
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field float size>
	//    5    9:invokevirtual   #69  <Method float BaseFont.getWidthPoint(int, float)>
	//    6   12:aload_0         
	//    7   13:getfield        #19  <Field float hScale>
	//    8   16:fmul            
	//    9   17:freturn         
	}

	float width(String s)
	{
		return font.getWidthPoint(s, size) * hScale;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field BaseFont font>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field float size>
	//    5    9:invokevirtual   #73  <Method float BaseFont.getWidthPoint(String, float)>
	//    6   12:aload_0         
	//    7   13:getfield        #19  <Field float hScale>
	//    8   16:fmul            
	//    9   17:freturn         
	}

	private BaseFont font;
	protected float hScale;
	private float size;
}
