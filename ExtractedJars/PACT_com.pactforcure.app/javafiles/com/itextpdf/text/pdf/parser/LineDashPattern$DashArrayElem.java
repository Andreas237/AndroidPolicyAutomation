// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;


// Referenced classes of package com.itextpdf.text.pdf.parser:
//			LineDashPattern

public class LineDashPattern$DashArrayElem
{

	public float getVal()
	{
		return val;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field float val>
	//    2    4:freturn         
	}

	public boolean isGap()
	{
		return isGap;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field boolean isGap>
	//    2    4:ireturn         
	}

	public void setGap(boolean flag)
	{
		isGap = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #24  <Field boolean isGap>
	//    3    5:return          
	}

	public void setVal(float f)
	{
		val = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #22  <Field float val>
	//    3    5:return          
	}

	private boolean isGap;
	final LineDashPattern this$0;
	private float val;

	public LineDashPattern$DashArrayElem(float f, boolean flag)
	{
		this$0 = LineDashPattern.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field LineDashPattern this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
		val = f;
	//    5    9:aload_0         
	//    6   10:fload_2         
	//    7   11:putfield        #22  <Field float val>
		isGap = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #24  <Field boolean isGap>
	//   11   19:return          
	}
}
