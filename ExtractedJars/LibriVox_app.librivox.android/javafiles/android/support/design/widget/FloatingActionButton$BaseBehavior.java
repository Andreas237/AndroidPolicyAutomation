// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.design.l;
import android.support.v4.view.ac;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//			aj, FloatingActionButton, am, CoordinatorLayout, 
//			ar, AppBarLayout, BottomSheetBehavior, au

public class FloatingActionButton$BaseBehavior extends aj
{

	private void a(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton)
	{
		Rect rect = floatingactionbutton.b;
	//    0    0:aload_2         
	//    1    1:getfield        #50  <Field Rect FloatingActionButton.b>
	//    2    4:astore          7
		if(rect != null && rect.centerX() > 0 && rect.centerY() > 0)
	//*   3    6:aload           7
	//*   4    8:ifnull          166
	//*   5   11:aload           7
	//*   6   13:invokevirtual   #56  <Method int Rect.centerX()>
	//*   7   16:ifle            166
	//*   8   19:aload           7
	//*   9   21:invokevirtual   #59  <Method int Rect.centerY()>
	//*  10   24:ifle            166
		{
			am am1 = (am)floatingactionbutton.getLayoutParams();
	//   11   27:aload_2         
	//   12   28:invokevirtual   #63  <Method android.view.ViewGroup$LayoutParams FloatingActionButton.getLayoutParams()>
	//   13   31:checkcast       #65  <Class am>
	//   14   34:astore          8
			int i = floatingactionbutton.getRight();
	//   15   36:aload_2         
	//   16   37:invokevirtual   #68  <Method int FloatingActionButton.getRight()>
	//   17   40:istore_3        
			int k = coordinatorlayout.getWidth();
	//   18   41:aload_1         
	//   19   42:invokevirtual   #73  <Method int CoordinatorLayout.getWidth()>
	//   20   45:istore          5
			int i1 = am1.rightMargin;
	//   21   47:aload           8
	//   22   49:getfield        #76  <Field int am.rightMargin>
	//   23   52:istore          6
			int j = 0;
	//   24   54:iconst_0        
	//   25   55:istore          4
			if(i >= k - i1)
	//*  26   57:iload_3         
	//*  27   58:iload           5
	//*  28   60:iload           6
	//*  29   62:isub            
	//*  30   63:icmplt          75
				i = rect.right;
	//   31   66:aload           7
	//   32   68:getfield        #79  <Field int Rect.right>
	//   33   71:istore_3        
			else
	//*  34   72:goto            99
			if(floatingactionbutton.getLeft() <= am1.leftMargin)
	//*  35   75:aload_2         
	//*  36   76:invokevirtual   #82  <Method int FloatingActionButton.getLeft()>
	//*  37   79:aload           8
	//*  38   81:getfield        #85  <Field int am.leftMargin>
	//*  39   84:icmpgt          97
				i = -rect.left;
	//   40   87:aload           7
	//   41   89:getfield        #88  <Field int Rect.left>
	//   42   92:ineg            
	//   43   93:istore_3        
			else
	//*  44   94:goto            99
				i = 0;
	//   45   97:iconst_0        
	//   46   98:istore_3        
			if(floatingactionbutton.getBottom() >= coordinatorlayout.getHeight() - am1.bottomMargin)
	//*  47   99:aload_2         
	//*  48  100:invokevirtual   #91  <Method int FloatingActionButton.getBottom()>
	//*  49  103:aload_1         
	//*  50  104:invokevirtual   #94  <Method int CoordinatorLayout.getHeight()>
	//*  51  107:aload           8
	//*  52  109:getfield        #97  <Field int am.bottomMargin>
	//*  53  112:isub            
	//*  54  113:icmplt          126
				j = rect.bottom;
	//   55  116:aload           7
	//   56  118:getfield        #100 <Field int Rect.bottom>
	//   57  121:istore          4
			else
	//*  58  123:goto            146
			if(floatingactionbutton.getTop() <= am1.topMargin)
	//*  59  126:aload_2         
	//*  60  127:invokevirtual   #103 <Method int FloatingActionButton.getTop()>
	//*  61  130:aload           8
	//*  62  132:getfield        #106 <Field int am.topMargin>
	//*  63  135:icmpgt          146
				j = -rect.top;
	//   64  138:aload           7
	//   65  140:getfield        #109 <Field int Rect.top>
	//   66  143:ineg            
	//   67  144:istore          4
			if(j != 0)
	//*  68  146:iload           4
	//*  69  148:ifeq            157
				ac.e(((View) (floatingactionbutton)), j);
	//   70  151:aload_2         
	//   71  152:iload           4
	//   72  154:invokestatic    #115 <Method void ac.e(View, int)>
			if(i != 0)
	//*  73  157:iload_3         
	//*  74  158:ifeq            166
				ac.f(((View) (floatingactionbutton)), i);
	//   75  161:aload_2         
	//   76  162:iload_3         
	//   77  163:invokestatic    #118 <Method void ac.f(View, int)>
		}
	//   78  166:return          
	}

