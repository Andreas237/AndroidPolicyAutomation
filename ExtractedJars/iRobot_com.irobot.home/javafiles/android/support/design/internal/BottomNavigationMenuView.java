// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.support.transition.*;
import android.support.v4.view.b.b;
import android.support.v4.view.s;
import android.support.v7.view.menu.*;
import android.util.AttributeSet;
import android.view.*;

// Referenced classes of package android.support.design.internal:
//			e, BottomNavigationItemView, BottomNavigationPresenter

public class BottomNavigationMenuView extends ViewGroup
	implements p
{

	public BottomNavigationMenuView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #41  <Method void BottomNavigationMenuView(Context, AttributeSet)>
	//    4    6:return          
	}

	public BottomNavigationMenuView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #43  <Method void ViewGroup(Context, AttributeSet)>
		g = ((android.support.v4.f.k.a) (new android.support.v4.f.k.c(5)));
	//    4    6:aload_0         
	//    5    7:new             #45  <Class android.support.v4.f.k$c>
	//    6   10:dup             
	//    7   11:iconst_5        
	//    8   12:invokespecial   #48  <Method void android.support.v4.f.k$c(int)>
	//    9   15:putfield        #50  <Field android.support.v4.f.k$a g>
		h = true;
	//   10   18:aload_0         
	//   11   19:iconst_1        
	//   12   20:putfield        #52  <Field boolean h>
		j = 0;
	//   13   23:aload_0         
	//   14   24:iconst_0        
	//   15   25:putfield        #54  <Field int j>
		k = 0;
	//   16   28:aload_0         
	//   17   29:iconst_0        
	//   18   30:putfield        #56  <Field int k>
		context = ((Context) (getResources()));
	//   19   33:aload_0         
	//   20   34:invokevirtual   #60  <Method Resources getResources()>
	//   21   37:astore_1        
		b = ((Resources) (context)).getDimensionPixelSize(android.support.design.a.d.design_bottom_navigation_item_max_width);
	//   22   38:aload_0         
	//   23   39:aload_1         
	//   24   40:getstatic       #65  <Field int android.support.design.a$d.design_bottom_navigation_item_max_width>
	//   25   43:invokevirtual   #71  <Method int Resources.getDimensionPixelSize(int)>
	//   26   46:putfield        #73  <Field int b>
		c = ((Resources) (context)).getDimensionPixelSize(android.support.design.a.d.design_bottom_navigation_item_min_width);
	//   27   49:aload_0         
	//   28   50:aload_1         
	//   29   51:getstatic       #76  <Field int android.support.design.a$d.design_bottom_navigation_item_min_width>
	//   30   54:invokevirtual   #71  <Method int Resources.getDimensionPixelSize(int)>
	//   31   57:putfield        #78  <Field int c>
		d = ((Resources) (context)).getDimensionPixelSize(android.support.design.a.d.design_bottom_navigation_active_item_max_width);
	//   32   60:aload_0         
	//   33   61:aload_1         
	//   34   62:getstatic       #81  <Field int android.support.design.a$d.design_bottom_navigation_active_item_max_width>
	//   35   65:invokevirtual   #71  <Method int Resources.getDimensionPixelSize(int)>
	//   36   68:putfield        #83  <Field int d>
		e = ((Resources) (context)).getDimensionPixelSize(android.support.design.a.d.design_bottom_navigation_height);
	//   37   71:aload_0         
	//   38   72:aload_1         
	//   39   73:getstatic       #86  <Field int android.support.design.a$d.design_bottom_navigation_height>
	//   40   76:invokevirtual   #71  <Method int Resources.getDimensionPixelSize(int)>
	//   41   79:putfield        #88  <Field int e>
		a = ((TransitionSet) (new AutoTransition()));
	//   42   82:aload_0         
	//   43   83:new             #90  <Class AutoTransition>
	//   44   86:dup             
	//   45   87:invokespecial   #93  <Method void AutoTransition()>
	//   46   90:putfield        #95  <Field TransitionSet a>
		a.a(0);
	//   47   93:aload_0         
	//   48   94:getfield        #95  <Field TransitionSet a>
	//   49   97:iconst_0        
	//   50   98:invokevirtual   #100 <Method TransitionSet TransitionSet.a(int)>
	//   51  101:pop             
		a.c(115L);
	//   52  102:aload_0         
	//   53  103:getfield        #95  <Field TransitionSet a>
	//   54  106:ldc2w           #101 <Long 115L>
	//   55  109:invokevirtual   #105 <Method TransitionSet TransitionSet.c(long)>
	//   56  112:pop             
		a.b(((android.animation.TimeInterpolator) (new b())));
	//   57  113:aload_0         
	//   58  114:getfield        #95  <Field TransitionSet a>
	//   59  117:new             #107 <Class b>
	//   60  120:dup             
	//   61  121:invokespecial   #108 <Method void b()>
	//   62  124:invokevirtual   #111 <Method TransitionSet TransitionSet.b(android.animation.TimeInterpolator)>
	//   63  127:pop             
		a.b(((android.support.transition.Transition) (new e())));
	//   64  128:aload_0         
	//   65  129:getfield        #95  <Field TransitionSet a>
	//   66  132:new             #113 <Class e>
	//   67  135:dup             
	//   68  136:invokespecial   #114 <Method void e()>
	//   69  139:invokevirtual   #117 <Method TransitionSet TransitionSet.b(android.support.transition.Transition)>
	//   70  142:pop             
		f = new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				view = ((View) (((BottomNavigationItemView)view).getItemData()));
			//    0    0:aload_1         
			//    1    1:checkcast       #24  <Class BottomNavigationItemView>
			//    2    4:invokevirtual   #28  <Method j BottomNavigationItemView.getItemData()>
			//    3    7:astore_1        
				if(!android.support.design.internal.BottomNavigationMenuView.b(a).a(((MenuItem) (view)), ((android.support.v7.view.menu.o) (BottomNavigationMenuView.a(a))), 0))
			//*   4    8:aload_0         
			//*   5    9:getfield        #16  <Field BottomNavigationMenuView a>
			//*   6   12:invokestatic    #32  <Method h android.support.design.internal.BottomNavigationMenuView.b(BottomNavigationMenuView)>
			//*   7   15:aload_1         
			//*   8   16:aload_0         
			//*   9   17:getfield        #16  <Field BottomNavigationMenuView a>
			//*  10   20:invokestatic    #35  <Method BottomNavigationPresenter BottomNavigationMenuView.a(BottomNavigationMenuView)>
			//*  11   23:iconst_0        
			//*  12   24:invokevirtual   #40  <Method boolean h.a(MenuItem, android.support.v7.view.menu.o, int)>
			//*  13   27:ifne            38
					((MenuItem) (view)).setChecked(true);
			//   14   30:aload_1         
			//   15   31:iconst_1        
			//   16   32:invokeinterface #46  <Method MenuItem MenuItem.setChecked(boolean)>
			//   17   37:pop             
			//   18   38:return          
			}

			final BottomNavigationMenuView a;

			
			{
				a = BottomNavigationMenuView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BottomNavigationMenuView a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   71  143:aload_0         
	//   72  144:new             #8   <Class BottomNavigationMenuView$1>
	//   73  147:dup             
	//   74  148:aload_0         
	//   75  149:invokespecial   #120 <Method void BottomNavigationMenuView$1(BottomNavigationMenuView)>
	//   76  152:putfield        #122 <Field android.view.View$OnClickListener f>
		o = new int[5];
	//   77  155:aload_0         
	//   78  156:iconst_5        
	//   79  157:newarray        int[]
	//   80  159:putfield        #124 <Field int[] o>
	//   81  162:return          
	}

	static BottomNavigationPresenter a(BottomNavigationMenuView bottomnavigationmenuview)
	{
		return bottomnavigationmenuview.p;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field BottomNavigationPresenter p>
	//    2    4:areturn         
	}

	static h b(BottomNavigationMenuView bottomnavigationmenuview)
	{
		return bottomnavigationmenuview.q;
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field h q>
	//    2    4:areturn         
	}

	private BottomNavigationItemView getNewItem()
	{
		BottomNavigationItemView bottomnavigationitemview1 = (BottomNavigationItemView)g.a();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field android.support.v4.f.k$a g>
	//    2    4:invokeinterface #137 <Method Object android.support.v4.f.k$a.a()>
	//    3    9:checkcast       #139 <Class BottomNavigationItemView>
	//    4   12:astore_2        
		BottomNavigationItemView bottomnavigationitemview = bottomnavigationitemview1;
	//    5   13:aload_2         
	//    6   14:astore_1        
		if(bottomnavigationitemview1 == null)
	//*   7   15:aload_2         
	//*   8   16:ifnonnull       31
			bottomnavigationitemview = new BottomNavigationItemView(getContext());
	//    9   19:new             #139 <Class BottomNavigationItemView>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokevirtual   #143 <Method Context getContext()>
	//   13   27:invokespecial   #145 <Method void BottomNavigationItemView(Context)>
	//   14   30:astore_1        
		return bottomnavigationitemview;
	//   15   31:aload_1         
	//   16   32:areturn         
	}

	public void a()
	{
		removeAllViews();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #148 <Method void removeAllViews()>
		if(i != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #150 <Field BottomNavigationItemView[] i>
	//*   4    8:ifnull          53
		{
			BottomNavigationItemView abottomnavigationitemview[] = i;
	//    5   11:aload_0         
	//    6   12:getfield        #150 <Field BottomNavigationItemView[] i>
	//    7   15:astore          4
			int k1 = abottomnavigationitemview.length;
	//    8   17:aload           4
	//    9   19:arraylength     
	//   10   20:istore_2        
			for(int i1 = 0; i1 < k1; i1++)
	//*  11   21:iconst_0        
	//*  12   22:istore_1        
	//*  13   23:iload_1         
	//*  14   24:iload_2         
	//*  15   25:icmpge          53
			{
				BottomNavigationItemView bottomnavigationitemview1 = abottomnavigationitemview[i1];
	//   16   28:aload           4
	//   17   30:iload_1         
	//   18   31:aaload          
	//   19   32:astore          5
				g.a(((Object) (bottomnavigationitemview1)));
	//   20   34:aload_0         
	//   21   35:getfield        #50  <Field android.support.v4.f.k$a g>
	//   22   38:aload           5
	//   23   40:invokeinterface #153 <Method boolean android.support.v4.f.k$a.a(Object)>
	//   24   45:pop             
			}

	//   25   46:iload_1         
	//   26   47:iconst_1        
	//   27   48:iadd            
	//   28   49:istore_1        
		}
	//*  29   50:goto            23
		if(q.size() == 0)
	//*  30   53:aload_0         
	//*  31   54:getfield        #130 <Field h q>
	//*  32   57:invokevirtual   #159 <Method int h.size()>
	//*  33   60:ifne            79
		{
			j = 0;
	//   34   63:aload_0         
	//   35   64:iconst_0        
	//   36   65:putfield        #54  <Field int j>
			k = 0;
	//   37   68:aload_0         
	//   38   69:iconst_0        
	//   39   70:putfield        #56  <Field int k>
			i = null;
	//   40   73:aload_0         
	//   41   74:aconst_null     
	//   42   75:putfield        #150 <Field BottomNavigationItemView[] i>
			return;
	//   43   78:return          
		}
		i = new BottomNavigationItemView[q.size()];
	//   44   79:aload_0         
	//   45   80:aload_0         
	//   46   81:getfield        #130 <Field h q>
	//   47   84:invokevirtual   #159 <Method int h.size()>
	//   48   87:anewarray       BottomNavigationItemView[]
	//   49   90:putfield        #150 <Field BottomNavigationItemView[] i>
		boolean flag;
		if(q.size() > 3)
	//*  50   93:aload_0         
	//*  51   94:getfield        #130 <Field h q>
	//*  52   97:invokevirtual   #159 <Method int h.size()>
	//*  53  100:iconst_3        
	//*  54  101:icmple          109
			flag = true;
	//   55  104:iconst_1        
	//   56  105:istore_3        
		else
	//*  57  106:goto            111
			flag = false;
	//   58  109:iconst_0        
	//   59  110:istore_3        
		h = flag;
	//   60  111:aload_0         
	//   61  112:iload_3         
	//   62  113:putfield        #52  <Field boolean h>
		for(int j1 = 0; j1 < q.size(); j1++)
	//*  63  116:iconst_0        
	//*  64  117:istore_1        
	//*  65  118:iload_1         
	//*  66  119:aload_0         
	//*  67  120:getfield        #130 <Field h q>
	//*  68  123:invokevirtual   #159 <Method int h.size()>
	//*  69  126:icmpge          255
		{
			p.b(true);
	//   70  129:aload_0         
	//   71  130:getfield        #127 <Field BottomNavigationPresenter p>
	//   72  133:iconst_1        
	//   73  134:invokevirtual   #164 <Method void android.support.design.internal.BottomNavigationPresenter.b(boolean)>
			q.getItem(j1).setCheckable(true);
	//   74  137:aload_0         
	//   75  138:getfield        #130 <Field h q>
	//   76  141:iload_1         
	//   77  142:invokevirtual   #168 <Method MenuItem h.getItem(int)>
	//   78  145:iconst_1        
	//   79  146:invokeinterface #174 <Method MenuItem MenuItem.setCheckable(boolean)>
	//   80  151:pop             
			p.b(false);
	//   81  152:aload_0         
	//   82  153:getfield        #127 <Field BottomNavigationPresenter p>
	//   83  156:iconst_0        
	//   84  157:invokevirtual   #164 <Method void android.support.design.internal.BottomNavigationPresenter.b(boolean)>
			BottomNavigationItemView bottomnavigationitemview = getNewItem();
	//   85  160:aload_0         
	//   86  161:invokespecial   #176 <Method BottomNavigationItemView getNewItem()>
	//   87  164:astore          4
			i[j1] = bottomnavigationitemview;
	//   88  166:aload_0         
	//   89  167:getfield        #150 <Field BottomNavigationItemView[] i>
	//   90  170:iload_1         
	//   91  171:aload           4
	//   92  173:aastore         
			bottomnavigationitemview.setIconTintList(l);
	//   93  174:aload           4
	//   94  176:aload_0         
	//   95  177:getfield        #178 <Field ColorStateList l>
	//   96  180:invokevirtual   #182 <Method void BottomNavigationItemView.setIconTintList(ColorStateList)>
			bottomnavigationitemview.setTextColor(m);
	//   97  183:aload           4
	//   98  185:aload_0         
	//   99  186:getfield        #184 <Field ColorStateList m>
	//  100  189:invokevirtual   #187 <Method void BottomNavigationItemView.setTextColor(ColorStateList)>
			bottomnavigationitemview.setItemBackground(n);
	//  101  192:aload           4
	//  102  194:aload_0         
	//  103  195:getfield        #189 <Field int n>
	//  104  198:invokevirtual   #192 <Method void BottomNavigationItemView.setItemBackground(int)>
			bottomnavigationitemview.setShiftingMode(h);
	//  105  201:aload           4
	//  106  203:aload_0         
	//  107  204:getfield        #52  <Field boolean h>
	//  108  207:invokevirtual   #195 <Method void BottomNavigationItemView.setShiftingMode(boolean)>
			bottomnavigationitemview.a((j)q.getItem(j1), 0);
	//  109  210:aload           4
	//  110  212:aload_0         
	//  111  213:getfield        #130 <Field h q>
	//  112  216:iload_1         
	//  113  217:invokevirtual   #168 <Method MenuItem h.getItem(int)>
	//  114  220:checkcast       #197 <Class j>
	//  115  223:iconst_0        
	//  116  224:invokevirtual   #200 <Method void BottomNavigationItemView.a(j, int)>
			bottomnavigationitemview.setItemPosition(j1);
	//  117  227:aload           4
	//  118  229:iload_1         
	//  119  230:invokevirtual   #203 <Method void BottomNavigationItemView.setItemPosition(int)>
			bottomnavigationitemview.setOnClickListener(f);
	//  120  233:aload           4
	//  121  235:aload_0         
	//  122  236:getfield        #122 <Field android.view.View$OnClickListener f>
	//  123  239:invokevirtual   #207 <Method void BottomNavigationItemView.setOnClickListener(android.view.View$OnClickListener)>
			addView(((View) (bottomnavigationitemview)));
	//  124  242:aload_0         
	//  125  243:aload           4
	//  126  245:invokevirtual   #211 <Method void addView(View)>
		}

	//  127  248:iload_1         
	//  128  249:iconst_1        
	//  129  250:iadd            
	//  130  251:istore_1        
	//* 131  252:goto            118
		k = Math.min(q.size() - 1, k);
	//  132  255:aload_0         
	//  133  256:aload_0         
	//  134  257:getfield        #130 <Field h q>
	//  135  260:invokevirtual   #159 <Method int h.size()>
	//  136  263:iconst_1        
	//  137  264:isub            
	//  138  265:aload_0         
	//  139  266:getfield        #56  <Field int k>
	//  140  269:invokestatic    #217 <Method int Math.min(int, int)>
	//  141  272:putfield        #56  <Field int k>
		q.getItem(k).setChecked(true);
	//  142  275:aload_0         
	//  143  276:getfield        #130 <Field h q>
	//  144  279:aload_0         
	//  145  280:getfield        #56  <Field int k>
	//  146  283:invokevirtual   #168 <Method MenuItem h.getItem(int)>
	//  147  286:iconst_1        
	//  148  287:invokeinterface #220 <Method MenuItem MenuItem.setChecked(boolean)>
	//  149  292:pop             
	//  150  293:return          
	}

	void a(int i1)
	{
		int k1 = q.size();
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field h q>
	//    2    4:invokevirtual   #159 <Method int h.size()>
	//    3    7:istore_3        
		for(int j1 = 0; j1 < k1; j1++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iload_3         
	//*   8   12:icmpge          63
		{
			MenuItem menuitem = q.getItem(j1);
	//    9   15:aload_0         
	//   10   16:getfield        #130 <Field h q>
	//   11   19:iload_2         
	//   12   20:invokevirtual   #168 <Method MenuItem h.getItem(int)>
	//   13   23:astore          4
			if(i1 == menuitem.getItemId())
	//*  14   25:iload_1         
	//*  15   26:aload           4
	//*  16   28:invokeinterface #223 <Method int MenuItem.getItemId()>
	//*  17   33:icmpne          56
			{
				j = i1;
	//   18   36:aload_0         
	//   19   37:iload_1         
	//   20   38:putfield        #54  <Field int j>
				k = j1;
	//   21   41:aload_0         
	//   22   42:iload_2         
	//   23   43:putfield        #56  <Field int k>
				menuitem.setChecked(true);
	//   24   46:aload           4
	//   25   48:iconst_1        
	//   26   49:invokeinterface #220 <Method MenuItem MenuItem.setChecked(boolean)>
	//   27   54:pop             
				return;
	//   28   55:return          
			}
		}

	//   29   56:iload_2         
	//   30   57:iconst_1        
	//   31   58:iadd            
	//   32   59:istore_2        
	//*  33   60:goto            10
	//   34   63:return          
	}

	public void a(h h1)
	{
		q = h1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #130 <Field h q>
	//    3    5:return          
	}

	public void b()
	{
		int k1 = q.size();
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field h q>
	//    2    4:invokevirtual   #159 <Method int h.size()>
	//    3    7:istore_2        
		if(k1 != i.length)
	//*   4    8:iload_2         
	//*   5    9:aload_0         
	//*   6   10:getfield        #150 <Field BottomNavigationItemView[] i>
	//*   7   13:arraylength     
	//*   8   14:icmpeq          22
		{
			a();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #226 <Method void a()>
			return;
	//   11   21:return          
		}
		int l1 = j;
	//   12   22:aload_0         
	//   13   23:getfield        #54  <Field int j>
	//   14   26:istore_3        
		for(int i1 = 0; i1 < k1; i1++)
	//*  15   27:iconst_0        
	//*  16   28:istore_1        
	//*  17   29:iload_1         
	//*  18   30:iload_2         
	//*  19   31:icmpge          77
		{
			MenuItem menuitem = q.getItem(i1);
	//   20   34:aload_0         
	//   21   35:getfield        #130 <Field h q>
	//   22   38:iload_1         
	//   23   39:invokevirtual   #168 <Method MenuItem h.getItem(int)>
	//   24   42:astore          4
			if(menuitem.isChecked())
	//*  25   44:aload           4
	//*  26   46:invokeinterface #230 <Method boolean MenuItem.isChecked()>
	//*  27   51:ifeq            70
			{
				j = menuitem.getItemId();
	//   28   54:aload_0         
	//   29   55:aload           4
	//   30   57:invokeinterface #223 <Method int MenuItem.getItemId()>
	//   31   62:putfield        #54  <Field int j>
				k = i1;
	//   32   65:aload_0         
	//   33   66:iload_1         
	//   34   67:putfield        #56  <Field int k>
			}
		}

	//   35   70:iload_1         
	//   36   71:iconst_1        
	//   37   72:iadd            
	//   38   73:istore_1        
	//*  39   74:goto            29
		if(l1 != j)
	//*  40   77:iload_3         
	//*  41   78:aload_0         
	//*  42   79:getfield        #54  <Field int j>
	//*  43   82:icmpeq          93
			ae.a(((ViewGroup) (this)), ((android.support.transition.Transition) (a)));
	//   44   85:aload_0         
	//   45   86:aload_0         
	//   46   87:getfield        #95  <Field TransitionSet a>
	//   47   90:invokestatic    #235 <Method void ae.a(ViewGroup, android.support.transition.Transition)>
		for(int j1 = 0; j1 < k1; j1++)
	//*  48   93:iconst_0        
	//*  49   94:istore_1        
	//*  50   95:iload_1         
	//*  51   96:iload_2         
	//*  52   97:icmpge          144
		{
			p.b(true);
	//   53  100:aload_0         
	//   54  101:getfield        #127 <Field BottomNavigationPresenter p>
	//   55  104:iconst_1        
	//   56  105:invokevirtual   #164 <Method void android.support.design.internal.BottomNavigationPresenter.b(boolean)>
			i[j1].a((j)q.getItem(j1), 0);
	//   57  108:aload_0         
	//   58  109:getfield        #150 <Field BottomNavigationItemView[] i>
	//   59  112:iload_1         
	//   60  113:aaload          
	//   61  114:aload_0         
	//   62  115:getfield        #130 <Field h q>
	//   63  118:iload_1         
	//   64  119:invokevirtual   #168 <Method MenuItem h.getItem(int)>
	//   65  122:checkcast       #197 <Class j>
	//   66  125:iconst_0        
	//   67  126:invokevirtual   #200 <Method void BottomNavigationItemView.a(j, int)>
			p.b(false);
	//   68  129:aload_0         
	//   69  130:getfield        #127 <Field BottomNavigationPresenter p>
	//   70  133:iconst_0        
	//   71  134:invokevirtual   #164 <Method void android.support.design.internal.BottomNavigationPresenter.b(boolean)>
		}

	//   72  137:iload_1         
	//   73  138:iconst_1        
	//   74  139:iadd            
	//   75  140:istore_1        
	//*  76  141:goto            95
	//   77  144:return          
	}

	public ColorStateList getIconTintList()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #178 <Field ColorStateList l>
	//    2    4:areturn         
	}

	public int getItemBackgroundRes()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field int n>
	//    2    4:ireturn         
	}

	public ColorStateList getItemTextColor()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field ColorStateList m>
	//    2    4:areturn         
	}

	public int getSelectedItemId()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field int j>
	//    2    4:ireturn         
	}

	public int getWindowAnimations()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
	{
		int i2 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #246 <Method int getChildCount()>
	//    2    4:istore          6
		int j2 = l1 - j1;
	//    3    6:iload           5
	//    4    8:iload_3         
	//    5    9:isub            
	//    6   10:istore          7
		j1 = 0;
	//    7   12:iconst_0        
	//    8   13:istore_3        
		l1 = 0;
	//    9   14:iconst_0        
	//   10   15:istore          5
		for(; j1 < i2; j1++)
	//*  11   17:iload_3         
	//*  12   18:iload           6
	//*  13   20:icmpge          116
		{
			View view = getChildAt(j1);
	//   14   23:aload_0         
	//   15   24:iload_3         
	//   16   25:invokevirtual   #250 <Method View getChildAt(int)>
	//   17   28:astore          9
			if(view.getVisibility() == 8)
	//*  18   30:aload           9
	//*  19   32:invokevirtual   #255 <Method int View.getVisibility()>
	//*  20   35:bipush          8
	//*  21   37:icmpne          43
				continue;
	//   22   40:goto            109
			if(s.e(((View) (this))) == 1)
	//*  23   43:aload_0         
	//*  24   44:invokestatic    #260 <Method int s.e(View)>
	//*  25   47:iconst_1        
	//*  26   48:icmpne          81
			{
				int k2 = k1 - i1 - l1;
	//   27   51:iload           4
	//   28   53:iload_2         
	//   29   54:isub            
	//   30   55:iload           5
	//   31   57:isub            
	//   32   58:istore          8
				view.layout(k2 - view.getMeasuredWidth(), 0, k2, j2);
	//   33   60:aload           9
	//   34   62:iload           8
	//   35   64:aload           9
	//   36   66:invokevirtual   #263 <Method int View.getMeasuredWidth()>
	//   37   69:isub            
	//   38   70:iconst_0        
	//   39   71:iload           8
	//   40   73:iload           7
	//   41   75:invokevirtual   #267 <Method void View.layout(int, int, int, int)>
			} else
	//*  42   78:goto            99
			{
				view.layout(l1, 0, view.getMeasuredWidth() + l1, j2);
	//   43   81:aload           9
	//   44   83:iload           5
	//   45   85:iconst_0        
	//   46   86:aload           9
	//   47   88:invokevirtual   #263 <Method int View.getMeasuredWidth()>
	//   48   91:iload           5
	//   49   93:iadd            
	//   50   94:iload           7
	//   51   96:invokevirtual   #267 <Method void View.layout(int, int, int, int)>
			}
			l1 += view.getMeasuredWidth();
	//   52   99:iload           5
	//   53  101:aload           9
	//   54  103:invokevirtual   #263 <Method int View.getMeasuredWidth()>
	//   55  106:iadd            
	//   56  107:istore          5
		}

	//   57  109:iload_3         
	//   58  110:iconst_1        
	//   59  111:iadd            
	//   60  112:istore_3        
	//*  61  113:goto            17
	//   62  116:return          
	}

	protected void onMeasure(int i1, int j1)
	{
		j1 = android.view.View.MeasureSpec.getSize(i1);
	//    0    0:iload_1         
	//    1    1:invokestatic    #274 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    2    4:istore_2        
		int i2 = getChildCount();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #246 <Method int getChildCount()>
	//    5    9:istore          4
		int i3 = android.view.View.MeasureSpec.makeMeasureSpec(e, 0x40000000);
	//    6   11:aload_0         
	//    7   12:getfield        #88  <Field int e>
	//    8   15:ldc2            #275 <Int 0x40000000>
	//    9   18:invokestatic    #278 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   10   21:istore          7
		if(h)
	//*  11   23:aload_0         
	//*  12   24:getfield        #52  <Field boolean h>
	//*  13   27:ifeq            147
		{
			i1 = i2 - 1;
	//   14   30:iload           4
	//   15   32:iconst_1        
	//   16   33:isub            
	//   17   34:istore_1        
			int j2 = Math.min(j1 - c * i1, d);
	//   18   35:iload_2         
	//   19   36:aload_0         
	//   20   37:getfield        #78  <Field int c>
	//   21   40:iload_1         
	//   22   41:imul            
	//   23   42:isub            
	//   24   43:aload_0         
	//   25   44:getfield        #83  <Field int d>
	//   26   47:invokestatic    #217 <Method int Math.min(int, int)>
	//   27   50:istore          5
			j1 -= j2;
	//   28   52:iload_2         
	//   29   53:iload           5
	//   30   55:isub            
	//   31   56:istore_2        
			int l2 = Math.min(j1 / i1, b);
	//   32   57:iload_2         
	//   33   58:iload_1         
	//   34   59:idiv            
	//   35   60:aload_0         
	//   36   61:getfield        #73  <Field int b>
	//   37   64:invokestatic    #217 <Method int Math.min(int, int)>
	//   38   67:istore          6
			j1 -= i1 * l2;
	//   39   69:iload_2         
	//   40   70:iload_1         
	//   41   71:iload           6
	//   42   73:imul            
	//   43   74:isub            
	//   44   75:istore_2        
			for(i1 = 0; i1 < i2;)
	//*  45   76:iconst_0        
	//*  46   77:istore_1        
	//*  47   78:iload_1         
	//*  48   79:iload           4
	//*  49   81:icmpge          231
			{
				int ai[] = o;
	//   50   84:aload_0         
	//   51   85:getfield        #124 <Field int[] o>
	//   52   88:astore          8
				int k1;
				if(i1 == k)
	//*  53   90:iload_1         
	//*  54   91:aload_0         
	//*  55   92:getfield        #56  <Field int k>
	//*  56   95:icmpne          104
					k1 = j2;
	//   57   98:iload           5
	//   58  100:istore_3        
				else
	//*  59  101:goto            107
					k1 = l2;
	//   60  104:iload           6
	//   61  106:istore_3        
				ai[i1] = k1;
	//   62  107:aload           8
	//   63  109:iload_1         
	//   64  110:iload_3         
	//   65  111:iastore         
				k1 = j1;
	//   66  112:iload_2         
	//   67  113:istore_3        
				if(j1 > 0)
	//*  68  114:iload_2         
	//*  69  115:ifle            138
				{
					int ai1[] = o;
	//   70  118:aload_0         
	//   71  119:getfield        #124 <Field int[] o>
	//   72  122:astore          8
					ai1[i1] = ai1[i1] + 1;
	//   73  124:aload           8
	//   74  126:iload_1         
	//   75  127:aload           8
	//   76  129:iload_1         
	//   77  130:iaload          
	//   78  131:iconst_1        
	//   79  132:iadd            
	//   80  133:iastore         
					k1 = j1 - 1;
	//   81  134:iload_2         
	//   82  135:iconst_1        
	//   83  136:isub            
	//   84  137:istore_3        
				}
				i1++;
	//   85  138:iload_1         
	//   86  139:iconst_1        
	//   87  140:iadd            
	//   88  141:istore_1        
				j1 = k1;
	//   89  142:iload_3         
	//   90  143:istore_2        
			}

		} else
	//*  91  144:goto            78
		{
			if(i2 == 0)
	//*  92  147:iload           4
	//*  93  149:ifne            157
				i1 = 1;
	//   94  152:iconst_1        
	//   95  153:istore_1        
			else
	//*  96  154:goto            160
				i1 = i2;
	//   97  157:iload           4
	//   98  159:istore_1        
			int k2 = Math.min(j1 / i1, d);
	//   99  160:iload_2         
	//  100  161:iload_1         
	//  101  162:idiv            
	//  102  163:aload_0         
	//  103  164:getfield        #83  <Field int d>
	//  104  167:invokestatic    #217 <Method int Math.min(int, int)>
	//  105  170:istore          5
			j1 -= k2 * i2;
	//  106  172:iload_2         
	//  107  173:iload           5
	//  108  175:iload           4
	//  109  177:imul            
	//  110  178:isub            
	//  111  179:istore_2        
			for(i1 = 0; i1 < i2;)
	//* 112  180:iconst_0        
	//* 113  181:istore_1        
	//* 114  182:iload_1         
	//* 115  183:iload           4
	//* 116  185:icmpge          231
			{
				o[i1] = k2;
	//  117  188:aload_0         
	//  118  189:getfield        #124 <Field int[] o>
	//  119  192:iload_1         
	//  120  193:iload           5
	//  121  195:iastore         
				int l1 = j1;
	//  122  196:iload_2         
	//  123  197:istore_3        
				if(j1 > 0)
	//* 124  198:iload_2         
	//* 125  199:ifle            222
				{
					int ai2[] = o;
	//  126  202:aload_0         
	//  127  203:getfield        #124 <Field int[] o>
	//  128  206:astore          8
					ai2[i1] = ai2[i1] + 1;
	//  129  208:aload           8
	//  130  210:iload_1         
	//  131  211:aload           8
	//  132  213:iload_1         
	//  133  214:iaload          
	//  134  215:iconst_1        
	//  135  216:iadd            
	//  136  217:iastore         
					l1 = j1 - 1;
	//  137  218:iload_2         
	//  138  219:iconst_1        
	//  139  220:isub            
	//  140  221:istore_3        
				}
				i1++;
	//  141  222:iload_1         
	//  142  223:iconst_1        
	//  143  224:iadd            
	//  144  225:istore_1        
				j1 = l1;
	//  145  226:iload_3         
	//  146  227:istore_2        
			}

		}
	//* 147  228:goto            182
		i1 = 0;
	//  148  231:iconst_0        
	//  149  232:istore_1        
		j1 = 0;
	//  150  233:iconst_0        
	//  151  234:istore_2        
		for(; i1 < i2; i1++)
	//* 152  235:iload_1         
	//* 153  236:iload           4
	//* 154  238:icmpge          308
		{
			View view = getChildAt(i1);
	//  155  241:aload_0         
	//  156  242:iload_1         
	//  157  243:invokevirtual   #250 <Method View getChildAt(int)>
	//  158  246:astore          8
			if(view.getVisibility() != 8)
	//* 159  248:aload           8
	//* 160  250:invokevirtual   #255 <Method int View.getVisibility()>
	//* 161  253:bipush          8
	//* 162  255:icmpne          261
	//* 163  258:goto            301
			{
				view.measure(android.view.View.MeasureSpec.makeMeasureSpec(o[i1], 0x40000000), i3);
	//  164  261:aload           8
	//  165  263:aload_0         
	//  166  264:getfield        #124 <Field int[] o>
	//  167  267:iload_1         
	//  168  268:iaload          
	//  169  269:ldc2            #275 <Int 0x40000000>
	//  170  272:invokestatic    #278 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  171  275:iload           7
	//  172  277:invokevirtual   #281 <Method void View.measure(int, int)>
				view.getLayoutParams().width = view.getMeasuredWidth();
	//  173  280:aload           8
	//  174  282:invokevirtual   #285 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  175  285:aload           8
	//  176  287:invokevirtual   #263 <Method int View.getMeasuredWidth()>
	//  177  290:putfield        #290 <Field int android.view.ViewGroup$LayoutParams.width>
				j1 += view.getMeasuredWidth();
	//  178  293:iload_2         
	//  179  294:aload           8
	//  180  296:invokevirtual   #263 <Method int View.getMeasuredWidth()>
	//  181  299:iadd            
	//  182  300:istore_2        
			}
		}

	//  183  301:iload_1         
	//  184  302:iconst_1        
	//  185  303:iadd            
	//  186  304:istore_1        
	//* 187  305:goto            235
		setMeasuredDimension(View.resolveSizeAndState(j1, android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000), 0), View.resolveSizeAndState(e, i3, 0));
	//  188  308:aload_0         
	//  189  309:iload_2         
	//  190  310:iload_2         
	//  191  311:ldc2            #275 <Int 0x40000000>
	//  192  314:invokestatic    #278 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  193  317:iconst_0        
	//  194  318:invokestatic    #294 <Method int View.resolveSizeAndState(int, int, int)>
	//  195  321:aload_0         
	//  196  322:getfield        #88  <Field int e>
	//  197  325:iload           7
	//  198  327:iconst_0        
	//  199  328:invokestatic    #294 <Method int View.resolveSizeAndState(int, int, int)>
	//  200  331:invokevirtual   #297 <Method void setMeasuredDimension(int, int)>
	//  201  334:return          
	}

	public void setIconTintList(ColorStateList colorstatelist)
	{
		l = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #178 <Field ColorStateList l>
		if(i == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #150 <Field BottomNavigationItemView[] i>
	//*   5    9:ifnonnull       13
			return;
	//    6   12:return          
		BottomNavigationItemView abottomnavigationitemview[] = i;
	//    7   13:aload_0         
	//    8   14:getfield        #150 <Field BottomNavigationItemView[] i>
	//    9   17:astore          4
		int j1 = abottomnavigationitemview.length;
	//   10   19:aload           4
	//   11   21:arraylength     
	//   12   22:istore_3        
		for(int i1 = 0; i1 < j1; i1++)
	//*  13   23:iconst_0        
	//*  14   24:istore_2        
	//*  15   25:iload_2         
	//*  16   26:iload_3         
	//*  17   27:icmpge          45
			abottomnavigationitemview[i1].setIconTintList(colorstatelist);
	//   18   30:aload           4
	//   19   32:iload_2         
	//   20   33:aaload          
	//   21   34:aload_1         
	//   22   35:invokevirtual   #182 <Method void BottomNavigationItemView.setIconTintList(ColorStateList)>

	//   23   38:iload_2         
	//   24   39:iconst_1        
	//   25   40:iadd            
	//   26   41:istore_2        
	//*  27   42:goto            25
	//   28   45:return          
	}

	public void setItemBackgroundRes(int i1)
	{
		n = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #189 <Field int n>
		if(i == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #150 <Field BottomNavigationItemView[] i>
	//*   5    9:ifnonnull       13
			return;
	//    6   12:return          
		BottomNavigationItemView abottomnavigationitemview[] = i;
	//    7   13:aload_0         
	//    8   14:getfield        #150 <Field BottomNavigationItemView[] i>
	//    9   17:astore          4
		int k1 = abottomnavigationitemview.length;
	//   10   19:aload           4
	//   11   21:arraylength     
	//   12   22:istore_3        
		for(int j1 = 0; j1 < k1; j1++)
	//*  13   23:iconst_0        
	//*  14   24:istore_2        
	//*  15   25:iload_2         
	//*  16   26:iload_3         
	//*  17   27:icmpge          45
			abottomnavigationitemview[j1].setItemBackground(i1);
	//   18   30:aload           4
	//   19   32:iload_2         
	//   20   33:aaload          
	//   21   34:iload_1         
	//   22   35:invokevirtual   #192 <Method void BottomNavigationItemView.setItemBackground(int)>

	//   23   38:iload_2         
	//   24   39:iconst_1        
	//   25   40:iadd            
	//   26   41:istore_2        
	//*  27   42:goto            25
	//   28   45:return          
	}

	public void setItemTextColor(ColorStateList colorstatelist)
	{
		m = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #184 <Field ColorStateList m>
		if(i == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #150 <Field BottomNavigationItemView[] i>
	//*   5    9:ifnonnull       13
			return;
	//    6   12:return          
		BottomNavigationItemView abottomnavigationitemview[] = i;
	//    7   13:aload_0         
	//    8   14:getfield        #150 <Field BottomNavigationItemView[] i>
	//    9   17:astore          4
		int j1 = abottomnavigationitemview.length;
	//   10   19:aload           4
	//   11   21:arraylength     
	//   12   22:istore_3        
		for(int i1 = 0; i1 < j1; i1++)
	//*  13   23:iconst_0        
	//*  14   24:istore_2        
	//*  15   25:iload_2         
	//*  16   26:iload_3         
	//*  17   27:icmpge          45
			abottomnavigationitemview[i1].setTextColor(colorstatelist);
	//   18   30:aload           4
	//   19   32:iload_2         
	//   20   33:aaload          
	//   21   34:aload_1         
	//   22   35:invokevirtual   #187 <Method void BottomNavigationItemView.setTextColor(ColorStateList)>

	//   23   38:iload_2         
	//   24   39:iconst_1        
	//   25   40:iadd            
	//   26   41:istore_2        
	//*  27   42:goto            25
	//   28   45:return          
	}

	public void setPresenter(BottomNavigationPresenter bottomnavigationpresenter)
	{
		p = bottomnavigationpresenter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #127 <Field BottomNavigationPresenter p>
	//    3    5:return          
	}

	private final TransitionSet a;
	private final int b;
	private final int c;
	private final int d;
	private final int e;
	private final android.view.View.OnClickListener f;
	private final android.support.v4.f.k.a g;
	private boolean h;
	private BottomNavigationItemView i[];
	private int j;
	private int k;
	private ColorStateList l;
	private ColorStateList m;
	private int n;
	private int o[];
	private BottomNavigationPresenter p;
	private h q;
}
