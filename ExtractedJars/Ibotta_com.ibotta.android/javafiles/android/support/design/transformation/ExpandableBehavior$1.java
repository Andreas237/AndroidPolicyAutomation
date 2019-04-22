// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.transformation;

import android.support.design.expandable.ExpandableWidget;
import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package android.support.design.transformation:
//			ExpandableBehavior

class ExpandableBehavior$1
	implements android.view.eDrawListener
{

	public boolean onPreDraw()
	{
		val$child.getViewTreeObserver().removeOnPreDrawListener(((android.view.eDrawListener) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field View val$child>
	//    2    4:invokevirtual   #41  <Method ViewTreeObserver View.getViewTreeObserver()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #47  <Method void ViewTreeObserver.removeOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
		if(ExpandableBehavior.access$000(ExpandableBehavior.this) == val$expectedState)
	//*   5   11:aload_0         
	//*   6   12:getfield        #23  <Field ExpandableBehavior this$0>
	//*   7   15:invokestatic    #51  <Method int ExpandableBehavior.access$000(ExpandableBehavior)>
	//*   8   18:aload_0         
	//*   9   19:getfield        #27  <Field int val$expectedState>
	//*  10   22:icmpne          55
		{
			ExpandableBehavior expandablebehavior = ExpandableBehavior.this;
	//   11   25:aload_0         
	//   12   26:getfield        #23  <Field ExpandableBehavior this$0>
	//   13   29:astore_1        
			ExpandableWidget expandablewidget = val$dep;
	//   14   30:aload_0         
	//   15   31:getfield        #29  <Field ExpandableWidget val$dep>
	//   16   34:astore_2        
			expandablebehavior.onExpandedStateChange((View)expandablewidget, val$child, expandablewidget.isExpanded(), false);
	//   17   35:aload_1         
	//   18   36:aload_2         
	//   19   37:checkcast       #37  <Class View>
	//   20   40:aload_0         
	//   21   41:getfield        #25  <Field View val$child>
	//   22   44:aload_2         
	//   23   45:invokeinterface #56  <Method boolean ExpandableWidget.isExpanded()>
	//   24   50:iconst_0        
	//   25   51:invokevirtual   #60  <Method boolean ExpandableBehavior.onExpandedStateChange(View, View, boolean, boolean)>
	//   26   54:pop             
		}
		return false;
	//   27   55:iconst_0        
	//   28   56:ireturn         
	}

	final ExpandableBehavior this$0;
	final View val$child;
	final ExpandableWidget val$dep;
	final int val$expectedState;

	ExpandableBehavior$1()
	{
		this$0 = final_expandablebehavior;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field ExpandableBehavior this$0>
		val$child = view;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field View val$child>
		val$expectedState = i;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #27  <Field int val$expectedState>
		val$dep = ExpandableWidget.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #29  <Field ExpandableWidget val$dep>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #32  <Method void Object()>
	//   14   25:return          
	}
}