	private boolean a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, FloatingActionButton floatingactionbutton)
	{
		if(!a(((View) (appbarlayout)), floatingactionbutton))
	//*   0    0:aload_0         
	//*   1    1:aload_2         
	//*   2    2:aload_3         
	//*   3    3:invokespecial   #122 <Method boolean a(View, FloatingActionButton)>
	//*   4    6:ifne            11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		if(a == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #124 <Field Rect a>
	//*   9   15:ifnonnull       29
			a = new Rect();
	//   10   18:aload_0         
	//   11   19:new             #52  <Class Rect>
	//   12   22:dup             
	//   13   23:invokespecial   #125 <Method void Rect()>
	//   14   26:putfield        #124 <Field Rect a>
		Rect rect = a;
	//   15   29:aload_0         
	//   16   30:getfield        #124 <Field Rect a>
	//   17   33:astore          4
		ar.b(((android.view.ViewGroup) (coordinatorlayout)), ((View) (appbarlayout)), rect);
	//   18   35:aload_1         
	//   19   36:aload_2         
	//   20   37:aload           4
	//   21   39:invokestatic    #130 <Method void ar.b(android.view.ViewGroup, View, Rect)>
		if(rect.bottom <= appbarlayout.getMinimumHeightForVisibleOverlappingContent())
	//*  22   42:aload           4
	//*  23   44:getfield        #100 <Field int Rect.bottom>
	//*  24   47:aload_2         
	//*  25   48:invokevirtual   #135 <Method int AppBarLayout.getMinimumHeightForVisibleOverlappingContent()>
	//*  26   51:icmpgt          66
			floatingactionbutton.b(b, false);
	//   27   54:aload_3         
	//   28   55:aload_0         
	//   29   56:getfield        #137 <Field au b>
	//   30   59:iconst_0        
	//   31   60:invokevirtual   #140 <Method void FloatingActionButton.b(au, boolean)>
		else
	//*  32   63:goto            75
			floatingactionbutton.a(b, false);
	//   33   66:aload_3         
	//   34   67:aload_0         
	//   35   68:getfield        #137 <Field au b>
	//   36   71:iconst_0        
	//   37   72:invokevirtual   #142 <Method void FloatingActionButton.a(au, boolean)>
		return true;
	//   38   75:iconst_1        
	//   39   76:ireturn         
	}

	private static boolean a(View view)
	{
		view = ((View) (view.getLayoutParams()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #146 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:astore_0        
		if(view instanceof am)
	//*   3    5:aload_0         
	//*   4    6:instanceof      #65  <Class am>
	//*   5    9:ifeq            23
			return ((am)view).b() instanceof BottomSheetBehavior;
	//    6   12:aload_0         
	//    7   13:checkcast       #65  <Class am>
	//    8   16:invokevirtual   #149 <Method aj am.b()>
	//    9   19:instanceof      #151 <Class BottomSheetBehavior>
	//   10   22:ireturn         
		else
			return false;
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	private boolean a(View view, FloatingActionButton floatingactionbutton)
	{
		am am1 = (am)floatingactionbutton.getLayoutParams();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #63  <Method android.view.ViewGroup$LayoutParams FloatingActionButton.getLayoutParams()>
	//    2    4:checkcast       #65  <Class am>
	//    3    7:astore_3        
		if(!c)
	//*   4    8:aload_0         
	//*   5    9:getfield        #16  <Field boolean c>
	//*   6   12:ifne            17
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
		if(am1.a() != view.getId())
	//*   9   17:aload_3         
	//*  10   18:invokevirtual   #153 <Method int am.a()>
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #156 <Method int View.getId()>
	//*  13   25:icmpeq          30
			return false;
	//   14   28:iconst_0        
	//   15   29:ireturn         
		return floatingactionbutton.getUserSetVisibility() == 0;
	//   16   30:aload_2         
	//   17   31:invokevirtual   #159 <Method int FloatingActionButton.getUserSetVisibility()>
	//   18   34:ifeq            39
	//   19   37:iconst_0        
	//   20   38:ireturn         
	//   21   39:iconst_1        
	//   22   40:ireturn         
	}

	private boolean b(View view, FloatingActionButton floatingactionbutton)
	{
		if(!a(view, floatingactionbutton))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:aload_2         
	//*   3    3:invokespecial   #122 <Method boolean a(View, FloatingActionButton)>
	//*   4    6:ifne            11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		am am1 = (am)floatingactionbutton.getLayoutParams();
	//    7   11:aload_2         
	//    8   12:invokevirtual   #63  <Method android.view.ViewGroup$LayoutParams FloatingActionButton.getLayoutParams()>
	//    9   15:checkcast       #65  <Class am>
	//   10   18:astore_3        
		if(view.getTop() < floatingactionbutton.getHeight() / 2 + am1.topMargin)
	//*  11   19:aload_1         
	//*  12   20:invokevirtual   #160 <Method int View.getTop()>
	//*  13   23:aload_2         
	//*  14   24:invokevirtual   #161 <Method int FloatingActionButton.getHeight()>
	//*  15   27:iconst_2        
	//*  16   28:idiv            
	//*  17   29:aload_3         
	//*  18   30:getfield        #106 <Field int am.topMargin>
	//*  19   33:iadd            
	//*  20   34:icmpge          49
			floatingactionbutton.b(b, false);
	//   21   37:aload_2         
	//   22   38:aload_0         
	//   23   39:getfield        #137 <Field au b>
	//   24   42:iconst_0        
	//   25   43:invokevirtual   #140 <Method void FloatingActionButton.b(au, boolean)>
		else
	//*  26   46:goto            58
			floatingactionbutton.a(b, false);
	//   27   49:aload_2         
	//   28   50:aload_0         
	//   29   51:getfield        #137 <Field au b>
	//   30   54:iconst_0        
	//   31   55:invokevirtual   #142 <Method void FloatingActionButton.a(au, boolean)>
		return true;
	//   32   58:iconst_1        
	//   33   59:ireturn         
	}

	public void a(am am1)
	{
		if(am1.h == 0)
	//*   0    0:aload_1         
	//*   1    1:getfield        #165 <Field int am.h>
	//*   2    4:ifne            13
			am1.h = 80;
	//    3    7:aload_1         
	//    4    8:bipush          80
	//    5   10:putfield        #165 <Field int am.h>
	//    6   13:return          
	}

	public boolean a(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton, int i)
	{
		List list = coordinatorlayout.c(((View) (floatingactionbutton)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #169 <Method List CoordinatorLayout.c(View)>
	//    3    5:astore          6
		int k = list.size();
	//    4    7:aload           6
	//    5    9:invokeinterface #174 <Method int List.size()>
	//    6   14:istore          5
		int j = 0;
	//    7   16:iconst_0        
	//    8   17:istore          4
		do
		{
			if(j >= k)
				break;
	//    9   19:iload           4
	//   10   21:iload           5
	//   11   23:icmpge          95
			View view = (View)list.get(j);
	//   12   26:aload           6
	//   13   28:iload           4
	//   14   30:invokeinterface #178 <Method Object List.get(int)>
	//   15   35:checkcast       #145 <Class View>
	//   16   38:astore          7
			if((view instanceof AppBarLayout) ? a(coordinatorlayout, (AppBarLayout)view, floatingactionbutton) : a(view) && b(view, floatingactionbutton))
	//*  17   40:aload           7
	//*  18   42:instanceof      #132 <Class AppBarLayout>
	//*  19   45:ifeq            65
	//*  20   48:aload_0         
	//*  21   49:aload_1         
	//*  22   50:aload           7
	//*  23   52:checkcast       #132 <Class AppBarLayout>
	//*  24   55:aload_2         
	//*  25   56:invokespecial   #180 <Method boolean a(CoordinatorLayout, AppBarLayout, FloatingActionButton)>
	//*  26   59:ifeq            86
	//*  27   62:goto            95
	//*  28   65:aload           7
	//*  29   67:invokestatic    #182 <Method boolean a(View)>
	//*  30   70:ifeq            86
	//*  31   73:aload_0         
	//*  32   74:aload           7
	//*  33   76:aload_2         
	//*  34   77:invokespecial   #184 <Method boolean b(View, FloatingActionButton)>
	//*  35   80:ifeq            86
				break;
	//   36   83:goto            95
			j++;
	//   37   86:iload           4
	//   38   88:iconst_1        
	//   39   89:iadd            
	//   40   90:istore          4
		} while(true);
	//   41   92:goto            19
		coordinatorlayout.a(((View) (floatingactionbutton)), i);
	//   42   95:aload_1         
	//   43   96:aload_2         
	//   44   97:iload_3         
	//   45   98:invokevirtual   #186 <Method void CoordinatorLayout.a(View, int)>
		a(coordinatorlayout, floatingactionbutton);
	//   46  101:aload_0         
	//   47  102:aload_1         
	//   48  103:aload_2         
	//   49  104:invokespecial   #188 <Method void a(CoordinatorLayout, FloatingActionButton)>
		return true;
	//   50  107:iconst_1        
	//   51  108:ireturn         
	}

	public boolean a(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton, Rect rect)
	{
		coordinatorlayout = ((CoordinatorLayout) (floatingactionbutton.b));
	//    0    0:aload_2         
	//    1    1:getfield        #50  <Field Rect FloatingActionButton.b>
	//    2    4:astore_1        
		rect.set(floatingactionbutton.getLeft() + ((Rect) (coordinatorlayout)).left, floatingactionbutton.getTop() + ((Rect) (coordinatorlayout)).top, floatingactionbutton.getRight() - ((Rect) (coordinatorlayout)).right, floatingactionbutton.getBottom() - ((Rect) (coordinatorlayout)).bottom);
	//    3    5:aload_3         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #82  <Method int FloatingActionButton.getLeft()>
	//    6   10:aload_1         
	//    7   11:getfield        #88  <Field int Rect.left>
	//    8   14:iadd            
	//    9   15:aload_2         
	//   10   16:invokevirtual   #103 <Method int FloatingActionButton.getTop()>
	//   11   19:aload_1         
	//   12   20:getfield        #109 <Field int Rect.top>
	//   13   23:iadd            
	//   14   24:aload_2         
	//   15   25:invokevirtual   #68  <Method int FloatingActionButton.getRight()>
	//   16   28:aload_1         
	//   17   29:getfield        #79  <Field int Rect.right>
	//   18   32:isub            
	//   19   33:aload_2         
	//   20   34:invokevirtual   #91  <Method int FloatingActionButton.getBottom()>
	//   21   37:aload_1         
	//   22   38:getfield        #100 <Field int Rect.bottom>
	//   23   41:isub            
	//   24   42:invokevirtual   #193 <Method void Rect.set(int, int, int, int)>
		return true;
	//   25   45:iconst_1        
	//   26   46:ireturn         
	}

	public boolean a(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton, View view)
	{
		if(view instanceof AppBarLayout)
	//*   0    0:aload_3         
	//*   1    1:instanceof      #132 <Class AppBarLayout>
	//*   2    4:ifeq            21
			a(coordinatorlayout, (AppBarLayout)view, floatingactionbutton);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_3         
	//    6   10:checkcast       #132 <Class AppBarLayout>
	//    7   13:aload_2         
	//    8   14:invokespecial   #180 <Method boolean a(CoordinatorLayout, AppBarLayout, FloatingActionButton)>
	//    9   17:pop             
		else
	//*  10   18:goto            35
		if(a(view))
	//*  11   21:aload_3         
	//*  12   22:invokestatic    #182 <Method boolean a(View)>
	//*  13   25:ifeq            35
			b(view, floatingactionbutton);
	//   14   28:aload_0         
	//   15   29:aload_3         
	//   16   30:aload_2         
	//   17   31:invokespecial   #184 <Method boolean b(View, FloatingActionButton)>
	//   18   34:pop             
		return false;
	//   19   35:iconst_0        
	//   20   36:ireturn         
	}

	public volatile boolean a(CoordinatorLayout coordinatorlayout, View view, int i)
	{
		return a(coordinatorlayout, (FloatingActionButton)view, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #48  <Class FloatingActionButton>
	//    4    6:iload_3         
	//    5    7:invokevirtual   #197 <Method boolean a(CoordinatorLayout, FloatingActionButton, int)>
	//    6   10:ireturn         
	}

	public volatile boolean a(CoordinatorLayout coordinatorlayout, View view, Rect rect)
	{
		return a(coordinatorlayout, (FloatingActionButton)view, rect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #48  <Class FloatingActionButton>
	//    4    6:aload_3         
	//    5    7:invokevirtual   #200 <Method boolean a(CoordinatorLayout, FloatingActionButton, Rect)>
	//    6   10:ireturn         
	}

	public boolean b(CoordinatorLayout coordinatorlayout, View view, View view1)
	{
		return a(coordinatorlayout, (FloatingActionButton)view, view1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #48  <Class FloatingActionButton>
	//    4    6:aload_3         
	//    5    7:invokevirtual   #203 <Method boolean a(CoordinatorLayout, FloatingActionButton, View)>
	//    6   10:ireturn         
	}

	private Rect a;
	private au b;
	private boolean c;

	public FloatingActionButton$BaseBehavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void aj()>
		c = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #16  <Field boolean c>
	//    5    9:return          
	}

	public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #20  <Method void aj(Context, AttributeSet)>
		context = ((Context) (context.obtainStyledAttributes(attributeset, l.FloatingActionButton_Behavior_Layout)));
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:getstatic       #26  <Field int[] l.FloatingActionButton_Behavior_Layout>
	//    7   11:invokevirtual   #32  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//    8   14:astore_1        
		c = ((TypedArray) (context)).getBoolean(l.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:getstatic       #36  <Field int l.FloatingActionButton_Behavior_Layout_behavior_autoHide>
	//   12   20:iconst_1        
	//   13   21:invokevirtual   #42  <Method boolean TypedArray.getBoolean(int, boolean)>
	//   14   24:putfield        #16  <Field boolean c>
		((TypedArray) (context)).recycle();
	//   15   27:aload_1         
	//   16   28:invokevirtual   #45  <Method void TypedArray.recycle()>
	//   17   31:return          
	}
}
