// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.util;

import java.util.Comparator;

// Referenced classes of package android.support.v7.util:
//			ListUpdateCallback, SortedList

public static abstract class SortedList$Callback
	implements ListUpdateCallback, Comparator
{

	public abstract boolean areContentsTheSame(Object obj, Object obj1);

	public abstract boolean areItemsTheSame(Object obj, Object obj1);

	public abstract int compare(Object obj, Object obj1);

	public abstract void onChanged(int i, int j);

	public void onChanged(int i, int j, Object obj)
	{
		onChanged(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #27  <Method void onChanged(int, int)>
	//    4    6:return          
	}

	public SortedList$Callback()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
