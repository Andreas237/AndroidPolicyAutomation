// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser.clipper;


// Referenced classes of package com.itextpdf.text.pdf.parser.clipper:
//			DefaultClipper, Edge

private class DefaultClipper$IntersectNode
{

	public Point.LongPoint getPt()
	{
		return pt;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Point$LongPoint pt>
	//    2    4:areturn         
	}

	public void setPt(Point.LongPoint longpoint)
	{
		pt = longpoint;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field Point$LongPoint pt>
	//    3    5:return          
	}

	Edge Edge2;
	Edge edge1;
	private Point.LongPoint pt;
	final DefaultClipper this$0;

	private DefaultClipper$IntersectNode()
	{
		this$0 = DefaultClipper.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field DefaultClipper this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}

	DefaultClipper$IntersectNode(DefaultClipper._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void DefaultClipper$IntersectNode(DefaultClipper)>
	//    3    5:return          
	}
}
