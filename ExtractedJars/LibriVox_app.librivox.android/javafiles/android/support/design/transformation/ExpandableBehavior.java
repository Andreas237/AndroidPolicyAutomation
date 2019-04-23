// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.transformation;

import android.content.Context;
import android.support.design.d.b;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.aj;
import android.support.v4.view.ac;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.List;

// Referenced classes of package android.support.design.transformation:
//			a

public abstract class ExpandableBehavior extends aj
{

	public ExpandableBehavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void aj()>
		a = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #12  <Field int a>
	//    5    9:return          
	}

	public ExpandableBehavior(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #16  <Method void aj(Context, AttributeSet)>
		a = 0;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #12  <Field int a>
	//    7   11:return          
	}

	static int a(ExpandableBehavior expandablebehavior)
	{
		return expandablebehavior.a;
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field int a>
	//    2    4:ireturn         
	}

	private boolean a(boolean flag)
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
				int i = a;
	//    6    9:aload_0         
	//    7   10:getfield        #12  <Field int a>
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
		if(a == 1)
	//*  22   32:aload_0         
	//*  23   33:getfield        #12  <Field int a>
	//*  24   36:iconst_1        
	//*  25   37:icmpne          42
			flag = true;
	//   26   40:iconst_1        
	//   27   41:istore_1        
		return flag;
	//   28   42:iload_1         
	//   29   43:ireturn         
	}

	protected b a(CoordinatorLayout coordinatorlayout, View view)
	{
		List list = coordinatorlayout.c(view);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #25  <Method List CoordinatorLayout.c(View)>
	//    3    5:astore          5
		int j = list.size();
	//    4    7:aload           5
	//    5    9:invokeinterface #31  <Method int List.size()>
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
	//   14   27:invokeinterface #35  <Method Object List.get(int)>
	//   15   32:checkcast       #37  <Class View>
	//   16   35:astore          6
			if(a(coordinatorlayout, view, view1))
	//*  17   37:aload_0         
	//*  18   38:aload_1         
	//*  19   39:aload_2         
	//*  20   40:aload           6
	//*  21   42:invokevirtual   #40  <Method boolean a(CoordinatorLayout, View, View)>
	//*  22   45:ifeq            54
				return (b)view1;
	//   23   48:aload           6
	//   24   50:checkcast       #42  <Class b>
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

	public boolean a(CoordinatorLayout coordinatorlayout, View view, int i)
	{
		if(!ac.x(view))
	//*   0    0:aload_2         
	//*   1    1:invokestatic    #49  <Method boolean ac.x(View)>
	//*   2    4:ifne            75
		{
			coordinatorlayout = ((CoordinatorLayout) (a(coordinatorlayout, view)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #51  <Method b a(CoordinatorLayout, View)>
	//    7   13:astore_1        
			if(coordinatorlayout != null && a(((b) (coordinatorlayout)).a()))
	//*   8   14:aload_1         
	//*   9   15:ifnull          75
	//*  10   18:aload_0         
	//*  11   19:aload_1         
	//*  12   20:invokeinterface #54  <Method boolean b.a()>
	//*  13   25:invokespecial   #56  <Method boolean a(boolean)>
	//*  14   28:ifeq            75
			{
				if(((b) (coordinatorlayout)).a())
	//*  15   31:aload_1         
	//*  16   32:invokeinterface #54  <Method boolean b.a()>
	//*  17   37:ifeq            45
					i = 1;
	//   18   40:iconst_1        
	//   19   41:istore_3        
				else
	//*  20   42:goto            47
					i = 2;
	//   21   45:iconst_2        
	//   22   46:istore_3        
				a = i;
	//   23   47:aload_0         
	//   24   48:iload_3         
	//   25   49:putfield        #12  <Field int a>
				i = a;
	//   26   52:aload_0         
	//   27   53:getfield        #12  <Field int a>
	//   28   56:istore_3        
				view.getViewTreeObserver().addOnPreDrawListener(((android.view.ViewTreeObserver.OnPreDrawListener) (new a(this, view, i, ((b) (coordinatorlayout))))));
	//   29   57:aload_2         
	//   30   58:invokevirtual   #60  <Method ViewTreeObserver View.getViewTreeObserver()>
	//   31   61:new             #62  <Class a>
	//   32   64:dup             
	//   33   65:aload_0         
	//   34   66:aload_2         
	//   35   67:iload_3         
	//   36   68:aload_1         
	//   37   69:invokespecial   #65  <Method void a(ExpandableBehavior, View, int, b)>
	//   38   72:invokevirtual   #71  <Method void ViewTreeObserver.addOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
			}
		}
		return false;
	//   39   75:iconst_0        
	//   40   76:ireturn         
	}

	public abstract boolean a(CoordinatorLayout coordinatorlayout, View view, View view1);

	protected abstract boolean a(View view, View view1, boolean flag, boolean flag1);

	public boolean b(CoordinatorLayout coordinatorlayout, View view, View view1)
	{
		coordinatorlayout = ((CoordinatorLayout) ((b)view1));
	//    0    0:aload_3         
	//    1    1:checkcast       #42  <Class b>
	//    2    4:astore_1        
		if(a(((b) (coordinatorlayout)).a()))
	//*   3    5:aload_0         
	//*   4    6:aload_1         
	//*   5    7:invokeinterface #54  <Method boolean b.a()>
	//*   6   12:invokespecial   #56  <Method boolean a(boolean)>
	//*   7   15:ifeq            59
		{
			int i;
			if(((b) (coordinatorlayout)).a())
	//*   8   18:aload_1         
	//*   9   19:invokeinterface #54  <Method boolean b.a()>
	//*  10   24:ifeq            33
				i = 1;
	//   11   27:iconst_1        
	//   12   28:istore          4
			else
	//*  13   30:goto            36
				i = 2;
	//   14   33:iconst_2        
	//   15   34:istore          4
			a = i;
	//   16   36:aload_0         
	//   17   37:iload           4
	//   18   39:putfield        #12  <Field int a>
			return a((View)coordinatorlayout, view, ((b) (coordinatorlayout)).a(), true);
	//   19   42:aload_0         
	//   20   43:aload_1         
	//   21   44:checkcast       #37  <Class View>
	//   22   47:aload_2         
	//   23   48:aload_1         
	//   24   49:invokeinterface #54  <Method boolean b.a()>
	//   25   54:iconst_1        
	//   26   55:invokevirtual   #75  <Method boolean a(View, View, boolean, boolean)>
	//   27   58:ireturn         
		} else
		{
			return false;
	//   28   59:iconst_0        
	//   29   60:ireturn         
		}
	}

	private int a;
}
