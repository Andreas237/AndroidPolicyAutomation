// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;


// Referenced classes of package android.support.v4.view:
//			NestedScrollingChild

public interface NestedScrollingChild2
	extends NestedScrollingChild
{

	public abstract boolean dispatchNestedPreScroll(int i, int j, int ai[], int ai1[], int k);

	public abstract boolean dispatchNestedScroll(int i, int j, int k, int l, int ai[], int i1);

	public abstract boolean hasNestedScrollingParent(int i);

	public abstract boolean startNestedScroll(int i, int j);

	public abstract void stopNestedScroll(int i);
}
