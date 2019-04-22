// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common;

import java.util.AbstractList;

// Referenced classes of package com.facebook.stetho.common:
//			ListUtil

private static final class ListUtil$OneItemImmutableList extends AbstractList
	implements ListUtil.ImmutableList
{

	public Object get(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            9
			return mItem;
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Object mItem>
	//    4    8:areturn         
		else
			throw new IndexOutOfBoundsException();
	//    5    9:new             #27  <Class IndexOutOfBoundsException>
	//    6   12:dup             
	//    7   13:invokespecial   #28  <Method void IndexOutOfBoundsException()>
	//    8   16:athrow          
	}

	public int size()
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private final Object mItem;

	public ListUtil$OneItemImmutableList(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void AbstractList()>
		mItem = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Object mItem>
	//    5    9:return          
	}
}
