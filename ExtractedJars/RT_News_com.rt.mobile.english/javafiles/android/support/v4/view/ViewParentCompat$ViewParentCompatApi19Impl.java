// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

// Referenced classes of package android.support.v4.view:
//			ViewParentCompat

static class ViewParentCompat$ViewParentCompatApi19Impl extends ViewParentCompat.ViewParentCompatBaseImpl
{

	public void notifySubtreeAccessibilityStateChanged(ViewParent viewparent, View view, View view1, int i)
	{
		viewparent.notifySubtreeAccessibilityStateChanged(view, view1, i);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:iload           4
	//    4    5:invokeinterface #22  <Method void ViewParent.notifySubtreeAccessibilityStateChanged(View, View, int)>
	//    5   10:return          
	}

	ViewParentCompat$ViewParentCompatApi19Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void ViewParentCompat$ViewParentCompatBaseImpl()>
	//    2    4:return          
	}
}
