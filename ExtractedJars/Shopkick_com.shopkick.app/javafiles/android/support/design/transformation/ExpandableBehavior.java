// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.transformation;

import android.content.Context;
import android.support.design.expandable.ExpandableWidget;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.List;

public abstract class ExpandableBehavior extends android.support.design.widget.CoordinatorLayout.Behavior
{

	public ExpandableBehavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void android.support.design.widget.CoordinatorLayout$Behavior()>
		currentState = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #21  <Field int currentState>
	//    5    9:return          
	}

	public ExpandableBehavior(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #25  <Method void android.support.design.widget.CoordinatorLayout$Behavior(Context, AttributeSet)>
		currentState = 0;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #21  <Field int currentState>
	//    7   11:return          
	}

	private boolean didStateChange(boolean flag)
	{
		boolean flag2;
label0:
		{
label1:
			{
				flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
				boolean flag1 = false;
	//    2    3:iconst_0        
	//    3    4:istore_3        
				if(!flag)
					break label0;
	//    4    5:iload_1         
	//    5    6:ifeq            29
				int i = currentState;
	//    6    9:aload_0         
	//    7   10:getfield        #21  <Field int currentState>
	//    8   13:istore_2        
				if(i != 0)
	//*   9   14:iload_2         
	//*  10   15:ifeq            25
				{
					flag = flag1;
	//   11   18:iload_3         
	//   12   19:istore_1        
					if(i != 2)
						break label1;
	//   13   20:iload_2         
	//   14   21:iconst_2        
	//   15   22:icmpne          27
				}
				flag = true;
	//   16   25:iconst_1        
	//   17   26:istore_1        
			}
			return flag;
	//   18   27:iload_1         
	//   19   28:ireturn         
		}
		flag = flag2;
	//   20   29:iload           4
	//   21   31:istore_1        
		if(currentState == 1)
	//*  22   32:aload_0         
	//*  23   33:getfield        #21  <Field int currentState>
	//*  24   36:iconst_1        
	//*  25   37:icmpne          42
			flag = true;
	//   26   40:iconst_1        
	//   27   41:istore_1        
		return flag;
	//   28   42:iload_1         
	//   29   43:ireturn         
	}

	public static ExpandableBehavior from(View view, Class class1)
	{
		view = ((View) (view.getLayoutParams()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:astore_0        
		if(view instanceof android.support.design.widget.CoordinatorLayout.LayoutParams)
	//*   3    5:aload_0         
	//*   4    6:instanceof      #39  <Class android.support.design.widget.CoordinatorLayout$LayoutParams>
	//*   5    9:ifeq            46
		{
			view = ((View) (((android.support.design.widget.CoordinatorLayout.LayoutParams)view).getBehavior()));
	//    6   12:aload_0         
	//    7   13:checkcast       #39  <Class android.support.design.widget.CoordinatorLayout$LayoutParams>
	//    8   16:invokevirtual   #43  <Method android.support.design.widget.CoordinatorLayout$Behavior android.support.design.widget.CoordinatorLayout$LayoutParams.getBehavior()>
	//    9   19:astore_0        
			if(view instanceof ExpandableBehavior)
	//*  10   20:aload_0         
	//*  11   21:instanceof      #2   <Class ExpandableBehavior>
	//*  12   24:ifeq            36
				return (ExpandableBehavior)class1.cast(((Object) (view)));
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:invokevirtual   #49  <Method Object Class.cast(Object)>
	//   16   32:checkcast       #2   <Class ExpandableBehavior>
	//   17   35:areturn         
			else
				throw new IllegalArgumentException("The view is not associated with ExpandableBehavior");
	//   18   36:new             #51  <Class IllegalArgumentException>
	//   19   39:dup             
	//   20   40:ldc1            #53  <String "The view is not associated with ExpandableBehavior">
	//   21   42:invokespecial   #56  <Method void IllegalArgumentException(String)>
	//   22   45:athrow          
		} else
		{
			throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
	//   23   46:new             #51  <Class IllegalArgumentException>
	//   24   49:dup             
	//   25   50:ldc1            #58  <String "The view is not a child of CoordinatorLayout">
	//   26   52:invokespecial   #56  <Method void IllegalArgumentException(String)>
	//   27   55:athrow          
		}
	}

	protected ExpandableWidget findExpandableWidget(CoordinatorLayout coordinatorlayout, View view)
	{
		List list = coordinatorlayout.getDependencies(view);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #69  <Method List CoordinatorLayout.getDependencies(View)>
	//    3    5:astore          5
		int j = list.size();
	//    4    7:aload           5
	//    5    9:invokeinterface #75  <Method int List.size()>
	//    6   14:istore          4
		for(int i = 0; i < j; i++)
	//*   7   16:iconst_0        
	//*   8   17:istore_3        
	//*   9   18:iload_3         
	//*  10   19:iload           4
	//*  11   21:icmpge          61
		{
			View view1 = (View)list.get(i);
	//   12   24:aload           5
	//   13   26:iload_3         
	//   14   27:invokeinterface #79  <Method Object List.get(int)>
	//   15   32:checkcast       #33  <Class View>
	//   16   35:astore          6
			if(layoutDependsOn(coordinatorlayout, view, view1))
	//*  17   37:aload_0         
	//*  18   38:aload_1         
	//*  19   39:aload_2         
	//*  20   40:aload           6
	//*  21   42:invokevirtual   #83  <Method boolean layoutDependsOn(CoordinatorLayout, View, View)>
	//*  22   45:ifeq            54
				return (ExpandableWidget)view1;
	//   23   48:aload           6
	//   24   50:checkcast       #85  <Class ExpandableWidget>
	//   25   53:areturn         
		}

	//   26   54:iload_3         
	//   27   55:iconst_1        
	//   28   56:iadd            
	//   29   57:istore_3        
	//*  30   58:goto            18
		return null;
	//   31   61:aconst_null     
	//   32   62:areturn         
	}

	public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorlayout, View view, View view1);

	public boolean onDependentViewChanged(CoordinatorLayout coordinatorlayout, View view, View view1)
	{
		coordinatorlayout = ((CoordinatorLayout) ((ExpandableWidget)view1));
	//    0    0:aload_3         
	//    1    1:checkcast       #85  <Class ExpandableWidget>
	//    2    4:astore_1        
		if(didStateChange(((ExpandableWidget) (coordinatorlayout)).isExpanded()))
	//*   3    5:aload_0         
	//*   4    6:aload_1         
	//*   5    7:invokeinterface #92  <Method boolean ExpandableWidget.isExpanded()>
	//*   6   12:invokespecial   #94  <Method boolean didStateChange(boolean)>
	//*   7   15:ifeq            59
		{
			int i;
			if(((ExpandableWidget) (coordinatorlayout)).isExpanded())
	//*   8   18:aload_1         
	//*   9   19:invokeinterface #92  <Method boolean ExpandableWidget.isExpanded()>
	//*  10   24:ifeq            33
				i = 1;
	//   11   27:iconst_1        
	//   12   28:istore          4
			else
	//*  13   30:goto            36
				i = 2;
	//   14   33:iconst_2        
	//   15   34:istore          4
			currentState = i;
	//   16   36:aload_0         
	//   17   37:iload           4
	//   18   39:putfield        #21  <Field int currentState>
			return onExpandedStateChange((View)coordinatorlayout, view, ((ExpandableWidget) (coordinatorlayout)).isExpanded(), true);
	//   19   42:aload_0         
	//   20   43:aload_1         
	//   21   44:checkcast       #33  <Class View>
	//   22   47:aload_2         
	//   23   48:aload_1         
	//   24   49:invokeinterface #92  <Method boolean ExpandableWidget.isExpanded()>
	//   25   54:iconst_1        
	//   26   55:invokevirtual   #98  <Method boolean onExpandedStateChange(View, View, boolean, boolean)>
	//   27   58:ireturn         
		} else
		{
			return false;
	//   28   59:iconst_0        
	//   29   60:ireturn         
		}
	}

	protected abstract boolean onExpandedStateChange(View view, View view1, boolean flag, boolean flag1);

	public boolean onLayoutChild(final CoordinatorLayout dep, final View child, final int expectedState)
	{
		if(!ViewCompat.isLaidOut(child))
	//*   0    0:aload_2         
	//*   1    1:invokestatic    #106 <Method boolean ViewCompat.isLaidOut(View)>
	//*   2    4:ifne            75
		{
			dep = ((CoordinatorLayout) (findExpandableWidget(dep, child)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #108 <Method ExpandableWidget findExpandableWidget(CoordinatorLayout, View)>
	//    7   13:astore_1        
			if(dep != null && didStateChange(((ExpandableWidget) (dep)).isExpanded()))
	//*   8   14:aload_1         
	//*   9   15:ifnull          75
	//*  10   18:aload_0         
	//*  11   19:aload_1         
	//*  12   20:invokeinterface #92  <Method boolean ExpandableWidget.isExpanded()>
	//*  13   25:invokespecial   #94  <Method boolean didStateChange(boolean)>
	//*  14   28:ifeq            75
			{
				if(((ExpandableWidget) (dep)).isExpanded())
	//*  15   31:aload_1         
	//*  16   32:invokeinterface #92  <Method boolean ExpandableWidget.isExpanded()>
	//*  17   37:ifeq            45
					expectedState = 1;
	//   18   40:iconst_1        
	//   19   41:istore_3        
				else
	//*  20   42:goto            47
					expectedState = 2;
	//   21   45:iconst_2        
	//   22   46:istore_3        
				currentState = expectedState;
	//   23   47:aload_0         
	//   24   48:iload_3         
	//   25   49:putfield        #21  <Field int currentState>
				expectedState = currentState;
	//   26   52:aload_0         
	//   27   53:getfield        #21  <Field int currentState>
	//   28   56:istore_3        
				child.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener() {

					public boolean onPreDraw()
					{
						child.getViewTreeObserver().removeOnPreDrawListener(((android.view.ViewTreeObserver.OnPreDrawListener) (this)));
					//    0    0:aload_0         
					//    1    1:getfield        #25  <Field View val$child>
					//    2    4:invokevirtual   #41  <Method ViewTreeObserver View.getViewTreeObserver()>
					//    3    7:aload_0         
					//    4    8:invokevirtual   #47  <Method void ViewTreeObserver.removeOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
						if(currentState == expectedState)
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
							ExpandableWidget expandablewidget = dep;
					//   14   30:aload_0         
					//   15   31:getfield        #29  <Field ExpandableWidget val$dep>
					//   16   34:astore_2        
							expandablebehavior.onExpandedStateChange((View)expandablewidget, child, expandablewidget.isExpanded(), false);
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

			
			{
				this$0 = ExpandableBehavior.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field ExpandableBehavior this$0>
				child = view;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field View val$child>
				expectedState = i;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #27  <Field int val$expectedState>
				dep = expandablewidget;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field ExpandableWidget val$dep>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
				}
);
	//   29   57:aload_2         
	//   30   58:invokevirtual   #112 <Method ViewTreeObserver View.getViewTreeObserver()>
	//   31   61:new             #7   <Class ExpandableBehavior$1>
	//   32   64:dup             
	//   33   65:aload_0         
	//   34   66:aload_2         
	//   35   67:iload_3         
	//   36   68:aload_1         
	//   37   69:invokespecial   #115 <Method void ExpandableBehavior$1(ExpandableBehavior, View, int, ExpandableWidget)>
	//   38   72:invokevirtual   #121 <Method void ViewTreeObserver.addOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
			}
		}
		return false;
	//   39   75:iconst_0        
	//   40   76:ireturn         
	}

	private static final int STATE_COLLAPSED = 2;
	private static final int STATE_EXPANDED = 1;
	private static final int STATE_UNINITIALIZED = 0;
	private int currentState;


/*
	static int access$000(ExpandableBehavior expandablebehavior)
	{
		return expandablebehavior.currentState;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int currentState>
	//    2    4:ireturn         
	}

*/
}
