// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser.clipper;


// Referenced classes of package com.itextpdf.text.pdf.parser.clipper:
//			ClipperBase, Edge

protected class ClipperBase$LocalMinima
{

	Edge leftBound;
	ClipperBase$LocalMinima next;
	Edge rightBound;
	final ClipperBase this$0;
	long y;

	protected ClipperBase$LocalMinima()
	{
		this$0 = ClipperBase.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field ClipperBase this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void Object()>
	//    5    9:return          
	}
}
