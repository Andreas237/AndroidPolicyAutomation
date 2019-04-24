// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html.table;

import com.itextpdf.text.BaseColor;

public class TableStyleValues
{

	public TableStyleValues()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		borderLeftWidth = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #26  <Field Float borderLeftWidth>
		borderRightWidth = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #28  <Field Float borderRightWidth>
		borderTopWidth = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #30  <Field Float borderTopWidth>
		borderBottomWidth = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #32  <Field Float borderBottomWidth>
		isLastInRow = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #34  <Field boolean isLastInRow>
	//   17   29:return          
	}

	public BaseColor getBackground()
	{
		return background;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field BaseColor background>
	//    2    4:areturn         
	}

	public BaseColor getBorderColorBottom()
	{
		return borderBottomColor;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field BaseColor borderBottomColor>
	//    2    4:areturn         
	}

	public BaseColor getBorderColorLeft()
	{
		return borderLeftColor;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field BaseColor borderLeftColor>
	//    2    4:areturn         
	}

	public BaseColor getBorderColorRight()
	{
		return borderRightColor;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field BaseColor borderRightColor>
	//    2    4:areturn         
	}

	public BaseColor getBorderColorTop()
	{
		return borderTopColor;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field BaseColor borderTopColor>
	//    2    4:areturn         
	}

	public float getBorderWidthBottom()
	{
		return getBorderWidthBottom(true).floatValue();
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #56  <Method Float getBorderWidthBottom(boolean)>
	//    3    5:invokevirtual   #61  <Method float Float.floatValue()>
	//    4    8:freturn         
	}

	public Float getBorderWidthBottom(boolean flag)
	{
		if(borderBottomWidth == null && flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field Float borderBottomWidth>
	//*   2    4:ifnonnull       16
	//*   3    7:iload_1         
	//*   4    8:ifeq            16
			return Float.valueOf(0.0F);
	//    5   11:fconst_0        
	//    6   12:invokestatic    #65  <Method Float Float.valueOf(float)>
	//    7   15:areturn         
		else
			return borderBottomWidth;
	//    8   16:aload_0         
	//    9   17:getfield        #32  <Field Float borderBottomWidth>
	//   10   20:areturn         
	}

	public float getBorderWidthLeft()
	{
		return getBorderWidthLeft(true).floatValue();
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #68  <Method Float getBorderWidthLeft(boolean)>
	//    3    5:invokevirtual   #61  <Method float Float.floatValue()>
	//    4    8:freturn         
	}

	public Float getBorderWidthLeft(boolean flag)
	{
		if(borderLeftWidth == null && flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field Float borderLeftWidth>
	//*   2    4:ifnonnull       16
	//*   3    7:iload_1         
	//*   4    8:ifeq            16
			return Float.valueOf(0.0F);
	//    5   11:fconst_0        
	//    6   12:invokestatic    #65  <Method Float Float.valueOf(float)>
	//    7   15:areturn         
		else
			return borderLeftWidth;
	//    8   16:aload_0         
	//    9   17:getfield        #26  <Field Float borderLeftWidth>
	//   10   20:areturn         
	}

	public float getBorderWidthRight()
	{
		return getBorderWidthRight(true).floatValue();
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #71  <Method Float getBorderWidthRight(boolean)>
	//    3    5:invokevirtual   #61  <Method float Float.floatValue()>
	//    4    8:freturn         
	}

	public Float getBorderWidthRight(boolean flag)
	{
		if(borderRightWidth == null && flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field Float borderRightWidth>
	//*   2    4:ifnonnull       16
	//*   3    7:iload_1         
	//*   4    8:ifeq            16
			return Float.valueOf(0.0F);
	//    5   11:fconst_0        
	//    6   12:invokestatic    #65  <Method Float Float.valueOf(float)>
	//    7   15:areturn         
		else
			return borderRightWidth;
	//    8   16:aload_0         
	//    9   17:getfield        #28  <Field Float borderRightWidth>
	//   10   20:areturn         
	}

	public float getBorderWidthTop()
	{
		return getBorderWidthTop(true).floatValue();
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #74  <Method Float getBorderWidthTop(boolean)>
	//    3    5:invokevirtual   #61  <Method float Float.floatValue()>
	//    4    8:freturn         
	}

	public Float getBorderWidthTop(boolean flag)
	{
		if(borderTopWidth == null && flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field Float borderTopWidth>
	//*   2    4:ifnonnull       16
	//*   3    7:iload_1         
	//*   4    8:ifeq            16
			return Float.valueOf(0.0F);
	//    5   11:fconst_0        
	//    6   12:invokestatic    #65  <Method Float Float.valueOf(float)>
	//    7   15:areturn         
		else
			return borderTopWidth;
	//    8   16:aload_0         
	//    9   17:getfield        #30  <Field Float borderTopWidth>
	//   10   20:areturn         
	}

	public float getHorBorderSpacing()
	{
		return horBorderSpacing;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field float horBorderSpacing>
	//    2    4:freturn         
	}

	public float getVerBorderSpacing()
	{
		return verBorderSpacing;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field float verBorderSpacing>
	//    2    4:freturn         
	}

	public boolean isLastInRow()
	{
		return isLastInRow;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field boolean isLastInRow>
	//    2    4:ireturn         
	}

	public void setBackground(BaseColor basecolor)
	{
		background = basecolor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #39  <Field BaseColor background>
	//    3    5:return          
	}

	public void setBorderColor(BaseColor basecolor)
	{
		borderBottomColor = basecolor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #42  <Field BaseColor borderBottomColor>
		borderLeftColor = basecolor;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #45  <Field BaseColor borderLeftColor>
		borderRightColor = basecolor;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:putfield        #48  <Field BaseColor borderRightColor>
		borderTopColor = basecolor;
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:putfield        #51  <Field BaseColor borderTopColor>
	//   12   20:return          
	}

	public void setBorderColorBottom(BaseColor basecolor)
	{
		borderBottomColor = basecolor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #42  <Field BaseColor borderBottomColor>
	//    3    5:return          
	}

	public void setBorderColorLeft(BaseColor basecolor)
	{
		borderLeftColor = basecolor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field BaseColor borderLeftColor>
	//    3    5:return          
	}

	public void setBorderColorRight(BaseColor basecolor)
	{
		borderRightColor = basecolor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #48  <Field BaseColor borderRightColor>
	//    3    5:return          
	}

	public void setBorderColorTop(BaseColor basecolor)
	{
		borderTopColor = basecolor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field BaseColor borderTopColor>
	//    3    5:return          
	}

	public void setBorderWidth(float f)
	{
		borderBottomWidth = Float.valueOf(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #65  <Method Float Float.valueOf(float)>
	//    3    5:putfield        #32  <Field Float borderBottomWidth>
		borderLeftWidth = Float.valueOf(f);
	//    4    8:aload_0         
	//    5    9:fload_1         
	//    6   10:invokestatic    #65  <Method Float Float.valueOf(float)>
	//    7   13:putfield        #26  <Field Float borderLeftWidth>
		borderRightWidth = Float.valueOf(f);
	//    8   16:aload_0         
	//    9   17:fload_1         
	//   10   18:invokestatic    #65  <Method Float Float.valueOf(float)>
	//   11   21:putfield        #28  <Field Float borderRightWidth>
		borderTopWidth = Float.valueOf(f);
	//   12   24:aload_0         
	//   13   25:fload_1         
	//   14   26:invokestatic    #65  <Method Float Float.valueOf(float)>
	//   15   29:putfield        #30  <Field Float borderTopWidth>
	//   16   32:return          
	}

	public void setBorderWidthBottom(float f)
	{
		borderBottomWidth = Float.valueOf(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #65  <Method Float Float.valueOf(float)>
	//    3    5:putfield        #32  <Field Float borderBottomWidth>
	//    4    8:return          
	}

	public void setBorderWidthLeft(float f)
	{
		borderLeftWidth = Float.valueOf(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #65  <Method Float Float.valueOf(float)>
	//    3    5:putfield        #26  <Field Float borderLeftWidth>
	//    4    8:return          
	}

	public void setBorderWidthRight(float f)
	{
		borderRightWidth = Float.valueOf(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #65  <Method Float Float.valueOf(float)>
	//    3    5:putfield        #28  <Field Float borderRightWidth>
	//    4    8:return          
	}

	public void setBorderWidthTop(float f)
	{
		borderTopWidth = Float.valueOf(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #65  <Method Float Float.valueOf(float)>
	//    3    5:putfield        #30  <Field Float borderTopWidth>
	//    4    8:return          
	}

	public void setHorBorderSpacing(float f)
	{
		horBorderSpacing = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #77  <Field float horBorderSpacing>
	//    3    5:return          
	}

	public void setLastInRow(boolean flag)
	{
		isLastInRow = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #34  <Field boolean isLastInRow>
	//    3    5:return          
	}

	public void setVerBorderSpacing(float f)
	{
		verBorderSpacing = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #80  <Field float verBorderSpacing>
	//    3    5:return          
	}

	private BaseColor background;
	private BaseColor borderBottomColor;
	private Float borderBottomWidth;
	private BaseColor borderLeftColor;
	private Float borderLeftWidth;
	private BaseColor borderRightColor;
	private Float borderRightWidth;
	private BaseColor borderTopColor;
	private Float borderTopWidth;
	private float horBorderSpacing;
	private boolean isLastInRow;
	private float verBorderSpacing;
}
