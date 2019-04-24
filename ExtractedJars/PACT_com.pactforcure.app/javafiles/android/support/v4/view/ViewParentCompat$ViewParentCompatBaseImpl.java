// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

// Referenced classes of package android.support.v4.view:
//			ViewParentCompat, NestedScrollingParent

static class ViewParentCompat$ViewParentCompatBaseImpl
{

	public void notifySubtreeAccessibilityStateChanged(ViewParent viewparent, View view, View view1, int i)
	{
	//    0    0:return          
	}

	public boolean onNestedFling(ViewParent viewparent, View view, float f, float f1, boolean flag)
	{
		if(viewparent instanceof NestedScrollingParent)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #18  <Class NestedScrollingParent>
	//*   2    4:ifeq            23
			return ((NestedScrollingParent)viewparent).onNestedFling(view, f, f1, flag);
	//    3    7:aload_1         
	//    4    8:checkcast       #18  <Class NestedScrollingParent>
	//    5   11:aload_2         
	//    6   12:fload_3         
	//    7   13:fload           4
	//    8   15:iload           5
	//    9   17:invokeinterface #21  <Method boolean NestedScrollingParent.onNestedFling(View, float, float, boolean)>
	//   10   22:ireturn         
		else
			return false;
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	public boolean onNestedPreFling(ViewParent viewparent, View view, float f, float f1)
	{
		if(viewparent instanceof NestedScrollingParent)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #18  <Class NestedScrollingParent>
	//*   2    4:ifeq            21
			return ((NestedScrollingParent)viewparent).onNestedPreFling(view, f, f1);
	//    3    7:aload_1         
	//    4    8:checkcast       #18  <Class NestedScrollingParent>
	//    5   11:aload_2         
	//    6   12:fload_3         
	//    7   13:fload           4
	//    8   15:invokeinterface #26  <Method boolean NestedScrollingParent.onNestedPreFling(View, float, float)>
	//    9   20:ireturn         
		else
			return false;
	//   10   21:iconst_0        
	//   11   22:ireturn         
	}

	public void onNestedPreScroll(ViewParent viewparent, View view, int i, int j, int ai[])
	{
		if(viewparent instanceof NestedScrollingParent)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #18  <Class NestedScrollingParent>
	//*   2    4:ifeq            22
			((NestedScrollingParent)viewparent).onNestedPreScroll(view, i, j, ai);
	//    3    7:aload_1         
	//    4    8:checkcast       #18  <Class NestedScrollingParent>
	//    5   11:aload_2         
	//    6   12:iload_3         
	//    7   13:iload           4
	//    8   15:aload           5
	//    9   17:invokeinterface #31  <Method void NestedScrollingParent.onNestedPreScroll(View, int, int, int[])>
	//   10   22:return          
	}

	public void onNestedScroll(ViewParent viewparent, View view, int i, int j, int k, int l)
	{
		if(viewparent instanceof NestedScrollingParent)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #18  <Class NestedScrollingParent>
	//*   2    4:ifeq            24
			((NestedScrollingParent)viewparent).onNestedScroll(view, i, j, k, l);
	//    3    7:aload_1         
	//    4    8:checkcast       #18  <Class NestedScrollingParent>
	//    5   11:aload_2         
	//    6   12:iload_3         
	//    7   13:iload           4
	//    8   15:iload           5
	//    9   17:iload           6
	//   10   19:invokeinterface #36  <Method void NestedScrollingParent.onNestedScroll(View, int, int, int, int)>
	//   11   24:return          
	}

	public void onNestedScrollAccepted(ViewParent viewparent, View view, View view1, int i)
	{
		if(viewparent instanceof NestedScrollingParent)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #18  <Class NestedScrollingParent>
	//*   2    4:ifeq            20
			((NestedScrollingParent)viewparent).onNestedScrollAccepted(view, view1, i);
	//    3    7:aload_1         
	//    4    8:checkcast       #18  <Class NestedScrollingParent>
	//    5   11:aload_2         
	//    6   12:aload_3         
	//    7   13:iload           4
	//    8   15:invokeinterface #40  <Method void NestedScrollingParent.onNestedScrollAccepted(View, View, int)>
	//    9   20:return          
	}

	public boolean onStartNestedScroll(ViewParent viewparent, View view, View view1, int i)
	{
		if(viewparent instanceof NestedScrollingParent)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #18  <Class NestedScrollingParent>
	//*   2    4:ifeq            21
			return ((NestedScrollingParent)viewparent).onStartNestedScroll(view, view1, i);
	//    3    7:aload_1         
	//    4    8:checkcast       #18  <Class NestedScrollingParent>
	//    5   11:aload_2         
	//    6   12:aload_3         
	//    7   13:iload           4
	//    8   15:invokeinterface #45  <Method boolean NestedScrollingParent.onStartNestedScroll(View, View, int)>
	//    9   20:ireturn         
		else
			return false;
	//   10   21:iconst_0        
	//   11   22:ireturn         
	}

	public void onStopNestedScroll(ViewParent viewparent, View view)
	{
		if(viewparent instanceof NestedScrollingParent)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #18  <Class NestedScrollingParent>
	//*   2    4:ifeq            17
			((NestedScrollingParent)viewparent).onStopNestedScroll(view);
	//    3    7:aload_1         
	//    4    8:checkcast       #18  <Class NestedScrollingParent>
	//    5   11:aload_2         
	//    6   12:invokeinterface #50  <Method void NestedScrollingParent.onStopNestedScroll(View)>
	//    7   17:return          
	}

	ViewParentCompat$ViewParentCompatBaseImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
