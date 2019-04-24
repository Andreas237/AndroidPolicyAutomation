// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			CFFFont

protected static final class CFFFont$SubrMarkerItem extends CFFFont.Item
{

	public void xref()
	{
		offItem.set(myOffset - indexBase.myOffset);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field CFFFont$OffsetItem offItem>
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field int myOffset>
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field CFFFont$IndexBaseItem indexBase>
	//    6   12:getfield        #29  <Field int CFFFont$IndexBaseItem.myOffset>
	//    7   15:isub            
	//    8   16:invokevirtual   #35  <Method void CFFFont$OffsetItem.set(int)>
	//    9   19:return          
	}

	private CFFFont.IndexBaseItem indexBase;
	private CFFFont.OffsetItem offItem;

	public CFFFont$SubrMarkerItem(CFFFont.OffsetItem offsetitem, CFFFont.IndexBaseItem indexbaseitem)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void CFFFont$Item()>
		offItem = offsetitem;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field CFFFont$OffsetItem offItem>
		indexBase = indexbaseitem;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field CFFFont$IndexBaseItem indexBase>
	//    8   14:return          
	}
}
