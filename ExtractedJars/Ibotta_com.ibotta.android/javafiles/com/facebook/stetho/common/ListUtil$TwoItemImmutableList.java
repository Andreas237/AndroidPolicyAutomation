// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common;

import java.util.AbstractList;

// Referenced classes of package com.facebook.stetho.common:
//			ListUtil

private static final class ListUtil$TwoItemImmutableList extends AbstractList
	implements ListUtil.ImmutableList
{

	public Object get(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 1: default 24
	//	               0 37
	//	               1 32
		default:
			throw new IndexOutOfBoundsException();
	//    2   24:new             #30  <Class IndexOutOfBoundsException>
	//    3   27:dup             
	//    4   28:invokespecial   #31  <Method void IndexOutOfBoundsException()>
	//    5   31:athrow          

		case 1: // '\001'
			return mItem1;
	//    6   32:aload_0         
	//    7   33:getfield        #23  <Field Object mItem1>
	//    8   36:areturn         

		case 0: // '\0'
			return mItem0;
	//    9   37:aload_0         
	//   10   38:getfield        #21  <Field Object mItem0>
	//   11   41:areturn         
		}
	}

	public int size()
	{
		return 2;
	//    0    0:iconst_2        
	//    1    1:ireturn         
	}

	private final Object mItem0;
	private final Object mItem1;

	public ListUtil$TwoItemImmutableList(Object obj, Object obj1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void AbstractList()>
		mItem0 = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field Object mItem0>
		mItem1 = obj1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field Object mItem1>
	//    8   14:return          
	}
}
