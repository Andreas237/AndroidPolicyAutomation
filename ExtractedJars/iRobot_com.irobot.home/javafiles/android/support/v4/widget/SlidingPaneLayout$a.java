// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.a;
import android.support.v4.view.a.b;
import android.support.v4.view.s;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.widget:
//			SlidingPaneLayout

class SlidingPaneLayout$a extends a
{

	private void a(b b1, b b2)
	{
		Rect rect = c;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Rect c>
	//    2    4:astore_3        
		b2.a(rect);
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #29  <Method void b.a(Rect)>
		b1.b(rect);
	//    6   10:aload_1         
	//    7   11:aload_3         
	//    8   12:invokevirtual   #32  <Method void b.b(Rect)>
		b2.c(rect);
	//    9   15:aload_2         
	//   10   16:aload_3         
	//   11   17:invokevirtual   #34  <Method void b.c(Rect)>
		b1.d(rect);
	//   12   20:aload_1         
	//   13   21:aload_3         
	//   14   22:invokevirtual   #37  <Method void b.d(Rect)>
		b1.e(b2.h());
	//   15   25:aload_1         
	//   16   26:aload_2         
	//   17   27:invokevirtual   #41  <Method boolean b.h()>
	//   18   30:invokevirtual   #45  <Method void b.e(boolean)>
		b1.a(b2.p());
	//   19   33:aload_1         
	//   20   34:aload_2         
	//   21   35:invokevirtual   #49  <Method CharSequence b.p()>
	//   22   38:invokevirtual   #52  <Method void b.a(CharSequence)>
		b1.b(b2.q());
	//   23   41:aload_1         
	//   24   42:aload_2         
	//   25   43:invokevirtual   #55  <Method CharSequence b.q()>
	//   26   46:invokevirtual   #57  <Method void b.b(CharSequence)>
		b1.d(b2.s());
	//   27   49:aload_1         
	//   28   50:aload_2         
	//   29   51:invokevirtual   #60  <Method CharSequence b.s()>
	//   30   54:invokevirtual   #62  <Method void b.d(CharSequence)>
		b1.j(b2.m());
	//   31   57:aload_1         
	//   32   58:aload_2         
	//   33   59:invokevirtual   #65  <Method boolean b.m()>
	//   34   62:invokevirtual   #68  <Method void b.j(boolean)>
		b1.h(b2.k());
	//   35   65:aload_1         
	//   36   66:aload_2         
	//   37   67:invokevirtual   #71  <Method boolean b.k()>
	//   38   70:invokevirtual   #73  <Method void b.h(boolean)>
		b1.c(b2.f());
	//   39   73:aload_1         
	//   40   74:aload_2         
	//   41   75:invokevirtual   #76  <Method boolean b.f()>
	//   42   78:invokevirtual   #78  <Method void b.c(boolean)>
		b1.d(b2.g());
	//   43   81:aload_1         
	//   44   82:aload_2         
	//   45   83:invokevirtual   #81  <Method boolean b.g()>
	//   46   86:invokevirtual   #83  <Method void b.d(boolean)>
		b1.f(b2.i());
	//   47   89:aload_1         
	//   48   90:aload_2         
	//   49   91:invokevirtual   #86  <Method boolean b.i()>
	//   50   94:invokevirtual   #88  <Method void b.f(boolean)>
		b1.g(b2.j());
	//   51   97:aload_1         
	//   52   98:aload_2         
	//   53   99:invokevirtual   #90  <Method boolean b.j()>
	//   54  102:invokevirtual   #92  <Method void b.g(boolean)>
		b1.i(b2.l());
	//   55  105:aload_1         
	//   56  106:aload_2         
	//   57  107:invokevirtual   #95  <Method boolean b.l()>
	//   58  110:invokevirtual   #97  <Method void b.i(boolean)>
		b1.a(b2.b());
	//   59  113:aload_1         
	//   60  114:aload_2         
	//   61  115:invokevirtual   #100 <Method int b.b()>
	//   62  118:invokevirtual   #103 <Method void b.a(int)>
		b1.b(b2.c());
	//   63  121:aload_1         
	//   64  122:aload_2         
	//   65  123:invokevirtual   #105 <Method int b.c()>
	//   66  126:invokevirtual   #107 <Method void b.b(int)>
	//   67  129:return          
	}

