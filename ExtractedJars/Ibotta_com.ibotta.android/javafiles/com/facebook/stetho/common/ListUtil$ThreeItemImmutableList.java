// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common;

import java.util.AbstractList;

// Referenced classes of package com.facebook.stetho.common:
//			ListUtil

private static final class ListUtil$ThreeItemImmutableList extends AbstractList
	implements ListUtil.ImmutableList
{

	public Object get(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 2: default 28
	//	               0 46
	//	               1 41
	//	               2 36
		default:
			throw new IndexOutOfBoundsException();
	//    2   28:new             #33  <Class IndexOutOfBoundsException>
	//    3   31:dup             
	//    4   32:invokespecial   #34  <Method void IndexOutOfBoundsException()>
	//    5   35:athrow          

		case 2: // '\002'
			return mItem2;
	//    6   36:aload_0         
	//    7   37:getfield        #26  <Field Object mItem2>
	//    8   40:areturn         

		case 1: // '\001'
			return mItem1;
	//    9   41:aload_0         
	//   10   42:getfield        #24  <Field Object mItem1>
	//   11   45:areturn         

		case 0: // '\0'
			return mItem0;
	//   12   46:aload_0         
	//   13   47:getfield        #22  <Field Object mItem0>
	//   14   50:areturn         
		}
	}

	public int size()
	{
		return 3;
	//    0    0:iconst_3        
	//    1    1:ireturn         
	}

	private final Object mItem0;
	private final Object mItem1;
	private final Object mItem2;

	public ListUtil$ThreeItemImmutableList(Object obj, Object obj1, Object obj2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void AbstractList()>
		mItem0 = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Object mItem0>
		mItem1 = obj1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field Object mItem1>
		mItem2 = obj2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #26  <Field Object mItem2>
	//   11   19:return          
	}
}
