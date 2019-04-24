// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			CFFFont

protected static final class CFFFont$MarkerItem extends CFFFont.Item
{

	public void xref()
	{
		p.set(myOffset);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field CFFFont$OffsetItem p>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field int myOffset>
	//    4    8:invokevirtual   #28  <Method void CFFFont$OffsetItem.set(int)>
	//    5   11:return          
	}

	CFFFont$OffsetItem p;

	public CFFFont$MarkerItem(CFFFont$OffsetItem cfffont$offsetitem)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void CFFFont$Item()>
		p = cfffont$offsetitem;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field CFFFont$OffsetItem p>
	//    5    9:return          
	}
}
