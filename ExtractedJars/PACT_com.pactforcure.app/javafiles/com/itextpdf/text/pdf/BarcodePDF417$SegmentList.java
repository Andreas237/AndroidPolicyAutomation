// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf:
//			BarcodePDF417

protected static class BarcodePDF417$SegmentList
{

	public void add(char c, int i, int j)
	{
		list.add(((Object) (new BarcodePDF417.Segment(c, i, j))));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ArrayList list>
	//    2    4:new             #24  <Class BarcodePDF417$Segment>
	//    3    7:dup             
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:invokespecial   #26  <Method void BarcodePDF417$Segment(char, int, int)>
	//    8   14:invokevirtual   #29  <Method boolean ArrayList.add(Object)>
	//    9   17:pop             
	//   10   18:return          
	}

	public BarcodePDF417.Segment get(int i)
	{
		if(i < 0 || i >= list.size())
	//*   0    0:iload_1         
	//*   1    1:iflt            15
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #19  <Field ArrayList list>
	//*   5    9:invokevirtual   #35  <Method int ArrayList.size()>
	//*   6   12:icmplt          17
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
		else
			return (BarcodePDF417.Segment)list.get(i);
	//    9   17:aload_0         
	//   10   18:getfield        #19  <Field ArrayList list>
	//   11   21:iload_1         
	//   12   22:invokevirtual   #38  <Method Object ArrayList.get(int)>
	//   13   25:checkcast       #24  <Class BarcodePDF417$Segment>
	//   14   28:areturn         
	}

	public void remove(int i)
	{
		if(i < 0 || i >= list.size())
	//*   0    0:iload_1         
	//*   1    1:iflt            15
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #19  <Field ArrayList list>
	//*   5    9:invokevirtual   #35  <Method int ArrayList.size()>
	//*   6   12:icmplt          16
		{
			return;
	//    7   15:return          
		} else
		{
			list.remove(i);
	//    8   16:aload_0         
	//    9   17:getfield        #19  <Field ArrayList list>
	//   10   20:iload_1         
	//   11   21:invokevirtual   #42  <Method Object ArrayList.remove(int)>
	//   12   24:pop             
			return;
	//   13   25:return          
		}
	}

	public int size()
	{
		return list.size();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ArrayList list>
	//    2    4:invokevirtual   #35  <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	protected ArrayList list;

	protected BarcodePDF417$SegmentList()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		list = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #16  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void ArrayList()>
	//    6   12:putfield        #19  <Field ArrayList list>
	//    7   15:return          
	}
}
