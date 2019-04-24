// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser.clipper;


public class LongRect
{

	public LongRect()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public LongRect(long l, long l1, long l2, long l3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		left = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #17  <Field long left>
		top = l1;
	//    5    9:aload_0         
	//    6   10:lload_3         
	//    7   11:putfield        #19  <Field long top>
		right = l2;
	//    8   14:aload_0         
	//    9   15:lload           5
	//   10   17:putfield        #21  <Field long right>
		bottom = l3;
	//   11   20:aload_0         
	//   12   21:lload           7
	//   13   23:putfield        #23  <Field long bottom>
	//   14   26:return          
	}

	public LongRect(LongRect longrect)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		left = longrect.left;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #17  <Field long left>
	//    5    9:putfield        #17  <Field long left>
		top = longrect.top;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #19  <Field long top>
	//    9   17:putfield        #19  <Field long top>
		right = longrect.right;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #21  <Field long right>
	//   13   25:putfield        #21  <Field long right>
		bottom = longrect.bottom;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:getfield        #23  <Field long bottom>
	//   17   33:putfield        #23  <Field long bottom>
	//   18   36:return          
	}

	public long bottom;
	public long left;
	public long right;
	public long top;
}
