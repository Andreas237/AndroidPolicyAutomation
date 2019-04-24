// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;


// Referenced classes of package com.itextpdf.text.pdf.parser:
//			GraphicsState, Matrix, LineDashPattern

public class PathPaintingRenderInfo
{

	public PathPaintingRenderInfo(int i, int j, GraphicsState graphicsstate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		operation = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #24  <Field int operation>
		rule = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #26  <Field int rule>
		gs = graphicsstate;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #28  <Field GraphicsState gs>
	//   11   19:return          
	}

	public PathPaintingRenderInfo(int i, GraphicsState graphicsstate)
	{
		this(i, 1, graphicsstate);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:aload_2         
	//    4    4:invokespecial   #32  <Method void PathPaintingRenderInfo(int, int, GraphicsState)>
	//    5    7:return          
	}

	public Matrix getCtm()
	{
		return gs.ctm;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field GraphicsState gs>
	//    2    4:getfield        #40  <Field Matrix GraphicsState.ctm>
	//    3    7:areturn         
	}

	public int getLineCapStyle()
	{
		return gs.getLineCapStyle();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field GraphicsState gs>
	//    2    4:invokevirtual   #44  <Method int GraphicsState.getLineCapStyle()>
	//    3    7:ireturn         
	}

	public LineDashPattern getLineDashPattern()
	{
		return gs.getLineDashPattern();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field GraphicsState gs>
	//    2    4:invokevirtual   #48  <Method LineDashPattern GraphicsState.getLineDashPattern()>
	//    3    7:areturn         
	}

	public int getLineJoinStyle()
	{
		return gs.getLineJoinStyle();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field GraphicsState gs>
	//    2    4:invokevirtual   #51  <Method int GraphicsState.getLineJoinStyle()>
	//    3    7:ireturn         
	}

	public float getLineWidth()
	{
		return gs.getLineWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field GraphicsState gs>
	//    2    4:invokevirtual   #55  <Method float GraphicsState.getLineWidth()>
	//    3    7:freturn         
	}

	public float getMiterLimit()
	{
		return gs.getMiterLimit();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field GraphicsState gs>
	//    2    4:invokevirtual   #58  <Method float GraphicsState.getMiterLimit()>
	//    3    7:freturn         
	}

	public int getOperation()
	{
		return operation;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int operation>
	//    2    4:ireturn         
	}

	public int getRule()
	{
		return rule;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int rule>
	//    2    4:ireturn         
	}

	public static final int EVEN_ODD_RULE = 2;
	public static final int FILL = 2;
	public static final int NONZERO_WINDING_RULE = 1;
	public static final int NO_OP = 0;
	public static final int STROKE = 1;
	private GraphicsState gs;
	private int operation;
	private int rule;
}
