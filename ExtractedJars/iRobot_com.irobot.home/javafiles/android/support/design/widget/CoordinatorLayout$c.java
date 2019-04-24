// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v4.view.d;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;

// Referenced classes of package android.support.design.widget:
//			CoordinatorLayout

public static class CoordinatorLayout$c extends android.view.utParams
{

	private void a(View view, CoordinatorLayout coordinatorlayout)
	{
		k = coordinatorlayout.findViewById(f);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_0         
	//    3    3:getfield        #44  <Field int f>
	//    4    6:invokevirtual   #136 <Method View CoordinatorLayout.findViewById(int)>
	//    5    9:putfield        #138 <Field View k>
		if(k == null) goto _L2; else goto _L1
	//    6   12:aload_0         
	//    7   13:getfield        #138 <Field View k>
	//    8   16:ifnull          133
_L1:
		if(k != coordinatorlayout) goto _L4; else goto _L3
	//    9   19:aload_0         
	//   10   20:getfield        #138 <Field View k>
	//   11   23:aload_2         
	//   12   24:if_acmpne       55
_L3:
		if(!coordinatorlayout.isInEditMode()) goto _L6; else goto _L5
	//   13   27:aload_2         
	//   14   28:invokevirtual   #142 <Method boolean CoordinatorLayout.isInEditMode()>
	//   15   31:ifeq            45
_L5:
		l = null;
	//   16   34:aload_0         
	//   17   35:aconst_null     
	//   18   36:putfield        #144 <Field View l>
		k = null;
	//   19   39:aload_0         
	//   20   40:aconst_null     
	//   21   41:putfield        #138 <Field View k>
		return;
	//   22   44:return          
_L6:
		throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
	//   23   45:new             #146 <Class IllegalStateException>
	//   24   48:dup             
	//   25   49:ldc1            #148 <String "View can not be anchored to the the parent CoordinatorLayout">
	//   26   51:invokespecial   #151 <Method void IllegalStateException(String)>
	//   27   54:athrow          
_L4:
		View view1 = k;
	//   28   55:aload_0         
	//   29   56:getfield        #138 <Field View k>
	//   30   59:astore          4
		for(ViewParent viewparent = k.getParent(); viewparent != coordinatorlayout && viewparent != null; viewparent = viewparent.getParent())
	//*  31   61:aload_0         
	//*  32   62:getfield        #138 <Field View k>
	//*  33   65:invokevirtual   #157 <Method ViewParent View.getParent()>
	//*  34   68:astore_3        
	//*  35   69:aload_3         
	//*  36   70:aload_2         
	//*  37   71:if_acmpeq       126
	//*  38   74:aload_3         
	//*  39   75:ifnull          126
		{
			if(viewparent == view)
	//*  40   78:aload_3         
	//*  41   79:aload_1         
	//*  42   80:if_acmpne       103
			{
				if(!coordinatorlayout.isInEditMode())
	//*  43   83:aload_2         
	//*  44   84:invokevirtual   #142 <Method boolean CoordinatorLayout.isInEditMode()>
	//*  45   87:ifeq            93
	//*  46   90:goto            34
					throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
	//   47   93:new             #146 <Class IllegalStateException>
	//   48   96:dup             
	//   49   97:ldc1            #159 <String "Anchor must not be a descendant of the anchored view">
	//   50   99:invokespecial   #151 <Method void IllegalStateException(String)>
	//   51  102:athrow          
				continue; /* Loop/switch isn't completed */
			}
			if(viewparent instanceof View)
	//*  52  103:aload_3         
	//*  53  104:instanceof      #153 <Class View>
	//*  54  107:ifeq            116
				view1 = (View)viewparent;
	//   55  110:aload_3         
	//   56  111:checkcast       #153 <Class View>
	//   57  114:astore          4
		}

	//   58  116:aload_3         
	//   59  117:invokeinterface #162 <Method ViewParent ViewParent.getParent()>
	//   60  122:astore_3        
	//*  61  123:goto            69
		l = view1;
	//   62  126:aload_0         
	//   63  127:aload           4
	//   64  129:putfield        #144 <Field View l>
		return;
	//   65  132:return          
_L2:
		if(!coordinatorlayout.isInEditMode())
	//*  66  133:aload_2         
	//*  67  134:invokevirtual   #142 <Method boolean CoordinatorLayout.isInEditMode()>
	//*  68  137:ifeq            143
	//*  69  140:goto            34
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   70  143:new             #164 <Class StringBuilder>
	//   71  146:dup             
	//   72  147:invokespecial   #165 <Method void StringBuilder()>
	//   73  150:astore_3        
			stringbuilder.append("Could not find CoordinatorLayout descendant view with id ");
	//   74  151:aload_3         
	//   75  152:ldc1            #167 <String "Could not find CoordinatorLayout descendant view with id ">
	//   76  154:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//   77  157:pop             
			stringbuilder.append(coordinatorlayout.getResources().getResourceName(f));
	//   78  158:aload_3         
	//   79  159:aload_2         
	//   80  160:invokevirtual   #175 <Method Resources CoordinatorLayout.getResources()>
	//   81  163:aload_0         
	//   82  164:getfield        #44  <Field int f>
	//   83  167:invokevirtual   #180 <Method String Resources.getResourceName(int)>
	//   84  170:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//   85  173:pop             
			stringbuilder.append(" to anchor view ");
	//   86  174:aload_3         
	//   87  175:ldc1            #182 <String " to anchor view ">
	//   88  177:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//   89  180:pop             
			stringbuilder.append(((Object) (view)));
	//   90  181:aload_3         
	//   91  182:aload_1         
	//   92  183:invokevirtual   #185 <Method StringBuilder StringBuilder.append(Object)>
	//   93  186:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   94  187:new             #146 <Class IllegalStateException>
	//   95  190:dup             
	//   96  191:aload_3         
	//   97  192:invokevirtual   #189 <Method String StringBuilder.toString()>
	//   98  195:invokespecial   #151 <Method void IllegalStateException(String)>
	//   99  198:athrow          
		}
		if(true) goto _L5; else goto _L7
_L7:
	}

	private boolean a(View view, int i1)
	{
		int j1 = android.support.v4.view.d.a(((CoordinatorLayout$c)view.getLayoutParams()).g, i1);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #194 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #2   <Class CoordinatorLayout$c>
	//    3    7:getfield        #46  <Field int g>
	//    4   10:iload_2         
	//    5   11:invokestatic    #198 <Method int d.a(int, int)>
	//    6   14:istore_3        
		return j1 != 0 && (android.support.v4.view.d.a(h, i1) & j1) == j1;
	//    7   15:iload_3         
	//    8   16:ifeq            35
	//    9   19:aload_0         
	//   10   20:getfield        #48  <Field int h>
	//   11   23:iload_2         
	//   12   24:invokestatic    #198 <Method int d.a(int, int)>
	//   13   27:iload_3         
	//   14   28:iand            
	//   15   29:iload_3         
	//   16   30:icmpne          35
	//   17   33:iconst_1        
	//   18   34:ireturn         
	//   19   35:iconst_0        
	//   20   36:ireturn         
	}

	private boolean b(View view, CoordinatorLayout coordinatorlayout)
	{
		if(k.getId() != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #138 <Field View k>
	//*   2    4:invokevirtual   #203 <Method int View.getId()>
	//*   3    7:aload_0         
	//*   4    8:getfield        #44  <Field int f>
	//*   5   11:icmpeq          16
			return false;
	//    6   14:iconst_0        
	//    7   15:ireturn         
		View view1 = k;
	//    8   16:aload_0         
	//    9   17:getfield        #138 <Field View k>
	//   10   20:astore          4
		for(ViewParent viewparent = k.getParent(); viewparent != coordinatorlayout;)
	//*  11   22:aload_0         
	//*  12   23:getfield        #138 <Field View k>
	//*  13   26:invokevirtual   #157 <Method ViewParent View.getParent()>
	//*  14   29:astore_3        
	//*  15   30:aload_3         
	//*  16   31:aload_2         
	//*  17   32:if_acmpeq       82
			if(viewparent != null && viewparent != view)
	//*  18   35:aload_3         
	//*  19   36:ifnull          70
	//*  20   39:aload_3         
	//*  21   40:aload_1         
	//*  22   41:if_acmpne       47
	//*  23   44:goto            70
			{
				if(viewparent instanceof View)
	//*  24   47:aload_3         
	//*  25   48:instanceof      #153 <Class View>
	//*  26   51:ifeq            60
					view1 = (View)viewparent;
	//   27   54:aload_3         
	//   28   55:checkcast       #153 <Class View>
	//   29   58:astore          4
				viewparent = viewparent.getParent();
	//   30   60:aload_3         
	//   31   61:invokeinterface #162 <Method ViewParent ViewParent.getParent()>
	//   32   66:astore_3        
			} else
	//*  33   67:goto            30
			{
				l = null;
	//   34   70:aload_0         
	//   35   71:aconst_null     
	//   36   72:putfield        #144 <Field View l>
				k = null;
	//   37   75:aload_0         
	//   38   76:aconst_null     
	//   39   77:putfield        #138 <Field View k>
				return false;
	//   40   80:iconst_0        
	//   41   81:ireturn         
			}

		l = view1;
	//   42   82:aload_0         
	//   43   83:aload           4
	//   44   85:putfield        #144 <Field View l>
		return true;
	//   45   88:iconst_1        
	//   46   89:ireturn         
	}

	public int a()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int f>
	//    2    4:ireturn         
	}

	public void a(int i1)
	{
		i();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #206 <Method void i()>
		f = i1;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #44  <Field int f>
	//    5    9:return          
	}

	void a(int i1, boolean flag)
	{
		switch(i1)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 1: default 24
	//	               0 31
	//	               1 25
		default:
			return;
	//    2   24:return          

		case 1: // '\001'
			q = flag;
	//    3   25:aload_0         
	//    4   26:iload_2         
	//    5   27:putfield        #209 <Field boolean q>
			return;
	//    6   30:return          

		case 0: // '\0'
			p = flag;
	//    7   31:aload_0         
	//    8   32:iload_2         
	//    9   33:putfield        #211 <Field boolean p>
			return;
	//   10   36:return          
		}
	}

	void a(Rect rect)
	{
		m.set(rect);
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Rect m>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #215 <Method void Rect.set(Rect)>
	//    4    8:return          
	}

	public void a(havior havior)
	{
		if(a != havior)
	//*   0    0:aload_0         
	//*   1    1:getfield        #117 <Field CoordinatorLayout$Behavior a>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       46
		{
			if(a != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #117 <Field CoordinatorLayout$Behavior a>
	//*   6   12:ifnull          22
				a.c();
	//    7   15:aload_0         
	//    8   16:getfield        #117 <Field CoordinatorLayout$Behavior a>
	//    9   19:invokevirtual   #218 <Method void CoordinatorLayout$Behavior.c()>
			a = havior;
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:putfield        #117 <Field CoordinatorLayout$Behavior a>
			n = null;
	//   13   27:aload_0         
	//   14   28:aconst_null     
	//   15   29:putfield        #220 <Field Object n>
			b = true;
	//   16   32:aload_0         
	//   17   33:iconst_1        
	//   18   34:putfield        #36  <Field boolean b>
			if(havior != null)
	//*  19   37:aload_1         
	//*  20   38:ifnull          46
				havior.a(this);
	//   21   41:aload_1         
	//   22   42:aload_0         
	//   23   43:invokevirtual   #125 <Method void CoordinatorLayout$Behavior.a(CoordinatorLayout$c)>
		}
	//   24   46:return          
	}

	void a(boolean flag)
	{
		r = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #223 <Field boolean r>
	//    3    5:return          
	}

	boolean a(CoordinatorLayout coordinatorlayout, View view)
	{
		if(o)
	//*   0    0:aload_0         
	//*   1    1:getfield        #226 <Field boolean o>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		boolean flag1 = o;
	//    5    9:aload_0         
	//    6   10:getfield        #226 <Field boolean o>
	//    7   13:istore          4
		boolean flag;
		if(a != null)
	//*   8   15:aload_0         
	//*   9   16:getfield        #117 <Field CoordinatorLayout$Behavior a>
	//*  10   19:ifnull          35
			flag = a.e(coordinatorlayout, view);
	//   11   22:aload_0         
	//   12   23:getfield        #117 <Field CoordinatorLayout$Behavior a>
	//   13   26:aload_1         
	//   14   27:aload_2         
	//   15   28:invokevirtual   #228 <Method boolean CoordinatorLayout$Behavior.e(CoordinatorLayout, View)>
	//   16   31:istore_3        
		else
	//*  17   32:goto            37
			flag = false;
	//   18   35:iconst_0        
	//   19   36:istore_3        
		flag |= flag1;
	//   20   37:iload_3         
	//   21   38:iload           4
	//   22   40:ior             
	//   23   41:istore_3        
		o = flag;
	//   24   42:aload_0         
	//   25   43:iload_3         
	//   26   44:putfield        #226 <Field boolean o>
		return flag;
	//   27   47:iload_3         
	//   28   48:ireturn         
	}

	boolean a(CoordinatorLayout coordinatorlayout, View view, View view1)
	{
		return view1 == l || a(view1, s.e(((View) (coordinatorlayout)))) || a != null && a.a(coordinatorlayout, view, view1);
	//    0    0:aload_3         
	//    1    1:aload_0         
	//    2    2:getfield        #144 <Field View l>
	//    3    5:if_acmpeq       45
	//    4    8:aload_0         
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:invokestatic    #234 <Method int s.e(View)>
	//    8   14:invokespecial   #236 <Method boolean a(View, int)>
	//    9   17:ifne            45
	//   10   20:aload_0         
	//   11   21:getfield        #117 <Field CoordinatorLayout$Behavior a>
	//   12   24:ifnull          43
	//   13   27:aload_0         
	//   14   28:getfield        #117 <Field CoordinatorLayout$Behavior a>
	//   15   31:aload_1         
	//   16   32:aload_2         
	//   17   33:aload_3         
	//   18   34:invokevirtual   #238 <Method boolean CoordinatorLayout$Behavior.a(CoordinatorLayout, View, View)>
	//   19   37:ifeq            43
	//   20   40:goto            45
	//   21   43:iconst_0        
	//   22   44:ireturn         
	//   23   45:iconst_1        
	//   24   46:ireturn         
	}

	public havior b()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field CoordinatorLayout$Behavior a>
	//    2    4:areturn         
	}

	View b(CoordinatorLayout coordinatorlayout, View view)
	{
		if(f == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field int f>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          20
		{
			l = null;
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:putfield        #144 <Field View l>
			k = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #138 <Field View k>
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
		}
		if(k == null || !b(view, coordinatorlayout))
	//*  12   20:aload_0         
	//*  13   21:getfield        #138 <Field View k>
	//*  14   24:ifnull          36
	//*  15   27:aload_0         
	//*  16   28:aload_2         
	//*  17   29:aload_1         
	//*  18   30:invokespecial   #242 <Method boolean b(View, CoordinatorLayout)>
	//*  19   33:ifne            42
			a(view, coordinatorlayout);
	//   20   36:aload_0         
	//   21   37:aload_2         
	//   22   38:aload_1         
	//   23   39:invokespecial   #244 <Method void a(View, CoordinatorLayout)>
		return k;
	//   24   42:aload_0         
	//   25   43:getfield        #138 <Field View k>
	//   26   46:areturn         
	}

	void b(int i1)
	{
		a(i1, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #246 <Method void a(int, boolean)>
	//    4    6:return          
	}

	Rect c()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Rect m>
	//    2    4:areturn         
	}

	boolean c(int i1)
	{
		switch(i1)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 1: default 24
	//	               0 31
	//	               1 26
		default:
			return false;
	//    2   24:iconst_0        
	//    3   25:ireturn         

		case 1: // '\001'
			return q;
	//    4   26:aload_0         
	//    5   27:getfield        #209 <Field boolean q>
	//    6   30:ireturn         

		case 0: // '\0'
			return p;
	//    7   31:aload_0         
	//    8   32:getfield        #211 <Field boolean p>
	//    9   35:ireturn         
		}
	}

	boolean d()
	{
		return k == null && f != -1;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field View k>
	//    2    4:ifnonnull       17
	//    3    7:aload_0         
	//    4    8:getfield        #44  <Field int f>
	//    5   11:iconst_m1       
	//    6   12:icmpeq          17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	boolean e()
	{
		if(a == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #117 <Field CoordinatorLayout$Behavior a>
	//*   2    4:ifnonnull       12
			o = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #226 <Field boolean o>
		return o;
	//    6   12:aload_0         
	//    7   13:getfield        #226 <Field boolean o>
	//    8   16:ireturn         
	}

	void f()
	{
		o = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #226 <Field boolean o>
	//    3    5:return          
	}

	boolean g()
	{
		return r;
	//    0    0:aload_0         
	//    1    1:getfield        #223 <Field boolean r>
	//    2    4:ireturn         
	}

	void h()
	{
		r = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #223 <Field boolean r>
	//    3    5:return          
	}

	void i()
	{
		l = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #144 <Field View l>
		k = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #138 <Field View k>
	//    6   10:return          
	}

	havior a;
	boolean b;
	public int c;
	public int d;
	public int e;
	int f;
	public int g;
	public int h;
	int i;
	int j;
	View k;
	View l;
	final Rect m;
	Object n;
	private boolean o;
	private boolean p;
	private boolean q;
	private boolean r;

	public CoordinatorLayout$c(int i1, int j1)
	{
		super(i1, j1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #34  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
		b = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #36  <Field boolean b>
		c = 0;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #38  <Field int c>
		d = 0;
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:putfield        #40  <Field int d>
		e = -1;
	//   13   21:aload_0         
	//   14   22:iconst_m1       
	//   15   23:putfield        #42  <Field int e>
		f = -1;
	//   16   26:aload_0         
	//   17   27:iconst_m1       
	//   18   28:putfield        #44  <Field int f>
		g = 0;
	//   19   31:aload_0         
	//   20   32:iconst_0        
	//   21   33:putfield        #46  <Field int g>
		h = 0;
	//   22   36:aload_0         
	//   23   37:iconst_0        
	//   24   38:putfield        #48  <Field int h>
		m = new Rect();
	//   25   41:aload_0         
	//   26   42:new             #50  <Class Rect>
	//   27   45:dup             
	//   28   46:invokespecial   #53  <Method void Rect()>
	//   29   49:putfield        #55  <Field Rect m>
	//   30   52:return          
	}

	CoordinatorLayout$c(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #59  <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
		b = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #36  <Field boolean b>
		c = 0;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #38  <Field int c>
		d = 0;
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:putfield        #40  <Field int d>
		e = -1;
	//   13   21:aload_0         
	//   14   22:iconst_m1       
	//   15   23:putfield        #42  <Field int e>
		f = -1;
	//   16   26:aload_0         
	//   17   27:iconst_m1       
	//   18   28:putfield        #44  <Field int f>
		g = 0;
	//   19   31:aload_0         
	//   20   32:iconst_0        
	//   21   33:putfield        #46  <Field int g>
		h = 0;
	//   22   36:aload_0         
	//   23   37:iconst_0        
	//   24   38:putfield        #48  <Field int h>
		m = new Rect();
	//   25   41:aload_0         
	//   26   42:new             #50  <Class Rect>
	//   27   45:dup             
	//   28   46:invokespecial   #53  <Method void Rect()>
	//   29   49:putfield        #55  <Field Rect m>
		TypedArray typedarray = context.obtainStyledAttributes(attributeset, android.support.design.a.k.CoordinatorLayout_Layout);
	//   30   52:aload_1         
	//   31   53:aload_2         
	//   32   54:getstatic       #65  <Field int[] android.support.design.a$k.CoordinatorLayout_Layout>
	//   33   57:invokevirtual   #71  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   34   60:astore_3        
		c = typedarray.getInteger(android.support.design.a.k.CoordinatorLayout_Layout_android_layout_gravity, 0);
	//   35   61:aload_0         
	//   36   62:aload_3         
	//   37   63:getstatic       #74  <Field int android.support.design.a$k.CoordinatorLayout_Layout_android_layout_gravity>
	//   38   66:iconst_0        
	//   39   67:invokevirtual   #80  <Method int TypedArray.getInteger(int, int)>
	//   40   70:putfield        #38  <Field int c>
		f = typedarray.getResourceId(android.support.design.a.k.CoordinatorLayout_Layout_layout_anchor, -1);
	//   41   73:aload_0         
	//   42   74:aload_3         
	//   43   75:getstatic       #83  <Field int android.support.design.a$k.CoordinatorLayout_Layout_layout_anchor>
	//   44   78:iconst_m1       
	//   45   79:invokevirtual   #86  <Method int TypedArray.getResourceId(int, int)>
	//   46   82:putfield        #44  <Field int f>
		d = typedarray.getInteger(android.support.design.a.k.CoordinatorLayout_Layout_layout_anchorGravity, 0);
	//   47   85:aload_0         
	//   48   86:aload_3         
	//   49   87:getstatic       #89  <Field int android.support.design.a$k.CoordinatorLayout_Layout_layout_anchorGravity>
	//   50   90:iconst_0        
	//   51   91:invokevirtual   #80  <Method int TypedArray.getInteger(int, int)>
	//   52   94:putfield        #40  <Field int d>
		e = typedarray.getInteger(android.support.design.a.k.CoordinatorLayout_Layout_layout_keyline, -1);
	//   53   97:aload_0         
	//   54   98:aload_3         
	//   55   99:getstatic       #92  <Field int android.support.design.a$k.CoordinatorLayout_Layout_layout_keyline>
	//   56  102:iconst_m1       
	//   57  103:invokevirtual   #80  <Method int TypedArray.getInteger(int, int)>
	//   58  106:putfield        #42  <Field int e>
		g = typedarray.getInt(android.support.design.a.k.CoordinatorLayout_Layout_layout_insetEdge, 0);
	//   59  109:aload_0         
	//   60  110:aload_3         
	//   61  111:getstatic       #95  <Field int android.support.design.a$k.CoordinatorLayout_Layout_layout_insetEdge>
	//   62  114:iconst_0        
	//   63  115:invokevirtual   #98  <Method int TypedArray.getInt(int, int)>
	//   64  118:putfield        #46  <Field int g>
		h = typedarray.getInt(android.support.design.a.k.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
	//   65  121:aload_0         
	//   66  122:aload_3         
	//   67  123:getstatic       #101 <Field int android.support.design.a$k.CoordinatorLayout_Layout_layout_dodgeInsetEdges>
	//   68  126:iconst_0        
	//   69  127:invokevirtual   #98  <Method int TypedArray.getInt(int, int)>
	//   70  130:putfield        #48  <Field int h>
		b = typedarray.hasValue(android.support.design.a.k.CoordinatorLayout_Layout_layout_behavior);
	//   71  133:aload_0         
	//   72  134:aload_3         
	//   73  135:getstatic       #104 <Field int android.support.design.a$k.CoordinatorLayout_Layout_layout_behavior>
	//   74  138:invokevirtual   #108 <Method boolean TypedArray.hasValue(int)>
	//   75  141:putfield        #36  <Field boolean b>
		if(b)
	//*  76  144:aload_0         
	//*  77  145:getfield        #36  <Field boolean b>
	//*  78  148:ifeq            167
			a = CoordinatorLayout.a(context, attributeset, typedarray.getString(android.support.design.a.k.CoordinatorLayout_Layout_layout_behavior));
	//   79  151:aload_0         
	//   80  152:aload_1         
	//   81  153:aload_2         
	//   82  154:aload_3         
	//   83  155:getstatic       #104 <Field int android.support.design.a$k.CoordinatorLayout_Layout_layout_behavior>
	//   84  158:invokevirtual   #112 <Method String TypedArray.getString(int)>
	//   85  161:invokestatic    #115 <Method CoordinatorLayout$Behavior CoordinatorLayout.a(Context, AttributeSet, String)>
	//   86  164:putfield        #117 <Field CoordinatorLayout$Behavior a>
		typedarray.recycle();
	//   87  167:aload_3         
	//   88  168:invokevirtual   #120 <Method void TypedArray.recycle()>
		if(a != null)
	//*  89  171:aload_0         
	//*  90  172:getfield        #117 <Field CoordinatorLayout$Behavior a>
	//*  91  175:ifnull          186
			a.a(this);
	//   92  178:aload_0         
	//   93  179:getfield        #117 <Field CoordinatorLayout$Behavior a>
	//   94  182:aload_0         
	//   95  183:invokevirtual   #125 <Method void CoordinatorLayout$Behavior.a(CoordinatorLayout$c)>
	//   96  186:return          
	}

	public CoordinatorLayout$c(CoordinatorLayout$c coordinatorlayout$c)
	{
		super(((android.view.utParams) (coordinatorlayout$c)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #128 <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
		b = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #36  <Field boolean b>
		c = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #38  <Field int c>
		d = 0;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #40  <Field int d>
		e = -1;
	//   12   20:aload_0         
	//   13   21:iconst_m1       
	//   14   22:putfield        #42  <Field int e>
		f = -1;
	//   15   25:aload_0         
	//   16   26:iconst_m1       
	//   17   27:putfield        #44  <Field int f>
		g = 0;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #46  <Field int g>
		h = 0;
	//   21   35:aload_0         
	//   22   36:iconst_0        
	//   23   37:putfield        #48  <Field int h>
		m = new Rect();
	//   24   40:aload_0         
	//   25   41:new             #50  <Class Rect>
	//   26   44:dup             
	//   27   45:invokespecial   #53  <Method void Rect()>
	//   28   48:putfield        #55  <Field Rect m>
	//   29   51:return          
	}

	public CoordinatorLayout$c(android.view.ms ms)
	{
		super(ms);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #131 <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$LayoutParams)>
		b = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #36  <Field boolean b>
		c = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #38  <Field int c>
		d = 0;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #40  <Field int d>
		e = -1;
	//   12   20:aload_0         
	//   13   21:iconst_m1       
	//   14   22:putfield        #42  <Field int e>
		f = -1;
	//   15   25:aload_0         
	//   16   26:iconst_m1       
	//   17   27:putfield        #44  <Field int f>
		g = 0;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #46  <Field int g>
		h = 0;
	//   21   35:aload_0         
	//   22   36:iconst_0        
	//   23   37:putfield        #48  <Field int h>
		m = new Rect();
	//   24   40:aload_0         
	//   25   41:new             #50  <Class Rect>
	//   26   44:dup             
	//   27   45:invokespecial   #53  <Method void Rect()>
	//   28   48:putfield        #55  <Field Rect m>
	//   29   51:return          
	}

	public CoordinatorLayout$c(android.view.utParams utparams)
	{
		super(utparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #128 <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
		b = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #36  <Field boolean b>
		c = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #38  <Field int c>
		d = 0;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #40  <Field int d>
		e = -1;
	//   12   20:aload_0         
	//   13   21:iconst_m1       
	//   14   22:putfield        #42  <Field int e>
		f = -1;
	//   15   25:aload_0         
	//   16   26:iconst_m1       
	//   17   27:putfield        #44  <Field int f>
		g = 0;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #46  <Field int g>
		h = 0;
	//   21   35:aload_0         
	//   22   36:iconst_0        
	//   23   37:putfield        #48  <Field int h>
		m = new Rect();
	//   24   40:aload_0         
	//   25   41:new             #50  <Class Rect>
	//   26   44:dup             
	//   27   45:invokespecial   #53  <Method void Rect()>
	//   28   48:putfield        #55  <Field Rect m>
	//   29   51:return          
	}
}
