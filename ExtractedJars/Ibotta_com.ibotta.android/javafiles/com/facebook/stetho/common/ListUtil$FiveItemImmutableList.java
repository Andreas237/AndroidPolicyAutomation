// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common;

import java.util.AbstractList;

// Referenced classes of package com.facebook.stetho.common:
//			ListUtil

private static final class ListUtil$FiveItemImmutableList extends AbstractList
	implements ListUtil.ImmutableList
{

	public Object get(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 4: default 36
	//	               0 64
	//	               1 59
	//	               2 54
	//	               3 49
	//	               4 44
		default:
			throw new IndexOutOfBoundsException();
	//    2   36:new             #39  <Class IndexOutOfBoundsException>
	//    3   39:dup             
	//    4   40:invokespecial   #40  <Method void IndexOutOfBoundsException()>
	//    5   43:athrow          

		case 4: // '\004'
			return mItem4;
	//    6   44:aload_0         
	//    7   45:getfield        #32  <Field Object mItem4>
	//    8   48:areturn         

		case 3: // '\003'
			return mItem3;
	//    9   49:aload_0         
	//   10   50:getfield        #30  <Field Object mItem3>
	//   11   53:areturn         

		case 2: // '\002'
			return mItem2;
	//   12   54:aload_0         
	//   13   55:getfield        #28  <Field Object mItem2>
	//   14   58:areturn         

		case 1: // '\001'
			return mItem1;
	//   15   59:aload_0         
	//   16   60:getfield        #26  <Field Object mItem1>
	//   17   63:areturn         

		case 0: // '\0'
			return mItem0;
	//   18   64:aload_0         
	//   19   65:getfield        #24  <Field Object mItem0>
	//   20   68:areturn         
		}
	}

	public int size()
	{
		return 5;
	//    0    0:iconst_5        
	//    1    1:ireturn         
	}

	private final Object mItem0;
	private final Object mItem1;
	private final Object mItem2;
	private final Object mItem3;
	private final Object mItem4;

	public ListUtil$FiveItemImmutableList(Object obj, Object obj1, Object obj2, Object obj3, Object obj4)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void AbstractList()>
		mItem0 = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field Object mItem0>
		mItem1 = obj1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field Object mItem1>
		mItem2 = obj2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #28  <Field Object mItem2>
		mItem3 = obj3;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #30  <Field Object mItem3>
		mItem4 = obj4;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #32  <Field Object mItem4>
	//   17   31:return          
	}
}
