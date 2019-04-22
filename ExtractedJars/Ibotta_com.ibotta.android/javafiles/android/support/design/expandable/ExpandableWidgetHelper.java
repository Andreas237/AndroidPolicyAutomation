// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.expandable;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.view.View;

public final class ExpandableWidgetHelper
{

	private void dispatchExpandedStateChanged()
	{
		android.view.ViewParent viewparent = widget.getParent();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field View widget>
	//    2    4:invokevirtual   #21  <Method android.view.ViewParent View.getParent()>
	//    3    7:astore_1        
		if(viewparent instanceof CoordinatorLayout)
	//*   4    8:aload_1         
	//*   5    9:instanceof      #23  <Class CoordinatorLayout>
	//*   6   12:ifeq            26
			((CoordinatorLayout)viewparent).dispatchDependentViewsChanged(widget);
	//    7   15:aload_1         
	//    8   16:checkcast       #23  <Class CoordinatorLayout>
	//    9   19:aload_0         
	//   10   20:getfield        #15  <Field View widget>
	//   11   23:invokevirtual   #27  <Method void CoordinatorLayout.dispatchDependentViewsChanged(View)>
	//   12   26:return          
	}

	public int getExpandedComponentIdHint()
	{
		return expandedComponentIdHint;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int expandedComponentIdHint>
	//    2    4:ireturn         
	}

	public boolean isExpanded()
	{
		return expanded;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field boolean expanded>
	//    2    4:ireturn         
	}

	public void onRestoreInstanceState(Bundle bundle)
	{
		expanded = bundle.getBoolean("expanded", false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #40  <String "expanded">
	//    3    4:iconst_0        
	//    4    5:invokevirtual   #46  <Method boolean Bundle.getBoolean(String, boolean)>
	//    5    8:putfield        #37  <Field boolean expanded>
		expandedComponentIdHint = bundle.getInt("expandedComponentIdHint", 0);
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:ldc1            #47  <String "expandedComponentIdHint">
	//    9   15:iconst_0        
	//   10   16:invokevirtual   #51  <Method int Bundle.getInt(String, int)>
	//   11   19:putfield        #32  <Field int expandedComponentIdHint>
		if(expanded)
	//*  12   22:aload_0         
	//*  13   23:getfield        #37  <Field boolean expanded>
	//*  14   26:ifeq            33
			dispatchExpandedStateChanged();
	//   15   29:aload_0         
	//   16   30:invokespecial   #53  <Method void dispatchExpandedStateChanged()>
	//   17   33:return          
	}

	public Bundle onSaveInstanceState()
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #42  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #58  <Method void Bundle()>
	//    3    7:astore_1        
		bundle.putBoolean("expanded", expanded);
	//    4    8:aload_1         
	//    5    9:ldc1            #40  <String "expanded">
	//    6   11:aload_0         
	//    7   12:getfield        #37  <Field boolean expanded>
	//    8   15:invokevirtual   #62  <Method void Bundle.putBoolean(String, boolean)>
		bundle.putInt("expandedComponentIdHint", expandedComponentIdHint);
	//    9   18:aload_1         
	//   10   19:ldc1            #47  <String "expandedComponentIdHint">
	//   11   21:aload_0         
	//   12   22:getfield        #32  <Field int expandedComponentIdHint>
	//   13   25:invokevirtual   #66  <Method void Bundle.putInt(String, int)>
		return bundle;
	//   14   28:aload_1         
	//   15   29:areturn         
	}

	public boolean setExpanded(boolean flag)
	{
		if(expanded != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field boolean expanded>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          19
		{
			expanded = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #37  <Field boolean expanded>
			dispatchExpandedStateChanged();
	//    7   13:aload_0         
	//    8   14:invokespecial   #53  <Method void dispatchExpandedStateChanged()>
			return true;
	//    9   17:iconst_1        
	//   10   18:ireturn         
		} else
		{
			return false;
	//   11   19:iconst_0        
	//   12   20:ireturn         
		}
	}

	public void setExpandedComponentIdHint(int i)
	{
		expandedComponentIdHint = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #32  <Field int expandedComponentIdHint>
	//    3    5:return          
	}

	private boolean expanded;
	private int expandedComponentIdHint;
	private final View widget;
}