	public void a(View view, b b1)
	{
		b b2 = android.support.v4.view.a.b.a(b1);
	//    0    0:aload_2         
	//    1    1:invokestatic    #111 <Method b b.a(b)>
	//    2    4:astore          5
		super.a(view, b2);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:aload           5
	//    6   10:invokespecial   #113 <Method void a.a(View, b)>
		a(b1, b2);
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:aload           5
	//   10   17:invokespecial   #115 <Method void a(b, b)>
		b2.t();
	//   11   20:aload           5
	//   12   22:invokevirtual   #118 <Method void b.t()>
		b1.b(((CharSequence) (((Class) (android/support/v4/widget/SlidingPaneLayout)).getName())));
	//   13   25:aload_2         
	//   14   26:ldc1            #6   <Class SlidingPaneLayout>
	//   15   28:invokevirtual   #124 <Method String Class.getName()>
	//   16   31:invokevirtual   #57  <Method void b.b(CharSequence)>
		b1.a(view);
	//   17   34:aload_2         
	//   18   35:aload_1         
	//   19   36:invokevirtual   #127 <Method void b.a(View)>
		view = ((View) (s.f(view)));
	//   20   39:aload_1         
	//   21   40:invokestatic    #132 <Method android.view.ViewParent s.f(View)>
	//   22   43:astore_1        
		if(view instanceof View)
	//*  23   44:aload_1         
	//*  24   45:instanceof      #134 <Class View>
	//*  25   48:ifeq            59
			b1.c((View)view);
	//   26   51:aload_2         
	//   27   52:aload_1         
	//   28   53:checkcast       #134 <Class View>
	//   29   56:invokevirtual   #136 <Method void b.c(View)>
		int j = a.getChildCount();
	//   30   59:aload_0         
	//   31   60:getfield        #14  <Field SlidingPaneLayout a>
	//   32   63:invokevirtual   #139 <Method int SlidingPaneLayout.getChildCount()>
	//   33   66:istore          4
		for(int i = 0; i < j; i++)
	//*  34   68:iconst_0        
	//*  35   69:istore_3        
	//*  36   70:iload_3         
	//*  37   71:iload           4
	//*  38   73:icmpge          117
		{
			view = a.getChildAt(i);
	//   39   76:aload_0         
	//   40   77:getfield        #14  <Field SlidingPaneLayout a>
	//   41   80:iload_3         
	//   42   81:invokevirtual   #143 <Method View SlidingPaneLayout.getChildAt(int)>
	//   43   84:astore_1        
			if(!b(view) && view.getVisibility() == 0)
	//*  44   85:aload_0         
	//*  45   86:aload_1         
	//*  46   87:invokevirtual   #146 <Method boolean b(View)>
	//*  47   90:ifne            110
	//*  48   93:aload_1         
	//*  49   94:invokevirtual   #149 <Method int View.getVisibility()>
	//*  50   97:ifne            110
			{
				s.a(view, 1);
	//   51  100:aload_1         
	//   52  101:iconst_1        
	//   53  102:invokestatic    #152 <Method void s.a(View, int)>
				b1.b(view);
	//   54  105:aload_2         
	//   55  106:aload_1         
	//   56  107:invokevirtual   #154 <Method void b.b(View)>
			}
		}

	//   57  110:iload_3         
	//   58  111:iconst_1        
	//   59  112:iadd            
	//   60  113:istore_3        
	//*  61  114:goto            70
	//   62  117:return          
	}

	public void a(View view, AccessibilityEvent accessibilityevent)
	{
		super.a(view, accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #157 <Method void a.a(View, AccessibilityEvent)>
		accessibilityevent.setClassName(((CharSequence) (((Class) (android/support/v4/widget/SlidingPaneLayout)).getName())));
	//    4    6:aload_2         
	//    5    7:ldc1            #6   <Class SlidingPaneLayout>
	//    6    9:invokevirtual   #124 <Method String Class.getName()>
	//    7   12:invokevirtual   #162 <Method void AccessibilityEvent.setClassName(CharSequence)>
	//    8   15:return          
	}

	public boolean a(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
	{
		if(!b(view))
	//*   0    0:aload_0         
	//*   1    1:aload_2         
	//*   2    2:invokevirtual   #146 <Method boolean b(View)>
	//*   3    5:ifne            16
			return super.a(viewgroup, view, accessibilityevent);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokespecial   #165 <Method boolean a.a(ViewGroup, View, AccessibilityEvent)>
	//    9   15:ireturn         
		else
			return false;
	//   10   16:iconst_0        
	//   11   17:ireturn         
	}

	public boolean b(View view)
	{
		return a.f(view);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field SlidingPaneLayout a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #167 <Method boolean SlidingPaneLayout.f(View)>
	//    4    8:ireturn         
	}

	final SlidingPaneLayout a;
	private final Rect c = new Rect();

	SlidingPaneLayout$a(SlidingPaneLayout slidingpanelayout)
	{
		a = slidingpanelayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field SlidingPaneLayout a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void a()>
	//    5    9:aload_0         
	//    6   10:new             #19  <Class Rect>
	//    7   13:dup             
	//    8   14:invokespecial   #20  <Method void Rect()>
	//    9   17:putfield        #22  <Field Rect c>
	//   10   20:return          
	}
}
