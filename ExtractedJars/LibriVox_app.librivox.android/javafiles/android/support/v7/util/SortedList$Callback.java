// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.util;

import java.util.Comparator;

// Referenced classes of package android.support.v7.util:
//			ListUpdateCallback

public abstract class SortedList$Callback
	implements ListUpdateCallback, Comparator
{

	public abstract boolean areContentsTheSame(Object obj, Object obj1);

	public abstract boolean areItemsTheSame(Object obj, Object obj1);

	public abstract int compare(Object obj, Object obj1);

	public Object getChangePayload(Object obj, Object obj1)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public abstract void onChanged(int i, int j);

	public void onChanged(int i, int j, Object obj)
	{
		onChanged(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #25  <Method void onChanged(int, int)>
	//    4    6:return          
	}

	public SortedList$Callback()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
