// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common;

import java.util.AbstractList;

// Referenced classes of package com.facebook.stetho.common:
//			ListUtil

private static final class ListUtil$FourItemImmutableList extends AbstractList
	implements ListUtil.ImmutableList
{

	public Object get(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 3: default 32
	//	               0 55
	//	               1 50
	//	               2 45
	//	               3 40
		default:
			throw new IndexOutOfBoundsException();
	//    2   32:new             #36  <Class IndexOutOfBoundsException>
	//    3   35:dup             
	//    4   36:invokespecial   #37  <Method void IndexOutOfBoundsException()>
	//    5   39:athrow          

		case 3: // '\003'
			return mItem3;
	//    6   40:aload_0         
	//    7   41:getfield        #29  <Field Object mItem3>
	//    8   44:areturn         

		case 2: // '\002'
			return mItem2;
	//    9   45:aload_0         
	//   10   46:getfield        #27  <Field Object mItem2>
	//   11   49:areturn         

		case 1: // '\001'
			return mItem1;
	//   12   50:aload_0         
	//   13   51:getfield        #25  <Field Object mItem1>
	//   14   54:areturn         

		case 0: // '\0'
			return mItem0;
	//   15   55:aload_0         
	//   16   56:getfield        #23  <Field Object mItem0>
	//   17   59:areturn         
		}
	}

	public int size()
	{
		return 4;
	//    0    0:iconst_4        
	//    1    1:ireturn         
	}

	private final Object mItem0;
	private final Object mItem1;
	private final Object mItem2;
	private final Object mItem3;

	public ListUtil$FourItemImmutableList(Object obj, Object obj1, Object obj2, Object obj3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void AbstractList()>
		mItem0 = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field Object mItem0>
		mItem1 = obj1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field Object mItem1>
		mItem2 = obj2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #27  <Field Object mItem2>
		mItem3 = obj3;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #29  <Field Object mItem3>
	//   14   25:return          
	}
}
