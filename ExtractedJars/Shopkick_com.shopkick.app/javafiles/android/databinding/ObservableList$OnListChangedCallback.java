// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;


// Referenced classes of package android.databinding:
//			ObservableList

public static abstract class ObservableList$OnListChangedCallback
{

	public abstract void onChanged(ObservableList observablelist);

	public abstract void onItemRangeChanged(ObservableList observablelist, int i, int j);

	public abstract void onItemRangeInserted(ObservableList observablelist, int i, int j);

	public abstract void onItemRangeMoved(ObservableList observablelist, int i, int j, int k);

	public abstract void onItemRangeRemoved(ObservableList observablelist, int i, int j);

	public ObservableList$OnListChangedCallback()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
