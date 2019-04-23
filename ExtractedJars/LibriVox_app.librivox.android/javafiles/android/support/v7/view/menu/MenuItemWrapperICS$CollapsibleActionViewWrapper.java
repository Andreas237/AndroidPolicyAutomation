// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.support.v7.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

class MenuItemWrapperICS$CollapsibleActionViewWrapper extends FrameLayout
	implements CollapsibleActionView
{

	View getWrappedView()
	{
		return (View)mWrappedView;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field android.view.CollapsibleActionView mWrappedView>
	//    2    4:checkcast       #12  <Class View>
	//    3    7:areturn         
	}

	public void onActionViewCollapsed()
	{
		mWrappedView.onActionViewCollapsed();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field android.view.CollapsibleActionView mWrappedView>
	//    2    4:invokeinterface #33  <Method void android.view.CollapsibleActionView.onActionViewCollapsed()>
	//    3    9:return          
	}

	public void onActionViewExpanded()
	{
		mWrappedView.onActionViewExpanded();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field android.view.CollapsibleActionView mWrappedView>
	//    2    4:invokeinterface #36  <Method void android.view.CollapsibleActionView.onActionViewExpanded()>
	//    3    9:return          
	}

	final android.view.CollapsibleActionView mWrappedView;

	MenuItemWrapperICS$CollapsibleActionViewWrapper(View view)
	{
		super(view.getContext());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #16  <Method android.content.Context View.getContext()>
	//    3    5:invokespecial   #19  <Method void FrameLayout(android.content.Context)>
		mWrappedView = (android.view.CollapsibleActionView)view;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:checkcast       #21  <Class android.view.CollapsibleActionView>
	//    7   13:putfield        #23  <Field android.view.CollapsibleActionView mWrappedView>
		addView(view);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #26  <Method void addView(View)>
	//   11   21:return          
	}
}
