// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.c.a;
import android.support.v4.view.*;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//			ViewOffsetBehavior, CoordinatorLayout

abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior
{

	public HeaderScrollingViewBehavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void ViewOffsetBehavior()>
		a = new Rect();
	//    2    4:aload_0         
	//    3    5:new             #17  <Class Rect>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void Rect()>
	//    6   12:putfield        #20  <Field Rect a>
		b = new Rect();
	//    7   15:aload_0         
	//    8   16:new             #17  <Class Rect>
	//    9   19:dup             
	//   10   20:invokespecial   #18  <Method void Rect()>
	//   11   23:putfield        #22  <Field Rect b>
		c = 0;
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:putfield        #24  <Field int c>
	//   15   31:return          
	}

	public HeaderScrollingViewBehavior(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #28  <Method void ViewOffsetBehavior(Context, AttributeSet)>
		a = new Rect();
	//    4    6:aload_0         
	//    5    7:new             #17  <Class Rect>
	//    6   10:dup             
	//    7   11:invokespecial   #18  <Method void Rect()>
	//    8   14:putfield        #20  <Field Rect a>
		b = new Rect();
	//    9   17:aload_0         
	//   10   18:new             #17  <Class Rect>
	//   11   21:dup             
	//   12   22:invokespecial   #18  <Method void Rect()>
	//   13   25:putfield        #22  <Field Rect b>
		c = 0;
	//   14   28:aload_0         
	//   15   29:iconst_0        
	//   16   30:putfield        #24  <Field int c>
	//   17   33:return          
	}

	private static int c(int i)
	{
		int j = i;
	//    0    0:iload_0         
	//    1    1:istore_1        
		if(i == 0)
	//*   2    2:iload_0         
	//*   3    3:ifne            9
			j = 0x800033;
	//    4    6:ldc1            #30  <Int 0x800033>
	//    5    8:istore_1        
		return j;
	//    6    9:iload_1         
	//    7   10:ireturn         
	}

	float a(View view)
	{
		return 1.0F;
	//    0    0:fconst_1        
	//    1    1:freturn         
	}

	final int a()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int c>
	//    2    4:ireturn         
	}

	public boolean a(CoordinatorLayout coordinatorlayout, View view, int i, int j, int k, int l)
	{
		int j1 = view.getLayoutParams().height;
	//    0    0:aload_2         
	//    1    1:invokevirtual   #39  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:getfield        #44  <Field int android.view.ViewGroup$LayoutParams.height>
	//    3    7:istore          8
		if(j1 == -1 || j1 == -2)
	//*   4    9:iload           8
	//*   5   11:iconst_m1       
	//*   6   12:icmpeq          22
	//*   7   15:iload           8
	//*   8   17:bipush          -2
	//*   9   19:icmpne          156
		{
			View view2 = b(coordinatorlayout.c(view));
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:invokevirtual   #49  <Method List CoordinatorLayout.c(View)>
	//   14   28:invokevirtual   #52  <Method View b(List)>
	//   15   31:astore          12
			if(view2 != null)
	//*  16   33:aload           12
	//*  17   35:ifnull          156
			{
				if(s.q(view2) && !s.q(view))
	//*  18   38:aload           12
	//*  19   40:invokestatic    #58  <Method boolean s.q(View)>
	//*  20   43:ifeq            77
	//*  21   46:aload_2         
	//*  22   47:invokestatic    #58  <Method boolean s.q(View)>
	//*  23   50:ifne            77
				{
					View view1 = view;
	//   24   53:aload_2         
	//   25   54:astore          11
					s.b(view1, true);
	//   26   56:aload           11
	//   27   58:iconst_1        
	//   28   59:invokestatic    #61  <Method void s.b(View, boolean)>
					if(s.q(view1))
	//*  29   62:aload           11
	//*  30   64:invokestatic    #58  <Method boolean s.q(View)>
	//*  31   67:ifeq            77
					{
						view1.requestLayout();
	//   32   70:aload           11
	//   33   72:invokevirtual   #64  <Method void View.requestLayout()>
						return true;
	//   34   75:iconst_1        
	//   35   76:ireturn         
					}
				}
				int i1 = android.view.View.MeasureSpec.getSize(k);
	//   36   77:iload           5
	//   37   79:invokestatic    #69  <Method int android.view.View$MeasureSpec.getSize(int)>
	//   38   82:istore          7
				k = i1;
	//   39   84:iload           7
	//   40   86:istore          5
				if(i1 == 0)
	//*  41   88:iload           7
	//*  42   90:ifne            99
					k = coordinatorlayout.getHeight();
	//   43   93:aload_1         
	//   44   94:invokevirtual   #72  <Method int CoordinatorLayout.getHeight()>
	//   45   97:istore          5
				int k1 = view2.getMeasuredHeight();
	//   46   99:aload           12
	//   47  101:invokevirtual   #75  <Method int View.getMeasuredHeight()>
	//   48  104:istore          9
				int l1 = b(view2);
	//   49  106:aload_0         
	//   50  107:aload           12
	//   51  109:invokevirtual   #78  <Method int b(View)>
	//   52  112:istore          10
				if(j1 == -1)
	//*  53  114:iload           8
	//*  54  116:iconst_m1       
	//*  55  117:icmpne          127
					i1 = 0x40000000;
	//   56  120:ldc1            #79  <Int 0x40000000>
	//   57  122:istore          7
				else
	//*  58  124:goto            131
					i1 = 0x80000000;
	//   59  127:ldc1            #80  <Int 0x80000000>
	//   60  129:istore          7
				coordinatorlayout.a(view, i, j, android.view.View.MeasureSpec.makeMeasureSpec((k - k1) + l1, i1), l);
	//   61  131:aload_1         
	//   62  132:aload_2         
	//   63  133:iload_3         
	//   64  134:iload           4
	//   65  136:iload           5
	//   66  138:iload           9
	//   67  140:isub            
	//   68  141:iload           10
	//   69  143:iadd            
	//   70  144:iload           7
	//   71  146:invokestatic    #84  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   72  149:iload           6
	//   73  151:invokevirtual   #87  <Method void android.support.design.widget.CoordinatorLayout.a(View, int, int, int, int)>
				return true;
	//   74  154:iconst_1        
	//   75  155:ireturn         
			}
		}
		return false;
	//   76  156:iconst_0        
	//   77  157:ireturn         
	}

	int b(View view)
	{
		return view.getMeasuredHeight();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #75  <Method int View.getMeasuredHeight()>
	//    2    4:ireturn         
	}

	abstract View b(List list);

	public final void b(int i)
	{
		d = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #90  <Field int d>
	//    3    5:return          
	}

	protected void b(CoordinatorLayout coordinatorlayout, View view, int i)
	{
		View view1 = b(coordinatorlayout.c(view));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #49  <Method List CoordinatorLayout.c(View)>
	//    4    6:invokevirtual   #52  <Method View b(List)>
	//    5    9:astore          4
		if(view1 != null)
	//*   6   11:aload           4
	//*   7   13:ifnull          223
		{
			CoordinatorLayout.c c1 = (CoordinatorLayout.c)view.getLayoutParams();
	//    8   16:aload_2         
	//    9   17:invokevirtual   #39  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   10   20:checkcast       #93  <Class CoordinatorLayout$c>
	//   11   23:astore          5
			Rect rect = a;
	//   12   25:aload_0         
	//   13   26:getfield        #20  <Field Rect a>
	//   14   29:astore          6
			rect.set(coordinatorlayout.getPaddingLeft() + c1.leftMargin, view1.getBottom() + c1.topMargin, coordinatorlayout.getWidth() - coordinatorlayout.getPaddingRight() - c1.rightMargin, (coordinatorlayout.getHeight() + view1.getBottom()) - coordinatorlayout.getPaddingBottom() - c1.bottomMargin);
	//   15   31:aload           6
	//   16   33:aload_1         
	//   17   34:invokevirtual   #96  <Method int CoordinatorLayout.getPaddingLeft()>
	//   18   37:aload           5
	//   19   39:getfield        #99  <Field int CoordinatorLayout$c.leftMargin>
	//   20   42:iadd            
	//   21   43:aload           4
	//   22   45:invokevirtual   #102 <Method int View.getBottom()>
	//   23   48:aload           5
	//   24   50:getfield        #105 <Field int CoordinatorLayout$c.topMargin>
	//   25   53:iadd            
	//   26   54:aload_1         
	//   27   55:invokevirtual   #108 <Method int CoordinatorLayout.getWidth()>
	//   28   58:aload_1         
	//   29   59:invokevirtual   #111 <Method int CoordinatorLayout.getPaddingRight()>
	//   30   62:isub            
	//   31   63:aload           5
	//   32   65:getfield        #114 <Field int CoordinatorLayout$c.rightMargin>
	//   33   68:isub            
	//   34   69:aload_1         
	//   35   70:invokevirtual   #72  <Method int CoordinatorLayout.getHeight()>
	//   36   73:aload           4
	//   37   75:invokevirtual   #102 <Method int View.getBottom()>
	//   38   78:iadd            
	//   39   79:aload_1         
	//   40   80:invokevirtual   #117 <Method int CoordinatorLayout.getPaddingBottom()>
	//   41   83:isub            
	//   42   84:aload           5
	//   43   86:getfield        #120 <Field int CoordinatorLayout$c.bottomMargin>
	//   44   89:isub            
	//   45   90:invokevirtual   #124 <Method void Rect.set(int, int, int, int)>
			aa aa1 = coordinatorlayout.getLastWindowInsets();
	//   46   93:aload_1         
	//   47   94:invokevirtual   #128 <Method aa CoordinatorLayout.getLastWindowInsets()>
	//   48   97:astore          7
			if(aa1 != null && s.q(((View) (coordinatorlayout))) && !s.q(view))
	//*  49   99:aload           7
	//*  50  101:ifnull          150
	//*  51  104:aload_1         
	//*  52  105:invokestatic    #58  <Method boolean s.q(View)>
	//*  53  108:ifeq            150
	//*  54  111:aload_2         
	//*  55  112:invokestatic    #58  <Method boolean s.q(View)>
	//*  56  115:ifne            150
			{
				rect.left = rect.left + aa1.a();
	//   57  118:aload           6
	//   58  120:aload           6
	//   59  122:getfield        #131 <Field int Rect.left>
	//   60  125:aload           7
	//   61  127:invokevirtual   #135 <Method int aa.a()>
	//   62  130:iadd            
	//   63  131:putfield        #131 <Field int Rect.left>
				rect.right = rect.right - aa1.c();
	//   64  134:aload           6
	//   65  136:aload           6
	//   66  138:getfield        #138 <Field int Rect.right>
	//   67  141:aload           7
	//   68  143:invokevirtual   #140 <Method int aa.c()>
	//   69  146:isub            
	//   70  147:putfield        #138 <Field int Rect.right>
			}
			coordinatorlayout = ((CoordinatorLayout) (b));
	//   71  150:aload_0         
	//   72  151:getfield        #22  <Field Rect b>
	//   73  154:astore_1        
			android.support.v4.view.d.a(c(c1.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, ((Rect) (coordinatorlayout)), i);
	//   74  155:aload           5
	//   75  157:getfield        #141 <Field int CoordinatorLayout$c.c>
	//   76  160:invokestatic    #143 <Method int c(int)>
	//   77  163:aload_2         
	//   78  164:invokevirtual   #146 <Method int View.getMeasuredWidth()>
	//   79  167:aload_2         
	//   80  168:invokevirtual   #75  <Method int View.getMeasuredHeight()>
	//   81  171:aload           6
	//   82  173:aload_1         
	//   83  174:iload_3         
	//   84  175:invokestatic    #151 <Method void d.a(int, int, int, Rect, Rect, int)>
			i = c(view1);
	//   85  178:aload_0         
	//   86  179:aload           4
	//   87  181:invokevirtual   #153 <Method int c(View)>
	//   88  184:istore_3        
			view.layout(((Rect) (coordinatorlayout)).left, ((Rect) (coordinatorlayout)).top - i, ((Rect) (coordinatorlayout)).right, ((Rect) (coordinatorlayout)).bottom - i);
	//   89  185:aload_2         
	//   90  186:aload_1         
	//   91  187:getfield        #131 <Field int Rect.left>
	//   92  190:aload_1         
	//   93  191:getfield        #156 <Field int Rect.top>
	//   94  194:iload_3         
	//   95  195:isub            
	//   96  196:aload_1         
	//   97  197:getfield        #138 <Field int Rect.right>
	//   98  200:aload_1         
	//   99  201:getfield        #159 <Field int Rect.bottom>
	//  100  204:iload_3         
	//  101  205:isub            
	//  102  206:invokevirtual   #162 <Method void View.layout(int, int, int, int)>
			i = ((Rect) (coordinatorlayout)).top - view1.getBottom();
	//  103  209:aload_1         
	//  104  210:getfield        #156 <Field int Rect.top>
	//  105  213:aload           4
	//  106  215:invokevirtual   #102 <Method int View.getBottom()>
	//  107  218:isub            
	//  108  219:istore_3        
		} else
	//* 109  220:goto            232
		{
			super.b(coordinatorlayout, view, i);
	//  110  223:aload_0         
	//  111  224:aload_1         
	//  112  225:aload_2         
	//  113  226:iload_3         
	//  114  227:invokespecial   #164 <Method void ViewOffsetBehavior.b(CoordinatorLayout, View, int)>
			i = 0;
	//  115  230:iconst_0        
	//  116  231:istore_3        
		}
		c = i;
	//  117  232:aload_0         
	//  118  233:iload_3         
	//  119  234:putfield        #24  <Field int c>
	//  120  237:return          
	}

	final int c(View view)
	{
		if(d == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #90  <Field int d>
	//*   2    4:ifne            9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return android.support.v4.c.a.a((int)(a(view) * (float)d), 0, d);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #166 <Method float a(View)>
	//    8   14:aload_0         
	//    9   15:getfield        #90  <Field int d>
	//   10   18:i2f             
	//   11   19:fmul            
	//   12   20:f2i             
	//   13   21:iconst_0        
	//   14   22:aload_0         
	//   15   23:getfield        #90  <Field int d>
	//   16   26:invokestatic    #171 <Method int a.a(int, int, int)>
	//   17   29:ireturn         
	}

	public final int d()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field int d>
	//    2    4:ireturn         
	}

	final Rect a;
	final Rect b;
	private int c;
	private int d;
}
