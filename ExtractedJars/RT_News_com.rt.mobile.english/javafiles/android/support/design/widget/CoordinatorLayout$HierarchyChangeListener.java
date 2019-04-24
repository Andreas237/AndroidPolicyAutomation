// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.view.View;

// Referenced classes of package android.support.design.widget:
//			CoordinatorLayout

private class CoordinatorLayout$HierarchyChangeListener
	implements android.view.ViewGroup.OnHierarchyChangeListener
{

	public void onChildViewAdded(View view, View view1)
	{
		if(mOnHierarchyChangeListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field CoordinatorLayout this$0>
	//*   2    4:getfield        #25  <Field android.view.ViewGroup$OnHierarchyChangeListener CoordinatorLayout.mOnHierarchyChangeListener>
	//*   3    7:ifnull          24
			mOnHierarchyChangeListener.onChildViewAdded(view, view1);
	//    4   10:aload_0         
	//    5   11:getfield        #15  <Field CoordinatorLayout this$0>
	//    6   14:getfield        #25  <Field android.view.ViewGroup$OnHierarchyChangeListener CoordinatorLayout.mOnHierarchyChangeListener>
	//    7   17:aload_1         
	//    8   18:aload_2         
	//    9   19:invokeinterface #27  <Method void android.view.ViewGroup$OnHierarchyChangeListener.onChildViewAdded(View, View)>
	//   10   24:return          
	}

	public void onChildViewRemoved(View view, View view1)
	{
		onChildViewsChanged(2);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field CoordinatorLayout this$0>
	//    2    4:iconst_2        
	//    3    5:invokevirtual   #32  <Method void CoordinatorLayout.onChildViewsChanged(int)>
		if(mOnHierarchyChangeListener != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #15  <Field CoordinatorLayout this$0>
	//*   6   12:getfield        #25  <Field android.view.ViewGroup$OnHierarchyChangeListener CoordinatorLayout.mOnHierarchyChangeListener>
	//*   7   15:ifnull          32
			mOnHierarchyChangeListener.onChildViewRemoved(view, view1);
	//    8   18:aload_0         
	//    9   19:getfield        #15  <Field CoordinatorLayout this$0>
	//   10   22:getfield        #25  <Field android.view.ViewGroup$OnHierarchyChangeListener CoordinatorLayout.mOnHierarchyChangeListener>
	//   11   25:aload_1         
	//   12   26:aload_2         
	//   13   27:invokeinterface #34  <Method void android.view.ViewGroup$OnHierarchyChangeListener.onChildViewRemoved(View, View)>
	//   14   32:return          
	}

	final CoordinatorLayout this$0;

	CoordinatorLayout$HierarchyChangeListener()
	{
		this$0 = CoordinatorLayout.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field CoordinatorLayout this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
