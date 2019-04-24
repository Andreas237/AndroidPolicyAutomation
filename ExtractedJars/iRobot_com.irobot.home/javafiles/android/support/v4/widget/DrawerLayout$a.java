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
import java.util.List;

// Referenced classes of package android.support.v4.widget:
//			DrawerLayout

class DrawerLayout$a extends a
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
	//   63  121:return          
	}

	private void a(b b1, ViewGroup viewgroup)
	{
		int j = viewgroup.getChildCount();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #109 <Method int ViewGroup.getChildCount()>
	//    2    4:istore          4
		for(int i = 0; i < j; i++)
	//*   3    6:iconst_0        
	//*   4    7:istore_3        
	//*   5    8:iload_3         
	//*   6    9:iload           4
	//*   7   11:icmpge          42
		{
			View view = viewgroup.getChildAt(i);
	//    8   14:aload_2         
	//    9   15:iload_3         
	//   10   16:invokevirtual   #113 <Method View ViewGroup.getChildAt(int)>
	//   11   19:astore          5
			if(DrawerLayout.l(view))
	//*  12   21:aload           5
	//*  13   23:invokestatic    #116 <Method boolean DrawerLayout.l(View)>
	//*  14   26:ifeq            35
				b1.b(view);
	//   15   29:aload_1         
	//   16   30:aload           5
	//   17   32:invokevirtual   #119 <Method void b.b(View)>
		}

	//   18   35:iload_3         
	//   19   36:iconst_1        
	//   20   37:iadd            
	//   21   38:istore_3        
	//*  22   39:goto            8
	//   23   42:return          
	}

	public void a(View view, b b1)
	{
		if(android.support.v4.widget.DrawerLayout.b)
	//*   0    0:getstatic       #123 <Field boolean android.support.v4.widget.DrawerLayout.b>
	//*   1    3:ifeq            15
		{
			super.a(view, b1);
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokespecial   #125 <Method void a.a(View, b)>
		} else
	//*   6   12:goto            73
		{
			b b2 = b.a(b1);
	//    7   15:aload_2         
	//    8   16:invokestatic    #128 <Method b b.a(b)>
	//    9   19:astore_3        
			super.a(view, b2);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:aload_3         
	//   13   23:invokespecial   #125 <Method void a.a(View, b)>
			b1.a(view);
	//   14   26:aload_2         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #130 <Method void b.a(View)>
			android.view.ViewParent viewparent = s.f(view);
	//   17   31:aload_1         
	//   18   32:invokestatic    #135 <Method android.view.ViewParent s.f(View)>
	//   19   35:astore          4
			if(viewparent instanceof View)
	//*  20   37:aload           4
	//*  21   39:instanceof      #137 <Class View>
	//*  22   42:ifeq            54
				b1.c((View)viewparent);
	//   23   45:aload_2         
	//   24   46:aload           4
	//   25   48:checkcast       #137 <Class View>
	//   26   51:invokevirtual   #139 <Method void b.c(View)>
			a(b1, b2);
	//   27   54:aload_0         
	//   28   55:aload_2         
	//   29   56:aload_3         
	//   30   57:invokespecial   #141 <Method void a(b, b)>
			b2.t();
	//   31   60:aload_3         
	//   32   61:invokevirtual   #144 <Method void b.t()>
			a(b1, (ViewGroup)view);
	//   33   64:aload_0         
	//   34   65:aload_2         
	//   35   66:aload_1         
	//   36   67:checkcast       #106 <Class ViewGroup>
	//   37   70:invokespecial   #146 <Method void a(b, ViewGroup)>
		}
		b1.b(((CharSequence) (((Class) (android/support/v4/widget/DrawerLayout)).getName())));
	//   38   73:aload_2         
	//   39   74:ldc1            #6   <Class DrawerLayout>
	//   40   76:invokevirtual   #152 <Method String Class.getName()>
	//   41   79:invokevirtual   #57  <Method void b.b(CharSequence)>
		b1.c(false);
	//   42   82:aload_2         
	//   43   83:iconst_0        
	//   44   84:invokevirtual   #78  <Method void b.c(boolean)>
		b1.d(false);
	//   45   87:aload_2         
	//   46   88:iconst_0        
	//   47   89:invokevirtual   #83  <Method void b.d(boolean)>
		b1.a(android.support.v4.view.a.b.a.a);
	//   48   92:aload_2         
	//   49   93:getstatic       #157 <Field android.support.v4.view.a.b$a android.support.v4.view.a.b$a.a>
	//   50   96:invokevirtual   #160 <Method boolean b.a(android.support.v4.view.a.b$a)>
	//   51   99:pop             
		b1.a(android.support.v4.view.a.b.a.b);
	//   52  100:aload_2         
	//   53  101:getstatic       #162 <Field android.support.v4.view.a.b$a android.support.v4.view.a.b$a.b>
	//   54  104:invokevirtual   #160 <Method boolean b.a(android.support.v4.view.a.b$a)>
	//   55  107:pop             
	//   56  108:return          
	}

	public void a(View view, AccessibilityEvent accessibilityevent)
	{
		super.a(view, accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #165 <Method void a.a(View, AccessibilityEvent)>
		accessibilityevent.setClassName(((CharSequence) (((Class) (android/support/v4/widget/DrawerLayout)).getName())));
	//    4    6:aload_2         
	//    5    7:ldc1            #6   <Class DrawerLayout>
	//    6    9:invokevirtual   #152 <Method String Class.getName()>
	//    7   12:invokevirtual   #170 <Method void AccessibilityEvent.setClassName(CharSequence)>
	//    8   15:return          
	}

	public boolean a(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
	{
		if(!android.support.v4.widget.DrawerLayout.b && !DrawerLayout.l(view))
	//*   0    0:getstatic       #123 <Field boolean android.support.v4.widget.DrawerLayout.b>
	//*   1    3:ifne            18
	//*   2    6:aload_2         
	//*   3    7:invokestatic    #116 <Method boolean DrawerLayout.l(View)>
	//*   4   10:ifeq            16
	//*   5   13:goto            18
			return false;
	//    6   16:iconst_0        
	//    7   17:ireturn         
		else
			return super.a(viewgroup, view, accessibilityevent);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:invokespecial   #173 <Method boolean a.a(ViewGroup, View, AccessibilityEvent)>
	//   13   25:ireturn         
	}

	public boolean d(View view, AccessibilityEvent accessibilityevent)
	{
		if(accessibilityevent.getEventType() == 32)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #177 <Method int AccessibilityEvent.getEventType()>
	//*   2    4:bipush          32
	//*   3    6:icmpne          58
		{
			view = ((View) (accessibilityevent.getText()));
	//    4    9:aload_2         
	//    5   10:invokevirtual   #181 <Method List AccessibilityEvent.getText()>
	//    6   13:astore_1        
			accessibilityevent = ((AccessibilityEvent) (a.c()));
	//    7   14:aload_0         
	//    8   15:getfield        #14  <Field DrawerLayout a>
	//    9   18:invokevirtual   #184 <Method View DrawerLayout.c()>
	//   10   21:astore_2        
			if(accessibilityevent != null)
	//*  11   22:aload_2         
	//*  12   23:ifnull          56
			{
				int i = a.e(((View) (accessibilityevent)));
	//   13   26:aload_0         
	//   14   27:getfield        #14  <Field DrawerLayout a>
	//   15   30:aload_2         
	//   16   31:invokevirtual   #187 <Method int DrawerLayout.e(View)>
	//   17   34:istore_3        
				accessibilityevent = ((AccessibilityEvent) (a.b(i)));
	//   18   35:aload_0         
	//   19   36:getfield        #14  <Field DrawerLayout a>
	//   20   39:iload_3         
	//   21   40:invokevirtual   #190 <Method CharSequence android.support.v4.widget.DrawerLayout.b(int)>
	//   22   43:astore_2        
				if(accessibilityevent != null)
	//*  23   44:aload_2         
	//*  24   45:ifnull          56
					((List) (view)).add(((Object) (accessibilityevent)));
	//   25   48:aload_1         
	//   26   49:aload_2         
	//   27   50:invokeinterface #196 <Method boolean List.add(Object)>
	//   28   55:pop             
			}
			return true;
	//   29   56:iconst_1        
	//   30   57:ireturn         
		} else
		{
			return super.d(view, accessibilityevent);
	//   31   58:aload_0         
	//   32   59:aload_1         
	//   33   60:aload_2         
	//   34   61:invokespecial   #198 <Method boolean a.d(View, AccessibilityEvent)>
	//   35   64:ireturn         
		}
	}

	final DrawerLayout a;
	private final Rect c = new Rect();

	DrawerLayout$a(DrawerLayout drawerlayout)
	{
		a = drawerlayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field DrawerLayout a>
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
