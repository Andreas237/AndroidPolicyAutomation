// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common;

import java.util.AbstractList;

// Referenced classes of package com.facebook.stetho.common:
//			ListUtil

private static final class ListUtil$ImmutableArrayList extends AbstractList
	implements ListUtil.ImmutableList
{

	public Object get(int i)
	{
		return mArray[i];
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Object[] mArray>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:areturn         
	}

	public int size()
	{
		return mArray.length;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Object[] mArray>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	private final Object mArray[];

	public ListUtil$ImmutableArrayList(Object aobj[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void AbstractList()>
		mArray = aobj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field Object[] mArray>
	//    5    9:return          
	}
}
