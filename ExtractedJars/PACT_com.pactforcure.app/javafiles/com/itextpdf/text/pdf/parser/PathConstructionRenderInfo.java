// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import java.util.List;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			Matrix

public class PathConstructionRenderInfo
{

	public PathConstructionRenderInfo(int i, Matrix matrix)
	{
		this(i, ((List) (null)), matrix);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:invokespecial   #30  <Method void PathConstructionRenderInfo(int, List, Matrix)>
	//    5    7:return          
	}

	public PathConstructionRenderInfo(int i, List list, Matrix matrix)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		operation = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #36  <Field int operation>
		segmentData = list;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #38  <Field List segmentData>
		ctm = matrix;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #40  <Field Matrix ctm>
	//   11   19:return          
	}

	public Matrix getCtm()
	{
		return ctm;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Matrix ctm>
	//    2    4:areturn         
	}

	public int getOperation()
	{
		return operation;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int operation>
	//    2    4:ireturn         
	}

	public List getSegmentData()
	{
		return segmentData;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field List segmentData>
	//    2    4:areturn         
	}

	public static final int CLOSE = 6;
	public static final int CURVE_123 = 3;
	public static final int CURVE_13 = 5;
	public static final int CURVE_23 = 4;
	public static final int LINETO = 2;
	public static final int MOVETO = 1;
	public static final int RECT = 7;
	private Matrix ctm;
	private int operation;
	private List segmentData;
}
