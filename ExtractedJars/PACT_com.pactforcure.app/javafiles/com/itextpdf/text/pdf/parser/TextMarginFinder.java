// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;


// Referenced classes of package com.itextpdf.text.pdf.parser:
//			RenderListener, TextRenderInfo, LineSegment, ImageRenderInfo

public class TextMarginFinder
	implements RenderListener
{

	public TextMarginFinder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		textRectangle = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #14  <Field com.itextpdf.awt.geom.Rectangle2D$Float textRectangle>
	//    5    9:return          
	}

	public void beginTextBlock()
	{
	//    0    0:return          
	}

	public void endTextBlock()
	{
	//    0    0:return          
	}

	public float getHeight()
	{
		return textRectangle.height;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field com.itextpdf.awt.geom.Rectangle2D$Float textRectangle>
	//    2    4:getfield        #25  <Field float com.itextpdf.awt.geom.Rectangle2D$Float.height>
	//    3    7:freturn         
	}

	public float getLlx()
	{
		return textRectangle.x;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field com.itextpdf.awt.geom.Rectangle2D$Float textRectangle>
	//    2    4:getfield        #29  <Field float com.itextpdf.awt.geom.Rectangle2D$Float.x>
	//    3    7:freturn         
	}

	public float getLly()
	{
		return textRectangle.y;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field com.itextpdf.awt.geom.Rectangle2D$Float textRectangle>
	//    2    4:getfield        #33  <Field float com.itextpdf.awt.geom.Rectangle2D$Float.y>
	//    3    7:freturn         
	}

	public float getUrx()
	{
		return textRectangle.x + textRectangle.width;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field com.itextpdf.awt.geom.Rectangle2D$Float textRectangle>
	//    2    4:getfield        #29  <Field float com.itextpdf.awt.geom.Rectangle2D$Float.x>
	//    3    7:aload_0         
	//    4    8:getfield        #14  <Field com.itextpdf.awt.geom.Rectangle2D$Float textRectangle>
	//    5   11:getfield        #37  <Field float com.itextpdf.awt.geom.Rectangle2D$Float.width>
	//    6   14:fadd            
	//    7   15:freturn         
	}

	public float getUry()
	{
		return textRectangle.y + textRectangle.height;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field com.itextpdf.awt.geom.Rectangle2D$Float textRectangle>
	//    2    4:getfield        #33  <Field float com.itextpdf.awt.geom.Rectangle2D$Float.y>
	//    3    7:aload_0         
	//    4    8:getfield        #14  <Field com.itextpdf.awt.geom.Rectangle2D$Float textRectangle>
	//    5   11:getfield        #25  <Field float com.itextpdf.awt.geom.Rectangle2D$Float.height>
	//    6   14:fadd            
	//    7   15:freturn         
	}

	public float getWidth()
	{
		return textRectangle.width;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field com.itextpdf.awt.geom.Rectangle2D$Float textRectangle>
	//    2    4:getfield        #37  <Field float com.itextpdf.awt.geom.Rectangle2D$Float.width>
	//    3    7:freturn         
	}

	public void renderImage(ImageRenderInfo imagerenderinfo)
	{
	//    0    0:return          
	}

	public void renderText(TextRenderInfo textrenderinfo)
	{
		if(textRectangle == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field com.itextpdf.awt.geom.Rectangle2D$Float textRectangle>
	//*   2    4:ifnonnull       33
			textRectangle = textrenderinfo.getDescentLine().getBoundingRectange();
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #49  <Method LineSegment TextRenderInfo.getDescentLine()>
	//    6   12:invokevirtual   #55  <Method com.itextpdf.awt.geom.Rectangle2D$Float LineSegment.getBoundingRectange()>
	//    7   15:putfield        #14  <Field com.itextpdf.awt.geom.Rectangle2D$Float textRectangle>
		else
	//*   8   18:aload_0         
	//*   9   19:getfield        #14  <Field com.itextpdf.awt.geom.Rectangle2D$Float textRectangle>
	//*  10   22:aload_1         
	//*  11   23:invokevirtual   #58  <Method LineSegment TextRenderInfo.getAscentLine()>
	//*  12   26:invokevirtual   #55  <Method com.itextpdf.awt.geom.Rectangle2D$Float LineSegment.getBoundingRectange()>
	//*  13   29:invokevirtual   #62  <Method void com.itextpdf.awt.geom.Rectangle2D$Float.add(com.itextpdf.awt.geom.Rectangle2D)>
	//*  14   32:return          
			textRectangle.add(((com.itextpdf.awt.geom.Rectangle2D) (textrenderinfo.getDescentLine().getBoundingRectange())));
	//   15   33:aload_0         
	//   16   34:getfield        #14  <Field com.itextpdf.awt.geom.Rectangle2D$Float textRectangle>
	//   17   37:aload_1         
	//   18   38:invokevirtual   #49  <Method LineSegment TextRenderInfo.getDescentLine()>
	//   19   41:invokevirtual   #55  <Method com.itextpdf.awt.geom.Rectangle2D$Float LineSegment.getBoundingRectange()>
	//   20   44:invokevirtual   #62  <Method void com.itextpdf.awt.geom.Rectangle2D$Float.add(com.itextpdf.awt.geom.Rectangle2D)>
		textRectangle.add(((com.itextpdf.awt.geom.Rectangle2D) (textrenderinfo.getAscentLine().getBoundingRectange())));
	//*  21   47:goto            18
	}

	private com.itextpdf.awt.geom.Rectangle2D.Float textRectangle;
}
